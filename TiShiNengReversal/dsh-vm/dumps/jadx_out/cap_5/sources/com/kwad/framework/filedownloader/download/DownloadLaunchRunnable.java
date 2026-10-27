package com.kwad.framework.filedownloader.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class DownloadLaunchRunnable implements com.kwad.framework.filedownloader.download.f, java.lang.Runnable {
    private static final java.util.concurrent.ThreadPoolExecutor anE = null;
    private final boolean anA;
    private final java.util.ArrayList<com.kwad.framework.filedownloader.download.c> anB;
    private com.kwad.framework.filedownloader.download.e anC;
    private boolean anD;
    private boolean anF;
    private boolean anG;
    private boolean anH;
    private final java.util.concurrent.atomic.AtomicBoolean anI;
    private volatile boolean anJ;
    private volatile java.lang.Exception anK;
    private java.lang.String anL;
    private long anM;
    private long anN;
    private long anO;
    private long anP;
    private final com.kwad.framework.filedownloader.b.a ano;
    private final com.kwad.framework.filedownloader.download.d anr;
    private final int ans;
    private final com.kwad.framework.filedownloader.d.c ant;
    private final com.kwad.framework.filedownloader.d.b anu;
    private final boolean anv;
    private final boolean anw;
    private final com.kwad.framework.filedownloader.y anx;
    private boolean any;
    int anz;
    private volatile boolean nf;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class DiscardSafely extends java.lang.Throwable {
        private static final long serialVersionUID = 4243896780616180062L;
        final /* synthetic */ com.kwad.framework.filedownloader.download.DownloadLaunchRunnable this$0;

        DiscardSafely(com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class RetryDirectly extends java.lang.Throwable {
        private static final long serialVersionUID = -4127585119566978768L;
        final /* synthetic */ com.kwad.framework.filedownloader.download.DownloadLaunchRunnable this$0;

        RetryDirectly(com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private java.lang.Integer anQ;
        private java.lang.Integer anR;
        private java.lang.Boolean anS;
        private java.lang.Boolean anT;
        private java.lang.Integer anU;
        private com.kwad.framework.filedownloader.d.b ana;
        private com.kwad.framework.filedownloader.d.c ant;
        private com.kwad.framework.filedownloader.y anx;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a a(com.kwad.framework.filedownloader.y r1) {
                r0 = this;
                r0.anx = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a a(java.lang.Boolean r1) {
                r0 = this;
                r0.anS = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a b(com.kwad.framework.filedownloader.d.b r1) {
                r0 = this;
                r0.ana = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a b(java.lang.Boolean r1) {
                r0 = this;
                r0.anT = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a e(com.kwad.framework.filedownloader.d.c r1) {
                r0 = this;
                r0.ant = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a f(java.lang.Integer r1) {
                r0 = this;
                r0.anQ = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a g(java.lang.Integer r1) {
                r0 = this;
                r0.anR = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.a h(java.lang.Integer r1) {
                r0 = this;
                r0.anU = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.DownloadLaunchRunnable ys() {
                r11 = this;
                com.kwad.framework.filedownloader.d.c r0 = r11.ant
                if (r0 == 0) goto L47
                com.kwad.framework.filedownloader.y r0 = r11.anx
                if (r0 == 0) goto L47
                java.lang.Integer r0 = r11.anQ
                if (r0 == 0) goto L47
                java.lang.Integer r0 = r11.anR
                if (r0 == 0) goto L47
                java.lang.Boolean r0 = r11.anS
                if (r0 == 0) goto L47
                java.lang.Boolean r0 = r11.anT
                if (r0 == 0) goto L47
                java.lang.Integer r0 = r11.anU
                if (r0 == 0) goto L47
                com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r1 = new com.kwad.framework.filedownloader.download.DownloadLaunchRunnable
                com.kwad.framework.filedownloader.d.c r2 = r11.ant
                com.kwad.framework.filedownloader.d.b r3 = r11.ana
                com.kwad.framework.filedownloader.y r4 = r11.anx
                java.lang.Integer r0 = r11.anQ
                int r5 = r0.intValue()
                java.lang.Integer r0 = r11.anR
                int r6 = r0.intValue()
                java.lang.Boolean r0 = r11.anS
                boolean r7 = r0.booleanValue()
                java.lang.Boolean r0 = r11.anT
                boolean r8 = r0.booleanValue()
                java.lang.Integer r0 = r11.anU
                int r9 = r0.intValue()
                r10 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
            L47:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }
    }

    static {
            java.lang.String r0 = "ConnectionBlock"
            java.util.concurrent.ThreadPoolExecutor r0 = com.kwad.framework.filedownloader.f.b.bA(r0)
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.anE = r0
            return
    }

    private DownloadLaunchRunnable(com.kwad.framework.filedownloader.d.c r3, com.kwad.framework.filedownloader.d.b r4, com.kwad.framework.filedownloader.y r5, int r6, int r7, boolean r8, boolean r9, int r10) {
            r2 = this;
            r2.<init>()
            r0 = 5
            r2.ans = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.anB = r1
            r0 = 0
            r2.anM = r0
            r2.anN = r0
            r2.anO = r0
            r2.anP = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.anI = r0
            r0 = 0
            r2.nf = r0
            r2.any = r0
            r2.ant = r3
            r2.anu = r4
            r2.anv = r8
            r2.anw = r9
            com.kwad.framework.filedownloader.download.b r4 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.b.a r4 = r4.ye()
            r2.ano = r4
            com.kwad.framework.filedownloader.download.b r4 = com.kwad.framework.filedownloader.download.b.yc()
            boolean r4 = r4.yg()
            r2.anA = r4
            r2.anx = r5
            r2.anz = r10
            com.kwad.framework.filedownloader.download.d r4 = new com.kwad.framework.filedownloader.download.d
            r4.<init>(r3, r10, r6, r7)
            r2.anr = r4
            return
    }

    /* synthetic */ DownloadLaunchRunnable(com.kwad.framework.filedownloader.d.c r1, com.kwad.framework.filedownloader.d.b r2, com.kwad.framework.filedownloader.y r3, int r4, int r5, boolean r6, boolean r7, int r8, byte r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private void a(int r3, java.util.List<com.kwad.framework.filedownloader.d.a> r4) {
            r2 = this;
            r0 = 1
            if (r3 <= r0) goto L13
            int r0 = r4.size()
            if (r0 != r3) goto L13
            com.kwad.framework.filedownloader.d.c r3 = r2.ant
            long r0 = r3.getTotal()
            r2.b(r4, r0)
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    private void a(long r11, java.lang.String r13) {
            r10 = this;
            r0 = -1
            r2 = 0
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 == 0) goto L3f
            com.kwad.framework.filedownloader.d.c r0 = r10.ant     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r0.yr()     // Catch: java.lang.Throwable -> L30
            com.kwad.framework.filedownloader.e.a r2 = com.kwad.framework.filedownloader.f.f.bJ(r0)     // Catch: java.lang.Throwable -> L30
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L30
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L30
            long r8 = r0.length()     // Catch: java.lang.Throwable -> L30
            long r6 = r11 - r8
            long r4 = com.kwad.sdk.crash.utils.h.getAvailableBytes(r13)     // Catch: java.lang.Throwable -> L30
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 < 0) goto L33
            com.kwad.framework.filedownloader.f.e r13 = com.kwad.framework.filedownloader.f.e.zB()     // Catch: java.lang.Throwable -> L30
            boolean r13 = r13.apJ     // Catch: java.lang.Throwable -> L30
            if (r13 != 0) goto L3f
            r2.setLength(r11)     // Catch: java.lang.Throwable -> L30
            goto L3f
        L30:
            r0 = move-exception
            r11 = r0
            goto L39
        L33:
            com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException r3 = new com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException     // Catch: java.lang.Throwable -> L30
            r3.<init>(r4, r6, r8)     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L30
        L39:
            if (r2 == 0) goto L3e
            r2.close()
        L3e:
            throw r11
        L3f:
            if (r2 == 0) goto L44
            r2.close()
        L44:
            return
    }

    private void a(com.kwad.framework.filedownloader.download.a r13, com.kwad.framework.filedownloader.a.b r14) {
            r12 = this;
            boolean r0 = r12.anG
            if (r0 != 0) goto L19
            com.kwad.framework.filedownloader.d.c r0 = r12.ant
            r1 = 0
            r0.Z(r1)
            com.kwad.framework.filedownloader.download.a r3 = new com.kwad.framework.filedownloader.download.a
            long r8 = r13.anj
            long r10 = r13.contentLength
            r4 = 0
            r6 = 0
            r3.<init>(r4, r6, r8, r10)
            r13 = r3
        L19:
            com.kwad.framework.filedownloader.download.e$a r0 = new com.kwad.framework.filedownloader.download.e$a
            r0.<init>()
            com.kwad.framework.filedownloader.download.e$a r1 = r0.b(r12)
            com.kwad.framework.filedownloader.d.c r2 = r12.ant
            int r2 = r2.getId()
            com.kwad.framework.filedownloader.download.e$a r1 = r1.bP(r2)
            r2 = -1
            com.kwad.framework.filedownloader.download.e$a r1 = r1.bO(r2)
            boolean r2 = r12.anw
            com.kwad.framework.filedownloader.download.e$a r1 = r1.bi(r2)
            com.kwad.framework.filedownloader.download.e$a r14 = r1.d(r14)
            com.kwad.framework.filedownloader.download.e$a r13 = r14.c(r13)
            com.kwad.framework.filedownloader.d.c r14 = r12.ant
            java.lang.String r14 = r14.yr()
            r13.bv(r14)
            com.kwad.framework.filedownloader.d.c r13 = r12.ant
            r14 = 1
            r13.bW(r14)
            com.kwad.framework.filedownloader.b.a r13 = r12.ano
            com.kwad.framework.filedownloader.d.c r1 = r12.ant
            int r1 = r1.getId()
            r13.t(r1, r14)
            com.kwad.framework.filedownloader.download.e r13 = r0.yG()
            r12.anC = r13
            boolean r13 = r12.nf
            if (r13 == 0) goto L6f
            com.kwad.framework.filedownloader.d.c r13 = r12.ant
            r14 = -2
            r13.d(r14)
            com.kwad.framework.filedownloader.download.e r13 = r12.anC
            r13.pause()
            return
        L6f:
            com.kwad.framework.filedownloader.download.e r13 = r12.anC
            r13.run()
            return
    }

    private void a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r17, com.kwad.framework.filedownloader.download.ConnectTask r18, com.kwad.framework.filedownloader.a.b r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            com.kwad.framework.filedownloader.d.c r2 = r0.ant
            int r4 = r2.getId()
            int r2 = r1.getResponseCode()
            r3 = 206(0xce, float:2.89E-43)
            r5 = 0
            r6 = 1
            if (r2 == r3) goto L19
            if (r2 != r6) goto L17
            goto L19
        L17:
            r3 = 0
            goto L1a
        L19:
            r3 = 1
        L1a:
            r0.anG = r3
            r3 = 200(0xc8, float:2.8E-43)
            r7 = 201(0xc9, float:2.82E-43)
            if (r2 == r3) goto L29
            if (r2 == r7) goto L29
            if (r2 != 0) goto L27
            goto L29
        L27:
            r3 = 0
            goto L2a
        L29:
            r3 = 1
        L2a:
            com.kwad.framework.filedownloader.d.c r8 = r0.ant
            java.lang.String r8 = r8.za()
            java.lang.String r13 = com.kwad.framework.filedownloader.f.f.a(r4, r1)
            r9 = 412(0x19c, float:5.77E-43)
            r10 = 0
            r11 = 0
            if (r2 != r9) goto L3c
            goto L62
        L3c:
            if (r8 == 0) goto L4b
            boolean r9 = r8.equals(r13)
            if (r9 != 0) goto L4b
            if (r3 != 0) goto L62
            boolean r9 = r0.anG
            if (r9 == 0) goto L4b
            goto L62
        L4b:
            if (r2 != r7) goto L54
            boolean r7 = r18.xY()
            if (r7 == 0) goto L54
            goto L62
        L54:
            r7 = 416(0x1a0, float:5.83E-43)
            if (r2 != r7) goto Lf3
            com.kwad.framework.filedownloader.d.c r7 = r0.ant
            long r14 = r7.yZ()
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 <= 0) goto Lf3
        L62:
            boolean r1 = r0.anF
            r3 = 3
            r7 = 2
            r9 = 4
            if (r1 == 0) goto L80
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r15[r5] = r1
            r15[r6] = r8
            r15[r7] = r13
            r15[r3] = r14
            java.lang.String r1 = "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response requestHttpCode is %d"
            com.kwad.framework.filedownloader.f.d.d(r0, r1, r15)
        L80:
            com.kwad.framework.filedownloader.b.a r1 = r0.ano
            com.kwad.framework.filedownloader.d.c r14 = r0.ant
            int r14 = r14.getId()
            r1.bF(r14)
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            java.lang.String r1 = r1.getTargetFilePath()
            com.kwad.framework.filedownloader.d.c r14 = r0.ant
            java.lang.String r14 = r14.yr()
            com.kwad.framework.filedownloader.f.f.C(r1, r14)
            r0.anF = r5
            if (r8 == 0) goto Lbc
            boolean r1 = r8.equals(r13)
            if (r1 == 0) goto Lbc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r5] = r8
            r9[r6] = r13
            r9[r7] = r1
            r9[r3] = r2
            java.lang.String r1 = "the old etag[%s] is the same to the new etag[%s], but the response status requestHttpCode is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!"
            com.kwad.framework.filedownloader.f.d.d(r0, r1, r9)
            r13 = r10
        Lbc:
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            r1.Z(r11)
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            r1.ab(r11)
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            r1.bx(r13)
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            r1.zd()
            com.kwad.framework.filedownloader.b.a r3 = r0.ano
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            java.lang.String r5 = r1.za()
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            long r6 = r1.yZ()
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            long r8 = r1.getTotal()
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            int r10 = r1.zc()
            r3.a(r4, r5, r6, r8, r10)
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$RetryDirectly r1 = new com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$RetryDirectly
            r1.<init>(r0)
            throw r1
        Lf3:
            java.lang.String r7 = r18.xZ()
            r0.anL = r7
            boolean r7 = r0.anG
            if (r7 != 0) goto L10c
            if (r3 == 0) goto L100
            goto L10c
        L100:
            com.kwad.framework.filedownloader.exception.FileDownloadHttpException r3 = new com.kwad.framework.filedownloader.exception.FileDownloadHttpException
            java.util.Map r1 = r1.xR()
            r4 = r17
            r3.<init>(r2, r4, r1)
            throw r3
        L10c:
            long r2 = com.kwad.framework.filedownloader.f.f.b(r4, r1)
            com.kwad.framework.filedownloader.d.c r4 = r0.ant
            boolean r4 = r4.wF()
            if (r4 == 0) goto L122
            com.kwad.framework.filedownloader.d.c r4 = r0.ant
            java.lang.String r4 = r4.getUrl()
            java.lang.String r10 = com.kwad.framework.filedownloader.f.f.a(r1, r4)
        L122:
            r14 = r10
            r7 = -1
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 != 0) goto L12b
            r1 = 1
            goto L12c
        L12b:
            r1 = 0
        L12c:
            r0.anH = r1
            if (r1 != 0) goto L137
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            long r7 = r1.yZ()
            long r2 = r2 + r7
        L137:
            r11 = r2
            com.kwad.framework.filedownloader.download.d r9 = r0.anr
            boolean r1 = r0.anF
            if (r1 == 0) goto L144
            boolean r1 = r0.anG
            if (r1 == 0) goto L144
            r10 = 1
            goto L145
        L144:
            r10 = 0
        L145:
            r9.a(r10, r11, r13, r14)
            return
    }

    private void b(java.util.List<com.kwad.framework.filedownloader.d.a> r28, long r29) {
            r27 = this;
            r0 = r27
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            int r1 = r1.getId()
            com.kwad.framework.filedownloader.d.c r2 = r0.ant
            java.lang.String r2 = r2.za()
            java.lang.String r3 = r0.anL
            if (r3 == 0) goto L13
            goto L19
        L13:
            com.kwad.framework.filedownloader.d.c r3 = r0.ant
            java.lang.String r3 = r3.getUrl()
        L19:
            com.kwad.framework.filedownloader.d.c r4 = r0.ant
            java.lang.String r4 = r4.yr()
            boolean r5 = com.kwad.framework.filedownloader.f.d.apD
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L44
            int r5 = r28.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Long r11 = java.lang.Long.valueOf(r29)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r9] = r5
            r12[r8] = r10
            r12[r7] = r11
            java.lang.String r5 = "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]"
            com.kwad.framework.filedownloader.f.d.c(r0, r5, r12)
        L44:
            boolean r5 = r0.anF
            java.util.Iterator r10 = r28.iterator()
            r11 = 0
            r13 = r11
        L4d:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L118
            java.lang.Object r15 = r10.next()
            com.kwad.framework.filedownloader.d.a r15 = (com.kwad.framework.filedownloader.d.a) r15
            long r16 = r15.yW()
            int r18 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r18 != 0) goto L6a
            long r16 = r15.yV()
            long r16 = r29 - r16
        L67:
            r25 = r16
            goto L79
        L6a:
            long r16 = r15.yW()
            long r18 = r15.yV()
            long r16 = r16 - r18
            r18 = 1
            long r16 = r16 + r18
            goto L67
        L79:
            long r16 = r15.yV()
            long r18 = r15.getStartOffset()
            long r16 = r16 - r18
            long r13 = r13 + r16
            int r16 = (r25 > r11 ? 1 : (r25 == r11 ? 0 : -1))
            if (r16 != 0) goto Lae
            boolean r16 = com.kwad.framework.filedownloader.f.d.apD
            if (r16 == 0) goto Lab
            int r16 = r15.getId()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            int r15 = r15.getIndex()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r17 = 0
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r17] = r16
            r9[r8] = r15
            java.lang.String r15 = "pass connection[%d-%d], because it has been completed"
            com.kwad.framework.filedownloader.f.d.c(r0, r15, r9)
            goto L113
        Lab:
            r17 = 0
            goto L113
        Lae:
            r17 = 0
            com.kwad.framework.filedownloader.download.c$a r9 = new com.kwad.framework.filedownloader.download.c$a
            r9.<init>()
            com.kwad.framework.filedownloader.download.a r18 = new com.kwad.framework.filedownloader.download.a
            long r19 = r15.getStartOffset()
            long r21 = r15.yV()
            long r23 = r15.yW()
            r18.<init>(r19, r21, r23, r25)
            r11 = r18
            com.kwad.framework.filedownloader.download.c$a r9 = r9.bM(r1)
            int r12 = r15.getIndex()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.kwad.framework.filedownloader.download.c$a r9 = r9.i(r12)
            com.kwad.framework.filedownloader.download.c$a r9 = r9.a(r0)
            com.kwad.framework.filedownloader.download.c$a r9 = r9.bs(r3)
            if (r5 == 0) goto Le4
            r12 = r2
            goto Le5
        Le4:
            r12 = 0
        Le5:
            com.kwad.framework.filedownloader.download.c$a r9 = r9.bt(r12)
            com.kwad.framework.filedownloader.d.b r12 = r0.anu
            com.kwad.framework.filedownloader.download.c$a r9 = r9.c(r12)
            boolean r12 = r0.anw
            com.kwad.framework.filedownloader.download.c$a r9 = r9.bg(r12)
            com.kwad.framework.filedownloader.download.c$a r9 = r9.b(r11)
            com.kwad.framework.filedownloader.download.c$a r9 = r9.bu(r4)
            com.kwad.framework.filedownloader.download.c r9 = r9.yt()
            boolean r11 = com.kwad.framework.filedownloader.f.d.apD
            if (r11 == 0) goto L10e
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r17] = r15
            java.lang.String r12 = "enable multiple connection: %s"
            com.kwad.framework.filedownloader.f.d.c(r0, r12, r11)
        L10e:
            java.util.ArrayList<com.kwad.framework.filedownloader.download.c> r11 = r0.anB
            r11.add(r9)
        L113:
            r9 = 0
            r11 = 0
            goto L4d
        L118:
            r17 = 0
            com.kwad.framework.filedownloader.d.c r2 = r0.ant
            long r2 = r2.yZ()
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 == 0) goto L142
            com.kwad.framework.filedownloader.d.c r2 = r0.ant
            long r2 = r2.yZ()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r17] = r2
            r4[r8] = r3
            java.lang.String r2 = "correct the sofar[%d] from connection table[%d]"
            com.kwad.framework.filedownloader.f.d.d(r0, r2, r4)
            com.kwad.framework.filedownloader.d.c r2 = r0.ant
            r2.Z(r13)
        L142:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList<com.kwad.framework.filedownloader.download.c> r3 = r0.anB
            int r3 = r3.size()
            r2.<init>(r3)
            java.util.ArrayList<com.kwad.framework.filedownloader.download.c> r3 = r0.anB
            java.util.Iterator r3 = r3.iterator()
        L153:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L16f
            java.lang.Object r4 = r3.next()
            com.kwad.framework.filedownloader.download.c r4 = (com.kwad.framework.filedownloader.download.c) r4
            boolean r5 = r0.nf
            if (r5 == 0) goto L167
            r4.pause()
            goto L153
        L167:
            java.util.concurrent.Callable r4 = java.util.concurrent.Executors.callable(r4)
            r2.add(r4)
            goto L153
        L16f:
            boolean r3 = r0.nf
            if (r3 == 0) goto L17a
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            r2 = -2
            r1.d(r2)
            return
        L17a:
            java.util.concurrent.ThreadPoolExecutor r3 = com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.anE
            java.util.List r2 = r3.invokeAll(r2)
            boolean r3 = com.kwad.framework.filedownloader.f.d.apD
            if (r3 == 0) goto L1b6
            java.util.Iterator r2 = r2.iterator()
        L188:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1b6
            java.lang.Object r3 = r2.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r5 = r3.isDone()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r3 = r3.isCancelled()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r17] = r4
            r9[r8] = r5
            r9[r7] = r3
            java.lang.String r3 = "finish sub-task for [%d] %B %B"
            com.kwad.framework.filedownloader.f.d.c(r0, r3, r9)
            goto L188
        L1b6:
            return
    }

    private void d(long r18, int r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            long r4 = (long) r3
            long r4 = r1 / r4
            com.kwad.framework.filedownloader.d.c r6 = r0.ant
            int r6 = r6.getId()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            r10 = 0
            r11 = r8
        L18:
            if (r10 >= r3) goto L45
            int r13 = r3 + (-1)
            if (r10 != r13) goto L20
            r13 = r8
            goto L25
        L20:
            long r13 = r11 + r4
            r15 = 1
            long r13 = r13 - r15
        L25:
            com.kwad.framework.filedownloader.d.a r15 = new com.kwad.framework.filedownloader.d.a
            r15.<init>()
            r15.setId(r6)
            r15.setIndex(r10)
            r15.setStartOffset(r11)
            r15.X(r11)
            r15.Y(r13)
            r7.add(r15)
            com.kwad.framework.filedownloader.b.a r13 = r0.ano
            r13.a(r15)
            long r11 = r11 + r4
            int r10 = r10 + 1
            goto L18
        L45:
            com.kwad.framework.filedownloader.d.c r4 = r0.ant
            r4.bW(r3)
            com.kwad.framework.filedownloader.b.a r4 = r0.ano
            r4.t(r6, r3)
            r0.b(r7, r1)
            return
    }

    private com.kwad.framework.filedownloader.download.a r(java.util.List<com.kwad.framework.filedownloader.d.a> r21) {
            r20 = this;
            r0 = r20
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            int r1 = r1.zc()
            com.kwad.framework.filedownloader.d.c r2 = r0.ant
            java.lang.String r2 = r2.yr()
            com.kwad.framework.filedownloader.d.c r3 = r0.ant
            java.lang.String r3 = r3.getTargetFilePath()
            r4 = 0
            r5 = 1
            if (r1 <= r5) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            r7 = 0
            if (r6 == 0) goto L23
            boolean r9 = r0.anA
            if (r9 == 0) goto L54
        L23:
            com.kwad.framework.filedownloader.d.c r9 = r0.ant
            int r9 = r9.getId()
            com.kwad.framework.filedownloader.d.c r10 = r0.ant
            boolean r9 = com.kwad.framework.filedownloader.f.f.b(r9, r10)
            if (r9 == 0) goto L54
            boolean r9 = r0.anA
            if (r9 != 0) goto L40
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            long r9 = r1.length()
        L3e:
            r14 = r9
            goto L55
        L40:
            if (r6 == 0) goto L4d
            int r6 = r21.size()
            if (r1 != r6) goto L54
            long r9 = com.kwad.framework.filedownloader.d.a.s(r21)
            goto L3e
        L4d:
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            long r9 = r1.yZ()
            goto L3e
        L54:
            r14 = r7
        L55:
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            r1.Z(r14)
            int r1 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r1 <= 0) goto L5f
            r4 = 1
        L5f:
            r0.anF = r4
            if (r4 != 0) goto L71
            com.kwad.framework.filedownloader.b.a r1 = r0.ano
            com.kwad.framework.filedownloader.d.c r4 = r0.ant
            int r4 = r4.getId()
            r1.bF(r4)
            com.kwad.framework.filedownloader.f.f.C(r3, r2)
        L71:
            com.kwad.framework.filedownloader.download.a r11 = new com.kwad.framework.filedownloader.download.a
            com.kwad.framework.filedownloader.d.c r1 = r0.ant
            long r1 = r1.getTotal()
            long r18 = r1 - r14
            r12 = 0
            r16 = 0
            r11.<init>(r12, r14, r16, r18)
            return r11
    }

    private boolean yn() {
            r3 = this;
            boolean r0 = r3.anF
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            com.kwad.framework.filedownloader.d.c r0 = r3.ant
            int r0 = r0.zc()
            if (r0 > r2) goto Lf
            return r1
        Lf:
            boolean r0 = r3.anG
            if (r0 == 0) goto L1c
            boolean r0 = r3.anA
            if (r0 == 0) goto L1c
            boolean r0 = r3.anH
            if (r0 != 0) goto L1c
            return r2
        L1c:
            return r1
    }

    private void yp() {
            r5 = this;
            boolean r0 = r5.anw
            if (r0 == 0) goto L2c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.kwad.framework.filedownloader.f.f.bH(r0)
            if (r1 == 0) goto Ld
            goto L2c
        Ld:
            com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException r1 = new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException
            com.kwad.framework.filedownloader.d.c r2 = r5.ant
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r2 = 1
            r3[r2] = r0
            java.lang.String r0 = "Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection."
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r3)
            r1.<init>(r0)
            throw r1
        L2c:
            boolean r0 = r5.anw
            if (r0 == 0) goto L3d
            boolean r0 = com.kwad.framework.filedownloader.f.f.zG()
            if (r0 != 0) goto L37
            goto L3d
        L37:
            com.kwad.framework.filedownloader.exception.FileDownloadNetworkPolicyException r0 = new com.kwad.framework.filedownloader.exception.FileDownloadNetworkPolicyException
            r0.<init>()
            throw r0
        L3d:
            return
    }

    private void yq() {
            r7 = this;
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            int r1 = r0.getId()
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            boolean r0 = r0.wF()
            if (r0 == 0) goto Le7
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            java.lang.String r5 = r0.getTargetFilePath()
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            java.lang.String r0 = r0.getUrl()
            int r0 = com.kwad.framework.filedownloader.f.f.B(r0, r5)
            boolean r2 = r7.anv
            r3 = 0
            boolean r2 = com.kwad.framework.filedownloader.f.c.a(r1, r5, r2, r3)
            if (r2 != 0) goto Ld7
            com.kwad.framework.filedownloader.b.a r2 = r7.ano
            com.kwad.framework.filedownloader.d.c r2 = r2.bD(r0)
            if (r2 == 0) goto Lb2
            com.kwad.framework.filedownloader.y r4 = r7.anx
            boolean r3 = com.kwad.framework.filedownloader.f.c.a(r1, r2, r4, r3)
            if (r3 != 0) goto La2
            com.kwad.framework.filedownloader.b.a r3 = r7.ano
            java.util.List r3 = r3.bE(r0)
            com.kwad.framework.filedownloader.b.a r4 = r7.ano
            r4.bG(r0)
            com.kwad.framework.filedownloader.b.a r4 = r7.ano
            r4.bF(r0)
            com.kwad.framework.filedownloader.d.c r4 = r7.ant
            java.lang.String r4 = r4.getTargetFilePath()
            com.kwad.framework.filedownloader.f.f.bL(r4)
            boolean r0 = com.kwad.framework.filedownloader.f.f.b(r0, r2)
            if (r0 == 0) goto Lb2
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            long r4 = r2.yZ()
            r0.Z(r4)
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            long r4 = r2.getTotal()
            r0.ab(r4)
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            java.lang.String r4 = r2.za()
            r0.bx(r4)
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            int r2 = r2.zc()
            r0.bW(r2)
            com.kwad.framework.filedownloader.b.a r0 = r7.ano
            com.kwad.framework.filedownloader.d.c r2 = r7.ant
            r0.b(r2)
            if (r3 == 0) goto L9c
            java.util.Iterator r0 = r3.iterator()
        L87:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r0.next()
            com.kwad.framework.filedownloader.d.a r2 = (com.kwad.framework.filedownloader.d.a) r2
            r2.setId(r1)
            com.kwad.framework.filedownloader.b.a r3 = r7.ano
            r3.a(r2)
            goto L87
        L9c:
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$RetryDirectly r0 = new com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$RetryDirectly
            r0.<init>(r7)
            throw r0
        La2:
            com.kwad.framework.filedownloader.b.a r0 = r7.ano
            r0.bG(r1)
            com.kwad.framework.filedownloader.b.a r0 = r7.ano
            r0.bF(r1)
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$DiscardSafely r0 = new com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$DiscardSafely
            r0.<init>(r7)
            throw r0
        Lb2:
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            long r2 = r0.yZ()
            com.kwad.framework.filedownloader.d.c r0 = r7.ant
            java.lang.String r4 = r0.yr()
            com.kwad.framework.filedownloader.y r6 = r7.anx
            boolean r0 = com.kwad.framework.filedownloader.f.c.a(r1, r2, r4, r5, r6)
            if (r0 != 0) goto Lc7
            goto Le7
        Lc7:
            com.kwad.framework.filedownloader.b.a r0 = r7.ano
            r0.bG(r1)
            com.kwad.framework.filedownloader.b.a r0 = r7.ano
            r0.bF(r1)
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$DiscardSafely r0 = new com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$DiscardSafely
            r0.<init>(r7)
            throw r0
        Ld7:
            com.kwad.framework.filedownloader.b.a r0 = r7.ano
            r0.bG(r1)
            com.kwad.framework.filedownloader.b.a r0 = r7.ano
            r0.bF(r1)
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$DiscardSafely r0 = new com.kwad.framework.filedownloader.download.DownloadLaunchRunnable$DiscardSafely
            r0.<init>(r7)
            throw r0
        Le7:
            return
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void a(com.kwad.framework.filedownloader.download.c r12, long r13, long r15) {
            r11 = this;
            boolean r0 = r11.nf
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            boolean r12 = com.kwad.framework.filedownloader.f.d.apD
            if (r12 == 0) goto L8f
            java.lang.String r12 = "the task[%d] has already been paused, so pass the completed callback"
            com.kwad.framework.filedownloader.d.c r13 = r11.ant
            int r13 = r13.getId()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r1] = r13
            com.kwad.framework.filedownloader.f.d.c(r11, r12, r14)
            return
        L1e:
            if (r12 != 0) goto L22
            r0 = -1
            goto L24
        L22:
            int r0 = r12.anY
        L24:
            boolean r3 = com.kwad.framework.filedownloader.f.d.apD
            r4 = 3
            r5 = 2
            r6 = 4
            if (r3 == 0) goto L50
            java.lang.String r3 = "the connection has been completed(%d): [%d, %d)  %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            java.lang.Long r8 = java.lang.Long.valueOf(r15)
            com.kwad.framework.filedownloader.d.c r9 = r11.ant
            long r9 = r9.getTotal()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r1] = r0
            r10[r2] = r7
            r10[r5] = r8
            r10[r4] = r9
            com.kwad.framework.filedownloader.f.d.c(r11, r3, r10)
        L50:
            boolean r0 = r11.anD
            if (r0 == 0) goto L90
            r7 = 0
            int r12 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r12 == 0) goto L8f
            com.kwad.framework.filedownloader.d.c r12 = r11.ant
            long r7 = r12.getTotal()
            int r12 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r12 == 0) goto L8f
            java.lang.String r12 = "the single task not completed corrected(%d, %d != %d) for task(%d)"
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.Long r14 = java.lang.Long.valueOf(r15)
            com.kwad.framework.filedownloader.d.c r0 = r11.ant
            long r7 = r0.getTotal()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            com.kwad.framework.filedownloader.d.c r3 = r11.ant
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r13
            r6[r2] = r14
            r6[r5] = r0
            r6[r4] = r3
            com.kwad.framework.filedownloader.f.d.a(r11, r12, r6)
        L8f:
            return
        L90:
            java.util.ArrayList<com.kwad.framework.filedownloader.download.c> r13 = r11.anB
            monitor-enter(r13)
            java.util.ArrayList<com.kwad.framework.filedownloader.download.c> r14 = r11.anB     // Catch: java.lang.Throwable -> L9a
            r14.remove(r12)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L9a
            return
        L9a:
            r0 = move-exception
            r12 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L9a
            throw r12
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void a(java.lang.Exception r6, long r7) {
            r5 = this;
            boolean r0 = r5.nf
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD
            if (r6 == 0) goto L1d
            com.kwad.framework.filedownloader.d.c r6 = r5.ant
            int r6 = r6.getId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r6
            java.lang.String r6 = "the task[%d] has already been paused, so pass the retry callback"
            com.kwad.framework.filedownloader.f.d.c(r5, r6, r7)
        L1d:
            return
        L1e:
            int r0 = r5.anz
            int r3 = r0 + (-1)
            r5.anz = r3
            if (r0 >= 0) goto L40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            com.kwad.framework.filedownloader.d.c r3 = r5.ant
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r0
            r4[r2] = r3
            java.lang.String r0 = "valid retry times is less than 0(%d) for download task(%d)"
            com.kwad.framework.filedownloader.f.d.a(r5, r0, r4)
        L40:
            com.kwad.framework.filedownloader.download.d r0 = r5.anr
            int r1 = r5.anz
            r0.a(r6, r1, r7)
            return
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final boolean a(java.lang.Exception r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.kwad.framework.filedownloader.exception.FileDownloadHttpException
            r1 = 1
            if (r0 == 0) goto L2a
            r0 = r4
            com.kwad.framework.filedownloader.exception.FileDownloadHttpException r0 = (com.kwad.framework.filedownloader.exception.FileDownloadHttpException) r0
            int r0 = r0.getCode()
            boolean r2 = r3.anD
            if (r2 == 0) goto L2a
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L2a
            boolean r0 = r3.any
            if (r0 != 0) goto L2a
            com.kwad.framework.filedownloader.d.c r4 = r3.ant
            java.lang.String r4 = r4.getTargetFilePath()
            com.kwad.framework.filedownloader.d.c r0 = r3.ant
            java.lang.String r0 = r0.yr()
            com.kwad.framework.filedownloader.f.f.C(r4, r0)
            r3.any = r1
            return r1
        L2a:
            int r0 = r3.anz
            if (r0 <= 0) goto L33
            boolean r4 = r4 instanceof com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException
            if (r4 != 0) goto L33
            return r1
        L33:
            r4 = 0
            return r4
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void b(java.lang.Exception r3) {
            r2 = this;
            r0 = 1
            r2.anJ = r0
            r2.anK = r3
            boolean r3 = r2.nf
            if (r3 == 0) goto L22
            boolean r3 = com.kwad.framework.filedownloader.f.d.apD
            if (r3 == 0) goto L40
            com.kwad.framework.filedownloader.d.c r3 = r2.ant
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "the task[%d] has already been paused, so pass the error callback"
            com.kwad.framework.filedownloader.f.d.c(r2, r3, r0)
            return
        L22:
            java.util.ArrayList<com.kwad.framework.filedownloader.download.c> r3 = r2.anB
            java.lang.Object r3 = r3.clone()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r3.next()
            com.kwad.framework.filedownloader.download.c r0 = (com.kwad.framework.filedownloader.download.c) r0
            if (r0 == 0) goto L2e
            r0.xy()
            goto L2e
        L40:
            return
    }

    public final int getId() {
            r1 = this;
            com.kwad.framework.filedownloader.d.c r0 = r1.ant
            int r0 = r0.getId()
            return r0
    }

    public final boolean isAlive() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.anI
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            com.kwad.framework.filedownloader.download.d r0 = r1.anr
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void onProgress(long r2) {
            r1 = this;
            boolean r0 = r1.nf
            if (r0 == 0) goto L5
            return
        L5:
            com.kwad.framework.filedownloader.download.d r0 = r1.anr
            r0.onProgress(r2)
            return
    }

    public final void pause() {
            r2 = this;
            r0 = 1
            r2.nf = r0
            com.kwad.framework.filedownloader.download.e r0 = r2.anC
            if (r0 == 0) goto La
            r0.pause()
        La:
            java.util.ArrayList<com.kwad.framework.filedownloader.download.c> r0 = r2.anB
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.kwad.framework.filedownloader.download.c r1 = (com.kwad.framework.filedownloader.download.c) r1
            if (r1 == 0) goto L16
            r1.pause()
            goto L16
        L28:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            r0 = 10
            r1 = 0
            android.os.Process.setThreadPriority(r0)     // Catch: java.lang.Throwable -> L30
            com.kwad.framework.filedownloader.d.c r0 = r15.ant     // Catch: java.lang.Throwable -> L30
            byte r0 = r0.wJ()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "High concurrent cause, start runnable but already paused %d"
            r3 = -2
            r4 = 1
            if (r0 == r4) goto L91
            com.kwad.framework.filedownloader.d.c r0 = r15.ant     // Catch: java.lang.Throwable -> L30
            byte r0 = r0.wJ()     // Catch: java.lang.Throwable -> L30
            if (r0 != r3) goto L34
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L64
            com.kwad.framework.filedownloader.d.c r0 = r15.ant     // Catch: java.lang.Throwable -> L30
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L30
            r3[r1] = r0     // Catch: java.lang.Throwable -> L30
            com.kwad.framework.filedownloader.f.d.c(r15, r2, r3)     // Catch: java.lang.Throwable -> L30
            goto L64
        L30:
            r0 = move-exception
            r2 = r0
            goto L283
        L34:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Task[%d] can't start the download runnable, because its status is %d not %d"
            com.kwad.framework.filedownloader.d.c r3 = r15.ant     // Catch: java.lang.Throwable -> L30
            int r3 = r3.getId()     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L30
            com.kwad.framework.filedownloader.d.c r5 = r15.ant     // Catch: java.lang.Throwable -> L30
            byte r5 = r5.wJ()     // Catch: java.lang.Throwable -> L30
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Byte r6 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L30
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L30
            r7[r1] = r3     // Catch: java.lang.Throwable -> L30
            r7[r4] = r5     // Catch: java.lang.Throwable -> L30
            r3 = 2
            r7[r3] = r6     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r2, r7)     // Catch: java.lang.Throwable -> L30
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L30
            r15.b(r0)     // Catch: java.lang.Throwable -> L30
        L64:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yu()
            boolean r0 = r15.nf
            if (r0 == 0) goto L73
        L6d:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yy()
            goto L8b
        L73:
            boolean r0 = r15.anJ
            if (r0 == 0) goto L7f
        L77:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            java.lang.Exception r2 = r15.anK
            r0.c(r2)
            goto L8b
        L7f:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.io.IOException -> L85
            r0.yz()     // Catch: java.io.IOException -> L85
            goto L8b
        L85:
            r0 = move-exception
        L86:
            com.kwad.framework.filedownloader.download.d r2 = r15.anr
            r2.c(r0)
        L8b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.anI
            r0.set(r1)
            return
        L91:
            boolean r0 = r15.nf     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L9a
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.lang.Throwable -> L30
            r0.yw()     // Catch: java.lang.Throwable -> L30
        L9a:
            boolean r0 = r15.nf     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Lca
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Lb3
            com.kwad.framework.filedownloader.d.c r0 = r15.ant     // Catch: java.lang.Throwable -> L30
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L30
            r3[r1] = r0     // Catch: java.lang.Throwable -> L30
            com.kwad.framework.filedownloader.f.d.c(r15, r2, r3)     // Catch: java.lang.Throwable -> L30
        Lb3:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yu()
            boolean r0 = r15.nf
            if (r0 == 0) goto Lbd
            goto L6d
        Lbd:
            boolean r0 = r15.anJ
            if (r0 == 0) goto Lc2
            goto L77
        Lc2:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.io.IOException -> Lc8
            r0.yz()     // Catch: java.io.IOException -> Lc8
            goto L8b
        Lc8:
            r0 = move-exception
            goto L86
        Lca:
            com.kwad.framework.filedownloader.b.a r0 = r15.ano     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L268
            r5 = 0
            r15.yp()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.b.a r0 = r15.ano     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.d.c r6 = r15.ant     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            int r6 = r6.getId()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            java.util.List r0 = r0.bE(r6)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.a r6 = r15.r(r0)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.ConnectTask$a r7 = new com.kwad.framework.filedownloader.download.ConnectTask$a     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            r7.<init>()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            int r8 = r8.getId()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.ConnectTask$a r7 = r7.bL(r8)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            java.lang.String r8 = r8.getUrl()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.ConnectTask$a r7 = r7.bp(r8)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            java.lang.String r8 = r8.za()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.ConnectTask$a r7 = r7.bq(r8)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.d.b r8 = r15.anu     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.ConnectTask$a r7 = r7.a(r8)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.ConnectTask$a r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.download.ConnectTask r6 = r6.yb()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            com.kwad.framework.filedownloader.a.b r7 = r6.xX()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            java.util.Map r8 = r6.getRequestHeader()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            r15.a(r8, r6, r7)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            boolean r8 = r15.nf     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            if (r8 == 0) goto L15e
            com.kwad.framework.filedownloader.d.c r0 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            r0.d(r3)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            if (r7 == 0) goto L12c
            r7.xS()     // Catch: java.lang.Throwable -> L30
        L12c:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yu()
            boolean r0 = r15.nf
            if (r0 == 0) goto L137
            goto L6d
        L137:
            boolean r0 = r15.anJ
            if (r0 == 0) goto L13d
            goto L77
        L13d:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.io.IOException -> L144
            r0.yz()     // Catch: java.io.IOException -> L144
            goto L8b
        L144:
            r0 = move-exception
            goto L86
        L147:
            r0 = move-exception
            r5 = r7
            goto L262
        L14b:
            goto L21c
        L14e:
            r0 = move-exception
        L14f:
            r5 = r7
            goto L24b
        L152:
            r0 = move-exception
            goto L14f
        L154:
            r0 = move-exception
            goto L14f
        L156:
            r0 = move-exception
            goto L14f
        L158:
            r0 = move-exception
            goto L14f
        L15a:
            r0 = move-exception
            goto L14f
        L15c:
            r0 = move-exception
            goto L14f
        L15e:
            r15.yq()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            long r13 = r8.getTotal()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            java.lang.String r8 = r8.yr()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            r15.a(r13, r8)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            boolean r8 = r15.yn()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            if (r8 == 0) goto L19c
            boolean r8 = r15.anF     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            if (r8 == 0) goto L181
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            int r8 = r8.zc()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            goto L19d
        L181:
            com.kwad.framework.filedownloader.download.b r9 = com.kwad.framework.filedownloader.download.b.yc()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            int r10 = r8.getId()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            java.lang.String r11 = r8.getUrl()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            com.kwad.framework.filedownloader.d.c r8 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            java.lang.String r12 = r8.getPath()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            int r8 = r9.a(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            goto L19d
        L19c:
            r8 = 1
        L19d:
            if (r8 <= 0) goto L20a
            boolean r9 = r15.nf     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            if (r9 == 0) goto L1c8
            com.kwad.framework.filedownloader.d.c r0 = r15.ant     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            r0.d(r3)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            if (r7 == 0) goto L1ad
            r7.xS()     // Catch: java.lang.Throwable -> L30
        L1ad:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yu()
            boolean r0 = r15.nf
            if (r0 == 0) goto L1b8
            goto L6d
        L1b8:
            boolean r0 = r15.anJ
            if (r0 == 0) goto L1be
            goto L77
        L1be:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.io.IOException -> L1c5
            r0.yz()     // Catch: java.io.IOException -> L1c5
            goto L8b
        L1c5:
            r0 = move-exception
            goto L86
        L1c8:
            if (r8 != r4) goto L1cc
            r9 = 1
            goto L1cd
        L1cc:
            r9 = 0
        L1cd:
            r15.anD = r9     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            if (r9 == 0) goto L1d9
            com.kwad.framework.filedownloader.download.a r0 = r6.ya()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            r15.a(r0, r7)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            goto L204
        L1d9:
            if (r7 == 0) goto L1df
            r7.xS()     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            goto L1e0
        L1df:
            r5 = r7
        L1e0:
            com.kwad.framework.filedownloader.download.d r6 = r15.anr     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            r6.yx()     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            boolean r6 = r15.anF     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            if (r6 == 0) goto L200
            r15.a(r8, r0)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
            goto L203
        L1ed:
            r0 = move-exception
            goto L262
        L1f0:
            goto L22b
        L1f2:
            r0 = move-exception
            goto L24b
        L1f4:
            r0 = move-exception
            goto L24b
        L1f6:
            r0 = move-exception
            goto L24b
        L1f8:
            r0 = move-exception
            goto L24b
        L1fa:
            r0 = move-exception
            goto L24b
        L1fc:
            r0 = move-exception
            goto L24b
        L1fe:
            r0 = move-exception
            goto L24b
        L200:
            r15.d(r13, r8)     // Catch: java.lang.Throwable -> L1ed com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L1f0 java.lang.ArrayIndexOutOfBoundsException -> L1f2 java.lang.NullPointerException -> L1f4 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L1f6 java.lang.IllegalArgumentException -> L1f8 java.lang.InterruptedException -> L1fa java.lang.IllegalAccessException -> L1fc java.io.IOException -> L1fe com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21e
        L203:
            r7 = r5
        L204:
            if (r7 == 0) goto L268
            r7.xS()     // Catch: java.lang.Throwable -> L30
            goto L268
        L20a:
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            java.lang.String r5 = "invalid connection count %d, the connection count must be larger than 0"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            r6[r1] = r7     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            java.lang.String r5 = com.kwad.framework.filedownloader.f.f.c(r5, r6)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
            throw r0     // Catch: java.lang.Throwable -> L147 com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.DiscardSafely -> L14b java.lang.ArrayIndexOutOfBoundsException -> L14e java.lang.NullPointerException -> L152 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L154 java.lang.IllegalArgumentException -> L156 java.lang.InterruptedException -> L158 java.lang.IllegalAccessException -> L15a java.io.IOException -> L15c com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.RetryDirectly -> L21a
        L21a:
            r5 = r7
            goto L21e
        L21c:
            r5 = r7
            goto L22b
        L21e:
            com.kwad.framework.filedownloader.d.c r0 = r15.ant     // Catch: java.lang.Throwable -> L1ed
            r6 = 5
            r0.d(r6)     // Catch: java.lang.Throwable -> L1ed
            if (r5 == 0) goto L9a
        L226:
            r5.xS()     // Catch: java.lang.Throwable -> L30
            goto L9a
        L22b:
            if (r5 == 0) goto L230
            r5.xS()     // Catch: java.lang.Throwable -> L30
        L230:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yu()
            boolean r0 = r15.nf
            if (r0 == 0) goto L23b
            goto L6d
        L23b:
            boolean r0 = r15.anJ
            if (r0 == 0) goto L241
            goto L77
        L241:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.io.IOException -> L248
            r0.yz()     // Catch: java.io.IOException -> L248
            goto L8b
        L248:
            r0 = move-exception
            goto L86
        L24b:
            boolean r6 = r15.a(r0)     // Catch: java.lang.Throwable -> L1ed
            if (r6 == 0) goto L259
            r6 = 0
            r15.a(r0, r6)     // Catch: java.lang.Throwable -> L1ed
            if (r5 == 0) goto L9a
            goto L226
        L259:
            r15.b(r0)     // Catch: java.lang.Throwable -> L1ed
            if (r5 == 0) goto L268
            r5.xS()     // Catch: java.lang.Throwable -> L30
            goto L268
        L262:
            if (r5 == 0) goto L267
            r5.xS()     // Catch: java.lang.Throwable -> L30
        L267:
            throw r0     // Catch: java.lang.Throwable -> L30
        L268:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yu()
            boolean r0 = r15.nf
            if (r0 == 0) goto L273
            goto L6d
        L273:
            boolean r0 = r15.anJ
            if (r0 == 0) goto L279
            goto L77
        L279:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.io.IOException -> L280
            r0.yz()     // Catch: java.io.IOException -> L280
            goto L8b
        L280:
            r0 = move-exception
            goto L86
        L283:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yu()
            boolean r0 = r15.nf
            if (r0 != 0) goto L2a5
            boolean r0 = r15.anJ
            if (r0 == 0) goto L298
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            java.lang.Exception r3 = r15.anK
            r0.c(r3)
            goto L2aa
        L298:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr     // Catch: java.io.IOException -> L29e
            r0.yz()     // Catch: java.io.IOException -> L29e
            goto L2aa
        L29e:
            r0 = move-exception
            com.kwad.framework.filedownloader.download.d r3 = r15.anr
            r3.c(r0)
            goto L2aa
        L2a5:
            com.kwad.framework.filedownloader.download.d r0 = r15.anr
            r0.yy()
        L2aa:
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.anI
            r0.set(r1)
            throw r2
    }

    public final void ym() {
            r4 = this;
            com.kwad.framework.filedownloader.d.c r0 = r4.ant
            int r0 = r0.zc()
            r1 = 1
            if (r0 <= r1) goto L3d
            com.kwad.framework.filedownloader.b.a r0 = r4.ano
            com.kwad.framework.filedownloader.d.c r1 = r4.ant
            int r1 = r1.getId()
            java.util.List r0 = r0.bE(r1)
            com.kwad.framework.filedownloader.d.c r1 = r4.ant
            int r1 = r1.zc()
            int r2 = r0.size()
            if (r1 != r2) goto L2b
            com.kwad.framework.filedownloader.d.c r1 = r4.ant
            long r2 = com.kwad.framework.filedownloader.d.a.s(r0)
            r1.Z(r2)
            goto L3d
        L2b:
            com.kwad.framework.filedownloader.d.c r0 = r4.ant
            r1 = 0
            r0.Z(r1)
            com.kwad.framework.filedownloader.b.a r0 = r4.ano
            com.kwad.framework.filedownloader.d.c r1 = r4.ant
            int r1 = r1.getId()
            r0.bF(r1)
        L3d:
            com.kwad.framework.filedownloader.download.d r0 = r4.anr
            r0.yv()
            return
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void yo() {
            r4 = this;
            com.kwad.framework.filedownloader.b.a r0 = r4.ano
            com.kwad.framework.filedownloader.d.c r1 = r4.ant
            int r1 = r1.getId()
            com.kwad.framework.filedownloader.d.c r2 = r4.ant
            long r2 = r2.yZ()
            r0.b(r1, r2)
            return
    }

    public final java.lang.String yr() {
            r1 = this;
            com.kwad.framework.filedownloader.d.c r0 = r1.ant
            java.lang.String r0 = r0.yr()
            return r0
    }
}
