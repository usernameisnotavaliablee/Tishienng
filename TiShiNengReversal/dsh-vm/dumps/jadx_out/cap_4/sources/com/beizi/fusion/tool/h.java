package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.atomic.AtomicInteger a = null;
    private final java.lang.ThreadGroup b;
    private final java.util.concurrent.atomic.AtomicInteger c;
    private final java.lang.String d;
    private final int e;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            com.beizi.fusion.tool.h.a = r0
            return
    }

    h(int r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.c = r0
            r2.e = r3
            java.lang.SecurityManager r3 = java.lang.System.getSecurityManager()
            if (r3 == 0) goto L18
            java.lang.ThreadGroup r3 = r3.getThreadGroup()
            goto L20
        L18:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r3 = r3.getThreadGroup()
        L20:
            r2.b = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r0 = "Td-"
            if (r3 == 0) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "afBg-"
            r3.append(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = com.beizi.fusion.tool.h.a
            int r4 = r4.getAndIncrement()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.d = r3
            return
        L47:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = com.beizi.fusion.tool.h.a
            int r4 = r4.getAndIncrement()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.d = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r7) {
            r6 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.ThreadGroup r1 = r6.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.d
            r2.append(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r6.c
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
            int r7 = r6.e
            r1 = 1
            if (r7 != r1) goto L34
            r0.setPriority(r1)
            return r0
        L34:
            int r7 = r0.getPriority()
            r1 = 5
            if (r7 == r1) goto L40
            r7 = 3
            r0.setPriority(r7)
            return r0
        L40:
            r0.setPriority(r1)
            return r0
    }
}
