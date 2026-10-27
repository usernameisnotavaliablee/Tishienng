package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private android.content.Context a;

    public e(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private java.lang.String a(android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.isClosed()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r3.moveToFirst()
            java.lang.String r1 = "value"
            int r1 = r3.getColumnIndex(r1)
            if (r1 <= 0) goto L1a
            java.lang.String r0 = r3.getString(r1)
        L1a:
            java.lang.String r1 = "code"
            int r1 = r3.getColumnIndex(r1)
            if (r1 <= 0) goto L25
            r3.getInt(r1)
        L25:
            java.lang.String r1 = "expired"
            int r1 = r3.getColumnIndex(r1)
            if (r1 <= 0) goto L30
            r3.getLong(r1)
        L30:
            return r0
    }

    public void a(com.beizi.fusion.d.a.b.a r8) {
            r7 = this;
            android.content.Context r0 = r7.a     // Catch: java.lang.Exception -> Lc
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> Lc
            java.lang.String r1 = "com.meizu.flyme.openidsdk"
            r2 = 0
            r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> Lc
        Lc:
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r7.a
            android.content.ContentResolver r1 = r0.getContentResolver()
            java.lang.String r0 = "oaid"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L31
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r7.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L2e
            r8.a(r1)     // Catch: java.lang.Throwable -> L31
        L2e:
            r0.close()     // Catch: java.lang.Throwable -> L31
        L31:
            return
    }
}
