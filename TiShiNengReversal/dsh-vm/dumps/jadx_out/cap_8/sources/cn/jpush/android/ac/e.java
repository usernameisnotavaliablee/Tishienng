package cn.jpush.android.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static java.lang.String a = "exception_type";

    /* renamed from: c, reason: collision with root package name */
    private static java.util.Map<java.lang.String, java.lang.Byte> f1638c;

    /* renamed from: d, reason: collision with root package name */
    private static java.util.Map<java.lang.String, android.os.Bundle> f1639d;

    /* renamed from: e, reason: collision with root package name */
    private static java.util.Map<cn.jpush.android.api.JThirdPlatFormInterface, java.lang.Long> f1640e;

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.Object f1641h = null;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> f1642b;

    /* renamed from: f, reason: collision with root package name */
    private android.os.Bundle f1643f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1644g;

    /* renamed from: i, reason: collision with root package name */
    private long f1645i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1646j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f1647k;
    private java.lang.Boolean l;
    private java.lang.Boolean m;
    private java.lang.Boolean n;









    private static final class a {
        private static final cn.jpush.android.ac.e a = null;

        static {
                cn.jpush.android.ac.e r0 = new cn.jpush.android.ac.e
                r1 = 0
                r0.<init>(r1)
                cn.jpush.android.ac.e.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jpush.android.ac.e a() {
                cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a.a
                return r0
        }
    }

    class b {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        int f1659b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f1660c;

        /* renamed from: d, reason: collision with root package name */
        byte f1661d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ cn.jpush.android.ac.e f1662e;

        b(cn.jpush.android.ac.e r1) {
                r0 = this;
                r0.f1662e = r1
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ThirdMessage{msgid='"
                r0.append(r1)
                java.lang.String r1 = r3.a
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", notiId="
                r0.append(r2)
                int r2 = r3.f1659b
                r0.append(r2)
                java.lang.String r2 = ", content='"
                r0.append(r2)
                java.lang.String r2 = r3.f1660c
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", platform="
                r0.append(r1)
                byte r1 = r3.f1661d
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.ac.e.f1638c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.ac.e.f1639d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.ac.e.f1640e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.ac.e.f1641h = r0
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 3
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thirdpush.meizu.MeizuPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thirdpush.xiaomi.XMPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thirdpush.huawei.HWPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thirdpush.fcm.FCMPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 4
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thridpush.oppo.OPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 5
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thirdpush.vivo.VivoPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 7
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thirdpush.honor.HonorPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            r1 = 16
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.thirdpush.nio.NioPushManager"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            java.lang.Class<cn.jpush.android.asus.b> r1 = cn.jpush.android.asus.b.class
            java.lang.String r1 = r1.getName()
            r2 = 6
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    private e() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1644g = r0
            r0 = 50
            r2.f1645i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1642b = r0
            return
    }

    /* synthetic */ e(cn.jpush.android.ac.e.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private cn.jpush.android.ac.e.b a(android.os.Bundle r4) {
            r3 = this;
            if (r4 == 0) goto L2e
            cn.jpush.android.ac.e$b r0 = new cn.jpush.android.ac.e$b
            r0.<init>(r3)
            java.lang.String r1 = "data"
            java.lang.String r1 = r4.getString(r1)
            r0.f1660c = r1
            java.lang.String r1 = "msg_id"
            java.lang.String r1 = r4.getString(r1)
            r0.a = r1
            java.lang.String r1 = "noti_id"
            r2 = 0
            int r1 = r4.getInt(r1, r2)
            r0.f1659b = r1
            java.lang.String r1 = "platform"
            r2 = -1
            java.lang.Byte r4 = r4.getByte(r1, r2)
            byte r4 = r4.byteValue()
            r0.f1661d = r4
            goto L2f
        L2e:
            r0 = 0
        L2f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "parse third messgae:"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r1, r4)
            return r0
    }

    static /* synthetic */ cn.jpush.android.ac.e.b a(cn.jpush.android.ac.e r0, android.os.Bundle r1) {
            cn.jpush.android.ac.e$b r0 = r0.a(r1)
            return r0
    }

    public static cn.jpush.android.ac.e a() {
            cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a.a()
            return r0
    }

    public static java.lang.String a(java.lang.String r5) {
            java.lang.String r0 = "ThirdPushManager"
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3d
            r1[r4] = r5     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "get"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.invoke(r3, r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "get "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d
            r2.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = " version is:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d
            r2.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3d
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L3d
            return r1
        L3d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " get "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "wrong error:"
            r2.append(r5)
            java.lang.String r5 = r1.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jpush.android.helper.Logger.e(r0, r5)
            java.lang.String r5 = ""
            return r5
    }

    private void a(android.content.Context r3, byte r4, java.lang.String r5, boolean r6) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sendUpdateRegIDRequest, WhichPlatform:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ",regID:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.ac.c r0 = cn.jpush.android.ac.c.a()
            r0.a(r3, r4, r5, r6)
            return
    }

    private void a(android.content.Context r7, cn.jpush.android.api.JThirdPlatFormInterface r8) {
            r6 = this;
            if (r8 != 0) goto L4
            goto L96
        L4:
            java.util.Map<cn.jpush.android.api.JThirdPlatFormInterface, java.lang.Long> r0 = cn.jpush.android.ac.e.f1640e     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.containsKey(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "ThirdPushManager"
            if (r0 == 0) goto L76
            java.util.Map<cn.jpush.android.api.JThirdPlatFormInterface, java.lang.Long> r0 = cn.jpush.android.ac.e.f1640e     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L96
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L96
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L96
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L96
            long r4 = r6.f1645i     // Catch: java.lang.Throwable -> L96
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "start register > "
            r0.append(r2)     // Catch: java.lang.Throwable -> L96
            long r2 = r6.f1645i     // Catch: java.lang.Throwable -> L96
            r0.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = " mills. platImpl="
            r0.append(r2)     // Catch: java.lang.Throwable -> L96
            r0.append(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L96
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L96
            android.os.Bundle r0 = r6.f1643f     // Catch: java.lang.Throwable -> L96
            r8.register(r7, r0)     // Catch: java.lang.Throwable -> L96
            java.util.Map<cn.jpush.android.api.JThirdPlatFormInterface, java.lang.Long> r7 = cn.jpush.android.ac.e.f1640e     // Catch: java.lang.Throwable -> L96
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L96
        L52:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L96
            r7.put(r8, r0)     // Catch: java.lang.Throwable -> L96
            return
        L5a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r7.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r8 = "is registering,no need to register again < "
            r7.append(r8)     // Catch: java.lang.Throwable -> L96
            long r2 = r6.f1645i     // Catch: java.lang.Throwable -> L96
            r7.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r8 = " mills"
            r7.append(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L96
            cn.jpush.android.helper.Logger.d(r1, r7)     // Catch: java.lang.Throwable -> L96
            return
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "start register platImpl="
            r0.append(r2)     // Catch: java.lang.Throwable -> L96
            r0.append(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L96
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L96
            android.os.Bundle r0 = r6.f1643f     // Catch: java.lang.Throwable -> L96
            r8.register(r7, r0)     // Catch: java.lang.Throwable -> L96
            java.util.Map<cn.jpush.android.api.JThirdPlatFormInterface, java.lang.Long> r7 = cn.jpush.android.ac.e.f1640e     // Catch: java.lang.Throwable -> L96
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L96
            goto L52
        L96:
            return
    }

    private void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r2 = this;
            cn.jpush.android.data.JPushConfigEx r0 = new cn.jpush.android.data.JPushConfigEx
            r0.<init>()
            r0.setjAppKey(r4)
            byte r4 = r2.e(r3)
            r1 = 1
            if (r4 == r1) goto L3f
            r1 = 2
            if (r4 == r1) goto L3b
            r1 = 3
            if (r4 == r1) goto L34
            r1 = 4
            if (r4 == r1) goto L2a
            r7 = 5
            if (r4 == r7) goto L23
            r5 = 7
            if (r4 == r5) goto L1f
            goto L45
        L1f:
            r0.setHonorAppId(r6)
            goto L45
        L23:
            r0.setVivoAppKey(r5)
            r0.setVivoAppId(r6)
            goto L45
        L2a:
            r0.setOppoAppKey(r5)
            r0.setOppoAppId(r6)
            r0.setOppoAppSecret(r7)
            goto L45
        L34:
            r0.setMzAppKey(r5)
            r0.setMzAppId(r6)
            goto L45
        L3b:
            r0.setHwAppId(r6)
            goto L45
        L3f:
            r0.setXmAppKey(r5)
            r0.setXmAppId(r6)
        L45:
            cn.jpush.android.api.JPushInterface.init(r3, r0)
            return
    }

    private void a(android.content.Context r5, java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r6) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L2d
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2d
            r2 = 0
        Lc:
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L2d
            if (r2 >= r3) goto L21
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Throwable -> L2d
            cn.jpush.android.api.JThirdPlatFormInterface r3 = (cn.jpush.android.api.JThirdPlatFormInterface) r3     // Catch: java.lang.Throwable -> L2d
            byte r3 = r3.getRomType(r5)     // Catch: java.lang.Throwable -> L2d
            r1[r2] = r3     // Catch: java.lang.Throwable -> L2d
            int r2 = r2 + 1
            goto Lc
        L21:
            java.lang.String r6 = "platform"
            r0.putByteArray(r6, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "JPUSH"
            java.lang.String r1 = "synce_platform"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r5, r6, r1, r0)     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    static /* synthetic */ void a(cn.jpush.android.ac.e r0, android.content.Context r1, android.os.Bundle r2) {
            r0.d(r1, r2)
            return
    }

    static /* synthetic */ void a(cn.jpush.android.ac.e r0, android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ boolean a(cn.jpush.android.ac.e r0) {
            boolean r0 = r0.f1644g
            return r0
    }

    private boolean a(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L1e
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L1e
            java.lang.String r2 = r2.getMessage()
            java.lang.String r0 = "Please check"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1e
            boolean r2 = cn.jiguang.api.JCoreManager.getDebugMode()
            if (r2 == 0) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    static /* synthetic */ java.util.Map b() {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = cn.jpush.android.ac.e.f1639d
            return r0
    }

    private boolean c() {
            r1 = this;
            java.lang.Boolean r0 = r1.n
            if (r0 != 0) goto Le
            boolean r0 = r1.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.n = r0
        Le:
            java.lang.Boolean r0 = r1.n
            boolean r0 = r0.booleanValue()
            return r0
    }

    private void d(android.content.Context r3, android.os.Bundle r4) {
            r2 = this;
            boolean r0 = cn.jpush.android.m.a.a()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L7
            goto L26
        L7:
            if (r3 != 0) goto Lb
            android.content.Context r3 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L26
        Lb:
            if (r3 != 0) goto L15
            java.lang.String r3 = "ThirdPushManager"
            java.lang.String r4 = "context was null"
            cn.jpush.android.helper.Logger.e(r3, r4)     // Catch: java.lang.Throwable -> L26
            return
        L15:
            r2.a(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = cn.jpush.android.ac.e.a     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "1"
            r4.putString(r0, r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = "send_exception_stats"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L26
        L26:
            return
    }

    private void d(android.content.Context r9, java.lang.String r10, android.os.Bundle r11) {
            r8 = this;
            java.lang.String r1 = "ThirdPushManager"
            cn.jpush.android.ac.e$6 r2 = new cn.jpush.android.ac.e$6     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "ThirdPushManager#doAction"
            r3 = r8
            r7 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L11
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r7, r1, r2)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "doAction failed:"
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.helper.Logger.ww(r1, r9)
            return
    }

    private boolean d() {
            r3 = this;
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isEmotionOs name:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.kd(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3d
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "magicui"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L36
            java.lang.String r1 = "magicos"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L3d
        L36:
            java.lang.String r0 = "isEmotionOs true"
            cn.jpush.android.helper.Logger.kd(r2, r0)
            r0 = 1
            return r0
        L3d:
            r0 = 0
            return r0
    }

    private void e(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.e(r2, r3, r0)
            return
    }

    private void e(android.content.Context r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            java.lang.String r0 = "ThirdPushManager"
            boolean r1 = cn.jpush.android.ad.a.c(r4)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "process is main, do dealMessage action="
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            r1.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = " bundle="
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            r1.append(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L28
            r3.c(r4, r5, r6)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r4 = move-exception
            goto L69
        L2a:
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r4)     // Catch: java.lang.Throwable -> L28
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L68
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L28
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L28
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L28
            r2.setAction(r5)     // Catch: java.lang.Throwable -> L28
            if (r6 != 0) goto L47
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> L28
            r6.<init>()     // Catch: java.lang.Throwable -> L28
        L47:
            r2.putExtras(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r4.getPackageName()     // Catch: java.lang.Throwable -> L28
            r2.setPackage(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r6.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "send intent="
            r6.append(r1)     // Catch: java.lang.Throwable -> L28
            r6.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L28
            cn.jpush.android.helper.Logger.ww(r0, r6)     // Catch: java.lang.Throwable -> L28
            cn.jpush.android.helper.a.a(r4, r2)     // Catch: java.lang.Throwable -> L28
        L68:
            return
        L69:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "send "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = " failed:"
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            cn.jpush.android.helper.Logger.ww(r0, r4)
            return
    }

    private static boolean e() {
            java.lang.String r0 = "com.google.firebase.messaging.FirebaseMessaging"
            java.lang.Class.forName(r0)
            r0 = 1
            return r0
    }

    private boolean f(android.content.Context r7) {
            r6 = this;
            java.lang.String r0 = "[loadThirdPush]"
            java.lang.String r1 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = cn.jpush.android.helper.JCoreHelper.isAuth(r7)
            r2 = 0
            if (r0 != 0) goto L15
            java.lang.String r7 = "user don't auth, so return init"
            cn.jpush.android.helper.Logger.w(r1, r7)
            return r2
        L15:
            java.util.Map<java.lang.String, java.lang.Byte> r0 = cn.jpush.android.ac.e.f1638c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L47
            java.lang.Byte r4 = (java.lang.Byte) r4     // Catch: java.lang.Throwable -> L47
            byte r4 = r4.byteValue()     // Catch: java.lang.Throwable -> L47
            r5 = 6
            if (r4 != r5) goto L49
            cn.jpush.android.local.ActionHelper r4 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L47
            java.lang.Class r4 = r4.getClassInPlugin(r5)     // Catch: java.lang.Throwable -> L47
            goto L4a
        L47:
            r3 = move-exception
            goto L7d
        L49:
            r4 = 0
        L4a:
            if (r4 != 0) goto L5a
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L47
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch: java.lang.Throwable -> L47
            java.lang.Class r4 = java.lang.Class.forName(r3, r2, r4)     // Catch: java.lang.Throwable -> L47
        L5a:
            if (r4 == 0) goto L1f
            java.lang.Object r3 = r4.newInstance()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L1f
            boolean r4 = r3 instanceof cn.jpush.android.api.JThirdPlatFormInterface     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L1f
            r4 = r3
            cn.jpush.android.api.JThirdPlatFormInterface r4 = (cn.jpush.android.api.JThirdPlatFormInterface) r4     // Catch: java.lang.Throwable -> L47
            r4.init(r7)     // Catch: java.lang.Throwable -> L47
            r4 = r3
            cn.jpush.android.api.JThirdPlatFormInterface r4 = (cn.jpush.android.api.JThirdPlatFormInterface) r4     // Catch: java.lang.Throwable -> L47
            boolean r4 = r4.isSupport(r7)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L1f
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r4 = r6.f1642b     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.api.JThirdPlatFormInterface r3 = (cn.jpush.android.api.JThirdPlatFormInterface) r3     // Catch: java.lang.Throwable -> L47
            r4.add(r3)     // Catch: java.lang.Throwable -> L47
            goto L1f
        L7d:
            boolean r4 = r6.a(r3)
            if (r4 == 0) goto La1
            int r4 = cn.jpush.android.m.a.f1834c
            r5 = 238(0xee, float:3.34E-43)
            if (r4 < r5) goto L94
            cn.jpush.android.ac.e$1 r4 = new cn.jpush.android.ac.e$1
            java.lang.String r5 = "ThirdPushManager#loadThirdPush"
            r4.<init>(r6, r5, r3)
            cn.jpush.android.helper.JCoreHelper.futureExecutor(r7, r4)
            goto La1
        L94:
            java.lang.Thread r4 = new java.lang.Thread
            cn.jpush.android.ac.e$2 r5 = new cn.jpush.android.ac.e$2
            r5.<init>(r6, r3)
            r4.<init>(r5)
            r4.start()
        La1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadThirdPush error:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.w(r1, r3)
            goto L1f
        Lbb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto Lcc
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r0 = r6.f1642b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lcc
            cn.jpush.android.x.a.a(r7)
        Lcc:
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r0 = r6.f1642b
            r6.a(r7, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "third init success, add "
            r7.append(r0)
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r0 = r6.f1642b
            int r0 = r0.size()
            r7.append(r0)
            java.lang.String r0 = " third push channel"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            cn.jpush.android.helper.Logger.d(r1, r7)
            r7 = 1
            return r7
    }

    private static boolean f(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L14
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L14
            r2 = 128(0x80, float:1.8E-43)
            r0.getServiceInfo(r1, r2)     // Catch: java.lang.Throwable -> L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    private byte[] g(android.content.Context r2) {
            r1 = this;
            byte[] r0 = r1.f1647k
            if (r0 == 0) goto L7
            int r0 = r0.length
            if (r0 != 0) goto Ld
        L7:
            byte[] r2 = r1.h(r2)
            r1.f1647k = r2
        Ld:
            byte[] r2 = r1.f1647k
            return r2
    }

    private byte[] h(android.content.Context r5) {
            r4 = this;
            byte r0 = r4.e(r5)     // Catch: java.lang.Throwable -> L24
            boolean r5 = r4.k(r5)     // Catch: java.lang.Throwable -> L24
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L1d
            r5 = 8
            if (r0 == 0) goto L18
            r3 = 2
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L24
            r3[r2] = r5     // Catch: java.lang.Throwable -> L24
            r3[r1] = r0     // Catch: java.lang.Throwable -> L24
            return r3
        L18:
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L24
            r0[r2] = r5     // Catch: java.lang.Throwable -> L24
            return r0
        L1d:
            if (r0 == 0) goto L24
            byte[] r5 = new byte[r1]     // Catch: java.lang.Throwable -> L24
            r5[r2] = r0     // Catch: java.lang.Throwable -> L24
            return r5
        L24:
            r5 = 0
            return r5
    }

    private boolean i(android.content.Context r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.l
            if (r0 != 0) goto Le
            boolean r2 = r1.j(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.l = r2
        Le:
            java.lang.Boolean r2 = r1.l
            boolean r2 = r2.booleanValue()
            return r2
    }

    private boolean j(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = "ThirdPushManager"
            r1 = 0
            java.lang.String r2 = "com.hihonor.push.sdk.HonorPushClient"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "getInstance"
            r4 = 0
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r3.invoke(r4, r4)     // Catch: java.lang.Throwable -> L44
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L44
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r1] = r6     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "checkSupportHonorPush"
            java.lang.reflect.Method r2 = r2.getMethod(r6, r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L44
            r4[r1] = r8     // Catch: java.lang.Throwable -> L44
            java.lang.Object r8 = r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L44
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "isSupportHonorPush ="
            r2.append(r3)     // Catch: java.lang.Throwable -> L44
            r2.append(r8)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L44
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L44
            return r8
        L44:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " isSupportHonorPush error:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            cn.jpush.android.helper.Logger.e(r0, r8)
            return r1
    }

    private boolean k(android.content.Context r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.m
            if (r0 != 0) goto Le
            boolean r2 = r1.l(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.m = r2
        Le:
            java.lang.Boolean r2 = r1.m
            boolean r2 = r2.booleanValue()
            return r2
    }

    private boolean l(android.content.Context r9) {
            r8 = this;
            r0 = 0
            java.lang.String r1 = "cn.jpush.android.service.PluginFCMMessagingService"
            boolean r1 = f(r9, r1)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L3e
            boolean r1 = e()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "com.google.android.gms.common.GoogleApiAvailabilityLight"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "getInstance"
            r4 = 0
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.invoke(r4, r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "isGooglePlayServicesAvailable"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r2.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L3e
            r4[r0] = r9     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r9 = r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L3e
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L3e
            if (r9 != 0) goto L3e
            return r5
        L3e:
            return r0
    }

    public synchronized void a(android.content.Context r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f1644g     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return
        L7:
            if (r7 != 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            java.lang.String r0 = "ThirdPushManager"
            java.lang.String r1 = "initOnMainProcess"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "cn.jpush.android.dy.JPushThirdDyManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "loadByJPush"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2e
            r1[r5] = r7     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L2e
        L2e:
            boolean r7 = r6.f(r7)     // Catch: java.lang.Throwable -> L36
            r6.f1644g = r7     // Catch: java.lang.Throwable -> L36
            monitor-exit(r6)
            return
        L36:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L36
            throw r7
    }

    public void a(android.content.Context r6, byte r7) {
            r5 = this;
            byte[] r6 = r5.g(r6)     // Catch: java.lang.Throwable -> L2e
            r5.f1647k = r6     // Catch: java.lang.Throwable -> L2e
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L11
            byte[] r6 = new byte[r0]     // Catch: java.lang.Throwable -> L2e
            r5.f1647k = r6     // Catch: java.lang.Throwable -> L2e
            r6[r1] = r7     // Catch: java.lang.Throwable -> L2e
            return
        L11:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L2e
            r3 = 0
        L13:
            if (r3 >= r2) goto L1d
            r4 = r6[r3]     // Catch: java.lang.Throwable -> L2e
            if (r4 != r7) goto L1a
            return
        L1a:
            int r3 = r3 + 1
            goto L13
        L1d:
            byte[] r6 = r5.f1647k     // Catch: java.lang.Throwable -> L2e
            int r2 = r6.length     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + r0
            byte[] r0 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            int r2 = r6.length     // Catch: java.lang.Throwable -> L2e
            java.lang.System.arraycopy(r6, r1, r0, r1, r2)     // Catch: java.lang.Throwable -> L2e
            byte[] r6 = r5.f1647k     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.length     // Catch: java.lang.Throwable -> L2e
            r0[r6] = r7     // Catch: java.lang.Throwable -> L2e
            r5.f1647k = r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    public void a(android.content.Context r4, byte r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "uploadRegIdOnMainProcess"
            java.lang.String r1 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = cn.jpush.android.m.a.a()
            if (r0 != 0) goto Le
            return
        Le:
            if (r4 != 0) goto L12
            android.content.Context r4 = cn.jpush.android.local.JPushConstants.mApplicationContext
        L12:
            if (r4 != 0) goto L1a
            java.lang.String r4 = "context was null"
            cn.jpush.android.helper.Logger.e(r1, r4)
            return
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "uploadRegID regid:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.ii(r1, r0)
            r3.a(r4)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "token"
            r0.putString(r1, r6)
            java.lang.String r6 = "platform"
            r0.putByte(r6, r5)
            java.lang.String r5 = "JPUSH"
            java.lang.String r6 = "third_push_upload_regid"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r4, r5, r6, r0)
            return
    }

    public void a(android.content.Context r2, int r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r4 = "ThirdPushManager"
            java.lang.String r0 = "clearNotificationOnMainProcess"
            cn.jpush.android.helper.Logger.d(r4, r0)
            boolean r4 = cn.jpush.android.m.a.a()
            if (r4 != 0) goto Le
            goto L27
        Le:
            r1.a(r2)
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r4 = r1.f1642b
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.next()
            cn.jpush.android.api.JThirdPlatFormInterface r0 = (cn.jpush.android.api.JThirdPlatFormInterface) r0
            r0.clearNotification(r2, r3)
            goto L17
        L27:
            return
    }

    public void a(android.content.Context r7, android.content.Intent r8) {
            r6 = this;
            if (r8 != 0) goto L4
            goto Lb4
        L4:
            java.lang.String r0 = r8.getAction()
            android.os.Bundle r1 = r8.getExtras()
            java.lang.String r2 = "cmd_msg"
            java.lang.String r2 = cn.jpush.android.ad.a.e(r7, r2)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lb5
            java.lang.String r2 = "code"
            r3 = -2
            int r2 = r8.getIntExtra(r2, r3)
            java.lang.String r4 = "cmd"
            int r3 = r8.getIntExtra(r4, r3)
            java.lang.String r4 = "message"
            java.lang.String r8 = r8.getStringExtra(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "registerOnMainProcess :"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ",cmd:"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ",message:"
            r4.append(r2)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            java.lang.String r2 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r2, r8)
            r8 = 1
            if (r3 != r8) goto Lb4
            boolean r3 = r6.f1646j
            if (r3 != 0) goto Lb4
            r6.f1646j = r8
            r6.a(r7, r1, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "start to send cache map="
            r8.append(r0)
            java.util.Map<java.lang.String, android.os.Bundle> r0 = cn.jpush.android.ac.e.f1639d
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            cn.jpush.android.helper.Logger.d(r2, r8)
            java.util.Map<java.lang.String, android.os.Bundle> r8 = cn.jpush.android.ac.e.f1639d
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L7d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6.d(r7, r1, r0)
            goto L7d
        L99:
            java.util.Map<java.lang.String, android.os.Bundle> r7 = cn.jpush.android.ac.e.f1639d
            r7.clear()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = " cache map send finish map="
            r7.append(r8)
            java.util.Map<java.lang.String, android.os.Bundle> r8 = cn.jpush.android.ac.e.f1639d
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.jpush.android.helper.Logger.d(r2, r7)
        Lb4:
            return
        Lb5:
            r6.c(r7, r0, r1)
            return
    }

    public void a(android.content.Context r3, android.os.Bundle r4) {
            r2 = this;
            java.lang.String r3 = "ThirdPushManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "syncPlatformsOnServiceProcess bundle="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e
            r0.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e
            cn.jpush.android.helper.Logger.i(r3, r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "platform"
            byte[] r3 = r4.getByteArray(r3)     // Catch: java.lang.Throwable -> L1e
            r2.f1647k = r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            return
    }

    public void a(android.content.Context r4, android.os.Bundle r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r6 = "registerOnMainProcess"
            java.lang.String r0 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r0, r6)
            boolean r6 = cn.jpush.android.m.a.a()
            if (r6 != 0) goto Lf
            goto L113
        Lf:
            boolean r6 = cn.jpush.android.helper.JCoreHelper.isAuth(r4)
            if (r6 != 0) goto L1b
            java.lang.String r4 = "register user don't auth, so return init"
            cn.jpush.android.helper.Logger.e(r0, r4)
            return
        L1b:
            r3.a(r4)
            android.content.Context r6 = r4.getApplicationContext()
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)
            boolean r6 = cn.jpush.android.cache.a.e(r6)
            if (r6 != 0) goto L114
            if (r5 == 0) goto Lae
            java.lang.String r6 = "config"
            java.io.Serializable r6 = r5.getSerializable(r6)     // Catch: java.lang.Throwable -> Lb0
            boolean r1 = r6 instanceof cn.jpush.android.data.JPushConfigEx     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L3b
            cn.jpush.android.data.JPushConfigEx r6 = (cn.jpush.android.data.JPushConfigEx) r6     // Catch: java.lang.Throwable -> Lb0
            goto L49
        L3b:
            boolean r1 = r6 instanceof cn.jpush.android.data.JPushConfig     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L48
            cn.jpush.android.data.JPushConfigEx r1 = new cn.jpush.android.data.JPushConfigEx     // Catch: java.lang.Throwable -> Lb0
            cn.jpush.android.data.JPushConfig r6 = (cn.jpush.android.data.JPushConfig) r6     // Catch: java.lang.Throwable -> Lb0
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lb0
            r6 = r1
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 == 0) goto Lae
            java.lang.String r1 = "MEIZU_APPID"
            java.lang.String r2 = r6.getMzAppId()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "MEIZU_APPKEY"
            java.lang.String r2 = r6.getMzAppKey()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "OPPO_APPKEY"
            java.lang.String r2 = r6.getOppoAppKey()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "OPPO_APPID"
            java.lang.String r2 = r6.getOppoAppId()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "OPPO_APPSECRET"
            java.lang.String r2 = r6.getOppoAppSecret()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "XIAOMI_APPID"
            java.lang.String r2 = r6.getXmAppId()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "XIAOMI_APPKEY"
            java.lang.String r2 = r6.getXmAppKey()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "VIVO_APPKEY"
            java.lang.String r2 = r6.getVivoAppKey()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "VIVO_APPID"
            java.lang.String r2 = r6.getVivoAppId()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "HW_APPID"
            java.lang.String r2 = r6.getHwAppId()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "HONOR_APPID"
            java.lang.String r6 = r6.getHonorAppId()     // Catch: java.lang.Throwable -> Lb0
            r5.putString(r1, r6)     // Catch: java.lang.Throwable -> Lb0
        Lae:
            r3.f1643f = r5     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r5 = r3.f1642b
            java.util.Iterator r5 = r5.iterator()
        Lb6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L113
            java.lang.Object r6 = r5.next()
            cn.jpush.android.api.JThirdPlatFormInterface r6 = (cn.jpush.android.api.JThirdPlatFormInterface) r6
            java.lang.String r1 = cn.jpush.android.ad.a.d(r4)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> Ld4
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch: java.lang.Throwable -> Ld4
            if (r1 == 0) goto Ld6
            r3.a(r4, r6)     // Catch: java.lang.Throwable -> Ld4
            goto Ld6
        Ld4:
            r6 = move-exception
            goto Le9
        Ld6:
            int r1 = cn.jpush.android.cache.a.u(r4)     // Catch: java.lang.Throwable -> Ld4
            r2 = 2
            if (r1 != r2) goto Lb6
            byte r1 = r6.getRomType(r4)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r6 = r6.getToken(r4)     // Catch: java.lang.Throwable -> Ld4
            r3.a(r4, r1, r6)     // Catch: java.lang.Throwable -> Ld4
            goto Lb6
        Le9:
            boolean r1 = r3.a(r6)
            if (r1 == 0) goto L10d
            int r1 = cn.jpush.android.m.a.f1834c
            r2 = 238(0xee, float:3.34E-43)
            if (r1 < r2) goto L100
            cn.jpush.android.ac.e$4 r1 = new cn.jpush.android.ac.e$4
            java.lang.String r2 = "ThirdPushManager#loadThirdPush"
            r1.<init>(r3, r2, r6)
            cn.jpush.android.helper.JCoreHelper.futureExecutor(r4, r1)
            goto L10d
        L100:
            java.lang.Thread r1 = new java.lang.Thread
            cn.jpush.android.ac.e$5 r2 = new cn.jpush.android.ac.e$5
            r2.<init>(r3, r6)
            r1.<init>(r2)
            r1.start()
        L10d:
            java.lang.String r1 = "Third push register failed#"
            cn.jpush.android.helper.Logger.ww(r0, r1, r6)
            goto Lb6
        L113:
            return
        L114:
            java.lang.String r4 = "push has close"
            cn.jpush.android.helper.Logger.d(r0, r4)
            return
    }

    public void a(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r3 = "ThirdPushManager"
            java.lang.String r0 = "resumePushOnMainProcess"
            cn.jpush.android.helper.Logger.d(r3, r0)
            boolean r3 = cn.jpush.android.m.a.a()
            if (r3 != 0) goto Le
            goto L27
        Le:
            r1.a(r2)
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r3 = r1.f1642b
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            cn.jpush.android.api.JThirdPlatFormInterface r0 = (cn.jpush.android.api.JThirdPlatFormInterface) r0
            r0.resumePush(r2)
            goto L17
        L27:
            return
    }

    public void a(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.String r3 = "JPUSH"
            java.lang.String r0 = "third_unbind"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void a(android.content.Context r3, java.lang.String r4, android.os.Bundle r5, java.lang.String r6) {
            r2 = this;
            java.lang.String r6 = "ThirdPushManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "doAction,action:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            r0.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = ",bundle:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            r0.append(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = ",enable:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            boolean r1 = cn.jpush.android.m.a.a()     // Catch: java.lang.Throwable -> L35
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            cn.jpush.android.helper.Logger.d(r6, r0)     // Catch: java.lang.Throwable -> L35
            boolean r0 = cn.jpush.android.m.a.a()     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L31
            return
        L31:
            r2.d(r3, r4, r5)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "doAction failed:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.ww(r6, r3)
            return
    }

    public void a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r10 = "registAndConfigureSDKOnMainProcess"
            java.lang.String r0 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r0, r10)
            java.lang.String r10 = cn.jpush.android.ad.a.d(r9)
            java.lang.String r3 = cn.jpush.android.cache.a.g(r8, r10)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L30
            r1 = 1
            cn.jpush.android.cache.a.f(r8, r1)
            java.lang.String r1 = "use cache config register"
            cn.jpush.android.helper.Logger.d(r0, r1)
            java.lang.String r4 = cn.jpush.android.cache.a.h(r8, r10)
            java.lang.String r5 = cn.jpush.android.cache.a.i(r8, r10)
            java.lang.String r6 = cn.jpush.android.cache.a.j(r8, r10)
            r1 = r7
            r2 = r8
            r1.a(r2, r3, r4, r5, r6)
            goto L32
        L30:
            r1 = r7
            r2 = r8
        L32:
            cn.jpush.android.ac.e$3 r8 = new cn.jpush.android.ac.e$3
            r8.<init>(r7, r10, r3)
            cn.jpush.android.ac.b.a(r2, r9, r8)
            return
    }

    public java.lang.String b(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "ThirdPushManager"
            java.lang.String r1 = "getThirdTokenOnServiceProcess"
            cn.jpush.android.helper.Logger.i(r0, r1)
            byte[] r0 = r5.g(r6)     // Catch: java.lang.Throwable -> L25
            r5.f1647k = r0     // Catch: java.lang.Throwable -> L25
            int r1 = r0.length     // Catch: java.lang.Throwable -> L25
            r2 = 0
        Lf:
            if (r2 >= r1) goto L25
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L25
            r4 = 8
            if (r3 == r4) goto L22
            cn.jpush.android.cache.Key r0 = cn.jpush.android.cache.Key.ThirdPush_RegID(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r6 = cn.jpush.android.cache.Sp.get(r6, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L25
            return r6
        L22:
            int r2 = r2 + 1
            goto Lf
        L25:
            java.lang.String r6 = ""
            return r6
    }

    public void b(android.content.Context r4, int r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "ThirdPushManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "[callBackTokenToUser] platform:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            r1.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = ",token:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            r1.append(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L36
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "platform"
            r1.putInt(r2, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "token"
            r1.putString(r5, r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = ""
            r6 = 10000(0x2710, float:1.4013E-41)
            r2 = 0
            cn.jpush.android.x.b.a(r4, r6, r2, r5, r1)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "callBackTokenToUser failed:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.ww(r0, r4)
            return
    }

    public void b(android.content.Context r9, android.os.Bundle r10) {
            r8 = this;
            byte[] r10 = r8.g(r9)     // Catch: java.lang.Throwable -> L53
            r8.f1647k = r10     // Catch: java.lang.Throwable -> L53
            java.lang.String r10 = "ThirdPushManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "unbindOnServiceProcess platforms="
            r0.append(r1)     // Catch: java.lang.Throwable -> L53
            byte[] r1 = r8.f1647k     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.Throwable -> L53
            r0.append(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.helper.Logger.i(r10, r0)     // Catch: java.lang.Throwable -> L53
            byte[] r10 = r8.f1647k     // Catch: java.lang.Throwable -> L53
            int r0 = r10.length     // Catch: java.lang.Throwable -> L53
            r1 = 0
            r2 = 0
        L27:
            if (r2 >= r0) goto L53
            r3 = r10[r2]     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.cache.Key r4 = cn.jpush.android.cache.Key.ThirdPush_RegUpload(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.cache.Key r4 = r4.set(r5)     // Catch: java.lang.Throwable -> L53
            r5 = 1
            cn.jpush.android.cache.Key[] r6 = new cn.jpush.android.cache.Key[r5]     // Catch: java.lang.Throwable -> L53
            r6[r1] = r4     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.cache.Sp.set(r9, r6)     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.cache.Key r4 = cn.jpush.android.cache.Key.ThirdPush_RegID(r3)     // Catch: java.lang.Throwable -> L53
            r6 = 0
            cn.jpush.android.cache.Key r4 = r4.set(r6)     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.cache.Key[] r7 = new cn.jpush.android.cache.Key[r5]     // Catch: java.lang.Throwable -> L53
            r7[r1] = r4     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.cache.Sp.set(r9, r7)     // Catch: java.lang.Throwable -> L53
            r8.a(r9, r3, r6, r5)     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + 1
            goto L27
        L53:
            return
    }

    public void b(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r3 = "ThirdPushManager"
            java.lang.String r0 = "clearAllNotificationOnMainProcess"
            cn.jpush.android.helper.Logger.d(r3, r0)
            boolean r3 = cn.jpush.android.m.a.a()
            if (r3 != 0) goto Le
            goto L27
        Le:
            r1.a(r2)
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r3 = r1.f1642b
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            cn.jpush.android.api.JThirdPlatFormInterface r0 = (cn.jpush.android.api.JThirdPlatFormInterface) r0
            r0.clearAllNotification(r2)
            goto L17
        L27:
            return
    }

    public void b(android.content.Context r6, java.lang.String r7, android.os.Bundle r8) {
            r5 = this;
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "triggerTokenUploadOnMainProcess bundle="
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = " isThirdEnable="
            r7.append(r8)
            boolean r8 = cn.jpush.android.m.a.a()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r8, r7)
            boolean r7 = cn.jpush.android.m.a.a()     // Catch: java.lang.Throwable -> L8c
            if (r7 != 0) goto L2a
            goto L9f
        L2a:
            java.lang.String r7 = "triggerTokenUploadOnMainProcess start on main"
            cn.jpush.android.helper.Logger.d(r8, r7)     // Catch: java.lang.Throwable -> L8c
            r5.a(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r7.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "[triggerTokenUploadOnMainProcess] , platFormInterfaceList size: "
            r7.append(r0)     // Catch: java.lang.Throwable -> L8c
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r0 = r5.f1642b     // Catch: java.lang.Throwable -> L8c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L8c
            r7.append(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8c
            cn.jpush.android.helper.Logger.d(r8, r7)     // Catch: java.lang.Throwable -> L8c
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r7 = r5.f1642b     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L8c
        L52:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L8c
            cn.jpush.android.api.JThirdPlatFormInterface r0 = (cn.jpush.android.api.JThirdPlatFormInterface) r0     // Catch: java.lang.Throwable -> L8c
            byte r1 = r0.getRomType(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = r0.getToken(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "triggerTokenUploadOnMainProcess token="
            r3.append(r4)     // Catch: java.lang.Throwable -> L8c
            r3.append(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = " romType="
            r3.append(r4)     // Catch: java.lang.Throwable -> L8c
            r3.append(r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8c
            cn.jpush.android.helper.Logger.d(r8, r3)     // Catch: java.lang.Throwable -> L8c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L8c
            if (r3 != 0) goto L8e
            r5.a(r6, r1, r2)     // Catch: java.lang.Throwable -> L8c
            goto L52
        L8c:
            r7 = move-exception
            goto La0
        L8e:
            boolean r1 = cn.jpush.android.helper.JCoreHelper.isAuth(r6)     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L9b
            java.lang.String r7 = "user don't auth, so return init"
            cn.jpush.android.helper.Logger.w(r8, r7)     // Catch: java.lang.Throwable -> L8c
            return
        L9b:
            r5.a(r6, r0)     // Catch: java.lang.Throwable -> L8c
            goto L52
        L9f:
            return
        La0:
            boolean r0 = r5.a(r7)
            if (r0 == 0) goto Lc4
            int r0 = cn.jpush.android.m.a.f1834c
            r1 = 238(0xee, float:3.34E-43)
            if (r0 < r1) goto Lb7
            cn.jpush.android.ac.e$7 r0 = new cn.jpush.android.ac.e$7
            java.lang.String r1 = "ThirdPushManager#loadThirdPush"
            r0.<init>(r5, r1, r7)
            cn.jpush.android.helper.JCoreHelper.futureExecutor(r6, r0)
            goto Lc4
        Lb7:
            java.lang.Thread r6 = new java.lang.Thread
            cn.jpush.android.ac.e$8 r0 = new cn.jpush.android.ac.e$8
            r0.<init>(r5, r7)
            r6.<init>(r0)
            r6.start()
        Lc4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "triggerTokenUploadOnMainProcess on main process throwable="
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jpush.android.helper.Logger.d(r8, r6)
            return
    }

    public void b(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r6 = "uploadThirdTokenFromUserOnMainProcess"
            java.lang.String r0 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r0, r6)
            byte r6 = r3.e(r4)
            if (r6 == 0) goto L30
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L19
            r5 = 0
            r0 = 1
            r3.a(r4, r6, r5, r0)
            return
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "uploadThirdTokenFromUser platform："
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r1)
            r3.a(r4, r6, r5)
        L30:
            return
    }

    public void c(android.content.Context r3) {
            r2 = this;
            cn.jpush.android.ac.c r0 = cn.jpush.android.ac.c.a()
            r0.a(r3)
            java.lang.String r0 = "ThirdPushManager"
            java.lang.String r1 = "uploadRegIdAfterLoginOnServiceProcess, then send broadcast action=intent.plugin.platform.REFRESSH_REGID"
            cn.jpush.android.helper.Logger.i(r0, r1)
            java.lang.String r0 = "intent.plugin.platform.REFRESSH_REGID"
            r2.e(r3, r0)
            return
    }

    public void c(android.content.Context r4, android.os.Bundle r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "uploadOnServiceProcess bundle="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.i(r1, r0)
            if (r4 != 0) goto L1a
            android.content.Context r4 = cn.jpush.android.local.JPushConstants.mApplicationContext
        L1a:
            if (r4 != 0) goto L22
            java.lang.String r4 = "context was null"
            cn.jpush.android.helper.Logger.e(r1, r4)
            return
        L22:
            if (r5 != 0) goto L2a
            java.lang.String r4 = "bundle is null"
            cn.jpush.android.helper.Logger.ww(r1, r4)
            return
        L2a:
            java.lang.String r0 = "platform"
            r1 = 0
            java.lang.Byte r0 = r5.getByte(r0, r1)
            byte r0 = r0.byteValue()
            java.lang.String r2 = "token"
            java.lang.String r5 = r5.getString(r2)
            r3.a(r4, r0, r5, r1)
            return
    }

    public void c(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r3 = "ThirdPushManager"
            java.lang.String r0 = "stopPushOnMainProcess"
            cn.jpush.android.helper.Logger.d(r3, r0)
            boolean r3 = cn.jpush.android.m.a.a()
            if (r3 != 0) goto Le
            goto L27
        Le:
            r1.a(r2)
            java.util.List<cn.jpush.android.api.JThirdPlatFormInterface> r3 = r1.f1642b
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            cn.jpush.android.api.JThirdPlatFormInterface r0 = (cn.jpush.android.api.JThirdPlatFormInterface) r0
            r0.stopPush(r2)
            goto L17
        L27:
            return
    }

    public void c(android.content.Context r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dealMessage action="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " bundle="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ThirdPushManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.String r0 = "intent.plugin.platform.REFRESSH_REGID"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L2a
            r2.b(r3, r4, r5)
            return
        L2a:
            java.lang.String r0 = "third_resume"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L36
            r2.a(r3, r4)
            return
        L36:
            java.lang.String r0 = "third_stop"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L42
            r2.c(r3, r4)
            return
        L42:
            java.lang.String r0 = "third_all_notify"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L4e
            r2.b(r3, r4)
            return
        L4e:
            java.lang.String r0 = "clear_by_id"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L62
            if (r5 == 0) goto Ld2
            java.lang.String r0 = "id"
            int r5 = r5.getInt(r0)
            r2.a(r3, r5, r4)
            return
        L62:
            java.lang.String r0 = "set_third_token"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L76
            if (r5 == 0) goto Ld2
            java.lang.String r0 = "third_token"
            java.lang.String r5 = r5.getString(r0)
            r2.b(r3, r5, r4)
            return
        L76:
            java.lang.String r0 = "dy_register"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L88
            java.lang.String r0 = "dev_key"
            java.lang.String r5 = r5.getString(r0)
            r2.a(r3, r5, r4)
            return
        L88:
            java.lang.String r0 = "third_enable"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto La1
            java.lang.String r0 = "enable"
            r1 = 1
            boolean r0 = r5.getBoolean(r0, r1)
            cn.jpush.android.local.JPushConstants.THIRD_ENABLE = r0     // Catch: java.lang.Throwable -> L9a
            goto L9b
        L9a:
        L9b:
            if (r0 == 0) goto Ld2
            r2.b(r3, r4, r5)
            goto Ld2
        La1:
            java.lang.String r0 = "action_notification_arrived"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Ld3
            java.lang.String r0 = "action_notification_clicked"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Ld3
            java.lang.String r0 = "action_notification_unshow"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Ld3
            java.lang.String r0 = "action_notification_show"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Ld3
            java.lang.String r0 = "action_register_token"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Ld3
            java.lang.String r0 = "action_send_exception"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Ld2
            goto Ld3
        Ld2:
            return
        Ld3:
            java.lang.String r0 = ""
            r2.a(r3, r4, r5, r0)
            return
    }

    public byte d(android.content.Context r11) {
            r10 = this;
            byte[] r0 = r10.g(r11)
            r10.f1647k = r0
            java.lang.String r1 = "ThirdPushManager"
            r2 = 0
            if (r0 != 0) goto L11
            java.lang.String r11 = " mPlatforms is null return platforms=0"
            cn.jpush.android.helper.Logger.i(r1, r11)     // Catch: java.lang.Throwable -> Leb
            return r2
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r0.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r3 = " romType all mPlatforms ="
            r0.append(r3)     // Catch: java.lang.Throwable -> Leb
            byte[] r3 = r10.f1647k     // Catch: java.lang.Throwable -> Leb
            r0.append(r3)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Leb
            cn.jpush.android.helper.Logger.i(r1, r0)     // Catch: java.lang.Throwable -> Leb
            byte[] r0 = r10.f1647k     // Catch: java.lang.Throwable -> Leb
            int r3 = r0.length     // Catch: java.lang.Throwable -> Leb
            r4 = 0
        L2b:
            if (r2 >= r3) goto Lec
            r5 = r0[r2]     // Catch: java.lang.Throwable -> Lac
            r4 = r4 | r5
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.cache.Key r6 = cn.jpush.android.cache.Key.ThirdPush_RegID(r5)     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r6 = cn.jpush.android.cache.Sp.get(r11, r6)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.cache.Key r7 = cn.jpush.android.cache.Key.ThirdPush_RegUpload(r5)     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r7 = cn.jpush.android.cache.Sp.get(r11, r7)     // Catch: java.lang.Throwable -> Lac
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lac
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r8.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = " romType first ="
            r8.append(r9)     // Catch: java.lang.Throwable -> Lac
            r8.append(r5)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.helper.Logger.i(r1, r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r8.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = " romType with 0 ="
            r8.append(r9)     // Catch: java.lang.Throwable -> Lac
            r8.append(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.helper.Logger.i(r1, r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r8.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = " token ="
            r8.append(r9)     // Catch: java.lang.Throwable -> Lac
            r8.append(r6)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.helper.Logger.i(r1, r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r8.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = " regUploaded ="
            r8.append(r9)     // Catch: java.lang.Throwable -> Lac
            r8.append(r7)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.helper.Logger.i(r1, r8)     // Catch: java.lang.Throwable -> Lac
            r8 = 8
            if (r5 != r8) goto Lae
            r4 = r4 | 8
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto Le7
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lac
            if (r5 != 0) goto Le7
            r4 = r4 | 32
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lac
            goto Le7
        Lac:
            r2 = r4
            goto Leb
        Lae:
            r8 = 2
            if (r5 != r8) goto Lb4
            r4 = r4 | 64
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lac
        Lb4:
            if (r7 == 0) goto Lbc
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto Le7
        Lbc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = " romType before 0x80  ="
            r5.append(r6)     // Catch: java.lang.Throwable -> Lac
            r5.append(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.helper.Logger.i(r1, r5)     // Catch: java.lang.Throwable -> Lac
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = " romType with 0x80  ="
            r5.append(r6)     // Catch: java.lang.Throwable -> Lac
            r5.append(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            cn.jpush.android.helper.Logger.i(r1, r5)     // Catch: java.lang.Throwable -> Lac
        Le7:
            int r2 = r2 + 1
            goto L2b
        Leb:
            r4 = r2
        Lec:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "getPlatformsOnServiceProcess final platforms="
            r11.append(r0)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            cn.jpush.android.helper.Logger.i(r1, r11)
            return r4
    }

    public byte d(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "ThirdPushManager"
            java.lang.String r1 = "clearThirdNotificaitonOnServiceProcess"
            cn.jpush.android.helper.Logger.d(r0, r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            byte r1 = r3.e(r4)
            r2 = 1
            if (r1 != r2) goto L22
            java.lang.String r1 = "id"
            int r5 = cn.jpush.android.x.b.a(r5, r2)
            r0.putInt(r1, r5)
            java.lang.String r5 = "clear_by_id"
            r3.e(r4, r5, r0)
            return r2
        L22:
            r4 = -1
            return r4
    }

    public byte e(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = cn.jpush.android.ad.a.c()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "xiaomi"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L76
            java.lang.String r1 = "blackshark"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L1a
            goto L76
        L1a:
            java.lang.String r1 = "huawei"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            r2 = 2
            if (r1 == 0) goto L24
            return r2
        L24:
            java.lang.String r1 = "meizu"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L2e
            r4 = 3
            return r4
        L2e:
            java.lang.String r1 = "oppo"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L74
            java.lang.String r1 = "realme"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L74
            java.lang.String r1 = "oneplus"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L47
            goto L74
        L47:
            java.lang.String r1 = "vivo"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L52
            r4 = 5
            return r4
        L52:
            java.lang.String r1 = "honor"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L69
            boolean r4 = r3.i(r4)     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto L67
            boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L67
            return r2
        L67:
            r4 = 7
            return r4
        L69:
            java.lang.String r4 = "nio"
            boolean r4 = r0.contains(r4)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L78
            r4 = 16
            return r4
        L74:
            r4 = 4
            return r4
        L76:
            r4 = 1
            return r4
        L78:
            r4 = 0
            return r4
    }
}
