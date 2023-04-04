/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Reader;
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
public class ReaderController implements Serializable{

    @EJB
    private ReaderFacadeLocal readerEjb;
    private Reader reader;
    private List<Reader> listaReader;

    public List<Reader> getListaReader() {
        listaReader = readerEjb.findAll();
        return listaReader;
    }

    public void setListaReader(List<Reader> listaReader) {
        this.listaReader = listaReader;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @PostConstruct
    public void init() {
        reader = new Reader();
    }
    
    public void guardar(){
        try{
            readerEjb.create(reader);
            info_message("Exito!","Registro guardado con exito!");
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public void modificar(){
        try{
            readerEjb.edit(reader);
            this.limpiar();
            info_message("Exito!","Se ha modificado el registro con exito!");
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public void eliminar(){
        try{
            readerEjb.remove(reader);
            this.limpiar();
            info_message("Exito!","Se ha eliminado el registro con exito!");
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public void limpiar(){
        reader = new Reader();
    }
    
    //Alerts
    public void info_message(String summary, String detail){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void warning_message(String summary, String detail){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    
}
