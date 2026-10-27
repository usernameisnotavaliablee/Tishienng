package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i0 {
    public i0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.io.File r6) {
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.io.FileNotFoundException -> L48
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.io.FileNotFoundException -> L48
            com.huawei.hms.hatool.y r6 = new com.huawei.hms.hatool.y     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            r2 = 1024(0x400, float:1.435E-42)
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
        L13:
            int r4 = r3.read(r2)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            r5 = -1
            if (r4 == r5) goto L20
            r6.a(r2, r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            goto L13
        L1e:
            r6 = move-exception
            goto L52
        L20:
            int r2 = r6.c()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            if (r2 != 0) goto L2a
            c(r3)
            return r1
        L2a:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            byte[] r6 = r6.b()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            java.lang.String r4 = "UTF-8"
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L39 java.io.FileNotFoundException -> L3b
            c(r3)
            return r2
        L39:
            r2 = r3
            goto L3f
        L3b:
            r2 = r3
            goto L48
        L3d:
            r6 = move-exception
            goto L51
        L3f:
            java.lang.String r6 = "getInfoFromFile(): stream.read or new string exception"
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> L3d
            c(r2)
            return r1
        L48:
            java.lang.String r6 = "getInfoFromFile(): No files need to be read"
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> L3d
            c(r2)
            return r1
        L51:
            r3 = r2
        L52:
            c(r3)
            throw r6
    }

    public static java.lang.String b(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L15
        L9:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L15
            r3 = -1
            if (r2 == r3) goto L17
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L15
            goto L9
        L15:
            r4 = move-exception
            goto L21
        L17:
            java.lang.String r4 = "UTF-8"
            java.lang.String r4 = r0.toString(r4)     // Catch: java.lang.Throwable -> L15
            c(r0)
            return r4
        L21:
            c(r0)
            throw r4
    }

    public static void c(java.io.Closeable r1) {
            if (r1 == 0) goto Ld
            r1.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r0 = "closeQuietly(): Exception when closing the closeable!"
            com.huawei.hms.hatool.j1.m(r1, r0)
        Ld:
            return
    }

    public static void d(java.io.File r3, java.lang.String r4) {
            java.lang.String r0 = "hmsSdk"
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e java.io.FileNotFoundException -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e java.io.FileNotFoundException -> L22
            java.lang.String r3 = "UTF-8"
            byte[] r3 = r4.getBytes(r3)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
            r2.write(r3)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
            r2.flush()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L18 java.io.FileNotFoundException -> L1a
            goto L28
        L15:
            r3 = move-exception
            r1 = r2
            goto L2c
        L18:
            r1 = r2
            goto L1e
        L1a:
            r1 = r2
            goto L22
        L1c:
            r3 = move-exception
            goto L2c
        L1e:
            java.lang.String r3 = "saveInfoToFile(): io exc from write info to file!"
        L20:
            r2 = r1
            goto L25
        L22:
            java.lang.String r3 = "saveInfoToFile(): No files need to be read"
            goto L20
        L25:
            com.huawei.hms.hatool.j1.m(r0, r3)     // Catch: java.lang.Throwable -> L15
        L28:
            c(r2)
            return
        L2c:
            c(r1)
            throw r3
    }

    private static void e(java.io.OutputStream r1) {
            if (r1 == 0) goto Ld
            r1.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r0 = "closeStream(): Exception: close OutputStream error!"
            com.huawei.hms.hatool.j1.m(r1, r0)
        Ld:
            return
    }

    public static void f(java.net.HttpURLConnection r2) {
            java.lang.String r0 = "hmsSdk"
            java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Exception -> La
            r1.close()     // Catch: java.lang.Exception -> La
            goto Lf
        La:
            java.lang.String r1 = "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission"
            com.huawei.hms.hatool.j1.m(r0, r1)
        Lf:
            r2.disconnect()
            java.lang.String r2 = " connHttp disconnect"
            com.huawei.hms.hatool.j1.b(r0, r2)
            return
    }

    public static byte[] g(byte[] r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r4)
            r1.finish()
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]
        L14:
            boolean r2 = r1.finished()
            if (r2 != 0) goto L23
            int r2 = r1.deflate(r4)
            r3 = 0
            r0.write(r4, r3, r2)
            goto L14
        L23:
            byte[] r4 = r0.toByteArray()
            r1.end()
            e(r0)
            return r4
    }
}
