package org.junit.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.junit.runners.model.c<org.junit.runners.model.b> {
    private final java.lang.reflect.Field a;

    b(java.lang.reflect.Field r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "FrameworkField cannot be created without an underlying field."
            r2.<init>(r0)
            throw r2
    }

    @Override // org.junit.runners.model.c
    public java.lang.Class<?> a() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    @Override // org.junit.runners.model.c
    protected int b() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            int r0 = r0.getModifiers()
            return r0
    }

    @Override // org.junit.runners.model.c
    public java.lang.String c() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.i()
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.junit.runners.model.c
    public /* bridge */ /* synthetic */ boolean f(org.junit.runners.model.b r1) {
            r0 = this;
            org.junit.runners.model.b r1 = (org.junit.runners.model.b) r1
            boolean r1 = r0.j(r1)
            return r1
    }

    @Override // org.junit.runners.model.a
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)
            return r2
    }

    @Override // org.junit.runners.model.a
    public java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    @Override // org.junit.runners.model.c
    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public java.lang.Object h(java.lang.Object r2) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public java.lang.reflect.Field i() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            return r0
    }

    public boolean j(org.junit.runners.model.b r2) {
            r1 = this;
            java.lang.String r2 = r2.c()
            java.lang.String r0 = r1.c()
            boolean r2 = r2.equals(r0)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
