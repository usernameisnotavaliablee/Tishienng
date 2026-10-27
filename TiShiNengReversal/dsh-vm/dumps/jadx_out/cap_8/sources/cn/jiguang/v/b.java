package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f1485b;

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Object a(android.content.Context r16) {
            r0 = r16
            java.lang.String r1 = "joad"
            java.lang.String r2 = "language"
            java.lang.String r3 = "os_version"
            r4 = 0
            if (r0 != 0) goto Lc
            return r4
        Lc:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = cn.jiguang.v.b.a     // Catch: java.lang.Throwable -> L111
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L111
            if (r6 != 0) goto L21
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = cn.jiguang.v.b.a     // Catch: java.lang.Throwable -> L21
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L21
            return r6
        L21:
            cn.jiguang.ai.a r6 = cn.jiguang.ai.a.a(r0)     // Catch: java.lang.Throwable -> L111
            java.lang.String r7 = "android_id"
            java.lang.String r8 = r6.f480i     // Catch: java.lang.Throwable -> L111
            r5.put(r7, r8)     // Catch: java.lang.Throwable -> L111
            java.lang.String r7 = "manufacturer"
            java.lang.String r8 = r6.l     // Catch: java.lang.Throwable -> L111
            r5.put(r7, r8)     // Catch: java.lang.Throwable -> L111
            java.lang.String r7 = "model"
            java.lang.String r8 = r6.f474c     // Catch: java.lang.Throwable -> L111
            r5.put(r7, r8)     // Catch: java.lang.Throwable -> L111
            java.lang.String r7 = "deviceinfo"
            java.lang.Object r0 = cn.jiguang.i.a.a(r0, r7, r4)     // Catch: java.lang.Throwable -> L111
            boolean r7 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L111
            java.lang.String r8 = "JAppListProbeHelper"
            if (r7 == 0) goto Le4
            java.lang.String r7 = "transfer dev info succeed"
            cn.jiguang.w.f.c(r8, r7)     // Catch: java.lang.Throwable -> L111
            r7 = r0
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch: java.lang.Throwable -> L111
            java.lang.String r9 = "sim_slots"
            org.json.JSONArray r7 = r7.getJSONArray(r9)     // Catch: java.lang.Throwable -> L111
            java.lang.String r9 = ""
            r10 = 0
            r11 = r9
            r12 = r11
        L59:
            int r13 = r7.length()     // Catch: java.lang.Throwable -> L111
            java.lang.String r14 = "imei1"
            if (r10 >= r13) goto L91
            org.json.JSONObject r13 = r7.getJSONObject(r10)     // Catch: java.lang.Throwable -> L111
            if (r13 != 0) goto L68
            goto L8d
        L68:
            boolean r15 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L111
            java.lang.String r4 = "imei"
            if (r15 == 0) goto L7e
            java.lang.String r11 = r13.optString(r4, r9)     // Catch: java.lang.Throwable -> L111
            boolean r4 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L111
            if (r4 != 0) goto L8d
            r5.put(r14, r11)     // Catch: java.lang.Throwable -> L111
            goto L8d
        L7e:
            java.lang.String r12 = r13.optString(r4, r9)     // Catch: java.lang.Throwable -> L111
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L111
            if (r4 != 0) goto L8d
            java.lang.String r4 = "imei2"
            r5.put(r4, r12)     // Catch: java.lang.Throwable -> L111
        L8d:
            int r10 = r10 + 1
            r4 = 0
            goto L59
        L91:
            boolean r4 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L111
            if (r4 == 0) goto La2
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L111
            if (r4 == 0) goto La2
            java.lang.String r4 = r6.p     // Catch: java.lang.Throwable -> L111
            r5.put(r14, r4)     // Catch: java.lang.Throwable -> L111
        La2:
            r4 = r0
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Throwable -> L111
            java.lang.String r4 = r4.optString(r3, r9)     // Catch: java.lang.Throwable -> L111
            r5.put(r3, r4)     // Catch: java.lang.Throwable -> L111
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = r0.optString(r2, r9)     // Catch: java.lang.Throwable -> L111
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = "ids"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r9 = r0.optString(r1, r9)     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lcf
            java.lang.String r0 = cn.jiguang.v.b.f1485b     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto Lcf
            java.lang.String r9 = cn.jiguang.v.b.f1485b     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto Ldb
            java.lang.String r9 = cn.jiguang.f.b.v()     // Catch: java.lang.Throwable -> L111
            cn.jiguang.v.b.f1485b = r9     // Catch: java.lang.Throwable -> L111
        Ldb:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L111
            if (r0 != 0) goto Le4
            r5.put(r1, r9)     // Catch: java.lang.Throwable -> L111
        Le4:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L111
            java.lang.String r1 = "{}"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto Lf3
            r4 = 0
            goto Lf7
        Lf3:
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L111
        Lf7:
            cn.jiguang.v.b.a = r4     // Catch: java.lang.Throwable -> L111
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r0.<init>()     // Catch: java.lang.Throwable -> L111
            java.lang.String r1 = "force dev info "
            r0.append(r1)     // Catch: java.lang.Throwable -> L111
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L111
            r0.append(r1)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L111
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L111
        L111:
            return r5
    }
}
