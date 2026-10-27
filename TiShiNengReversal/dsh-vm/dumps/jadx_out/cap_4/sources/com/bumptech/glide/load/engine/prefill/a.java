package com.bumptech.glide.load.engine.prefill;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class a implements java.lang.Runnable {

    @androidx.annotation.VisibleForTesting
    static final java.lang.String i = "PreFillRunner";
    private static final com.bumptech.glide.load.engine.prefill.a.C0026a j = null;
    static final long k = 32;

    /* renamed from: l, reason: collision with root package name */
    static final long f433l = 40;

    /* renamed from: m, reason: collision with root package name */
    static final int f434m = 4;

    /* renamed from: n, reason: collision with root package name */
    static final long f435n = 0;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;
    private final com.bumptech.glide.load.engine.cache.j b;
    private final com.bumptech.glide.load.engine.prefill.c c;
    private final com.bumptech.glide.load.engine.prefill.a.C0026a d;
    private final java.util.Set<com.bumptech.glide.load.engine.prefill.d> e;
    private final android.os.Handler f;
    private long g;
    private boolean h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    static class C0026a {
        C0026a() {
                r0 = this;
                r0.<init>()
                return
        }

        long a() {
                r2 = this;
                long r0 = android.os.SystemClock.currentThreadTimeMillis()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements com.bumptech.glide.load.c {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.c
        public void b(@androidx.annotation.NonNull java.security.MessageDigest r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    static {
            com.bumptech.glide.load.engine.prefill.a$a r0 = new com.bumptech.glide.load.engine.prefill.a$a
            r0.<init>()
            com.bumptech.glide.load.engine.prefill.a.j = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMillis(r1)
            com.bumptech.glide.load.engine.prefill.a.f435n = r0
            return
    }

    public a(com.bumptech.glide.load.engine.bitmap_recycle.e r7, com.bumptech.glide.load.engine.cache.j r8, com.bumptech.glide.load.engine.prefill.c r9) {
            r6 = this;
            com.bumptech.glide.load.engine.prefill.a$a r4 = com.bumptech.glide.load.engine.prefill.a.j
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.VisibleForTesting
    a(com.bumptech.glide.load.engine.bitmap_recycle.e r3, com.bumptech.glide.load.engine.cache.j r4, com.bumptech.glide.load.engine.prefill.c r5, com.bumptech.glide.load.engine.prefill.a.C0026a r6, android.os.Handler r7) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.e = r0
            r0 = 40
            r2.g = r0
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            r2.f = r7
            return
    }

    private long c() {
            r4 = this;
            com.bumptech.glide.load.engine.cache.j r0 = r4.b
            long r0 = r0.getMaxSize()
            com.bumptech.glide.load.engine.cache.j r2 = r4.b
            long r2 = r2.getCurrentSize()
            long r0 = r0 - r2
            return r0
    }

    private long d() {
            r6 = this;
            long r0 = r6.g
            r2 = 4
            long r2 = r2 * r0
            long r4 = com.bumptech.glide.load.engine.prefill.a.f435n
            long r2 = java.lang.Math.min(r2, r4)
            r6.g = r2
            return r0
    }

    private boolean e(long r4) {
            r3 = this;
            com.bumptech.glide.load.engine.prefill.a$a r0 = r3.d
            long r0 = r0.a()
            long r0 = r0 - r4
            r4 = 32
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto Lf
            r4 = 1
            return r4
        Lf:
            r4 = 0
            return r4
    }

    @androidx.annotation.VisibleForTesting
    boolean a() {
            r9 = this;
            com.bumptech.glide.load.engine.prefill.a$a r0 = r9.d
            long r0 = r0.a()
        L6:
            com.bumptech.glide.load.engine.prefill.c r2 = r9.c
            boolean r2 = r2.b()
            if (r2 != 0) goto L84
            boolean r2 = r9.e(r0)
            if (r2 != 0) goto L84
            com.bumptech.glide.load.engine.prefill.c r2 = r9.c
            com.bumptech.glide.load.engine.prefill.d r2 = r2.c()
            java.util.Set<com.bumptech.glide.load.engine.prefill.d> r3 = r9.e
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L3a
            java.util.Set<com.bumptech.glide.load.engine.prefill.d> r3 = r9.e
            r3.add(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.e r3 = r9.a
            int r4 = r2.d()
            int r5 = r2.b()
            android.graphics.Bitmap$Config r6 = r2.a()
            android.graphics.Bitmap r3 = r3.f(r4, r5, r6)
            goto L4a
        L3a:
            int r3 = r2.d()
            int r4 = r2.b()
            android.graphics.Bitmap$Config r5 = r2.a()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
        L4a:
            int r4 = com.bumptech.glide.util.l.h(r3)
            long r5 = r9.c()
            long r7 = (long) r4
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L68
            com.bumptech.glide.load.engine.prefill.a$b r4 = new com.bumptech.glide.load.engine.prefill.a$b
            r4.<init>()
            com.bumptech.glide.load.engine.cache.j r5 = r9.b
            com.bumptech.glide.load.engine.bitmap_recycle.e r6 = r9.a
            com.bumptech.glide.load.resource.bitmap.g r3 = com.bumptech.glide.load.resource.bitmap.g.c(r3, r6)
            r5.d(r4, r3)
            goto L6d
        L68:
            com.bumptech.glide.load.engine.bitmap_recycle.e r4 = r9.a
            r4.d(r3)
        L6d:
            java.lang.String r3 = "PreFillRunner"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L6
            r2.d()
            r2.b()
            android.graphics.Bitmap$Config r2 = r2.a()
            java.util.Objects.toString(r2)
            goto L6
        L84:
            boolean r0 = r9.h
            if (r0 != 0) goto L92
            com.bumptech.glide.load.engine.prefill.c r0 = r9.c
            boolean r0 = r0.b()
            if (r0 != 0) goto L92
            r0 = 1
            return r0
        L92:
            r0 = 0
            return r0
    }

    public void b() {
            r1 = this;
            r0 = 1
            r1.h = r0
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            boolean r0 = r3.a()
            if (r0 == 0) goto Lf
            android.os.Handler r0 = r3.f
            long r1 = r3.d()
            r0.postDelayed(r3, r1)
        Lf:
            return
    }
}
