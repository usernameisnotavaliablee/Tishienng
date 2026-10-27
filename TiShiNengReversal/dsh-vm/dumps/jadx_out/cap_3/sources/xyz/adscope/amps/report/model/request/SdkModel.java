package xyz.adscope.amps.report.model.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SdkModel {
    private java.lang.String bdSdkVersion;
    private java.lang.String csjSdkVersion;
    private java.lang.String ext;
    private java.lang.String gdtSdkVersion;
    private java.lang.String gmSdkVersion;
    private java.lang.String ksSdkVersion;
    private java.lang.String sdkVersion;
    private java.lang.String yj4SdkVersion;
    private java.lang.String yj5SdkVersion;

    public SdkModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.sdkVersion = r0
            r1.ksSdkVersion = r0
            r1.csjSdkVersion = r0
            r1.gmSdkVersion = r0
            r1.gdtSdkVersion = r0
            r1.yj4SdkVersion = r0
            r1.yj5SdkVersion = r0
            r1.bdSdkVersion = r0
            r1.ext = r0
            return
    }

    public SdkModel(xyz.adscope.amps.report.model.request.SdkModel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.sdkVersion = r0
            r1.ksSdkVersion = r0
            r1.csjSdkVersion = r0
            r1.gmSdkVersion = r0
            r1.gdtSdkVersion = r0
            r1.yj4SdkVersion = r0
            r1.yj5SdkVersion = r0
            r1.bdSdkVersion = r0
            r1.ext = r0
            java.lang.String r0 = r2.getSdkVersion()
            r1.sdkVersion = r0
            java.lang.String r0 = r2.getKsSdkVersion()
            r1.ksSdkVersion = r0
            java.lang.String r0 = r2.getCsjSdkVersion()
            r1.csjSdkVersion = r0
            java.lang.String r0 = r2.getGmSdkVersion()
            r1.gmSdkVersion = r0
            java.lang.String r0 = r2.getGdtSdkVersion()
            r1.gdtSdkVersion = r0
            java.lang.String r0 = r2.getYj4SdkVersion()
            r1.yj4SdkVersion = r0
            java.lang.String r0 = r2.getYj5SdkVersion()
            r1.yj5SdkVersion = r0
            java.lang.String r0 = r2.getBdSdkVersion()
            r1.bdSdkVersion = r0
            java.lang.String r2 = r2.getExt()
            r1.ext = r2
            return
    }

    public java.lang.String getBdSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.bdSdkVersion
            return r0
    }

    public java.lang.String getCsjSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.csjSdkVersion
            return r0
    }

    public java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public java.lang.String getGdtSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.gdtSdkVersion
            return r0
    }

    public java.lang.String getGmSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.gmSdkVersion
            return r0
    }

    public java.lang.String getKsSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.ksSdkVersion
            return r0
    }

    public java.lang.String getSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.sdkVersion
            return r0
    }

    public java.lang.String getYj4SdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.yj4SdkVersion
            return r0
    }

    public java.lang.String getYj5SdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.yj5SdkVersion
            return r0
    }

    public void setBdSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.bdSdkVersion = r1
            return
    }

    public void setCsjSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.csjSdkVersion = r1
            return
    }

    public void setExt(java.lang.String r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setGdtSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.gdtSdkVersion = r1
            return
    }

    public void setGmSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.gmSdkVersion = r1
            return
    }

    public void setKsSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.ksSdkVersion = r1
            return
    }

    public void setSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.sdkVersion = r1
            return
    }

    public void setYj4SdkVersion(java.lang.String r1) {
            r0 = this;
            r0.yj4SdkVersion = r1
            return
    }

    public void setYj5SdkVersion(java.lang.String r1) {
            r0 = this;
            r0.yj5SdkVersion = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"sdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.sdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"ksSdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.ksSdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"csjSdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.csjSdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"gmSdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.gmSdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"gdtSdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.gdtSdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"yj4SdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.yj4SdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"yj5SdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.yj5SdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"bdSdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.bdSdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"ext\":\""
            r0.append(r1)
            java.lang.String r1 = r2.ext
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
