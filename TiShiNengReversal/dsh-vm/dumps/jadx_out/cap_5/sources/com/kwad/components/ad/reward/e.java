package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static com.kwad.components.ad.reward.e rA;

        static {
                com.kwad.components.ad.reward.e r0 = new com.kwad.components.ad.reward.e
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.reward.e.a.rA = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.reward.e gz() {
                com.kwad.components.ad.reward.e r0 = com.kwad.components.ad.reward.e.a.rA
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends com.kwad.sdk.core.network.l<com.kwad.components.ad.reward.f, com.kwad.sdk.core.response.model.BaseResultData> {

        @androidx.annotation.NonNull
        private com.kwad.sdk.core.response.model.AdTemplate adTemplate;
        private com.kwad.sdk.core.network.o<com.kwad.components.ad.reward.f, com.kwad.sdk.core.response.model.BaseResultData> rB;


        public b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
                r1 = this;
                r1.<init>()
                com.kwad.components.ad.reward.e$b$1 r0 = new com.kwad.components.ad.reward.e$b$1
                r0.<init>(r1)
                r1.rB = r0
                r1.adTemplate = r2
                return
        }

        static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.reward.e.b r0) {
                com.kwad.sdk.core.response.model.AdTemplate r0 = r0.adTemplate
                return r0
        }

        @androidx.annotation.NonNull
        private com.kwad.components.ad.reward.f gB() {
                r2 = this;
                com.kwad.components.ad.reward.f r0 = new com.kwad.components.ad.reward.f
                com.kwad.sdk.core.response.model.AdTemplate r1 = r2.adTemplate
                r0.<init>(r1)
                return r0
        }

        @Override // com.kwad.sdk.core.network.a
        @androidx.annotation.NonNull
        public final /* synthetic */ com.kwad.sdk.core.network.f createRequest() {
                r1 = this;
                com.kwad.components.ad.reward.f r0 = r1.gB()
                return r0
        }

        public final void gA() {
                r1 = this;
                com.kwad.sdk.core.network.o<com.kwad.components.ad.reward.f, com.kwad.sdk.core.response.model.BaseResultData> r0 = r1.rB
                r1.request(r0)
                return
        }

        @Override // com.kwad.sdk.core.network.l
        @androidx.annotation.NonNull
        public final com.kwad.sdk.core.response.model.BaseResultData parseData(java.lang.String r3) {
                r2 = this;
                com.kwad.components.ad.reward.RewardCallbackVerifyHelper$ServerCallbackNetworking$2 r0 = new com.kwad.components.ad.reward.RewardCallbackVerifyHelper$ServerCallbackNetworking$2
                r0.<init>(r2)
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 != 0) goto L18
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L14
                r0.parseJson(r1)     // Catch: java.lang.Throwable -> L14
                return r0
            L14:
                r3 = move-exception
                com.kwad.sdk.core.d.c.printStackTrace(r3)
            L18:
                return r0
        }
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ e(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static void M(com.kwad.sdk.core.response.model.AdTemplate r1) {
            com.kwad.components.ad.reward.e$b r0 = new com.kwad.components.ad.reward.e$b
            r0.<init>(r1)
            r0.gA()
            return
    }

    public static com.kwad.components.ad.reward.e gy() {
            com.kwad.components.ad.reward.e r0 = com.kwad.components.ad.reward.e.a.gz()
            return r0
    }

    public final void L(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            java.lang.String r0 = "RewardCallbackVerifyHelper"
            java.lang.String r1 = "handleRewardVerify"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.bS(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L19
            M(r3)
            return
        L19:
            com.kwad.components.ad.reward.p.b(r3, r0)
            return
    }
}
