package xyz.adscope.common.network.secure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Encryption {
    public Encryption() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String byteArrayToHex(byte[] r6) {
            int r0 = r6.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 2
            r1.<init>(r2)
            r2 = 0
        L9:
            if (r2 >= r0) goto L25
            r3 = r6[r2]
        Ld:
            if (r3 >= 0) goto L12
            int r3 = r3 + 256
            goto Ld
        L12:
            r4 = 16
            if (r3 >= r4) goto L1b
            java.lang.String r5 = "0"
            r1.append(r5)
        L1b:
            java.lang.String r3 = java.lang.Integer.toString(r3, r4)
            r1.append(r3)
            int r2 = r2 + 1
            goto L9
        L25:
            java.lang.String r6 = r1.toString()
            return r6
    }

    public static xyz.adscope.common.network.secure.Secret createSecret(java.lang.String r1) {
            xyz.adscope.common.network.secure.AESSecret r0 = new xyz.adscope.common.network.secure.AESSecret     // Catch: java.security.GeneralSecurityException -> L6
            r0.<init>(r1)     // Catch: java.security.GeneralSecurityException -> L6
            return r0
        L6:
            xyz.adscope.common.network.secure.SafeSecret r1 = new xyz.adscope.common.network.secure.SafeSecret
            r1.<init>()
            return r1
    }

    public static java.lang.String getMD5ForString(java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L34
            r0.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L34
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L34
            byte[] r2 = r6.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L34
            byte[] r1 = r1.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> L34
            int r2 = r1.length     // Catch: java.security.NoSuchAlgorithmException -> L34
            r3 = 0
        L15:
            if (r3 >= r2) goto L30
            r4 = r1[r3]     // Catch: java.security.NoSuchAlgorithmException -> L34
            if (r4 >= 0) goto L1d
            int r4 = r4 + 256
        L1d:
            r5 = 16
            if (r4 >= r5) goto L26
            java.lang.String r5 = "0"
            r0.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L34
        L26:
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.security.NoSuchAlgorithmException -> L34
            r0.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L34
            int r3 = r3 + 1
            goto L15
        L30:
            java.lang.String r6 = r0.toString()     // Catch: java.security.NoSuchAlgorithmException -> L34
        L34:
            return r6
    }

    public static byte[] hexToByteArray(java.lang.String r6) {
            byte[] r6 = r6.getBytes()
            int r0 = r6.length
            int r1 = r0 / 2
            byte[] r1 = new byte[r1]
            r2 = 0
        La:
            if (r2 >= r0) goto L20
            java.lang.String r3 = new java.lang.String
            r4 = 2
            r3.<init>(r6, r2, r4)
            int r4 = r2 / 2
            r5 = 16
            int r3 = java.lang.Integer.parseInt(r3, r5)
            byte r3 = (byte) r3
            r1[r4] = r3
            int r2 = r2 + 2
            goto La
        L20:
            return r1
    }
}
