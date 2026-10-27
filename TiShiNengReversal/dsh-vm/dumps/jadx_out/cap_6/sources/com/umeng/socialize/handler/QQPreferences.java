package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QQPreferences {
    private static final java.lang.String ACCESS_TOKEN = "access_token";
    private static final java.lang.String EXPIRES_IN = "expires_in";
    private static final java.lang.String OPENID = "openid";
    private static final java.lang.String UID = "uid";
    private static final java.lang.String UNIONID = "unionid";
    private static long mtl;
    private java.lang.String mAccessToken;
    private java.lang.String mOpenid;
    private java.lang.String mUID;
    private android.content.SharedPreferences sharedPreferences;
    private java.lang.String unionid;

    static {
            return
    }

    public QQPreferences(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mAccessToken = r0
            r3.mUID = r0
            r3.unionid = r0
            r3.mOpenid = r0
            r3.sharedPreferences = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = "full"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r1)
            r3.sharedPreferences = r4
            java.lang.String r5 = "access_token"
            java.lang.String r4 = r4.getString(r5, r0)
            r3.mAccessToken = r4
            android.content.SharedPreferences r4 = r3.sharedPreferences
            java.lang.String r5 = "uid"
            java.lang.String r4 = r4.getString(r5, r0)
            r3.mUID = r4
            android.content.SharedPreferences r4 = r3.sharedPreferences
            java.lang.String r5 = "openid"
            java.lang.String r4 = r4.getString(r5, r0)
            r3.mOpenid = r4
            android.content.SharedPreferences r4 = r3.sharedPreferences
            java.lang.String r5 = "expires_in"
            r1 = 0
            long r4 = r4.getLong(r5, r1)
            com.umeng.socialize.handler.QQPreferences.mtl = r4
            android.content.SharedPreferences r4 = r3.sharedPreferences
            java.lang.String r5 = "unionid"
            java.lang.String r4 = r4.getString(r5, r0)
            r3.unionid = r4
            return
    }

    public static long getExpiresIn() {
            long r0 = com.umeng.socialize.handler.QQPreferences.mtl
            return r0
    }

    public void commit() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.sharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "access_token"
            java.lang.String r2 = r4.mAccessToken
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "expires_in"
            long r2 = com.umeng.socialize.handler.QQPreferences.mtl
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            java.lang.String r1 = "uid"
            java.lang.String r2 = r4.mUID
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "openid"
            java.lang.String r2 = r4.mOpenid
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "unionid"
            java.lang.String r2 = r4.unionid
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.commit()
            return
    }

    public void delete() {
            r2 = this;
            r0 = 0
            r2.mAccessToken = r0
            r0 = 0
            com.umeng.socialize.handler.QQPreferences.mtl = r0
            android.content.SharedPreferences r0 = r2.sharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.commit()
            return
    }

    public java.lang.String getUnionid() {
            r1 = this;
            java.lang.String r0 = r1.unionid
            return r0
    }

    public java.lang.String getmAccessToken() {
            r1 = this;
            java.lang.String r0 = r1.mAccessToken
            return r0
    }

    public java.lang.String getmUID() {
            r1 = this;
            java.lang.String r0 = r1.mUID
            return r0
    }

    public boolean isAuthValid() {
            r7 = this;
            long r0 = com.umeng.socialize.handler.QQPreferences.mtl
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r2 = 0
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r1 = r7.mAccessToken
            if (r1 == 0) goto L19
            if (r0 != 0) goto L19
            return r5
        L19:
            return r4
    }

    public com.umeng.socialize.handler.QQPreferences setAuthData(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "access_token"
            java.lang.String r0 = r5.getString(r0)
            r4.mAccessToken = r0
            java.lang.String r0 = "expires_in"
            java.lang.String r0 = r5.getString(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            com.umeng.socialize.handler.QQPreferences.mtl = r0
            java.lang.String r0 = "openid"
            java.lang.String r1 = r5.getString(r0)
            r4.mOpenid = r1
            java.lang.String r0 = r5.getString(r0)
            r4.mUID = r0
            java.lang.String r0 = "unionid"
            java.lang.String r5 = r5.getString(r0)
            r4.unionid = r5
            return r4
    }

    public void setUnionid(java.lang.String r1) {
            r0 = this;
            r0.unionid = r1
            return
    }

    public void setmOpenid(java.lang.String r1) {
            r0 = this;
            r0.mOpenid = r1
            return
    }

    public void setmUID(java.lang.String r1) {
            r0 = this;
            r0.mUID = r1
            return
    }
}
