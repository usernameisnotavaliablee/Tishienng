package com.bxkj.student.v2.ui.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AdSwitchActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V2AdSwitchBinding, com.bxkj.base.v2.base.BaseViewModel> {
    public AdSwitchActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 e(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            kotlin.n1 r0 = j(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.my.AdSwitchActivity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            kotlin.n1 r0 = i(r0, r1)
            return r0
    }

    public static /* synthetic */ void g(com.bxkj.student.v2.ui.my.AdSwitchActivity r0, android.view.View r1) {
            h(r0, r1)
            return
    }

    private static final void h(com.bxkj.student.v2.ui.my.AdSwitchActivity r8, android.view.View r9) {
            com.bxkj.base.v2.data.b$a r9 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r9.a()
            boolean r0 = r0.h()
            if (r0 == 0) goto L23
            com.bxkj.student.v2.ui.my.e r4 = new com.bxkj.student.v2.ui.my.e
            r4.<init>(r8)
            com.bxkj.student.v2.ui.my.f r5 = new com.bxkj.student.v2.ui.my.f
            r5.<init>()
            java.lang.String r6 = "确认关闭"
            java.lang.String r7 = "我再想想"
            java.lang.String r2 = "关闭个性化广告设置"
            java.lang.String r3 = "关闭后，该设备将不再展示个性化广告，但您看到的广告数量并不会减少且可能是您不感兴趣的广告"
            r1 = r8
            com.bxkj.base.v2.common.ext.ContextExtKt.g(r1, r2, r3, r4, r5, r6, r7)
            return
        L23:
            com.bxkj.base.v2.data.b r8 = r9.a()
            r9 = 1
            r8.f0(r9)
            xyz.adscope.amps.AMPSSDK.setPersonalRecommend(r9)
            return
    }

    private static final kotlin.n1 i(com.bxkj.student.v2.ui.my.AdSwitchActivity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.databinding.ViewDataBinding r1 = r1.K()
            com.bxkj.student.databinding.V2AdSwitchBinding r1 = (com.bxkj.student.databinding.V2AdSwitchBinding) r1
            com.bxkj.student.common.view.ToggleButton r1 = r1.tagAd
            r2 = 1
            r1.setChecked(r2)
            xyz.adscope.amps.AMPSSDK.setPersonalRecommend(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 j(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            r0 = 0
            r1.f0(r0)
            xyz.adscope.amps.AMPSSDK.setPersonalRecommend(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2AdSwitchBinding r0 = (com.bxkj.student.databinding.V2AdSwitchBinding) r0
            r0.setBackEvent(r2)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2AdSwitchBinding r0 = (com.bxkj.student.databinding.V2AdSwitchBinding) r0
            com.bxkj.student.common.view.ToggleButton r0 = r0.tagAd
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            boolean r1 = r1.h()
            r0.setChecked(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2AdSwitchBinding r0 = (com.bxkj.student.databinding.V2AdSwitchBinding) r0
            com.bxkj.student.common.view.ToggleButton r0 = r0.tagAd
            com.bxkj.student.v2.ui.my.g r1 = new com.bxkj.student.v2.ui.my.g
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }
}
