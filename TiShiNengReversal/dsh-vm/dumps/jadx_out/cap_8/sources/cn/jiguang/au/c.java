package cn.jiguang.au;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements java.util.concurrent.ThreadFactory {
    private final java.lang.ThreadGroup a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f669b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f670c;

    public c(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.f669b = r0
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L16
            java.lang.ThreadGroup r0 = r0.getThreadGroup()
            goto L1e
        L16:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r0 = r0.getThreadGroup()
        L1e:
            r2.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L29
            java.lang.String r3 = "default"
            goto L2d
        L29:
            java.lang.String r3 = r3.toLowerCase()
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "jg_"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "_pool_thread"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.f670c = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r13) {
            r12 = this;
            r1 = 0
            r2 = 5
            r3 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r12.f670c     // Catch: java.lang.Throwable -> L3f
            r0.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.atomic.AtomicInteger r4 = r12.f669b     // Catch: java.lang.Throwable -> L3f
            int r4 = r4.getAndIncrement()     // Catch: java.lang.Throwable -> L3f
            r0.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.Thread r5 = new java.lang.Thread     // Catch: java.lang.Throwable -> L3f
            java.lang.ThreadGroup r6 = r12.a     // Catch: java.lang.Throwable -> L3f
            r9 = 0
            r7 = r13
            r5.<init>(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
            boolean r13 = r5.isDaemon()     // Catch: java.lang.Throwable -> L2e
            if (r13 == 0) goto L32
            r5.setDaemon(r1)     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r0 = move-exception
            r13 = r0
            r3 = r5
            goto L42
        L32:
            int r13 = r5.getPriority()     // Catch: java.lang.Throwable -> L2e
            if (r13 == r2) goto L3b
            r5.setPriority(r2)     // Catch: java.lang.Throwable -> L2e
        L3b:
            return r5
        L3c:
            r0 = move-exception
        L3d:
            r13 = r0
            goto L42
        L3f:
            r0 = move-exception
            r7 = r13
            goto L3d
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "JThreadFactory new Thread error, "
            r0.append(r4)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r4 = "JThreadFactory"
            cn.jiguang.w.f.l(r4, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r13.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = r12.f670c     // Catch: java.lang.Throwable -> L95
            r13.append(r0)     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f669b     // Catch: java.lang.Throwable -> L95
            int r0 = r0.getAndIncrement()     // Catch: java.lang.Throwable -> L95
            r13.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = r13.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.Thread r6 = new java.lang.Thread     // Catch: java.lang.Throwable -> L95
            r8 = r7
            java.lang.ThreadGroup r7 = r12.a     // Catch: java.lang.Throwable -> L95
            r10 = 0
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L95
            boolean r13 = r6.isDaemon()     // Catch: java.lang.Throwable -> L87
            if (r13 == 0) goto L8b
            r6.setDaemon(r1)     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r0 = move-exception
            r13 = r0
            r3 = r6
            goto L97
        L8b:
            int r13 = r6.getPriority()     // Catch: java.lang.Throwable -> L87
            if (r13 == r2) goto Lb0
            r6.setPriority(r2)     // Catch: java.lang.Throwable -> L87
            goto Lb0
        L95:
            r0 = move-exception
            r13 = r0
        L97:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JThreadFactory new Thread again error, "
            r0.append(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            cn.jiguang.w.f.l(r4, r13)
            r6 = r3
        Lb0:
            return r6
    }
}
