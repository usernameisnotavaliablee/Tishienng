package com.kwad.components.ad.draw.presenter.livecard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsLiveEndAuthorView extends com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView {
    private boolean eB;


    public KsLiveEndAuthorView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public KsLiveEndAuthorView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public KsLiveEndAuthorView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public KsLiveEndAuthorView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView
    public final void A(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_draw_author_end_icon
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_author_icon_frame
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.ej = r2
            int r2 = com.kwad.sdk.R.id.ksad_author_icon
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.widget.KSCornerImageView r2 = (com.kwad.components.core.widget.KSCornerImageView) r2
            r1.el = r2
            int r2 = com.kwad.sdk.R.id.ksad_author_icon_outer
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.widget.KSCornerImageView r2 = (com.kwad.components.core.widget.KSCornerImageView) r2
            r1.ek = r2
            int r2 = com.kwad.sdk.R.id.ksad_author_animator
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.widget.KSCornerImageView r2 = (com.kwad.components.core.widget.KSCornerImageView) r2
            r1.em = r2
            int r2 = com.kwad.sdk.R.id.ksad_author_animator2
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.widget.KSCornerImageView r2 = (com.kwad.components.core.widget.KSCornerImageView) r2
            r1.en = r2
            int r2 = com.kwad.sdk.R.id.ksad_author_icon_layout
            android.view.View r2 = r1.findViewById(r2)
            r1.et = r2
            return
    }

    @Override // com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView, com.kwad.sdk.utils.ca.a
    public final void a(android.os.Message r7) {
            r6 = this;
            int r7 = r7.what
            r0 = 1
            if (r7 == r0) goto L6
            goto L28
        L6:
            java.lang.String r7 = "KsLiveEndAuthorView"
            java.lang.String r1 = "handleMsg MSG_CHECKING"
            com.kwad.sdk.core.d.c.d(r7, r1)
            com.kwad.components.core.widget.KSCornerImageView r7 = r6.em
            r1 = 900(0x384, double:4.447E-321)
            android.animation.Animator r7 = r6.a(r7, r1)
            com.kwad.components.core.widget.KSCornerImageView r1 = r6.en
            r2 = 1000(0x3e8, double:4.94E-321)
            android.animation.Animator r1 = r6.a(r1, r2)
            com.kwad.components.core.widget.KSCornerImageView r2 = r6.el
            r3 = 0
            android.animation.Animator r2 = com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView.a(r2, r3)
            boolean r4 = r6.eB
            if (r4 == 0) goto L29
        L28:
            return
        L29:
            if (r7 == 0) goto L4f
            if (r1 == 0) goto L4f
            if (r2 == 0) goto L4f
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r5 = 3
            android.animation.Animator[] r5 = new android.animation.Animator[r5]
            r5[r3] = r2
            r5[r0] = r7
            r3 = 2
            r5[r3] = r1
            r4.playTogether(r5)
            r4.start()
            r6.eB = r0
            com.kwad.components.ad.draw.presenter.livecard.KsLiveEndAuthorView$1 r0 = new com.kwad.components.ad.draw.presenter.livecard.KsLiveEndAuthorView$1
            r0.<init>(r6, r7, r1, r2)
            r2.addListener(r0)
            return
        L4f:
            com.kwad.sdk.utils.ca r7 = r6.bQ
            r1 = 500(0x1f4, double:2.47E-321)
            r7.sendEmptyMessageDelayed(r0, r1)
            return
    }

    @Override // com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView
    public float getWaveEndSize() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_draw_author_end_icon_width
            float r0 = r0.getDimension(r1)
            return r0
    }

    @Override // com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView
    public final void j(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.co(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L13
            com.kwad.components.core.widget.KSCornerImageView r1 = r3.el
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r4)
        L13:
            com.kwad.sdk.utils.ca r4 = r3.bQ
            r0 = 1
            r1 = 500(0x1f4, double:2.47E-321)
            r4.sendEmptyMessageAtTime(r0, r1)
            return
    }
}
