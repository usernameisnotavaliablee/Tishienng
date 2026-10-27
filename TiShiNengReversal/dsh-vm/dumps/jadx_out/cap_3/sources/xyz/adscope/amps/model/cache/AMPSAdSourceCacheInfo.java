package xyz.adscope.amps.model.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSAdSourceCacheInfo {
    private java.lang.String appId;
    private xyz.adscope.amps.base.AMPSBaseAdapter baseAdapter;
    private long cachedOffersTimeout;
    private long cachedTime;
    private int ecpm;
    private java.lang.String spaceId;

    public AMPSAdSourceCacheInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public xyz.adscope.amps.base.AMPSBaseAdapter getBaseAdapter() {
            r1 = this;
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r1.baseAdapter
            return r0
    }

    public long getCachedOffersTimeout() {
            r2 = this;
            long r0 = r2.cachedOffersTimeout
            return r0
    }

    public long getCachedTime() {
            r2 = this;
            long r0 = r2.cachedTime
            return r0
    }

    public int getEcpm() {
            r1 = this;
            int r0 = r1.ecpm
            return r0
    }

    public java.lang.String getSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.spaceId
            return r0
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    public void setBaseAdapter(xyz.adscope.amps.base.AMPSBaseAdapter r1) {
            r0 = this;
            r0.baseAdapter = r1
            return
    }

    public void setCachedOffersTimeout(long r1) {
            r0 = this;
            r0.cachedOffersTimeout = r1
            return
    }

    public void setCachedTime(long r1) {
            r0 = this;
            r0.cachedTime = r1
            return
    }

    public void setEcpm(int r1) {
            r0 = this;
            r0.ecpm = r1
            return
    }

    public void setSpaceId(java.lang.String r1) {
            r0 = this;
            r0.spaceId = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AMPSAdSourceCacheInfo{appId='"
            r0.append(r1)
            java.lang.String r1 = r3.appId
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", spaceId='"
            r0.append(r2)
            java.lang.String r2 = r3.spaceId
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", ecpm="
            r0.append(r1)
            int r1 = r3.ecpm
            r0.append(r1)
            java.lang.String r1 = ", baseAdapter="
            r0.append(r1)
            xyz.adscope.amps.base.AMPSBaseAdapter r1 = r3.baseAdapter
            r0.append(r1)
            java.lang.String r1 = ", cachedTime="
            r0.append(r1)
            long r1 = r3.cachedTime
            r0.append(r1)
            java.lang.String r1 = ", cachedOffersTimeout="
            r0.append(r1)
            long r1 = r3.cachedOffersTimeout
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
