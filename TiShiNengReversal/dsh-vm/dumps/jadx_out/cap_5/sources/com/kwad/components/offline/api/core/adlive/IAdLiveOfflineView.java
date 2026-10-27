package com.kwad.components.offline.api.core.adlive;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IAdLiveOfflineView {
    android.view.TextureView getTextureView();

    android.view.View getView();

    void onDestroy();

    void registerAdLiveShopInfoListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveShopInfoListener r1);

    void registerClickListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveHandleClickListener r1);

    void registerKsAdLiveMessageListener(com.kwad.components.offline.api.core.adlive.listener.KsAdLiveMessageListener r1);

    void registerLiveMessageListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveMessageListener r1);

    void registerLiveShopListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveShopListener r1);

    void unRegisterAdLiveShopInfoListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveShopInfoListener r1);

    void unRegisterClickListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveHandleClickListener r1);

    void unRegisterKsAdLiveMessageListener(com.kwad.components.offline.api.core.adlive.listener.KsAdLiveMessageListener r1);

    void unRegisterLiveMessageListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveMessageListener r1);

    void unRegisterLiveShopListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveShopListener r1);
}
