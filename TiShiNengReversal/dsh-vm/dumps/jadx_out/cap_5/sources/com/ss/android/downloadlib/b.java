package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements w2.e {
    private static java.lang.String b = "b";
    private android.os.Handler a;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.b a;

        a(com.ss.android.downloadlib.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                r5 = 0
                r6 = 0
                r1 = 5
                r3 = 0
                java.lang.String r4 = "无网络，请检查网络设置"
                r0.j(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.b$b, reason: collision with other inner class name */
    class RunnableC0207b implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.downloader.jy.j a;
        final /* synthetic */ com.ss.android.j.j.cw.b b;
        final /* synthetic */ com.ss.android.downloadlib.b c;

        RunnableC0207b(com.ss.android.downloadlib.b r1, com.ss.android.socialbase.downloader.jy.j r2, com.ss.android.j.j.cw.b r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                com.ss.android.socialbase.downloader.jy.j r0 = r10.a
                java.lang.String r1 = "no_enough_space_toast_text"
                java.lang.String r2 = "您的存储空间不足，请清理后再试"
                java.lang.String r7 = r0.j(r1, r2)
                v2.w r3 = com.ss.android.downloadlib.addownload.m.d()
                android.content.Context r5 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.j.j.cw.b r6 = r10.b
                r8 = 0
                r9 = 0
                r4 = 2
                r3.j(r4, r5, r6, r7, r8, r9)
                return
        }
    }

    class c implements com.ss.android.socialbase.downloader.j.j.j {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ double d;
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw e;
        final /* synthetic */ com.ss.android.downloadlib.b f;

        c(com.ss.android.downloadlib.b r1, com.ss.android.xt.j.xt.b r2, long r3, long r5, double r7, com.ss.android.socialbase.downloader.ae.cw r9) {
                r0 = this;
                r0.f = r1
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.d = r7
                r0.e = r9
                r0.<init>()
                return
        }

        public void cw() {
                r0 = this;
                return
        }

        public void xt() {
                r7 = this;
                com.ss.android.xt.j.xt.b r0 = r7.a
                boolean r0 = com.ss.android.downloadlib.a.h.M(r0)
                if (r0 != 0) goto L4a
                long r0 = r7.b
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L49
                long r4 = r7.c
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 <= 0) goto L49
                double r0 = (double) r0
                double r2 = r7.d
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L49
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "install_no_enough_space"
                org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.j.e(r1)
                com.ss.android.xt.j.xt.b r2 = r7.a
                java.lang.String r3 = "clean_space_install"
                r0.r(r3, r1, r2)
                com.ss.android.socialbase.downloader.ae.cw r0 = r7.e
                double r1 = r7.d
                long r1 = (long) r1
                long r3 = r7.b
                long r1 = r1 - r3
                boolean r0 = com.ss.android.downloadlib.addownload.j.q(r0, r1)
                if (r0 == 0) goto L49
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                r0.xt(r7)
                com.ss.android.xt.j.xt.b r0 = r7.a
                r1 = 1
                r0.e(r1)
            L49:
                return
            L4a:
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                r0.xt(r7)
                return
        }
    }

    public class d extends w2.f {
        private static java.lang.String a = "b$d";

        class a implements w2.g {
            private com.ss.android.j.j.up.a.b a;
            private android.content.DialogInterface.OnClickListener b;
            private android.content.DialogInterface.OnClickListener c;
            private android.content.DialogInterface.OnCancelListener d;
            final /* synthetic */ android.content.Context e;
            final /* synthetic */ com.ss.android.downloadlib.b.d f;

            /* renamed from: com.ss.android.downloadlib.b$d$a$a, reason: collision with other inner class name */
            class C0208a implements com.ss.android.j.j.up.a.c {
                final /* synthetic */ com.ss.android.downloadlib.b.d.a a;

                C0208a(com.ss.android.downloadlib.b.d.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // com.ss.android.j.j.up.a.c
                public void cw(android.content.DialogInterface r2) {
                        r1 = this;
                        com.ss.android.downloadlib.b$d$a r0 = r1.a
                        android.content.DialogInterface$OnCancelListener r0 = com.ss.android.downloadlib.b.d.a.d(r0)
                        if (r0 == 0) goto L13
                        if (r2 == 0) goto L13
                        com.ss.android.downloadlib.b$d$a r0 = r1.a
                        android.content.DialogInterface$OnCancelListener r0 = com.ss.android.downloadlib.b.d.a.d(r0)
                        r0.onCancel(r2)
                    L13:
                        return
                }

                @Override // com.ss.android.j.j.up.a.c
                public void j(android.content.DialogInterface r3) {
                        r2 = this;
                        com.ss.android.downloadlib.b$d$a r0 = r2.a
                        android.content.DialogInterface$OnClickListener r0 = com.ss.android.downloadlib.b.d.a.e(r0)
                        if (r0 == 0) goto L12
                        com.ss.android.downloadlib.b$d$a r0 = r2.a
                        android.content.DialogInterface$OnClickListener r0 = com.ss.android.downloadlib.b.d.a.e(r0)
                        r1 = -1
                        r0.onClick(r3, r1)
                    L12:
                        return
                }

                @Override // com.ss.android.j.j.up.a.c
                public void xt(android.content.DialogInterface r3) {
                        r2 = this;
                        com.ss.android.downloadlib.b$d$a r0 = r2.a
                        android.content.DialogInterface$OnClickListener r0 = com.ss.android.downloadlib.b.d.a.f(r0)
                        if (r0 == 0) goto L12
                        com.ss.android.downloadlib.b$d$a r0 = r2.a
                        android.content.DialogInterface$OnClickListener r0 = com.ss.android.downloadlib.b.d.a.f(r0)
                        r1 = -2
                        r0.onClick(r3, r1)
                    L12:
                        return
                }
            }

            a(com.ss.android.downloadlib.b.d r1, android.content.Context r2) {
                    r0 = this;
                    r0.f = r1
                    r0.e = r2
                    r0.<init>()
                    com.ss.android.j.j.up.a$b r1 = new com.ss.android.j.j.up.a$b
                    r1.<init>(r2)
                    r0.a = r1
                    return
            }

            static /* synthetic */ android.content.DialogInterface.OnCancelListener d(com.ss.android.downloadlib.b.d.a r0) {
                    android.content.DialogInterface$OnCancelListener r0 = r0.d
                    return r0
            }

            static /* synthetic */ android.content.DialogInterface.OnClickListener e(com.ss.android.downloadlib.b.d.a r0) {
                    android.content.DialogInterface$OnClickListener r0 = r0.b
                    return r0
            }

            static /* synthetic */ android.content.DialogInterface.OnClickListener f(com.ss.android.downloadlib.b.d.a r0) {
                    android.content.DialogInterface$OnClickListener r0 = r0.c
                    return r0
            }

            public w2.g a(int r3, android.content.DialogInterface.OnClickListener r4) {
                    r2 = this;
                    com.ss.android.j.j.up.a$b r0 = r2.a
                    android.content.Context r1 = r2.e
                    android.content.res.Resources r1 = r1.getResources()
                    java.lang.String r3 = r1.getString(r3)
                    r0.l(r3)
                    r2.c = r4
                    return r2
            }

            public w2.g b(int r3, android.content.DialogInterface.OnClickListener r4) {
                    r2 = this;
                    com.ss.android.j.j.up.a$b r0 = r2.a
                    android.content.Context r1 = r2.e
                    android.content.res.Resources r1 = r1.getResources()
                    java.lang.String r3 = r1.getString(r3)
                    r0.b(r3)
                    r2.b = r4
                    return r2
            }

            public w2.g c(android.content.DialogInterface.OnCancelListener r1) {
                    r0 = this;
                    r0.d = r1
                    return r0
            }

            public w2.g j(int r3) {
                    r2 = this;
                    com.ss.android.j.j.up.a$b r0 = r2.a
                    android.content.Context r1 = r2.e
                    android.content.res.Resources r1 = r1.getResources()
                    java.lang.String r3 = r1.getString(r3)
                    r0.h(r3)
                    return r2
            }

            public w2.g j(java.lang.String r2) {
                    r1 = this;
                    com.ss.android.j.j.up.a$b r0 = r1.a
                    r0.p(r2)
                    return r1
            }

            public w2.g j(boolean r2) {
                    r1 = this;
                    com.ss.android.j.j.up.a$b r0 = r1.a
                    r0.i(r2)
                    return r1
            }

            public w2.n j() {
                    r3 = this;
                    com.ss.android.j.j.up.a$b r0 = r3.a
                    com.ss.android.downloadlib.b$d$a$a r1 = new com.ss.android.downloadlib.b$d$a$a
                    r1.<init>(r3)
                    r0.g(r1)
                    java.lang.String r0 = com.ss.android.downloadlib.b.d.b()
                    java.lang.String r1 = "getThemedAlertDlgBuilder"
                    r2 = 0
                    com.ss.android.downloadlib.a.k.d(r0, r1, r2)
                    com.ss.android.j.j.up.a$b r0 = r3.a
                    r1 = 3
                    r0.e(r1)
                    v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                    com.ss.android.j.j.up.a$b r1 = r3.a
                    com.ss.android.j.j.up.a r1 = r1.j()
                    android.app.Dialog r0 = r0.xt(r1)
                    com.ss.android.downloadlib.b$d$b r1 = new com.ss.android.downloadlib.b$d$b
                    r1.<init>(r0)
                    return r1
            }
        }

        /* renamed from: com.ss.android.downloadlib.b$d$b, reason: collision with other inner class name */
        private static class C0209b implements w2.n {
            private android.app.Dialog a;

            public C0209b(android.app.Dialog r1) {
                    r0 = this;
                    r0.<init>()
                    if (r1 == 0) goto La
                    r0.a = r1
                    r0.j()
                La:
                    return
            }

            public void j() {
                    r1 = this;
                    android.app.Dialog r0 = r1.a
                    if (r0 == 0) goto L7
                    r0.show()
                L7:
                    return
            }

            public boolean xt() {
                    r1 = this;
                    android.app.Dialog r0 = r1.a
                    if (r0 == 0) goto L9
                    boolean r0 = r0.isShowing()
                    return r0
                L9:
                    r0 = 0
                    return r0
            }
        }

        static {
                return
        }

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String b() {
                java.lang.String r0 = com.ss.android.downloadlib.b.d.a
                return r0
        }

        public w2.g j(android.content.Context r2) {
                r1 = this;
                com.ss.android.downloadlib.b$d$a r0 = new com.ss.android.downloadlib.b$d$a
                r0.<init>(r1, r2)
                return r0
        }
    }

    public class e implements com.ss.android.socialbase.downloader.r.ws {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.io.File a(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.io.File r0 = new java.io.File
                r0.<init>(r4)
                java.lang.String r4 = r0.getName()
                r1 = 46
                int r1 = r4.lastIndexOf(r1)
                if (r1 <= 0) goto L16
                r3 = 0
                java.lang.String r3 = r4.substring(r3, r1)
            L16:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                java.lang.String r3 = ".apk"
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.io.File r4 = new java.io.File
                java.lang.String r0 = r0.getParent()
                r4.<init>(r0, r3)
                return r4
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r3) throws com.ss.android.socialbase.downloader.up.j {
                r2 = this;
                v2.c r0 = com.ss.android.downloadlib.addownload.m.A()
                if (r3 == 0) goto L35
                if (r0 == 0) goto L35
                java.lang.String r0 = r3.la()
                java.lang.String r1 = r3.ws()
                java.io.File r0 = r2.a(r0, r1)
                com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r1 = r1.f(r3)
                if (r1 == 0) goto L25
                org.json.JSONObject r1 = r1.ae()
                com.ss.android.downloadlib.a.h.r(r1)
            L25:
                java.lang.String r1 = "application/vnd.android.package-archive"
                r3.oq(r1)
                java.lang.String r0 = r0.getName()
                r3.m(r0)
                r0 = 0
                r3.qv(r0)
            L35:
                return
        }

        public boolean xt(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                if (r2 == 0) goto L13
                int r0 = r2.ae()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r2 = r2.xw()
                boolean r2 = t2.b.f(r0, r2)
                return r2
            L13:
                r2 = 0
                return r2
        }
    }

    public class f implements com.ss.android.socialbase.downloader.r.ws {

        class a implements android.media.MediaScannerConnection.OnScanCompletedListener {
            final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
            final /* synthetic */ com.ss.android.downloadlib.b.f b;

            a(com.ss.android.downloadlib.b.f r1, com.ss.android.socialbase.downloader.ae.cw r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(java.lang.String r2, android.net.Uri r3) {
                    r1 = this;
                    if (r3 == 0) goto L16
                    com.ss.android.socialbase.downloader.ae.cw r2 = r1.a
                    java.lang.String r0 = "file_content_uri"
                    java.lang.String r3 = r3.toString()
                    r2.j(r0, r3)
                    com.ss.android.socialbase.downloader.downloader.vl r2 = com.ss.android.socialbase.downloader.downloader.cw.x()
                    com.ss.android.socialbase.downloader.ae.cw r3 = r1.a
                    r2.j(r3)
                L16:
                    return
            }
        }

        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        private boolean a(com.ss.android.socialbase.downloader.ae.cw r8) {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r8.qv()
                r0.append(r1)
                java.lang.String r1 = java.io.File.separator
                r0.append(r1)
                java.lang.String r2 = r8.tl()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.io.File r2 = new java.io.File
                r2.<init>(r0)
                android.content.pm.PackageInfo r3 = com.ss.android.socialbase.appdownloader.b.m(r8, r2)
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.j.f.d(r4, r3, r0)
                boolean r3 = android.text.TextUtils.isEmpty(r0)
                r4 = 0
                if (r3 != 0) goto L7c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                java.lang.String r0 = ".apk"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = r8.tl()
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L51
                r8 = 1
                return r8
            L51:
                java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L76
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
                r5.<init>()     // Catch: java.lang.Exception -> L76
                java.lang.String r6 = r8.qv()     // Catch: java.lang.Exception -> L76
                r5.append(r6)     // Catch: java.lang.Exception -> L76
                r5.append(r1)     // Catch: java.lang.Exception -> L76
                r5.append(r0)     // Catch: java.lang.Exception -> L76
                java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L76
                r3.<init>(r1)     // Catch: java.lang.Exception -> L76
                boolean r4 = r2.renameTo(r3)     // Catch: java.lang.Exception -> L76
                if (r4 == 0) goto L78
                r8.m(r0)     // Catch: java.lang.Exception -> L76
                return r4
            L76:
                r8 = move-exception
                goto L79
            L78:
                return r4
            L79:
                com.bytedance.sdk.component.utils.vl.j(r8)
            L7c:
                return r4
        }

        private void b(android.content.Context r10, com.ss.android.socialbase.downloader.ae.cw r11) {
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r11.qv()
                r0.append(r1)
                java.lang.String r1 = java.io.File.separator
                r0.append(r1)
                java.lang.String r1 = r11.tl()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.content.ContentResolver r1 = r10.getContentResolver()
                java.lang.String r7 = "external"
                android.net.Uri r2 = android.provider.MediaStore.Files.getContentUri(r7)
                java.lang.String r8 = "_id"
                java.lang.String[] r3 = new java.lang.String[]{r8}
                java.lang.String[] r5 = new java.lang.String[]{r0}
                r6 = 0
                java.lang.String r4 = "_data=? "
                android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L5a
                boolean r2 = r1.moveToFirst()
                if (r2 == 0) goto L5a
                int r10 = r1.getColumnIndex(r8)
                int r10 = r1.getInt(r10)
                android.net.Uri r0 = android.provider.MediaStore.Files.getContentUri(r7)
                long r2 = (long) r10
                android.net.Uri r10 = android.content.ContentUris.withAppendedId(r0, r2)
                java.lang.String r0 = "file_content_uri"
                java.lang.String r10 = r10.toString()
                r11.j(r0, r10)
                goto L6c
            L5a:
                java.lang.String[] r0 = new java.lang.String[]{r0}
                java.lang.String r2 = "application/vnd.android.package-archive"
                java.lang.String[] r2 = new java.lang.String[]{r2}
                com.ss.android.downloadlib.b$f$a r3 = new com.ss.android.downloadlib.b$f$a
                r3.<init>(r9, r11)
                android.media.MediaScannerConnection.scanFile(r10, r0, r2, r3)
            L6c:
                r10 = 1
                android.database.Cursor[] r10 = new android.database.Cursor[r10]
                r11 = 0
                r10[r11] = r1
                com.ss.android.socialbase.downloader.az.m.j(r10)
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r2) throws com.ss.android.socialbase.downloader.up.j {
                r1 = this;
                if (r2 == 0) goto Lf
                boolean r0 = r1.a(r2)
                if (r0 == 0) goto Lf
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                r1.b(r0, r2)
            Lf:
                return
        }

        public boolean xt(com.ss.android.socialbase.downloader.ae.cw r1) {
                r0 = this;
                if (r1 == 0) goto Lf
                int r1 = r1.ae()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
                boolean r1 = com.ss.android.downloadlib.a.n.z(r1)
                return r1
            Lf:
                r1 = 0
                return r1
        }
    }

    public class g implements w2.m {
        private android.content.Context a;

        public g(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
                r0.a = r1
                return
        }

        public void a(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                android.content.Context r2 = r0.a
                if (r2 != 0) goto L5
                goto L23
            L5:
                com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
                com.ss.android.socialbase.downloader.ae.cw r1 = r2.tl(r1)
                if (r1 == 0) goto L23
                int r2 = r1.i()
                r3 = -3
                if (r2 == r3) goto L17
                goto L23
            L17:
                r1.ae(r4)
                com.ss.android.downloadlib.addownload.o r2 = com.ss.android.downloadlib.addownload.o.a()
                android.content.Context r3 = r0.a
                r2.b(r3, r1)
            L23:
                return
        }

        public void b(int r11, int r12, java.lang.String r13, int r14, long r15) {
                r10 = this;
                android.content.Context r13 = r10.a
                if (r13 != 0) goto L6
                goto L94
            L6:
                com.ss.android.socialbase.downloader.downloader.ae r13 = com.ss.android.socialbase.downloader.downloader.ae.xt(r13)
                com.ss.android.socialbase.downloader.ae.cw r1 = r13.tl(r11)
                if (r1 == 0) goto L94
                int r11 = r1.i()
                if (r11 != 0) goto L18
                goto L94
            L18:
                com.ss.android.downloadlib.addownload.o$f r11 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r11 = r11.f(r1)
                if (r11 != 0) goto L23
                goto L94
            L23:
                r13 = 1
                if (r12 == r13) goto L66
                r13 = 3
                java.lang.String r0 = "download_notification"
                if (r12 == r13) goto L53
                r13 = 5
                if (r12 == r13) goto L49
                r13 = 6
                if (r12 == r13) goto L3f
                r13 = 7
                if (r12 == r13) goto L35
                goto L94
            L35:
                com.ss.android.downloadlib.r.b r12 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r13 = "download_notification_click"
                r12.n(r0, r13, r11)
                return
            L3f:
                com.ss.android.downloadlib.r.b r12 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r13 = "download_notification_continue"
                r12.n(r0, r13, r11)
                return
            L49:
                com.ss.android.downloadlib.r.b r12 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r13 = "download_notification_pause"
                r12.n(r0, r13, r11)
                return
            L53:
                org.json.JSONObject r12 = new org.json.JSONObject
                r12.<init>()
                org.json.JSONObject r12 = com.ss.android.downloadlib.d.w(r12, r1)
                com.ss.android.downloadlib.r.b r13 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "download_notification_install"
                r13.p(r0, r1, r12, r11)
                return
            L66:
                com.ss.android.downloadlib.d.m(r1, r11)
                java.lang.String r12 = "application/vnd.android.package-archive"
                java.lang.String r13 = r1.xw()
                boolean r12 = r12.equals(r13)
                if (r12 == 0) goto L94
                com.ss.android.downloadlib.addownload.e r0 = com.ss.android.downloadlib.addownload.e.a()
                long r2 = r11.xt()
                long r4 = r11.vl()
                java.lang.String r6 = r11.up()
                java.lang.String r7 = r1.g()
                java.lang.String r8 = r11.r()
                java.lang.String r9 = r1.ws()
                r0.c(r1, r2, r4, r6, r7, r8, r9)
            L94:
                return
        }

        public void j(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                com.ss.android.downloadlib.d r1 = com.ss.android.downloadlib.d.d()
                r1.p(r2)
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r5) {
                r4 = this;
                if (r5 != 0) goto L3
                return
            L3:
                com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()
                r0.i(r5)
                int r0 = r5.ae()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "report_download_cancel"
                r2 = 1
                int r0 = r0.j(r1, r2)
                java.lang.String r1 = ""
                r3 = 1012(0x3f4, float:1.418E-42)
                if (r0 != r2) goto L2c
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
                r2.<init>(r3, r1)
                r0.i(r5, r2)
                return
            L2c:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
                r2.<init>(r3, r1)
                r0.u(r5, r2)
                return
        }

        public boolean j() {
                r1 = this;
                com.ss.android.downloadlib.addownload.o r0 = com.ss.android.downloadlib.addownload.o.a()
                boolean r0 = r0.c()
                return r0
        }

        public boolean j(int r1, boolean r2) {
                r0 = this;
                v2.p r1 = com.ss.android.downloadlib.addownload.m.c()
                if (r1 == 0) goto Lf
                v2.p r1 = com.ss.android.downloadlib.addownload.m.c()
                boolean r1 = r1.j(r2)
                return r1
            Lf:
                r1 = 0
                return r1
        }
    }

    public class h implements w2.l, com.ss.android.socialbase.downloader.r.vl {

        class a implements java.lang.Runnable {
            final /* synthetic */ com.ss.android.downloadlib.b.h a;

            a(com.ss.android.downloadlib.b.h r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r8 = this;
                    com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                    r0.v()
                    com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                    java.util.concurrent.ConcurrentHashMap r0 = r0.b()
                    java.util.Collection r0 = r0.values()
                    java.util.Iterator r0 = r0.iterator()
                L17:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto Lcd
                    java.lang.Object r1 = r0.next()
                    com.ss.android.xt.j.xt.b r1 = (com.ss.android.xt.j.xt.b) r1
                    int r2 = r1.mi()
                    if (r2 == 0) goto L17
                    com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r2)
                    java.lang.String r4 = "notification_opt_2"
                    int r4 = r3.xt(r4)
                    r5 = 1
                    if (r4 != r5) goto L17
                    android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                    com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
                    com.ss.android.socialbase.downloader.ae.cw r2 = r4.tl(r2)
                    if (r2 == 0) goto L17
                    boolean r4 = com.ss.android.downloadlib.a.h.M(r1)
                    if (r4 == 0) goto L73
                    java.lang.String r4 = r1.up()
                    boolean r4 = com.ss.android.downloadlib.a.h.d(r4)
                    if (r4 != 0) goto L73
                    java.lang.String r4 = "restart_notify_open_app_count"
                    int r6 = r2.jy(r4)
                    java.lang.String r7 = "noti_open_restart_times"
                    int r3 = r3.j(r7, r5)
                    if (r6 >= r3) goto L17
                    com.ss.android.downloadlib.b$i r3 = com.ss.android.downloadlib.b.i.c()
                    r3.k(r1)
                    int r6 = r6 + 1
                    java.lang.String r1 = java.lang.String.valueOf(r6)
                    r2.j(r4, r1)
                    goto L17
                L73:
                    int r4 = r2.v()
                    r6 = -2
                    if (r4 != r6) goto L9a
                    java.lang.String r4 = "restart_notify_continue_count"
                    int r6 = r2.jy(r4)
                    java.lang.String r7 = "noti_continue_restart_times"
                    int r3 = r3.j(r7, r5)
                    if (r6 >= r3) goto L17
                    com.ss.android.downloadlib.b$i r3 = com.ss.android.downloadlib.b.i.c()
                    r3.g(r1)
                    int r6 = r6 + 1
                    java.lang.String r1 = java.lang.String.valueOf(r6)
                    r2.j(r4, r1)
                    goto L17
                L9a:
                    int r4 = r2.v()
                    r6 = -3
                    if (r4 != r6) goto L17
                    boolean r4 = com.ss.android.socialbase.downloader.az.m.cw(r2)
                    if (r4 == 0) goto L17
                    boolean r4 = com.ss.android.downloadlib.a.h.M(r1)
                    if (r4 != 0) goto L17
                    java.lang.String r4 = "restart_notify_install_count"
                    int r6 = r2.jy(r4)
                    java.lang.String r7 = "noti_install_restart_times"
                    int r3 = r3.j(r7, r5)
                    if (r6 >= r3) goto L17
                    com.ss.android.downloadlib.b$i r3 = com.ss.android.downloadlib.b.i.c()
                    r3.a(r1)
                    int r6 = r6 + 1
                    java.lang.String r1 = java.lang.String.valueOf(r6)
                    r2.j(r4, r1)
                    goto L17
                Lcd:
                    return
            }
        }

        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(com.ss.android.socialbase.downloader.ae.cw r2, boolean r3) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                int r0 = r2.v()
                r1.b(r2, r0, r3)
                return
        }

        @androidx.annotation.WorkerThread
        public void b(com.ss.android.socialbase.downloader.ae.cw r6, int r7, boolean r8) {
                r5 = this;
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                r0.v()
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r0 = r0.f(r6)
                if (r0 != 0) goto L12
                goto L26
            L12:
                if (r8 == 0) goto L1f
                int r1 = r6.pm()     // Catch: java.lang.Throwable -> L1c
                r0.o(r1)     // Catch: java.lang.Throwable -> L1c
                goto L2a
            L1c:
                r6 = move-exception
                goto La2
            L1f:
                int r1 = r0.E()     // Catch: java.lang.Throwable -> L1c
                r2 = -1
                if (r1 != r2) goto L27
            L26:
                return
            L27:
                r0.o(r2)     // Catch: java.lang.Throwable -> L1c
            L2a:
                com.ss.android.downloadlib.addownload.o$d r1 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> L1c
                r1.d(r0)     // Catch: java.lang.Throwable -> L1c
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
                r1.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = "download_id"
                int r3 = r6.ae()     // Catch: java.lang.Throwable -> L1c
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = "name"
                java.lang.String r3 = r6.tl()     // Catch: java.lang.Throwable -> L1c
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = "url"
                java.lang.String r3 = r6.oq()     // Catch: java.lang.Throwable -> L1c
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = "download_time"
                long r3 = r6.hu()     // Catch: java.lang.Throwable -> L1c
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = "download_status"
                r1.put(r2, r7)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "cur_bytes"
                long r2 = r6.uq()     // Catch: java.lang.Throwable -> L1c
                r1.put(r7, r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "total_bytes"
                long r2 = r6.ka()     // Catch: java.lang.Throwable -> L1c
                r1.put(r7, r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "only_wifi"
                boolean r2 = r6.x()     // Catch: java.lang.Throwable -> L1c
                r1.put(r7, r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "chunk_count"
                int r2 = r6.kj()     // Catch: java.lang.Throwable -> L1c
                r1.put(r7, r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "launch_resumed"
                if (r8 == 0) goto L89
                r8 = 1
                goto L8a
            L89:
                r8 = 2
            L8a:
                r1.put(r7, r8)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "failed_resume_count"
                int r6 = r6.pm()     // Catch: java.lang.Throwable -> L1c
                r1.put(r7, r6)     // Catch: java.lang.Throwable -> L1c
                com.ss.android.downloadlib.r.b r6 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "embeded_ad"
                java.lang.String r8 = "download_uncompleted"
                r6.p(r7, r8, r1, r0)     // Catch: java.lang.Throwable -> L1c
                return
            La2:
                com.bytedance.sdk.component.utils.vl.j(r6)
                return
        }

        public void j() {
                r4 = this;
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.b$h$a r1 = new com.ss.android.downloadlib.b$h$a
                r1.<init>(r4)
                r2 = 5000(0x1388, double:2.4703E-320)
                r0.e(r1, r2)
                return
        }
    }

    public class i {

        class a implements java.lang.Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ com.ss.android.xt.j.xt.b b;
            final /* synthetic */ com.ss.android.downloadlib.b.i c;

            a(com.ss.android.downloadlib.b.i r1, int r2, com.ss.android.xt.j.xt.b r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                    com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                    int r1 = r4.a
                    com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r1)
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    r2 = 1
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    java.lang.String r3 = "ttdownloader_type"
                    com.ss.android.downloadlib.a.h.u(r1, r3, r2)
                    com.ss.android.downloadlib.a.i.a(r0, r1)
                    if (r0 == 0) goto L3a
                    r2 = -2
                    int r3 = r0.v()
                    if (r2 != r3) goto L3a
                    boolean r0 = r0.qb()
                    if (r0 == 0) goto L30
                    goto L3a
                L30:
                    com.ss.android.downloadlib.b$i r0 = r4.c
                    int r2 = r4.a
                    com.ss.android.xt.j.xt.b r3 = r4.b
                    com.ss.android.downloadlib.b.i.f(r0, r2, r3, r1)
                    goto L45
                L3a:
                    r0 = 1001(0x3e9, float:1.403E-42)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.String r2 = "error_code"
                    com.ss.android.downloadlib.a.h.u(r1, r2, r0)
                L45:
                    com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "download_notification_try_show"
                    com.ss.android.xt.j.xt.b r3 = r4.b
                    r0.x(r2, r1, r3)
                    return
            }
        }

        /* renamed from: com.ss.android.downloadlib.b$i$b, reason: collision with other inner class name */
        class RunnableC0210b implements java.lang.Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ com.ss.android.xt.j.xt.b b;
            final /* synthetic */ com.ss.android.downloadlib.b.i c;

            RunnableC0210b(com.ss.android.downloadlib.b.i r1, int r2, com.ss.android.xt.j.xt.b r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                    com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                    int r1 = r4.a
                    com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r1)
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    r2 = 2
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    java.lang.String r3 = "ttdownloader_type"
                    com.ss.android.downloadlib.a.h.u(r1, r3, r2)
                    com.ss.android.downloadlib.a.i.a(r0, r1)
                    com.ss.android.xt.j.xt.b r0 = r4.b
                    boolean r0 = com.ss.android.downloadlib.a.h.M(r0)
                    if (r0 == 0) goto L34
                    r0 = 1002(0x3ea, float:1.404E-42)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.String r2 = "error_code"
                    com.ss.android.downloadlib.a.h.u(r1, r2, r0)
                    goto L3d
                L34:
                    com.ss.android.downloadlib.b$i r0 = r4.c
                    int r2 = r4.a
                    com.ss.android.xt.j.xt.b r3 = r4.b
                    com.ss.android.downloadlib.b.i.f(r0, r2, r3, r1)
                L3d:
                    com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "download_notification_try_show"
                    com.ss.android.xt.j.xt.b r3 = r4.b
                    r0.x(r2, r1, r3)
                    return
            }
        }

        class c implements java.lang.Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ com.ss.android.xt.j.xt.b b;
            final /* synthetic */ com.ss.android.downloadlib.b.i c;

            c(com.ss.android.downloadlib.b.i r1, int r2, com.ss.android.xt.j.xt.b r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                    com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                    int r1 = r4.a
                    com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r1)
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    r2 = 3
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    java.lang.String r3 = "ttdownloader_type"
                    com.ss.android.downloadlib.a.h.u(r1, r3, r2)
                    com.ss.android.downloadlib.a.i.a(r0, r1)
                    com.ss.android.xt.j.xt.b r0 = r4.b
                    java.lang.String r0 = r0.up()
                    boolean r0 = com.ss.android.downloadlib.a.h.d(r0)
                    if (r0 == 0) goto L38
                    r0 = 1003(0x3eb, float:1.406E-42)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.String r2 = "error_code"
                    com.ss.android.downloadlib.a.h.u(r1, r2, r0)
                    goto L41
                L38:
                    com.ss.android.downloadlib.b$i r0 = r4.c
                    int r2 = r4.a
                    com.ss.android.xt.j.xt.b r3 = r4.b
                    com.ss.android.downloadlib.b.i.f(r0, r2, r3, r1)
                L41:
                    com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "download_notification_try_show"
                    com.ss.android.xt.j.xt.b r3 = r4.b
                    r0.x(r2, r1, r3)
                    return
            }
        }

        private static class d {
            private static com.ss.android.downloadlib.b.i a;

            static {
                    com.ss.android.downloadlib.b$i r0 = new com.ss.android.downloadlib.b$i
                    r1 = 0
                    r0.<init>(r1)
                    com.ss.android.downloadlib.b.i.d.a = r0
                    return
            }

            public d() {
                    r1 = this;
                    r1.<init>()
                    return
            }

            static /* synthetic */ com.ss.android.downloadlib.b.i a() {
                    com.ss.android.downloadlib.b$i r0 = com.ss.android.downloadlib.b.i.d.a
                    return r0
            }
        }

        private i() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ i(com.ss.android.downloadlib.b.i.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void b(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r6, long r7) {
                r5 = this;
                int r0 = r6.mi()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r2 = "notification_opt_2"
                int r1 = r1.xt(r2)
                r2 = 1
                if (r1 == r2) goto L12
                return
            L12:
                r5.d(r0)
                com.ss.android.downloadlib.e r1 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.b$i$b r2 = new com.ss.android.downloadlib.b$i$b
                r2.<init>(r5, r0, r6)
                r3 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 * r3
                r1.e(r2, r7)
                return
        }

        public static com.ss.android.downloadlib.b.i c() {
                com.ss.android.downloadlib.b$i r0 = com.ss.android.downloadlib.b.i.d.a()
                return r0
        }

        private void e(int r10, com.ss.android.xt.j.xt.b r11, org.json.JSONObject r12) {
                r9 = this;
                boolean r0 = com.ss.android.socialbase.appdownloader.up.c.e()
                java.lang.String r1 = "error_code"
                if (r0 != 0) goto L12
                r10 = 1004(0x3ec, float:1.407E-42)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                com.ss.android.downloadlib.a.h.u(r12, r1, r10)
                return
            L12:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r10)
                if (r0 != 0) goto L2a
                r10 = 1005(0x3ed, float:1.408E-42)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                com.ss.android.downloadlib.a.h.u(r12, r1, r10)
                return
            L2a:
                com.ss.android.socialbase.downloader.notification.xt r1 = com.ss.android.socialbase.downloader.notification.xt.j()
                com.ss.android.socialbase.downloader.notification.j r1 = r1.up(r10)
                if (r1 == 0) goto L3b
                com.ss.android.socialbase.downloader.notification.xt r1 = com.ss.android.socialbase.downloader.notification.xt.j()
                r1.m(r10)
            L3b:
                com.ss.android.socialbase.appdownloader.up.b r2 = new com.ss.android.socialbase.appdownloader.up.b
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r5 = r0.g()
                java.lang.String r6 = r0.qv()
                java.lang.String r7 = r0.tl()
                java.lang.String r8 = r0.h()
                r4 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8)
                long r3 = r0.uq()
                r2.j(r3)
                long r3 = r0.ka()
                r2.xt(r3)
                int r10 = r0.i()
                r0 = 0
                r1 = 0
                r2.j(r10, r0, r1, r1)
                com.ss.android.socialbase.downloader.notification.xt r10 = com.ss.android.socialbase.downloader.notification.xt.j()
                r10.j(r2)
                r2.j(r0, r1)
                com.ss.android.downloadlib.r.b r10 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r0 = "download_notification_show"
                r10.x(r0, r12, r11)
                return
        }

        static /* synthetic */ void f(com.ss.android.downloadlib.b.i r0, int r1, com.ss.android.xt.j.xt.b r2, org.json.JSONObject r3) {
                r0.e(r1, r2, r3)
                return
        }

        private void m(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r6, long r7) {
                r5 = this;
                int r0 = r6.mi()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r2 = "notification_opt_2"
                int r1 = r1.xt(r2)
                r2 = 1
                if (r1 == r2) goto L12
                return
            L12:
                r5.d(r0)
                com.ss.android.downloadlib.e r1 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.b$i$a r2 = new com.ss.android.downloadlib.b$i$a
                r2.<init>(r5, r0, r6)
                r3 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 * r3
                r1.e(r2, r7)
                return
        }

        public void a(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r3) {
                r2 = this;
                r0 = 5
                r2.b(r3, r0)
                return
        }

        public void d(int r3) {
                r2 = this;
                com.ss.android.socialbase.appdownloader.up.a r0 = com.ss.android.socialbase.appdownloader.up.a.d()
                android.graphics.Bitmap r0 = r0.b(r3)
                if (r0 != 0) goto L23
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r3)
                if (r0 == 0) goto L23
                com.ss.android.socialbase.appdownloader.up.a r1 = com.ss.android.socialbase.appdownloader.up.a.d()
                java.lang.String r0 = r0.et()
                r1.f(r3, r0)
            L23:
                return
        }

        public void g(com.ss.android.xt.j.xt.b r3) {
                r2 = this;
                r0 = 5
                r2.m(r3, r0)
                return
        }

        public void h(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r6, long r7) {
                r5 = this;
                int r0 = r6.mi()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r2 = "notification_opt_2"
                int r1 = r1.xt(r2)
                r2 = 1
                if (r1 == r2) goto L12
                return
            L12:
                r5.d(r0)
                com.ss.android.downloadlib.e r1 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.b$i$c r2 = new com.ss.android.downloadlib.b$i$c
                r2.<init>(r5, r0, r6)
                r3 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 * r3
                r1.e(r2, r7)
                return
        }

        public void i(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r4) {
                r3 = this;
                int r0 = r4.mi()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "noti_open_delay_secs"
                r2 = 5
                int r0 = r0.j(r1, r2)
                long r0 = (long) r0
                r3.h(r4, r0)
                return
        }

        public void j(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r4) {
                r3 = this;
                int r0 = r4.mi()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "noti_install_delay_secs"
                r2 = 5
                int r0 = r0.j(r1, r2)
                long r0 = (long) r0
                r3.b(r4, r0)
                return
        }

        public void k(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r3) {
                r2 = this;
                r0 = 5
                r2.h(r3, r0)
                return
        }

        public void l(com.ss.android.xt.j.xt.b r4) {
                r3 = this;
                if (r4 != 0) goto L3
                return
            L3:
                int r0 = r4.mi()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "noti_continue_delay_secs"
                r2 = 5
                int r0 = r0.j(r1, r2)
                long r0 = (long) r0
                r3.m(r4, r0)
                return
        }
    }

    public class j implements com.ss.android.socialbase.downloader.tl.cw {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        public void j(int r4, java.lang.String r5, org.json.JSONObject r6) {
                r3 = this;
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.socialbase.downloader.ae.cw r4 = r0.tl(r4)
                if (r4 != 0) goto Lf
                goto L19
            Lf:
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r0 = r0.f(r4)
                if (r0 != 0) goto L1a
            L19:
                return
            L1a:
                java.lang.String r1 = "install_view_result"
                boolean r1 = r1.equals(r5)
                if (r1 == 0) goto L36
                org.json.JSONObject r6 = com.ss.android.downloadlib.a.h.r(r6)
                com.ss.android.downloadlib.d.g(r6, r4)
                long r1 = r0.xt()
                java.lang.Long r4 = java.lang.Long.valueOf(r1)
                java.lang.String r1 = "model_id"
                com.ss.android.downloadlib.a.h.u(r6, r1, r4)
            L36:
                com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
                r4.x(r5, r6, r0)
                return
        }

        public void xt(int r2, java.lang.String r3, org.json.JSONObject r4) {
                r1 = this;
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.socialbase.downloader.ae.cw r2 = r0.tl(r2)
                if (r2 != 0) goto Lf
                goto L19
            Lf:
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r2 = r0.f(r2)
                if (r2 != 0) goto L1a
            L19:
                return
            L1a:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                r0.r(r3, r4, r2)
                return
        }
    }

    public class k implements com.ss.android.socialbase.downloader.r.ws {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r4) throws com.ss.android.socialbase.downloader.up.j {
                r3 = this;
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r1 = r4.qv()
                java.lang.String r2 = r4.tl()
                android.content.pm.PackageInfo r0 = com.ss.android.socialbase.appdownloader.b.l(r0, r4, r1, r2)
                if (r0 == 0) goto L17
                int r0 = r0.versionCode
                r4.tl(r0)
            L17:
                return
        }

        public boolean xt(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                if (r2 == 0) goto L10
                boolean r0 = com.ss.android.downloadlib.a.n.y()
                if (r0 == 0) goto L10
                android.content.pm.PackageInfo r2 = r2.ij()
                if (r2 != 0) goto L10
                r2 = 1
                return r2
            L10:
                r2 = 0
                return r2
        }
    }

    static {
            return
    }

    public b() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.a = r0
            return
    }

    private void a(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            int r0 = r3.ae()
            boolean r0 = com.ss.android.downloadlib.a.n.o(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.addownload.c$f r1 = new com.ss.android.downloadlib.addownload.c$f
            r1.<init>(r3)
            r0.k(r1)
            return
    }

    private void b(com.ss.android.socialbase.downloader.ae.cw r15, com.ss.android.xt.j.xt.b r16) {
            r14 = this;
            java.io.File r0 = android.os.Environment.getDataDirectory()
            r1 = -1
            long r6 = com.ss.android.downloadlib.a.h.i(r0, r1)
            java.io.File r0 = android.os.Environment.getDataDirectory()
            long r3 = com.ss.android.downloadlib.a.h.h(r0)
            r8 = 10
            long r3 = r3 / r8
            r8 = 524288000(0x1f400000, double:2.590326893E-315)
            long r3 = java.lang.Math.min(r8, r3)
            long r8 = r15.ka()
            double r3 = (double) r3
            double r10 = (double) r8
            r12 = 4612811918334230528(0x4004000000000000, double:2.5)
            double r10 = r10 * r12
            double r10 = r10 + r3
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L46
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L46
            double r0 = (double) r6
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 >= 0) goto L46
            double r0 = r10 - r0
            long r2 = com.ss.android.downloadlib.addownload.j.s()
            double r2 = (double) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L46
            int r0 = r15.ae()
            com.ss.android.downloadlib.addownload.j.f(r0)
        L46:
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            com.ss.android.downloadlib.b$c r3 = new com.ss.android.downloadlib.b$c
            r4 = r14
            r12 = r15
            r5 = r16
            r3.<init>(r4, r5, r6, r8, r10, r12)
            r0.j(r3)
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r6, com.ss.android.socialbase.downloader.up.j r7, int r8) {
            r5 = this;
            if (r6 != 0) goto L4
            goto L120
        L4:
            r0 = -1
            if (r8 != r0) goto L1d
            if (r7 == 0) goto L1d
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.ss.android.downloadlib.a.i.a(r6, r1)
            com.ss.android.downloadlib.d.g(r1, r6)
            java.lang.String r2 = "download_failed"
            java.lang.String r1 = r1.toString()
            com.ss.android.downloadlib.a.k.c(r2, r1)
        L1d:
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r1 = r1.f(r6)
            if (r1 != 0) goto L29
            goto L120
        L29:
            if (r8 != r0) goto Led
            if (r7 == 0) goto Ldb
            int r8 = r6.ae()     // Catch: java.lang.Exception -> L52
            com.ss.android.socialbase.downloader.jy.j r8 = com.ss.android.socialbase.downloader.jy.j.j(r8)     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = "toast_without_network"
            r2 = 0
            int r8 = r8.j(r0, r2)     // Catch: java.lang.Exception -> L52
            r0 = 1
            if (r8 != r0) goto L55
            int r8 = r7.j()     // Catch: java.lang.Exception -> L52
            r3 = 1049(0x419, float:1.47E-42)
            if (r8 != r3) goto L55
            android.os.Handler r8 = r5.a     // Catch: java.lang.Exception -> L52
            com.ss.android.downloadlib.b$a r3 = new com.ss.android.downloadlib.b$a     // Catch: java.lang.Exception -> L52
            r3.<init>(r5)     // Catch: java.lang.Exception -> L52
            r8.post(r3)     // Catch: java.lang.Exception -> L52
            goto L55
        L52:
            r6 = move-exception
            goto L117
        L55:
            boolean r8 = com.ss.android.socialbase.downloader.az.m.tl(r7)     // Catch: java.lang.Exception -> L52
            if (r8 == 0) goto Lbd
            v2.b r8 = com.ss.android.downloadlib.addownload.m.v()     // Catch: java.lang.Exception -> L52
            if (r8 == 0) goto L64
            com.ss.android.downloadlib.addownload.m.v()     // Catch: java.lang.Exception -> L52
        L64:
            com.ss.android.downloadlib.r.b r8 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "download_failed_for_space"
            r8.m(r3, r1)     // Catch: java.lang.Exception -> L52
            boolean r8 = r1.F()     // Catch: java.lang.Exception -> L52
            if (r8 != 0) goto L7f
            com.ss.android.downloadlib.r.b r8 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "download_can_restart"
            r8.m(r3, r1)     // Catch: java.lang.Exception -> L52
            r5.a(r6)     // Catch: java.lang.Exception -> L52
        L7f:
            v2.b r8 = com.ss.android.downloadlib.addownload.m.v()     // Catch: java.lang.Exception -> L52
            if (r8 == 0) goto L8f
            v2.b r8 = com.ss.android.downloadlib.addownload.m.v()     // Catch: java.lang.Exception -> L52
            boolean r8 = r8.cw()     // Catch: java.lang.Exception -> L52
            if (r8 != 0) goto Lbd
        L8f:
            com.ss.android.downloadlib.addownload.o$f r8 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Exception -> L52
            long r3 = r1.xt()     // Catch: java.lang.Exception -> L52
            com.ss.android.j.j.cw.b r8 = r8.d(r3)     // Catch: java.lang.Exception -> L52
            if (r8 == 0) goto Lbd
            boolean r1 = r8.qv()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto Lbd
            int r1 = r6.ae()     // Catch: java.lang.Exception -> L52
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "show_no_enough_space_toast"
            int r2 = r1.j(r3, r2)     // Catch: java.lang.Exception -> L52
            if (r2 != r0) goto Lbd
            android.os.Handler r0 = r5.a     // Catch: java.lang.Exception -> L52
            com.ss.android.downloadlib.b$b r2 = new com.ss.android.downloadlib.b$b     // Catch: java.lang.Exception -> L52
            r2.<init>(r5, r1, r8)     // Catch: java.lang.Exception -> L52
            r0.post(r2)     // Catch: java.lang.Exception -> L52
        Lbd:
            org.json.JSONObject r8 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = "exception_msg_length"
            r1 = 500(0x1f4, float:7.0E-43)
            int r8 = r8.optInt(r0, r1)     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = r7.getMessage()     // Catch: java.lang.Exception -> L52
            java.lang.String r8 = com.ss.android.downloadlib.a.h.p(r0, r8)     // Catch: java.lang.Exception -> L52
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Exception -> L52
            int r1 = r7.j()     // Catch: java.lang.Exception -> L52
            r0.<init>(r1, r8)     // Catch: java.lang.Exception -> L52
            goto Ldc
        Ldb:
            r0 = 0
        Ldc:
            com.ss.android.downloadlib.r.b r8 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Exception -> L52
            r8.u(r6, r0)     // Catch: java.lang.Exception -> L52
            com.ss.android.downloadlib.c r8 = com.ss.android.downloadlib.c.d()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = ""
            r8.j(r6, r7, r0)     // Catch: java.lang.Exception -> L52
            return
        Led:
            r7 = -3
            if (r8 != r7) goto Lf4
            com.ss.android.downloadlib.d.m(r6, r1)     // Catch: java.lang.Exception -> L52
            return
        Lf4:
            r7 = 2001(0x7d1, float:2.804E-42)
            if (r8 != r7) goto L100
            com.ss.android.downloadlib.d r8 = com.ss.android.downloadlib.d.d()     // Catch: java.lang.Exception -> L52
            r8.n(r6, r1, r7)     // Catch: java.lang.Exception -> L52
            return
        L100:
            r7 = 11
            if (r8 != r7) goto L120
            com.ss.android.downloadlib.d r7 = com.ss.android.downloadlib.d.d()     // Catch: java.lang.Exception -> L52
            r8 = 2000(0x7d0, float:2.803E-42)
            r7.n(r6, r1, r8)     // Catch: java.lang.Exception -> L52
            boolean r7 = r1.G()     // Catch: java.lang.Exception -> L52
            if (r7 != 0) goto L120
            r5.b(r6, r1)     // Catch: java.lang.Exception -> L52
            return
        L117:
            u2.a r7 = com.ss.android.downloadlib.addownload.m.w()
            java.lang.String r8 = "onAppDownloadMonitorSend"
            r7.j(r6, r8)
        L120:
            return
    }
}
