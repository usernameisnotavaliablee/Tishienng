package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n implements com.kwad.framework.filedownloader.u {
    private final com.kwad.framework.filedownloader.u amj;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.framework.filedownloader.n amk = null;

        static {
                com.kwad.framework.filedownloader.n r0 = new com.kwad.framework.filedownloader.n
                r1 = 0
                r0.<init>(r1)
                com.kwad.framework.filedownloader.n.a.amk = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.framework.filedownloader.n xC() {
                com.kwad.framework.filedownloader.n r0 = com.kwad.framework.filedownloader.n.a.amk
                return r0
        }
    }

    private n() {
            r2 = this;
            r2.<init>()
            com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.zB()
            boolean r0 = r0.apH
            if (r0 == 0) goto L11
            com.kwad.framework.filedownloader.o r0 = new com.kwad.framework.filedownloader.o
            r0.<init>()
            goto L18
        L11:
            com.kwad.framework.filedownloader.p r0 = new com.kwad.framework.filedownloader.p
            java.lang.Class<com.kwad.sdk.api.proxy.app.FileDownloadService$SeparateProcessService> r1 = com.kwad.sdk.api.proxy.app.FileDownloadService.SeparateProcessService.class
            r0.<init>(r1)
        L18:
            r2.amj = r0
            return
    }

    /* synthetic */ n(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.framework.filedownloader.n xA() {
            com.kwad.framework.filedownloader.n r0 = com.kwad.framework.filedownloader.n.a.xC()
            return r0
    }

    public static com.kwad.framework.filedownloader.services.e.a xB() {
            com.kwad.framework.filedownloader.n r0 = xA()
            com.kwad.framework.filedownloader.u r0 = r0.amj
            boolean r0 = r0 instanceof com.kwad.framework.filedownloader.o
            if (r0 == 0) goto L13
            com.kwad.framework.filedownloader.n r0 = xA()
            com.kwad.framework.filedownloader.u r0 = r0.amj
            com.kwad.framework.filedownloader.services.e$a r0 = (com.kwad.framework.filedownloader.services.e.a) r0
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(java.lang.String r11, java.lang.String r12, boolean r13, int r14, int r15, int r16, boolean r17, com.kwad.framework.filedownloader.d.b r18, boolean r19) {
            r10 = this;
            com.kwad.framework.filedownloader.u r0 = r10.amj
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            boolean r11 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // com.kwad.framework.filedownloader.u
    public final void aG(android.content.Context r2) {
            r1 = this;
            com.kwad.framework.filedownloader.u r0 = r1.amj
            r0.aG(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bw(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.u r0 = r1.amj
            boolean r2 = r0.bw(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte bx(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.u r0 = r1.amj
            byte r2 = r0.bx(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean by(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.u r0 = r1.amj
            boolean r2 = r0.by(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
            r1 = this;
            com.kwad.framework.filedownloader.u r0 = r1.amj
            boolean r0 = r0.isConnected()
            return r0
    }
}
