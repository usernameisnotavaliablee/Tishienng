package com.baidu.idl.face.platform.ui.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SecRequest {
    private static final java.lang.String REQUEST_URL = "http://10.138.32.176:8518/api/v3/person/verify_sec?appid=7758258";
    private static final java.lang.String TAG = "SecRequest";


    static {
            return
    }

    public SecRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String access$000(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = requestPost(r0, r1)
            return r0
    }

    private static java.lang.String requestPost(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "8000"
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Lef java.lang.Exception -> Lf5 java.io.IOException -> Lfa java.net.MalformedURLException -> Lff
            r2.<init>(r8)     // Catch: java.lang.Throwable -> Lef java.lang.Exception -> Lf5 java.io.IOException -> Lfa java.net.MalformedURLException -> Lff
            java.net.URLConnection r8 = r2.openConnection()     // Catch: java.lang.Throwable -> Lef java.lang.Exception -> Lf5 java.io.IOException -> Lfa java.net.MalformedURLException -> Lff
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: java.lang.Throwable -> Lef java.lang.Exception -> Lf5 java.io.IOException -> Lfa java.net.MalformedURLException -> Lff
            java.lang.String r2 = "sun.net.client.defaultConnectTimeout"
            java.lang.System.setProperty(r2, r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.lang.String r2 = "sun.net.client.defaultReadTimeout"
            java.lang.System.setProperty(r2, r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            r0 = 1
            r8.setDoOutput(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            r8.setDoInput(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.lang.String r0 = "POST"
            r8.setRequestMethod(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            r0 = 0
            r8.setUseCaches(r0)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0;"
            r8.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.lang.String r2 = "Accept-Language"
            java.lang.String r3 = "zh-CN"
            r8.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.lang.String r2 = "Connection"
            java.lang.String r3 = "Keep-Alive"
            r8.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.lang.String r2 = "Charset"
            java.lang.String r3 = "UTF-8"
            r8.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r8.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            r8.connect()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            java.io.OutputStream r2 = r8.getOutputStream()     // Catch: java.lang.Throwable -> Ldb java.lang.Exception -> Le0 java.io.IOException -> Le5 java.net.MalformedURLException -> Lea
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb java.io.IOException -> Lbf java.net.MalformedURLException -> Lc3
            r2.write(r7)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb java.io.IOException -> Lbf java.net.MalformedURLException -> Lc3
            r2.flush()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb java.io.IOException -> Lbf java.net.MalformedURLException -> Lc3
            r2.close()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb java.io.IOException -> Lbf java.net.MalformedURLException -> Lc3
            int r7 = r8.getResponseCode()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb java.io.IOException -> Lbf java.net.MalformedURLException -> Lc3
            r3 = 200(0xc8, float:2.8E-43)
            if (r3 != r7) goto Lc7
            java.io.InputStream r7 = r8.getInputStream()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lbb java.io.IOException -> Lbf java.net.MalformedURLException -> Lc3
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab java.io.IOException -> Laf java.net.MalformedURLException -> Lb3
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab java.io.IOException -> Laf java.net.MalformedURLException -> Lb3
            r4.<init>()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab java.io.IOException -> Laf java.net.MalformedURLException -> Lb3
        L74:
            int r5 = r7.read(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L88 java.net.MalformedURLException -> L8d
            r6 = -1
            if (r5 == r6) goto L92
            r4.write(r3, r0, r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L88 java.net.MalformedURLException -> L8d
            goto L74
        L7f:
            r0 = move-exception
        L80:
            r1 = r2
            goto L146
        L83:
            r0 = move-exception
            r3 = r1
        L85:
            r1 = r2
            goto L104
        L88:
            r0 = move-exception
            r3 = r1
        L8a:
            r1 = r2
            goto L11b
        L8d:
            r0 = move-exception
            r3 = r1
        L8f:
            r1 = r2
            goto L130
        L92:
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L88 java.net.MalformedURLException -> L8d
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L88 java.net.MalformedURLException -> L8d
            java.lang.String r5 = "utf-8"
            r3.<init>(r0, r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L88 java.net.MalformedURLException -> L8d
            r4.flush()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La2 java.io.IOException -> La4 java.net.MalformedURLException -> La6
            r1 = r4
            goto Lc9
        La2:
            r0 = move-exception
            goto L85
        La4:
            r0 = move-exception
            goto L8a
        La6:
            r0 = move-exception
            goto L8f
        La8:
            r0 = move-exception
            r4 = r1
            goto L80
        Lab:
            r0 = move-exception
            r3 = r1
        Lad:
            r4 = r3
            goto L85
        Laf:
            r0 = move-exception
            r3 = r1
        Lb1:
            r4 = r3
            goto L8a
        Lb3:
            r0 = move-exception
            r3 = r1
        Lb5:
            r4 = r3
            goto L8f
        Lb7:
            r0 = move-exception
            r7 = r1
            r4 = r7
            goto L80
        Lbb:
            r0 = move-exception
            r7 = r1
            r3 = r7
            goto Lad
        Lbf:
            r0 = move-exception
            r7 = r1
            r3 = r7
            goto Lb1
        Lc3:
            r0 = move-exception
            r7 = r1
            r3 = r7
            goto Lb5
        Lc7:
            r7 = r1
            r3 = r7
        Lc9:
            r2.close()     // Catch: java.lang.Exception -> L145
            if (r1 == 0) goto Ld1
            r1.close()     // Catch: java.lang.Exception -> L145
        Ld1:
            if (r7 == 0) goto Ld6
            r7.close()     // Catch: java.lang.Exception -> L145
        Ld6:
            r8.disconnect()     // Catch: java.lang.Exception -> L145
            goto L145
        Ldb:
            r0 = move-exception
            r7 = r1
            r4 = r7
            goto L146
        Le0:
            r0 = move-exception
            r7 = r1
            r3 = r7
        Le3:
            r4 = r3
            goto L104
        Le5:
            r0 = move-exception
            r7 = r1
            r3 = r7
        Le8:
            r4 = r3
            goto L11b
        Lea:
            r0 = move-exception
            r7 = r1
            r3 = r7
        Led:
            r4 = r3
            goto L130
        Lef:
            r0 = move-exception
            r7 = r1
            r8 = r7
            r4 = r8
            goto L146
        Lf5:
            r0 = move-exception
            r7 = r1
            r8 = r7
            r3 = r8
            goto Le3
        Lfa:
            r0 = move-exception
            r7 = r1
            r8 = r7
            r3 = r8
            goto Le8
        Lff:
            r0 = move-exception
            r7 = r1
            r8 = r7
            r3 = r8
            goto Led
        L104:
            r0.getMessage()     // Catch: java.lang.Throwable -> L119
            if (r1 == 0) goto L10c
            r1.close()     // Catch: java.lang.Exception -> L145
        L10c:
            if (r4 == 0) goto L111
            r4.close()     // Catch: java.lang.Exception -> L145
        L111:
            if (r7 == 0) goto L116
            r7.close()     // Catch: java.lang.Exception -> L145
        L116:
            if (r8 == 0) goto L145
            goto Ld6
        L119:
            r0 = move-exception
            goto L146
        L11b:
            r0.getMessage()     // Catch: java.lang.Throwable -> L119
            if (r1 == 0) goto L123
            r1.close()     // Catch: java.lang.Exception -> L145
        L123:
            if (r4 == 0) goto L128
            r4.close()     // Catch: java.lang.Exception -> L145
        L128:
            if (r7 == 0) goto L12d
            r7.close()     // Catch: java.lang.Exception -> L145
        L12d:
            if (r8 == 0) goto L145
            goto Ld6
        L130:
            r0.getMessage()     // Catch: java.lang.Throwable -> L119
            if (r1 == 0) goto L138
            r1.close()     // Catch: java.lang.Exception -> L145
        L138:
            if (r4 == 0) goto L13d
            r4.close()     // Catch: java.lang.Exception -> L145
        L13d:
            if (r7 == 0) goto L142
            r7.close()     // Catch: java.lang.Exception -> L145
        L142:
            if (r8 == 0) goto L145
            goto Ld6
        L145:
            return r3
        L146:
            if (r1 == 0) goto L14b
            r1.close()     // Catch: java.lang.Exception -> L15a
        L14b:
            if (r4 == 0) goto L150
            r4.close()     // Catch: java.lang.Exception -> L15a
        L150:
            if (r7 == 0) goto L155
            r7.close()     // Catch: java.lang.Exception -> L15a
        L155:
            if (r8 == 0) goto L15a
            r8.disconnect()     // Catch: java.lang.Exception -> L15a
        L15a:
            throw r0
    }

    public static void sendMessage(android.content.Context r1, java.lang.String r2, int r3) {
            com.baidu.idl.face.platform.ui.utils.SecRequest$1 r0 = new com.baidu.idl.face.platform.ui.utils.SecRequest$1
            r0.<init>(r2, r1, r3)
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r0)
            r1.start()
            return
    }
}
