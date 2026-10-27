package com.google.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FieldAttributes {
    private final java.lang.reflect.Field field;

    public FieldAttributes(java.lang.reflect.Field r1) {
            r0 = this;
            r0.<init>()
            com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r1)
            r0.field = r1
            return
    }

    java.lang.Object get(java.lang.Object r2) throws java.lang.IllegalAccessException {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)
            return r2
    }

    public java.util.Collection<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public java.lang.Class<?> getDeclaredClass() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public java.lang.reflect.Type getDeclaredType() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.reflect.Type r0 = r0.getGenericType()
            return r0
    }

    public java.lang.Class<?> getDeclaringClass() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.String r0 = r0.getName()
            return r0
    }

    public boolean hasModifier(int r2) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            int r0 = r0.getModifiers()
            r2 = r2 & r0
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    boolean isSynthetic() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            boolean r0 = r0.isSynthetic()
            return r0
    }
}
