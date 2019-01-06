/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.dao.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * @author jhonye
 * @version $Id: BaseMapper.java, v 0.1 2019-01-06 6:14 PM jhonye Exp $$
 */
public interface BaseMapper <Query extends Serializable, MapperObject extends Serializable> {

    /**
     * insert one record into db
     * @param mo
     * @return
     */
    int insert(MapperObject mo);

    /**
     * delete one record by primary key id
     * @param id
     * @return
     */
    boolean deleteById(Long id);

    /**
     * update the record by id and other columns
     * @param mo
     * @return
     */
    boolean update(MapperObject mo);

    /**
     * get record by primary key id
     * @param id
     * @return
     */
    MapperObject getById(Long id);

    /**
     * get record list by define condition
     * @param query
     * @return
     */
    List<MapperObject> getByQuery(Query query);

}