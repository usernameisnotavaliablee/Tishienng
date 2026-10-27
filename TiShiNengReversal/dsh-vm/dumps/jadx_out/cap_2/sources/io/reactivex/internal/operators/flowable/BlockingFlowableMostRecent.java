package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingFlowableMostRecent<T> implements java.lang.Iterable<T> {
    final T initialValue;
    final org.reactivestreams.Publisher<? extends T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MostRecentSubscriber<T> extends io.reactivex.subscribers.DefaultSubscriber<T> {
        volatile java.lang.Object value;


        MostRecentSubscriber(T r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.value = r1
                return
        }

        public java.util.Iterator<T> getIterable() {
                r1 = this;
                io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber$1 r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber$1
                r0.<init>(r1)
                return r0
        }

        public void onComplete() {
                r1 = this;
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r1.value = r0
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.error(r1)
                r0.value = r1
                return
        }

        public void onNext(T r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.value = r1
                return
        }
    }

    public BlockingFlowableMostRecent(org.reactivestreams.Publisher<? extends T> r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.initialValue = r2
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber
            T r1 = r2.initialValue
            r0.<init>(r1)
            org.reactivestreams.Publisher<? extends T> r1 = r2.source
            r1.subscribe(r0)
            java.util.Iterator r0 = r0.getIterable()
            return r0
    }
}
