package com.ss.android.socialbase.appdownloader.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static final java.lang.String a = "c";
    private static java.util.List<w2.c> b;
    private static com.ss.android.socialbase.appdownloader.view.b c;
    private static android.app.AlertDialog d;

    static class a implements android.content.DialogInterface.OnKeyListener {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(android.content.DialogInterface r2, int r3, android.view.KeyEvent r4) {
                r1 = this;
                r2 = 4
                r0 = 0
                if (r3 != r2) goto Lf
                int r2 = r4.getAction()
                r3 = 1
                if (r2 != r3) goto Le
                com.ss.android.socialbase.appdownloader.up.c.d(r0)
            Le:
                return r3
            Lf:
                return r0
        }
    }

    static class b implements android.content.DialogInterface.OnClickListener {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 0
                com.ss.android.socialbase.appdownloader.up.c.d(r1)
                return
        }
    }

    /* renamed from: com.ss.android.socialbase.appdownloader.up.c$c, reason: collision with other inner class name */
    static class DialogInterfaceOnClickListenerC0231c implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ android.app.Activity a;
        final /* synthetic */ w2.c b;

        DialogInterfaceOnClickListenerC0231c(android.app.Activity r1, w2.c r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                android.app.Activity r3 = r1.a
                w2.c r0 = r1.b
                com.ss.android.socialbase.appdownloader.up.c.f(r3, r0)
                r2.cancel()
                r2 = 0
                com.ss.android.socialbase.appdownloader.up.c.a(r2)
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.socialbase.appdownloader.up.c.b = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.app.AlertDialog a(android.app.AlertDialog r0) {
            com.ss.android.socialbase.appdownloader.up.c.d = r0
            return r0
    }

    public static void b(int r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L42
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)
            java.lang.String r0 = "enable_target_34"
            int r2 = r2.xt(r0)
            if (r2 <= 0) goto L42
            boolean r2 = e()
            if (r2 == 0) goto L19
            goto L42
        L19:
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L32
            java.lang.Class<com.ss.android.socialbase.appdownloader.view.DownloadHandleNotificationActivity> r1 = com.ss.android.socialbase.appdownloader.view.DownloadHandleNotificationActivity.class
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "android.ss.intent.action.DOWNLOAD_REQUEST_PERMISSION"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L32
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)     // Catch: java.lang.Throwable -> L32
            r2.startActivity(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r2 = move-exception
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.up.c.a
            java.lang.String r1 = "requestNotificationPermissionError2:"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r1.concat(r2)
            com.ss.android.socialbase.downloader.m.j.up(r0, r2)
        L42:
            return
    }

    public static synchronized void c(@androidx.annotation.NonNull android.app.Activity r7, @androidx.annotation.NonNull w2.c r8) {
            java.lang.Class<com.ss.android.socialbase.appdownloader.up.c> r0 = com.ss.android.socialbase.appdownloader.up.c.class
            monitor-enter(r0)
            if (r8 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            r1 = 0
            if (r7 == 0) goto L7f
            boolean r2 = r7.isFinishing()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L11
            goto L7f
        L11:
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "tt_appdownloader_notification_request_title"
            int r2 = com.ss.android.socialbase.appdownloader.c.b(r2, r3)     // Catch: java.lang.Throwable -> L49
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "tt_appdownloader_notification_request_message"
            int r3 = com.ss.android.socialbase.appdownloader.c.b(r3, r4)     // Catch: java.lang.Throwable -> L49
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "tt_appdownloader_notification_request_btn_yes"
            int r4 = com.ss.android.socialbase.appdownloader.c.b(r4, r5)     // Catch: java.lang.Throwable -> L49
            android.content.Context r5 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = "tt_appdownloader_notification_request_btn_no"
            int r5 = com.ss.android.socialbase.appdownloader.c.b(r5, r6)     // Catch: java.lang.Throwable -> L49
            java.util.List<w2.c> r6 = com.ss.android.socialbase.appdownloader.up.c.b     // Catch: java.lang.Throwable -> L49
            r6.add(r8)     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog r6 = com.ss.android.socialbase.appdownloader.up.c.d     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L4b
            boolean r6 = r6.isShowing()     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto L7d
            goto L4b
        L49:
            r7 = move-exception
            goto L84
        L4b:
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L49
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog$Builder r2 = r6.setTitle(r2)     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.appdownloader.up.c$c r3 = new com.ss.android.socialbase.appdownloader.up.c$c     // Catch: java.lang.Throwable -> L49
            r3.<init>(r7, r8)     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog$Builder r7 = r2.setPositiveButton(r4, r3)     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.appdownloader.up.c$b r8 = new com.ss.android.socialbase.appdownloader.up.c$b     // Catch: java.lang.Throwable -> L49
            r8.<init>()     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r5, r8)     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.appdownloader.up.c$a r8 = new com.ss.android.socialbase.appdownloader.up.c$a     // Catch: java.lang.Throwable -> L49
            r8.<init>()     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog$Builder r7 = r7.setOnKeyListener(r8)     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog$Builder r7 = r7.setCancelable(r1)     // Catch: java.lang.Throwable -> L49
            android.app.AlertDialog r7 = r7.show()     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.appdownloader.up.c.d = r7     // Catch: java.lang.Throwable -> L49
        L7d:
            monitor-exit(r0)
            return
        L7f:
            r8.xt()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            return
        L84:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L8c
            d(r1)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)
            return
        L8c:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r7
    }

    public static synchronized void d(boolean r3) {
            java.lang.Class<com.ss.android.socialbase.appdownloader.up.c> r0 = com.ss.android.socialbase.appdownloader.up.c.class
            monitor-enter(r0)
            android.app.AlertDialog r1 = com.ss.android.socialbase.appdownloader.up.c.d     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1.cancel()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            com.ss.android.socialbase.appdownloader.up.c.d = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L30
        L10:
            java.util.List<w2.c> r1 = com.ss.android.socialbase.appdownloader.up.c.b     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le
            w2.c r2 = (w2.c) r2     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L16
            if (r3 == 0) goto L2a
            r2.j()     // Catch: java.lang.Throwable -> Le
            goto L16
        L2a:
            r2.xt()     // Catch: java.lang.Throwable -> Le
            goto L16
        L2e:
            monitor-exit(r0)
            return
        L30:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)
            return
        L35:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r3
    }

    public static boolean e() {
            boolean r0 = g()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 1
            return r0
    }

    public static void f(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull w2.c r4) {
            if (r3 == 0) goto L3e
            boolean r0 = r3.isFinishing()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L9
            goto L3e
        L9:
            android.app.FragmentManager r3 = r3.getFragmentManager()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.up.c.a     // Catch: java.lang.Throwable -> L36
            android.app.Fragment r1 = r3.findFragmentByTag(r0)     // Catch: java.lang.Throwable -> L36
            com.ss.android.socialbase.appdownloader.view.b r1 = (com.ss.android.socialbase.appdownloader.view.b) r1     // Catch: java.lang.Throwable -> L36
            com.ss.android.socialbase.appdownloader.up.c.c = r1     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L38
            com.ss.android.socialbase.appdownloader.view.b r1 = new com.ss.android.socialbase.appdownloader.view.b     // Catch: java.lang.Throwable -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L36
            com.ss.android.socialbase.appdownloader.up.c.c = r1     // Catch: java.lang.Throwable -> L36
            android.app.FragmentTransaction r1 = r3.beginTransaction()     // Catch: java.lang.Throwable -> L36
            com.ss.android.socialbase.appdownloader.view.b r2 = com.ss.android.socialbase.appdownloader.up.c.c     // Catch: java.lang.Throwable -> L36
            android.app.FragmentTransaction r0 = r1.add(r2, r0)     // Catch: java.lang.Throwable -> L36
            r0.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L36
            r3.executePendingTransactions()     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r3 = move-exception
            goto L42
        L38:
            com.ss.android.socialbase.appdownloader.view.b r3 = com.ss.android.socialbase.appdownloader.up.c.c     // Catch: java.lang.Throwable -> L36
            r3.b()     // Catch: java.lang.Throwable -> L36
            return
        L3e:
            r4.j()     // Catch: java.lang.Throwable -> L36
            return
        L42:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L49
            r4.j()     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private static boolean g() {
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r1 = "notification"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L17
            boolean r0 = cn.jiguang.commons.L.f1.a(r1)
            return r0
        L17:
            java.lang.String r1 = "appops"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r0 = r0.getPackageName()
            int r2 = r2.uid
            r3 = 1
            java.lang.Class<android.app.AppOpsManager> r4 = android.app.AppOpsManager.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "checkOpNoThrow"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L7c
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L7c
            r7[r3] = r8     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r10 = 2
            r7[r10] = r8     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Method r5 = r4.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "OP_POST_NOTIFICATION"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L7c
            r4.intValue()     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L7c
            r6[r9] = r4     // Catch: java.lang.Throwable -> L7c
            r6[r3] = r2     // Catch: java.lang.Throwable -> L7c
            r6[r10] = r0     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r5.invoke(r1, r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L7c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7b
            return r3
        L7b:
            return r9
        L7c:
            return r3
    }
}
