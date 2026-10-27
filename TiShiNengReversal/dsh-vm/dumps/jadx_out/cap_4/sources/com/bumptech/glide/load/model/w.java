package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w<Data> implements com.bumptech.glide.load.model.n<android.net.Uri, Data> {
    private static final java.util.Set<java.lang.String> b = null;
    private final com.bumptech.glide.load.model.w.c<Data> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bumptech.glide.load.model.o<android.net.Uri, android.content.res.AssetFileDescriptor>, com.bumptech.glide.load.model.w.c<android.content.res.AssetFileDescriptor> {
        private final android.content.ContentResolver a;

        public a(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<android.content.res.AssetFileDescriptor> a(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.a r0 = new com.bumptech.glide.load.data.a
                android.content.ContentResolver r1 = r2.a
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public com.bumptech.glide.load.model.n<android.net.Uri, android.content.res.AssetFileDescriptor> c(com.bumptech.glide.load.model.r r1) {
                r0 = this;
                com.bumptech.glide.load.model.w r1 = new com.bumptech.glide.load.model.w
                r1.<init>(r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.bumptech.glide.load.model.o<android.net.Uri, android.os.ParcelFileDescriptor>, com.bumptech.glide.load.model.w.c<android.os.ParcelFileDescriptor> {
        private final android.content.ContentResolver a;

        public b(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<android.os.ParcelFileDescriptor> a(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.i r0 = new com.bumptech.glide.load.data.i
                android.content.ContentResolver r1 = r2.a
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<android.net.Uri, android.os.ParcelFileDescriptor> c(com.bumptech.glide.load.model.r r1) {
                r0 = this;
                com.bumptech.glide.load.model.w r1 = new com.bumptech.glide.load.model.w
                r1.<init>(r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(android.net.Uri r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d implements com.bumptech.glide.load.model.o<android.net.Uri, java.io.InputStream>, com.bumptech.glide.load.model.w.c<java.io.InputStream> {
        private final android.content.ContentResolver a;

        public d(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<java.io.InputStream> a(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.n r0 = new com.bumptech.glide.load.data.n
                android.content.ContentResolver r1 = r2.a
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<android.net.Uri, java.io.InputStream> c(com.bumptech.glide.load.model.r r1) {
                r0 = this;
                com.bumptech.glide.load.model.w r1 = new com.bumptech.glide.load.model.w
                r1.<init>(r0)
                return r1
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "android.resource"
            java.lang.String r2 = "content"
            java.lang.String r3 = "file"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.model.w.b = r0
            return
    }

    public w(com.bumptech.glide.load.model.w.c<Data> r1) {
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

    public com.bumptech.glide.load.model.n.a<Data> c(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            com.bumptech.glide.load.model.n$a r2 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r3 = new com.bumptech.glide.signature.e
            r3.<init>(r1)
            com.bumptech.glide.load.model.w$c<Data> r4 = r0.a
            com.bumptech.glide.load.data.d r1 = r4.a(r1)
            r2.<init>(r3, r1)
            return r2
    }

    public boolean d(@androidx.annotation.NonNull android.net.Uri r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = com.bumptech.glide.load.model.w.b
            java.lang.String r2 = r2.getScheme()
            boolean r2 = r0.contains(r2)
            return r2
    }
}
