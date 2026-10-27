package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o7 extends com.amap.api.col.p0003l.r7 {

    /* renamed from: c, reason: collision with root package name */
    private java.lang.StringBuilder f3736c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3737d;

    public o7() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.f3736c = r0
            r0 = 1
            r1.f3737d = r0
            return
    }

    public o7(com.amap.api.col.p0003l.r7 r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.f3736c = r1
            r1 = 1
            r0.f3737d = r1
            return
    }

    @Override // com.amap.api.col.p0003l.r7
    protected final byte[] b(byte[] r4) {
            r3 = this;
            java.lang.StringBuilder r4 = r3.f3736c
            java.lang.String r4 = r4.toString()
            byte[] r4 = com.amap.api.col.p0003l.q4.o(r4)
            r3.f3855b = r4
            r0 = 1
            r3.f3737d = r0
            java.lang.StringBuilder r0 = r3.f3736c
            r1 = 0
            int r2 = r0.length()
            r0.delete(r1, r2)
            return r4
    }

    @Override // com.amap.api.col.p0003l.r7
    public final void c(byte[] r3) {
            r2 = this;
            java.lang.String r3 = com.amap.api.col.p0003l.q4.g(r3)
            boolean r0 = r2.f3737d
            if (r0 == 0) goto Lc
            r0 = 0
            r2.f3737d = r0
            goto L13
        Lc:
            java.lang.StringBuilder r0 = r2.f3736c
            java.lang.String r1 = ","
            r0.append(r1)
        L13:
            java.lang.StringBuilder r0 = r2.f3736c
            java.lang.String r1 = "{\"log\":\""
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "\"}"
            r0.append(r3)
            return
    }
}
