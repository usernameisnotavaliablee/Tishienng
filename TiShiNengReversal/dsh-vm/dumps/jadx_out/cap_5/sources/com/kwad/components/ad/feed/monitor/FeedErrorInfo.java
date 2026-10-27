package com.kwad.components.ad.feed.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FeedErrorInfo extends com.kwad.sdk.commercial.c.a implements java.io.Serializable {
    private static final long serialVersionUID = 5562303989639679849L;
    public long errorType;
    public long feedType;
    public long materialType;
    public long width;

    public FeedErrorInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.kwad.components.ad.feed.monitor.FeedErrorInfo setErrorType(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.errorType = r0
            return r2
    }

    public com.kwad.components.ad.feed.monitor.FeedErrorInfo setFeedType(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.feedType = r0
            return r2
    }

    public com.kwad.components.ad.feed.monitor.FeedErrorInfo setMaterialType(long r1) {
            r0 = this;
            r0.materialType = r1
            return r0
    }

    public com.kwad.components.ad.feed.monitor.FeedErrorInfo setWidth(long r1) {
            r0 = this;
            r0.width = r1
            return r0
    }
}
