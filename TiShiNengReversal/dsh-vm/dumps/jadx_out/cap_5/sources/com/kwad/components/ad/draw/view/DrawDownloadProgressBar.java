package com.kwad.components.ad.draw.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DrawDownloadProgressBar extends android.widget.FrameLayout {
    private com.kwad.components.core.page.widget.TextProgressBar fR;
    private android.view.View fS;
    private android.content.Context mContext;


    public DrawDownloadProgressBar(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.B(r1)
            return
    }

    public DrawDownloadProgressBar(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.B(r1)
            return
    }

    public DrawDownloadProgressBar(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.B(r1)
            return
    }

    private void B(android.content.Context r2) {
            r1 = this;
            r1.mContext = r2
            int r0 = com.kwad.sdk.R.layout.ksad_draw_download_bar
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_download_progress
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.page.widget.TextProgressBar r2 = (com.kwad.components.core.page.widget.TextProgressBar) r2
            r1.fR = r2
            int r2 = com.kwad.sdk.R.id.ksad_download_progress_cover
            android.view.View r2 = r1.findViewById(r2)
            r1.fS = r2
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar$1 r0 = new com.kwad.components.ad.draw.view.DrawDownloadProgressBar$1
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            return
    }

    public final void e(java.lang.String r3, int r4) {
            r2 = this;
            if (r4 == 0) goto L11
            int r0 = r2.getMax()
            if (r4 != r0) goto L9
            goto L11
        L9:
            android.view.View r0 = r2.fS
            r1 = 8
            r0.setVisibility(r1)
            goto L17
        L11:
            android.view.View r0 = r2.fS
            r1 = 0
            r0.setVisibility(r1)
        L17:
            com.kwad.components.core.page.widget.TextProgressBar r0 = r2.fR
            r0.e(r3, r4)
            return
    }

    public int getMax() {
            r1 = this;
            com.kwad.components.core.page.widget.TextProgressBar r0 = r1.fR
            int r0 = r0.getMax()
            return r0
    }

    public void setTextColor(int r2) {
            r1 = this;
            com.kwad.components.core.page.widget.TextProgressBar r0 = r1.fR
            r0.setTextColor(r2)
            return
    }

    public void setTextSize(int r3) {
            r2 = this;
            com.kwad.components.core.page.widget.TextProgressBar r0 = r2.fR
            android.content.Context r1 = r2.getContext()
            float r3 = (float) r3
            int r3 = com.kwad.sdk.c.a.a.a(r1, r3)
            float r3 = (float) r3
            r0.setTextDimen(r3)
            return
    }
}
