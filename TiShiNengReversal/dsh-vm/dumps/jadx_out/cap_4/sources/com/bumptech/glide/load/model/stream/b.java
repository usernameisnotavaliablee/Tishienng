package com.bumptech.glide.load.model.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> {
    public static final com.bumptech.glide.load.e<java.lang.Integer> b = null;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.model.m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.bumptech.glide.load.model.o<com.bumptech.glide.load.model.g, java.io.InputStream> {
        private final com.bumptech.glide.load.model.m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> a;

        public a() {
                r3 = this;
                r3.<init>()
                com.bumptech.glide.load.model.m r0 = new com.bumptech.glide.load.model.m
                r1 = 500(0x1f4, double:2.47E-321)
                r0.<init>(r1)
                r3.a = r0
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> c(com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.stream.b r2 = new com.bumptech.glide.load.model.stream.b
                com.bumptech.glide.load.model.m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> r0 = r1.a
                r2.<init>(r0)
                return r2
        }
    }

    static {
            r0 = 2500(0x9c4, float:3.503E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.g(r1, r0)
            com.bumptech.glide.load.model.stream.b.b = r0
            return
    }

    public b() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public b(@androidx.annotation.Nullable com.bumptech.glide.load.model.m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a<java.io.InputStream> a(@androidx.annotation.NonNull com.bumptech.glide.load.model.g r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            com.bumptech.glide.load.model.g r1 = (com.bumptech.glide.load.model.g) r1
            com.bumptech.glide.load.model.n$a r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ boolean b(@androidx.annotation.NonNull com.bumptech.glide.load.model.g r1) {
            r0 = this;
            com.bumptech.glide.load.model.g r1 = (com.bumptech.glide.load.model.g) r1
            boolean r1 = r0.d(r1)
            return r1
    }

    public com.bumptech.glide.load.model.n.a<java.io.InputStream> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.g r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            com.bumptech.glide.load.model.m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> r2 = r0.a
            if (r2 == 0) goto L14
            r3 = 0
            java.lang.Object r2 = r2.b(r1, r3, r3)
            com.bumptech.glide.load.model.g r2 = (com.bumptech.glide.load.model.g) r2
            if (r2 != 0) goto L13
            com.bumptech.glide.load.model.m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> r2 = r0.a
            r2.c(r1, r3, r3, r1)
            goto L14
        L13:
            r1 = r2
        L14:
            com.bumptech.glide.load.e<java.lang.Integer> r2 = com.bumptech.glide.load.model.stream.b.b
            java.lang.Object r2 = r4.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.bumptech.glide.load.model.n$a r3 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.load.data.j r4 = new com.bumptech.glide.load.data.j
            r4.<init>(r1, r2)
            r3.<init>(r1, r4)
            return r3
    }

    public boolean d(@androidx.annotation.NonNull com.bumptech.glide.load.model.g r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
