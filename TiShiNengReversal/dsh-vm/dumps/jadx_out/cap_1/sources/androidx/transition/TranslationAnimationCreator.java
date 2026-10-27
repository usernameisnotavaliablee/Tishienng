package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class TranslationAnimationCreator {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TransitionPositionListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.view.View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final int mStartX;
        private final int mStartY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final android.view.View mViewInHierarchy;

        TransitionPositionListener(android.view.View r2, android.view.View r3, int r4, int r5, float r6, float r7) {
                r1 = this;
                r1.<init>()
                r1.mMovingView = r2
                r1.mViewInHierarchy = r3
                float r0 = r2.getTranslationX()
                int r0 = java.lang.Math.round(r0)
                int r4 = r4 - r0
                r1.mStartX = r4
                float r2 = r2.getTranslationY()
                int r2 = java.lang.Math.round(r2)
                int r5 = r5 - r2
                r1.mStartY = r5
                r1.mTerminalX = r6
                r1.mTerminalY = r7
                int r2 = androidx.transition.R.id.transition_position
                java.lang.Object r4 = r3.getTag(r2)
                int[] r4 = (int[]) r4
                r1.mTransitionPosition = r4
                if (r4 == 0) goto L31
                r4 = 0
                r3.setTag(r2, r4)
            L31:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r3) {
                r2 = this;
                int[] r3 = r2.mTransitionPosition
                if (r3 != 0) goto L9
                r3 = 2
                int[] r3 = new int[r3]
                r2.mTransitionPosition = r3
            L9:
                int[] r3 = r2.mTransitionPosition
                int r0 = r2.mStartX
                float r0 = (float) r0
                android.view.View r1 = r2.mMovingView
                float r1 = r1.getTranslationX()
                float r0 = r0 + r1
                int r0 = java.lang.Math.round(r0)
                r1 = 0
                r3[r1] = r0
                int[] r3 = r2.mTransitionPosition
                int r0 = r2.mStartY
                float r0 = (float) r0
                android.view.View r1 = r2.mMovingView
                float r1 = r1.getTranslationY()
                float r0 = r0 + r1
                int r0 = java.lang.Math.round(r0)
                r1 = 1
                r3[r1] = r0
                android.view.View r3 = r2.mViewInHierarchy
                int r0 = androidx.transition.R.id.transition_position
                int[] r1 = r2.mTransitionPosition
                r3.setTag(r0, r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationX()
                r1.mPausedX = r2
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationY()
                r1.mPausedY = r2
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalY
                r2.setTranslationY(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedY
                r2.setTranslationY(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@androidx.annotation.NonNull androidx.transition.Transition r3) {
                r2 = this;
                android.view.View r0 = r2.mMovingView
                float r1 = r2.mTerminalX
                r0.setTranslationX(r1)
                android.view.View r0 = r2.mMovingView
                float r1 = r2.mTerminalY
                r0.setTranslationY(r1)
                r3.removeListener(r2)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    private TranslationAnimationCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    static android.animation.Animator createAnimation(@androidx.annotation.NonNull android.view.View r10, @androidx.annotation.NonNull androidx.transition.TransitionValues r11, int r12, int r13, float r14, float r15, float r16, float r17, @androidx.annotation.Nullable android.animation.TimeInterpolator r18, @androidx.annotation.NonNull androidx.transition.Transition r19) {
            float r0 = r10.getTranslationX()
            float r1 = r10.getTranslationY()
            android.view.View r2 = r11.view
            int r3 = androidx.transition.R.id.transition_position
            java.lang.Object r2 = r2.getTag(r3)
            int[] r2 = (int[]) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
            r5 = r2[r4]
            int r5 = r5 - r12
            float r5 = (float) r5
            float r5 = r5 + r0
            r2 = r2[r3]
            int r2 = r2 - r13
            float r2 = (float) r2
            float r2 = r2 + r1
            goto L23
        L21:
            r5 = r14
            r2 = r15
        L23:
            float r6 = r5 - r0
            int r6 = java.lang.Math.round(r6)
            int r12 = r12 + r6
            float r6 = r2 - r1
            int r6 = java.lang.Math.round(r6)
            int r6 = r6 + r13
            r10.setTranslationX(r5)
            r10.setTranslationY(r2)
            int r7 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r7 != 0) goto L41
            int r7 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r7 != 0) goto L41
            r10 = 0
            return r10
        L41:
            android.util.Property r7 = android.view.View.TRANSLATION_X
            r8 = 2
            float[] r9 = new float[r8]
            r9[r4] = r5
            r9[r3] = r16
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r7, r9)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r9 = new float[r8]
            r9[r4] = r2
            r9[r3] = r17
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r7, r9)
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r8]
            r7[r4] = r5
            r7[r3] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r10, r7)
            androidx.transition.TranslationAnimationCreator$TransitionPositionListener r3 = new androidx.transition.TranslationAnimationCreator$TransitionPositionListener
            android.view.View r11 = r11.view
            r13 = r11
            r14 = r12
            r16 = r0
            r17 = r1
            r11 = r3
            r15 = r6
            r12 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r10 = r19
            r10.addListener(r11)
            r2.addListener(r11)
            androidx.transition.AnimatorUtils.addPauseListener(r2, r11)
            r10 = r18
            r2.setInterpolator(r10)
            return r2
    }
}
