package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class an {
    public an() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L14
            java.lang.String r1 = "beizisdk_config"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)
            if (r3 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = ""
            java.lang.String r3 = r3.getString(r4, r0)
            return r3
        L14:
            return r0
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.Long r4) {
            if (r2 == 0) goto L17
            java.lang.String r0 = "beizisdk_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            long r0 = r4.longValue()
            r2.putLong(r3, r0)
            r2.commit()
        L17:
            return
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r0 = "fusion_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 == 0) goto L5e
            android.content.SharedPreferences$Editor r2 = r2.edit()
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L1b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.putBoolean(r3, r4)
            goto L5b
        L1b:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L29
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.putFloat(r3, r4)
            goto L5b
        L29:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L37
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.putInt(r3, r4)
            goto L5b
        L37:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L45
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r2.putLong(r3, r0)
            goto L5b
        L45:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L4f
            java.lang.String r4 = (java.lang.String) r4
            r2.putString(r3, r4)
            goto L5b
        L4f:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L5b
            r2.remove(r3)
            java.util.Set r4 = (java.util.Set) r4
            r2.putStringSet(r3, r4)
        L5b:
            r2.apply()
        L5e:
            return
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            if (r2 == 0) goto L13
            java.lang.String r0 = "beizisdk_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r3, r4)
            r2.commit()
        L13:
            return
    }

    public static long b(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            if (r4 == 0) goto L13
            java.lang.String r2 = "beizisdk_config"
            r3 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r2, r3)
            if (r4 != 0) goto Le
            return r0
        Le:
            long r4 = r4.getLong(r5, r0)
            return r4
        L13:
            return r0
    }

    public static java.lang.Object b(android.content.Context r3, java.lang.String r4, java.lang.Object r5) {
            r0 = 0
            java.lang.String r1 = "fusion_config"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch: java.lang.Exception -> L6d
            if (r3 != 0) goto Lb
            return r0
        Lb:
            boolean r1 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L1e
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L6d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L6d
            boolean r3 = r3.getBoolean(r4, r5)     // Catch: java.lang.Exception -> L6d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L6d
            return r3
        L1e:
            boolean r1 = r5 instanceof java.lang.Float     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L31
            java.lang.Float r5 = (java.lang.Float) r5     // Catch: java.lang.Exception -> L6d
            float r5 = r5.floatValue()     // Catch: java.lang.Exception -> L6d
            float r3 = r3.getFloat(r4, r5)     // Catch: java.lang.Exception -> L6d
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L6d
            return r3
        L31:
            boolean r1 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L44
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L6d
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L6d
            int r3 = r3.getInt(r4, r5)     // Catch: java.lang.Exception -> L6d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L6d
            return r3
        L44:
            boolean r1 = r5 instanceof java.lang.Long     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L57
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Exception -> L6d
            long r1 = r5.longValue()     // Catch: java.lang.Exception -> L6d
            long r3 = r3.getLong(r4, r1)     // Catch: java.lang.Exception -> L6d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L6d
            return r3
        L57:
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L62
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = r3.getString(r4, r5)     // Catch: java.lang.Exception -> L6d
            return r3
        L62:
            boolean r1 = r5 instanceof java.util.Set     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L6d
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Exception -> L6d
            java.util.Set r3 = r3.getStringSet(r4, r5)     // Catch: java.lang.Exception -> L6d
            return r3
        L6d:
            return r0
    }
}
