package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PaySuccessActivity extends cn.bluemobi.dylan.base.BaseActivity {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.life.mall.order.PaySuccessActivity b;

        a(com.bxkj.student.life.mall.order.PaySuccessActivity r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.bxkj.student.life.mall.order.PaySuccessActivity r4 = r3.b
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.life.mall.order.PaySuccessActivity r1 = r3.b
                android.content.Context r1 = com.bxkj.student.life.mall.order.PaySuccessActivity.g0(r1)
                java.lang.Class<com.bxkj.student.life.mall.order.OrderDetailActivity> r2 = com.bxkj.student.life.mall.order.OrderDetailActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "orderId"
                java.lang.String r2 = r3.a
                android.content.Intent r0 = r0.putExtra(r1, r2)
                r4.startActivity(r0)
                com.bxkj.student.life.mall.order.PaySuccessActivity r4 = r3.b
                r4.finish()
                return
        }
    }

    public PaySuccessActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.student.life.mall.order.PaySuccessActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493018(0x7f0c009a, float:1.8609504E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "orderId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L25
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r1 = 2131296624(0x7f090170, float:1.821117E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            com.bxkj.student.life.mall.order.PaySuccessActivity$a r2 = new com.bxkj.student.life.mall.order.PaySuccessActivity$a
            r2.<init>(r3, r0)
            r1.setOnClickListener(r2)
        L25:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "支付结果"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
