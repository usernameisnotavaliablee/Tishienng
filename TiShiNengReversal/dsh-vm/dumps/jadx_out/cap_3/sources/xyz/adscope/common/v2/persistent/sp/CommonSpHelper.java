package xyz.adscope.common.v2.persistent.sp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class CommonSpHelper {
    private static final java.lang.String SP_NAME_COMMON = "scope_com";
    private static final java.lang.String SP_NAME_COMMON_BASIC = "scope_basic_%s";

    private CommonSpHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean appendStringSet(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L13
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r0.add(r4)
            boolean r1 = appendStringSet(r1, r2, r3, r0)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static boolean appendStringSet(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.util.Set<java.lang.String> r5) {
            r0 = 0
            if (r2 == 0) goto L32
            if (r5 == 0) goto L32
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Lc
            goto L32
        Lc:
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            if (r2 == 0) goto L32
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r2 = r2.getStringSet(r4, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            r0.addAll(r5)
            r3.remove(r4)
            r3.putStringSet(r4, r0)
            boolean r2 = r3.commit()
            return r2
        L32:
            return r0
    }

    public static boolean clearSet(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r2 == 0) goto L1c
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto La
            goto L1c
        La:
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            if (r2 == 0) goto L1c
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.remove(r4)
            boolean r2 = r2.commit()
            return r2
        L1c:
            return r0
    }

    public static boolean containKey(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L12
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)
            if (r2 == 0) goto L12
            boolean r2 = r2.contains(r4)
            return r2
        L12:
            return r1
    }

    public static java.util.Map<java.lang.String, ?> getAll(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto Lc
            java.util.Map r1 = r1.getAll()
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.String getBasicSPFile(java.lang.String r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "scope_basic_%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static boolean getBoolean(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto Lc
            boolean r1 = r1.getBoolean(r3, r0)
            return r1
        Lc:
            return r0
    }

    public static java.lang.String getCommonSPFile() {
            java.lang.String r0 = "scope_com"
            return r0
    }

    public static float getFloat(android.content.Context r1, java.lang.String r2, java.lang.String r3, float r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto Lc
            float r1 = r1.getFloat(r3, r4)
            return r1
        Lc:
            return r4
    }

    public static int getInt(android.content.Context r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto Lc
            int r1 = r1.getInt(r3, r4)
            return r1
        Lc:
            return r4
    }

    public static long getLong(android.content.Context r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto Lc
            long r1 = r1.getLong(r3, r4)
            return r1
        Lc:
            return r4
    }

    public static java.lang.String getString(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto Lc
            java.lang.String r1 = r1.getString(r3, r4)
            return r1
        Lc:
            return r4
    }

    public static java.util.Set<java.lang.String> getStringSet(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.Set r1 = r1.getStringSet(r3, r2)
            return r1
        Ld:
            return r2
    }

    public static void putBoolean(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            if (r1 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto L19
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putBoolean(r3, r4)
            r1.apply()
        L19:
            return
    }

    public static void putFloat(android.content.Context r1, java.lang.String r2, java.lang.String r3, float r4) {
            if (r1 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto L19
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putFloat(r3, r4)
            r1.apply()
        L19:
            return
    }

    public static void putInt(android.content.Context r1, java.lang.String r2, java.lang.String r3, int r4) {
            if (r1 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto L19
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putInt(r3, r4)
            r1.apply()
        L19:
            return
    }

    public static void putLong(android.content.Context r1, java.lang.String r2, java.lang.String r3, long r4) {
            if (r1 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto L19
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putLong(r3, r4)
            r1.apply()
        L19:
            return
    }

    public static void putString(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            if (r1 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto L19
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r3, r4)
            r1.apply()
        L19:
            return
    }

    public static boolean putStringSet(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.util.Set<java.lang.String> r5) {
            r0 = 0
            if (r2 == 0) goto L26
            if (r5 == 0) goto L26
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Lc
            goto L26
        Lc:
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            if (r2 == 0) goto L26
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.remove(r4)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r5)
            r2.putStringSet(r4, r3)
            boolean r2 = r2.commit()
            return r2
        L26:
            return r0
    }

    public static void removeKey(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            if (r1 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto L19
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.remove(r3)
            r1.apply()
        L19:
            return
    }

    public static boolean removeStringFromSet(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = 0
            if (r2 == 0) goto L30
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto La
            goto L30
        La:
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            if (r2 == 0) goto L30
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r2 = r2.getStringSet(r4, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            r0.remove(r5)
            r3.remove(r4)
            r3.putStringSet(r4, r0)
            boolean r2 = r3.commit()
            return r2
        L30:
            return r0
    }
}
