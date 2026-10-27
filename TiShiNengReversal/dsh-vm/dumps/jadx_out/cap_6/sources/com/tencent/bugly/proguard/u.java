package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class u {
    public static final long a = 0;
    private static com.tencent.bugly.proguard.u b;
    private android.content.Context c;
    private java.lang.String d;
    private java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, com.tencent.bugly.proguard.t>> e;
    private android.content.SharedPreferences f;



    static {
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.bugly.proguard.u.a = r0
            return
    }

    private u(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.c = r3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.e = r0
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.b()
            java.lang.String r0 = r0.d
            r2.d = r0
            java.lang.String r0 = "crashrecord"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.f = r3
            return
    }

    public static synchronized com.tencent.bugly.proguard.u a() {
            java.lang.Class<com.tencent.bugly.proguard.u> r0 = com.tencent.bugly.proguard.u.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.u r1 = com.tencent.bugly.proguard.u.b     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static synchronized com.tencent.bugly.proguard.u a(android.content.Context r2) {
            java.lang.Class<com.tencent.bugly.proguard.u> r0 = com.tencent.bugly.proguard.u.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.u r1 = com.tencent.bugly.proguard.u.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.bugly.proguard.u r1 = new com.tencent.bugly.proguard.u     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.u.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.tencent.bugly.proguard.u r2 = com.tencent.bugly.proguard.u.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    static /* synthetic */ java.lang.String a(com.tencent.bugly.proguard.u r0) {
            java.lang.String r0 = r0.d
            return r0
    }

    static /* synthetic */ java.util.List a(com.tencent.bugly.proguard.u r0, int r1) {
            java.util.List r0 = r0.d(r1)
            return r0
    }

    private synchronized <T extends java.util.List<?>> void a(int r5, T r6) {
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
            android.content.Context r2 = r4.c     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
            java.lang.String r3 = "crashrecord"
            java.io.File r2 = r2.getDir(r3, r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
            r5 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r2.writeObject(r6)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
            monitor-exit(r4)
            return
        L2a:
            r5 = move-exception
            goto L53
        L2c:
            r5 = move-exception
            goto L44
        L2e:
            r5 = r2
            goto L34
        L30:
            r6 = move-exception
            r2 = r5
            r5 = r6
            goto L44
        L34:
            java.lang.String r6 = "open record file error"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L30
            com.tencent.bugly.proguard.al.a(r6, r1)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L42
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
            monitor-exit(r4)
            return
        L42:
            monitor-exit(r4)
            return
        L44:
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
        L49:
            throw r5     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4a
        L4a:
            java.lang.String r5 = "writeCrashRecord error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2a
            com.tencent.bugly.proguard.al.e(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    static /* synthetic */ void a(com.tencent.bugly.proguard.u r0, int r1, java.util.List r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ boolean a(com.tencent.bugly.proguard.t r5, com.tencent.bugly.proguard.t r6) {
            long r0 = r5.g
            long r2 = r6.g
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            java.lang.String r5 = r5.b
            if (r5 == 0) goto L16
            java.lang.String r6 = r6.b
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L16
            r5 = 1
            return r5
        L16:
            r5 = 0
            return r5
    }

    static /* synthetic */ java.util.Map b(com.tencent.bugly.proguard.u r0) {
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, com.tencent.bugly.proguard.t>> r0 = r0.e
            return r0
    }

    static /* synthetic */ boolean b(com.tencent.bugly.proguard.t r2, com.tencent.bugly.proguard.t r3) {
            java.lang.String r0 = r2.e
            if (r0 == 0) goto Lc
            java.lang.String r1 = r3.e
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
        Lc:
            java.lang.String r0 = r2.f
            if (r0 == 0) goto L18
            java.lang.String r3 = r3.f
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1c
        L18:
            int r2 = r2.d
            if (r2 > 0) goto L1e
        L1c:
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    static /* synthetic */ boolean b(com.tencent.bugly.proguard.u r0, int r1) {
            boolean r0 = r0.c(r1)
            return r0
    }

    static /* synthetic */ android.content.SharedPreferences c(com.tencent.bugly.proguard.u r0) {
            android.content.SharedPreferences r0 = r0.f
            return r0
    }

    private synchronized boolean c(int r13) {
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            java.util.List r1 = r12.d(r13)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            if (r1 != 0) goto La
            monitor-exit(r12)
            return r0
        La:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            r4.<init>()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            r5.<init>()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
        L1c:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            com.tencent.bugly.proguard.t r7 = (com.tencent.bugly.proguard.t) r7     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            java.lang.String r10 = r7.b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            if (r10 == 0) goto L41
            java.lang.String r11 = r12.d     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            boolean r10 = r10.equalsIgnoreCase(r11)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            if (r10 == 0) goto L41
            int r10 = r7.d     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            if (r10 <= 0) goto L41
            r4.add(r7)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            goto L41
        L3f:
            r13 = move-exception
            goto L8a
        L41:
            long r10 = r7.c     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            long r10 = r10 + r8
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 >= 0) goto L1c
            r5.add(r7)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            goto L1c
        L4c:
            java.util.Collections.sort(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            r7 = 2
            if (r6 < r7) goto L79
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            r6 = 1
            if (r5 <= 0) goto L77
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            int r5 = r5 - r6
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            com.tencent.bugly.proguard.t r4 = (com.tencent.bugly.proguard.t) r4     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            long r4 = r4.c     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            long r4 = r4 + r8
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L77
            r1.clear()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            r12.a(r13, r1)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            monitor-exit(r12)
            return r0
        L77:
            monitor-exit(r12)
            return r6
        L79:
            r1.removeAll(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            r12.a(r13, r1)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L81
            monitor-exit(r12)
            return r0
        L81:
            java.lang.String r13 = "isFrequentCrash failed"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3f
            com.tencent.bugly.proguard.al.e(r13, r1)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r12)
            return r0
        L8a:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L3f
            throw r13
    }

    private synchronized <T extends java.util.List<?>> T d(int r6) {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            android.content.Context r3 = r5.c     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            java.lang.String r4 = "crashrecord"
            java.io.File r3 = r3.getDir(r4, r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            boolean r6 = r2.exists()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            if (r6 != 0) goto L1c
            monitor-exit(r5)
            return r0
        L1c:
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            java.lang.Object r2 = r6.readObject()     // Catch: java.lang.Throwable -> L33 java.lang.ClassNotFoundException -> L39 java.io.IOException -> L47
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L33 java.lang.ClassNotFoundException -> L39 java.io.IOException -> L47
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            monitor-exit(r5)
            return r2
        L31:
            r6 = move-exception
            goto L60
        L33:
            r2 = move-exception
            goto L51
        L35:
            r2 = move-exception
            r6 = r0
            goto L51
        L38:
            r6 = r0
        L39:
            java.lang.String r2 = "get object error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.al.a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
        L42:
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            goto L5e
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.al.a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
            goto L42
        L51:
            if (r6 == 0) goto L56
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
        L56:
            throw r2     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
        L57:
            java.lang.String r6 = "readCrashRecord error"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.e(r6, r1)     // Catch: java.lang.Throwable -> L31
        L5e:
            monitor-exit(r5)
            return r0
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
    }

    public final void a(int r3) {
            r2 = this;
            com.tencent.bugly.proguard.ak r0 = com.tencent.bugly.proguard.ak.a()
            com.tencent.bugly.proguard.u$1 r1 = new com.tencent.bugly.proguard.u$1
            r1.<init>(r2, r3)
            r0.a(r1)
            return
    }

    public final synchronized boolean b(int r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            android.content.SharedPreferences r1 = r4.f     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.append(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r3 = "_"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r3 = r4.d     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.append(r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            boolean r0 = r1.getBoolean(r2, r0)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            com.tencent.bugly.proguard.ak r1 = com.tencent.bugly.proguard.ak.a()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            com.tencent.bugly.proguard.u$2 r2 = new com.tencent.bugly.proguard.u$2     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r1.a(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            monitor-exit(r4)
            return r0
        L2c:
            r5 = move-exception
            goto L38
        L2e:
            java.lang.String r5 = "canInit error"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.al.e(r5, r1)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r4)
            return r0
        L38:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
            throw r5
    }
}
