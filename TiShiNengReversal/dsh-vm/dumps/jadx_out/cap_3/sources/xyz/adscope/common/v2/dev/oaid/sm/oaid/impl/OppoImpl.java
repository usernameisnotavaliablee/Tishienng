package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class OppoImpl implements xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID {
    private final android.content.Context context;
    private java.lang.String sign;


    public OppoImpl(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto La
            r1.context = r2
            return
        La:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.context = r2
            return
    }

    static /* synthetic */ java.lang.String access$000(xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OppoImpl r0, android.os.IBinder r1) {
            java.lang.String r0 = r0.realGetOUID(r1)
            return r0
    }

    private java.lang.String getSerId(android.os.IBinder r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.heytap.openid.IOpenID r2 = xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.heytap.openid.IOpenID.Stub.asInterface(r2)
            if (r2 == 0) goto Ld
            java.lang.String r0 = "OUID"
            java.lang.String r2 = r2.getSerID(r3, r4, r0)
            return r2
        Ld:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r2 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException
            java.lang.String r3 = "IOpenID is null"
            r2.<init>(r3)
            throw r2
    }

    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    private java.lang.String realGetOUID(android.os.IBinder r9) {
            r8 = this;
            android.content.Context r0 = r8.context
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = r8.sign
            if (r1 != 0) goto L52
            android.content.Context r1 = r8.context
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
            r8.sign = r1
            java.lang.String r9 = r8.getSerId(r9, r0, r1)
            return r9
        L52:
            java.lang.String r9 = r8.getSerId(r9, r0, r1)
            return r9
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public void doGet(xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r5) {
            r4 = this;
            android.content.Context r0 = r4.context
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
            android.content.Context r1 = r4.context
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OppoImpl$1 r2 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OppoImpl$1
            r2.<init>(r4)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService.bind(r1, r0, r5, r2)
        L24:
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public boolean supported() {
            r3 = this;
            android.content.Context r0 = r3.context
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
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            return r1
    }
}
