package com.main.annotations;

import java.lang.annotation.Documented;

@Documented
public @interface ProjectDetailes {
String author();
double version() default 1.0;
}
