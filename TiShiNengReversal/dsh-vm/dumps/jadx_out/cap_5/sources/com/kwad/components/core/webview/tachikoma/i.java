package com.kwad.components.core.webview.tachikoma;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i implements com.kwad.components.core.e.e.f, com.kwad.sdk.components.q, com.kwad.sdk.core.view.b, com.kwad.sdk.core.webview.d.a.a {
    private static java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.kwad.components.core.webview.tachikoma.d.e>> afB;
    protected long AO;
    private long II;
    private long YY;
    private long YZ;
    private com.kwad.components.offline.api.tk.model.StyleTemplate Yf;
    private com.kwad.components.core.webview.jshandler.aw abN;
    private com.kwad.sdk.core.download.d abO;
    private java.util.Map<java.lang.String, java.lang.Object> afA;
    private int afC;
    private int afD;
    private boolean afE;
    private java.lang.String afF;
    private java.lang.String afG;
    private boolean afH;
    protected com.kwad.sdk.core.webview.e afI;
    private com.kwad.sdk.components.o afJ;
    private int afK;
    private long afL;
    private long afM;
    private long afN;
    private long afO;
    private long afP;
    private com.kwad.components.core.webview.tachikoma.a.e afQ;
    private com.kwad.sdk.core.webview.KsAdWebView.b afR;
    private com.kwad.components.core.webview.tachikoma.i.a afS;
    private com.kwad.sdk.components.r afT;
    private com.kwad.sdk.components.k afU;
    private final java.lang.Runnable afV;
    private final java.lang.Runnable afW;

    @androidx.annotation.Nullable
    private java.lang.ref.WeakReference<android.app.Activity> afh;
    private com.kwad.components.core.webview.tachikoma.d.e afi;
    protected com.kwad.components.core.webview.tachikoma.j afj;
    private com.kwad.sdk.core.webview.c.g afk;
    private com.kwad.components.core.o.a.e.c afl;
    private java.util.concurrent.Future<?> afm;
    private com.kwad.sdk.components.t afn;
    private com.kwad.components.core.webview.tachikoma.b.p afo;
    private com.kwad.components.core.webview.jshandler.ay afp;
    private com.kwad.components.core.webview.jshandler.bc afq;
    private com.kwad.sdk.core.view.d afr;
    private android.widget.TextView afs;
    private boolean aft;
    private boolean afu;
    private boolean afv;
    private boolean afw;
    private boolean afx;
    private int afy;
    private long afz;
    private com.kwad.components.core.webview.jshandler.az eS;
    private final com.kwad.components.core.video.m jE;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    protected final android.content.Context mContext;
    private final com.kwad.components.core.webview.tachikoma.c.z zK;
















































    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        void onFailed();

        void onSuccess();
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.components.core.webview.tachikoma.i.afB = r0
            return
    }

    public i(long r4, android.content.Context r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.aft = r0
            r3.afu = r0
            r3.afv = r0
            r3.afw = r0
            r3.afx = r0
            r3.afy = r0
            r1 = -1
            r3.AO = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r3.afC = r1
            r3.afD = r0
            r0 = 1
            r3.afE = r0
            com.kwad.sdk.core.webview.e r0 = new com.kwad.sdk.core.webview.e
            r0.<init>()
            r3.afI = r0
            com.kwad.components.core.webview.tachikoma.i$1 r0 = new com.kwad.components.core.webview.tachikoma.i$1
            r0.<init>(r3)
            r3.afR = r0
            com.kwad.components.core.webview.tachikoma.i$47 r0 = new com.kwad.components.core.webview.tachikoma.i$47
            r0.<init>(r3)
            r3.afS = r0
            com.kwad.components.core.webview.tachikoma.i$4 r0 = new com.kwad.components.core.webview.tachikoma.i$4
            r0.<init>(r3)
            r3.afT = r0
            com.kwad.components.core.webview.tachikoma.i$5 r0 = new com.kwad.components.core.webview.tachikoma.i$5
            r0.<init>(r3)
            r3.afU = r0
            com.kwad.components.core.webview.tachikoma.i$7 r0 = new com.kwad.components.core.webview.tachikoma.i$7
            r0.<init>(r3)
            r3.afV = r0
            com.kwad.components.core.webview.tachikoma.i$8 r0 = new com.kwad.components.core.webview.tachikoma.i$8
            r0.<init>(r3)
            r3.afW = r0
            com.kwad.components.core.webview.tachikoma.i$39 r0 = new com.kwad.components.core.webview.tachikoma.i$39
            r0.<init>(r3)
            r3.jE = r0
            r3.mContext = r6
            r3.AO = r4
            com.kwad.components.core.webview.tachikoma.c.z r4 = new com.kwad.components.core.webview.tachikoma.c.z
            r4.<init>()
            r3.zK = r4
            return
    }

    public i(android.content.Context r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public i(android.content.Context r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.aft = r0
            r3.afu = r0
            r3.afv = r0
            r3.afw = r0
            r3.afx = r0
            r3.afy = r0
            r1 = -1
            r3.AO = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r3.afC = r1
            r3.afD = r0
            r0 = 1
            r3.afE = r0
            com.kwad.sdk.core.webview.e r0 = new com.kwad.sdk.core.webview.e
            r0.<init>()
            r3.afI = r0
            com.kwad.components.core.webview.tachikoma.i$1 r0 = new com.kwad.components.core.webview.tachikoma.i$1
            r0.<init>(r3)
            r3.afR = r0
            com.kwad.components.core.webview.tachikoma.i$47 r0 = new com.kwad.components.core.webview.tachikoma.i$47
            r0.<init>(r3)
            r3.afS = r0
            com.kwad.components.core.webview.tachikoma.i$4 r0 = new com.kwad.components.core.webview.tachikoma.i$4
            r0.<init>(r3)
            r3.afT = r0
            com.kwad.components.core.webview.tachikoma.i$5 r0 = new com.kwad.components.core.webview.tachikoma.i$5
            r0.<init>(r3)
            r3.afU = r0
            com.kwad.components.core.webview.tachikoma.i$7 r0 = new com.kwad.components.core.webview.tachikoma.i$7
            r0.<init>(r3)
            r3.afV = r0
            com.kwad.components.core.webview.tachikoma.i$8 r0 = new com.kwad.components.core.webview.tachikoma.i$8
            r0.<init>(r3)
            r3.afW = r0
            com.kwad.components.core.webview.tachikoma.i$39 r0 = new com.kwad.components.core.webview.tachikoma.i$39
            r0.<init>(r3)
            r3.jE = r0
            r3.mContext = r4
            r3.afC = r5
            com.kwad.components.core.webview.tachikoma.c.z r4 = new com.kwad.components.core.webview.tachikoma.c.z
            r4.<init>()
            r3.zK = r4
            r3.afD = r6
            return
    }

    public i(android.content.Context r5, boolean r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.aft = r0
            r4.afu = r0
            r4.afv = r0
            r4.afw = r0
            r4.afx = r0
            r4.afy = r0
            r1 = -1
            r4.AO = r1
            r3 = 1000(0x3e8, float:1.401E-42)
            r4.afC = r3
            r4.afD = r0
            r0 = 1
            r4.afE = r0
            com.kwad.sdk.core.webview.e r0 = new com.kwad.sdk.core.webview.e
            r0.<init>()
            r4.afI = r0
            com.kwad.components.core.webview.tachikoma.i$1 r0 = new com.kwad.components.core.webview.tachikoma.i$1
            r0.<init>(r4)
            r4.afR = r0
            com.kwad.components.core.webview.tachikoma.i$47 r0 = new com.kwad.components.core.webview.tachikoma.i$47
            r0.<init>(r4)
            r4.afS = r0
            com.kwad.components.core.webview.tachikoma.i$4 r0 = new com.kwad.components.core.webview.tachikoma.i$4
            r0.<init>(r4)
            r4.afT = r0
            com.kwad.components.core.webview.tachikoma.i$5 r0 = new com.kwad.components.core.webview.tachikoma.i$5
            r0.<init>(r4)
            r4.afU = r0
            com.kwad.components.core.webview.tachikoma.i$7 r0 = new com.kwad.components.core.webview.tachikoma.i$7
            r0.<init>(r4)
            r4.afV = r0
            com.kwad.components.core.webview.tachikoma.i$8 r0 = new com.kwad.components.core.webview.tachikoma.i$8
            r0.<init>(r4)
            r4.afW = r0
            com.kwad.components.core.webview.tachikoma.i$39 r0 = new com.kwad.components.core.webview.tachikoma.i$39
            r0.<init>(r4)
            r4.jE = r0
            r4.mContext = r5
            r4.AO = r1
            r4.afC = r3
            r4.afE = r6
            com.kwad.components.core.webview.tachikoma.c.z r5 = new com.kwad.components.core.webview.tachikoma.c.z
            r5.<init>()
            r4.zK = r5
            return
    }

    static /* synthetic */ long a(com.kwad.components.core.webview.tachikoma.i r0, long r1) {
            r0.YY = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.aw a(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.components.core.webview.jshandler.aw r0 = r0.abN
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.d.e a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.components.core.webview.tachikoma.d.e r1) {
            r0.afi = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.components.j a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.sdk.core.response.model.AdTemplate r1) {
            com.kwad.sdk.components.j r0 = r0.aN(r1)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdResultData a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.sdk.core.response.model.AdResultData r1) {
            r0.mAdResultData = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.components.core.webview.jshandler.al.a r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.components.core.webview.tachikoma.TKRenderFailReason r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.components.offline.api.tk.TKDownloadListener r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.components.offline.api.tk.model.StyleTemplate r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.components.offline.api.tk.model.StyleTemplate r1, com.kwad.components.core.webview.tachikoma.i.a r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.sdk.components.t r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, java.lang.String r1) {
            r0.be(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.i r0, java.lang.Throwable r1) {
            r0.f(r1)
            return
    }

    private void a(com.kwad.components.offline.api.tk.TKDownloadListener r11) {
            r10 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r10.vh()
            if (r0 != 0) goto Lc
            java.lang.String r0 = "no template"
            r11.onFailed(r0)
            return
        Lc:
            boolean r1 = isLocalDebugEnable()
            if (r1 != 0) goto L3a
            com.kwad.components.core.webview.tachikoma.h r1 = com.kwad.components.core.webview.tachikoma.h.uS()
            java.lang.String r2 = r0.templateId
            int r3 = r0.templateVersionCode
            java.lang.String r1 = r1.n(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3a
            boolean r2 = isLocalDebugEnable()
            if (r2 != 0) goto L3a
            r0.jsStr = r1
            r1 = 4
            r0.tkSouce = r1
            java.lang.String r1 = "TKLoadController"
            java.lang.String r2 = "使用TK模板缓存"
            com.kwad.sdk.core.d.c.d(r1, r2)
            r11.onSuccess(r0)
            return
        L3a:
            com.kwad.components.core.o.a.e.c r3 = r10.afl
            android.content.Context r4 = r10.mContext
            java.lang.String r5 = r0.templateId
            java.lang.String r6 = r0.templateMd5
            java.lang.String r7 = r0.templateUrl
            int r8 = r0.templateVersionCode
            r9 = r11
            r3.loadTkFileByTemplateId(r4, r5, r6, r7, r8, r9)
            return
    }

    private void a(com.kwad.components.offline.api.tk.model.StyleTemplate r3, com.kwad.components.core.webview.tachikoma.i.a r4) {
            r2 = this;
            r2.Yf = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "addTKView mTKPlugin.getState(): "
            r0.<init>(r1)
            com.kwad.components.core.o.a.e.c r1 = r2.afl
            com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState r1 = r1.getState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKLoadController"
            com.kwad.sdk.core.d.c.w(r1, r0)
            com.kwad.components.core.o.a.e.c r0 = r2.afl
            com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState r0 = r0.getState()
            com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState r1 = com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState.SO_FAIL
            if (r0 != r1) goto L30
            java.lang.String r3 = "so_fail"
            r2.bd(r3)
            if (r4 == 0) goto L5c
            r4.onFailed()
            return
        L30:
            java.lang.String r0 = r3.jsStr
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L43
            java.lang.String r3 = "no_template"
            r2.be(r3)
            if (r4 == 0) goto L5c
            r4.onFailed()
            return
        L43:
            boolean r0 = r2.afH     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4d
            r2.b(r3, r4)     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            r3 = move-exception
            goto L51
        L4d:
            r2.c(r3, r4)     // Catch: java.lang.Throwable -> L4b
            return
        L51:
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            r2.f(r3)
            if (r4 == 0) goto L5c
            r4.onFailed()
        L5c:
            return
    }

    private void a(com.kwad.sdk.components.t r7) {
            r6 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r6.Yf     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto Le
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r6.vh()     // Catch: java.lang.Exception -> Lb
            r6.Yf = r0     // Catch: java.lang.Exception -> Lb
            goto Le
        Lb:
            r7 = move-exception
            goto Lab
        Le:
            if (r7 != 0) goto L11
            return
        L11:
            r6.afn = r7     // Catch: java.lang.Exception -> Lb
            r6.vm()     // Catch: java.lang.Exception -> Lb
            com.kwad.sdk.core.response.model.AdResultData r0 = r6.mAdResultData     // Catch: java.lang.Exception -> Lb
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> Lb
            com.kwad.sdk.core.response.model.AdResultData r1 = r6.mAdResultData     // Catch: java.lang.Exception -> Lb
            com.kwad.components.core.o.a.e.a.a.a(r0, r1)     // Catch: java.lang.Exception -> Lb
            com.kwad.sdk.core.response.model.AdResultData r1 = r6.mAdResultData     // Catch: java.lang.Exception -> Lb
            r1.mAdCacheId = r0     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = "TKLoadController"
            java.lang.String r1 = "renderTKTemplate tachikomaContext is not null"
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Exception -> Lb
            com.kwad.components.core.webview.tachikoma.j r0 = r6.afj     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = r0.getRegisterViewKey()     // Catch: java.lang.Exception -> Lb
            com.kwad.components.core.webview.jshandler.af$a r1 = new com.kwad.components.core.webview.jshandler.af$a     // Catch: java.lang.Exception -> Lb
            com.kwad.sdk.core.response.model.AdResultData r2 = r6.mAdResultData     // Catch: java.lang.Exception -> Lb
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lb
            org.json.JSONObject r1 = r1.toJson()     // Catch: java.lang.Exception -> Lb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lb
            java.lang.String r2 = r6.uZ()     // Catch: java.lang.Exception -> Lb
            java.lang.String r3 = uY()     // Catch: java.lang.Exception -> Lb
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Lb
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Exception -> Lb
            r1 = 1
            r4[r1] = r2     // Catch: java.lang.Exception -> Lb
            r1 = 2
            r4[r1] = r3     // Catch: java.lang.Exception -> Lb
            com.kwad.sdk.components.o r7 = r7.a(r0, r4)     // Catch: java.lang.Exception -> Lb
            r6.afJ = r7     // Catch: java.lang.Exception -> Lb
            r6.va()     // Catch: java.lang.Exception -> Lb
            android.view.View r7 = r7.getView()     // Catch: java.lang.Exception -> Lb
            if (r7 == 0) goto L97
            com.kwad.components.core.webview.tachikoma.j r0 = r6.afj     // Catch: java.lang.Exception -> Lb
            android.widget.FrameLayout r0 = r0.getTKContainer()     // Catch: java.lang.Exception -> Lb
            if (r0 == 0) goto L8c
            boolean r1 = r6.afE     // Catch: java.lang.Exception -> Lb
            if (r1 == 0) goto L8c
            boolean r1 = r0 instanceof com.kwad.sdk.core.view.d     // Catch: java.lang.Exception -> Lb
            if (r1 == 0) goto L80
            r1 = r0
            com.kwad.sdk.core.view.d r1 = (com.kwad.sdk.core.view.d) r1     // Catch: java.lang.Exception -> Lb
            r6.afr = r1     // Catch: java.lang.Exception -> Lb
            com.kwad.sdk.core.view.c r1 = r1.getWindowFocusChangeHelper()     // Catch: java.lang.Exception -> Lb
            r1.a(r6)     // Catch: java.lang.Exception -> Lb
        L80:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lb
            r2 = -1
            r1.<init>(r2, r2)     // Catch: java.lang.Exception -> Lb
            r7.setLayoutParams(r1)     // Catch: java.lang.Exception -> Lb
            r0.addView(r7)     // Catch: java.lang.Exception -> Lb
        L8c:
            com.kwad.components.offline.api.tk.model.StyleTemplate r7 = r6.vh()     // Catch: java.lang.Exception -> Lb
            r6.d(r7)     // Catch: java.lang.Exception -> Lb
            r6.vu()     // Catch: java.lang.Exception -> Lb
            return
        L97:
            int r7 = r6.afK     // Catch: java.lang.Exception -> Lb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lb
            com.kwad.components.core.t.i.c(r7)     // Catch: java.lang.Exception -> Lb
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r7 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.RENDER_ERROR     // Catch: java.lang.Exception -> Lb
            r6.b(r7)     // Catch: java.lang.Exception -> Lb
            java.lang.String r7 = "ksad_tk_render_fail"
            r6.be(r7)     // Catch: java.lang.Exception -> Lb
            return
        Lab:
            int r0 = r6.afK
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.kwad.components.core.t.i.c(r0)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r0 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.RENDER_ERROR
            r6.b(r0)
            java.lang.String r0 = r7.getMessage()
            r6.be(r0)
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r7)
            return
    }

    private static void a(com.kwad.sdk.components.t r0, com.kwad.sdk.core.webview.c.a r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.core.webview.tachikoma.i r0, boolean r1) {
            r1 = 1
            r0.aft = r1
            return r1
    }

    private com.kwad.sdk.components.j aN(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            r0.<init>(r3)
            r0.pG()
            com.kwad.components.core.webview.tachikoma.i$6 r1 = new com.kwad.components.core.webview.tachikoma.i$6
            r1.<init>(r2, r0, r3)
            return r1
    }

    static /* synthetic */ int b(com.kwad.components.core.webview.tachikoma.i r0) {
            int r0 = r0.afK
            return r0
    }

    private static int b(com.kwad.components.offline.api.tk.model.StyleTemplate r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.templateId
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r2 = r2.templateVersionCode
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            int r2 = r2.hashCode()
            return r2
    }

    static /* synthetic */ long b(com.kwad.components.core.webview.tachikoma.i r0, long r1) {
            r0.YZ = r1
            return r1
    }

    private void b(com.kwad.components.core.webview.jshandler.al.a r5) {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.j r0 = r4.afj
            android.widget.FrameLayout r0 = r0.getTKContainer()
            if (r0 == 0) goto L40
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.content.Context r2 = r4.mContext
            int r3 = r5.height
            float r3 = (float) r3
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            r1.height = r2
            android.content.Context r2 = r4.mContext
            int r3 = r5.leftMargin
            float r3 = (float) r3
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            r1.leftMargin = r2
            android.content.Context r2 = r4.mContext
            int r3 = r5.rightMargin
            float r3 = (float) r3
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            r1.rightMargin = r2
            android.content.Context r2 = r4.mContext
            int r5 = r5.bottomMargin
            float r5 = (float) r5
            int r5 = com.kwad.sdk.c.a.a.a(r2, r5)
            r1.bottomMargin = r5
            r5 = -1
            r1.width = r5
            r0.setLayoutParams(r1)
        L40:
            return
    }

    private void b(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.i$9 r0 = new com.kwad.components.core.webview.tachikoma.i$9
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    static /* synthetic */ void b(com.kwad.components.core.webview.tachikoma.i r0, com.kwad.components.core.webview.tachikoma.TKRenderFailReason r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ void b(com.kwad.components.core.webview.tachikoma.i r0, java.lang.String r1) {
            r0.bb(r1)
            return
    }

    private void b(com.kwad.components.offline.api.tk.model.StyleTemplate r9, com.kwad.components.core.webview.tachikoma.i.a r10) {
            r8 = this;
            r8.vm()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.YZ = r0
            com.kwad.components.core.o.a.e.c r2 = r8.afl
            android.content.Context r3 = r8.mContext
            java.lang.String r4 = r9.templateId
            int r5 = r9.templateVersionCode
            int r6 = r9.tkSouce
            boolean r7 = r8.afE
            com.kwad.sdk.components.t r0 = r2.a(r3, r4, r5, r6, r7)
            com.kwad.sdk.core.response.model.AdResultData r1 = r8.mAdResultData
            int r1 = r1.hashCode()
            com.kwad.sdk.core.response.model.AdResultData r2 = r8.mAdResultData
            com.kwad.components.core.o.a.e.a.a.a(r1, r2)
            com.kwad.sdk.components.r r1 = r8.afT
            r0.a(r1)
            com.kwad.sdk.components.k r1 = r8.afU
            r0.a(r1)
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r8.Yf
            if (r1 == 0) goto L45
            java.util.Map r1 = r8.vr()
            com.kwad.components.offline.api.tk.model.StyleTemplate r2 = r8.Yf
            org.json.JSONObject r2 = r2.toJson()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "styleTemplate"
            r1.put(r3, r2)
        L45:
            java.util.Map r1 = r8.vr()
            java.lang.String r2 = "appId"
            java.lang.String r3 = com.kwad.sdk.service.ServiceProvider.getAppId()
            r1.put(r2, r3)
            java.util.Map r1 = r8.vr()
            java.lang.String r2 = "isDebug"
            java.lang.Boolean r3 = com.kwad.components.core.a.oz
            r1.put(r2, r3)
            java.util.Map r1 = r8.vr()
            boolean r2 = r8.afH
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "newRenderType"
            r1.put(r3, r2)
            java.util.Map r1 = r8.vr()
            r0.setCustomEnv(r1)
            r8.afn = r0
            com.kwad.sdk.core.c.b.Ho()
            android.app.Activity r1 = com.kwad.sdk.core.c.b.getCurrentActivity()
            if (r1 == 0) goto La8
            android.view.Window r2 = r1.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            boolean r3 = com.kwad.sdk.c.a.a.G(r2)
            if (r3 == 0) goto L9a
            int r1 = com.kwad.sdk.c.a.a.bi(r1)
            int r2 = r2.getHeight()
            if (r1 != r2) goto L9a
            r1 = 1
            goto L9b
        L9a:
            r1 = 0
        L9b:
            java.util.Map r2 = r8.vr()
            java.lang.String r3 = "isImmersiveMode"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.put(r3, r1)
        La8:
            java.util.Map r1 = r8.vr()
            r0.setCustomEnv(r1)
            com.kwad.sdk.core.webview.c.g r1 = r8.afk
            if (r1 == 0) goto Lb6
            r0.b(r1)
        Lb6:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r8.YZ
            long r1 = r1 - r3
            r8.YY = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            r8.afz = r1
            r8.c(r0)
            java.io.File r1 = new java.io.File
            com.kwad.components.core.o.a.e.c r2 = r8.afl
            android.content.Context r3 = r8.mContext
            com.kwad.components.core.webview.tachikoma.j r4 = r8.afj
            java.lang.String r4 = r4.getTkTemplateId()
            java.lang.String r2 = r2.getJsBaseDir(r3, r4)
            r1.<init>(r2)
            java.lang.String r9 = r9.jsStr
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.getAbsolutePath()
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.kwad.components.core.webview.tachikoma.i$2 r2 = new com.kwad.components.core.webview.tachikoma.i$2
            r2.<init>(r8, r10)
            r0.a(r9, r1, r2)
            return
    }

    private void b(com.kwad.sdk.components.t r5) {
            r4 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.vj()
            if (r0 == 0) goto L10
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.vj()
            r0.<init>(r1)
            goto L11
        L10:
            r0 = 0
        L11:
            com.kwad.components.core.webview.tachikoma.j r1 = r4.afj
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.a(r5, r2)
            com.kwad.components.core.webview.jshandler.q r1 = new com.kwad.components.core.webview.jshandler.q
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.r r1 = new com.kwad.components.core.webview.jshandler.r
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.s r1 = new com.kwad.components.core.webview.tachikoma.b.s
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.i$11 r2 = new com.kwad.components.core.webview.tachikoma.i$11
            r2.<init>(r4)
            r1.a(r2)
            a(r5, r1)
            com.kwad.sdk.core.webview.e r1 = r4.afI
            com.kwad.components.core.webview.jshandler.am r1 = r4.c(r1)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.n r1 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.o r1 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.sdk.core.webview.d.a r1 = new com.kwad.sdk.core.webview.d.a
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.f r1 = new com.kwad.components.core.webview.tachikoma.b.f
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.x r1 = new com.kwad.components.core.webview.tachikoma.b.x
            r1.<init>()
            a(r5, r1)
            boolean r1 = r4.oP()
            if (r1 == 0) goto L97
            com.kwad.components.core.webview.jshandler.z r1 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2, r0, r4)
            java.lang.String r2 = r4.afF
            com.kwad.sdk.core.webview.e r3 = r4.afI
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()
            java.lang.String r3 = com.kwad.sdk.core.response.b.b.df(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L93
            com.kwad.components.core.e.e.g r2 = com.kwad.components.core.e.e.g.pY()
            r2.a(r4)
        L93:
            a(r5, r1)
            goto La2
        L97:
            com.kwad.components.core.webview.jshandler.ac r1 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r3 = 0
            r1.<init>(r2, r0, r4, r3)
            a(r5, r1)
        La2:
            com.kwad.components.core.webview.jshandler.ab r1 = new com.kwad.components.core.webview.jshandler.ab
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.k r1 = new com.kwad.components.core.webview.tachikoma.b.k
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.af r1 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.ai r1 = new com.kwad.components.core.webview.jshandler.ai
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.ar r1 = new com.kwad.components.core.webview.jshandler.ar
            android.content.Context r2 = r4.mContext
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.vj()
            r1.<init>(r2, r3)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.ae r1 = new com.kwad.components.core.webview.jshandler.ae
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2)
            com.kwad.components.core.webview.tachikoma.i$13 r2 = new com.kwad.components.core.webview.tachikoma.i$13
            r2.<init>(r4)
            r1.a(r2)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.bd r1 = new com.kwad.components.core.webview.jshandler.bd
            com.kwad.sdk.core.webview.e r2 = r4.afI
            com.kwad.components.core.webview.tachikoma.i$14 r3 = new com.kwad.components.core.webview.tachikoma.i$14
            r3.<init>(r4)
            r1.<init>(r2, r3)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.al r1 = new com.kwad.components.core.webview.jshandler.al
            com.kwad.sdk.core.webview.e r2 = r4.afI
            com.kwad.components.core.webview.tachikoma.i$15 r3 = new com.kwad.components.core.webview.tachikoma.i$15
            r3.<init>(r4)
            r1.<init>(r2, r3)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.as r1 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.tachikoma.i$16 r2 = new com.kwad.components.core.webview.tachikoma.i$16
            r2.<init>(r4)
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.az r1 = new com.kwad.components.core.webview.jshandler.az
            r1.<init>()
            r4.eS = r1
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.j r1 = r4.afj
            com.kwad.components.core.webview.jshandler.az r2 = r4.eS
            r1.a(r2)
            com.kwad.components.core.webview.jshandler.ay r1 = new com.kwad.components.core.webview.jshandler.ay
            r1.<init>()
            r4.afp = r1
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.bc r1 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2, r0)
            r4.afq = r1
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.p r1 = new com.kwad.components.core.webview.tachikoma.b.p
            r1.<init>()
            r4.afo = r1
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.j r1 = r4.afj
            com.kwad.components.core.webview.tachikoma.b.p r2 = r4.afo
            r1.a(r2)
            com.kwad.components.core.webview.jshandler.a r1 = new com.kwad.components.core.webview.jshandler.a
            com.kwad.components.core.webview.tachikoma.i$17 r2 = new com.kwad.components.core.webview.tachikoma.i$17
            r2.<init>(r4)
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.vj()
            if (r1 == 0) goto L18c
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.vj()
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto L18c
            com.kwad.components.core.webview.tachikoma.b.l r1 = new com.kwad.components.core.webview.tachikoma.b.l
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$18 r2 = new com.kwad.components.core.webview.tachikoma.i$18
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.vj()
            r2.<init>(r4, r3, r1)
            r4.abO = r2
            com.kwad.sdk.core.download.b r1 = com.kwad.sdk.core.download.b.GR()
            com.kwad.sdk.core.download.d r2 = r4.abO
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.vj()
            r1.a(r2, r3)
        L18c:
            com.kwad.components.core.webview.tachikoma.b.t r1 = new com.kwad.components.core.webview.tachikoma.b.t
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.i$19 r2 = new com.kwad.components.core.webview.tachikoma.i$19
            r2.<init>(r4)
            r1.a(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.v r1 = new com.kwad.components.core.webview.tachikoma.b.v
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.i$20 r2 = new com.kwad.components.core.webview.tachikoma.i$20
            r2.<init>(r4)
            r1.a(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.o r1 = new com.kwad.components.core.webview.tachikoma.b.o
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.j r2 = r4.afj
            r2.a(r1)
            com.kwad.components.core.webview.tachikoma.i$21 r1 = new com.kwad.components.core.webview.tachikoma.i$21
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$22 r1 = new com.kwad.components.core.webview.tachikoma.i$22
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.aa r1 = new com.kwad.components.core.webview.jshandler.aa
            com.kwad.components.core.webview.tachikoma.i$24 r2 = new com.kwad.components.core.webview.tachikoma.i$24
            r2.<init>(r4)
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$25 r1 = new com.kwad.components.core.webview.tachikoma.i$25
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$26 r1 = new com.kwad.components.core.webview.tachikoma.i$26
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.a r1 = new com.kwad.components.core.webview.tachikoma.b.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.vj()
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.a r1 = new com.kwad.components.core.webview.tachikoma.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.vj()
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.sdk.core.webview.e r1 = r4.afI
            com.kwad.components.core.webview.tachikoma.j r2 = r4.afj
            android.widget.FrameLayout r2 = r2.getTKContainer()
            r4.a(r1, r0, r5, r2)
            com.kwad.components.core.webview.jshandler.a.f r0 = new com.kwad.components.core.webview.jshandler.a.f
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.a.d r0 = new com.kwad.components.core.webview.jshandler.a.d
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.a.a r0 = new com.kwad.components.core.webview.jshandler.a.a
            r0.<init>()
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.a.e r0 = new com.kwad.components.core.webview.jshandler.a.e
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.aw r0 = new com.kwad.components.core.webview.jshandler.aw
            r0.<init>()
            r4.abN = r0
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.c r0 = new com.kwad.components.core.webview.jshandler.c
            com.kwad.sdk.core.webview.e r1 = r4.afI
            r0.<init>(r1)
            a(r5, r0)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.core.webview.tachikoma.i r0, boolean r1) {
            r1 = 1
            r0.afu = r1
            return r1
    }

    private void bb(java.lang.String r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r0 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.TK_FILE_LOAD_ERROR
            r1.b(r0)
            r1.bd(r2)
            return
    }

    private static com.kwad.components.offline.api.tk.model.StyleTemplate bc(java.lang.String r0) {
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            r0 = 0
            return r0
    }

    private void bd(java.lang.String r5) {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.j r0 = r4.afj
            java.lang.String r0 = r0.getTkTemplateId()
            r4.f(r0, r5)
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r4.vh()
            if (r0 != 0) goto L10
            return
        L10:
            com.kwad.components.offline.api.tk.TkLoggerReporter r1 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r3 = r4.afy
            r2.<init>(r3)
            r3 = 4
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = r2.setRenderState(r3)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r5 = r2.setErrorReason(r5)
            com.kwad.components.core.webview.tachikoma.j r2 = r4.afj
            java.lang.String r2 = r2.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r5 = r5.setTemplateId(r2)
            int r0 = r0.templateVersionCode
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r5 = r5.setVersionCode(r0)
            int r0 = r4.vk()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r5 = r5.setTKPublishType(r0)
            int r0 = r4.vo()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r5 = r5.setRenderType(r0)
            long r2 = r4.vp()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r5 = r5.setRenderIdleTime(r2)
            org.json.JSONObject r5 = r5.toJson()
            java.lang.String r0 = "ad_client_error_log"
            r1.reportTKPerform(r0, r5)
            return
    }

    private void be(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "logTkRenderFail : "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", templateId = "
            r0.append(r1)
            com.kwad.components.core.webview.tachikoma.j r1 = r3.afj
            java.lang.String r1 = r1.getTkTemplateId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKLoadController"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.core.webview.tachikoma.j r0 = r3.afj
            java.lang.String r0 = r0.getTkTemplateId()
            r3.g(r0, r4)
            boolean r0 = r3.afv
            if (r0 == 0) goto L81
            boolean r0 = r3.afw
            if (r0 == 0) goto L33
            goto L81
        L33:
            r0 = 1
            r3.afw = r0
            com.kwad.components.offline.api.tk.TkLoggerReporter r0 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r2 = r3.afy
            r1.<init>(r2)
            r2 = 2
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setRenderState(r2)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r1.setErrorReason(r4)
            com.kwad.components.core.webview.tachikoma.j r1 = r3.afj
            java.lang.String r1 = r1.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setTemplateId(r1)
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r3.Yf
            int r1 = r1.templateVersionCode
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setVersionCode(r1)
            int r1 = r3.vk()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setTKPublishType(r1)
            int r1 = r3.vo()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setRenderType(r1)
            long r1 = r3.vp()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setRenderIdleTime(r1)
            org.json.JSONObject r4 = r4.toJson()
            java.lang.String r1 = "ad_client_error_log"
            r0.reportTKPerform(r1, r4)
        L81:
            return
    }

    static /* synthetic */ long c(com.kwad.components.core.webview.tachikoma.i r2) {
            long r0 = r2.afz
            return r0
    }

    static /* synthetic */ long c(com.kwad.components.core.webview.tachikoma.i r0, long r1) {
            r0.II = r1
            return r1
    }

    private void c(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.i$10 r0 = new com.kwad.components.core.webview.tachikoma.i$10
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    private void c(com.kwad.components.offline.api.tk.model.StyleTemplate r6) {
            r5 = this;
            java.lang.String r0 = r6.templateId
            java.lang.String r1 = r6.templateUrl
            java.lang.String r2 = ""
            java.lang.String r3 = "renderType_tk"
            com.kwad.sdk.utils.k.b(r2, r3, r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "读取完毕，总耗时"
            r0.<init>(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r5.II
            long r1 = r1 - r3
            r0.append(r1)
            java.lang.String r1 = ", 读取成功"
            r0.append(r1)
            java.lang.String r1 = r6.templateId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKLoadController"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r5.aft
            if (r0 == 0) goto L34
            goto L5b
        L34:
            java.lang.String r0 = "没有超时"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.lang.Runnable r0 = r5.afV
            com.kwad.sdk.utils.bw.c(r0)
            com.kwad.components.core.webview.tachikoma.i$46 r0 = new com.kwad.components.core.webview.tachikoma.i$46
            r0.<init>(r5, r6)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            com.kwad.components.core.webview.tachikoma.j r6 = r5.afj
            android.widget.FrameLayout r6 = r6.getTKContainer()
            boolean r0 = r6 instanceof com.kwad.sdk.core.view.d
            if (r0 == 0) goto L5b
            com.kwad.sdk.core.view.d r6 = (com.kwad.sdk.core.view.d) r6
            r5.afr = r6
            com.kwad.sdk.core.view.c r6 = r6.getWindowFocusChangeHelper()
            r6.a(r5)
        L5b:
            return
    }

    private void c(com.kwad.components.offline.api.tk.model.StyleTemplate r9, com.kwad.components.core.webview.tachikoma.i.a r10) {
            r8 = this;
            r8.vm()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.YZ = r0
            com.kwad.components.core.o.a.e.c r2 = r8.afl
            android.content.Context r3 = r8.mContext
            java.lang.String r4 = r9.templateId
            int r5 = r9.templateVersionCode
            int r6 = r9.tkSouce
            boolean r7 = r8.afE
            com.kwad.sdk.components.t r0 = r2.a(r3, r4, r5, r6, r7)
            int r1 = r0.getUniqId()
            com.kwad.sdk.core.response.model.AdResultData r2 = r8.mAdResultData
            com.kwad.components.core.o.a.e.a.a.a(r1, r2)
            com.kwad.sdk.components.r r1 = r8.afT
            r0.a(r1)
            com.kwad.sdk.components.k r1 = r8.afU
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdResultData r1 = r8.mAdResultData
            if (r1 == 0) goto L6a
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            com.kwad.sdk.internal.api.SceneImpl r1 = r1.mAdScene
            if (r1 == 0) goto L6a
            java.util.Map r1 = r8.vr()
            com.kwad.sdk.core.response.model.AdResultData r2 = r8.mAdResultData
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.sdk.core.response.b.c.r(r2)
            com.kwad.sdk.internal.api.SceneImpl r2 = r2.mAdScene
            int r2 = r2.getAdStyle()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "adStyle"
            r1.put(r3, r2)
            java.util.Map r1 = r8.vr()
            com.kwad.sdk.core.response.model.AdResultData r2 = r8.mAdResultData
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.sdk.core.response.b.c.r(r2)
            com.kwad.sdk.internal.api.SceneImpl r2 = r2.mAdScene
            org.json.JSONObject r2 = r2.toJson()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "adScene"
            r1.put(r3, r2)
        L6a:
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r8.Yf
            if (r1 == 0) goto L81
            java.util.Map r1 = r8.vr()
            com.kwad.components.offline.api.tk.model.StyleTemplate r2 = r8.Yf
            org.json.JSONObject r2 = r2.toJson()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "styleTemplate"
            r1.put(r3, r2)
        L81:
            java.util.Map r1 = r8.vr()
            int r2 = r0.getUniqId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "adCacheId"
            r1.put(r3, r2)
            java.util.Map r1 = r8.vr()
            java.lang.String r2 = "appId"
            java.lang.String r3 = com.kwad.sdk.service.ServiceProvider.getAppId()
            r1.put(r2, r3)
            java.util.Map r1 = r8.vr()
            java.lang.String r2 = "isDebug"
            java.lang.Boolean r3 = com.kwad.components.core.a.oz
            r1.put(r2, r3)
            java.util.Map r1 = r8.vr()
            boolean r2 = r8.afH
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "newRenderType"
            r1.put(r3, r2)
            java.util.Map r1 = r8.vr()
            r0.setCustomEnv(r1)
            r8.afn = r0
            com.kwad.sdk.core.c.b.Ho()
            android.app.Activity r1 = com.kwad.sdk.core.c.b.getCurrentActivity()
            if (r1 == 0) goto Lf5
            android.view.Window r2 = r1.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            boolean r3 = com.kwad.sdk.c.a.a.G(r2)
            if (r3 == 0) goto Le7
            int r1 = com.kwad.sdk.c.a.a.bi(r1)
            int r2 = r2.getHeight()
            if (r1 != r2) goto Le7
            r1 = 1
            goto Le8
        Le7:
            r1 = 0
        Le8:
            java.util.Map r2 = r8.vr()
            java.lang.String r3 = "isImmersiveMode"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.put(r3, r1)
        Lf5:
            java.util.Map r1 = r8.vr()
            r0.setCustomEnv(r1)
            com.kwad.sdk.core.webview.c.g r1 = r8.afk
            if (r1 == 0) goto L103
            r0.b(r1)
        L103:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r8.YZ
            long r1 = r1 - r3
            r8.YY = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            r8.afz = r1
            r8.vi()
            r8.b(r0)
            java.io.File r1 = new java.io.File
            com.kwad.components.core.o.a.e.c r2 = r8.afl
            android.content.Context r3 = r8.mContext
            com.kwad.components.core.webview.tachikoma.j r4 = r8.afj
            java.lang.String r4 = r4.getTkTemplateId()
            java.lang.String r2 = r2.getJsBaseDir(r3, r4)
            r1.<init>(r2)
            java.lang.String r2 = r9.jsStr
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.getAbsolutePath()
            r3.append(r1)
            java.lang.String r1 = "/"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.kwad.components.core.webview.tachikoma.i$3 r3 = new com.kwad.components.core.webview.tachikoma.i$3
            r3.<init>(r8, r10)
            r0.a(r2, r1, r3)
            com.kwad.components.core.webview.tachikoma.j r10 = r8.afj
            android.widget.FrameLayout r10 = r10.getTKContainer()
            if (r10 == 0) goto L169
            boolean r1 = r8.afE
            if (r1 == 0) goto L169
            android.view.View r0 = r0.getView()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r10.addView(r0)
            r8.d(r9)
        L169:
            return
    }

    private void c(com.kwad.sdk.components.t r5) {
            r4 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.vj()
            if (r0 == 0) goto L10
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.vj()
            r0.<init>(r1)
            goto L11
        L10:
            r0 = 0
        L11:
            com.kwad.components.core.webview.tachikoma.j r1 = r4.afj
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.a(r5, r2)
            com.kwad.components.core.webview.jshandler.q r1 = new com.kwad.components.core.webview.jshandler.q
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.r r1 = new com.kwad.components.core.webview.jshandler.r
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.s r1 = new com.kwad.components.core.webview.tachikoma.b.s
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.i$27 r2 = new com.kwad.components.core.webview.tachikoma.i$27
            r2.<init>(r4)
            r1.a(r2)
            a(r5, r1)
            com.kwad.sdk.core.webview.e r1 = r4.afI
            com.kwad.components.core.webview.jshandler.am r1 = r4.c(r1)
            a(r5, r1)
            com.kwad.sdk.core.webview.d.a r1 = new com.kwad.sdk.core.webview.d.a
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.f r1 = new com.kwad.components.core.webview.tachikoma.b.f
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.x r1 = new com.kwad.components.core.webview.tachikoma.b.x
            r1.<init>()
            a(r5, r1)
            boolean r1 = r4.oP()
            if (r1 == 0) goto L83
            com.kwad.components.core.webview.jshandler.z r1 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2, r0, r4)
            java.lang.String r2 = r4.afF
            com.kwad.sdk.core.webview.e r3 = r4.afI
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()
            java.lang.String r3 = com.kwad.sdk.core.response.b.b.df(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7f
            com.kwad.components.core.e.e.g r2 = com.kwad.components.core.e.e.g.pY()
            r2.a(r4)
        L7f:
            a(r5, r1)
            goto L8e
        L83:
            com.kwad.components.core.webview.jshandler.ac r1 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r3 = 0
            r1.<init>(r2, r0, r4, r3)
            a(r5, r1)
        L8e:
            com.kwad.components.core.webview.jshandler.ab r1 = new com.kwad.components.core.webview.jshandler.ab
            com.kwad.sdk.core.webview.e r2 = r4.afI
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.k r1 = new com.kwad.components.core.webview.tachikoma.b.k
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.ar r1 = new com.kwad.components.core.webview.jshandler.ar
            android.content.Context r2 = r4.mContext
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.vj()
            r1.<init>(r2, r3)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.bd r1 = new com.kwad.components.core.webview.jshandler.bd
            com.kwad.sdk.core.webview.e r2 = r4.afI
            com.kwad.components.core.webview.tachikoma.i$28 r3 = new com.kwad.components.core.webview.tachikoma.i$28
            r3.<init>(r4)
            r1.<init>(r2, r3)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.as r1 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.tachikoma.i$29 r2 = new com.kwad.components.core.webview.tachikoma.i$29
            r2.<init>(r4, r5)
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.ay r1 = new com.kwad.components.core.webview.jshandler.ay
            r1.<init>()
            r4.afp = r1
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.p r1 = new com.kwad.components.core.webview.tachikoma.b.p
            r1.<init>()
            r4.afo = r1
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.j r1 = r4.afj
            com.kwad.components.core.webview.tachikoma.b.p r2 = r4.afo
            r1.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.vj()
            if (r1 == 0) goto L119
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.vj()
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto L119
            com.kwad.components.core.webview.tachikoma.b.l r1 = new com.kwad.components.core.webview.tachikoma.b.l
            r1.<init>()
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$30 r2 = new com.kwad.components.core.webview.tachikoma.i$30
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.vj()
            r2.<init>(r4, r3, r1)
            r4.abO = r2
            com.kwad.sdk.core.download.b r1 = com.kwad.sdk.core.download.b.GR()
            com.kwad.sdk.core.download.d r2 = r4.abO
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.vj()
            r1.a(r2, r3)
        L119:
            com.kwad.components.core.webview.tachikoma.b.t r1 = new com.kwad.components.core.webview.tachikoma.b.t
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.i$31 r2 = new com.kwad.components.core.webview.tachikoma.i$31
            r2.<init>(r4)
            r1.a(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.v r1 = new com.kwad.components.core.webview.tachikoma.b.v
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.i$32 r2 = new com.kwad.components.core.webview.tachikoma.i$32
            r2.<init>(r4)
            r1.a(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$33 r1 = new com.kwad.components.core.webview.tachikoma.i$33
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$35 r1 = new com.kwad.components.core.webview.tachikoma.i$35
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.jshandler.aa r1 = new com.kwad.components.core.webview.jshandler.aa
            com.kwad.components.core.webview.tachikoma.i$36 r2 = new com.kwad.components.core.webview.tachikoma.i$36
            r2.<init>(r4)
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$37 r1 = new com.kwad.components.core.webview.tachikoma.i$37
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.i$38 r1 = new com.kwad.components.core.webview.tachikoma.i$38
            r1.<init>(r4)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.b.a r1 = new com.kwad.components.core.webview.tachikoma.b.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.vj()
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.components.core.webview.tachikoma.a r1 = new com.kwad.components.core.webview.tachikoma.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.vj()
            r1.<init>(r2)
            a(r5, r1)
            com.kwad.sdk.core.webview.e r1 = r4.afI
            com.kwad.components.core.webview.tachikoma.j r2 = r4.afj
            android.widget.FrameLayout r2 = r2.getTKContainer()
            r4.a(r1, r0, r5, r2)
            com.kwad.components.core.webview.jshandler.a.f r0 = new com.kwad.components.core.webview.jshandler.a.f
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.a.d r0 = new com.kwad.components.core.webview.jshandler.a.d
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.a.a r0 = new com.kwad.components.core.webview.jshandler.a.a
            r0.<init>()
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.a.e r0 = new com.kwad.components.core.webview.jshandler.a.e
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            a(r5, r0)
            com.kwad.components.core.webview.jshandler.aw r0 = new com.kwad.components.core.webview.jshandler.aw
            r0.<init>()
            r4.abN = r0
            a(r5, r0)
            return
    }

    static /* synthetic */ boolean c(com.kwad.components.core.webview.tachikoma.i r0, boolean r1) {
            r1 = 1
            r0.afx = r1
            return r1
    }

    static /* synthetic */ long d(com.kwad.components.core.webview.tachikoma.i r0, long r1) {
            r0.afM = r1
            return r1
    }

    static /* synthetic */ void d(com.kwad.components.core.webview.tachikoma.i r0) {
            r0.uX()
            return
    }

    private void d(com.kwad.components.offline.api.tk.model.StyleTemplate r4) {
            r3 = this;
            java.lang.Boolean r0 = com.kwad.components.core.a.oz
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L9
            goto L11
        L9:
            com.kwad.components.core.webview.tachikoma.j r0 = r3.afj
            android.widget.FrameLayout r0 = r0.getTKContainer()
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            android.widget.TextView r0 = r3.afs
            if (r0 != 0) goto L36
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.mContext
            r0.<init>(r1)
            r3.afs = r0
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r1)
            android.widget.TextView r0 = r3.afs
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.setTextColor(r1)
            com.kwad.components.core.webview.tachikoma.j r0 = r3.afj
            android.widget.FrameLayout r0 = r0.getTKContainer()
            android.widget.TextView r1 = r3.afs
            r0.addView(r1)
        L36:
            android.widget.TextView r0 = r3.afs
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.templateId
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            int r4 = r4.templateVersionCode
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.setText(r4)
            android.widget.TextView r4 = r3.afs
            r0 = 0
            r4.setVisibility(r0)
            return
    }

    static /* synthetic */ long e(com.kwad.components.core.webview.tachikoma.i r0, long r1) {
            r0.afz = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.i.a e(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.components.core.webview.tachikoma.i$a r0 = r0.afS
            return r0
    }

    static /* synthetic */ long f(com.kwad.components.core.webview.tachikoma.i r0, long r1) {
            r0.afO = r1
            return r1
    }

    static /* synthetic */ android.app.Activity f(com.kwad.components.core.webview.tachikoma.i r0) {
            android.app.Activity r0 = r0.uV()
            return r0
    }

    private void f(java.lang.Throwable r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "logTkRenderFail : "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", templateId = "
            r0.append(r1)
            com.kwad.components.core.webview.tachikoma.j r1 = r3.afj
            java.lang.String r1 = r1.getTkTemplateId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKLoadController"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.core.webview.tachikoma.j r0 = r3.afj
            java.lang.String r0 = r0.getTkTemplateId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error:"
            r1.<init>(r2)
            java.lang.String r2 = r4.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.g(r0, r1)
            com.kwad.components.offline.api.tk.TkLoggerReporter r0 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r2 = r3.afy
            r1.<init>(r2)
            r2 = 3
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setRenderState(r2)
            java.lang.String r4 = r4.toString()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r1.setErrorReason(r4)
            com.kwad.components.core.webview.tachikoma.j r1 = r3.afj
            java.lang.String r1 = r1.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setTemplateId(r1)
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r3.Yf
            int r1 = r1.templateVersionCode
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setVersionCode(r1)
            int r1 = r3.vk()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setTKPublishType(r1)
            int r1 = r3.vo()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setRenderType(r1)
            long r1 = r3.vp()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setRenderIdleTime(r1)
            org.json.JSONObject r4 = r4.toJson()
            java.lang.String r1 = "ad_client_error_log"
            r0.reportTKPerform(r1, r4)
            return
    }

    static /* synthetic */ long g(com.kwad.components.core.webview.tachikoma.i r0, long r1) {
            r0.afN = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdResultData g(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.sdk.core.response.model.AdResultData r0 = r0.mAdResultData
            return r0
    }

    static /* synthetic */ com.kwad.sdk.components.t h(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.sdk.components.t r0 = r0.afn
            return r0
    }

    static /* synthetic */ void i(com.kwad.components.core.webview.tachikoma.i r0) {
            r0.vq()
            return
    }

    private static boolean isLocalDebugEnable() {
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean j(com.kwad.components.core.webview.tachikoma.i r0) {
            boolean r0 = r0.afx
            return r0
    }

    static /* synthetic */ java.lang.String k(com.kwad.components.core.webview.tachikoma.i r0) {
            java.lang.String r0 = r0.afF
            return r0
    }

    static /* synthetic */ java.lang.String l(com.kwad.components.core.webview.tachikoma.i r0) {
            java.lang.String r0 = r0.afG
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.bc m(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.components.core.webview.jshandler.bc r0 = r0.afq
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.d.e n(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.components.core.webview.tachikoma.d.e r0 = r0.afi
            return r0
    }

    static /* synthetic */ boolean o(com.kwad.components.core.webview.tachikoma.i r0) {
            boolean r0 = r0.afH
            return r0
    }

    static /* synthetic */ long p(com.kwad.components.core.webview.tachikoma.i r2) {
            long r0 = r2.afM
            return r0
    }

    static /* synthetic */ long q(com.kwad.components.core.webview.tachikoma.i r2) {
            long r0 = r2.YY
            return r0
    }

    static /* synthetic */ long r(com.kwad.components.core.webview.tachikoma.i r2) {
            long r0 = r2.II
            return r0
    }

    static /* synthetic */ long s(com.kwad.components.core.webview.tachikoma.i r2) {
            long r0 = r2.YZ
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.c.z t(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.components.core.webview.tachikoma.c.z r0 = r0.zK
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.b.p u(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.components.core.webview.tachikoma.b.p r0 = r0.afo
            return r0
    }

    private android.app.Activity uV() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.afh
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.afh
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L14:
            r0 = 0
            return r0
    }

    private void uW() {
            r3 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r3.vh()
            if (r0 != 0) goto Lc
            java.lang.String r0 = "no template"
            r3.bb(r0)
            return
        Lc:
            int r0 = b(r0)
            r3.afK = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L28
            com.kwad.sdk.components.t r0 = com.kwad.components.core.t.i.a(r0)     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L2a
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L28
            r3.afz = r1     // Catch: java.lang.Exception -> L28
            r3.afO = r1     // Catch: java.lang.Exception -> L28
            r3.a(r0)     // Catch: java.lang.Exception -> L28
            return
        L28:
            r0 = move-exception
            goto L4f
        L2a:
            com.kwad.components.core.webview.tachikoma.e.b r0 = com.kwad.components.core.webview.tachikoma.e.b.vM()     // Catch: java.lang.Exception -> L28
            int r1 = r3.afK     // Catch: java.lang.Exception -> L28
            boolean r0 = r0.bn(r1)     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L3a
            r3.vf()     // Catch: java.lang.Exception -> L28
            return
        L3a:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L28
            r3.afL = r0     // Catch: java.lang.Exception -> L28
            com.kwad.components.core.webview.tachikoma.e.b r0 = com.kwad.components.core.webview.tachikoma.e.b.vM()     // Catch: java.lang.Exception -> L28
            int r1 = r3.afK     // Catch: java.lang.Exception -> L28
            com.kwad.components.core.webview.tachikoma.i$12 r2 = new com.kwad.components.core.webview.tachikoma.i$12     // Catch: java.lang.Exception -> L28
            r2.<init>(r3)     // Catch: java.lang.Exception -> L28
            r0.a(r1, r2)     // Catch: java.lang.Exception -> L28
            return
        L4f:
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r1 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.RENDER_ERROR
            r3.b(r1)
            java.lang.String r0 = r0.getMessage()
            r3.be(r0)
            return
    }

    private void uX() {
            r13 = this;
            long r0 = r13.afL
            long r2 = r13.afM
            r4 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L13
            r13.YY = r4
            r13.YZ = r4
            r13.II = r4
            r13.afN = r4
            return
        L13:
            long r6 = r13.YZ
            long r8 = r13.YY
            long r10 = r6 + r8
            int r12 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r12 < 0) goto L2a
            r13.YY = r4
            r13.YZ = r4
            r13.II = r4
            long r0 = r2 - r0
            r13.afN = r0
            r13.afz = r2
            return
        L2a:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L37
            long r2 = r13.II
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L37
            r13.II = r0
            return
        L37:
            long r2 = r6 + r8
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L47
            long r6 = r6 + r8
            long r0 = r13.II
            long r6 = r6 - r0
            r13.YY = r6
            r13.YZ = r4
            r13.II = r4
        L47:
            return
    }

    private static java.lang.String uY() {
            com.kwad.components.core.webview.jshandler.ai$a r0 = new com.kwad.components.core.webview.jshandler.ai$a
            r0.<init>()
            boolean r1 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            r1 = r1 ^ 1
            r0.screenOrientation = r1
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String uZ() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.ae$a r0 = new com.kwad.components.core.webview.jshandler.ae$a
            r0.<init>()
            com.kwad.components.core.webview.tachikoma.j r1 = r2.afj
            if (r1 == 0) goto Ld
            r1.a(r0)
            goto L21
        Ld:
            com.kwad.sdk.core.webview.e r1 = r2.afI
            android.view.ViewGroup r1 = r1.TG
            int r1 = r1.getWidth()
            r0.width = r1
            com.kwad.sdk.core.webview.e r1 = r2.afI
            android.view.ViewGroup r1 = r1.TG
            int r1 = r1.getHeight()
            r0.height = r1
        L21:
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r0 = r0.toString()
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.tk.model.StyleTemplate v(com.kwad.components.core.webview.tachikoma.i r0) {
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r0.Yf
            return r0
    }

    private void va() {
            r3 = this;
            r3.vi()
            com.kwad.components.core.webview.tachikoma.j r0 = r3.afj
            r0.aB()
            r3.vb()
            com.kwad.components.core.webview.tachikoma.i$23 r0 = new com.kwad.components.core.webview.tachikoma.i$23
            r0.<init>(r3)
            java.lang.String r1 = "setCloseAction"
            r2 = 0
            r3.a(r1, r2, r0)
            com.kwad.components.core.webview.tachikoma.i$34 r0 = new com.kwad.components.core.webview.tachikoma.i$34
            r0.<init>(r3)
            java.lang.String r1 = "setAdOutClickCallback"
            r3.a(r1, r2, r0)
            com.kwad.components.core.webview.tachikoma.i$43 r0 = new com.kwad.components.core.webview.tachikoma.i$43
            r0.<init>(r3)
            java.lang.String r1 = "setUpdatePositionCallback"
            r3.a(r1, r2, r0)
            com.kwad.components.core.webview.tachikoma.i$44 r0 = new com.kwad.components.core.webview.tachikoma.i$44
            r0.<init>(r3)
            java.lang.String r1 = "setCancelDownloadCallback"
            r3.a(r1, r2, r0)
            return
    }

    private void vb() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.vj()
            r1 = 0
            if (r0 == 0) goto L11
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.vj()
            r0.<init>(r2)
            goto L12
        L11:
            r0 = r1
        L12:
            com.kwad.components.core.webview.tachikoma.a.e r2 = new com.kwad.components.core.webview.tachikoma.a.e
            com.kwad.sdk.core.webview.e r3 = r5.afI
            com.kwad.sdk.components.o r4 = r5.afJ
            r2.<init>(r0, r3, r4)
            r5.afQ = r2
            com.kwad.components.core.webview.tachikoma.a.a r2 = new com.kwad.components.core.webview.tachikoma.a.a
            com.kwad.sdk.core.webview.b r3 = r5.uU()
            r4 = 1
            r2.<init>(r3, r0, r5, r4)
            java.lang.String r0 = "setClickAction"
            r5.a(r0, r1, r2)
            return
    }

    private boolean vc() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.afG     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "tk_feed_tk_card"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L21
            if (r1 == 0) goto L11
            boolean r1 = com.kwad.sdk.core.config.e.Gm()     // Catch: java.lang.Exception -> L21
            if (r1 != 0) goto L1b
        L11:
            java.lang.String r1 = r3.afG     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "tk_draw_card"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L21
            if (r1 == 0) goto L1d
        L1b:
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r3.afH = r1     // Catch: java.lang.Exception -> L21
            return r1
        L21:
            return r0
    }

    private void ve() {
            r2 = this;
            r0 = 0
            r2.afv = r0
            r2.afw = r0
            r2.aft = r0
            r2.afu = r0
            r2.afx = r0
            r0 = 0
            r2.II = r0
            r2.YZ = r0
            r2.YY = r0
            r2.afz = r0
            return
    }

    private void vf() {
            r4 = this;
            boolean r0 = isLocalDebugEnable()
            if (r0 == 0) goto Le
            r0 = 2000(0x7d0, float:2.803E-42)
            r4.afC = r0
            r0 = 3000(0xbb8, float:4.204E-42)
            r4.afD = r0
        Le:
            java.lang.Runnable r0 = r4.afV
            int r1 = r4.afC
            long r1 = (long) r1
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            int r0 = r4.afD
            if (r0 <= 0) goto L20
            java.lang.Runnable r1 = r4.afW
            long r2 = (long) r0
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r1, r2)
        L20:
            java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Jt()
            com.kwad.components.core.webview.tachikoma.i$45 r1 = new com.kwad.components.core.webview.tachikoma.i$45
            r1.<init>(r4)
            java.util.concurrent.Future r0 = r0.submit(r1)
            r4.afm = r0
            return
    }

    private static boolean vg() {
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            r0 = 0
            return r0
    }

    private com.kwad.components.offline.api.tk.model.StyleTemplate vh() {
            r8 = this;
            com.kwad.components.core.webview.tachikoma.j r0 = r8.afj
            java.lang.String r0 = r0.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r8.Yf
            if (r1 == 0) goto Lc
            java.lang.String r0 = r1.templateId
        Lc:
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = bc(r0)
            if (r1 == 0) goto L13
            return r1
        L13:
            boolean r1 = isLocalDebugEnable()
            if (r1 == 0) goto L7e
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = new com.kwad.components.offline.api.tk.model.StyleTemplate
            r1.<init>()
            r1.templateId = r0
            java.lang.String r2 = "1.0.4"
            r1.templateVersion = r2
            r2 = 104(0x68, float:1.46E-43)
            r1.templateVersionCode = r2
            boolean r2 = vg()
            java.lang.String r3 = ":24680/"
            java.lang.String r4 = "http://"
            if (r2 == 0) goto L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            com.kwad.components.offline.api.core.IOfflineHostApi r4 = com.kwad.components.offline.api.OfflineHostProvider.getApi()
            com.kwad.components.offline.api.core.api.IEnvironment r4 = r4.env()
            java.lang.String r4 = r4.localIpAddress()
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ".104.coverage.zip"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.templateUrl = r0
            return r1
        L58:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            com.kwad.components.offline.api.core.IOfflineHostApi r4 = com.kwad.components.offline.api.OfflineHostProvider.getApi()
            com.kwad.components.offline.api.core.api.IEnvironment r4 = r4.env()
            java.lang.String r4 = r4.localIpAddress()
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ".104.zip"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.templateUrl = r0
            return r1
        L7e:
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r8.Yf
            if (r0 == 0) goto L83
            return r0
        L83:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r8.vj()
            r1 = 0
            if (r0 != 0) goto L8b
            return r1
        L8b:
            com.kwad.components.core.webview.tachikoma.j r2 = r8.afj
            java.lang.String r2 = r2.getTkTemplateId()
            com.kwad.sdk.core.response.model.AdMatrixInfo$MatrixTemplate r0 = com.kwad.sdk.core.response.b.b.k(r0, r2)
            if (r0 != 0) goto L98
            return r1
        L98:
            com.kwad.components.core.o.a.e.c r2 = r8.afl
            if (r2 != 0) goto Lb6
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = new com.kwad.components.offline.api.tk.model.StyleTemplate
            r1.<init>()
            java.lang.String r2 = r0.templateId
            r1.templateId = r2
            java.lang.String r2 = r0.templateMd5
            r1.templateMd5 = r2
            java.lang.String r2 = r0.templateUrl
            r1.templateUrl = r2
            long r2 = r0.templateVersionCode
            int r0 = (int) r2
            r1.templateVersionCode = r0
            r0 = 0
            r1.tkSouce = r0
            return r1
        Lb6:
            android.content.Context r3 = r8.mContext
            java.lang.String r4 = r0.templateId
            java.lang.String r5 = r0.templateMd5
            java.lang.String r6 = r0.templateUrl
            long r0 = r0.templateVersionCode
            int r7 = (int) r0
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r2.checkStyleTemplateById(r3, r4, r5, r6, r7)
            return r0
    }

    private void vi() {
            r5 = this;
            com.kwad.sdk.core.webview.e r0 = r5.afI
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            r1 = r1 ^ 1
            com.kwad.components.core.webview.tachikoma.j r2 = r5.afj
            com.kwad.sdk.widget.g r2 = r2.getTouchCoordsView()
            com.kwad.components.core.webview.tachikoma.j r3 = r5.afj
            android.widget.FrameLayout r3 = r3.getTKContainer()
            com.kwad.components.core.webview.tachikoma.j r4 = r5.afj
            java.lang.String r4 = r4.getTkTemplateId()
            r0.a(r1, r2, r3, r4)
            return
    }

    private int vk() {
            r3 = this;
            com.kwad.components.core.webview.tachikoma.j r0 = r3.afj
            java.lang.String r0 = r0.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r3.vh()
            if (r1 == 0) goto L13
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r3.vh()
            int r1 = r1.templateVersionCode
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "#"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            int r0 = com.kwad.sdk.core.config.e.ci(r0)
            return r0
    }

    private void vl() {
            r4 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r4.vh()
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = r0.tkSouce
            r4.afy = r1
            com.kwad.components.offline.api.tk.TkLoggerReporter r1 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r3 = r4.afy
            r2.<init>(r3)
            r3 = -1
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = r2.setRenderState(r3)
            com.kwad.components.core.webview.tachikoma.j r3 = r4.afj
            java.lang.String r3 = r3.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = r2.setTemplateId(r3)
            int r0 = r0.templateVersionCode
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r2.setVersionCode(r0)
            int r2 = r4.vk()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setTKPublishType(r2)
            int r2 = r4.vo()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRenderType(r2)
            long r2 = r4.vp()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRenderIdleTime(r2)
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r2 = "ad_client_apm_log"
            r1.reportTKPerform(r2, r0)
            return
    }

    private void vm() {
            r4 = this;
            boolean r0 = r4.afv
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.afv = r0
            com.kwad.components.offline.api.tk.TkLoggerReporter r0 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r2 = r4.afy
            r1.<init>(r2)
            r2 = 0
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setRenderState(r2)
            com.kwad.components.core.webview.tachikoma.j r2 = r4.afj
            java.lang.String r2 = r2.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setTemplateId(r2)
            com.kwad.components.offline.api.tk.model.StyleTemplate r2 = r4.Yf
            int r2 = r2.templateVersionCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setVersionCode(r2)
            int r2 = r4.vk()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setTKPublishType(r2)
            int r2 = r4.vo()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setRenderType(r2)
            long r2 = r4.vp()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = r1.setRenderIdleTime(r2)
            org.json.JSONObject r1 = r1.toJson()
            java.lang.String r2 = "ad_client_apm_log"
            r0.reportTKPerform(r2, r1)
            return
    }

    private void vn() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "logTkRenderSuccess, templateId = "
            r0.<init>(r1)
            com.kwad.components.core.webview.tachikoma.j r1 = r10.afj
            java.lang.String r1 = r1.getTkTemplateId()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r10.Yf
            if (r1 == 0) goto L1c
            int r1 = r1.templateVersionCode
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKLoadController"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r10.afv
            if (r0 == 0) goto Lf8
            boolean r0 = r10.afw
            if (r0 == 0) goto L33
            goto Lf8
        L33:
            r0 = 1
            r10.afw = r0
            long r2 = r10.afz
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L46
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.afz
            long r4 = r2 - r4
        L46:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "render time, templateId = "
            r2.<init>(r3)
            com.kwad.components.core.webview.tachikoma.j r3 = r10.afj
            java.lang.String r3 = r3.getTkTemplateId()
            r2.append(r3)
            java.lang.String r3 = " init:"
            r2.append(r3)
            long r6 = r10.YY
            r2.append(r6)
            java.lang.String r3 = " load:"
            r2.append(r3)
            long r6 = r10.YZ
            long r8 = r10.II
            long r6 = r6 - r8
            r2.append(r6)
            java.lang.String r3 = " render:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.kwad.sdk.core.d.c.d(r1, r2)
            boolean r1 = r10.afH
            if (r1 == 0) goto L89
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.afO
            long r1 = r1 - r6
            r10.afP = r1
        L89:
            com.kwad.components.offline.api.tk.TkLoggerReporter r1 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r3 = r10.afy
            r2.<init>(r3)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r2.setRenderState(r0)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRenderTime(r4)
            com.kwad.components.core.webview.tachikoma.j r2 = r10.afj
            java.lang.String r2 = r2.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setTemplateId(r2)
            long r2 = r10.YZ
            long r4 = r10.II
            long r2 = r2 - r4
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setLoadTime(r2)
            long r2 = r10.YY
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setInitTime(r2)
            long r2 = r10.afN
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRegisterEndTime(r2)
            long r2 = r10.afP
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setGetViewEndTime(r2)
            com.kwad.components.core.webview.tachikoma.j r2 = r10.afj
            java.lang.String r2 = r2.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setTemplateId(r2)
            com.kwad.components.offline.api.tk.model.StyleTemplate r2 = r10.Yf
            int r2 = r2.templateVersionCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setVersionCode(r2)
            int r2 = r10.vk()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setTKPublishType(r2)
            int r2 = r10.vo()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRenderType(r2)
            long r2 = r10.vp()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRenderIdleTime(r2)
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r2 = "ad_client_apm_log"
            r1.reportTKPerform(r2, r0)
        Lf8:
            return
    }

    private int vo() {
            r1 = this;
            boolean r0 = r1.afH
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private long vp() {
            r2 = this;
            int r0 = r2.vo()
            r1 = 1
            if (r0 != r1) goto L10
            java.lang.Long r0 = com.kwad.sdk.core.config.e.Gn()
            long r0 = r0.longValue()
            return r0
        L10:
            r0 = 0
            return r0
    }

    private void vq() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "logTkRenderFail : timeout, templateId = "
            r0.<init>(r1)
            com.kwad.components.core.webview.tachikoma.j r1 = r4.afj
            java.lang.String r1 = r1.getTkTemplateId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKLoadController"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r4.vh()
            if (r0 != 0) goto L20
            return
        L20:
            com.kwad.components.offline.api.tk.TkLoggerReporter r1 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r3 = r4.afy
            r2.<init>(r3)
            r3 = 3
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = r2.setRenderState(r3)
            java.lang.String r3 = "timeout"
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = r2.setErrorReason(r3)
            com.kwad.components.core.webview.tachikoma.j r3 = r4.afj
            java.lang.String r3 = r3.getTkTemplateId()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2 = r2.setTemplateId(r3)
            int r0 = r0.templateVersionCode
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r2.setVersionCode(r0)
            int r2 = r4.vk()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setTKPublishType(r2)
            int r2 = r4.vo()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRenderType(r2)
            long r2 = r4.vp()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r0 = r0.setRenderIdleTime(r2)
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r2 = "ad_client_error_log"
            r1.reportTKPerform(r2, r0)
            return
    }

    private java.util.Map<java.lang.String, java.lang.Object> vr() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.afA
            if (r0 != 0) goto L27
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.afA = r0
            java.lang.String r1 = "TKVersion"
            java.lang.String r2 = "6.1.7"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.afA
            java.lang.String r1 = "SDKVersion"
            java.lang.String r2 = "4.6.30.1"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.afA
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "sdkType"
            r0.put(r2, r1)
        L27:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.afA
            return r0
    }

    private void vs() {
            r10 = this;
            java.lang.String r0 = "TKLoadController"
            com.kwad.components.core.o.a.e.c r1 = r10.afl
            if (r1 == 0) goto Lc2
            com.kwad.sdk.components.t r1 = r10.afn
            if (r1 != 0) goto Lc
            goto Lc2
        Lc:
            java.io.File r1 = new java.io.File
            com.kwad.components.core.o.a.e.c r2 = r10.afl
            android.content.Context r3 = r10.mContext
            com.kwad.components.core.webview.tachikoma.j r4 = r10.afj
            java.lang.String r4 = r4.getTkTemplateId()
            java.lang.String r2 = r2.getJsBaseDir(r3, r4)
            r1.<init>(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "kcov.json"
            r2.<init>(r1, r3)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L2e
            goto Lc2
        L2e:
            java.lang.String r1 = com.kwad.sdk.utils.w.W(r2)     // Catch: java.lang.Throwable -> L98
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L3a
            goto Lc2
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "kcov.json:"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L98
            r2.append(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L98
            com.kwad.sdk.core.d.c.d(r0, r2)     // Catch: java.lang.Throwable -> L98
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "gitHeadCommit"
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "coverageApi"
            java.lang.String r7 = r2.getString(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "coverageTaskId"
            java.lang.String r5 = r2.getString(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "currentBranch"
            java.lang.String r6 = r2.getString(r1)     // Catch: java.lang.Throwable -> L98
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L98
            if (r1 != 0) goto Lb9
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L98
            if (r1 != 0) goto Lb9
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L98
            if (r1 != 0) goto Lb9
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L81
            goto Lb9
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "尝试获取覆盖率统计... "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L98
            com.kwad.components.offline.api.tk.model.StyleTemplate r2 = r10.Yf     // Catch: java.lang.Throwable -> L98
            r1.append(r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L9a
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r10.Yf     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r1.templateId     // Catch: java.lang.Throwable -> L98
            goto L9c
        L98:
            r0 = move-exception
            goto Lbf
        L9a:
            java.lang.String r1 = ""
        L9c:
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Throwable -> L98
            com.kwad.sdk.components.t r0 = r10.afn     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "JSON.stringify(this.__coverage__)"
            java.lang.Object r0 = r0.execute(r1)     // Catch: java.lang.Throwable -> L98
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L98
            if (r1 != 0) goto Lac
            goto Lc2
        Lac:
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L98
            com.kwad.components.core.webview.tachikoma.i$41 r3 = new com.kwad.components.core.webview.tachikoma.i$41     // Catch: java.lang.Throwable -> L98
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L98
            com.kwad.sdk.utils.h.execute(r3)     // Catch: java.lang.Throwable -> L98
            return
        Lb9:
            java.lang.String r1 = "kcov.json数据不合法，缺少关键字段gitHeadCommit | coverageApi | coverageTaskId | currentBranch"
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Throwable -> L98
            return
        Lbf:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        Lc2:
            return
    }

    static /* synthetic */ java.util.Map vv() {
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.kwad.components.core.webview.tachikoma.d.e>> r0 = com.kwad.components.core.webview.tachikoma.i.afB
            return r0
    }

    public final java.lang.Object a(java.lang.String r2, java.lang.String r3, com.kwad.sdk.components.m r4) {
            r1 = this;
            com.kwad.sdk.components.o r0 = r1.afJ
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.b(r2, r3, r4)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void a(@androidx.annotation.Nullable android.app.Activity r2, com.kwad.sdk.core.response.model.AdResultData r3, com.kwad.components.core.webview.tachikoma.j r4) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.afh = r0
            r1.mAdResultData = r3
            com.kwad.sdk.core.webview.e r2 = r1.afI
            r2.a(r3)
            r1.afj = r4
            java.lang.String r2 = r4.getTkTemplateId()
            r1.afF = r2
            com.kwad.components.core.webview.tachikoma.j r2 = r1.afj
            java.lang.String r2 = r2.getTKReaderScene()
            r1.afG = r2
            r1.ve()
            com.kwad.components.core.webview.tachikoma.j r2 = r1.afj
            android.widget.FrameLayout r2 = r2.getTKContainer()
            if (r2 == 0) goto L2c
            r2.removeAllViews()
        L2c:
            boolean r2 = com.kwad.sdk.core.config.e.Fq()
            if (r2 != 0) goto L38
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.SWITCH_CLOSE
            r1.b(r2)
            return
        L38:
            java.lang.Class<com.kwad.components.core.o.a.e.c> r2 = com.kwad.components.core.o.a.e.c.class
            com.kwad.sdk.components.b r2 = com.kwad.sdk.components.d.f(r2)
            com.kwad.components.core.o.a.e.c r2 = (com.kwad.components.core.o.a.e.c) r2
            r1.afl = r2
            r1.vl()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bind mTKPlugin: "
            r2.<init>(r3)
            com.kwad.components.core.o.a.e.c r3 = r1.afl
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TKLoadController"
            com.kwad.sdk.core.d.c.d(r3, r2)
            java.lang.String r2 = r1.afF
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L6b
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.vj()
            java.lang.String r3 = r1.afG
            com.kwad.sdk.commercial.e.a.e(r2, r3)
        L6b:
            com.kwad.components.core.o.a.e.c r2 = r1.afl
            if (r2 == 0) goto L7d
            boolean r2 = r1.vc()
            if (r2 == 0) goto L79
            r1.uW()
            return
        L79:
            r1.vf()
            return
        L7d:
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.PLUGIN_NOT_READY
            r1.b(r2)
            java.lang.String r2 = r1.afF
            java.lang.String r3 = "offline_failed"
            r1.f(r2, r3)
            com.kwad.components.offline.api.tk.TkLoggerReporter r2 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = new com.kwad.components.offline.api.tk.model.report.TKPerformMsg
            int r0 = r1.afy
            r4.<init>(r0)
            r0 = 4
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r4 = r4.setRenderState(r0)
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r3 = r4.setErrorReason(r3)
            java.lang.String r4 = r1.afF
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r3 = r3.setTemplateId(r4)
            org.json.JSONObject r3 = r3.toJson()
            java.lang.String r4 = "ad_client_error_log"
            r2.reportTKPerform(r4, r3)
            return
    }

    public final void a(com.kwad.components.offline.api.tk.model.StyleTemplate r1) {
            r0 = this;
            r0.Yf = r1
            return
    }

    protected void a(com.kwad.sdk.core.webview.b r1, com.kwad.components.core.e.d.c r2, com.kwad.sdk.components.t r3, android.view.ViewGroup r4) {
            r0 = this;
            return
    }

    public final void a(com.kwad.sdk.core.webview.c.g r1) {
            r0 = this;
            r0.afk = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.d.a.a
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.j r0 = r1.afj
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    public final void a(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.vr()
            r0.put(r2, r3)
            return
    }

    protected com.kwad.components.core.webview.jshandler.am c(com.kwad.sdk.core.webview.b r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.am r0 = new com.kwad.components.core.webview.jshandler.am
            r0.<init>(r2)
            return r0
    }

    @Override // com.kwad.sdk.components.q
    public final void callJS(java.lang.String r3) {
            r2 = this;
            com.kwad.sdk.components.t r0 = r2.afn
            if (r0 == 0) goto L8
            r1 = 0
            r0.a(r3, r1, r1)
        L8:
            return
    }

    @Override // com.kwad.components.core.e.e.f
    public void dismiss() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.eS
            if (r0 == 0) goto L7
            r0.uJ()
        L7:
            return
    }

    protected void f(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return
    }

    protected void g(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return
    }

    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.j r0 = r1.afj
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.getTkTemplateId()
            return r0
    }

    @Override // com.kwad.sdk.core.view.b
    public final void i(android.view.View r2, boolean r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.j r0 = r1.afj
            android.widget.FrameLayout r0 = r0.getTKContainer()
            if (r0 == 0) goto L15
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L15
            com.kwad.components.core.webview.jshandler.ay r2 = r1.afp
            if (r2 == 0) goto L15
            r2.aX(r3)
        L15:
            return
    }

    public void kz() {
            r3 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.afh
            r1 = 0
            if (r0 == 0) goto L7
            r3.afh = r1
        L7:
            com.kwad.sdk.core.view.d r0 = r3.afr
            if (r0 == 0) goto L14
            com.kwad.sdk.core.view.c r0 = r0.getWindowFocusChangeHelper()
            r0.b(r3)
            r3.afr = r1
        L14:
            java.util.concurrent.Future<?> r0 = r3.afm
            if (r0 == 0) goto L1c
            r2 = 1
            r0.cancel(r2)
        L1c:
            java.lang.Runnable r0 = r3.afV
            com.kwad.sdk.utils.bw.c(r0)
            java.lang.Runnable r0 = r3.afW
            com.kwad.sdk.utils.bw.c(r0)
            com.kwad.components.core.e.e.g r0 = com.kwad.components.core.e.e.g.pY()
            r0.b(r3)
            com.kwad.sdk.core.download.d r0 = r3.abO
            if (r0 == 0) goto L3a
            com.kwad.sdk.core.download.b r0 = com.kwad.sdk.core.download.b.GR()
            com.kwad.sdk.core.download.d r2 = r3.abO
            r0.a(r2)
        L3a:
            com.kwad.components.core.webview.tachikoma.d.e r0 = r3.afi
            if (r0 == 0) goto L41
            r0.dismiss()
        L41:
            java.lang.Boolean r0 = com.kwad.components.core.a.oz
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4c
            r3.vs()
        L4c:
            com.kwad.components.core.o.a.e.c r0 = r3.afl
            if (r0 == 0) goto L53
            r0.onDestroy()
        L53:
            com.kwad.sdk.components.t r0 = r3.afn
            if (r0 == 0) goto L6f
            r3.afn = r1
            boolean r1 = r3.afH
            if (r1 == 0) goto L67
            int r0 = r3.afK
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.kwad.components.core.t.i.c(r0)
            return
        L67:
            com.kwad.components.core.webview.tachikoma.i$40 r1 = new com.kwad.components.core.webview.tachikoma.i$40
            r1.<init>(r3, r0)
            com.kwad.sdk.utils.bw.postOnUiThread(r1)
        L6f:
            return
    }

    protected boolean oP() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.e.e.f
    public void show() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.eS
            if (r0 == 0) goto L7
            r0.uK()
        L7:
            return
    }

    public final com.kwad.sdk.core.webview.b uU() {
            r1 = this;
            com.kwad.sdk.core.webview.e r0 = r1.afI
            return r0
    }

    public final boolean vd() {
            r1 = this;
            boolean r0 = r1.afH
            return r0
    }

    protected final com.kwad.sdk.core.response.model.AdTemplate vj() {
            r1 = this;
            com.kwad.sdk.core.webview.e r0 = r1.afI
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            return r0
    }

    public final com.kwad.sdk.components.o vt() {
            r1 = this;
            com.kwad.sdk.components.o r0 = r1.afJ
            return r0
    }

    public final void vu() {
            r11 = this;
            boolean r0 = r11.afu
            if (r0 == 0) goto La
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r0 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.TK_FILE_LOAD_TIMEOUT
            r11.b(r0)
            return
        La:
            java.lang.Runnable r0 = r11.afW
            com.kwad.sdk.utils.bw.c(r0)
            r11.vn()
            com.kwad.components.core.webview.tachikoma.j r0 = r11.afj
            if (r0 == 0) goto L43
            com.kwad.components.core.webview.tachikoma.i$42 r0 = new com.kwad.components.core.webview.tachikoma.i$42
            r0.<init>(r11)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            com.kwad.components.core.webview.tachikoma.e.c r1 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.j r0 = r11.afj
            java.lang.String r2 = r0.getTkTemplateId()
            long r3 = r11.YZ
            long r5 = r11.II
            long r3 = r3 - r5
            long r5 = r11.YY
            long r7 = r11.afz
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L3f
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r9 = r11.afz
            long r9 = r7 - r9
        L3f:
            r7 = r9
            r1.c(r2, r3, r5, r7)
        L43:
            return
    }
}
