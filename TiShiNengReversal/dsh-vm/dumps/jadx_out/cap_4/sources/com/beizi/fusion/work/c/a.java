package com.beizi.fusion.work.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.c.c {

    /* renamed from: n, reason: collision with root package name */
    protected android.content.Context f179n;

    /* renamed from: o, reason: collision with root package name */
    protected long f180o;

    /* renamed from: p, reason: collision with root package name */
    protected float f181p;

    /* renamed from: q, reason: collision with root package name */
    protected float f182q;

    /* renamed from: r, reason: collision with root package name */
    protected com.beizi.fusion.NativeUnifiedAdResponse f183r;

    /* renamed from: s, reason: collision with root package name */
    protected android.widget.FrameLayout f184s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f185t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f186u;


    public a(android.content.Context r2, long r3, com.beizi.fusion.model.AdSpacesBean.BuyerBean r5, com.beizi.fusion.model.AdSpacesBean.ForwardBean r6, com.beizi.fusion.c.d r7, int r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f185t = r0
            r1.f186u = r0
            r1.f179n = r2
            r1.f180o = r3
            r1.e = r5
            r1.d = r7
            r1.k = r8
            r1.f = r6
            float r3 = com.beizi.fusion.tool.ap.k(r2)
            r1.f181p = r3
            float r2 = com.beizi.fusion.tool.ap.l(r2)
            r1.f182q = r2
            r1.r()
            return
    }

    private void aN() {
            r3 = this;
            com.beizi.fusion.c.d r0 = r3.d
            if (r0 != 0) goto L5
            goto L2d
        L5:
            java.util.Map r0 = r0.n()
            r3.f()
            r0.toString()
            r3.Z()
            com.beizi.fusion.c.e r0 = r3.g
            com.beizi.fusion.c.e r1 = com.beizi.fusion.c.e.a
            if (r0 != r1) goto L26
            r3.aO()
            com.beizi.fusion.c.d r0 = r3.d
            java.lang.String r1 = r3.f()
            r2 = 0
            r0.a(r1, r2)
            return
        L26:
            com.beizi.fusion.c.e r1 = com.beizi.fusion.c.e.b
            if (r0 != r1) goto L2d
            r3.f()
        L2d:
            return
    }

    private void aO() {
            r1 = this;
            com.beizi.fusion.work.c.a$1 r0 = new com.beizi.fusion.work.c.a$1
            r0.<init>(r1)
            r1.f183r = r0
            return
    }

    public void a(android.view.View r1) {
            r0 = this;
            return
    }

    public void a(java.util.List<android.view.View> r1) {
            r0 = this;
            return
    }

    public java.lang.String aA() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String aB() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String aC() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<java.lang.String> aD() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int aE() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String aF() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean aG() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.ViewGroup aH() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.View aI() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void aJ() {
            r0 = this;
            return
    }

    public java.lang.String aK() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.beizi.fusion.model.UnifiedAdDownloadAppInfo aL() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected void aM() {
            r1 = this;
            boolean r0 = r1.Y()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La
            r1.aN()     // Catch: java.lang.Throwable -> Ld
            return
        La:
            r1.P()     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.NativeUnifiedAdResponse as() {
            r1 = this;
            com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.f183r
            return r0
    }

    public void ay() {
            r0 = this;
            return
    }

    public java.lang.String az() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void b() {
            r0 = this;
            return
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
            r2 = this;
            com.beizi.fusion.c.d r0 = r2.d
            if (r0 != 0) goto L5
            goto L35
        L5:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e
            java.lang.String r0 = r0.getAppId()
            r2.h = r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e
            java.lang.String r0 = r0.getSpaceId()
            r2.i = r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e
            java.lang.String r0 = r0.getBuyerSpaceUuId()
            r2.c = r0
            com.beizi.fusion.events.b r0 = r2.a
            if (r0 == 0) goto L35
            com.beizi.fusion.events.a r0 = r0.a()
            java.lang.String r1 = r2.c
            com.beizi.fusion.events.EventBean r0 = r0.a(r1)
            r2.b = r0
            if (r0 == 0) goto L35
            r2.s()
            r2.b()
        L35:
            return
    }

    @Override // com.beizi.fusion.work.a
    public void e() {
            r0 = this;
            return
    }

    @Override // com.beizi.fusion.work.a
    public java.lang.String f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.e.a h() {
            r1 = this;
            com.beizi.fusion.e.a r0 = r1.j
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.model.AdSpacesBean.BuyerBean j() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.e
            return r0
    }

    @Override // com.beizi.fusion.work.a
    protected void k() {
            r0 = this;
            r0.v()
            r0.ab()
            r0.ay()
            return
    }
}
