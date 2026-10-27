package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e {
    public android.content.SharedPreferences a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.SharedPreferences f5991b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.SharedPreferences.Editor f5992c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences.Editor f5993d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.SharedPreferences f5994e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.SharedPreferences.Editor f5995f;

    /* renamed from: g, reason: collision with root package name */
    private android.content.Context f5996g;

    public e(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.f5996g = r3     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "leroadliantiancfg"
            r1 = 4
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L31
            r2.a = r0     // Catch: java.lang.Throwable -> L31
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L31
            r2.f5992c = r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "leroadcfg"
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L31
            r2.f5991b = r0     // Catch: java.lang.Throwable -> L31
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L31
            r2.f5993d = r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "reliantian_po_rt"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L31
            r2.f5994e = r3     // Catch: java.lang.Throwable -> L31
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L31
            r2.f5995f = r3     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r3 = move-exception
            r3.getMessage()
            com.baidu.liantian.b.b()
            return
    }

    public final int a(int r3, int r4) {
            r2 = this;
            if (r3 == 0) goto Lb
            r0 = 1
            if (r3 == r0) goto L8
            java.lang.String r3 = ""
            goto Ld
        L8:
            java.lang.String r3 = "suetfite"
            goto Ld
        Lb:
            java.lang.String r3 = "sustfits"
        Ld:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L15
            r3 = -1
            return r3
        L15:
            android.content.SharedPreferences r0 = r2.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r4 = 0
            int r3 = r0.getInt(r3, r4)
            return r3
    }

    public final void a(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "wi_fa_pu_ap"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void a(int r3, int r4, int r5) {
            r2 = this;
            if (r3 == 0) goto Lb
            r0 = 1
            if (r3 == r0) goto L8
            java.lang.String r3 = ""
            goto Ld
        L8:
            java.lang.String r3 = "suetfite"
            goto Ld
        Lb:
            java.lang.String r3 = "sustfits"
        Ld:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L14
            return
        L14:
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.putInt(r3, r5)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void a(long r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "npuct"
            r0.putLong(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void a(com.baidu.liantian.rp.a.a r5) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.f5994e
            java.lang.String r1 = ""
            java.lang.String r2 = "re_con"
            java.lang.String r0 = r0.getString(r2, r1)
            android.content.SharedPreferences$Editor r1 = r4.f5995f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "||"
            r3.append(r0)
            java.lang.String r5 = com.baidu.liantian.rp.a.a.a(r5)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.putString(r2, r5)
            android.content.SharedPreferences$Editor r5 = r4.f5995f
            r5.commit()
            return
    }

    public final void a(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "ses_ic"
            r0.putString(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void a(java.lang.String r4, long r5) {
            r3 = this;
            com.baidu.liantian.b.a()
            com.baidu.liantian.ac.F r0 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "MzAyMTIxMDJkaWN1ZGlhYg=="
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch: java.lang.Throwable -> L2e
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L2e
            byte[] r4 = r0.ae(r4, r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r2)     // Catch: java.lang.Throwable -> L2e
            android.content.SharedPreferences$Editor r0 = r3.f5992c     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "lsl"
            r0.putString(r1, r4)     // Catch: java.lang.Throwable -> L2e
            android.content.SharedPreferences$Editor r4 = r3.f5992c     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "lslt"
            r4.putLong(r0, r5)     // Catch: java.lang.Throwable -> L2e
            android.content.SharedPreferences$Editor r4 = r3.f5992c     // Catch: java.lang.Throwable -> L2e
            r4.commit()     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            com.baidu.liantian.b.e.a()
            return
    }

    public final void a(java.util.List<java.lang.Integer> r5) {
            r4 = this;
            int r0 = r5.size()
            java.lang.String r1 = "glspk"
            if (r0 != 0) goto L10
            android.content.SharedPreferences$Editor r5 = r4.f5992c
            java.lang.String r0 = ""
            r5.putString(r1, r0)
            goto L3c
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
        L16:
            int r3 = r5.size()
            if (r2 >= r3) goto L33
            java.lang.Object r3 = r5.get(r2)
            r0.append(r3)
            int r3 = r5.size()
            int r3 = r3 + (-1)
            if (r2 == r3) goto L30
            java.lang.String r3 = "-"
            r0.append(r3)
        L30:
            int r2 = r2 + 1
            goto L16
        L33:
            android.content.SharedPreferences$Editor r5 = r4.f5992c
            java.lang.String r0 = r0.toString()
            r5.putString(r1, r0)
        L3c:
            android.content.SharedPreferences$Editor r5 = r4.f5992c
            r5.commit()
            return
    }

    public final void a(int... r5) {
            r4 = this;
            int r0 = r5.length
            java.lang.String r1 = "hcpk"
            if (r0 != 0) goto Ld
            android.content.SharedPreferences$Editor r5 = r4.f5992c
            java.lang.String r0 = ""
            r5.putString(r1, r0)
            goto L31
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
        L13:
            int r3 = r5.length
            if (r2 >= r3) goto L28
            r3 = r5[r2]
            r0.append(r3)
            int r3 = r5.length
            int r3 = r3 + (-1)
            if (r2 == r3) goto L25
            java.lang.String r3 = "-"
            r0.append(r3)
        L25:
            int r2 = r2 + 1
            goto L13
        L28:
            android.content.SharedPreferences$Editor r5 = r4.f5992c
            java.lang.String r0 = r0.toString()
            r5.putString(r1, r0)
        L31:
            android.content.SharedPreferences$Editor r5 = r4.f5992c
            r5.commit()
            return
    }

    public final boolean a() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "iio"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public final java.lang.String b() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "svi_n"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public final java.lang.String b(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f5994e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "al_da"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r4 = r0.getString(r4, r1)
            return r4
    }

    public final void b(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "mo_fa_pu_ap"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void b(long r7) {
            r6 = this;
            java.lang.String r0 = "_"
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "pdcgts"
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 != 0) goto L17
            android.content.SharedPreferences$Editor r7 = r6.f5992c     // Catch: java.lang.Throwable -> L56
            r7.putString(r4, r3)     // Catch: java.lang.Throwable -> L56
            android.content.SharedPreferences$Editor r7 = r6.f5992c     // Catch: java.lang.Throwable -> L56
            r7.commit()     // Catch: java.lang.Throwable -> L56
            return
        L17:
            android.content.SharedPreferences r1 = r6.a     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r1.getString(r4, r3)     // Catch: java.lang.Throwable -> L56
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L28
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L56
            goto L48
        L28:
            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Throwable -> L56
            int r2 = r2.length     // Catch: java.lang.Throwable -> L56
            r3 = 20
            if (r2 < r3) goto L32
            return
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L56
            r2.append(r1)     // Catch: java.lang.Throwable -> L56
            r2.append(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L56
            r2.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L56
        L48:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L56
            android.content.SharedPreferences$Editor r8 = r6.f5992c     // Catch: java.lang.Throwable -> L56
            r8.putString(r4, r7)     // Catch: java.lang.Throwable -> L56
            android.content.SharedPreferences$Editor r7 = r6.f5992c     // Catch: java.lang.Throwable -> L56
            r7.commit()     // Catch: java.lang.Throwable -> L56
            return
        L56:
            com.baidu.liantian.b.e.a()
            return
    }

    public final java.lang.String c() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "ses_ic"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public final void c(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "mo_ae_fa_ct"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void c(long r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "slruct"
            r0.putLong(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void d(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "rtqe"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void d(long r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5995f
            java.lang.String r1 = "re_last_ofline_time"
            r0.putLong(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5995f
            r3.commit()
            return
    }

    public final boolean d() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "bka"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public final java.lang.String e() {
            r6 = this;
            java.lang.String r0 = ""
            com.baidu.liantian.ac.F r1 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "MzAyMTIxMDJkaWN1ZGlhYg=="
            r3 = 0
            byte[] r2 = android.util.Base64.decode(r2, r3)     // Catch: java.lang.Throwable -> L26
            android.content.SharedPreferences r4 = r6.a     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "lsl"
            java.lang.String r4 = r4.getString(r5, r0)     // Catch: java.lang.Throwable -> L26
            byte[] r3 = android.util.Base64.decode(r4, r3)     // Catch: java.lang.Throwable -> L26
            byte[] r1 = r1.ad(r3, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L26
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L26
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L26
            return r2
        L26:
            return r0
    }

    public final void e(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "pdcg"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void e(long r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5995f
            java.lang.String r1 = "re_day_len"
            r0.putLong(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5995f
            r3.commit()
            return
    }

    public final long f() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.a
            java.lang.String r1 = "lslt"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public final void f(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "sustfd"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final void f(long r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5995f
            java.lang.String r1 = "re_day_b_t"
            r0.putLong(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5995f
            r3.commit()
            return
    }

    public final void g() {
            r4 = this;
            android.content.SharedPreferences$Editor r0 = r4.f5992c
            java.lang.String r1 = "pu_ap_fd"
            long r2 = java.lang.System.currentTimeMillis()
            r0.putLong(r1, r2)
            android.content.SharedPreferences$Editor r0 = r4.f5992c
            r0.commit()
            return
    }

    public final void g(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5992c
            java.lang.String r1 = "sufzfd"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5992c
            r3.commit()
            return
    }

    public final int h() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "wi_fa_pu_ap"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final void h(int r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f5995f
            java.lang.String r1 = "g_r_d_d_n"
            r0.putInt(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.f5995f
            r3.commit()
            return
    }

    public final int i() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "mo_fa_pu_ap"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final void j() {
            r4 = this;
            android.content.SharedPreferences$Editor r0 = r4.f5992c
            java.lang.String r1 = "pu_cl_fd"
            long r2 = java.lang.System.currentTimeMillis()
            r0.putLong(r1, r2)
            android.content.SharedPreferences$Editor r0 = r4.f5992c
            r0.commit()
            return
    }

    public final void k() {
            r4 = this;
            android.content.SharedPreferences$Editor r0 = r4.f5992c
            java.lang.String r1 = "se_ae_fd"
            long r2 = java.lang.System.currentTimeMillis()
            r0.putLong(r1, r2)
            android.content.SharedPreferences$Editor r0 = r4.f5992c
            r0.commit()
            return
    }

    public final int l() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "wi_fa_pu_cl"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final int m() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "mo_fa_pu_cl"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final int n() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "mo_ae_fa_ct"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final boolean o() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "hac"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public final java.util.List<java.lang.Integer> p() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.SharedPreferences r1 = r4.a
            java.lang.String r2 = "hcpk"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3c
            java.lang.String r2 = "-"
            java.lang.String[] r1 = r1.split(r2)
            if (r1 == 0) goto L3c
            int r2 = r1.length
            if (r2 <= 0) goto L3c
            r2 = 0
        L21:
            int r3 = r1.length
            if (r2 >= r3) goto L3c
            r3 = r1[r2]     // Catch: java.lang.NumberFormatException -> L32
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L32
            r0.add(r3)     // Catch: java.lang.NumberFormatException -> L32
            goto L39
        L32:
            r3 = move-exception
            r3.getMessage()
            com.baidu.liantian.b.b()
        L39:
            int r2 = r2 + 1
            goto L21
        L3c:
            return r0
    }

    public final java.util.List<java.lang.Integer> q() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.SharedPreferences r1 = r4.a
            java.lang.String r2 = "glspk"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3c
            java.lang.String r2 = "-"
            java.lang.String[] r1 = r1.split(r2)
            if (r1 == 0) goto L3c
            int r2 = r1.length
            if (r2 <= 0) goto L3c
            r2 = 0
        L21:
            int r3 = r1.length
            if (r2 >= r3) goto L3c
            r3 = r1[r2]     // Catch: java.lang.NumberFormatException -> L32
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L32
            r0.add(r3)     // Catch: java.lang.NumberFormatException -> L32
            goto L39
        L32:
            r3 = move-exception
            r3.getMessage()
            com.baidu.liantian.b.b()
        L39:
            int r2 = r2 + 1
            goto L21
        L3c:
            return r0
    }

    public final int r() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "rtqe"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final void s() {
            r3 = this;
            android.content.SharedPreferences$Editor r0 = r3.f5992c
            java.lang.String r1 = "lpcf"
            r2 = 1
            r0.putBoolean(r1, r2)
            android.content.SharedPreferences$Editor r0 = r3.f5992c
            r0.commit()
            return
    }

    public final int t() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "pdcg"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final int u() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "sustfd"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final int v() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "sufzfd"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final java.util.List<com.baidu.liantian.rp.a.a> w() {
            r6 = this;
            android.content.SharedPreferences r0 = r6.f5994e
            java.lang.String r1 = "re_con"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L12
            r0 = 0
            return r0
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "\\|\\|"
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            r3 = 0
        L1f:
            if (r3 >= r2) goto L35
            r4 = r0[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L32
            com.baidu.liantian.rp.a.a r4 = com.baidu.liantian.rp.a.a.a(r4)
            if (r4 == 0) goto L32
            r1.add(r4)
        L32:
            int r3 = r3 + 1
            goto L1f
        L35:
            return r1
    }

    public final int x() {
            r5 = this;
            android.content.Context r0 = r5.f5996g
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "com.baidu.BaiduMap.meizu"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "re_net_hr"
            r2 = 24
            if (r0 == 0) goto L19
            android.content.SharedPreferences r0 = r5.f5994e
            int r0 = r0.getInt(r1, r2)
            return r0
        L19:
            android.content.SharedPreferences r0 = r5.f5994e
            r3 = 3
            int r0 = r0.getInt(r1, r3)
            android.content.Context r1 = r5.f5996g     // Catch: java.lang.Throwable -> L59
            java.lang.String[] r1 = com.baidu.liantian.b.e.g(r1)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L59
            int r3 = r1.length     // Catch: java.lang.Throwable -> L59
            r4 = 2
            if (r3 != r4) goto L59
            r3 = 0
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L59
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L59
            r4 = 1
            r4 = r1[r4]     // Catch: java.lang.Throwable -> L59
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L59
            java.lang.String r4 = "200080"
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L59
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L59
            java.lang.String r1 = "com.baidu.BaiduMap"
            android.content.Context r3 = r5.f5996g     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L59
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L59
            if (r0 >= r2) goto L59
            return r2
        L59:
            return r0
    }

    public final int y() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f5994e
            java.lang.String r1 = "up_nu_li"
            r2 = 100
            int r0 = r0.getInt(r1, r2)
            return r0
    }
}
