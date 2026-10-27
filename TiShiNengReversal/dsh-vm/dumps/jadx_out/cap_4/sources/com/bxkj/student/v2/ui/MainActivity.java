package com.bxkj.student.v2.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/bxkj/student/v2/ui/MainActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,425:1\n1#2:426\n216#3,2:427\n1878#4,3:429\n360#4,7:432\n774#4:439\n865#4,2:440\n785#4:442\n796#4:443\n1878#4,2:444\n797#4,2:446\n1880#4:448\n799#4:449\n1878#4,3:450\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/bxkj/student/v2/ui/MainActivity\n*L\n102#1:427,2\n306#1:429,3\n397#1:432,7\n188#1:439\n188#1:440,2\n189#1:442\n189#1:443\n189#1:444,2\n189#1:446,2\n189#1:448\n189#1:449\n190#1:450,3\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MainActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V2MainBinding, com.bxkj.student.v2.vm.MainViewModel> {
    private boolean F0;
    private long G0;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.main.HomeFragment W;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.main.ClassifyFragment X;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.main.MyFragment Y;

    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, com.bxkj.student.v2.ui.main.H5Fragment> Z;

    @org.jetbrains.annotations.Nullable
    private androidx.fragment.app.Fragment a0;

    @org.jetbrains.annotations.NotNull
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final com.bxkj.student.v2.ui.MainActivity$refreshTokenBroadCastReceiver$1 f1417k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f1418p0;

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

    static {
            r0 = 17779(0x4573, float:2.4914E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public MainActivity() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.Z = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            com.bxkj.student.v2.ui.MainActivity$refreshTokenBroadCastReceiver$1 r0 = new com.bxkj.student.v2.ui.MainActivity$refreshTokenBroadCastReceiver$1
            r0.<init>(r1)
            r1.f1417k0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 L(com.bxkj.student.v2.ui.MainActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = f0(r0, r1)
            return r0
    }

    public static /* synthetic */ void M(com.bxkj.student.v2.ui.MainActivity r0) {
            k0(r0)
            return
    }

    public static /* synthetic */ kotlin.n1 N(com.bxkj.base.v2.base.p r0, com.bxkj.student.v2.ui.MainActivity r1, java.util.Map r2) {
            kotlin.n1 r0 = T(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void O(com.bxkj.student.v2.ui.MainActivity r0, android.view.View r1) {
            W(r0, r1)
            return
    }

    public static final /* synthetic */ java.util.Map P(com.bxkj.student.v2.ui.MainActivity r0) {
            java.util.Map<java.lang.String, com.bxkj.student.v2.ui.main.H5Fragment> r0 = r0.Z
            return r0
    }

    private final void Q() {
            r10 = this;
            android.content.Context r0 = r10.G()
            boolean r0 = com.bxkj.base.util.u.a(r0)
            if (r0 != 0) goto L21
            android.content.Context r1 = r10.G()
            com.bxkj.student.v2.ui.r r4 = new com.bxkj.student.v2.ui.r
            r4.<init>(r10)
            r8 = 9
            r9 = 0
            r2 = 0
            java.lang.String r3 = "为了能够让你不错过重要的通知消息,强烈建议你开启允许推送通知功能"
            r5 = 0
            java.lang.String r6 = "不了"
            java.lang.String r7 = "去开启"
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L21:
            return
    }

    private static final kotlin.n1 R(com.bxkj.student.v2.ui.MainActivity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.fragment.app.FragmentActivity r1 = r1.q()
            com.bxkj.base.util.u.b(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void S() {
            r3 = this;
            r0 = 1
            r3.F0 = r0
            com.bxkj.base.v2.base.p r0 = new com.bxkj.base.v2.base.p
            android.content.Context r1 = r3.G()
            r0.<init>(r1)
            android.app.Dialog r1 = r0.h()
            r2 = 0
            r1.setCancelable(r2)
            r1.setCanceledOnTouchOutside(r2)
            com.bxkj.base.v2.base.BaseViewModel r1 = r3.C()
            com.bxkj.student.v2.vm.MainViewModel r1 = (com.bxkj.student.v2.vm.MainViewModel) r1
            com.bxkj.student.v2.ui.m r2 = new com.bxkj.student.v2.ui.m
            r2.<init>(r0, r3)
            r1.f0(r2)
            return
    }

    private static final kotlin.n1 T(com.bxkj.base.v2.base.p r4, com.bxkj.student.v2.ui.MainActivity r5, java.util.Map r6) {
            r4.b()
            java.lang.String r4 = "versions"
            int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r4)
            java.lang.String r0 = "versionsName"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            java.lang.String r1 = "instruction"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            java.lang.String r2 = "filePath"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            b0.b r2 = b0.b.a
            android.content.Context r3 = r5.G()
            int r2 = r2.m(r3)
            if (r4 <= r2) goto L33
            com.bxkj.student.common.versionupdate.a r2 = new com.bxkj.student.common.versionupdate.a
            android.content.Context r3 = r5.G()
            r2.<init>(r3)
            r2.d(r0, r6, r1)
        L33:
            if (r4 <= 0) goto L37
            r4 = 1
            goto L38
        L37:
            r4 = 0
        L38:
            r5.F0 = r4
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    private static final void W(com.bxkj.student.v2.ui.MainActivity r0, android.view.View r1) {
            r0.finish()
            return
    }

    private static final void X(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0, android.view.View r1) {
            r0.dismiss()
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            r1 = 1
            r0.n0(r1)
            return
    }

    private final void Y(int r8) {
            r7 = this;
            r7.f1418p0 = r8
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r7.b0
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.b0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L24
            kotlin.collections.f0.b0()
        L24:
            java.util.Map r3 = (java.util.Map) r3
            if (r8 != r2) goto L33
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r6 = "iconS"
            java.lang.String r3 = r5.t(r3, r6)
            r0[r2] = r3
            goto L3d
        L33:
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r6 = "icon"
            java.lang.String r3 = r5.t(r3, r6)
            r0[r2] = r3
        L3d:
            r2 = r4
            goto L13
        L3f:
            androidx.databinding.ViewDataBinding r8 = r7.K()
            com.bxkj.student.databinding.V2MainBinding r8 = (com.bxkj.student.databinding.V2MainBinding) r8
            com.google.android.material.bottomnavigation.BottomNavigationView r8 = r8.navView
            com.bxkj.student.v2.common.utils.d.a(r8, r0)
            return
    }

    private final void Z(android.content.Intent r5) {
            r4 = this;
            if (r5 == 0) goto L23
            java.lang.String r0 = "LoginSuccess"
            boolean r1 = r5.hasExtra(r0)
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r5
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L23
            r3 = 0
            boolean r5 = r5.getBooleanExtra(r0, r3)
            if (r5 == 0) goto L18
            r2 = r1
        L18:
            if (r2 == 0) goto L23
            com.bxkj.base.v2.base.BaseViewModel r5 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r5 = (com.bxkj.student.v2.vm.MainViewModel) r5
            r5.h0()
        L23:
            return
    }

    private static final kotlin.n1 a0(com.bxkj.student.v2.ui.MainActivity r0, java.lang.Boolean r1) {
            androidx.databinding.ViewDataBinding r0 = r0.K()
            com.bxkj.student.databinding.V2MainBinding r0 = (com.bxkj.student.databinding.V2MainBinding) r0
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r0.navView
            r1 = 0
            r0.setSelectedItemId(r1)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 b0(com.bxkj.student.v2.ui.MainActivity r1, java.lang.Boolean r2) {
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1e
            java.lang.String r2 = "暂未开通该APP使用权限，请联系管理员"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r1, r2)
            r0 = 0
            r2.setCancelable(r0)
            r2.setCanceledOnTouchOutside(r0)
            r2.setClickAutoCancel(r0)
            com.bxkj.student.v2.ui.t r0 = new com.bxkj.student.v2.ui.t
            r0.<init>(r1)
            r2.setButtonOnClickListener(r0)
        L1e:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final void c0(com.bxkj.student.v2.ui.MainActivity r3, android.view.View r4) {
            com.bxkj.base.v2.data.b$a r4 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r4.a()
            r1 = 0
            r0.t0(r1)
            com.bxkj.base.v2.data.b r0 = r4.a()
            r0.u0(r1)
            com.bxkj.base.v2.data.b r0 = r4.a()
            r0.v0(r1)
            com.bxkj.base.v2.data.b r0 = r4.a()
            r0.d()
            com.bxkj.base.v2.data.b r4 = r4.a()
            java.lang.String r0 = "1"
            r4.k0(r0)
            android.content.Context r4 = r3.G()
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.LoginActivity> r2 = com.bxkj.student.v2.ui.LoginActivity.class
            r0.<init>(r1, r2)
            r4.startActivity(r0)
            r3.finish()
            return
    }

    private static final kotlin.n1 d0(com.bxkj.student.v2.ui.MainActivity r5, java.util.Map r6) {
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "updateStatus"
            java.lang.String r1 = r0.t(r6, r1)
            java.lang.String r2 = "1"
            boolean r3 = kotlin.jvm.internal.g0.g(r1, r2)
            java.lang.String r4 = "name"
            if (r3 == 0) goto L37
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            r2 = 0
            r0.z0(r2)
            kotlin.jvm.internal.g0.m(r6)
            java.util.Map r6 = kotlin.collections.i1.J0(r6)
            java.lang.String r0 = "needUpdatePasswordStatus"
            r6.put(r0, r1)
            java.lang.String r0 = "修改密码"
            r6.put(r4, r0)
            com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
            android.content.Context r5 = r5.G()
            r0.b(r5, r6)
            goto L72
        L37:
            java.lang.String r1 = "openPhoneLogin"
            java.lang.String r1 = r0.t(r6, r1)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L72
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            boolean r1 = r1.P()
            if (r1 == 0) goto L52
            kotlin.n1 r5 = kotlin.n1.a
            return r5
        L52:
            com.bxkj.student.v2.common.utils.h r1 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r5 = r5.q()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = "绑定手机号"
            r2.put(r4, r3)
            java.lang.String r3 = "changePhoneUrl"
            java.lang.String r6 = r0.t(r6, r3)
            java.lang.String r0 = "linkUrl"
            r2.put(r0, r6)
            kotlin.n1 r6 = kotlin.n1.a
            r1.b(r5, r2)
        L72:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    public static /* synthetic */ boolean e(com.bxkj.student.v2.ui.MainActivity r0, android.view.MenuItem r1) {
            boolean r0 = i0(r0, r1)
            return r0
    }

    private static final kotlin.n1 e0(com.bxkj.student.v2.ui.MainActivity r7, java.util.List r8) {
            androidx.databinding.ViewDataBinding r0 = r7.K()
            com.bxkj.student.databinding.V2MainBinding r0 = (com.bxkj.student.databinding.V2MainBinding) r0
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r0.navView
            android.view.Menu r0 = r0.getMenu()
            r0.clear()
            kotlin.jvm.internal.g0.m(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r8.next()
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "isShow"
            java.lang.String r2 = r3.t(r2, r4)
            java.lang.String r3 = "1"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L1d
            r0.add(r1)
            goto L1d
        L3e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L49:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L5a
            kotlin.collections.f0.b0()
        L5a:
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5
            r5 = 5
            if (r2 >= r5) goto L63
            r8.add(r3)
        L63:
            r2 = r4
            goto L49
        L65:
            java.util.List r8 = kotlin.collections.f0.d6(r8)
            r7.b0 = r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L72:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r8.next()
            int r3 = r0 + 1
            if (r0 >= 0) goto L83
            kotlin.collections.f0.b0()
        L83:
            java.util.Map r2 = (java.util.Map) r2
            androidx.databinding.ViewDataBinding r4 = r7.K()
            com.bxkj.student.databinding.V2MainBinding r4 = (com.bxkj.student.databinding.V2MainBinding) r4
            com.google.android.material.bottomnavigation.BottomNavigationView r4 = r4.navView
            android.view.Menu r4 = r4.getMenu()
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r6 = "name"
            java.lang.String r2 = r5.t(r2, r6)
            r4.add(r1, r0, r0, r2)
            r0 = r3
            goto L72
        L9e:
            java.lang.String r8 = " mViewModel.bottomNavigationMenu.observe"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r8, r0)
            androidx.databinding.ViewDataBinding r8 = r7.K()
            com.bxkj.student.databinding.V2MainBinding r8 = (com.bxkj.student.databinding.V2MainBinding) r8
            com.google.android.material.bottomnavigation.BottomNavigationView r8 = r8.navView
            int r7 = r7.c0
            r8.setSelectedItemId(r7)
            kotlin.n1 r7 = kotlin.n1.a
            return r7
    }

    public static /* synthetic */ void f(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0, android.view.View r1) {
            X(r0, r1)
            return
    }

    private static final kotlin.n1 f0(com.bxkj.student.v2.ui.MainActivity r3, java.util.Map r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "latestUnreadNotice="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            com.bxkj.student.v2.ui.dialog.NoticeDialog r0 = new com.bxkj.student.v2.ui.dialog.NoticeDialog
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.bxkj.base.v2.data.ParcelableMap r2 = new com.bxkj.base.v2.data.ParcelableMap
            kotlin.jvm.internal.g0.m(r4)
            java.util.Map r4 = kotlin.collections.i1.J0(r4)
            r2.<init>(r4)
            java.lang.String r4 = "data"
            r1.putParcelable(r4, r2)
            r0.setArguments(r1)
            androidx.fragment.app.FragmentManager r3 = r3.getSupportFragmentManager()
            java.lang.String r4 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.String r4 = "TSNDialog"
            r1 = 1
            r0.i(r3, r4, r1)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.MainActivity r0, java.lang.Boolean r1) {
            kotlin.n1 r0 = a0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.MainActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = d0(r0, r1)
            return r0
    }

    private final void h0() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainBinding r0 = (com.bxkj.student.databinding.V2MainBinding) r0
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r0.navView
            com.bxkj.student.v2.ui.s r1 = new com.bxkj.student.v2.ui.s
            r1.<init>(r2)
            r0.setOnNavigationItemSelectedListener(r1)
            return
    }

    public static /* synthetic */ void i(com.bxkj.student.v2.ui.MainActivity r0) {
            j0(r0)
            return
    }

    private static final boolean i0(com.bxkj.student.v2.ui.MainActivity r7, android.view.MenuItem r8) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r7.b0
            int r1 = r8.getItemId()
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "isEnabled"
            java.lang.String r2 = r1.t(r0, r2)
            java.lang.String r3 = "1"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            java.lang.String r3 = "暂未开通此权限"
            r4 = 10
            r6 = 1
            if (r2 != 0) goto L3a
            androidx.databinding.ViewDataBinding r8 = r7.K()
            com.bxkj.student.databinding.V2MainBinding r8 = (com.bxkj.student.databinding.V2MainBinding) r8
            com.google.android.material.bottomnavigation.BottomNavigationView r8 = r8.navView
            com.bxkj.student.v2.ui.k r0 = new com.bxkj.student.v2.ui.k
            r0.<init>(r7)
            r8.postDelayed(r0, r4)
            com.bxkj.base.v2.common.ext.ContextExtKt.t(r7, r3)
            return r6
        L3a:
            java.lang.String r2 = "isLogin"
            boolean r2 = r1.d(r0, r2)
            if (r2 == 0) goto L81
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r2.a()
            boolean r2 = r2.Y()
            if (r2 != 0) goto L81
            com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r0 = r0.a()
            boolean r0 = r0 instanceof com.bxkj.student.v2.ui.LoginActivity
            if (r0 != 0) goto L66
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r1 = r7.q()
            java.lang.Class<com.bxkj.student.v2.ui.LoginActivity> r2 = com.bxkj.student.v2.ui.LoginActivity.class
            r0.<init>(r1, r2)
            r7.startActivity(r0)
        L66:
            int r8 = r8.getItemId()
            if (r8 != 0) goto L70
            r7.finish()
            goto L80
        L70:
            androidx.databinding.ViewDataBinding r8 = r7.K()
            com.bxkj.student.databinding.V2MainBinding r8 = (com.bxkj.student.databinding.V2MainBinding) r8
            com.google.android.material.bottomnavigation.BottomNavigationView r8 = r8.navView
            com.bxkj.student.v2.ui.l r0 = new com.bxkj.student.v2.ui.l
            r0.<init>(r7)
            r8.postDelayed(r0, r4)
        L80:
            return r6
        L81:
            int r2 = r8.getItemId()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "it.itemId="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.orhanobut.logger.j.d(r2, r4)
            int r8 = r8.getItemId()
            r7.Y(r8)
            java.lang.String r8 = "mkey"
            java.lang.String r8 = r1.t(r0, r8)
            int r2 = r8.hashCode()
            java.lang.String r4 = "navKey1"
            java.lang.String r5 = "navKey5"
            switch(r2) {
                case -1068465942: goto L10f;
                case -1068465814: goto Le9;
                case 1729495413: goto Le2;
                case 1729495414: goto Lbc;
                case 1729495417: goto Lb5;
                default: goto Lb4;
            }
        Lb4:
            goto L117
        Lb5:
            boolean r2 = r8.equals(r5)
            if (r2 != 0) goto Lf2
            goto L117
        Lbc:
            java.lang.String r2 = "navKey2"
            boolean r4 = r8.equals(r2)
            if (r4 != 0) goto Lc5
            goto L117
        Lc5:
            com.bxkj.student.v2.ui.main.ClassifyFragment r8 = r7.X
            if (r8 != 0) goto Ld0
            com.bxkj.student.v2.ui.main.ClassifyFragment r8 = new com.bxkj.student.v2.ui.main.ClassifyFragment
            r8.<init>()
            r7.X = r8
        Ld0:
            androidx.fragment.app.Fragment r8 = r7.a0
            com.bxkj.student.v2.ui.main.ClassifyFragment r0 = r7.X
            kotlin.jvm.internal.g0.m(r0)
            r7.l0(r8, r0, r2)
            com.bxkj.student.v2.ui.main.ClassifyFragment r7 = r7.X
            if (r7 == 0) goto Le1
            r7.j()
        Le1:
            return r6
        Le2:
            boolean r2 = r8.equals(r4)
            if (r2 != 0) goto L16c
            goto L117
        Le9:
            java.lang.String r2 = "ts-navKey55"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Lf2
            goto L117
        Lf2:
            com.bxkj.student.v2.ui.main.MyFragment r8 = r7.Y
            if (r8 != 0) goto Lfd
            com.bxkj.student.v2.ui.main.MyFragment r8 = new com.bxkj.student.v2.ui.main.MyFragment
            r8.<init>()
            r7.Y = r8
        Lfd:
            com.bxkj.student.v2.ui.main.MyFragment r8 = r7.Y
            if (r8 == 0) goto L104
            r8.m()
        L104:
            androidx.fragment.app.Fragment r8 = r7.a0
            com.bxkj.student.v2.ui.main.MyFragment r0 = r7.Y
            kotlin.jvm.internal.g0.m(r0)
            r7.l0(r8, r0, r5)
            return r6
        L10f:
            java.lang.String r2 = "ts-navKey11"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L16c
        L117:
            java.lang.String r2 = "linkUrl"
            java.lang.String r2 = r1.t(r0, r2)
            int r4 = r2.length()
            if (r4 <= 0) goto L168
            java.util.Map<java.lang.String, com.bxkj.student.v2.ui.main.H5Fragment> r3 = r7.Z
            boolean r3 = r3.containsKey(r8)
            if (r3 == 0) goto L134
            java.util.Map<java.lang.String, com.bxkj.student.v2.ui.main.H5Fragment> r0 = r7.Z
            java.lang.Object r0 = r0.get(r8)
            com.bxkj.student.v2.ui.main.H5Fragment r0 = (com.bxkj.student.v2.ui.main.H5Fragment) r0
            goto L160
        L134:
            com.bxkj.student.v2.ui.main.H5Fragment r3 = new com.bxkj.student.v2.ui.main.H5Fragment
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "url"
            r4.putString(r5, r2)
            java.lang.String r2 = "name"
            java.lang.String r2 = r1.t(r0, r2)
            java.lang.String r5 = "title"
            r4.putString(r5, r2)
            java.lang.String r2 = "isShowH5Title"
            java.lang.String r0 = r1.t(r0, r2)
            r4.putString(r2, r0)
            r3.setArguments(r4)
            java.util.Map<java.lang.String, com.bxkj.student.v2.ui.main.H5Fragment> r0 = r7.Z
            r0.put(r8, r3)
            r0 = r3
        L160:
            if (r0 == 0) goto L16b
            androidx.fragment.app.Fragment r1 = r7.a0
            r7.l0(r1, r0, r8)
            goto L16b
        L168:
            com.bxkj.base.v2.common.ext.ContextExtKt.t(r7, r3)
        L16b:
            return r6
        L16c:
            com.bxkj.student.v2.ui.main.HomeFragment r8 = r7.W
            if (r8 != 0) goto L177
            com.bxkj.student.v2.ui.main.HomeFragment r8 = new com.bxkj.student.v2.ui.main.HomeFragment
            r8.<init>()
            r7.W = r8
        L177:
            androidx.fragment.app.Fragment r8 = r7.a0
            com.bxkj.student.v2.ui.main.HomeFragment r0 = r7.W
            kotlin.jvm.internal.g0.m(r0)
            r7.l0(r8, r0, r4)
            com.bxkj.student.v2.ui.main.HomeFragment r7 = r7.W
            if (r7 == 0) goto L188
            r7.N()
        L188:
            return r6
    }

    public static /* synthetic */ kotlin.n1 j(com.bxkj.student.v2.ui.MainActivity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            kotlin.n1 r0 = R(r0, r1)
            return r0
    }

    private static final void j0(com.bxkj.student.v2.ui.MainActivity r1) {
            androidx.databinding.ViewDataBinding r1 = r1.K()
            com.bxkj.student.databinding.V2MainBinding r1 = (com.bxkj.student.databinding.V2MainBinding) r1
            com.google.android.material.bottomnavigation.BottomNavigationView r1 = r1.navView
            r0 = 0
            r1.setSelectedItemId(r0)
            return
    }

    public static /* synthetic */ kotlin.n1 k(com.bxkj.student.v2.ui.MainActivity r0, java.lang.Boolean r1) {
            kotlin.n1 r0 = b0(r0, r1)
            return r0
    }

    private static final void k0(com.bxkj.student.v2.ui.MainActivity r1) {
            androidx.databinding.ViewDataBinding r1 = r1.K()
            com.bxkj.student.databinding.V2MainBinding r1 = (com.bxkj.student.databinding.V2MainBinding) r1
            com.google.android.material.bottomnavigation.BottomNavigationView r1 = r1.navView
            r0 = 0
            r1.setSelectedItemId(r0)
            return
    }

    public static /* synthetic */ void l(com.bxkj.student.v2.ui.MainActivity r0, android.view.View r1) {
            c0(r0, r1)
            return
    }

    private final void l0(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, java.lang.String r5) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.a0
            if (r0 == r4) goto L30
            r2.a0 = r4
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            java.lang.String r1 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            java.lang.String r1 = "beginTransaction(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            if (r3 == 0) goto L1d
            r0.hide(r3)
        L1d:
            boolean r3 = r4.isAdded()
            if (r3 == 0) goto L27
            r0.show(r4)
            goto L2d
        L27:
            r3 = 2131296991(0x7f0902df, float:1.8211914E38)
            r0.add(r3, r4, r5)
        L2d:
            r0.commit()
        L30:
            return
    }

    public static /* synthetic */ kotlin.n1 m(com.bxkj.student.v2.ui.MainActivity r0, java.util.List r1) {
            kotlin.n1 r0 = e0(r0, r1)
            return r0
    }

    public final int U() {
            r1 = this;
            int r0 = r1.f1418p0
            return r0
    }

    public final void V() {
            r6 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.b0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "navKey2"
            java.lang.String r3 = "mkey"
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = r5.t(r4, r3)
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r4 == 0) goto L8
            goto L27
        L26:
            r1 = 0
        L27:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L93
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "isEnabled"
            java.lang.String r4 = r0.t(r1, r4)
            java.lang.String r5 = "1"
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 != 0) goto L41
            java.lang.String r0 = "暂未开通此权限"
            com.bxkj.base.v2.common.ext.ContextExtKt.t(r6, r0)
            return
        L41:
            java.lang.String r4 = "isLogin"
            boolean r0 = r0.d(r1, r4)
            if (r0 == 0) goto L64
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            boolean r0 = r0.Y()
            if (r0 != 0) goto L64
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r1 = r6.q()
            java.lang.Class<com.bxkj.student.v2.ui.LoginActivity> r2 = com.bxkj.student.v2.ui.LoginActivity.class
            r0.<init>(r1, r2)
            r6.startActivity(r0)
            return
        L64:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.b0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L6b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r0.next()
            java.util.Map r4 = (java.util.Map) r4
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = r5.t(r4, r3)
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r4 == 0) goto L84
            goto L88
        L84:
            int r1 = r1 + 1
            goto L6b
        L87:
            r1 = -1
        L88:
            androidx.databinding.ViewDataBinding r0 = r6.K()
            com.bxkj.student.databinding.V2MainBinding r0 = (com.bxkj.student.databinding.V2MainBinding) r0
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r0.navView
            r0.setSelectedItemId(r1)
        L93:
            return
    }

    public final void g0(int r1) {
            r0 = this;
            r0.f1418p0 = r1
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.Z()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.j r2 = new com.bxkj.student.v2.ui.j
            r2.<init>(r4)
            com.bxkj.student.v2.ui.MainActivity$a r3 = new com.bxkj.student.v2.ui.MainActivity$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.R()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.n r2 = new com.bxkj.student.v2.ui.n
            r2.<init>(r4)
            com.bxkj.student.v2.ui.MainActivity$a r3 = new com.bxkj.student.v2.ui.MainActivity$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.i0()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.o r2 = new com.bxkj.student.v2.ui.o
            r2.<init>(r4)
            com.bxkj.student.v2.ui.MainActivity$a r3 = new com.bxkj.student.v2.ui.MainActivity$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.O()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.p r2 = new com.bxkj.student.v2.ui.p
            r2.<init>(r4)
            com.bxkj.student.v2.ui.MainActivity$a r3 = new com.bxkj.student.v2.ui.MainActivity$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.W()
            com.bxkj.student.v2.ui.q r1 = new com.bxkj.student.v2.ui.q
            r1.<init>(r4)
            com.bxkj.student.v2.ui.MainActivity$a r2 = new com.bxkj.student.v2.ui.MainActivity$a
            r2.<init>(r1)
            r0.observe(r4, r2)
            return
    }

    @Override // com.bxkj.base.v2.common.view.b
    public void onBackPressed() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.G0
            long r0 = r0 - r2
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            java.lang.String r0 = "再按一次退出程序"
            com.bxkj.base.v2.common.ext.ContextExtKt.t(r5, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r5.G0 = r0
            return
        L19:
            r5.finish()
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected native void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1);

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.bxkj.student.v2.ui.MainActivity$refreshTokenBroadCastReceiver$1 r0 = r1.f1417k0
            r1.unregisterReceiver(r0)
            return
    }

    protected void onNewIntent(@org.jetbrains.annotations.Nullable android.content.Intent r2) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onNewIntent(r2)
            r1.Z(r2)
            com.bxkj.student.v2.ui.main.MyFragment r2 = r1.Y
            if (r2 == 0) goto Ld
            r2.h()
        Ld:
            java.util.Map<java.lang.String, com.bxkj.student.v2.ui.main.H5Fragment> r2 = r1.Z
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.ui.main.H5Fragment r0 = (com.bxkj.student.v2.ui.main.H5Fragment) r0
            r0.f()
            goto L17
        L2d:
            return
    }

    protected void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            boolean r0 = r1.F0
            if (r0 != 0) goto La
            r1.S()
        La:
            return
    }

    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainBinding r0 = (com.bxkj.student.databinding.V2MainBinding) r0
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r0.navView
            int r0 = r0.getSelectedItemId()
            java.lang.String r1 = "selectedItemId"
            r3.putInt(r1, r0)
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r4 = this;
            b0.b r0 = b0.b.a
            android.content.Context r1 = r4.G()
            boolean r0 = r0.c(r1)
            r1 = 0
            if (r0 != 0) goto L21
            java.lang.String r0 = "系统内部错误，错误码【1001】"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r4, r0)
            r0.setCancelable(r1)
            r0.setClickAutoCancel(r1)
            com.bxkj.student.v2.ui.u r2 = new com.bxkj.student.v2.ui.u
            r2.<init>(r4)
            r0.setButtonOnClickListener(r2)
        L21:
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            int r2 = r2.r()
            r3 = 1
            if (r2 != r3) goto L53
            com.bxkj.base.v2.data.b r2 = r0.a()
            boolean r2 = r2.p()
            if (r2 != 0) goto L53
            com.bxkj.base.v2.data.b r0 = r0.a()
            java.lang.String r0 = r0.s()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r4, r0)
            r0.setCancelable(r1)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r0.setClickAutoCancel(r1)
            com.bxkj.student.v2.ui.v r2 = new com.bxkj.student.v2.ui.v
            r2.<init>(r0)
            r1.setButtonOnClickListener(r2)
        L53:
            r4.Q()
            r4.S()
            r4.h0()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.S()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.X()
            android.content.Intent r0 = r4.getIntent()
            r4.Z(r0)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".REFRESH_TOKEN_FINISH"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            com.bxkj.student.v2.ui.MainActivity$refreshTokenBroadCastReceiver$1 r1 = r4.f1417k0
            java.lang.String r2 = "com.bxkj.student.sports.permissions.V3_Sports_BROADCAST"
            r3 = 0
            r4.registerReceiver(r1, r0, r2, r3)
            com.bxkj.student.v2.common.utils.safe.e r0 = com.bxkj.student.v2.common.utils.safe.e.a
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            r0.a(r1)
            return
    }
}
