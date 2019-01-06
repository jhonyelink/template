/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.dao.mapper;

import indi.jhonye.template.dao.mapperobject.TestUserMO;
import indi.jhonye.template.dao.query.TestUserQuery;

/**
 * @author jhonye
 * @version $Id: TestUseDAO.java, v 0.1 2019-01-04 12:31 AM jhonye Exp $$
 */
public interface TestUserMapper extends BaseMapper<TestUserQuery, TestUserMO> {

    /**
     * get record list num; map to getByQuery
     * @return
     */
    Long getTotal();

}