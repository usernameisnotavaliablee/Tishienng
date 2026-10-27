package com.kwad.components.ad.reward.widget.actionbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ActionBarH5 extends android.widget.FrameLayout implements com.kwad.sdk.widget.d {
    private android.widget.TextView Ew;
    private com.kwad.components.ad.reward.widget.actionbar.ActionBarH5.a Ex;
    private android.view.View Ey;
    private android.widget.TextView gD;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void O(boolean r1);
    }

    public ActionBarH5(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.B(r1)
            return
    }

    public ActionBarH5(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.B(r1)
            return
    }

    public ActionBarH5(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.B(r1)
            return
    }

    private void B(android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_video_actionbar_h5
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_h5_ad_desc
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Ew = r2
            int r2 = com.kwad.sdk.R.id.ksad_h5_open_btn
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.gD = r2
            int r2 = com.kwad.sdk.R.id.ksad_download_bar_cover
            android.view.View r2 = r1.findViewById(r2)
            r1.Ey = r2
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.widget.actionbar.ActionBarH5.a a(com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r0) {
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5$a r0 = r0.Ex
            return r0
    }

    private void d(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.View r0 = r2.Ey
            if (r3 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 2
        L7:
            com.kwad.components.core.e.d.a$a r1 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r1.aB(r3)
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r0)
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5$1 r0 = new com.kwad.components.ad.reward.widget.actionbar.ActionBarH5$1
            r0.<init>(r2, r4)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r0)
            com.kwad.components.core.e.d.a.a(r3)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.d(r2, r0)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.components.ad.reward.widget.actionbar.ActionBarH5.a r3) {
            r1 = this;
            r1.mAdTemplate = r2
            r1.Ex = r3
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            android.widget.TextView r3 = r1.Ew
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r2)
            r3.setText(r0)
            android.widget.TextView r3 = r1.gD
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r2)
            r3.setText(r2)
            r2 = 1
            r1.setClickable(r2)
            android.view.View r3 = r1.Ey
            r3.setClickable(r2)
            com.kwad.sdk.widget.h r2 = new com.kwad.sdk.widget.h
            android.view.View r3 = r1.Ey
            r2.<init>(r3, r1)
            com.kwad.sdk.widget.h r2 = new com.kwad.sdk.widget.h
            r2.<init>(r1, r1)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            r1.d(r2, r0)
        Lc:
            return
    }
}
