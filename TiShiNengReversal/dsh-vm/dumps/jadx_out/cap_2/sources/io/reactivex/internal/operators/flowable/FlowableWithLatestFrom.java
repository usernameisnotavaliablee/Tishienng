package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
    final org.reactivestreams.Publisher<? extends U> other;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WithLatestFromSubscriber<T, U, R> extends java.util.concurrent.atomic.AtomicReference<U> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -312246233408980075L;
        final org.reactivestreams.Subscriber<? super R> actual;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> other;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;

        WithLatestFromSubscriber(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.s = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.other = r0
                r1.actual = r2
                r1.combiner = r3
                return
        }

        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                if (r0 == 0) goto L1e
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1 = r2.combiner     // Catch: java.lang.Throwable -> L12
                java.lang.Object r3 = r1.apply(r3, r0)     // Catch: java.lang.Throwable -> L12
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                r0.onNext(r3)
                return
            L12:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.cancel()
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                r0.onError(r3)
            L1e:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r2)
                if (r2 == 0) goto Ld
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Ld:
                return
        }

        public void otherError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r2, r1)
                if (r0 == 0) goto L11
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                io.reactivex.internal.subscriptions.EmptySubscription.error(r4, r0)
                return
            L11:
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.s
                java.lang.Object r0 = r0.get()
                if (r0 == r1) goto L22
                r3.cancel()
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                r0.onError(r4)
                return
            L22:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                return
        }

        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.request(r2)
                return
        }

        public boolean setOther(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r2)
                return r2
        }
    }

    public FlowableWithLatestFrom(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2, org.reactivestreams.Publisher<? extends U> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.combiner = r2
            r0.other = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r3) {
            r2 = this;
            io.reactivex.subscribers.SerializedSubscriber r0 = new io.reactivex.subscribers.SerializedSubscriber
            r0.<init>(r3)
            io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber r3 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber
            io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1 = r2.combiner
            r3.<init>(r0, r1)
            org.reactivestreams.Publisher<? extends U> r0 = r2.other
            io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$1 r1 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$1
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            org.reactivestreams.Publisher<T> r0 = r2.source
            r0.subscribe(r3)
            return
    }
}
