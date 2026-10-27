package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    private java.util.LinkedHashSet<cn.jiguang.ab.g> a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.ab.k f279b;

    /* renamed from: c, reason: collision with root package name */
    private cn.jiguang.ab.h f280c;

    /* renamed from: d, reason: collision with root package name */
    private cn.jiguang.ab.p f281d;

    /* renamed from: e, reason: collision with root package name */
    private cn.jiguang.ab.f f282e;

    /* renamed from: f, reason: collision with root package name */
    private cn.jiguang.ab.o f283f;

    public j(cn.jiguang.ab.k r6) {
            r5 = this;
            r5.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5.a = r0
            cn.jiguang.ab.p r0 = new cn.jiguang.ab.p
            r1 = 0
            java.lang.String r2 = "ssn"
            r3 = 5
            r4 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r3, r4, r1, r2)
            r5.f281d = r0
            cn.jiguang.ab.f r0 = new cn.jiguang.ab.f
            r0.<init>()
            r5.f282e = r0
            r5.f279b = r6
            return
    }

    private void a(java.util.LinkedHashSet<cn.jiguang.ab.g> r4) {
            r3 = this;
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r3.a
            r4.removeAll(r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L42
            cn.jiguang.ab.k r0 = r3.f279b
            android.content.Context r0 = r0.a
            r1 = 0
            java.util.LinkedHashSet r4 = cn.jiguang.ab.e.a(r0, r4, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "connect: last good sis info"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SisConn"
            cn.jiguang.w.f.c(r1, r0)
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r4.next()
            cn.jiguang.ab.g r0 = (cn.jiguang.ab.g) r0
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L2f
        L41:
            return
        L42:
            cn.jiguang.ab.k r4 = r3.f279b
            android.content.Context r4 = r4.a
            r0 = 1405(0x57d, float:1.969E-42)
            java.lang.String r1 = "没有可用的 IP 地址进行连接-旧"
            cn.jiguang.ab.c.a.a(r4, r0, r1)
            return
    }

    private void a(java.util.LinkedHashSet<cn.jiguang.ab.g> r10, long r11) {
            r9 = this;
            cn.jiguang.ab.f r0 = r9.f282e
            r0.a()
            cn.jiguang.ab.p r0 = r9.f281d
            r0.b()
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r9.a
            r10.removeAll(r0)
            cn.jiguang.ab.k r0 = r9.f279b
            android.content.Context r0 = r0.a
            long r1 = java.lang.System.currentTimeMillis()
            java.util.LinkedHashSet r10 = cn.jiguang.ab.e.a(r0, r10, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "connect: new sis info="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SisConn"
            cn.jiguang.w.f.c(r1, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L44
            cn.jiguang.ab.k r10 = r9.f279b
            android.content.Context r10 = r10.a
            r11 = 1406(0x57e, float:1.97E-42)
            java.lang.String r12 = "没有可用的 IP 地址进行连接-新"
            cn.jiguang.ab.c.a.a(r10, r11, r12)
            return
        L44:
            java.util.Iterator r0 = r10.iterator()
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2
            long r3 = android.os.SystemClock.uptimeMillis()
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 >= 0) goto L168
            boolean r2 = r9.a(r2)
            if (r2 == 0) goto L48
            goto L168
        L64:
            java.lang.String r0 = "after connect use new sis, wait connect Result"
            cn.jiguang.w.f.c(r1, r0)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r11 - r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L77
            goto L168
        L77:
            cn.jiguang.ab.p r0 = r9.f281d
            java.lang.Object r0 = r0.a(r2)
            if (r0 == 0) goto L81
            goto L168
        L81:
            cn.jiguang.ab.o r0 = r9.f283f
            if (r0 == 0) goto L87
            goto L168
        L87:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L90:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r10.next()
            cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2
            java.util.LinkedHashSet<cn.jiguang.ab.g> r3 = r9.a
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L90
            java.lang.String r2 = r2.a
            r0.add(r2)
            goto L90
        Laa:
            cn.jiguang.ab.k r10 = r9.f279b
            int r10 = r10.b()
            r2 = 0
            r3 = 1
            if (r10 == r3) goto Lb8
            if (r10 != 0) goto Lb7
            goto Lb8
        Lb7:
            r3 = 0
        Lb8:
            cn.jiguang.ab.k r10 = r9.f279b
            android.content.Context r10 = r10.a
            cn.jiguang.e.a r3 = cn.jiguang.e.a.b(r3)
            java.lang.Object r10 = cn.jiguang.e.b.a(r10, r3)
            java.lang.String r10 = (java.lang.String) r10
            cn.jiguang.ab.g r10 = cn.jiguang.ab.g.a(r10)
            if (r10 == 0) goto L168
            cn.jiguang.ae.b r3 = cn.jiguang.ae.b.a()
            cn.jiguang.ab.k r4 = r9.f279b
            android.content.Context r4 = r4.a
            java.lang.String r5 = r10.a
            r6 = 3000(0xbb8, double:1.482E-320)
            r8 = 0
            java.net.InetAddress[] r3 = r3.b(r4, r5, r6, r8)
            if (r3 == 0) goto L168
            int r4 = r3.length
            if (r4 <= 0) goto L168
            r2 = r3[r2]
            r10.f271c = r2
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r11 - r2
            r4 = 10
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lf4
            goto L168
        Lf4:
            cn.jiguang.ab.o r4 = new cn.jiguang.ab.o
            cn.jiguang.ab.k r5 = r9.f279b
            r4.<init>(r5, r10, r0)
            r9.f283f = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "second sis, addr="
            r4.append(r5)
            r4.append(r10)
            java.lang.String r10 = ", failIps="
            r4.append(r10)
            r4.append(r0)
            java.lang.String r10 = r4.toString()
            cn.jiguang.w.f.c(r1, r10)
            java.util.concurrent.FutureTask r10 = new java.util.concurrent.FutureTask
            cn.jiguang.ab.o r0 = r9.f283f
            r10.<init>(r0)
            cn.jiguang.z.b.d(r10)     // Catch: java.lang.Throwable -> L13a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L13a
            java.lang.Object r10 = r10.get(r2, r0)     // Catch: java.lang.Throwable -> L13a
            cn.jiguang.ab.l r10 = (cn.jiguang.ab.l) r10     // Catch: java.lang.Throwable -> L13a
            if (r10 == 0) goto L140
            cn.jiguang.ab.k r0 = r9.f279b     // Catch: java.lang.Throwable -> L13a
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L13a
            boolean r0 = cn.jiguang.ab.c.f(r0)     // Catch: java.lang.Throwable -> L13a
            if (r0 == 0) goto L13d
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r10.f289b     // Catch: java.lang.Throwable -> L13a
            goto L141
        L13a:
            r0 = move-exception
            r10 = r0
            goto L154
        L13d:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r10.a     // Catch: java.lang.Throwable -> L13a
            goto L141
        L140:
            r0 = 0
        L141:
            if (r0 == 0) goto L168
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L13a
            if (r2 != 0) goto L168
            cn.jiguang.ab.k r2 = r9.f279b     // Catch: java.lang.Throwable -> L13a
            cn.jiguang.ab.g r10 = r10.f294g     // Catch: java.lang.Throwable -> L13a
            r2.a(r10)     // Catch: java.lang.Throwable -> L13a
            r9.a(r0, r11)     // Catch: java.lang.Throwable -> L13a
            return
        L154:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "second sis e:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.i(r1, r10)
        L168:
            return
    }

    private boolean a() {
            r5 = this;
            cn.jiguang.ab.k r0 = r5.f279b
            android.content.Context r0 = r0.a
            java.lang.String r0 = cn.jiguang.av.n.a(r0)
            cn.jiguang.ab.k r1 = r5.f279b
            android.content.Context r1 = r1.a
            boolean r0 = a(r1, r0)
            cn.jiguang.ab.k r1 = r5.f279b
            android.content.Context r1 = r1.a
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aE()
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            if (r0 != 0) goto L2f
            r3 = 180000(0x2bf20, double:8.8932E-319)
            boolean r0 = cn.jiguang.av.x.b(r1, r3)
            if (r0 != 0) goto L2f
            r0 = 1
            return r0
        L2f:
            r0 = 0
            return r0
    }

    private static boolean a(android.content.Context r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aw()
            java.lang.Object r3 = cn.jiguang.e.b.a(r3, r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "newType="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = " last="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "SisConn"
            cn.jiguang.w.f.c(r2, r0)
            boolean r3 = r4.equalsIgnoreCase(r3)
            r3 = r3 ^ r1
            return r3
    }

    private boolean a(cn.jiguang.ab.g r12) {
            r11 = this;
            cn.jiguang.ab.h r0 = r11.f280c
            boolean r0 = r0.a
            r1 = 0
            r2 = -991(0xfffffffffffffc21, float:NaN)
            r3 = 1
            if (r0 == 0) goto L15
            cn.jiguang.ad.e r12 = new cn.jiguang.ad.e
            r12.<init>(r2, r1)
        Lf:
            cn.jiguang.ab.p r0 = r11.f281d
            r0.a(r12)
            return r3
        L15:
            cn.jiguang.ab.p r0 = r11.f281d
            boolean r0 = r0.a()
            if (r0 == 0) goto L1e
            return r3
        L1e:
            r0 = 0
            if (r12 == 0) goto Lce
            boolean r4 = r12.a()
            if (r4 == 0) goto Lce
            java.util.LinkedHashSet<cn.jiguang.ab.g> r4 = r11.a
            boolean r4 = r4.contains(r12)
            if (r4 == 0) goto L31
            goto Lce
        L31:
            cn.jiguang.ae.b r5 = cn.jiguang.ae.b.a()
            cn.jiguang.ab.k r4 = r11.f279b
            android.content.Context r6 = r4.a
            java.lang.String r7 = r12.a
            r8 = 3000(0xbb8, double:1.482E-320)
            boolean r10 = r4.a()
            java.net.InetAddress[] r4 = r5.b(r6, r7, r8, r10)
            if (r4 == 0) goto Lb2
            int r5 = r4.length
            if (r5 != 0) goto L4b
            goto Lb2
        L4b:
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.LinkedList r4 = cn.jiguang.av.x.a(r4)
            cn.jiguang.ab.k r5 = r11.f279b
            android.content.Context r5 = r5.a
            java.util.LinkedList r4 = cn.jiguang.av.x.a(r5, r4)
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r4.next()
            java.net.InetAddress r5 = (java.net.InetAddress) r5
            cn.jiguang.ab.h r6 = r11.f280c
            boolean r6 = r6.a
            if (r6 == 0) goto L77
            cn.jiguang.ad.e r12 = new cn.jiguang.ad.e
            r12.<init>(r2, r1)
            goto Lf
        L77:
            cn.jiguang.ab.p r6 = r11.f281d
            boolean r6 = r6.a()
            if (r6 == 0) goto L80
            return r3
        L80:
            cn.jiguang.ab.g r6 = new cn.jiguang.ab.g
            int r7 = r12.f270b
            r6.<init>(r5, r7)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r5 = r11.a
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L5f
            cn.jiguang.ab.f r5 = r11.f282e
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L5f
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r11.a
            r1.add(r6)
            cn.jiguang.ab.p r1 = r11.f281d
            cn.jiguang.ab.b r2 = new cn.jiguang.ab.b
            cn.jiguang.ab.k r3 = r11.f279b
            cn.jiguang.ab.f r4 = r11.f282e
            cn.jiguang.ab.h r5 = r11.f280c
            r2.<init>(r3, r1, r4, r5)
            r1.a(r2)
        Lac:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r11.a
            r1.add(r12)
            return r0
        Lb2:
            cn.jiguang.ab.k r1 = r11.f279b
            android.content.Context r1 = r1.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DNS解析失败: "
            r2.append(r3)
            java.lang.String r12 = r12.a
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r2 = 1404(0x57c, float:1.967E-42)
            cn.jiguang.ab.c.a.a(r1, r2, r12)
        Lce:
            return r0
    }

    private void b() {
            r8 = this;
            cn.jiguang.ab.k r0 = r8.f279b
            android.content.Context r0 = r0.a
            boolean r0 = cn.jiguang.av.b.e(r0)
            cn.jiguang.ab.k r1 = r8.f279b
            android.content.Context r1 = r1.a
            r2 = r0 ^ 1
            cn.jiguang.e.a r2 = cn.jiguang.e.a.c(r2)
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            cn.jiguang.ab.g r1 = cn.jiguang.ab.g.a(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connect: use last good"
            r2.append(r3)
            java.lang.String r4 = "v4"
            java.lang.String r5 = "v6"
            if (r0 == 0) goto L30
            r6 = r5
            goto L31
        L30:
            r6 = r4
        L31:
            r2.append(r6)
            java.lang.String r6 = " address="
            r2.append(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "SisConn"
            cn.jiguang.w.f.c(r7, r2)
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L4d
            goto L107
        L4d:
            cn.jiguang.ab.k r1 = r8.f279b
            android.content.Context r1 = r1.a
            cn.jiguang.e.a r2 = cn.jiguang.e.a.c(r0)
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            cn.jiguang.ab.g r1 = cn.jiguang.ab.g.a(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            if (r0 == 0) goto L6a
            goto L6b
        L6a:
            r4 = r5
        L6b:
            r2.append(r4)
            r2.append(r6)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.c(r7, r0)
            boolean r0 = r8.a(r1)
            if (r0 == 0) goto L83
            goto L107
        L83:
            java.util.LinkedHashSet r0 = r8.c()
            if (r0 == 0) goto L8e
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r8.a
            r0.removeAll(r1)
        L8e:
            java.util.LinkedList r0 = cn.jiguang.av.x.a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "connect: use defaultConn="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r7, r1)
            java.util.Iterator r1 = r0.iterator()
        Laa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r1.next()
            cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2
            boolean r2 = r8.a(r2)
            if (r2 == 0) goto Laa
            goto L107
        Lbd:
            cn.jiguang.ac.l r1 = cn.jiguang.ac.l.a()
            cn.jiguang.ab.k r2 = r8.f279b
            android.content.Context r2 = r2.a
            java.lang.String r2 = cn.jiguang.aa.a.b(r2)
            r3 = 10000(0x2710, double:4.9407E-320)
            java.util.LinkedHashSet r1 = r1.a(r2, r3)
            r0.clear()
            if (r1 == 0) goto Ldd
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r8.a
            r1.removeAll(r0)
            java.util.LinkedList r0 = cn.jiguang.av.x.a(r1)
        Ldd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "connect: use srv address"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r7, r1)
            java.util.Iterator r0 = r0.iterator()
        Lf5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L107
            java.lang.Object r1 = r0.next()
            cn.jiguang.ab.g r1 = (cn.jiguang.ab.g) r1
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto Lf5
        L107:
            return
    }

    private java.util.LinkedHashSet<cn.jiguang.ab.g> c() {
            r8 = this;
            r0 = 0
            cn.jiguang.ab.k r1 = r8.f279b     // Catch: java.lang.Throwable -> Lbb
            android.content.Context r1 = r1.a     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = cn.jiguang.aa.a.a(r1)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "SisConn"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = "load Default Conn, from host="
            r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> Lbb
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto L26
            return r0
        L26:
            cn.jiguang.ae.b r2 = cn.jiguang.ae.b.a()     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.k r1 = r8.f279b     // Catch: java.lang.Throwable -> Lbb
            android.content.Context r3 = r1.a     // Catch: java.lang.Throwable -> Lbb
            boolean r7 = r1.a()     // Catch: java.lang.Throwable -> Lbb
            r5 = 3000(0xbb8, double:1.482E-320)
            java.net.InetAddress[] r1 = r2.b(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto Lbb
            int r2 = r1.length     // Catch: java.lang.Throwable -> Lbb
            if (r2 != 0) goto L3f
            goto Lbb
        L3f:
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> Lbb
            java.util.LinkedList r1 = cn.jiguang.av.x.a(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto Lbb
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L50
            goto Lbb
        L50:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lbb
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = r1.getHostAddress()     // Catch: java.lang.Throwable -> Lbb
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7000(0x1b58, float:9.809E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7002(0x1b5a, float:9.812E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7003(0x1b5b, float:9.813E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7004(0x1b5c, float:9.815E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7005(0x1b5d, float:9.816E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7006(0x1b5e, float:9.817E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7007(0x1b5f, float:9.819E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7008(0x1b60, float:9.82E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> Lbb
            r4 = 7009(0x1b61, float:9.822E-42)
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lbb
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbb
            return r2
        Lbb:
            return r0
    }

    public cn.jiguang.ag.a a(cn.jiguang.ab.h r12) {
            r11 = this;
            r11.f280c = r12
            java.lang.String r12 = "start sisAndConnect..."
            java.lang.String r0 = "SisConn"
            cn.jiguang.w.f.e(r0, r12)
            cn.jiguang.ab.f r12 = new cn.jiguang.ab.f
            r12.<init>()
            r11.f282e = r12
            long r1 = android.os.SystemClock.uptimeMillis()
            r3 = 12000(0x2ee0, double:5.929E-320)
            long r1 = r1 + r3
            cn.jiguang.ab.k r12 = r11.f279b
            android.content.Context r12 = r12.a
            boolean r12 = cn.jiguang.ab.c.f(r12)
            cn.jiguang.ab.k r5 = r11.f279b
            android.content.Context r5 = r5.a
            if (r12 == 0) goto L2a
            cn.jiguang.e.a r6 = cn.jiguang.e.a.aC()
            goto L2e
        L2a:
            cn.jiguang.e.a r6 = cn.jiguang.e.a.aB()
        L2e:
            java.lang.Object r5 = cn.jiguang.e.b.a(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            java.util.LinkedHashSet r5 = cn.jiguang.ab.g.c(r5)
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L44
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L44
            r8 = 1
            goto L45
        L44:
            r8 = 0
        L45:
            boolean r9 = r11.a()
            if (r8 == 0) goto L50
            if (r9 == 0) goto L50
            r11.a(r5)
        L50:
            cn.jiguang.ab.k r10 = r11.f279b
            cn.jiguang.ab.l r3 = r10.a(r3)
            r4 = 0
            if (r3 == 0) goto L61
            if (r12 == 0) goto L5e
            java.util.LinkedHashSet<cn.jiguang.ab.g> r12 = r3.f289b
            goto L62
        L5e:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r12 = r3.a
            goto L62
        L61:
            r12 = r4
        L62:
            if (r12 == 0) goto L75
            boolean r10 = r12.isEmpty()
            if (r10 != 0) goto L75
            cn.jiguang.ab.k r5 = r11.f279b
            cn.jiguang.ab.g r3 = r3.f294g
            r5.a(r3)
            r11.a(r12, r1)
            goto L7c
        L75:
            if (r8 == 0) goto L7c
            if (r9 != 0) goto L7c
            r11.a(r5)
        L7c:
            r11.b()
            java.lang.String r12 = "wait final result..."
            cn.jiguang.w.f.c(r0, r12)
            cn.jiguang.ab.p r12 = r11.f281d
            r1 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r12 = r12.a(r1)
            cn.jiguang.ab.p r1 = r11.f281d
            r1.a(r6)
            boolean r1 = r12 instanceof cn.jiguang.ag.a
            if (r1 == 0) goto Lba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "connect succeed connResult hostName="
            r1.append(r2)
            cn.jiguang.ag.a r12 = (cn.jiguang.ag.a) r12
            java.lang.String r2 = r12.f461h
            r1.append(r2)
            java.lang.String r2 = " port="
            r1.append(r2)
            int r2 = r12.f462i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.e(r0, r1)
            return r12
        Lba:
            boolean r1 = r12 instanceof java.lang.Exception
            if (r1 == 0) goto Lef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "all sis and connect failed, e:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.e(r0, r1)
            cn.jiguang.ab.k r0 = r11.f279b
            android.content.Context r0 = r0.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception: "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r2 = 1402(0x57a, float:1.965E-42)
            cn.jiguang.ab.c.a.a(r0, r2, r1)
            java.lang.Exception r12 = (java.lang.Exception) r12
            throw r12
        Lef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "all sis and connect failed:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.k(r0, r1)
            cn.jiguang.ab.k r0 = r11.f279b
            android.content.Context r0 = r0.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ERR_UNKNOWN: "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r1 = 1403(0x57b, float:1.966E-42)
            cn.jiguang.ab.c.a.a(r0, r1, r12)
            cn.jiguang.ad.e r12 = new cn.jiguang.ad.e
            r12.<init>(r7, r4)
            throw r12
    }
}
