package xyz.adscope.common.tool.security;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MD5Util {
    public MD5Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String md5(java.lang.String r7) {
            java.lang.String r0 = "common_log"
            java.lang.String r1 = "e : "
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            java.lang.String r3 = "UTF-8"
            byte[] r7 = r7.getBytes(r3)     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            byte[] r7 = r2.digest(r7)     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            int r3 = r7.length     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            int r3 = r3 * 2
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            int r3 = r7.length     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            r4 = 0
        L1e:
            if (r4 >= r3) goto L3e
            r5 = r7[r4]     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 16
            if (r5 >= r6) goto L34
            java.lang.String r6 = "0"
            r2.append(r6)     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            goto L34
        L2e:
            r7 = move-exception
            goto L43
        L30:
            r7 = move-exception
            goto L56
        L32:
            r7 = move-exception
            goto L69
        L34:
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            r2.append(r5)     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            int r4 = r4 + 1
            goto L1e
        L3e:
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L2e java.io.UnsupportedEncodingException -> L30 java.security.NoSuchAlgorithmException -> L32
            return r7
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r7)
            goto L7b
        L56:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r7)
            goto L7b
        L69:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r7)
        L7b:
            java.lang.String r7 = ""
            return r7
    }
}
