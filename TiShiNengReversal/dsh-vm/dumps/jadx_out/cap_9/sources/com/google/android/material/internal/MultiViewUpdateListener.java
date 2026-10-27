package com.google.android.material.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MultiViewUpdateListener implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final com.google.android.material.internal.MultiViewUpdateListener.Listener listener;
    private final android.view.View[] views;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Listener {
        void onAnimationUpdate(@androidx.annotation.NonNull android.animation.ValueAnimator r1, @androidx.annotation.NonNull android.view.View r2);
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@androidx.annotation.NonNull com.google.android.material.internal.MultiViewUpdateListener.Listener r1, @androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r1 = 0
            android.view.View[] r1 = new android.view.View[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            android.view.View[] r1 = (android.view.View[]) r1
            r0.views = r1
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@androidx.annotation.NonNull com.google.android.material.internal.MultiViewUpdateListener.Listener r1, @androidx.annotation.NonNull android.view.View... r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r0.views = r2
            return
    }

    public static /* synthetic */ void a(android.animation.ValueAnimator r0, android.view.View r1) {
            setScale(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.e r1 = new com.google.android.material.internal.e
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.e r1 = new com.google.android.material.internal.e
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ void b(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationY(r0, r1)
            return
    }

    public static /* synthetic */ void c(android.animation.ValueAnimator r0, android.view.View r1) {
            setAlpha(r0, r1)
            return
    }

    public static /* synthetic */ void d(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationX(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.c r1 = new com.google.android.material.internal.c
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.c r1 = new com.google.android.material.internal.c
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    private static void setAlpha(@androidx.annotation.NonNull android.animation.ValueAnimator r0, @androidx.annotation.NonNull android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlpha(r0)
            return
    }

    private static void setScale(@androidx.annotation.NonNull android.animation.ValueAnimator r1, @androidx.annotation.NonNull android.view.View r2) {
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r0 = r1.floatValue()
            r2.setScaleX(r0)
            float r1 = r1.floatValue()
            r2.setScaleY(r1)
            return
    }

    private static void setTranslationX(@androidx.annotation.NonNull android.animation.ValueAnimator r0, @androidx.annotation.NonNull android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationX(r0)
            return
    }

    private static void setTranslationY(@androidx.annotation.NonNull android.animation.ValueAnimator r0, @androidx.annotation.NonNull android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationY(r0)
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.b r1 = new com.google.android.material.internal.b
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.b r1 = new com.google.android.material.internal.b
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.d r1 = new com.google.android.material.internal.d
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(@androidx.annotation.NonNull android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.d r1 = new com.google.android.material.internal.d
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@androidx.annotation.NonNull android.animation.ValueAnimator r6) {
            r5 = this;
            android.view.View[] r0 = r5.views
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            com.google.android.material.internal.MultiViewUpdateListener$Listener r4 = r5.listener
            r4.onAnimationUpdate(r6, r3)
            int r2 = r2 + 1
            goto L4
        L10:
            return
    }
}
