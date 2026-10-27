package com.beizi.ad.internal.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements com.beizi.ad.i {
    private boolean A;
    private com.beizi.ad.lance.a.f B;
    private android.view.View C;
    private java.util.List<android.view.View> D;
    private com.beizi.ad.internal.e.b E;
    private android.view.View.OnClickListener F;
    private java.lang.String G;
    private long H;
    private int I;
    private java.lang.String J;
    private java.lang.String K;
    private java.lang.String L;
    private java.lang.String M;
    private java.lang.String N;
    private java.lang.String O;
    private java.lang.String P;
    private java.lang.String Q;
    private java.lang.String R;
    private java.lang.String S;
    private java.lang.String T;
    private com.beizi.ad.model.c.b.C0120b U;
    private com.beizi.ad.model.c.b.a V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;
    private com.beizi.ad.i.a a;
    private boolean aa;
    private boolean ab;
    private long ac;
    private boolean ad;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f6718b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f6719c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f6720d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.ArrayList<android.graphics.Bitmap> f6721e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f6722f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6723g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f6724h;

    /* renamed from: i, reason: collision with root package name */
    private com.beizi.ad.model.c.b f6725i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f6726j;

    /* renamed from: k, reason: collision with root package name */
    private double f6727k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.String n;
    private java.util.HashMap<java.lang.String, java.lang.Object> o;
    private boolean p;
    private boolean q;
    private boolean r;
    private java.util.ArrayList<java.lang.String> s;
    private java.util.ArrayList<java.lang.String> t;
    private java.util.ArrayList<java.lang.String> u;
    private java.util.ArrayList<java.lang.String> v;
    private java.util.ArrayList<java.lang.String> w;
    private com.beizi.ad.internal.f.c.a x;
    private com.beizi.ad.internal.f.c.a y;
    private java.lang.String z;








    a() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f6721e = r0
            r0 = 0
            r4.p = r0
            r4.q = r0
            r4.r = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.s = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.t = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.u = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.v = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.w = r1
            java.lang.String r1 = ""
            r4.G = r1
            r4.Y = r0
            r1 = 1
            r4.aa = r1
            r4.ab = r0
            long r2 = java.lang.System.currentTimeMillis()
            r4.ac = r2
            r4.ad = r1
            return
    }

    static /* synthetic */ int a(com.beizi.ad.internal.e.a r0, int r1) {
            r0.Y = r1
            return r1
    }

    static /* synthetic */ long a(com.beizi.ad.internal.e.a r0, long r1) {
            r0.H = r1
            return r1
    }

    public static com.beizi.ad.internal.e.a a(org.json.JSONObject r8) throws org.json.JSONException {
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            java.lang.String r0 = "ImpressionTrackers"
            org.json.JSONArray r0 = com.beizi.ad.internal.h.k.a(r8, r0)
            java.util.ArrayList r0 = com.beizi.ad.internal.h.k.a(r0)
            com.beizi.ad.internal.e.a r1 = new com.beizi.ad.internal.e.a
            r1.<init>()
            if (r0 == 0) goto L17
            r1.v = r0
        L17:
            java.lang.String r0 = "Headline"
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.f6718b = r0
            java.lang.String r0 = "Body"
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.f6719c = r0
            java.lang.String r0 = "Image"
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.f6720d = r0
            java.lang.String r0 = "Images"
            org.json.JSONArray r0 = com.beizi.ad.internal.h.k.a(r8, r0)
            java.lang.String r2 = "Videos"
            org.json.JSONArray r2 = com.beizi.ad.internal.h.k.a(r8, r2)
            java.lang.String r3 = "Texts"
            org.json.JSONArray r3 = com.beizi.ad.internal.h.k.a(r8, r3)
            r4 = 0
            if (r0 == 0) goto L59
            r5 = 0
        L45:
            int r6 = r0.length()
            if (r5 >= r6) goto L59
            java.util.ArrayList<java.lang.String> r6 = r1.s
            java.lang.Object r7 = r0.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            r6.add(r7)
            int r5 = r5 + 1
            goto L45
        L59:
            if (r2 == 0) goto L70
            r0 = 0
        L5c:
            int r5 = r2.length()
            if (r0 >= r5) goto L70
            java.util.ArrayList<java.lang.String> r5 = r1.t
            java.lang.Object r6 = r2.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            r5.add(r6)
            int r0 = r0 + 1
            goto L5c
        L70:
            if (r3 == 0) goto L86
        L72:
            int r0 = r3.length()
            if (r4 >= r0) goto L86
            java.util.ArrayList<java.lang.String> r0 = r1.u
            java.lang.Object r2 = r3.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            int r4 = r4 + 1
            goto L72
        L86:
            java.lang.String r0 = "AppIcon"
            boolean r2 = r8.has(r0)
            java.lang.String r3 = "Action"
            if (r2 == 0) goto Lb9
            com.beizi.ad.i$a r2 = com.beizi.ad.i.a.f6533b
            r1.a = r2
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.f6722f = r0
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r3)
            r1.f6726j = r0
            java.lang.String r0 = "Star"
            double r2 = com.beizi.ad.internal.h.k.e(r8, r0)
            r1.f6727k = r2
            java.lang.String r0 = "Store"
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.l = r0
            java.lang.String r0 = "Price"
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.m = r0
            goto Ld3
        Lb9:
            com.beizi.ad.i$a r0 = com.beizi.ad.i.a.a
            r1.a = r0
            java.lang.String r0 = "Logo"
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.f6722f = r0
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r3)
            r1.f6726j = r0
            java.lang.String r0 = "Advertiser"
            java.lang.String r0 = com.beizi.ad.internal.h.k.c(r8, r0)
            r1.n = r0
        Ld3:
            java.lang.String r0 = "ClickTrackers"
            org.json.JSONArray r0 = com.beizi.ad.internal.h.k.a(r8, r0)
            java.util.ArrayList r0 = com.beizi.ad.internal.h.k.a(r0)
            if (r0 == 0) goto Le1
            r1.w = r0
        Le1:
            java.lang.String r0 = "Custom"
            org.json.JSONObject r8 = com.beizi.ad.internal.h.k.b(r8, r0)
            java.util.HashMap r8 = com.beizi.ad.internal.h.k.a(r8)
            r1.o = r8
            return r1
    }

    static /* synthetic */ java.util.ArrayList a(com.beizi.ad.internal.e.a r0) {
            java.util.ArrayList<java.lang.String> r0 = r0.w
            return r0
    }

    static /* synthetic */ java.util.ArrayList a(com.beizi.ad.internal.e.a r0, java.util.ArrayList r1) {
            r0.w = r1
            return r1
    }

    private void a(android.content.Context r9) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r8.ac = r0
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            com.beizi.ad.internal.e.a$7 r1 = new com.beizi.ad.internal.e.a$7
            r1.<init>(r8, r9)
            r0.a(r1)
            java.lang.String r0 = r8.f6724h
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getScheme()
            r2 = 1
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r1 == 0) goto Le1
            java.lang.String r1 = r0.getScheme()
            java.lang.String r4 = "bzopen"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Le1
            java.lang.String r1 = r0.getHost()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Le1
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 <= 0) goto Le1
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r4 = "android.intent.action.MAIN"
            r1.setAction(r4)
            r1.setFlags(r3)
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            r1.addCategory(r3)
            java.lang.String r3 = "flags"
            java.lang.String r3 = r0.getQueryParameter(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 2
            if (r4 != 0) goto L88
            java.lang.String r4 = "0x"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L79
            if (r4 != 0) goto L7b
            java.lang.String r4 = "0X"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L79
            if (r4 == 0) goto L71
            goto L7b
        L71:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L79
            r1.setFlags(r3)     // Catch: java.lang.Exception -> L79
            goto L88
        L79:
            goto L88
        L7b:
            java.lang.String r3 = r3.substring(r5)     // Catch: java.lang.Exception -> L79
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)     // Catch: java.lang.Exception -> L79
            r1.setFlags(r3)     // Catch: java.lang.Exception -> L79
        L88:
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = r0.getHost()
            java.util.List r6 = r0.getPathSegments()
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            r3.<init>(r4, r6)
            r1.setComponent(r3)
            java.lang.String r3 = "rect"
            java.lang.String r0 = r0.getQueryParameter(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto Ldb
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3)     // Catch: java.lang.Exception -> Lda
            int r3 = r0.length     // Catch: java.lang.Exception -> Lda
            r4 = 4
            if (r3 != r4) goto Ldb
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lda
            r3.<init>()     // Catch: java.lang.Exception -> Lda
            r4 = r0[r7]     // Catch: java.lang.Exception -> Lda
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> Lda
            r2 = r0[r2]     // Catch: java.lang.Exception -> Lda
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> Lda
            r5 = r0[r5]     // Catch: java.lang.Exception -> Lda
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> Lda
            r6 = 3
            r0 = r0[r6]     // Catch: java.lang.Exception -> Lda
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> Lda
            r3.set(r4, r2, r5, r0)     // Catch: java.lang.Exception -> Lda
            r1.setSourceBounds(r3)     // Catch: java.lang.Exception -> Lda
            goto Ldb
        Lda:
        Ldb:
            if (r9 == 0) goto L12a
            r9.startActivity(r1)
            goto L12a
        Le1:
            java.lang.String r1 = r8.f6724h
            java.lang.String r4 = "hwpps://landingpage"
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto Lfc
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.setData(r0)
            r1.addFlags(r3)
            if (r9 == 0) goto L12a
            r9.startActivity(r1)
            return
        Lfc:
            java.lang.String r1 = r8.f6724h
            java.lang.String r4 = "intent"
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L118
            r0 = 0
            java.lang.String r1 = r8.f6724h     // Catch: java.lang.Exception -> L111
            android.content.Intent r0 = android.content.Intent.parseUri(r1, r2)     // Catch: java.lang.Exception -> L111
            r0.addFlags(r3)     // Catch: java.lang.Exception -> L111
            goto L112
        L111:
        L112:
            if (r9 == 0) goto L12a
            r9.startActivity(r0)
            goto L12a
        L118:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r0)
            r0 = 805339136(0x30008000, float:4.674803E-10)
            r1.addFlags(r0)
            if (r9 == 0) goto L12a
            r9.startActivity(r1)
        L12a:
            return
    }

    private void a(android.content.Context r22, int r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.io.File r3 = com.beizi.ad.lance.a.h.a(r1)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = ""
            if (r3 == 0) goto L12
            java.lang.String r4 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> Lc4
        L12:
            r9 = r4
            com.beizi.ad.lance.ApkBean r5 = new com.beizi.ad.lance.ApkBean     // Catch: java.lang.Exception -> Lc4
            java.lang.String r6 = r0.M     // Catch: java.lang.Exception -> Lc4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc4
            r3.<init>()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = r0.K     // Catch: java.lang.Exception -> Lc4
            r3.append(r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = ".apk"
            r3.append(r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r8 = r0.K     // Catch: java.lang.Exception -> Lc4
            java.lang.String r10 = r0.J     // Catch: java.lang.Exception -> Lc4
            java.lang.String r11 = r0.L     // Catch: java.lang.Exception -> Lc4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc4
            r3.<init>()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.Exception -> Lc4
            r3.append(r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = ".fileprovider"
            r3.append(r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Exception -> Lc4
            com.beizi.ad.model.c$b$b r13 = r0.U     // Catch: java.lang.Exception -> Lc4
            java.lang.String r14 = r0.N     // Catch: java.lang.Exception -> Lc4
            java.lang.String r15 = r0.O     // Catch: java.lang.Exception -> Lc4
            java.lang.String r3 = r0.P     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = r0.Q     // Catch: java.lang.Exception -> Lc4
            r16 = r3
            java.lang.String r3 = r0.R     // Catch: java.lang.Exception -> Lc4
            r18 = r3
            java.lang.String r3 = r0.S     // Catch: java.lang.Exception -> Lc4
            r19 = r3
            java.lang.String r3 = r0.T     // Catch: java.lang.Exception -> Lc4
            r20 = r3
            r17 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> Lc4
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Exception -> Lc4
            r3.<init>()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = "apkBean"
            r3.putSerializable(r4, r5)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = "type"
            r3.putInt(r4, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = "isCanJump"
            boolean r5 = r0.W     // Catch: java.lang.Exception -> Lc4
            r3.putBoolean(r4, r5)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = "isDownload"
            boolean r5 = r0.p()     // Catch: java.lang.Exception -> Lc4
            r3.putBoolean(r4, r5)     // Catch: java.lang.Exception -> Lc4
            r4 = 2
            if (r2 != r4) goto L9a
            com.beizi.ad.model.c$b$b r2 = r0.U     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L93
            java.lang.String r4 = "openList"
            java.util.List r2 = r2.a()     // Catch: java.lang.Exception -> Lc4
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Exception -> Lc4
            r3.putStringArrayList(r4, r2)     // Catch: java.lang.Exception -> Lc4
        L93:
            java.lang.String r2 = "landingPageUrl"
            java.lang.String r4 = r0.f6723g     // Catch: java.lang.Exception -> Lc4
            r3.putString(r2, r4)     // Catch: java.lang.Exception -> Lc4
        L9a:
            java.lang.String r2 = r0.f6724h     // Catch: java.lang.Exception -> Lc4
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lc4
            if (r2 != 0) goto Lb0
            java.lang.String r2 = "deeplinkUrl"
            java.lang.String r4 = r0.f6724h     // Catch: java.lang.Exception -> Lc4
            r3.putString(r2, r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r2 = "webDeepLink"
            int r4 = r0.Z     // Catch: java.lang.Exception -> Lc4
            r3.putInt(r2, r4)     // Catch: java.lang.Exception -> Lc4
        Lb0:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> Lc4
            java.lang.Class<com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity> r4 = com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity.class
            r2.<init>(r1, r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = "data"
            r2.putExtra(r4, r3)     // Catch: java.lang.Exception -> Lc4
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r3)     // Catch: java.lang.Exception -> Lc4
            r1.startActivity(r2)     // Catch: java.lang.Exception -> Lc4
        Lc4:
            return
    }

    private void a(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.p()     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L5d
            boolean r0 = r3.q()     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto Ld
            goto L5d
        Ld:
            int r0 = r3.I     // Catch: java.lang.Exception -> L60
            r1 = 2
            if (r0 != r1) goto L30
            java.lang.String r5 = r3.K     // Catch: java.lang.Exception -> L60
            boolean r5 = com.beizi.ad.lance.a.h.a(r4, r5)     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L2b
            java.lang.String r5 = r3.K     // Catch: java.lang.Exception -> L60
            com.beizi.ad.lance.a.h.b(r4, r5)     // Catch: java.lang.Exception -> L60
            com.beizi.ad.model.c$b$b r4 = r3.U     // Catch: java.lang.Exception -> L60
            if (r4 == 0) goto L60
            java.util.List r4 = r4.a()     // Catch: java.lang.Exception -> L60
            com.beizi.ad.internal.h.l.a(r4)     // Catch: java.lang.Exception -> L60
            return
        L2b:
            r5 = 1
            r3.a(r4, r5)     // Catch: java.lang.Exception -> L60
            return
        L30:
            r2 = 5
            if (r0 != r2) goto L60
            java.lang.String r0 = r3.M     // Catch: java.lang.Exception -> L60
            boolean r0 = com.beizi.ad.lance.a.k.a(r4, r0)     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L59
            boolean r5 = r3.X     // Catch: java.lang.Exception -> L60
            if (r5 != 0) goto L48
            int r5 = r3.Y     // Catch: java.lang.Exception -> L60
            if (r5 != 0) goto L44
            goto L48
        L44:
            r3.a(r4, r1)     // Catch: java.lang.Exception -> L60
            return
        L48:
            java.lang.String r5 = r3.M     // Catch: java.lang.Exception -> L60
            r3.b(r5, r4)     // Catch: java.lang.Exception -> L60
            com.beizi.ad.model.c$b$b r4 = r3.U     // Catch: java.lang.Exception -> L60
            if (r4 == 0) goto L60
            java.util.List r4 = r4.a()     // Catch: java.lang.Exception -> L60
            com.beizi.ad.internal.h.l.a(r4)     // Catch: java.lang.Exception -> L60
            return
        L59:
            r3.a(r5, r4)     // Catch: java.lang.Exception -> L60
            return
        L5d:
            r3.a(r5, r4)     // Catch: java.lang.Exception -> L60
        L60:
            return
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.e.a r0, java.lang.String r1, android.content.Context r2) {
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.e.a r0, java.lang.String r1, java.lang.String r2, android.content.Context r3) {
            boolean r0 = r0.a(r1, r2, r3)
            return r0
    }

    private boolean a(java.lang.String r6, android.content.Context r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L84
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Lb
            goto L84
        Lb:
            boolean r1 = r5.b(r7)
            r2 = 1
            if (r1 == 0) goto L13
            return r2
        L13:
            boolean r1 = r5.aa
            if (r1 != 0) goto L26
            boolean r6 = r5.b(r6, r7)
            if (r6 == 0) goto L25
            com.beizi.ad.internal.e.b r6 = r5.E
            if (r6 == 0) goto L24
            r6.b()
        L24:
            return r2
        L25:
            return r0
        L26:
            java.lang.Class r1 = com.beizi.ad.AdActivity.a()
            android.webkit.WebView r3 = new android.webkit.WebView     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            android.content.MutableContextWrapper r4 = new android.content.MutableContextWrapper     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r4.<init>(r7)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r3.<init>(r4)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            com.beizi.ad.internal.h.x.a(r3)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            java.util.Map r4 = com.beizi.ad.lance.a.j.a()     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r3.loadUrl(r6, r4)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            java.util.LinkedList<android.webkit.WebView> r6 = com.beizi.ad.internal.activity.a.a     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r6.add(r3)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r6.<init>(r7, r1)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r6.setFlags(r1)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            java.lang.String r1 = "ACTIVITY_TYPE"
            java.lang.String r3 = "DOWNLOADBROWSER"
            r6.putExtra(r1, r3)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            java.lang.String r1 = "ACTIVITY_CAN_JUMP"
            boolean r3 = r5.W     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r6.putExtra(r1, r3)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            java.lang.String r1 = "ACTIVITY_CAN_DOWNLOAD"
            boolean r3 = r5.p()     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r6.putExtra(r1, r3)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            java.lang.String r1 = r5.f6724h     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            if (r1 != 0) goto L7a
            java.lang.String r1 = "deeplinkUrl"
            java.lang.String r3 = r5.f6724h     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r6.putExtra(r1, r3)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            java.lang.String r1 = "webDeepLink"
            int r3 = r5.Z     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            r6.putExtra(r1, r3)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
        L7a:
            r7.startActivity(r6)     // Catch: java.lang.Exception -> L7e android.content.ActivityNotFoundException -> L7f
            return r2
        L7e:
            return r0
        L7f:
            java.util.LinkedList<android.webkit.WebView> r6 = com.beizi.ad.internal.activity.a.a
            r6.remove()
        L84:
            return r0
    }

    private boolean a(java.lang.String r3, java.lang.String r4, android.content.Context r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 != 0) goto L69
            boolean r0 = com.beizi.ad.lance.a.k.a(r5, r3)     // Catch: java.lang.Exception -> L3a
            if (r0 != 0) goto L40
            java.lang.String r0 = r2.K     // Catch: java.lang.Exception -> L3a
            boolean r0 = com.beizi.ad.lance.a.h.a(r5, r0)     // Catch: java.lang.Exception -> L3a
            if (r0 != 0) goto L40
            java.lang.String r0 = "hwpps://landingpage"
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.Exception -> L3a
            if (r0 != 0) goto L40
            java.lang.String r0 = "intent"
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.Exception -> L3a
            if (r0 != 0) goto L40
            java.lang.String r0 = "hap://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L2e
            goto L40
        L2e:
            com.beizi.ad.model.c$b$b r3 = r2.U     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L3c
            java.util.List r3 = r3.i()     // Catch: java.lang.Exception -> L3a
            com.beizi.ad.internal.h.l.a(r3)     // Catch: java.lang.Exception -> L3a
            goto L3c
        L3a:
            goto L5a
        L3c:
            r2.a(r5, r4)     // Catch: java.lang.Exception -> L3a
            goto L59
        L40:
            com.beizi.ad.model.c$b$b r3 = r2.U     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L4b
            java.util.List r3 = r3.h()     // Catch: java.lang.Exception -> L3a
            com.beizi.ad.internal.h.l.a(r3)     // Catch: java.lang.Exception -> L3a
        L4b:
            r2.a(r5)     // Catch: java.lang.Exception -> L3a
            com.beizi.ad.model.c$b$b r3 = r2.U     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L59
            java.util.List r3 = r3.e()     // Catch: java.lang.Exception -> L3a
            com.beizi.ad.internal.h.l.a(r3)     // Catch: java.lang.Exception -> L3a
        L59:
            return r1
        L5a:
            com.beizi.ad.model.c$b$b r3 = r2.U
            if (r3 == 0) goto L65
            java.util.List r3 = r3.g()
            com.beizi.ad.internal.h.l.a(r3)
        L65:
            r2.a(r5, r4)
            return r1
        L69:
            r2.a(r5, r4)
            return r1
    }

    static /* synthetic */ java.lang.String b(com.beizi.ad.internal.e.a r0) {
            java.lang.String r0 = r0.f6724h
            return r0
    }

    static /* synthetic */ java.util.ArrayList b(com.beizi.ad.internal.e.a r0, java.util.ArrayList r1) {
            r0.v = r1
            return r1
    }

    private boolean b(android.content.Context r6) {
            r5 = this;
            com.beizi.ad.model.c$b r0 = r5.f6725i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.y()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.beizi.ad.model.c$b r0 = r5.f6725i     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = r0.u()     // Catch: java.lang.Throwable -> L41
            com.beizi.ad.model.c$b r2 = r5.f6725i     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r2.v()     // Catch: java.lang.Throwable -> L41
            com.beizi.ad.model.c$b r3 = r5.f6725i     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r3.w()     // Catch: java.lang.Throwable -> L41
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L30
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L30
            boolean r6 = com.beizi.ad.lance.a.r.a(r6, r0, r2, r3)     // Catch: java.lang.Throwable -> L41
            return r6
        L30:
            com.beizi.ad.model.c$b r0 = r5.f6725i     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = r0.x()     // Catch: java.lang.Throwable -> L41
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L41
            boolean r6 = com.beizi.ad.lance.a.r.a(r6, r0)     // Catch: java.lang.Throwable -> L41
            return r6
        L41:
            return r1
    }

    private boolean b(java.lang.String r3, android.content.Context r4) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.<init>(r1, r3)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r3)
            r4.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    static /* synthetic */ java.lang.String c(com.beizi.ad.internal.e.a r0) {
            java.lang.String r0 = r0.f6723g
            return r0
    }

    static /* synthetic */ java.util.ArrayList d(com.beizi.ad.internal.e.a r0) {
            java.util.ArrayList<java.lang.String> r0 = r0.v
            return r0
    }

    static /* synthetic */ long e(com.beizi.ad.internal.e.a r2) {
            long r0 = r2.H
            return r0
    }

    static /* synthetic */ java.lang.String f(com.beizi.ad.internal.e.a r0) {
            java.lang.String r0 = r0.G
            return r0
    }

    static /* synthetic */ boolean g(com.beizi.ad.internal.e.a r0) {
            boolean r0 = r0.A
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.e.b h(com.beizi.ad.internal.e.a r0) {
            com.beizi.ad.internal.e.b r0 = r0.E
            return r0
    }

    static /* synthetic */ com.beizi.ad.model.c.b.C0120b i(com.beizi.ad.internal.e.a r0) {
            com.beizi.ad.model.c$b$b r0 = r0.U
            return r0
    }

    static /* synthetic */ boolean j(com.beizi.ad.internal.e.a r0) {
            boolean r0 = r0.ad
            return r0
    }

    static /* synthetic */ long k(com.beizi.ad.internal.e.a r2) {
            long r0 = r2.ac
            return r0
    }

    private void o() {
            r1 = this;
            com.beizi.ad.internal.e.a$6 r0 = new com.beizi.ad.internal.e.a$6
            r0.<init>(r1)
            r1.F = r0
            return
    }

    private boolean p() {
            r3 = this;
            java.lang.String r0 = r3.J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = r3.O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.String r0 = r3.N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r0 = r3.R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25
            return r1
        L25:
            java.lang.String r0 = r3.T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2e
            return r1
        L2e:
            java.lang.String r0 = r3.Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3f
            java.lang.String r0 = r3.P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3f
            return r1
        L3f:
            int r0 = r3.I
            r2 = 2
            if (r0 == r2) goto L49
            r2 = 5
            if (r0 != r2) goto L48
            goto L49
        L48:
            return r1
        L49:
            r0 = 1
            return r0
    }

    private boolean q() {
            r4 = this;
            int r0 = r4.I
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L1c
            java.lang.String r0 = r4.M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            return r3
        L10:
            java.lang.String r0 = r4.M
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L1b
            return r3
        L1b:
            return r2
        L1c:
            r1 = 5
            if (r0 != r1) goto L34
            java.lang.String r0 = r4.M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L28
            return r3
        L28:
            java.lang.String r0 = r4.M
            java.lang.String r1 = "market://"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L33
            return r3
        L33:
            return r2
        L34:
            return r3
    }

    @Override // com.beizi.ad.i
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f6718b
            return r0
    }

    public java.lang.String a(java.lang.String r9, android.view.View r10) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L16
            java.lang.String r0 = r8.z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = com.beizi.ad.model.g.a
            java.lang.String r1 = r8.z
            java.lang.String r9 = r9.replace(r0, r1)
        L16:
            r0 = r9
            if (r10 == 0) goto L3b
            java.lang.String r9 = r8.G
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L29
            java.lang.String r9 = "__REQUESTUUID__"
            java.lang.String r1 = r8.G
            java.lang.String r0 = r0.replace(r9, r1)
        L29:
            boolean r9 = r8.A
            if (r9 == 0) goto L35
            java.lang.String r9 = com.beizi.ad.model.g.f7478b
            java.lang.String r1 = "1"
            java.lang.String r0 = r0.replace(r9, r1)
        L35:
            r9 = 0
            java.lang.String r9 = com.beizi.ad.internal.h.o.a(r9, r10, r0)
            return r9
        L3b:
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r9 = com.beizi.ad.internal.h.q.a(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // com.beizi.ad.i
    public void a(android.content.Context r17, android.view.View r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23) {
            r16 = this;
            r0 = r16
            r9 = r23
            r0.Y = r9
            java.util.ArrayList<java.lang.String> r1 = r0.w
            if (r1 == 0) goto Lab
            java.util.Iterator r10 = r1.iterator()
        Le:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r11 = r19
            r2.append(r11)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r12 = r20
            r4.append(r12)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r13 = r21
            r5.append(r13)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r14 = r22
            r6.append(r14)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = ""
            r15 = r5
            r5 = r3
            r3 = r4
            r4 = r15
            java.lang.String r1 = com.beizi.ad.internal.h.q.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = r0.G
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "__REQUESTUUID__"
            java.lang.String r3 = r0.G
            java.lang.String r1 = r1.replace(r2, r3)
        L8a:
            boolean r2 = r0.A
            if (r2 == 0) goto L96
            java.lang.String r2 = com.beizi.ad.model.g.f7478b
            java.lang.String r3 = "1"
            java.lang.String r1 = r1.replace(r2, r3)
        L96:
            com.beizi.ad.internal.i r2 = new com.beizi.ad.internal.i
            r3 = r18
            java.lang.String r1 = com.beizi.ad.internal.h.o.a(r3, r1)
            r2.<init>(r1)
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r2.execute(r1)
            r9 = r23
            goto Le
        Lab:
            r1 = 0
            r0.w = r1
            java.lang.String r1 = r0.f6724h
            java.lang.String r2 = r0.f6723g
            r3 = r17
            r0.a(r1, r2, r3)
            com.beizi.ad.internal.e.b r1 = r0.E
            if (r1 == 0) goto Lbe
            r1.a()
        Lbe:
            return
    }

    @Override // com.beizi.ad.i
    public void a(android.view.View r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, com.beizi.ad.internal.e.b r23) {
            r16 = this;
            r0 = r16
            java.lang.String r1 = ""
            r10 = r22
            r0.Y = r10     // Catch: java.lang.Exception -> Lc6
            java.util.ArrayList<java.lang.String> r2 = r0.w     // Catch: java.lang.Exception -> Lc6
            if (r2 == 0) goto La7
            java.util.Iterator r11 = r2.iterator()     // Catch: java.lang.Exception -> Lc6
        L10:
            boolean r2 = r11.hasNext()     // Catch: java.lang.Exception -> Lc6
            if (r2 == 0) goto La7
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc6
            r3.<init>()     // Catch: java.lang.Exception -> Lc6
            r12 = r18
            r3.append(r12)     // Catch: java.lang.Exception -> Lc6
            r3.append(r1)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc6
            r4.<init>()     // Catch: java.lang.Exception -> Lc6
            r13 = r19
            r4.append(r13)     // Catch: java.lang.Exception -> Lc6
            r4.append(r1)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc6
            r5.<init>()     // Catch: java.lang.Exception -> Lc6
            r14 = r20
            r5.append(r14)     // Catch: java.lang.Exception -> Lc6
            r5.append(r1)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc6
            r6.<init>()     // Catch: java.lang.Exception -> Lc6
            r15 = r21
            r6.append(r15)     // Catch: java.lang.Exception -> Lc6
            r6.append(r1)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Lc6
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> Lc6
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = ""
            java.lang.String r2 = com.beizi.ad.internal.h.q.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r3 = r0.G     // Catch: java.lang.Exception -> Lc6
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lc6
            if (r3 != 0) goto L86
            java.lang.String r3 = "__REQUESTUUID__"
            java.lang.String r4 = r0.G     // Catch: java.lang.Exception -> Lc6
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.Exception -> Lc6
        L86:
            boolean r3 = r0.A     // Catch: java.lang.Exception -> Lc6
            if (r3 == 0) goto L92
            java.lang.String r3 = com.beizi.ad.model.g.f7478b     // Catch: java.lang.Exception -> Lc6
            java.lang.String r4 = "1"
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.Exception -> Lc6
        L92:
            com.beizi.ad.internal.i r3 = new com.beizi.ad.internal.i     // Catch: java.lang.Exception -> Lc6
            r4 = r17
            java.lang.String r2 = com.beizi.ad.internal.h.o.a(r4, r2)     // Catch: java.lang.Exception -> Lc6
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lc6
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch: java.lang.Exception -> Lc6
            r3.execute(r2)     // Catch: java.lang.Exception -> Lc6
            r10 = r22
            goto L10
        La7:
            r4 = r17
            r1 = 0
            r0.w = r1     // Catch: java.lang.Exception -> Lc6
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Exception -> Lc6
            android.view.View r2 = r4.getRootView()     // Catch: java.lang.Exception -> Lc6
            if (r2 == 0) goto Lba
            android.content.Context r1 = r2.getContext()     // Catch: java.lang.Exception -> Lc6
        Lba:
            java.lang.String r2 = r0.f6724h     // Catch: java.lang.Exception -> Lc6
            java.lang.String r3 = r0.f6723g     // Catch: java.lang.Exception -> Lc6
            r0.a(r2, r3, r1)     // Catch: java.lang.Exception -> Lc6
            if (r23 == 0) goto Lc6
            r23.a()     // Catch: java.lang.Exception -> Lc6
        Lc6:
            return
    }

    public void a(com.beizi.ad.internal.f.c.a r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public void a(com.beizi.ad.model.c.b r2) {
            r1 = this;
            r1.f6725i = r2
            com.beizi.ad.model.c$b$b r0 = r2.j()
            r1.U = r0
            int r0 = r2.c()
            r1.I = r0
            java.lang.String r0 = r2.d()
            r1.J = r0
            java.lang.String r0 = r2.e()
            r1.K = r0
            java.lang.String r0 = r2.f()
            r1.L = r0
            java.lang.String r0 = r2.g()
            r1.M = r0
            java.lang.String r0 = r1.K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L32
            java.lang.String r0 = "lance"
            r1.K = r0
        L32:
            java.lang.String r0 = r1.J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "BeiZi"
            r1.J = r0
        L3e:
            java.lang.String r0 = r1.L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4a
            java.lang.String r0 = "Ad Download"
            r1.L = r0
        L4a:
            java.lang.String r0 = r2.m()
            r1.N = r0
            java.lang.String r0 = r2.n()
            r1.O = r0
            java.lang.String r0 = r2.o()
            r1.P = r0
            java.lang.String r0 = r2.p()
            r1.Q = r0
            java.lang.String r0 = r2.q()
            r1.R = r0
            java.lang.String r0 = r2.r()
            r1.S = r0
            java.lang.String r0 = r2.s()
            r1.T = r0
            com.beizi.ad.model.c$b$a r2 = r2.t()
            r1.V = r2
            if (r2 == 0) goto L97
            int r2 = r2.a()
            r0 = 1
            if (r2 != r0) goto L85
            r1.W = r0
        L85:
            com.beizi.ad.model.c$b$a r2 = r1.V
            int r2 = r2.b()
            if (r2 != r0) goto L8f
            r1.X = r0
        L8f:
            com.beizi.ad.model.c$b$a r2 = r1.V
            int r2 = r2.c()
            r1.Z = r2
        L97:
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.G = r1
            return
    }

    void a(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.i
    public boolean a(android.view.View r2, com.beizi.ad.internal.e.b r3) {
            r1 = this;
            boolean r0 = r1.p
            if (r0 != 0) goto L26
            if (r2 == 0) goto L26
            r1.E = r3
            r1.C = r2
            android.view.GestureDetector r3 = new android.view.GestureDetector
            com.beizi.ad.internal.e.a$2 r0 = new com.beizi.ad.internal.e.a$2
            r0.<init>(r1, r2)
            r3.<init>(r0)
            r1.o()
            com.beizi.ad.internal.e.a$3 r0 = new com.beizi.ad.internal.e.a$3
            r0.<init>(r1, r3)
            r2.setOnTouchListener(r0)
            android.view.View$OnClickListener r3 = r1.F
            r2.setOnClickListener(r3)
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    @Override // com.beizi.ad.i
    public boolean a(android.view.View r4, com.beizi.ad.internal.e.e r5) {
            r3 = this;
            boolean r0 = r3.p
            r1 = 0
            if (r0 != 0) goto L15
            if (r4 == 0) goto L15
            com.beizi.ad.lance.a.f r0 = new com.beizi.ad.lance.a.f
            com.beizi.ad.internal.e.a$1 r2 = new com.beizi.ad.internal.e.a$1
            r2.<init>(r3, r4)
            r0.<init>(r4, r5, r2)
            r3.B = r0
            r3.C = r4
        L15:
            return r1
    }

    @Override // com.beizi.ad.i
    public boolean a(android.view.View r4, java.util.List<android.view.View> r5, com.beizi.ad.internal.e.b r6) {
            r3 = this;
            boolean r6 = r3.a(r4, r6)
            if (r6 == 0) goto L3e
            if (r5 == 0) goto L3c
            int r6 = r5.size()
            if (r6 <= 0) goto L3c
            r6 = 0
            r4.setOnClickListener(r6)
            java.util.Iterator r6 = r5.iterator()
        L16:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r6.next()
            android.view.View r0 = (android.view.View) r0
            android.view.GestureDetector r1 = new android.view.GestureDetector
            com.beizi.ad.internal.e.a$4 r2 = new com.beizi.ad.internal.e.a$4
            r2.<init>(r3, r4)
            r1.<init>(r2)
            com.beizi.ad.internal.e.a$5 r2 = new com.beizi.ad.internal.e.a$5
            r2.<init>(r3, r1)
            r0.setOnTouchListener(r2)
            android.view.View$OnClickListener r1 = r3.F
            r0.setOnClickListener(r1)
            goto L16
        L3a:
            r3.D = r5
        L3c:
            r4 = 1
            return r4
        L3e:
            r4 = 0
            return r4
    }

    @Override // com.beizi.ad.i
    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f6720d
            return r0
    }

    public void b(com.beizi.ad.internal.f.c.a r1) {
            r0 = this;
            r0.y = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f6723g = r1
            return
    }

    void b(boolean r1) {
            r0 = this;
            r0.ab = r1
            return
    }

    @Override // com.beizi.ad.i
    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f6719c
            return r0
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.f6724h = r1
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.A = r1
            return
    }

    @Override // com.beizi.ad.i
    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f6722f
            return r0
    }

    public void d(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.v
            r0.add(r2)
            return
    }

    public void d(boolean r1) {
            r0 = this;
            r0.ad = r1
            return
    }

    @Override // com.beizi.ad.i
    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f6726j
            return r0
    }

    public void e(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.w
            r0.add(r2)
            return
    }

    @Override // com.beizi.ad.i
    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    @Override // com.beizi.ad.i
    public boolean g() {
            r1 = this;
            boolean r0 = r1.p
            return r0
    }

    @Override // com.beizi.ad.i
    public void h() {
            r1 = this;
            com.beizi.ad.lance.a.f r0 = r1.B
            if (r0 == 0) goto L7
            r0.a()
        L7:
            r0 = 1
            r1.p = r0
            r0 = 0
            r1.C = r0
            r1.D = r0
            r1.E = r0
            return
    }

    @Override // com.beizi.ad.i
    public java.util.ArrayList<java.lang.String> i() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.s
            return r0
    }

    @Override // com.beizi.ad.i
    public java.util.ArrayList<java.lang.String> j() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.u
            return r0
    }

    @Override // com.beizi.ad.i
    public com.beizi.ad.internal.f.c.a k() {
            r1 = this;
            com.beizi.ad.internal.f.c$a r0 = r1.x
            return r0
    }

    @Override // com.beizi.ad.i
    public com.beizi.ad.internal.f.c.a l() {
            r1 = this;
            com.beizi.ad.internal.f.c$a r0 = r1.y
            return r0
    }

    @Override // com.beizi.ad.i
    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f6723g
            return r0
    }

    @Override // com.beizi.ad.i
    public com.beizi.ad.lance.ApkBean n() {
            r2 = this;
            int r0 = r2.I
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 5
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            com.beizi.ad.lance.ApkBean r0 = new com.beizi.ad.lance.ApkBean
            r0.<init>()
            java.lang.String r1 = r2.J
            r0.setApkName(r1)
            java.lang.String r1 = r2.N
            r0.setAppVersion(r1)
            java.lang.String r1 = r2.O
            r0.setAppDeveloper(r1)
            java.lang.String r1 = r2.P
            r0.setAppPermissionsDesc(r1)
            java.lang.String r1 = r2.Q
            r0.setAppPermissionsUrl(r1)
            java.lang.String r1 = r2.R
            r0.setAppPrivacyUrl(r1)
            java.lang.String r1 = r2.T
            r0.setAppintro(r1)
            return r0
    }
}
