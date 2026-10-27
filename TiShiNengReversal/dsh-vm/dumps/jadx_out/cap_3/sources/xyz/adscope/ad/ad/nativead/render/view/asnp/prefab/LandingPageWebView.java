package xyz.adscope.ad.ad.nativead.render.view.asnp.prefab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LandingPageWebView extends xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView {
    private boolean a;

    public LandingPageWebView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.a = r1
            return
    }

    public LandingPageWebView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.a = r1
            return
    }

    public LandingPageWebView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.a = r1
            return
    }

    public LandingPageWebView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 0
            r0.a = r1
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView
    protected boolean a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "http"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            boolean r0 = r1.a
            if (r0 == 0) goto L15
            android.content.Context r0 = r1.getContext()
            xyz.adscope.ad.n4.a(r0, r2)
        L15:
            r2 = 1
            return r2
    }

    public void setAllowDeeplinkDirect(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
