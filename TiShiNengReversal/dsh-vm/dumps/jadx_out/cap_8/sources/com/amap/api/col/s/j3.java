package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j3 extends com.amap.api.col.s.p3 {

    /* renamed from: c, reason: collision with root package name */
    java.io.ByteArrayOutputStream f4528c;

    public j3() {
            r1 = this;
            r1.<init>()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1.f4528c = r0
            return
    }

    public j3(com.amap.api.col.s.p3 r1) {
            r0 = this;
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r0.f4528c = r1
            return
    }

    @Override // com.amap.api.col.s.p3
    protected final byte[] b(byte[] r2) {
            r1 = this;
            java.io.ByteArrayOutputStream r2 = r1.f4528c
            byte[] r2 = r2.toByteArray()
            java.io.ByteArrayOutputStream r0 = r1.f4528c     // Catch: java.io.IOException -> Lb
            r0.close()     // Catch: java.io.IOException -> Lb
        Lb:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1.f4528c = r0
            return r2
    }

    @Override // com.amap.api.col.s.p3
    public final void c(byte[] r2) {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = r1.f4528c     // Catch: java.lang.Throwable -> L5
            r0.write(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }
}
