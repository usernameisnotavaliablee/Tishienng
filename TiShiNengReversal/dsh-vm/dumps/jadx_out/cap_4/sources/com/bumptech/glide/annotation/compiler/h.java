package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class h {
    private final com.bumptech.glide.annotation.compiler.i a;
    private final com.bumptech.glide.annotation.compiler.g b;

    h(com.bumptech.glide.annotation.compiler.i r1, com.bumptech.glide.annotation.compiler.g r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    java.util.Set<java.lang.String> a() {
            r1 = this;
            java.lang.Class<com.bumptech.glide.annotation.GlideModule> r0 = com.bumptech.glide.annotation.GlideModule.class
            java.lang.String r0 = r0.getName()
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
    }

    boolean b(javax.annotation.processing.RoundEnvironment r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bumptech.glide.annotation.compiler.i r1 = r3.a
            java.lang.Class<com.bumptech.glide.annotation.GlideModule> r2 = com.bumptech.glide.annotation.GlideModule.class
            java.util.List r4 = r1.u(r2, r4)
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r4.next()
            javax.lang.model.element.TypeElement r1 = (javax.lang.model.element.TypeElement) r1
            com.bumptech.glide.annotation.compiler.i r2 = r3.a
            boolean r2 = r2.D(r1)
            if (r2 == 0) goto L26
            goto L11
        L26:
            com.bumptech.glide.annotation.compiler.i r2 = r3.a
            boolean r2 = r2.F(r1)
            if (r2 == 0) goto L32
            r0.add(r1)
            goto L11
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "@GlideModule can only be applied to LibraryGlideModule and AppGlideModule implementations, not: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L49:
            com.bumptech.glide.annotation.compiler.i r4 = r3.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "got child modules: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r4.f(r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L67
            r4 = 0
            return r4
        L67:
            com.bumptech.glide.annotation.compiler.g r4 = r3.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r4 = r4.a(r0)
            com.bumptech.glide.annotation.compiler.i r0 = r3.a
            r0.P(r4)
            com.bumptech.glide.annotation.compiler.i r4 = r3.a
            java.lang.String r0 = "Wrote an Indexer this round, skipping the app module to ensure all indexers are found"
            r4.f(r0)
            r4 = 1
            return r4
    }
}
