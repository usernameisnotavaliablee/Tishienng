package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class p {
    public static boolean a = true;
    public static java.util.List<com.tencent.bugly.proguard.o> b;
    public static boolean c;
    private static com.tencent.bugly.proguard.w d;
    private static boolean e;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.bugly.proguard.p.b = r0
            return
    }

    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void a(android.content.Context r2) {
            java.lang.Class<com.tencent.bugly.proguard.p> r0 = com.tencent.bugly.proguard.p.class
            monitor-enter(r0)
            r1 = 0
            a(r2, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public static synchronized void a(android.content.Context r4, com.tencent.bugly.BuglyStrategy r5) {
            java.lang.Class<com.tencent.bugly.proguard.p> r0 = com.tencent.bugly.proguard.p.class
            monitor-enter(r0)
            boolean r1 = com.tencent.bugly.proguard.p.e     // Catch: java.lang.Throwable -> L11
            r2 = 0
            if (r1 == 0) goto L13
            java.lang.String r4 = "[init] initial Multi-times, ignore this."
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r4, r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r4 = move-exception
            goto L38
        L13:
            if (r4 != 0) goto L19
            java.lang.String r4 = com.tencent.bugly.proguard.al.b     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L19:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r4)     // Catch: java.lang.Throwable -> L11
            boolean r3 = a(r1)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L27
            com.tencent.bugly.proguard.p.a = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L27:
            java.lang.String r2 = r1.e()     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L31
            java.lang.String r4 = com.tencent.bugly.proguard.al.b     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L31:
            boolean r1 = r1.D     // Catch: java.lang.Throwable -> L11
            a(r4, r2, r1, r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public static synchronized void a(android.content.Context r16, java.lang.String r17, boolean r18, com.tencent.bugly.BuglyStrategy r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 100
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Class<com.tencent.bugly.proguard.p> r5 = com.tencent.bugly.proguard.p.class
            monitor-enter(r5)
            boolean r6 = com.tencent.bugly.proguard.p.e     // Catch: java.lang.Throwable -> L1d
            r7 = 0
            if (r6 == 0) goto L20
            java.lang.String r0 = "[init] initial Multi-times, ignore this."
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r0, r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r5)
            return
        L1d:
            r0 = move-exception
            goto L229
        L20:
            if (r16 != 0) goto L26
            java.lang.String r0 = com.tencent.bugly.proguard.al.b     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r5)
            return
        L26:
            if (r0 != 0) goto L2c
            java.lang.String r0 = com.tencent.bugly.proguard.al.b     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r5)
            return
        L2c:
            r6 = 1
            com.tencent.bugly.proguard.p.e = r6     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L6d
            com.tencent.bugly.proguard.p.c = r6     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.c = r6     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release."
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "--------------------------------------------------------------------------------------------"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.e(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: "
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately."
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat."
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "--------------------------------------------------------------------------------------------"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.e(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "[init] Open debug mode of Bugly."
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.b(r8, r9)     // Catch: java.lang.Throwable -> L1d
        L6d:
            java.lang.String r8 = " crash report start initializing..."
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.a(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "[init] Bugly start initializing..."
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.b(r8, r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = "[init] Bugly complete version: v%s"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1d
            java.lang.String r10 = "4.1.9.3"
            r9[r7] = r10     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.a(r8, r9)     // Catch: java.lang.Throwable -> L1d
            android.content.Context r8 = com.tencent.bugly.proguard.ap.a(r16)     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.aa r9 = com.tencent.bugly.proguard.aa.a(r8)     // Catch: java.lang.Throwable -> L1d
            r9.o()     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.ao.a(r8)     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.tencent.bugly.proguard.o> r10 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.w r10 = com.tencent.bugly.proguard.w.a(r8, r10)     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.p.d = r10     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.ai.a(r8)     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.tencent.bugly.proguard.o> r10 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.ac.a(r8, r10)     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.u r10 = com.tencent.bugly.proguard.u.a(r8)     // Catch: java.lang.Throwable -> L1d
            boolean r11 = a(r9)     // Catch: java.lang.Throwable -> L1d
            if (r11 == 0) goto Lb2
            com.tencent.bugly.proguard.p.a = r7     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r5)
            return
        Lb2:
            r9.r = r0     // Catch: java.lang.Throwable -> L1d
            java.lang.String r11 = "APP_ID"
            r9.b(r11, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r11 = "[param] Set APP ID:%s"
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1d
            r12[r7] = r0     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.a(r11, r12)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1da
            java.lang.String r0 = r2.getAppVersion()     // Catch: java.lang.Throwable -> L1d
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1d
            r12 = 2
            r13 = 3
            if (r11 != 0) goto Lf7
            int r11 = r0.length()     // Catch: java.lang.Throwable -> L1d
            if (r11 <= r3) goto Le8
            java.lang.String r11 = r0.substring(r7, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r14 = "appVersion %s length is over limit %d substring to %s"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L1d
            r15[r7] = r0     // Catch: java.lang.Throwable -> L1d
            r15[r6] = r4     // Catch: java.lang.Throwable -> L1d
            r15[r12] = r11     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r14, r15)     // Catch: java.lang.Throwable -> L1d
            r0 = r11
        Le8:
            r9.o = r0     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "[param] Set App version: %s"
            java.lang.String r11 = r2.getAppVersion()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1d
            r14[r7] = r11     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.a(r0, r14)     // Catch: java.lang.Throwable -> L1d
        Lf7:
            boolean r0 = r2.isReplaceOldChannel()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L124
            r11 = 556(0x22c, float:7.79E-43)
            if (r0 == 0) goto L13a
            java.lang.String r0 = r2.getAppChannel()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L124
            boolean r14 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L124
            if (r14 != 0) goto L137
            int r14 = r0.length()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L124
            if (r14 <= r3) goto L127
            java.lang.String r14 = r0.substring(r7, r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L124
            java.lang.String r15 = "appChannel %s length is over limit %d substring to %s"
            r16 = 2
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r12[r7] = r0     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r12[r6] = r4     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r12[r16] = r14     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            com.tencent.bugly.proguard.al.d(r15, r12)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r0 = r14
            goto L129
        L124:
            r16 = 2
            goto L161
        L127:
            r16 = 2
        L129:
            com.tencent.bugly.proguard.w r12 = com.tencent.bugly.proguard.p.d     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            java.lang.String r14 = "app_channel"
            byte[] r15 = r0.getBytes()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r12.a(r11, r14, r15, r7)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r9.s = r0     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            goto L156
        L137:
            r16 = 2
            goto L156
        L13a:
            r16 = 2
            com.tencent.bugly.proguard.w r0 = com.tencent.bugly.proguard.p.d     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r12 = 0
            java.util.Map r0 = r0.a(r11, r12)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            if (r0 == 0) goto L156
            java.lang.String r11 = "app_channel"
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            if (r0 == 0) goto L156
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r9.s = r11     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
        L156:
            java.lang.String r0 = "[param] Set App channel: %s"
            java.lang.String r11 = r9.s     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            r12[r7] = r11     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
            com.tencent.bugly.proguard.al.a(r0, r12)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L161
        L161:
            java.lang.String r0 = r2.getAppPackageName()     // Catch: java.lang.Throwable -> L1d
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1d
            if (r11 != 0) goto L192
            int r11 = r0.length()     // Catch: java.lang.Throwable -> L1d
            if (r11 <= r3) goto L183
            java.lang.String r11 = r0.substring(r7, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r12 = "appPackageName %s length is over limit %d substring to %s"
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L1d
            r14[r7] = r0     // Catch: java.lang.Throwable -> L1d
            r14[r6] = r4     // Catch: java.lang.Throwable -> L1d
            r14[r16] = r11     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r12, r14)     // Catch: java.lang.Throwable -> L1d
            r0 = r11
        L183:
            r9.c = r0     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "[param] Set App package: %s"
            java.lang.String r11 = r2.getAppPackageName()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1d
            r12[r7] = r11     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.a(r0, r12)     // Catch: java.lang.Throwable -> L1d
        L192:
            java.lang.String r0 = r2.getDeviceID()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1bc
            int r11 = r0.length()     // Catch: java.lang.Throwable -> L1d
            if (r11 <= r3) goto L1b0
            java.lang.String r3 = r0.substring(r7, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r11 = "deviceId %s length is over limit %d substring to %s"
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L1d
            r12[r7] = r0     // Catch: java.lang.Throwable -> L1d
            r12[r6] = r4     // Catch: java.lang.Throwable -> L1d
            r12[r16] = r3     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.d(r11, r12)     // Catch: java.lang.Throwable -> L1d
            r0 = r3
        L1b0:
            r9.a(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "[param] Set device ID: %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1d
            r4[r7] = r0     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.a(r3, r4)     // Catch: java.lang.Throwable -> L1d
        L1bc:
            java.lang.String r0 = r2.getDeviceModel()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1ce
            r9.b(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "[param] Set device model: %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1d
            r4[r7] = r0     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.a(r3, r4)     // Catch: java.lang.Throwable -> L1d
        L1ce:
            boolean r0 = r2.isUploadProcess()     // Catch: java.lang.Throwable -> L1d
            r9.f = r0     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r2.isBuglyLogUpload()     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.ao.b = r0     // Catch: java.lang.Throwable -> L1d
        L1da:
            r3 = 0
        L1db:
            java.util.List<com.tencent.bugly.proguard.o> r0 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1d
            if (r3 >= r0) goto L206
            java.util.List<com.tencent.bugly.proguard.o> r0 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L1ff
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1ff
            com.tencent.bugly.proguard.o r0 = (com.tencent.bugly.proguard.o) r0     // Catch: java.lang.Throwable -> L1ff
            int r0 = r0.id     // Catch: java.lang.Throwable -> L1ff
            boolean r0 = r10.b(r0)     // Catch: java.lang.Throwable -> L1ff
            if (r0 == 0) goto L203
            java.util.List<com.tencent.bugly.proguard.o> r0 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L1ff
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1ff
            com.tencent.bugly.proguard.o r0 = (com.tencent.bugly.proguard.o) r0     // Catch: java.lang.Throwable -> L1ff
            r0.init(r8, r1, r2)     // Catch: java.lang.Throwable -> L1ff
            goto L203
        L1ff:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L1d
        L203:
            int r3 = r3 + 1
            goto L1db
        L206:
            com.tencent.bugly.proguard.s.a(r8, r2)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L210
            long r0 = r2.getAppReportDelay()     // Catch: java.lang.Throwable -> L1d
            goto L212
        L210:
            r0 = 0
        L212:
            com.tencent.bugly.proguard.ac r2 = com.tencent.bugly.proguard.ac.a()     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.ak r3 = r2.c     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.ac$1 r4 = new com.tencent.bugly.proguard.ac$1     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            r3.a(r4, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "[init] Bugly initialization finished."
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1d
            com.tencent.bugly.proguard.al.b(r0, r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r5)
            return
        L229:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public static synchronized void a(com.tencent.bugly.proguard.o r2) {
            java.lang.Class<com.tencent.bugly.proguard.p> r0 = com.tencent.bugly.proguard.p.class
            monitor-enter(r0)
            java.util.List<com.tencent.bugly.proguard.o> r1 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.util.List<com.tencent.bugly.proguard.o> r1 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L11
            r1.add(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L15
        L13:
            monitor-exit(r0)
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    private static boolean a(com.tencent.bugly.proguard.aa r1) {
            java.util.List<java.lang.String> r1 = r1.v
            if (r1 == 0) goto Le
            java.lang.String r0 = "bugly"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }
}
