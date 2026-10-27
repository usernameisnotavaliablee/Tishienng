package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableLift<R, T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.FlowableOperator<? extends R, ? super T> operator;

    public FlowableLift(org.reactivestreams.Publisher<T> r1, io.reactivex.FlowableOperator<? extends R, ? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.operator = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> r3) {
            r2 = this;
            io.reactivex.FlowableOperator<? extends R, ? super T> r0 = r2.operator     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            org.reactivestreams.Subscriber r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            if (r3 == 0) goto L12
            org.reactivestreams.Publisher<T> r0 = r2.source     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            r0.subscribe(r3)     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            return
        Le:
            r3 = move-exception
            goto L30
        L10:
            r3 = move-exception
            goto L41
        L12:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            java.lang.String r1 = "Operator "
            r0.append(r1)     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            io.reactivex.FlowableOperator<? extends R, ? super T> r1 = r2.operator     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            r0.append(r1)     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            java.lang.String r1 = " returned a null Subscriber"
            r0.append(r1)     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
            throw r3     // Catch: java.lang.Throwable -> Le java.lang.NullPointerException -> L10
        L30:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Actually not, but can't throw other exceptions due to RS"
            r0.<init>(r1)
            r0.initCause(r3)
            throw r0
        L41:
            throw r3
    }
}
