package com.kwad.components.ad.nativead;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.sdk.api.core.AbstractKsNativeAd implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener, com.kwad.components.core.internal.api.a {
    private com.kwad.components.core.internal.api.c bz;
    private android.os.Vibrator gZ;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private volatile com.kwad.sdk.utils.bv mTimerHelper;
    private com.kwad.components.ad.nativead.b.c oG;
    private com.kwad.components.ad.nativead.b.e oH;
    private boolean oM;

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsNativeAd.AdInteractionListener oN;
    private com.kwad.components.ad.nativead.f oO;
    private com.kwad.components.ad.nativead.e oP;

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsNativeAd.VideoPlayListener oQ;
    private boolean oR;
    private int oS;
    private int oT;
    private com.kwad.components.ad.nativead.d.a oU;
    private com.kwad.sdk.api.KsNativeAd.VideoPlayListener oV;
    private com.kwad.components.ad.nativead.d.a oW;











    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void fr();

        boolean handleDownloadDialog(android.content.DialogInterface.OnClickListener r1);

        void m(android.view.View r1);

        void onDownloadTipsDialogDismiss();

        void onDownloadTipsDialogShow();
    }

    public d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.oR = r0
            com.kwad.components.core.internal.api.c r1 = new com.kwad.components.core.internal.api.c
            r1.<init>()
            r2.bz = r1
            r2.oS = r0
            r2.oT = r0
            com.kwad.components.ad.nativead.d$10 r0 = new com.kwad.components.ad.nativead.d$10
            r0.<init>(r2)
            r2.oV = r0
            com.kwad.components.ad.nativead.d$2 r0 = new com.kwad.components.ad.nativead.d$2
            r0.<init>(r2)
            r2.oW = r0
            r2.mAdTemplate = r3
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            r2.mAdInfo = r3
            boolean r3 = com.kwad.sdk.core.response.b.a.aF(r3)
            if (r3 == 0) goto L48
            com.kwad.components.core.e.d.c r3 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r3.<init>(r0)
            r2.mApkDownloadHelper = r3
            r3.setOnShowListener(r2)
            com.kwad.components.core.e.d.c r3 = r2.mApkDownloadHelper
            r3.setOnDismissListener(r2)
            com.kwad.components.core.e.d.c r3 = r2.mApkDownloadHelper
            com.kwad.components.ad.nativead.d$1 r0 = new com.kwad.components.ad.nativead.d$1
            r0.<init>(r2)
            r3.a(r0)
        L48:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.O(r3)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.preloadImage(r3, r0)
            return
    }

    private android.os.Vibrator F(android.content.Context r2) {
            r1 = this;
            android.os.Vibrator r0 = r1.gZ
            if (r0 != 0) goto Le
            java.lang.String r0 = "vibrator"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.os.Vibrator r2 = (android.os.Vibrator) r2
            r1.gZ = r2
        Le:
            android.os.Vibrator r2 = r1.gZ
            return r2
    }

    private static int[] S(int r4) {
            r0 = 3
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L13
            r0 = 4
            if (r4 == r0) goto L13
            r0 = 5
            if (r4 == r0) goto L10
            r0 = 6
            if (r4 == r0) goto L10
            r0 = 0
            goto L14
        L10:
            r0 = 0
            r2 = 1
            goto L14
        L13:
            r0 = 1
        L14:
            r3 = 2
            int r4 = r4 % r3
            if (r4 != 0) goto L19
            r1 = 2
        L19:
            int[] r4 = new int[]{r1, r2, r0}
            return r4
    }

    static /* synthetic */ android.os.Vibrator a(com.kwad.components.ad.nativead.d r0, android.content.Context r1) {
            android.os.Vibrator r0 = r0.F(r1)
            return r0
    }

    private android.view.View a(android.content.Context r4, @androidx.annotation.NonNull com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r5) {
            r3 = this;
            java.lang.Class<com.kwad.components.core.o.a.b.a> r0 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.core.o.a.b.a r0 = (com.kwad.components.core.o.a.b.a) r0
            if (r0 == 0) goto L34
            boolean r0 = r0.qu()
            if (r0 != 0) goto L11
            goto L34
        L11:
            com.kwad.components.ad.nativead.e r0 = r3.oP
            if (r0 != 0) goto L31
            com.kwad.components.ad.nativead.e r0 = new com.kwad.components.ad.nativead.e
            r0.<init>(r4)
            r3.oP = r0
            com.kwad.components.ad.nativead.d$a r1 = r3.oW
            r0.setInnerAdInteractionListener(r1)
            com.kwad.components.ad.nativead.e r0 = r3.oP
            com.kwad.sdk.api.KsNativeAd$VideoPlayListener r1 = r3.oV
            r0.setVideoPlayListener(r1)
            com.kwad.components.ad.nativead.e r0 = r3.oP
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.components.core.e.d.c r2 = r3.mApkDownloadHelper
            r0.a(r4, r1, r2, r5)
        L31:
            com.kwad.components.ad.nativead.e r4 = r3.oP
            return r4
        L34:
            r4 = 0
            return r4
    }

    static /* synthetic */ com.kwad.components.ad.nativead.d.a a(com.kwad.components.ad.nativead.d r0) {
            com.kwad.components.ad.nativead.d$a r0 = r0.oW
            return r0
    }

    private void a(@androidx.annotation.Nullable android.app.Activity r4, android.view.View r5, com.kwad.sdk.utils.aj.a r6, int r7, boolean r8, int r9) {
            r3 = this;
            if (r4 != 0) goto L6
            android.content.Context r4 = r5.getContext()
        L6:
            android.content.Context r4 = com.kwad.sdk.o.m.wrapContextIfNeed(r4)
            com.kwad.components.ad.nativead.e r0 = r3.oP
            if (r0 == 0) goto L17
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.hR
            if (r0 == 0) goto L17
            long r0 = r0.getPlayDuration()
            goto L26
        L17:
            com.kwad.components.ad.nativead.f r0 = r3.oO
            if (r0 == 0) goto L24
            com.kwad.components.ad.nativead.c.a r0 = r0.pr
            if (r0 == 0) goto L24
            long r0 = r0.getPlayDuration()
            goto L26
        L24:
            r0 = 0
        L26:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            r2.<init>(r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.components.core.e.d.a$a r4 = r2.aB(r4)
            com.kwad.components.core.e.d.c r2 = r3.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r4 = r4.b(r2)
            com.kwad.components.core.e.d.a$a r4 = r4.aE(r7)
            r7 = 1
            com.kwad.components.core.e.d.a$a r4 = r4.aq(r7)
            com.kwad.components.core.e.d.a$a r4 = r4.A(r0)
            com.kwad.components.core.e.d.a$a r4 = r4.ax(r8)
            com.kwad.components.ad.nativead.d$5 r7 = new com.kwad.components.ad.nativead.d$5
            r7.<init>(r3, r6, r9, r5)
            com.kwad.components.core.e.d.a$a r4 = r4.a(r7)
            com.kwad.components.core.e.d.a.a(r4)
            return
    }

    private void a(android.app.Activity r9, @androidx.annotation.NonNull android.view.ViewGroup r10, int r11, android.view.View r12, boolean r13) {
            r8 = this;
            com.kwad.sdk.utils.aj$a r2 = new com.kwad.sdk.utils.aj$a
            r2.<init>()
            if (r12 != 0) goto L8
            return
        L8:
            int[] r4 = S(r11)
            boolean r11 = r12 instanceof com.kwad.components.ad.nativead.f
            if (r11 == 0) goto L1c
            com.kwad.components.ad.nativead.f r12 = (com.kwad.components.ad.nativead.f) r12
            r9 = 1
            r9 = r4[r9]
            r10 = 2
            r10 = r4[r10]
            r12.g(r9, r10)
            return
        L1c:
            com.kwad.components.ad.nativead.d$3 r0 = new com.kwad.components.ad.nativead.d$3
            r1 = r8
            r6 = r9
            r3 = r10
            r5 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = r5
            r3 = r6
            r5 = r7
            r9.setOnTouchListener(r0)
            com.kwad.components.ad.nativead.d$4 r0 = new com.kwad.components.ad.nativead.d$4
            r1 = r4
            r4 = r2
            r2 = r1
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnClickListener(r0)
            return
    }

    private void a(@androidx.annotation.Nullable android.app.Activity r8, @androidx.annotation.NonNull android.view.ViewGroup r9, @androidx.annotation.NonNull java.util.List<android.view.View> r10) {
            r7 = this;
            java.util.Iterator r10 = r10.iterator()
        L4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r10.next()
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            r4 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.a(r2, r3, r4, r5, r6)
            goto L4
        L1a:
            return
    }

    private void a(@androidx.annotation.Nullable android.app.Activity r9, @androidx.annotation.NonNull android.view.ViewGroup r10, @androidx.annotation.NonNull java.util.Map<android.view.View, java.lang.Integer> r11) {
            r8 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            r6 = r1
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r1 = r11.get(r6)
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r11.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            r7 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r2.a(r3, r4, r5, r6, r7)
            goto L2f
        L2d:
            r3 = r9
            r4 = r10
        L2f:
            r9 = r3
            r10 = r4
            goto L8
        L32:
            return
    }

    private void a(android.view.ViewGroup r4) {
            r3 = this;
            boolean r0 = r3.oM
            r1 = 1
            if (r0 != 0) goto Lc
            r3.oM = r1
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.commercial.d.c.bK(r0)
        Lc:
            boolean r0 = com.kwad.sdk.core.config.e.FK()
            if (r0 != 0) goto L3a
            float r0 = com.kwad.sdk.core.config.e.FJ()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L3a
            c(r4)
            com.kwad.components.core.widget.a r0 = new com.kwad.components.core.widget.a
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1, r4)
            r4.addView(r0)
            r1 = 2
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor.a(r4, r1)
            com.kwad.components.ad.nativead.d$6 r1 = new com.kwad.components.ad.nativead.d$6
            r1.<init>(r3, r4)
            r0.setViewCallback(r1)
            r0.vU()
            return
        L3a:
            com.kwad.components.core.widget.c r0 = b(r4)
            if (r0 != 0) goto L4c
            com.kwad.components.core.widget.c r0 = new com.kwad.components.core.widget.c
            android.content.Context r2 = r4.getContext()
            r0.<init>(r2, r4)
            r4.addView(r0)
        L4c:
            com.kwad.components.ad.nativead.d$7 r2 = new com.kwad.components.ad.nativead.d$7
            r2.<init>(r3, r4)
            r0.setViewCallback(r2)
            r0.setNeedCheckingShow(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.d r0, android.app.Activity r1, android.view.View r2, com.kwad.sdk.utils.aj.a r3, int r4, boolean r5, int r6) {
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.d r0, android.view.View r1) {
            r0.k(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.d r0, com.kwad.sdk.utils.aj.a r1) {
            boolean r0 = r0.b(r1)
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.d r0, boolean r1) {
            r0.oR = r1
            return r1
    }

    private android.view.View b(android.content.Context r3, @androidx.annotation.NonNull com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r4) {
            r2 = this;
            java.lang.String r0 = r2.getVideoUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            java.lang.String r3 = "KsNativeAdControl"
            java.lang.String r4 = "videoUrl is empty"
            com.kwad.sdk.core.d.c.w(r3, r4)
            r3 = 0
            return r3
        L13:
            com.kwad.components.ad.nativead.f r0 = r2.oO
            if (r0 != 0) goto L33
            com.kwad.components.ad.nativead.f r0 = new com.kwad.components.ad.nativead.f
            r0.<init>(r3)
            r2.oO = r0
            com.kwad.components.ad.nativead.d$a r3 = r2.oW
            r0.setInnerAdInteractionListener(r3)
            com.kwad.components.ad.nativead.f r3 = r2.oO
            com.kwad.sdk.api.KsNativeAd$VideoPlayListener r0 = r2.oV
            r3.setVideoPlayListener(r0)
            com.kwad.components.ad.nativead.f r3 = r2.oO
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.components.core.e.d.c r1 = r2.mApkDownloadHelper
            r3.a(r0, r1, r4)
        L33:
            com.kwad.components.ad.nativead.f r3 = r2.oO
            return r3
    }

    private static com.kwad.components.core.widget.c b(android.view.ViewGroup r3) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof com.kwad.components.core.widget.c
            if (r2 == 0) goto L12
            com.kwad.components.core.widget.c r1 = (com.kwad.components.core.widget.c) r1
            return r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r3 = 0
            return r3
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.ad.nativead.d r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.nativead.d r0, android.view.View r1) {
            r0.l(r1)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.nativead.d r0, com.kwad.sdk.utils.aj.a r1) {
            boolean r0 = c(r1)
            return r0
    }

    private boolean b(com.kwad.sdk.utils.aj.a r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.util.List r0 = com.kwad.sdk.core.response.b.a.U(r0)
            boolean r2 = com.kwad.sdk.utils.b.a(r2, r0)
            return r2
    }

    private static void c(android.view.ViewGroup r3) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof com.kwad.components.core.widget.a
            if (r2 == 0) goto L12
            r3.removeView(r1)
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.nativead.d r0) {
            boolean r0 = r0.oR
            return r0
    }

    private static boolean c(com.kwad.sdk.utils.aj.a r5) {
            int r0 = r5.QO()
            int r1 = r5.QQ()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            r1 = 0
            r2 = 1
            r3 = 20
            if (r0 >= r3) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            int r4 = r5.QP()
            int r5 = r5.QR()
            int r4 = r4 - r5
            int r5 = java.lang.Math.abs(r4)
            if (r5 >= r3) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            if (r0 == 0) goto L2d
            if (r5 == 0) goto L2d
            return r2
        L2d:
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo d(com.kwad.components.ad.nativead.d r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c e(com.kwad.components.ad.nativead.d r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.b.e f(com.kwad.components.ad.nativead.d r0) {
            com.kwad.components.ad.nativead.b$e r0 = r0.oH
            return r0
    }

    @androidx.annotation.Nullable
    private com.kwad.components.core.internal.api.d fo() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aV(r0)
            java.lang.String r1 = r0.coverUrl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1a
            com.kwad.components.core.internal.api.d r1 = new com.kwad.components.core.internal.api.d
            int r2 = r0.width
            int r3 = r0.height
            java.lang.String r0 = r0.coverUrl
            r1.<init>(r2, r3, r0)
            return r1
        L1a:
            r0 = 0
            return r0
    }

    private void fp() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate     // Catch: java.lang.Throwable -> Le
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.mAdScene     // Catch: java.lang.Throwable -> Le
            com.kwad.sdk.internal.api.NativeAdExtraDataImpl r0 = r0.nativeAdExtraData     // Catch: java.lang.Throwable -> Le
            int r1 = r0.showLiveStatus     // Catch: java.lang.Throwable -> Le
            r2.oS = r1     // Catch: java.lang.Throwable -> Le
            int r0 = r0.showLiveStyle     // Catch: java.lang.Throwable -> Le
            r2.oT = r0     // Catch: java.lang.Throwable -> Le
        Le:
            return
    }

    private boolean fq() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            int r0 = r0.status
            r1 = 2
            if (r0 == r1) goto Lc
            r1 = 3
            if (r0 == r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.b.c g(com.kwad.components.ad.nativead.d r0) {
            com.kwad.components.ad.nativead.b$c r0 = r0.oG
            return r0
    }

    static /* synthetic */ void h(com.kwad.components.ad.nativead.d r0) {
            r0.fp()
            return
    }

    static /* synthetic */ int i(com.kwad.components.ad.nativead.d r0) {
            int r0 = r0.oT
            return r0
    }

    static /* synthetic */ int j(com.kwad.components.ad.nativead.d r0) {
            int r0 = r0.oS
            return r0
    }

    private void k(android.view.View r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.ai(r0)
            if (r0 != 0) goto L11
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.b.cZ(r0)
            if (r0 != 0) goto L11
            return
        L11:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.b.da(r0)
            float r0 = (float) r0
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L24
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aj(r0)
            float r0 = (float) r0
        L24:
            com.kwad.components.ad.nativead.d$8 r1 = new com.kwad.components.ad.nativead.d$8
            r1.<init>(r3, r4)
            r3.oH = r1
            com.kwad.components.ad.nativead.b r1 = com.kwad.components.ad.nativead.b.fm()
            com.kwad.components.ad.nativead.b$e r2 = r3.oH
            r1.a(r0, r4, r2)
            return
    }

    static /* synthetic */ boolean k(com.kwad.components.ad.nativead.d r0) {
            boolean r0 = r0.fq()
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.c l(com.kwad.components.ad.nativead.d r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    private void l(android.view.View r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$RotateInfo r0 = com.kwad.sdk.core.response.b.b.dm(r0)
            if (r0 == 0) goto L21
            boolean r1 = r0.enable
            if (r1 != 0) goto Ld
            goto L21
        Ld:
            com.kwad.components.ad.nativead.d$9 r1 = new com.kwad.components.ad.nativead.d$9
            r1.<init>(r3, r4)
            r3.oG = r1
            com.kwad.components.ad.nativead.b r1 = com.kwad.components.ad.nativead.b.fm()
            android.content.Context r4 = r4.getContext()
            com.kwad.components.ad.nativead.b$c r2 = r3.oG
            r1.a(r0, r4, r2)
        L21:
            return
    }

    static /* synthetic */ com.kwad.sdk.api.KsNativeAd.VideoPlayListener m(com.kwad.components.ad.nativead.d r0) {
            com.kwad.sdk.api.KsNativeAd$VideoPlayListener r0 = r0.oQ
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsNativeAd.AdInteractionListener n(com.kwad.components.ad.nativead.d r0) {
            com.kwad.sdk.api.KsNativeAd$AdInteractionListener r0 = r0.oN
            return r0
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.b(r2)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final boolean enableRotate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$RotateInfo r0 = com.kwad.sdk.core.response.b.b.dm(r0)
            if (r0 == 0) goto Le
            boolean r0 = r0.enable
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getActionDescription() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAdDescription() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAdSource() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aD(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAdSourceLogoUrl(int r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            r1 = 1
            if (r3 == r1) goto Le
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r3 = r0.adBaseInfo
            java.lang.String r3 = r3.adMarkIcon
            return r3
        Le:
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r3 = r0.adBaseInfo
            java.lang.String r3 = r3.adGrayMarkIcon
            return r3
    }

    @Override // com.kwad.components.core.internal.api.a
    @androidx.annotation.NonNull
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAppDownloadCountDes() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.az(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAppIconUrl() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.co(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final java.lang.String getAppName() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.av(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAppPackageName() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ay(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final long getAppPackageSize() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            long r0 = com.kwad.sdk.core.response.b.a.bJ(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAppPrivacyUrl() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bH(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final float getAppScore() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            float r0 = com.kwad.sdk.core.response.b.a.aA(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getAppVersion() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bI(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getCorporationName() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bC(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getECPM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aR(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.util.List<com.kwad.sdk.api.KsImage> getImageList() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r7.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            com.kwad.sdk.core.response.model.AdInfo r2 = r7.mAdInfo
            int r2 = com.kwad.sdk.core.response.b.a.be(r2)
            r3 = 2
            if (r2 == r3) goto L17
            r4 = 3
            if (r2 != r4) goto L46
        L17:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo r1 = r1.adMaterialInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature> r1 = r1.materialFeatureList
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r2 = (com.kwad.sdk.core.response.model.AdInfo.AdMaterialInfo.MaterialFeature) r2
            int r4 = r2.featureType
            if (r4 != r3) goto L1f
            java.lang.String r4 = r2.materialUrl
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L1f
            com.kwad.components.core.internal.api.d r4 = new com.kwad.components.core.internal.api.d
            int r5 = r2.width
            int r6 = r2.height
            java.lang.String r2 = r2.materialUrl
            r4.<init>(r5, r6, r2)
            r0.add(r4)
            goto L1f
        L46:
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getInteractionType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aQ(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getIntroductionInfo() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bF(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getIntroductionInfoUrl() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bG(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final com.kwad.sdk.api.model.KsLiveInfo getLiveInfo() {
            r1 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBx
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 == 0) goto Lf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.api.model.KsLiveInfo r0 = com.kwad.sdk.core.response.b.e.eC(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getMaterialType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = com.kwad.sdk.core.config.e.Ft()
            if (r1 == 0) goto L18
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            long r1 = r1.llsid
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "llsid"
            r0.put(r2, r1)
        L18:
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getPermissionInfo() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bD(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final java.lang.String getPermissionInfoUrl() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bE(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final java.lang.String getProductName() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ax(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final android.view.View getRotateView(android.content.Context r2) {
            r1 = this;
            com.kwad.components.ad.nativead.d.a r0 = r1.oU
            if (r0 != 0) goto L14
            com.kwad.components.ad.nativead.d.a r0 = new com.kwad.components.ad.nativead.d.a
            r0.<init>(r2)
            r1.oU = r0
            r0.fM()
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor.fx()
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor.fw()
        L14:
            com.kwad.components.ad.nativead.d.a r2 = r1.oU
            return r2
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    public final android.graphics.Bitmap getSdkLogo() {
            r2 = this;
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_sdk_logo
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            return r0
    }

    public final synchronized com.kwad.sdk.utils.bv getTimerHelper() {
            r1 = this;
            monitor-enter(r1)
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            com.kwad.sdk.utils.bv r0 = new com.kwad.sdk.utils.bv     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.mTimerHelper = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L13
        Lf:
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r0
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @androidx.annotation.Nullable
    public final /* synthetic */ com.kwad.sdk.api.KsImage getVideoCoverImage() {
            r1 = this;
            com.kwad.components.core.internal.api.d r0 = r1.fo()
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoDuration() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoHeight() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cR(r0)
            if (r0 == 0) goto Lb
            r0 = 1280(0x500, float:1.794E-42)
            return r0
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aV(r0)
            int r0 = r0.videoHeight
            return r0
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final java.lang.String getVideoUrl() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    @androidx.annotation.Nullable
    public final android.view.View getVideoView2(android.content.Context r5, @androidx.annotation.Nullable com.kwad.sdk.api.KsAdVideoPlayConfig r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L73
            com.kwad.sdk.l r1 = com.kwad.sdk.l.Cf()
            boolean r1 = r1.Bn()
            if (r1 != 0) goto Le
            goto L73
        Le:
            android.content.Context r5 = com.kwad.sdk.o.m.wrapContextIfNeed(r5)     // Catch: java.lang.Throwable -> L19
            boolean r1 = r6 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r6 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r6     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r6 = move-exception
            goto L32
        L1b:
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r6 = new com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl     // Catch: java.lang.Throwable -> L19
            r6.<init>()     // Catch: java.lang.Throwable -> L19
        L20:
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo     // Catch: java.lang.Throwable -> L19
            boolean r1 = com.kwad.sdk.core.response.b.a.cR(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2d
            android.view.View r5 = r4.a(r5, r6)     // Catch: java.lang.Throwable -> L19
            return r5
        L2d:
            android.view.View r5 = r4.b(r5, r6)     // Catch: java.lang.Throwable -> L19
            return r5
        L32:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getVideoView fail--context:"
            r2.<init>(r3)
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = "--classloader:"
            r2.append(r3)
            java.lang.ClassLoader r5 = r5.getClassLoader()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            com.kwad.sdk.l r5 = com.kwad.sdk.l.Cf()
            boolean r5 = r5.Bk()
            if (r5 == 0) goto L72
            r1.addSuppressed(r6)
            com.kwad.components.core.d.a.reportSdkCaughtException(r1)
            return r0
        L72:
            throw r6
        L73:
            return r0
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    public final android.view.View getVideoView2(android.content.Context r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto L1f
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Ld
            goto L1f
        Ld:
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r0 = new com.kwad.sdk.api.KsAdVideoPlayConfig$Builder
            r0.<init>()
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r3 = r0.videoSoundEnable(r3)
            com.kwad.sdk.api.KsAdVideoPlayConfig r3 = r3.build()
            android.view.View r2 = r1.getVideoView2(r2, r3)
            return r2
        L1f:
            r2 = 0
            return r2
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoWidth() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cR(r0)
            if (r0 == 0) goto Lb
            r0 = 720(0x2d0, float:1.009E-42)
            return r0
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aV(r0)
            int r0 = r0.videoWidth
            return r0
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            com.kwad.components.ad.nativead.d$a r1 = r0.oW
            r1.onDownloadTipsDialogDismiss()
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r1) {
            r0 = this;
            com.kwad.components.ad.nativead.d$a r1 = r0.oW
            if (r1 == 0) goto L7
            r1.onDownloadTipsDialogShow()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void pauseVideo() {
            r2 = this;
            com.kwad.components.ad.nativead.f r0 = r2.oO
            if (r0 == 0) goto L8
            r1 = 2
            r0.setPlayState(r1)
        L8:
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(android.app.Activity r2, @androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull java.util.List<android.view.View> r4, com.kwad.sdk.api.KsNativeAd.AdInteractionListener r5) {
            r1 = this;
            r0 = 1
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor.a(r3, r0)
            r1.oN = r5
            r1.a(r3)
            r1.a(r2, r3, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(android.app.Activity r2, @androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull java.util.Map<android.view.View, java.lang.Integer> r4, com.kwad.sdk.api.KsNativeAd.AdInteractionListener r5) {
            r1 = this;
            r0 = 1
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor.a(r3, r0)
            r1.oN = r5
            r1.a(r3)
            r1.a(r2, r3, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(@androidx.annotation.NonNull android.view.ViewGroup r2, @androidx.annotation.NonNull java.util.List<android.view.View> r3, com.kwad.sdk.api.KsNativeAd.AdInteractionListener r4) {
            r1 = this;
            r0 = 0
            r1.registerViewForInteraction(r0, r2, r3, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdExposureFailed(int r2, com.kwad.sdk.api.model.AdExposureFailedReason r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.a(r0, r2, r3)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdVideoPlayEnd() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.getAdTemplate()
            com.kwad.sdk.core.adlog.c.bY(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdVideoPlayStart() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.getAdTemplate()
            com.kwad.sdk.core.adlog.c.bX(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setBidEcpm(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -1
            r4.setBidEcpm(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setBidEcpm(long r2, long r4) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r0.mBidEcpm = r2
            com.kwad.sdk.core.adlog.c.m(r0, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setDownloadListener(com.kwad.sdk.api.KsAppDownloadListener r2) {
            r1 = this;
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.b(r2)
        L9:
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setVideoPlayListener(com.kwad.sdk.api.KsNativeAd.VideoPlayListener r1) {
            r0 = this;
            r0.oQ = r1
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void startVideo() {
            r2 = this;
            com.kwad.components.ad.nativead.f r0 = r2.oO
            if (r0 == 0) goto L8
            r1 = 1
            r0.setPlayState(r1)
        L8:
            return
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void stopVideo() {
            r2 = this;
            com.kwad.components.ad.nativead.f r0 = r2.oO
            if (r0 == 0) goto L8
            r1 = 3
            r0.setPlayState(r1)
        L8:
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean supportPushAd() {
            r1 = this;
            r0 = 1
            return r0
    }
}
