package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class m extends com.bumptech.glide.repackaged.com.squareup.javapoet.l {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f510w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> f511x;

    private m(java.lang.String r2, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r3) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r2, r3, r0)
            return
    }

    private m(java.lang.String r3, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r4, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r5) {
            r2 = this;
            r2.<init>(r5)
            r5 = 0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "name == null"
            java.lang.Object r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r3, r1, r0)
            java.lang.String r3 = (java.lang.String) r3
            r2.f510w = r3
            r2.f511x = r4
            java.util.Iterator r3 = r4.iterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r3.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r4
            boolean r0 = r4.p()
            r1 = 1
            if (r0 != 0) goto L2f
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.d
            if (r4 == r0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r4
            java.lang.String r4 = "invalid bound: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r0, r4, r1)
            goto L16
        L3a:
            return
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.m t(java.lang.String r1) {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r1 = y(r1, r0)
            return r1
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.m u(java.lang.reflect.TypeVariable<?> r5, java.util.Map<java.lang.reflect.Type, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r6) {
            java.lang.Object r0 = r6.get(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.m) r0
            if (r0 != 0) goto L37
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r2 = new com.bumptech.glide.repackaged.com.squareup.javapoet.m
            java.lang.String r3 = r5.getName()
            r2.<init>(r3, r1)
            r6.put(r5, r2)
            java.lang.reflect.Type[] r5 = r5.getBounds()
            int r1 = r5.length
            r3 = 0
        L23:
            if (r3 >= r1) goto L31
            r4 = r5[r3]
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.k(r4, r6)
            r0.add(r4)
            int r3 = r3 + 1
            goto L23
        L31:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f500m
            r0.remove(r5)
            return r2
        L37:
            return r0
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.m v(javax.lang.model.element.TypeParameterElement r3) {
            javax.lang.model.element.Name r0 = r3.getSimpleName()
            java.lang.String r0 = r0.toString()
            java.util.List r3 = r3.getBounds()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r3.next()
            javax.lang.model.type.TypeMirror r2 = (javax.lang.model.type.TypeMirror) r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.l(r2)
            r1.add(r2)
            goto L15
        L29:
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r3 = y(r0, r1)
            return r3
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.m w(javax.lang.model.type.TypeVariable r0) {
            javax.lang.model.element.Element r0 = r0.asElement()
            javax.lang.model.element.TypeParameterElement r0 = (javax.lang.model.element.TypeParameterElement) r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r0 = v(r0)
            return r0
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.m x(javax.lang.model.type.TypeVariable r4, java.util.Map<javax.lang.model.element.TypeParameterElement, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r5) {
            javax.lang.model.element.Element r4 = r4.asElement()
            javax.lang.model.element.TypeParameterElement r4 = (javax.lang.model.element.TypeParameterElement) r4
            java.lang.Object r0 = r5.get(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.m) r0
            if (r0 != 0) goto L49
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r2 = new com.bumptech.glide.repackaged.com.squareup.javapoet.m
            javax.lang.model.element.Name r3 = r4.getSimpleName()
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            r5.put(r4, r2)
            java.util.List r4 = r4.getBounds()
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.next()
            javax.lang.model.type.TypeMirror r1 = (javax.lang.model.type.TypeMirror) r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.m(r1, r5)
            r0.add(r1)
            goto L2f
        L43:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f500m
            r0.remove(r4)
            return r2
        L49:
            return r0
    }

    private static com.bumptech.glide.repackaged.com.squareup.javapoet.m y(java.lang.String r1, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f500m
            r0.remove(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r2 = new com.bumptech.glide.repackaged.com.squareup.javapoet.m
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.<init>(r1, r0)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l a(java.util.List r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r1 = r0.s(r1)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    com.bumptech.glide.repackaged.com.squareup.javapoet.e h(com.bumptech.glide.repackaged.com.squareup.javapoet.e r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.f510w
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r2 = r2.d(r0)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public com.bumptech.glide.repackaged.com.squareup.javapoet.l r() {
            r3 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.m
            java.lang.String r1 = r3.f510w
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r2 = r3.f511x
            r0.<init>(r1, r2)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.m s(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r4) {
            r3 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.m
            java.lang.String r1 = r3.f510w
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r2 = r3.f511x
            r0.<init>(r1, r2, r4)
            return r0
    }
}
