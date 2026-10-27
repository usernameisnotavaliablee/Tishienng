package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeFilter<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FilterMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;
        io.reactivex.disposables.Disposable d;
        final io.reactivex.functions.Predicate<? super T> predicate;

        FilterMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.predicate = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.d = r1
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

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Predicate<? super T> r0 = r1.predicate     // Catch: java.lang.Throwable -> L14
                boolean r0 = r0.test(r2)     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto Le
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
            Le:
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onComplete()
                return
            L14:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }
    }

    public MaybeFilter(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeFilter$FilterMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeFilter$FilterMaybeObserver
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
