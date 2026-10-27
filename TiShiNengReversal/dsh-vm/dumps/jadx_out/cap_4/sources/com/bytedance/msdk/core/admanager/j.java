package com.bytedance.msdk.core.admanager;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static final java.util.ArrayList<java.lang.String> cw = null;
    private static final java.util.ArrayList<com.bytedance.msdk.core.admanager.j.C0217j> j = null;

    /* renamed from: r, reason: collision with root package name */
    private static final java.util.ArrayList<java.lang.String> f2185r = null;
    private static final java.lang.String[] xt = null;

    /* renamed from: com.bytedance.msdk.core.admanager.j$j, reason: collision with other inner class name */
    private static class C0217j {
        java.lang.String cw;
        java.lang.String j;
        int xt;

        C0217j(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                r0.cw = r3
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.core.admanager.j.j = r0
            java.lang.String r9 = "unity"
            java.lang.String r10 = "klevin"
            java.lang.String r1 = "TTTransparentActivity"
            java.lang.String r2 = "openadsdk"
            java.lang.String r3 = "com.bykv"
            java.lang.String r4 = "com.qq"
            java.lang.String r5 = "com.kwad"
            java.lang.String r6 = "baidu"
            java.lang.String r7 = "mbridge"
            java.lang.String r8 = "sigmob"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            com.bytedance.msdk.core.admanager.j.xt = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            com.bytedance.msdk.core.admanager.j.cw = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.core.admanager.j.f2185r = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int cw(java.lang.String r1, java.lang.String r2) {
            r0 = 2
            java.lang.String r2 = r2.substring(r0)
            java.lang.String r0 = "v"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "V"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1a
        L15:
            r0 = 1
            java.lang.String r1 = r1.substring(r0)
        L1a:
            int r1 = r1.compareTo(r2)
            return r1
    }

    private static boolean cw(java.lang.String r3) {
            java.util.ArrayList<java.lang.String> r0 = com.bytedance.msdk.core.admanager.j.f2185r
            int r1 = r0.size()
            r2 = 1
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto Le
            r3 = 0
            return r3
        L22:
            return r2
    }

    public static void j(java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            return
        L7:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r0.<init>(r7)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            java.util.ArrayList<java.lang.String> r7 = com.bytedance.msdk.core.admanager.j.cw     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r7.clear()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            java.lang.String r7 = "act_str"
            org.json.JSONArray r7 = r0.optJSONArray(r7)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r1 = 0
            if (r7 == 0) goto L39
            int r2 = r7.length()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r2 <= 0) goto L39
            r2 = 0
        L21:
            int r3 = r7.length()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r2 >= r3) goto L39
            java.lang.String r3 = r7.optString(r2)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r4 != 0) goto L36
            java.util.ArrayList<java.lang.String> r4 = com.bytedance.msdk.core.admanager.j.cw     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r4.add(r3)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
        L36:
            int r2 = r2 + 1
            goto L21
        L39:
            java.util.ArrayList<java.lang.String> r7 = com.bytedance.msdk.core.admanager.j.f2185r     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r7.clear()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            java.lang.String r7 = "not_act_str"
            org.json.JSONArray r7 = r0.optJSONArray(r7)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r7 == 0) goto L65
            int r2 = r7.length()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r2 <= 0) goto L65
            r2 = 0
        L4d:
            int r3 = r7.length()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r2 >= r3) goto L65
            java.lang.String r3 = r7.optString(r2)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r4 != 0) goto L62
            java.util.ArrayList<java.lang.String> r4 = com.bytedance.msdk.core.admanager.j.f2185r     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r4.add(r3)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
        L62:
            int r2 = r2 + 1
            goto L4d
        L65:
            java.util.ArrayList<com.bytedance.msdk.core.admanager.j$j> r7 = com.bytedance.msdk.core.admanager.j.j     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r7.clear()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            java.lang.String r7 = "not_support"
            org.json.JSONArray r7 = r0.optJSONArray(r7)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r7 == 0) goto La3
            int r0 = r7.length()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r0 <= 0) goto La3
        L78:
            int r0 = r7.length()     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r1 >= r0) goto La3
            org.json.JSONObject r0 = r7.optJSONObject(r1)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            if (r0 == 0) goto La0
            java.util.ArrayList<com.bytedance.msdk.core.admanager.j$j> r2 = com.bytedance.msdk.core.admanager.j.j     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            com.bytedance.msdk.core.admanager.j$j r3 = new com.bytedance.msdk.core.admanager.j$j     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            java.lang.String r4 = "adn"
            java.lang.String r4 = r0.optString(r4)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            java.lang.String r5 = "subtype"
            int r5 = r0.optInt(r5)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            java.lang.String r6 = "versions"
            java.lang.String r0 = r0.optString(r6)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r3.<init>(r4, r5, r0)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
            r2.add(r3)     // Catch: org.json.JSONException -> Laf java.lang.Throwable -> Lbc
        La0:
            int r1 = r1 + 1
            goto L78
        La3:
            java.util.ArrayList<java.lang.String> r7 = com.bytedance.msdk.core.admanager.j.cw
            java.lang.String[] r0 = com.bytedance.msdk.core.admanager.j.xt
            java.util.List r0 = java.util.Arrays.asList(r0)
        Lab:
            r7.addAll(r0)
            return
        Laf:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> Lbc
            java.util.ArrayList<java.lang.String> r7 = com.bytedance.msdk.core.admanager.j.cw
            java.lang.String[] r0 = com.bytedance.msdk.core.admanager.j.xt
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto Lab
        Lbc:
            r7 = move-exception
            java.util.ArrayList<java.lang.String> r0 = com.bytedance.msdk.core.admanager.j.cw
            java.lang.String[] r1 = com.bytedance.msdk.core.admanager.j.xt
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.addAll(r1)
            throw r7
    }

    public static boolean j(java.lang.String r3, int r4, int r5) {
            java.util.ArrayList<com.bytedance.msdk.core.admanager.j$j> r4 = com.bytedance.msdk.core.admanager.j.j
            int r0 = r4.size()
            if (r0 <= 0) goto L5e
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r4.next()
            com.bytedance.msdk.core.admanager.j$j r0 = (com.bytedance.msdk.core.admanager.j.C0217j) r0
            if (r0 == 0) goto Lc
            java.lang.String r1 = r0.j
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto Lc
            int r1 = r0.xt
            if (r5 != r1) goto Lc
            java.lang.String r0 = r0.cw
            com.bytedance.msdk.m.xt.xt r1 = com.bytedance.msdk.m.xt.xt.j()
            com.bytedance.msdk.j.j.r r1 = r1.j(r3)
            if (r1 == 0) goto L37
            java.lang.String r1 = r1.xt()
            goto L38
        L37:
            r1 = 0
        L38:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Lc
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Lc
            java.lang.String r2 = "<="
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L51
            boolean r3 = j(r1, r0)
            return r3
        L51:
            java.lang.String r2 = ">="
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto Lc
            boolean r3 = xt(r1, r0)
            return r3
        L5e:
            java.lang.String r4 = "baidu"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            if (r3 == 0) goto L68
            r3 = 1
            return r3
        L68:
            r3 = 0
            return r3
    }

    private static boolean j(java.lang.String r0, java.lang.String r1) {
            int r0 = cw(r0, r1)
            if (r0 > 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean xt(java.lang.String r2) {
            java.lang.String r0 = "--==--- activityStr: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            java.util.ArrayList<java.lang.String> r0 = com.bytedance.msdk.core.admanager.j.cw
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L15
            boolean r2 = cw(r2)
            return r2
        L2c:
            r2 = 0
            return r2
    }

    private static boolean xt(java.lang.String r0, java.lang.String r1) {
            int r0 = cw(r0, r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
