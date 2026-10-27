package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class na {
    final java.lang.Long ae;
    final java.lang.Boolean cw;
    final java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    final java.lang.Integer f2087m;

    /* renamed from: r, reason: collision with root package name */
    final java.lang.Long f2088r;
    final java.lang.Long up;
    final java.lang.String xt;

    na(java.lang.String r1, java.lang.String r2, java.lang.Boolean r3, java.lang.Long r4, java.lang.Long r5, java.lang.Integer r6, java.lang.Long r7) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.f2088r = r4
            r0.up = r5
            r0.f2087m = r6
            r0.ae = r7
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.AnyThread
    static com.bytedance.embedapplog.na j(@androidx.annotation.Nullable java.lang.String r15) {
            java.lang.String r0 = "hw_id_version_code"
            java.lang.String r1 = "query_times"
            java.lang.String r2 = "time"
            java.lang.String r3 = "take_ms"
            java.lang.String r4 = "is_track_limited"
            boolean r5 = android.text.TextUtils.isEmpty(r15)
            r6 = 0
            if (r5 == 0) goto L12
            return r6
        L12:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L33
            r5.<init>(r15)     // Catch: org.json.JSONException -> L33
            java.lang.String r15 = "id"
            java.lang.String r8 = r5.optString(r15, r6)     // Catch: org.json.JSONException -> L33
            java.lang.String r15 = "req_id"
            java.lang.String r9 = r5.optString(r15, r6)     // Catch: org.json.JSONException -> L33
            boolean r15 = r5.has(r4)     // Catch: org.json.JSONException -> L33
            if (r15 == 0) goto L36
            boolean r15 = r5.optBoolean(r4)     // Catch: org.json.JSONException -> L33
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)     // Catch: org.json.JSONException -> L33
            r10 = r15
            goto L37
        L33:
            r0 = move-exception
            r15 = r0
            goto L84
        L36:
            r10 = r6
        L37:
            boolean r15 = r5.has(r3)     // Catch: org.json.JSONException -> L33
            r11 = -1
            if (r15 == 0) goto L48
            long r3 = r5.optLong(r3, r11)     // Catch: org.json.JSONException -> L33
            java.lang.Long r15 = java.lang.Long.valueOf(r3)     // Catch: org.json.JSONException -> L33
            goto L49
        L48:
            r15 = r6
        L49:
            boolean r3 = r5.has(r2)     // Catch: org.json.JSONException -> L33
            if (r3 == 0) goto L58
            long r2 = r5.optLong(r2, r11)     // Catch: org.json.JSONException -> L33
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L33
            goto L59
        L58:
            r2 = r6
        L59:
            boolean r3 = r5.has(r1)     // Catch: org.json.JSONException -> L33
            if (r3 == 0) goto L6a
            r3 = -1
            int r1 = r5.optInt(r1, r3)     // Catch: org.json.JSONException -> L33
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> L33
            r13 = r1
            goto L6b
        L6a:
            r13 = r6
        L6b:
            boolean r1 = r5.has(r0)     // Catch: org.json.JSONException -> L33
            if (r1 == 0) goto L7b
            long r0 = r5.optLong(r0, r11)     // Catch: org.json.JSONException -> L33
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: org.json.JSONException -> L33
            r14 = r0
            goto L7c
        L7b:
            r14 = r6
        L7c:
            com.bytedance.embedapplog.na r7 = new com.bytedance.embedapplog.na     // Catch: org.json.JSONException -> L33
            r11 = r15
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch: org.json.JSONException -> L33
            return r7
        L84:
            com.bytedance.embedapplog.uc.j(r15)
            return r6
    }

    @androidx.annotation.NonNull
    java.util.Map<java.lang.String, java.lang.String> j() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r3.j
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.String r1 = "req_id"
            java.lang.String r2 = r3.xt
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.Boolean r1 = r3.cw
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "is_track_limited"
            com.bytedance.embedapplog.wi.j(r0, r2, r1)
            java.lang.Long r1 = r3.f2088r
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "take_ms"
            com.bytedance.embedapplog.wi.j(r0, r2, r1)
            java.lang.Long r1 = r3.up
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "time"
            com.bytedance.embedapplog.wi.j(r0, r2, r1)
            java.lang.Integer r1 = r3.f2087m
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "query_times"
            com.bytedance.embedapplog.wi.j(r0, r2, r1)
            java.lang.Long r1 = r3.ae
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "hw_id_version_code"
            com.bytedance.embedapplog.wi.j(r0, r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            org.json.JSONObject r0 = r1.xt()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.NonNull
    org.json.JSONObject xt() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r3.j
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.String r1 = "req_id"
            java.lang.String r2 = r3.xt
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.String r1 = "is_track_limited"
            java.lang.Boolean r2 = r3.cw
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.String r1 = "take_ms"
            java.lang.Long r2 = r3.f2088r
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.String r1 = "time"
            java.lang.Long r2 = r3.up
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.String r1 = "query_times"
            java.lang.Integer r2 = r3.f2087m
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            java.lang.String r1 = "hw_id_version_code"
            java.lang.Long r2 = r3.ae
            com.bytedance.embedapplog.wi.j(r0, r1, r2)
            return r0
    }
}
