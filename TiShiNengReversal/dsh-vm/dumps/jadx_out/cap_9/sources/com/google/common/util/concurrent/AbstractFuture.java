package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.j2objc.annotations.ReflectionSupport(com.google.j2objc.annotations.ReflectionSupport.Level.FULL)
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractFuture<V> extends com.google.common.util.concurrent.internal.InternalFutureFailureAccess implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final com.google.common.util.concurrent.AbstractFuture.AtomicHelper ATOMIC_HELPER = null;
    private static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final java.lang.Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final java.util.logging.Logger log = null;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private volatile com.google.common.util.concurrent.AbstractFuture.Listener listeners;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private volatile java.lang.Object value;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private volatile com.google.common.util.concurrent.AbstractFuture.Waiter waiters;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.AbstractFuture$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class AtomicHelper {
        private AtomicHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AtomicHelper(com.google.common.util.concurrent.AbstractFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r1, com.google.common.util.concurrent.AbstractFuture.Listener r2, com.google.common.util.concurrent.AbstractFuture.Listener r3);

        abstract boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r1, java.lang.Object r2, java.lang.Object r3);

        abstract boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r1, com.google.common.util.concurrent.AbstractFuture.Waiter r2, com.google.common.util.concurrent.AbstractFuture.Waiter r3);

        abstract void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r1, com.google.common.util.concurrent.AbstractFuture.Waiter r2);

        abstract void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r1, java.lang.Thread r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Cancellation {
        static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_CANCELLED = null;
        static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_INTERRUPTED = null;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
                boolean r0 = com.google.common.util.concurrent.AbstractFuture.access$300()
                r1 = 0
                if (r0 == 0) goto Lc
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED = r1
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED = r1
                return
            Lc:
                com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
                r2 = 0
                r0.<init>(r2, r1)
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED = r0
                com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
                r2 = 1
                r0.<init>(r2, r1)
                com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED = r0
                return
        }

        Cancellation(boolean r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.wasInterrupted = r1
                r0.cause = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Failure {
        static final com.google.common.util.concurrent.AbstractFuture.Failure FALLBACK_INSTANCE = null;
        final java.lang.Throwable exception;


        static {
                com.google.common.util.concurrent.AbstractFuture$Failure r0 = new com.google.common.util.concurrent.AbstractFuture$Failure
                com.google.common.util.concurrent.AbstractFuture$Failure$1 r1 = new com.google.common.util.concurrent.AbstractFuture$Failure$1
                java.lang.String r2 = "Failure occurred while trying to finish a future."
                r1.<init>(r2)
                r0.<init>(r1)
                com.google.common.util.concurrent.AbstractFuture.Failure.FALLBACK_INSTANCE = r0
                return
        }

        Failure(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.exception = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Listener {
        static final com.google.common.util.concurrent.AbstractFuture.Listener TOMBSTONE = null;
        final java.util.concurrent.Executor executor;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.util.concurrent.AbstractFuture.Listener next;
        final java.lang.Runnable task;

        static {
                com.google.common.util.concurrent.AbstractFuture$Listener r0 = new com.google.common.util.concurrent.AbstractFuture$Listener
                r1 = 0
                r0.<init>(r1, r1)
                com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE = r0
                return
        }

        Listener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                r0.executor = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SafeAtomicHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Listener> listenersUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> valueUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, com.google.common.util.concurrent.AbstractFuture.Waiter> waiterNextUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Waiter> waitersUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, java.lang.Thread> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture.Waiter, com.google.common.util.concurrent.AbstractFuture.Waiter> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Waiter> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture.Listener> r5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> r6) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.waiterThreadUpdater = r2
                r1.waiterNextUpdater = r3
                r1.waitersUpdater = r4
                r1.listenersUpdater = r5
                r1.valueUpdater = r6
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r2, com.google.common.util.concurrent.AbstractFuture.Listener r3, com.google.common.util.concurrent.AbstractFuture.Listener r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Listener> r0 = r1.listenersUpdater
                boolean r2 = androidx.concurrent.futures.a.a(r0, r2, r3, r4)
                return r2
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, java.lang.Object> r0 = r1.valueUpdater
                boolean r2 = androidx.concurrent.futures.a.a(r0, r2, r3, r4)
                return r2
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r2, com.google.common.util.concurrent.AbstractFuture.Waiter r3, com.google.common.util.concurrent.AbstractFuture.Waiter r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = r1.waitersUpdater
                boolean r2 = androidx.concurrent.futures.a.a(r0, r2, r3, r4)
                return r2
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r2, com.google.common.util.concurrent.AbstractFuture.Waiter r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture$Waiter, com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = r1.waiterNextUpdater
                r0.lazySet(r2, r3)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AbstractFuture$Waiter, java.lang.Thread> r0 = r1.waiterThreadUpdater
                r0.lazySet(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SetFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final com.google.common.util.concurrent.AbstractFuture<V> owner;

        SetFuture(com.google.common.util.concurrent.AbstractFuture<V> r1, com.google.common.util.concurrent.ListenableFuture<? extends V> r2) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                r0.future = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.google.common.util.concurrent.AbstractFuture<V> r0 = r3.owner
                java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.access$400(r0)
                if (r0 == r3) goto L9
                goto L20
            L9:
                com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r3.future
                java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.access$500(r0)
                com.google.common.util.concurrent.AbstractFuture$AtomicHelper r1 = com.google.common.util.concurrent.AbstractFuture.access$200()
                com.google.common.util.concurrent.AbstractFuture<V> r2 = r3.owner
                boolean r0 = r1.casValue(r2, r3, r0)
                if (r0 == 0) goto L20
                com.google.common.util.concurrent.AbstractFuture<V> r0 = r3.owner
                com.google.common.util.concurrent.AbstractFuture.access$600(r0)
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SynchronizedHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        private SynchronizedHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ SynchronizedHelper(com.google.common.util.concurrent.AbstractFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r2, com.google.common.util.concurrent.AbstractFuture.Listener r3, com.google.common.util.concurrent.AbstractFuture.Listener r4) {
                r1 = this;
                monitor-enter(r2)
                com.google.common.util.concurrent.AbstractFuture$Listener r0 = com.google.common.util.concurrent.AbstractFuture.access$900(r2)     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto Lf
                com.google.common.util.concurrent.AbstractFuture.access$902(r2, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            Ld:
                r3 = move-exception
                goto L12
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            L12:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.access$400(r2)     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto Lf
                com.google.common.util.concurrent.AbstractFuture.access$402(r2, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            Ld:
                r3 = move-exception
                goto L12
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            L12:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r2, com.google.common.util.concurrent.AbstractFuture.Waiter r3, com.google.common.util.concurrent.AbstractFuture.Waiter r4) {
                r1 = this;
                monitor-enter(r2)
                com.google.common.util.concurrent.AbstractFuture$Waiter r0 = com.google.common.util.concurrent.AbstractFuture.access$800(r2)     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto Lf
                com.google.common.util.concurrent.AbstractFuture.access$802(r2, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            Ld:
                r3 = move-exception
                goto L12
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            L12:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r1, com.google.common.util.concurrent.AbstractFuture.Waiter r2) {
                r0 = this;
                r1.next = r2
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r1, java.lang.Thread r2) {
                r0 = this;
                r1.thread = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Trusted<V> extends com.google.common.util.concurrent.ListenableFuture<V> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class TrustedFuture<V> extends com.google.common.util.concurrent.AbstractFuture<V> implements com.google.common.util.concurrent.AbstractFuture.Trusted<V> {
        TrustedFuture() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                super.addListener(r1, r2)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final boolean cancel(boolean r1) {
                r0 = this;
                boolean r1 = super.cancel(r1)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                r1 = this;
                java.lang.Object r0 = super.get()
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final V get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                r0 = this;
                java.lang.Object r1 = super.get(r1, r3)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
                r1 = this;
                boolean r0 = super.isCancelled()
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
                r1 = this;
                boolean r0 = super.isDone()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class UnsafeAtomicHelper extends com.google.common.util.concurrent.AbstractFuture.AtomicHelper {
        static final long LISTENERS_OFFSET = 0;
        static final sun.misc.Unsafe UNSAFE = null;
        static final long VALUE_OFFSET = 0;
        static final long WAITERS_OFFSET = 0;
        static final long WAITER_NEXT_OFFSET = 0;
        static final long WAITER_THREAD_OFFSET = 0;


        static {
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = com.google.common.util.concurrent.AbstractFuture.Waiter.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L7
                goto L12
            L7:
                com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1 r1 = new com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1     // Catch: java.security.PrivilegedActionException -> L5d
                r1.<init>()     // Catch: java.security.PrivilegedActionException -> L5d
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.security.PrivilegedActionException -> L5d
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.security.PrivilegedActionException -> L5d
            L12:
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r2 = com.google.common.util.concurrent.AbstractFuture.class
                java.lang.String r3 = "waiters"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
                long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITERS_OFFSET = r3     // Catch: java.lang.Exception -> L53
                java.lang.String r3 = "listeners"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
                long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.LISTENERS_OFFSET = r3     // Catch: java.lang.Exception -> L53
                java.lang.String r3 = "value"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
                long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.VALUE_OFFSET = r2     // Catch: java.lang.Exception -> L53
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L53
                long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_THREAD_OFFSET = r2     // Catch: java.lang.Exception -> L53
                java.lang.String r2 = "next"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L53
                long r2 = r1.objectFieldOffset(r0)     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_NEXT_OFFSET = r2     // Catch: java.lang.Exception -> L53
                com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE = r1     // Catch: java.lang.Exception -> L53
                return
            L53:
                r0 = move-exception
                com.google.common.base.Throwables.throwIfUnchecked(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L5d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
        }

        private UnsafeAtomicHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ UnsafeAtomicHelper(com.google.common.util.concurrent.AbstractFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(com.google.common.util.concurrent.AbstractFuture<?> r7, com.google.common.util.concurrent.AbstractFuture.Listener r8, com.google.common.util.concurrent.AbstractFuture.Listener r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r2 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.LISTENERS_OFFSET
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.android.gms.internal.mlkit_acceleration.a.a(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(com.google.common.util.concurrent.AbstractFuture<?> r7, java.lang.Object r8, java.lang.Object r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r2 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.VALUE_OFFSET
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.android.gms.internal.mlkit_acceleration.a.a(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(com.google.common.util.concurrent.AbstractFuture<?> r7, com.google.common.util.concurrent.AbstractFuture.Waiter r8, com.google.common.util.concurrent.AbstractFuture.Waiter r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r2 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITERS_OFFSET
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.android.gms.internal.mlkit_acceleration.a.a(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(com.google.common.util.concurrent.AbstractFuture.Waiter r4, com.google.common.util.concurrent.AbstractFuture.Waiter r5) {
                r3 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r1 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_NEXT_OFFSET
                r0.putObject(r4, r1, r5)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(com.google.common.util.concurrent.AbstractFuture.Waiter r4, java.lang.Thread r5) {
                r3 = this;
                sun.misc.Unsafe r0 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.UNSAFE
                long r1 = com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.WAITER_THREAD_OFFSET
                r0.putObject(r4, r1, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Waiter {
        static final com.google.common.util.concurrent.AbstractFuture.Waiter TOMBSTONE = null;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        volatile com.google.common.util.concurrent.AbstractFuture.Waiter next;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        volatile java.lang.Thread thread;

        static {
                com.google.common.util.concurrent.AbstractFuture$Waiter r0 = new com.google.common.util.concurrent.AbstractFuture$Waiter
                r1 = 0
                r0.<init>(r1)
                com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE = r0
                return
        }

        Waiter() {
                r2 = this;
                r2.<init>()
                com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.access$200()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.putThread(r2, r1)
                return
        }

        Waiter(boolean r1) {
                r0 = this;
                r0.<init>()
                return
        }

        void setNext(com.google.common.util.concurrent.AbstractFuture.Waiter r2) {
                r1 = this;
                com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.access$200()
                r0.putNext(r1, r2)
                return
        }

        void unpark() {
                r2 = this;
                java.lang.Thread r0 = r2.thread
                if (r0 == 0) goto La
                r1 = 0
                r2.thread = r1
                java.util.concurrent.locks.LockSupport.unpark(r0)
            La:
                return
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Waiter> r1 = com.google.common.util.concurrent.AbstractFuture.Waiter.class
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r2)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES = r0
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r2 = com.google.common.util.concurrent.AbstractFuture.class
            java.lang.String r0 = r2.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AbstractFuture.log = r0
            r3 = 0
            com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper r0 = new com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper     // Catch: java.lang.Throwable -> L24
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L24
            r4 = r3
            goto L59
        L24:
            r0 = move-exception
            r4 = r0
            com.google.common.util.concurrent.AbstractFuture$SafeAtomicHelper r5 = new com.google.common.util.concurrent.AbstractFuture$SafeAtomicHelper     // Catch: java.lang.Throwable -> L51
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.String r6 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r6)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r1, r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Listener> r0 = com.google.common.util.concurrent.AbstractFuture.Listener.class
            java.lang.String r1 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)     // Catch: java.lang.Throwable -> L51
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L51
            r0 = r5
            goto L59
        L51:
            r0 = move-exception
            com.google.common.util.concurrent.AbstractFuture$SynchronizedHelper r1 = new com.google.common.util.concurrent.AbstractFuture$SynchronizedHelper
            r1.<init>(r3)
            r3 = r0
            r0 = r1
        L59:
            com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER = r0
            if (r3 == 0) goto L6b
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AbstractFuture.log
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r2 = "UnsafeAtomicHelper is broken!"
            r0.log(r1, r2, r4)
            java.lang.String r2 = "SafeAtomicHelper is broken!"
            r0.log(r1, r2, r3)
        L6b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.common.util.concurrent.AbstractFuture.NULL = r0
            return
    }

    protected AbstractFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.AtomicHelper access$200() {
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            return r0
    }

    static /* synthetic */ boolean access$300() {
            boolean r0 = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            return r0
    }

    static /* synthetic */ java.lang.Object access$400(com.google.common.util.concurrent.AbstractFuture r0) {
            java.lang.Object r0 = r0.value
            return r0
    }

    static /* synthetic */ java.lang.Object access$402(com.google.common.util.concurrent.AbstractFuture r0, java.lang.Object r1) {
            r0.value = r1
            return r1
    }

    static /* synthetic */ java.lang.Object access$500(com.google.common.util.concurrent.ListenableFuture r0) {
            java.lang.Object r0 = getFutureValue(r0)
            return r0
    }

    static /* synthetic */ void access$600(com.google.common.util.concurrent.AbstractFuture r0) {
            complete(r0)
            return
    }

    static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Waiter access$800(com.google.common.util.concurrent.AbstractFuture r0) {
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r0.waiters
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Waiter access$802(com.google.common.util.concurrent.AbstractFuture r0, com.google.common.util.concurrent.AbstractFuture.Waiter r1) {
            r0.waiters = r1
            return r1
    }

    static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Listener access$900(com.google.common.util.concurrent.AbstractFuture r0) {
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r0.listeners
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.AbstractFuture.Listener access$902(com.google.common.util.concurrent.AbstractFuture r0, com.google.common.util.concurrent.AbstractFuture.Listener r1) {
            r0.listeners = r1
            return r1
    }

    private void addDoneString(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = getUninterruptibly(r3)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.ExecutionException -> L18 java.util.concurrent.CancellationException -> L2c
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.ExecutionException -> L18 java.util.concurrent.CancellationException -> L2c
            java.lang.String r1 = r3.userObjectToString(r1)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.ExecutionException -> L18 java.util.concurrent.CancellationException -> L2c
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.ExecutionException -> L18 java.util.concurrent.CancellationException -> L2c
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.ExecutionException -> L18 java.util.concurrent.CancellationException -> L2c
            return
        L16:
            r0 = move-exception
            goto L1a
        L18:
            r1 = move-exception
            goto L32
        L1a:
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            goto L41
        L2c:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            goto L41
        L32:
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
            r4.append(r0)
        L41:
            return
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    private com.google.common.util.concurrent.AbstractFuture.Listener clearListeners(com.google.common.util.concurrent.AbstractFuture.Listener r5) {
            r4 = this;
        L0:
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r4.listeners
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r1 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            com.google.common.util.concurrent.AbstractFuture$Listener r2 = com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE
            boolean r1 = r1.casListeners(r4, r0, r2)
            if (r1 == 0) goto L0
            r3 = r0
            r0 = r5
            r5 = r3
        Lf:
            if (r5 == 0) goto L18
            com.google.common.util.concurrent.AbstractFuture$Listener r1 = r5.next
            r5.next = r0
            r0 = r5
            r5 = r1
            goto Lf
        L18:
            return r0
    }

    private static void complete(com.google.common.util.concurrent.AbstractFuture<?> r4) {
            r0 = 0
        L1:
            r4.releaseWaiters()
            r4.afterDone()
            com.google.common.util.concurrent.AbstractFuture$Listener r4 = r4.clearListeners(r0)
        Lb:
            if (r4 == 0) goto L33
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r4.next
            java.lang.Runnable r1 = r4.task
            boolean r2 = r1 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r2 == 0) goto L2c
            com.google.common.util.concurrent.AbstractFuture$SetFuture r1 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r1
            com.google.common.util.concurrent.AbstractFuture<V> r4 = r1.owner
            java.lang.Object r2 = r4.value
            if (r2 != r1) goto L31
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r1.future
            java.lang.Object r2 = getFutureValue(r2)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r3 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r1 = r3.casValue(r4, r1, r2)
            if (r1 == 0) goto L31
            goto L1
        L2c:
            java.util.concurrent.Executor r4 = r4.executor
            executeListener(r1, r4)
        L31:
            r4 = r0
            goto Lb
        L33:
            return
    }

    private static void executeListener(java.lang.Runnable r5, java.util.concurrent.Executor r6) {
            r6.execute(r5)     // Catch: java.lang.RuntimeException -> L4
            return
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.util.concurrent.AbstractFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RuntimeException while executing runnable "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " with executor "
            r3.append(r5)
            r3.append(r6)
            java.lang.String r5 = r3.toString()
            r1.log(r2, r5, r0)
            return
    }

    private V getDoneValue(java.lang.Object r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof com.google.common.util.concurrent.AbstractFuture.Failure
            if (r0 != 0) goto Le
            java.lang.Object r0 = com.google.common.util.concurrent.AbstractFuture.NULL
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            com.google.common.util.concurrent.AbstractFuture$Failure r2 = (com.google.common.util.concurrent.AbstractFuture.Failure) r2
            java.lang.Throwable r2 = r2.exception
            r0.<init>(r2)
            throw r0
        L18:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r2 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r2
            java.lang.Throwable r2 = r2.cause
            java.lang.String r0 = "Task was cancelled."
            java.util.concurrent.CancellationException r2 = cancellationExceptionWithCause(r0, r2)
            throw r2
    }

    private static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> r6) {
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r6 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            r2 = 0
            if (r1 == 0) goto L25
            com.google.common.util.concurrent.AbstractFuture r6 = (com.google.common.util.concurrent.AbstractFuture) r6
            java.lang.Object r6 = r6.value
            boolean r0 = r6 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r0 == 0) goto L24
            r0 = r6
            com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r0
            boolean r1 = r0.wasInterrupted
            if (r1 == 0) goto L24
            java.lang.Throwable r6 = r0.cause
            if (r6 == 0) goto L22
            com.google.common.util.concurrent.AbstractFuture$Cancellation r6 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.lang.Throwable r0 = r0.cause
            r6.<init>(r2, r0)
            return r6
        L22:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r6 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L24:
            return r6
        L25:
            boolean r1 = r6 instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess
            if (r1 == 0) goto L38
            r1 = r6
            com.google.common.util.concurrent.internal.InternalFutureFailureAccess r1 = (com.google.common.util.concurrent.internal.InternalFutureFailureAccess) r1
            java.lang.Throwable r1 = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure(r1)
            if (r1 == 0) goto L38
            com.google.common.util.concurrent.AbstractFuture$Failure r6 = new com.google.common.util.concurrent.AbstractFuture$Failure
            r6.<init>(r1)
            return r6
        L38:
            boolean r1 = r6.isCancelled()
            boolean r3 = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            r3 = r3 ^ 1
            r3 = r3 & r1
            if (r3 == 0) goto L46
            com.google.common.util.concurrent.AbstractFuture$Cancellation r6 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
            return r6
        L46:
            java.lang.Object r3 = getUninterruptibly(r6)     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            if (r1 == 0) goto L6a
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = new com.google.common.util.concurrent.AbstractFuture$Cancellation     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            r5.append(r0)     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            r5.append(r6)     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            java.lang.String r5 = r5.toString()     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            r4.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            r3.<init>(r2, r4)     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            return r3
        L66:
            r0 = move-exception
            goto L77
        L68:
            r3 = move-exception
            goto L9b
        L6a:
            if (r3 != 0) goto L6f
            java.lang.Object r6 = com.google.common.util.concurrent.AbstractFuture.NULL     // Catch: java.util.concurrent.CancellationException -> L66 java.util.concurrent.ExecutionException -> L68 java.lang.Throwable -> L70
            return r6
        L6f:
            return r3
        L70:
            r6 = move-exception
            com.google.common.util.concurrent.AbstractFuture$Failure r0 = new com.google.common.util.concurrent.AbstractFuture$Failure
            r0.<init>(r6)
            return r0
        L77:
            if (r1 != 0) goto L95
            com.google.common.util.concurrent.AbstractFuture$Failure r1 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r0)
            r1.<init>(r2)
            return r1
        L95:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r6 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            r6.<init>(r2, r0)
            return r6
        L9b:
            if (r1 == 0) goto Lb7
            com.google.common.util.concurrent.AbstractFuture$Cancellation r1 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            r4.<init>(r6, r3)
            r1.<init>(r2, r4)
            return r1
        Lb7:
            com.google.common.util.concurrent.AbstractFuture$Failure r6 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.Throwable r0 = r3.getCause()
            r6.<init>(r0)
            return r6
    }

    private static <V> V getUninterruptibly(java.util.concurrent.Future<V> r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    private void releaseWaiters() {
            r3 = this;
        L0:
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r3.waiters
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r1 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            com.google.common.util.concurrent.AbstractFuture$Waiter r2 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            boolean r1 = r1.casWaiters(r3, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            if (r0 == 0) goto L14
            r0.unpark()
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r0.next
            goto Lc
        L14:
            return
    }

    private void removeWaiter(com.google.common.util.concurrent.AbstractFuture.Waiter r5) {
            r4 = this;
            r0 = 0
            r5.thread = r0
        L3:
            com.google.common.util.concurrent.AbstractFuture$Waiter r5 = r4.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r1 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r5 != r1) goto La
            goto L29
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            com.google.common.util.concurrent.AbstractFuture$Waiter r2 = r5.next
            java.lang.Thread r3 = r5.thread
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.next = r2
            java.lang.Thread r5 = r1.thread
            if (r5 != 0) goto L27
            goto L3
        L1e:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r3 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r5 = r3.casWaiters(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    private java.lang.String userObjectToString(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L5
            java.lang.String r1 = "this future"
            return r1
        L5:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "Executor was null."
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            boolean r0 = r3.isDone()
            if (r0 != 0) goto L2c
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r3.listeners
            com.google.common.util.concurrent.AbstractFuture$Listener r1 = com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE
            if (r0 == r1) goto L2c
            com.google.common.util.concurrent.AbstractFuture$Listener r1 = new com.google.common.util.concurrent.AbstractFuture$Listener
            r1.<init>(r4, r5)
        L1b:
            r1.next = r0
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r2 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r0 = r2.casListeners(r3, r0, r1)
            if (r0 == 0) goto L26
            return
        L26:
            com.google.common.util.concurrent.AbstractFuture$Listener r0 = r3.listeners
            com.google.common.util.concurrent.AbstractFuture$Listener r2 = com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE
            if (r0 != r2) goto L1b
        L2c:
            executeListener(r4, r5)
            return
    }

    @com.google.common.annotations.Beta
    @com.google.errorprone.annotations.ForOverride
    protected void afterDone() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean cancel(boolean r8) {
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L60
            boolean r3 = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L1f
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L26
        L24:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L26:
            r5 = 0
            r4 = r7
        L28:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r6 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r6.casValue(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.interruptTask()
        L35:
            complete(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r4 == 0) goto L58
            com.google.common.util.concurrent.AbstractFuture$SetFuture r0 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            if (r4 == 0) goto L55
            r4 = r0
            com.google.common.util.concurrent.AbstractFuture r4 = (com.google.common.util.concurrent.AbstractFuture) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = 1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            return r1
        L59:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r6 != 0) goto L28
            return r5
        L60:
            return r2
    }

    @Override // java.util.concurrent.Future
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L1a:
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r6.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r3 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r0 == r3) goto L5a
            com.google.common.util.concurrent.AbstractFuture$Waiter r3 = new com.google.common.util.concurrent.AbstractFuture$Waiter
            r3.<init>()
        L25:
            r3.setNext(r0)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r4 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r0 = r4.casWaiters(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L4b:
            r6.removeWaiter(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r6.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r4 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L1ac
            java.lang.Object r6 = r0.value
            r8 = 1
            if (r6 == 0) goto L17
            r9 = 1
            goto L18
        L17:
            r9 = 0
        L18:
            boolean r10 = r6 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L23
            java.lang.Object r1 = r0.getDoneValue(r6)
            return r1
        L23:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L2f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L30
        L2f:
            r11 = r9
        L30:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L8b
            com.google.common.util.concurrent.AbstractFuture$Waiter r6 = r0.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r15 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r6 == r15) goto L84
            com.google.common.util.concurrent.AbstractFuture$Waiter r15 = new com.google.common.util.concurrent.AbstractFuture$Waiter
            r15.<init>()
        L41:
            r15.setNext(r6)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r7 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r7.casWaiters(r0, r6, r15)
            if (r6 == 0) goto L7e
        L4c:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L75
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = 0
        L5c:
            boolean r6 = r4 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L67
            java.lang.Object r1 = r0.getDoneValue(r4)
            return r1
        L67:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L4c
            r0.removeWaiter(r15)
            goto L8b
        L75:
            r0.removeWaiter(r15)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L7e:
            com.google.common.util.concurrent.AbstractFuture$Waiter r6 = r0.waiters
            com.google.common.util.concurrent.AbstractFuture$Waiter r7 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE
            if (r6 != r7) goto L41
        L84:
            java.lang.Object r1 = r0.value
            java.lang.Object r1 = r0.getDoneValue(r1)
            return r1
        L8b:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lb4
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L95
            r5 = 1
            goto L96
        L95:
            r5 = 0
        L96:
            boolean r6 = r4 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto La1
            java.lang.Object r1 = r0.getDoneValue(r4)
            return r1
        La1:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto Lae
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L8b
        Lae:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        Lb4:
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = r3.toString()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "Waited "
            r12.append(r15)
            r12.append(r1)
            java.lang.String r1 = " "
            r12.append(r1)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toLowerCase(r11)
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            long r11 = r4 + r13
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 >= 0) goto L175
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r2 = " (plus "
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            long r4 = -r4
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r3.convert(r4, r11)
            long r17 = r3.toNanos(r11)
            long r4 = r4 - r17
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L113
            int r9 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r9 <= 0) goto L110
            goto L113
        L110:
            r16 = 0
            goto L115
        L113:
            r16 = 1
        L115:
            if (r3 <= 0) goto L14e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r11)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            if (r16 == 0) goto L13f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ","
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L13f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
        L14e:
            if (r16 == 0) goto L164
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L164:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "delay)"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L175:
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L192
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " but future completed as timeout expired"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L192:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L1ac:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    protected void interruptTask() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.value
            r1 = 1
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r0 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r0 = r0 ^ r1
            r0 = r0 & r2
            return r0
    }

    final void maybePropagateCancellationTo(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.concurrent.Future<?> r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            boolean r1 = r2.isCancelled()
            r0 = r0 & r1
            if (r0 == 0) goto L13
            boolean r0 = r2.wasInterrupted()
            r3.cancel(r0)
        L13:
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    protected java.lang.String pendingToString() {
            r3 = this;
            java.lang.Object r0 = r3.value
            boolean r1 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setFuture=["
            r1.append(r2)
            com.google.common.util.concurrent.AbstractFuture$SetFuture r0 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            java.lang.String r0 = r3.userObjectToString(r0)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L25:
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remaining delay=["
            r0.append(r1)
            r1 = r3
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            r0.append(r1)
            java.lang.String r1 = " ms]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L49:
            r0 = 0
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    protected boolean set(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.Object r3 = com.google.common.util.concurrent.AbstractFuture.NULL
        L4:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r0.casValue(r2, r1, r3)
            if (r3 == 0) goto L12
            complete(r2)
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    protected boolean setException(java.lang.Throwable r3) {
            r2 = this;
            com.google.common.util.concurrent.AbstractFuture$Failure r0 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.<init>(r3)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r3 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r3.casValue(r2, r1, r0)
            if (r3 == 0) goto L19
            complete(r2)
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r6) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            java.lang.Object r0 = r5.value
            r1 = 0
            if (r0 != 0) goto L45
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.Object r6 = getFutureValue(r6)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r0 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r0.casValue(r5, r3, r6)
            if (r6 == 0) goto L20
            complete(r5)
            return r2
        L20:
            return r1
        L21:
            com.google.common.util.concurrent.AbstractFuture$SetFuture r0 = new com.google.common.util.concurrent.AbstractFuture$SetFuture
            r0.<init>(r5, r6)
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r4 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            boolean r3 = r4.casValue(r5, r3, r0)
            if (r3 == 0) goto L43
            com.google.common.util.concurrent.DirectExecutor r1 = com.google.common.util.concurrent.DirectExecutor.INSTANCE     // Catch: java.lang.Throwable -> L34
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L34
            goto L42
        L34:
            r6 = move-exception
            com.google.common.util.concurrent.AbstractFuture$Failure r1 = new com.google.common.util.concurrent.AbstractFuture$Failure     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            com.google.common.util.concurrent.AbstractFuture$Failure r1 = com.google.common.util.concurrent.AbstractFuture.Failure.FALLBACK_INSTANCE
        L3d:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r6 = com.google.common.util.concurrent.AbstractFuture.ATOMIC_HELPER
            r6.casValue(r5, r0, r1)
        L42:
            return r2
        L43:
            java.lang.Object r0 = r5.value
        L45:
            boolean r2 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r2 == 0) goto L50
            com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            r6.cancel(r0)
        L50:
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r5.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L67
        L1f:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L29
            r5.addDoneString(r0)
            goto L67
        L29:
            java.lang.String r1 = r5.pendingToString()     // Catch: java.lang.RuntimeException -> L2e
            goto L44
        L2e:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception thrown from implementation: "
            r3.append(r4)
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L44:
            if (r1 == 0) goto L58
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L58
            java.lang.String r3 = "PENDING, info=["
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            goto L67
        L58:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L62
            r5.addDoneString(r0)
            goto L67
        L62:
            java.lang.String r1 = "PENDING"
            r0.append(r1)
        L67:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    protected final java.lang.Throwable tryInternalFastPathGetFailure() {
            r2 = this;
            boolean r0 = r2 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Failure
            if (r1 == 0) goto Lf
            com.google.common.util.concurrent.AbstractFuture$Failure r0 = (com.google.common.util.concurrent.AbstractFuture.Failure) r0
            java.lang.Throwable r0 = r0.exception
            return r0
        Lf:
            r0 = 0
            return r0
    }

    protected final boolean wasInterrupted() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation
            if (r1 == 0) goto Le
            com.google.common.util.concurrent.AbstractFuture$Cancellation r0 = (com.google.common.util.concurrent.AbstractFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
