package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> a;

    /* renamed from: b, reason: collision with root package name */
    android.content.ServiceConnection f7598b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f7599c;


    public i(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            com.beizi.fusion.d.a.i$1 r0 = new com.beizi.fusion.d.a.i$1
            r0.<init>(r2)
            r2.f7598b = r0
            r2.f7599c = r3
            return
    }

    public void a(com.beizi.fusion.d.a.b.a r5) {
            r4 = this;
            java.lang.String r0 = "com.samsung.android.deviceidservice"
            android.content.Context r1 = r4.f7599c     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Ld
            r2 = 0
            r1.getPackageInfo(r0, r2)     // Catch: java.lang.Exception -> Ld
            goto Le
        Ld:
        Le:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.samsung.android.deviceidservice.DeviceIdService"
            r1.setClassName(r0, r2)
            android.content.Context r0 = r4.f7599c
            android.content.ServiceConnection r2 = r4.f7598b
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)
            if (r0 == 0) goto L39
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.a     // Catch: java.lang.Exception -> L39
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Exception -> L39
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Exception -> L39
            com.beizi.fusion.d.b.f$a r1 = new com.beizi.fusion.d.b.f$a     // Catch: java.lang.Exception -> L39
            r1.<init>(r0)     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r1.a()     // Catch: java.lang.Exception -> L39
            if (r5 == 0) goto L39
            r5.a(r0)     // Catch: java.lang.Exception -> L39
        L39:
            return
    }
}
