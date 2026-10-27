package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k implements com.bumptech.glide.load.model.n<android.net.Uri, java.io.File> {
    private final android.content.Context a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bumptech.glide.load.model.o<android.net.Uri, java.io.File> {
        private final android.content.Context a;

        public a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<android.net.Uri, java.io.File> c(com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.k r2 = new com.bumptech.glide.load.model.k
                android.content.Context r0 = r1.a
                r2.<init>(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements com.bumptech.glide.load.data.d<java.io.File> {
        private static final java.lang.String[] c = null;
        private final android.content.Context a;
        private final android.net.Uri b;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.model.k.b.c = r0
                return
        }

        b(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public java.lang.Class<java.io.File> a() {
                r1 = this;
                java.lang.Class<java.io.File> r0 = java.io.File.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r7, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super java.io.File> r8) {
                r6 = this;
                android.content.Context r7 = r6.a
                android.content.ContentResolver r0 = r7.getContentResolver()
                android.net.Uri r1 = r6.b
                java.lang.String[] r2 = com.bumptech.glide.load.model.k.b.c
                r4 = 0
                r5 = 0
                r3 = 0
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
                r0 = 0
                if (r7 == 0) goto L30
                boolean r1 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L25
                if (r1 == 0) goto L28
                java.lang.String r0 = "_data"
                int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L25
                java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L25
                goto L28
            L25:
                r0 = move-exception
                r8 = r0
                goto L2c
            L28:
                r7.close()
                goto L30
            L2c:
                r7.close()
                throw r8
            L30:
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                if (r7 == 0) goto L52
                java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find file path for: "
                r0.append(r1)
                android.net.Uri r1 = r6.b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                r8.e(r7)
                return
            L52:
                java.io.File r7 = new java.io.File
                r7.<init>(r0)
                r8.d(r7)
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

    public k(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a<java.io.File> a(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
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

    public com.bumptech.glide.load.model.n.a<java.io.File> c(@androidx.annotation.NonNull android.net.Uri r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            com.bumptech.glide.load.model.n$a r3 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r4 = new com.bumptech.glide.signature.e
            r4.<init>(r2)
            com.bumptech.glide.load.model.k$b r5 = new com.bumptech.glide.load.model.k$b
            android.content.Context r0 = r1.a
            r5.<init>(r0, r2)
            r3.<init>(r4, r5)
            return r3
    }

    public boolean d(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.load.data.mediastore.b.b(r1)
            return r1
    }
}
