package com.beizi.ad.v2.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends com.beizi.ad.v2.a.b {
    public static com.beizi.ad.v2.c.b G;
    private com.beizi.ad.a H;




    public b(android.content.Context r2) {
            r1 = this;
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7003e
            r1.<init>(r2, r0)
            return
    }

    static /* synthetic */ com.beizi.ad.a a(com.beizi.ad.v2.c.b r0) {
            com.beizi.ad.a r0 = r0.H
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.v2.c.b r0, boolean r1) {
            r0.f7484g = r1
            return r1
    }

    static /* synthetic */ void b(com.beizi.ad.v2.c.b r0) {
            r0.x()
            return
    }

    private void x() {
            r5 = this;
            com.beizi.ad.internal.f.c r0 = r5.f7480c     // Catch: java.lang.Exception -> L51
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r0.N()     // Catch: java.lang.Exception -> L51
            com.beizi.ad.internal.f.c r2 = r5.f7480c     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = r2.L()     // Catch: java.lang.Exception -> L51
            com.beizi.ad.internal.f.c r3 = r5.f7480c     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = r3.M()     // Catch: java.lang.Exception -> L51
            goto L19
        L16:
            r2 = 0
            r3 = r2
            r0 = 0
        L19:
            r4 = 3
            if (r0 != 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L2a
            com.beizi.ad.a r0 = r5.H     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L51
            r0.a(r4)     // Catch: java.lang.Exception -> L51
            return
        L2a:
            com.beizi.ad.a r0 = r5.H     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L51
            r1 = 1
            r5.f7484g = r1     // Catch: java.lang.Exception -> L51
            r0.a()     // Catch: java.lang.Exception -> L51
            return
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L43
            com.beizi.ad.a r0 = r5.H     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L51
            r0.a(r4)     // Catch: java.lang.Exception -> L51
            return
        L43:
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.a()     // Catch: java.lang.Exception -> L51
            android.content.Context r2 = r5.a     // Catch: java.lang.Exception -> L51
            com.beizi.ad.v2.c.b$1 r4 = new com.beizi.ad.v2.c.b$1     // Catch: java.lang.Exception -> L51
            r4.<init>(r5)     // Catch: java.lang.Exception -> L51
            r0.a(r2, r3, r1, r4)     // Catch: java.lang.Exception -> L51
        L51:
            return
    }

    public void a(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "BeiZisAd"
            java.lang.String r1 = "showInterstitial"
            com.beizi.ad.lance.a.m.c(r0, r1)
            com.beizi.ad.v2.c.b.G = r2
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.beizi.ad.v2.activity.BeiZiNewInterstitialActivity> r1 = com.beizi.ad.v2.activity.BeiZiNewInterstitialActivity.class
            r0.<init>(r3, r1)
            r3.startActivity(r0)
            return
    }

    public void a(com.beizi.ad.a r1) {
            r0 = this;
            r0.H = r1
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void a(com.beizi.ad.internal.f.c r2) {
            r1 = this;
            java.lang.String r0 = r2.e()
            r1.b(r0)
            java.lang.String r0 = r2.f()
            r1.c(r0)
            boolean r2 = r2.P()
            r1.a(r2)
            android.os.Handler r2 = r1.F
            if (r2 == 0) goto L21
            com.beizi.ad.v2.c.b$3 r0 = new com.beizi.ad.v2.c.b$3
            r0.<init>(r1)
            r2.post(r0)
        L21:
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void b(int r3) {
            r2 = this;
            com.beizi.ad.a r0 = r2.H
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
            com.beizi.ad.v2.c.b$2 r1 = new com.beizi.ad.v2.c.b$2
            r1.<init>(r2, r3)
            r0.post(r1)
        L1c:
            return
    }

    public void f(java.lang.String r2) {
            r1 = this;
            com.beizi.ad.a r0 = r1.H
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void q() {
            r1 = this;
            super.q()
            r0 = 0
            com.beizi.ad.v2.c.b.G = r0
            return
    }

    public void u() {
            r2 = this;
            boolean r0 = r2.t
            if (r0 == 0) goto L10
            r0 = 1
            r2.u = r0
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            com.beizi.ad.internal.a.b r1 = r2.r
            r0.a(r1)
        L10:
            com.beizi.ad.a r0 = r2.H
            if (r0 == 0) goto L17
            r0.b()
        L17:
            return
    }

    public void v() {
            r2 = this;
            com.beizi.ad.internal.f.c r0 = r2.f7480c
            if (r0 == 0) goto L8
            r1 = 0
            r0.d(r1)
        L8:
            com.beizi.ad.a r0 = r2.H
            if (r0 == 0) goto Lf
            r0.c()
        Lf:
            return
    }

    public void w() {
            r1 = this;
            com.beizi.ad.a r0 = r1.H
            if (r0 == 0) goto L7
            r0.e()
        L7:
            return
    }
}
