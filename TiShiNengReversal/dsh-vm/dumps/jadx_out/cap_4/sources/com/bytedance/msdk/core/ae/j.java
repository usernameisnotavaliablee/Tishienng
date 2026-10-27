package com.bytedance.msdk.core.ae;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static volatile com.bytedance.msdk.core.ae.j j;
    private long cw;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.Queue<java.lang.Long> f2195r;
    private long xt;

    private j() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.f2195r = r0
            return
    }

    public static com.bytedance.msdk.core.ae.j j() {
            com.bytedance.msdk.core.ae.j r0 = com.bytedance.msdk.core.ae.j.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.ae.j> r0 = com.bytedance.msdk.core.ae.j.class
            monitor-enter(r0)
            com.bytedance.msdk.core.ae.j r1 = com.bytedance.msdk.core.ae.j.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.ae.j r1 = new com.bytedance.msdk.core.ae.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.ae.j.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.core.ae.j r0 = com.bytedance.msdk.core.ae.j.j
            return r0
    }

    public void j(long r5, long r7) {
            r4 = this;
            java.lang.Class<com.bytedance.msdk.core.ae.j> r0 = com.bytedance.msdk.core.ae.j.class
            monitor-enter(r0)
            long r1 = r4.xt     // Catch: java.lang.Throwable -> L10
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L12
            long r1 = r4.cw     // Catch: java.lang.Throwable -> L10
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L12
        L10:
            r5 = move-exception
            goto L1d
        L12:
            r4.xt = r5     // Catch: java.lang.Throwable -> L10
            r4.cw = r7     // Catch: java.lang.Throwable -> L10
            java.util.Queue<java.lang.Long> r5 = r4.f2195r     // Catch: java.lang.Throwable -> L10
            r5.clear()     // Catch: java.lang.Throwable -> L10
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r5
    }

    public boolean xt() {
            r9 = this;
            java.lang.Class<com.bytedance.msdk.core.ae.j> r0 = com.bytedance.msdk.core.ae.j.class
            monitor-enter(r0)
            long r1 = r9.xt     // Catch: java.lang.Throwable -> L37
            r3 = 0
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L55
            long r1 = r9.cw     // Catch: java.lang.Throwable -> L37
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L13
            goto L55
        L13:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L37
            java.util.Queue<java.lang.Long> r4 = r9.f2195r     // Catch: java.lang.Throwable -> L37
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L37
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L37
            long r6 = r9.xt     // Catch: java.lang.Throwable -> L37
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L53
        L24:
            java.util.Queue<java.lang.Long> r4 = r9.f2195r     // Catch: java.lang.Throwable -> L37
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L37
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L37
            long r6 = r9.xt     // Catch: java.lang.Throwable -> L37
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L39
            java.util.Queue<java.lang.Long> r4 = r9.f2195r     // Catch: java.lang.Throwable -> L37
            r4.poll()     // Catch: java.lang.Throwable -> L37
            goto L24
        L37:
            r1 = move-exception
            goto L57
        L39:
            java.util.Queue<java.lang.Long> r4 = r9.f2195r     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Throwable -> L37
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L37
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L37
            long r1 = r1 - r4
            long r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L37
            long r4 = r9.cw     // Catch: java.lang.Throwable -> L37
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L53
            r1 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r1
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r3
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r3
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r1
    }
}
