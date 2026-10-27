package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeZipIterable<T, R> extends io.reactivex.Maybe<R> {
    final java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> sources;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;


    public MaybeZipIterable(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.zipper = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r7) {
            r6 = this;
            r0 = 8
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1 = r6.sources     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r3 = 0
        Lc:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L25
            io.reactivex.MaybeSource r4 = (io.reactivex.MaybeSource) r4     // Catch: java.lang.Throwable -> L25
            int r5 = r0.length     // Catch: java.lang.Throwable -> L25
            if (r3 != r5) goto L27
            int r5 = r3 >> 2
            int r5 = r5 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L25
            io.reactivex.MaybeSource[] r0 = (io.reactivex.MaybeSource[]) r0     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = move-exception
            goto L66
        L27:
            int r5 = r3 + 1
            r0[r3] = r4     // Catch: java.lang.Throwable -> L25
            r3 = r5
            goto Lc
        L2d:
            if (r3 != 0) goto L33
            io.reactivex.internal.disposables.EmptyDisposable.complete(r7)
            return
        L33:
            r1 = 1
            if (r3 != r1) goto L46
            r0 = r0[r2]
            io.reactivex.internal.operators.maybe.MaybeMap$MapMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeMap$MapMaybeObserver
            io.reactivex.internal.operators.maybe.MaybeZipIterable$1 r2 = new io.reactivex.internal.operators.maybe.MaybeZipIterable$1
            r2.<init>(r6)
            r1.<init>(r7, r2)
            r0.subscribe(r1)
            return
        L46:
            io.reactivex.internal.operators.maybe.MaybeZipArray$ZipCoordinator r1 = new io.reactivex.internal.operators.maybe.MaybeZipArray$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r4 = r6.zipper
            r1.<init>(r7, r3, r4)
            r7.onSubscribe(r1)
        L50:
            if (r2 >= r3) goto L65
            boolean r7 = r1.isDisposed()
            if (r7 == 0) goto L59
            goto L65
        L59:
            r7 = r0[r2]
            io.reactivex.internal.operators.maybe.MaybeZipArray$ZipMaybeObserver<T>[] r4 = r1.observers
            r4 = r4[r2]
            r7.subscribe(r4)
            int r2 = r2 + 1
            goto L50
        L65:
            return
        L66:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)
            return
    }
}
