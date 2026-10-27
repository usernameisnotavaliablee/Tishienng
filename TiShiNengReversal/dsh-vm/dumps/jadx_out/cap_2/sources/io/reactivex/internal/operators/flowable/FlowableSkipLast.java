package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableSkipLast<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int skip;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SkipLastSubscriber<T> extends java.util.ArrayDeque<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3807491841935125653L;
        final org.reactivestreams.Subscriber<? super T> actual;
        org.reactivestreams.Subscription s;
        final int skip;

        SkipLastSubscriber(org.reactivestreams.Subscriber<? super T> r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                r0.skip = r2
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

        public void onNext(T r4) {
                r3 = this;
                int r0 = r3.skip
                int r1 = r3.size()
                if (r0 != r1) goto L12
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                java.lang.Object r1 = r3.poll()
                r0.onNext(r1)
                goto L19
            L12:
                org.reactivestreams.Subscription r0 = r3.s
                r1 = 1
                r0.request(r1)
            L19:
                r3.offer(r4)
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

    public FlowableSkipLast(org.reactivestreams.Publisher<T> r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.skip = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            org.reactivestreams.Publisher<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableSkipLast$SkipLastSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSkipLast$SkipLastSubscriber
            int r2 = r3.skip
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
