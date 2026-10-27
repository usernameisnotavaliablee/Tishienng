package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    public static int a = 290;

    /* renamed from: b, reason: collision with root package name */
    public static int f389b = 30;

    /* renamed from: c, reason: collision with root package name */
    public static int f390c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static long f391d = 10000;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f392e;

    /* renamed from: f, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicReference<java.lang.Long> f393f;

    /* renamed from: g, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicReference<java.lang.Integer> f394g;

    /* renamed from: h, reason: collision with root package name */
    private volatile java.util.concurrent.atomic.AtomicReference<cn.jiguang.ab.h> f395h;

    /* renamed from: i, reason: collision with root package name */
    private int f396i;

    /* renamed from: j, reason: collision with root package name */
    private int f397j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f398k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private boolean p;
    private android.content.Context q;
    private boolean r;
    private final java.util.concurrent.atomic.AtomicBoolean s;
    private cn.jiguang.ah.a t;
    private boolean u;
    private int v;
    private int w;


    class a extends cn.jiguang.au.b {
        final /* synthetic */ cn.jiguang.ad.g a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f399b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f400c;

        /* renamed from: d, reason: collision with root package name */
        private android.os.Bundle f401d;

        public a(cn.jiguang.ad.g r1, android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f399b = r2
                r0.f400c = r3
                r0.f401d = r4
                java.lang.String r1 = "TcpManager"
                r0.f668h = r1
                return
        }

        private void b() {
                r6 = this;
                java.lang.String r0 = "JPUSH"
                boolean r1 = cn.jiguang.d.a.a(r0)
                r2 = 1
                java.lang.String r3 = "JCoreTCPManager"
                if (r1 == 0) goto L20
                android.content.Context r1 = r6.f399b
                java.lang.Integer r1 = cn.jiguang.d.a.m(r1)
                if (r1 == 0) goto L1b
                int r1 = r1.intValue()
                r4 = 590(0x24e, float:8.27E-43)
                if (r1 >= r4) goto L25
            L1b:
                cn.jiguang.ad.g.f392e = r2
                java.lang.String r1 = "isJPushCallUp: JPush version < 590, set isPushInit true"
                goto L22
            L20:
                java.lang.String r1 = "isJPushCallUp: No JDispatchActionSdkType branch"
            L22:
                cn.jiguang.w.f.c(r3, r1)
            L25:
                android.os.Bundle r1 = r6.f401d
                if (r1 == 0) goto L4d
                java.lang.String r4 = "jg_init_sdk_type"
                java.lang.String r5 = ""
                java.lang.String r1 = r1.getString(r4, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "isJPushCallUp: sdkType:"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                cn.jiguang.w.f.c(r3, r4)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L4d
                cn.jiguang.ad.g.f392e = r2
            L4d:
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r29 = this;
                r1 = r29
                java.lang.String r0 = "tcp_a23"
                java.lang.String r2 = "tcp_a3"
                java.lang.String r3 = "tcp_a1"
                java.lang.String r4 = "JCoreTCPManager"
                java.lang.String r5 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r5 = r5.equals(r3)     // Catch: java.lang.Throwable -> L19
                r6 = 0
                if (r5 == 0) goto L1c
                android.content.Context r5 = r1.f399b     // Catch: java.lang.Throwable -> L19
                cn.jiguang.i.a.a(r5, r3, r6)     // Catch: java.lang.Throwable -> L19
                goto L1c
            L19:
                r0 = move-exception
                goto L3fc
            L1c:
                java.lang.String r5 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L19
                if (r3 != 0) goto L3d0
                java.lang.String r3 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a28"
                boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r3 == 0) goto L30
                goto L3d0
            L30:
                java.lang.String r3 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = ",body size:"
                java.lang.String r7 = ",rid:"
                java.lang.String r8 = ",ver:"
                java.lang.String r9 = "sdk_type"
                java.lang.String r10 = "ver"
                java.lang.String r11 = "cmd"
                java.lang.String r12 = "body"
                java.lang.String r13 = "tcp_a20"
                java.lang.String r6 = "rid"
                if (r3 != 0) goto L2f3
                java.lang.String r3 = r1.f400c     // Catch: java.lang.Throwable -> L19
                r16 = 0
                java.lang.String r14 = "tcp_a4"
                boolean r3 = r3.equals(r14)     // Catch: java.lang.Throwable -> L19
                if (r3 != 0) goto L2f5
                java.lang.String r3 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r3 = r3.equals(r13)     // Catch: java.lang.Throwable -> L19
                if (r3 == 0) goto L61
                goto L2f5
            L61:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r3 = "tcp_a5"
                boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto Le1
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
                byte[] r0 = r0.getByteArray(r12)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r2 = r1.f401d     // Catch: java.lang.Throwable -> L19
                r3 = -1
                int r2 = r2.getInt(r11, r3)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r11 = r1.f401d     // Catch: java.lang.Throwable -> L19
                int r3 = r11.getInt(r10, r3)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r10 = r1.f401d     // Catch: java.lang.Throwable -> L19
                r11 = -1
                long r10 = r10.getLong(r6, r11)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r6 = r1.f401d     // Catch: java.lang.Throwable -> L19
                java.lang.String r25 = r6.getString(r9)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r6 = r1.f401d     // Catch: java.lang.Throwable -> L19
                java.lang.String r9 = "timeout"
                long r26 = r6.getLong(r9)     // Catch: java.lang.Throwable -> L19
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
                r6.<init>()     // Catch: java.lang.Throwable -> L19
                java.lang.String r9 = "send quest,cmd:"
                r6.append(r9)     // Catch: java.lang.Throwable -> L19
                r6.append(r2)     // Catch: java.lang.Throwable -> L19
                r6.append(r8)     // Catch: java.lang.Throwable -> L19
                r6.append(r3)     // Catch: java.lang.Throwable -> L19
                r6.append(r7)     // Catch: java.lang.Throwable -> L19
                r6.append(r10)     // Catch: java.lang.Throwable -> L19
                r6.append(r5)     // Catch: java.lang.Throwable -> L19
                int r5 = r0.length     // Catch: java.lang.Throwable -> L19
                r6.append(r5)     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L19
                cn.jiguang.w.f.c(r4, r5)     // Catch: java.lang.Throwable -> L19
                if (r2 < 0) goto L3fb
                if (r3 < 0) goto L3fb
                int r5 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
                if (r5 < 0) goto L3fb
                boolean r5 = android.text.TextUtils.isEmpty(r25)     // Catch: java.lang.Throwable -> L19
                if (r5 == 0) goto Lcd
                goto L3fb
            Lcd:
                cn.jiguang.ad.i r18 = cn.jiguang.ad.i.a()     // Catch: java.lang.Throwable -> L19
                android.content.Context r5 = r1.f399b     // Catch: java.lang.Throwable -> L19
                r24 = r0
                r22 = r2
                r23 = r3
                r19 = r5
                r20 = r10
                r18.a(r19, r20, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L19
                return
            Le1:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r3 = "tcp_a19"
                boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L19
                r3 = 0
                if (r2 == 0) goto L118
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L111
                cn.jiguang.ad.g r2 = r1.a     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "connect_state"
                boolean r0 = r0.getBoolean(r5, r3)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.a(r2, r0)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "connect_instance_id"
                int r0 = r0.getInt(r2, r3)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r2 = r1.f401d     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "connect_code"
                int r3 = r2.getInt(r5, r3)     // Catch: java.lang.Throwable -> L19
                r28 = r3
                r3 = r0
                r0 = r28
                goto L112
            L111:
                r0 = 0
            L112:
                cn.jiguang.ad.g r2 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L19
                return
            L118:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a11"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L157
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
                r0.<init>()     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "resgiter success:"
                r0.append(r2)     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = cn.jiguang.d.a.b(r2)     // Catch: java.lang.Throwable -> L19
                r0.append(r2)     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L19
                cn.jiguang.w.f.d(r4, r0)     // Catch: java.lang.Throwable -> L19
                android.content.Context r0 = r1.f399b     // Catch: java.lang.Throwable -> L19
                cn.jiguang.av.a.f(r0)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = cn.jiguang.d.a.b(r2)     // Catch: java.lang.Throwable -> L19
                r0.a(r2, r3, r3, r5)     // Catch: java.lang.Throwable -> L19
                android.content.Context r0 = r1.f399b     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "on_register"
                r3 = 0
                cn.jiguang.i.a.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L19
                return
            L157:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a10"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L167
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.f(r0)     // Catch: java.lang.Throwable -> L19
                return
            L167:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a9"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L179
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.a(r0, r2)     // Catch: java.lang.Throwable -> L19
                return
            L179:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a8"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L18b
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.b(r0, r2)     // Catch: java.lang.Throwable -> L19
                return
            L18b:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L199
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.g(r0)     // Catch: java.lang.Throwable -> L19
                return
            L199:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a2"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L1b4
                cn.jiguang.ad.f r0 = cn.jiguang.ad.f.a()     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                r0.a(r2, r3)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r2 = r1.f401d     // Catch: java.lang.Throwable -> L19
                r0.a(r2)     // Catch: java.lang.Throwable -> L19
                return
            L1b4:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a13"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "resCode"
                if (r2 == 0) goto L1d8
                java.lang.String r0 = "resgiter failed"
                cn.jiguang.w.f.d(r4, r0)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
                int r0 = r0.getInt(r5, r3)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r2 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.a(r2, r0)     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ab.c.a(r2, r0)     // Catch: java.lang.Throwable -> L19
                return
            L1d8:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r7 = "tcp_a12"
                boolean r2 = r2.equals(r7)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L1f5
                java.lang.String r0 = "login failed"
                cn.jiguang.w.f.d(r4, r0)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
                int r0 = r0.getInt(r5, r3)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r2 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.b(r2, r0)     // Catch: java.lang.Throwable -> L19
                return
            L1f5:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a14"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L203
            L1ff:
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                goto L3e6
            L203:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a15"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L215
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r2 = r1.f401d     // Catch: java.lang.Throwable -> L19
                r0.b(r2)     // Catch: java.lang.Throwable -> L19
                return
            L215:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a16"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L227
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r2 = r1.f401d     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.a(r0, r2)     // Catch: java.lang.Throwable -> L19
                return
            L227:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a17"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L237
            L231:
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.h(r0)     // Catch: java.lang.Throwable -> L19
                return
            L237:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a26"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L247
                java.lang.String r0 = "check heartbeat status"
                cn.jiguang.w.f.c(r4, r0)     // Catch: java.lang.Throwable -> L19
                goto L231
            L247:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a18"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L257
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.i(r0)     // Catch: java.lang.Throwable -> L19
                return
            L257:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a6"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L279
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
                r11 = -1
                long r2 = r0.getLong(r6, r11)     // Catch: java.lang.Throwable -> L19
                int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r0 <= 0) goto L3fb
                cn.jiguang.ad.i r0 = cn.jiguang.ad.i.a()     // Catch: java.lang.Throwable -> L19
                android.content.Context r5 = r1.f399b     // Catch: java.lang.Throwable -> L19
                r0.b(r5, r2)     // Catch: java.lang.Throwable -> L19
                return
            L279:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a7"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L29b
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
                r11 = -1
                long r2 = r0.getLong(r6, r11)     // Catch: java.lang.Throwable -> L19
                int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r0 <= 0) goto L3fb
                cn.jiguang.ad.i r0 = cn.jiguang.ad.i.a()     // Catch: java.lang.Throwable -> L19
                android.content.Context r5 = r1.f399b     // Catch: java.lang.Throwable -> L19
                r0.a(r5, r2)     // Catch: java.lang.Throwable -> L19
                return
            L29b:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a21"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L2ab
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.j(r0)     // Catch: java.lang.Throwable -> L19
                return
            L2ab:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "tcp_a22"
                boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L2bb
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                r0.b()     // Catch: java.lang.Throwable -> L19
                return
            L2bb:
                java.lang.String r2 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L2cb
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.c(r0, r2)     // Catch: java.lang.Throwable -> L19
                return
            L2cb:
                java.lang.String r0 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "tcp_a24"
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L19
                if (r0 != 0) goto L2df
                java.lang.String r0 = r1.f400c     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "tcp_a25"
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
            L2df:
                r1.b()     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.g(r0)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.a(r0, r3)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.c(r0, r3)     // Catch: java.lang.Throwable -> L19
                goto L1ff
            L2f3:
                r16 = 0
            L2f5:
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                boolean r0 = cn.jiguang.ad.g.b(r0)     // Catch: java.lang.Throwable -> L19
                if (r0 != 0) goto L3c9
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                byte[] r0 = r0.getByteArray(r12)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r3 = r1.f401d     // Catch: java.lang.Throwable -> L19
                r12 = -1
                int r3 = r3.getInt(r11, r12)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r11 = r1.f401d     // Catch: java.lang.Throwable -> L19
                int r10 = r11.getInt(r10, r12)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r11 = r1.f401d     // Catch: java.lang.Throwable -> L19
                r14 = -1
                long r11 = r11.getLong(r6, r14)     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r6 = r1.f401d     // Catch: java.lang.Throwable -> L19
                java.lang.String r25 = r6.getString(r9)     // Catch: java.lang.Throwable -> L19
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
                r6.<init>()     // Catch: java.lang.Throwable -> L19
                java.lang.String r9 = "send data,cmd:"
                r6.append(r9)     // Catch: java.lang.Throwable -> L19
                r6.append(r3)     // Catch: java.lang.Throwable -> L19
                r6.append(r8)     // Catch: java.lang.Throwable -> L19
                r6.append(r10)     // Catch: java.lang.Throwable -> L19
                r6.append(r7)     // Catch: java.lang.Throwable -> L19
                r6.append(r11)     // Catch: java.lang.Throwable -> L19
                r6.append(r5)     // Catch: java.lang.Throwable -> L19
                int r5 = r0.length     // Catch: java.lang.Throwable -> L19
                r6.append(r5)     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L19
                cn.jiguang.w.f.c(r4, r5)     // Catch: java.lang.Throwable -> L19
                if (r3 < 0) goto L3fb
                if (r10 < 0) goto L3fb
                int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
                if (r5 >= 0) goto L34f
                goto L3fb
            L34f:
                java.lang.String r5 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r2 = r5.equals(r2)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L36b
                cn.jiguang.ad.i r18 = cn.jiguang.ad.i.a()     // Catch: java.lang.Throwable -> L19
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                r24 = r0
                r19 = r2
                r22 = r3
                r23 = r10
                r20 = r11
                r18.a(r19, r20, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L19
                return
            L36b:
                r23 = r0
                r19 = r3
                r20 = r10
                r21 = r11
                java.lang.String r0 = r1.f400c     // Catch: java.lang.Throwable -> L19
                boolean r0 = r0.equals(r13)     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L392
                android.os.Bundle r0 = r1.f401d     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "uid"
                r5 = r16
                long r2 = r0.getLong(r2, r5)     // Catch: java.lang.Throwable -> L19
                int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r0 != 0) goto L38f
                java.lang.String r0 = "share response uid is 0"
                cn.jiguang.w.f.i(r4, r0)     // Catch: java.lang.Throwable -> L19
                return
            L38f:
                r24 = r2
                goto L396
            L392:
                r5 = r16
                r24 = r5
            L396:
                android.content.Context r0 = r1.f399b     // Catch: java.lang.Throwable -> L19
                r18 = r0
                byte[] r0 = cn.jiguang.af.b.a(r18, r19, r20, r21, r23, r24)     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r2 = cn.jiguang.ad.g.a()     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ab.h r2 = r2.c()     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ag.a r2 = r2.e()     // Catch: java.lang.Throwable -> L19
                int r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
                android.content.Context r2 = r1.f399b     // Catch: java.lang.Throwable -> L19
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
                r3.<init>()     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "code:"
                r3.append(r5)     // Catch: java.lang.Throwable -> L19
                r3.append(r0)     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L19
                r3 = 1500(0x5dc, float:2.102E-42)
                cn.jiguang.ab.c.a.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L19
                return
            L3c9:
                java.lang.String r0 = "send data failed:tcp breaked,will restart"
                cn.jiguang.w.f.c(r4, r0)     // Catch: java.lang.Throwable -> L19
                goto L1ff
            L3d0:
                boolean r0 = cn.jiguang.ad.g.f392e     // Catch: java.lang.Throwable -> L19
                r1.b()     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g r2 = r1.a     // Catch: java.lang.Throwable -> L19
                boolean r2 = cn.jiguang.ad.g.b(r2)     // Catch: java.lang.Throwable -> L19
                if (r2 == 0) goto L3ea
                android.content.Context r0 = r1.f399b     // Catch: java.lang.Throwable -> L19
                android.os.Bundle r2 = r1.f401d     // Catch: java.lang.Throwable -> L19
                cn.jiguang.al.e.a(r0, r2)     // Catch: java.lang.Throwable -> L19
                goto L1ff
            L3e6:
                cn.jiguang.ad.g.d(r0)     // Catch: java.lang.Throwable -> L19
                return
            L3ea:
                boolean r2 = cn.jiguang.ad.g.f392e     // Catch: java.lang.Throwable -> L19
                if (r0 == r2) goto L3fb
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                boolean r0 = cn.jiguang.ad.g.c(r0)     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L3fb
                cn.jiguang.ad.g r0 = r1.a     // Catch: java.lang.Throwable -> L19
                cn.jiguang.ad.g.e(r0)     // Catch: java.lang.Throwable -> L19
            L3fb:
                return
            L3fc:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "tcp action failed:"
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.w.f.j(r4, r0)
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.ad.g a = null;

        static {
                cn.jiguang.ad.g r0 = new cn.jiguang.ad.g
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ad.g.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ad.g a() {
                cn.jiguang.ad.g r0 = cn.jiguang.ad.g.b.a
                return r0
        }
    }

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            long r1 = cn.jiguang.ad.g.f391d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.<init>(r1)
            cn.jiguang.ad.g.f393f = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            int r1 = cn.jiguang.ad.g.f390c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1)
            cn.jiguang.ad.g.f394g = r0
            r0 = 0
            cn.jiguang.ad.g.f392e = r0
            return
    }

    private g() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f395h = r0
            r0 = 0
            r2.f398k = r0
            r2.l = r0
            r2.m = r0
            r2.r = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r0)
            r2.s = r1
            cn.jiguang.ad.g$1 r1 = new cn.jiguang.ad.g$1
            r1.<init>(r2)
            r2.t = r1
            r2.u = r0
            r2.v = r0
            r2.w = r0
            r0 = 1
            r2.p = r0
            android.content.Context r0 = cn.jiguang.av.c.a()
            r2.q = r0
            return
    }

    /* synthetic */ g(cn.jiguang.ad.g.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int a(cn.jiguang.ad.g r0, int r1) {
            r0.f397j = r1
            return r1
    }

    static /* synthetic */ android.content.Context a(cn.jiguang.ad.g r0) {
            android.content.Context r0 = r0.q
            return r0
    }

    public static cn.jiguang.ad.g a() {
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.b.a()
            return r0
    }

    private void a(int r3) {
            r2 = this;
            r2.f396i = r3
            android.content.Context r0 = r2.q
            java.lang.String r1 = ""
            cn.jiguang.al.e.a(r0, r3, r1)
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r3 != r0) goto L12
            android.content.Context r3 = r2.q
            cn.jiguang.ab.c.a(r3)
        L12:
            r2.l()
            r3 = 0
            cn.jiguang.f.b.b(r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "state"
            r0.putBoolean(r1, r3)
            cn.jiguang.v.g r3 = cn.jiguang.v.g.a()
            java.lang.String r1 = "isTcpLoggedIn"
            r3.a(r1, r0)
            return
    }

    private void a(int r6, int r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Action - onDisconnected, code: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.d(r1, r0)
            boolean r0 = r5.o
            r2 = 0
            if (r0 == 0) goto L1d
            r5.o = r2
        L1d:
            cn.jiguang.ab.h r3 = r5.c()
            if (r3 != 0) goto L40
            android.content.Context r3 = r5.q
            cn.jiguang.e.a r4 = cn.jiguang.e.a.aq()
            java.lang.Object r3 = cn.jiguang.e.b.a(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L40
            java.lang.String r6 = "push already stopped!!!"
            cn.jiguang.w.f.c(r1, r6)
            int r6 = r5.l
            r5.a(r0, r2, r6, r7)
            return
        L40:
            r5.m = r2
            r5.b(r6)
            int r6 = r5.m()
            int r1 = r5.l
            r5.a(r0, r6, r1, r7)
            int r6 = r5.l
            int r6 = r6 + 1
            r5.l = r6
            return
    }

    static /* synthetic */ void a(cn.jiguang.ad.g r0, int r1, int r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ void a(cn.jiguang.ad.g r0, android.content.Context r1) {
            r0.d(r1)
            return
    }

    static /* synthetic */ void a(cn.jiguang.ad.g r0, android.os.Bundle r1) {
            r0.c(r1)
            return
    }

    private void a(boolean r5) {
            r4 = this;
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            android.content.Context r1 = cn.jiguang.av.c.a()
            r5 = r5 ^ 1
            java.lang.String r2 = ""
            r3 = 2011(0x7db, float:2.818E-42)
            r0.a(r1, r3, r5, r2)
            return
    }

    private void a(boolean r6, int r7, int r8, int r9) {
            r5 = this;
            java.lang.String r0 = ", mDisconnectedTimes="
            java.lang.String r1 = "JCoreTCPManager"
            if (r6 == 0) goto L78
            r6 = 2
            r2 = 2002(0x7d2, float:2.805E-42)
            if (r7 == r6) goto L4a
            if (r8 != 0) goto L4a
            r6 = 1
            if (r9 != r6) goto L4a
            cn.jiguang.ah.b r6 = cn.jiguang.ah.b.a()
            boolean r6 = r6.a(r2)
            r9 = r6 ^ 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Delay dispatchEvent: retryConnectResult="
            r3.append(r4)
            r3.append(r7)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r7 = ", b="
            r3.append(r7)
            r3.append(r9)
            java.lang.String r7 = r3.toString()
            cn.jiguang.w.f.c(r1, r7)
            if (r6 != 0) goto L49
            cn.jiguang.ah.b r6 = cn.jiguang.ah.b.a()
            r7 = 1000(0x3e8, double:4.94E-321)
            cn.jiguang.ah.a r9 = r5.t
            r6.b(r2, r7, r9)
        L49:
            return
        L4a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "Immediately dispatchEvent: retryConnectResult="
            r6.append(r9)
            r6.append(r7)
            r6.append(r0)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r1, r6)
            cn.jiguang.ah.b r6 = cn.jiguang.ah.b.a()
            r6.b(r2)
            cn.jiguang.ad.b r6 = cn.jiguang.ad.b.a()
            android.content.Context r7 = r5.q
            java.lang.String r8 = "push connect break"
            r9 = -1
            r6.a(r7, r9, r9, r8)
            return
        L78:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Not dispatch disconnect event: wasLoggedIn="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ", code="
            r2.append(r6)
            r2.append(r9)
            java.lang.String r6 = ", retryConnectResult="
            r2.append(r6)
            r2.append(r7)
            r2.append(r0)
            r2.append(r8)
            java.lang.String r6 = r2.toString()
            cn.jiguang.w.f.c(r1, r6)
            return
    }

    static /* synthetic */ boolean a(cn.jiguang.ad.g r0, boolean r1) {
            r0.f398k = r1
            return r1
    }

    private synchronized void b(int r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "closeTcp instanceId:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            r1.append(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L29
            if (r4 <= 0) goto L25
            cn.jiguang.ab.h r0 = r3.c()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2b
            int r1 = r0.f()     // Catch: java.lang.Throwable -> L29
            if (r1 != r4) goto L2b
        L25:
            r3.l()     // Catch: java.lang.Throwable -> L29
            goto L4e
        L29:
            r4 = move-exception
            goto L50
        L2b:
            java.lang.String r4 = "JCoreTCPManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "closeTcp instanceId not match, current:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L42
            int r0 = r0.f()     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L29
            goto L44
        L42:
            java.lang.String r0 = "null"
        L44:
            r1.append(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.w.f.c(r4, r0)     // Catch: java.lang.Throwable -> L29
        L4e:
            monitor-exit(r3)
            return
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
    }

    private void b(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "handleStop..."
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aq()
            java.lang.Object r0 = cn.jiguang.e.b.a(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            java.lang.String r5 = "tcp already stoped"
            cn.jiguang.w.f.d(r1, r5)
            return
        L1d:
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            r2 = 0
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L2e
            java.lang.String r5 = "Action: handleStopPush - can't stop tcp"
            cn.jiguang.w.f.c(r1, r5)
            return
        L2e:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aq()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            cn.jiguang.e.a r0 = r0.a(r1)
            r1 = 1
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r1]
            r3[r2] = r0
            cn.jiguang.e.b.a(r5, r3)
            r4.a(r1)
            r4.l()
            return
    }

    static /* synthetic */ void b(cn.jiguang.ad.g r0, int r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void b(cn.jiguang.ad.g r0, android.content.Context r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ boolean b(cn.jiguang.ad.g r0) {
            boolean r0 = r0.o()
            return r0
    }

    static /* synthetic */ int c(cn.jiguang.ad.g r0, int r1) {
            r0.f396i = r1
            return r1
    }

    private void c(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "handleUnRegister..."
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ab()
            java.lang.Object r0 = cn.jiguang.e.b.a(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1d
            java.lang.String r4 = "tcp already stoped"
            cn.jiguang.w.f.d(r1, r4)
            return
        L1d:
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            r2 = 0
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L2e
            java.lang.String r4 = "Action: handleUnRegister - can't stop tcp"
            cn.jiguang.w.f.c(r1, r4)
            return
        L2e:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ab()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            cn.jiguang.e.a r0 = r0.a(r1)
            r1 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]
            r1[r2] = r0
            cn.jiguang.e.b.a(r4, r1)
            r3.l()
            return
    }

    private void c(android.os.Bundle r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.s
            boolean r0 = r0.get()
            java.lang.String r1 = "JCoreTCPManager"
            if (r0 == 0) goto L10
            java.lang.String r4 = "isBeating, skip this time"
        Lc:
            cn.jiguang.w.f.c(r1, r4)
            return
        L10:
            r0 = 0
            if (r4 == 0) goto L19
            java.lang.String r2 = "force"
            boolean r0 = r4.getBoolean(r2, r0)
        L19:
            if (r0 != 0) goto L24
            boolean r4 = r3.p()
            if (r4 == 0) goto L24
            java.lang.String r4 = "No need to rtc, Because it have succeed recently"
            goto Lc
        L24:
            java.lang.String r4 = "Send heart beat"
            cn.jiguang.w.f.d(r1, r4)
            cn.jiguang.ah.b r4 = cn.jiguang.ah.b.a()
            r0 = 1005(0x3ed, float:1.408E-42)
            r4.b(r0)
            boolean r4 = r3.o
            if (r4 == 0) goto L3a
            r3.r()
            return
        L3a:
            java.lang.String r4 = "socket is closed or push isn't login"
            goto Lc
    }

    static /* synthetic */ void c(cn.jiguang.ad.g r0, android.content.Context r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ boolean c(cn.jiguang.ad.g r0) {
            boolean r0 = r0.o
            return r0
    }

    static /* synthetic */ int d(cn.jiguang.ad.g r0) {
            int r0 = r0.n()
            return r0
    }

    private void d(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "handleResume..."
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aq()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            cn.jiguang.e.a r0 = r0.a(r2)
            r2 = 1
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]
            r3 = 0
            r2[r3] = r0
            cn.jiguang.e.b.a(r5, r2)
            r4.a(r3)
            boolean r5 = r4.o
            if (r5 == 0) goto L27
            java.lang.String r5 = "[handleResume] is loggedin"
            cn.jiguang.w.f.c(r1, r5)
            return
        L27:
            r4.n()
            return
    }

    static /* synthetic */ void e(cn.jiguang.ad.g r0) {
            r0.r()
            return
    }

    static /* synthetic */ void f(cn.jiguang.ad.g r0) {
            r0.j()
            return
    }

    static /* synthetic */ void g(cn.jiguang.ad.g r0) {
            r0.l()
            return
    }

    static /* synthetic */ void h(cn.jiguang.ad.g r0) {
            r0.q()
            return
    }

    static /* synthetic */ void i(cn.jiguang.ad.g r0) {
            r0.s()
            return
    }

    private void j() {
            r6 = this;
            java.lang.String r0 = "Action - onLoggedIn"
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.d(r1, r0)
            android.content.Context r0 = r6.q
            cn.jiguang.al.e.a(r0)
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r2 = 2002(0x7d2, float:2.805E-42)
            boolean r0 = r0.a(r2)
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L23
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r0.b(r2)
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            boolean r2 = r6.o
            if (r2 != 0) goto L4b
            r6.o = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "isHasDelayDisconnectEvent = "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r1, r2)
            if (r0 != 0) goto L4b
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            android.content.Context r2 = r6.q
            java.lang.String r5 = "success"
            r0.a(r2, r3, r4, r5)
        L4b:
            r6.b()
            r6.l = r4
            r6.m = r4
            android.content.Context r0 = r6.q
            cn.jiguang.a.a.b(r0)
            java.lang.String r0 = "Force to send 12s heartbeat after login"
            cn.jiguang.w.f.c(r1, r0)
            android.content.Context r0 = r6.q
            r1 = 5000(0x1388, double:2.4703E-320)
            cn.jiguang.a.a.a(r0, r3, r1)
            android.content.Context r0 = r6.q
            java.lang.String r1 = "on_logged"
            r2 = 0
            cn.jiguang.i.a.a(r0, r1, r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "login"
            r0.putBoolean(r1, r3)
            android.content.Context r1 = r6.q
            java.lang.String r2 = "periodtask"
            cn.jiguang.i.a.a(r1, r2, r0)
            boolean r0 = r6.k()
            if (r0 != 0) goto L83
            return
        L83:
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r1 = 2000(0x7d0, double:9.88E-321)
            cn.jiguang.ah.a r4 = r6.t
            r5 = 2000(0x7d0, float:2.803E-42)
            r0.b(r5, r1, r4)
            cn.jiguang.ad.i r0 = cn.jiguang.ad.i.a()
            android.content.Context r1 = r6.q
            r0.a(r1)
            cn.jiguang.ad.f r0 = cn.jiguang.ad.f.a()
            android.content.Context r1 = r6.q
            r0.a(r1, r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "state"
            r0.putBoolean(r1, r3)
            cn.jiguang.v.g r1 = cn.jiguang.v.g.a()
            java.lang.String r2 = "isTcpLoggedIn"
            r1.a(r2, r0)
            return
    }

    static /* synthetic */ boolean j(cn.jiguang.ad.g r0) {
            boolean r0 = r0.k()
            return r0
    }

    private boolean k() {
            r2 = this;
            cn.jiguang.v.c r0 = cn.jiguang.v.c.a()
            android.content.Context r1 = r2.q
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L26
            cn.jiguang.ad.j r0 = cn.jiguang.ad.j.a()
            android.content.Context r1 = r2.q
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L26
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r1 = "not keep tcp"
            cn.jiguang.w.f.c(r0, r1)
            r0 = 0
            r2.p = r0
            r2.l()
            return r0
        L26:
            r0 = 1
            return r0
    }

    private synchronized void l() {
            r2 = this;
            monitor-enter(r2)
            cn.jiguang.ab.h r0 = r2.c()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r0.c()     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.ab.h> r0 = r2.f395h     // Catch: java.lang.Throwable -> L11
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L11
            goto L1a
        L11:
            r0 = move-exception
            goto L1c
        L13:
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r1 = "tcp has stopeed"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L11
        L1a:
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    private int m() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Action - retryConnect - disconnectedTimes:"
            r0.append(r1)
            int r1 = r8.l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.d(r1, r0)
            boolean r0 = cn.jiguang.av.n.a()
            r2 = 0
            if (r0 != 0) goto L25
            java.lang.String r0 = "[retryConnect] network is not connect"
        L21:
            cn.jiguang.w.f.c(r1, r0)
            return r2
        L25:
            int r0 = r8.f397j
            if (r0 <= 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[retryConnect] registerErrCode >0,registerErrCode:"
            r0.append(r3)
            int r3 = r8.f397j
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L21
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[retryConnect] mDisconnectedTimes:"
            r0.append(r3)
            int r4 = r8.l
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            int r0 = r8.l
            if (r0 != 0) goto L5c
            int r0 = r8.n()
            return r0
        L5c:
            android.content.Context r0 = r8.q     // Catch: java.lang.Throwable -> L6b
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L6b
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L6b
            int r0 = cn.jiguang.av.a.c(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
            r0 = -1
        L6c:
            int r4 = r8.l
            double r4 = (double) r4
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r6, r4)
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r4 = r4 * r6
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r6
            int r4 = (int) r4
            int r5 = r8.f()
            int r6 = r5 * 1000
            r7 = 2
            int r6 = r6 / r7
            if (r4 <= r6) goto L8c
            r4 = r6
        L8c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            int r3 = r8.l
            r6.append(r3)
            java.lang.String r3 = ",chargedLever:"
            r6.append(r3)
            r6.append(r0)
            java.lang.String r3 = ",heartbeatInterval:"
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = ",delayTime:"
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            cn.jiguang.w.f.c(r1, r3)
            android.content.Context r3 = r8.q
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            boolean r3 = cn.jiguang.ab.c.f(r3)
            if (r3 == 0) goto Ld6
            boolean r3 = r8.f398k
            if (r3 == 0) goto Ld6
            java.lang.String r3 = "tcp ssl retry connect times use up, use no ssl retry again."
            cn.jiguang.w.f.c(r1, r3)
            cn.jiguang.ab.c.a(r2)
            r8.l = r2
        Ld6:
            r3 = 1
            if (r0 != r3) goto Le0
            int r0 = r8.l
            r3 = 30
            if (r0 >= r3) goto L107
            goto Le5
        Le0:
            int r0 = r8.l
            r3 = 5
            if (r0 >= r3) goto L107
        Le5:
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r2 = 1011(0x3f3, float:1.417E-42)
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L101
            java.lang.String r0 = "send MSG_RESTART_CONN"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            long r3 = (long) r4
            cn.jiguang.ah.a r1 = r8.t
            r0.b(r2, r3, r1)
            return r7
        L101:
            java.lang.String r0 = "Already has MSG_RESTART_CONN"
            cn.jiguang.w.f.c(r1, r0)
            return r7
        L107:
            return r2
    }

    private synchronized int n() {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "Action - restartNetworkingClient, pid:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.w.f.d(r0, r1)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r6.p     // Catch: java.lang.Throwable -> L29
            r1 = 0
            if (r0 != 0) goto L2c
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "need not keep tcp,next start app will re login"
            cn.jiguang.w.f.h(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        L29:
            r0 = move-exception
            goto L167
        L2c:
            boolean r0 = cn.jiguang.av.n.a()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L3b
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "No network connection. Give up to start connection thread."
            cn.jiguang.w.f.h(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        L3b:
            android.content.Context r0 = r6.q     // Catch: java.lang.Throwable -> L29
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aq()     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L56
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "[restartNetworkingClient] tcp has close by active"
            cn.jiguang.w.f.e(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        L56:
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L29
            android.content.Context r2 = r6.q     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.b(r2)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L6b
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "[restartNetworkingClient] sdk limit"
            cn.jiguang.w.f.e(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        L6b:
            android.content.Context r0 = r6.q     // Catch: java.lang.Throwable -> L29
            cn.jiguang.e.a r2 = cn.jiguang.e.a.ab()     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L86
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "[restartNetworkingClient] tcp has close by ups.unregister"
            cn.jiguang.w.f.e(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        L86:
            int r0 = r6.f397j     // Catch: java.lang.Throwable -> L29
            r2 = 1005(0x3ed, float:1.408E-42)
            if (r0 == r2) goto L13e
            r2 = 1006(0x3ee, float:1.41E-42)
            if (r0 == r2) goto L13e
            r2 = 1008(0x3f0, float:1.413E-42)
            if (r0 == r2) goto L13e
            r2 = 1009(0x3f1, float:1.414E-42)
            if (r0 != r2) goto L9a
            goto L13e
        L9a:
            int r0 = r6.f396i     // Catch: java.lang.Throwable -> L29
            r2 = 102(0x66, float:1.43E-43)
            if (r0 != r2) goto La9
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "login failed:102,give up start connection thread.reset from next app start"
            cn.jiguang.w.f.k(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        La9:
            boolean r0 = r6.o()     // Catch: java.lang.Throwable -> L29
            r1 = 1
            if (r0 != 0) goto Lb9
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "NetworkingClient is running"
            cn.jiguang.w.f.d(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        Lb9:
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.ab.h> r0 = r6.f395h     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.ab.h r0 = (cn.jiguang.ab.h) r0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto Ld2
            boolean r2 = r0.d()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Ld2
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r2 = "socket is  connecting"
            cn.jiguang.w.f.d(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        Ld2:
            if (r0 == 0) goto Le0
            r0.c()     // Catch: java.lang.Throwable -> Lde
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.ab.h> r0 = r6.f395h     // Catch: java.lang.Throwable -> Lde
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> Lde
            goto Le0
        Lde:
            r0 = move-exception
            goto L125
        Le0:
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r1 = "start to new NetworkingClient"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> Lde
            cn.jiguang.ab.h r0 = new cn.jiguang.ab.h     // Catch: java.lang.Throwable -> Lde
            android.content.Context r1 = r6.q     // Catch: java.lang.Throwable -> Lde
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> Lde
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> Lde
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "JCoreTCPManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lde
            r2.<init>()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r3 = "start to connect ="
            r2.append(r3)     // Catch: java.lang.Throwable -> Lde
            r2.append(r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lde
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> Lde
            r0.b()     // Catch: java.lang.Throwable -> Lde
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.ab.h> r1 = r6.f395h     // Catch: java.lang.Throwable -> Lde
            r1.set(r0)     // Catch: java.lang.Throwable -> Lde
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()     // Catch: java.lang.Throwable -> Lde
            cn.jiguang.ah.a r1 = r6.t     // Catch: java.lang.Throwable -> Lde
            r2 = 2001(0x7d1, float:2.804E-42)
            r3 = 90000(0x15f90, double:4.4466E-319)
            r0.b(r2, r3, r1)     // Catch: java.lang.Throwable -> Lde
            monitor-exit(r6)
            r0 = 3
            return r0
        L125:
            java.lang.String r1 = "JCoreTCPManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "start throwable ="
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            r2.append(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            r0 = 4
            return r0
        L13e:
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "[restartNetworkingClient] registerErrCode >0,registerErrCode:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            int r3 = r6.f397j     // Catch: java.lang.Throwable -> L29
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L29
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L29
            android.content.Context r2 = r6.q     // Catch: java.lang.Throwable -> L29
            int r3 = r6.f397j     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = ""
            r5 = 2002(0x7d2, float:2.805E-42)
            r0.a(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r6)
            return r1
        L167:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    private boolean o() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.ab.h> r0 = r2.f395h
            java.lang.Object r0 = r0.get()
            cn.jiguang.ab.h r0 = (cn.jiguang.ab.h) r0
            if (r0 == 0) goto L1d
            cn.jiguang.ag.a r1 = r0.e()
            if (r1 == 0) goto L1d
            cn.jiguang.ag.a r0 = r0.e()
            boolean r0 = r0.b()
            if (r0 != 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    private boolean p() {
            r9 = this;
            int r0 = r9.v
            r1 = 0
            r2 = 1
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r9.n
            long r3 = r3 - r5
            if (r0 <= 0) goto L1c
            int r0 = r9.v
            int r0 = r0 + (-4)
            long r5 = (long) r0
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1b
            return r2
        L1b:
            return r1
        L1c:
            r5 = 18000(0x4650, double:8.893E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L23
            return r2
        L23:
            return r1
    }

    private void q() {
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.s
            boolean r0 = r0.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "check isBeating status="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r2, r1)
            if (r0 != 0) goto L1f
            return
        L1f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.s
            r1 = 0
            r0.set(r1)
            int r0 = r5.m
            r1 = 1
            int r0 = r0 + r1
            r5.m = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Action - onHeartbeatTimeout - timeoutTimes:"
            r0.append(r3)
            int r3 = r5.m
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.d(r2, r0)
            java.lang.String r0 = "============================================================"
            cn.jiguang.w.f.b(r2, r0)
            cn.jiguang.ab.h r0 = r5.c()
            if (r0 == 0) goto L56
            boolean r0 = r5.o
            if (r0 != 0) goto L56
            java.lang.String r0 = "Is connecting now. Give up to retry."
            cn.jiguang.w.f.d(r2, r0)
            return
        L56:
            boolean r0 = r5.o
            if (r0 == 0) goto L71
            int r0 = r5.m
            if (r0 > r1) goto L71
            java.lang.String r0 = "Already logged in. Give up to retry."
            cn.jiguang.w.f.d(r2, r0)
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r1 = 5000(0x1388, double:2.4703E-320)
            cn.jiguang.ah.a r3 = r5.t
            r4 = 1005(0x3ed, float:1.408E-42)
            r0.b(r4, r1, r3)
            return
        L71:
            r5.l()
            r5.m()
            return
    }

    private void r() {
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.s
            r1 = 1
            r0.set(r1)
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.b(r1)
            android.content.Context r0 = r12.q
            long r2 = cn.jiguang.ab.c.c(r0)
            android.content.Context r0 = r12.q
            long r5 = cn.jiguang.d.a.f(r0)
            int r8 = cn.jiguang.z.b.a
            boolean r10 = cn.jiguang.ad.g.f392e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "heartbeat initPushSdk:"
            r0.append(r4)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "JCoreTCPManager"
            cn.jiguang.w.f.e(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "heartbeat - juid:"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ", flag:"
            r0.append(r4)
            r7 = 1
            r0.append(r7)
            java.lang.String r4 = " ,userType:"
            r0.append(r4)
            r0.append(r8)
            java.lang.String r4 = " ,initPushSdk:"
            r0.append(r4)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r11, r0)
            int r4 = cn.jiguang.internal.JConstants.tcpSessionId
            int r9 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL
            byte[] r0 = cn.jiguang.af.b.a(r2, r4, r5, r7, r8, r9, r10)
            android.content.Context r2 = r12.q
            byte[] r0 = cn.jiguang.af.b.a(r2, r0)
            if (r0 == 0) goto L7e
            cn.jiguang.ab.h r2 = r12.c()
            cn.jiguang.ag.a r2 = r2.e()
            r2.a(r0)
            goto L83
        L7e:
            java.lang.String r0 = "send hb failed:sendData is null"
            cn.jiguang.w.f.j(r11, r0)
        L83:
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r2 = 10000(0x2710, double:4.9407E-320)
            cn.jiguang.ah.a r4 = r12.t
            r0.b(r1, r2, r4)
            return
    }

    private void s() {
            r5 = this;
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r1 = "Action - onHeartbeatSucceed"
            cn.jiguang.w.f.d(r0, r1)
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            android.content.Context r1 = r5.q
            r2 = 0
            java.lang.String r3 = "ack success"
            r4 = 19
            r0.a(r1, r4, r2, r3)
            return
    }

    public synchronized void a(android.content.Context r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.r     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r1.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "hb:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            int r2 = r4.f()     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = ",google:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            r2 = 0
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = ",google pure : "
            r1.append(r3)     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = ",internal:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L79
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r1 = "init tcp manager..."
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L79
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L79
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L79
            android.content.Context r0 = cn.jiguang.av.c.a(r0)     // Catch: java.lang.Throwable -> L79
            r4.q = r0     // Catch: java.lang.Throwable -> L79
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()     // Catch: java.lang.Throwable -> L79
            android.content.Context r1 = r4.q     // Catch: java.lang.Throwable -> L79
            r0.a(r1)     // Catch: java.lang.Throwable -> L79
            cn.jiguang.ad.f r0 = cn.jiguang.ad.f.a()     // Catch: java.lang.Throwable -> L79
            r1 = 1
            r0.a(r5, r1)     // Catch: java.lang.Throwable -> L79
            android.content.Context r5 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L79
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aq()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = cn.jiguang.e.b.a(r5, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L79
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L79
            r4.a(r5)     // Catch: java.lang.Throwable -> L79
            r4.r = r1     // Catch: java.lang.Throwable -> L79
            monitor-exit(r4)
            return
        L79:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L79
            throw r5
    }

    public void a(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            r1.a(r2)
            cn.jiguang.ad.g$a r0 = new cn.jiguang.ad.g$a
            r0.<init>(r1, r2, r3, r4)
            cn.jiguang.z.b.c(r0)
            return
    }

    public void a(android.os.Bundle r12) {
            r11 = this;
            android.content.Context r0 = r11.q
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aq()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "JCoreTCPManager"
            if (r0 == 0) goto L1a
            java.lang.String r12 = "[rtc] tcp has close by active"
            cn.jiguang.w.f.d(r1, r12)
            return
        L1a:
            r0 = 1
            r2 = 0
            if (r12 == 0) goto L8e
            java.lang.String r4 = "force"
            boolean r0 = r12.getBoolean(r4, r0)
            java.lang.String r4 = "delay_time"
            long r4 = r12.getLong(r4, r2)
            java.lang.String r6 = "heartbeat_time_out"
            boolean r7 = r12.containsKey(r6)
            java.lang.String r8 = "heartbeat_time_out_count"
            if (r7 != 0) goto L3b
            boolean r7 = r12.containsKey(r8)
            if (r7 == 0) goto L8f
        L3b:
            java.util.concurrent.atomic.AtomicReference<java.lang.Long> r7 = cn.jiguang.ad.g.f393f
            long r9 = cn.jiguang.ad.g.f391d
            long r9 = r12.getLong(r6, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r7.set(r6)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r6 = cn.jiguang.ad.g.f394g
            int r7 = cn.jiguang.ad.g.f390c
            int r7 = r12.getInt(r8, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.set(r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " update heartbeatTimeOutCount="
            r6.append(r7)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r7 = cn.jiguang.ad.g.f394g
            java.lang.Object r7 = r7.get()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.d(r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " update mHeartbeatTimeOut="
            r6.append(r7)
            java.util.concurrent.atomic.AtomicReference<java.lang.Long> r7 = cn.jiguang.ad.g.f393f
            java.lang.Object r7 = r7.get()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.d(r1, r6)
            goto L8f
        L8e:
            r4 = r2
        L8f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " current use heartbeatTimeOutCount="
            r6.append(r7)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r7 = cn.jiguang.ad.g.f394g
            java.lang.Object r7 = r7.get()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.d(r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " current use  mHeartbeatTimeOut="
            r6.append(r7)
            java.util.concurrent.atomic.AtomicReference<java.lang.Long> r7 = cn.jiguang.ad.g.f393f
            java.lang.Object r7 = r7.get()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.d(r1, r6)
            boolean r6 = r11.o()
            if (r6 == 0) goto Ld2
            java.lang.String r12 = "[rtc] rtc restartNetworkingClient"
            cn.jiguang.w.f.d(r1, r12)
            r11.n()
            return
        Ld2:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto Lda
            r11.c(r12)
            goto Lfc
        Lda:
            r12 = 1004(0x3ec, float:1.407E-42)
            r2 = 1005(0x3ed, float:1.408E-42)
            if (r0 == 0) goto Lee
            cn.jiguang.ah.b r3 = cn.jiguang.ah.b.a()
            r3.b(r2)
            cn.jiguang.ah.b r3 = cn.jiguang.ah.b.a()
            r3.b(r12)
        Lee:
            cn.jiguang.ah.b r3 = cn.jiguang.ah.b.a()
            if (r0 == 0) goto Lf5
            goto Lf7
        Lf5:
            r12 = 1005(0x3ed, float:1.408E-42)
        Lf7:
            cn.jiguang.ah.a r2 = r11.t
            r3.b(r12, r4, r2)
        Lfc:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "send rtc force="
            r12.append(r2)
            r12.append(r0)
            java.lang.String r0 = " delay="
            r12.append(r0)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            cn.jiguang.w.f.f(r1, r12)
            return
    }

    public void a(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "JCoreTCPManager"
            if (r4 == 0) goto L84
            java.lang.String r1 = "use_ssp"
            boolean r1 = r4.optBoolean(r1)     // Catch: java.lang.Throwable -> L21
            r3.u = r1     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L84
            java.lang.String r1 = "hb_interval"
            int r4 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L21
            if (r4 > 0) goto L23
            java.lang.String r4 = "hb_interval is less than 0, will use 15s"
            cn.jiguang.w.f.i(r0, r4)     // Catch: java.lang.Throwable -> L21
            r4 = 15
            r3.v = r4     // Catch: java.lang.Throwable -> L21
            goto L68
        L21:
            r4 = move-exception
            goto L70
        L23:
            int r1 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL     // Catch: java.lang.Throwable -> L21
            int r1 = r1 / 2
            if (r4 < r1) goto L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r4.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "hb_interval is more than "
            r4.append(r1)     // Catch: java.lang.Throwable -> L21
            int r1 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL     // Catch: java.lang.Throwable -> L21
            r4.append(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = ", will use "
            r4.append(r1)     // Catch: java.lang.Throwable -> L21
            int r1 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL     // Catch: java.lang.Throwable -> L21
            r4.append(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "s"
            r4.append(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L21
            cn.jiguang.w.f.i(r0, r4)     // Catch: java.lang.Throwable -> L21
            int r4 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL     // Catch: java.lang.Throwable -> L21
        L50:
            r3.v = r4     // Catch: java.lang.Throwable -> L21
            goto L68
        L53:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "set ssp heartbeat interval:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            r1.append(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L21
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L21
            goto L50
        L68:
            int r4 = r3.v     // Catch: java.lang.Throwable -> L21
            if (r4 <= 0) goto L84
            r3.i()     // Catch: java.lang.Throwable -> L21
            return
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[TcpManager] handleCtrlHeartBeatCmd error:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
        L84:
            return
    }

    public void b() {
            r2 = this;
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.b(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r2.n = r0
            r0 = 0
            r2.m = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.s
            r1.set(r0)
            java.lang.String r0 = "JCoreTCPManager"
            java.lang.String r1 = "update rtc state"
            cn.jiguang.w.f.f(r0, r1)
            return
    }

    public void b(android.os.Bundle r7) {
            r6 = this;
            android.content.Context r0 = r6.q
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aq()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "JCoreTCPManager"
            if (r0 == 0) goto L1a
            java.lang.String r7 = "[netWorkChanged] tcp has close by active"
            cn.jiguang.w.f.i(r1, r7)
            return
        L1a:
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r2 = 1006(0x3ee, float:1.41E-42)
            r0.b(r2)
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            r3 = 1007(0x3ef, float:1.411E-42)
            r0.b(r3)
            java.lang.String r0 = "connected"
            r4 = 0
            boolean r7 = r7.getBoolean(r0, r4)
            r4 = 3000(0xbb8, double:1.482E-320)
            if (r7 == 0) goto L50
            java.lang.String r7 = "Handle connected state."
            cn.jiguang.w.f.c(r1, r7)
            boolean r7 = r6.o()
            if (r7 == 0) goto L46
            r6.n()
            return
        L46:
            cn.jiguang.ah.b r7 = cn.jiguang.ah.b.a()
            cn.jiguang.ah.a r0 = r6.t
            r7.b(r2, r4, r0)
            return
        L50:
            java.lang.String r7 = "Handle disconnected state."
            cn.jiguang.w.f.c(r1, r7)
            cn.jiguang.ah.b r7 = cn.jiguang.ah.b.a()
            cn.jiguang.ah.a r0 = r6.t
            r7.b(r3, r4, r0)
            return
    }

    public cn.jiguang.ab.h c() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.ab.h> r0 = r1.f395h
            java.lang.Object r0 = r0.get()
            cn.jiguang.ab.h r0 = (cn.jiguang.ab.h) r0
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.o
            return r0
    }

    public void e() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateHeartBeatInterval  -- current HeartBeatInterval = "
            r0.append(r1)
            int r1 = r4.w
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r1, r0)
            int r0 = r4.v
            if (r0 <= 0) goto L34
            int r1 = r4.w
            if (r1 != 0) goto L25
            int r0 = r0 * 2
            r4.w = r0
            return
        L25:
            int r0 = r1 * 2
            int r2 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL
            int r3 = r2 / 2
            if (r0 >= r3) goto L32
            int r1 = r1 * 2
            r4.w = r1
            return
        L32:
            r4.w = r2
        L34:
            return
    }

    public int f() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getHeartBeatInterval  -- current HeartBeatInterval = "
            r0.append(r1)
            int r1 = r2.w
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r1, r0)
            int r0 = r2.v
            if (r0 <= 0) goto L22
            int r1 = r2.w
            if (r1 != 0) goto L21
            return r0
        L21:
            return r1
        L22:
            int r0 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL
            return r0
    }

    public int g() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getNextHbIntervalForLog  -- current HeartBeatInterval = "
            r0.append(r1)
            int r1 = r4.w
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r1, r0)
            int r0 = r4.v
            if (r0 <= 0) goto L38
            int r1 = r4.w
            if (r1 != 0) goto L2c
            int r1 = r0 * 2
            int r2 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL
            int r3 = r2 / 2
            if (r1 >= r3) goto L2b
            int r0 = r0 * 2
            return r0
        L2b:
            return r2
        L2c:
            int r0 = r1 * 2
            int r2 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL
            int r3 = r2 / 2
            if (r0 >= r3) goto L37
            int r1 = r1 * 2
            return r1
        L37:
            return r2
        L38:
            int r0 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL
            return r0
    }

    public int h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getAlarmDelay  -- current HeartBeatInterval = "
            r0.append(r1)
            int r1 = r2.w
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreTCPManager"
            cn.jiguang.w.f.c(r1, r0)
            int r0 = r2.v
            if (r0 <= 0) goto L26
            int r1 = r2.w
            if (r1 != 0) goto L23
            int r0 = r0 + 5
            return r0
        L23:
            int r1 = r1 + 5
            return r1
        L26:
            int r0 = cn.jiguang.internal.JConstants.DEFAULT_ALARM_DELAY
            return r0
    }

    public void i() {
            r1 = this;
            r0 = 0
            r1.w = r0
            cn.jiguang.ad.f r0 = cn.jiguang.ad.f.a()
            r0.b()
            return
    }
}
