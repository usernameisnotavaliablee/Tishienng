package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class d implements com.beizi.fusion.c.a, java.util.Observer {
    protected static android.content.Context a;
    private static boolean r;
    private int A;
    private int B;
    private int C;
    private java.util.Timer D;
    private boolean E;
    private com.beizi.fusion.events.b F;
    private long G;
    private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> H;
    private boolean I;
    private com.beizi.fusion.tool.z J;
    private com.beizi.fusion.c.d.a K;
    private boolean L;
    private boolean M;
    private com.beizi.fusion.model.AdSpacesBean N;
    private com.beizi.fusion.events.a O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private long U;
    private java.util.Map<java.lang.String, java.lang.Object> V;
    private java.util.TimerTask W;
    private java.lang.String X;

    /* renamed from: b, reason: collision with root package name */
    protected android.content.Context f7568b;

    /* renamed from: c, reason: collision with root package name */
    protected com.beizi.fusion.events.EventBean f7569c;

    /* renamed from: d, reason: collision with root package name */
    protected android.view.ViewGroup f7570d;

    /* renamed from: e, reason: collision with root package name */
    protected java.lang.String f7571e;

    /* renamed from: f, reason: collision with root package name */
    protected long f7572f;

    /* renamed from: g, reason: collision with root package name */
    protected android.view.View f7573g;

    /* renamed from: h, reason: collision with root package name */
    protected com.beizi.fusion.a f7574h;

    /* renamed from: i, reason: collision with root package name */
    protected com.beizi.fusion.work.a f7575i;

    /* renamed from: j, reason: collision with root package name */
    protected java.util.Map<java.lang.String, com.beizi.fusion.work.a> f7576j;

    /* renamed from: k, reason: collision with root package name */
    protected java.util.ArrayList<com.beizi.fusion.c.c> f7577k;
    protected boolean l;
    protected java.lang.String m;
    protected boolean n;
    protected boolean o;
    protected com.beizi.fusion.work.a p;

    @android.annotation.SuppressLint({"HandlerLeak"})
    protected android.os.Handler q;
    private boolean s;
    private com.beizi.fusion.c.d t;
    private com.beizi.fusion.model.AdSpacesBean u;
    private long v;
    private long w;
    private long x;
    private volatile int y;
    private int z;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.beizi.fusion.c.d a;

        a(com.beizi.fusion.c.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                if (r4 != 0) goto L3
                goto L69
            L3:
                java.lang.String r3 = r4.getAction()     // Catch: java.lang.Exception -> L69
                java.lang.String r0 = "updateResult"
                r1 = 0
                int r4 = r4.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L69
                com.beizi.fusion.c.d r0 = r2.a     // Catch: java.lang.Exception -> L69
                r1 = 1
                com.beizi.fusion.c.d.a(r0, r1)     // Catch: java.lang.Exception -> L69
                java.lang.String r0 = "com.ad.action.UPDATE_CONFIG_SUCCESS"
                boolean r3 = android.text.TextUtils.equals(r3, r0)     // Catch: java.lang.Exception -> L69
                if (r3 == 0) goto L64
                r3 = 0
                if (r4 != r1) goto L3d
                com.beizi.fusion.c.d r4 = r2.a     // Catch: java.lang.Exception -> L69
                java.util.Timer r4 = com.beizi.fusion.c.d.i(r4)     // Catch: java.lang.Exception -> L69
                if (r4 == 0) goto L35
                com.beizi.fusion.c.d r4 = r2.a     // Catch: java.lang.Exception -> L69
                java.util.Timer r4 = com.beizi.fusion.c.d.i(r4)     // Catch: java.lang.Exception -> L69
                r4.cancel()     // Catch: java.lang.Exception -> L69
                com.beizi.fusion.c.d r4 = r2.a     // Catch: java.lang.Exception -> L69
                com.beizi.fusion.c.d.a(r4, r3)     // Catch: java.lang.Exception -> L69
            L35:
                com.beizi.fusion.c.d r3 = r2.a     // Catch: java.lang.Exception -> L69
                android.view.ViewGroup r4 = r3.f7570d     // Catch: java.lang.Exception -> L69
                r3.a(r4)     // Catch: java.lang.Exception -> L69
                goto L64
            L3d:
                if (r4 != 0) goto L64
                com.beizi.fusion.c.d r4 = r2.a     // Catch: java.lang.Exception -> L69
                boolean r4 = com.beizi.fusion.c.d.j(r4)     // Catch: java.lang.Exception -> L69
                if (r4 == 0) goto L64
                com.beizi.fusion.c.d r4 = r2.a     // Catch: java.lang.Exception -> L69
                java.util.Timer r4 = com.beizi.fusion.c.d.i(r4)     // Catch: java.lang.Exception -> L69
                if (r4 == 0) goto L5d
                com.beizi.fusion.c.d r4 = r2.a     // Catch: java.lang.Exception -> L69
                java.util.Timer r4 = com.beizi.fusion.c.d.i(r4)     // Catch: java.lang.Exception -> L69
                r4.cancel()     // Catch: java.lang.Exception -> L69
                com.beizi.fusion.c.d r4 = r2.a     // Catch: java.lang.Exception -> L69
                com.beizi.fusion.c.d.a(r4, r3)     // Catch: java.lang.Exception -> L69
            L5d:
                com.beizi.fusion.c.d r3 = r2.a     // Catch: java.lang.Exception -> L69
                android.view.ViewGroup r4 = r3.f7570d     // Catch: java.lang.Exception -> L69
                r3.a(r4)     // Catch: java.lang.Exception -> L69
            L64:
                com.beizi.fusion.c.d r3 = r2.a     // Catch: java.lang.Exception -> L69
                com.beizi.fusion.c.d.d(r3)     // Catch: java.lang.Exception -> L69
            L69:
                return
        }
    }

    static {
            return
    }

    public d(android.content.Context r5, java.lang.String r6, com.beizi.fusion.a r7, long r8) {
            r4 = this;
            r4.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r4.f7576j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f7577k = r0
            r0 = 0
            r4.l = r0
            r4.s = r0
            r1 = 500(0x1f4, double:2.47E-321)
            r4.v = r1
            r1 = 100
            r4.w = r1
            r4.y = r0
            r4.z = r0
            r4.A = r0
            r1 = 1
            r4.B = r1
            r2 = 2
            r4.C = r2
            r3 = 0
            r4.D = r3
            r4.E = r0
            r4.I = r0
            r4.M = r0
            r4.N = r3
            r4.O = r3
            r4.n = r0
            r4.P = r0
            r4.Q = r1
            r4.R = r2
            r4.o = r0
            r4.S = r0
            r4.T = r0
            r4.p = r3
            com.beizi.fusion.c.d$1 r0 = new com.beizi.fusion.c.d$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r4, r1)
            r4.q = r0
            r4.W = r3
            if (r5 != 0) goto L5c
            java.lang.String r5 = "Illegal Argument: context is null"
            com.beizi.fusion.tool.ap.b(r5)
            goto L73
        L5c:
            r4.f7568b = r5
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            com.beizi.fusion.c.d.a = r5
            android.content.Context r5 = r4.f7568b
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 != 0) goto L73
            java.lang.String r5 = "Illegal Argument: context is not Activity context"
            com.beizi.fusion.tool.ap.b(r5)
        L73:
            r4.m = r6
            r4.f7574h = r7
            r4.f7572f = r8
            r4.t = r4
            android.content.Context r5 = com.beizi.fusion.c.d.a
            if (r5 != 0) goto L86
            if (r7 == 0) goto L86
            r5 = 10132(0x2794, float:1.4198E-41)
            r4.a(r5)
        L86:
            return
    }

    private void A() {
            r3 = this;
            com.beizi.fusion.tool.z r0 = r3.J
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = com.beizi.fusion.c.d.a
            com.beizi.fusion.tool.z r0 = com.beizi.fusion.tool.z.a(r0)
            r3.J = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "com.ad.action.UPDATE_CONFIG_SUCCESS"
            r0.<init>(r1)
            com.beizi.fusion.c.d$a r1 = new com.beizi.fusion.c.d$a
            r1.<init>(r3)
            r3.K = r1
            com.beizi.fusion.tool.z r2 = r3.J
            r2.a(r1, r0)
            return
    }

    private void B() {
            r7 = this;
            boolean r0 = r7.L     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L5
            goto L4c
        L5:
            r7.A()     // Catch: java.lang.Exception -> L4c
            android.content.Context r0 = com.beizi.fusion.c.d.a     // Catch: java.lang.Exception -> L4c
            com.beizi.fusion.update.b r0 = com.beizi.fusion.update.b.a(r0)     // Catch: java.lang.Exception -> L4c
            r1 = 5
            r0.b(r1)     // Catch: java.lang.Exception -> L4c
            java.util.Timer r0 = r7.D     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L1d
            java.util.Timer r0 = new java.util.Timer     // Catch: java.lang.Exception -> L4c
            r0.<init>()     // Catch: java.lang.Exception -> L4c
            r7.D = r0     // Catch: java.lang.Exception -> L4c
        L1d:
            java.util.TimerTask r0 = r7.W     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L28
            com.beizi.fusion.c.d$2 r0 = new com.beizi.fusion.c.d$2     // Catch: java.lang.Exception -> L4c
            r0.<init>(r7)     // Catch: java.lang.Exception -> L4c
            r7.W = r0     // Catch: java.lang.Exception -> L4c
        L28:
            java.util.Timer r0 = r7.D     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L4c
            java.util.TimerTask r0 = r7.W     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L4c
            long r0 = r7.f7572f     // Catch: java.lang.Exception -> L4c
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L39
            r0 = r2
        L39:
            long r2 = r7.x     // Catch: java.lang.Exception -> L4c
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L45
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Exception -> L4c
        L45:
            java.util.Timer r2 = r7.D     // Catch: java.lang.Exception -> L4c
            java.util.TimerTask r3 = r7.W     // Catch: java.lang.Exception -> L4c
            r2.schedule(r3, r0)     // Catch: java.lang.Exception -> L4c
        L4c:
            return
    }

    private void C() {
            r2 = this;
            com.beizi.fusion.tool.z r0 = r2.J     // Catch: java.lang.Exception -> Lb
            if (r0 == 0) goto Lb
            com.beizi.fusion.c.d$a r1 = r2.K     // Catch: java.lang.Exception -> Lb
            if (r1 == 0) goto Lb
            r0.a(r1)     // Catch: java.lang.Exception -> Lb
        Lb:
            return
    }

    private void D() {
            r3 = this;
            com.beizi.fusion.events.EventBean r0 = r3.f7569c
            if (r0 == 0) goto L2b
            java.lang.String r1 = r3.f7571e
            r0.setReqId(r1)
            r3.c()
            com.beizi.fusion.events.EventBean r0 = r3.f7569c
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()
            java.lang.String r1 = r1.b()
            r0.setAppId(r1)
            com.beizi.fusion.events.EventBean r0 = r3.f7569c
            java.lang.String r1 = r3.m
            r0.setSpaceId(r1)
            com.beizi.fusion.events.EventBean r0 = r3.f7569c
            long r1 = r3.f7572f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setReserveTime(r1)
        L2b:
            return
    }

    private boolean E() {
            r6 = this;
            com.beizi.fusion.model.AdSpacesBean r0 = r6.u
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.beizi.fusion.model.AdSpacesBean$BidBean r0 = r0.getBid()
            if (r0 == 0) goto L37
            int r2 = r0.getReserveFRWTime()
            long r2 = (long) r2
            r6.v = r2
            int r2 = r0.getReserveTime()
            long r2 = (long) r2
            r6.w = r2
            int r0 = r0.getTimeOut()
            long r2 = (long) r0
            r6.x = r2
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            boolean r0 = r0.j()
            if (r0 == 0) goto L37
            long r2 = r6.x
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L37
            r2 = 800(0x320, double:3.953E-321)
            r6.x = r2
        L37:
            long r2 = r6.f7572f
            long r4 = r6.w
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L51
            long r4 = r6.v
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L49
            r6.Q()
            goto L4d
        L49:
            int r0 = r6.B
            r6.z = r0
        L4d:
            r6.R()
            return r1
        L51:
            r0 = 10120(0x2788, float:1.4181E-41)
            r6.a(r0)
            com.beizi.fusion.events.b r0 = r6.F
            com.beizi.fusion.events.a$h r0 = r0.b
            r1 = 7
            r0.a(r1)
            r0 = 1
            return r0
    }

    private void F() {
            r2 = this;
            android.content.Context r0 = com.beizi.fusion.c.d.a
            java.lang.String r1 = r2.m
            com.beizi.fusion.tool.s.b(r0, r1)
            return
    }

    private void G() {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto L48
            com.beizi.fusion.events.a$h r1 = r0.b
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$k r1 = r0.c
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$g r1 = r0.d
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$d r1 = r0.e
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$e r1 = r0.f
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$f r1 = r0.g
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$c r1 = r0.h
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$b r1 = r0.i
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r1 = r0.j
            r1.addObserver(r0)
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$a r1 = r0.k
            r1.addObserver(r0)
        L48:
            return
    }

    private void H() {
            r3 = this;
            com.beizi.fusion.model.AdSpacesBean r0 = r3.u
            if (r0 == 0) goto La0
            java.lang.String r0 = r0.getAdType()
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1999289321: goto L70;
                case -1842536857: goto L65;
                case -1372958932: goto L5a;
                case -370591475: goto L4f;
                case -43721614: goto L44;
                case 252355794: goto L39;
                case 658985344: goto L2e;
                case 1723213558: goto L23;
                case 1951953708: goto L15;
                default: goto L13;
            }
        L13:
            goto L7a
        L15:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f
            goto L7a
        L1f:
            r2 = 8
            goto L7a
        L23:
            java.lang.String r1 = "REGIONALNATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L7a
        L2c:
            r2 = 7
            goto L7a
        L2e:
            java.lang.String r1 = "FULLSCREENVIDEO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L7a
        L37:
            r2 = 6
            goto L7a
        L39:
            java.lang.String r1 = "INTERACTIVECARD"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L7a
        L42:
            r2 = 5
            goto L7a
        L44:
            java.lang.String r1 = "DRAWFLOW"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L7a
        L4d:
            r2 = 4
            goto L7a
        L4f:
            java.lang.String r1 = "REWARDEDVIDEO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58
            goto L7a
        L58:
            r2 = 3
            goto L7a
        L5a:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L7a
        L63:
            r2 = 2
            goto L7a
        L65:
            java.lang.String r1 = "SPLASH"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e
            goto L7a
        L6e:
            r2 = 1
            goto L7a
        L70:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L79
            goto L7a
        L79:
            r2 = 0
        L7a:
            switch(r2) {
                case 0: goto L97;
                case 1: goto L94;
                case 2: goto L91;
                case 3: goto L8e;
                case 4: goto L8b;
                case 5: goto L88;
                case 6: goto L85;
                case 7: goto L82;
                case 8: goto L7f;
                default: goto L7d;
            }
        L7d:
            r0 = 0
            goto L99
        L7f:
            java.lang.String r0 = "4"
            goto L99
        L82:
            java.lang.String r0 = "12"
            goto L99
        L85:
            java.lang.String r0 = "6"
            goto L99
        L88:
            java.lang.String r0 = "13"
            goto L99
        L8b:
            java.lang.String r0 = "7"
            goto L99
        L8e:
            java.lang.String r0 = "1"
            goto L99
        L91:
            java.lang.String r0 = "3"
            goto L99
        L94:
            java.lang.String r0 = "2"
            goto L99
        L97:
            java.lang.String r0 = "5"
        L99:
            com.beizi.fusion.events.EventBean r1 = r3.f7569c
            if (r1 == 0) goto La0
            r1.setAdType(r0)
        La0:
            return
    }

    private boolean I() {
            r2 = this;
            boolean r0 = r2.T
            if (r0 == 0) goto L14
            com.beizi.fusion.work.a r0 = r2.p
            if (r0 == 0) goto L12
            if (r0 == 0) goto L14
            com.beizi.fusion.e.a r0 = r0.h()
            com.beizi.fusion.e.a r1 = com.beizi.fusion.e.a.a
            if (r0 != r1) goto L14
        L12:
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    private boolean J() {
            r3 = this;
            java.util.Map r0 = r3.n()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.beizi.fusion.work.a r1 = (com.beizi.fusion.work.a) r1
            com.beizi.fusion.e.a r1 = r1.h()
            com.beizi.fusion.e.a r2 = com.beizi.fusion.e.a.a
            if (r1 != r2) goto Lc
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    private synchronized void K() {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayList<com.beizi.fusion.c.c> r0 = r1.f7577k     // Catch: java.lang.Throwable -> L8
            r0.clear()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    private void L() {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto L14
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            if (r0 != 0) goto L14
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            r1 = 1
            r0.a(r1)
        L14:
            return
    }

    private void M() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.F
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mManagerObserver.mManagerResultStatus.getStatus() = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.F
            com.beizi.fusion.events.a$j r1 = r1.j
            int r1 = r1.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.b(r1, r0)
        L22:
            com.beizi.fusion.events.b r0 = r3.F
            if (r0 == 0) goto L4c
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L45
            com.beizi.fusion.events.b r0 = r3.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 2
            if (r0 == r1) goto L45
            com.beizi.fusion.events.b r0 = r3.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            if (r0 != r2) goto L4c
        L45:
            com.beizi.fusion.events.b r0 = r3.F
            com.beizi.fusion.events.a$j r0 = r0.j
            r0.a(r2)
        L4c:
            return
    }

    private void N() {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mManagerObserver.mManagerResultStatus.getStatus() = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r2.F
            com.beizi.fusion.events.a$j r1 = r1.j
            int r1 = r1.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.b(r1, r0)
        L22:
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto L4d
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 3
            if (r0 == r1) goto L45
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 1
            if (r0 == r1) goto L45
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 2
            if (r0 != r1) goto L4d
        L45:
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            r1 = 4
            r0.a(r1)
        L4d:
            return
    }

    private void O() {
            r4 = this;
            com.beizi.fusion.work.a r0 = r4.f7575i     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto L5
            goto L46
        L5:
            com.beizi.fusion.work.a r0 = r4.P()     // Catch: java.lang.Exception -> L46
            com.beizi.fusion.model.ChannelBidResult r1 = new com.beizi.fusion.model.ChannelBidResult     // Catch: java.lang.Exception -> L46
            r1.<init>()     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L26
            double r2 = r4.e(r0)     // Catch: java.lang.Exception -> L46
            r1.setEcpm(r2)     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = r0.f()     // Catch: java.lang.Exception -> L46
            r1.setChannelName(r2)     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = r0.g()     // Catch: java.lang.Exception -> L46
            r1.setBidType(r0)     // Catch: java.lang.Exception -> L46
            goto L41
        L26:
            com.beizi.fusion.work.a r0 = r4.f7575i     // Catch: java.lang.Exception -> L46
            double r2 = r4.e(r0)     // Catch: java.lang.Exception -> L46
            r1.setEcpm(r2)     // Catch: java.lang.Exception -> L46
            com.beizi.fusion.work.a r0 = r4.f7575i     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = r0.f()     // Catch: java.lang.Exception -> L46
            r1.setChannelName(r0)     // Catch: java.lang.Exception -> L46
            com.beizi.fusion.work.a r0 = r4.f7575i     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = r0.g()     // Catch: java.lang.Exception -> L46
            r1.setBidType(r0)     // Catch: java.lang.Exception -> L46
        L41:
            com.beizi.fusion.work.a r0 = r4.f7575i     // Catch: java.lang.Exception -> L46
            r0.a(r1)     // Catch: java.lang.Exception -> L46
        L46:
            return
    }

    private com.beizi.fusion.work.a P() {
            r10 = this;
            r0 = 0
            com.beizi.fusion.work.a r1 = r10.f7575i     // Catch: java.lang.Exception -> La4
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r1.j()     // Catch: java.lang.Exception -> La4
            if (r1 != 0) goto La
            return r0
        La:
            java.util.Map r2 = r10.n()     // Catch: java.lang.Exception -> La4
            if (r2 == 0) goto La4
            int r3 = r2.size()     // Catch: java.lang.Exception -> La4
            if (r3 <= 0) goto La4
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Exception -> La4
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> La4
            r3 = r0
        L1f:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto La3
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> La4
            com.beizi.fusion.work.a r4 = (com.beizi.fusion.work.a) r4     // Catch: java.lang.Exception -> La4
            if (r4 != 0) goto L2e
            goto L1f
        L2e:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r5 = r4.j()     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto L1f
            java.lang.String r6 = r5.getBuyerSpaceUuId()     // Catch: java.lang.Exception -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> La4
            if (r6 != 0) goto L57
            java.lang.String r6 = r1.getBuyerSpaceUuId()     // Catch: java.lang.Exception -> La4
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> La4
            if (r6 != 0) goto L57
            java.lang.String r5 = r5.getBuyerSpaceUuId()     // Catch: java.lang.Exception -> La4
            java.lang.String r6 = r1.getBuyerSpaceUuId()     // Catch: java.lang.Exception -> La4
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto L57
            goto L1f
        L57:
            com.beizi.fusion.e.a r5 = r4.h()     // Catch: java.lang.Exception -> La4
            com.beizi.fusion.e.a r6 = com.beizi.fusion.e.a.f7608b     // Catch: java.lang.Exception -> La4
            if (r5 == r6) goto L60
            goto L1f
        L60:
            java.lang.String r5 = "BeiZis"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r6.<init>()     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = "handleSendWinNotice ---getSecondAdWorker---"
            r6.append(r7)     // Catch: java.lang.Exception -> La4
            com.beizi.fusion.e.a r7 = r4.h()     // Catch: java.lang.Exception -> La4
            r6.append(r7)     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = "---"
            r6.append(r7)     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = r4.f()     // Catch: java.lang.Exception -> La4
            r6.append(r7)     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = ";getPrice:"
            r6.append(r7)     // Catch: java.lang.Exception -> La4
            double r7 = r10.e(r4)     // Catch: java.lang.Exception -> La4
            r6.append(r7)     // Catch: java.lang.Exception -> La4
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> La4
            com.beizi.fusion.tool.aa.a(r5, r6)     // Catch: java.lang.Exception -> La4
            if (r3 != 0) goto L96
        L94:
            r3 = r4
            goto L1f
        L96:
            double r5 = r10.e(r4)     // Catch: java.lang.Exception -> La4
            double r7 = r10.e(r3)     // Catch: java.lang.Exception -> La4
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L1f
            goto L94
        La3:
            return r3
        La4:
            return r0
    }

    private void Q() {
            r8 = this;
            android.os.Handler r0 = r8.q
            if (r0 == 0) goto L24
            long r0 = r8.f7572f
            long r2 = r8.v
            long r0 = r0 - r2
            long r2 = r8.x
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L18
            r6 = 50
            long r2 = r2 - r6
            long r0 = java.lang.Math.min(r0, r2)
        L18:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L1e
            r0 = 100
        L1e:
            android.os.Handler r2 = r8.q
            r3 = 1
            r2.sendEmptyMessageDelayed(r3, r0)
        L24:
            return
    }

    private void R() {
            r7 = this;
            android.os.Handler r0 = r7.q
            if (r0 == 0) goto L21
            long r0 = r7.f7572f
            long r2 = r7.w
            long r0 = r0 - r2
            long r2 = r7.x
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L15
            long r0 = java.lang.Math.min(r0, r2)
        L15:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L1b
            r0 = 1000(0x3e8, double:4.94E-321)
        L1b:
            android.os.Handler r2 = r7.q
            r3 = 2
            r2.sendEmptyMessageDelayed(r3, r0)
        L21:
            return
    }

    static /* synthetic */ int a(com.beizi.fusion.c.d r0) {
            int r0 = r0.B
            return r0
    }

    static /* synthetic */ int a(com.beizi.fusion.c.d r0, int r1) {
            r0.z = r1
            return r1
    }

    private int a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r7, com.beizi.fusion.model.AdSpacesBean.BuyerBean r8) {
            r6 = this;
            if (r7 == 0) goto Lb0
            if (r8 != 0) goto L6
            goto Lb0
        L6:
            java.lang.String r8 = r8.getBuyerSpaceUuId()
            com.beizi.fusion.events.b r0 = r6.F
            com.beizi.fusion.events.a$d r0 = r0.e
            int r0 = r0.a(r8)
            r1 = 3
            if (r0 != r1) goto La7
            com.beizi.fusion.events.b r0 = r6.F
            com.beizi.fusion.events.a$e r0 = r0.f
            r1 = 1
            r0.a(r8, r1)
            com.beizi.fusion.events.b r0 = r6.F
            com.beizi.fusion.events.a$e r0 = r0.f
            int r0 = r0.a(r8)
            if (r0 != r1) goto La7
            long r0 = r6.f7572f
            long r2 = r7.getSleepTime()
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r4
            long r4 = r6.G
            long r2 = r2 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L42
            com.beizi.fusion.events.b r7 = r6.F
            com.beizi.fusion.events.a$e r7 = r7.f
            r0 = 4
            r7.a(r8, r0)
            return r0
        L42:
            com.beizi.fusion.events.b r0 = r6.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 2
            if (r0 != r1) goto L56
            com.beizi.fusion.events.b r7 = r6.F
            com.beizi.fusion.events.a$e r7 = r7.f
            r0 = 6
            r7.a(r8, r0)
            return r0
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "mUsableTime = "
            r0.append(r2)
            long r2 = r6.f7572f
            r0.append(r2)
            java.lang.String r2 = " forwardBean.getSleepTime() + System.currentTimeMillis() - mEnterRequestMethodTime = "
            r0.append(r2)
            long r2 = r7.getSleepTime()
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r4
            long r4 = r6.G
            long r2 = r2 - r4
            r0.append(r2)
            java.lang.String r2 = ",forwardBean.getSleepTime() = "
            r0.append(r2)
            long r2 = r7.getSleepTime()
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r0, r7)
            com.beizi.fusion.events.b r7 = r6.F
            boolean r7 = r7.c()
            if (r7 == 0) goto L9f
            com.beizi.fusion.events.b r7 = r6.F
            com.beizi.fusion.events.a$e r7 = r7.f
            r0 = -1
            r7.a(r8, r0)
            return r0
        L9f:
            com.beizi.fusion.events.b r7 = r6.F
            com.beizi.fusion.events.a$e r7 = r7.f
            r7.a(r8, r1)
            return r1
        La7:
            com.beizi.fusion.events.b r7 = r6.F
            com.beizi.fusion.events.a$e r7 = r7.f
            r0 = -2
            r7.a(r8, r0)
            return r0
        Lb0:
            r7 = 0
            return r7
    }

    @androidx.annotation.NonNull
    private com.beizi.fusion.c.e a(java.lang.String r3, com.beizi.fusion.work.a r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "comparePrices handleCompeteToDetermine worker:"
            r0.append(r1)
            java.lang.String r1 = r4.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            r2.f7575i = r4
            com.beizi.fusion.events.b r4 = r2.F
            com.beizi.fusion.events.a$c r4 = r4.h
            r0 = 2
            r4.a(r3, r0)
            r2.z()
            com.beizi.fusion.c.e r3 = com.beizi.fusion.c.e.f7581c
            return r3
    }

    @androidx.annotation.NonNull
    private com.beizi.fusion.c.e a(java.lang.String r2, com.beizi.fusion.work.a r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.E
            if (r0 != 0) goto L12
            r1.a(r3, r4)
            r1.y()
            r1.z()
            com.beizi.fusion.c.e r2 = r1.l(r2)
            return r2
        L12:
            r4 = 1
            r1.b(r3, r4)
            com.beizi.fusion.c.e r2 = r1.m(r2)
            return r2
    }

    static /* synthetic */ com.beizi.fusion.events.a a(com.beizi.fusion.c.d r0, com.beizi.fusion.events.a r1) {
            r0.O = r1
            return r1
    }

    static /* synthetic */ com.beizi.fusion.events.b a(com.beizi.fusion.c.d r0, com.beizi.fusion.events.b r1) {
            r0.F = r1
            return r1
    }

    static /* synthetic */ com.beizi.fusion.model.AdSpacesBean a(com.beizi.fusion.c.d r0, com.beizi.fusion.model.AdSpacesBean r1) {
            r0.u = r1
            return r1
    }

    private java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> a(com.beizi.fusion.model.AdSpacesBean.ComponentBean r2, java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> r3, boolean r4) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 != 0) goto L42
            com.beizi.fusion.model.AdSpacesBean r4 = r1.u
            if (r4 == 0) goto L42
            com.beizi.fusion.model.AdSpacesBean$BidBean r4 = r4.getBid()
            if (r4 == 0) goto L42
            com.beizi.fusion.model.AdSpacesBean r4 = r1.u
            com.beizi.fusion.model.AdSpacesBean$BidComponent r4 = r4.getBidComponent()
            if (r4 == 0) goto L42
            com.beizi.fusion.model.AdSpacesBean r4 = r1.u
            com.beizi.fusion.model.AdSpacesBean$BidComponent r4 = r4.getBidComponent()
            java.util.List r4 = r4.getBidList()
            if (r4 == 0) goto L42
            com.beizi.fusion.model.AdSpacesBean r4 = r1.u
            com.beizi.fusion.model.AdSpacesBean$BidComponent r4 = r4.getBidComponent()
            java.util.List r4 = r4.getBidList()
            int r4 = r4.size()
            if (r4 <= 0) goto L42
            com.beizi.fusion.model.AdSpacesBean r4 = r1.u
            com.beizi.fusion.model.AdSpacesBean$BidComponent r4 = r4.getBidComponent()
            java.util.List r4 = r4.getBidList()
            r0.addAll(r4)
        L42:
            com.beizi.fusion.model.AdSpacesBean r4 = r1.u
            if (r4 == 0) goto L5b
            if (r2 == 0) goto L5b
            java.lang.String r4 = r1.g()
            java.util.List r2 = com.beizi.fusion.e.b.a(r2, r3, r4)
            if (r2 == 0) goto L5b
            int r3 = r2.size()
            if (r3 <= 0) goto L5b
            r0.addAll(r2)
        L5b:
            return r0
    }

    static /* synthetic */ java.util.Timer a(com.beizi.fusion.c.d r0, java.util.Timer r1) {
            r0.D = r1
            return r1
    }

    static /* synthetic */ void a(com.beizi.fusion.c.d r0, com.beizi.fusion.work.a r1, int r2) {
            r0.b(r1, r2)
            return
    }

    private void a(com.beizi.fusion.work.a r6, int r7) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L6e
        L3:
            java.util.Map r0 = r5.n()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            com.beizi.fusion.work.a r1 = (com.beizi.fusion.work.a) r1
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = r1.j()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r3 = r6.j()
            if (r2 == 0) goto Lf
            if (r3 != 0) goto L28
            goto Lf
        L28:
            java.lang.String r4 = r2.getBuyerSpaceUuId()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L4b
            java.lang.String r4 = r3.getBuyerSpaceUuId()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L4b
            java.lang.String r4 = r2.getBuyerSpaceUuId()
            java.lang.String r3 = r3.getBuyerSpaceUuId()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L4b
            goto Lf
        L4b:
            r5.b(r1, r7)
            com.beizi.fusion.c.e r3 = r1.at()
            com.beizi.fusion.c.e r4 = com.beizi.fusion.c.e.f7581c
            if (r3 != r4) goto L5e
            java.lang.String r1 = r2.getBuyerSpaceUuId()
            r5.f(r1)
            goto Lf
        L5e:
            com.beizi.fusion.e.a r1 = r1.h()
            com.beizi.fusion.e.a r3 = com.beizi.fusion.e.a.a
            if (r1 != r3) goto Lf
            java.lang.String r1 = r2.getBuyerSpaceUuId()
            r5.e(r1)
            goto Lf
        L6e:
            return
    }

    private void a(com.beizi.fusion.work.a r5, java.lang.String r6) {
            r4 = this;
            r0 = 1
            r4.E = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "---handleCompeteSuccess---"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = "---"
            r1.append(r6)
            double r2 = r4.e(r5)
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r6)
            r4.f7575i = r5
            r4.a(r5, r0)
            return
    }

    private void a(java.lang.String r3, java.lang.String r4, com.beizi.fusion.work.a r5) {
            r2 = this;
            java.util.Map<java.lang.String, com.beizi.fusion.work.a> r0 = r2.f7576j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r2.i(r3)
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.put(r3, r5)
            return
    }

    private void a(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "materialInfo"
            if (r4 != 0) goto L5
            goto L2d
        L5:
            com.beizi.fusion.work.a r1 = r3.f7575i     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto La
            goto L2d
        La:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.V     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto Lf
            goto L2d
        Lf:
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L16
            goto L2d
        L16:
            com.beizi.fusion.work.a r1 = r3.f7575i     // Catch: java.lang.Throwable -> L2d
            org.json.JSONObject r1 = r1.ax()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L1f
            goto L2d
        L1f:
            boolean r2 = r1.has(r0)     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L26
            goto L2d
        L26:
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L2d
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    static /* synthetic */ boolean a(com.beizi.fusion.c.d r0, boolean r1) {
            r0.L = r1
            return r1
    }

    private boolean a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r12, com.beizi.fusion.model.AdSpacesBean.BuyerBean r13, java.lang.String r14) {
            r11 = this;
            com.beizi.fusion.events.b r0 = r11.F
            com.beizi.fusion.events.a$d r0 = r0.e
            r9 = 2
            r0.a(r14, r9)
            r10 = 0
            if (r13 == 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r0.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = "complain_config_"
            r0.append(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = r13.getSpaceId()     // Catch: java.lang.Exception -> L4f
            r0.append(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L4f
            android.content.Context r1 = r11.f7568b     // Catch: java.lang.Exception -> L4f
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L4f
            java.lang.Object r0 = com.beizi.fusion.tool.an.b(r1, r0, r2)     // Catch: java.lang.Exception -> L4f
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> L4f
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L4f
            com.beizi.fusion.model.AdSpacesBean$ComplainBean r2 = r13.getComplain()     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto L50
            long r2 = r2.getDuration()     // Catch: java.lang.Exception -> L4f
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4f
            long r4 = r4 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L50
            com.beizi.fusion.events.b r0 = r11.F     // Catch: java.lang.Exception -> L4f
            com.beizi.fusion.events.a$d r0 = r0.e     // Catch: java.lang.Exception -> L4f
            r1 = 10
            r0.a(r14, r1)     // Catch: java.lang.Exception -> L4f
            return r10
        L4f:
        L50:
            android.content.Context r0 = r11.f7568b
            long r1 = r11.f7572f
            com.beizi.fusion.model.AdSpacesBean$FilterBean r3 = r13.getFilter()
            com.beizi.fusion.events.b r4 = r11.F
            java.lang.String r5 = r11.g()
            java.lang.String r6 = r13.getBuyerSpaceUuId()
            java.lang.String r7 = r13.getSpaceId()
            r8 = r11
            com.beizi.fusion.e.b.a(r0, r1, r3, r4, r5, r6, r7, r8)
            com.beizi.fusion.events.b r0 = r11.F
            com.beizi.fusion.events.a$d r0 = r0.e
            int r0 = r0.a(r14)
            r1 = 3
            if (r0 != r1) goto L96
            com.beizi.fusion.events.b r0 = r11.F
            boolean r0 = r0.c()
            if (r0 == 0) goto L86
            com.beizi.fusion.events.b r0 = r11.F
            com.beizi.fusion.events.a$d r0 = r0.e
            r1 = -1
            r0.a(r14, r1)
            return r10
        L86:
            int r0 = r11.a(r12, r13)
            if (r0 == r9) goto L8d
            return r10
        L8d:
            com.beizi.fusion.events.b r0 = r11.F
            com.beizi.fusion.events.a$d r0 = r0.e
            r0.a(r14, r1)
            r0 = 1
            return r0
        L96:
            com.beizi.fusion.events.b r0 = r11.F
            com.beizi.fusion.events.a$d r0 = r0.e
            int r0 = r0.a(r14)
            r1 = 7
            java.lang.String r2 = "channel error = "
            r11.a(r0, r1, r2)
            com.beizi.fusion.events.b r0 = r11.F
            com.beizi.fusion.events.a$d r0 = r0.e
            com.beizi.fusion.events.a.a(r14, r0)
            return r10
    }

    static /* synthetic */ int b(com.beizi.fusion.c.d r0) {
            int r0 = r0.C
            return r0
    }

    private void b(int r2) {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i
            r1.a(r0, r2)
            com.beizi.fusion.work.a r2 = r1.f7575i
            r2.q()
            com.beizi.fusion.work.a r2 = r1.f7575i
            java.lang.String r2 = r2.f()
            com.beizi.fusion.work.a r0 = r1.f7575i
            android.view.View r0 = r0.o()
            r1.a(r2, r0)
            java.lang.String r2 = r1.d()
            java.lang.String r0 = "4"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L31
            boolean r2 = r1.n
            if (r2 != 0) goto L31
            com.beizi.fusion.work.a r2 = r1.f7575i
            r2.e()
            r2 = 1
            r1.n = r2
        L31:
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.c.d r0, int r1) {
            r0.b(r1)
            return
    }

    private void b(com.beizi.fusion.work.a r5, int r6) {
            r4 = this;
            java.lang.String r0 = "other"
            boolean r1 = r4.b(r5)     // Catch: java.lang.Exception -> L45
            if (r1 != 0) goto Le
            boolean r1 = r4.c(r5)     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L45
        Le:
            com.beizi.fusion.model.ChannelBidResult r1 = new com.beizi.fusion.model.ChannelBidResult     // Catch: java.lang.Exception -> L45
            r1.<init>()     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.work.a r2 = r4.f7575i     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto L34
            java.lang.String r0 = r2.g()     // Catch: java.lang.Exception -> L45
            r1.setBidType(r0)     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.work.a r0 = r4.f7575i     // Catch: java.lang.Exception -> L45
            java.lang.String r0 = r0.f()     // Catch: java.lang.Exception -> L45
            r1.setChannelName(r0)     // Catch: java.lang.Exception -> L45
            r1.setReason(r6)     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.work.a r6 = r4.f7575i     // Catch: java.lang.Exception -> L45
            double r2 = r4.e(r6)     // Catch: java.lang.Exception -> L45
            r1.setEcpm(r2)     // Catch: java.lang.Exception -> L45
            goto L42
        L34:
            r2 = 0
            r1.setEcpm(r2)     // Catch: java.lang.Exception -> L45
            r1.setChannelName(r0)     // Catch: java.lang.Exception -> L45
            r1.setBidType(r0)     // Catch: java.lang.Exception -> L45
            r1.setReason(r6)     // Catch: java.lang.Exception -> L45
        L42:
            r5.b(r1)     // Catch: java.lang.Exception -> L45
        L45:
            return
    }

    static /* synthetic */ com.beizi.fusion.events.b c(com.beizi.fusion.c.d r0) {
            com.beizi.fusion.events.b r0 = r0.F
            return r0
    }

    static /* synthetic */ void d(com.beizi.fusion.c.d r0) {
            r0.C()
            return
    }

    private void d(java.util.Map<java.lang.String, com.beizi.fusion.work.a> r3) {
            r2 = this;
            if (r3 == 0) goto L26
            int r0 = r3.size()
            if (r0 != 0) goto L9
            goto L26
        L9:
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            com.beizi.fusion.work.a r0 = (com.beizi.fusion.work.a) r0
            r0.d()
            r1 = 1
            r0.a(r1)
            goto L11
        L25:
            return
        L26:
            r2.e()
            return
    }

    private boolean d(com.beizi.fusion.work.a r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.util.Map r1 = r7.n()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()
            com.beizi.fusion.work.a r2 = (com.beizi.fusion.work.a) r2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r3 = r2.j()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r4 = r8.j()
            if (r3 == 0) goto L10
            if (r4 != 0) goto L29
            goto L10
        L29:
            java.lang.String r5 = r3.getBuyerSpaceUuId()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L4c
            java.lang.String r5 = r4.getBuyerSpaceUuId()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L4c
            java.lang.String r3 = r3.getBuyerSpaceUuId()
            java.lang.String r4 = r4.getBuyerSpaceUuId()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4c
            goto L10
        L4c:
            boolean r3 = r7.b(r2)
            if (r3 != 0) goto L94
            boolean r3 = r7.c(r2)
            if (r3 == 0) goto L59
            goto L94
        L59:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "worker.getAdStatus():"
            r3.append(r4)
            com.beizi.fusion.e.a r4 = r2.h()
            r3.append(r4)
            java.lang.String r4 = ":"
            r3.append(r4)
            java.lang.String r4 = r2.f()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r4, r3)
            com.beizi.fusion.e.a r3 = r2.h()
            com.beizi.fusion.e.a r4 = com.beizi.fusion.e.a.f7610d
            if (r3 == r4) goto L10
            double r2 = r7.e(r2)
            double r4 = r7.e(r8)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L10
            return r0
        L94:
            double r3 = r7.f(r2)
            com.beizi.fusion.e.a r2 = r2.h()
            com.beizi.fusion.e.a r5 = com.beizi.fusion.e.a.a
            if (r2 == r5) goto La8
            double r5 = r7.e(r8)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L10
        La8:
            return r0
        La9:
            r8 = 1
            return r8
    }

    private double e(com.beizi.fusion.work.a r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L32
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = r6.j()
            if (r2 != 0) goto Lb
            goto L32
        Lb:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = r6.j()
            boolean r3 = r5.c(r6)
            if (r3 != 0) goto L21
            boolean r6 = r5.b(r6)
            if (r6 == 0) goto L1c
            goto L21
        L1c:
            double r0 = r2.getAvgPrice()
            return r0
        L21:
            double r3 = r2.getBidPrice()
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 <= 0) goto L2e
            double r0 = r2.getBidPrice()
            return r0
        L2e:
            double r0 = r2.getAvgPrice()
        L32:
            return r0
    }

    static /* synthetic */ void e(com.beizi.fusion.c.d r0) {
            r0.D()
            return
    }

    private double f(com.beizi.fusion.work.a r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
            return r0
        L5:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r3 = r3.j()
            if (r3 != 0) goto Lc
            return r0
        Lc:
            double r0 = r3.getBidPrice()
            return r0
    }

    static /* synthetic */ com.beizi.fusion.events.a f(com.beizi.fusion.c.d r0) {
            com.beizi.fusion.events.a r0 = r0.O
            return r0
    }

    static /* synthetic */ void g(com.beizi.fusion.c.d r0) {
            r0.G()
            return
    }

    static /* synthetic */ com.beizi.fusion.model.AdSpacesBean h(com.beizi.fusion.c.d r0) {
            com.beizi.fusion.model.AdSpacesBean r0 = r0.u
            return r0
    }

    private boolean h(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "HPFRW"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    private java.lang.String i(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enter convertSelfChannel buyerId = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            java.lang.String r0 = com.beizi.fusion.tool.ao.b()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L22
            java.lang.String r3 = "BEIZI"
        L22:
            return r3
    }

    static /* synthetic */ java.util.Timer i(com.beizi.fusion.c.d r0) {
            java.util.Timer r0 = r0.D
            return r0
    }

    static /* synthetic */ boolean j(com.beizi.fusion.c.d r0) {
            boolean r0 = r0.M
            return r0
    }

    private boolean j(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    private void k(java.lang.String r3) {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto La
            com.beizi.fusion.events.a$c r0 = r0.h
            r1 = 3
            r0.a(r3, r1)
        La:
            return
    }

    @androidx.annotation.NonNull
    private com.beizi.fusion.c.e l(java.lang.String r1) {
            r0 = this;
            r0.k(r1)
            com.beizi.fusion.c.e r1 = com.beizi.fusion.c.e.a
            return r1
    }

    @androidx.annotation.NonNull
    private com.beizi.fusion.c.e m(java.lang.String r1) {
            r0 = this;
            r0.f(r1)
            com.beizi.fusion.c.e r1 = com.beizi.fusion.c.e.f7580b
            return r1
    }

    private void y() {
            r2 = this;
            android.os.Handler r0 = r2.q
            if (r0 == 0) goto L8
            r1 = 1
            r0.removeMessages(r1)
        L8:
            java.util.Timer r0 = r2.D
            if (r0 == 0) goto L12
            r0.cancel()
            r0 = 0
            r2.D = r0
        L12:
            return
    }

    private void z() {
            r2 = this;
            android.os.Handler r0 = r2.q
            if (r0 == 0) goto L8
            r1 = 2
            r0.removeMessages(r1)
        L8:
            java.util.Timer r0 = r2.D
            if (r0 == 0) goto L12
            r0.cancel()
            r0 = 0
            r2.D = r0
        L12:
            return
    }

    public com.beizi.fusion.c.e a(com.beizi.fusion.work.a r10) {
            r9 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r10.j()
            if (r0 != 0) goto L8
            r10 = 0
            return r10
        L8:
            java.lang.String r1 = r0.getId()
            java.lang.String r2 = r0.getBuyerSpaceUuId()
            java.lang.String r0 = r0.getZone()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "enter comparePrices compareWorker:"
            r3.append(r4)
            java.lang.String r4 = r10.f()
            r3.append(r4)
            java.lang.String r4 = ",mCurrentHighestWorker:"
            r3.append(r4)
            com.beizi.fusion.work.a r4 = r9.f7575i
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r4, r3)
            java.lang.String r3 = r10.f()
            boolean r3 = r9.j(r3)
            if (r3 == 0) goto L47
            com.beizi.fusion.c.e r10 = r9.a(r2, r10, r1)
            return r10
        L47:
            com.beizi.fusion.events.b r3 = r9.F
            r5 = 1
            if (r3 == 0) goto L51
            com.beizi.fusion.events.a$c r3 = r3.h
            r3.a(r2, r5)
        L51:
            int r3 = r9.y
            if (r3 < r5) goto L5d
            r9.b(r10, r5)
            com.beizi.fusion.c.e r10 = r9.m(r2)
            return r10
        L5d:
            boolean r3 = r9.I()
            if (r3 == 0) goto L68
            com.beizi.fusion.c.e r10 = r9.a(r2, r10)
            return r10
        L68:
            boolean r0 = r9.h(r0)
            boolean r3 = r9.d(r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "channel == mTimeStage = "
            r6.append(r7)
            int r7 = r9.z
            int r8 = r9.B
            if (r7 != r8) goto L82
            r7 = 1
            goto L83
        L82:
            r7 = 0
        L83:
            r6.append(r7)
            java.lang.String r7 = ";isNeedComparePrices = "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = ",isHighestPrice:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ";mCurrentHighestWorker:"
            r6.append(r7)
            com.beizi.fusion.work.a r7 = r9.f7575i
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.beizi.fusion.tool.aa.a(r4, r6)
            int r4 = r9.z
            int r6 = r9.A
            if (r4 != r6) goto Ldc
            if (r0 == 0) goto Ldc
            if (r3 == 0) goto Lb2
            goto Ldc
        Lb2:
            double r0 = r9.e(r10)
            com.beizi.fusion.work.a r3 = r9.f7575i
            double r3 = r9.e(r3)
            com.beizi.fusion.work.a r6 = r9.f7575i
            if (r6 == 0) goto Ld7
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 > 0) goto Ld7
            r9.b(r10, r5)
            com.beizi.fusion.work.a r10 = r9.f7575i
            boolean r10 = r9.d(r10)
            if (r10 == 0) goto Ld2
            r9.b(r5)
        Ld2:
            com.beizi.fusion.c.e r10 = r9.m(r2)
            return r10
        Ld7:
            com.beizi.fusion.c.e r10 = r9.a(r2, r10)
            return r10
        Ldc:
            com.beizi.fusion.c.e r10 = r9.a(r2, r10, r1)
            return r10
    }

    public com.beizi.fusion.events.b a() {
            r1 = this;
            com.beizi.fusion.events.b r0 = r1.F
            return r0
    }

    @androidx.annotation.Nullable
    protected com.beizi.fusion.model.AdSpacesBean.BuyerBean a(java.lang.String r1, java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> r2, java.lang.String r3) {
            r0 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = com.beizi.fusion.e.b.a(r1, r2, r3)
            return r1
    }

    public abstract com.beizi.fusion.work.a a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r1, java.lang.String r2, com.beizi.fusion.model.AdSpacesBean.BuyerBean r3, java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> r4, com.beizi.fusion.work.a r5);

    protected java.util.Map<java.lang.String, com.beizi.fusion.work.a> a(java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> r13) {
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L9
            int r1 = r13.size()
            if (r1 != 0) goto Lc
        L9:
            r5 = r12
            goto Lca
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "generateWorkers forwardBeans.size() = "
            r1.append(r2)
            int r2 = r13.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r2, r1)
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            r3 = 0
        L2c:
            int r4 = r13.size()
            if (r3 >= r4) goto Lc8
            java.lang.Object r4 = r13.get(r3)
            r6 = r4
            com.beizi.fusion.model.AdSpacesBean$ForwardBean r6 = (com.beizi.fusion.model.AdSpacesBean.ForwardBean) r6
            if (r6 != 0) goto L3e
        L3b:
            r5 = r12
            goto Lc4
        L3e:
            java.lang.String r7 = r6.getBuyerId()
            java.lang.String r4 = r6.getBuyerSpaceUuId()
            java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean> r5 = r12.H
            java.lang.String r8 = r6.getBuyerSpaceUuId()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r5 = r12.a(r7, r5, r8)
            if (r5 != 0) goto L53
            goto L3b
        L53:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r5 = r5.clone()     // Catch: java.lang.CloneNotSupportedException -> L59
            r8 = r5
            goto L5b
        L59:
            r8 = r0
        L5b:
            if (r8 != 0) goto L5e
            goto L3b
        L5e:
            com.beizi.fusion.events.a r5 = r12.O
            r5.a(r8, r6)
            com.beizi.fusion.events.b r5 = r12.F
            com.beizi.fusion.events.a$d r5 = r5.e
            r9 = 1
            r5.a(r4, r9)
            boolean r5 = r12.a(r6, r8, r4)
            if (r5 != 0) goto L72
            goto L3b
        L72:
            java.util.List r9 = r8.getRenderView()
            r10 = 0
            r5 = r12
            com.beizi.fusion.work.a r9 = r5.a(r6, r7, r8, r9, r10)
            if (r9 == 0) goto Lc4
            long r10 = r6.getSleepTime()
            r9.a(r10)
            r9.a(r6)
            r9.a(r8)
            java.lang.String r6 = r8.getBidType()
            r9.a(r6)
            r12.a(r7, r4, r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r12.i(r7)
            r6.append(r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r1.put(r4, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "generateWorkers put new "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = " worker into workerList"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.beizi.fusion.tool.aa.a(r2, r4)
        Lc4:
            int r3 = r3 + 1
            goto L2c
        Lc8:
            r5 = r12
            return r1
        Lca:
            return r0
    }

    public void a(int r5) {
            r4 = this;
            r0 = 10140(0x279c, float:1.4209E-41)
            r1 = 9999(0x270f, float:1.4012E-41)
            r2 = 1
            if (r5 == r0) goto L1b
            int r0 = r4.y
            if (r0 < r2) goto Lc
            goto L1a
        Lc:
            if (r5 == r1) goto L1b
            boolean r0 = r4.I()
            if (r0 != 0) goto L1a
            boolean r0 = r4.J()
            if (r0 == 0) goto L1b
        L1a:
            return
        L1b:
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            boolean r0 = r0.j()
            r3 = 3
            if (r0 == 0) goto L29
            if (r5 != r1) goto L29
            r5 = 3
        L29:
            com.beizi.fusion.a r0 = r4.f7574h
            if (r0 == 0) goto L68
            boolean r1 = r0 instanceof com.beizi.fusion.AdListener
            if (r1 == 0) goto L37
            com.beizi.fusion.AdListener r0 = (com.beizi.fusion.AdListener) r0
            r0.onAdFailedToLoad(r5)
            goto L68
        L37:
            boolean r1 = r0 instanceof com.beizi.fusion.RewardedVideoAdListener
            if (r1 == 0) goto L41
            com.beizi.fusion.RewardedVideoAdListener r0 = (com.beizi.fusion.RewardedVideoAdListener) r0
            r0.onRewardedVideoAdFailedToLoad(r5)
            goto L68
        L41:
            boolean r1 = r0 instanceof com.beizi.fusion.NativeAdListener
            if (r1 == 0) goto L4b
            com.beizi.fusion.NativeAdListener r0 = (com.beizi.fusion.NativeAdListener) r0
            r0.onAdFailed(r5)
            goto L68
        L4b:
            boolean r1 = r0 instanceof com.beizi.fusion.InterstitialAdListener
            if (r1 == 0) goto L55
            com.beizi.fusion.InterstitialAdListener r0 = (com.beizi.fusion.InterstitialAdListener) r0
            r0.onAdFailed(r5)
            goto L68
        L55:
            boolean r1 = r0 instanceof com.beizi.fusion.NativeUnifiedAdListener
            if (r1 == 0) goto L5f
            com.beizi.fusion.NativeUnifiedAdListener r0 = (com.beizi.fusion.NativeUnifiedAdListener) r0
            r0.onAdFailed(r5)
            goto L68
        L5f:
            boolean r1 = r0 instanceof com.beizi.fusion.b
            if (r1 == 0) goto L68
            com.beizi.fusion.b r0 = (com.beizi.fusion.b) r0
            r0.a(r5)
        L68:
            r4.y()
            r4.z()
            r4.y = r3
            r4.m()
            com.beizi.fusion.c.d.r = r2
            return
    }

    protected void a(int r1, int r2, java.lang.String r3) {
            r0 = this;
            if (r1 != r2) goto L26
            java.lang.String r1 = r0.m
            com.beizi.fusion.model.FreqItem r1 = com.beizi.fusion.tool.s.c(r1)
            if (r1 == 0) goto L26
            java.lang.String r1 = r0.m
            com.beizi.fusion.model.FreqItem r1 = com.beizi.fusion.tool.s.c(r1)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.beizi.fusion.tool.s.d(r1)
        L26:
            return
    }

    public void a(long r3) {
            r2 = this;
            com.beizi.fusion.a r0 = r2.f7574h
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof com.beizi.fusion.AdListener
            if (r1 == 0) goto Ld
            com.beizi.fusion.AdListener r0 = (com.beizi.fusion.AdListener) r0
            r0.onAdTick(r3)
        Ld:
            return
    }

    public void a(android.view.ViewGroup r12) {
            r11 = this;
            boolean r0 = r11.I
            if (r0 != 0) goto L256
            android.content.Context r0 = r11.f7568b
            if (r0 == 0) goto L256
            android.content.Context r0 = com.beizi.fusion.c.d.a
            if (r0 != 0) goto Le
            goto L256
        Le:
            long r0 = java.lang.System.currentTimeMillis()
            r11.U = r0
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            r0.k()
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            r0.l()
            r11.f7570d = r12
            long r0 = java.lang.System.currentTimeMillis()
            r11.G = r0
            java.lang.String r12 = com.beizi.fusion.tool.ao.a()
            r11.f7571e = r12
            com.beizi.fusion.c.b r12 = com.beizi.fusion.c.b.a()
            com.beizi.fusion.events.b r12 = r12.f()
            com.beizi.fusion.events.b r0 = new com.beizi.fusion.events.b
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.f7558b
            com.beizi.fusion.c.b r3 = com.beizi.fusion.c.b.a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.<init>(r1)
            r11.F = r0
            com.beizi.fusion.events.a r0 = r0.a()
            r11.O = r0
            com.beizi.fusion.events.b r0 = r11.F
            com.beizi.fusion.events.EventBean r0 = r0.b()
            r11.f7569c = r0
            r11.D()
            com.beizi.fusion.events.a r0 = r11.O
            com.beizi.fusion.events.EventBean r1 = r11.f7569c
            r0.a(r1)
            r11.G()
            boolean r0 = com.beizi.fusion.BeiZis.isIsSyncInit()
            r1 = 1
            r2 = 2
            if (r0 != 0) goto L9e
            if (r12 == 0) goto L8f
            com.beizi.fusion.events.a$i r0 = r12.a
            int r0 = r0.a()
            if (r0 == r2) goto L9e
        L8f:
            boolean r0 = r11.S
            if (r0 != 0) goto L9e
            android.content.Context r0 = com.beizi.fusion.c.d.a
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)
            r0.init()
            r11.S = r1
        L9e:
            if (r12 == 0) goto Lcc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "mInitObserver.mInitStatus.getStatus() = "
            r0.append(r3)
            com.beizi.fusion.events.a$i r3 = r12.a
            int r3 = r3.a()
            r0.append(r3)
            java.lang.String r3 = ",mManagerObserver.mGetLocalConfigStatus.getStatus() = "
            r0.append(r3)
            com.beizi.fusion.events.b r3 = r11.F
            com.beizi.fusion.events.a$h r3 = r3.b
            int r3 = r3.a()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "BeiZis"
            com.beizi.fusion.tool.aa.b(r3, r0)
        Lcc:
            r0 = 0
            if (r12 == 0) goto Le1
            com.beizi.fusion.events.a$i r12 = r12.a
            int r12 = r12.a()
            if (r12 != r2) goto Le1
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            int r12 = r12.a()
            if (r12 == 0) goto Le5
        Le1:
            boolean r12 = r11.S
            if (r12 == 0) goto L247
        Le5:
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r12.a(r1)
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            int r12 = r12.a()
            java.lang.String r3 = "kGetLocalConfigStatusInternalError"
            r4 = -2
            if (r12 != r1) goto L23c
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r12.a(r2)
            android.content.Context r12 = r11.f7568b
            java.lang.String r5 = r11.m
            java.lang.String r6 = r11.d()
            com.beizi.fusion.model.AdSpacesBean r12 = com.beizi.fusion.b.a.a(r12, r5, r6)
            r11.u = r12
            r5 = 3
            if (r12 == 0) goto L1e9
            com.beizi.fusion.events.EventBean r3 = r11.f7569c
            if (r3 == 0) goto L135
            java.lang.String r12 = r12.getFilterSsid()
            r3.setPlatformFilterSsid(r12)
            com.beizi.fusion.events.EventBean r12 = r11.f7569c
            com.beizi.fusion.model.AdSpacesBean r3 = r11.u
            java.lang.String r3 = r3.getComponentSsid()
            r12.setComponentSsid(r3)
            com.beizi.fusion.events.EventBean r12 = r11.f7569c
            com.beizi.fusion.model.AdSpacesBean r3 = r11.u
            java.lang.String r3 = r3.getBzComponentSsid()
            r12.setBzComponentSsid(r3)
            r11.H()
        L135:
            android.content.Context r12 = com.beizi.fusion.c.d.a
            com.beizi.fusion.model.ResponseInfo r12 = com.beizi.fusion.model.ResponseInfo.getInstance(r12)
            com.beizi.fusion.model.Manager r3 = r12.getManager()
            if (r3 == 0) goto L162
            java.util.List r3 = r3.getAdSpaces()
            if (r3 == 0) goto L162
            int r4 = r3.size()
            if (r4 <= 0) goto L162
            java.lang.Object r3 = r3.get(r0)
            com.beizi.fusion.model.AdSpacesBean r3 = (com.beizi.fusion.model.AdSpacesBean) r3
            if (r3 == 0) goto L162
            com.beizi.fusion.model.AdSpacesBean$ComponentBean r4 = r3.getComponent()
            com.beizi.fusion.model.AdSpacesBean$BidComponent r6 = r3.getBidComponent()
            java.util.List r3 = r3.getBuyer()
            goto L165
        L162:
            r4 = 0
            r3 = r4
            r6 = r3
        L165:
            if (r4 != 0) goto L169
            if (r6 == 0) goto L1e3
        L169:
            if (r3 == 0) goto L1e3
            int r3 = r3.size()
            if (r3 <= 0) goto L1e3
            long r3 = r12.getMaxValidTime()
            r6 = 0
            int r12 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r12 != 0) goto L180
            r3 = 2592000000(0x9a7ec800, double:1.280618154E-314)
        L180:
            android.content.Context r12 = com.beizi.fusion.c.d.a
            java.util.Date r8 = new java.util.Date
            r8.<init>(r6)
            long r6 = r8.getTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "lastUpdateTime"
            java.lang.Object r12 = com.beizi.fusion.tool.an.b(r12, r7, r6)
            java.lang.Long r12 = (java.lang.Long) r12
            long r6 = r12.longValue()
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r6
            int r12 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r12 > 0) goto L1db
            r11.M = r0
            r11.I = r1
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            int r12 = r12.a()
            if (r12 != r2) goto L256
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r12.a(r5)
            boolean r12 = r11.E()
            if (r12 == 0) goto L1c1
            goto L256
        L1c1:
            r11.F()
            com.beizi.fusion.events.b r12 = r11.F
            boolean r12 = r12.c()
            if (r12 == 0) goto L1d5
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r0 = -1
            r12.a(r0)
            return
        L1d5:
            com.beizi.fusion.model.AdSpacesBean r12 = r11.u
            r11.a(r12)
            return
        L1db:
            r11.I = r0
            r11.M = r1
            r11.B()
            return
        L1e3:
            r11.I = r0
            r11.B()
            return
        L1e9:
            boolean r12 = r11.L
            if (r12 == 0) goto L236
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            int r12 = r12.a()
            if (r12 != r2) goto L22b
            int r12 = com.beizi.fusion.b.a.a()
            if (r12 != r1) goto L20b
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r0 = 4
            r12.a(r0)
            r12 = 10001(0x2711, float:1.4014E-41)
            r11.a(r12)
            return
        L20b:
            if (r12 != r2) goto L21b
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r0 = 5
            r12.a(r0)
            r12 = 10100(0x2774, float:1.4153E-41)
            r11.a(r12)
            return
        L21b:
            if (r12 != r5) goto L256
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r0 = 6
            r12.a(r0)
            r12 = 10110(0x277e, float:1.4167E-41)
            r11.a(r12)
            return
        L22b:
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r12.a(r4)
            r11.a(r3)
            return
        L236:
            r11.I = r0
            r11.B()
            return
        L23c:
            com.beizi.fusion.events.b r12 = r11.F
            com.beizi.fusion.events.a$h r12 = r12.b
            r12.a(r4)
            r11.a(r3)
            return
        L247:
            boolean r12 = r11.L
            if (r12 == 0) goto L251
            r11.I = r0
            r11.B()
            return
        L251:
            r12 = 10000(0x2710, float:1.4013E-41)
            r11.a(r12)
        L256:
            return
    }

    public void a(com.beizi.fusion.a r1) {
            r0 = this;
            r0.f7574h = r1
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.ComponentBean r2, java.lang.String r3, boolean r4, int r5) {
            r1 = this;
            r4 = 1
            if (r2 == 0) goto L1e
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "C2S"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "S2S"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1a
            goto L1e
        L1a:
            r1.a(r2, r4)
            return
        L1e:
            com.beizi.fusion.work.a r2 = r1.f7575i
            if (r2 == 0) goto L2c
            boolean r2 = r1.d(r2)
            if (r2 == 0) goto L2c
            r1.b(r4)
            return
        L2c:
            r1.a(r5)
            return
    }

    protected void a(com.beizi.fusion.model.AdSpacesBean.ComponentBean r5, boolean r6) {
            r4 = this;
            java.lang.String r0 = "enter auctionAndRequestAd"
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            com.beizi.fusion.model.AdSpacesBean r0 = r4.u
            if (r0 != 0) goto Lc
            return
        Lc:
            java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean> r0 = r4.H
            if (r0 == 0) goto L76
            int r0 = r0.size()
            if (r0 != 0) goto L17
            goto L76
        L17:
            int r0 = r4.p()
            r2 = 1
            if (r0 < r2) goto L24
            java.lang.String r5 = "auctionAndRequestAd ad aleady callback"
            com.beizi.fusion.tool.aa.a(r1, r5)
            return
        L24:
            if (r6 != 0) goto L2d
            com.beizi.fusion.events.b r0 = r4.F
            com.beizi.fusion.events.a$g r0 = r0.d
            r0.a(r2)
        L2d:
            java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean> r0 = r4.H
            java.util.List r5 = r4.a(r5, r0, r6)
            if (r6 != 0) goto L3d
            com.beizi.fusion.events.b r6 = r4.F
            com.beizi.fusion.events.a$g r6 = r6.d
            r0 = 2
            r6.a(r0)
        L3d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r5 == 0) goto L6e
            int r0 = r5.size()
            if (r0 <= 0) goto L6e
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            com.beizi.fusion.model.AdSpacesBean$ForwardBean r0 = (com.beizi.fusion.model.AdSpacesBean.ForwardBean) r0
            java.lang.String r1 = r0.getBuyerId()
            java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean> r2 = r4.H
            java.lang.String r3 = r0.getBuyerSpaceUuId()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r4.a(r1, r2, r3)
            if (r1 == 0) goto L4e
            r6.add(r0)
            goto L4e
        L6e:
            java.util.Map r5 = r4.a(r6)
            r4.d(r5)
            return
        L76:
            java.lang.String r5 = "auctionAndRequestAd mBuyerBeanList == null "
            com.beizi.fusion.tool.aa.a(r1, r5)
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean r11) {
            r10 = this;
            com.beizi.fusion.events.b r0 = r10.F
            com.beizi.fusion.events.a$h r0 = r0.b
            int r0 = r0.a()
            r1 = 3
            if (r0 != r1) goto L9c
            com.beizi.fusion.events.b r0 = r10.F
            com.beizi.fusion.events.a$k r0 = r0.c
            int r0 = r0.a()
            if (r0 != 0) goto L9c
            com.beizi.fusion.events.b r0 = r10.F
            com.beizi.fusion.events.a$k r0 = r0.c
            r1 = 1
            r0.a(r1)
            java.util.Map<java.lang.String, com.beizi.fusion.work.a> r0 = r10.f7576j
            r0.clear()
            com.beizi.fusion.model.AdSpacesBean$FilterBean r4 = r11.getFilter()
            java.util.List r0 = r11.getBuyer()
            r10.H = r0
            android.content.Context r1 = r10.f7568b
            long r2 = r10.f7572f
            com.beizi.fusion.events.b r5 = r10.F
            java.lang.String r6 = r10.g()
            r7 = 0
            r8 = 0
            r9 = r10
            com.beizi.fusion.e.b.a(r1, r2, r4, r5, r6, r7, r8, r9)
            com.beizi.fusion.events.b r0 = r9.F
            com.beizi.fusion.events.a$k r0 = r0.c
            int r0 = r0.a()
            r1 = 2
            if (r0 != r1) goto L81
            com.beizi.fusion.events.b r0 = r9.F
            boolean r0 = r0.c()
            if (r0 == 0) goto L58
            com.beizi.fusion.events.b r11 = r9.F
            com.beizi.fusion.events.a$k r11 = r11.c
            r0 = -1
            r11.a(r0)
            return
        L58:
            java.lang.String r0 = r9.m
            com.beizi.fusion.model.EventItem r1 = new com.beizi.fusion.model.EventItem
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "200.000"
            r4 = 0
            r1.<init>(r3, r2, r4, r4)
            r10.a(r3, r0, r1)
            r9.N = r11
            java.lang.String r11 = "BeiZis"
            java.lang.String r0 = "normal request"
            com.beizi.fusion.tool.aa.c(r11, r0)
            com.beizi.fusion.model.AdSpacesBean r11 = r9.N
            com.beizi.fusion.model.AdSpacesBean$ComponentBean r11 = r11.getComponent()
            r0 = 0
            r10.a(r11, r0)
            return
        L81:
            com.beizi.fusion.events.b r11 = r9.F
            com.beizi.fusion.events.a$k r11 = r11.c
            int r11 = r11.a()
            r0 = 6
            java.lang.String r1 = "platform error = "
            r10.a(r11, r0, r1)
            com.beizi.fusion.events.b r11 = r9.F
            com.beizi.fusion.events.a$k r11 = r11.c
            com.beizi.fusion.events.a.a(r11)
            r11 = 10130(0x2792, float:1.4195E-41)
            r10.a(r11)
            return
        L9c:
            r9 = r10
            com.beizi.fusion.events.b r11 = r9.F
            com.beizi.fusion.events.a$k r11 = r11.c
            r0 = -2
            r11.a(r0)
            java.lang.String r11 = "kPlatformFilterStatusInternalError"
            r10.a(r11)
            return
    }

    @Override // com.beizi.fusion.c.a
    public void a(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enter handleAdRequestStatusError error is "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r0, r3)
            r3 = 10131(0x2793, float:1.4197E-41)
            r2.a(r3)
            return
    }

    public void a(java.lang.String r2, int r3) {
            r1 = this;
            com.beizi.fusion.a r2 = r1.f7574h
            if (r2 == 0) goto L3f
            boolean r0 = r2 instanceof com.beizi.fusion.AdListener
            if (r0 == 0) goto Le
            com.beizi.fusion.AdListener r2 = (com.beizi.fusion.AdListener) r2
            r2.onAdFailedToLoad(r3)
            goto L3f
        Le:
            boolean r0 = r2 instanceof com.beizi.fusion.RewardedVideoAdListener
            if (r0 == 0) goto L18
            com.beizi.fusion.RewardedVideoAdListener r2 = (com.beizi.fusion.RewardedVideoAdListener) r2
            r2.onRewardedVideoAdFailedToLoad(r3)
            goto L3f
        L18:
            boolean r0 = r2 instanceof com.beizi.fusion.NativeAdListener
            if (r0 == 0) goto L22
            com.beizi.fusion.NativeAdListener r2 = (com.beizi.fusion.NativeAdListener) r2
            r2.onAdFailed(r3)
            goto L3f
        L22:
            boolean r0 = r2 instanceof com.beizi.fusion.InterstitialAdListener
            if (r0 == 0) goto L2c
            com.beizi.fusion.InterstitialAdListener r2 = (com.beizi.fusion.InterstitialAdListener) r2
            r2.onAdFailed(r3)
            goto L3f
        L2c:
            boolean r0 = r2 instanceof com.beizi.fusion.NativeUnifiedAdListener
            if (r0 == 0) goto L36
            com.beizi.fusion.NativeUnifiedAdListener r2 = (com.beizi.fusion.NativeUnifiedAdListener) r2
            r2.onAdFailed(r3)
            goto L3f
        L36:
            boolean r0 = r2 instanceof com.beizi.fusion.b
            if (r0 == 0) goto L3f
            com.beizi.fusion.b r2 = (com.beizi.fusion.b) r2
            r2.a(r3)
        L3f:
            r1.y()
            r1.z()
            r2 = 3
            r1.y = r2
            r1.m()
            r2 = 1
            com.beizi.fusion.c.d.r = r2
            return
    }

    public void a(java.lang.String r3, android.view.View r4) {
            r2 = this;
            boolean r3 = r2.l
            if (r3 == 0) goto L5
            return
        L5:
            r2.O()
            com.beizi.fusion.work.a r3 = r2.f7575i
            r0 = 1
            r2.a(r3, r0)
            r2.l = r0
            r2.y = r0
            r2.y()
            r2.z()
            com.beizi.fusion.a r3 = r2.f7574h
            if (r3 == 0) goto L82
            boolean r1 = r3 instanceof com.beizi.fusion.AdListener
            if (r1 == 0) goto L26
            com.beizi.fusion.AdListener r3 = (com.beizi.fusion.AdListener) r3
            r3.onAdLoaded()
            goto L82
        L26:
            boolean r1 = r3 instanceof com.beizi.fusion.RewardedVideoAdListener
            if (r1 == 0) goto L30
            com.beizi.fusion.RewardedVideoAdListener r3 = (com.beizi.fusion.RewardedVideoAdListener) r3
            r3.onRewardedVideoAdLoaded()
            goto L82
        L30:
            boolean r1 = r3 instanceof com.beizi.fusion.InterstitialAdListener
            if (r1 == 0) goto L3a
            com.beizi.fusion.InterstitialAdListener r3 = (com.beizi.fusion.InterstitialAdListener) r3
            r3.onAdLoaded()
            goto L82
        L3a:
            boolean r1 = r3 instanceof com.beizi.fusion.NativeAdListener
            if (r1 == 0) goto L73
            if (r4 == 0) goto L6f
            com.beizi.fusion.work.a r3 = r2.f7575i
            if (r3 == 0) goto L53
            int r3 = r3.aq()
            if (r3 != r0) goto L53
            com.beizi.fusion.a r3 = r2.f7574h
            com.beizi.fusion.NativeAdListener r3 = (com.beizi.fusion.NativeAdListener) r3
            r4 = 0
            r3.onAdLoaded(r4)
            goto L82
        L53:
            com.beizi.fusion.work.a r3 = r2.f7575i
            if (r3 == 0) goto L6b
            android.view.View r3 = r3.o()
            if (r3 == 0) goto L6b
            com.beizi.fusion.a r3 = r2.f7574h
            com.beizi.fusion.NativeAdListener r3 = (com.beizi.fusion.NativeAdListener) r3
            com.beizi.fusion.work.a r4 = r2.f7575i
            android.view.View r4 = r4.o()
            r3.onAdLoaded(r4)
            goto L82
        L6b:
            r2.e()
            goto L82
        L6f:
            r2.e()
            goto L82
        L73:
            boolean r4 = r3 instanceof com.beizi.fusion.NativeUnifiedAdListener
            if (r4 == 0) goto L82
            com.beizi.fusion.NativeUnifiedAdListener r3 = (com.beizi.fusion.NativeUnifiedAdListener) r3
            com.beizi.fusion.work.a r4 = r2.f7575i
            com.beizi.fusion.NativeUnifiedAdResponse r4 = r4.as()
            r3.onAdLoaded(r4)
        L82:
            r2.L()
            com.beizi.fusion.c.d.r = r0
            return
    }

    public void a(java.lang.String r2, java.lang.String r3, com.beizi.fusion.model.EventItem r4) {
            r1 = this;
            java.lang.String[] r0 = com.beizi.fusion.tool.m.a
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L1f
            com.beizi.fusion.tool.s.a(r3, r4)
            com.beizi.fusion.tool.e r2 = com.beizi.fusion.tool.e.b()
            java.util.concurrent.ExecutorService r2 = r2.c()
            com.beizi.fusion.c.d$3 r0 = new com.beizi.fusion.c.d$3
            r0.<init>(r1, r3, r4)
            r2.execute(r0)
        L1f:
            return
    }

    public void a(java.util.Map r2) {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.a(r2)
        La:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    protected void b() {
            r1 = this;
            com.beizi.fusion.events.b r0 = r1.F
            if (r0 == 0) goto L48
            com.beizi.fusion.events.a$h r0 = r0.b
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$k r0 = r0.c
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$g r0 = r0.d
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$d r0 = r0.e
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$e r0 = r0.f
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$f r0 = r0.g
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$c r0 = r0.h
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$b r0 = r0.i
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$j r0 = r0.j
            r0.deleteObservers()
            com.beizi.fusion.events.b r0 = r1.F
            com.beizi.fusion.events.a$a r0 = r0.k
            r0.deleteObservers()
        L48:
            return
    }

    public void b(java.lang.String r3) {
            r2 = this;
            int r0 = r2.y
            r1 = 2
            if (r0 < r1) goto Lc
            boolean r3 = r2.j(r3)
            if (r3 != 0) goto Lc
            return
        Lc:
            int r3 = r2.P
            if (r3 != 0) goto L14
            int r3 = r2.Q
            r2.P = r3
        L14:
            r2.y = r1
            com.beizi.fusion.a r3 = r2.f7574h
            if (r3 == 0) goto L55
            boolean r0 = r3 instanceof com.beizi.fusion.AdListener
            if (r0 == 0) goto L24
            com.beizi.fusion.AdListener r3 = (com.beizi.fusion.AdListener) r3
            r3.onAdShown()
            goto L55
        L24:
            boolean r0 = r3 instanceof com.beizi.fusion.RewardedVideoAdListener
            if (r0 == 0) goto L2e
            com.beizi.fusion.RewardedVideoAdListener r3 = (com.beizi.fusion.RewardedVideoAdListener) r3
            r3.onRewardedVideoAdShown()
            goto L55
        L2e:
            boolean r0 = r3 instanceof com.beizi.fusion.NativeAdListener
            if (r0 == 0) goto L38
            com.beizi.fusion.NativeAdListener r3 = (com.beizi.fusion.NativeAdListener) r3
            r3.onAdShown()
            goto L55
        L38:
            boolean r0 = r3 instanceof com.beizi.fusion.InterstitialAdListener
            if (r0 == 0) goto L42
            com.beizi.fusion.InterstitialAdListener r3 = (com.beizi.fusion.InterstitialAdListener) r3
            r3.onAdShown()
            goto L55
        L42:
            boolean r0 = r3 instanceof com.beizi.fusion.NativeUnifiedAdListener
            if (r0 == 0) goto L4c
            com.beizi.fusion.NativeUnifiedAdListener r3 = (com.beizi.fusion.NativeUnifiedAdListener) r3
            r3.onAdShown()
            goto L55
        L4c:
            boolean r0 = r3 instanceof com.beizi.fusion.b
            if (r0 == 0) goto L55
            com.beizi.fusion.b r3 = (com.beizi.fusion.b) r3
            r3.a()
        L55:
            r2.l()
            r2.h()
            return
    }

    public void b(java.lang.String r2, android.view.View r3) {
            r1 = this;
            com.beizi.fusion.a r2 = r1.f7574h
            if (r2 == 0) goto Lf
            if (r3 == 0) goto Lf
            boolean r0 = r2 instanceof com.beizi.fusion.NativeAdListener
            if (r0 == 0) goto Lf
            com.beizi.fusion.NativeAdListener r2 = (com.beizi.fusion.NativeAdListener) r2
            r2.onAdClosed(r3)
        Lf:
            r1.N()
            return
    }

    public void b(java.util.Map r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L3e
        L3:
            com.beizi.fusion.work.a r0 = r4.f7575i     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto Lb
            r0.b(r5)     // Catch: java.lang.Exception -> L3e
            return
        Lb:
            java.util.Map r0 = r4.n()     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L3e
            int r1 = r0.size()     // Catch: java.lang.Exception -> L3e
            if (r1 != 0) goto L18
            goto L3e
        L18:
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L3e
        L20:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L3e
            com.beizi.fusion.work.a r1 = (com.beizi.fusion.work.a) r1     // Catch: java.lang.Exception -> L3e
            if (r1 != 0) goto L2f
            goto L20
        L2f:
            java.lang.String r2 = r1.f()     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "BEIZI"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L3e
            if (r2 == 0) goto L20
            r1.b(r5)     // Catch: java.lang.Exception -> L3e
        L3e:
            return
    }

    protected boolean b(com.beizi.fusion.work.a r2) {
            r1 = this;
            java.lang.String r0 = "S2S"
            java.lang.String r2 = r2.g()
            boolean r2 = r0.equalsIgnoreCase(r2)
            return r2
    }

    protected abstract void c();

    public void c(java.lang.String r2) {
            r1 = this;
            int r2 = r1.P
            int r0 = r1.Q
            if (r2 != r0) goto La
            int r2 = r1.R
            r1.P = r2
        La:
            com.beizi.fusion.a r2 = r1.f7574h
            if (r2 == 0) goto L3f
            boolean r0 = r2 instanceof com.beizi.fusion.AdListener
            if (r0 == 0) goto L18
            com.beizi.fusion.AdListener r2 = (com.beizi.fusion.AdListener) r2
            r2.onAdClosed()
            goto L3f
        L18:
            boolean r0 = r2 instanceof com.beizi.fusion.RewardedVideoAdListener
            if (r0 == 0) goto L22
            com.beizi.fusion.RewardedVideoAdListener r2 = (com.beizi.fusion.RewardedVideoAdListener) r2
            r2.onRewardedVideoAdClosed()
            goto L3f
        L22:
            boolean r0 = r2 instanceof com.beizi.fusion.NativeAdListener
            if (r0 == 0) goto L2c
            com.beizi.fusion.NativeAdListener r2 = (com.beizi.fusion.NativeAdListener) r2
            r2.onAdClosed()
            goto L3f
        L2c:
            boolean r0 = r2 instanceof com.beizi.fusion.InterstitialAdListener
            if (r0 == 0) goto L36
            com.beizi.fusion.InterstitialAdListener r2 = (com.beizi.fusion.InterstitialAdListener) r2
            r2.onAdClosed()
            goto L3f
        L36:
            boolean r0 = r2 instanceof com.beizi.fusion.b
            if (r0 == 0) goto L3f
            com.beizi.fusion.b r2 = (com.beizi.fusion.b) r2
            r2.c()
        L3f:
            r1.N()
            return
    }

    public void c(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.V = r1
            return
    }

    protected boolean c(com.beizi.fusion.work.a r2) {
            r1 = this;
            java.lang.String r0 = "C2S"
            java.lang.String r2 = r2.g()
            boolean r2 = r0.equalsIgnoreCase(r2)
            return r2
    }

    public java.lang.String d() {
            r1 = this;
            com.beizi.fusion.events.EventBean r0 = r1.f7569c
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getAdType()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void d(java.lang.String r2) {
            r1 = this;
            com.beizi.fusion.a r2 = r1.f7574h
            if (r2 == 0) goto L3f
            boolean r0 = r2 instanceof com.beizi.fusion.AdListener
            if (r0 == 0) goto Le
            com.beizi.fusion.AdListener r2 = (com.beizi.fusion.AdListener) r2
            r2.onAdClicked()
            goto L3f
        Le:
            boolean r0 = r2 instanceof com.beizi.fusion.RewardedVideoAdListener
            if (r0 == 0) goto L18
            com.beizi.fusion.RewardedVideoAdListener r2 = (com.beizi.fusion.RewardedVideoAdListener) r2
            r2.onRewardedVideoClick()
            goto L3f
        L18:
            boolean r0 = r2 instanceof com.beizi.fusion.NativeAdListener
            if (r0 == 0) goto L22
            com.beizi.fusion.NativeAdListener r2 = (com.beizi.fusion.NativeAdListener) r2
            r2.onAdClick()
            goto L3f
        L22:
            boolean r0 = r2 instanceof com.beizi.fusion.InterstitialAdListener
            if (r0 == 0) goto L2c
            com.beizi.fusion.InterstitialAdListener r2 = (com.beizi.fusion.InterstitialAdListener) r2
            r2.onAdClick()
            goto L3f
        L2c:
            boolean r0 = r2 instanceof com.beizi.fusion.NativeUnifiedAdListener
            if (r0 == 0) goto L36
            com.beizi.fusion.NativeUnifiedAdListener r2 = (com.beizi.fusion.NativeUnifiedAdListener) r2
            r2.onAdClick()
            goto L3f
        L36:
            boolean r0 = r2 instanceof com.beizi.fusion.b
            if (r0 == 0) goto L3f
            com.beizi.fusion.b r2 = (com.beizi.fusion.b) r2
            r2.b()
        L3f:
            r1.M()
            return
    }

    protected void e() {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$g r0 = r0.d
            r1 = 3
            r0.a(r1)
            r0 = 10140(0x279c, float:1.4209E-41)
            r2.a(r0)
            return
    }

    protected void e(java.lang.String r3) {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto La
            com.beizi.fusion.events.a$c r0 = r0.h
            r1 = 5
            r0.a(r3, r1)
        La:
            return
    }

    protected void f(java.lang.String r3) {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto La
            com.beizi.fusion.events.a$c r0 = r0.h
            r1 = 4
            r0.a(r3, r1)
        La:
            return
    }

    public boolean f() {
            r2 = this;
            int r0 = r2.p()
            r1 = 2
            if (r0 == r1) goto L10
            int r0 = r2.p()
            r1 = 3
            if (r0 == r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.X = r1
            return
    }

    public synchronized void h() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList<com.beizi.fusion.c.c> r0 = r2.f7577k     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L17
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L17
            com.beizi.fusion.c.c r1 = (com.beizi.fusion.c.c) r1     // Catch: java.lang.Throwable -> L17
            r1.a()     // Catch: java.lang.Throwable -> L17
            goto L7
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r2.K()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public void i() {
            r2 = this;
            com.beizi.fusion.a r0 = r2.f7574h
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof com.beizi.fusion.RewardedVideoAdListener
            if (r1 == 0) goto Ld
            com.beizi.fusion.RewardedVideoAdListener r0 = (com.beizi.fusion.RewardedVideoAdListener) r0
            r0.onRewarded()
        Ld:
            return
    }

    public void j() {
            r3 = this;
            r0 = 1
            r3.o = r0
            r3.y()
            r3.z()
            com.beizi.fusion.work.a r0 = r3.f7575i
            if (r0 == 0) goto L10
            r0.l()
        L10:
            int r0 = r3.P
            int r1 = r3.Q
            r2 = 0
            if (r0 == r1) goto L19
            r3.f7574h = r2
        L19:
            java.util.Map<java.lang.String, com.beizi.fusion.work.a> r0 = r3.f7576j
            if (r0 == 0) goto L20
            r0.clear()
        L20:
            java.util.ArrayList<com.beizi.fusion.c.c> r0 = r3.f7577k
            if (r0 == 0) goto L27
            r0.clear()
        L27:
            com.beizi.fusion.c.d r0 = r3.t
            if (r0 == 0) goto L2d
            r3.t = r2
        L2d:
            r3.C()
            r3.b()
            return
    }

    public void k() {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i
            if (r0 == 0) goto L7
            r0.m()
        L7:
            return
    }

    protected void l() {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto L2b
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 1
            if (r0 == r1) goto L23
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 3
            if (r0 == r1) goto L23
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 4
            if (r0 != r1) goto L2b
        L23:
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            r1 = 2
            r0.a(r1)
        L2b:
            return
    }

    protected void m() {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.F
            if (r0 == 0) goto L1f
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            if (r0 == 0) goto L17
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            int r0 = r0.a()
            r1 = 1
            if (r0 != r1) goto L1f
        L17:
            com.beizi.fusion.events.b r0 = r2.F
            com.beizi.fusion.events.a$j r0 = r0.j
            r1 = 5
            r0.a(r1)
        L1f:
            return
    }

    public java.util.Map<java.lang.String, com.beizi.fusion.work.a> n() {
            r1 = this;
            java.util.Map<java.lang.String, com.beizi.fusion.work.a> r0 = r1.f7576j
            return r0
    }

    public int o() {
            r1 = this;
            int r0 = r1.z
            return r0
    }

    public int p() {
            r1 = this;
            int r0 = r1.y
            return r0
    }

    public boolean q() {
            r1 = this;
            boolean r0 = com.beizi.fusion.c.d.r
            return r0
    }

    public int r() {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean r0 = r2.u
            if (r0 == 0) goto L1b
            com.beizi.fusion.model.AdSpacesBean$EventStrategyBean r0 = r0.getEventStrategy()
            if (r0 == 0) goto L1b
            com.beizi.fusion.model.AdSpacesBean r0 = r2.u
            com.beizi.fusion.model.AdSpacesBean$EventStrategyBean r0 = r0.getEventStrategy()
            int r1 = r0.getValidTimeShow()
            if (r1 < 0) goto L1b
            int r0 = r0.getValidTimeShow()
            return r0
        L1b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    public java.lang.String s() {
            r2 = this;
            com.beizi.fusion.work.a r0 = r2.f7575i
            if (r0 == 0) goto L19
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r0.j()
            if (r0 == 0) goto L19
            java.lang.String r1 = r0.getBuyerSpaceUuId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L19
            java.lang.String r0 = r0.getBuyerSpaceUuId()
            return r0
        L19:
            r0 = 0
            return r0
    }

    public java.lang.String t() {
            r1 = this;
            com.beizi.fusion.work.a r0 = r1.f7575i
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.aw()
            return r0
    }

    public long u() {
            r2 = this;
            long r0 = r2.U
            return r0
    }

    @Override // java.util.Observer
    public void update(java.util.Observable r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    public java.lang.String v() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "requestUuid"
            java.lang.String r2 = r3.f7571e     // Catch: org.json.JSONException -> Lf
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lf
            r3.a(r0)     // Catch: org.json.JSONException -> Lf
        Lf:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.X
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> x() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.V
            return r0
    }
}
