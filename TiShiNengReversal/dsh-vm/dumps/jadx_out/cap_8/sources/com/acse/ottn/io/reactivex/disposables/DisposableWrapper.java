package com.acse.ottn.io.reactivex.disposables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DisposableWrapper implements com.acse.ottn.io.reactivex.disposables.Disposable {
    rx.m subscription;

    public DisposableWrapper(rx.m r1) {
            r0 = this;
            r0.<init>()
            r0.subscription = r1
            return
    }

    @Override // com.acse.ottn.io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            rx.m r0 = r1.subscription
            r0.unsubscribe()
            return
    }

    @Override // com.acse.ottn.io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            rx.m r0 = r1.subscription
            boolean r0 = r0.isUnsubscribed()
            return r0
    }
}
