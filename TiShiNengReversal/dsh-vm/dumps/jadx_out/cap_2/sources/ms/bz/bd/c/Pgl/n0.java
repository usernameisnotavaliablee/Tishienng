package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n0 {
    private static volatile boolean a;
    private static final java.util.concurrent.ConcurrentHashMap b = null;
    private static java.util.concurrent.CopyOnWriteArraySet c;
    public static final /* synthetic */ int d = 0;

    public interface pgla {
        java.lang.String a();

        java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r1, byte[] r2);

        void c(java.lang.String r1);

        void d(java.lang.String r1);

        void e(java.lang.String r1);

        void f(java.lang.String r1);

        void g(int r1);
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            ms.bz.bd.c.Pgl.n0.b = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            ms.bz.bd.c.Pgl.n0.c = r0
            return
    }

    protected n0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L2e
            r0 = 25
            byte[] r6 = new byte[r0]
            r6 = {x0030: FILL_ARRAY_DATA , data: [46, 63, 32, 69, 23, 45, 33, 6, 22, 109, 47, 56, 1, 72, 71, 54, 60, 25, 53, 106, 97, 124, 95, 13, 71} // fill-array
            r3 = 0
            java.lang.String r5 = "03a485"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = ms.bz.bd.c.Pgl.n0.c
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            com.volcengine.mobsecBiz.metasec.listener.PglITokenObserver r1 = (com.volcengine.mobsecBiz.metasec.listener.PglITokenObserver) r1
            r1.onTokenLoaded(r7)
            goto L1e
        L2e:
            return
    }

    static synchronized void b(android.content.Context r14) {
            java.lang.Class<ms.bz.bd.c.Pgl.n0> r1 = ms.bz.bd.c.Pgl.n0.class
            monitor-enter(r1)
            boolean r0 = ms.bz.bd.c.Pgl.n0.a     // Catch: java.lang.Throwable -> L1fb
            if (r0 != 0) goto L1fe
            android.content.Context r7 = r14.getApplicationContext()     // Catch: java.lang.Throwable -> L1fb
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.pblv r14 = ms.bz.bd.c.Pgl.pblv.a()     // Catch: java.lang.Throwable -> L1fb
            r14.b(r7)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.e1.a(r7)     // Catch: java.lang.Throwable -> L1fb
            r14 = 3
            byte[] r13 = new byte[r14]     // Catch: java.lang.Throwable -> L1fb
            r13 = {x0202: FILL_ARRAY_DATA , data: [62, 60, 4} // fill-array     // Catch: java.lang.Throwable -> L1fb
            java.lang.String r12 = "a3d8a5"
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.j r0 = new ms.bz.bd.c.Pgl.j     // Catch: java.lang.Throwable -> L1fb
            r0.<init>()     // Catch: java.lang.Throwable -> L1fb
            r2 = 16777218(0x1000002, float:2.3509893E-38)
            ms.bz.bd.c.Pgl.pbly.b(r2, r0)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.u r0 = new ms.bz.bd.c.Pgl.u     // Catch: java.lang.Throwable -> L1fb
            r0.<init>()     // Catch: java.lang.Throwable -> L1fb
            r2 = 16777217(0x1000001, float:2.350989E-38)
            ms.bz.bd.c.Pgl.pbly.b(r2, r0)     // Catch: java.lang.Throwable -> L1fb
            byte[] r13 = new byte[r14]     // Catch: java.lang.Throwable -> L1fb
            r13 = {x0208: FILL_ARRAY_DATA , data: [102, 58, 66} // fill-array     // Catch: java.lang.Throwable -> L1fb
            java.lang.String r12 = "955618"
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.f0 r14 = new ms.bz.bd.c.Pgl.f0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777219(0x1000003, float:2.3509895E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.g0 r14 = new ms.bz.bd.c.Pgl.g0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777221(0x1000005, float:2.35099E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.h0 r14 = new ms.bz.bd.c.Pgl.h0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777222(0x1000006, float:2.3509904E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.i0 r14 = new ms.bz.bd.c.Pgl.i0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777223(0x1000007, float:2.3509907E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.j0 r14 = new ms.bz.bd.c.Pgl.j0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777224(0x1000008, float:2.350991E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.k0 r14 = new ms.bz.bd.c.Pgl.k0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777225(0x1000009, float:2.3509912E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.l0 r14 = new ms.bz.bd.c.Pgl.l0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777226(0x100000a, float:2.3509915E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.pblz r14 = new ms.bz.bd.c.Pgl.pblz     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777228(0x100000c, float:2.350992E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.a r14 = new ms.bz.bd.c.Pgl.a     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.b r14 = new ms.bz.bd.c.Pgl.b     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777233(0x1000011, float:2.3509935E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.c r14 = new ms.bz.bd.c.Pgl.c     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777235(0x1000013, float:2.350994E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.d r14 = new ms.bz.bd.c.Pgl.d     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777238(0x1000016, float:2.350995E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.e r14 = new ms.bz.bd.c.Pgl.e     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777239(0x1000017, float:2.3509951E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.f r14 = new ms.bz.bd.c.Pgl.f     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777241(0x1000019, float:2.3509957E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.g r14 = new ms.bz.bd.c.Pgl.g     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777242(0x100001a, float:2.350996E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.h r14 = new ms.bz.bd.c.Pgl.h     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777243(0x100001b, float:2.3509963E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.i r14 = new ms.bz.bd.c.Pgl.i     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777244(0x100001c, float:2.3509965E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.k r14 = new ms.bz.bd.c.Pgl.k     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777245(0x100001d, float:2.3509968E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.l r14 = new ms.bz.bd.c.Pgl.l     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777246(0x100001e, float:2.350997E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.m r14 = new ms.bz.bd.c.Pgl.m     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777247(0x100001f, float:2.3509974E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.n r14 = new ms.bz.bd.c.Pgl.n     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777248(0x1000020, float:2.3509977E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.o r14 = new ms.bz.bd.c.Pgl.o     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777249(0x1000021, float:2.350998E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.p r14 = new ms.bz.bd.c.Pgl.p     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777250(0x1000022, float:2.3509982E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.q r14 = new ms.bz.bd.c.Pgl.q     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777251(0x1000023, float:2.3509985E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.r r14 = new ms.bz.bd.c.Pgl.r     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777240(0x1000018, float:2.3509954E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.s r14 = new ms.bz.bd.c.Pgl.s     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777252(0x1000024, float:2.3509988E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.t r14 = new ms.bz.bd.c.Pgl.t     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777253(0x1000025, float:2.350999E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.v r14 = new ms.bz.bd.c.Pgl.v     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777254(0x1000026, float:2.3509994E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.w r14 = new ms.bz.bd.c.Pgl.w     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777255(0x1000027, float:2.3509996E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.x r14 = new ms.bz.bd.c.Pgl.x     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777256(0x1000028, float:2.351E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.y r14 = new ms.bz.bd.c.Pgl.y     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777257(0x1000029, float:2.3510002E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.z r14 = new ms.bz.bd.c.Pgl.z     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777258(0x100002a, float:2.3510005E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.a0 r14 = new ms.bz.bd.c.Pgl.a0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777259(0x100002b, float:2.3510008E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.b0 r14 = new ms.bz.bd.c.Pgl.b0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777261(0x100002d, float:2.3510013E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.c0 r14 = new ms.bz.bd.c.Pgl.c0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777266(0x1000032, float:2.3510027E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.d0 r14 = new ms.bz.bd.c.Pgl.d0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 16777272(0x1000038, float:2.3510044E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.e0 r14 = new ms.bz.bd.c.Pgl.e0     // Catch: java.lang.Throwable -> L1fb
            r14.<init>()     // Catch: java.lang.Throwable -> L1fb
            r0 = 33554435(0x2000003, float:9.403958E-38)
            ms.bz.bd.c.Pgl.pbly.b(r0, r14)     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.v0.a()     // Catch: java.lang.Throwable -> L1fb
            ms.bz.bd.c.Pgl.w0.a()     // Catch: java.lang.Throwable -> L1fb
            r4 = 0
            r6 = 0
            r2 = 16777219(0x1000003, float:2.3509895E-38)
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L1fb
            r14 = 1
            ms.bz.bd.c.Pgl.n0.a = r14     // Catch: java.lang.Throwable -> L1fb
            goto L1fe
        L1fb:
            r0 = move-exception
            r14 = r0
            goto L200
        L1fe:
            monitor-exit(r1)
            return
        L200:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1fb
            throw r14
    }

    public static synchronized void c(java.lang.String r8) {
            java.lang.Class<ms.bz.bd.c.Pgl.n0> r1 = ms.bz.bd.c.Pgl.n0.class
            monitor-enter(r1)
            ms.bz.bd.c.Pgl.pblv r0 = ms.bz.bd.c.Pgl.pblv.a()     // Catch: java.lang.Throwable -> L43
            android.content.Context r0 = r0.c()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L46
            java.util.concurrent.ConcurrentHashMap r0 = ms.bz.bd.c.Pgl.n0.b     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L43
            ms.bz.bd.c.Pgl.pblu r0 = (ms.bz.bd.c.Pgl.pblu) r0     // Catch: java.lang.Throwable -> L43
            ms.bz.bd.c.Pgl.m0 r2 = e(r8)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L46
            if (r0 == 0) goto L46
            java.util.concurrent.CopyOnWriteArraySet r2 = ms.bz.bd.c.Pgl.n0.c     // Catch: java.lang.Throwable -> L43
            java.util.HashSet r0 = r0.p     // Catch: java.lang.Throwable -> L43
            r2.addAll(r0)     // Catch: java.lang.Throwable -> L43
            com.volcengine.mobsecBiz.metasec.ml.b r8 = com.volcengine.mobsecBiz.metasec.ml.c.a(r8)     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto L46
            r0 = 12
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L43
            r7 = {x004a: FILL_ARRAY_DATA , data: [29, 51, 72, 75, 78, 16, 34, 28, 116, 105, 48, 46} // fill-array     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "3856e8"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            r8.d(r0)     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r0 = move-exception
            r8 = r0
            goto L48
        L46:
            monitor-exit(r1)
            return
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r8
    }

    public static synchronized boolean d(android.content.Context r10, ms.bz.bd.c.Pgl.pblu r11) {
            java.lang.Class<ms.bz.bd.c.Pgl.n0> r1 = ms.bz.bd.c.Pgl.n0.class
            monitor-enter(r1)
            if (r10 == 0) goto L1be
            if (r11 == 0) goto L1a3
            java.lang.String r0 = r11.a     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L18
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L14
            if (r0 <= 0) goto L18
            java.lang.String r0 = r11.a     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            r0 = move-exception
            r10 = r0
            goto L1d9
        L18:
            java.lang.String r0 = r11.g     // Catch: java.lang.Throwable -> L14
        L1a:
            if (r0 == 0) goto L188
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L14
            if (r2 <= 0) goto L188
            boolean r2 = ms.bz.bd.c.Pgl.n0.a     // Catch: java.lang.Throwable -> L14
            r3 = 1
            if (r2 != 0) goto L3b
            java.lang.Class<ms.bz.bd.c.Pgl.n0> r2 = ms.bz.bd.c.Pgl.n0.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L14
            boolean r4 = ms.bz.bd.c.Pgl.n0.a     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L37
            b(r10)     // Catch: java.lang.Throwable -> L34
            ms.bz.bd.c.Pgl.n0.a = r3     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r0 = move-exception
            r10 = r0
            goto L39
        L37:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r10     // Catch: java.lang.Throwable -> L14
        L3b:
            java.util.concurrent.ConcurrentHashMap r10 = ms.bz.bd.c.Pgl.n0.b     // Catch: java.lang.Throwable -> L14
            boolean r10 = r10.containsKey(r0)     // Catch: java.lang.Throwable -> L14
            r2 = 0
            if (r10 == 0) goto L46
            monitor-exit(r1)
            return r2
        L46:
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r10.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.h     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.g     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.i     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.n1.a()     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.b     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.c     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.d     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.e     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r11.f     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblu.a(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            int r4 = r11.k     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            int r4 = r11.l     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            int r4 = r11.m     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L14
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r4.<init>()     // Catch: java.lang.Throwable -> L14
            java.util.Map<java.lang.String, java.lang.String> r5 = r11.n     // Catch: java.lang.Throwable -> L14
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L14
        Ld1:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L100
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch: java.lang.Throwable -> L14
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L14
            if (r7 != 0) goto Ld1
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.String r7 = ms.bz.bd.c.Pgl.pblu.a(r7)     // Catch: java.lang.Throwable -> L14
            r4.put(r7)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = ms.bz.bd.c.Pgl.pblu.a(r6)     // Catch: java.lang.Throwable -> L14
            r4.put(r6)     // Catch: java.lang.Throwable -> L14
            goto Ld1
        L100:
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r4.<init>()     // Catch: java.lang.Throwable -> L14
            java.util.HashMap r5 = r11.o     // Catch: java.lang.Throwable -> L14
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L14
        L112:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L163
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch: java.lang.Throwable -> L14
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L14
            if (r7 != 0) goto L112
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L14
            java.lang.String r8 = "kOA1"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L14c
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L14
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch: java.lang.Throwable -> L14
            java.lang.String r8 = "1"
            boolean r7 = android.text.TextUtils.equals(r7, r8)     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L14c
            ms.bz.bd.c.Pgl.a1.c = r2     // Catch: java.lang.Throwable -> L14
            java.lang.String r7 = r11.j     // Catch: java.lang.Throwable -> L14
            ms.bz.bd.c.Pgl.a1.d = r7     // Catch: java.lang.Throwable -> L14
        L14c:
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.String r7 = ms.bz.bd.c.Pgl.pblu.a(r7)     // Catch: java.lang.Throwable -> L14
            r4.put(r7)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = ms.bz.bd.c.Pgl.pblu.a(r6)     // Catch: java.lang.Throwable -> L14
            r4.put(r6)     // Catch: java.lang.Throwable -> L14
            goto L112
        L163:
            r10.put(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L14
            int r10 = ms.bz.bd.c.Pgl.pbly.b     // Catch: java.lang.Throwable -> L14
            r6 = 0
            r9 = 0
            r4 = 67108865(0x4000001, float:1.504633E-36)
            r5 = 0
            java.lang.Object r10 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L14
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L14
            if (r10 == 0) goto L186
            java.util.concurrent.ConcurrentHashMap r10 = ms.bz.bd.c.Pgl.n0.b     // Catch: java.lang.Throwable -> L14
            r10.put(r0, r11)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return r3
        L186:
            monitor-exit(r1)
            return r2
        L188:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L14
            r11 = 17
            byte[] r7 = new byte[r11]     // Catch: java.lang.Throwable -> L14
            r7 = {x01dc: FILL_ARRAY_DATA , data: [33, 38, 90, 106, 120, 110, 63, 0, 123, 115, 96, 52, 79, 3, 79, 43, 38} // fill-array     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = "1497c9"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r11 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L14
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L14
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L14
            throw r10     // Catch: java.lang.Throwable -> L14
        L1a3:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L14
            r11 = 24
            byte[] r7 = new byte[r11]     // Catch: java.lang.Throwable -> L14
            r7 = {x01ea: FILL_ARRAY_DATA , data: [35, 59, 73, 75, 85, 114, 114, 20, 106, 124, 44, 48, 7, 67, 83, 97, 114, 21, 96, 41, 46, 33, 75, 65} // fill-array     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = "1649cb"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r11 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L14
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L14
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L14
            throw r10     // Catch: java.lang.Throwable -> L14
        L1be:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L14
            r11 = 25
            byte[] r7 = new byte[r11]     // Catch: java.lang.Throwable -> L14
            r7 = {x01fa: FILL_ARRAY_DATA , data: [34, 58, 73, 88, 10, 62, 39, 86, 102, 103, 52, 57, 67, 12, 1, 41, 39, 86, 103, 109, 97, 59, 82, 64, 3} // fill-array     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = "074801"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r11 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L14
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L14
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L14
            throw r10     // Catch: java.lang.Throwable -> L14
        L1d9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r10
    }

    public static synchronized ms.bz.bd.c.Pgl.m0 e(java.lang.String r9) {
            java.lang.Class<ms.bz.bd.c.Pgl.n0> r1 = ms.bz.bd.c.Pgl.n0.class
            monitor-enter(r1)
            if (r9 == 0) goto L42
            boolean r0 = ms.bz.bd.c.Pgl.n0.a     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            if (r0 != 0) goto Lc
            monitor-exit(r1)
            return r2
        Lc:
            int r0 = ms.bz.bd.c.Pgl.pbly.b     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            r8 = 0
            r3 = 67108866(0x4000002, float:1.5046331E-36)
            r4 = 0
            r7 = r9
            java.lang.Object r9 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L1e
            monitor-exit(r1)
            return r2
        L1e:
            java.util.concurrent.ConcurrentHashMap r0 = ms.bz.bd.c.Pgl.n0.b     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L3f
            ms.bz.bd.c.Pgl.pblu r0 = (ms.bz.bd.c.Pgl.pblu) r0     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L2a
            monitor-exit(r1)
            return r2
        L2a:
            ms.bz.bd.c.Pgl.m0 r2 = new ms.bz.bd.c.Pgl.m0     // Catch: java.lang.Throwable -> L3f
            ms.bz.bd.c.Pgl.pblv r3 = ms.bz.bd.c.Pgl.pblv.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r3 = r3.c()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L3f
            long r4 = r9.longValue()     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)
            return r2
        L3f:
            r0 = move-exception
            r9 = r0
            goto L5d
        L42:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3f
            r0 = 17
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L3f
            r7 = {x0060: FILL_ARRAY_DATA , data: [36, 39, 7, 100, 120, 99, 58, 1, 38, 125, 101, 53, 18, 13, 79, 38, 35} // fill-array     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "45d9c4"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3f
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            throw r9     // Catch: java.lang.Throwable -> L3f
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r9
    }
}
