package com.beizi.ad.v2.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends com.beizi.ad.v2.a.b {
    private com.beizi.ad.h G;
    private java.lang.String H;
    private com.beizi.ad.i I;





    public b(android.content.Context r1, java.lang.String r2, int r3) {
            r0 = this;
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.f7005g
            r0.<init>(r1, r2, r3)
            return
    }

    static /* synthetic */ boolean a(com.beizi.ad.v2.d.b r0) {
            boolean r0 = r0.t
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.v2.d.b r0, boolean r1) {
            r0.u = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.internal.a.b b(com.beizi.ad.v2.d.b r0) {
            com.beizi.ad.internal.a.b r0 = r0.r
            return r0
    }

    static /* synthetic */ com.beizi.ad.h c(com.beizi.ad.v2.d.b r0) {
            com.beizi.ad.h r0 = r0.G
            return r0
    }

    static /* synthetic */ com.beizi.ad.i d(com.beizi.ad.v2.d.b r0) {
            com.beizi.ad.i r0 = r0.I
            return r0
    }

    public void a(android.view.View r3, com.beizi.ad.internal.e.e r4) {
            r2 = this;
            com.beizi.ad.i r0 = r2.I
            if (r0 == 0) goto L11
            if (r3 == 0) goto L11
            if (r4 != 0) goto L9
            goto L11
        L9:
            com.beizi.ad.v2.d.b$1 r1 = new com.beizi.ad.v2.d.b$1
            r1.<init>(r2, r4)
            r0.a(r3, r1)
        L11:
            return
    }

    public void a(com.beizi.ad.h r1) {
            r0 = this;
            r0.G = r1
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void a(com.beizi.ad.internal.f.c r2) {
            r1 = this;
            com.beizi.ad.i r0 = r2.a()
            r1.I = r0
            if (r0 != 0) goto L15
            android.os.Handler r2 = r1.F
            if (r2 == 0) goto L51
            com.beizi.ad.v2.d.b$3 r0 = new com.beizi.ad.v2.d.b$3
            r0.<init>(r1)
            r2.post(r0)
            return
        L15:
            java.lang.String r0 = r2.e()
            r1.b(r0)
            java.lang.String r0 = r2.f()
            r1.c(r0)
            boolean r2 = r2.P()
            r1.a(r2)
            com.beizi.ad.i r2 = r1.I
            java.lang.String r2 = r2.m()
            r1.f(r2)
            com.beizi.ad.i r2 = r1.I
            com.beizi.ad.internal.e.a r2 = (com.beizi.ad.internal.e.a) r2
            boolean r0 = r1.t
            r2.c(r0)
            com.beizi.ad.i r2 = r1.I
            com.beizi.ad.internal.e.a r2 = (com.beizi.ad.internal.e.a) r2
            java.lang.String r0 = r1.l
            r2.a(r0)
            android.os.Handler r2 = r1.F
            if (r2 == 0) goto L51
            com.beizi.ad.v2.d.b$4 r0 = new com.beizi.ad.v2.d.b$4
            r0.<init>(r1)
            r2.post(r0)
        L51:
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void b(int r3) {
            r2 = this;
            com.beizi.ad.h r0 = r2.G
            if (r0 == 0) goto L1c
            boolean r0 = r2.f7487j
            if (r0 != 0) goto L1c
            boolean r0 = r2.f7484g
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            r0 = 1
            r2.f7487j = r0
            android.os.Handler r0 = r2.F
            if (r0 == 0) goto L1c
            com.beizi.ad.v2.d.b$2 r1 = new com.beizi.ad.v2.d.b$2
            r1.<init>(r2, r3)
            r0.post(r1)
        L1c:
            return
    }

    public void f(java.lang.String r1) {
            r0 = this;
            r0.H = r1
            return
    }

    public java.lang.String u() {
            r1 = this;
            java.lang.String r0 = r1.H
            return r0
    }
}
