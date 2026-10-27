package com.kwad.framework.filedownloader.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static volatile java.util.concurrent.ThreadPoolExecutor apA;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.util.concurrent.ThreadFactory {
        private static final java.util.concurrent.atomic.AtomicInteger apB = null;
        private final java.lang.ThreadGroup group;
        private final java.lang.String namePrefix;
        private final java.util.concurrent.atomic.AtomicInteger threadNumber;

        static {
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                com.kwad.framework.filedownloader.f.b.a.apB = r0
                return
        }

        a(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.threadNumber = r0
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.ThreadGroup r0 = r0.getThreadGroup()
                r2.group = r0
                java.lang.String r3 = com.kwad.framework.filedownloader.f.f.bG(r3)
                r2.namePrefix = r3
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable r7) {
                r6 = this;
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.ThreadGroup r1 = r6.group
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "ksad-"
                r2.<init>(r3)
                java.lang.String r3 = r6.namePrefix
                r2.append(r3)
                java.util.concurrent.atomic.AtomicInteger r3 = r6.threadNumber
                int r3 = r3.getAndIncrement()
                r2.append(r3)
                java.lang.String r3 = r2.toString()
                r4 = 0
                r2 = r7
                r0.<init>(r1, r2, r3, r4)
                boolean r7 = r0.isDaemon()
                if (r7 == 0) goto L2d
                r7 = 0
                r0.setDaemon(r7)
            L2d:
                int r7 = r0.getPriority()
                r1 = 5
                if (r7 == r1) goto L37
                r0.setPriority(r1)
            L37:
                return r0
        }
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static java.util.concurrent.ThreadPoolExecutor a(int r8, java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r9, java.lang.String r10) {
            boolean r0 = zx()
            if (r0 == 0) goto Lb
            java.util.concurrent.ThreadPoolExecutor r8 = zy()
            return r8
        Lb:
            com.kwad.sdk.core.threads.a.b r0 = new com.kwad.sdk.core.threads.a.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            com.kwad.framework.filedownloader.f.b$a r7 = new com.kwad.framework.filedownloader.f.b$a
            r7.<init>(r10)
            r3 = 15
            r2 = r8
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r3, r5, r6, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ksad-"
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.kwad.sdk.core.threads.c.a(r0, r8)
            r8 = 1
            r0.allowCoreThreadTimeOut(r8)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.concurrent.ThreadPoolExecutor bA(java.lang.String r8) {
            boolean r0 = zx()
            if (r0 == 0) goto Lb
            java.util.concurrent.ThreadPoolExecutor r8 = zy()
            return r8
        Lb:
            com.kwad.sdk.core.threads.a.b r0 = new com.kwad.sdk.core.threads.a.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r6 = new java.util.concurrent.SynchronousQueue
            r6.<init>()
            com.kwad.framework.filedownloader.f.b$a r7 = new com.kwad.framework.filedownloader.f.b$a
            r7.<init>(r8)
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 15
            r0.<init>(r1, r2, r3, r5, r6, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ksad-"
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.kwad.sdk.core.threads.c.a(r0, r8)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.concurrent.ThreadPoolExecutor r(int r1, java.lang.String r2) {
            boolean r0 = zx()
            if (r0 == 0) goto Lb
            java.util.concurrent.ThreadPoolExecutor r1 = zy()
            return r1
        Lb:
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            java.util.concurrent.ThreadPoolExecutor r1 = a(r1, r0, r2)
            return r1
    }

    private static boolean zx() {
            java.lang.Class<com.kwad.sdk.service.a.h> r0 = com.kwad.sdk.service.a.h.class
            java.lang.Object r0 = com.kwad.sdk.service.ServiceProvider.get(r0)
            com.kwad.sdk.service.a.h r0 = (com.kwad.sdk.service.a.h) r0
            if (r0 == 0) goto Lf
            boolean r0 = r0.zx()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private static java.util.concurrent.ThreadPoolExecutor zy() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.kwad.framework.filedownloader.f.b.apA
            if (r0 != 0) goto L30
            java.lang.Class<com.kwad.framework.filedownloader.f.b> r1 = com.kwad.framework.filedownloader.f.b.class
            monitor-enter(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = com.kwad.framework.filedownloader.f.b.apA     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L2c
            com.kwad.sdk.core.threads.a.b r2 = new com.kwad.sdk.core.threads.a.b     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L2a
            r8.<init>()     // Catch: java.lang.Throwable -> L2a
            com.kwad.framework.filedownloader.f.b$a r9 = new com.kwad.framework.filedownloader.f.b$a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = ""
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r3 = 5
            r4 = 5
            r5 = 60
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a
            com.kwad.framework.filedownloader.f.b.apA = r2     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "ksad-filedownload-default"
            com.kwad.sdk.core.threads.c.a(r2, r0)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r0 = move-exception
            goto L2e
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            goto L30
        L2e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L30:
            java.util.concurrent.ThreadPoolExecutor r0 = com.kwad.framework.filedownloader.f.b.apA
            return r0
    }
}
