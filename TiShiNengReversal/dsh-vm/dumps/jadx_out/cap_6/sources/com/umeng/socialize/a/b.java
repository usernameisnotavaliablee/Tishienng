package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static volatile com.umeng.socialize.a.b a;
    private final android.content.SharedPreferences b;

    private b() {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r1 = "um_social_azx"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.b = r0
            return
    }

    public static com.umeng.socialize.a.b a() {
            com.umeng.socialize.a.b r0 = com.umeng.socialize.a.b.a
            if (r0 != 0) goto L19
            java.lang.Class<com.umeng.socialize.a.b> r0 = com.umeng.socialize.a.b.class
            monitor-enter(r0)
            com.umeng.socialize.a.b r1 = com.umeng.socialize.a.b.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.socialize.a.b r1 = new com.umeng.socialize.a.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.umeng.socialize.a.b.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.umeng.socialize.a.b r0 = com.umeng.socialize.a.b.a
            return r0
    }

    public int a(java.lang.String[] r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L29
            int r1 = r7.length
            if (r1 != 0) goto L7
            goto L29
        L7:
            android.content.SharedPreferences r1 = r6.b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            int r2 = r7.length
            r3 = 0
        Lf:
            if (r0 >= r2) goto L23
            r4 = r7[r0]
            android.content.SharedPreferences r5 = r6.b
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L20
            r1.remove(r4)
            int r3 = r3 + 1
        L20:
            int r0 = r0 + 1
            goto Lf
        L23:
            if (r3 <= 0) goto L28
            r1.apply()
        L28:
            return r3
        L29:
            return r0
    }

    public void a(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.b
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L15
            android.content.SharedPreferences r0 = r1.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r0.remove(r2)
            r2.apply()
        L15:
            return
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            android.content.SharedPreferences r0 = r1.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r3)
            r2.apply()
        L13:
            return
    }

    public java.lang.String b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.b
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }

    public java.util.Map<java.lang.String, ?> b() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.b
            java.util.Map r0 = r0.getAll()
            return r0
    }
}
