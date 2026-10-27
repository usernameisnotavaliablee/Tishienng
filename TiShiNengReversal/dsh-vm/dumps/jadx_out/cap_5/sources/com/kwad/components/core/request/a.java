package com.kwad.components.core.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.core.network.d {
    private static boolean WV = true;
    com.kwad.components.core.request.model.ImpInfo Rw;
    private int WU;

    static {
            return
    }

    public a(com.kwad.components.core.request.model.ImpInfo r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private a(com.kwad.components.core.request.model.ImpInfo r2, com.kwad.components.core.request.model.c r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r2, r3, r0, r3)
            return
    }

    public a(com.kwad.components.core.request.model.ImpInfo r4, @androidx.annotation.Nullable java.util.List<java.lang.String> r5, boolean r6, com.kwad.components.core.request.model.c r7) {
            r3 = this;
            int r0 = c(r4)
            com.kwad.sdk.internal.api.SceneImpl r1 = r4.adScene
            r3.<init>(r0, r1)
            r3.Rw = r4
            com.kwad.sdk.internal.api.AdLabelImpl r0 = r4.getAdLabelFromAdScene()
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAdLabelAppInfoInValid()
            if (r1 != 0) goto L1e
            org.json.JSONObject r1 = com.kwad.sdk.core.request.model.a.II()
            r3.a(r1, r0)
        L1e:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONObject r2 = r4.toJson()
            com.kwad.sdk.utils.aa.a(r1, r2)
            java.lang.String r2 = "impInfo"
            r3.putBody(r2, r1)
            java.lang.String r1 = "universePhotoInfo"
            r3.putBody(r1, r7)
            int r7 = r3.WU
            if (r7 <= 0) goto L3d
            java.lang.String r1 = "calledUnionType"
            r3.putBody(r1, r7)
        L3d:
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r7 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r7)
            java.lang.String r1 = ""
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L54
            com.kwad.sdk.components.b r1 = com.kwad.sdk.components.d.f(r7)
            com.kwad.sdk.components.DevelopMangerComponents r1 = (com.kwad.sdk.components.DevelopMangerComponents) r1
            java.lang.String r1 = r1.Ei()
        L54:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L5f
            java.lang.String r2 = "universeDebugParam"
            r3.putBody(r2, r1)
        L5f:
            java.lang.String r4 = d(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "sdkDebugReqInfo"
            r3.putBody(r1, r4)
        L6e:
            com.kwad.sdk.components.d.f(r7)
            if (r5 == 0) goto L82
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r5)
            java.lang.String r5 = "preloadIdList"
            r3.putBody(r5, r4)
            java.lang.String r4 = "preloadCheck"
            r3.putBody(r4, r6)
        L82:
            java.lang.String r4 = "appTag"
            java.lang.String r5 = com.kwad.sdk.utils.ag.Qy()
            r3.putBody(r4, r5)
            com.kwad.sdk.components.d.f(r7)
            com.kwad.components.core.request.model.ImpInfo r4 = r3.Rw
            java.lang.String r5 = "thirdUserId"
            java.lang.String r4 = r4.getRewardCallbackExtraByKey(r5)
            com.kwad.sdk.core.request.model.g r5 = com.kwad.sdk.core.request.model.g.IP()
            if (r4 == 0) goto L9f
            r5.ex(r4)
        L9f:
            if (r0 == 0) goto Laa
            boolean r4 = r0.isUserInfoVaild()
            if (r4 != 0) goto Laa
            a(r5, r0)
        Laa:
            java.lang.String r4 = "userInfo"
            r3.putBody(r4, r5)
            java.lang.Boolean r4 = com.kwad.components.ad.f.a.oy
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lca
            java.lang.Class<com.kwad.sdk.components.a> r4 = com.kwad.sdk.components.a.class
            com.kwad.sdk.components.b r4 = com.kwad.sdk.components.d.f(r4)     // Catch: java.lang.Throwable -> Lca
            com.kwad.sdk.components.a r4 = (com.kwad.sdk.components.a) r4     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto Lca
            java.lang.String r5 = "adBrowseParam"
            org.json.JSONObject r4 = r4.Eh()     // Catch: java.lang.Throwable -> Lca
            r3.putBody(r5, r4)     // Catch: java.lang.Throwable -> Lca
        Lca:
            return
    }

    public a(com.kwad.components.core.request.model.a r5) {
            r4 = this;
            com.kwad.components.core.request.model.ImpInfo r0 = r5.Rw
            java.util.List<java.lang.String> r1 = r5.Xe
            boolean r2 = r5.Xf
            com.kwad.components.core.request.model.c r3 = r5.Xh
            r4.<init>(r0, r1, r2, r3)
            boolean r5 = r5.Xg
            r4.WU = r5
            return
    }

    private static void a(com.kwad.sdk.core.request.model.g r1, com.kwad.sdk.internal.api.AdLabelImpl r2) {
            int r0 = r2.thirdAge
            if (r0 == 0) goto L6
            r1.thirdAge = r0
        L6:
            int r0 = r2.thirdGender
            if (r0 == 0) goto Lc
            r1.thirdGender = r0
        Lc:
            java.lang.String r0 = r2.thirdInterest
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L18
            java.lang.String r2 = r2.thirdInterest
            r1.thirdInterest = r2
        L18:
            return
    }

    private void a(org.json.JSONObject r4, com.kwad.sdk.internal.api.AdLabelImpl r5) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r5.prevTitle
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L14
            java.lang.String r1 = "prevTitle"
            java.lang.String r2 = r5.prevTitle
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
        L14:
            java.lang.String r1 = r5.postTitle
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L23
            java.lang.String r1 = "postTitle"
            java.lang.String r2 = r5.postTitle
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
        L23:
            java.lang.String r1 = r5.historyTitle
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L32
            java.lang.String r1 = "historyTitle"
            java.lang.String r2 = r5.historyTitle
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
        L32:
            java.lang.String r1 = r5.channel
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L41
            java.lang.String r1 = "channel"
            java.lang.String r5 = r5.channel
            com.kwad.sdk.utils.aa.putValue(r0, r1, r5)
        L41:
            java.lang.String r5 = "content"
            com.kwad.sdk.utils.aa.putValue(r4, r5, r0)
            java.lang.String r5 = "appInfo"
            r3.putBody(r5, r4)
            return
    }

    private static int c(com.kwad.components.core.request.model.ImpInfo r0) {
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getScreenOrientation()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    private static java.lang.String d(com.kwad.components.core.request.model.ImpInfo r7) {
            boolean r0 = com.kwad.components.core.request.a.WV
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.Class<com.kwad.sdk.service.a.f> r0 = com.kwad.sdk.service.a.f.class
            java.lang.Object r0 = com.kwad.sdk.service.ServiceProvider.get(r0)
            com.kwad.sdk.service.a.f r0 = (com.kwad.sdk.service.a.f) r0
            if (r0 == 0) goto L3d
            r2 = 0
            java.lang.String r3 = "com.kwad.devTools.PosConfigFetcher"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = "getConfigParamByPosId"
            com.kwad.sdk.internal.api.SceneImpl r7 = r7.adScene     // Catch: java.lang.Exception -> L3b
            long r5 = r7.getPosId()     // Catch: java.lang.Exception -> L3b
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L3b
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> L3b
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L3b
            r5[r2] = r7     // Catch: java.lang.Exception -> L3b
            r7 = 1
            r5[r7] = r0     // Catch: java.lang.Exception -> L3b
            java.lang.Object r7 = com.kwad.sdk.utils.z.callMethodOrThrow(r3, r4, r5)     // Catch: java.lang.Exception -> L3b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L3b
            return r7
        L3b:
            com.kwad.components.core.request.a.WV = r2
        L3d:
            return r1
    }

    public final void aU(int r1) {
            r0 = this;
            r0.WU = r1
            return
    }

    public final int getAdNum() {
            r1 = this;
            com.kwad.components.core.request.model.ImpInfo r0 = r1.Rw
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            int r0 = r0.getAdNum()
            return r0
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public com.kwad.sdk.internal.api.SceneImpl getScene() {
            r1 = this;
            com.kwad.components.core.request.model.ImpInfo r0 = r1.Rw
            if (r0 == 0) goto L7
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public java.lang.String getUrl() {
            r1 = this;
            java.lang.Boolean r0 = com.kwad.components.ad.f.a.oy
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            java.lang.Class<com.kwad.sdk.components.a> r0 = com.kwad.sdk.components.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)     // Catch: java.lang.Throwable -> L17
            com.kwad.sdk.components.a r0 = (com.kwad.sdk.components.a) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L17
            java.lang.String r0 = com.kwad.sdk.h.AZ()     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            java.lang.String r0 = com.kwad.sdk.h.AL()
            return r0
    }

    @Override // com.kwad.sdk.core.network.d
    public boolean needAppList() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kwad.sdk.core.network.b
    public void onCreate() {
            r1 = this;
            r0 = 1
            com.kwad.sdk.utils.s.cb(r0)
            com.kwad.components.core.request.b r0 = com.kwad.components.core.request.b.sj()
            r0.sk()
            super.onCreate()
            return
    }
}
