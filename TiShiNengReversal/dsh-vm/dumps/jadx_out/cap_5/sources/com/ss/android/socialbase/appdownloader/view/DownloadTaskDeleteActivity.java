package com.ss.android.socialbase.appdownloader.view;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DownloadTaskDeleteActivity extends android.app.Activity {
    private w2.n a;
    private android.content.Intent b;

    class a implements android.content.DialogInterface.OnCancelListener {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity a;

        a(com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface r1) {
                r0 = this;
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw b;
        final /* synthetic */ int c;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity d;

        b(com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r1, boolean r2, com.ss.android.socialbase.downloader.ae.cw r3, int r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                boolean r2 = r1.a
                if (r2 == 0) goto Ld
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r2 = r1.d
                com.ss.android.socialbase.downloader.ae.cw r3 = r1.b
                int r0 = r1.c
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.b(r2, r3, r0)
            Ld:
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r2 = r1.d
                r2.finish()
                return
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw b;
        final /* synthetic */ int c;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity d;

        class a implements java.lang.Runnable {
            final /* synthetic */ com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.c a;

            a(com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$c r0 = r2.a
                    com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r0 = r0.d
                    com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                    com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$c r1 = r2.a
                    com.ss.android.socialbase.downloader.ae.cw r1 = r1.b
                    int r1 = r1.ae()
                    r0.cw(r1)
                    return
            }
        }

        c(com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r1, boolean r2, com.ss.android.socialbase.downloader.ae.cw r3, int r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                boolean r3 = r2.a
                if (r3 == 0) goto L2d
                com.ss.android.socialbase.downloader.ae.cw r3 = r2.b
                r4 = 1
                r3.r(r4)
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r3 = r2.d
                com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)
                com.ss.android.socialbase.downloader.ae.cw r4 = r2.b
                int r4 = r4.ae()
                r3.j(r4)
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r4 = android.os.Looper.getMainLooper()
                r3.<init>(r4)
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$c$a r4 = new com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$c$a
                r4.<init>(r2)
                r0 = 100
                r3.postDelayed(r4, r0)
                goto L36
            L2d:
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r3 = r2.d
                com.ss.android.socialbase.downloader.ae.cw r4 = r2.b
                int r0 = r2.c
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.b(r3, r4, r0)
            L36:
                com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r3 = r2.d
                r3.finish()
                return
        }
    }

    static {
            r0 = 41641(0xa2a9, float:5.8351E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public DownloadTaskDeleteActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r2 = 0
            r1.alpha = r2
            r0.setAttributes(r1)
            return
    }

    static /* synthetic */ void b(com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity r0, com.ss.android.socialbase.downloader.ae.cw r1, int r2) {
            r0.c(r1, r2)
            return
    }

    private void c(com.ss.android.socialbase.downloader.ae.cw r4, int r5) {
            r3 = this;
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            w2.m r0 = r0.d()
            if (r0 == 0) goto Ld
            r0.j(r4)
        Ld:
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.socialbase.downloader.r.h r0 = r0.g(r5)
            if (r0 == 0) goto L22
            r1 = 10
            java.lang.String r2 = ""
            r0.j(r1, r4, r2, r2)
        L22:
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r4 == 0) goto L33
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            r4.xt(r5)
        L33:
            return
    }

    private void d() {
            r14 = this;
            w2.n r0 = r14.a
            if (r0 != 0) goto Le1
            android.content.Intent r0 = r14.b
            if (r0 != 0) goto La
            goto Le1
        La:
            java.lang.String r1 = "extra_click_download_ids"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)     // Catch: java.lang.Exception -> L37
            android.content.Context r1 = r14.getApplicationContext()     // Catch: java.lang.Exception -> L37
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L37
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)     // Catch: java.lang.Exception -> L37
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r0)     // Catch: java.lang.Exception -> L37
            if (r1 != 0) goto L25
            goto Le1
        L25:
            java.lang.String r3 = r1.g()     // Catch: java.lang.Exception -> L37
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L3a
            java.lang.String r0 = "DeleteActivity"
            java.lang.String r1 = "Missing appName; skipping handle"
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)     // Catch: java.lang.Exception -> L37
            return
        L37:
            r0 = move-exception
            goto Lde
        L3a:
            java.lang.String r4 = "tt_appdownloader_notification_download_delete"
            int r4 = com.ss.android.socialbase.appdownloader.c.b(r14, r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r14.getString(r4)     // Catch: java.lang.Exception -> L37
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L37
            r6[r2] = r3     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch: java.lang.Exception -> L37
            com.ss.android.socialbase.appdownloader.f r4 = com.ss.android.socialbase.appdownloader.f.L()     // Catch: java.lang.Exception -> L37
            w2.k r4 = r4.X()     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L5c
            w2.g r4 = r4.j(r14)     // Catch: java.lang.Exception -> L37
            goto L5d
        L5c:
            r4 = 0
        L5d:
            if (r4 != 0) goto L64
            com.ss.android.socialbase.appdownloader.f$g r4 = new com.ss.android.socialbase.appdownloader.f$g     // Catch: java.lang.Exception -> L37
            r4.<init>(r14)     // Catch: java.lang.Exception -> L37
        L64:
            java.lang.String r6 = "tt_appdownloader_tip"
            int r6 = com.ss.android.socialbase.appdownloader.c.b(r14, r6)     // Catch: java.lang.Exception -> L37
            java.lang.String r7 = "tt_appdownloader_label_ok"
            int r7 = com.ss.android.socialbase.appdownloader.c.b(r14, r7)     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = "tt_appdownloader_label_cancel"
            int r8 = com.ss.android.socialbase.appdownloader.c.b(r14, r8)     // Catch: java.lang.Exception -> L37
            int r9 = r1.ae()     // Catch: java.lang.Exception -> L37
            com.ss.android.socialbase.downloader.jy.j r9 = com.ss.android.socialbase.downloader.jy.j.j(r9)     // Catch: java.lang.Exception -> L37
            java.lang.String r10 = "cancel_with_net_opt"
            int r9 = r9.j(r10, r2)     // Catch: java.lang.Exception -> L37
            if (r9 != r5) goto L99
            boolean r9 = com.ss.android.socialbase.downloader.az.m.tl()     // Catch: java.lang.Exception -> L37
            if (r9 == 0) goto L99
            long r9 = r1.uq()     // Catch: java.lang.Exception -> L37
            long r11 = r1.ka()     // Catch: java.lang.Exception -> L37
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L99
            r2 = 1
        L99:
            if (r2 == 0) goto Lb5
            java.lang.String r3 = "tt_appdownloader_label_reserve_wifi"
            int r7 = com.ss.android.socialbase.appdownloader.c.b(r14, r3)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = "tt_appdownloader_label_cancel_directly"
            int r8 = com.ss.android.socialbase.appdownloader.c.b(r14, r3)     // Catch: java.lang.Exception -> L37
            android.content.res.Resources r3 = r14.getResources()     // Catch: java.lang.Exception -> L37
            java.lang.String r5 = "tt_appdownloader_resume_in_wifi"
            int r5 = com.ss.android.socialbase.appdownloader.c.b(r14, r5)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Exception -> L37
        Lb5:
            w2.g r5 = r4.j(r6)     // Catch: java.lang.Exception -> L37
            w2.g r3 = r5.j(r3)     // Catch: java.lang.Exception -> L37
            com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$c r5 = new com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$c     // Catch: java.lang.Exception -> L37
            r5.<init>(r14, r2, r1, r0)     // Catch: java.lang.Exception -> L37
            w2.g r3 = r3.b(r7, r5)     // Catch: java.lang.Exception -> L37
            com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$b r5 = new com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$b     // Catch: java.lang.Exception -> L37
            r5.<init>(r14, r2, r1, r0)     // Catch: java.lang.Exception -> L37
            w2.g r0 = r3.a(r8, r5)     // Catch: java.lang.Exception -> L37
            com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$a r1 = new com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity$a     // Catch: java.lang.Exception -> L37
            r1.<init>(r14)     // Catch: java.lang.Exception -> L37
            r0.c(r1)     // Catch: java.lang.Exception -> L37
            w2.n r0 = r4.j()     // Catch: java.lang.Exception -> L37
            r14.a = r0     // Catch: java.lang.Exception -> L37
            return
        Lde:
            com.bytedance.sdk.component.utils.vl.j(r0)
        Le1:
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.setIntent(r1)
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            android.content.Intent r0 = r1.getIntent()
            r1.b = r0
            r1.d()
            w2.n r0 = r1.a
            if (r0 == 0) goto L1c
            boolean r0 = r0.xt()
            if (r0 != 0) goto L1c
            w2.n r0 = r1.a
            r0.j()
            return
        L1c:
            w2.n r0 = r1.a
            if (r0 != 0) goto L23
            r1.finish()
        L23:
            return
    }
}
