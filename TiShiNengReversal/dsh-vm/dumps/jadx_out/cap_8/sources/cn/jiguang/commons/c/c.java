package cn.jiguang.commons.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private java.lang.Object a;

    /* renamed from: c, reason: collision with root package name */
    public long f996c;

    /* renamed from: d, reason: collision with root package name */
    public long f997d;

    /* renamed from: e, reason: collision with root package name */
    public long f998e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicBoolean f999f;

    /* renamed from: g, reason: collision with root package name */
    public int f1000g;

    public c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f999f = r0
            return
    }

    public c(java.lang.Object r3, long r4, long r6) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f999f = r0
            r2.a = r3
            r2.f996c = r4
            r2.f997d = r6
            return
    }

    public static cn.jiguang.commons.c.c a(java.lang.String r6) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r0.<init>(r6)     // Catch: org.json.JSONException -> L28
            cn.jiguang.commons.c.c r6 = new cn.jiguang.commons.c.c     // Catch: org.json.JSONException -> L28
            r6.<init>()     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "value"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: org.json.JSONException -> L28
            r6.a = r1     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "expiredTime"
            r2 = 0
            long r4 = r0.optLong(r1, r2)     // Catch: org.json.JSONException -> L28
            r6.f996c = r4     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "cacheTime"
            long r0 = r0.optLong(r1, r2)     // Catch: org.json.JSONException -> L28
            r6.f997d = r0     // Catch: org.json.JSONException -> L28
            return r6
        L28:
            r6 = 0
            return r6
    }

    private java.lang.Object a(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L16
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L16
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L12
            return r2
        L12:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L16:
            return r2
    }

    public java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    public void a(java.lang.Object r1, long r2, long r4) {
            r0 = this;
            r0.a = r1
            r0.f996c = r2
            r0.f997d = r4
            return
    }

    public boolean c() {
            r6 = this;
            long r0 = r6.f996c
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto La
            return r4
        La:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.f997d
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            long r2 = r6.f996c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1c
            return r4
        L1c:
            r0 = 0
            return r0
    }

    public java.lang.String d() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L20
            r0.<init>()     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "value"
            java.lang.String r2 = ""
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "expiredTime"
            long r2 = r4.f996c     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "cacheTime"
            long r2 = r4.f997d     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L20
            return r0
        L20:
            r0 = 0
            return r0
    }

    public java.lang.String e() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L24
            r0.<init>()     // Catch: java.lang.Exception -> L24
            java.lang.Object r1 = r4.a     // Catch: java.lang.Exception -> L24
            java.lang.Object r1 = r4.a(r1)     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = "value"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "expiredTime"
            long r2 = r4.f996c     // Catch: java.lang.Exception -> L24
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "cacheTime"
            long r2 = r4.f997d     // Catch: java.lang.Exception -> L24
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L24
            return r0
        L24:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CacheValue{value="
            r0.append(r1)
            java.lang.Object r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", expiredTime="
            r0.append(r1)
            long r1 = r3.f996c
            r0.append(r1)
            java.lang.String r1 = ", cacheTime="
            r0.append(r1)
            long r1 = r3.f997d
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
