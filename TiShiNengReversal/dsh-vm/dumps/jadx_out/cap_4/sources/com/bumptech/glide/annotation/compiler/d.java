package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d extends javax.annotation.processing.AbstractProcessor {
    private com.bumptech.glide.annotation.compiler.i a;
    private com.bumptech.glide.annotation.compiler.h b;
    private com.bumptech.glide.annotation.compiler.b c;
    private boolean d;
    private com.bumptech.glide.annotation.compiler.c e;

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.Set<java.lang.String> a() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bumptech.glide.annotation.compiler.h r1 = r2.b
            java.util.Set r1 = r1.a()
            r0.addAll(r1)
            com.bumptech.glide.annotation.compiler.c r1 = r2.e
            java.util.Set r1 = r1.a()
            r0.addAll(r1)
            return r0
    }

    public javax.lang.model.SourceVersion b() {
            r1 = this;
            javax.lang.model.SourceVersion r0 = javax.lang.model.SourceVersion.latestSupported()
            return r0
    }

    public synchronized void c(javax.annotation.processing.ProcessingEnvironment r4) {
            r3 = this;
            monitor-enter(r3)
            super.init(r4)     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.i r0 = new com.bumptech.glide.annotation.compiler.i     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            r3.a = r0     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.g r1 = new com.bumptech.glide.annotation.compiler.g     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.h r0 = new com.bumptech.glide.annotation.compiler.h     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.i r2 = r3.a     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2d
            r3.b = r0     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.b r0 = new com.bumptech.glide.annotation.compiler.b     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.i r2 = r3.a     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2d
            r3.c = r0     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.c r0 = new com.bumptech.glide.annotation.compiler.c     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.annotation.compiler.i r2 = r3.a     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r4, r2, r1)     // Catch: java.lang.Throwable -> L2d
            r3.e = r0     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            return
        L2d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    public boolean d(java.util.Set<? extends javax.lang.model.element.TypeElement> r4, javax.annotation.processing.RoundEnvironment r5) {
            r3 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r3.a
            r0.M()
            com.bumptech.glide.annotation.compiler.h r0 = r3.b
            boolean r0 = r0.b(r5)
            com.bumptech.glide.annotation.compiler.c r1 = r3.e
            boolean r1 = r1.b(r5)
            com.bumptech.glide.annotation.compiler.b r2 = r3.c
            r2.d(r4, r5)
            r4 = 0
            if (r1 != 0) goto L29
            if (r0 == 0) goto L1c
            goto L29
        L1c:
            boolean r5 = r3.d
            if (r5 != 0) goto L28
            com.bumptech.glide.annotation.compiler.b r5 = r3.c
            boolean r5 = r5.c()
            r3.d = r5
        L28:
            return r4
        L29:
            boolean r5 = r3.d
            if (r5 != 0) goto L2e
            return r4
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot process annotations after writing AppGlideModule"
            r4.<init>(r5)
            throw r4
    }
}
