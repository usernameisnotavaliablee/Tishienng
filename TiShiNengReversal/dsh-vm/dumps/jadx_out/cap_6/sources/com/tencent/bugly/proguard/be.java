package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class be {
    private static java.util.List<java.io.File> a;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.bugly.proguard.be.a = r0
            return
    }

    public be() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.tencent.bugly.crashreport.crash.CrashDetailBean a(android.content.Context r6, java.lang.String r7, com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler r8) {
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L87
            if (r7 == 0) goto L87
            if (r8 != 0) goto La
            goto L87
        La:
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "rqd_record.eup"
            r2.<init>(r7, r3)
            boolean r7 = r2.exists()
            if (r7 == 0) goto L86
            boolean r7 = r2.canRead()
            if (r7 != 0) goto L1f
            goto L86
        L1f:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            java.lang.String r2 = a(r7)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r3 = 1
            if (r2 == 0) goto L69
            java.lang.String r4 = "NATIVE_RQD_REPORT"
            boolean r4 = r2.equals(r4)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r4 != 0) goto L39
            goto L69
        L39:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
        L3e:
            r4 = r1
        L3f:
            java.lang.String r5 = a(r7)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r5 == 0) goto L52
            if (r4 != 0) goto L49
            r4 = r5
            goto L3f
        L49:
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            goto L3e
        L4d:
            r6 = move-exception
            r1 = r7
            goto L7b
        L50:
            goto L81
        L52:
            if (r4 == 0) goto L61
            java.lang.String r6 = "record not pair! drop! %s"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r8[r0] = r4     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            com.tencent.bugly.proguard.al.e(r6, r8)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r7.close()     // Catch: java.io.IOException -> L60
        L60:
            return r1
        L61:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r6 = a(r6, r2, r8)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r7.close()     // Catch: java.io.IOException -> L68
        L68:
            return r6
        L69:
            java.lang.String r6 = "record read fail! %s"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r8[r0] = r2     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            com.tencent.bugly.proguard.al.e(r6, r8)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r7.close()     // Catch: java.io.IOException -> L75
        L75:
            return r1
        L76:
            r6 = move-exception
            goto L7b
        L78:
            r7 = r1
            goto L81
        L7b:
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.io.IOException -> L80
        L80:
            throw r6
        L81:
            if (r7 == 0) goto L86
            r7.close()     // Catch: java.io.IOException -> L86
        L86:
            return r1
        L87:
            java.lang.String r6 = "get eup record file args error"
            java.lang.Object[] r7 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.e(r6, r7)
            return r1
    }

    private static com.tencent.bugly.crashreport.crash.CrashDetailBean a(android.content.Context r25, java.util.Map<java.lang.String, java.lang.String> r26, com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler r27) {
            r0 = r26
            java.lang.String r1 = "unknown"
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r25)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L15
            java.lang.String r0 = "abnormal com info not created"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.bugly.proguard.al.e(r0, r1)
            goto L23b
        L15:
            java.lang.String r2 = "intStateStr"
            java.lang.Object r5 = r0.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L234
            java.lang.String r5 = r5.trim()
            int r5 = r5.length()
            if (r5 > 0) goto L2b
            goto L234
        L2b:
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r2 = d(r2)
            r5 = 1
            if (r2 != 0) goto L4a
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r0
            java.lang.String r0 = "parse intSateMap fail"
            com.tencent.bugly.proguard.al.e(r0, r1)
            return r4
        L4a:
            java.lang.String r6 = "sino"
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L22c
            r6.getClass()     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = "sud"
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L22c
            r6.getClass()     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = "soVersion"
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L22c
            r20 = r6
            java.lang.String r20 = (java.lang.String) r20     // Catch: java.lang.Throwable -> L22c
            boolean r6 = android.text.TextUtils.isEmpty(r20)     // Catch: java.lang.Throwable -> L22c
            if (r6 == 0) goto L78
            java.lang.String r0 = "error format at version"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L22c
            com.tencent.bugly.proguard.al.e(r0, r1)     // Catch: java.lang.Throwable -> L22c
            return r4
        L78:
            java.lang.String r6 = "codeMsg"
            java.lang.Object r6 = a(r0, r6, r1)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = "signalName"
            java.lang.Object r7 = a(r0, r7, r1)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L22c
            java.lang.String r8 = "errnoMsg"
            r0.get(r8)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r8 = "stack"
            java.lang.Object r8 = a(r0, r8, r1)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L22c
            java.lang.String r9 = "jstack"
            java.lang.Object r9 = r0.get(r9)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L22c
            if (r9 == 0) goto Lb3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22c
            r10.<init>()     // Catch: java.lang.Throwable -> L22c
            r10.append(r8)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r8 = "java:\n"
            r10.append(r8)     // Catch: java.lang.Throwable -> L22c
            r10.append(r9)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L22c
        Lb3:
            java.lang.String r9 = "sico"
            java.lang.Object r9 = r2.get(r9)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L22c
            java.lang.String r10 = ")"
            java.lang.String r11 = "("
            if (r9 == 0) goto Lde
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L22c
            if (r9 <= 0) goto Lde
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22c
            r9.<init>()     // Catch: java.lang.Throwable -> L22c
            r9.append(r7)     // Catch: java.lang.Throwable -> L22c
            r9.append(r11)     // Catch: java.lang.Throwable -> L22c
            r9.append(r6)     // Catch: java.lang.Throwable -> L22c
            r9.append(r10)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = "KERNEL"
        Lde:
            r15 = r6
            r12 = r7
            java.lang.String r6 = "nativeLog"
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L22c
            if (r6 == 0) goto Lf9
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L22c
            if (r7 != 0) goto Lf9
            java.lang.String r7 = "BuglyNativeLog.txt"
            byte[] r6 = com.tencent.bugly.proguard.ap.a(r6, r7)     // Catch: java.lang.Throwable -> L22c
            r21 = r6
            goto Lfb
        Lf9:
            r21 = r4
        Lfb:
            java.lang.String r6 = "sendingProcess"
            java.lang.Object r6 = a(r0, r6, r1)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = "spd"
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L22c
            if (r7 == 0) goto L122
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22c
            r9.<init>()     // Catch: java.lang.Throwable -> L22c
            r9.append(r6)     // Catch: java.lang.Throwable -> L22c
            r9.append(r11)     // Catch: java.lang.Throwable -> L22c
            r9.append(r7)     // Catch: java.lang.Throwable -> L22c
            r9.append(r10)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L22c
        L122:
            r16 = r6
            java.lang.String r6 = "threadName"
            java.lang.Object r6 = a(r0, r6, r1)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = "et"
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L22c
            if (r7 == 0) goto L14b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22c
            r9.<init>()     // Catch: java.lang.Throwable -> L22c
            r9.append(r6)     // Catch: java.lang.Throwable -> L22c
            r9.append(r11)     // Catch: java.lang.Throwable -> L22c
            r9.append(r7)     // Catch: java.lang.Throwable -> L22c
            r9.append(r10)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L22c
        L14b:
            r9 = r6
            java.lang.String r6 = "processName"
            java.lang.Object r6 = a(r0, r6, r1)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = "ep"
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L22c
            if (r7 == 0) goto L173
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22c
            r13.<init>()     // Catch: java.lang.Throwable -> L22c
            r13.append(r6)     // Catch: java.lang.Throwable -> L22c
            r13.append(r11)     // Catch: java.lang.Throwable -> L22c
            r13.append(r7)     // Catch: java.lang.Throwable -> L22c
            r13.append(r10)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = r13.toString()     // Catch: java.lang.Throwable -> L22c
        L173:
            java.util.Map r22 = a(r0)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = "ets"
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L22c
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L22c
            long r10 = (long) r7     // Catch: java.lang.Throwable -> L22c
            java.lang.String r7 = "etms"
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L22c
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L22c
            long r13 = (long) r2     // Catch: java.lang.Throwable -> L22c
            r17 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r17
            long r13 = r13 / r17
            long r10 = r10 + r13
            java.lang.String r2 = "errorAddr"
            java.lang.Object r2 = a(r0, r2, r1)     // Catch: java.lang.Throwable -> L22c
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L22c
            java.lang.String r14 = a(r8)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = "sysLogPath"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L22c
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = "jniLogPath"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L22c
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = "tombPath"
            java.lang.Object r1 = a(r0, r2, r1)     // Catch: java.lang.Throwable -> L22c
            r17 = r1
            java.lang.String r17 = (java.lang.String) r17     // Catch: java.lang.Throwable -> L22c
            r23 = 0
            r24 = 0
            r7 = r27
            r8 = r6
            com.tencent.bugly.crashreport.crash.CrashDetailBean r1 = r7.packageCrashDatas(r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L22c
            if (r1 == 0) goto L22b
            java.lang.String r2 = "userId"
            java.lang.String r6 = r1.m     // Catch: java.lang.Throwable -> L22c
            java.lang.Object r2 = a(r0, r2, r6)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L22c
            r1.m = r2     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = "[Native record info] userId: %s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L22c
            r7[r3] = r2     // Catch: java.lang.Throwable -> L22c
            com.tencent.bugly.proguard.al.c(r6, r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = "sysLog"
            java.lang.String r6 = r1.w     // Catch: java.lang.Throwable -> L22c
            java.lang.Object r2 = a(r0, r2, r6)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L22c
            r1.w = r2     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = "appVersion"
            java.lang.Object r2 = a(r0, r6, r2)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L22c
            r1.f = r2     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = "[Native record info] appVersion: %s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L22c
            r7[r3] = r2     // Catch: java.lang.Throwable -> L22c
            com.tencent.bugly.proguard.al.c(r6, r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = "isAppForeground"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L22c
            if (r2 == 0) goto L21e
            java.lang.String r6 = "[Native record info] isAppForeground: %s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L22c
            r7[r3] = r2     // Catch: java.lang.Throwable -> L22c
            com.tencent.bugly.proguard.al.c(r6, r7)     // Catch: java.lang.Throwable -> L22c
            java.lang.String r6 = "true"
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L22c
            goto L21f
        L21e:
            r2 = 0
        L21f:
            r1.R = r2     // Catch: java.lang.Throwable -> L22c
            long r6 = b(r0)     // Catch: java.lang.Throwable -> L22c
            r1.Q = r6     // Catch: java.lang.Throwable -> L22c
            r1.z = r4     // Catch: java.lang.Throwable -> L22c
            r1.k = r5     // Catch: java.lang.Throwable -> L22c
        L22b:
            return r1
        L22c:
            java.lang.String r0 = "error format"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.bugly.proguard.al.e(r0, r1)
            return r4
        L234:
            java.lang.String r0 = "no intStateStr"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.bugly.proguard.al.e(r0, r1)
        L23b:
            return r4
    }

    private static <KeyT, ValueT> ValueT a(java.util.Map<KeyT, ValueT> r0, KeyT r1, ValueT r2) {
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L8
            if (r0 == 0) goto L7
            return r0
        L7:
            return r2
        L8:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            return r2
    }

    private static java.lang.String a(java.io.BufferedInputStream r4) throws java.io.IOException {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2a
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
        L8:
            int r2 = r4.read()     // Catch: java.lang.Throwable -> L20
            r3 = -1
            if (r2 == r3) goto L26
            if (r2 != 0) goto L22
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L20
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "UTf-8"
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L20
            r1.close()
            return r4
        L20:
            r4 = move-exception
            goto L2c
        L22:
            r1.write(r2)     // Catch: java.lang.Throwable -> L20
            goto L8
        L26:
            r1.close()
            goto L32
        L2a:
            r4 = move-exception
            r1 = r0
        L2c:
            com.tencent.bugly.proguard.al.a(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L32
            goto L26
        L32:
            return r0
        L33:
            r4 = move-exception
            if (r1 == 0) goto L39
            r1.close()
        L39:
            throw r4
    }

    protected static java.lang.String a(java.lang.String r6) {
            if (r6 != 0) goto L5
            java.lang.String r6 = ""
            return r6
        L5:
            java.lang.String r0 = "\n"
            java.lang.String[] r1 = r6.split(r0)
            if (r1 == 0) goto L31
            int r2 = r1.length
            if (r2 != 0) goto L11
            goto L31
        L11:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r2 = r1.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L2d
            r4 = r1[r3]
            java.lang.String r5 = "java.lang.Thread.getStackTrace("
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L2a
            r6.append(r4)
            r6.append(r0)
        L2a:
            int r3 = r3 + 1
            goto L18
        L2d:
            java.lang.String r6 = r6.toString()
        L31:
            return r6
    }

    public static java.lang.String a(java.lang.String r6, int r7, java.lang.String r8, boolean r9) {
            r0 = 0
            if (r6 == 0) goto Lef
            if (r7 > 0) goto L7
            goto Lef
        L7:
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            boolean r2 = r1.exists()
            if (r2 == 0) goto Lef
            boolean r2 = r1.canRead()
            if (r2 != 0) goto L1a
            goto Lef
        L1a:
            long r2 = r1.length()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r1.getAbsolutePath()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r2 = "Read system log from native record file(length: %s bytes): %s"
            com.tencent.bugly.proguard.al.a(r2, r4)
            java.util.List<java.io.File> r2 = com.tencent.bugly.proguard.be.a
            r2.add(r1)
            java.lang.String r2 = "Add this record file to list for cleaning lastly."
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.bugly.proguard.al.c(r2, r3)
            if (r8 != 0) goto L4c
            java.io.File r8 = new java.io.File
            r8.<init>(r6)
            java.lang.String r6 = com.tencent.bugly.proguard.ap.a(r8, r7, r9)
            return r6
        L4c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lbb
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lbb
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbb
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "utf-8"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lbb
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lbb
        L62:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r1.append(r8)     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = "[ ]*:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Throwable -> L90
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.find()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L93
            r6.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = "\n"
            r6.append(r0)     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r7 = move-exception
            r0 = r2
            goto Lbc
        L93:
            if (r7 <= 0) goto L62
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L90
            if (r0 <= r7) goto L62
            if (r9 == 0) goto La5
            int r8 = r6.length()     // Catch: java.lang.Throwable -> L90
            r6.delete(r7, r8)     // Catch: java.lang.Throwable -> L90
            goto Lae
        La5:
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L90
            int r0 = r0 - r7
            r6.delete(r5, r0)     // Catch: java.lang.Throwable -> L90
            goto L62
        Lae:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L90
            r2.close()     // Catch: java.lang.Exception -> Lb6
            goto Le2
        Lb6:
            r7 = move-exception
            com.tencent.bugly.proguard.al.a(r7)
            goto Le2
        Lbb:
            r7 = move-exception
        Lbc:
            com.tencent.bugly.proguard.al.a(r7)     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            java.lang.String r9 = "\n[error:"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Le3
            r8.append(r7)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r7 = "]"
            r8.append(r7)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> Le3
            r6.append(r7)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Le2
            r0.close()     // Catch: java.lang.Exception -> Lb6
        Le2:
            return r6
        Le3:
            r6 = move-exception
            if (r0 == 0) goto Lee
            r0.close()     // Catch: java.lang.Exception -> Lea
            goto Lee
        Lea:
            r7 = move-exception
            com.tencent.bugly.proguard.al.a(r7)
        Lee:
            throw r6
        Lef:
            return r0
    }

    public static java.lang.String a(java.lang.String r3, java.lang.String r4) {
            if (r3 == 0) goto L42
            if (r4 != 0) goto L5
            goto L42
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = b(r3, r4)
            if (r1 == 0) goto L1e
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L1e
            java.lang.String r2 = "Register infos:\n"
            r0.append(r2)
            r0.append(r1)
        L1e:
            java.lang.String r3 = c(r3, r4)
            if (r3 == 0) goto L3d
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L3d
            int r4 = r0.length()
            if (r4 <= 0) goto L35
            java.lang.String r4 = "\n"
            r0.append(r4)
        L35:
            java.lang.String r4 = "System SO infos:\n"
            r0.append(r4)
            r0.append(r3)
        L3d:
            java.lang.String r3 = r0.toString()
            return r3
        L42:
            r3 = 0
            return r3
    }

    private static java.util.Map<java.lang.String, java.lang.String> a(java.util.Map<java.lang.String, java.lang.String> r7) {
            java.lang.String r0 = "key-value"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L32
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "\n"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L18:
            if (r3 >= r1) goto L31
            r4 = r7[r3]
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 2
            if (r5 != r6) goto L2e
            r5 = r4[r2]
            r6 = 1
            r4 = r4[r6]
            r0.put(r5, r4)
        L2e:
            int r3 = r3 + 1
            goto L18
        L31:
            return r0
        L32:
            r7 = 0
            return r7
    }

    public static void a(boolean r3, java.lang.String r4) {
            if (r4 == 0) goto L37
            java.util.List<java.io.File> r0 = com.tencent.bugly.proguard.be.a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "rqd_record.eup"
            r1.<init>(r4, r2)
            r0.add(r1)
            java.util.List<java.io.File> r0 = com.tencent.bugly.proguard.be.a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "reg_record.txt"
            r1.<init>(r4, r2)
            r0.add(r1)
            java.util.List<java.io.File> r0 = com.tencent.bugly.proguard.be.a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "map_record.txt"
            r1.<init>(r4, r2)
            r0.add(r1)
            java.util.List<java.io.File> r0 = com.tencent.bugly.proguard.be.a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "backup_record.txt"
            r1.<init>(r4, r2)
            r0.add(r1)
            if (r3 == 0) goto L37
            c(r4)
        L37:
            java.util.List<java.io.File> r3 = com.tencent.bugly.proguard.be.a
            if (r3 == 0) goto L72
            int r3 = r3.size()
            if (r3 <= 0) goto L72
            java.util.List<java.io.File> r3 = com.tencent.bugly.proguard.be.a
            java.util.Iterator r3 = r3.iterator()
        L47:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r3.next()
            java.io.File r4 = (java.io.File) r4
            boolean r0 = r4.exists()
            if (r0 == 0) goto L47
            boolean r0 = r4.canWrite()
            if (r0 == 0) goto L47
            r4.delete()
            java.io.File r4 = r4.getAbsoluteFile()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "Delete record file %s"
            com.tencent.bugly.proguard.al.c(r4, r0)
            goto L47
        L72:
            return
    }

    private static long b(java.util.Map<java.lang.String, java.lang.String> r2) {
            java.lang.String r0 = "launchTime"
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L1e
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r1 = "[Native record info] launchTime: %s"
            com.tencent.bugly.proguard.al.c(r1, r0)
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1a
            return r0
        L1a:
            r2 = move-exception
            com.tencent.bugly.proguard.al.a(r2)
        L1e:
            r0 = -1
            return r0
    }

    public static java.lang.String b(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "backup_record.txt"
            r1.<init>(r3, r2)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L16
            java.lang.String r3 = r1.getAbsolutePath()
            return r3
        L16:
            return r0
    }

    private static java.lang.String b(java.lang.String r9, java.lang.String r10) {
            java.lang.String r0 = "reg_record.txt"
            java.io.BufferedReader r9 = com.tencent.bugly.proguard.ap.b(r9, r0)
            r0 = 0
            if (r9 != 0) goto La
            return r0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r9.readLine()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L6a
            boolean r10 = r2.startsWith(r10)     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L1c
            goto L6a
        L1c:
            java.lang.String r10 = "                "
            r2 = 0
            r3 = 18
            r4 = 0
            r5 = 0
        L23:
            java.lang.String r6 = r9.readLine()     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "\n"
            if (r6 == 0) goto L5a
            int r8 = r4 % 4
            if (r8 != 0) goto L3d
            if (r4 <= 0) goto L37
            r1.append(r7)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r10 = move-exception
            goto L73
        L37:
            java.lang.String r5 = "  "
            r1.append(r5)     // Catch: java.lang.Throwable -> L35
            goto L50
        L3d:
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L35
            r8 = 16
            if (r7 <= r8) goto L47
            r3 = 28
        L47:
            int r5 = r3 - r5
            java.lang.String r5 = r10.substring(r2, r5)     // Catch: java.lang.Throwable -> L35
            r1.append(r5)     // Catch: java.lang.Throwable -> L35
        L50:
            int r5 = r6.length()     // Catch: java.lang.Throwable -> L35
            r1.append(r6)     // Catch: java.lang.Throwable -> L35
            int r4 = r4 + 1
            goto L23
        L5a:
            r1.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L35
            r9.close()     // Catch: java.lang.Exception -> L65
            return r10
        L65:
            r9 = move-exception
            com.tencent.bugly.proguard.al.a(r9)
            return r10
        L6a:
            r9.close()     // Catch: java.lang.Exception -> L6e
            goto L72
        L6e:
            r9 = move-exception
            com.tencent.bugly.proguard.al.a(r9)
        L72:
            return r0
        L73:
            com.tencent.bugly.proguard.al.a(r10)     // Catch: java.lang.Throwable -> L7f
            r9.close()     // Catch: java.lang.Exception -> L7a
            goto L7e
        L7a:
            r9 = move-exception
            com.tencent.bugly.proguard.al.a(r9)
        L7e:
            return r0
        L7f:
            r10 = move-exception
            r9.close()     // Catch: java.lang.Exception -> L84
            goto L88
        L84:
            r9 = move-exception
            com.tencent.bugly.proguard.al.a(r9)
        L88:
            throw r10
    }

    private static java.lang.String c(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "map_record.txt"
            java.io.BufferedReader r3 = com.tencent.bugly.proguard.ap.b(r3, r0)
            r0 = 0
            if (r3 != 0) goto La
            return r0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L3f
            boolean r4 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L1c
            goto L3f
        L1c:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L32
            java.lang.String r2 = "  "
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            r1.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "\n"
            r1.append(r4)     // Catch: java.lang.Throwable -> L30
            goto L1c
        L30:
            r4 = move-exception
            goto L48
        L32:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L30
            r3.close()     // Catch: java.lang.Exception -> L3a
            return r4
        L3a:
            r3 = move-exception
            com.tencent.bugly.proguard.al.a(r3)
            return r4
        L3f:
            r3.close()     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r3 = move-exception
            com.tencent.bugly.proguard.al.a(r3)
        L47:
            return r0
        L48:
            com.tencent.bugly.proguard.al.a(r4)     // Catch: java.lang.Throwable -> L54
            r3.close()     // Catch: java.lang.Exception -> L4f
            goto L53
        L4f:
            r3 = move-exception
            com.tencent.bugly.proguard.al.a(r3)
        L53:
            return r0
        L54:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Exception -> L59
            goto L5d
        L59:
            r3 = move-exception
            com.tencent.bugly.proguard.al.a(r3)
        L5d:
            throw r4
    }

    public static void c(java.lang.String r9) {
            if (r9 != 0) goto L3
            goto L4b
        L3:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L4c
            boolean r9 = r0.canRead()     // Catch: java.lang.Throwable -> L4c
            if (r9 == 0) goto L4b
            boolean r9 = r0.isDirectory()     // Catch: java.lang.Throwable -> L4c
            if (r9 == 0) goto L4b
            java.io.File[] r9 = r0.listFiles()     // Catch: java.lang.Throwable -> L4c
            if (r9 == 0) goto L4b
            int r0 = r9.length     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r2 = 0
        L1d:
            if (r2 >= r0) goto L4b
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r3.canRead()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L48
            boolean r4 = r3.canWrite()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L48
            long r4 = r3.length()     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L48
            r3.delete()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = "Delete empty record file %s"
            java.io.File r3 = r3.getAbsoluteFile()     // Catch: java.lang.Throwable -> L4c
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4c
            r5[r1] = r3     // Catch: java.lang.Throwable -> L4c
            com.tencent.bugly.proguard.al.c(r4, r5)     // Catch: java.lang.Throwable -> L4c
        L48:
            int r2 = r2 + 1
            goto L1d
        L4b:
            return
        L4c:
            r9 = move-exception
            com.tencent.bugly.proguard.al.a(r9)
            return
    }

    private static java.util.Map<java.lang.String, java.lang.Integer> d(java.lang.String r11) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            r1 = 1
            r2 = 0
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Exception -> L3e
            r3.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r4 = ","
            java.lang.String[] r4 = r11.split(r4)     // Catch: java.lang.Exception -> L3e
            int r5 = r4.length     // Catch: java.lang.Exception -> L3e
            r6 = 0
        L13:
            if (r6 >= r5) goto L3d
            r7 = r4[r6]     // Catch: java.lang.Exception -> L3e
            java.lang.String r8 = ":"
            java.lang.String[] r8 = r7.split(r8)     // Catch: java.lang.Exception -> L3e
            int r9 = r8.length     // Catch: java.lang.Exception -> L3e
            r10 = 2
            if (r9 == r10) goto L2b
            java.lang.String r3 = "error format at %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3e
            r4[r2] = r7     // Catch: java.lang.Exception -> L3e
            com.tencent.bugly.proguard.al.e(r3, r4)     // Catch: java.lang.Exception -> L3e
            return r0
        L2b:
            r7 = r8[r1]     // Catch: java.lang.Exception -> L3e
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L3e
            r8 = r8[r2]     // Catch: java.lang.Exception -> L3e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L3e
            r3.put(r8, r7)     // Catch: java.lang.Exception -> L3e
            int r6 = r6 + 1
            goto L13
        L3d:
            return r3
        L3e:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r11
            java.lang.String r11 = "error format intStateStr %s"
            com.tencent.bugly.proguard.al.e(r11, r1)
            return r0
    }
}
