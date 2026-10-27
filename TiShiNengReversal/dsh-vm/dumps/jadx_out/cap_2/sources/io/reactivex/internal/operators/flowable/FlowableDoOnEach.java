package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableDoOnEach<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DoOnEachConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Action onAfterTerminate;
        final io.reactivex.functions.Action onComplete;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
        final io.reactivex.functions.Consumer<? super T> onNext;

        DoOnEachConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
                r0 = this;
                r0.<init>(r1)
                r0.onNext = r2
                r0.onError = r3
                r0.onComplete = r4
                r0.onAfterTerminate = r5
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> L20
                r0.run()     // Catch: java.lang.Throwable -> L20
                r0 = 1
                r1.done = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onComplete()
                io.reactivex.functions.Action r0 = r1.onAfterTerminate     // Catch: java.lang.Throwable -> L18
                r0.run()     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
                return
            L20:
                r0 = move-exception
                r1.fail(r0)
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber
        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
                return
            L8:
                r0 = 1
                r6.done = r0
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r1 = r6.onError     // Catch: java.lang.Throwable -> L16
                r1.accept(r7)     // Catch: java.lang.Throwable -> L16
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r6.actual
                r0.onError(r7)
                goto L2c
            L16:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
            L2c:
                io.reactivex.functions.Action r7 = r6.onAfterTerminate     // Catch: java.lang.Throwable -> L32
                r7.run()     // Catch: java.lang.Throwable -> L32
                goto L39
            L32:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
            L39:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.sourceMode
                if (r0 == 0) goto L10
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                return
            L10:
                io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> L1b
                r0.accept(r2)     // Catch: java.lang.Throwable -> L1b
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L1b:
                r2 = move-exception
                r1.fail(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r3.qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L1a
                io.reactivex.functions.Consumer<? super T> r1 = r3.onNext     // Catch: java.lang.Throwable -> L13
                r1.accept(r0)     // Catch: java.lang.Throwable -> L13
                io.reactivex.functions.Action r1 = r3.onAfterTerminate
                r1.run()
                return r0
            L13:
                r0 = move-exception
                io.reactivex.functions.Action r1 = r3.onAfterTerminate
                r1.run()
                throw r0
            L1a:
                int r1 = r3.sourceMode
                r2 = 1
                if (r1 != r2) goto L29
                io.reactivex.functions.Action r1 = r3.onComplete
                r1.run()
                io.reactivex.functions.Action r1 = r3.onAfterTerminate
                r1.run()
            L29:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                io.reactivex.functions.Consumer<? super T> r0 = r2.onNext     // Catch: java.lang.Throwable -> L12
                r0.accept(r3)     // Catch: java.lang.Throwable -> L12
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r2.actual
                boolean r3 = r0.tryOnNext(r3)
                return r3
            L12:
                r3 = move-exception
                r2.fail(r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DoOnEachSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final io.reactivex.functions.Action onAfterTerminate;
        final io.reactivex.functions.Action onComplete;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
        final io.reactivex.functions.Consumer<? super T> onNext;

        DoOnEachSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
                r0 = this;
                r0.<init>(r1)
                r0.onNext = r2
                r0.onError = r3
                r0.onComplete = r4
                r0.onAfterTerminate = r5
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> L20
                r0.run()     // Catch: java.lang.Throwable -> L20
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                io.reactivex.functions.Action r0 = r1.onAfterTerminate     // Catch: java.lang.Throwable -> L18
                r0.run()     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
                return
            L20:
                r0 = move-exception
                r1.fail(r0)
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber
        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
                return
            L8:
                r0 = 1
                r6.done = r0
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r1 = r6.onError     // Catch: java.lang.Throwable -> L16
                r1.accept(r7)     // Catch: java.lang.Throwable -> L16
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                r0.onError(r7)
                goto L2c
            L16:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                org.reactivestreams.Subscriber<? super R> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
            L2c:
                io.reactivex.functions.Action r7 = r6.onAfterTerminate     // Catch: java.lang.Throwable -> L32
                r7.run()     // Catch: java.lang.Throwable -> L32
                goto L39
            L32:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
            L39:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.sourceMode
                if (r0 == 0) goto L10
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                return
            L10:
                io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> L1b
                r0.accept(r2)     // Catch: java.lang.Throwable -> L1b
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L1b:
                r2 = move-exception
                r1.fail(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r3.qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L1a
                io.reactivex.functions.Consumer<? super T> r1 = r3.onNext     // Catch: java.lang.Throwable -> L13
                r1.accept(r0)     // Catch: java.lang.Throwable -> L13
                io.reactivex.functions.Action r1 = r3.onAfterTerminate
                r1.run()
                return r0
            L13:
                r0 = move-exception
                io.reactivex.functions.Action r1 = r3.onAfterTerminate
                r1.run()
                throw r0
            L1a:
                int r1 = r3.sourceMode
                r2 = 1
                if (r1 != r2) goto L29
                io.reactivex.functions.Action r1 = r3.onComplete
                r1.run()
                io.reactivex.functions.Action r1 = r3.onAfterTerminate
                r1.run()
            L29:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public FlowableDoOnEach(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
            r0 = this;
            r0.<init>(r1)
            r0.onNext = r2
            r0.onError = r3
            r0.onComplete = r4
            r0.onAfterTerminate = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r8) {
            r7 = this;
            boolean r0 = r8 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L1a
            org.reactivestreams.Publisher<T> r0 = r7.source
            io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachConditionalSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachConditionalSubscriber
            r2 = r8
            io.reactivex.internal.fuseable.ConditionalSubscriber r2 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r2
            io.reactivex.functions.Consumer<? super T> r3 = r7.onNext
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r7.onError
            io.reactivex.functions.Action r5 = r7.onComplete
            io.reactivex.functions.Action r6 = r7.onAfterTerminate
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r1)
            return
        L1a:
            org.reactivestreams.Publisher<T> r0 = r7.source
            io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachSubscriber
            io.reactivex.functions.Consumer<? super T> r3 = r7.onNext
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r7.onError
            io.reactivex.functions.Action r5 = r7.onComplete
            io.reactivex.functions.Action r6 = r7.onAfterTerminate
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r1)
            return
    }
}
