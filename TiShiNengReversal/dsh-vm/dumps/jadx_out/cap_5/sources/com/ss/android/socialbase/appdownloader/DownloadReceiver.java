package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DownloadReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String b = "DownloadReceiver";
    private android.os.Handler a;

    class a implements java.lang.Runnable {
        final /* synthetic */ android.content.Intent a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.DownloadReceiver c;

        /* renamed from: com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a, reason: collision with other inner class name */
        class RunnableC0225a implements java.lang.Runnable {
            final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
            final /* synthetic */ com.ss.android.socialbase.appdownloader.DownloadReceiver.a b;

            /* renamed from: com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a$a, reason: collision with other inner class name */
            class RunnableC0226a implements java.lang.Runnable {
                final /* synthetic */ com.ss.android.socialbase.appdownloader.DownloadReceiver.a.RunnableC0225a a;

                RunnableC0226a(com.ss.android.socialbase.appdownloader.DownloadReceiver.a.RunnableC0225a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r1 = this;
                        com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a r0 = r1.a     // Catch: java.lang.Throwable -> L12
                        com.ss.android.socialbase.downloader.ae.cw r0 = r0.a     // Catch: java.lang.Throwable -> L12
                        boolean r0 = r0.ag()     // Catch: java.lang.Throwable -> L12
                        if (r0 == 0) goto L14
                        com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a r0 = r1.a     // Catch: java.lang.Throwable -> L12
                        com.ss.android.socialbase.downloader.ae.cw r0 = r0.a     // Catch: java.lang.Throwable -> L12
                        com.ss.android.socialbase.downloader.az.m.xt(r0)     // Catch: java.lang.Throwable -> L12
                        return
                    L12:
                        r0 = move-exception
                        goto L15
                    L14:
                        return
                    L15:
                        com.bytedance.sdk.component.utils.vl.j(r0)
                        return
                }
            }

            RunnableC0225a(com.ss.android.socialbase.appdownloader.DownloadReceiver.a r1, com.ss.android.socialbase.downloader.ae.cw r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
                    com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a$a r1 = new com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a$a
                    r1.<init>(r2)
                    r0.execute(r1)
                    return
            }
        }

        a(com.ss.android.socialbase.appdownloader.DownloadReceiver r1, android.content.Intent r2, android.content.Context r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                android.content.Intent r0 = r5.a
                android.net.Uri r0 = r0.getData()
                if (r0 != 0) goto La
                goto L9f
            La:
                java.lang.String r0 = r0.getSchemeSpecificPart()
                com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()
                w2.m r1 = r1.d()
                if (r1 == 0) goto L1d
                android.content.Context r2 = r5.b
                r1.j(r2, r0)
            L1d:
                android.content.Context r1 = r5.b
                com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
                java.lang.String r2 = "application/vnd.android.package-archive"
                java.util.List r1 = r1.xt(r2)
                if (r1 == 0) goto L9f
                java.util.Iterator r1 = r1.iterator()
            L2f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L9f
                java.lang.Object r2 = r1.next()
                com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2
                if (r2 == 0) goto L2f
                boolean r3 = com.ss.android.socialbase.appdownloader.b.E(r2, r0)
                if (r3 == 0) goto L2f
                android.content.Context r1 = r5.b
                com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
                int r3 = r2.ae()
                com.ss.android.socialbase.downloader.r.h r1 = r1.g(r3)
                if (r1 == 0) goto L64
                java.lang.String r3 = r1.j()
                boolean r3 = com.ss.android.socialbase.downloader.az.m.m(r3)
                if (r3 == 0) goto L64
                r3 = 9
                java.lang.String r4 = ""
                r1.j(r3, r2, r0, r4)
            L64:
                com.ss.android.socialbase.downloader.notification.xt r1 = com.ss.android.socialbase.downloader.notification.xt.j()
                int r3 = r2.ae()
                com.ss.android.socialbase.downloader.notification.j r1 = r1.up(r3)
                r3 = 0
                if (r1 == 0) goto L77
                r4 = 0
                r1.j(r4, r3)
            L77:
                int r1 = r2.ae()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
                java.lang.String r4 = "install_queue_enable"
                int r1 = r1.j(r4, r3)
                r3 = 1
                if (r1 != r3) goto L8f
                com.ss.android.socialbase.appdownloader.g r1 = com.ss.android.socialbase.appdownloader.g.f()
                r1.i(r2, r0)
            L8f:
                com.ss.android.socialbase.appdownloader.DownloadReceiver r0 = r5.c
                android.os.Handler r0 = com.ss.android.socialbase.appdownloader.DownloadReceiver.a(r0)
                com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a r1 = new com.ss.android.socialbase.appdownloader.DownloadReceiver$a$a
                r1.<init>(r5, r2)
                r2 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r1, r2)
            L9f:
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.DownloadReceiver c;

        b(com.ss.android.socialbase.appdownloader.DownloadReceiver r1, android.content.Context r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L14
                android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L14
                java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r2 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.class
                r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
                java.lang.String r1 = r3.b     // Catch: java.lang.Throwable -> L14
                r0.setAction(r1)     // Catch: java.lang.Throwable -> L14
                android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L14
                r1.startService(r0)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                return
        }
    }

    static {
            return
    }

    public DownloadReceiver() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.a = r0
            return
    }

    static /* synthetic */ android.os.Handler a(com.ss.android.socialbase.appdownloader.DownloadReceiver r0) {
            android.os.Handler r0 = r0.a
            return r0
    }

    private void b(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.rn()
            if (r0 != 0) goto L7
            return
        L7:
            com.ss.android.socialbase.appdownloader.DownloadReceiver$b r0 = new com.ss.android.socialbase.appdownloader.DownloadReceiver$b
            r0.<init>(r2, r3, r4)
            r3 = 2000(0x7d0, double:9.88E-321)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.ss.android.socialbase.downloader.downloader.cw.j(r0, r3, r1)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            if (r3 == 0) goto L45
            if (r4 != 0) goto L5
            goto L45
        L5:
            java.lang.String r0 = r4.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L10
            goto L45
        L10:
            java.lang.String r1 = "android.intent.action.MEDIA_MOUNTED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L29
            boolean r4 = com.ss.android.socialbase.downloader.m.j.j()
            if (r4 == 0) goto L25
            java.lang.String r4 = com.ss.android.socialbase.appdownloader.DownloadReceiver.b
            java.lang.String r1 = "Received broadcast intent for android.intent.action.MEDIA_MOUNTED"
            com.ss.android.socialbase.downloader.m.j.j(r4, r1)
        L25:
            r2.b(r3, r0)
            return
        L29:
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L39
            java.lang.String r1 = "android.intent.action.PACKAGE_REPLACED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
        L39:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.appdownloader.DownloadReceiver$a r1 = new com.ss.android.socialbase.appdownloader.DownloadReceiver$a
            r1.<init>(r2, r4, r3)
            r0.execute(r1)
        L45:
            return
    }
}
