package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableResumeNext extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> errorMapper;
    final io.reactivex.CompletableSource source;


    public CompletableResumeNext(io.reactivex.CompletableSource r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.errorMapper = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r4.onSubscribe(r0)
            io.reactivex.CompletableSource r1 = r3.source
            io.reactivex.internal.operators.completable.CompletableResumeNext$1 r2 = new io.reactivex.internal.operators.completable.CompletableResumeNext$1
            r2.<init>(r3, r4, r0)
            r1.subscribe(r2)
            return
    }
}
