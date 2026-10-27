package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r3 extends com.amap.api.col.s.v3 {

    /* renamed from: b, reason: collision with root package name */
    private int f4668b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f4669c;

    public r3(java.lang.String r1, com.amap.api.col.s.v3 r2) {
            r0 = this;
            r0.<init>(r2)
            r2 = 30
            r0.f4668b = r2
            r0.f4669c = r1
            return
    }

    private static int f(java.lang.String r3) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L13
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L13
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L13
            if (r3 != 0) goto Ld
            return r0
        Ld:
            java.lang.String[] r3 = r1.list()     // Catch: java.lang.Throwable -> L13
            int r3 = r3.length     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            r3 = move-exception
            java.lang.String r1 = "fus"
            java.lang.String r2 = "gfn"
            com.amap.api.col.s.g2.o(r3, r1, r2)
            return r0
    }

    @Override // com.amap.api.col.s.v3
    protected final boolean c() {
            r2 = this;
            java.lang.String r0 = r2.f4669c
            int r0 = f(r0)
            int r1 = r2.f4668b
            if (r0 >= r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 1
            return r0
    }
}
