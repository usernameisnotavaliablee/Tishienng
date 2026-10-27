package com.beizi.fusion.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class a extends java.util.Observable implements com.beizi.fusion.c.c {
    private boolean A;
    private java.lang.String B;
    private int C;
    private boolean D;
    private boolean E;
    private java.lang.String F;
    private boolean G;
    private boolean H;
    protected com.beizi.fusion.events.b a;
    protected com.beizi.fusion.events.EventBean b;
    protected java.lang.String c;
    protected com.beizi.fusion.c.d d;
    protected com.beizi.fusion.model.AdSpacesBean.BuyerBean e;
    protected com.beizi.fusion.model.AdSpacesBean.ForwardBean f;
    protected com.beizi.fusion.c.e g;
    protected java.lang.String h;
    protected java.lang.String i;
    protected com.beizi.fusion.e.a j;
    protected int k;

    /* renamed from: l, reason: collision with root package name */
    protected long f126l;

    /* renamed from: m, reason: collision with root package name */
    @android.annotation.SuppressLint({"HandlerLeak"})
    protected android.os.Handler f127m;

    /* renamed from: n, reason: collision with root package name */
    private int f128n;

    /* renamed from: o, reason: collision with root package name */
    private int f129o;

    /* renamed from: p, reason: collision with root package name */
    private int f130p;

    /* renamed from: q, reason: collision with root package name */
    private int f131q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f132r;

    /* renamed from: s, reason: collision with root package name */
    private long f133s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f134t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f135u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f136v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f137w;

    /* renamed from: x, reason: collision with root package name */
    private java.util.TimerTask f138x;

    /* renamed from: y, reason: collision with root package name */
    private java.util.Timer f139y;

    /* renamed from: z, reason: collision with root package name */
    private long f140z;


    public a() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.g = r0
            com.beizi.fusion.e.a r1 = com.beizi.fusion.e.a.a
            r5.j = r1
            r1 = 0
            r5.f128n = r1
            r5.f129o = r1
            r5.f130p = r1
            r5.f131q = r1
            r5.f132r = r1
            r2 = 0
            r5.f133s = r2
            r5.f134t = r1
            r5.f135u = r1
            r5.f136v = r1
            r5.f137w = r1
            r5.f138x = r0
            r5.f139y = r0
            r5.f140z = r2
            r5.A = r1
            java.lang.String r4 = "WATERFALL"
            r5.B = r4
            r5.C = r1
            r5.D = r1
            r5.E = r1
            r5.F = r0
            r5.k = r1
            r5.f126l = r2
            com.beizi.fusion.work.a$1 r0 = new com.beizi.fusion.work.a$1
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r5, r2)
            r5.f127m = r0
            r5.G = r1
            r5.H = r1
            return
    }

    private boolean ay() {
            r1 = this;
            com.beizi.fusion.events.b r0 = r1.a
            if (r0 == 0) goto Lc
            boolean r0 = r0.c()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private void az() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mAdLifeManager != null ? "
            r0.append(r1)
            com.beizi.fusion.c.d r1 = r8.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.c.d r0 = r8.d
            if (r0 == 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "enter cancelExposureTaskIfNeed (System.currentTimeMillis() - mStartLoadTime) = "
            r0.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.f140z
            long r4 = r4 - r6
            r0.append(r4)
            java.lang.String r4 = ",mAdLifeManager.getValidExposureTime() = "
            r0.append(r4)
            com.beizi.fusion.c.d r4 = r8.d
            int r4 = r4.r()
            r0.append(r4)
            java.lang.String r4 = ",mExposureTimerTask != null ? "
            r0.append(r4)
            java.util.TimerTask r4 = r8.f138x
            if (r4 == 0) goto L50
            r4 = 1
            goto L51
        L50:
            r4 = 0
        L51:
            r0.append(r4)
            java.lang.String r4 = ",mExposureTimer != null ? "
            r0.append(r4)
            java.util.Timer r4 = r8.f139y
            if (r4 == 0) goto L5e
            r2 = 1
        L5e:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.beizi.fusion.tool.aa.c(r1, r0)
        L68:
            com.beizi.fusion.c.d r0 = r8.d
            if (r0 == 0) goto L8c
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.f140z
            long r0 = r0 - r2
            com.beizi.fusion.c.d r2 = r8.d
            int r2 = r2.r()
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L8c
            java.util.TimerTask r0 = r8.f138x
            if (r0 == 0) goto L8c
            java.util.Timer r0 = r8.f139y
            if (r0 == 0) goto L8c
            r0.cancel()
            r8.W()
        L8c:
            return
    }

    private boolean b() {
            r1 = this;
            boolean r0 = r1.ah()
            if (r0 == 0) goto Le
            boolean r0 = r1.w()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private boolean b(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void A() {
            r3 = this;
            boolean r0 = r3.ay()
            if (r0 == 0) goto L51
            r3.af()
            boolean r0 = r3.y()
            if (r0 == 0) goto L16
            r3.K()
            r0 = 3
            r3.a(r0)
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdLoadFail mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            boolean r0 = r3.b()
            if (r0 != 0) goto L51
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 11
            r0.a(r1, r2)
        L51:
            return
    }

    protected void B() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdShow mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 5
            r0.a(r1, r2)
        L38:
            return
    }

    protected void C() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdExposure mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 6
            r0.a(r1, r2)
        L38:
            return
    }

    protected void D() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdClick mManagerObserver.mChannelResultStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 7
            r0.a(r1, r2)
        L38:
            return
    }

    protected void E() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdClickCallBack mManagerObserver.mChannelResultStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 17
            r0.a(r1, r2)
        L39:
            return
    }

    protected void F() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdClose mManagerObserver.mChannelResultStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 9
            r0.a(r1, r2)
        L39:
            return
    }

    protected void G() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdClickClose mManagerObserver.mChannelResultStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 8
            r0.a(r1, r2)
        L39:
            return
    }

    protected void H() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdClickCallBack mManagerObserver.mChannelResultStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 22
            r0.a(r1, r2)
        L39:
            return
    }

    protected void I() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdRewarded mManagerObserver.mChannelResultStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 12
            r0.a(r1, r2)
        L39:
            return
    }

    public void J() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L35
            boolean r0 = r3.E
            if (r0 != 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportParticipateBid mManagerObserver.mBidChannelStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$a r1 = r1.k
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            r0 = 1
            r3.E = r0
        L35:
            return
    }

    protected void K() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportParticipateBid mManagerObserver.mBidChannelStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$a r1 = r1.k
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
        L2e:
            return
    }

    protected void L() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L26
            com.beizi.fusion.events.a$c r0 = r0.h
            java.lang.String r1 = r3.c
            r2 = 3
            r0.a(r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel == ---reportComparisonSuccess---"
            r0.append(r1)
            java.lang.String r1 = r3.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
        L26:
            return
    }

    protected void M() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L27
            com.beizi.fusion.events.a$c r0 = r0.h
            java.lang.String r1 = r3.c
            r2 = 8
            r0.a(r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel == ---reportComparisonSendWinNotification---"
            r0.append(r1)
            java.lang.String r1 = r3.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
        L27:
            return
    }

    protected void N() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L27
            com.beizi.fusion.events.a$c r0 = r0.h
            java.lang.String r1 = r3.c
            r2 = 9
            r0.a(r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel == ---reportComparisonSendLossNotification---"
            r0.append(r1)
            java.lang.String r1 = r3.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
        L27:
            return
    }

    protected void O() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L16
            com.beizi.fusion.events.a$c r0 = r0.h
            java.lang.String r1 = r3.c
            r2 = 1
            r0.a(r1, r2)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$c r0 = r0.h
            java.lang.String r1 = r3.c
            r2 = 4
            r0.a(r1, r2)
        L16:
            return
    }

    protected void P() {
            r0 = this;
            r0.O()
            return
    }

    protected void Q() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto Lc
            com.beizi.fusion.events.a$c r0 = r0.h
            java.lang.String r1 = r3.c
            r2 = 4
            r0.a(r1, r2)
        Lc:
            return
    }

    protected void R() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportChannelClickEnhance GrayPass mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$b r1 = r1.i
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$b r0 = r0.i
            java.lang.String r1 = r3.c
            r2 = 1
            r0.a(r1, r2)
        L38:
            return
    }

    protected void S() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportChannelClickEnhance RandomPass mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$b r1 = r1.i
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$b r0 = r0.i
            java.lang.String r1 = r3.c
            r2 = 2
            r0.a(r1, r2)
        L38:
            return
    }

    protected void T() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportChannelClickEnhance LayerPass mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$b r1 = r1.i
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$b r0 = r0.i
            java.lang.String r1 = r3.c
            r2 = 3
            r0.a(r1, r2)
        L38:
            return
    }

    protected void U() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportChannelClickEnhance ReduceArea mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$b r1 = r1.i
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$b r0 = r0.i
            java.lang.String r1 = r3.c
            r2 = 4
            r0.a(r1, r2)
        L38:
            return
    }

    protected void V() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportValidTimeExposure mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 13
            r0.a(r1, r2)
        L39:
            return
    }

    protected void W() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportNotEnoughExposureTime mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 14
            r0.a(r1, r2)
        L39:
            return
    }

    protected boolean X() {
            r2 = this;
            com.beizi.fusion.c.d r0 = r2.d
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "adStatus = "
            r0.append(r1)
            com.beizi.fusion.c.d r1 = r2.d
            int r1 = r1.p()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
        L20:
            com.beizi.fusion.c.d r0 = r2.d
            if (r0 == 0) goto L2c
            int r0 = r0.p()
            r1 = 1
            if (r0 >= r1) goto L2c
            return r1
        L2c:
            r0 = 0
            return r0
    }

    protected boolean Y() {
            r1 = this;
            com.beizi.fusion.c.d r0 = r1.d
            if (r0 == 0) goto L18
            boolean r0 = r0.f()
            if (r0 == 0) goto L18
            boolean r0 = r1.am()
            if (r0 != 0) goto L16
            boolean r0 = r1.ak()
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    protected void Z() {
            r1 = this;
            com.beizi.fusion.c.e r0 = r1.g
            if (r0 != 0) goto L16
            com.beizi.fusion.c.d r0 = r1.d
            if (r0 == 0) goto L16
            boolean r0 = r1.ay()
            if (r0 == 0) goto L16
            com.beizi.fusion.c.d r0 = r1.d
            com.beizi.fusion.c.e r0 = r0.a(r1)
            r1.g = r0
        L16:
            return
    }

    public void a() {
            r2 = this;
            com.beizi.fusion.e.a r0 = r2.h()
            com.beizi.fusion.e.a r1 = com.beizi.fusion.e.a.c
            if (r0 == r1) goto Lb
            r2.Q()
        Lb:
            return
    }

    protected void a(double r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3b
            java.lang.String r0 = "BEIZI"
            java.lang.String r1 = r3.f()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L22
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r3.e
            r0.setAvgPrice(r4)
            com.beizi.fusion.events.EventBean r0 = r3.b
            if (r0 == 0) goto L22
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r0.setBeiZiPrice(r1)
        L22:
            boolean r0 = r3.ak()
            if (r0 == 0) goto L38
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r3.e
            r0.setBidPrice(r4)
            com.beizi.fusion.events.EventBean r0 = r3.b
            if (r0 == 0) goto L38
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.setBidPrice(r4)
        L38:
            r3.ao()
        L3b:
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.f128n = r1
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.f133s = r1
            return
    }

    public void a(android.app.Activity r1) {
            r0 = this;
            return
    }

    public void a(android.content.Context r1) {
            r0 = this;
            return
    }

    protected void a(android.os.Message r3) {
            r2 = this;
            com.beizi.fusion.events.b r0 = r2.a
            if (r0 == 0) goto L30
            com.beizi.fusion.events.EventBean r0 = r2.b
            if (r0 == 0) goto L30
            java.lang.Object r1 = r3.obj
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setError(r1)
            com.beizi.fusion.events.EventBean r0 = r2.b
            int r3 = r3.arg1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setErrorCode(r3)
            r2.ao()
            r2.A()
            com.beizi.fusion.events.EventBean r3 = r2.b
            r0 = 0
            r3.setError(r0)
            com.beizi.fusion.events.EventBean r3 = r2.b
            r3.setErrorCode(r0)
            r2.ao()
        L30:
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.ForwardBean r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void a(com.beizi.fusion.model.ChannelBidResult r1) {
            r0 = this;
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.B = r1
            return
    }

    protected void a(java.lang.String r3, int r4) {
            r2 = this;
            boolean r0 = r2.ay()
            if (r0 == 0) goto L14
            android.os.Handler r0 = r2.f127m
            r1 = 3
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r3.arg1 = r4
            android.os.Handler r4 = r2.f127m
            r4.sendMessage(r3)
        L14:
            return
    }

    public void a(java.util.Map r1) {
            r0 = this;
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f132r = r1
            return
    }

    protected void aa() {
            r2 = this;
            boolean r0 = r2.f134t
            if (r0 != 0) goto L8
            com.beizi.fusion.c.d r0 = r2.d
            if (r0 != 0) goto L12
        L8:
            java.lang.String r0 = r2.f()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L25
        L12:
            com.beizi.fusion.c.d r0 = r2.d
            java.lang.String r1 = r2.f()
            r0.c(r1)
            r0 = 1
            r2.f134t = r0
            boolean r0 = r2.A
            if (r0 == 0) goto L25
            r2.az()
        L25:
            return
    }

    protected void ab() {
            r7 = this;
            com.beizi.fusion.c.d r0 = r7.d
            if (r0 == 0) goto L28
            boolean r0 = r7.an()
            if (r0 == 0) goto L28
            com.beizi.fusion.c.d r0 = r7.d
            java.lang.String r1 = r0.g()
            com.beizi.fusion.model.EventItem r2 = new com.beizi.fusion.model.EventItem
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r7.f()
            java.lang.String r5 = r7.i
            java.lang.String r6 = "255.200"
            r2.<init>(r6, r3, r4, r5)
            r0.a(r6, r1, r2)
        L28:
            return
    }

    protected void ac() {
            r7 = this;
            com.beizi.fusion.c.d r0 = r7.d
            if (r0 == 0) goto L28
            boolean r0 = r7.an()
            if (r0 == 0) goto L28
            com.beizi.fusion.c.d r0 = r7.d
            java.lang.String r1 = r0.g()
            com.beizi.fusion.model.EventItem r2 = new com.beizi.fusion.model.EventItem
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r7.f()
            java.lang.String r5 = r7.i
            java.lang.String r6 = "280.300"
            r2.<init>(r6, r3, r4, r5)
            r0.a(r6, r1, r2)
        L28:
            return
    }

    protected void ad() {
            r7 = this;
            com.beizi.fusion.c.d r0 = r7.d
            if (r0 == 0) goto L28
            boolean r0 = r7.an()
            if (r0 == 0) goto L28
            com.beizi.fusion.c.d r0 = r7.d
            java.lang.String r1 = r0.g()
            com.beizi.fusion.model.EventItem r2 = new com.beizi.fusion.model.EventItem
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r7.f()
            java.lang.String r5 = r7.i
            java.lang.String r6 = "290.300"
            r2.<init>(r6, r3, r4, r5)
            r0.a(r6, r1, r2)
        L28:
            return
    }

    protected void ae() {
            r7 = this;
            com.beizi.fusion.c.d r0 = r7.d
            if (r0 == 0) goto L28
            boolean r0 = r7.an()
            if (r0 == 0) goto L28
            com.beizi.fusion.c.d r0 = r7.d
            java.lang.String r1 = r0.g()
            com.beizi.fusion.model.EventItem r2 = new com.beizi.fusion.model.EventItem
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r7.f()
            java.lang.String r5 = r7.i
            java.lang.String r6 = "280.500"
            r2.<init>(r6, r3, r4, r5)
            r0.a(r6, r1, r2)
        L28:
            return
    }

    protected void af() {
            r1 = this;
            boolean r0 = r1.ah()
            if (r0 == 0) goto La
            r0 = 3
            r1.b(r0)
        La:
            return
    }

    protected void ag() {
            r2 = this;
            int r0 = r2.p()
            r1 = 3
            if (r0 == r1) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mWorker = "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ",set ad suc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZisBid"
            com.beizi.fusion.tool.aa.a(r1, r0)
            r0 = 2
            r2.b(r0)
        L26:
            return
    }

    public boolean ah() {
            r1 = this;
            boolean r0 = r1.ai()
            return r0
    }

    protected boolean ai() {
            r2 = this;
            java.lang.String r0 = "C2S"
            java.lang.String r1 = r2.g()
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    protected boolean aj() {
            r2 = this;
            java.lang.String r0 = "S2S"
            java.lang.String r1 = r2.g()
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    protected boolean ak() {
            r1 = this;
            boolean r0 = r1.aj()
            if (r0 != 0) goto Lf
            boolean r0 = r1.ai()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public boolean al() {
            r2 = this;
            java.lang.String r0 = "BPDI"
            java.lang.String r1 = r2.g()
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public boolean am() {
            r1 = this;
            boolean r0 = r1.an()
            if (r0 != 0) goto Lf
            boolean r0 = r1.al()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    protected boolean an() {
            r2 = this;
            java.lang.String r0 = "WATERFALL"
            java.lang.String r1 = r2.g()
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    protected void ao() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto Lf
            com.beizi.fusion.events.a r0 = r0.a()
            java.lang.String r1 = r3.c
            com.beizi.fusion.events.EventBean r2 = r3.b
            r0.a(r1, r2)
        Lf:
            return
    }

    protected void ap() {
            r2 = this;
            r2.A()
            com.beizi.fusion.c.d r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = 10140(0x279c, float:1.4209E-41)
            r0.a(r1)
        Lc:
            return
    }

    public int aq() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    protected void ar() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L45
            java.lang.String r0 = "C2S"
            java.lang.String r1 = r3.g()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportC2SPrice mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 20
            r0.a(r1, r2)
        L45:
            return
    }

    public com.beizi.fusion.NativeUnifiedAdResponse as() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.beizi.fusion.c.e at() {
            r1 = this;
            com.beizi.fusion.c.e r0 = r1.g
            return r0
    }

    public void au() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            r4.f126l = r0
            return
    }

    public java.util.Map av() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String aw() {
            r1 = this;
            r0 = 0
            return r0
    }

    public org.json.JSONObject ax() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void b(int r1) {
            r0 = this;
            r0.f130p = r1
            return
    }

    public void b(com.beizi.fusion.model.ChannelBidResult r1) {
            r0 = this;
            return
    }

    public void b(java.util.Map r1) {
            r0 = this;
            return
    }

    protected void c(int r5) {
            r4 = this;
            com.beizi.fusion.e.a r0 = r4.j
            com.beizi.fusion.e.a r1 = com.beizi.fusion.e.a.b
            if (r0 != r1) goto L42
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.e
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.getBuyerSpaceUuId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L42
            com.beizi.fusion.c.d r0 = r4.d
            java.lang.String r0 = r0.s()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L42
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.e
            java.lang.String r0 = r0.getBuyerSpaceUuId()
            com.beizi.fusion.c.d r1 = r4.d
            java.lang.String r1 = r1.s()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            com.beizi.fusion.e.a r0 = com.beizi.fusion.e.a.d
            r4.j = r0
            com.beizi.fusion.c.d r0 = r4.d
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r4.e
            java.lang.String r1 = r1.getBuyerSpaceUuId()
            r0.a(r1, r5)
            return
        L42:
            com.beizi.fusion.e.a r0 = com.beizi.fusion.e.a.d
            r4.j = r0
            com.beizi.fusion.c.d r0 = r4.d
            if (r0 == 0) goto L71
            com.beizi.fusion.model.AdSpacesBean$ForwardBean r0 = r4.f
            if (r0 == 0) goto L71
            boolean r0 = r4.X()
            if (r0 == 0) goto L65
            com.beizi.fusion.c.d r0 = r4.d
            com.beizi.fusion.model.AdSpacesBean$ForwardBean r1 = r4.f
            com.beizi.fusion.model.AdSpacesBean$ComponentBean r1 = r1.getComponent()
            java.lang.String r2 = r4.g()
            r3 = 1
            r0.a(r1, r2, r3, r5)
            return
        L65:
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "fail distribute direct fail"
            com.beizi.fusion.tool.aa.b(r0, r1)
            com.beizi.fusion.c.d r0 = r4.d
            r0.a(r5)
        L71:
            return
    }

    public boolean c() {
            r1 = this;
            boolean r0 = r1.D
            return r0
    }

    public abstract void d();

    public abstract void e();

    public abstract java.lang.String f();

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.B
            return r0
    }

    public abstract com.beizi.fusion.e.a h();

    public java.lang.String i() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.beizi.fusion.model.AdSpacesBean.BuyerBean j() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.e
            return r0
    }

    protected abstract void k();

    public void l() {
            r2 = this;
            android.os.Handler r0 = r2.f127m
            if (r0 == 0) goto L8
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        L8:
            return
    }

    public void m() {
            r0 = this;
            return
    }

    public void n() {
            r0 = this;
            return
    }

    public android.view.View o() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int p() {
            r1 = this;
            int r0 = r1.f130p
            return r0
    }

    public void q() {
            r0 = this;
            r0.L()
            return
    }

    protected void r() {
            r1 = this;
            com.beizi.fusion.c.d r0 = r1.d
            if (r0 == 0) goto La
            com.beizi.fusion.events.b r0 = r0.a()
            r1.a = r0
        La:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.e
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.getBuyerSpaceUuId()
            r1.c = r0
        L14:
            return
    }

    protected void s() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto Lf
            com.beizi.fusion.events.a r0 = r0.a()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r3.e
            com.beizi.fusion.model.AdSpacesBean$ForwardBean r2 = r3.f
            r0.a(r1, r2)
        Lf:
            return
    }

    protected void t() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportInitBegin mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 1
            r0.a(r1, r2)
        L38:
            return
    }

    protected void u() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportInitEnd mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 2
            r0.a(r1, r2)
        L38:
            return
    }

    protected void v() {
            r3 = this;
            com.beizi.fusion.events.b r0 = r3.a
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdRequest mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 3
            r0.a(r1, r2)
        L38:
            return
    }

    public boolean w() {
            r1 = this;
            boolean r0 = r1.G
            return r0
    }

    protected void x() {
            r3 = this;
            boolean r0 = r3.ay()
            if (r0 == 0) goto L59
            boolean r0 = r3.ai()
            if (r0 == 0) goto Lf
            r3.ar()
        Lf:
            boolean r0 = r3.y()
            if (r0 == 0) goto L1c
            r0 = 2
            r3.a(r0)
            r3.J()
        L1c:
            r3.z()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel "
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " reportAdLoaded mManagerObserver.mChannelResultStatus.getStatus(channel) = "
            r0.append(r1)
            com.beizi.fusion.events.b r1 = r3.a
            com.beizi.fusion.events.a$f r1 = r1.g
            java.lang.String r2 = r3.c
            int r1 = r1.a(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            boolean r0 = r3.b()
            if (r0 != 0) goto L59
            com.beizi.fusion.events.b r0 = r3.a
            com.beizi.fusion.events.a$f r0 = r0.g
            java.lang.String r1 = r3.c
            r2 = 4
            r0.a(r1, r2)
        L59:
            return
    }

    protected boolean y() {
            r1 = this;
            boolean r0 = r1.ah()
            if (r0 == 0) goto Le
            boolean r0 = r1.w()
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    protected void z() {
            r0 = this;
            return
    }
}
