package xyz.adscope.amps.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSInitAdapterConfig {
    private xyz.adscope.amps.init.AMPSInitChannelAdapterConfig ampsInitChannelAdapterConfig;
    private java.lang.String appId;

    public AMPSInitAdapterConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public xyz.adscope.amps.init.AMPSInitChannelAdapterConfig getAmpsInitChannelAdapterConfig() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public java.lang.String getAppName() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getAppName()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getCustomOAID() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getCustomOAID()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> getLocalExtraMap() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.getLocalExtraMap()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String getOptionInfo() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getOptionInfo()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public xyz.adscope.amps.config.AMPSPrivacyConfig getPrivacyConfig() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            xyz.adscope.amps.config.AMPSPrivacyConfig r0 = r0.getPrivacyConfig()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getUserId()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public boolean isDebug() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            boolean r0 = r0.isDebug()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isPersonalRecommend() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r1.ampsInitChannelAdapterConfig
            if (r0 == 0) goto L9
            boolean r0 = r0.isPersonalRecommend()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void setAmpsInitChannelAdapterConfig(xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1) {
            r0 = this;
            r0.ampsInitChannelAdapterConfig = r1
            return
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }
}
