package com.kwad.components.ad.adbit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {






    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static <T extends com.kwad.components.core.request.a> T a(com.kwad.sdk.g.c<T> r0) {
            java.lang.Object r0 = r0.get()
            com.kwad.components.core.request.a r0 = (com.kwad.components.core.request.a) r0
            return r0
    }

    @androidx.annotation.Nullable
    private static com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.adbit.AdBitResultData r4, long r5) {
            java.util.List r4 = r4.getAdTemplateList()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r4.next()
            com.kwad.sdk.core.response.model.AdTemplate r0 = (com.kwad.sdk.core.response.model.AdTemplate) r0
            if (r0 == 0) goto L8
            long r1 = com.kwad.sdk.core.response.b.e.ev(r0)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L8
            return r0
        L1f:
            r4 = 0
            return r4
    }

    public static java.lang.String a(com.kwad.sdk.internal.api.SceneImpl r2) {
            com.kwad.sdk.internal.api.SceneImpl.covert(r2)
            com.kwad.components.core.request.model.a$a r0 = new com.kwad.components.core.request.model.a$a
            r0.<init>()
            com.kwad.components.core.request.model.ImpInfo r1 = new com.kwad.components.core.request.model.ImpInfo
            r1.<init>(r2)
            com.kwad.components.core.request.model.a$a r2 = r0.e(r1)
            com.kwad.components.core.request.d r0 = new com.kwad.components.core.request.d
            r0.<init>()
            com.kwad.components.core.request.model.a$a r2 = r2.a(r0)
            com.kwad.components.core.request.model.a r2 = r2.sw()
            com.kwad.components.ad.adbit.c$1 r0 = new com.kwad.components.ad.adbit.c$1
            r0.<init>(r2)
            com.kwad.components.core.request.a r2 = a(r0)
            com.kwad.components.ad.adbit.b r2 = (com.kwad.components.ad.adbit.b) r2
            com.kwad.components.ad.adbit.a r0 = new com.kwad.components.ad.adbit.a
            org.json.JSONObject r1 = r2.getBody()
            java.util.Map r2 = r2.getHeader()
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.O()
            return r2
    }

    private static java.util.List<java.lang.String> a(com.kwad.components.ad.adbit.AdBitResultData r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.kwad.components.ad.adbit.AdBid> r7 = r7.adBidList
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r7.next()
            com.kwad.components.ad.adbit.AdBid r1 = (com.kwad.components.ad.adbit.AdBid) r1
            if (r1 == 0) goto Lb
            int r2 = r1.bidEcpm
            if (r2 <= 0) goto Lb
            long r2 = r1.creativeId
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto Lb
            java.lang.String r1 = r1.materialId
            r0.add(r1)
            goto Lb
        L2b:
            return r0
    }

    private static java.util.List<com.kwad.sdk.core.response.model.AdTemplate> a(com.kwad.components.ad.adbit.AdBitResultData r7, com.kwad.components.ad.adbit.AdBitResultData r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.kwad.components.ad.adbit.AdBid> r7 = r7.adBidList
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r7.next()
            com.kwad.components.ad.adbit.AdBid r1 = (com.kwad.components.ad.adbit.AdBid) r1
            if (r1 == 0) goto Lb
            int r2 = r1.bidEcpm
            if (r2 <= 0) goto Lb
            long r2 = r1.creativeId
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto Lb
            com.kwad.sdk.core.response.model.AdTemplate r2 = a(r8, r2)
            if (r2 == 0) goto Lb
            int r1 = r1.bidEcpm
            long r3 = (long) r1
            r2.mBidEcpm = r3
            r0.add(r2)
            goto Lb
        L34:
            return r0
    }

    private static void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.components.core.request.model.a r4) {
            r0 = 0
            java.lang.String r1 = "server_bid_two"
            r4.aE(r1)     // Catch: java.lang.Exception -> L3d
            com.kwad.components.core.request.model.ImpInfo r1 = r4.Rw     // Catch: java.lang.Exception -> L3d
            com.kwad.sdk.internal.api.SceneImpl r1 = r1.adScene     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r4.sv()     // Catch: java.lang.Exception -> L3d
            com.kwad.sdk.commercial.d.d.c(r1, r2)     // Catch: java.lang.Exception -> L3d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3d
            r1.<init>(r3)     // Catch: java.lang.Exception -> L3d
            com.kwad.components.ad.adbit.AdBitResultData r3 = new com.kwad.components.ad.adbit.AdBitResultData     // Catch: java.lang.Exception -> L3d
            com.kwad.components.core.request.model.ImpInfo r2 = r4.Rw     // Catch: java.lang.Exception -> L3d
            com.kwad.sdk.internal.api.SceneImpl r2 = r2.adScene     // Catch: java.lang.Exception -> L3d
            r3.<init>(r2)     // Catch: java.lang.Exception -> L3d
            r3.parseJson(r1)     // Catch: java.lang.Exception -> L3d
            java.util.List r1 = a(r3)     // Catch: java.lang.Exception -> L3d
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L45
            com.kwad.sdk.core.network.e r1 = com.kwad.sdk.core.network.e.aEq     // Catch: java.lang.Exception -> L3d
            int r1 = r1.errorCode     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r3.testErrorMsg     // Catch: java.lang.Exception -> L3d
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L3f
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEq     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = r3.msg     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r3 = move-exception
            goto L49
        L3f:
            java.lang.String r3 = r3.testErrorMsg     // Catch: java.lang.Exception -> L3d
        L41:
            com.kwad.components.core.request.model.a.a(r4, r1, r3, r0)     // Catch: java.lang.Exception -> L3d
            return
        L45:
            a(r1, r3, r4)     // Catch: java.lang.Exception -> L3d
            return
        L49:
            com.kwad.sdk.core.network.e r1 = com.kwad.sdk.core.network.e.aEp
            int r2 = r1.errorCode
            java.lang.String r1 = r1.msg
            com.kwad.components.core.request.model.a.a(r4, r2, r1, r0)
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
            return
    }

    private static void a(java.util.List<java.lang.String> r1, com.kwad.components.ad.adbit.AdBitResultData r2, com.kwad.components.core.request.model.a r3) {
            com.kwad.components.ad.adbit.c$4 r0 = new com.kwad.components.ad.adbit.c$4
            r0.<init>(r3, r2, r1)
            com.kwad.components.ad.adbit.c$5 r1 = new com.kwad.components.ad.adbit.c$5
            r1.<init>(r2, r3)
            r0.request(r1)
            return
    }

    public static java.util.List<com.kwad.sdk.core.response.model.AdTemplate> b(com.kwad.components.ad.adbit.AdBitResultData r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.kwad.components.ad.adbit.AdBid> r1 = r8.adBidList
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            com.kwad.components.ad.adbit.AdBid r2 = (com.kwad.components.ad.adbit.AdBid) r2
            if (r2 == 0) goto Lb
            int r3 = r2.bidEcpm
            if (r3 <= 0) goto Lb
            long r3 = r2.creativeId
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lb
            com.kwad.sdk.core.response.model.AdTemplate r3 = a(r8, r3)
            if (r3 == 0) goto Lb
            int r2 = r2.bidEcpm
            long r4 = (long) r2
            r3.mBidEcpm = r4
            r0.add(r3)
            goto Lb
        L34:
            return r0
    }

    static /* synthetic */ java.util.List b(com.kwad.components.ad.adbit.AdBitResultData r0, com.kwad.components.ad.adbit.AdBitResultData r1) {
            java.util.List r0 = a(r0, r1)
            return r0
    }

    public static boolean c(@androidx.annotation.NonNull com.kwad.components.core.request.model.a r4) {
            com.kwad.components.core.request.model.ImpInfo r0 = r4.Rw
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            java.lang.String r0 = r0.getBidResponseV2()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r1 != 0) goto L13
            a(r0, r4)
            return r2
        L13:
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            com.kwad.components.core.request.model.ImpInfo r0 = r4.Rw
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            java.lang.String r0 = r0.getBidResponse()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L28
            r4 = 0
            return r4
        L28:
            java.util.concurrent.ExecutorService r1 = com.kwad.sdk.core.threads.GlobalThreadPools.Jt()
            com.kwad.components.ad.adbit.c$3 r3 = new com.kwad.components.ad.adbit.c$3
            r3.<init>(r4, r0)
            r1.submit(r3)
            return r2
    }

    public static java.lang.String getBidRequestTokenV2(com.kwad.sdk.api.KsScene r2) {
            com.kwad.sdk.internal.api.SceneImpl r2 = com.kwad.sdk.internal.api.SceneImpl.covert(r2)
            com.kwad.components.core.request.model.a$a r0 = new com.kwad.components.core.request.model.a$a
            r0.<init>()
            com.kwad.components.core.request.model.ImpInfo r1 = new com.kwad.components.core.request.model.ImpInfo
            r1.<init>(r2)
            com.kwad.components.core.request.model.a$a r2 = r0.e(r1)
            com.kwad.components.core.request.d r0 = new com.kwad.components.core.request.d
            r0.<init>()
            com.kwad.components.core.request.model.a$a r2 = r2.a(r0)
            com.kwad.components.core.request.model.a r2 = r2.sw()
            com.kwad.components.ad.adbit.c$2 r0 = new com.kwad.components.ad.adbit.c$2
            r0.<init>(r2)
            com.kwad.components.core.request.a r2 = a(r0)
            com.kwad.components.ad.a.a r2 = (com.kwad.components.ad.a.a) r2
            com.kwad.components.ad.adbit.a r0 = new com.kwad.components.ad.adbit.a
            org.json.JSONObject r1 = r2.getBody()
            java.util.Map r2 = r2.getHeader()
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.O()
            return r2
    }
}
