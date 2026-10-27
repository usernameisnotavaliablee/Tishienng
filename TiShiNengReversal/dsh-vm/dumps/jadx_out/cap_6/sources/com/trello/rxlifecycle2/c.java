package com.trello.rxlifecycle2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class c<T> implements io.reactivex.ObservableTransformer<T, T>, io.reactivex.FlowableTransformer<T, T>, io.reactivex.SingleTransformer<T, T>, io.reactivex.MaybeTransformer<T, T>, io.reactivex.CompletableTransformer {
    final io.reactivex.Observable<?> a;

    c(io.reactivex.Observable<?> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "observable == null"
            z2.a.a(r2, r0)
            r1.a = r2
            return
    }

    public io.reactivex.CompletableSource apply(io.reactivex.Completable r4) {
            r3 = this;
            io.reactivex.Observable<?> r0 = r3.a
            io.reactivex.functions.Function<java.lang.Object, io.reactivex.Completable> r1 = com.trello.rxlifecycle2.a.c
            io.reactivex.Completable r0 = r0.flatMapCompletable(r1)
            r1 = 2
            io.reactivex.CompletableSource[] r1 = new io.reactivex.CompletableSource[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            io.reactivex.Completable r4 = io.reactivex.Completable.ambArray(r1)
            return r4
    }

    public io.reactivex.MaybeSource<T> apply(io.reactivex.Maybe<T> r2) {
            r1 = this;
            io.reactivex.Observable<?> r0 = r1.a
            io.reactivex.Maybe r0 = r0.firstElement()
            io.reactivex.Maybe r2 = r2.takeUntil(r0)
            return r2
    }

    public io.reactivex.ObservableSource<T> apply(io.reactivex.Observable<T> r2) {
            r1 = this;
            io.reactivex.Observable<?> r0 = r1.a
            io.reactivex.Observable r2 = r2.takeUntil(r0)
            return r2
    }

    public io.reactivex.SingleSource<T> apply(io.reactivex.Single<T> r2) {
            r1 = this;
            io.reactivex.Observable<?> r0 = r1.a
            io.reactivex.Single r0 = r0.firstOrError()
            io.reactivex.Single r2 = r2.takeUntil(r0)
            return r2
    }

    public org.reactivestreams.Publisher<T> apply(io.reactivex.Flowable<T> r3) {
            r2 = this;
            io.reactivex.Observable<?> r0 = r2.a
            io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.Flowable r0 = r0.toFlowable(r1)
            io.reactivex.Flowable r3 = r3.takeUntil(r0)
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<com.trello.rxlifecycle2.c> r0 = com.trello.rxlifecycle2.c.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            com.trello.rxlifecycle2.c r3 = (com.trello.rxlifecycle2.c) r3
            io.reactivex.Observable<?> r0 = r2.a
            io.reactivex.Observable<?> r3 = r3.a
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            io.reactivex.Observable<?> r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LifecycleTransformer{observable="
            r0.append(r1)
            io.reactivex.Observable<?> r1 = r2.a
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
