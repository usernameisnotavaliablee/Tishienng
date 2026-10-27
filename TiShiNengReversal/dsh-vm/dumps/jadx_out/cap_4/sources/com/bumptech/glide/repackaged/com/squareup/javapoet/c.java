package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c extends com.bumptech.glide.repackaged.com.squareup.javapoet.l implements java.lang.Comparable<com.bumptech.glide.repackaged.com.squareup.javapoet.c> {

    /* renamed from: y, reason: collision with root package name */
    public static final com.bumptech.glide.repackaged.com.squareup.javapoet.c f489y = null;

    /* renamed from: w, reason: collision with root package name */
    final java.util.List<java.lang.String> f490w;

    /* renamed from: x, reason: collision with root package name */
    final java.lang.String f491x;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = w(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c.f489y = r0
            return
    }

    private c(java.util.List<java.lang.String> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    private c(java.util.List<java.lang.String> r6, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r7) {
            r5 = this;
            r5.<init>(r7)
            r7 = 1
            r0 = 1
        L5:
            int r1 = r6.size()
            r2 = 0
            if (r0 >= r1) goto L26
            java.lang.Object r1 = r6.get(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = javax.lang.model.SourceVersion.isName(r1)
            java.lang.Object r3 = r6.get(r0)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r2] = r3
            java.lang.String r2 = "part '%s' is keyword"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r2, r4)
            int r0 = r0 + 1
            goto L5
        L26:
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r6)
            r5.f490w = r0
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "."
            if (r0 == 0) goto L47
            int r0 = r6.size()
            java.util.List r6 = r6.subList(r7, r0)
            java.lang.String r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.j(r1, r6)
            goto L4b
        L47:
            java.lang.String r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.j(r1, r6)
        L4b:
            java.lang.String r7 = ".$"
            java.lang.String r0 = "$"
            java.lang.String r6 = r6.replace(r7, r0)
            r5.f491x = r6
            return
    }

    private static boolean C(javax.lang.model.element.Element r1) {
            javax.lang.model.element.ElementKind r0 = r1.getKind()
            boolean r0 = r0.isClass()
            if (r0 != 0) goto L17
            javax.lang.model.element.ElementKind r1 = r1.getKind()
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.c t(java.lang.String r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r10.length()
            java.lang.String r4 = "couldn't make a guess for %s"
            r5 = 1
            if (r2 >= r3) goto L2e
            int r3 = r10.codePointAt(r2)
            boolean r3 = java.lang.Character.isLowerCase(r3)
            if (r3 == 0) goto L2e
            r3 = 46
            int r2 = r10.indexOf(r3, r2)
            int r2 = r2 + r5
            if (r2 == 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r10
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r3, r4, r5)
            goto L7
        L2e:
            if (r2 == 0) goto L37
            int r3 = r2 + (-1)
            java.lang.String r3 = r10.substring(r1, r3)
            goto L39
        L37:
            java.lang.String r3 = ""
        L39:
            r0.add(r3)
            java.lang.String r2 = r10.substring(r2)
            java.lang.String r3 = "\\."
            r6 = -1
            java.lang.String[] r2 = r2.split(r3, r6)
            int r3 = r2.length
            r6 = 0
        L49:
            if (r6 >= r3) goto L6d
            r7 = r2[r6]
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L5f
            int r8 = r7.codePointAt(r1)
            boolean r8 = java.lang.Character.isUpperCase(r8)
            if (r8 == 0) goto L5f
            r8 = 1
            goto L60
        L5f:
            r8 = 0
        L60:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r1] = r10
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r8, r4, r9)
            r0.add(r7)
            int r6 = r6 + 1
            goto L49
        L6d:
            int r2 = r0.size()
            r3 = 2
            if (r2 < r3) goto L76
            r2 = 1
            goto L77
        L76:
            r2 = 0
        L77:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r1] = r10
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r2, r4, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r10 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            r10.<init>(r0)
            return r10
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.c w(java.lang.Class<?> r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "clazz == null"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r6, r2, r1)
            boolean r1 = r6.isPrimitive()
            r1 = r1 ^ 1
            java.lang.String r2 = "primitive types cannot be represented as a ClassName"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r2, r3)
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r1 = r1.equals(r6)
            r1 = r1 ^ 1
            java.lang.String r2 = "'void' type cannot be represented as a ClassName"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r2, r3)
            boolean r1 = r6.isArray()
            r1 = r1 ^ 1
            java.lang.String r2 = "array types cannot be represented as a ClassName"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L36:
            boolean r2 = r6.isAnonymousClass()
            r3 = -1
            r4 = 46
            if (r2 == 0) goto L61
            java.lang.String r2 = r6.getName()
            int r2 = r2.lastIndexOf(r4)
            if (r2 == r3) goto L68
            java.lang.String r5 = r6.getName()
            int r2 = r2 + 1
            java.lang.String r2 = r5.substring(r2)
            r5 = 36
            int r5 = r2.lastIndexOf(r5)
            java.lang.String r2 = r2.substring(r5)
            r1.add(r2)
            goto L68
        L61:
            java.lang.String r2 = r6.getSimpleName()
            r1.add(r2)
        L68:
            java.lang.Class r2 = r6.getEnclosingClass()
            if (r2 != 0) goto L8c
            java.lang.String r2 = r6.getName()
            int r2 = r2.lastIndexOf(r4)
            if (r2 == r3) goto L83
            java.lang.String r6 = r6.getName()
            java.lang.String r6 = r6.substring(r0, r2)
            r1.add(r6)
        L83:
            java.util.Collections.reverse(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r6 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            r6.<init>(r1)
            return r6
        L8c:
            r6 = r2
            goto L36
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.c x(java.lang.String r1, java.lang.String r2, java.lang.String... r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            java.util.Collections.addAll(r0, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            r1.<init>(r0)
            return r1
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.c y(javax.lang.model.element.TypeElement r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "element == null"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r6, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r6
        Le:
            boolean r3 = C(r2)
            if (r3 == 0) goto L3f
            javax.lang.model.element.NestingKind r3 = r6.getNestingKind()
            javax.lang.model.element.NestingKind r4 = javax.lang.model.element.NestingKind.TOP_LEVEL
            if (r3 == r4) goto L27
            javax.lang.model.element.NestingKind r3 = r6.getNestingKind()
            javax.lang.model.element.NestingKind r4 = javax.lang.model.element.NestingKind.MEMBER
            if (r3 != r4) goto L25
            goto L27
        L25:
            r3 = 0
            goto L28
        L27:
            r3 = 1
        L28:
            java.lang.String r4 = "unexpected type testing"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r3, r4, r5)
            javax.lang.model.element.Name r3 = r2.getSimpleName()
            java.lang.String r3 = r3.toString()
            r1.add(r3)
            javax.lang.model.element.Element r2 = r2.getEnclosingElement()
            goto Le
        L3f:
            javax.lang.model.element.PackageElement r6 = z(r6)
            javax.lang.model.element.Name r6 = r6.getQualifiedName()
            java.lang.String r6 = r6.toString()
            r1.add(r6)
            java.util.Collections.reverse(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r6 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            r6.<init>(r1)
            return r6
    }

    private static javax.lang.model.element.PackageElement z(javax.lang.model.element.Element r2) {
        L0:
            javax.lang.model.element.ElementKind r0 = r2.getKind()
            javax.lang.model.element.ElementKind r1 = javax.lang.model.element.ElementKind.PACKAGE
            if (r0 == r1) goto Ld
            javax.lang.model.element.Element r2 = r2.getEnclosingElement()
            goto L0
        Ld:
            javax.lang.model.element.PackageElement r2 = (javax.lang.model.element.PackageElement) r2
            return r2
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.c D(java.lang.String r3) {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "name == null"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r3, r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r2.f490w
            int r1 = r1.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r2.f490w
            r0.addAll(r1)
            r0.add(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            r3.<init>(r0)
            return r3
    }

    public java.lang.String E() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.f490w
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String F() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.f490w
            int r0 = r0.size()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L3a
            java.lang.String r0 = r4.E()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1d
            java.util.List<java.lang.String> r0 = r4.f490w
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.util.List<java.lang.String> r0 = r4.f490w
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r4.K()
            r0.append(r1)
            java.util.List r1 = r4.J()
            java.util.List r3 = r4.J()
            int r3 = r3.size()
            java.util.List r1 = r1.subList(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 36
            r0.append(r3)
            r0.append(r2)
            goto L5a
        L6f:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String I() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.f490w
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.util.List<java.lang.String> J() {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.f490w
            r1 = 1
            int r2 = r0.size()
            java.util.List r0 = r0.subList(r1, r2)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.c K() {
            r4 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            java.util.List<java.lang.String> r1 = r4.f490w
            r2 = 0
            r3 = 2
            java.util.List r1 = r1.subList(r2, r3)
            r0.<init>(r1)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l a(java.util.List r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r0.s(r1)
            return r1
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.bumptech.glide.repackaged.com.squareup.javapoet.c r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.c) r1
            int r1 = r0.u(r1)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    com.bumptech.glide.repackaged.com.squareup.javapoet.e h(com.bumptech.glide.repackaged.com.squareup.javapoet.e r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r2.t(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r2 = r2.d(r0)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public com.bumptech.glide.repackaged.com.squareup.javapoet.l r() {
            r2 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            java.util.List<java.lang.String> r1 = r2.f490w
            r0.<init>(r1)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.c s(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r3) {
            r2 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            java.util.List<java.lang.String> r1 = r2.f490w
            java.util.List r3 = r2.d(r3)
            r0.<init>(r1, r3)
            return r0
    }

    public int u(com.bumptech.glide.repackaged.com.squareup.javapoet.c r2) {
            r1 = this;
            java.lang.String r0 = r1.f491x
            java.lang.String r2 = r2.f491x
            int r2 = r0.compareTo(r2)
            return r2
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.c v() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.f490w
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto Lb
            r0 = 0
            return r0
        Lb:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.c
            java.util.List<java.lang.String> r1 = r4.f490w
            int r2 = r1.size()
            int r2 = r2 + (-1)
            r3 = 0
            java.util.List r1 = r1.subList(r3, r2)
            r0.<init>(r1)
            return r0
    }
}
