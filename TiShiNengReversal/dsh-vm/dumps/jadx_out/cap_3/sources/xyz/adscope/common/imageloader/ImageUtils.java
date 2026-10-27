package xyz.adscope.common.imageloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ImageUtils {
    private static xyz.adscope.common.imageloader.ImageUtils d;
    private java.util.concurrent.ExecutorService a;
    private android.util.LruCache<java.lang.String, android.graphics.Bitmap> b;
    private android.os.Handler c;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface BitmapLoadedListener {
        void onBitmapLoadFailed();

        void onBitmapLoaded(android.graphics.Bitmap r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class RequestCreatorRunnble implements java.lang.Runnable {
        java.lang.String a;
        int b;
        int c;
        android.widget.ImageView d;
        xyz.adscope.common.imageloader.inter.IImageLoaderCallback e;
        final /* synthetic */ xyz.adscope.common.imageloader.ImageUtils f;



        public RequestCreatorRunnble(xyz.adscope.common.imageloader.ImageUtils r1, java.lang.String r2) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                r0.a = r2
                return
        }

        private android.graphics.Bitmap a(android.content.Context r7) {
                r6 = this;
                java.lang.String r0 = r6.a
                java.lang.String r1 = "/"
                int r1 = r0.lastIndexOf(r1)
                int r1 = r1 + 1
                java.lang.String r0 = r0.substring(r1)
                java.io.File r1 = new java.io.File
                java.io.File r7 = xyz.adscope.common.imageloader.StorageUtils.getCacheDirectory(r7)
                java.lang.String r0 = xyz.adscope.common.imageloader.ImageUtils.a(r0)
                r1.<init>(r7, r0)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "BeiZiImageUtils getBitmapFile file == "
                r7.append(r0)
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                java.lang.String r0 = "BeiZiImageUtils"
                xyz.adscope.common.tool.LogUtil.d(r0, r7)
                boolean r7 = r1.exists()
                if (r7 == 0) goto L4a
                long r2 = r1.length()
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 <= 0) goto L4a
                java.lang.String r7 = r1.getAbsolutePath()
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r7)
                return r7
            L4a:
                r7 = 0
                return r7
        }

        private void a() {
                r2 = this;
                xyz.adscope.common.imageloader.ImageUtils r0 = r2.f
                android.os.Handler r0 = xyz.adscope.common.imageloader.ImageUtils.c(r0)
                xyz.adscope.common.imageloader.ImageUtils$RequestCreatorRunnble$2 r1 = new xyz.adscope.common.imageloader.ImageUtils$RequestCreatorRunnble$2
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        public xyz.adscope.common.imageloader.ImageUtils.RequestCreatorRunnble callback(xyz.adscope.common.imageloader.inter.IImageLoaderCallback r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public xyz.adscope.common.imageloader.ImageUtils.RequestCreatorRunnble error(int r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public void into(android.widget.ImageView r3) {
                r2 = this;
                r2.d = r3
                java.lang.String r0 = r2.a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Lb
                goto L45
            Lb:
                xyz.adscope.common.imageloader.ImageUtils r0 = r2.f
                android.util.LruCache r0 = xyz.adscope.common.imageloader.ImageUtils.a(r0)
                java.lang.String r1 = r2.a
                java.lang.Object r0 = r0.get(r1)
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                if (r0 == 0) goto L26
                r3.setImageBitmap(r0)
                xyz.adscope.common.imageloader.inter.IImageLoaderCallback r3 = r2.e
                if (r3 == 0) goto L45
                r3.successCallback(r0)
                return
            L26:
                android.content.Context r0 = r3.getContext()
                android.graphics.Bitmap r0 = r2.a(r0)
                if (r0 == 0) goto L46
                r3.setImageBitmap(r0)
                xyz.adscope.common.imageloader.ImageUtils r3 = r2.f
                android.util.LruCache r3 = xyz.adscope.common.imageloader.ImageUtils.a(r3)
                java.lang.String r1 = r2.a
                r3.put(r1, r0)
                xyz.adscope.common.imageloader.inter.IImageLoaderCallback r3 = r2.e
                if (r3 == 0) goto L45
                r3.successCallback(r0)
            L45:
                return
            L46:
                xyz.adscope.common.imageloader.ImageUtils r3 = r2.f
                java.util.concurrent.ExecutorService r3 = xyz.adscope.common.imageloader.ImageUtils.b(r3)
                r3.submit(r2)
                return
        }

        public xyz.adscope.common.imageloader.ImageUtils.RequestCreatorRunnble placeholder(int r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.String r0 = "BeiZiImageUtils"
                xyz.adscope.common.imageloader.ImageUtils r1 = r5.f     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.String r2 = r5.a     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.net.HttpURLConnection r1 = xyz.adscope.common.imageloader.ImageUtils.a(r1, r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                int r2 = r1.getResponseCode()     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 != r3) goto L80
                java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                xyz.adscope.common.imageloader.ImageUtils r2 = r5.f     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                android.os.Handler r2 = xyz.adscope.common.imageloader.ImageUtils.c(r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                xyz.adscope.common.imageloader.ImageUtils$RequestCreatorRunnble$1 r3 = new xyz.adscope.common.imageloader.ImageUtils$RequestCreatorRunnble$1     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r3.<init>(r5, r1)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r2.post(r3)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                xyz.adscope.common.imageloader.ImageUtils r2 = r5.f     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                android.util.LruCache r2 = xyz.adscope.common.imageloader.ImageUtils.a(r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.String r3 = r5.a     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r2.put(r3, r1)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.String r2 = r5.a     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.String r3 = "/"
                int r3 = r2.lastIndexOf(r3)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                int r3 = r3 + 1
                java.lang.String r2 = r2.substring(r3)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                android.widget.ImageView r4 = r5.d     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                android.content.Context r4 = r4.getContext()     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.io.File r4 = xyz.adscope.common.imageloader.StorageUtils.getCacheDirectory(r4)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.String r2 = xyz.adscope.common.imageloader.ImageUtils.a(r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r3.<init>(r4, r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r2.<init>()     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.String r4 = "BeiZiImageUtils run file == "
                r2.append(r4)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r2.append(r3)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                xyz.adscope.common.tool.LogUtil.d(r0, r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r2.<init>(r3)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                r4 = 100
                r1.compress(r3, r4, r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                xyz.adscope.common.imageloader.inter.IImageLoaderCallback r2 = r5.e     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                if (r2 == 0) goto Ldd
                r2.successCallback(r1)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                return
            L7c:
                r1 = move-exception
                goto L8d
            L7e:
                r0 = move-exception
                goto Lc1
            L80:
                r5.a()     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                xyz.adscope.common.imageloader.inter.IImageLoaderCallback r1 = r5.e     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                if (r1 == 0) goto Ldd
                java.lang.String r2 = "net error"
                r1.failCallback(r2)     // Catch: java.lang.Exception -> L7c java.io.FileNotFoundException -> L7e
                return
            L8d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "e : "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                xyz.adscope.common.tool.LogUtil.e(r0, r2)
                r5.a()
                xyz.adscope.common.imageloader.inter.IImageLoaderCallback r0 = r5.e
                if (r0 == 0) goto Ldd
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "exception "
                r2.append(r3)
                java.lang.String r1 = r1.toString()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.failCallback(r1)
                goto Ldd
            Lc1:
                xyz.adscope.common.imageloader.inter.IImageLoaderCallback r1 = r5.e
                if (r1 == 0) goto Ldd
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fileNotFound "
                r2.append(r3)
                java.lang.String r0 = r0.toString()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.failCallback(r0)
            Ldd:
                return
        }
    }

    public ImageUtils() {
            r2 = this;
            r2.<init>()
            r0 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r2.a = r0
            android.util.LruCache r0 = new android.util.LruCache
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.<init>(r1)
            r2.b = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.c = r0
            return
    }

    static /* synthetic */ android.util.LruCache a(xyz.adscope.common.imageloader.ImageUtils r0) {
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r0.b
            return r0
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            java.lang.String r0 = b(r0)
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

    static /* synthetic */ java.net.HttpURLConnection a(xyz.adscope.common.imageloader.ImageUtils r0, java.lang.String r1) {
            java.net.HttpURLConnection r0 = r0.c(r1)
            return r0
    }

    private static xyz.adscope.common.imageloader.ImageUtils a() {
            xyz.adscope.common.imageloader.ImageUtils r0 = xyz.adscope.common.imageloader.ImageUtils.d
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.common.imageloader.ImageUtils> r0 = xyz.adscope.common.imageloader.ImageUtils.class
            monitor-enter(r0)
            xyz.adscope.common.imageloader.ImageUtils r1 = xyz.adscope.common.imageloader.ImageUtils.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.common.imageloader.ImageUtils r1 = new xyz.adscope.common.imageloader.ImageUtils     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.common.imageloader.ImageUtils.d = r1     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.common.imageloader.ImageUtils r0 = xyz.adscope.common.imageloader.ImageUtils.d
            return r0
    }

    private static java.lang.String b(java.lang.String r1) {
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

    static /* synthetic */ java.util.concurrent.ExecutorService b(xyz.adscope.common.imageloader.ImageUtils r0) {
            java.util.concurrent.ExecutorService r0 = r0.a
            return r0
    }

    static /* synthetic */ android.os.Handler c(xyz.adscope.common.imageloader.ImageUtils r0) {
            android.os.Handler r0 = r0.c
            return r0
    }

    private java.net.HttpURLConnection c(java.lang.String r3) {
            r2 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L2c
            r0.<init>(r3)     // Catch: java.lang.Exception -> L2c
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Exception -> L2c
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Exception -> L2c
            r1 = 5000(0x1388, float:7.006E-42)
            r0.setConnectTimeout(r1)     // Catch: java.lang.Exception -> L2c
            r0.setReadTimeout(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = xyz.adscope.common.constants.CommonConstants.HTTPS_PREFIX     // Catch: java.lang.Exception -> L2c
            boolean r3 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L2e
            r3 = r0
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Exception -> L2c
            xyz.adscope.common.network.ssl.TLSSocketFactory r1 = new xyz.adscope.common.network.ssl.TLSSocketFactory     // Catch: java.lang.Exception -> L2c
            r1.<init>()     // Catch: java.lang.Exception -> L2c
            r3.setSSLSocketFactory(r1)     // Catch: java.lang.Exception -> L2c
            return r0
        L2c:
            r3 = move-exception
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception e : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BeiZiImageUtils"
            xyz.adscope.common.tool.LogUtil.e(r0, r3)
            r3 = 0
            return r3
    }

    public static xyz.adscope.common.imageloader.ImageUtils with() {
            xyz.adscope.common.imageloader.ImageUtils r0 = a()
            return r0
    }

    public void getBitmap(android.content.Context r2, java.lang.String r3, xyz.adscope.common.imageloader.ImageUtils.BitmapLoadedListener r4) {
            r1 = this;
            r0 = 1
            r1.getBitmap(r2, r3, r0, r4)
            return
    }

    public void getBitmap(android.content.Context r8, java.lang.String r9, boolean r10, xyz.adscope.common.imageloader.ImageUtils.BitmapLoadedListener r11) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L7
            return
        L7:
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r7.b
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            r11.onBitmapLoaded(r0)
            return
        L15:
            java.lang.String r0 = "/"
            int r0 = r9.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r9.substring(r0)
            xyz.adscope.common.cache.CacheManager r1 = xyz.adscope.common.cache.CacheManager.getInstance(r8)
            android.graphics.Bitmap r0 = r1.getBitmapByFileName(r0, r10)
            if (r0 == 0) goto L34
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r8 = r7.b
            r8.put(r9, r0)
            r11.onBitmapLoaded(r0)
            return
        L34:
            java.util.concurrent.ExecutorService r0 = r7.a
            xyz.adscope.common.imageloader.ImageUtils$1 r1 = new xyz.adscope.common.imageloader.ImageUtils$1
            r2 = r7
            r5 = r8
            r3 = r9
            r6 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.submit(r1)
            return
    }

    public void getCacheBitmap(android.content.Context r3, java.lang.String r4, boolean r5, xyz.adscope.common.imageloader.ImageUtils.BitmapLoadedListener r6) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r2.b
            java.lang.Object r0 = r0.get(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            r6.onBitmapLoaded(r0)
            return
        L15:
            java.lang.String r0 = "/"
            int r0 = r4.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r4.substring(r0)
            xyz.adscope.common.cache.CacheManager r1 = xyz.adscope.common.cache.CacheManager.getInstance(r3)
            android.graphics.Bitmap r0 = r1.getBitmapByFileName(r0, r5)
            if (r0 == 0) goto L34
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r3 = r2.b
            r3.put(r4, r0)
            r6.onBitmapLoaded(r0)
            return
        L34:
            java.util.concurrent.ExecutorService r6 = r2.a
            xyz.adscope.common.imageloader.ImageUtils$2 r0 = new xyz.adscope.common.imageloader.ImageUtils$2
            r0.<init>(r2, r4, r3, r5)
            r6.submit(r0)
            return
    }

    public xyz.adscope.common.imageloader.ImageUtils.RequestCreatorRunnble load(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.imageloader.ImageUtils$RequestCreatorRunnble r0 = new xyz.adscope.common.imageloader.ImageUtils$RequestCreatorRunnble
            r0.<init>(r1, r2)
            return r0
    }
}
