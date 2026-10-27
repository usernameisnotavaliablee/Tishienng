package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class z extends com.kwad.framework.filedownloader.e implements com.kwad.framework.filedownloader.v {
    private final java.util.ArrayList<com.kwad.framework.filedownloader.a.InterfaceC0110a> amz;

    public z() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.amz = r0
            return
    }

    @Override // com.kwad.framework.filedownloader.v
    public final boolean d(com.kwad.framework.filedownloader.a.InterfaceC0110a r2) {
            r1 = this;
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r1.amz
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r1.amz
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // com.kwad.framework.filedownloader.v
    public final void e(com.kwad.framework.filedownloader.a.InterfaceC0110a r3) {
            r2 = this;
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r2.amz
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r2.amz
            monitor-enter(r0)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r2.amz     // Catch: java.lang.Throwable -> L12
            r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
        L15:
            return
    }

    @Override // com.kwad.framework.filedownloader.v
    public final boolean f(com.kwad.framework.filedownloader.a.InterfaceC0110a r7) {
            r6 = this;
            com.kwad.framework.filedownloader.r.xI()
            boolean r0 = com.kwad.framework.filedownloader.r.xK()
            r1 = 0
            if (r0 != 0) goto L54
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r6.amz
            monitor-enter(r0)
            com.kwad.framework.filedownloader.r.xI()     // Catch: java.lang.Throwable -> L31
            boolean r2 = com.kwad.framework.filedownloader.r.xK()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L50
            boolean r2 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L31
            r3 = 1
            if (r2 == 0) goto L33
            java.lang.String r2 = "Waiting for connecting with the downloader service... %d"
            com.kwad.framework.filedownloader.a r4 = r7.wR()     // Catch: java.lang.Throwable -> L31
            int r4 = r4.getId()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L31
            r5[r1] = r4     // Catch: java.lang.Throwable -> L31
            com.kwad.framework.filedownloader.f.d.c(r6, r2, r5)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r7 = move-exception
            goto L52
        L33:
            com.kwad.framework.filedownloader.n r1 = com.kwad.framework.filedownloader.n.xA()     // Catch: java.lang.Throwable -> L31
            android.content.Context r2 = com.kwad.framework.filedownloader.f.c.zz()     // Catch: java.lang.Throwable -> L31
            r1.aG(r2)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r6.amz     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.contains(r7)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L4e
            r7.free()     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r6.amz     // Catch: java.lang.Throwable -> L31
            r1.add(r7)     // Catch: java.lang.Throwable -> L31
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return r3
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            goto L54
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r7
        L54:
            r6.e(r7)
            return r1
    }

    @Override // com.kwad.framework.filedownloader.e
    public final void xk() {
            r7 = this;
            com.kwad.framework.filedownloader.r r0 = com.kwad.framework.filedownloader.r.xI()
            com.kwad.framework.filedownloader.w r0 = r0.xL()
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L14
            java.lang.String r1 = "The downloader service is connected."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.kwad.framework.filedownloader.f.d.c(r7, r1, r2)
        L14:
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r7.amz
            monitor-enter(r1)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r2 = r7.amz     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = r2.clone()     // Catch: java.lang.Throwable -> L64
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r3 = r7.amz     // Catch: java.lang.Throwable -> L64
            r3.clear()     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            int r4 = r0.xP()     // Catch: java.lang.Throwable -> L64
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L64
        L31:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L64
            com.kwad.framework.filedownloader.a$a r4 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r4     // Catch: java.lang.Throwable -> L64
            int r5 = r4.wT()     // Catch: java.lang.Throwable -> L64
            boolean r6 = r0.bA(r5)     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L66
            com.kwad.framework.filedownloader.a r4 = r4.wR()     // Catch: java.lang.Throwable -> L64
            com.kwad.framework.filedownloader.a$b r4 = r4.wA()     // Catch: java.lang.Throwable -> L64
            r4.wZ()     // Catch: java.lang.Throwable -> L64
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L64
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Throwable -> L64
            if (r4 != 0) goto L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L64
            r3.add(r4)     // Catch: java.lang.Throwable -> L64
            goto L31
        L64:
            r0 = move-exception
            goto L6f
        L66:
            r4.wX()     // Catch: java.lang.Throwable -> L64
            goto L31
        L6a:
            r0.q(r3)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            return
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r0
    }

    @Override // com.kwad.framework.filedownloader.e
    public final void xl() {
            r5 = this;
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r0 = r5.xm()
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r1 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.lost
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L67
            com.kwad.framework.filedownloader.r r0 = com.kwad.framework.filedownloader.r.xI()
            com.kwad.framework.filedownloader.w r0 = r0.xL()
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L2b
            java.lang.String r1 = "lost the connection to the file download service, and current active task size is %d"
            com.kwad.framework.filedownloader.h r4 = com.kwad.framework.filedownloader.h.xp()
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r3)
        L2b:
            com.kwad.framework.filedownloader.h r1 = com.kwad.framework.filedownloader.h.xp()
            int r1 = r1.size()
            if (r1 <= 0) goto L86
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r5.amz
            monitor-enter(r1)
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()     // Catch: java.lang.Throwable -> L57
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r3 = r5.amz     // Catch: java.lang.Throwable -> L57
            r2.p(r3)     // Catch: java.lang.Throwable -> L57
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r2 = r5.amz     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L57
        L47:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L57
            com.kwad.framework.filedownloader.a$a r3 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r3     // Catch: java.lang.Throwable -> L57
            r3.free()     // Catch: java.lang.Throwable -> L57
            goto L47
        L57:
            r0 = move-exception
            goto L65
        L59:
            r0.xO()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            com.kwad.framework.filedownloader.r r0 = com.kwad.framework.filedownloader.r.xI()
            r0.xJ()
            return
        L65:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r0
        L67:
            com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.xp()
            int r0 = r0.size()
            if (r0 <= 0) goto L86
            java.lang.String r0 = "file download service has be unbound but the size of active tasks are not empty %d "
            com.kwad.framework.filedownloader.h r1 = com.kwad.framework.filedownloader.h.xp()
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            com.kwad.framework.filedownloader.f.d.d(r5, r0, r3)
        L86:
            return
    }
}
