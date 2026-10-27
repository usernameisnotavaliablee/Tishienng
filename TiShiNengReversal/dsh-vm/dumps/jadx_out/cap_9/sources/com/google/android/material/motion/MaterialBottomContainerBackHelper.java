package com.google.android.material.motion;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialBottomContainerBackHelper extends com.google.android.material.motion.MaterialBackAnimationHelper<android.view.View> {
    private final float maxScaleXDistance;
    private final float maxScaleYDistance;


    public MaterialBottomContainerBackHelper(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r1.<init>(r2)
            android.content.res.Resources r2 = r2.getResources()
            int r0 = com.google.android.material.R.dimen.m3_back_progress_bottom_container_max_scale_x_distance
            float r0 = r2.getDimension(r0)
            r1.maxScaleXDistance = r0
            int r0 = com.google.android.material.R.dimen.m3_back_progress_bottom_container_max_scale_y_distance
            float r2 = r2.getDimension(r0)
            r1.maxScaleYDistance = r2
            return
    }

    private android.animation.Animator createResetScaleAnimator() {
            r9 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            V extends android.view.View r1 = r9.view
            android.util.Property r2 = android.view.View.SCALE_X
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r4[r5] = r6
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            V extends android.view.View r2 = r9.view
            android.util.Property r4 = android.view.View.SCALE_Y
            float[] r7 = new float[r3]
            r7[r5] = r6
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r7)
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r5] = r1
            r4[r3] = r2
            r0.playTogether(r4)
            V extends android.view.View r1 = r9.view
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L52
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 0
        L34:
            int r4 = r1.getChildCount()
            if (r2 >= r4) goto L52
            android.view.View r4 = r1.getChildAt(r2)
            android.util.Property r7 = android.view.View.SCALE_Y
            float[] r8 = new float[r3]
            r8[r5] = r6
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r7, r8)
            android.animation.Animator[] r7 = new android.animation.Animator[r3]
            r7[r5] = r4
            r0.playTogether(r7)
            int r2 = r2 + 1
            goto L34
        L52:
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r1 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            return r0
    }

    public void cancelBackProgress() {
            r3 = this;
            androidx.activity.BackEventCompat r0 = super.onCancelBackProgress()
            if (r0 != 0) goto L7
            return
        L7:
            android.animation.Animator r0 = r3.createResetScaleAnimator()
            int r1 = r3.cancelDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            r0.start()
            return
    }

    public void finishBackProgressNotPersistent(@androidx.annotation.NonNull androidx.activity.BackEventCompat r6, @androidx.annotation.Nullable android.animation.Animator.AnimatorListener r7) {
            r5 = this;
            V extends android.view.View r0 = r5.view
            int r0 = r0.getHeight()
            float r0 = (float) r0
            V extends android.view.View r1 = r5.view
            float r1 = r1.getScaleY()
            float r0 = r0 * r1
            V extends android.view.View r1 = r5.view
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            r3 = 1
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r1 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            int r1 = r5.hideDurationMax
            int r2 = r5.hideDurationMin
            float r6 = r6.getProgress()
            int r6 = com.google.android.material.animation.AnimationUtils.lerp(r1, r2, r6)
            long r1 = (long) r6
            r0.setDuration(r1)
            com.google.android.material.motion.MaterialBottomContainerBackHelper$1 r6 = new com.google.android.material.motion.MaterialBottomContainerBackHelper$1
            r6.<init>(r5)
            r0.addListener(r6)
            if (r7 == 0) goto L42
            r0.addListener(r7)
        L42:
            r0.start()
            return
    }

    public void finishBackProgressPersistent(@androidx.annotation.NonNull androidx.activity.BackEventCompat r4, @androidx.annotation.Nullable android.animation.Animator.AnimatorListener r5) {
            r3 = this;
            android.animation.Animator r0 = r3.createResetScaleAnimator()
            int r1 = r3.hideDurationMax
            int r2 = r3.hideDurationMin
            float r4 = r4.getProgress()
            int r4 = com.google.android.material.animation.AnimationUtils.lerp(r1, r2, r4)
            long r1 = (long) r4
            r0.setDuration(r1)
            if (r5 == 0) goto L19
            r0.addListener(r5)
        L19:
            r0.start()
            return
    }

    public void startBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r1) {
            r0 = this;
            super.onStartBackProgress(r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    public void updateBackProgress(float r8) {
            r7 = this;
            float r8 = r7.interpolateProgress(r8)
            V extends android.view.View r0 = r7.view
            int r0 = r0.getWidth()
            float r0 = (float) r0
            V extends android.view.View r1 = r7.view
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6a
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L1c
            goto L6a
        L1c:
            float r3 = r7.maxScaleXDistance
            float r3 = r3 / r0
            float r0 = r7.maxScaleYDistance
            float r0 = r0 / r1
            float r3 = com.google.android.material.animation.AnimationUtils.lerp(r2, r3, r8)
            float r8 = com.google.android.material.animation.AnimationUtils.lerp(r2, r0, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0 - r3
            float r8 = r0 - r8
            V extends android.view.View r4 = r7.view
            r4.setScaleX(r3)
            V extends android.view.View r4 = r7.view
            r4.setPivotY(r1)
            V extends android.view.View r1 = r7.view
            r1.setScaleY(r8)
            V extends android.view.View r1 = r7.view
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L6a
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4 = 0
        L48:
            int r5 = r1.getChildCount()
            if (r4 >= r5) goto L6a
            android.view.View r5 = r1.getChildAt(r4)
            int r6 = r5.getTop()
            int r6 = -r6
            float r6 = (float) r6
            r5.setPivotY(r6)
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 == 0) goto L62
            float r6 = r3 / r8
            goto L64
        L62:
            r6 = 1065353216(0x3f800000, float:1.0)
        L64:
            r5.setScaleY(r6)
            int r4 = r4 + 1
            goto L48
        L6a:
            return
    }

    public void updateBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            androidx.activity.BackEventCompat r0 = super.onUpdateBackProgress(r2)
            if (r0 != 0) goto L7
            return
        L7:
            float r2 = r2.getProgress()
            r1.updateBackProgress(r2)
            return
    }
}
