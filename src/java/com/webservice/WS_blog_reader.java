/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "blog_reader")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BlogReader.findAll", query = "SELECT b FROM BlogReader b")
    , @NamedQuery(name = "BlogReader.findById", query = "SELECT b FROM BlogReader b WHERE b.id = :id")})
public class WS_blog_reader implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @JoinColumn(name = "IdBlog", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private WS_blog idBlog;
    @JoinColumn(name = "IdReader", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private WS_reader idReader;

    public WS_blog_reader() {
    }

    public WS_blog_reader(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WS_blog getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(WS_blog idBlog) {
        this.idBlog = idBlog;
    }

    public WS_reader getIdReader() {
        return idReader;
    }

    public void setIdReader(WS_reader idReader) {
        this.idReader = idReader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WS_blog_reader)) {
            return false;
        }
        WS_blog_reader other = (WS_blog_reader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webservice.BlogReader[ id=" + id + " ]";
    }
    
}
