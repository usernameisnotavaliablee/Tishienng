package com.bytedance.pangle.wrapper;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PluginActivityWrapper extends com.bytedance.pangle.wrapper.GenerateActivityWrapper {
    private static final int OBJECT_TAG = Integer.MAX_VALUE;




    public PluginActivityWrapper(android.app.Activity r4, com.bytedance.pangle.PluginContext r5) {
            r3 = this;
            java.lang.String r0 = "mBase"
            r3.<init>()
            r3.mOriginActivity = r4
            r3.pluginContext = r5
            boolean r1 = r4.isDestroyed()     // Catch: java.lang.Exception -> L2c
            if (r1 != 0) goto L2f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2c
            r2 = 29
            if (r1 < r2) goto L20
            android.app.Activity r1 = r3.mOriginActivity     // Catch: java.lang.Exception -> L2c
            com.bytedance.pangle.wrapper.PluginActivityWrapper$1 r2 = new com.bytedance.pangle.wrapper.PluginActivityWrapper$1     // Catch: java.lang.Exception -> L2c
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2c
            androidx.lifecycle.j.a(r1, r2)     // Catch: java.lang.Exception -> L2c
            goto L2f
        L20:
            r2 = 24
            if (r1 < r2) goto L28
            r3.setTag()     // Catch: java.lang.Exception -> L2c
            goto L2f
        L28:
            r3.registerApplicationLifecycleCallbacks()     // Catch: java.lang.Exception -> L2c
            goto L2f
        L2c:
            r3.registerApplicationLifecycleCallbacks()
        L2f:
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r0, r5)     // Catch: java.lang.IllegalAccessException -> L41
            boolean r1 = com.bytedance.pangle.util.g.j()     // Catch: java.lang.IllegalAccessException -> L41
            if (r1 != 0) goto L41
            java.lang.Class<android.content.ContextWrapper> r1 = android.content.ContextWrapper.class
            java.lang.reflect.Field r0 = com.bytedance.pangle.util.FieldUtils.getField(r1, r0)     // Catch: java.lang.IllegalAccessException -> L41
            com.bytedance.pangle.util.FieldUtils.writeField(r0, r3, r5)     // Catch: java.lang.IllegalAccessException -> L41
        L41:
            java.lang.String r5 = "mApplication"
            android.app.Application r0 = r4.getApplication()     // Catch: java.lang.IllegalAccessException -> L4a
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r5, r0)     // Catch: java.lang.IllegalAccessException -> L4a
        L4a:
            com.bytedance.pangle.util.j.j(r3, r4)
            return
    }

    private void registerApplicationLifecycleCallbacks() {
            r2 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            if (r0 != 0) goto L7
            return
        L7:
            com.bytedance.pangle.wrapper.PluginActivityWrapper$2 r1 = new com.bytedance.pangle.wrapper.PluginActivityWrapper$2
            r1.<init>(r2, r0)
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }

    private void setTag() {
            r3 = this;
            android.app.Activity r0 = r3.mOriginActivity
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L9
            goto L18
        L9:
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto L10
            goto L18
        L10:
            com.bytedance.pangle.PluginContext r1 = r3.pluginContext
            java.lang.String r1 = r1.getPluginPackageName()
            if (r1 != 0) goto L19
        L18:
            return
        L19:
            int r1 = r1.hashCode()
            com.bytedance.pangle.wrapper.PluginActivityWrapper$3 r2 = new com.bytedance.pangle.wrapper.PluginActivityWrapper$3
            r2.<init>(r3)
            r0.setTag(r1, r2)
            return
    }
}
