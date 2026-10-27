package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends cn.jiguang.au.b {

    /* renamed from: f, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f272f = null;
    public volatile boolean a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f273b;

    /* renamed from: c, reason: collision with root package name */
    private cn.jiguang.ag.a f274c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f275d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f276e;

    /* renamed from: g, reason: collision with root package name */
    private final int f277g;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.ab.h.f272f = r0
            return
    }

    public h(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f275d = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r0)
            r2.f276e = r1
            r2.f273b = r3
            java.util.concurrent.atomic.AtomicInteger r0 = cn.jiguang.ab.h.f272f
            int r0 = r0.incrementAndGet()
            r2.f277g = r0
            boolean r3 = cn.jiguang.ab.c.f(r3)
            r0 = 20
            r1 = 8128(0x1fc0, float:1.139E-41)
            if (r3 == 0) goto L29
            cn.jiguang.ag.b r3 = new cn.jiguang.ag.b
            r3.<init>(r1, r0)
        L26:
            r2.f274c = r3
            goto L2f
        L29:
            cn.jiguang.ag.c r3 = new cn.jiguang.ag.c
            r3.<init>(r1, r0)
            goto L26
        L2f:
            java.lang.String r3 = "NetworkingClient"
            r2.f668h = r3
            return
    }

    private void a(cn.jiguang.ag.a r3, java.nio.ByteBuffer r4) {
            r2 = this;
            cn.jiguang.ab.q r0 = new cn.jiguang.ab.q
            android.content.Context r1 = r2.f273b
            byte[] r4 = r4.array()
            r0.<init>(r3, r1, r4)
            cn.jiguang.z.b.b(r0)
            return
    }

    private boolean a(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = "google:false"
            java.lang.String r1 = "NetworkingClient"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.ai.a.a(r8)
            cn.jiguang.ab.k r0 = new cn.jiguang.ab.k
            r0.<init>(r8)
            cn.jiguang.ab.j r8 = new cn.jiguang.ab.j
            r8.<init>(r0)
            r0 = 0
            r2 = 1
            cn.jiguang.ag.a r8 = r8.a(r7)     // Catch: java.lang.Exception -> L2a
            r7.f274c = r8     // Catch: java.lang.Exception -> L2a
            r8 = 2
            boolean r8 = r7.b(r8)
            if (r8 != 0) goto L29
            java.lang.String r8 = "login failed"
        L25:
            cn.jiguang.w.f.i(r1, r8)
            return r0
        L29:
            return r2
        L2a:
            r8 = move-exception
            boolean r3 = r8 instanceof cn.jiguang.ad.e
            if (r3 == 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "connect failed, errCode: "
            r3.append(r4)
            r4 = r8
            cn.jiguang.ad.e r4 = (cn.jiguang.ad.e) r4
            int r4 = r4.a()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.j(r1, r3)
            android.content.Context r4 = r7.f273b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "内部异常："
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r5 = 1400(0x578, float:1.962E-42)
            cn.jiguang.ab.c.a.a(r4, r5, r3)
            goto L7d
        L64:
            android.content.Context r3 = r7.f273b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "未知异常："
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r5 = 1401(0x579, float:1.963E-42)
            cn.jiguang.ab.c.a.a(r3, r5, r4)
        L7d:
            r7.f275d = r2
            r7.a(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sis and connect failed:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            goto L25
    }

    private boolean b(int r6) {
            r5 = this;
            boolean r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = "NetworkingClient"
            if (r6 > 0) goto L17
            java.lang.String r6 = "login error,retry login too many times"
            cn.jiguang.w.f.d(r0, r6)
            r5.h()
            r6 = 4
        L13:
            r5.a(r6)
            return r1
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loginTimes:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r0, r2)
            boolean r0 = r5.g()
            if (r0 != 0) goto L32
            return r1
        L32:
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            cn.jiguang.ag.a r2 = r5.f274c
            java.lang.String r3 = r2.f461h
            int r4 = r2.f462i
            int r2 = r2.f460g
            java.lang.String r0 = r0.c(r3, r4, r2)
            android.content.Context r2 = r5.f273b
            cn.jiguang.ag.a r3 = r5.f274c
            int r2 = cn.jiguang.ab.c.a(r2, r3)
            cn.jiguang.al.d r3 = cn.jiguang.al.d.a()
            r3.f(r0, r2)
            if (r2 >= 0) goto L55
            r6 = 2
            goto L13
        L55:
            if (r2 <= 0) goto L6e
            r5.h()
            r0 = 108(0x6c, float:1.51E-43)
            if (r2 != r0) goto L6a
            android.content.Context r0 = r5.f273b
            cn.jiguang.z.b.a(r0)
            int r6 = r6 + (-1)
            boolean r6 = r5.b(r6)
            return r6
        L6a:
            r5.c(r2)
            return r1
        L6e:
            cn.jiguang.ad.g r6 = cn.jiguang.ad.g.a()
            android.content.Context r0 = r5.f273b
            java.lang.String r1 = "tcp_a10"
            r2 = 0
            r6.a(r0, r1, r2)
            r6 = 1
            return r6
    }

    private void c(int r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Action - onLoginFailed - respCode:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NetworkingClient"
            cn.jiguang.w.f.a(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "resCode"
            r0.putInt(r1, r4)
            cn.jiguang.ad.g r4 = cn.jiguang.ad.g.a()
            android.content.Context r1 = r3.f273b
            java.lang.String r2 = "tcp_a12"
            r4.a(r1, r2, r0)
            return
    }

    private boolean g() {
            r4 = this;
            android.content.Context r0 = r4.f273b
            cn.jiguang.v.k.c(r0)
            android.content.Context r0 = r4.f273b
            boolean r0 = cn.jiguang.d.b.a(r0)
            if (r0 == 0) goto L19
            android.content.Context r0 = r4.f273b
            java.lang.String r0 = cn.jiguang.d.a.j(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L69
        L19:
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            cn.jiguang.ag.a r1 = r4.f274c
            java.lang.String r2 = r1.f461h
            int r3 = r1.f462i
            int r1 = r1.f460g
            java.lang.String r0 = r0.b(r2, r3, r1)
            android.content.Context r1 = r4.f273b
            cn.jiguang.ag.a r2 = r4.f274c
            int r1 = cn.jiguang.ab.c.b(r1, r2)
            cn.jiguang.al.d r2 = cn.jiguang.al.d.a()
            r2.e(r0, r1)
            if (r1 == 0) goto L58
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "resCode"
            r0.putInt(r2, r1)
            cn.jiguang.ad.g r1 = cn.jiguang.ad.g.a()
            android.content.Context r2 = r4.f273b
            java.lang.String r3 = "tcp_a13"
            r1.a(r2, r3, r0)
            r4.h()
            r0 = 3
            r4.a(r0)
            r0 = 0
            return r0
        L58:
            android.content.Context r0 = r4.f273b
            cn.jiguang.v.k.b(r0)
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            android.content.Context r1 = r4.f273b
            java.lang.String r2 = "tcp_a11"
            r3 = 0
            r0.a(r1, r2, r3)
        L69:
            r0 = 1
            return r0
    }

    private void h() {
            r1 = this;
            android.content.Context r0 = r1.f273b
            cn.jiguang.ab.c.b(r0)
            return
    }

    @Override // cn.jiguang.au.b
    public void a() {
            r7 = this;
            java.lang.String r0 = " ,No Break!!"
            java.lang.String r1 = " recv failed with error:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Begin to run in ConnectingThread - id:"
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NetworkingClient"
            cn.jiguang.w.f.g(r3, r2)
            r2 = 0
            android.content.Context r4 = r7.f273b     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r7.a(r4)     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.atomic.AtomicBoolean r5 = r7.f276e     // Catch: java.lang.Throwable -> L3b
            r5.set(r2)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L3d
            java.lang.String r0 = "prepare Push Channel failed , returned"
            cn.jiguang.w.f.d(r3, r0)     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f276e
            r0.set(r2)
            return
        L3b:
            r0 = move-exception
            goto Lae
        L3d:
            boolean r4 = r7.a     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto La8
            java.lang.String r4 = "Network listening..."
            cn.jiguang.w.f.e(r3, r4)     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.ag.a r4 = r7.f274c     // Catch: java.lang.Throwable -> L3b cn.jiguang.ad.e -> L79
            java.nio.ByteBuffer r4 = r4.a()     // Catch: java.lang.Throwable -> L3b cn.jiguang.ad.e -> L79
            cn.jiguang.ag.a r5 = r7.f274c     // Catch: java.lang.Throwable -> L3b
            r7.a(r5, r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r5.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "Received bytes - len:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = r4.array()     // Catch: java.lang.Throwable -> L3b
            int r4 = r4.length     // Catch: java.lang.Throwable -> L3b
            r5.append(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = ", pkg:"
            r5.append(r4)     // Catch: java.lang.Throwable -> L3b
            android.content.Context r4 = r7.f273b     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = cn.jiguang.av.o.a(r4)     // Catch: java.lang.Throwable -> L3b
            r5.append(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.w.f.d(r3, r4)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L79:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r5.<init>()     // Catch: java.lang.Throwable -> L3b
            r5.append(r1)     // Catch: java.lang.Throwable -> L3b
            r5.append(r4)     // Catch: java.lang.Throwable -> L3b
            r5.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.w.f.k(r3, r5)     // Catch: java.lang.Throwable -> L3b
            android.content.Context r5 = r7.f273b     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r6.<init>()     // Catch: java.lang.Throwable -> L3b
            r6.append(r1)     // Catch: java.lang.Throwable -> L3b
            r6.append(r4)     // Catch: java.lang.Throwable -> L3b
            r6.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L3b
            r1 = 1200(0x4b0, float:1.682E-42)
            cn.jiguang.ab.c.a.a(r5, r1, r0)     // Catch: java.lang.Throwable -> L3b
        La8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f276e
            r0.set(r2)
            goto Lb9
        Lae:
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f276e     // Catch: java.lang.Throwable -> Lc7
            r1.set(r2)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = "run exception"
            cn.jiguang.w.f.f(r3, r1, r0)     // Catch: java.lang.Throwable -> Lc7
            goto La8
        Lb9:
            boolean r0 = r7.a
            if (r0 == 0) goto Lc2
            java.lang.String r0 = "Break receiving by wantStop"
            cn.jiguang.w.f.d(r3, r0)
        Lc2:
            r0 = 1
            r7.a(r0)
            return
        Lc7:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f276e
            r1.set(r2)
            throw r0
    }

    public void a(int r5) {
            r4 = this;
            java.lang.String r0 = "NetworkingClient"
            java.lang.String r1 = "Action - closeConnection"
            cn.jiguang.w.f.d(r0, r1)
            cn.jiguang.ag.a r0 = r4.f274c
            cn.jiguang.av.x.a(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "connect_state"
            boolean r2 = r4.f275d
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "connect_instance_id"
            int r2 = r4.f277g
            r0.putInt(r1, r2)
            java.lang.String r1 = "connect_code"
            r0.putInt(r1, r5)
            cn.jiguang.ad.g r1 = cn.jiguang.ad.g.a()
            android.content.Context r2 = r4.f273b
            java.lang.String r3 = "tcp_a19"
            r1.a(r2, r3, r0)
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            cn.jiguang.ag.a r1 = r4.f274c
            java.lang.String r2 = r1.f461h
            int r3 = r1.f462i
            int r1 = r1.f460g
            r0.a(r2, r3, r1, r5)
            return
    }

    public synchronized void b() {
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f276e     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "TCP_CONN_TASK"
            cn.jiguang.au.d.a(r0, r4)     // Catch: java.lang.Throwable -> Ld
            goto L24
        Ld:
            r0 = move-exception
            java.lang.String r1 = "NetworkingClient"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "execute networkingClient exception :"
            r2.append(r3)     // Catch: java.lang.Throwable -> L26
            r2.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L26
            cn.jiguang.w.f.j(r1, r0)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r4)
            return
        L26:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    public synchronized void c() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "NetworkingClient"
            java.lang.String r1 = "Action - stop"
            cn.jiguang.w.f.d(r0, r1)     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r2.a = r0     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f276e     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.ag.a r0 = r2.f274c     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.av.x.a(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TCP_CONN_TASK"
            cn.jiguang.au.d.a(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public boolean d() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f276e
            boolean r0 = r0.get()
            return r0
    }

    public cn.jiguang.ag.a e() {
            r1 = this;
            cn.jiguang.ag.a r0 = r1.f274c
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.f277g
            return r0
    }
}
