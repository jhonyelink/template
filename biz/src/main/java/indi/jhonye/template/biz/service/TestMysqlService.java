/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.biz.service;

import indi.jhonye.template.dao.mapperobject.TestUserMO;

/**
 * @author jhonye
 * @version $Id: TestMysqlService.java, v 0.1 2019-01-06 9:32 PM jhonye Exp $$
 */
public interface TestMysqlService {

    String getUser(Long id);

    Integer addUser(TestUserMO testUserMO);

}