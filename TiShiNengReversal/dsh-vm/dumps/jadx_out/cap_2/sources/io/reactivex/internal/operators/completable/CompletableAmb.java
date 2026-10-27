package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableAmb extends io.reactivex.Completable {
    private final io.reactivex.CompletableSource[] sources;
    private final java.lang.Iterable<? extends io.reactivex.CompletableSource> sourcesIterable;


    public CompletableAmb(io.reactivex.CompletableSource[] r1, java.lang.Iterable<? extends io.reactivex.CompletableSource> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r11) {
            r10 = this;
            io.reactivex.CompletableSource[] r0 = r10.sources
            java.lang.String r1 = "One of the sources is null"
            r2 = 0
            if (r0 != 0) goto L44
            r0 = 8
            io.reactivex.CompletableSource[] r0 = new io.reactivex.CompletableSource[r0]
            java.lang.Iterable<? extends io.reactivex.CompletableSource> r3 = r10.sourcesIterable     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L29
            r4 = 0
        L12:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L45
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L29
            io.reactivex.CompletableSource r5 = (io.reactivex.CompletableSource) r5     // Catch: java.lang.Throwable -> L29
            if (r5 != 0) goto L2b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L29
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r11)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r0 = move-exception
            goto L3d
        L2b:
            int r6 = r0.length     // Catch: java.lang.Throwable -> L29
            if (r4 != r6) goto L37
            int r6 = r4 >> 2
            int r6 = r6 + r4
            io.reactivex.CompletableSource[] r6 = new io.reactivex.CompletableSource[r6]     // Catch: java.lang.Throwable -> L29
            java.lang.System.arraycopy(r0, r2, r6, r2, r4)     // Catch: java.lang.Throwable -> L29
            r0 = r6
        L37:
            int r6 = r4 + 1
            r0[r4] = r5     // Catch: java.lang.Throwable -> L29
            r4 = r6
            goto L12
        L3d:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r11)
            return
        L44:
            int r4 = r0.length
        L45:
            io.reactivex.disposables.CompositeDisposable r3 = new io.reactivex.disposables.CompositeDisposable
            r3.<init>()
            r11.onSubscribe(r3)
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>()
            io.reactivex.internal.operators.completable.CompletableAmb$1 r6 = new io.reactivex.internal.operators.completable.CompletableAmb$1
            r6.<init>(r10, r5, r3, r11)
            r7 = 0
        L58:
            if (r7 >= r4) goto L82
            r8 = r0[r7]
            boolean r9 = r3.isDisposed()
            if (r9 == 0) goto L63
            goto L87
        L63:
            if (r8 != 0) goto L7c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            r1 = 1
            boolean r1 = r5.compareAndSet(r2, r1)
            if (r1 == 0) goto L78
            r3.dispose()
            r11.onError(r0)
            return
        L78:
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
        L7c:
            r8.subscribe(r6)
            int r7 = r7 + 1
            goto L58
        L82:
            if (r4 != 0) goto L87
            r11.onComplete()
        L87:
            return
    }
}
