package cn.jiguang.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    public static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static cn.jpush.android.service.WakedResultReceiver f1403b;


    static {
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONArray a(android.content.Context r2) {
            java.lang.String r0 = "waked_cache_v2.json"
            monitor-enter(r0)
            java.lang.String r1 = "waked_cache_v2.json"
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L13
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L13:
            java.lang.String r0 = "content"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto L27
            int r1 = r0.length()
            if (r1 != 0) goto L22
            goto L27
        L22:
            org.json.JSONArray r2 = a(r2, r0)
            return r2
        L27:
            java.lang.String r2 = "JWakedHelper"
            java.lang.String r0 = "no save data"
            cn.jiguang.w.f.c(r2, r0)
            r2 = 0
            return r2
        L30:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    public static org.json.JSONArray a(android.content.Context r25, org.json.JSONArray r26) {
            r0 = r26
            java.lang.String r1 = "_"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "JWakedHelper"
            if (r0 == 0) goto L2fb
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L78
            if (r6 > 0) goto L15
            goto L2fb
        L15:
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L78
            r6.<init>()     // Catch: java.lang.Throwable -> L78
            r8 = 0
        L1b:
            int r9 = r0.length()     // Catch: java.lang.Throwable -> L78
            java.lang.String r10 = "aat3"
            java.lang.String r11 = "itime"
            java.lang.String r12 = "type"
            java.lang.String r13 = "dead"
            java.lang.String r14 = "active"
            if (r8 >= r9) goto L179
            org.json.JSONObject r9 = r0.getJSONObject(r8)     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = r9.optString(r12)     // Catch: java.lang.Throwable -> L78
            long r15 = r9.optLong(r11)     // Catch: java.lang.Throwable -> L78
            java.util.Set r11 = r6.entrySet()     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L78
        L3f:
            boolean r17 = r11.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r17 == 0) goto L7d
            java.lang.Object r17 = r11.next()     // Catch: java.lang.Throwable -> L78
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17     // Catch: java.lang.Throwable -> L78
            java.lang.Object r18 = r17.getKey()     // Catch: java.lang.Throwable -> L78
            java.lang.Long r18 = (java.lang.Long) r18     // Catch: java.lang.Throwable -> L78
            long r18 = r18.longValue()     // Catch: java.lang.Throwable -> L78
            r20 = 1000(0x3e8, double:4.94E-321)
            r22 = r8
            long r7 = r15 * r20
            r24 = r6
            r23 = 0
            long r5 = r18 * r20
            boolean r5 = cn.jiguang.av.x.a(r7, r5)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L73
            java.lang.Object r5 = r17.getValue()     // Catch: java.lang.Throwable -> L70
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L70
            r15 = r18
            goto L85
        L70:
            r0 = move-exception
            goto L2e2
        L73:
            r8 = r22
            r6 = r24
            goto L3f
        L78:
            r0 = move-exception
            r23 = 0
            goto L2e2
        L7d:
            r24 = r6
            r22 = r8
            r23 = 0
            r5 = r23
        L85:
            if (r5 != 0) goto L8c
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
        L8c:
            java.lang.String r6 = "android_awake_target2"
            boolean r6 = r6.equals(r12)     // Catch: java.lang.Throwable -> L70
            if (r6 != 0) goto Lb4
            boolean r6 = r10.equals(r12)     // Catch: java.lang.Throwable -> L70
            if (r6 != 0) goto Lb4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = "unkown type :"
            r5.append(r6)     // Catch: java.lang.Throwable -> L70
            r5.append(r12)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.w.f.i(r4, r5)     // Catch: java.lang.Throwable -> L70
            r6 = r25
            r7 = r24
            goto L174
        Lb4:
            java.lang.String r6 = "package"
            java.lang.String r6 = r9.optString(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = "app_alive"
            boolean r7 = r9.optBoolean(r7)     // Catch: java.lang.Throwable -> L70
            if (r7 == 0) goto Lc3
            r13 = r14
        Lc3:
            java.lang.String r7 = "wake_type"
            int r7 = r9.optInt(r7)     // Catch: java.lang.Throwable -> L70
            boolean r8 = r5.containsKey(r6)     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L11b
            java.lang.Object r8 = r5.get(r6)     // Catch: java.lang.Throwable -> L70
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L70
            boolean r10 = r8.containsKey(r10)     // Catch: java.lang.Throwable -> L70
            if (r10 == 0) goto L10e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r10 = r8.get(r10)     // Catch: java.lang.Throwable -> L70
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> L70
            boolean r11 = r10.containsKey(r13)     // Catch: java.lang.Throwable -> L70
            if (r11 == 0) goto L103
            java.lang.Object r11 = r10.get(r13)     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L70
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L70
            int r11 = r11 + r2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L70
            r10.put(r13, r11)     // Catch: java.lang.Throwable -> L70
            goto L106
        L103:
            r10.put(r13, r3)     // Catch: java.lang.Throwable -> L70
        L106:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L70
            r8.put(r7, r10)     // Catch: java.lang.Throwable -> L70
            goto L117
        L10e:
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> L70
            r10.<init>()     // Catch: java.lang.Throwable -> L70
            r10.put(r13, r3)     // Catch: java.lang.Throwable -> L70
            goto L106
        L117:
            r5.put(r6, r8)     // Catch: java.lang.Throwable -> L70
            goto L132
        L11b:
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.lang.Throwable -> L70
            r8.<init>()     // Catch: java.lang.Throwable -> L70
            r8.put(r13, r3)     // Catch: java.lang.Throwable -> L70
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> L70
            r10.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L70
            r10.put(r7, r8)     // Catch: java.lang.Throwable -> L70
            r5.put(r6, r10)     // Catch: java.lang.Throwable -> L70
        L132:
            java.lang.Long r6 = java.lang.Long.valueOf(r15)     // Catch: java.lang.Throwable -> L70
            r7 = r24
            r7.put(r6, r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "jg_extras"
            java.lang.String r5 = r9.optString(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r6.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "jg_extras is :"
            r6.append(r8)     // Catch: java.lang.Throwable -> L70
            r6.append(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.w.f.c(r4, r6)     // Catch: java.lang.Throwable -> L70
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L70
            if (r6 != 0) goto L172
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "di"
            java.lang.String r5 = r6.optString(r5)     // Catch: java.lang.Throwable -> L70
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L70
            if (r6 != 0) goto L172
            r6 = r25
            a(r6, r5)     // Catch: java.lang.Throwable -> L70
            goto L174
        L172:
            r6 = r25
        L174:
            int r8 = r22 + 1
            r6 = r7
            goto L1b
        L179:
            r7 = r6
            r23 = 0
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L70
            java.util.Set r3 = r7.entrySet()     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L70
        L189:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L2da
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r6.<init>()     // Catch: java.lang.Throwable -> L70
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L70
            r7.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r8 = r5.getValue()     // Catch: java.lang.Throwable -> L70
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L70
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L70
        L1ad:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r9 == 0) goto L2ae
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r15.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "p"
            r25 = r3
            java.lang.Object r3 = r9.getKey()     // Catch: java.lang.Throwable -> L70
            r15.put(r0, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "pkg:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r3 = r9.getKey()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L70
            r0.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.w.f.c(r4, r0)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r9.getValue()     // Catch: java.lang.Throwable -> L70
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L70
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L70
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L70
        L1f6:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r9 == 0) goto L294
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> L70
            java.lang.Object r16 = r9.getKey()     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r16 = (java.lang.Integer) r16     // Catch: java.lang.Throwable -> L70
            r17 = r0
            int r0 = r16.intValue()     // Catch: java.lang.Throwable -> L70
            r16 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
            r18 = r8
            java.lang.String r8 = "type:"
            r5.append(r8)     // Catch: java.lang.Throwable -> L70
            r5.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.w.f.c(r4, r5)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r5 = r9.getValue()     // Catch: java.lang.Throwable -> L70
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r8.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = "value:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L70
            r8.append(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L70
            cn.jiguang.w.f.c(r4, r8)     // Catch: java.lang.Throwable -> L70
            boolean r8 = r5.containsKey(r14)     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L252
            java.lang.Object r8 = r5.get(r14)     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L70
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L70
            goto L253
        L252:
            r8 = 0
        L253:
            boolean r9 = r5.containsKey(r13)     // Catch: java.lang.Throwable -> L70
            if (r9 == 0) goto L264
            java.lang.Object r5 = r5.get(r13)     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L70
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L70
            goto L265
        L264:
            r5 = 0
        L265:
            int r9 = r8 + r5
            r19 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r13.<init>()     // Catch: java.lang.Throwable -> L70
            r13.append(r0)     // Catch: java.lang.Throwable -> L70
            r13.append(r1)     // Catch: java.lang.Throwable -> L70
            r13.append(r9)     // Catch: java.lang.Throwable -> L70
            r13.append(r1)     // Catch: java.lang.Throwable -> L70
            r13.append(r8)     // Catch: java.lang.Throwable -> L70
            r13.append(r1)     // Catch: java.lang.Throwable -> L70
            r13.append(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L70
            r3.put(r0)     // Catch: java.lang.Throwable -> L70
            r5 = r16
            r0 = r17
            r8 = r18
            r13 = r19
            goto L1f6
        L294:
            r16 = r5
            r18 = r8
            r19 = r13
            java.lang.String r0 = "d"
            r15.put(r0, r3)     // Catch: java.lang.Throwable -> L70
            r7.put(r15)     // Catch: java.lang.Throwable -> L70
            r3 = r25
            r0 = r26
            r5 = r16
            r8 = r18
            r13 = r19
            goto L1ad
        L2ae:
            r25 = r3
            r16 = r5
            r19 = r13
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L70
            if (r0 <= 0) goto L2d2
            java.lang.String r0 = "f"
            r6.put(r0, r7)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r16.getKey()     // Catch: java.lang.Throwable -> L70
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L70
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L70
            r6.put(r11, r7)     // Catch: java.lang.Throwable -> L70
            r6.put(r12, r10)     // Catch: java.lang.Throwable -> L70
            r2.put(r6)     // Catch: java.lang.Throwable -> L70
        L2d2:
            r3 = r25
            r0 = r26
            r13 = r19
            goto L189
        L2da:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L70
            if (r0 <= 0) goto L2e1
            return r2
        L2e1:
            return r26
        L2e2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "merge waked json failed:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.w.f.j(r4, r0)
            return r23
        L2fb:
            return r26
    }

    private static org.json.JSONObject a(java.lang.String r2, int r3, boolean r4) {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "wake_type"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "package"
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "app_alive"
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L1a
            return r0
        L1a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "packageWakedJson error:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JWakedHelper"
            cn.jiguang.w.f.i(r3, r2)
            r2 = 0
            return r2
    }

    private static void a(android.content.Context r2, int r3) {
            java.lang.String r0 = "JWakedHelper"
            if (r2 != 0) goto La
            java.lang.String r2 = "context is null,can not notify waked"
            cn.jiguang.w.f.i(r0, r2)
            return
        La:
            cn.jpush.android.service.WakedResultReceiver r1 = c(r2)
            cn.jiguang.p.g.f1403b = r1
            if (r1 != 0) goto L19
            java.lang.String r2 = "waked receiver is null"
            cn.jiguang.w.f.i(r0, r2)
            return
        L19:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "1"
            r0.put(r1, r2)
            java.lang.String r2 = "2"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            cn.jpush.android.service.WakedResultReceiver r2 = cn.jiguang.p.g.f1403b
            r2.onWakeMap(r0)
            return
    }

    public static void a(android.content.Context r2, android.os.Bundle r3, int r4) {
            java.lang.String r0 = "JWakedHelper"
            java.lang.String r1 = "executeWakedAction."
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L1a
            a(r2, r4)     // Catch: java.lang.Throwable -> L1a
            cn.jiguang.p.g$1 r1 = new cn.jiguang.p.g$1     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L1a
            cn.jiguang.z.b.a(r1)     // Catch: java.lang.Throwable -> L1a
            cn.jiguang.v.m.a(r2)     // Catch: java.lang.Throwable -> L1a
            r3 = 2
            cn.jiguang.g.a.a(r2, r3)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "executeWakedAction failed:"
            r3.append(r4)
            java.lang.String r2 = r2.getLocalizedMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.c(r0, r2)
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4) {
            if (r3 == 0) goto L7a
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L9
            goto L7a
        L9:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "di"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "di.json"
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "di.json"
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r3 = move-exception
            goto L5d
        L26:
            java.lang.String r2 = "content"
            org.json.JSONArray r2 = r1.optJSONArray(r2)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L33
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
        L33:
            r2.put(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "content"
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "di.json"
            cn.jiguang.av.i.a(r3, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "JWakedHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "save di is: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            r1.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = ", success!"
            r1.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L24
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5f:
            r3 = move-exception
            java.lang.String r4 = "JWakedHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveDId failed:"
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            cn.jiguang.w.f.i(r4, r3)
        L7a:
            return
    }

    private static boolean a(android.content.Context r4, org.json.JSONObject r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "itime"
            long r2 = cn.jiguang.d.b.b(r4)     // Catch: java.lang.Throwable -> L63
            r5.put(r1, r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "type"
            java.lang.String r1 = "aat3"
            r5.put(r4, r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "waked_cache_v2.json"
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "waked_cache_v2.json"
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r5 = move-exception
            goto L61
        L29:
            java.lang.String r2 = "content"
            org.json.JSONArray r2 = r1.optJSONArray(r2)     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
        L36:
            r2.put(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "content"
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "waked_cache_v2.json"
            cn.jiguang.av.i.a(r5, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "JWakedHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "save waked data : "
            r2.append(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            r2.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.c(r5, r1)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
            r4 = 1
            return r4
        L61:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
            throw r5     // Catch: java.lang.Throwable -> L63
        L63:
            r4 = move-exception
            java.lang.String r5 = "JWakedHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveWakedData failed:"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r5, r4)
            return r0
    }

    public static void b(android.content.Context r0) {
            java.lang.String r0 = "waked_cache_v2.json"
            cn.jiguang.av.i.d(r0)
            return
    }

    static /* synthetic */ boolean b(android.content.Context r0, android.os.Bundle r1, int r2) {
            boolean r0 = c(r0, r1, r2)
            return r0
    }

    private static cn.jpush.android.service.WakedResultReceiver c(android.content.Context r8) {
            java.lang.Class<cn.jpush.android.service.WakedResultReceiver> r0 = cn.jpush.android.service.WakedResultReceiver.class
            cn.jpush.android.service.WakedResultReceiver r1 = cn.jiguang.p.g.f1403b
            if (r1 == 0) goto L7
            return r1
        L7:
            r1 = 0
            r2 = 0
            android.content.pm.PackageInfo r8 = cn.jiguang.av.o.a(r8, r2)     // Catch: java.lang.Throwable -> L38
            if (r8 != 0) goto L10
            return r1
        L10:
            android.content.pm.ActivityInfo[] r8 = r8.receivers     // Catch: java.lang.Throwable -> L38
            int r3 = r8.length     // Catch: java.lang.Throwable -> L38
            r4 = 0
        L14:
            if (r4 >= r3) goto L53
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r5.name     // Catch: java.lang.Throwable -> L35
            java.lang.ClassLoader r7 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L35
            java.lang.Class r6 = java.lang.Class.forName(r6, r2, r7)     // Catch: java.lang.Throwable -> L35
            boolean r6 = r0.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L35
            java.lang.String r5 = r5.name     // Catch: java.lang.Throwable -> L35
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Throwable -> L35
            cn.jpush.android.service.WakedResultReceiver r5 = (cn.jpush.android.service.WakedResultReceiver) r5     // Catch: java.lang.Throwable -> L35
            return r5
        L35:
            int r4 = r4 + 1
            goto L14
        L38:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "find waked receiver throwable:"
            r0.append(r2)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "JWakedHelper"
            cn.jiguang.w.f.i(r0, r8)
        L53:
            return r1
    }

    private static boolean c(android.content.Context r5, android.os.Bundle r6, int r7) {
            java.lang.String r0 = "jg_extras"
            r1 = 0
            java.lang.String r2 = "JWakedHelper"
            if (r6 != 0) goto Ld
            java.lang.String r5 = "bundle is null,give up save"
        L9:
            cn.jiguang.w.f.i(r2, r5)
            return r1
        Ld:
            cn.jiguang.n.a r3 = cn.jiguang.p.b.b(r5)
            boolean r3 = r3.x
            if (r3 != 0) goto L18
            java.lang.String r5 = "server set do not report waked data,give up save"
            goto L9
        L18:
            java.lang.String r3 = "from_package"
            java.lang.String r3 = r6.getString(r3)     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 != 0) goto L24
            java.lang.String r3 = ""
        L24:
            boolean r4 = cn.jiguang.p.g.a
            org.json.JSONObject r7 = a(r3, r7, r4)
            r3 = 1
            cn.jiguang.p.g.a = r3
            if (r7 != 0) goto L30
            return r1
        L30:
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.Throwable -> L3e
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L57
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L3e
            goto L57
        L3e:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "save waked extras error:"
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.w.f.i(r2, r6)
        L57:
            boolean r5 = a(r5, r7)
            return r5
    }
}
