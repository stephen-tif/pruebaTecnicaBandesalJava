/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;

import com.entity.BlogReader;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author admin
 */
@Local
public interface BlogReaderFacadeLocal {

    void create(BlogReader blogReader);

    void edit(BlogReader blogReader);

    void remove(BlogReader blogReader);

    BlogReader find(Object id);

    List<BlogReader> findAll();

    List<BlogReader> findRange(int[] range);

    int count();
    
}
