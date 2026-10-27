package com.bxkj.student.v2.common.utils.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.safe.c a = null;

    static {
            com.bxkj.student.v2.common.utils.safe.c r0 = new com.bxkj.student.v2.common.utils.safe.c
            r0.<init>()
            com.bxkj.student.v2.common.utils.safe.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean a() {
            r6 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/net/tcp"
            r0.<init>(r1)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L24
            boolean r1 = r0.canRead()
            if (r1 == 0) goto L24
            r1 = 0
            r3 = 1
            java.lang.String r0 = kotlin.io.i.D(r0, r1, r3, r1)
            java.lang.String r4 = "0100007F:0016"
            r5 = 2
            boolean r0 = kotlin.text.u.l3(r0, r4, r2, r5, r1)
            if (r0 == 0) goto L24
            return r3
        L24:
            return r2
    }

    private final boolean b() {
            r1 = this;
            boolean r0 = android.os.Debug.isDebuggerConnected()
            return r0
    }

    private final boolean c() {
            r1 = this;
            boolean r0 = android.os.Debug.waitingForDebugger()
            return r0
    }

    private final boolean e() {
            r1 = this;
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean d() {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 != 0) goto L1b
            boolean r0 = r1.c()
            if (r0 != 0) goto L1b
            boolean r0 = r1.a()
            if (r0 != 0) goto L1b
            boolean r0 = r1.e()
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            r0 = 1
            return r0
    }
}
