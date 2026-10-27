package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e implements com.bumptech.glide.load.engine.cache.a {
    private static final java.lang.String f = "DiskLruCacheWrapper";
    private static final int g = 1;
    private static final int h = 1;
    private static com.bumptech.glide.load.engine.cache.e i;
    private final com.bumptech.glide.load.engine.cache.m a;
    private final java.io.File b;
    private final long c;
    private final com.bumptech.glide.load.engine.cache.c d;
    private com.bumptech.glide.disklrucache.b e;

    @java.lang.Deprecated
    protected e(java.io.File r2, long r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.cache.c r0 = new com.bumptech.glide.load.engine.cache.c
            r0.<init>()
            r1.d = r0
            r1.b = r2
            r1.c = r3
            com.bumptech.glide.load.engine.cache.m r2 = new com.bumptech.glide.load.engine.cache.m
            r2.<init>()
            r1.a = r2
            return
    }

    public static com.bumptech.glide.load.engine.cache.a c(java.io.File r1, long r2) {
            com.bumptech.glide.load.engine.cache.e r0 = new com.bumptech.glide.load.engine.cache.e
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static synchronized com.bumptech.glide.load.engine.cache.a d(java.io.File r2, long r3) {
            java.lang.Class<com.bumptech.glide.load.engine.cache.e> r0 = com.bumptech.glide.load.engine.cache.e.class
            monitor-enter(r0)
            com.bumptech.glide.load.engine.cache.e r1 = com.bumptech.glide.load.engine.cache.e.i     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.bumptech.glide.load.engine.cache.e r1 = new com.bumptech.glide.load.engine.cache.e     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.cache.e.i = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.bumptech.glide.load.engine.cache.e r2 = com.bumptech.glide.load.engine.cache.e.i     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private synchronized com.bumptech.glide.disklrucache.b e() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.disklrucache.b r0 = r4.e     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            java.io.File r0 = r4.b     // Catch: java.lang.Throwable -> L11
            long r1 = r4.c     // Catch: java.lang.Throwable -> L11
            r3 = 1
            com.bumptech.glide.disklrucache.b r0 = com.bumptech.glide.disklrucache.b.w(r0, r3, r3, r1)     // Catch: java.lang.Throwable -> L11
            r4.e = r0     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L17
        L13:
            com.bumptech.glide.disklrucache.b r0 = r4.e     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)
            return r0
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    private synchronized void f() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.e = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void a(com.bumptech.glide.load.c r4, com.bumptech.glide.load.engine.cache.a.b r5) {
            r3 = this;
            java.lang.String r0 = "DiskLruCacheWrapper"
            com.bumptech.glide.load.engine.cache.m r1 = r3.a
            java.lang.String r1 = r1.b(r4)
            com.bumptech.glide.load.engine.cache.c r2 = r3.d
            r2.a(r1)
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L65
        L1a:
            com.bumptech.glide.disklrucache.b r4 = r3.e()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            com.bumptech.glide.disklrucache.b$e r2 = r4.r(r1)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            if (r2 == 0) goto L2a
        L24:
            com.bumptech.glide.load.engine.cache.c r4 = r3.d
            r4.b(r1)
            return
        L2a:
            com.bumptech.glide.disklrucache.b$c r4 = r4.o(r1)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            if (r4 == 0) goto L49
            r2 = 0
            java.io.File r2 = r4.f(r2)     // Catch: java.lang.Throwable -> L3f
            boolean r5 = r5.a(r2)     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L41
            r4.e()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r5 = move-exception
            goto L45
        L41:
            r4.b()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            goto L24
        L45:
            r4.b()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            throw r5     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
        L49:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            r5.<init>()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            java.lang.String r2 = "Had two simultaneous puts for: "
            r5.append(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            r5.append(r1)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
            throw r4     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L60
        L60:
            r4 = 5
            android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L18
            goto L24
        L65:
            com.bumptech.glide.load.engine.cache.c r5 = r3.d
            r5.b(r1)
            throw r4
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public java.io.File b(com.bumptech.glide.load.c r4) {
            r3 = this;
            com.bumptech.glide.load.engine.cache.m r0 = r3.a
            java.lang.String r0 = r0.b(r4)
            r1 = 2
            java.lang.String r2 = "DiskLruCacheWrapper"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L12
            java.util.Objects.toString(r4)
        L12:
            r4 = 0
            com.bumptech.glide.disklrucache.b r1 = r3.e()     // Catch: java.io.IOException -> L23
            com.bumptech.glide.disklrucache.b$e r0 = r1.r(r0)     // Catch: java.io.IOException -> L23
            if (r0 == 0) goto L22
            r1 = 0
            java.io.File r4 = r0.b(r1)     // Catch: java.io.IOException -> L23
        L22:
            return r4
        L23:
            r0 = 5
            android.util.Log.isLoggable(r2, r0)
            return r4
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public synchronized void clear() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.disklrucache.b r0 = r2.e()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            r0.delete()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
        L8:
            r2.f()     // Catch: java.lang.Throwable -> Lc
            goto L17
        Lc:
            r0 = move-exception
            goto L1d
        Le:
            r0 = move-exception
            goto L19
        L10:
            java.lang.String r0 = "DiskLruCacheWrapper"
            r1 = 5
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            goto L8
        L17:
            monitor-exit(r2)
            return
        L19:
            r2.f()     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void delete(com.bumptech.glide.load.c r2) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.m r0 = r1.a
            java.lang.String r2 = r0.b(r2)
            com.bumptech.glide.disklrucache.b r0 = r1.e()     // Catch: java.io.IOException -> Le
            r0.B(r2)     // Catch: java.io.IOException -> Le
            return
        Le:
            java.lang.String r2 = "DiskLruCacheWrapper"
            r0 = 5
            android.util.Log.isLoggable(r2, r0)
            return
    }
}
