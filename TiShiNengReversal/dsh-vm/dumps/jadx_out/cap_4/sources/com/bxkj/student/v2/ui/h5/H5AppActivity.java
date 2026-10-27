package com.bxkj.student.v2.ui.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nH5AppActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 H5AppActivity.kt\ncom/bxkj/student/v2/ui/h5/H5AppActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class H5AppActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV2H5AppBinding, com.bxkj.student.v2.vm.h5.H5VM> {

    @org.jetbrains.annotations.Nullable
    private java.lang.String W;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        a(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    public H5AppActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void M(android.webkit.WebView r3) {
            r2 = this;
            android.content.Context r0 = r2.G()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getWidth()
            r1 = 650(0x28a, float:9.11E-43)
            if (r0 <= r1) goto L23
            r0 = 190(0xbe, float:2.66E-43)
            r3.setInitialScale(r0)
            return
        L23:
            r1 = 520(0x208, float:7.29E-43)
            if (r0 <= r1) goto L2d
            r0 = 160(0xa0, float:2.24E-43)
            r3.setInitialScale(r0)
            return
        L2d:
            r1 = 450(0x1c2, float:6.3E-43)
            if (r0 <= r1) goto L37
            r0 = 140(0x8c, float:1.96E-43)
            r3.setInitialScale(r0)
            return
        L37:
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 <= r1) goto L41
            r0 = 120(0x78, float:1.68E-43)
            r3.setInitialScale(r0)
            return
        L41:
            r0 = 100
            r3.setInitialScale(r0)
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.h5.H5AppActivity r0, java.lang.String r1) {
            kotlin.n1 r0 = g(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.h5.H5AppActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = h(r0, r1)
            return r0
    }

    private static final kotlin.n1 g(com.bxkj.student.v2.ui.h5.H5AppActivity r1, java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.databinding.ViewDataBinding r1 = r1.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r1 = (com.bxkj.student.databinding.AcV2H5AppBinding) r1
            r1.setTitle(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 h(com.bxkj.student.v2.ui.h5.H5AppActivity r0, java.util.Map r1) {
            java.lang.String r1 = r0.W
            if (r1 == 0) goto Lf
            androidx.databinding.ViewDataBinding r0 = r0.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r0 = (com.bxkj.student.databinding.AcV2H5AppBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            r0.j(r1)
        Lf:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public final void L() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r0 = (com.bxkj.student.databinding.AcV2H5AppBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            r0.l()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.h5.H5VM r0 = (com.bxkj.student.v2.vm.h5.H5VM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.D()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.h5.b r2 = new com.bxkj.student.v2.ui.h5.b
            r2.<init>(r4)
            com.bxkj.student.v2.ui.h5.H5AppActivity$a r3 = new com.bxkj.student.v2.ui.h5.H5AppActivity$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    protected void onActivityResult(int r2, int r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r1)
            r0.onActivityResult(r2, r3, r4)
            return
    }

    @Override // com.bxkj.base.v2.common.view.b
    public void onBackPressed() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r0 = (com.bxkj.student.databinding.AcV2H5AppBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            android.webkit.WebView r0 = r0.getWebView()
            boolean r0 = r0.canGoBack()
            if (r0 == 0) goto L22
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r0 = (com.bxkj.student.databinding.AcV2H5AppBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            android.webkit.WebView r0 = r0.getWebView()
            r0.goBack()
            return
        L22:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "needUpdatePasswordStatus"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L40
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = "1"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 != 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    protected void onNewIntent(@org.jetbrains.annotations.Nullable android.content.Intent r1) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onNewIntent(r1)
            r0.s()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r6 = this;
            androidx.databinding.ViewDataBinding r0 = r6.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r0 = (com.bxkj.student.databinding.AcV2H5AppBinding) r0
            r0.setMActivity(r6)
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1e
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            goto L20
        L1e:
            java.lang.String r0 = "首页"
        L20:
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r2 = "url"
            boolean r1 = r1.hasExtra(r2)
            java.lang.String r3 = ""
            if (r1 == 0) goto L3b
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 != 0) goto L39
            r1 = r3
        L39:
            r6.W = r1
        L3b:
            java.lang.String r1 = r6.W
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "smartWebView.intentUrl="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r1, r4)
            androidx.databinding.ViewDataBinding r1 = r6.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r1 = (com.bxkj.student.databinding.AcV2H5AppBinding) r1
            r1.setTitle(r0)
            androidx.databinding.ViewDataBinding r0 = r6.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r0 = (com.bxkj.student.databinding.AcV2H5AppBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            com.bxkj.base.v2.h5.i r1 = new com.bxkj.base.v2.h5.i
            androidx.fragment.app.FragmentActivity r4 = r6.q()
            kotlin.jvm.internal.g0.m(r0)
            r1.<init>(r4, r0)
            r0.setWebViewClient(r1)
            H5BaseWebChromeClient r1 = new H5BaseWebChromeClient
            androidx.fragment.app.FragmentActivity r4 = r6.q()
            com.bxkj.student.v2.ui.h5.a r5 = new com.bxkj.student.v2.ui.h5.a
            r5.<init>(r6)
            r1.<init>(r4, r0, r5)
            r0.setWebChromeClient(r1)
            android.webkit.WebView r0 = r0.getWebView()
            r6.M(r0)
            android.webkit.WebSettings r1 = r0.getSettings()
            r4 = 1
            r1.setUseWideViewPort(r4)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setJavaScriptEnabled(r4)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setJavaScriptCanOpenWindowsAutomatically(r4)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setMixedContentMode(r2)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setBlockNetworkImage(r2)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setDomStorageEnabled(r4)
            com.bxkj.student.v2.ui.h5.js.JS r1 = new com.bxkj.student.v2.ui.h5.js.JS
            androidx.fragment.app.FragmentActivity r2 = r6.q()
            androidx.databinding.ViewDataBinding r4 = r6.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r4 = (com.bxkj.student.databinding.AcV2H5AppBinding) r4
            cn.bluemobi.dylan.smartwebview.SmartWebView r4 = r4.smartWebView
            android.webkit.WebView r4 = r4.getWebView()
            r1.<init>(r2, r4)
            java.lang.String r2 = "tsn"
            r0.addJavascriptInterface(r1, r2)
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "username"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L115
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            android.content.Intent r4 = r6.getIntent()
            java.lang.String r1 = r4.getStringExtra(r1)
            if (r1 != 0) goto Lee
            goto Lef
        Lee:
            r3 = r1
        Lef:
            r2.W0(r3)
            java.lang.String r1 = r6.W
            if (r1 == 0) goto L124
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "school"
            java.lang.String r1 = r1.getQueryParameter(r2)
            com.bxkj.base.v2.data.b r0 = r0.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.M0(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r6.C()
            com.bxkj.student.v2.vm.h5.H5VM r0 = (com.bxkj.student.v2.vm.h5.H5VM) r0
            r0.X()
            return
        L115:
            java.lang.String r0 = r6.W
            if (r0 == 0) goto L124
            androidx.databinding.ViewDataBinding r1 = r6.K()
            com.bxkj.student.databinding.AcV2H5AppBinding r1 = (com.bxkj.student.databinding.AcV2H5AppBinding) r1
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r1.smartWebView
            r1.j(r0)
        L124:
            return
    }
}
