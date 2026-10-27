package com.ss.android.socialbase.downloader.g;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cw {
    private final android.os.Handler cw;
    private final com.ss.android.socialbase.downloader.az.tl<java.lang.String, com.ss.android.socialbase.downloader.g.cw.xt> j;
    private final android.os.Handler xt;



    /* renamed from: com.ss.android.socialbase.downloader.g.cw$cw, reason: collision with other inner class name */
    private static class C0004cw {
        private static final com.ss.android.socialbase.downloader.g.cw j = null;

        static {
                com.ss.android.socialbase.downloader.g.cw r0 = new com.ss.android.socialbase.downloader.g.cw
                r1 = 0
                r0.<init>(r1)
                com.ss.android.socialbase.downloader.g.cw.C0004cw.j = r0
                return
        }

        public C0004cw() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.socialbase.downloader.g.cw j() {
                com.ss.android.socialbase.downloader.g.cw r0 = com.ss.android.socialbase.downloader.g.cw.C0004cw.j
                return r0
        }
    }

    public interface j {
        void j(java.lang.String r1, java.util.List<java.net.InetAddress> r2);
    }

    private static class xt {
        java.util.List<java.net.InetAddress> j;
        long xt;

        private xt() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ xt(com.ss.android.socialbase.downloader.g.cw.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private cw() {
            r4 = this;
            r4.<init>()
            com.ss.android.socialbase.downloader.az.tl r0 = new com.ss.android.socialbase.downloader.az.tl
            r1 = 16
            r2 = 0
            r3 = 4
            r0.<init>(r3, r1, r2)
            r4.j = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = com.ss.android.socialbase.downloader.g.j.xt.j()
            r0.<init>(r1)
            r4.xt = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = com.ss.android.socialbase.downloader.ws.up.j()
            r0.<init>(r1)
            r4.cw = r0
            return
    }

    /* synthetic */ cw(com.ss.android.socialbase.downloader.g.cw.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.socialbase.downloader.g.cw j() {
            com.ss.android.socialbase.downloader.g.cw r0 = com.ss.android.socialbase.downloader.g.cw.C0004cw.j()
            return r0
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.g.cw r0, java.lang.String r1, com.ss.android.socialbase.downloader.g.cw.j r2, long r3) {
            r0.xt(r1, r2, r3)
            return
    }

    private void j(java.lang.String r4, java.util.List<java.net.InetAddress> r5) {
            r3 = this;
            com.ss.android.socialbase.downloader.az.tl<java.lang.String, com.ss.android.socialbase.downloader.g.cw$xt> r0 = r3.j
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.az.tl<java.lang.String, com.ss.android.socialbase.downloader.g.cw$xt> r1 = r3.j     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L19
            com.ss.android.socialbase.downloader.g.cw$xt r1 = (com.ss.android.socialbase.downloader.g.cw.xt) r1     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            com.ss.android.socialbase.downloader.g.cw$xt r1 = new com.ss.android.socialbase.downloader.g.cw$xt     // Catch: java.lang.Throwable -> L19
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            com.ss.android.socialbase.downloader.az.tl<java.lang.String, com.ss.android.socialbase.downloader.g.cw$xt> r2 = r3.j     // Catch: java.lang.Throwable -> L19
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L25
        L1b:
            r1.j = r5     // Catch: java.lang.Throwable -> L19
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            r1.xt = r4     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    private void xt(java.lang.String r8, com.ss.android.socialbase.downloader.g.cw.j r9, long r10) {
            r7 = this;
            android.net.Uri r0 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r0.getHost()     // Catch: java.lang.Throwable -> L3b
            com.ss.android.socialbase.downloader.az.tl<java.lang.String, com.ss.android.socialbase.downloader.g.cw$xt> r1 = r7.j     // Catch: java.lang.Throwable -> L3b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3b
            com.ss.android.socialbase.downloader.az.tl<java.lang.String, com.ss.android.socialbase.downloader.g.cw$xt> r2 = r7.j     // Catch: java.lang.Throwable -> L95
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L95
            com.ss.android.socialbase.downloader.g.cw$xt r2 = (com.ss.android.socialbase.downloader.g.cw.xt) r2     // Catch: java.lang.Throwable -> L95
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L3d
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "dns_expire_min"
            r4 = 10
            int r1 = r1.j(r3, r4)     // Catch: java.lang.Throwable -> L3b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3b
            long r5 = r2.xt     // Catch: java.lang.Throwable -> L3b
            long r3 = r3 - r5
            r5 = 60000(0xea60, float:8.4078E-41)
            int r1 = r1 * r5
            long r5 = (long) r1     // Catch: java.lang.Throwable -> L3b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3d
            if (r9 == 0) goto L94
            java.util.List<java.net.InetAddress> r10 = r2.j     // Catch: java.lang.Throwable -> L3b
            r9.j(r8, r10)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r8 = move-exception
            goto L98
        L3d:
            com.ss.android.socialbase.downloader.g.cw$2 r1 = new com.ss.android.socialbase.downloader.g.cw$2     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r7, r9, r8, r2)     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r3 = r7.cw     // Catch: java.lang.Throwable -> L3b
            r3.postDelayed(r1, r10)     // Catch: java.lang.Throwable -> L3b
            com.ss.android.socialbase.downloader.jy.j r10 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r11 = "use_host_dns"
            r3 = 1
            int r10 = r10.j(r11, r3)     // Catch: java.lang.Throwable -> L3b
            if (r10 != r3) goto L63
            com.ss.android.socialbase.downloader.g.m r10 = com.ss.android.socialbase.downloader.downloader.cw.tj()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            java.util.List r10 = r10.j(r0)     // Catch: java.lang.Throwable -> L5f
            goto L64
        L5f:
            r10 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r10)     // Catch: java.lang.Throwable -> L3b
        L63:
            r10 = 0
        L64:
            if (r10 == 0) goto L6c
            boolean r11 = r10.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r11 == 0) goto L79
        L6c:
            com.ss.android.socialbase.downloader.g.m r11 = com.ss.android.socialbase.downloader.downloader.cw.f()     // Catch: java.lang.Throwable -> L3b
            java.util.List r10 = r11.j(r0)     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r11 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r11)     // Catch: java.lang.Throwable -> L3b
        L79:
            if (r10 == 0) goto L86
            boolean r11 = r10.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r11 == 0) goto L82
            goto L86
        L82:
            r7.j(r0, r10)     // Catch: java.lang.Throwable -> L3b
            goto L8a
        L86:
            if (r2 == 0) goto L8a
            java.util.List<java.net.InetAddress> r10 = r2.j     // Catch: java.lang.Throwable -> L3b
        L8a:
            android.os.Handler r11 = r7.cw     // Catch: java.lang.Throwable -> L3b
            r11.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L94
            r9.j(r8, r10)     // Catch: java.lang.Throwable -> L3b
        L94:
            return
        L95:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
            throw r8     // Catch: java.lang.Throwable -> L3b
        L98:
            com.bytedance.sdk.component.utils.vl.j(r8)
            return
    }

    public void j(java.lang.String r8, com.ss.android.socialbase.downloader.g.cw.j r9, long r10) {
            r7 = this;
            android.os.Handler r0 = r7.xt
            com.ss.android.socialbase.downloader.g.cw$1 r1 = new com.ss.android.socialbase.downloader.g.cw$1
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            return
    }
}
