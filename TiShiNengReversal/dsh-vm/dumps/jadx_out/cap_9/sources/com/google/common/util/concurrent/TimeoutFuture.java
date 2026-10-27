package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class TimeoutFuture<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private com.google.common.util.concurrent.ListenableFuture<V> delegateRef;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private java.util.concurrent.ScheduledFuture<?> timer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.TimeoutFuture$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Fire<V> implements java.lang.Runnable {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.util.concurrent.TimeoutFuture<V> timeoutFutureRef;

        Fire(com.google.common.util.concurrent.TimeoutFuture<V> r1) {
                r0 = this;
                r0.<init>()
                r0.timeoutFutureRef = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                com.google.common.util.concurrent.TimeoutFuture<V> r0 = r10.timeoutFutureRef
                if (r0 != 0) goto L5
                goto Lb
            L5:
                com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.TimeoutFuture.access$000(r0)
                if (r1 != 0) goto Lc
            Lb:
                return
            Lc:
                r2 = 0
                r10.timeoutFutureRef = r2
                boolean r3 = r1.isDone()
                if (r3 == 0) goto L19
                r0.setFuture(r1)
                return
            L19:
                r3 = 1
                java.util.concurrent.ScheduledFuture r4 = com.google.common.util.concurrent.TimeoutFuture.access$100(r0)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r5 = "Timed out"
                if (r4 == 0) goto L4e
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4c
                long r6 = r4.getDelay(r6)     // Catch: java.lang.Throwable -> L4c
                long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L4c
                r8 = 10
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 <= 0) goto L4e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
                r4.<init>()     // Catch: java.lang.Throwable -> L4c
                r4.append(r5)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r5 = " (timeout delayed by "
                r4.append(r5)     // Catch: java.lang.Throwable -> L4c
                r4.append(r6)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r5 = " ms after scheduled time)"
                r4.append(r5)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L4c
                goto L4e
            L4c:
                r0 = move-exception
                goto L71
            L4e:
                com.google.common.util.concurrent.TimeoutFuture.access$102(r0, r2)     // Catch: java.lang.Throwable -> L4c
                com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException r4 = new com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException     // Catch: java.lang.Throwable -> L4c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
                r6.<init>()     // Catch: java.lang.Throwable -> L4c
                r6.append(r5)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r5 = ": "
                r6.append(r5)     // Catch: java.lang.Throwable -> L4c
                r6.append(r1)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L4c
                r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L4c
                r0.setException(r4)     // Catch: java.lang.Throwable -> L4c
                r1.cancel(r3)
                return
            L71:
                r1.cancel(r3)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TimeoutFutureException extends java.util.concurrent.TimeoutException {
        private TimeoutFutureException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ TimeoutFutureException(java.lang.String r1, com.google.common.util.concurrent.TimeoutFuture.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]     // Catch: java.lang.Throwable -> L9
                r1.setStackTrace(r0)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return r1
            L9:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r0
        }
    }

    private TimeoutFuture(com.google.common.util.concurrent.ListenableFuture<V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.delegateRef = r1
            return
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture access$000(com.google.common.util.concurrent.TimeoutFuture r0) {
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r0.delegateRef
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$100(com.google.common.util.concurrent.TimeoutFuture r0) {
            java.util.concurrent.ScheduledFuture<?> r0 = r0.timer
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$102(com.google.common.util.concurrent.TimeoutFuture r0, java.util.concurrent.ScheduledFuture r1) {
            r0.timer = r1
            return r1
    }

    static <V> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<V> r2, long r3, java.util.concurrent.TimeUnit r5, java.util.concurrent.ScheduledExecutorService r6) {
            com.google.common.util.concurrent.TimeoutFuture r0 = new com.google.common.util.concurrent.TimeoutFuture
            r0.<init>(r2)
            com.google.common.util.concurrent.TimeoutFuture$Fire r1 = new com.google.common.util.concurrent.TimeoutFuture$Fire
            r1.<init>(r0)
            java.util.concurrent.ScheduledFuture r3 = r6.schedule(r1, r3, r5)
            r0.timer = r3
            java.util.concurrent.Executor r3 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r2.addListener(r1, r3)
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void afterDone() {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r2.delegateRef
            r2.maybePropagateCancellationTo(r0)
            java.util.concurrent.ScheduledFuture<?> r0 = r2.timer
            if (r0 == 0) goto Ld
            r1 = 0
            r0.cancel(r1)
        Ld:
            r0 = 0
            r2.delegateRef = r0
            r2.timer = r0
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r6.delegateRef
            java.util.concurrent.ScheduledFuture<?> r1 = r6.timer
            if (r0 == 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "inputFuture=["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            if (r1 == 0) goto L43
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ", remaining delay=["
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " ms]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L43:
            return r0
        L44:
            r0 = 0
            return r0
    }
}
