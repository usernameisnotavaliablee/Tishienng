package com.kwad.components.offline.api.core.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface INetworkManager {
    void addNetworkChangeListener(android.content.Context r1, com.kwad.components.offline.api.core.network.INetworkChangeListener r2);

    int getNetworkType(android.content.Context r1);

    void removeNetworkChangeListener(android.content.Context r1, com.kwad.components.offline.api.core.network.INetworkChangeListener r2);
}
