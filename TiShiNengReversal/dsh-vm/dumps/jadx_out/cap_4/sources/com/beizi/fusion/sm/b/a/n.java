package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class n implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;
    private java.lang.String b;


    public n(android.content.Context r2) {
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

    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    private java.lang.String a(android.os.IBinder r9) throws android.content.pm.PackageManager.NameNotFoundException, java.security.NoSuchAlgorithmException, android.os.RemoteException, com.beizi.fusion.sm.b.d {
            r8 = this;
            android.content.Context r0 = r8.a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = r8.b
            if (r1 != 0) goto L52
            android.content.Context r1 = r8.a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r0, r2)
            android.content.pm.Signature[] r1 = r1.signatures
            r2 = 0
            r1 = r1[r2]
            byte[] r1 = r1.toByteArray()
            java.lang.String r3 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            byte[] r1 = r3.digest(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r1.length
        L2f:
            if (r2 >= r4) goto L47
            r5 = r1[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | 256(0x100, float:3.59E-43)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r6 = 3
            r7 = 1
            java.lang.String r5 = r5.substring(r7, r6)
            r3.append(r5)
            int r2 = r2 + 1
            goto L2f
        L47:
            java.lang.String r1 = r3.toString()
            r8.b = r1
            java.lang.String r9 = r8.a(r9, r0, r1)
            return r9
        L52:
            java.lang.String r9 = r8.a(r9, r0, r1)
            return r9
    }

    private java.lang.String a(android.os.IBinder r2, java.lang.String r3, java.lang.String r4) throws android.os.RemoteException, com.beizi.fusion.sm.b.d {
            r1 = this;
            com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID r2 = com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID.Stub.asInterface(r2)
            if (r2 == 0) goto Ld
            java.lang.String r0 = "OUID"
            java.lang.String r2 = r2.getSerID(r3, r4, r0)
            return r2
        Ld:
            com.beizi.fusion.sm.b.d r2 = new com.beizi.fusion.sm.b.d
            java.lang.String r3 = "IOpenID is null"
            r2.<init>(r3)
            throw r2
    }

    static /* synthetic */ java.lang.String a(com.beizi.fusion.sm.b.a.n r0, android.os.IBinder r1) throws android.content.pm.PackageManager.NameNotFoundException, java.security.NoSuchAlgorithmException, android.os.RemoteException, com.beizi.fusion.sm.b.d {
            java.lang.String r0 = r0.a(r1)
            return r0
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r5) {
            r4 = this;
            android.content.Context r0 = r4.a
            if (r0 == 0) goto L24
            if (r5 != 0) goto L7
            goto L24
        L7:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            android.content.Context r1 = r4.a
            com.beizi.fusion.sm.b.a.n$1 r2 = new com.beizi.fusion.sm.b.a.n$1
            r2.<init>(r4)
            com.beizi.fusion.sm.b.a.m.a(r1, r0, r5, r2)
        L24:
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
            java.lang.String r2 = "com.heytap.openid"
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
