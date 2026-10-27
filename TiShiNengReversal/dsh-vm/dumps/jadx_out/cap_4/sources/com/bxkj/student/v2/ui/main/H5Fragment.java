package com.bxkj.student.v2.ui.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nH5Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 H5Fragment.kt\ncom/bxkj/student/v2/ui/main/H5Fragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class H5Fragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V2MainTabH5FragmentBinding, com.bxkj.student.v2.vm.MainViewModel> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends com.bxkj.student.v2.ui.h5.js.JS {
        final /* synthetic */ com.bxkj.student.v2.ui.main.H5Fragment k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView f1431l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.main.H5Fragment$initWebView$1$1$1$finish$1", f = "H5Fragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.bxkj.student.v2.ui.main.H5Fragment$a$a, reason: collision with other inner class name */
        static final class C0161a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView b;

            C0161a(cn.bluemobi.dylan.smartwebview.SmartWebView r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.main.H5Fragment.a.C0161a> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.student.v2.ui.main.H5Fragment$a$a r2 = new com.bxkj.student.v2.ui.main.H5Fragment$a$a
                    cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r1.b
                    r2.<init>(r0, r3)
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.main.H5Fragment$a$a r1 = (com.bxkj.student.v2.ui.main.H5Fragment.a.C0161a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L12
                    kotlin.g0.n(r2)
                    cn.bluemobi.dylan.smartwebview.SmartWebView r2 = r1.b
                    r2.l()
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L12:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        a(com.bxkj.student.v2.ui.main.H5Fragment r1, cn.bluemobi.dylan.smartwebview.SmartWebView r2, androidx.fragment.app.FragmentActivity r3, android.webkit.WebView r4) {
                r0 = this;
                r0.k = r1
                r0.f1431l = r2
                r0.<init>(r3, r4)
                return
        }

        @Override // com.bxkj.student.v2.ui.h5.js.JS
        @android.webkit.JavascriptInterface
        public void finish() {
                r7 = this;
                com.bxkj.student.v2.ui.main.H5Fragment r0 = r7.k
                androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
                kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.main.H5Fragment$a$a r4 = new com.bxkj.student.v2.ui.main.H5Fragment$a$a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r7.f1431l
                r3 = 0
                r4.<init>(r0, r3)
                r5 = 2
                r6 = 0
                kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    public H5Fragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void e() {
            r5 = this;
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2MainTabH5FragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabH5FragmentBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            com.bxkj.base.v2.h5.i r1 = new com.bxkj.base.v2.h5.i
            androidx.fragment.app.FragmentActivity r2 = r5.q()
            kotlin.jvm.internal.g0.m(r0)
            r1.<init>(r2, r0)
            r0.setWebViewClient(r1)
            a r1 = new a
            androidx.fragment.app.Fragment r2 = r5.p()
            r1.<init>(r2)
            r0.setWebChromeClient(r1)
            android.webkit.WebView r1 = r0.getWebView()
            android.webkit.WebSettings r2 = r1.getSettings()
            r3 = 1
            r2.setJavaScriptEnabled(r3)
            android.webkit.WebSettings r2 = r1.getSettings()
            r2.setJavaScriptCanOpenWindowsAutomatically(r3)
            android.webkit.WebSettings r2 = r1.getSettings()
            r4 = 0
            r2.setMixedContentMode(r4)
            android.webkit.WebSettings r2 = r1.getSettings()
            r2.setBlockNetworkImage(r4)
            android.webkit.WebSettings r2 = r1.getSettings()
            r2.setDomStorageEnabled(r3)
            androidx.fragment.app.FragmentActivity r2 = r5.q()
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.V2MainTabH5FragmentBinding r3 = (com.bxkj.student.databinding.V2MainTabH5FragmentBinding) r3
            cn.bluemobi.dylan.smartwebview.SmartWebView r3 = r3.smartWebView
            android.webkit.WebView r3 = r3.getWebView()
            com.bxkj.student.v2.ui.main.H5Fragment$a r4 = new com.bxkj.student.v2.ui.main.H5Fragment$a
            r4.<init>(r5, r0, r2, r3)
            java.lang.String r0 = "tsn"
            r1.addJavascriptInterface(r4, r0)
            return
    }

    public final void f() {
            r3 = this;
            boolean r0 = r3.b()
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r2.a()
            boolean r2 = r2.Y()
            if (r2 == 0) goto L19
            r1 = r0
        L19:
            if (r1 == 0) goto L2a
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.V2MainTabH5FragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabH5FragmentBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            android.webkit.WebView r0 = r0.getWebView()
            r0.reload()
        L2a:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r9 = this;
            r9.e()
            androidx.fragment.app.FragmentActivity r0 = r9.q()
            r9.d(r0)
            android.os.Bundle r0 = r9.getArguments()
            r1 = 0
            if (r0 == 0) goto L2e
            java.lang.String r2 = "title"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L2e
            androidx.databinding.ViewDataBinding r2 = r9.K()
            com.bxkj.student.databinding.V2MainTabH5FragmentBinding r2 = (com.bxkj.student.databinding.V2MainTabH5FragmentBinding) r2
            android.widget.TextView r2 = r2.tvTitle
            r2.setText(r0)
        L2e:
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L5f
            java.lang.String r2 = "isShowH5Title"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L5f
            java.lang.String r2 = "0"
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r0 = r1
        L50:
            if (r0 == 0) goto L5f
            androidx.databinding.ViewDataBinding r0 = r9.K()
            com.bxkj.student.databinding.V2MainTabH5FragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabH5FragmentBinding) r0
            android.widget.TextView r0 = r0.tvTitle
            r2 = 8
            r0.setVisibility(r2)
        L5f:
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto Lab
            java.lang.String r2 = "url"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L6e
            r1 = r0
        L6e:
            if (r1 == 0) goto Lab
            java.lang.String r3 = r1.getString(r2)
            if (r3 == 0) goto Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "H5Fragment：url="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            java.lang.String r5 = r0.J()
            r7 = 4
            r8 = 0
            java.lang.String r4 = "${school}"
            r6 = 0
            java.lang.String r0 = kotlin.text.u.x2(r3, r4, r5, r6, r7, r8)
            androidx.databinding.ViewDataBinding r1 = r9.K()
            com.bxkj.student.databinding.V2MainTabH5FragmentBinding r1 = (com.bxkj.student.databinding.V2MainTabH5FragmentBinding) r1
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r1.smartWebView
            r1.j(r0)
        Lab:
            return
    }
}
