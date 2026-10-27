package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f2 extends com.amap.api.col.s.f1 {
    private byte[] m;
    private java.lang.String n;

    public f2(byte[] r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "1"
            r1.n = r0
            java.lang.Object r2 = r2.clone()
            byte[] r2 = (byte[]) r2
            r1.m = r2
            r1.n = r3
            com.amap.api.col.s.dz$a r2 = com.amap.api.col.s.dz.a.f4417e
            r1.e(r2)
            com.amap.api.col.s.dz$c r2 = com.amap.api.col.s.dz.c.a
            r1.g(r2)
            return
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r7 = this;
            java.lang.String r0 = com.amap.api.col.s.s1.f4673b
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)
            java.lang.String r1 = r7.n
            java.lang.String r2 = com.amap.api.col.s.s1.a
            byte[] r2 = com.amap.api.col.s.j1.o(r2)
            int r3 = r2.length
            r4 = 50
            int r3 = r3 + r4
            byte[] r3 = new byte[r3]
            byte[] r5 = r7.m
            r6 = 0
            java.lang.System.arraycopy(r5, r6, r3, r6, r4)
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r6, r3, r4, r5)
            java.lang.String r2 = com.amap.api.col.s.g1.b(r3)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "1"
            r3[r6] = r4
            r5 = 1
            r3[r5] = r1
            r1 = 2
            r3[r1] = r4
            java.lang.String r1 = "open"
            r4 = 3
            r3[r4] = r1
            r1 = 4
            r3[r1] = r2
            java.lang.String r0 = java.lang.String.format(r0, r3)
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> o() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> p() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/zip"
            r0.put(r1, r2)
            byte[] r1 = r3.m
            int r1 = r1.length
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Content-Length"
            r0.put(r2, r1)
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final byte[] q() {
            r1 = this;
            byte[] r0 = r1.m
            return r0
    }
}
