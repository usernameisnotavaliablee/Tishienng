package cn.jpush.android.q;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static volatile cn.jpush.android.q.a a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jpush.android.q.a.HandlerC0053a f1869b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1870c;

    /* renamed from: d, reason: collision with root package name */
    private cn.jpush.android.d.d f1871d;

    /* renamed from: cn.jpush.android.q.a$a, reason: collision with other inner class name */
    static class HandlerC0053a extends android.os.Handler {
        public HandlerC0053a(android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                java.lang.String r0 = "InAppConnect"
                super.handleMessage(r5)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
                r1.<init>()     // Catch: java.lang.Throwable -> L33
                java.lang.String r2 = "send message to handle, what: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L33
                int r2 = r5.what     // Catch: java.lang.Throwable -> L33
                r1.append(r2)     // Catch: java.lang.Throwable -> L33
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
                cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L33
                android.os.Bundle r1 = r5.getData()     // Catch: java.lang.Throwable -> L33
                r2 = 0
                if (r1 == 0) goto L35
                java.lang.String r3 = "n_content"
                java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L33
                boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L33
                if (r3 != 0) goto L35
                cn.jpush.android.d.d r1 = cn.jpush.android.d.d.b(r1)     // Catch: java.lang.Throwable -> L33
                goto L36
            L33:
                r5 = move-exception
                goto L96
            L35:
                r1 = r2
            L36:
                android.content.Context r3 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L33
                int r5 = r5.what     // Catch: java.lang.Throwable -> L33
                switch(r5) {
                    case 1001: goto L8e;
                    case 1002: goto L86;
                    case 1003: goto L7e;
                    case 1004: goto L76;
                    case 1005: goto L6e;
                    case 1006: goto L46;
                    case 1007: goto L3e;
                    default: goto L3d;
                }     // Catch: java.lang.Throwable -> L33
            L3d:
                return
            L3e:
                cn.jpush.android.o.a r5 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L33
                r5.e(r3, r1)     // Catch: java.lang.Throwable -> L33
                return
            L46:
                boolean r5 = cn.jpush.android.ad.a.j(r3)     // Catch: java.lang.Throwable -> L33
                if (r5 == 0) goto L6b
                cn.jpush.android.o.a r5 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L33
                boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L65
                java.lang.String r5 = "no message is showing,start to handle cache message"
                cn.jpush.android.helper.Logger.d(r0, r5)     // Catch: java.lang.Throwable -> L33
                cn.jpush.android.q.a r5 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L33
                java.lang.String r1 = "handle_cache_message"
                r5.a(r3, r2, r1)     // Catch: java.lang.Throwable -> L33
                return
            L65:
                java.lang.String r5 = "inapp message is showing,do nothing "
            L67:
                cn.jpush.android.helper.Logger.d(r0, r5)     // Catch: java.lang.Throwable -> L33
                return
            L6b:
                java.lang.String r5 = " inapp message do not show in background,do nothing"
                goto L67
            L6e:
                cn.jpush.android.o.a r5 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L33
                r5.g(r3, r1)     // Catch: java.lang.Throwable -> L33
                return
            L76:
                cn.jpush.android.o.a r5 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L33
                r5.c(r3, r1)     // Catch: java.lang.Throwable -> L33
                return
            L7e:
                cn.jpush.android.o.a r5 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L33
                r5.a(r3)     // Catch: java.lang.Throwable -> L33
                return
            L86:
                cn.jpush.android.o.a r5 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L33
                r5.b(r3, r1)     // Catch: java.lang.Throwable -> L33
                return
            L8e:
                cn.jpush.android.o.a r5 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L33
                r5.a(r3, r1)     // Catch: java.lang.Throwable -> L33
                return
            L96:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "handleMessage failed, "
                r1.append(r2)
                java.lang.String r5 = r5.getMessage()
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                cn.jpush.android.helper.Logger.w(r0, r5)
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jpush.android.q.a a() {
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a
            if (r0 != 0) goto L19
            java.lang.Class<cn.jpush.android.q.a> r0 = cn.jpush.android.q.a.class
            monitor-enter(r0)
            cn.jpush.android.q.a r1 = cn.jpush.android.q.a.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jpush.android.q.a r1 = new cn.jpush.android.q.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.q.a.a = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a
            return r0
    }

    private synchronized android.os.Handler b() {
            r4 = this;
            monitor-enter(r4)
            cn.jpush.android.q.a$a r0 = r4.f1869b     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3a
            cn.jpush.android.q.a$a r0 = new cn.jpush.android.q.a$a     // Catch: java.lang.Throwable -> L11
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L11
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            r4.f1869b = r0     // Catch: java.lang.Throwable -> L11
            goto L3a
        L11:
            r0 = move-exception
            java.lang.String r1 = "InAppConnect"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "build handle failed, "
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L38
            r2.append(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.w(r1, r0)     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.q.a$a r0 = new cn.jpush.android.q.a$a     // Catch: java.lang.Throwable -> L3a
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            r4.f1869b = r0     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L38:
            r0 = move-exception
            goto L3e
        L3a:
            cn.jpush.android.q.a$a r0 = r4.f1869b     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return r0
        L3e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    public void a(int r3) {
            r2 = this;
            android.os.Handler r0 = r2.b()
            boolean r0 = r0.hasMessages(r3)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "removeHandler remove waht="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppConnect"
            cn.jpush.android.helper.Logger.d(r1, r0)
            android.os.Handler r0 = r2.b()
            r0.removeMessages(r3)
        L27:
            return
    }

    public void a(android.content.Context r4) {
            r3 = this;
            cn.jpush.android.p.b r0 = cn.jpush.android.p.b.a()
            int r0 = r0.b()
            java.lang.String r1 = "InAppConnect"
            if (r0 > 0) goto L12
            java.lang.String r4 = "no notify inapp cache to deal"
            cn.jpush.android.helper.Logger.d(r1, r4)
            return
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkCacheOnRemoteProcess target="
            r0.append(r2)
            java.lang.String r2 = r3.f1870c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.p.b r0 = cn.jpush.android.p.b.a()
            java.lang.String r2 = r3.f1870c
            cn.jpush.android.d.d r0 = r0.b(r2)
            r3.f1871d = r0
            if (r0 == 0) goto L46
            java.lang.String r0 = "start to deal cache notify inapp message"
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.o.a$a r0 = new cn.jpush.android.o.a$a
            cn.jpush.android.d.d r2 = r3.f1871d
            r0.<init>(r4, r2)
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r4, r1, r0)
            return
        L46:
            java.lang.String r4 = "no find  message match target"
            cn.jpush.android.helper.Logger.d(r1, r4)
            return
    }

    public void a(android.content.Context r2, android.os.Bundle r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto Le
            if (r3 != 0) goto L9
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L9:
            java.lang.String r0 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r0, r4, r3)
        Le:
            return
    }

    public void a(android.content.Context r3, cn.jpush.android.d.d r4) {
            r2 = this;
            if (r3 == 0) goto Le
            if (r4 == 0) goto Le
            java.lang.String r0 = "InAppConnect"
            java.lang.String r1 = "start to process notify message"
            cn.jpush.android.helper.Logger.d(r0, r1)
            cn.jpush.android.d.b.a(r3, r4)
        Le:
            return
    }

    public void a(android.content.Context r1, cn.jpush.android.d.d r2, int r3) {
            r0 = this;
            r0.b(r1, r2, r3)
            return
    }

    public void a(android.content.Context r4, cn.jpush.android.d.d r5, java.lang.String r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "processOnRemoteProcess mCurrentTarget="
            r0.append(r1)
            java.lang.String r1 = r3.f1870c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppConnect"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r0 = 4
            if (r5 != 0) goto L26
            java.lang.String r5 = "parsing json failed"
            cn.jpush.android.helper.Logger.d(r1, r5)
            r1 = 2004(0x7d4, double:9.9E-321)
            cn.jpush.android.helper.c.a(r4, r6, r1, r0)
            return
        L26:
            r6 = 40
            int r1 = r5.bt
            if (r6 == r1) goto L33
            java.lang.String r6 = r5.f1757d
            r1 = 2005(0x7d5, double:9.906E-321)
            cn.jpush.android.helper.c.a(r4, r6, r1, r0)
        L33:
            cn.jpush.android.p.b r6 = cn.jpush.android.p.b.a()
            r6.a(r5)
            cn.jpush.android.q.a r6 = a()
            java.lang.String r0 = "check_can_show_message"
            r6.b(r4, r5, r0)
            return
    }

    public void a(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            cn.jpush.android.o.a r0 = cn.jpush.android.o.a.a()
            r0.b(r2, r3)
            return
    }

    public void a(android.content.Context r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L12
            cn.jpush.android.d.d r2 = r0.f1871d
            java.lang.String r2 = r2.f1757d
            cn.jpush.android.ad.c.d(r1, r2)
            cn.jpush.android.p.b r1 = cn.jpush.android.p.b.a()
            cn.jpush.android.d.d r2 = r0.f1871d
            r1.b(r2)
        L12:
            cn.jpush.android.p.b r1 = cn.jpush.android.p.b.a()
            cn.jpush.android.d.d r2 = r0.f1871d
            java.lang.String r2 = r2.f1757d
            r1.c(r2)
            return
    }

    public void b(android.content.Context r10, cn.jpush.android.d.d r11, int r12) {
            r9 = this;
            r0 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r1 = "InAppConnect"
            r2 = 1002(0x3ea, float:1.404E-42)
            if (r12 == r0) goto La
            if (r12 != r2) goto Ld
        La:
            r9.a(r2)     // Catch: java.lang.Throwable -> L1f
        Ld:
            int r0 = r11.bu     // Catch: java.lang.Throwable -> L1f
            r3 = 1
            r4 = 0
            if (r3 != r0) goto L22
            int r0 = r11.aR     // Catch: java.lang.Throwable -> L1f
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L1f
            if (r12 == r2) goto L1a
            goto L55
        L1a:
            long r4 = cn.jpush.android.r.b.a(r10, r6, r3)     // Catch: java.lang.Throwable -> L1f
            goto L55
        L1f:
            r10 = move-exception
            goto L9a
        L22:
            r3 = 4
            r6 = 0
            if (r3 != r0) goto L3b
            cn.jpush.android.o.a r0 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L37
            long r7 = r11.bR     // Catch: java.lang.Throwable -> L1f
            long r7 = cn.jpush.android.r.b.b(r10, r7)     // Catch: java.lang.Throwable -> L1f
            goto L38
        L37:
            r7 = r4
        L38:
            if (r12 == r2) goto L51
            goto L55
        L3b:
            cn.jpush.android.o.a r0 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L4c
            long r7 = r11.bR     // Catch: java.lang.Throwable -> L1f
            long r7 = cn.jpush.android.r.b.b(r10, r7)     // Catch: java.lang.Throwable -> L1f
            goto L4e
        L4c:
            long r7 = r11.bQ     // Catch: java.lang.Throwable -> L1f
        L4e:
            if (r12 == r2) goto L51
            goto L55
        L51:
            long r4 = cn.jpush.android.r.b.a(r10, r7, r6)     // Catch: java.lang.Throwable -> L1f
        L55:
            r10 = 1005(0x3ed, float:1.408E-42)
            if (r12 != r10) goto L5b
            r4 = 1000(0x3e8, double:4.94E-321)
        L5b:
            android.os.Bundle r10 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1f
            r10.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "n_content"
            java.lang.String r11 = r11.c()     // Catch: java.lang.Throwable -> L1f
            r10.putString(r0, r11)     // Catch: java.lang.Throwable -> L1f
            android.os.Message r11 = new android.os.Message     // Catch: java.lang.Throwable -> L1f
            r11.<init>()     // Catch: java.lang.Throwable -> L1f
            r11.what = r12     // Catch: java.lang.Throwable -> L1f
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L1f
            r11.arg1 = r0     // Catch: java.lang.Throwable -> L1f
            r11.setData(r10)     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r10 = r9.b()     // Catch: java.lang.Throwable -> L1f
            r10.sendMessageDelayed(r11, r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r10.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r11 = "notify inapp send to handler succeed, delayTime: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L1f
            r10.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r11 = ", what: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L1f
            r10.append(r12)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L1f
            cn.jpush.android.helper.Logger.dd(r1, r10)     // Catch: java.lang.Throwable -> L1f
            return
        L9a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "sendToMainHandler failed, "
            r11.append(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jpush.android.helper.Logger.w(r1, r10)
            return
    }

    public void b(android.content.Context r2, cn.jpush.android.d.d r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            cn.jpush.android.x.b.a(r2, r4, r3, r0)
            return
    }

    public void b(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "onTargetChange localTarget="
            r2.append(r0)
            java.lang.String r0 = r1.f1870c
            r2.append(r0)
            java.lang.String r0 = " newTarget="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "InAppConnect"
            cn.jpush.android.helper.Logger.d(r0, r2)
            r1.f1870c = r3
            cn.jpush.android.p.b r2 = cn.jpush.android.p.b.a()
            r2.c()
            return
    }
}
