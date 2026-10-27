package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeAmb<T> extends io.reactivex.Maybe<T> {
    private final io.reactivex.MaybeSource<? extends T>[] sources;
    private final java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> sourcesIterable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class AmbMaybeObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7044685185359438206L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final io.reactivex.disposables.CompositeDisposable set;

        AmbMaybeObserver(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.set = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Ld
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.dispose()
            Ld:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L12
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.dispose()
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L12:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L13
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.dispose()
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                return
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.add(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L12
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.dispose()
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
            L12:
                return
        }
    }

    public MaybeAmb(io.reactivex.MaybeSource<? extends T>[] r1, java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r7) {
            r6 = this;
            io.reactivex.MaybeSource<? extends T>[] r0 = r6.sources
            r1 = 0
            if (r0 != 0) goto L44
            r0 = 8
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r2 = r6.sourcesIterable     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L29
            r3 = 0
        L10:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L45
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L29
            io.reactivex.MaybeSource r4 = (io.reactivex.MaybeSource) r4     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L2b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "One of the sources is null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r0 = move-exception
            goto L3d
        L2b:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L29
            if (r3 != r5) goto L37
            int r5 = r3 >> 2
            int r5 = r5 + r3
            io.reactivex.MaybeSource[] r5 = new io.reactivex.MaybeSource[r5]     // Catch: java.lang.Throwable -> L29
            java.lang.System.arraycopy(r0, r1, r5, r1, r3)     // Catch: java.lang.Throwable -> L29
            r0 = r5
        L37:
            int r5 = r3 + 1
            r0[r3] = r4     // Catch: java.lang.Throwable -> L29
            r3 = r5
            goto L10
        L3d:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)
            return
        L44:
            int r3 = r0.length
        L45:
            io.reactivex.internal.operators.maybe.MaybeAmb$AmbMaybeObserver r2 = new io.reactivex.internal.operators.maybe.MaybeAmb$AmbMaybeObserver
            r2.<init>(r7)
            r7.onSubscribe(r2)
        L4d:
            if (r1 >= r3) goto L6b
            r4 = r0[r1]
            boolean r5 = r2.isDisposed()
            if (r5 == 0) goto L58
            goto L70
        L58:
            if (r4 != 0) goto L65
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "One of the MaybeSources is null"
            r7.<init>(r0)
            r2.onError(r7)
            return
        L65:
            r4.subscribe(r2)
            int r1 = r1 + 1
            goto L4d
        L6b:
            if (r3 != 0) goto L70
            r7.onComplete()
        L70:
            return
    }
}
