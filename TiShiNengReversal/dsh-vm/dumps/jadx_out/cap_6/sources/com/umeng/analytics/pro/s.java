package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class s {
    private static final java.lang.String a = "fs_lc_tl_uapp";
    private static final java.lang.String f = "-1";
    private static android.content.Context g;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private org.json.JSONObject h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.s$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.pro.s a = null;

        static {
                com.umeng.analytics.pro.s r0 = new com.umeng.analytics.pro.s
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.pro.s.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.pro.s a() {
                com.umeng.analytics.pro.s r0 = com.umeng.analytics.pro.s.a.a
                return r0
        }
    }

    private s() {
            r1 = this;
            r1.<init>()
            r0 = 128(0x80, float:1.8E-43)
            r1.b = r0
            r0 = 256(0x100, float:3.59E-43)
            r1.c = r0
            r0 = 1024(0x400, float:1.435E-42)
            r1.d = r0
            r0 = 10
            r1.e = r0
            r0 = 0
            r1.h = r0
            android.content.Context r0 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L1b
            r1.b(r0)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    /* synthetic */ s(com.umeng.analytics.pro.s.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.pro.s a(android.content.Context r1) {
            android.content.Context r0 = com.umeng.analytics.pro.s.g
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.analytics.pro.s.g = r1
        L10:
            com.umeng.analytics.pro.s r1 = com.umeng.analytics.pro.s.a.a()
            return r1
    }

    private org.json.JSONObject a(java.util.Map<java.lang.String, java.lang.Object> r8) {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Exception -> L13b
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L13b
        Ld:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L13b
            if (r1 == 0) goto L13b
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L4e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> L4e
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L4e
            if (r2 == 0) goto Ld
            r3 = 128(0x80, float:1.8E-43)
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.HelperUtils.subStr(r2, r3)     // Catch: java.lang.Exception -> L4e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto Ld
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Exception -> L4e
            boolean r3 = r3.isArray()     // Catch: java.lang.Exception -> L4e
            r4 = 0
            if (r3 == 0) goto Lc0
            boolean r3 = r1 instanceof int[]     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L55
            int[] r1 = (int[]) r1     // Catch: java.lang.Exception -> L4e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
        L43:
            int r5 = r1.length     // Catch: java.lang.Exception -> L4e
            if (r4 >= r5) goto L51
            r5 = r1[r4]     // Catch: java.lang.Exception -> L4e
            r3.put(r5)     // Catch: java.lang.Exception -> L4e
            int r4 = r4 + 1
            goto L43
        L4e:
            r1 = move-exception
            goto L136
        L51:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L4e
            goto Ld
        L55:
            boolean r3 = r1 instanceof double[]     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L6f
            double[] r1 = (double[]) r1     // Catch: java.lang.Exception -> L4e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
        L60:
            int r5 = r1.length     // Catch: java.lang.Exception -> L4e
            if (r4 >= r5) goto L6b
            r5 = r1[r4]     // Catch: java.lang.Exception -> L4e
            r3.put(r5)     // Catch: java.lang.Exception -> L4e
            int r4 = r4 + 1
            goto L60
        L6b:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L4e
            goto Ld
        L6f:
            boolean r3 = r1 instanceof long[]     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L89
            long[] r1 = (long[]) r1     // Catch: java.lang.Exception -> L4e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
        L7a:
            int r5 = r1.length     // Catch: java.lang.Exception -> L4e
            if (r4 >= r5) goto L85
            r5 = r1[r4]     // Catch: java.lang.Exception -> L4e
            r3.put(r5)     // Catch: java.lang.Exception -> L4e
            int r4 = r4 + 1
            goto L7a
        L85:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L4e
            goto Ld
        L89:
            boolean r3 = r1 instanceof float[]     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto La5
            float[] r1 = (float[]) r1     // Catch: java.lang.Exception -> L4e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
        L94:
            int r5 = r1.length     // Catch: java.lang.Exception -> L4e
            if (r4 >= r5) goto La0
            r5 = r1[r4]     // Catch: java.lang.Exception -> L4e
            double r5 = (double) r5     // Catch: java.lang.Exception -> L4e
            r3.put(r5)     // Catch: java.lang.Exception -> L4e
            int r4 = r4 + 1
            goto L94
        La0:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L4e
            goto Ld
        La5:
            boolean r3 = r1 instanceof short[]     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto Ld
            short[] r1 = (short[]) r1     // Catch: java.lang.Exception -> L4e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
        Lb0:
            int r5 = r1.length     // Catch: java.lang.Exception -> L4e
            if (r4 >= r5) goto Lbb
            short r5 = r1[r4]     // Catch: java.lang.Exception -> L4e
            r3.put(r5)     // Catch: java.lang.Exception -> L4e
            int r4 = r4 + 1
            goto Lb0
        Lbb:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L4e
            goto Ld
        Lc0:
            boolean r3 = r1 instanceof java.util.List     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L102
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L4e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
        Lcb:
            int r5 = r1.size()     // Catch: java.lang.Exception -> L4e
            if (r4 >= r5) goto Lf7
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Exception -> L4e
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L4e
            if (r6 != 0) goto Led
            boolean r6 = r5 instanceof java.lang.Long     // Catch: java.lang.Exception -> L4e
            if (r6 != 0) goto Led
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L4e
            if (r6 != 0) goto Led
            boolean r6 = r5 instanceof java.lang.Float     // Catch: java.lang.Exception -> L4e
            if (r6 != 0) goto Led
            boolean r6 = r5 instanceof java.lang.Double     // Catch: java.lang.Exception -> L4e
            if (r6 != 0) goto Led
            boolean r5 = r5 instanceof java.lang.Short     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto Lf4
        Led:
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Exception -> L4e
            r3.put(r5)     // Catch: java.lang.Exception -> L4e
        Lf4:
            int r4 = r4 + 1
            goto Lcb
        Lf7:
            int r1 = r3.length()     // Catch: java.lang.Exception -> L4e
            if (r1 <= 0) goto Ld
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L4e
            goto Ld
        L102:
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L115
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L4e
            r3 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.HelperUtils.subStr(r1, r3)     // Catch: java.lang.Exception -> L4e
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L4e
            goto Ld
        L115:
            boolean r3 = r1 instanceof java.lang.Long     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L131
            boolean r3 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L131
            boolean r3 = r1 instanceof java.lang.Float     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L131
            boolean r3 = r1 instanceof java.lang.Double     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L131
            boolean r3 = r1 instanceof java.lang.Short     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L12a
            goto L131
        L12a:
            java.lang.String r1 = "The param has not support type. please check !"
            com.umeng.commonsdk.statistics.common.MLog.e(r1)     // Catch: java.lang.Exception -> L4e
            goto Ld
        L131:
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L4e
            goto Ld
        L136:
            com.umeng.commonsdk.statistics.common.MLog.e(r1)     // Catch: java.lang.Exception -> L13b
            goto Ld
        L13b:
            return r0
    }

    private void a() {
            r6 = this;
            android.content.Context r0 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = "track_list"
            java.lang.String r2 = ""
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)     // Catch: java.lang.Exception -> L66
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L66
            if (r1 != 0) goto L66
            java.lang.String r1 = "!"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Exception -> L66
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L66
            r1.<init>()     // Catch: java.lang.Exception -> L66
            org.json.JSONObject r2 = r6.h     // Catch: java.lang.Exception -> L66
            r3 = 0
            if (r2 == 0) goto L40
            r2 = 0
        L21:
            int r4 = r0.length     // Catch: java.lang.Exception -> L66
            if (r2 >= r4) goto L40
            r4 = r0[r2]     // Catch: java.lang.Exception -> L66
            r5 = 128(0x80, float:1.8E-43)
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.HelperUtils.subStr(r4, r5)     // Catch: java.lang.Exception -> L66
            org.json.JSONObject r5 = r6.h     // Catch: java.lang.Exception -> L66
            boolean r5 = r5.has(r4)     // Catch: java.lang.Exception -> L66
            if (r5 == 0) goto L3d
            org.json.JSONObject r5 = r6.h     // Catch: java.lang.Exception -> L66
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Exception -> L66
            r1.put(r4, r5)     // Catch: java.lang.Exception -> L66
        L3d:
            int r2 = r2 + 1
            goto L21
        L40:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L66
            r2.<init>()     // Catch: java.lang.Exception -> L66
            r6.h = r2     // Catch: java.lang.Exception -> L66
            int r2 = r0.length     // Catch: java.lang.Exception -> L66
            r4 = 10
            if (r2 < r4) goto L56
        L4c:
            if (r3 >= r4) goto L61
            r2 = r0[r3]     // Catch: java.lang.Exception -> L66
            r6.a(r2, r1)     // Catch: java.lang.Exception -> L66
            int r3 = r3 + 1
            goto L4c
        L56:
            int r2 = r0.length     // Catch: java.lang.Exception -> L66
            if (r3 >= r2) goto L61
            r2 = r0[r3]     // Catch: java.lang.Exception -> L66
            r6.a(r2, r1)     // Catch: java.lang.Exception -> L66
            int r3 = r3 + 1
            goto L56
        L61:
            android.content.Context r0 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Exception -> L66
            r6.c(r0)     // Catch: java.lang.Exception -> L66
        L66:
            return
    }

    private void a(java.lang.String r2, org.json.JSONObject r3) throws org.json.JSONException {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.HelperUtils.subStr(r2, r0)
            boolean r0 = r3.has(r2)
            if (r0 == 0) goto L1a
            java.lang.Object r3 = r3.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r1.a(r2, r3)
            return
        L1a:
            r3 = 0
            r1.a(r2, r3)
            return
    }

    private void a(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "$st_fl"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L2d
            java.lang.String r0 = "du"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L2d
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L2d
            java.lang.String r0 = "ts"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L2d
            org.json.JSONObject r0 = r1.h     // Catch: java.lang.Exception -> L2d
            boolean r0 = r0.has(r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L2d
            org.json.JSONObject r0 = r1.h     // Catch: java.lang.Exception -> L2d
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L2d
        L2d:
            return
    }

    private boolean a(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L13
            java.lang.String r0 = r3.trim()     // Catch: java.lang.Exception -> L13
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L13
            int r0 = r0.length     // Catch: java.lang.Exception -> L13
            if (r0 <= 0) goto L13
            r1 = 128(0x80, float:1.8E-43)
            if (r0 > r1) goto L13
            r3 = 1
            return r3
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "key is "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", please check key, illegal"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.umeng.commonsdk.statistics.common.MLog.e(r3)
            r3 = 0
            return r3
    }

    private void b(android.content.Context r3) {
            r2 = this;
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "fs_lc_tl_uapp"
            r1 = 0
            java.lang.String r3 = r3.getString(r0, r1)     // Catch: java.lang.Exception -> L1b
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L18
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L1b
            r2.h = r0     // Catch: java.lang.Exception -> L1b
        L18:
            r2.a()     // Catch: java.lang.Exception -> L1b
        L1b:
            return
    }

    private boolean b(java.lang.String r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.trim()     // Catch: java.lang.Exception -> L12
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L12
            int r1 = r1.length     // Catch: java.lang.Exception -> L12
            r2 = 256(0x100, float:3.59E-43)
            if (r1 > r2) goto L12
            return r0
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "value is "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", please check value, illegal"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.umeng.commonsdk.statistics.common.MLog.e(r4)
            r4 = 0
            return r4
    }

    private boolean b(java.util.Map<java.lang.String, java.lang.Object> r6) {
            r5 = this;
            java.lang.String r0 = "\\|"
            r1 = 0
            if (r6 == 0) goto L9b
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Exception -> La1
            if (r2 == 0) goto Ld
            goto L9b
        Ld:
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Exception -> La1
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> La1
        L15:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> La1
            if (r2 == 0) goto La1
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> La1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> La1
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Exception -> La1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> La1
            boolean r3 = r5.a(r3)     // Catch: java.lang.Exception -> La1
            if (r3 != 0) goto L33
            java.lang.String r6 = com.umeng.analytics.pro.j.h     // Catch: java.lang.Exception -> La1
            com.umeng.commonsdk.debug.UMLog.aq(r6, r1, r0)     // Catch: java.lang.Exception -> La1
            return r1
        L33:
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Exception -> La1
            if (r3 != 0) goto L3f
            java.lang.String r6 = com.umeng.analytics.pro.j.i     // Catch: java.lang.Exception -> La1
            com.umeng.commonsdk.debug.UMLog.aq(r6, r1, r0)     // Catch: java.lang.Exception -> La1
            return r1
        L3f:
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Exception -> La1
            boolean r3 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto L15
            java.lang.String r3 = "_$!link"
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Exception -> La1
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto L67
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> La1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> La1
            boolean r2 = r5.c(r2)     // Catch: java.lang.Exception -> La1
            if (r2 != 0) goto L15
            java.lang.String r6 = "MobclickAgent.onDeepLinkReceived方法link参数长度超过限制。|参数link长度不能超过1024字符。"
            com.umeng.commonsdk.debug.UMLog.aq(r6, r1, r0)     // Catch: java.lang.Exception -> La1
            return r1
        L67:
            java.lang.String r3 = "_$!url"
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Exception -> La1
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto L87
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> La1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> La1
            boolean r2 = r5.c(r2)     // Catch: java.lang.Exception -> La1
            if (r2 != 0) goto L15
            java.lang.String r6 = "url参数长度超过限制。|参数url长度不能超过1024字符。"
            com.umeng.commonsdk.debug.UMLog.aq(r6, r1, r0)     // Catch: java.lang.Exception -> La1
            return r1
        L87:
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> La1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> La1
            boolean r2 = r5.b(r2)     // Catch: java.lang.Exception -> La1
            if (r2 != 0) goto L15
            java.lang.String r6 = com.umeng.analytics.pro.j.j     // Catch: java.lang.Exception -> La1
            com.umeng.commonsdk.debug.UMLog.aq(r6, r1, r0)     // Catch: java.lang.Exception -> La1
            return r1
        L9b:
            java.lang.String r6 = com.umeng.analytics.pro.j.g     // Catch: java.lang.Exception -> La1
            com.umeng.commonsdk.debug.UMLog.aq(r6, r1, r0)     // Catch: java.lang.Exception -> La1
            return r1
        La1:
            r6 = 1
            return r6
    }

    private void c(android.content.Context r3) {
            r2 = this;
            org.json.JSONObject r3 = r2.h     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1d
            android.content.Context r3 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "fs_lc_tl_uapp"
            org.json.JSONObject r1 = r2.h     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences$Editor r3 = r3.putString(r0, r1)     // Catch: java.lang.Throwable -> L1d
            r3.commit()     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    private boolean c(java.lang.String r3) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Exception -> L12
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L12
            int r3 = r3.length     // Catch: java.lang.Exception -> L12
            r1 = 1024(0x400, float:1.435E-42)
            if (r3 > r1) goto L12
            return r0
        L12:
            r3 = 0
            return r3
    }

    public void a(java.lang.String r7, java.lang.String r8, long r9, int r11, java.lang.String r12) {
            r6 = this;
            boolean r11 = r6.a(r7)     // Catch: java.lang.Throwable -> L104
            java.lang.String r0 = "\\|"
            r1 = 0
            if (r11 == 0) goto Lff
            boolean r11 = r6.b(r8)     // Catch: java.lang.Throwable -> L104
            if (r11 != 0) goto L11
            goto Lff
        L11:
            java.lang.String[] r11 = com.umeng.analytics.pro.d.aM     // Catch: java.lang.Throwable -> L104
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch: java.lang.Throwable -> L104
            boolean r11 = r11.contains(r7)     // Catch: java.lang.Throwable -> L104
            if (r11 == 0) goto L3c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L104
            r8.<init>()     // Catch: java.lang.Throwable -> L104
            java.lang.String r9 = "key is "
            r8.append(r9)     // Catch: java.lang.Throwable -> L104
            r8.append(r7)     // Catch: java.lang.Throwable -> L104
            java.lang.String r7 = ", please check key, illegal"
            r8.append(r7)     // Catch: java.lang.Throwable -> L104
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L104
            com.umeng.commonsdk.statistics.common.MLog.e(r7)     // Catch: java.lang.Throwable -> L104
            java.lang.String r7 = com.umeng.analytics.pro.j.m     // Catch: java.lang.Throwable -> L104
            com.umeng.commonsdk.debug.UMLog.aq(r7, r1, r0)     // Catch: java.lang.Throwable -> L104
            return
        L3c:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L104
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L104
            r11.<init>()     // Catch: java.lang.Throwable -> L104
            java.lang.String r0 = "id"
            r11.put(r0, r7)     // Catch: java.lang.Throwable -> L104
            java.lang.String r0 = "ts"
            r11.put(r0, r2)     // Catch: java.lang.Throwable -> L104
            r4 = 0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5a
            java.lang.String r0 = "du"
            r11.put(r0, r9)     // Catch: java.lang.Throwable -> L104
        L5a:
            java.lang.String r9 = "__t"
            r10 = 2049(0x801, float:2.871E-42)
            r11.put(r9, r10)     // Catch: java.lang.Throwable -> L104
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L104
            if (r9 != 0) goto L6a
            r11.put(r7, r8)     // Catch: java.lang.Throwable -> L104
        L6a:
            android.content.Context r8 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L104
            boolean r8 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r8)     // Catch: java.lang.Throwable -> L104
            if (r8 == 0) goto L81
            com.umeng.analytics.pro.y r8 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> L104
            android.content.Context r9 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L104
            android.content.Context r9 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r9)     // Catch: java.lang.Throwable -> L104
            java.lang.String r8 = r8.d(r9)     // Catch: java.lang.Throwable -> L104
            goto L8f
        L81:
            com.umeng.analytics.pro.y r8 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> L104
            android.content.Context r9 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L104
            android.content.Context r9 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r9)     // Catch: java.lang.Throwable -> L104
            java.lang.String r8 = r8.a(r9, r2)     // Catch: java.lang.Throwable -> L104
        L8f:
            java.lang.String r9 = "__i"
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L104
            if (r10 == 0) goto L99
            java.lang.String r8 = "-1"
        L99:
            r11.put(r9, r8)     // Catch: java.lang.Throwable -> L104
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L104
            if (r8 != 0) goto Lb2
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb2 java.lang.Throwable -> L104
            r8.<init>(r12)     // Catch: org.json.JSONException -> Lb2 java.lang.Throwable -> L104
            int r9 = r8.length()     // Catch: org.json.JSONException -> Lb2 java.lang.Throwable -> L104
            if (r9 <= 0) goto Lb2
            java.lang.String r9 = "_$sp"
            r11.put(r9, r8)     // Catch: org.json.JSONException -> Lb2 java.lang.Throwable -> L104
        Lb2:
            java.lang.String r8 = "ds"
            r11.put(r8, r1)     // Catch: java.lang.Throwable -> L104
            java.lang.String r8 = "pn"
            android.content.Context r9 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L104
            com.umeng.commonsdk.service.UMGlobalContext r9 = com.umeng.commonsdk.service.UMGlobalContext.getInstance(r9)     // Catch: java.lang.Throwable -> L104
            android.content.Context r10 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L104
            java.lang.String r9 = r9.getProcessName(r10)     // Catch: java.lang.Throwable -> L104
            r11.put(r8, r9)     // Catch: java.lang.Throwable -> L104
            r6.a()     // Catch: java.lang.Throwable -> L104
            org.json.JSONObject r8 = r6.h     // Catch: java.lang.Throwable -> L104
            if (r8 == 0) goto Lf3
            boolean r8 = r8.has(r7)     // Catch: java.lang.Throwable -> L104
            if (r8 == 0) goto Lf3
            org.json.JSONObject r8 = r6.h     // Catch: java.lang.Throwable -> L104
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L104
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L104
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L104
            if (r8 != 0) goto Lf3
            java.lang.String r8 = "$st_fl"
            r9 = 1
            r11.put(r8, r9)     // Catch: java.lang.Throwable -> L104
            org.json.JSONObject r8 = r6.h     // Catch: java.lang.Throwable -> L104
            r8.put(r7, r9)     // Catch: java.lang.Throwable -> L104
            android.content.Context r7 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L104
            r6.c(r7)     // Catch: java.lang.Throwable -> L104
        Lf3:
            android.content.Context r7 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L104
            com.umeng.analytics.CoreProtocol r8 = com.umeng.analytics.CoreProtocol.getInstance(r7)     // Catch: java.lang.Throwable -> L104
            r9 = 4097(0x1001, float:5.741E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r7, r9, r8, r11)     // Catch: java.lang.Throwable -> L104
            goto L104
        Lff:
            java.lang.String r7 = com.umeng.analytics.pro.j.l     // Catch: java.lang.Throwable -> L104
            com.umeng.commonsdk.debug.UMLog.aq(r7, r1, r0)     // Catch: java.lang.Throwable -> L104
        L104:
            return
    }

    public void a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, long r11, java.lang.String r13, boolean r14) {
            r8 = this;
            java.lang.String r0 = "ts"
            boolean r1 = r8.a(r9)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r2 = "\\|"
            r3 = 0
            if (r1 != 0) goto L11
            java.lang.String r9 = com.umeng.analytics.pro.j.f     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.debug.UMLog.aq(r9, r3, r2)     // Catch: java.lang.Throwable -> L2d6
            return
        L11:
            boolean r1 = r8.b(r10)     // Catch: java.lang.Throwable -> L2d6
            if (r1 != 0) goto L19
            goto L2d6
        L19:
            int r1 = r10.size()     // Catch: java.lang.Throwable -> L2d6
            r4 = 100
            if (r1 <= r4) goto L3f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d6
            r9.<init>()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = "map size is "
            r9.append(r11)     // Catch: java.lang.Throwable -> L2d6
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L2d6
            r9.append(r10)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r10 = ", please check"
            r9.append(r10)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.statistics.common.MLog.e(r9)     // Catch: java.lang.Throwable -> L2d6
            return
        L3f:
            java.lang.String[] r1 = com.umeng.analytics.pro.d.aM     // Catch: java.lang.Throwable -> L2d6
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L2d6
            boolean r1 = r1.contains(r9)     // Catch: java.lang.Throwable -> L2d6
            if (r1 == 0) goto L6a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d6
            r10.<init>()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = "key is "
            r10.append(r11)     // Catch: java.lang.Throwable -> L2d6
            r10.append(r9)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r9 = ", please check key, illegal"
            r10.append(r9)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.statistics.common.MLog.e(r9)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r9 = com.umeng.analytics.pro.j.b     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.debug.UMLog.aq(r9, r3, r2)     // Catch: java.lang.Throwable -> L2d6
            return
        L6a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2d6
            r1.<init>()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r4 = "id"
            r1.put(r4, r9)     // Catch: java.lang.Throwable -> L2d6
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2d6
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L2d6
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L86
            java.lang.String r4 = "du"
            r1.put(r4, r11)     // Catch: java.lang.Throwable -> L2d6
        L86:
            java.lang.String r11 = "__t"
            r12 = 2049(0x801, float:2.871E-42)
            r1.put(r11, r12)     // Catch: java.lang.Throwable -> L2d6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d6
            r11.<init>()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r12 = "befort ekv map, event is "
            r11.append(r12)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L2d6
            r11.append(r12)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.statistics.common.ULog.i(r11)     // Catch: java.lang.Throwable -> L2d6
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L2d6
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2d6
        Lad:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L2d6
            if (r11 == 0) goto L218
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L2d6
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> L2d6
            java.lang.String[] r12 = com.umeng.analytics.pro.d.aM     // Catch: java.lang.Throwable -> L2d6
            java.util.List r12 = java.util.Arrays.asList(r12)     // Catch: java.lang.Throwable -> L2d6
            java.lang.Object r4 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            boolean r12 = r12.contains(r4)     // Catch: java.lang.Throwable -> L2d6
            if (r12 != 0) goto L212
            java.lang.Object r12 = r11.getValue()     // Catch: java.lang.Throwable -> L2d6
            boolean r4 = r12 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2d6
            if (r4 != 0) goto L207
            boolean r4 = r12 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L2d6
            if (r4 != 0) goto L207
            boolean r4 = r12 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L2d6
            if (r4 != 0) goto L207
            boolean r4 = r12 instanceof java.lang.Short     // Catch: java.lang.Throwable -> L2d6
            if (r4 != 0) goto L207
            boolean r4 = r12 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L2d6
            if (r4 != 0) goto L207
            boolean r4 = r12 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L2d6
            if (r4 == 0) goto Le7
            goto L207
        Le7:
            java.lang.Class r4 = r12.getClass()     // Catch: java.lang.Throwable -> L2d6
            boolean r4 = r4.isArray()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r5 = "please check key or value, illegal type!"
            if (r4 == 0) goto L203
            boolean r4 = r12 instanceof int[]     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r6 = "please check key or value, size overlength!"
            r7 = 10
            if (r4 == 0) goto L11f
            int[] r12 = (int[]) r12     // Catch: java.lang.Throwable -> L2d6
            int r4 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r4 <= r7) goto L104
            com.umeng.commonsdk.statistics.common.MLog.e(r6)     // Catch: java.lang.Throwable -> L2d6
            return
        L104:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d6
            r4.<init>()     // Catch: java.lang.Throwable -> L2d6
            r5 = 0
        L10a:
            int r6 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r5 >= r6) goto L115
            r6 = r12[r5]     // Catch: java.lang.Throwable -> L2d6
            r4.put(r6)     // Catch: java.lang.Throwable -> L2d6
            int r5 = r5 + 1
            goto L10a
        L115:
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2d6
            r1.put(r11, r4)     // Catch: java.lang.Throwable -> L2d6
            goto Lad
        L11f:
            boolean r4 = r12 instanceof double[]     // Catch: java.lang.Throwable -> L2d6
            if (r4 == 0) goto L148
            double[] r12 = (double[]) r12     // Catch: java.lang.Throwable -> L2d6
            int r4 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r4 <= r7) goto L12c
            com.umeng.commonsdk.statistics.common.MLog.e(r6)     // Catch: java.lang.Throwable -> L2d6
            return
        L12c:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d6
            r4.<init>()     // Catch: java.lang.Throwable -> L2d6
            r5 = 0
        L132:
            int r6 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r5 >= r6) goto L13d
            r6 = r12[r5]     // Catch: java.lang.Throwable -> L2d6
            r4.put(r6)     // Catch: java.lang.Throwable -> L2d6
            int r5 = r5 + 1
            goto L132
        L13d:
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2d6
            r1.put(r11, r4)     // Catch: java.lang.Throwable -> L2d6
            goto Lad
        L148:
            boolean r4 = r12 instanceof long[]     // Catch: java.lang.Throwable -> L2d6
            if (r4 == 0) goto L171
            long[] r12 = (long[]) r12     // Catch: java.lang.Throwable -> L2d6
            int r4 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r4 <= r7) goto L155
            com.umeng.commonsdk.statistics.common.MLog.e(r6)     // Catch: java.lang.Throwable -> L2d6
            return
        L155:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d6
            r4.<init>()     // Catch: java.lang.Throwable -> L2d6
            r5 = 0
        L15b:
            int r6 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r5 >= r6) goto L166
            r6 = r12[r5]     // Catch: java.lang.Throwable -> L2d6
            r4.put(r6)     // Catch: java.lang.Throwable -> L2d6
            int r5 = r5 + 1
            goto L15b
        L166:
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2d6
            r1.put(r11, r4)     // Catch: java.lang.Throwable -> L2d6
            goto Lad
        L171:
            boolean r4 = r12 instanceof float[]     // Catch: java.lang.Throwable -> L2d6
            if (r4 == 0) goto L19b
            float[] r12 = (float[]) r12     // Catch: java.lang.Throwable -> L2d6
            int r4 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r4 <= r7) goto L17e
            com.umeng.commonsdk.statistics.common.MLog.e(r6)     // Catch: java.lang.Throwable -> L2d6
            return
        L17e:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d6
            r4.<init>()     // Catch: java.lang.Throwable -> L2d6
            r5 = 0
        L184:
            int r6 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r5 >= r6) goto L190
            r6 = r12[r5]     // Catch: java.lang.Throwable -> L2d6
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L2d6
            r4.put(r6)     // Catch: java.lang.Throwable -> L2d6
            int r5 = r5 + 1
            goto L184
        L190:
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2d6
            r1.put(r11, r4)     // Catch: java.lang.Throwable -> L2d6
            goto Lad
        L19b:
            boolean r4 = r12 instanceof short[]     // Catch: java.lang.Throwable -> L2d6
            if (r4 == 0) goto L1c4
            short[] r12 = (short[]) r12     // Catch: java.lang.Throwable -> L2d6
            int r4 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r4 <= r7) goto L1a8
            com.umeng.commonsdk.statistics.common.MLog.e(r6)     // Catch: java.lang.Throwable -> L2d6
            return
        L1a8:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d6
            r4.<init>()     // Catch: java.lang.Throwable -> L2d6
            r5 = 0
        L1ae:
            int r6 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r5 >= r6) goto L1b9
            short r6 = r12[r5]     // Catch: java.lang.Throwable -> L2d6
            r4.put(r6)     // Catch: java.lang.Throwable -> L2d6
            int r5 = r5 + 1
            goto L1ae
        L1b9:
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2d6
            r1.put(r11, r4)     // Catch: java.lang.Throwable -> L2d6
            goto Lad
        L1c4:
            boolean r4 = r12 instanceof java.lang.String[]     // Catch: java.lang.Throwable -> L2d6
            if (r4 == 0) goto L1ff
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.lang.Throwable -> L2d6
            int r4 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r4 <= r7) goto L1d1
            com.umeng.commonsdk.statistics.common.MLog.e(r6)     // Catch: java.lang.Throwable -> L2d6
            return
        L1d1:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d6
            r4.<init>()     // Catch: java.lang.Throwable -> L2d6
            r5 = 0
        L1d7:
            int r6 = r12.length     // Catch: java.lang.Throwable -> L2d6
            if (r5 >= r6) goto L1f4
            r6 = r12[r5]     // Catch: java.lang.Throwable -> L2d6
            if (r6 != 0) goto L1e4
            java.lang.String r9 = "please check array, null item!"
            com.umeng.commonsdk.statistics.common.MLog.e(r9)     // Catch: java.lang.Throwable -> L2d6
            return
        L1e4:
            boolean r6 = r8.b(r6)     // Catch: java.lang.Throwable -> L2d6
            if (r6 != 0) goto L1ec
            goto L2d6
        L1ec:
            r6 = r12[r5]     // Catch: java.lang.Throwable -> L2d6
            r4.put(r6)     // Catch: java.lang.Throwable -> L2d6
            int r5 = r5 + 1
            goto L1d7
        L1f4:
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2d6
            r1.put(r11, r4)     // Catch: java.lang.Throwable -> L2d6
            goto Lad
        L1ff:
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> L2d6
            return
        L203:
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> L2d6
            return
        L207:
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2d6
            r1.put(r11, r12)     // Catch: java.lang.Throwable -> L2d6
            goto Lad
        L212:
            java.lang.String r9 = com.umeng.analytics.pro.j.e     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.debug.UMLog.aq(r9, r3, r2)     // Catch: java.lang.Throwable -> L2d6
            return
        L218:
            android.content.Context r10 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            boolean r10 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r10)     // Catch: java.lang.Throwable -> L2d6
            if (r10 == 0) goto L22f
            com.umeng.analytics.pro.y r10 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> L2d6
            android.content.Context r11 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            android.content.Context r11 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r11)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r10 = r10.d(r11)     // Catch: java.lang.Throwable -> L2d6
            goto L241
        L22f:
            com.umeng.analytics.pro.y r10 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> L2d6
            android.content.Context r11 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            android.content.Context r11 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r11)     // Catch: java.lang.Throwable -> L2d6
            long r4 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r10 = r10.a(r11, r4)     // Catch: java.lang.Throwable -> L2d6
        L241:
            java.lang.String r11 = "__i"
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L2d6
            if (r12 == 0) goto L24b
            java.lang.String r10 = "-1"
        L24b:
            r1.put(r11, r10)     // Catch: java.lang.Throwable -> L2d6
            boolean r10 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L2d6
            if (r10 != 0) goto L264
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L264 java.lang.Throwable -> L2d6
            r10.<init>(r13)     // Catch: org.json.JSONException -> L264 java.lang.Throwable -> L2d6
            int r11 = r10.length()     // Catch: org.json.JSONException -> L264 java.lang.Throwable -> L2d6
            if (r11 <= 0) goto L264
            java.lang.String r11 = "_$sp"
            r1.put(r11, r10)     // Catch: org.json.JSONException -> L264 java.lang.Throwable -> L2d6
        L264:
            java.lang.String r10 = "ds"
            r1.put(r10, r3)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r10 = "pn"
            android.content.Context r11 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.service.UMGlobalContext r11 = com.umeng.commonsdk.service.UMGlobalContext.getInstance(r11)     // Catch: java.lang.Throwable -> L2d6
            android.content.Context r12 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = r11.getProcessName(r12)     // Catch: java.lang.Throwable -> L2d6
            r1.put(r10, r11)     // Catch: java.lang.Throwable -> L2d6
            r8.a()     // Catch: java.lang.Throwable -> L2d6
            org.json.JSONObject r10 = r8.h     // Catch: java.lang.Throwable -> L2d6
            if (r10 == 0) goto L2a5
            boolean r10 = r10.has(r9)     // Catch: java.lang.Throwable -> L2d6
            if (r10 == 0) goto L2a5
            org.json.JSONObject r10 = r8.h     // Catch: java.lang.Throwable -> L2d6
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Throwable -> L2d6
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2d6
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2d6
            if (r10 != 0) goto L2a5
            java.lang.String r10 = "$st_fl"
            r11 = 1
            r1.put(r10, r11)     // Catch: java.lang.Throwable -> L2d6
            org.json.JSONObject r10 = r8.h     // Catch: java.lang.Throwable -> L2d6
            r10.put(r9, r11)     // Catch: java.lang.Throwable -> L2d6
            android.content.Context r9 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            r8.c(r9)     // Catch: java.lang.Throwable -> L2d6
        L2a5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d6
            r9.<init>()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r10 = "----->>>>>ekv event json is "
            r9.append(r10)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L2d6
            r9.append(r10)     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2d6
            com.umeng.commonsdk.statistics.common.ULog.i(r9)     // Catch: java.lang.Throwable -> L2d6
            if (r14 != 0) goto L2cb
            android.content.Context r9 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            com.umeng.analytics.CoreProtocol r10 = com.umeng.analytics.CoreProtocol.getInstance(r9)     // Catch: java.lang.Throwable -> L2d6
            r11 = 4097(0x1001, float:5.741E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r9, r11, r10, r1)     // Catch: java.lang.Throwable -> L2d6
            goto L2d6
        L2cb:
            android.content.Context r9 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L2d6
            com.umeng.analytics.CoreProtocol r10 = com.umeng.analytics.CoreProtocol.getInstance(r9)     // Catch: java.lang.Throwable -> L2d6
            r11 = 4355(0x1103, float:6.103E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r9, r11, r10, r1)     // Catch: java.lang.Throwable -> L2d6
        L2d6:
            return
    }

    public void a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, java.lang.String r11) {
            r8 = this;
            java.lang.String r0 = "du"
            java.lang.String r1 = "ts"
            java.lang.String r2 = "id"
            boolean r3 = r8.a(r9)     // Catch: java.lang.Throwable -> L109
            if (r3 != 0) goto Le
            goto L109
        Le:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L109
            r3.<init>()     // Catch: java.lang.Throwable -> L109
            r3.put(r2, r9)     // Catch: java.lang.Throwable -> L109
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L109
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L109
            r9 = 0
            r3.put(r0, r9)     // Catch: java.lang.Throwable -> L109
            java.lang.String r4 = "__t"
            r5 = 2050(0x802, float:2.873E-42)
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L109
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r4.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r5 = "befort gkv map, event is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L109
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L109
            r4.append(r5)     // Catch: java.lang.Throwable -> L109
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L109
            com.umeng.commonsdk.statistics.common.ULog.i(r4)     // Catch: java.lang.Throwable -> L109
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L109
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L109
            r4 = 0
        L49:
            r5 = 10
            if (r4 >= r5) goto L9f
            boolean r5 = r10.hasNext()     // Catch: java.lang.Throwable -> L109
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Throwable -> L109
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L109
            java.lang.String r6 = "$st_fl"
            java.lang.Object r7 = r5.getKey()     // Catch: java.lang.Throwable -> L109
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L109
            if (r6 != 0) goto L9c
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L109
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L109
            if (r6 != 0) goto L9c
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L109
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> L109
            if (r6 != 0) goto L9c
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L109
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> L109
            if (r6 != 0) goto L9c
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Throwable -> L109
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L109
            if (r7 != 0) goto L93
            boolean r7 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L109
            if (r7 != 0) goto L93
            boolean r7 = r6 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L109
            if (r7 == 0) goto L9c
        L93:
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L109
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L109
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L109
        L9c:
            int r4 = r4 + 1
            goto L49
        L9f:
            com.umeng.analytics.pro.y r10 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> L109
            android.content.Context r0 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L109
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r0)     // Catch: java.lang.Throwable -> L109
            java.lang.String r10 = r10.d(r0)     // Catch: java.lang.Throwable -> L109
            java.lang.String r0 = "__i"
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L109
            if (r1 == 0) goto Lb7
            java.lang.String r10 = "-1"
        Lb7:
            r3.put(r0, r10)     // Catch: java.lang.Throwable -> L109
            boolean r10 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L109
            if (r10 != 0) goto Ld0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld0 java.lang.Throwable -> L109
            r10.<init>(r11)     // Catch: org.json.JSONException -> Ld0 java.lang.Throwable -> L109
            int r11 = r10.length()     // Catch: org.json.JSONException -> Ld0 java.lang.Throwable -> L109
            if (r11 <= 0) goto Ld0
            java.lang.String r11 = "_$sp"
            r3.put(r11, r10)     // Catch: org.json.JSONException -> Ld0 java.lang.Throwable -> L109
        Ld0:
            java.lang.String r10 = "ds"
            r3.put(r10, r9)     // Catch: java.lang.Throwable -> L109
            java.lang.String r9 = "pn"
            android.content.Context r10 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L109
            com.umeng.commonsdk.service.UMGlobalContext r10 = com.umeng.commonsdk.service.UMGlobalContext.getInstance(r10)     // Catch: java.lang.Throwable -> L109
            android.content.Context r11 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L109
            java.lang.String r10 = r10.getProcessName(r11)     // Catch: java.lang.Throwable -> L109
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L109
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r9.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r10 = "----->>>>>gkv event json is "
            r9.append(r10)     // Catch: java.lang.Throwable -> L109
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L109
            r9.append(r10)     // Catch: java.lang.Throwable -> L109
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L109
            com.umeng.commonsdk.statistics.common.ULog.i(r9)     // Catch: java.lang.Throwable -> L109
            android.content.Context r9 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Throwable -> L109
            com.umeng.analytics.CoreProtocol r10 = com.umeng.analytics.CoreProtocol.getInstance(r9)     // Catch: java.lang.Throwable -> L109
            r11 = 4098(0x1002, float:5.743E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r9, r11, r10, r3)     // Catch: java.lang.Throwable -> L109
        L109:
            return
    }

    public void a(java.util.List<java.lang.String> r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L89
            int r1 = r8.size()     // Catch: java.lang.Exception -> L90
            if (r1 > 0) goto Lb
            goto L89
        Lb:
            r7.a()     // Catch: java.lang.Exception -> L90
            org.json.JSONObject r1 = r7.h     // Catch: java.lang.Exception -> L90
            r2 = 128(0x80, float:1.8E-43)
            r3 = 5
            if (r1 != 0) goto L52
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L90
            r1.<init>()     // Catch: java.lang.Exception -> L90
            r7.h = r1     // Catch: java.lang.Exception -> L90
            int r1 = r8.size()     // Catch: java.lang.Exception -> L90
            r4 = 0
        L21:
            if (r4 >= r1) goto L4c
            org.json.JSONObject r5 = r7.h     // Catch: java.lang.Exception -> L90
            if (r5 != 0) goto L2f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L90
            r5.<init>()     // Catch: java.lang.Exception -> L90
            r7.h = r5     // Catch: java.lang.Exception -> L90
            goto L36
        L2f:
            int r5 = r5.length()     // Catch: java.lang.Exception -> L90
            if (r5 < r3) goto L36
            goto L4c
        L36:
            java.lang.Object r5 = r8.get(r4)     // Catch: java.lang.Exception -> L90
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L90
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L90
            if (r6 != 0) goto L49
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.HelperUtils.subStr(r5, r2)     // Catch: java.lang.Exception -> L90
            r7.a(r5, r0)     // Catch: java.lang.Exception -> L90
        L49:
            int r4 = r4 + 1
            goto L21
        L4c:
            android.content.Context r8 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Exception -> L90
            r7.c(r8)     // Catch: java.lang.Exception -> L90
            return
        L52:
            int r1 = r1.length()     // Catch: java.lang.Exception -> L90
            if (r1 < r3) goto L5e
            java.lang.String r8 = "already setFistLaunchEvent, igone."
            com.umeng.commonsdk.statistics.common.MLog.d(r8)     // Catch: java.lang.Exception -> L90
            return
        L5e:
            r1 = 0
        L5f:
            int r4 = r8.size()     // Catch: java.lang.Exception -> L90
            if (r1 >= r4) goto L83
            org.json.JSONObject r4 = r7.h     // Catch: java.lang.Exception -> L90
            int r4 = r4.length()     // Catch: java.lang.Exception -> L90
            if (r4 < r3) goto L73
            java.lang.String r8 = " add setFistLaunchEvent over."
            com.umeng.commonsdk.statistics.common.MLog.d(r8)     // Catch: java.lang.Exception -> L90
            return
        L73:
            java.lang.Object r4 = r8.get(r1)     // Catch: java.lang.Exception -> L90
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L90
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.HelperUtils.subStr(r4, r2)     // Catch: java.lang.Exception -> L90
            r7.a(r4, r0)     // Catch: java.lang.Exception -> L90
            int r1 = r1 + 1
            goto L5f
        L83:
            android.content.Context r8 = com.umeng.analytics.pro.s.g     // Catch: java.lang.Exception -> L90
            r7.c(r8)     // Catch: java.lang.Exception -> L90
            return
        L89:
            java.lang.String r8 = com.umeng.analytics.pro.j.ak     // Catch: java.lang.Exception -> L90
            java.lang.String r1 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r8, r0, r1)     // Catch: java.lang.Exception -> L90
        L90:
            return
    }
}
