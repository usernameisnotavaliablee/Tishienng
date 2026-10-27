package com.kwad.framework.filedownloader.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ConnectTask {
    final int amZ;
    final com.kwad.framework.filedownloader.d.b ana;
    private com.kwad.framework.filedownloader.download.a anb;
    private java.lang.String anc;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> and;
    private java.util.List<java.lang.String> ane;
    final java.lang.String url;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class Reconnect extends java.lang.Throwable {
        private static final long serialVersionUID = 2940866805654257562L;
        final /* synthetic */ com.kwad.framework.filedownloader.download.ConnectTask this$0;

        Reconnect(com.kwad.framework.filedownloader.download.ConnectTask r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private com.kwad.framework.filedownloader.d.b ana;
        private java.lang.String anc;
        private java.lang.Integer anf;
        private com.kwad.framework.filedownloader.download.a ang;
        private java.lang.String url;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.kwad.framework.filedownloader.download.ConnectTask.a a(com.kwad.framework.filedownloader.d.b r1) {
                r0 = this;
                r0.ana = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.ConnectTask.a a(com.kwad.framework.filedownloader.download.a r1) {
                r0 = this;
                r0.ang = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.ConnectTask.a bL(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.anf = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.ConnectTask.a bp(java.lang.String r1) {
                r0 = this;
                r0.url = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.ConnectTask.a bq(java.lang.String r1) {
                r0 = this;
                r0.anc = r1
                return r0
        }

        final com.kwad.framework.filedownloader.download.ConnectTask yb() {
                r8 = this;
                java.lang.Integer r0 = r8.anf
                if (r0 == 0) goto L1d
                com.kwad.framework.filedownloader.download.a r2 = r8.ang
                if (r2 == 0) goto L1d
                java.lang.String r1 = r8.url
                if (r1 == 0) goto L1d
                com.kwad.framework.filedownloader.download.ConnectTask r1 = new com.kwad.framework.filedownloader.download.ConnectTask
                int r3 = r0.intValue()
                java.lang.String r4 = r8.url
                java.lang.String r5 = r8.anc
                com.kwad.framework.filedownloader.d.b r6 = r8.ana
                r7 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r1
            L1d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }
    }

    private ConnectTask(com.kwad.framework.filedownloader.download.a r1, int r2, java.lang.String r3, java.lang.String r4, com.kwad.framework.filedownloader.d.b r5) {
            r0 = this;
            r0.<init>()
            r0.amZ = r2
            r0.url = r3
            r0.anc = r4
            r0.ana = r5
            r0.anb = r1
            return
    }

    /* synthetic */ ConnectTask(com.kwad.framework.filedownloader.download.a r1, int r2, java.lang.String r3, java.lang.String r4, com.kwad.framework.filedownloader.d.b r5, byte r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private void a(com.kwad.framework.filedownloader.a.b r5) {
            r4 = this;
            com.kwad.framework.filedownloader.d.b r0 = r4.ana
            if (r0 == 0) goto L58
            java.util.HashMap r0 = r0.yY()
            if (r0 == 0) goto L58
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L22
            int r1 = r4.amZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            java.lang.String r1 = "%d add outside header: %s"
            com.kwad.framework.filedownloader.f.d.e(r4, r1, r2)
        L22:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L2a
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r5.addHeader(r2, r3)
            goto L48
        L58:
            return
    }

    private void b(com.kwad.framework.filedownloader.a.b r9) {
            r8 = this;
            java.lang.String r0 = r8.anc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            java.lang.String r0 = "If-Match"
            java.lang.String r1 = r8.anc
            r9.addHeader(r0, r1)
        Lf:
            com.kwad.framework.filedownloader.download.a r0 = r8.anb
            long r1 = r0.anj
            r3 = 0
            r5 = 0
            r6 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L2c
            long r0 = r0.ani
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            java.lang.String r0 = "bytes=%d-"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r1)
            goto L47
        L2c:
            long r0 = r0.ani
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.kwad.framework.filedownloader.download.a r1 = r8.anb
            long r1 = r1.anj
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r0
            r2[r6] = r1
            java.lang.String r0 = "bytes=%d-%d"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r2)
        L47:
            java.lang.String r1 = "Range"
            r9.addHeader(r1, r0)
            return
    }

    private void c(com.kwad.framework.filedownloader.a.b r3) {
            r2 = this;
            com.kwad.framework.filedownloader.d.b r0 = r2.ana
            java.lang.String r1 = "User-Agent"
            if (r0 == 0) goto L12
            java.util.HashMap r0 = r0.yY()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L11
            goto L12
        L11:
            return
        L12:
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.zH()
            r3.addHeader(r1, r0)
            return
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestHeader() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.and
            return r0
    }

    final com.kwad.framework.filedownloader.a.b xX() {
            r5 = this;
            com.kwad.framework.filedownloader.download.b r0 = com.kwad.framework.filedownloader.download.b.yc()
            java.lang.String r1 = r5.url
            com.kwad.framework.filedownloader.a.b r0 = r0.br(r1)
            r5.a(r0)
            r5.b(r0)
            r5.c(r0)
            java.util.Map r1 = r0.xQ()
            r5.and = r1
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L33
            int r1 = r5.amZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.and
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "%s request header %s"
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r3)
        L33:
            r0.execute()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.ane = r1
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.and
            com.kwad.framework.filedownloader.a.b r0 = com.kwad.framework.filedownloader.a.d.a(r2, r0, r1)
            return r0
    }

    final boolean xY() {
            r5 = this;
            com.kwad.framework.filedownloader.download.a r0 = r5.anb
            long r0 = r0.ani
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    final java.lang.String xZ() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.ane
            if (r0 == 0) goto L19
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L19
            java.util.List<java.lang.String> r0 = r2.ane
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L19:
            r0 = 0
            return r0
    }

    public final com.kwad.framework.filedownloader.download.a ya() {
            r1 = this;
            com.kwad.framework.filedownloader.download.a r0 = r1.anb
            return r0
    }
}
