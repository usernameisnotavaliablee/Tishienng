package com.tencent.bugly.crashreport.crash.jni;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NativeCrashHandler implements com.tencent.bugly.proguard.q {
    static java.lang.String a = null;
    private static com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler b = null;
    private static int c = 1;
    private static boolean n = true;
    private final android.content.Context d;
    private final com.tencent.bugly.proguard.aa e;
    private final com.tencent.bugly.proguard.ak f;
    private com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler g;
    private final boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private com.tencent.bugly.proguard.as m;



    static {
            return
    }

    @android.annotation.SuppressLint({"SdCardPath"})
    private NativeCrashHandler(android.content.Context r3, com.tencent.bugly.proguard.aa r4, com.tencent.bugly.proguard.as r5, com.tencent.bugly.proguard.ak r6, boolean r7, java.lang.String r8) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.i = r0
            r2.j = r0
            r2.k = r0
            r2.l = r0
            android.content.Context r1 = com.tencent.bugly.proguard.ap.a(r3)
            r2.d = r1
            java.lang.String r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a
            boolean r1 = com.tencent.bugly.proguard.ap.b(r1)
            if (r1 == 0) goto L46
            boolean r1 = com.tencent.bugly.proguard.ap.b(r8)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L44
            java.lang.String r8 = "bugly"
            java.io.File r8 = r3.getDir(r8, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L2b
            goto L44
        L2b:
            com.tencent.bugly.proguard.aa r8 = com.tencent.bugly.proguard.aa.a(r3)
            java.lang.String r8 = r8.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/data/data/"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = "/app_bugly"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L44:
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a = r8
        L46:
            r2.m = r5
            r2.e = r4
            r2.f = r6
            r2.h = r7
            com.tencent.bugly.proguard.bd r6 = new com.tencent.bugly.proguard.bd
            com.tencent.bugly.proguard.ac r7 = com.tencent.bugly.proguard.ac.a()
            r6.<init>(r3, r4, r5, r7)
            r2.g = r6
            return
    }

    static /* synthetic */ android.content.Context a(com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r0) {
            android.content.Context r0 = r0.d
            return r0
    }

    private synchronized void a(boolean r15) {
            r14 = this;
            monitor-enter(r14)
            boolean r0 = r14.k     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r15 = "[Native] Native crash report has already registered."
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.al.d(r15, r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r14)
            return
        Lf:
            r15 = move-exception
            goto L131
        L12:
            boolean r0 = r14.j     // Catch: java.lang.Throwable -> Lf
            r2 = 1
            if (r0 == 0) goto L7d
            java.lang.String r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a     // Catch: java.lang.Throwable -> L74
            int r3 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.c     // Catch: java.lang.Throwable -> L74
            java.lang.String r15 = r14.regist(r0, r15, r3)     // Catch: java.lang.Throwable -> L74
            if (r15 == 0) goto L12b
            java.lang.String r0 = "[Native] Native Crash Report enable."
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L74
            com.tencent.bugly.proguard.al.a(r0, r3)     // Catch: java.lang.Throwable -> L74
            com.tencent.bugly.proguard.aa r0 = r14.e     // Catch: java.lang.Throwable -> L74
            r0.u = r15     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "-"
            java.lang.String r15 = r0.concat(r15)     // Catch: java.lang.Throwable -> L74
            boolean r0 = com.tencent.bugly.proguard.at.b     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L54
            com.tencent.bugly.proguard.aa r0 = r14.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.h     // Catch: java.lang.Throwable -> L74
            boolean r15 = r0.contains(r15)     // Catch: java.lang.Throwable -> L74
            if (r15 != 0) goto L54
            com.tencent.bugly.proguard.aa r15 = r14.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r15.h     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "-"
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L74
            com.tencent.bugly.proguard.aa r3 = r14.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = r3.u     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L74
            r15.h = r0     // Catch: java.lang.Throwable -> L74
        L54:
            java.lang.String r15 = "comInfo.sdkVersion %s"
            com.tencent.bugly.proguard.aa r0 = r14.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.h     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L74
            r3[r1] = r0     // Catch: java.lang.Throwable -> L74
            com.tencent.bugly.proguard.al.a(r15, r3)     // Catch: java.lang.Throwable -> L74
            r14.k = r2     // Catch: java.lang.Throwable -> L74
            java.lang.String r15 = r14.getRunningCpuAbi()     // Catch: java.lang.Throwable -> L74
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L72
            com.tencent.bugly.proguard.aa r0 = r14.e     // Catch: java.lang.Throwable -> L74
            r0.e(r15)     // Catch: java.lang.Throwable -> L74
        L72:
            monitor-exit(r14)
            return
        L74:
            java.lang.String r15 = "[Native] Failed to load Bugly SO file."
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.al.c(r15, r0)     // Catch: java.lang.Throwable -> Lf
            goto L12b
        L7d:
            boolean r0 = r14.i     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12b
            java.lang.String r0 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r3 = "registNativeExceptionHandler2"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L12b
            r5 = 4
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L12b
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch: java.lang.Throwable -> L12b
            r6[r2] = r7     // Catch: java.lang.Throwable -> L12b
            r7 = 2
            r6[r7] = r4     // Catch: java.lang.Throwable -> L12b
            r8 = 3
            r6[r8] = r4     // Catch: java.lang.Throwable -> L12b
            java.lang.String r9 = com.tencent.bugly.proguard.ab.d()     // Catch: java.lang.Throwable -> L12b
            r10 = 5
            if (r15 == 0) goto L9f
            r11 = 1
            goto La0
        L9f:
            r11 = 5
        La0:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L12b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12b
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L12b
            java.lang.String r13 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a     // Catch: java.lang.Throwable -> L12b
            r5[r1] = r13     // Catch: java.lang.Throwable -> L12b
            r5[r2] = r9     // Catch: java.lang.Throwable -> L12b
            r5[r7] = r11     // Catch: java.lang.Throwable -> L12b
            r5[r8] = r12     // Catch: java.lang.Throwable -> L12b
            java.lang.Object r0 = com.tencent.bugly.proguard.ap.a(r0, r3, r6, r5)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L12b
            if (r0 != 0) goto Le9
            java.lang.String r0 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r3 = "registNativeExceptionHandler"
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L12b
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch: java.lang.Throwable -> L12b
            r5[r2] = r6     // Catch: java.lang.Throwable -> L12b
            r5[r7] = r4     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = com.tencent.bugly.proguard.ab.d()     // Catch: java.lang.Throwable -> L12b
            com.tencent.bugly.proguard.aa.b()     // Catch: java.lang.Throwable -> L12b
            int r9 = com.tencent.bugly.proguard.aa.B()     // Catch: java.lang.Throwable -> L12b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L12b
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L12b
            java.lang.String r11 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a     // Catch: java.lang.Throwable -> L12b
            r8[r1] = r11     // Catch: java.lang.Throwable -> L12b
            r8[r2] = r6     // Catch: java.lang.Throwable -> L12b
            r8[r7] = r9     // Catch: java.lang.Throwable -> L12b
            java.lang.Object r0 = com.tencent.bugly.proguard.ap.a(r0, r3, r5, r8)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L12b
        Le9:
            if (r0 == 0) goto L12b
            r14.k = r2     // Catch: java.lang.Throwable -> L12b
            com.tencent.bugly.proguard.aa r3 = r14.e     // Catch: java.lang.Throwable -> L12b
            r3.u = r0     // Catch: java.lang.Throwable -> L12b
            java.lang.String r0 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r3 = "enableHandler"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L12b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L12b
            r5[r1] = r6     // Catch: java.lang.Throwable -> L12b
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L12b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L12b
            r6[r1] = r7     // Catch: java.lang.Throwable -> L12b
            com.tencent.bugly.proguard.ap.a(r0, r3, r5, r6)     // Catch: java.lang.Throwable -> L12b
            if (r15 == 0) goto L107
            r10 = 1
        L107:
            java.lang.String r15 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r0 = "setLogMode"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L12b
            r3[r1] = r4     // Catch: java.lang.Throwable -> L12b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L12b
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L12b
            r2[r1] = r4     // Catch: java.lang.Throwable -> L12b
            com.tencent.bugly.proguard.ap.a(r15, r0, r3, r2)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r15 = r14.getRunningCpuAbi()     // Catch: java.lang.Throwable -> L12b
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L12b
            if (r0 != 0) goto L129
            com.tencent.bugly.proguard.aa r0 = r14.e     // Catch: java.lang.Throwable -> L12b
            r0.e(r15)     // Catch: java.lang.Throwable -> L12b
        L129:
            monitor-exit(r14)
            return
        L12b:
            r14.j = r1     // Catch: java.lang.Throwable -> Lf
            r14.i = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r14)
            return
        L131:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lf
            throw r15
    }

    static /* synthetic */ boolean a() {
            boolean r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.n
            return r0
    }

    private boolean a(int r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2.setNativeInfo(r3, r4)     // Catch: java.lang.Throwable -> Lb java.lang.UnsatisfiedLinkError -> Lf
            r3 = 1
            return r3
        Lb:
            r3 = move-exception
            com.tencent.bugly.proguard.al.a(r3)
        Lf:
            return r1
    }

    static /* synthetic */ boolean a(com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1, java.lang.String r2) {
            r0 = 999(0x3e7, float:1.4E-42)
            boolean r1 = r1.a(r0, r2)
            return r1
    }

    private static boolean a(java.lang.String r4, boolean r5) {
            r0 = 1
            r1 = 0
            java.lang.String r2 = "[Native] Trying to load so: %s"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L11
            r3[r1] = r4     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.a(r2, r3)     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L14
            java.lang.System.load(r4)     // Catch: java.lang.Throwable -> L11
            goto L17
        L11:
            r5 = move-exception
            r2 = 0
            goto L23
        L14:
            java.lang.System.loadLibrary(r4)     // Catch: java.lang.Throwable -> L11
        L17:
            java.lang.String r5 = "[Native] Successfully loaded SO: %s"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L21
            r2[r1] = r4     // Catch: java.lang.Throwable -> L21
            com.tencent.bugly.proguard.al.a(r5, r2)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r5 = move-exception
            r2 = 1
        L23:
            java.lang.String r5 = r5.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.d(r5, r3)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r1] = r4
            java.lang.String r4 = "[Native] Failed to load so: %s"
            com.tencent.bugly.proguard.al.d(r4, r5)
            return r2
    }

    static /* synthetic */ com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler b(com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r0) {
            com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler r0 = r0.g
            return r0
    }

    static /* synthetic */ java.lang.String b() {
            java.lang.String r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a
            return r0
    }

    private synchronized void b(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto La
            r0.startNativeMonitor()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            goto Lf
        La:
            r0.c()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    static /* synthetic */ com.tencent.bugly.proguard.as c(com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r0) {
            com.tencent.bugly.proguard.as r0 = r0.m
            return r0
    }

    private synchronized void c() {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.k     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.String r0 = "[Native] Native crash report has already unregistered."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            return
        Lf:
            r0 = move-exception
            goto L55
        L11:
            java.lang.String r0 = r6.unregist()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L29
            java.lang.String r0 = "[Native] Successfully closed native crash report."
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L22
            r6.k = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            return
        L22:
            java.lang.String r0 = "[Native] Failed to close native crash report."
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.al.c(r0, r2)     // Catch: java.lang.Throwable -> Lf
        L29:
            java.lang.String r0 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r2 = "enableHandler"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L48
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L48
            r4[r1] = r5     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L48
            r3[r1] = r5     // Catch: java.lang.Throwable -> L48
            com.tencent.bugly.proguard.ap.a(r0, r2, r4, r3)     // Catch: java.lang.Throwable -> L48
            r6.k = r1     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = "[Native] Successfully closed native crash report."
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L48
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)
            return
        L48:
            java.lang.String r0 = "[Native] Failed to close native crash report."
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.al.c(r0, r2)     // Catch: java.lang.Throwable -> Lf
            r6.j = r1     // Catch: java.lang.Throwable -> Lf
            r6.i = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            return
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    private synchronized void c(boolean r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.l     // Catch: java.lang.Throwable -> L17
            if (r0 == r5) goto L19
            java.lang.String r0 = "user change native %b"
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

    public static synchronized java.lang.String getDumpFilePath() {
            java.lang.Class<com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler> r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.class
            monitor-enter(r0)
            java.lang.String r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static synchronized com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler getInstance() {
            java.lang.Class<com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler> r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.class
            monitor-enter(r0)
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.b     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static synchronized com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler getInstance(android.content.Context r8, com.tencent.bugly.proguard.aa r9, com.tencent.bugly.proguard.as r10, com.tencent.bugly.proguard.ac r11, com.tencent.bugly.proguard.ak r12, boolean r13, java.lang.String r14) {
            java.lang.Class<com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler> r11 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.class
            monitor-enter(r11)
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.b     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1 = new com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler     // Catch: java.lang.Throwable -> L15
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L15
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.b = r1     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            r8 = r0
            goto L1c
        L18:
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r8 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.b     // Catch: java.lang.Throwable -> L15
            monitor-exit(r11)
            return r8
        L1c:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L15
            throw r8
    }

    private native java.lang.String getProperties(java.lang.String r1);

    private native java.lang.String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
            boolean r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.n
            return r0
    }

    public static synchronized void setDumpFilePath(java.lang.String r1) {
            java.lang.Class<com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler> r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.class
            monitor-enter(r0)
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void setShouldHandleInJava(boolean r2) {
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.n = r2
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.b
            if (r0 == 0) goto Lf
            r1 = 999(0x3e7, float:1.4E-42)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.a(r1, r2)
        Lf:
            return
    }

    @Override // com.tencent.bugly.proguard.q
    public boolean appendLogToNative(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            boolean r0 = r8.i
            r1 = 0
            if (r0 != 0) goto La
            boolean r0 = r8.j
            if (r0 != 0) goto La
            return r1
        La:
            if (r9 == 0) goto L46
            if (r10 == 0) goto L46
            if (r11 != 0) goto L11
            goto L46
        L11:
            boolean r0 = r8.j     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            if (r0 == 0) goto L1c
            boolean r9 = r8.appendNativeLog(r9, r10, r11)     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            return r9
        L1a:
            r9 = move-exception
            goto L43
        L1c:
            java.lang.String r0 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r2 = "appendNativeLog"
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            r7 = 2
            r4[r7] = r5     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            r3[r1] = r9     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            r3[r6] = r10     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            r3[r7] = r11     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            java.lang.Object r9 = com.tencent.bugly.proguard.ap.a(r0, r2, r4, r3)     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            if (r9 == 0) goto L42
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L46
            return r9
        L42:
            return r1
        L43:
            com.tencent.bugly.proguard.al.a(r9)
        L46:
            return r1
    }

    protected native boolean appendNativeLog(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    protected native boolean appendWholeNativeLog(java.lang.String r1);

    public void checkUploadRecordCrash() {
            r2 = this;
            com.tencent.bugly.proguard.ak r0 = r2.f
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler$1 r1 = new com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler$1
            r1.<init>(r2)
            r0.a(r1)
            return
    }

    public void disableCatchAnrTrace() {
            r1 = this;
            r0 = 1
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.c = r0
            return
    }

    public void dumpAnrNativeStack() {
            r2 = this;
            r0 = 19
            java.lang.String r1 = "1"
            r2.a(r0, r1)
            return
    }

    public void enableCatchAnrTrace() {
            r1 = this;
            int r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.c
            r0 = r0 | 2
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.c = r0
            return
    }

    public boolean filterSigabrtSysLog() {
            r2 = this;
            r0 = 998(0x3e6, float:1.398E-42)
            java.lang.String r1 = "true"
            boolean r0 = r2.a(r0, r1)
            return r0
    }

    @Override // com.tencent.bugly.proguard.q
    public java.lang.String getLogFromNative() {
            r3 = this;
            boolean r0 = r3.i
            r1 = 0
            if (r0 != 0) goto La
            boolean r0 = r3.j
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r3.j     // Catch: java.lang.Throwable -> L13 java.lang.UnsatisfiedLinkError -> L23
            if (r0 == 0) goto L15
            java.lang.String r0 = r3.getNativeLog()     // Catch: java.lang.Throwable -> L13 java.lang.UnsatisfiedLinkError -> L23
            return r0
        L13:
            r0 = move-exception
            goto L20
        L15:
            java.lang.String r0 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r2 = "getNativeLog"
            java.lang.Object r0 = com.tencent.bugly.proguard.ap.a(r0, r2, r1, r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsatisfiedLinkError -> L23
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L13 java.lang.UnsatisfiedLinkError -> L23
            return r0
        L20:
            com.tencent.bugly.proguard.al.a(r0)
        L23:
            return r1
    }

    public com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler getNativeExceptionHandler() {
            r1 = this;
            com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler r0 = r1.g
            return r0
    }

    protected native java.lang.String getNativeKeyValueList();

    protected native java.lang.String getNativeLog();

    public java.lang.String getRunningCpuAbi() {
            r2 = this;
            java.lang.String r0 = r2.getSoCpuAbi()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "get so cpu abi failed，please upgrade bugly so version"
            com.tencent.bugly.proguard.al.d(r1, r0)
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getSystemProperty(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 != 0) goto Lc
            boolean r0 = r1.i
            if (r0 == 0) goto L9
            goto Lc
        L9:
            java.lang.String r2 = "fail"
            return r2
        Lc:
            java.lang.String r2 = r1.getProperties(r2)
            return r2
    }

    public boolean isEnableCatchAnrTrace() {
            r2 = this;
            int r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.c
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public synchronized boolean isUserOpened() {
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

    public synchronized void onStrategyChanged(com.tencent.bugly.crashreport.common.strategy.StrategyBean r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L1b
            boolean r5 = r5.f     // Catch: java.lang.Throwable -> L19
            boolean r2 = r4.k     // Catch: java.lang.Throwable -> L19
            if (r5 == r2) goto L1b
            java.lang.String r2 = "server native changed to %b"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L19
            r3[r0] = r5     // Catch: java.lang.Throwable -> L19
            com.tencent.bugly.proguard.al.d(r2, r3)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r5 = move-exception
            goto L44
        L1b:
            com.tencent.bugly.proguard.ac r5 = com.tencent.bugly.proguard.ac.a()     // Catch: java.lang.Throwable -> L19
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r5 = r5.c()     // Catch: java.lang.Throwable -> L19
            boolean r5 = r5.f     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L2d
            boolean r5 = r4.l     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L2d
            r5 = 1
            goto L2e
        L2d:
            r5 = 0
        L2e:
            boolean r2 = r4.k     // Catch: java.lang.Throwable -> L19
            if (r5 == r2) goto L42
            java.lang.String r2 = "native changed to %b"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L19
            r1[r0] = r3     // Catch: java.lang.Throwable -> L19
            com.tencent.bugly.proguard.al.a(r2, r1)     // Catch: java.lang.Throwable -> L19
            r4.b(r5)     // Catch: java.lang.Throwable -> L19
        L42:
            monitor-exit(r4)
            return
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r5
    }

    public boolean putKeyValueToNative(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            boolean r0 = r7.i
            r1 = 0
            if (r0 != 0) goto La
            boolean r0 = r7.j
            if (r0 != 0) goto La
            return r1
        La:
            if (r8 == 0) goto L3f
            if (r9 != 0) goto Lf
            goto L3f
        Lf:
            boolean r0 = r7.j     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            if (r0 == 0) goto L1a
            boolean r8 = r7.putNativeKeyValue(r8, r9)     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            return r8
        L18:
            r8 = move-exception
            goto L3c
        L1a:
            java.lang.String r0 = "com.tencent.feedback.eup.jni.NativeExceptionUpload"
            java.lang.String r2 = "putNativeKeyValue"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            r3[r1] = r8     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            r3[r6] = r9     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            java.lang.Object r8 = com.tencent.bugly.proguard.ap.a(r0, r2, r4, r3)     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            if (r8 == 0) goto L3b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L3f
            return r8
        L3b:
            return r1
        L3c:
            com.tencent.bugly.proguard.al.a(r8)
        L3f:
            return r1
    }

    protected native boolean putNativeKeyValue(java.lang.String r1, java.lang.String r2);

    protected native java.lang.String regist(java.lang.String r1, boolean r2, int r3);

    public void removeEmptyNativeRecordFiles() {
            r1 = this;
            java.lang.String r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.a
            com.tencent.bugly.proguard.be.c(r0)
            return
    }

    protected native java.lang.String removeNativeKeyValue(java.lang.String r1);

    public void resendSigquit() {
            r2 = this;
            r0 = 20
            java.lang.String r1 = ""
            r2.a(r0, r1)
            return
    }

    public boolean setNativeAppChannel(java.lang.String r2) {
            r1 = this;
            r0 = 12
            boolean r2 = r1.a(r0, r2)
            return r2
    }

    public boolean setNativeAppPackage(java.lang.String r2) {
            r1 = this;
            r0 = 13
            boolean r2 = r1.a(r0, r2)
            return r2
    }

    public boolean setNativeAppVersion(java.lang.String r2) {
            r1 = this;
            r0 = 10
            boolean r2 = r1.a(r0, r2)
            return r2
    }

    protected native void setNativeInfo(int r1, java.lang.String r2);

    @Override // com.tencent.bugly.proguard.q
    public boolean setNativeIsAppForeground(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            java.lang.String r2 = "true"
            goto L7
        L5:
            java.lang.String r2 = "false"
        L7:
            r0 = 14
            boolean r2 = r1.a(r0, r2)
            return r2
    }

    public boolean setNativeLaunchTime(long r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.NumberFormatException -> Lb
            r2 = 15
            boolean r1 = r0.a(r2, r1)     // Catch: java.lang.NumberFormatException -> Lb
            return r1
        Lb:
            r1 = move-exception
            com.tencent.bugly.proguard.al.a(r1)
            r1 = 0
            return r1
    }

    public boolean setNativeUserId(java.lang.String r2) {
            r1 = this;
            r0 = 11
            boolean r2 = r1.a(r0, r2)
            return r2
    }

    public synchronized void setUserOpened(boolean r5) {
            r4 = this;
            monitor-enter(r4)
            r4.c(r5)     // Catch: java.lang.Throwable -> L1c
            boolean r5 = r4.isUserOpened()     // Catch: java.lang.Throwable -> L1c
            com.tencent.bugly.proguard.ac r0 = com.tencent.bugly.proguard.ac.a()     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1f
            if (r5 == 0) goto L1e
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r5 = r0.c()     // Catch: java.lang.Throwable -> L1c
            boolean r5 = r5.f     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            r5 = 1
            goto L1f
        L1c:
            r5 = move-exception
            goto L35
        L1e:
            r5 = 0
        L1f:
            boolean r0 = r4.k     // Catch: java.lang.Throwable -> L1c
            if (r5 == r0) goto L33
            java.lang.String r0 = "native changed to %b"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            r2[r1] = r3     // Catch: java.lang.Throwable -> L1c
            com.tencent.bugly.proguard.al.a(r0, r2)     // Catch: java.lang.Throwable -> L1c
            r4.b(r5)     // Catch: java.lang.Throwable -> L1c
        L33:
            monitor-exit(r4)
            return
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r5
    }

    public synchronized void startNativeMonitor() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.j     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L8a
            boolean r0 = r5.i     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Lb
            goto L8a
        Lb:
            com.tencent.bugly.proguard.aa r0 = r5.e     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.t     // Catch: java.lang.Throwable -> L24
            boolean r0 = com.tencent.bugly.proguard.ap.b(r0)     // Catch: java.lang.Throwable -> L24
            r1 = r0 ^ 1
            boolean r2 = com.tencent.bugly.proguard.at.b     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L38
            java.lang.String r2 = "Bugly_Native"
            java.lang.String r3 = "NativeRQD"
            if (r0 != 0) goto L26
            com.tencent.bugly.proguard.aa r2 = r5.e     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.t     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r0 = move-exception
            goto L91
        L26:
            boolean r1 = a(r2, r1)     // Catch: java.lang.Throwable -> L24
            r5.j = r1     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L4b
            if (r0 == 0) goto L4b
            r0 = 0
            boolean r0 = a(r3, r0)     // Catch: java.lang.Throwable -> L24
            r5.i = r0     // Catch: java.lang.Throwable -> L24
            goto L4b
        L38:
            java.lang.String r2 = "Bugly_Native"
            com.tencent.bugly.proguard.aa r3 = r5.e     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r3.t     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L44
            r3.getClass()     // Catch: java.lang.Throwable -> L24
            goto L45
        L44:
            r2 = r4
        L45:
            boolean r0 = a(r2, r1)     // Catch: java.lang.Throwable -> L24
            r5.j = r0     // Catch: java.lang.Throwable -> L24
        L4b:
            boolean r0 = r5.j     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L55
            boolean r0 = r5.i     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L55
            monitor-exit(r5)
            return
        L55:
            boolean r0 = r5.h     // Catch: java.lang.Throwable -> L24
            r5.a(r0)     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.aa r0 = r5.e     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.o     // Catch: java.lang.Throwable -> L24
            r5.setNativeAppVersion(r0)     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.aa r0 = r5.e     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.s     // Catch: java.lang.Throwable -> L24
            r5.setNativeAppChannel(r0)     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.aa r0 = r5.e     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> L24
            r5.setNativeAppPackage(r0)     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.aa r0 = r5.e     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.f()     // Catch: java.lang.Throwable -> L24
            r5.setNativeUserId(r0)     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.aa r0 = r5.e     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L24
            r5.setNativeIsAppForeground(r0)     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.aa r0 = r5.e     // Catch: java.lang.Throwable -> L24
            long r0 = r0.a     // Catch: java.lang.Throwable -> L24
            r5.setNativeLaunchTime(r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r5)
            return
        L8a:
            boolean r0 = r5.h     // Catch: java.lang.Throwable -> L24
            r5.a(r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r5)
            return
        L91:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    protected native void testCrash();

    public void testNativeCrash() {
            r2 = this;
            boolean r0 = r2.j
            if (r0 != 0) goto Ld
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "[Native] Bugly SO file has not been load."
            com.tencent.bugly.proguard.al.d(r1, r0)
            return
        Ld:
            r2.testCrash()
            return
    }

    public void testNativeCrash(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 16
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.a(r0, r2)
            r2 = 17
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.a(r2, r3)
            r2 = 18
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r1.a(r2, r3)
            r1.testNativeCrash()
            return
    }

    public void unBlockSigquit(boolean r2) {
            r1 = this;
            r0 = 21
            if (r2 == 0) goto La
            java.lang.String r2 = "true"
            r1.a(r0, r2)
            return
        La:
            java.lang.String r2 = "false"
            r1.a(r0, r2)
            return
    }

    protected native java.lang.String unregist();
}
