package com.kwad.components.offline.api.obiwan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IObiwanOfflineCompo extends com.kwad.components.offline.api.IOfflineCompo<com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig> {
    public static final java.lang.String IMPL = "com.kwad.sdk.core.log.ObiwanOfflineCompoImpl";
    public static final java.lang.String PACKAGE_NAME = "com.kwad.components.obiwan";

    com.kwad.components.offline.api.obiwan.IObiwanLogcat getLog();

    void updateConfigs();
}
