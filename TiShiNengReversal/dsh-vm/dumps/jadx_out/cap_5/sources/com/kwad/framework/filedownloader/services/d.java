package com.kwad.framework.filedownloader.services;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.framework.filedownloader.c.b.a implements com.kwad.framework.filedownloader.message.e.b, com.kwad.framework.filedownloader.services.i {
    private final android.os.RemoteCallbackList<com.kwad.framework.filedownloader.c.a> app;
    private final com.kwad.framework.filedownloader.services.g apq;
    private final java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> apr;

    d(java.lang.ref.WeakReference<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy> r2, com.kwad.framework.filedownloader.services.g r3) {
            r1 = this;
            r1.<init>()
            android.os.RemoteCallbackList r0 = new android.os.RemoteCallbackList
            r0.<init>()
            r1.app = r0
            r1.apr = r2
            r1.apq = r3
            com.kwad.framework.filedownloader.message.e r2 = com.kwad.framework.filedownloader.message.e.yT()
            r2.a(r1)
            return
    }

    private synchronized int v(com.kwad.framework.filedownloader.message.MessageSnapshot r5) {
            r4 = this;
            monitor-enter(r4)
            android.os.RemoteCallbackList<com.kwad.framework.filedownloader.c.a> r0 = r4.app     // Catch: java.lang.Throwable -> L29
            int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L23
            android.os.RemoteCallbackList<com.kwad.framework.filedownloader.c.a> r3 = r4.app     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            android.os.IInterface r3 = r3.getBroadcastItem(r2)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            com.kwad.framework.filedownloader.c.a r3 = (com.kwad.framework.filedownloader.c.a) r3     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            r3.q(r5)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            int r2 = r2 + 1
            goto L9
        L19:
            r5 = move-exception
            goto L2b
        L1b:
            r5 = move-exception
            java.lang.String r2 = "callback error"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L19
            com.kwad.framework.filedownloader.f.d.a(r4, r5, r2, r1)     // Catch: java.lang.Throwable -> L19
        L23:
            android.os.RemoteCallbackList<com.kwad.framework.filedownloader.c.a> r5 = r4.app     // Catch: java.lang.Throwable -> L29
            r5.finishBroadcast()     // Catch: java.lang.Throwable -> L29
            goto L31
        L29:
            r5 = move-exception
            goto L33
        L2b:
            android.os.RemoteCallbackList<com.kwad.framework.filedownloader.c.a> r0 = r4.app     // Catch: java.lang.Throwable -> L29
            r0.finishBroadcast()     // Catch: java.lang.Throwable -> L29
            throw r5     // Catch: java.lang.Throwable -> L29
        L31:
            monitor-exit(r4)
            return r0
        L33:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r5
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void a(com.kwad.framework.filedownloader.c.a r2) {
            r1 = this;
            android.os.RemoteCallbackList<com.kwad.framework.filedownloader.c.a> r0 = r1.app
            r0.register(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void b(com.kwad.framework.filedownloader.c.a r2) {
            r1 = this;
            android.os.RemoteCallbackList<com.kwad.framework.filedownloader.c.a> r0 = r1.app
            r0.unregister(r2)
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
            r2 = this;
            com.kwad.framework.filedownloader.message.e r0 = com.kwad.framework.filedownloader.message.e.yT()
            r1 = 0
            r0.a(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void pauseAllTasks() {
            r1 = this;
            com.kwad.framework.filedownloader.services.g r0 = r1.apq
            r0.zs()
            return
    }

    @Override // com.kwad.framework.filedownloader.message.e.b
    public final void r(com.kwad.framework.filedownloader.message.MessageSnapshot r1) {
            r0 = this;
            r0.v(r1)
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
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final android.os.IBinder zq() {
            r0 = this;
            return r0
    }
}
