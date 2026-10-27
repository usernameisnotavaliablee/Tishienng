package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class StartProcreeService extends android.app.Service {
    public StartProcreeService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Not yet implemented"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = "samon-->"
            java.lang.String r1 = "启动StartProcreeService"
            com.acse.ottn.h2.a(r0, r1)
            return
    }
}
