package xyz.adscope.common.sp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CommonSpUtil {
    public CommonSpUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clear(android.content.Context r2) {
            if (r2 != 0) goto L3
            goto L16
        L3:
            java.lang.String r0 = "ad_scope_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L16
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L16
            r2.clear()     // Catch: java.lang.Throwable -> L16
            r2.apply()     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    public static boolean contains(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "ad_scope_config"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r1, r0)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L14
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            return r0
    }

    public static java.lang.Object get(android.content.Context r3, java.lang.String r4, java.lang.Object r5) {
            r0 = 0
            java.lang.String r1 = "ad_scope_config"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L6d
            if (r3 != 0) goto Lb
            return r0
        Lb:
            boolean r1 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L1e
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L6d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L6d
            boolean r3 = r3.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6d
            return r3
        L1e:
            boolean r1 = r5 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L31
            java.lang.Float r5 = (java.lang.Float) r5     // Catch: java.lang.Throwable -> L6d
            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L6d
            float r3 = r3.getFloat(r4, r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L6d
            return r3
        L31:
            boolean r1 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L44
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L6d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L6d
            int r3 = r3.getInt(r4, r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L6d
            return r3
        L44:
            boolean r1 = r5 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L57
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L6d
            long r1 = r5.longValue()     // Catch: java.lang.Throwable -> L6d
            long r3 = r3.getLong(r4, r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L6d
            return r3
        L57:
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L62
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = r3.getString(r4, r5)     // Catch: java.lang.Throwable -> L6d
            return r3
        L62:
            boolean r1 = r5 instanceof java.util.Set     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L6d
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L6d
            java.util.Set r3 = r3.getStringSet(r4, r5)     // Catch: java.lang.Throwable -> L6d
            return r3
        L6d:
            return r0
    }

    public static java.lang.Object get(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.Object r6) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r1)     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto Lc
            return r0
        Lc:
            boolean r4 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L1f
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L6e
            boolean r4 = r6.booleanValue()     // Catch: java.lang.Throwable -> L6e
            boolean r3 = r3.getBoolean(r5, r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6e
            return r3
        L1f:
            boolean r4 = r6 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L32
            java.lang.Float r6 = (java.lang.Float) r6     // Catch: java.lang.Throwable -> L6e
            float r4 = r6.floatValue()     // Catch: java.lang.Throwable -> L6e
            float r3 = r3.getFloat(r5, r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L6e
            return r3
        L32:
            boolean r4 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L45
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L6e
            int r4 = r6.intValue()     // Catch: java.lang.Throwable -> L6e
            int r3 = r3.getInt(r5, r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L6e
            return r3
        L45:
            boolean r4 = r6 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L58
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L6e
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L6e
            long r3 = r3.getLong(r5, r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L6e
            return r3
        L58:
            boolean r4 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L63
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = r3.getString(r5, r6)     // Catch: java.lang.Throwable -> L6e
            return r3
        L63:
            boolean r4 = r6 instanceof java.util.Set     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L6e
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.Throwable -> L6e
            java.util.Set r3 = r3.getStringSet(r5, r6)     // Catch: java.lang.Throwable -> L6e
            return r3
        L6e:
            return r0
    }

    public static java.util.Map<java.lang.String, ?> getAll(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "ad_scope_config"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L12
            java.util.Map r3 = r3.getAll()     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            return r0
    }

    public static java.lang.String getString(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L14
            java.lang.String r1 = "ad_scope_config"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r4, r1)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            return r0
    }

    public static java.lang.String getString(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r2 == 0) goto L12
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r3 = ""
            java.lang.String r2 = r2.getString(r4, r3)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
    }

    public static java.lang.String getUpdated(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "ad_scope_config"
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L17
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L17
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = r4.getString(r5, r0)     // Catch: java.lang.Throwable -> L17
            return r4
        L17:
            java.lang.String r4 = ""
            return r4
    }

    public static void put(android.content.Context r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r0 = "ad_scope_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L5e
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L1b
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L5e
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L5e
            r2.putBoolean(r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L5b
        L1b:
            boolean r0 = r4 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L29
            java.lang.Float r4 = (java.lang.Float) r4     // Catch: java.lang.Throwable -> L5e
            float r4 = r4.floatValue()     // Catch: java.lang.Throwable -> L5e
            r2.putFloat(r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L5b
        L29:
            boolean r0 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L37
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L5e
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L5e
            r2.putInt(r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L5b
        L37:
            boolean r0 = r4 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L45
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L5e
            long r0 = r4.longValue()     // Catch: java.lang.Throwable -> L5e
            r2.putLong(r3, r0)     // Catch: java.lang.Throwable -> L5e
            goto L5b
        L45:
            boolean r0 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L4f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5e
            r2.putString(r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L5b
        L4f:
            boolean r0 = r4 instanceof java.util.Set     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L5b
            r2.remove(r3)     // Catch: java.lang.Throwable -> L5e
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L5e
            r2.putStringSet(r3, r4)     // Catch: java.lang.Throwable -> L5e
        L5b:
            r2.commit()     // Catch: java.lang.Throwable -> L5e
        L5e:
            return
    }

    public static void putCommit(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
            if (r2 != 0) goto L3
            goto L5f
        L3:
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L5f
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L1c
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r5.booleanValue()     // Catch: java.lang.Throwable -> L5f
            r2.putBoolean(r4, r3)     // Catch: java.lang.Throwable -> L5f
            goto L5c
        L1c:
            boolean r3 = r5 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L2a
            java.lang.Float r5 = (java.lang.Float) r5     // Catch: java.lang.Throwable -> L5f
            float r3 = r5.floatValue()     // Catch: java.lang.Throwable -> L5f
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L5f
            goto L5c
        L2a:
            boolean r3 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L38
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L5f
            int r3 = r5.intValue()     // Catch: java.lang.Throwable -> L5f
            r2.putInt(r4, r3)     // Catch: java.lang.Throwable -> L5f
            goto L5c
        L38:
            boolean r3 = r5 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L46
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L5f
            long r0 = r5.longValue()     // Catch: java.lang.Throwable -> L5f
            r2.putLong(r4, r0)     // Catch: java.lang.Throwable -> L5f
            goto L5c
        L46:
            boolean r3 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L50
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L5f
            r2.putString(r4, r5)     // Catch: java.lang.Throwable -> L5f
            goto L5c
        L50:
            boolean r3 = r5 instanceof java.util.Set     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L5c
            r2.remove(r4)     // Catch: java.lang.Throwable -> L5f
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L5f
            r2.putStringSet(r4, r5)     // Catch: java.lang.Throwable -> L5f
        L5c:
            r2.commit()     // Catch: java.lang.Throwable -> L5f
        L5f:
            return
    }

    public static void putString(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            if (r2 == 0) goto L13
            java.lang.String r0 = "ad_scope_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L13
            r2.putString(r3, r4)     // Catch: java.lang.Throwable -> L13
            r2.commit()     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public static void putString(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            if (r1 == 0) goto L11
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L11
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L11
            r1.putString(r3, r4)     // Catch: java.lang.Throwable -> L11
            r1.commit()     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    public static void remove(android.content.Context r2, java.lang.String r3) {
            if (r2 != 0) goto L3
            goto L16
        L3:
            java.lang.String r0 = "ad_scope_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L16
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L16
            r2.remove(r3)     // Catch: java.lang.Throwable -> L16
            r2.apply()     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    public static void saveUpdated(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "ad_scope_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L11
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L11
            r2.putString(r3, r4)     // Catch: java.lang.Throwable -> L11
            r2.commit()     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }
}
