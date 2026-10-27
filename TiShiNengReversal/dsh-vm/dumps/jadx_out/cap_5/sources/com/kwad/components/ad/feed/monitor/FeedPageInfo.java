package com.kwad.components.ad.feed.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FeedPageInfo extends com.kwad.sdk.commercial.c.a implements java.io.Serializable {
    private static final long serialVersionUID = -1423277713849754339L;
    public java.lang.String abParams;
    public int adNum;
    public int callbackType;
    public long convertDuration;
    public int expectedRenderType;
    public java.lang.String extMsg;
    public long loadDataDuration;
    public int loadStatus;
    public long loadType;
    public java.util.List<com.kwad.components.ad.feed.monitor.FeedPageInfo.a> materialInfoList;
    public int materialType;
    public java.lang.String materialUrl;
    public long renderDuration;
    public int renderType;
    public long resourceLoadDuration;
    public int status;
    public int type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public long creativeId;
        public int materialType;
        public java.lang.String materialUrl;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.kwad.components.ad.feed.monitor.FeedPageInfo.a D(int r1) {
                r0 = this;
                r0.materialType = r1
                return r0
        }

        public final com.kwad.components.ad.feed.monitor.FeedPageInfo.a i(long r1) {
                r0 = this;
                r0.creativeId = r1
                return r0
        }

        public final com.kwad.components.ad.feed.monitor.FeedPageInfo.a t(java.lang.String r1) {
                r0 = this;
                r0.materialUrl = r1
                return r0
        }
    }

    public FeedPageInfo() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.materialInfoList = r0
            return
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setAbParams(java.lang.String r1) {
            r0 = this;
            r0.abParams = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setAdNum(int r1) {
            r0 = this;
            r0.adNum = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setCallbackType(int r1) {
            r0 = this;
            r0.callbackType = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setConvertDuration(long r1) {
            r0 = this;
            r0.convertDuration = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.feed.monitor.FeedPageInfo setErrorCode(int r1) {
            r0 = this;
            super.setErrorCode(r1)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setErrorCode(int r1) {
            r0 = this;
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r0.setErrorCode(r1)
            return r1
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.feed.monitor.FeedPageInfo setErrorMsg(java.lang.String r1) {
            r0 = this;
            super.setErrorMsg(r1)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setErrorMsg(java.lang.String r1) {
            r0 = this;
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r0.setErrorMsg(r1)
            return r1
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setExpectedRenderType(int r1) {
            r0 = this;
            r0.expectedRenderType = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setExtMsg(java.lang.String r1) {
            r0 = this;
            r0.extMsg = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setLoadDataDuration(long r1) {
            r0 = this;
            r0.loadDataDuration = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setLoadStatus(int r1) {
            r0 = this;
            r0.loadStatus = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setLoadType(long r1) {
            r0 = this;
            r0.loadType = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setMaterialInfoList(java.util.List<com.kwad.components.ad.feed.monitor.FeedPageInfo.a> r1) {
            r0 = this;
            r0.materialInfoList = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setMaterialType(int r1) {
            r0 = this;
            r0.materialType = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setMaterialUrl(java.lang.String r1) {
            r0 = this;
            r0.materialUrl = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.feed.monitor.FeedPageInfo setPosId(long r1) {
            r0 = this;
            com.kwad.sdk.commercial.c.a r1 = super.setPosId(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = (com.kwad.components.ad.feed.monitor.FeedPageInfo) r1
            return r1
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setPosId(long r1) {
            r0 = this;
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r0.setPosId(r1)
            return r1
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setRenderDuration(long r1) {
            r0 = this;
            r0.renderDuration = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setRenderType(int r1) {
            r0 = this;
            r0.renderType = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setResourceLoadDuration(long r1) {
            r0 = this;
            r0.resourceLoadDuration = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setStatus(int r1) {
            r0 = this;
            r0.status = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedPageInfo setType(int r1) {
            r0 = this;
            r0.type = r1
            return r0
    }
}
