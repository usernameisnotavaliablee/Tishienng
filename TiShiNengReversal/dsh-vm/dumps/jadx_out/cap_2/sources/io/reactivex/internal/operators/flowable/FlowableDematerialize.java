package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableDematerialize<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<io.reactivex.Notification<T>, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DematerializeSubscriber<T> implements org.reactivestreams.Subscriber<io.reactivex.Notification<T>>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        org.reactivestreams.Subscription s;

        DematerializeSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
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
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
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

        public void onNext(io.reactivex.Notification<T> r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L12
                boolean r0 = r2.isOnError()
                if (r0 == 0) goto L11
                java.lang.Throwable r2 = r2.getError()
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L11:
                return
            L12:
                boolean r0 = r2.isOnError()
                if (r0 == 0) goto L25
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                java.lang.Throwable r2 = r2.getError()
                r1.onError(r2)
                return
            L25:
                boolean r0 = r2.isOnComplete()
                if (r0 == 0) goto L34
                org.reactivestreams.Subscription r2 = r1.s
                r2.cancel()
                r1.onComplete()
                return
            L34:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                java.lang.Object r2 = r2.getValue()
                r0.onNext(r2)
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                r0.onNext(r1)
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

    public FlowableDematerialize(org.reactivestreams.Publisher<io.reactivex.Notification<T>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableDematerialize$DematerializeSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDematerialize$DematerializeSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
