package com.bxkj.student.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OpenPrivacyAgreementActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcFacePrivacyAgreementBinding, com.bxkj.base.v2.base.BaseViewModel> {
    public OpenPrivacyAgreementActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void M(com.bxkj.student.splash.OpenPrivacyAgreementActivity r3, android.view.View r4) {
            com.bxkj.student.v2.common.utils.h r4 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r3 = r3.q()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "用户协议"
            r0.put(r1, r2)
            com.bxkj.student.v2.retrofit.b$a r1 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r1 = r1.c()
            java.lang.String r2 = "linkUrl"
            r0.put(r2, r1)
            kotlin.n1 r1 = kotlin.n1.a
            r4.b(r3, r0)
            return
    }

    private static final void N(com.bxkj.student.splash.OpenPrivacyAgreementActivity r3, android.view.View r4) {
            com.bxkj.student.v2.common.utils.h r4 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r3 = r3.q()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "隐私政策"
            r0.put(r1, r2)
            com.bxkj.student.v2.retrofit.b$a r1 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r1 = r1.b()
            java.lang.String r2 = "linkUrl"
            r0.put(r2, r1)
            kotlin.n1 r1 = kotlin.n1.a
            r4.b(r3, r0)
            return
    }

    private static final void O(com.bxkj.student.splash.OpenPrivacyAgreementActivity r0, android.view.View r1) {
            r0.finish()
            return
    }

    private static final void P(com.bxkj.student.splash.OpenPrivacyAgreementActivity r0, android.view.View r1) {
            r0.L()
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.splash.OpenPrivacyAgreementActivity r0, android.view.View r1) {
            P(r0, r1)
            return
    }

    public static /* synthetic */ void f(com.bxkj.student.splash.OpenPrivacyAgreementActivity r0, android.view.View r1) {
            N(r0, r1)
            return
    }

    public static /* synthetic */ void g(com.bxkj.student.splash.OpenPrivacyAgreementActivity r0, android.view.View r1) {
            O(r0, r1)
            return
    }

    public static /* synthetic */ void h(com.bxkj.student.splash.OpenPrivacyAgreementActivity r0, android.view.View r1) {
            M(r0, r1)
            return
    }

    protected final void L() {
            r3 = this;
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            r0.n()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1 = 1
            r0.setAgreement(r1)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.splash.SplashActivity> r2 = com.bxkj.student.splash.SplashActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
    }

    protected final void Q() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcFacePrivacyAgreementBinding r0 = (com.bxkj.student.databinding.AcFacePrivacyAgreementBinding) r0
            android.widget.Button r0 = r0.btRefuse
            r1 = 0
            r0.setVisibility(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcFacePrivacyAgreementBinding r0 = (com.bxkj.student.databinding.AcFacePrivacyAgreementBinding) r0
            android.widget.Button r0 = r0.btAgree
            r0.setVisibility(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcFacePrivacyAgreementBinding r0 = (com.bxkj.student.databinding.AcFacePrivacyAgreementBinding) r0
            android.widget.Button r0 = r0.btRefuse
            com.bxkj.student.splash.a r1 = new com.bxkj.student.splash.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcFacePrivacyAgreementBinding r0 = (com.bxkj.student.databinding.AcFacePrivacyAgreementBinding) r0
            android.widget.Button r0 = r0.btAgree
            com.bxkj.student.splash.b r1 = new com.bxkj.student.splash.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcFacePrivacyAgreementBinding r0 = (com.bxkj.student.databinding.AcFacePrivacyAgreementBinding) r0
            r0.setMActivity(r2)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcFacePrivacyAgreementBinding r0 = (com.bxkj.student.databinding.AcFacePrivacyAgreementBinding) r0
            android.widget.TextView r0 = r0.tvUserAgree
            com.bxkj.student.splash.c r1 = new com.bxkj.student.splash.c
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcFacePrivacyAgreementBinding r0 = (com.bxkj.student.databinding.AcFacePrivacyAgreementBinding) r0
            android.widget.TextView r0 = r0.tvUserPrivate
            com.bxkj.student.splash.d r1 = new com.bxkj.student.splash.d
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            r2.Q()
            return
    }
}
