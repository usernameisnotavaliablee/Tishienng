package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class IOSToggleButton extends android.view.View implements android.view.View.OnTouchListener {
    private final java.lang.String DEBUG_TAG;
    private int animLayerColor;
    private android.graphics.RectF basicLayer;
    private android.graphics.Paint basicPaint;
    private float basicRadius;
    private float borderWidth;
    private android.graphics.Point center;
    private android.view.GestureDetector detector;
    private int disabledColor;
    private int enabledColor;
    private boolean handlerHolded;
    private android.graphics.RectF handlerLayer;
    private float handlerMoveDistance;
    private android.graphics.Paint handlerPaint;
    private float handlerRadius;
    private boolean isInitial;
    private float offsetX;
    private com.bxkj.student.common.view.IOSToggleButton.OnToggleChanged onToggleChanged;
    private int openBg;
    private android.graphics.RectF openBgLayer;
    private android.graphics.Paint openBgPaint;
    private float openBgRadius;
    private com.facebook.rebound.Spring springHandlerMove;
    private com.facebook.rebound.Spring springHandlerTouch;
    com.facebook.rebound.SimpleSpringListener springListenerHandlerMove;
    com.facebook.rebound.SimpleSpringListener springListenerHandlerTouch;
    private com.facebook.rebound.SpringSystem springSystem;
    private android.graphics.RectF toggleAnimLayer;
    private android.graphics.Paint toggleAnimPaint;
    private float toggleAnimRadius;
    private boolean toggleOn;
    private int transparent;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class MyGestureDetector extends android.view.GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ com.bxkj.student.common.view.IOSToggleButton this$0;

        MyGestureDetector(com.bxkj.student.common.view.IOSToggleButton r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent r4) {
                r3 = this;
                com.bxkj.student.common.view.IOSToggleButton r0 = r3.this$0
                android.graphics.RectF r1 = com.bxkj.student.common.view.IOSToggleButton.b(r0)
                float r2 = r4.getX()
                float r4 = r4.getY()
                boolean r4 = r1.contains(r2, r4)
                com.bxkj.student.common.view.IOSToggleButton.d(r0, r4)
                com.bxkj.student.common.view.IOSToggleButton r4 = r3.this$0
                boolean r4 = com.bxkj.student.common.view.IOSToggleButton.a(r4)
                if (r4 == 0) goto L28
                com.bxkj.student.common.view.IOSToggleButton r4 = r3.this$0
                com.facebook.rebound.Spring r4 = com.bxkj.student.common.view.IOSToggleButton.c(r4)
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r4.x(r0)
            L28:
                r4 = 1
                return r4
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnToggleChanged {
        void onToggle(boolean r1);
    }

    public IOSToggleButton(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r2 = "ToggleButton"
            r1.DEBUG_TAG = r2
            r2 = 0
            r1.handlerHolded = r2
            r0 = 0
            r1.offsetX = r0
            r0 = 1
            r1.isInitial = r0
            r1.toggleOn = r2
            com.bxkj.student.common.view.IOSToggleButton$1 r0 = new com.bxkj.student.common.view.IOSToggleButton$1
            r0.<init>(r1)
            r1.springListenerHandlerTouch = r0
            com.bxkj.student.common.view.IOSToggleButton$2 r0 = new com.bxkj.student.common.view.IOSToggleButton$2
            r0.<init>(r1)
            r1.springListenerHandlerMove = r0
            r0 = 0
            r1.init(r0, r2)
            return
    }

    public IOSToggleButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            java.lang.String r2 = "ToggleButton"
            r1.DEBUG_TAG = r2
            r2 = 0
            r1.handlerHolded = r2
            r0 = 0
            r1.offsetX = r0
            r0 = 1
            r1.isInitial = r0
            r1.toggleOn = r2
            com.bxkj.student.common.view.IOSToggleButton$1 r0 = new com.bxkj.student.common.view.IOSToggleButton$1
            r0.<init>(r1)
            r1.springListenerHandlerTouch = r0
            com.bxkj.student.common.view.IOSToggleButton$2 r0 = new com.bxkj.student.common.view.IOSToggleButton$2
            r0.<init>(r1)
            r1.springListenerHandlerMove = r0
            r1.init(r3, r2)
            return
    }

    public IOSToggleButton(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            java.lang.String r2 = "ToggleButton"
            r1.DEBUG_TAG = r2
            r2 = 0
            r1.handlerHolded = r2
            r0 = 0
            r1.offsetX = r0
            r0 = 1
            r1.isInitial = r0
            r1.toggleOn = r2
            com.bxkj.student.common.view.IOSToggleButton$1 r2 = new com.bxkj.student.common.view.IOSToggleButton$1
            r2.<init>(r1)
            r1.springListenerHandlerTouch = r2
            com.bxkj.student.common.view.IOSToggleButton$2 r2 = new com.bxkj.student.common.view.IOSToggleButton$2
            r2.<init>(r1)
            r1.springListenerHandlerMove = r2
            r1.init(r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ boolean a(com.bxkj.student.common.view.IOSToggleButton r0) {
            boolean r0 = r0.handlerHolded
            return r0
    }

    private void animButtonScaling(float r5) {
            r4 = this;
            android.graphics.RectF r0 = r4.handlerLayer
            float r1 = r0.left
            float r2 = r4.handlerRadius
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r2
            float r1 = r1 + r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.right = r1
            r4.postInvalidate()
            return
    }

    private void animLayerScale(double r13) {
            r12 = this;
            float r0 = r12.handlerMoveDistance
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r12.handlerRadius
            float r0 = r0 + r2
            double r10 = (double) r0
            r4 = 0
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8 = 0
            r2 = r13
            double r13 = com.facebook.rebound.SpringUtil.b(r2, r4, r6, r8, r10)
            float r0 = r12.handlerRadius
            double r10 = (double) r0
            double r2 = com.facebook.rebound.SpringUtil.b(r2, r4, r6, r8, r10)
            float r0 = (float) r2
            r12.toggleAnimRadius = r0
            android.graphics.RectF r2 = r12.toggleAnimLayer
            int r3 = r12.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r1
            float r13 = (float) r13
            float r3 = r3 - r13
            r2.left = r3
            android.graphics.RectF r14 = r12.toggleAnimLayer
            int r2 = r12.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r1
            float r2 = r2 - r0
            r14.top = r2
            android.graphics.RectF r14 = r12.toggleAnimLayer
            int r2 = r12.getWidth()
            float r2 = (float) r2
            float r2 = r2 / r1
            float r2 = r2 + r13
            r14.right = r2
            android.graphics.RectF r13 = r12.toggleAnimLayer
            int r14 = r12.getHeight()
            float r14 = (float) r14
            float r14 = r14 / r1
            float r14 = r14 + r0
            r13.bottom = r14
            return
    }

    private void animLayerScaleOut(double r1) {
            r0 = this;
            return
    }

    static /* bridge */ /* synthetic */ android.graphics.RectF b(com.bxkj.student.common.view.IOSToggleButton r0) {
            android.graphics.RectF r0 = r0.handlerLayer
            return r0
    }

    static /* bridge */ /* synthetic */ com.facebook.rebound.Spring c(com.bxkj.student.common.view.IOSToggleButton r0) {
            com.facebook.rebound.Spring r0 = r0.springHandlerTouch
            return r0
    }

    static /* bridge */ /* synthetic */ void d(com.bxkj.student.common.view.IOSToggleButton r0, boolean r1) {
            r0.handlerHolded = r1
            return
    }

    static /* bridge */ /* synthetic */ void e(com.bxkj.student.common.view.IOSToggleButton r0, double r1) {
            r0.animLayerScale(r1)
            return
    }

    static /* bridge */ /* synthetic */ void f(com.bxkj.student.common.view.IOSToggleButton r0, double r1) {
            r0.handlerMoveEffect(r1)
            return
    }

    static /* bridge */ /* synthetic */ void g(com.bxkj.student.common.view.IOSToggleButton r0, double r1) {
            r0.handlerScaleEffect(r1)
            return
    }

    private void handlerMoveEffect(double r23) {
            r22 = this;
            r0 = r22
            android.graphics.RectF r1 = r0.handlerLayer
            android.graphics.RectF r2 = r0.basicLayer
            float r3 = r2.left
            float r4 = r0.borderWidth
            float r3 = r3 + r4
            float r5 = r0.handlerMoveDistance
            r6 = r23
            float r8 = (float) r6
            float r9 = r5 * r8
            float r3 = r3 + r9
            r1.left = r3
            float r2 = r2.left
            float r3 = r0.handlerRadius
            r9 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r9
            float r2 = r2 + r3
            float r2 = r2 + r4
            float r5 = r5 * r8
            float r2 = r2 + r5
            r1.right = r2
            android.graphics.Paint r1 = r0.openBgPaint
            r8 = 0
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = com.facebook.rebound.SpringUtil.a(r6, r8, r10)
            r18 = 0
            r20 = 4643176031446892544(0x406fe00000000000, double:255.0)
            r14 = 0
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.facebook.rebound.SpringUtil.b(r12, r14, r16, r18, r20)
            int r2 = (int) r2
            r1.setAlpha(r2)
            r0.postInvalidate()
            return
    }

    private void handlerScaleEffect(double r12) {
            r11 = this;
            boolean r0 = r11.toggleOn
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L23
            android.graphics.RectF r0 = r11.handlerLayer
            float r3 = r0.right
            float r4 = r11.handlerRadius
            float r2 = r2 * r4
            float r3 = r3 - r2
            float r4 = r4 * r1
            r7 = 0
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = r12
            double r12 = com.facebook.rebound.SpringUtil.a(r5, r7, r9)
            float r12 = (float) r12
            float r4 = r4 * r12
            float r3 = r3 - r4
            r0.left = r3
            goto L3d
        L23:
            r4 = r12
            android.graphics.RectF r12 = r11.handlerLayer
            float r13 = r12.left
            float r0 = r11.handlerRadius
            float r2 = r2 * r0
            float r13 = r13 + r2
            float r0 = r0 * r1
            r6 = 0
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = com.facebook.rebound.SpringUtil.a(r4, r6, r8)
            float r1 = (float) r1
            float r0 = r0 * r1
            float r13 = r13 + r0
            r12.right = r13
        L3d:
            r11.postInvalidate()
            return
    }

    private void init() {
            r12 = this;
            boolean r0 = r12.isInitial
            if (r0 == 0) goto La0
            int r0 = r12.getPaddingLeft()
            float r1 = r12.borderWidth
            int r1 = (int) r1
            int r1 = r1 * 2
            int r0 = r0 + r1
            int r1 = r12.getPaddingTop()
            float r2 = r12.borderWidth
            int r2 = (int) r2
            int r2 = r2 * 2
            int r1 = r1 + r2
            int r2 = r12.getPaddingRight()
            float r3 = r12.borderWidth
            int r3 = (int) r3
            int r3 = r3 * 2
            int r2 = r2 + r3
            int r3 = r12.getPaddingBottom()
            float r4 = r12.borderWidth
            int r4 = (int) r4
            int r4 = r4 * 2
            int r3 = r3 + r4
            int r4 = r12.getWidth()
            int r4 = r4 - r0
            int r4 = r4 - r2
            int r2 = r12.getHeight()
            int r2 = r2 - r1
            int r2 = r2 - r3
            int r3 = r1 + r2
            int r5 = r0 + r4
            int r6 = r2 / 2
            float r6 = (float) r6
            r12.basicRadius = r6
            float r7 = r12.borderWidth
            float r8 = r6 - r7
            r12.toggleAnimRadius = r8
            r12.openBgRadius = r6
            float r6 = r6 - r7
            r12.handlerRadius = r6
            float r4 = (float) r4
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r8
            float r4 = r4 - r7
            float r6 = r6 * r8
            float r4 = r4 - r6
            r12.handlerMoveDistance = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            float r6 = (float) r0
            float r1 = (float) r1
            float r7 = (float) r5
            float r3 = (float) r3
            r4.<init>(r6, r1, r7, r3)
            r12.basicLayer = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            float r8 = r12.borderWidth
            float r9 = r6 + r8
            float r10 = r1 + r8
            float r11 = r7 - r8
            float r8 = r3 - r8
            r4.<init>(r9, r10, r11, r8)
            r12.toggleAnimLayer = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r6, r1, r7, r3)
            r12.openBgLayer = r4
            boolean r4 = r12.toggleOn
            if (r4 == 0) goto L8e
            android.graphics.RectF r0 = new android.graphics.RectF
            int r5 = r5 - r2
            float r2 = (float) r5
            float r4 = r12.borderWidth
            float r2 = r2 + r4
            float r1 = r1 + r4
            float r7 = r7 - r4
            float r3 = r3 - r4
            r0.<init>(r2, r1, r7, r3)
            r12.handlerLayer = r0
            goto L9d
        L8e:
            android.graphics.RectF r4 = new android.graphics.RectF
            float r5 = r12.borderWidth
            float r6 = r6 + r5
            float r1 = r1 + r5
            int r0 = r0 + r2
            float r0 = (float) r0
            float r0 = r0 - r5
            float r3 = r3 - r5
            r4.<init>(r6, r1, r0, r3)
            r12.handlerLayer = r4
        L9d:
            r0 = 0
            r12.isInitial = r0
        La0:
            return
    }

    private void init(android.util.AttributeSet r8, int r9) {
            r7 = this;
            r0 = 0
            r1 = 1
            r7.setLayerType(r1, r0)
            com.facebook.rebound.SpringSystem r0 = com.facebook.rebound.SpringSystem.m()
            r7.springSystem = r0
            com.facebook.rebound.Spring r0 = r0.d()
            r7.springHandlerTouch = r0
            r2 = 4632233691727265792(0x4049000000000000, double:50.0)
            r4 = 4619567317775286272(0x401c000000000000, double:7.0)
            com.facebook.rebound.SpringConfig r6 = com.facebook.rebound.SpringConfig.b(r2, r4)
            r0.B(r6)
            com.facebook.rebound.SpringSystem r0 = r7.springSystem
            com.facebook.rebound.Spring r0 = r0.d()
            r7.springHandlerMove = r0
            com.facebook.rebound.SpringConfig r2 = com.facebook.rebound.SpringConfig.b(r2, r4)
            r0.B(r2)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r2 = r7.getContext()
            com.bxkj.student.common.view.IOSToggleButton$MyGestureDetector r3 = new com.bxkj.student.common.view.IOSToggleButton$MyGestureDetector
            r3.<init>(r7)
            r0.<init>(r2, r3)
            r7.detector = r0
            r7.setOnTouchListener(r7)
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.bxkj.student.R.styleable.IOSToggleButton
            r3 = 0
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r8, r2, r9, r3)
            android.content.Context r9 = r7.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131099757(0x7f06006d, float:1.7811876E38)
            int r9 = r9.getColor(r0)
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131099758(0x7f06006e, float:1.7811878E38)
            int r0 = r0.getColor(r2)
            android.content.Context r2 = r7.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r2 = r2.getColor(r4)
            r4 = 3
            int r9 = r8.getColor(r4, r9)
            r7.disabledColor = r9
            r9 = 4
            int r9 = r8.getColor(r9, r0)
            r7.enabledColor = r9
            r7.openBg = r9
            android.content.Context r9 = r7.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131100584(0x7f0603a8, float:1.7813554E38)
            int r9 = r9.getColor(r0)
            r7.transparent = r9
            android.content.Context r9 = r7.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131100570(0x7f06039a, float:1.7813525E38)
            int r9 = r9.getColor(r0)
            r7.animLayerColor = r9
            int r9 = r8.getColor(r3, r2)
            r2 = 0
            float r4 = r8.getDimension(r1, r2)
            r7.borderWidth = r4
            r4 = 2
            int r4 = r8.getInt(r4, r3)
            r8.recycle()
            if (r4 != r1) goto Lbf
            r8 = 1
            goto Lc0
        Lbf:
            r8 = 0
        Lc0:
            r7.toggleOn = r8
            com.facebook.rebound.Spring r8 = r7.springHandlerMove
            double r4 = (double) r4
            r8.v(r4)
            com.facebook.rebound.Spring r8 = r7.springHandlerTouch
            com.facebook.rebound.SimpleSpringListener r4 = r7.springListenerHandlerTouch
            r8.a(r4)
            com.facebook.rebound.Spring r8 = r7.springHandlerMove
            com.facebook.rebound.SimpleSpringListener r4 = r7.springListenerHandlerMove
            r8.a(r4)
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r7.basicPaint = r8
            r8.setAntiAlias(r1)
            android.graphics.Paint r8 = r7.basicPaint
            r8.setColor(r9)
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r7.openBgPaint = r8
            r8.setAntiAlias(r1)
            android.graphics.Paint r8 = r7.openBgPaint
            int r9 = r7.openBg
            r8.setColor(r9)
            boolean r8 = r7.toggleOn
            if (r8 != 0) goto Lff
            android.graphics.Paint r8 = r7.openBgPaint
            r8.setAlpha(r3)
        Lff:
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r7.toggleAnimPaint = r8
            r8.setAntiAlias(r1)
            android.graphics.Paint r8 = r7.toggleAnimPaint
            int r9 = r7.animLayerColor
            r8.setColor(r9)
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r7.handlerPaint = r8
            r8.setAntiAlias(r1)
            android.graphics.Paint r8 = r7.handlerPaint
            android.content.res.Resources r9 = r7.getResources()
            int r9 = r9.getColor(r0)
            r8.setColor(r9)
            android.graphics.Paint r8 = r7.handlerPaint
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            r8.setStyle(r9)
            android.graphics.Paint r8 = r7.handlerPaint
            float r9 = r7.borderWidth
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r9
            android.content.res.Resources r1 = r7.getResources()
            r3 = 2131099818(0x7f0600aa, float:1.7812E38)
            int r1 = r1.getColor(r3)
            r8.setShadowLayer(r0, r2, r9, r1)
            r7.invalidate()
            return
    }

    private void toggle() {
            r3 = this;
            boolean r0 = r3.toggleOn
            if (r0 == 0) goto Lf
            com.facebook.rebound.Spring r0 = r3.springHandlerMove
            r1 = 0
            r0.x(r1)
            r0 = 0
            r3.toggleOn = r0
            goto L19
        Lf:
            com.facebook.rebound.Spring r0 = r3.springHandlerMove
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.x(r1)
            r0 = 1
            r3.toggleOn = r0
        L19:
            com.bxkj.student.common.view.IOSToggleButton$OnToggleChanged r0 = r3.onToggleChanged
            if (r0 == 0) goto L22
            boolean r1 = r3.toggleOn
            r0.onToggle(r1)
        L22:
            return
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            com.facebook.rebound.Spring r0 = r2.springHandlerTouch
            com.facebook.rebound.SimpleSpringListener r1 = r2.springListenerHandlerTouch
            r0.t(r1)
            com.facebook.rebound.Spring r0 = r2.springHandlerMove
            com.facebook.rebound.SimpleSpringListener r1 = r2.springListenerHandlerMove
            r0.t(r1)
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            java.lang.String r0 = "onDraw"
            com.orhanobut.logger.j.c(r0)
            r3.init()
            android.graphics.RectF r0 = r3.basicLayer
            float r1 = r3.basicRadius
            android.graphics.Paint r2 = r3.basicPaint
            r4.drawRoundRect(r0, r1, r1, r2)
            android.graphics.RectF r0 = r3.toggleAnimLayer
            float r1 = r3.toggleAnimRadius
            android.graphics.Paint r2 = r3.toggleAnimPaint
            r4.drawRoundRect(r0, r1, r1, r2)
            android.graphics.RectF r0 = r3.openBgLayer
            float r1 = r3.openBgRadius
            android.graphics.Paint r2 = r3.openBgPaint
            r4.drawRoundRect(r0, r1, r1, r2)
            android.graphics.RectF r0 = r3.handlerLayer
            float r1 = r3.handlerRadius
            android.graphics.Paint r2 = r3.handlerPaint
            r4.drawRoundRect(r0, r1, r1, r2)
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
            r3 = this;
            int r4 = r5.getAction()
            r0 = 1
            if (r4 == 0) goto L29
            if (r4 == r0) goto La
            goto L42
        La:
            boolean r4 = r3.handlerHolded
            if (r4 == 0) goto L15
            com.facebook.rebound.Spring r4 = r3.springHandlerTouch
            r1 = 0
            r4.x(r1)
        L15:
            android.graphics.RectF r4 = r3.handlerLayer
            float r1 = r5.getX()
            float r5 = r5.getY()
            boolean r4 = r4.contains(r1, r5)
            if (r4 == 0) goto L42
            r3.toggle()
            goto L42
        L29:
            android.graphics.RectF r4 = r3.handlerLayer
            float r1 = r5.getX()
            float r5 = r5.getY()
            boolean r4 = r4.contains(r1, r5)
            r3.handlerHolded = r4
            if (r4 == 0) goto L42
            com.facebook.rebound.Spring r4 = r3.springHandlerTouch
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.x(r1)
        L42:
            return r0
    }

    public void setOnToggleChanged(com.bxkj.student.common.view.IOSToggleButton.OnToggleChanged r1) {
            r0 = this;
            r0.onToggleChanged = r1
            return
    }

    public void toggle(boolean r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            com.facebook.rebound.Spring r3 = r2.springHandlerMove
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.x(r0)
            r3 = 1
            r2.toggleOn = r3
            return
        Ld:
            com.facebook.rebound.Spring r3 = r2.springHandlerMove
            r0 = 0
            r3.x(r0)
            r3 = 0
            r2.toggleOn = r3
            return
    }
}
