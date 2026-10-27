package io.reactivex.observables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ConnectableObservable<T> extends io.reactivex.Observable<T> {
    public ConnectableObservable() {
            r0 = this;
            r0.<init>()
            return
    }

    public io.reactivex.Observable<T> autoConnect() {
            r1 = this;
            r0 = 1
            io.reactivex.Observable r0 = r1.autoConnect(r0)
            return r0
    }

    public io.reactivex.Observable<T> autoConnect(int r2) {
            r1 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Observable r2 = r1.autoConnect(r2, r0)
            return r2
    }

    public io.reactivex.Observable<T> autoConnect(int r2, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r3) {
            r1 = this;
            if (r2 > 0) goto La
            r1.connect(r3)
            io.reactivex.observables.ConnectableObservable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r2
        La:
            io.reactivex.internal.operators.observable.ObservableAutoConnect r0 = new io.reactivex.internal.operators.observable.ObservableAutoConnect
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    public final io.reactivex.disposables.Disposable connect() {
            r1 = this;
            io.reactivex.internal.util.ConnectConsumer r0 = new io.reactivex.internal.util.ConnectConsumer
            r0.<init>()
            r1.connect(r0)
            io.reactivex.disposables.Disposable r0 = r0.disposable
            return r0
    }

    public abstract void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r1);

    public io.reactivex.Observable<T> refCount() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableRefCount r0 = new io.reactivex.internal.operators.observable.ObservableRefCount
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }
}
