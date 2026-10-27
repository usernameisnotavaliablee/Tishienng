package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k extends com.bytedance.embedapplog.ya {

    @androidx.annotation.NonNull
    private java.lang.String jy;

    @androidx.annotation.NonNull
    private java.lang.String vl;

    public k(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull org.json.JSONObject r2) {
            r0 = this;
            r0.<init>()
            r0.jy = r1
            java.lang.String r1 = r2.toString()
            r0.vl = r1
            r1 = 0
            r0.oq = r1
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String g() {
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
            r3.vl = r2
            int r0 = r0 + 2
            java.lang.String r4 = r4.getString(r1)
            r3.jy = r4
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.util.List<java.lang.String> j() {
            r4 = this;
            java.util.List r0 = super.j()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r1.addAll(r0)
            java.lang.String r0 = "varchar"
            java.lang.String r2 = "log_type"
            java.lang.String r3 = "params"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r2, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            return r1
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull android.content.ContentValues r3) {
            r2 = this;
            super.j(r3)
            java.lang.String r0 = "params"
            java.lang.String r1 = r2.vl
            r3.put(r0, r1)
            java.lang.String r0 = "log_type"
            java.lang.String r1 = r2.jy
            r3.put(r0, r1)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull org.json.JSONObject r3) {
            r2 = this;
            super.j(r3)
            java.lang.String r0 = "params"
            java.lang.String r1 = r2.vl
            r3.put(r0, r1)
            java.lang.String r0 = "log_type"
            java.lang.String r1 = r2.jy
            r3.put(r0, r1)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    @androidx.annotation.NonNull
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "event_misc"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String tl() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "param:"
            r0.<init>(r1)
            java.lang.String r1 = r2.vl
            r0.append(r1)
            java.lang.String r1 = " logType:"
            r0.append(r1)
            java.lang.String r1 = r2.jy
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r3) {
            r2 = this;
            super.xt(r3)
            java.lang.String r0 = "params"
            r1 = 0
            java.lang.String r0 = r3.optString(r0, r1)
            r2.vl = r0
            java.lang.String r0 = "log_type"
            java.lang.String r3 = r3.optString(r0, r1)
            r2.jy = r3
            return r2
    }

    @Override // com.bytedance.embedapplog.ya
    protected org.json.JSONObject xt() {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "local_time_ms"
            long r2 = r7.xt
            r0.put(r1, r2)
            java.lang.String r1 = "tea_event_index"
            long r2 = r7.cw
            r0.put(r1, r2)
            java.lang.String r1 = "session_id"
            java.lang.String r2 = r7.f2123r
            r0.put(r1, r2)
            long r1 = r7.up
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L27
            java.lang.String r3 = "user_id"
            r0.put(r3, r1)
        L27:
            java.lang.String r1 = r7.f2122m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L32
            java.lang.Object r1 = org.json.JSONObject.NULL
            goto L34
        L32:
            java.lang.String r1 = r7.f2122m
        L34:
            java.lang.String r2 = "user_unique_id"
            r0.put(r2, r1)
            java.lang.String r1 = r7.ae
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L48
            java.lang.String r1 = "ssid"
            java.lang.String r2 = r7.ae
            r0.put(r1, r2)
        L48:
            java.lang.String r1 = "log_type"
            java.lang.String r2 = r7.jy
            r0.put(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = r7.vl     // Catch: java.lang.Exception -> L77
            r1.<init>(r2)     // Catch: java.lang.Exception -> L77
            java.util.Iterator r2 = r1.keys()     // Catch: java.lang.Exception -> L77
        L5a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L77
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L77
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L77
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Exception -> L77
            java.lang.Object r5 = r0.opt(r3)     // Catch: java.lang.Exception -> L77
            if (r5 == 0) goto L79
            java.lang.String r5 = "misc事件存在重复的key"
            r6 = 0
            com.bytedance.embedapplog.uc.xt(r5, r6)     // Catch: java.lang.Exception -> L77
            goto L79
        L77:
            r1 = move-exception
            goto L7e
        L79:
            r0.put(r3, r4)     // Catch: java.lang.Exception -> L77
            goto L5a
        L7d:
            return r0
        L7e:
            java.lang.String r2 = "解析 event misc 失败"
            com.bytedance.embedapplog.uc.cw(r2, r1)
            return r0
    }
}
