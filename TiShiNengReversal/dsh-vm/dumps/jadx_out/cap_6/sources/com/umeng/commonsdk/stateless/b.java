package com.umeng.commonsdk.stateless;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public static final int a = 273;
    private static android.content.Context b = null;
    private static android.os.HandlerThread c = null;
    private static android.os.Handler d = null;
    private static java.lang.Object e = null;
    private static final int f = 274;
    private static final int g = 275;
    private static final int h = 512;
    private static com.umeng.commonsdk.stateless.b.a i;
    private static android.content.IntentFilter j;
    private static volatile boolean k;
    private static java.util.LinkedList<java.lang.String> l;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends android.os.FileObserver {
        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.FileObserver
        public void onEvent(int r2, java.lang.String r3) {
                r1 = this;
                r0 = 8
                r2 = r2 & r0
                if (r2 == r0) goto L6
                return
            L6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "--->>> envelope file created >>> "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MobclickRT"
                com.umeng.commonsdk.debug.UMRTLog.i(r3, r2)
                r2 = 274(0x112, float:3.84E-43)
                com.umeng.commonsdk.stateless.b.a(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.stateless.b.e = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.umeng.commonsdk.stateless.b.l = r0
            return
    }

    public b(android.content.Context r6) {
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = com.umeng.commonsdk.stateless.b.e
            monitor-enter(r0)
            if (r6 == 0) goto L85
            android.content.Context r1 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L5a
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.stateless.b.b = r1     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L85
            android.os.HandlerThread r1 = com.umeng.commonsdk.stateless.b.c     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L85
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "SL-NetWorkSender"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.stateless.b.c = r1     // Catch: java.lang.Throwable -> L5a
            r1.start()     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.stateless.b$a r1 = com.umeng.commonsdk.stateless.b.i     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L6d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r1.<init>()     // Catch: java.lang.Throwable -> L5a
            android.content.Context r2 = com.umeng.commonsdk.stateless.b.b     // Catch: java.lang.Throwable -> L5a
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L5a
            r1.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L5a
            r1.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = com.umeng.commonsdk.stateless.a.f     // Catch: java.lang.Throwable -> L5a
            r1.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5a
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L5c
            java.lang.String r3 = "MobclickRT"
            java.lang.String r4 = "--->>> 2号数据仓目录不存在，创建之。"
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r4)     // Catch: java.lang.Throwable -> L5a
            r2.mkdir()     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r1 = move-exception
            goto L7f
        L5c:
            com.umeng.commonsdk.stateless.b$a r2 = new com.umeng.commonsdk.stateless.b$a     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.stateless.b.i = r2     // Catch: java.lang.Throwable -> L5a
            r2.startWatching()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> 2号数据仓File Monitor启动."
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r2)     // Catch: java.lang.Throwable -> L5a
        L6d:
            android.os.Handler r1 = com.umeng.commonsdk.stateless.b.d     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L85
            com.umeng.commonsdk.stateless.b$1 r1 = new com.umeng.commonsdk.stateless.b$1     // Catch: java.lang.Throwable -> L5a
            android.os.HandlerThread r2 = com.umeng.commonsdk.stateless.b.c     // Catch: java.lang.Throwable -> L5a
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L5a
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.stateless.b.d = r1     // Catch: java.lang.Throwable -> L5a
            goto L85
        L7f:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r1)     // Catch: java.lang.Throwable -> L83
            goto L85
        L83:
            r6 = move-exception
            goto L87
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            throw r6
    }

    public static void a(int r1) {
            boolean r0 = com.umeng.commonsdk.stateless.b.k
            if (r0 == 0) goto L13
            android.os.Handler r0 = com.umeng.commonsdk.stateless.b.d
            if (r0 == 0) goto L13
            android.os.Message r0 = r0.obtainMessage()
            r0.what = r1
            android.os.Handler r1 = com.umeng.commonsdk.stateless.b.d
            r1.sendMessage(r0)
        L13:
            return
    }

    public static void a(boolean r1) {
            com.umeng.commonsdk.stateless.b.k = r1
            java.lang.String r0 = "MobclickRT"
            if (r1 == 0) goto L11
            java.lang.String r1 = "--->>>网络可用： 触发2号数据仓信封消费动作。"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)
            r1 = 274(0x112, float:3.84E-43)
            b(r1)
            return
        L11:
            java.lang.String r1 = "--->>>网络断连： 2号数据仓"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)
            return
    }

    public static boolean a() {
            java.lang.Object r0 = com.umeng.commonsdk.stateless.b.e
            monitor-enter(r0)
            com.umeng.commonsdk.stateless.b$a r1 = com.umeng.commonsdk.stateless.b.i     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            r1 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            goto Lf
        Lc:
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public static void b() {
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>>信封构建成功： 触发2号数据仓信封消费动作。"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)
            r0 = 274(0x112, float:3.84E-43)
            b(r0)
            return
    }

    public static void b(int r1) {
            boolean r0 = com.umeng.commonsdk.stateless.b.k     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1b
            android.os.Handler r0 = com.umeng.commonsdk.stateless.b.d     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1b
            boolean r0 = r0.hasMessages(r1)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1b
            android.os.Handler r0 = com.umeng.commonsdk.stateless.b.d     // Catch: java.lang.Throwable -> L1c
            android.os.Message r0 = r0.obtainMessage()     // Catch: java.lang.Throwable -> L1c
            r0.what = r1     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r1 = com.umeng.commonsdk.stateless.b.d     // Catch: java.lang.Throwable -> L1c
            r1.sendMessage(r0)     // Catch: java.lang.Throwable -> L1c
        L1b:
            return
        L1c:
            r1 = move-exception
            android.content.Context r0 = com.umeng.commonsdk.stateless.b.b
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r1)
            return
    }

    public static void c() {
            r0 = 275(0x113, float:3.85E-43)
            b(r0)
            return
    }

    public static void d() {
            r0 = 512(0x200, float:7.17E-43)
            b(r0)
            return
    }

    static /* synthetic */ void e() {
            l()
            return
    }

    static /* synthetic */ void f() {
            n()
            return
    }

    static /* synthetic */ void g() {
            p()
            return
    }

    static /* synthetic */ void h() {
            q()
            return
    }

    private static void i() {
            android.content.Context r0 = com.umeng.commonsdk.stateless.b.b
            java.io.File[] r0 = com.umeng.commonsdk.stateless.d.c(r0)
            if (r0 == 0) goto L27
            java.util.LinkedList<java.lang.String> r1 = com.umeng.commonsdk.stateless.b.l
            int r1 = r1.size()
            if (r1 <= 0) goto L15
            java.util.LinkedList<java.lang.String> r1 = com.umeng.commonsdk.stateless.b.l
            r1.clear()
        L15:
            int r1 = r0.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            java.util.LinkedList<java.lang.String> r4 = com.umeng.commonsdk.stateless.b.l
            java.lang.String r3 = r3.getAbsolutePath()
            r4.add(r3)
            int r2 = r2 + 1
            goto L17
        L27:
            return
    }

    private static java.lang.String j() {
            r0 = 0
            java.util.LinkedList<java.lang.String> r1 = com.umeng.commonsdk.stateless.b.l     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.peek()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L13
            java.util.LinkedList<java.lang.String> r0 = com.umeng.commonsdk.stateless.b.l     // Catch: java.lang.Throwable -> L11
            r0.removeFirst()     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r0 = r1
            goto L14
        L13:
            return r1
        L14:
            return r0
    }

    @android.annotation.TargetApi(9)
    private static void k() {
            java.util.LinkedList<java.lang.String> r0 = com.umeng.commonsdk.stateless.b.l
            int r0 = r0.size()
            java.lang.String r1 = "MobclickRT"
            if (r0 > 0) goto L10
            java.lang.String r0 = "--->>> todoList无内容，无需处理。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            return
        L10:
            java.util.LinkedList<java.lang.String> r0 = com.umeng.commonsdk.stateless.b.l
            java.lang.Object r0 = r0.pollFirst()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L73
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L2f
            java.lang.String r2 = "--->>> 信封文件不存在，处理下一个文件。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r2)
            goto L73
        L2f:
            com.umeng.commonsdk.stateless.c r3 = new com.umeng.commonsdk.stateless.c
            android.content.Context r4 = com.umeng.commonsdk.stateless.b.b
            r3.<init>(r4)
            byte[] r4 = com.umeng.commonsdk.stateless.d.a(r0)     // Catch: java.lang.Exception -> L3b
            goto L3c
        L3b:
            r4 = 0
        L3c:
            java.lang.String r5 = r2.getName()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L4d
            r6 = 0
            r7 = 1
            java.lang.String r6 = r5.substring(r6, r7)
            goto L4f
        L4d:
            java.lang.String r6 = "u"
        L4f:
            java.lang.String r5 = com.umeng.commonsdk.stateless.d.d(r5)
            java.lang.String r5 = com.umeng.commonsdk.stateless.d.c(r5)
            java.lang.String r7 = com.umeng.commonsdk.vchannel.a.c
            boolean r7 = r7.equalsIgnoreCase(r5)
            if (r7 == 0) goto L62
            java.lang.String r7 = com.umeng.commonsdk.vchannel.a.a
            goto L64
        L62:
            java.lang.String r7 = ""
        L64:
            boolean r3 = r3.a(r4, r5, r7, r6)
            if (r3 == 0) goto L73
            boolean r3 = r2.delete()
            if (r3 != 0) goto L73
            r2.delete()
        L73:
            if (r0 != 0) goto L10
            java.util.LinkedList<java.lang.String> r0 = com.umeng.commonsdk.stateless.b.l
            r0.clear()
            return
    }

    private static void l() {
            java.lang.String r0 = "walle"
            boolean r1 = com.umeng.commonsdk.stateless.b.k
            if (r1 == 0) goto Lfd
            android.content.Context r1 = com.umeng.commonsdk.stateless.b.b
            if (r1 != 0) goto Lc
            goto Lfd
        Lc:
            android.content.Context r1 = com.umeng.commonsdk.stateless.b.b     // Catch: java.lang.Throwable -> Lf4
            java.io.File r1 = com.umeng.commonsdk.stateless.d.a(r1)     // Catch: java.lang.Throwable -> Lf4
            if (r1 == 0) goto Lf1
            java.io.File r2 = r1.getParentFile()     // Catch: java.lang.Throwable -> Lf4
            if (r2 == 0) goto Lf1
            java.io.File r2 = r1.getParentFile()     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> Lf4
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lf4
            if (r2 != 0) goto Lf1
            com.umeng.commonsdk.stateless.c r2 = new com.umeng.commonsdk.stateless.c     // Catch: java.lang.Throwable -> Lf4
            android.content.Context r3 = com.umeng.commonsdk.stateless.b.b     // Catch: java.lang.Throwable -> Lf4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> Lf4
            java.io.File r4 = r1.getParentFile()     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Lf4
            r5 = 0
            byte[] r4 = android.util.Base64.decode(r4, r5)     // Catch: java.lang.Throwable -> Lf4
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r4 = "umpx_internal"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r4 != 0) goto Le5
            java.lang.String r4 = "umpx_crash"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r4 != 0) goto Le5
            java.lang.String r4 = "umpx_oplus_lbs"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r4 == 0) goto L5b
            goto Le5
        L5b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf4
            r4.<init>()     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r6 = "[stateless] handleProcessNext, pathUrl is "
            r4.append(r6)     // Catch: java.lang.Throwable -> Lf4
            r4.append(r3)     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lf4
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lf4
            r7[r5] = r4     // Catch: java.lang.Throwable -> Lf4
            com.umeng.commonsdk.statistics.common.ULog.i(r0, r7)     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r4 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> Lf4
            byte[] r4 = com.umeng.commonsdk.stateless.d.a(r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> Lf4
            goto L7e
        L7d:
            r4 = 0
        L7e:
            java.lang.String r7 = ""
            java.lang.String r8 = com.umeng.commonsdk.vchannel.a.c     // Catch: java.lang.Throwable -> Lf4
            boolean r8 = r8.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r8 == 0) goto L8a
            java.lang.String r7 = com.umeng.commonsdk.vchannel.a.a     // Catch: java.lang.Throwable -> Lf4
        L8a:
            java.lang.String r8 = "u"
            java.lang.String r9 = com.umeng.commonsdk.statistics.UMServerURL.PATH_SHARE     // Catch: java.lang.Throwable -> Lf4
            boolean r9 = r9.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r9 == 0) goto L96
            java.lang.String r8 = "s"
        L96:
            java.lang.String r9 = com.umeng.commonsdk.statistics.UMServerURL.PATH_PUSH_LAUNCH     // Catch: java.lang.Throwable -> Lf4
            boolean r9 = r9.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r9 != 0) goto Lae
            java.lang.String r9 = com.umeng.commonsdk.statistics.UMServerURL.PATH_PUSH_REGIST     // Catch: java.lang.Throwable -> Lf4
            boolean r9 = r9.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r9 != 0) goto Lae
            java.lang.String r9 = com.umeng.commonsdk.statistics.UMServerURL.PATH_PUSH_LOG     // Catch: java.lang.Throwable -> Lf4
            boolean r9 = r9.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf4
            if (r9 == 0) goto Lb0
        Lae:
            java.lang.String r8 = "p"
        Lb0:
            boolean r2 = r2.a(r4, r3, r7, r8)     // Catch: java.lang.Throwable -> Lf4
            if (r2 == 0) goto Ldb
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r3 = "[stateless] Send envelope file success, delete it."
            r2[r5] = r3     // Catch: java.lang.Throwable -> Lf4
            com.umeng.commonsdk.statistics.common.ULog.i(r0, r2)     // Catch: java.lang.Throwable -> Lf4
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Lf4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf4
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> Lf4
            if (r3 != 0) goto Lf1
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r4 = "[stateless] Failed to delete already processed file. We try again after delete failed."
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lf4
            com.umeng.commonsdk.statistics.common.ULog.i(r0, r3)     // Catch: java.lang.Throwable -> Lf4
            r2.delete()     // Catch: java.lang.Throwable -> Lf4
            goto Lf1
        Ldb:
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r2 = "[stateless] Send envelope file failed, abandon and wait next trigger!"
            r1[r5] = r2     // Catch: java.lang.Throwable -> Lf4
            com.umeng.commonsdk.statistics.common.ULog.i(r0, r1)     // Catch: java.lang.Throwable -> Lf4
            goto Lfd
        Le5:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Lf4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf4
            r2.delete()     // Catch: java.lang.Throwable -> Lf4
        Lf1:
            if (r1 != 0) goto Lc
            goto Lfa
        Lf4:
            r0 = move-exception
            android.content.Context r1 = com.umeng.commonsdk.stateless.b.b
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
        Lfa:
            m()
        Lfd:
            return
    }

    private static void m() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            android.content.Context r2 = com.umeng.commonsdk.stateless.b.b     // Catch: java.lang.Throwable -> L37
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L37
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L37
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = com.umeng.commonsdk.stateless.a.e     // Catch: java.lang.Throwable -> L37
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L37
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L37
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L37
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> 2号数据仓：删除stateless目录。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r2)     // Catch: java.lang.Throwable -> L37
            com.umeng.commonsdk.stateless.d.a(r0)     // Catch: java.lang.Throwable -> L37
        L37:
            return
    }

    private static void n() {
            boolean r0 = com.umeng.commonsdk.stateless.b.k
            if (r0 == 0) goto L12
            android.content.Context r0 = com.umeng.commonsdk.stateless.b.b
            if (r0 != 0) goto L9
            goto L12
        L9:
            i()
            k()
            c()
        L12:
            return
    }

    private static void o() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            android.content.Context r2 = com.umeng.commonsdk.stateless.b.b     // Catch: java.lang.Throwable -> L39
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = com.umeng.commonsdk.stateless.a.e     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L39
            boolean r0 = r0.isDirectory()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L39
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>>2号数据仓：检测到stateless目录。"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)     // Catch: java.lang.Throwable -> L39
            r0 = 273(0x111, float:3.83E-43)
            b(r0)     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }

    private static void p() {
            o()
            return
    }

    private static void q() {
            return
    }
}
