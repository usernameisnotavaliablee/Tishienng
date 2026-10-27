package com.acse.ottn.dsbridge;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DWebView extends android.webkit.WebView {
    public static final java.lang.String l = "_dsbridge";
    public static final java.lang.String m = "dsBridge";
    public static boolean n;
    public java.util.Map<java.lang.String, java.lang.Object> a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f2250b;

    /* renamed from: c, reason: collision with root package name */
    public int f2251c;

    /* renamed from: d, reason: collision with root package name */
    public android.webkit.WebChromeClient f2252d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f2253e;

    /* renamed from: f, reason: collision with root package name */
    public com.acse.ottn.dsbridge.DWebView.g f2254f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList<com.acse.ottn.dsbridge.DWebView.e> f2255g;

    /* renamed from: h, reason: collision with root package name */
    public com.acse.ottn.dsbridge.DWebView.InnerJavascriptInterface f2256h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f2257i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.Map<java.lang.Integer, com.acse.ottn.d3> f2258j;

    /* renamed from: k, reason: collision with root package name */
    public android.webkit.WebChromeClient f2259k;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class InnerJavascriptInterface {
        public final /* synthetic */ com.acse.ottn.dsbridge.DWebView a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements com.acse.ottn.m0 {
            public final /* synthetic */ java.lang.String a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.acse.ottn.dsbridge.DWebView.InnerJavascriptInterface f2265b;

            public a(com.acse.ottn.dsbridge.DWebView.InnerJavascriptInterface r1, java.lang.String r2) {
                    r0 = this;
                    r0.f2265b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // com.acse.ottn.m0
            public void a() {
                    r2 = this;
                    r0 = 0
                    r1 = 1
                    r2.a(r0, r1)
                    return
            }

            @Override // com.acse.ottn.m0
            public void a(java.lang.Object r2) {
                    r1 = this;
                    r0 = 0
                    r1.a(r2, r0)
                    return
            }

            public final void a(java.lang.Object r5, boolean r6) {
                    r4 = this;
                    org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L45
                    r0.<init>()     // Catch: java.lang.Exception -> L45
                    java.lang.String r1 = "code"
                    r2 = 0
                    r0.put(r1, r2)     // Catch: java.lang.Exception -> L45
                    java.lang.String r1 = "data"
                    r0.put(r1, r5)     // Catch: java.lang.Exception -> L45
                    java.lang.String r5 = r4.a     // Catch: java.lang.Exception -> L45
                    if (r5 == 0) goto L45
                    java.lang.String r1 = "%s(%s.data);"
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L45
                    r3 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L45
                    r3[r2] = r5     // Catch: java.lang.Exception -> L45
                    r5 = 1
                    r3[r5] = r0     // Catch: java.lang.Exception -> L45
                    java.lang.String r5 = java.lang.String.format(r1, r3)     // Catch: java.lang.Exception -> L45
                    if (r6 == 0) goto L3e
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
                    r6.<init>()     // Catch: java.lang.Exception -> L45
                    r6.append(r5)     // Catch: java.lang.Exception -> L45
                    java.lang.String r5 = "delete window."
                    r6.append(r5)     // Catch: java.lang.Exception -> L45
                    java.lang.String r5 = r4.a     // Catch: java.lang.Exception -> L45
                    r6.append(r5)     // Catch: java.lang.Exception -> L45
                    java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L45
                L3e:
                    com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface r6 = r4.f2265b     // Catch: java.lang.Exception -> L45
                    com.acse.ottn.dsbridge.DWebView r6 = r6.a     // Catch: java.lang.Exception -> L45
                    r6.b(r5)     // Catch: java.lang.Exception -> L45
                L45:
                    return
            }

            @Override // com.acse.ottn.m0
            public void b(java.lang.Object r2) {
                    r1 = this;
                    r0 = 1
                    r1.a(r2, r0)
                    return
            }
        }

        public InnerJavascriptInterface(com.acse.ottn.dsbridge.DWebView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ InnerJavascriptInterface(com.acse.ottn.dsbridge.DWebView r1, com.acse.ottn.dsbridge.DWebView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void a(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "dsBridge"
                com.acse.ottn.h2.a(r0, r5)
                boolean r0 = com.acse.ottn.dsbridge.DWebView.a()
                if (r0 == 0) goto L35
                com.acse.ottn.dsbridge.DWebView r0 = r4.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "DEBUG ERR MSG:\\n"
                r1.append(r2)
                java.lang.String r2 = "\\'"
                java.lang.String r3 = "\\\\'"
                java.lang.String r5 = r5.replaceAll(r2, r3)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.String r5 = "alert('%s')"
                java.lang.String r5 = java.lang.String.format(r5, r1)
                r0.b(r5)
            L35:
                return
        }

        @android.webkit.JavascriptInterface
        @androidx.annotation.Keep
        public java.lang.String call(java.lang.String r14, java.lang.String r15) {
                r13 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r1 = "_dscbstub"
                java.lang.String r2 = "code"
                java.lang.String r3 = "data"
                com.acse.ottn.dsbridge.DWebView r4 = r13.a
                java.lang.String r14 = r14.trim()
                java.lang.String[] r14 = com.acse.ottn.dsbridge.DWebView.c(r4, r14)
                r4 = 1
                r5 = r14[r4]
                com.acse.ottn.dsbridge.DWebView r6 = r13.a
                java.util.Map r6 = com.acse.ottn.dsbridge.DWebView.d(r6)
                r7 = 0
                r14 = r14[r7]
                java.lang.Object r14 = r6.get(r14)
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r8 = -1
                r6.put(r2, r8)     // Catch: org.json.JSONException -> L2c
                goto L2d
            L2c:
            L2d:
                if (r14 != 0) goto L39
                java.lang.String r14 = "Js bridge  called, but can't find a corresponded JavascriptInterface object , please check your code!"
                r13.a(r14)
                java.lang.String r14 = r6.toString()
                return r14
            L39:
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lfb
                r8.<init>(r15)     // Catch: org.json.JSONException -> Lfb
                boolean r15 = r8.has(r1)     // Catch: org.json.JSONException -> Lfb
                r9 = 0
                if (r15 == 0) goto L4a
                java.lang.String r15 = r8.getString(r1)     // Catch: org.json.JSONException -> Lfb
                goto L4b
            L4a:
                r15 = r9
            L4b:
                boolean r1 = r8.has(r3)     // Catch: org.json.JSONException -> Lfb
                if (r1 == 0) goto L56
                java.lang.Object r1 = r8.get(r3)     // Catch: org.json.JSONException -> Lfb
                goto L57
            L56:
                r1 = r9
            L57:
                java.lang.Class r8 = r14.getClass()
                r10 = 2
                java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L6a
                r11[r7] = r0     // Catch: java.lang.Exception -> L6a
                java.lang.Class<com.acse.ottn.m0> r12 = com.acse.ottn.m0.class
                r11[r4] = r12     // Catch: java.lang.Exception -> L6a
                java.lang.reflect.Method r9 = r8.getMethod(r5, r11)     // Catch: java.lang.Exception -> L6a
                r0 = 1
                goto L76
            L6a:
                java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L74
                r11[r7] = r0     // Catch: java.lang.Exception -> L74
                java.lang.reflect.Method r9 = r8.getMethod(r5, r11)     // Catch: java.lang.Exception -> L74
            L72:
                r0 = 0
                goto L76
            L74:
                goto L72
            L76:
                if (r9 != 0) goto L96
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "Not find method \""
                r14.append(r15)
                r14.append(r5)
                java.lang.String r15 = "\" implementation! please check if the  signature or namespace of the method is right "
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.a(r14)
                java.lang.String r14 = r6.toString()
                return r14
            L96:
                java.lang.Class<android.webkit.JavascriptInterface> r8 = android.webkit.JavascriptInterface.class
                java.lang.annotation.Annotation r8 = r9.getAnnotation(r8)
                android.webkit.JavascriptInterface r8 = (android.webkit.JavascriptInterface) r8
                if (r8 != 0) goto Lbe
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "Method "
                r14.append(r15)
                r14.append(r5)
                java.lang.String r15 = " is not invoked, since  it is not declared with JavascriptInterface annotation! "
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.a(r14)
                java.lang.String r14 = r6.toString()
                return r14
            Lbe:
                r9.setAccessible(r4)
                if (r0 == 0) goto Ld6
                com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface$a r0 = new com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface$a     // Catch: java.lang.Exception -> Le9
                r0.<init>(r13, r15)     // Catch: java.lang.Exception -> Le9
                java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> Le9
                r15[r7] = r1     // Catch: java.lang.Exception -> Le9
                r15[r4] = r0     // Catch: java.lang.Exception -> Le9
                r9.invoke(r14, r15)     // Catch: java.lang.Exception -> Le9
                java.lang.String r14 = r6.toString()
                return r14
            Ld6:
                java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Le9
                r15[r7] = r1     // Catch: java.lang.Exception -> Le9
                java.lang.Object r14 = r9.invoke(r14, r15)     // Catch: java.lang.Exception -> Le9
                r6.put(r2, r7)     // Catch: java.lang.Exception -> Le9
                r6.put(r3, r14)     // Catch: java.lang.Exception -> Le9
                java.lang.String r14 = r6.toString()     // Catch: java.lang.Exception -> Le9
                return r14
            Le9:
                java.lang.Object[] r14 = new java.lang.Object[r4]
                r14[r7] = r5
                java.lang.String r15 = "Call failed：The parameter of \"%s\" in Java is invalid."
                java.lang.String r14 = java.lang.String.format(r15, r14)
                r13.a(r14)
                java.lang.String r14 = r6.toString()
                return r14
            Lfb:
                java.lang.Object[] r14 = new java.lang.Object[r4]
                r14[r7] = r5
                java.lang.String r15 = "The argument of \"%s\" must be a JSON object string!"
                java.lang.String r14 = java.lang.String.format(r15, r14)
                r13.a(r14)
                java.lang.String r14 = r6.toString()
                return r14
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.dsbridge.DWebView f2266b;

        public a(com.acse.ottn.dsbridge.DWebView r1, java.lang.String r2) {
                r0 = this;
                r0.f2266b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.dsbridge.DWebView r0 = r2.f2266b
                java.lang.String r1 = r2.a
                com.acse.ottn.dsbridge.DWebView.d(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.dsbridge.DWebView f2267b;

        public b(com.acse.ottn.dsbridge.DWebView r1, java.lang.String r2) {
                r0 = this;
                r0.f2267b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.String r0 = r2.a
                if (r0 == 0) goto L14
                java.lang.String r1 = "javascript:"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L14
                com.acse.ottn.dsbridge.DWebView r0 = r2.f2267b
                java.lang.String r1 = r2.a
                com.acse.ottn.dsbridge.DWebView.a(r0, r1)
                return
            L14:
                com.acse.ottn.dsbridge.DWebView r0 = r2.f2267b
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.acse.ottn.dsbridge.DWebView.a(r0, r1)
                com.acse.ottn.dsbridge.DWebView r0 = r2.f2267b
                java.lang.String r1 = r2.a
                com.acse.ottn.dsbridge.DWebView.b(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.util.Map f2268b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.dsbridge.DWebView f2269c;

        public c(com.acse.ottn.dsbridge.DWebView r1, java.lang.String r2, java.util.Map r3) {
                r0 = this;
                r0.f2269c = r1
                r0.a = r2
                r0.f2268b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.String r0 = r3.a
                if (r0 == 0) goto L16
                java.lang.String r1 = "javascript:"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L16
                com.acse.ottn.dsbridge.DWebView r0 = r3.f2269c
                java.lang.String r1 = r3.a
                java.util.Map r2 = r3.f2268b
                com.acse.ottn.dsbridge.DWebView.a(r0, r1, r2)
                return
            L16:
                com.acse.ottn.dsbridge.DWebView r0 = r3.f2269c
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.acse.ottn.dsbridge.DWebView.a(r0, r1)
                com.acse.ottn.dsbridge.DWebView r0 = r3.f2269c
                java.lang.String r1 = r3.a
                java.util.Map r2 = r3.f2268b
                com.acse.ottn.dsbridge.DWebView.b(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.dsbridge.DWebView a;

        public d(com.acse.ottn.dsbridge.DWebView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.dsbridge.DWebView r0 = r2.a
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.acse.ottn.dsbridge.DWebView.a(r0, r1)
                com.acse.ottn.dsbridge.DWebView r0 = r2.a
                com.acse.ottn.dsbridge.DWebView.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e {
        public java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public int f2270b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f2271c;

        public e(java.lang.String r2, int r3, java.lang.Object[] r4) {
                r1 = this;
                r1.<init>()
                if (r4 != 0) goto L8
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]
            L8:
                org.json.JSONArray r0 = new org.json.JSONArray
                java.util.List r4 = java.util.Arrays.asList(r4)
                r0.<init>(r4)
                java.lang.String r4 = r0.toString()
                r1.a = r4
                r1.f2270b = r3
                r1.f2271c = r2
                return
        }

        public static /* synthetic */ int a(com.acse.ottn.dsbridge.DWebView.e r0) {
                int r0 = r0.f2270b
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "method"
                java.lang.String r2 = r3.f2271c     // Catch: org.json.JSONException -> L1a
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
                java.lang.String r1 = "callbackId"
                int r2 = r3.f2270b     // Catch: org.json.JSONException -> L1a
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
                java.lang.String r1 = "data"
                java.lang.String r2 = r3.a     // Catch: org.json.JSONException -> L1a
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
            L1a:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public interface f {
        @android.annotation.TargetApi(11)
        void a(android.webkit.ValueCallback r1, java.lang.String r2);

        @android.annotation.TargetApi(16)
        void a(android.webkit.ValueCallback<android.net.Uri> r1, java.lang.String r2, java.lang.String r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g {
        boolean onClose();
    }

    static {
            return
    }

    public DWebView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.a = r2
            r2 = 0
            r1.f2251c = r2
            r2 = 1
            r1.f2253e = r2
            r2 = 0
            r1.f2254f = r2
            com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface r0 = new com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface
            r0.<init>(r1, r2)
            r1.f2256h = r0
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.f2257i = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f2258j = r2
            com.acse.ottn.dsbridge.DWebView$6 r2 = new com.acse.ottn.dsbridge.DWebView$6
            r2.<init>(r1)
            r1.f2259k = r2
            r1.c()
            return
    }

    public DWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.a = r1
            r1 = 0
            r0.f2251c = r1
            r1 = 1
            r0.f2253e = r1
            r1 = 0
            r0.f2254f = r1
            com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface r2 = new com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface
            r2.<init>(r0, r1)
            r0.f2256h = r2
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f2257i = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f2258j = r1
            com.acse.ottn.dsbridge.DWebView$6 r1 = new com.acse.ottn.dsbridge.DWebView$6
            r1.<init>(r0)
            r0.f2259k = r1
            r0.c()
            return
    }

    public static /* synthetic */ java.util.ArrayList a(com.acse.ottn.dsbridge.DWebView r0, java.util.ArrayList r1) {
            r0.f2255g = r1
            return r1
    }

    public static /* synthetic */ void a(com.acse.ottn.dsbridge.DWebView r0) {
            super.reload()
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.dsbridge.DWebView r0, java.lang.Runnable r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.dsbridge.DWebView r0, java.lang.String r1) {
            super.loadUrl(r1)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.dsbridge.DWebView r0, java.lang.String r1, android.webkit.ValueCallback r2) {
            super.evaluateJavascript(r1, r2)
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.dsbridge.DWebView r0, java.lang.String r1, java.util.Map r2) {
            super.loadUrl(r1, r2)
            return
    }

    public static /* synthetic */ boolean a() {
            boolean r0 = com.acse.ottn.dsbridge.DWebView.n
            return r0
    }

    public static /* synthetic */ boolean a(com.acse.ottn.dsbridge.DWebView r0, boolean r1) {
            r0.f2253e = r1
            return r1
    }

    @androidx.annotation.Keep
    private void addInternalJavascriptObject() {
            r2 = this;
            com.acse.ottn.dsbridge.DWebView$1 r0 = new com.acse.ottn.dsbridge.DWebView$1
            r0.<init>(r2)
            java.lang.String r1 = "_dsb"
            r2.a(r0, r1)
            return
    }

    public static /* synthetic */ android.webkit.WebChromeClient b(com.acse.ottn.dsbridge.DWebView r0) {
            android.webkit.WebChromeClient r0 = r0.f2252d
            return r0
    }

    public static /* synthetic */ void b(com.acse.ottn.dsbridge.DWebView r0, java.lang.String r1) {
            super.loadUrl(r1)
            return
    }

    public static /* synthetic */ void b(com.acse.ottn.dsbridge.DWebView r0, java.lang.String r1, java.util.Map r2) {
            super.loadUrl(r1, r2)
            return
    }

    public static /* synthetic */ com.acse.ottn.dsbridge.DWebView.InnerJavascriptInterface c(com.acse.ottn.dsbridge.DWebView r0) {
            com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface r0 = r0.f2256h
            return r0
    }

    public static /* synthetic */ java.lang.String[] c(com.acse.ottn.dsbridge.DWebView r0, java.lang.String r1) {
            java.lang.String[] r0 = r0.c(r1)
            return r0
    }

    public static /* synthetic */ java.util.Map d(com.acse.ottn.dsbridge.DWebView r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.a
            return r0
    }

    public static /* synthetic */ void d(com.acse.ottn.dsbridge.DWebView r0, java.lang.String r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ com.acse.ottn.dsbridge.DWebView.g e(com.acse.ottn.dsbridge.DWebView r0) {
            com.acse.ottn.dsbridge.DWebView$g r0 = r0.f2254f
            return r0
    }

    public static /* synthetic */ boolean f(com.acse.ottn.dsbridge.DWebView r0) {
            boolean r0 = r0.f2253e
            return r0
    }

    public static /* synthetic */ void g(com.acse.ottn.dsbridge.DWebView r0) {
            r0.b()
            return
    }

    public static void setWebContentsDebuggingEnabled(boolean r0) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(r0)
            com.acse.ottn.dsbridge.DWebView.n = r0
            return
    }

    public final void a(com.acse.ottn.dsbridge.DWebView.e r3) {
            r2 = this;
            java.lang.String r3 = r3.toString()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "window._handleMessageFromNative(%s)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r2.b(r3)
            return
    }

    public void a(java.io.File r4) {
            r3 = this;
            boolean r0 = r4.exists()
            if (r0 == 0) goto L2a
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L10
            r4.delete()
            goto L26
        L10:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L26
            java.io.File[] r0 = r4.listFiles()
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L26
            r2 = r0[r1]
            r3.a(r2)
            int r1 = r1 + 1
            goto L1b
        L26:
            r4.delete()
            return
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "delete file no exists "
            r0.append(r1)
            java.lang.String r4 = r4.getAbsolutePath()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "Webview"
            com.acse.ottn.h2.b(r0, r4)
            return
    }

    public void a(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            if (r2 == 0) goto Lb
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.a
            r0.put(r3, r2)
        Lb:
            return
    }

    public final void a(java.lang.Runnable r3) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Le
            r3.run()
            return
        Le:
            android.os.Handler r0 = r2.f2257i
            r0.post(r3)
            return
    }

    public final void a(java.lang.String r2) {
            r1 = this;
            r0 = 0
            a(r1, r2, r0)
            return
    }

    public <T> void a(java.lang.String r2, com.acse.ottn.d3<T> r3) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0, r3)
            return
    }

    public void a(java.lang.String r2, java.lang.Object[] r3) {
            r1 = this;
            r0 = 0
            r1.a(r2, r3, r0)
            return
    }

    public synchronized <T> void a(java.lang.String r3, java.lang.Object[] r4, com.acse.ottn.d3<T> r5) {
            r2 = this;
            monitor-enter(r2)
            com.acse.ottn.dsbridge.DWebView$e r0 = new com.acse.ottn.dsbridge.DWebView$e     // Catch: java.lang.Throwable -> L1c
            int r1 = r2.f2251c     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + 1
            r2.f2251c = r1     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            java.util.Map<java.lang.Integer, com.acse.ottn.d3> r3 = r2.f2258j     // Catch: java.lang.Throwable -> L1c
            int r4 = com.acse.ottn.dsbridge.DWebView.e.a(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L2b
        L1e:
            java.util.ArrayList<com.acse.ottn.dsbridge.DWebView$e> r3 = r2.f2255g     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L26
            r3.add(r0)     // Catch: java.lang.Throwable -> L1c
            goto L29
        L26:
            r2.a(r0)     // Catch: java.lang.Throwable -> L1c
        L29:
            monitor-exit(r2)
            return
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    public void a(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            r0.f2253e = r1
            return
    }

    public final synchronized void b() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList<com.acse.ottn.dsbridge.DWebView$e> r0 = r2.f2255g     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L19
        L9:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L19
            com.acse.ottn.dsbridge.DWebView$e r1 = (com.acse.ottn.dsbridge.DWebView.e) r1     // Catch: java.lang.Throwable -> L19
            r2.a(r1)     // Catch: java.lang.Throwable -> L19
            goto L9
        L19:
            r0 = move-exception
            goto L20
        L1b:
            r0 = 0
            r2.f2255g = r0     // Catch: java.lang.Throwable -> L19
        L1e:
            monitor-exit(r2)
            return
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public void b(java.lang.String r2) {
            r1 = this;
            com.acse.ottn.dsbridge.DWebView$a r0 = new com.acse.ottn.dsbridge.DWebView$a
            r0.<init>(r1, r2)
            r1.a(r0)
            return
    }

    public void b(java.lang.String r3, com.acse.ottn.d3<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "_hasJavascriptMethod"
            r2.a(r3, r0, r4)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public final void c() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r3.getContext()
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = "/webcache"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.f2250b = r0
            android.webkit.WebSettings r0 = r3.getSettings()
            r1 = 1
            r0.setDomStorageEnabled(r1)
            android.webkit.CookieManager r2 = android.webkit.CookieManager.getInstance()
            r2.setAcceptThirdPartyCookies(r3, r1)
            r2 = 0
            r0.setMixedContentMode(r2)
            r0.setAllowFileAccess(r2)
            r2 = 2
            r0.setCacheMode(r2)
            r0.setJavaScriptEnabled(r1)
            r0.setLoadWithOverviewMode(r1)
            r0.setUseWideViewPort(r1)
            android.webkit.WebChromeClient r0 = r3.f2259k
            super.setWebChromeClient(r0)
            r3.addInternalJavascriptObject()
            com.acse.ottn.dsbridge.DWebView$InnerJavascriptInterface r0 = r3.f2256h
            java.lang.String r1 = "_dsbridge"
            super.addJavascriptInterface(r0, r1)
            return
    }

    public final java.lang.String[] c(java.lang.String r3) {
            r2 = this;
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L15
            r1 = 0
            java.lang.String r1 = r3.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            goto L17
        L15:
            java.lang.String r1 = ""
        L17:
            java.lang.String[] r3 = new java.lang.String[]{r1, r3}
            return r3
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean r4) {
            r3 = this;
            super.clearCache(r4)
            android.webkit.CookieManager r4 = android.webkit.CookieManager.getInstance()
            r4.removeAllCookie()
            android.content.Context r4 = r3.getContext()
            java.lang.String r0 = "webview.db"
            r4.deleteDatabase(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = "webviewCache.db"
            r4.deleteDatabase(r0)     // Catch: java.lang.Exception -> L19
            goto L1a
        L19:
        L1a:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.f2250b
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r4 = r4.getCacheDir()
            java.lang.String r4 = r4.getAbsolutePath()
            r2.append(r4)
            java.lang.String r4 = "/webviewCache"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            boolean r4 = r1.exists()
            if (r4 == 0) goto L48
            r3.a(r1)
        L48:
            boolean r4 = r0.exists()
            if (r4 == 0) goto L51
            r3.a(r0)
        L51:
            return
    }

    public void d(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.a
            r0.remove(r2)
            return
    }

    @Override // android.webkit.WebView
    public void loadUrl(java.lang.String r2) {
            r1 = this;
            com.acse.ottn.dsbridge.DWebView$b r0 = new com.acse.ottn.dsbridge.DWebView$b
            r0.<init>(r1, r2)
            r1.a(r0)
            return
    }

    @Override // android.webkit.WebView
    public void loadUrl(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            com.acse.ottn.dsbridge.DWebView$c r0 = new com.acse.ottn.dsbridge.DWebView$c
            r0.<init>(r1, r2, r3)
            r1.a(r0)
            return
    }

    @Override // android.webkit.WebView
    public void reload() {
            r1 = this;
            com.acse.ottn.dsbridge.DWebView$d r0 = new com.acse.ottn.dsbridge.DWebView$d
            r0.<init>(r1)
            r1.a(r0)
            return
    }

    public void setJavascriptCloseWindowListener(com.acse.ottn.dsbridge.DWebView.g r1) {
            r0 = this;
            r0.f2254f = r1
            return
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(android.webkit.WebChromeClient r1) {
            r0 = this;
            r0.f2252d = r1
            return
    }
}
