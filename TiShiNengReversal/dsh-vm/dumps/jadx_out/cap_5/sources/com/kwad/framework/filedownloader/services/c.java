package com.kwad.framework.filedownloader.services;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private final com.kwad.framework.filedownloader.services.c.b aph;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        com.kwad.framework.filedownloader.f.c.b yi();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        com.kwad.framework.filedownloader.f.c.InterfaceC0116c api;
        java.lang.Integer apj;
        com.kwad.framework.filedownloader.f.c.e apk;
        com.kwad.framework.filedownloader.f.c.b apl;
        com.kwad.framework.filedownloader.services.c.a apm;
        com.kwad.framework.filedownloader.f.c.a apn;
        com.kwad.framework.filedownloader.f.c.d apo;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.kwad.framework.filedownloader.services.c.b a(com.kwad.framework.filedownloader.f.c.b r1) {
                r0 = this;
                r0.apl = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.services.c.b a(com.kwad.framework.filedownloader.services.c.a r1) {
                r0 = this;
                r0.apm = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.services.c.b ca(int r1) {
                r0 = this;
                r1 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.apj = r1
                return r0
        }

        public final java.lang.String toString() {
                r7 = this;
                com.kwad.framework.filedownloader.f.c$c r0 = r7.api
                java.lang.Integer r1 = r7.apj
                com.kwad.framework.filedownloader.f.c$e r2 = r7.apk
                com.kwad.framework.filedownloader.f.c$b r3 = r7.apl
                com.kwad.framework.filedownloader.f.c$a r4 = r7.apn
                r5 = 5
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                r5[r6] = r0
                r0 = 1
                r5[r0] = r1
                r0 = 2
                r5[r0] = r2
                r0 = 3
                r5[r0] = r3
                r0 = 4
                r5[r0] = r4
                java.lang.String r0 = "component: database[%s], maxNetworkCount[%s], outputStream[%s], connection[%s], connectionCountAdapter[%s]"
                java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r5)
                return r0
        }
    }

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.aph = r0
            return
    }

    public c(com.kwad.framework.filedownloader.services.c.b r1) {
            r0 = this;
            r0.<init>()
            r0.aph = r1
            return
    }

    private static com.kwad.framework.filedownloader.f.c.d zk() {
            com.kwad.framework.filedownloader.services.b r0 = new com.kwad.framework.filedownloader.services.b
            r0.<init>()
            return r0
    }

    private static int zl() {
            com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.zB()
            int r0 = r0.apI
            return r0
    }

    private static com.kwad.framework.filedownloader.f.c.e zm() {
            com.kwad.framework.filedownloader.e.b$a r0 = new com.kwad.framework.filedownloader.e.b$a
            r0.<init>()
            return r0
    }

    private static com.kwad.framework.filedownloader.f.c.b zn() {
            com.kwad.framework.filedownloader.a.c$b r0 = new com.kwad.framework.filedownloader.a.c$b
            r0.<init>()
            return r0
    }

    private static com.kwad.framework.filedownloader.f.c.a zo() {
            com.kwad.framework.filedownloader.a.a r0 = new com.kwad.framework.filedownloader.a.a
            r0.<init>()
            return r0
    }

    public final int yf() {
            r3 = this;
            com.kwad.framework.filedownloader.services.c$b r0 = r3.aph
            if (r0 != 0) goto L9
            int r0 = zl()
            return r0
        L9:
            java.lang.Integer r0 = r0.apj
            if (r0 == 0) goto L25
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "initial FileDownloader manager with the customize maxNetworkThreadCount: %d"
            com.kwad.framework.filedownloader.f.d.c(r3, r2, r1)
        L1c:
            int r0 = r0.intValue()
            int r0 = com.kwad.framework.filedownloader.f.e.ce(r0)
            return r0
        L25:
            int r0 = zl()
            return r0
    }

    public final com.kwad.framework.filedownloader.b.a zf() {
            r1 = this;
            com.kwad.framework.filedownloader.services.c$b r0 = r1.aph
            if (r0 == 0) goto L16
            com.kwad.framework.filedownloader.f.c$c r0 = r0.api
            if (r0 != 0) goto L9
            goto L16
        L9:
            com.kwad.framework.filedownloader.b.a r0 = r0.zA()
            if (r0 == 0) goto L10
            return r0
        L10:
            com.kwad.framework.filedownloader.b.c r0 = new com.kwad.framework.filedownloader.b.c
            r0.<init>()
            return r0
        L16:
            com.kwad.framework.filedownloader.b.c r0 = new com.kwad.framework.filedownloader.b.c
            r0.<init>()
            return r0
    }

    public final com.kwad.framework.filedownloader.f.c.e zg() {
            r3 = this;
            com.kwad.framework.filedownloader.services.c$b r0 = r3.aph
            if (r0 != 0) goto L9
            com.kwad.framework.filedownloader.f.c$e r0 = zm()
            return r0
        L9:
            com.kwad.framework.filedownloader.f.c$e r0 = r0.apk
            if (r0 == 0) goto L1d
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "initial FileDownloader manager with the customize output stream: %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r2, r1)
        L1c:
            return r0
        L1d:
            com.kwad.framework.filedownloader.f.c$e r0 = zm()
            return r0
    }

    public final com.kwad.framework.filedownloader.f.c.b zh() {
            r1 = this;
            com.kwad.framework.filedownloader.services.c$b r0 = r1.aph
            if (r0 != 0) goto L9
            com.kwad.framework.filedownloader.f.c$b r0 = zn()
            return r0
        L9:
            com.kwad.framework.filedownloader.services.c$a r0 = r0.apm
            if (r0 == 0) goto L14
            com.kwad.framework.filedownloader.f.c$b r0 = r0.yi()
            if (r0 == 0) goto L14
            return r0
        L14:
            com.kwad.framework.filedownloader.f.c$b r0 = zn()
            return r0
    }

    public final com.kwad.framework.filedownloader.f.c.a zi() {
            r3 = this;
            com.kwad.framework.filedownloader.services.c$b r0 = r3.aph
            if (r0 != 0) goto L9
            com.kwad.framework.filedownloader.f.c$a r0 = zo()
            return r0
        L9:
            com.kwad.framework.filedownloader.f.c$a r0 = r0.apn
            if (r0 == 0) goto L1d
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "initial FileDownloader manager with the customize connection count adapter: %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r2, r1)
        L1c:
            return r0
        L1d:
            com.kwad.framework.filedownloader.f.c$a r0 = zo()
            return r0
    }

    public final com.kwad.framework.filedownloader.f.c.d zj() {
            r3 = this;
            com.kwad.framework.filedownloader.services.c$b r0 = r3.aph
            if (r0 != 0) goto L9
            com.kwad.framework.filedownloader.f.c$d r0 = zk()
            return r0
        L9:
            com.kwad.framework.filedownloader.f.c$d r0 = r0.apo
            if (r0 == 0) goto L1d
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "initial FileDownloader manager with the customize id generator: %s"
            com.kwad.framework.filedownloader.f.d.c(r3, r2, r1)
        L1c:
            return r0
        L1d:
            com.kwad.framework.filedownloader.f.c$d r0 = zk()
            return r0
    }
}
