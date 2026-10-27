package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableFromSingle<T> extends io.reactivex.Completable {
    final io.reactivex.SingleSource<T> single;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CompletableFromSingleObserver<T> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.CompletableObserver co;

        CompletableFromSingleObserver(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.co = r1
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.co
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.co
                r0.onSubscribe(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r1) {
                r0 = this;
                io.reactivex.CompletableObserver r1 = r0.co
                r1.onComplete()
                return
        }
    }

    public CompletableFromSingle(io.reactivex.SingleSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.single = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.single
            io.reactivex.internal.operators.completable.CompletableFromSingle$CompletableFromSingleObserver r1 = new io.reactivex.internal.operators.completable.CompletableFromSingle$CompletableFromSingleObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
