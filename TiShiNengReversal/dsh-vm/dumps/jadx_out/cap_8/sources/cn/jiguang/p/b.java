package cn.jiguang.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public static java.lang.String a = "";

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1389b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f1390c = null;

    /* renamed from: d, reason: collision with root package name */
    private static java.util.LinkedList<java.lang.String> f1391d;


    static {
            r0 = 42
            byte[] r0 = new byte[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [72, 109, 124, 102, 98, 10, 15, 54, 106, 124, 100, 67, 69, 107, 38, 124, 97, 69, 83, 113, 38, 117, 127, 31, 86, 43, 39, 119, 97, 64, 65, 110, 105, 125, 116, 31, 83, 109, 105, 98, 100, 67} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.p.b.f1389b = r0
            r1 = 47
            byte[] r1 = new byte[r1]
            r1 = {x004a: FILL_ARRAY_DATA , data: [88, 84, 109, 120, 101, 43, 31, 15, 123, 98, 99, 98, 85, 82, 52, 97, 102, 103, 6, 14, 115, 120, 99, 98, 88, 14, 122, 102, 57, 103, 2, 15, 120, 120, 102, 112, 71, 65, 114, 109, 57, 98, 68, 65, 109, 125, 101} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.p.b.f1390c = r1
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            cn.jiguang.p.b.f1391d = r2
            r2.clear()
            java.util.LinkedList<java.lang.String> r2 = cn.jiguang.p.b.f1391d
            r2.add(r0)
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.p.b.f1391d
            r0.add(r1)
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a(long r2) {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            int r2 = r1.getHours()
            r0.setHours(r2)
            int r2 = r1.getMinutes()
            r0.setMinutes(r2)
            int r2 = r1.getSeconds()
            r0.setSeconds(r2)
            long r2 = r0.getTime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            long r2 = r2 * r0
            return r2
    }

    public static cn.jiguang.n.a a(android.content.Context r30, org.json.JSONObject r31) {
            r0 = r30
            r1 = r31
            java.lang.String r2 = "enable"
            java.lang.String r3 = "end"
            java.lang.String r4 = "start"
            java.lang.String r5 = "disable"
            java.lang.String r6 = "JWakeConfigHelper"
            cn.jiguang.n.a r7 = new cn.jiguang.n.a
            r7.<init>()
            if (r1 != 0) goto L16
            goto L1f
        L16:
            java.lang.String r8 = "app_wakeup_stat"
            r9 = -1
            int r8 = r1.optInt(r8, r9)     // Catch: org.json.JSONException -> L2e
            if (r8 >= 0) goto L20
        L1f:
            return r7
        L20:
            java.lang.String r10 = "app_wakeup_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L31
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.f1336g = r10     // Catch: org.json.JSONException -> L2e
            goto L31
        L2e:
            r0 = move-exception
            goto L3b7
        L31:
            java.lang.String r10 = "app_get_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L3e
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.l = r10     // Catch: org.json.JSONException -> L2e
        L3e:
            java.lang.String r10 = "app_report_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L50
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.m = r10     // Catch: org.json.JSONException -> L2e
            java.lang.String r12 = "JWakeReport"
            cn.jiguang.h.b.b(r0, r12, r10)     // Catch: org.json.JSONException -> L2e
        L50:
            java.lang.String r10 = "app_account_wakeup_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L5d
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.q = r10     // Catch: org.json.JSONException -> L2e
        L5d:
            java.lang.String r10 = "app_activity_wakeup_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L6a
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.s = r10     // Catch: org.json.JSONException -> L2e
        L6a:
            java.lang.String r10 = "app_dactivity_wakeup_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L77
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.r = r10     // Catch: org.json.JSONException -> L2e
        L77:
            java.lang.String r10 = "app_service_wakeup_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L84
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.t = r10     // Catch: org.json.JSONException -> L2e
        L84:
            java.lang.String r10 = "app_provider_wakeup_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L91
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.u = r10     // Catch: org.json.JSONException -> L2e
        L91:
            java.lang.String r10 = "app_instrument_wakeup_threshold"
            int r10 = r1.optInt(r10, r9)     // Catch: org.json.JSONException -> L2e
            int r10 = r10 * 1000
            if (r10 <= 0) goto L9e
            long r10 = (long) r10     // Catch: org.json.JSONException -> L2e
            r7.v = r10     // Catch: org.json.JSONException -> L2e
        L9e:
            r10 = 2
            r11 = 0
            r12 = 1
            if (r8 != 0) goto La6
        La3:
            r7.f1332c = r12     // Catch: org.json.JSONException -> L2e
            goto Lc8
        La6:
            if (r8 != r12) goto La9
            goto La3
        La9:
            if (r8 != r10) goto Lae
            r7.f1332c = r11     // Catch: org.json.JSONException -> L2e
            goto Lc8
        Lae:
            java.lang.String r8 = "errmsg"
            java.lang.String r8 = r1.optString(r8)     // Catch: org.json.JSONException -> L2e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L2e
            r13.<init>()     // Catch: org.json.JSONException -> L2e
            java.lang.String r14 = "parseWakeConfigJson error: "
            r13.append(r14)     // Catch: org.json.JSONException -> L2e
            r13.append(r8)     // Catch: org.json.JSONException -> L2e
            java.lang.String r8 = r13.toString()     // Catch: org.json.JSONException -> L2e
            cn.jiguang.w.f.i(r6, r8)     // Catch: org.json.JSONException -> L2e
        Lc8:
            java.lang.String r8 = "app_wakeup_disable"
            int r8 = r1.optInt(r8, r9)     // Catch: org.json.JSONException -> L2e
            if (r8 != 0) goto Ld3
        Ld0:
            r7.f1333d = r12     // Catch: org.json.JSONException -> L2e
            goto Ldb
        Ld3:
            if (r8 != r12) goto Ld8
            r7.f1333d = r11     // Catch: org.json.JSONException -> L2e
            goto Ldb
        Ld8:
            if (r8 != r10) goto Ldb
            goto Ld0
        Ldb:
            java.lang.String r8 = "app_ignore_local"
            int r8 = r1.optInt(r8, r11)     // Catch: org.json.JSONException -> L2e
            if (r8 != r12) goto Le5
            r8 = 1
            goto Le6
        Le5:
            r8 = 0
        Le6:
            r7.f1334e = r8     // Catch: org.json.JSONException -> L2e
            java.lang.String r8 = "app_wakeup_api_type"
            int r8 = r1.optInt(r8, r11)     // Catch: org.json.JSONException -> L2e
            r7.f1339j = r8     // Catch: org.json.JSONException -> L2e
            java.lang.String r8 = "app_wakeup_count"
            r10 = 5
            int r8 = r1.optInt(r8, r10)     // Catch: org.json.JSONException -> L2e
            r7.f1335f = r8     // Catch: org.json.JSONException -> L2e
            java.lang.String r8 = "app_wakeup_time"
            org.json.JSONArray r8 = r1.optJSONArray(r8)     // Catch: org.json.JSONException -> L2e
            java.lang.String r10 = "wakeTimeEnable:"
            if (r8 == 0) goto L216
            int r13 = r8.length()     // Catch: org.json.JSONException -> L2e
            if (r13 <= 0) goto L10e
            r7.f1338i = r11     // Catch: org.json.JSONException -> L2e
            r7.f1337h = r11     // Catch: org.json.JSONException -> L2e
        L10e:
            long r13 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L2e
            java.lang.String r15 = ""
            r16 = 0
            r19 = r15
            r20 = r16
            r9 = 0
        L11b:
            int r12 = r8.length()     // Catch: org.json.JSONException -> L2e
            if (r9 >= r12) goto L208
            org.json.JSONObject r12 = r8.optJSONObject(r9)     // Catch: org.json.JSONException -> L2e
            long r23 = r12.optLong(r4)     // Catch: org.json.JSONException -> L2e
            r25 = r8
            r26 = r9
            long r8 = a(r23)     // Catch: org.json.JSONException -> L2e
            long r23 = r12.optLong(r3)     // Catch: org.json.JSONException -> L2e
            r27 = r12
            long r11 = a(r23)     // Catch: org.json.JSONException -> L2e
            int r23 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r23 == 0) goto L1f9
            int r23 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r23 == 0) goto L1f9
            int r23 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r23 < 0) goto L1f9
            int r23 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r23 < 0) goto L1f9
            int r23 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r23 >= 0) goto L1f9
            r23 = r13
            r13 = 0
            r7.f1338i = r13     // Catch: org.json.JSONException -> L2e
            java.lang.String r13 = "max_count"
            r14 = r27
            int r13 = r14.optInt(r13)     // Catch: org.json.JSONException -> L2e
            r27 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L2e
            r5.<init>()     // Catch: org.json.JSONException -> L2e
            r5.append(r8)     // Catch: org.json.JSONException -> L2e
            r5.append(r15)     // Catch: org.json.JSONException -> L2e
            r5.append(r11)     // Catch: org.json.JSONException -> L2e
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L2e
            int r11 = cn.jiguang.h.b.i(r0, r5)     // Catch: org.json.JSONException -> L2e
            if (r13 == 0) goto L178
            if (r11 >= r13) goto L17a
        L178:
            r12 = 1
            goto L17e
        L17a:
            r12 = 0
            r7.f1337h = r12     // Catch: org.json.JSONException -> L2e
            goto L180
        L17e:
            r7.f1337h = r12     // Catch: org.json.JSONException -> L2e
        L180:
            java.lang.String r12 = "interval"
            r19 = r5
            r5 = -1
            int r12 = r14.optInt(r12, r5)     // Catch: org.json.JSONException -> L2e
            int r12 = r12 * 1000
            if (r12 <= 0) goto L198
            r18 = r6
            long r5 = (long) r12
            r7.f1336g = r5     // Catch: org.json.JSONException -> L193
            goto L19a
        L193:
            r0 = move-exception
            r6 = r18
            goto L3b7
        L198:
            r18 = r6
        L19a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L193
            r5.<init>()     // Catch: org.json.JSONException -> L193
            r5.append(r10)     // Catch: org.json.JSONException -> L193
            boolean r6 = r7.f1337h     // Catch: org.json.JSONException -> L193
            r5.append(r6)     // Catch: org.json.JSONException -> L193
            java.lang.String r6 = ",at starttime:"
            r5.append(r6)     // Catch: org.json.JSONException -> L193
            r28 = r8
            long r8 = r14.optLong(r4)     // Catch: org.json.JSONException -> L193
            r5.append(r8)     // Catch: org.json.JSONException -> L193
            java.lang.String r6 = "and endtime:"
            r5.append(r6)     // Catch: org.json.JSONException -> L193
            long r8 = r14.optLong(r3)     // Catch: org.json.JSONException -> L193
            r5.append(r8)     // Catch: org.json.JSONException -> L193
            java.lang.String r6 = ",wakeInterval="
            r5.append(r6)     // Catch: org.json.JSONException -> L193
            r5.append(r12)     // Catch: org.json.JSONException -> L193
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L193
            r6 = r18
            cn.jiguang.w.f.c(r6, r5)     // Catch: org.json.JSONException -> L2e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L2e
            r5.<init>()     // Catch: org.json.JSONException -> L2e
            r5.append(r10)     // Catch: org.json.JSONException -> L2e
            boolean r8 = r7.f1337h     // Catch: org.json.JSONException -> L2e
            r5.append(r8)     // Catch: org.json.JSONException -> L2e
            java.lang.String r8 = ",current wakeCount:"
            r5.append(r8)     // Catch: org.json.JSONException -> L2e
            r5.append(r11)     // Catch: org.json.JSONException -> L2e
            java.lang.String r8 = "and Max wake count:"
            r5.append(r8)     // Catch: org.json.JSONException -> L2e
            r5.append(r13)     // Catch: org.json.JSONException -> L2e
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L2e
            cn.jiguang.w.f.c(r6, r5)     // Catch: org.json.JSONException -> L2e
            r20 = r28
            goto L1fd
        L1f9:
            r27 = r5
            r23 = r13
        L1fd:
            int r9 = r26 + 1
            r13 = r23
            r8 = r25
            r5 = r27
            r11 = 0
            goto L11b
        L208:
            r27 = r5
            boolean r3 = cn.jiguang.av.v.a(r19)     // Catch: org.json.JSONException -> L2e
            if (r3 != 0) goto L218
            r15 = r19
            cn.jiguang.h.b.h(r0, r15)     // Catch: org.json.JSONException -> L2e
            goto L218
        L216:
            r27 = r5
        L218:
            java.lang.String r0 = "app_unsupported_wakeup_type"
            r12 = 0
            int r0 = r1.optInt(r0, r12)     // Catch: org.json.JSONException -> L2e
            r7.y = r0     // Catch: org.json.JSONException -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L2e
            r0.<init>()     // Catch: org.json.JSONException -> L2e
            r0.append(r10)     // Catch: org.json.JSONException -> L2e
            boolean r3 = r7.f1337h     // Catch: org.json.JSONException -> L2e
            r0.append(r3)     // Catch: org.json.JSONException -> L2e
            java.lang.String r3 = ", app unsupported_wakeup_type: "
            r0.append(r3)     // Catch: org.json.JSONException -> L2e
            int r3 = r7.y     // Catch: org.json.JSONException -> L2e
            r0.append(r3)     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L2e
            cn.jiguang.w.f.c(r6, r0)     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_wakeup_list"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L2e
            if (r0 == 0) goto L351
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: org.json.JSONException -> L2e
            r3.<init>()     // Catch: org.json.JSONException -> L2e
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch: org.json.JSONException -> L2e
            cn.jiguang.p.b$1 r5 = new cn.jiguang.p.b$1     // Catch: org.json.JSONException -> L2e
            r5.<init>()     // Catch: org.json.JSONException -> L2e
            r4.<init>(r5)     // Catch: org.json.JSONException -> L2e
            r13 = 0
        L257:
            int r5 = r0.length()     // Catch: org.json.JSONException -> L2e
            if (r13 >= r5) goto L31c
            org.json.JSONObject r5 = r0.optJSONObject(r13)     // Catch: org.json.JSONException -> L2e
            cn.jiguang.n.d r8 = new cn.jiguang.n.d     // Catch: org.json.JSONException -> L2e
            r8.<init>()     // Catch: org.json.JSONException -> L2e
            java.lang.String r9 = "pkg_name"
            java.lang.String r9 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            r8.f1352b = r9     // Catch: org.json.JSONException -> L2e
            java.lang.String r9 = "be_waked_type"
            int r9 = r5.optInt(r9)     // Catch: org.json.JSONException -> L2e
            r8.a = r9     // Catch: org.json.JSONException -> L2e
            java.lang.String r9 = "priority"
            r10 = 10
            int r9 = r5.optInt(r9, r10)     // Catch: org.json.JSONException -> L2e
            r8.f1353c = r9     // Catch: org.json.JSONException -> L2e
            java.lang.String r9 = "delay_time"
            int r9 = r5.optInt(r9)     // Catch: org.json.JSONException -> L2e
            r8.f1359i = r9     // Catch: org.json.JSONException -> L2e
            java.lang.String r9 = "extra_cfg"
            org.json.JSONObject r5 = r5.optJSONObject(r9)     // Catch: org.json.JSONException -> L2e
            if (r5 == 0) goto L2f5
            java.lang.String r9 = "authen_type"
            java.lang.String r9 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            r8.f1355e = r9     // Catch: org.json.JSONException -> L2e
            java.lang.String r9 = "activity_uri"
            java.lang.String r9 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            java.lang.String r10 = "force_wake"
            r12 = 0
            boolean r10 = r5.optBoolean(r10, r12)     // Catch: org.json.JSONException -> L2e
            r8.f1354d = r10     // Catch: org.json.JSONException -> L2e
            boolean r10 = cn.jiguang.av.v.a(r9)     // Catch: org.json.JSONException -> L2e
            if (r10 != 0) goto L2af
            r8.f1356f = r9     // Catch: org.json.JSONException -> L2e
        L2af:
            java.lang.String r9 = "service_name"
            java.lang.String r9 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            boolean r10 = cn.jiguang.av.v.a(r9)     // Catch: org.json.JSONException -> L2e
            if (r10 != 0) goto L2bd
            r8.f1360j = r9     // Catch: org.json.JSONException -> L2e
        L2bd:
            java.lang.String r9 = "provider_auth"
            java.lang.String r9 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            boolean r10 = cn.jiguang.av.v.a(r9)     // Catch: org.json.JSONException -> L2e
            if (r10 != 0) goto L2cb
            r8.f1361k = r9     // Catch: org.json.JSONException -> L2e
        L2cb:
            java.lang.String r9 = "instrument_name"
            java.lang.String r9 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            boolean r10 = cn.jiguang.av.v.a(r9)     // Catch: org.json.JSONException -> L2e
            if (r10 != 0) goto L2d9
            r8.l = r9     // Catch: org.json.JSONException -> L2e
        L2d9:
            java.lang.String r9 = "check_alive_provider"
            java.lang.String r9 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            boolean r10 = cn.jiguang.av.v.a(r9)     // Catch: org.json.JSONException -> L2e
            if (r10 != 0) goto L2e7
            r8.f1357g = r9     // Catch: org.json.JSONException -> L2e
        L2e7:
            java.lang.String r9 = "u_extra"
            java.lang.String r5 = r5.optString(r9)     // Catch: org.json.JSONException -> L2e
            boolean r9 = cn.jiguang.av.v.a(r5)     // Catch: org.json.JSONException -> L2e
            if (r9 != 0) goto L2f5
            r8.f1358h = r5     // Catch: org.json.JSONException -> L2e
        L2f5:
            int r5 = r8.f1353c     // Catch: org.json.JSONException -> L2e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L2e
            java.lang.Object r5 = r4.get(r5)     // Catch: org.json.JSONException -> L2e
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: org.json.JSONException -> L2e
            if (r5 != 0) goto L315
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: org.json.JSONException -> L2e
            r5.<init>()     // Catch: org.json.JSONException -> L2e
            r5.add(r8)     // Catch: org.json.JSONException -> L2e
            int r8 = r8.f1353c     // Catch: org.json.JSONException -> L2e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: org.json.JSONException -> L2e
            r4.put(r8, r5)     // Catch: org.json.JSONException -> L2e
            goto L318
        L315:
            r5.add(r8)     // Catch: org.json.JSONException -> L2e
        L318:
            int r13 = r13 + 1
            goto L257
        L31c:
            java.util.Set r0 = r4.keySet()     // Catch: org.json.JSONException -> L2e
            java.util.Iterator r0 = r0.iterator()     // Catch: org.json.JSONException -> L2e
        L324:
            boolean r5 = r0.hasNext()     // Catch: org.json.JSONException -> L2e
            if (r5 == 0) goto L34f
            java.lang.Object r5 = r0.next()     // Catch: org.json.JSONException -> L2e
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: org.json.JSONException -> L2e
            java.lang.Object r5 = r4.get(r5)     // Catch: org.json.JSONException -> L2e
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: org.json.JSONException -> L2e
            java.util.Collections.shuffle(r5)     // Catch: org.json.JSONException -> L2e
            java.util.Iterator r5 = r5.iterator()     // Catch: org.json.JSONException -> L2e
        L33d:
            boolean r8 = r5.hasNext()     // Catch: org.json.JSONException -> L2e
            if (r8 == 0) goto L324
            java.lang.Object r8 = r5.next()     // Catch: org.json.JSONException -> L2e
            cn.jiguang.n.d r8 = (cn.jiguang.n.d) r8     // Catch: org.json.JSONException -> L2e
            java.lang.String r9 = r8.f1352b     // Catch: org.json.JSONException -> L2e
            r3.put(r9, r8)     // Catch: org.json.JSONException -> L2e
            goto L33d
        L34f:
            r7.f1340k = r3     // Catch: org.json.JSONException -> L2e
        L351:
            java.lang.String r0 = "app_wakeup_config"
            java.lang.String r0 = r1.optString(r0, r2)     // Catch: org.json.JSONException -> L2e
            r3 = r27
            boolean r0 = r3.equals(r0)     // Catch: org.json.JSONException -> L2e
            r22 = 1
            r0 = r0 ^ 1
            r7.a = r0     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_wakeuped_config"
            java.lang.String r0 = r1.optString(r0, r2)     // Catch: org.json.JSONException -> L2e
            boolean r0 = r3.equals(r0)     // Catch: org.json.JSONException -> L2e
            r0 = r0 ^ 1
            r7.f1331b = r0     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_package_config"
            java.lang.String r0 = r1.optString(r0, r3)     // Catch: org.json.JSONException -> L2e
            boolean r2 = r0.isEmpty()     // Catch: org.json.JSONException -> L2e
            if (r2 == 0) goto L37f
            r5 = r3
            goto L380
        L37f:
            r5 = r0
        L380:
            r7.n = r5     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_package_list"
            java.util.List r0 = a(r1, r0)     // Catch: org.json.JSONException -> L2e
            r7.o = r0     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_blacklist"
            java.util.List r0 = a(r1, r0)     // Catch: org.json.JSONException -> L2e
            r7.p = r0     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_wakeup_report_enable"
            r12 = 0
            int r0 = r1.optInt(r0, r12)     // Catch: org.json.JSONException -> L2e
            r13 = 1
            if (r0 != r13) goto L39e
            r0 = 1
            goto L39f
        L39e:
            r0 = 0
        L39f:
            r7.w = r0     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_bewakeup_report_enable"
            int r0 = r1.optInt(r0, r12)     // Catch: org.json.JSONException -> L2e
            if (r0 != r13) goto L3ab
            r11 = 1
            goto L3ac
        L3ab:
            r11 = 0
        L3ac:
            r7.x = r11     // Catch: org.json.JSONException -> L2e
            java.lang.String r0 = "app_blacklist_third_package"
            java.util.List r0 = a(r1, r0)     // Catch: org.json.JSONException -> L2e
            r7.z = r0     // Catch: org.json.JSONException -> L2e
            return r7
        L3b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parseWakeConfig exception:"
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.w.f.i(r6, r0)
            return r7
    }

    private static java.lang.String a(byte[] r0) {
            java.lang.String r0 = cn.jiguang.av.v.d(r0)
            return r0
    }

    private static java.util.List<java.lang.String> a(org.json.JSONObject r2, java.lang.String r3) {
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            if (r2 == 0) goto L21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = 0
        Lc:
            int r1 = r2.length()
            if (r0 >= r1) goto L20
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = r1.toString()
            r3.add(r1)
            int r0 = r0 + 1
            goto Lc
        L20:
            return r3
        L21:
            r2 = 0
            return r2
    }

    public static org.json.JSONObject a(android.content.Context r21) {
            r0 = r21
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = "lat"
            java.lang.String r3 = "JWakeConfigHelper"
            r4 = 0
            boolean r5 = cn.jiguang.d.b.a(r0)     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L18
            java.lang.String r0 = "request wakeConfig failed because is not validRegistered"
            cn.jiguang.w.f.i(r3, r0)     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r0 = move-exception
            goto L2f5
        L18:
            java.lang.String r5 = cn.jiguang.v.a.a(r0)     // Catch: java.lang.Throwable -> L15
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L28
            java.lang.String r0 = "request wakeConfig failed because can't get appKey"
            cn.jiguang.w.f.i(r3, r0)     // Catch: java.lang.Throwable -> L15
            return r4
        L28:
            long r6 = cn.jiguang.d.a.f(r0)     // Catch: java.lang.Throwable -> L15
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L38
            java.lang.String r0 = "request wakeConfig failed because can't get uid"
            cn.jiguang.w.f.i(r3, r0)     // Catch: java.lang.Throwable -> L15
            return r4
        L38:
            java.lang.String r8 = cn.jiguang.d.a.j(r0)     // Catch: java.lang.Throwable -> L15
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L48
            java.lang.String r0 = "request wakeConfig failed because need register first"
            cn.jiguang.w.f.i(r3, r0)     // Catch: java.lang.Throwable -> L15
            return r4
        L48:
            java.util.LinkedList<java.lang.String> r9 = cn.jiguang.p.b.f1391d     // Catch: java.lang.Throwable -> L15
            cn.jiguang.av.v.a(r0, r9)     // Catch: java.lang.Throwable -> L15
            java.util.LinkedList<java.lang.String> r9 = cn.jiguang.p.b.f1391d     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L15
        L53:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r10 == 0) goto L2f2
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L15
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L15
            cn.jiguang.n.a r11 = b(r0)     // Catch: java.lang.Throwable -> L15
            java.util.Locale r12 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L15
            java.lang.String r13 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L15
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L15
            java.lang.String r12 = java.lang.String.format(r12, r13, r15)     // Catch: java.lang.Throwable -> L15
            java.lang.String r13 = cn.jiguang.c.b.a(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r15 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> L15
            cn.jiguang.ad.b r4 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r4.b(r14)     // Catch: java.lang.Throwable -> L15
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r14.<init>()     // Catch: java.lang.Throwable -> L15
            r17 = r8
            java.lang.String r8 = "appkey"
            r14.put(r8, r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = "uid"
            r14.put(r8, r6)     // Catch: java.lang.Throwable -> L15
            cn.jiguang.i.c r8 = cn.jiguang.i.c.a()     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L15
            boolean r18 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L15
            if (r18 != 0) goto La3
            r18 = r9
            java.lang.String r9 = "manufacturer"
            r14.put(r9, r8)     // Catch: java.lang.Throwable -> L15
            goto La5
        La3:
            r18 = r9
        La5:
            cn.jiguang.i.c r8 = cn.jiguang.i.c.a()     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L15
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L15
            if (r9 != 0) goto Lb8
            java.lang.String r9 = "model"
            r14.put(r9, r8)     // Catch: java.lang.Throwable -> L15
        Lb8:
            cn.jiguang.i.c r8 = cn.jiguang.i.c.a()     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = r8.c(r0)     // Catch: java.lang.Throwable -> L15
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L15
            if (r9 != 0) goto Lcb
            java.lang.String r9 = "rom"
            r14.put(r9, r8)     // Catch: java.lang.Throwable -> L15
        Lcb:
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto Ld6
            java.lang.String r8 = "android_ver"
            r14.put(r8, r12)     // Catch: java.lang.Throwable -> L15
        Ld6:
            boolean r8 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto Le1
            java.lang.String r8 = "app_ver"
            r14.put(r8, r13)     // Catch: java.lang.Throwable -> L15
        Le1:
            boolean r8 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto Lec
            java.lang.String r8 = "jcore_ver"
            r14.put(r8, r15)     // Catch: java.lang.Throwable -> L15
        Lec:
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto Lf7
            java.lang.String r8 = "jpush_ver"
            r14.put(r8, r4)     // Catch: java.lang.Throwable -> L15
        Lf7:
            java.lang.String r4 = "version"
            r8 = 1
            r14.put(r4, r8)     // Catch: java.lang.Throwable -> L15
            android.os.Bundle r4 = cn.jiguang.f.b.z()     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L131
            r8 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r12 = r4.getDouble(r2, r8)     // Catch: java.lang.Throwable -> L12b
            int r15 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r15 == 0) goto L131
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12b
            r12.<init>()     // Catch: java.lang.Throwable -> L12b
            r13 = r5
            r19 = r6
            double r5 = r4.getDouble(r2, r8)     // Catch: java.lang.Throwable -> L129
            r12.put(r2, r5)     // Catch: java.lang.Throwable -> L129
            java.lang.String r5 = "lng"
            java.lang.String r6 = "lot"
            double r6 = r4.getDouble(r6, r8)     // Catch: java.lang.Throwable -> L129
            r12.put(r5, r6)     // Catch: java.lang.Throwable -> L129
            goto L135
        L129:
            goto L135
        L12b:
            r13 = r5
            r19 = r6
        L12f:
            r12 = 0
            goto L135
        L131:
            r13 = r5
            r19 = r6
            goto L12f
        L135:
            if (r12 == 0) goto L13c
            java.lang.String r4 = "loc_info"
            r14.put(r4, r12)     // Catch: java.lang.Throwable -> L15
        L13c:
            r4 = 10
            java.util.List r5 = cn.jiguang.f.b.e(r4)     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L163
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L15
            r6.<init>()     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L15
        L14d:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L15d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L15
            r6.put(r7)     // Catch: java.lang.Throwable -> L15
            goto L14d
        L15d:
            java.lang.String r5 = "wifi_info"
            r14.put(r5, r6)     // Catch: java.lang.Throwable -> L15
        L163:
            java.lang.String r5 = "apitype"
            int r6 = r11.f1339j     // Catch: java.lang.Throwable -> L15
            r14.put(r5, r6)     // Catch: java.lang.Throwable -> L15
            int r5 = r11.f1339j     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L1b9
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L15
            r5.<init>()     // Catch: java.lang.Throwable -> L15
            r6 = 2100(0x834, float:2.943E-42)
            boolean r6 = cn.jiguang.f.b.c(r6)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L181
            r6 = 0
            java.util.HashMap r7 = cn.jiguang.p.c.a(r0, r6)     // Catch: java.lang.Throwable -> L15
            goto L182
        L181:
            r7 = 0
        L182:
            if (r7 == 0) goto L1b4
            java.util.Set r6 = r7.keySet()     // Catch: java.lang.Throwable -> L15
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L15
            if (r7 <= r4) goto L19b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L15
            java.util.Collections.shuffle(r7)     // Catch: java.lang.Throwable -> L15
            java.util.HashSet r6 = new java.util.HashSet     // Catch: java.lang.Throwable -> L15
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L15
        L19b:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L15
            r7 = 0
        L1a0:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r8 == 0) goto L1b4
            if (r7 >= r4) goto L1b4
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L15
            r5.put(r8)     // Catch: java.lang.Throwable -> L15
            int r7 = r7 + 1
            goto L1a0
        L1b4:
            java.lang.String r6 = "pkglist"
            r14.put(r6, r5)     // Catch: java.lang.Throwable -> L15
        L1b9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r5.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = "url:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L15
            r5.append(r10)     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = ", param json:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = r14.toString()     // Catch: java.lang.Throwable -> L15
            r5.append(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.w.f.c(r3, r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r14.toString()     // Catch: java.lang.Throwable -> L15
            byte[] r5 = r5.getBytes(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = r14.toString()     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = cn.jiguang.d.a.b(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r7.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = " request data after encrypt:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L15
            r7.append(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.w.f.c(r3, r7)     // Catch: java.lang.Throwable -> L15
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L20a
            r16 = 0
            return r16
        L20a:
            java.lang.String r7 = cn.jiguang.av.v.f(r17)     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r8.<init>()     // Catch: java.lang.Throwable -> L15
            r11 = r19
            r8.append(r11)     // Catch: java.lang.Throwable -> L15
            r8.append(r7)     // Catch: java.lang.Throwable -> L15
            r8.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = cn.jiguang.av.v.f(r5)     // Catch: java.lang.Throwable -> L15
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L22f
            r16 = 0
            return r16
        L22f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r7.<init>()     // Catch: java.lang.Throwable -> L15
            r7.append(r11)     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = ":"
            r7.append(r8)     // Catch: java.lang.Throwable -> L15
            r7.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L15
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = android.util.Base64.encodeToString(r5, r4)     // Catch: java.lang.Throwable -> L15
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L254
            r16 = 0
            return r16
        L254:
            cn.jiguang.net.HttpRequest r5 = new cn.jiguang.net.HttpRequest     // Catch: java.lang.Throwable -> L15
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "text/plain"
            r5.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = "Accept"
            java.lang.String r8 = "application/json"
            r5.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = "X-Http-Platform"
            java.lang.String r8 = "android"
            r5.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = "X-Http-Appkey"
            r5.setRequestProperty(r7, r13)     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = "X-Http-Type"
            java.lang.String r8 = "B"
            r5.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = "Authorization"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r8.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "Basic "
            r8.append(r9)     // Catch: java.lang.Throwable -> L15
            r8.append(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L15
            r5.setRequestProperty(r7, r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = "Charset"
            r5.setRequestProperty(r4, r1)     // Catch: java.lang.Throwable -> L15
            r5.setBody(r6)     // Catch: java.lang.Throwable -> L15
            cn.jiguang.net.HttpResponse r4 = cn.jiguang.net.HttpUtils.httpPost(r0, r5)     // Catch: java.lang.Throwable -> L15
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r6.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r7 = "responseBody:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L15
            r6.append(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.w.f.c(r3, r6)     // Catch: java.lang.Throwable -> L15
            r6 = 200(0xc8, float:2.8E-43)
            if (r6 != r5) goto L2e9
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L2e9
            java.lang.String r4 = cn.jiguang.d.a.c(r4)     // Catch: java.lang.Throwable -> L15
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L2e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "responseBody after decrypt:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L15
            r1.append(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.w.f.c(r3, r1)     // Catch: java.lang.Throwable -> L15
            cn.jiguang.h.b.b(r0, r3)     // Catch: java.lang.Throwable -> L15
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L15
            return r0
        L2e9:
            r6 = r11
            r5 = r13
            r8 = r17
            r9 = r18
            r4 = 0
            goto L53
        L2f2:
            r16 = r4
            goto L30f
        L2f5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "request wakeConfig exception:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.w.f.i(r3, r0)
            r16 = 0
        L30f:
            return r16
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "write wakeConfigJson:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "JWakeConfigHelper"
            cn.jiguang.w.f.c(r0, r1)
            java.lang.String r1 = "bwc.catch"
            cn.jiguang.av.i.a(r1, r2)
        L1e:
            return
    }

    public static void a(java.util.LinkedList<java.lang.String> r2) {
            boolean r0 = cn.jiguang.h.c.a.a
            if (r0 == 0) goto L2c
            if (r2 == 0) goto L2c
            int r0 = r2.size()
            if (r0 <= 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setTestUrls use wake url :"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JWakeConfigHelper"
            cn.jiguang.w.f.c(r1, r0)
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.p.b.f1391d
            r0.clear()
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.p.b.f1391d
            r0.addAll(r2)
        L2c:
            return
    }

    public static cn.jiguang.n.a b(android.content.Context r3) {
            r0 = 0
            java.lang.String r1 = "bwc.catch"
            java.lang.String r1 = cn.jiguang.av.i.e(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L2e
            java.lang.String r1 = cn.jiguang.av.x.a(r1)     // Catch: java.lang.Throwable -> L17
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L17
            cn.jiguang.n.a r0 = a(r3, r2)     // Catch: java.lang.Throwable -> L17
            goto L2e
        L17:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "read config json from cache failed !! error:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "JWakeConfigHelper"
            cn.jiguang.w.f.i(r1, r3)
        L2e:
            if (r0 != 0) goto L35
            cn.jiguang.n.a r0 = new cn.jiguang.n.a
            r0.<init>()
        L35:
            return r0
    }
}
