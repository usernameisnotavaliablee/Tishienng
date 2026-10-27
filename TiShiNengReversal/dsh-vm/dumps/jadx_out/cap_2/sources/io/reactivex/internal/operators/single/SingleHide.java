package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleHide<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class HideSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;
        io.reactivex.disposables.Disposable d;

        HideSingleObserver(io.reactivex.SingleObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.SingleObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    public SingleHide(io.reactivex.SingleSource<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<? extends T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleHide$HideSingleObserver r1 = new io.reactivex.internal.operators.single.SingleHide$HideSingleObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
