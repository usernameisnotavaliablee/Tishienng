package com.ss.android.downloadlib.activity;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TTDelegateActivity extends android.app.Activity {
    private static com.ss.android.downloadlib.guide.install.a d;
    protected android.content.Intent a;
    private boolean b;
    private com.ss.android.xt.j.xt.b c;

    class a implements v2.t {
        private java.lang.ref.WeakReference<android.app.Activity> a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ss.android.downloadlib.activity.TTDelegateActivity c;

        a(com.ss.android.downloadlib.activity.TTDelegateActivity r1, java.lang.String r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r1)
                r0.a = r2
                return
        }

        public void j() {
                r1 = this;
                java.lang.String r0 = r1.b
                com.ss.android.downloadlib.a.j.b(r0)
                java.lang.ref.WeakReference<android.app.Activity> r0 = r1.a
                java.lang.Object r0 = r0.get()
                android.app.Activity r0 = (android.app.Activity) r0
                com.ss.android.socialbase.appdownloader.b.u(r0)
                return
        }

        public void j(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = r1.b
                com.ss.android.downloadlib.a.j.d(r0, r2)
                java.lang.ref.WeakReference<android.app.Activity> r2 = r1.a
                java.lang.Object r2 = r2.get()
                android.app.Activity r2 = (android.app.Activity) r2
                com.ss.android.socialbase.appdownloader.b.u(r2)
                return
        }
    }

    class b implements com.ss.android.j.j.up.a.c {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ com.ss.android.downloadlib.activity.TTDelegateActivity b;

        b(com.ss.android.downloadlib.activity.TTDelegateActivity r1, com.ss.android.xt.j.xt.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void cw(android.content.DialogInterface r1) {
                r0 = this;
                com.ss.android.downloadlib.activity.TTDelegateActivity r1 = r0.b
                com.ss.android.socialbase.appdownloader.b.u(r1)
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void j(android.content.DialogInterface r2) {
                r1 = this;
                com.ss.android.xt.j.xt.b r0 = r1.a
                com.ss.android.downloadlib.j.g.j(r0)
                com.ss.android.downloadlib.activity.TTDelegateActivity r0 = r1.b
                if (r0 == 0) goto L12
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L12
                r2.dismiss()
            L12:
                com.ss.android.downloadlib.activity.TTDelegateActivity r2 = r1.b
                com.ss.android.socialbase.appdownloader.b.u(r2)
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void xt(android.content.DialogInterface r4) {
                r3 = this;
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "market_openapp_cancel"
                com.ss.android.xt.j.xt.b r2 = r3.a
                r0.w(r1, r2)
                com.ss.android.downloadlib.activity.TTDelegateActivity r0 = r3.b
                if (r0 == 0) goto L18
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L18
                r4.dismiss()
            L18:
                com.ss.android.downloadlib.activity.TTDelegateActivity r4 = r3.b
                com.ss.android.socialbase.appdownloader.b.u(r4)
                return
        }
    }

    static {
            r0 = 41273(0xa139, float:5.7836E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public TTDelegateActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public static void A(java.lang.String r2, com.ss.android.xt.j.xt.a r3) {
            android.content.Intent r3 = a(r3)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)
            java.lang.String r0 = "type"
            r1 = 11
            r3.putExtra(r0, r1)
            java.lang.String r0 = "package_name"
            r3.putExtra(r0, r2)
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r2 == 0) goto L22
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            r2.startActivity(r3)
        L22:
            return
    }

    private void B(java.lang.String r3, java.lang.String[] r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2d
            if (r4 == 0) goto L2d
            int r0 = r4.length
            if (r0 > 0) goto Lc
            goto L2d
        Lc:
            com.ss.android.downloadlib.activity.TTDelegateActivity$a r0 = new com.ss.android.downloadlib.activity.TTDelegateActivity$a
            r0.<init>(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r3 < r1) goto L29
            v2.n r3 = com.ss.android.downloadlib.addownload.m.E()     // Catch: java.lang.Exception -> L1f
            r3.j(r2, r4, r0)     // Catch: java.lang.Exception -> L1f
            return
        L1f:
            r3 = move-exception
            u2.a r4 = com.ss.android.downloadlib.addownload.m.w()
            java.lang.String r1 = "requestPermission"
            r4.j(r3, r1)
        L29:
            r0.j()
            return
        L2d:
            com.ss.android.socialbase.appdownloader.b.u(r2)
            return
    }

    private static android.content.Intent a(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r2) {
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r1 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r2.<init>(r0, r1)
            return r2
    }

    private void b() {
            r18 = this;
            r1 = r18
            android.content.Intent r0 = r1.a
            java.lang.String r2 = "model_id"
            r3 = 0
            long r5 = r0.getLongExtra(r2, r3)
            android.content.Intent r0 = r1.a
            java.lang.String r2 = "message_text"
            java.lang.String r0 = r0.getStringExtra(r2)
            android.content.Intent r2 = r1.a
            java.lang.String r7 = "positive_button_text"
            java.lang.String r2 = r2.getStringExtra(r7)
            android.content.Intent r7 = r1.a
            java.lang.String r8 = "negative_button_text"
            java.lang.String r7 = r7.getStringExtra(r8)
            android.content.Intent r8 = r1.a
            java.lang.String r9 = "delete_button_text"
            java.lang.String r8 = r8.getStringExtra(r9)
            android.content.Intent r9 = r1.a
            java.lang.String r10 = "type"
            r11 = 0
            int r9 = r9.getIntExtra(r10, r11)
            com.ss.android.downloadlib.addownload.o$f r10 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r5 = r10.q(r5)
            r6 = 1
            if (r5 == 0) goto L97
            java.lang.String r10 = r5.h()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L5c
            android.content.Context r10 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.g r10 = com.ss.android.downloadlib.g.c(r10)
            java.lang.String r12 = r5.h()
            r13 = 0
            com.ss.android.socialbase.downloader.ae.cw r10 = r10.e(r12, r13, r6)
            goto L6c
        L5c:
            android.content.Context r10 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.g r10 = com.ss.android.downloadlib.g.c(r10)
            java.lang.String r12 = r5.j()
            com.ss.android.socialbase.downloader.ae.cw r10 = r10.u(r12)
        L6c:
            if (r10 == 0) goto L97
            long r12 = r10.uq()
            long r14 = r10.ka()
            int r16 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r16 <= 0) goto L97
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 <= 0) goto L97
            r16 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r12 / r16
            int r4 = (int) r3
            r3 = r7
            long r6 = r14 / r16
            int r7 = (int) r6
            int r6 = r10.ae()
            r16 = 100
            long r12 = r12 * r16
            long r12 = r12 / r14
            int r10 = (int) r12
            int r6 = com.ss.android.downloadlib.addownload.h.a(r6, r10)
            goto L9b
        L97:
            r3 = r7
            r6 = -1
            r4 = 0
            r7 = 0
        L9b:
            com.ss.android.downloadlib.addownload.j.d$d r10 = new com.ss.android.downloadlib.addownload.j.d$d
            r10.<init>(r1)
            com.ss.android.downloadlib.addownload.j.d$d r10 = r10.e(r11)
            com.ss.android.downloadlib.addownload.j.d$d r0 = r10.d(r0)
            com.ss.android.downloadlib.addownload.j.d$d r0 = r0.h(r2)
            com.ss.android.downloadlib.addownload.j.d$d r0 = r0.a(r3)
            r2 = 7
            java.lang.String r3 = "apk_size_cancel"
            java.lang.String r10 = "download_percent_cancel"
            java.lang.String r11 = "apk_size"
            java.lang.String r12 = "download_percent"
            if (r9 != r2) goto Ld4
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.k.c()
            if (r2 != 0) goto Lc3
            goto L1b5
        Lc3:
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.k.c()
            r0.c(r2)
            com.ss.android.downloadlib.addownload.j.d r0 = r0.f()
            r0.show()
            r2 = r12
            goto L14f
        Ld4:
            r2 = 8
            if (r9 != r2) goto Lf0
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.C0205j.c()
            if (r2 != 0) goto Le0
            goto L1b5
        Le0:
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.C0205j.c()
            r0.c(r2)
            com.ss.android.downloadlib.addownload.j.d r0 = r0.f()
            r0.show()
            r2 = r11
            goto L14f
        Lf0:
            r2 = 20
            if (r9 != r2) goto L11e
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.h.c()
            if (r2 == 0) goto L1b5
            com.ss.android.downloadlib.addownload.j.a r2 = com.ss.android.downloadlib.addownload.j.h.i()
            if (r2 != 0) goto L102
            goto L1b5
        L102:
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.h.c()
            com.ss.android.downloadlib.addownload.j.d$d r2 = r0.c(r2)
            com.ss.android.downloadlib.addownload.j.d$d r2 = r2.g(r8)
            com.ss.android.downloadlib.addownload.j.a r8 = com.ss.android.downloadlib.addownload.j.h.i()
            r2.b(r8)
            com.ss.android.downloadlib.addownload.j.d r0 = r0.f()
            r0.show()
            r2 = r10
            goto L14f
        L11e:
            r2 = 21
            if (r9 != r2) goto L14c
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.r.c()
            if (r2 == 0) goto L1b5
            com.ss.android.downloadlib.addownload.j.a r2 = com.ss.android.downloadlib.addownload.j.r.i()
            if (r2 != 0) goto L130
            goto L1b5
        L130:
            com.ss.android.downloadlib.addownload.j.c r2 = com.ss.android.downloadlib.addownload.j.r.c()
            com.ss.android.downloadlib.addownload.j.d$d r2 = r0.c(r2)
            com.ss.android.downloadlib.addownload.j.d$d r2 = r2.g(r8)
            com.ss.android.downloadlib.addownload.j.a r8 = com.ss.android.downloadlib.addownload.j.r.i()
            r2.b(r8)
            com.ss.android.downloadlib.addownload.j.d r0 = r0.f()
            r0.show()
            r2 = r3
            goto L14f
        L14c:
            java.lang.String r0 = ""
            r2 = r0
        L14f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1b5
            r0 = 1
            r1.b = r0
            r1.c = r5
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r0 = "pause_optimise_type"
            r8.putOpt(r0, r2)     // Catch: org.json.JSONException -> L185
            java.lang.String r0 = "pause_optimise_action"
            java.lang.String r9 = "show_dialog"
            r8.putOpt(r0, r9)     // Catch: org.json.JSONException -> L185
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: org.json.JSONException -> L185
            r8.putOpt(r12, r0)     // Catch: org.json.JSONException -> L185
            java.lang.String r0 = "download_current_bytes"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: org.json.JSONException -> L185
            r8.putOpt(r0, r4)     // Catch: org.json.JSONException -> L185
            java.lang.String r0 = "download_total_bytes"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: org.json.JSONException -> L185
            r8.putOpt(r0, r4)     // Catch: org.json.JSONException -> L185
            goto L189
        L185:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L189:
            boolean r0 = android.text.TextUtils.equals(r2, r12)
            if (r0 != 0) goto L1ac
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L196
            goto L1ac
        L196:
            boolean r0 = android.text.TextUtils.equals(r2, r10)
            if (r0 != 0) goto L1a2
            boolean r0 = android.text.TextUtils.equals(r2, r3)
            if (r0 == 0) goto L1b5
        L1a2:
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r2 = "pause_cancel_optimise"
            r0.r(r2, r8, r5)
            goto L1b5
        L1ac:
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r2 = "pause_optimise"
            r0.r(r2, r8, r5)
        L1b5:
            return
    }

    private void c(long r2) {
            r1 = this;
            com.ss.android.downloadlib.addownload.compliance.b r0 = new com.ss.android.downloadlib.addownload.compliance.b
            r0.<init>(r1, r2)
            r0.show()
            return
    }

    public static void e(long r3) {
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r2 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r0.<init>(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 10
            r0.putExtra(r1, r2)
            java.lang.String r1 = "app_info_id"
            r0.putExtra(r1, r3)
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r3 == 0) goto L29
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            r3.startActivity(r0)
        L29:
            return
    }

    private void f(long r7, java.lang.String r9) {
            r6 = this;
            com.ss.android.downloadlib.addownload.j.c r0 = com.ss.android.downloadlib.addownload.b.a()
            if (r0 != 0) goto L7
            return
        L7:
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r7 = r0.q(r7)
            if (r7 == 0) goto Lb2
            android.content.Context r8 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r8 = com.ss.android.socialbase.downloader.downloader.ae.xt(r8)
            int r0 = r7.mi()
            com.ss.android.socialbase.downloader.ae.cw r8 = r8.tl(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "time_after_click"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L95
            long r4 = r7.k()     // Catch: java.lang.Exception -> L95
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L95
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "click_download_size"
            long r2 = r7.s()     // Catch: java.lang.Exception -> L95
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L95
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L95
            if (r8 == 0) goto L99
            java.lang.String r1 = "download_length"
            long r2 = r8.uq()     // Catch: java.lang.Exception -> L95
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L95
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "download_percent"
            long r2 = r8.uq()     // Catch: java.lang.Exception -> L95
            long r4 = r8.ka()     // Catch: java.lang.Exception -> L95
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L95
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "download_apk_size"
            long r2 = r8.ka()     // Catch: java.lang.Exception -> L95
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L95
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "download_current_bytes"
            long r2 = r8.uq()     // Catch: java.lang.Exception -> L95
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 / r4
            int r3 = (int) r2     // Catch: java.lang.Exception -> L95
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L95
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "download_total_bytes"
            long r2 = r8.ka()     // Catch: java.lang.Exception -> L95
            long r2 = r2 / r4
            int r8 = (int) r2     // Catch: java.lang.Exception -> L95
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L95
            r0.putOpt(r1, r8)     // Catch: java.lang.Exception -> L95
            goto L99
        L95:
            r8 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r8)
        L99:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto La9
            com.ss.android.downloadlib.r.b r8 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r1 = "cancel_pause_reserve_wifi_dialog_show"
            r8.r(r1, r0, r7)
            goto Lb2
        La9:
            com.ss.android.downloadlib.r.b r8 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r1 = "pause_reserve_wifi_dialog_show"
            r8.x(r1, r0, r7)
        Lb2:
            com.ss.android.downloadlib.addownload.j.d$d r8 = new com.ss.android.downloadlib.addownload.j.d$d
            r8.<init>(r6)
            r0 = 0
            com.ss.android.downloadlib.addownload.j.d$d r8 = r8.e(r0)
            com.ss.android.downloadlib.addownload.j.c r0 = com.ss.android.downloadlib.addownload.b.a()
            com.ss.android.downloadlib.addownload.j.d$d r8 = r8.c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto Ld5
            com.ss.android.downloadlib.addownload.j.d$d r9 = r8.g(r9)
            com.ss.android.downloadlib.addownload.j.a r0 = com.ss.android.downloadlib.addownload.b.f()
            r9.b(r0)
        Ld5:
            com.ss.android.downloadlib.addownload.j.d r8 = r8.f()
            r8.show()
            r8 = 1
            r6.b = r8
            r6.c = r7
            return
    }

    public static void g(android.content.Context r3, java.lang.String r4, long r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r1 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r0.<init>(r3, r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 16
            r0.putExtra(r1, r2)
            java.lang.String r1 = "package_name"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "model_id"
            r0.putExtra(r4, r5)
            if (r3 == 0) goto L22
            r3.startActivity(r0)
        L22:
            return
    }

    public static void h(com.ss.android.xt.j.xt.a r4) {
            android.content.Intent r0 = a(r4)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 4
            r0.putExtra(r1, r2)
            java.lang.String r1 = "model_id"
            long r2 = r4.xt()
            r0.putExtra(r1, r2)
            android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r4 == 0) goto L25
            android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
            r4.startActivity(r0)
        L25:
            return
    }

    private static void i(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            android.content.Intent r0 = a(r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r0.putExtra(r1, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L19
            java.lang.String r3 = "positive_button_text"
            r0.putExtra(r3, r5)
        L19:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L24
            java.lang.String r3 = "negative_button_text"
            r0.putExtra(r3, r6)
        L24:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L2f
            java.lang.String r3 = "delete_button_text"
            r0.putExtra(r3, r7)
        L2f:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L3a
            java.lang.String r3 = "message_text"
            r0.putExtra(r3, r4)
        L3a:
            java.lang.String r3 = "model_id"
            long r4 = r2.xt()
            r0.putExtra(r3, r4)
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r2 == 0) goto L50
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            r2.startActivity(r0)
        L50:
            return
    }

    public static void j(com.ss.android.xt.j.xt.a r2, com.ss.android.downloadlib.guide.install.a r3) {
            android.content.Intent r2 = a(r2)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r0)
            java.lang.String r0 = "type"
            r1 = 9
            r2.putExtra(r0, r1)
            com.ss.android.downloadlib.activity.TTDelegateActivity.d = r3
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r3 == 0) goto L1f
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            r3.startActivity(r2)
        L1f:
            return
    }

    public static void k(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r6, java.lang.String r7) {
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r1 = 19
            java.lang.String r2 = ""
            r0 = r6
            r5 = r7
            i(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void l(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r1 = 8
            java.lang.String r5 = ""
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            i(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void m(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r1 = 21
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            i(r0, r1, r2, r3, r4, r5)
            return
    }

    private void n(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto La
            com.ss.android.socialbase.appdownloader.b.u(r3)
            return
        La:
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r1.setData(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.lang.String r0 = "open_url"
            r1.putExtra(r0, r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.lang.String r0 = "fix_app_link_flag"
            boolean r4 = r4.j(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            if (r4 == 0) goto L38
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            goto L38
        L34:
            r4 = move-exception
            goto L4c
        L36:
            r4 = move-exception
            goto L45
        L38:
            java.lang.String r4 = "start_only_for_android"
            r0 = 1
            r1.putExtra(r4, r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r3.startActivity(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            com.ss.android.socialbase.appdownloader.b.u(r3)
            return
        L45:
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L34
            com.ss.android.socialbase.appdownloader.b.u(r3)
            return
        L4c:
            com.ss.android.socialbase.appdownloader.b.u(r3)
            throw r4
    }

    public static void o(java.lang.String r3, long r4) {
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r2 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r0.<init>(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 15
            r0.putExtra(r1, r2)
            java.lang.String r1 = "package_name"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "model_id"
            r0.putExtra(r3, r4)
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r3 == 0) goto L2e
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            r3.startActivity(r0)
        L2e:
            return
    }

    public static void p(java.lang.String r3, long r4, java.lang.String r6) {
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r2 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r0.<init>(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 13
            r0.putExtra(r1, r2)
            java.lang.String r1 = "package_name"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "model_id"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "need_comment"
            r0.putExtra(r3, r6)
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r3 == 0) goto L33
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            r3.startActivity(r0)
        L33:
            return
    }

    public static void q(java.lang.String r3, long r4, java.lang.String r6, @androidx.annotation.NonNull org.json.JSONObject r7) {
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r2 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r0.<init>(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 12
            r0.putExtra(r1, r2)
            java.lang.String r1 = "package_name"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "model_id"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "param"
            r0.putExtra(r3, r6)
            java.lang.String r3 = "ext_json"
            java.lang.String r4 = r7.toString()
            r0.putExtra(r3, r4)
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r3 == 0) goto L3c
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            r3.startActivity(r0)
        L3c:
            return
    }

    public static void r(java.lang.String r2, com.ss.android.xt.j.xt.a r3) {
            android.content.Intent r3 = a(r3)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)
            java.lang.String r0 = "type"
            r1 = 2
            r3.putExtra(r0, r1)
            java.lang.String r0 = "open_url"
            r3.putExtra(r0, r2)
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r2 == 0) goto L21
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            r2.startActivity(r3)
        L21:
            return
    }

    public static void s(java.lang.String r3, java.lang.String[] r4) {
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r2 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r0.<init>(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "permission_id_key"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "permission_content_key"
            r0.putExtra(r3, r4)
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r3 == 0) goto L2d
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            r3.startActivity(r0)
        L2d:
            return
    }

    private void t() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r2 = 0
            r1.alpha = r2
            r0.setAttributes(r1)
            return
    }

    private void u(long r5) {
            r4 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r5 = r0.q(r5)
            if (r5 != 0) goto L17
            com.ss.android.downloadlib.up.a r5 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r6 = "showOpenAppDialogInner nativeModel null"
            r5.c(r6)
            com.ss.android.socialbase.appdownloader.b.u(r4)
            return
        L17:
            v2.w r6 = com.ss.android.downloadlib.addownload.m.d()
            com.ss.android.j.j.up.a$b r0 = new com.ss.android.j.j.up.a$b
            r0.<init>(r4)
            java.lang.String r1 = "已安装完成"
            com.ss.android.j.j.up.a$b r0 = r0.h(r1)
            java.lang.String r1 = r5.a0()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L33
            java.lang.String r1 = "刚刚下载的应用"
            goto L37
        L33:
            java.lang.String r1 = r5.a0()
        L37:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%1$s已安装完成，是否立即打开？"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            com.ss.android.j.j.up.a$b r0 = r0.p(r1)
            java.lang.String r1 = "打开"
            com.ss.android.j.j.up.a$b r0 = r0.b(r1)
            java.lang.String r1 = "取消"
            com.ss.android.j.j.up.a$b r0 = r0.l(r1)
            com.ss.android.j.j.up.a$b r0 = r0.i(r3)
            java.lang.String r1 = r5.up()
            android.graphics.drawable.Drawable r1 = com.ss.android.downloadlib.a.h.E(r4, r1)
            com.ss.android.j.j.up.a$b r0 = r0.f(r1)
            com.ss.android.downloadlib.activity.TTDelegateActivity$b r1 = new com.ss.android.downloadlib.activity.TTDelegateActivity$b
            r1.<init>(r4, r5)
            com.ss.android.j.j.up.a$b r0 = r0.g(r1)
            r1 = 2
            com.ss.android.j.j.up.a$b r0 = r0.e(r1)
            com.ss.android.j.j.up.a r0 = r0.j()
            r6.xt(r0)
            com.ss.android.downloadlib.r.b r6 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "market_openapp_window_show"
            r6.w(r0, r5)
            return
    }

    public static void v(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r6) {
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r1 = 5
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            r0 = r6
            i(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void w(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r1 = 7
            java.lang.String r5 = ""
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            i(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void x(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r1 = 20
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            i(r0, r1, r2, r3, r4, r5)
            return
    }

    private void y(java.lang.String r3) {
            r2 = this;
            android.content.Intent r3 = com.ss.android.downloadlib.a.h.a(r2, r3)
            if (r3 != 0) goto La
            com.ss.android.socialbase.appdownloader.b.u(r2)
            return
        La:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            java.lang.String r0 = "start_only_for_android"
            r1 = 1
            r3.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r2.startActivity(r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            com.ss.android.socialbase.appdownloader.b.u(r2)
            return
        L1c:
            r3 = move-exception
            goto L26
        L1e:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.appdownloader.b.u(r2)
            return
        L26:
            com.ss.android.socialbase.appdownloader.b.u(r2)
            throw r3
    }

    public static void z(java.lang.String r3, long r4, java.lang.String r6) {
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.downloadlib.activity.TTDelegateActivity> r2 = com.ss.android.downloadlib.activity.TTDelegateActivity.class
            r0.<init>(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 14
            r0.putExtra(r1, r2)
            java.lang.String r1 = "package_name"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "model_id"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "market_app_id"
            r0.putExtra(r3, r6)
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            if (r3 == 0) goto L33
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            r3.startActivity(r0)
        L33:
            return
    }

    protected void d() {
            r11 = this;
            android.content.Intent r0 = r11.a
            if (r0 == 0) goto L106
            java.lang.String r1 = "type"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            java.lang.String r1 = "package_name"
            java.lang.String r2 = "model_id"
            r3 = 0
            switch(r0) {
                case 1: goto Lee;
                case 2: goto Le1;
                case 3: goto L14;
                case 4: goto Ld6;
                case 5: goto Lc9;
                case 6: goto L14;
                case 7: goto Lc4;
                case 8: goto Lc4;
                case 9: goto Lb8;
                case 10: goto Lab;
                case 11: goto La0;
                case 12: goto L7b;
                case 13: goto L63;
                case 14: goto L4b;
                case 15: goto L3b;
                case 16: goto L2b;
                case 17: goto L14;
                case 18: goto L14;
                case 19: goto L17;
                case 20: goto Lc4;
                case 21: goto Lc4;
                default: goto L14;
            }
        L14:
            r5 = r11
            goto L9b
        L17:
            android.content.Intent r0 = r11.a
            long r0 = r0.getLongExtra(r2, r3)
            android.content.Intent r2 = r11.a
            java.lang.String r3 = "delete_button_text"
            java.lang.String r2 = r2.getStringExtra(r3)
            r11.f(r0, r2)
            r5 = r11
            goto L102
        L2b:
            android.content.Intent r0 = r11.a
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r11.a
            long r1 = r1.getLongExtra(r2, r3)
            com.ss.android.downloadlib.a.m.M(r11, r0, r1)
            goto L14
        L3b:
            android.content.Intent r0 = r11.a
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r11.a
            long r1 = r1.getLongExtra(r2, r3)
            com.ss.android.downloadlib.a.m.r(r11, r0, r1)
            goto L14
        L4b:
            android.content.Intent r0 = r11.a
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r11.a
            long r1 = r1.getLongExtra(r2, r3)
            android.content.Intent r3 = r11.a
            java.lang.String r4 = "market_app_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            com.ss.android.downloadlib.a.m.N(r11, r0, r1, r3)
            goto L14
        L63:
            android.content.Intent r0 = r11.a
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r11.a
            long r1 = r1.getLongExtra(r2, r3)
            android.content.Intent r3 = r11.a
            java.lang.String r4 = "need_comment"
            java.lang.String r3 = r3.getStringExtra(r4)
            com.ss.android.downloadlib.a.m.s(r11, r0, r1, r3)
            goto L14
        L7b:
            android.content.Intent r0 = r11.a
            java.lang.String r6 = r0.getStringExtra(r1)
            android.content.Intent r0 = r11.a
            long r7 = r0.getLongExtra(r2, r3)
            android.content.Intent r0 = r11.a
            java.lang.String r1 = "param"
            java.lang.String r9 = r0.getStringExtra(r1)
            android.content.Intent r0 = r11.a
            java.lang.String r1 = "ext_json"
            java.lang.String r10 = r0.getStringExtra(r1)
            r5 = r11
            com.ss.android.downloadlib.a.m.t(r5, r6, r7, r9, r10)
        L9b:
            com.ss.android.socialbase.appdownloader.b.u(r11)
            goto L102
        La0:
            r5 = r11
            android.content.Intent r0 = r5.a
            java.lang.String r0 = r0.getStringExtra(r1)
            r11.y(r0)
            goto L102
        Lab:
            r5 = r11
            android.content.Intent r0 = r5.a
            java.lang.String r1 = "app_info_id"
            long r0 = r0.getLongExtra(r1, r3)
            r11.c(r0)
            goto L102
        Lb8:
            r5 = r11
            com.ss.android.downloadlib.guide.install.a r0 = com.ss.android.downloadlib.activity.TTDelegateActivity.d
            if (r0 == 0) goto Lc0
            r0.j()
        Lc0:
            com.ss.android.socialbase.appdownloader.b.u(r11)
            goto L102
        Lc4:
            r5 = r11
            r11.b()
            goto L102
        Lc9:
            r5 = r11
            android.content.Intent r0 = r5.a
            long r0 = r0.getLongExtra(r2, r3)
            java.lang.String r2 = ""
            r11.f(r0, r2)
            goto L102
        Ld6:
            r5 = r11
            android.content.Intent r0 = r5.a
            long r0 = r0.getLongExtra(r2, r3)
            r11.u(r0)
            goto L102
        Le1:
            r5 = r11
            android.content.Intent r0 = r5.a
            java.lang.String r1 = "open_url"
            java.lang.String r0 = r0.getStringExtra(r1)
            r11.n(r0)
            goto L102
        Lee:
            r5 = r11
            android.content.Intent r0 = r5.a
            java.lang.String r1 = "permission_id_key"
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r5.a
            java.lang.String r2 = "permission_content_key"
            java.lang.String[] r1 = r1.getStringArrayExtra(r2)
            r11.B(r0, r1)
        L102:
            r0 = 0
            r5.a = r0
            return
        L106:
            r5 = r11
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.setIntent(r1)
            r0.a = r1
            com.ss.android.downloadlib.addownload.m.L(r0)
            r0.d()
            return
    }

    @Override // android.app.Activity
    public native void onRequestPermissionsResult(int r1, @androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull int[] r3);

    @Override // android.app.Activity
    protected void onStop() {
            r5 = this;
            super.onStop()
            boolean r0 = r5.b
            if (r0 == 0) goto L53
            com.ss.android.xt.j.xt.b r0 = r5.c
            if (r0 == 0) goto L53
            java.lang.String r0 = r0.h()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2a
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
            com.ss.android.xt.j.xt.b r1 = r5.c
            java.lang.String r1 = r1.h()
            r2 = 0
            r3 = 1
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r1, r2, r3)
            goto L3c
        L2a:
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
            com.ss.android.xt.j.xt.b r1 = r5.c
            java.lang.String r1 = r1.j()
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r1)
        L3c:
            if (r0 == 0) goto L53
            long r1 = r0.uq()
            long r3 = r0.ka()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L53
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L53
            r5.finish()
        L53:
            return
    }
}
