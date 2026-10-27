package com.kwad.components.core.o.a.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface c extends com.kwad.sdk.components.b {
    com.kwad.sdk.components.t a(android.content.Context r1, java.lang.String r2, int r3, int r4, boolean r5);

    com.kwad.components.offline.api.tk.model.StyleTemplate checkStyleTemplateById(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5);

    java.lang.String getJsBaseDir(android.content.Context r1, java.lang.String r2);

    com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState getState();

    void loadTkFileByTemplateId(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, com.kwad.components.offline.api.tk.TKDownloadListener r6);

    void onDestroy();
}
