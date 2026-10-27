package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblg {
    public pblg() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.HashMap r1 = b()     // Catch: java.lang.Throwable -> L2a
            java.util.Set r2 = r1.keySet()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2a
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L2a
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L2a
            goto L11
        L25:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a
            return r0
        L2a:
            r0 = 2
            byte[] r6 = new byte[r0]
            r6 = {x0040: FILL_ARRAY_DATA , data: [58, 38} // fill-array
            r3 = 0
            java.lang.String r5 = "091f3c"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private static java.util.HashMap b() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 1
            byte[] r7 = new byte[r1]
            r8 = 0
            r2 = 38
            r7[r8] = r2
            r4 = 0
            java.lang.String r6 = "f29f6f"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.MODEL
            r0.put(r2, r3)
            byte[] r14 = new byte[r1]
            r2 = 122(0x7a, float:1.71E-43)
            r14[r8] = r2
            r11 = 0
            java.lang.String r13 = "98c1b3"
            r9 = 16777217(0x1000001, float:2.350989E-38)
            r10 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r9, r10, r11, r13, r14)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.BRAND
            r0.put(r2, r3)
            byte[] r14 = new byte[r1]
            r2 = 115(0x73, float:1.61E-43)
            r14[r8] = r2
            java.lang.String r13 = "19172b"
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r9, r10, r11, r13, r14)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.BOARD
            r0.put(r2, r3)
            byte[] r14 = new byte[r1]
            r2 = 118(0x76, float:1.65E-43)
            r14[r8] = r2
            java.lang.String r13 = "3b5625"
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r9, r10, r11, r13, r14)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r0.put(r2, r3)
            byte[] r14 = new byte[r1]
            r2 = 125(0x7d, float:1.75E-43)
            r14[r8] = r2
            java.lang.String r13 = "919dd7"
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r9, r10, r11, r13, r14)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.DISPLAY
            r0.put(r2, r3)
            byte[] r14 = new byte[r1]
            r2 = 112(0x70, float:1.57E-43)
            r14[r8] = r2
            java.lang.String r13 = "777ec4"
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r9, r10, r11, r13, r14)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.HARDWARE
            r0.put(r2, r3)
            byte[] r14 = new byte[r1]
            r1 = 32
            r14[r8] = r1
            java.lang.String r13 = "f491a0"
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r9, r10, r11, r13, r14)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r0.put(r1, r2)
            return r0
    }
}
