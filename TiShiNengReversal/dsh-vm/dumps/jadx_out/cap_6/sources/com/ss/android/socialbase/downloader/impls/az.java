package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class az implements com.ss.android.socialbase.downloader.downloader.av, com.ss.android.socialbase.downloader.downloader.az {
    private static final java.lang.String j = "az";
    private com.ss.android.socialbase.downloader.downloader.i<com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService> cw;
    private com.ss.android.socialbase.downloader.downloader.az r;
    private volatile com.ss.android.socialbase.downloader.downloader.qv xt;


    static {
            return
    }

    public az() {
            r1 = this;
            r1.<init>()
            com.ss.android.socialbase.downloader.impls.av r0 = new com.ss.android.socialbase.downloader.impls.av
            r0.<init>()
            r1.r = r0
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.cw.s()
            r1.cw = r0
            r0.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean ae() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean ae(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt     // Catch: android.os.RemoteException -> Ld
            boolean r3 = r0.ae(r3)     // Catch: android.os.RemoteException -> Ld
            return r3
        Ld:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean av(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            boolean r2 = r0.av(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            boolean r2 = r0.av(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void az(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.az(r2)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.az(r2)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            java.util.List r2 = r0.cw(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            java.util.List r2 = r0.cw(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void cw(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.cw(r2)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void cw(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.r(r2, r3)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean cw() {
            r1 = this;
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.rh()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean cw(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            boolean r2 = r0.cw(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            boolean r2 = r0.xt(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.xt> g(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            java.util.List r2 = r0.g(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            java.util.List r2 = r0.g(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.r.h i(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto L13
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lf
            com.ss.android.socialbase.downloader.r.p r2 = r0.i(r2)     // Catch: android.os.RemoteException -> Lf
            com.ss.android.socialbase.downloader.r.h r2 = com.ss.android.socialbase.downloader.az.ae.j(r2)     // Catch: android.os.RemoteException -> Lf
            return r2
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L13:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public int j(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.ss.android.socialbase.downloader.downloader.cw.j(r1, r2)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            java.util.List r2 = r0.j(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            java.util.List r2 = r0.j(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.j()     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.j(r2)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, int r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto Le
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> La
            r0.j(r2, r3)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Le:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, int r3, int r4, int r5) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.j(r2, r3, r4, r5)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.j(r2, r3, r4, r5)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r9, int r10, int r11, long r12) {
            r8 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r8.xt
            if (r0 != 0) goto Le
            com.ss.android.socialbase.downloader.downloader.az r1 = r8.r
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.j(r2, r3, r4, r5)
            return
        Le:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.ss.android.socialbase.downloader.downloader.qv r9 = r8.xt     // Catch: android.os.RemoteException -> L1d
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r9
            r2.j(r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L1d
            return
        L1d:
            r0 = move-exception
            r9 = r0
            com.bytedance.sdk.component.utils.vl.j(r9)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, int r3, long r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.j(r2, r3, r4)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.j(r2, r3, r4)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r8, int r9, com.ss.android.socialbase.downloader.r.a r10, com.ss.android.socialbase.downloader.xt.tl r11, boolean r12) {
            r7 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r7.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r1 = r7.xt     // Catch: android.os.RemoteException -> L1d
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.xt     // Catch: android.os.RemoteException -> L1d
            if (r11 != r0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            com.ss.android.socialbase.downloader.r.oq r4 = com.ss.android.socialbase.downloader.az.ae.j(r10, r0)     // Catch: android.os.RemoteException -> L1d
            int r5 = r11.ordinal()     // Catch: android.os.RemoteException -> L1d
            r2 = r8
            r3 = r9
            r6 = r12
            r1.xt(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L1d
            return
        L1d:
            r0 = move-exception
            r8 = r0
            com.bytedance.sdk.component.utils.vl.j(r8)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r9, int r10, com.ss.android.socialbase.downloader.r.a r11, com.ss.android.socialbase.downloader.xt.tl r12, boolean r13, boolean r14) {
            r8 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r8.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r1 = r8.xt     // Catch: android.os.RemoteException -> L1e
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.xt     // Catch: android.os.RemoteException -> L1e
            if (r12 != r0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            com.ss.android.socialbase.downloader.r.oq r4 = com.ss.android.socialbase.downloader.az.ae.j(r11, r0)     // Catch: android.os.RemoteException -> L1e
            int r5 = r12.ordinal()     // Catch: android.os.RemoteException -> L1e
            r2 = r9
            r3 = r10
            r6 = r13
            r7 = r14
            r1.j(r2, r3, r4, r5, r6, r7)     // Catch: android.os.RemoteException -> L1e
            return
        L1e:
            r0 = move-exception
            r9 = r0
            com.bytedance.sdk.component.utils.vl.j(r9)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.j(r2, r3)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r4, android.app.Notification r5) {
            r3 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.xt
            if (r0 != 0) goto Lc
            java.lang.String r4 = com.ss.android.socialbase.downloader.impls.az.j
            java.lang.String r5 = "startForeground, aidlService is null"
            com.ss.android.socialbase.downloader.m.j.r(r4, r5)
            return
        Lc:
            java.lang.String r0 = com.ss.android.socialbase.downloader.impls.az.j
            java.lang.String r1 = "aidlService.startForeground, id = "
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.xt     // Catch: android.os.RemoteException -> L21
            r0.j(r4, r5)     // Catch: android.os.RemoteException -> L21
            return
        L21:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, com.ss.android.socialbase.downloader.r.h r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto L12
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Le
            com.ss.android.socialbase.downloader.r.p r3 = com.ss.android.socialbase.downloader.az.ae.j(r3)     // Catch: android.os.RemoteException -> Le
            r0.j(r2, r3)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L12:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.xt(r2, r3)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.j(r2, r3)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.av
    public void j(android.os.IBinder r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.downloader.qv r1 = com.ss.android.socialbase.downloader.downloader.qv.j.j(r1)
            r0.xt = r1
            boolean r1 = com.ss.android.socialbase.downloader.az.m.j()
            if (r1 == 0) goto L14
            com.ss.android.socialbase.downloader.impls.az$1 r1 = new com.ss.android.socialbase.downloader.impls.az$1
            r1.<init>(r0)
            r0.j(r1)
        L14:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(com.ss.android.socialbase.downloader.ae.r r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto La
        L3:
            com.ss.android.socialbase.downloader.downloader.i<com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService> r0 = r1.cw
            if (r0 == 0) goto La
            r0.xt(r2)
        La:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(com.ss.android.socialbase.downloader.ae.xt r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.j(r2)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.j(r2)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(com.ss.android.socialbase.downloader.r.n r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto L12
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Le
            com.ss.android.socialbase.downloader.r.gx r2 = com.ss.android.socialbase.downloader.az.ae.j(r2)     // Catch: android.os.RemoteException -> Le
            r0.j(r2)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L12:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.j(r2)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.j(r2)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(boolean r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r2 = r1.xt
            if (r2 != 0) goto Lc
            java.lang.String r2 = com.ss.android.socialbase.downloader.impls.az.j
            java.lang.String r3 = "stopForeground, aidlService is null"
            com.ss.android.socialbase.downloader.m.j.r(r2, r3)
            return
        Lc:
            java.lang.String r2 = com.ss.android.socialbase.downloader.impls.az.j
            java.lang.String r0 = "aidlService.stopForeground"
            com.ss.android.socialbase.downloader.m.j.cw(r2, r0)
            com.ss.android.socialbase.downloader.downloader.qv r2 = r1.xt     // Catch: android.os.RemoteException -> L19
            r2.j(r3)     // Catch: android.os.RemoteException -> L19
            return
        L19:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            boolean r2 = r0.j(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L11
            r0.j(r2)     // Catch: android.os.RemoteException -> L11
            goto L15
        L11:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L15:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public int jy(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Ld
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            int r2 = r0.xt(r2)
            return r2
        Ld:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L14
            int r2 = r0.jy(r2)     // Catch: android.os.RemoteException -> L14
            return r2
        L14:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = -1
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public int m(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt     // Catch: android.os.RemoteException -> Ld
            int r3 = r0.m(r3)     // Catch: android.os.RemoteException -> Ld
            return r3
        Ld:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void m() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.m()
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.up()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.r.tj mi(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto L13
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lf
            com.ss.android.socialbase.downloader.r.tl r2 = r0.mi(r2)     // Catch: android.os.RemoteException -> Lf
            com.ss.android.socialbase.downloader.r.tj r2 = com.ss.android.socialbase.downloader.az.ae.j(r2)     // Catch: android.os.RemoteException -> Lf
            return r2
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L13:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void oq(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.oq(r2)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.oq(r2)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void qv(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.i<com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService> r0 = r1.cw
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            java.util.List r0 = r0.r()
            return r0
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            java.util.List r0 = r0.xt()     // Catch: android.os.RemoteException -> L12
            return r0
        L12:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            java.util.List r2 = r0.r(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            java.util.List r2 = r0.up(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void r(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            r0.r(r2)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void startService() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.i<com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService> r0 = r1.cw
            if (r0 == 0) goto L7
            r0.startService()
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.ae.cw tl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.tl(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.tl(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.av
    public void tl() {
            r1 = this;
            r0 = 0
            r1.xt = r0
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public long up(int r4) {
            r3 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.xt
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.xt     // Catch: android.os.RemoteException -> Le
            long r0 = r0.up(r4)     // Catch: android.os.RemoteException -> Le
            return r0
        Le:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> up(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto Lf
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lb
            java.util.List r2 = r0.r(r2)     // Catch: android.os.RemoteException -> Lb
            return r2
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean up() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            boolean r0 = r0.up()
            return r0
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            boolean r0 = r0.r()     // Catch: android.os.RemoteException -> L12
            return r0
        L12:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean vl(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt     // Catch: android.os.RemoteException -> Ld
            boolean r3 = r0.qv(r3)     // Catch: android.os.RemoteException -> Ld
            return r3
        Ld:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.r.wq w(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 == 0) goto L13
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> Lf
            com.ss.android.socialbase.downloader.r.rn r2 = r0.w(r2)     // Catch: android.os.RemoteException -> Lf
            com.ss.android.socialbase.downloader.r.wq r2 = com.ss.android.socialbase.downloader.az.ae.j(r2)     // Catch: android.os.RemoteException -> Lf
            return r2
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L13:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean ws(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            boolean r2 = r0.ws(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            boolean r2 = r0.ws(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.ae.cw xt(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = r0.j(r1, r2)
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.tl(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            java.util.List r2 = r0.xt(r2)
            return r2
        Lb:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L12
            java.util.List r2 = r0.xt(r2)     // Catch: android.os.RemoteException -> L12
            return r2
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(int r8, int r9, com.ss.android.socialbase.downloader.r.a r10, com.ss.android.socialbase.downloader.xt.tl r11, boolean r12) {
            r7 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r7.xt
            if (r0 != 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.downloader.qv r1 = r7.xt     // Catch: android.os.RemoteException -> L1d
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.xt     // Catch: android.os.RemoteException -> L1d
            if (r11 != r0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            com.ss.android.socialbase.downloader.r.oq r4 = com.ss.android.socialbase.downloader.az.ae.j(r10, r0)     // Catch: android.os.RemoteException -> L1d
            int r5 = r11.ordinal()     // Catch: android.os.RemoteException -> L1d
            r2 = r8
            r3 = r9
            r6 = r12
            r1.j(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L1d
            return
        L1d:
            r0 = move-exception
            r8 = r0
            com.bytedance.sdk.component.utils.vl.j(r8)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.xt(r2, r3)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.j(r2, r3)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.xt(r2, r3)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.xt(r2, r3)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(com.ss.android.socialbase.downloader.ae.cw r1) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(com.ss.android.socialbase.downloader.ae.r r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto La
        L3:
            com.ss.android.socialbase.downloader.downloader.i<com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService> r0 = r1.cw
            if (r0 == 0) goto La
            r0.cw(r2)
        La:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.r
            r0.xt(r2)
            return
        La:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.xt     // Catch: android.os.RemoteException -> L10
            r0.xt(r2)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean xt() {
            r3 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.xt
            r1 = 0
            if (r0 != 0) goto Ld
            java.lang.String r0 = com.ss.android.socialbase.downloader.impls.az.j
            java.lang.String r2 = "isServiceForeground, aidlService is null"
            com.ss.android.socialbase.downloader.m.j.r(r0, r2)
            return r1
        Ld:
            java.lang.String r0 = com.ss.android.socialbase.downloader.impls.az.j
            java.lang.String r2 = "aidlService.isServiceForeground"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r2)
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.xt     // Catch: android.os.RemoteException -> L1b
            boolean r0 = r0.m()     // Catch: android.os.RemoteException -> L1b
            return r0
        L1b:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean xt(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.ss.android.socialbase.downloader.downloader.qv r0 = r2.xt     // Catch: android.os.RemoteException -> Ld
            boolean r3 = r0.xt(r3)     // Catch: android.os.RemoteException -> Ld
            return r3
        Ld:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }
}
