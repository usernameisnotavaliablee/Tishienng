package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> leftEnd;
    final org.reactivestreams.Publisher<? extends TRight> other;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
    final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> rightEnd;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport {
        static final java.lang.Integer LEFT_CLOSE = null;
        static final java.lang.Integer LEFT_VALUE = null;
        static final java.lang.Integer RIGHT_CLOSE = null;
        static final java.lang.Integer RIGHT_VALUE = null;
        private static final long serialVersionUID = -6071216598687999801L;
        final java.util.concurrent.atomic.AtomicInteger active;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        final io.reactivex.disposables.CompositeDisposable disposables;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        final io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> leftEnd;
        int leftIndex;
        final java.util.Map<java.lang.Integer, TLeft> lefts;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> rightEnd;
        int rightIndex;
        final java.util.Map<java.lang.Integer, TRight> rights;

        static {
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.LEFT_VALUE = r0
                r0 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.RIGHT_VALUE = r0
                r0 = 3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.LEFT_CLOSE = r0
                r0 = 4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.RIGHT_CLOSE = r0
                return
        }

        JoinSubscription(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r5) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.requested = r2
                io.reactivex.disposables.CompositeDisposable r2 = new io.reactivex.disposables.CompositeDisposable
                r2.<init>()
                r1.disposables = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = io.reactivex.Flowable.bufferSize()
                r2.<init>(r0)
                r1.queue = r2
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                r1.lefts = r2
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                r1.rights = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.error = r2
                r1.leftEnd = r3
                r1.rightEnd = r4
                r1.resultSelector = r5
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r3 = 2
                r2.<init>(r3)
                r1.active = r2
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L5
                goto L16
            L5:
                r0 = 1
                r1.cancelled = r0
                r1.cancelAll()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L16
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                r0.clear()
            L16:
                return
        }

        void cancelAll() {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.dispose()
                return
        }

        void drain() {
                r19 = this;
                r1 = r19
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L9
                goto L62
            L9:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r1.queue
                org.reactivestreams.Subscriber<? super R> r3 = r1.actual
                r0 = 1
                r4 = 1
            Lf:
                boolean r5 = r1.cancelled
                if (r5 == 0) goto L17
                r2.clear()
                return
            L17:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5 = r1.error
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L2b
                r2.clear()
                r1.cancelAll()
                r1.errorAll(r3)
                return
            L2b:
                java.util.concurrent.atomic.AtomicInteger r5 = r1.active
                int r5 = r5.get()
                r6 = 0
                if (r5 != 0) goto L36
                r5 = 1
                goto L37
            L36:
                r5 = 0
            L37:
                java.lang.Object r7 = r2.poll()
                java.lang.Integer r7 = (java.lang.Integer) r7
                if (r7 != 0) goto L41
                r8 = 1
                goto L42
            L41:
                r8 = 0
            L42:
                if (r5 == 0) goto L59
                if (r8 == 0) goto L59
                java.util.Map<java.lang.Integer, TLeft> r0 = r1.lefts
                r0.clear()
                java.util.Map<java.lang.Integer, TRight> r0 = r1.rights
                r0.clear()
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.dispose()
                r3.onComplete()
                return
            L59:
                if (r8 == 0) goto L63
                int r4 = -r4
                int r4 = r1.addAndGet(r4)
                if (r4 != 0) goto Lf
            L62:
                return
            L63:
                java.lang.Object r5 = r2.poll()
                java.lang.Integer r8 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.LEFT_VALUE
                java.lang.String r9 = "Could not emit value due to lack of requests"
                java.lang.String r12 = "The resultSelector returned a null value"
                if (r7 != r8) goto L10c
                int r6 = r1.leftIndex
                int r7 = r6 + 1
                r1.leftIndex = r7
                java.util.Map<java.lang.Integer, TLeft> r7 = r1.lefts
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r7.put(r8, r5)
                io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r7 = r1.leftEnd     // Catch: java.lang.Throwable -> L107
                java.lang.Object r7 = r7.apply(r5)     // Catch: java.lang.Throwable -> L107
                java.lang.String r8 = "The leftEnd returned a null Publisher"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L107
                org.reactivestreams.Publisher r7 = (org.reactivestreams.Publisher) r7     // Catch: java.lang.Throwable -> L107
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber
                r8.<init>(r1, r0, r6)
                io.reactivex.disposables.CompositeDisposable r6 = r1.disposables
                r6.add(r8)
                r7.subscribe(r8)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r6 = r1.error
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Lad
                r2.clear()
                r1.cancelAll()
                r1.errorAll(r3)
                return
            Lad:
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                java.util.Map<java.lang.Integer, TRight> r8 = r1.rights
                java.util.Collection r8 = r8.values()
                java.util.Iterator r8 = r8.iterator()
                r10 = 0
                r14 = 1
            Lc1:
                boolean r16 = r8.hasNext()
                if (r16 == 0) goto Lfa
                java.lang.Object r0 = r8.next()
                r17 = 0
                io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r13 = r1.resultSelector     // Catch: java.lang.Throwable -> Lf5
                java.lang.Object r0 = r13.apply(r5, r0)     // Catch: java.lang.Throwable -> Lf5
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r12)     // Catch: java.lang.Throwable -> Lf5
                int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r13 == 0) goto Le1
                r3.onNext(r0)
                long r10 = r10 + r14
                r0 = 1
                goto Lc1
            Le1:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.exceptions.MissingBackpressureException r4 = new io.reactivex.exceptions.MissingBackpressureException
                r4.<init>(r9)
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r4)
                r2.clear()
                r1.cancelAll()
                r1.errorAll(r3)
                return
            Lf5:
                r0 = move-exception
                r1.fail(r0, r3, r2)
                return
            Lfa:
                r17 = 0
                int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
                if (r0 == 0) goto L1d6
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r10)
                goto L1d6
            L107:
                r0 = move-exception
                r1.fail(r0, r3, r2)
                return
            L10c:
                r14 = 1
                r17 = 0
                java.lang.Integer r0 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.RIGHT_VALUE
                if (r7 != r0) goto L1a9
                int r0 = r1.rightIndex
                int r7 = r0 + 1
                r1.rightIndex = r7
                java.util.Map<java.lang.Integer, TRight> r7 = r1.rights
                java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                r7.put(r8, r5)
                io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r7 = r1.rightEnd     // Catch: java.lang.Throwable -> L1a4
                java.lang.Object r7 = r7.apply(r5)     // Catch: java.lang.Throwable -> L1a4
                java.lang.String r8 = "The rightEnd returned a null Publisher"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L1a4
                org.reactivestreams.Publisher r7 = (org.reactivestreams.Publisher) r7     // Catch: java.lang.Throwable -> L1a4
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber
                r8.<init>(r1, r6, r0)
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.add(r8)
                r7.subscribe(r8)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L152
                r2.clear()
                r1.cancelAll()
                r1.errorAll(r3)
                return
            L152:
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r6 = r0.get()
                java.util.Map<java.lang.Integer, TLeft> r0 = r1.lefts
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r10 = r17
            L164:
                boolean r8 = r0.hasNext()
                if (r8 == 0) goto L19a
                java.lang.Object r8 = r0.next()
                io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r13 = r1.resultSelector     // Catch: java.lang.Throwable -> L195
                java.lang.Object r8 = r13.apply(r8, r5)     // Catch: java.lang.Throwable -> L195
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r12)     // Catch: java.lang.Throwable -> L195
                int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r13 == 0) goto L181
                r3.onNext(r8)
                long r10 = r10 + r14
                goto L164
            L181:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.exceptions.MissingBackpressureException r4 = new io.reactivex.exceptions.MissingBackpressureException
                r4.<init>(r9)
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r4)
                r2.clear()
                r1.cancelAll()
                r1.errorAll(r3)
                return
            L195:
                r0 = move-exception
                r1.fail(r0, r3, r2)
                return
            L19a:
                int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
                if (r0 == 0) goto L1d6
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r10)
                goto L1d6
            L1a4:
                r0 = move-exception
                r1.fail(r0, r3, r2)
                return
            L1a9:
                java.lang.Integer r0 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.LEFT_CLOSE
                if (r7 != r0) goto L1c0
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r5 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) r5
                java.util.Map<java.lang.Integer, TLeft> r0 = r1.lefts
                int r6 = r5.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0.remove(r6)
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.remove(r5)
                goto L1d6
            L1c0:
                java.lang.Integer r0 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.RIGHT_CLOSE
                if (r7 != r0) goto L1d6
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r5 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) r5
                java.util.Map<java.lang.Integer, TRight> r0 = r1.rights
                int r6 = r5.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0.remove(r6)
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.remove(r5)
            L1d6:
                r0 = 1
                goto Lf
        }

        void errorAll(org.reactivestreams.Subscriber<?> r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                java.util.Map<java.lang.Integer, TLeft> r1 = r2.lefts
                r1.clear()
                java.util.Map<java.lang.Integer, TRight> r1 = r2.rights
                r1.clear()
                r3.onError(r0)
                return
        }

        void fail(java.lang.Throwable r2, org.reactivestreams.Subscriber<?> r3, io.reactivex.internal.fuseable.SimpleQueue<?> r4) {
                r1 = this;
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                r4.clear()
                r1.cancelAll()
                r1.errorAll(r3)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerClose(boolean r2, io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber r3) {
                r1 = this;
                monitor-enter(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue     // Catch: java.lang.Throwable -> L8
                if (r2 == 0) goto La
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.LEFT_CLOSE     // Catch: java.lang.Throwable -> L8
                goto Lc
            L8:
                r2 = move-exception
                goto L14
            La:
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.RIGHT_CLOSE     // Catch: java.lang.Throwable -> L8
            Lc:
                r0.offer(r2, r3)     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                r1.drain()
                return
            L14:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r2
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerCloseError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                boolean r0 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                if (r0 == 0) goto Lc
                r1.drain()
                return
            Lc:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerComplete(io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.delete(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.active
                r2.decrementAndGet()
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                boolean r0 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicInteger r2 = r1.active
                r2.decrementAndGet()
                r1.drain()
                return
            L11:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerValue(boolean r2, java.lang.Object r3) {
                r1 = this;
                monitor-enter(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue     // Catch: java.lang.Throwable -> L8
                if (r2 == 0) goto La
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.LEFT_VALUE     // Catch: java.lang.Throwable -> L8
                goto Lc
            L8:
                r2 = move-exception
                goto L14
            La:
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription.RIGHT_VALUE     // Catch: java.lang.Throwable -> L8
            Lc:
                r0.offer(r2, r3)     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                r1.drain()
                return
            L14:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r2
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Lb
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
            Lb:
                return
        }
    }

    public FlowableJoin(org.reactivestreams.Publisher<TLeft> r1, org.reactivestreams.Publisher<? extends TRight> r2, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r5) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.leftEnd = r3
            r0.rightEnd = r4
            r0.resultSelector = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r5) {
            r4 = this;
            io.reactivex.internal.operators.flowable.FlowableJoin$JoinSubscription r0 = new io.reactivex.internal.operators.flowable.FlowableJoin$JoinSubscription
            io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r1 = r4.leftEnd
            io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r2 = r4.rightEnd
            io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r3 = r4.resultSelector
            r0.<init>(r5, r1, r2, r3)
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightSubscriber r5 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightSubscriber
            r1 = 1
            r5.<init>(r0, r1)
            io.reactivex.disposables.CompositeDisposable r1 = r0.disposables
            r1.add(r5)
            io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightSubscriber
            r2 = 0
            r1.<init>(r0, r2)
            io.reactivex.disposables.CompositeDisposable r0 = r0.disposables
            r0.add(r1)
            org.reactivestreams.Publisher<T> r0 = r4.source
            r0.subscribe(r5)
            org.reactivestreams.Publisher<? extends TRight> r5 = r4.other
            r5.subscribe(r1)
            return
    }
}
