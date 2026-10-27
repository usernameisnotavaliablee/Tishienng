package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableDoOnLifecycle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    private final io.reactivex.functions.Action onCancel;
    private final io.reactivex.functions.LongConsumer onRequest;
    private final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SubscriptionLambdaSubscriber<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.Action onCancel;
        final io.reactivex.functions.LongConsumer onRequest;
        final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;
        org.reactivestreams.Subscription s;

        SubscriptionLambdaSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r2, io.reactivex.functions.LongConsumer r3, io.reactivex.functions.Action r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onSubscribe = r2
                r0.onCancel = r4
                r0.onRequest = r3
                return
        }

        public void cancel() {
                r1 = this;
                io.reactivex.functions.Action r0 = r1.onCancel     // Catch: java.lang.Throwable -> L6
                r0.run()     // Catch: java.lang.Throwable -> L6
                goto Ld
            L6:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Ld:
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
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
                io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r0 = r1.onSubscribe     // Catch: java.lang.Throwable -> L15
                r0.accept(r2)     // Catch: java.lang.Throwable -> L15
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto L14
                r1.s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            L14:
                return
            L15:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.cancel()
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r2)
                return
        }

        public void request(long r2) {
                r1 = this;
                io.reactivex.functions.LongConsumer r0 = r1.onRequest     // Catch: java.lang.Throwable -> L6
                r0.accept(r2)     // Catch: java.lang.Throwable -> L6
                goto Ld
            L6:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Ld:
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }
    }

    public FlowableDoOnLifecycle(io.reactivex.Flowable<T> r1, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r2, io.reactivex.functions.LongConsumer r3, io.reactivex.functions.Action r4) {
            r0 = this;
            r0.<init>(r1)
            r0.onSubscribe = r2
            r0.onRequest = r3
            r0.onCancel = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle$SubscriptionLambdaSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle$SubscriptionLambdaSubscriber
            io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r2 = r5.onSubscribe
            io.reactivex.functions.LongConsumer r3 = r5.onRequest
            io.reactivex.functions.Action r4 = r5.onCancel
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
