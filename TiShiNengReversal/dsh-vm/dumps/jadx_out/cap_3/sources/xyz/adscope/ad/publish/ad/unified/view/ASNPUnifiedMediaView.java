package xyz.adscope.ad.publish.ad.unified.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPUnifiedMediaView extends android.widget.FrameLayout {
    public ASNPUnifiedMediaView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ASNPUnifiedMediaView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ASNPUnifiedMediaView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public ASNPUnifiedMediaView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public void setMediaConfig(xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "scope_unified_media_config"
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            r2.setTag(r0, r3)
            return
    }
}
