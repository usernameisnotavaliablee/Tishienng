package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ChangeBounds extends androidx.transition.Transition {
    private static final android.util.Property<android.view.View, android.graphics.PointF> BOTTOM_RIGHT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> BOTTOM_RIGHT_PROPERTY = null;
    private static final android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> DRAWABLE_ORIGIN_PROPERTY = null;
    private static final android.util.Property<android.view.View, android.graphics.PointF> POSITION_PROPERTY = null;
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final java.lang.String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final java.lang.String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final java.lang.String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final java.lang.String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final android.util.Property<android.view.View, android.graphics.PointF> TOP_LEFT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> TOP_LEFT_PROPERTY = null;
    private static androidx.transition.RectEvaluator sRectEvaluator;
    private static final java.lang.String[] sTransitionProperties = null;
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation;











    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private android.view.View mView;

        ViewBounds(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                return
        }

        private void setLeftTopRightBottom() {
                r5 = this;
                android.view.View r0 = r5.mView
                int r1 = r5.mLeft
                int r2 = r5.mTop
                int r3 = r5.mRight
                int r4 = r5.mBottom
                androidx.transition.ViewUtils.setLeftTopRightBottom(r0, r1, r2, r3, r4)
                r0 = 0
                r5.mTopLeftCalls = r0
                r5.mBottomRightCalls = r0
                return
        }

        void setBottomRight(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mRight = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mBottom = r2
                int r2 = r1.mBottomRightCalls
                int r2 = r2 + 1
                r1.mBottomRightCalls = r2
                int r0 = r1.mTopLeftCalls
                if (r0 != r2) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }

        void setTopLeft(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mLeft = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mTop = r2
                int r2 = r1.mTopLeftCalls
                int r2 = r2 + 1
                r1.mTopLeftCalls = r2
                int r0 = r1.mBottomRightCalls
                if (r2 != r0) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }
    }

    static {
            java.lang.String r0 = "android:changeBounds:windowX"
            java.lang.String r1 = "android:changeBounds:windowY"
            java.lang.String r2 = "android:changeBounds:bounds"
            java.lang.String r3 = "android:changeBounds:clip"
            java.lang.String r4 = "android:changeBounds:parent"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            androidx.transition.ChangeBounds.sTransitionProperties = r0
            androidx.transition.ChangeBounds$1 r0 = new androidx.transition.ChangeBounds$1
            java.lang.String r1 = "boundsOrigin"
            java.lang.Class<android.graphics.PointF> r2 = android.graphics.PointF.class
            r0.<init>(r2, r1)
            androidx.transition.ChangeBounds.DRAWABLE_ORIGIN_PROPERTY = r0
            androidx.transition.ChangeBounds$2 r0 = new androidx.transition.ChangeBounds$2
            java.lang.String r1 = "topLeft"
            r0.<init>(r2, r1)
            androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY = r0
            androidx.transition.ChangeBounds$3 r0 = new androidx.transition.ChangeBounds$3
            java.lang.String r3 = "bottomRight"
            r0.<init>(r2, r3)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY = r0
            androidx.transition.ChangeBounds$4 r0 = new androidx.transition.ChangeBounds$4
            r0.<init>(r2, r3)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$5 r0 = new androidx.transition.ChangeBounds$5
            r0.<init>(r2, r1)
            androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$6 r0 = new androidx.transition.ChangeBounds$6
            java.lang.String r1 = "position"
            r0.<init>(r2, r1)
            androidx.transition.ChangeBounds.POSITION_PROPERTY = r0
            androidx.transition.RectEvaluator r0 = new androidx.transition.RectEvaluator
            r0.<init>()
            androidx.transition.ChangeBounds.sRectEvaluator = r0
            return
    }

    public ChangeBounds() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.mTempLocation = r0
            r0 = 0
            r1.mResizeClip = r0
            r1.mReparent = r0
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public ChangeBounds(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 2
            int[] r0 = new int[r0]
            r2.mTempLocation = r0
            r0 = 0
            r2.mResizeClip = r0
            r2.mReparent = r0
            int[] r1 = androidx.transition.Styleable.CHANGE_BOUNDS
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r1 = "resizeClip"
            boolean r4 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r3, r4, r1, r0, r0)
            r3.recycle()
            r2.setResizeClip(r4)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r8) {
            r7 = this;
            android.view.View r0 = r8.view
            boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r1 != 0) goto L14
            int r1 = r0.getWidth()
            if (r1 != 0) goto L14
            int r1 = r0.getHeight()
            if (r1 == 0) goto L77
        L14:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            int r5 = r0.getRight()
            int r6 = r0.getBottom()
            r2.<init>(r3, r4, r5, r6)
            java.lang.String r3 = "android:changeBounds:bounds"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.view.View r2 = r8.view
            android.view.ViewParent r2 = r2.getParent()
            java.lang.String r3 = "android:changeBounds:parent"
            r1.put(r3, r2)
            boolean r1 = r7.mReparent
            if (r1 == 0) goto L68
            android.view.View r1 = r8.view
            int[] r2 = r7.mTempLocation
            r1.getLocationInWindow(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            int[] r2 = r7.mTempLocation
            r3 = 0
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowX"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            int[] r2 = r7.mTempLocation
            r3 = 1
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowY"
            r1.put(r3, r2)
        L68:
            boolean r1 = r7.mResizeClip
            if (r1 == 0) goto L77
            java.util.Map<java.lang.String, java.lang.Object> r8 = r8.values
            java.lang.String r1 = "android:changeBounds:clip"
            android.graphics.Rect r0 = androidx.core.view.ViewCompat.getClipBounds(r0)
            r8.put(r1, r0)
        L77:
            return
    }

    private boolean parentMatches(android.view.View r4, android.view.View r5) {
            r3 = this;
            boolean r0 = r3.mReparent
            r1 = 1
            if (r0 == 0) goto L16
            androidx.transition.TransitionValues r0 = r3.getMatchedTransitionValues(r4, r1)
            r2 = 0
            if (r0 != 0) goto L10
            if (r4 != r5) goto Lf
            return r1
        Lf:
            return r2
        L10:
            android.view.View r4 = r0.view
            if (r5 != r4) goto L15
            return r1
        L15:
            return r2
        L16:
            return r1
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    public android.animation.Animator createAnimator(@androidx.annotation.NonNull android.view.ViewGroup r21, @androidx.annotation.Nullable androidx.transition.TransitionValues r22, @androidx.annotation.Nullable androidx.transition.TransitionValues r23) {
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r23
            if (r0 == 0) goto La
            if (r2 != 0) goto Le
        La:
            r16 = 0
            goto L25d
        Le:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.values
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.values
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L24
            if (r5 != 0) goto L28
        L24:
            r16 = 0
            goto L25d
        L28:
            android.view.View r6 = r2.view
            boolean r4 = r1.parentMatches(r4, r5)
            if (r4 == 0) goto L1ba
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.values
            java.lang.String r7 = "android:changeBounds:bounds"
            java.lang.Object r4 = r4.get(r7)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            java.util.Map<java.lang.String, java.lang.Object> r9 = r2.values
            java.lang.Object r7 = r9.get(r7)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            int r9 = r4.left
            int r10 = r7.left
            int r11 = r4.top
            int r12 = r7.top
            int r13 = r4.right
            int r14 = r7.right
            int r4 = r4.bottom
            int r7 = r7.bottom
            int r15 = r13 - r9
            r16 = 0
            int r3 = r4 - r11
            r17 = 1
            int r8 = r14 - r10
            r18 = 0
            int r5 = r7 - r12
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.values
            r21 = r3
            java.lang.String r3 = "android:changeBounds:clip"
            java.lang.Object r0 = r0.get(r3)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.values
            java.lang.Object r2 = r2.get(r3)
            r3 = r2
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r15 == 0) goto L79
            if (r21 != 0) goto L7d
        L79:
            if (r8 == 0) goto L8c
            if (r5 == 0) goto L8c
        L7d:
            if (r9 != r10) goto L84
            if (r11 == r12) goto L82
            goto L84
        L82:
            r2 = 0
            goto L85
        L84:
            r2 = 1
        L85:
            if (r13 != r14) goto L89
            if (r4 == r7) goto L8d
        L89:
            int r2 = r2 + 1
            goto L8d
        L8c:
            r2 = 0
        L8d:
            if (r0 == 0) goto L95
            boolean r19 = r0.equals(r3)
            if (r19 == 0) goto L99
        L95:
            if (r0 != 0) goto L9b
            if (r3 == 0) goto L9b
        L99:
            int r2 = r2 + 1
        L9b:
            if (r2 <= 0) goto L1f6
            r22 = r0
            boolean r0 = r1.mResizeClip
            r19 = r0
            r0 = 2
            if (r19 != 0) goto L132
            androidx.transition.ViewUtils.setLeftTopRightBottom(r6, r9, r11, r13, r4)
            if (r2 != r0) goto L107
            if (r15 != r8) goto Lc6
            r2 = r21
            if (r2 != r5) goto Lc6
            androidx.transition.PathMotion r0 = r1.getPathMotion()
            float r2 = (float) r9
            float r3 = (float) r11
            float r4 = (float) r10
            float r5 = (float) r12
            android.graphics.Path r0 = r0.getPath(r2, r3, r4, r5)
            android.util.Property<android.view.View, android.graphics.PointF> r2 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.ofPointF(r6, r2, r0)
        Lc3:
            r4 = r6
            goto L19f
        Lc6:
            androidx.transition.ChangeBounds$ViewBounds r2 = new androidx.transition.ChangeBounds$ViewBounds
            r2.<init>(r6)
            androidx.transition.PathMotion r3 = r1.getPathMotion()
            float r5 = (float) r9
            float r8 = (float) r11
            float r9 = (float) r10
            float r10 = (float) r12
            android.graphics.Path r3 = r3.getPath(r5, r8, r9, r10)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r5 = androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY
            android.animation.ObjectAnimator r3 = androidx.transition.ObjectAnimatorUtils.ofPointF(r2, r5, r3)
            androidx.transition.PathMotion r5 = r1.getPathMotion()
            float r8 = (float) r13
            float r4 = (float) r4
            float r9 = (float) r14
            float r7 = (float) r7
            android.graphics.Path r4 = r5.getPath(r8, r4, r9, r7)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r5 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY
            android.animation.ObjectAnimator r4 = androidx.transition.ObjectAnimatorUtils.ofPointF(r2, r5, r4)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r18] = r3
            r0[r17] = r4
            r5.playTogether(r0)
            androidx.transition.ChangeBounds$7 r0 = new androidx.transition.ChangeBounds$7
            r0.<init>(r1, r2)
            r5.addListener(r0)
            r0 = r5
            goto Lc3
        L107:
            if (r9 != r10) goto L11f
            if (r11 == r12) goto L10c
            goto L11f
        L10c:
            androidx.transition.PathMotion r0 = r1.getPathMotion()
            float r2 = (float) r13
            float r3 = (float) r4
            float r4 = (float) r14
            float r5 = (float) r7
            android.graphics.Path r0 = r0.getPath(r2, r3, r4, r5)
            android.util.Property<android.view.View, android.graphics.PointF> r2 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.ofPointF(r6, r2, r0)
            goto Lc3
        L11f:
            androidx.transition.PathMotion r0 = r1.getPathMotion()
            float r2 = (float) r9
            float r3 = (float) r11
            float r4 = (float) r10
            float r5 = (float) r12
            android.graphics.Path r0 = r0.getPath(r2, r3, r4, r5)
            android.util.Property<android.view.View, android.graphics.PointF> r2 = androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.ofPointF(r6, r2, r0)
            goto Lc3
        L132:
            r2 = r21
            int r4 = java.lang.Math.max(r15, r8)
            int r13 = java.lang.Math.max(r2, r5)
            int r4 = r4 + r9
            int r13 = r13 + r11
            androidx.transition.ViewUtils.setLeftTopRightBottom(r6, r9, r11, r4, r13)
            if (r9 != r10) goto L149
            if (r11 == r12) goto L146
            goto L149
        L146:
            r9 = r16
            goto L15c
        L149:
            androidx.transition.PathMotion r4 = r1.getPathMotion()
            float r9 = (float) r9
            float r11 = (float) r11
            float r13 = (float) r10
            float r0 = (float) r12
            android.graphics.Path r0 = r4.getPath(r9, r11, r13, r0)
            android.util.Property<android.view.View, android.graphics.PointF> r4 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.ofPointF(r6, r4, r0)
            r9 = r0
        L15c:
            if (r22 != 0) goto L165
            android.graphics.Rect r0 = new android.graphics.Rect
            r4 = 0
            r0.<init>(r4, r4, r15, r2)
            goto L168
        L165:
            r4 = 0
            r0 = r22
        L168:
            if (r3 != 0) goto L170
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r4, r4, r8, r5)
            goto L171
        L170:
            r2 = r3
        L171:
            boolean r5 = r0.equals(r2)
            if (r5 != 0) goto L198
            androidx.core.view.ViewCompat.setClipBounds(r6, r0)
            androidx.transition.RectEvaluator r5 = androidx.transition.ChangeBounds.sRectEvaluator
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r4] = r0
            r8[r17] = r2
            java.lang.String r0 = "clipBounds"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r6, r0, r5, r8)
            androidx.transition.ChangeBounds$8 r0 = new androidx.transition.ChangeBounds$8
            r2 = r6
            r4 = r10
            r5 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r4 = r2
            r8.addListener(r0)
            r3 = r8
            goto L19b
        L198:
            r4 = r6
            r3 = r16
        L19b:
            android.animation.Animator r0 = androidx.transition.TransitionUtils.mergeAnimators(r9, r3)
        L19f:
            android.view.ViewParent r2 = r4.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1b9
            android.view.ViewParent r2 = r4.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 1
            androidx.transition.ViewGroupUtils.suppressLayout(r2, r3)
            androidx.transition.ChangeBounds$9 r3 = new androidx.transition.ChangeBounds$9
            r3.<init>(r1, r2)
            r1.addListener(r3)
        L1b9:
            return r0
        L1ba:
            r4 = r6
            r16 = 0
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.values
            java.lang.String r5 = "android:changeBounds:windowX"
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.values
            java.lang.String r6 = "android:changeBounds:windowY"
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.values
            java.lang.Object r5 = r7.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.values
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r3 != r5) goto L1f7
            if (r0 == r2) goto L1f6
            goto L1f7
        L1f6:
            return r16
        L1f7:
            int[] r6 = r1.mTempLocation
            r7 = r21
            r7.getLocationInWindow(r6)
            int r6 = r4.getWidth()
            int r8 = r4.getHeight()
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r8, r9)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r6)
            r4.draw(r8)
            r8 = r3
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            r3.<init>(r6)
            r6 = r5
            float r5 = androidx.transition.ViewUtils.getTransitionAlpha(r4)
            r9 = 0
            androidx.transition.ViewUtils.setTransitionAlpha(r4, r9)
            androidx.transition.ViewOverlayImpl r9 = androidx.transition.ViewUtils.getOverlay(r7)
            r9.add(r3)
            androidx.transition.PathMotion r9 = r1.getPathMotion()
            int[] r10 = r1.mTempLocation
            r18 = 0
            r11 = r10[r18]
            int r8 = r8 - r11
            float r8 = (float) r8
            r12 = 1
            r10 = r10[r12]
            int r0 = r0 - r10
            float r0 = (float) r0
            int r6 = r6 - r11
            float r6 = (float) r6
            int r2 = r2 - r10
            float r2 = (float) r2
            android.graphics.Path r0 = r9.getPath(r8, r0, r6, r2)
            android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> r2 = androidx.transition.ChangeBounds.DRAWABLE_ORIGIN_PROPERTY
            android.animation.PropertyValuesHolder r0 = androidx.transition.PropertyValuesHolderUtils.ofPointF(r2, r0)
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r12]
            r18 = 0
            r2[r18] = r0
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r2)
            androidx.transition.ChangeBounds$10 r0 = new androidx.transition.ChangeBounds$10
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.addListener(r0)
            return r6
        L25d:
            return r16
    }

    public boolean getResizeClip() {
            r1 = this;
            boolean r0 = r1.mResizeClip
            return r0
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeBounds.sTransitionProperties
            return r0
    }

    public void setResizeClip(boolean r1) {
            r0 = this;
            r0.mResizeClip = r1
            return
    }
}
