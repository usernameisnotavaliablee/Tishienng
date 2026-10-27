package cn.jiguang.am;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f591b;
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f592c;

    /* renamed from: d, reason: collision with root package name */
    private long f593d;

    static {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            cn.jiguang.am.a.f591b = r0
            return
    }

    public a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r2.a = r4
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r2.f592c = r4
            if (r3 != 0) goto L19
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            goto L1d
        L19:
            long r3 = cn.jiguang.d.b.b(r3)
        L1d:
            r2.f593d = r3
            return
    }

    public abstract org.json.JSONObject a();

    public org.json.JSONObject b() {
            r5 = this;
            org.json.JSONObject r0 = r5.a()
            if (r0 == 0) goto L49
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "moniter_type"
            java.lang.String r3 = r5.a     // Catch: org.json.JSONException -> L2e
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L2e
            java.lang.String r2 = "uuid"
            java.lang.String r3 = cn.jiguang.am.a.f591b     // Catch: org.json.JSONException -> L2e
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L2e
            java.lang.String r2 = "moniter_id"
            java.lang.String r3 = r5.f592c     // Catch: org.json.JSONException -> L2e
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L2e
            java.lang.String r2 = "timestamp"
            long r3 = r5.f593d     // Catch: org.json.JSONException -> L2e
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L2e
            java.lang.String r2 = "extra"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L2e
            return r1
        L2e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "build baseMoniter data error"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "BaseMoniter"
            cn.jiguang.w.f.c(r1, r0)
        L49:
            r0 = 0
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f592c
            return r0
    }
}
