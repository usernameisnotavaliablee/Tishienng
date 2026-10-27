package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z0 {
    private final android.content.Context a;

    public z0(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.lang.String a() {
            r17 = this;
            r0 = 36
            byte[] r6 = new byte[r0]
            r6 = {x009e: FILL_ARRAY_DATA , data: [36, 58, 31, 89, 11, 127, 33, 76, 124, 38, 36, 59, 95, 67, 27, 115, 60, 23, 125, 96, 35, 48, 31, 89, 7, 101, 44, 89, 58, 109, 34, 59, 5, 68, 26, 104} // fill-array
            r3 = 0
            java.lang.String r5 = "67b91f"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L9a
            r3 = r17
            android.content.Context r4 = r3.a     // Catch: java.lang.Exception -> L9c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L9c
            android.content.ContentProviderClient r0 = r4.acquireContentProviderClient(r0)     // Catch: java.lang.Exception -> L9c
            java.lang.String r8 = "917490"
            r10 = 7
            byte[] r9 = new byte[r10]     // Catch: java.lang.Exception -> L9c
            r9 = {x00b4: FILL_ARRAY_DATA , data: [47, 54, 80, 111, 39, 14, 30} // fill-array     // Catch: java.lang.Exception -> L9c
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Exception -> L9c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L9c
            android.os.Bundle r4 = r0.call(r4, r1, r1)     // Catch: java.lang.Exception -> L9c
            r5 = 24
            if (r2 < r5) goto L48
            androidx.core.provider.c.a(r0)     // Catch: java.lang.Exception -> L9c
            goto L4b
        L48:
            r0.release()     // Catch: java.lang.Exception -> L9c
        L4b:
            java.lang.String r15 = "639cf5"
            r0 = 4
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L9c
            r0 = {x00bc: FILL_ARRAY_DATA , data: [36, 62, 78, 18} // fill-array     // Catch: java.lang.Exception -> L9c
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r13 = 0
            r16 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r11, r12, r13, r15, r16)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9c
            r2 = -1
            int r0 = r4.getInt(r0, r2)     // Catch: java.lang.Exception -> L9c
            if (r0 != 0) goto L83
            java.lang.String r15 = "3a5c36"
            r0 = 2
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L9c
            r0 = {x00c2: FILL_ARRAY_DATA , data: [43, 103} // fill-array     // Catch: java.lang.Exception -> L9c
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r13 = 0
            r16 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r11, r12, r13, r15, r16)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L9c
            return r0
        L83:
            java.lang.String r9 = "61451e"
            byte[] r10 = new byte[r10]     // Catch: java.lang.Exception -> L9c
            r10 = {x00c8: FILL_ARRAY_DATA , data: [42, 54, 84, 82, 15, 117, 48} // fill-array     // Catch: java.lang.Exception -> L9c
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9c
            r4.getString(r0)     // Catch: java.lang.Exception -> L9c
            return r1
        L9a:
            r3 = r17
        L9c:
            return r1
    }
}
