package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class kt {
    private boolean cw;
    final com.bytedance.embedapplog.f j;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f2085r;
    private int xt;

    kt(com.bytedance.embedapplog.f r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.xt = r0
            r1.j = r2
            return
    }

    final long ae() {
            r8 = this;
            long r0 = r8.j()
            long r2 = java.lang.System.currentTimeMillis()
            boolean r4 = r8.f2085r
            r5 = 0
            if (r4 == 0) goto L11
            r8.f2085r = r5
            r0 = 0
        L11:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 + r2
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 > 0) goto L64
            boolean r0 = r8.cw()     // Catch: java.lang.Exception -> L1d
            goto L22
        L1d:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)
            r0 = 0
        L22:
            if (r0 == 0) goto L30
            r8.xt = r5
            long r1 = r8.j()
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            goto L3f
        L30:
            long[] r1 = r8.xt()
            int r2 = r8.xt
            int r3 = r2 + 1
            r8.xt = r3
            int r3 = r1.length
            int r2 = r2 % r3
            r2 = r1[r2]
            r1 = r2
        L3f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.r()
            r3.append(r4)
            java.lang.String r4 = " worked:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r3 = 0
            com.bytedance.embedapplog.uc.r(r0, r3)
            return r1
        L64:
            long r0 = r0 - r2
            return r0
    }

    abstract boolean cw();

    abstract long j();

    boolean m() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }

    abstract java.lang.String r();

    void tl() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setImmediately, "
            r0.<init>(r1)
            java.lang.String r1 = r2.r()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.embedapplog.uc.j(r0)
            r0 = 1
            r2.f2085r = r0
            return
    }

    void up() {
            r1 = this;
            r0 = 1
            r1.cw = r0
            return
    }

    abstract long[] xt();
}
