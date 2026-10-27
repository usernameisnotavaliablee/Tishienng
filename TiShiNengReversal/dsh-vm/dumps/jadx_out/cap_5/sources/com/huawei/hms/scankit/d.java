package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class d extends java.lang.Thread {
    private android.content.Context a;
    private final com.huawei.hms.scankit.p.j0 b;
    private final java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> c;
    private android.os.Handler d;
    private com.huawei.hms.scankit.a e;
    private final java.util.concurrent.CountDownLatch f;
    private android.graphics.Rect g;
    private boolean h;

    d(android.content.Context r2, com.huawei.hms.scankit.p.j0 r3, com.huawei.hms.scankit.a r4, java.util.Collection<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r5, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r6, java.lang.String r7, com.huawei.hms.scankit.p.v6 r8) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.h = r0
            r1.a = r2
            r1.e = r4
            r1.b = r3
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r0)
            r1.f = r3
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<com.huawei.hms.scankit.p.l1> r4 = com.huawei.hms.scankit.p.l1.class
            r3.<init>(r4)
            r1.c = r3
            if (r6 == 0) goto L21
            r3.putAll(r6)
        L21:
            if (r5 == 0) goto L29
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L82
        L29:
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            java.lang.Class<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.class
            java.util.EnumSet r5 = java.util.EnumSet.noneOf(r4)
            java.lang.String r4 = "preferences_decode_1D_product"
            boolean r4 = r2.getBoolean(r4, r0)
            if (r4 == 0) goto L40
            java.util.Set<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4 = com.huawei.hms.scankit.p.k1.a
            r5.addAll(r4)
        L40:
            java.lang.String r4 = "preferences_decode_1D_industrial"
            boolean r4 = r2.getBoolean(r4, r0)
            if (r4 == 0) goto L4d
            java.util.Set<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4 = com.huawei.hms.scankit.p.k1.c
            r5.addAll(r4)
        L4d:
            java.lang.String r4 = "preferences_decode_QR"
            boolean r4 = r2.getBoolean(r4, r0)
            if (r4 == 0) goto L5a
            java.util.Set<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4 = com.huawei.hms.scankit.p.k1.d
            r5.addAll(r4)
        L5a:
            java.lang.String r4 = "preferences_decode_Data_Matrix"
            boolean r4 = r2.getBoolean(r4, r0)
            if (r4 == 0) goto L67
            java.util.Set<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4 = com.huawei.hms.scankit.p.k1.f
            r5.addAll(r4)
        L67:
            java.lang.String r4 = "preferences_decode_Aztec"
            r6 = 0
            boolean r4 = r2.getBoolean(r4, r6)
            if (r4 == 0) goto L75
            java.util.Set<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4 = com.huawei.hms.scankit.p.k1.e
            r5.addAll(r4)
        L75:
            java.lang.String r4 = "preferences_decode_PDF417"
            boolean r2 = r2.getBoolean(r4, r6)
            if (r2 == 0) goto L82
            java.util.Set<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r2 = com.huawei.hms.scankit.p.k1.g
            r5.addAll(r2)
        L82:
            com.huawei.hms.scankit.p.l1 r2 = com.huawei.hms.scankit.p.l1.c
            r3.put(r2, r5)
            if (r7 == 0) goto L8e
            com.huawei.hms.scankit.p.l1 r2 = com.huawei.hms.scankit.p.l1.h
            r3.put(r2, r7)
        L8e:
            com.huawei.hms.scankit.p.l1 r2 = com.huawei.hms.scankit.p.l1.j
            r3.put(r2, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Hints: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "DecodeThread"
            com.huawei.hms.scankit.p.o4.d(r3, r2)
            return
    }

    android.os.Handler a() {
            r2 = this;
            java.util.concurrent.CountDownLatch r0 = r2.f     // Catch: java.lang.InterruptedException -> L6
            r0.await()     // Catch: java.lang.InterruptedException -> L6
            goto Ld
        L6:
            java.lang.String r0 = "exception"
            java.lang.String r1 = "InterruptedException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        Ld:
            android.os.Handler r0 = r2.d
            return r0
    }

    public void a(android.graphics.Rect r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r7 = this;
            android.os.Looper.prepare()
            com.huawei.hms.scankit.c r0 = new com.huawei.hms.scankit.c
            android.content.Context r1 = r7.a
            com.huawei.hms.scankit.p.j0 r2 = r7.b
            com.huawei.hms.scankit.a r3 = r7.e
            java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r4 = r7.c
            android.graphics.Rect r5 = r7.g
            boolean r6 = r7.h
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
            java.util.concurrent.CountDownLatch r0 = r7.f
            r0.countDown()
            android.os.Looper.loop()
            return
    }
}
