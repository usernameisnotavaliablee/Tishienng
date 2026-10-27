package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class j {
    private static final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.lang.String> i = null;
    private final javax.annotation.processing.ProcessingEnvironment a;
    private final com.bumptech.glide.annotation.compiler.i b;
    private final com.bumptech.glide.repackaged.com.squareup.javapoet.m c;
    private final javax.lang.model.element.TypeElement d;
    private final javax.lang.model.element.TypeElement e;
    private com.bumptech.glide.repackaged.com.squareup.javapoet.c f;
    private com.bumptech.glide.repackaged.com.squareup.javapoet.c g;
    private com.bumptech.glide.repackaged.com.squareup.javapoet.k h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.repackaged.com.google.common.base.a<com.bumptech.glide.repackaged.com.squareup.javapoet.i, com.bumptech.glide.repackaged.com.squareup.javapoet.i> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j a;

        a(com.bumptech.glide.annotation.compiler.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.i a(com.bumptech.glide.repackaged.com.squareup.javapoet.i r2) {
                r1 = this;
                com.bumptech.glide.annotation.compiler.j r0 = r1.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r2 = com.bumptech.glide.annotation.compiler.j.a(r0, r2)
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.a
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i apply(com.bumptech.glide.repackaged.com.squareup.javapoet.i r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r1
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.bumptech.glide.repackaged.com.google.common.base.e<com.bumptech.glide.repackaged.com.squareup.javapoet.i> {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j b;

        b(com.bumptech.glide.annotation.compiler.j r1, java.util.List r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public boolean a(com.bumptech.glide.repackaged.com.squareup.javapoet.i r3) {
                r2 = this;
                com.bumptech.glide.annotation.compiler.j r0 = r2.b
                java.util.List r1 = r2.a
                boolean r3 = com.bumptech.glide.annotation.compiler.j.b(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.e
        public /* bridge */ /* synthetic */ boolean apply(com.bumptech.glide.repackaged.com.squareup.javapoet.i r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r1
                boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bumptech.glide.repackaged.com.google.common.base.e<com.bumptech.glide.repackaged.com.squareup.javapoet.i> {
        final /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i a;
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j b;

        c(com.bumptech.glide.annotation.compiler.j r1, com.bumptech.glide.repackaged.com.squareup.javapoet.i r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public boolean a(com.bumptech.glide.repackaged.com.squareup.javapoet.i r3) {
                r2 = this;
                java.lang.String r0 = r3.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = r2.a
                java.lang.String r1 = r1.a
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1a
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.j> r3 = r3.g
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r2.a
                java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.j> r0 = r0.g
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L1a
                r3 = 1
                return r3
            L1a:
                r3 = 0
                return r3
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.e
        public /* bridge */ /* synthetic */ boolean apply(com.bumptech.glide.repackaged.com.squareup.javapoet.i r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r1
                boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.bumptech.glide.repackaged.com.google.common.base.a<com.bumptech.glide.repackaged.com.squareup.javapoet.j, java.lang.String> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j a;

        d(com.bumptech.glide.annotation.compiler.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String a(com.bumptech.glide.repackaged.com.squareup.javapoet.j r1) {
                r0 = this;
                java.lang.String r1 = r1.a
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.a
        public /* bridge */ /* synthetic */ java.lang.String apply(com.bumptech.glide.repackaged.com.squareup.javapoet.j r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.j r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.j) r1
                java.lang.String r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements com.bumptech.glide.repackaged.com.google.common.base.e<com.bumptech.glide.repackaged.com.squareup.javapoet.a> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j a;

        e(com.bumptech.glide.annotation.compiler.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(com.bumptech.glide.repackaged.com.squareup.javapoet.a r3) {
                r2 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r3.a
                java.lang.Class<java.lang.Override> r1 = java.lang.Override.class
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j(r1)
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2c
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r3.a
                java.lang.Class<java.lang.SafeVarargs> r1 = java.lang.SafeVarargs.class
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j(r1)
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2c
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = r3.a
                java.lang.Class<java.lang.SuppressWarnings> r0 = java.lang.SuppressWarnings.class
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j(r0)
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L2c
                r3 = 1
                return r3
            L2c:
                r3 = 0
                return r3
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.e
        public /* bridge */ /* synthetic */ boolean apply(com.bumptech.glide.repackaged.com.squareup.javapoet.a r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.a r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.a) r1
                boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements com.bumptech.glide.repackaged.com.google.common.base.a<com.bumptech.glide.repackaged.com.squareup.javapoet.d, java.lang.String> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j a;

        f(com.bumptech.glide.annotation.compiler.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String a(com.bumptech.glide.repackaged.com.squareup.javapoet.d r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.a
        public /* bridge */ /* synthetic */ java.lang.String apply(com.bumptech.glide.repackaged.com.squareup.javapoet.d r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.d) r1
                java.lang.String r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements com.bumptech.glide.repackaged.com.google.common.base.a<javax.lang.model.element.ExecutableElement, com.bumptech.glide.repackaged.com.squareup.javapoet.i> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j a;

        g(com.bumptech.glide.annotation.compiler.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.i a(javax.lang.model.element.ExecutableElement r2) {
                r1 = this;
                com.bumptech.glide.annotation.compiler.j r0 = r1.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r2 = com.bumptech.glide.annotation.compiler.j.c(r0, r2)
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.a
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i apply(javax.lang.model.element.ExecutableElement r1) {
                r0 = this;
                javax.lang.model.element.ExecutableElement r1 = (javax.lang.model.element.ExecutableElement) r1
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements com.bumptech.glide.repackaged.com.google.common.base.a<com.bumptech.glide.repackaged.com.squareup.javapoet.j, java.lang.String> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.j a;

        h(com.bumptech.glide.annotation.compiler.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String a(com.bumptech.glide.repackaged.com.squareup.javapoet.j r1) {
                r0 = this;
                java.lang.String r1 = r1.a
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.a
        public /* bridge */ /* synthetic */ java.lang.String apply(com.bumptech.glide.repackaged.com.squareup.javapoet.j r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.j r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.j) r1
                java.lang.String r1 = r0.a(r1)
                return r1
        }
    }

    static {
            java.lang.String r0 = "clone"
            java.lang.String r1 = "apply"
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.of(r0, r1)
            com.bumptech.glide.annotation.compiler.j.i = r0
            return
    }

    j(javax.annotation.processing.ProcessingEnvironment r2, com.bumptech.glide.annotation.compiler.i r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            javax.lang.model.util.Elements r3 = r2.getElementUtils()
            java.lang.String r0 = "com.bumptech.glide.RequestBuilder"
            javax.lang.model.element.TypeElement r3 = r3.getTypeElement(r0)
            r1.e = r3
            java.lang.String r3 = "TranscodeType"
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.m.t(r3)
            r1.c = r3
            javax.lang.model.util.Elements r2 = r2.getElementUtils()
            java.lang.String r3 = "com.bumptech.glide.request.RequestOptions"
            javax.lang.model.element.TypeElement r2 = r2.getTypeElement(r3)
            r1.d = r2
            return
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i a(com.bumptech.glide.annotation.compiler.j r0, com.bumptech.glide.repackaged.com.squareup.javapoet.i r1) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.h(r1)
            return r0
    }

    static /* synthetic */ boolean b(com.bumptech.glide.annotation.compiler.j r0, java.util.List r1, com.bumptech.glide.repackaged.com.squareup.javapoet.i r2) {
            boolean r0 = r0.m(r1, r2)
            return r0
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i c(com.bumptech.glide.annotation.compiler.j r0, javax.lang.model.element.ExecutableElement r1) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.j(r1)
            return r0
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.a d(com.bumptech.glide.repackaged.com.squareup.javapoet.i r8) {
            r7 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r1 = r8.c
            java.lang.Class<java.lang.SuppressWarnings> r2 = java.lang.SuppressWarnings.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r3 = r3.f()
            boolean r1 = r1.contains(r3)
            java.lang.String r3 = "value"
            if (r1 == 0) goto L54
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r1 = r8.c
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r1.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.a) r4
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = r4.a
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j(r2)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L1f
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r4 = r4.b
            java.lang.Object r4 = r4.get(r3)
            java.util.List r4 = (java.util.List) r4
            com.bumptech.glide.repackaged.com.google.common.collect.j r4 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r4)
            com.bumptech.glide.annotation.compiler.j$f r5 = new com.bumptech.glide.annotation.compiler.j$f
            r5.<init>(r7)
            com.bumptech.glide.repackaged.com.google.common.collect.j r4 = r4.m(r5)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r4 = r4.j()
            r0.addAll(r4)
            goto L1f
        L54:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r8 = r8.c
            java.lang.Class<java.lang.SafeVarargs> r1 = java.lang.SafeVarargs.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r1 = r1.f()
            boolean r8 = r8.contains(r1)
            if (r8 == 0) goto L70
            java.lang.String r8 = "unchecked"
            r0.add(r8)
            java.lang.String r8 = "varargs"
            r0.add(r8)
        L70:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L78
            r8 = 0
            return r8
        L78:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Collections.sort(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r2)
            java.util.Iterator r8 = r8.iterator()
        L88:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r1
            java.lang.String r1 = "$S"
            r0.d(r3, r1, r2)
            goto L88
        La0:
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r8 = r0.f()
            return r8
    }

    private java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> f() {
            r12 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r1 = r12.c
            r2 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r3 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r2]
            r4 = 0
            r3[r4] = r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r0, r3)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.o.w(r1)
            javax.lang.model.element.TypeElement r3 = r12.e
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r5 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r2]
            r5[r4] = r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r3, r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.a()
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r4]
            java.lang.String r6 = "transcodeClass"
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r0, r6, r5)
            com.bumptech.glide.annotation.compiler.i r7 = r12.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r7 = r7.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r5 = r5.e(r7)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r5 = r5.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.v(r5)
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r4]
            java.lang.String r7 = "other"
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r1, r7, r5)
            com.bumptech.glide.annotation.compiler.i r5 = r12.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = r5.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r1 = r1.e(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r1 = r1.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r3.v(r1)
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r6
            r5[r2] = r7
            java.lang.String r7 = "super($N, $N)"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.y(r7, r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = r1.C()
            java.lang.String r5 = "Context"
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.String r8 = "android.content"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r8, r5, r7)
            java.lang.String r7 = "Glide"
            java.lang.String[] r8 = new java.lang.String[r4]
            java.lang.String r9 = "com.bumptech.glide"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r7, r8)
            java.lang.String r8 = "RequestManager"
            java.lang.String[] r10 = new java.lang.String[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r8, r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r9 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.a()
            javax.lang.model.element.Modifier[] r10 = new javax.lang.model.element.Modifier[r4]
            java.lang.String r11 = "glide"
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r7, r11, r10)
            com.bumptech.glide.annotation.compiler.i r10 = r12.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r10 = r10.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r7 = r7.e(r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r7 = r7.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r7 = r9.v(r7)
            javax.lang.model.element.Modifier[] r9 = new javax.lang.model.element.Modifier[r4]
            java.lang.String r10 = "requestManager"
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r8, r10, r9)
            com.bumptech.glide.annotation.compiler.i r9 = r12.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r9 = r9.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r8 = r8.e(r9)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r8 = r8.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r7 = r7.v(r8)
            javax.lang.model.element.Modifier[] r8 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r0, r6, r8)
            com.bumptech.glide.annotation.compiler.i r8 = r12.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r8 = r8.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r0 = r0.e(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r0 = r0.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r7.v(r0)
            javax.lang.model.element.Modifier[] r7 = new javax.lang.model.element.Modifier[r4]
            java.lang.String r8 = "context"
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r5, r8, r7)
            com.bumptech.glide.annotation.compiler.i r7 = r12.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r7 = r7.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r5 = r5.e(r7)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r5 = r5.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.v(r5)
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r11
            r5[r2] = r10
            r5[r3] = r6
            r2 = 3
            r5[r2] = r8
            java.lang.String r2 = "super($N, $N ,$N, $N)"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.y(r2, r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.C()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.of(r1, r0)
            return r0
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i g() {
            r6 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = r6.f
            java.lang.Class<java.io.File> r1 = java.io.File.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r1)
            r3 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r4 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r3]
            r5 = 0
            r4[r5] = r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r0, r4)
            java.lang.String r2 = "getDownloadOnlyRequest"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r2)
            java.lang.Class<java.lang.Override> r4 = java.lang.Override.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.n(r4)
            com.bumptech.glide.annotation.compiler.i r4 = r6.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = r4.d()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.m(r4)
            com.bumptech.glide.annotation.compiler.i r4 = r6.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = r4.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.m(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r2.F(r0)
            javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r3]
            javax.lang.model.element.Modifier r4 = javax.lang.model.element.Modifier.PROTECTED
            r2[r5] = r4
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.u(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = r6.f
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r2
            r4[r3] = r1
            java.lang.String r1 = "this"
            r2 = 2
            r4[r2] = r1
            java.lang.String r1 = "DOWNLOAD_ONLY_OPTIONS"
            r2 = 3
            r4[r2] = r1
            java.lang.String r1 = "return new $T<>($T.class, $N).apply($N)"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.y(r1, r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.C()
            return r0
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i h(com.bumptech.glide.repackaged.com.squareup.javapoet.i r7) {
            r6 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.a()
            java.lang.String r1 = r7.a
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = ".$N("
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.b(r1, r3)
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.j> r1 = r7.g
            com.bumptech.glide.repackaged.com.google.common.collect.j r1 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r1)
            com.bumptech.glide.annotation.compiler.j$d r3 = new com.bumptech.glide.annotation.compiler.j$d
            r3.<init>(r6)
            com.bumptech.glide.repackaged.com.google.common.collect.j r1 = r1.m(r3)
            java.lang.String r3 = ", "
            com.bumptech.glide.repackaged.com.google.common.base.b r3 = com.bumptech.glide.repackaged.com.google.common.base.b.g(r3)
            java.lang.String r1 = r1.f(r3)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.b(r1, r3)
            java.lang.String r1 = ");\n"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.b(r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.j()
            java.lang.String r1 = r7.a
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r1)
            com.bumptech.glide.annotation.compiler.i r3 = r6.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = r6.g
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r3 = r3.p(r5, r7)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.s(r3)
            javax.lang.model.element.Modifier[] r3 = new javax.lang.model.element.Modifier[r2]
            javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.PUBLIC
            r3[r4] = r5
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.u(r3)
            boolean r3 = r7.h
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.H(r3)
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r3 = r7.c
            com.bumptech.glide.repackaged.com.google.common.collect.j r3 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r3)
            com.bumptech.glide.annotation.compiler.j$e r5 = new com.bumptech.glide.annotation.compiler.j$e
            r5.<init>(r6)
            com.bumptech.glide.repackaged.com.google.common.collect.j r3 = r3.d(r5)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r3 = r3.g()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.o(r3)
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.m> r3 = r7.e
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.A(r3)
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.j> r3 = r7.g
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.x(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r3 = r6.h
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.F(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r3 = r6.h
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r3
            java.lang.String r3 = "return ($T) super"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.q(r3, r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r1.p(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r7 = r6.d(r7)
            if (r7 == 0) goto La1
            r0.l(r7)
        La1:
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r7 = r0.C()
            return r7
    }

    private java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> i(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r2, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
            r1 = this;
            if (r3 != 0) goto L5
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        L5:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r3 = r3.f480n
            com.bumptech.glide.repackaged.com.google.common.collect.j r3 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r3)
            com.bumptech.glide.annotation.compiler.j$b r0 = new com.bumptech.glide.annotation.compiler.j$b
            r0.<init>(r1, r2)
            com.bumptech.glide.repackaged.com.google.common.collect.j r2 = r3.d(r0)
            com.bumptech.glide.annotation.compiler.j$a r3 = new com.bumptech.glide.annotation.compiler.j$a
            r3.<init>(r1)
            com.bumptech.glide.repackaged.com.google.common.collect.j r2 = r2.m(r3)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = r2.g()
            return r2
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i j(javax.lang.model.element.ExecutableElement r8) {
            r7 = this;
            javax.lang.model.type.TypeMirror r0 = r8.getReturnType()
            javax.lang.model.type.DeclaredType r0 = (javax.lang.model.type.DeclaredType) r0
            java.util.List r0 = r0.getTypeArguments()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = r7.f
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.l(r0)
            r3 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r4 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r3]
            r4[r1] = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r2, r4)
            com.bumptech.glide.annotation.compiler.i r2 = r7.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.L(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.F(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.a()
            javax.lang.model.element.Name r5 = r8.getSimpleName()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r0
            r6[r3] = r5
            java.lang.String r0 = "return ($T) super.$N("
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r4.b(r0, r6)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r4 = r2.C()
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.j> r4 = r4.g
            com.bumptech.glide.repackaged.com.google.common.collect.j r4 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r4)
            com.bumptech.glide.annotation.compiler.j$h r5 = new com.bumptech.glide.annotation.compiler.j$h
            r5.<init>(r7)
            com.bumptech.glide.repackaged.com.google.common.collect.j r4 = r4.m(r5)
            java.lang.String r5 = ", "
            com.bumptech.glide.repackaged.com.google.common.base.b r5 = com.bumptech.glide.repackaged.com.google.common.base.b.g(r5)
            java.lang.String r4 = r4.f(r5)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.b(r4, r5)
            java.lang.String r4 = ");\n"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r0.b(r4, r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.j()
            r2.p(r0)
            java.util.List r0 = r8.getAnnotationMirrors()
            java.util.Iterator r0 = r0.iterator()
        L79:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r0.next()
            javax.lang.model.element.AnnotationMirror r4 = (javax.lang.model.element.AnnotationMirror) r4
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.e(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.l(r4)
            goto L79
        L8e:
            boolean r8 = r8.isVarArgs()
            if (r8 == 0) goto Lc0
            javax.lang.model.element.Modifier[] r8 = new javax.lang.model.element.Modifier[r3]
            javax.lang.model.element.Modifier r0 = javax.lang.model.element.Modifier.FINAL
            r8[r1] = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r8 = r2.u(r8)
            java.lang.Class<java.lang.SafeVarargs> r0 = java.lang.SafeVarargs.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r8 = r8.n(r0)
            java.lang.Class<java.lang.SuppressWarnings> r0 = java.lang.SuppressWarnings.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r0)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "varargs"
            r2[r1] = r3
            java.lang.String r1 = "value"
            java.lang.String r3 = "$S"
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = r0.d(r1, r3, r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r0 = r0.f()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r8.l(r0)
        Lc0:
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r8 = r2.C()
            return r8
    }

    private java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> k() {
            r3 = this;
            javax.annotation.processing.ProcessingEnvironment r0 = r3.a
            javax.lang.model.util.Types r0 = r0.getTypeUtils()
            javax.lang.model.element.TypeElement r1 = r3.e
            javax.lang.model.type.TypeMirror r1 = r1.asType()
            javax.lang.model.type.TypeMirror r0 = r0.erasure(r1)
            com.bumptech.glide.annotation.compiler.i r1 = r3.b
            javax.lang.model.element.TypeElement r2 = r3.e
            java.util.List r0 = r1.l(r2, r0)
            com.bumptech.glide.annotation.compiler.j$g r1 = new com.bumptech.glide.annotation.compiler.j$g
            r1.<init>(r3)
            java.util.List r0 = com.bumptech.glide.repackaged.com.google.common.collect.w.i(r0, r1)
            return r0
    }

    private boolean l(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r2, com.bumptech.glide.repackaged.com.squareup.javapoet.i r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.j r2 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r2)
            com.bumptech.glide.annotation.compiler.j$c r0 = new com.bumptech.glide.annotation.compiler.j$c
            r0.<init>(r1, r3)
            boolean r2 = r2.a(r0)
            return r2
    }

    private boolean m(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> r3, com.bumptech.glide.repackaged.com.squareup.javapoet.i r4) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.lang.String> r0 = com.bumptech.glide.annotation.compiler.j.i
            java.lang.String r1 = r4.a
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L34
            javax.lang.model.element.Modifier r0 = javax.lang.model.element.Modifier.PUBLIC
            boolean r0 = r4.c(r0)
            if (r0 == 0) goto L34
            javax.lang.model.element.Modifier r0 = javax.lang.model.element.Modifier.STATIC
            boolean r0 = r4.c(r0)
            if (r0 != 0) goto L34
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r4.f
            java.lang.String r0 = r0.toString()
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r2.g
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            boolean r3 = r2.l(r3, r4)
            if (r3 != 0) goto L34
            r3 = 1
            return r3
        L34:
            r3 = 0
            return r3
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec e(java.lang.String r9, java.util.Set<java.lang.String> r10, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r11) {
            r8 = this;
            r0 = 0
            if (r11 == 0) goto Le
            java.lang.String r1 = r11.b
            java.lang.String[] r2 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r1, r2)
            r8.g = r1
            goto L1a
        Le:
            java.lang.String r1 = "BaseRequestOptions"
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r3 = "com.bumptech.glide.request"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r3, r1, r2)
            r8.g = r1
        L1a:
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "GlideRequest"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r9 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r2, r1)
            r8.f = r9
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r1 = r8.c
            r3 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r4 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r3]
            r4[r0] = r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r9 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r9, r4)
            r8.h = r9
            com.bumptech.glide.annotation.compiler.m r1 = new com.bumptech.glide.annotation.compiler.m
            com.bumptech.glide.annotation.compiler.i r4 = r8.b
            r1.<init>(r9, r4)
            java.lang.String r9 = "RequestBuilder"
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r5 = "com.bumptech.glide"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r9 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r5, r9, r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r4 = r8.c
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r5 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r3]
            r5[r0] = r4
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r9 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r9, r5)
            java.util.List r10 = r1.a(r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.a(r2)
            javax.lang.model.element.TypeElement r2 = r8.e
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r2
            java.lang.String r2 = "Contains all public methods from {@link $T}, all options from\n"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r2, r4)
            javax.lang.model.element.TypeElement r2 = r8.d
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r2
            java.lang.String r2 = "{@link $T} and all generated options from\n"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r2, r4)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Class<com.bumptech.glide.annotation.GlideOption> r4 = com.bumptech.glide.annotation.GlideOption.class
            r2[r0] = r4
            java.lang.String r4 = "{@link $T} in annotated methods in\n"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r4, r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Class<com.bumptech.glide.annotation.GlideExtension> r4 = com.bumptech.glide.annotation.GlideExtension.class
            r2[r0] = r4
            java.lang.String r4 = "{@link $T} annotated classes.\n"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r4, r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "\n"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r4, r2)
            java.lang.String r2 = "<p>Generated code, do not modify.\n"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r2, r5)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r4, r2)
            javax.lang.model.element.TypeElement r2 = r8.e
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r2
            java.lang.String r2 = "@see $T\n"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r2, r4)
            javax.lang.model.element.TypeElement r4 = r8.d
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r4
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.u(r2, r5)
            java.lang.Class<java.lang.SuppressWarnings> r2 = java.lang.SuppressWarnings.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r2)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "unused"
            r4[r0] = r5
            java.lang.String r5 = "value"
            java.lang.String r6 = "$S"
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r2 = r2.d(r5, r6, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r7 = "deprecation"
            r4[r0] = r7
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r2 = r2.d(r5, r6, r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r2 = r2.f()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r1 = r1.q(r2)
            javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r3]
            javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PUBLIC
            r2[r0] = r3
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = r1.x(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r1 = r8.c
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = r0.A(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r9 = r0.C(r9)
            java.lang.Class<java.lang.Cloneable> r0 = java.lang.Cloneable.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r9 = r9.z(r0)
            java.util.List r0 = r8.f()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r9 = r9.w(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r8.g()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r9 = r9.v(r0)
            java.util.List r11 = r8.i(r10, r11)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r9 = r9.w(r11)
            java.util.List r11 = r8.k()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r9 = r9.w(r11)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r9 = r9.w(r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r9 = r9.B()
            return r9
    }
}
