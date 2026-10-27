package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e4 {
    public static com.acse.ottn.e4 p;
    public android.widget.ImageView a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f2299b;

    /* renamed from: c, reason: collision with root package name */
    public com.acse.ottn.widget.CustomWebView f2300c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f2301d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2302e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2303f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f2304g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f2305h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f2306i;

    /* renamed from: j, reason: collision with root package name */
    public com.acse.ottn.e4.g f2307j;

    /* renamed from: k, reason: collision with root package name */
    public com.acse.ottn.e4.h f2308k;
    public android.app.Activity l;
    public java.lang.String m;
    public android.animation.ValueAnimator n;
    public android.os.Handler o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.e4 a;

        public a(com.acse.ottn.e4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends android.webkit.WebViewClient {
        public final /* synthetic */ com.acse.ottn.e4 a;

        public b(com.acse.ottn.e4 r1) {
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
    public class c implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e4 f2309b;

        public c(com.acse.ottn.e4 r1, java.lang.String r2) {
                r0 = this;
                r0.f2309b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.acse.ottn.e4 r0 = r4.f2309b
                java.lang.String r1 = ""
                com.acse.ottn.e4.a(r0, r1)
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient     // Catch: java.lang.Exception -> L4d
                r0.<init>()     // Catch: java.lang.Exception -> L4d
                okhttp3.Request$Builder r2 = new okhttp3.Request$Builder     // Catch: java.lang.Exception -> L4d
                r2.<init>()     // Catch: java.lang.Exception -> L4d
                java.lang.String r3 = r4.a     // Catch: java.lang.Exception -> L4d
                okhttp3.Request$Builder r2 = r2.url(r3)     // Catch: java.lang.Exception -> L4d
                okhttp3.Request r2 = r2.build()     // Catch: java.lang.Exception -> L4d
                okhttp3.Call r0 = r0.newCall(r2)     // Catch: java.lang.Exception -> L4d
                okhttp3.Response r0 = r0.execute()     // Catch: java.lang.Exception -> L4d
                okhttp3.ResponseBody r0 = r0.body()     // Catch: java.lang.Exception -> L4d
                java.lang.String r0 = r0.string()     // Catch: java.lang.Exception -> L4d
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4d
                r2.<init>(r0)     // Catch: java.lang.Exception -> L4d
                com.acse.ottn.e4 r0 = r4.f2309b     // Catch: java.lang.Exception -> L4d
                java.lang.String r3 = "content"
                java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Exception -> L4d
                com.acse.ottn.e4.a(r0, r3)     // Catch: java.lang.Exception -> L4d
                java.lang.String r0 = "origin_url"
                java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L57
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L57
                if (r1 != 0) goto L57
                com.acse.ottn.e4 r1 = r4.f2309b     // Catch: java.lang.Throwable -> L57
                com.acse.ottn.e4.b(r1, r0)     // Catch: java.lang.Throwable -> L57
                return
            L4d:
                com.acse.ottn.e4 r0 = r4.f2309b
                com.acse.ottn.e4.a(r0, r1)
                com.acse.ottn.e4 r0 = r4.f2309b
                com.acse.ottn.e4.b(r0)
            L57:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ com.acse.ottn.e4 a;

        public d(com.acse.ottn.e4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r4) {
                r3 = this;
                java.lang.Object r4 = r4.getAnimatedValue()
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                com.acse.ottn.e4 r0 = r3.a
                android.widget.TextView r0 = com.acse.ottn.e4.d(r0)
                com.acse.ottn.e4 r1 = r3.a
                java.lang.String[] r1 = com.acse.ottn.e4.c(r1)
                com.acse.ottn.e4 r2 = r3.a
                java.lang.String[] r2 = com.acse.ottn.e4.c(r2)
                int r2 = r2.length
                int r4 = r4 % r2
                r4 = r1[r4]
                r0.setText(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e extends android.os.Handler {
        public final /* synthetic */ com.acse.ottn.e4 a;

        public e(com.acse.ottn.e4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r8) {
                r7 = this;
                super.handleMessage(r8)
                int r8 = r8.what
                r0 = 10010(0x271a, float:1.4027E-41)
                r1 = 2000(0x7d0, float:2.803E-42)
                r2 = 10011(0x271b, float:1.4028E-41)
                java.lang.String r3 = "3"
                java.lang.String r4 = "2"
                java.lang.String r5 = "1"
                r6 = 0
                if (r8 != r0) goto L97
                com.acse.ottn.e4 r8 = r7.a
                android.animation.ValueAnimator r8 = r8.n
                if (r8 == 0) goto L21
                r8.cancel()
                com.acse.ottn.e4 r8 = r7.a
                r8.n = r6
            L21:
                com.acse.ottn.o r8 = com.acse.ottn.o.c()
                java.lang.String r8 = r8.w
                com.acse.ottn.e4 r0 = r7.a
                java.lang.String r0 = com.acse.ottn.e4.e(r0)
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L3f
                com.acse.ottn.e4 r8 = r7.a
                android.widget.ImageView r8 = com.acse.ottn.e4.f(r8)
                int r0 = com.acse.ottn.R.mipmap.jd_one
                r8.setImageResource(r0)
                goto L4a
            L3f:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.ImageView r8 = com.acse.ottn.e4.f(r8)
                int r0 = com.acse.ottn.R.mipmap.loading_one
                r8.setImageResource(r0)
            L4a:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.TextView r8 = com.acse.ottn.e4.d(r8)
                java.lang.String r0 = ""
                r8.setText(r0)
                com.acse.ottn.e4 r8 = r7.a
                java.lang.String r8 = com.acse.ottn.e4.g(r8)
                boolean r8 = r5.equals(r8)
                if (r8 != 0) goto L86
                com.acse.ottn.e4 r8 = r7.a
                java.lang.String r8 = com.acse.ottn.e4.g(r8)
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L86
                com.acse.ottn.e4 r8 = r7.a
                java.lang.String r8 = com.acse.ottn.e4.g(r8)
                boolean r8 = r3.equals(r8)
                if (r8 == 0) goto L7a
                goto L86
            L7a:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.TextView r8 = com.acse.ottn.e4.h(r8)
                java.lang.String r0 = "生成专属优惠券...ok"
                r8.setText(r0)
                goto L91
            L86:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.TextView r8 = com.acse.ottn.e4.h(r8)
                java.lang.String r0 = "生成专属礼金...ok"
                r8.setText(r0)
            L91:
                com.acse.ottn.e4 r8 = r7.a
                com.acse.ottn.e4.a(r8, r2, r1)
                return
            L97:
                r0 = 10012(0x271c, float:1.403E-41)
                if (r8 != r2) goto L116
                com.acse.ottn.e4 r8 = r7.a
                com.acse.ottn.e4.a(r8)
                com.acse.ottn.o r8 = com.acse.ottn.o.c()
                java.lang.String r8 = r8.w
                com.acse.ottn.e4 r2 = r7.a
                java.lang.String r2 = com.acse.ottn.e4.e(r2)
                boolean r8 = r8.equals(r2)
                if (r8 == 0) goto Lbe
                com.acse.ottn.e4 r8 = r7.a
                android.widget.ImageView r8 = com.acse.ottn.e4.f(r8)
                int r2 = com.acse.ottn.R.mipmap.jd_two
                r8.setImageResource(r2)
                goto Lc9
            Lbe:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.ImageView r8 = com.acse.ottn.e4.f(r8)
                int r2 = com.acse.ottn.R.mipmap.loading_two
                r8.setImageResource(r2)
            Lc9:
                com.acse.ottn.e4 r8 = r7.a
                java.lang.String r8 = com.acse.ottn.e4.g(r8)
                boolean r8 = r5.equals(r8)
                if (r8 != 0) goto Lfa
                com.acse.ottn.e4 r8 = r7.a
                java.lang.String r8 = com.acse.ottn.e4.g(r8)
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto Lfa
                com.acse.ottn.e4 r8 = r7.a
                java.lang.String r8 = com.acse.ottn.e4.g(r8)
                boolean r8 = r3.equals(r8)
                if (r8 == 0) goto Lee
                goto Lfa
            Lee:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.TextView r8 = com.acse.ottn.e4.h(r8)
                java.lang.String r2 = "复制优惠券口令"
                r8.setText(r2)
                goto L105
            Lfa:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.TextView r8 = com.acse.ottn.e4.h(r8)
                java.lang.String r2 = "复制礼金口令"
                r8.setText(r2)
            L105:
                com.acse.ottn.e4 r8 = r7.a
                android.widget.TextView r8 = com.acse.ottn.e4.d(r8)
                java.lang.String r2 = "..."
                r8.setText(r2)
                com.acse.ottn.e4 r8 = r7.a
                com.acse.ottn.e4.a(r8, r0, r1)
                return
            L116:
                if (r8 != r0) goto L12a
                com.acse.ottn.e4 r8 = r7.a
                android.animation.ValueAnimator r8 = r8.n
                if (r8 == 0) goto L125
                r8.cancel()
                com.acse.ottn.e4 r8 = r7.a
                r8.n = r6
            L125:
                com.acse.ottn.e4 r8 = r7.a
                com.acse.ottn.e4.b(r8)
            L12a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f extends android.widget.FrameLayout {
        public f(android.content.Context r2) {
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
    public class g extends android.webkit.WebChromeClient {
        public final /* synthetic */ com.acse.ottn.e4 a;

        public g(com.acse.ottn.e4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ g(com.acse.ottn.e4 r1, com.acse.ottn.e4.a r2) {
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface h {
        void a(java.lang.String r1, java.lang.String r2);
    }

    public e4() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ".."
            java.lang.String r1 = "..."
            java.lang.String r2 = "."
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r3.f2301d = r0
            com.acse.ottn.e4$e r0 = new com.acse.ottn.e4$e
            r0.<init>(r3)
            r3.o = r0
            return
    }

    public static com.acse.ottn.e4 a() {
            com.acse.ottn.e4 r0 = com.acse.ottn.e4.p
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.e4> r0 = com.acse.ottn.e4.class
            monitor-enter(r0)
            com.acse.ottn.e4 r1 = com.acse.ottn.e4.p     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.e4 r1 = new com.acse.ottn.e4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.e4.p = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.e4 r0 = com.acse.ottn.e4.p
            return r0
    }

    public static /* synthetic */ java.lang.String a(com.acse.ottn.e4 r0, java.lang.String r1) {
            r0.m = r1
            return r1
    }

    public static /* synthetic */ void a(com.acse.ottn.e4 r0) {
            r0.b()
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.e4 r0, int r1, int r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ java.lang.String b(com.acse.ottn.e4 r0, java.lang.String r1) {
            r0.f2304g = r1
            return r1
    }

    public static /* synthetic */ void b(com.acse.ottn.e4 r0) {
            r0.e()
            return
    }

    public static /* synthetic */ java.lang.String[] c(com.acse.ottn.e4 r0) {
            java.lang.String[] r0 = r0.f2301d
            return r0
    }

    public static /* synthetic */ android.widget.TextView d(com.acse.ottn.e4 r0) {
            android.widget.TextView r0 = r0.f2306i
            return r0
    }

    public static /* synthetic */ java.lang.String e(com.acse.ottn.e4 r0) {
            java.lang.String r0 = r0.f2302e
            return r0
    }

    public static /* synthetic */ android.widget.ImageView f(com.acse.ottn.e4 r0) {
            android.widget.ImageView r0 = r0.a
            return r0
    }

    public static /* synthetic */ java.lang.String g(com.acse.ottn.e4 r0) {
            java.lang.String r0 = r0.f2305h
            return r0
    }

    public static /* synthetic */ android.widget.TextView h(com.acse.ottn.e4 r0) {
            android.widget.TextView r0 = r0.f2299b
            return r0
    }

    public final void a(int r4, int r5) {
            r3 = this;
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r0.what = r4
            android.os.Handler r4 = r3.o
            long r1 = (long) r5
            r4.sendMessageDelayed(r0, r1)
            return
    }

    public void a(android.app.Activity r3, com.acse.ottn.e4.h r4) {
            r2 = this;
            r2.l = r3
            r2.f2308k = r4
            java.lang.String r4 = ""
            r2.m = r4
            int r4 = com.acse.ottn.R.id.loading_icon
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.a = r4
            com.acse.ottn.o r4 = com.acse.ottn.o.c()
            java.lang.String r4 = r4.w
            java.lang.String r0 = r2.f2302e
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L28
            android.widget.ImageView r4 = r2.a
            int r0 = com.acse.ottn.R.mipmap.jd_one
            r4.setImageResource(r0)
            goto L2f
        L28:
            android.widget.ImageView r4 = r2.a
            int r0 = com.acse.ottn.R.mipmap.loading_one
            r4.setImageResource(r0)
        L2f:
            int r4 = com.acse.ottn.R.id.tv_loading_text
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f2299b = r4
            int r4 = com.acse.ottn.R.id.tv_loading_animation
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f2306i = r4
            int r4 = com.acse.ottn.R.id.re_loading
            android.view.View r4 = r3.findViewById(r4)
            com.acse.ottn.e4$a r0 = new com.acse.ottn.e4$a
            r0.<init>(r2)
            r4.setOnClickListener(r0)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "link"
            java.lang.String r4 = r4.getStringExtra(r0)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "packagename"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f2302e = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "tkl_turn_url"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f2303f = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "origin_url"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f2304g = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "pic_type"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f2305h = r0
            java.lang.String r0 = r2.f2303f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9a
            java.lang.String r0 = r2.f2303f     // Catch: java.lang.Exception -> L99
            r2.b(r0)     // Catch: java.lang.Exception -> L99
            goto L9a
        L99:
        L9a:
            java.lang.String r0 = r2.f2305h
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lc1
            java.lang.String r0 = r2.f2305h
            java.lang.String r1 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lc1
            java.lang.String r0 = r2.f2305h
            java.lang.String r1 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb9
            goto Lc1
        Lb9:
            android.widget.TextView r0 = r2.f2299b
            java.lang.String r1 = "生成专属优惠券"
            r0.setText(r1)
            goto Lc8
        Lc1:
            android.widget.TextView r0 = r2.f2299b
            java.lang.String r1 = "生成专属礼金"
            r0.setText(r1)
        Lc8:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Ld2
            r2.a(r4)
            goto Ld5
        Ld2:
            r3.finish()
        Ld5:
            r3 = 10010(0x271a, float:1.4027E-41)
            r4 = 2000(0x7d0, float:2.803E-42)
            r2.a(r3, r4)
            r2.b()
            return
    }

    public final void a(java.lang.String r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadH5Url = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LoadingActivity "
            com.acse.ottn.h2.b(r1, r0)
            android.app.Activity r0 = r6.l     // Catch: java.lang.Throwable -> L8d
            int r1 = com.acse.ottn.R.id.dwebView     // Catch: java.lang.Throwable -> L8d
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L8d
            com.acse.ottn.widget.CustomWebView r0 = (com.acse.ottn.widget.CustomWebView) r0     // Catch: java.lang.Throwable -> L8d
            r6.f2300c = r0     // Catch: java.lang.Throwable -> L8d
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch: java.lang.Throwable -> L8d
            r1 = 100
            r0.setTextZoom(r1)     // Catch: java.lang.Throwable -> L8d
            r1 = 1
            r0.setJavaScriptEnabled(r1)     // Catch: java.lang.Throwable -> L8d
            r0.setDomStorageEnabled(r1)     // Catch: java.lang.Throwable -> L8d
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)     // Catch: java.lang.Throwable -> L8d
            android.webkit.WebSettings$PluginState r2 = android.webkit.WebSettings.PluginState.ON     // Catch: java.lang.Throwable -> L8d
            r0.setPluginState(r2)     // Catch: java.lang.Throwable -> L8d
            r0.setAllowFileAccess(r1)     // Catch: java.lang.Throwable -> L8d
            r0.setLoadWithOverviewMode(r1)     // Catch: java.lang.Throwable -> L8d
            r0.setUseWideViewPort(r1)     // Catch: java.lang.Throwable -> L8d
            r0.setSupportZoom(r1)     // Catch: java.lang.Throwable -> L8d
            r2 = 0
            r0.setMixedContentMode(r2)     // Catch: java.lang.Throwable -> L8d
            com.acse.ottn.e4$g r0 = new com.acse.ottn.e4$g     // Catch: java.lang.Throwable -> L8d
            r3 = 0
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> L8d
            r6.f2307j = r0     // Catch: java.lang.Throwable -> L8d
            com.acse.ottn.widget.CustomWebView r3 = r6.f2300c     // Catch: java.lang.Throwable -> L8d
            r3.setWebChromeClient(r0)     // Catch: java.lang.Throwable -> L8d
            com.acse.ottn.widget.CustomWebView r0 = r6.f2300c     // Catch: java.lang.Throwable -> L8d
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch: java.lang.Throwable -> L8d
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "setAllowUniversalAccessFromFileURLs"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L8d
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L8d
            r4[r2] = r5     // Catch: java.lang.Throwable -> L8d
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L7e
            com.acse.ottn.widget.CustomWebView r3 = r6.f2300c     // Catch: java.lang.Throwable -> L8d
            android.webkit.WebSettings r3 = r3.getSettings()     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8d
            r1[r2] = r4     // Catch: java.lang.Throwable -> L8d
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L8d
        L7e:
            com.acse.ottn.widget.CustomWebView r0 = r6.f2300c     // Catch: java.lang.Throwable -> L8d
            com.acse.ottn.e4$b r1 = new com.acse.ottn.e4$b     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            r0.setWebViewClient(r1)     // Catch: java.lang.Throwable -> L8d
            com.acse.ottn.widget.CustomWebView r0 = r6.f2300c     // Catch: java.lang.Throwable -> L8d
            r0.loadUrl(r7)     // Catch: java.lang.Throwable -> L8d
        L8d:
            return
    }

    public final void b() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.n
            if (r0 != 0) goto L24
            r0 = 0
            r1 = 3
            int[] r0 = new int[]{r0, r1}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r1 = 1000(0x3e8, double:4.94E-321)
            android.animation.ValueAnimator r0 = r0.setDuration(r1)
            r3.n = r0
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r3.n
            com.acse.ottn.e4$d r1 = new com.acse.ottn.e4$d
            r1.<init>(r3)
            r0.addUpdateListener(r1)
        L24:
            android.animation.ValueAnimator r0 = r3.n
            r0.start()
            return
    }

    public final void b(java.lang.String r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            com.acse.ottn.e4$c r1 = new com.acse.ottn.e4$c
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    public void c() {
            r3 = this;
            com.acse.ottn.q2 r0 = com.acse.ottn.q2.b()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "loading_comeback"
            r0.a(r1)     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r0 = r3.o     // Catch: java.lang.Throwable -> L1f
            r1 = 10010(0x271a, float:1.4027E-41)
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r0 = r3.o     // Catch: java.lang.Throwable -> L1f
            r1 = 10011(0x271b, float:1.4028E-41)
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r0 = r3.o     // Catch: java.lang.Throwable -> L1f
            r1 = 10012(0x271c, float:1.403E-41)
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBackPressed error e = "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "SeedingLoadingActivity"
            com.acse.ottn.h2.a(r1, r0)
            return
    }

    public final java.lang.Object d() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.e4 r0 = com.acse.ottn.e4.p
            return r0
    }

    public final void e() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "write code = "
            r0.append(r1)
            java.lang.String r1 = r3.m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SeedingLoadingActivity"
            com.acse.ottn.h2.a(r1, r0)
            com.acse.ottn.e4$h r0 = r3.f2308k
            if (r0 == 0) goto L23
            java.lang.String r1 = r3.m
            java.lang.String r2 = r3.f2304g
            r0.a(r1, r2)
        L23:
            return
    }
}
