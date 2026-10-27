package cn.jiguang.l;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.h.a {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private android.os.Bundle f1320b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1321c;

    /* renamed from: d, reason: collision with root package name */
    private int f1322d;

    /* renamed from: e, reason: collision with root package name */
    private int f1323e;

    /* renamed from: f, reason: collision with root package name */
    private int f1324f;

    /* renamed from: cn.jiguang.l.a$a, reason: collision with other inner class name */
    public static class C0044a {
        public C0044a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static int a(int r0, int r1, int r2) {
                r2 = r2 & 255(0xff, float:3.57E-43)
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 2
                r1 = r1 | r2
                r0 = r0 & 15
                int r0 = r0 << 6
                r0 = r0 | r1
                return r0
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f1321c = r0
            r0 = 0
            r1.f1322d = r0
            r1.f1323e = r0
            r1.f1324f = r0
            return
    }

    private org.json.JSONObject a(java.lang.String r4, int r5, int r6) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r0.<init>()     // Catch: org.json.JSONException -> L28
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L28
            r1.<init>()     // Catch: org.json.JSONException -> L28
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r2.<init>()     // Catch: org.json.JSONException -> L28
            r1.put(r5)     // Catch: org.json.JSONException -> L28
            r1.put(r6)     // Catch: org.json.JSONException -> L28
            java.lang.String r5 = "core"
            boolean r5 = r5.equals(r4)     // Catch: org.json.JSONException -> L28
            if (r5 == 0) goto L2a
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: org.json.JSONException -> L28
            r1.put(r5)     // Catch: org.json.JSONException -> L28
        L22:
            int r5 = r3.f1324f     // Catch: org.json.JSONException -> L28
            r1.put(r5)     // Catch: org.json.JSONException -> L28
            goto L3f
        L28:
            r4 = move-exception
            goto L5a
        L2a:
            java.lang.String r5 = "push"
            boolean r5 = r5.equals(r4)     // Catch: org.json.JSONException -> L28
            if (r5 == 0) goto L3a
            int r5 = cn.jiguang.d.a.c()     // Catch: org.json.JSONException -> L28
            r1.put(r5)     // Catch: org.json.JSONException -> L28
            goto L22
        L3a:
            java.lang.String r5 = "JAD"
            r5.equals(r4)     // Catch: org.json.JSONException -> L28
        L3f:
            r2.put(r4, r1)     // Catch: org.json.JSONException -> L28
            java.lang.String r4 = "type"
            java.lang.String r5 = "sdk_type"
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L28
            java.lang.String r4 = "itime"
            android.content.Context r5 = r3.a     // Catch: org.json.JSONException -> L28
            long r5 = cn.jiguang.d.b.b(r5)     // Catch: org.json.JSONException -> L28
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L28
            java.lang.String r4 = "sdk"
            r0.put(r4, r2)     // Catch: org.json.JSONException -> L28
            return r0
        L5a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "package json exception: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JType"
            cn.jiguang.w.f.i(r5, r4)
            r4 = 0
            return r4
    }

    private static boolean a(android.content.Context r6, java.lang.String r7, int r8, int r9, int r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L7d
            if (r8 < 0) goto L7d
            if (r9 >= 0) goto Lb
            goto L7d
        Lb:
            int r0 = cn.jiguang.h.b.l(r6, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[isTypeReportEnable],lastversion:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ",curversion:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ",type:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JType"
            cn.jiguang.w.f.c(r2, r1)
            r1 = 1
            if (r0 == r10) goto L39
            return r1
        L39:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            long r2 = cn.jiguang.h.b.f(r6, r10)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            r4 = 15724800000(0x3a9456800, double:7.7690834677E-314)
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L5f
            return r1
        L5f:
            java.lang.String r6 = cn.jiguang.h.b.k(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            java.lang.String r8 = ","
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            boolean r6 = r6.equals(r7)
            r6 = r6 ^ r1
            return r6
        L7d:
            r6 = 0
            return r6
    }

    public static int d() {
            java.lang.String r0 = cn.jiguang.internal.JConstants.SDK_NAME
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La
            r0 = 2
            return r0
        La:
            r0 = 0
            return r0
    }

    public static int e() {
            boolean r0 = cn.jiguang.a.a.b()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            int r0 = cn.jiguang.a.a.f237d
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT
            if (r0 == r1) goto L10
            r0 = 2
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // cn.jiguang.h.a
    protected void a(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            r0.f1320b = r2
            return
    }

    @Override // cn.jiguang.h.a
    protected java.lang.String b(android.content.Context r1) {
            r0 = this;
            r0.a = r1
            java.lang.String r1 = "JType"
            return r1
    }

    @Override // cn.jiguang.h.a
    protected boolean c() {
            r6 = this;
            android.os.Bundle r0 = r6.f1320b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "name"
            java.lang.String r0 = r0.getString(r2)
            r6.f1321c = r0
            android.os.Bundle r0 = r6.f1320b
            java.lang.String r2 = "custom"
            int r0 = r0.getInt(r2, r1)
            r6.f1322d = r0
            android.os.Bundle r0 = r6.f1320b
            java.lang.String r2 = "dynamic"
            int r0 = r0.getInt(r2, r1)
            r6.f1323e = r0
            android.os.Bundle r0 = r6.f1320b
            java.lang.String r2 = "sdk_v"
            int r0 = r0.getInt(r2, r1)
            r6.f1324f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parseBundle type:"
            r0.append(r1)
            java.lang.String r1 = r6.f1321c
            r0.append(r1)
            java.lang.String r1 = ",custom:"
            r0.append(r1)
            int r1 = r6.f1322d
            r0.append(r1)
            java.lang.String r1 = ",dynamic:"
            r0.append(r1)
            int r1 = r6.f1323e
            r0.append(r1)
            java.lang.String r1 = ",sdkVersion:"
            r0.append(r1)
            int r1 = r6.f1324f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JType"
            cn.jiguang.w.f.c(r1, r0)
            android.content.Context r0 = r6.a
            java.lang.String r2 = r6.f1321c
            int r3 = r6.f1322d
            int r4 = r6.f1323e
            int r5 = r6.f1324f
            boolean r0 = a(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "type ["
            r2.append(r3)
            java.lang.String r3 = r6.f1321c
            r2.append(r3)
            java.lang.String r3 = "] data not change"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r1, r2)
            return r0
        L8e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r6.f1322d
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            int r2 = r6.f1323e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.Context r2 = r6.a
            java.lang.String r3 = r6.f1321c
            int r4 = r6.f1324f
            cn.jiguang.h.b.b(r2, r3, r4)
            android.content.Context r2 = r6.a
            java.lang.String r3 = r6.f1321c
            cn.jiguang.h.b.a(r2, r3, r1)
            return r0
    }

    @Override // cn.jiguang.h.a
    protected void d(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // cn.jiguang.h.a
    protected void e(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r4 = r2.f1321c
            int r0 = r2.f1322d
            int r1 = r2.f1323e
            org.json.JSONObject r4 = r2.a(r4, r0, r1)
            java.lang.String r0 = "JType"
            if (r4 != 0) goto L14
            java.lang.String r3 = "there are no data to report"
            cn.jiguang.w.f.i(r0, r3)
            return
        L14:
            cn.jiguang.y.g.a(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r2.f1321c
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            cn.jiguang.h.b.e(r3, r4)
            return
    }
}
