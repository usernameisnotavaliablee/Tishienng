package xyz.adscope.common.v2.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IBaseToJsonModel implements xyz.adscope.common.v2.model.IJsonMappingModel {
    public IBaseToJsonModel() {
            r0 = this;
            r0.<init>()
            return
    }

    protected java.lang.String parseToJsonString() {
            r1 = this;
            java.lang.String r0 = xyz.adscope.common.v2.tool.json.JsonUtil.entry2JsonString(r1)
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IJsonMappingModel
    public java.lang.String toJsonString() {
            r1 = this;
            java.lang.String r0 = r1.parseToJsonString()
            return r0
    }
}
