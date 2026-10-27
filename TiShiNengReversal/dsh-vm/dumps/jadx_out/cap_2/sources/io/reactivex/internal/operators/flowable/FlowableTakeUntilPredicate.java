package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableTakeUntilPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class InnerSubscriber<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        final io.reactivex.functions.Predicate<? super T> predicate;
        org.reactivestreams.Subscription s;

        InnerSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.predicate = r2
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lc
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Ld
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
            Ld:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L2b
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                io.reactivex.functions.Predicate<? super T> r0 = r1.predicate     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r0.test(r2)     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L2b
                r2 = 1
                r1.done = r2
                org.reactivestreams.Subscription r2 = r1.s
                r2.cancel()
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onComplete()
                return
            L1f:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                r1.onError(r2)
            L2b:
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

    public FlowableTakeUntilPredicate(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            org.reactivestreams.Publisher<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate$InnerSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate$InnerSubscriber
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
