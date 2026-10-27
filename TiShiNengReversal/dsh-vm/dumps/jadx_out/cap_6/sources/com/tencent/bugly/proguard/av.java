package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class av implements java.lang.Thread.UncaughtExceptionHandler {
    private static java.lang.String h;
    private static final java.lang.Object i = null;
    protected final android.content.Context a;
    protected final com.tencent.bugly.proguard.as b;
    protected final com.tencent.bugly.proguard.ac c;
    protected final com.tencent.bugly.proguard.aa d;
    protected java.lang.Thread.UncaughtExceptionHandler e;
    protected java.lang.Thread.UncaughtExceptionHandler f;
    protected boolean g;
    private int j;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.tencent.bugly.proguard.av.i = r0
            return
    }

    public av(android.content.Context r2, com.tencent.bugly.proguard.as r3, com.tencent.bugly.proguard.ac r4, com.tencent.bugly.proguard.aa r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    private static java.lang.String a(java.lang.Throwable r3) {
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            int r0 = r3.length()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 > r1) goto L12
            return r3
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r1)
            r0.append(r3)
            java.lang.String r3 = "\n[Message over limit size:1000, has been cutted!]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String a(java.lang.Throwable r6, int r7) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.StackTraceElement[] r2 = r6.getStackTrace()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L5c
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch: java.lang.Throwable -> L3d
            int r2 = r6.length     // Catch: java.lang.Throwable -> L3d
            r3 = 0
        L16:
            if (r3 >= r2) goto L5c
            r4 = r6[r3]     // Catch: java.lang.Throwable -> L3d
            if (r7 <= 0) goto L3f
            int r5 = r0.length()     // Catch: java.lang.Throwable -> L3d
            if (r5 < r7) goto L3f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "\n[Stack over limit size :"
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            r6.append(r7)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = " , has been cutted !]"
            r6.append(r7)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3d
            r0.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L3d
            return r6
        L3d:
            r6 = move-exception
            goto L4e
        L3f:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3d
            r0.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "\n"
            r0.append(r4)     // Catch: java.lang.Throwable -> L3d
            int r3 = r3 + 1
            goto L16
        L4e:
            java.lang.String r6 = r6.toString()
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r6
            java.lang.String r6 = "gen stack error %s"
            com.tencent.bugly.proguard.al.e(r6, r7)
        L5c:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private static void a(com.tencent.bugly.crashreport.crash.CrashDetailBean r7, java.lang.Throwable r8, boolean r9) {
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = a(r8)
            java.lang.StackTraceElement[] r2 = r8.getStackTrace()
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Throwable r3 = r8.getCause()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r2
            r6[r4] = r3
            java.lang.String r2 = "stack frame :%d, has cause %b"
            com.tencent.bugly.proguard.al.e(r2, r6)
            java.lang.StackTraceElement[] r2 = r8.getStackTrace()
            int r2 = r2.length
            java.lang.String r3 = ""
            if (r2 <= 0) goto L44
            java.lang.StackTraceElement[] r2 = r8.getStackTrace()
            r2 = r2[r5]
            java.lang.String r2 = r2.toString()
            goto L45
        L44:
            r2 = r3
        L45:
            r4 = r8
        L46:
            if (r4 == 0) goto L53
            java.lang.Throwable r6 = r4.getCause()
            if (r6 == 0) goto L53
            java.lang.Throwable r4 = r4.getCause()
            goto L46
        L53:
            if (r4 == 0) goto Lbc
            if (r4 == r8) goto Lbc
            java.lang.Class r8 = r4.getClass()
            java.lang.String r8 = r8.getName()
            r7.n = r8
            java.lang.String r8 = a(r4)
            r7.o = r8
            java.lang.StackTraceElement[] r8 = r4.getStackTrace()
            int r8 = r8.length
            if (r8 <= 0) goto L7a
            java.lang.StackTraceElement[] r8 = r4.getStackTrace()
            r8 = r8[r5]
            java.lang.String r8 = r8.toString()
            r7.p = r8
        L7a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = ":"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r0 = "\n"
            r8.append(r0)
            r8.append(r2)
            java.lang.String r1 = "\n......"
            r8.append(r1)
            java.lang.String r1 = "\nCaused by:\n"
            r8.append(r1)
            java.lang.String r1 = r7.n
            r8.append(r1)
            r8.append(r9)
            java.lang.String r9 = r7.o
            r8.append(r9)
            r8.append(r0)
            int r9 = com.tencent.bugly.proguard.at.h
            java.lang.String r9 = a(r4, r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.f10q = r8
            goto Lee
        Lbc:
            r7.n = r0
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            boolean r0 = r0.i()
            if (r0 == 0) goto Ld3
            if (r9 == 0) goto Ld3
            java.lang.String r9 = "This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.bugly.proguard.al.e(r9, r0)
            java.lang.String r3 = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]"
        Ld3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r7.o = r9
            r7.p = r2
            int r9 = com.tencent.bugly.proguard.at.h
            java.lang.String r9 = a(r8, r9)
            r7.f10q = r9
        Lee:
            java.lang.String r8 = r7.f10q
            byte[] r8 = r8.getBytes()
            java.lang.String r8 = com.tencent.bugly.proguard.ap.c(r8)
            r7.u = r8
            java.util.Map<java.lang.String, java.lang.String> r8 = r7.z
            java.lang.String r7 = r7.B
            r8.put(r7, r9)
            return
    }

    private static boolean a(java.lang.Thread.UncaughtExceptionHandler r7) {
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L17:
            if (r4 >= r2) goto L35
            r5 = r1[r4]
            java.lang.String r6 = r5.getClassName()
            java.lang.String r5 = r5.getMethodName()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L32
            java.lang.String r6 = "uncaughtException"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L32
            return r3
        L32:
            int r4 = r4 + 1
            goto L17
        L35:
            return r0
    }

    private static boolean a(java.lang.Thread r3) {
            java.lang.Object r0 = com.tencent.bugly.proguard.av.i
            monitor-enter(r0)
            java.lang.String r1 = com.tencent.bugly.proguard.av.h     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = com.tencent.bugly.proguard.av.h     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L14
            goto L19
        L14:
            r3 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r3
        L17:
            r3 = move-exception
            goto L22
        L19:
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L17
            com.tencent.bugly.proguard.av.h = r3     // Catch: java.lang.Throwable -> L17
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r3
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    private com.tencent.bugly.crashreport.crash.CrashDetailBean b(java.lang.Thread r7, java.lang.Throwable r8, boolean r9, java.lang.String r10, byte[] r11, boolean r12) {
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lc
            java.lang.String r7 = "We can do nothing with a null throwable."
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r7, r8)
            r7 = 0
            return r7
        Lc:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r1 = new com.tencent.bugly.crashreport.crash.CrashDetailBean
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r1.r = r2
            long r2 = com.tencent.bugly.proguard.ab.j()
            r1.C = r2
            long r2 = com.tencent.bugly.proguard.ab.f()
            r1.D = r2
            long r2 = com.tencent.bugly.proguard.ab.l()
            r1.E = r2
            com.tencent.bugly.proguard.aa r2 = r6.d
            long r2 = r2.k()
            r1.F = r2
            com.tencent.bugly.proguard.aa r2 = r6.d
            long r2 = r2.j()
            r1.G = r2
            com.tencent.bugly.proguard.aa r2 = r6.d
            long r2 = r2.l()
            r1.H = r2
            if (r9 != 0) goto L50
            int r2 = com.tencent.bugly.proguard.aa.B()
            r3 = 31
            if (r2 < r3) goto L50
            r2 = 0
            r1.I = r2
            goto L58
        L50:
            android.content.Context r2 = r6.a
            long r2 = com.tencent.bugly.proguard.ab.b(r2)
            r1.I = r2
        L58:
            long r2 = com.tencent.bugly.proguard.ab.g()
            r1.J = r2
            long r2 = com.tencent.bugly.proguard.ab.h()
            r1.K = r2
            byte[] r2 = com.tencent.bugly.proguard.ao.a()
            r1.y = r2
            if (r2 != 0) goto L6e
            r2 = 0
            goto L6f
        L6e:
            int r2 = r2.length
        L6f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r2
            java.lang.String r2 = "user log size:%d"
            com.tencent.bugly.proguard.al.a(r2, r4)
            if (r9 == 0) goto L81
            r2 = 0
            goto L82
        L81:
            r2 = 2
        L82:
            r1.b = r2
            com.tencent.bugly.proguard.aa r2 = r6.d
            java.lang.String r2 = r2.g()
            r1.e = r2
            com.tencent.bugly.proguard.aa r2 = r6.d
            java.lang.String r4 = r2.o
            r1.f = r4
            java.lang.String r2 = r2.q()
            r1.g = r2
            com.tencent.bugly.proguard.aa r2 = r6.d
            java.lang.String r2 = r2.f()
            r1.m = r2
            int r2 = com.tencent.bugly.proguard.at.h
            java.util.Map r12 = com.tencent.bugly.proguard.ap.a(r12, r2)
            r1.z = r12
            com.tencent.bugly.proguard.aa r12 = r6.d
            java.lang.String r12 = r12.d
            r1.A = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = r7.getName()
            r12.append(r2)
            java.lang.String r2 = "("
            r12.append(r2)
            long r4 = r7.getId()
            r12.append(r4)
            java.lang.String r7 = ")"
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            r1.B = r7
            com.tencent.bugly.proguard.aa r7 = r6.d
            java.lang.String r7 = r7.s()
            r1.L = r7
            com.tencent.bugly.proguard.aa r7 = r6.d
            java.util.Map r7 = r7.p()
            r1.h = r7
            com.tencent.bugly.proguard.aa r7 = r6.d
            java.util.Map r7 = r7.A()
            r1.i = r7
            com.tencent.bugly.proguard.aa r7 = r6.d
            long r4 = r7.a
            r1.Q = r4
            boolean r7 = r7.a()
            r1.R = r7
            a(r1, r8, r9)
            if (r9 != 0) goto L121
            if (r10 == 0) goto L106
            int r7 = r10.length()     // Catch: java.lang.Throwable -> L104
            if (r7 <= 0) goto L106
            r7 = 1
            goto L107
        L104:
            r7 = move-exception
            goto L13e
        L106:
            r7 = 0
        L107:
            if (r11 == 0) goto L10e
            int r8 = r11.length     // Catch: java.lang.Throwable -> L104
            if (r8 <= 0) goto L10e
            r8 = 1
            goto L10f
        L10e:
            r8 = 0
        L10f:
            if (r7 == 0) goto L11d
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Throwable -> L104
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L104
            r1.S = r7     // Catch: java.lang.Throwable -> L104
            java.lang.String r9 = "UserData"
            r7.put(r9, r10)     // Catch: java.lang.Throwable -> L104
        L11d:
            if (r8 == 0) goto L121
            r1.Y = r11     // Catch: java.lang.Throwable -> L104
        L121:
            com.tencent.bugly.proguard.aa r7 = r6.d     // Catch: java.lang.Throwable -> L104
            int r7 = r7.z()     // Catch: java.lang.Throwable -> L104
            r1.U = r7     // Catch: java.lang.Throwable -> L104
            com.tencent.bugly.proguard.aa r7 = r6.d     // Catch: java.lang.Throwable -> L104
            int r8 = r7.x     // Catch: java.lang.Throwable -> L104
            r1.V = r8     // Catch: java.lang.Throwable -> L104
            java.util.Map r7 = r7.t()     // Catch: java.lang.Throwable -> L104
            r1.W = r7     // Catch: java.lang.Throwable -> L104
            com.tencent.bugly.proguard.aa r7 = r6.d     // Catch: java.lang.Throwable -> L104
            java.util.Map r7 = r7.y()     // Catch: java.lang.Throwable -> L104
            r1.X = r7     // Catch: java.lang.Throwable -> L104
            return r1
        L13e:
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r0] = r7
            java.lang.String r7 = "handle crash error %s"
            com.tencent.bugly.proguard.al.e(r7, r8)
            return r1
    }

    private static void c() {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "current process die"
            com.tencent.bugly.proguard.al.e(r1, r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r0 = 1
            java.lang.System.exit(r0)
            return
    }

    public final synchronized void a() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.j     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r2 = 1
            r3 = 10
            if (r0 < r3) goto L1a
            java.lang.String r0 = "java crash handler over %d, no need set."
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L18
            r2[r1] = r3     // Catch: java.lang.Throwable -> L18
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r6)
            return
        L18:
            r0 = move-exception
            goto L80
        L1a:
            r6.g = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L69
            java.lang.Class<com.tencent.bugly.proguard.av> r3 = com.tencent.bugly.proguard.av.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L18
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L38
            monitor-exit(r6)
            return
        L38:
            java.lang.String r3 = "com.android.internal.os.RuntimeInit$UncaughtHandler"
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L5a
            java.lang.String r3 = "backup system java handler: %s"
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L18
            r5[r1] = r4     // Catch: java.lang.Throwable -> L18
            com.tencent.bugly.proguard.al.a(r3, r5)     // Catch: java.lang.Throwable -> L18
            r6.f = r0     // Catch: java.lang.Throwable -> L18
            r6.e = r0     // Catch: java.lang.Throwable -> L18
            goto L69
        L5a:
            java.lang.String r3 = "backup java handler: %s"
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L18
            r5[r1] = r4     // Catch: java.lang.Throwable -> L18
            com.tencent.bugly.proguard.al.a(r3, r5)     // Catch: java.lang.Throwable -> L18
            r6.e = r0     // Catch: java.lang.Throwable -> L18
        L69:
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch: java.lang.Throwable -> L18
            int r0 = r6.j     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + r2
            r6.j = r0     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "registered java monitor: %s"
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L18
            r2[r1] = r3     // Catch: java.lang.Throwable -> L18
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r6)
            return
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public final synchronized void a(com.tencent.bugly.crashreport.common.strategy.StrategyBean r5) {
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L29
            boolean r0 = r5.f     // Catch: java.lang.Throwable -> L21
            boolean r1 = r4.g     // Catch: java.lang.Throwable -> L21
            if (r0 == r1) goto L29
            java.lang.String r1 = "java changed to %b"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L21
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L21
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L21
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L21
            boolean r5 = r5.f     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L23
            r4.a()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)
            return
        L21:
            r5 = move-exception
            goto L27
        L23:
            r4.b()     // Catch: java.lang.Throwable -> L21
            goto L29
        L27:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r5
        L29:
            monitor-exit(r4)
            return
    }

    public final void a(java.lang.Thread r22, java.lang.Throwable r23, boolean r24, java.lang.String r25, byte[] r26, boolean r27) {
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "crashreport last handle end!"
            java.lang.String r6 = "crashreport last handle start!"
            java.lang.String r7 = "system handle end!"
            java.lang.String r8 = "system handle start!"
            java.lang.String r9 = "sys default last handle end!"
            java.lang.String r10 = "sys default last handle start!"
            r11 = 0
            if (r4 == 0) goto L52
            java.lang.String r0 = r2.getName()
            long r12 = r2.getId()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r11] = r0
            r0 = 1
            r13[r0] = r12
            java.lang.String r0 = "Java Crash Happen cause by %s(%d)"
            com.tencent.bugly.proguard.al.e(r0, r13)
            boolean r0 = a(r2)
            if (r0 == 0) goto L59
            java.lang.String r0 = "this class has handled this exception"
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.a(r0, r12)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            if (r0 == 0) goto L4e
            java.lang.String r0 = "call system handler"
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.a(r0, r12)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            r0.uncaughtException(r2, r3)
            goto L59
        L4e:
            c()
            goto L59
        L52:
            java.lang.String r0 = "Java Catch Happen"
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r0, r12)
        L59:
            boolean r0 = r1.g     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto La5
            java.lang.String r0 = "Java crash handler is disable. Just return."
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.proguard.al.c(r0, r12)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L220
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            if (r0 == 0) goto L80
            boolean r0 = a(r0)
            if (r0 == 0) goto L80
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r10, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r9, r0)
            return
        L80:
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            if (r0 == 0) goto L94
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r8, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r7, r0)
            return
        L94:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r6, r0)
            c()
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r5, r0)
            return
        La2:
            r0 = move-exception
            goto L1e0
        La5:
            com.tencent.bugly.proguard.ac r0 = r1.c     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto Lb4
            java.lang.String r0 = "no remote but still store!"
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.proguard.al.d(r0, r12)     // Catch: java.lang.Throwable -> La2
        Lb4:
            com.tencent.bugly.proguard.ac r0 = r1.c     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r0.c()     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.f     // Catch: java.lang.Throwable -> La2
            java.lang.String r12 = "JAVA_CATCH"
            java.lang.String r13 = "JAVA_CRASH"
            if (r0 != 0) goto L12b
            com.tencent.bugly.proguard.ac r0 = r1.c     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L12b
            java.lang.String r0 = "crash report was closed by remote , will not upload to Bugly , print local for helpful!"
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.proguard.al.e(r0, r14)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto Ld5
            r15 = r13
            goto Ld6
        Ld5:
            r15 = r12
        Ld6:
            java.lang.String r16 = com.tencent.bugly.proguard.ap.a()     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.proguard.aa r0 = r1.d     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r0.d     // Catch: java.lang.Throwable -> La2
            java.lang.String r18 = r2.getName()     // Catch: java.lang.Throwable -> La2
            java.lang.String r19 = com.tencent.bugly.proguard.ap.a(r3)     // Catch: java.lang.Throwable -> La2
            r20 = 0
            r17 = r0
            com.tencent.bugly.proguard.as.a(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L220
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            if (r0 == 0) goto L109
            boolean r0 = a(r0)
            if (r0 == 0) goto L109
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r10, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r9, r0)
            return
        L109:
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            if (r0 == 0) goto L11d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r8, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r7, r0)
            return
        L11d:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r6, r0)
            c()
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r5, r0)
            return
        L12b:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r17 = r21.b(r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> La2
            if (r17 != 0) goto L176
            java.lang.String r0 = "pkg crash datas fail!"
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.proguard.al.e(r0, r12)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L220
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            if (r0 == 0) goto L154
            boolean r0 = a(r0)
            if (r0 == 0) goto L154
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r10, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r9, r0)
            return
        L154:
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            if (r0 == 0) goto L168
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r8, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r7, r0)
            return
        L168:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r6, r0)
            c()
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r5, r0)
            return
        L176:
            if (r4 == 0) goto L179
            r12 = r13
        L179:
            java.lang.String r13 = com.tencent.bugly.proguard.ap.a()     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.proguard.aa r0 = r1.d     // Catch: java.lang.Throwable -> La2
            java.lang.String r14 = r0.d     // Catch: java.lang.Throwable -> La2
            java.lang.String r15 = r2.getName()     // Catch: java.lang.Throwable -> La2
            java.lang.String r16 = com.tencent.bugly.proguard.ap.a(r3)     // Catch: java.lang.Throwable -> La2
            com.tencent.bugly.proguard.as.a(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> La2
            r0 = r17
            com.tencent.bugly.proguard.as r12 = r1.b     // Catch: java.lang.Throwable -> La2
            boolean r12 = r12.a(r0, r4)     // Catch: java.lang.Throwable -> La2
            if (r12 != 0) goto L19b
            com.tencent.bugly.proguard.as r12 = r1.b     // Catch: java.lang.Throwable -> La2
            r12.b(r0, r4)     // Catch: java.lang.Throwable -> La2
        L19b:
            if (r4 == 0) goto L1a2
            com.tencent.bugly.proguard.as r12 = r1.b     // Catch: java.lang.Throwable -> La2
            r12.a(r0)     // Catch: java.lang.Throwable -> La2
        L1a2:
            if (r4 == 0) goto L220
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            if (r0 == 0) goto L1be
            boolean r0 = a(r0)
            if (r0 == 0) goto L1be
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r10, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r9, r0)
            return
        L1be:
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            if (r0 == 0) goto L1d2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r8, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r7, r0)
            return
        L1d2:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r6, r0)
            c()
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r5, r0)
            return
        L1e0:
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L221
            if (r4 == 0) goto L220
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            if (r0 == 0) goto L1ff
            boolean r0 = a(r0)
            if (r0 == 0) goto L1ff
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r10, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.e
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r9, r0)
            return
        L1ff:
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            if (r0 == 0) goto L213
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r8, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f
            r0.uncaughtException(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r7, r0)
            return
        L213:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r6, r0)
            c()
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r5, r0)
        L220:
            return
        L221:
            r0 = move-exception
            if (r4 == 0) goto L260
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.e
            if (r4 == 0) goto L23f
            boolean r4 = a(r4)
            if (r4 != 0) goto L22f
            goto L23f
        L22f:
            java.lang.Object[] r4 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r10, r4)
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.e
            r4.uncaughtException(r2, r3)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r9, r2)
            goto L260
        L23f:
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.f
            if (r4 == 0) goto L253
            java.lang.Object[] r4 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r8, r4)
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.f
            r4.uncaughtException(r2, r3)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r7, r2)
            goto L260
        L253:
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r6, r2)
            c()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.tencent.bugly.proguard.al.e(r5, r2)
        L260:
            throw r0
    }

    public final synchronized void b() {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.g = r0     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "close java monitor!"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L38
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "bugly"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L38
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.lang.String r1 = "Java monitor to unregister: %s"
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L38
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L38
            r4[r0] = r2     // Catch: java.lang.Throwable -> L38
            com.tencent.bugly.proguard.al.a(r1, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Thread$UncaughtExceptionHandler r0 = r5.e     // Catch: java.lang.Throwable -> L38
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch: java.lang.Throwable -> L38
            int r0 = r5.j     // Catch: java.lang.Throwable -> L38
            int r0 = r0 - r3
            r5.j = r0     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            monitor-exit(r5)
            return
        L3c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
            r9 = this;
            java.lang.Object r1 = com.tencent.bugly.proguard.av.i
            monitor-enter(r1)
            com.tencent.bugly.proguard.aa r0 = r9.d     // Catch: java.lang.Throwable -> L12
            boolean r8 = r0.Q     // Catch: java.lang.Throwable -> L12
            r5 = 1
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r2.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r10
    }
}
