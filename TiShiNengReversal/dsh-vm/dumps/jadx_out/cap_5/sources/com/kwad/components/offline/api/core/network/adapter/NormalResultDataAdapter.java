package com.kwad.components.offline.api.core.network.adapter;

import com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NormalResultDataAdapter<T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData> extends com.kwad.sdk.core.network.NormalResultData {
    private final T mOfflineCompoResultData;

    public NormalResultDataAdapter(T r1) {
            r0 = this;
            r0.<init>()
            r0.mOfflineCompoResultData = r1
            return
    }

    public T getOfflineCompoResultData() {
            r1 = this;
            T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData r0 = r1.mOfflineCompoResultData
            return r0
    }

    @Override // com.kwad.sdk.core.network.NormalResultData
    public void parseResponse(com.kwad.sdk.core.network.c r2) {
            r1 = this;
            super.parseResponse(r2)
            T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData r0 = r1.mOfflineCompoResultData
            r0.parseResponse(r2)
            return
    }
}
