package com.acse.ottn.io.reactivex.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TryCatchConsumer<T> implements com.acse.ottn.io.reactivex.functions.Consumer<T> {
    com.acse.ottn.io.reactivex.functions.Consumer<T> consumer;

    public TryCatchConsumer(com.acse.ottn.io.reactivex.functions.Consumer<T> r1) {
            r0 = this;
            r0.<init>()
            r0.consumer = r1
            return
    }

    @Override // com.acse.ottn.io.reactivex.functions.Consumer
    public void accept(T r2) throws java.lang.Exception {
            r1 = this;
            com.acse.ottn.io.reactivex.functions.Consumer<T> r0 = r1.consumer
            r0.accept(r2)
            return
    }

    @Override // com.acse.ottn.io.reactivex.functions.Consumer
    public /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
            return
    }
}
