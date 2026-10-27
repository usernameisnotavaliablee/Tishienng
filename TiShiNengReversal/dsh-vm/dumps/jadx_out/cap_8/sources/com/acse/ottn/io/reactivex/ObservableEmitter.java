package com.acse.ottn.io.reactivex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ObservableEmitter<T> extends com.acse.ottn.io.reactivex.Emitter<T> {
    boolean isDisposed();

    @com.acse.ottn.io.reactivex.annotations.NonNull
    com.acse.ottn.io.reactivex.ObservableEmitter<T> serialize();

    void setCancellable(@com.acse.ottn.io.reactivex.annotations.Nullable com.acse.ottn.io.reactivex.functions.Cancellable r1);

    void setDisposable(@com.acse.ottn.io.reactivex.annotations.Nullable com.acse.ottn.io.reactivex.disposables.Disposable r1);

    boolean tryOnError(@com.acse.ottn.io.reactivex.annotations.NonNull java.lang.Throwable r1);
}
