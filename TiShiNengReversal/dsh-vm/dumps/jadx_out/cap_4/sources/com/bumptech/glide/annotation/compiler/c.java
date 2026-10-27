package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class c {
    private final com.bumptech.glide.annotation.compiler.i a;
    private final com.bumptech.glide.annotation.compiler.g b;
    private final com.bumptech.glide.annotation.compiler.e c;

    c(javax.annotation.processing.ProcessingEnvironment r1, com.bumptech.glide.annotation.compiler.i r2, com.bumptech.glide.annotation.compiler.g r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            com.bumptech.glide.annotation.compiler.e r3 = new com.bumptech.glide.annotation.compiler.e
            r3.<init>(r1, r2)
            r0.c = r3
            return
    }

    java.util.Set<java.lang.String> a() {
            r1 = this;
            java.lang.Class<com.bumptech.glide.annotation.GlideExtension> r0 = com.bumptech.glide.annotation.GlideExtension.class
            java.lang.String r0 = r0.getName()
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
    }

    boolean b(javax.annotation.processing.RoundEnvironment r6) {
            r5 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r5.a
            java.lang.Class<com.bumptech.glide.annotation.GlideExtension> r1 = com.bumptech.glide.annotation.GlideExtension.class
            java.util.List r6 = r0.u(r1, r6)
            com.bumptech.glide.annotation.compiler.i r0 = r5.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Processing types : "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.f(r1)
            java.util.Iterator r0 = r6.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            javax.lang.model.element.TypeElement r1 = (javax.lang.model.element.TypeElement) r1
            com.bumptech.glide.annotation.compiler.e r2 = r5.c
            r2.k(r1)
            com.bumptech.glide.annotation.compiler.i r2 = r5.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Processing elements: "
            r3.append(r4)
            java.util.List r1 = r1.getEnclosedElements()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.f(r1)
            goto L22
        L4e:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L56
            r6 = 0
            return r6
        L56:
            com.bumptech.glide.annotation.compiler.g r0 = r5.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r6 = r0.a(r6)
            com.bumptech.glide.annotation.compiler.i r0 = r5.a
            r0.P(r6)
            r6 = 1
            return r6
    }
}
