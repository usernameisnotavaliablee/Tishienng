package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1) {
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
}
