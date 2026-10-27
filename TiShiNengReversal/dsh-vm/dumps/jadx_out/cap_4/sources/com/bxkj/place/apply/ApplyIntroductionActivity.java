package com.bxkj.place.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyIntroductionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private int Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.place.apply.ApplyIntroductionActivity a;

        a(com.bxkj.place.apply.ApplyIntroductionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.place.apply.ApplyIntroductionActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.place.apply.ApplyIntroductionActivity.g0(r0)
                java.lang.String r1 = "data"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.setText(r3)
                return
        }
    }

    public ApplyIntroductionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.widget.TextView g0(com.bxkj.place.apply.ApplyIntroductionActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.place.R.layout.ac_place_apply_description
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<c0.b> r1 = c0.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            c0.b r1 = (c0.b) r1
            int r2 = r3.Z
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.place.apply.ApplyIntroductionActivity$a r1 = new com.bxkj.place.apply.ApplyIntroductionActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "appointType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L17
            android.content.Intent r0 = r3.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r3.Z = r0
        L17:
            int r0 = r3.Z
            r1 = 2
            if (r0 != r1) goto L1f
            java.lang.String r0 = "申请场地说明"
            goto L21
        L1f:
            java.lang.String r0 = "预约场地说明"
        L21:
            r3.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.place.R.id.tv_description
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
