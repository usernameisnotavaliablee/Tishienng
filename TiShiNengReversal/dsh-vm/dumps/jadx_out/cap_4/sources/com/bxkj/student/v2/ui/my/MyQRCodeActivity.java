package com.bxkj.student.v2.ui.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMyQRCodeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyQRCodeActivity.kt\ncom/bxkj/student/v2/ui/my/MyQRCodeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MyQRCodeActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V2MyQrcodeBinding, com.bxkj.base.v2.base.BaseViewModel> {
    public MyQRCodeActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ui.my.MyQRCodeActivity r0, android.view.View r1) {
            g(r0, r1)
            return
    }

    public static /* synthetic */ void f(com.bxkj.student.v2.ui.my.MyQRCodeActivity r0, android.view.View r1) {
            h(r0, r1)
            return
    }

    private static final void g(com.bxkj.student.v2.ui.my.MyQRCodeActivity r2, android.view.View r3) {
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.G()
            java.lang.Class<com.bxkj.student.v2.ui.my.FullScreenCodeActivity> r1 = com.bxkj.student.v2.ui.my.FullScreenCodeActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "type"
            r1 = 1
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            r3 = 2130772072(0x7f010068, float:1.7147252E38)
            r0 = 2130772073(0x7f010069, float:1.7147254E38)
            r2.overridePendingTransition(r3, r0)
            return
    }

    private static final void h(com.bxkj.student.v2.ui.my.MyQRCodeActivity r2, android.view.View r3) {
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.G()
            java.lang.Class<com.bxkj.student.v2.ui.my.FullScreenCodeActivity> r1 = com.bxkj.student.v2.ui.my.FullScreenCodeActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "type"
            r1 = 2
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            r3 = 2130771995(0x7f01001b, float:1.7147096E38)
            r0 = 2130772073(0x7f010069, float:1.7147254E38)
            r2.overridePendingTransition(r3, r0)
            return
    }

    private final void i(android.app.Activity r2, float r3) {
            r1 = this;
            android.view.Window r2 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
            r0.screenBrightness = r3
            r2.setAttributes(r0)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MyQrcodeBinding r0 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r0
            android.widget.ImageView r0 = r0.ivCode
            com.bxkj.student.v2.ui.my.m r1 = new com.bxkj.student.v2.ui.my.m
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2MyQrcodeBinding r0 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r0
            android.widget.ImageView r0 = r0.ivBar
            com.bxkj.student.v2.ui.my.n r1 = new com.bxkj.student.v2.ui.my.n
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected void onDestroy() {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.i(r1, r0)
            super.onDestroy()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto Le
            r0 = r4
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L22
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2MyQrcodeBinding r0 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r0
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.setTitle(r1)
        L22:
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2MyQrcodeBinding r0 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r0
            r0.setBackEvent(r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.i(r4, r0)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V2MyQrcodeBinding r0 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r0
            android.widget.TextView r0 = r0.tvName
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r2 = r2.S()
            r0.setText(r2)
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r2 = r4.q()
            r0.<init>(r2)
            com.bxkj.base.v2.data.b r2 = r1.a()
            java.lang.String r2 = r2.S()
            r3 = 2131689689(0x7f0f00d9, float:1.90084E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.graphics.Bitmap r0 = r0.d(r2, r3)
            androidx.databinding.ViewDataBinding r2 = r4.K()
            com.bxkj.student.databinding.V2MyQrcodeBinding r2 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r2
            android.widget.ImageView r2 = r2.ivCode
            r2.setImageBitmap(r0)
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r2 = r4.q()
            r0.<init>(r2)
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.S()
            android.graphics.Bitmap r0 = r0.b(r1)
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.V2MyQrcodeBinding r1 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r1
            android.widget.ImageView r1 = r1.ivBar
            r1.setImageBitmap(r0)
            return
    }
}
