package com.bumptech.glide.load.model.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i implements com.bumptech.glide.load.model.n<java.net.URL, java.io.InputStream> {
    private final com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.bumptech.glide.load.model.o<java.net.URL, java.io.InputStream> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<java.net.URL, java.io.InputStream> c(com.bumptech.glide.load.model.r r4) {
                r3 = this;
                com.bumptech.glide.load.model.stream.i r0 = new com.bumptech.glide.load.model.stream.i
                java.lang.Class<com.bumptech.glide.load.model.g> r1 = com.bumptech.glide.load.model.g.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                com.bumptech.glide.load.model.n r4 = r4.d(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    public i(com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a<java.io.InputStream> a(@androidx.annotation.NonNull java.net.URL r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            java.net.URL r1 = (java.net.URL) r1
            com.bumptech.glide.load.model.n$a r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ boolean b(@androidx.annotation.NonNull java.net.URL r1) {
            r0 = this;
            java.net.URL r1 = (java.net.URL) r1
            boolean r1 = r0.d(r1)
            return r1
    }

    public com.bumptech.glide.load.model.n.a<java.io.InputStream> c(@androidx.annotation.NonNull java.net.URL r3, int r4, int r5, @androidx.annotation.NonNull com.bumptech.glide.load.f r6) {
            r2 = this;
            com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> r0 = r2.a
            com.bumptech.glide.load.model.g r1 = new com.bumptech.glide.load.model.g
            r1.<init>(r3)
            com.bumptech.glide.load.model.n$a r3 = r0.a(r1, r4, r5, r6)
            return r3
    }

    public boolean d(@androidx.annotation.NonNull java.net.URL r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
