package com.ss.android.socialbase.appdownloader.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.ss.android.socialbase.downloader.notification.j {
    private final android.content.Context a;
    private final android.content.res.Resources b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;

    public b(android.content.Context r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.d = r4
            r0.c = r5
            r0.e = r6
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            android.content.res.Resources r1 = r1.getResources()
            r0.b = r1
            return
    }

    private android.widget.RemoteViews a() {
            r5 = this;
            int r0 = com.ss.android.socialbase.appdownloader.i.h()
            android.widget.RemoteViews r1 = new android.widget.RemoteViews
            android.content.Context r2 = r5.a
            java.lang.String r2 = r2.getPackageName()
            r1.<init>(r2, r0)
            android.content.Context r0 = r5.a     // Catch: java.lang.Throwable -> L2e
            boolean r0 = com.ss.android.socialbase.appdownloader.b.x(r0)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L2e
            int r0 = com.ss.android.socialbase.appdownloader.i.k()     // Catch: java.lang.Throwable -> L2e
            int r2 = com.ss.android.socialbase.appdownloader.i.u()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "setBackgroundColor"
            android.content.Context r4 = r5.a     // Catch: java.lang.Throwable -> L2e
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L2e
            int r2 = r4.getColor(r2)     // Catch: java.lang.Throwable -> L2e
            r1.setInt(r0, r3, r2)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return r1
    }

    private int b(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)
            java.lang.String r0 = "enable_notification_ui"
            int r2 = r2.xt(r0)
            if (r2 <= 0) goto L11
            int r2 = com.ss.android.socialbase.appdownloader.i.q()
            return r2
        L11:
            int r2 = com.ss.android.socialbase.appdownloader.i.a()
            return r2
    }

    private int c(int r2, int r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
            java.lang.String r0 = "notification_opt_2"
            int r3 = r3.xt(r0)
            r0 = 1
            if (r3 != r0) goto L12
            int r2 = com.ss.android.socialbase.appdownloader.i.e()
            return r2
        L12:
            if (r2 == r0) goto L2a
            r3 = 4
            if (r2 != r3) goto L18
            goto L2a
        L18:
            r3 = 2
            if (r2 != r3) goto L20
            int r2 = com.ss.android.socialbase.appdownloader.i.p()
            return r2
        L20:
            r3 = 3
            if (r2 != r3) goto L28
            int r2 = com.ss.android.socialbase.appdownloader.i.e()
            return r2
        L28:
            r2 = 0
            return r2
        L2a:
            int r2 = com.ss.android.socialbase.appdownloader.i.j()
            return r2
    }

    private android.app.Notification d(w2.d r23, com.ss.android.socialbase.downloader.up.j r24, boolean r25) {
            r22 = this;
            r0 = r22
            int r2 = r0.up()
            int r3 = com.ss.android.socialbase.appdownloader.b.f(r2)
            if (r3 != 0) goto Le
            r1 = 0
            return r1
        Le:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "click_type"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4.put(r5, r6)
            int r5 = r0.j()
            java.lang.String r6 = "click_download_id"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.put(r6, r7)
            com.ss.android.socialbase.downloader.jy.j r6 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            long r7 = r0.xt()
            long r9 = r0.cw()
            r11 = 0
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 <= 0) goto L42
            r11 = 100
            long r11 = r11 * r7
            long r11 = r11 / r9
            int r12 = (int) r11
            goto L43
        L42:
            r12 = 0
        L43:
            java.lang.String r11 = r0.r()
            java.lang.String r14 = "notification_opt_2"
            int r15 = r6.xt(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r4.put(r14, r13)
            r13 = 1
            if (r15 == r13) goto L5e
            java.lang.String r14 = "action_click_btn"
            java.lang.String r13 = "android.ss.intent.action.DOWNLOAD_CLICK_BTN"
            r4.put(r14, r13)
        L5e:
            java.lang.String r13 = "enable_notification_ui"
            int r14 = r6.xt(r13)
            r16 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r4.put(r13, r12)
            java.lang.String r12 = "show_title"
            r4.put(r12, r11)
            java.lang.String r11 = "percent"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
            r4.put(r11, r12)
            java.lang.String r11 = "indeterminate"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r25)
            r4.put(r11, r12)
            java.lang.String r11 = "notification_type"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r4.put(r11, r12)
            com.ss.android.socialbase.appdownloader.f r11 = com.ss.android.socialbase.appdownloader.f.L()
            java.lang.String r11 = r11.K()
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r12 < r13) goto La7
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 == 0) goto La7
            android.content.Context r11 = r0.a
            java.lang.String r11 = com.ss.android.socialbase.appdownloader.b.N(r11)
        La7:
            java.lang.String r13 = "channel_id"
            r4.put(r13, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.String r13 = "download_status"
            r4.put(r13, r11)
            long r16 = r0.m()
            java.lang.Long r11 = java.lang.Long.valueOf(r16)
            r16 = r2
            java.lang.String r2 = "first_time"
            r4.put(r2, r11)
            r2 = 24
            if (r12 < r2) goto Ld9
            java.lang.String r2 = "set_notification_group"
            r11 = 0
            int r2 = r6.j(r2, r11)
            r11 = 1
            if (r2 != r11) goto Ld9
            java.lang.String r2 = "notification_group"
            java.lang.String r11 = "com.ss.android.socialbase.APP_DOWNLOADER"
            r4.put(r2, r11)
        Ld9:
            r2 = 31
            if (r12 < r2) goto Leb
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r11 = "enable_target_34"
            int r2 = r2.xt(r11)
            if (r2 <= 0) goto Leb
            r2 = 1
            goto Lec
        Leb:
            r2 = 0
        Lec:
            java.lang.String r11 = "csj_enable_target_34"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.put(r11, r2)
            if (r14 <= 0) goto L104
            com.ss.android.socialbase.appdownloader.up.a r2 = com.ss.android.socialbase.appdownloader.up.a.d()
            android.graphics.Bitmap r2 = r2.b(r5)
            java.lang.String r11 = "bitmap"
            r4.put(r11, r2)
        L104:
            java.lang.String r2 = "is_bind_app"
            java.lang.String r12 = "/"
            java.lang.String r11 = "download_size"
            r1 = 1
            if (r3 == r1) goto L110
            r1 = 4
            if (r3 != r1) goto L116
        L110:
            r18 = r3
            r14 = r9
            r10 = 0
            goto L2ef
        L116:
            r1 = 2
            if (r3 != r1) goto L184
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = com.ss.android.socialbase.appdownloader.b.o(r7)
            r1.append(r5)
            r1.append(r12)
            java.lang.String r5 = com.ss.android.socialbase.appdownloader.b.o(r9)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r4.put(r11, r1)
            r1 = 1
            if (r15 != r1) goto L14a
            java.lang.String r1 = "noti_progress_show_th"
            r5 = 70
            int r1 = r6.j(r1, r5)
            java.lang.String r5 = "progress_70"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r5, r1)
        L14a:
            java.lang.String r1 = r0.e
            boolean r1 = com.ss.android.socialbase.appdownloader.b.F(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r2, r1)
            java.lang.String r1 = r0.e
            boolean r1 = com.ss.android.socialbase.appdownloader.b.F(r1)
            if (r1 != 0) goto L180
            r1 = 2
            if (r14 < r1) goto L180
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.lang.String r5 = com.ss.android.socialbase.appdownloader.b.r(r7, r2)
            r1.append(r5)
            r1.append(r12)
            java.lang.String r5 = com.ss.android.socialbase.appdownloader.b.r(r9, r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r4.put(r11, r1)
        L180:
            r1 = r3
        L181:
            r10 = 0
            goto L329
        L184:
            r1 = 3
            if (r3 != r1) goto L2ec
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r5)
            int r2 = r0.up()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r4.put(r13, r15)
            java.lang.String r13 = "is_wait_wifi_and_in_net"
            java.lang.String r15 = "is_insufficient_space_error"
            r18 = r3
            java.lang.String r3 = "is_network_error"
            r19 = r9
            r9 = -1
            if (r2 == r9) goto L207
            r9 = -4
            if (r2 != r9) goto L1af
            goto L207
        L1af:
            r9 = -3
            if (r2 != r9) goto L203
            java.lang.String r9 = com.ss.android.socialbase.appdownloader.b.o(r19)
            r4.put(r11, r9)
            if (r1 == 0) goto L1d3
            java.lang.String r9 = r1.xw()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L1d3
            java.lang.String r9 = r1.xw()
            java.lang.String r10 = "application/vnd.android.package-archive"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L1d3
            r9 = 1
            goto L1d4
        L1d3:
            r9 = 0
        L1d4:
            java.lang.String r10 = "is_mime_apk"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r4.put(r10, r9)
            android.content.Context r9 = r0.a
            r10 = 0
            boolean r9 = com.ss.android.socialbase.appdownloader.b.D(r9, r1, r10)
            java.lang.String r10 = "is_apk_installed"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r4.put(r10, r9)
            com.ss.android.socialbase.downloader.downloader.r r9 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.r.wq r5 = r9.vl(r5)
            if (r5 == 0) goto L1f9
            r5 = 1
            goto L1fa
        L1f9:
            r5 = 0
        L1fa:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.String r9 = "is_have_notification_click_callback"
            r4.put(r9, r5)
        L203:
            r9 = r24
            goto L293
        L207:
            boolean r5 = com.ss.android.socialbase.downloader.az.m.g(r24)
            boolean r9 = com.ss.android.socialbase.downloader.az.m.tl(r24)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            r4.put(r3, r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r4.put(r15, r10)
            r10 = 2
            if (r14 < r10) goto L244
            r10 = -1
            if (r2 != r10) goto L244
            if (r5 != 0) goto L227
            if (r9 == 0) goto L244
        L227:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = com.ss.android.socialbase.appdownloader.b.o(r7)
            r9.append(r10)
            r9.append(r12)
            java.lang.String r10 = com.ss.android.socialbase.appdownloader.b.o(r19)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.put(r11, r9)
        L244:
            if (r24 == 0) goto L25b
            int r9 = r24.j()
            r10 = 1006(0x3ee, float:1.41E-42)
            if (r9 != r10) goto L25b
            java.lang.String r9 = "is_error_code_insufficient_space_error"
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r4.put(r9, r10)
            r9 = r24
        L257:
            r21 = r5
        L259:
            r10 = 2
            goto L281
        L25b:
            r9 = r24
            boolean r10 = r0.f(r9, r6, r1)
            if (r10 == 0) goto L257
            java.lang.String r10 = "is_need_show_wait_net_text"
            r21 = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.put(r10, r5)
            if (r1 == 0) goto L276
            boolean r5 = r1.x()
            if (r5 == 0) goto L276
            r5 = 1
            goto L277
        L276:
            r5 = 0
        L277:
            java.lang.String r10 = "is_wait_wifi"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.put(r10, r5)
            goto L259
        L281:
            if (r14 < r10) goto L293
            r10 = -1
            if (r2 != r10) goto L293
            if (r21 == 0) goto L293
            boolean r5 = com.ss.android.socialbase.downloader.az.m.xt(r9, r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.put(r13, r5)
        L293:
            boolean r5 = com.ss.android.socialbase.downloader.az.m.g(r9)
            boolean r10 = com.ss.android.socialbase.downloader.az.m.tl(r9)
            r21 = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r21)
            r4.put(r3, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            r4.put(r15, r3)
            r3 = 2
            if (r14 < r3) goto L2ea
            r3 = -1
            if (r2 != r3) goto L2ea
            if (r21 != 0) goto L2ba
            if (r10 == 0) goto L2b6
            goto L2ba
        L2b6:
            r1 = r18
            goto L181
        L2ba:
            boolean r1 = com.ss.android.socialbase.downloader.az.m.xt(r9, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r4.put(r13, r2)
            if (r1 == 0) goto L2ea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r10 = 0
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.b.r(r7, r10)
            r1.append(r2)
            r1.append(r12)
            r14 = r19
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.b.r(r14, r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.put(r11, r1)
        L2e7:
            r1 = r18
            goto L329
        L2ea:
            r10 = 0
            goto L2e7
        L2ec:
            r10 = 0
            r1 = r3
            goto L329
        L2ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.b.o(r7)
            r1.append(r3)
            r1.append(r12)
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.b.o(r14)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r4.put(r11, r1)
            r1 = r18
            r11 = 1
            if (r1 != r11) goto L31c
            int r3 = r0.up()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.put(r13, r3)
        L31c:
            java.lang.String r3 = r0.e
            boolean r3 = com.ss.android.socialbase.appdownloader.b.F(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.put(r2, r3)
        L329:
            java.lang.String r2 = "android.ss.intent.action.DOWNLOAD_CLICK_CONTENT"
            r11 = 1
            if (r1 == r11) goto L369
            r3 = 4
            if (r1 == r3) goto L369
            r3 = 2
            if (r1 != r3) goto L335
            goto L369
        L335:
            r3 = 3
            if (r1 != r3) goto L366
            r1 = r16
            r3 = -1
            if (r1 == r3) goto L35a
            r9 = -4
            if (r1 != r9) goto L341
            goto L35a
        L341:
            r9 = -3
            if (r1 != r9) goto L358
            java.lang.String r1 = "notification_click_install_auto_cancel"
            int r1 = r6.j(r1, r11)
            if (r1 != 0) goto L34e
            r13 = 1
            goto L34f
        L34e:
            r13 = 0
        L34f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.String r2 = "auto_cancel"
            r4.put(r2, r1)
        L358:
            java.lang.String r2 = "android.ss.intent.action.DOWNLOAD_OPEN"
        L35a:
            java.lang.String r1 = "action_complete"
            r4.put(r1, r2)
            java.lang.String r1 = "action_hide"
            java.lang.String r2 = "android.ss.intent.action.DOWNLOAD_HIDE"
            r4.put(r1, r2)
        L366:
            r1 = r23
            goto L36f
        L369:
            java.lang.String r1 = "action_apa"
            r4.put(r1, r2)
            goto L366
        L36f:
            java.util.Map r1 = r1.j(r4)
            java.lang.String r2 = "notification"
            java.lang.Object r1 = r1.get(r2)
            android.app.Notification r1 = (android.app.Notification) r1
            r0.j = r1
            return r1
    }

    private android.app.PendingIntent e(java.lang.String r3, int r4, int r5) {
            r2 = this;
            android.content.Context r0 = r2.a
            android.util.Pair r0 = com.ss.android.socialbase.appdownloader.f.T(r0, r5)
            java.lang.Object r1 = r0.first
            android.content.Intent r1 = (android.content.Intent) r1
            r1.setAction(r3)
            java.lang.String r3 = "extra_click_download_ids"
            r1.putExtra(r3, r5)
            java.lang.String r3 = "extra_click_download_type"
            r1.putExtra(r3, r4)
            java.lang.String r3 = "extra_from_notification"
            r4 = 1
            r1.putExtra(r3, r4)
            android.content.Context r3 = r2.a
            android.app.PendingIntent r3 = com.ss.android.socialbase.appdownloader.f.i(r3, r0, r5)
            return r3
    }

    private boolean f(com.ss.android.socialbase.downloader.up.j r4, com.ss.android.socialbase.downloader.jy.j r5, com.ss.android.socialbase.downloader.ae.cw r6) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2b
            int r1 = r4.j()
            r2 = 1013(0x3f5, float:1.42E-42)
            if (r1 == r2) goto L13
            int r4 = r4.j()
            r1 = 1049(0x419, float:1.47E-42)
            if (r4 != r1) goto L2b
        L13:
            if (r6 == 0) goto L2b
            java.lang.String r4 = "application/vnd.android.package-archive"
            java.lang.String r6 = r6.xw()
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L2b
            java.lang.String r4 = "notification_text_opt"
            int r4 = r5.j(r4, r0)
            r5 = 1
            if (r4 != r5) goto L2b
            return r5
        L2b:
            return r0
    }

    private androidx.core.app.NotificationCompat.Builder g() {
            r3 = this;
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            java.lang.String r0 = r0.K()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L16
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r1 = r3.a
            r0.<init>(r1)
            return r0
        L16:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L22
            android.content.Context r0 = r3.a
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.b.N(r0)
        L22:
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()     // Catch: java.lang.NoSuchMethodError -> L43
            w2.o r1 = r1.S()     // Catch: java.lang.NoSuchMethodError -> L43
            if (r1 == 0) goto L3b
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()     // Catch: java.lang.NoSuchMethodError -> L43
            w2.o r1 = r1.S()     // Catch: java.lang.NoSuchMethodError -> L43
            android.content.Context r2 = r3.a     // Catch: java.lang.NoSuchMethodError -> L43
            androidx.core.app.NotificationCompat$Builder r0 = r1.j(r2, r0)     // Catch: java.lang.NoSuchMethodError -> L43
            return r0
        L3b:
            androidx.core.app.NotificationCompat$Builder r1 = new androidx.core.app.NotificationCompat$Builder     // Catch: java.lang.NoSuchMethodError -> L43
            android.content.Context r2 = r3.a     // Catch: java.lang.NoSuchMethodError -> L43
            r1.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodError -> L43
            return r1
        L43:
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r1 = r3.a
            r0.<init>(r1)
            return r0
    }

    private android.app.Notification h(com.ss.android.socialbase.downloader.up.j r23, boolean r24) {
            r22 = this;
            r0 = r22
            int r2 = r0.up()
            int r3 = com.ss.android.socialbase.appdownloader.b.f(r2)
            if (r3 != 0) goto Le
            r1 = 0
            return r1
        Le:
            androidx.core.app.NotificationCompat$Builder r4 = r0.g()
            long r5 = r0.m()
            r4.setWhen(r5)
            int r5 = r0.j()
            com.ss.android.socialbase.downloader.jy.j r6 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            r9 = 1
            r10 = 0
            if (r7 < r8) goto L39
            java.lang.String r7 = "set_notification_group"
            int r7 = r6.j(r7, r10)
            if (r7 != r9) goto L39
            java.lang.String r7 = "com.ss.android.socialbase.APP_DOWNLOADER"
            r4.setGroup(r7)
            r4.setGroupSummary(r10)
        L39:
            int r7 = com.ss.android.socialbase.appdownloader.i.s()
            if (r7 == 0) goto L44
            r4.setSmallIcon(r7)
            r7 = 0
            goto L45
        L44:
            r7 = 1
        L45:
            androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r8 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
            r8.<init>()
            r4.setStyle(r8)
            int r8 = r0.c(r3, r5)
            if (r7 == 0) goto L58
            if (r8 == 0) goto L58
            r4.setSmallIcon(r8)
        L58:
            java.lang.String r7 = "android.ss.intent.action.DOWNLOAD_CLICK_CONTENT"
            r11 = -3
            r12 = -4
            r13 = 3
            r14 = 4
            r15 = -1
            r10 = 2
            if (r3 == r9) goto L92
            if (r3 == r14) goto L92
            if (r3 != r10) goto L67
            goto L92
        L67:
            if (r3 != r13) goto L9d
            r4.setAutoCancel(r9)
            if (r2 == r15) goto L81
            if (r2 != r12) goto L71
            goto L81
        L71:
            if (r2 != r11) goto L7f
            java.lang.String r2 = "notification_click_install_auto_cancel"
            int r2 = r6.j(r2, r9)
            if (r2 != 0) goto L7f
            r2 = 0
            r4.setAutoCancel(r2)
        L7f:
            java.lang.String r7 = "android.ss.intent.action.DOWNLOAD_OPEN"
        L81:
            android.app.PendingIntent r2 = r0.e(r7, r3, r5)
            r4.setContentIntent(r2)
            java.lang.String r2 = "android.ss.intent.action.DOWNLOAD_HIDE"
            android.app.PendingIntent r2 = r0.e(r2, r3, r5)
            r4.setDeleteIntent(r2)
            goto L9d
        L92:
            android.app.PendingIntent r2 = r0.e(r7, r3, r5)
            r4.setContentIntent(r2)
            r2 = 0
            r4.setAutoCancel(r2)
        L9d:
            long r11 = r0.xt()
            r16 = r11
            long r10 = r0.cw()
            r18 = 0
            int r12 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r12 <= 0) goto Lb5
            r18 = 100
            long r18 = r18 * r16
            long r13 = r18 / r10
            int r14 = (int) r13
            goto Lb6
        Lb5:
            r14 = 0
        Lb6:
            java.lang.String r13 = r0.r()
            boolean r18 = android.text.TextUtils.isEmpty(r13)
            if (r18 == 0) goto Lcc
            java.lang.String r13 = "tt_appdownloader_download_unknown_title"
            int r13 = com.ss.android.socialbase.appdownloader.c.h(r13)
            android.content.res.Resources r2 = r0.b
            java.lang.String r13 = r2.getString(r13)
        Lcc:
            android.widget.RemoteViews r2 = r0.a()
            int r7 = com.ss.android.socialbase.appdownloader.i.n()
            com.ss.android.socialbase.downloader.jy.j r12 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r15 = "notification_opt_2"
            int r12 = r12.xt(r15)
            if (r12 == r9) goto Le9
            java.lang.String r12 = "android.ss.intent.action.DOWNLOAD_CLICK_BTN"
            android.app.PendingIntent r12 = r0.e(r12, r3, r5)
            r2.setOnClickPendingIntent(r7, r12)
        Le9:
            com.ss.android.socialbase.downloader.jy.j r12 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r9 = "enable_notification_ui"
            int r12 = r12.xt(r9)
            r21 = r12
            java.lang.String r12 = "setBackgroundResource"
            if (r21 <= 0) goto L104
            int r1 = com.ss.android.socialbase.appdownloader.i.l()
            r2.setInt(r7, r12, r1)
            r1 = -1
            r2.setTextColor(r7, r1)
        L104:
            int r1 = com.ss.android.socialbase.appdownloader.i.i()
            r2.setTextViewText(r1, r13)
            int r1 = r0.b(r5)
            r7 = 0
            r2.setViewVisibility(r1, r7)
            r7 = 100
            r13 = r24
            r2.setProgressBar(r1, r7, r14, r13)
            int r1 = com.ss.android.socialbase.appdownloader.i.t()
            if (r8 == 0) goto L123
            r2.setImageViewResource(r1, r8)
        L123:
            com.ss.android.socialbase.downloader.jy.j r7 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            int r7 = r7.xt(r9)
            if (r7 <= 0) goto L148
            com.ss.android.socialbase.appdownloader.up.a r7 = com.ss.android.socialbase.appdownloader.up.a.d()
            android.graphics.Bitmap r7 = r7.b(r5)
            if (r7 == 0) goto L141
            java.lang.String r8 = "setBackgroundColor"
            r12 = 0
            r2.setInt(r1, r8, r12)
            r2.setImageViewBitmap(r1, r7)
            goto L148
        L141:
            int r7 = com.ss.android.socialbase.appdownloader.i.l()
            r2.setInt(r1, r12, r7)
        L148:
            java.lang.String r1 = "/"
            r7 = 8
            r8 = 1
            if (r3 == r8) goto L152
            r8 = 4
            if (r3 != r8) goto L158
        L152:
            r18 = r4
            r12 = r16
            goto L4d0
        L158:
            java.lang.String r8 = "tt_appdownloader_notification_download_resume"
            r12 = 2
            if (r3 != r12) goto L23d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = com.ss.android.socialbase.appdownloader.b.o(r16)
            r3.append(r12)
            r3.append(r1)
            java.lang.String r12 = com.ss.android.socialbase.appdownloader.b.o(r10)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r12 = "tt_appdownloader_notification_pausing"
            int r12 = com.ss.android.socialbase.appdownloader.c.h(r12)
            android.content.Context r13 = r0.a
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r12 = r13.getString(r12)
            int r8 = com.ss.android.socialbase.appdownloader.c.h(r8)
            android.content.Context r13 = r0.a
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r8 = r13.getString(r8)
            int r13 = r6.xt(r15)
            r15 = 1
            if (r13 != r15) goto L1e0
            java.lang.String r13 = "noti_progress_show_th"
            r15 = 70
            int r13 = r6.j(r13, r15)
            if (r14 < r13) goto L1b6
            int r5 = r0.b(r5)
            r13 = 0
            r2.setViewVisibility(r5, r13)
            int r5 = com.ss.android.socialbase.appdownloader.i.m()
            r2.setViewVisibility(r5, r13)
            goto L1fa
        L1b6:
            r13 = 0
            int r5 = r0.b(r5)
            r2.setViewVisibility(r5, r7)
            int r5 = com.ss.android.socialbase.appdownloader.i.m()
            r2.setViewVisibility(r5, r7)
            int r5 = com.ss.android.socialbase.appdownloader.i.f()
            r2.setViewVisibility(r5, r13)
            int r5 = com.ss.android.socialbase.appdownloader.i.c()
            r2.setViewVisibility(r5, r7)
            java.lang.String r5 = "tt_appdownloader_notification_download_continue"
            int r5 = com.ss.android.socialbase.appdownloader.c.h(r5)
            android.content.res.Resources r12 = r0.b
            java.lang.String r12 = r12.getString(r5)
            goto L201
        L1e0:
            r13 = 0
            int r14 = com.ss.android.socialbase.appdownloader.i.m()
            r2.setViewVisibility(r14, r13)
            int r5 = r0.b(r5)
            int r14 = r6.xt(r9)
            r15 = 2
            if (r14 < r15) goto L1f7
            r2.setViewVisibility(r5, r13)
            goto L1fa
        L1f7:
            r2.setViewVisibility(r5, r7)
        L1fa:
            int r5 = com.ss.android.socialbase.appdownloader.i.f()
            r2.setViewVisibility(r5, r7)
        L201:
            int r5 = com.ss.android.socialbase.appdownloader.i.n()
            java.lang.String r14 = r0.e
            boolean r14 = com.ss.android.socialbase.appdownloader.b.F(r14)
            if (r14 != 0) goto L237
            r2.setViewVisibility(r5, r13)
            int r5 = r6.xt(r9)
            r15 = 2
            if (r5 < r15) goto L233
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r5 = r16
            java.lang.String r5 = com.ss.android.socialbase.appdownloader.b.r(r5, r13)
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.b.r(r10, r13)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
        L233:
            r18 = r4
            goto L559
        L237:
            r18 = r4
        L239:
            r15 = 8
            goto L4bf
        L23d:
            r12 = r16
            java.lang.String r14 = ""
            r7 = 3
            if (r3 != r7) goto L4c6
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)
            com.ss.android.socialbase.downloader.ae.cw r3 = r3.tl(r5)
            int r7 = r0.up()
            r16 = r8
            r8 = -1
            if (r7 == r8) goto L260
            int r7 = r0.up()
            r8 = -4
            if (r7 != r8) goto L264
        L260:
            r17 = r14
            goto L314
        L264:
            int r7 = r0.up()
            r8 = -3
            if (r7 != r8) goto L308
            java.lang.String r7 = com.ss.android.socialbase.appdownloader.b.o(r10)
            if (r3 == 0) goto L2ae
            java.lang.String r8 = r3.xw()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L2ae
            java.lang.String r8 = r3.xw()
            r16 = r7
            java.lang.String r7 = "application/vnd.android.package-archive"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L2b0
            android.content.Context r7 = r0.a
            r8 = 0
            boolean r7 = com.ss.android.socialbase.appdownloader.b.D(r7, r3, r8)
            if (r7 == 0) goto L2a1
            java.lang.String r7 = "tt_appdownloader_notification_install_finished_open"
            int r7 = com.ss.android.socialbase.appdownloader.c.h(r7)
            java.lang.String r8 = "tt_appdownloader_notification_download_open"
            int r8 = com.ss.android.socialbase.appdownloader.c.h(r8)
        L29e:
            r17 = r14
            goto L2c9
        L2a1:
            java.lang.String r7 = "tt_appdownloader_notification_download_complete_with_install"
            int r7 = com.ss.android.socialbase.appdownloader.c.h(r7)
            java.lang.String r8 = "tt_appdownloader_notification_download_install"
            int r8 = com.ss.android.socialbase.appdownloader.c.h(r8)
            goto L29e
        L2ae:
            r16 = r7
        L2b0:
            java.lang.String r7 = "tt_appdownloader_notification_download_complete_without_install"
            int r7 = com.ss.android.socialbase.appdownloader.c.h(r7)
            com.ss.android.socialbase.downloader.downloader.r r8 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.r.wq r8 = r8.vl(r5)
            if (r8 == 0) goto L2c6
            java.lang.String r7 = "tt_appdownloader_notification_download_complete_open"
            int r7 = com.ss.android.socialbase.appdownloader.c.h(r7)
        L2c6:
            r17 = r14
            r8 = 0
        L2c9:
            android.content.res.Resources r14 = r0.b
            java.lang.String r7 = r14.getString(r7)
            r4.setContentText(r7)
            if (r8 == 0) goto L2db
            android.content.res.Resources r14 = r0.b
            java.lang.String r14 = r14.getString(r8)
            goto L2dd
        L2db:
            r14 = r17
        L2dd:
            int r8 = r6.xt(r15)
            r15 = 1
            if (r8 != r15) goto L2f5
            int r8 = com.ss.android.socialbase.appdownloader.i.n()
            r2.setTextViewText(r8, r14)
            int r8 = com.ss.android.socialbase.appdownloader.i.c()
            r15 = 8
            r2.setViewVisibility(r8, r15)
            goto L2fe
        L2f5:
            r15 = 8
            int r8 = com.ss.android.socialbase.appdownloader.i.n()
            r2.setViewVisibility(r8, r15)
        L2fe:
            r18 = r4
            r4 = r7
            r8 = r14
            r14 = r16
            r7 = r23
            goto L441
        L308:
            r17 = r14
            r7 = r23
            r18 = r4
            r4 = r17
            r8 = r4
            r14 = r8
            goto L441
        L314:
            int r7 = r6.xt(r9)
            r15 = 2
            if (r7 < r15) goto L349
            int r7 = r0.up()
            r8 = -1
            if (r7 != r8) goto L349
            boolean r7 = com.ss.android.socialbase.downloader.az.m.g(r23)
            if (r7 != 0) goto L32e
            boolean r7 = com.ss.android.socialbase.downloader.az.m.tl(r23)
            if (r7 == 0) goto L349
        L32e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = com.ss.android.socialbase.appdownloader.b.o(r12)
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = com.ss.android.socialbase.appdownloader.b.o(r10)
            r7.append(r8)
            java.lang.String r14 = r7.toString()
            goto L34b
        L349:
            r14 = r17
        L34b:
            int r7 = com.ss.android.socialbase.appdownloader.i.c()
            r15 = 8
            r2.setViewVisibility(r7, r15)
            if (r23 == 0) goto L372
            int r7 = r23.j()
            r8 = 1006(0x3ee, float:1.41E-42)
            if (r7 != r8) goto L372
            java.lang.String r7 = "tt_appdownloader_notification_download_space_failed"
            int r7 = com.ss.android.socialbase.appdownloader.c.h(r7)
            android.content.Context r8 = r0.a
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r7 = r8.getString(r7)
            r8 = r7
            r7 = r23
            goto L3aa
        L372:
            r7 = r23
            boolean r8 = r0.f(r7, r6, r3)
            if (r8 == 0) goto L39a
            if (r3 == 0) goto L389
            boolean r8 = r3.x()
            if (r8 == 0) goto L389
            java.lang.String r8 = "tt_appdownloader_notification_download_waiting_wifi"
            int r8 = com.ss.android.socialbase.appdownloader.c.h(r8)
            goto L38f
        L389:
            java.lang.String r8 = "tt_appdownloader_notification_download_waiting_net"
            int r8 = com.ss.android.socialbase.appdownloader.c.h(r8)
        L38f:
            android.content.Context r15 = r0.a
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r8 = r15.getString(r8)
            goto L3aa
        L39a:
            java.lang.String r8 = "tt_appdownloader_notification_download_failed"
            int r8 = com.ss.android.socialbase.appdownloader.c.h(r8)
            android.content.Context r15 = r0.a
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r8 = r15.getString(r8)
        L3aa:
            java.lang.String r15 = "tt_appdownloader_notification_download_restart"
            int r15 = com.ss.android.socialbase.appdownloader.c.h(r15)
            r18 = r4
            android.content.Context r4 = r0.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getString(r15)
            int r15 = com.ss.android.socialbase.appdownloader.i.n()
            r17 = r4
            r4 = 8
            r2.setViewVisibility(r15, r4)
            int r4 = r6.xt(r9)
            r15 = 2
            if (r4 < r15) goto L43a
            int r4 = r0.up()
            r15 = -1
            if (r4 != r15) goto L43a
            boolean r4 = com.ss.android.socialbase.downloader.az.m.g(r7)
            if (r4 == 0) goto L413
            boolean r4 = com.ss.android.socialbase.downloader.az.m.xt(r7, r3)
            if (r4 == 0) goto L400
            java.lang.String r4 = "tt_appdownloader_notification_no_wifi_and_in_net"
            int r4 = com.ss.android.socialbase.appdownloader.c.h(r4)
            android.content.Context r8 = r0.a
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r4 = r8.getString(r4)
            int r8 = com.ss.android.socialbase.appdownloader.c.h(r16)
            android.content.Context r15 = r0.a
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r8 = r15.getString(r8)
            goto L441
        L400:
            java.lang.String r4 = "tt_appdownloader_notification_no_internet_error"
            int r4 = com.ss.android.socialbase.appdownloader.c.h(r4)
            android.content.Context r8 = r0.a
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r4 = r8.getString(r4)
        L410:
            r8 = r17
            goto L441
        L413:
            boolean r4 = com.ss.android.socialbase.downloader.az.m.tl(r7)
            if (r4 == 0) goto L43a
            java.lang.String r4 = "tt_appdownloader_notification_insufficient_space_error"
            int r4 = com.ss.android.socialbase.appdownloader.c.h(r4)
            android.content.Context r8 = r0.a
            android.content.res.Resources r8 = r8.getResources()
            long r19 = r10 - r12
            java.lang.String r15 = com.ss.android.socialbase.appdownloader.b.M(r19)
            r16 = r14
            r14 = 1
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r19 = r15
            r15 = 0
            r14[r15] = r19
            java.lang.String r8 = r8.getString(r4, r14)
            goto L43d
        L43a:
            r16 = r14
            r15 = 0
        L43d:
            r4 = r8
            r14 = r16
            goto L410
        L441:
            int r15 = r0.b(r5)
            r16 = r4
            r4 = 8
            r2.setViewVisibility(r15, r4)
            int r15 = com.ss.android.socialbase.appdownloader.i.f()
            r4 = 0
            r2.setViewVisibility(r15, r4)
            int r4 = com.ss.android.socialbase.appdownloader.i.m()
            r15 = 8
            r2.setViewVisibility(r4, r15)
            int r4 = r6.xt(r9)
            r15 = 2
            if (r4 < r15) goto L4c4
            int r4 = r0.up()
            r15 = -1
            if (r4 != r15) goto L4c4
            boolean r4 = com.ss.android.socialbase.downloader.az.m.g(r7)
            if (r4 != 0) goto L477
            boolean r4 = com.ss.android.socialbase.downloader.az.m.tl(r7)
            if (r4 == 0) goto L4c4
        L477:
            int r4 = r0.b(r5)
            r15 = 0
            r2.setViewVisibility(r4, r15)
            int r4 = com.ss.android.socialbase.appdownloader.i.f()
            r5 = 8
            r2.setViewVisibility(r4, r5)
            int r4 = com.ss.android.socialbase.appdownloader.i.m()
            r2.setViewVisibility(r4, r15)
            int r5 = com.ss.android.socialbase.appdownloader.i.n()
            boolean r3 = com.ss.android.socialbase.downloader.az.m.xt(r7, r3)
            if (r3 == 0) goto L4ba
            r2.setViewVisibility(r5, r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.ss.android.socialbase.appdownloader.b.r(r12, r15)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.b.r(r10, r15)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
        L4b6:
            r12 = r16
            goto L559
        L4ba:
            r3 = r14
            r12 = r16
            goto L239
        L4bf:
            r2.setViewVisibility(r5, r15)
            goto L559
        L4c4:
            r3 = r14
            goto L4b6
        L4c6:
            r18 = r4
            r17 = r14
            r3 = r17
            r8 = r3
            r12 = r8
            goto L559
        L4d0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = com.ss.android.socialbase.appdownloader.b.o(r12)
            r4.append(r7)
            r4.append(r1)
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.b.o(r10)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r15 = 1
            if (r3 != r15) goto L503
            int r3 = r0.up()
            r4 = 11
            if (r3 != r4) goto L4fc
            java.lang.String r3 = "tt_appdownloader_notification_waiting_download_complete_handler"
            int r3 = com.ss.android.socialbase.appdownloader.c.h(r3)
            goto L509
        L4fc:
            java.lang.String r3 = "tt_appdownloader_notification_downloading"
            int r3 = com.ss.android.socialbase.appdownloader.c.h(r3)
            goto L509
        L503:
            java.lang.String r3 = "tt_appdownloader_notification_prepare"
            int r3 = com.ss.android.socialbase.appdownloader.c.h(r3)
        L509:
            android.content.Context r4 = r0.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r12 = r4.getString(r3)
            java.lang.String r3 = "tt_appdownloader_notification_download_pause"
            int r3 = com.ss.android.socialbase.appdownloader.c.h(r3)
            android.content.Context r4 = r0.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r8 = r4.getString(r3)
            int r3 = r0.b(r5)
            r15 = 0
            r2.setViewVisibility(r3, r15)
            int r3 = com.ss.android.socialbase.appdownloader.i.f()
            r4 = 8
            r2.setViewVisibility(r3, r4)
            int r3 = com.ss.android.socialbase.appdownloader.i.m()
            r2.setViewVisibility(r3, r15)
            int r3 = com.ss.android.socialbase.appdownloader.i.n()
            java.lang.String r5 = r0.e
            boolean r5 = com.ss.android.socialbase.appdownloader.b.F(r5)
            if (r5 == 0) goto L54b
            r2.setViewVisibility(r3, r4)
            goto L54e
        L54b:
            r2.setViewVisibility(r3, r15)
        L54e:
            int r5 = r6.xt(r9)
            r15 = 2
            if (r5 < r15) goto L558
            r2.setViewVisibility(r3, r4)
        L558:
            r3 = r1
        L559:
            int r1 = com.ss.android.socialbase.appdownloader.i.v()
            r2.setTextViewText(r1, r3)
            int r1 = com.ss.android.socialbase.appdownloader.i.b()
            r2.setTextViewText(r1, r12)
            int r1 = com.ss.android.socialbase.appdownloader.i.c()
            r2.setTextViewText(r1, r3)
            int r1 = com.ss.android.socialbase.appdownloader.i.g()
            r2.setTextViewText(r1, r12)
            int r1 = com.ss.android.socialbase.appdownloader.i.n()
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 == 0) goto L585
            r15 = 8
            r2.setViewVisibility(r1, r15)
            goto L588
        L585:
            r2.setTextViewText(r1, r8)
        L588:
            android.app.Notification r1 = r18.build()
            r1.contentView = r2
            return r1
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            super.j(r2)
            java.lang.String r0 = r2.qv()
            r1.d = r0
            java.lang.String r0 = r2.tl()
            r1.c = r0
            java.lang.String r2 = r2.h()
            r1.e = r2
            return
    }

    public void j(com.ss.android.socialbase.downloader.up.j r2, boolean r3) {
            r1 = this;
            android.content.Context r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()     // Catch: java.lang.Exception -> L16
            w2.d r0 = r0.p()     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L18
            android.app.Notification r2 = r1.d(r0, r2, r3)     // Catch: java.lang.Exception -> L16
            r1.j = r2     // Catch: java.lang.Exception -> L16
            goto L1e
        L16:
            r2 = move-exception
            goto L24
        L18:
            android.app.Notification r2 = r1.h(r2, r3)     // Catch: java.lang.Exception -> L16
            r1.j = r2     // Catch: java.lang.Exception -> L16
        L1e:
            android.app.Notification r2 = r1.j     // Catch: java.lang.Exception -> L16
            r1.j(r2)     // Catch: java.lang.Exception -> L16
            return
        L24:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }
}
