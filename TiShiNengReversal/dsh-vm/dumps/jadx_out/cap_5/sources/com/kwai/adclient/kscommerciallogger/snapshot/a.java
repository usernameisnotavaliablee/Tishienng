package com.kwai.adclient.kscommerciallogger.snapshot;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwai.adclient.kscommerciallogger.snapshot.c {
    a(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // com.kwai.adclient.kscommerciallogger.snapshot.c
    public final synchronized com.kwai.adclient.kscommerciallogger.snapshot.d hP(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.kwai.adclient.kscommerciallogger.snapshot.b r2 = new com.kwai.adclient.kscommerciallogger.snapshot.b     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "empty"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return r2
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    @Override // com.kwai.adclient.kscommerciallogger.snapshot.c
    final org.json.JSONObject hQ(java.lang.String r1) {
            r0 = this;
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            return r1
    }
}
