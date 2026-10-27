package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AdSourceNoticeRuleModel implements xyz.adscope.amps.model.inter.IDeepCopyModel<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> {
    private java.lang.String add;
    private java.util.List<java.lang.String> priceGapScope;
    private java.lang.String random;
    private java.lang.String subtract;

    public AdSourceNoticeRuleModel() {
            r0 = this;
            r0.<init>()
            return
    }

    private AdSourceNoticeRuleModel(xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getAdd()
            r1.add = r0
            java.lang.String r0 = r2.getSubtract()
            r1.subtract = r0
            java.lang.String r0 = r2.getRandom()
            r1.random = r0
            java.util.List r2 = r2.getPriceGapScope()
            java.util.List r2 = r1.deepCopyPriceGapScopeList(r2)
            r1.priceGapScope = r2
            return
    }

    private java.util.List<java.lang.String> deepCopyPriceGapScopeList(java.util.List<java.lang.String> r3) {
            r2 = this;
            if (r3 == 0) goto L26
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L26
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L21
            goto L12
        L21:
            r0.add(r1)
            goto L12
        L25:
            return r0
        L26:
            r3 = 0
            return r3
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel deepCopy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r0 = r1.deepCopy2()
            return r0
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    /* renamed from: deepCopy, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel deepCopy2() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r0 = new xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getAdd() {
            r1 = this;
            java.lang.String r0 = r1.add
            return r0
    }

    public java.util.List<java.lang.String> getPriceGapScope() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.priceGapScope
            return r0
    }

    public java.lang.String getRandom() {
            r1 = this;
            java.lang.String r0 = r1.random
            return r0
    }

    public java.lang.String getSubtract() {
            r1 = this;
            java.lang.String r0 = r1.subtract
            return r0
    }

    public void setAdd(java.lang.String r1) {
            r0 = this;
            r0.add = r1
            return
    }

    public void setPriceGapScope(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.priceGapScope = r1
            return
    }

    public void setRandom(java.lang.String r1) {
            r0 = this;
            r0.random = r1
            return
    }

    public void setSubtract(java.lang.String r1) {
            r0 = this;
            r0.subtract = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"add\":\""
            r0.append(r1)
            java.lang.String r1 = r2.add
            r0.append(r1)
            java.lang.String r1 = "\", \"subtract\":\""
            r0.append(r1)
            java.lang.String r1 = r2.subtract
            r0.append(r1)
            java.lang.String r1 = "\", \"random\":\""
            r0.append(r1)
            java.lang.String r1 = r2.random
            r0.append(r1)
            java.lang.String r1 = "\", \"priceGapScope\":"
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.priceGapScope
            java.lang.String r1 = xyz.adscope.common.tool.utils.StringUtil.ListToString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
