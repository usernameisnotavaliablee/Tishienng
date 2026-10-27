package com.kwad.components.offline.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements com.kwad.components.core.o.a.e.c {
    private final com.kwad.components.offline.api.tk.ITkOfflineCompo ake;

    public b(@androidx.annotation.NonNull com.kwad.components.offline.api.tk.ITkOfflineCompo r1) {
            r0 = this;
            r0.<init>()
            r0.ake = r1
            return
    }

    @Override // com.kwad.components.core.o.a.e.c
    public final com.kwad.sdk.components.t a(android.content.Context r7, java.lang.String r8, int r9, int r10, boolean r11) {
            r6 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r6.ake
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r7 = r0.getContext(r1, r2, r3, r4, r5)
            if (r7 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            com.kwad.components.offline.d.a.i r8 = new com.kwad.components.offline.d.a.i
            r8.<init>(r7)
            return r8
    }

    @Override // com.kwad.components.core.o.a.e.c
    public final com.kwad.components.offline.api.tk.model.StyleTemplate checkStyleTemplateById(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
            r6 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r6.ake
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.kwad.components.offline.api.tk.model.StyleTemplate r7 = r0.checkStyleTemplateById(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class<com.kwad.components.offline.d.b> getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.components.offline.d.b> r0 = com.kwad.components.offline.d.b.class
            return r0
    }

    @Override // com.kwad.components.core.o.a.e.c
    public final java.lang.String getJsBaseDir(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r1.ake
            java.lang.String r2 = r0.getJsBaseDir(r2, r3)
            return r2
    }

    @Override // com.kwad.components.core.o.a.e.c
    public final com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState getState() {
            r1 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r1.ake
            com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState r0 = r0.getState()
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.o.a.e.c
    public final void loadTkFileByTemplateId(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, com.kwad.components.offline.api.tk.TKDownloadListener r13) {
            r7 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r7.ake
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.loadTkFileByTemplateId(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void onConfigRefresh(android.content.Context r2, @androidx.annotation.NonNull org.json.JSONObject r3) {
            r1 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r1.ake
            r0.onConfigRefresh(r2, r3)
            return
    }

    @Override // com.kwad.components.core.o.a.e.c
    public final void onDestroy() {
            r1 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r1.ake
            r0.onDestroy()
            return
    }

    @Override // com.kwad.sdk.components.b
    public final int priority() {
            r1 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r0 = r1.ake
            int r0 = r0.priority()
            return r0
    }
}
