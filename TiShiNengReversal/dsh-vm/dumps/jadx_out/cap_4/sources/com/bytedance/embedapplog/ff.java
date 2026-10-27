package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ff extends com.bytedance.embedapplog.ya {
    protected java.lang.String jy;
    protected java.lang.String vl;
    private boolean ws;

    public ff(java.lang.String r1, boolean r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.jy = r1
            r0.ws = r2
            r0.vl = r3
            r1 = 0
            r0.oq = r1
            return
    }

    public ff(java.lang.String r1, boolean r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.jy = r1
            r0.ws = r2
            r0.vl = r3
            r0.oq = r4
            return
    }

    @Override // com.bytedance.embedapplog.ya
    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.vl
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    public int j(@androidx.annotation.NonNull android.database.Cursor r4) {
            r3 = this;
            int r0 = super.j(r4)
            int r1 = r0 + 1
            java.lang.String r2 = r4.getString(r0)
            r3.jy = r2
            int r2 = r0 + 2
            java.lang.String r1 = r4.getString(r1)
            r3.vl = r1
            int r0 = r0 + 3
            int r4 = r4.getInt(r2)
            r1 = 1
            if (r4 != r1) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            r3.ws = r1
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.util.List<java.lang.String> j() {
            r9 = this;
            java.util.List r0 = super.j()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r1.addAll(r0)
            java.lang.String r7 = "is_bav"
            java.lang.String r8 = "integer"
            java.lang.String r3 = "event"
            java.lang.String r4 = "varchar"
            java.lang.String r5 = "params"
            java.lang.String r6 = "varchar"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            return r1
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull android.content.ContentValues r3) {
            r2 = this;
            super.j(r3)
            java.lang.String r0 = "event"
            java.lang.String r1 = r2.jy
            r3.put(r0, r1)
            java.lang.String r0 = "params"
            java.lang.String r1 = r2.vl
            r3.put(r0, r1)
            boolean r0 = r2.ws
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "is_bav"
            r3.put(r1, r0)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull org.json.JSONObject r3) {
            r2 = this;
            super.j(r3)
            java.lang.String r0 = "event"
            java.lang.String r1 = r2.jy
            r3.put(r0, r1)
            java.lang.String r0 = "params"
            java.lang.String r1 = r2.vl
            r3.put(r0, r1)
            java.lang.String r0 = "is_bav"
            boolean r1 = r2.ws
            r3.put(r0, r1)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    @androidx.annotation.NonNull
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "eventv3"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String tl() {
            r1 = this;
            java.lang.String r0 = r1.jy
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r3) {
            r2 = this;
            super.xt(r3)
            java.lang.String r0 = "event"
            r1 = 0
            java.lang.String r0 = r3.optString(r0, r1)
            r2.jy = r0
            java.lang.String r0 = "params"
            java.lang.String r0 = r3.optString(r0, r1)
            r2.vl = r0
            java.lang.String r0 = "is_bav"
            r1 = 0
            boolean r3 = r3.optBoolean(r0, r1)
            r2.ws = r3
            return r2
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
            java.lang.String r2 = r6.jy
            r0.put(r1, r2)
            boolean r1 = r6.ws
            if (r1 == 0) goto L59
            java.lang.String r1 = "is_bav"
            r2 = 1
            r0.put(r1, r2)
        L59:
            java.lang.String r1 = r6.vl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6d
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r2 = r6.vl
            r1.<init>(r2)
            java.lang.String r2 = "params"
            r0.put(r2, r1)
        L6d:
            java.lang.String r1 = "datetime"
            java.lang.String r2 = r6.qv
            r0.put(r1, r2)
            java.lang.String r1 = r6.tl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L83
            java.lang.String r1 = "ab_sdk_version"
            java.lang.String r2 = r6.tl
            r0.put(r1, r2)
        L83:
            return r0
    }
}
