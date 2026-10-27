package com.kwad.components.offline.api.core.network.adapter;

import com.kwad.components.offline.api.core.network.IOfflineCompoRequest;
import com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NormalNetworkingAdapter<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData> extends com.kwad.sdk.core.network.m<com.kwad.components.offline.api.core.network.adapter.NormalRequestAdapter<R>, com.kwad.components.offline.api.core.network.adapter.NormalResultDataAdapter<T>> {
    private final com.kwad.components.offline.api.core.network.OfflineCompoNormalNetworking<R, T> mOfflineCompoNetworking;


    public NormalNetworkingAdapter(@androidx.annotation.NonNull com.kwad.components.offline.api.core.network.OfflineCompoNormalNetworking<R, T> r1) {
            r0 = this;
            r0.<init>()
            r0.mOfflineCompoNetworking = r1
            return
    }

    @Override // com.kwad.sdk.core.network.m, com.kwad.sdk.core.network.a
    public void cancel() {
            r0 = this;
            super.cancel()
            return
    }

    @Override // com.kwad.sdk.core.network.a
    @androidx.annotation.NonNull
    protected com.kwad.components.offline.api.core.network.adapter.NormalRequestAdapter<R> createRequest() {
            r2 = this;
            com.kwad.components.offline.api.core.network.OfflineCompoNormalNetworking<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData> r0 = r2.mOfflineCompoNetworking
            com.kwad.components.offline.api.core.network.IOfflineCompoRequest r0 = r0.createRequest()
            com.kwad.components.offline.api.core.network.adapter.NormalNetworkingAdapter$1 r1 = new com.kwad.components.offline.api.core.network.adapter.NormalNetworkingAdapter$1
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.kwad.sdk.core.network.a
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.kwad.sdk.core.network.f createRequest() {
            r1 = this;
            com.kwad.components.offline.api.core.network.adapter.NormalRequestAdapter r0 = r1.createRequest()
            return r0
    }

    @Override // com.kwad.sdk.core.network.m
    protected com.kwad.components.offline.api.core.network.adapter.NormalResultDataAdapter<T> createResponseData() {
            r2 = this;
            com.kwad.components.offline.api.core.network.OfflineCompoNormalNetworking<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData> r0 = r2.mOfflineCompoNetworking
            com.kwad.components.offline.api.core.network.model.NormalOfflineCompoResultData r0 = r0.createResponseData()
            com.kwad.components.offline.api.core.network.adapter.NormalResultDataAdapter r1 = new com.kwad.components.offline.api.core.network.adapter.NormalResultDataAdapter
            r1.<init>(r0)
            return r1
    }

    @Override // com.kwad.sdk.core.network.m
    public /* bridge */ /* synthetic */ com.kwad.sdk.core.network.NormalResultData createResponseData() {
            r1 = this;
            com.kwad.components.offline.api.core.network.adapter.NormalResultDataAdapter r0 = r1.createResponseData()
            return r0
    }
}
