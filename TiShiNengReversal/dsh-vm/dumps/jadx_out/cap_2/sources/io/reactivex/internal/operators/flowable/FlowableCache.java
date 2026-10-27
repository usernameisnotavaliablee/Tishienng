package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableCache<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CacheState<T> extends io.reactivex.internal.util.LinkedArrayList implements org.reactivestreams.Subscriber<T> {
        static final io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] EMPTY = null;
        static final io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] TERMINATED = null;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> connection;
        volatile boolean isConnected;
        final io.reactivex.Flowable<? extends T> source;
        boolean sourceDone;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T>[]> subscribers;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r1 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r0]
                io.reactivex.internal.operators.flowable.FlowableCache.CacheState.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r0]
                io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED = r0
                return
        }

        CacheState(io.reactivex.Flowable<? extends T> r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r0.connection = r2
                r0.source = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r2 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.EMPTY
                r1.<init>(r2)
                r0.subscribers = r1
                return
        }

        public void addChild(io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED
                if (r0 != r1) goto Ld
                goto L20
            Ld:
                int r1 = r0.length
                int r2 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r2 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r2]
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                r2[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r1 = r4.subscribers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
                if (r0 == 0) goto L0
            L20:
                return
        }

        public void connect() {
                r1 = this;
                io.reactivex.Flowable<? extends T> r0 = r1.source
                r0.subscribe(r1)
                r0 = 1
                r1.isConnected = r0
                return
        }

        public void onComplete() {
                r4 = this;
                boolean r0 = r4.sourceDone
                if (r0 != 0) goto L29
                r0 = 1
                r4.sourceDone = r0
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r4.add(r0)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.connection
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r4.subscribers
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
                int r1 = r0.length
                r2 = 0
            L1f:
                if (r2 >= r1) goto L29
                r3 = r0[r2]
                r3.replay()
                int r2 = r2 + 1
                goto L1f
            L29:
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                boolean r0 = r3.sourceDone
                if (r0 != 0) goto L2a
                r0 = 1
                r3.sourceDone = r0
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.error(r4)
                r3.add(r4)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r3.connection
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r4 = r3.subscribers
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED
                java.lang.Object r4 = r4.getAndSet(r0)
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r4 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r4
                int r0 = r4.length
                r1 = 0
            L1f:
                if (r1 >= r0) goto L29
                r2 = r4[r1]
                r2.replay()
                int r1 = r1 + 1
                goto L1f
            L29:
                return
            L2a:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.sourceDone
                if (r0 != 0) goto L1f
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.next(r4)
                r3.add(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r4 = r3.subscribers
                java.lang.Object r4 = r4.get()
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r4 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r4
                int r0 = r4.length
                r1 = 0
            L15:
                if (r1 >= r0) goto L1f
                r2 = r4[r1]
                r2.replay()
                int r1 = r1 + 1
                goto L15
            L1f:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.connection
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r3)
                if (r0 == 0) goto L10
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L10:
                return
        }

        public void removeChild(io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                goto L3a
            Lc:
                r2 = 0
                r3 = 0
            Le:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto Le
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                goto L3a
            L20:
                r4 = 1
                if (r1 != r4) goto L24
                goto L3a
            L24:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r5 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r1 = r6.subscribers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r5)
                if (r0 == 0) goto L0
            L3a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ReplaySubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long CANCELLED = -1;
        private static final long serialVersionUID = -2557562030197141021L;
        final org.reactivestreams.Subscriber<? super T> child;
        java.lang.Object[] currentBuffer;
        int currentIndexInBuffer;
        int index;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> state;

        ReplaySubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> r2) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                r0.state = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        public void cancel() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                r1 = -1
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L11
                io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r5.state
                r0.removeChild(r5)
            L11:
                return
        }

        public void replay() {
                r21 = this;
                r0 = r21
                int r1 = r0.getAndIncrement()
                if (r1 == 0) goto La
                goto L9f
            La:
                org.reactivestreams.Subscriber<? super T> r1 = r0.child
                java.util.concurrent.atomic.AtomicLong r2 = r0.requested
                r3 = 1
                r4 = 1
            L10:
                long r5 = r2.get()
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L1c
                goto L9f
            L1c:
                io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r9 = r0.state
                int r9 = r9.size()
                if (r9 == 0) goto L98
                java.lang.Object[] r10 = r0.currentBuffer
                if (r10 != 0) goto L30
                io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r10 = r0.state
                java.lang.Object[] r10 = r10.head()
                r0.currentBuffer = r10
            L30:
                int r11 = r10.length
                int r11 = r11 - r3
                int r12 = r0.index
                int r13 = r0.currentIndexInBuffer
                r14 = 0
                r15 = 0
            L38:
                r16 = -1
                if (r12 >= r9) goto L65
                int r18 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r18 <= 0) goto L65
                long r18 = r2.get()
                int r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r20 != 0) goto L49
                goto L9f
            L49:
                if (r13 != r11) goto L50
                r10 = r10[r11]
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                r13 = 0
            L50:
                r3 = r10[r13]
                boolean r3 = io.reactivex.internal.util.NotificationLite.accept(r3, r1)
                if (r3 == 0) goto L59
                goto L9f
            L59:
                int r13 = r13 + 1
                int r12 = r12 + 1
                r16 = 1
                long r5 = r5 - r16
                int r15 = r15 + 1
                r3 = 1
                goto L38
            L65:
                long r19 = r2.get()
                int r3 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
                if (r3 != 0) goto L6e
                goto L9f
            L6e:
                int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r3 != 0) goto L8c
                r3 = r10[r13]
                boolean r5 = io.reactivex.internal.util.NotificationLite.isComplete(r3)
                if (r5 == 0) goto L7e
                r1.onComplete()
                return
            L7e:
                boolean r5 = io.reactivex.internal.util.NotificationLite.isError(r3)
                if (r5 == 0) goto L8c
                java.lang.Throwable r2 = io.reactivex.internal.util.NotificationLite.getError(r3)
                r1.onError(r2)
                return
            L8c:
                if (r15 == 0) goto L92
                long r5 = (long) r15
                io.reactivex.internal.util.BackpressureHelper.producedCancel(r2, r5)
            L92:
                r0.index = r12
                r0.currentIndexInBuffer = r13
                r0.currentBuffer = r10
            L98:
                int r3 = -r4
                int r4 = r0.addAndGet(r3)
                if (r4 != 0) goto La0
            L9f:
                return
            La0:
                r3 = 1
                goto L10
        }

        public void request(long r6) {
                r5 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r6)
                if (r0 == 0) goto L22
            L6:
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                long r0 = r0.get()
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L13
                goto L22
            L13:
                long r2 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r6)
                java.util.concurrent.atomic.AtomicLong r4 = r5.requested
                boolean r0 = r4.compareAndSet(r0, r2)
                if (r0 == 0) goto L6
                r5.replay()
            L22:
                return
        }
    }

    public FlowableCache(io.reactivex.Flowable<T> r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState r0 = new io.reactivex.internal.operators.flowable.FlowableCache$CacheState
            r0.<init>(r2, r3)
            r1.state = r0
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r1.once = r2
            return
    }

    int cachedEventCount() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r1.state
            int r0 = r0.size()
            return r0
    }

    boolean hasSubscribers() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r1.state
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r0.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    boolean isConnected() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r1.state
            boolean r0 = r0.isConnected
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription r0 = new io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r1 = r2.state
            r0.<init>(r3, r1)
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r1 = r2.state
            r1.addChild(r0)
            r3.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.once
            boolean r3 = r3.get()
            if (r3 != 0) goto L26
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.once
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L26
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r3 = r2.state
            r3.connect()
        L26:
            return
    }
}
