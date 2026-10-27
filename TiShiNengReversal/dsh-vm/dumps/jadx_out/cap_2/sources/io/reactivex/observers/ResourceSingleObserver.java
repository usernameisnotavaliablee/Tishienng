package io.reactivex.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ResourceSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
    private final io.reactivex.internal.disposables.ListCompositeDisposable resources;
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> s;

    public ResourceSingleObserver() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.s = r0
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = new io.reactivex.internal.disposables.ListCompositeDisposable
            r0.<init>()
            r1.resources = r0
            return
    }

    public final void add(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.lang.String r0 = "resource is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.add(r2)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            if (r0 == 0) goto Ld
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.dispose()
        Ld:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
            boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
            if (r2 == 0) goto Lb
            r1.onStart()
        Lb:
            return
    }
}
