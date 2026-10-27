package com.ss.android.socialbase.downloader.ws;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j implements java.util.concurrent.ThreadFactory {
    private final boolean cw;
    private final java.lang.String j;
    private final java.util.concurrent.atomic.AtomicInteger xt;

    public j(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public j(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.xt = r0
            r1.j = r2
            r1.cw = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.xt
            int r0 = r0.incrementAndGet()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.j
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.sdk.component.oq.r.cw r1 = new com.bytedance.sdk.component.oq.r.cw
            r1.<init>(r4, r0)
            boolean r4 = r3.cw
            if (r4 != 0) goto L39
            boolean r4 = r1.isDaemon()
            if (r4 == 0) goto L2f
            r4 = 0
            r1.setDaemon(r4)
        L2f:
            int r4 = r1.getPriority()
            r0 = 5
            if (r4 == r0) goto L39
            r1.setPriority(r0)
        L39:
            return r1
    }
}
