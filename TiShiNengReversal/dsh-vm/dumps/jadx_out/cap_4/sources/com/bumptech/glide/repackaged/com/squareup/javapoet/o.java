package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class o extends com.bumptech.glide.repackaged.com.squareup.javapoet.l {

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> f512w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> f513x;

    private o(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r2, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r3) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r2, r3, r0)
            return
    }

    private o(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r4, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r5, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r6) {
            r3 = this;
            r3.<init>(r6)
            java.util.List r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r4)
            r3.f512w = r6
            java.util.List r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r5)
            r3.f513x = r5
            int r5 = r6.size()
            r0 = 0
            r1 = 1
            if (r5 != r1) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = 0
        L1a:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r4
            java.lang.String r4 = "unexpected extends bounds: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r5, r4, r2)
            java.util.Iterator r4 = r6.iterator()
        L27:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r5
            boolean r6 = r5.p()
            if (r6 != 0) goto L3f
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.d
            if (r5 == r6) goto L3f
            r6 = 1
            goto L40
        L3f:
            r6 = 0
        L40:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r5
            java.lang.String r5 = "invalid upper bound: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r6, r5, r2)
            goto L27
        L4a:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r4 = r3.f513x
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r4.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r5
            boolean r6 = r5.p()
            if (r6 != 0) goto L68
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.d
            if (r5 == r6) goto L68
            r6 = 1
            goto L69
        L68:
            r6 = 0
        L69:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r5
            java.lang.String r5 = "invalid lower bound: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r6, r5, r2)
            goto L50
        L73:
            return
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.l t(java.lang.reflect.WildcardType r2, java.util.Map<java.lang.reflect.Type, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r3) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.o
            java.lang.reflect.Type[] r1 = r2.getUpperBounds()
            java.util.List r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.q(r1, r3)
            java.lang.reflect.Type[] r2 = r2.getLowerBounds()
            java.util.List r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.q(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    static com.bumptech.glide.repackaged.com.squareup.javapoet.l u(javax.lang.model.type.WildcardType r1, java.util.Map<javax.lang.model.element.TypeParameterElement, com.bumptech.glide.repackaged.com.squareup.javapoet.m> r2) {
            javax.lang.model.type.TypeMirror r0 = r1.getExtendsBound()
            if (r0 != 0) goto L1c
            javax.lang.model.type.TypeMirror r1 = r1.getSuperBound()
            if (r1 != 0) goto L13
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r1 = w(r1)
            return r1
        L13:
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.m(r1, r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r1 = x(r1)
            return r1
        L1c:
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.m(r0, r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r1 = v(r1)
            return r1
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.o v(com.bumptech.glide.repackaged.com.squareup.javapoet.l r3) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.o
            r1 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r1]
            r2 = 0
            r1[r2] = r3
            java.util.List r3 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.<init>(r3, r1)
            return r0
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.o w(java.lang.reflect.Type r0) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r0 = v(r0)
            return r0
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.o x(com.bumptech.glide.repackaged.com.squareup.javapoet.l r5) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.o
            r1 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r2 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r1]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f500m
            r4 = 0
            r2[r4] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r1]
            r1[r4] = r5
            java.util.List r5 = java.util.Arrays.asList(r1)
            r0.<init>(r2, r5)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l a(java.util.List r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r1 = r0.s(r1)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    com.bumptech.glide.repackaged.com.squareup.javapoet.e h(com.bumptech.glide.repackaged.com.squareup.javapoet.e r5) throws java.io.IOException {
            r4 = this;
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r4.f513x
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1b
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r4.f513x
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "? super $T"
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r5 = r5.c(r0, r2)
            return r5
        L1b:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r4.f512w
            java.lang.Object r0 = r0.get(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.f500m
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L32
            java.lang.String r0 = "?"
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r5 = r5.b(r0)
            return r5
        L32:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r0 = r4.f512w
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "? extends $T"
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r5 = r5.c(r0, r2)
            return r5
    }

    @Override // com.bumptech.glide.repackaged.com.squareup.javapoet.l
    public com.bumptech.glide.repackaged.com.squareup.javapoet.l r() {
            r3 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.o
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r1 = r3.f512w
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r2 = r3.f513x
            r0.<init>(r1, r2)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.o s(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r4) {
            r3 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.o
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r1 = r3.f512w
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r2 = r3.f513x
            java.util.List r4 = r3.d(r4)
            r0.<init>(r1, r2, r4)
            return r0
    }
}
