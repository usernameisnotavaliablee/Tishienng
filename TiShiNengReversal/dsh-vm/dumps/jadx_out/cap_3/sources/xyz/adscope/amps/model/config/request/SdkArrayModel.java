package xyz.adscope.amps.model.config.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SdkArrayModel {
    private java.lang.String sdkId;
    private java.lang.String sdkName;
    private java.lang.String version;

    public SdkArrayModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getSdkId() {
            r1 = this;
            java.lang.String r0 = r1.sdkId
            return r0
    }

    public java.lang.String getSdkName() {
            r1 = this;
            java.lang.String r0 = r1.sdkName
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public void setSdkId(java.lang.String r1) {
            r0 = this;
            r0.sdkId = r1
            return
    }

    public void setSdkName(java.lang.String r1) {
            r0 = this;
            r0.sdkName = r1
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
            java.lang.String r1 = "{\"sdkId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.sdkId
            r0.append(r1)
            java.lang.String r1 = "\", \"sdkName\":\""
            r0.append(r1)
            java.lang.String r1 = r2.sdkName
            r0.append(r1)
            java.lang.String r1 = "\", \"version\":\""
            r0.append(r1)
            java.lang.String r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
