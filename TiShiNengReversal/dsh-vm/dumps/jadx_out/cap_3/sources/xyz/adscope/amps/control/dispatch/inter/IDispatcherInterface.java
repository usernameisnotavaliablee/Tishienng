package xyz.adscope.amps.control.dispatch.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IDispatcherInterface {
    java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> biddingTimeOut();

    java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> dispatch(xyz.adscope.amps.model.config.response.AdSourceModel r1);

    void updateAdSourceAdStatus(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1, int r2);
}
