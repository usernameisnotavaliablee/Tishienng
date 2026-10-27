package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LogStrategyModel {
    private java.lang.String acceptEncrypt;
    private xyz.adscope.amps.model.config.response.LogCrashModel crash;
    private java.lang.String customData;
    private java.lang.String customId;
    private java.util.List<xyz.adscope.amps.model.config.response.LogEventModel> event;
    private java.lang.String version;

    public LogStrategyModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getAcceptEncrypt() {
            r1 = this;
            java.lang.String r0 = r1.acceptEncrypt
            return r0
    }

    public xyz.adscope.amps.model.config.response.LogCrashModel getCrash() {
            r1 = this;
            xyz.adscope.amps.model.config.response.LogCrashModel r0 = r1.crash
            return r0
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public java.lang.String getCustomId() {
            r1 = this;
            java.lang.String r0 = r1.customId
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.LogEventModel> getEvent() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.LogEventModel> r0 = r1.event
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

    public void setCrash(xyz.adscope.amps.model.config.response.LogCrashModel r1) {
            r0 = this;
            r0.crash = r1
            return
    }

    public void setCustomData(java.lang.String r1) {
            r0 = this;
            r0.customData = r1
            return
    }

    public void setCustomId(java.lang.String r1) {
            r0 = this;
            r0.customId = r1
            return
    }

    public void setEvent(java.util.List<xyz.adscope.amps.model.config.response.LogEventModel> r1) {
            r0 = this;
            r0.event = r1
            return
    }

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.version = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"acceptEncrypt\":\""
            r0.append(r1)
            java.lang.String r1 = r2.acceptEncrypt
            r0.append(r1)
            java.lang.String r1 = "\", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r2.customData
            r0.append(r1)
            java.lang.String r1 = "\", \"version\":\""
            r0.append(r1)
            java.lang.String r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = "\", \"customId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.customId
            r0.append(r1)
            java.lang.String r1 = "\", \"event\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.LogEventModel> r1 = r2.event
            r0.append(r1)
            java.lang.String r1 = ", \"crash\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.LogCrashModel r1 = r2.crash
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
