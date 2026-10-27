package xyz.adscope.common.network.secure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AESSecret implements xyz.adscope.common.network.secure.Secret {
    private javax.crypto.Cipher a;
    private javax.crypto.Cipher b;

    public AESSecret(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            byte[] r4 = r4.getBytes()
            java.security.Key r4 = r3.a(r4)
            java.lang.String r0 = "AES"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)
            r3.a = r1
            r2 = 1
            r1.init(r2, r4)
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            r3.b = r0
            r1 = 2
            r0.init(r1, r4)
            return
    }

    private java.security.Key a(byte[] r5) {
            r4 = this;
            r0 = 8
            byte[] r1 = new byte[r0]
            r2 = 0
        L5:
            int r3 = r5.length
            if (r2 >= r3) goto L11
            if (r2 >= r0) goto L11
            r3 = r5[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L11:
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r5.<init>(r1, r0)
            return r5
    }

    @Override // xyz.adscope.common.network.secure.Secret
    public java.lang.String decrypt(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r2 = xyz.adscope.common.network.secure.Encryption.hexToByteArray(r2)
            byte[] r2 = r1.decrypt(r2)
            r0.<init>(r2)
            return r0
    }

    @Override // xyz.adscope.common.network.secure.Secret
    public byte[] decrypt(byte[] r2) {
            r1 = this;
            javax.crypto.Cipher r0 = r1.b
            byte[] r2 = r0.doFinal(r2)
            return r2
    }

    @Override // xyz.adscope.common.network.secure.Secret
    public java.lang.String encrypt(java.lang.String r1) {
            r0 = this;
            byte[] r1 = r1.getBytes()
            byte[] r1 = r0.encrypt(r1)
            java.lang.String r1 = xyz.adscope.common.network.secure.Encryption.byteArrayToHex(r1)
            return r1
    }

    @Override // xyz.adscope.common.network.secure.Secret
    public byte[] encrypt(byte[] r2) {
            r1 = this;
            javax.crypto.Cipher r0 = r1.a
            byte[] r2 = r0.doFinal(r2)
            return r2
    }
}
