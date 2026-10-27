package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j implements com.bumptech.glide.load.data.d<java.io.InputStream> {
    private static final java.lang.String g = "HttpUrlFetcher";
    private static final int h = 5;

    @androidx.annotation.VisibleForTesting
    static final java.lang.String i = "Location";

    @androidx.annotation.VisibleForTesting
    static final com.bumptech.glide.load.data.j.b j = null;

    @androidx.annotation.VisibleForTesting
    static final int k = -1;
    private final com.bumptech.glide.load.model.g a;
    private final int b;
    private final com.bumptech.glide.load.data.j.b c;
    private java.net.HttpURLConnection d;
    private java.io.InputStream e;
    private volatile boolean f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements com.bumptech.glide.load.data.j.b {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.j.b
        public java.net.HttpURLConnection a(java.net.URL r1) throws java.io.IOException {
                r0 = this;
                java.net.URLConnection r1 = r1.openConnection()
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface b {
        java.net.HttpURLConnection a(java.net.URL r1) throws java.io.IOException;
    }

    static {
            com.bumptech.glide.load.data.j$a r0 = new com.bumptech.glide.load.data.j$a
            r0.<init>()
            com.bumptech.glide.load.data.j.j = r0
            return
    }

    public j(com.bumptech.glide.load.model.g r2, int r3) {
            r1 = this;
            com.bumptech.glide.load.data.j$b r0 = com.bumptech.glide.load.data.j.j
            r1.<init>(r2, r3, r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    j(com.bumptech.glide.load.model.g r1, int r2, com.bumptech.glide.load.data.j.b r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    private java.net.HttpURLConnection d(java.net.URL r4, java.util.Map<java.lang.String, java.lang.String> r5) throws com.bumptech.glide.load.HttpException {
            r3 = this;
            r0 = 0
            com.bumptech.glide.load.data.j$b r1 = r3.c     // Catch: java.io.IOException -> L40
            java.net.HttpURLConnection r4 = r1.a(r4)     // Catch: java.io.IOException -> L40
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r4.addRequestProperty(r2, r1)
            goto Lf
        L2b:
            int r5 = r3.b
            r4.setConnectTimeout(r5)
            int r5 = r3.b
            r4.setReadTimeout(r5)
            r4.setUseCaches(r0)
            r5 = 1
            r4.setDoInput(r5)
            r4.setInstanceFollowRedirects(r0)
            return r4
        L40:
            r4 = move-exception
            com.bumptech.glide.load.HttpException r5 = new com.bumptech.glide.load.HttpException
            java.lang.String r1 = "URL.openConnection threw"
            r5.<init>(r1, r0, r4)
            throw r5
    }

    private static int e(java.net.HttpURLConnection r1) {
            int r1 = r1.getResponseCode()     // Catch: java.io.IOException -> L5
            return r1
        L5:
            java.lang.String r1 = "HttpUrlFetcher"
            r0 = 3
            android.util.Log.isLoggable(r1, r0)
            r1 = -1
            return r1
    }

    private java.io.InputStream f(java.net.HttpURLConnection r5) throws com.bumptech.glide.load.HttpException {
            r4 = this;
            java.lang.String r0 = r5.getContentEncoding()     // Catch: java.io.IOException -> L1a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.IOException -> L1a
            if (r0 == 0) goto L1c
            int r0 = r5.getContentLength()     // Catch: java.io.IOException -> L1a
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.io.IOException -> L1a
            long r2 = (long) r0     // Catch: java.io.IOException -> L1a
            java.io.InputStream r0 = com.bumptech.glide.util.b.b(r1, r2)     // Catch: java.io.IOException -> L1a
            r4.e = r0     // Catch: java.io.IOException -> L1a
            goto L2e
        L1a:
            r0 = move-exception
            goto L31
        L1c:
            java.lang.String r0 = "HttpUrlFetcher"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.io.IOException -> L1a
            if (r0 == 0) goto L28
            r5.getContentEncoding()     // Catch: java.io.IOException -> L1a
        L28:
            java.io.InputStream r0 = r5.getInputStream()     // Catch: java.io.IOException -> L1a
            r4.e = r0     // Catch: java.io.IOException -> L1a
        L2e:
            java.io.InputStream r5 = r4.e
            return r5
        L31:
            com.bumptech.glide.load.HttpException r1 = new com.bumptech.glide.load.HttpException
            java.lang.String r2 = "Failed to obtain InputStream"
            int r5 = e(r5)
            r1.<init>(r2, r5, r0)
            throw r1
    }

    private static boolean g(int r1) {
            int r1 = r1 / 100
            r0 = 2
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private static boolean h(int r1) {
            int r1 = r1 / 100
            r0 = 3
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private java.io.InputStream i(java.net.URL r3, int r4, java.net.URL r5, java.util.Map<java.lang.String, java.lang.String> r6) throws com.bumptech.glide.load.HttpException {
            r2 = this;
            r0 = 5
            r1 = -1
            if (r4 >= r0) goto Lb6
            if (r5 == 0) goto L1d
            java.net.URI r0 = r3.toURI()     // Catch: java.net.URISyntaxException -> L1d
            java.net.URI r5 = r5.toURI()     // Catch: java.net.URISyntaxException -> L1d
            boolean r5 = r0.equals(r5)     // Catch: java.net.URISyntaxException -> L1d
            if (r5 != 0) goto L15
            goto L1d
        L15:
            com.bumptech.glide.load.HttpException r5 = new com.bumptech.glide.load.HttpException     // Catch: java.net.URISyntaxException -> L1d
            java.lang.String r0 = "In re-direct loop"
            r5.<init>(r0, r1)     // Catch: java.net.URISyntaxException -> L1d
            throw r5     // Catch: java.net.URISyntaxException -> L1d
        L1d:
            java.net.HttpURLConnection r5 = r2.d(r3, r6)
            r2.d = r5
            r5.connect()     // Catch: java.io.IOException -> La7
            java.net.HttpURLConnection r5 = r2.d     // Catch: java.io.IOException -> La7
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.io.IOException -> La7
            r2.e = r5     // Catch: java.io.IOException -> La7
            boolean r5 = r2.f
            if (r5 == 0) goto L34
            r3 = 0
            return r3
        L34:
            java.net.HttpURLConnection r5 = r2.d
            int r5 = e(r5)
            boolean r0 = g(r5)
            if (r0 == 0) goto L47
            java.net.HttpURLConnection r3 = r2.d
            java.io.InputStream r3 = r2.f(r3)
            return r3
        L47:
            boolean r0 = h(r5)
            if (r0 == 0) goto L8a
            java.net.HttpURLConnection r0 = r2.d
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L82
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6a
            r1.<init>(r3, r0)     // Catch: java.net.MalformedURLException -> L6a
            r2.b()
            int r4 = r4 + 1
            java.io.InputStream r3 = r2.i(r1, r4, r3, r6)
            return r3
        L6a:
            r3 = move-exception
            com.bumptech.glide.load.HttpException r4 = new com.bumptech.glide.load.HttpException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Bad redirect url: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6, r5, r3)
            throw r4
        L82:
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException
            java.lang.String r4 = "Received empty or null redirect url"
            r3.<init>(r4, r5)
            throw r3
        L8a:
            if (r5 != r1) goto L92
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException
            r3.<init>(r5)
            throw r3
        L92:
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException     // Catch: java.io.IOException -> L9e
            java.net.HttpURLConnection r4 = r2.d     // Catch: java.io.IOException -> L9e
            java.lang.String r4 = r4.getResponseMessage()     // Catch: java.io.IOException -> L9e
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L9e
            throw r3     // Catch: java.io.IOException -> L9e
        L9e:
            r3 = move-exception
            com.bumptech.glide.load.HttpException r4 = new com.bumptech.glide.load.HttpException
            java.lang.String r6 = "Failed to get a response message"
            r4.<init>(r6, r5, r3)
            throw r4
        La7:
            r3 = move-exception
            com.bumptech.glide.load.HttpException r4 = new com.bumptech.glide.load.HttpException
            java.net.HttpURLConnection r5 = r2.d
            int r5 = e(r5)
            java.lang.String r6 = "Failed to connect or obtain data"
            r4.<init>(r6, r5, r3)
            throw r4
        Lb6:
            com.bumptech.glide.load.HttpException r3 = new com.bumptech.glide.load.HttpException
            java.lang.String r4 = "Too many (> 5) redirects!"
            r3.<init>(r4, r1)
            throw r3
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
            java.io.InputStream r0 = r1.e
            if (r0 == 0) goto L9
            r0.close()     // Catch: java.io.IOException -> L8
            goto L9
        L8:
        L9:
            java.net.HttpURLConnection r0 = r1.d
            if (r0 == 0) goto L10
            r0.disconnect()
        L10:
            r0 = 0
            r1.d = r0
            return
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r8, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super java.io.InputStream> r9) {
            r7 = this;
            java.lang.String r8 = "HttpUrlFetcher"
            long r0 = com.bumptech.glide.util.g.b()
            r2 = 2
            com.bumptech.glide.load.model.g r3 = r7.a     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            java.net.URL r3 = r3.i()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            com.bumptech.glide.load.model.g r4 = r7.a     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            java.util.Map r4 = r4.e()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r5 = 0
            r6 = 0
            java.io.InputStream r3 = r7.i(r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r9.d(r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            boolean r8 = android.util.Log.isLoggable(r8, r2)
            if (r8 == 0) goto L39
            com.bumptech.glide.util.g.a(r0)
            return
        L26:
            r9 = move-exception
            goto L3a
        L28:
            r3 = move-exception
            r4 = 3
            android.util.Log.isLoggable(r8, r4)     // Catch: java.lang.Throwable -> L26
            r9.e(r3)     // Catch: java.lang.Throwable -> L26
            boolean r8 = android.util.Log.isLoggable(r8, r2)
            if (r8 == 0) goto L39
            com.bumptech.glide.util.g.a(r0)
        L39:
            return
        L3a:
            boolean r8 = android.util.Log.isLoggable(r8, r2)
            if (r8 == 0) goto L43
            com.bumptech.glide.util.g.a(r0)
        L43:
            throw r9
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.f = r0
            return
    }

    @Override // com.bumptech.glide.load.data.d
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.DataSource getDataSource() {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.REMOTE
            return r0
    }
}
