package com.bxkj.student.v2.common.utils.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.safe.b a = null;

    static {
            com.bxkj.student.v2.common.utils.safe.b r0 = new com.bxkj.student.v2.common.utils.safe.b
            r0.<init>()
            com.bxkj.student.v2.common.utils.safe.b.a = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a() {
            c()
            return
    }

    private static final void c() {
        L0:
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L0
            boolean r0 = android.os.Debug.isDebuggerConnected()     // Catch: java.lang.InterruptedException -> L0
            java.lang.String r1 = "非Debug 编译，反调试检测"
            r2 = 0
            if (r0 == 0) goto L16
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.InterruptedException -> L0
            com.orhanobut.logger.j.d(r1, r0)     // Catch: java.lang.InterruptedException -> L0
            java.lang.System.exit(r2)     // Catch: java.lang.InterruptedException -> L0
        L16:
            com.bxkj.student.v2.common.utils.safe.h r0 = com.bxkj.student.v2.common.utils.safe.h.a     // Catch: java.lang.InterruptedException -> L0
            boolean r0 = r0.a()     // Catch: java.lang.InterruptedException -> L0
            if (r0 == 0) goto L0
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.InterruptedException -> L0
            com.orhanobut.logger.j.d(r1, r0)     // Catch: java.lang.InterruptedException -> L0
            java.lang.System.exit(r2)     // Catch: java.lang.InterruptedException -> L0
            goto L0
    }

    public final void b() {
            r6 = this;
            com.bxkj.student.v2.common.utils.safe.c r0 = com.bxkj.student.v2.common.utils.safe.c.a
            boolean r0 = r0.d()
            java.lang.String r1 = "非Debug 编译，反调试检测"
            java.lang.String r2 = "System.exit returned normally, while it was supposed to halt JVM."
            r3 = 0
            if (r0 != 0) goto L99
            java.lang.Thread r0 = new java.lang.Thread
            com.bxkj.student.v2.common.utils.safe.a r4 = new com.bxkj.student.v2.common.utils.safe.a
            r4.<init>()
            java.lang.String r5 = "SafeGuardThread"
            r0.<init>(r4, r5)
            r0.start()
            com.bxkj.student.v2.common.utils.safe.d r0 = com.bxkj.student.v2.common.utils.safe.d.a
            boolean r0 = r0.a()
            if (r0 != 0) goto L89
            com.bxkj.student.v2.common.utils.safe.f r0 = com.bxkj.student.v2.common.utils.safe.f.a
            boolean r0 = r0.c()
            if (r0 != 0) goto L79
            com.bxkj.student.v2.common.utils.safe.h r0 = com.bxkj.student.v2.common.utils.safe.h.a
            boolean r0 = r0.a()
            if (r0 != 0) goto L6b
            com.bxkj.student.v2.common.utils.safe.g r0 = com.bxkj.student.v2.common.utils.safe.g.a
            boolean r0 = r0.d()
            if (r0 != 0) goto L5b
            b0.b r0 = b0.b.a
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L4b
            return
        L4b:
            java.lang.String r0 = "反编译非正版应用"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r0, r1)
            java.lang.System.exit(r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L5b:
            java.lang.String r0 = "root设备，反调试检测"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r0, r1)
            java.lang.System.exit(r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L6b:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r1, r0)
            java.lang.System.exit(r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L79:
            java.lang.String r0 = "hook检测"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r0, r1)
            java.lang.System.exit(r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L89:
            java.lang.String r0 = "模拟器检测"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r0, r1)
            java.lang.System.exit(r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L99:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r1, r0)
            java.lang.System.exit(r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }
}
