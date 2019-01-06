/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.dao.mapperobject;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jhonye
 * @version $Id: TestUserMO.java, v 0.1 2019-01-06 6:37 PM jhonye Exp $$
 */
@Setter
@Getter
public class TestUserMO implements Serializable {

    private static final long serialVersionUID = 0L;

    /**
     * primary key
     */
    private Long id;

    /**
     * create time
     */
    private Date ctime;

    /**
     * modified time
     */
    private Date mtime;

    /**
     * user name
     */
    private String userName;

    /**
     * person age
     */
    private Integer age;

    /**
     * extension column
     */
    private String extension;

}