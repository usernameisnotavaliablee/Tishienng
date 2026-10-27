package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableUsing<R> extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> completableFunction;
    final io.reactivex.functions.Consumer<? super R> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<R> resourceSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class UsingObserver<R> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -674404550052917487L;
        final io.reactivex.CompletableObserver actual;
        io.reactivex.disposables.Disposable d;
        final io.reactivex.functions.Consumer<? super R> disposer;
        final boolean eager;

        UsingObserver(io.reactivex.CompletableObserver r1, R r2, io.reactivex.functions.Consumer<? super R> r3, boolean r4) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                r0.disposer = r3
                r0.eager = r4
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.d = r0
                r1.disposeResourceAfter()
                return
        }

        void disposeResourceAfter() {
                r2 = this;
                java.lang.Object r0 = r2.getAndSet(r2)
                if (r0 == r2) goto L13
                io.reactivex.functions.Consumer<? super R> r1 = r2.disposer     // Catch: java.lang.Throwable -> Lc
                r1.accept(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L13:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.d = r0
                boolean r0 = r2.eager
                if (r0 == 0) goto L1e
                java.lang.Object r0 = r2.getAndSet(r2)
                if (r0 == r2) goto L2a
                io.reactivex.functions.Consumer<? super R> r1 = r2.disposer     // Catch: java.lang.Throwable -> L14
                r1.accept(r0)     // Catch: java.lang.Throwable -> L14
                goto L1e
            L14:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.CompletableObserver r1 = r2.actual
                r1.onError(r0)
                return
            L1e:
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onComplete()
                boolean r0 = r2.eager
                if (r0 != 0) goto L2a
                r2.disposeResourceAfter()
            L2a:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r4.d = r0
                boolean r0 = r4.eager
                if (r0 == 0) goto L27
                java.lang.Object r0 = r4.getAndSet(r4)
                if (r0 == r4) goto L33
                io.reactivex.functions.Consumer<? super R> r1 = r4.disposer     // Catch: java.lang.Throwable -> L14
                r1.accept(r0)     // Catch: java.lang.Throwable -> L14
                goto L27
            L14:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r0
                r1.<init>(r2)
                r5 = r1
            L27:
                io.reactivex.CompletableObserver r0 = r4.actual
                r0.onError(r5)
                boolean r5 = r4.eager
                if (r5 != 0) goto L33
                r4.disposeResourceAfter()
            L33:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.CompletableObserver r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public CompletableUsing(java.util.concurrent.Callable<R> r1, io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> r2, io.reactivex.functions.Consumer<? super R> r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.resourceSupplier = r1
            r0.completableFunction = r2
            r0.disposer = r3
            r0.eager = r4
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r6) {
            r5 = this;
            java.util.concurrent.Callable<R> r0 = r5.resourceSupplier     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L5a
            io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> r1 = r5.completableFunction     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "The completableFunction returned a null CompletableSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L21
            io.reactivex.CompletableSource r1 = (io.reactivex.CompletableSource) r1     // Catch: java.lang.Throwable -> L21
            io.reactivex.internal.operators.completable.CompletableUsing$UsingObserver r2 = new io.reactivex.internal.operators.completable.CompletableUsing$UsingObserver
            io.reactivex.functions.Consumer<? super R> r3 = r5.disposer
            boolean r4 = r5.eager
            r2.<init>(r6, r0, r3, r4)
            r1.subscribe(r2)
            return
        L21:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r2 = r5.eager
            if (r2 == 0) goto L45
            io.reactivex.functions.Consumer<? super R> r2 = r5.disposer     // Catch: java.lang.Throwable -> L2f
            r2.accept(r0)     // Catch: java.lang.Throwable -> L2f
            goto L45
        L2f:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
            r3 = 2
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r0
            r2.<init>(r3)
            io.reactivex.internal.disposables.EmptyDisposable.error(r2, r6)
            return
        L45:
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r6)
            boolean r6 = r5.eager
            if (r6 != 0) goto L59
            io.reactivex.functions.Consumer<? super R> r6 = r5.disposer     // Catch: java.lang.Throwable -> L52
            r6.accept(r0)     // Catch: java.lang.Throwable -> L52
            goto L59
        L52:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
        L59:
            return
        L5a:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r6)
            return
    }
}
