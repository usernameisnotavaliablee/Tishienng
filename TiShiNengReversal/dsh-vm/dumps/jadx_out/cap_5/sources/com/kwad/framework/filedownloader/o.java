package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class o implements com.kwad.framework.filedownloader.services.e.a, com.kwad.framework.filedownloader.u {
    private static java.lang.Class<?> aml;
    private final java.util.ArrayList<java.lang.Runnable> amm;
    private com.kwad.framework.filedownloader.services.e amn;

    static {
            return
    }

    o() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.amm = r0
            return
    }

    private void a(android.content.Context r2, java.lang.Runnable r3) {
            r1 = this;
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class r0 = xD()
            r3.<init>(r2, r0)
            r2.startService(r3)
            return
    }

    private static java.lang.Class<?> xD() {
            java.lang.Class<?> r0 = com.kwad.framework.filedownloader.o.aml
            if (r0 != 0) goto L8
            java.lang.Class<com.kwad.sdk.api.proxy.app.FileDownloadService$SharedMainProcessService> r0 = com.kwad.sdk.api.proxy.app.FileDownloadService.SharedMainProcessService.class
            com.kwad.framework.filedownloader.o.aml = r0
        L8:
            java.lang.Class<?> r0 = com.kwad.framework.filedownloader.o.aml
            return r0
    }

    @Override // com.kwad.framework.filedownloader.services.e.a
    public final void a(com.kwad.framework.filedownloader.services.e r4) {
            r3 = this;
            r3.amn = r4
            java.util.ArrayList<java.lang.Runnable> r4 = r3.amm
            java.lang.Object r4 = r4.clone()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList<java.lang.Runnable> r0 = r3.amm
            r0.clear()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r4.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L13
        L23:
            com.kwad.framework.filedownloader.f r4 = com.kwad.framework.filedownloader.f.xn()
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent r0 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r1 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.connected
            java.lang.Class r2 = xD()
            r0.<init>(r1, r2)
            r4.c(r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(java.lang.String r11, java.lang.String r12, boolean r13, int r14, int r15, int r16, boolean r17, com.kwad.framework.filedownloader.d.b r18, boolean r19) {
            r10 = this;
            boolean r0 = r10.isConnected()
            if (r0 != 0) goto Lb
            boolean r11 = com.kwad.framework.filedownloader.f.a.h(r11, r12, r13)
            return r11
        Lb:
            com.kwad.framework.filedownloader.services.e r0 = r10.amn
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 1
            return r11
    }

    @Override // com.kwad.framework.filedownloader.u
    public final void aG(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bw(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 != 0) goto Lb
            boolean r2 = com.kwad.framework.filedownloader.f.a.bw(r2)
            return r2
        Lb:
            com.kwad.framework.filedownloader.services.e r0 = r1.amn
            boolean r2 = r0.bw(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte bx(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 != 0) goto Lb
            byte r2 = com.kwad.framework.filedownloader.f.a.bx(r2)
            return r2
        Lb:
            com.kwad.framework.filedownloader.services.e r0 = r1.amn
            byte r2 = r0.bx(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean by(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 != 0) goto Lb
            boolean r2 = com.kwad.framework.filedownloader.f.a.by(r2)
            return r2
        Lb:
            com.kwad.framework.filedownloader.services.e r0 = r1.amn
            boolean r2 = r0.by(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
            r1 = this;
            com.kwad.framework.filedownloader.services.e r0 = r1.amn
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.services.e.a
    public final void onDisconnected() {
            r4 = this;
            r0 = 0
            r4.amn = r0
            com.kwad.framework.filedownloader.f r0 = com.kwad.framework.filedownloader.f.xn()
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent r1 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r2 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.disconnected
            java.lang.Class r3 = xD()
            r1.<init>(r2, r3)
            r0.c(r1)
            return
    }
}
