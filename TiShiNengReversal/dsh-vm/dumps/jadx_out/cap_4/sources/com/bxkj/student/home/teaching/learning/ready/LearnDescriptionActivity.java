package com.bxkj.student.home.teaching.learning.ready;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LearnDescriptionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button Y;
    private cn.bluemobi.dylan.smartwebview.SmartWebView Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity a;

        a(com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r0 = r2.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.g0(r0)
                java.lang.String r1 = "content"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                r0.h(r3)
                com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r3 = r2.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r3 = com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.g0(r3)
                android.webkit.WebView r3 = r3.getWebView()
                android.webkit.WebSettings r3 = r3.getSettings()
                android.webkit.WebSettings$TextSize r0 = android.webkit.WebSettings.TextSize.LARGEST
                r3.setTextSize(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.b b;

            a(com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity$b r2 = r1.b
                    com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r2 = r2.a
                    java.util.Map r0 = r1.a
                    com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.h0(r2, r0)
                    return
            }
        }

        b(com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3, java.lang.String r4) {
                r2 = this;
                super.netOnSuccess(r3, r4)
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L2e
                java.lang.String r0 = "null"
                boolean r0 = r0.equalsIgnoreCase(r4)
                if (r0 == 0) goto L12
                goto L2e
            L12:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r1 = r2.a
                android.content.Context r1 = com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.i0(r1)
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r0.setMessage(r4)
                com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity$b$a r0 = new com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity$b$a
                r0.<init>(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r4.setButtonOnClickListener(r0)
                r3.show()
                return
            L2e:
                com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r4 = r2.a
                com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.h0(r4, r3)
                return
        }
    }

    public LearnDescriptionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView g0(com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r0, java.util.Map r1) {
            r0.j0(r1)
            return
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void j0(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "data"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r0)
            r0 = 1
            if (r3 != r0) goto L16
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity> r1 = com.bxkj.student.home.teaching.learning.ready.SelectLessonActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            goto L22
        L16:
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.learning.LearnHomeListActivity> r1 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
        L22:
            r2.startActivity(r3)
            r2.finish()
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Y
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492998(0x7f0c0086, float:1.8609464E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            rx.e r1 = r1.s()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity$a r1 = new com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity$a
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "在线学习说明"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131296646(0x7f090186, float:1.8211215E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.Y = r2
            r2 = 2131298609(0x7f090931, float:1.8215196E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r2
            r1.Z = r2
            android.widget.Button r2 = r1.Y
            java.lang.String r0 = "开始学习"
            r2.setText(r0)
            android.widget.FrameLayout r2 = r1.P()
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            if (r2 == r0) goto La
            return
        La:
            android.content.Context r2 = r1.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideSuccessMessage()
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
            rx.e r0 = r0.q()
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.setObservable(r0)
            com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity$b r0 = new com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity$b
            r0.<init>(r1)
            r2.setDataListener(r0)
            return
    }
}
