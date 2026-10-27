package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n1 {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.SharedPreferences f2522b;

    /* renamed from: c, reason: collision with root package name */
    public static com.acse.ottn.n1 f2523c;

    /* renamed from: d, reason: collision with root package name */
    public static android.content.SharedPreferences.Editor f2524d;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.acse.ottn.o1 r1 = com.acse.ottn.o1.c()
            java.lang.String r1 = r1.b()
            r0.append(r1)
            java.lang.String r1 = "_info"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.n1.a = r0
            return
    }

    public n1() {
            r3 = this;
            r3.<init>()
            android.content.SharedPreferences r0 = com.acse.ottn.n1.f2522b     // Catch: java.lang.Exception -> L1d
            if (r0 != 0) goto L1f
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "acse_info"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Exception -> L1d
            com.acse.ottn.n1.f2522b = r0     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1f
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> L1d
            com.acse.ottn.n1.f2524d = r0     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r0 = move-exception
            goto L20
        L1f:
            return
        L20:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "preferences"
            com.acse.ottn.h2.a(r1, r0)
            return
    }

    public n1(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.b()
            return
    }

    public static synchronized com.acse.ottn.n1 a() {
            java.lang.Class<com.acse.ottn.n1> r0 = com.acse.ottn.n1.class
            monitor-enter(r0)
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L22
            if (r1 != 0) goto Lc
            monitor-exit(r0)
            r0 = 0
            return r0
        Lc:
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.f2523c     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L22
            if (r1 != 0) goto L1e
            com.acse.ottn.n1 r1 = new com.acse.ottn.n1     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L22
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L22
            com.acse.ottn.n1.f2523c = r1     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L22
            goto L1e
        L1c:
            r1 = move-exception
            goto L31
        L1e:
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.f2523c     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L22
            monitor-exit(r0)
            return r1
        L22:
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.f2523c     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L2d
            com.acse.ottn.n1 r1 = new com.acse.ottn.n1     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            com.acse.ottn.n1.f2523c = r1     // Catch: java.lang.Throwable -> L1c
        L2d:
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.f2523c     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    public int a(java.lang.String r3, int r4) {
            r2 = this;
            android.content.SharedPreferences r0 = com.acse.ottn.n1.f2522b
            if (r0 == 0) goto Le
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.f2523c
            if (r1 != 0) goto L9
            goto Le
        L9:
            int r3 = r0.getInt(r3, r4)
            return r3
        Le:
            return r4
    }

    public java.lang.String a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.content.SharedPreferences r0 = com.acse.ottn.n1.f2522b
            if (r0 == 0) goto Le
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.f2523c
            if (r1 != 0) goto L9
            goto Le
        L9:
            java.lang.String r3 = r0.getString(r3, r4)
            return r3
        Le:
            return r4
    }

    public void a(java.lang.String r2, long r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = com.acse.ottn.n1.f2524d
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r2 = r0.putLong(r2, r3)
            r2.apply()
            return
    }

    public void a(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = com.acse.ottn.n1.f2524d
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r2 = r0.putBoolean(r2, r3)
            r2.apply()
            return
    }

    public boolean a(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = com.acse.ottn.n1.f2522b
            r1 = 0
            if (r0 == 0) goto Lf
            com.acse.ottn.n1 r2 = com.acse.ottn.n1.f2523c
            if (r2 != 0) goto La
            goto Lf
        La:
            boolean r4 = r0.getBoolean(r4, r1)
            return r4
        Lf:
            return r1
    }

    public int b(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = com.acse.ottn.n1.f2522b
            r1 = 0
            if (r0 == 0) goto Lf
            com.acse.ottn.n1 r2 = com.acse.ottn.n1.f2523c
            if (r2 != 0) goto La
            goto Lf
        La:
            int r4 = r0.getInt(r4, r1)
            return r4
        Lf:
            return r1
    }

    public void b() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = com.acse.ottn.n1.f2522b     // Catch: java.lang.Exception -> L1a
            if (r1 != 0) goto L4a
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = com.acse.ottn.n1.a     // Catch: java.lang.Exception -> L1a
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Exception -> L1a
            com.acse.ottn.n1.f2522b = r1     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L4a
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L1a
            com.acse.ottn.n1.f2524d = r1     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            android.content.SharedPreferences r1 = com.acse.ottn.n1.f2522b
            if (r1 != 0) goto L4a
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r3 = r3.getPackageName()
            r2.append(r3)
            java.lang.String r3 = "_info"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r2, r0)
            com.acse.ottn.n1.f2522b = r0
            if (r0 == 0) goto L4a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.acse.ottn.n1.f2524d = r0
        L4a:
            return
    }

    public void b(java.lang.String r2, int r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = com.acse.ottn.n1.f2524d
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r2 = r0.putInt(r2, r3)
            r2.apply()
            return
    }

    public void b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = com.acse.ottn.n1.f2524d
            if (r0 != 0) goto L5
            return
        L5:
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r3)
            r2.apply()
            return
    }

    public java.lang.Long c(java.lang.String r5) {
            r4 = this;
            android.content.SharedPreferences r0 = com.acse.ottn.n1.f2522b
            r1 = 0
            if (r0 == 0) goto L14
            com.acse.ottn.n1 r3 = com.acse.ottn.n1.f2523c
            if (r3 != 0) goto Lb
            goto L14
        Lb:
            long r0 = r0.getLong(r5, r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L14:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            return r5
    }

    public java.lang.String d(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = com.acse.ottn.n1.f2522b
            java.lang.String r1 = ""
            if (r0 == 0) goto L10
            com.acse.ottn.n1 r2 = com.acse.ottn.n1.f2523c
            if (r2 != 0) goto Lb
            goto L10
        Lb:
            java.lang.String r4 = r0.getString(r4, r1)
            return r4
        L10:
            return r1
    }
}
