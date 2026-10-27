package com.kwad.components.offline.api.tk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOfflineTKNativeIntent {
    void callTKBridge(java.lang.String r1);

    void callbackDismiss();

    void callbackPageStatus(boolean r1, java.lang.String r2);

    java.lang.String getClassName();

    android.content.Intent getIntent();

    java.lang.String getTemplateString();

    java.lang.String getUrl();

    java.lang.String getViewKey();

    void registerJSCallHandler(com.kwad.components.offline.api.tk.IOfflineTKCallHandler r1);
}
