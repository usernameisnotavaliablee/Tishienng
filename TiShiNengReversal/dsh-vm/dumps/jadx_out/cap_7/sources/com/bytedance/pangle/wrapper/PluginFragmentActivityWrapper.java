package com.bytedance.pangle.wrapper;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PluginFragmentActivityWrapper extends com.bytedance.pangle.wrapper.GenerateFragmentActivityWrapper {
    boolean hasInit;


    public PluginFragmentActivityWrapper(android.app.Activity r4, com.bytedance.pangle.PluginContext r5) {
            r3 = this;
            java.lang.String r0 = "mBase"
            r3.<init>()
            r1 = 1
            r3.hasInit = r1
            r1 = r4
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            r3.mOriginActivity = r1
            r3.pluginContext = r5
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L21
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper$1 r2 = new com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper$1
            r2.<init>(r3)
            r1.registerActivityLifecycleCallbacks(r2)
        L21:
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r0, r5)     // Catch: java.lang.IllegalAccessException -> L34
            boolean r1 = com.bytedance.pangle.util.g.j()     // Catch: java.lang.IllegalAccessException -> L34
            if (r1 != 0) goto L38
            java.lang.Class<android.content.ContextWrapper> r1 = android.content.ContextWrapper.class
            java.lang.reflect.Field r0 = com.bytedance.pangle.util.FieldUtils.getField(r1, r0)     // Catch: java.lang.IllegalAccessException -> L34
            com.bytedance.pangle.util.FieldUtils.writeField(r0, r3, r5)     // Catch: java.lang.IllegalAccessException -> L34
            goto L38
        L34:
            r5 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r5)
        L38:
            java.lang.String r5 = "mApplication"
            android.app.Application r0 = r4.getApplication()     // Catch: java.lang.IllegalAccessException -> L42
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r5, r0)     // Catch: java.lang.IllegalAccessException -> L42
            goto L46
        L42:
            r5 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r5)
        L46:
            com.bytedance.pangle.util.j.j(r3, r4)
            return
    }

    @Override // com.bytedance.pangle.wrapper.GenerateFragmentActivityWrapper
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r3 = this;
            boolean r0 = r3.hasInit
            if (r0 != 0) goto L1b
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<androidx.lifecycle.LifecycleRegistry> r1 = androidx.lifecycle.LifecycleRegistry.class
            java.lang.String r2 = "mEnforceMainThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1a
            r1.set(r0, r2)     // Catch: java.lang.Throwable -> L1a
        L1a:
            return r0
        L1b:
            androidx.lifecycle.Lifecycle r0 = super.getLifecycle()
            return r0
    }

    public android.app.Activity getOriginActivity() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            return r0
    }
}
