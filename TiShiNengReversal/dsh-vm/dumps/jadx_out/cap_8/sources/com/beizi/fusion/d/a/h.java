package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    com.beizi.fusion.d.b.e f7594b;

    /* renamed from: c, reason: collision with root package name */
    android.content.ServiceConnection f7595c;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f7596d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f7597e;


    public h(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "OUID"
            r1.a = r0
            com.beizi.fusion.d.a.h$1 r0 = new com.beizi.fusion.d.a.h$1
            r0.<init>(r1)
            r1.f7595c = r0
            r1.f7596d = r2
            return
    }

    private java.lang.String a(java.lang.String r10) {
            r9 = this;
            android.content.Context r0 = r9.f7596d
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = r9.f7597e
            if (r1 != 0) goto L58
            r1 = 0
            android.content.Context r2 = r9.f7596d     // Catch: java.lang.Exception -> L1a
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L1a
            r3 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r3)     // Catch: java.lang.Exception -> L1a
            android.content.pm.Signature[] r2 = r2.signatures     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r2 = r1
        L1c:
            if (r2 == 0) goto L56
            int r3 = r2.length
            if (r3 <= 0) goto L56
            r3 = 0
            r2 = r2[r3]
            byte[] r2 = r2.toByteArray()
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L56
            byte[] r2 = r4.digest(r2)     // Catch: java.lang.Exception -> L56
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56
            r4.<init>()     // Catch: java.lang.Exception -> L56
            int r5 = r2.length     // Catch: java.lang.Exception -> L56
        L3a:
            if (r3 >= r5) goto L52
            r6 = r2[r3]     // Catch: java.lang.Exception -> L56
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | 256(0x100, float:3.59E-43)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.Exception -> L56
            r7 = 3
            r8 = 1
            java.lang.String r6 = r6.substring(r8, r7)     // Catch: java.lang.Exception -> L56
            r4.append(r6)     // Catch: java.lang.Exception -> L56
            int r3 = r3 + 1
            goto L3a
        L52:
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L56
        L56:
            r9.f7597e = r1
        L58:
            com.beizi.fusion.d.b.e r1 = r9.f7594b
            com.beizi.fusion.d.b.e$a$a r1 = (com.beizi.fusion.d.b.e.a.C0129a) r1
            java.lang.String r2 = r9.f7597e
            java.lang.String r10 = r1.a(r0, r2, r10)
            return r10
    }

    public java.lang.String a(com.beizi.fusion.d.a.b.a r5) {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L44
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)
            android.content.Context r1 = r4.f7596d
            android.content.ServiceConnection r2 = r4.f7595c
            r3 = 1
            boolean r0 = r1.bindService(r0, r2, r3)
            if (r0 == 0) goto L42
            r0 = 3000(0xbb8, double:1.482E-320)
            android.os.SystemClock.sleep(r0)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
        L32:
            com.beizi.fusion.d.b.e r0 = r4.f7594b
            if (r0 == 0) goto L42
            java.lang.String r0 = "OUID"
            java.lang.String r0 = r4.a(r0)
            if (r5 == 0) goto L43
            r5.a(r0)
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
        L44:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot run on MainThread"
            r5.<init>(r0)
            throw r5
    }
}
