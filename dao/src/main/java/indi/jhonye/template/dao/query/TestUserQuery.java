/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.dao.query;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jhonye
 * @version $Id: TestUserQuery.java, v 0.1 2019-01-06 6:56 PM jhonye Exp $$
 */
@Getter
@Setter
public class TestUserQuery implements Serializable{

    private Long id;

    private String userName;

    private Integer age;

    private String check;

}