package com.kwad.components.offline.api.core.network;

import com.kwad.components.offline.api.core.network.IOfflineCompoRequest;
import com.kwad.components.offline.api.core.network.model.BaseOfflineCompoResultData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOfflineCompoRequestListener<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.BaseOfflineCompoResultData> {
    @androidx.annotation.WorkerThread
    void onError(@androidx.annotation.NonNull R r1, int r2, java.lang.String r3);

    @androidx.annotation.WorkerThread
    void onStartRequest(@androidx.annotation.NonNull R r1);

    @androidx.annotation.WorkerThread
    void onSuccess(@androidx.annotation.NonNull R r1, @androidx.annotation.NonNull T r2);
}
