package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.framework.filedownloader.a.c, com.kwad.framework.filedownloader.x, com.kwad.framework.filedownloader.x.a, com.kwad.framework.filedownloader.x.b {
    private com.kwad.framework.filedownloader.t alD;
    private final com.kwad.framework.filedownloader.d.a alE;
    private volatile byte alF;
    private volatile long alG;
    private java.lang.Throwable alH;
    private final com.kwad.framework.filedownloader.s.b alI;
    private final com.kwad.framework.filedownloader.s.a alJ;
    private long alK;
    private long alL;
    private int alM;
    private boolean alN;
    private boolean alO;
    private java.lang.String alP;
    private boolean alQ;
    private final java.lang.Object alz;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        void setFileName(java.lang.String r1);

        com.kwad.framework.filedownloader.d.b xe();

        com.kwad.framework.filedownloader.a.InterfaceC0110a xf();

        java.util.ArrayList<java.lang.Object> xg();
    }

    d(com.kwad.framework.filedownloader.d.a r3, java.lang.Object r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.alF = r0
            r1 = 0
            r2.alH = r1
            r2.alQ = r0
            r2.alz = r4
            r2.alE = r3
            com.kwad.framework.filedownloader.b r4 = new com.kwad.framework.filedownloader.b
            r4.<init>()
            r2.alI = r4
            r2.alJ = r4
            com.kwad.framework.filedownloader.k r4 = new com.kwad.framework.filedownloader.k
            com.kwad.framework.filedownloader.a$a r3 = r3.xf()
            r4.<init>(r3, r2)
            r2.alD = r4
            return
    }

    private void b(byte r3) {
            r2 = this;
            r2.alF = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.alG = r0
            return
    }

    private void e(com.kwad.framework.filedownloader.message.MessageSnapshot r9) {
            r8 = this;
            com.kwad.framework.filedownloader.d$a r0 = r8.alE
            com.kwad.framework.filedownloader.a$a r0 = r0.xf()
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            byte r1 = r9.wJ()
            r8.b(r1)
            boolean r2 = r9.wP()
            r8.alN = r2
            r2 = -4
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r2) goto Lf4
            r2 = -3
            if (r1 == r2) goto Ld4
            r2 = -1
            if (r1 == r2) goto Lba
            if (r1 == r5) goto La8
            if (r1 == r4) goto L69
            r0 = 3
            if (r1 == r0) goto L54
            r0 = 5
            if (r1 == r0) goto L37
            r0 = 6
            if (r1 == r0) goto L31
            return
        L31:
            com.kwad.framework.filedownloader.t r0 = r8.alD
            r0.g(r9)
            return
        L37:
            long r0 = r9.yQ()
            r8.alK = r0
            java.lang.Throwable r0 = r9.yR()
            r8.alH = r0
            int r0 = r9.wN()
            r8.alM = r0
            com.kwad.framework.filedownloader.s$b r0 = r8.alI
            r0.reset()
            com.kwad.framework.filedownloader.t r0 = r8.alD
            r0.k(r9)
            return
        L54:
            long r0 = r9.yQ()
            r8.alK = r0
            com.kwad.framework.filedownloader.s$b r0 = r8.alI
            long r1 = r9.yQ()
            r0.U(r1)
            com.kwad.framework.filedownloader.t r0 = r8.alD
            r0.i(r9)
            return
        L69:
            long r1 = r9.yO()
            r8.alL = r1
            boolean r1 = r9.yE()
            r8.alO = r1
            java.lang.String r1 = r9.getEtag()
            r8.alP = r1
            java.lang.String r1 = r9.getFileName()
            if (r1 == 0) goto L9b
            java.lang.String r2 = r0.getFilename()
            if (r2 == 0) goto L96
            java.lang.String r0 = r0.getFilename()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            r2[r5] = r1
            java.lang.String r0 = "already has mFilename[%s], but assign mFilename[%s] again"
            com.kwad.framework.filedownloader.f.d.d(r8, r0, r2)
        L96:
            com.kwad.framework.filedownloader.d$a r0 = r8.alE
            r0.setFileName(r1)
        L9b:
            com.kwad.framework.filedownloader.s$b r0 = r8.alI
            long r1 = r8.alK
            r0.start(r1)
            com.kwad.framework.filedownloader.t r0 = r8.alD
            r0.h(r9)
            return
        La8:
            long r0 = r9.yQ()
            r8.alK = r0
            long r0 = r9.yO()
            r8.alL = r0
            com.kwad.framework.filedownloader.t r0 = r8.alD
            r0.f(r9)
            return
        Lba:
            java.lang.Throwable r0 = r9.yR()
            r8.alH = r0
            long r0 = r9.yQ()
            r8.alK = r0
            com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.xp()
            com.kwad.framework.filedownloader.d$a r1 = r8.alE
            com.kwad.framework.filedownloader.a$a r1 = r1.xf()
            r0.a(r1, r9)
            return
        Ld4:
            boolean r0 = r9.yP()
            r8.alQ = r0
            long r0 = r9.yO()
            r8.alK = r0
            long r0 = r9.yO()
            r8.alL = r0
            com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.xp()
            com.kwad.framework.filedownloader.d$a r1 = r8.alE
            com.kwad.framework.filedownloader.a$a r1 = r1.xf()
            r0.a(r1, r9)
            return
        Lf4:
            com.kwad.framework.filedownloader.s$b r1 = r8.alI
            r1.reset()
            com.kwad.framework.filedownloader.h r1 = com.kwad.framework.filedownloader.h.xp()
            int r2 = r0.getId()
            int r1 = r1.bs(r2)
            if (r1 > r5) goto L122
            boolean r2 = r0.wF()
            if (r2 == 0) goto L122
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()
            java.lang.String r6 = r0.getUrl()
            java.lang.String r7 = r0.getTargetFilePath()
            int r6 = com.kwad.framework.filedownloader.f.f.B(r6, r7)
            int r2 = r2.bs(r6)
            goto L123
        L122:
            r2 = 0
        L123:
            int r1 = r1 + r2
            if (r1 > r5) goto L16f
            com.kwad.framework.filedownloader.n r1 = com.kwad.framework.filedownloader.n.xA()
            int r2 = r0.getId()
            byte r1 = r1.bx(r2)
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            r4[r5] = r2
            java.lang.String r0 = "warn, but no mListener to receive, switch to pending %d %d"
            com.kwad.framework.filedownloader.f.d.d(r8, r0, r4)
            boolean r0 = com.kwad.framework.filedownloader.d.d.bZ(r1)
            if (r0 == 0) goto L16f
            r8.b(r5)
            long r0 = r9.yO()
            r8.alL = r0
            long r0 = r9.yQ()
            r8.alK = r0
            com.kwad.framework.filedownloader.s$b r2 = r8.alI
            r2.start(r0)
            com.kwad.framework.filedownloader.t r0 = r8.alD
            com.kwad.framework.filedownloader.message.MessageSnapshot$a r9 = (com.kwad.framework.filedownloader.message.MessageSnapshot.a) r9
            com.kwad.framework.filedownloader.message.MessageSnapshot r9 = r9.yS()
            r0.f(r9)
            return
        L16f:
            com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.xp()
            com.kwad.framework.filedownloader.d$a r1 = r8.alE
            com.kwad.framework.filedownloader.a$a r1 = r1.xf()
            r0.a(r1, r9)
            return
    }

    private int getId() {
            r1 = this;
            com.kwad.framework.filedownloader.d$a r0 = r1.alE
            com.kwad.framework.filedownloader.a$a r0 = r0.xf()
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            int r0 = r0.getId()
            return r0
    }

    private void prepare() {
            r5 = this;
            com.kwad.framework.filedownloader.d$a r0 = r5.alE
            com.kwad.framework.filedownloader.a$a r0 = r0.xf()
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            java.lang.String r1 = r0.getPath()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2e
            java.lang.String r1 = r0.getUrl()
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.bB(r1)
            r0.bk(r1)
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L2e
            java.lang.String r1 = r0.getPath()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            java.lang.String r1 = "save Path is null to %s"
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r4)
        L2e:
            boolean r1 = r0.wF()
            if (r1 == 0) goto L3e
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            goto L4e
        L3e:
            java.lang.String r1 = r0.getPath()
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.bF(r1)
            if (r1 == 0) goto L76
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r1 = r0
        L4e:
            boolean r0 = r1.exists()
            if (r0 != 0) goto L75
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L75
            boolean r0 = r1.exists()
            if (r0 == 0) goto L61
            goto L75
        L61:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r1 = "Create parent directory failed, please make sure you have permission to create file or directory on the path: %s"
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.c(r1, r3)
            r0.<init>(r1)
            throw r0
        L75:
            return
        L76:
            java.security.InvalidParameterException r1 = new java.security.InvalidParameterException
            java.lang.String r0 = r0.getPath()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = "the provided mPath[%s] is invalid, can't find its directory"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r3)
            r1.<init>(r0)
            throw r1
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean a(com.kwad.framework.filedownloader.message.MessageSnapshot r6) {
            r5 = this;
            byte r0 = r5.wJ()
            byte r1 = r6.wJ()
            boolean r0 = com.kwad.framework.filedownloader.d.d.u(r0, r1)
            r1 = 1
            if (r0 != 0) goto L3a
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD
            r0 = 0
            if (r6 == 0) goto L39
            byte r6 = r5.alF
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            byte r2 = r5.wJ()
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            int r3 = r5.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r6
            r4[r1] = r2
            r6 = 2
            r4[r6] = r3
            java.lang.String r6 = "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d"
            com.kwad.framework.filedownloader.f.d.c(r5, r6, r4)
        L39:
            return r0
        L3a:
            r5.e(r6)
            return r1
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean b(com.kwad.framework.filedownloader.message.MessageSnapshot r6) {
            r5 = this;
            byte r0 = r5.wJ()
            byte r1 = r6.wJ()
            r2 = -2
            r3 = 0
            r4 = 1
            if (r2 != r0) goto L29
            boolean r2 = com.kwad.framework.filedownloader.d.d.bZ(r1)
            if (r2 == 0) goto L29
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD
            if (r6 == 0) goto L28
            int r6 = r5.getId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r6
            java.lang.String r6 = "High concurrent cause, callback pending, but has already be paused %d"
            com.kwad.framework.filedownloader.f.d.c(r5, r6, r0)
        L28:
            return r4
        L29:
            boolean r0 = com.kwad.framework.filedownloader.d.d.v(r0, r1)
            if (r0 != 0) goto L59
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD
            if (r6 == 0) goto L58
            byte r6 = r5.alF
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            byte r0 = r5.wJ()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            int r1 = r5.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r6
            r2[r4] = r0
            r6 = 2
            r2[r6] = r1
            java.lang.String r6 = "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d"
            com.kwad.framework.filedownloader.f.d.c(r5, r6, r2)
        L58:
            return r3
        L59:
            r5.e(r6)
            return r4
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean c(com.kwad.framework.filedownloader.message.MessageSnapshot r2) {
            r1 = this;
            com.kwad.framework.filedownloader.d$a r0 = r1.alE
            com.kwad.framework.filedownloader.a$a r0 = r0.xf()
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            boolean r0 = com.kwad.framework.filedownloader.d.d.f(r0)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            r1.e(r2)
            r2 = 1
            return r2
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean d(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            r3 = this;
            com.kwad.framework.filedownloader.d$a r0 = r3.alE
            com.kwad.framework.filedownloader.a$a r0 = r0.xf()
            com.kwad.framework.filedownloader.a r0 = r0.wR()
            boolean r0 = r0.wF()
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            byte r0 = r4.wJ()
            r2 = -4
            if (r0 != r2) goto L26
            byte r0 = r3.wJ()
            r2 = 2
            if (r0 == r2) goto L21
            goto L26
        L21:
            r3.e(r4)
            r4 = 1
            return r4
        L26:
            return r1
    }

    @Override // com.kwad.framework.filedownloader.x
    public final void free() {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r4.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            byte r2 = r4.alF
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r0
            r0 = 1
            r3[r0] = r2
            java.lang.String r0 = "free the task %d, when the status is %d"
            com.kwad.framework.filedownloader.f.d.c(r4, r0, r3)
        L20:
            r4.b(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final com.kwad.framework.filedownloader.message.MessageSnapshot g(java.lang.Throwable r4) {
            r3 = this;
            r0 = -1
            r3.b(r0)
            r3.alH = r4
            int r0 = r3.getId()
            long r1 = r3.xj()
            com.kwad.framework.filedownloader.message.MessageSnapshot r4 = com.kwad.framework.filedownloader.message.f.a(r0, r1, r4)
            return r4
    }

    @Override // com.kwad.framework.filedownloader.s.a
    public final int getSpeed() {
            r1 = this;
            com.kwad.framework.filedownloader.s$a r0 = r1.alJ
            int r0 = r0.getSpeed()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.x
    public final long getStatusUpdateTime() {
            r2 = this;
            long r0 = r2.alG
            return r0
    }

    @Override // com.kwad.framework.filedownloader.x
    public final long getTotalBytes() {
            r2 = this;
            long r0 = r2.alL
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.c
    public final void onBegin() {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L1e
            java.lang.String r0 = r4.toString()
            byte r1 = r4.wJ()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "filedownloader:lifecycle:start %s by %d "
            com.kwad.framework.filedownloader.f.d.e(r4, r0, r2)
        L1e:
            return
    }

    @Override // com.kwad.framework.filedownloader.x
    public final boolean pause() {
            r6 = this;
            byte r0 = r6.wJ()
            boolean r0 = com.kwad.framework.filedownloader.d.d.bY(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L37
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L36
            byte r0 = r6.wJ()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            com.kwad.framework.filedownloader.d$a r3 = r6.alE
            com.kwad.framework.filedownloader.a$a r3 = r3.xf()
            com.kwad.framework.filedownloader.a r3 = r3.wR()
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r0
            r4[r1] = r3
            java.lang.String r0 = "High concurrent cause, Already is over, can't pause again, %d %d"
            com.kwad.framework.filedownloader.f.d.c(r6, r0, r4)
        L36:
            return r2
        L37:
            r0 = -2
            r6.b(r0)
            com.kwad.framework.filedownloader.d$a r0 = r6.alE
            com.kwad.framework.filedownloader.a$a r0 = r0.xf()
            com.kwad.framework.filedownloader.a r3 = r0.wR()
            com.kwad.framework.filedownloader.q r4 = com.kwad.framework.filedownloader.q.xG()
            r4.b(r6)
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L61
            int r4 = r6.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r4
            java.lang.String r4 = "the task[%d] has been expired from the launch pool."
            com.kwad.framework.filedownloader.f.d.e(r6, r4, r5)
        L61:
            com.kwad.framework.filedownloader.r.xI()
            boolean r4 = com.kwad.framework.filedownloader.r.xK()
            if (r4 != 0) goto L80
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L8b
            int r4 = r3.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r4
            java.lang.String r2 = "request pause the task[%d] to the download service, but the download service isn't connected yet."
            com.kwad.framework.filedownloader.f.d.c(r6, r2, r5)
            goto L8b
        L80:
            com.kwad.framework.filedownloader.n r2 = com.kwad.framework.filedownloader.n.xA()
            int r4 = r3.getId()
            r2.bw(r4)
        L8b:
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()
            r2.b(r0)
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()
            com.kwad.framework.filedownloader.message.MessageSnapshot r3 = com.kwad.framework.filedownloader.message.f.e(r3)
            r2.a(r0, r3)
            com.kwad.framework.filedownloader.r r2 = com.kwad.framework.filedownloader.r.xI()
            com.kwad.framework.filedownloader.v r2 = r2.xM()
            r2.e(r0)
            return r1
    }

    @Override // com.kwad.framework.filedownloader.x
    public final void reset() {
            r3 = this;
            r0 = 0
            r3.alH = r0
            r3.alP = r0
            r0 = 0
            r3.alO = r0
            r3.alM = r0
            r3.alQ = r0
            r3.alN = r0
            r1 = 0
            r3.alK = r1
            r3.alL = r1
            com.kwad.framework.filedownloader.s$b r1 = r3.alI
            r1.reset()
            byte r1 = r3.alF
            boolean r1 = com.kwad.framework.filedownloader.d.d.bY(r1)
            if (r1 == 0) goto L34
            com.kwad.framework.filedownloader.t r1 = r3.alD
            r1.xy()
            com.kwad.framework.filedownloader.k r1 = new com.kwad.framework.filedownloader.k
            com.kwad.framework.filedownloader.d$a r2 = r3.alE
            com.kwad.framework.filedownloader.a$a r2 = r2.xf()
            r1.<init>(r2, r3)
            r3.alD = r1
            goto L3f
        L34:
            com.kwad.framework.filedownloader.t r1 = r3.alD
            com.kwad.framework.filedownloader.d$a r2 = r3.alE
            com.kwad.framework.filedownloader.a$a r2 = r2.xf()
            r1.b(r2, r3)
        L3f:
            r3.b(r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.x.b
    public final void start() {
            r18 = this;
            r1 = r18
            byte r0 = r1.alF
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 10
            if (r0 == r5) goto L25
            java.lang.String r0 = "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d"
            int r5 = r1.getId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            byte r6 = r1.alF
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r5
            r2[r4] = r6
            com.kwad.framework.filedownloader.f.d.d(r1, r0, r2)
            return
        L25:
            com.kwad.framework.filedownloader.d$a r0 = r1.alE
            com.kwad.framework.filedownloader.a$a r6 = r0.xf()
            com.kwad.framework.filedownloader.a r0 = r6.wR()
            com.kwad.framework.filedownloader.r r7 = com.kwad.framework.filedownloader.r.xI()
            com.kwad.framework.filedownloader.v r7 = r7.xM()
            boolean r8 = r7.f(r6)     // Catch: java.lang.Throwable -> Ld7
            if (r8 == 0) goto L3f
            goto L107
        L3f:
            java.lang.Object r8 = r1.alz     // Catch: java.lang.Throwable -> Ld7
            monitor-enter(r8)     // Catch: java.lang.Throwable -> Ld7
            byte r9 = r1.alF     // Catch: java.lang.Throwable -> L61
            if (r9 == r5) goto L64
            java.lang.String r0 = "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d"
            int r5 = r1.getId()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L61
            byte r7 = r1.alF     // Catch: java.lang.Throwable -> L61
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L61
            r2[r3] = r5     // Catch: java.lang.Throwable -> L61
            r2[r4] = r7     // Catch: java.lang.Throwable -> L61
            com.kwad.framework.filedownloader.f.d.d(r1, r0, r2)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            return
        L61:
            r0 = move-exception
            goto L10c
        L64:
            r2 = 11
            r1.b(r2)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()     // Catch: java.lang.Throwable -> Ld7
            r2.b(r6)     // Catch: java.lang.Throwable -> Ld7
            int r2 = r0.getId()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r5 = r0.getTargetFilePath()     // Catch: java.lang.Throwable -> Ld7
            boolean r8 = r0.wK()     // Catch: java.lang.Throwable -> Ld7
            boolean r2 = com.kwad.framework.filedownloader.f.c.a(r2, r5, r8, r4)     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto L85
            goto L107
        L85:
            com.kwad.framework.filedownloader.n r8 = com.kwad.framework.filedownloader.n.xA()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r9 = r0.getUrl()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r10 = r0.getPath()     // Catch: java.lang.Throwable -> Ld7
            boolean r11 = r0.wF()     // Catch: java.lang.Throwable -> Ld7
            int r12 = r0.wD()     // Catch: java.lang.Throwable -> Ld7
            int r13 = r0.wE()     // Catch: java.lang.Throwable -> Ld7
            int r14 = r0.wM()     // Catch: java.lang.Throwable -> Ld7
            boolean r15 = r0.wK()     // Catch: java.lang.Throwable -> Ld7
            com.kwad.framework.filedownloader.d$a r2 = r1.alE     // Catch: java.lang.Throwable -> Ld7
            com.kwad.framework.filedownloader.d.b r16 = r2.xe()     // Catch: java.lang.Throwable -> Ld7
            boolean r17 = r0.wQ()     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Ld7
            byte r2 = r1.alF     // Catch: java.lang.Throwable -> Ld7
            r5 = -2
            if (r2 != r5) goto Ld9
            java.lang.String r2 = "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied"
            int r5 = r1.getId()     // Catch: java.lang.Throwable -> Ld7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Ld7
            r4[r3] = r5     // Catch: java.lang.Throwable -> Ld7
            com.kwad.framework.filedownloader.f.d.d(r1, r2, r4)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L107
            com.kwad.framework.filedownloader.n r0 = com.kwad.framework.filedownloader.n.xA()     // Catch: java.lang.Throwable -> Ld7
            int r2 = r1.getId()     // Catch: java.lang.Throwable -> Ld7
            r0.bw(r2)     // Catch: java.lang.Throwable -> Ld7
            return
        Ld7:
            r0 = move-exception
            goto L10e
        Ld9:
            if (r0 != 0) goto L108
            boolean r0 = r7.f(r6)     // Catch: java.lang.Throwable -> Ld7
            if (r0 != 0) goto L107
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld7
            com.kwad.framework.filedownloader.message.MessageSnapshot r0 = r1.g(r0)     // Catch: java.lang.Throwable -> Ld7
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()     // Catch: java.lang.Throwable -> Ld7
            boolean r2 = r2.a(r6)     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto L100
            r7.e(r6)     // Catch: java.lang.Throwable -> Ld7
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()     // Catch: java.lang.Throwable -> Ld7
            r2.b(r6)     // Catch: java.lang.Throwable -> Ld7
        L100:
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()     // Catch: java.lang.Throwable -> Ld7
            r2.a(r6, r0)     // Catch: java.lang.Throwable -> Ld7
        L107:
            return
        L108:
            r7.e(r6)     // Catch: java.lang.Throwable -> Ld7
            return
        L10c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> Ld7
        L10e:
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()
            com.kwad.framework.filedownloader.message.MessageSnapshot r0 = r1.g(r0)
            r2.a(r6, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.x
    public final byte wJ() {
            r1 = this;
            byte r0 = r1.alF
            return r0
    }

    @Override // com.kwad.framework.filedownloader.x
    public final java.lang.Throwable wL() {
            r1 = this;
            java.lang.Throwable r0 = r1.alH
            return r0
    }

    @Override // com.kwad.framework.filedownloader.x
    public final int wN() {
            r1 = this;
            int r0 = r1.alM
            return r0
    }

    @Override // com.kwad.framework.filedownloader.x
    public final boolean wP() {
            r1 = this;
            boolean r0 = r1.alN
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.c
    public final void xa() {
            r4 = this;
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            r1 = 0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r4.toString()
            byte r2 = r4.wJ()
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r0
            r0 = 1
            r3[r0] = r2
            java.lang.String r0 = "filedownloader:lifecycle:over %s by %d "
            com.kwad.framework.filedownloader.f.d.e(r4, r0, r3)
        L1e:
            com.kwad.framework.filedownloader.s$b r0 = r4.alI
            long r2 = r4.alK
            r0.end(r2)
            com.kwad.framework.filedownloader.d$a r0 = r4.alE
            java.util.ArrayList r0 = r0.xg()
            if (r0 == 0) goto L45
            com.kwad.framework.filedownloader.d$a r0 = r4.alE
            java.util.ArrayList r0 = r0.xg()
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
        L3d:
            if (r1 >= r2) goto L45
            r0.get(r1)
            int r1 = r1 + 1
            goto L3d
        L45:
            com.kwad.framework.filedownloader.r r0 = com.kwad.framework.filedownloader.r.xI()
            com.kwad.framework.filedownloader.v r0 = r0.xM()
            com.kwad.framework.filedownloader.d$a r1 = r4.alE
            com.kwad.framework.filedownloader.a$a r1 = r1.xf()
            r0.e(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final com.kwad.framework.filedownloader.t xh() {
            r1 = this;
            com.kwad.framework.filedownloader.t r0 = r1.alD
            return r0
    }

    @Override // com.kwad.framework.filedownloader.x
    public final void xi() {
            r10 = this;
            java.lang.Object r0 = r10.alz
            monitor-enter(r0)
            byte r1 = r10.alF     // Catch: java.lang.Throwable -> L25
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L27
            java.lang.String r1 = "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d"
            int r5 = r10.getId()     // Catch: java.lang.Throwable -> L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L25
            byte r6 = r10.alF     // Catch: java.lang.Throwable -> L25
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L25
            r2[r4] = r5     // Catch: java.lang.Throwable -> L25
            r2[r3] = r6     // Catch: java.lang.Throwable -> L25
            com.kwad.framework.filedownloader.f.d.d(r10, r1, r2)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r1 = move-exception
            goto L90
        L27:
            r1 = 10
            r10.b(r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            com.kwad.framework.filedownloader.d$a r0 = r10.alE
            com.kwad.framework.filedownloader.a$a r0 = r0.xf()
            com.kwad.framework.filedownloader.a r1 = r0.wR()
            boolean r5 = com.kwad.framework.filedownloader.f.d.apD
            if (r5 == 0) goto L5c
            java.lang.String r5 = "call start Url[%s], Path[%s] Listener[%s], Tag[%s]"
            java.lang.String r6 = r1.getUrl()
            java.lang.String r7 = r1.getPath()
            com.kwad.framework.filedownloader.i r8 = r1.wG()
            java.lang.Object r1 = r1.getTag()
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r4] = r6
            r9[r3] = r7
            r9[r2] = r8
            r2 = 3
            r9[r2] = r1
            com.kwad.framework.filedownloader.f.d.e(r10, r5, r9)
        L5c:
            r10.prepare()     // Catch: java.lang.Throwable -> L67
            com.kwad.framework.filedownloader.q r0 = com.kwad.framework.filedownloader.q.xG()
            r0.a(r10)
            goto L7a
        L67:
            r1 = move-exception
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()
            r2.b(r0)
            com.kwad.framework.filedownloader.h r2 = com.kwad.framework.filedownloader.h.xp()
            com.kwad.framework.filedownloader.message.MessageSnapshot r1 = r10.g(r1)
            r2.a(r0, r1)
        L7a:
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L8f
            java.lang.String r0 = "the task[%d] has been into the launch pool."
            int r1 = r10.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r1
            com.kwad.framework.filedownloader.f.d.e(r10, r0, r2)
        L8f:
            return
        L90:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    @Override // com.kwad.framework.filedownloader.x
    public final long xj() {
            r2 = this;
            long r0 = r2.alK
            return r0
    }
}
