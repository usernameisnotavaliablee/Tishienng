package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class e extends com.kwad.framework.filedownloader.event.c {
    private com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus alR;

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.framework.filedownloader.event.c
    public final boolean a(com.kwad.framework.filedownloader.event.b r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent
            if (r0 == 0) goto L17
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent r2 = (com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent) r2
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r2 = r2.yH()
            r1.alR = r2
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r0 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.connected
            if (r2 != r0) goto L14
            r1.xk()
            goto L17
        L14:
            r1.xl()
        L17:
            r2 = 0
            return r2
    }

    public abstract void xk();

    public abstract void xl();

    public final com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus xm() {
            r1 = this;
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r0 = r1.alR
            return r0
    }
}
