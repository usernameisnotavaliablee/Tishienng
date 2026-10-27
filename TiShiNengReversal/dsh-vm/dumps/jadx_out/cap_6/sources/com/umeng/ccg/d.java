package com.umeng.ccg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d implements com.umeng.ccg.c.a {
    private static final java.lang.String a = "iucc";
    private static final java.lang.String b = null;
    private static org.json.JSONObject c;
    private static final java.lang.String[] d = null;
    private static java.util.ArrayList<com.umeng.analytics.pro.aa> e;
    private static java.util.ArrayList<com.umeng.analytics.pro.aa> f;
    private static java.util.ArrayList<com.umeng.analytics.pro.aa> g;
    private static com.umeng.ccg.d.c j;
    private volatile java.lang.String h;
    private java.util.Map<java.lang.String, com.umeng.ccg.d.a> i;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a {
        final /* synthetic */ com.umeng.ccg.d a;
        private org.json.JSONArray b;
        private java.lang.String c;

        public a(com.umeng.ccg.d r1, org.json.JSONArray r2, java.lang.String r3) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r2
                r0.c = r3
                return
        }

        public org.json.JSONArray a() {
                r1 = this;
                org.json.JSONArray r0 = r1.b
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private static final com.umeng.ccg.d a = null;

        static {
                com.umeng.ccg.d r0 = new com.umeng.ccg.d
                r0.<init>()
                com.umeng.ccg.d.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.ccg.d a() {
                com.umeng.ccg.d r0 = com.umeng.ccg.d.b.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends android.content.BroadcastReceiver {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        public long a(java.util.ArrayList<com.umeng.analytics.pro.aa> r4) {
                r3 = this;
                if (r4 == 0) goto L23
                int r0 = r4.size()
                if (r0 <= 0) goto L23
                r0 = 0
            L9:
                int r1 = r4.size()
                if (r0 >= r1) goto L23
                java.lang.Object r1 = r4.get(r0)
                com.umeng.analytics.pro.aa r1 = (com.umeng.analytics.pro.aa) r1
                boolean r2 = r1 instanceof com.umeng.analytics.pro.ac
                if (r2 == 0) goto L20
                com.umeng.analytics.pro.ac r1 = (com.umeng.analytics.pro.ac) r1
                long r0 = r1.c()
                return r0
            L20:
                int r0 = r0 + 1
                goto L9
            L23:
                r0 = 0
                return r0
        }

        public boolean b(java.util.ArrayList<com.umeng.analytics.pro.aa> r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L22
                int r1 = r4.size()
                if (r1 <= 0) goto L22
                r1 = 0
            La:
                int r2 = r4.size()
                if (r1 >= r2) goto L20
                java.lang.Object r2 = r4.get(r1)
                com.umeng.analytics.pro.aa r2 = (com.umeng.analytics.pro.aa) r2
                boolean r2 = r2.b()
                if (r2 == 0) goto L1d
                return r0
            L1d:
                int r1 = r1 + 1
                goto La
            L20:
                r4 = 1
                return r4
            L22:
                return r0
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r12, android.content.Intent r13) {
                r11 = this;
                java.lang.String r12 = r13.getAction()     // Catch: java.lang.Throwable -> Lbe
                boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Lbe
                if (r13 == 0) goto Lc
                goto Lbe
            Lc:
                java.lang.String r13 = "android.intent.action.SCREEN_ON"
                boolean r13 = r12.equals(r13)     // Catch: java.lang.Throwable -> Lbe
                r0 = 1000(0x3e8, double:4.94E-321)
                java.lang.String r2 = "MobclickRT"
                if (r13 == 0) goto L4a
                java.lang.String r13 = "recv intent : ACTION_SCREEN_ON"
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r13)     // Catch: java.lang.Throwable -> Lbe
                java.util.ArrayList r13 = com.umeng.ccg.d.b()     // Catch: java.lang.Throwable -> Lbe
                boolean r13 = r11.b(r13)     // Catch: java.lang.Throwable -> Lbe
                if (r13 == 0) goto L45
                java.lang.String r13 = "report screen_on event."
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r13)     // Catch: java.lang.Throwable -> Lbe
                java.util.ArrayList r13 = com.umeng.ccg.d.b()     // Catch: java.lang.Throwable -> Lbe
                long r3 = r11.a(r13)     // Catch: java.lang.Throwable -> Lbe
                android.content.Context r5 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lbe
                com.umeng.ccg.d r7 = com.umeng.ccg.d.a()     // Catch: java.lang.Throwable -> Lbe
                r8 = 0
                long r9 = r3 * r0
                r6 = 301(0x12d, float:4.22E-43)
                com.umeng.ccg.c.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lbe
                goto L4a
            L45:
                java.lang.String r13 = "don't report screen_on event."
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r13)     // Catch: java.lang.Throwable -> Lbe
            L4a:
                java.lang.String r13 = "android.intent.action.SCREEN_OFF"
                boolean r13 = r12.equals(r13)     // Catch: java.lang.Throwable -> Lbe
                if (r13 == 0) goto L84
                java.lang.String r13 = "recv intent : ACTION_SCREEN_OFF"
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r13)     // Catch: java.lang.Throwable -> Lbe
                java.util.ArrayList r13 = com.umeng.ccg.d.c()     // Catch: java.lang.Throwable -> Lbe
                boolean r13 = r11.b(r13)     // Catch: java.lang.Throwable -> Lbe
                if (r13 == 0) goto L7f
                java.lang.String r13 = "report screen_off event."
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r13)     // Catch: java.lang.Throwable -> Lbe
                java.util.ArrayList r13 = com.umeng.ccg.d.c()     // Catch: java.lang.Throwable -> Lbe
                long r3 = r11.a(r13)     // Catch: java.lang.Throwable -> Lbe
                android.content.Context r5 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lbe
                com.umeng.ccg.d r7 = com.umeng.ccg.d.a()     // Catch: java.lang.Throwable -> Lbe
                r8 = 0
                long r9 = r3 * r0
                r6 = 302(0x12e, float:4.23E-43)
                com.umeng.ccg.c.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lbe
                goto L84
            L7f:
                java.lang.String r13 = "don't report screen_off event."
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r13)     // Catch: java.lang.Throwable -> Lbe
            L84:
                java.lang.String r13 = "android.intent.action.USER_PRESENT"
                boolean r12 = r12.equals(r13)     // Catch: java.lang.Throwable -> Lbe
                if (r12 == 0) goto Lbe
                java.lang.String r12 = "recv intent : ACTION_USER_PRESENT"
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r12)     // Catch: java.lang.Throwable -> Lbe
                java.util.ArrayList r12 = com.umeng.ccg.d.d()     // Catch: java.lang.Throwable -> Lbe
                boolean r12 = r11.b(r12)     // Catch: java.lang.Throwable -> Lbe
                if (r12 == 0) goto Lb9
                java.lang.String r12 = "report screen_unlock event."
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r12)     // Catch: java.lang.Throwable -> Lbe
                java.util.ArrayList r12 = com.umeng.ccg.d.d()     // Catch: java.lang.Throwable -> Lbe
                long r12 = r11.a(r12)     // Catch: java.lang.Throwable -> Lbe
                android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lbe
                com.umeng.ccg.d r4 = com.umeng.ccg.d.a()     // Catch: java.lang.Throwable -> Lbe
                r5 = 0
                long r6 = r12 * r0
                r3 = 303(0x12f, float:4.25E-43)
                com.umeng.ccg.c.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lbe
                return
            Lb9:
                java.lang.String r12 = "don't report screen_unlock event."
                com.umeng.commonsdk.debug.UMRTLog.i(r2, r12)     // Catch: java.lang.Throwable -> Lbe
            Lbe:
                return
        }
    }

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "ccfg"
            java.lang.String r0 = r0.b(r1)
            com.umeng.ccg.d.b = r0
            r0 = 0
            com.umeng.ccg.d.c = r0
            java.lang.String r1 = "screen_off"
            java.lang.String r2 = "screen_unlock"
            java.lang.String r3 = "screen_on"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            com.umeng.ccg.d.d = r1
            com.umeng.ccg.d.e = r0
            com.umeng.ccg.d.f = r0
            com.umeng.ccg.d.g = r0
            com.umeng.ccg.d$c r0 = new com.umeng.ccg.d$c
            r0.<init>()
            com.umeng.ccg.d.j = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.h = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.i = r0
            return
    }

    private com.umeng.analytics.pro.z a(java.lang.String r24, org.json.JSONObject r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "batch"
            java.lang.String r4 = "action"
            java.lang.String r5 = "sdk"
            java.lang.String r6 = "col_apl"
            java.lang.String r7 = "hour_on"
            java.lang.String r8 = "week_on"
            java.lang.String r9 = "col_delay_ts"
            java.lang.String r10 = "col_interval"
            java.lang.String r11 = "col_delay_times"
            java.lang.String r12 = "cfg"
            if (r2 == 0) goto L1fb
            boolean r14 = r2.has(r12)     // Catch: java.lang.Throwable -> L1f6
            if (r14 == 0) goto L1fb
            org.json.JSONArray r12 = r2.optJSONArray(r12)     // Catch: java.lang.Throwable -> L1f6
            if (r12 == 0) goto L1fb
            int r14 = r12.length()     // Catch: java.lang.Throwable -> L1f6
            if (r14 <= 0) goto L1fb
            r14 = 0
            java.lang.Object r12 = r12.get(r14)     // Catch: java.lang.Throwable -> L1f6
            org.json.JSONObject r12 = (org.json.JSONObject) r12     // Catch: java.lang.Throwable -> L1f6
            boolean r15 = r12.has(r11)     // Catch: java.lang.Throwable -> L1f6
            boolean r16 = r12.has(r10)     // Catch: java.lang.Throwable -> L1f6
            boolean r17 = r12.has(r9)     // Catch: java.lang.Throwable -> L1f6
            if (r15 == 0) goto L47
            if (r16 == 0) goto L47
            if (r17 != 0) goto L4b
        L47:
            r17 = 0
            goto L1fa
        L4b:
            int r11 = r12.optInt(r11)     // Catch: java.lang.Throwable -> L1f6
            r15 = 0
            long r13 = r12.optLong(r10)     // Catch: java.lang.Throwable -> L1f2
            long r9 = r12.optLong(r9)     // Catch: java.lang.Throwable -> L1f2
            r17 = r15
            java.lang.String r15 = "hit_sdk"
            java.lang.String r15 = r12.optString(r15)     // Catch: java.lang.Throwable -> L95
            r18 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L95
            boolean r19 = r12.has(r8)     // Catch: java.lang.Throwable -> L95
            if (r19 == 0) goto Lba
            org.json.JSONArray r8 = r12.optJSONArray(r8)     // Catch: java.lang.Throwable -> L95
            r19 = r4
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L95
            r4.<init>()     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L99
            int r2 = r8.length()     // Catch: java.lang.Throwable -> L95
            r20 = r5
            r5 = 0
        L81:
            if (r5 >= r2) goto L9b
            int r21 = r8.getInt(r5)     // Catch: java.lang.Throwable -> L95
            r22 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L95
            r4.add(r2)     // Catch: java.lang.Throwable -> L95
            int r5 = r5 + 1
            r2 = r22
            goto L81
        L95:
            r13 = r17
            goto L1fe
        L99:
            r20 = r5
        L9b:
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L95
            if (r2 <= 0) goto Lbe
            com.umeng.analytics.pro.aj r2 = new com.umeng.analytics.pro.aj     // Catch: java.lang.Throwable -> L95
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L95
            java.lang.String[] r4 = com.umeng.ccg.d.d     // Catch: java.lang.Throwable -> L95
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L95
            boolean r4 = r4.contains(r1)     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto Lb6
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L95
            goto Lbe
        Lb6:
            r3.add(r2)     // Catch: java.lang.Throwable -> L95
            goto Lbe
        Lba:
            r19 = r4
            r20 = r5
        Lbe:
            boolean r2 = r12.has(r7)     // Catch: java.lang.Throwable -> L95
            r4 = 1
            if (r2 == 0) goto L10c
            java.lang.String r2 = r12.optString(r7)     // Catch: java.lang.Throwable -> L95
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto L10c
            com.umeng.analytics.pro.ah r5 = new com.umeng.analytics.pro.ah     // Catch: java.lang.Throwable -> L95
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L95
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L95
            r2.<init>()     // Catch: java.lang.Throwable -> L95
            r7 = 1
        Lda:
            r8 = 24
            if (r7 > r8) goto Lee
            boolean r8 = r5.a(r7)     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto Leb
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L95
            r2.add(r8)     // Catch: java.lang.Throwable -> L95
        Leb:
            int r7 = r7 + 1
            goto Lda
        Lee:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L95
            if (r5 <= 0) goto L10c
            com.umeng.analytics.pro.ad r5 = new com.umeng.analytics.pro.ad     // Catch: java.lang.Throwable -> L95
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L95
            java.lang.String[] r2 = com.umeng.ccg.d.d     // Catch: java.lang.Throwable -> L95
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L95
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L109
            r0.a(r1, r5)     // Catch: java.lang.Throwable -> L95
            goto L10c
        L109:
            r3.add(r5)     // Catch: java.lang.Throwable -> L95
        L10c:
            com.umeng.analytics.pro.af r2 = new com.umeng.analytics.pro.af     // Catch: java.lang.Throwable -> L95
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L95
            r3.add(r2)     // Catch: java.lang.Throwable -> L95
            com.umeng.analytics.pro.ae r2 = new com.umeng.analytics.pro.ae     // Catch: java.lang.Throwable -> L95
            r2.<init>(r1, r13)     // Catch: java.lang.Throwable -> L95
            java.lang.String[] r5 = com.umeng.ccg.d.d     // Catch: java.lang.Throwable -> L95
            java.util.List r7 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L95
            boolean r7 = r7.contains(r1)     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L129
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L95
            goto L12c
        L129:
            r3.add(r2)     // Catch: java.lang.Throwable -> L95
        L12c:
            com.umeng.analytics.pro.ac r2 = new com.umeng.analytics.pro.ac     // Catch: java.lang.Throwable -> L95
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L95
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L95
            boolean r5 = r5.contains(r1)     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L142
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L95
            r3.add(r2)     // Catch: java.lang.Throwable -> L95
            goto L145
        L142:
            r3.add(r2)     // Catch: java.lang.Throwable -> L95
        L145:
            boolean r2 = r6.equals(r1)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L152
            com.umeng.analytics.pro.ab r2 = new com.umeng.analytics.pro.ab     // Catch: java.lang.Throwable -> L95
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L95
        L150:
            r13 = r2
            goto L158
        L152:
            com.umeng.analytics.pro.z r2 = new com.umeng.analytics.pro.z     // Catch: java.lang.Throwable -> L95
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L95
            goto L150
        L158:
            r13.a(r15)     // Catch: java.lang.Throwable -> L1fe
            java.lang.String r2 = ""
            r3 = r25
            r5 = r20
            boolean r7 = r3.has(r5)     // Catch: java.lang.Throwable -> L1fe
            if (r7 == 0) goto L1c0
            org.json.JSONArray r3 = r3.optJSONArray(r5)     // Catch: java.lang.Throwable -> L1fe
            if (r3 == 0) goto L1c0
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r5 = r0.i     // Catch: java.lang.Throwable -> L1fe
            if (r5 == 0) goto L18a
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L1fe
            if (r5 != 0) goto L18a
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L1fe
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1fe
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L1fe
            com.umeng.ccg.d$a r5 = new com.umeng.ccg.d$a     // Catch: java.lang.Throwable -> L1fe
            r5.<init>(r0, r7, r15)     // Catch: java.lang.Throwable -> L1fe
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r7 = r0.i     // Catch: java.lang.Throwable -> L1fe
            r7.put(r1, r5)     // Catch: java.lang.Throwable -> L1fe
        L18a:
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L1fe
            r14 = 0
        L18f:
            int r7 = r3.length()     // Catch: java.lang.Throwable -> L1fe
            if (r14 >= r7) goto L1c0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fe
            r7.<init>()     // Catch: java.lang.Throwable -> L1fe
            r7.append(r2)     // Catch: java.lang.Throwable -> L1fe
            java.lang.String r2 = r3.getString(r14)     // Catch: java.lang.Throwable -> L1fe
            r7.append(r2)     // Catch: java.lang.Throwable -> L1fe
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L1fe
            int r7 = r5 + (-1)
            if (r14 >= r7) goto L1bd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fe
            r7.<init>()     // Catch: java.lang.Throwable -> L1fe
            r7.append(r2)     // Catch: java.lang.Throwable -> L1fe
            java.lang.String r2 = ","
            r7.append(r2)     // Catch: java.lang.Throwable -> L1fe
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L1fe
        L1bd:
            int r14 = r14 + 1
            goto L18f
        L1c0:
            r13.b(r2)     // Catch: java.lang.Throwable -> L1fe
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L1fe
            if (r1 == 0) goto L1f1
            boolean r1 = r13 instanceof com.umeng.analytics.pro.ab     // Catch: java.lang.Throwable -> L1fe
            if (r1 == 0) goto L1f1
            r1 = r19
            boolean r2 = r12.has(r1)     // Catch: java.lang.Throwable -> L1fe
            if (r2 == 0) goto L1df
            r2 = r13
            com.umeng.analytics.pro.ab r2 = (com.umeng.analytics.pro.ab) r2     // Catch: java.lang.Throwable -> L1fe
            java.lang.String r1 = r12.optString(r1)     // Catch: java.lang.Throwable -> L1fe
            r2.d(r1)     // Catch: java.lang.Throwable -> L1fe
        L1df:
            r1 = r18
            boolean r2 = r12.has(r1)     // Catch: java.lang.Throwable -> L1fe
            if (r2 == 0) goto L1f1
            r2 = r13
            com.umeng.analytics.pro.ab r2 = (com.umeng.analytics.pro.ab) r2     // Catch: java.lang.Throwable -> L1fe
            java.lang.String r1 = r12.optString(r1)     // Catch: java.lang.Throwable -> L1fe
            r2.c(r1)     // Catch: java.lang.Throwable -> L1fe
        L1f1:
            return r13
        L1f2:
            r17 = r15
            goto L95
        L1f6:
            r17 = 0
            goto L95
        L1fa:
            return r17
        L1fb:
            r17 = 0
            goto L1ff
        L1fe:
            return r13
        L1ff:
            return r17
    }

    public static com.umeng.ccg.d a() {
            com.umeng.ccg.d r0 = com.umeng.ccg.d.b.a()
            return r0
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            r0.addAction(r2)
            com.umeng.ccg.d$c r2 = com.umeng.ccg.d.j
            r1.registerReceiver(r2, r0)
            return
    }

    private void a(android.content.Context r5, java.lang.String r6, long r7) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "@"
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> L5d
            int r0 = r6.length     // Catch: java.lang.Throwable -> L5d
            r1 = 4
            if (r0 != r1) goto L5d
            android.content.SharedPreferences r5 = com.umeng.analytics.pro.ar.a(r5)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L5d
            r0 = 0
            r0 = r6[r0]     // Catch: java.lang.Throwable -> L5d
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L5d
            r2 = 1
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L5d
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "config_ts"
            r5.putLong(r2, r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "iucc_s1"
            r5.putLong(r2, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "iucc_s2"
            android.content.SharedPreferences$Editor r5 = r5.putString(r2, r6)     // Catch: java.lang.Throwable -> L5d
            r5.commit()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "updateTsS1S2 : ts = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L5d
            r2.append(r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = "; s1 = "
            r2.append(r7)     // Catch: java.lang.Throwable -> L5d
            r2.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = "; s2 = "
            r2.append(r7)     // Catch: java.lang.Throwable -> L5d
            r2.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r6)     // Catch: java.lang.Throwable -> L5d
        L5d:
            return
    }

    private void a(android.content.Context r6, org.json.JSONObject r7, java.lang.String r8) {
            r5 = this;
            long r0 = r5.b(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L46
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L46
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L46
            byte[] r7 = com.umeng.analytics.pro.at.a(r7, r2)     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L46
            int r2 = r7.length     // Catch: java.lang.Throwable -> L46
            r3 = 1
            if (r2 > r3) goto L1d
            goto L46
        L1d:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L46
            java.io.File r3 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = com.umeng.ccg.d.b     // Catch: java.lang.Throwable -> L46
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L46
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L46
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L46
            r3.write(r7)     // Catch: java.lang.Throwable -> L41
            r3.flush()     // Catch: java.lang.Throwable -> L41
            com.umeng.analytics.pro.ap.a(r3)     // Catch: java.lang.Throwable -> L46
            r5.a(r6, r8, r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = "MobclickRT"
            java.lang.String r7 = "saveConfigFile success."
            com.umeng.commonsdk.debug.UMRTLog.i(r6, r7)     // Catch: java.lang.Throwable -> L46
            return
        L41:
            r6 = move-exception
            com.umeng.analytics.pro.ap.a(r3)     // Catch: java.lang.Throwable -> L46
            throw r6     // Catch: java.lang.Throwable -> L46
        L46:
            return
    }

    private void a(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "@"
            java.lang.String[] r1 = r11.split(r0)     // Catch: java.lang.Throwable -> Lc0
            int r2 = r1.length     // Catch: java.lang.Throwable -> Lc0
            r3 = 4
            if (r2 == r3) goto Lc
            goto Lc0
        Lc:
            r2 = 0
            r3 = r1[r2]     // Catch: java.lang.Throwable -> Lc0
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> Lc0
            r5 = 1
            r1 = r1[r5]     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = r10.h     // Catch: java.lang.Throwable -> Lc0
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r7 = "MobclickRT"
            if (r6 != 0) goto L42
            java.lang.String r6 = r10.h     // Catch: java.lang.Throwable -> Lc0
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> Lc0
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lc0
            r9 = 2
            if (r8 != r9) goto L42
            r2 = r6[r2]     // Catch: java.lang.Throwable -> Lc0
            long r8 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> Lc0
            r2 = r6[r5]     // Catch: java.lang.Throwable -> Lc0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L42
            boolean r2 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto L42
            java.lang.String r11 = "重复的iucc S1 and S2, 忽略本次更新，不发起fetch。"
            com.umeng.commonsdk.debug.UMRTLog.i(r7, r11)     // Catch: java.lang.Throwable -> Lc0
            return
        L42:
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lc0
            android.content.SharedPreferences r2 = com.umeng.analytics.pro.ar.a(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto Lc0
            java.lang.String r5 = "config_ts"
            r8 = 0
            long r5 = r2.getLong(r5, r8)     // Catch: java.lang.Throwable -> Lc0
            r2 = 101(0x65, float:1.42E-43)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L83
            java.lang.String r5 = "local config ts != iuccS1, send FETCH_NEW_CONFIG msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r7, r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r5.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc0
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc0
            r5.append(r0)     // Catch: java.lang.Throwable -> Lc0
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lc0
            r10.h = r0     // Catch: java.lang.Throwable -> Lc0
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lc0
            com.umeng.ccg.d r1 = a()     // Catch: java.lang.Throwable -> Lc0
            com.umeng.ccg.c.a(r0, r2, r1, r11)     // Catch: java.lang.Throwable -> Lc0
            return
        L83:
            android.content.Context r5 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lc0
            r10.d(r5)     // Catch: java.lang.Throwable -> Lc0
            android.content.Context r5 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r5 = r10.e(r5)     // Catch: java.lang.Throwable -> Lc0
            boolean r5 = r5.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r5 != 0) goto Lc0
            java.lang.String r5 = "local S2 != iuccS2, send FETCH_NEW_CONFIG msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r7, r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r5.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc0
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc0
            r5.append(r0)     // Catch: java.lang.Throwable -> Lc0
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lc0
            r10.h = r0     // Catch: java.lang.Throwable -> Lc0
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lc0
            com.umeng.ccg.d r1 = a()     // Catch: java.lang.Throwable -> Lc0
            com.umeng.ccg.c.a(r0, r2, r1, r11)     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            return
    }

    private void a(java.lang.String r2, com.umeng.analytics.pro.aa r3) {
            r1 = this;
            java.lang.String r0 = "screen_on"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L18
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = com.umeng.ccg.d.e
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.umeng.ccg.d.e = r0
        L13:
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = com.umeng.ccg.d.e
            r0.add(r3)
        L18:
            java.lang.String r0 = "screen_off"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L30
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = com.umeng.ccg.d.f
            if (r0 != 0) goto L2b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.umeng.ccg.d.f = r0
        L2b:
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = com.umeng.ccg.d.f
            r0.add(r3)
        L30:
            java.lang.String r0 = "screen_unlock"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L48
            java.util.ArrayList<com.umeng.analytics.pro.aa> r2 = com.umeng.ccg.d.g
            if (r2 != 0) goto L43
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.umeng.ccg.d.g = r2
        L43:
            java.util.ArrayList<com.umeng.analytics.pro.aa> r2 = com.umeng.ccg.d.g
            r2.add(r3)
        L48:
            return
    }

    private void a(boolean r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L25
            android.content.SharedPreferences r0 = com.umeng.analytics.pro.ar.a(r0)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L25
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "should_fetch"
            if (r3 == 0) goto L1c
            java.lang.String r3 = "1"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L25
            r3.commit()     // Catch: java.lang.Throwable -> L25
            return
        L1c:
            java.lang.String r3 = ""
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L25
            r3.commit()     // Catch: java.lang.Throwable -> L25
        L25:
            return
    }

    private boolean a(org.json.JSONObject r3) {
            r2 = this;
            if (r3 == 0) goto L24
            java.lang.String r0 = "code"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L24
            int r0 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L24
            r1 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L24
            java.lang.String r0 = "cc"
            boolean r0 = r3.has(r0)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L24
            java.lang.String r0 = "ts"
            boolean r3 = r3.has(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    private long b(org.json.JSONObject r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            java.lang.String r0 = "ts"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto Lf
            long r0 = r3.optLong(r0)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.util.ArrayList b() {
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = com.umeng.ccg.d.e
            return r0
    }

    private org.json.JSONObject b(android.content.Context r5) {
            r4 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L38
            java.io.File r2 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = com.umeng.ccg.d.b     // Catch: java.lang.Throwable -> L38
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L13
            return r0
        L13:
            java.io.FileInputStream r5 = r5.openFileInput(r3)     // Catch: java.lang.Throwable -> L34
            byte[] r1 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L35
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L35
            byte[] r1 = com.umeng.analytics.pro.at.a(r1, r2)     // Catch: java.lang.Throwable -> L35
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L35
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            com.umeng.analytics.pro.ap.a(r5)     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = r2
            goto L38
        L34:
            r5 = r0
        L35:
            com.umeng.analytics.pro.ap.a(r5)     // Catch: java.lang.Throwable -> L38
        L38:
            return r0
    }

    private void b(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "interval_"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            android.content.SharedPreferences r0 = com.umeng.analytics.pro.ar.a(r0)
            if (r0 == 0) goto L2a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r4 = r0.putLong(r4, r1)
            r4.commit()
        L2a:
            return
    }

    static /* synthetic */ java.util.ArrayList c() {
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = com.umeng.ccg.d.f
            return r0
    }

    private void c(android.content.Context r3) {
            r2 = this;
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r3)
            com.umeng.ccg.d$1 r0 = new com.umeng.ccg.d$1
            r0.<init>(r2)
            java.lang.String r1 = "iucc"
            r3.registImprintCallback(r1, r0)
            return
    }

    private void c(org.json.JSONObject r10) {
            r9 = this;
            java.lang.String r0 = "screen_unlock"
            java.lang.String r1 = "screen_off"
            java.lang.String r2 = "screen_on"
            java.lang.String r3 = "col_apl"
            java.lang.String r4 = "col_lbs"
            java.lang.String r5 = "col_bs"
            java.lang.String r6 = "col_wifi"
            if (r10 == 0) goto Lc2
            java.lang.String r7 = "cc"
            boolean r8 = r10.has(r7)
            if (r8 != 0) goto L1a
            goto Lc2
        L1a:
            org.json.JSONObject r10 = r10.optJSONObject(r7)     // Catch: java.lang.Throwable -> Lc2
            boolean r7 = r10.has(r6)     // Catch: java.lang.Throwable -> Lc2
            r8 = 0
            if (r7 == 0) goto L2e
            org.json.JSONObject r7 = r10.optJSONObject(r6)     // Catch: java.lang.Throwable -> Lc2
            com.umeng.analytics.pro.z r6 = r9.a(r6, r7)     // Catch: java.lang.Throwable -> Lc2
            goto L2f
        L2e:
            r6 = r8
        L2f:
            boolean r7 = r10.has(r5)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L3e
            org.json.JSONObject r7 = r10.optJSONObject(r5)     // Catch: java.lang.Throwable -> Lc2
            com.umeng.analytics.pro.z r5 = r9.a(r5, r7)     // Catch: java.lang.Throwable -> Lc2
            goto L3f
        L3e:
            r5 = r8
        L3f:
            boolean r7 = r10.has(r4)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L4e
            org.json.JSONObject r7 = r10.optJSONObject(r4)     // Catch: java.lang.Throwable -> Lc2
            com.umeng.analytics.pro.z r4 = r9.a(r4, r7)     // Catch: java.lang.Throwable -> Lc2
            goto L4f
        L4e:
            r4 = r8
        L4f:
            boolean r7 = r10.has(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L5e
            org.json.JSONObject r7 = r10.optJSONObject(r3)     // Catch: java.lang.Throwable -> Lc2
            com.umeng.analytics.pro.z r3 = r9.a(r3, r7)     // Catch: java.lang.Throwable -> Lc2
            goto L5f
        L5e:
            r3 = r8
        L5f:
            boolean r7 = r10.has(r2)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L6e
            org.json.JSONObject r7 = r10.optJSONObject(r2)     // Catch: java.lang.Throwable -> Lc2
            com.umeng.analytics.pro.z r2 = r9.a(r2, r7)     // Catch: java.lang.Throwable -> Lc2
            goto L6f
        L6e:
            r2 = r8
        L6f:
            boolean r7 = r10.has(r1)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L7e
            org.json.JSONObject r7 = r10.optJSONObject(r1)     // Catch: java.lang.Throwable -> Lc2
            com.umeng.analytics.pro.z r1 = r9.a(r1, r7)     // Catch: java.lang.Throwable -> Lc2
            goto L7f
        L7e:
            r1 = r8
        L7f:
            boolean r7 = r10.has(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L8d
            org.json.JSONObject r10 = r10.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lc2
            com.umeng.analytics.pro.z r8 = r9.a(r0, r10)     // Catch: java.lang.Throwable -> Lc2
        L8d:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc2
            r10.<init>()     // Catch: java.lang.Throwable -> Lc2
            if (r6 == 0) goto L97
            r10.add(r6)     // Catch: java.lang.Throwable -> Lc2
        L97:
            if (r5 == 0) goto L9c
            r10.add(r5)     // Catch: java.lang.Throwable -> Lc2
        L9c:
            if (r4 == 0) goto La1
            r10.add(r4)     // Catch: java.lang.Throwable -> Lc2
        La1:
            if (r3 == 0) goto La6
            r10.add(r3)     // Catch: java.lang.Throwable -> Lc2
        La6:
            if (r2 == 0) goto Lab
            r10.add(r2)     // Catch: java.lang.Throwable -> Lc2
        Lab:
            if (r1 == 0) goto Lb0
            r10.add(r1)     // Catch: java.lang.Throwable -> Lc2
        Lb0:
            if (r8 == 0) goto Lb5
            r10.add(r8)     // Catch: java.lang.Throwable -> Lc2
        Lb5:
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> Lc2
            com.umeng.ccg.d r1 = a()     // Catch: java.lang.Throwable -> Lc2
            r2 = 202(0xca, float:2.83E-43)
            com.umeng.ccg.c.a(r0, r2, r1, r10)     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            return
    }

    private java.lang.Long d(android.content.Context r5) {
            r4 = this;
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            android.content.SharedPreferences r5 = com.umeng.analytics.pro.ar.a(r5)     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L17
            java.lang.String r3 = "iucc_s1"
            long r0 = r5.getLong(r3, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L17
            return r5
        L17:
            return r2
    }

    static /* synthetic */ java.util.ArrayList d() {
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = com.umeng.ccg.d.g
            return r0
    }

    private java.lang.String e(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r3 = com.umeng.analytics.pro.ar.a(r3)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto Lf
            java.lang.String r1 = "iucc_s2"
            java.lang.String r3 = r3.getString(r1, r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            return r0
    }

    private boolean e() {
            r4 = this;
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            android.content.SharedPreferences r0 = com.umeng.analytics.pro.ar.a(r0)
            r1 = 0
            if (r0 == 0) goto L3a
            java.lang.String r2 = "sdk_type_ver"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1d
            r4.f()
            return r1
        L1d:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            java.util.Map r0 = com.umeng.analytics.pro.ap.a(r2)     // Catch: java.lang.Throwable -> L3a
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L3a
            java.util.Map r2 = com.umeng.analytics.pro.ap.a()     // Catch: java.lang.Throwable -> L3a
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L3a
            r0 = 1
            return r0
        L3a:
            return r1
    }

    private void f() {
            r3 = this;
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences r0 = com.umeng.analytics.pro.ar.a(r0)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L24
            java.util.Map r1 = com.umeng.analytics.pro.ap.a()     // Catch: java.lang.Throwable -> L24
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L24
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "sdk_type_ver"
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L24
            r0.commit()     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    private boolean g() {
            r3 = this;
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences r0 = com.umeng.analytics.pro.ar.a(r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            java.lang.String r1 = "should_fetch"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L1a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public void a(android.content.Context r4) {
            r3 = this;
            com.umeng.ccg.d r0 = a()
            r1 = 0
            r2 = 105(0x69, float:1.47E-43)
            com.umeng.ccg.c.a(r4, r2, r0, r1)
            return
    }

    @Override // com.umeng.ccg.c.a
    public void a(java.lang.Object r21, int r22) {
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "manual check iucc value: "
            java.lang.String r5 = "iucc"
            java.lang.String r6 = ""
            java.lang.String r7 = "result"
            r8 = 0
            r9 = 0
            java.lang.String r11 = "config"
            r12 = 1
            java.lang.String r13 = "MobclickRT"
            switch(r22) {
                case 101: goto L433;
                case 102: goto L3f2;
                case 103: goto L3bf;
                case 104: goto L3b9;
                case 105: goto L349;
                case 106: goto L2d6;
                case 107: goto L29b;
                default: goto L1c;
            }
        L1c:
            java.lang.String r3 = "screen_on"
            java.lang.String r4 = "screen_off"
            java.lang.String r5 = "screen_unlock"
            switch(r22) {
                case 201: goto L28a;
                case 202: goto L21e;
                case 203: goto L118;
                default: goto L25;
            }
        L25:
            java.lang.String r0 = "https://aspect-upush.umeng.com/occa/v1/event/report"
            switch(r22) {
                case 301: goto Lca;
                case 302: goto L7b;
                case 303: goto L2c;
                default: goto L2a;
            }
        L2a:
            goto L4a7
        L2c:
            java.lang.String r2 = "recv REPORT_SCREEN_UNLOCK msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)
            r1.b(r5)     // Catch: java.lang.Throwable -> L4a7
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r2 = r1.i     // Catch: java.lang.Throwable -> L4a7
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L4a7
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r2 = r1.i     // Catch: java.lang.Throwable -> L4a7
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d$a r2 = (com.umeng.ccg.d.a) r2     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L4a7
            android.content.Context r3 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            org.json.JSONArray r4 = r2.a()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L4a7
            r5 = 2
            org.json.JSONObject r2 = com.umeng.analytics.pro.al.a(r3, r5, r4, r2)     // Catch: java.lang.Throwable -> L4a7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r3.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = "screen_unlock event param: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L4a7
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r3)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.an r3 = new com.umeng.analytics.pro.an     // Catch: java.lang.Throwable -> L4a7
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L4a7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.as.a(r3, r9, r0)     // Catch: java.lang.Throwable -> L4a7
            goto L4a7
        L7b:
            java.lang.String r2 = "recv REPORT_SCREEN_OFF msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)
            r1.b(r4)     // Catch: java.lang.Throwable -> L4a7
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r2 = r1.i     // Catch: java.lang.Throwable -> L4a7
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L4a7
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r2 = r1.i     // Catch: java.lang.Throwable -> L4a7
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d$a r2 = (com.umeng.ccg.d.a) r2     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L4a7
            android.content.Context r3 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            org.json.JSONArray r4 = r2.a()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L4a7
            r5 = 3
            org.json.JSONObject r2 = com.umeng.analytics.pro.al.a(r3, r5, r4, r2)     // Catch: java.lang.Throwable -> L4a7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r3.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = "screen_off event param: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L4a7
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r3)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.an r3 = new com.umeng.analytics.pro.an     // Catch: java.lang.Throwable -> L4a7
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L4a7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.as.a(r3, r9, r0)     // Catch: java.lang.Throwable -> L4a7
            goto L4a7
        Lca:
            java.lang.String r2 = "recv REPORT_SCREEN_ON msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)
            r1.b(r3)     // Catch: java.lang.Throwable -> L4a7
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r2 = r1.i     // Catch: java.lang.Throwable -> L4a7
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L4a7
            java.util.Map<java.lang.String, com.umeng.ccg.d$a> r2 = r1.i     // Catch: java.lang.Throwable -> L4a7
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d$a r2 = (com.umeng.ccg.d.a) r2     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L4a7
            android.content.Context r3 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            org.json.JSONArray r4 = r2.a()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L4a7
            org.json.JSONObject r2 = com.umeng.analytics.pro.al.a(r3, r12, r4, r2)     // Catch: java.lang.Throwable -> L4a7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r3.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = "screen_on event param: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L4a7
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r3)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.an r3 = new com.umeng.analytics.pro.an     // Catch: java.lang.Throwable -> L4a7
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L4a7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.as.a(r3, r9, r0)     // Catch: java.lang.Throwable -> L4a7
            goto L4a7
        L118:
            if (r0 == 0) goto L4a7
            boolean r6 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L4a7
            if (r6 == 0) goto L4a7
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r6 = "actionName"
            java.lang.String r6 = r0.optString(r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r7.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r8 = "recv START_COLLECT msg. name is : "
            r7.append(r8)     // Catch: java.lang.Throwable -> L4a7
            r7.append(r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r7)     // Catch: java.lang.Throwable -> L4a7
            boolean r7 = com.umeng.ccg.b.a(r6)     // Catch: java.lang.Throwable -> L4a7
            if (r7 != 0) goto L15a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r0.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = "Local switch of ["
            r0.append(r2)     // Catch: java.lang.Throwable -> L4a7
            r0.append(r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = "] is off, ignore this command."
            r0.append(r2)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)     // Catch: java.lang.Throwable -> L4a7
            return
        L15a:
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String[] r8 = com.umeng.ccg.d.d     // Catch: java.lang.Throwable -> L4a7
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch: java.lang.Throwable -> L4a7
            boolean r8 = r8.contains(r6)     // Catch: java.lang.Throwable -> L4a7
            if (r8 == 0) goto L1a7
            boolean r0 = r3.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L17e
            java.lang.String r0 = "register Intent.ACTION_SCREEN_ON"
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = "android.intent.action.SCREEN_ON"
            a(r0, r2)     // Catch: java.lang.Throwable -> L4a7
        L17e:
            boolean r0 = r4.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L192
            java.lang.String r0 = "register Intent.ACTION_SCREEN_OFF"
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            a(r0, r2)     // Catch: java.lang.Throwable -> L4a7
        L192:
            boolean r0 = r5.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L4a7
            java.lang.String r0 = "register Intent.ACTION_USER_PRESENT"
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = "android.intent.action.USER_PRESENT"
            a(r0, r2)     // Catch: java.lang.Throwable -> L4a7
            return
        L1a7:
            r1.b(r6)     // Catch: java.lang.Throwable -> L4a7
            boolean r3 = com.umeng.ccg.CcgAgent.hasRegistedActionInfo()     // Catch: java.lang.Throwable -> L4a7
            if (r3 == 0) goto L216
            java.lang.String r3 = "anti"
            com.umeng.ccg.ActionInfo r3 = com.umeng.ccg.CcgAgent.getActionInfo(r3)     // Catch: java.lang.Throwable -> L4a7
            if (r3 == 0) goto L1b9
            r2 = 1
        L1b9:
            java.lang.String r3 = "local_hit_sdk"
            java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Throwable -> L4a7
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4a7
            if (r4 != 0) goto L1f3
            com.umeng.ccg.ActionInfo r4 = com.umeng.ccg.CcgAgent.getActionInfo(r3)     // Catch: java.lang.Throwable -> L4a7
            if (r4 == 0) goto L20c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r5.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r8 = "调用["
            r5.append(r8)     // Catch: java.lang.Throwable -> L4a7
            r5.append(r3)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = "] onCommand接口方法, 参数: "
            r5.append(r3)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4a7
            r5.append(r3)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r3)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r3 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            r4.onCommand(r3, r6, r0)     // Catch: java.lang.Throwable -> L4a7
            goto L20c
        L1f3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r0.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = "忽略 本次采集项["
            r0.append(r3)     // Catch: java.lang.Throwable -> L4a7
            r0.append(r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = "]采集请求."
            r0.append(r3)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)     // Catch: java.lang.Throwable -> L4a7
        L20c:
            if (r2 != 0) goto L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.ap.a(r0, r7)     // Catch: java.lang.Throwable -> L4a7
            return
        L216:
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.ap.a(r0, r7)     // Catch: java.lang.Throwable -> L4a7
            return
        L21e:
            java.lang.String r3 = "recv COLLECTION_JUDGMENT msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r3)     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L4a7
            boolean r3 = r0 instanceof java.util.ArrayList     // Catch: java.lang.Throwable -> L4a7
            if (r3 == 0) goto L4a7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L4a7
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L4a7
            if (r3 <= 0) goto L4a7
        L231:
            if (r2 >= r3) goto L4a7
            java.lang.Object r4 = r0.get(r2)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.z r4 = (com.umeng.analytics.pro.z) r4     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r5 = r4.a()     // Catch: java.lang.Throwable -> L4a7
            org.json.JSONObject r5 = r4.a(r5, r8)     // Catch: java.lang.Throwable -> L4a7
            if (r5 == 0) goto L287
            java.lang.String[] r6 = com.umeng.ccg.d.d     // Catch: java.lang.Throwable -> L4a7
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L4a7
            boolean r4 = r6.contains(r4)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r6 = "delay"
            if (r4 != 0) goto L25e
            long r11 = r5.optLong(r6)     // Catch: java.lang.Throwable -> L4a7
            r14 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r14
            goto L25f
        L25e:
            r11 = r9
        L25f:
            r5.remove(r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r4.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r6 = "send START_COLLECT msg, delayTs = "
            r4.append(r6)     // Catch: java.lang.Throwable -> L4a7
            r4.append(r11)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r4)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r14 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d r16 = a()     // Catch: java.lang.Throwable -> L4a7
            r15 = 203(0xcb, float:2.84E-43)
            r17 = r5
            r18 = r11
            com.umeng.ccg.c.a(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L4a7
        L287:
            int r2 = r2 + 1
            goto L231
        L28a:
            java.lang.String r2 = "recv PARSE_CONFIG msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L4a7
            boolean r2 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L4a7
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L4a7
            r1.c(r0)     // Catch: java.lang.Throwable -> L4a7
            return
        L29b:
            if (r0 == 0) goto L4a7
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2bb
            if (r2 == 0) goto L4a7
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2bb
            r2.<init>()     // Catch: java.lang.Throwable -> L2bb
            java.lang.String r3 = "[IMPRINT_IUCC_CHANGED] iucc : "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2bb
            r2.append(r0)     // Catch: java.lang.Throwable -> L2bb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2bb
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)     // Catch: java.lang.Throwable -> L2bb
            r1.a(r0)     // Catch: java.lang.Throwable -> L2bb
            return
        L2bb:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[imprint] process error "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r13, r0)
            goto L4a7
        L2d6:
            if (r0 == 0) goto L4a7
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L4a7
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L4a7
            boolean r2 = r0.has(r7)     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L300
            int r2 = r0.optInt(r7)     // Catch: java.lang.Throwable -> L4a7
            r2 = r2 & r12
            if (r2 == 0) goto L2fd
            boolean r2 = r0.has(r11)     // Catch: java.lang.Throwable -> L4a7
            if (r2 == 0) goto L2fd
            org.json.JSONObject r0 = r0.optJSONObject(r11)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d.c = r0     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L2fd
            com.umeng.ccg.CcgAgent.notifyConfigReady(r0)     // Catch: java.lang.Throwable -> L4a7
            goto L300
        L2fd:
            com.umeng.ccg.CcgAgent.notifyConfigReady(r8)     // Catch: java.lang.Throwable -> L4a7
        L300:
            boolean r0 = r1.e()     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L324
            java.lang.String r0 = "--->>> 检测到集成的SDK类型集合发生变化，发起云配参数拉取请求(设置本地should fetch标志)."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r5, r6)     // Catch: java.lang.Throwable -> L4a7
            r1.a(r12)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d r3 = a()     // Catch: java.lang.Throwable -> L4a7
            r4 = 101(0x65, float:1.42E-43)
            com.umeng.ccg.c.a(r2, r4, r3, r0)     // Catch: java.lang.Throwable -> L4a7
            return
        L324:
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            r1.c(r0)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r5, r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r2.<init>()     // Catch: java.lang.Throwable -> L4a7
            r2.append(r4)     // Catch: java.lang.Throwable -> L4a7
            r2.append(r0)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)     // Catch: java.lang.Throwable -> L4a7
            r1.a(r0)     // Catch: java.lang.Throwable -> L4a7
            return
        L349:
            java.lang.String[] r0 = com.umeng.ccg.CcgAgent.getCollectItemList()
            int r4 = r0.length
        L34e:
            if (r2 >= r4) goto L379
            r5 = r0[r2]
            java.util.ArrayList r6 = com.umeng.ccg.CcgAgent.getForbidSdkArray(r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[forbid_sdk] 采集项: "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r5 = "; 值: "
            r9.append(r5)
            java.lang.String r5 = r6.toString()
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r5)
            int r2 = r2 + 1
            goto L34e
        L379:
            java.lang.String r0 = "[workEvent]: recv LOAD_CONFIG msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)
            r0 = 106(0x6a, float:1.49E-43)
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L3ae
            org.json.JSONObject r8 = r1.b(r2)     // Catch: java.lang.Throwable -> L3ae
            if (r8 == 0) goto L394
            boolean r2 = r1.a(r8)     // Catch: java.lang.Throwable -> L3ae
            if (r2 == 0) goto L394
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L3ae
        L394:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L3a1
            if (r8 == 0) goto L3a1
        L39e:
            r2.put(r11, r8)     // Catch: java.lang.Throwable -> L3a1
        L3a1:
            android.content.Context r3 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            com.umeng.ccg.d r4 = a()
            com.umeng.ccg.c.a(r3, r0, r4, r2)
            goto L4a7
        L3ae:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L3a1
            if (r8 == 0) goto L3a1
            goto L39e
        L3b9:
            java.lang.String r0 = "[workEvent]: recv FETCH_FAILED msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r0)
            return
        L3bf:
            java.lang.String r3 = "[workEvent]: recv FETCH_SUCCESS msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r3)
            android.content.Context r3 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            if (r0 == 0) goto L4a7
            boolean r4 = r0 instanceof org.json.JSONObject
            if (r4 == 0) goto L4a7
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L4a7
            org.json.JSONObject r4 = r0.optJSONObject(r11)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r5 = "sourceIucc"
            java.lang.String r0 = r0.optString(r5)     // Catch: java.lang.Throwable -> L4a7
            if (r4 == 0) goto L4a7
            boolean r5 = r1.g()     // Catch: java.lang.Throwable -> L4a7
            if (r5 == 0) goto L3ed
            java.lang.String r5 = "--->>> 成功拉取云配参数后，检测到should fetch标志，清除此标志。更新SDK类型集缓存值"
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r5)     // Catch: java.lang.Throwable -> L4a7
            r1.f()     // Catch: java.lang.Throwable -> L4a7
            r1.a(r2)     // Catch: java.lang.Throwable -> L4a7
        L3ed:
            r1.a(r3, r4, r0)     // Catch: java.lang.Throwable -> L4a7
            goto L4a7
        L3f2:
            java.lang.String r2 = "[workEvent]: recv FETCH_RESPONSE msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)
            r1.h = r6
            r2 = 104(0x68, float:1.46E-43)
            if (r0 == 0) goto L427
            boolean r3 = r0 instanceof org.json.JSONObject
            if (r3 == 0) goto L427
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L4a7
            org.json.JSONObject r3 = r0.optJSONObject(r11)     // Catch: java.lang.Throwable -> L4a7
            boolean r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L4a7
            if (r3 == 0) goto L41b
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d r3 = a()     // Catch: java.lang.Throwable -> L4a7
            r4 = 103(0x67, float:1.44E-43)
            com.umeng.ccg.c.a(r2, r4, r3, r0)     // Catch: java.lang.Throwable -> L4a7
            return
        L41b:
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.d r3 = a()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.ccg.c.a(r0, r2, r3, r8)     // Catch: java.lang.Throwable -> L4a7
            return
        L427:
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            com.umeng.ccg.d r3 = a()
            com.umeng.ccg.c.a(r0, r2, r3, r8)
            return
        L433:
            if (r0 == 0) goto L4a7
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L4a7
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[workEvent]: recv FETCH_NEW_CONFIG msg. source iucc is: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            org.json.JSONObject r2 = com.umeng.analytics.pro.al.a(r2, r0)
            if (r2 == 0) goto L47d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r3.<init>()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r7 = "[imprint] send request. body: "
            r3.append(r7)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L4a7
            r3.append(r7)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r3)     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.ao r3 = new com.umeng.analytics.pro.ao     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r7 = "https://ucc.umeng.com/v2/inn/fetch"
            r3.<init>(r7, r2, r0)     // Catch: java.lang.Throwable -> L4a7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L4a7
            com.umeng.analytics.pro.as.a(r3, r9, r0)     // Catch: java.lang.Throwable -> L4a7
        L47d:
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> L4a7
            if (r0 == 0) goto L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            r1.c(r0)     // Catch: java.lang.Throwable -> L4a7
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r5, r6)     // Catch: java.lang.Throwable -> L4a7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a7
            r2.<init>()     // Catch: java.lang.Throwable -> L4a7
            r2.append(r4)     // Catch: java.lang.Throwable -> L4a7
            r2.append(r0)     // Catch: java.lang.Throwable -> L4a7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4a7
            com.umeng.commonsdk.debug.UMRTLog.i(r13, r2)     // Catch: java.lang.Throwable -> L4a7
            r1.a(r0)     // Catch: java.lang.Throwable -> L4a7
        L4a7:
            return
    }
}
