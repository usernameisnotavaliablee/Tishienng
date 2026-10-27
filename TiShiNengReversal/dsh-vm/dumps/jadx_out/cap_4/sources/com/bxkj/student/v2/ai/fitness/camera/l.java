package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class l implements android.hardware.SensorEventListener {
    private static final java.lang.String c = "TemperatureMonitor";
    public java.util.Map<java.lang.String, java.lang.Float> a;
    private final android.hardware.SensorManager b;

    public l(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.a = r0
            java.lang.String r0 = "sensor"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4
            r3.b = r4
            r0 = -1
            java.util.List r4 = r4.getSensorList(r0)
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            android.hardware.Sensor r0 = (android.hardware.Sensor) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "temperature"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1d
            android.hardware.SensorManager r1 = r3.b
            r2 = 3
            r1.registerListener(r3, r0, r2)
            goto L1d
        L40:
            return
    }

    public void a() {
            r7 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r7.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r3 = r2.floatValue()
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L26
            goto La
        L26:
            r4 = 1072064102(0x3fe66666, float:1.8)
            float r3 = r3 * r4
            r4 = 1107296256(0x42000000, float:32.0)
            float r3 = r3 + r4
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object r1 = r1.getKey()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            java.lang.String r1 = "%s:\t%.1fC\t%.1fF"
            java.lang.String.format(r4, r1, r5)
            goto La
        L4a:
            return
    }

    public void b() {
            r1 = this;
            android.hardware.SensorManager r0 = r1.b
            r0.unregisterListener(r1)
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r3.a
            android.hardware.Sensor r1 = r4.sensor
            java.lang.String r1 = r1.getName()
            float[] r4 = r4.values
            r2 = 0
            r4 = r4[r2]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.put(r1, r4)
            return
    }
}
