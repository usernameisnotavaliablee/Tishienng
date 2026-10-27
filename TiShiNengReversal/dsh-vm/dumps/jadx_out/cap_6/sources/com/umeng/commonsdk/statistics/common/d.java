package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d {
    private static com.umeng.commonsdk.statistics.common.d a;
    private static android.content.Context b;
    private static java.lang.String c;
    private static final java.lang.String d = null;

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "user"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.statistics.common.d.d = r0
            return
    }

    public d(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.umeng.commonsdk.statistics.common.d a(android.content.Context r2) {
            java.lang.Class<com.umeng.commonsdk.statistics.common.d> r0 = com.umeng.commonsdk.statistics.common.d.class
            monitor-enter(r0)
            android.content.Context r1 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1f
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L1f
            com.umeng.commonsdk.statistics.common.d.b = r1     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r2.getPackageName()     // Catch: java.lang.Throwable -> L1f
            com.umeng.commonsdk.statistics.common.d.c = r1     // Catch: java.lang.Throwable -> L1f
            com.umeng.commonsdk.statistics.common.d r1 = com.umeng.commonsdk.statistics.common.d.a     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            com.umeng.commonsdk.statistics.common.d r1 = new com.umeng.commonsdk.statistics.common.d     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            com.umeng.commonsdk.statistics.common.d.a = r1     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r2 = move-exception
            goto L25
        L21:
            com.umeng.commonsdk.statistics.common.d r2 = com.umeng.commonsdk.statistics.common.d.a     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return r2
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    private android.content.SharedPreferences f() {
            r3 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.common.d.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.d.d
            r1.append(r2)
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.d.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            return r0
    }

    public int a() {
            r3 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.common.d.b
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r2 = "vt"
            int r0 = r0.getInt(r2, r1)
            return r0
        L10:
            return r1
    }

    public void a(int r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.common.d.b
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
            android.content.Context r0 = com.umeng.commonsdk.statistics.common.d.b
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
            android.content.SharedPreferences r0 = r2.f()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "au_p"
            r0.putString(r1, r3)
            java.lang.String r3 = "au_u"
            r0.putString(r3, r4)
            r0.commit()
        L21:
            return
    }

    public java.lang.String b() {
            r3 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.common.d.b
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r2 = "st"
            java.lang.String r0 = r0.getString(r2, r1)
            return r0
        L10:
            return r1
    }

    public boolean c() {
            r1 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.common.d.b
            int r0 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r0)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public java.lang.String[] d() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.f()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "au_p"
            java.lang.String r2 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "au_u"
            java.lang.String r1 = r1.getString(r3, r0)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L19
            if (r1 == 0) goto L19
            java.lang.String[] r0 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Exception -> L19
        L19:
            return r0
    }

    public void e() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "au_p"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "au_u"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.commit()
            return
    }
}
