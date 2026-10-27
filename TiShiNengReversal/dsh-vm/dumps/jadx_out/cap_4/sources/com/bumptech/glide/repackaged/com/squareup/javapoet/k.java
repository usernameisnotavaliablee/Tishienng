package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k extends com.bumptech.glide.repackaged.com.squareup.javapoet.l {

    /* renamed from: w, reason: collision with root package name */
    private final com.bumptech.glide.repackaged.com.squareup.javapoet.k f496w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.c f497x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> f498y;

    k(com.bumptech.glide.repackaged.com.squareup.javapoet.k r2, com.bumptech.glide.repackaged.com.squareup.javapoet.c r3, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r4) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    private k(com.bumptech.glide.repackaged.com.squareup.javapoet.k r3, com.bumptech.glide.repackaged.com.squareup.javapoet.c r4, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r5, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r6) {
            r2 = this;
            r2.<init>(r6)
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = "rawType == null"
            java.lang.Object r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r4, r1, r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.c) r0
            r2.f497x = r0
            r2.f496w = r3
            java.util.List r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r5)
            r2.f498y = r5
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 == 0) goto L24
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = 0
            goto L25
        L24:
            r3 = 1
        L25:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r6] = r4
            java.lang.String r4 = "no type arguments: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r3, r4, r0)
            java.util.Iterator r3 = r5.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r4
            boolean r5 = r4.p()
            if (r5 != 0) goto L4a
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.d
            if (r4 == r5) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r6] = r4
            java.lang.String r4 = "invalid type parameter: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r5, r4, r0)
            goto L32
        L55:
            return
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.k t(com.bumptech.glide.repackaged.com.squareup.javapoet.c r2, com.bumptech.glide.repackaged.com.squareup.javapoet.l... r3) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.k
            r1 = 0
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.k u(java.lang.reflect.ParameterizedType r3, java.util.Map<java.lang.reflect.Type, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r4) {
            java.lang.reflect.Type r0 = r3.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r0)
            java.lang.reflect.Type r1 = r3.getOwnerType()
            boolean r1 = r1 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r1 == 0) goto L2a
            java.lang.reflect.Type r1 = r3.getRawType()
            java.lang.Class r1 = (java.lang.Class) r1
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L2a
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            goto L2b
        L2a:
            r1 = r2
        L2b:
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            java.util.List r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.q(r3, r4)
            if (r1 == 0) goto L42
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r4 = u(r1, r4)
            java.lang.String r0 = r0.I()
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r3 = r4.v(r0, r3)
            return r3
        L42:
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r4 = new com.bumptech.glide.repackaged.com.squareup.javapoet.k
            r4.<init>(r2, r0, r3)
            return r4
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l a(java.util.List r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r1 = r0.s(r1)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    com.bumptech.glide.repackaged.com.squareup.javapoet.e h(com.bumptech.glide.repackaged.com.squareup.javapoet.e r4) throws java.io.IOException {
            r3 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = r3.f496w
            if (r0 == 0) goto L27
            r0.i(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = r3.f496w
            r0.h(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "."
            r0.append(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r3.f497x
            java.lang.String r1 = r1.I()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.b(r0)
            goto L31
        L27:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = r3.f497x
            r0.i(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = r3.f497x
            r0.h(r4)
        L31:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r3.f498y
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L65
            java.lang.String r0 = "<"
            r4.d(r0)
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r3.f498y
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        L45:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r0.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r2 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r2
            if (r1 != 0) goto L58
            java.lang.String r1 = ", "
            r4.d(r1)
        L58:
            r2.i(r4)
            r2.h(r4)
            r1 = 0
            goto L45
        L60:
            java.lang.String r0 = ">"
            r4.d(r0)
        L65:
            return r4
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public com.bumptech.glide.repackaged.com.squareup.javapoet.l r() {
            r5 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.k
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r1 = r5.f496w
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = r5.f497x
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r3 = r5.f498y
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.k s(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r5) {
            r4 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.k
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r1 = r4.f496w
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = r4.f497x
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r3 = r4.f498y
            java.util.List r5 = r4.d(r5)
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.k v(java.lang.String r3, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r4) {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "name == null"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r3, r1, r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.k
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r2.f497x
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = r1.D(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.<init>(r2, r3, r4, r1)
            return r0
    }
}
