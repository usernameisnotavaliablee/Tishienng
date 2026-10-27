package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static final java.util.LinkedList<com.bytedance.embedapplog.ya> j = null;
    private static final java.util.LinkedList<com.bytedance.embedapplog.ya> xt = null;

    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.bytedance.embedapplog.a.j = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.bytedance.embedapplog.a.xt = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j() {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList<com.bytedance.embedapplog.ya> r2 = com.bytedance.embedapplog.a.j
            monitor-enter(r2)
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.LinkedList<com.bytedance.embedapplog.ya> r3 = com.bytedance.embedapplog.a.xt     // Catch: java.lang.Throwable -> L2d
            r1.addAll(r3)     // Catch: java.lang.Throwable -> L2d
            r2.clear()     // Catch: java.lang.Throwable -> L2d
            r3.clear()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
        L1c:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2c
            java.lang.Object r1 = r0.poll()
            com.bytedance.embedapplog.ya r1 = (com.bytedance.embedapplog.ya) r1
            com.bytedance.embedapplog.f.j(r1)
            goto L1c
        L2c:
            return
        L2d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
    }

    public static void j(com.bytedance.embedapplog.ya r4) {
            java.util.LinkedList<com.bytedance.embedapplog.ya> r0 = com.bytedance.embedapplog.a.j
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1d
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 <= r2) goto L1f
            java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L1d
            com.bytedance.embedapplog.ya r1 = (com.bytedance.embedapplog.ya) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "drop event in cache"
            r3 = 0
            com.bytedance.embedapplog.uc.xt(r2, r3)     // Catch: java.lang.Throwable -> L1d
            java.util.LinkedList<com.bytedance.embedapplog.ya> r2 = com.bytedance.embedapplog.a.xt     // Catch: java.lang.Throwable -> L1d
            r2.add(r1)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r4 = move-exception
            goto L24
        L1f:
            r0.add(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }
}
