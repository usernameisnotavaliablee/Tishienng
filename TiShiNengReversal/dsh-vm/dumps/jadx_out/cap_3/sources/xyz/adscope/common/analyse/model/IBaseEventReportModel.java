package xyz.adscope.common.analyse.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IBaseEventReportModel extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel implements xyz.adscope.common.v2.model.IDeepCopyModel, xyz.adscope.common.v2.model.IBaseEventModel {
    protected final xyz.adscope.common.analyse.model.IStringEventEnum event;

    public IBaseEventReportModel(xyz.adscope.common.analyse.model.IStringEventEnum r1) {
            r0 = this;
            r0.<init>()
            r0.event = r1
            return
    }

    @Override // xyz.adscope.common.v2.model.IBaseEventModel
    public java.lang.String getEventCode() {
            r1 = this;
            xyz.adscope.common.analyse.model.IStringEventEnum r0 = r1.event
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getEventCode()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }
}
