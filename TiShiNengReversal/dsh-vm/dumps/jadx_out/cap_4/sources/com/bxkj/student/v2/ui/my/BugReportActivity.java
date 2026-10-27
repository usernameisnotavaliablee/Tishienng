package com.bxkj.student.v2.ui.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class BugReportActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV3BugReportBinding, com.bxkj.student.v2.vm.my.BugReportVM> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> W;

    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.adapter.c X;

    public BugReportActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.W = r0
            return
    }

    private final void L() {
            r5 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r5.C()
            com.bxkj.student.v2.vm.my.BugReportVM r0 = (com.bxkj.student.v2.vm.my.BugReportVM) r0
            androidx.databinding.ViewDataBinding r1 = r5.K()
            com.bxkj.student.databinding.AcV3BugReportBinding r1 = (com.bxkj.student.databinding.AcV3BugReportBinding) r1
            android.widget.EditText r1 = r1.etPhone
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = kotlin.text.u.Z5(r1)
            java.lang.String r1 = r1.toString()
            androidx.databinding.ViewDataBinding r2 = r5.K()
            com.bxkj.student.databinding.AcV3BugReportBinding r2 = (com.bxkj.student.databinding.AcV3BugReportBinding) r2
            android.widget.EditText r2 = r2.etReason
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = kotlin.text.u.Z5(r2)
            java.lang.String r2 = r2.toString()
            java.util.List<java.lang.String> r3 = r5.W
            com.bxkj.student.v2.ui.my.i r4 = new com.bxkj.student.v2.ui.my.i
            r4.<init>(r5)
            r0.x(r1, r2, r3, r4)
            return
    }

    private static final kotlin.n1 M(com.bxkj.student.v2.ui.my.BugReportActivity r3, java.lang.String r4) {
            if (r4 != 0) goto L4
            java.lang.String r4 = "上报开发者成功！"
        L4:
            r0 = 2
            r1 = 0
            r2 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r3, r4, r2, r0, r1)
            r3.finish()
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private final java.io.File N() {
            r2 = this;
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = "TSNStudent.db"
            java.io.File r0 = r0.getDatabasePath(r1)
            java.lang.String r1 = "getDatabasePath(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    private final java.io.File O() {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getParent()
            java.lang.String r2 = "shared_prefs"
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "share_date.xml"
            r1.<init>(r0, r2)
            return r1
    }

    private static final void P(com.bxkj.student.v2.ui.my.BugReportActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.q()
            com.bxkj.student.v2.ui.my.h r3 = new com.bxkj.student.v2.ui.my.h
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    private static final kotlin.n1 Q(com.bxkj.student.v2.ui.my.BugReportActivity r2, java.io.File r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List<java.lang.String> r0 = r2.W
            r0.clear()
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

    private static final void R(com.bxkj.student.v2.ui.my.BugReportActivity r0, android.view.View r1) {
            r0.L()
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ui.my.BugReportActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            P(r0, r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.my.BugReportActivity r0, java.lang.String r1) {
            kotlin.n1 r0 = M(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.my.BugReportActivity r0, java.io.File r1) {
            kotlin.n1 r0 = Q(r0, r1)
            return r0
    }

    public static /* synthetic */ void h(com.bxkj.student.v2.ui.my.BugReportActivity r0, android.view.View r1) {
            R(r0, r1)
            return
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
            com.bxkj.student.databinding.AcV3BugReportBinding r0 = (com.bxkj.student.databinding.AcV3BugReportBinding) r0
            r0.setBackEvent(r5)
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.W
            android.content.Context r2 = r5.G()
            r3 = 1092616192(0x41200000, float:10.0)
            android.content.Context r4 = r5.G()
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r4)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r1 = 1
            r0.e(r1)
            r5.X = r0
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3BugReportBinding r0 = (com.bxkj.student.databinding.AcV3BugReportBinding) r0
            cn.bluemobi.dylan.base.view.MyGridView r0 = r0.gvImages
            cn.bluemobi.dylan.base.adapter.c r1 = r5.X
            r0.setAdapter(r1)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3BugReportBinding r0 = (com.bxkj.student.databinding.AcV3BugReportBinding) r0
            cn.bluemobi.dylan.base.view.MyGridView r0 = r0.gvImages
            com.bxkj.student.v2.ui.my.j r1 = new com.bxkj.student.v2.ui.my.j
            r1.<init>(r5)
            r0.setOnItemClickListener(r1)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3BugReportBinding r0 = (com.bxkj.student.databinding.AcV3BugReportBinding) r0
            android.widget.Button r0 = r0.btCommit
            com.bxkj.student.v2.ui.my.k r1 = new com.bxkj.student.v2.ui.my.k
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            return
    }
}
