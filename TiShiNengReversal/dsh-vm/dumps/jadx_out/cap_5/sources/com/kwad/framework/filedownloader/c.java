package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.framework.filedownloader.a, com.kwad.framework.filedownloader.a.InterfaceC0110a, com.kwad.framework.filedownloader.d.a {
    private final java.lang.Object alA;
    private volatile boolean alB;
    private final com.kwad.framework.filedownloader.x alh;
    private final com.kwad.framework.filedownloader.x.a ali;
    private int alj;
    private java.util.ArrayList<java.lang.Object> alk;
    private java.lang.String all;
    private java.lang.String alm;
    private boolean aln;
    private com.kwad.framework.filedownloader.d.b alo;
    private com.kwad.framework.filedownloader.i alp;
    private java.lang.Object alq;
    private int alr;
    private boolean als;
    private boolean alt;
    private int alu;
    private int alv;
    private boolean alw;
    volatile int alx;
    private boolean aly;
    private final java.lang.Object alz;
    private final java.lang.String mUrl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements com.kwad.framework.filedownloader.a.b {
        private final com.kwad.framework.filedownloader.c alC;

        private a(com.kwad.framework.filedownloader.c r2) {
                r1 = this;
                r1.<init>()
                r1.alC = r2
                r0 = 1
                com.kwad.framework.filedownloader.c.a(r2, r0)
                return
        }

        /* synthetic */ a(com.kwad.framework.filedownloader.c r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.kwad.framework.filedownloader.a.b
        public final int wZ() {
                r4 = this;
                com.kwad.framework.filedownloader.c r0 = r4.alC
                int r0 = r0.getId()
                boolean r1 = com.kwad.framework.filedownloader.f.d.apD
                if (r1 == 0) goto L19
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "add the task[%d] to the queue"
                com.kwad.framework.filedownloader.f.d.c(r4, r1, r2)
            L19:
                com.kwad.framework.filedownloader.h r1 = com.kwad.framework.filedownloader.h.xp()
                com.kwad.framework.filedownloader.c r2 = r4.alC
                r1.c(r2)
                return r0
        }
    }

    c(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.alr = r0
            r2.als = r0
            r2.alt = r0
            r1 = 100
            r2.alu = r1
            r1 = 10
            r2.alv = r1
            r2.alw = r0
            r2.alx = r0
            r2.aly = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.alA = r1
            r2.alB = r0
            r2.mUrl = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.alz = r3
            com.kwad.framework.filedownloader.d r0 = new com.kwad.framework.filedownloader.d
            r0.<init>(r2, r3)
            r2.alh = r0
            r2.ali = r0
            return
    }

    static /* synthetic */ boolean a(com.kwad.framework.filedownloader.c r0, boolean r1) {
            r1 = 1
            r0.aly = r1
            return r1
    }

    private boolean xb() {
            r1 = this;
            com.kwad.framework.filedownloader.x r0 = r1.alh
            byte r0 = r0.wJ()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private int xc() {
            r4 = this;
            boolean r0 = r4.xb()
            if (r0 == 0) goto L40
            boolean r0 = r4.isRunning()
            if (r0 == 0) goto L26
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r4.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create"
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.c(r1, r2)
            r0.<init>(r1)
            throw r0
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again."
            r1.<init>(r2)
            com.kwad.framework.filedownloader.x r2 = r4.alh
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            boolean r0 = r4.wC()
            if (r0 != 0) goto L49
            r4.wU()
        L49:
            com.kwad.framework.filedownloader.x r0 = r4.alh
            r0.xi()
            int r0 = r4.getId()
            return r0
    }

    private void xd() {
            r2 = this;
            com.kwad.framework.filedownloader.d.b r0 = r2.alo
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.alA
            monitor-enter(r0)
            com.kwad.framework.filedownloader.d.b r1 = r2.alo     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.framework.filedownloader.d.b r1 = new com.kwad.framework.filedownloader.d.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r2.alo = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            return
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a a(com.kwad.framework.filedownloader.i r3) {
            r2 = this;
            r2.alp = r3
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "setListener %s"
            com.kwad.framework.filedownloader.f.d.c(r2, r3, r0)
        L11:
            return r2
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a bd(boolean r1) {
            r0 = this;
            r1 = 1
            r0.alw = r1
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a be(boolean r1) {
            r0 = this;
            r1 = 1
            r0.als = r1
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a bf(boolean r1) {
            r0 = this;
            r0.alt = r1
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a bk(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.kwad.framework.filedownloader.a r2 = r1.c(r2, r0)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a bl(java.lang.String r3) {
            r2 = this;
            com.kwad.framework.filedownloader.d.b r0 = r2.alo
            if (r0 != 0) goto L13
            java.lang.Object r0 = r2.alA
            monitor-enter(r0)
            com.kwad.framework.filedownloader.d.b r1 = r2.alo     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r3 = move-exception
            goto L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L13:
            com.kwad.framework.filedownloader.d.b r0 = r2.alo
            r0.bw(r3)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a bq(int r1) {
            r0 = this;
            r1 = 3
            r0.alr = r1
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final boolean br(int r2) {
            r1 = this;
            int r0 = r1.getId()
            if (r0 != r2) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a c(java.lang.String r3, boolean r4) {
            r2 = this;
            r2.all = r3
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r1 = "setPath %s"
            com.kwad.framework.filedownloader.f.d.c(r2, r1, r0)
        L11:
            r2.aln = r4
            if (r4 == 0) goto L19
            r3 = 0
            r2.alm = r3
            return r2
        L19:
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            java.lang.String r3 = r4.getName()
            r2.alm = r3
            return r2
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean cancel() {
            r1 = this;
            boolean r0 = r1.pause()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a f(java.lang.Object r3) {
            r2 = this;
            r2.alq = r3
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L11
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "setTag %s"
            com.kwad.framework.filedownloader.f.d.c(r2, r3, r0)
        L11:
            return r2
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final void free() {
            r1 = this;
            com.kwad.framework.filedownloader.x r0 = r1.alh
            r0.free()
            com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.xp()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L12
            r0 = 0
            r1.alB = r0
        L12:
            return
    }

    @Override // com.kwad.framework.filedownloader.a
    public final java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1.alm
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getId() {
            r3 = this;
            int r0 = r3.alj
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r3.all
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = r3.mUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = r3.mUrl
            java.lang.String r1 = r3.all
            boolean r2 = r3.aln
            int r0 = com.kwad.framework.filedownloader.f.f.g(r0, r1, r2)
            r3.alj = r0
            return r0
        L22:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.all
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getSmallFileSoFarBytes() {
            r5 = this;
            com.kwad.framework.filedownloader.x r0 = r5.alh
            long r0 = r0.xj()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L11
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L11:
            com.kwad.framework.filedownloader.x r0 = r5.alh
            long r0 = r0.xj()
            int r1 = (int) r0
            return r1
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getSmallFileTotalBytes() {
            r5 = this;
            com.kwad.framework.filedownloader.x r0 = r5.alh
            long r0 = r0.getTotalBytes()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L11
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L11:
            com.kwad.framework.filedownloader.x r0 = r5.alh
            long r0 = r0.getTotalBytes()
            int r1 = (int) r0
            return r1
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getSpeed() {
            r1 = this;
            com.kwad.framework.filedownloader.x r0 = r1.alh
            int r0 = r0.getSpeed()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final long getStatusUpdateTime() {
            r2 = this;
            com.kwad.framework.filedownloader.x r0 = r2.alh
            long r0 = r0.getStatusUpdateTime()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final java.lang.Object getTag() {
            r1 = this;
            java.lang.Object r0 = r1.alq
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final java.lang.String getTargetFilePath() {
            r3 = this;
            java.lang.String r0 = r3.getPath()
            boolean r1 = r3.wF()
            java.lang.String r2 = r3.getFilename()
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.a(r0, r1, r2)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.mUrl
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final boolean isOver() {
            r1 = this;
            byte r0 = r1.wJ()
            boolean r0 = com.kwad.framework.filedownloader.d.d.bY(r0)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean isRunning() {
            r1 = this;
            com.kwad.framework.filedownloader.r r0 = com.kwad.framework.filedownloader.r.xI()
            com.kwad.framework.filedownloader.v r0 = r0.xM()
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            byte r0 = r1.wJ()
            boolean r0 = com.kwad.framework.filedownloader.d.d.bZ(r0)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean pause() {
            r2 = this;
            java.lang.Object r0 = r2.alz
            monitor-enter(r0)
            com.kwad.framework.filedownloader.x r1 = r2.alh     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.pause()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final void setFileName(java.lang.String r1) {
            r0 = this;
            r0.alm = r1
            return
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int start() {
            r2 = this;
            boolean r0 = r2.aly
            if (r0 != 0) goto L9
            int r0 = r2.xc()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically."
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = super.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "%d@%s"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r2)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a u(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.xd()
            com.kwad.framework.filedownloader.d.b r0 = r1.alo
            r0.y(r2, r3)
            return r1
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a.b wA() {
            r2 = this;
            com.kwad.framework.filedownloader.c$a r0 = new com.kwad.framework.filedownloader.c$a
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean wB() {
            r3 = this;
            boolean r0 = r3.isRunning()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            int r0 = r3.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "This task[%d] is running, if you want start the same task, please create a new one by FileDownloader#create"
            com.kwad.framework.filedownloader.f.d.d(r3, r0, r1)
            return r2
        L1a:
            r3.alx = r2
            r3.aly = r2
            r3.alB = r2
            com.kwad.framework.filedownloader.x r0 = r3.alh
            r0.reset()
            return r1
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean wC() {
            r1 = this;
            int r0 = r1.alx
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int wD() {
            r1 = this;
            int r0 = r1.alu
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int wE() {
            r1 = this;
            int r0 = r1.alv
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean wF() {
            r1 = this;
            boolean r0 = r1.aln
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.i wG() {
            r1 = this;
            com.kwad.framework.filedownloader.i r0 = r1.alp
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final long wH() {
            r2 = this;
            com.kwad.framework.filedownloader.x r0 = r2.alh
            long r0 = r0.xj()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final long wI() {
            r2 = this;
            com.kwad.framework.filedownloader.x r0 = r2.alh
            long r0 = r0.getTotalBytes()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final byte wJ() {
            r1 = this;
            com.kwad.framework.filedownloader.x r0 = r1.alh
            byte r0 = r0.wJ()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean wK() {
            r1 = this;
            boolean r0 = r1.alw
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final java.lang.Throwable wL() {
            r1 = this;
            com.kwad.framework.filedownloader.x r0 = r1.alh
            java.lang.Throwable r0 = r0.wL()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int wM() {
            r1 = this;
            int r0 = r1.alr
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int wN() {
            r1 = this;
            com.kwad.framework.filedownloader.x r0 = r1.alh
            int r0 = r0.wN()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean wO() {
            r1 = this;
            boolean r0 = r1.als
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean wP() {
            r1 = this;
            com.kwad.framework.filedownloader.x r0 = r1.alh
            boolean r0 = r0.wP()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean wQ() {
            r1 = this;
            boolean r0 = r1.alt
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final com.kwad.framework.filedownloader.a wR() {
            r0 = this;
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final com.kwad.framework.filedownloader.x.a wS() {
            r1 = this;
            com.kwad.framework.filedownloader.x$a r0 = r1.ali
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final int wT() {
            r1 = this;
            int r0 = r1.alx
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final void wU() {
            r1 = this;
            com.kwad.framework.filedownloader.i r0 = r1.wG()
            if (r0 == 0) goto Lf
            com.kwad.framework.filedownloader.i r0 = r1.wG()
            int r0 = r0.hashCode()
            goto L13
        Lf:
            int r0 = r1.hashCode()
        L13:
            r1.alx = r0
            return
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final boolean wV() {
            r1 = this;
            boolean r0 = r1.alB
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final void wW() {
            r1 = this;
            r0 = 1
            r1.alB = r0
            return
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final void wX() {
            r0 = this;
            r0.xc()
            return
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0110a
    public final boolean wY() {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.alk
            if (r0 == 0) goto Lc
            int r0 = r0.size()
            if (r0 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final com.kwad.framework.filedownloader.d.b xe() {
            r1 = this;
            com.kwad.framework.filedownloader.d.b r0 = r1.alo
            return r0
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final com.kwad.framework.filedownloader.a.InterfaceC0110a xf() {
            r0 = this;
            return r0
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final java.util.ArrayList<java.lang.Object> xg() {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.alk
            return r0
    }
}
