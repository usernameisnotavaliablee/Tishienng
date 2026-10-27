package com.bxkj.base.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SportCardView extends android.widget.FrameLayout {
    public SportCardView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SportCardView(@androidx.annotation.NonNull @org.jetbrains.annotations.NotNull android.content.Context r2, @androidx.annotation.Nullable @org.jetbrains.annotations.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SportCardView(@androidx.annotation.NonNull @org.jetbrains.annotations.NotNull android.content.Context r6, @androidx.annotation.Nullable @org.jetbrains.annotations.Nullable android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r6)
            int r0 = com.bxkj.base.R.layout.sport_recorder_card
            r8.inflate(r0, r5)
            int[] r8 = com.bxkj.base.R.styleable.SportCardView
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r8)
            int r7 = com.bxkj.base.R.styleable.SportCardView_cardTitle
            java.lang.String r7 = r6.getString(r7)
            int r8 = com.bxkj.base.R.styleable.SportCardView_count
            java.lang.String r8 = r6.getString(r8)
            int r0 = com.bxkj.base.R.styleable.SportCardView_distance
            java.lang.String r0 = r6.getString(r0)
            int r1 = com.bxkj.base.R.styleable.SportCardView_bgColor
            r2 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            int r1 = r6.getColor(r1, r2)
            r6.recycle()
            int r6 = com.bxkj.base.R.id.card
            android.view.View r6 = r5.findViewById(r6)
            androidx.cardview.widget.CardView r6 = (androidx.cardview.widget.CardView) r6
            int r2 = com.bxkj.base.R.id.tv_title
            android.view.View r2 = r5.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = com.bxkj.base.R.id.tv_count
            android.view.View r3 = r5.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = com.bxkj.base.R.id.tv_distance
            android.view.View r4 = r5.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r6.setCardBackgroundColor(r1)
            r2.setText(r7)
            r3.setText(r8)
            r4.setText(r0)
            return
    }
}
