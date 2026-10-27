package u0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class a {
    public static final java.lang.String a = "tobsdk_livesdk_live_show";
    public static final java.lang.String b = "tobsdk_livesdk_rec_live_play";
    public static final java.lang.String c = "tobsdk_livesdk_live_window_duration_v2";

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONObject a(java.util.Map<java.lang.String, java.lang.String> r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Exception -> L27
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L27
        Ld:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L27
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> L27
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L27
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L27
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L27
            goto Ld
        L27:
            r3 = move-exception
            goto L2a
        L29:
            return r0
        L2a:
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r0
    }

    public static org.json.JSONObject b(u0.c r1) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r1 = c(r1, r0)
            return r1
    }

    public static org.json.JSONObject c(u0.c r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "room_id"
            r4.put(r1, r0)
            java.lang.String r0 = "anchor_id"
            java.lang.String r1 = r3.b()
            r4.put(r0, r1)
            com.bytedance.android.metrics.EnterFromMerge r0 = r3.d()
            java.lang.String r0 = r0.lowerName()
            java.lang.String r1 = "enter_from_merge"
            r4.put(r1, r0)
            com.bytedance.android.metrics.EnterMethod r0 = r3.e()
            java.lang.String r0 = r0.lowerName()
            java.lang.String r1 = "enter_method"
            r4.put(r1, r0)
            com.bytedance.android.metrics.ActionType r0 = r3.a()
            java.lang.String r0 = r0.lowerName()
            java.lang.String r1 = "action_type"
            r4.put(r1, r0)
            java.lang.String r0 = "request_id"
            java.lang.String r1 = r3.f()
            r4.put(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.c()
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "duration"
            r4.put(r0, r3)
            java.lang.String r3 = "is_other_channel"
            java.lang.String r0 = "union_ad"
            r4.put(r3, r0)
            org.json.JSONObject r3 = a(r4)
            return r3
    }
}
