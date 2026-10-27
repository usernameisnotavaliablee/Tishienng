package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ActivityUtil {
    private static final java.lang.String d = "ActivityUtil";
    private static volatile com.huawei.hms.framework.common.ActivityUtil e = null;
    private static final int f = 20;
    private java.util.List<com.huawei.hms.framework.common.ActivityUtil.OnAppStatusListener> a;
    private boolean b;
    private android.app.Application.ActivityLifecycleCallbacks c;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnAppStatusListener {
        void onBack();

        void onFront();
    }

    private ActivityUtil() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            com.huawei.hms.framework.common.ActivityUtil$1 r0 = new com.huawei.hms.framework.common.ActivityUtil$1
            r0.<init>(r1)
            r1.c = r0
            return
    }

    static /* synthetic */ boolean access$002(com.huawei.hms.framework.common.ActivityUtil r0, boolean r1) {
            r0.b = r1
            return r1
    }

    static /* synthetic */ java.util.List access$100(com.huawei.hms.framework.common.ActivityUtil r0) {
            java.util.List<com.huawei.hms.framework.common.ActivityUtil$OnAppStatusListener> r0 = r0.a
            return r0
    }

    public static android.app.PendingIntent getActivities(android.content.Context r2, int r3, android.content.Intent[] r4, int r5) {
            r0 = 0
            java.lang.String r1 = "ActivityUtil"
            if (r2 != 0) goto Lb
            java.lang.String r2 = "context is null"
            com.huawei.hms.framework.common.Logger.w(r1, r2)
            return r0
        Lb:
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivities(r2, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.String r3 = "dealType rethrowFromSystemServer:"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r2)
            return r0
    }

    public static com.huawei.hms.framework.common.ActivityUtil getInstance() {
            com.huawei.hms.framework.common.ActivityUtil r0 = com.huawei.hms.framework.common.ActivityUtil.e
            if (r0 != 0) goto L19
            java.lang.Class<com.huawei.hms.framework.common.ActivityUtil> r0 = com.huawei.hms.framework.common.ActivityUtil.class
            monitor-enter(r0)
            com.huawei.hms.framework.common.ActivityUtil r1 = com.huawei.hms.framework.common.ActivityUtil.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.huawei.hms.framework.common.ActivityUtil r1 = new com.huawei.hms.framework.common.ActivityUtil     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.huawei.hms.framework.common.ActivityUtil.e = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.huawei.hms.framework.common.ActivityUtil r0 = com.huawei.hms.framework.common.ActivityUtil.e
            return r0
    }

    @java.lang.Deprecated
    public static boolean isForeground(android.content.Context r0) {
            com.huawei.hms.framework.common.ActivityUtil r0 = getInstance()
            boolean r0 = r0.isForeground()
            return r0
    }

    public boolean isForeground() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public void register() {
            r2 = this;
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L10
            android.app.Application r0 = (android.app.Application) r0
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.c
            r0.registerActivityLifecycleCallbacks(r1)
            return
        L10:
            java.lang.String r0 = "ActivityUtil"
            java.lang.String r1 = "context is not application, register background fail"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
    }

    public void setOnAppStatusListener(com.huawei.hms.framework.common.ActivityUtil.OnAppStatusListener r4) {
            r3 = this;
            java.lang.String r0 = "ActivityUtil"
            if (r4 != 0) goto La
            java.lang.String r4 = "onAppStatusListener is null"
            com.huawei.hms.framework.common.Logger.w(r0, r4)
            return
        La:
            java.util.List<com.huawei.hms.framework.common.ActivityUtil$OnAppStatusListener> r1 = r3.a
            int r1 = r1.size()
            r2 = 20
            if (r1 < r2) goto L1a
            java.lang.String r4 = "onAppStatusListener of count is max"
            com.huawei.hms.framework.common.Logger.w(r0, r4)
            return
        L1a:
            java.util.List<com.huawei.hms.framework.common.ActivityUtil$OnAppStatusListener> r0 = r3.a
            r0.add(r4)
            return
    }

    public void unRegister() {
            r2 = this;
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L10
            android.app.Application r0 = (android.app.Application) r0
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.c
            r0.unregisterActivityLifecycleCallbacks(r1)
            return
        L10:
            java.lang.String r0 = "ActivityUtil"
            java.lang.String r1 = "context is not application, unRegister background fail"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
    }
}
