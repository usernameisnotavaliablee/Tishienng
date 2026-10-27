package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.components.offline.api.tk.IOfflineApkLoader {
    com.kwad.sdk.components.j akC;


    public d(com.kwad.sdk.components.j r1) {
            r0 = this;
            r0.<init>()
            r0.akC = r1
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void addLoadStatusListener(com.kwad.components.offline.api.tk.IOfflineApkLoadStatusListener r3) {
            r2 = this;
            com.kwad.sdk.components.j r0 = r2.akC
            com.kwad.components.offline.d.a.d$1 r1 = new com.kwad.components.offline.d.a.d$1
            r1.<init>(r2, r3)
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void cancelDownload() {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.cancelDownload()
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void clearFileCache() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void installApp() {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.installApp()
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void openApp() {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.openApp()
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void pauseDownload() {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.pauseDownload()
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void resumeDownload() {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.resumeDownload()
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void setCustomReportParam(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.setCustomReportParam(r2)
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void startDownload() {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.startDownload()
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void stopDownload() {
            r1 = this;
            com.kwad.sdk.components.j r0 = r1.akC
            r0.stopDownload()
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoader
    public final void uninstallApp() {
            r0 = this;
            return
    }
}
