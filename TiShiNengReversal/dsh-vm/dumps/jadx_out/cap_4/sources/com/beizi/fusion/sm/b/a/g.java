package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class g implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;
    private java.lang.String b;


    public g(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r4) {
            r3 = this;
            android.content.Context r0 = r3.a
            if (r0 == 0) goto L68
            if (r4 != 0) goto L7
            goto L68
        L7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L39
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "pps_oaid"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)     // Catch: java.lang.Exception -> L35
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r1.<init>()     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = "Get oaid from global settings: "
            r1.append(r2)     // Catch: java.lang.Exception -> L35
            r1.append(r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L35
            com.beizi.fusion.sm.b.e.a(r1)     // Catch: java.lang.Exception -> L35
            r4.a(r0)     // Catch: java.lang.Exception -> L35
            return
        L35:
            r0 = move-exception
            com.beizi.fusion.sm.b.e.a(r0)
        L39:
            java.lang.String r0 = r3.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L52
            boolean r0 = r3.a()
            if (r0 != 0) goto L52
            com.beizi.fusion.sm.b.d r0 = new com.beizi.fusion.sm.b.d
            java.lang.String r1 = "Huawei Advertising ID not available"
            r0.<init>(r1)
            r4.a(r0)
            return
        L52:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.uodis.opendevice.OPENIDS_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = r3.b
            r0.setPackage(r1)
            android.content.Context r1 = r3.a
            com.beizi.fusion.sm.b.a.g$1 r2 = new com.beizi.fusion.sm.b.a.g$1
            r2.<init>(r3)
            com.beizi.fusion.sm.b.a.m.a(r1, r0, r4, r2)
        L68:
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public boolean a() {
            r6 = this;
            java.lang.String r0 = "com.huawei.hwid.tv"
            java.lang.String r1 = "com.huawei.hwid"
            android.content.Context r2 = r6.a
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L18
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r1, r3)     // Catch: java.lang.Exception -> L18
            r5 = 1
            if (r4 == 0) goto L1a
            r6.b = r1     // Catch: java.lang.Exception -> L18
            return r5
        L18:
            r0 = move-exception
            goto L2f
        L1a:
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r0, r3)     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L23
            r6.b = r0     // Catch: java.lang.Exception -> L18
            return r5
        L23:
            java.lang.String r0 = "com.huawei.hms"
            r6.b = r0     // Catch: java.lang.Exception -> L18
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L2e
            return r5
        L2e:
            return r3
        L2f:
            com.beizi.fusion.sm.b.e.a(r0)
            return r3
    }
}
