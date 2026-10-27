package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bumptech.glide.load.engine.cache.a.InterfaceC0019a {
    private final long c;
    private final com.bumptech.glide.load.engine.cache.d.c d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.engine.cache.d.c {
        final /* synthetic */ java.lang.String a;

        a(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public java.io.File a() {
                r2 = this;
                java.io.File r0 = new java.io.File
                java.lang.String r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.bumptech.glide.load.engine.cache.d.c {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.lang.String b;

        b(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public java.io.File a() {
                r3 = this;
                java.io.File r0 = new java.io.File
                java.lang.String r1 = r3.a
                java.lang.String r2 = r3.b
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        java.io.File a();
    }

    public d(com.bumptech.glide.load.engine.cache.d.c r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.c = r2
            r0.d = r1
            return
    }

    public d(java.lang.String r2, long r3) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.d$a r0 = new com.bumptech.glide.load.engine.cache.d$a
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public d(java.lang.String r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.d$b r0 = new com.bumptech.glide.load.engine.cache.d$b
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0019a
    public com.bumptech.glide.load.engine.cache.a build() {
            r3 = this;
            com.bumptech.glide.load.engine.cache.d$c r0 = r3.d
            java.io.File r0 = r0.a()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L18
            boolean r2 = r0.mkdirs()
            if (r2 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            long r1 = r3.c
            com.bumptech.glide.load.engine.cache.a r0 = com.bumptech.glide.load.engine.cache.e.c(r0, r1)
            return r0
    }
}
