package com.bxkj.student.v2.ui.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FullScreenCodeActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V2DialogQrCodeBinding, com.bxkj.base.v2.base.BaseViewModel> {
    private int W;

    public FullScreenCodeActivity() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.W = r0
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ui.my.FullScreenCodeActivity r0, android.view.View r1) {
            f(r0, r1)
            return
    }

    private static final void f(com.bxkj.student.v2.ui.my.FullScreenCodeActivity r0, android.view.View r1) {
            r0.finish()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.V2DialogQrCodeBinding r0 = (com.bxkj.student.databinding.V2DialogQrCodeBinding) r0
            android.widget.FrameLayout r0 = r0.root
            com.bxkj.student.v2.ui.my.l r1 = new com.bxkj.student.v2.ui.my.l
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "type"
            boolean r0 = r0.hasExtra(r1)
            r2 = 1
            if (r0 == 0) goto L17
            android.content.Intent r0 = r3.getIntent()
            int r0 = r0.getIntExtra(r1, r2)
            r3.W = r0
        L17:
            int r0 = r3.W
            if (r0 != r2) goto L45
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r1 = r3.q()
            r0.<init>(r1)
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.S()
            r2 = 2131689689(0x7f0f00d9, float:1.90084E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Bitmap r0 = r0.f(r1, r2)
            androidx.databinding.ViewDataBinding r1 = r3.K()
            com.bxkj.student.databinding.V2DialogQrCodeBinding r1 = (com.bxkj.student.databinding.V2DialogQrCodeBinding) r1
            android.widget.ImageView r1 = r1.iv
            r1.setImageBitmap(r0)
            return
        L45:
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r1 = r3.q()
            r0.<init>(r1)
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.S()
            android.graphics.Bitmap r0 = r0.c(r1)
            androidx.databinding.ViewDataBinding r1 = r3.K()
            com.bxkj.student.databinding.V2DialogQrCodeBinding r1 = (com.bxkj.student.databinding.V2DialogQrCodeBinding) r1
            android.widget.ImageView r1 = r1.iv
            r1.setImageBitmap(r0)
            return
    }
}
