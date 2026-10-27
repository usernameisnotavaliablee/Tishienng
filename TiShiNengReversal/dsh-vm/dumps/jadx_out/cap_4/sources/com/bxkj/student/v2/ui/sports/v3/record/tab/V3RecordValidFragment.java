package com.bxkj.student.v2.ui.sports.v3.record.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordValidFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.V3FmValidRecordListBinding, com.bxkj.student.v2.vm.sports.record.RecordVM> {

    /* renamed from: l, reason: collision with root package name */
    private int f1478l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1479m;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> f1480n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements m2.e {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment a;

        a(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r2) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r2 = r1.a
                int r2 = com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment.g(r2)
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r0 = r1.a
                int r2 = r2 + 1
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment.i(r0, r2)
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment.h(r2)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment.i(r2, r0)
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment.h(r2)
                return
        }
    }

    public V3RecordValidFragment() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1478l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1479m = r0
            return
    }

    private final void L() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V3FmValidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmValidRecordListBinding) r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.refresh
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment$a r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r0) {
            kotlin.n1 r0 = l(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r0, java.util.List r1) {
            kotlin.n1 r0 = k(r0, r1)
            return r0
    }

    public static final /* synthetic */ int g(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r0) {
            int r0 = r0.f1478l
            return r0
    }

    public static final /* synthetic */ void h(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r0) {
            r0.j()
            return
    }

    public static final /* synthetic */ void i(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r0, int r1) {
            r0.f1478l = r1
            return
    }

    private final void j() {
            r5 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r5.C()
            com.bxkj.student.v2.vm.sports.record.RecordVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordVM) r0
            int r1 = r5.f1478l
            com.bxkj.student.v2.ui.sports.v3.record.tab.j r2 = new com.bxkj.student.v2.ui.sports.v3.record.tab.j
            r2.<init>(r5)
            com.bxkj.student.v2.ui.sports.v3.record.tab.k r3 = new com.bxkj.student.v2.ui.sports.v3.record.tab.k
            r3.<init>(r5)
            java.lang.String r4 = "1"
            r0.H(r4, r1, r2, r3)
            return
    }

    private static final kotlin.n1 k(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r2, java.util.List r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.f1478l
            r1 = 1
            if (r0 != r1) goto Lf
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1479m
            r0.clear()
        Lf:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1479m
            java.util.Collection r3 = (java.util.Collection) r3
            r0.addAll(r3)
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> r3 = r2.f1480n
            if (r3 == 0) goto L1f
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1479m
            r3.l(r0)
        L1f:
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> r2 = r2.f1480n
            if (r2 == 0) goto L26
            r2.notifyDataSetChanged()
        L26:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 l(com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r1) {
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.V3FmValidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmValidRecordListBinding) r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.refresh
            r0.w0()
            androidx.databinding.ViewDataBinding r1 = r1.K()
            com.bxkj.student.databinding.V3FmValidRecordListBinding r1 = (com.bxkj.student.databinding.V3FmValidRecordListBinding) r1
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r1.refresh
            r1.q0()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void m() {
            r2 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1479m
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment$initAdapter$1 r1 = new com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment$initAdapter$1
            r1.<init>(r2, r0)
            r2.f1480n = r1
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V3FmValidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmValidRecordListBinding) r0
            com.bxkj.base.v2.common.view.EmptyRecyclerView r0 = r0.recyclerView
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.V3ItemForValidRecordListBinding> r1 = r2.f1480n
            r0.setAdapter(r1)
            r2.j()
            return
    }

    public final void M() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.V3FmValidRecordListBinding r0 = (com.bxkj.student.databinding.V3FmValidRecordListBinding) r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.refresh
            r0.D()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r0 = this;
            r0.L()
            r0.m()
            return
    }
}
