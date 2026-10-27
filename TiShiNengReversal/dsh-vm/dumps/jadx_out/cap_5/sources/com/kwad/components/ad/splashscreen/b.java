package com.kwad.components.ad.splashscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private static final android.os.Handler iK = null;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private volatile boolean Fa;

        private a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.Fa = r0
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.b.a r0) {
                boolean r0 = r0.Fa
                return r0
        }

        static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.b.a r0, boolean r1) {
                r0.Fa = r1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.splashscreen.b$b, reason: collision with other inner class name */
    static class C0048b {
        private volatile boolean Fb;

        private C0048b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.Fb = r0
                return
        }

        /* synthetic */ C0048b(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.b.C0048b r0) {
                boolean r0 = r0.Fb
                return r0
        }

        static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.b.C0048b r0, boolean r1) {
                r1 = 1
                r0.Fb = r1
                return r1
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.kwad.components.ad.splashscreen.b.iK = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(com.kwad.components.core.request.model.ImpInfo r5) {
            com.kwad.sdk.internal.api.SceneImpl r5 = r5.adScene
            java.lang.String r0 = r5.getBidResponse()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L60
            java.lang.String r0 = r5.getBidResponseV2()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            goto L60
        L17:
            com.kwad.components.core.p.a r0 = com.kwad.components.core.p.a.se()
            r0.sh()
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            long r2 = r5.posId
            com.kwad.components.ad.splashscreen.monitor.b.v(r2)
            r2 = 4
            r5.setAdStyle(r2)
            r2 = 5
            r5.setAdNum(r2)
            com.kwad.components.core.request.model.ImpInfo r2 = new com.kwad.components.core.request.model.ImpInfo
            r2.<init>(r5)
            java.lang.String r3 = "KsAdSplashScreenLoadManager"
            java.lang.String r4 = "loadSplashScreenCache "
            com.kwad.sdk.core.d.c.d(r3, r4)
            com.kwad.components.ad.KsAdLoadManager r3 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r4 = new com.kwad.components.core.request.model.a$a
            r4.<init>()
            com.kwad.components.core.request.model.a$a r2 = r4.e(r2)
            r4 = 0
            com.kwad.components.core.request.model.a$a r2 = r2.aM(r4)
            com.kwad.components.ad.splashscreen.b$5 r4 = new com.kwad.components.ad.splashscreen.b$5
            r4.<init>(r5, r0)
            com.kwad.components.core.request.model.a$a r5 = r2.a(r4)
            com.kwad.components.core.request.model.a r5 = r5.sw()
            r3.a(r5)
        L60:
            return
    }

    private static void a(com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener r1, com.kwad.sdk.api.KsSplashScreenAd r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.components.ad.splashscreen.b$4 r0 = new com.kwad.components.ad.splashscreen.b$4
            r0.<init>(r2, r1, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    private static boolean a(com.kwad.components.ad.splashscreen.b.C0048b r0, com.kwad.sdk.core.response.model.AdTemplate r1, long r2, long r4, java.lang.Runnable r6) {
            boolean r0 = com.kwad.components.ad.splashscreen.b.C0048b.a(r0)
            if (r0 == 0) goto L18
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            r5 = r4
            r3 = r2
            r2 = 7
            com.kwad.components.ad.splashscreen.monitor.b.b(r1, r2, r3, r5)
            java.lang.String r0 = "KsAdSplashScreenLoadManager"
            java.lang.String r1 = "loadSplashAd isTimeOut return "
            com.kwad.sdk.core.d.c.d(r0, r1)
            r0 = 1
            return r0
        L18:
            android.os.Handler r0 = com.kwad.components.ad.splashscreen.b.iK
            r0.removeCallbacks(r6)
            r0 = 0
            return r0
    }

    private static boolean a(com.kwad.sdk.core.response.model.AdResultData r2, com.kwad.components.ad.splashscreen.b.a r3, com.kwad.components.core.request.d r4, boolean r5, long r6) {
            java.util.List r0 = r2.getAdTemplateList()
            int r0 = r0.size()
            if (r0 != 0) goto L46
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEq
            int r0 = r0.errorCode
            java.lang.String r1 = r2.testErrorMsg
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1e
            com.kwad.sdk.core.network.e r1 = com.kwad.sdk.core.network.e.aEq
            java.lang.String r1 = r1.msg
            goto L20
        L1e:
            java.lang.String r1 = r2.testErrorMsg
        L20:
            com.kwad.components.ad.splashscreen.monitor.b.c(r5, r0, r1, r6)
            r6 = 1
            com.kwad.components.ad.splashscreen.b.a.a(r3, r6)
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEq
            int r3 = r3.errorCode
            java.lang.String r7 = r2.testErrorMsg
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L38
            com.kwad.sdk.core.network.e r2 = com.kwad.sdk.core.network.e.aEq
            java.lang.String r2 = r2.msg
            goto L3a
        L38:
            java.lang.String r2 = r2.testErrorMsg
        L3a:
            r4.a(r3, r2, r5)
            com.kwad.components.core.p.a r2 = com.kwad.components.core.p.a.se()
            r3 = 3
            r2.aS(r3)
            return r6
        L46:
            r2 = 0
            return r2
    }

    static /* synthetic */ void b(com.kwad.components.core.request.model.ImpInfo r0) {
            a(r0)
            return
    }

    static /* synthetic */ void b(com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener r0, com.kwad.sdk.api.KsSplashScreenAd r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            a(r0, r1, r2)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.splashscreen.b.C0048b r0, com.kwad.sdk.core.response.model.AdTemplate r1, long r2, long r4, java.lang.Runnable r6) {
            boolean r0 = a(r0, r1, r2, r4, r6)
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.sdk.core.response.model.AdResultData r0, com.kwad.components.ad.splashscreen.b.a r1, com.kwad.components.core.request.d r2, boolean r3, long r4) {
            boolean r0 = a(r0, r1, r2, r3, r4)
            return r0
    }

    public static void loadSplashScreenAd(@androidx.annotation.NonNull com.kwad.sdk.api.KsScene r19, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener r20) {
            long r8 = android.os.SystemClock.elapsedRealtime()
            com.kwad.sdk.internal.api.SceneImpl r4 = com.kwad.sdk.internal.api.SceneImpl.covert(r19)
            com.kwad.sdk.commercial.d.d.c(r4)
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            long r0 = r4.getPosId()
            com.kwad.components.ad.splashscreen.monitor.b.u(r0)
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.tn()
            java.lang.String r1 = "loadSplashScreenAd"
            boolean r0 = r0.b(r4, r1)
            r1 = 4
            r4.setAdStyle(r1)
            r1 = 1
            r4.setAdNum(r1)
            java.lang.String r2 = "KsAdSplashScreenLoadManager"
            java.lang.String r3 = "loadSplashScreenAd "
            com.kwad.sdk.core.d.c.d(r2, r3)
            com.kwad.components.ad.splashscreen.b$a r3 = new com.kwad.components.ad.splashscreen.b$a
            r2 = 0
            r3.<init>(r2)
            com.kwad.components.ad.splashscreen.b.a.a(r3, r2)
            long r6 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.core.request.model.ImpInfo r5 = new com.kwad.components.core.request.model.ImpInfo
            r5.<init>(r4)
            com.kwad.components.ad.splashscreen.b$b r10 = new com.kwad.components.ad.splashscreen.b$b
            r10.<init>(r2)
            com.kwad.components.core.p.a r2 = com.kwad.components.core.p.a.se()
            r2.sg()
            android.os.Handler r2 = com.kwad.components.ad.splashscreen.b.iK
            com.kwad.components.ad.splashscreen.b$1 r11 = new com.kwad.components.ad.splashscreen.b$1
            r11.<init>(r5)
            r12 = 15000(0x3a98, double:7.411E-320)
            r2.postDelayed(r11, r12)
            com.kwad.components.ad.splashscreen.b$2 r11 = new com.kwad.components.ad.splashscreen.b$2
            r12 = r20
            r11.<init>(r10, r12, r4)
            com.kwad.sdk.core.config.item.k r13 = com.kwad.components.ad.splashscreen.b.a.FM
            int r13 = com.kwad.sdk.core.config.e.a(r13)
            if (r13 >= 0) goto L69
            r13 = 5000(0x1388, float:7.006E-42)
        L69:
            long r13 = (long) r13
            r2.postDelayed(r11, r13)
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 - r8
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            long r1 = r4.getPosId()
            com.kwad.components.ad.splashscreen.monitor.b.f(r1, r13)
            com.kwad.components.ad.splashscreen.SplashPreloadManager r1 = com.kwad.components.ad.splashscreen.SplashPreloadManager.lD()
            r15 = r3
            long r2 = r4.getPosId()
            r16 = r4
            r4 = 2
            r1.a(r2, r4)
            com.kwad.components.ad.splashscreen.SplashPreloadManager r1 = com.kwad.components.ad.splashscreen.SplashPreloadManager.lD()
            java.util.List r1 = r1.lE()
            com.kwad.components.ad.splashscreen.SplashPreloadManager r2 = com.kwad.components.ad.splashscreen.SplashPreloadManager.lD()
            java.util.List r2 = r2.i(r1)
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            long r3 = r16.getPosId()
            com.kwad.components.ad.splashscreen.monitor.b.a(r3, r1, r2)
            com.kwad.components.ad.KsAdLoadManager r1 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r2 = new com.kwad.components.core.request.model.a$a
            r2.<init>()
            com.kwad.components.core.request.model.a$a r2 = r2.e(r5)
            r3 = 1
            com.kwad.components.core.request.model.a$a r2 = r2.aL(r3)
            com.kwad.components.core.request.model.a$a r0 = r2.aM(r0)
            r2 = r0
            com.kwad.components.ad.splashscreen.b$3 r0 = new com.kwad.components.ad.splashscreen.b$3
            r5 = r12
            r3 = r15
            r4 = r16
            r12 = r1
            r1 = r10
            r17 = r13
            r13 = r2
            r2 = r11
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            com.kwad.components.core.request.model.a$a r0 = r13.a(r0)
            com.kwad.components.core.request.model.a r0 = r0.sw()
            r12.a(r0)
            return
    }

    static /* synthetic */ android.os.Handler lx() {
            android.os.Handler r0 = com.kwad.components.ad.splashscreen.b.iK
            return r0
    }
}
