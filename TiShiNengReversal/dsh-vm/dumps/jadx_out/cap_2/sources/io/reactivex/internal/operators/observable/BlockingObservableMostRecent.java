package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingObservableMostRecent<T> implements java.lang.Iterable<T> {
    final T initialValue;
    final io.reactivex.ObservableSource<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MostRecentObserver<T> extends io.reactivex.observers.DefaultObserver<T> {
        volatile java.lang.Object value;


        MostRecentObserver(T r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.value = r1
                return
        }

        public java.util.Iterator<T> getIterable() {
                r1 = this;
                io.reactivex.internal.operators.observable.BlockingObservableMostRecent$MostRecentObserver$1 r0 = new io.reactivex.internal.operators.observable.BlockingObservableMostRecent$MostRecentObserver$1
                r0.<init>(r1)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r1.value = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.error(r1)
                r0.value = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.value = r1
                return
        }
    }

    public BlockingObservableMostRecent(io.reactivex.ObservableSource<T> r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.initialValue = r2
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            io.reactivex.internal.operators.observable.BlockingObservableMostRecent$MostRecentObserver r0 = new io.reactivex.internal.operators.observable.BlockingObservableMostRecent$MostRecentObserver
            T r1 = r2.initialValue
            r0.<init>(r1)
            io.reactivex.ObservableSource<T> r1 = r2.source
            r1.subscribe(r0)
            java.util.Iterator r0 = r0.getIterable()
            return r0
    }
}
