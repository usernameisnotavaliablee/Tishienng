package com.bytedance.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements java.lang.Runnable {
    private long a;
    private final com.bytedance.j.xt.j.a b;
    private volatile boolean c;
    private java.lang.Runnable d;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.bytedance.j.xt.j.d a;

        a(com.bytedance.j.xt.j.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.bytedance.j.xt.j.d r0 = r2.a
                r1 = 0
                com.bytedance.j.xt.j.d.b(r0, r1)
                return
        }
    }

    d(com.bytedance.j.xt.j.a r11) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.c = r0
            com.bytedance.j.xt.j.d$a r0 = new com.bytedance.j.xt.j.d$a
            r0.<init>(r10)
            r10.d = r0
            r10.b = r11
            long r0 = r10.a()
            r10.a = r0
            r0 = 2
            com.bytedance.j.xt.up.d.a(r0)
            com.bytedance.j.xt.up.h r11 = com.bytedance.j.xt.up.h.b()
            r0 = 4500(0x1194, double:2.2233E-320)
            java.lang.Runnable r2 = r10.d
            r11.c(r0, r2)
            com.bytedance.j.xt.up.h r3 = com.bytedance.j.xt.up.h.b()
            r7 = 40
            r8 = 5000(0x1388, double:2.4703E-320)
            r4 = 5000(0x1388, double:2.4703E-320)
            r6 = r10
            r3.d(r4, r6, r7, r8)
            return
    }

    private long a() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/anr/traces.txt"
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L12
            long r0 = r0.lastModified()
            return r0
        L12:
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean b(com.bytedance.j.xt.j.d r0, boolean r1) {
            r0.c = r1
            return r1
    }

    private boolean c() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/anr/traces.txt"
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L15
            boolean r0 = r0.canRead()
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            boolean r0 = r4.c
            if (r0 != 0) goto L1f
            boolean r0 = r4.c()
            if (r0 == 0) goto Lf
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "/data/anr/traces.txt"
            goto L12
        Lf:
            r1 = 0
            r0 = 100
        L12:
            com.bytedance.j.xt.j.a r2 = r4.b
            r3 = 25
            boolean r0 = r2.e(r0, r1, r3)
            if (r0 == 0) goto L1f
            r0 = 1
            r4.c = r0
        L1f:
            return
    }
}
