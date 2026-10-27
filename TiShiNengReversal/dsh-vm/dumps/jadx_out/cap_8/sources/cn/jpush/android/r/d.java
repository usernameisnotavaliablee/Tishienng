package cn.jpush.android.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1876b;

    /* renamed from: c, reason: collision with root package name */
    private android.view.WindowManager f1877c;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.lang.String r0 = ""
            r1.f1876b = r0
            return
    }

    public static int a(android.content.Context r6) {
            java.lang.String r0 = "InAppWinManager"
            r1 = 48
            if (r6 == 0) goto L36
            android.content.res.Resources r2 = r6.getResources()     // Catch: java.lang.Throwable -> L1d
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "status_bar_height"
            java.lang.String r4 = "dimen"
            java.lang.String r5 = "android"
            int r6 = r6.getIdentifier(r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
            int r1 = r2.getDimensionPixelSize(r6)     // Catch: java.lang.Throwable -> L1d
            goto L36
        L1d:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get status bar height error, "
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r6)
        L36:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "status bar height: "
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            cn.jpush.android.helper.Logger.d(r0, r6)
            return r1
    }

    private android.view.WindowManager.LayoutParams a(android.content.Context r9, cn.jpush.android.t.a r10) {
            r8 = this;
            if (r10 == 0) goto L50
            if (r9 == 0) goto L50
            int r0 = r10.a()     // Catch: java.lang.Throwable -> L34
            r1 = 131112(0x20028, float:1.83727E-40)
            r6 = r0 | r1
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams     // Catch: java.lang.Throwable -> L34
            int r3 = r10.c()     // Catch: java.lang.Throwable -> L34
            int r4 = r10.d()     // Catch: java.lang.Throwable -> L34
            r7 = -3
            r5 = 1003(0x3eb, float:1.406E-42)
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L34
            r0 = 0
            r2.x = r0     // Catch: java.lang.Throwable -> L34
            int r9 = a(r9)     // Catch: java.lang.Throwable -> L34
            r2.y = r9     // Catch: java.lang.Throwable -> L34
            r9 = 1050253722(0x3e99999a, float:0.3)
            r2.dimAmount = r9     // Catch: java.lang.Throwable -> L34
            int r9 = r10.b()     // Catch: java.lang.Throwable -> L34
            r2.gravity = r9     // Catch: java.lang.Throwable -> L34
            r2.windowAnimations = r0     // Catch: java.lang.Throwable -> L34
            return r2
        L34:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[getLayoutParams] error."
            r10.append(r0)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "InAppWinManager"
            cn.jpush.android.helper.Logger.w(r10, r9)
        L50:
            r9 = 0
            return r9
    }

    private android.view.WindowManager b(android.content.Context r2) {
            r1 = this;
            if (r2 != 0) goto Lb
            java.lang.String r2 = "InAppWinManager"
            java.lang.String r0 = "getWindowManager context is null"
            cn.jpush.android.helper.Logger.w(r2, r0)
            r2 = 0
            return r2
        Lb:
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            return r2
    }

    public boolean a(android.content.Context r6, cn.jpush.android.u.b r7) {
            r5 = this;
            java.lang.String r0 = "InAppWinManager"
            r1 = 0
            java.lang.String r2 = ""
            r5.f1876b = r2     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L11
            java.lang.String r6 = "notify inapp show failed, wrapper is null"
            cn.jpush.android.helper.Logger.w(r0, r6)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r6 = move-exception
            goto L5f
        L11:
            cn.jpush.android.t.a r2 = r7.k()     // Catch: java.lang.Throwable -> Lf
            android.view.View r3 = r7.e()     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L21
            java.lang.String r6 = "notify inapp show failed, wbView is null"
            cn.jpush.android.helper.Logger.w(r0, r6)     // Catch: java.lang.Throwable -> Lf
            return r1
        L21:
            android.view.WindowManager r4 = r5.b(r6)     // Catch: java.lang.Throwable -> Lf
            r5.f1877c = r4     // Catch: java.lang.Throwable -> Lf
            boolean r4 = r6 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L3d
            java.lang.Class r4 = r6.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = r4.getCanonicalName()     // Catch: java.lang.Throwable -> Lf
            r5.f1876b = r4     // Catch: java.lang.Throwable -> Lf
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> Lf
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)     // Catch: java.lang.Throwable -> Lf
        L3d:
            android.view.WindowManager r4 = r5.f1877c     // Catch: java.lang.Throwable -> Lf
            if (r4 != 0) goto L47
            java.lang.String r6 = "notify inapp show failed, wm is null"
            cn.jpush.android.helper.Logger.w(r0, r6)     // Catch: java.lang.Throwable -> Lf
            return r1
        L47:
            android.view.WindowManager$LayoutParams r6 = r5.a(r6, r2)     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L53
            java.lang.String r6 = "notify inapp show failed, layout param is null"
            cn.jpush.android.helper.Logger.w(r0, r6)     // Catch: java.lang.Throwable -> Lf
            return r1
        L53:
            android.view.WindowManager r2 = r5.f1877c     // Catch: java.lang.Throwable -> Lf
            r2.addView(r3, r6)     // Catch: java.lang.Throwable -> Lf
            r7.h()     // Catch: java.lang.Throwable -> Lf
            r6 = 1
            r5.a = r6     // Catch: java.lang.Throwable -> Lf
            return r6
        L5f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "notify inapp show failed, "
            r7.append(r2)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jpush.android.helper.Logger.w(r0, r6)
            return r1
    }

    public boolean a(cn.jpush.android.u.b r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L3a
            android.view.View r1 = r4.e()
            if (r1 == 0) goto L3a
            android.view.View r4 = r4.e()
            boolean r4 = r4.isShown()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "webview is displayed, status: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", isDisplayed: "
            r1.append(r2)
            boolean r2 = r3.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "InAppWinManager"
            cn.jpush.android.helper.Logger.d(r2, r1)
            if (r4 == 0) goto L3a
            boolean r4 = r3.a
            if (r4 == 0) goto L3a
            r4 = 1
            return r4
        L3a:
            return r0
    }

    public boolean a(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[checkShouldDestroy], showActivityName: "
            r0.append(r1)
            java.lang.String r1 = r2.f1876b
            r0.append(r1)
            java.lang.String r1 = ", curActivityName: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppWinManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.String r0 = r2.f1876b
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            return r3
    }

    public void b(android.content.Context r3, cn.jpush.android.u.b r4) {
            r2 = this;
            java.lang.String r0 = "InAppWinManager"
            if (r4 == 0) goto L2f
            if (r3 != 0) goto L7
            goto L2f
        L7:
            android.view.View r3 = r4.e()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L2a
            android.view.WindowManager r1 = r2.f1877c     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L27
            boolean r1 = r2.a(r4)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L27
            android.view.WindowManager r1 = r2.f1877c     // Catch: java.lang.Throwable -> L25
            r1.removeViewImmediate(r3)     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r2.a = r3     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "[destroy] - window manager removeViewImmediate view succeed."
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r3 = move-exception
            goto L44
        L27:
            r4.c()     // Catch: java.lang.Throwable -> L25
        L2a:
            java.lang.String r3 = ""
            r2.f1876b = r3     // Catch: java.lang.Throwable -> L25
            return
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "destroy param is null, wrapper: "
            r3.append(r1)     // Catch: java.lang.Throwable -> L25
            r3.append(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L25
            cn.jpush.android.helper.Logger.w(r0, r3)     // Catch: java.lang.Throwable -> L25
            return
        L44:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "notify inapp destroy failed, "
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
            return
    }

    public boolean b(cn.jpush.android.u.b r1) {
            r0 = this;
            if (r1 == 0) goto La
            android.view.View r1 = r1.e()
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }
}
