package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f7605b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> f7606c;

    /* renamed from: d, reason: collision with root package name */
    android.content.ServiceConnection f7607d;


    public l(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "com.mdid.msa"
            r2.f7605b = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.f7606c = r0
            com.beizi.fusion.d.a.l$1 r0 = new com.beizi.fusion.d.a.l$1
            r0.<init>(r2)
            r2.f7607d = r0
            r2.a = r3
            return
    }

    private int a() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.a     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Ld
            java.lang.String r2 = r3.f7605b     // Catch: java.lang.Exception -> Ld
            r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> Ld
            r0 = 1
        Ld:
            return r0
    }

    private void a(java.lang.String r4) {
            r3 = this;
            r3.a()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r3.f7605b
            java.lang.String r2 = "com.mdid.msa.service.MsaKlService"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "com.bun.msa.action.start.service"
            r0.setAction(r1)
            java.lang.String r1 = "com.bun.msa.param.pkgname"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "com.bun.msa.param.runinset"
            r1 = 1
            r0.putExtra(r4, r1)     // Catch: java.lang.Exception -> L24
            android.content.Context r4 = r3.a     // Catch: java.lang.Exception -> L24
            r4.startService(r0)     // Catch: java.lang.Exception -> L24
        L24:
            return
    }

    public void a(com.beizi.fusion.d.a.b.a r5) {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> Ld
            java.lang.String r1 = r4.f7605b     // Catch: java.lang.Exception -> Ld
            r2 = 0
            r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> Ld
            goto Le
        Ld:
        Le:
            android.content.Context r0 = r4.a
            java.lang.String r0 = r0.getPackageName()
            r4.a(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.mdid.msa"
            java.lang.String r3 = "com.mdid.msa.service.MsaIdService"
            r1.setClassName(r2, r3)
            java.lang.String r2 = "com.bun.msa.action.bindto.service"
            r1.setAction(r2)
            java.lang.String r2 = "com.bun.msa.param.pkgname"
            r1.putExtra(r2, r0)
            android.content.Context r0 = r4.a
            android.content.ServiceConnection r2 = r4.f7607d
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)
            if (r0 == 0) goto L5a
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.f7606c     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            com.beizi.fusion.d.b.g$a$a r1 = new com.beizi.fusion.d.b.g$a$a     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            java.lang.String r0 = r1.a()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            if (r5 == 0) goto L51
            r5.a(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            goto L51
        L4f:
            r5 = move-exception
            goto L59
        L51:
            android.content.Context r5 = r4.a     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            android.content.ServiceConnection r0 = r4.f7607d     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            r5.unbindService(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L5a
            goto L5a
        L59:
            throw r5
        L5a:
            return
    }
}
