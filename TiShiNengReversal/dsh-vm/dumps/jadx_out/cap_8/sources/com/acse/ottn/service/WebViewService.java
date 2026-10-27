package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WebViewService extends android.app.Service {

    /* renamed from: f, reason: collision with root package name */
    public static android.view.View f2690f = null;

    /* renamed from: g, reason: collision with root package name */
    public static android.view.WindowManager f2691g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f2692h = "WebViewService";

    /* renamed from: i, reason: collision with root package name */
    public static java.util.TimerTask f2693i;
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.widget.CustomWebView f2694b;

    /* renamed from: c, reason: collision with root package name */
    public com.acse.ottn.service.WebViewService.d f2695c;

    /* renamed from: d, reason: collision with root package name */
    public int f2696d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2697e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.service.WebViewService$a$a, reason: collision with other inner class name */
        public class RunnableC0081a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.service.WebViewService.a a;

            public RunnableC0081a(com.acse.ottn.service.WebViewService.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r0 = this;
                    com.acse.ottn.service.WebViewService.c()
                    return
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r4 = this;
                java.lang.String r0 = com.acse.ottn.service.WebViewService.a()
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.service.WebViewService$a$a r1 = new com.acse.ottn.service.WebViewService$a$a
                r1.<init>(r4)
                r2 = 0
                r0.postDelayed(r1, r2)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends android.webkit.WebViewClient {
        public final /* synthetic */ com.acse.ottn.service.WebViewService a;

        public b(com.acse.ottn.service.WebViewService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r1, java.lang.String r2) {
                r0 = this;
                r1.loadUrl(r2)
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends android.widget.FrameLayout {
        public c(android.content.Context r2) {
                r1 = this;
                r1.<init>(r2)
                android.content.res.Resources r2 = r2.getResources()
                r0 = 17170444(0x106000c, float:2.4611947E-38)
                int r2 = r2.getColor(r0)
                r1.setBackgroundColor(r2)
                return
        }

        @Override // android.view.View
        public boolean onTouchEvent(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d extends android.webkit.WebChromeClient {
        public final /* synthetic */ com.acse.ottn.service.WebViewService a;

        public d(com.acse.ottn.service.WebViewService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ d(com.acse.ottn.service.WebViewService r1, com.acse.ottn.service.WebViewService.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView r1, int r2) {
                r0 = this;
                super.onProgressChanged(r1, r2)
                return
        }
    }

    static {
            r0 = 10059(0x274b, float:1.4096E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public WebViewService() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2696d = r0
            r0 = 0
            r1.f2697e = r0
            return
    }

    public static int a(android.content.Context r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            return r0
    }

    public static void a(int r3) {
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.service.WebViewService$a r1 = new com.acse.ottn.service.WebViewService$a
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            java.util.TimerTask r3 = r0.b(r3, r2, r1)
            com.acse.ottn.service.WebViewService.f2693i = r3
            return
    }

    public static void c() {
            android.view.View r0 = com.acse.ottn.service.WebViewService.f2690f     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L11
        L9:
            android.view.WindowManager r0 = com.acse.ottn.service.WebViewService.f2691g     // Catch: java.lang.Exception -> L11
            android.view.View r1 = com.acse.ottn.service.WebViewService.f2690f     // Catch: java.lang.Exception -> L11
            r0.removeView(r1)     // Catch: java.lang.Exception -> L11
            return
        L11:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dismiss e="
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.acse.ottn.h2.a(r1, r0)
            return
    }

    public final void a(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loadH5Url = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.widget.CustomWebView r0 = r7.f2694b     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            if (r0 != 0) goto L1c
            goto Lb6
        L1c:
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1 = 100
            r0.setTextZoom(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1 = 1
            r0.setJavaScriptEnabled(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setDomStorageEnabled(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            android.webkit.WebSettings$PluginState r2 = android.webkit.WebSettings.PluginState.ON     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setPluginState(r2)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setAllowFileAccess(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setLoadWithOverviewMode(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setUseWideViewPort(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setSupportZoom(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r2 = 0
            r0.setMixedContentMode(r2)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.service.WebViewService$d r3 = new com.acse.ottn.service.WebViewService$d     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r4 = 0
            r3.<init>(r7, r4)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r7.f2695c = r3     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.widget.CustomWebView r4 = r7.f2694b     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r4.setWebChromeClient(r3)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.String r4 = "setAllowUniversalAccessFromFileURLs"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r5[r2] = r6     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            if (r3 == 0) goto L71
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1[r2] = r4     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r3.invoke(r0, r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            goto L71
        L6d:
            r8 = move-exception
            goto L81
        L6f:
            r8 = move-exception
            goto L9c
        L71:
            com.acse.ottn.widget.CustomWebView r0 = r7.f2694b     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.service.WebViewService$b r1 = new com.acse.ottn.service.WebViewService$b     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1.<init>(r7)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setWebViewClient(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.widget.CustomWebView r0 = r7.f2694b     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.loadUrl(r8)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            return
        L81:
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception="
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.acse.ottn.h2.a(r0, r8)
            goto Lb6
        L9c:
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "IllegalArgumentException="
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.acse.ottn.h2.a(r0, r8)
        Lb6:
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final void b() {
            r2 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r2.a = r0
            android.app.Application r0 = r2.getApplication()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            com.acse.ottn.service.WebViewService.f2691g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L22
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2038(0x7f6, float:2.856E-42)
            r0.type = r1
            goto L28
        L22:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2002(0x7d2, float:2.805E-42)
            r0.type = r1
        L28:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 1
            r0.format = r1
            r1 = 8
            r0.flags = r1
            r1 = 51
            r0.gravity = r1
            r1 = 0
            r0.x = r1
            r0.y = r1
            r1 = -1
            r0.width = r1
            return
    }

    public final void b(int r4) {
            r3 = this;
            android.app.Application r0 = r3.getApplication()     // Catch: java.lang.Exception -> L14
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Exception -> L14
            r1 = 0
            android.view.View r4 = r0.inflate(r4, r1)     // Catch: java.lang.Exception -> L14
            com.acse.ottn.service.WebViewService.f2690f = r4     // Catch: java.lang.Exception -> L14
            r0 = 0
            r4.measure(r0, r0)     // Catch: java.lang.Exception -> L14
            return
        L14:
            r4 = move-exception
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setLayoutView e = "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.acse.ottn.h2.a(r0, r4)
            return
    }

    public final void b(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.String r1 = "webview悬浮窗"
            com.acse.ottn.h2.a(r0, r1)
            int r0 = com.acse.ottn.R.layout.webview_service
            r3.b(r0)
            android.view.View r0 = com.acse.ottn.service.WebViewService.f2690f
            int r1 = com.acse.ottn.R.id.dwebView
            android.view.View r0 = r0.findViewById(r1)
            com.acse.ottn.widget.CustomWebView r0 = (com.acse.ottn.widget.CustomWebView) r0
            r3.f2694b = r0
            android.view.WindowManager$LayoutParams r0 = r3.a
            r1 = -1
            r0.height = r1
            r3.a(r4)
            android.view.WindowManager r4 = com.acse.ottn.service.WebViewService.f2691g     // Catch: java.lang.Exception -> L2a
            android.view.View r0 = com.acse.ottn.service.WebViewService.f2690f     // Catch: java.lang.Exception -> L2a
            android.view.WindowManager$LayoutParams r1 = r3.a     // Catch: java.lang.Exception -> L2a
            r4.addView(r0, r1)     // Catch: java.lang.Exception -> L2a
            goto L45
        L2a:
            r4 = move-exception
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "添加失败 e="
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.acse.ottn.h2.a(r0, r4)
        L45:
            r4 = 5000(0x1388, float:7.006E-42)
            a(r4)
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.String r1 = "MainService Created"
            com.acse.ottn.h2.c(r0, r1)
            r2.b()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r4 = this;
            com.acse.ottn.service.a.b()     // Catch: java.lang.Exception -> L10
            com.acse.ottn.service.a.d()     // Catch: java.lang.Exception -> L10
            android.view.View r0 = com.acse.ottn.service.WebViewService.f2690f     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L2b
            android.view.WindowManager r1 = com.acse.ottn.service.WebViewService.f2691g     // Catch: java.lang.Exception -> L10
            r1.removeView(r0)     // Catch: java.lang.Exception -> L10
            goto L2b
        L10:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onDestroy e="
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.acse.ottn.h2.c(r1, r0)
        L2b:
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "url"
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch: java.lang.Exception -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto L12
            r4.b(r0)     // Catch: java.lang.Exception -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L26
        L12:
            java.lang.String r0 = "shortLink"
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch: java.lang.Exception -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto L40
            com.acse.ottn.o r1 = com.acse.ottn.o.c()     // Catch: java.lang.Exception -> L10
            r1.a(r4, r0)     // Catch: java.lang.Exception -> L10
            goto L40
        L26:
            java.lang.String r1 = com.acse.ottn.service.WebViewService.f2692h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception ="
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.acse.ottn.h2.a(r1, r0)
        L40:
            int r5 = super.onStartCommand(r5, r6, r7)
            return r5
    }
}
