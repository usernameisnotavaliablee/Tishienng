package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r {
    private static final java.lang.Object amu = null;
    private static final java.lang.Object amw = null;
    private com.kwad.framework.filedownloader.w amv;
    private volatile com.kwad.framework.filedownloader.v amx;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.framework.filedownloader.r amy = null;

        static {
                com.kwad.framework.filedownloader.r r0 = new com.kwad.framework.filedownloader.r
                r0.<init>()
                com.kwad.framework.filedownloader.r.a.amy = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.framework.filedownloader.r xN() {
                com.kwad.framework.filedownloader.r r0 = com.kwad.framework.filedownloader.r.a.amy
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.kwad.framework.filedownloader.r.amu = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.kwad.framework.filedownloader.r.amw = r0
            return
    }

    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r3, com.kwad.framework.filedownloader.services.c.b r4) {
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L14
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r4
            java.lang.Class<com.kwad.framework.filedownloader.r> r1 = com.kwad.framework.filedownloader.r.class
            java.lang.String r2 = "init Downloader with params: %s %s"
            com.kwad.framework.filedownloader.f.d.c(r1, r2, r0)
        L14:
            if (r3 == 0) goto L29
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            com.kwad.framework.filedownloader.f.c.aI(r3)
            com.kwad.framework.filedownloader.download.b r3 = com.kwad.framework.filedownloader.download.b.yc()
            r3.a(r4)
            return
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "the provided context must not be null!"
            r3.<init>(r4)
            throw r3
    }

    private static void a(com.kwad.framework.filedownloader.e r2) {
            com.kwad.framework.filedownloader.f r0 = com.kwad.framework.filedownloader.f.xn()
            java.lang.String r1 = "event.service.connect.changed"
            r0.a(r1, r2)
            return
    }

    public static void aH(android.content.Context r0) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.kwad.framework.filedownloader.f.c.aI(r0)
            return
    }

    public static com.kwad.framework.filedownloader.a bm(java.lang.String r1) {
            com.kwad.framework.filedownloader.c r0 = new com.kwad.framework.filedownloader.c
            r0.<init>(r1)
            return r0
    }

    private int bz(int r3) {
            r2 = this;
            com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.xp()
            java.util.List r0 = r0.bu(r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "request pause but not exist %d"
            com.kwad.framework.filedownloader.f.d.d(r2, r3, r0)
            return r1
        L1e:
            java.util.Iterator r3 = r0.iterator()
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            com.kwad.framework.filedownloader.a$a r1 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r1
            com.kwad.framework.filedownloader.a r1 = r1.wR()
            r1.pause()
            goto L22
        L36:
            int r3 = r0.size()
            return r3
    }

    public static com.kwad.framework.filedownloader.r xI() {
            com.kwad.framework.filedownloader.r r0 = com.kwad.framework.filedownloader.r.a.xN()
            return r0
    }

    public static boolean xK() {
            com.kwad.framework.filedownloader.n r0 = com.kwad.framework.filedownloader.n.xA()
            boolean r0 = r0.isConnected()
            return r0
    }

    public final boolean q(int r3, java.lang.String r4) {
            r2 = this;
            r2.bz(r3)
            com.kwad.framework.filedownloader.n r0 = com.kwad.framework.filedownloader.n.xA()
            boolean r3 = r0.by(r3)
            if (r3 == 0) goto L36
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            r0 = 1
            if (r3 == 0) goto L15
            return r0
        L15:
            java.io.File r3 = new java.io.File
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.bD(r4)
            r3.<init>(r1)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L27
            r3.delete()
        L27:
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L35
            r3.delete()
        L35:
            return r0
        L36:
            r3 = 0
            return r3
    }

    public final void xJ() {
            r2 = this;
            boolean r0 = xK()
            if (r0 != 0) goto L11
            com.kwad.framework.filedownloader.n r0 = com.kwad.framework.filedownloader.n.xA()
            android.content.Context r1 = com.kwad.framework.filedownloader.f.c.zz()
            r0.aG(r1)
        L11:
            return
    }

    final com.kwad.framework.filedownloader.w xL() {
            r2 = this;
            com.kwad.framework.filedownloader.w r0 = r2.amv
            if (r0 != 0) goto L19
            java.lang.Object r0 = com.kwad.framework.filedownloader.r.amu
            monitor-enter(r0)
            com.kwad.framework.filedownloader.w r1 = r2.amv     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.framework.filedownloader.ab r1 = new com.kwad.framework.filedownloader.ab     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r2.amv = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.framework.filedownloader.w r0 = r2.amv
            return r0
    }

    final com.kwad.framework.filedownloader.v xM() {
            r2 = this;
            com.kwad.framework.filedownloader.v r0 = r2.amx
            if (r0 != 0) goto L20
            java.lang.Object r0 = com.kwad.framework.filedownloader.r.amw
            monitor-enter(r0)
            com.kwad.framework.filedownloader.v r1 = r2.amx     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            com.kwad.framework.filedownloader.z r1 = new com.kwad.framework.filedownloader.z     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            r2.amx = r1     // Catch: java.lang.Throwable -> L1a
            com.kwad.framework.filedownloader.v r1 = r2.amx     // Catch: java.lang.Throwable -> L1a
            com.kwad.framework.filedownloader.e r1 = (com.kwad.framework.filedownloader.e) r1     // Catch: java.lang.Throwable -> L1a
            a(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        L20:
            com.kwad.framework.filedownloader.v r0 = r2.amx
            return r0
    }
}
