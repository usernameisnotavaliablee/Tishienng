package com.acse.ottn.io.reactivex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ObservableOnSubscribe<T> extends rx.e.a<T> {
    /* bridge */ /* synthetic */ void call(java.lang.Object r1);

    void call(rx.l<? super T> r1);

    void subscribe(@com.acse.ottn.io.reactivex.annotations.NonNull com.acse.ottn.io.reactivex.ObservableEmitter<T> r1) throws java.lang.Exception;
}
