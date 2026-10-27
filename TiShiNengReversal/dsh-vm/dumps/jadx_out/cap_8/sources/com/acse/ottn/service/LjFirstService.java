package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LjFirstService extends android.app.Service {

    /* renamed from: b, reason: collision with root package name */
    public static android.view.View f2675b = null;

    /* renamed from: c, reason: collision with root package name */
    public static android.view.WindowManager f2676c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f2677d = "LjFirstService";
    public android.content.Intent a;

    static {
            r0 = 10048(0x2740, float:1.408E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public LjFirstService() {
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
            r1 = this;
            super.onCreate()
            com.acse.ottn.e2 r0 = com.acse.ottn.e2.a()
            r0.a(r1)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.acse.ottn.e2 r0 = com.acse.ottn.e2.a()
            r0.b(r1)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "model"
            java.io.Serializable r0 = r5.getSerializableExtra(r0)     // Catch: java.lang.Exception -> L18
            com.acse.ottn.model.AccessiblityModel r0 = (com.acse.ottn.model.AccessiblityModel) r0     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L33
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r0.getData()     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L33
            com.acse.ottn.e2 r1 = com.acse.ottn.e2.a()     // Catch: java.lang.Exception -> L18
            r1.a(r4, r0)     // Catch: java.lang.Exception -> L18
            goto L33
        L18:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.service.LjFirstService.f2677d     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r2.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = "Exception ="
            r2.append(r3)     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Exception -> L33
            r2.append(r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L33
            com.acse.ottn.h2.a(r1, r0)     // Catch: java.lang.Exception -> L33
        L33:
            int r5 = super.onStartCommand(r5, r6, r7)
            return r5
    }
}
