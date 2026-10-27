package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PLSharedPreferences {
    private static final java.lang.String b = "PLSharedPreferences";
    private static final java.lang.String c = "grs_move2DE_records";
    private final android.content.SharedPreferences a;

    public PLSharedPreferences(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            android.content.SharedPreferences r1 = r0.a(r1, r2)
            r0.a = r1
            return
    }

    private android.content.SharedPreferences a(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            if (r5 != 0) goto Lb
            java.lang.String r5 = "PLSharedPreferences"
            java.lang.String r6 = "context is null, must call init method to set context"
            com.huawei.hms.framework.common.Logger.e(r5, r6)
            r5 = 0
            return r5
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = 0
            if (r0 < r1) goto L35
            android.content.Context r0 = androidx.profileinstaller.a.a(r5)
            java.lang.String r1 = "grs_move2DE_records"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r2)
            boolean r3 = r1.getBoolean(r6, r2)
            if (r3 != 0) goto L34
            boolean r3 = com.bytedance.sdk.component.panglearmor.a.a(r0, r5, r6)
            if (r3 != 0) goto L29
            goto L35
        L29:
            android.content.SharedPreferences$Editor r5 = r1.edit()
            r1 = 1
            r5.putBoolean(r6, r1)
            r5.apply()
        L34:
            r5 = r0
        L35:
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r2)
            return r5
    }

    public void clear() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            return
    }

    public android.content.SharedPreferences.Editor edit() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            return r0
    }

    public java.util.Map<java.lang.String, ?> getAll() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map r0 = r0.getAll()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sp size "
            r1.append(r2)
            if (r0 != 0) goto L18
            r2 = 0
            goto L1c
        L18:
            int r2 = r0.size()
        L1c:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "PLSharedPreferences"
            com.huawei.hms.framework.common.Logger.i(r2, r1)
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getHashMap(java.lang.String r9) {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r8.a
            if (r1 != 0) goto La
            goto L41
        La:
            java.lang.String r2 = ""
            java.lang.String r9 = r1.getString(r9, r2)
            r1 = 0
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L3c
            r2.<init>(r9)     // Catch: org.json.JSONException -> L3c
            r9 = 0
        L17:
            int r3 = r2.length()     // Catch: org.json.JSONException -> L3c
            if (r9 >= r3) goto L41
            org.json.JSONObject r3 = r2.getJSONObject(r9)     // Catch: org.json.JSONException -> L3c
            org.json.JSONArray r4 = r3.names()     // Catch: org.json.JSONException -> L3c
            if (r4 == 0) goto L3e
            r5 = 0
        L28:
            int r6 = r4.length()     // Catch: org.json.JSONException -> L3c
            if (r5 >= r6) goto L3e
            java.lang.String r6 = r4.getString(r5)     // Catch: org.json.JSONException -> L3c
            java.lang.String r7 = r3.getString(r6)     // Catch: org.json.JSONException -> L3c
            r0.put(r6, r7)     // Catch: org.json.JSONException -> L3c
            int r5 = r5 + 1
            goto L28
        L3c:
            r9 = move-exception
            goto L42
        L3e:
            int r9 = r9 + 1
            goto L17
        L41:
            return r0
        L42:
            java.lang.String r9 = r9.getMessage()
            java.lang.String r9 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r9)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            java.lang.String r9 = "PLSharedPreferences"
            java.lang.String r1 = "getHashMap parse Json to map error: %s"
            com.huawei.hms.framework.common.Logger.w(r9, r1, r2)
            return r0
    }

    public long getLong(java.lang.String r2, long r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L5
            return r3
        L5:
            long r2 = r0.getLong(r2, r3)
            return r2
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.getString(r2, r0)
            return r2
    }

    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L5
            return r3
        L5:
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }

    public void putHashMap(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            android.content.SharedPreferences r0 = r5.a
            if (r0 == 0) goto L5e
            if (r7 != 0) goto L7
            goto L5e
        L7:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L19:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L33
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L33
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L33
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L33
            goto L19
        L33:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "PLSharedPreferences"
            java.lang.String r4 = "putHashMap one object error: %s"
            com.huawei.hms.framework.common.Logger.w(r2, r4, r3)
            goto L19
        L4a:
            r0.put(r1)
            android.content.SharedPreferences r7 = r5.a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r6 = r7.putString(r6, r0)
            r6.apply()
        L5e:
            return
    }

    public void putLong(java.lang.String r2, long r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r0.putLong(r2, r3)
            r2.apply()
            return
    }

    public void putString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r3)
            r2.apply()
            return
    }

    public void remove(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r0.remove(r2)
            r2.apply()
            return
    }

    public void removeKeyValue(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r0.remove(r2)
            r2.apply()
            return
    }
}
