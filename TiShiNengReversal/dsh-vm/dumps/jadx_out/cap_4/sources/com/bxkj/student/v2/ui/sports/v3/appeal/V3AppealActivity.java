package com.bxkj.student.v2.ui.sports.v3.appeal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3AppealActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV3SportsAppealBinding, com.bxkj.student.v2.vm.sports.appeal.AppealVM> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> W;

    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.adapter.c X;

    public V3AppealActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.W = r0
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            i(r0, r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void f(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r0, android.view.View r1) {
            k(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r0, java.io.File r1) {
            kotlin.n1 r0 = j(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r0, java.lang.String r1) {
            kotlin.n1 r0 = l(r0, r1)
            return r0
    }

    private static final void i(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.q()
            p0.c r3 = new p0.c
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    private static final kotlin.n1 j(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r2, java.io.File r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List<java.lang.String> r0 = r2.W
            java.lang.String r3 = r3.getPath()
            java.lang.String r1 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            r0.add(r3)
            cn.bluemobi.dylan.base.adapter.c r3 = r2.X
            kotlin.jvm.internal.g0.m(r3)
            java.util.List<java.lang.String> r2 = r2.W
            r3.c(r2)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final void k(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r3, android.view.View r4) {
            com.bxkj.base.v2.base.BaseViewModel r4 = r3.C()
            com.bxkj.student.v2.vm.sports.appeal.AppealVM r4 = (com.bxkj.student.v2.vm.sports.appeal.AppealVM) r4
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV3SportsAppealBinding r0 = (com.bxkj.student.databinding.AcV3SportsAppealBinding) r0
            android.widget.EditText r0 = r0.etReason
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = kotlin.text.u.Z5(r0)
            java.lang.String r0 = r0.toString()
            java.util.List<java.lang.String> r1 = r3.W
            p0.d r2 = new p0.d
            r2.<init>(r3)
            r4.t(r0, r1, r2)
            return
    }

    private static final kotlin.n1 l(com.bxkj.student.v2.ui.sports.v3.appeal.V3AppealActivity r3, java.lang.String r4) {
            if (r4 != 0) goto L4
            java.lang.String r4 = "申诉提交成功，请耐心等待审核"
        L4:
            r0 = 2
            r1 = 0
            r2 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r3, r4, r2, r0, r1)
            cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.h5.H5AppActivity> r0 = com.bxkj.student.v2.ui.h5.H5AppActivity.class
            android.app.Activity r4 = r4.getActivity(r0)
            com.bxkj.student.v2.ui.h5.H5AppActivity r4 = (com.bxkj.student.v2.ui.h5.H5AppActivity) r4
            if (r4 == 0) goto L1b
            r4.L()
        L1b:
            cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity> r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.class
            android.app.Activity r4 = r4.getActivity(r0)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r4 = (com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity) r4
            if (r4 == 0) goto L2c
            r4.D1()
        L2c:
            cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity> r0 = com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity.class
            android.app.Activity r4 = r4.getActivity(r0)
            com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r4 = (com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity) r4
            if (r4 == 0) goto L3d
            r4.L()
        L3d:
            cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment> r0 = com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment.class
            androidx.fragment.app.Fragment r4 = r4.o(r0)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment r4 = (com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordValidFragment) r4
            if (r4 == 0) goto L4e
            r4.M()
        L4e:
            cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment> r0 = com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment.class
            androidx.fragment.app.Fragment r4 = r4.o(r0)
            com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment r4 = (com.bxkj.student.v2.ui.sports.v3.record.tab.V3RecordInValidFragment) r4
            if (r4 == 0) goto L5f
            r4.Z()
        L5f:
            r3.finish()
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r5 = this;
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3SportsAppealBinding r0 = (com.bxkj.student.databinding.AcV3SportsAppealBinding) r0
            r0.setBackEvent(r5)
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.W
            android.content.Context r2 = r5.G()
            r3 = 1092616192(0x41200000, float:10.0)
            android.content.Context r4 = r5.G()
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r4)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r1 = 3
            r0.e(r1)
            r5.X = r0
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3SportsAppealBinding r0 = (com.bxkj.student.databinding.AcV3SportsAppealBinding) r0
            cn.bluemobi.dylan.base.view.MyGridView r0 = r0.gvImages
            cn.bluemobi.dylan.base.adapter.c r1 = r5.X
            r0.setAdapter(r1)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3SportsAppealBinding r0 = (com.bxkj.student.databinding.AcV3SportsAppealBinding) r0
            cn.bluemobi.dylan.base.view.MyGridView r0 = r0.gvImages
            p0.a r1 = new p0.a
            r1.<init>(r5)
            r0.setOnItemClickListener(r1)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "exerciseRecordId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L5f
            com.bxkj.base.v2.base.BaseViewModel r0 = r5.C()
            com.bxkj.student.v2.vm.sports.appeal.AppealVM r0 = (com.bxkj.student.v2.vm.sports.appeal.AppealVM) r0
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.v(r1)
        L5f:
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3SportsAppealBinding r0 = (com.bxkj.student.databinding.AcV3SportsAppealBinding) r0
            android.widget.Button r0 = r0.btCommit
            p0.b r1 = new p0.b
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            return
    }
}
