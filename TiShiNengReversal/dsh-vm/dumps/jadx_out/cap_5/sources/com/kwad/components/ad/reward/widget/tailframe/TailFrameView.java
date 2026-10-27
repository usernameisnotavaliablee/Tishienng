package com.kwad.components.ad.reward.widget.tailframe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TailFrameView extends com.kwad.sdk.widget.KSFrameLayout {
    private com.kwad.components.ad.reward.widget.tailframe.a EL;
    private com.kwad.components.ad.reward.g tm;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.kwad.components.ad.reward.widget.tailframe.a implements com.kwad.sdk.widget.d {
        public a() {
                r1 = this;
                int r0 = com.kwad.sdk.R.layout.ksad_video_tf_view_landscape_horizontal
                r1.<init>(r0)
                return
        }

        @Override // com.kwad.components.ad.reward.widget.tailframe.a
        public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, org.json.JSONObject r2, com.kwad.components.ad.reward.widget.tailframe.b r3) {
                r0 = this;
                super.a(r1, r2, r3)
                android.widget.ImageView r1 = r0.EB
                com.kwad.sdk.core.response.model.AdInfo r2 = r0.mAdInfo
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.X(r2)
                com.kwad.sdk.core.response.model.AdTemplate r3 = r0.mAdTemplate
                com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends com.kwad.components.ad.reward.widget.tailframe.a implements com.kwad.sdk.widget.d {
        private android.widget.ImageView EM;
        private android.widget.ImageView EN;
        private android.widget.ImageView EO;

        public b() {
                r1 = this;
                int r0 = com.kwad.sdk.R.layout.ksad_video_tf_view_landscape_vertical
                r1.<init>(r0)
                return
        }

        private void lw() {
                r3 = this;
                android.widget.ImageView r0 = r3.EM
                com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
                java.lang.String r1 = com.kwad.sdk.core.response.b.a.X(r1)
                com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
                com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r2)
                android.widget.ImageView r0 = r3.EN
                com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
                java.lang.String r1 = com.kwad.sdk.core.response.b.a.X(r1)
                com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
                com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r2)
                android.widget.ImageView r0 = r3.EO
                com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
                java.lang.String r1 = com.kwad.sdk.core.response.b.a.X(r1)
                com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
                com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r2)
                return
        }

        @Override // com.kwad.components.ad.reward.widget.tailframe.a
        public final void B(android.content.Context r2) {
                r1 = this;
                super.B(r2)
                android.view.View r2 = r1.EA
                int r0 = com.kwad.sdk.R.id.ksad_video_thumb_left
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.EM = r2
                android.view.View r2 = r1.EA
                int r0 = com.kwad.sdk.R.id.ksad_video_thumb_mid
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.EN = r2
                android.view.View r2 = r1.EA
                int r0 = com.kwad.sdk.R.id.ksad_video_thumb_right
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.EO = r2
                return
        }

        @Override // com.kwad.components.ad.reward.widget.tailframe.a
        public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, org.json.JSONObject r2, com.kwad.components.ad.reward.widget.tailframe.b r3) {
                r0 = this;
                super.a(r1, r2, r3)
                r0.lw()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c extends com.kwad.components.ad.reward.widget.tailframe.a implements com.kwad.sdk.widget.d {
        private android.view.View EP;

        public c() {
                r1 = this;
                int r0 = com.kwad.sdk.R.layout.ksad_video_tf_view_portrait_horizontal
                r1.<init>(r0)
                return
        }

        private void lw() {
                r5 = this;
                com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
                com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aX(r0)
                int r1 = r0.width
                int r2 = r0.height
                android.view.View r3 = r5.EA
                android.content.Context r3 = r3.getContext()
                int r3 = com.kwad.sdk.c.a.a.getScreenWidth(r3)
                float r4 = (float) r3
                float r2 = (float) r2
                float r1 = (float) r1
                float r2 = r2 / r1
                float r4 = r4 * r2
                int r1 = (int) r4
                android.widget.ImageView r2 = r5.EB
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                r2.width = r3
                r2.height = r1
                android.widget.ImageView r1 = r5.EB
                java.lang.String r0 = r0.coverUrl
                com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
                com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r2)
                return
        }

        @Override // com.kwad.components.ad.reward.widget.tailframe.a
        public final void B(android.content.Context r2) {
                r1 = this;
                super.B(r2)
                android.view.View r2 = r1.EA
                int r0 = com.kwad.sdk.R.id.video_cover
                android.view.View r2 = r2.findViewById(r0)
                r1.EP = r2
                return
        }

        @Override // com.kwad.components.ad.reward.widget.tailframe.a
        public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, org.json.JSONObject r2, com.kwad.components.ad.reward.widget.tailframe.b r3) {
                r0 = this;
                super.a(r1, r2, r3)
                com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
                boolean r1 = com.kwad.sdk.core.response.b.e.O(r1)
                if (r1 == 0) goto L1d
                android.view.View r1 = r0.EP
                r2 = 8
                r1.setVisibility(r2)
                com.kwad.components.core.widget.KsLogoView r1 = r0.mLogoView
                r1.setVisibility(r2)
                android.view.View r1 = r0.EA
                r2 = 0
                r1.setBackground(r2)
            L1d:
                r0.lw()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d extends com.kwad.components.ad.reward.widget.tailframe.a {
        public d() {
                r1 = this;
                int r0 = com.kwad.sdk.R.layout.ksad_video_tf_view_portrait_vertical
                r1.<init>(r0)
                return
        }

        @Override // com.kwad.components.ad.reward.widget.tailframe.a
        public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, org.json.JSONObject r2, com.kwad.components.ad.reward.widget.tailframe.b r3) {
                r0 = this;
                super.a(r1, r2, r3)
                com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
                boolean r1 = com.kwad.sdk.core.response.b.e.O(r1)
                if (r1 == 0) goto L1d
                android.view.View r1 = r0.EA
                r2 = 0
                r1.setBackground(r2)
                android.widget.ImageView r1 = r0.EB
                r2 = 8
                r1.setVisibility(r2)
                com.kwad.components.core.widget.KsLogoView r1 = r0.mLogoView
                r1.setVisibility(r2)
            L1d:
                android.widget.ImageView r1 = r0.EB
                com.kwad.sdk.core.response.model.AdInfo r2 = r0.mAdInfo
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.X(r2)
                com.kwad.sdk.core.response.model.AdTemplate r3 = r0.mAdTemplate
                com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r2, r3)
                return
        }
    }

    public TailFrameView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public TailFrameView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public TailFrameView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public TailFrameView(@androidx.annotation.NonNull android.content.Context r1, android.view.View r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void f(boolean r2, boolean r3) {
            r1 = this;
            com.kwad.components.ad.reward.widget.tailframe.a r0 = r1.EL
            if (r0 == 0) goto L5
            return
        L5:
            if (r2 == 0) goto L19
            if (r3 == 0) goto L11
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView$d r2 = new com.kwad.components.ad.reward.widget.tailframe.TailFrameView$d
            r2.<init>()
            r1.EL = r2
            return
        L11:
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView$c r2 = new com.kwad.components.ad.reward.widget.tailframe.TailFrameView$c
            r2.<init>()
            r1.EL = r2
            return
        L19:
            if (r3 == 0) goto L23
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView$b r2 = new com.kwad.components.ad.reward.widget.tailframe.TailFrameView$b
            r2.<init>()
            r1.EL = r2
            return
        L23:
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView$a r2 = new com.kwad.components.ad.reward.widget.tailframe.TailFrameView$a
            r2.<init>()
            r1.EL = r2
            return
    }

    public final void a(android.content.Context r2, boolean r3, boolean r4) {
            r1 = this;
            r1.f(r3, r4)
            com.kwad.components.ad.reward.widget.tailframe.a r0 = r1.EL
            r0.B(r2)
            com.kwad.components.ad.reward.widget.tailframe.a r2 = r1.EL
            r2.f(r3, r4)
            com.kwad.components.ad.reward.widget.tailframe.a r2 = r1.EL
            android.view.View r2 = r2.ls()
            r3 = -1
            r1.addView(r2, r3, r3)
            return
    }

    public final void a(com.kwad.components.ad.reward.widget.tailframe.b r4) {
            r3 = this;
            com.kwad.components.ad.reward.widget.tailframe.a r0 = r3.EL
            com.kwad.components.ad.reward.g r1 = r3.tm
            r0.setCallerContext(r1)
            com.kwad.components.ad.reward.widget.tailframe.a r0 = r3.EL
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            org.json.JSONObject r1 = r1.mReportExtData
            r0.a(r2, r1, r4)
            return
    }

    public final void destroy() {
            r1 = this;
            com.kwad.components.ad.reward.widget.tailframe.a r0 = r1.EL
            if (r0 == 0) goto L7
            r0.destroy()
        L7:
            return
    }

    public final void la() {
            r1 = this;
            com.kwad.components.ad.reward.widget.tailframe.a r0 = r1.EL
            r0.la()
            return
    }

    public void setCallerContext(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.tm = r1
            return
    }
}
