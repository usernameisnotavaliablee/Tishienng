package com.umeng.socialize.tracker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class b {
    private static final java.lang.String a = "TrackerManagerImpl";
    private static final int b = 3000;
    private static final java.lang.String c = "_$";
    private static final int d = 16;
    private static final int e = 64;
    private static final java.lang.String f = "自定义属性名长度不能超过16个字符。";
    private static final java.lang.String g = "自定义属性值长度不能超过64个字符。";


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.socialize.tracker.b a = null;

        static {
                com.umeng.socialize.tracker.b r0 = new com.umeng.socialize.tracker.b
                r1 = 0
                r0.<init>(r1)
                com.umeng.socialize.tracker.b.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.socialize.tracker.b a() {
                com.umeng.socialize.tracker.b r0 = com.umeng.socialize.tracker.b.a.a
                return r0
        }
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ b(com.umeng.socialize.tracker.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.socialize.tracker.b a() {
            com.umeng.socialize.tracker.b r0 = com.umeng.socialize.tracker.b.a.a()
            return r0
    }

    static /* synthetic */ boolean a(java.lang.String r0) {
            boolean r0 = f(r0)
            return r0
    }

    static /* synthetic */ java.lang.String b(java.lang.String r0) {
            java.lang.String r0 = e(r0)
            return r0
    }

    static /* synthetic */ java.lang.String c(java.lang.String r0) {
            java.lang.String r0 = d(r0)
            return r0
    }

    private static java.lang.String d(java.lang.String r4) {
            java.lang.String r0 = "msg"
            java.lang.String r1 = "code"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = ""
            boolean r3 = r2.has(r1)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L16
            int r1 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L3b
            goto L17
        L16:
            r1 = 0
        L17:
            boolean r3 = r2.has(r0)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L21
            java.lang.String r4 = r2.optString(r0)     // Catch: java.lang.Throwable -> L3b
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "错误详情 ["
            r0.append(r2)     // Catch: java.lang.Throwable -> L3b
            r0.append(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "]: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3b
            r0.append(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L3b
            return r4
        L3b:
            r4 = 0
            return r4
    }

    private static java.lang.String e(java.lang.String r3) {
            java.lang.String r0 = "rootTrackCode"
            java.lang.String r1 = "data"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20
            boolean r3 = r2.has(r1)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L20
            org.json.JSONObject r3 = r2.optJSONObject(r1)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L20
            boolean r1 = r3.has(r0)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            java.lang.String r3 = r3.optString(r0)     // Catch: java.lang.Throwable -> L20
            return r3
        L20:
            r3 = 0
            return r3
    }

    private static boolean f(java.lang.String r3) {
            java.lang.String r0 = "code"
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r2.has(r0)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L13
            int r3 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L1a
            goto L14
        L13:
            r3 = 0
        L14:
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L1a
            r3 = 1
            return r3
        L1a:
            return r1
    }

    public void a(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, int r13, com.umeng.socialize.tracker.TrackerResultHandler r14) {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r12 == 0) goto L49
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L49
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r12.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L15
            int r4 = r2.length()
            r5 = 16
            if (r4 <= r5) goto L36
            goto L15
        L36:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L15
            int r4 = r3.length()
            r5 = 64
            if (r4 <= r5) goto L45
            goto L15
        L45:
            r0.put(r2, r3)
            goto L15
        L49:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.Set r3 = r0.keySet()     // Catch: java.lang.Throwable -> Lb9
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lb9
        L60:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lb9
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lb9
            if (r5 != 0) goto L60
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> Lb9
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> Lb9
            goto L60
        L7a:
            java.lang.String r0 = "_$appkey"
            r1.put(r0, r8)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r8 = "_$umid"
            r1.put(r8, r9)     // Catch: java.lang.Throwable -> Lb9
            boolean r8 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Lb9
            if (r8 != 0) goto L8f
            java.lang.String r8 = "_$uid"
            r1.put(r8, r11)     // Catch: java.lang.Throwable -> Lb9
        L8f:
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r9 = "_$url"
            if (r8 != 0) goto L9b
            r1.put(r9, r10)     // Catch: java.lang.Throwable -> Lb9
            goto L9f
        L9b:
            r8 = 0
            r1.put(r9, r8)     // Catch: java.lang.Throwable -> Lb9
        L9f:
            java.lang.String r8 = "initData"
            r12.put(r8, r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r8 = "userData"
            r12.put(r8, r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r8 = r12.toString()
            r7.getApplicationContext()
            com.umeng.socialize.tracker.b$1 r7 = new com.umeng.socialize.tracker.b$1
            r7.<init>(r6, r8, r14, r13)
            com.umeng.socialize.tracker.utils.c.a(r7)
            return
        Lb9:
            java.lang.Throwable r7 = new java.lang.Throwable
            com.umeng.socialize.tracker.utils.a r8 = com.umeng.socialize.tracker.utils.a.j
            java.lang.String r8 = r8.a()
            r7.<init>(r8)
            r14.codeGenerateFailed(r7)
            return
    }
}
