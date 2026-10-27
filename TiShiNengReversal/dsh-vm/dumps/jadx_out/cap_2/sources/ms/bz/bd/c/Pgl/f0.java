package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f0 extends ms.bz.bd.c.Pgl.pbly.pgla {
    f0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r18, java.lang.String r20, java.lang.Object r21) throws java.lang.Throwable {
            r17 = this;
            ms.bz.bd.c.Pgl.pblv r0 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r0 = r0.c()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 13
            byte[] r8 = new byte[r2]
            r8 = {x00b6: FILL_ARRAY_DATA , data: [36, 55, 22, 71, 27, 96, 62, 21, 62, 106, 44, 32, 12} // fill-array
            r5 = 0
            java.lang.String r7 = "46f67d"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            if (r0 == 0) goto Lb0
            java.lang.Class r2 = r0.getClass()
            r3 = 0
            java.lang.String r8 = "c6daa2"
            r4 = 36
            byte[] r9 = new byte[r4]     // Catch: java.lang.Throwable -> L52
            r9 = {x00c2: FILL_ARRAY_DATA , data: [117, 49, 3, 60, 80, 54, 116, 22, 57, 61, 119, 48, 54, 22, 93, 32, 115, 4, 60, 51, 123, 56, 30, 1, 71, 22, 101, 5, 35, 56, 113, 49, 59, 28, 77, 49} // fill-array     // Catch: java.lang.Throwable -> L52
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L53
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L52
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L52
            r3 = r0
            goto L53
        L52:
        L53:
            if (r3 == 0) goto Lab
            int r0 = r3.size()
            if (r0 == 0) goto Lab
            java.util.Iterator r0 = r3.iterator()
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r0.next()
            android.accessibilityservice.AccessibilityServiceInfo r2 = (android.accessibilityservice.AccessibilityServiceInfo) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r8 = "d3ac60"
            r10 = 2
            byte[] r9 = new byte[r10]     // Catch: java.lang.Throwable -> La9
            r9 = {x00d8: FILL_ARRAY_DATA , data: [112, 39} // fill-array     // Catch: java.lang.Throwable -> La9
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> La9
            int r5 = r2.eventTypes     // Catch: java.lang.Throwable -> La9
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r15 = "6eb54c"
            byte[] r4 = new byte[r10]     // Catch: java.lang.Throwable -> La9
            r4 = {x00de: FILL_ARRAY_DATA , data: [46, 99} // fill-array     // Catch: java.lang.Throwable -> La9
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r13 = 0
            r16 = r4
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r11, r12, r13, r15, r16)     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = r2.getId()     // Catch: java.lang.Throwable -> La9
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> La9
            r1.put(r3)     // Catch: java.lang.Throwable -> La9
            goto L5f
        La9:
            goto L5f
        Lab:
            java.lang.String r0 = r1.toString()
            return r0
        Lb0:
            java.lang.String r0 = r1.toString()
            return r0
    }
}
