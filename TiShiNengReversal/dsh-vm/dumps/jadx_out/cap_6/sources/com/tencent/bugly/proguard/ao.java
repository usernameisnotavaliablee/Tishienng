package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ao {
    public static boolean a = true;
    public static boolean b = true;
    private static java.text.SimpleDateFormat c = null;
    private static int d = 30720;
    private static java.lang.StringBuilder e;
    private static java.lang.StringBuilder f;
    private static boolean g;
    private static com.tencent.bugly.proguard.ao.a h;
    private static java.lang.String i;
    private static java.lang.String j;
    private static android.content.Context k;
    private static java.lang.String l;
    private static boolean m;
    private static boolean n;
    private static java.util.concurrent.ExecutorService o;
    private static int p;

    /* renamed from: q, reason: collision with root package name */
    private static final java.lang.Object f13q = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        boolean a;
        java.io.File b;
        long c;
        private java.lang.String d;
        private long e;

        public a(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                r0 = 30720(0x7800, double:1.51777E-319)
                r2.c = r0
                if (r3 == 0) goto L1a
                java.lang.String r0 = ""
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L12
                goto L1a
            L12:
                r2.d = r3
                boolean r3 = r2.a()
                r2.a = r3
            L1a:
                return
        }

        final boolean a() {
                r3 = this;
                r0 = 0
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1b
                java.lang.String r2 = r3.d     // Catch: java.lang.Throwable -> L1b
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
                r3.b = r1     // Catch: java.lang.Throwable -> L1b
                boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto L1d
                java.io.File r1 = r3.b     // Catch: java.lang.Throwable -> L1b
                boolean r1 = r1.delete()     // Catch: java.lang.Throwable -> L1b
                if (r1 != 0) goto L1d
                r3.a = r0     // Catch: java.lang.Throwable -> L1b
                return r0
            L1b:
                r1 = move-exception
                goto L2a
            L1d:
                java.io.File r1 = r3.b     // Catch: java.lang.Throwable -> L1b
                boolean r1 = r1.createNewFile()     // Catch: java.lang.Throwable -> L1b
                if (r1 != 0) goto L28
                r3.a = r0     // Catch: java.lang.Throwable -> L1b
                return r0
            L28:
                r0 = 1
                return r0
            L2a:
                com.tencent.bugly.proguard.al.a(r1)
                r3.a = r0
                return r0
        }

        public final boolean a(java.lang.String r10) {
                r9 = this;
                boolean r0 = r9.a
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = 0
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e
                java.io.File r3 = r9.b     // Catch: java.lang.Throwable -> L2e
                r4 = 1
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r0 = "UTF-8"
                byte[] r10 = r10.getBytes(r0)     // Catch: java.lang.Throwable -> L2b
                r2.write(r10)     // Catch: java.lang.Throwable -> L2b
                r2.flush()     // Catch: java.lang.Throwable -> L2b
                r2.close()     // Catch: java.lang.Throwable -> L2b
                long r5 = r9.e     // Catch: java.lang.Throwable -> L2b
                int r10 = r10.length     // Catch: java.lang.Throwable -> L2b
                long r7 = (long) r10     // Catch: java.lang.Throwable -> L2b
                long r5 = r5 + r7
                r9.e = r5     // Catch: java.lang.Throwable -> L2b
                r9.a = r4     // Catch: java.lang.Throwable -> L2b
                r2.close()     // Catch: java.io.IOException -> L2a
            L2a:
                return r4
            L2b:
                r10 = move-exception
                r0 = r2
                goto L2f
            L2e:
                r10 = move-exception
            L2f:
                com.tencent.bugly.proguard.al.a(r10)     // Catch: java.lang.Throwable -> L3a
                r9.a = r1     // Catch: java.lang.Throwable -> L3a
                if (r0 == 0) goto L39
                r0.close()     // Catch: java.io.IOException -> L39
            L39:
                return r1
            L3a:
                r10 = move-exception
                if (r0 == 0) goto L40
                r0.close()     // Catch: java.io.IOException -> L40
            L40:
                throw r10
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.tencent.bugly.proguard.ao.f13q = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "MM-dd HH:mm:ss"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.ao.c = r0     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            com.tencent.bugly.proguard.al.b(r0)
            return
    }

    public ao() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6) {
            java.lang.StringBuilder r0 = com.tencent.bugly.proguard.ao.e
            r1 = 0
            r0.setLength(r1)
            int r0 = r5.length()
            r1 = 30720(0x7800, float:4.3048E-41)
            if (r0 <= r1) goto L1d
            int r0 = r5.length()
            int r0 = r0 - r1
            int r1 = r5.length()
            int r1 = r1 + (-1)
            java.lang.String r5 = r5.substring(r0, r1)
        L1d:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r1 = com.tencent.bugly.proguard.ao.c
            if (r1 == 0) goto L2b
            java.lang.String r0 = r1.format(r0)
            goto L2f
        L2b:
            java.lang.String r0 = r0.toString()
        L2f:
            java.lang.StringBuilder r1 = com.tencent.bugly.proguard.ao.e
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            int r2 = com.tencent.bugly.proguard.ao.p
            r1.append(r2)
            r1.append(r0)
            r1.append(r6)
            r1.append(r0)
            r1.append(r3)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r3 = ": "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = "\u0001\r\n"
            r1.append(r3)
            java.lang.StringBuilder r3 = com.tencent.bugly.proguard.ao.e
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static void a(int r2) {
            java.lang.Object r0 = com.tencent.bugly.proguard.ao.f13q
            monitor-enter(r0)
            com.tencent.bugly.proguard.ao.d = r2     // Catch: java.lang.Throwable -> Lb
            if (r2 >= 0) goto Ld
            r2 = 0
            com.tencent.bugly.proguard.ao.d = r2     // Catch: java.lang.Throwable -> Lb
            goto L13
        Lb:
            r2 = move-exception
            goto L15
        Ld:
            r1 = 30720(0x7800, float:4.3048E-41)
            if (r2 <= r1) goto L13
            com.tencent.bugly.proguard.ao.d = r1     // Catch: java.lang.Throwable -> Lb
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public static synchronized void a(android.content.Context r3) {
            java.lang.Class<com.tencent.bugly.proguard.ao> r0 = com.tencent.bugly.proguard.ao.class
            monitor-enter(r0)
            boolean r1 = com.tencent.bugly.proguard.ao.m     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L6f
            if (r3 == 0) goto L6f
            boolean r1 = com.tencent.bugly.proguard.ao.b     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto Le
            goto L6f
        Le:
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.ao.o = r1     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.ao.f = r1     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.ao.e = r1     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.ao.k = r3     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.aa r3 = com.tencent.bugly.proguard.aa.a(r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.d     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.ao.i = r3     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = ""
            com.tencent.bugly.proguard.ao.j = r3     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>()     // Catch: java.lang.Throwable -> L68
            android.content.Context r1 = com.tencent.bugly.proguard.ao.k     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L68
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "/buglylog_"
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = com.tencent.bugly.proguard.ao.i     // Catch: java.lang.Throwable -> L68
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "_"
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = com.tencent.bugly.proguard.ao.j     // Catch: java.lang.Throwable -> L68
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = ".txt"
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.ao.l = r3     // Catch: java.lang.Throwable -> L68
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L68
            com.tencent.bugly.proguard.ao.p = r3     // Catch: java.lang.Throwable -> L68
        L68:
            r3 = 1
            com.tencent.bugly.proguard.ao.m = r3     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)
            return
        L6d:
            r3 = move-exception
            goto L71
        L6f:
            monitor-exit(r0)
            return
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r3
    }

    public static synchronized void a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.Class<com.tencent.bugly.proguard.ao> r0 = com.tencent.bugly.proguard.ao.class
            monitor-enter(r0)
            boolean r1 = com.tencent.bugly.proguard.ao.m     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L31
            boolean r1 = com.tencent.bugly.proguard.ao.b     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto Lc
            goto L31
        Lc:
            boolean r1 = com.tencent.bugly.proguard.ao.n     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r1 == 0) goto L20
            java.util.concurrent.ExecutorService r1 = com.tencent.bugly.proguard.ao.o     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            com.tencent.bugly.proguard.ao$1 r2 = new com.tencent.bugly.proguard.ao$1     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r1.execute(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            monitor-exit(r0)
            return
        L1c:
            r3 = move-exception
            goto L33
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            java.util.concurrent.ExecutorService r1 = com.tencent.bugly.proguard.ao.o     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            com.tencent.bugly.proguard.ao$2 r2 = new com.tencent.bugly.proguard.ao$2     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r1.execute(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            monitor-exit(r0)
            return
        L2c:
            com.tencent.bugly.proguard.al.b(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L31:
            monitor-exit(r0)
            return
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    public static void a(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r4.getMessage()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 10
            r1.append(r0)
            java.lang.String r4 = com.tencent.bugly.proguard.ap.b(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            a(r2, r3, r4)
            return
    }

    public static byte[] a() {
            boolean r0 = com.tencent.bugly.proguard.ao.a
            if (r0 == 0) goto L17
            boolean r0 = com.tencent.bugly.proguard.ao.b
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.StringBuilder r0 = com.tencent.bugly.proguard.ao.f
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BuglyLog.txt"
            byte[] r0 = com.tencent.bugly.proguard.ap.a(r0, r1)
            return r0
        L17:
            byte[] r0 = c()
            return r0
    }

    private static java.lang.String b() {
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.b()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L13
            com.tencent.bugly.proguard.q r0 = r0.N     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getLogFromNative()     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L13:
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean b(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = d(r0, r1, r2)
            return r0
    }

    static /* synthetic */ void c(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            e(r0, r1, r2)
            return
    }

    private static byte[] c() {
            boolean r0 = com.tencent.bugly.proguard.ao.b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = com.tencent.bugly.proguard.ao.n
            r1 = 1
            if (r0 == 0) goto L31
            java.lang.String r0 = "[LogUtil] Get user log from native."
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.al.a(r0, r3)
            java.lang.String r0 = b()
            if (r0 == 0) goto L31
            java.lang.String r3 = "[LogUtil] Got user log from native: %d bytes"
            int r4 = r0.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            com.tencent.bugly.proguard.al.a(r3, r1)
            java.lang.String r1 = "BuglyNativeLog.txt"
            byte[] r0 = com.tencent.bugly.proguard.ap.a(r0, r1)
            return r0
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r2 = com.tencent.bugly.proguard.ao.f13q
            monitor-enter(r2)
            com.tencent.bugly.proguard.ao$a r3 = com.tencent.bugly.proguard.ao.h     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5f
            boolean r4 = r3.a     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L5f
            java.io.File r3 = r3.b     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5f
            long r3 = r3.length()     // Catch: java.lang.Throwable -> L5d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L5f
            com.tencent.bugly.proguard.ao$a r3 = com.tencent.bugly.proguard.ao.h     // Catch: java.lang.Throwable -> L5d
            java.io.File r3 = r3.b     // Catch: java.lang.Throwable -> L5d
            r4 = 30720(0x7800, float:4.3048E-41)
            java.lang.String r1 = com.tencent.bugly.proguard.ap.a(r3, r4, r1)     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r0 = move-exception
            goto L7e
        L5f:
            java.lang.StringBuilder r1 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L72
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L5d
            if (r1 <= 0) goto L72
            java.lang.StringBuilder r1 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
        L72:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BuglyLog.txt"
            byte[] r0 = com.tencent.bugly.proguard.ap.a(r0, r1)
            return r0
        L7e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5d
            throw r0
    }

    private static boolean d(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.b()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L13
            com.tencent.bugly.proguard.q r0 = r0.N     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L13
            boolean r1 = r0.appendLogToNative(r1, r2, r3)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            com.tencent.bugly.proguard.al.a(r1)
        L13:
            r1 = 0
            return r1
    }

    private static synchronized void e(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.Class<com.tencent.bugly.proguard.ao> r0 = com.tencent.bugly.proguard.ao.class
            monitor-enter(r0)
            boolean r1 = com.tencent.bugly.proguard.ao.a     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            f(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            goto L13
        Le:
            g(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    private static synchronized void f(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.Class<com.tencent.bugly.proguard.ao> r0 = com.tencent.bugly.proguard.ao.class
            monitor-enter(r0)
            int r1 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L3a
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = a(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = com.tencent.bugly.proguard.ao.f13q     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r5 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L30
            r5.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r3 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L30
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L30
            int r5 = com.tencent.bugly.proguard.ao.d     // Catch: java.lang.Throwable -> L30
            if (r3 < r5) goto L34
            java.lang.StringBuilder r3 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "\u0001\r\n"
            int r5 = r3.indexOf(r5)     // Catch: java.lang.Throwable -> L30
            int r5 = r5 + 1
            r1 = 0
            java.lang.StringBuilder r3 = r3.delete(r1, r5)     // Catch: java.lang.Throwable -> L30
            com.tencent.bugly.proguard.ao.f = r3     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r3 = move-exception
            com.tencent.bugly.proguard.al.b(r3)     // Catch: java.lang.Throwable -> L37
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            return
        L37:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r3
    }

    private static synchronized void g(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.lang.Class<com.tencent.bugly.proguard.ao> r0 = com.tencent.bugly.proguard.ao.class
            monitor-enter(r0)
            int r1 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L73
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = a(r5, r6, r7, r1)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = com.tencent.bugly.proguard.ao.f13q     // Catch: java.lang.Throwable -> L73
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r7 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L6e
            r7.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r5 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L6e
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L6e
            int r7 = com.tencent.bugly.proguard.ao.d     // Catch: java.lang.Throwable -> L6e
            if (r5 > r7) goto L23
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return
        L21:
            r5 = move-exception
            goto L71
        L23:
            boolean r5 = com.tencent.bugly.proguard.ao.g     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L2a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return
        L2a:
            r5 = 1
            com.tencent.bugly.proguard.ao.g = r5     // Catch: java.lang.Throwable -> L6e
            com.tencent.bugly.proguard.ao$a r5 = com.tencent.bugly.proguard.ao.h     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L3b
            com.tencent.bugly.proguard.ao$a r5 = new com.tencent.bugly.proguard.ao$a     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = com.tencent.bugly.proguard.ao.l     // Catch: java.lang.Throwable -> L6e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L6e
            com.tencent.bugly.proguard.ao.h = r5     // Catch: java.lang.Throwable -> L6e
            goto L58
        L3b:
            java.io.File r5 = r5.b     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L53
            long r1 = r5.length()     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r5 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L6e
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L6e
            long r3 = (long) r5     // Catch: java.lang.Throwable -> L6e
            long r1 = r1 + r3
            com.tencent.bugly.proguard.ao$a r5 = com.tencent.bugly.proguard.ao.h     // Catch: java.lang.Throwable -> L6e
            long r3 = r5.c     // Catch: java.lang.Throwable -> L6e
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L58
        L53:
            com.tencent.bugly.proguard.ao$a r5 = com.tencent.bugly.proguard.ao.h     // Catch: java.lang.Throwable -> L6e
            r5.a()     // Catch: java.lang.Throwable -> L6e
        L58:
            com.tencent.bugly.proguard.ao$a r5 = com.tencent.bugly.proguard.ao.h     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r7 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L6e
            boolean r5 = r5.a(r7)     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L6e
            java.lang.StringBuilder r5 = com.tencent.bugly.proguard.ao.f     // Catch: java.lang.Throwable -> L6e
            r7 = 0
            r5.setLength(r7)     // Catch: java.lang.Throwable -> L6e
            com.tencent.bugly.proguard.ao.g = r7     // Catch: java.lang.Throwable -> L6e
        L6e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return
        L71:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            throw r5     // Catch: java.lang.Throwable -> L73
        L73:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r5
    }
}
