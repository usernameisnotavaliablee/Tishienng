package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    public static java.lang.String a = "reg_finger_helper";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f1529b = "dId";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f1530c = "ud";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f1531d = "j_p_d";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f1532e = "rd";

    /* renamed from: f, reason: collision with root package name */
    private static long f1533f = 86400000;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.Integer f1534g;

    static {
            return
    }

    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r1) {
            java.lang.Integer r0 = cn.jiguang.v.k.f1534g
            if (r0 != 0) goto L10
            cn.jiguang.e.a r0 = cn.jiguang.e.a.X()
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            cn.jiguang.v.k.f1534g = r1
        L10:
            java.lang.Integer r1 = cn.jiguang.v.k.f1534g
            int r1 = r1.intValue()
            return r1
    }

    public static void a(android.content.Context r7, java.lang.String r8) {
            java.lang.String r0 = "RegFingerHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4e
            r1.<init>()     // Catch: org.json.JSONException -> L4e
            java.lang.String r2 = "saveDataMain:"
            r1.append(r2)     // Catch: org.json.JSONException -> L4e
            r1.append(r8)     // Catch: org.json.JSONException -> L4e
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L4e
            cn.jiguang.w.f.c(r0, r1)     // Catch: org.json.JSONException -> L4e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
            r1.<init>(r8)     // Catch: org.json.JSONException -> L4e
            java.lang.String r2 = cn.jiguang.v.k.f1529b     // Catch: org.json.JSONException -> L4e
            java.lang.String r2 = r1.optString(r2)     // Catch: org.json.JSONException -> L4e
            java.lang.String r3 = cn.jiguang.v.k.f1530c     // Catch: org.json.JSONException -> L4e
            long r3 = r1.optLong(r3)     // Catch: org.json.JSONException -> L4e
            java.lang.String r5 = cn.jiguang.v.k.f1531d     // Catch: org.json.JSONException -> L4e
            java.lang.String r5 = r1.optString(r5)     // Catch: org.json.JSONException -> L4e
            java.lang.String r6 = cn.jiguang.v.k.f1532e     // Catch: org.json.JSONException -> L4e
            java.lang.String r1 = r1.optString(r6)     // Catch: org.json.JSONException -> L4e
            cn.jiguang.z.b.a(r7, r2)     // Catch: org.json.JSONException -> L4e
            cn.jiguang.z.b.a(r7, r3, r5, r1)     // Catch: org.json.JSONException -> L4e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4e
            r7.<init>()     // Catch: org.json.JSONException -> L4e
            java.lang.String r1 = "saveDataMain end:"
            r7.append(r1)     // Catch: org.json.JSONException -> L4e
            r7.append(r8)     // Catch: org.json.JSONException -> L4e
            java.lang.String r7 = r7.toString()     // Catch: org.json.JSONException -> L4e
            cn.jiguang.w.f.c(r0, r7)     // Catch: org.json.JSONException -> L4e
            return
        L4e:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "saveDataMain Fail: "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jiguang.w.f.l(r0, r7)
            return
    }

    public static void a(android.content.Context r4, java.lang.String r5, long r6, java.lang.String r8, java.lang.String r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sendDataMain:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r2 = ",isNewFingerprint:"
            r0.append(r2)
            java.lang.Integer r2 = cn.jiguang.v.k.f1534g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "RegFingerHelper"
            cn.jiguang.w.f.c(r2, r0)
            int r0 = a(r4)
            if (r0 != 0) goto L27
            return
        L27:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r3 = cn.jiguang.v.k.f1529b     // Catch: org.json.JSONException -> L41
            r0.put(r3, r5)     // Catch: org.json.JSONException -> L41
            java.lang.String r5 = cn.jiguang.v.k.f1530c     // Catch: org.json.JSONException -> L41
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L41
            java.lang.String r5 = cn.jiguang.v.k.f1531d     // Catch: org.json.JSONException -> L41
            r0.put(r5, r8)     // Catch: org.json.JSONException -> L41
            java.lang.String r5 = cn.jiguang.v.k.f1532e     // Catch: org.json.JSONException -> L41
            r0.put(r5, r9)     // Catch: org.json.JSONException -> L41
            goto L56
        L41:
            r5 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sendDataMain Fail: "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            cn.jiguang.w.f.l(r2, r5)
        L56:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r6)
            java.lang.String r6 = ",jsonObject:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            cn.jiguang.w.f.c(r2, r5)
            java.lang.String r5 = cn.jiguang.v.k.a
            java.lang.String r6 = r0.toString()
            cn.jiguang.av.a.b(r4, r5, r6)
            return
    }

    public static void b(android.content.Context r4) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.X()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            cn.jiguang.e.a r0 = r0.a(r2)
            r3 = 1
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r3]
            r3[r1] = r0
            cn.jiguang.e.b.a(r4, r3)
            cn.jiguang.v.k.f1534g = r2
            return
    }

    public static void c(android.content.Context r7) {
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "RegFingerHelper"
            boolean r3 = cn.jiguang.v.h.a()     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r4.<init>()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r5 = "regFinger is:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lff
            r4.append(r3)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.w.f.c(r2, r4)     // Catch: java.lang.Throwable -> Lff
            if (r3 == 0) goto L116
            cn.jiguang.e.a r3 = cn.jiguang.e.a.W()     // Catch: java.lang.Throwable -> Lff
            java.lang.Object r3 = cn.jiguang.e.b.a(r7, r3)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r4.<init>()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.av.a r5 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r5 = r5.p(r7)     // Catch: java.lang.Throwable -> Lff
            r4.append(r5)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.av.a r5 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r5 = r5.q(r7)     // Catch: java.lang.Throwable -> Lff
            r4.append(r5)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r4 = cn.jiguang.av.v.k(r4)     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r5.<init>()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r6 = "regFinger oldRule:"
            r5.append(r6)     // Catch: java.lang.Throwable -> Lff
            r5.append(r3)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.w.f.c(r2, r5)     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r5.<init>()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r6 = "regFinger newRule:"
            r5.append(r6)     // Catch: java.lang.Throwable -> Lff
            r5.append(r4)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.w.f.c(r2, r5)     // Catch: java.lang.Throwable -> Lff
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lff
            r6 = 0
            if (r5 != 0) goto L101
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lff
            if (r5 != 0) goto L116
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lff
            if (r3 != 0) goto L116
            java.lang.String r3 = "regFinger is re"
            cn.jiguang.w.f.c(r2, r3)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r3 = "cn.jiguang.sdk.user.profile"
            cn.jiguang.e.b.a(r7, r3)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r3 = cn.jiguang.e.a.X()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r3 = r3.a(r1)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> Lff
            r5[r6] = r3     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.b.a(r7, r5)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.v.k.f1534g = r1     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = cn.jiguang.e.a.W()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = r1.a(r4)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> Lff
            r3[r6] = r1     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.b.a(r7, r3)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.h.b.a(r7)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.av.a.b()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r1 = "bal.catch"
            cn.jiguang.av.i.d(r1)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = cn.jiguang.e.a.b()     // Catch: java.lang.Throwable -> Lff
            r3 = 0
            cn.jiguang.e.a r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> Lff
            r4[r6] = r1     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.b.a(r7, r4)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = cn.jiguang.e.a.au()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> Lff
            r4[r6] = r1     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.b.a(r7, r4)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = cn.jiguang.e.a.av()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> Lff
            r4[r6] = r1     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.b.a(r7, r4)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aK()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> Lff
            r0[r6] = r1     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.b.a(r7, r0)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.ai.a.b(r7)     // Catch: java.lang.Throwable -> Lff
            return
        Lff:
            r7 = move-exception
            goto L117
        L101:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lff
            if (r1 != 0) goto L116
            cn.jiguang.e.a r1 = cn.jiguang.e.a.W()     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a r1 = r1.a(r4)     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> Lff
            r0[r6] = r1     // Catch: java.lang.Throwable -> Lff
            cn.jiguang.e.b.a(r7, r0)     // Catch: java.lang.Throwable -> Lff
        L116:
            return
        L117:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reg Fail: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            cn.jiguang.w.f.l(r2, r7)
            return
    }
}
