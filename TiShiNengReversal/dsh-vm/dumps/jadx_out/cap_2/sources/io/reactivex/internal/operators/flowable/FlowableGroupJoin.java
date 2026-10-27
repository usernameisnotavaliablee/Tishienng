package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> leftEnd;
    final org.reactivestreams.Publisher<? extends TRight> other;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> resultSelector;
    final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> rightEnd;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport {
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
        final java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> lefts;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> resultSelector;
        final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> rightEnd;
        int rightIndex;
        final java.util.Map<java.lang.Integer, TRight> rights;

        static {
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.LEFT_VALUE = r0
                r0 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.RIGHT_VALUE = r0
                r0 = 3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.LEFT_CLOSE = r0
                r0 = 4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.RIGHT_CLOSE = r0
                return
        }

        GroupJoinSubscription(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> r5) {
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
                r11 = this;
                int r0 = r11.getAndIncrement()
                if (r0 == 0) goto L8
                goto L7b
            L8:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r11.queue
                org.reactivestreams.Subscriber<? super R> r1 = r11.actual
                r2 = 1
                r3 = 1
            Le:
                boolean r4 = r11.cancelled
                if (r4 == 0) goto L16
                r0.clear()
                return
            L16:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r11.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L2a
                r0.clear()
                r11.cancelAll()
                r11.errorAll(r1)
                return
            L2a:
                java.util.concurrent.atomic.AtomicInteger r4 = r11.active
                int r4 = r4.get()
                r5 = 0
                if (r4 != 0) goto L35
                r4 = 1
                goto L36
            L35:
                r4 = 0
            L36:
                java.lang.Object r6 = r0.poll()
                java.lang.Integer r6 = (java.lang.Integer) r6
                if (r6 != 0) goto L40
                r7 = 1
                goto L41
            L40:
                r7 = 0
            L41:
                if (r4 == 0) goto L72
                if (r7 == 0) goto L72
                java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> r0 = r11.lefts
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L4f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r0.next()
                io.reactivex.processors.UnicastProcessor r2 = (io.reactivex.processors.UnicastProcessor) r2
                r2.onComplete()
                goto L4f
            L5f:
                java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> r0 = r11.lefts
                r0.clear()
                java.util.Map<java.lang.Integer, TRight> r0 = r11.rights
                r0.clear()
                io.reactivex.disposables.CompositeDisposable r0 = r11.disposables
                r0.dispose()
                r1.onComplete()
                return
            L72:
                if (r7 == 0) goto L7c
                int r3 = -r3
                int r3 = r11.addAndGet(r3)
                if (r3 != 0) goto Le
            L7b:
                return
            L7c:
                java.lang.Object r4 = r0.poll()
                java.lang.Integer r7 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.LEFT_VALUE
                if (r6 != r7) goto L115
                io.reactivex.processors.UnicastProcessor r5 = io.reactivex.processors.UnicastProcessor.create()
                int r6 = r11.leftIndex
                int r7 = r6 + 1
                r11.leftIndex = r7
                java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> r7 = r11.lefts
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r7.put(r8, r5)
                io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r7 = r11.leftEnd     // Catch: java.lang.Throwable -> L110
                java.lang.Object r7 = r7.apply(r4)     // Catch: java.lang.Throwable -> L110
                java.lang.String r8 = "The leftEnd returned a null Publisher"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L110
                org.reactivestreams.Publisher r7 = (org.reactivestreams.Publisher) r7     // Catch: java.lang.Throwable -> L110
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber
                r8.<init>(r11, r2, r6)
                io.reactivex.disposables.CompositeDisposable r6 = r11.disposables
                r6.add(r8)
                r7.subscribe(r8)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r6 = r11.error
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Lc6
                r0.clear()
                r11.cancelAll()
                r11.errorAll(r1)
                return
            Lc6:
                io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> r6 = r11.resultSelector     // Catch: java.lang.Throwable -> L10b
                java.lang.Object r4 = r6.apply(r4, r5)     // Catch: java.lang.Throwable -> L10b
                java.lang.String r6 = "The resultSelector returned a null value"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r6)     // Catch: java.lang.Throwable -> L10b
                java.util.concurrent.atomic.AtomicLong r6 = r11.requested
                long r6 = r6.get()
                r8 = 0
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L100
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicLong r4 = r11.requested
                r6 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r4, r6)
                java.util.Map<java.lang.Integer, TRight> r4 = r11.rights
                java.util.Collection r4 = r4.values()
                java.util.Iterator r4 = r4.iterator()
            Lf2:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto Le
                java.lang.Object r6 = r4.next()
                r5.onNext(r6)
                goto Lf2
            L100:
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r3 = "Could not emit value due to lack of requests"
                r2.<init>(r3)
                r11.fail(r2, r1, r0)
                return
            L10b:
                r2 = move-exception
                r11.fail(r2, r1, r0)
                return
            L110:
                r2 = move-exception
                r11.fail(r2, r1, r0)
                return
            L115:
                java.lang.Integer r7 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.RIGHT_VALUE
                if (r6 != r7) goto L176
                int r6 = r11.rightIndex
                int r7 = r6 + 1
                r11.rightIndex = r7
                java.util.Map<java.lang.Integer, TRight> r7 = r11.rights
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r7.put(r8, r4)
                io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r7 = r11.rightEnd     // Catch: java.lang.Throwable -> L171
                java.lang.Object r7 = r7.apply(r4)     // Catch: java.lang.Throwable -> L171
                java.lang.String r8 = "The rightEnd returned a null Publisher"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L171
                org.reactivestreams.Publisher r7 = (org.reactivestreams.Publisher) r7     // Catch: java.lang.Throwable -> L171
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber
                r8.<init>(r11, r5, r6)
                io.reactivex.disposables.CompositeDisposable r5 = r11.disposables
                r5.add(r8)
                r7.subscribe(r8)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5 = r11.error
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L157
                r0.clear()
                r11.cancelAll()
                r11.errorAll(r1)
                return
            L157:
                java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> r5 = r11.lefts
                java.util.Collection r5 = r5.values()
                java.util.Iterator r5 = r5.iterator()
            L161:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto Le
                java.lang.Object r6 = r5.next()
                io.reactivex.processors.UnicastProcessor r6 = (io.reactivex.processors.UnicastProcessor) r6
                r6.onNext(r4)
                goto L161
            L171:
                r2 = move-exception
                r11.fail(r2, r1, r0)
                return
            L176:
                java.lang.Integer r5 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.LEFT_CLOSE
                if (r6 != r5) goto L196
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r4 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) r4
                java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> r5 = r11.lefts
                int r6 = r4.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.remove(r6)
                io.reactivex.processors.UnicastProcessor r5 = (io.reactivex.processors.UnicastProcessor) r5
                io.reactivex.disposables.CompositeDisposable r6 = r11.disposables
                r6.remove(r4)
                if (r5 == 0) goto Le
                r5.onComplete()
                goto Le
            L196:
                java.lang.Integer r5 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.RIGHT_CLOSE
                if (r6 != r5) goto Le
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber r4 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) r4
                java.util.Map<java.lang.Integer, TRight> r5 = r11.rights
                int r6 = r4.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.remove(r6)
                io.reactivex.disposables.CompositeDisposable r5 = r11.disposables
                r5.remove(r4)
                goto Le
        }

        void errorAll(org.reactivestreams.Subscriber<?> r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r3.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> r1 = r3.lefts
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L10:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L20
                java.lang.Object r2 = r1.next()
                io.reactivex.processors.UnicastProcessor r2 = (io.reactivex.processors.UnicastProcessor) r2
                r2.onError(r0)
                goto L10
            L20:
                java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> r1 = r3.lefts
                r1.clear()
                java.util.Map<java.lang.Integer, TRight> r1 = r3.rights
                r1.clear()
                r4.onError(r0)
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
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.LEFT_CLOSE     // Catch: java.lang.Throwable -> L8
                goto Lc
            L8:
                r2 = move-exception
                goto L14
            La:
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.RIGHT_CLOSE     // Catch: java.lang.Throwable -> L8
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
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.LEFT_VALUE     // Catch: java.lang.Throwable -> L8
                goto Lc
            L8:
                r2 = move-exception
                goto L14
            La:
                java.lang.Integer r2 = io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription.RIGHT_VALUE     // Catch: java.lang.Throwable -> L8
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface JoinSupport {
        void innerClose(boolean r1, io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber r2);

        void innerCloseError(java.lang.Throwable r1);

        void innerComplete(io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber r1);

        void innerError(java.lang.Throwable r1);

        void innerValue(boolean r1, java.lang.Object r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class LeftRightEndSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport parent;

        LeftRightEndSubscriber(io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.isLeft = r2
                r0.index = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport r0 = r2.parent
                boolean r1 = r2.isLeft
                r0.innerClose(r1, r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport r0 = r1.parent
                r0.innerCloseError(r2)
                return
        }

        public void onNext(java.lang.Object r2) {
                r1 = this;
                boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r1)
                if (r2 == 0) goto Ld
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport r2 = r1.parent
                boolean r0 = r1.isLeft
                r2.innerClose(r0, r1)
            Ld:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3)
                if (r0 == 0) goto Le
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class LeftRightSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport parent;

        LeftRightSubscriber(io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.isLeft = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport r0 = r1.parent
                r0.innerComplete(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport r0 = r1.parent
                r0.innerError(r2)
                return
        }

        public void onNext(java.lang.Object r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport r0 = r2.parent
                boolean r1 = r2.isLeft
                r0.innerValue(r1, r3)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3)
                if (r0 == 0) goto Le
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            Le:
                return
        }
    }

    public FlowableGroupJoin(org.reactivestreams.Publisher<TLeft> r1, org.reactivestreams.Publisher<? extends TRight> r2, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> r5) {
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
            io.reactivex.internal.operators.flowable.FlowableGroupJoin$GroupJoinSubscription r0 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin$GroupJoinSubscription
            io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> r1 = r4.leftEnd
            io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r2 = r4.rightEnd
            io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> r3 = r4.resultSelector
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
