package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae {
    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONObject j() {
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()
            java.util.Map r0 = r0.xt()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 == 0) goto L19
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "\\."
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            r5 = 5
            if (r4 < r5) goto L19
            r4 = 4
            r3 = r3[r4]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L5d
            r4.<init>()     // Catch: org.json.JSONException -> L5d
            r4.append(r3)     // Catch: org.json.JSONException -> L5d
            java.lang.String r3 = "Adapter"
            r4.append(r3)     // Catch: org.json.JSONException -> L5d
            java.lang.String r3 = r4.toString()     // Catch: org.json.JSONException -> L5d
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L5d
            com.bytedance.msdk.j.j.r r2 = (com.bytedance.msdk.j.j.r) r2     // Catch: org.json.JSONException -> L5d
            java.lang.String r2 = r2.j()     // Catch: org.json.JSONException -> L5d
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L5d
            goto L19
        L5d:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            goto L19
        L62:
            return r1
    }
}
