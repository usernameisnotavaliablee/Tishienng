package com.bytedance.j.xt.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    protected org.json.JSONObject a;

    public b() {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.a = r0
            return
    }

    public b(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static com.bytedance.j.xt.cw.b d(long r4, android.content.Context r6, @androidx.annotation.Nullable java.lang.Thread r7, @androidx.annotation.NonNull java.lang.Throwable r8) {
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 != 0) goto Lf
            long r4 = java.lang.System.currentTimeMillis()
        Lf:
            com.bytedance.j.xt.cw.b r1 = new com.bytedance.j.xt.cw.b
            r1.<init>()
            java.lang.String r2 = "isJava"
            r1.l(r2, r0)
            java.lang.String r2 = "event_type"
            java.lang.String r3 = "java_crash"
            r1.l(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "timestamp"
            r1.l(r3, r2)
            java.lang.String r2 = "data"
            java.lang.String r3 = com.bytedance.j.xt.tl.o.b(r8)
            r1.l(r2, r3)
            boolean r8 = com.bytedance.j.xt.tl.o.i(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r2 = "isOOM"
            r1.l(r2, r8)
            java.lang.String r8 = "crash_time"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.l(r8, r4)
            java.lang.String r4 = "process_name"
            java.lang.String r5 = com.bytedance.j.xt.tl.f.j(r6)
            r1.l(r4, r5)
            boolean r4 = com.bytedance.j.xt.tl.f.m(r6)
            if (r4 != 0) goto L60
            java.lang.String r4 = "remote_process"
            r1.l(r4, r0)
        L60:
            org.json.JSONObject r4 = r1.k()
            com.bytedance.j.xt.tl.f.e(r6, r4)
            if (r7 != 0) goto L6b
            r4 = 0
            goto L6f
        L6b:
            java.lang.String r4 = r7.getName()
        L6f:
            if (r4 == 0) goto L76
            java.lang.String r5 = "crash_thread_name"
            r1.l(r5, r4)
        L76:
            java.lang.String r5 = "all_thread_stacks"
            org.json.JSONObject r4 = com.bytedance.j.xt.tl.o.e(r4)
            r1.l(r5, r4)
            return r1
    }

    public com.bytedance.j.xt.cw.b a(java.util.Map<? extends java.lang.String, ? extends java.lang.String> r5) {
            r4 = this;
            if (r5 == 0) goto L2d
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)     // Catch: org.json.JSONException -> L23
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L23
            goto Lf
        L23:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            goto Lf
        L28:
            java.lang.String r5 = "filters"
            r4.l(r5, r0)
        L2d:
            return r4
    }

    public com.bytedance.j.xt.cw.b b(int r3, java.lang.String r4) {
            r2 = this;
            org.json.JSONObject r0 = r2.a     // Catch: org.json.JSONException -> Lf
            java.lang.String r1 = "miniapp_id"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> Lf
            org.json.JSONObject r3 = r2.a     // Catch: org.json.JSONException -> Lf
            java.lang.String r0 = "miniapp_version"
            r3.put(r0, r4)     // Catch: org.json.JSONException -> Lf
            return r2
        Lf:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r2
    }

    public com.bytedance.j.xt.cw.b c(long r4) {
            r3 = this;
            java.lang.String r0 = "start_time"
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L23
            r3.l(r0, r1)     // Catch: java.lang.Exception -> L23
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "yyyy_MM_dd_HH_mm_ss"
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L23
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L23
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Exception -> L23
            r1.<init>(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r4 = r0.format(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r5 = "app_start_time_readable"
            r3.l(r5, r4)     // Catch: java.lang.Exception -> L23
            return r3
        L23:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r3
    }

    public com.bytedance.j.xt.cw.b e(com.bytedance.j.xt.cw.c r2) {
            r1 = this;
            java.lang.String r0 = "header"
            org.json.JSONObject r2 = r2.e()
            r1.l(r0, r2)
            return r1
    }

    public com.bytedance.j.xt.cw.b f(com.bytedance.j.xt.up.j.h r3) {
            r2 = this;
            java.lang.String r0 = "activity_trace"
            org.json.JSONObject r1 = r3.k()
            r2.l(r0, r1)
            java.lang.String r0 = "running_tasks"
            org.json.JSONArray r3 = r3.B()
            r2.l(r0, r3)
            return r2
    }

    public com.bytedance.j.xt.cw.b g(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            java.lang.String r0 = "session_id"
            r1.l(r0, r2)
        Lb:
            return r1
    }

    public com.bytedance.j.xt.cw.b h(java.util.List<java.lang.String> r4) {
            r3 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r1 = "patch_info"
            if (r4 == 0) goto L28
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L10
            goto L28
        L10:
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r2)
            goto L14
        L24:
            r3.l(r1, r0)
            return r3
        L28:
            r3.l(r1, r0)
            return r3
    }

    public com.bytedance.j.xt.cw.b i(java.util.Map<java.lang.String, java.lang.Integer> r7) {
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r1 = "plugin_info"
            if (r7 != 0) goto Lf
            org.json.JSONObject r7 = r6.a     // Catch: java.lang.Exception -> L3f
            r7.put(r1, r0)     // Catch: java.lang.Exception -> L3f
            return r6
        Lf:
            java.util.Set r2 = r7.keySet()     // Catch: java.lang.Exception -> L3f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L3f
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L3f
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L3f
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3f
            r4.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = "package_name"
            r4.put(r5, r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = "version_code"
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Exception -> L3f
            r4.put(r5, r3)     // Catch: java.lang.Exception -> L3f
            r0.put(r4)     // Catch: java.lang.Exception -> L3f
            goto L17
        L3a:
            org.json.JSONObject r7 = r6.a     // Catch: java.lang.Exception -> L3f
            r7.put(r1, r0)     // Catch: java.lang.Exception -> L3f
        L3f:
            return r6
    }

    public com.bytedance.j.xt.cw.b j(org.json.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "storage"
            r1.l(r0, r2)
            return r1
    }

    public org.json.JSONObject k() {
            r1 = this;
            org.json.JSONObject r0 = r1.a
            return r0
    }

    public void l(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.a     // Catch: java.lang.Exception -> L6
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L6
            return
        L6:
            r2 = move-exception
            com.bytedance.j.xt.tl.i.c(r2)
            return
    }

    public com.bytedance.j.xt.cw.b m(java.util.List<java.lang.String> r3) {
            r2 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r1)
            goto L9
        L19:
            java.lang.String r3 = "logcat"
            r2.l(r3, r0)
            return r2
    }

    public com.bytedance.j.xt.cw.b n(java.util.Map<java.lang.Integer, java.lang.String> r5) {
            r4 = this;
            if (r5 == 0) goto L3e
            int r0 = r5.size()
            if (r0 <= 0) goto L3e
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch: org.json.JSONException -> L2d
            java.lang.Object r2 = r5.get(r2)     // Catch: org.json.JSONException -> L2d
            r0.put(r3, r2)     // Catch: org.json.JSONException -> L2d
            goto L15
        L2d:
            r2 = move-exception
            com.bytedance.j.xt.tl.i.c(r2)
            goto L15
        L32:
            org.json.JSONObject r5 = r4.a     // Catch: org.json.JSONException -> L3a
            java.lang.String r1 = "sdk_info"
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L3a
            goto L3e
        L3a:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L3e:
            return r4
    }
}
