package com.kwad.components.ad.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DownloadProgressView extends android.widget.FrameLayout {
    private int MA;
    protected android.graphics.drawable.Drawable MC;
    protected android.graphics.drawable.Drawable MD;
    private java.lang.String ME;
    protected android.widget.TextView Mw;

    @androidx.annotation.ColorInt
    private int Mx;

    @androidx.annotation.ColorInt
    private int My;

    @androidx.annotation.ColorInt
    private int Mz;
    private final com.kwad.sdk.api.KsAppDownloadListener dW;
    protected com.kwad.components.core.page.widget.TextProgressBar fR;
    protected com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    protected com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;



    public DownloadProgressView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DownloadProgressView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DownloadProgressView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            android.content.Context r0 = com.kwad.sdk.o.m.wrapContextIfNeed(r2)
            r1.<init>(r0, r3, r4)
            com.kwad.components.ad.widget.DownloadProgressView$2 r4 = new com.kwad.components.ad.widget.DownloadProgressView$2
            r4.<init>(r1)
            r1.dW = r4
            r1.initAttrs(r2, r3)
            r1.initView()
            return
    }

    static /* synthetic */ java.lang.String a(com.kwad.components.ad.widget.DownloadProgressView r0) {
            java.lang.String r0 = r0.ME
            return r0
    }

    @android.annotation.SuppressLint({"CustomViewStyleable"})
    private void initAttrs(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4) {
            r2 = this;
            int[] r0 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView_ksad_downloadTextColor
            r0 = -117146(0xfffffffffffe3666, float:NaN)
            int r4 = r3.getColor(r4, r0)
            r2.Mx = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView_ksad_downloadLeftTextColor
            r1 = -1
            int r4 = r3.getColor(r4, r1)
            r2.My = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView_ksad_downloadRightTextColor
            int r4 = r3.getColor(r4, r0)
            r2.Mz = r4
            android.content.Context r4 = r2.getContext()
            r0 = 1093664768(0x41300000, float:11.0)
            int r4 = com.kwad.sdk.c.a.a.a(r4, r0)
            int r0 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView_ksad_downloadTextSize
            int r4 = r3.getDimensionPixelSize(r0, r4)
            r2.MA = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView_ksad_progressDrawable
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.MC = r4
            if (r4 != 0) goto L41
            r2.nO()
        L41:
            int r4 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView_ksad_backgroundDrawable
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.MD = r4
            if (r4 != 0) goto L4e
            r2.nP()
        L4e:
            int r4 = com.kwad.sdk.R.styleable.ksad_DownloadProgressView_ksad_downloadingFormat
            java.lang.String r4 = r3.getString(r4)
            r2.ME = r4
            if (r4 != 0) goto L5c
            java.lang.String r4 = "下载中  %s%%"
            r2.ME = r4
        L5c:
            r3.recycle()
            return
    }

    private void initView() {
            r3 = this;
            r3.nN()
            int r0 = com.kwad.sdk.R.id.ksad_progress_bar
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.page.widget.TextProgressBar r0 = (com.kwad.components.core.page.widget.TextProgressBar) r0
            r3.fR = r0
            int r1 = r3.MA
            float r1 = (float) r1
            r0.setTextDimen(r1)
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.fR
            int r1 = r3.My
            int r2 = r3.Mz
            r0.setTextColor(r1, r2)
            com.kwad.components.core.page.widget.TextProgressBar r0 = r3.fR
            android.graphics.drawable.Drawable r1 = r3.MC
            r0.setProgressDrawable(r1)
            int r0 = com.kwad.sdk.R.id.ksad_normal_text
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.Mw = r0
            int r1 = r3.Mx
            r0.setTextColor(r1)
            android.widget.TextView r0 = r3.Mw
            int r1 = r3.MA
            float r1 = (float) r1
            r2 = 0
            r0.setTextSize(r2, r1)
            android.widget.TextView r0 = r3.Mw
            r0.setVisibility(r2)
            android.widget.TextView r0 = r3.Mw
            android.graphics.drawable.Drawable r1 = r3.MD
            r0.setBackground(r1)
            int r0 = com.kwad.sdk.R.id.ksad_foreground_cover
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.widget.DownloadProgressView$1 r1 = new com.kwad.components.ad.widget.DownloadProgressView$1
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    public final void at(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            r1.mAdTemplate = r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            r1.mAdInfo = r2
            android.widget.TextView r0 = r1.Mw
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r2)
            r0.setText(r2)
            com.kwad.components.core.page.widget.TextProgressBar r2 = r1.fR
            r0 = 8
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.Mw
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    public com.kwad.sdk.api.KsAppDownloadListener getAppDownloadListener() {
            r1 = this;
            com.kwad.sdk.api.KsAppDownloadListener r0 = r1.dW
            return r0
    }

    protected void nN() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.kwad.sdk.R.layout.ksad_download_progress_layout
            com.kwad.sdk.o.m.inflate(r0, r1, r2)
            return
    }

    protected void nO() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_feed_download_progress
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r2.MC = r0
            return
    }

    protected void nP() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_feed_app_download_before_bg
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r2.MD = r0
            return
    }
}
