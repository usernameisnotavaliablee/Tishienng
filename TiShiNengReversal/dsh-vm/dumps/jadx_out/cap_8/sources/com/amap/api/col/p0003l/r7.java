package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class r7 {
    com.amap.api.col.p0003l.r7 a;

    /* renamed from: b, reason: collision with root package name */
    byte[] f3855b;

    r7() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3855b = r0
            return
    }

    r7(com.amap.api.col.p0003l.r7 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3855b = r0
            r1.a = r2
            return
    }

    public final byte[] a() throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r2 = this;
            byte[] r0 = r2.f3855b
            byte[] r0 = r2.b(r0)
            com.amap.api.col.3l.r7 r1 = r2.a
            if (r1 == 0) goto L10
            r1.f3855b = r0
            byte[] r0 = r1.a()
        L10:
            return r0
    }

    protected abstract byte[] b(byte[] r1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException;

    public void c(byte[] r1) {
            r0 = this;
            return
    }
}
