package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class c {
    public static final java.lang.String a = "ExecutorsManager";
    public static final long b = 60;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements java.util.concurrent.ThreadFactory {
        public final java.util.concurrent.atomic.AtomicInteger a;
        public final java.lang.String b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.huawei.hms.feature.dynamic.c$a$a, reason: collision with other inner class name */
        public class C0027a implements java.lang.Thread.UncaughtExceptionHandler {
            public final /* synthetic */ com.huawei.hms.feature.dynamic.c.a a;

            public C0027a(com.huawei.hms.feature.dynamic.c.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread r2, java.lang.Throwable r3) {
                    r1 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = r2.getName()
                    r0.append(r2)
                    java.lang.String r2 = " : "
                    r0.append(r2)
                    java.lang.String r2 = r3.getMessage()
                    r0.append(r2)
                    java.lang.String r2 = r0.toString()
                    java.lang.String r3 = "ExecutorsManager"
                    com.huawei.hms.common.util.Logger.e(r3, r2)
                    return
            }
        }

        public a(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.a = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "-thread-"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.b = r3
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r3.b
                r1.append(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r3.a
                int r2 = r2.getAndIncrement()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r4, r1)
                com.huawei.hms.feature.dynamic.c$a$a r4 = new com.huawei.hms.feature.dynamic.c$a$a
                r4.<init>(r3)
                r0.setUncaughtExceptionHandler(r4)
                return r0
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ExecutorService a(int r8, java.lang.String r9) {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            com.huawei.hms.feature.dynamic.c$a r7 = new com.huawei.hms.feature.dynamic.c$a
            r7.<init>(r9)
            r3 = 60
            r2 = r8
            r1 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8 = 1
            r0.allowCoreThreadTimeOut(r8)
            return r0
    }
}
