package cn.jiguang.commons.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p {
    private java.util.concurrent.atomic.AtomicBoolean a;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f1130c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f1131d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f1132e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicReference f1133f;

    /* renamed from: g, reason: collision with root package name */
    private volatile long f1134g;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f1135h;

    /* renamed from: i, reason: collision with root package name */
    private volatile java.lang.String f1136i;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.g.p a = null;

        static {
                cn.jiguang.commons.g.p r0 = new cn.jiguang.commons.g.p
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.g.p.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.g.p a() {
                cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.b.a
                return r0
        }
    }

    private p() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f1130c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.f1131d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f1132e = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f1133f = r0
            return
    }

    /* synthetic */ p(cn.jiguang.commons.g.p.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.g.p e() {
            cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.b.a()
            return r0
    }

    private long i() {
            r7 = this;
            long r0 = r7.f1134g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            long r0 = r7.f1135h
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            long r0 = r7.f1134g
            long r2 = r7.f1135h
            long r0 = r0 - r2
            return r0
        L14:
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "serverTime"
            long r4 = r0.a(r1, r2)
            java.lang.String r1 = "loginTime"
            long r0 = r0.a(r1, r2)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L33
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L2d
            goto L33
        L2d:
            r7.f1134g = r4
            r7.f1135h = r0
            long r4 = r4 - r0
            return r4
        L33:
            return r2
    }

    public long a(long r3) {
            r2 = this;
            long r0 = r2.i()
            long r3 = r3 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            return r3
    }

    public java.lang.String a() {
            r3 = this;
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "KEY_CHANNEL"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    public void a(android.os.Bundle r6) {
            r5 = this;
            if (r6 != 0) goto L4
            goto L2a3
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateConfig: "
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SDKStateManager"
            cn.jiguang.commons.w.a.a(r1, r0)
            java.lang.String r0 = "uid"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L4b
            long r2 = r6.getLong(r0)     // Catch: java.lang.Exception -> L32
            cn.jiguang.commons.L.ac r4 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L32
            r4.c(r0, r2)     // Catch: java.lang.Exception -> L32
            goto L4b
        L32:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_UID: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L4b:
            java.lang.String r0 = "regId"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L78
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> L5f
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L5f
            r3.c(r0, r2)     // Catch: java.lang.Exception -> L5f
            goto L78
        L5f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_REG_ID: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L78:
            java.lang.String r0 = "KEY_PLATFORM_TYPE"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto La7
            byte r0 = r6.getByte(r0)     // Catch: java.lang.Exception -> L8e
            java.util.concurrent.atomic.AtomicReference r2 = r5.f1133f     // Catch: java.lang.Exception -> L8e
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch: java.lang.Exception -> L8e
            r2.set(r0)     // Catch: java.lang.Exception -> L8e
            goto La7
        L8e:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_PLATFORM_TYPE: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        La7:
            java.lang.String r0 = "KEY_PLATFORM_REGID"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto Ld4
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> Lbb
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> Lbb
            r3.c(r0, r2)     // Catch: java.lang.Exception -> Lbb
            goto Ld4
        Lbb:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_PLATFORM_REGID: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        Ld4:
            java.lang.String r0 = "serverTime"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L114
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.f1132e     // Catch: java.lang.Exception -> Lfb
            r3 = 1
            r2.set(r3)     // Catch: java.lang.Exception -> Lfb
            long r2 = r6.getLong(r0)     // Catch: java.lang.Exception -> Lfb
            cn.jiguang.commons.L.ac r4 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> Lfb
            r4.c(r0, r2)     // Catch: java.lang.Exception -> Lfb
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> Lfb
            java.lang.String r2 = "loginTime"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lfb
            r0.c(r2, r3)     // Catch: java.lang.Exception -> Lfb
            goto L114
        Lfb:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_SERVER_TIME: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L114:
            java.lang.String r0 = "password"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L141
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> L128
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L128
            r3.c(r0, r2)     // Catch: java.lang.Exception -> L128
            goto L141
        L128:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_PASSWORD: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L141:
            java.lang.String r0 = "appKey"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L16e
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> L155
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L155
            r3.c(r0, r2)     // Catch: java.lang.Exception -> L155
            goto L16e
        L155:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_APP_KEY: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L16e:
            java.lang.String r0 = "jversion"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L19b
            int r2 = r6.getInt(r0)     // Catch: java.lang.Exception -> L182
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L182
            r3.c(r0, r2)     // Catch: java.lang.Exception -> L182
            goto L19b
        L182:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_JCORE_VERSION: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L19b:
            java.lang.String r0 = "jversion_name"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L1c8
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> L1af
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L1af
            r3.c(r0, r2)     // Catch: java.lang.Exception -> L1af
            goto L1c8
        L1af:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_JCORE_VERSION_NAME: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L1c8:
            java.lang.String r0 = "jpush_version"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L1f5
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> L1dc
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L1dc
            r3.c(r0, r2)     // Catch: java.lang.Exception -> L1dc
            goto L1f5
        L1dc:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_JPUSH_VERSION: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L1f5:
            java.lang.String r0 = "isForeground"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L220
            boolean r0 = r6.getBoolean(r0)     // Catch: java.lang.Exception -> L207
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.a     // Catch: java.lang.Exception -> L207
            r2.set(r0)     // Catch: java.lang.Exception -> L207
            goto L220
        L207:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_FOREGROUND: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L220:
            java.lang.String r0 = "connected"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L24b
            boolean r0 = r6.getBoolean(r0)     // Catch: java.lang.Exception -> L232
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.f1130c     // Catch: java.lang.Exception -> L232
            r2.set(r0)     // Catch: java.lang.Exception -> L232
            goto L24b
        L232:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_CONNECTED: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L24b:
            java.lang.String r0 = "KEY_CHANNEL"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L278
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> L25f
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L25f
            r3.c(r0, r2)     // Catch: java.lang.Exception -> L25f
            goto L278
        L25f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error processing KEY_CHANNEL: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
        L278:
            java.lang.String r0 = "auth"
            boolean r2 = r6.containsKey(r0)
            if (r2 == 0) goto L2a3
            boolean r6 = r6.getBoolean(r0)     // Catch: java.lang.Exception -> L28a
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f1131d     // Catch: java.lang.Exception -> L28a
            r0.set(r6)     // Catch: java.lang.Exception -> L28a
            goto L2a3
        L28a:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Error processing KEY_AUTH: "
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.commons.w.a.c(r1, r6)
        L2a3:
            return
    }

    public void a(android.os.Bundle r2, java.lang.String r3) {
            r1 = this;
            if (r2 != 0) goto L7
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L7:
            java.lang.String r0 = "action"
            r2.putString(r0, r3)
            cn.jiguang.commons.j.m.b(r2)
            return
    }

    public void a(org.json.JSONObject r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "SDKStateManager"
            if (r4 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "type"
            r4.put(r1, r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "app_list"
            boolean r5 = android.text.TextUtils.equals(r5, r1)     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L1b
            java.lang.String r5 = "it"
        L14:
            long r1 = r3.k()     // Catch: java.lang.Throwable -> L19
            goto L1e
        L19:
            r4 = move-exception
            goto L3d
        L1b:
            java.lang.String r5 = "itime"
            goto L14
        L1e:
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r5.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "report data: "
            r5.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L19
            r5.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L19
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L19
            cn.jiguang.commons.j.m.e(r4)     // Catch: java.lang.Throwable -> L19
            return
        L3d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "report failed: "
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.c(r0, r4)
            return
    }

    public long c() {
            r4 = this;
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "rtime"
            r2 = 0
            long r0 = r0.a(r1, r2)
            return r0
    }

    public java.lang.String d() {
            r3 = this;
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "appKey"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    public int f() {
            r3 = this;
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "jversion"
            r2 = 0
            int r0 = r0.a(r1, r2)
            return r0
    }

    public java.lang.String g() {
            r3 = this;
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "jversion_name"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    public java.lang.String h() {
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r4.f1136i
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ld
            java.lang.String r0 = r4.f1136i
            return r0
        Ld:
            cn.jiguang.commons.f.i r1 = cn.jiguang.commons.f.i.d()     // Catch: java.lang.Exception -> L34
            boolean r1 = r1.l()     // Catch: java.lang.Exception -> L34
            if (r1 != 0) goto L18
            return r0
        L18:
            java.lang.String r1 = "cn.jpush.android.local.JPushConstants"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "SDK_VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Exception -> L34
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L2e
            goto L2f
        L2e:
            r1 = r0
        L2f:
            r4.f1136i = r1     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = r4.f1136i     // Catch: java.lang.Exception -> L34
            return r0
        L34:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get jpush sdk version name failed: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "SDKStateManager"
            cn.jiguang.commons.w.a.f(r2, r1)
            r4.f1136i = r0
            return r0
    }

    public java.lang.String j() {
            r3 = this;
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "password"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    public long k() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r2.a(r0)
            return r0
    }

    public long l() {
            r4 = this;
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "uid"
            r2 = 0
            long r0 = r0.a(r1, r2)
            return r0
    }

    public boolean m() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1131d
            boolean r0 = r0.get()
            return r0
    }

    public boolean n() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.a
            boolean r0 = r0.get()
            return r0
    }

    public boolean o() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1132e
            boolean r0 = r0.get()
            return r0
    }
}
