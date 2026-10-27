package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ConfigModel {
    private java.lang.String acceptEncrypt;
    private java.lang.String biddingURL;
    private long checkTime;
    private java.lang.String configURL;
    private java.lang.String customData;
    private long expireTime;
    private java.lang.String ext;
    private java.lang.String macro;
    private long maxExpireTime;
    private java.lang.String version;

    public ConfigModel() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.configURL = r0
            r1 = 0
            r3.checkTime = r1
            r3.biddingURL = r0
            r3.maxExpireTime = r1
            r3.version = r0
            r3.expireTime = r1
            r3.acceptEncrypt = r0
            r3.customData = r0
            r3.macro = r0
            r3.ext = r0
            return
    }

    public java.lang.String getAcceptEncrypt() {
            r1 = this;
            java.lang.String r0 = r1.acceptEncrypt
            return r0
    }

    public java.lang.String getBiddingURL() {
            r1 = this;
            java.lang.String r0 = r1.biddingURL
            return r0
    }

    public long getCheckTime() {
            r2 = this;
            long r0 = r2.checkTime
            return r0
    }

    public java.lang.String getConfigURL() {
            r1 = this;
            java.lang.String r0 = r1.configURL
            return r0
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public long getExpireTime() {
            r2 = this;
            long r0 = r2.expireTime
            return r0
    }

    public java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public java.lang.String getMacro() {
            r1 = this;
            java.lang.String r0 = r1.macro
            return r0
    }

    public long getMaxExpireTime() {
            r2 = this;
            long r0 = r2.maxExpireTime
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public void setAcceptEncrypt(java.lang.String r1) {
            r0 = this;
            r0.acceptEncrypt = r1
            return
    }

    public void setBiddingURL(java.lang.String r1) {
            r0 = this;
            r0.biddingURL = r1
            return
    }

    public void setCheckTime(long r1) {
            r0 = this;
            r0.checkTime = r1
            return
    }

    public void setConfigURL(java.lang.String r1) {
            r0 = this;
            r0.configURL = r1
            return
    }

    public void setCustomData(java.lang.String r1) {
            r0 = this;
            r0.customData = r1
            return
    }

    public void setExpireTime(long r1) {
            r0 = this;
            r0.expireTime = r1
            return
    }

    public void setExt(java.lang.String r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setMacro(java.lang.String r1) {
            r0 = this;
            r0.macro = r1
            return
    }

    public void setMaxExpireTime(long r1) {
            r0 = this;
            r0.maxExpireTime = r1
            return
    }

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.version = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"configURL\":\""
            r0.append(r1)
            java.lang.String r1 = r3.configURL
            r0.append(r1)
            java.lang.String r1 = "\", \"checkTime\":"
            r0.append(r1)
            long r1 = r3.checkTime
            r0.append(r1)
            java.lang.String r1 = ", \"biddingURL\":\""
            r0.append(r1)
            java.lang.String r1 = r3.biddingURL
            r0.append(r1)
            java.lang.String r1 = "\", \"maxExpireTime\":"
            r0.append(r1)
            long r1 = r3.maxExpireTime
            r0.append(r1)
            java.lang.String r1 = ", \"version\":\""
            r0.append(r1)
            java.lang.String r1 = r3.version
            r0.append(r1)
            java.lang.String r1 = "\", \"expireTime\":"
            r0.append(r1)
            long r1 = r3.expireTime
            r0.append(r1)
            java.lang.String r1 = ", \"acceptEncrypt\":\""
            r0.append(r1)
            java.lang.String r1 = r3.acceptEncrypt
            r0.append(r1)
            java.lang.String r1 = "\", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.customData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\", \"macro\":\""
            r0.append(r1)
            java.lang.String r1 = r3.macro
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\", \"ext\":\""
            r0.append(r1)
            java.lang.String r1 = r3.ext
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
