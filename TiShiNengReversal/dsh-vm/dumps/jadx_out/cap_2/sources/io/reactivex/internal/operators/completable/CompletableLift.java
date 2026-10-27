package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableLift extends io.reactivex.Completable {
    final io.reactivex.CompletableOperator onLift;
    final io.reactivex.CompletableSource source;

    public CompletableLift(io.reactivex.CompletableSource r1, io.reactivex.CompletableOperator r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onLift = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            io.reactivex.CompletableOperator r0 = r1.onLift     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> Le
            io.reactivex.CompletableObserver r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> Le
            io.reactivex.CompletableSource r0 = r1.source     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> Le
            r0.subscribe(r2)     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> Le
            return
        Lc:
            r2 = move-exception
            goto L10
        Le:
            r2 = move-exception
            goto L17
        L10:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
        L17:
            throw r2
    }
}
