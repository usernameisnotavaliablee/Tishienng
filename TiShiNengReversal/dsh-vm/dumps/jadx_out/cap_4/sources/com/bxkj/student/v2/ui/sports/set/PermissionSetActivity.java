package com.bxkj.student.v2.ui.sports.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class PermissionSetActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV2PermissionSetBinding, com.bxkj.student.v2.vm.sports.PermissionSetVM> {
    public PermissionSetActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void L() {
            r3 = this;
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r0 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r0
            android.widget.Button r0 = r0.btFastSet
            com.bxkj.student.v2.common.utils.p$a r1 = com.bxkj.student.v2.common.utils.p.a
            boolean r2 = r1.b()
            r2 = r2 ^ 1
            r0.setEnabled(r2)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r0 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r0
            android.widget.Button r0 = r0.btFastSet
            boolean r1 = r1.b()
            if (r1 == 0) goto L24
            java.lang.String r1 = "权限已开启"
            goto L26
        L24:
            java.lang.String r1 = "一键自动开启"
        L26:
            r0.setText(r1)
            return
    }

    private static final kotlin.n1 P(com.bxkj.student.v2.ui.sports.set.PermissionSetActivity r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r5 = "linkUrl"
            kotlin.jvm.internal.g0.p(r6, r5)
            androidx.databinding.ViewDataBinding r5 = r4.K()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r5 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r5
            cn.bluemobi.dylan.smartwebview.SmartWebView r5 = r5.sw
            com.bxkj.base.v2.h5.i r0 = new com.bxkj.base.v2.h5.i
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            androidx.databinding.ViewDataBinding r2 = r4.K()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r2 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r2
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = r2.sw
            java.lang.String r3 = "sw"
            kotlin.jvm.internal.g0.o(r2, r3)
            r0.<init>(r1, r2)
            r5.setWebViewClient(r0)
            com.bxkj.student.v2.common.utils.h r5 = com.bxkj.student.v2.common.utils.h.a
            java.lang.String r5 = r5.a(r6)
            java.lang.String r6 = com.bxkj.base.util.b0.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "url:"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r6, r0)
            androidx.databinding.ViewDataBinding r4 = r4.K()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r4 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r4
            cn.bluemobi.dylan.smartwebview.SmartWebView r4 = r4.sw
            r4.j(r5)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.set.PermissionSetActivity r0, java.lang.String r1, java.lang.String r2) {
            kotlin.n1 r0 = P(r0, r1, r2)
            return r0
    }

    public final void M() {
            r2 = this;
            com.bxkj.student.v2.common.utils.p$a r0 = com.bxkj.student.v2.common.utils.p.a
            androidx.fragment.app.FragmentActivity r1 = r2.q()
            r0.e(r1)
            return
    }

    public final void N() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto L11
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.BATTERY_SAVER_SETTINGS"
            r0.<init>(r1)
            r2.startActivity(r0)
            return
        L11:
            java.lang.String r0 = "请手动在手机【设置】->【电池】->【省电模式】中关闭省电模式"
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r2, r0)
            return
    }

    public final void O() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.q()
            com.bxkj.base.util.v.o(r0)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    protected void onResume() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            r0.L()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r3 = this;
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r0 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r0
            r0.setMActivity(r3)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r0 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r0
            android.widget.Button r0 = r0.btFastSet
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            int r1 = r1.b0()
            r2 = 1
            if (r1 != r2) goto L20
            r1 = 0
            goto L22
        L20:
            r1 = 8
        L22:
            r0.setVisibility(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.sports.PermissionSetVM r0 = (com.bxkj.student.v2.vm.sports.PermissionSetVM) r0
            com.bxkj.student.v2.ui.sports.set.a r1 = new com.bxkj.student.v2.ui.sports.set.a
            r1.<init>(r3)
            r0.x(r1)
            return
    }
}
