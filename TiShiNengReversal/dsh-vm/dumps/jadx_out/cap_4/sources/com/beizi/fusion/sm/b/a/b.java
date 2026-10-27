package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;


    public b(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto La
            r1.a = r2
            return
        La:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.beizi.fusion.sm.b.a.b r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r5) {
            r4 = this;
            android.content.Context r0 = r4.a
            if (r0 == 0) goto L22
            if (r5 != 0) goto L7
            goto L22
        L7:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.coolpad.deviceidsupport"
            java.lang.String r3 = "com.coolpad.deviceidsupport.DeviceIdService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            android.content.Context r1 = r4.a
            com.beizi.fusion.sm.b.a.b$1 r2 = new com.beizi.fusion.sm.b.a.b$1
            r2.<init>(r4)
            com.beizi.fusion.sm.b.a.m.a(r1, r0, r5, r2)
        L22:
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public boolean a() {
            r3 = this;
            android.content.Context r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "com.coolpad.deviceidsupport"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            return r1
        L15:
            r0 = move-exception
            com.beizi.fusion.sm.b.e.a(r0)
            return r1
    }
}
