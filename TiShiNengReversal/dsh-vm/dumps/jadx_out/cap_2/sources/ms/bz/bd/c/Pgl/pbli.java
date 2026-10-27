package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pbli {
    public pbli() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a() {
            r0 = 57
            byte[] r6 = new byte[r0]
            r6 = {x001e: FILL_ARRAY_DATA , data: [112, 53, 74, 91, 4, 61, 117, 28, 97, 48, 125, 57, 66, 91, 0, 54, 96, 20, 114, 62, 97, 49, 9, 22, 9, 54, 100, 87, 118, 53, 120, 55, 72, 27, 15, 48, 110, 11, 43, 1, 116, 54, 116, 49, 45, 9, 110, 23, 108, 37, 124, 40, 114, 1, 15, 40, 114} // fill-array
            r3 = 0
            java.lang.String r5 = "b84a93"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = b(r0)
            return r0
    }

    private static boolean b(java.lang.String... r6) {
            int r0 = r6.length
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 1
        L5:
            if (r3 >= r0) goto L16
            r5 = r6[r3]
            java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> Le
            r5 = 1
            goto L10
        Le:
            r5 = 0
        L10:
            r4 = r4 & r5
            if (r4 == 0) goto L16
            int r3 = r3 + 1
            goto L5
        L16:
            return r4
    }
}
