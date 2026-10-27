package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class t<Z> implements com.bumptech.glide.load.engine.u<Z>, com.bumptech.glide.util.pool.a.f {
    private static final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.t<?>> e = null;
    private final com.bumptech.glide.util.pool.c a;
    private com.bumptech.glide.load.engine.u<Z> b;
    private boolean c;
    private boolean d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.util.pool.a.d<com.bumptech.glide.load.engine.t<?>> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.util.pool.a.d
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.t<?> a() {
                r1 = this;
                com.bumptech.glide.load.engine.t r0 = r1.b()
                return r0
        }

        public com.bumptech.glide.load.engine.t<?> b() {
                r1 = this;
                com.bumptech.glide.load.engine.t r0 = new com.bumptech.glide.load.engine.t
                r0.<init>()
                return r0
        }
    }

    static {
            com.bumptech.glide.load.engine.t$a r0 = new com.bumptech.glide.load.engine.t$a
            r0.<init>()
            r1 = 20
            androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.a.e(r1, r0)
            com.bumptech.glide.load.engine.t.e = r0
            return
    }

    t() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.pool.c r0 = com.bumptech.glide.util.pool.c.a()
            r1.a = r0
            return
    }

    private void b(com.bumptech.glide.load.engine.u<Z> r2) {
            r1 = this;
            r0 = 0
            r1.d = r0
            r0 = 1
            r1.c = r0
            r1.b = r2
            return
    }

    @androidx.annotation.NonNull
    static <Z> com.bumptech.glide.load.engine.t<Z> c(com.bumptech.glide.load.engine.u<Z> r1) {
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.t<?>> r0 = com.bumptech.glide.load.engine.t.e
            java.lang.Object r0 = r0.acquire()
            com.bumptech.glide.load.engine.t r0 = (com.bumptech.glide.load.engine.t) r0
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
            com.bumptech.glide.load.engine.t r0 = (com.bumptech.glide.load.engine.t) r0
            r0.b(r1)
            return r0
    }

    private void d() {
            r1 = this;
            r0 = 0
            r1.b = r0
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.t<?>> r0 = com.bumptech.glide.load.engine.t.e
            r0.release(r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<Z> a() {
            r1 = this;
            com.bumptech.glide.load.engine.u<Z> r0 = r1.b
            java.lang.Class r0 = r0.a()
            return r0
    }

    synchronized void e() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.pool.c r0 = r2.a     // Catch: java.lang.Throwable -> L15
            r0.c()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L19
            r0 = 0
            r2.c = r0     // Catch: java.lang.Throwable -> L15
            boolean r0 = r2.d     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            r2.recycle()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L21
        L17:
            monitor-exit(r2)
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Already unlocked"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public Z get() {
            r1 = this;
            com.bumptech.glide.load.engine.u<Z> r0 = r1.b
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r1 = this;
            com.bumptech.glide.load.engine.u<Z> r0 = r1.b
            int r0 = r0.getSize()
            return r0
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @androidx.annotation.NonNull
    public com.bumptech.glide.util.pool.c h() {
            r1 = this;
            com.bumptech.glide.util.pool.c r0 = r1.a
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void recycle() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.util.pool.c r0 = r1.a     // Catch: java.lang.Throwable -> L16
            r0.c()     // Catch: java.lang.Throwable -> L16
            r0 = 1
            r1.d = r0     // Catch: java.lang.Throwable -> L16
            boolean r0 = r1.c     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            com.bumptech.glide.load.engine.u<Z> r0 = r1.b     // Catch: java.lang.Throwable -> L16
            r0.recycle()     // Catch: java.lang.Throwable -> L16
            r1.d()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
    }
}
