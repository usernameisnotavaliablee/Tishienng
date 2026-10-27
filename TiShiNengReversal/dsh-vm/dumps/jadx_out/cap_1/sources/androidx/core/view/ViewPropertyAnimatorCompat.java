package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewPropertyAnimatorCompat {
    private final java.lang.ref.WeakReference<android.view.View> mView;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.ViewPropertyAnimator translationZ(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.translationZ(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.ViewPropertyAnimator translationZBy(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.translationZBy(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.ViewPropertyAnimator z(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.z(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.ViewPropertyAnimator zBy(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.zBy(r1)
                return r0
        }
    }

    ViewPropertyAnimatorCompat(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mView = r0
            return
    }

    public static /* synthetic */ void a(androidx.core.view.ViewPropertyAnimatorUpdateListener r0, android.view.View r1, android.animation.ValueAnimator r2) {
            r0.onAnimationUpdate(r1)
            return
    }

    private void setListenerInternal(android.view.View r3, androidx.core.view.ViewPropertyAnimatorListener r4) {
            r2 = this;
            if (r4 == 0) goto Lf
            android.view.ViewPropertyAnimator r0 = r3.animate()
            androidx.core.view.ViewPropertyAnimatorCompat$1 r1 = new androidx.core.view.ViewPropertyAnimatorCompat$1
            r1.<init>(r2, r4, r3)
            r0.setListener(r1)
            return
        Lf:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 0
            r3.setListener(r4)
            return
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat alpha(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat alphaBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alphaBy(r2)
        L11:
            return r1
    }

    public void cancel() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    public long getDuration() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getDuration()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.animation.Interpolator getInterpolator() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L15
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            return r0
        L15:
            r0 = 0
            return r0
    }

    public long getStartDelay() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getStartDelay()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotation(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotation(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationX(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationXBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationY(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationYBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleX(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleXBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleY(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleYBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setDuration(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setInterpolator(@androidx.annotation.Nullable android.view.animation.Interpolator r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setInterpolator(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setListener(@androidx.annotation.Nullable androidx.core.view.ViewPropertyAnimatorListener r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Ld
            r1.setListenerInternal(r0, r2)
        Ld:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setStartDelay(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setUpdateListener(@androidx.annotation.Nullable androidx.core.view.ViewPropertyAnimatorUpdateListener r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L12
            androidx.core.view.m0 r1 = new androidx.core.view.m0
            r1.<init>(r3, r0)
            goto L13
        L12:
            r1 = 0
        L13:
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r3.setUpdateListener(r1)
        L1a:
            return r2
    }

    public void start() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.start()
        L11:
            return
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationX(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationXBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationYBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationZ(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZ(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationZBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZBy(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat withEndAction(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withEndAction(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"WrongConstant"})
    public androidx.core.view.ViewPropertyAnimatorCompat withLayer() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withLayer()
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat withStartAction(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withStartAction(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat x(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.x(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat xBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.xBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat y(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.y(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat yBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.yBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat z(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.z(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat zBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.zBy(r0, r2)
        L11:
            return r1
    }
}
