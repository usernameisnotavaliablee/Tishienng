package com.umeng.socialize.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LinkCardResponse extends com.umeng.socialize.net.base.SocializeReseponse {
    public java.lang.String url;

    public LinkCardResponse(java.lang.Integer r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public LinkCardResponse(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.umeng.socialize.net.base.SocializeReseponse
    public void parseJsonObject() {
            r2 = this;
            org.json.JSONObject r0 = r2.mJsonData
            if (r0 != 0) goto La
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.JSONNULL
            com.umeng.socialize.utils.SLog.E(r0)
            return
        La:
            java.lang.String r1 = "linkcard_url"
            java.lang.String r0 = r0.optString(r1)
            r2.url = r0
            return
    }
}
