package com.kwad.components.ad.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NovelDownloadProgressView extends com.kwad.components.ad.widget.DownloadProgressView {
    public NovelDownloadProgressView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public NovelDownloadProgressView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public NovelDownloadProgressView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.kwad.components.ad.widget.DownloadProgressView
    protected final void nN() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.kwad.sdk.R.layout.ksad_download_progress_novel_layout
            com.kwad.sdk.o.m.inflate(r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.widget.DownloadProgressView
    protected final void nO() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_feed_download_progress_novel
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r2.MC = r0
            return
    }

    @Override // com.kwad.components.ad.widget.DownloadProgressView
    protected final void nP() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_feed_actionbar_before_bg
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r2.MD = r0
            return
    }
}
