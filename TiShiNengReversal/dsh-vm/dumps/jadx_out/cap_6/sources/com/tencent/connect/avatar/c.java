package com.tencent.connect.avatar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends android.widget.ImageView {
    final java.lang.String a;
    public boolean b;
    private android.graphics.Matrix c;
    private android.graphics.Matrix d;
    private int e;
    private float f;
    private float g;
    private android.graphics.Bitmap h;
    private boolean i;
    private float j;
    private float k;
    private android.graphics.PointF l;
    private android.graphics.PointF m;
    private float n;
    private float o;
    private android.graphics.Rect p;


    public c(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2.c = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2.d = r3
            r3 = 0
            r2.e = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f = r0
            r2.g = r0
            r2.i = r3
            java.lang.String r1 = "TouchView"
            r2.a = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r2.l = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r2.m = r1
            r2.n = r0
            r0 = 0
            r2.o = r0
            r2.b = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.p = r3
            r2.getDrawingRect(r3)
            r2.a()
            return
    }

    private float a(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getPointerCount()
            r1 = 2
            if (r0 >= r1) goto L9
            r5 = 0
            return r5
        L9:
            r0 = 0
            float r1 = r5.getX(r0)
            r2 = 1
            float r3 = r5.getX(r2)
            float r1 = r1 - r3
            float r0 = r5.getY(r0)
            float r5 = r5.getY(r2)
            float r0 = r0 - r5
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r5 = (float) r0
            return r5
    }

    private void a() {
            r0 = this;
            return
    }

    private void a(android.graphics.PointF r9) {
            r8 = this;
            android.graphics.Bitmap r0 = r8.h
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 9
            float[] r0 = new float[r0]
            android.graphics.Matrix r1 = r8.c
            r1.getValues(r0)
            r1 = 2
            r1 = r0[r1]
            r2 = 5
            r2 = r0[r2]
            r3 = 0
            r0 = r0[r3]
            android.graphics.Bitmap r3 = r8.h
            int r3 = r3.getWidth()
            float r3 = (float) r3
            android.graphics.Bitmap r4 = r8.h
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r3 = r3 * r0
            float r4 = r4 * r0
            android.graphics.Rect r0 = r8.p
            int r5 = r0.left
            float r5 = (float) r5
            float r5 = r5 - r1
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 > 0) goto L37
            r5 = 1065353216(0x3f800000, float:1.0)
        L37:
            float r1 = r1 + r3
            int r3 = r0.right
            float r3 = (float) r3
            float r1 = r1 - r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 > 0) goto L42
            r1 = 1065353216(0x3f800000, float:1.0)
        L42:
            float r1 = r1 + r5
            int r0 = r0.width()
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 / r1
            android.graphics.Rect r1 = r8.p
            int r3 = r1.left
            float r3 = (float) r3
            float r0 = r0 + r3
            int r3 = r1.top
            float r3 = (float) r3
            float r3 = r3 - r2
            float r2 = r2 + r4
            int r4 = r1.bottom
            float r4 = (float) r4
            float r2 = r2 - r4
            int r4 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r4 > 0) goto L60
            r3 = 1065353216(0x3f800000, float:1.0)
        L60:
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L65
            goto L66
        L65:
            r6 = r2
        L66:
            float r6 = r6 + r3
            int r1 = r1.height()
            float r1 = (float) r1
            float r1 = r1 * r3
            float r1 = r1 / r6
            android.graphics.Rect r2 = r8.p
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1 + r2
            r9.set(r0, r1)
            return
    }

    static /* synthetic */ void a(com.tencent.connect.avatar.c r0) {
            r0.b()
            return
    }

    static /* synthetic */ boolean a(com.tencent.connect.avatar.c r0, boolean r1) {
            r0.i = r1
            return r1
    }

    private void b() {
            r19 = this;
            r0 = r19
            android.graphics.Bitmap r1 = r0.h
            if (r1 != 0) goto L8
            goto L107
        L8:
            android.graphics.Rect r1 = r0.p
            int r1 = r1.width()
            float r1 = (float) r1
            android.graphics.Rect r2 = r0.p
            int r2 = r2.height()
            float r2 = (float) r2
            r3 = 9
            float[] r3 = new float[r3]
            android.graphics.Matrix r4 = r0.c
            r4.getValues(r3)
            r4 = 2
            r5 = r3[r4]
            r6 = 5
            r7 = r3[r6]
            r8 = 0
            r9 = r3[r8]
            float r10 = r0.f
            r11 = 1
            int r12 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r12 <= 0) goto L5d
            float r10 = r10 / r9
            r0.o = r10
            android.graphics.Matrix r1 = r0.c
            android.graphics.PointF r2 = r0.m
            float r3 = r2.x
            float r2 = r2.y
            r1.postScale(r10, r10, r3, r2)
            android.graphics.Matrix r1 = r0.c
            r0.setImageMatrix(r1)
            android.view.animation.ScaleAnimation r2 = new android.view.animation.ScaleAnimation
            float r1 = r0.o
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r1
            float r5 = r4 / r1
            android.graphics.PointF r1 = r0.m
            float r7 = r1.x
            float r8 = r1.y
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto Lee
        L5d:
            float r10 = r0.g
            int r12 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r12 >= 0) goto L8a
            float r10 = r10 / r9
            r0.o = r10
            android.graphics.Matrix r1 = r0.c
            android.graphics.PointF r2 = r0.m
            float r3 = r2.x
            float r2 = r2.y
            r1.postScale(r10, r10, r3, r2)
            android.view.animation.ScaleAnimation r12 = new android.view.animation.ScaleAnimation
            float r14 = r0.o
            android.graphics.PointF r1 = r0.m
            float r2 = r1.x
            float r1 = r1.y
            r13 = 1065353216(0x3f800000, float:1.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = r14
            r18 = r1
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2 = r12
            goto Lee
        L8a:
            android.graphics.Bitmap r10 = r0.h
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r10 = r10 * r9
            android.graphics.Bitmap r12 = r0.h
            int r12 = r12.getHeight()
            float r12 = (float) r12
            float r12 = r12 * r9
            android.graphics.Rect r9 = r0.p
            int r13 = r9.left
            float r14 = (float) r13
            float r14 = r14 - r5
            int r9 = r9.top
            float r15 = (float) r9
            float r15 = r15 - r7
            r16 = 2
            r4 = 0
            int r17 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r17 >= 0) goto Laf
            float r5 = (float) r13
            r8 = 1
        Laf:
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 >= 0) goto Lb5
            float r7 = (float) r9
            r8 = 1
        Lb5:
            float r14 = r10 - r14
            float r15 = r12 - r15
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 >= 0) goto Lc2
            float r10 = r10 - r1
            float r1 = (float) r13
            float r5 = r1 - r10
            r8 = 1
        Lc2:
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r1 >= 0) goto Lcb
            float r12 = r12 - r2
            float r1 = (float) r9
            float r7 = r1 - r12
            r8 = 1
        Lcb:
            if (r8 == 0) goto Le8
            r1 = r3[r16]
            float r1 = r1 - r5
            r2 = r3[r6]
            float r2 = r2 - r7
            r3[r16] = r5
            r3[r6] = r7
            android.graphics.Matrix r5 = r0.c
            r5.setValues(r3)
            android.graphics.Matrix r3 = r0.c
            r0.setImageMatrix(r3)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r1, r4, r2, r4)
            r2 = r3
            goto Lee
        Le8:
            android.graphics.Matrix r1 = r0.c
            r0.setImageMatrix(r1)
            r2 = 0
        Lee:
            if (r2 == 0) goto L107
            r0.i = r11
            r3 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r3)
            r0.startAnimation(r2)
            java.lang.Thread r1 = new java.lang.Thread
            com.tencent.connect.avatar.c$1 r2 = new com.tencent.connect.avatar.c$1
            r2.<init>(r0)
            r1.<init>(r2)
            r1.start()
        L107:
            return
    }

    private void c() {
            r6 = this;
            android.graphics.Bitmap r0 = r6.h
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 9
            float[] r0 = new float[r0]
            android.graphics.Matrix r1 = r6.c
            r1.getValues(r0)
            android.graphics.Rect r1 = r6.p
            int r1 = r1.width()
            float r1 = (float) r1
            android.graphics.Bitmap r2 = r6.h
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            android.graphics.Rect r2 = r6.p
            int r2 = r2.height()
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r6.h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            android.graphics.Rect r2 = r6.p
            int r2 = r2.left
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r6.h
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r1
            android.graphics.Rect r4 = r6.p
            int r4 = r4.width()
            float r4 = (float) r4
            float r3 = r3 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 - r3
            r6.j = r2
            android.graphics.Rect r2 = r6.p
            int r2 = r2.top
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r6.h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r1
            android.graphics.Rect r5 = r6.p
            int r5 = r5.height()
            float r5 = (float) r5
            float r3 = r3 - r5
            float r3 = r3 / r4
            float r2 = r2 - r3
            r6.k = r2
            r3 = 2
            float r4 = r6.j
            r0[r3] = r4
            r3 = 5
            r0[r3] = r2
            r2 = 4
            r0[r2] = r1
            r2 = 0
            r0[r2] = r1
            android.graphics.Matrix r2 = r6.c
            r2.setValues(r0)
            android.graphics.Bitmap r0 = r6.h
            int r0 = r0.getWidth()
            float r0 = (float) r0
            r2 = 1157627904(0x45000000, float:2048.0)
            float r0 = r2 / r0
            android.graphics.Bitmap r3 = r6.h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r0 = java.lang.Math.min(r0, r2)
            r6.f = r0
            r6.g = r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9a
            r6.f = r1
        L9a:
            android.graphics.Matrix r0 = r6.c
            r6.setImageMatrix(r0)
            return
    }

    public void a(android.graphics.Rect r1) {
            r0 = this;
            r0.p = r1
            android.graphics.Bitmap r1 = r0.h
            if (r1 == 0) goto L9
            r0.c()
        L9:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.i
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L90
            if (r0 == r1) goto L89
            r2 = 1092616192(0x41200000, float:10.0)
            r3 = 2
            if (r0 == r3) goto L37
            r4 = 5
            if (r0 == r4) goto L1d
            r6 = 6
            if (r0 == r6) goto L89
            goto Laf
        L1d:
            float r6 = r5.a(r6)
            r5.n = r6
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto Laf
            android.graphics.Matrix r6 = r5.d
            android.graphics.Matrix r0 = r5.c
            r6.set(r0)
            android.graphics.PointF r6 = r5.m
            r5.a(r6)
            r5.e = r3
            goto Laf
        L37:
            int r0 = r5.e
            if (r0 != r1) goto L5f
            android.graphics.Matrix r0 = r5.c
            android.graphics.Matrix r2 = r5.d
            r0.set(r2)
            float r0 = r6.getX()
            android.graphics.PointF r2 = r5.l
            float r2 = r2.x
            float r0 = r0 - r2
            float r6 = r6.getY()
            android.graphics.PointF r2 = r5.l
            float r2 = r2.y
            float r6 = r6 - r2
            android.graphics.Matrix r2 = r5.c
            r2.postTranslate(r0, r6)
            android.graphics.Matrix r6 = r5.c
            r5.setImageMatrix(r6)
            goto Laf
        L5f:
            if (r0 != r3) goto Laf
            android.graphics.Matrix r0 = r5.c
            r0.set(r0)
            float r6 = r5.a(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L83
            android.graphics.Matrix r0 = r5.c
            android.graphics.Matrix r2 = r5.d
            r0.set(r2)
            float r0 = r5.n
            float r6 = r6 / r0
            android.graphics.Matrix r0 = r5.c
            android.graphics.PointF r2 = r5.m
            float r3 = r2.x
            float r2 = r2.y
            r0.postScale(r6, r6, r3, r2)
        L83:
            android.graphics.Matrix r6 = r5.c
            r5.setImageMatrix(r6)
            goto Laf
        L89:
            r5.b()
            r6 = 0
            r5.e = r6
            goto Laf
        L90:
            android.graphics.Matrix r0 = r5.c
            android.graphics.Matrix r2 = r5.getImageMatrix()
            r0.set(r2)
            android.graphics.Matrix r0 = r5.d
            android.graphics.Matrix r2 = r5.c
            r0.set(r2)
            android.graphics.PointF r0 = r5.l
            float r2 = r6.getX()
            float r6 = r6.getY()
            r0.set(r2, r6)
            r5.e = r1
        Laf:
            r5.b = r1
            return r1
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            r0.h = r1
            if (r1 == 0) goto L9
            r0.h = r1
        L9:
            return
    }
}
