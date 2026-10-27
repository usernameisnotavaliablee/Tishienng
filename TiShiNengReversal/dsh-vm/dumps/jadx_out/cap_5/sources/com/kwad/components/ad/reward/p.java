package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private java.lang.String errorMsg;
        private boolean tq;

        public a(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "-"
                r1.errorMsg = r0
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld
                goto L15
            Ld:
                r2 = 0
                r1.tq = r2
                java.lang.String r2 = "数据解析失败"
                r1.errorMsg = r2
                r0 = 0
            L15:
                r1.parseJson(r0)
                return
        }

        static /* synthetic */ java.lang.String a(com.kwad.components.ad.reward.p.a r0) {
                java.lang.String r0 = r0.errorMsg
                return r0
        }

        private void parseJson(@androidx.annotation.Nullable org.json.JSONObject r2) {
                r1 = this;
                if (r2 == 0) goto L10
                java.lang.String r0 = "isValid"
                boolean r0 = r2.optBoolean(r0)
                r1.tq = r0
                java.lang.String r2 = r2.toString()
                r1.errorMsg = r2
            L10:
                return
        }

        public final boolean isValid() {
                r1 = this;
                boolean r0 = r1.tq
                return r0
        }
    }

    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void b(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.sdk.core.response.model.AdInfo r3) {
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.bR(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleRewardVerify callbackUrl: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ServerCallbackHandle"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r3)
            if (r0 != 0) goto L25
            com.kwad.components.ad.reward.p$1 r0 = new com.kwad.components.ad.reward.p$1
            r0.<init>(r3, r2)
            com.kwad.sdk.utils.h.execute(r0)
        L25:
            return
    }
}
