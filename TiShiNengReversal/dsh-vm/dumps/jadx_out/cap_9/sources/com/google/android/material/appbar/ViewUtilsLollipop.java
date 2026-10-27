package com.google.android.material.appbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ViewUtilsLollipop {
    private static final int[] STATE_LIST_ANIM_ATTRS = null;

    static {
            r0 = 16843848(0x1010448, float:2.369663E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.appbar.ViewUtilsLollipop.STATE_LIST_ANIM_ATTRS = r0
            return
    }

    ViewUtilsLollipop() {
            r0 = this;
            r0.<init>()
            return
    }

    static void setBoundsViewOutlineProvider(@androidx.annotation.NonNull android.view.View r1) {
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r1.setOutlineProvider(r0)
            return
    }

    static void setDefaultAppBarLayoutStateListAnimator(@androidx.annotation.NonNull android.view.View r11, float r12) {
            android.content.res.Resources r0 = r11.getResources()
            int r1 = com.google.android.material.R.integer.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            android.animation.StateListAnimator r1 = new android.animation.StateListAnimator
            r1.<init>()
            int r2 = com.google.android.material.R.attr.state_liftable
            int r3 = com.google.android.material.R.attr.state_lifted
            int r3 = -r3
            r4 = 16842910(0x101009e, float:2.3694E-38)
            int[] r2 = new int[]{r4, r2, r3}
            r3 = 1
            float[] r5 = new float[r3]
            r6 = 0
            r7 = 0
            r5[r6] = r7
            java.lang.String r8 = "elevation"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r11, r8, r5)
            long r9 = (long) r0
            android.animation.ObjectAnimator r0 = r5.setDuration(r9)
            r1.addState(r2, r0)
            int[] r0 = new int[]{r4}
            float[] r2 = new float[r3]
            r2[r6] = r12
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r11, r8, r2)
            android.animation.ObjectAnimator r12 = r12.setDuration(r9)
            r1.addState(r0, r12)
            int[] r12 = new int[r6]
            float[] r0 = new float[r3]
            r0[r6] = r7
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r11, r8, r0)
            r2 = 0
            android.animation.ObjectAnimator r0 = r0.setDuration(r2)
            r1.addState(r12, r0)
            r11.setStateListAnimator(r1)
            return
    }

    static void setStateListAnimatorFromAttrs(@androidx.annotation.NonNull android.view.View r7, android.util.AttributeSet r8, int r9, int r10) {
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.appbar.ViewUtilsLollipop.STATE_LIST_ANIM_ATTRS
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            boolean r9 = r8.hasValue(r6)     // Catch: java.lang.Throwable -> L22
            if (r9 == 0) goto L25
            int r9 = r8.getResourceId(r6, r6)     // Catch: java.lang.Throwable -> L22
            android.animation.StateListAnimator r9 = android.animation.AnimatorInflater.loadStateListAnimator(r0, r9)     // Catch: java.lang.Throwable -> L22
            r7.setStateListAnimator(r9)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            r7 = r0
            goto L29
        L25:
            r8.recycle()
            return
        L29:
            r8.recycle()
            throw r7
    }
}
