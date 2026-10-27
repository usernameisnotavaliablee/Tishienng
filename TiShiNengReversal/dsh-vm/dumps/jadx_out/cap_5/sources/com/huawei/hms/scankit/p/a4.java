package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a4 {
    private static volatile com.huawei.hms.scankit.p.a4 h;
    private static java.lang.String[] i;
    private java.util.Timer a;
    private volatile boolean b;
    private volatile boolean c;
    private volatile long d;
    private volatile boolean e;
    private final java.util.concurrent.locks.Lock f;
    private java.util.List<com.huawei.hms.scankit.p.a4.b> g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.lang.Thread {
        final /* synthetic */ com.huawei.hms.scankit.p.a4 a;

        a(com.huawei.hms.scankit.p.a4 r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r1 = this;
                com.huawei.hms.scankit.p.a4 r0 = r1.a
                com.huawei.hms.scankit.p.a4.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b {
        private java.lang.String a;
        private java.util.LinkedHashMap<java.lang.String, java.lang.String> b;
        final /* synthetic */ com.huawei.hms.scankit.p.a4 c;

        private b(com.huawei.hms.scankit.p.a4 r1, java.lang.String r2, java.util.LinkedHashMap<java.lang.String, java.lang.String> r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }

        /* synthetic */ b(com.huawei.hms.scankit.p.a4 r1, java.lang.String r2, java.util.LinkedHashMap r3, com.huawei.hms.scankit.p.a4.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ java.lang.String a(com.huawei.hms.scankit.p.a4.b r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ java.util.LinkedHashMap b(com.huawei.hms.scankit.p.a4.b r0) {
                java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r0.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends java.util.TimerTask {
        final /* synthetic */ com.huawei.hms.scankit.p.a4 a;

        private c(com.huawei.hms.scankit.p.a4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(com.huawei.hms.scankit.p.a4 r1, com.huawei.hms.scankit.p.a4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r2 = this;
                com.huawei.hms.scankit.p.a4 r0 = r2.a     // Catch: java.lang.Exception -> La
                r1 = 1
                com.huawei.hms.scankit.p.a4.a(r0, r1)     // Catch: java.lang.Exception -> La
                com.huawei.hms.hatool.a.f()     // Catch: java.lang.Exception -> La
                return
            La:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                java.lang.String r1 = "ScanHiAnalytics"
                com.huawei.hms.scankit.p.o4.b(r1, r0)
                return
        }
    }

    static {
            com.huawei.hms.scankit.p.a4 r0 = new com.huawei.hms.scankit.p.a4
            r0.<init>()
            com.huawei.hms.scankit.p.a4.h = r0
            java.lang.String r66 = "XK"
            java.lang.String r67 = "YK"
            java.lang.String r1 = "AD"
            java.lang.String r2 = "AL"
            java.lang.String r3 = "AN"
            java.lang.String r4 = "AT"
            java.lang.String r5 = "AU"
            java.lang.String r6 = "AX"
            java.lang.String r7 = "BA"
            java.lang.String r8 = "BE"
            java.lang.String r9 = "BG"
            java.lang.String r10 = "BQ"
            java.lang.String r11 = "CA"
            java.lang.String r12 = "CH"
            java.lang.String r13 = "CW"
            java.lang.String r14 = "CY"
            java.lang.String r15 = "CZ"
            java.lang.String r16 = "DE"
            java.lang.String r17 = "DK"
            java.lang.String r18 = "EE"
            java.lang.String r19 = "ES"
            java.lang.String r20 = "FI"
            java.lang.String r21 = "FO"
            java.lang.String r22 = "FR"
            java.lang.String r23 = "GB"
            java.lang.String r24 = "GG"
            java.lang.String r25 = "GI"
            java.lang.String r26 = "GL"
            java.lang.String r27 = "GR"
            java.lang.String r28 = "HR"
            java.lang.String r29 = "HU"
            java.lang.String r30 = "IE"
            java.lang.String r31 = "IL"
            java.lang.String r32 = "IM"
            java.lang.String r33 = "IS"
            java.lang.String r34 = "IT"
            java.lang.String r35 = "JE"
            java.lang.String r36 = "LI"
            java.lang.String r37 = "LT"
            java.lang.String r38 = "LU"
            java.lang.String r39 = "LV"
            java.lang.String r40 = "MC"
            java.lang.String r41 = "MD"
            java.lang.String r42 = "ME"
            java.lang.String r43 = "MF"
            java.lang.String r44 = "MK"
            java.lang.String r45 = "MT"
            java.lang.String r46 = "NL"
            java.lang.String r47 = "NO"
            java.lang.String r48 = "NZ"
            java.lang.String r49 = "PL"
            java.lang.String r50 = "PM"
            java.lang.String r51 = "PT"
            java.lang.String r52 = "RO"
            java.lang.String r53 = "RS"
            java.lang.String r54 = "SE"
            java.lang.String r55 = "SI"
            java.lang.String r56 = "SJ"
            java.lang.String r57 = "SK"
            java.lang.String r58 = "SM"
            java.lang.String r59 = "SX"
            java.lang.String r60 = "TR"
            java.lang.String r61 = "UA"
            java.lang.String r62 = "UM"
            java.lang.String r63 = "US"
            java.lang.String r64 = "VA"
            java.lang.String r65 = "VC"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67}
            com.huawei.hms.scankit.p.a4.i = r0
            return
    }

    private a4() {
            r2 = this;
            r2.<init>()
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r2.a = r0
            r0 = 1
            r2.b = r0
            r0 = 0
            r2.e = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r2.g = r0
            return
    }

    private java.lang.String a(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "com.huawei.cloud.mlkithianalytics"
            r1 = 0
            com.huawei.hms.framework.network.grs.GrsBaseInfo r2 = new com.huawei.hms.framework.network.grs.GrsBaseInfo     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            com.huawei.hms.scankit.p.a1 r3 = new com.huawei.hms.scankit.p.a1     // Catch: java.lang.Throwable -> L55
            r4 = 0
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L2b
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L2b
            java.lang.String r4 = "UNKNOWN"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L2b
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r3.toUpperCase(r4)     // Catch: java.lang.Throwable -> L55
            r2.setSerCountry(r4)     // Catch: java.lang.Throwable -> L55
        L2b:
            java.lang.String[] r4 = com.huawei.hms.scankit.p.a4.i     // Catch: java.lang.Throwable -> L55
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L55
            boolean r3 = r4.contains(r3)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L3a
            r3 = 1
            r5.e = r3     // Catch: java.lang.Throwable -> L55
        L3a:
            com.huawei.hms.framework.network.grs.GrsClient r3 = new com.huawei.hms.framework.network.grs.GrsClient     // Catch: java.lang.Throwable -> L55
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "ROOTNEW"
            java.lang.String r6 = r3.synGetGrsUrl(r0, r6)     // Catch: java.lang.Throwable -> L55
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L51
            java.lang.String r6 = "ROOT"
            java.lang.String r6 = r3.synGetGrsUrl(r0, r6)     // Catch: java.lang.Throwable -> L55
        L51:
            r2.getSerCountry()     // Catch: java.lang.Throwable -> L55
            return r6
        L55:
            return r1
    }

    private synchronized void a() {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            r3.c = r0     // Catch: java.lang.Throwable -> L22
            java.util.List<com.huawei.hms.scankit.p.a4$b> r0 = r3.g     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L22
            com.huawei.hms.scankit.p.a4$b r1 = (com.huawei.hms.scankit.p.a4.b) r1     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = com.huawei.hms.scankit.p.a4.b.a(r1)     // Catch: java.lang.Throwable -> L22
            java.util.LinkedHashMap r1 = com.huawei.hms.scankit.p.a4.b.b(r1)     // Catch: java.lang.Throwable -> L22
            r3.c(r2, r1)     // Catch: java.lang.Throwable -> L22
            goto La
        L22:
            r0 = move-exception
            goto L29
        L24:
            r0 = 0
            r3.g = r0     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    static /* synthetic */ void a(com.huawei.hms.scankit.p.a4 r0) {
            r0.d()
            return
    }

    private synchronized void a(java.lang.String r3, java.util.LinkedHashMap<java.lang.String, java.lang.String> r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            r2.c(r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        La:
            r3 = move-exception
            goto L25
        Lc:
            java.util.List<com.huawei.hms.scankit.p.a4$b> r0 = r2.g     // Catch: java.lang.Throwable -> La
            int r0 = r0.size()     // Catch: java.lang.Throwable -> La
            r1 = 100
            if (r0 < r1) goto L18
            monitor-exit(r2)
            return
        L18:
            com.huawei.hms.scankit.p.a4$b r0 = new com.huawei.hms.scankit.p.a4$b     // Catch: java.lang.Throwable -> La
            r1 = 0
            r0.<init>(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> La
            java.util.List<com.huawei.hms.scankit.p.a4$b> r3 = r2.g     // Catch: java.lang.Throwable -> La
            r3.add(r0)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    static /* synthetic */ boolean a(com.huawei.hms.scankit.p.a4 r0, boolean r1) {
            r0.b = r1
            return r1
    }

    public static com.huawei.hms.scankit.p.a4 b() {
            com.huawei.hms.scankit.p.a4 r0 = com.huawei.hms.scankit.p.a4.h
            return r0
    }

    private void c() {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.d
            long r2 = r0 - r2
            r4 = 6000(0x1770, double:2.9644E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            r7.d = r0
            com.huawei.hms.scankit.p.a4$a r0 = new com.huawei.hms.scankit.p.a4$a
            java.lang.String r1 = "ScanHiAnalytics"
            r0.<init>(r7, r1)
            r0.start()
        L1a:
            return
    }

    private void c(java.lang.String r5, java.util.LinkedHashMap<java.lang.String, java.lang.String> r6) {
            r4 = this;
            boolean r0 = r4.e
            r1 = 0
            if (r0 != 0) goto Lc
            com.huawei.hms.hatool.a.d(r1, r5, r6)
            r0 = 1
            com.huawei.hms.hatool.a.d(r0, r5, r6)
        Lc:
            boolean r0 = r4.b
            if (r0 == 0) goto L1f
            r4.b = r1
            java.util.Timer r0 = r4.a
            com.huawei.hms.scankit.p.a4$c r1 = new com.huawei.hms.scankit.p.a4$c
            r2 = 0
            r1.<init>(r4, r2)
            r2 = 3000(0xbb8, double:1.482E-320)
            r0.schedule(r1, r2)
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " "
            r0.append(r5)
            java.lang.String r5 = r6.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "ScanHiAnalytics"
            com.huawei.hms.scankit.p.o4.d(r6, r5)
            return
    }

    private void d() {
            r7 = this;
            java.util.concurrent.locks.Lock r0 = r7.f
            boolean r0 = r0.tryLock()
            if (r0 == 0) goto L49
            boolean r0 = r7.c
            if (r0 != 0) goto L49
            android.content.Context r1 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L18
            java.util.concurrent.locks.Lock r0 = r7.f
            r0.unlock()
            return
        L18:
            java.lang.String r5 = r7.a(r1)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L3d
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L25
            goto L3d
        L25:
            java.lang.String r6 = r1.getPackageName()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            r4 = 0
            r2 = 0
            com.huawei.hms.hatool.a.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3b
            com.huawei.hms.hatool.a.a()     // Catch: java.lang.Throwable -> L3b
            r7.a()     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.locks.Lock r0 = r7.f
            r0.unlock()
            return
        L3b:
            r0 = move-exception
            goto L43
        L3d:
            java.util.concurrent.locks.Lock r0 = r7.f
            r0.unlock()
            return
        L43:
            java.util.concurrent.locks.Lock r1 = r7.f
            r1.unlock()
            throw r0
        L49:
            return
    }

    public void b(java.lang.String r2, java.util.LinkedHashMap<java.lang.String, java.lang.String> r3) {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto L8
            r1.c(r2, r3)
            return
        L8:
            r1.a(r2, r3)
            r1.c()
            return
    }
}
