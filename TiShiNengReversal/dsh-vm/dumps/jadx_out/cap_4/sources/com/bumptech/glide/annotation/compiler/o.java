package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class o {
    private final javax.lang.model.element.TypeElement a;
    private com.bumptech.glide.annotation.compiler.i b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.repackaged.com.google.common.base.a<javax.lang.model.element.ExecutableElement, com.bumptech.glide.repackaged.com.squareup.javapoet.i> {
        final /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l a;
        final /* synthetic */ com.bumptech.glide.annotation.compiler.o b;

        a(com.bumptech.glide.annotation.compiler.o r1, com.bumptech.glide.repackaged.com.squareup.javapoet.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.i a(javax.lang.model.element.ExecutableElement r3) {
                r2 = this;
                com.bumptech.glide.annotation.compiler.o r0 = r2.b
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r2.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r3 = com.bumptech.glide.annotation.compiler.o.a(r0, r1, r3)
                return r3
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
    class b implements com.bumptech.glide.repackaged.com.google.common.base.e<javax.lang.model.element.ExecutableElement> {
        final /* synthetic */ java.util.Set a;
        final /* synthetic */ com.bumptech.glide.annotation.compiler.o b;

        b(com.bumptech.glide.annotation.compiler.o r1, java.util.Set r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public boolean a(javax.lang.model.element.ExecutableElement r2) {
                r1 = this;
                java.util.Set r0 = r1.a
                javax.lang.model.element.Name r2 = r2.getSimpleName()
                java.lang.String r2 = r2.toString()
                boolean r2 = r0.contains(r2)
                r2 = r2 ^ 1
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.e
        public /* bridge */ /* synthetic */ boolean apply(javax.lang.model.element.ExecutableElement r1) {
                r0 = this;
                javax.lang.model.element.ExecutableElement r1 = (javax.lang.model.element.ExecutableElement) r1
                boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bumptech.glide.repackaged.com.google.common.base.a<com.bumptech.glide.repackaged.com.squareup.javapoet.j, java.lang.String> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.o a;

        c(com.bumptech.glide.annotation.compiler.o r1) {
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

    o(javax.annotation.processing.ProcessingEnvironment r1, com.bumptech.glide.annotation.compiler.i r2) {
            r0 = this;
            r0.<init>()
            r0.b = r2
            javax.lang.model.util.Elements r1 = r1.getElementUtils()
            java.lang.String r2 = "com.bumptech.glide.request.BaseRequestOptions"
            javax.lang.model.element.TypeElement r1 = r1.getTypeElement(r2)
            r0.a = r1
            return
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i a(com.bumptech.glide.annotation.compiler.o r0, com.bumptech.glide.repackaged.com.squareup.javapoet.l r1, javax.lang.model.element.ExecutableElement r2) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.d(r1, r2)
            return r0
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i d(com.bumptech.glide.repackaged.com.squareup.javapoet.l r6, javax.lang.model.element.ExecutableElement r7) {
            r5 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r5.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.L(r7)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.F(r6)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.a()
            javax.lang.model.element.Name r2 = r7.getSimpleName()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            r3[r6] = r2
            java.lang.String r2 = "return ($T) super.$N("
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r1 = r1.b(r2, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r2 = r0.C()
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.j> r2 = r2.g
            com.bumptech.glide.repackaged.com.google.common.collect.j r2 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r2)
            com.bumptech.glide.annotation.compiler.o$c r3 = new com.bumptech.glide.annotation.compiler.o$c
            r3.<init>(r5)
            com.bumptech.glide.repackaged.com.google.common.collect.j r2 = r2.m(r3)
            java.lang.String r3 = ", "
            com.bumptech.glide.repackaged.com.google.common.base.b r3 = com.bumptech.glide.repackaged.com.google.common.base.b.g(r3)
            java.lang.String r2 = r2.f(r3)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r1 = r1.b(r2, r3)
            java.lang.String r2 = ");\n"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r1 = r1.b(r2, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r1 = r1.j()
            r0.p(r1)
            javax.lang.model.element.Name r1 = r7.getSimpleName()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "transform"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L94
            boolean r1 = r7.isVarArgs()
            if (r1 == 0) goto L94
            javax.lang.model.element.Modifier[] r1 = new javax.lang.model.element.Modifier[r6]
            javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.FINAL
            r1[r4] = r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r0.u(r1)
            java.lang.Class<java.lang.SafeVarargs> r2 = java.lang.SafeVarargs.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r1 = r1.n(r2)
            java.lang.Class<java.lang.SuppressWarnings> r2 = java.lang.SuppressWarnings.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r2)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r3 = "varargs"
            r6[r4] = r3
            java.lang.String r3 = "value"
            java.lang.String r4 = "$S"
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r6 = r2.d(r3, r4, r6)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r6 = r6.f()
            r1.l(r6)
        L94:
            java.util.List r6 = r7.getAnnotationMirrors()
            java.util.Iterator r6 = r6.iterator()
        L9c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb0
            java.lang.Object r7 = r6.next()
            javax.lang.model.element.AnnotationMirror r7 = (javax.lang.model.element.AnnotationMirror) r7
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.e(r7)
            r0.l(r7)
            goto L9c
        Lb0:
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r6 = r0.C()
            return r6
    }

    java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> b(com.bumptech.glide.repackaged.com.squareup.javapoet.l r2) {
            r1 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            java.util.List r2 = r1.c(r2, r0)
            return r2
    }

    java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> c(com.bumptech.glide.repackaged.com.squareup.javapoet.l r3, java.util.Set<java.lang.String> r4) {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            javax.lang.model.element.TypeElement r1 = r2.a
            java.util.List r0 = r0.k(r1, r1)
            com.bumptech.glide.repackaged.com.google.common.collect.j r0 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r0)
            com.bumptech.glide.annotation.compiler.o$b r1 = new com.bumptech.glide.annotation.compiler.o$b
            r1.<init>(r2, r4)
            com.bumptech.glide.repackaged.com.google.common.collect.j r4 = r0.d(r1)
            com.bumptech.glide.annotation.compiler.o$a r0 = new com.bumptech.glide.annotation.compiler.o$a
            r0.<init>(r2, r3)
            com.bumptech.glide.repackaged.com.google.common.collect.j r3 = r4.m(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r3 = r3.g()
            return r3
    }
}
