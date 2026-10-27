package xyz.adscope.common.v2.thread.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ScopeThreadFactory implements java.util.concurrent.ThreadFactory {
    private static final java.lang.String DEF_THREAD_NAME_FORMAT = "adScope-%s-%d-thread-";
    private static final java.util.concurrent.atomic.AtomicInteger threadNum = null;
    private final java.util.concurrent.atomic.AtomicInteger NEW_NUM;
    private final int priority;
    private final java.lang.ThreadGroup threadGroup;
    private final java.lang.String threadName;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory.threadNum = r0
            return
    }

    ScopeThreadFactory(int r5, java.lang.String r6) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r4.NEW_NUM = r0
            r4.priority = r5
            java.lang.ThreadGroup r5 = r4.createNewGroup(r6)
            r4.threadGroup = r5
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.util.concurrent.atomic.AtomicInteger r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadFactory.threadNum
            int r0 = r0.getAndIncrement()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r2[r1] = r0
            java.lang.String r6 = "adScope-%s-%d-thread-"
            java.lang.String r5 = java.lang.String.format(r5, r6, r2)
            r4.threadName = r5
            return
    }

    private java.lang.ThreadGroup createNewGroup(java.lang.String r2) {
            r1 = this;
            java.lang.ThreadGroup r0 = new java.lang.ThreadGroup     // Catch: java.lang.SecurityException -> L6
            r0.<init>(r2)     // Catch: java.lang.SecurityException -> L6
            return r0
        L6:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r2 = r2.getThreadGroup()
            return r2
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r7) {
            r6 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.ThreadGroup r1 = r6.threadGroup
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.threadName
            r2.append(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r6.NEW_NUM
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
            int r7 = r6.priority
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
