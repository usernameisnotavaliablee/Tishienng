package com.bytedance.android.openliveplugin.process.server;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveServerManager extends com.bytedance.android.dy.sdk.pangle.ZeusPlatformServerManager {
    public LiveServerManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean onCreate() {
            r3 = this;
            java.lang.String r0 = "LiveServerManager onCreate"
            com.bytedance.android.openliveplugin.stub.logger.TTLogger.d(r0)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L2d
            android.content.Context r0 = r3.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L2d
            java.lang.String r1 = "LiveServerManager initZeus"
            com.bytedance.android.openliveplugin.stub.logger.TTLogger.d(r1)     // Catch: java.lang.Throwable -> L29
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "com.byted.live.lite"
            r2 = 1
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.initZeus(r0, r2, r1)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        L2d:
            boolean r0 = super.onCreate()
            return r0
    }
}
