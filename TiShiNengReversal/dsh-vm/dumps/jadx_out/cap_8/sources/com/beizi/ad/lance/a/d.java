package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.atomic.AtomicInteger a = null;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.ThreadGroup f7251b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f7252c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f7253d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7254e;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            com.beizi.ad.lance.a.d.a = r0
            return
    }

    d(int r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.f7252c = r0
            r2.f7254e = r3
            java.lang.SecurityManager r3 = java.lang.System.getSecurityManager()
            if (r3 == 0) goto L18
            java.lang.ThreadGroup r3 = r3.getThreadGroup()
            goto L20
        L18:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r3 = r3.getThreadGroup()
        L20:
            r2.f7251b = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r0 = "-thread-"
            if (r3 == 0) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "BeiZi-adsdk-background-"
            r3.append(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = com.beizi.ad.lance.a.d.a
            int r4 = r4.getAndIncrement()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.f7253d = r3
            return
        L47:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = com.beizi.ad.lance.a.d.a
            int r4 = r4.getAndIncrement()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.f7253d = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r7) {
            r6 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.ThreadGroup r1 = r6.f7251b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.f7253d
            r2.append(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f7252c
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
            int r7 = r6.f7254e
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
