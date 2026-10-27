package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableUsing<T, D> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.Consumer<? super D> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<? extends D> resourceSupplier;
    final io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> sourceSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class UsingSubscriber<T, D> extends java.util.concurrent.atomic.AtomicBoolean implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 5904473792286235046L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.Consumer<? super D> disposer;
        final boolean eager;
        final D resource;
        org.reactivestreams.Subscription s;

        UsingSubscriber(org.reactivestreams.Subscriber<? super T> r1, D r2, io.reactivex.functions.Consumer<? super D> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.resource = r2
                r0.disposer = r3
                r0.eager = r4
                return
        }

        public void cancel() {
                r1 = this;
                r1.disposeAfter()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        void disposeAfter() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L17
                io.reactivex.functions.Consumer<? super D> r0 = r2.disposer     // Catch: java.lang.Throwable -> L10
                D r1 = r2.resource     // Catch: java.lang.Throwable -> L10
                r0.accept(r1)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L17:
                return
        }

        public void onComplete() {
                r2 = this;
                boolean r0 = r2.eager
                if (r0 == 0) goto L29
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1e
                io.reactivex.functions.Consumer<? super D> r0 = r2.disposer     // Catch: java.lang.Throwable -> L14
                D r1 = r2.resource     // Catch: java.lang.Throwable -> L14
                r0.accept(r1)     // Catch: java.lang.Throwable -> L14
                goto L1e
            L14:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscriber<? super T> r1 = r2.actual
                r1.onError(r0)
                return
            L1e:
                org.reactivestreams.Subscription r0 = r2.s
                r0.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                return
            L29:
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                org.reactivestreams.Subscription r0 = r2.s
                r0.cancel()
                r2.disposeAfter()
                return
        }

        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.eager
                if (r0 == 0) goto L39
                r0 = 0
                r1 = 1
                boolean r2 = r6.compareAndSet(r0, r1)
                if (r2 == 0) goto L19
                io.reactivex.functions.Consumer<? super D> r2 = r6.disposer     // Catch: java.lang.Throwable -> L14
                D r3 = r6.resource     // Catch: java.lang.Throwable -> L14
                r2.accept(r3)     // Catch: java.lang.Throwable -> L14
                goto L19
            L14:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                goto L1a
            L19:
                r2 = 0
            L1a:
                org.reactivestreams.Subscription r3 = r6.s
                r3.cancel()
                if (r2 == 0) goto L33
                org.reactivestreams.Subscriber<? super T> r3 = r6.actual
                io.reactivex.exceptions.CompositeException r4 = new io.reactivex.exceptions.CompositeException
                r5 = 2
                java.lang.Throwable[] r5 = new java.lang.Throwable[r5]
                r5[r0] = r7
                r5[r1] = r2
                r4.<init>(r5)
                r3.onError(r4)
                goto L38
            L33:
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onError(r7)
            L38:
                return
            L39:
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onError(r7)
                org.reactivestreams.Subscription r7 = r6.s
                r7.cancel()
                r6.disposeAfter()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }
    }

    public FlowableUsing(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.resourceSupplier = r1
            r0.sourceSupplier = r2
            r0.disposer = r3
            r0.eager = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            java.util.concurrent.Callable<? extends D> r0 = r5.resourceSupplier     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L3e
            io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> r1 = r5.sourceSupplier     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L1b
            org.reactivestreams.Publisher r1 = (org.reactivestreams.Publisher) r1     // Catch: java.lang.Throwable -> L1b
            io.reactivex.internal.operators.flowable.FlowableUsing$UsingSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableUsing$UsingSubscriber
            io.reactivex.functions.Consumer<? super D> r3 = r5.disposer
            boolean r4 = r5.eager
            r2.<init>(r6, r0, r3, r4)
            r1.subscribe(r2)
            return
        L1b:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.functions.Consumer<? super D> r2 = r5.disposer     // Catch: java.lang.Throwable -> L28
            r2.accept(r0)     // Catch: java.lang.Throwable -> L28
            io.reactivex.internal.subscriptions.EmptySubscription.error(r1, r6)
            return
        L28:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
            r3 = 2
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r0
            r2.<init>(r3)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r2, r6)
            return
        L3e:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r6)
            return
    }
}
