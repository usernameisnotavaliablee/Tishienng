package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    com.beizi.fusion.d.b.c a;

    /* renamed from: b, reason: collision with root package name */
    android.content.ServiceConnection f7588b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f7589c;


    public d(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.beizi.fusion.d.a.d$1 r0 = new com.beizi.fusion.d.a.d$1
            r0.<init>(r1)
            r1.f7588b = r0
            r1.f7589c = r2
            return
    }

    public void a(com.beizi.fusion.d.a.b.a r5) {
            r4 = this;
            android.content.Context r0 = r4.f7589c
            r0.getPackageName()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.zui.deviceidservice"
            java.lang.String r2 = "com.zui.deviceidservice.DeviceidService"
            r0.setClassName(r1, r2)
            android.content.Context r1 = r4.f7589c
            android.content.ServiceConnection r2 = r4.f7588b
            r3 = 1
            boolean r0 = r1.bindService(r0, r2, r3)
            if (r0 == 0) goto L29
            com.beizi.fusion.d.b.c r0 = r4.a
            if (r0 == 0) goto L29
            java.lang.String r0 = r0.a()
            if (r5 == 0) goto L29
            r5.a(r0)
        L29:
            return
    }
}
