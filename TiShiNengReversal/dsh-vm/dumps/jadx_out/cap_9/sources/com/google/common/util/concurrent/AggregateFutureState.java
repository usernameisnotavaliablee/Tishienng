package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.j2objc.annotations.ReflectionSupport(com.google.j2objc.annotations.ReflectionSupport.Level.FULL)
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AggregateFutureState {
    private static final com.google.common.util.concurrent.AggregateFutureState.AtomicHelper ATOMIC_HELPER = null;
    private static final java.util.logging.Logger log = null;
    private volatile int remaining;
    private volatile java.util.Set<java.lang.Throwable> seenExceptions;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.AggregateFutureState$1, reason: invalid class name */
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

        /* synthetic */ AtomicHelper(com.google.common.util.concurrent.AggregateFutureState.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState r1, java.util.Set<java.lang.Throwable> r2, java.util.Set<java.lang.Throwable> r3);

        abstract int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SafeAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.google.common.util.concurrent.AggregateFutureState> remainingCountUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AggregateFutureState, java.util.Set<java.lang.Throwable>> seenExceptionsUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.seenExceptionsUpdater = r2
                r1.remainingCountUpdater = r3
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState r2, java.util.Set<java.lang.Throwable> r3, java.util.Set<java.lang.Throwable> r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AggregateFutureState, java.util.Set<java.lang.Throwable>> r0 = r1.seenExceptionsUpdater
                androidx.concurrent.futures.a.a(r0, r2, r3, r4)
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.google.common.util.concurrent.AggregateFutureState> r0 = r1.remainingCountUpdater
                int r2 = r0.decrementAndGet(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SynchronizedAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        private SynchronizedAtomicHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ SynchronizedAtomicHelper(com.google.common.util.concurrent.AggregateFutureState.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState r2, java.util.Set<java.lang.Throwable> r3, java.util.Set<java.lang.Throwable> r4) {
                r1 = this;
                monitor-enter(r2)
                java.util.Set r0 = com.google.common.util.concurrent.AggregateFutureState.access$200(r2)     // Catch: java.lang.Throwable -> Lb
                if (r0 != r3) goto Ld
                com.google.common.util.concurrent.AggregateFutureState.access$202(r2, r4)     // Catch: java.lang.Throwable -> Lb
                goto Ld
            Lb:
                r3 = move-exception
                goto Lf
            Ld:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                return
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                throw r3
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState r2) {
                r1 = this;
                monitor-enter(r2)
                com.google.common.util.concurrent.AggregateFutureState.access$310(r2)     // Catch: java.lang.Throwable -> La
                int r0 = com.google.common.util.concurrent.AggregateFutureState.access$300(r2)     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                return r0
            La:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                throw r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.AggregateFutureState> r0 = com.google.common.util.concurrent.AggregateFutureState.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            com.google.common.util.concurrent.AggregateFutureState.log = r1
            r1 = 0
            com.google.common.util.concurrent.AggregateFutureState$SafeAtomicHelper r2 = new com.google.common.util.concurrent.AggregateFutureState$SafeAtomicHelper     // Catch: java.lang.Throwable -> L21
            java.lang.Class<java.util.Set> r3 = java.util.Set.class
            java.lang.String r4 = "seenExceptions"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = "remaining"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r4)     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            com.google.common.util.concurrent.AggregateFutureState$SynchronizedAtomicHelper r2 = new com.google.common.util.concurrent.AggregateFutureState$SynchronizedAtomicHelper
            r2.<init>(r1)
            r1 = r0
        L28:
            com.google.common.util.concurrent.AggregateFutureState.ATOMIC_HELPER = r2
            if (r1 == 0) goto L35
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AggregateFutureState.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r0.log(r2, r3, r1)
        L35:
            return
    }

    AggregateFutureState(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.seenExceptions = r0
            r1.remaining = r2
            return
    }

    static /* synthetic */ java.util.Set access$200(com.google.common.util.concurrent.AggregateFutureState r0) {
            java.util.Set<java.lang.Throwable> r0 = r0.seenExceptions
            return r0
    }

    static /* synthetic */ java.util.Set access$202(com.google.common.util.concurrent.AggregateFutureState r0, java.util.Set r1) {
            r0.seenExceptions = r1
            return r1
    }

    static /* synthetic */ int access$300(com.google.common.util.concurrent.AggregateFutureState r0) {
            int r0 = r0.remaining
            return r0
    }

    static /* synthetic */ int access$310(com.google.common.util.concurrent.AggregateFutureState r2) {
            int r0 = r2.remaining
            int r1 = r0 + (-1)
            r2.remaining = r1
            return r0
    }

    abstract void addInitialException(java.util.Set<java.lang.Throwable> r1);

    final int decrementRemainingAndGet() {
            r1 = this;
            com.google.common.util.concurrent.AggregateFutureState$AtomicHelper r0 = com.google.common.util.concurrent.AggregateFutureState.ATOMIC_HELPER
            int r0 = r0.decrementAndGetRemainingCount(r1)
            return r0
    }

    final java.util.Set<java.lang.Throwable> getOrInitSeenExceptions() {
            r3 = this;
            java.util.Set<java.lang.Throwable> r0 = r3.seenExceptions
            if (r0 != 0) goto L13
            java.util.Set r0 = com.google.common.collect.Sets.newConcurrentHashSet()
            r3.addInitialException(r0)
            com.google.common.util.concurrent.AggregateFutureState$AtomicHelper r1 = com.google.common.util.concurrent.AggregateFutureState.ATOMIC_HELPER
            r2 = 0
            r1.compareAndSetSeenExceptions(r3, r2, r0)
            java.util.Set<java.lang.Throwable> r0 = r3.seenExceptions
        L13:
            return r0
    }
}
