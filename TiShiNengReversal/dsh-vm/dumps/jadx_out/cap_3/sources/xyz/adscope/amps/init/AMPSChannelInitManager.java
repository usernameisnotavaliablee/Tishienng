package xyz.adscope.amps.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSChannelInitManager {
    private static xyz.adscope.amps.init.AMPSChannelInitManager instance;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> channelInitMap;
    private java.lang.String mASNPSDKVersion;
    private java.lang.String mBDSDKVersion;
    private java.lang.String mBZSDKVersion;
    private java.lang.String mCSJSDKVersion;
    private java.lang.String mGDTSDKVersion;
    private java.lang.String mGMSDKVersion;
    private java.lang.String mHWSDKVersion;
    private java.lang.String mKSSDKVersion;
    private java.lang.String mQMSDKVersion;

    private AMPSChannelInitManager() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.channelInitMap = r0
            return
    }

    public static synchronized xyz.adscope.amps.init.AMPSChannelInitManager getInstance() {
            java.lang.Class<xyz.adscope.amps.init.AMPSChannelInitManager> r0 = xyz.adscope.amps.init.AMPSChannelInitManager.class
            monitor-enter(r0)
            xyz.adscope.amps.init.AMPSChannelInitManager r1 = xyz.adscope.amps.init.AMPSChannelInitManager.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.init.AMPSChannelInitManager> r1 = xyz.adscope.amps.init.AMPSChannelInitManager.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.init.AMPSChannelInitManager r2 = new xyz.adscope.amps.init.AMPSChannelInitManager     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.init.AMPSChannelInitManager.instance = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            goto L1c
        L18:
            xyz.adscope.amps.init.AMPSChannelInitManager r1 = xyz.adscope.amps.init.AMPSChannelInitManager.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public java.lang.String getASNPSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mASNPSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.asnp.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mASNPSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mASNPSDKVersion
            return r0
    }

    public java.lang.String getBDSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mBDSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.bd.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mBDSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mBDSDKVersion
            return r0
    }

    public java.lang.String getBZSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mBZSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.bz.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mBZSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mBZSDKVersion
            return r0
    }

    public java.lang.String getCSJSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mCSJSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.csj.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mCSJSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mCSJSDKVersion
            return r0
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> getChannelInitMap() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            return r0
    }

    public xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus getChannelInitStatus(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            if (r0 == 0) goto L25
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = r0 instanceof xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus
            if (r0 == 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            java.lang.Object r2 = r0.get(r2)
            xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus r2 = (xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus) r2
            return r2
        L25:
            r2 = 0
            return r2
    }

    public java.lang.String getChannelSdkVersion(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            if (r0 == 0) goto L25
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L25:
            r2 = 0
            return r2
    }

    public java.lang.String getGDTSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mGDTSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.gdt.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mGDTSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mGDTSDKVersion
            return r0
    }

    public java.lang.String getGMSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mGMSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.gm.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mGMSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mGMSDKVersion
            return r0
    }

    public java.lang.String getHWSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mHWSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.hw.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mHWSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mHWSDKVersion
            return r0
    }

    public java.lang.String getKSSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mKSSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.ks.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mKSSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mKSSDKVersion
            return r0
    }

    public java.lang.String getQMSDKVersion() {
            r1 = this;
            java.lang.String r0 = r1.mQMSDKVersion
            if (r0 != 0) goto L12
            java.lang.String r0 = "xyz.adscope.amps.adapter.qm.ASNPInitMediation"
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r0 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getNetworkVersion()
            r1.mQMSDKVersion = r0
        L12:
            java.lang.String r0 = r1.mQMSDKVersion
            return r0
    }

    public void putChannelInitStatus(java.lang.String r2, xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus r3) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            if (r0 != 0) goto Lb
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.channelInitMap = r0
        Lb:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            r0.put(r2, r3)
            return
    }

    public void putChannelSdkVersion(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            if (r0 != 0) goto Lb
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.channelInitMap = r0
        Lb:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r1.channelInitMap
            r0.put(r2, r3)
            return
    }
}
