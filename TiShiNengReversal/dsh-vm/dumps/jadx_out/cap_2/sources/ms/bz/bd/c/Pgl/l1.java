package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l1 {
    private static ms.bz.bd.c.Pgl.l1 c;
    private android.content.Context a;
    private java.util.ArrayList b;

    private l1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            r1.a = r2
            return
    }

    public static ms.bz.bd.c.Pgl.l1 c(android.content.Context r2) {
            ms.bz.bd.c.Pgl.l1 r0 = ms.bz.bd.c.Pgl.l1.c
            if (r0 != 0) goto L19
            java.lang.Class<ms.bz.bd.c.Pgl.l1> r0 = ms.bz.bd.c.Pgl.l1.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.l1 r1 = ms.bz.bd.c.Pgl.l1.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            ms.bz.bd.c.Pgl.l1 r1 = new ms.bz.bd.c.Pgl.l1     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            ms.bz.bd.c.Pgl.l1.c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            ms.bz.bd.c.Pgl.l1 r2 = ms.bz.bd.c.Pgl.l1.c
            return r2
    }

    public final int a() {
            r9 = this;
            android.content.Context r0 = r9.a
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r2 = 37
            byte[] r8 = new byte[r2]
            r8 = {x003e: FILL_ARRAY_DATA , data: [32, 63, 67, 82, 9, 41, 55, 92, 108, 106, 53, 52, 73, 84, 72, 33, 48, 6, 108, 107, 47, 127, 101, 97, 50, 20, 22, 32, 92, 91, 2, 25, 102, 110, 33, 5, 23} // fill-array
            r5 = 0
            java.lang.String r7 = "034497"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            r2 = 0
            android.content.Intent r0 = r0.registerReceiver(r2, r1)
            r1 = -1
            if (r0 != 0) goto L25
            return r1
        L25:
            r2 = 7
            byte[] r8 = new byte[r2]
            r8 = {x0056: FILL_ARRAY_DATA , data: [99, 55, 0, 18, 89, 118, 101} // fill-array
            r5 = 0
            java.lang.String r7 = "b9faad"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r0.getIntExtra(r2, r1)
            return r0
    }

    public final int b() {
            r10 = this;
            android.content.Context r0 = r10.a
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r2 = 37
            byte[] r8 = new byte[r2]
            r8 = {x0066: FILL_ARRAY_DATA , data: [118, 58, 65, 80, 8, 124, 97, 89, 110, 104, 99, 49, 75, 86, 73, 116, 102, 3, 110, 105, 121, 122, 103, 99, 51, 65, 64, 37, 94, 89, 84, 28, 100, 108, 32, 80, 65} // fill-array
            r5 = 0
            java.lang.String r7 = "f6668b"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            r2 = 0
            android.content.Intent r0 = r0.registerReceiver(r2, r1)
            r1 = -1
            if (r0 != 0) goto L25
            return r1
        L25:
            r2 = 5
            byte[] r8 = new byte[r2]
            r8 = {x007e: FILL_ARRAY_DATA , data: [46, 51, 87, 67, 11} // fill-array
            r5 = 0
            java.lang.String r7 = "34228b"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r0.getIntExtra(r3, r1)
            byte[] r9 = new byte[r2]
            r9 = {x0086: FILL_ARRAY_DATA , data: [97, 99, 66, 65, 89} // fill-array
            r6 = 0
            java.lang.String r8 = "cb09c5"
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r0.getIntExtra(r2, r1)
            float r1 = (float) r3
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            int r0 = r0 / 10
            return r0
    }

    public final void d() {
            r7 = this;
            android.app.Activity r0 = ms.bz.bd.c.Pgl.pble.b()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L44
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            int r0 = r7.a()     // Catch: java.lang.Throwable -> L18
            int r1 = r7.b()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L18
            int r0 = r0 * 10000
            int r0 = r0 + r1
        L13:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L20
        L18:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
        L1b:
            r0 = move-exception
            throw r0
        L1d:
            r0 = -10001(0xffffffffffffd8ef, float:NaN)
            goto L13
        L20:
            java.util.ArrayList r1 = r7.b
            r1.add(r0)
            java.util.ArrayList r0 = r7.b     // Catch: java.lang.Throwable -> L43
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L43
            r1 = 20
            if (r0 <= r1) goto L43
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r2 = r7.b     // Catch: java.lang.Throwable -> L43
            int r3 = r0 + (-10)
            java.util.List r0 = r2.subList(r3, r0)     // Catch: java.lang.Throwable -> L43
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r0 = r7.b     // Catch: java.lang.Throwable -> L43
            r0.clear()     // Catch: java.lang.Throwable -> L43
            r7.b = r1     // Catch: java.lang.Throwable -> L43
        L43:
            return
        L44:
            r0 = 44
            byte[] r6 = new byte[r0]
            r6 = {x0058: FILL_ARRAY_DATA , data: [112, 105, 64, 64, 7, 50, 103, 71, 115, 100, 123, 67, 68, 87, 24, 119, 115, 91, 84, 115, 114, 117, 80, 80, 63, 102, 115, 75, 105, 96, 51, 104, 75, 3, 14, 115, 98, 73, 96, 117, 124, 116, 75, 71} // fill-array
            r3 = 0
            java.lang.String r5 = "bc673e"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            return
    }

    public final synchronized int[] e() {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = r5.b     // Catch: java.lang.Throwable -> Le
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            if (r0 > 0) goto L10
            int[] r0 = new int[r1]     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)
            return r0
        Le:
            r0 = move-exception
            goto L52
        L10:
            r2 = 1
            if (r0 != r2) goto L25
            java.util.ArrayList r0 = r5.b     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> Le
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Le
            int[] r0 = new int[]{r0}     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)
            return r0
        L25:
            java.util.ArrayList r2 = r5.b     // Catch: java.lang.Throwable -> L4e
            int r3 = r0 + (-10)
            if (r3 > 0) goto L2c
            r3 = 0
        L2c:
            java.util.List r0 = r2.subList(r3, r0)     // Catch: java.lang.Throwable -> L4e
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L4e
            int[] r2 = new int[r2]     // Catch: java.lang.Throwable -> L4e
            r3 = 0
        L37:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L4e
            if (r3 >= r4) goto L4c
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L4e
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L4e
            r2[r3] = r4     // Catch: java.lang.Throwable -> L4e
            int r3 = r3 + 1
            goto L37
        L4c:
            monitor-exit(r5)
            return r2
        L4e:
            int[] r0 = new int[r1]     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)
            return r0
        L52:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public final int f() {
            r9 = this;
            android.content.Context r0 = r9.a
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r2 = 37
            byte[] r8 = new byte[r2]
            r8 = {x0048: FILL_ARRAY_DATA , data: [40, 60, 78, 7, 2, 122, 63, 95, 97, 63, 61, 55, 68, 1, 67, 114, 56, 5, 97, 62, 39, 124, 104, 52, 57, 71, 30, 35, 81, 14, 10, 26, 107, 59, 42, 86, 31} // fill-array
            r5 = 0
            java.lang.String r7 = "809a2d"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            r2 = 0
            android.content.Intent r0 = r0.registerReceiver(r2, r1)
            r1 = -1
            if (r0 != 0) goto L25
            return r1
        L25:
            r2 = 6
            byte[] r8 = new byte[r2]
            r8 = {x0060: FILL_ARRAY_DATA , data: [58, 46, 17, 81, 18, 61} // fill-array
            r5 = 0
            java.lang.String r7 = "88c189"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r0.getIntExtra(r2, r1)
            r1 = 2
            if (r0 == r1) goto L45
            r1 = 5
            if (r0 == r1) goto L45
            r0 = 0
            return r0
        L45:
            r0 = 1
            return r0
    }
}
