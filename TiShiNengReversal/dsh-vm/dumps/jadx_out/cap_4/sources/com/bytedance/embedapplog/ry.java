package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ry extends com.bytedance.embedapplog.ya {
    public int av;
    public java.lang.String az;
    public java.lang.String i;
    public java.lang.String jy;
    public boolean kt;
    public boolean mi;
    public int vl;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f2098w;
    public boolean ws;

    public ry(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.kt = r1
            return
    }

    @Override // com.bytedance.embedapplog.ya
    public int j(@androidx.annotation.NonNull android.database.Cursor r4) {
            r3 = this;
            int r0 = super.j(r4)
            int r1 = r0 + 1
            java.lang.String r2 = r4.getString(r0)
            r3.jy = r2
            int r2 = r0 + 2
            int r1 = r4.getInt(r1)
            r3.vl = r1
            int r1 = r0 + 3
            java.lang.String r2 = r4.getString(r2)
            r3.az = r2
            int r2 = r0 + 4
            int r1 = r4.getInt(r1)
            r3.av = r1
            int r1 = r0 + 5
            java.lang.String r2 = r4.getString(r2)
            r3.i = r2
            int r2 = r0 + 6
            java.lang.String r1 = r4.getString(r1)
            r3.f2098w = r1
            int r0 = r0 + 7
            int r4 = r4.getInt(r2)
            if (r4 != 0) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = 0
        L3f:
            r3.mi = r4
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.util.List<java.lang.String> j() {
            r17 = this;
            java.util.List r0 = super.j()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r1.addAll(r0)
            java.lang.String r15 = "resume_from_background"
            java.lang.String r16 = "integer"
            java.lang.String r3 = "ver_name"
            java.lang.String r4 = "varchar"
            java.lang.String r5 = "ver_code"
            java.lang.String r6 = "integer"
            java.lang.String r7 = "last_session"
            java.lang.String r8 = "varchar"
            java.lang.String r9 = "is_first_time"
            java.lang.String r10 = "integer"
            java.lang.String r11 = "page_title"
            java.lang.String r12 = "varchar"
            java.lang.String r13 = "page_key"
            java.lang.String r14 = "varchar"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            return r1
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull android.content.ContentValues r3) {
            r2 = this;
            super.j(r3)
            java.lang.String r0 = "ver_name"
            java.lang.String r1 = r2.jy
            r3.put(r0, r1)
            int r0 = r2.vl
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "ver_code"
            r3.put(r1, r0)
            java.lang.String r0 = "last_session"
            java.lang.String r1 = r2.az
            r3.put(r0, r1)
            int r0 = r2.av
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "is_first_time"
            r3.put(r1, r0)
            java.lang.String r0 = "page_title"
            java.lang.String r1 = r2.i
            r3.put(r0, r1)
            java.lang.String r0 = "page_key"
            java.lang.String r1 = r2.f2098w
            r3.put(r0, r1)
            boolean r0 = r2.mi
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "resume_from_background"
            r3.put(r1, r0)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull org.json.JSONObject r1) {
            r0 = this;
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    @androidx.annotation.NonNull
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "launch"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String tl() {
            r1 = this;
            boolean r0 = r1.ws
            if (r0 == 0) goto L7
            java.lang.String r0 = "bg"
            return r0
        L7:
            java.lang.String r0 = "fg"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r1) {
            r0 = this;
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
            return r1
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
            boolean r1 = r6.ws
            java.lang.String r2 = "is_background"
            if (r1 == 0) goto L51
            r0.put(r2, r1)
        L51:
            java.lang.String r1 = "datetime"
            java.lang.String r3 = r6.qv
            r0.put(r1, r3)
            java.lang.String r1 = r6.tl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L67
            java.lang.String r1 = "ab_sdk_version"
            java.lang.String r3 = r6.tl
            r0.put(r1, r3)
        L67:
            java.lang.String r1 = r6.az
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            if (r1 != 0) goto L7c
            java.lang.String r1 = "uuid_changed"
            r0.put(r1, r3)
            java.lang.String r1 = "original_session_id"
            java.lang.String r4 = r6.az
            r0.put(r1, r4)
        L7c:
            int r1 = r6.av
            if (r1 != r3) goto L87
            java.lang.String r1 = "$is_first_time"
            java.lang.String r4 = "true"
            r0.put(r1, r4)
        L87:
            boolean r1 = r6.kt
            r1 = r1 ^ r3
            java.lang.String r4 = "$resume_from_background"
            r0.put(r4, r1)
            boolean r1 = r6.kt
            r1 = r1 ^ r3
            r0.put(r2, r1)
            return r0
    }
}
