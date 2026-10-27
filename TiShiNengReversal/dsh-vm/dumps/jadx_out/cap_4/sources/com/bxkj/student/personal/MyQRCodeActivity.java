package com.bxkj.student.personal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyQRCodeActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.ImageView Y;
    private android.widget.ImageView Z;

    public MyQRCodeActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void g0(android.app.Activity r2, float r3) {
            r1 = this;
            android.view.Window r2 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
            r0.screenBrightness = r3
            r2.setAttributes(r0)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492979(0x7f0c0073, float:1.8609425E38)
            return r0
    }

    public void R() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.g0(r3, r0)
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r1 = r3.W
            r0.<init>(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            r2 = 2131689689(0x7f0f00d9, float:1.90084E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Bitmap r0 = r0.f(r1, r2)
            android.widget.ImageView r1 = r3.Y
            r1.setImageBitmap(r0)
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r1 = r3.W
            r0.<init>(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            android.graphics.Bitmap r0 = r0.b(r1)
            android.widget.ImageView r1 = r3.Z
            r1.setImageBitmap(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的二维码"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131297217(0x7f0903c1, float:1.8212373E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.Y = r1
            r1 = 2131297112(0x7f090358, float:1.821216E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.g0(r1, r0)
            super.onDestroy()
            return
    }
}
