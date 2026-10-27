package cn.jiguang.analytics.page;

@android.annotation.TargetApi(14)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ActivityLifecycle implements android.app.Application.ActivityLifecycleCallbacks {
    private static final java.lang.String SAVE_KEY = "save_key";
    private static final java.lang.String TAG = "ActivityLifecycle";
    public static final long WAKE_VIOLATION_COUNT = 5;
    public static final long WAKE_VIOLATION_DURATION = 50;
    private static final java.util.concurrent.atomic.AtomicInteger activityTaskCount = null;
    public static long lastWakeTime;
    private boolean aidlBuildSuccess;
    private boolean isFromSync;
    private java.util.List<android.app.Application.ActivityLifecycleCallbacks> mActivityCallbacks;
    private java.lang.ref.WeakReference<android.app.Activity> mWeakReference;


    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.analytics.page.ActivityLifecycle.activityTaskCount = r0
            r0 = 0
            cn.jiguang.analytics.page.ActivityLifecycle.lastWakeTime = r0
            return
    }

    public ActivityLifecycle() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mActivityCallbacks = r0
            r0 = 0
            r1.isFromSync = r0
            r1.aidlBuildSuccess = r0
            return
    }

    private void cacheBeforeInit(android.app.Activity r2) {
            r1 = this;
            boolean r0 = r1.aidlBuildSuccess     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r1.clearLocal()     // Catch: java.lang.Throwable -> L12
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L12
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L12
            r1.mWeakReference = r0     // Catch: java.lang.Throwable -> L12
            return
        Lf:
            r1.clearLocal()     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    private void clearLocal() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.mWeakReference
            if (r0 == 0) goto La
            r0.clear()
            r0 = 0
            r1.mWeakReference = r0
        La:
            return
    }

    private boolean isTranslucentNotitleTheme(android.app.Activity r12) {
            r11 = this;
            java.lang.String r0 = "ActivityLifecycle"
            r1 = 0
            android.content.res.Resources$Theme r2 = r12.getTheme()     // Catch: java.lang.Throwable -> L84
            r3 = 16842840(0x1010058, float:2.3693805E-38)
            r4 = 16843435(0x10102ab, float:2.3695472E-38)
            r5 = 16842838(0x1010056, float:2.36938E-38)
            r6 = 16842841(0x1010059, float:2.3693807E-38)
            r7 = 16842836(0x1010054, float:2.3693793E-38)
            int[] r3 = new int[]{r5, r6, r7, r3, r4}     // Catch: java.lang.Throwable -> L84
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3)     // Catch: java.lang.Throwable -> L84
            boolean r3 = r2.getBoolean(r1, r1)     // Catch: java.lang.Throwable -> L84
            r4 = 1
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r4)     // Catch: java.lang.Throwable -> L84
            r6 = 2
            r7 = -1
            int r6 = r2.getColor(r6, r7)     // Catch: java.lang.Throwable -> L84
            r7 = 3
            boolean r7 = r2.getBoolean(r7, r1)     // Catch: java.lang.Throwable -> L84
            r8 = 4
            android.graphics.drawable.Drawable r8 = r2.getDrawable(r8)     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r9.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "notitle:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L84
            r9.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = ", overlay:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L84
            r9.append(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = ", color:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L84
            r9.append(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = ", translucent:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L84
            r9.append(r7)     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "background:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L84
            r9.append(r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L84
            cn.jiguang.w.f.c(r0, r9)     // Catch: java.lang.Throwable -> L84
            r2.recycle()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L99
            if (r7 == 0) goto L99
            if (r5 != 0) goto L99
            if (r8 != 0) goto L99
            android.content.res.Resources r12 = r12.getResources()     // Catch: java.lang.Throwable -> L84
            r2 = 17170445(0x106000d, float:2.461195E-38)
            int r12 = r12.getColor(r2)     // Catch: java.lang.Throwable -> L84
            if (r6 != r12) goto L99
            return r4
        L84:
            r12 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "check TranslucentNotitleTheme failed :"
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            cn.jiguang.w.f.i(r0, r12)
        L99:
            return r1
    }

    private boolean isWakeActivity(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto L28
            android.content.Intent r0 = r2.getIntent()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L28
            android.content.Intent r0 = r2.getIntent()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.getAction()     // Catch: java.lang.Throwable -> L28
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L28
            java.lang.String r0 = "cn.jpush.android.intent.DActivity"
            android.content.Intent r2 = r2.getIntent()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.getAction()     // Catch: java.lang.Throwable -> L28
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    private void reportWakeViolation(android.content.Context r2) {
            r1 = this;
            cn.jiguang.analytics.page.ActivityLifecycle$1 r0 = new cn.jiguang.analytics.page.ActivityLifecycle$1
            r0.<init>(r1, r2)
            java.lang.String r2 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r2, r0)
            return
    }

    public void addActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            if (r2 == 0) goto L12
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r1.mActivityCallbacks     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            r1.mActivityCallbacks = r0     // Catch: java.lang.Throwable -> L12
        Ld:
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r1.mActivityCallbacks     // Catch: java.lang.Throwable -> L12
            r0.add(r2)     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
            r2 = this;
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L13
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L13
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "onCreate"
            r0.dispatchStatus(r3, r1)     // Catch: java.lang.Throwable -> L2d
        L13:
            boolean r0 = r2.aidlBuildSuccess     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2d
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r2.mActivityCallbacks     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
        L1d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2d
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1     // Catch: java.lang.Throwable -> L2d
            r1.onActivityCreated(r3, r4)     // Catch: java.lang.Throwable -> L2d
            goto L1d
        L2d:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r8) {
            r7 = this;
            boolean r0 = r7.aidlBuildSuccess     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L1a
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r7.mActivityCallbacks     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1     // Catch: java.lang.Throwable -> L40
            r1.onActivityDestroyed(r8)     // Catch: java.lang.Throwable -> L40
            goto La
        L1a:
            java.util.concurrent.atomic.AtomicInteger r0 = cn.jiguang.analytics.page.ActivityLifecycle.activityTaskCount     // Catch: java.lang.Throwable -> L40
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L40
            if (r8 == 0) goto L40
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L40
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            android.content.Context r1 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L40
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "JCore"
            r8 = 0
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L40
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L11
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L11
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L3e
            r0.dispatchPause(r3)     // Catch: java.lang.Throwable -> L3e
        L11:
            boolean r0 = r2.aidlBuildSuccess     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L2b
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r2.mActivityCallbacks     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L1b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1     // Catch: java.lang.Throwable -> L3e
            r1.onActivityPaused(r3)     // Catch: java.lang.Throwable -> L3e
            goto L1b
        L2b:
            boolean r0 = cn.jiguang.internal.JConstants.isInstrumentationHookFailed     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L3e
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3e
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L3e
            r0.onPause(r3)     // Catch: java.lang.Throwable -> L3e
        L3e:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r3) {
            r2 = this;
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L11
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L11
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L3e
            r0.dispatchResume(r3)     // Catch: java.lang.Throwable -> L3e
        L11:
            boolean r0 = r2.aidlBuildSuccess     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L2b
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r2.mActivityCallbacks     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L1b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1     // Catch: java.lang.Throwable -> L3e
            r1.onActivityResumed(r3)     // Catch: java.lang.Throwable -> L3e
            goto L1b
        L2b:
            boolean r0 = cn.jiguang.internal.JConstants.isInstrumentationHookFailed     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L3e
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3e
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L3e
            r0.onResume(r3)     // Catch: java.lang.Throwable -> L3e
        L3e:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r3, android.os.Bundle r4) {
            r2 = this;
            boolean r0 = r2.aidlBuildSuccess     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r2.mActivityCallbacks     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1a
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1a
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1     // Catch: java.lang.Throwable -> L1a
            r1.onActivitySaveInstanceState(r3, r4)     // Catch: java.lang.Throwable -> L1a
            goto La
        L1a:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r10) {
            r9 = this;
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L13
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L13
            cn.jiguang.api.JAnalyticsAction r0 = cn.jiguang.internal.JConstants.jAnalyticsAction     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "onStart"
            r0.dispatchStatus(r10, r1)     // Catch: java.lang.Throwable -> L70
        L13:
            boolean r0 = r9.aidlBuildSuccess     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L2d
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r9.mActivityCallbacks     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L70
        L1d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L70
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1     // Catch: java.lang.Throwable -> L70
            r1.onActivityStarted(r10)     // Catch: java.lang.Throwable -> L70
            goto L1d
        L2d:
            r9.cacheBeforeInit(r10)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicInteger r0 = cn.jiguang.analytics.page.ActivityLifecycle.activityTaskCount     // Catch: java.lang.Throwable -> L70
            int r1 = r0.get()     // Catch: java.lang.Throwable -> L70
            r2 = 1
            if (r1 != 0) goto L64
            java.lang.String r1 = "ActivityLifecycle"
            java.lang.String r3 = "isForeground"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.Throwable -> L70
            if (r10 == 0) goto L64
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L70
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L64
            android.content.Context r3 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L70
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "JCore"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L70
            r1 = 0
            r8[r1] = r10     // Catch: java.lang.Throwable -> L70
            r5 = 66
            r6 = 0
            r7 = 0
            cn.jiguang.api.JCoreManager.onEvent(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L70
        L64:
            boolean r10 = r9.isFromSync     // Catch: java.lang.Throwable -> L70
            if (r10 != 0) goto L70
            int r10 = r0.get()     // Catch: java.lang.Throwable -> L70
            int r10 = r10 + r2
            r0.set(r10)     // Catch: java.lang.Throwable -> L70
        L70:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r11) {
            r10 = this;
            java.lang.String r0 = "ActivityLifecycle"
            boolean r1 = r10.aidlBuildSuccess     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L1c
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r1 = r10.mActivityCallbacks     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6e
            android.app.Application$ActivityLifecycleCallbacks r2 = (android.app.Application.ActivityLifecycleCallbacks) r2     // Catch: java.lang.Throwable -> L6e
            r2.onActivityStopped(r11)     // Catch: java.lang.Throwable -> L6e
            goto Lc
        L1c:
            java.util.concurrent.atomic.AtomicInteger r1 = cn.jiguang.analytics.page.ActivityLifecycle.activityTaskCount     // Catch: java.lang.Throwable -> L6e
            int r2 = r1.get()     // Catch: java.lang.Throwable -> L6e
            r3 = 1
            if (r2 <= 0) goto L2d
            int r2 = r1.get()     // Catch: java.lang.Throwable -> L6e
            int r2 = r2 - r3
            r1.set(r2)     // Catch: java.lang.Throwable -> L6e
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "onActivityStopped activityTaskCount:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L6e
            r2.append(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6e
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L6e
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L6e
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L6e
            java.lang.String r1 = "is not Foreground"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L6e
            android.content.Context r4 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L6e
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = "JCore"
            r11 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6e
            r9[r11] = r0     // Catch: java.lang.Throwable -> L6e
            r6 = 66
            r7 = 0
            r8 = 0
            cn.jiguang.api.JCoreManager.onEvent(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6e
        L6e:
            return
    }

    public void removeActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<android.app.Application$ActivityLifecycleCallbacks> r0 = r1.mActivityCallbacks     // Catch: java.lang.Throwable -> L7
            r0.remove(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void sendCurrentState() {
            r9 = this;
            r0 = 1
            r9.aidlBuildSuccess = r0     // Catch: java.lang.Throwable -> L4e
            android.content.Context r1 = cn.jiguang.internal.JConstants.getAppContext()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "JCore"
            java.util.concurrent.atomic.AtomicInteger r7 = cn.jiguang.analytics.page.ActivityLifecycle.activityTaskCount     // Catch: java.lang.Throwable -> L4e
            int r3 = r7.get()     // Catch: java.lang.Throwable -> L4e
            r8 = 0
            if (r3 != 0) goto L14
            r3 = 0
            goto L15
        L14:
            r3 = 1
        L15:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L4e
            r6[r8] = r3     // Catch: java.lang.Throwable -> L4e
            r3 = 66
            r4 = 0
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            int r1 = r7.get()     // Catch: java.lang.Throwable -> L4e
            if (r1 > 0) goto L2b
            goto L4e
        L2b:
            java.lang.ref.WeakReference<android.app.Activity> r1 = r9.mWeakReference     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L4b
            boolean r2 = r1.isFinishing()     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L4b
            r9.isFromSync = r0     // Catch: java.lang.Throwable -> L4e
            r0 = 0
            r9.onActivityCreated(r1, r0)     // Catch: java.lang.Throwable -> L4e
            r9.onActivityStarted(r1)     // Catch: java.lang.Throwable -> L4e
            r9.onActivityResumed(r1)     // Catch: java.lang.Throwable -> L4e
            r9.isFromSync = r8     // Catch: java.lang.Throwable -> L4e
        L4b:
            r9.clearLocal()     // Catch: java.lang.Throwable -> L4e
        L4e:
            return
    }
}
