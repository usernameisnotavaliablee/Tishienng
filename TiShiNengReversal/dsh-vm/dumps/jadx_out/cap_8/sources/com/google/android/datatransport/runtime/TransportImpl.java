package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class TransportImpl<T> implements com.google.android.datatransport.Transport<T> {
    private final java.lang.String name;
    private final com.google.android.datatransport.Encoding payloadEncoding;
    private final com.google.android.datatransport.Transformer<T, byte[]> transformer;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;
    private final com.google.android.datatransport.runtime.TransportInternal transportInternal;

    TransportImpl(com.google.android.datatransport.runtime.TransportContext r1, java.lang.String r2, com.google.android.datatransport.Encoding r3, com.google.android.datatransport.Transformer<T, byte[]> r4, com.google.android.datatransport.runtime.TransportInternal r5) {
            r0 = this;
            r0.<init>()
            r0.transportContext = r1
            r0.name = r2
            r0.payloadEncoding = r3
            r0.transformer = r4
            r0.transportInternal = r5
            return
    }

    static /* synthetic */ void lambda$send$0(java.lang.Exception r0) {
            return
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(com.google.android.datatransport.Event<T> r4, com.google.android.datatransport.TransportScheduleCallback r5) {
            r3 = this;
            com.google.android.datatransport.runtime.TransportInternal r0 = r3.transportInternal
            com.google.android.datatransport.runtime.SendRequest$Builder r1 = com.google.android.datatransport.runtime.SendRequest.builder()
            com.google.android.datatransport.runtime.TransportContext r2 = r3.transportContext
            com.google.android.datatransport.runtime.SendRequest$Builder r1 = r1.setTransportContext(r2)
            com.google.android.datatransport.runtime.SendRequest$Builder r4 = r1.setEvent(r4)
            java.lang.String r1 = r3.name
            com.google.android.datatransport.runtime.SendRequest$Builder r4 = r4.setTransportName(r1)
            com.google.android.datatransport.Transformer<T, byte[]> r1 = r3.transformer
            com.google.android.datatransport.runtime.SendRequest$Builder r4 = r4.setTransformer(r1)
            com.google.android.datatransport.Encoding r1 = r3.payloadEncoding
            com.google.android.datatransport.runtime.SendRequest$Builder r4 = r4.setEncoding(r1)
            com.google.android.datatransport.runtime.SendRequest r4 = r4.build()
            r0.send(r4, r5)
            return
    }

    @Override // com.google.android.datatransport.Transport
    public void send(com.google.android.datatransport.Event<T> r2) {
            r1 = this;
            com.google.android.datatransport.TransportScheduleCallback r0 = com.google.android.datatransport.runtime.TransportImpl$$Lambda$1.lambdaFactory$()
            r1.schedule(r2, r0)
            return
    }
}
