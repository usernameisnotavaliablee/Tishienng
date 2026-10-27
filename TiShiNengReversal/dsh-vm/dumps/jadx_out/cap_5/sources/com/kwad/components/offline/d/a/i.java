package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i implements com.kwad.sdk.components.t {
    private final com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext akI;


    public i(@androidx.annotation.NonNull com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r1) {
            r0 = this;
            r0.<init>()
            com.kwad.sdk.utils.ax.checkNotNull(r1)
            r0.akI = r1
            return
    }

    @Override // com.kwad.sdk.components.t
    public final com.kwad.sdk.components.o a(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r1.akI
            com.kwad.components.offline.api.tk.IOfflineTKView r2 = r0.getTKView(r2, r3)
            com.kwad.components.offline.d.a.i$1 r3 = new com.kwad.components.offline.d.a.i$1
            r3.<init>(r1, r2)
            return r3
    }

    @Override // com.kwad.sdk.components.t
    public final void a(com.kwad.sdk.components.k r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r2.akI
            com.kwad.components.offline.d.a.e r1 = new com.kwad.components.offline.d.a.e
            r1.<init>(r3)
            r0.registerApkLoadCreator(r1)
        Lc:
            return
    }

    @Override // com.kwad.sdk.components.t
    public final void a(com.kwad.sdk.components.r r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r2.akI
            com.kwad.components.offline.d.a.c r1 = new com.kwad.components.offline.d.a.c
            r1.<init>(r3)
            r0.registerHostActionHandler(r1)
        Lc:
            return
    }

    @Override // com.kwad.sdk.components.t
    public final void a(java.lang.String r3, java.lang.String r4, com.kwad.sdk.components.s r5) {
            r2 = this;
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r2.akI
            com.kwad.components.offline.d.a.h r1 = new com.kwad.components.offline.d.a.h
            r1.<init>(r5)
            r0.execute(r3, r4, r1)
            return
    }

    @Override // com.kwad.sdk.components.t
    public final void b(com.kwad.sdk.core.webview.c.g r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r2.akI
            com.kwad.components.offline.d.a.f r1 = new com.kwad.components.offline.d.a.f
            r1.<init>(r3)
            r0.registerTKBridge(r1)
            return
    }

    @Override // com.kwad.sdk.components.t
    public final void c(com.kwad.sdk.core.webview.c.a r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r2.akI
            com.kwad.components.offline.d.a.b r1 = new com.kwad.components.offline.d.a.b
            r1.<init>(r3)
            r0.registerJsBridge(r1)
            return
    }

    @Override // com.kwad.sdk.components.t
    public final java.lang.Object execute(java.lang.String r2) {
            r1 = this;
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r1.akI
            java.lang.Object r2 = r0.execute(r2)
            return r2
    }

    @Override // com.kwad.sdk.components.t
    public final int getUniqId() {
            r1 = this;
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r1.akI
            int r0 = r0.getUniqId()
            return r0
    }

    @Override // com.kwad.sdk.components.t
    public final android.view.View getView() {
            r1 = this;
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r1.akI
            android.view.View r0 = r0.getView()
            return r0
    }

    @Override // com.kwad.sdk.components.t
    public final void onDestroy() {
            r1 = this;
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r1.akI
            r0.onDestroy()
            return
    }

    @Override // com.kwad.sdk.components.t
    public final void setCustomEnv(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext r0 = r1.akI
            r0.setCustomEnv(r2)
            return
    }
}
