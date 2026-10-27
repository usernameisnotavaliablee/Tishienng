package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class av {
    private static final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>>> ae = null;
    private static boolean cw = true;
    private static boolean j = true;
    private static boolean m = false;
    private static boolean r = true;
    private static boolean up = true;
    private static boolean xt = true;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.msdk.tl.av.ae = r0
            return
    }

    public av() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean ae() {
            boolean r0 = com.bytedance.msdk.tl.av.r
            r1 = 0
            if (r0 == 0) goto L9
            com.bytedance.msdk.tl.av.r = r1
            r0 = 1
            return r0
        L9:
            return r1
    }

    public static boolean cw() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L9
            goto La
        L9:
            r0 = 0
        La:
            r1 = 1
            if (r0 == 0) goto L36
            int r2 = r0.length
            if (r2 != 0) goto L11
            goto L36
        L11:
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>>> r2 = com.bytedance.msdk.tl.av.ae
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L36
            java.lang.String r3 = "pangle"
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L36
            int r3 = r2.size()
            if (r3 <= r1) goto L36
            boolean r0 = j(r0, r2)
            return r0
        L36:
            return r1
    }

    public static void j(org.json.JSONObject r15) {
            java.lang.String r0 = "TMe"
            if (r15 == 0) goto L87
            java.util.Iterator r1 = r15.keys()     // Catch: java.lang.Exception -> L66
            if (r1 == 0) goto L87
        La:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L87
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L66
            org.json.JSONArray r3 = r15.optJSONArray(r2)     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto La
            r4 = 0
            r5 = 0
        L1e:
            int r6 = r3.length()     // Catch: java.lang.Exception -> L66
            if (r5 >= r6) goto La
            org.json.JSONObject r6 = r3.getJSONObject(r5)     // Catch: java.lang.Exception -> L66
            java.lang.String r7 = "rit_type"
            int r7 = r6.optInt(r7)     // Catch: java.lang.Exception -> L66
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L66
            java.lang.String r8 = "adn_features"
            org.json.JSONArray r6 = r6.optJSONArray(r8)     // Catch: java.lang.Exception -> L66
            if (r6 == 0) goto L84
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L66
            r8.<init>()     // Catch: java.lang.Exception -> L66
            r9 = 0
        L40:
            int r10 = r6.length()     // Catch: java.lang.Exception -> L66
            if (r9 >= r10) goto L71
            org.json.JSONArray r10 = r6.getJSONArray(r9)     // Catch: java.lang.Exception -> L66
            if (r10 == 0) goto L6e
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Exception -> L66
            r11.<init>()     // Catch: java.lang.Exception -> L66
            r12 = 0
        L52:
            int r13 = r10.length()     // Catch: java.lang.Exception -> L66
            if (r12 >= r13) goto L6b
            java.lang.String r13 = r10.getString(r12)     // Catch: java.lang.Exception -> L66
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> L66
            if (r14 != 0) goto L68
            r11.add(r13)     // Catch: java.lang.Exception -> L66
            goto L68
        L66:
            r15 = move-exception
            goto L9b
        L68:
            int r12 = r12 + 1
            goto L52
        L6b:
            r8.add(r11)     // Catch: java.lang.Exception -> L66
        L6e:
            int r9 = r9 + 1
            goto L40
        L71:
            int r6 = r8.size()     // Catch: java.lang.Exception -> L66
            if (r6 <= 0) goto L84
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> L66
            r6.<init>()     // Catch: java.lang.Exception -> L66
            r6.put(r2, r8)     // Catch: java.lang.Exception -> L66
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>>> r8 = com.bytedance.msdk.tl.av.ae     // Catch: java.lang.Exception -> L66
            r8.put(r7, r6)     // Catch: java.lang.Exception -> L66
        L84:
            int r5 = r5 + 1
            goto L1e
        L87:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = "--==-- adn features:"
            r15.<init>(r1)     // Catch: java.lang.Exception -> L66
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>>> r1 = com.bytedance.msdk.tl.av.ae     // Catch: java.lang.Exception -> L66
            r15.append(r1)     // Catch: java.lang.Exception -> L66
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Exception -> L66
            com.bytedance.msdk.j.up.cw.j(r0, r15)     // Catch: java.lang.Exception -> L66
            return
        L9b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "supervisorFeature error: "
            r1.<init>(r2)
            java.lang.String r2 = r15.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            com.bytedance.sdk.component.utils.vl.j(r15)
            return
    }

    public static void j(boolean r0) {
            com.bytedance.msdk.tl.av.m = r0
            return
    }

    public static boolean j() {
            boolean r0 = com.bytedance.msdk.tl.av.m
            return r0
    }

    private static boolean j(java.lang.Object r5, int r6, java.util.List<java.lang.String> r7) {
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
            r0 = 0
            r1 = 0
        L4:
            int r2 = r7.size()
            if (r1 >= r2) goto L35
            java.lang.Object r2 = r7.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L17
            return r0
        L17:
            int r3 = r6 + r1
            int r4 = r5.length
            if (r3 >= r4) goto L34
            r3 = r5[r3]
            if (r3 == 0) goto L31
            java.lang.String r3 = r3.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L30
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L31
        L30:
            return r0
        L31:
            int r1 = r1 + 1
            goto L4
        L34:
            return r0
        L35:
            r5 = 1
            return r5
    }

    private static boolean j(java.lang.Object r5, java.util.List<java.util.List<java.lang.String>> r6) {
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r6.next()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L6
            int r2 = r0.size()
            if (r2 <= 0) goto L6
            r2 = 0
        L1c:
            int r3 = r5.length
            if (r2 >= r3) goto L6
            r3 = r5[r2]
            if (r3 == 0) goto L48
            java.lang.String r3 = r3.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L48
            java.lang.Object r4 = r0.get(r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L48
            int r3 = r0.size()
            r4 = 1
            if (r3 != r4) goto L41
            return r4
        L41:
            boolean r3 = j(r5, r2, r0)
            if (r3 == 0) goto L48
            return r4
        L48:
            int r2 = r2 + 1
            goto L1c
        L4b:
            return r1
    }

    public static boolean m() {
            boolean r0 = com.bytedance.msdk.tl.av.cw
            r1 = 0
            if (r0 == 0) goto L9
            com.bytedance.msdk.tl.av.cw = r1
            r0 = 1
            return r0
        L9:
            return r1
    }

    public static boolean r() {
            boolean r0 = com.bytedance.msdk.tl.av.j
            r1 = 0
            if (r0 == 0) goto L9
            com.bytedance.msdk.tl.av.j = r1
            r0 = 1
            return r0
        L9:
            return r1
    }

    public static boolean tl() {
            boolean r0 = com.bytedance.msdk.tl.av.up
            r1 = 0
            if (r0 == 0) goto L9
            com.bytedance.msdk.tl.av.up = r1
            r0 = 1
            return r0
        L9:
            return r1
    }

    public static boolean up() {
            boolean r0 = com.bytedance.msdk.tl.av.xt
            r1 = 0
            if (r0 == 0) goto L9
            com.bytedance.msdk.tl.av.xt = r1
            r0 = 1
            return r0
        L9:
            return r1
    }

    public static boolean xt() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L9
            goto La
        L9:
            r0 = 0
        La:
            r1 = 1
            if (r0 == 0) goto L35
            int r2 = r0.length
            if (r2 != 0) goto L11
            goto L35
        L11:
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>>> r2 = com.bytedance.msdk.tl.av.ae
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L35
            java.lang.String r3 = "pangle"
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L35
            int r3 = r2.size()
            if (r3 <= r1) goto L35
            boolean r0 = j(r0, r2)
            return r0
        L35:
            return r1
    }
}
