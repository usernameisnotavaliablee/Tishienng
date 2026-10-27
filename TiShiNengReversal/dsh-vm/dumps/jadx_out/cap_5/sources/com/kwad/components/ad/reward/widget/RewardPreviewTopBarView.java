package com.kwad.components.ad.reward.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RewardPreviewTopBarView extends com.kwad.sdk.widget.KSFrameLayout implements android.view.View.OnClickListener {
    private java.lang.String Eg;
    private java.lang.String Eh;
    private android.widget.ProgressBar Ei;
    private android.widget.TextView Ej;
    private long Ek;
    private long El;
    private boolean Em;
    private com.kwad.components.ad.reward.widget.RewardPreviewTopBarView.a En;
    private android.widget.ImageView cw;
    private android.widget.TextView vW;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void G(boolean r1);

        void H(boolean r1);
    }

    public RewardPreviewTopBarView(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            java.lang.String r3 = " 秒后即可获得奖励"
            r2.Eg = r3
            java.lang.String r3 = "恭喜你获得奖励"
            r2.Eh = r3
            r0 = -1
            r2.Ek = r0
            r3 = 0
            r2.Em = r3
            return
    }

    public RewardPreviewTopBarView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = " 秒后即可获得奖励"
            r0.Eg = r1
            java.lang.String r1 = "恭喜你获得奖励"
            r0.Eh = r1
            r1 = -1
            r0.Ek = r1
            r1 = 0
            r0.Em = r1
            return
    }

    public RewardPreviewTopBarView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = " 秒后即可获得奖励"
            r0.Eg = r1
            java.lang.String r1 = "恭喜你获得奖励"
            r0.Eh = r1
            r1 = -1
            r0.Ek = r1
            r1 = 0
            r0.Em = r1
            return
    }

    @androidx.annotation.MainThread
    private void e(long r2, long r4) {
            r1 = this;
            android.widget.ProgressBar r0 = r1.Ei
            long r4 = r4 - r2
            int r2 = (int) r4
            r0.setProgress(r2)
            return
    }

    @androidx.annotation.MainThread
    private void e(boolean r2, boolean r3) {
            r1 = this;
            boolean r2 = r1.Em
            r3 = 0
            if (r2 != 0) goto L1b
            android.widget.TextView r2 = r1.vW
            r0 = 8
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.Ej
            java.lang.String r0 = r1.Eh
            r2.setText(r0)
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView$a r2 = r1.En
            if (r2 == 0) goto L20
            r2.H(r3)
            goto L20
        L1b:
            android.widget.TextView r2 = r1.vW
            r2.setVisibility(r3)
        L20:
            r2 = 1
            r1.Em = r2
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void init(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            super.init(r1, r2)
            android.content.Context r1 = r0.getContext()
            int r2 = com.kwad.sdk.R.layout.ksad_activity_preview_topbar
            android.view.View.inflate(r1, r2, r0)
            int r1 = com.kwad.sdk.R.id.ksad_preview_topbar_progress
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.Ei = r1
            int r1 = com.kwad.sdk.R.id.ksad_preview_topbar_reward_tips
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.vW = r1
            int r1 = com.kwad.sdk.R.id.ksad_preview_topbar_reward_count
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Ej = r1
            int r1 = com.kwad.sdk.R.id.ksad_preview_topbar_close
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.cw = r1
            r2 = 8
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r0.cw
            r1.setOnClickListener(r0)
            return
    }

    public final boolean ln() {
            r1 = this;
            boolean r0 = r1.Em
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.cw
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L11
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView$a r2 = r1.En
            if (r2 == 0) goto L11
            boolean r0 = r1.Em
            r2.G(r0)
        L11:
            return
    }

    @androidx.annotation.MainThread
    public final void s(long r6) {
            r5 = this;
            float r0 = (float) r6
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            android.widget.TextView r1 = r5.Ej
            if (r1 == 0) goto L22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = r5.Eg
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
        L22:
            long r1 = r5.Ek
            r5.e(r6, r1)
            long r1 = r5.Ek
            long r1 = r1 - r6
            long r6 = r5.El
            r3 = 0
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 < 0) goto L3e
            android.widget.ImageView r6 = r5.cw
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L3e
            android.widget.ImageView r6 = r5.cw
            r6.setVisibility(r3)
        L3e:
            if (r0 > 0) goto L44
            r6 = 1
            r5.e(r6, r3)
        L44:
            return
    }

    @androidx.annotation.MainThread
    public void setCloseBtnDelayShowDuration(long r4) {
            r3 = this;
            r3.El = r4
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            android.widget.ImageView r4 = r3.cw
            r5 = 0
            r4.setVisibility(r5)
        Le:
            return
    }

    @androidx.annotation.MainThread
    public void setRewardTips(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.vW
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.setText(r2)
        L9:
            return
    }

    public void setTopBarListener(com.kwad.components.ad.reward.widget.RewardPreviewTopBarView.a r1) {
            r0 = this;
            r0.En = r1
            return
    }

    @androidx.annotation.MainThread
    public void setTotalCountDuration(long r2) {
            r1 = this;
            r1.Ek = r2
            android.widget.ProgressBar r0 = r1.Ei
            int r3 = (int) r2
            r0.setMax(r3)
            return
    }
}
