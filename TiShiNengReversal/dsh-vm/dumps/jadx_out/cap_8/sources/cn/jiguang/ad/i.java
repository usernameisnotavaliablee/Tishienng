package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private static long f419c = 1;
    private java.util.Map<java.lang.Long, cn.jiguang.ad.d> a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.ah.a f420b;


    private static final class a {
        private static final cn.jiguang.ad.i a = null;

        static {
                cn.jiguang.ad.i r0 = new cn.jiguang.ad.i
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ad.i.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ad.i a() {
                cn.jiguang.ad.i r0 = cn.jiguang.ad.i.a.a
                return r0
        }
    }

    static {
            return
    }

    private i() {
            r1 = this;
            r1.<init>()
            cn.jiguang.ad.i$1 r0 = new cn.jiguang.ad.i$1
            r0.<init>(r1)
            r1.f420b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    /* synthetic */ i(cn.jiguang.ad.i.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.ad.i a() {
            cn.jiguang.ad.i r0 = cn.jiguang.ad.i.a.a()
            return r0
    }

    private byte[] a(android.content.Context r9, cn.jiguang.ad.d r10) {
            r8 = this;
            int r1 = r10.f380d
            int r2 = r10.f381e
            long r3 = r10.f382f
            byte[] r5 = r10.f383g
            r6 = 0
            r0 = r9
            byte[] r9 = cn.jiguang.af.b.a(r0, r1, r2, r3, r5, r6)
            return r9
    }

    public static long b() {
            long r0 = cn.jiguang.ad.i.f419c
            r2 = 1
            long r0 = r0 + r2
            cn.jiguang.ad.i.f419c = r0
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L10
            cn.jiguang.ad.i.f419c = r2
        L10:
            long r0 = cn.jiguang.ad.i.f419c
            return r0
    }

    public cn.jiguang.ad.d a(long r2) {
            r1 = this;
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r0 = r1.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            cn.jiguang.ad.d r2 = (cn.jiguang.ad.d) r2
            return r2
    }

    public void a(android.content.Context r11) {
            r10 = this;
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r0 = r10.a
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "TcpRequestManager"
            if (r0 == 0) goto L10
            java.lang.String r11 = "no cache request"
            cn.jiguang.w.f.c(r1, r11)
            return
        L10:
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r0 = r10.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lae
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.ad.d r3 = (cn.jiguang.ad.d) r3
            boolean r3 = r3.f386j
            if (r3 != 0) goto L31
            goto L1a
        L31:
            long r3 = java.lang.System.nanoTime()
            java.lang.Object r5 = r2.getValue()
            cn.jiguang.ad.d r5 = (cn.jiguang.ad.d) r5
            long r5 = r5.f384h
            long r3 = r3 - r5
            java.lang.Object r5 = r2.getValue()
            cn.jiguang.ad.d r5 = (cn.jiguang.ad.d) r5
            long r5 = r5.f385i
            long r5 = r5 - r3
            r7 = 10000(0x2710, double:4.9407E-320)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L88
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.ad.d r3 = (cn.jiguang.ad.d) r3
            r3.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "send again:"
            r3.append(r4)
            java.lang.Object r4 = r2.getValue()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.c(r1, r3)
            cn.jiguang.ad.g r3 = cn.jiguang.ad.g.a()
            cn.jiguang.ab.h r3 = r3.c()
            cn.jiguang.ag.a r3 = r3.e()
            java.lang.Object r2 = r2.getValue()
            cn.jiguang.ad.d r2 = (cn.jiguang.ad.d) r2
            byte[] r2 = r10.a(r11, r2)
            r3.a(r2)
            goto L1a
        L88:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "shoud not send again by 10000ms,hasRequestTime:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ",timeout:"
            r5.append(r3)
            java.lang.Object r2 = r2.getValue()
            cn.jiguang.ad.d r2 = (cn.jiguang.ad.d) r2
            long r2 = r2.f385i
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            cn.jiguang.w.f.c(r1, r2)
            goto L1a
        Lae:
            return
    }

    public void a(android.content.Context r4, long r5) {
            r3 = this;
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r4 = r3.a
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.remove(r0)
            cn.jiguang.ad.d r4 = (cn.jiguang.ad.d) r4
            if (r4 == 0) goto L34
            boolean r0 = r4.f386j
            if (r0 == 0) goto L1e
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r1 = 100000(0x186a0, double:4.94066E-319)
            long r5 = r5 + r1
            int r6 = (int) r5
            r0.b(r6)
        L1e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "handle reponse :"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "TcpRequestManager"
            cn.jiguang.w.f.c(r5, r4)
        L34:
            return
    }

    public void a(android.content.Context r13, long r14, int r16, int r17, byte[] r18, java.lang.String r19) {
            r12 = this;
            long r6 = cn.jiguang.ab.c.c(r13)
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r0 = r12.a
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            java.lang.String r11 = "TcpRequestManager"
            if (r0 == 0) goto L18
            java.lang.String r13 = "Generator same rid,not do this msg"
            cn.jiguang.w.f.j(r11, r13)
            return
        L18:
            cn.jiguang.ad.d r0 = new cn.jiguang.ad.d
            r8 = 0
            r1 = r14
            r4 = r16
            r5 = r17
            r10 = r18
            r3 = r19
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            cn.jiguang.ad.g r14 = cn.jiguang.ad.g.a()
            boolean r14 = r14.d()
            if (r14 == 0) goto L46
            cn.jiguang.ad.g r14 = cn.jiguang.ad.g.a()
            cn.jiguang.ab.h r14 = r14.c()
            cn.jiguang.ag.a r14 = r14.e()
            byte[] r13 = r12.a(r13, r0)
            r14.a(r13)
            goto L55
        L46:
            boolean r13 = cn.jiguang.av.n.a()
            if (r13 != 0) goto L52
            java.lang.String r13 = "send error -tcp connect was invalid"
        L4e:
            cn.jiguang.w.f.k(r11, r13)
            goto L55
        L52:
            java.lang.String r13 = "current use not login success,wait a moment"
            goto L4e
        L55:
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r13 = r12.a
            java.lang.Long r14 = java.lang.Long.valueOf(r6)
            r13.put(r14, r0)
            return
    }

    public void a(android.content.Context r14, long r15, int r17, int r18, byte[] r19, java.lang.String r20, long r21) {
            r13 = this;
            r0 = 10
            java.lang.String r1 = "TcpRequestManager"
            r6 = r17
            if (r6 != r0) goto La
            r8 = r15
            goto L35
        La:
            long r2 = cn.jiguang.ab.c.c(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Generator new rid:"
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r0 = r13.a
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L34
            java.lang.String r14 = "Generator same rid,not do this msg"
            cn.jiguang.w.f.j(r1, r14)
            return
        L34:
            r8 = r2
        L35:
            r2 = 0
            int r0 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r0 > 0) goto L3f
            r2 = 10000(0x2710, double:4.9407E-320)
            r10 = r2
            goto L41
        L3f:
            r10 = r21
        L41:
            cn.jiguang.ad.d r2 = new cn.jiguang.ad.d
            r3 = r15
            r7 = r18
            r12 = r19
            r5 = r20
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            boolean r0 = r0.d()
            if (r0 == 0) goto L6b
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            cn.jiguang.ab.h r0 = r0.c()
            cn.jiguang.ag.a r0 = r0.e()
            byte[] r14 = r13.a(r14, r2)
            r0.a(r14)
            goto L7a
        L6b:
            boolean r14 = cn.jiguang.av.n.a()
            if (r14 != 0) goto L77
            java.lang.String r14 = "send error -tcp connect was invalid"
        L73:
            cn.jiguang.w.f.k(r1, r14)
            goto L7a
        L77:
            java.lang.String r14 = "current use not login success,wait a moment"
            goto L73
        L7a:
            long r0 = java.lang.System.nanoTime()
            r2.f384h = r0
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r14 = r13.a
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r14.put(r0, r2)
            cn.jiguang.ah.b r14 = cn.jiguang.ah.b.a()
            r0 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 + r0
            int r0 = (int) r8
            cn.jiguang.ah.a r1 = r13.f420b
            r14.b(r0, r10, r1)
            return
    }

    public void b(android.content.Context r9, long r10) {
            r8 = this;
            java.util.Map<java.lang.Long, cn.jiguang.ad.d> r0 = r8.a
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Object r0 = r0.remove(r1)
            cn.jiguang.ad.d r0 = (cn.jiguang.ad.d) r0
            java.lang.String r1 = "TcpRequestManager"
            if (r0 != 0) goto L25
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "not found requst by rid:"
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.i(r1, r9)
            return
        L25:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "request time out:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            cn.jiguang.w.f.c(r1, r10)
            cn.jiguang.ad.b r2 = cn.jiguang.ad.b.a()
            java.lang.String r4 = r0.f379c
            long r5 = r0.f378b
            int r7 = r0.f380d
            r3 = r9
            r2.a(r3, r4, r5, r7)
            return
    }
}
