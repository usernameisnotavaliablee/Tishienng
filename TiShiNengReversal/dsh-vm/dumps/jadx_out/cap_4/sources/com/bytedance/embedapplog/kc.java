package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class kc extends com.bytedance.embedapplog.ya {
    public java.lang.String av;
    public java.lang.String az;
    public java.lang.String i;
    public java.lang.String jy;
    public java.lang.String kt;
    public int mi;
    public long vl;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f2084w;
    public java.lang.String ws;

    public kc() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.json.JSONObject vl() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "page_key"
            java.lang.String r2 = r4.ws
            r0.put(r1, r2)
            java.lang.String r1 = "refer_page_key"
            java.lang.String r2 = r4.jy
            r0.put(r1, r2)
            java.lang.String r1 = "is_back"
            int r2 = r4.mi
            r0.put(r1, r2)
            java.lang.String r1 = "duration"
            long r2 = r4.vl
            r0.put(r1, r2)
            java.lang.String r1 = "page_title"
            java.lang.String r2 = r4.az
            r0.put(r1, r2)
            java.lang.String r1 = "refer_page_title"
            java.lang.String r2 = r4.av
            r0.put(r1, r2)
            java.lang.String r1 = "page_path"
            java.lang.String r2 = r4.i
            r0.put(r1, r2)
            java.lang.String r1 = "referrer_page_path"
            java.lang.String r2 = r4.f2084w
            r0.put(r1, r2)
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    public int j(@androidx.annotation.NonNull android.database.Cursor r5) {
            r4 = this;
            int r0 = super.j(r5)
            int r1 = r0 + 1
            java.lang.String r2 = r5.getString(r0)
            r4.ws = r2
            int r2 = r0 + 2
            java.lang.String r1 = r5.getString(r1)
            r4.jy = r1
            int r1 = r0 + 3
            long r2 = r5.getLong(r2)
            r4.vl = r2
            int r2 = r0 + 4
            int r1 = r5.getInt(r1)
            r4.mi = r1
            int r1 = r0 + 5
            java.lang.String r2 = r5.getString(r2)
            r4.kt = r2
            int r2 = r0 + 6
            java.lang.String r1 = r5.getString(r1)
            r4.az = r1
            int r1 = r0 + 7
            java.lang.String r2 = r5.getString(r2)
            r4.av = r2
            int r2 = r0 + 8
            java.lang.String r1 = r5.getString(r1)
            r4.i = r1
            int r0 = r0 + 9
            java.lang.String r5 = r5.getString(r2)
            r4.f2084w = r5
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.util.List<java.lang.String> j() {
            r21 = this;
            java.util.List r0 = super.j()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r1.addAll(r0)
            java.lang.String r19 = "referrer_page_path"
            java.lang.String r20 = "varchar"
            java.lang.String r3 = "page_key"
            java.lang.String r4 = "varchar"
            java.lang.String r5 = "refer_page_key"
            java.lang.String r6 = "varchar"
            java.lang.String r7 = "duration"
            java.lang.String r8 = "integer"
            java.lang.String r9 = "is_back"
            java.lang.String r10 = "integer"
            java.lang.String r11 = "last_session"
            java.lang.String r12 = "varchar"
            java.lang.String r13 = "page_title"
            java.lang.String r14 = "varchar"
            java.lang.String r15 = "refer_page_title"
            java.lang.String r16 = "varchar"
            java.lang.String r17 = "page_path"
            java.lang.String r18 = "varchar"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            return r1
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull android.content.ContentValues r3) {
            r2 = this;
            super.j(r3)
            java.lang.String r0 = "page_key"
            java.lang.String r1 = r2.ws
            r3.put(r0, r1)
            java.lang.String r0 = "refer_page_key"
            java.lang.String r1 = r2.jy
            r3.put(r0, r1)
            long r0 = r2.vl
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "duration"
            r3.put(r1, r0)
            int r0 = r2.mi
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "is_back"
            r3.put(r1, r0)
            java.lang.String r0 = "last_session"
            java.lang.String r1 = r2.kt
            r3.put(r0, r1)
            java.lang.String r0 = "page_title"
            java.lang.String r1 = r2.az
            r3.put(r0, r1)
            java.lang.String r0 = "refer_page_title"
            java.lang.String r1 = r2.av
            r3.put(r0, r1)
            java.lang.String r0 = "page_path"
            java.lang.String r1 = r2.i
            r3.put(r0, r1)
            java.lang.String r0 = "referrer_page_path"
            java.lang.String r1 = r2.f2084w
            r3.put(r0, r1)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull org.json.JSONObject r4) {
            r3 = this;
            super.j(r4)
            java.lang.String r0 = "page_key"
            java.lang.String r1 = r3.ws
            r4.put(r0, r1)
            java.lang.String r0 = "refer_page_key"
            java.lang.String r1 = r3.jy
            r4.put(r0, r1)
            java.lang.String r0 = "duration"
            long r1 = r3.vl
            r4.put(r0, r1)
            java.lang.String r0 = "is_back"
            int r1 = r3.mi
            r4.put(r0, r1)
            java.lang.String r0 = "page_title"
            java.lang.String r1 = r3.az
            r4.put(r0, r1)
            java.lang.String r0 = "refer_page_title"
            java.lang.String r1 = r3.av
            r4.put(r0, r1)
            java.lang.String r0 = "page_path"
            java.lang.String r1 = r3.i
            r4.put(r0, r1)
            java.lang.String r0 = "referrer_page_path"
            java.lang.String r1 = r3.f2084w
            r4.put(r0, r1)
            return
    }

    public boolean oq() {
            r5 = this;
            long r0 = r5.vl
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean qv() {
            r2 = this;
            java.lang.String r0 = r2.ws
            java.lang.String r1 = ":"
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    @androidx.annotation.NonNull
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "page"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String tl() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.ws
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r1 = r3.vl
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r5) {
            r4 = this;
            super.xt(r5)
            java.lang.String r0 = "page_key"
            r1 = 0
            java.lang.String r0 = r5.optString(r0, r1)
            r4.ws = r0
            java.lang.String r0 = "refer_page_key"
            java.lang.String r0 = r5.optString(r0, r1)
            r4.jy = r0
            java.lang.String r0 = "duration"
            r2 = 0
            long r2 = r5.optLong(r0, r2)
            r4.vl = r2
            java.lang.String r0 = "is_back"
            r2 = 0
            int r0 = r5.optInt(r0, r2)
            r4.mi = r0
            java.lang.String r0 = "page_title"
            java.lang.String r0 = r5.optString(r0, r1)
            r4.az = r0
            java.lang.String r0 = "refer_page_title"
            java.lang.String r0 = r5.optString(r0, r1)
            r4.av = r0
            java.lang.String r0 = "page_path"
            java.lang.String r0 = r5.optString(r0, r1)
            r4.i = r0
            java.lang.String r0 = "referrer_page_path"
            java.lang.String r5 = r5.optString(r0, r1)
            r4.f2084w = r5
            return r4
    }

    @Override // com.bytedance.embedapplog.ya
    protected org.json.JSONObject xt() {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "local_time_ms"
            long r2 = r6.xt
            r0.put(r1, r2)
            java.lang.String r1 = "tea_event_index"
            long r2 = r6.cw
            r0.put(r1, r2)
            java.lang.String r1 = "session_id"
            java.lang.String r2 = r6.f2123r
            r0.put(r1, r2)
            long r1 = r6.up
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L27
            java.lang.String r3 = "user_id"
            r0.put(r3, r1)
        L27:
            java.lang.String r1 = r6.f2122m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L32
            java.lang.Object r1 = org.json.JSONObject.NULL
            goto L34
        L32:
            java.lang.String r1 = r6.f2122m
        L34:
            java.lang.String r2 = "user_unique_id"
            r0.put(r2, r1)
            java.lang.String r1 = r6.ae
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L48
            java.lang.String r1 = "ssid"
            java.lang.String r2 = r6.ae
            r0.put(r1, r2)
        L48:
            java.lang.String r1 = "event"
            java.lang.String r2 = "bav2b_page"
            r0.put(r1, r2)
            java.lang.String r1 = "is_bav"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "params"
            org.json.JSONObject r2 = r6.vl()
            r0.put(r1, r2)
            java.lang.String r1 = "datetime"
            java.lang.String r2 = r6.qv
            r0.put(r1, r2)
            return r0
    }
}
