package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long bufferSize;
    final io.reactivex.functions.Action onOverflow;
    final io.reactivex.BackpressureOverflowStrategy strategy;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureOverflowStrategy = null;

        static {
                io.reactivex.BackpressureOverflowStrategy[] r0 = io.reactivex.BackpressureOverflowStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureOverflowStrategy = r0
                io.reactivex.BackpressureOverflowStrategy r1 = io.reactivex.BackpressureOverflowStrategy.DROP_LATEST     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureOverflowStrategy     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.BackpressureOverflowStrategy r1 = io.reactivex.BackpressureOverflowStrategy.DROP_OLDEST     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class OnBackpressureBufferStrategySubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3240706908776709697L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final long bufferSize;
        volatile boolean cancelled;
        final java.util.Deque<T> deque;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.functions.Action onOverflow;
        final java.util.concurrent.atomic.AtomicLong requested;
        org.reactivestreams.Subscription s;
        final io.reactivex.BackpressureOverflowStrategy strategy;

        OnBackpressureBufferStrategySubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Action r2, io.reactivex.BackpressureOverflowStrategy r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onOverflow = r2
                r0.strategy = r3
                r0.bufferSize = r4
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.deque = r1
                return
        }

        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L13
                java.util.Deque<T> r0 = r1.deque
                r1.clear(r0)
            L13:
                return
        }

        void clear(java.util.Deque<T> r2) {
                r1 = this;
                monitor-enter(r2)
                r2.clear()     // Catch: java.lang.Throwable -> L6
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L6
                throw r0
        }

        void drain() {
                r14 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L8
                goto L88
            L8:
                java.util.Deque<T> r0 = r14.deque
                org.reactivestreams.Subscriber<? super T> r1 = r14.actual
                r2 = 1
                r3 = 1
            Le:
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L17:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L50
                boolean r11 = r14.cancelled
                if (r11 == 0) goto L23
                r14.clear(r0)
                return
            L23:
                boolean r11 = r14.done
                monitor-enter(r0)
                java.lang.Object r12 = r0.poll()     // Catch: java.lang.Throwable -> L4d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
                if (r12 != 0) goto L2f
                r13 = 1
                goto L30
            L2f:
                r13 = 0
            L30:
                if (r11 == 0) goto L43
                java.lang.Throwable r11 = r14.error
                if (r11 == 0) goto L3d
                r14.clear(r0)
                r1.onError(r11)
                return
            L3d:
                if (r13 == 0) goto L43
                r1.onComplete()
                return
            L43:
                if (r13 == 0) goto L46
                goto L50
            L46:
                r1.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                goto L17
            L4d:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
                throw r1
            L50:
                if (r10 != 0) goto L78
                boolean r4 = r14.cancelled
                if (r4 == 0) goto L5a
                r14.clear(r0)
                return
            L5a:
                boolean r4 = r14.done
                monitor-enter(r0)
                boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> L75
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
                if (r4 == 0) goto L78
                java.lang.Throwable r4 = r14.error
                if (r4 == 0) goto L6f
                r14.clear(r0)
                r1.onError(r4)
                return
            L6f:
                if (r5 == 0) goto L78
                r1.onComplete()
                return
            L75:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
                throw r1
            L78:
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 == 0) goto L81
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r4, r8)
            L81:
                int r3 = -r3
                int r3 = r14.addAndGet(r3)
                if (r3 != 0) goto Le
            L88:
                return
        }

        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.drain()
                return
        }

        public void onNext(T r8) {
                r7 = this;
                boolean r0 = r7.done
                if (r0 == 0) goto L5
                goto L52
            L5:
                java.util.Deque<T> r0 = r7.deque
                monitor-enter(r0)
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L2e
                long r1 = (long) r1     // Catch: java.lang.Throwable -> L2e
                long r3 = r7.bufferSize     // Catch: java.lang.Throwable -> L2e
                r5 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 != 0) goto L37
                int[] r1 = io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureOverflowStrategy     // Catch: java.lang.Throwable -> L2e
                io.reactivex.BackpressureOverflowStrategy r2 = r7.strategy     // Catch: java.lang.Throwable -> L2e
                int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L2e
                r1 = r1[r2]     // Catch: java.lang.Throwable -> L2e
                r2 = 1
                if (r1 == r2) goto L30
                r3 = 2
                if (r1 == r3) goto L25
                goto L3b
            L25:
                r0.poll()     // Catch: java.lang.Throwable -> L2e
                r0.offer(r8)     // Catch: java.lang.Throwable -> L2e
            L2b:
                r2 = 0
                r5 = 1
                goto L3b
            L2e:
                r8 = move-exception
                goto L67
            L30:
                r0.pollLast()     // Catch: java.lang.Throwable -> L2e
                r0.offer(r8)     // Catch: java.lang.Throwable -> L2e
                goto L2b
            L37:
                r0.offer(r8)     // Catch: java.lang.Throwable -> L2e
                r2 = 0
            L3b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                if (r5 == 0) goto L53
                io.reactivex.functions.Action r8 = r7.onOverflow
                if (r8 == 0) goto L52
                r8.run()     // Catch: java.lang.Throwable -> L46
                return
            L46:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                org.reactivestreams.Subscription r0 = r7.s
                r0.cancel()
                r7.onError(r8)
            L52:
                return
            L53:
                if (r2 == 0) goto L63
                org.reactivestreams.Subscription r8 = r7.s
                r8.cancel()
                io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
                r8.<init>()
                r7.onError(r8)
                return
            L63:
                r7.drain()
                return
            L67:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                throw r8
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }
    }

    public FlowableOnBackpressureBufferStrategy(org.reactivestreams.Publisher<T> r1, long r2, io.reactivex.functions.Action r4, io.reactivex.BackpressureOverflowStrategy r5) {
            r0 = this;
            r0.<init>(r1)
            r0.bufferSize = r2
            r0.onOverflow = r4
            r0.strategy = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r8) {
            r7 = this;
            org.reactivestreams.Publisher<T> r0 = r7.source
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$OnBackpressureBufferStrategySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$OnBackpressureBufferStrategySubscriber
            io.reactivex.functions.Action r3 = r7.onOverflow
            io.reactivex.BackpressureOverflowStrategy r4 = r7.strategy
            long r5 = r7.bufferSize
            r2 = r8
            r1.<init>(r2, r3, r4, r5)
            r0.subscribe(r1)
            return
    }
}
