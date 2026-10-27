package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> a;

    /* renamed from: b, reason: collision with root package name */
    android.content.ServiceConnection f7586b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f7587c;


    public c(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            com.beizi.fusion.d.a.c$1 r0 = new com.beizi.fusion.d.a.c$1
            r0.<init>(r2)
            r2.f7586b = r0
            r2.f7587c = r3
            return
    }

    public void a(com.beizi.fusion.d.a.b.a r5) {
            r4 = this;
            java.lang.String r0 = "com.huawei.hwid"
            android.content.Context r1 = r4.f7587c     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Ld
            r2 = 0
            r1.getPackageInfo(r0, r2)     // Catch: java.lang.Exception -> Ld
            goto Le
        Ld:
        Le:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.uodis.opendevice.OPENIDS_SERVICE"
            r1.<init>(r2)
            r1.setPackage(r0)
            android.content.Context r0 = r4.f7587c
            android.content.ServiceConnection r2 = r4.f7586b
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)
            if (r0 == 0) goto L4f
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.a     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            com.beizi.fusion.d.b.b$a r1 = new com.beizi.fusion.d.b.b$a     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r0 = r1.a()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.b()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r5 == 0) goto L3f
            r5.a(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            goto L3f
        L3d:
            r5 = move-exception
            goto L47
        L3f:
            android.content.Context r5 = r4.f7587c
            android.content.ServiceConnection r0 = r4.f7586b
            r5.unbindService(r0)
            goto L4f
        L47:
            android.content.Context r0 = r4.f7587c
            android.content.ServiceConnection r1 = r4.f7586b
            r0.unbindService(r1)
            throw r5
        L4f:
            return
    }
}
