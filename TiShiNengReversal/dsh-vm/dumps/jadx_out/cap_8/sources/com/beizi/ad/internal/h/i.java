package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    private static android.content.Context a;

    /* renamed from: e, reason: collision with root package name */
    private static com.beizi.ad.internal.h.i f6877e;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f6878b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> f6879c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f6880d;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void a(android.graphics.Bitmap r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements java.lang.Runnable {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        android.widget.ImageView f6894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.h.i f6895c;



        public b(com.beizi.ad.internal.h.i r1, java.lang.String r2) {
                r0 = this;
                r0.f6895c = r1
                r0.<init>()
                r0.a = r2
                return
        }

        private android.graphics.Bitmap a() {
                r6 = this;
                java.lang.String r0 = r6.a
                java.lang.String r1 = "/"
                int r1 = r0.lastIndexOf(r1)
                int r1 = r1 + 1
                java.lang.String r0 = r0.substring(r1)
                java.io.File r1 = new java.io.File
                android.content.Context r2 = com.beizi.ad.internal.h.i.a()
                java.io.File r2 = com.beizi.ad.lance.a.h.c(r2)
                java.lang.String r0 = com.beizi.ad.internal.h.f.a(r0)
                r1.<init>(r2, r0)
                boolean r0 = r1.exists()
                if (r0 == 0) goto L38
                long r2 = r1.length()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L38
                java.lang.String r0 = r1.getAbsolutePath()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
                return r0
            L38:
                r0 = 0
                return r0
        }

        private void b() {
                r2 = this;
                com.beizi.ad.internal.h.i r0 = r2.f6895c
                android.os.Handler r0 = com.beizi.ad.internal.h.i.c(r0)
                com.beizi.ad.internal.h.i$b$2 r1 = new com.beizi.ad.internal.h.i$b$2
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        public void a(android.widget.ImageView r3) {
                r2 = this;
                r2.f6894b = r3
                java.lang.String r0 = r2.a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Lb
                return
            Lb:
                com.beizi.ad.internal.h.i r0 = r2.f6895c
                androidx.collection.LruCache r0 = com.beizi.ad.internal.h.i.a(r0)
                java.lang.String r1 = r2.a
                java.lang.Object r0 = r0.get(r1)
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                if (r0 == 0) goto L1f
                r3.setImageBitmap(r0)
                return
            L1f:
                android.graphics.Bitmap r0 = r2.a()
                if (r0 == 0) goto L34
                r3.setImageBitmap(r0)
                com.beizi.ad.internal.h.i r3 = r2.f6895c
                androidx.collection.LruCache r3 = com.beizi.ad.internal.h.i.a(r3)
                java.lang.String r1 = r2.a
                r3.put(r1, r0)
                return
            L34:
                com.beizi.ad.internal.h.i r3 = r2.f6895c
                java.util.concurrent.ExecutorService r3 = com.beizi.ad.internal.h.i.b(r3)
                r3.submit(r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.lang.String r1 = r4.a     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r0.<init>(r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.lang.String r1 = "GET"
                r0.setRequestMethod(r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r1 = 2000(0x7d0, float:2.803E-42)
                r0.setConnectTimeout(r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                int r1 = r0.getResponseCode()     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r2 = 200(0xc8, float:2.8E-43)
                if (r1 != r2) goto L6c
                java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                com.beizi.ad.internal.h.i r1 = r4.f6895c     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                android.os.Handler r1 = com.beizi.ad.internal.h.i.c(r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                com.beizi.ad.internal.h.i$b$1 r2 = new com.beizi.ad.internal.h.i$b$1     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r2.<init>(r4, r0)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r1.post(r2)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                com.beizi.ad.internal.h.i r1 = r4.f6895c     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                androidx.collection.LruCache r1 = com.beizi.ad.internal.h.i.a(r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.lang.String r2 = r4.a     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r1.put(r2, r0)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.lang.String r1 = r4.a     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.lang.String r2 = "/"
                int r2 = r1.lastIndexOf(r2)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                int r2 = r2 + 1
                java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                android.content.Context r3 = com.beizi.ad.internal.h.i.a()     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.io.File r3 = com.beizi.ad.lance.a.h.c(r3)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.lang.String r1 = com.beizi.ad.internal.h.f.a(r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r1.<init>(r2)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                r3 = 100
                r0.compress(r2, r3, r1)     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                return
            L6c:
                r4.b()     // Catch: java.lang.Exception -> L70 java.io.FileNotFoundException -> L73
                return
            L70:
                r4.b()
            L73:
                return
        }
    }

    public i() {
            r2 = this;
            r2.<init>()
            r0 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r2.f6878b = r0
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.<init>(r1)
            r2.f6879c = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f6880d = r0
            return
    }

    static /* synthetic */ android.content.Context a() {
            android.content.Context r0 = com.beizi.ad.internal.h.i.a
            return r0
    }

    static /* synthetic */ androidx.collection.LruCache a(com.beizi.ad.internal.h.i r0) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r0.f6879c
            return r0
    }

    public static com.beizi.ad.internal.h.i a(android.content.Context r1) {
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            if (r0 == 0) goto L11
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()
            android.content.Context r1 = r1.f6837j
            com.beizi.ad.internal.h.i.a = r1
            goto L13
        L11:
            com.beizi.ad.internal.h.i.a = r1
        L13:
            com.beizi.ad.internal.h.i r1 = b()
            return r1
    }

    private static com.beizi.ad.internal.h.i b() {
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.f6877e
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.ad.internal.h.i> r0 = com.beizi.ad.internal.h.i.class
            monitor-enter(r0)
            com.beizi.ad.internal.h.i r1 = com.beizi.ad.internal.h.i.f6877e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.ad.internal.h.i r1 = new com.beizi.ad.internal.h.i     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.ad.internal.h.i.f6877e = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.f6877e
            return r0
    }

    static /* synthetic */ java.util.concurrent.ExecutorService b(com.beizi.ad.internal.h.i r0) {
            java.util.concurrent.ExecutorService r0 = r0.f6878b
            return r0
    }

    static /* synthetic */ android.os.Handler c(com.beizi.ad.internal.h.i r0) {
            android.os.Handler r0 = r0.f6880d
            return r0
    }

    private boolean c() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public com.beizi.ad.internal.h.i.b a(java.lang.String r2) {
            r1 = this;
            com.beizi.ad.internal.h.i$b r0 = new com.beizi.ad.internal.h.i$b
            r0.<init>(r1, r2)
            return r0
    }

    public void a(java.lang.String r7, com.beizi.ad.internal.h.i.a r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            return
        L7:
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r6.f6879c
            java.lang.Object r0 = r0.get(r7)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            r8.a(r0)
            return
        L15:
            java.lang.String r0 = "/"
            int r0 = r7.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r7.substring(r0)
            java.io.File r1 = new java.io.File
            android.content.Context r2 = com.beizi.ad.internal.h.i.a
            java.io.File r2 = com.beizi.ad.lance.a.h.d(r2)
            java.lang.String r0 = com.beizi.ad.internal.h.f.a(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L49
            long r2 = r1.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L49
            java.lang.String r0 = r1.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            goto L4a
        L49:
            r0 = 0
        L4a:
            if (r0 == 0) goto L55
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r1 = r6.f6879c
            r1.put(r7, r0)
            r8.a(r0)
            return
        L55:
            java.util.concurrent.ExecutorService r0 = r6.f6878b
            com.beizi.ad.internal.h.i$1 r1 = new com.beizi.ad.internal.h.i$1
            r1.<init>(r6, r7, r8)
            r0.submit(r1)
            return
    }

    public void a(java.lang.String r7, boolean r8, com.beizi.ad.internal.h.i.a r9) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L8
            goto L83
        L8:
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r6.f6879c
            java.lang.Object r0 = r0.get(r7)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L2f
            if (r8 == 0) goto L2b
            boolean r7 = r6.c()
            if (r7 == 0) goto L1e
            r9.a(r0)
            return
        L1e:
            android.os.Handler r7 = r6.f6880d
            if (r7 == 0) goto L83
            com.beizi.ad.internal.h.i$2 r8 = new com.beizi.ad.internal.h.i$2
            r8.<init>(r6, r9, r0)
            r7.post(r8)
            return
        L2b:
            r9.a(r0)
            return
        L2f:
            java.lang.String r0 = "/"
            int r0 = r7.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r7.substring(r0)
            java.io.File r1 = new java.io.File
            android.content.Context r2 = com.beizi.ad.internal.h.i.a
            java.io.File r2 = com.beizi.ad.lance.a.h.d(r2)
            java.lang.String r0 = com.beizi.ad.internal.h.f.a(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L63
            long r2 = r1.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L63
            java.lang.String r0 = r1.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 == 0) goto L88
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r1 = r6.f6879c
            r1.put(r7, r0)
            if (r8 == 0) goto L84
            boolean r7 = r6.c()
            if (r7 == 0) goto L77
            r9.a(r0)
            return
        L77:
            android.os.Handler r7 = r6.f6880d
            if (r7 == 0) goto L83
            com.beizi.ad.internal.h.i$3 r8 = new com.beizi.ad.internal.h.i$3
            r8.<init>(r6, r9, r0)
            r7.post(r8)
        L83:
            return
        L84:
            r9.a(r0)
            return
        L88:
            java.util.concurrent.ExecutorService r0 = r6.f6878b
            com.beizi.ad.internal.h.i$4 r1 = new com.beizi.ad.internal.h.i$4
            r1.<init>(r6, r7, r8, r9)
            r0.submit(r1)
            return
    }

    public void b(java.lang.String r7, com.beizi.ad.internal.h.i.a r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            return
        L7:
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r6.f6879c
            java.lang.Object r0 = r0.get(r7)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            r8.a(r0)
            return
        L15:
            java.lang.String r0 = "/"
            int r0 = r7.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r7.substring(r0)
            java.io.File r1 = new java.io.File
            android.content.Context r2 = com.beizi.ad.internal.h.i.a
            java.io.File r2 = com.beizi.ad.lance.a.h.c(r2)
            java.lang.String r0 = com.beizi.ad.internal.h.f.a(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L49
            long r2 = r1.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L49
            java.lang.String r0 = r1.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            goto L4a
        L49:
            r0 = 0
        L4a:
            if (r0 == 0) goto L55
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r1 = r6.f6879c
            r1.put(r7, r0)
            r8.a(r0)
            return
        L55:
            java.util.concurrent.ExecutorService r0 = r6.f6878b
            com.beizi.ad.internal.h.i$5 r1 = new com.beizi.ad.internal.h.i$5
            r1.<init>(r6, r7, r8)
            r0.submit(r1)
            return
    }
}
