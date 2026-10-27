package com.kwad.framework.filedownloader.services;

import android.os.Binder;
import android.os.IInterface;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a<CALLBACK extends android.os.Binder, INTERFACE extends android.os.IInterface> implements android.content.ServiceConnection, com.kwad.framework.filedownloader.u {
    private final java.util.ArrayList<java.lang.Runnable> amm;
    private final java.lang.Class<?> aoz;
    private final CALLBACK apd;
    private volatile INTERFACE ape;
    private final java.util.HashMap<java.lang.String, java.lang.Object> apf;
    private final java.util.List<android.content.Context> apg;

    protected a(java.lang.Class<?> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.apf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.apg = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.amm = r0
            r1.aoz = r2
            android.os.Binder r2 = r1.xF()
            r1.apd = r2
            return
    }

    private void a(android.content.Context r4, java.lang.Runnable r5) {
            r3 = this;
            boolean r5 = com.kwad.framework.filedownloader.f.f.aJ(r4)
            if (r5 != 0) goto L38
            boolean r5 = com.kwad.framework.filedownloader.f.d.apD
            r0 = 1
            if (r5 == 0) goto L1d
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "bindStartByContext %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r5, r1)
        L1d:
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<?> r1 = r3.aoz
            r5.<init>(r4, r1)
            java.util.List<android.content.Context> r1 = r3.apg
            boolean r1 = r1.contains(r4)
            if (r1 != 0) goto L31
            java.util.List<android.content.Context> r1 = r3.apg
            r1.add(r4)
        L31:
            r4.bindService(r5, r3, r0)
            r4.startService(r5)
            return
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties"
            r4.<init>(r5)
            throw r4
    }

    private void bj(boolean r4) {
            r3 = this;
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L11
            INTERFACE extends android.os.IInterface r4 = r3.ape
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "release connect resources %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r4, r0)
        L11:
            r4 = 0
            r3.ape = r4
            com.kwad.framework.filedownloader.f r4 = com.kwad.framework.filedownloader.f.xn()
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent r0 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r1 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.lost
            java.lang.Class<?> r2 = r3.aoz
            r0.<init>(r1, r2)
            r4.c(r0)
            return
    }

    protected abstract void a(INTERFACE r1, CALLBACK r2);

    @Override // com.kwad.framework.filedownloader.u
    public final void aG(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0)
            return
    }

    protected abstract INTERFACE b(android.os.IBinder r1);

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
            r1 = this;
            android.os.IInterface r0 = r1.ze()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            r2 = this;
            android.os.IInterface r4 = r2.b(r4)
            r2.ape = r4
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L1a
            INTERFACE extends android.os.IInterface r4 = r2.ape
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.String r3 = "onServiceConnected %s %s"
            com.kwad.framework.filedownloader.f.d.c(r2, r3, r0)
        L1a:
            INTERFACE extends android.os.IInterface r3 = r2.ape     // Catch: android.os.RemoteException -> L21
            CALLBACK extends android.os.Binder r4 = r2.apd     // Catch: android.os.RemoteException -> L21
            r2.a(r3, r4)     // Catch: android.os.RemoteException -> L21
        L21:
            java.util.ArrayList<java.lang.Runnable> r3 = r2.amm
            java.lang.Object r3 = r3.clone()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList<java.lang.Runnable> r4 = r2.amm
            r4.clear()
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r3.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L32
        L42:
            com.kwad.framework.filedownloader.f r3 = com.kwad.framework.filedownloader.f.xn()
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent r4 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r0 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.connected
            java.lang.Class<?> r1 = r2.aoz
            r4.<init>(r0, r1)
            r3.c(r4)
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r5) {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            r1 = 1
            if (r0 == 0) goto L14
            INTERFACE extends android.os.IInterface r0 = r4.ape
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r2[r1] = r0
            java.lang.String r5 = "onServiceDisconnected %s %s"
            com.kwad.framework.filedownloader.f.d.c(r4, r5, r2)
        L14:
            r4.bj(r1)
            return
    }

    protected abstract CALLBACK xF();

    protected final INTERFACE ze() {
            r1 = this;
            INTERFACE extends android.os.IInterface r0 = r1.ape
            return r0
    }
}
