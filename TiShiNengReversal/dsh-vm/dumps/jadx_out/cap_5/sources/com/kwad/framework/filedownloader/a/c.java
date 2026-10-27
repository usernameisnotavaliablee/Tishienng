package com.kwad.framework.filedownloader.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.framework.filedownloader.a.b {
    protected java.net.URLConnection amB;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private java.net.Proxy amC;
        private java.lang.Integer amD;
        private java.lang.Integer amE;

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ java.net.Proxy a(com.kwad.framework.filedownloader.a.c.a r0) {
                java.net.Proxy r0 = r0.amC
                return r0
        }

        static /* synthetic */ java.lang.Integer b(com.kwad.framework.filedownloader.a.c.a r0) {
                java.lang.Integer r0 = r0.amD
                return r0
        }

        static /* synthetic */ java.lang.Integer c(com.kwad.framework.filedownloader.a.c.a r0) {
                java.lang.Integer r0 = r0.amE
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.kwad.framework.filedownloader.f.c.b {
        private final com.kwad.framework.filedownloader.a.c.a amF;

        public b() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        private b(com.kwad.framework.filedownloader.a.c.a r1) {
                r0 = this;
                r0.<init>()
                r1 = 0
                r0.amF = r1
                return
        }

        @Override // com.kwad.framework.filedownloader.f.c.b
        public final com.kwad.framework.filedownloader.a.b bo(java.lang.String r3) {
                r2 = this;
                com.kwad.framework.filedownloader.a.c r0 = new com.kwad.framework.filedownloader.a.c
                com.kwad.framework.filedownloader.a.c$a r1 = r2.amF
                r0.<init>(r3, r1)
                return r0
        }
    }

    public c(java.lang.String r2, com.kwad.framework.filedownloader.a.c.a r3) {
            r1 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    private c(java.net.URL r2, com.kwad.framework.filedownloader.a.c.a r3) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L16
            java.net.Proxy r0 = com.kwad.framework.filedownloader.a.c.a.a(r3)
            if (r0 == 0) goto L16
            java.net.Proxy r0 = com.kwad.framework.filedownloader.a.c.a.a(r3)
            java.net.URLConnection r2 = r2.openConnection(r0)
            r1.amB = r2
            goto L1c
        L16:
            java.net.URLConnection r2 = r2.openConnection()
            r1.amB = r2
        L1c:
            java.net.URLConnection r2 = r1.amB     // Catch: java.lang.Throwable -> L22
            com.kwad.sdk.api.core.TLSConnectionUtils.wrapHttpURLConnection(r2)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
        L23:
            if (r3 == 0) goto L4b
            java.lang.Integer r2 = com.kwad.framework.filedownloader.a.c.a.b(r3)
            if (r2 == 0) goto L38
            java.net.URLConnection r2 = r1.amB
            java.lang.Integer r0 = com.kwad.framework.filedownloader.a.c.a.b(r3)
            int r0 = r0.intValue()
            r2.setReadTimeout(r0)
        L38:
            java.lang.Integer r2 = com.kwad.framework.filedownloader.a.c.a.c(r3)
            if (r2 == 0) goto L4b
            java.net.URLConnection r2 = r1.amB
            java.lang.Integer r3 = com.kwad.framework.filedownloader.a.c.a.c(r3)
            int r3 = r3.intValue()
            r2.setConnectTimeout(r3)
        L4b:
            return
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void addHeader(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.net.URLConnection r0 = r1.amB
            r0.addRequestProperty(r2, r3)
            return
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final java.lang.String bn(java.lang.String r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.amB
            java.lang.String r2 = r0.getHeaderField(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void execute() {
            r1 = this;
            java.net.URLConnection r0 = r1.amB
            r0.connect()
            return
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final java.io.InputStream getInputStream() {
            r2 = this;
            java.net.URLConnection r0 = r2.amB
            java.io.InputStream r0 = r0.getInputStream()
            java.lang.Class<com.kwad.sdk.service.a.j> r1 = com.kwad.sdk.service.a.j.class
            java.lang.Object r1 = com.kwad.sdk.service.ServiceProvider.get(r1)
            com.kwad.sdk.service.a.j r1 = (com.kwad.sdk.service.a.j) r1
            java.io.InputStream r0 = r1.wrapInputStream(r0)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final int getResponseCode() {
            r2 = this;
            java.net.URLConnection r0 = r2.amB
            boolean r1 = r0 instanceof java.net.HttpURLConnection
            if (r1 == 0) goto L14
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L14:
            r0 = 0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> xQ() {
            r1 = this;
            java.net.URLConnection r0 = r1.amB
            java.util.Map r0 = r0.getRequestProperties()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> xR() {
            r1 = this;
            java.net.URLConnection r0 = r1.amB
            java.util.Map r0 = r0.getHeaderFields()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void xS() {
            r0 = this;
            return
    }
}
