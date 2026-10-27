package com.huawei.hms.ml.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ActivityMgr implements android.app.Application.ActivityLifecycleCallbacks {
    public static final com.huawei.hms.ml.common.utils.ActivityMgr INST = null;
    private java.lang.ref.WeakReference<android.app.Activity> activity;

    static {
            com.huawei.hms.ml.common.utils.ActivityMgr r0 = new com.huawei.hms.ml.common.utils.ActivityMgr
            r0.<init>()
            com.huawei.hms.ml.common.utils.ActivityMgr.INST = r0
            return
    }

    private ActivityMgr() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String toString(java.lang.Object r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            return r2
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public android.app.Activity getCurrentActivity() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.activity
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public void init(android.app.Application r2) {
            r1 = this;
            if (r2 != 0) goto La
            java.lang.String r2 = "ActivityMgr"
            java.lang.String r0 = "init failed for app is null"
            com.huawei.hms.ml.common.utils.SmartLog.w(r2, r0)
            return
        La:
            com.huawei.hms.ml.common.utils.ActivityMgr r0 = com.huawei.hms.ml.common.utils.ActivityMgr.INST
            r2.unregisterActivityLifecycleCallbacks(r0)
            r2.registerActivityLifecycleCallbacks(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "onCreated:"
            r3.append(r0)
            java.lang.String r0 = toString(r2)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ActivityMgr"
            com.huawei.hms.ml.common.utils.SmartLog.d(r0, r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.activity = r3
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onResumed:"
            r0.append(r1)
            java.lang.String r1 = toString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActivityMgr"
            com.huawei.hms.ml.common.utils.SmartLog.d(r1, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.activity = r0
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onStarted:"
            r0.append(r1)
            java.lang.String r1 = toString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActivityMgr"
            com.huawei.hms.ml.common.utils.SmartLog.d(r1, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.activity = r0
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
