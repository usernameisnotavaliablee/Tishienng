package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j {
    public final java.lang.String a;
    public final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> b;
    public final java.util.Set<javax.lang.model.element.Modifier> c;
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.l d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private final com.bumptech.glide.repackaged.com.squareup.javapoet.l a;
        private final java.lang.String b;
        private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> c;
        private final java.util.List<javax.lang.model.element.Modifier> d;

        private b(com.bumptech.glide.repackaged.com.squareup.javapoet.l r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.c = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.d = r0
                r1.a = r2
                r1.b = r3
                return
        }

        /* synthetic */ b(com.bumptech.glide.repackaged.com.squareup.javapoet.l r1, java.lang.String r2, com.bumptech.glide.repackaged.com.squareup.javapoet.j.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ java.lang.String a(com.bumptech.glide.repackaged.com.squareup.javapoet.j.b r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ java.util.List b(com.bumptech.glide.repackaged.com.squareup.javapoet.j.b r0) {
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r0 = r0.c
                return r0
        }

        static /* synthetic */ java.util.List c(com.bumptech.glide.repackaged.com.squareup.javapoet.j.b r0) {
                java.util.List<javax.lang.model.element.Modifier> r0 = r0.d
                return r0
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l d(com.bumptech.glide.repackaged.com.squareup.javapoet.j.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r0.a
                return r0
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.j.b e(com.bumptech.glide.repackaged.com.squareup.javapoet.c r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r0 = r1.c
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.a(r2)
                com.bumptech.glide.repackaged.com.squareup.javapoet.a r2 = r2.f()
                r0.add(r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.j.b f(java.lang.Iterable<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.String r2 = "annotationSpecs == null"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r2, r0)
                java.util.Iterator r4 = r4.iterator()
            L11:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L23
                java.lang.Object r0 = r4.next()
                com.bumptech.glide.repackaged.com.squareup.javapoet.a r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.a) r0
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r1 = r3.c
                r1.add(r0)
                goto L11
            L23:
                return r3
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.j.b g(java.lang.Iterable<javax.lang.model.element.Modifier> r3) {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "modifiers == null"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r3, r1, r0)
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L1e
                java.lang.Object r0 = r3.next()
                javax.lang.model.element.Modifier r0 = (javax.lang.model.element.Modifier) r0
                java.util.List<javax.lang.model.element.Modifier> r1 = r2.d
                r1.add(r0)
                goto Lc
            L1e:
                return r2
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.j.b h(javax.lang.model.element.Modifier... r2) {
                r1 = this;
                java.util.List<javax.lang.model.element.Modifier> r0 = r1.d
                java.util.Collections.addAll(r0, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.j i() {
                r2 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.j r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.j
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    private j(com.bumptech.glide.repackaged.com.squareup.javapoet.j.b r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.b.a(r5)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "name == null"
            java.lang.Object r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r0, r3, r2)
            java.lang.String r0 = (java.lang.String) r0
            r4.a = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.b.b(r5)
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r4.b = r0
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.b.c(r5)
            java.util.Set r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.i(r0)
            r4.c = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.b.d(r5)
            java.lang.String r0 = "type == null"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r5, r0, r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r5
            r4.d = r5
            return
    }

    /* synthetic */ j(com.bumptech.glide.repackaged.com.squareup.javapoet.j.b r1, com.bumptech.glide.repackaged.com.squareup.javapoet.j.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.j.b a(com.bumptech.glide.repackaged.com.squareup.javapoet.l r3, java.lang.String r4, javax.lang.model.element.Modifier... r5) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "type == null"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r3, r2, r1)
            boolean r1 = javax.lang.model.SourceVersion.isName(r4)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            java.lang.String r0 = "not a valid name: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r0, r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.j$b
            r1 = 0
            r0.<init>(r3, r4, r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = r0.h(r5)
            return r3
    }

    void b(com.bumptech.glide.repackaged.com.squareup.javapoet.e r5, boolean r6) throws java.io.IOException {
            r4 = this;
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r0 = r4.b
            r1 = 1
            r5.e(r0, r1)
            java.util.Set<javax.lang.model.element.Modifier> r0 = r4.c
            r5.j(r0)
            r0 = 0
            r2 = 2
            if (r6 == 0) goto L23
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r6 = r4.d
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.c(r6)
            java.lang.String r3 = r4.a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r6
            r2[r1] = r3
            java.lang.String r6 = "$T... $L"
            r5.c(r6, r2)
            return
        L23:
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r6 = r4.d
            java.lang.String r3 = r4.a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r6
            r2[r1] = r3
            java.lang.String r6 = "$T $L"
            r5.c(r6, r2)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class<com.bumptech.glide.repackaged.com.squareup.javapoet.j> r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L11
            return r0
        L11:
            java.lang.String r0 = r3.toString()
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.equals(r4)
            return r4
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.e     // Catch: java.io.IOException -> L13
            r1.<init>(r0)     // Catch: java.io.IOException -> L13
            r2 = 0
            r3.b(r1, r2)     // Catch: java.io.IOException -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L13
            return r0
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}
