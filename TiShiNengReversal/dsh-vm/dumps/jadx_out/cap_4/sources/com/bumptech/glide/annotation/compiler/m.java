package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class m {
    private com.bumptech.glide.repackaged.com.squareup.javapoet.l a;
    private com.bumptech.glide.annotation.compiler.i b;

    m(com.bumptech.glide.repackaged.com.squareup.javapoet.l r1, com.bumptech.glide.annotation.compiler.i r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i b(javax.lang.model.element.ExecutableElement r11) {
            r10 = this;
            javax.lang.model.type.TypeMirror r0 = r11.getReturnType()
            javax.lang.model.type.TypeKind r0 = r0.getKind()
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.VOID
            if (r0 == r1) goto L183
            com.bumptech.glide.annotation.compiler.i r0 = r10.b
            int r0 = r0.x(r11)
            javax.lang.model.element.Name r1 = r11.getSimpleName()
            java.lang.String r1 = r1.toString()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r1)
            r3 = 1
            javax.lang.model.element.Modifier[] r4 = new javax.lang.model.element.Modifier[r3]
            javax.lang.model.element.Modifier r5 = javax.lang.model.element.Modifier.PUBLIC
            r6 = 0
            r4[r6] = r5
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.u(r4)
            com.bumptech.glide.annotation.compiler.i r4 = r10.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r4 = r4.r(r11)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.s(r4)
            boolean r4 = r11.isVarArgs()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.H(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = r10.a
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.F(r4)
            java.lang.Class<java.lang.SuppressWarnings> r4 = java.lang.SuppressWarnings.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r4)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r7 = "unchecked"
            r5[r6] = r7
            java.lang.String r7 = "value"
            java.lang.String r8 = "$S"
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r4 = r4.d(r7, r8, r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r4 = r4.f()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r2 = r2.l(r4)
            java.util.List r4 = r11.getParameters()
            java.util.List r5 = r11.getParameters()
            int r5 = r5.size()
            java.util.List r4 = r4.subList(r3, r5)
            com.bumptech.glide.annotation.compiler.i r5 = r10.b
            java.util.List r5 = r5.z(r4)
            r2.x(r5)
            java.lang.String r7 = ")"
            java.lang.String r8 = "$L, "
            if (r0 != r3) goto Lfd
            com.bumptech.glide.annotation.compiler.i r0 = r10.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = r10.a
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.q(r3, r1, r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r2.s(r0)
            java.lang.Class<java.lang.Override> r1 = java.lang.Override.class
            r0.n(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            javax.lang.model.element.Name r1 = r11.getSimpleName()
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto Ld2
            java.util.Iterator r3 = r5.iterator()
        Lad:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc2
            java.lang.Object r4 = r3.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.j) r4
            r1.append(r8)
            java.lang.String r4 = r4.a
            r0.add(r4)
            goto Lad
        Lc2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r1.length()
            int r4 = r4 + (-2)
            java.lang.String r1 = r1.substring(r6, r4)
            r3.<init>(r1)
            r1 = r3
        Ld2:
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "super.$N("
            r4.append(r9)
            r4.append(r1)
            r4.append(r7)
            java.lang.String r1 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Object[] r0 = r0.toArray(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = r3.b(r1, r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = r0.j()
            java.lang.String r0 = r0.toString()
            goto Lff
        Lfd:
            java.lang.String r0 = "this"
        Lff:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "return ($T) $T.$L($L, "
            r3.<init>(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = r10.a
            r1.add(r4)
            javax.lang.model.element.Element r4 = r11.getEnclosingElement()
            javax.lang.model.type.TypeMirror r4 = r4.asType()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.l(r4)
            r1.add(r4)
            javax.lang.model.element.Name r11 = r11.getSimpleName()
            java.lang.String r11 = r11.toString()
            r1.add(r11)
            r1.add(r0)
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L14c
            java.util.Iterator r11 = r5.iterator()
        L137:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L14c
            java.lang.Object r0 = r11.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.j) r0
            r3.append(r8)
            java.lang.String r0 = r0.a
            r1.add(r0)
            goto L137
        L14c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r0 = r3.length()
            int r0 = r0 + (-2)
            java.lang.String r0 = r3.substring(r6, r0)
            r11.<init>(r0)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Object[] r0 = r1.toArray(r0)
            r2.y(r11, r0)
            com.bumptech.glide.annotation.compiler.i r11 = r10.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r11 = r11.d()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r11 = r2.m(r11)
            com.bumptech.glide.annotation.compiler.i r0 = r10.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = r0.J()
            r11.m(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r11 = r2.C()
            return r11
        L183:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The "
            r1.append(r2)
            javax.lang.model.element.Name r2 = r11.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " method annotated with @GlideOption in the "
            r1.append(r2)
            javax.lang.model.element.Element r11 = r11.getEnclosingElement()
            javax.lang.model.element.Name r11 = r11.getSimpleName()
            r1.append(r11)
            java.lang.String r11 = " @GlideExtension is using a legacy format that is no longer supported. Please change your method definition so that your @GlideModule annotated methods return BaseRequestOptions<?> objects instead of null."
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
    }

    java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.i> a(java.util.Set<java.lang.String> r3) {
            r2 = this;
            java.util.List r3 = r2.c(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            javax.lang.model.element.ExecutableElement r1 = (javax.lang.model.element.ExecutableElement) r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = r2.b(r1)
            r0.add(r1)
            goto L11
        L25:
            return r0
    }

    java.util.List<javax.lang.model.element.ExecutableElement> c(java.util.Set<java.lang.String> r3) {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            java.lang.Class<com.bumptech.glide.annotation.GlideOption> r1 = com.bumptech.glide.annotation.GlideOption.class
            java.util.List r3 = r0.h(r3, r1)
            return r3
    }
}
