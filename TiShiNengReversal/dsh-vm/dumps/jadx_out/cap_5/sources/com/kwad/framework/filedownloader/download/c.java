package com.kwad.framework.filedownloader.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements java.lang.Runnable {
    private final java.lang.String aca;
    private final int amZ;
    private final com.kwad.framework.filedownloader.download.ConnectTask anV;
    private final com.kwad.framework.filedownloader.download.f anW;
    private com.kwad.framework.filedownloader.download.e anX;
    final int anY;
    private final boolean anw;
    private volatile boolean nf;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private java.lang.String aca;
        private java.lang.Boolean anT;
        private com.kwad.framework.filedownloader.download.f anW;
        private final com.kwad.framework.filedownloader.download.ConnectTask.a anZ;
        private java.lang.Integer aoa;

        public a() {
                r1 = this;
                r1.<init>()
                com.kwad.framework.filedownloader.download.ConnectTask$a r0 = new com.kwad.framework.filedownloader.download.ConnectTask$a
                r0.<init>()
                r1.anZ = r0
                return
        }

        public final com.kwad.framework.filedownloader.download.c.a a(com.kwad.framework.filedownloader.download.f r1) {
                r0 = this;
                r0.anW = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.c.a b(com.kwad.framework.filedownloader.download.a r2) {
                r1 = this;
                com.kwad.framework.filedownloader.download.ConnectTask$a r0 = r1.anZ
                r0.a(r2)
                return r1
        }

        public final com.kwad.framework.filedownloader.download.c.a bM(int r2) {
                r1 = this;
                com.kwad.framework.filedownloader.download.ConnectTask$a r0 = r1.anZ
                r0.bL(r2)
                return r1
        }

        public final com.kwad.framework.filedownloader.download.c.a bg(boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.anT = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.c.a bs(java.lang.String r2) {
                r1 = this;
                com.kwad.framework.filedownloader.download.ConnectTask$a r0 = r1.anZ
                r0.bp(r2)
                return r1
        }

        public final com.kwad.framework.filedownloader.download.c.a bt(java.lang.String r2) {
                r1 = this;
                com.kwad.framework.filedownloader.download.ConnectTask$a r0 = r1.anZ
                r0.bq(r2)
                return r1
        }

        public final com.kwad.framework.filedownloader.download.c.a bu(java.lang.String r1) {
                r0 = this;
                r0.aca = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.c.a c(com.kwad.framework.filedownloader.d.b r2) {
                r1 = this;
                com.kwad.framework.filedownloader.download.ConnectTask$a r0 = r1.anZ
                r0.a(r2)
                return r1
        }

        public final com.kwad.framework.filedownloader.download.c.a i(java.lang.Integer r1) {
                r0 = this;
                r0.aoa = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.c yt() {
                r9 = this;
                com.kwad.framework.filedownloader.download.f r0 = r9.anW
                if (r0 == 0) goto L2f
                java.lang.String r0 = r9.aca
                if (r0 == 0) goto L2f
                java.lang.Boolean r0 = r9.anT
                if (r0 == 0) goto L2f
                java.lang.Integer r0 = r9.aoa
                if (r0 == 0) goto L2f
                com.kwad.framework.filedownloader.download.ConnectTask$a r0 = r9.anZ
                com.kwad.framework.filedownloader.download.ConnectTask r4 = r0.yb()
                com.kwad.framework.filedownloader.download.c r1 = new com.kwad.framework.filedownloader.download.c
                int r2 = r4.amZ
                java.lang.Integer r0 = r9.aoa
                int r3 = r0.intValue()
                com.kwad.framework.filedownloader.download.f r5 = r9.anW
                java.lang.Boolean r0 = r9.anT
                boolean r6 = r0.booleanValue()
                java.lang.String r7 = r9.aca
                r8 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r1
            L2f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                com.kwad.framework.filedownloader.download.f r1 = r9.anW
                java.lang.String r2 = r9.aca
                java.lang.Boolean r3 = r9.anT
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r1
                r1 = 1
                r4[r1] = r2
                r1 = 2
                r4[r1] = r3
                java.lang.String r1 = "%s %s %B"
                java.lang.String r1 = com.kwad.framework.filedownloader.f.f.c(r1, r4)
                r0.<init>(r1)
                throw r0
        }
    }

    private c(int r1, int r2, com.kwad.framework.filedownloader.download.ConnectTask r3, com.kwad.framework.filedownloader.download.f r4, boolean r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.amZ = r1
            r0.anY = r2
            r1 = 0
            r0.nf = r1
            r0.anW = r4
            r0.aca = r6
            r0.anV = r3
            r0.anw = r5
            return
    }

    /* synthetic */ c(int r1, int r2, com.kwad.framework.filedownloader.download.ConnectTask r3, com.kwad.framework.filedownloader.download.f r4, boolean r5, java.lang.String r6, byte r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void pause() {
            r1 = this;
            r0 = 1
            r1.nf = r0
            com.kwad.framework.filedownloader.download.e r0 = r1.anX
            if (r0 == 0) goto La
            r0.pause()
        La:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.kwad.framework.filedownloader.download.ConnectTask r0 = r1.anV
            com.kwad.framework.filedownloader.download.a r0 = r0.ya()
            long r2 = r0.ani
            r0 = 0
            r4 = 0
            r5 = r0
            r6 = 0
        L13:
            r7 = 1
            boolean r0 = r1.nf     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L11e java.lang.ArrayIndexOutOfBoundsException -> L121 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L124 java.io.IOException -> L127 java.lang.IllegalAccessException -> L12a
            if (r0 == 0) goto L1f
            if (r5 == 0) goto L171
            r5.xS()
            goto L171
        L1f:
            com.kwad.framework.filedownloader.download.ConnectTask r0 = r1.anV     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            com.kwad.framework.filedownloader.a.b r5 = r0.xX()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            int r0 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            r8 = 3
            r9 = 2
            r10 = 4
            if (r6 == 0) goto L67
            java.lang.String r6 = "the connection[%d] for %d, is connected %s with requestHttpCode[%d]"
            int r11 = r1.anY     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            int r12 = r1.amZ     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            com.kwad.framework.filedownloader.download.ConnectTask r13 = r1.anV     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            com.kwad.framework.filedownloader.download.a r13 = r13.ya()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            r15[r4] = r11     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            r15[r7] = r12     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            r15[r9] = r13     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            r15[r8] = r14     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            com.kwad.framework.filedownloader.f.d.c(r1, r6, r15)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L59 java.lang.ArrayIndexOutOfBoundsException -> L5f com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L61 java.io.IOException -> L63 java.lang.IllegalAccessException -> L65
            goto L67
        L56:
            r0 = move-exception
            goto L172
        L59:
            r0 = move-exception
        L5a:
            r6 = 0
        L5b:
            r16 = 0
            goto L12d
        L5f:
            r0 = move-exception
            goto L5a
        L61:
            r0 = move-exception
            goto L5a
        L63:
            r0 = move-exception
            goto L5a
        L65:
            r0 = move-exception
            goto L5a
        L67:
            r6 = 206(0xce, float:2.89E-43)
            if (r0 == r6) goto L6f
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 != r6) goto L72
        L6f:
            r16 = 0
            goto Lbf
        L72:
            java.net.SocketException r6 = new java.net.SocketException     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            java.lang.String r11 = "Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again."
            com.kwad.framework.filedownloader.download.ConnectTask r12 = r1.anV     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            java.util.Map r12 = r12.getRequestHeader()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            java.util.Map r13 = r5.xR()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            int r14 = r1.amZ     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            int r15 = r1.anY     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> Lb3 java.lang.ArrayIndexOutOfBoundsException -> Lb7 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lb9 java.io.IOException -> Lbb java.lang.IllegalAccessException -> Lbd
            r16 = 0
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            r4[r16] = r12     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            r4[r7] = r13     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            r4[r9] = r0     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            r4[r8] = r14     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            r4[r10] = r15     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r11, r4)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
            throw r6     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> La7 java.lang.ArrayIndexOutOfBoundsException -> Lab com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> Lad java.io.IOException -> Laf java.lang.IllegalAccessException -> Lb1
        La7:
            r0 = move-exception
        La8:
            r6 = 0
            goto L12d
        Lab:
            r0 = move-exception
            goto La8
        Lad:
            r0 = move-exception
            goto La8
        Laf:
            r0 = move-exception
            goto La8
        Lb1:
            r0 = move-exception
            goto La8
        Lb3:
            r0 = move-exception
        Lb4:
            r16 = 0
            goto La8
        Lb7:
            r0 = move-exception
            goto Lb4
        Lb9:
            r0 = move-exception
            goto Lb4
        Lbb:
            r0 = move-exception
            goto Lb4
        Lbd:
            r0 = move-exception
            goto Lb4
        Lbf:
            com.kwad.framework.filedownloader.download.e$a r0 = new com.kwad.framework.filedownloader.download.e$a     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            r0.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            boolean r4 = r1.nf     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            if (r4 == 0) goto Lcc
            r5.xS()
            return
        Lcc:
            int r4 = r1.amZ     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.bP(r4)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            int r4 = r1.anY     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.bO(r4)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.f r4 = r1.anW     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            boolean r4 = r1.anw     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.bi(r4)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.d(r5)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.ConnectTask r4 = r1.anV     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.a r4 = r4.ya()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.c(r4)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            java.lang.String r4 = r1.aca     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e$a r0 = r0.bv(r4)     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            com.kwad.framework.filedownloader.download.e r0 = r0.yG()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            r1.anX = r0     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            r0.run()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            boolean r0 = r1.nf     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            if (r0 == 0) goto L11a
            com.kwad.framework.filedownloader.download.e r0 = r1.anX     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            r0.pause()     // Catch: java.lang.Throwable -> L56 java.lang.IllegalArgumentException -> L10f java.lang.ArrayIndexOutOfBoundsException -> L112 com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException -> L114 java.io.IOException -> L116 java.lang.IllegalAccessException -> L118
            goto L11a
        L10f:
            r0 = move-exception
        L110:
            r6 = 1
            goto L12d
        L112:
            r0 = move-exception
            goto L110
        L114:
            r0 = move-exception
            goto L110
        L116:
            r0 = move-exception
            goto L110
        L118:
            r0 = move-exception
            goto L110
        L11a:
            r5.xS()
            return
        L11e:
            r0 = move-exception
            goto L5b
        L121:
            r0 = move-exception
            goto L5b
        L124:
            r0 = move-exception
            goto L5b
        L127:
            r0 = move-exception
            goto L5b
        L12a:
            r0 = move-exception
            goto L5b
        L12d:
            com.kwad.framework.filedownloader.download.f r4 = r1.anW     // Catch: java.lang.Throwable -> L56
            boolean r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L167
            if (r6 != 0) goto L13f
            com.kwad.framework.filedownloader.download.f r4 = r1.anW     // Catch: java.lang.Throwable -> L56
            r7 = 0
            r4.a(r0, r7)     // Catch: java.lang.Throwable -> L56
            goto L14b
        L13f:
            com.kwad.framework.filedownloader.download.e r4 = r1.anX     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L153
            long r7 = r4.ani     // Catch: java.lang.Throwable -> L56
            long r7 = r7 - r2
            com.kwad.framework.filedownloader.download.f r4 = r1.anW     // Catch: java.lang.Throwable -> L56
            r4.a(r0, r7)     // Catch: java.lang.Throwable -> L56
        L14b:
            if (r5 == 0) goto L150
            r5.xS()
        L150:
            r4 = 0
            goto L13
        L153:
            java.lang.String r2 = "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L56
            r3[r16] = r0     // Catch: java.lang.Throwable -> L56
            com.kwad.framework.filedownloader.f.d.d(r1, r2, r3)     // Catch: java.lang.Throwable -> L56
            com.kwad.framework.filedownloader.download.f r2 = r1.anW     // Catch: java.lang.Throwable -> L56
            r2.b(r0)     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L171
            r5.xS()
            return
        L167:
            com.kwad.framework.filedownloader.download.f r2 = r1.anW     // Catch: java.lang.Throwable -> L56
            r2.b(r0)     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L171
            r5.xS()
        L171:
            return
        L172:
            if (r5 == 0) goto L177
            r5.xS()
        L177:
            throw r0
    }

    public final void xy() {
            r0 = this;
            r0.pause()
            return
    }
}
