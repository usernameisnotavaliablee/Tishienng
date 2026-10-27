package com.kwad.components.ad.h.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.sdk.core.webview.c.a {
    public static int qo = 1;
    public static int qp = 2;
    private com.kwad.sdk.core.webview.c.c qn;
    private int qq;
    private int qr;
    private com.kwad.components.ad.h.a.a.b.c qs;
    private com.kwad.components.ad.h.a.a.b.InterfaceC0018b qt;

    @androidx.annotation.Nullable
    private java.lang.Runnable qu;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int qw;
        public int qx;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.h.a.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0018b {
        void Q(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements java.lang.Runnable {
        final /* synthetic */ com.kwad.components.ad.h.a.a.b qv;
        private boolean qy;
        private int qz;

        private c(com.kwad.components.ad.h.a.a.b r1) {
                r0 = this;
                r0.qv = r1
                r0.<init>()
                r1 = 0
                r0.qy = r1
                r1 = -1
                r0.qz = r1
                return
        }

        /* synthetic */ c(com.kwad.components.ad.h.a.a.b r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void X(int r1) {
                r0 = this;
                r0.qz = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "TimerRunnable run timerPaused:  "
                r0.<init>(r1)
                boolean r1 = r5.qy
                r0.append(r1)
                java.lang.String r1 = ", currentTime: "
                r0.append(r1)
                int r1 = r5.qz
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "RegisterTimer"
                com.kwad.sdk.core.d.c.d(r1, r0)
                boolean r0 = r5.qy
                r1 = 1000(0x3e8, double:4.94E-321)
                r3 = 0
                if (r0 == 0) goto L2a
                com.kwad.sdk.utils.bw.a(r5, r3, r1)
                return
            L2a:
                int r0 = r5.qz
                if (r0 >= 0) goto L2f
                return
            L2f:
                com.kwad.components.ad.h.a.a.b r4 = r5.qv
                com.kwad.components.ad.h.a.a.b.a(r4, r0)
                int r0 = r5.qz
                int r0 = r0 + (-1)
                r5.qz = r0
                com.kwad.sdk.utils.bw.a(r5, r3, r1)
                return
        }

        public final void z(boolean r1) {
                r0 = this;
                r0.qy = r1
                return
        }
    }

    static {
            return
    }

    private b(int r3, int r4) {
            r2 = this;
            r2.<init>()
            com.kwad.components.ad.h.a.a.b$c r0 = new com.kwad.components.ad.h.a.a.b$c
            r1 = 0
            r0.<init>(r2, r1)
            r2.qs = r0
            r0 = 0
            r2.qu = r0
            r2.qq = r3
            r2.qr = r4
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.h.a.a.b I(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r0 = com.kwad.sdk.core.response.b.a.bc(r2)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = com.kwad.sdk.core.response.b.a.bK(r2)
            if (r0 == 0) goto L1e
            com.kwad.components.ad.h.a.a.b r0 = new com.kwad.components.ad.h.a.a.b
            int r1 = com.kwad.components.ad.h.a.a.b.qp
            int r2 = f(r2)
            r0.<init>(r1, r2)
            return r0
        L1e:
            com.kwad.sdk.core.response.model.AdInfo$AdInsertScreenInfo r2 = r2.adInsertScreenInfo
            int r2 = r2.autoCloseTime
            if (r2 <= 0) goto L2c
            com.kwad.components.ad.h.a.a.b r0 = new com.kwad.components.ad.h.a.a.b
            int r1 = com.kwad.components.ad.h.a.a.b.qo
            r0.<init>(r1, r2)
            return r0
        L2c:
            return r1
    }

    private void W(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "updateTimer: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", mCallBackFunction: "
            r0.append(r1)
            com.kwad.sdk.core.webview.c.c r1 = r2.qn
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RegisterTimer"
            com.kwad.sdk.core.d.c.d(r1, r0)
            if (r3 >= 0) goto L20
            goto L42
        L20:
            com.kwad.sdk.core.webview.c.c r0 = r2.qn
            if (r0 != 0) goto L25
            goto L42
        L25:
            com.kwad.components.ad.h.a.a.b$b r0 = r2.qt
            if (r0 == 0) goto L30
            if (r3 != 0) goto L30
            int r1 = r2.qq
            r0.Q(r1)
        L30:
            com.kwad.components.ad.h.a.a.b$a r0 = new com.kwad.components.ad.h.a.a.b$a
            r0.<init>()
            r0.qx = r3
            int r3 = r2.qq
            r0.qw = r3
            com.kwad.sdk.core.webview.c.c r3 = r2.qn
            if (r3 == 0) goto L42
            r3.a(r0)
        L42:
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.h.a.a.b r0, int r1) {
            r0.W(r1)
            return
    }

    private static int f(com.kwad.sdk.core.response.model.AdInfo r1) {
            int r0 = com.kwad.components.ad.interstitial.b.b.b(r1)
            if (r0 > 0) goto L8
            r0 = 60
        L8:
            com.kwad.sdk.core.response.model.AdInfo$AdInsertScreenInfo r1 = r1.adInsertScreenInfo
            int r1 = r1.autoCloseTime
            if (r1 <= 0) goto L13
            int r1 = java.lang.Math.min(r0, r1)
            return r1
        L13:
            return r0
    }

    public final void a(com.kwad.components.ad.h.a.a.b.InterfaceC0018b r1) {
            r0 = this;
            r0.qt = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.qn = r2
            java.lang.Runnable r1 = r0.qu
            if (r1 == 0) goto Lc
            r1.run()
            r1 = 0
            r0.qu = r1
        Lc:
            return
    }

    public final void au() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "startTimer: mCallBackFunction: "
            r0.<init>(r1)
            com.kwad.sdk.core.webview.c.c r1 = r2.qn
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RegisterTimer"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.webview.c.c r0 = r2.qn
            if (r0 != 0) goto L21
            com.kwad.components.ad.h.a.a.b$1 r0 = new com.kwad.components.ad.h.a.a.b$1
            r0.<init>(r2)
            r2.qu = r0
            return
        L21:
            com.kwad.components.ad.h.a.a.b$c r0 = r2.qs
            int r1 = r2.qr
            r0.X(r1)
            com.kwad.components.ad.h.a.a.b$c r0 = r2.qs
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final void fP() {
            r2 = this;
            com.kwad.components.ad.h.a.a.b$c r0 = r2.qs
            r1 = 1
            r0.z(r1)
            return
    }

    public final void fQ() {
            r2 = this;
            com.kwad.components.ad.h.a.a.b$c r0 = r2.qs
            r1 = 0
            r0.z(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerTimerListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.qn = r0
            return
    }
}
