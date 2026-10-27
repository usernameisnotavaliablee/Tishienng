package com.bytedance.msdk.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Object j(android.content.Context r2) {
            if (r2 == 0) goto L22
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.Class<com.bytedance.pangle.wrapper.PluginActivityWrapper> r1 = com.bytedance.pangle.wrapper.PluginActivityWrapper.class
            if (r0 != r1) goto L10
            r0 = r2
            com.bytedance.pangle.wrapper.PluginActivityWrapper r0 = (com.bytedance.pangle.wrapper.PluginActivityWrapper) r0     // Catch: java.lang.Throwable -> L22
            android.app.Activity r0 = r0.mOriginActivity     // Catch: java.lang.Throwable -> L22
            goto L1f
        L10:
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.Class<com.bytedance.pangle.wrapper.PluginApplicationWrapper> r1 = com.bytedance.pangle.wrapper.PluginApplicationWrapper.class
            if (r0 != r1) goto L1e
            r0 = r2
            com.bytedance.pangle.wrapper.PluginApplicationWrapper r0 = (com.bytedance.pangle.wrapper.PluginApplicationWrapper) r0     // Catch: java.lang.Throwable -> L22
            android.app.Application r0 = r0.mOriginApplication     // Catch: java.lang.Throwable -> L22
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            return r0
        L22:
            return r2
    }
}
