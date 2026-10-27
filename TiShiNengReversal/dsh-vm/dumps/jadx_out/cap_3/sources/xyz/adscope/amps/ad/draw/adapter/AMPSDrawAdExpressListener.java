package xyz.adscope.amps.ad.draw.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSDrawAdExpressListener implements xyz.adscope.amps.base.AMPSBaseListener {
    public AMPSDrawAdExpressListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onAdClicked();

    public abstract void onAdClosed(android.view.View r1);

    public abstract void onAdShow();

    public abstract void onRenderFail(android.view.View r1, java.lang.String r2, int r3);

    public abstract void onRenderSuccess(android.view.View r1, float r2, float r3);
}
