package com.bxkj.student.v2.ui.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAboutUsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutUsActivity.kt\ncom/bxkj/student/v2/ui/my/AboutUsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AboutUsActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V2AboutUsBinding, com.bxkj.student.v2.vm.my.AboutUsVM> {

    @org.jetbrains.annotations.NotNull
    private final android.content.BroadcastReceiver W;

    public AboutUsActivity() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.ui.my.AboutUsActivity$showHideBroadCast$1 r0 = new com.bxkj.student.v2.ui.my.AboutUsActivity$showHideBroadCast$1
            r0.<init>(r1)
            r1.W = r0
            return
    }

    private static final void P(com.bxkj.student.v2.ui.my.AboutUsActivity r2, android.widget.CompoundButton r3, boolean r4) {
            com.bxkj.base.v2.data.b$a r3 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r3 = r3.a()
            r3.l0(r4)
            androidx.fragment.app.FragmentActivity r2 = r2.q()
            androidx.localbroadcastmanager.content.LocalBroadcastManager r2 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r2)
            android.content.Intent r3 = new android.content.Intent
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            java.lang.String r0 = r0.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".FloatActionView"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            java.lang.String r0 = "isShow"
            android.content.Intent r3 = r3.putExtra(r0, r4)
            r2.sendBroadcast(r3)
            return
    }

    private static final void S(com.bxkj.student.v2.ui.my.AboutUsActivity r3, com.umeng.socialize.shareboard.SnsPlatform r4, com.umeng.socialize.bean.SHARE_MEDIA r5) {
            com.umeng.socialize.media.UMWeb r4 = new com.umeng.socialize.media.UMWeb
            java.lang.String r0 = "http://sj.qq.com/myapp/detail.htm?apkName=com.bxkj.student"
            r4.<init>(r0)
            java.lang.String r0 = "校园生活如此简单"
            r4.setTitle(r0)
            com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
            android.content.Context r1 = r3.G()
            java.lang.String r2 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
            r0.<init>(r1, r2)
            r4.setThumb(r0)
            r0 = 2131952726(0x7f130456, float:1.9541903E38)
            java.lang.String r0 = r3.getString(r0)
            r4.setDescription(r0)
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r1 = r3.q()
            r0.<init>(r1)
            com.umeng.socialize.ShareAction r5 = r0.setPlatform(r5)
            com.bxkj.student.v2.ui.my.AboutUsActivity$share$1$1 r0 = new com.bxkj.student.v2.ui.my.AboutUsActivity$share$1$1
            r0.<init>(r3)
            com.umeng.socialize.ShareAction r3 = r5.setCallback(r0)
            com.umeng.socialize.ShareAction r3 = r3.withMedia(r4)
            r3.share()
            return
    }

    private static final kotlin.n1 U(com.bxkj.student.v2.ui.my.AboutUsActivity r5, java.util.Map r6) {
            java.lang.String r0 = "versions"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
            java.lang.String r1 = "versionsName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            java.lang.String r2 = "instruction"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            java.lang.String r3 = "filePath"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
            b0.b r3 = b0.b.a
            android.content.Context r4 = r5.G()
            int r3 = r3.m(r4)
            if (r0 <= r3) goto L31
            com.bxkj.student.common.versionupdate.a r0 = new com.bxkj.student.common.versionupdate.a
            android.content.Context r5 = r5.G()
            r0.<init>(r5)
            r0.d(r1, r6, r2)
            goto L3f
        L31:
            com.bxkj.base.v2.base.BaseViewModel r6 = r5.C()
            com.bxkj.student.v2.vm.my.AboutUsVM r6 = (com.bxkj.student.v2.vm.my.AboutUsVM) r6
            com.bxkj.student.v2.ui.my.a r0 = new com.bxkj.student.v2.ui.my.a
            r0.<init>(r5)
            r6.x(r0)
        L3f:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private static final kotlin.n1 V(com.bxkj.student.v2.ui.my.AboutUsActivity r5, java.util.Map r6) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r6, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "buildVersionNo"
            int r1 = r0.k(r6, r1)
            java.lang.String r2 = "buildVersion"
            java.lang.String r2 = r0.t(r6, r2)
            java.lang.String r3 = "buildUpdateDescription"
            java.lang.String r3 = r0.t(r6, r3)
            java.lang.String r4 = "downloadURL"
            java.lang.String r6 = r0.t(r6, r4)
            b0.b r0 = b0.b.a
            android.content.Context r4 = r5.G()
            int r0 = r0.m(r4)
            if (r1 <= r0) goto L38
            com.bxkj.student.common.versionupdate.a r0 = new com.bxkj.student.common.versionupdate.a
            android.content.Context r5 = r5.G()
            r0.<init>(r5)
            r0.d(r2, r6, r3)
            goto L3d
        L38:
            java.lang.String r6 = "当前已是最新版本"
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r5, r6)
        L3d:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.my.AboutUsActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = U(r0, r1)
            return r0
    }

    public static /* synthetic */ void f(com.bxkj.student.v2.ui.my.AboutUsActivity r0, com.umeng.socialize.shareboard.SnsPlatform r1, com.umeng.socialize.bean.SHARE_MEDIA r2) {
            S(r0, r1, r2)
            return
    }

    public static /* synthetic */ void g(com.bxkj.student.v2.ui.my.AboutUsActivity r0, android.widget.CompoundButton r1, boolean r2) {
            P(r0, r1, r2)
            return
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.my.AboutUsActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = V(r0, r1)
            return r0
    }

    public final void L() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.my.AdSwitchActivity> r2 = com.bxkj.student.v2.ui.my.AdSwitchActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void M() {
            r5 = this;
            com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r1 = r5.q()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = "name"
            java.lang.String r4 = "用户协议"
            r2.put(r3, r4)
            com.bxkj.student.v2.retrofit.b$a r3 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "linkUrl"
            r2.put(r4, r3)
            kotlin.n1 r3 = kotlin.n1.a
            r0.b(r1, r2)
            return
    }

    public final void N() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.my.BugReportActivity> r2 = com.bxkj.student.v2.ui.my.BugReportActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.content.BroadcastReceiver O() {
            r1 = this;
            android.content.BroadcastReceiver r0 = r1.W
            return r0
    }

    public final void Q() {
            r5 = this;
            com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r1 = r5.q()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = "name"
            java.lang.String r4 = "隐私政策"
            r2.put(r3, r4)
            com.bxkj.student.v2.retrofit.b$a r3 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "linkUrl"
            r2.put(r4, r3)
            kotlin.n1 r3 = kotlin.n1.a
            r0.b(r1, r2)
            return
    }

    public final void R() {
            r4 = this;
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            r0.<init>(r1)
            r1 = 4
            com.umeng.socialize.bean.SHARE_MEDIA[] r1 = new com.umeng.socialize.bean.SHARE_MEDIA[r1]
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r3 = 0
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r3 = 1
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r3 = 2
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r3 = 3
            r1[r3] = r2
            com.umeng.socialize.ShareAction r0 = r0.setDisplayList(r1)
            com.bxkj.student.v2.ui.my.b r1 = new com.bxkj.student.v2.ui.my.b
            r1.<init>(r4)
            com.umeng.socialize.ShareAction r0 = r0.setShareboardclickCallback(r1)
            r0.open()
            return
    }

    public final void T() {
            r2 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.my.AboutUsVM r0 = (com.bxkj.student.v2.vm.my.AboutUsVM) r0
            com.bxkj.student.v2.ui.my.c r1 = new com.bxkj.student.v2.ui.my.c
            r1.<init>(r2)
            r0.y(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected void onDestroy() {
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.q()
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.BroadcastReceiver r1 = r2.W
            r0.unregisterReceiver(r1)
            super.onDestroy()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto Le
            r0 = r5
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L22
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AboutUsBinding r0 = (com.bxkj.student.databinding.V2AboutUsBinding) r0
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.setTitle(r1)
        L22:
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AboutUsBinding r0 = (com.bxkj.student.databinding.V2AboutUsBinding) r0
            r0.setBackEvent(r5)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AboutUsBinding r0 = (com.bxkj.student.databinding.V2AboutUsBinding) r0
            r0.setActivity(r5)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AboutUsBinding r0 = (com.bxkj.student.databinding.V2AboutUsBinding) r0
            com.bxkj.student.common.view.ToggleButton r0 = r0.tagFloatButton
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            boolean r1 = r1.n()
            r0.setChecked(r1)
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.V2AboutUsBinding r0 = (com.bxkj.student.databinding.V2AboutUsBinding) r0
            com.bxkj.student.common.view.ToggleButton r0 = r0.tagFloatButton
            com.bxkj.student.v2.ui.my.d r1 = new com.bxkj.student.v2.ui.my.d
            r1.<init>(r5)
            r0.setOnCheckedChangeListener(r1)
            androidx.fragment.app.FragmentActivity r0 = r5.q()
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.BroadcastReceiver r1 = r5.W
            android.content.IntentFilter r2 = new android.content.IntentFilter
            com.bxkj.student.App$a r3 = com.bxkj.student.App.d
            com.bxkj.student.App r3 = r3.a()
            java.lang.String r3 = r3.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ".FloatActionView"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            r0.registerReceiver(r1, r2)
            return
    }
}
