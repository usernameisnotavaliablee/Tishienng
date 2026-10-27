package com.umeng.socialize.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RestAPI {
    private static com.umeng.socialize.net.base.SocializeClient a;

    static {
            com.umeng.socialize.net.base.SocializeClient r0 = new com.umeng.socialize.net.base.SocializeClient
            r0.<init>()
            com.umeng.socialize.net.RestAPI.a = r0
            return
    }

    public RestAPI() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.socialize.net.LinkCardResponse convertLinkCard(com.umeng.socialize.net.LinkcardRequest r1) {
            com.umeng.socialize.net.base.SocializeClient r0 = com.umeng.socialize.net.RestAPI.a
            com.umeng.socialize.net.base.SocializeReseponse r1 = r0.execute(r1)
            com.umeng.socialize.net.LinkCardResponse r1 = (com.umeng.socialize.net.LinkCardResponse) r1
            return r1
    }

    public static com.umeng.socialize.net.analytics.AnalyticsResponse doShareByRequest(com.umeng.socialize.net.analytics.AnalyticsReqeust r1) {
            com.umeng.socialize.net.base.SocializeClient r0 = com.umeng.socialize.net.RestAPI.a
            com.umeng.socialize.net.base.SocializeReseponse r1 = r0.execute(r1)
            com.umeng.socialize.net.analytics.AnalyticsResponse r1 = (com.umeng.socialize.net.analytics.AnalyticsResponse) r1
            return r1
    }

    public static com.umeng.socialize.net.ActionBarResponse queryShareId(com.umeng.socialize.net.ActionBarRequest r1) {
            com.umeng.socialize.net.base.SocializeClient r0 = com.umeng.socialize.net.RestAPI.a
            com.umeng.socialize.net.base.SocializeReseponse r1 = r0.execute(r1)
            com.umeng.socialize.net.ActionBarResponse r1 = (com.umeng.socialize.net.ActionBarResponse) r1
            return r1
    }
}
