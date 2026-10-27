package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class u<Data> implements com.bumptech.glide.load.model.n<java.lang.String, Data> {
    private final com.bumptech.glide.load.model.n<android.net.Uri, Data> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bumptech.glide.load.model.o<java.lang.String, android.content.res.AssetFileDescriptor> {
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
        public com.bumptech.glide.load.model.n<java.lang.String, android.content.res.AssetFileDescriptor> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r4) {
                r3 = this;
                com.bumptech.glide.load.model.u r0 = new com.bumptech.glide.load.model.u
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
                com.bumptech.glide.load.model.n r4 = r4.d(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.bumptech.glide.load.model.o<java.lang.String, android.os.ParcelFileDescriptor> {
        public b() {
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
        public com.bumptech.glide.load.model.n<java.lang.String, android.os.ParcelFileDescriptor> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r4) {
                r3 = this;
                com.bumptech.glide.load.model.u r0 = new com.bumptech.glide.load.model.u
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
                com.bumptech.glide.load.model.n r4 = r4.d(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c implements com.bumptech.glide.load.model.o<java.lang.String, java.io.InputStream> {
        public c() {
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
        public com.bumptech.glide.load.model.n<java.lang.String, java.io.InputStream> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r4) {
                r3 = this;
                com.bumptech.glide.load.model.u r0 = new com.bumptech.glide.load.model.u
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                com.bumptech.glide.load.model.n r4 = r4.d(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    public u(com.bumptech.glide.load.model.n<android.net.Uri, Data> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @androidx.annotation.Nullable
    private static android.net.Uri e(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 0
            char r0 = r2.charAt(r0)
            r1 = 47
            if (r0 != r1) goto L16
            android.net.Uri r2 = f(r2)
            return r2
        L16:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            java.lang.String r1 = r0.getScheme()
            if (r1 != 0) goto L25
            android.net.Uri r2 = f(r2)
            return r2
        L25:
            return r0
    }

    private static android.net.Uri f(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a a(@androidx.annotation.NonNull java.lang.String r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            com.bumptech.glide.load.model.n$a r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ boolean b(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.d(r1)
            return r1
    }

    public com.bumptech.glide.load.model.n.a<Data> c(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            android.net.Uri r2 = e(r2)
            if (r2 == 0) goto L16
            com.bumptech.glide.load.model.n<android.net.Uri, Data> r0 = r1.a
            boolean r0 = r0.b(r2)
            if (r0 != 0) goto Lf
            goto L16
        Lf:
            com.bumptech.glide.load.model.n<android.net.Uri, Data> r0 = r1.a
            com.bumptech.glide.load.model.n$a r2 = r0.a(r2, r3, r4, r5)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public boolean d(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
