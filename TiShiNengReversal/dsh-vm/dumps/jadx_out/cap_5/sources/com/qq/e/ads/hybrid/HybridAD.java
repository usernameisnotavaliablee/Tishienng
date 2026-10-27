package com.qq.e.ads.hybrid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HybridAD extends com.qq.e.ads.AbstractAD<com.qq.e.comm.pi.HADI> implements com.qq.e.comm.pi.HADI {
    private com.qq.e.ads.hybrid.HybridADListener h;
    private java.util.concurrent.CountDownLatch i;
    private com.qq.e.ads.hybrid.HybridADSetting j;


    public HybridAD(android.content.Context r3, com.qq.e.ads.hybrid.HybridADSetting r4, com.qq.e.ads.hybrid.HybridADListener r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.i = r0
            r2.j = r4
            r2.h = r5
            java.lang.String r4 = "NO_POS_ID"
            r2.a(r3, r4)
            return
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch a(com.qq.e.ads.hybrid.HybridAD r0) {
            java.util.concurrent.CountDownLatch r0 = r0.i
            return r0
    }

    static /* synthetic */ void a(com.qq.e.ads.hybrid.HybridAD r0, int r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void b(com.qq.e.ads.hybrid.HybridAD r0, int r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ boolean b(com.qq.e.ads.hybrid.HybridAD r0) {
            boolean r0 = r0.b()
            return r0
    }

    static /* synthetic */ java.lang.Object c(com.qq.e.ads.hybrid.HybridAD r0) {
            T r0 = r0.a
            return r0
    }

    static /* synthetic */ java.lang.Object d(com.qq.e.ads.hybrid.HybridAD r0) {
            T r0 = r0.a
            return r0
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ com.qq.e.comm.pi.HADI a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.HADI r1 = r0.b(r1, r2, r3, r4, r5)
            return r1
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    protected void a2(com.qq.e.comm.pi.HADI r1) {
            r0 = this;
            java.util.concurrent.CountDownLatch r1 = r0.i
            r1.countDown()
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(com.qq.e.comm.pi.HADI r1) {
            r0 = this;
            com.qq.e.comm.pi.HADI r1 = (com.qq.e.comm.pi.HADI) r1
            r0.a2(r1)
            return
    }

    protected com.qq.e.comm.pi.HADI b(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.ads.hybrid.HybridADSetting r1 = r0.j
            com.qq.e.ads.hybrid.HybridADListener r3 = r0.h
            com.qq.e.comm.pi.HADI r1 = r2.getHybridAD(r1, r3)
            return r1
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int r2) {
            r1 = this;
            com.qq.e.ads.hybrid.HybridADListener r0 = r1.h
            if (r0 == 0) goto Lb
            com.qq.e.comm.util.AdError r2 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r2)
            r0.onError(r2)
        Lb:
            java.util.concurrent.CountDownLatch r2 = r1.i
            r2.countDown()
            return
    }

    @Override // com.qq.e.comm.pi.HADI
    public void loadUrl(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r2.b()
            if (r0 == 0) goto L1d
            T r0 = r2.a
            if (r0 == 0) goto L17
            com.qq.e.comm.pi.HADI r0 = (com.qq.e.comm.pi.HADI) r0
            r0.loadUrl(r3)
            return
        L17:
            java.lang.String r3 = "loadUrl"
            r2.a(r3)
            return
        L1d:
            java.lang.Thread r0 = new java.lang.Thread
            com.qq.e.ads.hybrid.HybridAD$1 r1 = new com.qq.e.ads.hybrid.HybridAD$1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }
}
