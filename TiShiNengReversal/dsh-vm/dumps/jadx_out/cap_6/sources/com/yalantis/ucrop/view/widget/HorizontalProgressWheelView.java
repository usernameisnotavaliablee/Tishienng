package com.yalantis.ucrop.view.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HorizontalProgressWheelView extends android.view.View {
    private final android.graphics.Rect a;
    private com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a b;
    private float c;
    private android.graphics.Paint d;
    private android.graphics.Paint e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private int k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void b();

        void onScroll(float r1, float r2);
    }

    public HorizontalProgressWheelView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public HorizontalProgressWheelView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public HorizontalProgressWheelView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.a = r1
            r0.a()
            return
    }

    @android.annotation.TargetApi(21)
    public HorizontalProgressWheelView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.a = r1
            return
    }

    private void a() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = com.yalantis.ucrop.R.color.ucrop_color_widget_rotate_mid_line
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r3.k = r0
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.yalantis.ucrop.R.dimen.ucrop_width_horizontal_wheel_progress_line
            int r0 = r0.getDimensionPixelSize(r1)
            r3.f = r0
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.yalantis.ucrop.R.dimen.ucrop_height_horizontal_wheel_progress_line
            int r0 = r0.getDimensionPixelSize(r1)
            r3.g = r0
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.yalantis.ucrop.R.dimen.ucrop_margin_horizontal_wheel_progress_line
            int r0 = r0.getDimensionPixelSize(r1)
            r3.h = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r3.d = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.d
            int r1 = r3.f
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r3.d
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.yalantis.ucrop.R.color.ucrop_color_progress_wheel_line
            int r1 = r1.getColor(r2)
            r0.setColor(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            android.graphics.Paint r1 = r3.d
            r0.<init>(r1)
            r3.e = r0
            int r1 = r3.k
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.e
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = r3.e
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.yalantis.ucrop.R.dimen.ucrop_width_middle_wheel_progress_line
            int r1 = r1.getDimensionPixelSize(r2)
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            return
    }

    private void b(android.view.MotionEvent r2, float r3) {
            r1 = this;
            float r0 = r1.j
            float r0 = r0 - r3
            r1.j = r0
            r1.postInvalidate()
            float r2 = r2.getX()
            r1.c = r2
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a r2 = r1.b
            if (r2 == 0) goto L18
            float r3 = -r3
            float r0 = r1.j
            r2.onScroll(r3, r0)
        L18:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r12) {
            r11 = this;
            super.onDraw(r12)
            android.graphics.Rect r0 = r11.a
            r12.getClipBounds(r0)
            android.graphics.Rect r0 = r11.a
            int r0 = r0.width()
            int r2 = r11.f
            int r3 = r11.h
            int r4 = r2 + r3
            int r0 = r0 / r4
            float r4 = r11.j
            int r3 = r3 + r2
            float r2 = (float) r3
            float r7 = r4 % r2
            r2 = 0
            r8 = 0
        L1d:
            if (r8 >= r0) goto L8d
            int r2 = r0 / 4
            r3 = 1132396544(0x437f0000, float:255.0)
            if (r8 >= r2) goto L31
            android.graphics.Paint r4 = r11.d
            float r5 = (float) r8
            float r2 = (float) r2
            float r5 = r5 / r2
            float r5 = r5 * r3
            int r2 = (int) r5
            r4.setAlpha(r2)
            goto L4c
        L31:
            int r4 = r0 * 3
            int r4 = r4 / 4
            if (r8 <= r4) goto L45
            android.graphics.Paint r4 = r11.d
            int r5 = r0 - r8
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            float r5 = r5 * r3
            int r2 = (int) r5
            r4.setAlpha(r2)
            goto L4c
        L45:
            android.graphics.Paint r2 = r11.d
            r3 = 255(0xff, float:3.57E-43)
            r2.setAlpha(r3)
        L4c:
            float r2 = -r7
            android.graphics.Rect r3 = r11.a
            int r4 = r3.left
            float r4 = (float) r4
            float r4 = r4 + r2
            int r5 = r11.f
            int r6 = r11.h
            int r5 = r5 + r6
            int r5 = r5 * r8
            float r5 = (float) r5
            float r4 = r4 + r5
            int r3 = r3.centerY()
            float r3 = (float) r3
            int r5 = r11.g
            float r5 = (float) r5
            r6 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 / r6
            float r3 = r3 - r5
            android.graphics.Rect r5 = r11.a
            int r9 = r5.left
            float r9 = (float) r9
            float r2 = r2 + r9
            int r9 = r11.f
            int r10 = r11.h
            int r9 = r9 + r10
            int r9 = r9 * r8
            float r9 = (float) r9
            float r2 = r2 + r9
            int r5 = r5.centerY()
            float r5 = (float) r5
            int r9 = r11.g
            float r9 = (float) r9
            float r9 = r9 / r6
            float r5 = r5 + r9
            android.graphics.Paint r6 = r11.d
            r1 = r4
            r4 = r2
            r2 = r1
            r1 = r12
            r1.drawLine(r2, r3, r4, r5, r6)
            int r8 = r8 + 1
            goto L1d
        L8d:
            android.graphics.Rect r0 = r11.a
            int r0 = r0.centerX()
            float r2 = (float) r0
            android.graphics.Rect r0 = r11.a
            int r0 = r0.centerY()
            float r0 = (float) r0
            int r1 = r11.g
            float r1 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r0 = r0 - r1
            android.graphics.Rect r1 = r11.a
            int r1 = r1.centerX()
            float r4 = (float) r1
            android.graphics.Rect r1 = r11.a
            int r1 = r1.centerY()
            float r1 = (float) r1
            int r5 = r11.g
            float r5 = (float) r5
            float r5 = r5 / r3
            float r5 = r5 + r1
            android.graphics.Paint r6 = r11.e
            r1 = r12
            r3 = r0
            r1.drawLine(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L2a
            r2 = 2
            if (r0 == r2) goto Ld
            goto L3b
        Ld:
            float r0 = r4.getX()
            float r2 = r3.c
            float r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L3b
            boolean r2 = r3.i
            if (r2 != 0) goto L26
            r3.i = r1
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a r2 = r3.b
            if (r2 == 0) goto L26
            r2.b()
        L26:
            r3.b(r4, r0)
            goto L3b
        L2a:
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a r4 = r3.b
            if (r4 == 0) goto L3b
            r0 = 0
            r3.i = r0
            r4.a()
            goto L3b
        L35:
            float r4 = r4.getX()
            r3.c = r4
        L3b:
            return r1
    }

    public void setMiddleLineColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.k = r1
            r0.invalidate()
            return
    }

    public void setScrollingListener(com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
