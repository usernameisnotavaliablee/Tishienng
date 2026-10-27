package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class g {
    private final com.bumptech.glide.annotation.compiler.i a;

    g(com.bumptech.glide.annotation.compiler.i r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec b(java.util.List<javax.lang.model.element.TypeElement> r8, java.lang.Class<? extends java.lang.annotation.Annotation> r9) {
            r7 = this;
            java.lang.Class<com.bumptech.glide.annotation.compiler.Index> r0 = com.bumptech.glide.annotation.compiler.Index.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r0)
            java.lang.String r1 = c(r9)
            java.util.Iterator r2 = r8.iterator()
        Le:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            javax.lang.model.element.TypeElement r3 = (javax.lang.model.element.TypeElement) r3
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r3)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r3
            java.lang.String r3 = "$S"
            r0.d(r1, r3, r4)
            goto Le
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "GlideIndexer_"
            r2.append(r3)
            java.lang.String r9 = r9.getSimpleName()
            r2.append(r9)
            java.lang.String r9 = "_"
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r8.next()
            javax.lang.model.element.TypeElement r2 = (javax.lang.model.element.TypeElement) r2
            javax.lang.model.element.Name r2 = r2.getQualifiedName()
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "."
            java.lang.String r2 = r2.replace(r6, r9)
            r1.append(r2)
            r1.append(r9)
            goto L51
        L72:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r2 = r1.length()
            int r2 = r2 - r4
            java.lang.String r1 = r1.substring(r5, r2)
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            int r1 = r8.length()
            r2 = 242(0xf2, float:3.39E-43)
            if (r1 < r2) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            byte[] r8 = r8.getBytes()
            java.util.UUID r8 = java.util.UUID.nameUUIDFromBytes(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "-"
            java.lang.String r8 = r8.replace(r2, r9)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        Lad:
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.a(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r9 = r0.f()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r8 = r8.q(r9)
            javax.lang.model.element.Modifier[] r9 = new javax.lang.model.element.Modifier[r4]
            javax.lang.model.element.Modifier r0 = javax.lang.model.element.Modifier.PUBLIC
            r9[r5] = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r8 = r8.x(r9)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r8 = r8.B()
            return r8
    }

    private static java.lang.String c(java.lang.Class<? extends java.lang.annotation.Annotation> r3) {
            java.lang.Class<com.bumptech.glide.annotation.GlideModule> r0 = com.bumptech.glide.annotation.GlideModule.class
            if (r3 != r0) goto L7
            java.lang.String r3 = "modules"
            return r3
        L7:
            java.lang.Class<com.bumptech.glide.annotation.GlideExtension> r0 = com.bumptech.glide.annotation.GlideExtension.class
            if (r3 != r0) goto Le
            java.lang.String r3 = "extensions"
            return r3
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized annotation: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec a(java.util.List<javax.lang.model.element.TypeElement> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r6.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r2.next()
            javax.lang.model.element.TypeElement r3 = (javax.lang.model.element.TypeElement) r3
            com.bumptech.glide.annotation.compiler.i r4 = r5.a
            boolean r4 = r4.E(r3)
            if (r4 == 0) goto L26
            r1.add(r3)
            goto Le
        L26:
            com.bumptech.glide.annotation.compiler.i r4 = r5.a
            boolean r4 = r4.F(r3)
            if (r4 == 0) goto L32
            r0.add(r3)
            goto Le
        L32:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unrecognized type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L49:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L75
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L56
            goto L75
        L56:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Given both modules and extensions, expected one or the other. Modules: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " Extensions: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            throw r6
        L75:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L82
            java.lang.Class<com.bumptech.glide.annotation.GlideModule> r0 = com.bumptech.glide.annotation.GlideModule.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r6 = r5.b(r6, r0)
            return r6
        L82:
            java.lang.Class<com.bumptech.glide.annotation.GlideExtension> r0 = com.bumptech.glide.annotation.GlideExtension.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r6 = r5.b(r6, r0)
            return r6
    }
}
