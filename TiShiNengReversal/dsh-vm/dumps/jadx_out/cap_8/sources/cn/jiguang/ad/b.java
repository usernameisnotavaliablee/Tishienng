package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public static java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> a;

    /* renamed from: cn.jiguang.ad.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.ad.b a = null;

        static {
                cn.jiguang.ad.b r0 = new cn.jiguang.ad.b
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ad.b.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ad.b a() {
                cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a.a
                return r0
        }
    }

    static {
            return
    }

    private b() {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = cn.jiguang.internal.ActionManager.getDispatchActionMap()
            cn.jiguang.ad.b.a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "actiom map :"
            r0.append(r1)
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DispatchActionManager"
            cn.jiguang.w.f.c(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "actiom map size :"
            r0.append(r2)
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r2 = cn.jiguang.ad.b.a
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            java.lang.Class<cn.jiguang.c.a> r0 = cn.jiguang.c.a.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r1 = "JCore"
            r3.a(r1, r0)
            return
    }

    /* synthetic */ b(cn.jiguang.ad.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.ad.b a() {
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a.a()
            return r0
    }

    private static int b(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "\\."
            java.lang.String[] r2 = r2.split(r0)
            r0 = r2[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 << 16
            r1 = 1
            r1 = r2[r1]
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 << 8
            int r0 = r0 + r1
            r1 = 2
            r2 = r2[r1]
            int r2 = java.lang.Integer.parseInt(r2)
            int r0 = r0 + r2
            return r0
    }

    private void b(android.content.Context r3, int r4, int r5, java.lang.String r6) {
            r2 = this;
            java.lang.String r0 = "cn.jpush.android.intent.CONNECTION"
            java.lang.String r1 = "cn.jpush.android.intent.REGISTRATION"
            if (r4 != 0) goto L15
            if (r5 != 0) goto L15
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L13
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = "cn.jpush.android.REGISTRATION_ID"
            r4.putExtra(r5, r6)     // Catch: java.lang.Throwable -> L13
            goto L30
        L13:
            r3 = move-exception
            goto L40
        L15:
            r5 = 1
            r6 = -1
            if (r4 == r6) goto L1e
            if (r4 != r5) goto L1c
            goto L1e
        L1c:
            r4 = 0
            goto L30
        L1e:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L13
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "cn.jpush.android.CONNECTION_CHANGE"
            if (r4 != r6) goto L2c
            r4 = 0
            r1.putExtra(r0, r4)     // Catch: java.lang.Throwable -> L13
            goto L2f
        L2c:
            r1.putExtra(r0, r5)     // Catch: java.lang.Throwable -> L13
        L2f:
            r4 = r1
        L30:
            if (r4 == 0) goto L3f
            java.lang.String r5 = r3.getPackageName()     // Catch: java.lang.Throwable -> L13
            r4.addCategory(r5)     // Catch: java.lang.Throwable -> L13
            r4.setPackage(r5)     // Catch: java.lang.Throwable -> L13
            cn.jiguang.av.a.a(r3, r4)     // Catch: java.lang.Throwable -> L13
        L3f:
            return
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sendToOldPushUser failed:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DispatchActionManager"
            cn.jiguang.w.f.i(r4, r3)
            return
    }

    public java.lang.Object a(android.content.Context r4, java.lang.String r5, int r6) {
            r3 = this;
            int r0 = cn.jiguang.internal.JConstants.SDK_VERSION_INT
            r1 = 284(0x11c, float:3.98E-43)
            r2 = 0
            if (r0 > r1) goto L8
            return r2
        L8:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.lang.Object r0 = r0.get(r5)
            cn.jiguang.api.JDispatchAction r0 = (cn.jiguang.api.JDispatchAction) r0
            java.lang.String r1 = "DispatchActionManager"
            if (r0 == 0) goto L3b
            java.lang.Object r4 = r0.getDataByCmd(r4, r6)
            if (r4 == 0) goto L1b
            return r4
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " sdk action data:"
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = ", actionType: "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
        L37:
            cn.jiguang.w.f.a(r1, r4)
            goto L4d
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = " sdk action is null"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L37
        L4d:
            return r2
    }

    public org.json.JSONArray a(android.content.Context r7) {
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = cn.jiguang.l.a.d()
            int r2 = cn.jiguang.l.a.e()
            r3 = 1
            int r1 = cn.jiguang.l.a.C0044a.a(r3, r1, r2)
            r0.put(r1)
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT
            r2 = 284(0x11c, float:3.98E-43)
            if (r1 > r2) goto L1c
            goto L72
        L1c:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.api.JDispatchAction r2 = (cn.jiguang.api.JDispatchAction) r2     // Catch: java.lang.Throwable -> L70
            r3 = 30003(0x7533, float:4.2043E-41)
            java.lang.Object r3 = r2.getDataByCmd(r7, r3)     // Catch: java.lang.Throwable -> L70
            boolean r4 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L26
            r4 = 30004(0x7534, float:4.2045E-41)
            java.lang.Object r4 = r2.getDataByCmd(r7, r4)     // Catch: java.lang.Throwable -> L70
            r5 = 30005(0x7535, float:4.2046E-41)
            java.lang.Object r2 = r2.getDataByCmd(r7, r5)     // Catch: java.lang.Throwable -> L70
            boolean r5 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L26
            boolean r5 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L26
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L70
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L70
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L70
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L70
            int r2 = cn.jiguang.l.a.C0044a.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L70
            r0.put(r2)     // Catch: java.lang.Throwable -> L70
            goto L26
        L70:
            goto L26
        L72:
            return r0
    }

    public void a(android.content.Context r10, int r11, int r12, java.lang.String r13) {
            r9 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            if (r3 == 0) goto L2e
            java.lang.Object r1 = r1.getKey()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r4 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.onEvent(r4, r5, r6, r7, r8)
            goto L32
        L2e:
            r4 = r10
            r6 = r11
            r7 = r12
            r8 = r13
        L32:
            r10 = r4
            r11 = r6
            r12 = r7
            r13 = r8
            goto La
        L37:
            r4 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r9.b(r4, r6, r7, r8)
            return
    }

    public void a(android.content.Context r23, cn.jiguang.af.c r24, java.nio.ByteBuffer r25) {
            r22 = this;
            r0 = r24
            java.lang.String r1 = "DispatchActionManager"
            if (r0 != 0) goto Lc
            java.lang.String r0 = "Action - dispatchMessage unexcepted - head was null"
            cn.jiguang.w.f.i(r1, r0)
            return
        Lc:
            cn.jiguang.ad.i r2 = cn.jiguang.ad.i.a()
            long r3 = r0.f434e
            cn.jiguang.ad.d r2 = r2.a(r3)
            if (r2 == 0) goto L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "dispacth msg with reuqest :"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.c(r1, r3)
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            java.lang.String r3 = r2.f379c
            java.lang.Object r1 = r1.get(r3)
            r3 = r1
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            if (r3 == 0) goto L4a
            java.lang.String r5 = r2.f379c
            int r6 = r0.f432c
            int r7 = r0.f431b
            long r8 = r0.f434e
            long r10 = r2.f378b
            r4 = r23
            r12 = r25
            r3.dispatchMessage(r4, r5, r6, r7, r8, r10, r12)
        L4a:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "rid"
            long r3 = r0.f434e
            r1.putLong(r2, r3)
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            java.lang.String r2 = "tcp_a7"
            r13 = r23
            r0.a(r13, r2, r1)
            return
        L62:
            r13 = r23
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            r12 = r3
            cn.jiguang.api.JDispatchAction r12 = (cn.jiguang.api.JDispatchAction) r12
            if (r12 == 0) goto La9
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r0.f432c
            boolean r3 = r12.isSupportedCMD(r3, r4)
            if (r3 == 0) goto La9
            java.lang.Object r2 = r2.getKey()
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            int r15 = r0.f432c
            int r2 = r0.f431b
            long r3 = r0.f434e
            r19 = -1
            r21 = r25
            r16 = r2
            r17 = r3
            r12.dispatchMessage(r13, r14, r15, r16, r17, r19, r21)
        La9:
            r13 = r23
            goto L6e
        Lac:
            return
    }

    public void a(android.content.Context r9, java.lang.String r10, long r11, int r13) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r1 = "DispatchActionManager"
            if (r0 != 0) goto L35
            java.lang.String r0 = "JCore"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L35
            r10 = 26
            if (r13 == r10) goto L2d
            r10 = 41
            if (r13 == r10) goto L19
            return
        L19:
            java.lang.String r10 = "setCountry time out"
            cn.jiguang.w.f.d(r1, r10)
            cn.jiguang.ad.g r10 = cn.jiguang.ad.g.a()
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r12 = "tcp_a25"
            r10.a(r9, r12, r11)
            return
        L2d:
            cn.jiguang.ad.j r10 = cn.jiguang.ad.j.a()
            r10.b(r9, r11)
            return
        L35:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.lang.Object r0 = r0.get(r10)
            r2 = r0
            cn.jiguang.api.JDispatchAction r2 = (cn.jiguang.api.JDispatchAction) r2
            if (r2 == 0) goto L48
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            r2.dispatchTimeOutMessage(r3, r4, r5, r7)
            return
        L48:
            r4 = r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "not found dispatch action by sdktype:"
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.i(r1, r9)
            return
    }

    public void a(android.content.Context r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            java.lang.String r0 = "DispatchActionManager"
            if (r6 != 0) goto La
            java.lang.String r4 = "run action bundle is null"
            cn.jiguang.w.f.j(r0, r4)
            return
        La:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L16
            java.lang.String r4 = "run action sdktype is empty"
            cn.jiguang.w.f.j(r0, r4)
            return
        L16:
            java.lang.String r1 = "JCore"
            boolean r2 = r1.contains(r5)
            if (r2 == 0) goto L1f
            r5 = r1
        L1f:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            java.lang.Object r1 = r1.get(r5)
            cn.jiguang.api.JDispatchAction r1 = (cn.jiguang.api.JDispatchAction) r1
            if (r1 != 0) goto L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "dispacth action is null by sdktype:"
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.j(r0, r4)
            return
        L3e:
            java.lang.String r0 = "internal_action"
            java.lang.String r0 = r6.getString(r0)
            r1.onActionRun(r4, r5, r0, r6)
            return
    }

    public void a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addAction type:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ",action:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DispatchActionManager"
            cn.jiguang.w.f.c(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L87
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L82
            java.lang.Class r0 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r0 instanceof cn.jiguang.api.JDispatchAction     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L5f
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r2 = cn.jiguang.ad.b.a     // Catch: java.lang.Throwable -> L5d
            r3 = r0
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3     // Catch: java.lang.Throwable -> L5d
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "action init:"
            r5.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5d
            r5.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.w.f.c(r1, r5)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r5 = move-exception
            goto L65
        L5f:
            java.lang.String r5 = "this action is not a JDispatchAction,please check and extends JDispatchAction"
            cn.jiguang.w.f.i(r1, r5)     // Catch: java.lang.Throwable -> L5d
            return
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#unexcepted - instance "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = " class failed:"
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cn.jiguang.w.f.j(r1, r5)
            return
        L82:
            java.lang.String r5 = "has same type action"
            cn.jiguang.w.f.c(r1, r5)
        L87:
            return
    }

    public boolean a(int r7) {
            r6 = this;
            java.lang.String r0 = "DispatchActionManager"
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            if (r3 == 0) goto Lc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r4.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "isAllowAction actionType:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L62
            r4.append(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = ",sdktype:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r2.getKey()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L62
            r4.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = ",action:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r2.getKey()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L62
            boolean r5 = r3.checkAction(r5, r7)     // Catch: java.lang.Throwable -> L62
            r4.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L62
            cn.jiguang.w.f.d(r0, r4)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L62
            boolean r2 = r3.checkAction(r2, r7)     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto Lc
            r7 = 0
            return r7
        L62:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isAllowAction error:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r0, r2)
            goto Lc
        L7c:
            r7 = 1
            return r7
    }

    public boolean a(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    public byte b(android.content.Context r6) {
            r5 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            cn.jiguang.api.JDispatchAction r2 = (cn.jiguang.api.JDispatchAction) r2
            if (r2 == 0) goto La
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3 = 28
            java.lang.String r4 = "platformtype"
            java.lang.Object r1 = r2.beforLogin(r6, r1, r3, r4)
            boolean r2 = r1 instanceof java.lang.Byte
            if (r2 == 0) goto La
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r6 = r1.byteValue()
            return r6
        L37:
            r6 = 0
            return r6
    }

    public java.lang.String b(int r5) {
            r4 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            cn.jiguang.api.JDispatchAction r2 = (cn.jiguang.api.JDispatchAction) r2
            if (r2 == 0) goto La
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            short r3 = r2.getRegPriority(r3)
            if (r3 != r5) goto La
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r2.getSdkVersion(r5)
            return r5
        L35:
            java.lang.String r5 = ""
            return r5
    }

    public java.lang.String b(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.lang.Object r0 = r0.get(r4)
            cn.jiguang.api.JDispatchAction r0 = (cn.jiguang.api.JDispatchAction) r0
            java.lang.String r1 = "DispatchActionManager"
            if (r0 == 0) goto L2f
            java.lang.String r0 = r0.getSdkVersion(r4)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L17
            return r0
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " sdk action sdkversion:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
        L2b:
            cn.jiguang.w.f.a(r1, r4)
            return r5
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " sdk action is null"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L2b
    }

    public short b() {
            r4 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            if (r3 == 0) goto Lb
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            short r2 = r3.getRegFlag(r2)
            if (r2 == 0) goto Lb
            r1 = r1 | r2
            short r1 = (short) r1
            goto Lb
        L2e:
            return r1
    }

    public java.lang.String c(android.content.Context r6) {
            r5 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            cn.jiguang.api.JDispatchAction r2 = (cn.jiguang.api.JDispatchAction) r2
            if (r2 == 0) goto La
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3 = 28
            java.lang.String r4 = "platformregid"
            java.lang.Object r1 = r2.beforLogin(r6, r1, r3, r4)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto La
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L33:
            java.lang.String r6 = ""
            return r6
    }

    public short c() {
            r4 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            if (r3 == 0) goto Lb
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            short r2 = r3.getLoginFlag(r2)
            if (r2 == 0) goto Lb
            r1 = r1 | r2
            short r1 = (short) r1
            goto Lb
        L2e:
            return r1
    }

    public java.util.Map<java.lang.Integer, android.os.Bundle> d() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r2 = r3.getPInfo(r2)
            if (r2 == 0) goto Lf
            java.lang.String r3 = "pid"
            r4 = 0
            int r3 = r2.getInt(r3, r4)
            if (r3 <= 0) goto Lf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r2)
            goto Lf
        L3e:
            return r0
    }

    public java.lang.String e() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 3
            r3 = 3
        L11:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            cn.jiguang.api.JDispatchAction r5 = (cn.jiguang.api.JDispatchAction) r5
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            short r4 = r5.getRegPriority(r4)
            if (r3 >= r4) goto L11
            r3 = r4
            goto L11
        L31:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "max reg priority: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "DispatchActionManager"
            cn.jiguang.w.f.c(r4, r1)
            r1 = 0
        L48:
            if (r1 > r3) goto L8e
            java.lang.String r4 = "|"
            if (r1 != r2) goto L58
            java.lang.String r5 = cn.jiguang.a.a.f236c
        L51:
            r0.append(r5)
            r0.append(r4)
            goto L8b
        L58:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r5 = cn.jiguang.ad.b.a
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            cn.jiguang.api.JDispatchAction r7 = (cn.jiguang.api.JDispatchAction) r7
            java.lang.Object r8 = r6.getKey()
            java.lang.String r8 = (java.lang.String) r8
            short r8 = r7.getRegPriority(r8)
            if (r8 != r1) goto L62
            java.lang.Object r5 = r6.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r7.getSdkVersion(r5)
            goto L51
        L8b:
            int r1 = r1 + 1
            goto L48
        L8e:
            int r1 = r0.length()
            if (r1 <= 0) goto L9d
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
        L9d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String f() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jiguang.a.a.f236c
            int r1 = b(r1)
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r2 = cn.jiguang.ad.b.a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L1f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            cn.jiguang.api.JDispatchAction r5 = (cn.jiguang.api.JDispatchAction) r5
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            short r4 = r5.getLogPriority(r4)
            int r3 = java.lang.Math.max(r3, r4)
            short r3 = (short) r3
            goto L1f
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "max login priority: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "DispatchActionManager"
            cn.jiguang.w.f.c(r4, r2)
            r2 = 1
            r4 = 1
        L59:
            if (r4 > r3) goto L9a
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r5 = cn.jiguang.ad.b.a
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L65:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            cn.jiguang.api.JDispatchAction r7 = (cn.jiguang.api.JDispatchAction) r7
            java.lang.Object r8 = r6.getKey()
            java.lang.String r8 = (java.lang.String) r8
            short r8 = r7.getLogPriority(r8)
            if (r8 != r4) goto L65
            java.lang.Object r5 = r6.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r7.getSdkVersion(r5)
            int r5 = b(r5)
            r0.append(r5)
            r0.append(r1)
        L97:
            int r4 = r4 + 1
            goto L59
        L9a:
            int r1 = r0.length()
            if (r1 <= 0) goto La8
            int r1 = r0.length()
            int r1 = r1 - r2
            r0.setLength(r1)
        La8:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
