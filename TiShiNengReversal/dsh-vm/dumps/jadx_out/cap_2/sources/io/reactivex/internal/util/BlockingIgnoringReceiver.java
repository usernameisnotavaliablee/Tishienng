package io.reactivex.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingIgnoringReceiver extends java.util.concurrent.CountDownLatch implements io.reactivex.functions.Consumer<java.lang.Throwable>, io.reactivex.functions.Action {
    public java.lang.Throwable error;

    public BlockingIgnoringReceiver() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Override // io.reactivex.functions.Consumer
    public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.accept2(r1)
            return
    }

    /* renamed from: accept, reason: avoid collision after fix types in other method */
    public void accept2(java.lang.Throwable r1) {
            r0 = this;
            r0.error = r1
            r0.countDown()
            return
    }

    @Override // io.reactivex.functions.Action
    public void run() {
            r0 = this;
            r0.countDown()
            return
    }
}
