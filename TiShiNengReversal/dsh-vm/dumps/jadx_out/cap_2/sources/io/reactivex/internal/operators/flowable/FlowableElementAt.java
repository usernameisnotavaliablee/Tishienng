package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableElementAt<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final T defaultValue;
    final long index;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ElementAtSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements org.reactivestreams.Subscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final long index;
        org.reactivestreams.Subscription s;

        ElementAtSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, T r4) {
                r0 = this;
                r0.<init>(r1)
                r0.index = r2
                r0.defaultValue = r4
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L14
                r0 = 1
                r1.done = r0
                T r0 = r1.defaultValue
                if (r0 != 0) goto L11
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
            L11:
                r1.complete(r0)
            L14:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r5.count
                long r2 = r5.index
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L19
                r0 = 1
                r5.done = r0
                org.reactivestreams.Subscription r0 = r5.s
                r0.cancel()
                r5.complete(r6)
                return
            L19:
                r2 = 1
                long r0 = r0 + r2
                r5.count = r0
                return
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
    }

    public FlowableElementAt(org.reactivestreams.Publisher<T> r1, long r2, T r4) {
            r0 = this;
            r0.<init>(r1)
            r0.index = r2
            r0.defaultValue = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableElementAt$ElementAtSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableElementAt$ElementAtSubscriber
            long r2 = r5.index
            T r4 = r5.defaultValue
            r1.<init>(r6, r2, r4)
            r0.subscribe(r1)
            return
    }
}
