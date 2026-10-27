package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVDrmCreater {
    public static final int DrmTypeIntertrust = 1;
    public static final int DrmTypeNone = 0;

    public AVDrmCreater() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static synchronized long createDrm(int r3) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.AVDrmCreater> r0 = com.bykv.vk.component.ttvideo.player.AVDrmCreater.class
            monitor-enter(r0)
            r1 = 1
            if (r3 != r1) goto L13
            java.lang.String r3 = "com.bykv.vk.component.ttvideo.drm.intertrust.IntertrustDrm"
            r1 = 100
            long r1 = createDrm(r1, r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
        L13:
            monitor-exit(r0)
            r0 = 0
            return r0
    }

    private static long createDrm(int r1, java.lang.String r2) {
            java.lang.ClassLoader r1 = com.bykv.vk.component.ttvideo.player.TTPlayerPluginLoader.loadPlugin(r1)     // Catch: java.lang.Exception -> L24
            if (r1 == 0) goto Lc
            r0 = 1
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.Exception -> L24
            goto L10
        Lc:
            java.lang.Class r1 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L24
        L10:
            java.lang.String r2 = "createDrm"
            r0 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L24
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L24
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L24
            return r1
        L24:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            r1 = 0
            return r1
    }
}
