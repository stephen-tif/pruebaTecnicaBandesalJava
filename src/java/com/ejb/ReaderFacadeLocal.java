/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;

import com.entity.Reader;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author admin
 */
@Local
public interface ReaderFacadeLocal {

    void create(Reader reader);

    void edit(Reader reader);

    void remove(Reader reader);

    Reader find(Object id);

    List<Reader> findAll();

    List<Reader> findRange(int[] range);

    int count();
    
}
