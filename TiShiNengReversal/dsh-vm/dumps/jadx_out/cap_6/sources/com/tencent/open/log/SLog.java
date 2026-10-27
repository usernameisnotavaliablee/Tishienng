package com.tencent.open.log;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SLog implements com.tencent.open.log.TraceLevel {
    public static final java.lang.String TAG = "openSDK_LOG";
    private static boolean c;
    public static com.tencent.open.log.SLog instance;
    protected com.tencent.open.log.a a;
    private com.tencent.open.log.Tracer b;

    static {
            return
    }

    private SLog() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static java.io.File a() {
            java.lang.String r0 = com.tencent.open.log.c.d
            com.tencent.open.log.d$c r1 = com.tencent.open.log.d.b.b()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1c
            long r1 = r1.c()     // Catch: java.lang.Throwable -> L26
            long r3 = com.tencent.open.log.c.f     // Catch: java.lang.Throwable -> L26
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1c
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L26
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L26
            return r1
        L1c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L26
            java.io.File r2 = com.tencent.open.utils.g.c()     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L26
            return r1
        L26:
            r0 = move-exception
            java.lang.String r1 = "openSDK_LOG"
            java.lang.String r2 = "getLogFilePath:"
            e(r1, r2, r0)
            r0 = 0
            return r0
    }

    private java.lang.String a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            boolean r0 = com.tencent.open.log.d.a(r2)
            if (r0 == 0) goto L11
            java.lang.String r2 = "xxxxxx"
        L11:
            return r2
    }

    private void d() {
            r12 = this;
            com.tencent.open.log.b r0 = new com.tencent.open.log.b
            java.io.File r1 = a()
            int r2 = com.tencent.open.log.c.m
            int r3 = com.tencent.open.log.c.g
            int r4 = com.tencent.open.log.c.h
            java.lang.String r5 = com.tencent.open.log.c.c
            int r6 = com.tencent.open.log.c.i
            long r6 = (long) r6
            java.lang.String r9 = com.tencent.open.log.c.e
            long r10 = com.tencent.open.log.c.n
            r8 = 10
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10)
            com.tencent.open.log.a r1 = new com.tencent.open.log.a
            r1.<init>(r0)
            r12.a = r1
            return
    }

    public static final void d(java.lang.String r3, java.lang.String r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 2
            r2 = 0
            r0.a(r1, r3, r4, r2)
            return
    }

    public static final void d(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 2
            r0.a(r1, r2, r3, r4)
            return
    }

    public static final void e(java.lang.String r3, java.lang.String r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 16
            r2 = 0
            r0.a(r1, r3, r4, r2)
            return
    }

    public static final void e(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 16
            r0.a(r1, r2, r3, r4)
            return
    }

    public static void flushLogs() {
            com.tencent.open.log.SLog r0 = getInstance()
            r0.c()
            return
    }

    public static com.tencent.open.log.SLog getInstance() {
            com.tencent.open.log.SLog r0 = com.tencent.open.log.SLog.instance
            if (r0 != 0) goto L1f
            java.lang.Class<com.tencent.open.log.SLog> r0 = com.tencent.open.log.SLog.class
            monitor-enter(r0)
            com.tencent.open.log.SLog r1 = com.tencent.open.log.SLog.instance     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            com.tencent.open.log.SLog r1 = new com.tencent.open.log.SLog     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            com.tencent.open.log.SLog.instance = r1     // Catch: java.lang.Throwable -> L19
            r1.d()     // Catch: java.lang.Throwable -> L19
            r1 = 1
            com.tencent.open.log.SLog.c = r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r1 = move-exception
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
        L1f:
            com.tencent.open.log.SLog r0 = com.tencent.open.log.SLog.instance
            return r0
    }

    public static final void i(java.lang.String r3, java.lang.String r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 4
            r2 = 0
            r0.a(r1, r3, r4, r2)
            return
    }

    public static final void i(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 4
            r0.a(r1, r2, r3, r4)
            return
    }

    public static void release() {
            java.lang.Class<com.tencent.open.log.SLog> r0 = com.tencent.open.log.SLog.class
            monitor-enter(r0)
            com.tencent.open.log.SLog r1 = getInstance()     // Catch: java.lang.Throwable -> L12
            r1.b()     // Catch: java.lang.Throwable -> L12
            com.tencent.open.log.SLog r1 = com.tencent.open.log.SLog.instance     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            r1 = 0
            com.tencent.open.log.SLog.instance = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public static final void u(java.lang.String r3, java.lang.String r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 32
            r2 = 0
            r0.a(r1, r3, r4, r2)
            return
    }

    public static final void u(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 32
            r0.a(r1, r2, r3, r4)
            return
    }

    public static final void v(java.lang.String r3, java.lang.String r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 1
            r2 = 0
            r0.a(r1, r3, r4, r2)
            return
    }

    public static final void v(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 1
            r0.a(r1, r2, r3, r4)
            return
    }

    public static final void w(java.lang.String r3, java.lang.String r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 8
            r2 = 0
            r0.a(r1, r3, r4, r2)
            return
    }

    public static final void w(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            com.tencent.open.log.SLog r0 = getInstance()
            r1 = 8
            r0.a(r1, r2, r3, r4)
            return
    }

    protected void a(int r15, java.lang.String r16, java.lang.String r17, java.lang.Throwable r18) {
            r14 = this;
            boolean r0 = com.tencent.open.log.SLog.c
            if (r0 == 0) goto L4f
            java.lang.String r0 = com.tencent.open.utils.g.b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lf
            goto L4f
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " SDK_VERSION:"
            r1.append(r0)
            java.lang.String r0 = "3.5.13.lite"
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            com.tencent.open.log.a r0 = r14.a
            if (r0 != 0) goto L2b
            goto L9c
        L2b:
            com.tencent.open.log.e r2 = com.tencent.open.log.e.a
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "openSDK_LOG"
            r9 = 0
            r3 = 32
            r2.a(r3, r4, r5, r7, r8, r9)
            com.tencent.open.log.a r2 = r14.a
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "openSDK_LOG"
            r2.a(r3, r4, r5, r7, r8, r9)
            r0 = 0
            com.tencent.open.log.SLog.c = r0
        L4f:
            com.tencent.open.log.e r1 = com.tencent.open.log.e.a
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r4 = java.lang.System.currentTimeMillis()
            r2 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r1.a(r2, r3, r4, r6, r7, r8)
            int r0 = com.tencent.open.log.c.b
            boolean r0 = com.tencent.open.log.d.a.a(r0, r15)
            if (r0 == 0) goto L82
            com.tencent.open.log.a r6 = r14.a
            if (r6 != 0) goto L70
            goto L9c
        L70:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            long r9 = java.lang.System.currentTimeMillis()
            r7 = r15
            r11 = r16
            r12 = r17
            r13 = r18
            r6.a(r7, r8, r9, r11, r12, r13)
        L82:
            com.tencent.open.log.Tracer r6 = r14.b
            if (r6 == 0) goto L9c
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L9c
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9c
            r12 = r17
            java.lang.String r12 = r14.a(r12)     // Catch: java.lang.Exception -> L9c
            r7 = r15
            r11 = r16
            r13 = r18
            r6.a(r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Exception -> L9c
        L9c:
            return
    }

    protected void b() {
            r1 = this;
            com.tencent.open.log.a r0 = r1.a
            if (r0 == 0) goto Lf
            r0.a()
            com.tencent.open.log.a r0 = r1.a
            r0.b()
            r0 = 0
            r1.a = r0
        Lf:
            return
    }

    protected void c() {
            r1 = this;
            com.tencent.open.log.a r0 = r1.a
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    public void setCustomLogger(com.tencent.open.log.Tracer r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
