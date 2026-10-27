package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {
    public n() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String a(java.lang.String r2) {
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L10
            r2 = 0
            return r2
        L10:
            java.lang.String r2 = r0.getMimeTypeFromExtension(r2)
            return r2
    }

    private static java.lang.String a(byte[] r6) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L21
            r4 = r6[r3]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            java.lang.String r4 = "%02x"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.append(r4)
            int r3 = r3 + 1
            goto L8
        L21:
            java.lang.String r6 = r0.toString()
            return r6
    }

    static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    static void a(byte[] r5, long r6, int r8) {
            java.lang.String r0 = "Buffer must be not null!"
            com.beizi.ad.internal.i.k.a(r5, r0)
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 < 0) goto Lf
            r6 = 1
            goto L10
        Lf:
            r6 = 0
        L10:
            java.lang.String r7 = "Data offset must be positive!"
            com.beizi.ad.internal.i.k.a(r6, r7)
            if (r8 < 0) goto L1b
            int r5 = r5.length
            if (r8 > r5) goto L1b
            r2 = 1
        L1b:
            java.lang.String r5 = "Length must be in range [0..buffer.length]"
            com.beizi.ad.internal.i.k.a(r2, r5)
            return
    }

    static java.lang.String b(java.lang.String r2) {
            java.lang.String r0 = "utf-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error encoding url"
            r0.<init>(r1, r2)
            throw r0
    }

    static java.lang.String c(java.lang.String r2) {
            java.lang.String r0 = "utf-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error decoding url"
            r0.<init>(r1, r2)
            throw r0
    }

    public static java.lang.String d(java.lang.String r1) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L13
            byte[] r1 = r1.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L13
            byte[] r1 = r0.digest(r1)     // Catch: java.security.NoSuchAlgorithmException -> L13
            java.lang.String r1 = a(r1)     // Catch: java.security.NoSuchAlgorithmException -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }
}
