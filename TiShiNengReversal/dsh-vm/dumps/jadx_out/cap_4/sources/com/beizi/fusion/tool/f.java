package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private static android.content.Context a;
    private static com.beizi.fusion.tool.f e;
    private java.util.concurrent.ExecutorService b;
    private androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> c;
    private android.os.Handler d;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void a(android.graphics.Bitmap r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements java.lang.Runnable {
        java.lang.String a;
        android.widget.ImageView b;
        final /* synthetic */ com.beizi.fusion.tool.f c;



        public b(com.beizi.fusion.tool.f r1, java.lang.String r2) {
                r0 = this;
                r0.c = r1
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
                android.content.Context r2 = com.beizi.fusion.tool.f.a()
                java.io.File r2 = com.beizi.fusion.tool.g.b(r2)
                java.lang.String r0 = com.beizi.fusion.tool.f.b(r0)
                r1.<init>(r2, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "BeiZiImageUtils getBitmapFile file == "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "BeiZis"
                com.beizi.fusion.tool.aa.a(r2, r0)
                boolean r0 = r1.exists()
                if (r0 == 0) goto L4e
                long r2 = r1.length()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L4e
                java.lang.String r0 = r1.getAbsolutePath()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
                return r0
            L4e:
                r0 = 0
                return r0
        }

        private void b() {
                r2 = this;
                com.beizi.fusion.tool.f r0 = r2.c
                android.os.Handler r0 = com.beizi.fusion.tool.f.c(r0)
                com.beizi.fusion.tool.f$b$2 r1 = new com.beizi.fusion.tool.f$b$2
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        public void a(android.widget.ImageView r3) {
                r2 = this;
                r2.b = r3
                java.lang.String r0 = r2.a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Lb
                return
            Lb:
                com.beizi.fusion.tool.f r0 = r2.c
                androidx.collection.LruCache r0 = com.beizi.fusion.tool.f.a(r0)
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
                com.beizi.fusion.tool.f r3 = r2.c
                androidx.collection.LruCache r3 = com.beizi.fusion.tool.f.a(r3)
                java.lang.String r1 = r2.a
                r3.put(r1, r0)
                return
            L34:
                com.beizi.fusion.tool.f r3 = r2.c
                java.util.concurrent.ExecutorService r3 = com.beizi.fusion.tool.f.b(r3)
                r3.submit(r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r1 = r5.a     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r0.<init>(r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r1 = "GET"
                r0.setRequestMethod(r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r1 = 5000(0x1388, float:7.006E-42)
                r0.setConnectTimeout(r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r0.setReadTimeout(r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                int r1 = r0.getResponseCode()     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r2 = 200(0xc8, float:2.8E-43)
                if (r1 != r2) goto L85
                java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                com.beizi.fusion.tool.f r1 = r5.c     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                android.os.Handler r1 = com.beizi.fusion.tool.f.c(r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                com.beizi.fusion.tool.f$b$1 r2 = new com.beizi.fusion.tool.f$b$1     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r2.<init>(r5, r0)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r1.post(r2)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                com.beizi.fusion.tool.f r1 = r5.c     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                androidx.collection.LruCache r1 = com.beizi.fusion.tool.f.a(r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r2 = r5.a     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r1.put(r2, r0)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r1 = r5.a     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r2 = "/"
                int r2 = r1.lastIndexOf(r2)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                int r2 = r2 + 1
                java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                android.content.Context r3 = com.beizi.fusion.tool.f.a()     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.io.File r3 = com.beizi.fusion.tool.g.b(r3)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r1 = com.beizi.fusion.tool.f.b(r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r1 = "BeiZis"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r3.<init>()     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r4 = "BeiZiImageUtils run file == "
                r3.append(r4)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r3.append(r2)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                com.beizi.fusion.tool.aa.a(r1, r3)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r1.<init>(r2)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                r3 = 100
                r0.compress(r2, r3, r1)     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                return
            L85:
                r5.b()     // Catch: java.lang.Exception -> L89 java.io.FileNotFoundException -> L8c
                return
            L89:
                r5.b()
            L8c:
                return
        }
    }

    public f() {
            r2 = this;
            r2.<init>()
            r0 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r2.b = r0
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.<init>(r1)
            r2.c = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.d = r0
            return
    }

    static /* synthetic */ android.content.Context a() {
            android.content.Context r0 = com.beizi.fusion.tool.f.a
            return r0
    }

    static /* synthetic */ androidx.collection.LruCache a(com.beizi.fusion.tool.f r0) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r0.c
            return r0
    }

    public static com.beizi.fusion.tool.f a(android.content.Context r0) {
            if (r0 != 0) goto L8
            java.lang.String r0 = "Illegal Argument: context is null"
            com.beizi.fusion.tool.ap.b(r0)
            goto La
        L8:
            com.beizi.fusion.tool.f.a = r0
        La:
            com.beizi.fusion.tool.f r0 = b()
            return r0
    }

    private static java.lang.String a(byte[] r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L2d
            r4 = r9[r3]
            int r5 = r4 >>> 4
            r5 = r5 & 15
            r6 = 0
        L11:
            if (r5 < 0) goto L1b
            r7 = 9
            if (r5 > r7) goto L1b
            int r5 = r5 + 48
        L19:
            char r5 = (char) r5
            goto L1e
        L1b:
            int r5 = r5 + 87
            goto L19
        L1e:
            r0.append(r5)
            r5 = r4 & 15
            int r7 = r6 + 1
            r8 = 1
            if (r6 < r8) goto L2b
            int r3 = r3 + 1
            goto L8
        L2b:
            r6 = r7
            goto L11
        L2d:
            java.lang.String r9 = r0.toString()
            return r9
    }

    private static com.beizi.fusion.tool.f b() {
            com.beizi.fusion.tool.f r0 = com.beizi.fusion.tool.f.e
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.tool.f> r0 = com.beizi.fusion.tool.f.class
            monitor-enter(r0)
            com.beizi.fusion.tool.f r1 = com.beizi.fusion.tool.f.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.tool.f r1 = new com.beizi.fusion.tool.f     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.tool.f.e = r1     // Catch: java.lang.Throwable -> L13
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
            com.beizi.fusion.tool.f r0 = com.beizi.fusion.tool.f.e
            return r0
    }

    static /* synthetic */ java.lang.String b(java.lang.String r0) {
            java.lang.String r0 = c(r0)
            return r0
    }

    static /* synthetic */ java.util.concurrent.ExecutorService b(com.beizi.fusion.tool.f r0) {
            java.util.concurrent.ExecutorService r0 = r0.b
            return r0
    }

    static /* synthetic */ android.os.Handler c(com.beizi.fusion.tool.f r0) {
            android.os.Handler r0 = r0.d
            return r0
    }

    private static java.lang.String c(java.lang.String r1) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16
            byte[] r1 = r1.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L16
            r0.update(r1)     // Catch: java.security.NoSuchAlgorithmException -> L16
            byte[] r1 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L16
            java.lang.String r1 = a(r1)     // Catch: java.security.NoSuchAlgorithmException -> L16
            return r1
        L16:
            java.lang.String r1 = ""
            return r1
    }

    public com.beizi.fusion.tool.f.b a(java.lang.String r2) {
            r1 = this;
            com.beizi.fusion.tool.f$b r0 = new com.beizi.fusion.tool.f$b
            r0.<init>(r1, r2)
            return r0
    }

    public void a(java.lang.String r7, com.beizi.fusion.tool.f.a r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            return
        L7:
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r6.c
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
            android.content.Context r2 = com.beizi.fusion.tool.f.a
            java.io.File r2 = com.beizi.fusion.tool.g.b(r2)
            java.lang.String r0 = c(r0)
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
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r1 = r6.c
            r1.put(r7, r0)
            r8.a(r0)
            return
        L55:
            java.util.concurrent.ExecutorService r0 = r6.b
            com.beizi.fusion.tool.f$1 r1 = new com.beizi.fusion.tool.f$1
            r1.<init>(r6, r7, r8)
            r0.submit(r1)
            return
    }

    public void b(java.lang.String r7, com.beizi.fusion.tool.f.a r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            return
        L7:
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r6.c
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
            android.content.Context r2 = com.beizi.fusion.tool.f.a
            java.io.File r2 = com.beizi.fusion.tool.g.b(r2)
            java.lang.String r0 = c(r0)
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
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r1 = r6.c
            r1.put(r7, r0)
            r8.a(r0)
            return
        L55:
            java.util.concurrent.ExecutorService r0 = r6.b
            com.beizi.fusion.tool.f$2 r1 = new com.beizi.fusion.tool.f$2
            r1.<init>(r6, r7, r8)
            r0.submit(r1)
            return
    }
}
