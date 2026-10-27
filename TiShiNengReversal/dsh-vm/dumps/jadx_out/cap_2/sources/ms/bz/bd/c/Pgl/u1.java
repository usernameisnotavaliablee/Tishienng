package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u1 {
    private final android.content.Context a;

    public u1(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.lang.String a() {
            r9 = this;
            r0 = 51
            byte[] r6 = new byte[r0]
            r6 = {x006e: FILL_ARRAY_DATA , data: [42, 105, 77, 81, 94, 32, 47, 31, 46, 46, 42, 105, 78, 11, 77, 39, 45, 74, 47, 119, 36, 117, 13, 108, 95, 30, 41, 74, 119, 104, 45, 99, 81, 10, 114, 42, 62, 75, 117, 104, 47, 111, 70, 87, 114, 42, 116, 106, 64, 72, 13} // fill-array
            r3 = 0
            java.lang.String r5 = "8d01d9"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r9.a
            android.content.ContentResolver r1 = r0.getContentResolver()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
            r0 = 0
            if (r1 == 0) goto L67
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L67
            java.lang.String r7 = "0cfef0"
            r2 = 5
            byte[] r8 = new byte[r2]     // Catch: java.lang.Throwable -> L4d
            r8 = {x008c: FILL_ARRAY_DATA , data: [55, 96, 25, 4, 92} // fill-array     // Catch: java.lang.Throwable -> L4d
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r1.getString(r2)     // Catch: java.lang.Throwable -> L4d
            goto L67
        L4d:
            java.lang.String r6 = "028b9f"
            r2 = 2
            byte[] r7 = new byte[r2]     // Catch: java.lang.Throwable -> L62
            r7 = {x0094: FILL_ARRAY_DATA , data: [55, 63} // fill-array     // Catch: java.lang.Throwable -> L62
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L62
            r1.close()     // Catch: java.lang.Throwable -> L6c
            goto L6c
        L62:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L66
        L66:
            throw r0
        L67:
            if (r1 == 0) goto L6c
            r1.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            return r0
    }
}
