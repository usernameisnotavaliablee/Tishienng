package io.reactivex.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ConnectConsumer implements io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
    public io.reactivex.disposables.Disposable disposable;

    public ConnectConsumer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: accept, reason: avoid collision after fix types in other method */
    public void accept2(io.reactivex.disposables.Disposable r1) throws java.lang.Exception {
            r0 = this;
            r0.disposable = r1
            return
    }

    @Override // io.reactivex.functions.Consumer
    public /* bridge */ /* synthetic */ void accept(io.reactivex.disposables.Disposable r1) throws java.lang.Exception {
            r0 = this;
            io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
            r0.accept2(r1)
            return
    }
}
