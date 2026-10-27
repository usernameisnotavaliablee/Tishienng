package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ListenerCallQueue<L> {
    private static final java.util.logging.Logger logger = null;
    private final java.util.List<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>> listeners;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Event<L> {
        void call(L r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PerListenerQueue<L> implements java.lang.Runnable {
        final java.util.concurrent.Executor executor;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        boolean isThreadScheduled;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        final java.util.Queue<java.lang.Object> labelQueue;
        final L listener;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        final java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue.Event<L>> waitQueue;

        PerListenerQueue(L r2, java.util.concurrent.Executor r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayDeque r0 = com.google.common.collect.Queues.newArrayDeque()
                r1.waitQueue = r0
                java.util.ArrayDeque r0 = com.google.common.collect.Queues.newArrayDeque()
                r1.labelQueue = r0
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                r1.listener = r2
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
                r1.executor = r2
                return
        }

        synchronized void add(com.google.common.util.concurrent.ListenerCallQueue.Event<L> r2, java.lang.Object r3) {
                r1 = this;
                monitor-enter(r1)
                java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue$Event<L>> r0 = r1.waitQueue     // Catch: java.lang.Throwable -> Ld
                r0.add(r2)     // Catch: java.lang.Throwable -> Ld
                java.util.Queue<java.lang.Object> r2 = r1.labelQueue     // Catch: java.lang.Throwable -> Ld
                r2.add(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)
                return
            Ld:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r2
        }

        void dispatch() {
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.isThreadScheduled     // Catch: java.lang.Throwable -> La
                r1 = 0
                if (r0 != 0) goto Lc
                r0 = 1
                r5.isThreadScheduled = r0     // Catch: java.lang.Throwable -> La
                goto Ld
            La:
                r0 = move-exception
                goto L46
            Lc:
                r0 = 0
            Ld:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> La
                if (r0 == 0) goto L45
                java.util.concurrent.Executor r0 = r5.executor     // Catch: java.lang.RuntimeException -> L16
                r0.execute(r5)     // Catch: java.lang.RuntimeException -> L16
                return
            L16:
                r0 = move-exception
                monitor-enter(r5)
                r5.isThreadScheduled = r1     // Catch: java.lang.Throwable -> L42
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L42
                java.util.logging.Logger r1 = com.google.common.util.concurrent.ListenerCallQueue.access$000()
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Exception while running callbacks for "
                r3.append(r4)
                L r4 = r5.listener
                r3.append(r4)
                java.lang.String r4 = " on "
                r3.append(r4)
                java.util.concurrent.Executor r4 = r5.executor
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.log(r2, r3, r0)
                throw r0
            L42:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L42
                throw r0
            L45:
                return
            L46:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L2a
                boolean r2 = r9.isThreadScheduled     // Catch: java.lang.Throwable -> L1f
                com.google.common.base.Preconditions.checkState(r2)     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue$Event<L>> r2 = r9.waitQueue     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L1f
                com.google.common.util.concurrent.ListenerCallQueue$Event r2 = (com.google.common.util.concurrent.ListenerCallQueue.Event) r2     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<java.lang.Object> r3 = r9.labelQueue     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L23
                r9.isThreadScheduled = r0     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = 0
                goto L52
            L1f:
                r2 = move-exception
                r1 = r2
                r2 = 1
                goto L52
            L23:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1f
                L r4 = r9.listener     // Catch: java.lang.Throwable -> L2a java.lang.RuntimeException -> L2c
                r2.call(r4)     // Catch: java.lang.Throwable -> L2a java.lang.RuntimeException -> L2c
                goto L0
            L2a:
                r2 = move-exception
                goto L5b
            L2c:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.ListenerCallQueue.access$000()     // Catch: java.lang.Throwable -> L2a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L2a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
                r6.<init>()     // Catch: java.lang.Throwable -> L2a
                java.lang.String r7 = "Exception while executing callback: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2a
                L r7 = r9.listener     // Catch: java.lang.Throwable -> L2a
                r6.append(r7)     // Catch: java.lang.Throwable -> L2a
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2a
                r6.append(r3)     // Catch: java.lang.Throwable -> L2a
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L2a
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L2a
                goto L0
            L52:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L59
                throw r1     // Catch: java.lang.Throwable -> L54
            L54:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L5b
            L59:
                r1 = move-exception
                goto L52
            L5b:
                if (r1 == 0) goto L65
                monitor-enter(r9)
                r9.isThreadScheduled = r0     // Catch: java.lang.Throwable -> L62
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
                goto L65
            L62:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
                throw r0
            L65:
                throw r2
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ListenerCallQueue> r0 = com.google.common.util.concurrent.ListenerCallQueue.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ListenerCallQueue.logger = r0
            return
    }

    ListenerCallQueue() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r1.listeners = r0
            return
    }

    static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ListenerCallQueue.logger
            return r0
    }

    private void enqueueHelper(com.google.common.util.concurrent.ListenerCallQueue.Event<L> r4, java.lang.Object r5) {
            r3 = this;
            java.lang.String r0 = "event"
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "label"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r0 = r3.listeners
            monitor-enter(r0)
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r1 = r3.listeners     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue r2 = (com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue) r2     // Catch: java.lang.Throwable -> L23
            r2.add(r4, r5)     // Catch: java.lang.Throwable -> L23
            goto L13
        L23:
            r4 = move-exception
            goto L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    public void addListener(L r3, java.util.concurrent.Executor r4) {
            r2 = this;
            java.lang.String r0 = "listener"
            com.google.common.base.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "executor"
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r0 = r2.listeners
            com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue r1 = new com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public void dispatch() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r1 = r2.listeners
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue<L>> r1 = r2.listeners
            java.lang.Object r1 = r1.get(r0)
            com.google.common.util.concurrent.ListenerCallQueue$PerListenerQueue r1 = (com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue) r1
            r1.dispatch()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    public void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> r1) {
            r0 = this;
            r0.enqueueHelper(r1, r1)
            return
    }

    public void enqueue(com.google.common.util.concurrent.ListenerCallQueue.Event<L> r1, java.lang.String r2) {
            r0 = this;
            r0.enqueueHelper(r1, r2)
            return
    }
}
