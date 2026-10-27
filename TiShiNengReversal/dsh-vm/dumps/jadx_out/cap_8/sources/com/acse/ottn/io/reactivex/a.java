package com.acse.ottn.io.reactivex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final /* synthetic */ class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* bridge */ /* synthetic */ void a(com.acse.ottn.io.reactivex.ObservableOnSubscribe r0, java.lang.Object r1) {
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public static void b(com.acse.ottn.io.reactivex.ObservableOnSubscribe r1, rx.l r2) {
            com.acse.ottn.io.reactivex.SubscriberObservableEmitter r0 = new com.acse.ottn.io.reactivex.SubscriberObservableEmitter     // Catch: java.lang.Exception -> L8
            r0.<init>(r2)     // Catch: java.lang.Exception -> L8
            r1.subscribe(r0)     // Catch: java.lang.Exception -> L8
        L8:
            return
    }
}
