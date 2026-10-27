package com.acse.ottn.io.reactivex.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface BiFunction<T1, T2, R> extends rx.functions.q<T1, T2, R> {
    @com.acse.ottn.io.reactivex.annotations.NonNull
    R apply(@com.acse.ottn.io.reactivex.annotations.NonNull T1 r1, @com.acse.ottn.io.reactivex.annotations.NonNull T2 r2) throws java.lang.Exception;

    R call(T1 r1, T2 r2);
}
