package com.kwai.adclient.kscommerciallogger.snapshot;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwai.adclient.kscommerciallogger.snapshot.d {
    b(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.kwai.adclient.kscommerciallogger.snapshot.d
    final synchronized org.json.JSONObject Tq() {
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8
            r0.<init>()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }
}
