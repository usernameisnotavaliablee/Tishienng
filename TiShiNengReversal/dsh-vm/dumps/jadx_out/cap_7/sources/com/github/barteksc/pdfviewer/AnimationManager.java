package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class AnimationManager {
    private android.animation.ValueAnimator animation;
    private boolean flinging;
    private boolean pageFlinging;
    private com.github.barteksc.pdfviewer.PDFView pdfView;
    private android.widget.OverScroller scroller;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class XAnimation extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.github.barteksc.pdfviewer.AnimationManager this$0;

        XAnimation(com.github.barteksc.pdfviewer.AnimationManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.PDFView r2 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r2)
                r2.loadPages()
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                r0 = 0
                com.github.barteksc.pdfviewer.AnimationManager.access$102(r2, r0)
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.AnimationManager.access$200(r2)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.PDFView r2 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r2)
                r2.loadPages()
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                r0 = 0
                com.github.barteksc.pdfviewer.AnimationManager.access$102(r2, r0)
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.AnimationManager.access$200(r2)
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                com.github.barteksc.pdfviewer.AnimationManager r0 = r2.this$0
                com.github.barteksc.pdfviewer.PDFView r0 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r0)
                com.github.barteksc.pdfviewer.AnimationManager r1 = r2.this$0
                com.github.barteksc.pdfviewer.PDFView r1 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r1)
                float r1 = r1.getCurrentYOffset()
                r0.moveTo(r3, r1)
                com.github.barteksc.pdfviewer.AnimationManager r3 = r2.this$0
                com.github.barteksc.pdfviewer.PDFView r3 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r3)
                r3.loadPageByOffset()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class YAnimation extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.github.barteksc.pdfviewer.AnimationManager this$0;

        YAnimation(com.github.barteksc.pdfviewer.AnimationManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.PDFView r2 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r2)
                r2.loadPages()
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                r0 = 0
                com.github.barteksc.pdfviewer.AnimationManager.access$102(r2, r0)
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.AnimationManager.access$200(r2)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.PDFView r2 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r2)
                r2.loadPages()
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                r0 = 0
                com.github.barteksc.pdfviewer.AnimationManager.access$102(r2, r0)
                com.github.barteksc.pdfviewer.AnimationManager r2 = r1.this$0
                com.github.barteksc.pdfviewer.AnimationManager.access$200(r2)
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                com.github.barteksc.pdfviewer.AnimationManager r0 = r2.this$0
                com.github.barteksc.pdfviewer.PDFView r0 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r0)
                com.github.barteksc.pdfviewer.AnimationManager r1 = r2.this$0
                com.github.barteksc.pdfviewer.PDFView r1 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r1)
                float r1 = r1.getCurrentXOffset()
                r0.moveTo(r1, r3)
                com.github.barteksc.pdfviewer.AnimationManager r3 = r2.this$0
                com.github.barteksc.pdfviewer.PDFView r3 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r3)
                r3.loadPageByOffset()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ZoomAnimation implements android.animation.ValueAnimator.AnimatorUpdateListener, android.animation.Animator.AnimatorListener {
        private final float centerX;
        private final float centerY;
        final /* synthetic */ com.github.barteksc.pdfviewer.AnimationManager this$0;

        public ZoomAnimation(com.github.barteksc.pdfviewer.AnimationManager r1, float r2, float r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.centerX = r2
                r0.centerY = r3
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                com.github.barteksc.pdfviewer.AnimationManager r1 = r0.this$0
                com.github.barteksc.pdfviewer.PDFView r1 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r1)
                r1.loadPages()
                com.github.barteksc.pdfviewer.AnimationManager r1 = r0.this$0
                com.github.barteksc.pdfviewer.AnimationManager.access$200(r1)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                com.github.barteksc.pdfviewer.AnimationManager r1 = r0.this$0
                com.github.barteksc.pdfviewer.PDFView r1 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r1)
                r1.loadPages()
                com.github.barteksc.pdfviewer.AnimationManager r1 = r0.this$0
                com.github.barteksc.pdfviewer.PDFView r1 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r1)
                r1.performPageSnap()
                com.github.barteksc.pdfviewer.AnimationManager r1 = r0.this$0
                com.github.barteksc.pdfviewer.AnimationManager.access$200(r1)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r5) {
                r4 = this;
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                com.github.barteksc.pdfviewer.AnimationManager r0 = r4.this$0
                com.github.barteksc.pdfviewer.PDFView r0 = com.github.barteksc.pdfviewer.AnimationManager.access$000(r0)
                android.graphics.PointF r1 = new android.graphics.PointF
                float r2 = r4.centerX
                float r3 = r4.centerY
                r1.<init>(r2, r3)
                r0.zoomCenteredTo(r5, r1)
                return
        }
    }

    public AnimationManager(com.github.barteksc.pdfviewer.PDFView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.flinging = r0
            r1.pageFlinging = r0
            r1.pdfView = r2
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r1.scroller = r0
            return
    }

    static /* synthetic */ com.github.barteksc.pdfviewer.PDFView access$000(com.github.barteksc.pdfviewer.AnimationManager r0) {
            com.github.barteksc.pdfviewer.PDFView r0 = r0.pdfView
            return r0
    }

    static /* synthetic */ boolean access$102(com.github.barteksc.pdfviewer.AnimationManager r0, boolean r1) {
            r0.pageFlinging = r1
            return r1
    }

    static /* synthetic */ void access$200(com.github.barteksc.pdfviewer.AnimationManager r0) {
            r0.hideHandle()
            return
    }

    private void hideHandle() {
            r1 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r0 = r0.getScrollHandle()
            if (r0 == 0) goto L11
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            com.github.barteksc.pdfviewer.scroll.ScrollHandle r0 = r0.getScrollHandle()
            r0.hideDelayed()
        L11:
            return
    }

    void computeFling() {
            r3 = this;
            android.widget.OverScroller r0 = r3.scroller
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L21
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            android.widget.OverScroller r1 = r3.scroller
            int r1 = r1.getCurrX()
            float r1 = (float) r1
            android.widget.OverScroller r2 = r3.scroller
            int r2 = r2.getCurrY()
            float r2 = (float) r2
            r0.moveTo(r1, r2)
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            r0.loadPageByOffset()
            return
        L21:
            boolean r0 = r3.flinging
            if (r0 == 0) goto L35
            r0 = 0
            r3.flinging = r0
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            r0.loadPages()
            r3.hideHandle()
            com.github.barteksc.pdfviewer.PDFView r0 = r3.pdfView
            r0.performPageSnap()
        L35:
            return
    }

    public boolean isFlinging() {
            r1 = this;
            boolean r0 = r1.flinging
            if (r0 != 0) goto Lb
            boolean r0 = r1.pageFlinging
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public void startFlingAnimation(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r10 = this;
            r10.stopAll()
            r0 = 1
            r10.flinging = r0
            android.widget.OverScroller r1 = r10.scroller
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void startPageFlingAnimation(float r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            boolean r0 = r0.isSwipeVertical()
            if (r0 == 0) goto L12
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            float r0 = r0.getCurrentYOffset()
            r1.startYAnimation(r0, r2)
            goto L1b
        L12:
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            float r0 = r0.getCurrentXOffset()
            r1.startXAnimation(r0, r2)
        L1b:
            r2 = 1
            r1.pageFlinging = r2
            return
    }

    public void startXAnimation(float r3, float r4) {
            r2 = this;
            r2.stopAll()
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            r2.animation = r3
            com.github.barteksc.pdfviewer.AnimationManager$XAnimation r3 = new com.github.barteksc.pdfviewer.AnimationManager$XAnimation
            r3.<init>(r2)
            android.animation.ValueAnimator r4 = r2.animation
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
            android.animation.ValueAnimator r4 = r2.animation
            r4.addUpdateListener(r3)
            android.animation.ValueAnimator r4 = r2.animation
            r4.addListener(r3)
            android.animation.ValueAnimator r3 = r2.animation
            r0 = 400(0x190, double:1.976E-321)
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.animation
            r3.start()
            return
    }

    public void startYAnimation(float r3, float r4) {
            r2 = this;
            r2.stopAll()
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            r2.animation = r3
            com.github.barteksc.pdfviewer.AnimationManager$YAnimation r3 = new com.github.barteksc.pdfviewer.AnimationManager$YAnimation
            r3.<init>(r2)
            android.animation.ValueAnimator r4 = r2.animation
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
            android.animation.ValueAnimator r4 = r2.animation
            r4.addUpdateListener(r3)
            android.animation.ValueAnimator r4 = r2.animation
            r4.addListener(r3)
            android.animation.ValueAnimator r3 = r2.animation
            r0 = 400(0x190, double:1.976E-321)
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.animation
            r3.start()
            return
    }

    public void startZoomAnimation(float r3, float r4, float r5, float r6) {
            r2 = this;
            r2.stopAll()
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            r5 = 1
            r0[r5] = r6
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r0)
            r2.animation = r5
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>()
            r5.setInterpolator(r6)
            com.github.barteksc.pdfviewer.AnimationManager$ZoomAnimation r5 = new com.github.barteksc.pdfviewer.AnimationManager$ZoomAnimation
            r5.<init>(r2, r3, r4)
            android.animation.ValueAnimator r3 = r2.animation
            r3.addUpdateListener(r5)
            android.animation.ValueAnimator r3 = r2.animation
            r3.addListener(r5)
            android.animation.ValueAnimator r3 = r2.animation
            r4 = 400(0x190, double:1.976E-321)
            r3.setDuration(r4)
            android.animation.ValueAnimator r3 = r2.animation
            r3.start()
            return
    }

    public void stopAll() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.animation
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.animation = r0
        La:
            r1.stopFling()
            return
    }

    public void stopFling() {
            r2 = this;
            r0 = 0
            r2.flinging = r0
            android.widget.OverScroller r0 = r2.scroller
            r1 = 1
            r0.forceFinished(r1)
            return
    }
}
