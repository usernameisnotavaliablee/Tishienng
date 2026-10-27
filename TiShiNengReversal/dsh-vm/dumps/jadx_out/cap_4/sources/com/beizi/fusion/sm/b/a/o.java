package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class o implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;


    public o(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r4) {
            r3 = this;
            android.content.Context r0 = r3.a
            if (r0 == 0) goto L1d
            if (r4 != 0) goto L7
            goto L1d
        L7:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.samsung.android.deviceidservice"
            java.lang.String r2 = "com.samsung.android.deviceidservice.DeviceIdService"
            r0.setClassName(r1, r2)
            android.content.Context r1 = r3.a
            com.beizi.fusion.sm.b.a.o$1 r2 = new com.beizi.fusion.sm.b.a.o$1
            r2.<init>(r3)
            com.beizi.fusion.sm.b.a.m.a(r1, r0, r4, r2)
        L1d:
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
            java.lang.String r2 = "com.samsung.android.deviceidservice"
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
