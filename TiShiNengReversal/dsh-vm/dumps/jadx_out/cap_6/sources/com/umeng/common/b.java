package com.umeng.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b {
    private static com.umeng.common.b a;
    private static android.content.Context b;
    private static java.lang.String c;
    private static final java.lang.String d = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private static final com.umeng.common.b a = null;

        static {
                com.umeng.common.b r0 = new com.umeng.common.b
                r0.<init>()
                com.umeng.common.b.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.common.b a() {
                com.umeng.common.b r0 = com.umeng.common.b.a.a
                return r0
        }
    }

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "user"
            java.lang.String r0 = r0.b(r1)
            com.umeng.common.b.d = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.umeng.common.b a(android.content.Context r2) {
            java.lang.Class<com.umeng.common.b> r0 = com.umeng.common.b.class
            monitor-enter(r0)
            android.content.Context r1 = com.umeng.common.b.b     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            if (r2 == 0) goto L16
            android.content.Context r1 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L14
            com.umeng.common.b.b = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L26
        L16:
            android.content.Context r1 = com.umeng.common.b.b     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L20
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L14
            com.umeng.common.b.c = r2     // Catch: java.lang.Throwable -> L14
        L20:
            com.umeng.common.b r2 = com.umeng.common.b.a.a()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r2
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)
            if (r2 == 0) goto L19
            java.lang.String r2 = r2.getString(r4, r0)
            return r2
        L19:
            return r0
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "debugkey"
            r1.remove(r2)
            java.lang.String r2 = "period"
            r1.remove(r2)
            java.lang.String r2 = "startTime"
            r1.remove(r2)
            r1.clear()
            r1.commit()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            if (r1 != 0) goto L3
            goto L1e
        L3:
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            if (r1 == 0) goto L1e
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L1e
            r1.putString(r3, r4)
            r1.commit()
        L1e:
            return
    }

    private android.content.SharedPreferences e() {
            r3 = this;
            android.content.Context r0 = com.umeng.common.b.b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.umeng.common.b.d
            r1.append(r2)
            java.lang.String r2 = com.umeng.common.b.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            return r0
    }

    public void a(int r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.common.b.b
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            if (r0 == 0) goto L15
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "vt"
            android.content.SharedPreferences$Editor r3 = r0.putInt(r1, r3)
            r3.commit()
        L15:
            return
    }

    public void a(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.common.b.b
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            if (r0 == 0) goto L15
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "st"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            r3.commit()
        L15:
            return
    }

    public void a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L21
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L21
            android.content.SharedPreferences r0 = r2.e()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "au_p"
            r0.putString(r1, r3)
            java.lang.String r3 = "au_u"
            r0.putString(r3, r4)
            r0.commit()
        L21:
            return
    }

    public java.lang.String[] a() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.e()
            r1 = 0
            if (r0 == 0) goto L24
            java.lang.String r2 = "au_p"
            java.lang.String r2 = r0.getString(r2, r1)
            java.lang.String r3 = "au_u"
            java.lang.String r0 = r0.getString(r3, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L24
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L24
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            return r0
        L24:
            return r1
    }

    public void b() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.e()
            if (r0 == 0) goto L19
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "au_p"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "au_u"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.commit()
        L19:
            return
    }

    public java.lang.String c() {
            r3 = this;
            android.content.Context r0 = com.umeng.common.b.b
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r2 = "st"
            java.lang.String r0 = r0.getString(r2, r1)
            return r0
        L10:
            return r1
    }

    public int d() {
            r3 = this;
            android.content.Context r0 = com.umeng.common.b.b
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r2 = "vt"
            int r0 = r0.getInt(r2, r1)
            return r0
        L10:
            return r1
    }
}
