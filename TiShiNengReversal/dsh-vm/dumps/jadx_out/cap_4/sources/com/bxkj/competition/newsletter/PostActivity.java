package com.bxkj.competition.newsletter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PostActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private android.widget.Button Z;
    private java.lang.String a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.newsletter.PostActivity a;

        a(com.bxkj.competition.newsletter.PostActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.competition.newsletter.NewsLetterListActivity> r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.competition.newsletter.NewsLetterListActivity r2 = (com.bxkj.competition.newsletter.NewsLetterListActivity) r2
                r2.v0()
                com.bxkj.competition.newsletter.PostActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public PostActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void g0() {
            r5 = this;
            android.widget.EditText r0 = r5.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1a
            java.lang.String r0 = "请输入内容"
            r5.f0(r0)
            return
        L1a:
            android.content.Context r1 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            java.lang.Class<com.bxkj.competition.b> r2 = com.bxkj.competition.b.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            com.bxkj.competition.b r2 = (com.bxkj.competition.b) r2
            java.lang.String r3 = r5.a0
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getUserId()
            rx.e r0 = r2.y(r3, r4, r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.competition.newsletter.PostActivity$a r1 = new com.bxkj.competition.newsletter.PostActivity$a
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_post_newletter
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "competitionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.a0 = r0
        L16:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "content"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L46
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.widget.EditText r1 = r2.Y
            r1.setText(r0)
            android.widget.EditText r0 = r2.Y
            r1 = 0
            r0.setFocusable(r1)
            android.widget.EditText r0 = r2.Y
            r0.setFocusableInTouchMode(r1)
            android.widget.Button r0 = r2.Z
            r1 = 8
            r0.setVisibility(r1)
            java.lang.String r0 = "我的通讯稿"
            r2.setTitle(r0)
        L46:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "发布通讯稿"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.et_content
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            int r1 = com.bxkj.competition.R.id.bt_commit
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.bxkj.competition.R.id.bt_commit
            if (r2 != r0) goto Lb
            r1.g0()
        Lb:
            return
    }
}
