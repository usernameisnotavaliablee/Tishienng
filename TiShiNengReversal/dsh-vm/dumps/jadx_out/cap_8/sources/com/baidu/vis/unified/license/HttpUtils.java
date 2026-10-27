package com.baidu.vis.unified.license;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HttpUtils {
    public HttpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.baidu.vis.unified.license.HttpStatus requestPost(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r9 = "8000"
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld2 java.io.IOException -> Ld6 java.net.MalformedURLException -> Lda
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld2 java.io.IOException -> Ld6 java.net.MalformedURLException -> Lda
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld2 java.io.IOException -> Ld6 java.net.MalformedURLException -> Lda
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld2 java.io.IOException -> Ld6 java.net.MalformedURLException -> Lda
            java.lang.String r1 = "sun.net.client.defaultConnectTimeout"
            java.lang.System.setProperty(r1, r9)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            java.lang.String r1 = "sun.net.client.defaultReadTimeout"
            java.lang.System.setProperty(r1, r9)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            r9 = 1
            r6.setDoOutput(r9)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            r6.setDoInput(r9)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            java.lang.String r1 = "POST"
            r6.setRequestMethod(r1)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            r1 = 0
            r6.setUseCaches(r1)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            r6.setInstanceFollowRedirects(r9)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            java.lang.String r9 = "Content-Type"
            r6.setRequestProperty(r9, r8)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            r6.connect()     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            java.io.OutputStream r8 = r6.getOutputStream()     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc2 java.io.IOException -> Lc6 java.net.MalformedURLException -> Lca
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.io.IOException -> L98 java.net.MalformedURLException -> L9d
            r8.write(r7)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.io.IOException -> L98 java.net.MalformedURLException -> L9d
            r8.flush()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.io.IOException -> L98 java.net.MalformedURLException -> L9d
            r8.close()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.io.IOException -> L98 java.net.MalformedURLException -> L9d
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.io.IOException -> L98 java.net.MalformedURLException -> L9d
            r9 = 200(0xc8, float:2.8E-43)
            if (r9 != r7) goto La2
            java.io.InputStream r9 = r6.getInputStream()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.io.IOException -> L98 java.net.MalformedURLException -> L9d
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83 java.io.IOException -> L87 java.net.MalformedURLException -> L8b
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83 java.io.IOException -> L87 java.net.MalformedURLException -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83 java.io.IOException -> L87 java.net.MalformedURLException -> L8b
        L59:
            int r4 = r9.read(r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            r5 = -1
            if (r4 == r5) goto L71
            r3.write(r2, r1, r4)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            goto L59
        L64:
            r7 = move-exception
        L65:
            r0 = r8
            goto L12a
        L68:
            r7 = move-exception
            goto Lde
        L6b:
            r7 = move-exception
            goto Lf9
        L6e:
            r7 = move-exception
            goto L111
        L71:
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            java.lang.String r4 = "utf-8"
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            r3.flush()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            goto La5
        L80:
            r7 = move-exception
            r3 = r0
            goto L65
        L83:
            r7 = move-exception
            r3 = r0
            goto Lde
        L87:
            r7 = move-exception
            r3 = r0
            goto Lf9
        L8b:
            r7 = move-exception
            r3 = r0
            goto L111
        L8f:
            r7 = move-exception
            r9 = r0
            r3 = r9
            goto L65
        L93:
            r7 = move-exception
            r9 = r0
        L95:
            r3 = r9
            goto Lde
        L98:
            r7 = move-exception
            r9 = r0
        L9a:
            r3 = r9
            goto Lf9
        L9d:
            r7 = move-exception
            r9 = r0
        L9f:
            r3 = r9
            goto L111
        La2:
            r9 = r0
            r2 = r9
            r3 = r2
        La5:
            com.baidu.vis.unified.license.HttpStatus r1 = new com.baidu.vis.unified.license.HttpStatus     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68 java.io.IOException -> L6b java.net.MalformedURLException -> L6e
            r8.close()     // Catch: java.io.IOException -> Lb7
            if (r3 == 0) goto Lb2
            r3.close()     // Catch: java.io.IOException -> Lb7
        Lb2:
            if (r9 == 0) goto Lb7
            r9.close()     // Catch: java.io.IOException -> Lb7
        Lb7:
            r6.disconnect()
            r0 = r1
            goto L129
        Lbd:
            r7 = move-exception
            r9 = r0
        Lbf:
            r3 = r9
            goto L12a
        Lc2:
            r7 = move-exception
            r8 = r0
        Lc4:
            r9 = r8
            goto L95
        Lc6:
            r7 = move-exception
            r8 = r0
        Lc8:
            r9 = r8
            goto L9a
        Lca:
            r7 = move-exception
            r8 = r0
        Lcc:
            r9 = r8
            goto L9f
        Lce:
            r7 = move-exception
            r6 = r0
            r9 = r6
            goto Lbf
        Ld2:
            r7 = move-exception
            r6 = r0
            r8 = r6
            goto Lc4
        Ld6:
            r7 = move-exception
            r6 = r0
            r8 = r6
            goto Lc8
        Lda:
            r7 = move-exception
            r6 = r0
            r8 = r6
            goto Lcc
        Lde:
            r7.getMessage()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto Le9
            r8.close()     // Catch: java.io.IOException -> Le7
            goto Le9
        Le7:
            goto Lf3
        Le9:
            if (r3 == 0) goto Lee
            r3.close()     // Catch: java.io.IOException -> Le7
        Lee:
            if (r9 == 0) goto Lf3
            r9.close()     // Catch: java.io.IOException -> Le7
        Lf3:
            if (r6 == 0) goto L129
        Lf5:
            r6.disconnect()
            goto L129
        Lf9:
            r7.getMessage()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L104
            r8.close()     // Catch: java.io.IOException -> L102
            goto L104
        L102:
            goto L10e
        L104:
            if (r3 == 0) goto L109
            r3.close()     // Catch: java.io.IOException -> L102
        L109:
            if (r9 == 0) goto L10e
            r9.close()     // Catch: java.io.IOException -> L102
        L10e:
            if (r6 == 0) goto L129
            goto Lf5
        L111:
            r7.getMessage()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L11c
            r8.close()     // Catch: java.io.IOException -> L11a
            goto L11c
        L11a:
            goto L126
        L11c:
            if (r3 == 0) goto L121
            r3.close()     // Catch: java.io.IOException -> L11a
        L121:
            if (r9 == 0) goto L126
            r9.close()     // Catch: java.io.IOException -> L11a
        L126:
            if (r6 == 0) goto L129
            goto Lf5
        L129:
            return r0
        L12a:
            if (r0 == 0) goto L132
            r0.close()     // Catch: java.io.IOException -> L130
            goto L132
        L130:
            goto L13c
        L132:
            if (r3 == 0) goto L137
            r3.close()     // Catch: java.io.IOException -> L130
        L137:
            if (r9 == 0) goto L13c
            r9.close()     // Catch: java.io.IOException -> L130
        L13c:
            if (r6 == 0) goto L141
            r6.disconnect()
        L141:
            throw r7
    }
}
