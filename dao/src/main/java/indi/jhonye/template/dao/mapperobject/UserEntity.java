/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.dao.mapperobject;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jhonye
 * @version $Id: UserEntity.java, v 0.1 2019-01-06 10:44 PM jhonye Exp $$
 */
@Getter
@Setter
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private String passWord;
    private String nickName;

}