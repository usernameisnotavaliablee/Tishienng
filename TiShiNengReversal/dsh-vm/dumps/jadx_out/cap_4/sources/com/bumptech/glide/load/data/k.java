package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k implements com.bumptech.glide.load.data.e<java.io.InputStream> {
    private static final int b = 5242880;
    private final com.bumptech.glide.load.resource.bitmap.f0 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bumptech.glide.load.data.e.a<java.io.InputStream> {
        private final com.bumptech.glide.load.engine.bitmap_recycle.b a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public java.lang.Class<java.io.InputStream> a() {
                r1 = this;
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.data.e<java.io.InputStream> b(java.io.InputStream r1) {
                r0 = this;
                java.io.InputStream r1 = (java.io.InputStream) r1
                com.bumptech.glide.load.data.e r1 = r0.c(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public com.bumptech.glide.load.data.e<java.io.InputStream> c(java.io.InputStream r3) {
                r2 = this;
                com.bumptech.glide.load.data.k r0 = new com.bumptech.glide.load.data.k
                com.bumptech.glide.load.engine.bitmap_recycle.b r1 = r2.a
                r0.<init>(r3, r1)
                return r0
        }
    }

    public k(java.io.InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.f0 r0 = new com.bumptech.glide.load.resource.bitmap.f0
            r0.<init>(r2, r3)
            r1.a = r0
            r2 = 5242880(0x500000, float:7.34684E-39)
            r0.mark(r2)
            return
    }

    @Override // com.bumptech.glide.load.data.e
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.io.InputStream a() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.d()
            return r0
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.f0 r0 = r1.a
            r0.release()
            return
    }

    public void c() {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.f0 r0 = r1.a
            r0.b()
            return
    }

    @androidx.annotation.NonNull
    public java.io.InputStream d() throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.f0 r0 = r1.a
            r0.reset()
            com.bumptech.glide.load.resource.bitmap.f0 r0 = r1.a
            return r0
    }
}
