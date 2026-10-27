package com.alibaba.fastjson.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public @interface JSONField {
    java.lang.String[] alternateNames() default {};

    boolean deserialize() default true;

    java.lang.Class<?> deserializeUsing() default java.lang.Void.class;

    java.lang.String format() default "";

    boolean jsonDirect() default false;

    java.lang.String label() default "";

    java.lang.String name() default "";

    int ordinal() default 0;

    com.alibaba.fastjson.parser.Feature[] parseFeatures() default {};

    boolean serialize() default true;

    java.lang.Class<?> serializeUsing() default java.lang.Void.class;

    com.alibaba.fastjson.serializer.SerializerFeature[] serialzeFeatures() default {};

    boolean unwrapped() default false;
}
