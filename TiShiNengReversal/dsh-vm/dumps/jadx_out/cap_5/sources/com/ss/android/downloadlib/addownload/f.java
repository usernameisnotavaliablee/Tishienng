package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    private static final java.lang.String a = "f";

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private class b implements java.lang.Runnable {
        private final com.ss.android.xt.j.xt.b a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.f b;

        b(com.ss.android.downloadlib.addownload.f r1, com.ss.android.xt.j.xt.b r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 0
                com.ss.android.xt.j.xt.b r1 = r3.a     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                r2 = 1
                r1.f0(r2)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                com.ss.android.downloadlib.addownload.f r1 = r3.b     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                com.ss.android.xt.j.xt.b r2 = r3.a     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                com.ss.android.downloadlib.addownload.f.b(r1, r2)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            Le:
                com.ss.android.xt.j.xt.b r1 = r3.a
                r1.f0(r0)
                return
            L14:
                r1 = move-exception
                goto L1b
            L16:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L14
                goto Le
            L1b:
                com.ss.android.xt.j.xt.b r2 = r3.a
                r2.f0(r0)
                throw r1
        }
    }

    private static class c {
        private static com.ss.android.downloadlib.addownload.f a;

        static {
                com.ss.android.downloadlib.addownload.f r0 = new com.ss.android.downloadlib.addownload.f
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.addownload.f.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.f a() {
                com.ss.android.downloadlib.addownload.f r0 = com.ss.android.downloadlib.addownload.f.c.a
                return r0
        }
    }

    static {
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ f(com.ss.android.downloadlib.addownload.f.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.addownload.f a() {
            com.ss.android.downloadlib.addownload.f r0 = com.ss.android.downloadlib.addownload.f.c.a()
            return r0
    }

    static /* synthetic */ void b(com.ss.android.downloadlib.addownload.f r0, com.ss.android.xt.j.xt.b r1) {
            r0.e(r1)
            return
    }

    private void d(com.ss.android.xt.j.xt.b r10, int r11, int r12, org.json.JSONObject r13) {
            r9 = this;
            int r0 = r10.l()
            r1 = 4
            if (r0 != r1) goto L14
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "market_install_finish_check_time"
            r2 = 600(0x258, float:8.41E-43)
            int r0 = r0.optInt(r1, r2)
            goto L18
        L14:
            int r0 = com.ss.android.downloadlib.a.n.n(r10)
        L18:
            int r1 = r0 * 1000
            r2 = 20000(0x4e20, float:2.8026E-41)
            int r1 = r1 / r2
            int r1 = r1 + 1
            com.ss.android.downloadlib.a$o r3 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r4 = com.ss.android.downloadlib.addownload.f.a
            java.lang.String r5 = "一级轮询次数，即广播生效期内的轮询次数为:"
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r5 = r5.concat(r6)
            java.lang.String r6 = "realListenInstallFinishEventOpt"
            r3.b(r4, r6, r5)
            boolean r1 = r9.f(r10, r1, r2, r13)
            if (r1 != 0) goto L6b
            long r1 = com.ss.android.downloadlib.a.n.a(r10)
            long r5 = (long) r0
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            java.lang.String r0 = "tryListenInstallFinishEventOpt"
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L62
            com.ss.android.downloadlib.a$o r1 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r2 = "广播生效时间外，一级轮询完成且没有检测到安装完成事件，开始二级检测"
            r1.b(r4, r0, r2)
            boolean r10 = r9.f(r10, r11, r12, r13)
            if (r10 != 0) goto L6b
            com.ss.android.downloadlib.a$o r10 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r11 = "监听时间结束,依然没有监听到安装完成事件"
            r10.b(r4, r0, r11)
            return
        L62:
            com.ss.android.downloadlib.a$o r10 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r11 = "一级轮询时间小于广播监听时间,且未监听到安装完成事件"
            r10.b(r4, r0, r11)
        L6b:
            return
    }

    private void e(com.ss.android.xt.j.xt.b r8) {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = com.ss.android.downloadlib.a.n.j(r8)
            int r2 = com.ss.android.downloadlib.a.n.v(r8)
            boolean r3 = com.ss.android.downloadlib.a.n.u(r8)
            java.lang.String r4 = "tryListenInstallFinishEvent"
            if (r3 == 0) goto L2a
            boolean r3 = com.ss.android.downloadlib.a.n.r(r8)
            if (r3 == 0) goto L2a
            com.ss.android.downloadlib.a$o r3 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r5 = com.ss.android.downloadlib.addownload.f.a
            java.lang.String r6 = "上层库开启二级线程轮询检测策略"
            r3.b(r5, r4, r6)
            r7.d(r8, r1, r2, r0)
            return
        L2a:
            com.ss.android.downloadlib.a$o r1 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r2 = com.ss.android.downloadlib.addownload.f.a
            java.lang.String r3 = "采用原有默认轮询策略"
            r1.b(r2, r4, r3)
            r1 = 15
            r2 = 20000(0x4e20, float:2.8026E-41)
            r7.f(r8, r1, r2, r0)
            return
    }

    private boolean f(com.ss.android.xt.j.xt.b r4, int r5, int r6, org.json.JSONObject r7) {
            r3 = this;
            com.ss.android.downloadlib.a$o r7 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r0 = com.ss.android.downloadlib.addownload.f.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "开始轮询检测,轮询时间间隔为"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = ",轮询次数为"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "realListenInstallFinishEvent"
            r7.b(r0, r2, r1)
            long r6 = (long) r6
            android.os.SystemClock.sleep(r6)
        L25:
            if (r5 <= 0) goto L55
            boolean r0 = com.ss.android.downloadlib.a.h.M(r4)
            if (r0 == 0) goto L4d
            com.ss.android.downloadlib.d r6 = com.ss.android.downloadlib.d.d()
            java.lang.String r4 = r4.up()
            r6.p(r4)
            com.ss.android.downloadlib.a$o r4 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r6 = com.ss.android.downloadlib.addownload.f.a
            java.lang.String r7 = "检测到安装成功，当前剩余的轮询次数为"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r7.concat(r5)
            r4.b(r6, r2, r5)
            r4 = 1
            return r4
        L4d:
            int r5 = r5 + (-1)
            if (r5 == 0) goto L55
            android.os.SystemClock.sleep(r6)
            goto L25
        L55:
            r4 = 0
            return r4
    }

    public void c(com.ss.android.xt.j.xt.b r5) {
            r4 = this;
            com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r1 = com.ss.android.downloadlib.addownload.f.a
            java.lang.String r2 = "tryListenInstallFinish"
            java.lang.String r3 = "开始通过轮询线程监听安装完成事件"
            r0.b(r1, r2, r3)
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.addownload.f$b r1 = new com.ss.android.downloadlib.addownload.f$b
            r1.<init>(r4, r5)
            r0.b(r1)
            return
    }
}
