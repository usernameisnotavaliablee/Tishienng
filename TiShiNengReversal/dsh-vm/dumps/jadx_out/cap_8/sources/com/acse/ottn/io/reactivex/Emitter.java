package com.acse.ottn.io.reactivex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface Emitter<T> {
    void onComplete();

    void onError(@com.acse.ottn.io.reactivex.annotations.NonNull java.lang.Throwable r1);

    void onNext(@com.acse.ottn.io.reactivex.annotations.NonNull T r1);
}
