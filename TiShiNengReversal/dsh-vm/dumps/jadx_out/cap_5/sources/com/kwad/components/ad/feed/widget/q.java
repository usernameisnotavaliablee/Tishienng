package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q extends com.kwad.components.core.widget.b<com.kwad.sdk.core.response.model.AdResultData, com.kwad.sdk.core.response.model.AdTemplate> implements android.view.View.OnClickListener, com.kwad.sdk.widget.d {
    private static final java.util.HashMap<java.lang.Long, java.lang.Double> iB = null;
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener cB;
    private java.util.List<java.lang.Integer> ck;
    private boolean cp;
    private com.kwad.sdk.core.video.videoview.a cq;
    private com.kwad.sdk.core.video.videoview.a.InterfaceC0149a cz;
    private int eR;
    private final com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener eh;
    private com.kwad.components.core.k.a.b fD;
    private android.view.View fF;
    private com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView fq;
    private com.kwad.components.core.o.a.b.a fr;
    private com.kwad.sdk.widget.KSRelativeLayout hL;
    private android.widget.ImageView hM;
    private com.kwad.components.core.video.e hN;
    private com.kwad.components.ad.feed.widget.d hO;
    private final com.kwad.components.core.video.a.InterfaceC0092a hQ;
    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule hR;
    private boolean hS;
    private com.kwad.components.ad.feed.d.InterfaceC0013d hg;
    private long ht;
    private float hu;
    private float hv;
    private com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener iA;
    private boolean iC;
    private java.lang.String iD;
    private com.kwad.components.core.webview.jshandler.ba.b iE;
    private com.kwad.components.core.webview.jshandler.ba.a iF;
    private com.kwad.components.core.widget.b iG;
    private boolean iH;
    private com.kwad.components.ad.feed.widget.q.a iI;
    private android.view.ViewGroup.MarginLayoutParams iJ;
    private android.os.Handler iK;
    private com.kwad.components.ad.feed.widget.e iL;
    private com.kwad.components.core.webview.jshandler.at iM;
    private boolean iN;
    private boolean iO;
    private com.kwad.components.core.webview.b iP;
    private com.kwad.components.core.webview.c iQ;
    private com.kwad.components.core.widget.b.a iR;
    private com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest iS;
    private boolean isNative;
    private com.kwad.sdk.widget.RatioFrameLayout it;
    private double iu;
    private android.widget.LinearLayout iv;
    private android.widget.TextView iw;
    private com.kwad.components.core.webview.jshandler.be ix;
    private com.kwad.components.core.webview.jshandler.az iy;
    private com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener iz;
    private com.kwad.sdk.core.webview.KsAdWebView mAdWebView;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private boolean mIsAudioEnable;
    private final com.kwad.sdk.core.network.l<com.kwad.components.core.liveEnd.a, com.kwad.components.core.liveEnd.AdLiveEndCommonResultData> mNetworking;
    private int mWidth;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.feed.widget.q$12, reason: invalid class name */
    final class AnonymousClass12 extends com.kwad.components.core.webview.c {
        final /* synthetic */ com.kwad.components.ad.feed.widget.q iT;






        AnonymousClass12(com.kwad.components.ad.feed.widget.q r1) {
                r0 = this;
                r0.iT = r1
                r0.<init>()
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.components.core.webview.a r3, com.kwad.sdk.core.webview.b r4) {
                r2 = this;
                r0 = 0
                r4.aMP = r0
                com.kwad.components.core.webview.jshandler.h r0 = new com.kwad.components.core.webview.jshandler.h
                com.kwad.components.ad.feed.widget.q r1 = r2.iT
                com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.components.ad.feed.widget.q.c(r1)
                int r1 = r1.loadType
                r0.<init>(r1)
                r3.a(r0)
                com.kwad.components.ad.feed.widget.q r0 = r2.iT
                com.kwad.components.core.webview.jshandler.be r1 = new com.kwad.components.core.webview.jshandler.be
                r1.<init>()
                com.kwad.components.ad.feed.widget.q.a(r0, r1)
                com.kwad.components.ad.feed.widget.q r0 = r2.iT
                com.kwad.components.core.webview.jshandler.be r0 = com.kwad.components.ad.feed.widget.q.d(r0)
                r3.a(r0)
                com.kwad.components.core.webview.jshandler.aq r0 = new com.kwad.components.core.webview.jshandler.aq
                com.kwad.components.ad.feed.widget.q r1 = r2.iT
                com.kwad.components.core.webview.jshandler.aq$a r1 = com.kwad.components.ad.feed.widget.q.e(r1)
                r0.<init>(r1)
                r3.a(r0)
                com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler r0 = new com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler
                com.kwad.components.ad.feed.widget.q$12$1 r1 = new com.kwad.components.ad.feed.widget.q$12$1
                r1.<init>(r2)
                r0.<init>(r1)
                r3.a(r0)
                com.kwad.components.core.webview.jshandler.ad r0 = new com.kwad.components.core.webview.jshandler.ad
                com.kwad.components.ad.feed.widget.q$12$2 r1 = new com.kwad.components.ad.feed.widget.q$12$2
                r1.<init>(r2)
                r0.<init>(r4, r1)
                r3.a(r0)
                com.kwad.components.core.webview.jshandler.bb r4 = new com.kwad.components.core.webview.jshandler.bb
                com.kwad.components.ad.feed.widget.q$12$3 r0 = new com.kwad.components.ad.feed.widget.q$12$3
                r0.<init>(r2)
                r4.<init>(r0)
                r3.a(r4)
                com.kwad.components.ad.feed.widget.q r4 = r2.iT
                com.kwad.components.core.webview.jshandler.at r0 = new com.kwad.components.core.webview.jshandler.at
                r0.<init>()
                com.kwad.components.ad.feed.widget.q.a(r4, r0)
                com.kwad.components.ad.feed.widget.q r4 = r2.iT
                com.kwad.components.core.webview.jshandler.at r4 = com.kwad.components.ad.feed.widget.q.u(r4)
                r3.a(r4)
                com.kwad.components.ad.feed.widget.q r4 = r2.iT
                boolean r4 = com.kwad.components.ad.feed.widget.q.h(r4)
                if (r4 == 0) goto Lb3
                com.kwad.components.core.webview.jshandler.g r4 = new com.kwad.components.core.webview.jshandler.g
                r0 = 1
                r4.<init>(r0, r0)
                r3.a(r4)
                com.kwad.components.ad.feed.widget.q r4 = r2.iT
                com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener r0 = new com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener
                r0.<init>()
                com.kwad.components.ad.feed.widget.q.a(r4, r0)
                com.kwad.components.ad.feed.widget.q r4 = r2.iT
                com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener r0 = new com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener
                r0.<init>()
                com.kwad.components.ad.feed.widget.q.a(r4, r0)
                com.kwad.components.ad.feed.widget.q r4 = r2.iT
                com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener r4 = com.kwad.components.ad.feed.widget.q.v(r4)
                r3.a(r4)
                com.kwad.components.ad.feed.widget.q r4 = r2.iT
                com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener r4 = com.kwad.components.ad.feed.widget.q.w(r4)
                r3.a(r4)
                com.kwad.components.core.webview.jshandler.ba r4 = new com.kwad.components.core.webview.jshandler.ba
                com.kwad.components.ad.feed.widget.q r0 = r2.iT
                com.kwad.components.core.webview.jshandler.ba$c r0 = com.kwad.components.ad.feed.widget.q.x(r0)
                r4.<init>(r0)
                r3.a(r4)
            Lb3:
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.components.core.webview.jshandler.al.a r6) {
                r5 = this;
                com.kwad.components.ad.feed.widget.q r0 = r5.iT
                boolean r0 = com.kwad.components.ad.feed.widget.q.z(r0)
                if (r0 == 0) goto L9
                goto L55
            L9:
                com.kwad.components.ad.feed.widget.q r0 = r5.iT
                com.kwad.sdk.core.webview.KsAdWebView r0 = com.kwad.components.ad.feed.widget.q.C(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.kwad.components.ad.feed.widget.q r0 = r5.iT
                double r0 = com.kwad.components.ad.feed.widget.q.j(r0)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L55
                com.kwad.components.ad.feed.widget.q r0 = r5.iT
                int r1 = r6.height
                double r1 = (double) r1
                com.kwad.components.ad.feed.widget.q.a(r0, r1)
                int r6 = r6.height
                float r6 = (float) r6
                com.kwad.components.ad.feed.widget.q r0 = r5.iT
                int r0 = com.kwad.components.ad.feed.widget.q.k(r0)
                float r0 = (float) r0
                float r6 = r6 / r0
                double r0 = (double) r6
                com.kwad.components.ad.feed.widget.q r6 = r5.iT
                com.kwad.sdk.widget.RatioFrameLayout r6 = com.kwad.components.ad.feed.widget.q.D(r6)
                float r2 = (float) r0
                double r2 = (double) r2
                r6.setRatio(r2)
                java.util.HashMap r6 = com.kwad.components.ad.feed.widget.q.cJ()
                com.kwad.components.ad.feed.widget.q r2 = r5.iT
                com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.components.ad.feed.widget.q.E(r2)
                long r2 = r2.posId
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                r6.put(r2, r0)
            L55:
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.components.core.webview.jshandler.as.a r4) {
                r3 = this;
                com.kwad.components.ad.feed.widget.q r0 = r3.iT
                boolean r0 = com.kwad.components.ad.feed.widget.q.L(r0)
                if (r0 == 0) goto L9
                goto L6b
            L9:
                com.kwad.components.ad.feed.widget.q r0 = r3.iT
                int r4 = r4.status
                com.kwad.components.ad.feed.widget.q.a(r0, r4)
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                int r4 = com.kwad.components.ad.feed.widget.q.M(r4)
                r0 = 1
                if (r4 == r0) goto L23
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                r0 = 3
                r1 = 4
                java.lang.String r2 = "3"
                com.kwad.components.ad.feed.widget.q.a(r4, r2, r0, r1)
                return
            L23:
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                android.os.Handler r4 = com.kwad.components.ad.feed.widget.q.s(r4)
                r0 = 0
                r4.removeCallbacksAndMessages(r0)
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                com.kwad.components.core.widget.b r4 = com.kwad.components.ad.feed.widget.q.N(r4)
                if (r4 == 0) goto L40
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                com.kwad.components.core.widget.b r4 = com.kwad.components.ad.feed.widget.q.N(r4)
                r0 = 8
                r4.setVisibility(r0)
            L40:
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                com.kwad.sdk.core.webview.KsAdWebView r4 = com.kwad.components.ad.feed.widget.q.C(r4)
                r0 = 0
                r4.setVisibility(r0)
                com.kwad.components.core.p.a r4 = com.kwad.components.core.p.a.se()
                com.kwad.components.ad.feed.widget.q r0 = r3.iT
                com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.components.ad.feed.widget.q.O(r0)
                r4.aI(r0)
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                com.kwad.components.ad.feed.widget.q$a r4 = com.kwad.components.ad.feed.widget.q.P(r4)
                if (r4 == 0) goto L6b
                com.kwad.components.ad.feed.widget.q r4 = r3.iT
                com.kwad.components.ad.feed.widget.q$a r4 = com.kwad.components.ad.feed.widget.q.P(r4)
                r0 = 2
                java.lang.String r1 = ""
                r4.d(r0, r1)
            L6b:
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.components.core.webview.jshandler.az r2) {
                r1 = this;
                com.kwad.components.ad.feed.widget.q r0 = r1.iT
                com.kwad.components.ad.feed.widget.q.a(r0, r2)
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.sdk.core.webview.d.b.a r7) {
                r6 = this;
                com.kwad.components.ad.feed.widget.q r0 = r6.iT
                com.kwad.components.ad.feed.widget.q.F(r0)
                int r0 = r7.adN
                boolean r1 = r7.OU
                r2 = 1
                if (r1 == 0) goto L13
                boolean r0 = r7.adL
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 2
            L13:
                com.kwad.components.ad.feed.widget.q r1 = r6.iT
                com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.components.ad.feed.widget.q.G(r1)
                boolean r1 = com.kwad.sdk.core.response.b.a.bc(r1)
                com.kwad.sdk.core.webview.d.b.d r3 = r7.adO
                if (r3 == 0) goto L2e
                java.lang.String r3 = r3.Pj
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L2e
                com.kwad.sdk.core.webview.d.b.d r3 = r7.adO
                java.lang.String r3 = r3.Pj
                goto L30
            L2e:
                java.lang.String r3 = ""
            L30:
                com.kwad.components.core.e.d.a$a r4 = new com.kwad.components.core.e.d.a$a
                com.kwad.components.ad.feed.widget.q r5 = r6.iT
                android.content.Context r5 = r5.getContext()
                r4.<init>(r5)
                com.kwad.components.ad.feed.widget.q r5 = r6.iT
                com.kwad.sdk.core.response.model.AdTemplate r5 = com.kwad.components.ad.feed.widget.q.K(r5)
                com.kwad.components.core.e.d.a$a r4 = r4.aB(r5)
                com.kwad.components.ad.feed.widget.q r5 = r6.iT
                com.kwad.components.core.e.d.c r5 = com.kwad.components.ad.feed.widget.q.J(r5)
                com.kwad.components.core.e.d.a$a r4 = r4.b(r5)
                com.kwad.components.ad.feed.widget.q r5 = r6.iT
                boolean r5 = com.kwad.components.ad.feed.widget.q.a(r5, r7)
                com.kwad.components.core.e.d.a$a r4 = r4.aq(r5)
                com.kwad.components.core.e.d.a$a r0 = r4.aB(r0)
                int r4 = r7.mI
                com.kwad.components.core.e.d.a$a r0 = r0.aA(r4)
                com.kwad.components.core.e.d.a$a r0 = r0.am(r3)
                r3 = 5
                com.kwad.components.core.e.d.a$a r0 = r0.az(r3)
                boolean r7 = r7.OU
                com.kwad.components.core.e.d.a$a r7 = r0.aw(r7)
                com.kwad.components.core.e.d.a$a r7 = r7.au(r1)
                com.kwad.components.ad.feed.widget.q r0 = r6.iT
                com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = com.kwad.components.ad.feed.widget.q.b(r0)
                if (r0 != 0) goto L81
                r0 = 0
                goto L8b
            L81:
                com.kwad.components.ad.feed.widget.q r0 = r6.iT
                com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = com.kwad.components.ad.feed.widget.q.b(r0)
                long r0 = r0.getPlayDuration()
            L8b:
                com.kwad.components.core.e.d.a$a r7 = r7.A(r0)
                com.kwad.components.core.e.d.a$a r7 = r7.as(r2)
                com.kwad.components.ad.feed.widget.q$12$5 r0 = new com.kwad.components.ad.feed.widget.q$12$5
                r0.<init>(r6)
                com.kwad.components.core.e.d.a$a r7 = r7.a(r0)
                com.kwad.components.core.e.d.a.a(r7)
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void b(com.kwad.components.core.webview.jshandler.ae.a r2) {
                r1 = this;
                r0 = 0
                r2.height = r0
                com.kwad.components.ad.feed.widget.q r0 = r1.iT
                int r0 = com.kwad.components.ad.feed.widget.q.k(r0)
                r2.width = r0
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void h(int r3, java.lang.String r4) {
                r2 = this;
                com.kwad.components.ad.feed.widget.q r3 = r2.iT
                r4 = 2
                r0 = 5
                java.lang.String r1 = "1"
                com.kwad.components.ad.feed.widget.q.a(r3, r1, r4, r0)
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void onAdShow() {
                r1 = this;
                super.onAdShow()
                com.kwad.components.ad.feed.widget.q$12$4 r0 = new com.kwad.components.ad.feed.widget.q$12$4
                r0.<init>(r1)
                com.kwad.sdk.utils.bw.runOnUiThread(r0)
                return
        }

        @Override // com.kwad.components.core.webview.c
        public final void onPageFinished() {
                r6 = this;
                com.kwad.components.ad.feed.widget.q r0 = r6.iT
                com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.components.ad.feed.widget.q.Q(r0)
                com.kwad.components.ad.feed.widget.q r1 = r6.iT
                com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.components.ad.feed.widget.q.R(r1)
                java.lang.String r1 = com.kwad.sdk.core.response.b.b.cT(r1)
                long r2 = java.lang.System.currentTimeMillis()
                com.kwad.components.ad.feed.widget.q r4 = r6.iT
                com.kwad.sdk.core.webview.KsAdWebView r4 = com.kwad.components.ad.feed.widget.q.C(r4)
                long r4 = r4.getLoadTime()
                long r2 = r2 - r4
                com.kwad.components.ad.feed.monitor.b.a(r0, r1, r2)
                return
        }
    }
















    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void d(int r1, java.lang.String r2);
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 8
            r0.<init>(r1)
            com.kwad.components.ad.feed.widget.q.iB = r0
            return
    }

    public q(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = -1
            r2.eR = r3
            r3 = 0
            r2.mIsAudioEnable = r3
            r2.isNative = r3
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r2.iN = r3
            r2.iO = r3
            com.kwad.components.ad.feed.widget.q$1 r3 = new com.kwad.components.ad.feed.widget.q$1
            r3.<init>(r2)
            r2.cB = r3
            com.kwad.components.ad.feed.widget.q$12 r3 = new com.kwad.components.ad.feed.widget.q$12
            r3.<init>(r2)
            r2.iQ = r3
            com.kwad.components.ad.feed.widget.q$14 r3 = new com.kwad.components.ad.feed.widget.q$14
            r3.<init>(r2)
            r2.iR = r3
            com.kwad.components.ad.feed.widget.q$16 r3 = new com.kwad.components.ad.feed.widget.q$16
            r3.<init>(r2)
            r2.mNetworking = r3
            com.kwad.components.ad.feed.widget.q$17 r3 = new com.kwad.components.ad.feed.widget.q$17
            r3.<init>(r2)
            r2.eh = r3
            com.kwad.components.ad.feed.widget.q$11 r3 = new com.kwad.components.ad.feed.widget.q$11
            r3.<init>(r2)
            r2.hQ = r3
            return
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a A(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate B(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.KsAdWebView C(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.mAdWebView
            return r0
    }

    static /* synthetic */ com.kwad.sdk.widget.RatioFrameLayout D(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.widget.RatioFrameLayout r0 = r0.it
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate E(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void E(int r4) {
            r3 = this;
            r3.cG()
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            com.kwad.components.core.e.d.c r1 = r3.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r0 = r0.b(r1)
            r1 = 1
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            com.kwad.components.core.e.d.a$a r0 = r0.aq(r1)
            com.kwad.components.core.e.d.a$a r0 = r0.aA(r4)
            r2 = 5
            com.kwad.components.core.e.d.a$a r0 = r0.az(r2)
            r2 = 0
            com.kwad.components.core.e.d.a$a r0 = r0.as(r2)
            com.kwad.components.core.e.d.a$a r0 = r0.au(r1)
            com.kwad.components.ad.feed.widget.q$9 r1 = new com.kwad.components.ad.feed.widget.q$9
            r1.<init>(r3, r4)
            com.kwad.components.core.e.d.a$a r4 = r0.a(r1)
            com.kwad.components.core.e.d.a.a(r4)
            return
    }

    static /* synthetic */ void F(com.kwad.components.ad.feed.widget.q r0) {
            r0.cG()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo G(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a H(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a I(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.c J(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate K(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ boolean L(com.kwad.components.ad.feed.widget.q r0) {
            boolean r0 = r0.iC
            return r0
    }

    static /* synthetic */ int M(com.kwad.components.ad.feed.widget.q r0) {
            int r0 = r0.eR
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b N(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b r0 = r0.iG
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate O(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.q.a P(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.ad.feed.widget.q$a r0 = r0.iI
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate Q(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate R(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a S(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a T(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a U(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a V(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate W(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate X(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate Y(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate Z(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ double a(com.kwad.components.ad.feed.widget.q r0, double r1) {
            r0.iu = r1
            return r1
    }

    static /* synthetic */ int a(com.kwad.components.ad.feed.widget.q r0, int r1) {
            r0.eR = r1
            return r1
    }

    static /* synthetic */ android.view.ViewGroup.MarginLayoutParams a(com.kwad.components.ad.feed.widget.q r0, android.view.ViewGroup.MarginLayoutParams r1) {
            r0.iJ = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.d a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.ad.feed.widget.d r1) {
            r0.hO = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.e a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.ad.feed.widget.e r1) {
            r0.iL = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener r1) {
            r0.iz = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener r1) {
            r0.iA = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.at a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.core.webview.jshandler.at r1) {
            r0.iM = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.core.webview.jshandler.az r1) {
            r0.iy = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.a a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.core.webview.jshandler.ba.a r1) {
            r0.iF = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.b a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.core.webview.jshandler.ba.b r1) {
            r0.iE = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.be a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.core.webview.jshandler.be r1) {
            r0.ix = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r1) {
            r0.iS = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule a(com.kwad.components.ad.feed.widget.q r0, com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1) {
            r0.hR = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.video.videoview.a a(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.video.videoview.a r0 = r0.cq
            return r0
    }

    static /* synthetic */ java.util.List a(com.kwad.components.ad.feed.widget.q r0, java.util.List r1) {
            r0.ck = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.q r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.q r0, android.view.View r1) {
            r0.d(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.q r0, com.kwad.sdk.core.adlog.c.b r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.q r0, java.lang.String r1, int r2, int r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void a(com.kwad.sdk.core.video.videoview.a r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L53
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.K(r3)
            com.kwad.components.core.video.e r0 = r2.hN
            r1 = 0
            r0.setAutoRelease(r1)
            com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache r0 = com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache.getInstance()
            com.kwad.sdk.core.video.videoview.a r1 = r2.cq
            r0.a(r3, r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            int r0 = r3.type
            int r3 = r3.defaultType
            com.kwad.components.model.FeedType.fromInt(r0, r3)
            r2.cG()
            com.kwad.components.core.e.d.a$a r3 = new com.kwad.components.core.e.d.a$a
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0)
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r0)
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r0)
            r0 = 2
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.bc(r0)
            com.kwad.components.core.e.d.a$a r3 = r3.au(r0)
            com.kwad.components.ad.feed.widget.q$10 r0 = new com.kwad.components.ad.feed.widget.q$10
            r0.<init>(r2, r4)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r0)
            com.kwad.components.core.e.d.a.a(r3)
        L53:
            return
    }

    private void a(java.lang.String r10, int r11, int r12) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleWebViewError "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FeedWebView"
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.os.Handler r0 = r9.iK
            r2 = 0
            r0.removeCallbacksAndMessages(r2)
            boolean r0 = r9.iC
            if (r0 == 0) goto L1f
            goto Lf6
        L1f:
            r0 = 1
            r9.iC = r0
            com.kwad.sdk.core.webview.KsAdWebView r3 = r9.mAdWebView
            if (r3 == 0) goto L3a
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r9.mAdTemplate
            java.lang.String r4 = com.kwad.sdk.core.response.b.b.cT(r3)
            long r5 = java.lang.System.currentTimeMillis()
            com.kwad.sdk.core.webview.KsAdWebView r7 = r9.mAdWebView
            long r7 = r7.getLoadTime()
            long r5 = r5 - r7
            com.kwad.components.ad.feed.monitor.b.a(r3, r4, r5, r11)
        L3a:
            com.kwad.components.core.p.a r11 = com.kwad.components.core.p.a.se()
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r9.mAdTemplate
            java.lang.String r4 = com.kwad.sdk.core.response.b.b.cT(r3)
            r11.b(r3, r4, r10)
            r11 = 0
            int r1 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L4d
            goto L5f
        L4d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "handleWebViewError errorCode exception"
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.kwad.sdk.core.d.c.d(r1, r3)
            r1 = 0
        L5f:
            com.kwad.sdk.core.response.model.AdInfo r3 = r9.mAdInfo
            int r3 = com.kwad.sdk.core.response.b.a.be(r3)
            R extends com.kwad.sdk.core.response.model.AdTemplate r4 = r9.mAdTemplate
            com.kwad.components.ad.feed.monitor.b.a(r1, r3, r4, r12)
            com.kwad.components.ad.feed.widget.q$a r12 = r9.iI
            if (r12 == 0) goto L71
            r12.d(r0, r10)
        L71:
            r9.iI = r2
            com.kwad.components.core.widget.b r10 = r9.iG
            if (r10 != 0) goto Lf6
            r9.isNative = r0
            com.kwad.components.core.widget.b.c(r9)
            com.kwad.sdk.core.response.model.AdInfo r10 = r9.mAdInfo
            int r10 = com.kwad.sdk.core.response.b.a.be(r10)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r12 = r9.hR
            if (r12 == 0) goto L90
            r12.setAudioEnabled(r11, r11)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r11 = r9.hR
            r11.onDestroy()
            r9.hR = r2
        L90:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r11 = r9.fq
            if (r11 == 0) goto L99
            r11.onDestroy()
            r9.fq = r2
        L99:
            android.content.Context r11 = r9.mContext
            R extends com.kwad.sdk.core.response.model.AdTemplate r12 = r9.mAdTemplate
            int r0 = r12.type
            int r12 = r12.defaultType
            com.kwad.components.model.FeedType r12 = com.kwad.components.model.FeedType.fromInt(r0, r12)
            com.kwad.components.core.widget.b r10 = com.kwad.components.ad.feed.b.a(r11, r12, r10)
            r9.iG = r10
            if (r10 == 0) goto Lf6
            android.content.Context r10 = r9.mContext
            r11 = 1098907648(0x41800000, float:16.0)
            int r10 = com.kwad.sdk.c.a.a.a(r10, r11)
            com.kwad.components.core.widget.b r11 = r9.iG
            r11.setMargin(r10)
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.it
            r10.removeAllViews()
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.it
            r11 = 0
            r10.setRatio(r11)
            com.kwad.sdk.core.webview.KsAdWebView r10 = r9.mAdWebView
            r11 = 8
            if (r10 == 0) goto Lcf
            r10.setVisibility(r11)
        Lcf:
            com.kwad.sdk.widget.KSRelativeLayout r10 = r9.hL
            r10.setVisibility(r11)
            com.kwad.components.core.widget.b r10 = r9.iG
            com.kwad.components.core.widget.b$a r11 = r9.iR
            r10.setInnerAdInteractionListener(r11)
            com.kwad.sdk.widget.RatioFrameLayout r10 = r9.it
            com.kwad.components.core.widget.b r11 = r9.iG
            r10.addView(r11)
            com.kwad.components.core.widget.b r10 = r9.iG
            T extends com.kwad.sdk.core.response.model.AdResultData r11 = r9.mAdResultData
            r10.d(r11)
            com.kwad.components.core.widget.b r10 = r9.iG
            boolean r11 = r10 instanceof com.kwad.components.ad.feed.widget.c
            if (r11 == 0) goto Lf6
            com.kwad.components.ad.feed.widget.c r10 = (com.kwad.components.ad.feed.widget.c) r10
            com.kwad.sdk.api.KsAdVideoPlayConfig r11 = r9.bU
            r10.b(r11)
        Lf6:
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.feed.widget.q r0, com.kwad.sdk.core.webview.d.b.a r1) {
            boolean r0 = b(r1)
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.feed.widget.q r0, boolean r1) {
            r1 = 0
            r0.cp = r1
            return r1
    }

    static /* synthetic */ android.content.Context aA(com.kwad.components.ad.feed.widget.q r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aB(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aC(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aD(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aE(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aF(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ android.content.Context aG(com.kwad.components.ad.feed.widget.q r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aH(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo aI(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ void aJ(com.kwad.components.ad.feed.widget.q r0) {
            r0.vV()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate aK(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a aa(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ab(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ac(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ad(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a ae(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a af(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.a ag(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.ba$a r0 = r0.iF
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.b ah(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.ba$b r0 = r0.iE
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest ai(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r0 = r0.iS
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo aj(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.network.l ak(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.network.l<com.kwad.components.core.liveEnd.a, com.kwad.components.core.liveEnd.AdLiveEndCommonResultData> r0 = r0.mNetworking
            return r0
    }

    static /* synthetic */ com.kwad.components.core.k.a.b al(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.k.a$b r0 = r0.getCurrentVoiceItem()
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate am(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate an(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ao(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ android.content.Context ap(com.kwad.components.ad.feed.widget.q r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule aq(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.cu()
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ar(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate as(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo at(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ long au(com.kwad.components.ad.feed.widget.q r2) {
            long r0 = r2.ht
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate av(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.d aw(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.ad.feed.widget.d r0 = r0.hO
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.feed.widget.e ax(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.ad.feed.widget.e r0 = r0.iL
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate ay(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ boolean az(com.kwad.components.ad.feed.widget.q r0) {
            boolean r0 = r0.iN
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule b(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.hR
            return r0
    }

    private void b(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r2.getActionMasked()
            if (r0 == 0) goto L7
            return
        L7:
            float r0 = r2.getX()
            r1.hu = r0
            float r2 = r2.getY()
            r1.hv = r2
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.feed.widget.q r0, int r1) {
            r0.E(r1)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.feed.widget.q r0, boolean r1) {
            r0.mIsAudioEnable = r1
            return r1
    }

    private static boolean b(com.kwad.sdk.core.webview.d.b.a r1) {
            boolean r0 = r1.OU
            if (r0 == 0) goto L7
            boolean r1 = r1.adL
            return r1
        L7:
            int r1 = r1.adN
            r0 = 1
            if (r1 != r0) goto Ld
            return r0
        Ld:
            r1 = 0
            return r1
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void bd() {
            r2 = this;
            com.kwad.components.core.webview.b r0 = r2.iP
            if (r0 == 0) goto L7
            r0.kz()
        L7:
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.mAdWebView
            r1 = 4
            r0.setVisibility(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.mAdWebView
            r1 = 0
            r0.setBackgroundColor(r1)
            com.kwad.components.core.webview.b r0 = new com.kwad.components.core.webview.b
            r0.<init>()
            r2.iP = r0
            com.kwad.components.core.webview.b$a r0 = new com.kwad.components.core.webview.b$a
            r0.<init>()
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.components.core.webview.b$a r0 = r0.aM(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.cT(r1)
            com.kwad.components.core.webview.b$a r0 = r0.aP(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.mAdWebView
            com.kwad.components.core.webview.b$a r0 = r0.d(r1)
            com.kwad.sdk.widget.RatioFrameLayout r1 = r2.it
            com.kwad.components.core.webview.b$a r0 = r0.k(r1)
            com.kwad.components.core.e.d.c r1 = r2.mApkDownloadHelper
            com.kwad.components.core.webview.b$a r0 = r0.f(r1)
            com.kwad.components.core.webview.c r1 = r2.iQ
            com.kwad.components.core.webview.b$a r0 = r0.a(r1)
            com.kwad.components.core.webview.b r1 = r2.iP
            r1.a(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.mAdWebView
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.cT(r1)
            r0.loadUrl(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.cT(r0)
            com.kwad.components.ad.feed.monitor.b.a(r0, r1)
            r2.cE()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
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
            if (r4 == 0) goto L36
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15
            goto L36
        L15:
            java.util.List<java.lang.Integer> r4 = r2.ck
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 < r0) goto L1b
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r0, r3, r1)
            r4.remove()
        L36:
            return
    }

    static /* synthetic */ void c(com.kwad.components.ad.feed.widget.q r0, int r1) {
            r0.ba(r1)
            return
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.feed.widget.q r0, boolean r1) {
            boolean r0 = r0.h(r1)
            return r0
    }

    private void cE() {
            r4 = this;
            android.os.Handler r0 = r4.iK
            com.kwad.components.ad.feed.widget.q$13 r1 = new com.kwad.components.ad.feed.widget.q$13
            r1.<init>(r4)
            r2 = 2500(0x9c4, double:1.235E-320)
            r0.postDelayed(r1, r2)
            return
    }

    private void cF() {
            r3 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.b.cY(r0)
            float r0 = (float) r0
            com.kwad.components.ad.feed.widget.q$18 r1 = new com.kwad.components.ad.feed.widget.q$18
            r1.<init>(r3)
            r3.hg = r1
            android.content.Context r2 = r3.mContext
            com.kwad.components.ad.feed.d.a(r0, r2, r1)
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
            r1 = 2
            long r2 = r4.getStayTime()
            com.kwad.components.ad.feed.monitor.b.a(r0, r1, r2)
            return
    }

    private boolean cH() {
            r2 = this;
            int r0 = r2.eR
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    private void cI() {
            r2 = this;
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r2.fq
            com.kwad.components.ad.feed.widget.q$4 r1 = new com.kwad.components.ad.feed.widget.q$4
            r1.<init>(r2)
            r0.registerLiveMessageListener(r1)
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r2.fq
            com.kwad.components.ad.feed.widget.q$5 r1 = new com.kwad.components.ad.feed.widget.q$5
            r1.<init>(r2)
            r0.registerLiveShopListener(r1)
            return
    }

    static /* synthetic */ java.util.HashMap cJ() {
            java.util.HashMap<java.lang.Long, java.lang.Double> r0 = com.kwad.components.ad.feed.widget.q.iB
            return r0
    }

    private boolean ct() {
            r10 = this;
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r10.fq
            r1 = 0
            if (r0 == 0) goto L92
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L92
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r10.hR
            if (r0 == 0) goto L92
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r10.fq
            android.view.View r0 = r0.getView()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kwad.sdk.widget.KSRelativeLayout r2 = r10.hL
            if (r0 == r2) goto L8b
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            r0.removeView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            java.lang.Object r0 = r0.getTag()
            if (r0 == 0) goto L41
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            java.lang.Object r2 = r0.getTag()
            android.view.View r2 = (android.view.View) r2
            r0.removeView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            r2 = 0
            r0.setTag(r2)
        L41:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            r0.addView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            r0.setTag(r2)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r10.hR
            boolean r2 = r10.mIsAudioEnable
            boolean r2 = r10.h(r2)
            r0.setAudioEnabled(r2, r1)
            com.kwad.components.core.o.a.b.a r3 = r10.fr
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r4 = r10.fq
            java.lang.String r5 = com.kwad.sdk.service.ServiceProvider.getAppId()
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            long r0 = com.kwad.sdk.core.response.b.a.cp(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            java.lang.String r7 = com.kwad.sdk.core.response.b.a.cq(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            long r8 = com.kwad.sdk.core.response.b.a.cr(r0)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r3.getAdLivePlayModule(r4, r5, r6, r7, r8)
            r10.hR = r0
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r1 = r10.eh
            r0.registerAdLivePlayStateListener(r1)
        L8b:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r10.hR
            r0.onResume()
            r0 = 1
            return r0
        L92:
            return r1
    }

    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule cu() {
            r10 = this;
            r10.cv()
            com.kwad.components.core.o.a.b.a r0 = r10.fr
            android.content.Context r1 = r10.mContext
            r2 = 3
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r4 = com.kwad.components.ad.j.c.a(r0, r1, r2)
            r10.fq = r4
            r0 = 0
            if (r4 != 0) goto L12
            return r0
        L12:
            com.kwad.components.core.o.a.b.a r3 = r10.fr
            com.kwad.sdk.api.SdkConfig r1 = com.kwad.sdk.service.ServiceProvider.getSDKConfig()
            java.lang.String r5 = r1.appId
            com.kwad.sdk.core.response.model.AdInfo r1 = r10.mAdInfo
            long r1 = com.kwad.sdk.core.response.b.a.cp(r1)
            java.lang.String r6 = java.lang.String.valueOf(r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = r10.mAdInfo
            java.lang.String r7 = com.kwad.sdk.core.response.b.a.cq(r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = r10.mAdInfo
            long r8 = com.kwad.sdk.core.response.b.a.cr(r1)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1 = r3.getAdLivePlayModule(r4, r5, r6, r7, r8)
            boolean r2 = r10.mIsAudioEnable
            boolean r2 = r10.h(r2)
            r3 = 0
            r1.setAudioEnabled(r2, r3)
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r2 = r10.eh
            r1.registerAdLivePlayStateListener(r2)
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r10.fq
            android.view.View r2 = r2.getView()
            com.kwad.sdk.widget.KSRelativeLayout r3 = r10.hL
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L61
            com.kwad.sdk.widget.KSRelativeLayout r3 = r10.hL
            java.lang.Object r4 = r3.getTag()
            android.view.View r4 = (android.view.View) r4
            r3.removeView(r4)
            com.kwad.sdk.widget.KSRelativeLayout r3 = r10.hL
            r3.setTag(r0)
        L61:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            r0.addView(r2)
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            r0.setTag(r2)
            com.kwad.components.ad.feed.widget.q$3 r0 = new com.kwad.components.ad.feed.widget.q$3
            r0.<init>(r10, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            r10.cI()
            boolean r0 = r10.mIsAudioEnable
            if (r0 == 0) goto L85
            android.content.Context r0 = r10.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2 = r10.cB
            r0.a(r2)
        L85:
            return r1
    }

    private void cv() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            java.lang.String r0 = r0.getUrl()
            android.widget.ImageView r1 = r5.hM
            r2 = 0
            r1.setVisibility(r2)
            android.view.View r1 = r5.fF
            r1.setVisibility(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3d
            android.widget.ImageView r1 = r5.hM
            r2 = 0
            r1.setImageDrawable(r2)
            android.widget.ImageView r1 = r5.hM
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r3.<init>()
            r4 = 50
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = r3.setBlurRadius(r4)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r3 = r3.build()
            com.kwad.components.ad.feed.widget.q$6 r4 = new com.kwad.components.ad.feed.widget.q$6
            r4.<init>(r5)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r2, r3, r4)
            return
        L3d:
            android.widget.ImageView r0 = r5.hM
            int r1 = com.kwad.sdk.R.drawable.ksad_ad_live_end
            r0.setImageResource(r1)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.be d(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.be r0 = r0.ix
            return r0
    }

    private void d(android.view.View r4) {
            r3 = this;
            com.kwad.sdk.widget.KSRelativeLayout r0 = r3.hL
            int r0 = r0.getWidth()
            com.kwad.sdk.widget.KSRelativeLayout r1 = r3.hL
            int r1 = r1.getHeight()
            if (r0 == 0) goto L25
            if (r1 != 0) goto L11
            goto L25
        L11:
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r2 = (float) r1
            float r2 = r2 * r0
            int r0 = (int) r2
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0, r1)
            r0 = 13
            r1 = -1
            r2.addRule(r0, r1)
            r4.setLayoutParams(r2)
        L25:
            return
    }

    static /* synthetic */ void d(com.kwad.components.ad.feed.widget.q r0, int r1) {
            r0.ba(r1)
            return
    }

    static /* synthetic */ boolean d(com.kwad.components.ad.feed.widget.q r0, boolean r1) {
            r1 = 1
            r0.iN = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.aq.a e(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.aq$a r0 = r0.getOpenNewPageListener()
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo f(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo g(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    private com.kwad.components.core.k.a.b getCurrentVoiceItem() {
            r2 = this;
            com.kwad.components.core.k.a$b r0 = r2.fD
            if (r0 != 0) goto L10
            com.kwad.components.core.k.a$b r0 = new com.kwad.components.core.k.a$b
            com.kwad.components.ad.feed.widget.q$2 r1 = new com.kwad.components.ad.feed.widget.q$2
            r1.<init>(r2)
            r0.<init>(r1)
            r2.fD = r0
        L10:
            com.kwad.components.core.k.a$b r0 = r2.fD
            return r0
    }

    private com.kwad.components.core.webview.jshandler.aq.a getOpenNewPageListener() {
            r1 = this;
            com.kwad.components.ad.feed.widget.q$19 r0 = new com.kwad.components.ad.feed.widget.q$19
            r0.<init>(r1)
            return r0
    }

    private com.kwad.components.core.webview.jshandler.ba.c getRegisterLiveListener() {
            r1 = this;
            com.kwad.components.ad.feed.widget.q$15 r0 = new com.kwad.components.ad.feed.widget.q$15
            r0.<init>(r1)
            return r0
    }

    private com.kwad.components.core.video.a.b getVideoPlayCallback() {
            r1 = this;
            com.kwad.components.ad.feed.widget.q$8 r0 = new com.kwad.components.ad.feed.widget.q$8
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ boolean h(com.kwad.components.ad.feed.widget.q r0) {
            boolean r0 = r0.hS
            return r0
    }

    private boolean h(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.kwad.components.core.k.a$b r3 = r2.fD
            if (r3 == 0) goto L14
            com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r3 = r2.fD
            boolean r3 = com.kwad.components.core.k.a.b(r3)
            if (r3 != 0) goto L14
            return r0
        L14:
            boolean r3 = com.kwad.sdk.core.config.e.hC()
            r1 = 1
            if (r3 != 0) goto L40
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sX()
            if (r3 != 0) goto L32
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r0)
            return r3
        L32:
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sW()
            if (r3 != 0) goto L3f
            return r1
        L3f:
            return r0
        L40:
            boolean r3 = r2.cp
            if (r3 != 0) goto L50
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r1)
            r2.cp = r3
        L50:
            boolean r3 = r2.cp
            return r3
    }

    static /* synthetic */ com.kwad.sdk.widget.KSRelativeLayout i(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.widget.KSRelativeLayout r0 = r0.hL
            return r0
    }

    static /* synthetic */ double j(com.kwad.components.ad.feed.widget.q r2) {
            double r0 = r2.iu
            return r0
    }

    static /* synthetic */ int k(com.kwad.components.ad.feed.widget.q r0) {
            int r0 = r0.mWidth
            return r0
    }

    static /* synthetic */ android.view.ViewGroup.MarginLayoutParams l(com.kwad.components.ad.feed.widget.q r0) {
            android.view.ViewGroup$MarginLayoutParams r0 = r0.iJ
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsAdVideoPlayConfig m(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r0.bU
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo n(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate o(com.kwad.components.ad.feed.widget.q r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void p(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            boolean r0 = r1.iO
            if (r0 == 0) goto L5
            return
        L5:
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r2 = com.kwad.sdk.core.response.b.a.cR(r2)
            if (r2 == 0) goto L1a
            int r2 = com.kwad.sdk.R.id.ksad_web_bottom_card_webView
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.sdk.core.webview.KsAdWebView r2 = (com.kwad.sdk.core.webview.KsAdWebView) r2
            r1.mAdWebView = r2
            goto L24
        L1a:
            int r2 = com.kwad.sdk.R.id.ksad_web_default_bottom_card_webView
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.sdk.core.webview.KsAdWebView r2 = (com.kwad.sdk.core.webview.KsAdWebView) r2
            r1.mAdWebView = r2
        L24:
            r2 = 1
            r1.iO = r2
            return
    }

    static /* synthetic */ boolean p(com.kwad.components.ad.feed.widget.q r0) {
            boolean r0 = r0.mIsAudioEnable
            return r0
    }

    private static float q(com.kwad.sdk.core.response.model.AdTemplate r1) {
            int r1 = r1.type
            r0 = 1
            if (r1 != r0) goto L9
            r1 = 1058664140(0x3f19eecc, float:0.6013)
            return r1
        L9:
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 != r0) goto L10
            goto L14
        L10:
            r1 = 1064816345(0x3f77ced9, float:0.968)
            return r1
        L14:
            r1 = 1049683296(0x3e90e560, float:0.283)
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo q(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ void r(com.kwad.components.ad.feed.widget.q r0) {
            r0.vW()
            return
    }

    private void r(com.kwad.sdk.core.response.model.AdTemplate r5) {
            r4 = this;
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.<init>(r1)
            r4.mApkDownloadHelper = r0
            r0.setOnShowListener(r4)
            com.kwad.components.core.e.d.c r0 = r4.mApkDownloadHelper
            r0.setOnDismissListener(r4)
            r4.mAdTemplate = r5
            com.kwad.sdk.core.response.model.AdInfo r5 = com.kwad.sdk.core.response.b.e.el(r5)
            r4.mAdInfo = r5
            java.util.HashMap<java.lang.Long, java.lang.Double> r5 = com.kwad.components.ad.feed.widget.q.iB
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            long r0 = r0.posId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r5 = r5.get(r0)
            java.lang.Double r5 = (java.lang.Double) r5
            if (r5 == 0) goto L36
            com.kwad.sdk.widget.RatioFrameLayout r0 = r4.it
            float r5 = r5.floatValue()
            double r1 = (double) r5
            r0.setRatio(r1)
            goto L64
        L36:
            R extends com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            double r0 = com.kwad.sdk.core.response.b.b.db(r5)
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L4e
            com.kwad.sdk.widget.RatioFrameLayout r5 = r4.it
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            double r0 = com.kwad.sdk.core.response.b.b.db(r0)
            r5.setRatio(r0)
            goto L64
        L4e:
            com.kwad.sdk.widget.RatioFrameLayout r5 = r4.it
            double r0 = r5.getRatio()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L64
            com.kwad.sdk.widget.RatioFrameLayout r5 = r4.it
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            float r0 = q(r0)
            double r0 = (double) r0
            r5.setRatio(r0)
        L64:
            java.lang.Class<com.kwad.components.core.o.a.b.a> r5 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r5 = com.kwad.sdk.components.d.f(r5)
            com.kwad.components.core.o.a.b.a r5 = (com.kwad.components.core.o.a.b.a) r5
            r4.fr = r5
            if (r5 == 0) goto L81
            boolean r5 = r5.qu()
            if (r5 == 0) goto L81
            com.kwad.sdk.core.response.model.AdInfo r5 = r4.mAdInfo
            boolean r5 = com.kwad.sdk.core.response.b.a.cR(r5)
            if (r5 == 0) goto L81
            r5 = 1
            r4.hS = r5
        L81:
            return
    }

    static /* synthetic */ android.os.Handler s(com.kwad.components.ad.feed.widget.q r0) {
            android.os.Handler r0 = r0.iK
            return r0
    }

    static /* synthetic */ void t(com.kwad.components.ad.feed.widget.q r0) {
            r0.cF()
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.at u(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.at r0 = r0.iM
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener v(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener r0 = r0.iA
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener w(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener r0 = r0.iz
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.c x(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.webview.jshandler.ba$c r0 = r0.getRegisterLiveListener()
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.b.a y(com.kwad.components.ad.feed.widget.q r0) {
            com.kwad.components.core.widget.b$a r0 = r0.aig
            return r0
    }

    static /* synthetic */ boolean z(com.kwad.components.ad.feed.widget.q r0) {
            boolean r0 = r0.isNative
            return r0
    }

    @Override // com.kwad.components.core.widget.b
    public final void W() {
            r3 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r0 = r0.mPvReported
            if (r0 != 0) goto L18
            com.kwad.components.core.widget.b$a r0 = r3.aig
            if (r0 == 0) goto L18
            boolean r1 = r3.isNative
            if (r1 == 0) goto L18
            r0.onAdShow()
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 1
            r2 = 2
            com.kwad.components.ad.feed.monitor.b.c(r0, r1, r2)
        L18:
            boolean r0 = r3.isNative
            if (r0 != 0) goto L23
            com.kwad.components.core.webview.jshandler.az r0 = r3.iy
            if (r0 == 0) goto L23
            r0.uG()
        L23:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            com.kwad.sdk.widget.KSRelativeLayout r0 = r1.hL
            if (r2 != r0) goto L2a
            com.kwad.sdk.core.video.videoview.a r2 = r1.cq
            boolean r2 = r2.isIdle()
            if (r2 == 0) goto L22
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            com.kwad.sdk.utils.n.eL(r2)
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r2 = com.kwad.sdk.contentalliance.a.a.a.bQ(r2)
            com.kwad.sdk.core.video.videoview.a r0 = r1.cq
            r0.setKsPlayLogParam(r2)
            com.kwad.sdk.core.video.videoview.a r2 = r1.cq
            r2.start()
            return
        L22:
            com.kwad.sdk.core.video.videoview.a r2 = r1.cq
            r0 = 100
            r1.a(r2, r0)
            return
        L2a:
            android.widget.TextView r0 = r1.iw
            if (r2 != r0) goto L35
            com.kwad.sdk.core.video.videoview.a r2 = r1.cq
            r0 = 25
            r1.a(r2, r0)
        L35:
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r3 = this;
            super.aa()
            com.kwad.components.ad.feed.d$d r0 = r3.hg
            if (r0 == 0) goto L15
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.b.cY(r0)
            float r0 = (float) r0
            android.content.Context r1 = r3.mContext
            com.kwad.components.ad.feed.d$d r2 = r3.hg
            com.kwad.components.ad.feed.d.a(r0, r1, r2)
        L15:
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r3 = this;
            super.ab()
            android.os.Handler r0 = r3.iK
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.utils.n.eK(r0)
            com.kwad.components.ad.feed.d$d r0 = r3.hg
            if (r0 == 0) goto L15
            com.kwad.components.ad.feed.d.a(r0)
        L15:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r3.hR
            if (r0 == 0) goto L1e
            r0.onDestroy()
            r3.hR = r1
        L1e:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r3.fq
            if (r0 == 0) goto L27
            r0.onDestroy()
            r3.fq = r1
        L27:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r2 = r3.fD
            r0.c(r2)
            r3.iE = r1
            r3.iF = r1
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 != 0) goto L9
            goto L12
        L9:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r1.hL
            if (r2 == r0) goto L13
            android.widget.TextView r0 = r1.iw
            if (r2 != r0) goto L12
            goto L13
        L12:
            return
        L13:
            com.kwad.sdk.core.video.videoview.a r2 = r1.cq
            r0 = 153(0x99, float:2.14E-43)
            r1.a(r2, r0)
            return
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.api.KsAdVideoPlayConfig r11) {
            r10 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            java.lang.String r0 = r0.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L24
            android.widget.ImageView r1 = r10.hM
            r1.setImageDrawable(r3)
            android.widget.ImageView r1 = r10.hM
            R extends com.kwad.sdk.core.response.model.AdTemplate r4 = r10.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r4)
            android.widget.ImageView r0 = r10.hM
            r0.setVisibility(r2)
            goto L2b
        L24:
            android.widget.ImageView r0 = r10.hM
            r1 = 8
            r0.setVisibility(r1)
        L2b:
            com.kwad.sdk.core.video.videoview.a r0 = new com.kwad.sdk.core.video.videoview.a
            android.content.Context r1 = r10.mContext
            r0.<init>(r1)
            r10.cq = r0
            java.util.List<java.lang.Integer> r1 = r10.ck
            r0.setTag(r1)
            int r0 = com.kwad.sdk.core.config.e.BQ()
            com.kwad.sdk.core.response.model.AdInfo r1 = r10.mAdInfo
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.K(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L4b
            goto L16a
        L4b:
            if (r0 >= 0) goto L65
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r0 = r0.cf(r5)
            if (r0 == 0) goto L63
            boolean r1 = r0.exists()
            if (r1 == 0) goto L63
            java.lang.String r0 = r0.getAbsolutePath()
        L61:
            r5 = r0
            goto L9b
        L63:
            r5 = r3
            goto L9b
        L65:
            if (r0 != 0) goto L68
            goto L9b
        L68:
            android.content.Context r0 = r10.mContext
            com.kwad.sdk.core.videocache.f r4 = com.kwad.sdk.core.videocache.c.a.bR(r0)
            boolean r0 = com.kwad.sdk.core.config.e.ES()
            if (r0 == 0) goto L97
            int r0 = com.kwad.sdk.core.config.e.BQ()
            boolean r1 = r4.eL(r5)
            if (r1 != 0) goto L92
            com.kwad.sdk.core.network.a.a$a r8 = new com.kwad.sdk.core.network.a.a$a
            r8.<init>()
            int r0 = r0 * 1024
            long r6 = (long) r0
            r9 = 0
            boolean r0 = r4.a(r5, r6, r8, r9)
            if (r0 == 0) goto L9b
            java.lang.String r0 = r4.eJ(r5)
            goto L61
        L92:
            java.lang.String r0 = r4.eJ(r5)
            goto L61
        L97:
            java.lang.String r5 = r4.eJ(r5)
        L9b:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto La3
            goto L16a
        La3:
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            r0.<init>(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dg(r5)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r1 = com.kwad.sdk.core.response.b.e.em(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.h.b(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r1.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            com.kwad.sdk.contentalliance.a.a.a r1 = new com.kwad.sdk.contentalliance.a.a.a
            R extends com.kwad.sdk.core.response.model.AdTemplate r4 = r10.mAdTemplate
            long r5 = java.lang.System.currentTimeMillis()
            r1.<init>(r4, r5)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r0.El()
            com.kwad.sdk.core.video.videoview.a r1 = r10.cq
            r1.a(r0, r3)
            com.kwad.components.ad.feed.widget.q$7 r0 = new com.kwad.components.ad.feed.widget.q$7
            r0.<init>(r10)
            r10.cz = r0
            com.kwad.sdk.core.video.videoview.a r1 = r10.cq
            r1.setExternalPlayerListener(r0)
            com.kwad.sdk.core.video.videoview.a r0 = r10.cq
            boolean r1 = r10.mIsAudioEnable
            boolean r1 = r10.h(r1)
            r0.setVideoSoundEnable(r1)
            com.kwad.components.core.video.e r0 = new com.kwad.components.core.video.e
            android.content.Context r1 = r10.mContext
            R extends com.kwad.sdk.core.response.model.AdTemplate r4 = r10.mAdTemplate
            com.kwad.sdk.core.video.videoview.a r5 = r10.cq
            r0.<init>(r1, r4, r5, r11)
            r10.hN = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.ht = r0
            com.kwad.components.core.video.e r11 = r10.hN
            com.kwad.components.core.video.a$b r0 = r10.getVideoPlayCallback()
            r11.setVideoPlayCallback(r0)
            com.kwad.components.core.video.e r11 = r10.hN
            com.kwad.components.core.video.a$a r0 = r10.hQ
            r11.setAdClickListener(r0)
            com.kwad.sdk.core.video.videoview.a r11 = r10.cq
            com.kwad.components.core.video.e r0 = r10.hN
            r11.setController(r0)
            com.kwad.sdk.widget.KSRelativeLayout r11 = r10.hL
            java.lang.Object r11 = r11.getTag()
            if (r11 == 0) goto L135
            com.kwad.sdk.widget.KSRelativeLayout r11 = r10.hL
            java.lang.Object r0 = r11.getTag()
            android.view.View r0 = (android.view.View) r0
            r11.removeView(r0)
            com.kwad.sdk.widget.KSRelativeLayout r11 = r10.hL
            r11.setTag(r3)
        L135:
            com.kwad.sdk.widget.KSRelativeLayout r11 = r10.hL
            com.kwad.sdk.core.video.videoview.a r0 = r10.cq
            r1 = 1
            r11.addView(r0, r1)
            com.kwad.sdk.widget.KSRelativeLayout r11 = r10.hL
            com.kwad.sdk.core.video.videoview.a r0 = r10.cq
            r11.setTag(r0)
            com.kwad.sdk.widget.KSRelativeLayout r11 = r10.hL
            r11.setClickable(r1)
            com.kwad.sdk.widget.h r11 = new com.kwad.sdk.widget.h
            com.kwad.sdk.widget.KSRelativeLayout r0 = r10.hL
            r11.<init>(r0, r10)
            boolean r11 = r10.mIsAudioEnable
            if (r11 == 0) goto L15f
            android.content.Context r11 = r10.mContext
            com.kwad.components.core.t.a r11 = com.kwad.components.core.t.a.aC(r11)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r0 = r10.cB
            r11.a(r0)
        L15f:
            R extends com.kwad.sdk.core.response.model.AdTemplate r11 = r10.mAdTemplate
            int r11 = r11.type
            if (r11 == r1) goto L16b
            r0 = 19
            if (r11 != r0) goto L16a
            goto L16b
        L16a:
            return
        L16b:
            android.widget.LinearLayout r11 = r10.iv
            r11.setVisibility(r2)
            android.widget.TextView r11 = r10.iw
            r11.setVisibility(r2)
            android.widget.TextView r11 = r10.iw
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r10.mAdTemplate
            java.lang.String r0 = com.kwad.components.ad.feed.f.l(r0)
            r11.setText(r0)
            com.kwad.sdk.widget.h r11 = new com.kwad.sdk.widget.h
            android.widget.TextView r0 = r10.iw
            r11.<init>(r0, r10)
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            super.bt()
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.getCurrentVoiceItem()
            r0.a(r1)
            boolean r0 = r2.hS
            if (r0 != 0) goto L13
            return
        L13:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            if (r0 != 0) goto L1e
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.cu()
            r2.hR = r0
            return
        L1e:
            r0.onResume()
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.j.c
    public final void bu() {
            r2 = this;
            super.bu()
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            if (r0 == 0) goto La
            r0.onPause()
        La:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.fD
            r0.c(r1)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void bw() {
            r1 = this;
            com.kwad.components.ad.feed.monitor.b.ci()
            int r0 = com.kwad.sdk.R.id.ksad_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.widget.RatioFrameLayout r0 = (com.kwad.sdk.widget.RatioFrameLayout) r0
            r1.it = r0
            int r0 = com.kwad.sdk.R.id.ksad_feed_ad_video_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.widget.KSRelativeLayout r0 = (com.kwad.sdk.widget.KSRelativeLayout) r0
            r1.hL = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_immerse_text_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.iv = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_immerse_text
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.iw = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_first_frame_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.hM = r0
            int r0 = com.kwad.sdk.R.id.ksad_live_end_bg_mantle
            android.view.View r0 = r1.findViewById(r0)
            r1.fF = r0
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void cq() {
            r3 = this;
            super.cq()
            int r0 = r3.eR
            r1 = 1
            if (r0 == r1) goto L1e
            boolean r0 = r3.iC
            if (r0 != 0) goto L1e
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
            r0.stopLoading()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
            r2 = 8
            r0.setVisibility(r2)
            java.lang.String r0 = "0"
            r2 = 3
            r3.a(r0, r1, r2)
        L1e:
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r6) {
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.sdk.core.response.b.c.r(r6)
            r5.p(r0)
            r1 = 2
            r0.realShowType = r1
            super.d(r6)
            boolean r2 = r5.iC
            if (r2 == 0) goto L26
            com.kwad.components.core.widget.b r0 = r5.iG
            if (r0 == 0) goto L25
            r0.d(r6)
            com.kwad.components.core.widget.b r6 = r5.iG
            boolean r0 = r6 instanceof com.kwad.components.ad.feed.widget.c
            if (r0 == 0) goto L25
            com.kwad.components.ad.feed.widget.c r6 = (com.kwad.components.ad.feed.widget.c) r6
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r5.bU
            r6.b(r0)
        L25:
            return
        L26:
            R extends com.kwad.sdk.core.response.model.AdTemplate r6 = r5.mAdTemplate
            boolean r6 = com.kwad.sdk.core.response.b.b.dc(r6)
            r2 = 0
            java.lang.String r3 = "0"
            if (r6 != 0) goto L36
            r6 = 1
            r5.a(r3, r2, r6)
            return
        L36:
            boolean r6 = r5.cH()
            if (r6 != 0) goto L41
            R extends com.kwad.sdk.core.response.model.AdTemplate r6 = r5.mAdTemplate
            r5.r(r6)
        L41:
            java.lang.String r6 = r5.iD     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L4d
            java.lang.String r4 = r0.mOriginJString     // Catch: java.lang.Throwable -> L60
            boolean r6 = r6.equals(r4)     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L63
        L4d:
            boolean r6 = r5.cH()     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L59
            com.kwad.sdk.core.webview.KsAdWebView r6 = r5.mAdWebView     // Catch: java.lang.Throwable -> L60
            r6.reload()     // Catch: java.lang.Throwable -> L60
            goto L63
        L59:
            r6 = -2
            r5.eR = r6     // Catch: java.lang.Throwable -> L60
            r5.bd()     // Catch: java.lang.Throwable -> L60
            goto L63
        L60:
            r5.a(r3, r2, r1)
        L63:
            java.lang.String r6 = r0.mOriginJString
            r5.iD = r6
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_webview
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            return
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
            com.kwad.sdk.core.webview.KsAdWebView r0 = r9.mAdWebView
            if (r0 == 0) goto L81
            boolean r0 = r9.isNative
            if (r0 != 0) goto L81
            float r0 = r10.getX()
            float r2 = r9.hu
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L81
            com.kwad.sdk.core.webview.KsAdWebView r0 = r9.mAdWebView
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
            com.kwad.sdk.core.webview.KsAdWebView r0 = r9.mAdWebView
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L81:
            boolean r10 = super.onInterceptTouchEvent(r10)
            return r10
        L86:
            boolean r10 = super.onInterceptTouchEvent(r10)
            return r10
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.View
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L6
            goto L9c
        L6:
            super.onWindowFocusChanged(r2)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L8b
            boolean r2 = r1.ct()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L13
            goto L9c
        L13:
            com.kwad.sdk.core.video.videoview.a r2 = r1.cq     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L7b
            android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L40
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.widget.KSRelativeLayout r0 = r1.hL     // Catch: java.lang.Throwable -> L40
            if (r2 == r0) goto L7b
            com.kwad.sdk.core.video.videoview.a r0 = r1.cq     // Catch: java.lang.Throwable -> L40
            r2.removeView(r0)     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.widget.KSRelativeLayout r2 = r1.hL     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r2.getTag()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L42
            com.kwad.sdk.widget.KSRelativeLayout r2 = r1.hL     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r2.getTag()     // Catch: java.lang.Throwable -> L40
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L40
            r2.removeView(r0)     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.widget.KSRelativeLayout r2 = r1.hL     // Catch: java.lang.Throwable -> L40
            r0 = 0
            r2.setTag(r0)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r2 = move-exception
            goto L9d
        L42:
            com.kwad.sdk.widget.KSRelativeLayout r2 = r1.hL     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.core.video.videoview.a r0 = r1.cq     // Catch: java.lang.Throwable -> L40
            r2.addView(r0)     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.widget.KSRelativeLayout r2 = r1.hL     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.core.video.videoview.a r0 = r1.cq     // Catch: java.lang.Throwable -> L40
            r2.setTag(r0)     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.core.video.videoview.a r2 = r1.cq     // Catch: java.lang.Throwable -> L40
            boolean r0 = r1.mIsAudioEnable     // Catch: java.lang.Throwable -> L40
            r2.setVideoSoundEnable(r0)     // Catch: java.lang.Throwable -> L40
            com.kwad.components.core.video.e r2 = r1.hN     // Catch: java.lang.Throwable -> L40
            com.kwad.components.core.video.a$b r0 = r1.getVideoPlayCallback()     // Catch: java.lang.Throwable -> L40
            r2.setVideoPlayCallback(r0)     // Catch: java.lang.Throwable -> L40
            com.kwad.components.core.video.e r2 = r1.hN     // Catch: java.lang.Throwable -> L40
            com.kwad.components.core.video.a$a r0 = r1.hQ     // Catch: java.lang.Throwable -> L40
            r2.setAdClickListener(r0)     // Catch: java.lang.Throwable -> L40
            com.kwad.components.core.video.e r2 = r1.hN     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.getAdTemplate()     // Catch: java.lang.Throwable -> L40
            r0 = 0
            r2.mAdWebVideoPageShowing = r0     // Catch: java.lang.Throwable -> L40
            com.kwad.components.core.video.e r2 = r1.hN     // Catch: java.lang.Throwable -> L40
            r2.tU()     // Catch: java.lang.Throwable -> L40
            com.kwad.components.core.video.e r2 = r1.hN     // Catch: java.lang.Throwable -> L40
            r0 = 1
            r2.setAutoRelease(r0)     // Catch: java.lang.Throwable -> L40
        L7b:
            com.kwad.sdk.core.response.model.AdInfo r2 = r1.mAdInfo     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L9c
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r2)     // Catch: java.lang.Throwable -> L40
            com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache r0 = com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache.getInstance()     // Catch: java.lang.Throwable -> L40
            r0.remove(r2)     // Catch: java.lang.Throwable -> L40
            return
        L8b:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r1.fq     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L9c
            android.view.View r2 = r2.getView()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L9c
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r2 = r1.hR     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L9c
            r2.onPause()     // Catch: java.lang.Throwable -> L40
        L9c:
            return
        L9d:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void setMargin(int r1) {
            r0 = this;
            return
    }

    public final void setPreloadListener(com.kwad.components.ad.feed.widget.q.a r4) {
            r3 = this;
            com.kwad.components.ad.feed.widget.q$a r0 = r3.iI
            if (r0 == 0) goto L10
            int r1 = r3.eR
            r2 = 1
            if (r1 == r2) goto La
            goto Lb
        La:
            r2 = 2
        Lb:
            java.lang.String r1 = ""
            r0.d(r2, r1)
        L10:
            r3.iI = r4
            return
    }

    public final void setVideoPlayConfig(com.kwad.sdk.api.KsAdVideoPlayConfig r4) {
            r3 = this;
            r3.bU = r4
            boolean r0 = r4 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r0 == 0) goto L60
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r4 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r4
            int r0 = r4.getVideoSoundValue()
            if (r0 == 0) goto L4f
            boolean r0 = r4.isVideoSoundEnable()
            r3.mIsAudioEnable = r0
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            if (r1 == 0) goto L1a
            r1.mIsAudioEnable = r0
        L1a:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r3.fq
            if (r0 == 0) goto L33
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L33
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r3.hR
            if (r0 == 0) goto L33
            boolean r1 = r3.mIsAudioEnable
            boolean r1 = r3.h(r1)
            r2 = 0
            r0.setAudioEnabled(r1, r2)
            goto L40
        L33:
            com.kwad.sdk.core.video.videoview.a r0 = r3.cq
            if (r0 == 0) goto L40
            boolean r1 = r3.mIsAudioEnable
            boolean r1 = r3.h(r1)
            r0.setVideoSoundEnable(r1)
        L40:
            boolean r0 = r3.mIsAudioEnable
            if (r0 == 0) goto L4f
            android.content.Context r0 = r3.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r3.cB
            r0.a(r1)
        L4f:
            int r0 = r4.getDataFlowAutoStartValue()
            if (r0 == 0) goto L60
            com.kwad.components.core.video.e r0 = r3.hN
            if (r0 == 0) goto L60
            boolean r4 = r4.isDataFlowAutoStart()
            r0.setDataAutoStart(r4)
        L60:
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
