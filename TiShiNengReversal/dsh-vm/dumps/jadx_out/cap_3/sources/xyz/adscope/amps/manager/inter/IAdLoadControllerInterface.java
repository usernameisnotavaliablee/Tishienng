package xyz.adscope.amps.manager.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IAdLoadControllerInterface {
    void bidPrice();

    void cacheAdSource();

    void configManager();

    void dispatcher(xyz.adscope.amps.model.config.response.AdSourceModel r1);

    void filter();

    xyz.adscope.amps.model.config.response.SpaceModel getSpaceModel();

    void loadAd();

    void preLoad();

    void setHasLoadingSuccessAdResource();
}
