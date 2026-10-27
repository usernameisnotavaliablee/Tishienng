package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ay {
    public static com.tencent.bugly.proguard.ay f;
    public final java.util.concurrent.atomic.AtomicBoolean a;
    public final android.app.ActivityManager b;
    final com.tencent.bugly.proguard.aa c;
    final com.tencent.bugly.proguard.ak d;
    java.lang.String e;
    private final android.content.Context g;
    private final com.tencent.bugly.proguard.ac h;
    private final com.tencent.bugly.proguard.as i;
    private final java.lang.Object j;
    private android.os.FileObserver k;
    private boolean l;
    private com.tencent.bugly.proguard.bg m;
    private int n;
    private long o;





    public ay(android.content.Context r5, com.tencent.bugly.proguard.ac r6, com.tencent.bugly.proguard.aa r7, com.tencent.bugly.proguard.ak r8, com.tencent.bugly.proguard.as r9) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.j = r0
            r0 = 1
            r4.l = r0
            r2 = 0
            r4.o = r2
            android.content.Context r0 = com.tencent.bugly.proguard.ap.a(r5)
            r4.g = r0
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r4.b = r0
            java.lang.String r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getDumpFilePath()
            boolean r0 = com.tencent.bugly.proguard.ap.b(r0)
            if (r0 == 0) goto L40
            java.lang.String r0 = "bugly"
            java.io.File r5 = r5.getDir(r0, r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r4.e = r5
            goto L46
        L40:
            java.lang.String r5 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getDumpFilePath()
            r4.e = r5
        L46:
            r4.c = r7
            r4.d = r8
            r4.h = r6
            r4.i = r9
            return
    }

    private com.tencent.bugly.crashreport.crash.CrashDetailBean a(com.tencent.bugly.proguard.ax r5) {
            r4 = this;
            com.tencent.bugly.crashreport.crash.CrashDetailBean r0 = new com.tencent.bugly.crashreport.crash.CrashDetailBean
            r0.<init>()
            long r1 = com.tencent.bugly.proguard.ab.j()     // Catch: java.lang.Throwable -> L87
            r0.C = r1     // Catch: java.lang.Throwable -> L87
            long r1 = com.tencent.bugly.proguard.ab.f()     // Catch: java.lang.Throwable -> L87
            r0.D = r1     // Catch: java.lang.Throwable -> L87
            long r1 = com.tencent.bugly.proguard.ab.l()     // Catch: java.lang.Throwable -> L87
            r0.E = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            long r1 = r1.k()     // Catch: java.lang.Throwable -> L87
            r0.F = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            long r1 = r1.j()     // Catch: java.lang.Throwable -> L87
            r0.G = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            long r1 = r1.l()     // Catch: java.lang.Throwable -> L87
            r0.H = r1     // Catch: java.lang.Throwable -> L87
            android.content.Context r1 = r4.g     // Catch: java.lang.Throwable -> L87
            long r1 = com.tencent.bugly.proguard.ab.b(r1)     // Catch: java.lang.Throwable -> L87
            r0.I = r1     // Catch: java.lang.Throwable -> L87
            long r1 = com.tencent.bugly.proguard.ab.g()     // Catch: java.lang.Throwable -> L87
            r0.J = r1     // Catch: java.lang.Throwable -> L87
            long r1 = com.tencent.bugly.proguard.ab.h()     // Catch: java.lang.Throwable -> L87
            r0.K = r1     // Catch: java.lang.Throwable -> L87
            r1 = 3
            r0.b = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.g()     // Catch: java.lang.Throwable -> L87
            r0.e = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r1.o     // Catch: java.lang.Throwable -> L87
            r0.f = r2     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.q()     // Catch: java.lang.Throwable -> L87
            r0.g = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.f()     // Catch: java.lang.Throwable -> L87
            r0.m = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = "ANR_EXCEPTION"
            r0.n = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r5.f     // Catch: java.lang.Throwable -> L87
            r0.o = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r5.g     // Catch: java.lang.Throwable -> L87
            r0.f10q = r1     // Catch: java.lang.Throwable -> L87
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L87
            r0.T = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "BUGLY_CR_01"
            java.lang.String r3 = r5.e     // Catch: java.lang.Throwable -> L87
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r0.f10q     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L8a
            java.lang.String r2 = "\n"
            int r1 = r1.indexOf(r2)     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r5 = move-exception
            goto L106
        L8a:
            r1 = -1
        L8b:
            if (r1 <= 0) goto L95
            java.lang.String r2 = r0.f10q     // Catch: java.lang.Throwable -> L87
            r3 = 0
            java.lang.String r1 = r2.substring(r3, r1)     // Catch: java.lang.Throwable -> L87
            goto L97
        L95:
            java.lang.String r1 = "GET_FAIL"
        L97:
            r0.p = r1     // Catch: java.lang.Throwable -> L87
            long r1 = r5.c     // Catch: java.lang.Throwable -> L87
            r0.r = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r0.f10q     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto Lab
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = com.tencent.bugly.proguard.ap.c(r1)     // Catch: java.lang.Throwable -> L87
            r0.u = r1     // Catch: java.lang.Throwable -> L87
        Lab:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.b     // Catch: java.lang.Throwable -> L87
            r0.z = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L87
            r0.A = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = "main(1)"
            r0.B = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.s()     // Catch: java.lang.Throwable -> L87
            r0.L = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            java.util.Map r1 = r1.p()     // Catch: java.lang.Throwable -> L87
            r0.h = r1     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r1 = r4.c     // Catch: java.lang.Throwable -> L87
            java.util.Map r1 = r1.A()     // Catch: java.lang.Throwable -> L87
            r0.i = r1     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = r5.d     // Catch: java.lang.Throwable -> L87
            r0.v = r5     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r5 = r4.c     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r5.u     // Catch: java.lang.Throwable -> L87
            r0.P = r1     // Catch: java.lang.Throwable -> L87
            long r1 = r5.a     // Catch: java.lang.Throwable -> L87
            r0.Q = r1     // Catch: java.lang.Throwable -> L87
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> L87
            r0.R = r5     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r5 = r4.c     // Catch: java.lang.Throwable -> L87
            int r5 = r5.z()     // Catch: java.lang.Throwable -> L87
            r0.U = r5     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r5 = r4.c     // Catch: java.lang.Throwable -> L87
            int r1 = r5.x     // Catch: java.lang.Throwable -> L87
            r0.V = r1     // Catch: java.lang.Throwable -> L87
            java.util.Map r5 = r5.t()     // Catch: java.lang.Throwable -> L87
            r0.W = r5     // Catch: java.lang.Throwable -> L87
            com.tencent.bugly.proguard.aa r5 = r4.c     // Catch: java.lang.Throwable -> L87
            java.util.Map r5 = r5.y()     // Catch: java.lang.Throwable -> L87
            r0.X = r5     // Catch: java.lang.Throwable -> L87
            byte[] r5 = com.tencent.bugly.proguard.ao.a()     // Catch: java.lang.Throwable -> L87
            r0.y = r5     // Catch: java.lang.Throwable -> L87
            return r0
        L106:
            com.tencent.bugly.proguard.al.a(r5)
            return r0
    }

    public static synchronized com.tencent.bugly.proguard.ay a() {
            java.lang.Class<com.tencent.bugly.proguard.ay> r0 = com.tencent.bugly.proguard.ay.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.ay r1 = com.tencent.bugly.proguard.ay.f     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static java.lang.String a(java.util.List<com.tencent.bugly.proguard.ba> r9, long r10) {
            if (r9 == 0) goto L7d
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L9
            goto L7d
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1)
            java.lang.String r1 = "\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n"
            r0.append(r1)
            java.lang.String r1 = "\n>>>>> Thread Stack Traces Records Start >>>>>\n"
            r0.append(r1)
            r1 = 0
        L1b:
            int r2 = r9.size()
            if (r1 >= r2) goto L73
            java.lang.Object r2 = r9.get(r1)
            com.tencent.bugly.proguard.ba r2 = (com.tencent.bugly.proguard.ba) r2
            java.lang.String r3 = "Thread name:"
            r0.append(r3)
            java.lang.String r3 = r2.a
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            long r4 = r2.b
            long r4 = r4 - r10
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L42
            java.lang.String r6 = "before "
            goto L44
        L42:
            java.lang.String r6 = "after "
        L44:
            java.lang.String r7 = "Got "
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = "anr:"
            r0.append(r6)
            long r4 = java.lang.Math.abs(r4)
            r0.append(r4)
            java.lang.String r4 = "ms\n"
            r0.append(r4)
            java.lang.String r2 = r2.c
            r0.append(r2)
            r0.append(r3)
            int r2 = r0.length()
            int r2 = r2 * 2
            r3 = 101376(0x18c00, float:1.42058E-40)
            if (r2 >= r3) goto L73
            int r1 = r1 + 1
            goto L1b
        L73:
            java.lang.String r9 = "\n<<<<< Thread Stack Traces Records End <<<<<\n"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L7d:
            java.lang.String r9 = "main thread stack not enable"
            return r9
    }

    static /* synthetic */ void a(com.tencent.bugly.proguard.ay r5) {
            long r0 = com.tencent.bugly.proguard.at.j
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            long r2 = com.tencent.bugly.proguard.ap.b()
            long r0 = r0 - r2
            java.lang.String r2 = r5.e
            java.lang.String r3 = "bugly_trace_"
            java.lang.String r4 = ".txt"
            com.tencent.bugly.proguard.am.a(r2, r3, r4, r0)
            java.lang.String r2 = r5.e
            java.lang.String r3 = "manual_bugly_trace_"
            com.tencent.bugly.proguard.am.a(r2, r3, r4, r0)
            java.lang.String r2 = r5.e
            java.lang.String r3 = "main_stack_record_"
            com.tencent.bugly.proguard.am.a(r2, r3, r4, r0)
            java.lang.String r5 = r5.e
            java.lang.String r2 = ".txt.merged"
            com.tencent.bugly.proguard.am.a(r5, r3, r2, r0)
            return
    }

    static /* synthetic */ void a(com.tencent.bugly.proguard.ay r0, long r1, java.lang.String r3) {
            r0.a(r1, r3)
            return
    }

    private static boolean a(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r0 = 1
            com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a r10 = com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTargetDumpInfo(r12, r10, r0)
            r1 = 0
            if (r10 == 0) goto Lcd
            java.util.Map<java.lang.String, java.lang.String[]> r2 = r10.d
            if (r2 == 0) goto Lcd
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L14
            goto Lcd
        L14:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r2 = 1024(0x400, float:1.435E-42)
            r12.<init>(r2)
            java.util.Map<java.lang.String, java.lang.String[]> r2 = r10.d
            java.lang.String r3 = "main"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.String r4 = "\n\n"
            java.lang.String r5 = "\n"
            java.lang.String r6 = " :\n"
            r7 = 3
            r8 = 2
            if (r2 == 0) goto L4f
            int r9 = r2.length
            if (r9 < r7) goto L4f
            java.lang.String r9 = "\"main\" tid="
            r12.append(r9)
            r9 = r2[r8]
            r12.append(r9)
            r12.append(r6)
            r9 = r2[r1]
            r12.append(r9)
            r12.append(r5)
            r2 = r2[r0]
            r12.append(r2)
            r12.append(r4)
        L4f:
            java.util.Map<java.lang.String, java.lang.String[]> r10 = r10.d
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L59:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lbe
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r9 = r2.getKey()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L59
            java.lang.Object r9 = r2.getValue()
            if (r9 == 0) goto L59
            java.lang.Object r9 = r2.getValue()
            java.lang.String[] r9 = (java.lang.String[]) r9
            int r9 = r9.length
            if (r9 < r7) goto L59
            java.lang.String r9 = "\""
            r12.append(r9)
            java.lang.Object r9 = r2.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r12.append(r9)
            java.lang.String r9 = "\" tid="
            r12.append(r9)
            java.lang.Object r9 = r2.getValue()
            java.lang.String[] r9 = (java.lang.String[]) r9
            r9 = r9[r8]
            r12.append(r9)
            r12.append(r6)
            java.lang.Object r9 = r2.getValue()
            java.lang.String[] r9 = (java.lang.String[]) r9
            r9 = r9[r1]
            r12.append(r9)
            r12.append(r5)
            java.lang.Object r2 = r2.getValue()
            java.lang.String[] r2 = (java.lang.String[]) r2
            r2 = r2[r0]
            r12.append(r2)
            r12.append(r4)
            goto L59
        Lbe:
            java.lang.String r10 = r12.toString()
            int r12 = r12.length()
            int r12 = r12 * 2
            boolean r10 = com.tencent.bugly.proguard.am.a(r11, r10, r12)
            return r10
        Lcd:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r1] = r12
            java.lang.String r11 = "not found trace dump for %s"
            com.tencent.bugly.proguard.al.e(r11, r10)
            return r1
    }

    private synchronized void c() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.e()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 == 0) goto L13
            java.lang.String r0 = "start when started!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L11:
            r0 = move-exception
            goto L42
        L13:
            com.tencent.bugly.proguard.ay$1 r0 = new com.tencent.bugly.proguard.ay$1     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "/data/anr/"
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L11
            r3.k = r0     // Catch: java.lang.Throwable -> L11
            r0.startWatching()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "start anr monitor!"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L32
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L32
            com.tencent.bugly.proguard.ak r0 = r3.d     // Catch: java.lang.Throwable -> L32
            com.tencent.bugly.proguard.ay$2 r2 = new com.tencent.bugly.proguard.ay$2     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r0.a(r2)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            return
        L32:
            r0 = move-exception
            r2 = 0
            r3.k = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "start anr monitor failed!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r2, r1)     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    private synchronized void c(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto La
            r0.g()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            goto Lf
        La:
            r0.h()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    private synchronized void d() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.e()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 != 0) goto L13
            java.lang.String r0 = "close when closed!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L11:
            r0 = move-exception
            goto L31
        L13:
            android.os.FileObserver r0 = r3.k     // Catch: java.lang.Throwable -> L24
            r0.stopWatching()     // Catch: java.lang.Throwable -> L24
            r0 = 0
            r3.k = r0     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "close anr monitor!"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.al.d(r0, r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return
        L24:
            r0 = move-exception
            java.lang.String r2 = "stop anr monitor failed!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r2, r1)     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    private synchronized void d(boolean r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.l     // Catch: java.lang.Throwable -> L17
            if (r0 == r5) goto L19
            java.lang.String r0 = "user change anr %b"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L17
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Throwable -> L17
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L17
            r4.l = r5     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r5 = move-exception
            goto L1b
        L19:
            monitor-exit(r4)
            return
        L1b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L17
            throw r5
    }

    private synchronized boolean e() {
            r1 = this;
            monitor-enter(r1)
            android.os.FileObserver r0 = r1.k     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    private synchronized boolean f() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.l     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    private synchronized void g() {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.e()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r0 = "start when started!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r6)
            return
        L11:
            r0 = move-exception
            goto L9f
        L14:
            java.lang.String r0 = r6.e     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L1e
            monitor-exit(r6)
            return
        L1e:
            java.lang.Object r0 = r6.j     // Catch: java.lang.Throwable -> L11
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.bg r2 = r6.m     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            boolean r2 = r2.isAlive()     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L68
            goto L2e
        L2c:
            r1 = move-exception
            goto L9d
        L2e:
            com.tencent.bugly.proguard.bg r2 = new com.tencent.bugly.proguard.bg     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            r6.m = r2     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.aa r3 = r6.c     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3.S     // Catch: java.lang.Throwable -> L2c
            r2.b = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "set record stack trace enable:"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.bg r2 = r6.m     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "Bugly-ThreadMonitor"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = r6.n     // Catch: java.lang.Throwable -> L2c
            int r5 = r4 + 1
            r6.n = r5     // Catch: java.lang.Throwable -> L2c
            r3.append(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2c
            r2.setName(r3)     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.bg r2 = r6.m     // Catch: java.lang.Throwable -> L2c
            r2.b()     // Catch: java.lang.Throwable -> L2c
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.ay$3 r0 = new com.tencent.bugly.proguard.ay$3     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r6.e     // Catch: java.lang.Throwable -> L11
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L11
            r6.k = r0     // Catch: java.lang.Throwable -> L11
            r0.startWatching()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "startWatchingPrivateAnrDir! dumFilePath is %s"
            java.lang.String r2 = r6.e     // Catch: java.lang.Throwable -> L8d
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8d
            r3[r1] = r2     // Catch: java.lang.Throwable -> L8d
            com.tencent.bugly.proguard.al.a(r0, r3)     // Catch: java.lang.Throwable -> L8d
            com.tencent.bugly.proguard.ak r0 = r6.d     // Catch: java.lang.Throwable -> L8d
            com.tencent.bugly.proguard.ay$4 r2 = new com.tencent.bugly.proguard.ay$4     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            r0.a(r2)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r6)
            return
        L8d:
            r0 = move-exception
            r2 = 0
            r6.k = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "startWatchingPrivateAnrDir failed!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r2, r1)     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r6)
            return
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L11
        L9f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    private synchronized void h() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.e()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 != 0) goto L13
            java.lang.String r0 = "close when closed!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)
            return
        L11:
            r0 = move-exception
            goto L4a
        L13:
            java.lang.Object r0 = r4.j     // Catch: java.lang.Throwable -> L11
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.bg r2 = r4.m     // Catch: java.lang.Throwable -> L21
            r3 = 0
            if (r2 == 0) goto L23
            r2.a()     // Catch: java.lang.Throwable -> L21
            r4.m = r3     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r1 = move-exception
            goto L48
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "stopWatchingPrivateAnrDir"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L11
            android.os.FileObserver r0 = r4.k     // Catch: java.lang.Throwable -> L3b
            r0.stopWatching()     // Catch: java.lang.Throwable -> L3b
            r4.k = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "close anr monitor!"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3b
            com.tencent.bugly.proguard.al.d(r0, r2)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)
            return
        L3b:
            r0 = move-exception
            java.lang.String r2 = "stop anr monitor failed!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r2, r1)     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)
            return
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1     // Catch: java.lang.Throwable -> L11
        L4a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    final void a(long r25, java.lang.String r27) {
            r24 = this;
            r1 = r24
            r2 = r25
            r0 = r27
            r4 = 0
            java.lang.String r5 = "anr time:%s"
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L5c
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5c
            r8[r4] = r6     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r5, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r1.j     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.bg r6 = r1.m     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L2c
            java.lang.String r6 = "Disable record main stack trace."
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L29
            com.tencent.bugly.proguard.al.c(r6, r8)     // Catch: java.lang.Throwable -> L29
            com.tencent.bugly.proguard.bg r6 = r1.m     // Catch: java.lang.Throwable -> L29
            r6.c()     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r0 = move-exception
            goto L202
        L2c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L29
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L5c
            java.lang.Thread r5 = r5.getThread()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = com.tencent.bugly.proguard.ap.a(r5)     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.aa r6 = r1.c     // Catch: java.lang.Throwable -> L5c
            boolean r6 = r6.R     // Catch: java.lang.Throwable -> L5c
            int r8 = com.tencent.bugly.proguard.at.h     // Catch: java.lang.Throwable -> L5c
            java.util.Map r6 = com.tencent.bugly.proguard.ap.a(r6, r8)     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.aa r8 = r1.c     // Catch: java.lang.Throwable -> L5c
            boolean r8 = r8.a()     // Catch: java.lang.Throwable -> L5c
            r9 = 0
            if (r8 == 0) goto L79
            boolean r8 = com.tencent.bugly.proguard.ab.o()     // Catch: java.lang.Throwable -> L5c
            if (r8 != 0) goto L5f
            boolean r8 = com.tencent.bugly.proguard.ab.p()     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L5a
            goto L5f
        L5a:
            r8 = 0
            goto L60
        L5c:
            r0 = move-exception
            goto L204
        L5f:
            r8 = 1
        L60:
            java.lang.String r11 = "isAnrCrashDevice:%s"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5c
            r13[r4] = r12     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r11, r13)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L70
            goto L79
        L70:
            android.app.ActivityManager r8 = r1.b     // Catch: java.lang.Throwable -> L5c
            r11 = 21000(0x5208, double:1.03754E-319)
            android.app.ActivityManager$ProcessErrorStateInfo r8 = com.tencent.bugly.proguard.az.a(r8, r11)     // Catch: java.lang.Throwable -> L5c
            goto L7f
        L79:
            android.app.ActivityManager r8 = r1.b     // Catch: java.lang.Throwable -> L5c
            android.app.ActivityManager$ProcessErrorStateInfo r8 = com.tencent.bugly.proguard.az.a(r8, r9)     // Catch: java.lang.Throwable -> L5c
        L7f:
            if (r8 != 0) goto L8c
            java.lang.String r0 = "proc state is invisible or not my proc!"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r0, r2)     // Catch: java.lang.Throwable -> L5c
            r1.a(r4)
            return
        L8c:
            com.tencent.bugly.proguard.ax r11 = new com.tencent.bugly.proguard.ax     // Catch: java.lang.Throwable -> L5c
            r11.<init>()     // Catch: java.lang.Throwable -> L5c
            r11.c = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.String r12 = r8.processName     // Catch: java.lang.Throwable -> L5c
            r11.a = r12     // Catch: java.lang.Throwable -> L5c
            java.lang.String r12 = r8.shortMsg     // Catch: java.lang.Throwable -> L5c
            r11.f = r12     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r8.longMsg     // Catch: java.lang.Throwable -> L5c
            r11.e = r8     // Catch: java.lang.Throwable -> L5c
            r11.b = r6     // Catch: java.lang.Throwable -> L5c
            r11.g = r5     // Catch: java.lang.Throwable -> L5c
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto Lad
            java.lang.String r5 = "main stack is null , some error may be encountered."
            r11.g = r5     // Catch: java.lang.Throwable -> L5c
        Lad:
            java.lang.String r5 = "anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d"
            long r12 = r11.c     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r11.d     // Catch: java.lang.Throwable -> L5c
            java.lang.String r12 = r11.a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r13 = r11.g     // Catch: java.lang.Throwable -> L5c
            java.lang.String r14 = r11.f     // Catch: java.lang.Throwable -> L5c
            java.lang.String r15 = r11.e     // Catch: java.lang.Throwable -> L5c
            r16 = r9
            java.util.Map<java.lang.String, java.lang.String> r9 = r11.b     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto Lc7
            r9 = 0
            goto Lcb
        Lc7:
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L5c
        Lcb:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5c
            r10 = 7
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L5c
            r10[r4] = r6     // Catch: java.lang.Throwable -> L5c
            r10[r7] = r8     // Catch: java.lang.Throwable -> L5c
            r6 = 2
            r10[r6] = r12     // Catch: java.lang.Throwable -> L5c
            r6 = 3
            r10[r6] = r13     // Catch: java.lang.Throwable -> L5c
            r6 = 4
            r10[r6] = r14     // Catch: java.lang.Throwable -> L5c
            r6 = 5
            r10[r6] = r15     // Catch: java.lang.Throwable -> L5c
            r6 = 6
            r10[r6] = r9     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r5, r10)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "found visible anr , start to upload!"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.a(r5, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "trace file:%s"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5c
            r6[r4] = r0     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r5, r6)     // Catch: java.lang.Throwable -> L5c
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L190
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L10b
            goto L190
        L10b:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r1.e     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = "bugly_trace_"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L5c
            r8.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = ".txt"
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r6, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "trace file exists"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r6, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "/data/anr/"
            boolean r6 = r0.startsWith(r6)     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L14c
            java.lang.String r6 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r11.a     // Catch: java.lang.Throwable -> L5c
            boolean r0 = a(r0, r6, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "backup trace isOK:%s"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5c
            r8[r4] = r0     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.a(r6, r8)     // Catch: java.lang.Throwable -> L5c
            goto L162
        L14c:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r6.renameTo(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "trace file rename :%s"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5c
            r8[r4] = r0     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.a(r6, r8)     // Catch: java.lang.Throwable -> L5c
        L162:
            java.lang.Object r6 = r1.j     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.bg r0 = r1.m     // Catch: java.lang.Throwable -> L170
            if (r0 == 0) goto L172
            com.tencent.bugly.proguard.bf r0 = r0.a     // Catch: java.lang.Throwable -> L170
            java.util.List r0 = r0.c()     // Catch: java.lang.Throwable -> L170
            goto L173
        L170:
            r0 = move-exception
            goto L18e
        L172:
            r0 = 0
        L173:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L170
            if (r0 == 0) goto L187
            java.lang.String r0 = a(r0, r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "save main stack trace"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r6, r8)     // Catch: java.lang.Throwable -> L5c
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            com.tencent.bugly.proguard.am.a(r5, r0, r8, r7)     // Catch: java.lang.Throwable -> L5c
        L187:
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L5c
            r11.d = r0     // Catch: java.lang.Throwable -> L5c
            goto L197
        L18e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L170
            throw r0     // Catch: java.lang.Throwable -> L5c
        L190:
            java.lang.String r0 = "trace file is null or not exists, just ignore"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.c(r0, r5)     // Catch: java.lang.Throwable -> L5c
        L197:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r0 = r1.a(r11)     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.at r5 = com.tencent.bugly.proguard.at.a()     // Catch: java.lang.Throwable -> L5c
            r5.a(r0)     // Catch: java.lang.Throwable -> L5c
            long r5 = r0.a     // Catch: java.lang.Throwable -> L5c
            int r8 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r8 < 0) goto L1b0
            java.lang.String r5 = "backup anr record success!"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.a(r5, r6)     // Catch: java.lang.Throwable -> L5c
            goto L1b7
        L1b0:
            java.lang.String r5 = "backup anr record fail!"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.al.d(r5, r6)     // Catch: java.lang.Throwable -> L5c
        L1b7:
            java.lang.String r18 = "ANR"
            java.lang.String r19 = com.tencent.bugly.proguard.ap.a(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r11.a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r21 = "main"
            java.lang.String r3 = r11.g     // Catch: java.lang.Throwable -> L5c
            r23 = r0
            r20 = r2
            r22 = r3
            com.tencent.bugly.proguard.as.a(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L5c
            r0 = r23
            com.tencent.bugly.proguard.as r2 = r1.i     // Catch: java.lang.Throwable -> L5c
            boolean r3 = com.tencent.bugly.proguard.ab.r()     // Catch: java.lang.Throwable -> L5c
            r3 = r3 ^ r7
            boolean r2 = r2.a(r0, r3)     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L1e0
            com.tencent.bugly.proguard.as r2 = r1.i     // Catch: java.lang.Throwable -> L5c
            r2.b(r0, r7)     // Catch: java.lang.Throwable -> L5c
        L1e0:
            com.tencent.bugly.proguard.as r2 = r1.i     // Catch: java.lang.Throwable -> L5c
            r2.a(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r1.j     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5c
            com.tencent.bugly.proguard.bg r0 = r1.m     // Catch: java.lang.Throwable -> L1f9
            if (r0 == 0) goto L1fb
            java.lang.String r0 = "Finish anr process."
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1f9
            com.tencent.bugly.proguard.al.c(r0, r3)     // Catch: java.lang.Throwable -> L1f9
            com.tencent.bugly.proguard.bg r0 = r1.m     // Catch: java.lang.Throwable -> L1f9
            r0.d()     // Catch: java.lang.Throwable -> L1f9
            goto L1fb
        L1f9:
            r0 = move-exception
            goto L200
        L1fb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f9
            r1.a(r4)
            return
        L200:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f9
            throw r0     // Catch: java.lang.Throwable -> L5c
        L202:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L5c
        L204:
            com.tencent.bugly.proguard.al.b(r0)     // Catch: java.lang.Throwable -> L20b
            r1.a(r4)
            return
        L20b:
            r0 = move-exception
            r1.a(r4)
            throw r0
    }

    public final boolean a(long r7) {
            r6 = this;
            long r0 = r6.o
            long r0 = r7 - r0
            long r0 = java.lang.Math.abs(r0)
            r2 = 10000(0x2710, double:4.9407E-320)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L20
            r7 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r4] = r7
            java.lang.String r7 = "should not process ANR too Fre in %dms"
            com.tencent.bugly.proguard.al.d(r7, r0)
            return r8
        L20:
            r6.o = r7
            return r4
    }

    public final boolean a(boolean r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.a
            r1 = r5 ^ 1
            boolean r0 = r0.compareAndSet(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r1
            java.lang.String r5 = "tryChangeAnrState to %s, success:%s"
            com.tencent.bugly.proguard.al.c(r5, r2)
            return r0
    }

    public final synchronized void b() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "customer decides whether to open or close."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final void b(boolean r4) {
            r3 = this;
            r3.d(r4)
            boolean r4 = r3.f()
            com.tencent.bugly.proguard.ac r0 = com.tencent.bugly.proguard.ac.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1c
            if (r4 == 0) goto L1b
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r4 = r0.c()
            boolean r4 = r4.f
            if (r4 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            boolean r0 = r3.e()
            if (r4 == r0) goto L32
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "anr changed to %b"
            com.tencent.bugly.proguard.al.a(r0, r2)
            r3.c(r4)
        L32:
            return
    }
}
