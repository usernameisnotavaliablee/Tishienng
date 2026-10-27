package com.alibaba.fastjson.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public @interface JSONType {
    boolean alphabetic() default true;

    boolean asm() default true;

    java.lang.Class<?> builder() default java.lang.Void.class;

    java.lang.Class<?> deserializer() default java.lang.Void.class;

    java.lang.String[] ignores() default {};

    java.lang.String[] includes() default {};

    java.lang.Class<?> mappingTo() default java.lang.Void.class;

    java.lang.String[] orders() default {};

    com.alibaba.fastjson.parser.Feature[] parseFeatures() default {};

    java.lang.Class<?>[] seeAlso() default {};

    boolean serializeEnumAsJavaBean() default false;

    java.lang.Class<?> serializer() default java.lang.Void.class;

    com.alibaba.fastjson.serializer.SerializerFeature[] serialzeFeatures() default {};

    java.lang.String typeKey() default "";

    java.lang.String typeName() default "";
}
