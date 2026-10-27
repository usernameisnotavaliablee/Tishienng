package com.umeng.socialize.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ActionBarResponse extends com.umeng.socialize.net.base.SocializeReseponse {
    public int mCommentCount;
    public java.lang.String mEntityKey;
    public int mFavorite;
    public int mFirstTime;
    public int mLikeCount;
    public int mPv;
    public int mShareCount;
    public java.lang.String mSid;
    public java.lang.String mUid;
    public java.lang.String mUk;

    public ActionBarResponse(java.lang.Integer r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    @Override // com.umeng.socialize.net.base.SocializeReseponse
    public void parseJsonObject() {
            r11 = this;
            java.lang.String r0 = "sn"
            java.lang.String r1 = "uid"
            java.lang.String r2 = "sid"
            java.lang.String r3 = "pv"
            java.lang.String r4 = "lk"
            java.lang.String r5 = "fr"
            java.lang.String r6 = "ft"
            java.lang.String r7 = "ek"
            java.lang.String r8 = "cm"
            org.json.JSONObject r9 = r11.mJsonData
            if (r9 != 0) goto L1c
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.JSONNULL
            com.umeng.socialize.utils.SLog.I(r0)
            return
        L1c:
            boolean r10 = r9.has(r8)     // Catch: org.json.JSONException -> L29
            if (r10 == 0) goto L2b
            int r8 = r9.getInt(r8)     // Catch: org.json.JSONException -> L29
            r11.mCommentCount = r8     // Catch: org.json.JSONException -> L29
            goto L2b
        L29:
            r0 = move-exception
            goto L8d
        L2b:
            boolean r8 = r9.has(r7)     // Catch: org.json.JSONException -> L29
            if (r8 == 0) goto L37
            java.lang.String r7 = r9.getString(r7)     // Catch: org.json.JSONException -> L29
            r11.mEntityKey = r7     // Catch: org.json.JSONException -> L29
        L37:
            boolean r7 = r9.has(r6)     // Catch: org.json.JSONException -> L29
            if (r7 == 0) goto L43
            int r6 = r9.getInt(r6)     // Catch: org.json.JSONException -> L29
            r11.mFirstTime = r6     // Catch: org.json.JSONException -> L29
        L43:
            boolean r6 = r9.has(r5)     // Catch: org.json.JSONException -> L29
            if (r6 == 0) goto L50
            r6 = 0
            int r5 = r9.optInt(r5, r6)     // Catch: org.json.JSONException -> L29
            r11.mFavorite = r5     // Catch: org.json.JSONException -> L29
        L50:
            boolean r5 = r9.has(r4)     // Catch: org.json.JSONException -> L29
            if (r5 == 0) goto L5c
            int r4 = r9.getInt(r4)     // Catch: org.json.JSONException -> L29
            r11.mLikeCount = r4     // Catch: org.json.JSONException -> L29
        L5c:
            boolean r4 = r9.has(r3)     // Catch: org.json.JSONException -> L29
            if (r4 == 0) goto L68
            int r3 = r9.getInt(r3)     // Catch: org.json.JSONException -> L29
            r11.mPv = r3     // Catch: org.json.JSONException -> L29
        L68:
            boolean r3 = r9.has(r2)     // Catch: org.json.JSONException -> L29
            if (r3 == 0) goto L74
            java.lang.String r2 = r9.getString(r2)     // Catch: org.json.JSONException -> L29
            r11.mSid = r2     // Catch: org.json.JSONException -> L29
        L74:
            boolean r2 = r9.has(r1)     // Catch: org.json.JSONException -> L29
            if (r2 == 0) goto L80
            java.lang.String r1 = r9.getString(r1)     // Catch: org.json.JSONException -> L29
            r11.mUid = r1     // Catch: org.json.JSONException -> L29
        L80:
            boolean r1 = r9.has(r0)     // Catch: org.json.JSONException -> L29
            if (r1 == 0) goto L8c
            int r0 = r9.getInt(r0)     // Catch: org.json.JSONException -> L29
            r11.mShareCount = r0     // Catch: org.json.JSONException -> L29
        L8c:
            return
        L8d:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR
            com.umeng.socialize.utils.SLog.error(r1, r0)
            return
    }
}
