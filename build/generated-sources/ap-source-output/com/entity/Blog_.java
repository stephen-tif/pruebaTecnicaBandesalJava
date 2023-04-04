package com.entity;

import com.entity.BlogReader;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T02:46:26")
@StaticMetamodel(Blog.class)
public class Blog_ { 

    public static volatile ListAttribute<Blog, BlogReader> blogReaderList;
    public static volatile SingularAttribute<Blog, Integer> id;
    public static volatile SingularAttribute<Blog, String> title;

}