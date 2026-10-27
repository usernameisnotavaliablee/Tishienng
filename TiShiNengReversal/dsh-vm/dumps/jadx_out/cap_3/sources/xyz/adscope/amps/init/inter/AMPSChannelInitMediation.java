package xyz.adscope.amps.init.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSChannelInitMediation {
    public AMPSChannelInitMediation() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List getActivityStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List getMetaValutStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getNetworkName() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getNetworkSDKClass() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getNetworkVersion() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Boolean> getPluginClassStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List getProviderStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List getServiceStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void initSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r1, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r2);

    public void initSDKFail(xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r3, xyz.adscope.amps.common.AMPSError r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getNetworkName()
            r0.append(r1)
            java.lang.String r1 = "SDK init fail code:"
            r0.append(r1)
            java.lang.String r1 = r4.getCode()
            r0.append(r1)
            java.lang.String r1 = "; message:"
            r0.append(r1)
            java.lang.String r1 = r4.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            if (r3 == 0) goto L32
            r3.failCallBack(r4)
        L32:
            return
    }

    public void initSDKSuccess(xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.successCallBack()
        L5:
            return
    }
}
