package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class bg extends java.lang.Thread {
    public com.tencent.bugly.proguard.bf a;
    public boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private com.tencent.bugly.proguard.bg.a g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
    }

    public bg() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r1 = 1
            r2.d = r1
            r2.e = r0
            r2.f = r1
            r2.b = r1
            return
    }

    private synchronized void a(com.tencent.bugly.proguard.bf r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.d     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            boolean r0 = r2.e     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L21
            java.lang.String r3 = "Restart getting main stack trace."
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1f
            com.tencent.bugly.proguard.al.c(r3, r1)     // Catch: java.lang.Throwable -> L1f
            r3 = 1
            r2.d = r3     // Catch: java.lang.Throwable -> L1f
            r2.e = r0     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L23
        L21:
            monitor-exit(r2)
            return
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    public final boolean a() {
            r3 = this;
            r0 = 1
            r3.c = r0
            boolean r1 = r3.isAlive()
            r2 = 0
            if (r1 != 0) goto Lb
            return r2
        Lb:
            r3.interrupt()     // Catch: java.lang.Exception -> Lf
            goto L13
        Lf:
            r1 = move-exception
            com.tencent.bugly.proguard.al.b(r1)
        L13:
            java.lang.String r1 = "MainHandlerChecker is reset to null."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.al.d(r1, r2)
            r1 = 0
            r3.a = r1
            return r0
    }

    public final boolean b() {
            r4 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.tencent.bugly.proguard.bf r1 = r4.a
            if (r1 == 0) goto L12
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.b = r2
            goto L25
        L12:
            android.os.Looper r1 = r0.getLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = r1.getName()
            com.tencent.bugly.proguard.bf r2 = new com.tencent.bugly.proguard.bf
            r2.<init>(r0, r1)
            r4.a = r2
        L25:
            boolean r0 = r4.isAlive()
            r1 = 0
            if (r0 == 0) goto L2d
            return r1
        L2d:
            r4.start()     // Catch: java.lang.Exception -> L32
            r0 = 1
            return r0
        L32:
            r0 = move-exception
            com.tencent.bugly.proguard.al.b(r0)
            return r1
    }

    public final synchronized void c() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.d = r0     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "Record stack trace is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Ld
            com.tencent.bugly.proguard.al.c(r1, r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public final synchronized void d() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.e = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
        L4:
            boolean r2 = r10.c
            if (r2 != 0) goto L9d
            com.tencent.bugly.proguard.bf r2 = r10.a     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r3 = 0
            if (r2 != 0) goto L1c
            java.lang.String r2 = "Main handler checker is null. Stop thread monitor."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            goto L9d
        L16:
            r2 = move-exception
            goto L93
        L19:
            r2 = move-exception
            goto L98
        L1c:
            boolean r4 = r2.c     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r4 == 0) goto L2d
            r2.c = r3     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r2.d = r4     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            android.os.Handler r4 = r2.a     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r4.post(r2)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L2d:
            r10.a(r2)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            boolean r4 = r10.b     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r4 == 0) goto L72
            boolean r4 = r10.d     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r4 != 0) goto L39
            goto L72
        L39:
            long r4 = r2.b()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r6 = 1510(0x5e6, double:7.46E-321)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L72
            r6 = 199990(0x30d36, double:9.8808E-319)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L4b
            goto L72
        L4b:
            r6 = 5010(0x1392, double:2.4753E-320)
            r8 = 1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L5d
            r10.f = r8     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            java.lang.String r4 = "timeSinceMsgSent in [2s, 5s], record stack"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            com.tencent.bugly.proguard.al.c(r4, r3)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r3 = 1
            goto L72
        L5d:
            int r4 = r10.f     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            int r5 = r4 + 1
            r10.f = r5     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r4 = r4 & r5
            if (r4 != 0) goto L67
            goto L68
        L67:
            r8 = 0
        L68:
            if (r8 == 0) goto L71
            java.lang.String r4 = "timeSinceMsgSent in (5s, 200s), should record stack:true"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            com.tencent.bugly.proguard.al.c(r4, r3)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L71:
            r3 = r8
        L72:
            if (r3 == 0) goto L77
            r2.d()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L77:
            com.tencent.bugly.proguard.bg$a r3 = r10.g     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r3 == 0) goto L85
            boolean r3 = r10.d     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r3 == 0) goto L85
            r2.a()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r2.b()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L85:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            long r2 = r2 - r0
            r4 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 % r4
            long r4 = r4 - r2
            com.tencent.bugly.proguard.ap.b(r4)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            goto L4
        L93:
            com.tencent.bugly.proguard.al.b(r2)
            goto L4
        L98:
            com.tencent.bugly.proguard.al.b(r2)
            goto L4
        L9d:
            return
    }
}
