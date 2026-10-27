package cn.jpush.android.l;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jpush.android.local.JPushAction {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f1819e = false;

    /* renamed from: f, reason: collision with root package name */
    private static int f1820f = 1000;

    /* renamed from: g, reason: collision with root package name */
    private static int f1821g = 1001;
    private java.lang.Boolean a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.Boolean f1822b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f1823c;

    /* renamed from: d, reason: collision with root package name */
    private cn.jpush.android.s.a f1824d;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            cn.jpush.android.s.a r0 = new cn.jpush.android.s.a
            r0.<init>()
            r1.f1824d = r0
            return
    }

    private static org.json.JSONObject a(java.nio.ByteBuffer r3) {
            java.lang.String r0 = "JPushActionImpl"
            byte[] r3 = r3.array()     // Catch: java.lang.Exception -> L37
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch: java.lang.Exception -> L37
            r3.getLong()     // Catch: java.lang.Exception -> L37
            short r1 = r3.getShort()     // Catch: java.lang.Exception -> L37
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L37
            r3.get(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "UTF-8"
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r1.<init>()     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "parseBundle2Json content: "
            r1.append(r2)     // Catch: java.lang.Exception -> L37
            r1.append(r3)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L37
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Exception -> L37
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            r1.<init>(r3)     // Catch: java.lang.Exception -> L37
            return r1
        L37:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parseBundle2Json exception:"
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
            r3 = 0
            return r3
    }

    public static void a(android.content.Context r6) {
            boolean r0 = cn.jpush.android.l.a.f1819e
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            cn.jpush.android.l.a.f1819e = r0
            boolean r1 = cn.jpush.android.local.JPushConstants.SUPPORT_DY
            r2 = 220(0xdc, float:3.08E-43)
            r3 = 2
            if (r1 == 0) goto L16
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT
            if (r1 < r2) goto L16
            cn.jpush.android.helper.JCoreHelper.updateDy(r6, r3)
        L16:
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.SDK_NAME
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            if (r1 != 0) goto L21
            r1 = 2
            goto L22
        L21:
            r1 = 0
        L22:
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT
            if (r5 < r2) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            int r2 = cn.jpush.android.m.a.a
            int r4 = cn.jpush.android.local.JPushConstants.SDK_VERSION_CODE
            if (r2 == r4) goto L2f
            goto L30
        L2f:
            r3 = r0
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "custom:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ",dynamic:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "JPushActionImpl"
            cn.jpush.android.helper.Logger.d(r2, r0)
            cn.jpush.android.x.e r0 = cn.jpush.android.x.e.a()
            r2 = 0
            r0.a(r6, r2)
            java.lang.String r0 = "push"
            int r2 = cn.jpush.android.m.a.a
            cn.jpush.android.helper.JCoreHelper.reportSdkType(r6, r0, r1, r3, r2)
            boolean r0 = cn.jpush.android.local.JPushConstants.canGetLbsInBackGround(r6)
            if (r0 == 0) goto L6a
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a()
            r0.b()
        L6a:
            cn.jpush.android.p.b r0 = cn.jpush.android.p.b.a()
            r0.a(r6)
            cn.jpush.android.ab.a.a(r6)
            return
    }

    private static void a(android.content.Context r1, int r2, long r3) {
            r0 = 10
            if (r2 == r0) goto L2d
            r0 = 37
            if (r2 == r0) goto L22
            r0 = 38
            if (r2 == r0) goto L2d
            switch(r2) {
                case 26: goto L18;
                case 27: goto L10;
                case 28: goto L2d;
                case 29: goto L2d;
                default: goto Lf;
            }
        Lf:
            return
        L10:
            cn.jpush.android.ac.c r2 = cn.jpush.android.ac.c.a()
            r2.b(r1, r3)
            return
        L18:
            cn.jpush.android.helper.d r2 = cn.jpush.android.helper.d.a()
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.TIMEOUT
            r2.a(r1, r3, r0)
            return
        L22:
            cn.jpush.android.b.d r1 = cn.jpush.android.b.d.a()
            int r2 = cn.jpush.android.api.JPushInterface.ErrorCode.TIMEOUT
            r0 = 0
            r1.a(r3, r2, r0)
            return
        L2d:
            cn.jpush.android.ab.c r2 = cn.jpush.android.ab.c.a()
            int r2 = r2.a(r3)
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.TIMEOUT
            cn.jpush.android.ab.b.a(r1, r2, r0, r3)
            return
    }

    private static void a(android.content.Context r4, android.os.Bundle r5) {
            java.lang.String r0 = "JPushActionImpl"
            if (r5 != 0) goto La
            java.lang.String r4 = "[setMaxNotificationNum] bundle is bull"
            cn.jpush.android.helper.Logger.w(r0, r4)
            return
        La:
            java.lang.String r1 = "num"
            int r5 = r5.getInt(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action:setMaxNotificationNum :"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.dd(r0, r1)
            int r1 = cn.jpush.android.x.f.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "number in queue: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.v(r0, r2)
            if (r5 >= r1) goto L56
            int r1 = r1 - r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "decreaseNotification:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.v(r0, r2)
            cn.jpush.android.x.b.c(r4, r1)
        L56:
            cn.jpush.android.cache.a.c(r4, r5)
            return
    }

    private void a(android.content.Context r8, android.os.Bundle r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r0 = "enable"
            r1 = 1
            boolean r0 = r9.getBoolean(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "enable_smart_push"
            boolean r3 = r3.equals(r10)
            java.lang.String r4 = "JPushActionImpl"
            if (r3 == 0) goto L51
            cn.jpush.android.cache.a.i(r8, r0)
            boolean r10 = cn.jpush.android.cache.a.p(r8)
            boolean r3 = cn.jpush.android.cache.a.o(r8)
            boolean r5 = cn.jpush.android.cache.a.q(r8)
            java.lang.String r6 = "ACTION_ENABLE_SMART_PUSH"
            cn.jpush.android.helper.Logger.d(r4, r6)
            if (r0 != 0) goto L40
            if (r10 != 0) goto L40
            if (r5 == 0) goto L36
            goto L40
        L36:
            int r10 = cn.jpush.android.l.a.f1821g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.add(r10)
            goto L49
        L40:
            int r10 = cn.jpush.android.l.a.f1821g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.add(r10)
        L49:
            if (r0 != 0) goto Ldd
            if (r3 != 0) goto Ldd
            if (r5 == 0) goto Ld3
            goto Ldd
        L51:
            java.lang.String r3 = "enable_geo_push"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L71
            cn.jpush.android.cache.a.e(r8, r0)
            java.lang.String r10 = "ACTION_ENABLE_GEO_PUSH"
            cn.jpush.android.helper.Logger.d(r4, r10)
            boolean r10 = cn.jpush.android.cache.a.q(r8)
            boolean r3 = cn.jpush.android.cache.a.s(r8)
            if (r0 != 0) goto Ldd
            if (r3 != 0) goto Ldd
            if (r10 == 0) goto Ld3
            goto Ldd
        L71:
            java.lang.String r3 = "enable_link_push"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L96
            cn.jpush.android.cache.a.f(r8, r0)
            java.lang.String r10 = "ACTION_ENABLE_LINK_PUSH"
            cn.jpush.android.helper.Logger.d(r4, r10)
            boolean r10 = cn.jpush.android.cache.a.q(r8)
            boolean r3 = cn.jpush.android.cache.a.s(r8)
            if (r0 != 0) goto L93
            if (r3 != 0) goto L93
            if (r10 == 0) goto L90
            goto L93
        L90:
            int r10 = cn.jpush.android.l.a.f1821g
            goto Ld5
        L93:
            int r10 = cn.jpush.android.l.a.f1821g
            goto Ldf
        L96:
            java.lang.String r3 = "enable_data_insights"
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto Le6
            cn.jpush.android.cache.a.g(r8, r0)
            boolean r10 = cn.jpush.android.cache.a.p(r8)
            boolean r3 = cn.jpush.android.cache.a.o(r8)
            boolean r5 = cn.jpush.android.cache.a.s(r8)
            java.lang.String r6 = "ACTION_ENABLE_DATA_INSIGHTS "
            cn.jpush.android.helper.Logger.d(r4, r6)
            if (r0 != 0) goto Lc3
            if (r5 != 0) goto Lc3
            if (r10 == 0) goto Lb9
            goto Lc3
        Lb9:
            int r10 = cn.jpush.android.l.a.f1821g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.add(r10)
            goto Lcc
        Lc3:
            int r10 = cn.jpush.android.l.a.f1821g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.add(r10)
        Lcc:
            if (r0 != 0) goto Ldd
            if (r5 != 0) goto Ldd
            if (r3 == 0) goto Ld3
            goto Ldd
        Ld3:
            int r10 = cn.jpush.android.l.a.f1820f
        Ld5:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.add(r10)
            goto Le6
        Ldd:
            int r10 = cn.jpush.android.l.a.f1820f
        Ldf:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.add(r10)
        Le6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "enable="
            r10.append(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.d(r4, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "disable="
            r10.append(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.d(r4, r10)
            int r10 = r1.size()
            if (r10 != 0) goto L11c
            int r10 = r2.size()
            if (r10 == 0) goto L11b
            goto L11c
        L11b:
            return
        L11c:
            java.lang.String r10 = "enable_c_c"
            r9.putIntegerArrayList(r10, r1)
            java.lang.String r10 = "disable_c_c"
            r9.putIntegerArrayList(r10, r2)
            r10 = 0
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.String r1 = "JPUSH"
            r2 = 111(0x6f, float:1.56E-43)
            r3 = 0
            r0 = r8
            r4 = r9
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    private static void a(android.content.Context r9, cn.jpush.android.local.JPushResponse r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:handleMsg:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JPushActionImpl"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            if (r10 != 0) goto L1a
            goto L110
        L1a:
            int r0 = r10.getCmd()
            r2 = 3
            if (r0 == r2) goto Lf7
            r3 = 10
            r4 = 1
            r5 = 2
            r6 = 40
            if (r0 == r3) goto Lce
            if (r0 == r6) goto Lce
            switch(r0) {
                case 25: goto La5;
                case 26: goto L90;
                case 27: goto L69;
                case 28: goto Lce;
                case 29: goto Lce;
                default: goto L2e;
            }
        L2e:
            switch(r0) {
                case 36: goto L5c;
                case 37: goto L4a;
                case 38: goto Lce;
                default: goto L31;
            }
        L31:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unknown command for parsing inbound. Union AD cmd: "
            r9.append(r0)
            int r10 = r10.getCmd()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jpush.android.helper.Logger.w(r1, r9)
            return
        L4a:
            cn.jpush.android.n.d r9 = new cn.jpush.android.n.d
            r9.<init>(r10)
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a()
            long r1 = r10.getRquestId()
            r10 = 0
            r0.a(r1, r10, r9)
            return
        L5c:
            cn.jpush.android.n.b r9 = new cn.jpush.android.n.b
            r9.<init>(r10)
            cn.jpush.android.b.d r10 = cn.jpush.android.b.d.a()
            r10.a(r9)
            return
        L69:
            cn.jpush.android.z.a r0 = new cn.jpush.android.z.a
            r0.<init>(r10)
            int r1 = r0.a()
            if (r1 != 0) goto L80
            cn.jpush.android.ac.c r0 = cn.jpush.android.ac.c.a()
            long r1 = r10.getRquestId()
            r0.a(r9, r1)
            return
        L80:
            cn.jpush.android.ac.c r1 = cn.jpush.android.ac.c.a()
            long r2 = r10.getRquestId()
            int r10 = r0.a()
            r1.a(r9, r2, r10)
            return
        L90:
            cn.jpush.android.z.a r0 = new cn.jpush.android.z.a
            r0.<init>(r10)
            cn.jpush.android.helper.d r10 = cn.jpush.android.helper.d.a()
            long r1 = r0.getRquestId()
            int r0 = r0.a()
            r10.a(r9, r1, r0)
            return
        La5:
            java.nio.ByteBuffer r10 = r10.getBody()
            org.json.JSONObject r10 = a(r10)
            if (r10 == 0) goto L110
            java.lang.String r0 = "cmd"
            int r0 = r10.optInt(r0)
            switch(r0) {
                case 56: goto Lc6;
                case 57: goto L110;
                case 58: goto Lb8;
                case 59: goto Lc2;
                case 60: goto Lbe;
                default: goto Lb8;
            }
        Lb8:
            java.lang.String r9 = "Unknown command for ctrl"
            cn.jpush.android.helper.Logger.d(r1, r9)
            return
        Lbe:
            cn.jpush.android.x.b.a(r9, r5, r4)
            return
        Lc2:
            a(r9, r10)
            return
        Lc6:
            cn.jpush.android.b.d r9 = cn.jpush.android.b.d.a()
            r9.a(r10)
            return
        Lce:
            cn.jpush.android.z.e r0 = new cn.jpush.android.z.e
            r0.<init>(r10)
            int r1 = r10.getCmd()
            r3 = 28
            if (r1 == r3) goto Le7
            r3 = 38
            if (r1 == r3) goto Le5
            if (r1 == r6) goto Le2
            goto Le8
        Le2:
            r2 = 4
            r5 = 4
            goto Le8
        Le5:
            r5 = 3
            goto Le8
        Le7:
            r5 = 1
        Le8:
            java.lang.String r4 = r0.a()
            long r6 = r10.getRquestId()
            int r8 = r0.a
            r3 = r9
            cn.jpush.android.ab.b.a(r3, r4, r5, r6, r8)
            return
        Lf7:
            r3 = r9
            cn.jpush.android.z.c r9 = new cn.jpush.android.z.c
            r9.<init>(r10)
            boolean r10 = cn.jpush.android.cache.a.e(r3)
            if (r10 == 0) goto L111
            java.lang.String r10 = "JPush was stoped"
            cn.jpush.android.helper.Logger.d(r1, r10)
            int r10 = r9.a()
            r0 = 20
            if (r10 == r0) goto L111
        L110:
            return
        L111:
            cn.jpush.android.d.b.a(r3, r9)
            return
    }

    private static void a(android.content.Context r13, org.json.JSONObject r14) {
            java.lang.String r1 = "JPushActionImpl"
            java.lang.String r0 = "content"
            org.json.JSONObject r14 = r14.getJSONObject(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "ids"
            java.lang.String r14 = r14.optString(r0)     // Catch: java.lang.Throwable -> L79
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "dealCancelNotification ids="
            r0.append(r2)     // Catch: java.lang.Throwable -> L79
            r0.append(r14)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L79
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = ","
            java.lang.String[] r0 = r14.split(r0)     // Catch: java.lang.Throwable -> L79
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            int r3 = r0.length     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r5 = 0
        L37:
            r6 = -1
            if (r5 >= r3) goto Lc9
            r7 = r0[r5]     // Catch: java.lang.Throwable -> L79
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L79
            if (r8 != 0) goto Lc3
            boolean r8 = cn.jpush.android.x.d.a(r13, r7)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "message id:"
            r10 = 1
            if (r8 == 0) goto L84
            int r6 = cn.jpush.android.x.b.a(r7, r4)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r8.<init>()     // Catch: java.lang.Throwable -> L79
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = " is in local history ,try cancel notificationID : "
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L79
            cn.jpush.android.helper.Logger.d(r1, r8)     // Catch: java.lang.Throwable -> L79
            boolean r8 = cn.jpush.android.x.b.a(r13, r6)     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L82
            cn.jpush.android.x.b.d(r13, r6)     // Catch: java.lang.Throwable -> L79
            int r6 = r0.length     // Catch: java.lang.Throwable -> L79
            r8 = 2
            if (r6 != r8) goto L7c
            r6 = r0[r10]     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r0 = move-exception
            r13 = r0
            goto Ld5
        L7c:
            r6 = r7
        L7d:
            r8 = 1068(0x42c, double:5.277E-321)
            cn.jpush.android.helper.c.a(r6, r8, r13)     // Catch: java.lang.Throwable -> L79
        L82:
            r12 = r13
            goto Lbf
        L84:
            r8 = 0
            boolean r8 = cn.jpush.android.x.d.a(r13, r7, r8, r10)     // Catch: java.lang.Throwable -> L79
            if (r8 != 0) goto Lb9
            cn.jpush.android.ac.e r8 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L79
            byte r8 = r8.d(r13, r7)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r10.<init>()     // Catch: java.lang.Throwable -> L79
            r10.append(r9)     // Catch: java.lang.Throwable -> L79
            r10.append(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = " may be ospush channel,try cancel by sdkType: "
            r10.append(r9)     // Catch: java.lang.Throwable -> L79
            r10.append(r8)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L79
            cn.jpush.android.helper.Logger.d(r1, r9)     // Catch: java.lang.Throwable -> L79
            if (r8 == r6) goto L82
            r9 = r8
            java.lang.String r8 = ""
            r10 = 1069(0x42d, double:5.28E-321)
            r12 = r13
            cn.jpush.android.helper.c.a(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L79
            goto Lbf
        Lb9:
            r12 = r13
            java.lang.String r13 = "dealCancelNotification , do nothing "
            cn.jpush.android.helper.Logger.d(r1, r13)     // Catch: java.lang.Throwable -> L79
        Lbf:
            r2.add(r7)     // Catch: java.lang.Throwable -> L79
            goto Lc4
        Lc3:
            r12 = r13
        Lc4:
            int r5 = r5 + 1
            r13 = r12
            goto L37
        Lc9:
            r12 = r13
            cn.jpush.android.q.a r13 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L79
            r13.a(r12, r14)     // Catch: java.lang.Throwable -> L79
            cn.jpush.android.x.d.a(r12, r2, r6)     // Catch: java.lang.Throwable -> L79
            return
        Ld5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "dealCancelNotification e:"
            r14.append(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            cn.jpush.android.helper.Logger.w(r1, r13)
            return
    }

    private static void b(android.content.Context r3, android.os.Bundle r4) {
            java.lang.String r0 = "JPushActionImpl"
            if (r4 != 0) goto La
            java.lang.String r3 = "[setSilenceTime] bundle is bull"
            cn.jpush.android.helper.Logger.w(r0, r3)
            return
        La:
            java.lang.String r1 = "time"
            java.lang.String r4 = r4.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action:setSilenceTime pushTime:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.dd(r0, r1)
            cn.jpush.android.cache.a.c(r3, r4)
            return
    }

    private boolean b(android.content.Context r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.a
            if (r0 == 0) goto L9
            boolean r2 = r0.booleanValue()
            return r2
        L9:
            if (r2 != 0) goto L14
            java.lang.String r2 = "JPushActionImpl"
            java.lang.String r0 = "context is null"
            cn.jpush.android.helper.Logger.ww(r2, r0)
            r2 = 0
            return r2
        L14:
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r1.f1823c = r0
            boolean r2 = cn.jpush.android.ad.a.h(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.a = r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    private void c(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "serviceInit..."
            java.lang.String r1 = "JPushActionImpl"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.Boolean r0 = r3.f1822b     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Lc
            goto L24
        Lc:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L24
            r3.f1822b = r0     // Catch: java.lang.Throwable -> L24
            r0 = 0
            r2 = 1
            cn.jpush.android.x.b.a(r4, r0, r2)     // Catch: java.lang.Throwable -> L24
            cn.jpush.android.ad.g r0 = cn.jpush.android.ad.g.a()     // Catch: java.lang.Throwable -> L24
            r0.a(r4)     // Catch: java.lang.Throwable -> L24
            r3.d(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "google:false"
            cn.jpush.android.helper.Logger.d(r1, r4)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    private static void c(android.content.Context r4, android.os.Bundle r5) {
            java.lang.String r0 = "JPushActionImpl"
            if (r5 != 0) goto La
            java.lang.String r4 = "[setPushTime] bundle is bull"
            cn.jpush.android.helper.Logger.w(r0, r4)
            return
        La:
            r1 = 1
            cn.jpush.android.cache.a.c(r4, r1)
            java.lang.String r1 = "time"
            java.lang.String r5 = r5.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "([0-6]{0,7})_(("
            r1.append(r2)
            java.lang.String r2 = "([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3])"
            r1.append(r2)
            java.lang.String r3 = ")|("
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "-)+("
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = "))"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r5)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L81
            java.lang.String r1 = cn.jpush.android.cache.a.h(r4)
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Already SetPushTime, give up - "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.dd(r0, r4)
            return
        L69:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action:setPushTime pushTime:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.dd(r0, r1)
            cn.jpush.android.cache.a.b(r4, r5)
            return
        L81:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Invalid time format - "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.ee(r0, r4)
            return
    }

    private void d(android.content.Context r7) {
            r6 = this;
            java.lang.String r0 = "cn.jpush.android.dy.JPushThirdDyManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "update"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            r1[r5] = r7     // Catch: java.lang.Throwable -> L1c
            r7 = 0
            r0.invoke(r7, r1)     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public java.lang.Object beforLogin(android.content.Context r3, java.lang.String r4, int r5, java.lang.String r6) {
            r2 = this;
            r2.b(r3)
            java.lang.String r4 = "JPushActionImpl"
            r0 = 0
            if (r3 != 0) goto Le
            java.lang.String r3 = "context was null"
        La:
            cn.jpush.android.helper.Logger.e(r4, r3)
            return r0
        Le:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L17
            java.lang.String r3 = " filed name was empty"
            goto La
        L17:
            java.lang.String r4 = "platformtype"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L30
            r4 = 16
            if (r5 < r4) goto L41
            cn.jpush.android.ac.e r4 = cn.jpush.android.ac.e.a()
            byte r3 = r4.d(r3)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L30:
            java.lang.String r4 = "platformregid"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L41
            cn.jpush.android.ac.e r4 = cn.jpush.android.ac.e.a()
            java.lang.String r3 = r4.b(r3)
            return r3
        L41:
            return r0
    }

    @Override // cn.jpush.android.local.JPushAction
    public cn.jpush.android.local.ProxyActivityAction getPopWinActivity(android.content.Context r1) {
            r0 = this;
            cn.jpush.android.ui.b r1 = new cn.jpush.android.ui.b
            r1.<init>()
            return r1
    }

    @Override // cn.jpush.android.local.JPushAction
    public cn.jpush.android.local.ProxyActivityAction getPushActivity(android.content.Context r1) {
            r0 = this;
            cn.jpush.android.ui.c r1 = new cn.jpush.android.ui.c
            r1.<init>()
            return r1
    }

    @Override // cn.jpush.android.local.JPushAction
    public java.lang.String getSdkVersion(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = cn.jpush.android.m.a.f1833b
            return r1
    }

    @Override // cn.jpush.android.local.JPushAction
    public java.lang.Object handleAction(android.content.Context r17, java.lang.String r18, java.lang.Object r19) {
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            java.lang.String r3 = "msg"
            java.lang.String r4 = "ups.turnOff"
            java.lang.String r5 = "ups.turnOn"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "handleAction:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "JPushActionImpl"
            cn.jpush.android.helper.Logger.d(r7, r6)
            r6 = 0
            boolean r8 = r16.b(r17)     // Catch: java.lang.Throwable -> L3e
            if (r8 != 0) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "check config failed, will drop current action:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            r2.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.helper.Logger.ke(r7, r0)     // Catch: java.lang.Throwable -> L3e
            return r6
        L3e:
            r0 = move-exception
            goto L7ab
        L41:
            if (r17 != 0) goto L46
            android.content.Context r8 = r1.f1823c     // Catch: java.lang.Throwable -> L3e
            goto L48
        L46:
            r8 = r17
        L48:
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L54
            java.lang.String r0 = "action is empty"
            cn.jpush.android.helper.Logger.w(r7, r0)     // Catch: java.lang.Throwable -> L3e
            return r6
        L54:
            cn.jpush.android.aa.a r9 = cn.jpush.android.aa.a.a()     // Catch: java.lang.Throwable -> L3e
            r9.a(r8, r0)     // Catch: java.lang.Throwable -> L3e
            boolean r9 = r2 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L64
            r9 = r2
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch: java.lang.Throwable -> L3e
            r12 = r9
            goto L65
        L64:
            r12 = r6
        L65:
            java.lang.String r9 = "init"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L72
            r1.c(r8)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L72:
            java.lang.String r9 = "resume"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r10 = "set failed"
            r11 = 1
            r13 = 0
            if (r9 == 0) goto L99
            boolean r0 = cn.jpush.android.cache.a.b(r8, r13)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L8a
            r0 = 2006(0x7d6, float:2.811E-42)
            cn.jpush.android.x.b.a(r8, r0, r11, r10)     // Catch: java.lang.Throwable -> L3e
            return r6
        L8a:
            cn.jpush.android.cache.a.a(r8, r13)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = "JPUSH"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L3e
            r10 = 1
            r11 = 0
            r12 = 0
            cn.jiguang.api.JCoreManager.onEvent(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L99:
            java.lang.String r9 = "stop"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto Lc6
            boolean r0 = cn.jpush.android.cache.a.b(r8, r13)     // Catch: java.lang.Throwable -> L3e
            r2 = 2007(0x7d7, float:2.812E-42)
            if (r0 == 0) goto Lad
            cn.jpush.android.x.b.a(r8, r2, r11, r10)     // Catch: java.lang.Throwable -> L3e
            return r6
        Lad:
            java.lang.String r0 = "The service is stopped, it will give up all the actions until you call resumePush method to resume the service"
            cn.jpush.android.helper.Logger.dd(r7, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "set success"
            cn.jpush.android.x.b.a(r8, r2, r13, r0)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.a.a(r8, r11)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = "JPUSH"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L3e
            r10 = 0
            r11 = 0
            r12 = 0
            cn.jiguang.api.JCoreManager.onEvent(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        Lc6:
            java.lang.String r9 = "send_exception_stats"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto Lda
            java.lang.String r9 = "JPUSH"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L3e
            r10 = 106(0x6a, float:1.49E-43)
            r11 = 0
            cn.jiguang.api.JCoreManager.onEvent(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        Lda:
            java.lang.String r9 = "clear_all_notify"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto Le7
            cn.jpush.android.x.b.a(r8)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        Le7:
            java.lang.String r9 = "disable_push"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto Lf4
            cn.jpush.android.cache.a.c(r8, r13)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        Lf4:
            java.lang.String r9 = "geo_interval"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            r14 = -1
            if (r9 == 0) goto L113
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "interval"
            long r2 = r12.getLong(r0, r14)     // Catch: java.lang.Throwable -> L3e
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L7c3
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L3e
            r0.a(r2)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L113:
            java.lang.String r9 = "max_num"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L120
            a(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L120:
            java.lang.String r9 = "set_mobile"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L131
            cn.jpush.android.helper.d r0 = cn.jpush.android.helper.d.a()     // Catch: java.lang.Throwable -> L3e
            r0.a(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L131:
            java.lang.String r9 = "pushtime"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L13e
            c(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L13e:
            java.lang.String r9 = "silenceTime"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L14b
            b(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L14b:
            java.lang.String r9 = "geo_fence_max_num"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r10 = "num"
            r14 = -1
            if (r9 == 0) goto L167
            if (r12 == 0) goto L7c3
            int r0 = r12.getInt(r10, r14)     // Catch: java.lang.Throwable -> L3e
            if (r0 <= 0) goto L7c3
            cn.jpush.android.b.d r2 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L3e
            r2.a(r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L167:
            java.lang.String r9 = "enable_lbs"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r15 = "enable"
            if (r9 == 0) goto L198
            if (r12 == 0) goto L7c3
            boolean r0 = r12.getBoolean(r15, r11)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.a.e(r8, r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L18a
            java.lang.String r0 = "lbs is disabled,stop geo"
            cn.jpush.android.helper.Logger.dd(r7, r0)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L3e
            r0.c()     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L18a:
            java.lang.String r0 = "lbs is enabled"
            cn.jpush.android.helper.Logger.dd(r7, r0)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L3e
            r0.b()     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L198:
            java.lang.String r9 = "enable_notification_callback"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L1ab
            if (r12 == 0) goto L7c3
            boolean r0 = r12.getBoolean(r15, r13)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.a.h(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L1ab:
            java.lang.String r9 = "enable_smart_push"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L7a5
            java.lang.String r9 = "enable_link_push"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L7a5
            java.lang.String r9 = "enable_data_insights"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L7a5
            java.lang.String r9 = "enable_geo_push"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L1cd
            goto L7a5
        L1cd:
            java.lang.String r9 = "third_enable"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L232
            if (r12 == 0) goto L7c3
            boolean r2 = r12.getBoolean(r15, r11)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = cn.jpush.android.m.a.a()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = cn.jpush.android.ad.a.d(r8)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r8.getPackageName()     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "third enable:"
            if (r4 != 0) goto L20a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e
            r4.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = ",last :"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e
            r4.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L3e
        L206:
            cn.jpush.android.helper.Logger.dd(r7, r3)     // Catch: java.lang.Throwable -> L3e
            goto L21a
        L20a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            r3.append(r5)     // Catch: java.lang.Throwable -> L3e
            r3.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            goto L206
        L21a:
            cn.jpush.android.local.JPushConstants.THIRD_ENABLE = r2     // Catch: java.lang.Throwable -> L21d
            goto L21e
        L21d:
        L21e:
            if (r2 == 0) goto L229
            cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r2.b(r8, r0, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L229:
            cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r2.a(r8, r0, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L232:
            java.lang.String r9 = "delete_geo_fence"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r15 = "id"
            if (r9 == 0) goto L251
            if (r12 == 0) goto L7c3
            java.lang.String r0 = r12.getString(r15)     // Catch: java.lang.Throwable -> L3e
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L7c3
            cn.jpush.android.b.d r2 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L3e
            r2.a(r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L251:
            java.lang.String r9 = "set_badge"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L277
            if (r12 == 0) goto L7c3
            int r0 = r12.getInt(r10)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.BadgeCurNum()     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.Key r2 = r2.set(r3)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.Key[] r3 = new cn.jpush.android.cache.Key[r11]     // Catch: java.lang.Throwable -> L3e
            r3[r13] = r2     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.Sp.set(r8, r3)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.x.b.a(r8, r6, r0, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L277:
            boolean r9 = r0.equals(r3)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L289
            boolean r0 = r2 instanceof cn.jpush.android.local.JPushResponse     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L7c3
            r0 = r2
            cn.jpush.android.local.JPushResponse r0 = (cn.jpush.android.local.JPushResponse) r0     // Catch: java.lang.Throwable -> L3e
            a(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L289:
            java.lang.String r2 = "msg_time_out"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L2a6
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "cmd"
            int r0 = r12.getInt(r0, r14)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "rid"
            r3 = -1
            long r2 = r12.getLong(r2, r3)     // Catch: java.lang.Throwable -> L3e
            a(r8, r0, r2)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L2a6:
            java.lang.String r2 = "tagalis"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L2b3
            cn.jpush.android.ab.b.a(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L2b3:
            java.lang.String r2 = "add_local_notify"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L2ce
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "local_notify"
            java.io.Serializable r0 = r12.getSerializable(r0)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.data.JPushLocalNotification r0 = (cn.jpush.android.data.JPushLocalNotification) r0     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.v.a r2 = cn.jpush.android.v.a.a(r8)     // Catch: java.lang.Throwable -> L3e
            r2.a(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L2ce:
            java.lang.String r2 = "rm_local_notify"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L2e7
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "local_notify_ID"
            long r2 = r12.getLong(r0)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.v.a r0 = cn.jpush.android.v.a.a(r8)     // Catch: java.lang.Throwable -> L3e
            r0.a(r8, r2)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L2e7:
            java.lang.String r2 = "clear_local_notify"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L2f8
            cn.jpush.android.v.a r0 = cn.jpush.android.v.a.a(r8)     // Catch: java.lang.Throwable -> L3e
            r0.b(r8)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L2f8:
            java.lang.String r2 = "show_local_notify"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L33a
            boolean r0 = cn.jpush.android.cache.a.e(r8)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L30d
            java.lang.String r0 = "push has stoped"
            cn.jpush.android.helper.Logger.dd(r7, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L30d:
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "local_notify_msg"
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Throwable -> L3e
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L333
            java.lang.String r2 = r8.getPackageName()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = cn.jpush.android.helper.JCoreHelper.getAppKey(r8)     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            cn.jpush.android.d.d r0 = cn.jpush.android.d.d.a(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L7c3
            r0.a(r8)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.x.b.a(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L333:
            java.lang.String r0 = "local message is empty"
            cn.jpush.android.helper.Logger.d(r7, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L33a:
            java.lang.String r2 = "set_custom_notify"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = ""
            if (r2 == 0) goto L38a
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "buidler_id"
            int r0 = r12.getInt(r0, r14)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "buidler_string"
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "builderId:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = ",buildString:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.helper.Logger.d(r7, r3)     // Catch: java.lang.Throwable -> L3e
            if (r0 < 0) goto L7c3
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L7c3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            r3.append(r0)     // Catch: java.lang.Throwable -> L3e
            r3.append(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.cache.a.a(r8, r0, r2)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L38a:
            java.lang.String r2 = "third_push_upload_regid"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L39d
            if (r12 == 0) goto L7c3
            cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r0.c(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L39d:
            java.lang.String r2 = "intent.plugin.platform.ON_MESSAGING"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40e
            java.lang.String r0 = "appId"
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "senderId"
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "JMessageExtra"
            java.lang.String r10 = r12.getString(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "platform"
            byte r15 = r12.getByte(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "appId:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = ",senderId:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = ",JMessageExtra:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r10)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = ", romType: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r15)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.helper.Logger.d(r7, r3)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L3f0
            return r6
        L3f0:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L3fa
            java.lang.String r0 = r8.getPackageName()     // Catch: java.lang.Throwable -> L3e
        L3fa:
            r11 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L405
            java.lang.String r2 = cn.jpush.android.helper.JCoreHelper.getAppKey(r8)     // Catch: java.lang.Throwable -> L3e
        L405:
            r12 = r2
            r9 = 2
            r13 = 0
            cn.jpush.android.d.b.a(r8, r9, r10, r11, r12, r13, r15)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L40e:
            java.lang.String r2 = "change_foreground"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L451
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "foreground"
            boolean r0 = r12.getBoolean(r0)     // Catch: java.lang.Throwable -> L3e
            int r2 = cn.jpush.android.local.JPushConstants.isForeGround     // Catch: java.lang.Throwable -> L3e
            if (r2 != r14) goto L430
            if (r0 == 0) goto L430
            java.lang.String r2 = "first in foreground"
            cn.jpush.android.helper.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.b.d r2 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L3e
            r2.b()     // Catch: java.lang.Throwable -> L3e
        L430:
            r2 = r0 ^ 1
            cn.jpush.android.local.JPushConstants.isForeGround = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "change foregroud:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            int r3 = cn.jpush.android.local.JPushConstants.isForeGround     // Catch: java.lang.Throwable -> L3e
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.helper.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L7c3
            cn.jpush.android.x.b.a(r8, r11, r13)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L451:
            java.lang.String r2 = "check_stop"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L46b
            boolean r0 = cn.jpush.android.cache.a.e(r8)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L462
            java.lang.String r2 = "stopped"
            goto L464
        L462:
            java.lang.String r2 = "not stop"
        L464:
            r3 = 2003(0x7d3, float:2.807E-42)
            cn.jpush.android.x.b.a(r8, r3, r0, r2)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L46b:
            java.lang.String r2 = "get_connection"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L487
            boolean r0 = cn.jpush.android.local.JPushConstants.isTcpConnected()     // Catch: java.lang.Throwable -> L3e
            r2 = r0 ^ 1
            if (r0 == 0) goto L47e
            java.lang.String r0 = "connected"
            goto L480
        L47e:
            java.lang.String r0 = "not connect"
        L480:
            r3 = 2004(0x7d4, float:2.808E-42)
            cn.jpush.android.x.b.a(r8, r3, r2, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L487:
            java.lang.String r2 = "get_rid"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L49a
            java.lang.String r0 = cn.jpush.android.helper.JCoreHelper.getRegistrationID(r8)     // Catch: java.lang.Throwable -> L3e
            r2 = 2005(0x7d5, float:2.81E-42)
            cn.jpush.android.x.b.a(r8, r2, r13, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L49a:
            java.lang.String r2 = "synce_platform"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L4ab
            cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r0.a(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L4ab:
            java.lang.String r2 = "jcore_on_event"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r10 = "ups.unregister"
            if (r2 == 0) goto L5b4
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "type"
            int r0 = r12.getInt(r0)     // Catch: java.lang.Throwable -> L50b
            java.lang.String r2 = "code"
            int r2 = r12.getInt(r2)     // Catch: java.lang.Throwable -> L50b
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Throwable -> L50b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50b
            r4.<init>()     // Catch: java.lang.Throwable -> L50b
            java.lang.String r5 = "eventType:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L50b
            r4.append(r0)     // Catch: java.lang.Throwable -> L50b
            java.lang.String r5 = ",code:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L50b
            r4.append(r2)     // Catch: java.lang.Throwable -> L50b
            java.lang.String r5 = ",msg:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L50b
            r4.append(r3)     // Catch: java.lang.Throwable -> L50b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.helper.Logger.d(r7, r4)     // Catch: java.lang.Throwable -> L50b
            r4 = 2002(0x7d2, float:2.805E-42)
            r5 = 2001(0x7d1, float:2.804E-42)
            r12 = 2000(0x7d0, float:2.803E-42)
            if (r0 == r14) goto L522
            if (r0 == 0) goto L522
            if (r0 == r11) goto L522
            if (r0 == r12) goto L522
            if (r0 == r5) goto L522
            if (r0 != r4) goto L4fe
            goto L522
        L4fe:
            r4 = 19
            if (r0 != r4) goto L50e
            cn.jpush.android.v.a r0 = cn.jpush.android.v.a.a(r8)     // Catch: java.lang.Throwable -> L50b
            r0.d(r8)     // Catch: java.lang.Throwable -> L50b
            goto L7c3
        L50b:
            r0 = move-exception
            goto L59a
        L50e:
            r4 = 35
            if (r0 != r4) goto L519
            r0 = 2009(0x7d9, float:2.815E-42)
            cn.jpush.android.x.b.a(r8, r0, r13, r9)     // Catch: java.lang.Throwable -> L50b
            goto L7c3
        L519:
            r4 = 2011(0x7db, float:2.818E-42)
            if (r0 != r4) goto L7c3
            cn.jpush.android.x.b.a(r8, r0, r2, r3, r6)     // Catch: java.lang.Throwable -> L50b
            goto L7c3
        L522:
            if (r0 == r12) goto L52a
            if (r0 == r5) goto L52a
            if (r0 == 0) goto L52a
            if (r0 != r4) goto L563
        L52a:
            if (r0 != r12) goto L541
            cn.jpush.android.cache.Key r0 = cn.jpush.android.cache.Key.UPSRegister()     // Catch: java.lang.Throwable -> L50b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.cache.Key r0 = r0.set(r4)     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.cache.Key[] r4 = new cn.jpush.android.cache.Key[r11]     // Catch: java.lang.Throwable -> L50b
            r4[r13] = r0     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.cache.Sp.set(r8, r4)     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.ups.UPSPushHelper.upsCallBack(r8, r13, r10, r2, r3)     // Catch: java.lang.Throwable -> L50b
            return r6
        L541:
            cn.jpush.android.cache.Key r9 = cn.jpush.android.cache.Key.UPSRegister()     // Catch: java.lang.Throwable -> L50b
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.cache.Key r9 = r9.set(r10)     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.cache.Key[] r10 = new cn.jpush.android.cache.Key[r11]     // Catch: java.lang.Throwable -> L50b
            r10[r13] = r9     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.cache.Sp.set(r8, r10)     // Catch: java.lang.Throwable -> L50b
            java.lang.String r9 = "ups.register"
            if (r2 == r11) goto L558
            if (r0 == r5) goto L55a
        L558:
            if (r0 != r4) goto L55e
        L55a:
            cn.jpush.android.ups.UPSPushHelper.upsCallBack(r8, r13, r9, r2, r3)     // Catch: java.lang.Throwable -> L50b
            return r6
        L55e:
            if (r0 != 0) goto L563
            cn.jpush.android.ups.UPSPushHelper.upsCallBack(r8, r13, r9, r2, r3)     // Catch: java.lang.Throwable -> L50b
        L563:
            cn.jpush.android.x.b.a(r8, r0, r2, r3)     // Catch: java.lang.Throwable -> L50b
            if (r0 != r11) goto L58c
            cn.jpush.android.local.JPushConstants.setTcpConnected(r11)     // Catch: java.lang.Throwable -> L50b
            a(r8)     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L50b
            r0.c(r8)     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L50b
            r0.d()     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.aa.a r0 = cn.jpush.android.aa.a.a()     // Catch: java.lang.Throwable -> L50b
            r0.b()     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a()     // Catch: java.lang.Throwable -> L50b
            r0.a(r8)     // Catch: java.lang.Throwable -> L50b
            goto L7c3
        L58c:
            if (r0 != r14) goto L7c3
            cn.jpush.android.local.JPushConstants.setTcpConnected(r13)     // Catch: java.lang.Throwable -> L50b
            cn.jpush.android.b.d r0 = cn.jpush.android.b.d.a()     // Catch: java.lang.Throwable -> L50b
            r0.e()     // Catch: java.lang.Throwable -> L50b
            goto L7c3
        L59a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "onEvent failed:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L3e
            r2.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.helper.Logger.w(r7, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L5b4:
            java.lang.String r2 = "handle_msg"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L5be
            goto L7c3
        L5be:
            java.lang.String r2 = "third_init"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L5cf
            cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r2.a(r8, r12, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L5cf:
            java.lang.String r2 = "third_resume"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L5e0
            cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r2.a(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L5e0:
            java.lang.String r2 = "third_stop"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L5f1
            cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r2.c(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L5f1:
            java.lang.String r2 = "third_all_notify"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L602
            cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r2.b(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L602:
            java.lang.String r2 = "clear_by_id"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L619
            if (r12 == 0) goto L7c3
            int r2 = r12.getInt(r15)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.ac.e r3 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r3.a(r8, r2, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L619:
            java.lang.String r2 = "third_action"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L632
            if (r12 == 0) goto L7c3
            java.lang.String r2 = "third_key_action"
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.ac.e r3 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r3.a(r8, r2, r12, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L632:
            java.lang.String r2 = "set_third_token"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L64b
            if (r12 == 0) goto L7c3
            java.lang.String r2 = "third_token"
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.ac.e r3 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r3.b(r8, r2, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L64b:
            java.lang.String r2 = "dy_register"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L662
            cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "dev_key"
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Throwable -> L3e
            r2.a(r8, r3, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L662:
            java.lang.String r2 = "third_unbind"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L673
            cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L3e
            r0.b(r8, r12)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L673:
            java.lang.String r2 = "sync_fragment_life"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L6c5
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "activity_name"
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "state"
            boolean r2 = r12.getBoolean(r2)     // Catch: java.lang.Throwable -> L3e
            android.app.Activity r3 = cn.jpush.android.s.a.a(r8)     // Catch: java.lang.Throwable -> L7c3
            if (r3 != 0) goto L693
            android.app.Activity r3 = cn.jpush.android.ad.a.k(r8)     // Catch: java.lang.Throwable -> L7c3
        L693:
            if (r3 == 0) goto L69d
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L7c3
            java.lang.String r9 = r3.getCanonicalName()     // Catch: java.lang.Throwable -> L7c3
        L69d:
            if (r2 == 0) goto L6bc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c3
            r2.<init>()     // Catch: java.lang.Throwable -> L7c3
            r2.append(r9)     // Catch: java.lang.Throwable -> L7c3
            java.lang.String r3 = "&"
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c3
            r2.append(r0)     // Catch: java.lang.Throwable -> L7c3
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7c3
            cn.jpush.android.o.a r2 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L7c3
            r2.a(r8, r11, r0)     // Catch: java.lang.Throwable -> L7c3
            goto L7c3
        L6bc:
            cn.jpush.android.o.a r0 = cn.jpush.android.o.a.a()     // Catch: java.lang.Throwable -> L7c3
            r0.a(r8, r9)     // Catch: java.lang.Throwable -> L7c3
            goto L7c3
        L6c5:
            java.lang.String r2 = "delay_notify"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L6d6
            cn.jpush.android.x.e r0 = cn.jpush.android.x.e.a()     // Catch: java.lang.Throwable -> L3e
            r0.a(r8, r6)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L6d6:
            boolean r2 = r5.equals(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "ups.rid"
            if (r2 == 0) goto L708
            if (r12 == 0) goto L6f9
            int r0 = r12.getInt(r3)     // Catch: java.lang.Throwable -> L3e
            boolean r2 = cn.jpush.android.cache.a.b(r8, r11)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L6f2
            java.lang.String r2 = cn.jpush.android.helper.JCoreHelper.getRegistrationID(r8)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.ups.UPSPushHelper.upsCallBack(r8, r0, r5, r11, r2)     // Catch: java.lang.Throwable -> L3e
            return r6
        L6f2:
            java.lang.String r2 = cn.jpush.android.helper.JCoreHelper.getRegistrationID(r8)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.ups.UPSPushHelper.upsCallBack(r8, r0, r5, r13, r2)     // Catch: java.lang.Throwable -> L3e
        L6f9:
            cn.jpush.android.cache.a.a(r8, r11)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = "JPUSH"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L3e
            r10 = 1
            r11 = 0
            r12 = 0
            cn.jiguang.api.JCoreManager.onEvent(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L708:
            boolean r2 = r10.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L710
            goto L7c3
        L710:
            boolean r2 = r4.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L740
            if (r12 == 0) goto L731
            int r0 = r12.getInt(r3)     // Catch: java.lang.Throwable -> L3e
            boolean r2 = cn.jpush.android.cache.a.b(r8, r11)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L72a
            java.lang.String r2 = cn.jpush.android.helper.JCoreHelper.getRegistrationID(r8)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.ups.UPSPushHelper.upsCallBack(r8, r0, r4, r11, r2)     // Catch: java.lang.Throwable -> L3e
            return r6
        L72a:
            java.lang.String r2 = cn.jpush.android.helper.JCoreHelper.getRegistrationID(r8)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.ups.UPSPushHelper.upsCallBack(r8, r0, r4, r13, r2)     // Catch: java.lang.Throwable -> L3e
        L731:
            cn.jpush.android.cache.a.a(r8, r13)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = "JPUSH"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L3e
            r10 = 0
            r11 = 0
            r12 = 0
            cn.jiguang.api.JCoreManager.onEvent(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L740:
            java.lang.String r2 = "handle_cache_message"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L751
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L3e
            r0.a(r8)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L751:
            java.lang.String r2 = "sync_target"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L769
            if (r12 == 0) goto L7c3
            java.lang.String r0 = "targert"
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.q.a r2 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L3e
            r2.b(r8, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L769:
            java.lang.String r2 = "sync_view_show_success"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L781
            if (r12 == 0) goto L7c3
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "result"
            boolean r2 = r12.getBoolean(r2)     // Catch: java.lang.Throwable -> L3e
            r0.a(r8, r2)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L781:
            java.lang.String r2 = "handle_notify_inapp_message"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L7c3
            if (r12 == 0) goto L7a4
            java.lang.String r0 = "content"
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Throwable -> L3e
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L7a4
            cn.jpush.android.d.d r0 = cn.jpush.android.d.d.b(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L7a4
            cn.jpush.android.q.a r2 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L3e
            r2.a(r8, r0)     // Catch: java.lang.Throwable -> L3e
        L7a4:
            return r6
        L7a5:
            if (r12 == 0) goto L7c3
            r1.a(r8, r12, r0)     // Catch: java.lang.Throwable -> L3e
            goto L7c3
        L7ab:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleAction failed:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.e(r7, r0)
        L7c3:
            return r6
    }

    @Override // cn.jpush.android.local.JPushAction
    public void handleNotificationIntent(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            boolean r0 = cn.jpush.android.x.b.a(r4, r5)
            if (r0 != 0) goto L7
            return
        L7:
            cn.jpush.android.d.d r0 = cn.jpush.android.x.b.b(r4, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleNotificationIntent:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JPushActionImpl"
            cn.jpush.android.helper.Logger.i(r2, r1)
            if (r0 != 0) goto L30
            cn.jpush.android.ad.g r0 = cn.jpush.android.ad.g.a()
            r0.a(r4, r5)
            java.lang.String r4 = "handleNotificationIntent handleOpenClick"
            cn.jpush.android.helper.Logger.i(r2, r4)
            return
        L30:
            java.lang.String r1 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            java.lang.String r2 = r5.getAction()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L44
            cn.jpush.android.ad.g r1 = cn.jpush.android.ad.g.a()
            r1.a(r4, r0, r5)
            return
        L44:
            java.lang.String r1 = r5.getAction()
            cn.jpush.android.x.b.a(r4, r1, r0, r5)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onActivityLifeCallback(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            int r0 = r3.hashCode()     // Catch: java.lang.Throwable -> L16
            switch(r0) {
                case -1897185151: goto L42;
                case -1884319283: goto L34;
                case -995321554: goto L26;
                case 1097547223: goto L18;
                case 1986762265: goto L8;
                default: goto L7;
            }     // Catch: java.lang.Throwable -> L16
        L7:
            goto L4f
        L8:
            java.lang.String r0 = "destroyed"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L4f
            cn.jpush.android.s.a r3 = r1.f1824d     // Catch: java.lang.Throwable -> L16
            r3.f(r2)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r2 = move-exception
            goto L50
        L18:
            java.lang.String r0 = "resumed"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L4f
            cn.jpush.android.s.a r3 = r1.f1824d     // Catch: java.lang.Throwable -> L16
            r3.c(r2)     // Catch: java.lang.Throwable -> L16
            return
        L26:
            java.lang.String r0 = "paused"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L4f
            cn.jpush.android.s.a r3 = r1.f1824d     // Catch: java.lang.Throwable -> L16
            r3.d(r2)     // Catch: java.lang.Throwable -> L16
            return
        L34:
            java.lang.String r0 = "stopped"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L4f
            cn.jpush.android.s.a r3 = r1.f1824d     // Catch: java.lang.Throwable -> L16
            r3.e(r2)     // Catch: java.lang.Throwable -> L16
            return
        L42:
            java.lang.String r0 = "started"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L4f
            cn.jpush.android.s.a r3 = r1.f1824d     // Catch: java.lang.Throwable -> L16
            r3.b(r2)     // Catch: java.lang.Throwable -> L16
        L4f:
            return
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "onActivityLifeCallback failed. "
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JPushActionImpl"
            cn.jpush.android.helper.Logger.w(r3, r2)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onInAppMessageClick(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            java.lang.String r0 = "cn.jpush.android.intent.IN_APP_MSG_CLICK"
            cn.jpush.android.helper.a.a(r2, r3, r0)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onInAppMessageShow(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            java.lang.String r0 = "cn.jpush.android.intent.IN_APP_MSG_SHOW"
            cn.jpush.android.helper.a.a(r2, r3, r0)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onJPushMessageReceive(android.content.Context r2, cn.jpush.android.service.JPushMessageReceiver r3, android.content.Intent r4) {
            r1 = this;
            cn.jpush.android.helper.a r0 = cn.jpush.android.helper.a.a()
            r0.a(r2, r3, r4)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onJPushMessageReceive(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            if (r4 != 0) goto L3
            goto L12
        L3:
            android.content.Intent r2 = cn.jpush.android.ad.a.a(r4)     // Catch: java.lang.Throwable -> L12
            cn.jpush.android.helper.a r3 = cn.jpush.android.helper.a.a()     // Catch: java.lang.Throwable -> L12
            cn.jpush.android.service.JPushMessageReceiver r4 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r1)     // Catch: java.lang.Throwable -> L12
            r3.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onMessage(android.content.Context r1, cn.jpush.android.api.CustomMessage r2) {
            r0 = this;
            cn.jpush.android.helper.a.a(r1, r2)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onMultiAction(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            cn.jpush.android.helper.a.b(r1, r2)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onNotifyMessageArrived(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_RECEIVED"
            cn.jpush.android.helper.a.a(r2, r3, r0)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onNotifyMessageOpened(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            cn.jpush.android.helper.a.a(r2, r3, r0)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void onTagAliasResponse(android.content.Context r7, long r8, int r10, android.content.Intent r11) {
            r6 = this;
            cn.jpush.android.ab.d r0 = cn.jpush.android.ab.d.a()
            android.content.Context r1 = r7.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r2 = r8
            r4 = r10
            r5 = r11
            r0.a(r1, r2, r4, r5)
            return
    }

    @Override // cn.jpush.android.local.JPushAction
    public void setAliasAndTags(android.content.Context r1, java.lang.String r2, java.util.Set<java.lang.String> r3, cn.jpush.android.api.CallBackParams r4) {
            r0 = this;
            cn.jpush.android.ab.b.a(r1, r2, r3, r4)
            return
    }
}
