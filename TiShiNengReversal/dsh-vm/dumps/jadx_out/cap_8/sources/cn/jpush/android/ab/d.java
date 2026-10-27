package cn.jpush.android.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static volatile cn.jpush.android.ab.d a;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f1620d = null;

    /* renamed from: b, reason: collision with root package name */
    private cn.jpush.android.service.TagAliasReceiver f1621b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> f1622c;

    /* renamed from: e, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f1623e;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.ab.d.f1620d = r0
            return
    }

    private d() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f1622c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f1623e = r0
            return
    }

    public static cn.jpush.android.ab.d a() {
            cn.jpush.android.ab.d r0 = cn.jpush.android.ab.d.a
            if (r0 != 0) goto L19
            java.lang.Object r0 = cn.jpush.android.ab.d.f1620d
            monitor-enter(r0)
            cn.jpush.android.ab.d r1 = cn.jpush.android.ab.d.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jpush.android.ab.d r1 = new cn.jpush.android.ab.d     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.ab.d.a = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jpush.android.ab.d r0 = cn.jpush.android.ab.d.a
            return r0
    }

    private java.lang.String a(cn.jpush.android.api.CallBackParams r5) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "TagAliasOperator"
            if (r5 != 0) goto Lb
            java.lang.String r5 = "callBack was null"
            cn.jpush.android.helper.Logger.w(r1, r5)
            return r0
        Lb:
            java.util.Set<java.lang.String> r2 = r5.tags     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L36
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L21
            if (r2 <= 0) goto L36
            java.util.Set<java.lang.String> r5 = r5.tags     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r5 = r5.toArray()     // Catch: java.lang.Throwable -> L21
            r2 = 0
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L21
            return r5
        L21:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get origin check tag failed, error:"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jpush.android.helper.Logger.d(r1, r5)
        L36:
            return r0
    }

    private void a(android.content.Context r4, int r5, long r6) {
            r3 = this;
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.TIMEOUT
            java.lang.String r1 = "TagAliasOperator"
            if (r5 != r0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "action - onTimeout rid:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
        L17:
            cn.jpush.android.helper.Logger.v(r1, r0)
            goto L1e
        L1b:
            java.lang.String r0 = "action - on send data over limit"
            goto L17
        L1e:
            cn.jpush.android.api.CallBackParams r0 = r3.a(r6)
            if (r0 != 0) goto L39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "tagalias callback is null; rid="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.w(r1, r4)
            return
        L39:
            r3.b(r6)
            r6 = 0
            r3.a(r4, r0, r5, r6)
            return
    }

    private void a(android.content.Context r4, int r5, long r6, android.content.Intent r8) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SetAliasAndTags finish : errorCode:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " rid:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasOperator"
            cn.jpush.android.helper.Logger.v(r1, r0)
            cn.jpush.android.api.CallBackParams r0 = r3.a(r6)
            if (r0 != 0) goto L39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "tagalias callback is null; rid="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.w(r1, r4)
            return
        L39:
            cn.jpush.android.ab.d r2 = a()
            r2.b(r6)
            r6 = 0
            if (r8 == 0) goto Laf
            int r7 = r0.action     // Catch: java.lang.Throwable -> L73
            r2 = 5
            if (r7 != r2) goto L90
            int r7 = r0.protoType     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r7 != r2) goto L75
            java.lang.String r7 = "tags"
            java.util.ArrayList r7 = r8.getStringArrayListExtra(r7)     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto Laf
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L73
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L73
            r0.tags = r8     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r7.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = "all tags was loaded, value:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L73
            java.util.Set<java.lang.String> r8 = r0.tags     // Catch: java.lang.Throwable -> L73
            r7.append(r8)     // Catch: java.lang.Throwable -> L73
        L6b:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.Logger.d(r1, r7)     // Catch: java.lang.Throwable -> L73
            goto Laf
        L73:
            r7 = move-exception
            goto L9b
        L75:
            r2 = 2
            if (r7 != r2) goto Laf
            java.lang.String r7 = "alias"
            java.lang.String r7 = r8.getStringExtra(r7)     // Catch: java.lang.Throwable -> L73
            r0.alias = r7     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r7.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = "alias was loaded, value:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L73
            java.util.Set<java.lang.String> r8 = r0.tags     // Catch: java.lang.Throwable -> L73
            r7.append(r8)     // Catch: java.lang.Throwable -> L73
            goto L6b
        L90:
            r2 = 6
            if (r7 != r2) goto Laf
            java.lang.String r7 = "validated"
            boolean r6 = r8.getBooleanExtra(r7, r6)     // Catch: java.lang.Throwable -> L73
            goto Laf
        L9b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "get tag or alias failed - error:"
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jpush.android.helper.Logger.d(r1, r7)
        Laf:
            r3.a(r4, r0, r5, r6)
            return
    }

    private void a(android.content.Context r1, cn.jpush.android.api.CallBackParams r2, int r3, boolean r4) {
            r0 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "action - invokeUserCallback, errorCode:"
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = ",callBack:"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "TagAliasOperator"
            cn.jpush.android.helper.Logger.d(r4, r1)
            int r1 = r2.protoType
            if (r1 != 0) goto L2e
            cn.jpush.android.api.TagAliasCallback r1 = r2.tagAliasCallBack
            if (r1 == 0) goto L2d
            java.lang.String r4 = r2.alias
            java.util.Set<java.lang.String> r2 = r2.tags
            r1.gotResult(r3, r4, r2)
        L2d:
            return
        L2e:
            java.lang.String r1 = "new proto type do not call user callback"
            cn.jpush.android.helper.Logger.w(r4, r1)
            return
    }

    private void c(android.content.Context r7) {
            r6 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> r0 = r6.f1622c
            if (r0 == 0) goto L6d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> r1 = r6.f1622c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jpush.android.api.CallBackParams r3 = (cn.jpush.android.api.CallBackParams) r3
            r4 = 20000(0x4e20, double:9.8813E-320)
            boolean r3 = r3.isTimeOut(r4)
            if (r3 == 0) goto L19
            java.lang.Object r2 = r2.getKey()
            java.lang.Long r2 = (java.lang.Long) r2
            r0.add(r2)
            goto L19
        L3d:
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "cleanTimeOutCallback timeout rid:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TagAliasOperator"
            cn.jpush.android.helper.Logger.w(r3, r2)
            int r2 = cn.jpush.android.api.JPushInterface.ErrorCode.TIMEOUT
            long r3 = r1.longValue()
            r6.a(r7, r2, r3)
            goto L41
        L6d:
            return
    }

    public cn.jpush.android.api.CallBackParams a(long r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> r0 = r1.f1622c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            cn.jpush.android.api.CallBackParams r2 = (cn.jpush.android.api.CallBackParams) r2
            return r2
    }

    public cn.jpush.android.api.JPushMessage a(android.content.Context r9, android.content.Intent r10) {
            r8 = this;
            java.lang.String r9 = "tagalias_seqid"
            r0 = -1
            long r0 = r10.getLongExtra(r9, r0)
            java.lang.String r9 = "tagalias_errorcode"
            r2 = 0
            int r9 = r10.getIntExtra(r9, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parseTagAliasResponse2JPushMessage, errorCode:"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = " rid:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "TagAliasOperator"
            cn.jpush.android.helper.Logger.v(r4, r3)
            cn.jpush.android.api.CallBackParams r3 = r8.a(r0)
            if (r3 != 0) goto L49
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "tagalias callback is null; rid="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            cn.jpush.android.helper.Logger.w(r4, r9)
            r9 = 0
            return r9
        L49:
            cn.jpush.android.ab.d r5 = a()
            r5.b(r0)
            r0 = 6
            r1 = 1
            if (r9 != 0) goto Lbe
            int r5 = r3.action     // Catch: java.lang.Throwable -> L83
            r6 = 5
            if (r5 != r6) goto La0
            int r5 = r3.protoType     // Catch: java.lang.Throwable -> L83
            if (r5 != r1) goto L85
            java.lang.String r5 = "tags"
            java.util.ArrayList r5 = r10.getStringArrayListExtra(r5)     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto Lbe
            java.util.HashSet r6 = new java.util.HashSet     // Catch: java.lang.Throwable -> L83
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L83
            r3.tags = r6     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "all tags was loaded, value:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L83
            java.util.Set<java.lang.String> r6 = r3.tags     // Catch: java.lang.Throwable -> L83
            r5.append(r6)     // Catch: java.lang.Throwable -> L83
        L7b:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L83
            cn.jpush.android.helper.Logger.d(r4, r5)     // Catch: java.lang.Throwable -> L83
            goto Lbe
        L83:
            r5 = move-exception
            goto Laa
        L85:
            r6 = 2
            if (r5 != r6) goto Lbe
            java.lang.String r5 = "alias"
            java.lang.String r5 = r10.getStringExtra(r5)     // Catch: java.lang.Throwable -> L83
            r3.alias = r5     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "alias was loaded, value:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L83
            java.util.Set<java.lang.String> r6 = r3.tags     // Catch: java.lang.Throwable -> L83
            r5.append(r6)     // Catch: java.lang.Throwable -> L83
            goto L7b
        La0:
            if (r5 != r0) goto Lbe
            java.lang.String r5 = "validated"
            boolean r2 = r10.getBooleanExtra(r5, r2)     // Catch: java.lang.Throwable -> L83
            goto Lbe
        Laa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get tag or alias failed - error:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.d(r4, r5)
        Lbe:
            cn.jpush.android.api.JPushMessage r5 = new cn.jpush.android.api.JPushMessage
            r5.<init>()
            int r6 = r3.protoType
            r5.setProtoType(r6)
            int r6 = r3.action
            r5.setAction(r6)
            r5.setErrorCode(r9)
            int r9 = r3.sequence
            r5.setSequence(r9)
            int r9 = r3.protoType
            if (r9 != r1) goto Lf1
            int r9 = r3.action
            if (r9 != r0) goto Leb
            java.lang.String r9 = r8.a(r3)
            r5.setCheckTag(r9)
            r5.setTagCheckStateResult(r2)
            r5.setTagCheckOperator(r1)
            goto L14d
        Leb:
            java.util.Set<java.lang.String> r9 = r3.tags
            r5.setTags(r9)
            goto L14d
        Lf1:
            r0 = 3
            if (r9 != r0) goto L148
            java.lang.String r9 = "message_des"
            java.lang.String r9 = r10.getStringExtra(r9)     // Catch: java.lang.Throwable -> L122
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L122
            if (r10 != 0) goto L128
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> L122
            r10.<init>()     // Catch: java.lang.Throwable -> L122
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L122
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L122
            java.util.Iterator r9 = r0.keys()     // Catch: java.lang.Throwable -> L122
        L10e:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L122
            if (r1 == 0) goto L124
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L122
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L122
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L122
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L122
            goto L10e
        L122:
            r9 = move-exception
            goto L12e
        L124:
            r5.setPros(r10)     // Catch: java.lang.Throwable -> L122
            goto L14d
        L128:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r3.pros     // Catch: java.lang.Throwable -> L122
            r5.setPros(r9)     // Catch: java.lang.Throwable -> L122
            goto L14d
        L12e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "pros des  failed - error:"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.helper.Logger.d(r4, r9)
            java.util.Map<java.lang.String, java.lang.Object> r9 = r3.pros
            r5.setPros(r9)
            goto L14d
        L148:
            java.lang.String r9 = r3.alias
            r5.setAlias(r9)
        L14d:
            return r5
    }

    public synchronized void a(android.content.Context r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f1623e     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L6c
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r1 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.addCategory(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r1 = "cn.jpush.android.intent.TAG_ALIAS_TIMEOUT"
            r0.addAction(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r1 = "cn.jpush.android.intent.TAG_ALIAS_CALLBACK"
            r0.addAction(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            cn.jpush.android.service.TagAliasReceiver r1 = r4.f1621b     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r1 != 0) goto L2f
            cn.jpush.android.service.TagAliasReceiver r1 = new cn.jpush.android.service.TagAliasReceiver     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r4.f1621b = r1     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L2f
        L2b:
            r5 = move-exception
            goto L75
        L2d:
            r5 = move-exception
            goto L51
        L2f:
            cn.jpush.android.service.TagAliasReceiver r1 = r4.f1621b     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r3 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r3 = ".permission.JPUSH_MESSAGE"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r3 = 0
            cn.jpush.android.ad.j.a(r5, r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f1623e     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0 = 1
            r5.set(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L73
        L51:
            java.lang.String r0 = "TagAliasOperator"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "setTagAndAlias e:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L2b
            r1.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            cn.jpush.android.helper.Logger.e(r0, r5)     // Catch: java.lang.Throwable -> L2b
            goto L73
        L6c:
            java.lang.String r5 = "TagAliasOperator"
            java.lang.String r0 = "tag alias callback register is called"
            cn.jpush.android.helper.Logger.d(r5, r0)     // Catch: java.lang.Throwable -> L2b
        L73:
            monitor-exit(r4)
            return
        L75:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r5
    }

    public void a(android.content.Context r8, long r9, int r11, android.content.Intent r12) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - onTagAliasResponse rid:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = " tagAliasCallbacks :"
            r0.append(r1)
            cn.jpush.android.ab.d r1 = a()
            java.util.concurrent.ConcurrentHashMap r1 = r1.b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasOperator"
            cn.jpush.android.helper.Logger.v(r1, r0)
            java.lang.String r0 = "cn.jpush.android.intent.TAG_ALIAS_TIMEOUT"
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r7.a(r8, r11, r9)
            r2 = r8
            goto L3f
        L37:
            r1 = r7
            r2 = r8
            r4 = r9
            r3 = r11
            r6 = r12
            r1.a(r2, r3, r4, r6)
        L3f:
            r7.b(r2)
            return
    }

    public void a(android.content.Context r1, java.lang.Long r2, cn.jpush.android.api.CallBackParams r3) {
            r0 = this;
            r0.c(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> r1 = r0.f1622c
            r1.put(r2, r3)
            return
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> b() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> r0 = r1.f1622c
            return r0
    }

    public void b(long r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> r0 = r1.f1622c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.remove(r2)
            return
    }

    public synchronized void b(android.content.Context r3) {
            r2 = this;
            monitor-enter(r2)
            r2.c(r3)     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1623e     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L42
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.api.CallBackParams> r0 = r2.f1622c     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L42
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L42
            cn.jpush.android.service.TagAliasReceiver r0 = r2.f1621b     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23 java.lang.IllegalArgumentException -> L25
            if (r0 == 0) goto L34
            r3.unregisterReceiver(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23 java.lang.IllegalArgumentException -> L25
            r3 = 0
            r2.f1621b = r3     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23 java.lang.IllegalArgumentException -> L25
            goto L34
        L21:
            r3 = move-exception
            goto L49
        L23:
            r3 = move-exception
            goto L27
        L25:
            r3 = move-exception
            goto L2f
        L27:
            java.lang.String r0 = "TagAliasOperator"
            java.lang.String r1 = "other exception"
        L2b:
            cn.jpush.android.helper.Logger.ww(r0, r1, r3)     // Catch: java.lang.Throwable -> L21
            goto L34
        L2f:
            java.lang.String r0 = "TagAliasOperator"
            java.lang.String r1 = "Receiver not registered, cannot call unregisterReceiver"
            goto L2b
        L34:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f1623e     // Catch: java.lang.Throwable -> L21
            r0 = 0
            r3.set(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "TagAliasOperator"
            java.lang.String r0 = "unRegister tag alias callback"
        L3e:
            cn.jpush.android.helper.Logger.v(r3, r0)     // Catch: java.lang.Throwable -> L21
            goto L47
        L42:
            java.lang.String r3 = "TagAliasOperator"
            java.lang.String r0 = "tagAliasCallbacks is not empty"
            goto L3e
        L47:
            monitor-exit(r2)
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
    }
}
