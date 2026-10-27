package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q {
    public static android.app.Application a;

    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            com.acse.ottn.l4 r0 = com.acse.ottn.l4.c()
            r0.b()
            return
    }

    public static void a(android.app.Activity r1) {
            android.view.Window r1 = r1.getWindow()
            r0 = 3
            r1.setSoftInputMode(r0)
            return
    }

    public static void a(android.app.Application r0) {
            com.acse.ottn.q.a = r0
            return
    }

    public static void a(android.view.View r1, android.app.Activity r2) {
            java.lang.String r0 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r0 = 1
            r2.showSoftInput(r1, r0)
            return
    }

    public static boolean a(android.content.Context r5) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            java.lang.String r3 = r1.processName
            java.lang.String r4 = r5.getPackageName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L10
            int r5 = r1.importance
            r0 = 400(0x190, float:5.6E-43)
            if (r5 != r0) goto L31
            r5 = 1
            return r5
        L31:
            return r2
    }

    public static android.app.Application b() {
            android.app.Application r0 = com.acse.ottn.q.a
            return r0
    }

    public static void b(android.app.Activity r0) {
            android.view.View r0 = r0.getCurrentFocus()
            if (r0 == 0) goto L9
            r0.clearFocus()
        L9:
            return
    }

    public static void c(android.app.Activity r2) {
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.view.View r2 = r2.getCurrentFocus()
            if (r2 == 0) goto L16
            android.os.IBinder r2 = r2.getWindowToken()
            r1 = 2
            r0.hideSoftInputFromWindow(r2, r1)
        L16:
            return
    }

    public static void d(android.app.Activity r2) {
            java.lang.String r0 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r0 = 1
            r1 = 2
            r2.toggleSoftInput(r0, r1)
            return
    }
}
