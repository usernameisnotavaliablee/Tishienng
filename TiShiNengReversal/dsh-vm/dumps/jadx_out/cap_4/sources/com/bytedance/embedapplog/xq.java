package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xq extends com.bytedance.embedapplog.ya {
    public long av;
    public java.lang.String az;
    long i;
    public java.lang.String jy;
    public java.lang.String vl;
    public java.lang.String ws;

    xq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.az
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    public int j(@androidx.annotation.NonNull android.database.Cursor r6) {
            r5 = this;
            int r0 = super.j(r6)
            int r1 = r0 + 1
            java.lang.String r2 = r6.getString(r0)
            r5.vl = r2
            int r2 = r0 + 2
            java.lang.String r1 = r6.getString(r1)
            r5.jy = r1
            int r1 = r0 + 3
            long r2 = r6.getLong(r2)
            r5.av = r2
            int r2 = r0 + 4
            long r3 = r6.getLong(r1)
            r5.i = r3
            int r1 = r0 + 5
            java.lang.String r2 = r6.getString(r2)
            r5.az = r2
            int r0 = r0 + 6
            java.lang.String r6 = r6.getString(r1)
            r5.ws = r6
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.util.List<java.lang.String> j() {
            r15 = this;
            java.util.List r0 = super.j()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r1.addAll(r0)
            java.lang.String r13 = "label"
            java.lang.String r14 = "varchar"
            java.lang.String r3 = "category"
            java.lang.String r4 = "varchar"
            java.lang.String r5 = "tag"
            java.lang.String r6 = "varchar"
            java.lang.String r7 = "value"
            java.lang.String r8 = "integer"
            java.lang.String r9 = "ext_value"
            java.lang.String r10 = "integer"
            java.lang.String r11 = "params"
            java.lang.String r12 = "varchar"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            return r1
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull android.content.ContentValues r3) {
            r2 = this;
            super.j(r3)
            java.lang.String r0 = "category"
            java.lang.String r1 = r2.vl
            r3.put(r0, r1)
            java.lang.String r0 = "tag"
            java.lang.String r1 = r2.jy
            r3.put(r0, r1)
            long r0 = r2.av
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "value"
            r3.put(r1, r0)
            long r0 = r2.i
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "ext_value"
            r3.put(r1, r0)
            java.lang.String r0 = "params"
            java.lang.String r1 = r2.az
            r3.put(r0, r1)
            java.lang.String r0 = "label"
            java.lang.String r1 = r2.ws
            r3.put(r0, r1)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull org.json.JSONObject r4) {
            r3 = this;
            super.j(r4)
            java.lang.String r0 = "tea_event_index"
            long r1 = r3.cw
            r4.put(r0, r1)
            java.lang.String r0 = "category"
            java.lang.String r1 = r3.vl
            r4.put(r0, r1)
            java.lang.String r0 = "tag"
            java.lang.String r1 = r3.jy
            r4.put(r0, r1)
            java.lang.String r0 = "value"
            long r1 = r3.av
            r4.put(r0, r1)
            java.lang.String r0 = "ext_value"
            long r1 = r3.i
            r4.put(r0, r1)
            java.lang.String r0 = "params"
            java.lang.String r1 = r3.az
            r4.put(r0, r1)
            java.lang.String r0 = "label"
            java.lang.String r1 = r3.ws
            r4.put(r0, r1)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    @androidx.annotation.NonNull
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "event"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String tl() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.jy
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = r2.ws
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r7) {
            r6 = this;
            super.xt(r7)
            java.lang.String r0 = "tea_event_index"
            r1 = 0
            long r3 = r7.optLong(r0, r1)
            r6.cw = r3
            java.lang.String r0 = "category"
            r3 = 0
            java.lang.String r0 = r7.optString(r0, r3)
            r6.vl = r0
            java.lang.String r0 = "tag"
            java.lang.String r0 = r7.optString(r0, r3)
            r6.jy = r0
            java.lang.String r0 = "value"
            long r4 = r7.optLong(r0, r1)
            r6.av = r4
            java.lang.String r0 = "ext_value"
            long r0 = r7.optLong(r0, r1)
            r6.i = r0
            java.lang.String r0 = "params"
            java.lang.String r0 = r7.optString(r0, r3)
            r6.az = r0
            java.lang.String r0 = "label"
            java.lang.String r7 = r7.optString(r0, r3)
            r6.ws = r7
            return r6
    }

    @Override // com.bytedance.embedapplog.ya
    protected org.json.JSONObject xt() {
            r6 = this;
            java.lang.String r0 = r6.az
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = r6.az
            r0.<init>(r1)
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L18
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L18:
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
            if (r5 <= 0) goto L3a
            java.lang.String r3 = "user_id"
            r0.put(r3, r1)
        L3a:
            java.lang.String r1 = r6.f2122m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L45
            java.lang.Object r1 = org.json.JSONObject.NULL
            goto L47
        L45:
            java.lang.String r1 = r6.f2122m
        L47:
            java.lang.String r2 = "user_unique_id"
            r0.put(r2, r1)
            java.lang.String r1 = r6.ae
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "ssid"
            java.lang.String r2 = r6.ae
            r0.put(r1, r2)
        L5b:
            java.lang.String r1 = "category"
            java.lang.String r2 = r6.vl
            r0.put(r1, r2)
            java.lang.String r1 = "tag"
            java.lang.String r2 = r6.jy
            r0.put(r1, r2)
            java.lang.String r1 = "value"
            long r2 = r6.av
            r0.put(r1, r2)
            java.lang.String r1 = "ext_value"
            long r2 = r6.i
            r0.put(r1, r2)
            java.lang.String r1 = "label"
            java.lang.String r2 = r6.ws
            r0.put(r1, r2)
            java.lang.String r1 = "datetime"
            java.lang.String r2 = r6.qv
            r0.put(r1, r2)
            java.lang.String r1 = r6.tl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L94
            java.lang.String r1 = "ab_sdk_version"
            java.lang.String r2 = r6.tl
            r0.put(r1, r2)
        L94:
            return r0
    }
}
