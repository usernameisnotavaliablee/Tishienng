package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g extends com.bumptech.glide.load.engine.cache.d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.engine.cache.d.c {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.String b;

        a(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        private java.io.File b() {
                r3 = this;
                android.content.Context r0 = r3.a
                java.io.File r0 = r0.getCacheDir()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                java.lang.String r1 = r3.b
                if (r1 == 0) goto L16
                java.io.File r1 = new java.io.File
                java.lang.String r2 = r3.b
                r1.<init>(r0, r2)
                return r1
            L16:
                return r0
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public java.io.File a() {
                r3 = this;
                java.io.File r0 = r3.b()
                if (r0 == 0) goto Ld
                boolean r1 = r0.exists()
                if (r1 == 0) goto Ld
                return r0
            Ld:
                android.content.Context r1 = r3.a
                java.io.File r1 = r1.getExternalCacheDir()
                if (r1 == 0) goto L29
                boolean r2 = r1.canWrite()
                if (r2 != 0) goto L1c
                goto L29
            L1c:
                java.lang.String r0 = r3.b
                if (r0 == 0) goto L28
                java.io.File r0 = new java.io.File
                java.lang.String r2 = r3.b
                r0.<init>(r1, r2)
                return r0
            L28:
                return r1
            L29:
                return r0
        }
    }

    public g(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "image_manager_disk_cache"
            r1 = 262144000(0xfa00000, double:1.295163447E-315)
            r3.<init>(r4, r0, r1)
            return
    }

    public g(android.content.Context r2, long r3) {
            r1 = this;
            java.lang.String r0 = "image_manager_disk_cache"
            r1.<init>(r2, r0, r3)
            return
    }

    public g(android.content.Context r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.g$a r0 = new com.bumptech.glide.load.engine.cache.g$a
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            return
    }
}
