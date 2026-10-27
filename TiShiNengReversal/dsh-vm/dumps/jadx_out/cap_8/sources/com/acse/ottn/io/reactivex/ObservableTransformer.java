package com.acse.ottn.io.reactivex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ObservableTransformer<Upstream, Downstream> extends rx.e.c<Upstream, Downstream> {
    @com.acse.ottn.io.reactivex.annotations.NonNull
    rx.e<Downstream> apply(@com.acse.ottn.io.reactivex.annotations.NonNull rx.e<Upstream> r1);

    /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1);

    rx.e<Downstream> call(rx.e<Upstream> r1);
}
