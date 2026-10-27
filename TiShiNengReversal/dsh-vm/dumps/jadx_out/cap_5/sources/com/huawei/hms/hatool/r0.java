package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r0 {
    public static final java.nio.charset.Charset a = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.huawei.hms.hatool.r0.a = r0
            return
    }

    public r0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.util.Pair<byte[], java.lang.String> a(java.lang.String r2, int r3) {
            r0 = 0
            if (r2 == 0) goto L1c
            int r1 = r2.length()
            if (r1 >= r3) goto La
            goto L1c
        La:
            java.lang.String r0 = r2.substring(r0, r3)
            java.lang.String r2 = r2.substring(r3)
            byte[] r3 = c2.c.c(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r2)
            return r0
        L1c:
            android.util.Pair r3 = new android.util.Pair
            byte[] r0 = new byte[r0]
            r3.<init>(r0, r2)
            return r3
    }

    public static java.lang.String b(java.lang.String r1, java.lang.String r2) {
            r0 = 32
            android.util.Pair r1 = a(r1, r0)
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = c2.c.c(r0)
            byte[] r2 = c2.c.c(r2)
            java.lang.Object r1 = r1.first
            byte[] r1 = (byte[]) r1
            byte[] r1 = com.huawei.secure.android.common.encrypt.aes.a.p(r0, r2, r1)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r0 = com.huawei.hms.hatool.r0.a
            r2.<init>(r1, r0)
            return r2
    }

    public static java.lang.String c(byte[] r4, java.lang.String r5) {
            java.lang.String r0 = ""
            java.lang.String r1 = "AesCipher"
            if (r4 == 0) goto L24
            int r2 = r4.length
            if (r2 == 0) goto L24
            if (r5 != 0) goto Lc
            goto L24
        Lc:
            byte[] r5 = c2.c.c(r5)
            int r2 = r5.length
            r3 = 16
            if (r2 >= r3) goto L1b
            java.lang.String r4 = "key length is not right"
        L17:
            com.huawei.hms.hatool.j1.e(r1, r4)
            return r0
        L1b:
            byte[] r4 = com.huawei.secure.android.common.encrypt.aes.b.u(r4, r5)
            java.lang.String r4 = c2.c.b(r4)
            return r4
        L24:
            java.lang.String r4 = "cbc encrypt(byte) param is not right"
            goto L17
    }

    public static java.lang.String d(java.lang.String r1, java.lang.String r2) {
            java.nio.charset.Charset r0 = com.huawei.hms.hatool.r0.a
            byte[] r1 = r1.getBytes(r0)
            byte[] r2 = c2.c.c(r2)
            byte[] r1 = com.huawei.secure.android.common.encrypt.aes.a.x(r1, r2)
            java.lang.String r1 = c2.c.b(r1)
            return r1
    }
}
