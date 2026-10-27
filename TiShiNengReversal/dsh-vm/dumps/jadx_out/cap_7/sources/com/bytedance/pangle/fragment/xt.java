package com.bytedance.pangle.fragment;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class xt implements android.app.Application.ActivityLifecycleCallbacks {
    androidx.fragment.app.Fragment j;

    public xt(androidx.fragment.app.Fragment r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull android.os.Bundle r4) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.j
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == r3) goto L9
            goto L3b
        L9:
            java.lang.ClassLoader r0 = r3.getClassLoader()
            androidx.fragment.app.Fragment r1 = r2.j
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r0 != r1) goto L1a
            goto L3b
        L1a:
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "android:support:fragments"
            if (r0 == 0) goto L29
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Exception -> L3b
            r0.remove(r1)     // Catch: java.lang.Exception -> L3b
        L29:
            r4.remove(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = "Zeus/activity_pangle"
            java.lang.String r0 = "clear fragment, Activity:"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Exception -> L3b
            com.bytedance.pangle.log.ZeusLogger.d(r4, r3)     // Catch: java.lang.Exception -> L3b
        L3b:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }
}
