package com.bytedance.adsdk.lottie.cw;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j implements com.bytedance.adsdk.lottie.cw.r {
    private final java.net.HttpURLConnection j;

    public j(java.net.HttpURLConnection r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    private java.lang.String j(java.net.HttpURLConnection r3) throws java.io.IOException {
            r2 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r3 = r3.getErrorStream()
            r1.<init>(r3)
            r0.<init>(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L13:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            r3.append(r1)     // Catch: java.lang.Throwable -> L22
            r1 = 10
            r3.append(r1)     // Catch: java.lang.Throwable -> L22
            goto L13
        L22:
            r3 = move-exception
            goto L2c
        L24:
            r0.close()     // Catch: java.lang.Exception -> L27
        L27:
            java.lang.String r3 = r3.toString()
            return r3
        L2c:
            r0.close()     // Catch: java.lang.Exception -> L2f
        L2f:
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.j
            r0.disconnect()
            return
    }

    @Override // com.bytedance.adsdk.lottie.cw.r
    public java.lang.String cw() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.j
            java.lang.String r0 = r0.getContentType()
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.cw.r
    public boolean j() {
            r3 = this;
            r0 = 0
            java.net.HttpURLConnection r1 = r3.j     // Catch: java.io.IOException -> Ld
            int r1 = r1.getResponseCode()     // Catch: java.io.IOException -> Ld
            int r1 = r1 / 100
            r2 = 2
            if (r1 != r2) goto Ld
            r0 = 1
        Ld:
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.cw.r
    public java.lang.String r() {
            r2 = this;
            boolean r0 = r2.j()     // Catch: java.io.IOException -> L39
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L39
            java.lang.String r1 = "Unable to fetch "
            r0.<init>(r1)     // Catch: java.io.IOException -> L39
            java.net.HttpURLConnection r1 = r2.j     // Catch: java.io.IOException -> L39
            java.net.URL r1 = r1.getURL()     // Catch: java.io.IOException -> L39
            r0.append(r1)     // Catch: java.io.IOException -> L39
            java.lang.String r1 = ". Failed with "
            r0.append(r1)     // Catch: java.io.IOException -> L39
            java.net.HttpURLConnection r1 = r2.j     // Catch: java.io.IOException -> L39
            int r1 = r1.getResponseCode()     // Catch: java.io.IOException -> L39
            r0.append(r1)     // Catch: java.io.IOException -> L39
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch: java.io.IOException -> L39
            java.net.HttpURLConnection r1 = r2.j     // Catch: java.io.IOException -> L39
            java.lang.String r1 = r2.j(r1)     // Catch: java.io.IOException -> L39
            r0.append(r1)     // Catch: java.io.IOException -> L39
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L39
            return r0
        L39:
            r0 = move-exception
            java.lang.String r1 = "get error failed "
            com.bytedance.adsdk.lottie.up.up.j(r1, r0)
            java.lang.String r0 = r0.getMessage()
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.cw.r
    public java.io.InputStream xt() throws java.io.IOException {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.j
            java.io.InputStream r0 = r0.getInputStream()
            return r0
    }
}
