package com.beizi.ad.v2.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends com.beizi.ad.v2.a.b {
    public static com.beizi.ad.v2.f.b G;
    private com.beizi.ad.j H;
    private boolean I;
    private java.lang.String J;




    public b(android.content.Context r2) {
            r1 = this;
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7004f
            r1.<init>(r2, r0)
            r2 = 0
            r1.I = r2
            return
    }

    static /* synthetic */ com.beizi.ad.j a(com.beizi.ad.v2.f.b r0) {
            com.beizi.ad.j r0 = r0.H
            return r0
    }

    static /* synthetic */ java.lang.String a(com.beizi.ad.v2.f.b r0, java.lang.String r1) {
            r0.J = r1
            return r1
    }

    static /* synthetic */ boolean a(com.beizi.ad.v2.f.b r0, boolean r1) {
            r0.I = r1
            return r1
    }

    static /* synthetic */ void b(com.beizi.ad.v2.f.b r0) {
            r0.z()
            return
    }

    private void z() {
            r6 = this;
            com.beizi.ad.internal.f.c r0 = r6.f7480c     // Catch: java.lang.Exception -> L5a
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r0.N()     // Catch: java.lang.Exception -> L5a
            com.beizi.ad.internal.f.c r2 = r6.f7480c     // Catch: java.lang.Exception -> L5a
            java.lang.String r2 = r2.L()     // Catch: java.lang.Exception -> L5a
            com.beizi.ad.internal.f.c r3 = r6.f7480c     // Catch: java.lang.Exception -> L5a
            java.lang.String r3 = r3.M()     // Catch: java.lang.Exception -> L5a
            goto L19
        L16:
            r2 = 0
            r3 = r2
            r0 = 0
        L19:
            r4 = 1
            r5 = 3
            if (r0 != 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L2b
            com.beizi.ad.j r0 = r6.H     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5a
            r0.a(r5)     // Catch: java.lang.Exception -> L5a
            return
        L2b:
            com.beizi.ad.j r0 = r6.H     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5a
            r6.f7484g = r4     // Catch: java.lang.Exception -> L5a
            r0.a()     // Catch: java.lang.Exception -> L5a
            return
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L43
            com.beizi.ad.j r0 = r6.H     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5a
            r0.a(r5)     // Catch: java.lang.Exception -> L5a
            return
        L43:
            com.beizi.ad.j r0 = r6.H     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L4c
            r6.f7484g = r4     // Catch: java.lang.Exception -> L5a
            r0.a()     // Catch: java.lang.Exception -> L5a
        L4c:
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.a()     // Catch: java.lang.Exception -> L5a
            android.content.Context r2 = r6.a     // Catch: java.lang.Exception -> L5a
            com.beizi.ad.v2.f.b$1 r4 = new com.beizi.ad.v2.f.b$1     // Catch: java.lang.Exception -> L5a
            r4.<init>(r6)     // Catch: java.lang.Exception -> L5a
            r0.a(r2, r3, r1, r4)     // Catch: java.lang.Exception -> L5a
        L5a:
            return
    }

    public void a(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "BeiZisAd"
            java.lang.String r1 = "showRewardVideo"
            com.beizi.ad.lance.a.m.c(r0, r1)
            com.beizi.ad.v2.f.b.G = r2
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.beizi.ad.v2.activity.BeiZiNewRewardVideoActivity> r1 = com.beizi.ad.v2.activity.BeiZiNewRewardVideoActivity.class
            r0.<init>(r3, r1)
            r3.startActivity(r0)
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void a(com.beizi.ad.internal.f.c r2) {
            r1 = this;
            if (r2 != 0) goto Lb
            com.beizi.ad.j r2 = r1.H
            if (r2 == 0) goto L2c
            r0 = 3
            r2.a(r0)
            return
        Lb:
            java.lang.String r0 = r2.e()
            r1.b(r0)
            java.lang.String r0 = r2.f()
            r1.c(r0)
            boolean r2 = r2.P()
            r1.a(r2)
            android.os.Handler r2 = r1.F
            if (r2 == 0) goto L2c
            com.beizi.ad.v2.f.b$3 r0 = new com.beizi.ad.v2.f.b$3
            r0.<init>(r1)
            r2.post(r0)
        L2c:
            return
    }

    public void a(com.beizi.ad.j r1) {
            r0 = this;
            r0.H = r1
            return
    }

    public void a(java.lang.String r1, int r2) {
            r0 = this;
            com.beizi.ad.j r1 = r0.H
            if (r1 == 0) goto L8
            r2 = 0
            r1.a(r2)
        L8:
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void b(int r3) {
            r2 = this;
            com.beizi.ad.j r0 = r2.H
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
            com.beizi.ad.v2.f.b$2 r1 = new com.beizi.ad.v2.f.b$2
            r1.<init>(r2, r3)
            r0.post(r1)
        L1c:
            return
    }

    public void f(java.lang.String r2) {
            r1 = this;
            com.beizi.ad.j r0 = r1.H
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
            com.beizi.ad.v2.f.b.G = r0
            return
    }

    public boolean u() {
            r1 = this;
            boolean r0 = r1.I
            return r0
    }

    public java.lang.String v() {
            r1 = this;
            java.lang.String r0 = r1.J
            return r0
    }

    public void w() {
            r2 = this;
            boolean r0 = r2.t
            if (r0 == 0) goto L10
            r0 = 1
            r2.u = r0
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            com.beizi.ad.internal.a.b r1 = r2.r
            r0.a(r1)
        L10:
            com.beizi.ad.j r0 = r2.H
            if (r0 == 0) goto L17
            r0.c()
        L17:
            return
    }

    public void x() {
            r2 = this;
            com.beizi.ad.internal.f.c r0 = r2.f7480c
            if (r0 == 0) goto L8
            r1 = 0
            r0.d(r1)
        L8:
            com.beizi.ad.j r0 = r2.H
            if (r0 == 0) goto Lf
            r0.d()
        Lf:
            return
    }

    public void y() {
            r1 = this;
            com.beizi.ad.j r0 = r1.H
            if (r0 == 0) goto L7
            r0.e()
        L7:
            return
    }
}
