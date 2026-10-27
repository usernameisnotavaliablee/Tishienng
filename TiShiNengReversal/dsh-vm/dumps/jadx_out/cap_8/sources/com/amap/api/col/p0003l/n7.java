package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class n7 extends com.amap.api.col.p0003l.r7 {

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f3703c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f3704d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.l6 f3705e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.Object[] f3706f;

    public n7(android.content.Context r1, com.amap.api.col.p0003l.r7 r2, com.amap.api.col.p0003l.l6 r3, java.lang.String r4, java.lang.Object... r5) {
            r0 = this;
            r0.<init>(r2)
            r0.f3703c = r1
            r0.f3704d = r4
            r0.f3705e = r3
            r0.f3706f = r5
            return
    }

    private java.lang.String d() {
            r3 = this;
            java.lang.String r0 = r3.f3704d     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object[] r1 = r3.f3706f     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.String r1 = "ofm"
            java.lang.String r2 = "gpj"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.amap.api.col.p0003l.r7
    protected final byte[] b(byte[] r4) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r3 = this;
            java.lang.String r4 = com.amap.api.col.p0003l.q4.g(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lc
            r4 = 0
            return r4
        Lc:
            java.lang.String r0 = r3.d()
            com.amap.api.col.3l.l6 r1 = r3.f3705e
            byte[] r0 = com.amap.api.col.p0003l.q4.o(r0)
            byte[] r0 = r1.b(r0)
            java.lang.String r0 = com.amap.api.col.p0003l.q4.g(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "{\"pinfo\":\""
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\",\"els\":["
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = "]}"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            byte[] r4 = com.amap.api.col.p0003l.q4.o(r4)
            return r4
    }
}
