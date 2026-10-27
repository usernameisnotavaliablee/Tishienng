package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList<cn.jiguang.ab.m> f284b;

    /* renamed from: c, reason: collision with root package name */
    private int f285c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f286d;

    /* renamed from: e, reason: collision with root package name */
    private int f287e;


    public k(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f285c = r0
            r1.a = r2
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ax()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            java.util.LinkedList r2 = cn.jiguang.ab.m.a(r2)
            r1.f284b = r2
            return
    }

    private cn.jiguang.ab.n a(int r18) {
            r17 = this;
            r0 = r17
            android.content.Context r1 = r0.a
            java.lang.String r4 = cn.jiguang.d.a.e(r1)
            android.content.Context r1 = r0.a
            long r6 = cn.jiguang.d.a.f(r1)
            android.content.Context r1 = r0.a
            r2 = 0
            java.lang.String r8 = cn.jiguang.av.w.a(r1, r2)
            long r9 = java.lang.System.currentTimeMillis()
            android.content.Context r1 = r0.a
            java.lang.String r3 = "get_loc_info"
            r5 = 0
            java.lang.Object r1 = cn.jiguang.i.a.a(r1, r3, r5)
            boolean r3 = r1 instanceof android.os.Bundle
            r11 = 4641240890982006784(0x4069000000000000, double:200.0)
            if (r3 == 0) goto L4c
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "lat"
            double r13 = r1.getDouble(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "lot"
            double r11 = r1.getDouble(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "time"
            long r9 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L40
            r15 = r13
            r13 = r9
            r9 = r15
            goto L4e
        L40:
            r15 = r13
            r13 = r11
            r11 = r15
            goto L47
        L45:
            r13 = r11
        L47:
            r15 = r13
            r13 = r9
            r9 = r11
            r11 = r15
            goto L4e
        L4c:
            r13 = r9
            r9 = r11
        L4e:
            android.content.Context r1 = r0.a
            boolean r1 = cn.jiguang.ab.c.f(r1)
            if (r1 == 0) goto L5c
            int r2 = cn.jiguang.v.j.b()
            r1 = r2
            goto L5d
        L5c:
            r1 = 0
        L5d:
            cn.jiguang.ab.n r2 = new cn.jiguang.ab.n
            java.lang.String r5 = cn.jiguang.a.a.f236c
            r3 = r18
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13)
            cn.jiguang.ab.n r1 = r2.a(r1)
            return r1
    }

    private synchronized void a(cn.jiguang.ab.m r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.LinkedList<cn.jiguang.ab.m> r0 = r3.f284b     // Catch: java.lang.Throwable -> L34
            r0.add(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "SisConnContext"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "addSisReportInfo:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            org.json.JSONObject r4 = r4.a()     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            r1.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L34
        L24:
            java.util.LinkedList<cn.jiguang.ab.m> r4 = r3.f284b     // Catch: java.lang.Throwable -> L34
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L34
            r0 = 30
            if (r4 <= r0) goto L36
            java.util.LinkedList<cn.jiguang.ab.m> r4 = r3.f284b     // Catch: java.lang.Throwable -> L34
            r4.removeFirst()     // Catch: java.lang.Throwable -> L34
            goto L24
        L34:
            r4 = move-exception
            goto L6e
        L36:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L34
            r4.<init>()     // Catch: java.lang.Throwable -> L34
            java.util.LinkedList<cn.jiguang.ab.m> r0 = r3.f284b     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L34
        L41:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.ab.m r1 = (cn.jiguang.ab.m) r1     // Catch: java.lang.Throwable -> L34
            org.json.JSONObject r1 = r1.a()     // Catch: java.lang.Throwable -> L34
            r4.put(r1)     // Catch: java.lang.Throwable -> L34
            goto L41
        L55:
            android.content.Context r0 = r3.a     // Catch: java.lang.Throwable -> L34
            cn.jiguang.e.a r1 = cn.jiguang.e.a.ax()     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.e.a r4 = r1.a(r4)     // Catch: java.lang.Throwable -> L34
            r1 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L34
            cn.jiguang.e.b.a(r0, r1)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return
        L6e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    static /* synthetic */ boolean a(cn.jiguang.ab.k r0, java.net.InetAddress r1, int r2, java.net.DatagramSocket r3, byte[] r4) {
            boolean r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    private boolean a(java.net.InetAddress r4, int r5, java.net.DatagramSocket r6, byte[] r7) {
            r3 = this;
            r0 = 0
            java.net.DatagramPacket r1 = new java.net.DatagramPacket     // Catch: java.lang.Throwable -> L18
            int r2 = r7.length     // Catch: java.lang.Throwable -> L18
            r1.<init>(r7, r2, r4, r5)     // Catch: java.lang.Throwable -> L18
            byte[] r4 = cn.jiguang.ab.c.a(r6, r1)     // Catch: java.lang.Throwable -> L18
            byte[] r4 = cn.jiguang.ab.c.a(r4)     // Catch: java.lang.Throwable -> L18
            short r4 = cn.jiguang.av.x.c(r4)     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L17
            r4 = 1
            return r4
        L17:
            return r0
        L18:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "report failed : "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "SisConnContext"
            cn.jiguang.w.f.l(r5, r4)
            return r0
    }

    public cn.jiguang.ab.l a(long r5) {
            r4 = this;
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            cn.jiguang.ab.i r1 = new cn.jiguang.ab.i
            r1.<init>(r4)
            r0.<init>(r1)
            r1 = 0
            r4.f285c = r1
            cn.jiguang.z.b.d(r0)
            r1 = 10
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L17
            r5 = r1
        L17:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = r0.get(r5, r1)     // Catch: java.lang.Throwable -> L20
            cn.jiguang.ab.l r5 = (cn.jiguang.ab.l) r5     // Catch: java.lang.Throwable -> L20
            return r5
        L20:
            r5 = 0
            return r5
    }

    public void a(int r3, java.lang.String r4, int r5, long r6, long r8, int r10) {
            r2 = this;
            boolean r0 = cn.jiguang.ab.g.a(r4, r5)
            if (r0 != 0) goto L7
            return
        L7:
            cn.jiguang.ab.m r0 = new cn.jiguang.ab.m
            r0.<init>()
            android.content.Context r1 = r2.a
            java.lang.String r1 = cn.jiguang.d.a.e(r1)
            r0.a = r1
            r0.f297b = r3
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g
            r3.<init>(r4, r5)
            r0.f298c = r3
            r0.f300e = r6
            r0.f301f = r8
            r0.f306k = r10
            android.content.Context r3 = r2.a
            int r3 = cn.jiguang.av.n.b(r3)
            r0.f302g = r3
            android.content.Context r3 = r2.a
            long r3 = cn.jiguang.d.a.f(r3)
            r0.f299d = r3
            r3 = 4641240890982006784(0x4069000000000000, double:200.0)
            r0.f303h = r3
            r0.f304i = r3
            long r3 = java.lang.System.currentTimeMillis()
            r0.f305j = r3
            android.content.Context r3 = r2.a
            java.lang.String r4 = "get_loc_info"
            r5 = 0
            java.lang.Object r3 = cn.jiguang.i.a.a(r3, r4, r5)
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L66
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "lat"
            double r4 = r3.getDouble(r4)     // Catch: java.lang.Throwable -> L66
            r0.f303h = r4     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "lot"
            double r4 = r3.getDouble(r4)     // Catch: java.lang.Throwable -> L66
            r0.f304i = r4     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "time"
            long r3 = r3.getLong(r4)     // Catch: java.lang.Throwable -> L66
            r0.f305j = r3     // Catch: java.lang.Throwable -> L66
        L66:
            r2.a(r0)
            return
    }

    public void a(cn.jiguang.ab.g r5) {
            r4 = this;
            android.content.Context r0 = r4.a
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aD()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            android.content.Context r0 = r4.a
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aF()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            boolean r0 = cn.jiguang.av.x.b(r0, r2)
            if (r0 == 0) goto L37
            cn.jiguang.ab.k$1 r0 = new cn.jiguang.ab.k$1
            java.lang.String r1 = "SisConnContext#asyncSisReportIfNeed"
            r0.<init>(r4, r1, r5)
            cn.jiguang.z.b.b(r0)
            return
        L37:
            java.lang.String r5 = "SisConnContext"
            java.lang.String r0 = "sis report: not yet"
            cn.jiguang.w.f.c(r5, r0)
            return
    }

    public void a(boolean r3) {
            r2 = this;
            int r0 = r2.f285c
            if (r3 == 0) goto L6
            r3 = 1
            goto L7
        L6:
            r3 = 2
        L7:
            r3 = r3 | r0
            r2.f285c = r3
            cn.jiguang.ae.c r3 = cn.jiguang.ae.c.a()
            android.content.Context r0 = r2.a
            int r1 = r2.f285c
            r3.a(r0, r1)
            return
    }

    public boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    public byte[] a(java.util.Set<java.lang.String> r4) {
            r3 = this;
            android.content.Context r0 = r3.a
            int r0 = cn.jiguang.av.n.b(r0)
            byte[] r1 = r3.f286d
            if (r1 == 0) goto Le
            int r1 = r3.f287e
            if (r0 == r1) goto L24
        Le:
            r3.f287e = r0
            java.lang.String r1 = "UG"
            cn.jiguang.ab.n r0 = r3.a(r0)     // Catch: java.lang.Exception -> L27
            org.json.JSONObject r4 = r0.a(r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L27
            byte[] r4 = cn.jiguang.ab.c.a(r1, r4)     // Catch: java.lang.Exception -> L27
            r3.f286d = r4     // Catch: java.lang.Exception -> L27
        L24:
            byte[] r4 = r3.f286d
            return r4
        L27:
            r4 = move-exception
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to package data - "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 2
            r0.<init>(r1, r4)
            throw r0
    }

    public int b() {
            r3 = this;
            r0 = 3
            r3.f285c = r0
            cn.jiguang.ae.c r1 = cn.jiguang.ae.c.a()
            int r2 = r3.f285c
            int r1 = r1.b(r2)
            android.content.Context r2 = r3.a
            boolean r2 = cn.jiguang.av.b.e(r2)
            if (r2 == 0) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ipvsupport="
            r1.append(r2)
            int r2 = r3.f285c
            r1.append(r2)
            java.lang.String r2 = ", prefer="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SisConnContext"
            cn.jiguang.w.f.c(r2, r1)
            return r0
    }
}
