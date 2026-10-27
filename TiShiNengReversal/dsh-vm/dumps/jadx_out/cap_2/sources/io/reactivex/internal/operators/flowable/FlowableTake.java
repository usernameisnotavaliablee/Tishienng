package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableTake<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long limit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TakeSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5636543848937116287L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        final long limit;
        long remaining;
        org.reactivestreams.Subscription subscription;

        TakeSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.limit = r2
                r0.remaining = r2
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.subscription
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
                if (r0 != 0) goto L11
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscription r0 = r1.subscription
                r0.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
            L11:
                return
        }

        public void onNext(T r8) {
                r7 = this;
                boolean r0 = r7.done
                if (r0 != 0) goto L28
                long r0 = r7.remaining
                r2 = 1
                long r2 = r0 - r2
                r7.remaining = r2
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 <= 0) goto L28
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                org.reactivestreams.Subscriber<? super T> r1 = r7.actual
                r1.onNext(r8)
                if (r0 == 0) goto L28
                org.reactivestreams.Subscription r8 = r7.subscription
                r8.cancel()
                r7.onComplete()
            L28:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r6) {
                r5 = this;
                org.reactivestreams.Subscription r0 = r5.subscription
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r6)
                if (r0 == 0) goto L23
                r5.subscription = r6
                long r0 = r5.limit
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
                r6.cancel()
                r6 = 1
                r5.done = r6
                org.reactivestreams.Subscriber<? super T> r6 = r5.actual
                io.reactivex.internal.subscriptions.EmptySubscription.complete(r6)
                return
            L1e:
                org.reactivestreams.Subscriber<? super T> r6 = r5.actual
                r6.onSubscribe(r5)
            L23:
                return
        }

        public void request(long r4) {
                r3 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r4)
                if (r0 != 0) goto L7
                return
            L7:
                boolean r0 = r3.get()
                if (r0 != 0) goto L26
                r0 = 0
                r1 = 1
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L26
                long r0 = r3.limit
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L26
                org.reactivestreams.Subscription r4 = r3.subscription
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r4.request(r0)
                return
            L26:
                org.reactivestreams.Subscription r0 = r3.subscription
                r0.request(r4)
                return
        }
    }

    public FlowableTake(org.reactivestreams.Publisher<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.limit = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableTake$TakeSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTake$TakeSubscriber
            long r2 = r4.limit
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
