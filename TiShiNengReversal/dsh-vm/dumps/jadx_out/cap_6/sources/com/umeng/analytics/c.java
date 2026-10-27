package com.umeng.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static final int a = 3;
    private static final java.lang.String b = "umeng_pcp";
    private static final java.lang.String c = "mob";
    private static final java.lang.String d = "em";
    private static final java.lang.String e = "cp";
    private static final java.lang.String f = "pk";
    private static final java.lang.String g = "pv";
    private static java.lang.String[] h;
    private static java.lang.Object i;
    private static java.util.Map<java.lang.String, java.lang.Object> j;

    static {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            com.umeng.analytics.c.h = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.analytics.c.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.analytics.c.j = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = "mob"
            java.lang.String r1 = ""
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            r3 = 0
            if (r2 == 0) goto L50
            java.lang.String r4 = "umeng_pcp"
            r5 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r2.getString(r0, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "_#$$$"
            boolean r6 = r6.equals(r4)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L2a
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)     // Catch: java.lang.Throwable -> L50
            r0.apply()     // Catch: java.lang.Throwable -> L50
            return r1
        L2a:
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L31
            return r3
        L31:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)     // Catch: java.lang.Throwable -> L50
            r0.apply()     // Catch: java.lang.Throwable -> L50
            byte[] r0 = android.util.Base64.decode(r4, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L50
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L50
            byte[] r0 = com.umeng.analytics.pro.at.a(r0, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L50
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L50
            return r1
        L50:
            return r3
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String[] r0 = com.umeng.analytics.c.h
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r4
            if (r2 == 0) goto L11
            com.umeng.common.b r2 = com.umeng.common.b.a(r2)
            r2.a(r3, r4)
        L11:
            return
    }

    public static void a(android.content.Context r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
            if (r6 == 0) goto L6f
            org.json.JSONStringer r0 = new org.json.JSONStringer
            r0.<init>()
            java.lang.Object r1 = com.umeng.analytics.c.i     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L6f
            r0.array()     // Catch: java.lang.Throwable -> L3c
            java.util.Set r2 = r6.keySet()     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3c
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3c
            r0.object()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "pk"
            r0.key(r4)     // Catch: java.lang.Throwable -> L3c
            r0.value(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "pv"
            r0.key(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Throwable -> L3c
            r0.value(r3)     // Catch: java.lang.Throwable -> L3c
            r0.endObject()     // Catch: java.lang.Throwable -> L3c
            goto L15
        L3c:
            r5 = move-exception
            goto L6d
        L3e:
            r0.endArray()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "umeng_pcp"
            r1 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L6f
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L6f
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L6f
            byte[] r6 = com.umeng.analytics.pro.at.a(r6, r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r1)     // Catch: java.lang.Throwable -> L6f
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "cp"
            android.content.SharedPreferences$Editor r5 = r5.putString(r0, r6)     // Catch: java.lang.Throwable -> L6f
            r5.apply()     // Catch: java.lang.Throwable -> L6f
            return
        L6d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r5     // Catch: java.lang.Throwable -> L6f
        L6f:
            return
    }

    public static void a(java.lang.String r3) {
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            if (r0 == 0) goto L32
            java.lang.String r1 = "umeng_pcp"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L32
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L32
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L32
            byte[] r3 = com.umeng.analytics.pro.at.a(r3, r1)     // Catch: java.lang.Throwable -> L32
            int r1 = r3.length     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L21
            java.lang.String r3 = "_#$$$"
            goto L25
        L21:
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r2)     // Catch: java.lang.Throwable -> L32
        L25:
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "mob"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L32
            r3.apply()     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }

    public static void a(java.lang.String r4, java.lang.Object r5) {
            java.lang.Object r0 = com.umeng.analytics.c.i
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.umeng.analytics.c.j     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.lang.String r1 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "更新账号自定义KV: key="
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            r2.append(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "; val="
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            r2.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)     // Catch: java.lang.Throwable -> L38
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.umeng.analytics.c.j     // Catch: java.lang.Throwable -> L38
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L38
            android.content.Context r4 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L38
            java.util.Map<java.lang.String, java.lang.Object> r5 = com.umeng.analytics.c.j     // Catch: java.lang.Throwable -> L38
            a(r4, r5)     // Catch: java.lang.Throwable -> L38
            goto L7d
        L38:
            r4 = move-exception
            goto L7f
        L3a:
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.umeng.analytics.c.j     // Catch: java.lang.Throwable -> L38
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L38
            r2 = 3
            if (r1 < r2) goto L51
            java.lang.String r4 = "MobclickRT"
            java.lang.String r5 = "设置账号自定义KV: 已经设置3个KV键值对，忽略设置请求。"
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "userProfile: Only 3 user-defined key-value pairs can be configured, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L51:
            java.lang.String r1 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "设置账号自定义KV: key="
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            r2.append(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "; val="
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            r2.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)     // Catch: java.lang.Throwable -> L38
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.umeng.analytics.c.j     // Catch: java.lang.Throwable -> L38
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L38
            android.content.Context r4 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L38
            java.util.Map<java.lang.String, java.lang.Object> r5 = com.umeng.analytics.c.j     // Catch: java.lang.Throwable -> L38
            a(r4, r5)     // Catch: java.lang.Throwable -> L38
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L7f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    public static java.lang.String[] a(android.content.Context r4) {
            java.lang.String[] r0 = com.umeng.analytics.c.h
            r1 = 0
            r0 = r0[r1]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r0 != 0) goto L19
            java.lang.String[] r0 = com.umeng.analytics.c.h
            r0 = r0[r2]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L19
            java.lang.String[] r4 = com.umeng.analytics.c.h
            return r4
        L19:
            if (r4 == 0) goto L30
            com.umeng.common.b r4 = com.umeng.common.b.a(r4)
            java.lang.String[] r4 = r4.a()
            if (r4 == 0) goto L30
            java.lang.String[] r0 = com.umeng.analytics.c.h
            r3 = r4[r1]
            r0[r1] = r3
            r4 = r4[r2]
            r0[r2] = r4
            return r0
        L30:
            r4 = 0
            return r4
    }

    public static java.lang.String b() {
            java.lang.String r0 = "em"
            java.lang.String r1 = ""
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            r3 = 0
            if (r2 == 0) goto L50
            java.lang.String r4 = "umeng_pcp"
            r5 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r2.getString(r0, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "_#$$$"
            boolean r6 = r6.equals(r4)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L2a
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)     // Catch: java.lang.Throwable -> L50
            r0.apply()     // Catch: java.lang.Throwable -> L50
            return r1
        L2a:
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L31
            return r3
        L31:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)     // Catch: java.lang.Throwable -> L50
            r0.apply()     // Catch: java.lang.Throwable -> L50
            byte[] r0 = android.util.Base64.decode(r4, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L50
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L50
            byte[] r0 = com.umeng.analytics.pro.at.a(r0, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L50
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L50
            return r1
        L50:
            return r3
    }

    public static void b(android.content.Context r3) {
            java.lang.String[] r0 = com.umeng.analytics.c.h
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r2
            if (r3 == 0) goto L12
            com.umeng.common.b r3 = com.umeng.common.b.a(r3)
            r3.b()
        L12:
            return
    }

    public static void b(java.lang.String r3) {
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            if (r0 == 0) goto L32
            java.lang.String r1 = "umeng_pcp"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L32
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L32
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L32
            byte[] r3 = com.umeng.analytics.pro.at.a(r3, r1)     // Catch: java.lang.Throwable -> L32
            int r1 = r3.length     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L21
            java.lang.String r3 = "_#$$$"
            goto L25
        L21:
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r2)     // Catch: java.lang.Throwable -> L32
        L25:
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "em"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L32
            r3.apply()     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }

    public static java.util.Map<java.lang.String, java.lang.Object> c(android.content.Context r8) {
            java.lang.String r0 = "umeng_pcp"
            r1 = 0
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r0, r1)
            java.lang.String r0 = "cp"
            java.lang.String r2 = ""
            java.lang.String r3 = r8.getString(r0, r2)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L68
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L68
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L68
            byte[] r3 = com.umeng.analytics.pro.at.a(r3, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L68
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L68
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L68
            if (r3 <= 0) goto L68
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L68
            r3.<init>()     // Catch: java.lang.Throwable -> L68
            org.json.JSONTokener r5 = new org.json.JSONTokener     // Catch: java.lang.Throwable -> L67
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r5.nextValue()
            org.json.JSONArray r4 = (org.json.JSONArray) r4
        L3f:
            int r5 = r4.length()
            if (r1 >= r5) goto L5b
            org.json.JSONObject r5 = r4.getJSONObject(r1)
            java.lang.String r6 = "pk"
            java.lang.String r6 = r5.getString(r6)
            java.lang.String r7 = "pv"
            java.lang.Object r5 = r5.get(r7)
            r3.put(r6, r5)
            int r1 = r1 + 1
            goto L3f
        L5b:
            android.content.SharedPreferences$Editor r8 = r8.edit()
            android.content.SharedPreferences$Editor r8 = r8.putString(r0, r2)
            r8.apply()
            return r3
        L67:
            r5 = r3
        L68:
            return r5
    }
}
