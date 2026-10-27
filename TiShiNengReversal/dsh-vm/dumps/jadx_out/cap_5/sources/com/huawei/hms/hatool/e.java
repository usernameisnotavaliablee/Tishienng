package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private static com.huawei.hms.hatool.e b;
    private static com.huawei.hms.hatool.e c;
    private static com.huawei.hms.hatool.e d;
    private java.util.concurrent.ThreadPoolExecutor a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements java.lang.Runnable {
        private java.lang.Runnable a;

        public a(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Runnable r0 = r2.a
                if (r0 == 0) goto Lf
                r0.run()     // Catch: java.lang.Exception -> L8
                return
            L8:
                java.lang.String r0 = "hmsSdk"
                java.lang.String r1 = "InnerTask : Exception has happened,From internal operations!"
                com.huawei.hms.hatool.j1.l(r0, r1)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements java.util.concurrent.ThreadFactory {
        private static final java.util.concurrent.atomic.AtomicInteger d = null;
        private final java.lang.ThreadGroup a;
        private final java.util.concurrent.atomic.AtomicInteger b;
        private final java.lang.String c;

        static {
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                com.huawei.hms.hatool.e.b.d = r0
                return
        }

        b() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.b = r0
                java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
                if (r0 == 0) goto L16
                java.lang.ThreadGroup r0 = r0.getThreadGroup()
                goto L1e
            L16:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.ThreadGroup r0 = r0.getThreadGroup()
            L1e:
                r2.a = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FormalHASDK-base-"
                r0.append(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = com.huawei.hms.hatool.e.b.d
                int r1 = r1.getAndIncrement()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.c = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r7) {
                r6 = this;
                java.lang.Thread r0 = new java.lang.Thread
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
                return r0
        }
    }

    static {
            com.huawei.hms.hatool.e r0 = new com.huawei.hms.hatool.e
            r0.<init>()
            com.huawei.hms.hatool.e r0 = new com.huawei.hms.hatool.e
            r0.<init>()
            com.huawei.hms.hatool.e r0 = new com.huawei.hms.hatool.e
            r0.<init>()
            com.huawei.hms.hatool.e.b = r0
            com.huawei.hms.hatool.e r0 = new com.huawei.hms.hatool.e
            r0.<init>()
            com.huawei.hms.hatool.e.c = r0
            com.huawei.hms.hatool.e r0 = new com.huawei.hms.hatool.e
            r0.<init>()
            com.huawei.hms.hatool.e.d = r0
            return
    }

    private e() {
            r8 = this;
            r8.<init>()
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r0 = 5000(0x1388, float:7.006E-42)
            r6.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.huawei.hms.hatool.e$b r7 = new com.huawei.hms.hatool.e$b
            r7.<init>()
            r2 = 1
            r3 = 60000(0xea60, double:2.9644E-319)
            r1 = 0
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.a = r0
            return
    }

    public static com.huawei.hms.hatool.e a() {
            com.huawei.hms.hatool.e r0 = com.huawei.hms.hatool.e.d
            return r0
    }

    public static com.huawei.hms.hatool.e c() {
            com.huawei.hms.hatool.e r0 = com.huawei.hms.hatool.e.c
            return r0
    }

    public static com.huawei.hms.hatool.e d() {
            com.huawei.hms.hatool.e r0 = com.huawei.hms.hatool.e.b
            return r0
    }

    public void b(com.huawei.hms.hatool.v r3) {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.a     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            com.huawei.hms.hatool.e$a r1 = new com.huawei.hms.hatool.e$a     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r1.<init>(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            return
        Lb:
            java.lang.String r3 = "hmsSdk"
            java.lang.String r0 = "addToQueue() Exception has happened!Form rejected execution"
            com.huawei.hms.hatool.j1.l(r3, r0)
            return
    }
}
