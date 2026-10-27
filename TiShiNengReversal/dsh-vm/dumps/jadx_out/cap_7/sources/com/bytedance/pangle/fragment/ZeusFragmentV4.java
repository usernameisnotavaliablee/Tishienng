package com.bytedance.pangle.fragment;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ZeusFragmentV4 extends androidx.fragment.app.Fragment {
    android.app.Application.ActivityLifecycleCallbacks callbacks;

    public ZeusFragmentV4() {
            r1 = this;
            r1.<init>()
            com.bytedance.pangle.fragment.xt r0 = new com.bytedance.pangle.fragment.xt
            r0.<init>(r1)
            r1.callbacks = r0
            java.lang.Class r0 = r1.getClass()
            com.bytedance.pangle.fragment.j.j(r0)
            return
    }

    @androidx.annotation.Nullable
    public android.content.Context getContext() {
            r4 = this;
            android.content.Context r0 = super.getContext()     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a java.lang.NoSuchMethodException -> L1c
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a java.lang.NoSuchMethodException -> L1c
            java.lang.String r2 = "_GET_PLUGIN_PKG"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a java.lang.NoSuchMethodException -> L1c
            java.lang.Object r1 = com.bytedance.pangle.util.MethodUtils.invokeStaticMethod(r1, r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a java.lang.NoSuchMethodException -> L1c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a java.lang.NoSuchMethodException -> L1c
            android.content.Context r0 = com.bytedance.pangle.transform.ZeusTransformUtils.wrapperContext(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a java.lang.NoSuchMethodException -> L1c
            return r0
        L18:
            r0 = move-exception
            goto L1e
        L1a:
            r0 = move-exception
            goto L22
        L1c:
            r0 = move-exception
            goto L26
        L1e:
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            goto L29
        L22:
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            goto L29
        L26:
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        L29:
            android.content.Context r0 = super.getContext()
            return r0
    }

    public void onAttach(android.content.Context r2) {
            r1 = this;
            super.onAttach(r2)
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()
            android.app.Application$ActivityLifecycleCallbacks r0 = r1.callbacks
            r2.registerActivityLifecycleCallbacks(r0)
            return
    }

    public void onDetach() {
            r2 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.callbacks
            r0.unregisterActivityLifecycleCallbacks(r1)
            super.onDetach()
            return
    }
}
