package com.bxkj.student.common.versionupdate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private android.content.Context a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.common.versionupdate.a$a, reason: collision with other inner class name */
    class C0070a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.common.versionupdate.a.d a;
        final /* synthetic */ com.bxkj.student.common.versionupdate.a b;

        C0070a(com.bxkj.student.common.versionupdate.a r1, com.bxkj.student.common.versionupdate.a.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r1) {
                r0 = this;
                super.netOnFailure(r1)
                r1.getClass()
                com.bxkj.student.common.versionupdate.a$d r1 = r0.a
                if (r1 == 0) goto Ld
                r1.b()
            Ld:
                return
        }

        public void netOnOtherStatus(int r3, java.lang.String r4) {
                r2 = this;
                super.netOnOtherStatus(r3, r4)
                com.bxkj.student.common.versionupdate.a$d r3 = r2.a
                if (r3 == 0) goto L19
                b0.b r4 = b0.b.a
                com.bxkj.student.common.versionupdate.a r0 = r2.b
                android.content.Context r0 = com.bxkj.student.common.versionupdate.a.a(r0)
                java.lang.String r4 = r4.n(r0)
                r0 = 0
                java.lang.String r1 = ""
                r3.a(r0, r4, r1, r1)
            L19:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                java.lang.String r0 = "versions"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                java.lang.String r1 = "versionsName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                java.lang.String r2 = "instruction"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                java.lang.String r3 = "filePath"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
                b0.b r3 = b0.b.a
                com.bxkj.student.common.versionupdate.a r4 = r5.b
                android.content.Context r4 = com.bxkj.student.common.versionupdate.a.a(r4)
                int r4 = r3.m(r4)
                if (r0 <= r4) goto L2f
                com.bxkj.student.common.versionupdate.a$d r0 = r5.a
                if (r0 == 0) goto L41
                r3 = 1
                r0.a(r3, r1, r6, r2)
                return
            L2f:
                com.bxkj.student.common.versionupdate.a$d r0 = r5.a
                if (r0 == 0) goto L41
                com.bxkj.student.common.versionupdate.a r1 = r5.b
                android.content.Context r1 = com.bxkj.student.common.versionupdate.a.a(r1)
                java.lang.String r1 = r3.n(r1)
                r3 = 0
                r0.a(r3, r1, r6, r2)
            L41:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.bxkj.student.common.versionupdate.a c;

        b(com.bxkj.student.common.versionupdate.a r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                com.bxkj.student.common.versionupdate.a r5 = r4.c
                java.lang.String r0 = r4.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()
                r3 = 2131951695(0x7f13004f, float:1.9539812E38)
                java.lang.String r2 = r2.getString(r3)
                r1.append(r2)
                java.lang.String r2 = "_"
                r1.append(r2)
                java.lang.String r2 = r4.b
                r1.append(r2)
                java.lang.String r2 = ".apk"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.c(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bxkj.student.common.download.a.d {
        final /* synthetic */ android.app.ProgressDialog a;
        final /* synthetic */ com.bxkj.student.common.versionupdate.a b;

        c(com.bxkj.student.common.versionupdate.a r1, android.app.ProgressDialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        private int c(long r3) {
                r2 = this;
                r0 = 1024(0x400, double:5.06E-321)
                long r3 = r3 / r0
                float r3 = (float) r3
                int r3 = java.lang.Math.round(r3)
                return r3
        }

        private void f(java.io.File r5) {
                r4 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                java.lang.String r1 = "chmod"
                java.lang.String r2 = "777"
                java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> L1c
                java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}     // Catch: java.io.IOException -> L1c
                java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder     // Catch: java.io.IOException -> L1c
                r2.<init>(r1)     // Catch: java.io.IOException -> L1c
                r2.start()     // Catch: java.io.IOException -> L1c
                goto L1d
            L1c:
            L1d:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                if (r1 < r2) goto L34
                com.bxkj.student.common.versionupdate.a r1 = r4.b
                android.content.Context r1 = com.bxkj.student.common.versionupdate.a.a(r1)
                java.lang.String r2 = "com.bxkj.student.provider"
                android.net.Uri r5 = androidx.core.content.FileProvider.getUriForFile(r1, r2, r5)
                r1 = 1
                r0.addFlags(r1)
                goto L38
            L34:
                android.net.Uri r5 = android.net.Uri.fromFile(r5)
            L38:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "uri.getPath()="
                r1.append(r2)
                java.lang.String r2 = r5.getPath()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.orhanobut.logger.j.c(r1)
                java.lang.String r1 = "application/vnd.android.package-archive"
                r0.setDataAndType(r5, r1)
                r5 = 268435456(0x10000000, float:2.524355E-29)
                r0.addFlags(r5)
                com.bxkj.student.common.versionupdate.a r5 = r4.b
                android.content.Context r5 = com.bxkj.student.common.versionupdate.a.a(r5)
                r5.startActivity(r0)
                cn.bluemobi.dylan.base.utils.a r5 = cn.bluemobi.dylan.base.utils.a.n()
                r5.j()
                return
        }

        private void g(java.io.File r3) {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                android.net.Uri r3 = android.net.Uri.fromFile(r3)
                java.lang.String r1 = "application/vnd.android.package-archive"
                r0.setDataAndType(r3, r1)
                r3 = 268435456(0x10000000, float:2.524355E-29)
                r0.setFlags(r3)
                com.bxkj.student.common.versionupdate.a r3 = r2.b
                android.content.Context r3 = com.bxkj.student.common.versionupdate.a.a(r3)
                r3.startActivity(r0)
                return
        }

        @Override // com.bxkj.student.common.download.a.d
        public void a(java.io.File r3) {
                r2 = this;
                java.lang.String r0 = "下载完成"
                com.orhanobut.logger.j.c(r0)
                android.app.ProgressDialog r0 = r2.a
                r0.dismiss()
                com.bxkj.base.util.InstallUtil r0 = new com.bxkj.base.util.InstallUtil
                com.bxkj.student.common.versionupdate.a r1 = r2.b
                android.content.Context r1 = com.bxkj.student.common.versionupdate.a.a(r1)
                r0.<init>(r1, r3)
                r0.c()
                return
        }

        @Override // com.bxkj.student.common.download.a.d
        public void b(long r2, long r4, int r6) {
                r1 = this;
                android.app.ProgressDialog r6 = r1.a
                r6.show()
                android.app.ProgressDialog r6 = r1.a
                java.lang.String r0 = "%1d M/%2d M"
                r6.setProgressNumberFormat(r0)
                android.app.ProgressDialog r6 = r1.a
                int r2 = r1.d(r2)
                r6.setMax(r2)
                android.app.ProgressDialog r2 = r1.a
                int r3 = r1.d(r4)
                r2.setProgress(r3)
                return
        }

        public int d(long r1) {
                r0 = this;
                float r1 = (float) r1
                r2 = 1048576(0x100000, float:1.469368E-39)
                float r2 = (float) r2
                float r1 = r1 / r2
                r2 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 * r2
                int r1 = java.lang.Math.round(r1)
                float r1 = (float) r1
                float r1 = r1 / r2
                int r1 = java.lang.Math.round(r1)
                return r1
        }

        public java.lang.String e(long r7) {
                r6 = this;
                r0 = 0
                r1 = 1
                r2 = 1073741824(0x40000000, double:5.304989477E-315)
                int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r4 < 0) goto L1b
                float r7 = (float) r7
                float r8 = (float) r2
                float r7 = r7 / r8
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                java.lang.Object[] r8 = new java.lang.Object[r1]
                r8[r0] = r7
                java.lang.String r7 = "%.1f GB"
                java.lang.String r7 = java.lang.String.format(r7, r8)
                return r7
            L1b:
                r2 = 1120403456(0x42c80000, float:100.0)
                r3 = 1048576(0x100000, double:5.180654E-318)
                int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r5 < 0) goto L3d
                float r7 = (float) r7
                float r8 = (float) r3
                float r7 = r7 / r8
                int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r8 <= 0) goto L2e
                java.lang.String r8 = "%.0f MB"
                goto L30
            L2e:
                java.lang.String r8 = "%.1f MB"
            L30:
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r7
                java.lang.String r7 = java.lang.String.format(r8, r1)
                return r7
            L3d:
                r3 = 1024(0x400, double:5.06E-321)
                int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r5 < 0) goto L5c
                float r7 = (float) r7
                float r8 = (float) r3
                float r7 = r7 / r8
                int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r8 <= 0) goto L4d
                java.lang.String r8 = "%.0f KB"
                goto L4f
            L4d:
                java.lang.String r8 = "%.1f KB"
            L4f:
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r7
                java.lang.String r7 = java.lang.String.format(r8, r1)
                return r7
            L5c:
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                java.lang.Object[] r8 = new java.lang.Object[r1]
                r8[r0] = r7
                java.lang.String r7 = "%d B"
                java.lang.String r7 = java.lang.String.format(r7, r8)
                return r7
        }

        @Override // com.bxkj.student.common.download.a.d
        public void onDownloadFailed() {
                r2 = this;
                java.lang.String r0 = "下载失败"
                com.orhanobut.logger.j.c(r0)
                android.app.ProgressDialog r0 = r2.a
                r0.dismiss()
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.setAction(r1)
                java.lang.String r1 = "https://sj.qq.com/myapp/detail.htm?apkName=com.bxkj.student"
                android.net.Uri r1 = android.net.Uri.parse(r1)
                r0.setData(r1)
                com.bxkj.student.common.versionupdate.a r1 = r2.b
                android.content.Context r1 = com.bxkj.student.common.versionupdate.a.a(r1)
                r1.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a(boolean r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);

        void b();
    }

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context a(com.bxkj.student.common.versionupdate.a r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    public rx.m b(com.bxkj.student.common.versionupdate.a.d r6) {
            r5 = this;
            android.content.Context r0 = r5.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            r1 = 0
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setCanCancel(r1)
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            b0.b r3 = b0.b.a
            android.content.Context r4 = r5.a
            java.lang.String r3 = r3.f(r4)
            rx.e r1 = r1.a(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.common.versionupdate.a$a r1 = new com.bxkj.student.common.versionupdate.a$a
            r1.<init>(r5, r6)
            rx.m r6 = r0.setDataListener(r1)
            return r6
    }

    public void c(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            android.content.Context r1 = r3.a
            r0.<init>(r1)
            java.lang.String r1 = "正在下载..."
            r0.setTitle(r1)
            r1 = 1
            r0.setProgressStyle(r1)
            r1 = 0
            r0.setIndeterminate(r1)
            r0.setProgress(r1)
            r0.setCancelable(r1)
            com.bxkj.student.common.download.a r1 = com.bxkj.student.common.download.a.f()
            com.bxkj.student.common.versionupdate.a$c r2 = new com.bxkj.student.common.versionupdate.a$c
            r2.<init>(r3, r0)
            r1.e(r4, r5, r2)
            return
    }

    public android.app.Dialog d(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.a
            r0.<init>(r1)
            java.lang.String r1 = "提示"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "检测到新版本"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "请升级\n"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r6 = r0.setMessage(r6)
            java.lang.String r0 = "升级"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r6 = r6.setOneButtonText(r0)
            r0 = 3
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r6 = r6.setMessageGrivity(r0)
            com.bxkj.student.common.versionupdate.a$b r0 = new com.bxkj.student.common.versionupdate.a$b
            r0.<init>(r3, r5, r4)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r6.setButtonOnClickListener(r0)
            r5 = 0
            r4.setClickAutoCancel(r5)
            r4.setCancelable(r5)
            r4.show()
            return r4
    }
}
