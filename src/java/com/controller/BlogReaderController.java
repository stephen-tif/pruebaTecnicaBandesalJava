/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Blog;
import com.entity.BlogReader;
import com.entity.Reader;
import com.ejb.BlogFacadeLocal;
import com.ejb.BlogReaderFacadeLocal;
import com.ejb.ReaderFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author admin
 */
@Named
@ViewScoped
public class BlogReaderController implements Serializable {

    @EJB
    private BlogReaderFacadeLocal blogReaderEjb;
    @EJB
    private BlogFacadeLocal blogEjb;
    @EJB
    private ReaderFacadeLocal readerEjb;
    private BlogReader blogReader;
    private Blog blog;
    private Reader reader;
    private List<BlogReader> listaBlogReader;
    private List<Blog> listaBlog;
    private List<Reader> listaReader;
    
    @PostConstruct
    public void init() {
        blogReader = new BlogReader();
        blog = new Blog();
        reader = new Reader();
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<Blog> getListaBlog() {
        listaBlog = blogEjb.findAll();
        return listaBlog;
    }

    public List<Reader> getListaReader() {
        listaReader = readerEjb.findAll();
        return listaReader;
    }

    public List<BlogReader> getListaBlogReader() {
        listaBlogReader = blogReaderEjb.findAll();
        return listaBlogReader;
    }

    public BlogReader getBlogReader() {
        return blogReader;
    }

    public void setBlogReader(BlogReader blogReader) {
        this.blogReader = blogReader;
    }

    public void guardar() {
        try {
            blogReader.setIdBlog(blogEjb.find(blog.getId()));
            blogReader.setIdReader(readerEjb.find(reader.getId()));

            if (blogReader.getIdBlog() == null || blogReader.getIdReader() == null) {
                warning_message("Informacion incompleta!", 
                        "Debe completar todos los campos del formulario!");
            } else {
                blogReaderEjb.create(blogReader);
                info_message("Exito!", "Registro guardado con exito!");
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificar() {
        try {
            blogReader.setIdBlog(blogEjb.find(blog.getId()));
            blogReader.setIdReader(readerEjb.find(reader.getId()));
            blogReaderEjb.edit(blogReader);
            this.limpiar();
            info_message("Exito!", "Se ha modificado el registro con exito!");
            
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminar() {
        try {
            blogReaderEjb.remove(blogReader);
            this.limpiar();
            info_message("Exito!", "Se ha eliminado el registro con exito!");
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void limpiar() {
        blogReader = new BlogReader();
        blog = new Blog();
        reader = new Reader();
    }

    //Alerts
    public void info_message(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void warning_message(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
