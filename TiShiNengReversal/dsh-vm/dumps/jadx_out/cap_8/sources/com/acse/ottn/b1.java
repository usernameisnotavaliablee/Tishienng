package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static com.acse.ottn.b1 f2149d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f2150e = "ExcessActivity";
    public android.app.Activity a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.widget.CustomWebView f2151b;

    /* renamed from: c, reason: collision with root package name */
    public com.acse.ottn.b1.c f2152c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2153b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2154c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2155d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f2156e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.b1 f2157f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.b1$a$a, reason: collision with other inner class name */
        public class RunnableC0066a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.b1.a a;

            public RunnableC0066a(com.acse.ottn.b1.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.acse.ottn.b1$a r0 = r1.a
                    com.acse.ottn.b1 r0 = r0.f2157f
                    android.app.Activity r0 = com.acse.ottn.b1.a(r0)
                    r0.finishAndRemoveTask()
                    return
            }
        }

        public a(com.acse.ottn.b1 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
                r0 = this;
                r0.f2157f = r1
                r0.a = r2
                r0.f2153b = r3
                r0.f2154c = r4
                r0.f2155d = r5
                r0.f2156e = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = r4.a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3e
                com.acse.ottn.model.AccessiblityModel r0 = new com.acse.ottn.model.AccessiblityModel
                r0.<init>()
                com.acse.ottn.model.AccessiblityModel$DataBean r1 = r0.getData()
                java.lang.String r2 = r4.a
                r1.setSpop_deeplink(r2)
                com.acse.ottn.model.AccessiblityModel$DataBean r1 = r0.getData()
                java.lang.String r2 = r4.f2153b
                r1.setSpop_link(r2)
                com.acse.ottn.model.AccessiblityModel$DataBean r1 = r0.getData()
                java.lang.String r2 = r4.f2154c
                r1.setPackage_name(r2)
                com.acse.ottn.model.AccessiblityModel$DataBean r1 = r0.getData()
                java.lang.String r2 = r4.f2155d
                r1.setJump_type(r2)
                com.acse.ottn.l4 r1 = com.acse.ottn.l4.c()
                com.acse.ottn.b1 r2 = r4.f2157f
                android.app.Activity r2 = com.acse.ottn.b1.a(r2)
                r1.a(r2, r0)
            L3e:
                android.os.Handler r0 = new android.os.Handler
                r0.<init>()
                com.acse.ottn.b1$a$a r1 = new com.acse.ottn.b1$a$a
                r1.<init>(r4)
                int r2 = r4.f2156e
                long r2 = (long) r2
                r0.postDelayed(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends android.webkit.WebViewClient {
        public final /* synthetic */ com.acse.ottn.b1 a;

        public b(com.acse.ottn.b1 r1) {
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
    public class c extends android.webkit.WebChromeClient {
        public final /* synthetic */ com.acse.ottn.b1 a;

        public c(com.acse.ottn.b1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(com.acse.ottn.b1 r1, com.acse.ottn.b1.a r2) {
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
            return
    }

    public b1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ android.app.Activity a(com.acse.ottn.b1 r0) {
            android.app.Activity r0 = r0.a
            return r0
    }

    public static com.acse.ottn.b1 a() {
            com.acse.ottn.b1 r0 = com.acse.ottn.b1.f2149d
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.b1> r0 = com.acse.ottn.b1.class
            monitor-enter(r0)
            com.acse.ottn.b1 r1 = com.acse.ottn.b1.f2149d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.b1 r1 = new com.acse.ottn.b1     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.b1.f2149d = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.b1 r0 = com.acse.ottn.b1.f2149d
            return r0
    }

    public void a(android.app.Activity r11) {
            r10 = this;
            r10.a = r11
            int r0 = com.acse.ottn.R.id.dwebView
            android.view.View r11 = r11.findViewById(r0)
            com.acse.ottn.widget.CustomWebView r11 = (com.acse.ottn.widget.CustomWebView) r11
            r10.f2151b = r11
            android.app.Activity r11 = r10.a
            android.content.Intent r11 = r11.getIntent()
            java.lang.String r0 = "password"
            java.lang.String r11 = r11.getStringExtra(r0)
            android.app.Activity r0 = r10.a
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "link"
            java.lang.String r5 = r0.getStringExtra(r1)
            android.app.Activity r0 = r10.a
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "deeplink"
            java.lang.String r4 = r0.getStringExtra(r1)
            android.app.Activity r0 = r10.a
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "origin_url"
            java.lang.String r0 = r0.getStringExtra(r1)
            android.app.Activity r1 = r10.a
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "jump_type"
            java.lang.String r7 = r1.getStringExtra(r2)
            android.app.Activity r1 = r10.a
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "name"
            java.lang.String r6 = r1.getStringExtra(r2)
            android.app.Activity r1 = r10.a
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "time"
            r3 = 100
            int r1 = r1.getIntExtra(r2, r3)
            android.app.Activity r2 = r10.a
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "dissmiss_time"
            r8 = 0
            int r8 = r2.getIntExtra(r3, r8)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto La0
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = r2.l(r6)     // Catch: java.lang.Exception -> L97
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L97
            if (r3 != 0) goto L8d
            com.acse.ottn.o r3 = com.acse.ottn.o.c()     // Catch: java.lang.Exception -> L97
            android.app.Activity r9 = r10.a     // Catch: java.lang.Exception -> L97
            r3.a(r9, r2)     // Catch: java.lang.Exception -> L97
            goto La0
        L8d:
            com.acse.ottn.o r2 = com.acse.ottn.o.c()     // Catch: java.lang.Exception -> L97
            android.app.Activity r3 = r10.a     // Catch: java.lang.Exception -> L97
            r2.a(r3, r11)     // Catch: java.lang.Exception -> L97
            goto La0
        L97:
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            android.app.Activity r3 = r10.a
            r2.a(r3, r11)
        La0:
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto Lc0
            java.lang.String r11 = com.acse.ottn.b1.f2150e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadH5Url = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r11, r2)
            r10.a(r0)
            goto Lc7
        Lc0:
            java.lang.String r11 = com.acse.ottn.b1.f2150e
            java.lang.String r0 = "origin_url is null"
            com.acse.ottn.h2.a(r11, r0)
        Lc7:
            android.os.Handler r11 = new android.os.Handler
            r11.<init>()
            com.acse.ottn.b1$a r2 = new com.acse.ottn.b1$a
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            long r0 = (long) r1
            r11.postDelayed(r2, r0)
            return
    }

    public final void a(java.lang.String r8) {
            r7 = this;
            com.acse.ottn.widget.CustomWebView r0 = r7.f2151b     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L5
            goto L64
        L5:
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch: java.lang.Throwable -> L64
            r1 = 100
            r0.setTextZoom(r1)     // Catch: java.lang.Throwable -> L64
            r1 = 1
            r0.setJavaScriptEnabled(r1)     // Catch: java.lang.Throwable -> L64
            r0.setDomStorageEnabled(r1)     // Catch: java.lang.Throwable -> L64
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)     // Catch: java.lang.Throwable -> L64
            android.webkit.WebSettings$PluginState r2 = android.webkit.WebSettings.PluginState.ON     // Catch: java.lang.Throwable -> L64
            r0.setPluginState(r2)     // Catch: java.lang.Throwable -> L64
            r0.setAllowFileAccess(r1)     // Catch: java.lang.Throwable -> L64
            r0.setLoadWithOverviewMode(r1)     // Catch: java.lang.Throwable -> L64
            r0.setUseWideViewPort(r1)     // Catch: java.lang.Throwable -> L64
            r0.setSupportZoom(r1)     // Catch: java.lang.Throwable -> L64
            r2 = 0
            r0.setMixedContentMode(r2)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.b1$c r3 = new com.acse.ottn.b1$c     // Catch: java.lang.Throwable -> L64
            r4 = 0
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L64
            r7.f2152c = r3     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.widget.CustomWebView r4 = r7.f2151b     // Catch: java.lang.Throwable -> L64
            r4.setWebChromeClient(r3)     // Catch: java.lang.Throwable -> L64
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "setAllowUniversalAccessFromFileURLs"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L64
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L64
            r5[r2] = r6     // Catch: java.lang.Throwable -> L64
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L55
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L64
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L64
            r1[r2] = r4     // Catch: java.lang.Throwable -> L64
            r3.invoke(r0, r1)     // Catch: java.lang.Throwable -> L64
        L55:
            com.acse.ottn.widget.CustomWebView r0 = r7.f2151b     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.b1$b r1 = new com.acse.ottn.b1$b     // Catch: java.lang.Throwable -> L64
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L64
            r0.setWebViewClient(r1)     // Catch: java.lang.Throwable -> L64
            com.acse.ottn.widget.CustomWebView r0 = r7.f2151b     // Catch: java.lang.Throwable -> L64
            r0.loadUrl(r8)     // Catch: java.lang.Throwable -> L64
        L64:
            return
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.b1 r0 = com.acse.ottn.b1.f2149d
            return r0
    }
}
