package com.kwad.components.core.request.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ImpInfo extends com.kwad.sdk.core.response.a.a implements java.io.Serializable {
    private static final long serialVersionUID = 6229807370051396781L;
    public int action;
    public int adNum;
    public com.kwad.sdk.internal.api.SceneImpl adScene;
    public int adStyle;
    public java.lang.String backUrl;
    public java.lang.String comment;
    public long cpmBidFloor;
    public long entryScene;
    public java.lang.String extraData;
    public int height;
    public long pageScene;
    public long posId;
    public java.lang.String promoteId;
    public int screenOrientation;
    public java.lang.String sdkExtraData;
    public long subPageScene;
    public com.kwad.sdk.core.scene.URLPackage urlPackage;
    public long userCommRateBuying;
    public long userCommRateSharing;
    public int width;

    public ImpInfo(com.kwad.sdk.internal.api.SceneImpl r6) {
            r5 = this;
            r5.<init>()
            r5.adScene = r6
            r0 = 0
            r5.pageScene = r0
            r5.subPageScene = r0
            long r2 = r6.posId
            r5.posId = r2
            long r2 = r6.entryScene
            r5.entryScene = r2
            int r2 = r6.adNum
            r5.adNum = r2
            int r2 = r6.action
            r5.action = r2
            int r2 = r6.width
            r5.width = r2
            int r2 = r6.height
            r5.height = r2
            com.kwad.sdk.internal.api.AdLabelImpl r2 = r6.mKsAdLabel
            if (r2 == 0) goto L2f
            long r2 = r2.cpmBidFloor
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L2f
            r5.cpmBidFloor = r2
        L2f:
            int r0 = r6.adStyle
            r5.adStyle = r0
            com.kwad.sdk.core.scene.URLPackage r0 = r6.urlPackage
            if (r0 == 0) goto L39
            r5.urlPackage = r0
        L39:
            java.lang.String r0 = r6.promoteId
            r5.promoteId = r0
            java.lang.String r0 = r6.comment
            r5.comment = r0
            java.lang.String r0 = r6.backUrl
            r5.backUrl = r0
            long r0 = r6.userCommRateBuying
            r5.userCommRateBuying = r0
            long r0 = r6.userCommRateSharing
            r5.userCommRateSharing = r0
            int r6 = r6.screenOrientation
            r5.screenOrientation = r6
            java.lang.String r6 = "extraData"
            java.lang.String r6 = r5.getRewardCallbackExtraByKey(r6)
            if (r6 == 0) goto L5b
            r5.extraData = r6
        L5b:
            return
    }

    @androidx.annotation.Nullable
    public com.kwad.sdk.internal.api.AdLabelImpl getAdLabelFromAdScene() {
            r1 = this;
            com.kwad.sdk.internal.api.SceneImpl r0 = r1.adScene
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.kwad.sdk.internal.api.AdLabelImpl r0 = r0.mKsAdLabel
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getRewardCallbackExtraByKey(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1c
            com.kwad.sdk.internal.api.SceneImpl r1 = r3.adScene
            if (r1 != 0) goto L8
            goto L1c
        L8:
            java.util.Map r1 = r1.getRewardCallbackExtraData()
            if (r1 == 0) goto L1c
            boolean r2 = r1.containsKey(r4)
            if (r2 != 0) goto L15
            goto L1c
        L15:
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L1c:
            return r0
    }
}
