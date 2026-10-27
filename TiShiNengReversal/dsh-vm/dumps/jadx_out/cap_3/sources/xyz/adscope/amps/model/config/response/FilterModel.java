package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FilterModel implements xyz.adscope.amps.model.inter.IDeepCopyModel<xyz.adscope.amps.model.config.response.FilterModel> {
    private java.util.List<xyz.adscope.amps.model.config.response.FrequencyModel> frequency;
    private long minLoadTime;

    public FilterModel() {
            r0 = this;
            r0.<init>()
            return
    }

    private FilterModel(xyz.adscope.amps.model.config.response.FilterModel r3) {
            r2 = this;
            r2.<init>()
            long r0 = r3.getMinLoadTime()
            r2.minLoadTime = r0
            java.util.List r3 = r3.getFrequency()
            java.util.List r3 = r2.deepCopyFrequencyList(r3)
            r2.frequency = r3
            return
    }

    private java.util.List<xyz.adscope.amps.model.config.response.FrequencyModel> deepCopyFrequencyList(java.util.List<xyz.adscope.amps.model.config.response.FrequencyModel> r3) {
            r2 = this;
            if (r3 == 0) goto L2a
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L2a
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            xyz.adscope.amps.model.config.response.FrequencyModel r1 = (xyz.adscope.amps.model.config.response.FrequencyModel) r1
            if (r1 != 0) goto L21
            goto L12
        L21:
            xyz.adscope.amps.model.config.response.FrequencyModel r1 = r1.deepCopy2()
            r0.add(r1)
            goto L12
        L29:
            return r0
        L2a:
            r3 = 0
            return r3
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.amps.model.config.response.FilterModel deepCopy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.FilterModel r0 = r1.deepCopy2()
            return r0
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    /* renamed from: deepCopy, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.model.config.response.FilterModel deepCopy2() {
            r1 = this;
            xyz.adscope.amps.model.config.response.FilterModel r0 = new xyz.adscope.amps.model.config.response.FilterModel
            r0.<init>(r1)
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.FrequencyModel> getFrequency() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.FrequencyModel> r0 = r1.frequency
            return r0
    }

    public long getMinLoadTime() {
            r2 = this;
            long r0 = r2.minLoadTime
            return r0
    }

    public void setFrequency(java.util.List<xyz.adscope.amps.model.config.response.FrequencyModel> r1) {
            r0 = this;
            r0.frequency = r1
            return
    }

    public void setMinLoadTime(long r1) {
            r0 = this;
            r0.minLoadTime = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"minLoadTime\":"
            r0.append(r1)
            long r1 = r3.minLoadTime
            r0.append(r1)
            java.lang.String r1 = ", \"frequency\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.FrequencyModel> r1 = r3.frequency
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
