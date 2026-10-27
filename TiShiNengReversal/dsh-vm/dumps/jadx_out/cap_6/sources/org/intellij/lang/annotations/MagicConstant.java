package org.intellij.lang.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public @interface MagicConstant {
    long[] flags() default {};

    java.lang.Class<?> flagsFromClass() default void.class;

    long[] intValues() default {};

    @org.jetbrains.annotations.NonNls
    java.lang.String[] stringValues() default {};

    java.lang.Class<?> valuesFromClass() default void.class;
}
