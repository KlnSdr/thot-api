package thot.api.annotations.v2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Bucket {
    String value();
    int maxKeys() default 100;
    boolean isVolatile() default false;
}
