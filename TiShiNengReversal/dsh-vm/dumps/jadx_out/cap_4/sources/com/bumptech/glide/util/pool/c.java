package com.bumptech.glide.util.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class c {
    private static final boolean a = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends com.bumptech.glide.util.pool.c {
        private volatile java.lang.RuntimeException b;

        b() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // com.bumptech.glide.util.pool.c
        void b(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Lc
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r0 = "Released"
                r2.<init>(r0)
                r1.b = r2
                return
            Lc:
                r2 = 0
                r1.b = r2
                return
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
                r3 = this;
                java.lang.RuntimeException r0 = r3.b
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Already released"
                java.lang.RuntimeException r2 = r3.b
                r0.<init>(r1, r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.util.pool.c$c, reason: collision with other inner class name */
    private static class C0044c extends com.bumptech.glide.util.pool.c {
        private volatile boolean b;

        C0044c() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // com.bumptech.glide.util.pool.c
        public void b(boolean r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
                r2 = this;
                boolean r0 = r2.b
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Already released"
                r0.<init>(r1)
                throw r0
        }
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ c(com.bumptech.glide.util.pool.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.util.pool.c a() {
            com.bumptech.glide.util.pool.c$c r0 = new com.bumptech.glide.util.pool.c$c
            r0.<init>()
            return r0
    }

    abstract void b(boolean r1);

    public abstract void c();
}
