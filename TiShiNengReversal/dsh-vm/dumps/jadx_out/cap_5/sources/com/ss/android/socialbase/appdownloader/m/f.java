package com.ss.android.socialbase.appdownloader.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {

    static class a implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw b;
        final /* synthetic */ int c;

        a(android.content.Context r1, com.ss.android.socialbase.downloader.ae.cw r2, int r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
                w2.m r1 = r0.d()
                android.content.Context r0 = r9.a
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.socialbase.downloader.ae.cw r2 = r9.b
                int r2 = r2.ae()
                com.ss.android.socialbase.downloader.r.h r0 = r0.g(r2)
                if (r1 != 0) goto L1c
                if (r0 == 0) goto L79
            L1c:
                java.io.File r2 = new java.io.File
                com.ss.android.socialbase.downloader.ae.cw r3 = r9.b
                java.lang.String r3 = r3.qv()
                com.ss.android.socialbase.downloader.ae.cw r4 = r9.b
                java.lang.String r4 = r4.tl()
                r2.<init>(r3, r4)
                boolean r3 = r2.exists()
                if (r3 == 0) goto L79
                com.ss.android.socialbase.downloader.ae.cw r3 = r9.b     // Catch: java.lang.Exception -> L54
                android.content.pm.PackageInfo r2 = com.ss.android.socialbase.appdownloader.b.m(r3, r2)     // Catch: java.lang.Exception -> L54
                if (r2 == 0) goto L79
                int r3 = r9.c     // Catch: java.lang.Exception -> L54
                r8 = 1
                if (r3 == r8) goto L56
                com.ss.android.socialbase.downloader.ae.cw r3 = r9.b     // Catch: java.lang.Exception -> L54
                java.lang.String r3 = r3.la()     // Catch: java.lang.Exception -> L54
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L54
                if (r3 != 0) goto L56
                com.ss.android.socialbase.downloader.ae.cw r2 = r9.b     // Catch: java.lang.Exception -> L54
                java.lang.String r2 = r2.la()     // Catch: java.lang.Exception -> L54
            L52:
                r4 = r2
                goto L59
            L54:
                r0 = move-exception
                goto L76
            L56:
                java.lang.String r2 = r2.packageName     // Catch: java.lang.Exception -> L54
                goto L52
            L59:
                if (r1 == 0) goto L6c
                com.ss.android.socialbase.downloader.ae.cw r2 = r9.b     // Catch: java.lang.Exception -> L54
                int r2 = r2.ae()     // Catch: java.lang.Exception -> L54
                com.ss.android.socialbase.downloader.ae.cw r3 = r9.b     // Catch: java.lang.Exception -> L54
                long r6 = r3.hu()     // Catch: java.lang.Exception -> L54
                r3 = 1
                r5 = -3
                r1.b(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L54
            L6c:
                if (r0 == 0) goto L79
                com.ss.android.socialbase.downloader.ae.cw r1 = r9.b     // Catch: java.lang.Exception -> L54
                java.lang.String r2 = ""
                r0.j(r8, r1, r4, r2)     // Catch: java.lang.Exception -> L54
                return
            L76:
                com.bytedance.sdk.component.utils.vl.j(r0)
            L79:
                return
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.ss.android.socialbase.downloader.ae.cw r0) {
            b(r0)
            return
    }

    private static void b(com.ss.android.socialbase.downloader.ae.cw r4) {
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r1 = r4.tj()
            r2 = 0
            if (r1 == 0) goto L11
            boolean r1 = r4.f()
            if (r1 == 0) goto L31
        L11:
            java.lang.String r1 = r4.h()
            boolean r1 = com.ss.android.socialbase.appdownloader.b.Q(r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = r4.xw()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = r4.xw()
            java.lang.String r3 = "application/vnd.android.package-archive"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L44
        L31:
            int r1 = r4.ae()
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
            java.lang.String r3 = "auto_install_when_resume"
            int r1 = r1.j(r3, r2)
            r3 = 1
            if (r1 == r3) goto L44
            r1 = 2
            goto L4c
        L44:
            int r1 = r4.ae()
            int r1 = com.ss.android.socialbase.appdownloader.b.h(r0, r1, r2)
        L4c:
            java.util.concurrent.ExecutorService r2 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.appdownloader.m.f$a r3 = new com.ss.android.socialbase.appdownloader.m.f$a
            r3.<init>(r0, r4, r1)
            r2.execute(r3)
            return
    }
}
