package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j7 {
    private static float a = 2.51f;
    private static float b = 0.03f;
    private static float c = 2.43f;
    private static float d = 0.59f;
    private static float e = 0.14f;
    private static java.util.HashMap<java.lang.Integer, java.lang.Integer> f;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 255(0xff, float:3.57E-43)
            r0.<init>(r1)
            com.huawei.hms.scankit.p.j7.f = r0
            return
    }

    public j7() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r3, float r4) {
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = com.huawei.hms.scankit.p.j7.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L35
            float r0 = (float) r3
            float r0 = r0 / r4
            float r1 = com.huawei.hms.scankit.p.j7.a
            float r1 = r1 * r0
            float r2 = com.huawei.hms.scankit.p.j7.b
            float r1 = r1 + r2
            float r1 = r1 * r0
            float r4 = r4 * r1
            float r1 = com.huawei.hms.scankit.p.j7.c
            float r1 = r1 * r0
            float r2 = com.huawei.hms.scankit.p.j7.d
            float r1 = r1 + r2
            float r0 = r0 * r1
            float r1 = com.huawei.hms.scankit.p.j7.e
            float r0 = r0 + r1
            float r4 = r4 / r0
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = com.huawei.hms.scankit.p.j7.f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = (int) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r1)
            return r4
        L35:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r4 = com.huawei.hms.scankit.p.j7.f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
    }

    private static int a(com.huawei.hms.scankit.p.p4 r8) {
            byte[] r0 = r8.b()
            if (r0 != 0) goto L8
            r8 = 1
            return r8
        L8:
            int r1 = r8.c()
            int r8 = r8.a()
            int r2 = r8 / 4
            r3 = 0
        L14:
            int r5 = r8 * 3
            int r5 = r5 / 4
            if (r2 >= r5) goto L31
            int r5 = r1 / 4
        L1c:
            int r6 = r1 * 3
            int r6 = r6 / 4
            if (r5 >= r6) goto L2e
            int r6 = r2 * r1
            int r6 = r6 + r5
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6
            long r3 = r3 + r6
            int r5 = r5 + 1
            goto L1c
        L2e:
            int r2 = r2 + 1
            goto L14
        L31:
            int r8 = r0.length
            long r0 = (long) r8
            long r3 = r3 / r0
            r0 = 4
            long r3 = r3 * r0
            int r8 = (int) r3
            return r8
    }

    public static com.huawei.hms.scankit.p.p4 b(com.huawei.hms.scankit.p.p4 r11) {
            int r0 = a(r11)
            int r3 = r11.c()
            int r4 = r11.a()
            byte[] r11 = r11.b()
            int r1 = r4 * r3
            byte[] r2 = new byte[r1]
            r1 = 0
            r5 = 0
        L16:
            r6 = 255(0xff, float:3.57E-43)
            if (r5 >= r4) goto L32
            r7 = 0
        L1b:
            if (r7 >= r3) goto L2f
            int r8 = r5 * r3
            int r8 = r8 + r7
            r9 = r11[r8]
            r9 = r9 & r6
            float r10 = (float) r0
            int r9 = a(r9, r10)
            r9 = r9 & r6
            byte r9 = (byte) r9
            r2[r8] = r9
            int r7 = r7 + 1
            goto L1b
        L2f:
            int r5 = r5 + 1
            goto L16
        L32:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>(r6)
            com.huawei.hms.scankit.p.j7.f = r11
            com.huawei.hms.scankit.p.e6 r1 = new com.huawei.hms.scankit.p.e6
            r6 = 0
            r9 = 0
            r5 = 0
            r7 = r3
            r8 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }
}
