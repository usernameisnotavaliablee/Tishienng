package com.bumptech.glide.load.model.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(29)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f<DataT> implements com.bumptech.glide.load.model.n<android.net.Uri, DataT> {
    private final android.content.Context a;
    private final com.bumptech.glide.load.model.n<java.io.File, DataT> b;
    private final com.bumptech.glide.load.model.n<android.net.Uri, DataT> c;
    private final java.lang.Class<DataT> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class a<DataT> implements com.bumptech.glide.load.model.o<android.net.Uri, DataT> {
        private final android.content.Context a;
        private final java.lang.Class<DataT> b;

        a(android.content.Context r1, java.lang.Class<DataT> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public final void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public final com.bumptech.glide.load.model.n<android.net.Uri, DataT> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r6) {
                r5 = this;
                com.bumptech.glide.load.model.stream.f r0 = new com.bumptech.glide.load.model.stream.f
                android.content.Context r1 = r5.a
                java.lang.Class<java.io.File> r2 = java.io.File.class
                java.lang.Class<DataT> r3 = r5.b
                com.bumptech.glide.load.model.n r2 = r6.d(r2, r3)
                java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
                java.lang.Class<DataT> r4 = r5.b
                com.bumptech.glide.load.model.n r6 = r6.d(r3, r4)
                java.lang.Class<DataT> r3 = r5.b
                r0.<init>(r1, r2, r6, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    public static final class b extends com.bumptech.glide.load.model.stream.f.a<android.os.ParcelFileDescriptor> {
        public b(android.content.Context r2) {
                r1 = this;
                java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
                r1.<init>(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    public static final class c extends com.bumptech.glide.load.model.stream.f.a<java.io.InputStream> {
        public c(android.content.Context r2) {
                r1 = this;
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                r1.<init>(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        private static final java.lang.String[] k = null;
        private final android.content.Context a;
        private final com.bumptech.glide.load.model.n<java.io.File, DataT> b;
        private final com.bumptech.glide.load.model.n<android.net.Uri, DataT> c;
        private final android.net.Uri d;
        private final int e;
        private final int f;
        private final com.bumptech.glide.load.f g;
        private final java.lang.Class<DataT> h;
        private volatile boolean i;

        @androidx.annotation.Nullable
        private volatile com.bumptech.glide.load.data.d<DataT> j;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.bumptech.glide.load.model.stream.f.d.k = r0
                return
        }

        d(android.content.Context r1, com.bumptech.glide.load.model.n<java.io.File, DataT> r2, com.bumptech.glide.load.model.n<android.net.Uri, DataT> r3, android.net.Uri r4, int r5, int r6, com.bumptech.glide.load.f r7, java.lang.Class<DataT> r8) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.g = r7
                r0.h = r8
                return
        }

        @androidx.annotation.Nullable
        private com.bumptech.glide.load.model.n.a<DataT> d() throws java.io.FileNotFoundException {
                r5 = this;
                boolean r0 = com.bumptech.glide.load.model.stream.g.a()
                if (r0 == 0) goto L19
                com.bumptech.glide.load.model.n<java.io.File, DataT> r0 = r5.b
                android.net.Uri r1 = r5.d
                java.io.File r1 = r5.g(r1)
                int r2 = r5.e
                int r3 = r5.f
                com.bumptech.glide.load.f r4 = r5.g
                com.bumptech.glide.load.model.n$a r0 = r0.a(r1, r2, r3, r4)
                return r0
            L19:
                boolean r0 = r5.f()
                if (r0 == 0) goto L26
                android.net.Uri r0 = r5.d
                android.net.Uri r0 = com.bumptech.glide.load.model.stream.h.a(r0)
                goto L28
            L26:
                android.net.Uri r0 = r5.d
            L28:
                com.bumptech.glide.load.model.n<android.net.Uri, DataT> r1 = r5.c
                int r2 = r5.e
                int r3 = r5.f
                com.bumptech.glide.load.f r4 = r5.g
                com.bumptech.glide.load.model.n$a r0 = r1.a(r0, r2, r3, r4)
                return r0
        }

        @androidx.annotation.Nullable
        private com.bumptech.glide.load.data.d<DataT> e() throws java.io.FileNotFoundException {
                r1 = this;
                com.bumptech.glide.load.model.n$a r0 = r1.d()
                if (r0 == 0) goto L9
                com.bumptech.glide.load.data.d<Data> r0 = r0.c
                return r0
            L9:
                r0 = 0
                return r0
        }

        private boolean f() {
                r2 = this;
                android.content.Context r0 = r2.a
                java.lang.String r1 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = androidx.core.app.q.a(r0, r1)
                if (r0 != 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        private java.io.File g(android.net.Uri r9) throws java.io.FileNotFoundException {
                r8 = this;
                r1 = 0
                android.content.Context r0 = r8.a     // Catch: java.lang.Throwable -> L32
                android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L32
                java.lang.String[] r4 = com.bumptech.glide.load.model.stream.f.d.k     // Catch: java.lang.Throwable -> L32
                r6 = 0
                r7 = 0
                r5 = 0
                r3 = r9
                android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32
                if (r1 == 0) goto L4c
                boolean r9 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L32
                if (r9 == 0) goto L4c
                java.lang.String r9 = "_data"
                int r9 = r1.getColumnIndexOrThrow(r9)     // Catch: java.lang.Throwable -> L32
                java.lang.String r9 = r1.getString(r9)     // Catch: java.lang.Throwable -> L32
                boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L32
                if (r0 != 0) goto L35
                java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L32
                r0.<init>(r9)     // Catch: java.lang.Throwable -> L32
                r1.close()
                return r0
            L32:
                r0 = move-exception
                r9 = r0
                goto L63
            L35:
                java.io.FileNotFoundException r9 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L32
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
                r0.<init>()     // Catch: java.lang.Throwable -> L32
                java.lang.String r2 = "File path was empty in media store for: "
                r0.append(r2)     // Catch: java.lang.Throwable -> L32
                r0.append(r3)     // Catch: java.lang.Throwable -> L32
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L32
                throw r9     // Catch: java.lang.Throwable -> L32
            L4c:
                java.io.FileNotFoundException r9 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L32
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
                r0.<init>()     // Catch: java.lang.Throwable -> L32
                java.lang.String r2 = "Failed to media store entry for: "
                r0.append(r2)     // Catch: java.lang.Throwable -> L32
                r0.append(r3)     // Catch: java.lang.Throwable -> L32
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L32
                throw r9     // Catch: java.lang.Throwable -> L32
            L63:
                if (r1 == 0) goto L68
                r1.close()
            L68:
                throw r9
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public java.lang.Class<DataT> a() {
                r1 = this;
                java.lang.Class<DataT> r0 = r1.h
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r1 = this;
                com.bumptech.glide.load.data.d<DataT> r0 = r1.j
                if (r0 == 0) goto L7
                r0.b()
            L7:
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super DataT> r4) {
                r2 = this;
                com.bumptech.glide.load.data.d r0 = r2.e()     // Catch: java.io.FileNotFoundException -> L22
                if (r0 != 0) goto L24
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.io.FileNotFoundException -> L22
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L22
                r0.<init>()     // Catch: java.io.FileNotFoundException -> L22
                java.lang.String r1 = "Failed to build fetcher for: "
                r0.append(r1)     // Catch: java.io.FileNotFoundException -> L22
                android.net.Uri r1 = r2.d     // Catch: java.io.FileNotFoundException -> L22
                r0.append(r1)     // Catch: java.io.FileNotFoundException -> L22
                java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> L22
                r3.<init>(r0)     // Catch: java.io.FileNotFoundException -> L22
                r4.e(r3)     // Catch: java.io.FileNotFoundException -> L22
                return
            L22:
                r3 = move-exception
                goto L32
            L24:
                r2.j = r0     // Catch: java.io.FileNotFoundException -> L22
                boolean r1 = r2.i     // Catch: java.io.FileNotFoundException -> L22
                if (r1 == 0) goto L2e
                r2.cancel()     // Catch: java.io.FileNotFoundException -> L22
                return
            L2e:
                r0.c(r3, r4)     // Catch: java.io.FileNotFoundException -> L22
                return
            L32:
                r4.e(r3)
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.i = r0
                com.bumptech.glide.load.data.d<DataT> r0 = r1.j
                if (r0 == 0) goto La
                r0.cancel()
            La:
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

    f(android.content.Context r1, com.bumptech.glide.load.model.n<java.io.File, DataT> r2, com.bumptech.glide.load.model.n<android.net.Uri, DataT> r3, java.lang.Class<DataT> r4) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
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

    public com.bumptech.glide.load.model.n.a<DataT> c(@androidx.annotation.NonNull android.net.Uri r12, int r13, int r14, @androidx.annotation.NonNull com.bumptech.glide.load.f r15) {
            r11 = this;
            com.bumptech.glide.load.model.n$a r0 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r1 = new com.bumptech.glide.signature.e
            r1.<init>(r12)
            com.bumptech.glide.load.model.stream.f$d r2 = new com.bumptech.glide.load.model.stream.f$d
            android.content.Context r3 = r11.a
            com.bumptech.glide.load.model.n<java.io.File, DataT> r4 = r11.b
            com.bumptech.glide.load.model.n<android.net.Uri, DataT> r5 = r11.c
            java.lang.Class<DataT> r10 = r11.d
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.<init>(r1, r2)
            return r0
    }

    public boolean d(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            boolean r3 = com.bumptech.glide.load.data.mediastore.b.b(r3)
            if (r3 == 0) goto Le
            r3 = 1
            return r3
        Le:
            r3 = 0
            return r3
    }
}
