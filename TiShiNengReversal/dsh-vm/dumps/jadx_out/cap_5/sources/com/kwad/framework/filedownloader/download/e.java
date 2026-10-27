package com.kwad.framework.filedownloader.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private final java.lang.String aca;
    private final int amZ;
    private final com.kwad.framework.filedownloader.download.f anW;
    private final int anY;
    private final long anh;
    long ani;
    private final long anj;
    private final com.kwad.framework.filedownloader.b.a ano;
    private final boolean anw;
    private final com.kwad.framework.filedownloader.download.c aoo;
    private final com.kwad.framework.filedownloader.a.b aop;
    private com.kwad.framework.filedownloader.e.a aoq;
    private volatile long aor;
    private volatile long aos;
    private final long contentLength;
    private volatile boolean nf;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        java.lang.String aca;
        java.lang.Boolean anT;
        com.kwad.framework.filedownloader.download.f anW;
        java.lang.Integer anf;
        com.kwad.framework.filedownloader.download.a ang;
        java.lang.Integer aoa;
        com.kwad.framework.filedownloader.a.b aop;
        com.kwad.framework.filedownloader.download.c aot;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.kwad.framework.filedownloader.download.e.a a(com.kwad.framework.filedownloader.download.c r1) {
                r0 = this;
                r0.aot = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e.a b(com.kwad.framework.filedownloader.download.f r1) {
                r0 = this;
                r0.anW = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e.a bO(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.aoa = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e.a bP(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.anf = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e.a bi(boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.anT = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e.a bv(java.lang.String r1) {
                r0 = this;
                r0.aca = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e.a c(com.kwad.framework.filedownloader.download.a r1) {
                r0 = this;
                r0.ang = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e.a d(com.kwad.framework.filedownloader.a.b r1) {
                r0 = this;
                r0.aop = r1
                return r0
        }

        public final com.kwad.framework.filedownloader.download.e yG() {
                r11 = this;
                java.lang.Boolean r0 = r11.anT
                if (r0 == 0) goto L39
                com.kwad.framework.filedownloader.a.b r2 = r11.aop
                if (r2 == 0) goto L39
                com.kwad.framework.filedownloader.download.a r3 = r11.ang
                if (r3 == 0) goto L39
                com.kwad.framework.filedownloader.download.f r0 = r11.anW
                if (r0 == 0) goto L39
                java.lang.String r0 = r11.aca
                if (r0 == 0) goto L39
                java.lang.Integer r0 = r11.anf
                if (r0 == 0) goto L39
                java.lang.Integer r1 = r11.aoa
                if (r1 == 0) goto L39
                com.kwad.framework.filedownloader.download.e r1 = new com.kwad.framework.filedownloader.download.e
                com.kwad.framework.filedownloader.download.c r4 = r11.aot
                int r5 = r0.intValue()
                java.lang.Integer r0 = r11.aoa
                int r6 = r0.intValue()
                java.lang.Boolean r0 = r11.anT
                boolean r7 = r0.booleanValue()
                com.kwad.framework.filedownloader.download.f r8 = r11.anW
                java.lang.String r9 = r11.aca
                r10 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
            L39:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }
    }

    private e(com.kwad.framework.filedownloader.a.b r3, com.kwad.framework.filedownloader.download.a r4, com.kwad.framework.filedownloader.download.c r5, int r6, int r7, boolean r8, com.kwad.framework.filedownloader.download.f r9, java.lang.String r10) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.aor = r0
            r2.aos = r0
            r2.anW = r9
            r2.aca = r10
            r2.aop = r3
            r2.anw = r8
            r2.aoo = r5
            r2.anY = r7
            r2.amZ = r6
            com.kwad.framework.filedownloader.download.b r3 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.b.a r3 = r3.ye()
            r2.ano = r3
            long r5 = r4.anh
            r2.anh = r5
            long r5 = r4.anj
            r2.anj = r5
            long r5 = r4.ani
            r2.ani = r5
            long r3 = r4.contentLength
            r2.contentLength = r3
            return
    }

    /* synthetic */ e(com.kwad.framework.filedownloader.a.b r1, com.kwad.framework.filedownloader.download.a r2, com.kwad.framework.filedownloader.download.c r3, int r4, int r5, boolean r6, com.kwad.framework.filedownloader.download.f r7, java.lang.String r8, byte r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private void sync() {
            r9 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 1
            r3 = 0
            com.kwad.framework.filedownloader.e.a r4 = r9.aoq     // Catch: java.io.IOException -> L52
            r4.zw()     // Catch: java.io.IOException -> L52
            com.kwad.framework.filedownloader.download.c r4 = r9.aoo
            if (r4 == 0) goto L1b
            com.kwad.framework.filedownloader.b.a r4 = r9.ano
            int r5 = r9.amZ
            int r6 = r9.anY
            long r7 = r9.ani
            r4.a(r5, r6, r7)
            goto L20
        L1b:
            com.kwad.framework.filedownloader.download.f r4 = r9.anW
            r4.yo()
        L20:
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L60
            int r4 = r9.amZ
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r9.anY
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            long r6 = r9.ani
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r7 = r7 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r2 = 2
            r1[r2] = r6
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]"
            com.kwad.framework.filedownloader.f.d.c(r9, r0, r1)
            return
        L52:
            r0 = move-exception
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L60
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r0 = "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s"
            com.kwad.framework.filedownloader.f.d.c(r9, r0, r1)
        L60:
            return
    }

    private void yF() {
            r6 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.ani
            long r4 = r6.aor
            long r2 = r2 - r4
            long r4 = r6.aos
            long r4 = r0 - r4
            boolean r2 = com.kwad.framework.filedownloader.f.f.i(r2, r4)
            if (r2 == 0) goto L1c
            r6.sync()
            long r2 = r6.ani
            r6.aor = r2
            r6.aos = r0
        L1c:
            return
    }

    public final void pause() {
            r1 = this;
            r0 = 1
            r1.nf = r0
            return
    }

    public final void run() {
            r19 = this;
            r1 = r19
            boolean r0 = r1.nf
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r1.anY
            com.kwad.framework.filedownloader.a.b r2 = r1.aop
            long r2 = com.kwad.framework.filedownloader.f.f.b(r0, r2)
            r0 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L1a8
            long r8 = r1.contentLength
            r10 = 5
            r11 = 4
            r12 = 3
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 <= 0) goto L82
            int r13 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r13 == 0) goto L82
            long r8 = r1.anj
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 != 0) goto L3c
            long r6 = r1.ani
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r5] = r6
            java.lang.String r6 = "range[%d-)"
            java.lang.String r6 = com.kwad.framework.filedownloader.f.f.c(r6, r7)
            goto L54
        L3c:
            long r6 = r1.ani
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r7 = r1.anj
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r8[r5] = r6
            r8[r4] = r7
            java.lang.String r6 = "range[%d-%d)"
            java.lang.String r6 = com.kwad.framework.filedownloader.f.f.c(r6, r8)
        L54:
            com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException r7 = new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException
            long r8 = r1.contentLength
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            int r3 = r1.amZ
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r9 = r1.anY
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r5] = r6
            r10[r4] = r8
            r10[r0] = r2
            r10[r12] = r3
            r10[r11] = r9
            java.lang.String r0 = "require %s with contentLength(%d), but the backend response contentLength is %d on downloadId[%d]-connectionIndex[%d], please ask your backend dev to fix such problem."
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r10)
            r7.<init>(r0)
            throw r7
        L82:
            long r6 = r1.ani
            com.kwad.framework.filedownloader.download.b r9 = com.kwad.framework.filedownloader.download.b.yc()     // Catch: java.lang.Throwable -> L9b
            boolean r9 = r9.yg()     // Catch: java.lang.Throwable -> L9b
            com.kwad.framework.filedownloader.download.c r13 = r1.aoo     // Catch: java.lang.Throwable -> L9b
            if (r13 == 0) goto La0
            if (r9 == 0) goto L93
            goto La0
        L93:
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "can't using multi-download when the output stream can't support seek"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            r5 = 0
        L9d:
            r8 = 0
            goto L1a1
        La0:
            java.lang.String r13 = r1.aca     // Catch: java.lang.Throwable -> L9b
            com.kwad.framework.filedownloader.e.a r13 = com.kwad.framework.filedownloader.f.f.bJ(r13)     // Catch: java.lang.Throwable -> L9b
            r1.aoq = r13     // Catch: java.lang.Throwable -> Lb0
            if (r9 == 0) goto Lb3
            long r14 = r1.ani     // Catch: java.lang.Throwable -> Lb0
            r13.seek(r14)     // Catch: java.lang.Throwable -> Lb0
            goto Lb3
        Lb0:
            r0 = move-exception
            r5 = r13
            goto L9d
        Lb3:
            boolean r9 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> Lb0
            if (r9 == 0) goto Leb
            java.lang.String r9 = "start fetch(%d): range [%d, %d), seek to[%d]"
            int r14 = r1.anY     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Lb0
            r15 = 1
            r16 = 0
            long r4 = r1.anh     // Catch: java.lang.Throwable -> Lb0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Lb0
            r5 = r13
            r17 = 3
            long r12 = r1.anj     // Catch: java.lang.Throwable -> Le9
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> Le9
            r18 = r9
            long r8 = r1.ani     // Catch: java.lang.Throwable -> Le9
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Le9
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> Le9
            r9[r16] = r14     // Catch: java.lang.Throwable -> Le9
            r9[r15] = r4     // Catch: java.lang.Throwable -> Le9
            r9[r0] = r12     // Catch: java.lang.Throwable -> Le9
            r9[r17] = r8     // Catch: java.lang.Throwable -> Le9
            r4 = r18
            com.kwad.framework.filedownloader.f.d.c(r1, r4, r9)     // Catch: java.lang.Throwable -> Le9
            goto Lf1
        Le9:
            r0 = move-exception
            goto L9d
        Leb:
            r5 = r13
            r15 = 1
            r16 = 0
            r17 = 3
        Lf1:
            com.kwad.framework.filedownloader.a.b r4 = r1.aop     // Catch: java.lang.Throwable -> Le9
            java.io.InputStream r8 = r4.getInputStream()     // Catch: java.lang.Throwable -> Le9
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L137
            boolean r9 = r1.nf     // Catch: java.lang.Throwable -> L137
            if (r9 == 0) goto L106
            com.kwad.sdk.crash.utils.b.closeQuietly(r8)
            com.kwad.sdk.crash.utils.b.closeQuietly(r5)
            return
        L106:
            int r9 = r8.read(r4)     // Catch: java.lang.Throwable -> L137
            r12 = -1
            if (r9 == r12) goto L13e
            r12 = 0
            r5.write(r4, r12, r9)     // Catch: java.lang.Throwable -> L137
            long r12 = r1.ani     // Catch: java.lang.Throwable -> L137
            r14 = 5
            r18 = 4
            long r10 = (long) r9     // Catch: java.lang.Throwable -> L137
            long r12 = r12 + r10
            r1.ani = r12     // Catch: java.lang.Throwable -> L137
            com.kwad.framework.filedownloader.download.f r9 = r1.anW     // Catch: java.lang.Throwable -> L137
            r9.onProgress(r10)     // Catch: java.lang.Throwable -> L137
            r1.yF()     // Catch: java.lang.Throwable -> L137
            boolean r9 = r1.nf     // Catch: java.lang.Throwable -> L137
            if (r9 != 0) goto L141
            boolean r9 = r1.anw     // Catch: java.lang.Throwable -> L137
            if (r9 == 0) goto L139
            boolean r9 = com.kwad.framework.filedownloader.f.f.zG()     // Catch: java.lang.Throwable -> L137
            if (r9 != 0) goto L131
            goto L139
        L131:
            com.kwad.framework.filedownloader.exception.FileDownloadNetworkPolicyException r0 = new com.kwad.framework.filedownloader.exception.FileDownloadNetworkPolicyException     // Catch: java.lang.Throwable -> L137
            r0.<init>()     // Catch: java.lang.Throwable -> L137
            throw r0     // Catch: java.lang.Throwable -> L137
        L137:
            r0 = move-exception
            goto L1a1
        L139:
            r10 = 5
            r11 = 4
            r16 = 0
            goto L106
        L13e:
            r14 = 5
            r18 = 4
        L141:
            if (r5 == 0) goto L146
            r1.sync()     // Catch: java.lang.Throwable -> L137
        L146:
            com.kwad.sdk.crash.utils.b.closeQuietly(r8)
            com.kwad.sdk.crash.utils.b.closeQuietly(r5)
            long r4 = r1.ani
            long r4 = r4 - r6
            r8 = -1
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 == 0) goto L195
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L15a
            goto L195
        L15a:
            com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException r8 = new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r9 = r1.anh
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            long r9 = r1.anj
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            long r9 = r1.ani
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r16 = 0
            r7[r16] = r4
            r7[r15] = r2
            r7[r0] = r3
            r7[r17] = r5
            r7[r18] = r9
            r7[r14] = r6
            java.lang.String r0 = "fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r7)
            r8.<init>(r0)
            throw r8
        L195:
            com.kwad.framework.filedownloader.download.f r2 = r1.anW
            com.kwad.framework.filedownloader.download.c r3 = r1.aoo
            long r4 = r1.anh
            long r6 = r1.anj
            r2.a(r3, r4, r6)
            return
        L1a1:
            com.kwad.sdk.crash.utils.b.closeQuietly(r8)
            com.kwad.sdk.crash.utils.b.closeQuietly(r5)
            throw r0
        L1a8:
            r15 = 1
            com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException r2 = new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException
            int r3 = r1.amZ
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r1.anY
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r16 = 0
            r0[r16] = r3
            r0[r15] = r4
            java.lang.String r3 = "there isn't any content need to download on %d-%d with the content-length is 0"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r3, r0)
            r2.<init>(r0)
            throw r2
    }
}
