package com.bxkj.base.auth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private android.content.Context a;
    private com.bxkj.base.auth.a.g b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.base.auth.a$a, reason: collision with other inner class name */
    class C0045a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ androidx.fragment.app.FragmentManager a;
        final /* synthetic */ com.bxkj.base.auth.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.base.auth.a$a$a, reason: collision with other inner class name */
        class C0046a implements com.bxkj.base.auth.AuthorizationDialog.c {
            final /* synthetic */ com.bxkj.base.auth.a.C0045a a;

            C0046a(com.bxkj.base.auth.a.C0045a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.AuthorizationDialog.c
            public void a() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 1
                    r0.setAuthorizationInMall(r1)
                    com.bxkj.base.auth.a$a r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    if (r0 == 0) goto L1d
                    com.bxkj.base.auth.a$a r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    r0.a()
                L1d:
                    return
            }
        }

        C0045a(com.bxkj.base.auth.a r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r1)
                r0.setAuthorizationInMall(r3)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r3 = r3.isAuthorizationInMall()
                if (r3 == 0) goto L29
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                if (r3 == 0) goto L28
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                r3.a()
            L28:
                return
            L29:
                com.bxkj.base.auth.AuthorizationDialog r3 = new com.bxkj.base.auth.AuthorizationDialog
                r3.<init>()
                com.bxkj.base.auth.a$a$a r0 = new com.bxkj.base.auth.a$a$a
                r0.<init>(r2)
                com.bxkj.base.auth.AuthorizationDialog r3 = r3.f(r0)
                r0 = 0
                androidx.fragment.app.DialogFragment r3 = r3.e(r0)
                androidx.fragment.app.FragmentManager r0 = r2.a
                java.lang.String r1 = "mall"
                r3.show(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ androidx.fragment.app.FragmentManager a;
        final /* synthetic */ com.bxkj.base.auth.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.base.auth.a$b$a, reason: collision with other inner class name */
        class C0047a implements com.bxkj.base.auth.AuthorizationDialog.c {
            final /* synthetic */ com.bxkj.base.auth.a.b a;

            C0047a(com.bxkj.base.auth.a.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.AuthorizationDialog.c
            public void a() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 1
                    r0.setAuthorizationInLost(r1)
                    com.bxkj.base.auth.a$b r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    if (r0 == 0) goto L1d
                    com.bxkj.base.auth.a$b r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    r0.a()
                L1d:
                    return
            }
        }

        b(com.bxkj.base.auth.a r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r1)
                r0.setAuthorizationInLost(r3)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r3 = r3.isAuthorizationInLost()
                if (r3 == 0) goto L29
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                if (r3 == 0) goto L28
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                r3.a()
            L28:
                return
            L29:
                com.bxkj.base.auth.AuthorizationDialog r3 = new com.bxkj.base.auth.AuthorizationDialog
                r3.<init>()
                com.bxkj.base.auth.a$b$a r0 = new com.bxkj.base.auth.a$b$a
                r0.<init>(r2)
                com.bxkj.base.auth.AuthorizationDialog r3 = r3.f(r0)
                r0 = 1
                androidx.fragment.app.DialogFragment r3 = r3.e(r0)
                androidx.fragment.app.FragmentManager r0 = r2.a
                java.lang.String r1 = "mall"
                r3.show(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ androidx.fragment.app.FragmentManager a;
        final /* synthetic */ com.bxkj.base.auth.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.base.auth.a$c$a, reason: collision with other inner class name */
        class C0048a implements com.bxkj.base.auth.AuthorizationDialog.c {
            final /* synthetic */ com.bxkj.base.auth.a.c a;

            C0048a(com.bxkj.base.auth.a.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.AuthorizationDialog.c
            public void a() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 1
                    r0.setAuthorizationInSecondHand(r1)
                    com.bxkj.base.auth.a$c r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    if (r0 == 0) goto L1d
                    com.bxkj.base.auth.a$c r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    r0.a()
                L1d:
                    return
            }
        }

        c(com.bxkj.base.auth.a r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r1)
                r0.setAuthorizationInSecondHand(r3)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r3 = r3.isAuthorizationInSecondHand()
                if (r3 == 0) goto L29
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                if (r3 == 0) goto L28
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                r3.a()
            L28:
                return
            L29:
                com.bxkj.base.auth.AuthorizationDialog r3 = new com.bxkj.base.auth.AuthorizationDialog
                r3.<init>()
                com.bxkj.base.auth.a$c$a r0 = new com.bxkj.base.auth.a$c$a
                r0.<init>(r2)
                com.bxkj.base.auth.AuthorizationDialog r3 = r3.f(r0)
                r0 = 2
                androidx.fragment.app.DialogFragment r3 = r3.e(r0)
                androidx.fragment.app.FragmentManager r0 = r2.a
                java.lang.String r1 = "secondHand"
                r3.show(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ androidx.fragment.app.FragmentManager a;
        final /* synthetic */ com.bxkj.base.auth.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.base.auth.a$d$a, reason: collision with other inner class name */
        class C0049a implements com.bxkj.base.auth.AuthorizationDialog.c {
            final /* synthetic */ com.bxkj.base.auth.a.d a;

            C0049a(com.bxkj.base.auth.a.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.AuthorizationDialog.c
            public void a() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 1
                    r0.setAuthorizationInJob(r1)
                    com.bxkj.base.auth.a$d r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    if (r0 == 0) goto L1d
                    com.bxkj.base.auth.a$d r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    r0.a()
                L1d:
                    return
            }
        }

        d(com.bxkj.base.auth.a r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r1)
                r0.setAuthorizationInJob(r3)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r3 = r3.isAuthorizationInJob()
                if (r3 == 0) goto L29
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                if (r3 == 0) goto L28
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                r3.a()
            L28:
                return
            L29:
                com.bxkj.base.auth.AuthorizationDialog r3 = new com.bxkj.base.auth.AuthorizationDialog
                r3.<init>()
                com.bxkj.base.auth.a$d$a r0 = new com.bxkj.base.auth.a$d$a
                r0.<init>(r2)
                com.bxkj.base.auth.AuthorizationDialog r3 = r3.f(r0)
                r0 = 3
                androidx.fragment.app.DialogFragment r3 = r3.e(r0)
                androidx.fragment.app.FragmentManager r0 = r2.a
                java.lang.String r1 = "job"
                r3.show(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ androidx.fragment.app.FragmentManager a;
        final /* synthetic */ com.bxkj.base.auth.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.base.auth.a$e$a, reason: collision with other inner class name */
        class C0050a implements com.bxkj.base.auth.AuthorizationDialog.c {
            final /* synthetic */ com.bxkj.base.auth.a.e a;

            C0050a(com.bxkj.base.auth.a.e r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.AuthorizationDialog.c
            public void a() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 1
                    r0.setAuthorizationInRuner(r1)
                    com.bxkj.base.auth.a$e r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    if (r0 == 0) goto L1d
                    com.bxkj.base.auth.a$e r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    r0.a()
                L1d:
                    return
            }
        }

        e(com.bxkj.base.auth.a r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r1)
                r0.setAuthorizationInRuner(r3)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r3 = r3.isAuthorizationInRuner()
                if (r3 == 0) goto L29
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                if (r3 == 0) goto L28
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                r3.a()
            L28:
                return
            L29:
                com.bxkj.base.auth.AuthorizationDialog r3 = new com.bxkj.base.auth.AuthorizationDialog
                r3.<init>()
                com.bxkj.base.auth.a$e$a r0 = new com.bxkj.base.auth.a$e$a
                r0.<init>(r2)
                com.bxkj.base.auth.AuthorizationDialog r3 = r3.f(r0)
                r0 = 4
                androidx.fragment.app.DialogFragment r3 = r3.e(r0)
                androidx.fragment.app.FragmentManager r0 = r2.a
                java.lang.String r1 = "job"
                r3.show(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ androidx.fragment.app.FragmentManager a;
        final /* synthetic */ com.bxkj.base.auth.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.base.auth.a$f$a, reason: collision with other inner class name */
        class C0051a implements com.bxkj.base.auth.AuthorizationDialog.c {
            final /* synthetic */ com.bxkj.base.auth.a.f a;

            C0051a(com.bxkj.base.auth.a.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.AuthorizationDialog.c
            public void a() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 1
                    r0.setAuthorizationDonation(r1)
                    com.bxkj.base.auth.a$f r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    if (r0 == 0) goto L1d
                    com.bxkj.base.auth.a$f r0 = r2.a
                    com.bxkj.base.auth.a r0 = r0.b
                    com.bxkj.base.auth.a$g r0 = com.bxkj.base.auth.a.a(r0)
                    r0.a()
                L1d:
                    return
            }
        }

        f(com.bxkj.base.auth.a r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "data"
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r1)
                r0.setAuthorizationDonation(r3)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r3 = r3.isAuthorizationDonation()
                if (r3 == 0) goto L29
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                if (r3 == 0) goto L28
                com.bxkj.base.auth.a r3 = r2.b
                com.bxkj.base.auth.a$g r3 = com.bxkj.base.auth.a.a(r3)
                r3.a()
            L28:
                return
            L29:
                com.bxkj.base.auth.AuthorizationDialog r3 = new com.bxkj.base.auth.AuthorizationDialog
                r3.<init>()
                com.bxkj.base.auth.a$f$a r0 = new com.bxkj.base.auth.a$f$a
                r0.<init>(r2)
                com.bxkj.base.auth.AuthorizationDialog r3 = r3.f(r0)
                r0 = 5
                androidx.fragment.app.DialogFragment r3 = r3.e(r0)
                androidx.fragment.app.FragmentManager r0 = r2.a
                java.lang.String r1 = "donation"
                r3.show(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g {
        void a();
    }

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.auth.a.g a(com.bxkj.base.auth.a r0) {
            com.bxkj.base.auth.a$g r0 = r0.b
            return r0
    }

    private void c(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationDonation()
            if (r0 == 0) goto L12
            com.bxkj.base.auth.a$g r4 = r3.b
            if (r4 == 0) goto L11
            r4.a()
        L11:
            return
        L12:
            android.content.Context r0 = r3.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.b> r1 = w.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.b r1 = (w.b) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.auth.a$f r1 = new com.bxkj.base.auth.a$f
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    private void d(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInJob()
            if (r0 == 0) goto L12
            com.bxkj.base.auth.a$g r4 = r3.b
            if (r4 == 0) goto L11
            r4.a()
        L11:
            return
        L12:
            android.content.Context r0 = r3.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.d> r1 = w.d.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.d r1 = (w.d) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r1 = r1.j(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.auth.a$d r1 = new com.bxkj.base.auth.a$d
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    private void e(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInLost()
            if (r0 == 0) goto L12
            com.bxkj.base.auth.a$g r4 = r3.b
            if (r4 == 0) goto L11
            r4.a()
        L11:
            return
        L12:
            android.content.Context r0 = r3.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.e> r1 = w.e.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r1 = (w.e) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.auth.a$b r1 = new com.bxkj.base.auth.a$b
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    private void f(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInMall()
            if (r0 == 0) goto L12
            com.bxkj.base.auth.a$g r4 = r3.b
            if (r4 == 0) goto L11
            r4.a()
        L11:
            return
        L12:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getOpenId()
            android.content.Context r1 = r3.a
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            java.lang.Class<w.g> r2 = w.g.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            w.g r2 = (w.g) r2
            rx.e r0 = r2.z(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.base.auth.a$a r1 = new com.bxkj.base.auth.a$a
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    private void g(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInRuner()
            if (r0 == 0) goto L12
            com.bxkj.base.auth.a$g r4 = r3.b
            if (r4 == 0) goto L11
            r4.a()
        L11:
            return
        L12:
            android.content.Context r0 = r3.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.h> r1 = w.h.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.h r1 = (w.h) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r1 = r1.c(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.auth.a$e r1 = new com.bxkj.base.auth.a$e
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    private void h(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInSecondHand()
            if (r0 == 0) goto L12
            com.bxkj.base.auth.a$g r4 = r3.b
            if (r4 == 0) goto L11
            r4.a()
        L11:
            return
        L12:
            android.content.Context r0 = r3.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.i> r1 = w.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.i r1 = (w.i) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.auth.a$c r1 = new com.bxkj.base.auth.a$c
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    public com.bxkj.base.auth.a b(androidx.fragment.app.FragmentManager r3, int r4) {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L1d
            android.content.Context r3 = r2.a
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r0 = "com.bxkj.student"
            java.lang.String r1 = "com.bxkj.student.personal.login.LoginActivity"
            android.content.Intent r4 = r4.setClassName(r0, r1)
            r3.startActivity(r4)
            return r2
        L1d:
            if (r4 != 0) goto L23
            r2.f(r3)
            return r2
        L23:
            r0 = 1
            if (r4 != r0) goto L2a
            r2.e(r3)
            return r2
        L2a:
            r0 = 2
            if (r4 != r0) goto L31
            r2.h(r3)
            return r2
        L31:
            r0 = 3
            if (r4 != r0) goto L38
            r2.d(r3)
            return r2
        L38:
            r0 = 4
            if (r4 != r0) goto L3f
            r2.g(r3)
            return r2
        L3f:
            r0 = 5
            if (r4 != r0) goto L45
            r2.c(r3)
        L45:
            return r2
    }

    public com.bxkj.base.auth.a i(com.bxkj.base.auth.a.g r1) {
            r0 = this;
            r0.b = r1
            return r0
    }
}
