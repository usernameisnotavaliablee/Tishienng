package com.kwad.components.ad.interstitial.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.sdk.mvp.a {

    @androidx.annotation.NonNull
    public com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    public com.kwad.sdk.core.video.videoview.a cq;

    @androidx.annotation.NonNull
    public com.kwad.sdk.widget.KSFrameLayout fV;
    private android.os.Handler iK;
    public com.kwad.components.ad.interstitial.g.b kO;
    public com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener kQ;
    public com.kwad.components.ad.interstitial.d kW;
    public com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    public com.kwad.components.ad.interstitial.h.d mk;
    public boolean ml;
    public boolean mm;
    public boolean mn;
    public com.kwad.components.ad.interstitial.f.c.a mo;
    public java.util.List<com.kwad.components.ad.interstitial.f.c.b> mp;
    public com.kwad.components.core.webview.tachikoma.f.g mq;
    public com.kwad.components.ad.interstitial.f.c.e mr;
    public java.util.List<com.kwad.components.ad.interstitial.f.c.d> ms;
    public java.util.List<com.kwad.components.core.video.a.c> mt;
    public volatile boolean mu;
    public boolean mv;
    public boolean mw;
    public int mx;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.interstitial.f.c$3, reason: invalid class name */
    final class AnonymousClass3 implements com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener {
        final /* synthetic */ android.content.Context dq;
        final /* synthetic */ android.view.View eu;
        final /* synthetic */ com.kwad.components.ad.interstitial.f.c mz;


        AnonymousClass3(com.kwad.components.ad.interstitial.f.c r1, android.content.Context r2, android.view.View r3) {
                r0 = this;
                r0.mz = r1
                r0.dq = r2
                r0.eu = r3
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final boolean onDecode(java.lang.String r1, java.io.InputStream r2, com.kwad.sdk.core.imageloader.core.decode.DecodedResult r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingCancelled(java.lang.String r1, android.view.View r2) {
                r0 = this;
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingComplete(java.lang.String r1, android.view.View r2, com.kwad.sdk.core.imageloader.core.decode.DecodedResult r3) {
                r0 = this;
                com.kwad.components.ad.interstitial.f.c$3$1 r1 = new com.kwad.components.ad.interstitial.f.c$3$1
                r1.<init>(r0, r3)
                com.kwad.sdk.utils.h.execute(r1)
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingFailed(java.lang.String r1, android.view.View r2, com.kwad.sdk.core.imageloader.core.assist.FailReason r3) {
                r0 = this;
                return
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingStarted(java.lang.String r1, android.view.View r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(long r1, long r3, boolean r5);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void c(long r1, long r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.interstitial.f.c$c, reason: collision with other inner class name */
    public static class C0024c {
        private final android.content.Context context;
        private int mG;
        private boolean mH;
        private int mI;
        private boolean mJ;
        private com.kwad.sdk.utils.aj.a mK;
        public double mL;
        public boolean mM;

        public C0024c(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        static /* synthetic */ int c(com.kwad.components.ad.interstitial.f.c.C0024c r0) {
                int r0 = r0.mI
                return r0
        }

        static /* synthetic */ boolean d(com.kwad.components.ad.interstitial.f.c.C0024c r0) {
                boolean r0 = r0.mJ
                return r0
        }

        public final com.kwad.components.ad.interstitial.f.c.C0024c L(int r1) {
                r0 = this;
                r0.mG = r1
                return r0
        }

        public final com.kwad.components.ad.interstitial.f.c.C0024c M(int r1) {
                r0 = this;
                r0.mI = r1
                return r0
        }

        public final com.kwad.components.ad.interstitial.f.c.C0024c a(com.kwad.sdk.utils.aj.a r1) {
                r0 = this;
                r0.mK = r1
                return r0
        }

        public final com.kwad.components.ad.interstitial.f.c.C0024c c(double r1) {
                r0 = this;
                r0.mL = r1
                return r0
        }

        public final int dW() {
                r1 = this;
                int r0 = r1.mG
                return r0
        }

        public final boolean dX() {
                r1 = this;
                boolean r0 = r1.mH
                return r0
        }

        public final boolean dY() {
                r1 = this;
                boolean r0 = r1.mJ
                return r0
        }

        public final int dZ() {
                r1 = this;
                int r0 = r1.mI
                return r0
        }

        public final double ea() {
                r2 = this;
                double r0 = r2.mL
                return r0
        }

        public final android.content.Context getContext() {
                r1 = this;
                android.content.Context r0 = r1.context
                return r0
        }

        public final com.kwad.sdk.utils.aj.a getTouchCoords() {
                r1 = this;
                com.kwad.sdk.utils.aj$a r0 = r1.mK
                return r0
        }

        public final com.kwad.components.ad.interstitial.f.c.C0024c l(boolean r1) {
                r0 = this;
                r0.mH = r1
                return r0
        }

        public final com.kwad.components.ad.interstitial.f.c.C0024c m(boolean r1) {
                r0 = this;
                r1 = 1
                r0.mJ = r1
                return r0
        }

        public final com.kwad.components.ad.interstitial.f.c.C0024c n(boolean r1) {
                r0 = this;
                r1 = 1
                r0.mM = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void eb();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void ec();
    }

    public c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mp = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r0 = 0
            r2.mu = r0
            r0 = -1
            r2.mx = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mt = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.ms = r0
            return
    }

    private static int a(long r4, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r6) {
            r0 = -1
            r2 = -1
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto L8
            return r2
        L8:
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r6)
            long r0 = com.kwad.sdk.core.response.b.a.M(r6)
            float r6 = (float) r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r0
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L24
            float r4 = (float) r4
            float r4 = r4 / r6
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            return r4
        L24:
            return r2
    }

    private static long a(@androidx.annotation.Nullable com.kwad.sdk.core.video.videoview.a r2) {
            if (r2 != 0) goto L5
            r0 = -1
            return r0
        L5:
            long r0 = r2.getCurrentPosition()
            return r0
    }

    private void a(int r2, int r3, android.content.Context r4, long r5, long r7) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r4 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.sdk.core.adlog.c.b r2 = r0.dk(r2)
            com.kwad.sdk.core.adlog.c.b r2 = r2.dd(r3)
            boolean r3 = com.kwad.sdk.utils.aq.QW()
            r0 = 1
            if (r3 == 0) goto L18
            r3 = 2
            goto L19
        L18:
            r3 = 1
        L19:
            com.kwad.sdk.core.adlog.c.b r2 = r2.dr(r3)
            com.kwad.sdk.core.adlog.c.a r2 = r2.EM()
            r3 = 0
            com.kwad.sdk.core.adlog.c.a(r4, r2, r3)
            r1.ml = r0
            r1.c(r5, r7)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.interstitial.f.c r0, int r1, int r2, android.content.Context r3, long r4, long r6) {
            r4 = 6
            r0.a(r1, r2, r3, r4, r6)
            return
    }

    public static boolean a(android.content.Context r0, com.kwad.sdk.core.response.model.AdInfo r1) {
            boolean r0 = com.kwad.sdk.core.response.b.a.aW(r1)
            if (r0 == 0) goto Le
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static int b(@androidx.annotation.Nullable com.kwad.sdk.core.video.videoview.a r7) {
            r0 = -1
            if (r7 != 0) goto L4
            return r0
        L4:
            long r1 = r7.getDuration()
            long r3 = r7.getCurrentPosition()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L1e
            float r7 = (float) r3
            float r0 = (float) r1
            float r7 = r7 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r0
            int r7 = java.lang.Math.round(r7)
            return r7
        L1e:
            return r0
    }

    static /* synthetic */ android.os.Handler c(com.kwad.components.ad.interstitial.f.c r0) {
            android.os.Handler r0 = r0.iK
            return r0
    }

    public final boolean M(android.content.Context r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto L10
            if (r3 != 0) goto L7
            goto L10
        L7:
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r3 = com.kwad.sdk.core.response.b.a.bK(r3)
            return r3
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isPlayable illegal params: "
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.append(r1)
            java.lang.String r1 = ", context: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "InterstitialCallerContext"
            com.kwad.sdk.core.d.c.w(r0, r3)
            r3 = 0
            return r3
    }

    public final void Y() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kQ
            if (r0 == 0) goto L7
            r0.onAdClosed()
        L7:
            return
    }

    public final void a(android.content.Context r7, int r8, int r9, int r10) {
            r6 = this;
            com.kwad.components.ad.interstitial.report.a r0 = com.kwad.components.ad.interstitial.report.a.eO()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            r2 = 6
            long r4 = (long) r8
            r0.a(r1, r2, r4)
            com.kwad.components.core.e.d.a$a r9 = new com.kwad.components.core.e.d.a$a
            r9.<init>(r7)
            com.kwad.sdk.core.response.model.AdTemplate r10 = r6.mAdTemplate
            com.kwad.components.core.e.d.a$a r9 = r9.aB(r10)
            com.kwad.components.core.e.d.c r10 = r6.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r9 = r9.b(r10)
            r10 = 0
            com.kwad.components.core.e.d.a$a r9 = r9.aq(r10)
            r10 = 2
            com.kwad.components.core.e.d.a$a r9 = r9.aB(r10)
            r10 = 6
            com.kwad.components.core.e.d.a$a r9 = r9.az(r10)
            com.kwad.components.core.e.d.a$a r9 = r9.aA(r8)
            com.kwad.components.ad.interstitial.f.c$2 r10 = new com.kwad.components.ad.interstitial.f.c$2
            r0 = 9
            r10.<init>(r6, r0, r8, r7)
            com.kwad.components.core.e.d.a$a r7 = r9.a(r10)
            com.kwad.components.core.e.d.a.a(r7)
            return
    }

    public final void a(android.content.Context r3, com.kwad.sdk.core.response.model.AdInfo r4, com.kwad.sdk.core.response.model.AdTemplate r5, @androidx.annotation.Nullable android.view.View r6) {
            r2 = this;
            if (r6 != 0) goto L3
            goto L11
        L3:
            com.kwad.sdk.core.response.model.b r4 = com.kwad.sdk.core.response.b.a.bu(r4)
            java.lang.String r4 = r4.getUrl()
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r4)
            if (r0 == 0) goto L12
        L11:
            return
        L12:
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r0 = com.kwad.sdk.core.imageloader.KSImageLoader.IMGOPTION_NORMAL
            com.kwad.components.ad.interstitial.f.c$3 r1 = new com.kwad.components.ad.interstitial.f.c$3
            r1.<init>(r2, r3, r6)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r4, r5, r0, r1)
            return
    }

    public final void a(com.kwad.components.ad.interstitial.f.c.b r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.components.ad.interstitial.f.c$b> r0 = r1.mp
            r0.add(r2)
            return
    }

    public final void a(com.kwad.components.core.video.a.c r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.video.a$c> r0 = r1.mt
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.List<com.kwad.components.core.video.a$c> r0 = r1.mt
            r0.add(r2)
        Ld:
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            r0.mAdResultData = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            r0.mAdTemplate = r1
            return
    }

    public final void a(boolean r13, int r14, @androidx.annotation.Nullable com.kwad.sdk.core.video.videoview.a r15) {
            r12 = this;
            com.kwad.components.ad.interstitial.report.a r0 = com.kwad.components.ad.interstitial.report.a.eO()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r12.mAdTemplate
            com.kwad.sdk.widget.KSFrameLayout r2 = r12.fV
            r3 = 1
            double r4 = com.kwad.sdk.utils.bz.k(r2, r3)
            r0.a(r1, r4)
            if (r15 == 0) goto L1d
            long r0 = a(r15)
            int r14 = b(r15)
        L1a:
            r8 = r14
            r6 = r0
            goto L25
        L1d:
            long r0 = (long) r14
            com.kwad.sdk.core.response.model.AdTemplate r14 = r12.mAdTemplate
            int r14 = a(r0, r14)
            goto L1a
        L25:
            if (r13 == 0) goto L2c
            r3 = 14
            r5 = 14
            goto L2d
        L2c:
            r5 = 1
        L2d:
            com.kwad.sdk.core.response.model.AdTemplate r4 = r12.mAdTemplate
            com.kwad.components.ad.interstitial.d r13 = r12.kW
            com.kwad.sdk.utils.bv r13 = r13.getTimerHelper()
            long r9 = r13.getTime()
            r11 = 0
            com.kwad.sdk.core.adlog.c.a(r4, r5, r6, r8, r9, r11)
            return
    }

    public final boolean a(com.kwad.components.ad.interstitial.f.c.C0024c r7) {
            r6 = this;
            com.kwad.components.ad.interstitial.report.a r0 = com.kwad.components.ad.interstitial.report.a.eO()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            int r2 = com.kwad.components.ad.interstitial.f.c.C0024c.c(r7)
            long r4 = (long) r2
            r2 = 1
            r0.a(r1, r2, r4)
            int r0 = r7.dW()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r3 = com.kwad.components.ad.interstitial.b.b.dK()
            if (r3 != 0) goto L2d
            if (r0 != 0) goto L2d
            boolean r3 = r7.dY()
            if (r3 != 0) goto L2d
            boolean r3 = r7.mM
            if (r3 == 0) goto L2e
        L2d:
            r1 = 1
        L2e:
            if (r1 == 0) goto L73
            com.kwad.components.core.e.d.a$a r3 = new com.kwad.components.core.e.d.a$a
            android.content.Context r4 = r7.getContext()
            r3.<init>(r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r6.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r4)
            com.kwad.components.core.e.d.c r4 = r6.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r4)
            com.kwad.components.core.e.d.a$a r0 = r3.aq(r0)
            com.kwad.components.core.e.d.a$a r0 = r0.az(r2)
            int r2 = com.kwad.components.ad.interstitial.f.c.C0024c.c(r7)
            com.kwad.components.core.e.d.a$a r0 = r0.aA(r2)
            com.kwad.sdk.core.video.videoview.a r2 = r6.cq
            long r2 = r2.getCurrentPosition()
            com.kwad.components.core.e.d.a$a r0 = r0.A(r2)
            int r2 = r7.dW()
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r2)
            com.kwad.components.ad.interstitial.f.c$1 r2 = new com.kwad.components.ad.interstitial.f.c$1
            r2.<init>(r6, r7)
            com.kwad.components.core.e.d.a$a r7 = r0.a(r2)
            com.kwad.components.core.e.d.a.a(r7)
        L73:
            return r1
    }

    public final void b(com.kwad.components.ad.interstitial.f.c.b r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.components.ad.interstitial.f.c$b> r0 = r1.mp
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.ad.interstitial.f.c.C0024c r7) {
            r6 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.sdk.utils.aj$a r1 = r7.getTouchCoords()
            r0.f(r1)
            boolean r1 = r7.dX()
            if (r1 != 0) goto L1d
            boolean r1 = com.kwad.components.ad.interstitial.f.c.C0024c.d(r7)
            if (r1 != 0) goto L1d
            r1 = 153(0x99, float:2.14E-43)
            r7.M(r1)
        L1d:
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            int r2 = r7.dZ()
            com.kwad.sdk.core.adlog.c.b r1 = r1.dd(r2)
            com.kwad.sdk.utils.aj$a r2 = r7.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r1 = r1.f(r2)
            boolean r2 = com.kwad.sdk.utils.aq.QW()
            r3 = 1
            if (r2 == 0) goto L3b
            r2 = 2
            goto L3c
        L3b:
            r2 = 1
        L3c:
            com.kwad.sdk.core.adlog.c.b r1 = r1.dr(r2)
            double r4 = r7.ea()
            com.kwad.sdk.core.adlog.c.b r1 = r1.l(r4)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r6.mAdTemplate
            r4 = 0
            com.kwad.sdk.core.adlog.c.a(r2, r1, r4)
            com.kwad.sdk.core.video.videoview.a r1 = r6.cq
            if (r1 == 0) goto L62
            long r1 = a(r1)
            com.kwad.sdk.core.video.videoview.a r4 = r6.cq
            int r4 = b(r4)
            r0.aw(r1)
            r0.dl(r4)
        L62:
            r6.ml = r3
            int r7 = com.kwad.components.ad.interstitial.f.c.C0024c.c(r7)
            long r0 = (long) r7
            r2 = 1
            r6.c(r2, r0)
            return
    }

    public final void b(com.kwad.components.core.video.a.c r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.video.a$c> r0 = r1.mt
            r0.remove(r2)
            return
    }

    public final void c(long r8, long r10) {
            r7 = this;
            java.util.List<com.kwad.components.ad.interstitial.f.c$b> r0 = r7.mp
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.interstitial.f.c$b r1 = (com.kwad.components.ad.interstitial.f.c.b) r1
            r1.c(r8, r10)
            goto L6
        L16:
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r7.kQ
            if (r0 == 0) goto L1d
            r0.onAdClicked()
        L1d:
            com.kwad.components.ad.interstitial.f.c$a r1 = r7.mo
            if (r1 == 0) goto L27
            r6 = 1
            r2 = r8
            r4 = r10
            r1.a(r2, r4, r6)
        L27:
            return
    }

    public final void c(android.content.Context r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            r1 = this;
            boolean r0 = r1.mu
            if (r0 == 0) goto L5
            return
        L5:
            com.kwad.components.core.page.a.launch(r2, r3)
            r2 = 1
            r1.mu = r2
            return
    }

    public final void dT() {
            r1 = this;
            com.kwad.components.ad.interstitial.f.c$e r0 = r1.mr
            if (r0 == 0) goto L7
            r0.ec()
        L7:
            return
    }

    public final void dU() {
            r2 = this;
            java.util.List<com.kwad.components.ad.interstitial.f.c$d> r0 = r2.ms
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.interstitial.f.c$d r1 = (com.kwad.components.ad.interstitial.f.c.d) r1
            r1.eb()
            goto L6
        L16:
            return
    }

    public final boolean dV() {
            r3 = this;
            com.kwad.components.ad.interstitial.h.d r0 = r3.mk
            if (r0 == 0) goto Ld
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isH5Interstitial :"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "InterstitialCallerContext"
            com.kwad.sdk.core.d.c.d(r2, r1)
            return r0
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
            r2 = this;
            android.os.Handler r0 = r2.iK
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            java.util.List<com.kwad.components.core.video.a$c> r0 = r2.mt
            r0.clear()
            java.util.List<com.kwad.components.ad.interstitial.f.c$d> r0 = r2.ms
            r0.clear()
            com.kwad.components.ad.interstitial.g.b r0 = r2.kO
            if (r0 == 0) goto L17
            r0.wj()
        L17:
            return
    }

    public final void setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.mAdTemplate = r1
            return
    }
}
