package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class b {
    private static final java.lang.String j = null;
    private final javax.annotation.processing.ProcessingEnvironment a;
    private final com.bumptech.glide.annotation.compiler.i b;
    private final java.util.List<javax.lang.model.element.TypeElement> c;
    private final com.bumptech.glide.annotation.compiler.n d;
    private final com.bumptech.glide.annotation.compiler.l e;
    private final com.bumptech.glide.annotation.compiler.a f;
    private final com.bumptech.glide.annotation.compiler.j g;
    private final com.bumptech.glide.annotation.compiler.k h;
    private final com.bumptech.glide.annotation.compiler.f i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.annotation.compiler.b$b, reason: collision with other inner class name */
    private static final class C0013b {
        private final java.util.Set<java.lang.String> a;
        private final java.util.Set<java.lang.String> b;

        private C0013b(java.util.Set<java.lang.String> r1, java.util.Set<java.lang.String> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        /* synthetic */ C0013b(java.util.Set r1, java.util.Set r2, com.bumptech.glide.annotation.compiler.b.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ java.util.Set a(com.bumptech.glide.annotation.compiler.b.C0013b r0) {
                java.util.Set<java.lang.String> r0 = r0.b
                return r0
        }

        static /* synthetic */ java.util.Set b(com.bumptech.glide.annotation.compiler.b.C0013b r0) {
                java.util.Set<java.lang.String> r0 = r0.a
                return r0
        }
    }

    static {
            java.lang.Class<com.bumptech.glide.annotation.compiler.d> r0 = com.bumptech.glide.annotation.compiler.d.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            com.bumptech.glide.annotation.compiler.b.j = r0
            return
    }

    b(javax.annotation.processing.ProcessingEnvironment r2, com.bumptech.glide.annotation.compiler.i r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r1.a = r2
            r1.b = r3
            com.bumptech.glide.annotation.compiler.a r0 = new com.bumptech.glide.annotation.compiler.a
            r0.<init>(r2, r3)
            r1.f = r0
            com.bumptech.glide.annotation.compiler.n r0 = new com.bumptech.glide.annotation.compiler.n
            r0.<init>(r2, r3)
            r1.d = r0
            com.bumptech.glide.annotation.compiler.l r0 = new com.bumptech.glide.annotation.compiler.l
            r0.<init>(r2, r3)
            r1.e = r0
            com.bumptech.glide.annotation.compiler.k r0 = new com.bumptech.glide.annotation.compiler.k
            r0.<init>(r2, r3)
            r1.h = r0
            com.bumptech.glide.annotation.compiler.f r0 = new com.bumptech.glide.annotation.compiler.f
            r0.<init>(r2, r3)
            r1.i = r0
            com.bumptech.glide.annotation.compiler.j r0 = new com.bumptech.glide.annotation.compiler.j
            r0.<init>(r2, r3)
            r1.g = r0
            return
    }

    private java.lang.String a(javax.lang.model.element.TypeElement r2) {
            r1 = this;
            java.lang.Class<com.bumptech.glide.annotation.GlideModule> r0 = com.bumptech.glide.annotation.GlideModule.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r0)
            com.bumptech.glide.annotation.GlideModule r2 = (com.bumptech.glide.annotation.GlideModule) r2
            java.lang.String r2 = r2.glideName()
            return r2
    }

    private com.bumptech.glide.annotation.compiler.b.C0013b b(javax.lang.model.element.PackageElement r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.List r5 = r5.getEnclosedElements()
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r5.next()
            javax.lang.model.element.Element r2 = (javax.lang.model.element.Element) r2
            java.lang.Class<com.bumptech.glide.annotation.compiler.Index> r3 = com.bumptech.glide.annotation.compiler.Index.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r3)
            com.bumptech.glide.annotation.compiler.Index r2 = (com.bumptech.glide.annotation.compiler.Index) r2
            if (r2 == 0) goto L12
            java.lang.String[] r3 = r2.modules()
            java.util.Collections.addAll(r0, r3)
            java.lang.String[] r2 = r2.extensions()
            java.util.Collections.addAll(r1, r2)
            goto L12
        L37:
            com.bumptech.glide.annotation.compiler.i r5 = r4.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Found GlideModules: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r5.f(r2)
            com.bumptech.glide.annotation.compiler.b$b r5 = new com.bumptech.glide.annotation.compiler.b$b
            r2 = 0
            r5.<init>(r0, r1, r2)
            return r5
    }

    private void e(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            java.lang.String r1 = "com.bumptech.glide"
            r0.O(r1, r3)
            return
    }

    private void f(java.lang.String r2, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
            r1 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r1.b
            r0.O(r2, r3)
            return
    }

    private void g(java.lang.String r2, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
            r1 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r1.b
            r0.O(r2, r3)
            return
    }

    private void h(java.lang.String r2, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
            r1 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r1.b
            r0.O(r2, r3)
            return
    }

    private void i(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            java.lang.String r1 = "com.bumptech.glide"
            r0.O(r1, r3)
            return
    }

    private void j(java.lang.String r2, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3) {
            r1 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r1.b
            r0.O(r2, r3)
            return
    }

    boolean c() {
            r7 = this;
            java.util.List<javax.lang.model.element.TypeElement> r0 = r7.c
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.List<javax.lang.model.element.TypeElement> r0 = r7.c
            java.lang.Object r0 = r0.get(r1)
            javax.lang.model.element.TypeElement r0 = (javax.lang.model.element.TypeElement) r0
            com.bumptech.glide.annotation.compiler.i r1 = r7.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Processing app module: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.f(r2)
            javax.annotation.processing.ProcessingEnvironment r1 = r7.a
            javax.lang.model.util.Elements r1 = r1.getElementUtils()
            java.lang.String r2 = com.bumptech.glide.annotation.compiler.b.j
            javax.lang.model.element.PackageElement r1 = r1.getPackageElement(r2)
            com.bumptech.glide.annotation.compiler.b$b r1 = r7.b(r1)
            javax.lang.model.element.Element r2 = r0.getEnclosingElement()
            java.lang.String r2 = r2.toString()
            com.bumptech.glide.annotation.compiler.n r3 = r7.d
            java.util.Set r4 = com.bumptech.glide.annotation.compiler.b.C0013b.a(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3 = r3.d(r2, r4)
            r7.j(r2, r3)
            com.bumptech.glide.annotation.compiler.j r4 = r7.g
            java.util.Set r5 = com.bumptech.glide.annotation.compiler.b.C0013b.a(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r4 = r4.e(r2, r5, r3)
            r7.g(r2, r4)
            com.bumptech.glide.annotation.compiler.l r5 = r7.e
            java.util.Set r6 = com.bumptech.glide.annotation.compiler.b.C0013b.a(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3 = r5.d(r2, r3, r4, r6)
            r7.h(r2, r3)
            com.bumptech.glide.annotation.compiler.k r4 = r7.h
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r4 = r4.a(r2, r3)
            r7.i(r4)
            com.bumptech.glide.annotation.compiler.f r4 = r7.i
            java.lang.String r5 = r7.a(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3 = r4.f(r2, r5, r3)
            r7.f(r2, r3)
            com.bumptech.glide.annotation.compiler.a r2 = r7.f
            java.util.Set r3 = com.bumptech.glide.annotation.compiler.b.C0013b.b(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r0 = r2.b(r0, r3)
            r7.e(r0)
            com.bumptech.glide.annotation.compiler.i r0 = r7.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Wrote GeneratedAppGlideModule with: "
            r2.append(r3)
            java.util.Set r1 = com.bumptech.glide.annotation.compiler.b.C0013b.b(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.C(r1)
            r0 = 1
            return r0
    }

    void d(java.util.Set<? extends javax.lang.model.element.TypeElement> r2, javax.annotation.processing.RoundEnvironment r3) {
            r1 = this;
            com.bumptech.glide.annotation.compiler.i r2 = r1.b
            java.lang.Class<com.bumptech.glide.annotation.GlideModule> r0 = com.bumptech.glide.annotation.GlideModule.class
            java.util.List r2 = r2.u(r0, r3)
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            javax.lang.model.element.TypeElement r3 = (javax.lang.model.element.TypeElement) r3
            com.bumptech.glide.annotation.compiler.i r0 = r1.b
            boolean r0 = r0.D(r3)
            if (r0 == 0) goto Lc
            java.util.List<javax.lang.model.element.TypeElement> r0 = r1.c
            r0.add(r3)
            goto Lc
        L26:
            com.bumptech.glide.annotation.compiler.i r2 = r1.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "got app modules: "
            r3.append(r0)
            java.util.List<javax.lang.model.element.TypeElement> r0 = r1.c
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.f(r3)
            java.util.List<javax.lang.model.element.TypeElement> r2 = r1.c
            int r2 = r2.size()
            r3 = 1
            if (r2 > r3) goto L48
            return
        L48:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "You cannot have more than one AppGlideModule, found: "
            r3.append(r0)
            java.util.List<javax.lang.model.element.TypeElement> r0 = r1.c
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
