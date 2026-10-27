package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r extends com.kwad.components.core.widget.b<com.kwad.sdk.core.response.model.AdResultData, com.kwad.sdk.core.response.model.AdTemplate> implements com.kwad.sdk.widget.d {
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private com.kwad.components.core.webview.tachikoma.b.o cY;
    private com.kwad.components.core.k.a.b fD;
    private com.kwad.components.core.webview.tachikoma.i fU;
    private com.kwad.components.ad.feed.d.b hf;
    private com.kwad.components.ad.feed.d.InterfaceC0013d hg;
    private long ht;
    private float hu;
    private float hv;
    private com.kwad.components.core.widget.b iG;
    private boolean iH;
    private com.kwad.components.core.widget.b.a iR;
    private com.kwad.sdk.widget.KSFrameLayout jb;
    private com.kwad.components.core.webview.jshandler.az jc;
    private com.kwad.sdk.core.webview.c.c jd;
    private com.kwad.components.ad.feed.widget.r.a je;
    private android.widget.FrameLayout.LayoutParams jf;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private int mHeight;
    private boolean mIsNative;
    private int mWidth;













    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void d(int r1, java.lang.String r2);
    }

    public r(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private r(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private r(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r2, r3)
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            r0.mWidth = r2
            r0.mIsNative = r3
            com.kwad.components.ad.feed.widget.r$9 r2 = new com.kwad.components.ad.feed.widget.r$9
            r2.<init>(r0)
            r0.iR = r2
            r0.init(r1)
            return
    }

    static /* synthetic */ int A(com.kwad.components.ad.feed.widget.r r0) {
            int r0 = r0.mHeight
            return r0
    }

    static /* synthetic */ boolean B(com.kwad.components.ad.feed.widget.r r0) {
            boolean r0 = r0.getMuteStatus()
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az C(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.jc
            return r0
    }

    static /* synthetic */ void D(com.kwad.components.ad.feed.widget.r r0) {
            r0.vW()
            return
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a E(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a F(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a G(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a H(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a I(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a J(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ void K(com.kwad.components.ad.feed.widget.r r0) {
            r0.cT()
            return
    }

    static /* synthetic */ void L(com.kwad.components.ad.feed.widget.r r0) {
            r0.cS()
            return
    }

    static /* synthetic */ void M(com.kwad.components.ad.feed.widget.r r0) {
            r0.cQ()
            return
    }

    static /* synthetic */ void N(com.kwad.components.ad.feed.widget.r r0) {
            r0.cO()
            return
    }

    static /* synthetic */ void O(com.kwad.components.ad.feed.widget.r r0) {
            r0.bN()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate P(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo Q(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate R(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ android.content.Context S(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate T(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo U(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ android.content.Context V(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ android.content.Context W(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsAdVideoPlayConfig X(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r0.bU
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c Y(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.jd
            return r0
    }

    static /* synthetic */ android.content.Context Z(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az a(com.kwad.components.ad.feed.widget.r r0, com.kwad.components.core.webview.jshandler.az r1) {
            r0.jc = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.b.o a(com.kwad.components.ad.feed.widget.r r0, com.kwad.components.core.webview.tachikoma.b.o r1) {
            r0.cY = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.ad.feed.widget.r r0, com.kwad.sdk.core.webview.c.c r1) {
            r0.jd = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.r r0) {
            r0.onRelease()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.r r0, com.kwad.components.core.webview.tachikoma.f.d r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.r r0, com.kwad.sdk.core.adlog.c.b r1) {
            r0.c(r1)
            return
    }

    private void a(com.kwad.components.core.webview.tachikoma.f.d r3) {
            r2 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.b.cY(r0)
            float r0 = (float) r0
            com.kwad.components.ad.feed.d$d r1 = r2.hg
            if (r1 != 0) goto L12
            com.kwad.components.ad.feed.widget.r$3 r1 = new com.kwad.components.ad.feed.widget.r$3
            r1.<init>(r2, r3)
            r2.hg = r1
        L12:
            android.content.Context r3 = r2.mContext
            com.kwad.components.ad.feed.d$d r1 = r2.hg
            com.kwad.components.ad.feed.d.a(r0, r3, r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.feed.widget.r r0, boolean r1, boolean r2) {
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.feed.widget.r r0, boolean r1, boolean r2, com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r3, int r4) {
            boolean r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    private boolean a(boolean r3, boolean r4) {
            r2 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r1 = com.kwad.sdk.core.response.b.a.cc(r0)
            if (r1 == 0) goto Ld
            goto L22
        Ld:
            boolean r1 = com.kwad.sdk.core.response.b.a.cd(r0)
            if (r1 == 0) goto L14
            goto L23
        L14:
            boolean r0 = com.kwad.sdk.core.response.b.a.ce(r0)
            if (r0 == 0) goto L1c
            r3 = 0
            return r3
        L1c:
            boolean r0 = com.kwad.sdk.core.config.e.FA()
            if (r0 == 0) goto L23
        L22:
            return r3
        L23:
            return r4
    }

    private boolean a(boolean r2, boolean r3, com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r4, int r5) {
            r1 = this;
            r0 = 1
            if (r5 == r0) goto L1e
            r0 = 2
            if (r5 == r0) goto L1d
            r0 = 3
            if (r5 == r0) goto L1b
            int r5 = r4.getDataFlowAutoStartValue()
            if (r5 == 0) goto L16
            boolean r4 = r4.isDataFlowAutoStart()
            if (r4 == 0) goto L1d
            goto L1e
        L16:
            boolean r2 = r1.a(r2, r3)
            return r2
        L1b:
            r2 = 0
            return r2
        L1d:
            return r3
        L1e:
            return r2
    }

    static /* synthetic */ android.content.Context aa(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ab(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ac(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ad(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ boolean ae(com.kwad.components.ad.feed.widget.r r0) {
            boolean r0 = r0.mIsNative
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a af(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ag(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ah(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ai(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aj(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ak(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a al(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a am(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a an(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ao(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ap(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a aq(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ar(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate as(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void b(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r2.getActionMasked()
            if (r0 != 0) goto L12
            float r0 = r2.getX()
            r1.hu = r0
            float r2 = r2.getY()
            r1.hv = r2
        L12:
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.feed.widget.r r0, com.kwad.components.core.webview.tachikoma.f.d r1) {
            r0.b(r1)
            return
    }

    private void b(com.kwad.components.core.webview.tachikoma.f.d r3) {
            r2 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$RotateInfo r0 = com.kwad.sdk.core.response.b.b.dl(r0)
            com.kwad.components.ad.feed.d$b r1 = r2.hf
            if (r1 != 0) goto L11
            com.kwad.components.ad.feed.widget.r$4 r1 = new com.kwad.components.ad.feed.widget.r$4
            r1.<init>(r2, r3)
            r2.hf = r1
        L11:
            android.content.Context r3 = r2.mContext
            com.kwad.components.ad.feed.d$b r1 = r2.hf
            com.kwad.components.ad.feed.d.a(r0, r3, r1)
            return
    }

    private void bN() {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.c.n r0 = new com.kwad.components.core.webview.tachikoma.c.n
            r0.<init>()
            boolean r1 = r4.getMuteStatus()
            r0.ahg = r1
            com.kwad.components.core.webview.tachikoma.i r1 = r4.fU
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.String r3 = "setVideoMuteStateListener"
            r1.a(r3, r0, r2)
            return
    }

    static /* synthetic */ void c(com.kwad.components.ad.feed.widget.r r0) {
            r0.cN()
            return
    }

    private void cF() {
            r3 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.b.cY(r0)
            float r0 = (float) r0
            com.kwad.components.ad.feed.d$d r1 = r3.hg
            if (r1 != 0) goto L12
            com.kwad.components.ad.feed.widget.r$11 r1 = new com.kwad.components.ad.feed.widget.r$11
            r1.<init>(r3)
            r3.hg = r1
        L12:
            android.content.Context r1 = r3.mContext
            com.kwad.components.ad.feed.d$d r2 = r3.hg
            com.kwad.components.ad.feed.d.a(r0, r1, r2)
            return
    }

    private void cG() {
            r4 = this;
            boolean r0 = r4.iH
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.iH = r0
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            r1 = 3
            long r2 = r4.getStayTime()
            com.kwad.components.ad.feed.monitor.b.a(r0, r1, r2)
            return
    }

    private void cN() {
            r2 = this;
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.jb
            if (r0 == 0) goto L11
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            com.kwad.sdk.widget.KSFrameLayout r1 = r2.jb
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r0.<init>(r1)
            r2.jf = r0
        L11:
            return
    }

    private void cO() {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            com.kwad.components.ad.feed.widget.r$6 r1 = new com.kwad.components.ad.feed.widget.r$6
            r1.<init>(r4)
            java.lang.String r2 = "setVideoPlayStatusCallback"
            r3 = 0
            r0.a(r2, r3, r1)
            return
    }

    private void cP() {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r0 = r1.jd
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.components.ad.feed.widget.r$7 r0 = new com.kwad.components.ad.feed.widget.r$7
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    private void cQ() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r1.fU
            if (r0 == 0) goto L13
            com.kwad.sdk.components.o r0 = r0.vt()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            com.kwad.components.ad.feed.widget.r$8 r0 = new com.kwad.components.ad.feed.widget.r$8
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
        L13:
            return
    }

    private void cR() {
            r5 = this;
            com.kwad.components.core.widget.b r0 = r5.iG
            if (r0 != 0) goto L67
            r0 = 1
            r5.mIsNative = r0
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            int r1 = com.kwad.sdk.core.response.b.a.be(r1)
            android.content.Context r2 = r5.mContext
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            int r4 = r3.type
            int r3 = r3.defaultType
            com.kwad.components.model.FeedType r3 = com.kwad.components.model.FeedType.fromInt(r4, r3)
            com.kwad.components.core.widget.b r1 = com.kwad.components.ad.feed.b.a(r2, r3, r1)
            r5.iG = r1
            if (r1 == 0) goto L67
            android.content.Context r1 = r5.mContext
            r2 = 1098907648(0x41800000, float:16.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            android.widget.FrameLayout$LayoutParams r2 = r5.jf
            if (r2 == 0) goto L32
            com.kwad.sdk.widget.KSFrameLayout r3 = r5.jb
            r3.setLayoutParams(r2)
        L32:
            com.kwad.components.core.widget.b r2 = r5.iG
            r2.setMargin(r1)
            com.kwad.sdk.widget.KSFrameLayout r1 = r5.jb
            r1.removeAllViews()
            com.kwad.components.core.widget.b r1 = r5.iG
            com.kwad.components.core.widget.b$a r2 = r5.iR
            r1.setInnerAdInteractionListener(r2)
            com.kwad.sdk.widget.KSFrameLayout r1 = r5.jb
            com.kwad.components.core.widget.b r2 = r5.iG
            r1.addView(r2)
            com.kwad.components.ad.feed.widget.r$a r1 = r5.je
            if (r1 == 0) goto L53
            java.lang.String r2 = ""
            r1.d(r0, r2)
        L53:
            com.kwad.components.core.widget.b r0 = r5.iG
            T extends com.kwad.sdk.core.response.model.AdResultData r1 = r5.mAdResultData
            r0.d(r1)
            com.kwad.components.core.widget.b r0 = r5.iG
            boolean r1 = r0 instanceof com.kwad.components.ad.feed.widget.c
            if (r1 == 0) goto L67
            com.kwad.components.ad.feed.widget.c r0 = (com.kwad.components.ad.feed.widget.c) r0
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r5.bU
            r0.b(r1)
        L67:
            return
    }

    private void cS() {
            r3 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$RotateInfo r0 = com.kwad.sdk.core.response.b.b.dl(r0)
            com.kwad.components.ad.feed.d$b r1 = r3.hf
            if (r1 != 0) goto L11
            com.kwad.components.ad.feed.widget.r$12 r1 = new com.kwad.components.ad.feed.widget.r$12
            r1.<init>(r3)
            r3.hf = r1
        L11:
            android.content.Context r1 = r3.mContext
            com.kwad.components.ad.feed.d$b r2 = r3.hf
            com.kwad.components.ad.feed.d.a(r0, r1, r2)
            return
    }

    private void cT() {
            r3 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.b.cY(r0)
            float r0 = (float) r0
            com.kwad.components.ad.feed.d$d r1 = r3.hg
            if (r1 != 0) goto L12
            com.kwad.components.ad.feed.widget.r$2 r1 = new com.kwad.components.ad.feed.widget.r$2
            r1.<init>(r3)
            r3.hg = r1
        L12:
            android.content.Context r1 = r3.mContext
            com.kwad.components.ad.feed.d$d r2 = r3.hg
            com.kwad.components.ad.feed.d.a(r0, r1, r2)
            return
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout d(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.jb
            return r0
    }

    static /* synthetic */ void e(com.kwad.components.ad.feed.widget.r r0) {
            r0.cR()
            return
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.r.a f(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.ad.feed.widget.r$a r0 = r0.je
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.i g(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.webview.tachikoma.i r0 = r0.fU
            return r0
    }

    private com.kwad.components.core.k.a.b getCurrentVoiceItem() {
            r2 = this;
            com.kwad.components.core.k.a$b r0 = r2.fD
            if (r0 != 0) goto L10
            com.kwad.components.core.k.a$b r0 = new com.kwad.components.core.k.a$b
            com.kwad.components.ad.feed.widget.r$10 r1 = new com.kwad.components.ad.feed.widget.r$10
            r1.<init>(r2)
            r0.<init>(r1)
            r2.fD = r0
        L10:
            com.kwad.components.core.k.a$b r0 = r2.fD
            return r0
    }

    private boolean getMuteStatus() {
            r3 = this;
            boolean r0 = com.kwad.sdk.core.config.e.hC()
            r1 = 1
            if (r0 != 0) goto L14
            android.content.Context r0 = r3.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r0 = r0.sW()
            if (r0 == 0) goto L14
            goto L44
        L14:
            com.kwad.components.core.k.a$b r0 = r3.fD
            if (r0 == 0) goto L24
            com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r0 = r3.fD
            boolean r0 = com.kwad.components.core.k.a.b(r0)
            if (r0 != 0) goto L24
            goto L44
        L24:
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r3.bU
            boolean r2 = r0 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r2 == 0) goto L3a
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r0 = r0.getVideoSoundValue()
            if (r0 == 0) goto L3a
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r3.bU
            boolean r0 = r0.isVideoSoundEnable()
            r0 = r0 ^ r1
            goto L45
        L3a:
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.ca(r0)
            if (r0 != 0) goto L43
            goto L44
        L43:
            r1 = 0
        L44:
            r0 = r1
        L45:
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            if (r1 == 0) goto L4d
            r2 = r0 ^ 1
            r1.mIsAudioEnable = r2
        L4d:
            return r0
    }

    static /* synthetic */ void h(com.kwad.components.ad.feed.widget.r r0) {
            r0.cP()
            return
    }

    static /* synthetic */ android.content.Context i(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    private void init(android.content.Context r4) {
            r3 = this;
            com.kwad.sdk.core.config.item.k r0 = com.kwad.sdk.core.config.c.aAZ
            int r0 = com.kwad.sdk.core.config.e.a(r0)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            android.app.Activity r2 = com.kwad.sdk.o.m.ej(r4)
            r1.<init>(r2)
            com.kwad.components.core.webview.tachikoma.i r2 = new com.kwad.components.core.webview.tachikoma.i
            r2.<init>(r4, r0, r0)
            r3.fU = r2
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.components.ad.feed.widget.r$1 r4 = new com.kwad.components.ad.feed.widget.r$1
            r4.<init>(r3, r1)
            com.kwad.sdk.core.c.b.a(r4)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.b.o j(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.webview.tachikoma.b.o r0 = r0.cY
            return r0
    }

    static /* synthetic */ com.kwad.components.core.k.a.b k(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.k.a$b r0 = r0.getCurrentVoiceItem()
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate l(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo m(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ long n(com.kwad.components.ad.feed.widget.r r2) {
            long r0 = r2.ht
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate o(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void onRelease() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r1.fU
            if (r0 == 0) goto L7
            r0.kz()
        L7:
            com.kwad.components.core.webview.jshandler.az r0 = r1.jc
            if (r0 == 0) goto Le
            r0.onDestroy()
        Le:
            com.kwad.components.ad.feed.d$d r0 = r1.hg
            if (r0 == 0) goto L15
            com.kwad.components.ad.feed.d.a(r0)
        L15:
            com.kwad.components.ad.feed.d$b r0 = r1.hf
            if (r0 == 0) goto L1c
            com.kwad.components.ad.feed.d.a(r0)
        L1c:
            android.content.Context r0 = r1.mContext
            com.kwad.components.ad.feed.d.D(r0)
            android.content.Context r0 = r1.mContext
            com.kwad.components.ad.feed.d.E(r0)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo p(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate q(com.kwad.components.ad.feed.widget.r r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.k.a.b r(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.k.a$b r0 = r0.fD
            return r0
    }

    static /* synthetic */ void s(com.kwad.components.ad.feed.widget.r r0) {
            r0.cF()
            return
    }

    static /* synthetic */ com.kwad.components.core.e.d.c t(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a u(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a v(com.kwad.components.ad.feed.widget.r r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ void w(com.kwad.components.ad.feed.widget.r r0) {
            r0.cG()
            return
    }

    static /* synthetic */ android.content.Context x(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ int y(com.kwad.components.ad.feed.widget.r r0) {
            int r0 = r0.mWidth
            return r0
    }

    static /* synthetic */ android.content.Context z(com.kwad.components.ad.feed.widget.r r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    @Override // com.kwad.components.core.widget.b
    public final void W() {
            r2 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            boolean r0 = r0.mPvReported
            if (r0 != 0) goto L41
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            boolean r0 = r0.mHasAdShow
            if (r0 != 0) goto L41
            com.kwad.components.core.webview.jshandler.az r0 = r2.jc
            r1 = 3
            if (r0 == 0) goto L1e
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r2.jc
            r0.uG()
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.components.ad.feed.monitor.b.c(r0, r1, r1)
        L1e:
            com.kwad.components.core.webview.tachikoma.i r0 = r2.fU
            com.kwad.sdk.components.o r0 = r0.vt()
            if (r0 == 0) goto L35
            java.lang.String r0 = "showStart"
            r2.setLifeStatue(r0)
            java.lang.String r0 = "showEnd"
            r2.setLifeStatue(r0)
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.components.ad.feed.monitor.b.c(r0, r1, r1)
        L35:
            com.kwad.components.core.widget.b$a r0 = r2.aig
            if (r0 == 0) goto L41
            r0.onAdShow()
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 1
            r0.mHasAdShow = r1
        L41:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r0 = this;
            super.aa()
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r0 = this;
            super.ab()
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            super.bt()
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.getCurrentVoiceItem()
            r0.a(r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.jc
            if (r0 == 0) goto L15
            r0.uJ()
        L15:
            java.lang.String r0 = "pageVisiable"
            r2.setLifeStatue(r0)
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bu() {
            r2 = this;
            super.bu()
            com.kwad.components.core.webview.jshandler.az r0 = r2.jc
            if (r0 == 0) goto L13
            r0.uK()
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.fD
            r0.c(r1)
        L13:
            java.lang.String r0 = "pageInvisiable"
            r2.setLifeStatue(r0)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void bw() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r1.jb = r0
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r6) {
            r5 = this;
            super.d(r6)
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            r0.<init>(r1)
            r5.mApkDownloadHelper = r0
            r0.setOnShowListener(r5)
            com.kwad.components.core.e.d.c r0 = r5.mApkDownloadHelper
            r0.setOnDismissListener(r5)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.ht = r0
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            double r0 = com.kwad.sdk.core.response.b.b.db(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L35
            int r0 = r5.mWidth
            double r0 = (double) r0
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            double r2 = com.kwad.sdk.core.response.b.b.db(r2)
            double r0 = r0 * r2
            int r0 = (int) r0
            r5.mHeight = r0
            goto L3d
        L35:
            com.kwad.sdk.widget.KSFrameLayout r0 = r5.jb
            int r0 = r0.getHeight()
            r5.mHeight = r0
        L3d:
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.core.webview.tachikoma.i r2 = r5.fU
            android.content.Context r3 = r5.mContext
            android.app.Activity r3 = com.kwad.sdk.o.m.ej(r3)
            com.kwad.components.ad.feed.widget.r$5 r4 = new com.kwad.components.ad.feed.widget.r$5
            r4.<init>(r5, r0)
            r2.a(r3, r6, r4)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_tkview
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            int r0 = r10.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            boolean r1 = com.kwad.sdk.core.config.e.FM()
            if (r1 == 0) goto L86
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.d.ea(r1)
            if (r1 != 0) goto L15
            goto L86
        L15:
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r9.mAdTemplate
            com.kwad.sdk.core.response.model.FeedSlideConf r1 = com.kwad.sdk.core.response.b.b.cs(r1)
            if (r1 != 0) goto L22
            boolean r10 = super.onInterceptTouchEvent(r10)
            return r10
        L22:
            r9.b(r10)
            r2 = 2
            if (r0 == r2) goto L2b
            r2 = 3
            if (r0 != r2) goto L81
        L2b:
            com.kwad.sdk.widget.KSFrameLayout r0 = r9.jb
            if (r0 == 0) goto L81
            boolean r0 = r9.mIsNative
            if (r0 != 0) goto L81
            float r0 = r10.getX()
            float r2 = r9.hu
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L81
            com.kwad.sdk.widget.KSFrameLayout r0 = r9.jb
            r2 = 1
            r0.requestDisallowInterceptTouchEvent(r2)
            float r0 = r10.getX()
            float r2 = r9.hu
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r10.getY()
            float r3 = r9.hv
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r3 = r1.maxRange
            double r3 = (double) r3
            double r3 = java.lang.Math.tan(r3)
            double r5 = (double) r0
            double r3 = r3 * r5
            double r7 = (double) r2
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L7b
            int r0 = r1.minRange
            double r0 = (double) r0
            double r0 = java.lang.Math.tan(r0)
            double r0 = r0 * r5
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L81
        L7b:
            com.kwad.sdk.widget.KSFrameLayout r0 = r9.jb
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L81:
            boolean r10 = super.onInterceptTouchEvent(r10)
            return r10
        L86:
            boolean r10 = super.onInterceptTouchEvent(r10)
            return r10
    }

    public final void setLifeStatue(java.lang.String r4) {
            r3 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = r3.fU
            if (r0 == 0) goto La
            java.lang.String r1 = "setLifeStatus"
            r2 = 0
            r0.a(r1, r4, r2)
        La:
            return
    }

    public final void setTKLoadListener(com.kwad.components.ad.feed.widget.r.a r4) {
            r3 = this;
            com.kwad.components.ad.feed.widget.r$a r0 = r3.je
            if (r0 == 0) goto L10
            boolean r1 = r3.mIsNative
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 3
        Lb:
            java.lang.String r2 = ""
            r0.d(r1, r2)
        L10:
            r3.je = r4
            return
    }

    public final void setVideoPlayConfig(com.kwad.sdk.api.KsAdVideoPlayConfig r1) {
            r0 = this;
            r0.bU = r1
            r0.cP()
            r0.cQ()
            return
    }

    public final void setWidth(int r1) {
            r0 = this;
            if (r1 <= 0) goto L3
            goto L11
        L3:
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
        L11:
            r0.mWidth = r1
            return
    }
}
