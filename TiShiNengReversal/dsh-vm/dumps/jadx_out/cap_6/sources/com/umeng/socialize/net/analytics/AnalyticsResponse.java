package com.umeng.socialize.net.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AnalyticsResponse extends com.umeng.socialize.net.base.SocializeReseponse {
    public java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, java.lang.Integer> mInfoMap;
    public java.lang.String mWeiboId;
    public com.umeng.socialize.bean.SHARE_MEDIA platform;

    public AnalyticsResponse(java.lang.Integer r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ShareMultiResponse [mInfoMap="
            r0.append(r1)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, java.lang.Integer> r1 = r2.mInfoMap
            r0.append(r1)
            java.lang.String r1 = ", mWeiboId="
            r0.append(r1)
            java.lang.String r1 = r2.mWeiboId
            r0.append(r1)
            java.lang.String r1 = ", mMsg="
            r0.append(r1)
            java.lang.String r1 = r2.mMsg
            r0.append(r1)
            java.lang.String r1 = ", mStCode="
            r0.append(r1)
            int r1 = r2.mStCode
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
