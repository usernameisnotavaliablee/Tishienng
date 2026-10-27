package cn.jpush.android.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static volatile cn.jpush.android.ab.c a;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f1608b = null;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c.a> f1609c;

    public class a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f1610b;

        /* renamed from: c, reason: collision with root package name */
        public long f1611c;

        /* renamed from: d, reason: collision with root package name */
        public java.util.ArrayList<java.lang.String> f1612d;

        /* renamed from: e, reason: collision with root package name */
        public java.util.Map<java.lang.String, java.lang.Object> f1613e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f1614f;

        /* renamed from: g, reason: collision with root package name */
        public int f1615g;

        /* renamed from: h, reason: collision with root package name */
        public int f1616h;

        /* renamed from: i, reason: collision with root package name */
        public int f1617i;

        /* renamed from: j, reason: collision with root package name */
        public int f1618j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ cn.jpush.android.ab.c f1619k;

        public a(cn.jpush.android.ab.c r1, int r2, int r3, long r4, java.util.ArrayList<java.lang.String> r6, java.util.Map<java.lang.String, java.lang.Object> r7, java.lang.String r8) {
                r0 = this;
                r0.f1619k = r1
                r0.<init>()
                r1 = -1
                r0.f1615g = r1
                r0.f1616h = r1
                r1 = 0
                r0.f1617i = r1
                r0.f1618j = r1
                r0.a = r2
                r0.f1610b = r3
                r0.f1611c = r4
                r0.f1612d = r6
                r1 = 1
                if (r2 != r1) goto L23
                if (r6 != 0) goto L23
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r0.f1612d = r3
            L23:
                r0.f1613e = r7
                r3 = 3
                if (r2 != r3) goto L31
                if (r7 != 0) goto L31
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                r0.f1613e = r2
            L31:
                r0.f1614f = r8
                r0.f1618j = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TagAliasCacheBean{protoType="
                r0.append(r1)
                int r1 = r3.a
                r0.append(r1)
                java.lang.String r1 = ", actionType="
                r0.append(r1)
                int r1 = r3.f1610b
                r0.append(r1)
                java.lang.String r1 = ", seqID="
                r0.append(r1)
                long r1 = r3.f1611c
                r0.append(r1)
                java.lang.String r1 = ", tags="
                r0.append(r1)
                java.util.ArrayList<java.lang.String> r1 = r3.f1612d
                r0.append(r1)
                java.lang.String r1 = ", pros="
                r0.append(r1)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f1613e
                r0.append(r1)
                java.lang.String r1 = ", alias='"
                r0.append(r1)
                java.lang.String r1 = r3.f1614f
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", totalPage="
                r0.append(r1)
                int r1 = r3.f1615g
                r0.append(r1)
                java.lang.String r1 = ", currPage="
                r0.append(r1)
                int r1 = r3.f1616h
                r0.append(r1)
                java.lang.String r1 = ", retryCount="
                r0.append(r1)
                int r1 = r3.f1617i
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.ab.c.f1608b = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f1609c = r0
            return
    }

    private cn.jpush.android.ab.c.a a(org.json.JSONObject r5, cn.jpush.android.ab.c.a r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - onUpdateCacheNode,responseJson:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ",tagAliasCacheNode:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            if (r6 != 0) goto L27
            java.lang.String r5 = "tagAliasCacheNode was null"
            cn.jpush.android.helper.Logger.w(r1, r5)
            r5 = 0
            return r5
        L27:
            java.lang.String r0 = "op"
            java.lang.String r0 = r5.optString(r0)
            java.lang.String r2 = "get"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L8b
            int r0 = r6.a
            r2 = 1
            if (r0 != r2) goto L81
            java.lang.String r0 = "tags"
            org.json.JSONArray r5 = r5.optJSONArray(r0)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L8b
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L8b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            r2 = 0
        L4e:
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L5e
            if (r2 >= r3) goto L60
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L5e
            r0.add(r3)     // Catch: java.lang.Throwable -> L5e
            int r2 = r2 + 1
            goto L4e
        L5e:
            r5 = move-exception
            goto L6c
        L60:
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L5e
            if (r5 <= 0) goto L8b
            java.util.ArrayList<java.lang.String> r5 = r6.f1612d     // Catch: java.lang.Throwable -> L5e
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L5e
            return r6
        L6c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "parse tag list failed - error:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cn.jpush.android.helper.Logger.e(r1, r5)
            return r6
        L81:
            java.lang.String r0 = "alias"
            java.lang.String r5 = r5.optString(r0)
            if (r5 == 0) goto L8b
            r6.f1614f = r5
        L8b:
            return r6
    }

    public static cn.jpush.android.ab.c a() {
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a
            if (r0 != 0) goto L19
            java.lang.Object r0 = cn.jpush.android.ab.c.f1608b
            monitor-enter(r0)
            cn.jpush.android.ab.c r1 = cn.jpush.android.ab.c.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jpush.android.ab.c r1 = new cn.jpush.android.ab.c     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.ab.c.a = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a
            return r0
    }

    private boolean a(android.content.Context r8, int r9, cn.jpush.android.ab.c.a r10) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - CheckAndSendAgain, errorCode:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ",tagAliasCacheNode:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r0 = 1
            if (r9 != r0) goto L3c
            int r9 = r10.f1617i
            if (r9 != 0) goto L3c
            int r9 = r9 + r0
            r10.f1617i = r9
            int r3 = r10.a
            long r4 = r10.f1611c
            int r6 = r10.f1610b
            r1 = r7
            r2 = r8
            boolean r8 = r1.a(r2, r3, r4, r6)
            if (r8 == 0) goto L37
            return r0
        L37:
            boolean r8 = r7.b(r2, r10)
            return r8
        L3c:
            r1 = r7
            r8 = 0
            return r8
    }

    private boolean a(android.content.Context r4, cn.jpush.android.ab.c.a r5) {
            r3 = this;
            r4 = 0
            java.lang.String r0 = "TagAliasNewProtoRetryHelper"
            if (r5 != 0) goto Lb
            java.lang.String r5 = "tagAlias cache was null"
        L7:
            cn.jpush.android.helper.Logger.d(r0, r5)
            return r4
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action - onTagAliasResponse, tagAliasCacheNode:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r1)
            int r1 = r5.f1616h
            int r5 = r5.f1615g
            if (r1 < r5) goto L28
            java.lang.String r5 = "all tags info was loaded"
            goto L7
        L28:
            r4 = 1
            return r4
    }

    private boolean b(android.content.Context r14, cn.jpush.android.ab.c.a r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - onSendAgain, tagAliasCacheNode:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r0 = 0
            if (r15 != 0) goto L1f
            java.lang.String r14 = "onSendAgain - tagAliasCacheNode was null"
            cn.jpush.android.helper.Logger.w(r1, r14)
            return r0
        L1f:
            int r2 = r15.a
            r3 = 4
            r4 = 3
            r5 = 1
            if (r2 != r5) goto L36
            java.util.ArrayList<java.lang.String> r7 = r15.f1612d
            long r8 = r15.f1611c
            int r10 = r15.f1610b
            int r11 = r15.f1615g
            int r12 = r15.f1616h
            r6 = r14
            java.lang.String r14 = cn.jpush.android.ab.b.a(r6, r7, r8, r10, r11, r12)
            goto L53
        L36:
            r6 = r14
            r14 = 2
            if (r2 != r14) goto L43
            java.lang.String r14 = r15.f1614f
            long r7 = r15.f1611c
            java.lang.String r14 = cn.jpush.android.ab.b.a(r6, r14, r7, r2)
            goto L53
        L43:
            if (r2 != r4) goto L4f
            long r7 = r15.f1611c
            int r14 = r15.f1610b
            r2 = 0
            java.lang.String r14 = cn.jpush.android.ab.b.a(r6, r2, r7, r14)
            goto L53
        L4f:
            if (r2 != r3) goto La7
            java.lang.String r14 = "PROTO_TYPE_PUSH_STATUS"
        L53:
            if (r14 == 0) goto La6
            int r0 = r15.f1617i
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 <= r2) goto L77
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r14 = r13.f1609c
            long r2 = r15.f1611c
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r14.remove(r0)
            int r7 = r15.a
            int r8 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_TOO_BUSY
            long r9 = r15.f1611c
            int r11 = r15.f1610b
            cn.jpush.android.ab.b.a(r6, r7, r8, r9, r11)
            java.lang.String r14 = "same tag/alias request times greate than 200"
        L73:
            cn.jpush.android.helper.Logger.d(r1, r14)
            goto La5
        L77:
            int r0 = r15.a
            if (r0 != r4) goto L83
            long r2 = r15.f1611c
            int r0 = r15.f1610b
            cn.jpush.android.ab.b.a(r6, r2, r14, r0)
            goto L92
        L83:
            if (r0 != r3) goto L8d
            long r2 = r15.f1611c
            int r14 = r15.f1610b
            cn.jpush.android.ab.b.a(r6, r2, r14)
            goto L92
        L8d:
            long r2 = r15.f1611c
            cn.jpush.android.ab.b.a(r6, r0, r2, r14)
        L92:
            int r14 = r15.f1617i
            int r14 = r14 + r5
            r15.f1617i = r14
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r14 = r13.f1609c
            long r2 = r15.f1611c
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r14.put(r0, r15)
            java.lang.String r14 = "send request success"
            goto L73
        La5:
            return r5
        La6:
            return r0
        La7:
            java.lang.String r14 = "unsupport proto type"
            cn.jpush.android.helper.Logger.d(r1, r14)
            return r0
    }

    public int a(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L3
            goto L16
        L3:
            r1 = 17
            if (r2 == r1) goto L35
            r1 = 100
            if (r2 == r1) goto L32
            r1 = 1013(0x3f5, float:1.42E-42)
            if (r2 == r1) goto L2f
            r1 = 1014(0x3f6, float:1.421E-42)
            if (r2 == r1) goto L2c
            switch(r2) {
                case 1: goto L29;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L1a;
                case 9: goto L17;
                default: goto L16;
            }
        L16:
            return r2
        L17:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_TOO_MANY_TAGS
            return r1
        L1a:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_GET_FAILED
            return r1
        L1d:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_INTERNEL_SERVER_ERROR
            return r1
        L20:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_INVALIDREQ
            return r1
        L23:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_INVALIDUSER
            return r1
        L26:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_BLACKLIST
            return r1
        L29:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_TOO_BUSY
            return r1
        L2c:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_PROPERTY_ERROR
            return r1
        L2f:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_APPKEY_NOT_AUTH_TO_SET_PROPERTY
            return r1
        L32:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_SERVER_UNAVAILABLE
            return r1
        L35:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_ALIAS_LIMIT     // Catch: java.lang.Throwable -> L38
            return r1
        L38:
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_INVALIDREQ
            return r1
    }

    public int a(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - onTagAliasTimeOut :"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r0 = r2.f1609c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r0.remove(r3)
            cn.jpush.android.ab.c$a r3 = (cn.jpush.android.ab.c.a) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "onTagAliasTimeOut,removed cachenode:"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.d(r1, r4)
            if (r3 == 0) goto L3b
            int r3 = r3.a
            return r3
        L3b:
            r3 = 0
            return r3
    }

    public android.content.Intent a(android.content.Context r5, long r6, int r8, android.content.Intent r9) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - onProsResponse, seqID:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ",errorCode:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ",intent:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r0 = r4.f1609c
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = r0.get(r2)
            cn.jpush.android.ab.c$a r0 = (cn.jpush.android.ab.c.a) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "tagAliasCacheNode:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r1, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r2 = r4.f1609c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.remove(r6)
            if (r0 != 0) goto L57
            java.lang.String r5 = "tagAliasCacheNode was null"
            cn.jpush.android.helper.Logger.w(r1, r5)
            return r9
        L57:
            boolean r5 = r4.a(r5, r8, r0)
            if (r5 == 0) goto L64
            java.lang.String r5 = "retry action was sended"
            cn.jpush.android.helper.Logger.d(r1, r5)
            r5 = 0
            return r5
        L64:
            if (r8 == 0) goto L85
            int r5 = r0.a
            int r5 = r4.a(r5, r8)
            java.lang.String r6 = "tagalias_errorcode"
            r9.putExtra(r6, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "mapped errorCode:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.d(r1, r5)
        L85:
            return r9
    }

    public android.content.Intent a(android.content.Context r15, long r16, int r18, org.json.JSONObject r19, android.content.Intent r20) {
            r14 = this;
            r2 = r18
            r6 = r19
            r7 = r20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "action - onTagAliasResponse, seqID:"
            r3.append(r4)
            r4 = r16
            r3.append(r4)
            java.lang.String r8 = ",errorCode:"
            r3.append(r8)
            r3.append(r2)
            java.lang.String r8 = ",intent:"
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r8 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r8, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r3 = r14.f1609c
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r9)
            r9 = r3
            cn.jpush.android.ab.c$a r9 = (cn.jpush.android.ab.c.a) r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "tagAliasCacheNode:"
            r3.append(r10)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.d(r8, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r3 = r14.f1609c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.remove(r4)
            if (r6 != 0) goto L60
            java.lang.String r1 = "responseJson was null"
            cn.jpush.android.helper.Logger.w(r8, r1)
            return r7
        L60:
            if (r9 != 0) goto L68
            java.lang.String r1 = "tagAliasCacheNode was null"
            cn.jpush.android.helper.Logger.w(r8, r1)
            return r7
        L68:
            boolean r3 = r14.a(r15, r2, r9)
            r10 = 0
            if (r3 == 0) goto L75
            java.lang.String r1 = "retry action was sended"
        L71:
            cn.jpush.android.helper.Logger.d(r8, r1)
            return r10
        L75:
            if (r2 == 0) goto Lc6
            r3 = 100
            if (r2 != r3) goto La6
            java.lang.String r3 = "wait"
            r4 = -1
            long r3 = r6.optLong(r3, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "set tag/alias action will freeze "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = " seconds"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.helper.Logger.ww(r8, r5)
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto La6
            cn.jpush.android.cache.a.a(r15, r3)
        La6:
            int r1 = r9.a
            int r1 = r14.a(r1, r2)
            java.lang.String r2 = "tagalias_errorcode"
            r7.putExtra(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mapped errorCode:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jpush.android.helper.Logger.d(r8, r1)
            return r7
        Lc6:
            r11 = 0
            r9.f1617i = r11
            int r2 = r9.f1610b
            r12 = 5
            if (r2 != r12) goto Le2
            java.lang.String r2 = "total"
            r3 = -1
            int r2 = r6.optInt(r2, r3)
            r9.f1615g = r2
            java.lang.String r2 = "curr"
            int r2 = r6.optInt(r2, r3)
            r9.f1616h = r2
            r14.a(r6, r9)
        Le2:
            boolean r2 = r14.a(r15, r9)
            r13 = 1
            if (r2 == 0) goto L127
            int r2 = r9.f1616h
            int r2 = r2 + r13
            r9.f1616h = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load next page, currpage:"
            r2.append(r3)
            int r3 = r9.f1616h
            r2.append(r3)
            java.lang.String r3 = ",totalPage:"
            r2.append(r3)
            int r3 = r9.f1615g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r8, r2)
            int r2 = r9.a
            long r3 = r9.f1611c
            int r5 = r9.f1610b
            r0 = r14
            r1 = r15
            boolean r2 = r0.a(r1, r2, r3, r5)
            if (r2 == 0) goto L11d
            return r10
        L11d:
            boolean r1 = r14.b(r15, r9)
            if (r1 == 0) goto L127
            java.lang.String r1 = "get next page request was sended"
            goto L71
        L127:
            int r1 = r9.f1610b
            if (r1 != r12) goto L14c
            int r1 = r9.a
            if (r1 != r13) goto L13f
            java.util.ArrayList<java.lang.String> r1 = r9.f1612d
            int r1 = r1.size()
            if (r1 <= 0) goto L163
            java.lang.String r1 = "tags"
            java.util.ArrayList<java.lang.String> r2 = r9.f1612d
            r7.putStringArrayListExtra(r1, r2)
            return r7
        L13f:
            r2 = 2
            if (r1 != r2) goto L163
            java.lang.String r1 = r9.f1614f
            if (r1 == 0) goto L163
            java.lang.String r2 = "alias"
            r7.putExtra(r2, r1)
            return r7
        L14c:
            r2 = 6
            if (r1 != r2) goto L163
            int r1 = r9.a
            if (r1 != r13) goto L15e
            java.lang.String r1 = "validated"
            boolean r2 = r6.optBoolean(r1, r11)
            r7.putExtra(r1, r2)
            return r7
        L15e:
            java.lang.String r1 = "unsupport  proto type"
            cn.jpush.android.helper.Logger.w(r8, r1)
        L163:
            return r7
    }

    public cn.jpush.android.ab.c.a a(android.content.Context r5, long r6, int r8) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - onPushStatusResponse, seqID:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ",errorCode:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r0 = r4.f1609c
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = r0.get(r2)
            cn.jpush.android.ab.c$a r0 = (cn.jpush.android.ab.c.a) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "tagAliasCacheNode:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r1, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r2 = r4.f1609c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.remove(r6)
            if (r0 != 0) goto L4f
            java.lang.String r5 = "tagAliasCacheNode was null"
            cn.jpush.android.helper.Logger.w(r1, r5)
            return r0
        L4f:
            boolean r5 = r4.a(r5, r8, r0)
            if (r5 == 0) goto L5c
            java.lang.String r5 = "retry action was sended"
            cn.jpush.android.helper.Logger.d(r1, r5)
            r5 = 0
            return r5
        L5c:
            return r0
    }

    public void a(int r10, int r11, long r12, java.util.ArrayList<java.lang.String> r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.Object> r16) {
            r9 = this;
            cn.jpush.android.ab.c$a r0 = new cn.jpush.android.ab.c$a
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r8 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "action - createNewCacheNode, tagAliasCacheNode:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "TagAliasNewProtoRetryHelper"
            cn.jpush.android.helper.Logger.d(r11, r10)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r10 = r9.f1609c
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            r10.put(r11, r0)
            return
    }

    public void a(android.content.Context r3) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r0 = r2.f1609c     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2a
            if (r0 <= 0) goto L2a
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r0 = r2.f1609c     // Catch: java.lang.Throwable -> L2a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2a
            cn.jpush.android.ab.c$a r1 = (cn.jpush.android.ab.c.a) r1     // Catch: java.lang.Throwable -> L2a
            r2.b(r3, r1)     // Catch: java.lang.Throwable -> L2a
            goto L14
        L2a:
            return
    }

    public boolean a(int r3) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r0 = r2.f1609c
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.ab.c$a> r0 = r2.f1609c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            cn.jpush.android.ab.c$a r1 = (cn.jpush.android.ab.c.a) r1
            if (r1 == 0) goto L14
            int r1 = r1.a
            if (r1 != r3) goto L14
            r3 = 0
            return r3
        L2e:
            r3 = 1
            return r3
    }

    protected boolean a(android.content.Context r10, int r11, long r12, int r14) {
            r9 = this;
            r0 = 1
            if (r11 == r0) goto Lc
            r1 = 2
            if (r11 == r1) goto Lc
            r1 = 3
            if (r11 == r1) goto Lc
            r1 = 4
            if (r11 != r1) goto L23
        Lc:
            boolean r1 = cn.jpush.android.cache.a.k(r10)
            if (r1 == 0) goto L23
            java.lang.String r1 = "TagAliasNewProtoRetryHelper"
            java.lang.String r2 = "tag/alias action was freezed"
            cn.jpush.android.helper.Logger.w(r1, r2)
            int r5 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_SERVER_UNAVAILABLE
            r3 = r10
            r4 = r11
            r6 = r12
            r8 = r14
            cn.jpush.android.ab.b.a(r3, r4, r5, r6, r8)
            return r0
        L23:
            r10 = 0
            return r10
    }
}
