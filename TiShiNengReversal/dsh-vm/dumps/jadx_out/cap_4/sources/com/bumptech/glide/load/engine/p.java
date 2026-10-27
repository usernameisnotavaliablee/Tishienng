package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class p<Z> implements com.bumptech.glide.load.engine.u<Z> {
    private final boolean a;
    private final boolean b;
    private final com.bumptech.glide.load.engine.u<Z> c;
    private final com.bumptech.glide.load.engine.p.a d;
    private final com.bumptech.glide.load.c e;
    private int f;
    private boolean g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        void c(com.bumptech.glide.load.c r1, com.bumptech.glide.load.engine.p<?> r2);
    }

    p(com.bumptech.glide.load.engine.u<Z> r1, boolean r2, boolean r3, com.bumptech.glide.load.c r4, com.bumptech.glide.load.engine.p.a r5) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
            r0.c = r1
            r0.a = r2
            r0.b = r3
            r0.e = r4
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r5)
            com.bumptech.glide.load.engine.p$a r1 = (com.bumptech.glide.load.engine.p.a) r1
            r0.d = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<Z> a() {
            r1 = this;
            com.bumptech.glide.load.engine.u<Z> r0 = r1.c
            java.lang.Class r0 = r0.a()
            return r0
    }

    synchronized void b() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.g     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            int r0 = r2.f     // Catch: java.lang.Throwable -> Ld
            int r0 = r0 + 1
            r2.f = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            goto L17
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "Cannot acquire a recycled resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0     // Catch: java.lang.Throwable -> Ld
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    com.bumptech.glide.load.engine.u<Z> c() {
            r1 = this;
            com.bumptech.glide.load.engine.u<Z> r0 = r1.c
            return r0
    }

    boolean d() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    void e() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f     // Catch: java.lang.Throwable -> L18
            if (r0 <= 0) goto L1a
            r1 = 1
            int r0 = r0 - r1
            r2.f = r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L17
            com.bumptech.glide.load.engine.p$a r0 = r2.d
            com.bumptech.glide.load.c r1 = r2.e
            r0.c(r1, r2)
        L17:
            return
        L18:
            r0 = move-exception
            goto L22
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "Cannot release a recycled or not yet acquired resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public Z get() {
            r1 = this;
            com.bumptech.glide.load.engine.u<Z> r0 = r1.c
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r1 = this;
            com.bumptech.glide.load.engine.u<Z> r0 = r1.c
            int r0 = r0.getSize()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void recycle() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f     // Catch: java.lang.Throwable -> L16
            if (r0 > 0) goto L22
            boolean r0 = r2.g     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L1a
            r0 = 1
            r2.g = r0     // Catch: java.lang.Throwable -> L16
            boolean r0 = r2.b     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            com.bumptech.glide.load.engine.u<Z> r0 = r2.c     // Catch: java.lang.Throwable -> L16
            r0.recycle()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L2a
        L18:
            monitor-exit(r2)
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Cannot recycle a resource that has already been recycled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Cannot recycle a resource while it is still acquired"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "EngineResource{isMemoryCacheable="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r2.a     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", listener="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.engine.p$a r1 = r2.d     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", key="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.c r1 = r2.e     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", acquired="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            int r1 = r2.f     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", isRecycled="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r2.g     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", resource="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.engine.u<Z> r1 = r2.c     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)
            return r0
        L4d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r0
    }
}
