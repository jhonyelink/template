/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.example.test;

import com.alibaba.fastjson.JSON;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jhonye
 * @version $Id: FinalBeanTest.java, v 0.1 2019-01-14 12:15 AM jhonye Exp $$
 */
public class FinalBeanTest {

    @Setter
    @Getter
    public static class ParamBean {
        private String name;
        private Long id;

    }

    private ParamBean bean;

    public FinalBeanTest(final ParamBean bean, final Long id2) {
        this.bean = bean;
        bean.setId(2L);
        //id2 = 1L;
    }

    public void setName(String name) {
        this.bean.setName(name);
    }

    public ParamBean getBean() {
        return this.bean;
    }

    public static void main(String[] args) {

        ParamBean paramBean = new FinalBeanTest.ParamBean();
        paramBean.setName("hello");
        paramBean.setId(1L);

        FinalBeanTest instance = new FinalBeanTest(paramBean, 3L);
        instance.setName("world");

        System.out.println(JSON.toJSONString(instance.getBean()));

        //final object
    }

}