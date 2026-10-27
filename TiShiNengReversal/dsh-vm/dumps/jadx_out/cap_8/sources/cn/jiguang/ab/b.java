package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements java.util.concurrent.Callable<cn.jiguang.ag.a> {
    private final cn.jiguang.ab.k a;

    /* renamed from: b, reason: collision with root package name */
    private final cn.jiguang.ab.p f259b;

    /* renamed from: c, reason: collision with root package name */
    private final cn.jiguang.ab.f f260c;

    /* renamed from: d, reason: collision with root package name */
    private final cn.jiguang.ab.h f261d;

    public b(cn.jiguang.ab.k r1, cn.jiguang.ab.p r2, cn.jiguang.ab.f r3, cn.jiguang.ab.h r4) {
            r0 = this;
            r0.<init>()
            r0.f259b = r2
            r0.a = r1
            r0.f260c = r3
            r0.f261d = r4
            return
    }

    public cn.jiguang.ag.a a() {
            r4 = this;
            cn.jiguang.ab.f r0 = r4.f260c     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L47
            cn.jiguang.ab.k r0 = r4.a     // Catch: java.lang.Throwable -> L15
            int r0 = r0.b()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.ab.f r1 = r4.f260c     // Catch: java.lang.Throwable -> L15
            cn.jiguang.ab.g r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L15
            cn.jiguang.ag.a r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run e:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ConnTask"
            cn.jiguang.w.f.i(r1, r0)
            cn.jiguang.ab.k r1 = r4.a
            android.content.Context r1 = r1.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "连接某个ip 未知异常: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 1408(0x580, float:1.973E-42)
            cn.jiguang.ab.c.a.a(r1, r2, r0)
        L47:
            r0 = 0
            return r0
    }

    public cn.jiguang.ag.a a(cn.jiguang.ab.g r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            cn.jiguang.ab.p r2 = r0.f259b
            boolean r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            cn.jiguang.ab.h r2 = r0.f261d
            r4 = -991(0xfffffffffffffc21, float:NaN)
            if (r2 == 0) goto L1b5
            boolean r2 = r2.a
            if (r2 == 0) goto L1a
            goto L1b5
        L1a:
            if (r1 != 0) goto L1d
            return r3
        L1d:
            java.lang.String r2 = cn.jiguang.aa.a.n
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2f
            java.lang.String r2 = cn.jiguang.aa.a.n
            r1.a = r2
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)
            r1.f271c = r2
        L2f:
            int r2 = cn.jiguang.aa.a.o
            if (r2 <= 0) goto L35
            r1.f270b = r2
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Open connection with ip="
            r2.append(r5)
            java.net.InetAddress r5 = r1.f271c
            r2.append(r5)
            java.lang.String r5 = ", port:"
            r2.append(r5)
            int r6 = r1.f270b
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "ConnTask"
            cn.jiguang.w.f.d(r6, r2)
            long r7 = android.os.SystemClock.uptimeMillis()
            cn.jiguang.ab.k r2 = r0.a
            android.content.Context r2 = r2.a
            boolean r2 = cn.jiguang.ab.c.f(r2)
            r9 = 20
            r10 = 8128(0x1fc0, float:1.139E-41)
            if (r2 == 0) goto L74
            java.lang.String r2 = "start connect ssl socket"
            cn.jiguang.w.f.d(r6, r2)
            cn.jiguang.ag.b r2 = new cn.jiguang.ag.b
            r2.<init>(r10, r9)
            goto L79
        L74:
            cn.jiguang.ag.c r2 = new cn.jiguang.ag.c
            r2.<init>(r10, r9)
        L79:
            cn.jiguang.al.d r9 = cn.jiguang.al.d.a()
            java.lang.String r10 = r1.a
            int r11 = r1.f270b
            int r12 = r2.f460g
            java.lang.String r9 = r9.a(r10, r11, r12)
            android.content.Context r10 = cn.jiguang.internal.JConstants.getAppContext()
            r11 = 1
            long r14 = cn.jiguang.al.e.a(r10, r11)
            java.lang.String r10 = r1.a
            int r12 = r1.f270b
            int r16 = r2.a(r10, r12)
            if (r16 != 0) goto La4
            android.content.Context r10 = cn.jiguang.internal.JConstants.getAppContext()
            cn.jiguang.al.e.a(r10, r11, r14)
        La1:
            r10 = r16
            goto Laf
        La4:
            android.content.Context r12 = cn.jiguang.internal.JConstants.getAppContext()
            r13 = 1
            java.lang.String r17 = ""
            cn.jiguang.al.e.a(r12, r13, r14, r16, r17)
            goto La1
        Laf:
            cn.jiguang.ab.p r12 = r0.f259b
            boolean r12 = r12.a()
            if (r12 == 0) goto Lc2
            cn.jiguang.av.x.a(r2)
            cn.jiguang.al.d r1 = cn.jiguang.al.d.a()
            r1.d(r9, r4)
            return r3
        Lc2:
            cn.jiguang.ab.h r12 = r0.f261d
            boolean r12 = r12.a
            if (r12 == 0) goto Ldd
            cn.jiguang.ad.e r1 = new cn.jiguang.ad.e
            r1.<init>(r4, r3)
            cn.jiguang.ab.p r5 = r0.f259b
            r5.a(r1)
            cn.jiguang.av.x.a(r2)
            cn.jiguang.al.d r1 = cn.jiguang.al.d.a()
            r1.d(r9, r4)
            return r3
        Ldd:
            cn.jiguang.al.d r4 = cn.jiguang.al.d.a()
            r4.d(r9, r10)
            if (r10 != 0) goto L13d
            java.net.InetAddress r3 = r1.f271c
            boolean r3 = r3 instanceof java.net.Inet4Address
            r4 = 0
            if (r3 != 0) goto Lf8
            java.lang.String r3 = r1.a
            boolean r3 = cn.jiguang.av.v.g(r3)
            if (r3 == 0) goto Lf6
            goto Lf8
        Lf6:
            r3 = 0
            goto Lf9
        Lf8:
            r3 = 1
        Lf9:
            cn.jiguang.ab.k r7 = r0.a
            android.content.Context r7 = r7.a
            cn.jiguang.e.a r3 = cn.jiguang.e.a.c(r3)
            java.lang.String r8 = r1.toString()
            cn.jiguang.e.a r3 = r3.a(r8)
            cn.jiguang.e.a[] r8 = new cn.jiguang.e.a[r11]
            r8[r4] = r3
            cn.jiguang.e.b.a(r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Succeed to open connection - ip:"
            r3.append(r4)
            java.net.InetAddress r4 = r1.f271c
            r3.append(r4)
            r3.append(r5)
            int r4 = r1.f270b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.g(r6, r3)
            cn.jiguang.ab.p r3 = r0.f259b
            r3.a(r2)
            cn.jiguang.ab.k r3 = r0.a
            android.content.Context r3 = r3.a
            r4 = 0
            cn.jiguang.ab.e.a(r3, r1, r11, r4)
            return r2
        L13d:
            long r11 = android.os.SystemClock.uptimeMillis()
            long r22 = r11 - r7
            cn.jiguang.ab.k r4 = r0.a
            android.content.Context r4 = r4.a
            long r20 = cn.jiguang.d.b.b(r4)
            cn.jiguang.ab.k r4 = r0.a
            java.lang.String r7 = r1.a
            int r8 = r1.f270b
            r17 = 2
            r16 = r4
            r18 = r7
            r19 = r8
            r24 = r10
            r16.a(r17, r18, r19, r20, r22, r24)
            r11 = r22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Failed("
            r4.append(r7)
            r4.append(r10)
            java.lang.String r7 = ") to open connection - ip:"
            r4.append(r7)
            java.net.InetAddress r7 = r1.f271c
            r4.append(r7)
            r4.append(r5)
            int r5 = r1.f270b
            r4.append(r5)
            java.lang.String r5 = ", cost:"
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.f(r6, r4)
            cn.jiguang.ab.k r5 = r0.a
            android.content.Context r5 = r5.a
            r6 = -1
            cn.jiguang.ab.e.a(r5, r1, r6, r11)
            cn.jiguang.av.x.a(r2)
            cn.jiguang.ab.k r1 = r0.a
            android.content.Context r1 = r1.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "连接某个ip失败: "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 1407(0x57f, float:1.972E-42)
            cn.jiguang.ab.c.a.a(r1, r4, r2)
            return r3
        L1b5:
            cn.jiguang.ad.e r1 = new cn.jiguang.ad.e
            r1.<init>(r4, r3)
            cn.jiguang.ab.p r2 = r0.f259b
            r2.a(r1)
            return r3
    }

    @Override // java.util.concurrent.Callable
    public /* synthetic */ cn.jiguang.ag.a call() {
            r1 = this;
            cn.jiguang.ag.a r0 = r1.a()
            return r0
    }
}
