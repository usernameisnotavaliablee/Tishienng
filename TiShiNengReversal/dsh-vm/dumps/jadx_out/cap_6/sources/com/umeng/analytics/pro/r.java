package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class r {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private final long e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.r$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        public static final com.umeng.analytics.pro.r a = null;

        static {
                com.umeng.analytics.pro.r r0 = new com.umeng.analytics.pro.r
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.pro.r.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private r() {
            r2 = this;
            r2.<init>()
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.e = r0
            return
    }

    /* synthetic */ r(com.umeng.analytics.pro.r.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.pro.r a() {
            com.umeng.analytics.pro.r r0 = com.umeng.analytics.pro.r.a.a
            return r0
    }

    private void a(org.json.JSONObject r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto Ld
            java.lang.String r4 = "sessions"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto Ld
            r3.remove(r4)
        Ld:
            java.lang.String r4 = "active_user"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L18
            r3.remove(r4)
        L18:
            java.lang.String r0 = "error"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L23
            r3.remove(r0)
        L23:
            java.lang.String r0 = "ekv"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L2e
            r3.remove(r0)
        L2e:
            java.lang.String r0 = "gkv"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L39
            r3.remove(r0)
        L39:
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L42
            r3.remove(r4)
        L42:
            java.lang.String r4 = "userlevel"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L4d
            r3.remove(r4)
        L4d:
            return
    }

    private org.json.JSONArray b() {
            r7 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L36
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L36
            r3.<init>()     // Catch: org.json.JSONException -> L36
            java.lang.String r4 = "id"
            com.umeng.analytics.pro.y r5 = com.umeng.analytics.pro.y.a()     // Catch: org.json.JSONException -> L36
            r6 = 0
            android.content.Context r6 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r6)     // Catch: org.json.JSONException -> L36
            java.lang.String r5 = r5.a(r6)     // Catch: org.json.JSONException -> L36
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L36
            java.lang.String r4 = "start_time"
            r3.put(r4, r1)     // Catch: org.json.JSONException -> L36
            java.lang.String r4 = "end_time"
            r5 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 + r5
            r3.put(r4, r1)     // Catch: org.json.JSONException -> L36
            java.lang.String r1 = "duration"
            r3.put(r1, r5)     // Catch: org.json.JSONException -> L36
            r0.put(r3)     // Catch: org.json.JSONException -> L36
        L36:
            return r0
    }

    private org.json.JSONArray c() {
            r7 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L28
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r3.<init>()     // Catch: org.json.JSONException -> L28
            java.lang.String r4 = "id"
            com.umeng.analytics.pro.y r5 = com.umeng.analytics.pro.y.a()     // Catch: org.json.JSONException -> L28
            r6 = 0
            android.content.Context r6 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r6)     // Catch: org.json.JSONException -> L28
            java.lang.String r5 = r5.d(r6)     // Catch: org.json.JSONException -> L28
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L28
            java.lang.String r4 = "start_time"
            r3.put(r4, r1)     // Catch: org.json.JSONException -> L28
            r0.put(r3)     // Catch: org.json.JSONException -> L28
        L28:
            return r0
    }

    public int a(android.content.Context r3) {
            r2 = this;
            r0 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "defcon"
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r3, r1, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            return r3
    }

    public void a(org.json.JSONObject r5, android.content.Context r6) {
            r4 = this;
            int r0 = r4.a(r6)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L13
            r4.a(r5, r2)
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r6)
            r5.b(r1, r2)
            return
        L13:
            r3 = 2
            if (r0 != r3) goto L2d
            java.lang.String r0 = "sessions"
            r5.remove(r0)
            org.json.JSONArray r3 = r4.b()     // Catch: java.lang.Exception -> L22
            r5.put(r0, r3)     // Catch: java.lang.Exception -> L22
        L22:
            r4.a(r5, r2)
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r6)
            r5.b(r1, r2)
            return
        L2d:
            r3 = 3
            if (r0 != r3) goto L3a
            r4.a(r5, r1)
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r6)
            r5.b(r1, r2)
        L3a:
            return
    }

    public void b(org.json.JSONObject r9, android.content.Context r10) {
            r8 = this;
            java.lang.String r0 = "_$pp"
            java.lang.String r1 = "_$sp"
            int r2 = r8.a(r10)
            r3 = 0
            java.lang.String r4 = "sessions"
            java.lang.String r5 = "active_user"
            r6 = 1
            if (r2 != r6) goto L4b
            boolean r2 = r9.has(r5)
            if (r2 == 0) goto L19
            r9.remove(r5)
        L19:
            boolean r2 = r9.has(r4)
            if (r2 == 0) goto L43
            org.json.JSONArray r9 = r9.getJSONArray(r4)     // Catch: org.json.JSONException -> L43
            int r2 = r9.length()     // Catch: org.json.JSONException -> L43
            r4 = 0
        L28:
            if (r4 >= r2) goto L43
            org.json.JSONObject r5 = r9.getJSONObject(r4)     // Catch: org.json.JSONException -> L43
            boolean r7 = r5.has(r1)     // Catch: org.json.JSONException -> L43
            if (r7 == 0) goto L37
            r5.remove(r1)     // Catch: org.json.JSONException -> L43
        L37:
            boolean r7 = r5.has(r0)     // Catch: org.json.JSONException -> L43
            if (r7 == 0) goto L40
            r5.remove(r0)     // Catch: org.json.JSONException -> L43
        L40:
            int r4 = r4 + 1
            goto L28
        L43:
            com.umeng.analytics.pro.i r9 = com.umeng.analytics.pro.i.a(r10)
            r9.a(r3, r6)
            goto L85
        L4b:
            r0 = 2
            if (r2 != r0) goto L6f
            boolean r0 = r9.has(r5)
            if (r0 == 0) goto L57
            r9.remove(r5)
        L57:
            boolean r0 = r9.has(r4)
            if (r0 == 0) goto L60
            r9.remove(r4)
        L60:
            org.json.JSONArray r0 = r8.c()     // Catch: java.lang.Exception -> L67
            r9.put(r4, r0)     // Catch: java.lang.Exception -> L67
        L67:
            com.umeng.analytics.pro.i r9 = com.umeng.analytics.pro.i.a(r10)
            r9.a(r3, r6)
            goto L85
        L6f:
            r0 = 3
            if (r2 != r0) goto L85
            boolean r0 = r9.has(r5)
            if (r0 == 0) goto L7b
            r9.remove(r5)
        L7b:
            r9.remove(r4)
            com.umeng.analytics.pro.i r9 = com.umeng.analytics.pro.i.a(r10)
            r9.a(r3, r6)
        L85:
            return
    }
}
