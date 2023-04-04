/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;

import com.entity.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author admin
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "pruebaTecnicaBandesalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario verifyLogin(Usuario us) {
        Usuario usuario = null;
        try {

            String consult = "FROM Usuario u WHERE u.usuario=?1 and u.clave=?2 ";
            Query query = em.createQuery(consult);
            query.setParameter(1, us.getUsuario());
            query.setParameter(2, us.getClave());

            List<Usuario> lst = query.getResultList();
            if (!lst.isEmpty()) {
                usuario = lst.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }

}
