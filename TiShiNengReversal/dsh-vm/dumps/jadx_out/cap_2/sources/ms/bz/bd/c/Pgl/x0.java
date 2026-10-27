package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x0 {
    private final android.content.Context a;

    public x0(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static java.lang.String a(android.database.Cursor r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isClosed()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r8.moveToFirst()
            r1 = 5
            byte[] r7 = new byte[r1]
            r7 = {x0068: FILL_ARRAY_DATA , data: [49, 97, 74, 0, 2} // fill-array
            r4 = 0
            java.lang.String r6 = "6b5a83"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r8.getColumnIndex(r1)
            if (r1 <= 0) goto L2c
            java.lang.String r0 = r8.getString(r1)
        L2c:
            r1 = 4
            byte[] r7 = new byte[r1]
            r7 = {x0070: FILL_ARRAY_DATA , data: [34, 63, 78, 73} // fill-array
            r4 = 0
            java.lang.String r6 = "0298fd"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r8.getColumnIndex(r1)
            if (r1 <= 0) goto L49
            r8.getInt(r1)
        L49:
            r1 = 7
            byte[] r7 = new byte[r1]
            r7 = {x0076: FILL_ARRAY_DATA , data: [34, 126, 86, 78, 20, 37, 49} // fill-array
            r4 = 0
            java.lang.String r6 = "6d5397"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r8.getColumnIndex(r1)
            if (r1 <= 0) goto L66
            r8.getLong(r1)
        L66:
            return r0
    }

    public final void b(ms.bz.bd.c.Pgl.pblk.pblb r10) {
            r9 = this;
            android.content.Context r0 = r9.a     // Catch: java.lang.Exception -> L1f
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = "ab4aa7"
            r1 = 25
            byte[] r6 = new byte[r1]     // Catch: java.lang.Exception -> L1f
            r6 = {x0074: FILL_ARRAY_DATA , data: [115, 111, 74, 91, 83, 37, 107, 89, 112, 127, 118, 108, 94, 24, 91, 110, 109, 83, 96, 63, 121, 100, 84, 17, 85} // fill-array     // Catch: java.lang.Exception -> L1f
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L1f
            r2 = 0
            r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L1f
        L1f:
            r0 = 36
            byte[] r6 = new byte[r0]
            r6 = {x0086: FILL_ARRAY_DATA , data: [42, 63, 68, 83, 2, 40, 47, 73, 39, 44, 42, 63, 71, 9, 10, 35, 50, 9, 125, 45, 47, 60, 83, 74, 2, 104, 52, 3, 109, 109, 32, 52, 89, 67, 12, 105} // fill-array
            r3 = 0
            java.lang.String r5 = "829381"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r9.a
            android.content.ContentResolver r1 = r0.getContentResolver()
            java.lang.String r7 = "0f7560"
            r0 = 4
            byte[] r8 = new byte[r0]     // Catch: java.lang.Throwable -> L6c
            r8 = {x009c: FILL_ARRAY_DATA , data: [46, 101, 77, 69} // fill-array     // Catch: java.lang.Throwable -> L6c
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L6c
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L6c
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = a(r0)     // Catch: java.lang.Throwable -> L67
            if (r10 == 0) goto L69
            r10.j(r1)     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            goto L6d
        L69:
            if (r0 == 0) goto L72
            goto L6f
        L6c:
            r0 = 0
        L6d:
            if (r0 == 0) goto L72
        L6f:
            r0.close()
        L72:
            return
    }
}
