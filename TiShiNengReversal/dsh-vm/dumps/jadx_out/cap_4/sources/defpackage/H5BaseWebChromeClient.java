package defpackage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class H5BaseWebChromeClient extends cn.bluemobi.dylan.smartwebview.SmartWebView.b {

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentActivity a;

    @org.jetbrains.annotations.NotNull
    private cn.bluemobi.dylan.smartwebview.SmartWebView b;

    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> c;

    @org.jetbrains.annotations.NotNull
    private final android.widget.FrameLayout.LayoutParams d;

    @org.jetbrains.annotations.Nullable
    private android.view.View e;

    @org.jetbrains.annotations.Nullable
    private android.widget.FrameLayout f;

    @org.jetbrains.annotations.Nullable
    private android.webkit.WebChromeClient.CustomViewCallback g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class FullscreenHolder extends android.widget.FrameLayout {
        public FullscreenHolder(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "ctx"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>(r2)
                android.content.res.Resources r2 = r2.getResources()
                r0 = 17170444(0x106000c, float:2.4611947E-38)
                int r2 = r2.getColor(r0)
                r1.setBackgroundColor(r2)
                return
        }

        @Override // android.view.View
        public boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r2) {
                r1 = this;
                java.lang.String r0 = "evt"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 1
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bxkj.base.v2.view.a.b {
        final /* synthetic */ defpackage.H5BaseWebChromeClient a;
        final /* synthetic */ java.lang.String b;

        a(defpackage.H5BaseWebChromeClient r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.v2.view.a.b
        public void onMenuClick(java.lang.String r3) {
                r2 = this;
                com.bxkj.base.v2.common.utils.d0 r3 = com.bxkj.base.v2.common.utils.d0.a
                H5BaseWebChromeClient r0 = r2.a
                androidx.fragment.app.FragmentActivity r0 = defpackage.H5BaseWebChromeClient.h(r0)
                java.lang.String r1 = r2.b
                r3.c(r0, r1)
                return
        }
    }

    public H5BaseWebChromeClient(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull cn.bluemobi.dylan.smartwebview.SmartWebView r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r4) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "smartWebView"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "onReceivedTitleCallback"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.r()
            r1.t()
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.d = r2
            return
    }

    public static /* synthetic */ kotlin.n1 a(android.webkit.ValueCallback r0, java.io.File r1) {
            kotlin.n1 r0 = q(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(android.webkit.ValueCallback r0, java.io.File r1) {
            kotlin.n1 r0 = n(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(android.webkit.ValueCallback r0, java.io.File r1) {
            kotlin.n1 r0 = o(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 d(android.webkit.ValueCallback r0, java.io.File r1) {
            kotlin.n1 r0 = m(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 e(android.webkit.ValueCallback r0, java.io.File r1) {
            kotlin.n1 r0 = p(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean f(defpackage.H5BaseWebChromeClient r0, android.view.View r1) {
            boolean r0 = u(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean g(defpackage.H5BaseWebChromeClient r0, android.view.View r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = s(r0, r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ androidx.fragment.app.FragmentActivity h(defpackage.H5BaseWebChromeClient r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.a
            return r0
    }

    private final void l() {
            r2 = this;
            android.view.View r0 = r2.e
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            r2.x(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.a
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.widget.FrameLayout r1 = r2.f
            r0.removeView(r1)
            r0 = 0
            r2.f = r0
            r2.e = r0
            android.webkit.WebChromeClient$CustomViewCallback r0 = r2.g
            if (r0 == 0) goto L2b
            r0.onCustomViewHidden()
        L2b:
            androidx.fragment.app.FragmentActivity r0 = r2.a
            r1 = -1
            r0.setRequestedOrientation(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.b
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    private static final kotlin.n1 m(android.webkit.ValueCallback r2, java.io.File r3) {
            if (r3 != 0) goto L7
            r3 = 0
            r2.onReceiveValue(r3)
            goto L19
        L7:
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            java.lang.String r0 = "fromFile(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r0 = 1
            android.net.Uri[] r0 = new android.net.Uri[r0]
            r1 = 0
            r0[r1] = r3
            r2.onReceiveValue(r0)
        L19:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 n(android.webkit.ValueCallback r2, java.io.File r3) {
            if (r3 != 0) goto L7
            r3 = 0
            r2.onReceiveValue(r3)
            goto L19
        L7:
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            java.lang.String r0 = "fromFile(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r0 = 1
            android.net.Uri[] r0 = new android.net.Uri[r0]
            r1 = 0
            r0[r1] = r3
            r2.onReceiveValue(r0)
        L19:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 o(android.webkit.ValueCallback r0, java.io.File r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.onReceiveValue(r1)
            goto Le
        L7:
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            r0.onReceiveValue(r1)
        Le:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 p(android.webkit.ValueCallback r0, java.io.File r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.onReceiveValue(r1)
            goto Le
        L7:
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            r0.onReceiveValue(r1)
        Le:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 q(android.webkit.ValueCallback r0, java.io.File r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.onReceiveValue(r1)
            goto Le
        L7:
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            r0.onReceiveValue(r1)
        Le:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private final void r() {
            r2 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.b
            g r1 = new g
            r1.<init>(r2)
            r0.setOnKeyListener(r1)
            return
    }

    private static final boolean s(defpackage.H5BaseWebChromeClient r0, android.view.View r1, int r2, android.view.KeyEvent r3) {
            r1 = 4
            if (r2 != r1) goto L2e
            int r1 = r3.getAction()
            r2 = 1
            if (r1 != r2) goto L2e
            android.view.View r1 = r0.e
            if (r1 == 0) goto L12
            r0.l()
            goto L2d
        L12:
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r0.b
            android.webkit.WebView r1 = r1.getWebView()
            boolean r1 = r1.canGoBack()
            if (r1 == 0) goto L28
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.b
            android.webkit.WebView r0 = r0.getWebView()
            r0.goBack()
            goto L2d
        L28:
            androidx.fragment.app.FragmentActivity r0 = r0.a
            r0.finish()
        L2d:
            return r2
        L2e:
            r0 = 0
            return r0
    }

    private static final boolean u(defpackage.H5BaseWebChromeClient r3, android.view.View r4) {
            java.lang.String r0 = "null cannot be cast to non-null type android.webkit.WebView"
            kotlin.jvm.internal.g0.n(r4, r0)
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            android.webkit.WebView$HitTestResult r4 = r4.getHitTestResult()
            java.lang.String r0 = "getHitTestResult(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            int r0 = r4.getType()
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L22
            int r0 = r4.getType()
            r1 = 8
            if (r0 != r1) goto L21
            goto L22
        L21:
            return r2
        L22:
            java.lang.String r4 = r4.getExtra()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "imageUrl="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r0, r1)
            r3.z(r4)
            r3 = 1
            return r3
    }

    private final void x(boolean r3) {
            r2 = this;
            r0 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L6
            r3 = 0
            goto L8
        L6:
            r3 = 1024(0x400, float:1.435E-42)
        L8:
            androidx.fragment.app.FragmentActivity r1 = r2.a
            android.view.Window r1 = r1.getWindow()
            r1.setFlags(r3, r0)
            return
    }

    private final void y(android.view.View r5, android.webkit.WebChromeClient.CustomViewCallback r6) {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.e     // Catch: java.lang.Exception -> Lb
            if (r1 == 0) goto Le
            if (r6 == 0) goto Ld
            r6.onCustomViewHidden()     // Catch: java.lang.Exception -> Lb
            return
        Lb:
            r5 = move-exception
            goto L3c
        Ld:
            return
        Le:
            androidx.fragment.app.FragmentActivity r1 = r4.a     // Catch: java.lang.Exception -> Lb
            android.view.Window r1 = r1.getWindow()     // Catch: java.lang.Exception -> Lb
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Exception -> Lb
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout"
            kotlin.jvm.internal.g0.n(r1, r2)     // Catch: java.lang.Exception -> Lb
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch: java.lang.Exception -> Lb
            H5BaseWebChromeClient$FullscreenHolder r2 = new H5BaseWebChromeClient$FullscreenHolder     // Catch: java.lang.Exception -> Lb
            androidx.fragment.app.FragmentActivity r3 = r4.a     // Catch: java.lang.Exception -> Lb
            r2.<init>(r3)     // Catch: java.lang.Exception -> Lb
            r4.f = r2     // Catch: java.lang.Exception -> Lb
            android.widget.FrameLayout$LayoutParams r3 = r4.d     // Catch: java.lang.Exception -> Lb
            r2.addView(r5, r3)     // Catch: java.lang.Exception -> Lb
            android.widget.FrameLayout r2 = r4.f     // Catch: java.lang.Exception -> Lb
            android.widget.FrameLayout$LayoutParams r3 = r4.d     // Catch: java.lang.Exception -> Lb
            r1.addView(r2, r3)     // Catch: java.lang.Exception -> Lb
            r4.e = r5     // Catch: java.lang.Exception -> Lb
            r4.x(r0)     // Catch: java.lang.Exception -> Lb
            r4.g = r6     // Catch: java.lang.Exception -> Lb
            return
        L3c:
            java.lang.String r5 = com.bxkj.base.v2.common.ext.e.a(r5)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.orhanobut.logger.j.e(r5, r6)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected final android.widget.FrameLayout.LayoutParams i() {
            r1 = this;
            android.widget.FrameLayout$LayoutParams r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> j() {
            r1 = this;
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final cn.bluemobi.dylan.smartwebview.SmartWebView k() {
            r1 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r1.b
            return r0
    }

    public void onHideCustomView() {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "关闭视频全屏-》onHideCustomView"
            com.orhanobut.logger.j.d(r1, r0)
            r2.l()
            return
    }

    public void onReceivedTitle(@org.jetbrains.annotations.NotNull android.webkit.WebView r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r4 = "title"
            kotlin.jvm.internal.g0.p(r5, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L28
            r4 = 2
            r0 = 0
            java.lang.String r1 = "http"
            r2 = 0
            boolean r4 = kotlin.text.u.H2(r5, r1, r2, r4, r0)
            if (r4 != 0) goto L28
            java.lang.String r4 = "网页无法打开"
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r4)
            if (r4 != 0) goto L28
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r4 = r3.c
            r4.invoke(r5)
        L28:
            return
    }

    public void onShowCustomView(@org.jetbrains.annotations.Nullable android.view.View r1, @org.jetbrains.annotations.Nullable android.webkit.WebChromeClient.CustomViewCallback r2) {
            r0 = this;
            r0.y(r1, r2)
            return
    }

    public boolean onShowFileChooser(@org.jetbrains.annotations.Nullable android.webkit.WebView r3, @org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri[]> r4, @org.jetbrains.annotations.Nullable android.webkit.WebChromeClient.FileChooserParams r5) {
            r2 = this;
            java.lang.String r3 = "filePathCallback"
            kotlin.jvm.internal.g0.p(r4, r3)
            r3 = 1
            if (r5 == 0) goto L1b
            boolean r5 = r5.isCaptureEnabled()
            if (r5 != r3) goto L1b
            com.bxkj.base.v2.common.utils.q r5 = com.bxkj.base.v2.common.utils.q.a
            androidx.fragment.app.FragmentActivity r0 = r2.a
            e r1 = new e
            r1.<init>(r4)
            r5.l(r0, r1)
            goto L27
        L1b:
            com.bxkj.base.v2.common.utils.q r5 = com.bxkj.base.v2.common.utils.q.a
            androidx.fragment.app.FragmentActivity r0 = r2.a
            f r1 = new f
            r1.<init>(r4)
            r5.u(r0, r1)
        L27:
            return r3
    }

    public final void openFileChooser(@org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri> r4) {
            r3 = this;
            java.lang.String r0 = "valueCallback"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bxkj.base.v2.common.utils.q r0 = com.bxkj.base.v2.common.utils.q.a
            androidx.fragment.app.FragmentActivity r1 = r3.a
            d r2 = new d
            r2.<init>(r4)
            r0.u(r1, r2)
            return
    }

    public final void openFileChooser(@org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            java.lang.String r4 = "valueCallback"
            kotlin.jvm.internal.g0.p(r3, r4)
            com.bxkj.base.v2.common.utils.q r4 = com.bxkj.base.v2.common.utils.q.a
            androidx.fragment.app.FragmentActivity r0 = r2.a
            h r1 = new h
            r1.<init>(r3)
            r4.u(r0, r1)
            return
    }

    public final void openFileChooser(@org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri> r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r1 = this;
            java.lang.String r3 = "valueCallback"
            kotlin.jvm.internal.g0.p(r2, r3)
            com.bxkj.base.v2.common.utils.q r3 = com.bxkj.base.v2.common.utils.q.a
            androidx.fragment.app.FragmentActivity r4 = r1.a
            b r0 = new b
            r0.<init>(r2)
            r3.u(r4, r0)
            return
    }

    public final void t() {
            r2 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.b
            android.webkit.WebView r0 = r0.getWebView()
            c r1 = new c
            r1.<init>(r2)
            r0.setOnLongClickListener(r1)
            return
    }

    public final void v(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public final void w(@org.jetbrains.annotations.NotNull cn.bluemobi.dylan.smartwebview.SmartWebView r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void z(@org.jetbrains.annotations.Nullable java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L2b
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            com.bxkj.base.v2.view.a r0 = new com.bxkj.base.v2.view.a
            androidx.fragment.app.FragmentActivity r1 = r3.a
            r0.<init>(r1)
            java.lang.String r1 = "请选择"
            r0.i(r1)
            java.lang.String r1 = "保存到相册"
            com.bxkj.base.v2.view.a r1 = r0.c(r1)
            H5BaseWebChromeClient$a r2 = new H5BaseWebChromeClient$a
            r2.<init>(r3, r4)
            r1.g(r2)
            java.lang.String r4 = "取消"
            r0.h(r4)
            r0.show()
        L2b:
            return
    }
}
