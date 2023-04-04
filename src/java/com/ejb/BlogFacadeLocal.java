/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;

import com.entity.Blog;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author admin
 */
@Local
public interface BlogFacadeLocal {

    void create(Blog blog);

    void edit(Blog blog);

    void remove(Blog blog);

    Blog find(Object id);

    List<Blog> findAll();

    List<Blog> findRange(int[] range);

    int count();
    
}
