package com.bytedance.pangle.fragment;

@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw implements android.app.Application.ActivityLifecycleCallbacks {
    android.app.Fragment j;

    public cw(android.app.Fragment r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
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
    public void onActivityPostSaveInstanceState(@androidx.annotation.NonNull android.app.Activity r9, @androidx.annotation.NonNull android.os.Bundle r10) {
            r8 = this;
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_pangle"
            java.lang.String r1 = "mActive"
            android.app.Fragment r2 = r8.j
            android.app.Activity r2 = r2.getActivity()
            if (r2 == r9) goto Le
            goto L82
        Le:
            java.lang.String r9 = "android:fragments"
            android.os.Parcelable r9 = r10.getParcelable(r9)     // Catch: java.lang.Throwable -> L4d
            if (r9 != 0) goto L18
            goto L82
        L18:
            java.lang.Object r10 = com.bytedance.pangle.util.FieldUtils.readField(r9, r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch: java.lang.Throwable -> L4d
            if (r10 != 0) goto L21
            goto L82
        L21:
            int r2 = r10.length     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            r4 = 0
        L24:
            if (r4 >= r2) goto L52
            r5 = r10[r4]     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = "mTag"
            java.lang.Object r6 = com.bytedance.pangle.util.FieldUtils.readField(r5, r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r7 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_plugin"
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L37
            goto L53
        L37:
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L4f
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L4d
            boolean r7 = r7.contains(r0)     // Catch: java.lang.Throwable -> L4d
            if (r7 != 0) goto L53
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L4d
            boolean r6 = r6.contains(r0)     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L4f
            goto L53
        L4d:
            r9 = move-exception
            goto L83
        L4f:
            int r4 = r4 + 1
            goto L24
        L52:
            r5 = 0
        L53:
            if (r5 == 0) goto L82
            java.lang.String r0 = "android.app.FragmentState"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4d
            int r2 = r10.length     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 + (-1)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> L4d
            int r2 = r10.length     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 + (-1)
            int[] r2 = new int[r2]     // Catch: java.lang.Throwable -> L4d
            r4 = 0
        L6a:
            int r6 = r10.length     // Catch: java.lang.Throwable -> L4d
            if (r3 >= r6) goto L7a
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L4d
            if (r6 == r5) goto L77
            r0[r4] = r6     // Catch: java.lang.Throwable -> L4d
            r2[r4] = r3     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + 1
        L77:
            int r3 = r3 + 1
            goto L6a
        L7a:
            com.bytedance.pangle.util.FieldUtils.writeField(r9, r1, r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r10 = "mAdded"
            com.bytedance.pangle.util.FieldUtils.writeField(r9, r10, r2)     // Catch: java.lang.Throwable -> L4d
        L82:
            return
        L83:
            com.bytedance.sdk.openadsdk.api.m.j(r9)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r9, android.os.Bundle r10) {
            r8 = this;
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_pangle"
            java.lang.String r1 = "mActive"
            android.app.Fragment r2 = r8.j
            android.app.Activity r2 = r2.getActivity()
            if (r2 == r9) goto Le
            goto L82
        Le:
            java.lang.String r9 = "android:fragments"
            android.os.Parcelable r9 = r10.getParcelable(r9)     // Catch: java.lang.Throwable -> L4d
            if (r9 != 0) goto L18
            goto L82
        L18:
            java.lang.Object r10 = com.bytedance.pangle.util.FieldUtils.readField(r9, r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch: java.lang.Throwable -> L4d
            if (r10 != 0) goto L21
            goto L82
        L21:
            int r2 = r10.length     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            r4 = 0
        L24:
            if (r4 >= r2) goto L52
            r5 = r10[r4]     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = "mTag"
            java.lang.Object r6 = com.bytedance.pangle.util.FieldUtils.readField(r5, r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r7 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_plugin"
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L37
            goto L53
        L37:
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L4f
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L4d
            boolean r7 = r7.contains(r0)     // Catch: java.lang.Throwable -> L4d
            if (r7 != 0) goto L53
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L4d
            boolean r6 = r6.contains(r0)     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L4f
            goto L53
        L4d:
            r9 = move-exception
            goto L83
        L4f:
            int r4 = r4 + 1
            goto L24
        L52:
            r5 = 0
        L53:
            if (r5 == 0) goto L82
            java.lang.String r0 = "android.app.FragmentState"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4d
            int r2 = r10.length     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 + (-1)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> L4d
            int r2 = r10.length     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 + (-1)
            int[] r2 = new int[r2]     // Catch: java.lang.Throwable -> L4d
            r4 = 0
        L6a:
            int r6 = r10.length     // Catch: java.lang.Throwable -> L4d
            if (r3 >= r6) goto L7a
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L4d
            if (r6 == r5) goto L77
            r0[r4] = r6     // Catch: java.lang.Throwable -> L4d
            r2[r4] = r3     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + 1
        L77:
            int r3 = r3 + 1
            goto L6a
        L7a:
            com.bytedance.pangle.util.FieldUtils.writeField(r9, r1, r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r10 = "mAdded"
            com.bytedance.pangle.util.FieldUtils.writeField(r9, r10, r2)     // Catch: java.lang.Throwable -> L4d
        L82:
            return
        L83:
            com.bytedance.sdk.openadsdk.api.m.j(r9)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
