package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class x implements com.huawei.hms.hatool.u0 {
    private java.util.List<com.huawei.hms.hatool.f> a;
    private com.huawei.hms.hatool.h0 b;
    private com.huawei.hms.hatool.e1 c;
    private com.huawei.hms.hatool.u0 d;
    private java.lang.String e;
    private java.lang.String f;

    public x(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.e = r0
            r1.f = r2
            return
    }

    @Override // com.huawei.hms.hatool.u0
    public org.json.JSONObject a() {
            r8 = this;
            java.lang.String r0 = "events_global_properties"
            java.util.List<com.huawei.hms.hatool.f> r1 = r8.a
            r2 = 0
            java.lang.String r3 = "hmsSdk"
            if (r1 == 0) goto Lb5
            int r1 = r1.size()
            if (r1 != 0) goto L11
            goto Lb5
        L11:
            com.huawei.hms.hatool.h0 r1 = r8.b
            if (r1 == 0) goto Lb2
            com.huawei.hms.hatool.e1 r1 = r8.c
            if (r1 == 0) goto Lb2
            com.huawei.hms.hatool.u0 r1 = r8.d
            if (r1 != 0) goto L1f
            goto Lb2
        L1f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.huawei.hms.hatool.h0 r4 = r8.b
            org.json.JSONObject r4 = r4.a()
            java.lang.String r5 = "header"
            r1.put(r5, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            com.huawei.hms.hatool.u0 r5 = r8.d
            org.json.JSONObject r5 = r5.a()
            com.huawei.hms.hatool.e1 r6 = r8.c
            org.json.JSONObject r6 = r6.a()
            java.lang.String r7 = "properties"
            r5.put(r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L50
            java.lang.String r7 = r8.e     // Catch: org.json.JSONException -> L50
            r6.<init>(r7)     // Catch: org.json.JSONException -> L50
            r5.put(r0, r6)     // Catch: org.json.JSONException -> L50
            goto L55
        L50:
            java.lang.String r6 = r8.e
            r5.put(r0, r6)
        L55:
            java.lang.String r0 = "events_common"
            r4.put(r0, r5)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List<com.huawei.hms.hatool.f> r5 = r8.a
            java.util.Iterator r5 = r5.iterator()
        L65:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L81
            java.lang.Object r6 = r5.next()
            com.huawei.hms.hatool.f r6 = (com.huawei.hms.hatool.f) r6
            org.json.JSONObject r6 = r6.a()
            if (r6 == 0) goto L7b
            r0.put(r6)
            goto L65
        L7b:
            java.lang.String r6 = "custom event is empty,delete this event"
            com.huawei.hms.hatool.j1.l(r3, r6)
            goto L65
        L81:
            java.lang.String r5 = "events"
            r4.put(r5, r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "UTF-8"
            byte[] r0 = r0.getBytes(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac
            byte[] r0 = com.huawei.hms.hatool.i0.g(r0)     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r4 = r8.f     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r0 = com.huawei.hms.hatool.r0.c(r0, r4)     // Catch: java.io.UnsupportedEncodingException -> Lac
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.UnsupportedEncodingException -> Lac
            if (r4 == 0) goto La6
            java.lang.String r0 = "eventInfo encrypt failed,report over!"
            com.huawei.hms.hatool.j1.l(r3, r0)     // Catch: java.io.UnsupportedEncodingException -> Lac
            return r2
        La6:
            java.lang.String r4 = "event"
            r1.put(r4, r0)     // Catch: java.io.UnsupportedEncodingException -> Lac
            return r1
        Lac:
            java.lang.String r0 = "getBitZip(): Unsupported coding : utf-8"
        Lae:
            com.huawei.hms.hatool.j1.l(r3, r0)
            return r2
        Lb2:
            java.lang.String r0 = "model in wrong format"
            goto Lae
        Lb5:
            java.lang.String r0 = "Not have actionEvent to send"
            goto Lae
    }

    public void b(com.huawei.hms.hatool.h0 r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void c(com.huawei.hms.hatool.l0 r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void d(com.huawei.hms.hatool.e1 r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void e(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.e = r1
        L4:
            return
    }

    public void f(java.util.List<com.huawei.hms.hatool.f> r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
