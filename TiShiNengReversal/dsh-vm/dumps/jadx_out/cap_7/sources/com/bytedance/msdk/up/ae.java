package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae extends com.bytedance.msdk.up.j {
    private static final java.text.SimpleDateFormat r = null;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            com.bytedance.msdk.up.ae.r = r0
            return
    }

    public ae(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bytedance.msdk.up.ae j(android.content.Context r2, com.bytedance.msdk.up.r r3, org.json.JSONObject r4) {
            com.bytedance.msdk.up.ae r0 = new com.bytedance.msdk.up.ae
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            org.json.JSONObject r2 = xt(r2, r3, r4)
            r0.<init>(r1, r2)
            return r0
    }

    private static org.json.JSONObject xt(android.content.Context r5, com.bytedance.msdk.up.r r6, org.json.JSONObject r7) {
            java.lang.String r5 = "event_extra"
            java.lang.String r0 = "params"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "event"
            java.lang.String r3 = r6.j     // Catch: java.lang.Exception -> L31
            r1.putOpt(r2, r3)     // Catch: java.lang.Exception -> L31
            r1.putOpt(r0, r7)     // Catch: java.lang.Exception -> L31
            java.lang.String r7 = "nt"
            int r2 = com.bytedance.msdk.tl.x.up()     // Catch: java.lang.Exception -> L31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L31
            r1.putOpt(r7, r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r7 = "datetime"
            java.text.SimpleDateFormat r2 = com.bytedance.msdk.up.ae.r     // Catch: java.lang.Exception -> L31
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Exception -> L31
            r3.<init>()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = r2.format(r3)     // Catch: java.lang.Exception -> L31
            r1.putOpt(r7, r2)     // Catch: java.lang.Exception -> L31
            return r1
        L31:
            r7 = move-exception
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "v3_err_msg"
            if (r0 == 0) goto L57
            java.lang.String r3 = r0.optString(r5)     // Catch: java.lang.Throwable -> L75
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L75
            if (r4 != 0) goto L57
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L75
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L75
            r4.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L75
            r0.putOpt(r5, r3)     // Catch: java.lang.Throwable -> L75
        L57:
            if (r6 == 0) goto L75
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L75
            r5.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "v3_eventId"
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "event_id"
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L75
            r5.putOpt(r0, r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L75
            r5.putOpt(r2, r6)     // Catch: java.lang.Throwable -> L75
            com.bytedance.msdk.tl.l.j(r5)     // Catch: java.lang.Throwable -> L75
        L75:
            return r1
    }

    @Override // com.bytedance.msdk.up.j
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdEventV3{localId='"
            r0.<init>(r1)
            java.lang.String r1 = r2.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", event="
            r0.append(r1)
            org.json.JSONObject r1 = r2.xt
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
