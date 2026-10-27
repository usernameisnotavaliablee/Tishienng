package com.google.common.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class Element extends java.lang.reflect.AccessibleObject implements java.lang.reflect.Member {
    private final java.lang.reflect.AccessibleObject accessibleObject;
    private final java.lang.reflect.Member member;

    <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> Element(M r1) {
            r0 = this;
            r0.<init>()
            com.google.common.base.Preconditions.checkNotNull(r1)
            r0.accessibleObject = r1
            java.lang.reflect.Member r1 = (java.lang.reflect.Member) r1
            r0.member = r1
            return
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.reflect.Element
            r1 = 0
            if (r0 == 0) goto L21
            com.google.common.reflect.Element r4 = (com.google.common.reflect.Element) r4
            com.google.common.reflect.TypeToken r0 = r3.getOwnerType()
            com.google.common.reflect.TypeToken r2 = r4.getOwnerType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            java.lang.reflect.Member r0 = r3.member
            java.lang.reflect.Member r4 = r4.member
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L21
            r4 = 1
            return r4
        L21:
            return r1
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> r2) {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)
            return r2
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getDeclaredAnnotations() {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            return r0
    }

    @Override // java.lang.reflect.Member
    public java.lang.Class<?> getDeclaringClass() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            int r0 = r0.getModifiers()
            return r0
    }

    @Override // java.lang.reflect.Member
    public final java.lang.String getName() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            java.lang.String r0 = r0.getName()
            return r0
    }

    public com.google.common.reflect.TypeToken<?> getOwnerType() {
            r1 = this;
            java.lang.Class r0 = r1.getDeclaringClass()
            com.google.common.reflect.TypeToken r0 = com.google.common.reflect.TypeToken.of(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isAbstract() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            return r0
    }

    @Override // java.lang.reflect.AccessibleObject
    public final boolean isAccessible() {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            boolean r0 = r0.isAccessible()
            return r0
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            boolean r2 = r0.isAnnotationPresent(r2)
            return r2
    }

    public final boolean isFinal() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            return r0
    }

    public final boolean isNative() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isNative(r0)
            return r0
    }

    public final boolean isPackagePrivate() {
            r1 = this;
            boolean r0 = r1.isPrivate()
            if (r0 != 0) goto L14
            boolean r0 = r1.isPublic()
            if (r0 != 0) goto L14
            boolean r0 = r1.isProtected()
            if (r0 != 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final boolean isPrivate() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            return r0
    }

    public final boolean isProtected() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isProtected(r0)
            return r0
    }

    public final boolean isPublic() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
    }

    public final boolean isStatic() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    public final boolean isSynchronized() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isSynchronized(r0)
            return r0
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            boolean r0 = r0.isSynthetic()
            return r0
    }

    final boolean isTransient() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isTransient(r0)
            return r0
    }

    final boolean isVolatile() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isVolatile(r0)
            return r0
    }

    @Override // java.lang.reflect.AccessibleObject
    public final void setAccessible(boolean r2) throws java.lang.SecurityException {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            r0.setAccessible(r2)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            java.lang.String r0 = r0.toString()
            return r0
    }
}
