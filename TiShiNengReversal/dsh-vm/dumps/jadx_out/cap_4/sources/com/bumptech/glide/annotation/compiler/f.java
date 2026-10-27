package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class f {
    private final javax.annotation.processing.ProcessingEnvironment a;
    private final com.bumptech.glide.annotation.compiler.i b;
    private final javax.lang.model.element.TypeElement c;
    private final javax.lang.model.element.TypeElement d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.repackaged.com.google.common.base.a<javax.lang.model.element.ExecutableElement, com.bumptech.glide.repackaged.com.squareup.javapoet.i> {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec b;
        final /* synthetic */ com.bumptech.glide.annotation.compiler.f c;

        a(com.bumptech.glide.annotation.compiler.f r1, java.lang.String r2, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.i a(javax.lang.model.element.ExecutableElement r4) {
                r3 = this;
                com.bumptech.glide.annotation.compiler.f r0 = r3.c
                boolean r0 = com.bumptech.glide.annotation.compiler.f.a(r0, r4)
                if (r0 == 0) goto L13
                com.bumptech.glide.annotation.compiler.f r0 = r3.c
                java.lang.String r1 = r3.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r2 = r3.b
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r4 = com.bumptech.glide.annotation.compiler.f.b(r0, r1, r2, r4)
                return r4
            L13:
                com.bumptech.glide.annotation.compiler.f r0 = r3.c
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r4 = com.bumptech.glide.annotation.compiler.f.c(r0, r4)
                return r4
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.a
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i apply(javax.lang.model.element.ExecutableElement r1) {
                r0 = this;
                javax.lang.model.element.ExecutableElement r1 = (javax.lang.model.element.ExecutableElement) r1
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = r0.a(r1)
                return r1
        }
    }

    f(javax.annotation.processing.ProcessingEnvironment r1, com.bumptech.glide.annotation.compiler.i r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            javax.lang.model.util.Elements r1 = r1.getElementUtils()
            java.lang.String r2 = "com.bumptech.glide.RequestManager"
            javax.lang.model.element.TypeElement r2 = r1.getTypeElement(r2)
            r0.d = r2
            java.lang.String r2 = "com.bumptech.glide.Glide"
            javax.lang.model.element.TypeElement r1 = r1.getTypeElement(r2)
            r0.c = r1
            return
    }

    static /* synthetic */ boolean a(com.bumptech.glide.annotation.compiler.f r0, javax.lang.model.element.ExecutableElement r1) {
            boolean r0 = r0.h(r1)
            return r0
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i b(com.bumptech.glide.annotation.compiler.f r0, java.lang.String r1, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r2, javax.lang.model.element.ExecutableElement r3) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.j(r1, r2, r3)
            return r0
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.i c(com.bumptech.glide.annotation.compiler.f r0, javax.lang.model.element.ExecutableElement r1) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.i(r1)
            return r0
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i.b d(com.bumptech.glide.repackaged.com.squareup.javapoet.i.b r6, javax.lang.model.element.ExecutableElement r7) {
            r5 = this;
            javax.annotation.processing.ProcessingEnvironment r0 = r5.a
            javax.lang.model.util.Elements r0 = r0.getElementUtils()
            com.bumptech.glide.annotation.compiler.i r1 = r5.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r1.N()
            java.lang.String r1 = r1.F()
            javax.lang.model.element.TypeElement r0 = r0.getTypeElement(r1)
            java.lang.String r0 = r0.toString()
            java.util.List r7 = r7.getAnnotationMirrors()
            java.util.Iterator r7 = r7.iterator()
        L20:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            javax.lang.model.element.AnnotationMirror r1 = (javax.lang.model.element.AnnotationMirror) r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.e(r1)
            r6.l(r2)
            javax.lang.model.type.DeclaredType r1 = r1.getAnnotationType()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L20
            java.lang.String r1 = "SuppressLint"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "android.annotation"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r4, r1, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.a(r1)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "VisibleForTests"
            r3[r2] = r4
            java.lang.String r2 = "value"
            java.lang.String r4 = "$S"
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = r1.d(r2, r4, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r1 = r1.f()
            r6.l(r1)
            goto L20
        L67:
            return r6
    }

    private java.util.List<javax.lang.model.element.ExecutableElement> e() {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            javax.lang.model.element.TypeElement r1 = r2.c
            java.util.List r0 = r0.m(r1)
            return r0
    }

    private java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> g(java.lang.String r3, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r4) {
            r2 = this;
            java.util.List r0 = r2.e()
            com.bumptech.glide.annotation.compiler.f$a r1 = new com.bumptech.glide.annotation.compiler.f$a
            r1.<init>(r2, r3, r4)
            java.util.List r3 = com.bumptech.glide.repackaged.com.google.common.collect.w.i(r0, r1)
            return r3
    }

    private boolean h(javax.lang.model.element.ExecutableElement r3) {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            javax.lang.model.element.TypeElement r1 = r2.d
            boolean r3 = r0.G(r3, r1)
            return r3
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i i(javax.lang.model.element.ExecutableElement r9) {
            r8 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r8.b
            java.util.List r0 = r0.A(r9)
            javax.annotation.processing.ProcessingEnvironment r1 = r8.a
            javax.lang.model.util.Types r1 = r1.getTypeUtils()
            javax.lang.model.type.TypeMirror r2 = r9.getReturnType()
            javax.lang.model.element.Element r1 = r1.asElement(r2)
            javax.lang.model.element.TypeElement r1 = (javax.lang.model.element.TypeElement) r1
            javax.lang.model.element.Name r2 = r9.getSimpleName()
            java.lang.String r2 = r2.toString()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r2)
            r3 = 2
            javax.lang.model.element.Modifier[] r4 = new javax.lang.model.element.Modifier[r3]
            javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.PUBLIC
            r6 = 0
            r4[r6] = r5
            javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.STATIC
            r7 = 1
            r4[r7] = r5
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.u(r4)
            com.bumptech.glide.annotation.compiler.i r4 = r8.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r4 = r4.r(r9)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.s(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.x(r0)
            r8.d(r2, r9)
            if (r1 == 0) goto L47
            goto L48
        L47:
            r7 = 0
        L48:
            if (r7 == 0) goto L51
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r1)
            r2.F(r1)
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r7 == 0) goto L58
            java.lang.String r4 = "return "
            goto L5a
        L58:
            java.lang.String r4 = ""
        L5a:
            r1.<init>(r4)
            java.lang.String r4 = "$T.$N("
            r1.append(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            javax.lang.model.element.TypeElement r5 = r8.c
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r5)
            r4.add(r5)
            javax.lang.model.element.Name r9 = r9.getSimpleName()
            r4.add(r9)
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto La7
            java.util.Iterator r9 = r0.iterator()
        L81:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r9.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.j) r0
            java.lang.String r5 = "$L, "
            r1.append(r5)
            java.lang.String r0 = r0.a
            r4.add(r0)
            goto L81
        L98:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r0 = r1.length()
            int r0 = r0 - r3
            java.lang.String r0 = r1.substring(r6, r0)
            r9.<init>(r0)
            r1 = r9
        La7:
            java.lang.String r9 = ")"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Object[] r0 = r4.toArray(r0)
            r2.y(r9, r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r9 = r2.C()
            return r9
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i j(java.lang.String r8, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r9, javax.lang.model.element.ExecutableElement r10) {
            r7 = this;
            java.lang.String r9 = r9.b
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r8, r9, r1)
            com.bumptech.glide.annotation.compiler.i r9 = r7.b
            java.util.List r9 = r9.A(r10)
            int r1 = r9.size()
            r2 = 1
            if (r1 != r2) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r10
            java.lang.String r4 = "Expected size of 1, but got %s"
            com.bumptech.glide.repackaged.com.google.common.base.d.f(r1, r4, r3)
            java.util.Iterator r1 = r9.iterator()
            java.lang.Object r1 = r1.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.j) r1
            javax.lang.model.element.Name r3 = r10.getSimpleName()
            java.lang.String r3 = r3.toString()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r3)
            r4 = 2
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r4]
            javax.lang.model.element.Modifier r6 = javax.lang.model.element.Modifier.PUBLIC
            r5[r0] = r6
            javax.lang.model.element.Modifier r6 = javax.lang.model.element.Modifier.STATIC
            r5[r2] = r6
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.u(r5)
            com.bumptech.glide.annotation.compiler.i r5 = r7.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r5 = r5.r(r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.s(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r9 = r3.x(r9)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r9 = r9.F(r8)
            javax.lang.model.element.TypeElement r3 = r7.c
            javax.lang.model.element.Name r5 = r10.getSimpleName()
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = r1.a
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r8
            r6[r2] = r3
            r6[r4] = r5
            r8 = 3
            r6[r8] = r1
            java.lang.String r8 = "return ($T) $T.$N($L)"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r8 = r9.y(r8, r6)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r8 = r7.d(r8, r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r8 = r8.C()
            return r8
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec f(java.lang.String r6, java.lang.String r7, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r8) {
            r5 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.a(r7)
            javax.lang.model.element.TypeElement r0 = r5.c
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.Class<com.bumptech.glide.annotation.GlideExtension> r4 = com.bumptech.glide.annotation.GlideExtension.class
            r2[r3] = r4
            r4 = 1
            r2[r4] = r0
            java.lang.String r0 = "The entry point for interacting with Glide for Applications\n\n<p>Includes all generated APIs from all\n{@link $T}s in source and dependent libraries.\n\n<p>This class is generated and should not be modified\n@see $T\n"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r7 = r7.u(r0, r2)
            javax.lang.model.element.Modifier[] r0 = new javax.lang.model.element.Modifier[r1]
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.PUBLIC
            r0[r3] = r1
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.FINAL
            r0[r4] = r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r7 = r7.x(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.a()
            javax.lang.model.element.Modifier[] r1 = new javax.lang.model.element.Modifier[r4]
            javax.lang.model.element.Modifier r2 = javax.lang.model.element.Modifier.PRIVATE
            r1[r3] = r2
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.u(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r0 = r0.C()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r7 = r7.v(r0)
            java.util.List r6 = r5.g(r6, r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r6 = r7.w(r6)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r6 = r6.B()
            return r6
    }
}
