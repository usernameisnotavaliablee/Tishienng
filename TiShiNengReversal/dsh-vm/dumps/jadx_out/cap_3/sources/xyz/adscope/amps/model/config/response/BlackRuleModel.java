package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BlackRuleModel {
    private java.util.List<java.lang.String> blackList;

    public BlackRuleModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<java.lang.String> getBlackList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.blackList
            return r0
    }

    public void setBlackList(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.blackList = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"blackList\":"
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.blackList
            java.lang.String r1 = xyz.adscope.common.tool.utils.StringUtil.ListToString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
