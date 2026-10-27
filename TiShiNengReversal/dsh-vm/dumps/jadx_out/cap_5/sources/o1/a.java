package o1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String a = "a";
    private static p1.d b;
    private static final java.lang.Object c = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            o1.a.c = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized p1.d a(android.content.Context r7) {
            java.lang.Class<o1.a> r0 = o1.a.class
            monitor-enter(r0)
            java.lang.Object r1 = o1.a.c     // Catch: java.lang.Throwable -> La9
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La9
            p1.d r2 = o1.a.b     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r2
        Ld:
            r7 = move-exception
            goto Lab
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r2.<init>()     // Catch: java.lang.Throwable -> Ld
            com.huawei.hms.framework.network.grs.GrsApp r3 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "/"
            java.lang.String r3 = r3.getBrand(r4)     // Catch: java.lang.Throwable -> Ld
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "grs_sdk_server_config.json"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = q1.c.a(r2, r7)     // Catch: java.lang.Throwable -> Ld
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            if (r2 == 0) goto L39
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r3
        L39:
            r2 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            java.lang.String r7 = "grs_server"
            org.json.JSONObject r7 = r4.getJSONObject(r7)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            java.lang.String r4 = "grs_base_url"
            org.json.JSONArray r4 = r7.getJSONArray(r4)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            if (r4 == 0) goto L6f
            int r5 = r4.length()     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            if (r5 <= 0) goto L6f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r5 = 0
        L59:
            int r6 = r4.length()     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            if (r5 >= r6) goto L6f
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r3.add(r6)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            int r5 = r5 + 1
            goto L59
        L6d:
            r7 = move-exception
            goto L90
        L6f:
            p1.d r4 = new p1.d     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r4.<init>()     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            o1.a.b = r4     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r4.d(r3)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            java.lang.String r3 = "grs_query_endpoint_2.0"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            p1.d r4 = o1.a.b     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r4.c(r3)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            java.lang.String r3 = "grs_query_timeout"
            int r7 = r7.getInt(r3)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            p1.d r3 = o1.a.b     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            r3.b(r7)     // Catch: java.lang.Throwable -> Ld org.json.JSONException -> L6d
            goto La4
        L90:
            java.lang.String r3 = o1.a.a     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "getGrsServerBean catch JSONException: %s"
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r7)     // Catch: java.lang.Throwable -> Ld
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Ld
            r5[r2] = r7     // Catch: java.lang.Throwable -> Ld
            com.huawei.hms.framework.common.Logger.w(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
        La4:
            p1.d r7 = o1.a.b     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r7
        La9:
            r7 = move-exception
            goto Lad
        Lab:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r7     // Catch: java.lang.Throwable -> La9
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            throw r7
    }
}
