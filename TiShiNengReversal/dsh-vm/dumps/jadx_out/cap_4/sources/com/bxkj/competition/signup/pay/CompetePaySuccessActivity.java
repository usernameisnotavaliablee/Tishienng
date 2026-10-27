package com.bxkj.competition.signup.pay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CompetePaySuccessActivity extends cn.bluemobi.dylan.base.BaseActivity {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.competition.signup.pay.CompetePaySuccessActivity a;

        a(com.bxkj.competition.signup.pay.CompetePaySuccessActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.bxkj.competition.signup.pay.CompetePaySuccessActivity r4 = r3.a
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.competition.signup.pay.CompetePaySuccessActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.competition.signup.pay.CompetePaySuccessActivity.g0(r1)
                java.lang.Class<com.bxkj.competition.signup.my.MyCompetitionListActivity> r2 = com.bxkj.competition.signup.my.MyCompetitionListActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                com.bxkj.competition.signup.pay.CompetePaySuccessActivity r4 = r3.a
                r4.finish()
                return
        }
    }

    public CompetePaySuccessActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.competition.signup.pay.CompetePaySuccessActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_pay_success
            return r0
    }

    public void R() {
            r2 = this;
            int r0 = com.bxkj.competition.R.id.bt_order
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.String r1 = "查看报名"
            r0.setText(r1)
            com.bxkj.competition.signup.pay.CompetePaySuccessActivity$a r1 = new com.bxkj.competition.signup.pay.CompetePaySuccessActivity$a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
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
