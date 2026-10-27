package com.google.android.material.motion;

import android.view.View;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class MaterialBackAnimationHelper<V extends android.view.View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final java.lang.String TAG = "MaterialBackHelper";

    @androidx.annotation.Nullable
    private androidx.activity.BackEventCompat backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @androidx.annotation.NonNull
    private final android.animation.TimeInterpolator progressInterpolator;

    @androidx.annotation.NonNull
    protected final V view;

    public MaterialBackAnimationHelper(@androidx.annotation.NonNull V r4) {
            r3 = this;
            r3.<init>()
            r3.view = r4
            android.content.Context r4 = r4.getContext()
            int r0 = com.google.android.material.R.attr.motionEasingStandardDecelerateInterpolator
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r1 = androidx.core.view.animation.PathInterpolatorCompat.create(r1, r1, r1, r2)
            android.animation.TimeInterpolator r0 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r4, r0, r1)
            r3.progressInterpolator = r0
            int r0 = com.google.android.material.R.attr.motionDurationMedium2
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r4, r0, r1)
            r3.hideDurationMax = r0
            int r0 = com.google.android.material.R.attr.motionDurationShort3
            r1 = 150(0x96, float:2.1E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r4, r0, r1)
            r3.hideDurationMin = r0
            int r0 = com.google.android.material.R.attr.motionDurationShort2
            r1 = 100
            int r4 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r4, r0, r1)
            r3.cancelDuration = r4
            return
    }

    protected float interpolateProgress(float r2) {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.progressInterpolator
            float r2 = r0.getInterpolation(r2)
            return r2
    }

    @androidx.annotation.Nullable
    protected androidx.activity.BackEventCompat onCancelBackProgress() {
            r2 = this;
            androidx.activity.BackEventCompat r0 = r2.backEvent
            r1 = 0
            r2.backEvent = r1
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.activity.BackEventCompat onHandleBackInvoked() {
            r2 = this;
            androidx.activity.BackEventCompat r0 = r2.backEvent
            r1 = 0
            r2.backEvent = r1
            return r0
    }

    protected void onStartBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r1) {
            r0 = this;
            r0.backEvent = r1
            return
    }

    @androidx.annotation.Nullable
    protected androidx.activity.BackEventCompat onUpdateBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            androidx.activity.BackEventCompat r0 = r1.backEvent
            r1.backEvent = r2
            return r0
    }
}
