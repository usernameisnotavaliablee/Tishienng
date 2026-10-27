package com.yalantis.ucrop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class GestureCropImageView extends com.yalantis.ucrop.view.CropImageView {
    private static final int S = 200;
    private android.view.ScaleGestureDetector K;
    private com.yalantis.ucrop.util.h L;
    private android.view.GestureDetector M;
    private float N;
    private float O;
    private boolean P;
    private boolean Q;
    private int R;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends android.view.GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ com.yalantis.ucrop.view.GestureCropImageView a;

        private b(com.yalantis.ucrop.view.GestureCropImageView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(com.yalantis.ucrop.view.GestureCropImageView r1, com.yalantis.ucrop.view.GestureCropImageView.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(android.view.MotionEvent r7) {
                r6 = this;
                com.yalantis.ucrop.view.GestureCropImageView r0 = r6.a
                float r1 = r0.getDoubleTapTargetScale()
                float r2 = r7.getX()
                float r3 = r7.getY()
                r4 = 200(0xc8, double:9.9E-322)
                r0.A(r1, r2, r3, r4)
                boolean r7 = super.onDoubleTap(r7)
                return r7
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
                r0 = this;
                com.yalantis.ucrop.view.GestureCropImageView r1 = r0.a
                float r2 = -r3
                float r3 = -r4
                r1.k(r2, r3)
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends com.yalantis.ucrop.util.h.b {
        final /* synthetic */ com.yalantis.ucrop.view.GestureCropImageView a;

        private c(com.yalantis.ucrop.view.GestureCropImageView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(com.yalantis.ucrop.view.GestureCropImageView r1, com.yalantis.ucrop.view.GestureCropImageView.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.yalantis.ucrop.util.h.b, com.yalantis.ucrop.util.h.a
        public boolean a(com.yalantis.ucrop.util.h r4) {
                r3 = this;
                com.yalantis.ucrop.view.GestureCropImageView r0 = r3.a
                float r4 = r4.c()
                com.yalantis.ucrop.view.GestureCropImageView r1 = r3.a
                float r1 = com.yalantis.ucrop.view.GestureCropImageView.F(r1)
                com.yalantis.ucrop.view.GestureCropImageView r2 = r3.a
                float r2 = com.yalantis.ucrop.view.GestureCropImageView.G(r2)
                r0.i(r4, r1, r2)
                r4 = 1
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
        final /* synthetic */ com.yalantis.ucrop.view.GestureCropImageView a;

        private d(com.yalantis.ucrop.view.GestureCropImageView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ d(com.yalantis.ucrop.view.GestureCropImageView r1, com.yalantis.ucrop.view.GestureCropImageView.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(android.view.ScaleGestureDetector r4) {
                r3 = this;
                com.yalantis.ucrop.view.GestureCropImageView r0 = r3.a
                float r4 = r4.getScaleFactor()
                com.yalantis.ucrop.view.GestureCropImageView r1 = r3.a
                float r1 = com.yalantis.ucrop.view.GestureCropImageView.F(r1)
                com.yalantis.ucrop.view.GestureCropImageView r2 = r3.a
                float r2 = com.yalantis.ucrop.view.GestureCropImageView.G(r2)
                r0.j(r4, r1, r2)
                r4 = 1
                return r4
        }
    }

    public GestureCropImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.P = r1
            r0.Q = r1
            r1 = 5
            r0.R = r1
            return
    }

    public GestureCropImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GestureCropImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.P = r1
            r0.Q = r1
            r1 = 5
            r0.R = r1
            return
    }

    static /* synthetic */ float F(com.yalantis.ucrop.view.GestureCropImageView r0) {
            float r0 = r0.N
            return r0
    }

    static /* synthetic */ float G(com.yalantis.ucrop.view.GestureCropImageView r0) {
            float r0 = r0.O
            return r0
    }

    private void J() {
            r5 = this;
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r1 = r5.getContext()
            com.yalantis.ucrop.view.GestureCropImageView$b r2 = new com.yalantis.ucrop.view.GestureCropImageView$b
            r3 = 0
            r2.<init>(r5, r3)
            r4 = 1
            r0.<init>(r1, r2, r3, r4)
            r5.M = r0
            android.view.ScaleGestureDetector r0 = new android.view.ScaleGestureDetector
            android.content.Context r1 = r5.getContext()
            com.yalantis.ucrop.view.GestureCropImageView$d r2 = new com.yalantis.ucrop.view.GestureCropImageView$d
            r2.<init>(r5, r3)
            r0.<init>(r1, r2)
            r5.K = r0
            com.yalantis.ucrop.util.h r0 = new com.yalantis.ucrop.util.h
            com.yalantis.ucrop.view.GestureCropImageView$c r1 = new com.yalantis.ucrop.view.GestureCropImageView$c
            r1.<init>(r5, r3)
            r0.<init>(r1)
            r5.L = r0
            return
    }

    public boolean H() {
            r1 = this;
            boolean r0 = r1.P
            return r0
    }

    public boolean I() {
            r1 = this;
            boolean r0 = r1.Q
            return r0
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    protected void g() {
            r0 = this;
            super.g()
            r0.J()
            return
    }

    public int getDoubleTapScaleSteps() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    protected float getDoubleTapTargetScale() {
            r5 = this;
            float r0 = r5.getCurrentScale()
            float r1 = r5.getMaxScale()
            float r2 = r5.getMinScale()
            float r1 = r1 / r2
            double r1 = (double) r1
            int r3 = r5.R
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r3
            double r3 = (double) r4
            double r1 = java.lang.Math.pow(r1, r3)
            float r1 = (float) r1
            float r0 = r0 * r1
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto Lb
            r4.s()
        Lb:
            int r0 = r5.getPointerCount()
            r1 = 1
            if (r0 <= r1) goto L2d
            r0 = 0
            float r2 = r5.getX(r0)
            float r3 = r5.getX(r1)
            float r2 = r2 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r4.N = r2
            float r0 = r5.getY(r0)
            float r2 = r5.getY(r1)
            float r0 = r0 + r2
            float r0 = r0 / r3
            r4.O = r0
        L2d:
            android.view.GestureDetector r0 = r4.M
            r0.onTouchEvent(r5)
            boolean r0 = r4.Q
            if (r0 == 0) goto L3b
            android.view.ScaleGestureDetector r0 = r4.K
            r0.onTouchEvent(r5)
        L3b:
            boolean r0 = r4.P
            if (r0 == 0) goto L44
            com.yalantis.ucrop.util.h r0 = r4.L
            r0.d(r5)
        L44:
            int r5 = r5.getAction()
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 != r1) goto L4f
            r4.y()
        L4f:
            return r1
    }

    public void setDoubleTapScaleSteps(int r1) {
            r0 = this;
            r0.R = r1
            return
    }

    public void setRotateEnabled(boolean r1) {
            r0 = this;
            r0.P = r1
            return
    }

    public void setScaleEnabled(boolean r1) {
            r0 = this;
            r0.Q = r1
            return
    }
}
