package com.kwad.components.ad.reward.presenter.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b {
    private java.util.List<java.lang.Integer> ck;
    private volatile boolean eE;
    private android.os.Handler iK;
    private com.kwad.components.core.video.m jE;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private long si;
    private com.kwad.components.core.video.m vQ;
    private com.kwad.components.core.video.m vR;
    private final com.kwad.components.core.video.j xp;
    private boolean xq;
    private java.lang.Runnable xr;





    public a() {
            r2 = this;
            r2.<init>()
            com.kwad.components.core.video.j r0 = new com.kwad.components.core.video.j
            r0.<init>()
            r2.xp = r0
            r0 = 0
            r2.si = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r0 = 1
            r2.xq = r0
            r0 = 0
            r2.eE = r0
            com.kwad.components.ad.reward.presenter.c.a$1 r0 = new com.kwad.components.ad.reward.presenter.c.a$1
            r0.<init>(r2)
            r2.xr = r0
            com.kwad.components.ad.reward.presenter.c.a$2 r0 = new com.kwad.components.ad.reward.presenter.c.a$2
            r0.<init>(r2)
            r2.vR = r0
            com.kwad.components.ad.reward.presenter.c.a$3 r0 = new com.kwad.components.ad.reward.presenter.c.a$3
            r0.<init>(r2)
            r2.jE = r0
            return
    }

    static /* synthetic */ com.kwad.components.core.video.j a(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.core.video.j r0 = r0.xp
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.c.a r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.c.a r0, boolean r1) {
            r1 = 0
            r0.xq = r1
            return r1
    }

    static /* synthetic */ long b(com.kwad.components.ad.reward.presenter.c.a r0, long r1) {
            r0.si = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.presenter.c.a r0, boolean r1) {
            r1 = 1
            r0.eE = r1
            return r1
    }

    private void c(long r3) {
            r2 = this;
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            java.util.List<java.lang.Integer> r4 = r2.ck
            if (r4 == 0) goto L3b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15
            goto L3b
        L15:
            java.util.List<java.lang.Integer> r4 = r2.ck
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            if (r3 < r1) goto L1b
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            com.kwad.components.ad.reward.g r1 = r2.tm
            org.json.JSONObject r1 = r1.mReportExtData
            com.kwad.sdk.core.adlog.c.a(r4, r3, r1)
            java.util.List<java.lang.Integer> r3 = r2.ck
            r3.remove(r0)
        L3b:
            return
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.reward.presenter.c.a r0) {
            boolean r0 = r0.xq
            return r0
    }

    private void checkExposure() {
            r7 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r7.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdRewardInfo r1 = r0.adRewardInfo
            com.kwad.sdk.core.response.model.AdInfo$CallBackStrategyInfo r1 = r1.callBackStrategyInfo
            int r1 = r1.impressionCheckMs
            long r1 = (long) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L23
            long r3 = com.kwad.sdk.core.response.b.a.ag(r0)
            r5 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L23
            android.os.Handler r0 = r7.iK
            com.kwad.components.ad.reward.presenter.c.a$4 r3 = new com.kwad.components.ad.reward.presenter.c.a$4
            r3.<init>(r7)
            r0.postDelayed(r3, r1)
        L23:
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate e(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g f(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ boolean g(com.kwad.components.ad.reward.presenter.c.a r0) {
            boolean r0 = r0.eE
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate h(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g i(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate j(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g k(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate l(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g m(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate n(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g o(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g p(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g q(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g r(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g s(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate t(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ java.lang.Runnable u(com.kwad.components.ad.reward.presenter.c.a r0) {
            java.lang.Runnable r0 = r0.xr
            return r0
    }

    static /* synthetic */ android.os.Handler v(com.kwad.components.ad.reward.presenter.c.a r0) {
            android.os.Handler r0 = r0.iK
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g w(com.kwad.components.ad.reward.presenter.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r4.ck = r0
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L20
            com.kwad.components.core.video.m r0 = r4.vR
            r4.vQ = r0
            goto L24
        L20:
            com.kwad.components.core.video.m r0 = r4.jE
            r4.vQ = r0
        L24:
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r4.vQ
            r0.a(r1)
            android.os.Handler r0 = r4.iK
            java.lang.Runnable r1 = r4.xr
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
            return
    }

    public final void iH() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            boolean r1 = r0.rS
            if (r1 == 0) goto La
            boolean r1 = r0.rX
            if (r1 != 0) goto L11
        La:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            org.json.JSONObject r0 = r0.mReportExtData
            com.kwad.sdk.core.adlog.c.g(r1, r0)
        L11:
            com.kwad.components.core.video.j r0 = r2.xp
            r0.ue()
            return
    }

    public final void jb() {
            r4 = this;
            r0 = 0
            r4.eE = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            com.kwad.components.ad.reward.model.EcOrderCardStyle r0 = com.kwad.components.ad.reward.model.EcOrderCardStyle.createFromAdInfo(r0)
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            if (r0 == 0) goto L22
            com.kwad.sdk.core.adlog.a$a r2 = new com.kwad.sdk.core.adlog.a$a
            r2.<init>()
            int r0 = r0.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.awY = r0
            r1.b(r2)
        L22:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            boolean r0 = r0.mPvReported
            if (r0 != 0) goto L2b
            r4.checkExposure()
        L2b:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            r2 = 0
            r3 = 1
            com.kwad.components.ad.reward.j.b.a(r3, r0, r2, r1)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.components.ad.reward.g r1 = r4.tm
            org.json.JSONObject r1 = r1.mReportExtData
            com.kwad.sdk.core.adlog.c.f(r0, r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r8 = this;
            super.onUnbind()
            android.os.Handler r0 = r8.iK
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            com.kwad.components.ad.reward.g r0 = r8.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r8.vQ
            r0.b(r1)
            com.kwad.components.core.video.j r0 = r8.xp
            com.kwad.components.core.video.j$a r0 = r0.ug()
            com.kwad.components.core.p.a r1 = com.kwad.components.core.p.a.se()
            com.kwad.components.ad.reward.g r2 = r8.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            long r3 = r8.si
            long r5 = r0.uj()
            int r7 = r0.ui()
            r1.a(r2, r3, r5, r7)
            return
    }
}
