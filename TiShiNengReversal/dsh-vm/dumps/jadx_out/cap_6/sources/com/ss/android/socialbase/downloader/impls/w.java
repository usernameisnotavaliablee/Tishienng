package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class w implements android.os.Handler.Callback, com.ss.android.socialbase.downloader.j.j.InterfaceC0008j {
    private static com.ss.android.socialbase.downloader.impls.w.xt g;
    private static volatile com.ss.android.socialbase.downloader.impls.w j;
    private int ae;
    private final android.os.Handler cw;
    private long m;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w.j> r;
    private android.net.ConnectivityManager tl;
    private final boolean up;
    private final android.content.Context xt;




    private static class j {
        final int[] ae;
        final int cw;
        private int g;
        final int j;
        final boolean m;
        private boolean oq;
        private long qv;
        final int r;
        private int tl;
        final int up;
        private boolean vl;
        final int xt;

        j(int r2, int r3, int r4, int r5, int r6, boolean r7, int[] r8) {
                r1 = this;
                r1.<init>()
                r0 = 3000(0xbb8, float:4.204E-42)
                if (r5 >= r0) goto L9
                r5 = 3000(0xbb8, float:4.204E-42)
            L9:
                r0 = 5000(0x1388, float:7.006E-42)
                if (r6 >= r0) goto Lf
                r6 = 5000(0x1388, float:7.006E-42)
            Lf:
                r1.j = r2
                r1.xt = r3
                r1.cw = r4
                r1.r = r5
                r1.up = r6
                r1.m = r7
                r1.ae = r8
                r1.tl = r5
                return
        }

        static /* synthetic */ int j(com.ss.android.socialbase.downloader.impls.w.j r0) {
                int r0 = r0.g
                return r0
        }

        static /* synthetic */ boolean j(com.ss.android.socialbase.downloader.impls.w.j r0, boolean r1) {
                r0.oq = r1
                return r1
        }

        static /* synthetic */ boolean xt(com.ss.android.socialbase.downloader.impls.w.j r0) {
                boolean r0 = r0.vl
                return r0
        }

        static /* synthetic */ boolean xt(com.ss.android.socialbase.downloader.impls.w.j r0, boolean r1) {
                r0.vl = r1
                return r1
        }

        void cw() {
                r1 = this;
                int r0 = r1.r
                r1.tl = r0
                return
        }

        synchronized void j() {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.tl     // Catch: java.lang.Throwable -> La
                int r1 = r2.up     // Catch: java.lang.Throwable -> La
                int r0 = r0 + r1
                r2.tl = r0     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)
                return
            La:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        synchronized void j(long r1) {
                r0 = this;
                monitor-enter(r0)
                r0.qv = r1     // Catch: java.lang.Throwable -> L5
                monitor-exit(r0)
                return
            L5:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
                throw r1
        }

        boolean j(long r3, int r5, int r6, boolean r7) {
                r2 = this;
                boolean r0 = r2.vl
                r1 = 0
                if (r0 != 0) goto Ld
                java.lang.String r3 = "RetryScheduler"
                java.lang.String r4 = "canRetry: mIsWaitingRetry is false, return false!!!"
                com.ss.android.socialbase.downloader.m.j.cw(r3, r4)
                return r1
            Ld:
                int r0 = r2.xt
                if (r0 >= r5) goto L12
                return r1
            L12:
                int r5 = r2.g
                int r0 = r2.cw
                if (r5 < r0) goto L19
                return r1
            L19:
                boolean r5 = r2.oq
                if (r5 == 0) goto L21
                r5 = 2
                if (r6 == r5) goto L21
                return r1
            L21:
                if (r7 != 0) goto L2e
                long r5 = r2.qv
                long r3 = r3 - r5
                int r5 = r2.r
                long r5 = (long) r5
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto L2e
                return r1
            L2e:
                r3 = 1
                return r3
        }

        int r() {
                r1 = this;
                int r0 = r1.tl
                return r0
        }

        synchronized void xt() {
                r1 = this;
                monitor-enter(r1)
                int r0 = r1.g     // Catch: java.lang.Throwable -> L9
                int r0 = r0 + 1
                r1.g = r0     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return
            L9:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r0
        }
    }

    public interface xt {
        void j(com.ss.android.socialbase.downloader.ae.cw r1, long r2, boolean r4, int r5);
    }

    private w() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r2)
            r2.cw = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.r = r0
            r0 = 0
            r2.ae = r0
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r2.xt = r0
            r2.m()
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw()
            r2.up = r0
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            r0.j(r2)
            return
    }

    private int ae() {
            r3 = this;
            r0 = 0
            android.net.ConnectivityManager r1 = r3.tl     // Catch: java.lang.Exception -> L32
            if (r1 != 0) goto L19
            android.content.Context r1 = r3.xt     // Catch: java.lang.Exception -> L32
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L32
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> L32
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Exception -> L32
            r3.tl = r1     // Catch: java.lang.Exception -> L32
        L19:
            android.net.ConnectivityManager r1 = r3.tl     // Catch: java.lang.Exception -> L32
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L32
            boolean r2 = r1.isConnected()     // Catch: java.lang.Exception -> L32
            if (r2 != 0) goto L28
            goto L32
        L28:
            int r0 = r1.getType()     // Catch: java.lang.Exception -> L32
            r1 = 1
            if (r0 != r1) goto L31
            r0 = 2
            return r0
        L31:
            return r1
        L32:
            return r0
    }

    static /* synthetic */ int cw(com.ss.android.socialbase.downloader.impls.w r0) {
            int r0 = r0.ae
            return r0
    }

    private void cw(int r3) {
            r2 = this;
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r0 = r2.r
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r1 = r2.r     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    static /* synthetic */ android.content.Context j(com.ss.android.socialbase.downloader.impls.w r0) {
            android.content.Context r0 = r0.xt
            return r0
    }

    static /* synthetic */ android.net.ConnectivityManager j(com.ss.android.socialbase.downloader.impls.w r0, android.net.ConnectivityManager r1) {
            r0.tl = r1
            return r1
    }

    public static com.ss.android.socialbase.downloader.impls.w j() {
            com.ss.android.socialbase.downloader.impls.w r0 = com.ss.android.socialbase.downloader.impls.w.j
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.impls.w> r0 = com.ss.android.socialbase.downloader.impls.w.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.impls.w r1 = com.ss.android.socialbase.downloader.impls.w.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.w r1 = new com.ss.android.socialbase.downloader.impls.w     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.impls.w.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.impls.w r0 = com.ss.android.socialbase.downloader.impls.w.j
            return r0
    }

    private void j(int r9, int r10, boolean r11) {
            r8 = this;
            android.content.Context r0 = r8.xt
            if (r0 != 0) goto L6
            goto Le8
        L6:
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r1 = r8.r
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r2 = r8.r     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.impls.w$j r2 = (com.ss.android.socialbase.downloader.impls.w.j) r2     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r9 = move-exception
            goto L12a
        L18:
            boolean r3 = com.ss.android.socialbase.downloader.impls.w.j.xt(r2)     // Catch: java.lang.Throwable -> L15
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L2c
            com.ss.android.socialbase.downloader.impls.w.j.xt(r2, r5)     // Catch: java.lang.Throwable -> L15
            int r3 = r8.ae     // Catch: java.lang.Throwable -> L15
            int r3 = r3 - r4
            r8.ae = r3     // Catch: java.lang.Throwable -> L15
            if (r3 >= 0) goto L2c
            r8.ae = r5     // Catch: java.lang.Throwable -> L15
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "RetryScheduler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "doSchedulerRetryInSubThread: downloadId = "
            r3.<init>(r6)
            r3.append(r9)
            java.lang.String r6 = ", retryCount = "
            r3.append(r6)
            int r6 = com.ss.android.socialbase.downloader.impls.w.j.j(r2)
            r3.append(r6)
            java.lang.String r6 = ", mWaitingRetryTasksCount = "
            r3.append(r6)
            int r6 = r8.ae
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r1, r3)
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r9)
            if (r1 != 0) goto L64
            r8.cw(r9)
            return
        L64:
            java.lang.String r3 = "RetryScheduler"
            java.lang.String r6 = "doSchedulerRetryInSubThread，id:"
            java.lang.String r7 = java.lang.String.valueOf(r9)
            java.lang.String r6 = r6.concat(r7)
            com.ss.android.socialbase.downloader.m.j.up(r3, r6)
            int r3 = r1.v()
            r6 = -3
            if (r3 == r6) goto L126
            r6 = -4
            if (r3 != r6) goto L7f
            goto L126
        L7f:
            r6 = -5
            r7 = -2
            if (r3 == r6) goto L100
            if (r3 != r7) goto L8d
            boolean r6 = r1.qb()
            if (r6 == 0) goto L8d
            goto L100
        L8d:
            r9 = -1
            if (r3 == r9) goto L91
            goto Le8
        L91:
            if (r10 != 0) goto L99
            boolean r3 = r2.m
            if (r3 == 0) goto Le8
            r3 = 0
            goto L9a
        L99:
            r3 = 1
        L9a:
            com.ss.android.socialbase.downloader.up.j r6 = r1.hk()
            if (r3 == 0) goto Laa
            boolean r7 = com.ss.android.socialbase.downloader.az.m.tl(r6)
            if (r7 == 0) goto Laa
            boolean r3 = r8.j(r1, r6)
        Laa:
            r2.xt()
            if (r3 == 0) goto Le9
            java.lang.String r10 = "RetryScheduler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "doSchedulerRetry: restart task, ****** id = "
            r3.<init>(r4)
            int r4 = r2.j
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r10, r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.j(r3)
            if (r11 == 0) goto Ld0
            r2.j()
        Ld0:
            int r10 = com.ss.android.socialbase.downloader.impls.w.j.j(r2)
            r1.xt(r10)
            int r10 = r1.i()
            if (r10 != r9) goto Le8
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            int r10 = r1.ae()
            r9.up(r10)
        Le8:
            return
        Le9:
            if (r11 == 0) goto Lee
            r2.j()
        Lee:
            boolean r9 = r1.x()
            if (r9 != 0) goto Lfc
            boolean r9 = r1.qb()
            if (r9 == 0) goto Lfb
            goto Lfc
        Lfb:
            r4 = 0
        Lfc:
            r8.j(r1, r4, r10)
            return
        L100:
            r10 = 3
            if (r3 != r7) goto L115
            android.content.Context r11 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r11 = com.ss.android.socialbase.downloader.downloader.ae.xt(r11)
            com.ss.android.socialbase.downloader.downloader.mi r11 = r11.xt()
            if (r11 == 0) goto L115
            r0 = 4
            r11.j(r1, r0, r10)
        L115:
            com.ss.android.socialbase.downloader.downloader.ws r11 = com.ss.android.socialbase.downloader.downloader.cw.v()
            if (r11 == 0) goto L122
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r11.j(r0, r10)
        L122:
            r8.cw(r9)
            return
        L126:
            r8.cw(r9)
            return
        L12a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r9
    }

    private void j(int r8, boolean r9) {
            r7 = this;
            int r0 = r7.ae
            if (r0 > 0) goto L5
            return
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            monitor-enter(r7)
            if (r9 != 0) goto L1a
            long r2 = r7.m     // Catch: java.lang.Throwable -> L18
            long r2 = r0 - r2
            r4 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1a
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r8 = move-exception
            goto L57
        L1a:
            r7.m = r0     // Catch: java.lang.Throwable -> L18
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "RetryScheduler"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "scheduleAllTaskRetry, level = ["
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = "], force = ["
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            r0 = 0
            if (r9 == 0) goto L45
            android.os.Handler r1 = r7.cw
            r1.removeMessages(r0)
        L45:
            android.os.Message r1 = android.os.Message.obtain()
            r1.what = r0
            r1.arg1 = r8
            r1.arg2 = r9
            android.os.Handler r8 = r7.cw
            r2 = 2000(0x7d0, double:9.88E-321)
            r8.sendMessageDelayed(r1, r2)
            return
        L57:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L18
            throw r8
    }

    private void j(com.ss.android.socialbase.downloader.ae.cw r10, boolean r11, int r12) {
            r9 = this;
            com.ss.android.socialbase.downloader.up.j r0 = r10.hk()
            if (r0 != 0) goto L8
            goto Lf4
        L8:
            int r1 = r10.ae()
            com.ss.android.socialbase.downloader.impls.w$j r1 = r9.xt(r1)
            int r2 = com.ss.android.socialbase.downloader.impls.w.j.j(r1)
            int r3 = r1.cw
            if (r2 <= r3) goto L44
            java.lang.String r10 = "RetryScheduler"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "tryStartScheduleRetry, id = "
            r11.<init>(r12)
            int r12 = r1.j
            r11.append(r12)
            java.lang.String r12 = ", mRetryCount = "
            r11.append(r12)
            int r12 = com.ss.android.socialbase.downloader.impls.w.j.j(r1)
            r11.append(r12)
            java.lang.String r12 = ", maxCount = "
            r11.append(r12)
            int r12 = r1.cw
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.ss.android.socialbase.downloader.m.j.r(r10, r11)
            return
        L44:
            int r2 = r0.j()
            boolean r3 = com.ss.android.socialbase.downloader.az.m.tl(r0)
            if (r3 != 0) goto L85
            boolean r0 = com.ss.android.socialbase.downloader.az.m.g(r0)
            if (r0 != 0) goto L85
            boolean r0 = r10.sm()
            if (r0 == 0) goto L60
            boolean r0 = r10.qb()
            if (r0 != 0) goto L85
        L60:
            boolean r0 = r9.j(r1, r2)
            if (r0 != 0) goto L68
            goto Lf4
        L68:
            java.lang.String r0 = "RetryScheduler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "allow error code, id = "
            r3.<init>(r4)
            int r4 = r1.j
            r3.append(r4)
            java.lang.String r4 = ", error code = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r2)
        L85:
            com.ss.android.socialbase.downloader.impls.w.j.j(r1, r11)
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r2 = r9.r
            monitor-enter(r2)
            boolean r0 = com.ss.android.socialbase.downloader.impls.w.j.xt(r1)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L9e
            r0 = 1
            com.ss.android.socialbase.downloader.impls.w.j.xt(r1, r0)     // Catch: java.lang.Throwable -> L9b
            int r3 = r9.ae     // Catch: java.lang.Throwable -> L9b
            int r3 = r3 + r0
            r9.ae = r3     // Catch: java.lang.Throwable -> L9b
            goto L9e
        L9b:
            r0 = move-exception
            r10 = r0
            goto L109
        L9e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9b
            int r0 = r1.r()
            java.lang.String r2 = "RetryScheduler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "tryStartScheduleRetry: id = "
            r3.<init>(r4)
            int r4 = r1.j
            r3.append(r4)
            java.lang.String r4 = ", delayTimeMills = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", mWaitingRetryTasks = "
            r3.append(r4)
            int r4 = r9.ae
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r2, r3)
            boolean r2 = r1.m
            if (r2 == 0) goto Lf0
            if (r12 != 0) goto Ld3
            r1.cw()
        Ld3:
            com.ss.android.socialbase.downloader.impls.w$xt r3 = com.ss.android.socialbase.downloader.impls.w.g
            if (r3 == 0) goto Lde
            long r5 = (long) r0
            r4 = r10
            r7 = r11
            r8 = r12
            r3.j(r4, r5, r7, r8)
        Lde:
            boolean r10 = r9.up
            if (r10 == 0) goto Lf4
            long r10 = java.lang.System.currentTimeMillis()
            r1.j(r10)
            r1.xt()
            r1.j()
            return
        Lf0:
            r4 = r10
            r7 = r11
            if (r7 == 0) goto Lf5
        Lf4:
            return
        Lf5:
            android.os.Handler r10 = r9.cw
            int r11 = r4.ae()
            r10.removeMessages(r11)
            android.os.Handler r10 = r9.cw
            int r11 = r4.ae()
            long r0 = (long) r0
            r10.sendEmptyMessageDelayed(r11, r0)
            return
        L109:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9b
            throw r10
    }

    public static void j(com.ss.android.socialbase.downloader.impls.w.xt r0) {
            com.ss.android.socialbase.downloader.impls.w.g = r0
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.impls.w r0, int r1, int r2, boolean r3) {
            r0.j(r1, r2, r3)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.impls.w r0, int r1, boolean r2) {
            r0.j(r1, r2)
            return
    }

    private boolean j(com.ss.android.socialbase.downloader.ae.cw r11, com.ss.android.socialbase.downloader.up.j r12) {
            r10 = this;
            r0 = 0
            java.lang.String r2 = r11.vl()     // Catch: com.ss.android.socialbase.downloader.up.j -> Lb
            long r2 = com.ss.android.socialbase.downloader.az.m.r(r2)     // Catch: com.ss.android.socialbase.downloader.up.j -> Lb
            goto L10
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = r0
        L10:
            boolean r4 = r12 instanceof com.ss.android.socialbase.downloader.up.up
            if (r4 == 0) goto L1b
            com.ss.android.socialbase.downloader.up.up r12 = (com.ss.android.socialbase.downloader.up.up) r12
            long r4 = r12.up()
            goto L24
        L1b:
            long r4 = r11.ka()
            long r6 = r11.uq()
            long r4 = r4 - r6
        L24:
            r12 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L93
            int r11 = r11.ae()
            com.ss.android.socialbase.downloader.jy.j r11 = com.ss.android.socialbase.downloader.jy.j.j(r11)
            java.lang.String r4 = "space_fill_part_download"
            r5 = 0
            int r4 = r11.j(r4, r5)
            if (r4 != r12) goto L92
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L8a
            java.lang.String r4 = "space_fill_min_keep_mb"
            r6 = 100
            int r11 = r11.j(r4, r6)
            if (r11 <= 0) goto L93
            long r6 = (long) r11
            r8 = 1048576(0x100000, double:5.180654E-318)
            long r6 = r6 * r8
            long r6 = r2 - r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "retry schedule: available = "
            r4.<init>(r8)
            double r2 = com.ss.android.socialbase.downloader.az.m.j(r2)
            r4.append(r2)
            java.lang.String r2 = "MB, minKeep = "
            r4.append(r2)
            r4.append(r11)
            java.lang.String r11 = "MB, canDownload = "
            r4.append(r11)
            double r2 = com.ss.android.socialbase.downloader.az.m.j(r6)
            r4.append(r2)
            java.lang.String r11 = "MB"
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            java.lang.String r2 = "RetryScheduler"
            com.ss.android.socialbase.downloader.m.j.cw(r2, r11)
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 > 0) goto L93
            java.lang.String r11 = "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!"
            com.ss.android.socialbase.downloader.m.j.r(r2, r11)
            return r5
        L8a:
            java.lang.String r0 = "download_when_space_negative"
            int r11 = r11.j(r0, r5)
            if (r11 == r12) goto L93
        L92:
            return r5
        L93:
            return r12
    }

    private boolean j(com.ss.android.socialbase.downloader.impls.w.j r5, int r6) {
            r4 = this;
            int[] r5 = r5.ae
            r0 = 0
            if (r5 == 0) goto L16
            int r1 = r5.length
            if (r1 != 0) goto L9
            goto L16
        L9:
            int r1 = r5.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L16
            r3 = r5[r2]
            if (r3 != r6) goto L13
            r5 = 1
            return r5
        L13:
            int r2 = r2 + 1
            goto Lb
        L16:
            return r0
    }

    private int[] j(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ","
            java.lang.String[] r5 = r5.split(r0)     // Catch: java.lang.Throwable -> L25
            int r0 = r5.length     // Catch: java.lang.Throwable -> L25
            if (r0 > 0) goto L12
            return r1
        L12:
            int r0 = r5.length     // Catch: java.lang.Throwable -> L25
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L25
            r2 = 0
        L16:
            int r3 = r5.length     // Catch: java.lang.Throwable -> L25
            if (r2 >= r3) goto L24
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L25
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L25
            r0[r2] = r3     // Catch: java.lang.Throwable -> L25
            int r2 = r2 + 1
            goto L16
        L24:
            return r0
        L25:
            return r1
    }

    private void m() {
            r3 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "use_network_callback"
            r2 = 0
            int r0 = r0.j(r1, r2)
            r1 = 1
            if (r0 == r1) goto Lf
            return
        Lf:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.downloader.impls.w$1 r1 = new com.ss.android.socialbase.downloader.impls.w$1
            r1.<init>(r3)
            r0.execute(r1)
            return
    }

    static /* synthetic */ int r(com.ss.android.socialbase.downloader.impls.w r0) {
            int r0 = r0.ae()
            return r0
    }

    private com.ss.android.socialbase.downloader.impls.w.j r(int r12) {
            r11 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r12)
            java.lang.String r1 = "retry_schedule"
            r2 = 0
            int r5 = r0.j(r1, r2)
            java.lang.String r1 = "retry_schedule_config"
            org.json.JSONObject r0 = r0.r(r1)
            r1 = 60
            if (r0 == 0) goto L45
            java.lang.String r3 = "max_count"
            int r3 = r0.optInt(r3, r1)
            java.lang.String r4 = "interval_sec"
            int r4 = r0.optInt(r4, r1)
            java.lang.String r6 = "interval_sec_acceleration"
            int r1 = r0.optInt(r6, r1)
            com.ss.android.socialbase.downloader.impls.w$xt r6 = com.ss.android.socialbase.downloader.impls.w.g
            if (r6 == 0) goto L35
            java.lang.String r6 = "use_job_scheduler"
            int r6 = r0.optInt(r6, r2)
            r7 = 1
            if (r6 != r7) goto L35
            r2 = 1
        L35:
            java.lang.String r6 = "allow_error_code"
            java.lang.String r0 = r0.optString(r6)
            int[] r0 = r11.j(r0)
            r10 = r0
            r0 = r1
            r9 = r2
            r6 = r3
            r1 = r4
            goto L4c
        L45:
            r0 = 0
            r10 = r0
            r0 = 60
            r6 = 60
            r9 = 0
        L4c:
            com.ss.android.socialbase.downloader.impls.w$j r3 = new com.ss.android.socialbase.downloader.impls.w$j
            int r7 = r1 * 1000
            int r8 = r0 * 1000
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
    }

    static /* synthetic */ android.util.SparseArray up(com.ss.android.socialbase.downloader.impls.w r0) {
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r0 = r0.r
            return r0
    }

    static /* synthetic */ android.net.ConnectivityManager xt(com.ss.android.socialbase.downloader.impls.w r0) {
            android.net.ConnectivityManager r0 = r0.tl
            return r0
    }

    private com.ss.android.socialbase.downloader.impls.w.j xt(int r4) {
            r3 = this;
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r0 = r3.r
            java.lang.Object r0 = r0.get(r4)
            com.ss.android.socialbase.downloader.impls.w$j r0 = (com.ss.android.socialbase.downloader.impls.w.j) r0
            if (r0 != 0) goto L27
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r1 = r3.r
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r0 = r3.r     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.downloader.impls.w$j r0 = (com.ss.android.socialbase.downloader.impls.w.j) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            com.ss.android.socialbase.downloader.impls.w$j r0 = r3.r(r4)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L25
        L1e:
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.w$j> r2 = r3.r     // Catch: java.lang.Throwable -> L1c
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            return r0
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r4
        L27:
            return r0
    }

    private void xt(int r3, boolean r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.downloader.impls.w$2 r1 = new com.ss.android.socialbase.downloader.impls.w$2
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.j.j.InterfaceC0008j
    public void cw() {
            r2 = this;
            r0 = 3
            r1 = 0
            r2.j(r0, r1)
            return
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what
            r1 = 1
            if (r0 != 0) goto L12
            int r0 = r4.arg1
            int r4 = r4.arg2
            if (r4 != r1) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            r3.xt(r0, r4)
            goto L2c
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "handleMessage, doSchedulerRetry, id = "
            r0.<init>(r2)
            int r2 = r4.what
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "RetryScheduler"
            com.ss.android.socialbase.downloader.m.j.cw(r2, r0)
            int r4 = r4.what
            r3.j(r4)
        L2c:
            return r1
    }

    public void j(int r3) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.downloader.impls.w$3 r1 = new com.ss.android.socialbase.downloader.impls.w$3
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            if (r3 == 0) goto L2e
            java.lang.String r0 = com.ss.android.socialbase.downloader.xt.up.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = com.ss.android.socialbase.downloader.xt.up.j
            java.lang.String r1 = r3.xw()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L2e
        L17:
            boolean r0 = r3.x()
            if (r0 != 0) goto L26
            boolean r0 = r3.qb()
            if (r0 == 0) goto L24
            goto L26
        L24:
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            int r1 = r2.ae()
            r2.j(r3, r0, r1)
        L2e:
            return
    }

    public void r() {
            r2 = this;
            r0 = 2
            r1 = 1
            r2.j(r0, r1)
            return
    }

    public void up() {
            r2 = this;
            r0 = 5
            r1 = 0
            r2.j(r0, r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.j.j.InterfaceC0008j
    public void xt() {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.j(r0, r1)
            return
    }
}
