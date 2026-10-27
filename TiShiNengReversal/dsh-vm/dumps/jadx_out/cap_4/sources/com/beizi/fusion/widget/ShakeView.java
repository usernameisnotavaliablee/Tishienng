package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ShakeView extends android.widget.LinearLayout {
    android.widget.ImageView a;
    android.widget.TextView b;
    private boolean c;
    private java.lang.String d;
    private android.graphics.drawable.AnimationDrawable e;
    private boolean f;

    public ShakeView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.c = r0
            r1.init(r2)
            return
    }

    public ShakeView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.c = r2
            r0.init(r1)
            return
    }

    public ShakeView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.c = r2
            r0.init(r1)
            return
    }

    private void a() {
            r2 = this;
            r2.removeAllViews()
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.a = r0
            int r1 = com.beizi.fusion.R.drawable.anim_shake_download
            r0.setBackgroundResource(r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r1 = 1
            r2.setOrientation(r1)
            android.widget.ImageView r1 = r2.a
            r2.addView(r1, r0)
            android.widget.ImageView r0 = r2.a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r2.e = r0
            return
    }

    public void init(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.c = r0
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r3)
            r2.a = r1
            int r3 = com.beizi.fusion.R.drawable.anim_shake
            r1.setBackgroundResource(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r3.<init>(r1, r1)
            r2.setOrientation(r0)
            android.widget.ImageView r0 = r2.a
            r2.addView(r0, r3)
            android.widget.ImageView r3 = r2.a
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
            r2.e = r3
            return
    }

    public void setDownloadApp(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r0.f = r1
            if (r1 == 0) goto Lb
            r0.a()
        Lb:
            return
    }

    public void setTitleText(java.lang.String r2) {
            r1 = this;
            r1.d = r2
            android.widget.TextView r0 = r1.b
            if (r0 == 0) goto L9
            r0.setText(r2)
        L9:
            return
    }

    public void startShake() {
            r1 = this;
            android.graphics.drawable.AnimationDrawable r0 = r1.e
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    public void stopShake() {
            r1 = this;
            android.graphics.drawable.AnimationDrawable r0 = r1.e
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }

    public void updateTwistRollAnim() {
            r2 = this;
            r2.removeAllViews()
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.a = r0
            int r1 = com.beizi.fusion.R.drawable.beizi_twist_roll
            r0.setBackgroundResource(r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r1 = 1
            r2.setOrientation(r1)
            android.widget.ImageView r1 = r2.a
            r2.addView(r1, r0)
            android.widget.ImageView r0 = r2.a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r2.e = r0
            return
    }
}
