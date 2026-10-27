package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static java.lang.String a = "";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f685b = "";

    static {
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONObject a(android.content.Context r8) {
            r0 = 0
            java.lang.String r1 = "JDeviceHelper"
            if (r8 != 0) goto Lc
            java.lang.String r8 = "when getDInfo, context can't be null"
            cn.jiguang.w.f.i(r1, r8)
            return r0
        Lc:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.<init>()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = r3.j(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r4 = cn.jiguang.f.b.d()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r5 = "resolution"
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r7 = ""
            if (r6 == 0) goto L28
            r3 = r7
        L28:
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "screensize"
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            if (r5 == 0) goto L34
            r4 = r7
        L34:
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "os_version"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r4 = r4.w(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "model"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r4 = r4.r(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "brand"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r4 = r4.s(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "product"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r4 = r4.n(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "language"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r4 = r4.t(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "manufacturer"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r4 = r4.u(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r3 = "timezone"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            java.lang.String r8 = r4.v(r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            r2.put(r3, r8)     // Catch: java.lang.Throwable -> L93 org.json.JSONException -> L95
            return r2
        L93:
            r8 = move-exception
            goto L97
        L95:
            r8 = move-exception
            goto Lb0
        L97:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getDInfo exception: "
        L9e:
            r2.append(r3)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            cn.jiguang.w.f.i(r1, r8)
            goto Lb8
        Lb0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "package json exception: "
            goto L9e
        Lb8:
            return r0
    }
}
