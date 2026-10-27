package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class p {
    private static final org.slf4j.c a = null;
    static final int b = 8192;
    static final int c = 16;

    static {
            java.lang.String r0 = "ProxyCacheUtils"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.p.a = r0
            return
    }

    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(byte[] r5, long r6, int r8) {
            java.lang.String r0 = "Buffer must be not null!"
            com.danikula.videocache.n.e(r5, r0)
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
            com.danikula.videocache.n.c(r6, r7)
            if (r8 < 0) goto L1b
            int r5 = r5.length
            if (r8 > r5) goto L1b
            r2 = 1
        L1b:
            java.lang.String r5 = "Length must be in range [0..buffer.length]"
            com.danikula.videocache.n.c(r2, r5)
            return
    }

    private static java.lang.String b(byte[] r6) {
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

    static void c(java.io.Closeable r2) {
            if (r2 == 0) goto Le
            r2.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            org.slf4j.c r0 = com.danikula.videocache.p.a
            java.lang.String r1 = "Error closing resource"
            r0.error(r1, r2)
        Le:
            return
    }

    public static java.lang.String d(java.lang.String r1) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L13
            byte[] r1 = r1.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L13
            byte[] r1 = r0.digest(r1)     // Catch: java.security.NoSuchAlgorithmException -> L13
            java.lang.String r1 = b(r1)     // Catch: java.security.NoSuchAlgorithmException -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    static java.lang.String e(java.lang.String r2) {
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

    static java.lang.String f(java.lang.String r2) {
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

    static java.lang.String g(java.lang.String r2) {
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

    static java.lang.String h(byte[] r3, int r4) {
            r0 = 0
            int r1 = java.lang.Math.max(r4, r0)
            r2 = 16
            int r1 = java.lang.Math.min(r2, r1)
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r0, r1)
            java.lang.String r3 = java.util.Arrays.toString(r3)
            if (r1 >= r4) goto L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r1 = r3.length()
            int r1 = r1 + (-1)
            java.lang.String r3 = r3.substring(r0, r1)
            r4.append(r3)
            java.lang.String r3 = ", ...]"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L30:
            return r3
    }
}
