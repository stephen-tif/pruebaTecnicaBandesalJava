package com.webservice;

import com.webservice.WS_blog_reader;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T02:46:26")
@StaticMetamodel(WS_blog.class)
public class WS_blog_ { 

    public static volatile CollectionAttribute<WS_blog, WS_blog_reader> blogReaderCollection;
    public static volatile SingularAttribute<WS_blog, Integer> id;
    public static volatile SingularAttribute<WS_blog, String> title;

}