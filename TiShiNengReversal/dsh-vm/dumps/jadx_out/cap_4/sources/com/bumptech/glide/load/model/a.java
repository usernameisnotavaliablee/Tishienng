package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a<Data> implements com.bumptech.glide.load.model.n<android.net.Uri, Data> {
    private static final java.lang.String c = "android_asset";
    private static final java.lang.String d = "file:///android_asset/";
    private static final int e = 22;
    private final android.content.res.AssetManager a;
    private final com.bumptech.glide.load.model.a.InterfaceC0027a<Data> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    public interface InterfaceC0027a<Data> {
        com.bumptech.glide.load.data.d<Data> a(android.content.res.AssetManager r1, java.lang.String r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.bumptech.glide.load.model.o<android.net.Uri, android.os.ParcelFileDescriptor>, com.bumptech.glide.load.model.a.InterfaceC0027a<android.os.ParcelFileDescriptor> {
        private final android.content.res.AssetManager a;

        public b(android.content.res.AssetManager r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0027a
        public com.bumptech.glide.load.data.d<android.os.ParcelFileDescriptor> a(android.content.res.AssetManager r2, java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.data.h r0 = new com.bumptech.glide.load.data.h
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<android.net.Uri, android.os.ParcelFileDescriptor> c(com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.a r2 = new com.bumptech.glide.load.model.a
                android.content.res.AssetManager r0 = r1.a
                r2.<init>(r0, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c implements com.bumptech.glide.load.model.o<android.net.Uri, java.io.InputStream>, com.bumptech.glide.load.model.a.InterfaceC0027a<java.io.InputStream> {
        private final android.content.res.AssetManager a;

        public c(android.content.res.AssetManager r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0027a
        public com.bumptech.glide.load.data.d<java.io.InputStream> a(android.content.res.AssetManager r2, java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.data.m r0 = new com.bumptech.glide.load.data.m
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<android.net.Uri, java.io.InputStream> c(com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.a r2 = new com.bumptech.glide.load.model.a
                android.content.res.AssetManager r0 = r1.a
                r2.<init>(r0, r1)
                return r2
        }
    }

    static {
            return
    }

    public a(android.content.res.AssetManager r1, com.bumptech.glide.load.model.a.InterfaceC0027a<Data> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
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
            java.lang.String r3 = r2.toString()
            int r4 = com.bumptech.glide.load.model.a.e
            java.lang.String r3 = r3.substring(r4)
            com.bumptech.glide.load.model.n$a r4 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r5 = new com.bumptech.glide.signature.e
            r5.<init>(r2)
            com.bumptech.glide.load.model.a$a<Data> r2 = r1.b
            android.content.res.AssetManager r0 = r1.a
            com.bumptech.glide.load.data.d r2 = r2.a(r0, r3)
            r4.<init>(r5, r2)
            return r4
    }

    public boolean d(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = "file"
            java.lang.String r1 = r3.getScheme()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L29
            java.util.List r0 = r3.getPathSegments()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            java.util.List r3 = r3.getPathSegments()
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r0 = "android_asset"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L29
            r3 = 1
            return r3
        L29:
            return r1
    }
}
