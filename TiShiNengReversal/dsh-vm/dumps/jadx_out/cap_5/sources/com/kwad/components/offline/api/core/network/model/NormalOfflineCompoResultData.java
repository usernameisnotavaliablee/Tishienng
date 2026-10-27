package com.kwad.components.offline.api.core.network.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NormalOfflineCompoResultData extends com.kwad.components.offline.api.core.network.model.BaseOfflineCompoResultData {
    public int code;
    public java.lang.String data;
    public java.lang.String header;

    public NormalOfflineCompoResultData() {
            r0 = this;
            r0.<init>()
            return
    }

    public void parseResponse(com.kwad.sdk.core.network.c r2) {
            r1 = this;
            int r0 = r2.code
            r1.code = r0
            java.lang.String r2 = r2.aEk
            r1.data = r2
            r2 = 0
            r1.header = r2
            return
    }
}
