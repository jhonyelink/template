/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.example.effective;

import java.util.Objects;

/**
 * @author jhonye
 * @version $Id: StaticFactory.java, v 0.1 2019-01-13 11:41 PM jhonye Exp $$
 */
public class StaticFactory {

    private static StaticFactory staticFactory;

    private StaticFactory() {

    }

    private static class SingletonInstance {
        private static final StaticFactory STATIC_FACTORY = new StaticFactory();
    }

    public static StaticFactory getSingletonInstance() {
        return SingletonInstance.STATIC_FACTORY;
    }

    public static StaticFactory getInstance() {
        if(Objects.isNull(staticFactory)) {
            synchronized(StaticFactory.class){
                if(Objects.isNull(staticFactory)) {
                    staticFactory = newInstance();
                }
            }
        }

        return staticFactory;
    }

    public static StaticFactory newInstance() {
        return new StaticFactory();
    }

    public enum Singleton {
        INSTANCE;

        private StaticFactory staticFactory;
        Singleton() {
            staticFactory = new StaticFactory();
        }

        public StaticFactory getInstance() {
            return staticFactory;
        }
    }

    public static StaticFactory getEnumSingletonInstance() {
        return Singleton.INSTANCE.getInstance();
    }

}