/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;

import com.entity.BlogReader;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless
public class BlogReaderFacade extends AbstractFacade<BlogReader> implements BlogReaderFacadeLocal {

    @PersistenceContext(unitName = "pruebaTecnicaBandesalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BlogReaderFacade() {
        super(BlogReader.class);
    }
    
}
