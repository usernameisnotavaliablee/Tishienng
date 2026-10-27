package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class l6 {
    com.amap.api.col.p0003l.l6 a;

    l6() {
            r0 = this;
            r0.<init>()
            return
    }

    l6(com.amap.api.col.p0003l.l6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    protected abstract byte[] a(byte[] r1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException;

    public final byte[] b(byte[] r2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r1 = this;
            com.amap.api.col.3l.l6 r0 = r1.a
            if (r0 == 0) goto L8
            byte[] r2 = r0.b(r2)
        L8:
            byte[] r2 = r1.a(r2)
            return r2
    }
}
