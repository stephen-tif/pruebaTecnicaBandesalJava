package com.webservice;

import com.webservice.WS_blog_reader;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T02:46:26")
@StaticMetamodel(WS_reader.class)
public class WS_reader_ { 

    public static volatile CollectionAttribute<WS_reader, WS_blog_reader> blogReaderCollection;
    public static volatile SingularAttribute<WS_reader, String> name;
    public static volatile SingularAttribute<WS_reader, Integer> id;

}