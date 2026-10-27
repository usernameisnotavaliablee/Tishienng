package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BeanContext {
    private final java.lang.Class<?> beanClass;
    private final com.alibaba.fastjson.util.FieldInfo fieldInfo;
    private final java.lang.String format;

    public BeanContext(java.lang.Class<?> r1, com.alibaba.fastjson.util.FieldInfo r2) {
            r0 = this;
            r0.<init>()
            r0.beanClass = r1
            r0.fieldInfo = r2
            java.lang.String r1 = r2.getFormat()
            r0.format = r1
            return
    }

    public <T extends java.lang.annotation.Annotation> T getAnnation(java.lang.Class<T> r2) {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.annotation.Annotation r2 = r0.getAnnation(r2)
            return r2
    }

    public java.lang.Class<?> getBeanClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.beanClass
            return r0
    }

    public int getFeatures() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            int r0 = r0.serialzeFeatures
            return r0
    }

    public java.lang.reflect.Field getField() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.reflect.Field r0 = r0.field
            return r0
    }

    public java.lang.Class<?> getFieldClass() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.Class<?> r0 = r0.fieldClass
            return r0
    }

    public java.lang.reflect.Type getFieldType() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.reflect.Type r0 = r0.fieldType
            return r0
    }

    public java.lang.String getFormat() {
            r1 = this;
            java.lang.String r0 = r1.format
            return r0
    }

    public java.lang.String getLabel() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.String r0 = r0.label
            return r0
    }

    public java.lang.reflect.Method getMethod() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.reflect.Method r0 = r0.method
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.String r0 = r0.name
            return r0
    }

    public boolean isJsonDirect() {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            boolean r0 = r0.jsonDirect
            return r0
    }
}
