package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SortAdSourceModel {
    private xyz.adscope.amps.model.config.response.AdSourceModel adSourceModel;
    private int ecpm;
    private boolean isCandidate;
    private boolean isHitWeight;

    public SortAdSourceModel(xyz.adscope.amps.model.config.response.AdSourceModel r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.adSourceModel = r1
            r0.ecpm = r2
            boolean r1 = r1.isHitWeight()
            r0.isHitWeight = r1
            r0.isCandidate = r3
            return
    }

    public xyz.adscope.amps.model.config.response.AdSourceModel getAdSourceModel() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r1.adSourceModel
            return r0
    }

    public int getEcpm() {
            r1 = this;
            int r0 = r1.ecpm
            return r0
    }

    public boolean isCandidate() {
            r1 = this;
            boolean r0 = r1.isCandidate
            return r0
    }

    public boolean isHitWeight() {
            r1 = this;
            boolean r0 = r1.isHitWeight
            return r0
    }

    public void setAdSourceModel(xyz.adscope.amps.model.config.response.AdSourceModel r1) {
            r0 = this;
            r0.adSourceModel = r1
            return
    }

    public void setCandidate(boolean r1) {
            r0 = this;
            r0.isCandidate = r1
            return
    }

    public void setEcpm(int r1) {
            r0 = this;
            r0.ecpm = r1
            return
    }

    public void setHitWeight(boolean r1) {
            r0 = this;
            r0.isHitWeight = r1
            return
    }
}
