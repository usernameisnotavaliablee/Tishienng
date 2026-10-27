package cn.jiguang.ae;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f422b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.Map<java.lang.String, android.util.Pair<java.net.InetAddress[], java.lang.Long>> f423c;

    /* renamed from: cn.jiguang.ae.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static class a implements java.util.concurrent.Callable<java.net.InetAddress[]> {
        private android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f424b;

        /* renamed from: c, reason: collision with root package name */
        private cn.jiguang.ae.b f425c;

        a(android.content.Context r1, java.lang.String r2, cn.jiguang.ae.b r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f424b = r2
                r0.f425c = r3
                return
        }

        public java.net.InetAddress[] a() {
                r14 = this;
                java.lang.String r1 = "DNSLoader"
                cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
                java.lang.String r2 = r14.f424b
                java.lang.String r2 = r0.a(r2)
                android.content.Context r0 = r14.a
                r3 = 5
                long r6 = cn.jiguang.al.e.a(r0, r3)
                r10 = 0
                r11 = 1
                r12 = 0
                java.lang.String r0 = r14.f424b     // Catch: java.net.UnknownHostException -> L2c
                java.net.InetAddress[] r4 = java.net.InetAddress.getAllByName(r0)     // Catch: java.net.UnknownHostException -> L2c
                android.content.Context r0 = r14.a     // Catch: java.net.UnknownHostException -> L29
                cn.jiguang.al.e.a(r0, r3, r6)     // Catch: java.net.UnknownHostException -> L29
                cn.jiguang.al.d r0 = cn.jiguang.al.d.a()     // Catch: java.net.UnknownHostException -> L29
                r0.a(r2, r10)     // Catch: java.net.UnknownHostException -> L29
                goto L53
            L29:
                r0 = move-exception
                r3 = r4
                goto L2e
            L2c:
                r0 = move-exception
                r3 = r12
            L2e:
                android.content.Context r4 = r14.a
                r8 = -1
                java.lang.String r9 = "UnknownHostException"
                r5 = 5
                cn.jiguang.al.e.a(r4, r5, r6, r8, r9)
                cn.jiguang.al.d r4 = cn.jiguang.al.d.a()
                r4.a(r2, r11)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "dns resolve failed:"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.w.f.i(r1, r0)
                r4 = r3
            L53:
                if (r4 == 0) goto L112
                int r0 = r4.length
                if (r0 <= 0) goto L112
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r3 = r4.length
                r5 = 0
                r6 = 0
                r7 = 0
            L66:
                if (r5 >= r3) goto L98
                r8 = r4[r5]
                r9 = 3
                if (r6 >= r9) goto L75
                boolean r13 = r8 instanceof java.net.Inet4Address
                if (r13 == 0) goto L75
                int r6 = r6 + 1
            L73:
                r13 = 1
                goto L7f
            L75:
                if (r7 >= r9) goto L7e
                boolean r13 = r8 instanceof java.net.Inet6Address
                if (r13 == 0) goto L7e
                int r7 = r7 + 1
                goto L73
            L7e:
                r13 = 0
            L7f:
                if (r13 == 0) goto L90
                r0.add(r8)
                java.lang.String r8 = r8.getHostAddress()
                r2.append(r8)
                java.lang.String r8 = ","
                r2.append(r8)
            L90:
                if (r6 != r9) goto L95
                if (r7 != r9) goto L95
                goto L98
            L95:
                int r5 = r5 + 1
                goto L66
            L98:
                boolean r3 = r0.isEmpty()
                if (r3 != 0) goto L113
                java.net.InetAddress[] r3 = new java.net.InetAddress[r10]
                java.lang.Object[] r0 = r0.toArray(r3)
                r12 = r0
                java.net.InetAddress[] r12 = (java.net.InetAddress[]) r12
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "update dns cache url="
                r0.append(r5)
                java.lang.String r5 = r14.f424b
                r0.append(r5)
                java.lang.String r5 = " resolved="
                r0.append(r5)
                java.lang.String r5 = java.util.Arrays.toString(r12)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                cn.jiguang.w.f.c(r1, r0)
                cn.jiguang.ae.b r0 = r14.f425c
                java.util.Map r0 = cn.jiguang.ae.b.a(r0)
                java.lang.String r1 = r14.f424b
                android.util.Pair r5 = new android.util.Pair
                java.lang.Long r6 = java.lang.Long.valueOf(r3)
                r5.<init>(r12, r6)
                r0.put(r1, r5)
                int r0 = r2.length()     // Catch: java.lang.Throwable -> L113
                int r0 = r0 - r11
                r2.deleteCharAt(r0)     // Catch: java.lang.Throwable -> L113
                android.content.Context r0 = r14.a     // Catch: java.lang.Throwable -> L113
                java.lang.String r1 = r14.f424b     // Catch: java.lang.Throwable -> L113
                cn.jiguang.e.a r1 = cn.jiguang.e.a.b(r1)     // Catch: java.lang.Throwable -> L113
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L113
                cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L113
                java.lang.String r2 = r14.f424b     // Catch: java.lang.Throwable -> L113
                cn.jiguang.e.a r2 = cn.jiguang.e.a.c(r2)     // Catch: java.lang.Throwable -> L113
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L113
                cn.jiguang.e.a r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L113
                r3 = 2
                cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r3]     // Catch: java.lang.Throwable -> L113
                r3[r10] = r1     // Catch: java.lang.Throwable -> L113
                r3[r11] = r2     // Catch: java.lang.Throwable -> L113
                cn.jiguang.e.b.a(r0, r3)     // Catch: java.lang.Throwable -> L113
                goto L113
            L112:
                r12 = r4
            L113:
                return r12
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.net.InetAddress[] call() {
                r1 = this;
                java.net.InetAddress[] r0 = r1.a()
                return r0
        }
    }

    /* renamed from: cn.jiguang.ae.b$b, reason: collision with other inner class name */
    private static final class C0011b {
        private static final cn.jiguang.ae.b a = null;

        static {
                cn.jiguang.ae.b r0 = new cn.jiguang.ae.b
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ae.b.C0011b.a = r0
                return
        }

        public C0011b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ae.b a() {
                cn.jiguang.ae.b r0 = cn.jiguang.ae.b.C0011b.a
                return r0
        }
    }

    private b() {
            r2 = this;
            r2.<init>()
            r0 = 36000000(0x2255100, double:1.77863633E-316)
            r2.a = r0
            r0 = 900000(0xdbba0, double:4.44659E-318)
            r2.f422b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f423c = r0
            return
    }

    /* synthetic */ b(cn.jiguang.ae.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private android.util.Pair<java.net.InetAddress[], java.lang.Boolean> a(android.content.Context r14, java.lang.String r15, long r16, long r18) {
            r13 = this;
            java.util.Map<java.lang.String, android.util.Pair<java.net.InetAddress[], java.lang.Long>> r1 = r13.f423c
            java.lang.Object r1 = r1.get(r15)
            android.util.Pair r1 = (android.util.Pair) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L13
            java.lang.Object r4 = r1.first
            if (r4 != 0) goto L11
            goto L13
        L11:
            r4 = 0
            goto L14
        L13:
            r4 = 1
        L14:
            if (r4 == 0) goto L25
            cn.jiguang.e.a r5 = cn.jiguang.e.a.c(r15)
            java.lang.Object r5 = cn.jiguang.e.b.a(r14, r5)
        L1e:
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            goto L28
        L25:
            java.lang.Object r5 = r1.second
            goto L1e
        L28:
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r5 + r16
            r11 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L34
            return r11
        L34:
            if (r4 == 0) goto L4b
            java.net.InetAddress[] r14 = r13.a(r14, r15)
            if (r14 == 0) goto L4f
            android.util.Pair r1 = new android.util.Pair
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r1.<init>(r14, r4)
            java.util.Map<java.lang.String, android.util.Pair<java.net.InetAddress[], java.lang.Long>> r4 = r13.f423c
            r4.put(r15, r1)
            goto L4f
        L4b:
            java.lang.Object r14 = r1.first
            java.net.InetAddress[] r14 = (java.net.InetAddress[]) r14
        L4f:
            if (r14 == 0) goto L63
            android.util.Pair r0 = new android.util.Pair
            long r5 = r5 + r18
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L5a
            goto L5b
        L5a:
            r2 = 0
        L5b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.<init>(r14, r1)
            return r0
        L63:
            return r11
    }

    public static cn.jiguang.ae.b a() {
            cn.jiguang.ae.b r0 = cn.jiguang.ae.b.C0011b.a()
            return r0
    }

    private java.net.InetAddress a(java.lang.String r3) {
            r2 = this;
            boolean r0 = cn.jiguang.av.v.g(r3)
            if (r0 != 0) goto Lc
            boolean r0 = cn.jiguang.av.v.h(r3)
            if (r0 == 0) goto L28
        Lc:
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch: java.net.UnknownHostException -> L11
            return r3
        L11:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dns resolve failed:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "DNSLoader"
            cn.jiguang.w.f.i(r0, r3)
        L28:
            r3 = 0
            return r3
    }

    static /* synthetic */ java.util.Map a(cn.jiguang.ae.b r0) {
            java.util.Map<java.lang.String, android.util.Pair<java.net.InetAddress[], java.lang.Long>> r0 = r0.f423c
            return r0
    }

    private java.net.InetAddress[] a(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            cn.jiguang.e.a r7 = cn.jiguang.e.a.b(r7)
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r7)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r0 = 0
            if (r7 == 0) goto L12
            return r0
        L12:
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L20:
            if (r3 >= r1) goto L30
            r4 = r6[r3]
            java.net.InetAddress r4 = r5.a(r4)
            if (r4 == 0) goto L2d
            r7.add(r4)
        L2d:
            int r3 = r3 + 1
            goto L20
        L30:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L37
            return r0
        L37:
            java.net.InetAddress[] r6 = new java.net.InetAddress[r2]
            java.lang.Object[] r6 = r7.toArray(r6)
            java.net.InetAddress[] r6 = (java.net.InetAddress[]) r6
            return r6
    }

    public java.net.InetAddress a(android.content.Context r1, java.lang.String r2, long r3, boolean r5) {
            r0 = this;
            java.net.InetAddress[] r1 = r0.b(r1, r2, r3, r5)
            if (r1 == 0) goto Ld
            int r2 = r1.length
            if (r2 <= 0) goto Ld
            r2 = 0
            r1 = r1[r2]
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public java.net.InetAddress[] b(android.content.Context r10, java.lang.String r11, long r12, boolean r14) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.net.InetAddress r0 = r9.a(r11)
            if (r0 == 0) goto L15
            r10 = 1
            java.net.InetAddress[] r10 = new java.net.InetAddress[r10]
            r11 = 0
            r10[r11] = r0
            return r10
        L15:
            long r5 = r9.a
            long r7 = r9.f422b
            r2 = r9
            r3 = r10
            r4 = r11
            android.util.Pair r10 = r2.a(r3, r4, r5, r7)
            java.lang.String r11 = "use cache="
            java.lang.String r5 = "DNSLoader"
            if (r10 == 0) goto L60
            java.lang.Object r0 = r10.first
            if (r0 == 0) goto L2d
            java.net.InetAddress[] r0 = (java.net.InetAddress[]) r0
            goto L2e
        L2d:
            r0 = r1
        L2e:
            java.lang.Object r10 = r10.second
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L5e
            if (r14 == 0) goto L47
            java.util.concurrent.FutureTask r10 = new java.util.concurrent.FutureTask
            cn.jiguang.ae.b$a r12 = new cn.jiguang.ae.b$a
            r12.<init>(r3, r4, r9)
            r10.<init>(r12)
            cn.jiguang.z.b.d(r10)
        L47:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            java.lang.String r11 = java.util.Arrays.toString(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            cn.jiguang.w.f.c(r5, r10)
            return r0
        L5e:
            r10 = r0
            goto L61
        L60:
            r10 = r1
        L61:
            java.util.concurrent.FutureTask r14 = new java.util.concurrent.FutureTask
            cn.jiguang.ae.b$a r0 = new cn.jiguang.ae.b$a
            r0.<init>(r3, r4, r9)
            r14.<init>(r0)
            cn.jiguang.z.b.d(r14)
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L8b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = java.util.Arrays.toString(r10)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            cn.jiguang.w.f.c(r5, r11)
            return r10
        L8b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r0.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = "waiting dns for "
            r0.append(r3)     // Catch: java.lang.Throwable -> Laa
            r0.append(r4)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Laa
            cn.jiguang.w.f.c(r5, r0)     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r12 = r14.get(r12, r0)     // Catch: java.lang.Throwable -> Laa
            java.net.InetAddress[] r12 = (java.net.InetAddress[]) r12     // Catch: java.lang.Throwable -> Laa
            r1 = r12
            goto Lc0
        Laa:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "run futureTask e:"
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            cn.jiguang.w.f.i(r5, r12)
        Lc0:
            if (r1 == 0) goto Ldb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "use resolved result="
            r10.append(r11)
            java.lang.String r11 = java.util.Arrays.toString(r1)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            cn.jiguang.w.f.c(r5, r10)
            return r1
        Ldb:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = java.util.Arrays.toString(r10)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            cn.jiguang.w.f.c(r5, r11)
            return r10
    }
}
