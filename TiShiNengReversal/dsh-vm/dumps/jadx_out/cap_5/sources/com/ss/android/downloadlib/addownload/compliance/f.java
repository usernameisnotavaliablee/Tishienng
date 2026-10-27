package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    private java.lang.ref.SoftReference<android.app.Activity> a;

    class a implements com.ss.android.downloadlib.a.e.InterfaceC0189a<java.lang.Boolean, java.lang.Object> {
        final /* synthetic */ long a;
        final /* synthetic */ long b;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.f c;

        a(com.ss.android.downloadlib.addownload.compliance.f r1, long r2, long r4) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r4
                r0.<init>()
                return
        }

        public java.lang.Object a(java.lang.Boolean r5) {
                r4 = this;
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L1b
                com.ss.android.downloadlib.addownload.compliance.f r5 = r4.c
                long r0 = r4.a
                long r2 = r4.b
                long r0 = com.ss.android.downloadlib.addownload.o.j.b(r0, r2)
                r5.b(r0)
                java.lang.String r5 = "lp_app_dialog_try_show"
                long r0 = r4.b
                com.ss.android.downloadlib.addownload.compliance.a.f(r5, r0)
                goto L22
            L1b:
                com.ss.android.downloadlib.addownload.compliance.f r5 = r4.c
                long r0 = r4.b
                r5.i(r0)
            L22:
                r5 = 0
                return r5
        }

        @Override // com.ss.android.downloadlib.a.e.InterfaceC0189a
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                java.lang.Object r1 = r0.a(r1)
                return r1
        }
    }

    class b implements com.ss.android.downloadlib.a.e.InterfaceC0189a<java.lang.String, java.lang.Boolean> {
        final /* synthetic */ long a;
        final /* synthetic */ long b;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.f c;

        class a implements v2.q {
            final /* synthetic */ boolean[] a;
            final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.f.b b;

            a(com.ss.android.downloadlib.addownload.compliance.f.b r1, boolean[] r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void j(java.lang.String r9) {
                    r8 = this;
                    boolean[] r0 = r8.a
                    com.ss.android.downloadlib.addownload.compliance.f$b r1 = r8.b
                    com.ss.android.downloadlib.addownload.compliance.f r2 = r1.c
                    long r3 = r1.a
                    long r5 = r1.b
                    r7 = r9
                    boolean r9 = com.ss.android.downloadlib.addownload.compliance.f.e(r2, r3, r5, r7)
                    r1 = 0
                    r0[r1] = r9
                    return
            }

            public void j(java.lang.Throwable r3) {
                    r2 = this;
                    com.ss.android.downloadlib.addownload.compliance.f$b r3 = r2.b
                    long r0 = r3.b
                    r3 = 2
                    com.ss.android.downloadlib.addownload.compliance.a.a(r3, r0)
                    boolean[] r3 = r2.a
                    r0 = 0
                    r3[r0] = r0
                    return
            }
        }

        b(com.ss.android.downloadlib.addownload.compliance.f r1, long r2, long r4) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r4
                r0.<init>()
                return
        }

        public java.lang.Boolean a(java.lang.String r7) {
                r6 = this;
                r0 = 1
                boolean[] r0 = new boolean[r0]
                r1 = 0
                r0[r1] = r1
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                v2.g r3 = com.ss.android.downloadlib.addownload.m.B()
                com.ss.android.downloadlib.addownload.compliance.f$b$a r4 = new com.ss.android.downloadlib.addownload.compliance.f$b$a
                r4.<init>(r6, r0)
                java.lang.String r5 = "GET"
                r3.j(r5, r7, r2, r4)
                boolean r7 = r0[r1]
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                return r7
        }

        @Override // com.ss.android.downloadlib.a.e.InterfaceC0189a
        public /* bridge */ /* synthetic */ java.lang.Boolean j(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    private static class c {
        private static com.ss.android.downloadlib.addownload.compliance.f a;

        static {
                com.ss.android.downloadlib.addownload.compliance.f r0 = new com.ss.android.downloadlib.addownload.compliance.f
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.addownload.compliance.f.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.compliance.f a() {
                com.ss.android.downloadlib.addownload.compliance.f r0 = com.ss.android.downloadlib.addownload.compliance.f.c.a
                return r0
        }
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ f(com.ss.android.downloadlib.addownload.compliance.f.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.addownload.compliance.f a() {
            com.ss.android.downloadlib.addownload.compliance.f r0 = com.ss.android.downloadlib.addownload.compliance.f.c.a()
            return r0
    }

    private boolean d(long r10, long r12, java.lang.String r14) {
            r9 = this;
            r1 = 7
            r2 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9d
            r0.<init>(r14)     // Catch: java.lang.Exception -> L9d
            java.lang.String r14 = "package"
            org.json.JSONObject r14 = r0.optJSONObject(r14)     // Catch: java.lang.Exception -> L9d
            if (r14 == 0) goto L15
            int r0 = r14.length()     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L18
        L15:
            r6 = r12
            goto La0
        L18:
            com.ss.android.downloadlib.addownload.o$j r0 = new com.ss.android.downloadlib.addownload.o$j     // Catch: java.lang.Exception -> L9d
            r0.<init>()     // Catch: java.lang.Exception -> L9d
            r0.a = r10     // Catch: java.lang.Exception -> L9d
            r0.b = r12     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = "icon_url"
            java.lang.String r10 = r14.optString(r10)     // Catch: java.lang.Exception -> L9d
            r0.d = r10     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = "app_name"
            java.lang.String r10 = r14.optString(r10)     // Catch: java.lang.Exception -> L9d
            r0.e = r10     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = "package_name"
            java.lang.String r10 = r14.optString(r10)     // Catch: java.lang.Exception -> L9d
            r0.c = r10     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = "version_name"
            java.lang.String r10 = r14.optString(r10)     // Catch: java.lang.Exception -> L9d
            r0.f = r10     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = "developer_name"
            java.lang.String r10 = r14.optString(r10)     // Catch: java.lang.Exception -> L9d
            r0.g = r10     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = "policy_url"
            java.lang.String r10 = r14.optString(r10)     // Catch: java.lang.Exception -> L9d
            r0.i = r10     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = "permissions"
            org.json.JSONArray r10 = r14.optJSONArray(r10)     // Catch: java.lang.Exception -> L9d
            if (r10 == 0) goto L83
            r11 = 0
        L5a:
            int r14 = r10.length()     // Catch: java.lang.Exception -> L7f
            if (r11 >= r14) goto L83
            java.lang.Object r14 = r10.get(r11)     // Catch: java.lang.Exception -> L7f
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: java.lang.Exception -> L7f
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r3 = r0.h     // Catch: java.lang.Exception -> L7f
            android.util.Pair r4 = new android.util.Pair     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = "permission_name"
            java.lang.String r5 = r14.optString(r5)     // Catch: java.lang.Exception -> L7f
            java.lang.String r6 = "permission_desc"
            java.lang.String r14 = r14.optString(r6)     // Catch: java.lang.Exception -> L7f
            r4.<init>(r5, r14)     // Catch: java.lang.Exception -> L7f
            r3.add(r4)     // Catch: java.lang.Exception -> L7f
            int r11 = r11 + 1
            goto L5a
        L7f:
            r0 = move-exception
            r10 = r0
            r6 = r12
            goto La4
        L83:
            com.ss.android.downloadlib.addownload.compliance.cw r10 = com.ss.android.downloadlib.addownload.compliance.cw.j()     // Catch: java.lang.Exception -> L9d
            r10.j(r0)     // Catch: java.lang.Exception -> L9d
            com.ss.android.downloadlib.addownload.compliance.r r3 = com.ss.android.downloadlib.addownload.compliance.r.j()     // Catch: java.lang.Exception -> L9d
            long r4 = r0.a()     // Catch: java.lang.Exception -> L9d
            java.lang.String r8 = r0.d     // Catch: java.lang.Exception -> L9d
            r6 = r12
            r3.j(r4, r6, r8)     // Catch: java.lang.Exception -> L9a
            r10 = 1
            return r10
        L9a:
            r0 = move-exception
        L9b:
            r10 = r0
            goto La4
        L9d:
            r0 = move-exception
            r6 = r12
            goto L9b
        La0:
            com.ss.android.downloadlib.addownload.compliance.a.a(r1, r6)     // Catch: java.lang.Exception -> L9a
            return r2
        La4:
            com.ss.android.downloadlib.up.a r11 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r12 = "AdLpComplianceManager parseResponse"
            r11.j(r10, r12)
            com.ss.android.downloadlib.addownload.compliance.a.a(r1, r6)
            return r2
    }

    static /* synthetic */ boolean e(com.ss.android.downloadlib.addownload.compliance.f r0, long r1, long r3, java.lang.String r5) {
            boolean r0 = r0.d(r1, r3, r5)
            return r0
    }

    public void b(long r1) {
            r0 = this;
            com.ss.android.downloadlib.activity.TTDelegateActivity.e(r1)
            return
    }

    public void c(android.app.Activity r2) {
            r1 = this;
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public boolean f(@androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r15) {
            r14 = this;
            com.ss.android.j.j.cw.b r0 = r15.b
            java.lang.String r0 = r0.ch()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L2f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L20
            com.ss.android.j.j.cw.b r3 = r15.b     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = r3.ch()     // Catch: java.lang.Exception -> L20
            r0.<init>(r3)     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = "convert_id"
            long r3 = com.ss.android.downloadlib.a.h.j(r0, r3)     // Catch: java.lang.Exception -> L20
            goto L25
        L20:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r3 = r1
        L25:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L2d
            r0 = 3
            com.ss.android.downloadlib.addownload.compliance.a.b(r0, r15)
        L2d:
            r6 = r3
            goto L3e
        L2f:
            r0 = 9
            com.ss.android.downloadlib.addownload.compliance.a.b(r0, r15)
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r3 = "requestAppInfo getLogExtra null"
            r0.c(r3)
            r6 = r1
        L3e:
            long r8 = r15.a
            com.ss.android.downloadlib.addownload.compliance.cw r0 = com.ss.android.downloadlib.addownload.compliance.cw.j()
            com.ss.android.downloadlib.addownload.o$j r0 = r0.j(r6, r8)
            r3 = 1
            if (r0 == 0) goto L66
            r11 = r8
            com.ss.android.downloadlib.addownload.compliance.r r8 = com.ss.android.downloadlib.addownload.compliance.r.j()
            long r9 = r0.a()
            java.lang.String r13 = r0.d
            r8.j(r9, r11, r13)
            long r0 = r0.a()
            r14.b(r0)
            java.lang.String r0 = "lp_app_dialog_try_show"
            com.ss.android.downloadlib.addownload.compliance.a.d(r0, r15)
            return r3
        L66:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L77
            java.lang.String r1 = "convert_id="
            r0.append(r1)
            r0.append(r6)
        L77:
            com.ss.android.j.j.cw.b r1 = r15.b
            java.lang.String r1 = r1.s()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L9c
            int r1 = r0.length()
            if (r1 <= 0) goto L8e
            java.lang.String r1 = "&"
            r0.append(r1)
        L8e:
            java.lang.String r1 = "package_name="
            r0.append(r1)
            com.ss.android.j.j.cw.b r1 = r15.b
            java.lang.String r1 = r1.s()
            r0.append(r1)
        L9c:
            int r1 = r0.length()
            if (r1 > 0) goto La8
            r0 = 6
            com.ss.android.downloadlib.addownload.compliance.a.b(r0, r15)
            r15 = 0
            return r15
        La8:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "https://apps.oceanengine.com/customer/api/app/pkg_info?"
            r15.<init>(r1)
            java.lang.String r0 = r0.toString()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.ss.android.downloadlib.addownload.compliance.f$b r4 = new com.ss.android.downloadlib.addownload.compliance.f$b
            r5 = r14
            r4.<init>(r5, r6, r8)
            com.ss.android.downloadlib.a$e r15 = com.ss.android.downloadlib.a.e.c(r4, r15)
            com.ss.android.downloadlib.addownload.compliance.f$a r4 = new com.ss.android.downloadlib.addownload.compliance.f$a
            r4.<init>(r5, r6, r8)
            com.ss.android.downloadlib.a$e r15 = r15.b(r4)
            r15.d()
            return r3
    }

    public boolean g(com.ss.android.j.j.cw.b r5) {
            r4 = this;
            boolean r0 = r5.x()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "ad_lp_show_app_dialog"
            int r0 = r0.optInt(r2)
            if (r0 != 0) goto L15
            return r1
        L15:
            com.ss.android.j.j.up.f r0 = r5.l()
            if (r0 != 0) goto L1d
            r5 = 0
            goto L25
        L1d:
            com.ss.android.j.j.up.f r5 = r5.l()
            java.lang.String r5 = r5.b()
        L25:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L2c
            return r1
        L2c:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "ad_allow_web_url_regex"
            java.lang.String r3 = ".+(www.chengzijianzhan.com|www.toutiaopage.com/tetris/page|ad.toutiao.com/tetris/page).+"
            java.lang.String r0 = r0.optString(r2, r3)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r5 = r0.matcher(r5)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L47
            return r1
        L47:
            r5 = 1
            return r5
    }

    public android.app.Activity h() {
            r2 = this;
            java.lang.ref.SoftReference<android.app.Activity> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 0
            r2.a = r1
            return r0
    }

    public void i(long r3) {
            r2 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r0 = r0.r(r3)
            com.ss.android.downloadlib.c r1 = com.ss.android.downloadlib.c.d()
            com.ss.android.j.j.cw.b r0 = r0.b
            java.lang.String r0 = r0.j()
            com.ss.android.downloadlib.addownload.l r0 = r1.c(r0)
            if (r0 == 0) goto L1d
            r3 = 1
            r0.E(r3, r3)
            return
        L1d:
            r0 = 11
            com.ss.android.downloadlib.addownload.compliance.a.a(r0, r3)
            com.ss.android.downloadlib.up.a r3 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r4 = "startDownload handler null"
            r3.f(r4)
            return
    }
}
