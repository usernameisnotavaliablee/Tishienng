package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w {
    public w() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "String"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1f
            java.lang.String r5 = (java.lang.String) r5
            r2.putString(r4, r5)
            goto L66
        L1f:
            java.lang.String r3 = "Integer"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L31
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            r2.putInt(r4, r3)
            goto L66
        L31:
            java.lang.String r3 = "Boolean"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L43
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r2.putBoolean(r4, r3)
            goto L66
        L43:
            java.lang.String r3 = "Float"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L55
            java.lang.Float r5 = (java.lang.Float) r5
            float r3 = r5.floatValue()
            r2.putFloat(r4, r3)
            goto L66
        L55:
            java.lang.String r3 = "Long"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L66
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            r2.putLong(r4, r0)
        L66:
            r2.commit()
            return
    }

    public static java.lang.Object b(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)
            java.lang.String r3 = "String"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1c
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r2 = r2.getString(r4, r5)
            return r2
        L1c:
            java.lang.String r3 = "Integer"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L33
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            int r2 = r2.getInt(r4, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L33:
            java.lang.String r3 = "Boolean"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4a
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            boolean r2 = r2.getBoolean(r4, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L4a:
            java.lang.String r3 = "Float"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L61
            java.lang.Float r5 = (java.lang.Float) r5
            float r3 = r5.floatValue()
            float r2 = r2.getFloat(r4, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L61:
            java.lang.String r3 = "Long"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L78
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r2 = r2.getLong(r4, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
        L78:
            r2 = 0
            return r2
    }
}
