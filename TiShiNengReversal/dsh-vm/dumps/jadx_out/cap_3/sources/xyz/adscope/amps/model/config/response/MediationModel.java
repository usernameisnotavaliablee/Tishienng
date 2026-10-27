package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MediationModel {
    private java.lang.String appId;
    private java.lang.String customData;
    private java.lang.String ext;
    private java.util.List<xyz.adscope.amps.model.config.response.SpaceModel> spaceList;
    private java.lang.String version;

    public MediationModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.version = r0
            r1.appId = r0
            r1.ext = r0
            r1.customData = r0
            return
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.SpaceModel> getSpaceList() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.SpaceModel> r0 = r1.spaceList
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    public void setCustomData(java.lang.String r1) {
            r0 = this;
            r0.customData = r1
            return
    }

    public void setExt(java.lang.String r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setSpaceList(java.util.List<xyz.adscope.amps.model.config.response.SpaceModel> r1) {
            r0 = this;
            r0.spaceList = r1
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
            java.lang.String r1 = "{\"spaceList\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.SpaceModel> r1 = r2.spaceList
            r0.append(r1)
            java.lang.String r1 = ", \"version\":\""
            r0.append(r1)
            java.lang.String r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = "\", \"appId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.appId
            r0.append(r1)
            java.lang.String r1 = "\", \"ext\":\""
            r0.append(r1)
            java.lang.String r1 = r2.ext
            r0.append(r1)
            java.lang.String r1 = "\", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r2.customData
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
