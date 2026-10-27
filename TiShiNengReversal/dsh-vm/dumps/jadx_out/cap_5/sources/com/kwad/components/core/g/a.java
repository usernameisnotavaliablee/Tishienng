package com.kwad.components.core.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public static int Qe;
    public static java.util.concurrent.atomic.AtomicInteger Qf;


    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            com.kwad.components.core.g.a.Qf = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.kwai.adclient.kscommerciallogger.model.BusinessType r2) {
            java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Jy()
            com.kwad.components.core.g.a$1 r1 = new com.kwad.components.core.g.a$1
            r1.<init>(r2)
            r0.execute(r1)
            return
    }
}
