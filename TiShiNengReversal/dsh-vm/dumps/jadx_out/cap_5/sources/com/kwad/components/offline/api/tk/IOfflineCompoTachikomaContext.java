package com.kwad.components.offline.api.tk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOfflineCompoTachikomaContext {
    java.lang.Object execute(java.lang.String r1);

    void execute(java.lang.String r1, java.lang.String r2, com.kwad.components.offline.api.tk.IOfflineTKRenderListener r3);

    com.kwad.components.offline.api.tk.IOfflineTKView getTKView(java.lang.String r1, java.lang.Object... r2);

    int getUniqId();

    android.view.View getView();

    void onDestroy();

    void registerApkLoadCreator(com.kwad.components.offline.api.tk.IOfflineApkLoaderHolder r1);

    void registerHostActionHandler(com.kwad.components.offline.api.tk.IOfflineHostActionHandler r1);

    void registerJsBridge(com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler r1);

    void registerTKBridge(com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoTKBridgeHandler r1);

    void setCustomEnv(java.util.Map<java.lang.String, java.lang.Object> r1);

    void unregisterJsBridge();
}
