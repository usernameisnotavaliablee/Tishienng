package com.kwad.components.offline.api.core.network;

import com.kwad.components.offline.api.core.network.IOfflineCompoRequest;
import com.kwad.components.offline.api.core.network.model.BaseOfflineCompoResultData;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOfflineCompoNetworking<R extends com.kwad.components.offline.api.core.network.IOfflineCompoRequest, T extends com.kwad.components.offline.api.core.network.model.BaseOfflineCompoResultData> {
    void cancel();

    @androidx.annotation.NonNull
    R createRequest();

    boolean enableMonitorReport();

    boolean isPostByJson();

    void onResponse(R r1, com.kwad.sdk.core.network.c r2);

    void request(@androidx.annotation.NonNull com.kwad.components.offline.api.core.network.IOfflineCompoRequestListener<R, T> r1);
}
