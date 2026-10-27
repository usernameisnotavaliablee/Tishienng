package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    final cn.jiguang.ab.g a;

    /* renamed from: b, reason: collision with root package name */
    int f264b;

    /* renamed from: c, reason: collision with root package name */
    long f265c;

    /* renamed from: d, reason: collision with root package name */
    long f266d;

    /* renamed from: e, reason: collision with root package name */
    int f267e;

    public d(cn.jiguang.ab.g r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static cn.jiguang.ab.d a(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r0.<init>(r4)     // Catch: org.json.JSONException -> L44
            java.lang.String r4 = "ip"
            java.lang.String r4 = r0.getString(r4)     // Catch: org.json.JSONException -> L44
            java.lang.String r2 = "port"
            int r2 = r0.getInt(r2)     // Catch: org.json.JSONException -> L44
            cn.jiguang.ab.g r3 = new cn.jiguang.ab.g     // Catch: org.json.JSONException -> L44
            r3.<init>(r4, r2)     // Catch: org.json.JSONException -> L44
            cn.jiguang.ab.d r4 = new cn.jiguang.ab.d     // Catch: org.json.JSONException -> L44
            r4.<init>(r3)     // Catch: org.json.JSONException -> L44
            java.lang.String r2 = "status"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L44
            r4.f264b = r2     // Catch: org.json.JSONException -> L44
            java.lang.String r2 = "fetch_time"
            long r2 = r0.optLong(r2)     // Catch: org.json.JSONException -> L44
            r4.f265c = r2     // Catch: org.json.JSONException -> L44
            java.lang.String r2 = "cost"
            long r2 = r0.optLong(r2)     // Catch: org.json.JSONException -> L44
            r4.f266d = r2     // Catch: org.json.JSONException -> L44
            java.lang.String r2 = "prefer"
            int r0 = r0.optInt(r2)     // Catch: org.json.JSONException -> L44
            r4.f267e = r0     // Catch: org.json.JSONException -> L44
            return r4
        L44:
            return r1
    }

    public java.lang.String a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r0.<init>()     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "ip"
            cn.jiguang.ab.g r2 = r4.a     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = r2.a     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "port"
            cn.jiguang.ab.g r2 = r4.a     // Catch: org.json.JSONException -> L38
            int r2 = r2.f270b     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "status"
            int r2 = r4.f264b     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "fetch_time"
            long r2 = r4.f265c     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "cost"
            long r2 = r4.f266d     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "prefer"
            int r2 = r4.f267e     // Catch: org.json.JSONException -> L38
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L38
            return r0
        L38:
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof cn.jiguang.ab.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cn.jiguang.ab.d r8 = (cn.jiguang.ab.d) r8
            int r1 = r7.f264b
            int r3 = r8.f264b
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r7.f265c
            long r5 = r8.f265c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1c
            return r2
        L1c:
            long r3 = r7.f266d
            long r5 = r8.f266d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L25
            return r2
        L25:
            int r1 = r7.f267e
            int r3 = r8.f267e
            if (r1 == r3) goto L2c
            return r2
        L2c:
            cn.jiguang.ab.g r1 = r7.a
            cn.jiguang.ab.g r8 = r8.a
            if (r1 == 0) goto L37
            boolean r8 = r1.equals(r8)
            return r8
        L37:
            if (r8 != 0) goto L3a
            return r0
        L3a:
            return r2
    }

    public int hashCode() {
            r6 = this;
            cn.jiguang.ab.g r0 = r6.a
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            int r1 = r6.f264b
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.f265c
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.f266d
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.f267e
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IpInfo{ipPort="
            r0.append(r1)
            cn.jiguang.ab.g r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            int r1 = r3.f264b
            r0.append(r1)
            java.lang.String r1 = ", fetchTime="
            r0.append(r1)
            long r1 = r3.f265c
            r0.append(r1)
            java.lang.String r1 = ", cost="
            r0.append(r1)
            long r1 = r3.f266d
            r0.append(r1)
            java.lang.String r1 = ", prefer="
            r0.append(r1)
            int r1 = r3.f267e
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
