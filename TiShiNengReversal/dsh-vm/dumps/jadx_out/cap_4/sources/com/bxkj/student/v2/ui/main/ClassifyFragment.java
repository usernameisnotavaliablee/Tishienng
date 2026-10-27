package com.bxkj.student.v2.ui.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nClassifyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifyFragment.kt\ncom/bxkj/student/v2/ui/main/ClassifyFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n774#2:178\n865#2,2:179\n1869#2,2:181\n774#2:184\n865#2,2:185\n1869#2:187\n774#2:188\n865#2,2:189\n1870#2:191\n1#3:183\n*S KotlinDebug\n*F\n+ 1 ClassifyFragment.kt\ncom/bxkj/student/v2/ui/main/ClassifyFragment\n*L\n143#1:178\n143#1:179,2\n144#1:181,2\n120#1:184\n120#1:185,2\n126#1:187\n127#1:188\n127#1:189,2\n126#1:191\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ClassifyFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding, com.bxkj.student.v2.vm.MainViewModel> {

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1427l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1428m;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1429n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForClassifyMenuBinding> f1430o;

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

    public ClassifyFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1427l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1428m = r0
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.main.ClassifyFragment r0, java.util.List r1) {
            kotlin.n1 r0 = i(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.main.ClassifyFragment r0, java.util.List r1) {
            kotlin.n1 r0 = h(r0, r1)
            return r0
    }

    private static final kotlin.n1 h(com.bxkj.student.v2.ui.main.ClassifyFragment r5, java.util.List r6) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r5.f1428m
            r0.clear()
            if (r6 == 0) goto L3c
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
            int r6 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L3d
        L3c:
            r6 = 0
        L3d:
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding r5 = (com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding) r5
            android.widget.TextView r5 = r5.tvHomeMenuCount
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "已收起"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "个应用"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.setText(r6)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private static final kotlin.n1 i(com.bxkj.student.v2.ui.main.ClassifyFragment r8, java.util.List r9) {
            com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.f1429n
            r1 = 0
            if (r0 == 0) goto Le
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r8.f1427l
            int r2 = r2.size()
            r0.notifyItemRangeRemoved(r1, r2)
        Le:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.f1427l
            r0.clear()
            if (r9 == 0) goto L87
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L1b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r9.next()
            java.util.Map r0 = (java.util.Map) r0
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = "menus"
            java.util.List r2 = r2.n(r0, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r7 = "isShow"
            java.lang.String r5 = r6.t(r5, r7)
            java.lang.String r6 = "1"
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
            if (r5 == 0) goto L3a
            r3.add(r4)
            goto L3a
        L5b:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L1b
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "typeName"
            java.lang.String r0 = r4.t(r0, r5)
            java.lang.String r4 = "name"
            r2.put(r4, r0)
            java.lang.String r0 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.put(r0, r4)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.f1427l
            r0.add(r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.f1427l
            r0.addAll(r3)
            goto L1b
        L87:
            com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, java.lang.Object>> r9 = r8.f1429n
            if (r9 == 0) goto L94
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r8 = r8.f1427l
            int r8 = r8.size()
            r9.notifyItemRangeInserted(r1, r8)
        L94:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }

    private final void k() {
            r3 = this;
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding) r0
            android.widget.ImageView r0 = r0.tvHomeMenuArrow
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [0, 1119092736} // fill-array
            java.lang.String r2 = "rotation"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r1)
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            r0.start()
            return
    }

    private final void l() {
            r3 = this;
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding) r0
            android.widget.ImageView r0 = r0.tvHomeMenuArrow
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [1119092736, 0} // fill-array
            java.lang.String r2 = "rotation"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r1)
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            r0.start()
            return
    }

    public final void L() {
            r6 = this;
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForClassifyMenuBinding> r0 = r6.f1430o
            if (r0 == 0) goto L62
            int r0 = r0.getItemCount()
            if (r0 != 0) goto L62
            com.bxkj.base.v2.base.BaseViewModel r0 = r6.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.T()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "isShow"
            java.lang.String r3 = r4.t(r3, r5)
            java.lang.String r4 = "1"
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r3 == 0) goto L27
            r1.add(r2)
            goto L27
        L48:
            java.util.Iterator r0 = r1.iterator()
        L4c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.f1428m
            r2.add(r1)
            goto L4c
        L5e:
            r6.k()
            goto L6a
        L62:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.f1428m
            r0.clear()
            r6.l()
        L6a:
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForClassifyMenuBinding> r0 = r6.f1430o
            if (r0 == 0) goto L71
            r0.notifyDataSetChanged()
        L71:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForClassifyMenuBinding> g() {
            r1 = this;
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForClassifyMenuBinding> r0 = r1.f1430o
            return r0
    }

    public final void j() {
            r3 = this;
            VM extends com.bxkj.base.v2.base.BaseViewModel r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L7
            r0 = r3
            goto L8
        L7:
            r0 = r1
        L8:
            if (r0 == 0) goto L38
            com.bxkj.base.v2.base.BaseViewModel r2 = r3.C()
            com.bxkj.student.v2.vm.MainViewModel r2 = (com.bxkj.student.v2.vm.MainViewModel) r2
            boolean r2 = r2.g0()
            if (r2 != 0) goto L17
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L38
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.f1427l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L38
            boolean r2 = r3.b()
            if (r2 == 0) goto L2d
            r1 = r0
        L2d:
            if (r1 == 0) goto L38
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.P()
        L38:
            return
    }

    public final void m(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForClassifyMenuBinding> r1) {
            r0 = this;
            r0.f1430o = r1
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.T()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.main.a r2 = new com.bxkj.student.v2.ui.main.a
            r2.<init>(r4)
            com.bxkj.student.v2.ui.main.ClassifyFragment$a r3 = new com.bxkj.student.v2.ui.main.ClassifyFragment$a
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.Q()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.main.b r2 = new com.bxkj.student.v2.ui.main.b
            r2.<init>(r4)
            com.bxkj.student.v2.ui.main.ClassifyFragment$a r3 = new com.bxkj.student.v2.ui.main.ClassifyFragment$a
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
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding) r0
            r0.setClassifyFragment(r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1427l
            com.bxkj.student.v2.ui.main.ClassifyFragment$initUiData$1 r1 = new com.bxkj.student.v2.ui.main.ClassifyFragment$initUiData$1
            r1.<init>(r2, r0)
            r2.f1429n = r1
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.rvMenu
            com.bxkj.base.v2.base.BaseMultiItemAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.f1429n
            r0.setAdapter(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.rvMenu
            com.bxkj.student.v2.common.view.CardGridMenuItemDecoration r1 = new com.bxkj.student.v2.common.view.CardGridMenuItemDecoration
            r1.<init>()
            r0.addItemDecoration(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.MainViewModel r0 = (com.bxkj.student.v2.vm.MainViewModel) r0
            r0.P()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1428m
            com.bxkj.student.v2.ui.main.ClassifyFragment$initUiData$2 r1 = new com.bxkj.student.v2.ui.main.ClassifyFragment$initUiData$2
            r1.<init>(r2, r0)
            r2.f1430o = r1
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding r0 = (com.bxkj.student.databinding.V2MainTabClassifyFragmentBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.rvHomeMenu
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V2ItemForClassifyMenuBinding> r1 = r2.f1430o
            r0.setAdapter(r1)
            return
    }
}
