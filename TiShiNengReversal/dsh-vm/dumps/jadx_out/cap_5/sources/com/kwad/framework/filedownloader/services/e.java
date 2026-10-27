package com.kwad.framework.filedownloader.services;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.framework.filedownloader.c.b.a implements com.kwad.framework.filedownloader.services.i {
    private final com.kwad.framework.filedownloader.services.g apq;
    private final java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> apr;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.framework.filedownloader.services.e r1);

        void onDisconnected();
    }

    e(java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> r1, com.kwad.framework.filedownloader.services.g r2) {
            r0 = this;
            r0.<init>()
            r0.apr = r1
            r0.apq = r2
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void a(com.kwad.framework.filedownloader.c.a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void b(com.kwad.framework.filedownloader.c.a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void b(java.lang.String r11, java.lang.String r12, boolean r13, int r14, int r15, int r16, boolean r17, com.kwad.framework.filedownloader.d.b r18, boolean r19) {
            r10 = this;
            com.kwad.framework.filedownloader.services.g r0 = r10.apq
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
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean bQ(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            boolean r2 = r0.bQ(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final long bR(int r3) {
            r2 = this;
            com.kwad.framework.filedownloader.services.g r0 = r2.apq
            long r0 = r0.cc(r3)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final long bS(int r3) {
            r2 = this;
            com.kwad.framework.filedownloader.services.g r0 = r2.apq
            long r0 = r0.bS(r3)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean bw(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            boolean r2 = r0.bw(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final byte bx(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            byte r2 = r0.bx(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean by(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            boolean r2 = r0.by(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean isIdle() {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            boolean r0 = r0.isIdle()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final void onDestroy() {
            r1 = this;
            com.kwad.framework.filedownloader.services.e$a r0 = com.kwad.framework.filedownloader.n.xB()
            r0.onDisconnected()
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void pauseAllTasks() {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            r0.zs()
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void startForeground(int r2, android.app.Notification r3) {
            r1 = this;
            java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> r0 = r1.apr
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L17
            java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> r0 = r1.apr
            java.lang.Object r0 = r0.get()
            com.kwad.framework.filedownloader.services.FileDownloadServiceProxy r0 = (com.kwad.framework.filedownloader.services.FileDownloadServiceProxy) r0
            android.app.Service r0 = r0.context
            r0.startForeground(r2, r3)
        L17:
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void stopForeground(boolean r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> r0 = r1.apr
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L17
            java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> r0 = r1.apr
            java.lang.Object r0 = r0.get()
            com.kwad.framework.filedownloader.services.FileDownloadServiceProxy r0 = (com.kwad.framework.filedownloader.services.FileDownloadServiceProxy) r0
            android.app.Service r0 = r0.context
            r0.stopForeground(r2)
        L17:
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean x(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            boolean r2 = r0.z(r2, r3)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void yJ() {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            r0.yJ()
            return
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final void zp() {
            r1 = this;
            com.kwad.framework.filedownloader.services.e$a r0 = com.kwad.framework.filedownloader.n.xB()
            r0.a(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final android.os.IBinder zq() {
            r1 = this;
            r0 = 0
            return r0
    }
}
