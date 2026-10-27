package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class k {
    private static final com.bumptech.glide.repackaged.com.squareup.javapoet.c g = null;
    private final javax.lang.model.element.TypeElement a;
    private final javax.lang.model.element.TypeElement b;
    private final javax.lang.model.element.TypeElement c;
    private final javax.lang.model.element.TypeElement d;
    private final com.bumptech.glide.repackaged.com.squareup.javapoet.c e;
    private final com.bumptech.glide.annotation.compiler.i f;

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "android.content"
            java.lang.String r2 = "Context"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r1, r2, r0)
            com.bumptech.glide.annotation.compiler.k.g = r0
            return
    }

    k(javax.annotation.processing.ProcessingEnvironment r1, com.bumptech.glide.annotation.compiler.i r2) {
            r0 = this;
            r0.<init>()
            r0.f = r2
            javax.lang.model.util.Elements r1 = r1.getElementUtils()
            java.lang.String r2 = "com.bumptech.glide.Glide"
            javax.lang.model.element.TypeElement r2 = r1.getTypeElement(r2)
            r0.a = r2
            java.lang.String r2 = "com.bumptech.glide.manager.Lifecycle"
            javax.lang.model.element.TypeElement r2 = r1.getTypeElement(r2)
            r0.b = r2
            java.lang.String r2 = "com.bumptech.glide.manager.RequestManagerTreeNode"
            javax.lang.model.element.TypeElement r2 = r1.getTypeElement(r2)
            r0.c = r2
            java.lang.String r2 = "com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory"
            javax.lang.model.element.TypeElement r2 = r1.getTypeElement(r2)
            r0.d = r2
            java.lang.String r2 = "com.bumptech.glide.RequestManager"
            javax.lang.model.element.TypeElement r1 = r1.getTypeElement(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r1)
            r0.e = r1
            return
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec a(java.lang.String r8, com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r9) {
            r7 = this;
            java.lang.String r0 = "GeneratedRequestManagerFactory"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.a(r0)
            r1 = 1
            javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r1]
            javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.FINAL
            r4 = 0
            r2[r4] = r3
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = r0.x(r2)
            javax.lang.model.element.TypeElement r2 = r7.d
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = r0.y(r2)
            java.lang.String r2 = "Generated code, do not modify\n"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = r0.u(r2, r3)
            java.lang.String r2 = "build"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r2)
            javax.lang.model.element.Modifier[] r3 = new javax.lang.model.element.Modifier[r1]
            javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.PUBLIC
            r3[r4] = r5
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.u(r3)
            java.lang.Class<java.lang.Override> r3 = java.lang.Override.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.n(r3)
            com.bumptech.glide.annotation.compiler.i r3 = r7.f
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = r3.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.m(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = r7.e
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.F(r3)
            javax.lang.model.element.TypeElement r3 = r7.a
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r3)
            java.lang.String r5 = "glide"
            javax.lang.model.element.Modifier[] r6 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r3, r5, r6)
            com.bumptech.glide.annotation.compiler.i r5 = r7.f
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = r5.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = r3.e(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r3 = r3.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.v(r3)
            javax.lang.model.element.TypeElement r3 = r7.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r3)
            java.lang.String r5 = "lifecycle"
            javax.lang.model.element.Modifier[] r6 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r3, r5, r6)
            com.bumptech.glide.annotation.compiler.i r5 = r7.f
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = r5.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = r3.e(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r3 = r3.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.v(r3)
            javax.lang.model.element.TypeElement r3 = r7.c
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r3)
            java.lang.String r5 = "treeNode"
            javax.lang.model.element.Modifier[] r6 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r3, r5, r6)
            com.bumptech.glide.annotation.compiler.i r5 = r7.f
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = r5.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = r3.e(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r3 = r3.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.v(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.annotation.compiler.k.g
            java.lang.String r5 = "context"
            javax.lang.model.element.Modifier[] r6 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r3, r5, r6)
            com.bumptech.glide.annotation.compiler.i r5 = r7.f
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = r5.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r3 = r3.e(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r3 = r3.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.v(r3)
            java.lang.String r9 = r9.b
            java.lang.String[] r3 = new java.lang.String[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r8, r9, r3)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r9[r4] = r8
            java.lang.String r8 = "return new $T(glide, lifecycle, treeNode, context)"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r8 = r2.y(r8, r9)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r8 = r8.C()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r8 = r0.v(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r8 = r8.B()
            return r8
    }
}
