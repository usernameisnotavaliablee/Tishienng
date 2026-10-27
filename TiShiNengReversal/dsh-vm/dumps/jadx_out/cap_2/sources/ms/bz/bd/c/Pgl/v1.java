package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v1 {
    private final android.content.Context a;
    private java.lang.Class b;
    private java.lang.Object c;
    private java.lang.reflect.Method d;

    public v1(android.content.Context r7) {
            r6 = this;
            r6.<init>()
            r6.a = r7
            java.lang.String r4 = "51c5bf"
            r7 = 34
            byte[] r5 = new byte[r7]     // Catch: java.lang.Exception -> L26
            r5 = {x004c: FILL_ARRAY_DATA , data: [39, 60, 29, 15, 92, 127, 50, 2, 61, 108, 32, 125, 25, 69, 19, 120, 59, 0, 62, 43, 13, 55, 32, 83, 82, 103, 63, 20, 55, 119, 13, 62, 0, 77} // fill-array     // Catch: java.lang.Exception -> L26
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            r2 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)     // Catch: java.lang.Exception -> L26
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L26
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Exception -> L26
            r6.b = r7     // Catch: java.lang.Exception -> L26
            java.lang.Object r7 = r7.newInstance()     // Catch: java.lang.Exception -> L26
            r6.c = r7     // Catch: java.lang.Exception -> L26
        L26:
            java.lang.Class r7 = r6.b     // Catch: java.lang.Exception -> L4a
            java.lang.String r4 = "551efe"
            r0 = 7
            byte[] r5 = new byte[r0]     // Catch: java.lang.Exception -> L4a
            r5 = {x0062: FILL_ARRAY_DATA , data: [35, 50, 86, 62, 120, 91, 18} // fill-array     // Catch: java.lang.Exception -> L4a
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L4a
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L4a
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L4a
            java.lang.reflect.Method r7 = r7.getMethod(r0, r1)     // Catch: java.lang.Exception -> L4a
            r6.d = r7     // Catch: java.lang.Exception -> L4a
        L4a:
            return
    }

    public final java.lang.String a() {
            r5 = this;
            android.content.Context r0 = r5.a
            java.lang.reflect.Method r1 = r5.d
            java.lang.Object r2 = r5.c
            if (r2 == 0) goto L17
            if (r1 == 0) goto L17
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L17
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Exception -> L17
            java.lang.Object r0 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L17
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L17
            return r0
        L17:
            r0 = 0
            return r0
    }
}
