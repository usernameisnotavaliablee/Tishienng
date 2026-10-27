package com.bxkj.student.run.app.lockscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SwipeBackLayout extends android.widget.FrameLayout {
    private androidx.customview.widget.ViewDragHelper a;
    private android.view.View b;
    private com.bxkj.student.run.app.lockscreen.SwipeBackLayout.c c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends androidx.customview.widget.ViewDragHelper.Callback {
        final /* synthetic */ com.bxkj.student.run.app.lockscreen.SwipeBackLayout a;

        a(com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public int clampViewPositionHorizontal(android.view.View r2, int r3, int r4) {
                r1 = this;
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r0 = r1.a
                android.view.View r0 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.a(r0)
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                r2 = 0
                int r2 = java.lang.Math.max(r3, r2)
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r3 = r1.a
                int r3 = r3.getWidth()
                int r2 = java.lang.Math.min(r2, r3)
                return r2
            L1c:
                int r2 = super.clampViewPositionHorizontal(r2, r3, r4)
                return r2
        }

        public void onViewPositionChanged(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r3 = r0.a
                android.view.View r3 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.a(r3)
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L4c
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                android.view.View r1 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.a(r1)
                int r1 = r1.getLeft()
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r3 = r0.a
                int r3 = r3.getWidth()
                if (r1 != r3) goto L2f
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout$c r1 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.b(r1)
                if (r1 == 0) goto L2f
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout$c r1 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.b(r1)
                r1.onFinish()
            L2f:
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                int r3 = r1.getWidth()
                int r3 = r3 - r2
                float r2 = (float) r3
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r3 = r0.a
                int r3 = r3.getWidth()
                float r3 = (float) r3
                float r2 = r2 / r3
                r3 = 1126170624(0x43200000, float:160.0)
                float r2 = r2 * r3
                int r2 = (int) r2
                r3 = 0
                int r2 = android.graphics.Color.argb(r2, r3, r3, r3)
                r1.setBackgroundColor(r2)
            L4c:
                return
        }

        public void onViewReleased(android.view.View r1, float r2, float r3) {
                r0 = this;
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r2 = r0.a
                android.view.View r2 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.a(r2)
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L4b
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                android.view.View r1 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.a(r1)
                int r1 = r1.getLeft()
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r2 = r0.a
                int r2 = r2.getWidth()
                int r2 = r2 / 3
                if (r1 < r2) goto L36
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                androidx.customview.widget.ViewDragHelper r1 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.c(r1)
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r2 = r0.a
                int r2 = r2.getWidth()
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r3 = r0.a
                int r3 = r3.getTop()
                r1.settleCapturedViewAt(r2, r3)
                goto L46
            L36:
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                androidx.customview.widget.ViewDragHelper r1 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.c(r1)
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r2 = r0.a
                int r2 = r2.getTop()
                r3 = 0
                r1.settleCapturedViewAt(r3, r2)
            L46:
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r1 = r0.a
                r1.invalidate()
            L4b:
                return
        }

        public boolean tryCaptureView(android.view.View r1, int r2) {
                r0 = this;
                com.bxkj.student.run.app.lockscreen.SwipeBackLayout r2 = r0.a
                android.view.View r2 = com.bxkj.student.run.app.lockscreen.SwipeBackLayout.a(r2)
                boolean r1 = r2.equals(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.bxkj.student.run.app.lockscreen.SwipeBackLayout.c {
        private android.app.Activity a;

        public b(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bxkj.student.run.app.lockscreen.SwipeBackLayout.c
        public void onFinish() {
                r2 = this;
                android.app.Activity r0 = r2.a
                r0.finish()
                android.app.Activity r0 = r2.a
                r1 = 0
                r0.overridePendingTransition(r1, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void onFinish();
    }

    public SwipeBackLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.d()
            return
    }

    public SwipeBackLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.d()
            return
    }

    public SwipeBackLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.d()
            return
    }

    @android.annotation.TargetApi(21)
    public SwipeBackLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.d()
            return
    }

    static /* bridge */ /* synthetic */ android.view.View a(com.bxkj.student.run.app.lockscreen.SwipeBackLayout r0) {
            android.view.View r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.lockscreen.SwipeBackLayout.c b(com.bxkj.student.run.app.lockscreen.SwipeBackLayout r0) {
            com.bxkj.student.run.app.lockscreen.SwipeBackLayout$c r0 = r0.c
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.customview.widget.ViewDragHelper c(com.bxkj.student.run.app.lockscreen.SwipeBackLayout r0) {
            androidx.customview.widget.ViewDragHelper r0 = r0.a
            return r0
    }

    private void d() {
            r2 = this;
            com.bxkj.student.run.app.lockscreen.SwipeBackLayout$a r0 = new com.bxkj.student.run.app.lockscreen.SwipeBackLayout$a
            r0.<init>(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            androidx.customview.widget.ViewDragHelper r0 = androidx.customview.widget.ViewDragHelper.create(r2, r1, r0)
            r2.a = r0
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r2 = this;
            super.computeScroll()
            androidx.customview.widget.ViewDragHelper r0 = r2.a
            r1 = 1
            boolean r0 = r0.continueSettling(r1)
            if (r0 == 0) goto Lf
            r2.invalidate()
        Lf:
            return
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            int r0 = r2.getChildCount()
            r1 = 1
            if (r0 != r1) goto L20
            r0 = 0
            android.view.View r0 = r2.getChildAt(r0)
            r2.b = r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L1f
            android.view.View r0 = r2.b
            r1 = -1118482(0xffffffffffeeeeee, float:NaN)
            r0.setBackgroundColor(r1)
        L1f:
            return
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SwipeBackLayout must have only one child."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.customview.widget.ViewDragHelper r0 = r1.a
            boolean r2 = r0.shouldInterceptTouchEvent(r2)
            return r2
    }

    @Override // android.view.View
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r2) {
            r1 = this;
            androidx.customview.widget.ViewDragHelper r0 = r1.a     // Catch: java.lang.Exception -> L5
            r0.processTouchEvent(r2)     // Catch: java.lang.Exception -> L5
        L5:
            r2 = 1
            return r2
    }

    public void setSwipeBackListener(com.bxkj.student.run.app.lockscreen.SwipeBackLayout.c r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
