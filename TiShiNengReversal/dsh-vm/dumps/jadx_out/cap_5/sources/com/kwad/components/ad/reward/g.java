package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.core.m.a {

    @androidx.annotation.Nullable
    public com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView dD;
    public boolean iH;
    private android.os.Handler iK;
    public boolean jk;
    public com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    public com.kwad.components.ad.reward.e.d mAdRewardStepListener;

    @androidx.annotation.Nullable
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    public boolean mCheckExposureResult;
    public long mPageEnterTime;

    @androidx.annotation.Nullable
    public org.json.JSONObject mReportExtData;
    private boolean mRewardVerifyCalled;

    @androidx.annotation.NonNull
    public com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    public int mScreenOrientation;
    public com.kwad.sdk.utils.bv mTimerHelper;

    @androidx.annotation.NonNull
    public com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;
    public boolean mw;
    public boolean rC;

    @androidx.annotation.NonNull
    public com.kwad.components.ad.reward.e.b rD;
    public com.kwad.components.ad.reward.m.e rE;

    @androidx.annotation.Nullable
    public com.kwad.components.core.playable.a rF;

    @androidx.annotation.NonNull
    public com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl rG;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.reward.j rH;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.l.a rI;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.reward.d rJ;
    private final java.util.PriorityQueue<com.kwad.components.ad.reward.e.g> rK;
    public final java.util.List<com.kwad.components.ad.reward.k.a> rL;
    private final java.util.List<com.kwad.components.ad.reward.k.s> rM;
    private final java.util.List<com.kwad.components.ad.reward.m.c> rN;
    public java.util.Set<com.kwad.components.ad.reward.e.e> rO;

    @androidx.annotation.Nullable
    private com.kwad.components.core.webview.tachikoma.f.a rP;
    private boolean rQ;
    private boolean rR;
    public boolean rS;
    public boolean rT;
    public boolean rU;
    public boolean rV;
    private boolean rW;
    public boolean rX;
    public boolean rY;
    public java.util.List<java.lang.Integer> rZ;
    private java.util.List<com.kwad.components.ad.reward.g.b> sA;
    private java.util.List<com.kwad.components.core.j.a.InterfaceC0078a> sB;
    public int sa;
    public int sb;
    public int sc;
    public boolean sd;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.reward.n.p se;
    public boolean sf;

    @androidx.annotation.Nullable
    private com.kwad.components.core.playable.PlayableSource sg;
    private boolean sh;
    public long si;
    private java.util.List<android.content.DialogInterface.OnDismissListener> sj;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.reward.e.o sk;
    public boolean sl;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.reward.l.b.a sm;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.reward.l.a.a sn;
    public int so;
    private int sp;
    public long sq;
    public long sr;
    public boolean ss;
    private boolean st;
    private boolean su;
    public boolean sv;
    public boolean sw;

    @androidx.annotation.NonNull
    public com.kwad.components.ad.reward.LoadStrategy sx;
    private com.kwad.components.ad.reward.RewardRenderResult sy;
    private java.util.List<com.kwad.components.ad.reward.g.a> sz;













    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void hd();

        void he();

        void hf();

        void hg();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        boolean interceptPlayCardResume();
    }

    public g(com.kwad.components.core.m.b<?> r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.rC = r3
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>()
            r2.rK = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.rL = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.rM = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.rN = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.rO = r0
            r2.rQ = r3
            r2.rR = r3
            r2.rT = r3
            r2.rU = r3
            r2.rV = r3
            r2.rW = r3
            r2.rX = r3
            r2.mRewardVerifyCalled = r3
            r2.rY = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.rZ = r0
            r0 = 1
            r2.mCheckExposureResult = r0
            r2.sa = r0
            r2.sb = r0
            r2.sc = r3
            r2.sd = r3
            r2.sf = r3
            r0 = 0
            r2.sg = r0
            r2.sh = r3
            r2.jk = r3
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.sj = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r2.sl = r3
            r0 = 2
            r2.sp = r0
            r2.st = r3
            r2.su = r3
            r2.sv = r3
            r2.sw = r3
            com.kwad.components.ad.reward.LoadStrategy r3 = com.kwad.components.ad.reward.LoadStrategy.FULL_TK
            r2.sx = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.sz = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.sA = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.sB = r3
            java.util.List<com.kwad.components.core.m.a.a> r3 = r2.Rt
            com.kwad.components.ad.reward.g$1 r0 = new com.kwad.components.ad.reward.g$1
            r0.<init>(r2)
            r3.add(r0)
            return
    }

    public static boolean N(com.kwad.sdk.core.response.model.AdTemplate r1) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r0 = com.kwad.components.ad.reward.a.b.k(r0)
            boolean r1 = com.kwad.sdk.core.response.b.e.k(r1, r0)
            return r1
    }

    public static boolean O(com.kwad.sdk.core.response.model.AdTemplate r0) {
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            return r0
    }

    public static boolean P(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r0 = com.kwad.sdk.core.response.b.a.cX(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = N(r2)
            if (r0 != 0) goto L1a
            boolean r2 = O(r2)
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r2 = 1
            return r2
    }

    public static long a(long r2, com.kwad.sdk.core.response.model.AdInfo r4) {
            long r0 = com.kwad.sdk.core.response.b.a.ag(r4)
            long r2 = java.lang.Math.min(r0, r2)
            return r2
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.core.j.c a(java.util.List<com.kwad.components.core.j.c> r5, long r6) {
            r0 = 0
            r2 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L27
            if (r5 != 0) goto La
            goto L27
        La:
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r5.next()
            com.kwad.components.core.j.c r0 = (com.kwad.components.core.j.c) r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.getAdTemplate()
            long r3 = com.kwad.sdk.core.response.b.e.ev(r1)
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto Le
            return r0
        L27:
            return r2
    }

    private void a(int r3, com.kwad.sdk.core.adlog.c.b r4) {
            r2 = this;
            if (r4 != 0) goto L7
            com.kwad.sdk.core.adlog.c.b r4 = new com.kwad.sdk.core.adlog.c.b
            r4.<init>()
        L7:
            r4.dd(r3)
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r2.mRootContainer
            com.kwad.sdk.utils.aj$a r3 = r3.getTouchCoords()
            r4.f(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            org.json.JSONObject r0 = r2.mReportExtData
            r1 = 0
            com.kwad.components.ad.reward.j.b.a(r3, r1, r1, r4, r0)
            com.kwad.components.ad.reward.c.a r3 = com.kwad.components.ad.reward.c.a.hV()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            int r0 = com.kwad.components.ad.reward.c.b.STATUS_NONE
            r3.c(r4, r0)
            com.kwad.components.ad.reward.e.b r3 = r2.rD
            r3.cW()
            return
    }

    public static void a(android.app.Activity r7, com.kwad.components.ad.reward.g r8) {
            java.lang.String r0 = "RewardCallerContext"
            java.lang.String r1 = "showExtraDialog"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.m.e r0 = r8.rE
            long r3 = r0.getPlayDuration()
            com.kwad.components.ad.reward.g$3 r5 = new com.kwad.components.ad.reward.g$3
            r5.<init>(r8)
            com.kwad.components.ad.reward.g$4 r6 = new com.kwad.components.ad.reward.g$4
            r6.<init>(r8)
            r2 = r7
            r1 = r8
            com.kwad.components.ad.reward.k.a.b.a(r1, r2, r3, r5, r6)
            return
    }

    public static void a(android.content.Context r9, com.kwad.components.ad.reward.g r10, android.view.ViewGroup r11) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r10.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.Class<com.kwad.components.core.o.a.b.a> r1 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r1 = com.kwad.sdk.components.d.f(r1)
            r2 = r1
            com.kwad.components.core.o.a.b.a r2 = (com.kwad.components.core.o.a.b.a) r2
            if (r2 == 0) goto L66
            boolean r1 = r2.qu()
            if (r1 == 0) goto L66
            com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.cR(r1)
            if (r1 == 0) goto L66
            int r1 = com.kwad.sdk.core.response.b.a.bf(r0)
            r3 = 8
            if (r1 != r3) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r9 = com.kwad.components.ad.j.c.a(r2, r9, r1)     // Catch: java.lang.Throwable -> L34
        L32:
            r3 = r9
            goto L36
        L34:
            r9 = 0
            goto L32
        L36:
            if (r3 == 0) goto L66
            android.view.View r9 = r3.getView()
            r10.dD = r3
            r11.addView(r9)
            java.lang.String r4 = com.kwad.sdk.service.ServiceProvider.getAppId()
            long r5 = com.kwad.sdk.core.response.b.a.cp(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.cq(r0)
            long r7 = com.kwad.sdk.core.response.b.a.cr(r0)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r9 = r2.getAdLivePlayModule(r3, r4, r5, r6, r7)
            com.kwad.components.ad.reward.f.a r11 = new com.kwad.components.ad.reward.f.a
            com.kwad.sdk.core.response.model.AdTemplate r0 = r10.mAdTemplate
            r11.<init>(r0, r9)
            com.kwad.components.ad.reward.m.e r9 = r10.rE
            r10 = 2
            r9.a(r10, r11)
        L66:
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.g r0, int r1, com.kwad.sdk.core.adlog.c.b r2) {
            r0.a(r1, r2)
            return
    }

    public static void a(com.kwad.components.ad.reward.g r8, com.kwad.components.ad.reward.h.c r9, com.kwad.components.ad.reward.h.a r10) {
            com.kwad.components.ad.reward.m.e r0 = r8.rE
            boolean r0 = r0.kW()
            r1 = 0
            if (r0 != 0) goto L26
            com.kwad.sdk.core.response.model.AdTemplate r0 = r8.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = com.kwad.components.ad.reward.a.b.j(r0)
            if (r2 != 0) goto L1c
            int r0 = com.kwad.sdk.core.response.b.a.cj(r0)
            r2 = 2
            if (r0 != r2) goto L20
        L1c:
            com.kwad.components.ad.reward.k.a.b r1 = c(r8)
        L20:
            if (r1 != 0) goto L26
            com.kwad.components.ad.reward.k.a.b r1 = d(r8)
        L26:
            r2 = r1
            if (r2 == 0) goto L3d
            android.app.Activity r3 = r8.getActivity()
            com.kwad.components.ad.reward.m.e r0 = r8.rE
            long r4 = r0.getPlayDuration()
            com.kwad.components.ad.reward.g$12 r7 = new com.kwad.components.ad.reward.g$12
            r7.<init>(r8, r9, r10)
            r6 = r10
            com.kwad.components.ad.reward.k.a.b.a(r2, r3, r4, r6, r7)
            return
        L3d:
            r6 = r10
            b(r8, r9, r6)
            return
    }

    public static <T> void a(java.util.List<T> r1, com.kwad.sdk.g.a<T> r2) {
            if (r1 == 0) goto L14
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            r2.accept(r0)
            goto L6
        L14:
            return
    }

    private static void b(com.kwad.components.ad.reward.g r3, com.kwad.components.ad.reward.h.c r4, com.kwad.components.ad.reward.h.a r5) {
            boolean r0 = b(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "showNativeCloseDialog isCloseDialogShowing: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RewardCallerContext"
            com.kwad.sdk.core.d.c.d(r2, r1)
            if (r0 == 0) goto L1a
            return
        L1a:
            android.app.Activity r0 = r3.getActivity()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.mAdTemplate
            com.kwad.components.ad.reward.h.a(r0, r3, r4, r5)
            return
    }

    public static boolean b(com.kwad.components.ad.reward.g r0) {
            boolean r0 = r0.rQ
            return r0
    }

    private static com.kwad.components.ad.reward.k.a.b c(com.kwad.components.ad.reward.g r2) {
            com.kwad.components.core.webview.tachikoma.d.e$b r0 = new com.kwad.components.core.webview.tachikoma.d.e$b
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r2.mAdResultData
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.dO(r1)
            r0.bg(r1)
            r1 = 0
            r0.aZ(r1)
            r1 = 1
            r0.ba(r1)
            com.kwad.components.ad.reward.k.a.b r2 = com.kwad.components.ad.reward.k.a.b.a(r2, r0)
            return r2
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.g r0, com.kwad.components.ad.reward.h.c r1, com.kwad.components.ad.reward.h.a r2) {
            b(r0, r1, r2)
            return
    }

    private static com.kwad.components.ad.reward.k.a.b d(com.kwad.components.ad.reward.g r2) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.cj(r0)
            r1 = 4
            if (r0 == r1) goto L1d
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.cj(r0)
            r1 = 3
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            com.kwad.components.ad.reward.k.a.b r2 = c(r2)
            return r2
    }

    static /* synthetic */ void e(com.kwad.components.ad.reward.g r0) {
            r0.gC()
            return
    }

    static /* synthetic */ void f(com.kwad.components.ad.reward.g r0) {
            r0.gF()
            return
    }

    static /* synthetic */ void g(com.kwad.components.ad.reward.g r0) {
            r0.gL()
            return
    }

    public static boolean g(com.kwad.sdk.core.response.model.AdInfo r1) {
            boolean r0 = com.kwad.sdk.core.response.b.b.g(r1)
            if (r0 == 0) goto Le
            boolean r1 = com.kwad.components.ad.reward.a.b.k(r1)
            if (r1 != 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private void gC() {
            r2 = this;
            java.util.List<com.kwad.components.ad.reward.g$a> r0 = r2.sz
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.g$a r1 = (com.kwad.components.ad.reward.g.a) r1
            r1.hd()
            goto L6
        L16:
            return
    }

    private void gF() {
            r2 = this;
            java.util.List<com.kwad.components.ad.reward.g$a> r0 = r2.sz
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.g$a r1 = (com.kwad.components.ad.reward.g.a) r1
            r1.hg()
            goto L6
        L16:
            return
    }

    private void gJ() {
            r1 = this;
            java.util.PriorityQueue<com.kwad.components.ad.reward.e.g> r0 = r1.rK
            r0.clear()
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
            if (r0 == 0) goto Lc
            r0.clear()
        Lc:
            com.kwad.components.ad.reward.j r0 = r1.rH
            if (r0 == 0) goto L13
            r0.release()
        L13:
            com.kwad.components.ad.reward.d r0 = r1.rJ
            if (r0 == 0) goto L1a
            r0.release()
        L1a:
            java.util.Set<com.kwad.components.ad.reward.e.e> r0 = r1.rO
            if (r0 == 0) goto L21
            r0.clear()
        L21:
            return
    }

    private void gL() {
            r3 = this;
            java.util.PriorityQueue<com.kwad.components.ad.reward.e.g> r0 = r3.rK     // Catch: java.lang.Throwable -> L17
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L17
            r1 = 0
        L7:
            if (r1 >= r0) goto L1c
            java.util.PriorityQueue<com.kwad.components.ad.reward.e.g> r2 = r3.rK     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L17
            com.kwad.components.ad.reward.e.g r2 = (com.kwad.components.ad.reward.e.g) r2     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2.cX()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L1d
        L19:
            int r1 = r1 + 1
            goto L7
        L1c:
            return
        L1d:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    private static boolean isMainThread() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final void A(boolean r1) {
            r0 = this;
            r0.rR = r1
            if (r1 == 0) goto L8
            r0.gE()
            return
        L8:
            r0.gD()
            return
    }

    public final void B(boolean r1) {
            r0 = this;
            r0.su = r1
            return
    }

    public final void C(boolean r1) {
            r0 = this;
            r1 = 1
            r0.sh = r1
            return
    }

    public final void D(java.lang.String r5) {
            r4 = this;
            r0 = -1
            boolean r1 = com.kwad.sdk.core.config.e.BP()     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L14
            android.app.Activity r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L10
            int r0 = com.kwad.components.ad.reward.j.a.a(r1)     // Catch: java.lang.Throwable -> L10
            goto L14
        L10:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
        L14:
            android.content.Context r1 = r4.mContext
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            org.json.JSONObject r3 = r4.mReportExtData
            com.kwad.components.ad.reward.j.b.a(r1, r2, r5, r0, r3)
            return
    }

    public final void D(boolean r1) {
            r0 = this;
            r1 = 1
            r0.st = r1
            return
    }

    public final void E(boolean r1) {
            r0 = this;
            r0.rQ = r1
            return
    }

    public final void F(boolean r3) {
            r2 = this;
            boolean r0 = r2.mRewardVerifyCalled
            if (r3 == r0) goto Le
            java.util.List<com.kwad.components.ad.reward.k.s> r0 = r2.rM
            com.kwad.components.ad.reward.g$11 r1 = new com.kwad.components.ad.reward.g$11
            r1.<init>(r2, r3)
            a(r0, r1)
        Le:
            r2.mRewardVerifyCalled = r3
            return
    }

    public final void Z(int r1) {
            r0 = this;
            r0.sp = r1
            return
    }

    public final void a(int r1, android.content.Context r2, int r3, int r4) {
            r0 = this;
            r0.b(r1, r2, r3, r4)
            return
    }

    public final void a(int r10, android.content.Context r11, int r12, int r13, long r14) {
            r9 = this;
            r7 = 0
            r8 = 0
            r1 = 1
            r3 = 40
            r4 = 1
            r0 = r9
            r2 = r11
            r5 = r14
            r0.a(r1, r2, r3, r4, r5, r7, r8)
            return
    }

    public final void a(int r1, android.content.Context r2, int r3, int r4, long r5, boolean r7, com.kwad.sdk.core.adlog.c.b r8) {
            r0 = this;
            com.kwad.components.core.e.d.a$a r7 = new com.kwad.components.core.e.d.a$a
            r7.<init>(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r7.aB(r2)
            com.kwad.components.core.e.d.c r7 = r0.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r7)
            r7 = 0
            com.kwad.components.core.e.d.a$a r2 = r2.aq(r7)
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r4)
            com.kwad.components.core.e.d.a$a r2 = r2.A(r5)
            com.kwad.components.core.e.d.a$a r2 = r2.aA(r3)
            com.kwad.components.core.e.d.a$a r1 = r2.az(r1)
            java.lang.String r2 = r0.gI()
            com.kwad.components.core.e.d.a$a r1 = r1.al(r2)
            com.kwad.components.ad.reward.g$8 r2 = new com.kwad.components.ad.reward.g$8
            r2.<init>(r0)
            com.kwad.components.core.e.d.a$a r1 = r1.a(r2)
            com.kwad.components.ad.reward.g$7 r2 = new com.kwad.components.ad.reward.g$7
            r2.<init>(r0, r3, r8)
            com.kwad.components.core.e.d.a$a r1 = r1.a(r2)
            com.kwad.components.core.e.d.a.a(r1)
            return
    }

    public final void a(long r1, long r3, int r5) {
            r0 = this;
            java.util.Set<com.kwad.components.ad.reward.e.e> r1 = r0.rO
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            com.kwad.components.ad.reward.e.e r2 = (com.kwad.components.ad.reward.e.e) r2
            r2.dq()
            goto L6
        L16:
            return
    }

    public final void a(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.List<android.content.DialogInterface$OnDismissListener> r0 = r1.sj
            r0.add(r2)
            return
    }

    public final void a(com.kwad.components.ad.reward.RewardRenderResult r1) {
            r0 = this;
            r0.sy = r1
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.reward.e.o r1) {
            r0 = this;
            r0.sk = r1
            return
    }

    public final void a(com.kwad.components.ad.reward.g.a r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.g$a> r0 = r1.sz
            r0.add(r2)
            return
    }

    public final void a(com.kwad.components.ad.reward.g.b r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.g$b> r0 = r1.sA
            r0.add(r2)
            return
    }

    public final void a(com.kwad.components.ad.reward.k.a r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.k.a> r0 = r1.rL
            r0.add(r2)
            return
    }

    public final void a(com.kwad.components.ad.reward.k.s r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.k.s> r0 = r1.rM
            r0.add(r2)
            return
    }

    public final void a(com.kwad.components.ad.reward.m.c r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.ad.reward.m.c> r0 = r1.rN
            r0.add(r2)
        L7:
            return
    }

    public final void a(com.kwad.components.core.j.a.InterfaceC0078a r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.j.a$a> r0 = r1.sB
            if (r0 == 0) goto L7
            r0.add(r2)
        L7:
            return
    }

    public final void a(com.kwad.components.core.j.c r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            java.lang.String r0 = r0.getUniqueId()
            com.kwad.components.core.j.d r0 = com.kwad.components.ad.reward.e.f.P(r0)
            com.kwad.components.ad.reward.g$9 r1 = new com.kwad.components.ad.reward.g$9
            r1.<init>(r2, r0, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r1)
            return
    }

    public final void a(com.kwad.components.core.webview.tachikoma.f.a r1) {
            r0 = this;
            r0.rP = r1
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            r0.mAdResultData = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            r0.mAdTemplate = r1
            return
    }

    public final void b(int r10, android.content.Context r11, int r12, int r13) {
            r9 = this;
            r7 = 0
            r8 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.a(r1, r2, r3, r4, r5, r7, r8)
            return
    }

    public final void b(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.List<android.content.DialogInterface$OnDismissListener> r0 = r1.sj
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.ad.reward.c.b r3) {
            r2 = this;
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.hV()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.a(r1, r3)
            return
    }

    @androidx.annotation.MainThread
    public final void b(com.kwad.components.ad.reward.e.g r2) {
            r1 = this;
            java.util.PriorityQueue<com.kwad.components.ad.reward.e.g> r0 = r1.rK
            r0.offer(r2)
            return
    }

    public final void b(com.kwad.components.ad.reward.g.a r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.g$a> r0 = r1.sz
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.ad.reward.g.b r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.g$b> r0 = r1.sA
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.ad.reward.k.a r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.k.a> r0 = r1.rL
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.ad.reward.k.s r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.reward.k.s> r0 = r1.rM
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.ad.reward.m.c r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.ad.reward.m.c> r0 = r1.rN
            r0.remove(r2)
        L7:
            return
    }

    public final void b(com.kwad.components.core.j.a.InterfaceC0078a r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.j.a$a> r0 = r1.sB
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public final void b(com.kwad.components.core.j.c r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            java.lang.String r0 = r0.getUniqueId()
            com.kwad.components.core.j.d r0 = com.kwad.components.ad.reward.e.f.P(r0)
            com.kwad.components.ad.reward.g$10 r1 = new com.kwad.components.ad.reward.g$10
            r1.<init>(r2, r0, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r1)
            return
    }

    @androidx.annotation.MainThread
    public final void c(com.kwad.components.ad.reward.e.g r2) {
            r1 = this;
            java.util.PriorityQueue<com.kwad.components.ad.reward.e.g> r0 = r1.rK
            r0.remove(r2)
            return
    }

    public final void d(android.content.DialogInterface r3) {
            r2 = this;
            java.util.List<android.content.DialogInterface$OnDismissListener> r0 = r2.sj
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            return
    }

    public final void d(@androidx.annotation.Nullable com.kwad.components.core.playable.PlayableSource r1) {
            r0 = this;
            r0.sg = r1
            return
    }

    public final void d(boolean r2, boolean r3) {
            r1 = this;
            com.kwad.components.ad.reward.m.e r0 = r1.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L12
            com.kwad.components.ad.reward.g$2 r0 = new com.kwad.components.ad.reward.g$2
            r0.<init>(r1, r2, r3)
            r2 = 500(0x1f4, double:2.47E-321)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r2)
        L12:
            return
    }

    public final void gD() {
            r3 = this;
            boolean r0 = r3.rR
            if (r0 != 0) goto L3f
            boolean r0 = r3.rQ
            if (r0 != 0) goto L3f
            boolean r0 = r3.st
            if (r0 == 0) goto Ld
            goto L3f
        Ld:
            java.util.List<com.kwad.components.ad.reward.g$b> r0 = r3.sA
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            com.kwad.components.ad.reward.g$b r2 = (com.kwad.components.ad.reward.g.b) r2
            boolean r2 = r2.interceptPlayCardResume()
            r1 = r1 | r2
            goto L14
        L26:
            if (r1 == 0) goto L29
            goto L3f
        L29:
            java.util.List<com.kwad.components.ad.reward.g$a> r0 = r3.sz
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.g$a r1 = (com.kwad.components.ad.reward.g.a) r1
            r1.he()
            goto L2f
        L3f:
            return
    }

    public final void gE() {
            r2 = this;
            java.util.List<com.kwad.components.ad.reward.g$a> r0 = r2.sz
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.g$a r1 = (com.kwad.components.ad.reward.g.a) r1
            r1.hf()
            goto L6
        L16:
            return
    }

    public final boolean gG() {
            r1 = this;
            boolean r0 = r1.rR
            return r0
    }

    public final void gH() {
            r2 = this;
            java.util.List<com.kwad.components.ad.reward.m.c> r0 = r2.rN
            com.kwad.components.ad.reward.g$5 r1 = new com.kwad.components.ad.reward.g$5
            r1.<init>(r2)
            a(r0, r1)
            return
    }

    @androidx.annotation.Nullable
    public final java.lang.String gI() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.TKAdLiveShopItemInfo r0 = r0.tkLiveShopItemInfo
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r0.itemId
            return r0
    }

    public final void gK() {
            r2 = this;
            boolean r0 = isMainThread()
            if (r0 == 0) goto La
            r2.gL()
            return
        La:
            android.os.Handler r0 = r2.iK
            com.kwad.components.ad.reward.g$6 r1 = new com.kwad.components.ad.reward.g$6
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public final boolean gM() {
            r1 = this;
            boolean r0 = r1.su
            return r0
    }

    public final void gN() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.f.a r0 = r1.rP
            if (r0 != 0) goto L5
            return
        L5:
            r0.kk()
            return
    }

    public final boolean gO() {
            r1 = this;
            boolean r0 = r1.rW
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.components.core.playable.PlayableSource gP() {
            r1 = this;
            com.kwad.components.core.playable.PlayableSource r0 = r1.sg
            return r0
    }

    public final boolean gQ() {
            r1 = this;
            boolean r0 = r1.sh
            return r0
    }

    public final java.util.List<com.kwad.components.core.j.a.InterfaceC0078a> gR() {
            r1 = this;
            java.util.List<com.kwad.components.core.j.a$a> r0 = r1.sB
            return r0
    }

    public final com.kwad.components.ad.reward.RewardRenderResult gS() {
            r1 = this;
            com.kwad.components.ad.reward.RewardRenderResult r0 = r1.sy
            return r0
    }

    public final boolean gT() {
            r2 = this;
            com.kwad.components.ad.reward.RewardRenderResult r0 = com.kwad.components.ad.reward.RewardRenderResult.NEO_TK
            com.kwad.components.ad.reward.RewardRenderResult r1 = r2.sy
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final boolean gU() {
            r1 = this;
            boolean r0 = r1.st
            return r0
    }

    public final boolean gV() {
            r1 = this;
            boolean r0 = r1.rQ
            return r0
    }

    public final boolean gW() {
            r1 = this;
            boolean r0 = r1.mRewardVerifyCalled
            return r0
    }

    public final void gX() {
            r5 = this;
            long r0 = r5.sr
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r1 = (int) r0
            goto Le
        Ld:
            r1 = 0
        Le:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r0)
            int r2 = com.kwad.sdk.core.response.b.a.ae(r2)
            com.kwad.sdk.core.adlog.c.i(r0, r2, r1)
            return
    }

    @Override // com.kwad.components.core.m.a, com.kwad.sdk.mvp.a
    public final void release() {
            r1 = this;
            r1.gJ()
            com.kwad.components.ad.reward.m.e r0 = r1.rE
            if (r0 == 0) goto La
            r0.release()
        La:
            return
    }
}
