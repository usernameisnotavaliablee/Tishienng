package com.bxkj.student.v2.ui.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyFragment.kt\ncom/bxkj/student/v2/ui/main/MyFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1#2:122\n1869#3:123\n774#3:124\n865#3,2:125\n1870#3:127\n*S KotlinDebug\n*F\n+ 1 MyFragment.kt\ncom/bxkj/student/v2/ui/main/MyFragment\n*L\n94#1:123\n100#1:124\n100#1:125,2\n94#1:127\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MyFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V2MainTabMyFragmentBinding, com.bxkj.student.v2.vm.MainViewModel> {

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1434l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1435m;

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

    public MyFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1434l = r0
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.main.MyFragment r0, java.util.List r1) {
            kotlin.n1 r0 = l(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.main.MyFragment r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            kotlin.n1 r0 = j(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.main.MyFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = k(r0, r1)
            return r0
    }

    private static final kotlin.n1 j(com.bxkj.student.v2.ui.main.MyFragment r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.bxkj.base.v2.base.BaseViewModel r3 = r2.C()
            com.bxkj.student.v2.vm.MainViewModel r3 = (com.bxkj.student.v2.vm.MainViewModel) r3
            r3.j0()
            android.webkit.WebStorage r3 = android.webkit.WebStorage.getInstance()
            r3.deleteAllData()
            android.content.Intent r3 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r0 = r2.q()
            java.lang.Class<com.bxkj.student.v2.ui.LoginActivity> r1 = com.bxkj.student.v2.ui.LoginActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            com.bxkj.base.v2.base.BaseViewModel r2 = r2.C()
            com.bxkj.student.v2.vm.MainViewModel r2 = (com.bxkj.student.v2.vm.MainViewModel) r2
            androidx.lifecycle.MutableLiveData r2 = r2.Z()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.postValue(r3)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 k(com.bxkj.student.v2.ui.main.MyFragment r5, java.util.Map r6) {
            android.content.Context r0 = r5.G()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "imageRouteUrl"
            java.lang.String r2 = r1.t(r6, r2)
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.V2MainTabMyFragmentBinding r3 = (com.bxkj.student.databinding.V2MainTabMyFragmentBinding) r3
            android.widget.ImageView r3 = r3.ivHead
            r4 = 2131690190(0x7f0f02ce, float:1.9009417E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r2, r3, r4, r4)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            java.lang.String r3 = "nickName"
            java.lang.String r6 = r1.t(r6, r3)
            r2.X0(r6)
            androidx.databinding.ViewDataBinding r6 = r5.K()
            com.bxkj.student.databinding.V2MainTabMyFragmentBinding r6 = (com.bxkj.student.databinding.V2MainTabMyFragmentBinding) r6
            android.widget.TextView r6 = r6.tvName
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.U()
            r6.setText(r1)
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.V2MainTabMyFragmentBinding r5 = (com.bxkj.student.databinding.V2MainTabMyFragmentBinding) r5
            android.widget.TextView r5 = r5.tvUserNumber
            com.bxkj.base.v2.data.b r6 = r0.a()
            java.lang.String r6 = r6.S()
            r5.setText(r6)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private static final kotlin.n1 l(com.bxkj.student.v2.ui.main.MyFragment r6, java.util.List r7) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.f1434l
            r0.clear()
            if (r7 == 0) goto L72
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r7.next()
            java.util.Map r0 = (java.util.Map) r0
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = "typeName"
            java.lang.String r3 = r2.t(r0, r3)
            java.lang.String r4 = "name"
            r1.put(r4, r3)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "type"
            r1.put(r4, r3)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.f1434l
            r3.add(r1)
            java.lang.String r1 = "menus"
            java.util.List r0 = r2.n(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "isShow"
            java.lang.String r3 = r4.t(r3, r5)
            java.lang.String r4 = "1"
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r3 == 0) goto L4b
            r1.add(r2)
            goto L4b
        L6c:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.f1434l
            r0.addAll(r1)
            goto Ld
        L72:
            com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, java.lang.Object>> r6 = r6.f1435m
            if (r6 == 0) goto L79
            r6.notifyDataSetChanged()
        L79:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    public final void h() {
            r3 = this;
            boolean r0 = r3.b()
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L24
            com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r2.a()
            boolean r2 = r2.Y()
            if (r2 == 0) goto L19
            r1 = r0
        L19:
            if (r1 == 0) goto L24
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.a0()
        L24:
            return
    }

    public final void i() {
            r9 = this;
            androidx.fragment.app.FragmentActivity r0 = r9.q()
            com.bxkj.student.v2.ui.main.l r3 = new com.bxkj.student.v2.ui.main.l
            r3.<init>(r9)
            r7 = 56
            r8 = 0
            java.lang.String r1 = "提示"
            java.lang.String r2 = "确定要退出登录吗?"
            r4 = 0
            r5 = 0
            r6 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final void m() {
            r3 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.f1434l
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r3
            goto Lc
        Lb:
            r0 = r1
        Lc:
            if (r0 == 0) goto L20
            boolean r2 = r3.b()
            if (r2 == 0) goto L15
            r1 = r0
        L15:
            if (r1 == 0) goto L20
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.c0()
        L20:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.e0()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.main.j r2 = new com.bxkj.student.v2.ui.main.j
            r2.<init>(r4)
            com.bxkj.student.v2.ui.main.MyFragment$a r3 = new com.bxkj.student.v2.ui.main.MyFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.d0()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.main.k r2 = new com.bxkj.student.v2.ui.main.k
            r2.<init>(r4)
            com.bxkj.student.v2.ui.main.MyFragment$a r3 = new com.bxkj.student.v2.ui.main.MyFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.q()
            r2.d(r0)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabMyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabMyFragmentBinding) r0
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            r0.setLoggedInUser(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabMyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabMyFragmentBinding) r0
            r0.setMyFragment(r2)
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.c0()
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.a0()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1434l
            com.bxkj.student.v2.ui.main.MyFragment$initUiData$1 r1 = new com.bxkj.student.v2.ui.main.MyFragment$initUiData$1
            r1.<init>(r2, r0)
            r2.f1435m = r1
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabMyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabMyFragmentBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.rvMenu
            com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.f1435m
            r0.setAdapter(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabMyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabMyFragmentBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.rvMenu
            com.bxkj.student.v2.common.view.CardListMenuItemDecoration r1 = new com.bxkj.student.v2.common.view.CardListMenuItemDecoration
            r1.<init>()
            r0.addItemDecoration(r1)
            return
    }
}
