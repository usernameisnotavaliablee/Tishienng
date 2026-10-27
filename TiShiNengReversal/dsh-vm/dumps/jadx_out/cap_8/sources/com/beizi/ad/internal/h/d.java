package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class d extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.beizi.ad.internal.h.e> {
    private static java.lang.String a = "HTTPGet";

    /* renamed from: b, reason: collision with root package name */
    private boolean f6864b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6865c;

    static {
            return
    }

    public d(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f6864b = r1
            r0.f6865c = r2
            return
    }

    private java.net.HttpURLConnection a(java.net.URL r3) throws java.io.IOException {
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r0 = 0
            r3.setDoOutput(r0)
            r1 = 1
            r3.setDoInput(r1)
            r3.setUseCaches(r0)
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)
            return r3
    }

    private void a(java.net.HttpURLConnection r3) throws java.net.ProtocolException {
            r2 = this;
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            java.lang.String r0 = r0.f6835e
            java.lang.String r1 = "User-Agent"
            r3.setRequestProperty(r1, r0)
            return
    }

    protected com.beizi.ad.internal.h.e a(java.lang.Void... r8) {
            r7 = this;
            com.beizi.ad.internal.h.e r8 = new com.beizi.ad.internal.h.e
            r8.<init>()
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.lang.String r3 = r7.a()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.lang.String r3 = r2.getHost()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            if (r3 != 0) goto L1d
            r8.a(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            return r8
        L1a:
            r8 = move-exception
            goto Lbe
        L1d:
            java.net.HttpURLConnection r1 = r7.a(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r7.a(r1)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r1.connect()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.lang.String r3 = com.beizi.ad.internal.h.d.a     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r4.<init>()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.lang.String r5 = "HTTPGet code:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r4.append(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            com.beizi.ad.lance.a.m.a(r3, r4)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.util.Map r3 = r1.getHeaderFields()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r8.a(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 302(0x12e, float:4.23E-43)
            if (r2 == r3) goto L53
            if (r2 != r4) goto L51
            goto L53
        L51:
            r3 = 0
            goto L54
        L53:
            r3 = 1
        L54:
            r8.a(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            if (r2 != r4) goto L65
            r8.a(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.lang.String r2 = "Location"
            java.lang.String r2 = r1.getHeaderField(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r8.b(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
        L65:
            boolean r2 = r7.f6865c     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            if (r2 == 0) goto L95
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r3.<init>()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
        L76:
            int r5 = r2.read(r4)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r6 = -1
            if (r5 == r6) goto L81
            r3.write(r4, r0, r5)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            goto L76
        L81:
            r2.close()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            boolean r2 = r7.f6864b     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            if (r2 != 0) goto L92
            java.lang.String r2 = "UTF-8"
            java.lang.String r2 = r3.toString(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            r8.a(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
            goto L95
        L92:
            r8.a(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L99 java.io.IOException -> La7 java.net.MalformedURLException -> Lb2
        L95:
            r1.disconnect()
            return r8
        L99:
            r8.a(r0)     // Catch: java.lang.Throwable -> L1a
            com.beizi.ad.internal.h.h r0 = com.beizi.ad.internal.h.h.f6875e     // Catch: java.lang.Throwable -> L1a
            r8.a(r0)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Lbd
        La3:
            r1.disconnect()
            goto Lbd
        La7:
            r8.a(r0)     // Catch: java.lang.Throwable -> L1a
            com.beizi.ad.internal.h.h r0 = com.beizi.ad.internal.h.h.f6875e     // Catch: java.lang.Throwable -> L1a
            r8.a(r0)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Lbd
            goto La3
        Lb2:
            r8.a(r0)     // Catch: java.lang.Throwable -> L1a
            com.beizi.ad.internal.h.h r0 = com.beizi.ad.internal.h.h.f6872b     // Catch: java.lang.Throwable -> L1a
            r8.a(r0)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Lbd
            goto La3
        Lbd:
            return r8
        Lbe:
            if (r1 == 0) goto Lc3
            r1.disconnect()
        Lc3:
            throw r8
    }

    protected abstract java.lang.String a();

    protected abstract void a(com.beizi.ad.internal.h.e r1);

    @android.annotation.TargetApi(11)
    protected void b(com.beizi.ad.internal.h.e r1) {
            r0 = this;
            r1 = 0
            super.onCancelled(r1)
            return
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ com.beizi.ad.internal.h.e doInBackground(java.lang.Void[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            com.beizi.ad.internal.h.e r1 = r0.a(r1)
            return r1
    }

    @Override // android.os.AsyncTask
    @android.annotation.TargetApi(11)
    protected /* synthetic */ void onCancelled(com.beizi.ad.internal.h.e r1) {
            r0 = this;
            com.beizi.ad.internal.h.e r1 = (com.beizi.ad.internal.h.e) r1
            r0.b(r1)
            return
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(com.beizi.ad.internal.h.e r1) {
            r0 = this;
            com.beizi.ad.internal.h.e r1 = (com.beizi.ad.internal.h.e) r1
            r0.a(r1)
            return
    }
}
