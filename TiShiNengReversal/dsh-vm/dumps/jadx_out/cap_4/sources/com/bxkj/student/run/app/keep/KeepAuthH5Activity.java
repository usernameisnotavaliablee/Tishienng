package com.bxkj.student.run.app.keep;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class KeepAuthH5Activity extends cn.bluemobi.dylan.base.BaseActivity {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String Y;
    private cn.bluemobi.dylan.smartwebview.SmartWebView Z;

    public KeepAuthH5Activity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "https://open.gotokeep.com/v1/oauth2/authorize?client_id=6005515ea85bc94dde5e3df7&redirect_uri=https://keep.boxkj.com/redirect&response_type=code&state=STATE"
            r1.Y = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.keep.KeepAuthH5Activity r0, android.view.View r1) {
            h0(r0, r1)
            return
    }

    private static final void h0(com.bxkj.student.run.app.keep.KeepAuthH5Activity r0, android.view.View r1) {
            r0.finish()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492956(0x7f0c005c, float:1.8609379E38)
            return r0
    }

    public void R() {
            r5 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r5.Z
            r1 = 0
            java.lang.String r2 = "smartWebView"
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        Lb:
            android.webkit.WebView r0 = r0.getWebView()
            android.webkit.WebSettings r3 = r0.getSettings()
            android.webkit.WebSettings$LayoutAlgorithm r4 = android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS
            r3.setLayoutAlgorithm(r4)
            cn.bluemobi.dylan.smartwebview.SmartWebView r3 = r5.Z
            if (r3 != 0) goto L20
            kotlin.jvm.internal.g0.S(r2)
            goto L21
        L20:
            r1 = r3
        L21:
            java.lang.String r2 = r5.Y
            r1.j(r2)
            java.lang.String r1 = "keep"
            r0.addJavascriptInterface(r5, r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "绑定Keep账号"
            r1.setTitle(r0)
            return
    }

    public void T(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298538(0x7f0908ea, float:1.8215052E38)
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r2
            r1.Z = r2
            return
    }

    @android.webkit.JavascriptInterface
    public final void getKeepToken(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "token"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "token="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setKeepToken(r3)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r2.V
            r3.<init>(r0)
            java.lang.String r0 = "绑定keep账号成功！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
            com.bxkj.student.run.app.keep.a r0 = new com.bxkj.student.run.app.keep.a
            r0.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r0)
            r3.show()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String i0() {
            r1 = this;
            java.lang.String r0 = r1.Y
            return r0
    }

    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            return
    }
}
