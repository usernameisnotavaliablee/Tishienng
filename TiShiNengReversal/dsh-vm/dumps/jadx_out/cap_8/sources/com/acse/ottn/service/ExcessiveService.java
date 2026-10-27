package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ExcessiveService extends android.app.Service {
    public static java.lang.String a = "DemoService";

    static {
            r0 = 10047(0x273f, float:1.4079E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ExcessiveService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "open_battery_white"
            java.lang.String r1 = "sessionID"
            if (r5 == 0) goto L4c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L45
            r3 = 28
            if (r2 < r3) goto L4c
            com.acse.ottn.n1 r2 = com.acse.ottn.n1.a()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = r2.d(r1)     // Catch: java.lang.Exception -> L45
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L45
            if (r3 != 0) goto L2b
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L45
            r3.b(r1, r2)     // Catch: java.lang.Exception -> L45
            com.acse.ottn.n1 r2 = com.acse.ottn.n1.a()     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = ""
            r2.b(r1, r3)     // Catch: java.lang.Exception -> L45
            goto L31
        L2b:
            com.acse.ottn.util.HelpShopAppUtil.getInstance()     // Catch: java.lang.Exception -> L45
            com.acse.ottn.util.HelpShopAppUtil.sessionExID()     // Catch: java.lang.Exception -> L45
        L31:
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.a()     // Catch: java.lang.Exception -> L45
            boolean r1 = r1.a(r0)     // Catch: java.lang.Exception -> L45
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L45
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L45
            r2.a(r0, r1)     // Catch: java.lang.Exception -> L45
            goto L4c
        L45:
            java.lang.String r0 = com.acse.ottn.service.ExcessiveService.a
            java.lang.String r1 = "request code fail "
            com.acse.ottn.h2.b(r0, r1)
        L4c:
            r4.stopSelf()
            int r5 = super.onStartCommand(r5, r6, r7)
            return r5
    }
}
