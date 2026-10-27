package com.bumptech.glide.load.data.mediastore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements com.bumptech.glide.load.data.d<java.io.InputStream> {
    private static final java.lang.String d = "MediaStoreThumbFetcher";
    private final android.net.Uri a;
    private final com.bumptech.glide.load.data.mediastore.e b;
    private java.io.InputStream c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.bumptech.glide.load.data.mediastore.d {
        private static final java.lang.String[] b = null;
        private static final java.lang.String c = "kind = 1 AND image_id = ?";
        private final android.content.ContentResolver a;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.data.mediastore.c.a.b = r0
                return
        }

        a(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public android.database.Cursor query(android.net.Uri r7) {
                r6 = this;
                java.lang.String r7 = r7.getLastPathSegment()
                android.content.ContentResolver r0 = r6.a
                android.net.Uri r1 = android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI
                java.lang.String[] r2 = com.bumptech.glide.load.data.mediastore.c.a.b
                java.lang.String[] r4 = new java.lang.String[]{r7}
                r5 = 0
                java.lang.String r3 = "kind = 1 AND image_id = ?"
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements com.bumptech.glide.load.data.mediastore.d {
        private static final java.lang.String[] b = null;
        private static final java.lang.String c = "kind = 1 AND video_id = ?";
        private final android.content.ContentResolver a;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.data.mediastore.c.b.b = r0
                return
        }

        b(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public android.database.Cursor query(android.net.Uri r7) {
                r6 = this;
                java.lang.String r7 = r7.getLastPathSegment()
                android.content.ContentResolver r0 = r6.a
                android.net.Uri r1 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI
                java.lang.String[] r2 = com.bumptech.glide.load.data.mediastore.c.b.b
                java.lang.String[] r4 = new java.lang.String[]{r7}
                r5 = 0
                java.lang.String r3 = "kind = 1 AND video_id = ?"
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
                return r7
        }
    }

    @androidx.annotation.VisibleForTesting
    c(android.net.Uri r1, com.bumptech.glide.load.data.mediastore.e r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private static com.bumptech.glide.load.data.mediastore.c d(android.content.Context r3, android.net.Uri r4, com.bumptech.glide.load.data.mediastore.d r5) {
            com.bumptech.glide.b r0 = com.bumptech.glide.b.e(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r0.g()
            com.bumptech.glide.load.data.mediastore.e r1 = new com.bumptech.glide.load.data.mediastore.e
            com.bumptech.glide.b r2 = com.bumptech.glide.b.e(r3)
            com.bumptech.glide.Registry r2 = r2.m()
            java.util.List r2 = r2.g()
            android.content.ContentResolver r3 = r3.getContentResolver()
            r1.<init>(r2, r5, r0, r3)
            com.bumptech.glide.load.data.mediastore.c r3 = new com.bumptech.glide.load.data.mediastore.c
            r3.<init>(r4, r1)
            return r3
    }

    public static com.bumptech.glide.load.data.mediastore.c e(android.content.Context r2, android.net.Uri r3) {
            com.bumptech.glide.load.data.mediastore.c$a r0 = new com.bumptech.glide.load.data.mediastore.c$a
            android.content.ContentResolver r1 = r2.getContentResolver()
            r0.<init>(r1)
            com.bumptech.glide.load.data.mediastore.c r2 = d(r2, r3, r0)
            return r2
    }

    public static com.bumptech.glide.load.data.mediastore.c f(android.content.Context r2, android.net.Uri r3) {
            com.bumptech.glide.load.data.mediastore.c$b r0 = new com.bumptech.glide.load.data.mediastore.c$b
            android.content.ContentResolver r1 = r2.getContentResolver()
            r0.<init>(r1)
            com.bumptech.glide.load.data.mediastore.c r2 = d(r2, r3, r0)
            return r2
    }

    private java.io.InputStream g() throws java.io.FileNotFoundException {
            r4 = this;
            com.bumptech.glide.load.data.mediastore.e r0 = r4.b
            android.net.Uri r1 = r4.a
            java.io.InputStream r0 = r0.d(r1)
            r1 = -1
            if (r0 == 0) goto L14
            com.bumptech.glide.load.data.mediastore.e r2 = r4.b
            android.net.Uri r3 = r4.a
            int r2 = r2.a(r3)
            goto L15
        L14:
            r2 = -1
        L15:
            if (r2 == r1) goto L1d
            com.bumptech.glide.load.data.g r1 = new com.bumptech.glide.load.data.g
            r1.<init>(r0, r2)
            return r1
        L1d:
            return r0
    }

    @Override // com.bumptech.glide.load.data.d
    @androidx.annotation.NonNull
    public java.lang.Class<java.io.InputStream> a() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
            r1 = this;
            java.io.InputStream r0 = r1.c
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            return
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super java.io.InputStream> r4) {
            r2 = this;
            java.io.InputStream r3 = r2.g()     // Catch: java.io.FileNotFoundException -> La
            r2.c = r3     // Catch: java.io.FileNotFoundException -> La
            r4.d(r3)     // Catch: java.io.FileNotFoundException -> La
            return
        La:
            r3 = move-exception
            java.lang.String r0 = "MediaStoreThumbFetcher"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            r4.e(r3)
            return
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.data.d
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.DataSource getDataSource() {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
            return r0
    }
}
