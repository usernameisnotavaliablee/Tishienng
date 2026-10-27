package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableGenerate<T, S> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.Consumer<? super S> disposeState;
    final io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> generator;
    final java.util.concurrent.Callable<S> stateSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class GeneratorSubscription<T, S> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Emitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7565982551505011832L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final io.reactivex.functions.Consumer<? super S> disposeState;
        final io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> generator;
        S state;
        boolean terminate;

        GeneratorSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3, S r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.generator = r2
                r0.disposeState = r3
                r0.state = r4
                return
        }

        private void dispose(S r2) {
                r1 = this;
                io.reactivex.functions.Consumer<? super S> r0 = r1.disposeState     // Catch: java.lang.Throwable -> L6
                r0.accept(r2)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void cancel() {
                r5 = this;
                boolean r0 = r5.cancelled
                if (r0 != 0) goto L18
                r0 = 1
                r5.cancelled = r0
                r0 = 1
                long r0 = io.reactivex.internal.util.BackpressureHelper.add(r5, r0)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L18
                S r0 = r5.state
                r5.dispose(r0)
            L18:
                return
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.terminate = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                if (r2 != 0) goto L9
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L9:
                r0 = 1
                r1.terminate = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                return
            Ld:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        public void request(long r9) {
                r8 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r9)
                if (r0 != 0) goto L7
                goto L55
            L7:
                long r0 = io.reactivex.internal.util.BackpressureHelper.add(r8, r9)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L12
                goto L55
            L12:
                S r0 = r8.state
                io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> r1 = r8.generator
            L16:
                r4 = r2
            L17:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L42
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L23
                r8.dispose(r0)
                return
            L23:
                r6 = 1
                java.lang.Object r0 = r1.apply(r0, r8)     // Catch: java.lang.Throwable -> L36
                boolean r7 = r8.terminate
                if (r7 == 0) goto L32
                r8.cancelled = r6
                r8.dispose(r0)
                return
            L32:
                r6 = 1
                long r4 = r4 + r6
                goto L17
            L36:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                r8.cancelled = r6
                org.reactivestreams.Subscriber<? super T> r10 = r8.actual
                r10.onError(r9)
                return
            L42:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L17
                r8.state = r0
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
            L55:
                return
        }
    }

    public FlowableGenerate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3) {
            r0 = this;
            r0.<init>()
            r0.stateSupplier = r1
            r0.generator = r2
            r0.disposeState = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            java.util.concurrent.Callable<S> r0 = r4.stateSupplier     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L13
            io.reactivex.internal.operators.flowable.FlowableGenerate$GeneratorSubscription r1 = new io.reactivex.internal.operators.flowable.FlowableGenerate$GeneratorSubscription
            io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2 = r4.generator
            io.reactivex.functions.Consumer<? super S> r3 = r4.disposeState
            r1.<init>(r5, r2, r3, r0)
            r5.onSubscribe(r1)
            return
        L13:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
    }
}
