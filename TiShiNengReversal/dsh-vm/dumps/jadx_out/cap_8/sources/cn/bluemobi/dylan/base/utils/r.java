package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f125b;

    public r(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "share_date"
            r1.f125b = r0
            r1.a = r2
            return
    }

    public r(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f125b = r1
            return
    }

    public void a() {
            r3 = this;
            android.content.Context r0 = r3.a
            java.lang.String r1 = r3.f125b
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            r0.commit()
            return
    }

    public java.lang.Object b(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.content.Context r1 = r4.a
            java.lang.String r2 = r4.f125b
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "String"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L20
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = r1.getString(r5, r6)
            return r5
        L20:
            java.lang.String r2 = "Integer"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L37
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r5 = r1.getInt(r5, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L37:
            java.lang.String r2 = "Boolean"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4e
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            boolean r5 = r1.getBoolean(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L4e:
            java.lang.String r2 = "Float"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L65
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r5 = r1.getFloat(r5, r6)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L65:
            java.lang.String r2 = "Long"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7c
            java.lang.Long r6 = (java.lang.Long) r6
            long r2 = r6.longValue()
            long r5 = r1.getLong(r5, r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L7c:
            r5 = 0
            return r5
    }

    public void c(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.a
            java.lang.String r1 = r3.f125b
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.remove(r4)
            r0.commit()
            return
    }

    public void d(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.content.Context r1 = r4.a
            java.lang.String r2 = r4.f125b
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "String"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L25
            java.lang.String r6 = r6.toString()
            r1.putString(r5, r6)
            goto L6c
        L25:
            java.lang.String r2 = "Integer"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L37
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.putInt(r5, r6)
            goto L6c
        L37:
            java.lang.String r2 = "Boolean"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L49
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1.putBoolean(r5, r6)
            goto L6c
        L49:
            java.lang.String r2 = "Float"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L5b
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r1.putFloat(r5, r6)
            goto L6c
        L5b:
            java.lang.String r2 = "Long"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.Long r6 = (java.lang.Long) r6
            long r2 = r6.longValue()
            r1.putLong(r5, r2)
        L6c:
            r1.commit()
            return
    }
}
