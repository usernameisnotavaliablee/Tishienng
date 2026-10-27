package cn.jpush.android.s;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.ref.WeakReference<android.app.Activity> f1878b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f1879c = "";

    /* renamed from: e, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicLong f1880e;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f1881d;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r1 = java.lang.System.currentTimeMillis()
            r0.<init>(r1)
            cn.jpush.android.s.a.f1880e = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long a() {
            java.util.concurrent.atomic.AtomicLong r0 = cn.jpush.android.s.a.f1880e
            long r0 = r0.get()
            return r0
    }

    public static android.app.Activity a(android.content.Context r0) {
            android.app.Activity r0 = b(r0)
            return r0
    }

    private static android.app.Activity b(android.content.Context r3) {
            java.lang.String r0 = "InAppLifeListener"
            java.lang.ref.WeakReference<android.app.Activity> r1 = cn.jpush.android.s.a.f1878b     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "mActivity is null, try to user weakActivity: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.ref.WeakReference<android.app.Activity> r2 = cn.jpush.android.s.a.f1878b     // Catch: java.lang.Throwable -> L4d
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4d
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.ref.WeakReference<android.app.Activity> r1 = cn.jpush.android.s.a.f1878b     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L4d
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4f
            boolean r2 = r1.isFinishing()     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r3.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "use weak activity, "
            r3.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.ref.WeakReference<android.app.Activity> r2 = cn.jpush.android.s.a.f1878b     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L4d
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r2.getLocalClassName()     // Catch: java.lang.Throwable -> L4d
            r3.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4d
            cn.jpush.android.helper.Logger.dd(r0, r3)     // Catch: java.lang.Throwable -> L4d
            return r1
        L4d:
            r3 = move-exception
            goto L7b
        L4f:
            android.app.Activity r3 = cn.jpush.android.ad.a.k(r3)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L93
            boolean r1 = r3.isFinishing()     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "use current stack activity, "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r3.getLocalClassName()     // Catch: java.lang.Throwable -> L4d
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4d
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4d
            cn.jpush.android.s.a.f1878b = r1     // Catch: java.lang.Throwable -> L4d
            goto L93
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getActivityInternal error, "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
        L93:
            r3 = 0
            return r3
    }

    public void a(android.app.Activity r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            cn.jpush.android.s.a.f1878b = r0
            return
    }

    public void b(android.app.Activity r8) {
            r7 = this;
            java.lang.String r0 = "InAppLifeListener"
            if (r8 != 0) goto La
            java.lang.String r8 = "onActivityStarted activity is null"
        L6:
            cn.jpush.android.helper.Logger.w(r0, r8)
            return
        La:
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "[onActivityStarted], gLatestActivityName: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = cn.jpush.android.s.a.f1879c     // Catch: java.lang.Throwable -> L7e
            r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = ", activityTaskCount: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            int r3 = cn.jpush.android.s.a.a     // Catch: java.lang.Throwable -> L7e
            r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = " currentActivity: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            r2.append(r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7e
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L7e
            r7.a(r8)     // Catch: java.lang.Throwable -> L7e
            android.content.Context r8 = cn.jpush.android.local.JPushConstants.getAppContext(r8)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = r8.getPackageName()     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r3.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "mLastPkg="
            r3.append(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r7.f1881d     // Catch: java.lang.Throwable -> L7e
            r3.append(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = " currentPkg="
            r3.append(r4)     // Catch: java.lang.Throwable -> L7e
            r3.append(r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7e
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L7e
            int r3 = cn.jpush.android.s.a.a     // Catch: java.lang.Throwable -> L7e
            r4 = 1
            if (r3 != 0) goto L80
            java.lang.String r3 = "is foreground, change foreground state"
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicLong r3 = cn.jpush.android.s.a.f1880e     // Catch: java.lang.Throwable -> L7e
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7e
            r3.set(r5)     // Catch: java.lang.Throwable -> L7e
        L76:
            cn.jpush.android.o.a r3 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L7e
            r3.a(r8, r4, r1)     // Catch: java.lang.Throwable -> L7e
            goto L96
        L7e:
            r8 = move-exception
            goto La0
        L80:
            java.lang.String r3 = cn.jpush.android.s.a.f1879c     // Catch: java.lang.Throwable -> L7e
            boolean r3 = android.text.TextUtils.equals(r1, r3)     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L96
            java.lang.String r3 = r7.f1881d     // Catch: java.lang.Throwable -> L7e
            boolean r3 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L96
            java.lang.String r3 = "use enter new activity,show inapp message"
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L7e
            goto L76
        L96:
            cn.jpush.android.s.a.f1879c = r1     // Catch: java.lang.Throwable -> L7e
            r7.f1881d = r2     // Catch: java.lang.Throwable -> L7e
            int r8 = cn.jpush.android.s.a.a     // Catch: java.lang.Throwable -> L7e
            int r8 = r8 + r4
            cn.jpush.android.s.a.a = r8     // Catch: java.lang.Throwable -> L7e
            return
        La0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onActivityStarted error, "
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            goto L6
    }

    public void c(android.app.Activity r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    public void d(android.app.Activity r4) {
            r3 = this;
            java.lang.String r0 = "InAppLifeListener"
            if (r4 == 0) goto L3e
            java.lang.ref.WeakReference<android.app.Activity> r1 = cn.jpush.android.s.a.f1878b
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto Lf
            goto L3e
        Lf:
            java.lang.ref.WeakReference<android.app.Activity> r1 = cn.jpush.android.s.a.f1878b     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L22
            if (r1 != r4) goto L24
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L22
            r1 = 0
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.s.a.f1878b = r4     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r4 = move-exception
            goto L25
        L24:
            return
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " onActivityDestroyed error, "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L3a:
            cn.jpush.android.helper.Logger.w(r0, r4)
            return
        L3e:
            java.lang.String r4 = "onActivityPaused activity is null"
            goto L3a
    }

    public void e(android.app.Activity r5) {
            r4 = this;
            java.lang.String r0 = "InAppLifeListener"
            if (r5 != 0) goto La
            java.lang.String r5 = "onActivityStopped activity is null"
        L6:
            cn.jpush.android.helper.Logger.w(r0, r5)
            return
        La:
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "[onActivityStopped], curClzName: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            r2.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = ", latestCurClzName: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = cn.jpush.android.s.a.f1879c     // Catch: java.lang.Throwable -> L52
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = ", activityTaskCount: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            int r3 = cn.jpush.android.s.a.a     // Catch: java.lang.Throwable -> L52
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L52
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L52
            cn.jpush.android.o.a r2 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L52
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L52
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L52
            r2.a(r5, r1)     // Catch: java.lang.Throwable -> L52
            int r5 = cn.jpush.android.s.a.a     // Catch: java.lang.Throwable -> L52
            if (r5 <= 0) goto L54
            int r5 = r5 + (-1)
            cn.jpush.android.s.a.a = r5     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r5 = move-exception
            goto L68
        L54:
            int r5 = cn.jpush.android.s.a.a     // Catch: java.lang.Throwable -> L52
            if (r5 != 0) goto L67
            java.lang.String r5 = cn.jpush.android.s.a.f1879c     // Catch: java.lang.Throwable -> L52
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L61
            goto L67
        L61:
            int r5 = cn.jpush.android.s.a.a     // Catch: java.lang.Throwable -> L52
            int r5 = r5 + 1
            cn.jpush.android.s.a.a = r5     // Catch: java.lang.Throwable -> L52
        L67:
            return
        L68:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onActivityStopped error, "
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            goto L6
    }

    public void f(android.app.Activity r4) {
            r3 = this;
            java.lang.String r0 = "[onActivityDestroyed]"
            java.lang.String r1 = "InAppLifeListener"
            cn.jpush.android.helper.Logger.d(r1, r0)
            if (r4 != 0) goto Lf
            java.lang.String r4 = "onActivityDestroyed activity is null"
        Lb:
            cn.jpush.android.helper.Logger.w(r1, r4)
            return
        Lf:
            cn.jpush.android.o.a r0 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r4.getCanonicalName()     // Catch: java.lang.Throwable -> L27
            r0.a(r2, r4)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onActivityDestroyed error, "
            r0.append(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto Lb
    }
}
