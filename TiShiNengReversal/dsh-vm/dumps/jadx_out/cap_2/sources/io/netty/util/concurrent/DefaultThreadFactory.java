package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.atomic.AtomicInteger poolId = null;
    private final boolean daemon;
    private final java.util.concurrent.atomic.AtomicInteger nextId;
    private final java.lang.String prefix;
    private final int priority;
    protected final java.lang.ThreadGroup threadGroup;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            io.netty.util.concurrent.DefaultThreadFactory.poolId = r0
            return
    }

    public DefaultThreadFactory(java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
            r1 = 5
            r2.<init>(r3, r0, r1)
            return
    }

    public DefaultThreadFactory(java.lang.Class<?> r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public DefaultThreadFactory(java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            r0 = 5
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultThreadFactory(java.lang.Class<?> r1, boolean r2, int r3) {
            r0 = this;
            java.lang.String r1 = toPoolName(r1)
            r0.<init>(r1, r2, r3)
            return
    }

    public DefaultThreadFactory(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 5
            r2.<init>(r3, r0, r1)
            return
    }

    public DefaultThreadFactory(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public DefaultThreadFactory(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 5
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultThreadFactory(java.lang.String r2, boolean r3, int r4) {
            r1 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lf
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r0 = r0.getThreadGroup()
            goto L17
        Lf:
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            java.lang.ThreadGroup r0 = r0.getThreadGroup()
        L17:
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultThreadFactory(java.lang.String r3, boolean r4, int r5, java.lang.ThreadGroup r6) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.nextId = r0
            if (r3 == 0) goto L55
            r0 = 1
            if (r5 < r0) goto L39
            r0 = 10
            if (r5 > r0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 45
            r0.append(r3)
            java.util.concurrent.atomic.AtomicInteger r1 = io.netty.util.concurrent.DefaultThreadFactory.poolId
            int r1 = r1.incrementAndGet()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.prefix = r3
            r2.daemon = r4
            r2.priority = r5
            r2.threadGroup = r6
            return
        L39:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "priority: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = " (expected: Thread.MIN_PRIORITY <= priority <= Thread.MAX_PRIORITY)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L55:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "poolName"
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.String toPoolName(java.lang.Class<?> r3) {
            if (r3 == 0) goto L4a
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            int r0 = r3.length()
            if (r0 == 0) goto L47
            r1 = 1
            if (r0 == r1) goto L40
            r0 = 0
            char r2 = r3.charAt(r0)
            boolean r2 = java.lang.Character.isUpperCase(r2)
            if (r2 == 0) goto L3f
            char r2 = r3.charAt(r1)
            boolean r2 = java.lang.Character.isLowerCase(r2)
            if (r2 == 0) goto L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r0 = r3.charAt(r0)
            char r0 = java.lang.Character.toLowerCase(r0)
            r2.append(r0)
            java.lang.String r3 = r3.substring(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L3f:
            return r3
        L40:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            return r3
        L47:
            java.lang.String r3 = "unknown"
            return r3
        L4a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "poolType"
            r3.<init>(r0)
            throw r3
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Runnable r3 = io.netty.util.concurrent.FastThreadLocalRunnable.wrap(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.prefix
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.nextId
            int r1 = r1.incrementAndGet()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Thread r3 = r2.newThread(r3, r0)
            boolean r0 = r3.isDaemon()     // Catch: java.lang.Exception -> L35
            boolean r1 = r2.daemon     // Catch: java.lang.Exception -> L35
            if (r0 == r1) goto L2a
            r3.setDaemon(r1)     // Catch: java.lang.Exception -> L35
        L2a:
            int r0 = r3.getPriority()     // Catch: java.lang.Exception -> L35
            int r1 = r2.priority     // Catch: java.lang.Exception -> L35
            if (r0 == r1) goto L35
            r3.setPriority(r1)     // Catch: java.lang.Exception -> L35
        L35:
            return r3
    }

    protected java.lang.Thread newThread(java.lang.Runnable r3, java.lang.String r4) {
            r2 = this;
            io.netty.util.concurrent.FastThreadLocalThread r0 = new io.netty.util.concurrent.FastThreadLocalThread
            java.lang.ThreadGroup r1 = r2.threadGroup
            r0.<init>(r1, r3, r4)
            return r0
    }
}
