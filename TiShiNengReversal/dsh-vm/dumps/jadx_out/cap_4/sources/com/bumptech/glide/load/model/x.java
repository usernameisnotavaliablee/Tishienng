package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class x<Data> implements com.bumptech.glide.load.model.n<android.net.Uri, Data> {
    private static final java.util.Set<java.lang.String> b = null;
    private final com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, Data> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.bumptech.glide.load.model.o<android.net.Uri, java.io.InputStream> {
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
        public com.bumptech.glide.load.model.n<android.net.Uri, java.io.InputStream> c(com.bumptech.glide.load.model.r r4) {
                r3 = this;
                com.bumptech.glide.load.model.x r0 = new com.bumptech.glide.load.model.x
                java.lang.Class<com.bumptech.glide.load.model.g> r1 = com.bumptech.glide.load.model.g.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                com.bumptech.glide.load.model.n r4 = r4.d(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "http"
            java.lang.String r2 = "https"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.model.x.b = r0
            return
    }

    public x(com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, Data> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a a(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.model.n$a r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ boolean b(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.d(r1)
            return r1
    }

    public com.bumptech.glide.load.model.n.a<Data> c(@androidx.annotation.NonNull android.net.Uri r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            com.bumptech.glide.load.model.g r0 = new com.bumptech.glide.load.model.g
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, Data> r2 = r1.a
            com.bumptech.glide.load.model.n$a r2 = r2.a(r0, r3, r4, r5)
            return r2
    }

    public boolean d(@androidx.annotation.NonNull android.net.Uri r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = com.bumptech.glide.load.model.x.b
            java.lang.String r2 = r2.getScheme()
            boolean r2 = r0.contains(r2)
            return r2
    }
}
