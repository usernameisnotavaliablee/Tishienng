package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class t5 extends com.amap.api.col.p0003l.l4 {
    private byte[] r;
    private java.lang.String s;

    public t5(byte[] r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "1"
            r1.s = r0
            java.lang.Object r2 = r2.clone()
            byte[] r2 = (byte[]) r2
            r1.r = r2
            r1.s = r3
            com.amap.api.col.3l.if$a r2 = com.amap.api.col.p0003l.Cif.a.f3528e
            r1.setDegradeAbility(r2)
            com.amap.api.col.3l.if$c r2 = com.amap.api.col.p0003l.Cif.c.a
            r1.setHttpProtocol(r2)
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final byte[] getEntityBytes() {
            r1 = this;
            byte[] r0 = r1.r
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/zip"
            r0.put(r1, r2)
            byte[] r1 = r3.r
            int r1 = r1.length
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Content-Length"
            r0.put(r2, r1)
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r7 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.f5.f3282b
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            java.lang.String r1 = r7.s
            java.lang.String r2 = com.amap.api.col.p0003l.f5.a
            byte[] r2 = com.amap.api.col.p0003l.q4.o(r2)
            int r3 = r2.length
            r4 = 50
            int r3 = r3 + r4
            byte[] r3 = new byte[r3]
            byte[] r5 = r7.r
            r6 = 0
            java.lang.System.arraycopy(r5, r6, r3, r6, r4)
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r6, r3, r4, r5)
            java.lang.String r2 = com.amap.api.col.p0003l.m4.b(r3)
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

    @Override // com.amap.api.col.p0003l.Cif
    public final boolean isHostToIP() {
            r1 = this;
            r0 = 0
            return r0
    }
}
