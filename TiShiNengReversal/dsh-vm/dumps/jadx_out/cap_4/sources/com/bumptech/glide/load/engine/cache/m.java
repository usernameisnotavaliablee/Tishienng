package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    private final com.bumptech.glide.util.h<com.bumptech.glide.load.c, java.lang.String> a;
    private final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.cache.m.b> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.util.pool.a.d<com.bumptech.glide.load.engine.cache.m.b> {
        final /* synthetic */ com.bumptech.glide.load.engine.cache.m a;

        a(com.bumptech.glide.load.engine.cache.m r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.util.pool.a.d
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.cache.m.b a() {
                r1 = this;
                com.bumptech.glide.load.engine.cache.m$b r0 = r1.b()
                return r0
        }

        public com.bumptech.glide.load.engine.cache.m.b b() {
                r2 = this;
                com.bumptech.glide.load.engine.cache.m$b r0 = new com.bumptech.glide.load.engine.cache.m$b     // Catch: java.security.NoSuchAlgorithmException -> Lc
                java.lang.String r1 = "SHA-256"
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> Lc
                r0.<init>(r1)     // Catch: java.security.NoSuchAlgorithmException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements com.bumptech.glide.util.pool.a.f {
        final java.security.MessageDigest a;
        private final com.bumptech.glide.util.pool.c b;

        b(java.security.MessageDigest r2) {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.util.pool.c r0 = com.bumptech.glide.util.pool.c.a()
                r1.b = r0
                r1.a = r2
                return
        }

        @Override // com.bumptech.glide.util.pool.a.f
        @androidx.annotation.NonNull
        public com.bumptech.glide.util.pool.c h() {
                r1 = this;
                com.bumptech.glide.util.pool.c r0 = r1.b
                return r0
        }
    }

    public m() {
            r3 = this;
            r3.<init>()
            com.bumptech.glide.util.h r0 = new com.bumptech.glide.util.h
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1)
            r3.a = r0
            com.bumptech.glide.load.engine.cache.m$a r0 = new com.bumptech.glide.load.engine.cache.m$a
            r0.<init>(r3)
            r1 = 10
            androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.a.e(r1, r0)
            r3.b = r0
            return
    }

    private java.lang.String a(com.bumptech.glide.load.c r3) {
            r2 = this;
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.cache.m$b> r0 = r2.b
            java.lang.Object r0 = r0.acquire()
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
            com.bumptech.glide.load.engine.cache.m$b r0 = (com.bumptech.glide.load.engine.cache.m.b) r0
            java.security.MessageDigest r1 = r0.a     // Catch: java.lang.Throwable -> L21
            r3.b(r1)     // Catch: java.lang.Throwable -> L21
            java.security.MessageDigest r3 = r0.a     // Catch: java.lang.Throwable -> L21
            byte[] r3 = r3.digest()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = com.bumptech.glide.util.l.z(r3)     // Catch: java.lang.Throwable -> L21
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.cache.m$b> r1 = r2.b
            r1.release(r0)
            return r3
        L21:
            r3 = move-exception
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.cache.m$b> r1 = r2.b
            r1.release(r0)
            throw r3
    }

    public java.lang.String b(com.bumptech.glide.load.c r4) {
            r3 = this;
            com.bumptech.glide.util.h<com.bumptech.glide.load.c, java.lang.String> r0 = r3.a
            monitor-enter(r0)
            com.bumptech.glide.util.h<com.bumptech.glide.load.c, java.lang.String> r1 = r3.a     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.i(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L12
            java.lang.String r1 = r3.a(r4)
        L12:
            com.bumptech.glide.util.h<com.bumptech.glide.load.c, java.lang.String> r2 = r3.a
            monitor-enter(r2)
            com.bumptech.glide.util.h<com.bumptech.glide.load.c, java.lang.String> r0 = r3.a     // Catch: java.lang.Throwable -> L1c
            r0.m(r4, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r4
        L1f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }
}
