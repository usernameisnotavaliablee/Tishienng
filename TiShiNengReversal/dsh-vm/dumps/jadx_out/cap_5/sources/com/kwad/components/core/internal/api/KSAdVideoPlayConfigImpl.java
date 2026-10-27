package com.kwad.components.core.internal.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KSAdVideoPlayConfigImpl implements com.kwad.sdk.api.KsAdVideoPlayConfig, java.io.Serializable {
    private static final long serialVersionUID = -154151744722615768L;
    public boolean dataFlowAutoStart;
    private int dataFlowAutoStartValue;
    public boolean hasNoCache;
    public int videoAutoPlayType;
    public boolean videoSoundEnable;
    private int videoSoundValue;

    public KSAdVideoPlayConfigImpl() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.videoSoundValue = r0
            r1.dataFlowAutoStartValue = r0
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initModeImplForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.KsAdVideoPlayConfig> r0 = com.kwad.sdk.api.KsAdVideoPlayConfig.class
            java.lang.Class<com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl> r1 = com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl.class
            com.kwad.sdk.service.c.b(r0, r1)
            return
    }

    public int getDataFlowAutoStartValue() {
            r1 = this;
            int r0 = r1.dataFlowAutoStartValue
            return r0
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public int getVideoAutoPlayType() {
            r1 = this;
            int r0 = r1.videoAutoPlayType
            return r0
    }

    public int getVideoSoundValue() {
            r1 = this;
            int r0 = r1.videoSoundValue
            return r0
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public boolean isDataFlowAutoStart() {
            r1 = this;
            boolean r0 = r1.dataFlowAutoStart
            return r0
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public boolean isNoCache() {
            r1 = this;
            boolean r0 = r1.hasNoCache
            return r0
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public boolean isVideoSoundEnable() {
            r1 = this;
            boolean r0 = r1.videoSoundEnable
            return r0
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public void setDataFlowAutoStart(boolean r1) {
            r0 = this;
            r0.dataFlowAutoStart = r1
            r1 = 1
            r0.dataFlowAutoStartValue = r1
            r1 = 0
            r0.videoAutoPlayType = r1
            return
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public void setNoCache() {
            r1 = this;
            r0 = 1
            r1.hasNoCache = r0
            return
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public void setVideoAutoPlayType(int r1) {
            r0 = this;
            r0.videoAutoPlayType = r1
            r1 = 0
            r0.dataFlowAutoStartValue = r1
            return
    }

    @Override // com.kwad.sdk.api.KsAdVideoPlayConfig
    public void setVideoSoundEnable(boolean r1) {
            r0 = this;
            r0.videoSoundEnable = r1
            r1 = 1
            r0.videoSoundValue = r1
            return
    }
}
