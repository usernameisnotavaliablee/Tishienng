package com.ss.android.socialbase.downloader.g.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private final java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.r> cw;
    protected int j;
    private final java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.cw> xt;

    /* renamed from: com.ss.android.socialbase.downloader.g.j.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: com.ss.android.socialbase.downloader.g.j.j$j, reason: collision with other inner class name */
    private static final class C0005j {
        private static final com.ss.android.socialbase.downloader.g.j.j j = null;

        static {
                com.ss.android.socialbase.downloader.g.j.j r0 = new com.ss.android.socialbase.downloader.g.j.j
                r1 = 0
                r0.<init>(r1)
                com.ss.android.socialbase.downloader.g.j.j.C0005j.j = r0
                return
        }

        public C0005j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.socialbase.downloader.g.j.j j() {
                com.ss.android.socialbase.downloader.g.j.j r0 = com.ss.android.socialbase.downloader.g.j.j.C0005j.j
                return r0
        }
    }

    private j() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.xt = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 3
            r0.<init>(r1)
            r2.cw = r0
            r2.j = r1
            return
    }

    /* synthetic */ j(com.ss.android.socialbase.downloader.g.j.j.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.socialbase.downloader.g.j.j j() {
            com.ss.android.socialbase.downloader.g.j.j r0 = com.ss.android.socialbase.downloader.g.j.j.C0005j.j()
            return r0
    }

    public com.ss.android.socialbase.downloader.g.j.cw j(java.lang.String r3, java.util.List<com.ss.android.socialbase.downloader.ae.up> r4) {
            r2 = this;
            java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.cw> r0 = r2.xt
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.cw> r1 = r2.xt     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L32
            com.ss.android.socialbase.downloader.g.j.cw r3 = (com.ss.android.socialbase.downloader.g.j.cw) r3     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L30
            java.util.List r0 = r3.tl()
            boolean r4 = com.ss.android.socialbase.downloader.az.m.j(r0, r4)
            if (r4 == 0) goto L2d
            r3.r()     // Catch: java.lang.InterruptedException -> L1c
            goto L20
        L1c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L20:
            boolean r4 = r3.m()
            if (r4 == 0) goto L2d
            boolean r4 = r3.up()
            if (r4 == 0) goto L2d
            return r3
        L2d:
            r3.cw()     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = 0
            return r3
        L32:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
    }

    void j(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    void j(java.lang.String r3, com.ss.android.socialbase.downloader.g.j.cw r4) {
            r2 = this;
            java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.cw> r0 = r2.xt
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.cw> r1 = r2.xt     // Catch: java.lang.Throwable -> La
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public boolean j(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.cw> r0 = r3.xt
            java.lang.Object r4 = r0.get(r4)
            com.ss.android.socialbase.downloader.g.j.cw r4 = (com.ss.android.socialbase.downloader.g.j.cw) r4
            r0 = 0
            if (r4 == 0) goto L20
            boolean r1 = r4.ae()
            r2 = 1
            if (r1 == 0) goto L13
            return r2
        L13:
            boolean r1 = r4.m()
            if (r1 == 0) goto L20
            boolean r4 = r4.up()
            if (r4 == 0) goto L20
            return r2
        L20:
            return r0
    }

    public com.ss.android.socialbase.downloader.g.j.r xt(java.lang.String r3, java.util.List<com.ss.android.socialbase.downloader.ae.up> r4) {
            r2 = this;
            java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.r> r0 = r2.cw
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.ss.android.socialbase.downloader.g.j.r> r1 = r2.cw     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L32
            com.ss.android.socialbase.downloader.g.j.r r3 = (com.ss.android.socialbase.downloader.g.j.r) r3     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L30
            java.util.List r0 = r3.m()
            boolean r4 = com.ss.android.socialbase.downloader.az.m.j(r0, r4)
            if (r4 == 0) goto L2d
            r3.up()     // Catch: java.lang.InterruptedException -> L1c
            goto L20
        L1c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L20:
            boolean r4 = r3.tl()
            if (r4 == 0) goto L2d
            boolean r4 = r3.ae()
            if (r4 == 0) goto L2d
            return r3
        L2d:
            r3.r()     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = 0
            return r3
        L32:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
    }
}
