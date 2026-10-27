package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ap {
    public ap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            if (r0 != 0) goto L3
            return r2
        L3:
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> a() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "i_ver"
            java.lang.String r2 = "1.2.0"
            r0.put(r1, r2)
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1b
            java.lang.String r1 = "a_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION
            r0.put(r1, r2)
        L1b:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "g_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION
            r0.put(r1, r2)
        L2a:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L39
            java.lang.String r1 = "p_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION
            r0.put(r1, r2)
        L39:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L48
            java.lang.String r1 = "s_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION
            r0.put(r1, r2)
        L48:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L57
            java.lang.String r1 = "c_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION
            r0.put(r1, r2)
        L57:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_VERIFY_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L66
            java.lang.String r1 = "n_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_VERIFY_VERSION
            r0.put(r1, r2)
        L66:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L75
            java.lang.String r1 = "m_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION
            r0.put(r1, r2)
        L75:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L84
            java.lang.String r1 = "u_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME
            r0.put(r1, r2)
        L84:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L93
            java.lang.String r1 = "v_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION
            r0.put(r1, r2)
        L93:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto La2
            java.lang.String r1 = "z_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION
            r0.put(r1, r2)
        La2:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "l_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION
            r0.put(r1, r2)
        Lb1:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc0
            java.lang.String r1 = "t_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION
            r0.put(r1, r2)
        Lc0:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANTI_VERSION
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lcf
            java.lang.String r1 = "r_ver"
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANTI_VERSION
            r0.put(r1, r2)
        Lcf:
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> a(org.json.JSONObject r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r4.keys()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L29
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L9
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L9
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L29
            goto L9
        L29:
            goto L9
        L2b:
            return r0
    }

    public static void a(android.content.Context r7, java.lang.String r8) {
            java.lang.Class<com.uyumao.sdk.UYMManager> r0 = com.uyumao.sdk.UYMManager.class
            java.lang.String r1 = "processEvent"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L20
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20
            r2[r5] = r7     // Catch: java.lang.Throwable -> L20
            r2[r6] = r8     // Catch: java.lang.Throwable -> L20
            r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L20
        L20:
            return
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }
}
