package com.kwad.components.offline.api.tk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOfflineTKView {
    void bindActivity(android.app.Activity r1);

    java.lang.Object callJSFunc(java.lang.String r1, java.lang.String r2, com.kwad.components.offline.api.tk.IOfflineTKFunction r3);

    android.view.View getView();

    boolean onBackPressed();

    void render();

    void setData(java.lang.Object... r1);

    void setDownloadProgress(java.lang.String r1);

    void setLifeStatus(java.lang.String r1);
}
