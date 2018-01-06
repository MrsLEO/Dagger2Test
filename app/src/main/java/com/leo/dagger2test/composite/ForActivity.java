package com.leo.dagger2test.composite;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Leo on 2018/1/6.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ForActivity {
}
