package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LogEventModel {
    private java.util.List<java.lang.String> codes;
    private java.lang.String count;
    private java.util.List<java.lang.String> level;
    private java.lang.String sample;
    private java.lang.String time;
    private java.lang.String uploadUrl;

    public LogEventModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<java.lang.String> getCodes() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.codes
            return r0
    }

    public java.lang.String getCount() {
            r1 = this;
            java.lang.String r0 = r1.count
            return r0
    }

    public java.util.List<java.lang.String> getLevel() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.level
            return r0
    }

    public java.lang.String getSample() {
            r1 = this;
            java.lang.String r0 = r1.sample
            return r0
    }

    public java.lang.String getTime() {
            r1 = this;
            java.lang.String r0 = r1.time
            return r0
    }

    public java.lang.String getUploadUrl() {
            r1 = this;
            java.lang.String r0 = r1.uploadUrl
            return r0
    }

    public void setCodes(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.codes = r1
            return
    }

    public void setCount(java.lang.String r1) {
            r0 = this;
            r0.count = r1
            return
    }

    public void setLevel(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.level = r1
            return
    }

    public void setSample(java.lang.String r1) {
            r0 = this;
            r0.sample = r1
            return
    }

    public void setTime(java.lang.String r1) {
            r0 = this;
            r0.time = r1
            return
    }

    public void setUploadUrl(java.lang.String r1) {
            r0 = this;
            r0.uploadUrl = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"codes\":"
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.codes
            java.lang.String r1 = xyz.adscope.common.tool.utils.StringUtil.ListToString(r1)
            r0.append(r1)
            java.lang.String r1 = ", \"level\":"
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.level
            java.lang.String r1 = xyz.adscope.common.tool.utils.StringUtil.ListToString(r1)
            r0.append(r1)
            java.lang.String r1 = ", \"uploadUrl\":\""
            r0.append(r1)
            java.lang.String r1 = r2.uploadUrl
            r0.append(r1)
            java.lang.String r1 = "\", \"count\":\""
            r0.append(r1)
            java.lang.String r1 = r2.count
            r0.append(r1)
            java.lang.String r1 = "\", \"time\":\""
            r0.append(r1)
            java.lang.String r1 = r2.time
            r0.append(r1)
            java.lang.String r1 = "\", \"sample\":\""
            r0.append(r1)
            java.lang.String r1 = r2.sample
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
