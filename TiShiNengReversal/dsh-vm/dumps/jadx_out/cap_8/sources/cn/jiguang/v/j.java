package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    private static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1525b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f1526c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.Integer f1527d;

    /* renamed from: e, reason: collision with root package name */
    private static final java.util.LinkedList<java.lang.String> f1528e = null;


    static {
            r0 = 24
            byte[] r0 = new byte[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [72, 109, 124, 102, 98, 10, 15, 54, 123, 101, 125, 83, 69, 107, 124, 56, 123, 64, 85, 106, 96, 56, 114, 94} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.v.j.a = r0
            r1 = 29
            byte[] r1 = new byte[r1]
            r1 = {x0038: FILL_ARRAY_DATA , data: [88, 84, 109, 120, 101, 43, 31, 15, 106, 123, 122, 114, 85, 82, 109, 37, 127, 97, 70, 22, 55, 98, 102, 100, 67, 72, 55, 107, 120} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.v.j.f1525b = r1
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            cn.jiguang.v.j.f1528e = r2
            r2.add(r0)
            r2.add(r1)
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.Integer a(java.lang.Integer r0) {
            cn.jiguang.v.j.f1527d = r0
            return r0
    }

    public static java.lang.String a() {
            c()
            java.lang.String r0 = cn.jiguang.v.j.f1526c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = cn.jiguang.v.j.f1526c
            return r0
        Le:
            java.lang.String r0 = ""
            return r0
    }

    static /* synthetic */ java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = b(r0)
            return r0
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            cn.jiguang.v.j.f1526c = r0
            return r0
    }

    public static void a(android.content.Context r1, int r2) {
            boolean r2 = b(r1, r2)
            if (r2 != 0) goto L7
            return
        L7:
            cn.jiguang.v.j$1 r2 = new cn.jiguang.v.j$1
            java.lang.String r0 = "JSslCertUpdateManager"
            r2.<init>(r0, r1)
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r1, r2)
            return
    }

    public static int b() {
            c()
            java.lang.Integer r0 = cn.jiguang.v.j.f1527d
            if (r0 == 0) goto Lc
            int r0 = r0.intValue()
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private static java.lang.String b(android.content.Context r11) {
            java.lang.String r1 = "JSslCertUpdateManager"
            r2 = 0
            java.lang.String r0 = cn.jiguang.v.a.a(r11)     // Catch: java.lang.Throwable -> L13
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L17
            java.lang.String r11 = "appKey is empty, return"
            cn.jiguang.w.f.i(r1, r11)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r0 = move-exception
            r11 = r0
            goto La9
        L17:
            java.util.LinkedList<java.lang.String> r3 = cn.jiguang.v.j.f1528e     // Catch: java.lang.Throwable -> L13
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L13
        L1d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto Lc1
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L13
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L13
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L36
            java.lang.String r4 = "url is empty, return it"
            cn.jiguang.w.f.i(r1, r4)     // Catch: java.lang.Throwable -> L13
            goto L1d
        L36:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13
            r4.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = "appkey"
            r4.put(r6, r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = "sdkver"
            java.lang.String r7 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> L13
            r4.put(r6, r7)     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = "platform"
            r7 = 0
            r4.put(r6, r7)     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L13
            r9 = 3
            r10 = 2
            r8 = 1
            r7 = r11
            cn.jiguang.y.h r11 = cn.jiguang.y.c.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r4.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = "update cert code["
            r4.append(r6)     // Catch: java.lang.Throwable -> L13
            int r6 = r11.a()     // Catch: java.lang.Throwable -> L13
            r4.append(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = "] from url="
            r4.append(r6)     // Catch: java.lang.Throwable -> L13
            r4.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = "\n body="
            r4.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = r11.b()     // Catch: java.lang.Throwable -> L13
            r4.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L13
            cn.jiguang.w.f.c(r1, r4)     // Catch: java.lang.Throwable -> L13
            int r4 = r11.a()     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto La6
            java.lang.String r11 = r11.b()     // Catch: java.lang.Throwable -> L13
            boolean r4 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto La6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "code"
            int r0 = r0.optInt(r3)     // Catch: java.lang.Throwable -> L13
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto La5
            return r2
        La5:
            return r11
        La6:
            r11 = r7
            goto L1d
        La9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "request crt failed, "
            r0.append(r3)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            cn.jiguang.w.f.i(r1, r11)
        Lc1:
            return r2
    }

    private static boolean b(android.content.Context r4, int r5) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.l()
            java.lang.Object r0 = cn.jiguang.e.b.a(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            cn.jiguang.e.a r1 = cn.jiguang.e.a.m()
            java.lang.Object r4 = cn.jiguang.e.b.a(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r1 = 0
            if (r0 != 0) goto L2a
            if (r4 == 0) goto L22
            goto L2a
        L22:
            java.lang.String r4 = "JSslCertUpdateManager"
            java.lang.String r5 = "not use tcp ssl, so need not update cert."
            cn.jiguang.w.f.c(r4, r5)
            return r1
        L2a:
            int r4 = b()
            if (r4 < r5) goto L4f
            java.lang.String r0 = "JSslCertUpdateManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "it need not update cert, l_cert_ver: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = ", new_cert_ver: "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            cn.jiguang.w.f.c(r0, r4)
            return r1
        L4f:
            cn.jiguang.ab.c.a(r1)
            cn.jiguang.ab.c.b(r1)
            java.lang.Class<cn.jiguang.v.j> r4 = cn.jiguang.v.j.class
            monitor-enter(r4)
            r5 = 0
            cn.jiguang.v.j.f1526c = r5     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "ccp.catch."
            cn.jiguang.av.i.d(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "JSslCertUpdateManager"
            java.lang.String r0 = "should update, clear cert"
            cn.jiguang.w.f.c(r5, r0)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            r4 = 1
            return r4
        L6a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            throw r5
    }

    private static void c() {
            java.lang.Integer r0 = cn.jiguang.v.j.f1527d
            if (r0 != 0) goto L56
            java.lang.String r0 = cn.jiguang.v.j.f1526c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld
            goto L56
        Ld:
            java.lang.Class<cn.jiguang.v.j> r0 = cn.jiguang.v.j.class
            monitor-enter(r0)
            r1 = 0
            cn.jiguang.av.c.a(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "ccp.catch."
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            java.lang.String r2 = "{}"
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L50
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L2a
            goto L52
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "cert"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.optString(r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L56
            java.lang.String r2 = cn.jiguang.a.a.f243j
            java.lang.String r0 = cn.jiguang.av.t.b(r0, r2)
            cn.jiguang.v.j.f1526c = r0
            java.lang.String r0 = "ver"
            r2 = 0
            int r0 = r1.optInt(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jiguang.v.j.f1527d = r0
            return
        L50:
            r1 = move-exception
            goto L54
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r1
        L56:
            return
    }
}
