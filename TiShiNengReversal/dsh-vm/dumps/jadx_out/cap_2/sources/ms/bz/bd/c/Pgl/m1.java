package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m1 implements android.hardware.SensorEventListener {
    private static volatile ms.bz.bd.c.Pgl.m1 f;
    private android.hardware.SensorManager a;
    private int b;
    private int c;
    private float[] d;
    private java.util.ArrayList e;

    static {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            r1 = 3
            byte[] r7 = new byte[r1]
            r7 = {x001e: FILL_ARRAY_DATA , data: [115, 116, 70} // fill-array
            r4 = 0
            java.lang.String r6 = "28ecfe"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            r0 = 0
            ms.bz.bd.c.Pgl.m1.f = r0
            return
    }

    private m1(android.content.Context r8) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.a = r0
            r0 = 0
            r7.c = r0
            r0 = 3
            float[] r0 = new float[r0]
            r7.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.e = r0
            android.content.Context r8 = r8.getApplicationContext()
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)
            if (r8 == 0) goto L3b
            r0 = 6
            byte[] r6 = new byte[r0]
            r6 = {x003c: FILL_ARRAY_DATA , data: [53, 62, 69, 85, 6, 96} // fill-array
            r3 = 0
            java.lang.String r5 = "79826e"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r8.getSystemService(r0)
            android.hardware.SensorManager r8 = (android.hardware.SensorManager) r8
            r7.a = r8
        L3b:
            return
    }

    public static ms.bz.bd.c.Pgl.m1 b(android.content.Context r2) {
            ms.bz.bd.c.Pgl.m1 r0 = ms.bz.bd.c.Pgl.m1.f
            if (r0 != 0) goto L19
            java.lang.Class<ms.bz.bd.c.Pgl.m1> r0 = ms.bz.bd.c.Pgl.m1.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.m1 r1 = ms.bz.bd.c.Pgl.m1.f     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            ms.bz.bd.c.Pgl.m1 r1 = new ms.bz.bd.c.Pgl.m1     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            ms.bz.bd.c.Pgl.m1.f = r1     // Catch: java.lang.Throwable -> L13
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
            ms.bz.bd.c.Pgl.m1 r2 = ms.bz.bd.c.Pgl.m1.f
            return r2
    }

    private synchronized void d() {
            r4 = this;
            monitor-enter(r4)
            android.hardware.SensorManager r0 = r4.a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L24
            if (r0 == 0) goto L24
            int r1 = r4.b     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L24
            r2 = 1
            if (r1 != 0) goto L1b
            android.hardware.Sensor r0 = r0.getDefaultSensor(r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L24
            android.hardware.SensorManager r1 = r4.a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L24
            r3 = 3
            boolean r0 = r1.registerListener(r4, r0, r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L24
            if (r0 != 0) goto L1b
            monitor-exit(r4)
            return
        L19:
            r0 = move-exception
            goto L22
        L1b:
            int r0 = r4.b     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L24
            int r0 = r0 + r2
            r4.b = r0     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L24
            monitor-exit(r4)
            return
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        L24:
            monitor-exit(r4)
            return
    }

    private synchronized void e() {
            r7 = this;
            monitor-enter(r7)
            android.hardware.SensorManager r0 = r7.a     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            if (r0 == 0) goto L25
            int r1 = r7.b     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            int r1 = r1 + (-1)
            r7.b = r1     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            if (r1 != 0) goto L25
            r0.unregisterListener(r7)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            monitor-exit(r7)
            return
        L12:
            r0 = move-exception
            goto L27
        L14:
            r0 = 5
            byte[] r6 = new byte[r0]     // Catch: java.lang.Throwable -> L12
            r6 = {x002a: FILL_ARRAY_DATA , data: [48, 115, 17, 121, 26} // fill-array     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = "2ba200"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L12
        L25:
            monitor-exit(r7)
            return
        L27:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public final synchronized java.lang.String a() {
            r12 = this;
            monitor-enter(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.util.ArrayList r1 = r12.e     // Catch: java.lang.Throwable -> Lb6
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lb6
            if (r1 > 0) goto L11
            monitor-exit(r12)
            r0 = 0
            return r0
        L11:
            java.util.ArrayList r2 = r12.e     // Catch: java.lang.Throwable -> Lb0
            int r3 = r1 + (-50)
            r4 = 0
            if (r3 > 0) goto L19
            r3 = 0
        L19:
            java.util.List r1 = r2.subList(r3, r1)     // Catch: java.lang.Throwable -> Lb0
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lb0
            r3 = 1
            if (r2 <= 0) goto L9e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb0
        L28:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lb0
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L28
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb0
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r10 = "28f2c7"
            byte[] r11 = new byte[r3]     // Catch: java.lang.Throwable -> Lb0
            r5 = 111(0x6f, float:1.56E-43)
            r11[r4] = r5     // Catch: java.lang.Throwable -> Lb0
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.Object r5 = com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb0
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb0
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r10 = "f414bd"
            byte[] r11 = new byte[r3]     // Catch: java.lang.Throwable -> Lb0
            r5 = 59
            r11[r4] = r5     // Catch: java.lang.Throwable -> Lb0
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.Object r5 = com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb0
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb0
            r5 = 2
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb0
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = "98efac"
            byte[] r10 = new byte[r3]     // Catch: java.lang.Throwable -> Lb0
            r2 = 52
            r10[r4] = r2     // Catch: java.lang.Throwable -> Lb0
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb0
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb0
            goto L28
        L9e:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lb0
            if (r1 <= 0) goto Lb0
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lb0
            int r1 = r1 - r3
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lb0
            r0.delete(r1, r2)     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r12)
            return r0
        Lb6:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb6
            throw r0
    }

    public final org.json.JSONArray c() {
            r11 = this;
            android.app.Activity r0 = ms.bz.bd.c.Pgl.pble.b()     // Catch: java.lang.Throwable -> Le5
            if (r0 == 0) goto Le5
            r11.d()
            r1 = 1
            r2 = 0
            r3 = 4
            r4 = 2
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r0 = 0
        Lf:
            int r5 = r11.c     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L21
            r5 = 10
            if (r0 >= r5) goto L21
            int r0 = r0 + 1
            r5 = 1000(0x3e8, double:4.94E-321)
            r11.wait(r5)     // Catch: java.lang.Throwable -> L1f
            goto Lf
        L1f:
            r0 = move-exception
            goto L60
        L21:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L1f
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.math.BigDecimal r5 = new java.math.BigDecimal
            float[] r6 = r11.d
            r6 = r6[r2]
            double r6 = (double) r6
            r5.<init>(r6)
            java.math.BigDecimal r5 = r5.setScale(r4, r3)
            r0.put(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            float[] r6 = r11.d
            r1 = r6[r1]
            double r6 = (double) r1
            r5.<init>(r6)
            java.math.BigDecimal r1 = r5.setScale(r4, r3)
            r0.put(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            float[] r5 = r11.d
            r5 = r5[r4]
            double r5 = (double) r5
            r1.<init>(r5)
        L53:
            java.math.BigDecimal r1 = r1.setScale(r4, r3)
            r0.put(r1)
            r11.e()
            r11.c = r2
            return r0
        L60:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
        L62:
            r0 = move-exception
            goto La7
        L64:
            java.lang.String r9 = "d1d471"
            r0 = 5
            byte[] r10 = new byte[r0]     // Catch: java.lang.Throwable -> L62
            r10 = {x00e8: FILL_ARRAY_DATA , data: [102, 32, 20, 127, 15} // fill-array     // Catch: java.lang.Throwable -> L62
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L62
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.math.BigDecimal r5 = new java.math.BigDecimal
            float[] r6 = r11.d
            r6 = r6[r2]
            double r6 = (double) r6
            r5.<init>(r6)
            java.math.BigDecimal r5 = r5.setScale(r4, r3)
            r0.put(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            float[] r6 = r11.d
            r1 = r6[r1]
            double r6 = (double) r1
            r5.<init>(r6)
            java.math.BigDecimal r1 = r5.setScale(r4, r3)
            r0.put(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            float[] r5 = r11.d
            r5 = r5[r4]
            double r5 = (double) r5
            r1.<init>(r5)
            goto L53
        La7:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.math.BigDecimal r6 = new java.math.BigDecimal
            float[] r7 = r11.d
            r7 = r7[r2]
            double r7 = (double) r7
            r6.<init>(r7)
            java.math.BigDecimal r6 = r6.setScale(r4, r3)
            r5.put(r6)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            float[] r7 = r11.d
            r1 = r7[r1]
            double r7 = (double) r1
            r6.<init>(r7)
            java.math.BigDecimal r1 = r6.setScale(r4, r3)
            r5.put(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            float[] r6 = r11.d
            r6 = r6[r4]
            double r6 = (double) r6
            r1.<init>(r6)
            java.math.BigDecimal r1 = r1.setScale(r4, r3)
            r5.put(r1)
            r11.e()
            r11.c = r2
            throw r0
        Le5:
            r0 = 0
            return r0
    }

    public final synchronized void f() {
            r4 = this;
            monitor-enter(r4)
            org.json.JSONArray r0 = r4.c()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L9
            monitor-exit(r4)
            return
        L9:
            java.util.ArrayList r1 = r4.e     // Catch: java.lang.Throwable -> L30
            r1.add(r0)     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r0 = r4.e     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2e
            r1 = 100
            if (r0 <= r1) goto L2e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r2 = r4.e     // Catch: java.lang.Throwable -> L2e
            int r3 = r0 + (-50)
            java.util.List r0 = r2.subList(r3, r0)     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r0 = r4.e     // Catch: java.lang.Throwable -> L2e
            r0.clear()     // Catch: java.lang.Throwable -> L2e
            r4.e = r1     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            return
        L2e:
            monitor-exit(r4)
            return
        L30:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent r1) {
            r0 = this;
            float[] r1 = r1.values
            r0.d = r1
            r1 = 1
            r0.c = r1
            return
    }
}
