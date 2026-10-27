package com.beizi.fusion.work.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b extends com.beizi.fusion.work.c.a {
    private java.lang.String A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private android.view.View H;
    private java.lang.String I;
    private boolean J;
    private boolean K;
    private java.lang.Boolean L;
    private boolean M;
    private long N;
    private long O;
    private long P;
    private boolean Q;
    private boolean R;
    private long S;
    private int T;
    private int U;
    private android.widget.FrameLayout V;
    private boolean W;
    private java.lang.String[] X;
    private long Y;
    private java.lang.String Z;
    private boolean aa;
    private boolean ab;
    private java.lang.String ac;
    private boolean ad;
    private boolean ae;
    private android.view.ViewGroup af;
    private android.widget.FrameLayout ag;
    private long ah;
    private boolean ai;
    private android.view.ViewTreeObserver.OnScrollChangedListener aj;
    private android.view.ViewTreeObserver.OnScrollChangedListener ak;

    /* renamed from: v, reason: collision with root package name */
    private com.beizi.ad.v2.d.c f187v;

    /* renamed from: w, reason: collision with root package name */
    private com.beizi.ad.i f188w;

    /* renamed from: x, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean f189x;

    /* renamed from: y, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean f190y;

    /* renamed from: z, reason: collision with root package name */
    private com.beizi.fusion.tool.ab f191z;













    public b(android.content.Context r9, long r10, long r12, com.beizi.fusion.model.AdSpacesBean.BuyerBean r14, com.beizi.fusion.model.AdSpacesBean.ForwardBean r15, com.beizi.fusion.c.d r16, int r17, boolean r18, boolean r19) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r9 = 0
            r8.A = r9
            r12 = 0
            r8.B = r12
            r8.C = r12
            r8.D = r12
            r8.G = r12
            r8.I = r9
            r9 = 4
            java.lang.String[] r9 = new java.lang.String[r9]
            r8.X = r9
            java.lang.String r9 = "#00000000"
            r8.ac = r9
            com.beizi.fusion.work.c.b$11 r9 = new com.beizi.fusion.work.c.b$11
            r9.<init>(r8)
            r8.aj = r9
            com.beizi.fusion.work.c.b$2 r9 = new com.beizi.fusion.work.c.b$2
            r9.<init>(r8)
            r8.ak = r9
            r8.O = r10
            r9 = r18
            r8.J = r9
            r9 = r19
            r8.K = r9
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r9 = r8.e
            com.beizi.fusion.model.AdSpacesBean$NativeOptimizeBean r9 = r9.getNativeOptimize()
            if (r9 == 0) goto L8e
            java.lang.String r10 = r9.getNativeUuid()
            r8.Z = r10
            com.beizi.fusion.model.AdSpacesBean$NativeOptimizeAdSlideBean r10 = r9.getAdSlide()
            if (r10 == 0) goto L66
            int r11 = r10.getRandomNum()
            boolean r11 = com.beizi.fusion.tool.af.a(r11)
            r8.R = r11
            int r11 = r10.getNeedTime()
            long r13 = (long) r11
            r8.S = r13
            int r10 = r10.getDistance()
            r8.T = r10
        L66:
            int r10 = r9.getCloseClickNum()
            boolean r10 = com.beizi.fusion.tool.af.a(r10)
            r8.ab = r10
            int r10 = r9.getTouchDownNum()
            boolean r10 = com.beizi.fusion.tool.af.a(r10)
            r8.ad = r10
            int r10 = r9.getHoldSlideNum()
            boolean r10 = com.beizi.fusion.tool.af.a(r10)
            r8.ae = r10
            int r9 = r9.getAddClickNum()
            boolean r9 = com.beizi.fusion.tool.af.a(r9)
            r8.ai = r9
        L8e:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r9 = r8.e     // Catch: java.lang.Exception -> Lc6
            java.util.List r9 = r9.getCallBackStrategy()     // Catch: java.lang.Exception -> Lc6
            if (r9 == 0) goto Lcb
            int r10 = r9.size()     // Catch: java.lang.Exception -> Lc6
            if (r10 <= 0) goto Lcb
            r10 = 1
            r8.C = r10     // Catch: java.lang.Exception -> Lc6
        L9f:
            int r10 = r9.size()     // Catch: java.lang.Exception -> Lc6
            if (r12 >= r10) goto Lcb
            java.lang.Object r10 = r9.get(r12)     // Catch: java.lang.Exception -> Lc6
            com.beizi.fusion.model.AdSpacesBean$CallBackStrategyBean r10 = (com.beizi.fusion.model.AdSpacesBean.CallBackStrategyBean) r10     // Catch: java.lang.Exception -> Lc6
            java.lang.String r11 = "290.300"
            java.lang.String r13 = r10.getEventCode()     // Catch: java.lang.Exception -> Lc6
            boolean r11 = r11.equalsIgnoreCase(r13)     // Catch: java.lang.Exception -> Lc6
            if (r11 == 0) goto Lc8
            java.lang.String r9 = r10.getRate()     // Catch: java.lang.Exception -> Lc6
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> Lc6
            boolean r9 = com.beizi.fusion.tool.af.a(r9)     // Catch: java.lang.Exception -> Lc6
            r8.D = r9     // Catch: java.lang.Exception -> Lc6
            goto Lcb
        Lc6:
            goto Lcb
        Lc8:
            int r12 = r12 + 1
            goto L9f
        Lcb:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r9 = r8.e
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r9 = r9.getShakeView()
            r8.f189x = r9
            if (r9 == 0) goto Leb
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r9 = r9.getCoolShakeView()
            r8.f190y = r9
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r9 = r8.f189x
            int r9 = r9.getClkremove()
            r8.G = r9
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r9 = r8.f189x
            java.lang.String r9 = r9.getTitle()
            r8.I = r9
        Leb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "cool_"
            r9.append(r10)
            java.lang.String r10 = r8.i
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.A = r9
            return
    }

    static /* synthetic */ int A(com.beizi.fusion.work.c.b r0) {
            int r0 = r0.U
            return r0
    }

    static /* synthetic */ int B(com.beizi.fusion.work.c.b r0) {
            int r0 = r0.T
            return r0
    }

    static /* synthetic */ android.widget.FrameLayout C(com.beizi.fusion.work.c.b r0) {
            android.widget.FrameLayout r0 = r0.ag
            return r0
    }

    static /* synthetic */ long D(com.beizi.fusion.work.c.b r2) {
            long r0 = r2.ah
            return r0
    }

    static /* synthetic */ android.view.ViewGroup E(com.beizi.fusion.work.c.b r0) {
            android.view.ViewGroup r0 = r0.af
            return r0
    }

    private int a(java.lang.String r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L7
            goto L37
        L7:
            java.lang.String r0 = "left"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L37
            r1 = 0
            if (r0 == 0) goto L11
            goto L34
        L11:
            java.lang.String r0 = "center"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L25
            if (r4 <= r5) goto L20
            int r4 = r4 - r5
            int r4 = r4 / 2
        L1e:
            int r6 = r6 - r4
            goto L34
        L20:
            int r5 = r5 - r4
            int r5 = r5 / 2
        L23:
            int r6 = r6 + r5
            goto L34
        L25:
            java.lang.String r0 = "right"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L33
            if (r4 <= r5) goto L31
            int r4 = r4 - r5
            goto L1e
        L31:
            int r5 = r5 - r4
            goto L23
        L33:
            r6 = 0
        L34:
            if (r6 >= 0) goto L37
            return r1
        L37:
            return r6
    }

    static /* synthetic */ long a(com.beizi.fusion.work.c.b r0, long r1) {
            r0.N = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.i a(com.beizi.fusion.work.c.b r0, com.beizi.ad.i r1) {
            r0.f188w = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.v2.d.c a(com.beizi.fusion.work.c.b r0) {
            com.beizi.ad.v2.d.c r0 = r0.f187v
            return r0
    }

    static /* synthetic */ com.beizi.fusion.e.a a(com.beizi.fusion.work.c.b r0, com.beizi.fusion.e.a r1) {
            r0.j = r1
            return r1
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean> r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L23
            if (r5 != 0) goto L6
            goto L23
        L6:
            java.util.Iterator r4 = r4.iterator()
        La:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataShakeViewBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean) r1
            java.util.List r2 = r1.getOrderList()
            if (r2 == 0) goto La
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto La
            return r1
        L23:
            return r0
    }

    static /* synthetic */ java.lang.Boolean a(com.beizi.fusion.work.c.b r0, java.lang.Boolean r1) {
            r0.L = r1
            return r1
    }

    private void a(int r6, int r7, int r8) {
            r5 = this;
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> Ld2
            boolean r0 = r0.n()     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Lc
            goto Ld2
        Lc:
            boolean r0 = r5.aQ()     // Catch: java.lang.Exception -> Ld2
            if (r0 != 0) goto L14
            goto Ld2
        L14:
            com.beizi.fusion.tool.ab r0 = r5.f191z     // Catch: java.lang.Exception -> Ld2
            if (r0 != 0) goto L21
            com.beizi.fusion.tool.ab r0 = new com.beizi.fusion.tool.ab     // Catch: java.lang.Exception -> Ld2
            android.content.Context r1 = r5.f179n     // Catch: java.lang.Exception -> Ld2
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ld2
            r5.f191z = r0     // Catch: java.lang.Exception -> Ld2
        L21:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r5.f189x     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Ld2
            com.beizi.fusion.tool.ab r1 = r5.f191z     // Catch: java.lang.Exception -> Ld2
            if (r1 == 0) goto Ld2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r0 = r0.getPosition()     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Ld2
            com.beizi.fusion.events.EventBean r0 = r5.b     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L3f
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r1 = r5.f189x     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = r1.getShakeViewUuid()     // Catch: java.lang.Exception -> Ld2
            r0.setShakeViewUuid(r1)     // Catch: java.lang.Exception -> Ld2
            r5.ao()     // Catch: java.lang.Exception -> Ld2
        L3f:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r5.f189x     // Catch: java.lang.Exception -> Ld2
            java.util.List r0 = r0.getOrderData()     // Catch: java.lang.Exception -> Ld2
            com.beizi.ad.v2.d.c r1 = r5.f187v     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = r1.b()     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataShakeViewBean r0 = r5.a(r0, r1)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L5c
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r1 = r0.getShakeView()     // Catch: java.lang.Exception -> Ld2
            if (r1 == 0) goto L5c
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r0.getShakeView()     // Catch: java.lang.Exception -> Ld2
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r7 > 0) goto L60
            r7 = r8
        L60:
            com.beizi.fusion.tool.ab r8 = r5.f191z     // Catch: java.lang.Exception -> Ld2
            java.lang.Boolean r1 = r5.L     // Catch: java.lang.Exception -> Ld2
            r8.a(r1)     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.tool.ab r8 = r5.f191z     // Catch: java.lang.Exception -> Ld2
            android.content.Context r1 = r5.f179n     // Catch: java.lang.Exception -> Ld2
            float r2 = (float) r6     // Catch: java.lang.Exception -> Ld2
            int r1 = com.beizi.fusion.tool.ap.b(r1, r2)     // Catch: java.lang.Exception -> Ld2
            android.content.Context r2 = r5.f179n     // Catch: java.lang.Exception -> Ld2
            float r3 = (float) r7     // Catch: java.lang.Exception -> Ld2
            int r2 = com.beizi.fusion.tool.ap.b(r2, r3)     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r3 = r5.f189x     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r3 = r3.getPosition()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r4 = r5.I     // Catch: java.lang.Exception -> Ld2
            android.view.View r8 = r8.a(r1, r2, r3, r4)     // Catch: java.lang.Exception -> Ld2
            r5.H = r8     // Catch: java.lang.Exception -> Ld2
            if (r8 == 0) goto Lb3
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()     // Catch: java.lang.Exception -> Ld2
            boolean r1 = r8 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch: java.lang.Exception -> Ld2
            if (r1 == 0) goto Lb3
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8     // Catch: java.lang.Exception -> Ld2
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Ld2
            int r2 = r8.width     // Catch: java.lang.Exception -> Ld2
            int r3 = r8.height     // Catch: java.lang.Exception -> Ld2
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> Ld2
            int r2 = r8.leftMargin     // Catch: java.lang.Exception -> Ld2
            r1.leftMargin = r2     // Catch: java.lang.Exception -> Ld2
            int r8 = r8.topMargin     // Catch: java.lang.Exception -> Ld2
            r1.topMargin = r8     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r8 = r5.f189x     // Catch: java.lang.Exception -> Ld2
            if (r8 == 0) goto Lb3
            int r8 = r8.getIsHideAnim()     // Catch: java.lang.Exception -> Ld2
            if (r8 != 0) goto Lb3
            android.widget.FrameLayout r8 = r5.f184s     // Catch: java.lang.Exception -> Ld2
            android.view.View r2 = r5.H     // Catch: java.lang.Exception -> Ld2
            r8.addView(r2, r1)     // Catch: java.lang.Exception -> Ld2
        Lb3:
            r5.a(r0)     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.tool.ab r8 = r5.f191z     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.work.c.b$6 r0 = new com.beizi.fusion.work.c.b$6     // Catch: java.lang.Exception -> Ld2
            r0.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> Ld2
            r8.a(r0)     // Catch: java.lang.Exception -> Ld2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r6 = r5.f190y     // Catch: java.lang.Exception -> Ld2
            if (r6 == 0) goto Lcb
            com.beizi.fusion.tool.ab r7 = r5.f191z     // Catch: java.lang.Exception -> Ld2
            java.lang.String r8 = r5.A     // Catch: java.lang.Exception -> Ld2
            r7.a(r6, r8)     // Catch: java.lang.Exception -> Ld2
        Lcb:
            com.beizi.fusion.tool.ab r6 = r5.f191z     // Catch: java.lang.Exception -> Ld2
            android.widget.FrameLayout r7 = r5.f184s     // Catch: java.lang.Exception -> Ld2
            r6.a(r7)     // Catch: java.lang.Exception -> Ld2
        Ld2:
            return
    }

    private void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean r3) {
            r2 = this;
            if (r3 == 0) goto L3
            goto L5
        L3:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r3 = r2.f189x     // Catch: java.lang.Exception -> L40
        L5:
            int r0 = r3.getRegulatoryAngle()     // Catch: java.lang.Exception -> L40
            com.beizi.fusion.tool.ab r1 = r2.f191z     // Catch: java.lang.Exception -> L40
            if (r1 == 0) goto L10
            r1.c(r0)     // Catch: java.lang.Exception -> L40
        L10:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f190y     // Catch: java.lang.Exception -> L40
            r1 = 1
            if (r0 != 0) goto L1d
            r2.B = r1     // Catch: java.lang.Exception -> L40
            com.beizi.fusion.tool.ab r0 = r2.f191z     // Catch: java.lang.Exception -> L40
            r0.a(r3)     // Catch: java.lang.Exception -> L40
            return
        L1d:
            boolean r0 = r2.b(r3)     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L2b
            com.beizi.fusion.tool.ab r3 = r2.f191z     // Catch: java.lang.Exception -> L40
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f190y     // Catch: java.lang.Exception -> L40
            r3.a(r0)     // Catch: java.lang.Exception -> L40
            return
        L2b:
            boolean r0 = r2.aP()     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L39
            com.beizi.fusion.tool.ab r3 = r2.f191z     // Catch: java.lang.Exception -> L40
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f190y     // Catch: java.lang.Exception -> L40
            r3.a(r0)     // Catch: java.lang.Exception -> L40
            return
        L39:
            r2.B = r1     // Catch: java.lang.Exception -> L40
            com.beizi.fusion.tool.ab r0 = r2.f191z     // Catch: java.lang.Exception -> L40
            r0.a(r3)     // Catch: java.lang.Exception -> L40
        L40:
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.c.b r0, double r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.c.b r0, int r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.c.b r0, int r1, int r2, int r3) {
            r0.a(r1, r2, r3)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.c.b r0, java.lang.String r1, int r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.c.b r0, java.util.List r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.c.b r0, java.lang.String[] r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.c.b r0, java.lang.String[] r1, int r2) {
            r0.a(r1, r2)
            return
    }

    private void a(java.lang.String[] r12) {
            r11 = this;
            r11.aT()     // Catch: java.lang.Exception -> L3e
            com.beizi.ad.i r0 = r11.f188w     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L3e
            android.widget.FrameLayout r0 = r11.f184s     // Catch: java.lang.Exception -> L3e
            if (r0 != 0) goto Lc
            goto L3e
        Lc:
            boolean r0 = r11.aa     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L11
            goto L3e
        L11:
            r0 = 1
            r11.Q = r0     // Catch: java.lang.Exception -> L3e
            r11.aa = r0     // Catch: java.lang.Exception -> L3e
            com.beizi.fusion.events.EventBean r1 = r11.b     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L22
            java.lang.String r2 = r11.Z     // Catch: java.lang.Exception -> L3e
            r1.setNativeRuleUuid(r2)     // Catch: java.lang.Exception -> L3e
            r11.ao()     // Catch: java.lang.Exception -> L3e
        L22:
            com.beizi.ad.i r3 = r11.f188w     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L3e
            android.widget.FrameLayout r4 = r11.f184s     // Catch: java.lang.Exception -> L3e
            if (r4 == 0) goto L3e
            r1 = 0
            r5 = r12[r1]     // Catch: java.lang.Exception -> L3e
            r6 = r12[r0]     // Catch: java.lang.Exception -> L3e
            r0 = 2
            r7 = r12[r0]     // Catch: java.lang.Exception -> L3e
            r0 = 3
            r8 = r12[r0]     // Catch: java.lang.Exception -> L3e
            com.beizi.fusion.work.c.b$4 r10 = new com.beizi.fusion.work.c.b$4     // Catch: java.lang.Exception -> L3e
            r10.<init>(r11)     // Catch: java.lang.Exception -> L3e
            r9 = 0
            r3.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L3e
        L3e:
            return
    }

    private void a(java.lang.String[] r12, int r13) {
            r11 = this;
            r11.aT()     // Catch: java.lang.Exception -> L42
            com.beizi.ad.i r0 = r11.f188w     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L42
            android.widget.FrameLayout r0 = r11.f184s     // Catch: java.lang.Exception -> L42
            if (r0 != 0) goto Lc
            goto L42
        Lc:
            boolean r0 = r11.aa     // Catch: java.lang.Exception -> L42
            if (r0 != 0) goto L42
            boolean r0 = r11.Q     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L15
            goto L42
        L15:
            r0 = 1
            r11.Q = r0     // Catch: java.lang.Exception -> L42
            r11.aa = r0     // Catch: java.lang.Exception -> L42
            com.beizi.fusion.events.EventBean r1 = r11.b     // Catch: java.lang.Exception -> L42
            if (r1 == 0) goto L26
            java.lang.String r2 = r11.Z     // Catch: java.lang.Exception -> L42
            r1.setNativeRuleUuid(r2)     // Catch: java.lang.Exception -> L42
            r11.ao()     // Catch: java.lang.Exception -> L42
        L26:
            com.beizi.ad.i r3 = r11.f188w     // Catch: java.lang.Exception -> L42
            if (r3 == 0) goto L42
            android.widget.FrameLayout r4 = r11.f184s     // Catch: java.lang.Exception -> L42
            if (r4 == 0) goto L42
            r1 = 0
            r5 = r12[r1]     // Catch: java.lang.Exception -> L42
            r6 = r12[r0]     // Catch: java.lang.Exception -> L42
            r0 = 2
            r7 = r12[r0]     // Catch: java.lang.Exception -> L42
            r0 = 3
            r8 = r12[r0]     // Catch: java.lang.Exception -> L42
            com.beizi.fusion.work.c.b$9 r10 = new com.beizi.fusion.work.c.b$9     // Catch: java.lang.Exception -> L42
            r10.<init>(r11)     // Catch: java.lang.Exception -> L42
            r9 = r13
            r3.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L42
        L42:
            return
    }

    static /* synthetic */ boolean a(com.beizi.fusion.work.c.b r0, boolean r1) {
            r0.M = r1
            return r1
    }

    private java.lang.String[] a(android.view.View r17, android.view.View r18, float r19, float r20, float r21, float r22) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r5]
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Exception -> Ldf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldf
            r8.<init>()     // Catch: java.lang.Exception -> Ldf
            r8.append(r2)     // Catch: java.lang.Exception -> Ldf
            r8.append(r4)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldf
            r7[r5] = r8     // Catch: java.lang.Exception -> Ldf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldf
            r8.<init>()     // Catch: java.lang.Exception -> Ldf
            r8.append(r3)     // Catch: java.lang.Exception -> Ldf
            r8.append(r4)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldf
            r9 = 1
            r7[r9] = r8     // Catch: java.lang.Exception -> Ldf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldf
            r8.<init>()     // Catch: java.lang.Exception -> Ldf
            r10 = r21
            r8.append(r10)     // Catch: java.lang.Exception -> Ldf
            r8.append(r4)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldf
            r10 = 2
            r7[r10] = r8     // Catch: java.lang.Exception -> Ldf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldf
            r8.<init>()     // Catch: java.lang.Exception -> Ldf
            r11 = r22
            r8.append(r11)     // Catch: java.lang.Exception -> Ldf
            r8.append(r4)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldf
            r11 = 3
            r7[r11] = r8     // Catch: java.lang.Exception -> Ldf
            if (r0 == 0) goto Lde
            if (r1 != 0) goto L61
            goto Lde
        L61:
            int[] r6 = new int[r10]     // Catch: java.lang.Exception -> Ldc
            r0.getLocationOnScreen(r6)     // Catch: java.lang.Exception -> Ldc
            int r6 = r0.getWidth()     // Catch: java.lang.Exception -> Ldc
            int r0 = r0.getHeight()     // Catch: java.lang.Exception -> Ldc
            double r12 = (double) r2     // Catch: java.lang.Exception -> Ldc
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r12 = r12 * r14
            r2 = 0
            double r5 = (double) r6     // Catch: java.lang.Exception -> Ldc
            double r12 = r12 / r5
            int r5 = (int) r12     // Catch: java.lang.Exception -> Ldc
            double r12 = (double) r3     // Catch: java.lang.Exception -> Ldc
            double r12 = r12 * r14
            double r14 = (double) r0     // Catch: java.lang.Exception -> Ldc
            double r12 = r12 / r14
            int r0 = (int) r12     // Catch: java.lang.Exception -> Ldc
            int r3 = r1.getWidth()     // Catch: java.lang.Exception -> Ldc
            int r6 = r1.getHeight()     // Catch: java.lang.Exception -> Ldc
            int[] r8 = new int[r10]     // Catch: java.lang.Exception -> Ldc
            r1.getLocationOnScreen(r8)     // Catch: java.lang.Exception -> Ldc
            int r3 = r3 * r5
            int r3 = r3 / 100
            int r6 = r6 * r0
            int r6 = r6 / 100
            r0 = r8[r2]     // Catch: java.lang.Exception -> Ldc
            int r0 = r0 + r3
            r1 = r8[r9]     // Catch: java.lang.Exception -> Ldc
            int r1 = r1 + r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r5.<init>()     // Catch: java.lang.Exception -> Ldc
            r5.append(r3)     // Catch: java.lang.Exception -> Ldc
            r5.append(r4)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> Ldc
            r7[r2] = r3     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r2.<init>()     // Catch: java.lang.Exception -> Ldc
            r2.append(r6)     // Catch: java.lang.Exception -> Ldc
            r2.append(r4)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Ldc
            r7[r9] = r2     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r2.<init>()     // Catch: java.lang.Exception -> Ldc
            r2.append(r0)     // Catch: java.lang.Exception -> Ldc
            r2.append(r4)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Ldc
            r7[r10] = r0     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r0.<init>()     // Catch: java.lang.Exception -> Ldc
            r0.append(r1)     // Catch: java.lang.Exception -> Ldc
            r0.append(r4)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Ldc
            r7[r11] = r0     // Catch: java.lang.Exception -> Ldc
        Ldc:
            r6 = r7
            goto Ldf
        Lde:
            return r7
        Ldf:
            return r6
    }

    static /* synthetic */ java.lang.String[] a(com.beizi.fusion.work.c.b r0, android.view.View r1, android.view.View r2, float r3, float r4, float r5, float r6) {
            java.lang.String[] r0 = r0.a(r1, r2, r3, r4, r5, r6)
            return r0
    }

    private void aN() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r5.Y = r0
            android.content.Context r0 = r5.f179n
            float r0 = com.beizi.fusion.tool.ap.k(r0)
            android.content.Context r1 = r5.f179n
            r2 = 1109393408(0x42200000, float:40.0)
            int r1 = com.beizi.fusion.tool.ap.a(r1, r2)
            int r2 = r5.E
            float r2 = (float) r2
            r3 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 / r3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L77
            int r0 = r5.F
            if (r0 >= r1) goto L23
            goto L77
        L23:
            com.beizi.fusion.e.a r0 = com.beizi.fusion.e.a.c
            r5.j = r0
            boolean r0 = r5.M
            if (r0 == 0) goto L4d
            com.beizi.fusion.events.EventBean r0 = r5.b
            java.lang.String r1 = "1"
            r0.setIsCacheAd(r1)
            long r0 = r5.N
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4a
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.N
            long r0 = r0 - r2
            com.beizi.fusion.events.EventBean r2 = r5.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.setCacheTime(r0)
        L4a:
            r5.ao()
        L4d:
            com.beizi.fusion.c.d r0 = r5.d
            if (r0 == 0) goto L61
            int r0 = r0.o()
            r1 = 2
            if (r0 == r1) goto L61
            com.beizi.fusion.c.d r0 = r5.d
            java.lang.String r1 = r5.f()
            r0.b(r1)
        L61:
            boolean r0 = r5.f185t
            if (r0 != 0) goto L71
            r0 = 1
            r5.f185t = r0
            r5.B()
            r5.C()
            r5.ac()
        L71:
            r5.aS()
            r5.aU()
        L77:
            return
    }

    private void aO() {
            r2 = this;
            r0 = 1
            r2.Q = r0     // Catch: java.lang.Exception -> L5d
            r0 = 0
            r2.aa = r0     // Catch: java.lang.Exception -> L5d
            r2.ab = r0     // Catch: java.lang.Exception -> L5d
            r2.aT()     // Catch: java.lang.Exception -> L5d
            boolean r0 = r2.C     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L1f
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L1f
            com.beizi.fusion.events.EventBean r1 = r2.b     // Catch: java.lang.Exception -> L5d
            java.lang.String r0 = r0.getCallBackStrategyUuid()     // Catch: java.lang.Exception -> L5d
            r1.setCallBackStrategyUuid(r0)     // Catch: java.lang.Exception -> L5d
            r2.ao()     // Catch: java.lang.Exception -> L5d
        L1f:
            r2.E()     // Catch: java.lang.Exception -> L5d
            boolean r0 = r2.C     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L2b
            boolean r0 = r2.D     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto L2b
            goto L5d
        L2b:
            com.beizi.fusion.c.d r0 = r2.d     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L3f
            int r0 = r0.o()     // Catch: java.lang.Exception -> L5d
            r1 = 2
            if (r0 == r1) goto L3f
            com.beizi.fusion.c.d r0 = r2.d     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = r2.f()     // Catch: java.lang.Exception -> L5d
            r0.d(r1)     // Catch: java.lang.Exception -> L5d
        L3f:
            r2.D()     // Catch: java.lang.Exception -> L5d
            r2.ad()     // Catch: java.lang.Exception -> L5d
            int r0 = r2.G     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto L4a
            goto L5d
        L4a:
            com.beizi.fusion.tool.ab r0 = r2.f191z     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L5d
            android.view.View r1 = r2.H     // Catch: java.lang.Exception -> L5d
            if (r1 != 0) goto L53
            goto L5d
        L53:
            r0.c()     // Catch: java.lang.Exception -> L5d
            android.view.View r0 = r2.H     // Catch: java.lang.Exception -> L5d
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L5d
        L5d:
            return
    }

    private boolean aP() {
            r5 = this;
            android.content.Context r0 = r5.f179n     // Catch: java.lang.Exception -> L1b
            java.lang.Long r0 = com.beizi.fusion.tool.ap.o(r0)     // Catch: java.lang.Exception -> L1b
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L1b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1b
            long r2 = r2 - r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r5.f190y     // Catch: java.lang.Exception -> L1b
            long r0 = r0.getUserProtectTime()     // Catch: java.lang.Exception -> L1b
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    private boolean aQ() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r1.f189x
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getRenderRate()
            boolean r0 = com.beizi.fusion.tool.af.a(r0)
            return r0
    }

    private void aR() {
            r5 = this;
            com.beizi.ad.i r0 = r5.f188w     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L5
            goto L3d
        L5:
            boolean r1 = r5.K     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto La
            goto L3d
        La:
            com.beizi.ad.lance.ApkBean r0 = r0.n()     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L11
            goto L3d
        L11:
            android.content.Context r0 = r5.f179n     // Catch: java.lang.Exception -> L3d
            com.beizi.ad.i r1 = r5.f188w     // Catch: java.lang.Exception -> L3d
            android.view.View r0 = com.beizi.ad.internal.e.f.a(r0, r1)     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L1c
            goto L3d
        L1c:
            android.widget.FrameLayout r1 = r5.f184s     // Catch: java.lang.Exception -> L3d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L3d
            int r1 = r1.width     // Catch: java.lang.Exception -> L3d
            int r1 = r1 * 2
            int r1 = r1 / 3
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L3d
            r3 = -2
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L3d
            r0.setLayoutParams(r2)     // Catch: java.lang.Exception -> L3d
            android.widget.FrameLayout r1 = r5.f184s     // Catch: java.lang.Exception -> L3d
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L3d
            r4 = 51
            r2.<init>(r3, r3, r4)     // Catch: java.lang.Exception -> L3d
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> L3d
        L3d:
            return
    }

    private void aS() {
            r3 = this;
            boolean r0 = r3.R     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5a
            android.widget.FrameLayout r0 = r3.f184s     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5a
            android.content.Context r0 = r3.f179n     // Catch: java.lang.Exception -> L5a
            if (r0 != 0) goto Ld
            goto L5a
        Ld:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout     // Catch: java.lang.Exception -> L5a
            android.content.Context r1 = r3.f179n     // Catch: java.lang.Exception -> L5a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L5a
            r3.V = r0     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r0 = r3.f184s     // Catch: java.lang.Exception -> L5a
            int r0 = r0.getWidth()     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r1 = r3.f184s     // Catch: java.lang.Exception -> L5a
            int r1 = r1.getHeight()     // Catch: java.lang.Exception -> L5a
            r2 = -1
            if (r0 > 0) goto L26
            r0 = -1
        L26:
            if (r1 > 0) goto L29
            r1 = -1
        L29:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L5a
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r0 = r3.V     // Catch: java.lang.Exception -> L5a
            r0.setLayoutParams(r2)     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r0 = r3.V     // Catch: java.lang.Exception -> L5a
            java.lang.String r1 = r3.ac     // Catch: java.lang.Exception -> L5a
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L5a
            r0.setBackgroundColor(r1)     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r0 = r3.f184s     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r1 = r3.V     // Catch: java.lang.Exception -> L5a
            r0.addView(r1)     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r0 = r3.V     // Catch: java.lang.Exception -> L5a
            com.beizi.fusion.work.c.b$10 r1 = new com.beizi.fusion.work.c.b$10     // Catch: java.lang.Exception -> L5a
            r1.<init>(r3)     // Catch: java.lang.Exception -> L5a
            r0.setOnTouchListener(r1)     // Catch: java.lang.Exception -> L5a
            android.widget.FrameLayout r0 = r3.V     // Catch: java.lang.Exception -> L5a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Exception -> L5a
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r3.aj     // Catch: java.lang.Exception -> L5a
            r0.addOnScrollChangedListener(r1)     // Catch: java.lang.Exception -> L5a
        L5a:
            return
    }

    private void aT() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.V     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L11
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r3.aj     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto L11
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Exception -> L3d
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r3.aj     // Catch: java.lang.Exception -> L3d
            r0.removeOnScrollChangedListener(r1)     // Catch: java.lang.Exception -> L3d
        L11:
            android.widget.FrameLayout r0 = r3.f184s     // Catch: java.lang.Exception -> L3d
            r1 = 0
            if (r0 == 0) goto L1f
            android.widget.FrameLayout r2 = r3.V     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L1f
            r0.removeView(r2)     // Catch: java.lang.Exception -> L3d
            r3.V = r1     // Catch: java.lang.Exception -> L3d
        L1f:
            android.widget.FrameLayout r0 = r3.f184s     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L30
            android.view.ViewTreeObserver$OnScrollChangedListener r2 = r3.ak     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L30
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Exception -> L3d
            android.view.ViewTreeObserver$OnScrollChangedListener r2 = r3.ak     // Catch: java.lang.Exception -> L3d
            r0.removeOnScrollChangedListener(r2)     // Catch: java.lang.Exception -> L3d
        L30:
            android.view.ViewGroup r0 = r3.af     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L3d
            android.widget.FrameLayout r2 = r3.ag     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L3d
            r0.removeView(r2)     // Catch: java.lang.Exception -> L3d
            r3.ag = r1     // Catch: java.lang.Exception -> L3d
        L3d:
            return
    }

    private void aU() {
            r14 = this;
            android.widget.FrameLayout r0 = r14.f184s     // Catch: java.lang.Throwable -> L13b
            if (r0 == 0) goto L13b
            android.content.Context r0 = r14.f179n     // Catch: java.lang.Throwable -> L13b
            if (r0 == 0) goto L13b
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r14.e     // Catch: java.lang.Throwable -> L13b
            if (r0 != 0) goto Le
            goto L13b
        Le:
            boolean r1 = r14.ad     // Catch: java.lang.Throwable -> L13b
            if (r1 != 0) goto L18
            boolean r1 = r14.ae     // Catch: java.lang.Throwable -> L13b
            if (r1 != 0) goto L18
            goto L13b
        L18:
            com.beizi.fusion.model.AdSpacesBean$NativeOptimizeBean r0 = r0.getNativeOptimize()     // Catch: java.lang.Throwable -> L13b
            if (r0 != 0) goto L20
            goto L13b
        L20:
            com.beizi.fusion.model.AdSpacesBean$NativeOptimizeClickAreaBean r0 = r0.getClickArea()     // Catch: java.lang.Throwable -> L13b
            if (r0 != 0) goto L28
            goto L13b
        L28:
            int r1 = r0.getRandomNum()     // Catch: java.lang.Throwable -> L13b
            boolean r1 = com.beizi.fusion.tool.af.a(r1)     // Catch: java.lang.Throwable -> L13b
            if (r1 != 0) goto L34
            goto L13b
        L34:
            int r1 = r0.getReference()     // Catch: java.lang.Throwable -> L13b
            java.lang.String r2 = r0.getWidth()     // Catch: java.lang.Throwable -> L13b
            java.lang.String r3 = r0.getHeight()     // Catch: java.lang.Throwable -> L13b
            java.lang.String r4 = r0.getHorizontalSpace()     // Catch: java.lang.Throwable -> L13b
            java.lang.String r0 = r0.getVerticalSpace()     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r5 = r14.f184s     // Catch: java.lang.Throwable -> L13b
            android.view.View r5 = r5.getRootView()     // Catch: java.lang.Throwable -> L13b
            if (r5 != 0) goto L52
            goto L13b
        L52:
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = r5.findViewById(r6)     // Catch: java.lang.Throwable -> L13b
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch: java.lang.Throwable -> L13b
            r14.af = r5     // Catch: java.lang.Throwable -> L13b
            if (r5 != 0) goto L61
            goto L13b
        L61:
            android.content.Context r5 = r14.f179n     // Catch: java.lang.Throwable -> L13b
            int r5 = com.beizi.fusion.tool.ap.m(r5)     // Catch: java.lang.Throwable -> L13b
            android.content.Context r6 = r14.f179n     // Catch: java.lang.Throwable -> L13b
            int r6 = com.beizi.fusion.tool.ap.n(r6)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r7 = r14.f184s     // Catch: java.lang.Throwable -> L13b
            int r7 = r7.getWidth()     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r8 = r14.f184s     // Catch: java.lang.Throwable -> L13b
            int r8 = r8.getHeight()     // Catch: java.lang.Throwable -> L13b
            r9 = 2
            int[] r9 = new int[r9]     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r10 = r14.f184s     // Catch: java.lang.Throwable -> L13b
            r10.getLocationOnScreen(r9)     // Catch: java.lang.Throwable -> L13b
            r10 = 0
            r11 = r9[r10]     // Catch: java.lang.Throwable -> L13b
            r12 = 1
            r9 = r9[r12]     // Catch: java.lang.Throwable -> L13b
            r13 = -1
            if (r1 != 0) goto L8d
            r5 = r7
            r6 = r8
            goto L92
        L8d:
            if (r1 != r12) goto L90
            goto L92
        L90:
            r5 = -1
            r6 = -1
        L92:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            java.lang.String r12 = "%"
            if (r1 != 0) goto Lb7
            boolean r1 = r2.endsWith(r12)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            if (r1 == 0) goto Lb3
            int r1 = r2.indexOf(r12)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            java.lang.String r1 = r2.substring(r10, r1)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            int r1 = r1 * r5
            int r5 = r1 / 100
            goto Lb7
        Lb1:
            goto Ld8
        Lb3:
            int r5 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
        Lb7:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            if (r1 != 0) goto Ld8
            boolean r1 = r3.endsWith(r12)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            if (r1 == 0) goto Ld4
            int r1 = r3.indexOf(r12)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            java.lang.String r1 = r3.substring(r10, r1)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
            int r1 = r1 * r6
            int r6 = r1 / 100
            goto Ld8
        Ld4:
            int r6 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Lb1 java.lang.Throwable -> L13b
        Ld8:
            if (r5 >= 0) goto Ldb
            r5 = -1
        Ldb:
            if (r6 >= 0) goto Lde
            goto Ldf
        Lde:
            r13 = r6
        Ldf:
            android.widget.FrameLayout r1 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L13b
            android.content.Context r2 = r14.f179n     // Catch: java.lang.Throwable -> L13b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13b
            r14.ag = r1     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L13b
            r1.<init>(r5, r13)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r2 = r14.ag     // Catch: java.lang.Throwable -> L13b
            r2.setLayoutParams(r1)     // Catch: java.lang.Throwable -> L13b
            int r1 = r14.a(r4, r5, r7, r11)     // Catch: java.lang.Throwable -> L13b
            int r0 = r14.b(r0, r13, r8, r9)     // Catch: java.lang.Throwable -> L13b
            android.content.Context r2 = r14.f179n     // Catch: java.lang.Throwable -> L13b
            r3 = 1103626240(0x41c80000, float:25.0)
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Throwable -> L13b
            if (r0 <= r2) goto L105
            int r0 = r0 - r2
        L105:
            android.widget.FrameLayout r2 = r14.ag     // Catch: java.lang.Throwable -> L13b
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L13b
            r2.setX(r1)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r1 = r14.ag     // Catch: java.lang.Throwable -> L13b
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L13b
            r1.setY(r0)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r0 = r14.ag     // Catch: java.lang.Throwable -> L13b
            java.lang.String r1 = r14.ac     // Catch: java.lang.Throwable -> L13b
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> L13b
            r0.setBackgroundColor(r1)     // Catch: java.lang.Throwable -> L13b
            android.view.ViewGroup r0 = r14.af     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r1 = r14.ag     // Catch: java.lang.Throwable -> L13b
            r0.addView(r1)     // Catch: java.lang.Throwable -> L13b
            r0 = 4
            float[] r0 = new float[r0]     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r1 = r14.ag     // Catch: java.lang.Throwable -> L13b
            com.beizi.fusion.work.c.b$12 r2 = new com.beizi.fusion.work.c.b$12     // Catch: java.lang.Throwable -> L13b
            r2.<init>(r14, r0)     // Catch: java.lang.Throwable -> L13b
            r1.setOnTouchListener(r2)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r0 = r14.f184s     // Catch: java.lang.Throwable -> L13b
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Throwable -> L13b
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r14.ak     // Catch: java.lang.Throwable -> L13b
            r0.addOnScrollChangedListener(r1)     // Catch: java.lang.Throwable -> L13b
        L13b:
            return
    }

    static /* synthetic */ int b(com.beizi.fusion.work.c.b r0, int r1) {
            r0.E = r1
            return r1
    }

    private int b(java.lang.String r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L7
            goto L37
        L7:
            java.lang.String r0 = "top"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L37
            r1 = 0
            if (r0 == 0) goto L11
            goto L34
        L11:
            java.lang.String r0 = "center"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L25
            if (r4 <= r5) goto L20
            int r4 = r4 - r5
            int r4 = r4 / 2
        L1e:
            int r6 = r6 - r4
            goto L34
        L20:
            int r5 = r5 - r4
            int r5 = r5 / 2
        L23:
            int r6 = r6 + r5
            goto L34
        L25:
            java.lang.String r0 = "bottom"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L33
            if (r4 <= r5) goto L31
            int r4 = r4 - r5
            goto L1e
        L31:
            int r5 = r5 - r4
            goto L23
        L33:
            r6 = 0
        L34:
            if (r6 >= 0) goto L37
            return r1
        L37:
            return r6
    }

    static /* synthetic */ long b(com.beizi.fusion.work.c.b r0, long r1) {
            r0.P = r1
            return r1
    }

    private void b(java.util.List<android.view.View> r3) {
            r2 = this;
            if (r3 == 0) goto L8
            int r0 = r3.size()
            if (r0 != 0) goto Ld
        L8:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        Ld:
            boolean r0 = r2.ai
            if (r0 == 0) goto L18
            android.widget.FrameLayout r0 = r2.f184s
            if (r0 == 0) goto L18
            r3.add(r0)
        L18:
            int r0 = r3.size()
            if (r0 != 0) goto L1f
            goto L3b
        L1f:
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L32
            goto L23
        L32:
            com.beizi.fusion.work.c.b$3 r1 = new com.beizi.fusion.work.c.b$3
            r1.<init>(r2, r0)
            r0.setOnTouchListener(r1)
            goto L23
        L3b:
            return
    }

    private boolean b(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean r7) {
            r6 = this;
            android.content.Context r0 = r6.f179n
            java.lang.String r1 = r6.A
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = com.beizi.fusion.tool.an.b(r0, r1, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L47
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r6.f190y
            long r0 = r0.getCoolTime()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L3e
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.beizi.fusion.work.c.b$7 r1 = new com.beizi.fusion.work.c.b$7
            r1.<init>(r6, r7)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r7 = r6.f190y
            long r4 = r7.getCoolTime()
            long r4 = r4 - r2
            r0.postDelayed(r1, r4)
            r7 = 1
            return r7
        L3e:
            com.beizi.fusion.tool.ak r7 = com.beizi.fusion.tool.ak.a()
            java.lang.String r0 = r6.A
            r7.a(r0)
        L47:
            return r4
    }

    static /* synthetic */ boolean b(com.beizi.fusion.work.c.b r0) {
            boolean r0 = r0.M
            return r0
    }

    static /* synthetic */ boolean b(com.beizi.fusion.work.c.b r0, boolean r1) {
            r0.Q = r1
            return r1
    }

    static /* synthetic */ int c(com.beizi.fusion.work.c.b r0, int r1) {
            r0.F = r1
            return r1
    }

    static /* synthetic */ long c(com.beizi.fusion.work.c.b r0, long r1) {
            r0.ah = r1
            return r1
    }

    static /* synthetic */ com.beizi.fusion.events.EventBean c(com.beizi.fusion.work.c.b r0) {
            com.beizi.fusion.events.EventBean r0 = r0.b
            return r0
    }

    static /* synthetic */ boolean c(com.beizi.fusion.work.c.b r0, boolean r1) {
            r0.aa = r1
            return r1
    }

    static /* synthetic */ int d(com.beizi.fusion.work.c.b r0, int r1) {
            r0.U = r1
            return r1
    }

    static /* synthetic */ long d(com.beizi.fusion.work.c.b r2) {
            long r0 = r2.N
            return r0
    }

    static /* synthetic */ boolean d(com.beizi.fusion.work.c.b r0, boolean r1) {
            r0.B = r1
            return r1
    }

    static /* synthetic */ com.beizi.fusion.events.EventBean e(com.beizi.fusion.work.c.b r0) {
            com.beizi.fusion.events.EventBean r0 = r0.b
            return r0
    }

    static /* synthetic */ boolean e(com.beizi.fusion.work.c.b r0, boolean r1) {
            r0.W = r1
            return r1
    }

    static /* synthetic */ void f(com.beizi.fusion.work.c.b r0) {
            r0.ao()
            return
    }

    static /* synthetic */ void g(com.beizi.fusion.work.c.b r0) {
            r0.x()
            return
    }

    static /* synthetic */ void h(com.beizi.fusion.work.c.b r0) {
            r0.aR()
            return
    }

    static /* synthetic */ int i(com.beizi.fusion.work.c.b r0) {
            int r0 = r0.E
            return r0
    }

    static /* synthetic */ int j(com.beizi.fusion.work.c.b r0) {
            int r0 = r0.F
            return r0
    }

    static /* synthetic */ boolean k(com.beizi.fusion.work.c.b r0) {
            boolean r0 = r0.ad
            return r0
    }

    static /* synthetic */ boolean l(com.beizi.fusion.work.c.b r0) {
            boolean r0 = r0.ae
            return r0
    }

    static /* synthetic */ com.beizi.ad.i m(com.beizi.fusion.work.c.b r0) {
            com.beizi.ad.i r0 = r0.f188w
            return r0
    }

    static /* synthetic */ void n(com.beizi.fusion.work.c.b r0) {
            r0.aO()
            return
    }

    static /* synthetic */ void o(com.beizi.fusion.work.c.b r0) {
            r0.aN()
            return
    }

    static /* synthetic */ boolean p(com.beizi.fusion.work.c.b r0) {
            boolean r0 = r0.aa
            return r0
    }

    static /* synthetic */ boolean q(com.beizi.fusion.work.c.b r0) {
            boolean r0 = r0.B
            return r0
    }

    static /* synthetic */ com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean r(com.beizi.fusion.work.c.b r0) {
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r0.f190y
            return r0
    }

    static /* synthetic */ com.beizi.fusion.tool.ab s(com.beizi.fusion.work.c.b r0) {
            com.beizi.fusion.tool.ab r0 = r0.f191z
            return r0
    }

    static /* synthetic */ java.lang.String t(com.beizi.fusion.work.c.b r0) {
            java.lang.String r0 = r0.A
            return r0
    }

    static /* synthetic */ java.lang.String[] u(com.beizi.fusion.work.c.b r0) {
            java.lang.String[] r0 = r0.X
            return r0
    }

    static /* synthetic */ boolean v(com.beizi.fusion.work.c.b r0) {
            boolean r0 = r0.W
            return r0
    }

    static /* synthetic */ boolean w(com.beizi.fusion.work.c.b r0) {
            boolean r0 = r0.Q
            return r0
    }

    static /* synthetic */ long x(com.beizi.fusion.work.c.b r2) {
            long r0 = r2.Y
            return r0
    }

    static /* synthetic */ long y(com.beizi.fusion.work.c.b r2) {
            long r0 = r2.S
            return r0
    }

    static /* synthetic */ long z(com.beizi.fusion.work.c.b r2) {
            long r0 = r2.P
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public void a(android.view.View r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.beizi.fusion.work.c.b$8 r0 = new com.beizi.fusion.work.c.b$8
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            return
    }

    @Override // com.beizi.fusion.work.c.a
    public void a(java.util.List<android.view.View> r3) {
            r2 = this;
            android.widget.FrameLayout r0 = r2.f184s     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L11
            r2.aJ()     // Catch: java.lang.Throwable -> L11
            android.widget.FrameLayout r0 = r2.f184s     // Catch: java.lang.Throwable -> L11
            com.beizi.fusion.work.c.b$5 r1 = new com.beizi.fusion.work.c.b$5     // Catch: java.lang.Throwable -> L11
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L11
            r0.post(r1)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    @Override // com.beizi.fusion.work.a
    public void a(java.util.Map r6) {
            r5 = this;
            java.lang.String r0 = "auctionExt"
            java.lang.String r1 = "highestLossPrice"
            java.lang.String r2 = "adnId"
            java.lang.String r3 = "winPrice"
            com.beizi.ad.v2.d.c r4 = r5.f187v     // Catch: java.lang.Exception -> L8b
            if (r4 != 0) goto Le
            goto L8b
        Le:
            r4.a(r6)     // Catch: java.lang.Exception -> L8b
            boolean r4 = r6.containsKey(r3)     // Catch: java.lang.Exception -> L8b
            if (r4 == 0) goto L2e
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L2e
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r4 == 0) goto L2e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L8b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L8b
            if (r4 != 0) goto L2e
            com.beizi.fusion.events.EventBean r4 = r5.b     // Catch: java.lang.Exception -> L8b
            r4.setWinPrice(r3)     // Catch: java.lang.Exception -> L8b
        L2e:
            boolean r3 = r6.containsKey(r2)     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L4b
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L4b
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L4b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L8b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L8b
            if (r3 != 0) goto L4b
            com.beizi.fusion.events.EventBean r3 = r5.b     // Catch: java.lang.Exception -> L8b
            r3.setAdnId(r2)     // Catch: java.lang.Exception -> L8b
        L4b:
            boolean r2 = r6.containsKey(r1)     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L68
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Exception -> L8b
            if (r1 == 0) goto L68
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L68
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L8b
            if (r2 != 0) goto L68
            com.beizi.fusion.events.EventBean r2 = r5.b     // Catch: java.lang.Exception -> L8b
            r2.setHighestLossPrice(r1)     // Catch: java.lang.Exception -> L8b
        L68:
            boolean r1 = r6.containsKey(r0)     // Catch: java.lang.Exception -> L8b
            if (r1 == 0) goto L85
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L8b
            if (r6 == 0) goto L85
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L85
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L8b
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L8b
            if (r0 != 0) goto L85
            com.beizi.fusion.events.EventBean r0 = r5.b     // Catch: java.lang.Exception -> L8b
            r0.setSecondPrice(r6)     // Catch: java.lang.Exception -> L8b
        L85:
            r5.ao()     // Catch: java.lang.Exception -> L8b
            r5.M()     // Catch: java.lang.Exception -> L8b
        L8b:
            return
    }

    @Override // com.beizi.fusion.work.c.a
    public java.lang.String aA() {
            r4 = this;
            com.beizi.ad.i r0 = r4.f188w
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L31
            com.beizi.ad.i r0 = r4.f188w
            java.lang.String r0 = r0.c()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L30
            com.beizi.ad.i r1 = r4.f188w
            java.util.ArrayList r1 = r1.j()
            if (r1 == 0) goto L30
            int r2 = r1.size()
            r3 = 2
            if (r2 < r3) goto L30
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L30:
            return r0
        L31:
            r0 = 0
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public java.lang.String aB() {
            r1 = this;
            com.beizi.ad.i r0 = r1.f188w
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.d()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
            com.beizi.ad.i r0 = r1.f188w
            java.lang.String r0 = r0.d()
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public java.lang.String aC() {
            r1 = this;
            com.beizi.ad.i r0 = r1.f188w
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
            com.beizi.ad.i r0 = r1.f188w
            java.lang.String r0 = r0.b()
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public java.util.List<java.lang.String> aD() {
            r4 = this;
            com.beizi.ad.i r0 = r4.f188w
            if (r0 == 0) goto L26
            java.util.ArrayList r0 = r0.i()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.beizi.ad.i r3 = r4.f188w
            java.util.ArrayList r3 = r3.i()
            int r3 = r3.size()
            if (r3 <= 0) goto L1c
            r1 = 1
        L1c:
            r0 = r0 & r1
            if (r0 == 0) goto L26
            com.beizi.ad.i r0 = r4.f188w
            java.util.ArrayList r0 = r0.i()
            return r0
        L26:
            r0 = 0
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public int aE() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public java.lang.String aF() {
            r4 = this;
            com.beizi.ad.i r0 = r4.f188w
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L26
            com.beizi.ad.i r1 = r4.f188w
            java.util.ArrayList r1 = r1.j()
            if (r1 == 0) goto L26
            int r2 = r1.size()
            r3 = 3
            if (r2 < r3) goto L26
            r0 = 2
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L26
        L25:
            r0 = 0
        L26:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2e
            java.lang.String r0 = "查看详情"
        L2e:
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public boolean aG() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public android.view.ViewGroup aH() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.f184s
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public void aJ() {
            r7 = this;
            com.beizi.ad.i r0 = r7.f188w     // Catch: java.lang.Exception -> L7c
            if (r0 != 0) goto L5
            goto L7c
        L5:
            boolean r0 = r7.J     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto La
            goto L7c
        La:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> L7c
            android.content.Context r1 = r7.f179n     // Catch: java.lang.Exception -> L7c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L7c
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L7c
            r2 = 17
            r3 = -2
            r1.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L7c
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L7c
            com.beizi.ad.i r1 = r7.f188w     // Catch: java.lang.Exception -> L7c
            com.beizi.ad.internal.f.c$a r1 = r1.l()     // Catch: java.lang.Exception -> L7c
            android.content.Context r4 = r7.f179n     // Catch: java.lang.Exception -> L7c
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.a(r4, r1)     // Catch: java.lang.Exception -> L7c
            r4 = 0
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L7c
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L7c
            r6 = 1099431936(0x41880000, float:17.0)
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L7c
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L7c
            com.beizi.ad.i r1 = r7.f188w     // Catch: java.lang.Exception -> L7c
            com.beizi.ad.internal.f.c$a r1 = r1.k()     // Catch: java.lang.Exception -> L7c
            android.content.Context r5 = r7.f179n     // Catch: java.lang.Exception -> L7c
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.b(r5, r1)     // Catch: java.lang.Exception -> L7c
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L7c
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L7c
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L7c
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L7c
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L7c
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5     // Catch: java.lang.Exception -> L7c
            r6 = 5
            r5.setMargins(r6, r4, r4, r4)     // Catch: java.lang.Exception -> L7c
            r5.gravity = r2     // Catch: java.lang.Exception -> L7c
            r1.setLayoutParams(r5)     // Catch: java.lang.Exception -> L7c
            android.widget.FrameLayout r1 = r7.f184s     // Catch: java.lang.Exception -> L7c
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L7c
            r5 = 85
            r2.<init>(r3, r3, r5)     // Catch: java.lang.Exception -> L7c
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> L7c
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L7c
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch: java.lang.Exception -> L7c
            android.content.Context r2 = r7.f179n     // Catch: java.lang.Exception -> L7c
            r3 = 1086324736(0x40c00000, float:6.0)
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L7c
            r1.setMargins(r4, r4, r2, r2)     // Catch: java.lang.Exception -> L7c
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L7c
        L7c:
            return
    }

    @Override // com.beizi.fusion.work.c.a
    public java.lang.String aK() {
            r2 = this;
            com.beizi.ad.v2.d.c r0 = r2.f187v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.beizi.ad.i r0 = r2.f188w     // Catch: java.lang.Exception -> L14
            com.beizi.ad.internal.f.c$a r0 = r0.l()     // Catch: java.lang.Exception -> L14
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            return r1
    }

    @Override // com.beizi.fusion.work.c.a
    public com.beizi.fusion.model.UnifiedAdDownloadAppInfo aL() {
            r5 = this;
            r0 = 0
            com.beizi.ad.i r1 = r5.f188w     // Catch: java.lang.Exception -> L58
            com.beizi.ad.lance.ApkBean r1 = r1.n()     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto La
            return r0
        La:
            com.beizi.fusion.model.UnifiedAdDownloadAppInfo r2 = new com.beizi.fusion.model.UnifiedAdDownloadAppInfo     // Catch: java.lang.Exception -> L58
            r2.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r1.getApkName()     // Catch: java.lang.Exception -> L58
            r2.setAppName(r3)     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r1.getAppVersion()     // Catch: java.lang.Exception -> L58
            r2.setAppVersion(r3)     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r1.getAppDeveloper()     // Catch: java.lang.Exception -> L58
            r2.setAppDeveloper(r3)     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r1.getAppPermissionsUrl()     // Catch: java.lang.Exception -> L58
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L32
            r2.setAppPermission(r3)     // Catch: java.lang.Exception -> L58
            goto L3f
        L32:
            java.lang.String r3 = r1.getAppPermissionsDesc()     // Catch: java.lang.Exception -> L58
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L3f
            r2.setAppPermission(r3)     // Catch: java.lang.Exception -> L58
        L3f:
            java.lang.String r3 = r1.getAppPrivacyUrl()     // Catch: java.lang.Exception -> L58
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L58
            if (r3 != 0) goto L50
            java.lang.String r3 = r1.getAppPrivacyUrl()     // Catch: java.lang.Exception -> L58
            r2.setAppPrivacy(r3)     // Catch: java.lang.Exception -> L58
        L50:
            java.lang.String r1 = r1.getAppintro()     // Catch: java.lang.Exception -> L58
            r2.setAppIntro(r1)     // Catch: java.lang.Exception -> L58
            return r2
        L58:
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public java.lang.String aw() {
            r1 = this;
            com.beizi.ad.v2.d.c r0 = r1.f187v
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.h()
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public org.json.JSONObject ax() {
            r1 = this;
            com.beizi.ad.v2.d.c r0 = r1.f187v
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            org.json.JSONObject r0 = r0.m()
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public void ay() {
            r4 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r4.f179n
            r0.<init>(r1)
            r4.f184s = r0
            com.beizi.ad.v2.d.c r0 = new com.beizi.ad.v2.d.c
            android.content.Context r1 = r4.f179n
            java.lang.String r2 = r4.i
            com.beizi.fusion.work.c.b$1 r3 = new com.beizi.fusion.work.c.b$1
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            r4.f187v = r0
            r1 = 1
            r0.a(r1)
            com.beizi.fusion.events.EventBean r0 = r4.b     // Catch: java.lang.Exception -> L29
            com.beizi.fusion.events.EventBean r0 = r0.clone()     // Catch: java.lang.Exception -> L29
            com.beizi.ad.v2.d.c r1 = r4.f187v     // Catch: java.lang.Exception -> L29
            r1.a(r0)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
        L2a:
            com.beizi.ad.v2.d.c r0 = r4.f187v
            long r1 = r4.O
            int r2 = (int) r1
            r0.a(r2)
            com.beizi.ad.v2.d.c r0 = r4.f187v
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = r4.e
            r0.a(r1)
            java.lang.String r0 = "S2S"
            java.lang.String r1 = r4.g()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L61
            com.beizi.ad.v2.d.c r0 = r4.f187v
            java.lang.String r1 = r4.g()
            r0.c(r1)
            com.beizi.fusion.c.d r0 = r4.d
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.w()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L61
            com.beizi.ad.v2.d.c r1 = r4.f187v
            r1.b(r0)
        L61:
            com.beizi.fusion.c.d r0 = r4.d
            if (r0 == 0) goto L6e
            com.beizi.ad.v2.d.c r1 = r4.f187v
            java.util.Map r0 = r0.x()
            r1.c(r0)
        L6e:
            com.beizi.ad.v2.d.c r0 = r4.f187v
            r0.c()
            return
    }

    @Override // com.beizi.fusion.work.c.a
    public java.lang.String az() {
            r4 = this;
            com.beizi.ad.i r0 = r4.f188w
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L24
            com.beizi.ad.i r1 = r4.f188w
            java.util.ArrayList r1 = r1.j()
            if (r1 == 0) goto L24
            int r2 = r1.size()
            r3 = 1
            if (r2 < r3) goto L24
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L24:
            return r0
        L25:
            r0 = 0
            return r0
    }

    @Override // com.beizi.fusion.work.c.a
    public void b() {
            r6 = this;
            r6.t()
            android.content.Context r0 = r6.f179n
            java.lang.String r1 = r6.h
            com.beizi.fusion.c.l.a(r0, r1)
            r6.u()
            r6.f()
            long r0 = r6.f180o
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1f
            android.os.Handler r2 = r6.f127m
            r2.sendEmptyMessageDelayed(r4, r0)
            return
        L1f:
            com.beizi.fusion.c.d r0 = r6.d
            if (r0 == 0) goto L35
            int r0 = r0.p()
            if (r0 >= r4) goto L35
            com.beizi.fusion.c.d r0 = r6.d
            int r0 = r0.o()
            r1 = 2
            if (r0 == r1) goto L35
            r6.k()
        L35:
            return
    }

    @Override // com.beizi.fusion.work.a
    public void b(java.util.Map r5) {
            r4 = this;
            java.lang.String r0 = "lossReason"
            java.lang.String r1 = "adnId"
            java.lang.String r2 = "winPrice"
            com.beizi.ad.v2.d.c r3 = r4.f187v     // Catch: java.lang.Exception -> L6b
            if (r3 != 0) goto Lb
            goto L6b
        Lb:
            r3.b(r5)     // Catch: java.lang.Exception -> L6b
            boolean r3 = r5.containsKey(r2)     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L2b
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L2b
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L2b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L6b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L6b
            if (r3 != 0) goto L2b
            com.beizi.fusion.events.EventBean r3 = r4.b     // Catch: java.lang.Exception -> L6b
            r3.setWinPrice(r2)     // Catch: java.lang.Exception -> L6b
        L2b:
            boolean r2 = r5.containsKey(r1)     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L48
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Exception -> L6b
            if (r1 == 0) goto L48
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L48
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L6b
            if (r2 != 0) goto L48
            com.beizi.fusion.events.EventBean r2 = r4.b     // Catch: java.lang.Exception -> L6b
            r2.setAdnId(r1)     // Catch: java.lang.Exception -> L6b
        L48:
            boolean r1 = r5.containsKey(r0)     // Catch: java.lang.Exception -> L6b
            if (r1 == 0) goto L65
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Exception -> L6b
            if (r5 == 0) goto L65
            boolean r0 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L65
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L6b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L6b
            if (r0 != 0) goto L65
            com.beizi.fusion.events.EventBean r0 = r4.b     // Catch: java.lang.Exception -> L6b
            r0.setLossReason(r5)     // Catch: java.lang.Exception -> L6b
        L65:
            r4.ao()     // Catch: java.lang.Exception -> L6b
            r4.N()     // Catch: java.lang.Exception -> L6b
        L6b:
            return
    }

    @Override // com.beizi.fusion.work.c.a, com.beizi.fusion.work.a
    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = "BEIZI"
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public java.lang.String i() {
            r1 = this;
            com.beizi.ad.v2.d.c r0 = r1.f187v
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public void l() {
            r1 = this;
            com.beizi.ad.i r0 = r1.f188w
            if (r0 == 0) goto L7
            r0.h()
        L7:
            com.beizi.ad.v2.d.c r0 = r1.f187v
            if (r0 == 0) goto Le
            r0.f()
        Le:
            com.beizi.fusion.tool.ab r0 = r1.f191z
            if (r0 == 0) goto L15
            r0.c()
        L15:
            r1.aT()
            return
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
            r1 = this;
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L11
            boolean r0 = r0.m()     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L11
            com.beizi.fusion.tool.ab r0 = r1.f191z     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L11
            r0.d()     // Catch: java.lang.Exception -> L11
        L11:
            return
    }

    @Override // com.beizi.fusion.work.a
    public void n() {
            r2 = this;
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L12
            boolean r0 = r0.m()     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L12
            com.beizi.fusion.tool.ab r0 = r2.f191z     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L12
            r1 = 0
            r0.a(r1)     // Catch: java.lang.Exception -> L12
        L12:
            return
    }

    @Override // com.beizi.fusion.work.a
    protected void z() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto Ld
            com.beizi.ad.v2.d.c r0 = r1.f187v
            if (r0 == 0) goto Ld
            r1.ag()
        Ld:
            return
    }
}
