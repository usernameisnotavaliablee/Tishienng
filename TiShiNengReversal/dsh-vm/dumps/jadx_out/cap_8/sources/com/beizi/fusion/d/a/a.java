package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> a;

    /* renamed from: b, reason: collision with root package name */
    android.content.ServiceConnection f7583b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f7584c;


    public a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            com.beizi.fusion.d.a.a$1 r0 = new com.beizi.fusion.d.a.a$1
            r0.<init>(r2)
            r2.f7583b = r0
            r2.f7584c = r3
            return
    }

    public void a(com.beizi.fusion.d.a.b.a r5) {
            r4 = this;
            java.lang.String r0 = "com.asus.msa.SupplementaryDID"
            android.content.Context r1 = r4.f7584c     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Ld
            r2 = 0
            r1.getPackageInfo(r0, r2)     // Catch: java.lang.Exception -> Ld
            goto Le
        Ld:
        Le:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.asus.msa.action.ACCESS_DID"
            r1.setAction(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.asus.msa.SupplementaryDID.SupplementaryDIDService"
            r2.<init>(r0, r3)
            r1.setComponent(r2)
            android.content.Context r0 = r4.f7584c
            android.content.ServiceConnection r2 = r4.f7583b
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)
            if (r0 == 0) goto L43
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.a     // Catch: java.lang.Exception -> L43
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Exception -> L43
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Exception -> L43
            com.beizi.fusion.d.b.a$a r1 = new com.beizi.fusion.d.b.a$a     // Catch: java.lang.Exception -> L43
            r1.<init>(r0)     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = r1.a()     // Catch: java.lang.Exception -> L43
            if (r5 == 0) goto L43
            r5.a(r0)     // Catch: java.lang.Exception -> L43
        L43:
            return
    }
}
