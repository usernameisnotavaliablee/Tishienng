package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class u {



    public u() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static android.widget.FrameLayout a(android.content.Context r6, com.beizi.ad.internal.f.c.a r7) {
            android.widget.FrameLayout r0 = new android.widget.FrameLayout     // Catch: java.lang.Exception -> L76
            r0.<init>(r6)     // Catch: java.lang.Exception -> L76
            r1 = 4
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L76
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L76
            r2 = -2
            r3 = 17
            r1.<init>(r2, r2, r3)     // Catch: java.lang.Exception -> L76
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L76
            if (r7 == 0) goto L75
            int r1 = r7.b()     // Catch: java.lang.Exception -> L76
            int r4 = com.beizi.ad.internal.f.c.a.a     // Catch: java.lang.Exception -> L76
            r5 = 42
            if (r1 != r4) goto L44
            android.widget.ImageView r1 = new android.widget.ImageView     // Catch: java.lang.Exception -> L76
            r1.<init>(r6)     // Catch: java.lang.Exception -> L76
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L76
            r2.<init>(r5, r5, r3)     // Catch: java.lang.Exception -> L76
            r1.setLayoutParams(r2)     // Catch: java.lang.Exception -> L76
            r2 = 0
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> L76
            com.beizi.ad.internal.h.i r6 = com.beizi.ad.internal.h.i.a(r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L76
            com.beizi.ad.internal.h.i$b r6 = r6.a(r7)     // Catch: java.lang.Exception -> L76
            r6.a(r1)     // Catch: java.lang.Exception -> L76
            r0.addView(r1)     // Catch: java.lang.Exception -> L76
            return r0
        L44:
            int r1 = r7.b()     // Catch: java.lang.Exception -> L76
            int r4 = com.beizi.ad.internal.f.c.a.f6802b     // Catch: java.lang.Exception -> L76
            if (r1 != r4) goto L75
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView     // Catch: java.lang.Exception -> L76
            r1.<init>(r6)     // Catch: java.lang.Exception -> L76
            int r4 = com.beizi.fusion.R.color.button_text_selector     // Catch: java.lang.Exception -> L76
            android.content.res.ColorStateList r6 = androidx.core.content.ContextCompat.getColorStateList(r6, r4)     // Catch: java.lang.Exception -> L76
            r1.setTextColor(r6)     // Catch: java.lang.Exception -> L76
            r6 = 2
            r4 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r6, r4)     // Catch: java.lang.Exception -> L76
            r1.setGravity(r3)     // Catch: java.lang.Exception -> L76
            java.lang.String r6 = r7.a()     // Catch: java.lang.Exception -> L76
            r1.setText(r6)     // Catch: java.lang.Exception -> L76
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L76
            r6.<init>(r2, r5, r3)     // Catch: java.lang.Exception -> L76
            r1.setLayoutParams(r6)     // Catch: java.lang.Exception -> L76
            r0.addView(r1)     // Catch: java.lang.Exception -> L76
        L75:
            return r0
        L76:
            r6 = 0
            return r6
    }

    public static android.widget.ImageView a(android.content.Context r8) {
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r8)
            int r1 = com.beizi.fusion.R.drawable.banner_da_close
            r0.setImageResource(r1)
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 18
            int r4 = b(r8, r3)
            int r8 = b(r8, r3)
            r3 = 8388661(0x800035, float:1.1755018E-38)
            r2.<init>(r4, r8, r3)
            android.util.DisplayMetrics r8 = r1.j()
            r3 = 1
            r4 = 1084227584(0x40a00000, float:5.0)
            float r8 = android.util.TypedValue.applyDimension(r3, r4, r8)
            int r8 = (int) r8
            android.util.DisplayMetrics r5 = r1.j()
            r6 = 0
            float r5 = android.util.TypedValue.applyDimension(r3, r6, r5)
            int r5 = (int) r5
            android.util.DisplayMetrics r7 = r1.j()
            float r6 = android.util.TypedValue.applyDimension(r3, r6, r7)
            int r6 = (int) r6
            android.util.DisplayMetrics r1 = r1.j()
            float r1 = android.util.TypedValue.applyDimension(r3, r4, r1)
            int r1 = (int) r1
            r2.setMargins(r8, r5, r6, r1)
            r0.setLayoutParams(r2)
            return r0
    }

    public static androidx.appcompat.widget.AppCompatImageView a(android.content.Context r6, boolean r7) {
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            r0.<init>(r6)
            if (r7 == 0) goto La
            int r6 = com.beizi.fusion.R.drawable.voice_off
            goto Lc
        La:
            int r6 = com.beizi.fusion.R.drawable.voice_on
        Lc:
            r0.setImageResource(r6)
            com.beizi.ad.internal.h r6 = com.beizi.ad.internal.h.a()
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r2 = -2
            r7.<init>(r2, r2, r1)
            r1 = 1084227584(0x40a00000, float:5.0)
            android.util.DisplayMetrics r2 = r6.j()
            r3 = 1
            float r1 = android.util.TypedValue.applyDimension(r3, r1, r2)
            int r1 = (int) r1
            android.util.DisplayMetrics r2 = r6.j()
            r4 = 1097859072(0x41700000, float:15.0)
            float r2 = android.util.TypedValue.applyDimension(r3, r4, r2)
            int r2 = (int) r2
            android.util.DisplayMetrics r5 = r6.j()
            float r5 = android.util.TypedValue.applyDimension(r3, r4, r5)
            int r5 = (int) r5
            android.util.DisplayMetrics r6 = r6.j()
            float r6 = android.util.TypedValue.applyDimension(r3, r4, r6)
            int r6 = (int) r6
            r7.setMargins(r1, r2, r5, r6)
            r0.setLayoutParams(r7)
            return r0
    }

    public static androidx.appcompat.widget.AppCompatTextView a(android.content.Context r6, int r7) {
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r6)
            int r1 = com.beizi.fusion.R.drawable.button_count_down_interstitial_background
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r6, r1)
            r0.setBackgroundDrawable(r1)
            int r1 = com.beizi.fusion.R.color.button_text_selector
            android.content.res.ColorStateList r6 = androidx.core.content.ContextCompat.getColorStateList(r6, r1)
            r0.setTextColor(r6)
            r6 = 2
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r6, r1)
            com.beizi.ad.internal.h r6 = com.beizi.ad.internal.h.a()
            r1 = 17
            r0.setGravity(r1)
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r0.setText(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r1 = 1106247680(0x41f00000, float:30.0)
            android.util.DisplayMetrics r2 = r6.j()
            r3 = 1
            float r1 = android.util.TypedValue.applyDimension(r3, r1, r2)
            int r1 = (int) r1
            r2 = -2
            r4 = 53
            r7.<init>(r1, r2, r4)
            android.util.DisplayMetrics r1 = r6.j()
            r2 = 0
            float r1 = android.util.TypedValue.applyDimension(r3, r2, r1)
            int r1 = (int) r1
            android.util.DisplayMetrics r4 = r6.j()
            float r4 = android.util.TypedValue.applyDimension(r3, r2, r4)
            int r4 = (int) r4
            android.util.DisplayMetrics r5 = r6.j()
            float r5 = android.util.TypedValue.applyDimension(r3, r2, r5)
            int r5 = (int) r5
            android.util.DisplayMetrics r6 = r6.j()
            float r6 = android.util.TypedValue.applyDimension(r3, r2, r6)
            int r6 = (int) r6
            r7.setMargins(r1, r4, r5, r6)
            r0.setLayoutParams(r7)
            com.beizi.ad.internal.h.u$2 r6 = new com.beizi.ad.internal.h.u$2
            r6.<init>()
            r0.setOnClickListener(r6)
            return r0
    }

    public static androidx.appcompat.widget.AppCompatTextView a(android.content.Context r4, int r5, int r6, int r7, int r8) {
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r4)
            int r1 = com.beizi.fusion.R.drawable.button_close_background
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r4, r1)
            r0.setBackgroundDrawable(r1)
            int r1 = com.beizi.fusion.R.color.button_text_selector
            android.content.res.ColorStateList r4 = androidx.core.content.ContextCompat.getColorStateList(r4, r1)
            r0.setTextColor(r4)
            r4 = 2
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r4, r1)
            r4 = 17
            r0.setGravity(r4)
            int r4 = com.beizi.fusion.R.string.beizi_skip_ad
            r0.setText(r4)
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r3 = 8388661(0x800035, float:1.1755018E-38)
            r1.<init>(r2, r2, r3)
            int r5 = r5 + 5
            float r5 = (float) r5
            android.util.DisplayMetrics r2 = r4.j()
            r3 = 1
            float r5 = android.util.TypedValue.applyDimension(r3, r5, r2)
            int r5 = (int) r5
            int r6 = r6 + 10
            float r6 = (float) r6
            android.util.DisplayMetrics r2 = r4.j()
            float r6 = android.util.TypedValue.applyDimension(r3, r6, r2)
            int r6 = (int) r6
            int r7 = r7 + 42
            float r7 = (float) r7
            android.util.DisplayMetrics r2 = r4.j()
            float r7 = android.util.TypedValue.applyDimension(r3, r7, r2)
            int r7 = (int) r7
            int r8 = r8 + 10
            float r8 = (float) r8
            android.util.DisplayMetrics r4 = r4.j()
            float r4 = android.util.TypedValue.applyDimension(r3, r8, r4)
            int r4 = (int) r4
            r1.setMargins(r5, r6, r7, r4)
            r0.setLayoutParams(r1)
            return r0
    }

    public static androidx.appcompat.widget.AppCompatTextView a(android.content.Context r5, int r6, int r7, int r8, int r9, int r10) {
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r5)
            int r1 = com.beizi.fusion.R.drawable.button_count_down_background
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r5, r1)
            r0.setBackgroundDrawable(r1)
            int r1 = com.beizi.fusion.R.color.button_text_selector
            android.content.res.ColorStateList r5 = androidx.core.content.ContextCompat.getColorStateList(r5, r1)
            r0.setTextColor(r5)
            r5 = 2
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r5, r1)
            com.beizi.ad.internal.h r5 = com.beizi.ad.internal.h.a()
            r1 = 17
            r0.setGravity(r1)
            java.lang.String r6 = java.lang.Integer.toString(r6)
            r0.setText(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r1 = 1106247680(0x41f00000, float:30.0)
            android.util.DisplayMetrics r2 = r5.j()
            r3 = 1
            float r1 = android.util.TypedValue.applyDimension(r3, r1, r2)
            int r1 = (int) r1
            r2 = -2
            r4 = 53
            r6.<init>(r1, r2, r4)
            int r7 = r7 + 5
            float r7 = (float) r7
            android.util.DisplayMetrics r1 = r5.j()
            float r7 = android.util.TypedValue.applyDimension(r3, r7, r1)
            int r7 = (int) r7
            int r8 = r8 + 10
            float r8 = (float) r8
            android.util.DisplayMetrics r1 = r5.j()
            float r8 = android.util.TypedValue.applyDimension(r3, r8, r1)
            int r8 = (int) r8
            int r9 = r9 + 5
            float r9 = (float) r9
            android.util.DisplayMetrics r1 = r5.j()
            float r9 = android.util.TypedValue.applyDimension(r3, r9, r1)
            int r9 = (int) r9
            int r10 = r10 + 10
            float r10 = (float) r10
            android.util.DisplayMetrics r5 = r5.j()
            float r5 = android.util.TypedValue.applyDimension(r3, r10, r5)
            int r5 = (int) r5
            r6.setMargins(r7, r8, r9, r5)
            r0.setLayoutParams(r6)
            com.beizi.ad.internal.h.u$1 r5 = new com.beizi.ad.internal.h.u$1
            r5.<init>()
            r0.setOnClickListener(r5)
            return r0
    }

    public static void a(android.app.Activity r3, int[] r4) {
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L1b
            r1 = r4[r0]
            float r1 = (float) r1
            float r1 = r1 / r3
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r4[r0] = r1
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    public static void a(android.view.View r1) {
            if (r1 == 0) goto L11
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L11
            android.view.ViewParent r0 = r1.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r1)
        L11:
            return
    }

    public static int[] a(android.app.Activity r1) {
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getSize(r0)
            int r1 = r0.x
            int r0 = r0.y
            int[] r1 = new int[]{r1, r0}
            return r1
    }

    public static int b(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static int b(android.content.Context r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static android.content.Context b(android.view.View r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L29
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto Lf
            goto L29
        Lf:
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto L22
            android.view.ViewParent r2 = r0.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L22
            android.view.ViewParent r0 = r0.getParent()
            goto Lf
        L22:
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            return r2
        L29:
            android.content.Context r0 = r2.getContext()
            boolean r0 = r0 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L3c
            android.content.Context r2 = r2.getContext()
            android.content.MutableContextWrapper r2 = (android.content.MutableContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            return r2
        L3c:
            android.content.Context r2 = r2.getContext()
            return r2
    }

    public static android.widget.FrameLayout b(android.content.Context r6, com.beizi.ad.internal.f.c.a r7) {
            android.widget.FrameLayout r0 = new android.widget.FrameLayout     // Catch: java.lang.Exception -> L78
            r0.<init>(r6)     // Catch: java.lang.Exception -> L78
            r1 = 4
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L78
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L78
            r2 = -2
            r3 = 17
            r1.<init>(r2, r2, r3)     // Catch: java.lang.Exception -> L78
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L78
            if (r7 == 0) goto L77
            int r1 = r7.b()     // Catch: java.lang.Exception -> L78
            int r4 = com.beizi.ad.internal.f.c.a.a     // Catch: java.lang.Exception -> L78
            r5 = 42
            if (r1 != r4) goto L46
            android.widget.ImageView r1 = new android.widget.ImageView     // Catch: java.lang.Exception -> L78
            r1.<init>(r6)     // Catch: java.lang.Exception -> L78
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L78
            r4 = 85
            r2.<init>(r4, r5, r3)     // Catch: java.lang.Exception -> L78
            r1.setLayoutParams(r2)     // Catch: java.lang.Exception -> L78
            r2 = 0
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> L78
            com.beizi.ad.internal.h.i r6 = com.beizi.ad.internal.h.i.a(r6)     // Catch: java.lang.Exception -> L78
            java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L78
            com.beizi.ad.internal.h.i$b r6 = r6.a(r7)     // Catch: java.lang.Exception -> L78
            r6.a(r1)     // Catch: java.lang.Exception -> L78
            r0.addView(r1)     // Catch: java.lang.Exception -> L78
            return r0
        L46:
            int r1 = r7.b()     // Catch: java.lang.Exception -> L78
            int r4 = com.beizi.ad.internal.f.c.a.f6802b     // Catch: java.lang.Exception -> L78
            if (r1 != r4) goto L77
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView     // Catch: java.lang.Exception -> L78
            r1.<init>(r6)     // Catch: java.lang.Exception -> L78
            int r4 = com.beizi.fusion.R.color.button_text_selector     // Catch: java.lang.Exception -> L78
            android.content.res.ColorStateList r6 = androidx.core.content.ContextCompat.getColorStateList(r6, r4)     // Catch: java.lang.Exception -> L78
            r1.setTextColor(r6)     // Catch: java.lang.Exception -> L78
            r6 = 2
            r4 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r6, r4)     // Catch: java.lang.Exception -> L78
            r1.setGravity(r3)     // Catch: java.lang.Exception -> L78
            java.lang.String r6 = r7.a()     // Catch: java.lang.Exception -> L78
            r1.setText(r6)     // Catch: java.lang.Exception -> L78
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L78
            r6.<init>(r2, r5, r3)     // Catch: java.lang.Exception -> L78
            r1.setLayoutParams(r6)     // Catch: java.lang.Exception -> L78
            r0.addView(r1)     // Catch: java.lang.Exception -> L78
        L77:
            return r0
        L78:
            r6 = 0
            return r6
    }

    public static androidx.appcompat.widget.AppCompatTextView b(android.content.Context r8) {
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r8)
            int r1 = com.beizi.fusion.R.drawable.button_close_background
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r8, r1)
            r0.setBackgroundDrawable(r1)
            int r1 = com.beizi.fusion.R.color.button_text_selector
            android.content.res.ColorStateList r8 = androidx.core.content.ContextCompat.getColorStateList(r8, r1)
            r0.setTextColor(r8)
            r8 = 2
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r8, r1)
            r8 = 17
            r0.setGravity(r8)
            int r8 = com.beizi.fusion.R.string.beizi_skip_ad
            r0.setText(r8)
            com.beizi.ad.internal.h r8 = com.beizi.ad.internal.h.a()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r3 = 8388661(0x800035, float:1.1755018E-38)
            r1.<init>(r2, r2, r3)
            r2 = 1084227584(0x40a00000, float:5.0)
            android.util.DisplayMetrics r3 = r8.j()
            r4 = 1
            float r2 = android.util.TypedValue.applyDimension(r4, r2, r3)
            int r2 = (int) r2
            android.util.DisplayMetrics r3 = r8.j()
            r5 = 1092616192(0x41200000, float:10.0)
            float r3 = android.util.TypedValue.applyDimension(r4, r5, r3)
            int r3 = (int) r3
            r6 = 1109917696(0x42280000, float:42.0)
            android.util.DisplayMetrics r7 = r8.j()
            float r6 = android.util.TypedValue.applyDimension(r4, r6, r7)
            int r6 = (int) r6
            android.util.DisplayMetrics r8 = r8.j()
            float r8 = android.util.TypedValue.applyDimension(r4, r5, r8)
            int r8 = (int) r8
            r1.setMargins(r2, r3, r6, r8)
            r0.setLayoutParams(r1)
            return r0
    }

    public static int[] b(android.app.Activity r1) {
            int[] r0 = a(r1)
            a(r1, r0)
            return r0
    }
}
