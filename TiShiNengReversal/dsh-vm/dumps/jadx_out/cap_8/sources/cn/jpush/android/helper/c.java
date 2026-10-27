package cn.jpush.android.helper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r8, java.lang.String r9, byte r10, java.lang.String r11) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "The msgId is not valid - "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "JPushReportHelper"
            cn.jpush.android.helper.Logger.ee(r9, r8)
            return
        L1d:
            r3 = 1000(0x3e8, double:4.94E-321)
            r7 = 0
            java.lang.String r1 = ""
            r5 = r8
            r0 = r9
            r2 = r10
            r6 = r11
            a(r0, r1, r2, r3, r5, r6, r7)
            return
    }

    public static void a(android.content.Context r0, java.lang.String r1, long r2, int r4) {
            long r2 = cn.jpush.android.helper.e.a(r4, r2)
            r4 = 0
            a(r1, r2, r4, r0)
            return
    }

    public static void a(android.content.Context r7, org.json.JSONObject r8) {
            if (r7 == 0) goto L35
            if (r8 == 0) goto L34
            int r0 = r8.length()
            if (r0 <= 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:reportOperation - content:"
            r0.append(r1)
            java.lang.String r1 = r8.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JPushReportHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            java.lang.String r2 = "JPUSH"
            r3 = 14
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
        L34:
            return
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "NULL context"
            r7.<init>(r8)
            throw r7
    }

    public static void a(java.lang.String r1, long r2, android.content.Context r4) {
            r0 = 0
            a(r1, r2, r0, r4)
            return
    }

    public static void a(java.lang.String r6, long r7, java.lang.String r9, android.content.Context r10) {
            java.lang.String r0 = "msg_status"
            java.lang.String r1 = "JPushReportHelper"
            if (r10 != 0) goto Lc
            java.lang.String r6 = "context did not init, return"
            cn.jpush.android.helper.Logger.d(r1, r6)
            return
        Lc:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "action:reportActionResult - messageId: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ", code: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = "-"
            r3.append(r4)
            java.lang.String r4 = cn.jpush.android.helper.e.a(r7)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "， report content: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
        L54:
            java.lang.String r3 = cn.jpush.android.d.d.c(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L73
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "， report jData:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
        L73:
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r1, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "msg_id"
            r2.put(r4, r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = "result"
            r2.put(r6, r7)     // Catch: java.lang.Throwable -> Lc2
            boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lc2
            if (r6 != 0) goto L94
            java.lang.String r6 = "data"
            r2.put(r6, r9)     // Catch: java.lang.Throwable -> Lc2
        L94:
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r6 != 0) goto L9f
            java.lang.String r6 = "_j_data_"
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> Lc2
        L9f:
            org.json.JSONObject r6 = cn.jpush.android.helper.JCoreHelper.fillBase(r10, r2, r0)     // Catch: java.lang.Throwable -> Lc2
            if (r6 != 0) goto Lba
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r6.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r9 = "report msg json is null, code: "
            r6.append(r9)     // Catch: java.lang.Throwable -> Lc2
            r6.append(r7)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc2
            cn.jpush.android.helper.Logger.ww(r1, r6)     // Catch: java.lang.Throwable -> Lc2
            return
        Lba:
            java.lang.String r7 = "type"
            r6.put(r7, r0)     // Catch: java.lang.Throwable -> Lc2
            a(r10, r6)     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            return
    }

    public static void a(java.lang.String r8, java.lang.String r9, byte r10, long r11, android.content.Context r13) {
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            a(r0, r1, r2, r3, r5, r6, r7)
            return
    }

    public static void a(java.lang.String r7, java.lang.String r8, byte r9, long r10, android.content.Context r12, java.lang.String r13, java.lang.String r14) {
            java.lang.String r0 = "third_msg_status"
            java.lang.String r1 = "JPushReportHelper"
            if (r12 != 0) goto Lc
            java.lang.String r7 = "context did not init, return"
            cn.jpush.android.helper.Logger.d(r1, r7)
            return
        Lc:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "action:reportThirdSDKMsgActionResult - messageId: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = ", code: "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r14)
            if (r3 != 0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "， report content: "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
        L48:
            java.lang.String r3 = cn.jpush.android.d.d.c(r7)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "_j_data_"
            if (r4 == 0) goto L93
            boolean r4 = android.text.TextUtils.isEmpty(r13)
            if (r4 != 0) goto L93
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = ""
            java.lang.String r3 = r4.optString(r5, r13)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r13.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "get jdata from third push msg:"
            r13.append(r4)     // Catch: java.lang.Throwable -> L7a
            r13.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L7a
            cn.jpush.android.helper.Logger.d(r1, r13)     // Catch: java.lang.Throwable -> L7a
            goto L93
        L7a:
            r13 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "get jdata from third push msg error:"
            r4.append(r6)
            java.lang.String r13 = r13.getMessage()
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            cn.jpush.android.helper.Logger.d(r1, r13)
        L93:
            boolean r13 = android.text.TextUtils.isEmpty(r3)
            if (r13 != 0) goto Lae
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "， report jData:"
            r13.append(r4)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            r2.append(r13)
        Lae:
            java.lang.String r13 = r2.toString()
            cn.jpush.android.helper.Logger.d(r1, r13)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r2 = "msg_id"
            r13.put(r2, r7)     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "tmsg_id"
            r13.put(r7, r8)     // Catch: java.lang.Throwable -> L105
            boolean r7 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L105
            if (r7 != 0) goto Lcf
            java.lang.String r7 = "data"
            r13.put(r7, r14)     // Catch: java.lang.Throwable -> L105
        Lcf:
            java.lang.String r7 = "result"
            r13.put(r7, r10)     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "sdk_type"
            r13.put(r7, r9)     // Catch: java.lang.Throwable -> L105
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L105
            if (r7 != 0) goto Le2
            r13.put(r5, r3)     // Catch: java.lang.Throwable -> L105
        Le2:
            org.json.JSONObject r7 = cn.jpush.android.helper.JCoreHelper.fillBase(r12, r13, r0)     // Catch: java.lang.Throwable -> L105
            if (r7 != 0) goto Lfd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L105
            r7.<init>()     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = "report third sdk msg json is null, code: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L105
            r7.append(r10)     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L105
            cn.jpush.android.helper.Logger.ww(r1, r7)     // Catch: java.lang.Throwable -> L105
            goto L105
        Lfd:
            java.lang.String r8 = "type"
            r7.put(r8, r0)     // Catch: java.lang.Throwable -> L105
            a(r12, r7)     // Catch: java.lang.Throwable -> L105
        L105:
            return
    }

    public static boolean a(android.content.Context r6, java.util.Map<java.lang.String, java.lang.Integer> r7) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "api_record"
            cn.jpush.android.helper.JCoreHelper.fillBase(r6, r0, r1)     // Catch: java.lang.Throwable -> L57
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L57
        L17:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L57
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L57
            boolean r4 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L2c
            goto L17
        L2c:
            r4 = r3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L57
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L36
            goto L17
        L36:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "method"
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L57
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "count"
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L57
            r1.put(r4)     // Catch: java.lang.Throwable -> L57
            goto L17
        L4d:
            java.lang.String r7 = "record_list"
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L57
            a(r6, r0)     // Catch: java.lang.Throwable -> L57
            r6 = 1
            return r6
        L57:
            r6 = 0
            return r6
    }
}
