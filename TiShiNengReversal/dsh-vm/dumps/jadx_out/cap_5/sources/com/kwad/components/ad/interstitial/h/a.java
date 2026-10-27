package com.kwad.components.ad.interstitial.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a extends android.widget.FrameLayout {

    @androidx.annotation.NonNull
    protected android.content.Context mContext;

    public a(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mContext = r1
            return
    }

    public abstract void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r1, com.kwad.components.ad.interstitial.d r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsAdVideoPlayConfig r3, com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r4, int r5);

    public abstract void dA();

    public abstract void dB();

    public abstract void setAdInteractionListener(com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r1);
}
