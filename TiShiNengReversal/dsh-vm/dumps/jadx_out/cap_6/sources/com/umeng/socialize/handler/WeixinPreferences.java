package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WeixinPreferences {
    private static final java.lang.String KEY_ACCESS_TOKEN = "access_token";
    private static final java.lang.String KEY_EXPIRES_IN = "expires_in";
    private static final java.lang.String KEY_OPENID = "openid";
    private static final java.lang.String KEY_REFRESH_TOKEN = "refresh_token";
    private static final java.lang.String KEY_REFRESH_TOKEN_TTL = "rt_expires_in";
    private static final java.lang.String KEY_UID = "unionid";
    private java.lang.String mAccessToken;
    private long mAccessTokenTTL;
    private java.lang.String mOpenid;
    private java.lang.String mRefreshToken;
    private long mRefreshTokenTTL;
    private java.lang.String mUID;
    private final android.content.SharedPreferences sharedPreferences;

    public WeixinPreferences(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            r5.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "full"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r0 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r0)
            r5.sharedPreferences = r6
            java.lang.String r7 = "unionid"
            r0 = 0
            java.lang.String r7 = r6.getString(r7, r0)
            r5.mUID = r7
            java.lang.String r7 = "openid"
            java.lang.String r7 = r6.getString(r7, r0)
            r5.mOpenid = r7
            java.lang.String r7 = "access_token"
            java.lang.String r7 = r6.getString(r7, r0)
            r5.mAccessToken = r7
            java.lang.String r7 = "expires_in"
            r1 = 0
            long r3 = r6.getLong(r7, r1)
            r5.mAccessTokenTTL = r3
            java.lang.String r7 = "refresh_token"
            java.lang.String r7 = r6.getString(r7, r0)
            r5.mRefreshToken = r7
            java.lang.String r7 = "rt_expires_in"
            long r6 = r6.getLong(r7, r1)
            r5.mRefreshTokenTTL = r6
            return
    }

    public void commit() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.sharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "unionid"
            java.lang.String r2 = r4.mUID
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "openid"
            java.lang.String r2 = r4.mOpenid
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "access_token"
            java.lang.String r2 = r4.mAccessToken
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "refresh_token"
            java.lang.String r2 = r4.mRefreshToken
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "rt_expires_in"
            long r2 = r4.mRefreshTokenTTL
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            java.lang.String r1 = "expires_in"
            long r2 = r4.mAccessTokenTTL
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.commit()
            return
    }

    public void delete() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.commit()
            java.lang.String r0 = ""
            r1.mAccessToken = r0
            r1.mRefreshToken = r0
            return
    }

    public java.lang.String getAccessToken() {
            r1 = this;
            java.lang.String r0 = r1.mAccessToken
            return r0
    }

    public long getAccessTokenTTL() {
            r2 = this;
            long r0 = r2.mAccessTokenTTL
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getMap() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "access_token"
            java.lang.String r2 = r3.mAccessToken
            r0.put(r1, r2)
            java.lang.String r1 = "unionid"
            java.lang.String r2 = r3.mUID
            r0.put(r1, r2)
            java.lang.String r1 = "openid"
            java.lang.String r2 = r3.mOpenid
            r0.put(r1, r2)
            java.lang.String r1 = "refresh_token"
            java.lang.String r2 = r3.mRefreshToken
            r0.put(r1, r2)
            long r1 = r3.mAccessTokenTTL
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "expires_in"
            r0.put(r2, r1)
            return r0
    }

    public java.lang.String getOpenid() {
            r1 = this;
            java.lang.String r0 = r1.mOpenid
            return r0
    }

    public java.lang.String getRefreshToken() {
            r1 = this;
            java.lang.String r0 = r1.mRefreshToken
            return r0
    }

    public java.lang.String getUID() {
            r1 = this;
            java.lang.String r0 = r1.mUID
            return r0
    }

    public boolean isAccessTokenAvailable() {
            r8 = this;
            java.lang.String r0 = r8.mAccessToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            long r1 = r8.mAccessTokenTTL
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            r3 = 0
            r5 = 0
            r6 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r0 != 0) goto L1d
            if (r1 != 0) goto L1d
            return r6
        L1d:
            return r5
    }

    public boolean isAuth() {
            r1 = this;
            java.lang.String r0 = r1.getAccessToken()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public boolean isAuthValid() {
            r8 = this;
            java.lang.String r0 = r8.mRefreshToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            long r1 = r8.mRefreshTokenTTL
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            r3 = 0
            r5 = 0
            r6 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r0 != 0) goto L1d
            if (r1 != 0) goto L1d
            return r6
        L1d:
            return r5
    }

    public com.umeng.socialize.handler.WeixinPreferences setBundle(android.os.Bundle r7) {
            r6 = this;
            java.lang.String r0 = "unionid"
            java.lang.String r1 = r7.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L12
            java.lang.String r0 = r7.getString(r0)
            r6.mUID = r0
        L12:
            java.lang.String r0 = "openid"
            java.lang.String r1 = r7.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L24
            java.lang.String r0 = r7.getString(r0)
            r6.mOpenid = r0
        L24:
            java.lang.String r0 = "access_token"
            java.lang.String r0 = r7.getString(r0)
            r6.mAccessToken = r0
            java.lang.String r0 = "refresh_token"
            java.lang.String r0 = r7.getString(r0)
            r6.mRefreshToken = r0
            java.lang.String r0 = "expires_in"
            java.lang.String r0 = r7.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r1 != 0) goto L53
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            long r0 = r0 * r2
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r4
            r6.mAccessTokenTTL = r0
        L53:
            java.lang.String r0 = "refresh_token_expires"
            long r0 = r7.getLong(r0)
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto L68
            long r0 = r0 * r2
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            r6.mRefreshTokenTTL = r0
        L68:
            r6.commit()
            return r6
    }
}
