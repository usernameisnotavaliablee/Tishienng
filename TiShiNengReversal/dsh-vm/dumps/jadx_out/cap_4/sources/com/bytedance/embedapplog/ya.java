package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ya implements java.lang.Cloneable {
    private static final java.text.SimpleDateFormat vl = null;
    public java.lang.String ae;
    public long cw;
    public int g;
    long j;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f2122m;
    public int oq;
    java.lang.String qv;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f2123r;
    public java.lang.String tl;
    public long up;
    public long xt;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            com.bytedance.embedapplog.ya.vl = r0
            return
    }

    public ya() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.j(r0)
            return
    }

    public static com.bytedance.embedapplog.ya j(java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> r3 = com.bytedance.embedapplog.sm.xt     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "k_cls"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L1e
            com.bytedance.embedapplog.ya r3 = (com.bytedance.embedapplog.ya) r3     // Catch: java.lang.Throwable -> L1e
            com.bytedance.embedapplog.ya r3 = r3.ae()     // Catch: java.lang.Throwable -> L1e
            com.bytedance.embedapplog.ya r3 = r3.xt(r0)     // Catch: java.lang.Throwable -> L1e
            return r3
        L1e:
            r3 = move-exception
            com.bytedance.embedapplog.uc.xt(r3)
            r3 = 0
            return r3
    }

    public static java.lang.String xt(long r2) {
            java.text.SimpleDateFormat r0 = com.bytedance.embedapplog.ya.vl
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            java.lang.String r2 = r0.format(r1)
            return r2
    }

    public com.bytedance.embedapplog.ya ae() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.bytedance.embedapplog.ya r0 = (com.bytedance.embedapplog.ya) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)
            r0 = 0
            return r0
    }

    public /* synthetic */ java.lang.Object clone() {
            r1 = this;
            com.bytedance.embedapplog.ya r0 = r1.ae()
            return r0
    }

    final java.lang.String cw() {
            r4 = this;
            java.util.List r0 = r4.j()
            if (r0 == 0) goto L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 128(0x80, float:1.8E-43)
            r1.<init>(r2)
            java.lang.String r2 = "create table if not exists "
            r1.append(r2)
            java.lang.String r2 = r4.r()
            r1.append(r2)
            java.lang.String r2 = "("
            r1.append(r2)
            r2 = 0
        L1f:
            int r3 = r0.size()
            if (r2 >= r3) goto L46
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            int r3 = r2 + 1
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = ","
            r1.append(r3)
            int r2 = r2 + 2
            goto L1f
        L46:
            int r0 = r1.length()
            int r0 = r0 + (-1)
            int r2 = r1.length()
            r1.delete(r0, r2)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L5d:
            r0 = 0
            return r0
    }

    protected java.lang.String g() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int j(@androidx.annotation.NonNull android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            long r0 = r3.getLong(r0)
            r2.j = r0
            r0 = 1
            long r0 = r3.getLong(r0)
            r2.xt = r0
            r0 = 2
            long r0 = r3.getLong(r0)
            r2.cw = r0
            r0 = 3
            int r0 = r3.getInt(r0)
            r2.g = r0
            r0 = 4
            long r0 = r3.getLong(r0)
            r2.up = r0
            r0 = 5
            java.lang.String r0 = r3.getString(r0)
            r2.f2123r = r0
            r0 = 6
            java.lang.String r0 = r3.getString(r0)
            r2.f2122m = r0
            r0 = 7
            java.lang.String r0 = r3.getString(r0)
            r2.ae = r0
            r0 = 8
            java.lang.String r0 = r3.getString(r0)
            r2.tl = r0
            r0 = 9
            int r3 = r3.getInt(r0)
            r2.oq = r3
            r3 = 10
            return r3
    }

    protected java.util.List<java.lang.String> j() {
            r21 = this;
            java.lang.String r19 = "event_type"
            java.lang.String r20 = "integer"
            java.lang.String r1 = "_id"
            java.lang.String r2 = "integer primary key autoincrement"
            java.lang.String r3 = "local_time_ms"
            java.lang.String r4 = "integer"
            java.lang.String r5 = "tea_event_index"
            java.lang.String r6 = "integer"
            java.lang.String r7 = "nt"
            java.lang.String r8 = "integer"
            java.lang.String r9 = "user_id"
            java.lang.String r10 = "integer"
            java.lang.String r11 = "session_id"
            java.lang.String r12 = "varchar"
            java.lang.String r13 = "user_unique_id"
            java.lang.String r14 = "varchar"
            java.lang.String r15 = "ssid"
            java.lang.String r16 = "varchar"
            java.lang.String r17 = "ab_sdk_version"
            java.lang.String r18 = "varchar"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public void j(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            long r4 = java.lang.System.currentTimeMillis()
        La:
            r3.xt = r4
            return
    }

    protected void j(@androidx.annotation.NonNull android.content.ContentValues r3) {
            r2 = this;
            long r0 = r2.xt
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "local_time_ms"
            r3.put(r1, r0)
            long r0 = r2.cw
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "tea_event_index"
            r3.put(r1, r0)
            int r0 = r2.g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "nt"
            r3.put(r1, r0)
            long r0 = r2.up
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "user_id"
            r3.put(r1, r0)
            java.lang.String r0 = "session_id"
            java.lang.String r1 = r2.f2123r
            r3.put(r0, r1)
            java.lang.String r0 = "user_unique_id"
            java.lang.String r1 = r2.f2122m
            r3.put(r0, r1)
            java.lang.String r0 = "ssid"
            java.lang.String r1 = r2.ae
            r3.put(r0, r1)
            java.lang.String r0 = "ab_sdk_version"
            java.lang.String r1 = r2.tl
            r3.put(r0, r1)
            int r0 = r2.oq
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "event_type"
            r3.put(r1, r0)
            return
    }

    protected void j(@androidx.annotation.NonNull org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "local_time_ms"
            long r1 = r3.xt
            r4.put(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    public final org.json.JSONObject m() {
            r2 = this;
            long r0 = r2.xt     // Catch: org.json.JSONException -> Ld
            java.lang.String r0 = xt(r0)     // Catch: org.json.JSONException -> Ld
            r2.qv = r0     // Catch: org.json.JSONException -> Ld
            org.json.JSONObject r0 = r2.xt()     // Catch: org.json.JSONException -> Ld
            return r0
        Ld:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    abstract java.lang.String r();

    protected java.lang.String tl() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sid:"
            r0.<init>(r1)
            java.lang.String r1 = r2.f2123r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.r()
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r2 = ", "
            if (r1 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L2e:
            java.lang.String r1 = r5.f2123r
            java.lang.String r3 = "-"
            if (r1 == 0) goto L40
            int r3 = r1.indexOf(r3)
            if (r3 < 0) goto L3f
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r3)
        L3f:
            r3 = r1
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "{"
            r1.<init>(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.tl()
            r1.append(r0)
            r1.append(r2)
            r1.append(r3)
            r1.append(r2)
            long r2 = r5.xt
            r1.append(r2)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @androidx.annotation.NonNull
    public final org.json.JSONObject up() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "k_cls"
            java.lang.String r2 = r3.r()     // Catch: org.json.JSONException -> L12
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L12
            r3.j(r0)     // Catch: org.json.JSONException -> L12
            return r0
        L12:
            r1 = move-exception
            com.bytedance.embedapplog.uc.xt(r1)
            return r0
    }

    final android.content.ContentValues xt(@androidx.annotation.Nullable android.content.ContentValues r1) {
            r0 = this;
            if (r1 != 0) goto L8
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            goto Lb
        L8:
            r1.clear()
        Lb:
            r0.j(r1)
            return r1
    }

    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r6) {
            r5 = this;
            java.lang.String r0 = "local_time_ms"
            r1 = 0
            long r3 = r6.optLong(r0, r1)
            r5.xt = r3
            r5.j = r1
            r5.cw = r1
            r6 = 0
            r5.g = r6
            r5.up = r1
            r6 = 0
            r5.f2123r = r6
            r5.f2122m = r6
            r5.ae = r6
            r5.tl = r6
            return r5
    }

    protected abstract org.json.JSONObject xt();
}
