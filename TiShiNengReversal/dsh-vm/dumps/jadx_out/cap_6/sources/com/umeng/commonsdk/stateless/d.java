package com.umeng.commonsdk.stateless;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    public static int a;
    private static java.lang.Object b;







    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.stateless.d.b = r0
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r6, java.lang.String r7, java.lang.String r8, byte[] r9) {
            r0 = 101(0x65, float:1.42E-43)
            if (r6 == 0) goto L7a
            r1 = 0
            java.lang.Object r2 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            java.io.File r5 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            r4.append(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            boolean r7 = r3.isDirectory()     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L31
            r3.mkdir()     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r7 = move-exception
            goto L5c
        L31:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L2f
            r4.append(r3)     // Catch: java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            r4.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            r8.write(r9)     // Catch: java.lang.Throwable -> L5a
            r8.close()     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return r0
        L5a:
            r7 = move-exception
            r1 = r8
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
        L5e:
            r7 = move-exception
            goto L62
        L60:
            r7 = move-exception
            goto L6d
        L62:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L73
        L67:
            r1.close()     // Catch: java.lang.Throwable -> L73
            goto L73
        L6b:
            r6 = move-exception
            goto L74
        L6d:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L73
            goto L67
        L73:
            return r0
        L74:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Throwable -> L79
        L79:
            throw r6
        L7a:
            return r0
    }

    public static java.io.File a(android.content.Context r12) {
            r0 = 0
            java.lang.Object r1 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> Lc6
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = "walle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r3.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "get last envelope begin, thread is "
            r3.append(r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9e
            r3.append(r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9e
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            r5[r6] = r3     // Catch: java.lang.Throwable -> L9e
            com.umeng.commonsdk.statistics.common.ULog.i(r2, r5)     // Catch: java.lang.Throwable -> L9e
            if (r12 == 0) goto La4
            android.content.Context r2 = r12.getApplicationContext()     // Catch: java.lang.Throwable -> L9e
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r2.<init>()     // Catch: java.lang.Throwable -> L9e
            android.content.Context r3 = r12.getApplicationContext()     // Catch: java.lang.Throwable -> L9e
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L9e
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L9e
            r2.append(r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L9e
            r2.append(r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = com.umeng.commonsdk.stateless.a.e     // Catch: java.lang.Throwable -> L9e
            r2.append(r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L9e
            if (r3 != 0) goto La4
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L9e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L9e
            boolean r2 = r3.isDirectory()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto La4
            java.io.File[] r2 = r3.listFiles()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto La4
            int r3 = r2.length     // Catch: java.lang.Throwable -> L9e
            if (r3 <= 0) goto La4
            r3 = 0
        L6d:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L9e
            if (r3 >= r5) goto La4
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto La1
            boolean r7 = r5.isDirectory()     // Catch: java.lang.Throwable -> L9e
            if (r7 == 0) goto La1
            java.io.File[] r5 = r5.listFiles()     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto La1
            int r7 = r5.length     // Catch: java.lang.Throwable -> L9e
            if (r7 <= 0) goto La1
            com.umeng.commonsdk.stateless.d$1 r7 = new com.umeng.commonsdk.stateless.d$1     // Catch: java.lang.Throwable -> L9e
            r7.<init>()     // Catch: java.lang.Throwable -> L9e
            java.util.Arrays.sort(r5, r7)     // Catch: java.lang.Throwable -> L9e
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto La1
            if (r0 == 0) goto La0
            long r7 = r0.lastModified()     // Catch: java.lang.Throwable -> L9e
            long r9 = r5.lastModified()     // Catch: java.lang.Throwable -> L9e
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto La1
            goto La0
        L9e:
            r2 = move-exception
            goto Lc4
        La0:
            r0 = r5
        La1:
            int r3 = r3 + 1
            goto L6d
        La4:
            java.lang.String r2 = "walle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r3.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "get last envelope end, thread is "
            r3.append(r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9e
            r3.append(r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9e
            r4[r6] = r3     // Catch: java.lang.Throwable -> L9e
            com.umeng.commonsdk.statistics.common.ULog.i(r2, r4)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9e
            return r0
        Lc4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9e
            throw r2     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r12, r1)
            return r0
    }

    public static java.lang.String a(android.content.Context r0, boolean r1) {
            if (r0 != 0) goto L3
            goto L4b
        L3:
            if (r1 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L4b
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L4b
            java.io.File r0 = r0.getFilesDir()     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = com.umeng.commonsdk.stateless.a.e     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4b
            return r0
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L4b
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L4b
            java.io.File r0 = r0.getFilesDir()     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = com.umeng.commonsdk.stateless.a.f     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4b
            return r0
        L4b:
            r0 = 0
            return r0
    }

    public static void a(android.content.Context r8, java.lang.String r9, int r10) {
            r0 = 1
            r1 = 0
            if (r9 != 0) goto L26
            java.lang.String r9 = "AmapLBS"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r10.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "[lbs-build] fileDir not exist, thread is "
            r10.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r10.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L23
            r0[r1] = r10     // Catch: java.lang.Throwable -> L23
            com.umeng.commonsdk.statistics.common.ULog.i(r9, r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r9 = move-exception
            goto L15a
        L26:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L23
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L23
            boolean r9 = r2.isDirectory()     // Catch: java.lang.Throwable -> L23
            if (r9 != 0) goto L50
            java.lang.String r9 = "AmapLBS"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r10.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "[lbs-build] fileDir not exist, thread is "
            r10.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r10.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L23
            r0[r1] = r10     // Catch: java.lang.Throwable -> L23
            com.umeng.commonsdk.statistics.common.ULog.i(r9, r0)     // Catch: java.lang.Throwable -> L23
            return
        L50:
            java.lang.Object r9 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> L23
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L23
            java.io.File[] r2 = r2.listFiles()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "AmapLBS"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r4.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "[lbs-build] delete file begin "
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            int r5 = r2.length     // Catch: java.lang.Throwable -> L9d
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = ", thread is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9d
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9d
            r5[r1] = r4     // Catch: java.lang.Throwable -> L9d
            com.umeng.commonsdk.statistics.common.ULog.i(r3, r5)     // Catch: java.lang.Throwable -> L9d
            int r3 = r2.length     // Catch: java.lang.Throwable -> L9d
            if (r3 < r10) goto L124
            java.lang.String r3 = "AmapLBS"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "[lbs-build] file size >= max"
            r4[r1] = r5     // Catch: java.lang.Throwable -> L9d
            com.umeng.commonsdk.statistics.common.ULog.i(r3, r4)     // Catch: java.lang.Throwable -> L9d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            int r4 = r2.length     // Catch: java.lang.Throwable -> L9d
            r5 = 0
        L93:
            if (r5 >= r4) goto La3
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto La0
            r3.add(r6)     // Catch: java.lang.Throwable -> L9d
            goto La0
        L9d:
            r10 = move-exception
            goto L158
        La0:
            int r5 = r5 + 1
            goto L93
        La3:
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L9d
            if (r4 < r10) goto L12f
            com.umeng.commonsdk.stateless.d$4 r4 = new com.umeng.commonsdk.stateless.d$4     // Catch: java.lang.Throwable -> L9d
            r4.<init>()     // Catch: java.lang.Throwable -> L9d
            java.util.Collections.sort(r3, r4)     // Catch: java.lang.Throwable -> L9d
            boolean r4 = com.umeng.commonsdk.statistics.common.ULog.DEBUG     // Catch: java.lang.Throwable -> L9d
            if (r4 == 0) goto Le3
            r4 = 0
        Lb6:
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L9d
            if (r4 >= r5) goto Le3
            java.lang.String r5 = "AmapLBS"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r6.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "[lbs-build] overrun native file is "
            r6.append(r7)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = r3.get(r4)     // Catch: java.lang.Throwable -> L9d
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L9d
            r6.append(r7)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9d
            r7[r1] = r6     // Catch: java.lang.Throwable -> L9d
            com.umeng.commonsdk.statistics.common.ULog.i(r5, r7)     // Catch: java.lang.Throwable -> L9d
            int r4 = r4 + 1
            goto Lb6
        Le3:
            r4 = 0
        Le4:
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L9d
            int r5 = r5 - r10
            if (r4 > r5) goto L12f
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L121
            java.lang.String r5 = "AmapLBS"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r6.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "[lbs-build] overrun remove file is "
            r6.append(r7)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = r3.get(r4)     // Catch: java.lang.Throwable -> L9d
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L9d
            r6.append(r7)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9d
            r7[r1] = r6     // Catch: java.lang.Throwable -> L9d
            com.umeng.commonsdk.statistics.common.ULog.i(r5, r7)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L121
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L121
            r5.delete()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L121
            r3.remove(r4)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L121
        L121:
            int r4 = r4 + 1
            goto Le4
        L124:
            java.lang.String r10 = "AmapLBS"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "[lbs-build] file size < max"
            r3[r1] = r4     // Catch: java.lang.Throwable -> L9d
            com.umeng.commonsdk.statistics.common.ULog.i(r10, r3)     // Catch: java.lang.Throwable -> L9d
        L12f:
            java.lang.String r10 = "AmapLBS"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "[lbs-build] delete file end "
            r3.append(r4)     // Catch: java.lang.Throwable -> L9d
            int r2 = r2.length     // Catch: java.lang.Throwable -> L9d
            r3.append(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = ", thread is "
            r3.append(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9d
            r3.append(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9d
            r0[r1] = r2     // Catch: java.lang.Throwable -> L9d
            com.umeng.commonsdk.statistics.common.ULog.i(r10, r0)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
            goto L15d
        L158:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
            throw r10     // Catch: java.lang.Throwable -> L23
        L15a:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r8, r9)
        L15d:
            return
    }

    public static void a(android.content.Context r7, java.lang.String r8, java.lang.String r9, int r10) {
            if (r8 != 0) goto L4
            goto L101
        L4:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lfd
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lfd
            boolean r8 = r0.isDirectory()     // Catch: java.lang.Throwable -> Lfd
            if (r8 != 0) goto L11
            goto L101
        L11:
            java.lang.Object r8 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> Lfd
            monitor-enter(r8)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.commonsdk.stateless.d$5 r1 = new com.umeng.commonsdk.stateless.d$5     // Catch: java.lang.Throwable -> L40
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L40
            java.io.File[] r9 = r0.listFiles(r1)     // Catch: java.lang.Throwable -> L40
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Lc7
            int r2 = r9.length     // Catch: java.lang.Throwable -> L40
            if (r2 < r10) goto Lc7
            java.lang.String r2 = "AmapLBS"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "[lbs-build] file size >= max"
            r3[r1] = r4     // Catch: java.lang.Throwable -> L40
            com.umeng.commonsdk.statistics.common.ULog.i(r2, r3)     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L40
            int r3 = r9.length     // Catch: java.lang.Throwable -> L40
            r4 = 0
        L36:
            if (r4 >= r3) goto L46
            r5 = r9[r4]     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L43
            r2.add(r5)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r9 = move-exception
            goto Lfb
        L43:
            int r4 = r4 + 1
            goto L36
        L46:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L40
            if (r3 < r10) goto Ld2
            com.umeng.commonsdk.stateless.d$6 r3 = new com.umeng.commonsdk.stateless.d$6     // Catch: java.lang.Throwable -> L40
            r3.<init>()     // Catch: java.lang.Throwable -> L40
            java.util.Collections.sort(r2, r3)     // Catch: java.lang.Throwable -> L40
            boolean r3 = com.umeng.commonsdk.statistics.common.ULog.DEBUG     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L86
            r3 = 0
        L59:
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L40
            if (r3 >= r4) goto L86
            java.lang.String r4 = "AmapLBS"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r5.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "[lbs-build] overrun native file is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r2.get(r3)     // Catch: java.lang.Throwable -> L40
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = r6.getPath()     // Catch: java.lang.Throwable -> L40
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L40
            r6[r1] = r5     // Catch: java.lang.Throwable -> L40
            com.umeng.commonsdk.statistics.common.ULog.i(r4, r6)     // Catch: java.lang.Throwable -> L40
            int r3 = r3 + 1
            goto L59
        L86:
            r3 = 0
        L87:
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L40
            int r4 = r4 - r10
            if (r3 > r4) goto Ld2
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto Lc4
            java.lang.String r4 = "AmapLBS"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r5.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "[lbs-build] overrun remove file is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r2.get(r3)     // Catch: java.lang.Throwable -> L40
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = r6.getPath()     // Catch: java.lang.Throwable -> L40
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L40
            r6[r1] = r5     // Catch: java.lang.Throwable -> L40
            com.umeng.commonsdk.statistics.common.ULog.i(r4, r6)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> Lc4
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> Lc4
            r4.delete()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> Lc4
            r2.remove(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> Lc4
        Lc4:
            int r3 = r3 + 1
            goto L87
        Lc7:
            java.lang.String r10 = "AmapLBS"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "[lbs-build] file size < max"
            r2[r1] = r3     // Catch: java.lang.Throwable -> L40
            com.umeng.commonsdk.statistics.common.ULog.i(r10, r2)     // Catch: java.lang.Throwable -> L40
        Ld2:
            java.lang.String r10 = "AmapLBS"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "[lbs-build] delete file end "
            r2.append(r3)     // Catch: java.lang.Throwable -> L40
            int r9 = r9.length     // Catch: java.lang.Throwable -> L40
            r2.append(r9)     // Catch: java.lang.Throwable -> L40
            java.lang.String r9 = ", thread is "
            r2.append(r9)     // Catch: java.lang.Throwable -> L40
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L40
            r2.append(r9)     // Catch: java.lang.Throwable -> L40
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L40
            r0[r1] = r9     // Catch: java.lang.Throwable -> L40
            com.umeng.commonsdk.statistics.common.ULog.i(r10, r0)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            goto L101
        Lfb:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            throw r9     // Catch: java.lang.Throwable -> Lfd
        Lfd:
            r8 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r8)
        L101:
            return
    }

    public static boolean a(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean a(java.io.File r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L23
            java.lang.String[] r1 = r5.list()
            r2 = 0
        Lf:
            int r3 = r1.length
            if (r2 >= r3) goto L23
            java.io.File r3 = new java.io.File
            r4 = r1[r2]
            r3.<init>(r5, r4)
            boolean r3 = a(r3)
            if (r3 != 0) goto L20
            return r0
        L20:
            int r2 = r2 + 1
            goto Lf
        L23:
            boolean r5 = r5.delete()
            return r5
    }

    public static byte[] a(java.lang.String r11) throws java.io.IOException {
            java.lang.Object r1 = com.umeng.commonsdk.stateless.d.b
            monitor-enter(r1)
            r2 = 0
            r3 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.lang.String r4 = "r"
            r0.<init>(r11, r4)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            long r9 = r5.size()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            r7 = 0
            java.nio.MappedByteBuffer r11 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            java.nio.MappedByteBuffer r11 = r11.load()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            long r3 = r5.size()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            int r3 = r11.remaining()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            if (r3 <= 0) goto L3d
            int r3 = r11.remaining()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            r11.get(r0, r2, r3)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
            goto L3d
        L35:
            r0 = move-exception
            r11 = r0
            r3 = r5
            goto L6a
        L39:
            r0 = move-exception
            r11 = r0
            r3 = r5
            goto L4a
        L3d:
            r5.close()     // Catch: java.lang.Throwable -> L40
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            return r0
        L42:
            r0 = move-exception
            r11 = r0
            goto L70
        L45:
            r0 = move-exception
            r11 = r0
            goto L6a
        L48:
            r0 = move-exception
            r11 = r0
        L4a:
            java.lang.String r0 = "walle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "[stateless] write envelope, e is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r11.getMessage()     // Catch: java.lang.Throwable -> L45
            r4.append(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L45
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L45
            r5[r2] = r4     // Catch: java.lang.Throwable -> L45
            com.umeng.commonsdk.statistics.common.ULog.i(r0, r5)     // Catch: java.lang.Throwable -> L45
            throw r11     // Catch: java.lang.Throwable -> L45
        L6a:
            if (r3 == 0) goto L6f
            r3.close()     // Catch: java.lang.Throwable -> L6f
        L6f:
            throw r11     // Catch: java.lang.Throwable -> L42
        L70:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r11
    }

    public static byte[] a(byte[] r5) throws java.io.IOException {
            r0 = 0
            if (r5 == 0) goto L46
            int r1 = r5.length
            if (r1 > 0) goto L7
            goto L46
        L7:
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r5)
            r1.finish()
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]
            r2 = 0
            com.umeng.commonsdk.stateless.d.a = r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
        L1e:
            boolean r0 = r1.finished()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L34
            int r0 = r1.deflate(r5)     // Catch: java.lang.Throwable -> L31
            int r4 = com.umeng.commonsdk.stateless.d.a     // Catch: java.lang.Throwable -> L31
            int r4 = r4 + r0
            com.umeng.commonsdk.stateless.d.a = r4     // Catch: java.lang.Throwable -> L31
            r3.write(r5, r2, r0)     // Catch: java.lang.Throwable -> L31
            goto L1e
        L31:
            r5 = move-exception
            r0 = r3
            goto L40
        L34:
            r1.end()     // Catch: java.lang.Throwable -> L31
            r3.close()
            byte[] r5 = r3.toByteArray()
            return r5
        L3f:
            r5 = move-exception
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            throw r5
        L46:
            return r0
    }

    public static java.io.File b(android.content.Context r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            android.content.Context r3 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L31
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L31
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = com.umeng.commonsdk.stateless.a.f     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L31
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            return r0
        L31:
            r2 = move-exception
            goto L5a
        L33:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L31
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> L31
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L31
            java.io.File[] r3 = r3.listFiles()     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L55
            int r4 = r3.length     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L45
            goto L55
        L45:
            com.umeng.commonsdk.stateless.d$2 r4 = new com.umeng.commonsdk.stateless.d$2     // Catch: java.lang.Throwable -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Arrays.sort(r3, r4)     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L53
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            return r3
        L53:
            r3 = move-exception
            goto L58
        L55:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            return r0
        L58:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L31
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r2     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
            return r0
    }

    public static java.lang.String b(java.lang.String r1) {
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> La
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String b(byte[] r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r5.length
            if (r2 >= r3) goto L25
            r3 = r5[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "%02X"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.append(r3)
            int r2 = r2 + 1
            goto Lb
        L25:
            java.lang.String r5 = r0.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            return r5
    }

    public static boolean b(android.content.Context r7, java.lang.String r8, java.lang.String r9, byte[] r10) {
            r0 = 0
            if (r7 == 0) goto L113
            r1 = 1
            r2 = 0
            java.lang.Object r3 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> Lb9 java.io.IOException -> Lbc
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lb9 java.io.IOException -> Lbc
            java.lang.String r4 = "walle"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "[stateless] begin write envelope, thread is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4f
            r6[r0] = r5     // Catch: java.lang.Throwable -> L4f
            com.umeng.commonsdk.statistics.common.ULog.i(r4, r6)     // Catch: java.lang.Throwable -> L4f
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.io.File r6 = r7.getFilesDir()     // Catch: java.lang.Throwable -> L4f
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = com.umeng.commonsdk.stateless.a.e     // Catch: java.lang.Throwable -> L4f
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4f
            boolean r5 = r4.isDirectory()     // Catch: java.lang.Throwable -> L4f
            if (r5 != 0) goto L52
            r4.mkdir()     // Catch: java.lang.Throwable -> L4f
            goto L52
        L4f:
            r8 = move-exception
        L50:
            r9 = 0
            goto Lb1
        L52:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r6.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Throwable -> L4f
            r6.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "/"
            r6.append(r4)     // Catch: java.lang.Throwable -> L4f
            r6.append(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r5.isDirectory()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L78
            r5.mkdir()     // Catch: java.lang.Throwable -> L4f
        L78:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L4f
            r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            r4.append(r9)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L4f
            boolean r9 = r8.exists()     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L9e
            r8.createNewFile()     // Catch: java.lang.Throwable -> L4f
        L9e:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L4f
            r9.write(r10)     // Catch: java.lang.Throwable -> Lae
            r9.close()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lab
            return r1
        Lab:
            r8 = move-exception
            r9 = 1
            goto Lb1
        Lae:
            r8 = move-exception
            r2 = r9
            goto L50
        Lb1:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb7
            throw r8     // Catch: java.lang.Throwable -> Lb3 java.io.IOException -> Lb5
        Lb3:
            r8 = move-exception
            goto Lbf
        Lb5:
            r8 = move-exception
            goto Le8
        Lb7:
            r8 = move-exception
            goto Lb1
        Lb9:
            r8 = move-exception
            r9 = 0
            goto Lbf
        Lbc:
            r8 = move-exception
            r9 = 0
            goto Le8
        Lbf:
            java.lang.String r10 = "walle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r3.<init>()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r4 = "[stateless] write envelope, e is "
            r3.append(r4)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r4 = r8.getMessage()     // Catch: java.lang.Throwable -> Le6
            r3.append(r4)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Le6
            r1[r0] = r3     // Catch: java.lang.Throwable -> Le6
            com.umeng.commonsdk.statistics.common.ULog.i(r10, r1)     // Catch: java.lang.Throwable -> Le6
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r8)     // Catch: java.lang.Throwable -> Le6
            if (r2 == 0) goto L10c
        Le2:
            r2.close()     // Catch: java.io.IOException -> L10c
            goto L10c
        Le6:
            r7 = move-exception
            goto L10d
        Le8:
            java.lang.String r10 = "walle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r3.<init>()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r4 = "[stateless] write envelope, e is "
            r3.append(r4)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r4 = r8.getMessage()     // Catch: java.lang.Throwable -> Le6
            r3.append(r4)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Le6
            r1[r0] = r3     // Catch: java.lang.Throwable -> Le6
            com.umeng.commonsdk.statistics.common.ULog.i(r10, r1)     // Catch: java.lang.Throwable -> Le6
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r8)     // Catch: java.lang.Throwable -> Le6
            if (r2 == 0) goto L10c
            goto Le2
        L10c:
            return r9
        L10d:
            if (r2 == 0) goto L112
            r2.close()     // Catch: java.io.IOException -> L112
        L112:
            throw r7
        L113:
            return r0
    }

    public static java.lang.String c(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            java.lang.String r2 = ""
            return r2
    }

    public static java.io.File[] c(android.content.Context r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> L59
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            android.content.Context r3 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L31
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L31
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = com.umeng.commonsdk.stateless.a.f     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L31
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            return r0
        L31:
            r2 = move-exception
            goto L57
        L33:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L31
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = com.umeng.commonsdk.stateless.d.b     // Catch: java.lang.Throwable -> L31
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L31
            java.io.File[] r3 = r3.listFiles()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L52
            int r4 = r3.length     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L45
            goto L52
        L45:
            com.umeng.commonsdk.stateless.d$3 r4 = new com.umeng.commonsdk.stateless.d$3     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            java.util.Arrays.sort(r3, r4)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            return r3
        L50:
            r3 = move-exception
            goto L55
        L52:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            return r0
        L55:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L31
        L57:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
            return r0
    }

    public static java.lang.String d(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto L27
        L7:
            java.lang.String r0 = "envelope"
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto L10
            goto L27
        L10:
            java.lang.String r0 = "_"
            int r0 = r2.lastIndexOf(r0)
            if (r0 < 0) goto L27
            java.lang.String r1 = "."
            int r1 = r2.lastIndexOf(r1)
            if (r1 < 0) goto L27
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0, r1)
            return r2
        L27:
            java.lang.String r2 = ""
            return r2
    }
}
