package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class bd implements com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler {
    private final android.content.Context a;
    private final com.tencent.bugly.proguard.as b;
    private final com.tencent.bugly.proguard.aa c;
    private final com.tencent.bugly.proguard.ac d;

    public bd(android.content.Context r1, com.tencent.bugly.proguard.aa r2, com.tencent.bugly.proguard.as r3, com.tencent.bugly.proguard.ac r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r2
            r0.d = r4
            return
    }

    private static java.util.Map<java.lang.String, java.lang.String> a(java.lang.String[] r8) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 1
            if (r8 != 0) goto L7
            r2 = 1
            goto L8
        L7:
            int r2 = r8.length
        L8:
            r0.<init>(r2)
            r2 = 0
            if (r8 == 0) goto L44
            r3 = 0
        Lf:
            int r4 = r8.length
            if (r3 >= r4) goto L43
            r4 = r8[r3]
            if (r4 == 0) goto L40
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r5
            r7[r1] = r4
            java.lang.String r5 = "Extra message[%d]: %s"
            com.tencent.bugly.proguard.al.a(r5, r7)
            java.lang.String r5 = "="
            java.lang.String[] r5 = r4.split(r5)
            int r7 = r5.length
            if (r7 != r6) goto L37
            r4 = r5[r2]
            r5 = r5[r1]
            r0.put(r4, r5)
            goto L40
        L37:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r4
            java.lang.String r4 = "bad extraMsg %s"
            com.tencent.bugly.proguard.al.d(r4, r5)
        L40:
            int r3 = r3 + 1
            goto Lf
        L43:
            return r0
        L44:
            java.lang.String r8 = "not found extraMsg"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.al.c(r8, r1)
            return r0
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
            r5 = this;
            com.tencent.bugly.proguard.ay r0 = com.tencent.bugly.proguard.ay.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.tencent.bugly.proguard.ay r0 = com.tencent.bugly.proguard.ay.a()
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.a
            boolean r2 = r2.get()
            if (r2 == 0) goto L1c
            java.lang.String r0 = "anr is processing, return"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r0, r2)
            return r1
        L1c:
            android.app.ActivityManager r2 = r0.b
            boolean r3 = com.tencent.bugly.proguard.z.a(r2)
            if (r3 != 0) goto L3d
            r3 = 0
            android.app.ActivityManager$ProcessErrorStateInfo r2 = com.tencent.bugly.proguard.az.a(r2, r3)
            if (r2 == 0) goto L3d
            long r2 = java.lang.System.currentTimeMillis()
            boolean r2 = r0.a(r2)
            if (r2 == 0) goto L37
            return r1
        L37:
            r1 = 1
            boolean r0 = r0.a(r1)
            return r0
        L3d:
            java.lang.String r0 = "proc is not in anr, wait next check"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r0, r2)
            return r1
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int r22, int r23, long r24, long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, java.lang.String r33, int r34, int r35, int r36, java.lang.String r37, java.lang.String r38) {
            r21 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Native Crash Happen v1"
            com.tencent.bugly.proguard.al.a(r1, r0)
            r20 = 0
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r26
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r2.handleNativeException2(r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int r21, int r22, long r23, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, int r33, int r34, int r35, java.lang.String r36, java.lang.String r37, java.lang.String[] r38) {
            r20 = this;
            r2 = r20
            r0 = r22
            r8 = r28
            r1 = r33
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "Native Crash Happen v2"
            com.tencent.bugly.proguard.al.a(r5, r4)
            java.lang.String r4 = ")"
            java.lang.String r5 = "("
            if (r31 <= 0) goto L34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r6.<init>()     // Catch: java.lang.Throwable -> L31
            r7 = r27
            r6.append(r7)     // Catch: java.lang.Throwable -> L31
            r6.append(r5)     // Catch: java.lang.Throwable -> L31
            r9 = r32
            r6.append(r9)     // Catch: java.lang.Throwable -> L31
            r6.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L31
            r7 = r6
            goto L38
        L31:
            r0 = move-exception
            goto L20e
        L34:
            r7 = r27
            r9 = r32
        L38:
            java.lang.String r6 = com.tencent.bugly.proguard.be.a(r29)     // Catch: java.lang.Throwable -> L31
            java.util.Map r10 = a(r38)     // Catch: java.lang.Throwable -> L31
            java.lang.String r11 = "HasPendingException"
            java.lang.Object r11 = r10.get(r11)     // Catch: java.lang.Throwable -> L31
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L31
            r12 = 1
            if (r11 == 0) goto L5d
            java.lang.String r13 = "true"
            boolean r11 = r11.equals(r13)     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto L5d
            java.lang.String r11 = "Native crash happened with a Java pending exception."
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.a(r11, r13)     // Catch: java.lang.Throwable -> L31
            r19 = 1
            goto L5f
        L5d:
            r19 = 0
        L5f:
            com.tencent.bugly.proguard.aa r11 = r2.c     // Catch: java.lang.Throwable -> L31
            java.lang.String r13 = "ExceptionProcessName"
            java.lang.Object r13 = r10.get(r13)     // Catch: java.lang.Throwable -> L31
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L31
            if (r13 == 0) goto L7c
            int r14 = r13.length()     // Catch: java.lang.Throwable -> L31
            if (r14 != 0) goto L72
            goto L7c
        L72:
            java.lang.String r11 = "Name of crash process: %s"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L31
            r14[r3] = r13     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.c(r11, r14)     // Catch: java.lang.Throwable -> L31
            goto L7e
        L7c:
            java.lang.String r13 = r11.d     // Catch: java.lang.Throwable -> L31
        L7e:
            java.lang.String r11 = "ExceptionThreadName"
            java.lang.Object r11 = r10.get(r11)     // Catch: java.lang.Throwable -> L31
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L31
            java.lang.String r14 = "crash thread name:%s tid:%s"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L31
            r21 = 1
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L31
            r12[r3] = r11     // Catch: java.lang.Throwable -> L31
            r12[r21] = r15     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.c(r14, r12)     // Catch: java.lang.Throwable -> L31
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L31
            if (r12 == 0) goto Lbc
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r12.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L31
            r12.append(r11)     // Catch: java.lang.Throwable -> L31
            r12.append(r5)     // Catch: java.lang.Throwable -> L31
            r12.append(r0)     // Catch: java.lang.Throwable -> L31
            r12.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L31
            goto Ld1
        Lbc:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r12.<init>()     // Catch: java.lang.Throwable -> L31
            r12.append(r11)     // Catch: java.lang.Throwable -> L31
            r12.append(r5)     // Catch: java.lang.Throwable -> L31
            r12.append(r0)     // Catch: java.lang.Throwable -> L31
            r12.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L31
        Ld1:
            r11 = 1000(0x3e8, double:4.94E-321)
            long r14 = r23 * r11
            long r11 = r25 / r11
            long r14 = r14 + r11
            java.lang.String r11 = "SysLogPath"
            java.lang.Object r11 = r10.get(r11)     // Catch: java.lang.Throwable -> L31
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L31
            java.lang.String r12 = "JniLogPath"
            java.lang.Object r10 = r10.get(r12)     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.ac r12 = r2.d     // Catch: java.lang.Throwable -> L31
            boolean r12 = r12.b()     // Catch: java.lang.Throwable -> L31
            if (r12 != 0) goto Lfa
            java.lang.String r12 = "no remote but still store!"
            r22 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.d(r12, r0)     // Catch: java.lang.Throwable -> L31
            goto Lfc
        Lfa:
            r22 = r0
        Lfc:
            com.tencent.bugly.proguard.ac r0 = r2.d     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r0 = r0.c()     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.f     // Catch: java.lang.Throwable -> L31
            java.lang.String r12 = "\n"
            if (r0 != 0) goto L149
            com.tencent.bugly.proguard.ac r0 = r2.d     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L149
            java.lang.String r0 = "crash report was closed by remote , will not upload to Bugly , print local for helpful!"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.e(r0, r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "NATIVE_CRASH"
            java.lang.String r1 = com.tencent.bugly.proguard.ap.a()     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r3.append(r7)     // Catch: java.lang.Throwable -> L31
            r3.append(r12)     // Catch: java.lang.Throwable -> L31
            r3.append(r8)     // Catch: java.lang.Throwable -> L31
            r3.append(r12)     // Catch: java.lang.Throwable -> L31
            r3.append(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L31
            r4 = 0
            r24 = r22
            r21 = r0
            r22 = r1
            r25 = r3
            r26 = r4
            r23 = r13
            com.tencent.bugly.proguard.as.a(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.ap.c(r30)     // Catch: java.lang.Throwable -> L31
            return
        L149:
            r0 = r22
            if (r31 <= 0) goto L14f
            java.lang.String r9 = "KERNEL"
        L14f:
            java.lang.String r16 = "UNKNOWN"
            if (r31 > 0) goto L180
            if (r1 <= 0) goto L159
            java.lang.String r16 = com.tencent.bugly.proguard.z.a(r1)     // Catch: java.lang.Throwable -> L31
        L159:
            r22 = r0
            r3 = r16
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L17d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            r0.append(r3)     // Catch: java.lang.Throwable -> L31
            r0.append(r5)     // Catch: java.lang.Throwable -> L31
            r0.append(r1)     // Catch: java.lang.Throwable -> L31
            r0.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r16 = r0.toString()     // Catch: java.lang.Throwable -> L31
            goto L182
        L17d:
            r16 = r3
            goto L182
        L180:
            r22 = r0
        L182:
            r17 = 0
            r18 = 1
            r3 = r13
            r13 = r11
            r11 = r16
            r16 = 0
            r0 = r9
            r9 = r6
            r5 = r14
            r14 = r10
            r10 = r0
            r4 = r22
            r15 = r37
            r0 = r12
            r1 = 0
            r12 = r30
            com.tencent.bugly.crashreport.crash.CrashDetailBean r5 = r2.packageCrashDatas(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto L1a7
            java.lang.String r0 = "pkg crash datas fail!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.e(r0, r1)     // Catch: java.lang.Throwable -> L31
            return
        L1a7:
            java.lang.String r6 = "NATIVE_CRASH"
            java.lang.String r10 = com.tencent.bugly.proguard.ap.a()     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r11.<init>()     // Catch: java.lang.Throwable -> L31
            r11.append(r7)     // Catch: java.lang.Throwable -> L31
            r11.append(r0)     // Catch: java.lang.Throwable -> L31
            r11.append(r8)     // Catch: java.lang.Throwable -> L31
            r11.append(r0)     // Catch: java.lang.Throwable -> L31
            r11.append(r9)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L31
            r25 = r0
            r23 = r3
            r24 = r4
            r26 = r5
            r21 = r6
            r22 = r10
            com.tencent.bugly.proguard.as.a(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L31
            r0 = r26
            com.tencent.bugly.proguard.as r3 = r2.b     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L1e2
            java.lang.String r0 = "crashHandler is null. Won't upload native crash."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> L31
            return
        L1e2:
            r1 = 1
            boolean r3 = r3.a(r0, r1)     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1f3
            java.lang.String r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getDumpFilePath()     // Catch: java.lang.Throwable -> L31
        L1f1:
            r4 = 1
            goto L1f5
        L1f3:
            r1 = 0
            goto L1f1
        L1f5:
            com.tencent.bugly.proguard.be.a(r4, r1)     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L1ff
            com.tencent.bugly.proguard.as r1 = r2.b     // Catch: java.lang.Throwable -> L31
            r1.b(r0, r4)     // Catch: java.lang.Throwable -> L31
        L1ff:
            com.tencent.bugly.proguard.as r1 = r2.b     // Catch: java.lang.Throwable -> L31
            r1.a(r0)     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.av r0 = r0.t     // Catch: java.lang.Throwable -> L31
            r0.b()     // Catch: java.lang.Throwable -> L31
            return
        L20e:
            com.tencent.bugly.proguard.al.a(r0)
            return
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final com.tencent.bugly.crashreport.crash.CrashDetailBean packageCrashDatas(java.lang.String r9, java.lang.String r10, long r11, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, byte[] r22, java.util.Map<java.lang.String, java.lang.String> r23, boolean r24, boolean r25) {
            r8 = this;
            r0 = r18
            r1 = r22
            com.tencent.bugly.proguard.at r2 = com.tencent.bugly.proguard.at.a()
            boolean r2 = r2.i()
            r3 = 0
            if (r2 == 0) goto L16
            java.lang.String r4 = "This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.tencent.bugly.proguard.al.e(r4, r5)
        L16:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r4 = new com.tencent.bugly.crashreport.crash.CrashDetailBean
            r4.<init>()
            r5 = 1
            r4.b = r5
            com.tencent.bugly.proguard.aa r6 = r8.c
            java.lang.String r6 = r6.g()
            r4.e = r6
            com.tencent.bugly.proguard.aa r6 = r8.c
            java.lang.String r7 = r6.o
            r4.f = r7
            java.lang.String r6 = r6.q()
            r4.g = r6
            com.tencent.bugly.proguard.aa r6 = r8.c
            java.lang.String r6 = r6.f()
            r4.m = r6
            r4.n = r13
            java.lang.String r13 = ""
            if (r2 == 0) goto L43
            java.lang.String r2 = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]"
            goto L44
        L43:
            r2 = r13
        L44:
            r4.o = r2
            r4.p = r14
            if (r15 != 0) goto L4b
            goto L4c
        L4b:
            r13 = r15
        L4c:
            r4.f10q = r13
            r4.r = r11
            byte[] r11 = r13.getBytes()
            java.lang.String r11 = com.tencent.bugly.proguard.ap.c(r11)
            r4.u = r11
            r4.A = r9
            r4.B = r10
            com.tencent.bugly.proguard.aa r10 = r8.c
            java.lang.String r10 = r10.s()
            r4.L = r10
            com.tencent.bugly.proguard.aa r10 = r8.c
            java.util.Map r10 = r10.p()
            r4.h = r10
            com.tencent.bugly.proguard.aa r10 = r8.c
            java.util.Map r10 = r10.A()
            r4.i = r10
            r4.v = r0
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r10 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()
            r11 = 0
            if (r10 == 0) goto L84
            java.lang.String r10 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getDumpFilePath()
            goto L85
        L84:
            r10 = r11
        L85:
            java.lang.String r12 = com.tencent.bugly.proguard.be.a(r10, r0)
            boolean r13 = com.tencent.bugly.proguard.ap.b(r12)
            if (r13 != 0) goto L91
            r4.Z = r12
        L91:
            java.lang.String r10 = com.tencent.bugly.proguard.be.b(r10)
            r4.aa = r10
            int r10 = com.tencent.bugly.proguard.at.f
            java.lang.String r12 = com.tencent.bugly.proguard.at.k
            boolean r13 = com.tencent.bugly.proguard.at.p
            r0 = r19
            java.lang.String r10 = com.tencent.bugly.proguard.be.a(r0, r10, r12, r13)
            r4.w = r10
            int r10 = com.tencent.bugly.proguard.at.f
            r12 = r20
            java.lang.String r10 = com.tencent.bugly.proguard.be.a(r12, r10, r11, r5)
            r4.x = r10
            r10 = r17
            r4.N = r10
            r10 = r16
            r4.O = r10
            r10 = r21
            r4.P = r10
            com.tencent.bugly.proguard.aa r10 = r8.c
            long r12 = r10.k()
            r4.F = r12
            com.tencent.bugly.proguard.aa r10 = r8.c
            long r12 = r10.j()
            r4.G = r12
            com.tencent.bugly.proguard.aa r10 = r8.c
            long r12 = r10.l()
            r4.H = r12
            android.content.Context r10 = r8.a
            long r12 = com.tencent.bugly.proguard.ab.b(r10)
            r4.I = r12
            long r12 = com.tencent.bugly.proguard.ab.g()
            r4.J = r12
            long r12 = com.tencent.bugly.proguard.ab.h()
            r4.K = r12
            if (r24 == 0) goto L1a3
            long r10 = com.tencent.bugly.proguard.ab.j()
            r4.C = r10
            long r10 = com.tencent.bugly.proguard.ab.f()
            r4.D = r10
            long r10 = com.tencent.bugly.proguard.ab.l()
            r4.E = r10
            byte[] r10 = com.tencent.bugly.proguard.ao.a()
            r4.y = r10
            com.tencent.bugly.proguard.aa r10 = r8.c
            long r11 = r10.a
            r4.Q = r11
            boolean r10 = r10.a()
            r4.R = r10
            com.tencent.bugly.proguard.aa r10 = r8.c
            boolean r10 = r10.Q
            int r11 = com.tencent.bugly.proguard.at.h
            java.util.Map r10 = com.tencent.bugly.proguard.ap.a(r10, r11)
            r4.z = r10
            java.lang.String r10 = "java:\n"
            java.lang.String r11 = r4.f10q
            int r10 = r11.indexOf(r10)
            if (r10 <= 0) goto L17e
            int r10 = r10 + 6
            java.lang.String r11 = r4.f10q
            int r11 = r11.length()
            if (r10 >= r11) goto L17e
            java.lang.String r11 = r4.f10q
            int r12 = r11.length()
            int r12 = r12 - r5
            java.lang.String r11 = r11.substring(r10, r12)
            int r12 = r11.length()
            if (r12 <= 0) goto L17e
            java.util.Map<java.lang.String, java.lang.String> r12 = r4.z
            java.lang.String r13 = r4.B
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L17e
            java.util.Map<java.lang.String, java.lang.String> r12 = r4.z
            java.lang.String r13 = r4.B
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            int r11 = r12.indexOf(r11)
            if (r11 <= 0) goto L17e
            java.lang.String r11 = r12.substring(r11)
            java.util.Map<java.lang.String, java.lang.String> r12 = r4.z
            java.lang.String r13 = r4.B
            r12.put(r13, r11)
            java.lang.String r12 = r4.f10q
            java.lang.String r10 = r12.substring(r3, r10)
            r4.f10q = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = r4.f10q
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r4.f10q = r10
        L17e:
            if (r9 != 0) goto L186
            com.tencent.bugly.proguard.aa r9 = r8.c
            java.lang.String r9 = r9.d
            r4.A = r9
        L186:
            com.tencent.bugly.proguard.aa r9 = r8.c
            int r9 = r9.z()
            r4.U = r9
            com.tencent.bugly.proguard.aa r9 = r8.c
            int r10 = r9.x
            r4.V = r10
            java.util.Map r9 = r9.t()
            r4.W = r9
            com.tencent.bugly.proguard.aa r9 = r8.c
            java.util.Map r9 = r9.y()
            r4.X = r9
            return r4
        L1a3:
            r12 = -1
            r4.C = r12
            r4.D = r12
            r4.E = r12
            java.lang.String r10 = r4.w
            if (r10 != 0) goto L1b3
            java.lang.String r10 = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc."
            r4.w = r10
        L1b3:
            r4.Q = r12
            r10 = -1
            r4.U = r10
            r4.V = r10
            r10 = r23
            r4.W = r10
            com.tencent.bugly.proguard.aa r10 = r8.c
            java.util.Map r10 = r10.y()
            r4.X = r10
            r4.z = r11
            if (r9 != 0) goto L1ce
            java.lang.String r9 = "unknown(record)"
            r4.A = r9
        L1ce:
            if (r1 == 0) goto L1d2
            r4.y = r1
        L1d2:
            return r4
    }
}
