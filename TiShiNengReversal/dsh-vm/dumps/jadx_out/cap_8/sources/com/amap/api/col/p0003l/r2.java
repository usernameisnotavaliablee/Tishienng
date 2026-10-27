package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r2 {
    public r2() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Long a(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.Long r3) {
            java.lang.Object r0 = d(r0, r1, r2, r3)
            if (r0 == 0) goto L9
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
        L9:
            return r3
    }

    public static java.lang.String b(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = d(r0, r1, r2, r3)
            if (r0 == 0) goto L9
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L9:
            return r3
    }

    public static void c(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L16
            java.lang.String r5 = (java.lang.String) r5
            r2.putString(r4, r5)
            goto L55
        L16:
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L24
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            r2.putInt(r4, r3)
            goto L55
        L24:
            boolean r3 = r5 instanceof java.lang.Boolean
            if (r3 == 0) goto L32
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r2.putBoolean(r4, r3)
            goto L55
        L32:
            boolean r3 = r5 instanceof java.lang.Float
            if (r3 == 0) goto L40
            java.lang.Float r5 = (java.lang.Float) r5
            float r3 = r5.floatValue()
            r2.putFloat(r4, r3)
            goto L55
        L40:
            boolean r3 = r5 instanceof java.lang.Long
            if (r3 == 0) goto L4e
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            r2.putLong(r4, r0)
            goto L55
        L4e:
            java.lang.String r3 = r5.toString()
            r2.putString(r4, r3)
        L55:
            r2.apply()
            return
    }

    private static java.lang.Object d(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L14
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r2 = r2.getString(r4, r5)
            return r2
        L14:
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L27
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            int r2 = r2.getInt(r4, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L27:
            boolean r3 = r5 instanceof java.lang.Boolean
            if (r3 == 0) goto L3a
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            boolean r2 = r2.getBoolean(r4, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L3a:
            boolean r3 = r5 instanceof java.lang.Float
            if (r3 == 0) goto L4d
            java.lang.Float r5 = (java.lang.Float) r5
            float r3 = r5.floatValue()
            float r2 = r2.getFloat(r4, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L4d:
            boolean r3 = r5 instanceof java.lang.Long
            if (r3 == 0) goto L60
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r2 = r2.getLong(r4, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
        L60:
            return r0
    }
}
