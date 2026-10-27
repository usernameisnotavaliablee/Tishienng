package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    private static final java.lang.String a = "f";
    private static boolean b;

    class a implements w2.b {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ com.ss.android.downloadlib.f b;

        a(com.ss.android.downloadlib.f r1, com.ss.android.xt.j.xt.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void j() {
                r7 = this;
                com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r1 = com.ss.android.downloadlib.f.e()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "注册广播监听成功,注册耗时"
                r2.<init>(r3)
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.xt.j.xt.b r5 = r7.a
                long r5 = r5.v0()
                long r3 = r3 - r5
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "checkMarketInstallFinishEvent"
                r0.b(r1, r3, r2)
                com.ss.android.xt.j.xt.b r0 = r7.a
                r1 = 1
                r0.f0(r1)
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r1 = r7.a
                r0.l(r1)
                return
        }

        public void xt() {
                r4 = this;
                com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r1 = com.ss.android.downloadlib.f.e()
                java.lang.String r2 = "广播监听时间结束,主动解除了广播监听"
                java.lang.String r3 = "checkMarketInstallFinishEvent"
                r0.b(r1, r3, r2)
                com.ss.android.xt.j.xt.b r0 = r4.a
                boolean r0 = com.ss.android.downloadlib.a.h.M(r0)
                if (r0 != 0) goto L24
                com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r1 = com.ss.android.downloadlib.f.e()
                java.lang.String r2 = "监听结束依然没有完成安装"
                r0.b(r1, r3, r2)
            L24:
                com.ss.android.xt.j.xt.b r0 = r4.a
                r1 = 0
                r0.f0(r1)
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r1 = r4.a
                r0.l(r1)
                return
        }
    }

    class b implements w2.b {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ com.ss.android.downloadlib.f b;

        b(com.ss.android.downloadlib.f r1, com.ss.android.xt.j.xt.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void j() {
                r4 = this;
                com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r1 = com.ss.android.downloadlib.f.e()
                java.lang.String r2 = "checkMarketInstallFinishEventForReboot"
                java.lang.String r3 = "进程被杀,重新注册广播监听成功,正式执行冷启兜底逻辑"
                r0.b(r1, r2, r3)
                com.ss.android.xt.j.xt.b r0 = r4.a
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.P
                r1 = 0
                r2 = 1
                r0.compareAndSet(r1, r2)
                com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c()
                com.ss.android.xt.j.xt.b r1 = r4.a
                r0.d(r1)
                return
        }

        public void xt() {
                r4 = this;
                com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r1 = com.ss.android.downloadlib.f.e()
                java.lang.String r2 = "兜底监听执行完毕,解除广播监听"
                java.lang.String r3 = "checkMarketInstallFinishEventForReboot"
                r0.b(r1, r3, r2)
                com.ss.android.xt.j.xt.b r0 = r4.a
                boolean r0 = com.ss.android.downloadlib.a.h.M(r0)
                if (r0 != 0) goto L24
                com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r1 = com.ss.android.downloadlib.f.e()
                java.lang.String r2 = "监听结束依然没有完成安装"
                r0.b(r1, r3, r2)
            L24:
                com.ss.android.xt.j.xt.b r0 = r4.a
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.P
                r1 = 1
                r2 = 0
                r0.compareAndSet(r1, r2)
                com.ss.android.xt.j.xt.b r0 = r4.a
                r0.f0(r2)
                com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c()
                com.ss.android.xt.j.xt.b r1 = r4.a
                r0.d(r1)
                return
        }
    }

    private static class c {
        private static com.ss.android.downloadlib.f a;

        static {
                com.ss.android.downloadlib.f r0 = new com.ss.android.downloadlib.f
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.f.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.f a() {
                com.ss.android.downloadlib.f r0 = com.ss.android.downloadlib.f.c.a
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

    /* synthetic */ f(com.ss.android.downloadlib.f.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.f a() {
            com.ss.android.downloadlib.f r0 = com.ss.android.downloadlib.f.c.a()
            return r0
    }

    static /* synthetic */ java.lang.String e() {
            java.lang.String r0 = com.ss.android.downloadlib.f.a
            return r0
    }

    public void b(int r5, w2.b r6) {
            r4 = this;
            com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r1 = com.ss.android.downloadlib.f.a
            java.lang.String r2 = "动态广播监听的持续时间为:"
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r2.concat(r3)
            java.lang.String r3 = "registerMarketInstallFinishBroadcast"
            r0.b(r1, r3, r2)
            boolean r0 = com.ss.android.downloadlib.f.b
            if (r0 != 0) goto L23
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            r0.B(r6)
            r6 = 1
            com.ss.android.downloadlib.f.b = r6
        L23:
            com.ss.android.socialbase.appdownloader.f r6 = com.ss.android.socialbase.appdownloader.f.L()
            r6.q(r5)
            return
    }

    public void c(com.ss.android.downloadlib.addownload.o.i r9, com.ss.android.xt.j.xt.b r10) {
            r8 = this;
            boolean r9 = com.ss.android.downloadlib.a.n.g(r10)
            java.lang.String r0 = "checkMarketInstallFinishEvent"
            if (r9 != 0) goto L14
            com.ss.android.downloadlib.a$o r9 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r10 = com.ss.android.downloadlib.f.a
            java.lang.String r1 = "开关未开启, 不使用动态广播监听能力"
            r9.b(r10, r0, r1)
            return
        L14:
            if (r10 != 0) goto L22
            com.ss.android.downloadlib.a$o r9 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r10 = com.ss.android.downloadlib.f.a
            java.lang.String r1 = "nativeDownloadModel为空,不符合预期"
            r9.c(r10, r0, r1)
            return
        L22:
            boolean r9 = r10.y0()
            if (r9 == 0) goto L34
            com.ss.android.downloadlib.a$o r9 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r10 = com.ss.android.downloadlib.f.a
            java.lang.String r1 = "正在监听中,不重复监听"
            r9.c(r10, r0, r1)
            return
        L34:
            com.ss.android.downloadlib.a$o r9 = com.ss.android.downloadlib.a.o.a()     // Catch: java.lang.Exception -> Lae
            java.lang.String r1 = com.ss.android.downloadlib.f.a     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = "针对商店直投广告,开始检测安装完成事件"
            r9.b(r1, r0, r2)     // Catch: java.lang.Exception -> Lae
            boolean r9 = com.ss.android.downloadlib.a.n.r(r10)     // Catch: java.lang.Exception -> Lae
            if (r9 == 0) goto L90
            com.ss.android.downloadlib.a$o r9 = com.ss.android.downloadlib.a.o.a()     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = "开始进行动态广播监听"
            r9.b(r1, r0, r2)     // Catch: java.lang.Exception -> Lae
            org.json.JSONObject r9 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = "market_install_finish_check_time"
            r3 = 600(0x258, float:8.41E-43)
            int r9 = r9.optInt(r2, r3)     // Catch: java.lang.Exception -> Lae
            long r2 = r10.v0()     // Catch: java.lang.Exception -> Lae
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L81
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lae
            long r4 = r10.v0()     // Catch: java.lang.Exception -> Lae
            long r2 = r2 - r4
            long r4 = (long) r9     // Catch: java.lang.Exception -> Lae
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L77
            goto L81
        L77:
            com.ss.android.downloadlib.a$o r9 = com.ss.android.downloadlib.a.o.a()     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = "目前仍在广播监听的生效期内,不进行重复注册"
            r9.b(r1, r0, r2)     // Catch: java.lang.Exception -> Lae
            goto L90
        L81:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lae
            r10.d0(r2)     // Catch: java.lang.Exception -> Lae
            com.ss.android.downloadlib.f$a r2 = new com.ss.android.downloadlib.f$a     // Catch: java.lang.Exception -> Lae
            r2.<init>(r8, r10)     // Catch: java.lang.Exception -> Lae
            r8.b(r9, r2)     // Catch: java.lang.Exception -> Lae
        L90:
            boolean r9 = com.ss.android.downloadlib.a.n.u(r10)     // Catch: java.lang.Exception -> Lae
            if (r9 == 0) goto La6
            com.ss.android.downloadlib.a$o r9 = com.ss.android.downloadlib.a.o.a()     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = "开启轮询线程能力,作为容灾手段"
            r9.b(r1, r0, r2)     // Catch: java.lang.Exception -> Lae
            com.ss.android.downloadlib.addownload.f r9 = com.ss.android.downloadlib.addownload.f.a()     // Catch: java.lang.Exception -> Lae
            r9.c(r10)     // Catch: java.lang.Exception -> Lae
        La6:
            com.ss.android.downloadlib.addownload.o$d r9 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Exception -> Lae
            r9.d(r10)     // Catch: java.lang.Exception -> Lae
            return
        Lae:
            com.ss.android.downloadlib.up.a r9 = com.ss.android.downloadlib.up.a.a()
            r10 = 0
            java.lang.String r0 = "监听商店场景安装完成事件发生异常"
            r9.d(r10, r0)
            return
    }

    public void d(com.ss.android.xt.j.xt.b r11) {
            r10 = this;
            boolean r0 = com.ss.android.downloadlib.a.n.g(r11)
            java.lang.String r1 = "checkMarketInstallFinishEventForReboot"
            if (r0 != 0) goto L14
            com.ss.android.downloadlib.a$o r11 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r0 = com.ss.android.downloadlib.f.a
            java.lang.String r2 = "线程轮询总开关未开启,因此不执行兜底逻辑"
            r11.b(r0, r1, r2)
            return
        L14:
            if (r11 != 0) goto L22
            com.ss.android.downloadlib.a$o r11 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r0 = com.ss.android.downloadlib.f.a
            java.lang.String r2 = "nativeDownloadModel为空,不符合预期"
            r11.c(r0, r1, r2)
            return
        L22:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.P
            boolean r0 = r0.get()
            if (r0 == 0) goto L45
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r11.v0()
            long r2 = r2 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L45
            com.ss.android.downloadlib.a$o r11 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r0 = com.ss.android.downloadlib.f.a
            java.lang.String r2 = "兜底过一次了,不进行重复兜底"
            r11.b(r0, r1, r2)
            return
        L45:
            boolean r0 = com.ss.android.downloadlib.a.n.r(r11)
            if (r0 == 0) goto L89
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "market_install_finish_check_time"
            r3 = 600(0x258, float:8.41E-43)
            int r0 = r0.optInt(r2, r3)
            long r2 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r11.v0()
            long r6 = r6 - r8
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 < 0) goto L75
            com.ss.android.downloadlib.a$o r11 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r0 = com.ss.android.downloadlib.f.a
            java.lang.String r2 = "当前时间距离首次检测时间超出了广播生效期,不再执行兜底策略"
            r11.b(r0, r1, r2)
            return
        L75:
            long r0 = r11.v0()
            long r0 = r0 + r2
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            long r0 = r0 / r4
            int r1 = (int) r0
            com.ss.android.downloadlib.f$b r0 = new com.ss.android.downloadlib.f$b
            r0.<init>(r10, r11)
            r10.b(r1, r0)
        L89:
            return
    }
}
