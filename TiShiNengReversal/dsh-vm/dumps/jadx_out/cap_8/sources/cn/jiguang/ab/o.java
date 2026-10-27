package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o implements java.util.concurrent.Callable<cn.jiguang.ab.l> {
    private final cn.jiguang.ab.k a;

    /* renamed from: b, reason: collision with root package name */
    private final cn.jiguang.ab.p f317b;

    /* renamed from: c, reason: collision with root package name */
    private final cn.jiguang.ab.f f318c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.Set<java.lang.String> f319d;

    /* renamed from: e, reason: collision with root package name */
    private cn.jiguang.ab.g f320e;

    public o(cn.jiguang.ab.k r1, cn.jiguang.ab.g r2, java.util.Set<java.lang.String> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 0
            r0.f317b = r1
            r0.f318c = r1
            r0.f320e = r2
            r0.f319d = r3
            return
    }

    public o(cn.jiguang.ab.k r1, cn.jiguang.ab.p r2, cn.jiguang.ab.f r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f317b = r2
            r0.f318c = r3
            return
    }

    private static void a(android.content.Context r11, cn.jiguang.ab.l r12) {
            if (r12 == 0) goto Lc9
            boolean r0 = r12.a()
            if (r0 == 0) goto La
            goto Lc9
        La:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r12.a
            java.lang.String r0 = cn.jiguang.ab.g.a(r0)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r1 = r12.f289b
            java.lang.String r1 = cn.jiguang.ab.g.a(r1)
            java.lang.String r2 = cn.jiguang.av.n.a(r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "updateSisInfo ips="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " sslIps="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " net="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "SisTask"
            cn.jiguang.w.f.c(r4, r3)
            a(r11, r0, r1)
            r0 = 0
            cn.jiguang.e.a r1 = cn.jiguang.e.a.d(r0)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r3 = r12.f290c
            java.lang.String r3 = cn.jiguang.ab.g.a(r3)
            cn.jiguang.e.a r1 = r1.a(r3)
            r3 = 1
            cn.jiguang.e.a r4 = cn.jiguang.e.a.d(r3)
            java.util.LinkedHashSet<cn.jiguang.ab.g> r5 = r12.f291d
            java.lang.String r5 = cn.jiguang.ab.g.a(r5)
            cn.jiguang.e.a r4 = r4.a(r5)
            cn.jiguang.e.a r5 = cn.jiguang.e.a.aG()
            java.util.LinkedHashSet<cn.jiguang.ab.g> r6 = r12.f292e
            java.lang.String r6 = cn.jiguang.ab.g.a(r6)
            cn.jiguang.e.a r5 = r5.a(r6)
            cn.jiguang.e.a r6 = cn.jiguang.e.a.aJ()
            org.json.JSONObject r7 = r12.f293f
            if (r7 == 0) goto L7c
            java.lang.String r7 = r7.toString()
            goto L7d
        L7c:
            r7 = 0
        L7d:
            cn.jiguang.e.a r6 = r6.a(r7)
            cn.jiguang.e.a r7 = cn.jiguang.e.a.aD()
            boolean r8 = r12.f295h
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            cn.jiguang.e.a r7 = r7.a(r8)
            cn.jiguang.e.a r8 = cn.jiguang.e.a.aE()
            long r9 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            cn.jiguang.e.a r8 = r8.a(r9)
            r9 = 6
            cn.jiguang.e.a[] r9 = new cn.jiguang.e.a[r9]
            r9[r0] = r1
            r9[r3] = r4
            r1 = 2
            r9[r1] = r5
            r1 = 3
            r9[r1] = r6
            r1 = 4
            r9[r1] = r7
            r1 = 5
            r9[r1] = r8
            cn.jiguang.e.b.a(r11, r9)
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aw()
            cn.jiguang.e.a r1 = r1.a(r2)
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r3]
            r2[r0] = r1
            cn.jiguang.e.b.a(r11, r2)
            int r12 = r12.f296i
            cn.jiguang.v.j.a(r11, r12)
        Lc9:
            return
    }

    private static void a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
            long r0 = java.lang.System.currentTimeMillis()
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aC()
            java.lang.Object r2 = cn.jiguang.e.b.a(r8, r2)
            java.lang.String r2 = (java.lang.String) r2
            cn.jiguang.e.a r3 = cn.jiguang.e.a.aB()
            java.lang.Object r3 = cn.jiguang.e.b.a(r8, r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            r6 = 1
            java.lang.String r7 = "-sis-"
            if (r4 != 0) goto La4
            java.lang.String[] r3 = r3.split(r7)
            if (r3 == 0) goto L82
            int r4 = r3.length
            if (r4 <= 0) goto L82
            r4 = r3[r5]
            boolean r4 = android.text.TextUtils.equals(r4, r9)
            if (r4 != 0) goto L55
            cn.jiguang.e.a r3 = cn.jiguang.e.a.aB()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r9 = r4.toString()
            cn.jiguang.e.a r9 = r3.a(r9)
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r6]
            r3[r5] = r9
            cn.jiguang.e.b.a(r8, r3)
            goto Lc5
        L55:
            int r4 = r3.length
            if (r4 <= r6) goto Lc5
            r3 = r3[r6]
            boolean r3 = cn.jiguang.ab.g.b(r3)
            if (r3 == 0) goto Lc5
            cn.jiguang.e.a r3 = cn.jiguang.e.a.aB()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r9 = r4.toString()
            cn.jiguang.e.a r9 = r3.a(r9)
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r6]
            r3[r5] = r9
            cn.jiguang.e.b.a(r8, r3)
            goto Lc5
        L82:
            cn.jiguang.e.a r3 = cn.jiguang.e.a.aB()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r9 = r4.toString()
            cn.jiguang.e.a r9 = r3.a(r9)
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r6]
            r3[r5] = r9
            cn.jiguang.e.b.a(r8, r3)
            goto Lc5
        La4:
            cn.jiguang.e.a r3 = cn.jiguang.e.a.aB()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r9 = r4.toString()
            cn.jiguang.e.a r9 = r3.a(r9)
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r6]
            r3[r5] = r9
            cn.jiguang.e.b.a(r8, r3)
        Lc5:
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L14d
            java.lang.String[] r9 = r2.split(r7)
            if (r9 == 0) goto L12b
            int r2 = r9.length
            if (r2 <= 0) goto L12b
            r2 = r9[r5]
            boolean r2 = android.text.TextUtils.equals(r2, r10)
            if (r2 != 0) goto Lfe
            cn.jiguang.e.a r9 = cn.jiguang.e.a.aC()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            cn.jiguang.e.a r9 = r9.a(r10)
            cn.jiguang.e.a[] r10 = new cn.jiguang.e.a[r6]
            r10[r5] = r9
            cn.jiguang.e.b.a(r8, r10)
            return
        Lfe:
            int r2 = r9.length
            if (r2 <= r6) goto L12a
            r9 = r9[r6]
            boolean r9 = cn.jiguang.ab.g.b(r9)
            if (r9 == 0) goto L12a
            cn.jiguang.e.a r9 = cn.jiguang.e.a.aC()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            cn.jiguang.e.a r9 = r9.a(r10)
            cn.jiguang.e.a[] r10 = new cn.jiguang.e.a[r6]
            r10[r5] = r9
            cn.jiguang.e.b.a(r8, r10)
        L12a:
            return
        L12b:
            cn.jiguang.e.a r9 = cn.jiguang.e.a.aC()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            cn.jiguang.e.a r9 = r9.a(r10)
            cn.jiguang.e.a[] r10 = new cn.jiguang.e.a[r6]
            r10[r5] = r9
            cn.jiguang.e.b.a(r8, r10)
            return
        L14d:
            cn.jiguang.e.a r9 = cn.jiguang.e.a.aC()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            cn.jiguang.e.a r9 = r9.a(r10)
            cn.jiguang.e.a[] r10 = new cn.jiguang.e.a[r6]
            r10[r5] = r9
            cn.jiguang.e.b.a(r8, r10)
            return
    }

    private java.lang.Object[] a(java.net.DatagramSocket r23, java.net.InetAddress r24, int r25) {
            r22 = this;
            r1 = r22
            r0 = r24
            r2 = r25
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r5
            cn.jiguang.ab.k r5 = r1.a     // Catch: cn.jiguang.ad.e -> L10e
            java.util.Set<java.lang.String> r7 = r1.f319d     // Catch: cn.jiguang.ad.e -> L10e
            byte[] r5 = r5.a(r7)     // Catch: cn.jiguang.ad.e -> L10e
            cn.jiguang.al.d r7 = cn.jiguang.al.d.a()
            java.lang.String r8 = r0.getHostAddress()
            java.lang.String r7 = r7.b(r8, r2)
            cn.jiguang.al.c r8 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r0.getHostAddress()
            r9.append(r10)
            java.lang.String r10 = ":"
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            int r11 = r5.length
            long r11 = (long) r11
            java.lang.String r13 = "sis"
            r8.b(r9, r13, r11)
            android.content.Context r8 = cn.jiguang.internal.JConstants.getAppContext()
            r9 = 4
            long r11 = cn.jiguang.al.e.a(r8, r9)
            java.net.DatagramPacket r8 = new java.net.DatagramPacket
            int r14 = r5.length
            r8.<init>(r5, r14, r0, r2)
            long r20 = android.os.SystemClock.uptimeMillis()
            r5 = r23
            byte[] r5 = cn.jiguang.ab.c.a(r5, r8)     // Catch: java.lang.Exception -> Le5
            android.content.Context r8 = cn.jiguang.internal.JConstants.getAppContext()
            cn.jiguang.al.e.a(r8, r9, r11)
            cn.jiguang.al.c r8 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r0.getHostAddress()
            r9.append(r11)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            int r10 = r5.length
            long r10 = (long) r10
            r8.c(r9, r13, r10)
            long r8 = android.os.SystemClock.uptimeMillis()
            long r8 = r8 - r20
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r3[r6] = r8
            byte[] r5 = cn.jiguang.ab.c.a(r5)     // Catch: cn.jiguang.ad.e -> Lce
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            cn.jiguang.ab.l r5 = new cn.jiguang.ab.l
            r5.<init>(r6)
            boolean r6 = r5.a()
            if (r6 == 0) goto Lb6
            r0 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3[r4] = r2
            cn.jiguang.al.d r2 = cn.jiguang.al.d.a()
            r2.c(r7, r0)
            return r3
        Lb6:
            cn.jiguang.al.d r6 = cn.jiguang.al.d.a()
            r6.c(r7, r4)
            cn.jiguang.ab.k r6 = r1.a
            android.content.Context r6 = r6.a
            a(r6, r5)
            cn.jiguang.ab.g r6 = new cn.jiguang.ab.g
            r6.<init>(r0, r2)
            r5.f294g = r6
            r3[r4] = r5
            return r3
        Lce:
            r0 = move-exception
            int r2 = r0.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            cn.jiguang.al.d r2 = cn.jiguang.al.d.a()
            int r0 = r0.a()
            r2.c(r7, r0)
            return r3
        Le5:
            android.content.Context r14 = cn.jiguang.internal.JConstants.getAppContext()
            r18 = 3
            java.lang.String r19 = ""
            r15 = 4
            r16 = r11
            cn.jiguang.al.e.a(r14, r15, r16, r18, r19)
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            r2 = 3
            r0.c(r7, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3[r4] = r0
            long r4 = android.os.SystemClock.uptimeMillis()
            long r4 = r4 - r20
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3[r6] = r0
            return r3
        L10e:
            r0 = move-exception
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            return r3
    }

    public cn.jiguang.ab.l a() {
            r3 = this;
            cn.jiguang.ab.f r0 = r3.f318c     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            cn.jiguang.ab.k r0 = r3.a     // Catch: java.lang.Throwable -> L15
            int r0 = r0.b()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.ab.f r1 = r3.f318c     // Catch: java.lang.Throwable -> L15
            cn.jiguang.ab.g r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L15
        L10:
            cn.jiguang.ab.l r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r0 = move-exception
            goto L1a
        L17:
            cn.jiguang.ab.g r0 = r3.f320e     // Catch: java.lang.Throwable -> L15
            goto L10
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run e:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "SisTask"
            cn.jiguang.w.f.i(r1, r0)
            r0 = 0
            return r0
    }

    public cn.jiguang.ab.l a(cn.jiguang.ab.g r21) {
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = " port:"
            java.lang.String r3 = "SisTask"
            r4 = 0
            if (r0 == 0) goto L100
            java.net.InetAddress r5 = r0.f271c
            if (r5 != 0) goto L11
            goto L100
        L11:
            java.net.DatagramSocket r5 = new java.net.DatagramSocket     // Catch: java.lang.Throwable -> Ldf
            r5.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r6 = cn.jiguang.aa.a.l     // Catch: java.lang.Throwable -> L27
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L2a
            java.lang.String r6 = cn.jiguang.aa.a.l     // Catch: java.lang.Throwable -> L27
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r6)     // Catch: java.lang.Throwable -> L27
            r0.f271c = r6     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r0 = move-exception
            goto Le1
        L2a:
            int r6 = cn.jiguang.aa.a.m     // Catch: java.lang.Throwable -> L27
            if (r6 <= 0) goto L30
            r0.f270b = r6     // Catch: java.lang.Throwable -> L27
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r6.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "send sis:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            java.net.InetAddress r7 = r0.f271c     // Catch: java.lang.Throwable -> L27
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            r6.append(r2)     // Catch: java.lang.Throwable -> L27
            int r7 = r0.f270b     // Catch: java.lang.Throwable -> L27
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.c(r3, r6)     // Catch: java.lang.Throwable -> L27
            java.net.InetAddress r6 = r0.f271c     // Catch: java.lang.Throwable -> L27
            int r7 = r0.f270b     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r6 = r1.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r8 = r6[r7]     // Catch: java.lang.Throwable -> L27
            boolean r9 = r8 instanceof cn.jiguang.ab.l     // Catch: java.lang.Throwable -> L27
            r10 = 1
            if (r9 == 0) goto L8f
            java.net.InetAddress r2 = r0.f271c     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> L27
            cn.jiguang.ab.k r8 = r1.a     // Catch: java.lang.Throwable -> L27
            r8.a(r2)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.ab.k r8 = r1.a     // Catch: java.lang.Throwable -> L27
            android.content.Context r8 = r8.a     // Catch: java.lang.Throwable -> L27
            cn.jiguang.e.a r2 = cn.jiguang.e.a.b(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.e.a r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r10]     // Catch: java.lang.Throwable -> L27
            r2[r7] = r0     // Catch: java.lang.Throwable -> L27
            cn.jiguang.e.b.a(r8, r2)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.ab.p r0 = r1.f317b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L87
            r2 = r6[r7]     // Catch: java.lang.Throwable -> L27
            r0.a(r2)     // Catch: java.lang.Throwable -> L27
        L87:
            r0 = r6[r7]     // Catch: java.lang.Throwable -> L27
            cn.jiguang.ab.l r0 = (cn.jiguang.ab.l) r0     // Catch: java.lang.Throwable -> L27
            r5.close()     // Catch: java.lang.Throwable -> L8e
        L8e:
            return r0
        L8f:
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L27
            int r7 = r8.intValue()     // Catch: java.lang.Throwable -> L27
            r6 = r6[r10]     // Catch: java.lang.Throwable -> L27
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L27
            long r17 = r6.longValue()     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r6.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r8 = "sis failed("
            r6.append(r8)     // Catch: java.lang.Throwable -> L27
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.String r8 = "):"
            r6.append(r8)     // Catch: java.lang.Throwable -> L27
            java.net.InetAddress r8 = r0.f271c     // Catch: java.lang.Throwable -> L27
            r6.append(r8)     // Catch: java.lang.Throwable -> L27
            r6.append(r2)     // Catch: java.lang.Throwable -> L27
            int r2 = r0.f270b     // Catch: java.lang.Throwable -> L27
            r6.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.i(r3, r2)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.ab.k r11 = r1.a     // Catch: java.lang.Throwable -> L27
            java.net.InetAddress r2 = r0.f271c     // Catch: java.lang.Throwable -> L27
            java.lang.String r13 = r2.getHostAddress()     // Catch: java.lang.Throwable -> L27
            int r14 = r0.f270b     // Catch: java.lang.Throwable -> L27
            cn.jiguang.ab.k r0 = r1.a     // Catch: java.lang.Throwable -> L27
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L27
            long r15 = cn.jiguang.d.b.b(r0)     // Catch: java.lang.Throwable -> L27
            r12 = 1
            r19 = r7
            r11.a(r12, r13, r14, r15, r17, r19)     // Catch: java.lang.Throwable -> L27
        Ldb:
            r5.close()     // Catch: java.lang.Throwable -> Lf8
            goto Lf8
        Ldf:
            r0 = move-exception
            r5 = r4
        Le1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf9
            r2.<init>()     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r6 = "sis e:"
            r2.append(r6)     // Catch: java.lang.Throwable -> Lf9
            r2.append(r0)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lf9
            cn.jiguang.w.f.i(r3, r0)     // Catch: java.lang.Throwable -> Lf9
            if (r5 == 0) goto Lf8
            goto Ldb
        Lf8:
            return r4
        Lf9:
            r0 = move-exception
            if (r5 == 0) goto Lff
            r5.close()     // Catch: java.lang.Throwable -> Lff
        Lff:
            throw r0
        L100:
            return r4
    }

    @Override // java.util.concurrent.Callable
    public /* synthetic */ cn.jiguang.ab.l call() {
            r1 = this;
            cn.jiguang.ab.l r0 = r1.a()
            return r0
    }
}
