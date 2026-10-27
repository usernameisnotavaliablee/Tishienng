package com.bxkj.base.auth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AuthorizationDialog extends androidx.fragment.app.DialogFragment {
    private com.bxkj.base.auth.AuthorizationDialog.c c;
    private int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.base.auth.AuthorizationDialog a;

        a(com.bxkj.base.auth.AuthorizationDialog r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.base.auth.AuthorizationDialog r1 = r0.a
                com.bxkj.base.auth.AuthorizationDialog.c(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.auth.AuthorizationDialog a;

        b(com.bxkj.base.auth.AuthorizationDialog r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.base.auth.AuthorizationDialog r1 = r0.a
                r1.dismiss()
                com.bxkj.base.auth.AuthorizationDialog r1 = r0.a
                com.bxkj.base.auth.AuthorizationDialog$c r1 = com.bxkj.base.auth.AuthorizationDialog.b(r1)
                if (r1 == 0) goto L16
                com.bxkj.base.auth.AuthorizationDialog r1 = r0.a
                com.bxkj.base.auth.AuthorizationDialog$c r1 = com.bxkj.base.auth.AuthorizationDialog.b(r1)
                r1.a()
            L16:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a();
    }

    public AuthorizationDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.auth.AuthorizationDialog.c b(com.bxkj.base.auth.AuthorizationDialog r0) {
            com.bxkj.base.auth.AuthorizationDialog$c r0 = r0.c
            return r0
    }

    static /* bridge */ /* synthetic */ void c(com.bxkj.base.auth.AuthorizationDialog r0) {
            r0.d()
            return
    }

    private void d() {
            r8 = this;
            int r0 = r8.d
            if (r0 != 0) goto L43
            java.lang.Class<w.g> r0 = w.g.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            w.g r1 = (w.g) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getSchoolId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r0.getUserId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r0.getRealName()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r0.getSex()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r0.getAccount()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r0.getPhone()
            rx.e r0 = r1.D(r2, r3, r4, r5, r6, r7)
            goto L18c
        L43:
            r1 = 1
            if (r0 != r1) goto L85
            java.lang.Class<w.e> r0 = w.e.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            w.e r1 = (w.e) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getSchoolId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r0.getUserId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r0.getRealName()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r0.getSex()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r0.getAccount()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r0.getPhone()
            rx.e r0 = r1.e(r2, r3, r4, r5, r6, r7)
            goto L18c
        L85:
            r1 = 2
            if (r0 != r1) goto Lc7
            java.lang.Class<w.i> r0 = w.i.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            w.i r1 = (w.i) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getSchoolId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r0.getUserId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r0.getRealName()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r0.getSex()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r0.getAccount()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r0.getPhone()
            rx.e r0 = r1.h(r2, r3, r4, r5, r6, r7)
            goto L18c
        Lc7:
            r1 = 3
            if (r0 != r1) goto L109
            java.lang.Class<w.d> r0 = w.d.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            w.d r1 = (w.d) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getSchoolId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r0.getUserId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r0.getRealName()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r0.getSex()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r0.getAccount()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r0.getPhone()
            rx.e r0 = r1.c(r2, r3, r4, r5, r6, r7)
            goto L18c
        L109:
            r1 = 4
            if (r0 != r1) goto L14a
            java.lang.Class<w.h> r0 = w.h.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            w.h r1 = (w.h) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getSchoolId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r0.getUserId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r0.getRealName()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r0.getSex()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r0.getAccount()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r0.getPhone()
            rx.e r0 = r1.f(r2, r3, r4, r5, r6, r7)
            goto L18c
        L14a:
            r1 = 5
            if (r0 != r1) goto L18b
            java.lang.Class<w.b> r0 = w.b.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            w.b r1 = (w.b) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getSchoolId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r0.getUserId()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r0.getRealName()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r0.getSex()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r0.getAccount()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r0.getPhone()
            rx.e r0 = r1.g(r2, r3, r4, r5, r6, r7)
            goto L18c
        L18b:
            r0 = 0
        L18c:
            android.content.Context r1 = r8.getContext()
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.base.auth.AuthorizationDialog$b r1 = new com.bxkj.base.auth.AuthorizationDialog$b
            r1.<init>(r8)
            r0.setDataListener(r1)
            return
    }

    public androidx.fragment.app.DialogFragment e(int r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public com.bxkj.base.auth.AuthorizationDialog f(com.bxkj.base.auth.AuthorizationDialog.c r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View onCreateView(android.view.LayoutInflater r3, @androidx.annotation.Nullable android.view.ViewGroup r4, android.os.Bundle r5) {
            r2 = this;
            int r5 = com.bxkj.base.R.layout.dialog_authorization
            android.view.View r3 = r3.inflate(r5, r4)
            int r4 = com.bxkj.base.R.id.bt_ok
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = com.bxkj.base.R.id.tv_name
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r0 = r2.d
            if (r0 != 0) goto L20
            int r0 = com.bxkj.base.R.string.app_mall
            r5.setText(r0)
            goto L4c
        L20:
            r1 = 1
            if (r0 != r1) goto L29
            java.lang.String r0 = "帮帮忙"
            r5.setText(r0)
            goto L4c
        L29:
            r1 = 2
            if (r0 != r1) goto L32
            java.lang.String r0 = "二手市场"
            r5.setText(r0)
            goto L4c
        L32:
            r1 = 3
            if (r0 != r1) goto L3b
            java.lang.String r0 = "求职招聘"
            r5.setText(r0)
            goto L4c
        L3b:
            r1 = 4
            if (r0 != r1) goto L44
            java.lang.String r0 = "跑腿"
            r5.setText(r0)
            goto L4c
        L44:
            r1 = 5
            if (r0 != r1) goto L4c
            java.lang.String r0 = "捐赠寄卖"
            r5.setText(r0)
        L4c:
            com.bxkj.base.auth.AuthorizationDialog$a r5 = new com.bxkj.base.auth.AuthorizationDialog$a
            r5.<init>(r2)
            r4.setOnClickListener(r5)
            return r3
    }
}
