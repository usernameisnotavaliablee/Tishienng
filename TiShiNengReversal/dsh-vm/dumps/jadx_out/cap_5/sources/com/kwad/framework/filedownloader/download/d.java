package com.kwad.framework.filedownloader.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements android.os.Handler.Callback {
    private volatile java.lang.Thread amO;
    private volatile long anN;
    private final com.kwad.framework.filedownloader.b.a ano;
    private final com.kwad.framework.filedownloader.d.c ant;
    private final com.kwad.framework.filedownloader.download.d.a aob;
    private final int aoc;
    private final int aod;
    private final int aoe;
    private long aof;
    private android.os.HandlerThread aog;
    private volatile boolean aoh;
    private final java.util.concurrent.atomic.AtomicLong aoi;
    private volatile boolean aoj;
    private boolean aok;
    private android.os.Handler handler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private boolean aol;
        private java.lang.Exception aom;
        private int aon;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        final void bN(int r1) {
                r0 = this;
                r0.aon = r1
                return
        }

        final void bh(boolean r1) {
                r0 = this;
                r0.aol = r1
                return
        }

        final void f(java.lang.Exception r1) {
                r0 = this;
                r0.aom = r1
                return
        }

        public final java.lang.Exception getException() {
                r1 = this;
                java.lang.Exception r0 = r1.aom
                return r0
        }

        public final int wN() {
                r1 = this;
                int r0 = r1.aon
                return r0
        }

        public final boolean yE() {
                r1 = this;
                boolean r0 = r1.aol
                return r0
        }
    }

    d(com.kwad.framework.filedownloader.d.c r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.aoh = r0
            r0 = 0
            r2.anN = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.aoi = r0
            r0 = 1
            r2.aok = r0
            r2.ant = r3
            com.kwad.framework.filedownloader.download.b r3 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.b.a r3 = r3.ye()
            r2.ano = r3
            r3 = 5
            if (r5 >= r3) goto L24
            r5 = 5
        L24:
            r2.aod = r5
            r2.aoe = r6
            com.kwad.framework.filedownloader.download.d$a r3 = new com.kwad.framework.filedownloader.download.d$a
            r3.<init>()
            r2.aob = r3
            r2.aoc = r4
            return
    }

    private boolean W(long r8) {
            r7 = this;
            boolean r0 = r7.aok
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L9
            r7.aok = r2
            return r1
        L9:
            long r3 = r7.anN
            long r8 = r8 - r3
            long r3 = r7.aof
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L28
            java.util.concurrent.atomic.AtomicLong r0 = r7.aoi
            long r3 = r0.get()
            long r5 = r7.aof
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L28
            int r0 = r7.aod
            long r3 = (long) r0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L28
            return r1
        L28:
            return r2
    }

    private void a(android.database.sqlite.SQLiteFullException r6) {
            r5 = this;
            com.kwad.framework.filedownloader.d.c r0 = r5.ant
            int r0 = r0.getId()
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r6.toString()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly."
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r3)
        L20:
            com.kwad.framework.filedownloader.d.c r1 = r5.ant
            java.lang.String r6 = r6.toString()
            r1.by(r6)
            com.kwad.framework.filedownloader.d.c r6 = r5.ant
            r1 = -1
            r6.d(r1)
            com.kwad.framework.filedownloader.b.a r6 = r5.ano
            r6.bG(r0)
            com.kwad.framework.filedownloader.b.a r6 = r5.ano
            r6.bF(r0)
            return
    }

    private void a(java.lang.Exception r3, int r4) {
            r2 = this;
            java.lang.Exception r3 = r2.d(r3)
            com.kwad.framework.filedownloader.download.d$a r0 = r2.aob
            r0.f(r3)
            com.kwad.framework.filedownloader.download.d$a r0 = r2.aob
            int r1 = r2.aoc
            int r1 = r1 - r4
            r0.bN(r1)
            com.kwad.framework.filedownloader.d.c r4 = r2.ant
            r0 = 5
            r4.d(r0)
            com.kwad.framework.filedownloader.d.c r4 = r2.ant
            java.lang.String r1 = r3.toString()
            r4.by(r1)
            com.kwad.framework.filedownloader.b.a r4 = r2.ano
            com.kwad.framework.filedownloader.d.c r1 = r2.ant
            int r1 = r1.getId()
            r4.a(r1, r3)
            r2.c(r0)
            return
    }

    private void b(long r6, boolean r8) {
            r5 = this;
            com.kwad.framework.filedownloader.d.c r0 = r5.ant
            long r0 = r0.yZ()
            com.kwad.framework.filedownloader.d.c r2 = r5.ant
            long r2 = r2.getTotal()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L22
            com.kwad.framework.filedownloader.b.a r6 = r5.ano
            com.kwad.framework.filedownloader.d.c r7 = r5.ant
            int r7 = r7.getId()
            com.kwad.framework.filedownloader.d.c r8 = r5.ant
            long r0 = r8.yZ()
            r6.b(r7, r0)
            return
        L22:
            boolean r0 = r5.aoj
            r1 = 3
            if (r0 == 0) goto L2f
            r0 = 0
            r5.aoj = r0
            com.kwad.framework.filedownloader.d.c r0 = r5.ant
            r0.d(r1)
        L2f:
            if (r8 == 0) goto L3d
            r5.anN = r6
            r5.c(r1)
            java.util.concurrent.atomic.AtomicLong r6 = r5.aoi
            r7 = 0
            r6.set(r7)
        L3d:
            return
    }

    private synchronized void b(android.os.Message r5) {
            r4 = this;
            monitor-enter(r4)
            android.os.HandlerThread r0 = r4.aog     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L23
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            java.lang.String r0 = "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread."
            int r5 = r5.what     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1f
            r2[r1] = r5     // Catch: java.lang.Throwable -> L1f
            com.kwad.framework.filedownloader.f.d.c(r4, r0, r2)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L4b
        L21:
            monitor-exit(r4)
            return
        L23:
            android.os.Handler r0 = r4.handler     // Catch: java.lang.Throwable -> L1f java.lang.IllegalStateException -> L2a
            r0.sendMessage(r5)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalStateException -> L2a
            monitor-exit(r4)
            return
        L2a:
            r0 = move-exception
            android.os.HandlerThread r3 = r4.aog     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r3.isAlive()     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L4a
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L48
            java.lang.String r0 = "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread."
            int r5 = r5.what     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1f
            r2[r1] = r5     // Catch: java.lang.Throwable -> L1f
            com.kwad.framework.filedownloader.f.d.c(r4, r0, r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return
        L48:
            monitor-exit(r4)
            return
        L4a:
            throw r0     // Catch: java.lang.Throwable -> L1f
        L4b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    private void c(byte r4) {
            r3 = this;
            r0 = -2
            if (r4 != r0) goto L1d
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L1c
            com.kwad.framework.filedownloader.d.c r4 = r3.ant
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d"
            com.kwad.framework.filedownloader.f.d.c(r3, r4, r0)
        L1c:
            return
        L1d:
            com.kwad.framework.filedownloader.message.e r0 = com.kwad.framework.filedownloader.message.e.yT()
            com.kwad.framework.filedownloader.d.c r1 = r3.ant
            com.kwad.framework.filedownloader.download.d$a r2 = r3.aob
            com.kwad.framework.filedownloader.message.MessageSnapshot r4 = com.kwad.framework.filedownloader.message.f.a(r4, r1, r2)
            r0.s(r4)
            return
    }

    private java.lang.Exception d(java.lang.Exception r11) {
            r10 = this;
            com.kwad.framework.filedownloader.d.c r0 = r10.ant
            java.lang.String r0 = r0.yr()
            com.kwad.framework.filedownloader.d.c r1 = r10.ant
            boolean r1 = r1.isChunked()
            if (r1 != 0) goto L19
            com.kwad.framework.filedownloader.f.e r1 = com.kwad.framework.filedownloader.f.e.zB()
            boolean r1 = r1.apJ
            if (r1 == 0) goto L17
            goto L19
        L17:
            r9 = r11
            goto L57
        L19:
            boolean r1 = r11 instanceof java.io.IOException
            if (r1 == 0) goto L17
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L17
            long r3 = com.kwad.sdk.crash.utils.h.getAvailableBytes(r0)
            r1 = 4096(0x1000, double:2.0237E-320)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L17
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L49
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Exception with: free space isn't enough, and the target file not exist."
            com.kwad.framework.filedownloader.f.d.a(r10, r11, r1, r0)
            r0 = 0
        L47:
            r7 = r0
            goto L4e
        L49:
            long r0 = r1.length()
            goto L47
        L4e:
            com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException r2 = new com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException
            r5 = 4096(0x1000, double:2.0237E-320)
            r9 = r11
            r2.<init>(r3, r5, r7, r9)
            return r2
        L57:
            return r9
    }

    private void e(java.lang.Exception r6) {
            r5 = this;
            java.lang.Exception r0 = r5.d(r6)
            boolean r1 = r0 instanceof android.database.sqlite.SQLiteFullException
            r2 = -1
            if (r1 == 0) goto L10
            r6 = r0
            android.database.sqlite.SQLiteFullException r6 = (android.database.sqlite.SQLiteFullException) r6
            r5.a(r6)
            goto L35
        L10:
            com.kwad.framework.filedownloader.d.c r1 = r5.ant     // Catch: android.database.sqlite.SQLiteFullException -> L30
            r1.d(r2)     // Catch: android.database.sqlite.SQLiteFullException -> L30
            com.kwad.framework.filedownloader.d.c r1 = r5.ant     // Catch: android.database.sqlite.SQLiteFullException -> L30
            java.lang.String r6 = r6.toString()     // Catch: android.database.sqlite.SQLiteFullException -> L30
            r1.by(r6)     // Catch: android.database.sqlite.SQLiteFullException -> L30
            com.kwad.framework.filedownloader.b.a r6 = r5.ano     // Catch: android.database.sqlite.SQLiteFullException -> L30
            com.kwad.framework.filedownloader.d.c r1 = r5.ant     // Catch: android.database.sqlite.SQLiteFullException -> L30
            int r1 = r1.getId()     // Catch: android.database.sqlite.SQLiteFullException -> L30
            com.kwad.framework.filedownloader.d.c r3 = r5.ant     // Catch: android.database.sqlite.SQLiteFullException -> L30
            long r3 = r3.yZ()     // Catch: android.database.sqlite.SQLiteFullException -> L30
            r6.a(r1, r0, r3)     // Catch: android.database.sqlite.SQLiteFullException -> L30
            goto L35
        L30:
            r6 = move-exception
            r0 = r6
            r5.a(r0)
        L35:
            com.kwad.framework.filedownloader.download.d$a r6 = r5.aob
            r6.f(r0)
            r5.c(r2)
            return
    }

    private static long h(long r7, long r9) {
            r0 = -1
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto L9
            return r0
        L9:
            r4 = 1
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 != 0) goto L10
            return r4
        L10:
            long r9 = r9 + r4
            long r7 = r7 / r9
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 > 0) goto L17
            return r4
        L17:
            return r7
    }

    private void yA() {
            r12 = this;
            java.lang.String r0 = "delete the temp file(%s) failed, on completed downloading."
            com.kwad.framework.filedownloader.d.c r1 = r12.ant
            java.lang.String r1 = r1.yr()
            com.kwad.framework.filedownloader.d.c r2 = r12.ant
            java.lang.String r2 = r2.getTargetFilePath()
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            r4 = 1
            r5 = 0
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L46
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L46
            boolean r7 = r6.exists()     // Catch: java.lang.Throwable -> L46
            r8 = 2
            if (r7 == 0) goto L5e
            long r9 = r6.length()     // Catch: java.lang.Throwable -> L46
            boolean r7 = r6.delete()     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L48
            java.lang.String r7 = "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L46
            long r10 = r3.length()     // Catch: java.lang.Throwable -> L46
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L46
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L46
            r11[r5] = r2     // Catch: java.lang.Throwable -> L46
            r11[r4] = r9     // Catch: java.lang.Throwable -> L46
            r11[r8] = r10     // Catch: java.lang.Throwable -> L46
            com.kwad.framework.filedownloader.f.d.d(r12, r7, r11)     // Catch: java.lang.Throwable -> L46
            goto L5e
        L46:
            r2 = move-exception
            goto L8a
        L48:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = "Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one."
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L46
            r8[r5] = r2     // Catch: java.lang.Throwable -> L46
            r8[r4] = r9     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r7, r8)     // Catch: java.lang.Throwable -> L46
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L46
            throw r6     // Catch: java.lang.Throwable -> L46
        L5e:
            boolean r6 = r3.renameTo(r6)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L78
            boolean r2 = r3.exists()
            if (r2 == 0) goto L77
            boolean r2 = r3.delete()
            if (r2 != 0) goto L77
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r5] = r1
            com.kwad.framework.filedownloader.f.d.d(r12, r0, r2)
        L77:
            return
        L78:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = "Can't rename the  temp downloaded file(%s) to the target file(%s)"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L46
            r8[r5] = r1     // Catch: java.lang.Throwable -> L46
            r8[r4] = r2     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r7, r8)     // Catch: java.lang.Throwable -> L46
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L46
            throw r6     // Catch: java.lang.Throwable -> L46
        L8a:
            boolean r6 = r3.exists()
            if (r6 == 0) goto L9d
            boolean r3 = r3.delete()
            if (r3 != 0) goto L9d
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r1
            com.kwad.framework.filedownloader.f.d.d(r12, r0, r3)
        L9d:
            throw r2
    }

    private void yB() {
            r5 = this;
            r5.yA()
            com.kwad.framework.filedownloader.d.c r0 = r5.ant
            r1 = -3
            r0.d(r1)
            com.kwad.framework.filedownloader.b.a r0 = r5.ano
            com.kwad.framework.filedownloader.d.c r2 = r5.ant
            int r2 = r2.getId()
            com.kwad.framework.filedownloader.d.c r3 = r5.ant
            long r3 = r3.getTotal()
            r0.c(r2, r3)
            com.kwad.framework.filedownloader.b.a r0 = r5.ano
            com.kwad.framework.filedownloader.d.c r2 = r5.ant
            int r2 = r2.getId()
            r0.bF(r2)
            r5.c(r1)
            com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.zB()
            boolean r0 = r0.apK
            if (r0 == 0) goto L35
            com.kwad.framework.filedownloader.d.c r0 = r5.ant
            com.kwad.framework.filedownloader.services.f.f(r0)
        L35:
            return
    }

    private boolean yC() {
            r6 = this;
            com.kwad.framework.filedownloader.d.c r0 = r6.ant
            boolean r0 = r0.isChunked()
            r1 = 0
            if (r0 == 0) goto L13
            com.kwad.framework.filedownloader.d.c r0 = r6.ant
            long r2 = r0.yZ()
            r0.ab(r2)
            goto L4d
        L13:
            com.kwad.framework.filedownloader.d.c r0 = r6.ant
            long r2 = r0.yZ()
            com.kwad.framework.filedownloader.d.c r0 = r6.ant
            long r4 = r0.getTotal()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L4d
            com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException r0 = new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException
            com.kwad.framework.filedownloader.d.c r2 = r6.ant
            long r2 = r2.yZ()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.kwad.framework.filedownloader.d.c r3 = r6.ant
            long r3 = r3.getTotal()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r2
            r1 = 1
            r4[r1] = r3
            java.lang.String r2 = "sofar[%d] not equal total[%d]"
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r2, r4)
            r0.<init>(r2)
            r6.c(r0)
        L4d:
            return r1
    }

    private void yD() {
            r5 = this;
            com.kwad.framework.filedownloader.d.c r0 = r5.ant
            r1 = -2
            r0.d(r1)
            com.kwad.framework.filedownloader.b.a r0 = r5.ano
            com.kwad.framework.filedownloader.d.c r2 = r5.ant
            int r2 = r2.getId()
            com.kwad.framework.filedownloader.d.c r3 = r5.ant
            long r3 = r3.yZ()
            r0.d(r2, r3)
            r5.c(r1)
            return
    }

    final void a(java.lang.Exception r4, int r5, long r6) {
            r3 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r3.aoi
            r1 = 0
            r0.set(r1)
            com.kwad.framework.filedownloader.d.c r0 = r3.ant
            long r6 = -r6
            r0.aa(r6)
            android.os.Handler r6 = r3.handler
            if (r6 != 0) goto L15
            r3.a(r4, r5)
            return
        L15:
            r7 = 5
            r0 = 0
            android.os.Message r4 = r6.obtainMessage(r7, r5, r0, r4)
            r3.b(r4)
            return
    }

    final void a(boolean r10, long r11, java.lang.String r13, java.lang.String r14) {
            r9 = this;
            com.kwad.framework.filedownloader.d.c r0 = r9.ant
            java.lang.String r0 = r0.za()
            r1 = 1
            r2 = 2
            if (r0 == 0) goto L24
            boolean r3 = r0.equals(r13)
            if (r3 == 0) goto L11
            goto L24
        L11:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r12 = 0
            r11[r12] = r13
            r11[r1] = r0
            java.lang.String r12 = "callback onConnected must with precondition succeed, but the etag is changes(%s != %s)"
            java.lang.String r11 = com.kwad.framework.filedownloader.f.f.c(r12, r11)
            r10.<init>(r11)
            throw r10
        L24:
            com.kwad.framework.filedownloader.download.d$a r0 = r9.aob
            r0.bh(r10)
            com.kwad.framework.filedownloader.d.c r10 = r9.ant
            r10.d(r2)
            com.kwad.framework.filedownloader.d.c r10 = r9.ant
            r10.ab(r11)
            com.kwad.framework.filedownloader.d.c r10 = r9.ant
            r10.bx(r13)
            com.kwad.framework.filedownloader.d.c r10 = r9.ant
            r10.bz(r14)
            com.kwad.framework.filedownloader.b.a r3 = r9.ano
            com.kwad.framework.filedownloader.d.c r10 = r9.ant
            int r4 = r10.getId()
            r5 = r11
            r7 = r13
            r8 = r14
            r3.a(r4, r5, r7, r8)
            r9.c(r2)
            int r10 = r9.aoe
            long r10 = (long) r10
            long r10 = h(r5, r10)
            r9.aof = r10
            r9.aoj = r1
            return
    }

    final void c(java.lang.Exception r1) {
            r0 = this;
            r0.e(r1)
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r5) {
            r4 = this;
            r0 = 1
            r4.aoh = r0
            int r1 = r5.what
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L19
            r2 = 5
            if (r1 == r2) goto Ld
            goto L20
        Ld:
            java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L17
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch: java.lang.Throwable -> L17
            int r5 = r5.arg1     // Catch: java.lang.Throwable -> L17
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L17
            goto L20
        L17:
            r5 = move-exception
            goto L2c
        L19:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L17
            r4.b(r1, r0)     // Catch: java.lang.Throwable -> L17
        L20:
            r4.aoh = r3
            java.lang.Thread r5 = r4.amO
            if (r5 == 0) goto L2b
            java.lang.Thread r5 = r4.amO
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L2b:
            return r0
        L2c:
            r4.aoh = r3
            java.lang.Thread r0 = r4.amO
            if (r0 == 0) goto L37
            java.lang.Thread r0 = r4.amO
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L37:
            throw r5
    }

    public final boolean isAlive() {
            r1 = this;
            android.os.HandlerThread r0 = r1.aog
            if (r0 == 0) goto Lc
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    final void onProgress(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.aoi
            r0.addAndGet(r3)
            com.kwad.framework.filedownloader.d.c r0 = r2.ant
            r0.aa(r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r2.W(r3)
            android.os.Handler r1 = r2.handler
            if (r1 != 0) goto L1a
            r2.b(r3, r0)
            return
        L1a:
            if (r0 == 0) goto L24
            r3 = 3
            android.os.Message r3 = r1.obtainMessage(r3)
            r2.b(r3)
        L24:
            return
    }

    final void yu() {
            r4 = this;
            android.os.Handler r0 = r4.handler
            if (r0 == 0) goto L25
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            android.os.HandlerThread r0 = r4.aog
            r0.quit()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r4.amO = r0
        L13:
            boolean r0 = r4.aoh
            if (r0 == 0) goto L23
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 100
            long r2 = r0.toNanos(r2)
            java.util.concurrent.locks.LockSupport.parkNanos(r2)
            goto L13
        L23:
            r4.amO = r1
        L25:
            return
    }

    public final void yv() {
            r3 = this;
            com.kwad.framework.filedownloader.d.c r0 = r3.ant
            r1 = 1
            r0.d(r1)
            com.kwad.framework.filedownloader.b.a r0 = r3.ano
            com.kwad.framework.filedownloader.d.c r2 = r3.ant
            int r2 = r2.getId()
            r0.bH(r2)
            r3.c(r1)
            return
    }

    final void yw() {
            r2 = this;
            com.kwad.framework.filedownloader.d.c r0 = r2.ant
            r1 = 6
            r0.d(r1)
            r2.c(r1)
            com.kwad.framework.filedownloader.b.a r0 = r2.ano
            com.kwad.framework.filedownloader.d.c r1 = r2.ant
            int r1 = r1.getId()
            r0.bC(r1)
            return
    }

    final void yx() {
            r3 = this;
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "source-status-callback"
            r2 = 10
            r0.<init>(r1, r2)
            r3.aog = r0
            r0.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r3.aog
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1, r3)
            r3.handler = r0
            return
    }

    final void yy() {
            r0 = this;
            r0.yD()
            return
    }

    final void yz() {
            r1 = this;
            boolean r0 = r1.yC()
            if (r0 == 0) goto L7
            return
        L7:
            r1.yB()
            return
    }
}
