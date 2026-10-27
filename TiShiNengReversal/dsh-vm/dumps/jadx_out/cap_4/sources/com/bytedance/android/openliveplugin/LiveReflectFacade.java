package com.bytedance.android.openliveplugin;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveReflectFacade {
    public LiveReflectFacade() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addLiveInitListener(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.bytedance.android.live.base.api.ILiveInitCallback
            if (r0 == 0) goto L9
            com.bytedance.android.live.base.api.ILiveInitCallback r1 = (com.bytedance.android.live.base.api.ILiveInitCallback) r1
            com.bytedance.android.openliveplugin.LivePluginHelper.addInitListener(r1)
        L9:
            return
    }

    public static com.bytedance.android.live.base.api.IOuterLiveService getOuterLiveService() {
            java.lang.String r0 = "com.byted.live.lite"
            java.lang.ClassLoader r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r0)
            r1 = 0
            java.lang.String r2 = "com.bytedance.android.openlive.plugin.LivePluginFacade"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r2, r3, r0)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = "getOuterLiveRoomService"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Exception -> L1b
            com.bytedance.android.live.base.api.IOuterLiveService r0 = (com.bytedance.android.live.base.api.IOuterLiveService) r0     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            return r1
    }

    public static void initLiveInPlugin(android.app.Application r3, java.lang.String r4, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r5, boolean r6, com.bytedance.android.live.base.api.ILiveInitCallback r7) {
            java.lang.String r0 = "com.byted.live.lite"
            java.lang.ClassLoader r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            java.lang.String r3 = "com.bytedance.android.openlive.plugin.LivePluginFacade"
            java.lang.String r4 = "initLiveInPlugin"
            com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r3, r4, r0, r1)
            return
    }

    public static void invokeLiveInitFailed(java.lang.String r1) {
            com.bytedance.android.openliveplugin.LivePluginHelper$LiveInitCallback r0 = com.bytedance.android.openliveplugin.LivePluginHelper.LiveInitCallback.INSTANCE
            r0.onLiveInitFailed(r1)
            return
    }

    public static void invokeLiveInitSuccess() {
            com.bytedance.android.openliveplugin.LivePluginHelper$LiveInitCallback r0 = com.bytedance.android.openliveplugin.LivePluginHelper.LiveInitCallback.INSTANCE
            r0.onLiveInitFinish()
            return
    }
}
