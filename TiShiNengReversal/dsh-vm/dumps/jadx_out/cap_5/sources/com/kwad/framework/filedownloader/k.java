package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class k implements com.kwad.framework.filedownloader.t {
    private com.kwad.framework.filedownloader.a.InterfaceC0110a ame;
    private com.kwad.framework.filedownloader.a.c amf;
    private java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> amg;
    private boolean amh;

    k(com.kwad.framework.filedownloader.a.InterfaceC0110a r2, com.kwad.framework.filedownloader.a.c r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.amh = r0
            r1.a(r2, r3)
            return
    }

    private void a(com.kwad.framework.filedownloader.a.InterfaceC0110a r1, com.kwad.framework.filedownloader.a.c r2) {
            r0 = this;
            r0.ame = r1
            r0.amf = r2
            java.util.concurrent.LinkedBlockingQueue r1 = new java.util.concurrent.LinkedBlockingQueue
            r1.<init>()
            r0.amg = r1
            return
    }

    private void bv(int r5) {
            r4 = this;
            boolean r5 = com.kwad.framework.filedownloader.d.d.bY(r5)
            if (r5 == 0) goto L47
            java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> r5 = r4.amg
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L44
            java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> r5 = r4.amg
            java.lang.Object r5 = r5.peek()
            com.kwad.framework.filedownloader.message.MessageSnapshot r5 = (com.kwad.framework.filedownloader.message.MessageSnapshot) r5
            int r0 = r5.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> r1 = r4.amg
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            byte r5 = r5.wJ()
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r0
            r0 = 2
            r2[r0] = r1
            r0 = 3
            r2[r0] = r5
            java.lang.String r5 = "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]"
            com.kwad.framework.filedownloader.f.d.d(r4, r5, r2)
        L44:
            r5 = 0
            r4.ame = r5
        L47:
            return
    }

    private void o(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "notify completed %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r0, r1)
        L11:
            com.kwad.framework.filedownloader.a$c r0 = r3.amf
            r0.xa()
            r3.p(r4)
            return
    }

    private void p(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            if (r0 != 0) goto L27
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L26
            int r0 = r4.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            byte r4 = r4.wJ()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])"
            com.kwad.framework.filedownloader.f.d.c(r3, r4, r1)
        L26:
            return
        L27:
            boolean r1 = r3.amh
            if (r1 != 0) goto L43
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            com.kwad.framework.filedownloader.i r0 = r0.wG()
            if (r0 != 0) goto L36
            goto L43
        L36:
            java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> r0 = r3.amg
            r0.offer(r4)
            com.kwad.framework.filedownloader.j r4 = com.kwad.framework.filedownloader.j.xr()
            r4.a(r3)
            return
        L43:
            boolean r0 = com.kwad.framework.filedownloader.l.isValid()
            if (r0 != 0) goto L51
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            boolean r0 = r0.wY()
            if (r0 == 0) goto L5d
        L51:
            byte r0 = r4.wJ()
            r1 = 4
            if (r0 != r1) goto L5d
            com.kwad.framework.filedownloader.a$c r0 = r3.amf
            r0.xa()
        L5d:
            byte r4 = r4.wJ()
            r3.bv(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void b(com.kwad.framework.filedownloader.a.InterfaceC0110a r3, com.kwad.framework.filedownloader.a.c r4) {
            r2 = this;
            com.kwad.framework.filedownloader.a$a r0 = r2.ame
            if (r0 != 0) goto L8
            r2.a(r3, r4)
            return
        L8:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "the messenger is working, can't re-appointment for %s"
            java.lang.String r3 = com.kwad.framework.filedownloader.f.f.c(r3, r0)
            r4.<init>(r3)
            throw r4
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void f(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "notify pending %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r0, r1)
        L11:
            r3.p(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void g(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "notify started %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r0, r1)
        L11:
            r3.p(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void h(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "notify connected %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r0, r1)
        L11:
            r3.p(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void i(com.kwad.framework.filedownloader.message.MessageSnapshot r7) {
            r6 = this;
            com.kwad.framework.filedownloader.a$a r0 = r6.ame
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            long r4 = r0.wH()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            long r4 = r0.wI()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r0
            r5[r2] = r1
            r1 = 2
            r5[r1] = r4
            java.lang.String r1 = "notify progress %s %d %d"
            com.kwad.framework.filedownloader.f.d.c(r6, r1, r5)
        L2b:
            int r0 = r0.wD()
            if (r0 > 0) goto L41
            boolean r7 = com.kwad.framework.filedownloader.f.d.apD
            if (r7 == 0) goto L40
            com.kwad.framework.filedownloader.a$a r7 = r6.ame
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r7
            java.lang.String r7 = "notify progress but client not request notify %s"
            com.kwad.framework.filedownloader.f.d.c(r6, r7, r0)
        L40:
            return
        L41:
            r6.p(r7)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void j(com.kwad.framework.filedownloader.message.MessageSnapshot r5) {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L1c
            com.kwad.framework.filedownloader.a$a r0 = r4.ame
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "notify block completed %s %s"
            com.kwad.framework.filedownloader.f.d.c(r4, r0, r2)
        L1c:
            r4.p(r5)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void k(com.kwad.framework.filedownloader.message.MessageSnapshot r7) {
            r6 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L34
            com.kwad.framework.filedownloader.a$a r0 = r6.ame
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            com.kwad.framework.filedownloader.a$a r1 = r6.ame
            int r2 = r0.wM()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r0.wN()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Throwable r0 = r0.wL()
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            r1 = 3
            r4[r1] = r0
            java.lang.String r0 = "notify retry %s %d %d %s"
            com.kwad.framework.filedownloader.f.d.c(r6, r0, r4)
        L34:
            r6.p(r7)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void l(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "notify warn %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r0, r1)
        L11:
            com.kwad.framework.filedownloader.a$c r0 = r3.amf
            r0.xa()
            r3.p(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void m(com.kwad.framework.filedownloader.message.MessageSnapshot r5) {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L1c
            com.kwad.framework.filedownloader.a$a r0 = r4.ame
            com.kwad.framework.filedownloader.a r1 = r0.wR()
            java.lang.Throwable r1 = r1.wL()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "notify error %s %s"
            com.kwad.framework.filedownloader.f.d.c(r4, r0, r2)
        L1c:
            com.kwad.framework.filedownloader.a$c r0 = r4.amf
            r0.xa()
            r4.p(r5)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void n(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.a$a r0 = r3.ame
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "notify paused %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r0, r1)
        L11:
            com.kwad.framework.filedownloader.a$c r0 = r3.amf
            r0.xa()
            r3.p(r4)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            com.kwad.framework.filedownloader.a$a r0 = r4.ame
            if (r0 != 0) goto L6
            r0 = -1
            goto Le
        L6:
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            int r0 = r0.getId()
        Le:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = super.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "%d:%s"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r2)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.t
    public final boolean xu() {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.a$a r0 = r4.ame
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r0
            java.lang.String r0 = "notify begin %s"
            com.kwad.framework.filedownloader.f.d.c(r4, r0, r3)
        L11:
            com.kwad.framework.filedownloader.a$a r0 = r4.ame
            if (r0 != 0) goto L29
            java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> r0 = r4.amg
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "can't begin the task, the holder fo the messenger is nil, %d"
            com.kwad.framework.filedownloader.f.d.d(r4, r0, r2)
            return r1
        L29:
            com.kwad.framework.filedownloader.a$c r0 = r4.amf
            r0.onBegin()
            return r2
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void xv() {
            r9 = this;
            boolean r0 = r9.amh
            if (r0 == 0) goto L5
            goto L65
        L5:
            java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> r0 = r9.amg
            java.lang.Object r0 = r0.poll()
            com.kwad.framework.filedownloader.message.MessageSnapshot r0 = (com.kwad.framework.filedownloader.message.MessageSnapshot) r0
            byte r1 = r0.wJ()
            com.kwad.framework.filedownloader.a$a r2 = r9.ame
            if (r2 != 0) goto L16
            goto L65
        L16:
            com.kwad.framework.filedownloader.a r4 = r2.wR()
            com.kwad.framework.filedownloader.i r3 = r4.wG()
            com.kwad.framework.filedownloader.x$a r2 = r2.wS()
            r9.bv(r1)
            if (r3 != 0) goto L28
            goto L65
        L28:
            r5 = 4
            if (r1 != r5) goto L41
            r3.b(r4)     // Catch: java.lang.Throwable -> L38
            com.kwad.framework.filedownloader.message.a r0 = (com.kwad.framework.filedownloader.message.a) r0     // Catch: java.lang.Throwable -> L38
            com.kwad.framework.filedownloader.message.MessageSnapshot r0 = r0.yL()     // Catch: java.lang.Throwable -> L38
            r9.o(r0)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r0 = move-exception
            com.kwad.framework.filedownloader.message.MessageSnapshot r0 = r2.g(r0)
            r9.m(r0)
            return
        L41:
            boolean r2 = r3 instanceof com.kwad.framework.filedownloader.g
            if (r2 == 0) goto L49
            r2 = r3
            com.kwad.framework.filedownloader.g r2 = (com.kwad.framework.filedownloader.g) r2
            goto L4a
        L49:
            r2 = 0
        L4a:
            r5 = -4
            if (r1 == r5) goto Le8
            r5 = -3
            if (r1 == r5) goto Le4
            r5 = -2
            if (r1 == r5) goto Lcf
            r5 = -1
            if (r1 == r5) goto Lc7
            r5 = 1
            if (r1 == r5) goto Lb2
            r5 = 2
            if (r1 == r5) goto L92
            r5 = 3
            if (r1 == r5) goto L80
            r5 = 5
            if (r1 == r5) goto L6a
            r0 = 6
            if (r1 == r0) goto L66
        L65:
            return
        L66:
            r3.a(r4)
            return
        L6a:
            if (r2 == 0) goto L76
            r0.yR()
            r0.wN()
            r0.yQ()
            return
        L76:
            r0.yR()
            r0.wN()
            r0.yM()
            return
        L80:
            if (r2 == 0) goto L86
            r0.yQ()
            return
        L86:
            int r0 = r0.yM()
            int r1 = r4.getSmallFileTotalBytes()
            r3.b(r4, r0, r1)
            return
        L92:
            if (r2 == 0) goto L9e
            r0.getEtag()
            r0.yE()
            r0.yO()
            return
        L9e:
            java.lang.String r5 = r0.getEtag()
            boolean r6 = r0.yE()
            int r7 = r4.getSmallFileSoFarBytes()
            int r8 = r0.yN()
            r3.a(r4, r5, r6, r7, r8)
            return
        Lb2:
            if (r2 == 0) goto Lbb
            r0.yQ()
            r0.yO()
            return
        Lbb:
            int r1 = r0.yM()
            int r0 = r0.yN()
            r3.a(r4, r1, r0)
            return
        Lc7:
            java.lang.Throwable r0 = r0.yR()
            r3.a(r4, r0)
            return
        Lcf:
            if (r2 == 0) goto Ld8
            r0.yQ()
            r0.yO()
            return
        Ld8:
            int r1 = r0.yM()
            int r0 = r0.yN()
            r3.c(r4, r1, r0)
            return
        Le4:
            r3.c(r4)
            return
        Le8:
            r3.d(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.t
    public final boolean xw() {
            r1 = this;
            com.kwad.framework.filedownloader.a$a r0 = r1.ame
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            boolean r0 = r0.wO()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.t
    public final boolean xx() {
            r2 = this;
            java.util.Queue<com.kwad.framework.filedownloader.message.MessageSnapshot> r0 = r2.amg
            java.lang.Object r0 = r0.peek()
            com.kwad.framework.filedownloader.message.MessageSnapshot r0 = (com.kwad.framework.filedownloader.message.MessageSnapshot) r0
            byte r0 = r0.wJ()
            r1 = 4
            if (r0 != r1) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void xy() {
            r1 = this;
            r0 = 1
            r1.amh = r0
            return
    }
}
