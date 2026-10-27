package com.bytedance.j.cw.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.atomic.AtomicInteger e = null;
    private final java.lang.ThreadGroup a;
    private final java.util.concurrent.atomic.AtomicInteger b;
    private final java.lang.String c;
    private final com.bytedance.j.cw.j.xt.xt.j d;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            com.bytedance.j.cw.j.xt.c.e = r0
            return
    }

    c(com.bytedance.j.cw.j.xt.xt.j r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.b = r0
            r2.d = r3
            java.lang.SecurityManager r3 = java.lang.System.getSecurityManager()
            if (r3 == 0) goto L18
            java.lang.ThreadGroup r3 = r3.getThreadGroup()
            goto L20
        L18:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r3 = r3.getThreadGroup()
        L20:
            r2.a = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r0 = "-thread-"
            if (r3 == 0) goto L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ttdefault-"
            r3.<init>(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = com.bytedance.j.cw.j.xt.c.e
            int r4 = r4.getAndIncrement()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.c = r3
            return
        L44:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = com.bytedance.j.cw.j.xt.c.e
            int r4 = r4.getAndIncrement()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.c = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r7) {
            r6 = this;
            com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
            java.lang.ThreadGroup r1 = r6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.c
            r2.append(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r6.b
            int r3 = r3.getAndIncrement()
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r4 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4)
            boolean r7 = r0.isDaemon()
            if (r7 == 0) goto L2b
            r7 = 0
            r0.setDaemon(r7)
        L2b:
            com.bytedance.j.cw.j.xt.xt$j r7 = r6.d
            if (r7 == 0) goto L40
            int r7 = r7.j()
            com.bytedance.j.cw.j.xt.xt$j r1 = com.bytedance.j.cw.j.xt.xt.j.j
            int r1 = r1.j()
            if (r7 != r1) goto L40
            r7 = 1
            r0.setPriority(r7)
            return r0
        L40:
            int r7 = r0.getPriority()
            r1 = 5
            if (r7 == r1) goto L4c
            r7 = 3
            r0.setPriority(r7)
            return r0
        L4c:
            r0.setPriority(r1)
            return r0
    }
}
