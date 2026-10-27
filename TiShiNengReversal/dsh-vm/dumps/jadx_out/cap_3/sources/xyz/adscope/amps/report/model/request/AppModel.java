package xyz.adscope.amps.report.model.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AppModel {
    private java.lang.String bundleId;
    private java.lang.String ext;
    private java.lang.String install;
    private java.lang.String name;
    private java.lang.String update;
    private java.lang.String version;

    public AppModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.name = r0
            r1.bundleId = r0
            r1.version = r0
            r1.install = r0
            r1.update = r0
            r1.ext = r0
            return
    }

    public AppModel(xyz.adscope.amps.report.model.request.AppModel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.name = r0
            r1.bundleId = r0
            r1.version = r0
            r1.install = r0
            r1.update = r0
            r1.ext = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            java.lang.String r0 = r2.getBundleId()
            r1.bundleId = r0
            java.lang.String r0 = r2.getVersion()
            r1.version = r0
            java.lang.String r0 = r2.getInstall()
            r1.install = r0
            java.lang.String r0 = r2.getUpdate()
            r1.update = r0
            java.lang.String r2 = r2.getExt()
            r1.ext = r2
            return
    }

    public java.lang.String getBundleId() {
            r1 = this;
            java.lang.String r0 = r1.bundleId
            return r0
    }

    public java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public java.lang.String getInstall() {
            r1 = this;
            java.lang.String r0 = r1.install
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getUpdate() {
            r1 = this;
            java.lang.String r0 = r1.update
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public void setBundleId(java.lang.String r1) {
            r0 = this;
            r0.bundleId = r1
            return
    }

    public void setExt(java.lang.String r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setInstall(java.lang.String r1) {
            r0 = this;
            r0.install = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public void setUpdate(java.lang.String r1) {
            r0 = this;
            r0.update = r1
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
            java.lang.String r1 = "{\"name\":\""
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "\", \"bundleId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.bundleId
            r0.append(r1)
            java.lang.String r1 = "\", \"version\":\""
            r0.append(r1)
            java.lang.String r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = "\", \"install\":\""
            r0.append(r1)
            java.lang.String r1 = r2.install
            r0.append(r1)
            java.lang.String r1 = "\", \"update\":\""
            r0.append(r1)
            java.lang.String r1 = r2.update
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
