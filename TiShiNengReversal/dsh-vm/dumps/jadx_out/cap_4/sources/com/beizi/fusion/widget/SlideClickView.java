package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SlideClickView extends android.widget.LinearLayout {
    private boolean a;
    private android.widget.ImageView b;
    private android.widget.TextView c;
    private java.lang.String d;
    private int e;
    private int f;
    private int g;
    private android.graphics.drawable.AnimationDrawable h;

    public SlideClickView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.a = r0
            r0 = 45
            r1.f = r0
            r1.g = r0
            r1.init(r2)
            return
    }

    public SlideClickView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.a = r2
            r2 = 45
            r0.f = r2
            r0.g = r2
            r0.init(r1)
            return
    }

    public SlideClickView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.a = r2
            r2 = 45
            r0.f = r2
            r0.g = r2
            r0.init(r1)
            return
    }

    private void a() {
            r4 = this;
            android.graphics.drawable.AnimationDrawable r0 = new android.graphics.drawable.AnimationDrawable
            r0.<init>()
            r4.h = r0
            android.content.res.Resources r1 = r4.getResources()
            int r2 = com.beizi.fusion.R.drawable.slide_down_one
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r2 = 600(0x258, float:8.41E-43)
            r0.addFrame(r1, r2)
            android.graphics.drawable.AnimationDrawable r0 = r4.h
            android.content.res.Resources r1 = r4.getResources()
            int r3 = com.beizi.fusion.R.drawable.slide_down_two
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r0.addFrame(r1, r2)
            android.graphics.drawable.AnimationDrawable r0 = r4.h
            android.content.res.Resources r1 = r4.getResources()
            int r3 = com.beizi.fusion.R.drawable.slide_down_three
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r0.addFrame(r1, r2)
            android.graphics.drawable.AnimationDrawable r0 = r4.h
            r1 = 0
            r0.setOneShot(r1)
            android.widget.ImageView r0 = r4.b
            if (r0 == 0) goto L43
            android.graphics.drawable.AnimationDrawable r1 = r4.h
            r0.setImageDrawable(r1)
        L43:
            return
    }

    public void init(android.content.Context r5) {
            r4 = this;
            boolean r0 = r4.a
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.a = r0
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r5)
            r4.c = r1
            r2 = 17
            r1.setGravity(r2)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r5)
            r4.b = r1
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r5.<init>(r1, r1)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r1, r1)
            r4.setOrientation(r0)
            r4.setGravity(r2)
            android.widget.TextView r0 = r4.c
            r4.addView(r0, r5)
            android.widget.ImageView r5 = r4.b
            r4.addView(r5, r3)
            r4.a()
            return
    }

    public void setImageWidthAndHeight(int r2, int r3) {
            r1 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r3)
            android.widget.ImageView r2 = r1.b
            if (r2 == 0) goto Lc
            r2.setLayoutParams(r0)
        Lc:
            return
    }

    public void setTitleFont(int r3) {
            r2 = this;
            r2.e = r3
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r2.c
            if (r0 == 0) goto Ld
            r1 = 2
            float r3 = (float) r3
            r0.setTextSize(r1, r3)
        Ld:
            return
    }

    public void setTitleText(java.lang.String r4) {
            r3 = this;
            r3.d = r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L31
            android.widget.TextView r0 = r3.c
            if (r0 == 0) goto L31
            r0.setText(r4)
            android.widget.TextView r4 = r3.c
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1 = 1
            r4.setTypeface(r0, r1)
            android.widget.TextView r4 = r3.c
            java.lang.String r0 = "#FFFFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setTextColor(r0)
            android.widget.TextView r4 = r3.c
            java.lang.String r0 = "#80000000"
            int r0 = android.graphics.Color.parseColor(r0)
            r1 = 1084227584(0x40a00000, float:5.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.setShadowLayer(r1, r2, r2, r0)
        L31:
            return
    }

    public void startAnim() {
            r1 = this;
            android.graphics.drawable.AnimationDrawable r0 = r1.h
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    public void stopAnim() {
            r1 = this;
            android.graphics.drawable.AnimationDrawable r0 = r1.h
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }
}
