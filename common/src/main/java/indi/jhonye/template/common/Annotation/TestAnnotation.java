/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.common.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jhonye
 * @version $Id: TestAnnotation.java, v 0.1 2019-01-06 12:14 PM jhonye Exp $$
 */
// 运行时
@Retention(value = RetentionPolicy.RUNTIME)
// 目标
@Target(value = {ElementType.METHOD})
// javadoc
@Documented
// 注解可被子类继承，{Class, Method}
@Inherited
public @interface TestAnnotation {

    String value();

     //returnException();

}