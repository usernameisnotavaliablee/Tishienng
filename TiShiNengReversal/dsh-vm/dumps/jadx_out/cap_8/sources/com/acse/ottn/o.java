package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o {

    /* renamed from: c0, reason: collision with root package name */
    public static com.acse.ottn.o f2526c0 = null;
    public static java.lang.String d0 = "AppPageNameUtil";
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;
    public java.lang.String J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String O;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public java.lang.String X;
    public java.lang.String Y;
    public java.lang.String Z;
    public boolean a;

    /* renamed from: a0, reason: collision with root package name */
    public java.lang.String f2527a0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f2528b;

    /* renamed from: b0, reason: collision with root package name */
    public java.lang.String f2529b0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f2530c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f2531d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2532e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2533f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f2534g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f2535h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f2536i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f2537j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f2538k;
    public java.lang.String l;
    public java.lang.String m;
    public java.lang.String n;
    public java.lang.String o;
    public java.lang.String p;
    public java.lang.String q;
    public java.lang.String r;
    public java.lang.String s;
    public java.lang.String t;
    public java.lang.String u;
    public java.lang.String v;
    public java.lang.String w;
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.o f2539b;

        public a(com.acse.ottn.o r1, android.app.Activity r2) {
                r0 = this;
                r0.f2539b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.app.Activity r0 = r3.a
                java.lang.String r1 = "clipboard"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
                android.content.ClipData r0 = r0.getPrimaryClip()
                if (r0 == 0) goto L39
                int r1 = r0.getItemCount()
                if (r1 <= 0) goto L39
                r1 = 0
                android.content.ClipData$Item r0 = r0.getItemAt(r1)
                java.lang.CharSequence r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getFromClipboard text="
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "ShopHelpManager"
                com.acse.ottn.h2.a(r1, r0)
            L39:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.io.reactivex.functions.Consumer<java.util.List<java.lang.String>> {
        public final /* synthetic */ com.acse.ottn.o a;

        public b(com.acse.ottn.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.util.List<java.lang.String> r2) throws java.lang.Exception {
                r1 = this;
                com.acse.ottn.o r0 = r1.a
                com.acse.ottn.o.a(r0, r2)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.util.List<java.lang.String> r1) throws java.lang.Exception {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.util.List<java.lang.String> r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.o a;

        public c(com.acse.ottn.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.acse.ottn.io.reactivex.ObservableOnSubscribe<java.util.List<java.lang.String>> {
        public final /* synthetic */ com.acse.ottn.o a;

        public d(com.acse.ottn.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.io.reactivex.ObservableOnSubscribe
        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.a.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.ObservableOnSubscribe
        public /* synthetic */ void call(rx.l<? super java.util.List<java.lang.String>> r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.a.b(r0, r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.ObservableOnSubscribe
        public void subscribe(com.acse.ottn.io.reactivex.ObservableEmitter<java.util.List<java.lang.String>> r7) throws java.lang.Exception {
                r6 = this;
                android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                r1 = 0
                java.util.List r1 = r0.getInstalledApplications(r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L16:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L44
                java.lang.Object r3 = r1.next()
                android.content.pm.ApplicationInfo r3 = (android.content.pm.ApplicationInfo) r3
                java.lang.CharSequence r4 = r0.getApplicationLabel(r3)
                java.lang.String r4 = r4.toString()
                java.lang.String r3 = r3.packageName
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                java.lang.String r4 = "<---->"
                r5.append(r4)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r2.add(r3)
                goto L16
            L44:
                r7.onNext(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.o a;

        public e(com.acse.ottn.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r4) throws java.lang.Exception {
                r3 = this;
                java.lang.String r0 = com.acse.ottn.o.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "请求成功 string ="
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.acse.ottn.h2.a(r0, r4)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.String r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.o a;

        public f(com.acse.ottn.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    static {
            return
    }

    public o() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.lang.String r0 = "com.taobao.android.detail.wrapper.activity.DetailActivity"
            r1.f2528b = r0
            java.lang.String r0 = "com.taobao.tao.detail.activity.DetailActivity"
            r1.f2530c = r0
            java.lang.String r0 = "com.taobao.android.tbabilitykit.pop.StdPopActivityGroup"
            r1.f2531d = r0
            java.lang.String r0 = "com.taobao.live.liveshop.detail.DTLiveShopDetailActivity"
            r1.f2532e = r0
            java.lang.String r0 = "com.taobao.android.detail.alittdetail.TTDetailActivity"
            r1.f2533f = r0
            java.lang.String r0 = "com.taobao.homepage.page.MagicWindowActivity"
            r1.f2534g = r0
            java.lang.String r0 = "com.jd.lib.productdetail.ProductDetailActivity"
            r1.f2535h = r0
            java.lang.String r0 = "com.jd.lib.productdetail.ProductDetailPopActivity"
            r1.f2536i = r0
            java.lang.String r0 = "com.tmall.wireless.xdetail.activity.TMXDetailActivity"
            r1.f2537j = r0
            java.lang.String r0 = "com.tmall.wireless.newdetail.activity.NewDetailActivity"
            r1.f2538k = r0
            java.lang.String r0 = "com.sankuai.meituan.takeoutnew"
            r1.l = r0
            java.lang.String r0 = "com.taobao.taobao.fz"
            r1.m = r0
            java.lang.String r0 = "com.xingin.xhs"
            r1.n = r0
            java.lang.String r0 = "com.kuaishou.nebulam"
            r1.o = r0
            java.lang.String r0 = "com.smile.gifmakerm"
            r1.p = r0
            java.lang.String r0 = "com.baidu.netdiskm"
            r1.q = r0
            java.lang.String r0 = "com.huaxiaozhu"
            r1.r = r0
            java.lang.String r0 = "com.yek.android.kfc.activitys"
            r1.s = r0
            java.lang.String r0 = "com.taobao.taobao"
            r1.t = r0
            java.lang.String r0 = "com.tmall.wireless"
            r1.u = r0
            java.lang.String r0 = "com.alipay.video"
            r1.v = r0
            java.lang.String r0 = "com.jingdong.app.mall"
            r1.w = r0
            java.lang.String r0 = "com.jingdong.app.wm"
            r1.x = r0
            java.lang.String r0 = "com.sankuai.meituan.flower"
            r1.y = r0
            java.lang.String r0 = "com.sankuai.meituan.video"
            r1.z = r0
            java.lang.String r0 = "com.sankuai.meituan.medicine"
            r1.A = r0
            java.lang.String r0 = "com.sankuai.meituan.hotel"
            r1.B = r0
            java.lang.String r0 = "com.sina.weibo.main"
            r1.C = r0
            java.lang.String r0 = "com.sankuai.meituan.shop"
            r1.D = r0
            java.lang.String r0 = "com.sankuai.meituan.vegetable"
            r1.E = r0
            java.lang.String r0 = "com.taobao.idlefish.home"
            r1.F = r0
            java.lang.String r0 = "com.taobao.shangou"
            r1.G = r0
            java.lang.String r0 = "com.ss.android.ugc.aweme.mall"
            r1.H = r0
            java.lang.String r0 = "com.ss.android.ugc.awemem"
            r1.I = r0
            java.lang.String r0 = "com.sankuai.meituan"
            r1.J = r0
            java.lang.String r0 = "me.didi"
            r1.K = r0
            java.lang.String r0 = "com.tencent.qqlive"
            r1.L = r0
            java.lang.String r0 = "com.youku.phone"
            r1.M = r0
            java.lang.String r0 = "com.sankuai.waimai.details"
            r1.N = r0
            java.lang.String r0 = "me.ele"
            r1.O = r0
            java.lang.String r0 = "com.acse.xcx"
            r1.P = r0
            java.lang.String r0 = "com.starbucks.cn"
            r1.Q = r0
            java.lang.String r0 = "me.ele.detail"
            r1.R = r0
            java.lang.String r0 = "com.qiyi.video"
            r1.S = r0
            java.lang.String r0 = "com.taobao.tao.main"
            r1.T = r0
            java.lang.String r0 = "com.acse.ottn"
            r1.U = r0
            java.lang.String r0 = "com.tmall.wireless.main"
            r1.V = r0
            java.lang.String r0 = "com.jingdong.app.mall.main"
            r1.W = r0
            java.lang.String r0 = "com.suning.mobile.main"
            r1.X = r0
            java.lang.String r0 = "com.ct.client.main"
            r1.Y = r0
            java.lang.String r0 = "com.sinovatech.unicom.main"
            r1.Z = r0
            java.lang.String r0 = "com.mc10086.cmcc.main"
            r1.f2527a0 = r0
            java.lang.String r0 = "com.achievo.vipshop.main"
            r1.f2529b0 = r0
            return
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.o.d0
            return r0
    }

    public static /* synthetic */ void a(com.acse.ottn.o r0, java.util.List r1) {
            r0.a(r1)
            return
    }

    public static com.acse.ottn.o c() {
            com.acse.ottn.o r0 = com.acse.ottn.o.f2526c0
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.o> r0 = com.acse.ottn.o.class
            monitor-enter(r0)
            com.acse.ottn.o r1 = com.acse.ottn.o.f2526c0     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.o r1 = new com.acse.ottn.o     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.o.f2526c0 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.o r0 = com.acse.ottn.o.f2526c0
            return r0
    }

    public java.util.List<java.lang.String> a(android.content.Context r6) {
            r5 = this;
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r0 = 0
            java.util.List r0 = r6.getInstalledApplications(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r0.next()
            android.content.pm.ApplicationInfo r2 = (android.content.pm.ApplicationInfo) r2
            java.lang.CharSequence r3 = r6.getApplicationLabel(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.packageName
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "<---->"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.add(r2)
            goto L12
        L40:
            return r1
    }

    public final void a(android.app.Activity r2) {
            r1 = this;
            com.acse.ottn.o$a r0 = new com.acse.ottn.o$a     // Catch: java.lang.Exception -> L9
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L9
            r2.runOnUiThread(r0)     // Catch: java.lang.Exception -> L9
            return
        L9:
            java.lang.String r2 = "ShopHelpManager"
            java.lang.String r0 = "getFromClipboard error"
            com.acse.ottn.h2.a(r2, r0)
            return
    }

    public void a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "setClipboard"
            com.acse.ottn.h2.a(r0, r4)
            java.lang.String r0 = "clipboard"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            r1 = 0
            android.content.ClipData r4 = android.content.ClipData.newPlainText(r1, r4)
            if (r3 != 0) goto L1e
            android.content.Context r3 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.Object r3 = r3.getSystemService(r0)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
        L1e:
            if (r3 != 0) goto L21
            return
        L21:
            r3.setPrimaryClip(r4)
            return
    }

    public final void a(java.util.List<java.lang.String> r4) {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            java.lang.String r1 = ""
            java.lang.String r2 = "data"
            if (r4 == 0) goto L28
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)
            r0.put(r2, r4)
            goto L2b
        L28:
            r0.put(r2, r1)
        L2b:
            com.acse.ottn.l1 r4 = new com.acse.ottn.l1
            r4.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            okhttp3.RequestBody r0 = r2.a(r0, r1)
            rx.e r4 = r4.d(r0)
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r0)
            rx.h r0 = com.acse.ottn.i.a()
            rx.e r4 = r4.I3(r0)
            com.acse.ottn.o$e r0 = new com.acse.ottn.o$e
            r0.<init>(r3)
            com.acse.ottn.o$f r1 = new com.acse.ottn.o$f
            r1.<init>(r3)
            r4.u5(r0, r1)
            return
    }

    public void b() {
            r3 = this;
            com.acse.ottn.o$d r0 = new com.acse.ottn.o$d
            r0.<init>(r3)
            rx.e r0 = rx.e.j1(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.o$b r1 = new com.acse.ottn.o$b
            r1.<init>(r3)
            com.acse.ottn.o$c r2 = new com.acse.ottn.o$c
            r2.<init>(r3)
            r0.u5(r1, r2)
            return
    }

    public final java.lang.Object d() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.o r0 = com.acse.ottn.o.f2526c0
            return r0
    }
}
