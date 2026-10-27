package com.kwad.components.offline.api.core.network.adapter;

import com.kwad.components.offline.api.core.network.IOfflineCompoRequest;
import com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RequestListenerAdapter<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData> implements com.kwad.sdk.core.network.g<com.kwad.components.offline.api.core.network.adapter.RequestAdapter<R>, com.kwad.components.offline.api.core.network.adapter.ResultDataAdapter<T>> {
    private final com.kwad.components.offline.api.core.network.IOfflineCompoRequestListener<R, T> mRequestListener;

    public RequestListenerAdapter(com.kwad.components.offline.api.core.network.IOfflineCompoRequestListener<R, T> r1) {
            r0 = this;
            r0.<init>()
            r0.mRequestListener = r1
            return
    }

    public void onError(@androidx.annotation.NonNull com.kwad.components.offline.api.core.network.adapter.RequestAdapter<R> r2, int r3, java.lang.String r4) {
            r1 = this;
            com.kwad.components.offline.api.core.network.IOfflineCompoRequestListener<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData> r0 = r1.mRequestListener
            if (r0 == 0) goto Lb
            com.kwad.components.offline.api.core.network.IOfflineCompoRequest r2 = r2.getOfflineCompoRequest()
            r0.onError(r2, r3, r4)
        Lb:
            return
    }

    @Override // com.kwad.sdk.core.network.g
    public /* bridge */ /* synthetic */ void onError(@androidx.annotation.NonNull com.kwad.sdk.core.network.f r1, int r2, java.lang.String r3) {
            r0 = this;
            com.kwad.components.offline.api.core.network.adapter.RequestAdapter r1 = (com.kwad.components.offline.api.core.network.adapter.RequestAdapter) r1
            r0.onError(r1, r2, r3)
            return
    }

    public void onStartRequest(@androidx.annotation.NonNull com.kwad.components.offline.api.core.network.adapter.RequestAdapter<R> r2) {
            r1 = this;
            com.kwad.components.offline.api.core.network.IOfflineCompoRequestListener<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData> r0 = r1.mRequestListener
            if (r0 == 0) goto Lb
            com.kwad.components.offline.api.core.network.IOfflineCompoRequest r2 = r2.getOfflineCompoRequest()
            r0.onStartRequest(r2)
        Lb:
            return
    }

    @Override // com.kwad.sdk.core.network.g
    public /* bridge */ /* synthetic */ void onStartRequest(@androidx.annotation.NonNull com.kwad.sdk.core.network.f r1) {
            r0 = this;
            com.kwad.components.offline.api.core.network.adapter.RequestAdapter r1 = (com.kwad.components.offline.api.core.network.adapter.RequestAdapter) r1
            r0.onStartRequest(r1)
            return
    }

    public void onSuccess(@androidx.annotation.NonNull com.kwad.components.offline.api.core.network.adapter.RequestAdapter<R> r2, @androidx.annotation.NonNull com.kwad.components.offline.api.core.network.adapter.ResultDataAdapter<T> r3) {
            r1 = this;
            com.kwad.components.offline.api.core.network.IOfflineCompoRequestListener<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData> r0 = r1.mRequestListener
            if (r0 == 0) goto Lf
            com.kwad.components.offline.api.core.network.IOfflineCompoRequest r2 = r2.getOfflineCompoRequest()
            com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData r3 = r3.getOfflineCompoResultData()
            r0.onSuccess(r2, r3)
        Lf:
            return
    }

    @Override // com.kwad.sdk.core.network.g
    public /* bridge */ /* synthetic */ void onSuccess(@androidx.annotation.NonNull com.kwad.sdk.core.network.f r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.BaseResultData r2) {
            r0 = this;
            com.kwad.components.offline.api.core.network.adapter.RequestAdapter r1 = (com.kwad.components.offline.api.core.network.adapter.RequestAdapter) r1
            com.kwad.components.offline.api.core.network.adapter.ResultDataAdapter r2 = (com.kwad.components.offline.api.core.network.adapter.ResultDataAdapter) r2
            r0.onSuccess(r1, r2)
            return
    }
}
