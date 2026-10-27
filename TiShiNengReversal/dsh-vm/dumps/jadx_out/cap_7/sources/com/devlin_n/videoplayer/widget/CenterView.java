package com.devlin_n.videoplayer.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class CenterView extends android.widget.LinearLayout {
    private android.widget.ImageView a;
    private android.widget.TextView b;
    private android.widget.ProgressBar c;

    public CenterView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.a()
            return
    }

    private void a() {
            r2 = this;
            r0 = 17
            r2.setGravity(r0)
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.devlin_n.videoplayer.R.layout.layout_center_window
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.devlin_n.videoplayer.R.id.iv_icon
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.a = r1
            int r1 = com.devlin_n.videoplayer.R.id.tv_percent
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.b = r1
            int r1 = com.devlin_n.videoplayer.R.id.pro_percent
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r2.c = r0
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.a
            if (r0 == 0) goto L7
            r0.setImageResource(r2)
        L7:
            return
    }

    public void setProPercent(int r2) {
            r1 = this;
            android.widget.ProgressBar r0 = r1.c
            if (r0 == 0) goto L7
            r0.setProgress(r2)
        L7:
            return
    }

    public void setProVisibility(int r2) {
            r1 = this;
            android.widget.ProgressBar r0 = r1.c
            if (r0 == 0) goto L7
            r0.setVisibility(r2)
        L7:
            return
    }

    public void setTextView(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.b
            if (r0 == 0) goto L7
            r0.setText(r2)
        L7:
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            if (r2 == 0) goto L12
            android.content.Context r2 = r1.getContext()
            int r0 = com.devlin_n.videoplayer.R.anim.anim_alpha_out
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r0)
            r1.startAnimation(r2)
        L12:
            return
    }
}
