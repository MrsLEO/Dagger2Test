package com.leo.dagger2test.module;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Leo on 2018/1/6.
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface MY_NAME {
    String value() default "";
}
