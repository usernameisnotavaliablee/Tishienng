package com.volcengine.mobsecBiz.metasec.ml;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class c {
    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.volcengine.mobsecBiz.metasec.ml.b a(java.lang.String r2) {
            java.lang.Class<com.volcengine.mobsecBiz.metasec.ml.c> r0 = com.volcengine.mobsecBiz.metasec.ml.c.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.m0 r2 = ms.bz.bd.c.Pgl.n0.e(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            com.volcengine.mobsecBiz.metasec.ml.b r1 = new com.volcengine.mobsecBiz.metasec.ml.b     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r2 = move-exception
            goto L14
        L11:
            r1 = 0
        L12:
            monitor-exit(r0)
            return r1
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public static synchronized boolean b(android.content.Context r1, com.volcengine.mobsecBiz.metasec.ml.a r2) {
            java.lang.Class<com.volcengine.mobsecBiz.metasec.ml.c> r0 = com.volcengine.mobsecBiz.metasec.ml.c.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.pblu r2 = r2.b()     // Catch: java.lang.Throwable -> Ld
            boolean r1 = ms.bz.bd.c.Pgl.n0.d(r1, r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public static synchronized void c(java.lang.String r1) {
            java.lang.Class<com.volcengine.mobsecBiz.metasec.ml.c> r0 = com.volcengine.mobsecBiz.metasec.ml.c.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.n0.c(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public static void d() {
            int r0 = ms.bz.bd.c.Pgl.n0.d
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r5 = 0
            r6 = 0
            r1 = 67108868(0x4000004, float:1.5046335E-36)
            r2 = 0
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            return
    }

    public static void e() {
            int r0 = ms.bz.bd.c.Pgl.n0.d
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r5 = 0
            r6 = 0
            r1 = 67108869(0x4000005, float:1.5046337E-36)
            r2 = 0
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            return
    }

    public static java.lang.String f() {
            int r0 = ms.bz.bd.c.Pgl.n0.d
            int r0 = ms.bz.bd.c.Pgl.pbly.b
            r5 = 0
            r6 = 0
            r1 = 67108867(0x4000003, float:1.5046333E-36)
            r2 = 0
            r3 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}
