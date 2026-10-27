package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FrequencyModel implements xyz.adscope.amps.model.inter.IDeepCopyModel<xyz.adscope.amps.model.config.response.FrequencyModel> {
    private int count;
    private java.lang.String event;
    private long time;

    public FrequencyModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.event = r0
            return
    }

    private FrequencyModel(xyz.adscope.amps.model.config.response.FrequencyModel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.event = r0
            long r0 = r3.getTime()
            r2.time = r0
            java.lang.String r0 = r3.getEvent()
            r2.event = r0
            int r3 = r3.getCount()
            r2.count = r3
            return
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.amps.model.config.response.FrequencyModel deepCopy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.FrequencyModel r0 = r1.deepCopy2()
            return r0
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    /* renamed from: deepCopy, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.model.config.response.FrequencyModel deepCopy2() {
            r1 = this;
            xyz.adscope.amps.model.config.response.FrequencyModel r0 = new xyz.adscope.amps.model.config.response.FrequencyModel
            r0.<init>(r1)
            return r0
    }

    public int getCount() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public java.lang.String getEvent() {
            r1 = this;
            java.lang.String r0 = r1.event
            return r0
    }

    public long getTime() {
            r2 = this;
            long r0 = r2.time
            return r0
    }

    public void setCount(int r1) {
            r0 = this;
            r0.count = r1
            return
    }

    public void setEvent(java.lang.String r1) {
            r0 = this;
            r0.event = r1
            return
    }

    public void setTime(long r1) {
            r0 = this;
            r0.time = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"time\":"
            r0.append(r1)
            long r1 = r3.time
            r0.append(r1)
            java.lang.String r1 = ", \"event\":\""
            r0.append(r1)
            java.lang.String r1 = r3.event
            r0.append(r1)
            java.lang.String r1 = "\", \"count\":"
            r0.append(r1)
            int r1 = r3.count
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
