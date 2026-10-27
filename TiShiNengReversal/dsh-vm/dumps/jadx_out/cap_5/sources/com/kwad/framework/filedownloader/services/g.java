package com.kwad.framework.filedownloader.services;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class g implements com.kwad.framework.filedownloader.y {
    private final com.kwad.framework.filedownloader.services.h aps;

    g() {
            r2 = this;
            r2.<init>()
            com.kwad.framework.filedownloader.services.h r0 = new com.kwad.framework.filedownloader.services.h
            com.kwad.framework.filedownloader.download.b r1 = com.kwad.framework.filedownloader.download.b.yc()
            int r1 = r1.yf()
            r0.<init>(r1)
            r2.aps = r0
            return
    }

    private boolean cb(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.a r0 = zr()
            com.kwad.framework.filedownloader.d.c r2 = r0.bD(r2)
            boolean r2 = r1.a(r2)
            return r2
    }

    private static com.kwad.framework.filedownloader.b.a zr() {
            com.kwad.framework.filedownloader.download.b r0 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.b.a r0 = r0.ye()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.y
    public final boolean a(com.kwad.framework.filedownloader.d.c r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.kwad.framework.filedownloader.services.h r1 = r4.aps
            int r2 = r5.getId()
            boolean r1 = r1.cd(r2)
            byte r2 = r5.wJ()
            boolean r2 = com.kwad.framework.filedownloader.d.d.bY(r2)
            r3 = 1
            if (r2 == 0) goto L1d
            if (r1 == 0) goto L1c
            return r3
        L1c:
            return r0
        L1d:
            if (r1 == 0) goto L20
            return r3
        L20:
            int r1 = r5.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            byte r5 = r5.wJ()
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            r2[r3] = r5
            java.lang.String r5 = "%d status is[%s](not finish) & but not in the pool"
            com.kwad.framework.filedownloader.f.d.a(r4, r5, r2)
            return r0
    }

    public final synchronized void b(java.lang.String r19, java.lang.String r20, boolean r21, int r22, int r23, int r24, boolean r25, com.kwad.framework.filedownloader.d.b r26, boolean r27) {
            r18 = this;
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            monitor-enter(r18)
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L23
            r9 = 2
            r10 = 0
            r11 = 1
            if (r0 == 0) goto L26
            java.lang.String r0 = "request start the task with url(%s) path(%s) isDirectory(%B)"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L23
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23
            r2[r10] = r6     // Catch: java.lang.Throwable -> L23
            r2[r11] = r7     // Catch: java.lang.Throwable -> L23
            r2[r9] = r1     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.f.d.c(r5, r0, r2)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r0 = move-exception
            goto L1be
        L26:
            int r0 = com.kwad.framework.filedownloader.f.f.g(r19, r20, r21)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.b.a r12 = zr()     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.d.c r1 = r12.bD(r0)     // Catch: java.lang.Throwable -> L23
            r2 = 0
            if (r8 != 0) goto L6f
            if (r1 != 0) goto L6f
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.bF(r7)     // Catch: java.lang.Throwable -> L23
            int r1 = com.kwad.framework.filedownloader.f.f.g(r6, r1, r11)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.d.c r3 = r12.bD(r1)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L6d
            java.lang.String r4 = r3.getTargetFilePath()     // Catch: java.lang.Throwable -> L23
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L6d
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L66
            java.lang.String r4 = "task[%d] find model by dirCaseId[%d]"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L23
            r15[r10] = r13     // Catch: java.lang.Throwable -> L23
            r15[r11] = r14     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.f.d.c(r5, r4, r15)     // Catch: java.lang.Throwable -> L23
        L66:
            java.util.List r1 = r12.bE(r1)     // Catch: java.lang.Throwable -> L23
            r14 = r1
        L6b:
            r13 = r3
            goto L71
        L6d:
            r14 = r2
            goto L6b
        L6f:
            r13 = r1
            r14 = r2
        L71:
            boolean r1 = com.kwad.framework.filedownloader.f.c.a(r0, r13, r5, r11)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L8a
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L88
            java.lang.String r1 = "has already started download %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L23
            r2[r10] = r0     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r2)     // Catch: java.lang.Throwable -> L23
        L88:
            monitor-exit(r18)
            return
        L8a:
            if (r13 == 0) goto L94
            java.lang.String r1 = r13.getTargetFilePath()     // Catch: java.lang.Throwable -> L23
        L90:
            r15 = r25
            r4 = r1
            goto L99
        L94:
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.a(r7, r8, r2)     // Catch: java.lang.Throwable -> L23
            goto L90
        L99:
            boolean r1 = com.kwad.framework.filedownloader.f.c.a(r0, r4, r15, r11)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lb2
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lb0
            java.lang.String r1 = "has already completed downloading %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L23
            r2[r10] = r0     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r2)     // Catch: java.lang.Throwable -> L23
        Lb0:
            monitor-exit(r18)
            return
        Lb2:
            r1 = 0
            if (r13 == 0) goto Lbb
            long r16 = r13.yZ()     // Catch: java.lang.Throwable -> L23
            goto Lbd
        Lbb:
            r16 = r1
        Lbd:
            if (r13 == 0) goto Lc6
            java.lang.String r3 = r13.yr()     // Catch: java.lang.Throwable -> L23
        Lc3:
            r1 = r16
            goto Lcb
        Lc6:
            java.lang.String r3 = com.kwad.framework.filedownloader.f.f.bD(r4)     // Catch: java.lang.Throwable -> L23
            goto Lc3
        Lcb:
            boolean r1 = com.kwad.framework.filedownloader.f.c.a(r0, r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lee
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lec
            java.lang.String r1 = "there is an another task with the same target-file-path %d %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L23
            r3[r10] = r2     // Catch: java.lang.Throwable -> L23
            r3[r11] = r4     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r3)     // Catch: java.lang.Throwable -> L23
            if (r13 == 0) goto Lec
            r12.bG(r0)     // Catch: java.lang.Throwable -> L23
            r12.bF(r0)     // Catch: java.lang.Throwable -> L23
        Lec:
            monitor-exit(r18)
            return
        Lee:
            if (r13 == 0) goto L154
            byte r1 = r13.wJ()     // Catch: java.lang.Throwable -> L23
            r2 = -2
            if (r1 == r2) goto L111
            byte r1 = r13.wJ()     // Catch: java.lang.Throwable -> L23
            r2 = -1
            if (r1 == r2) goto L111
            byte r1 = r13.wJ()     // Catch: java.lang.Throwable -> L23
            if (r1 == r11) goto L111
            byte r1 = r13.wJ()     // Catch: java.lang.Throwable -> L23
            r2 = 6
            if (r1 == r2) goto L111
            byte r1 = r13.wJ()     // Catch: java.lang.Throwable -> L23
            if (r1 != r9) goto L154
        L111:
            int r1 = r13.getId()     // Catch: java.lang.Throwable -> L23
            if (r1 == r0) goto L146
            int r1 = r13.getId()     // Catch: java.lang.Throwable -> L23
            r12.bG(r1)     // Catch: java.lang.Throwable -> L23
            int r1 = r13.getId()     // Catch: java.lang.Throwable -> L23
            r12.bF(r1)     // Catch: java.lang.Throwable -> L23
            r13.setId(r0)     // Catch: java.lang.Throwable -> L23
            r13.d(r7, r8)     // Catch: java.lang.Throwable -> L23
            if (r14 == 0) goto L144
            java.util.Iterator r1 = r14.iterator()     // Catch: java.lang.Throwable -> L23
        L131:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L144
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.d.a r2 = (com.kwad.framework.filedownloader.d.a) r2     // Catch: java.lang.Throwable -> L23
            r2.setId(r0)     // Catch: java.lang.Throwable -> L23
            r12.a(r2)     // Catch: java.lang.Throwable -> L23
            goto L131
        L144:
            r10 = 1
            goto L173
        L146:
            java.lang.String r0 = r13.getUrl()     // Catch: java.lang.Throwable -> L23
            boolean r0 = android.text.TextUtils.equals(r6, r0)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L173
            r13.setUrl(r6)     // Catch: java.lang.Throwable -> L23
            goto L144
        L154:
            if (r13 != 0) goto L15b
            com.kwad.framework.filedownloader.d.c r13 = new com.kwad.framework.filedownloader.d.c     // Catch: java.lang.Throwable -> L23
            r13.<init>()     // Catch: java.lang.Throwable -> L23
        L15b:
            r13.setUrl(r6)     // Catch: java.lang.Throwable -> L23
            r13.d(r7, r8)     // Catch: java.lang.Throwable -> L23
            r13.setId(r0)     // Catch: java.lang.Throwable -> L23
            r0 = 0
            r13.Z(r0)     // Catch: java.lang.Throwable -> L23
            r13.ab(r0)     // Catch: java.lang.Throwable -> L23
            r13.d(r11)     // Catch: java.lang.Throwable -> L23
            r13.bW(r11)     // Catch: java.lang.Throwable -> L23
            goto L144
        L173:
            if (r10 == 0) goto L178
            r12.b(r13)     // Catch: java.lang.Throwable -> L23
        L178:
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = new com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a     // Catch: java.lang.Throwable -> L23
            r0.<init>()     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.e(r13)     // Catch: java.lang.Throwable -> L23
            r1 = r26
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.a(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.f(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r27)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$a r0 = r0.h(r1)     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r0 = r0.ys()     // Catch: java.lang.Throwable -> L23
            com.kwad.framework.filedownloader.services.h r1 = r5.aps     // Catch: java.lang.Throwable -> L23
            r1.a(r0)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r18)
            return
        L1be:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    public final synchronized boolean bQ(int r2) {
            r1 = this;
            monitor-enter(r1)
            com.kwad.framework.filedownloader.services.h r0 = r1.aps     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.bQ(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public final long bS(int r3) {
            r2 = this;
            com.kwad.framework.filedownloader.b.a r0 = zr()
            com.kwad.framework.filedownloader.d.c r3 = r0.bD(r3)
            if (r3 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            long r0 = r3.getTotal()
            return r0
    }

    public final boolean bw(int r5) {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r0
            java.lang.String r0 = "request pause the task %d"
            com.kwad.framework.filedownloader.f.d.c(r4, r0, r3)
        L13:
            com.kwad.framework.filedownloader.b.a r0 = zr()
            com.kwad.framework.filedownloader.d.c r0 = r0.bD(r5)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            r1 = -2
            r0.d(r1)
            com.kwad.framework.filedownloader.services.h r0 = r4.aps
            r0.cancel(r5)
            return r2
    }

    public final byte bx(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.a r0 = zr()
            com.kwad.framework.filedownloader.d.c r2 = r0.bD(r2)
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            byte r2 = r2.wJ()
            return r2
    }

    public final boolean by(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            java.lang.String r4 = "The task[%d] id is invalid, can't clear it."
            com.kwad.framework.filedownloader.f.d.d(r3, r4, r0)
            return r1
        L12:
            boolean r2 = r3.cb(r4)
            if (r2 == 0) goto L26
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            java.lang.String r4 = "The task[%d] is downloading, can't clear it."
            com.kwad.framework.filedownloader.f.d.d(r3, r4, r0)
            return r1
        L26:
            com.kwad.framework.filedownloader.b.a r1 = zr()
            r1.bG(r4)
            r1.bF(r4)
            return r0
    }

    public final long cc(int r7) {
            r6 = this;
            com.kwad.framework.filedownloader.b.a r0 = zr()
            com.kwad.framework.filedownloader.d.c r1 = r0.bD(r7)
            r2 = 0
            if (r1 != 0) goto Ld
            return r2
        Ld:
            int r4 = r1.zc()
            r5 = 1
            if (r4 > r5) goto L19
            long r0 = r1.yZ()
            return r0
        L19:
            java.util.List r7 = r0.bE(r7)
            if (r7 == 0) goto L2b
            int r0 = r7.size()
            if (r0 == r4) goto L26
            goto L2b
        L26:
            long r0 = com.kwad.framework.filedownloader.d.a.s(r7)
            return r0
        L2b:
            return r2
    }

    public final boolean isIdle() {
            r1 = this;
            com.kwad.framework.filedownloader.services.h r0 = r1.aps
            int r0 = r0.zu()
            if (r0 > 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.y
    public final int o(java.lang.String r2, int r3) {
            r1 = this;
            com.kwad.framework.filedownloader.services.h r0 = r1.aps
            int r2 = r0.o(r2, r3)
            return r2
    }

    public final void yJ() {
            r1 = this;
            com.kwad.framework.filedownloader.b.a r0 = zr()
            r0.clear()
            return
    }

    public final boolean z(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.kwad.framework.filedownloader.f.f.B(r1, r2)
            boolean r1 = r0.cb(r1)
            return r1
    }

    public final void zs() {
            r4 = this;
            com.kwad.framework.filedownloader.services.h r0 = r4.aps
            java.util.List r0 = r0.zv()
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L1d
            int r1 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "pause all tasks %d"
            com.kwad.framework.filedownloader.f.d.c(r4, r1, r2)
        L1d:
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.bw(r1)
            goto L21
        L35:
            return
    }
}
