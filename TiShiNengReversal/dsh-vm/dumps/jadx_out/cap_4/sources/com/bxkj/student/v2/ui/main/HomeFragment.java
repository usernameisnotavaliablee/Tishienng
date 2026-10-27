package com.bxkj.student.v2.ui.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/bxkj/student/v2/ui/main/HomeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n1#2:216\n1563#3:217\n1634#3,3:218\n774#3:221\n865#3,2:222\n1869#3,2:224\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/bxkj/student/v2/ui/main/HomeFragment\n*L\n62#1:217\n62#1:218,3\n167#1:221\n167#1:222,2\n167#1:224,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class HomeFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V2MainTabHomeFragmentBinding, com.bxkj.student.v2.vm.MainViewModel> {

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1432l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForHomeMenuBinding> f1433m;

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

    public HomeFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1432l = r0
            return
    }

    private static final kotlin.n1 L(com.bxkj.student.v2.ui.main.HomeFragment r5, java.util.List r6) {
            kotlin.jvm.internal.g0.m(r6)
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "imageHttpUrl"
            java.lang.String r2 = r3.t(r2, r4)
            r1.add(r2)
            goto L15
        L2d:
            int r0 = r6.size()
            r2 = 1
            if (r0 > r2) goto L40
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r0
            com.bxkj.base.v2.common.view.CycleViewPager r0 = r0.cpAd
            r2 = 0
            r0.setWheel(r2)
        L40:
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r0
            com.bxkj.base.v2.common.view.CycleViewPager r0 = r0.cpAd
            com.bxkj.student.v2.ui.main.h r2 = new com.bxkj.student.v2.ui.main.h
            r2.<init>(r5, r6)
            r0.w(r1, r2)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private static final void M(com.bxkj.student.v2.ui.main.HomeFragment r9, java.util.List r10, java.lang.String r11, int r12, android.view.View r13) {
            com.bxkj.base.v2.base.BaseViewModel r11 = r9.C()
            com.bxkj.student.v2.vm.MainViewModel r11 = (com.bxkj.student.v2.vm.MainViewModel) r11
            com.bxkj.base.v2.common.utils.x r13 = com.bxkj.base.v2.common.utils.x.a
            java.lang.Object r0 = r10.get(r12)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "id"
            java.lang.String r0 = r13.t(r0, r1)
            r11.F(r0)
            java.lang.Object r11 = r10.get(r12)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r0 = "bannerType"
            java.lang.String r11 = r13.t(r11, r0)
            int r0 = r11.hashCode()
            java.lang.String r2 = "articleTitle"
            java.lang.String r3 = "name"
            r4 = 0
            java.lang.String r5 = "jdPath"
            r6 = 268435456(0x10000000, float:2.524355E-29)
            java.lang.String r7 = "android.intent.action.VIEW"
            java.lang.String r8 = "linkUrl"
            switch(r0) {
                case 49: goto L14d;
                case 50: goto L10f;
                case 51: goto Laa;
                case 52: goto L39;
                default: goto L37;
            }
        L37:
            goto L155
        L39:
            java.lang.String r0 = "4"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L43
            goto L155
        L43:
            java.lang.Object r10 = r10.get(r12)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r10 = r13.t(r10, r5)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "taobao://item.taobao.com/item.htm?id="
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "https://item.taobao.com/item.htm?id="
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            android.content.Intent r12 = new android.content.Intent     // Catch: java.lang.Exception -> L87
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> L87
            r12.<init>(r7, r11)     // Catch: java.lang.Exception -> L87
            r12.setFlags(r6)     // Catch: java.lang.Exception -> L87
            android.content.Context r11 = r9.getContext()     // Catch: java.lang.Exception -> L87
            if (r11 == 0) goto L89
            r11.startActivity(r12)     // Catch: java.lang.Exception -> L87
            kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Exception -> L87
            return
        L87:
            r11 = move-exception
            goto L8a
        L89:
            return
        L8a:
            com.bxkj.base.v2.common.ext.e.c(r11)
            android.content.Intent r11 = new android.content.Intent     // Catch: java.lang.Exception -> La6
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> La6
            r11.<init>(r7, r10)     // Catch: java.lang.Exception -> La6
            r11.setFlags(r6)     // Catch: java.lang.Exception -> La6
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Exception -> La6
            if (r9 == 0) goto L1d0
            r9.startActivity(r11)     // Catch: java.lang.Exception -> La6
            kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Exception -> La6
            goto L1d0
        La6:
            kotlin.n1 r9 = kotlin.n1.a
            goto L1d0
        Laa:
            java.lang.String r0 = "3"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto Lb4
            goto L155
        Lb4:
            java.lang.Object r11 = r10.get(r12)     // Catch: java.lang.Exception -> Le6
            java.util.Map r11 = (java.util.Map) r11     // Catch: java.lang.Exception -> Le6
            java.lang.String r11 = r13.t(r11, r5)     // Catch: java.lang.Exception -> Le6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le6
            r13.<init>()     // Catch: java.lang.Exception -> Le6
            java.lang.String r0 = "openApp.jdMobile://virtual?params={\"category\":\"jump\",\"des\":\"productDetail\",\"skuId\":\""
            r13.append(r0)     // Catch: java.lang.Exception -> Le6
            r13.append(r11)     // Catch: java.lang.Exception -> Le6
            java.lang.String r11 = "\",\"sourceType\":\"JSHOP_SOURCE_TYPE\",\"sourceValue\":\"JSHOP_SOURCE_VALUE\"}"
            r13.append(r11)     // Catch: java.lang.Exception -> Le6
            java.lang.String r11 = r13.toString()     // Catch: java.lang.Exception -> Le6
            android.content.Intent r13 = new android.content.Intent     // Catch: java.lang.Exception -> Le6
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> Le6
            r13.<init>(r7, r11)     // Catch: java.lang.Exception -> Le6
            r13.addFlags(r6)     // Catch: java.lang.Exception -> Le6
            r9.startActivity(r13)     // Catch: java.lang.Exception -> Le6
            kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Exception -> Le6
            return
        Le6:
            com.bxkj.base.v2.common.utils.x r11 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L10b
            java.lang.Object r10 = r10.get(r12)     // Catch: java.lang.Exception -> L10b
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Exception -> L10b
            java.lang.String r10 = r11.t(r10, r8)     // Catch: java.lang.Exception -> L10b
            android.content.Intent r11 = new android.content.Intent     // Catch: java.lang.Exception -> L10b
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> L10b
            r11.<init>(r7, r10)     // Catch: java.lang.Exception -> L10b
            r11.setFlags(r6)     // Catch: java.lang.Exception -> L10b
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Exception -> L10b
            if (r9 == 0) goto L1d0
            r9.startActivity(r11)     // Catch: java.lang.Exception -> L10b
            kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Exception -> L10b
            goto L1d0
        L10b:
            kotlin.n1 r9 = kotlin.n1.a
            goto L1d0
        L10f:
            java.lang.String r0 = "2"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L118
            goto L155
        L118:
            java.lang.Object r11 = r10.get(r12)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r0 = "appletId"
            java.lang.String r11 = r13.t(r11, r0)
            com.bxkj.base.v2.base.BaseViewModel r0 = r9.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            java.lang.Object r2 = r10.get(r12)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = r13.t(r2, r1)
            r0.F(r1)
            java.lang.Object r10 = r10.get(r12)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r12 = "appletPath"
            java.lang.String r10 = r13.t(r10, r12)
            com.bxkj.student.v2.common.utils.v$a r12 = com.bxkj.student.v2.common.utils.v.a
            android.content.Context r9 = r9.G()
            r12.a(r9, r11, r10)
            return
        L14d:
            java.lang.String r0 = "1"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L193
        L155:
            java.lang.Object r11 = r10.get(r12)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r11 = r13.t(r11, r8)
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L166
            r4 = r9
        L166:
            if (r4 == 0) goto L1d0
            com.bxkj.student.v2.common.utils.h r11 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r9 = r9.q()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = r10.get(r12)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r1 = r13.t(r1, r2)
            r0.put(r3, r1)
            java.lang.Object r10 = r10.get(r12)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r10 = r13.t(r10, r8)
            r0.put(r8, r10)
            kotlin.n1 r10 = kotlin.n1.a
            r11.b(r9, r0)
            return
        L193:
            java.lang.Object r11 = r10.get(r12)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r11 = r13.t(r11, r8)
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L1a4
            r4 = r9
        L1a4:
            if (r4 == 0) goto L1d0
            com.bxkj.student.v2.common.utils.h r11 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r9 = r9.q()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = r10.get(r12)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r1 = r13.t(r1, r2)
            r0.put(r3, r1)
            java.lang.Object r10 = r10.get(r12)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r10 = r13.t(r10, r8)
            r0.put(r8, r10)
            kotlin.n1 r10 = kotlin.n1.a
            r11.b(r9, r0)
        L1d0:
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.main.HomeFragment r0, java.util.List r1) {
            kotlin.n1 r0 = l(r0, r1)
            return r0
    }

    public static /* synthetic */ void f(com.bxkj.student.v2.ui.main.HomeFragment r0, java.util.List r1, java.lang.String r2, int r3, android.view.View r4) {
            M(r0, r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.main.HomeFragment r0, java.lang.String r1) {
            kotlin.n1 r0 = m(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.main.HomeFragment r0, java.util.List r1) {
            kotlin.n1 r0 = L(r0, r1)
            return r0
    }

    private final void k() {
            r4 = this;
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            com.bxkj.base.v2.h5.i r1 = new com.bxkj.base.v2.h5.i
            androidx.fragment.app.FragmentActivity r2 = r4.q()
            kotlin.jvm.internal.g0.m(r0)
            r1.<init>(r2, r0)
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r0.getWebView()
            android.webkit.WebSettings r1 = r0.getSettings()
            r2 = 1
            r1.setJavaScriptEnabled(r2)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setJavaScriptCanOpenWindowsAutomatically(r2)
            android.webkit.WebSettings r1 = r0.getSettings()
            r3 = 0
            r1.setMixedContentMode(r3)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setBlockNetworkImage(r3)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setDomStorageEnabled(r2)
            com.bxkj.student.v2.ui.h5.js.JS r1 = new com.bxkj.student.v2.ui.h5.js.JS
            androidx.fragment.app.FragmentActivity r2 = r4.q()
            androidx.databinding.ViewDataBinding r3 = r4.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r3 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r3
            cn.bluemobi.dylan.smartwebview.SmartWebView r3 = r3.smartWebView
            android.webkit.WebView r3 = r3.getWebView()
            r1.<init>(r2, r3)
            java.lang.String r2 = "tsn"
            r0.addJavascriptInterface(r1, r2)
            return
    }

    private static final kotlin.n1 l(com.bxkj.student.v2.ui.main.HomeFragment r5, java.util.List r6) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r5.f1432l
            r0.clear()
            if (r6 == 0) goto L49
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r6.next()
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "isShow"
            java.lang.String r2 = r3.t(r2, r4)
            java.lang.String r3 = "1"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L12
            r0.add(r1)
            goto L12
        L33:
            java.util.Iterator r6 = r0.iterator()
        L37:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r6.next()
            java.util.Map r0 = (java.util.Map) r0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r5.f1432l
            r1.add(r0)
            goto L37
        L49:
            com.bxkj.base.v2.data.b$a r6 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r6 = r6.a()
            com.bxkj.base.v2.data.UserType r6 = r6.T()
            com.bxkj.base.v2.data.UserType r0 = com.bxkj.base.v2.data.UserType.STUDENT
            if (r6 != r0) goto L59
            r6 = r5
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r6 == 0) goto L91
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r0 = "name"
            java.lang.String r1 = "更多"
            r6.put(r0, r1)
            r0 = 2131690172(0x7f0f02bc, float:1.900938E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "icon"
            r6.put(r1, r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "isEnabled"
            r6.put(r1, r0)
            java.lang.String r0 = "isLogin"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.put(r0, r1)
            java.lang.String r0 = "mkey"
            java.lang.String r1 = "app_home_menu_more"
            r6.put(r0, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r5.f1432l
            r0.add(r6)
        L91:
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForHomeMenuBinding> r5 = r5.f1433m
            if (r5 == 0) goto L98
            r5.notifyDataSetChanged()
        L98:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private static final kotlin.n1 m(com.bxkj.student.v2.ui.main.HomeFragment r2, java.lang.String r3) {
            com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
            kotlin.jvm.internal.g0.m(r3)
            java.lang.String r3 = r0.a(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "加载首页咨询地址："
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.smartWebView
            java.lang.String r1 = "about:blank"
            r0.j(r1)
            androidx.databinding.ViewDataBinding r2 = r2.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r2 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r2
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = r2.smartWebView
            r2.j(r3)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    public final void N() {
            r4 = this;
            boolean r0 = r4.b()
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r4
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L21
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.f1432l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L15
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L21
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.S()
        L21:
            boolean r0 = r4.b()
            if (r0 == 0) goto L29
            r0 = r4
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L51
            com.bxkj.base.v2.base.BaseViewModel r2 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r2 = (com.bxkj.student.v2.vm.MainViewModel) r2
            androidx.lifecycle.MutableLiveData r2 = r2.N()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L46
            boolean r2 = r2.isEmpty()
            r3 = 1
            if (r2 != r3) goto L46
            r1 = r0
        L46:
            if (r1 == 0) goto L51
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.M()
        L51:
            return
    }

    public final void O(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForHomeMenuBinding> r1) {
            r0 = this;
            r0.f1433m = r1
            return
    }

    public final void P(@org.jetbrains.annotations.NotNull java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f1432l = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForHomeMenuBinding> i() {
            r1 = this;
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForHomeMenuBinding> r0 = r1.f1433m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> j() {
            r1 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.f1432l
            return r0
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.N()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.main.e r2 = new com.bxkj.student.v2.ui.main.e
            r2.<init>(r4)
            com.bxkj.student.v2.ui.main.HomeFragment$a r3 = new com.bxkj.student.v2.ui.main.HomeFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.T()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.main.f r2 = new com.bxkj.student.v2.ui.main.f
            r2.<init>(r4)
            com.bxkj.student.v2.ui.main.HomeFragment$a r3 = new com.bxkj.student.v2.ui.main.HomeFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.U()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.main.g r2 = new com.bxkj.student.v2.ui.main.g
            r2.<init>(r4)
            com.bxkj.student.v2.ui.main.HomeFragment$a r3 = new com.bxkj.student.v2.ui.main.HomeFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r3 = this;
            androidx.fragment.app.FragmentActivity r0 = r3.q()
            r3.d(r0)
            r3.k()
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.M()
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r0
            com.bxkj.base.v2.common.view.CycleViewPager r0 = r0.cpAd
            r1 = 2131231939(0x7f0804c3, float:1.8079973E38)
            r2 = 2131231938(0x7f0804c2, float:1.8079971E38)
            r0.B(r1, r2)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r0
            com.bxkj.base.v2.common.view.CycleViewPager r0 = r0.cpAd
            r1 = 8000(0x1f40, float:1.121E-41)
            r0.setDelay(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.f1432l
            com.bxkj.student.v2.ui.main.HomeFragment$initUiData$1 r1 = new com.bxkj.student.v2.ui.main.HomeFragment$initUiData$1
            r1.<init>(r3, r0)
            r3.f1433m = r1
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.V2MainTabHomeFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabHomeFragmentBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.rvMenu
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForHomeMenuBinding> r1 = r3.f1433m
            r0.setAdapter(r1)
            return
    }
}
