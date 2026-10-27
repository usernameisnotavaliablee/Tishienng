package cn.jiguang.commons.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j extends cn.jiguang.commons.f.e {
    private static final java.lang.String r = null;
    private static final java.lang.String s = null;
    private final java.util.concurrent.atomic.AtomicReference l;
    private final java.util.concurrent.atomic.AtomicReference m;
    private final java.util.concurrent.ConcurrentHashMap n;
    private final java.util.List o;
    private java.lang.String p;
    private int q;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.f.j a = null;

        static {
                cn.jiguang.commons.f.j r0 = new cn.jiguang.commons.f.j
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.f.j.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.f.j a() {
                cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.b.a
                return r0
        }
    }

    static {
            r0 = 35
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [88, 84, 109, 120, 101, 43, 31, 15, 122, 109, 37, 116, 7, 21, 125, 61, 56, 123, 64, 85, 106, 96, 56, 114, 94, 15, 110, 97, 57, 126, 64, 24, 115, 108, 99} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.f.j.r = r0
            r0 = 40
            byte[] r0 = new byte[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [121, 68, 84, 105, 123, 44, 62, 31, 67, 124, 59, 115, 38, 5, 68, 44, 37, 127, 97, 70, 22, 55, 98, 102, 100, 67, 72, 55, 107, 120, 62, 71, 73, 54, 103, 102, 41, 90, 68, 108} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.f.j.s = r0
            return
    }

    private j() {
            r6 = this;
            java.lang.String r2 = cn.jiguang.commons.a.d.a.f950d
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r5 = "server_"
            java.lang.String r1 = "ServerConfigManager"
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r2 = ""
            r1.<init>(r2)
            r0.l = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r2)
            r0.m = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.n = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.o = r1
            r0.p = r2
            r1 = 1
            r0.q = r1
            java.lang.String r1 = "initializing serverconfigmanager"
            java.lang.String r2 = "ServerConfigManager"
            cn.jiguang.commons.w.a.a(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "serverconfigmanager initialized with "
            r1.append(r3)
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.f1097c
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = " urls"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r2, r1)
            return
    }

    /* synthetic */ j(cn.jiguang.commons.f.j.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private cn.jiguang.commons.c.i a(org.json.JSONObject r4) {
            r3 = this;
            cn.jiguang.commons.c.i r0 = new cn.jiguang.commons.c.i
            r0.<init>()
            java.lang.String r1 = "ci"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            r0.f(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "sc"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            int r1 = r1 * 1000
            r0.e(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "rp"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            int r1 = r1 * 1000
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L76
            r0.c(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "bc"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            int r1 = r1 * 1000
            r0.d(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "sr"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            int r1 = r1 * 1000
            r0.h(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "br"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            int r1 = r1 * 1000
            r0.i(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "bg"
            r2 = 1
            int r1 = r4.optInt(r1, r2)     // Catch: java.lang.Throwable -> L76
            r0.a(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "md"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            r2 = 60000(0xea60, float:8.4078E-41)
            if (r1 <= 0) goto L5d
            int r1 = r1 * r2
        L5d:
            r0.g(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "de"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            int r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L76
            r0.a(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "scc"
            int r4 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L76
            r0.c(r4)     // Catch: java.lang.Throwable -> L76
            return r0
        L76:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "createConfigFromJson throwable="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "ServerConfigManager"
            cn.jiguang.commons.w.a.a(r1, r4)
            return r0
    }

    private void a(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "config not found: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "ServerConfigManager"
            cn.jiguang.commons.w.a.f(r3, r2)
        L18:
            return
    }

    private void c(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "al"
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            if (r3 == 0) goto L2a
            int r0 = cn.jiguang.commons.L.c.f862d
            java.lang.String r1 = "priority"
            int r3 = r3.optInt(r1, r0)
            cn.jiguang.commons.L.c.f863e = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "updated app list priority:"
            r3.append(r0)
            int r0 = cn.jiguang.commons.L.c.f863e
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ServerConfigManager"
            cn.jiguang.commons.w.a.a(r0, r3)
        L2a:
            return
    }

    private boolean c(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    private cn.jiguang.commons.c.n d(org.json.JSONObject r10) {
            r9 = this;
            java.lang.String r1 = "ServerConfigManager"
            java.util.concurrent.ConcurrentHashMap r0 = r9.n     // Catch: java.lang.Exception -> L23
            r0.clear()     // Catch: java.lang.Exception -> L23
            java.util.List r0 = r9.o     // Catch: java.lang.Exception -> L23
            r0.clear()     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "status"
            int r0 = r10.optInt(r0)     // Catch: java.lang.Exception -> L23
            java.util.concurrent.atomic.AtomicReference r2 = r9.l     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = "sign"
            java.lang.String r3 = r10.optString(r3)     // Catch: java.lang.Exception -> L23
            r2.set(r3)     // Catch: java.lang.Exception -> L23
            if (r0 != 0) goto L26
            r9.e(r10)     // Catch: java.lang.Exception -> L23
            goto L3a
        L23:
            r0 = move-exception
            r10 = r0
            goto L68
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = "config status is disabled:"
            r2.append(r3)     // Catch: java.lang.Exception -> L23
            r2.append(r0)     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L23
            cn.jiguang.commons.w.a.f(r1, r0)     // Catch: java.lang.Exception -> L23
        L3a:
            java.lang.String r0 = "extra"
            org.json.JSONObject r10 = r10.optJSONObject(r0)     // Catch: java.lang.Exception -> L23
            r9.f(r10)     // Catch: java.lang.Exception -> L23
            java.lang.String r10 = "config data processing completed"
            cn.jiguang.commons.w.a.a(r1, r10)     // Catch: java.lang.Exception -> L23
            cn.jiguang.commons.c.n r2 = new cn.jiguang.commons.c.n     // Catch: java.lang.Exception -> L23
            java.util.concurrent.ConcurrentHashMap r3 = r9.n     // Catch: java.lang.Exception -> L23
            java.util.List r4 = r9.o     // Catch: java.lang.Exception -> L23
            java.util.concurrent.atomic.AtomicReference r10 = r9.l     // Catch: java.lang.Exception -> L23
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Exception -> L23
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L23
            java.util.concurrent.atomic.AtomicReference r10 = r9.m     // Catch: java.lang.Exception -> L23
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Exception -> L23
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L23
            java.lang.String r7 = r9.p     // Catch: java.lang.Exception -> L23
            int r8 = r9.q     // Catch: java.lang.Exception -> L23
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L23
            return r2
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "error processing config data:"
            r0.append(r2)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            cn.jiguang.commons.w.a.c(r1, r10)
            r10 = 0
            return r10
    }

    private void d(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "-"
            java.lang.String[] r6 = r6.split(r0)
            int r1 = r6.length
            r2 = 2
            if (r1 < r2) goto L39
            r1 = 0
            r2 = r6[r1]
            r3 = 1
            r6 = r6[r3]
            java.lang.String[] r6 = new java.lang.String[]{r2, r6}
            java.util.List r2 = r5.o
            r2.add(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "added report time:"
            r2.append(r4)
            r1 = r6[r1]
            r2.append(r1)
            r2.append(r0)
            r6 = r6[r3]
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r0 = "ServerConfigManager"
            cn.jiguang.commons.w.a.a(r0, r6)
        L39:
            return
    }

    private void e(org.json.JSONObject r1) {
            r0 = this;
            r0.i(r1)
            r0.g(r1)
            return
    }

    private void f(org.json.JSONObject r2) {
            r1 = this;
            if (r2 != 0) goto La
            java.lang.String r2 = "ServerConfigManager"
            java.lang.String r0 = "no extra config to process"
            cn.jiguang.commons.w.a.a(r2, r0)
            return
        La:
            r1.c(r2)
            r1.h(r2)
            return
    }

    private void g(org.json.JSONObject r5) {
            r4 = this;
            java.lang.String r0 = "pl"
            org.json.JSONArray r5 = r5.optJSONArray(r0)
            if (r5 == 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "processing permissions config with "
            r0.append(r1)
            int r1 = r5.length()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ServerConfigManager"
            cn.jiguang.commons.w.a.a(r1, r0)
            r0 = 0
        L28:
            int r1 = r5.length()
            if (r0 >= r1) goto L48
            org.json.JSONObject r1 = r5.optJSONObject(r0)
            if (r1 == 0) goto L45
            cn.jiguang.commons.c.i r1 = r4.a(r1)
            java.util.concurrent.ConcurrentHashMap r2 = r4.n
            int r3 = r1.g()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r1)
        L45:
            int r0 = r0 + 1
            goto L28
        L48:
            return
    }

    private void h(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "pb"
            org.json.JSONObject r7 = r7.optJSONObject(r0)
            if (r7 == 0) goto L7b
            java.lang.String r0 = "pb_sign"
            java.lang.String r1 = r7.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L15
            goto L7b
        L15:
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()
            java.lang.String r2 = ""
            java.lang.String r1 = r1.a(r0, r2)
            java.lang.String r3 = r7.optString(r0)
            java.util.concurrent.atomic.AtomicReference r4 = r6.m
            r4.set(r3)
            java.lang.String r4 = "ap"
            r5 = 1
            int r4 = r7.optInt(r4, r5)
            r6.q = r4
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            java.lang.String r4 = "list"
            java.lang.String r7 = r7.optString(r4)
            java.lang.String r4 = "ServerConfigManager"
            if (r1 == 0) goto L68
            java.lang.String r0 = cn.jiguang.commons.a.d.a.n
            java.lang.String r1 = cn.jiguang.commons.L.m.j(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L54
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 == 0) goto L54
            r6.p = r2
            return
        L54:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L5d
            r6.p = r1
            return
        L5d:
            r6.p = r7
            cn.jiguang.commons.L.m.c(r0, r7)
            java.lang.String r7 = "pb data inconsistent"
            cn.jiguang.commons.w.a.f(r4, r7)
            return
        L68:
            r6.p = r7
            java.lang.String r1 = cn.jiguang.commons.a.d.a.n
            cn.jiguang.commons.L.m.c(r1, r7)
            cn.jiguang.commons.L.ac r7 = cn.jiguang.commons.L.ac.a()
            r7.c(r0, r3)
            java.lang.String r7 = "pb updated"
            cn.jiguang.commons.w.a.a(r4, r7)
        L7b:
            return
    }

    private void i(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "rt"
            org.json.JSONArray r4 = r4.optJSONArray(r0)
            if (r4 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "processing report time config with "
            r0.append(r1)
            int r1 = r4.length()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ServerConfigManager"
            cn.jiguang.commons.w.a.a(r1, r0)
            r0 = 0
        L28:
            int r1 = r4.length()
            if (r0 >= r1) goto L3e
            java.lang.String r1 = r4.optString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3b
            r3.d(r1)
        L3b:
            int r0 = r0 + 1
            goto L28
        L3e:
            return
    }

    public static cn.jiguang.commons.f.j j() {
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.b.a()
            return r0
    }

    public cn.jiguang.commons.c.i a(int r4) {
            r3 = this;
            boolean r0 = r3.c(r4)
            r1 = 0
            if (r0 != 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "invalid config id:"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ServerConfigManager"
            cn.jiguang.commons.w.a.f(r0, r4)
            return r1
        L1e:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f1098d
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.c.n r0 = (cn.jiguang.commons.c.n) r0
            if (r0 == 0) goto L3f
            java.util.concurrent.ConcurrentHashMap r0 = r0.c()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            cn.jiguang.commons.c.i r0 = (cn.jiguang.commons.c.i) r0
            if (r0 == 0) goto L3a
            r1 = 1
            goto L3b
        L3a:
            r1 = 0
        L3b:
            r3.a(r4, r1)
            return r0
        L3f:
            return r1
    }

    @Override // cn.jiguang.commons.f.e
    protected cn.jiguang.commons.x.c a(java.lang.String r5, org.json.JSONObject r6) {
            r4 = this;
            java.lang.String r0 = "ServerConfigManager"
            cn.jiguang.commons.x.c r1 = new cn.jiguang.commons.x.c     // Catch: java.lang.Throwable -> L54
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "Content-Type"
            java.lang.String r2 = "text/plain"
            r1.a(r5, r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "Accept"
            java.lang.String r2 = "application/json"
            r1.a(r5, r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "Charset"
            java.lang.String r2 = "UTF-8"
            r1.a(r5, r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L54
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = cn.jiguang.commons.a.d.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = cn.jiguang.commons.a.d.f940c     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = cn.jiguang.commons.L.z.a(r5, r2, r3)     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "encryptStr:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L54
            r2.append(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = ", paramJson: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L54
            r2.append(r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L54
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L54
            r1.a(r5)     // Catch: java.lang.Throwable -> L54
            r5 = 15000(0x3a98, float:2.102E-41)
            r1.a(r5)     // Catch: java.lang.Throwable -> L54
            r1.c(r5)     // Catch: java.lang.Throwable -> L54
            return r1
        L54:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "error creating http request:"
            r6.append(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.commons.w.a.c(r0, r5)
            r5 = 0
            return r5
    }

    @Override // cn.jiguang.commons.f.e
    protected /* synthetic */ java.lang.Object a(java.lang.String r1) {
            r0 = this;
            cn.jiguang.commons.c.n r1 = r0.c(r1)
            return r1
    }

    @Override // cn.jiguang.commons.f.e
    protected org.json.JSONObject a() {
            r7 = this;
            java.lang.String r0 = "ServerConfigManager"
            r1 = 0
            cn.jiguang.commons.g.p r2 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L17
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L1a
            java.lang.String r2 = "cannot get appkey for config request"
            cn.jiguang.commons.w.a.c(r0, r2)     // Catch: java.lang.Exception -> L17
            return r1
        L17:
            r2 = move-exception
            goto Ld0
        L1a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17
            r3.<init>()     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = "ak"
            r3.put(r4, r2)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "p"
            java.lang.String r4 = "a"
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "av"
            java.lang.String r4 = "5"
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "sign"
            java.util.concurrent.atomic.AtomicReference r4 = r7.l     // Catch: java.lang.Exception -> L17
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "file_version"
            java.lang.String r4 = ""
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "manufacturer"
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L17
            r5 = 1011(0x3f3, float:1.417E-42)
            r6 = 1
            java.lang.String r4 = r4.d(r5, r6)     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "rom"
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L17
            r5 = 1019(0x3fb, float:1.428E-42)
            java.lang.String r4 = r4.d(r5, r6)     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "model"
            cn.jiguang.commons.g.n r4 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L17
            r5 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r4 = r4.d(r5, r6)     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "osversion"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L17
            r4 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r2 = r2.d(r4, r6)     // Catch: java.lang.Exception -> L17
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L17
            if (r4 != 0) goto L92
            java.lang.String r4 = "android_ver"
            r3.put(r4, r2)     // Catch: java.lang.Exception -> L17
        L92:
            java.lang.String r2 = "jcore_ver"
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = r4.g()     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "jpush_ver"
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = r4.h()     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "pb_sign"
            java.util.concurrent.atomic.AtomicReference r4 = r7.m     // Catch: java.lang.Exception -> L17
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L17
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L17
            r2.<init>()     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = "built request params:"
            r2.append(r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L17
            r2.append(r4)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L17
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L17
            return r3
        Ld0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "error building request params:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.c(r0, r2)
            return r1
    }

    protected boolean a(cn.jiguang.commons.c.n r1) {
            r0 = this;
            if (r1 == 0) goto La
            java.util.concurrent.ConcurrentHashMap r1 = r1.c()
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.commons.f.e
    protected /* bridge */ /* synthetic */ boolean a(java.lang.Object r1) {
            r0 = this;
            cn.jiguang.commons.c.n r1 = (cn.jiguang.commons.c.n) r1
            boolean r1 = r0.a(r1)
            return r1
    }

    protected cn.jiguang.commons.c.n c(java.lang.String r7) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            java.lang.String r2 = "ServerConfigManager"
            if (r0 == 0) goto Lf
            java.lang.String r7 = "config string is empty"
            cn.jiguang.commons.w.a.f(r2, r7)
            return r1
        Lf:
            java.lang.String r0 = cn.jiguang.commons.a.d.a     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = cn.jiguang.commons.a.d.f940c     // Catch: java.lang.Exception -> L40
            byte[] r7 = cn.jiguang.commons.L.z.a(r7, r0, r3)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = "UTF-8"
            r0.<init>(r7, r3)     // Catch: java.lang.Exception -> L40
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L40
            r7.<init>(r0)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = "code"
            int r0 = r7.optInt(r0)     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = "message"
            java.lang.String r3 = r7.optString(r3)     // Catch: java.lang.Exception -> L40
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r0 != r4) goto L45
            java.lang.String r0 = "data"
            org.json.JSONObject r7 = r7.optJSONObject(r0)     // Catch: java.lang.Exception -> L40
            if (r7 == 0) goto L42
            cn.jiguang.commons.c.n r7 = r6.d(r7)     // Catch: java.lang.Exception -> L40
            return r7
        L40:
            r7 = move-exception
            goto L78
        L42:
            java.lang.String r7 = "config data is null"
            goto L74
        L45:
            r7 = 4009(0xfa9, float:5.618E-42)
            java.lang.String r4 = ", message:"
            if (r7 != r0) goto L5f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r7.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r5 = "config not update ,code:"
            r7.append(r5)     // Catch: java.lang.Exception -> L40
            r7.append(r0)     // Catch: java.lang.Exception -> L40
            r7.append(r4)     // Catch: java.lang.Exception -> L40
        L5b:
            r7.append(r3)     // Catch: java.lang.Exception -> L40
            goto L70
        L5f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r7.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r5 = "config request failed - code:"
            r7.append(r5)     // Catch: java.lang.Exception -> L40
            r7.append(r0)     // Catch: java.lang.Exception -> L40
            r7.append(r4)     // Catch: java.lang.Exception -> L40
            goto L5b
        L70:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L40
        L74:
            cn.jiguang.commons.w.a.f(r2, r7)     // Catch: java.lang.Exception -> L40
            goto L90
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "error refreshing config:"
            r0.append(r3)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            cn.jiguang.commons.w.a.c(r2, r7)
        L90:
            return r1
    }

    @Override // cn.jiguang.commons.f.e
    protected /* synthetic */ java.lang.Object c() {
            r1 = this;
            cn.jiguang.commons.c.n r0 = r1.h()
            return r0
    }

    @Override // cn.jiguang.commons.f.e
    protected void d() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f1097c
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f1097c
            java.lang.String r1 = cn.jiguang.commons.f.j.r
            r0.add(r1)
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f1097c
            java.lang.String r1 = cn.jiguang.commons.f.j.s
            r0.add(r1)
            return
    }

    protected cn.jiguang.commons.c.n h() {
            r7 = this;
            cn.jiguang.commons.c.n r0 = new cn.jiguang.commons.c.n
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r3 = r7.l
            java.lang.Object r3 = r3.get()
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.atomic.AtomicReference r4 = r7.m
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ""
            r6 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public int i() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.f1098d
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.c.n r0 = (cn.jiguang.commons.c.n) r0
            if (r0 == 0) goto Lf
            int r0 = r0.a()
            return r0
        Lf:
            int r0 = r1.q
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.f1098d
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.c.n r0 = (cn.jiguang.commons.c.n) r0
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.d()
            return r0
        Lf:
            java.lang.String r0 = r1.p
            return r0
    }
}
