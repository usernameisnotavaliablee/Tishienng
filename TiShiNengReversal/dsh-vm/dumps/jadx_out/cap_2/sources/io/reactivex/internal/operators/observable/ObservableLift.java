package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableLift<R, T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.ObservableOperator<? extends R, ? super T> operator;

    public ObservableLift(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableOperator<? extends R, ? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.operator = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r3) {
            r2 = this;
            io.reactivex.ObservableOperator<? extends R, ? super T> r0 = r2.operator     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            io.reactivex.Observer r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            java.lang.String r1 = "Operator "
            r0.append(r1)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            io.reactivex.ObservableOperator<? extends R, ? super T> r1 = r2.operator     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            java.lang.String r1 = " returned a null Observer"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            io.reactivex.Observer r3 = (io.reactivex.Observer) r3     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c
            io.reactivex.ObservableSource<T> r0 = r2.source
            r0.subscribe(r3)
            return
        L2a:
            r3 = move-exception
            goto L2e
        L2c:
            r3 = move-exception
            goto L3f
        L2e:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Actually not, but can't throw other exceptions due to RS"
            r0.<init>(r1)
            r0.initCause(r3)
            throw r0
        L3f:
            throw r3
    }
}
