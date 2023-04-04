package com.controller;

import com.ejb.UsuarioFacadeLocal;
import com.entity.Blog;
import com.entity.Usuario;
import java.io.Serializable;
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
public class BaseController implements Serializable {

    @EJB
    private UsuarioFacadeLocal usuarioEjb;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @PostConstruct
    public void init() {
        usuario = new Usuario();
    }

    public void verificarSesion() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario us = (Usuario) context.getExternalContext().getSessionMap().get("usuario");

            if (us == null) {
                context.getExternalContext().redirect("login.xhtml");
            }
        } catch (Exception e) {

        }
    }

    public String iniciarSesion() {
        String redireccion = "";
        Usuario us;
        try {
            us = usuarioEjb.verifyLogin(usuario);
            if (us != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/principal?faces-redirect=true";
            } else {
                warning_message("Error!", "Inicio de sesion fallido!");
            }

        } catch (Exception e) {
            warning_message("Error!", "Inicio de sesion fallido!");
        }
        return redireccion;
    }
    
    public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    public void info_message(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void warning_message(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
