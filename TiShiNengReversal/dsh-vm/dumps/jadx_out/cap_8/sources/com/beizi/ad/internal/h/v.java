package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class v {
    public static boolean a;
    private static java.text.SimpleDateFormat l;
    private static java.text.SimpleDateFormat m;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f6936b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f6937c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f6938d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f6939e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f6940f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6941g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f6942h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f6943i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f6944j;

    /* renamed from: k, reason: collision with root package name */
    private com.beizi.ad.internal.h.w f6945k;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ssZZZZZ"
            r0.<init>(r2, r1)
            com.beizi.ad.internal.h.v.l = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZZZZZ"
            r0.<init>(r2, r1)
            com.beizi.ad.internal.h.v.m = r0
            return
    }

    private v() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.beizi.ad.internal.h.v j(java.lang.String r22) {
            java.lang.String r0 = "monthsInYear"
            java.lang.String r1 = "weeksInMonth"
            java.lang.String r2 = "daysInYear"
            java.lang.String r3 = "daysInMonth"
            java.lang.String r4 = "daysInWeek"
            java.lang.String r5 = "exceptionDates"
            java.lang.String r6 = "expires"
            java.lang.String r7 = "interval"
            java.lang.String r8 = "frequency"
            java.lang.String r9 = "recurrence"
            java.lang.String r10 = "reminder"
            java.lang.String r11 = "freebusy"
            java.lang.String r12 = "status"
            java.lang.String r13 = "summary"
            java.lang.String r14 = "location"
            java.lang.String r15 = "description"
            r16 = r0
            java.lang.String r0 = "id"
            r17 = r1
            java.lang.String r1 = "end"
            r18 = r2
            java.lang.String r2 = "start"
            r19 = r3
            com.beizi.ad.internal.h.v r3 = new com.beizi.ad.internal.h.v
            r3.<init>()
            r20 = r4
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L213
            r21 = r5
            r5 = r22
            r4.<init>(r5)     // Catch: org.json.JSONException -> L213
            boolean r5 = r4.isNull(r0)     // Catch: org.json.JSONException -> L213
            if (r5 != 0) goto L4b
            java.lang.String r0 = r4.getString(r0)     // Catch: org.json.JSONException -> L213
            r3.a(r0)     // Catch: org.json.JSONException -> L213
        L4b:
            boolean r0 = r4.isNull(r15)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto L58
            java.lang.String r0 = r4.getString(r15)     // Catch: org.json.JSONException -> L213
            r3.b(r0)     // Catch: org.json.JSONException -> L213
        L58:
            boolean r0 = r4.isNull(r14)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto L65
            java.lang.String r0 = r4.getString(r14)     // Catch: org.json.JSONException -> L213
            r3.c(r0)     // Catch: org.json.JSONException -> L213
        L65:
            boolean r0 = r4.isNull(r13)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto L72
            java.lang.String r0 = r4.getString(r13)     // Catch: org.json.JSONException -> L213
            r3.d(r0)     // Catch: org.json.JSONException -> L213
        L72:
            boolean r0 = r4.isNull(r2)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto L7f
            java.lang.String r0 = r4.getString(r2)     // Catch: org.json.JSONException -> L213
            r3.e(r0)     // Catch: org.json.JSONException -> L213
        L7f:
            boolean r0 = r4.isNull(r1)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto L99
            boolean r0 = r4.isNull(r2)     // Catch: org.json.JSONException -> L213
            if (r0 == 0) goto L92
            java.lang.String r0 = r4.getString(r1)     // Catch: org.json.JSONException -> L213
            r3.e(r0)     // Catch: org.json.JSONException -> L213
        L92:
            java.lang.String r0 = r4.getString(r1)     // Catch: org.json.JSONException -> L213
            r3.f(r0)     // Catch: org.json.JSONException -> L213
        L99:
            boolean r0 = r4.isNull(r12)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto La6
            java.lang.String r0 = r4.getString(r12)     // Catch: org.json.JSONException -> L213
            r3.g(r0)     // Catch: org.json.JSONException -> L213
        La6:
            boolean r0 = r4.isNull(r11)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto Lb3
            java.lang.String r0 = r4.getString(r11)     // Catch: org.json.JSONException -> L213
            r3.h(r0)     // Catch: org.json.JSONException -> L213
        Lb3:
            boolean r0 = r4.isNull(r10)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto Lc0
            java.lang.String r0 = r4.getString(r10)     // Catch: org.json.JSONException -> L213
            r3.i(r0)     // Catch: org.json.JSONException -> L213
        Lc0:
            boolean r0 = r4.isNull(r9)     // Catch: org.json.JSONException -> L213
            if (r0 != 0) goto L213
            com.beizi.ad.internal.h.w r0 = new com.beizi.ad.internal.h.w     // Catch: org.json.JSONException -> L213
            r0.<init>()     // Catch: org.json.JSONException -> L213
            r3.a(r0)     // Catch: org.json.JSONException -> L213
            org.json.JSONObject r0 = r4.getJSONObject(r9)     // Catch: org.json.JSONException -> L213
            boolean r1 = r0.isNull(r8)     // Catch: org.json.JSONException -> L213
            if (r1 != 0) goto Le3
            com.beizi.ad.internal.h.w r1 = r3.i()     // Catch: org.json.JSONException -> L213
            java.lang.String r2 = r0.getString(r8)     // Catch: org.json.JSONException -> L213
            r1.a(r2)     // Catch: org.json.JSONException -> L213
        Le3:
            boolean r1 = r0.isNull(r7)     // Catch: org.json.JSONException -> L213
            if (r1 != 0) goto Lf4
            com.beizi.ad.internal.h.w r1 = r3.i()     // Catch: org.json.JSONException -> L213
            int r2 = r0.getInt(r7)     // Catch: org.json.JSONException -> L213
            r1.a(r2)     // Catch: org.json.JSONException -> L213
        Lf4:
            boolean r1 = r0.isNull(r6)     // Catch: org.json.JSONException -> L213
            if (r1 != 0) goto L105
            com.beizi.ad.internal.h.w r1 = r3.i()     // Catch: org.json.JSONException -> L213
            java.lang.String r2 = r0.getString(r6)     // Catch: org.json.JSONException -> L213
            r1.b(r2)     // Catch: org.json.JSONException -> L213
        L105:
            r1 = r21
            boolean r2 = r0.isNull(r1)     // Catch: org.json.JSONException -> L213
            r4 = 0
            if (r2 != 0) goto L133
            org.json.JSONArray r1 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L213
            int r2 = r1.length()     // Catch: org.json.JSONException -> L213
            com.beizi.ad.internal.h.w r5 = r3.i()     // Catch: org.json.JSONException -> L213
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: org.json.JSONException -> L213
            r5.a(r6)     // Catch: org.json.JSONException -> L213
            r5 = 0
        L120:
            if (r5 >= r2) goto L133
            com.beizi.ad.internal.h.w r6 = r3.i()     // Catch: org.json.JSONException -> L213
            java.lang.String[] r6 = r6.d()     // Catch: org.json.JSONException -> L213
            java.lang.String r7 = r1.getString(r5)     // Catch: org.json.JSONException -> L213
            r6[r5] = r7     // Catch: org.json.JSONException -> L213
            int r5 = r5 + 1
            goto L120
        L133:
            r1 = r20
            boolean r2 = r0.isNull(r1)     // Catch: org.json.JSONException -> L213
            if (r2 != 0) goto L160
            org.json.JSONArray r1 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L213
            int r2 = r1.length()     // Catch: org.json.JSONException -> L213
            com.beizi.ad.internal.h.w r5 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = new int[r2]     // Catch: org.json.JSONException -> L213
            r5.a(r6)     // Catch: org.json.JSONException -> L213
            r5 = 0
        L14d:
            if (r5 >= r2) goto L160
            com.beizi.ad.internal.h.w r6 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = r6.e()     // Catch: org.json.JSONException -> L213
            int r7 = r1.getInt(r5)     // Catch: org.json.JSONException -> L213
            r6[r5] = r7     // Catch: org.json.JSONException -> L213
            int r5 = r5 + 1
            goto L14d
        L160:
            r1 = r19
            boolean r2 = r0.isNull(r1)     // Catch: org.json.JSONException -> L213
            if (r2 != 0) goto L18d
            org.json.JSONArray r1 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L213
            int r2 = r1.length()     // Catch: org.json.JSONException -> L213
            com.beizi.ad.internal.h.w r5 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = new int[r2]     // Catch: org.json.JSONException -> L213
            r5.b(r6)     // Catch: org.json.JSONException -> L213
            r5 = 0
        L17a:
            if (r5 >= r2) goto L18d
            com.beizi.ad.internal.h.w r6 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = r6.f()     // Catch: org.json.JSONException -> L213
            int r7 = r1.getInt(r5)     // Catch: org.json.JSONException -> L213
            r6[r5] = r7     // Catch: org.json.JSONException -> L213
            int r5 = r5 + 1
            goto L17a
        L18d:
            r1 = r18
            boolean r2 = r0.isNull(r1)     // Catch: org.json.JSONException -> L213
            if (r2 != 0) goto L1ba
            org.json.JSONArray r1 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L213
            int r2 = r1.length()     // Catch: org.json.JSONException -> L213
            com.beizi.ad.internal.h.w r5 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = new int[r2]     // Catch: org.json.JSONException -> L213
            r5.c(r6)     // Catch: org.json.JSONException -> L213
            r5 = 0
        L1a7:
            if (r5 >= r2) goto L1ba
            com.beizi.ad.internal.h.w r6 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = r6.g()     // Catch: org.json.JSONException -> L213
            int r7 = r1.getInt(r5)     // Catch: org.json.JSONException -> L213
            r6[r5] = r7     // Catch: org.json.JSONException -> L213
            int r5 = r5 + 1
            goto L1a7
        L1ba:
            r1 = r17
            boolean r2 = r0.isNull(r1)     // Catch: org.json.JSONException -> L213
            if (r2 != 0) goto L1e7
            org.json.JSONArray r1 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L213
            int r2 = r1.length()     // Catch: org.json.JSONException -> L213
            com.beizi.ad.internal.h.w r5 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = new int[r2]     // Catch: org.json.JSONException -> L213
            r5.e(r6)     // Catch: org.json.JSONException -> L213
            r5 = 0
        L1d4:
            if (r5 >= r2) goto L1e7
            com.beizi.ad.internal.h.w r6 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r6 = r6.i()     // Catch: org.json.JSONException -> L213
            int r7 = r1.getInt(r5)     // Catch: org.json.JSONException -> L213
            r6[r5] = r7     // Catch: org.json.JSONException -> L213
            int r5 = r5 + 1
            goto L1d4
        L1e7:
            r1 = r16
            boolean r2 = r0.isNull(r1)     // Catch: org.json.JSONException -> L213
            if (r2 != 0) goto L213
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L213
            int r1 = r0.length()     // Catch: org.json.JSONException -> L213
            com.beizi.ad.internal.h.w r2 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r5 = new int[r1]     // Catch: org.json.JSONException -> L213
            r2.d(r5)     // Catch: org.json.JSONException -> L213
        L200:
            if (r4 >= r1) goto L213
            com.beizi.ad.internal.h.w r2 = r3.i()     // Catch: org.json.JSONException -> L213
            int[] r2 = r2.h()     // Catch: org.json.JSONException -> L213
            int r5 = r0.getInt(r4)     // Catch: org.json.JSONException -> L213
            r2[r4] = r5     // Catch: org.json.JSONException -> L213
            int r4 = r4 + 1
            goto L200
        L213:
            return r3
    }

    private long k(java.lang.String r3) {
            r2 = this;
            java.text.SimpleDateFormat r0 = com.beizi.ad.internal.h.v.l     // Catch: java.text.ParseException -> Lb
            java.util.Date r0 = r0.parse(r3)     // Catch: java.text.ParseException -> Lb
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> Lb
            return r0
        Lb:
            java.text.SimpleDateFormat r0 = com.beizi.ad.internal.h.v.m     // Catch: java.text.ParseException -> L16
            java.util.Date r0 = r0.parse(r3)     // Catch: java.text.ParseException -> L16
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> L16
            return r0
        L16:
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L1b
            return r0
        L1b:
            r0 = -1
            return r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f6937c
            return r0
    }

    public void a(com.beizi.ad.internal.h.w r1) {
            r0 = this;
            r0.f6945k = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f6936b = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f6938d
            return r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f6937c = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f6939e
            return r0
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.f6938d = r1
            return
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f6940f
            return r0
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.f6939e = r1
            return
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f6941g
            return r0
    }

    public void e(java.lang.String r1) {
            r0 = this;
            r0.f6940f = r1
            return
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f6942h
            return r0
    }

    public void f(java.lang.String r1) {
            r0 = this;
            r0.f6941g = r1
            return
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f6943i
            return r0
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.f6942h = r1
            return
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f6944j
            return r0
    }

    public void h(java.lang.String r1) {
            r0 = this;
            r0.f6943i = r1
            return
    }

    public com.beizi.ad.internal.h.w i() {
            r1 = this;
            com.beizi.ad.internal.h.w r0 = r1.f6945k
            return r0
    }

    public void i(java.lang.String r1) {
            r0 = this;
            r0.f6944j = r1
            return
    }

    @android.annotation.SuppressLint({"NewApi", "InlinedApi"})
    public android.content.Intent j() {
            r13 = this;
            boolean r0 = com.beizi.ad.internal.h.v.a
            java.lang.String r1 = "android.intent.action.EDIT"
            if (r0 != 0) goto L1a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1)
            java.lang.String r1 = "Y29udGVudDovL2NvbS5hbmRyb2lkLmNhbGVuZGFyL2V2ZW50cw=="
            java.lang.String r1 = com.beizi.ad.lance.a.b.b(r1)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.content.Intent r1 = r2.setData(r1)
            goto L25
        L1a:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1)
            java.lang.String r1 = "vnd.android.cursor.item/event"
            android.content.Intent r1 = r2.setType(r1)
        L25:
            java.lang.String r2 = r13.a()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto L38
            java.lang.String r2 = "title"
            java.lang.String r3 = r13.a()
            r1.putExtra(r2, r3)
        L38:
            java.lang.String r2 = r13.b()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto L4b
            java.lang.String r2 = "eventLocation"
            java.lang.String r3 = r13.b()
            r1.putExtra(r2, r3)
        L4b:
            java.lang.String r2 = r13.c()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto L5e
            java.lang.String r2 = "description"
            java.lang.String r3 = r13.c()
            r1.putExtra(r2, r3)
        L5e:
            java.lang.String r2 = r13.d()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            r3 = 0
            if (r2 != 0) goto L7b
            java.lang.String r2 = r13.d()
            long r5 = r13.k(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L7b
            java.lang.String r2 = "beginTime"
            r1.putExtra(r2, r5)
        L7b:
            java.lang.String r2 = r13.e()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto L96
            java.lang.String r2 = r13.e()
            long r5 = r13.k(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L96
            java.lang.String r2 = "endTime"
            r1.putExtra(r2, r5)
        L96:
            java.lang.String r2 = r13.f()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto Lab
            if (r0 != 0) goto Lab
            java.lang.String r2 = "eventStatus"
            java.lang.String r5 = r13.f()
            r1.putExtra(r2, r5)
        Lab:
            java.lang.String r2 = r13.g()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto Lc8
            if (r0 != 0) goto Lc8
            java.lang.String r2 = r13.g()
            java.lang.String r5 = "opaque"
            boolean r2 = r2.equals(r5)
            r2 = r2 ^ 1
            java.lang.String r5 = "visible"
            r1.putExtra(r5, r2)
        Lc8:
            java.lang.String r2 = r13.h()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto L10f
            java.lang.String r2 = r13.h()
            long r5 = r13.k(r2)
            r7 = 60000(0xea60, double:2.9644E-319)
            java.lang.String r2 = "minutes"
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto Lee
            if (r0 != 0) goto L10f
            long r5 = r5 / r7
            long r3 = java.lang.Math.abs(r5)
            r1.putExtra(r2, r3)
            goto L10f
        Lee:
            java.lang.String r9 = r13.d()
            boolean r9 = com.beizi.ad.internal.h.o.a(r9)
            if (r9 != 0) goto L10f
            if (r0 != 0) goto L10f
            java.lang.String r0 = r13.d()
            long r9 = r13.k(r0)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L10f
            long r9 = r9 - r5
            long r9 = r9 / r7
            long r3 = java.lang.Math.abs(r9)
            r1.putExtra(r2, r3)
        L10f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r0.<init>(r2)
            com.beizi.ad.internal.h.w r3 = r13.i()
            if (r3 == 0) goto L350
            com.beizi.ad.internal.h.w r3 = r13.i()
            java.lang.String r3 = r3.a()
            boolean r4 = com.beizi.ad.internal.h.o.a(r3)
            java.lang.String r5 = "weekly"
            java.lang.String r6 = "yearly"
            java.lang.String r7 = "monthly"
            if (r4 != 0) goto L162
            java.lang.String r4 = "daily"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L13e
            java.lang.String r2 = "FREQ=DAILY;"
            r0.append(r2)
            goto L161
        L13e:
            boolean r4 = r5.equals(r3)
            if (r4 == 0) goto L14a
            java.lang.String r2 = "FREQ=WEEKLY;"
            r0.append(r2)
            goto L161
        L14a:
            boolean r4 = r7.equals(r3)
            if (r4 == 0) goto L156
            java.lang.String r2 = "FREQ=MONTHLY;"
            r0.append(r2)
            goto L161
        L156:
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L162
            java.lang.String r2 = "FREQ=YEARLY;"
            r0.append(r2)
        L161:
            r2 = r3
        L162:
            com.beizi.ad.internal.h.w r3 = r13.i()
            int r3 = r3.b()
            java.lang.String r4 = ";"
            if (r3 <= 0) goto L181
            java.lang.String r3 = "INTERVAL="
            r0.append(r3)
            com.beizi.ad.internal.h.w r3 = r13.i()
            int r3 = r3.b()
            r0.append(r3)
            r0.append(r4)
        L181:
            boolean r3 = r5.equals(r2)
            r5 = 59
            r8 = 0
            if (r3 == 0) goto L1eb
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.e()
            if (r3 == 0) goto L1eb
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.e()
            int r3 = r3.length
            if (r3 <= 0) goto L1eb
            java.lang.String r3 = "BYDAY="
            r0.append(r3)
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.e()
            int r9 = r3.length
            r10 = 0
        L1ae:
            if (r10 >= r9) goto L1e2
            r11 = r3[r10]
            switch(r11) {
                case 0: goto L1da;
                case 1: goto L1d4;
                case 2: goto L1ce;
                case 3: goto L1c8;
                case 4: goto L1c2;
                case 5: goto L1bc;
                case 6: goto L1b6;
                default: goto L1b5;
            }
        L1b5:
            goto L1df
        L1b6:
            java.lang.String r11 = "SA,"
            r0.append(r11)
            goto L1df
        L1bc:
            java.lang.String r11 = "FR,"
            r0.append(r11)
            goto L1df
        L1c2:
            java.lang.String r11 = "TH,"
            r0.append(r11)
            goto L1df
        L1c8:
            java.lang.String r11 = "WE,"
            r0.append(r11)
            goto L1df
        L1ce:
            java.lang.String r11 = "TU,"
            r0.append(r11)
            goto L1df
        L1d4:
            java.lang.String r11 = "MO,"
            r0.append(r11)
            goto L1df
        L1da:
            java.lang.String r11 = "SU,"
            r0.append(r11)
        L1df:
            int r10 = r10 + 1
            goto L1ae
        L1e2:
            int r3 = r0.length()
            int r3 = r3 + (-1)
            r0.setCharAt(r3, r5)
        L1eb:
            boolean r3 = r7.equals(r2)
            java.lang.String r9 = ","
            if (r3 == 0) goto L22d
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.f()
            if (r3 == 0) goto L22d
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.f()
            int r3 = r3.length
            if (r3 <= 0) goto L22d
            java.lang.String r3 = "BYMONTHDAY="
            r0.append(r3)
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.f()
            int r10 = r3.length
            r11 = 0
        L217:
            if (r11 >= r10) goto L224
            r12 = r3[r11]
            r0.append(r12)
            r0.append(r9)
            int r11 = r11 + 1
            goto L217
        L224:
            int r3 = r0.length()
            int r3 = r3 + (-1)
            r0.setCharAt(r3, r5)
        L22d:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L26d
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.g()
            if (r3 == 0) goto L26d
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.g()
            int r3 = r3.length
            if (r3 <= 0) goto L26d
            java.lang.String r3 = "BYYEARDAY="
            r0.append(r3)
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.g()
            int r10 = r3.length
            r11 = 0
        L257:
            if (r11 >= r10) goto L264
            r12 = r3[r11]
            r0.append(r12)
            r0.append(r9)
            int r11 = r11 + 1
            goto L257
        L264:
            int r3 = r0.length()
            int r3 = r3 + (-1)
            r0.setCharAt(r3, r5)
        L26d:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L2ad
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.h()
            if (r3 == 0) goto L2ad
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.h()
            int r3 = r3.length
            if (r3 <= 0) goto L2ad
            java.lang.String r3 = "BYMONTH="
            r0.append(r3)
            com.beizi.ad.internal.h.w r3 = r13.i()
            int[] r3 = r3.h()
            int r6 = r3.length
            r10 = 0
        L297:
            if (r10 >= r6) goto L2a4
            r11 = r3[r10]
            r0.append(r11)
            r0.append(r9)
            int r10 = r10 + 1
            goto L297
        L2a4:
            int r3 = r0.length()
            int r3 = r3 + (-1)
            r0.setCharAt(r3, r5)
        L2ad:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L2ed
            com.beizi.ad.internal.h.w r2 = r13.i()
            int[] r2 = r2.i()
            if (r2 == 0) goto L2ed
            com.beizi.ad.internal.h.w r2 = r13.i()
            int[] r2 = r2.i()
            int r2 = r2.length
            if (r2 <= 0) goto L2ed
            java.lang.String r2 = "BYWEEKNO="
            r0.append(r2)
            com.beizi.ad.internal.h.w r2 = r13.i()
            int[] r2 = r2.i()
            int r3 = r2.length
            r6 = 0
        L2d7:
            if (r6 >= r3) goto L2e4
            r7 = r2[r6]
            r0.append(r7)
            r0.append(r9)
            int r6 = r6 + 1
            goto L2d7
        L2e4:
            int r2 = r0.length()
            int r2 = r2 + (-1)
            r0.setCharAt(r2, r5)
        L2ed:
            com.beizi.ad.internal.h.w r2 = r13.i()
            java.lang.String r2 = r2.c()
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 != 0) goto L30e
            java.lang.String r2 = "UNTIL="
            r0.append(r2)
            com.beizi.ad.internal.h.w r2 = r13.i()
            java.lang.String r2 = r2.c()
            r0.append(r2)
            r0.append(r4)
        L30e:
            com.beizi.ad.internal.h.w r2 = r13.i()
            java.lang.String[] r2 = r2.d()
            if (r2 == 0) goto L347
            com.beizi.ad.internal.h.w r2 = r13.i()
            java.lang.String[] r2 = r2.d()
            int r2 = r2.length
            if (r2 <= 0) goto L347
            java.lang.String r2 = "EXDATE="
            r0.append(r2)
            com.beizi.ad.internal.h.w r2 = r13.i()
            java.lang.String[] r2 = r2.d()
            int r3 = r2.length
        L331:
            if (r8 >= r3) goto L33e
            r4 = r2[r8]
            r0.append(r4)
            r0.append(r9)
            int r8 = r8 + 1
            goto L331
        L33e:
            int r2 = r0.length()
            int r2 = r2 + (-1)
            r0.setCharAt(r2, r5)
        L347:
            java.lang.String r2 = "rrule"
            java.lang.String r0 = r0.toString()
            r1.putExtra(r2, r0)
        L350:
            return r1
    }
}
