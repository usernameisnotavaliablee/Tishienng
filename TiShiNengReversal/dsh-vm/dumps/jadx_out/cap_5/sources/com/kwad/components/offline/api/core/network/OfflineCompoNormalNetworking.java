package com.kwad.components.offline.api.core.network;

import com.kwad.components.offline.api.core.network.IOfflineCompoRequest;
import com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class OfflineCompoNormalNetworking<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData> implements com.kwad.components.offline.api.core.network.IOfflineCompoNetworking<R, T> {
    private com.kwad.components.offline.api.core.network.adapter.NormalNetworkingAdapter<R, T> mNetworking;

    public OfflineCompoNormalNetworking() {
            r1 = this;
            r1.<init>()
            com.kwad.components.offline.api.core.network.adapter.NormalNetworkingAdapter r0 = new com.kwad.components.offline.api.core.network.adapter.NormalNetworkingAdapter
            r0.<init>(r1)
            r1.mNetworking = r0
            return
    }

    @Override // com.kwad.components.offline.api.core.network.IOfflineCompoNetworking
    public void cancel() {
            r1 = this;
            com.kwad.components.offline.api.core.network.adapter.NormalNetworkingAdapter<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData> r0 = r1.mNetworking
            r0.cancel()
            return
    }

    public abstract T createResponseData();

    @Override // com.kwad.components.offline.api.core.network.IOfflineCompoNetworking
    public boolean enableMonitorReport() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.network.IOfflineCompoNetworking
    public boolean isPostByJson() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.network.IOfflineCompoNetworking
    public void onResponse(R r1, com.kwad.sdk.core.network.c r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.offline.api.core.network.IOfflineCompoNetworking
    public void request(@androidx.annotation.NonNull com.kwad.components.offline.api.core.network.IOfflineCompoRequestListener<R, T> r3) {
            r2 = this;
            com.kwad.components.offline.api.core.network.adapter.NormalNetworkingAdapter<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData> r0 = r2.mNetworking
            com.kwad.components.offline.api.core.network.adapter.NormalRequestListenerAdapter r1 = new com.kwad.components.offline.api.core.network.adapter.NormalRequestListenerAdapter
            r1.<init>(r3)
            r0.request(r1)
            return
    }
}
