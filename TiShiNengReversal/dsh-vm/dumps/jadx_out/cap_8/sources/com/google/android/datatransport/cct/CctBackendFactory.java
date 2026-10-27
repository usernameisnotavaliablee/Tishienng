package com.google.android.datatransport.cct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CctBackendFactory implements com.google.android.datatransport.runtime.backends.BackendFactory {
    public CctBackendFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendFactory
    public com.google.android.datatransport.runtime.backends.TransportBackend create(com.google.android.datatransport.runtime.backends.CreationContext r4) {
            r3 = this;
            com.google.android.datatransport.cct.CctTransportBackend r0 = new com.google.android.datatransport.cct.CctTransportBackend
            android.content.Context r1 = r4.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.google.android.datatransport.runtime.time.Clock r2 = r4.getWallClock()
            com.google.android.datatransport.runtime.time.Clock r4 = r4.getMonotonicClock()
            r0.<init>(r1, r2, r4)
            return r0
    }
}
