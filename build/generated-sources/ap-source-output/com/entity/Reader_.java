package com.entity;

import com.entity.BlogReader;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T02:46:26")
@StaticMetamodel(Reader.class)
public class Reader_ { 

    public static volatile ListAttribute<Reader, BlogReader> blogReaderList;
    public static volatile SingularAttribute<Reader, String> name;
    public static volatile SingularAttribute<Reader, Integer> id;

}