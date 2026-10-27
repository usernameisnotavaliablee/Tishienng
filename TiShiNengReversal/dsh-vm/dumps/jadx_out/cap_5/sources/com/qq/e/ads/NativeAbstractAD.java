package com.qq.e.ads;

import com.qq.e.comm.pi.IBiddingLoss;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class NativeAbstractAD<T extends com.qq.e.comm.pi.IBiddingLoss> extends com.qq.e.ads.AbstractAD<T> implements com.qq.e.comm.pi.IBiddingLoss {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface BasicADListener {
        void onNoAD(com.qq.e.comm.util.AdError r1);
    }

    public NativeAbstractAD() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void a(T r1) {
            r0 = this;
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
            r0 = this;
            com.qq.e.comm.pi.IBiddingLoss r1 = (com.qq.e.comm.pi.IBiddingLoss) r1
            r0.a(r1)
            return
    }

    @Override // com.qq.e.comm.pi.IBiddingLoss
    public void sendLossNotification(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            T r0 = r1.a
            com.qq.e.comm.pi.IBiddingLoss r0 = (com.qq.e.comm.pi.IBiddingLoss) r0
            r0.sendLossNotification(r2)
            return
    }
}
