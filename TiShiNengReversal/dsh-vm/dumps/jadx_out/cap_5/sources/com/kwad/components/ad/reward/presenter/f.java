package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {
    private static long vC;








    static {
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean N(com.kwad.sdk.core.response.model.AdTemplate r1) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r0 = com.kwad.components.ad.reward.a.b.k(r0)
            boolean r1 = com.kwad.sdk.core.response.b.e.k(r1, r0)
            return r1
    }

    private static boolean O(com.kwad.sdk.core.response.model.AdTemplate r0) {
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            return r0
    }

    private static boolean V(com.kwad.sdk.core.response.model.AdTemplate r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.ak(r0)
            return r0
    }

    private static void a(com.kwad.components.ad.reward.g r8, @androidx.annotation.NonNull com.kwad.components.ad.reward.h.b r9) {
            com.kwad.sdk.core.response.model.AdTemplate r3 = r8.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            org.json.JSONObject r4 = r8.mReportExtData
            long r1 = com.kwad.sdk.core.response.b.a.ad(r0)
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2f
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            long r5 = (long) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "观看视频"
            r0.<init>(r5)
            r0.append(r1)
            java.lang.String r1 = "s即可获取奖励"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L31
        L2f:
            java.lang.String r0 = "观看完整视频即可获取奖励"
        L31:
            com.kwad.components.ad.reward.h$c r2 = com.kwad.components.ad.reward.h.a(r8, r0)
            com.kwad.components.ad.reward.presenter.f$7 r0 = new com.kwad.components.ad.reward.presenter.f$7
            r1 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.kwad.components.ad.reward.g.a(r1, r2, r0)
            return
    }

    public static void a(com.kwad.components.ad.reward.g r8, boolean r9) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r8.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = r8.rS
            if (r2 != 0) goto Le
            o(r8)
            return
        Le:
            q(r8)
            boolean r2 = r8.gW()
            r3 = 1
            if (r2 != 0) goto L22
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate
            boolean r2 = V(r2)
            if (r2 == 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            boolean r4 = N(r0)
            if (r4 != 0) goto L77
            boolean r0 = O(r0)
            if (r0 != 0) goto L77
            long r4 = r8.sr
            long r6 = com.kwad.sdk.core.response.b.a.ag(r1)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L3a
            goto L77
        L3a:
            boolean r0 = r8.sl
            if (r0 == 0) goto L42
            r8.iz()
            return
        L42:
            boolean r0 = r8.ss
            if (r0 != 0) goto L57
            long r4 = r8.sr
            long r6 = com.kwad.sdk.core.response.b.a.ag(r1)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L51
            goto L57
        L51:
            if (r9 == 0) goto L56
            r8.iz()
        L56:
            return
        L57:
            boolean r9 = r8.ss
            if (r9 == 0) goto L60
            r9 = 2
            r8.Z(r9)
            goto L63
        L60:
            r8.Z(r3)
        L63:
            y(r8)
            boolean r9 = com.kwad.sdk.core.response.b.a.bW(r1)
            if (r9 == 0) goto L70
            p(r8)
            return
        L70:
            r(r8)
            com.kwad.components.ad.reward.l.j(r8)
            return
        L77:
            if (r2 == 0) goto L82
            com.kwad.components.ad.reward.presenter.f$2 r9 = new com.kwad.components.ad.reward.presenter.f$2
            r9.<init>(r1, r8)
            a(r8, r9)
            return
        L82:
            boolean r9 = com.kwad.sdk.core.response.b.a.bW(r1)
            if (r9 == 0) goto L8c
            p(r8)
            return
        L8c:
            r(r8)
            com.kwad.components.ad.reward.l.j(r8)
            return
    }

    private static boolean a(com.kwad.sdk.core.response.model.AdInfo r3, java.lang.String r4) {
            boolean r0 = com.kwad.components.ad.reward.a.b.hL()
            r1 = 1
            if (r0 != 0) goto Ld
            java.lang.String r3 = "isEnable false"
            com.kwad.sdk.core.d.c.e(r4, r3)
            return r1
        Ld:
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.cW(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L18
            return r1
        L18:
            int r3 = com.kwad.components.ad.reward.a.b.hK()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "JumpDirectMaxCount "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.d.c.d(r4, r0)
            if (r3 > 0) goto L30
            return r1
        L30:
            int r4 = com.kwad.components.ad.reward.h.a.dO()
            if (r4 < r3) goto L37
            return r1
        L37:
            r3 = 0
            return r3
    }

    private static boolean a(java.lang.String r2, com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.sdk.core.response.model.AdInfo r4) {
            boolean r0 = com.kwad.sdk.core.response.b.a.bK(r4)
            r1 = 1
            if (r0 == 0) goto Ld
            java.lang.String r3 = "is playable return"
            com.kwad.sdk.core.d.c.i(r2, r3)
            return r1
        Ld:
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r4)
            if (r0 != 0) goto L19
            java.lang.String r3 = "is not Download type"
            com.kwad.sdk.core.d.c.i(r2, r3)
            return r1
        L19:
            boolean r0 = com.kwad.components.ad.reward.a.b.k(r4)
            boolean r3 = com.kwad.sdk.core.response.b.e.k(r3, r0)
            if (r3 == 0) goto L29
            java.lang.String r3 = "isRewardLaunchAppTask"
            com.kwad.sdk.core.d.c.i(r2, r3)
            return r1
        L29:
            boolean r3 = com.kwad.components.ad.reward.g.g(r4)
            if (r3 == 0) goto L35
            java.lang.String r3 = "is Aggregation return"
            com.kwad.sdk.core.d.c.i(r2, r3)
            return r1
        L35:
            r2 = 0
            return r2
    }

    static /* synthetic */ void e(com.kwad.components.ad.reward.g r0) {
            p(r0)
            return
    }

    static /* synthetic */ void f(com.kwad.components.ad.reward.g r0) {
            s(r0)
            return
    }

    static /* synthetic */ void g(com.kwad.components.ad.reward.g r0) {
            x(r0)
            return
    }

    private static void o(com.kwad.components.ad.reward.g r3) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.bV(r0)
            if (r0 == 0) goto L10
            p(r3)
            return
        L10:
            boolean r0 = r3.rU
            if (r0 == 0) goto L18
            r(r3)
            return
        L18:
            r0 = 1
            r3.rX = r0
            java.util.List<com.kwad.components.ad.reward.k.a> r0 = r3.rL
            com.kwad.components.ad.reward.presenter.f$1 r1 = new com.kwad.components.ad.reward.presenter.f$1
            r1.<init>(r3)
            com.kwad.components.ad.reward.g.a(r0, r1)
            com.kwad.components.ad.reward.e.b r0 = r3.rD
            r1 = 0
            r0.onVideoSkipToEnd(r1)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            org.json.JSONObject r1 = r3.mReportExtData
            com.kwad.sdk.core.adlog.c.i(r0, r1)
            com.kwad.components.ad.reward.m.e r0 = r3.rE
            if (r0 == 0) goto L3a
            r0.release()
        L3a:
            r3.gK()
            u(r3)
            return
    }

    private static void p(com.kwad.components.ad.reward.g r1) {
            com.kwad.components.ad.reward.presenter.f$3 r0 = new com.kwad.components.ad.reward.presenter.f$3
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    private static void q(com.kwad.components.ad.reward.g r9) {
            long r0 = r9.sq
            r2 = 0
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto Le
            long r0 = r0 / r3
            int r1 = (int) r0
            goto Lf
        Le:
            r1 = 0
        Lf:
            long r7 = r9.sr
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L17
            long r7 = r7 / r3
            int r2 = (int) r7
        L17:
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            r3 = 69
            com.kwad.sdk.core.adlog.c.b r0 = r0.df(r3)
            com.kwad.sdk.core.adlog.c.b r0 = r0.di(r1)
            com.kwad.sdk.core.adlog.c.b r0 = r0.dj(r2)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            org.json.JSONObject r9 = r9.mReportExtData
            com.kwad.sdk.core.adlog.c.e(r1, r9, r0)
            return
    }

    public static void r(com.kwad.components.ad.reward.g r3) {
            r0 = 1
            r3.rX = r0
            r3.gX()
            boolean r0 = com.kwad.components.ad.reward.presenter.i.z(r3)
            if (r0 == 0) goto L17
            com.kwad.components.ad.reward.presenter.f$4 r0 = new com.kwad.components.ad.reward.presenter.f$4
            r0.<init>(r3)
            r1 = 200(0xc8, double:9.9E-322)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            return
        L17:
            s(r3)
            return
    }

    private static void s(com.kwad.components.ad.reward.g r2) {
            java.util.List<com.kwad.components.ad.reward.k.a> r0 = r2.rL
            com.kwad.components.ad.reward.presenter.f$5 r1 = new com.kwad.components.ad.reward.presenter.f$5
            r1.<init>(r2)
            com.kwad.components.ad.reward.g.a(r0, r1)
            com.kwad.components.ad.reward.m.e r2 = r2.rE
            if (r2 == 0) goto L11
            r2.skipToEnd()
        L11:
            return
    }

    public static void t(com.kwad.components.ad.reward.g r0) {
            x(r0)
            r0.iz()
            return
    }

    public static void u(com.kwad.components.ad.reward.g r12) {
            java.lang.String r0 = "tryOpenAppMarket"
            java.lang.String r1 = "openAppMarket"
            com.kwad.sdk.core.d.c.d(r1, r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = com.kwad.components.ad.reward.presenter.f.vC
            long r4 = r2 - r4
            r6 = 300(0x12c, double:1.48E-321)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L1b
            java.lang.String r12 = "连续点击"
            com.kwad.sdk.core.d.c.d(r1, r12)
            return
        L1b:
            com.kwad.components.ad.reward.presenter.f.vC = r2
            com.kwad.sdk.core.response.model.AdTemplate r0 = r12.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r3 = a(r2, r1)
            if (r3 == 0) goto L2a
            goto L32
        L2a:
            android.content.Context r12 = r12.mContext
            boolean r3 = a(r1, r0, r2)
            if (r3 == 0) goto L33
        L32:
            return
        L33:
            com.kwad.sdk.core.adlog.c.b r3 = new com.kwad.sdk.core.adlog.c.b
            r3.<init>()
            r4 = 182(0xb6, float:2.55E-43)
            com.kwad.sdk.core.adlog.c.b r3 = r3.dd(r4)
            r4 = 8
            com.kwad.sdk.core.adlog.c.b r3 = r3.dp(r4)
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.cT(r2)
            int r5 = com.kwad.sdk.core.download.a.b.F(r12, r5)
            r6 = 0
            r7 = 1
            if (r5 != r7) goto L52
            r5 = 1
            goto L53
        L52:
            r5 = 0
        L53:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "handleDeepLink dpSuccess: "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.kwad.sdk.core.d.c.i(r1, r8)
            r8 = 0
            java.lang.String r9 = "autoLaunchMarket"
            java.lang.String r10 = "native_id"
            if (r5 == 0) goto L72
            com.kwad.components.ad.reward.j.b.a(r0, r10, r9, r3, r8)
            com.kwad.components.ad.reward.h.a.J(r12)
            return
        L72:
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cW(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r11 = "tryOpenMiAppStore url："
            r5.<init>(r11)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.kwad.sdk.core.d.c.i(r1, r5)
            boolean r2 = com.kwad.sdk.utils.e.a(r12, r2, r0)
            if (r2 == 0) goto L97
            com.kwad.components.ad.reward.j.b.a(r0, r10, r9, r3, r8)
            com.kwad.sdk.core.adlog.c.h(r0, r7, r4)
            com.kwad.components.ad.reward.h.a.J(r12)
            return
        L97:
            boolean r2 = com.kwad.sdk.utils.e.i(r12, r0)
            if (r2 == 0) goto La7
            com.kwad.components.ad.reward.j.b.a(r0, r10, r9, r3, r8)
            com.kwad.sdk.core.adlog.c.h(r0, r6, r4)
            com.kwad.components.ad.reward.h.a.J(r12)
            return
        La7:
            java.lang.String r12 = "tryOpenMiAppStore failed"
            com.kwad.sdk.core.d.c.i(r1, r12)
            return
    }

    public static void v(com.kwad.components.ad.reward.g r5) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = r5.rS
            if (r2 != 0) goto L11
            x(r5)
            r5.iz()
            return
        L11:
            boolean r2 = N(r0)
            if (r2 != 0) goto L36
            boolean r0 = O(r0)
            if (r0 == 0) goto L1e
            goto L36
        L1e:
            long r0 = com.kwad.sdk.core.response.b.a.ag(r1)
            boolean r2 = r5.ss
            if (r2 != 0) goto L2c
            long r2 = r5.sr
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L2f
        L2c:
            y(r5)
        L2f:
            x(r5)
            r5.iz()
            return
        L36:
            q(r5)
            boolean r0 = r5.gW()
            if (r0 != 0) goto L4f
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            boolean r0 = V(r0)
            if (r0 == 0) goto L4f
            boolean r0 = r5.rX
            if (r0 != 0) goto L4f
            w(r5)
            return
        L4f:
            x(r5)
            r5.iz()
            return
    }

    private static void w(com.kwad.components.ad.reward.g r3) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 0
            com.kwad.components.ad.reward.h$c r1 = com.kwad.components.ad.reward.h.a(r3, r1)
            com.kwad.components.ad.reward.presenter.f$6 r2 = new com.kwad.components.ad.reward.presenter.f$6
            r2.<init>(r3, r0)
            com.kwad.components.ad.reward.g.a(r3, r1, r2)
            return
    }

    private static void x(com.kwad.components.ad.reward.g r1) {
            com.kwad.components.ad.reward.e.b r1 = r1.rD
            r0 = 0
            r1.i(r0)
            return
    }

    private static void y(com.kwad.components.ad.reward.g r0) {
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.onRewardVerify()
            return
    }
}
