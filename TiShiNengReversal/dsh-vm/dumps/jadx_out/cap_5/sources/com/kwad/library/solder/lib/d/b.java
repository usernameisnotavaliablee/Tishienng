package com.kwad.library.solder.lib.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String e(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L23
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L1d
            r3 = 48
            r0.append(r3)
        L1d:
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L23:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String getMD5(java.lang.String r2) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16
            byte[] r1 = r2.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L16
            r0.update(r1)     // Catch: java.security.NoSuchAlgorithmException -> L16
            byte[] r0 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = e(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16
            return r2
        L16:
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
    }
}
