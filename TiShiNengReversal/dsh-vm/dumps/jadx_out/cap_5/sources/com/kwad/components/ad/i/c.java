package com.kwad.components.ad.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements java.lang.Runnable {
    private static final android.os.Handler qI = null;
    private static volatile boolean qM;
    private final long qJ;
    private final com.kwad.sdk.core.response.model.AdTemplate qK;
    private boolean qL;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.i.d qN;




    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.kwad.components.ad.i.c.qI = r0
            return
    }

    public c(@androidx.annotation.NonNull com.kwad.components.core.internal.api.a r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.qL = r0
            com.kwad.sdk.core.response.model.AdTemplate r5 = r5.getAdTemplate()
            r4.qK = r5
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            int r0 = com.kwad.sdk.core.response.b.a.db(r0)
            long r0 = (long) r0
            r4.qJ = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "PushAdManager create adTemplate: "
            r2.<init>(r3)
            int r5 = r5.hashCode()
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            java.lang.String r0 = "PushAdManager"
            com.kwad.sdk.core.d.c.d(r0, r5)
            return
    }

    static /* synthetic */ com.kwad.components.ad.i.d a(com.kwad.components.ad.i.c r0, com.kwad.components.ad.i.d r1) {
            r0.qN = r1
            return r1
    }

    private static void a(int r1, java.lang.Runnable r2, long r3) {
            android.os.Handler r0 = com.kwad.components.ad.i.c.qI
            android.os.Message r2 = android.os.Message.obtain(r0, r2)
            r2.what = r1
            r0.sendMessageDelayed(r2, r3)
            return
    }

    static /* synthetic */ boolean access$002(boolean r0) {
            r0 = 0
            com.kwad.components.ad.i.c.qM = r0
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.i.c r0) {
            r0.fW()
            return
    }

    @androidx.annotation.MainThread
    private void fW() {
            r2 = this;
            com.kwad.components.ad.i.b r0 = com.kwad.components.ad.i.b.fR()
            boolean r0 = r0.fT()
            if (r0 != 0) goto L12
            java.lang.String r0 = "PushAdManager"
            java.lang.String r1 = "run preCheckResult false"
            com.kwad.sdk.core.d.c.d(r0, r1)
            return
        L12:
            r0 = 0
            com.kwad.components.ad.i.c.qM = r0
            boolean r0 = r2.qL
            if (r0 == 0) goto L1a
            goto L31
        L1a:
            com.kwad.components.ad.i.d r0 = r2.qN
            if (r0 == 0) goto L31
            boolean r0 = r0.gb()
            if (r0 == 0) goto L31
            r0 = 1
            r2.qL = r0
            com.kwad.components.ad.i.d r0 = r2.qN
            com.kwad.components.ad.i.c$3 r1 = new com.kwad.components.ad.i.c$3
            r1.<init>(r2)
            r0.c(r1)
        L31:
            return
    }

    public final void d(com.kwad.components.core.internal.api.a r6) {
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r6.getAdTemplate()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.qK
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "PushAdManager"
            if (r1 != 0) goto L14
            java.lang.String r6 = "onAdExit not current ad"
            com.kwad.sdk.core.d.c.d(r2, r6)
            return
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "onAdExit showPushAdDelayTime: "
            r1.<init>(r3)
            long r3 = r5.qJ
            r1.append(r3)
            java.lang.String r3 = ", adTemplate: "
            r1.append(r3)
            int r0 = r0.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.kwad.sdk.core.d.c.d(r2, r0)
            boolean r6 = r6.supportPushAd()
            if (r6 == 0) goto L41
            r6 = 1000001(0xf4241, float:1.4013E-39)
            long r0 = r5.qJ
            a(r6, r5, r0)
        L41:
            return
    }

    public final void fV() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "startRequestPushAd processingPush: "
            r0.<init>(r1)
            boolean r1 = com.kwad.components.ad.i.c.qM
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PushAdManager"
            com.kwad.sdk.core.d.c.w(r1, r0)
            boolean r0 = com.kwad.components.ad.i.c.qM
            if (r0 == 0) goto L1a
            goto L2f
        L1a:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.qK
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.mAdScene
            if (r0 == 0) goto L2f
            r0 = 1
            com.kwad.components.ad.i.c.qM = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.qK
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.mAdScene
            com.kwad.components.ad.i.c$1 r1 = new com.kwad.components.ad.i.c$1
            r1.<init>(r2)
            com.kwad.components.core.j.a.b(r0, r1)
        L2f:
            return
    }

    public final void fX() {
            r3 = this;
            java.lang.String r0 = "onOutSDKPage: "
            java.lang.String r1 = "PushAdManager"
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.os.Handler r0 = com.kwad.components.ad.i.c.qI
            r2 = 1000001(0xf4241, float:1.4013E-39)
            boolean r0 = r0.hasMessages(r2)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "onOutSDKPage: sendMessageDelay MSG_WHAT_PAGE_OUT"
            com.kwad.sdk.core.d.c.d(r1, r0)
            r0 = 1000002(0xf4242, float:1.401301E-39)
            r1 = 500(0x1f4, double:2.47E-321)
            a(r0, r3, r1)
        L1f:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.kwad.components.core.e.a.e r0 = com.kwad.components.core.e.a.e.oK()
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L17
            com.kwad.components.core.e.a.e r0 = com.kwad.components.core.e.a.e.oK()
            com.kwad.components.ad.i.c$2 r1 = new com.kwad.components.ad.i.c$2
            r1.<init>(r2)
            r0.a(r1)
            return
        L17:
            r2.fW()
            return
    }
}
