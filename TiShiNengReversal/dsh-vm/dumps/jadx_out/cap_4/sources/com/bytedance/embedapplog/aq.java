package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class aq extends com.bytedance.embedapplog.ya {
    public int az;
    long jy;
    long vl;
    java.lang.String ws;

    public aq() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.az = r0
            return
    }

    @Override // com.bytedance.embedapplog.ya
    public int j(@androidx.annotation.NonNull android.database.Cursor r1) {
            r0 = this;
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
            r1 = 0
            return r1
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.util.List<java.lang.String> j() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull android.content.ContentValues r1) {
            r0 = this;
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
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
            java.lang.String r0 = "terminate"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String tl() {
            r2 = this;
            long r0 = r2.vl
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r1) {
            r0 = this;
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
            return r0
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
            long r1 = r6.jy
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r5 = "stop_timestamp"
            r0.put(r5, r1)
            long r1 = r6.vl
            long r1 = r1 / r3
            java.lang.String r3 = "duration"
            r0.put(r3, r1)
            java.lang.String r1 = "datetime"
            java.lang.String r2 = r6.qv
            r0.put(r1, r2)
            long r1 = r6.up
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L40
            java.lang.String r3 = "user_id"
            r0.put(r3, r1)
        L40:
            java.lang.String r1 = r6.f2122m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L4b
            java.lang.Object r1 = org.json.JSONObject.NULL
            goto L4d
        L4b:
            java.lang.String r1 = r6.f2122m
        L4d:
            java.lang.String r2 = "user_unique_id"
            r0.put(r2, r1)
            java.lang.String r1 = r6.ae
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L61
            java.lang.String r1 = "ssid"
            java.lang.String r2 = r6.ae
            r0.put(r1, r2)
        L61:
            java.lang.String r1 = r6.tl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L70
            java.lang.String r1 = "ab_sdk_version"
            java.lang.String r2 = r6.tl
            r0.put(r1, r2)
        L70:
            java.lang.String r1 = r6.ws
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L8f
            java.lang.String r1 = "uuid_changed"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = r6.ws
            java.lang.String r2 = r6.f2123r
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L8f
            java.lang.String r1 = "original_session_id"
            java.lang.String r2 = r6.ws
            r0.put(r1, r2)
        L8f:
            int r1 = r6.az
            if (r1 != 0) goto La6
            java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> r1 = com.bytedance.embedapplog.sm.xt
            java.lang.String r2 = "launch"
            java.lang.Object r1 = r1.get(r2)
            com.bytedance.embedapplog.ry r1 = (com.bytedance.embedapplog.ry) r1
            if (r1 == 0) goto La6
            boolean r1 = r1.kt
            if (r1 != 0) goto La6
            r1 = 6
            r6.az = r1
        La6:
            java.lang.String r1 = "launch_from"
            int r2 = r6.az
            r0.put(r1, r2)
            return r0
    }
}
