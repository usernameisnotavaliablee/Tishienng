package com.scwang.smartrefresh.layout.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.view.View r7, android.view.MotionEvent r8) {
            boolean r0 = c(r7)
            if (r0 != 0) goto L14
            boolean r0 = e(r7)
            if (r0 == 0) goto L14
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L14
            r7 = 1
            return r7
        L14:
            boolean r0 = r7 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L4e
            if (r8 == 0) goto L4e
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r0 = r7.getChildCount()
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            r3 = 0
        L27:
            if (r3 >= r0) goto L4e
            android.view.View r4 = r7.getChildAt(r3)
            float r5 = r8.getX()
            float r6 = r8.getY()
            boolean r5 = f(r7, r4, r5, r6, r2)
            if (r5 == 0) goto L4b
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r8)
            float r8 = r2.x
            float r0 = r2.y
            r7.offsetLocation(r8, r0)
            boolean r7 = a(r4, r7)
            return r7
        L4b:
            int r3 = r3 + 1
            goto L27
        L4e:
            return r1
    }

    public static boolean b(android.view.View r5, android.view.MotionEvent r6) {
            boolean r0 = e(r5)
            if (r0 == 0) goto Le
            int r0 = r5.getVisibility()
            if (r0 != 0) goto Le
            r5 = 0
            return r5
        Le:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L48
            if (r6 == 0) goto L48
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
        L1f:
            if (r0 <= 0) goto L48
            int r2 = r0 + (-1)
            android.view.View r2 = r5.getChildAt(r2)
            float r3 = r6.getX()
            float r4 = r6.getY()
            boolean r3 = f(r5, r2, r3, r4, r1)
            if (r3 == 0) goto L45
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r6)
            float r6 = r1.x
            float r0 = r1.y
            r5.offsetLocation(r6, r0)
            boolean r5 = b(r2, r5)
            return r5
        L45:
            int r0 = r0 + (-1)
            goto L1f
        L48:
            r5 = 1
            return r5
    }

    public static boolean c(android.view.View r1) {
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            return r1
    }

    public static boolean d(android.view.View r7, android.view.MotionEvent r8) {
            boolean r0 = c(r7)
            if (r0 == 0) goto Le
            int r0 = r7.getVisibility()
            if (r0 != 0) goto Le
            r7 = 1
            return r7
        Le:
            boolean r0 = r7 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L48
            if (r8 == 0) goto L48
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r0 = r7.getChildCount()
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            r3 = 0
        L21:
            if (r3 >= r0) goto L48
            android.view.View r4 = r7.getChildAt(r3)
            float r5 = r8.getX()
            float r6 = r8.getY()
            boolean r5 = f(r7, r4, r5, r6, r2)
            if (r5 == 0) goto L45
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r8)
            float r8 = r2.x
            float r0 = r2.y
            r7.offsetLocation(r8, r0)
            boolean r7 = d(r4, r7)
            return r7
        L45:
            int r3 = r3 + 1
            goto L21
        L48:
            return r1
    }

    public static boolean e(android.view.View r1) {
            r0 = -1
            boolean r1 = r1.canScrollVertically(r0)
            return r1
    }

    public static boolean f(android.view.ViewGroup r5, android.view.View r6, float r7, float r8, android.graphics.PointF r9) {
            int r0 = r6.getVisibility()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 2
            float[] r0 = new float[r0]
            r0[r1] = r7
            r2 = 1
            r0[r2] = r8
            h(r5, r6, r0)
            r5 = r0[r1]
            r3 = r0[r2]
            r4 = 0
            boolean r5 = g(r6, r5, r3, r4)
            if (r5 == 0) goto L29
            if (r9 == 0) goto L29
            r6 = r0[r1]
            float r6 = r6 - r7
            r7 = r0[r2]
            float r7 = r7 - r8
            r9.set(r6, r7)
        L29:
            return r5
    }

    public static boolean g(android.view.View r3, float r4, float r5, float r6) {
            float r0 = -r6
            int r1 = r3.getWidth()
            float r1 = (float) r1
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L1f
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L1f
            float r1 = r1 + r6
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L1f
            float r3 = r3 + r6
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1f
            r3 = 1
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public static void h(android.view.ViewGroup r4, android.view.View r5, float[] r6) {
            r0 = 0
            r1 = r6[r0]
            int r2 = r4.getScrollX()
            int r3 = r5.getLeft()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r1 = r1 + r2
            r6[r0] = r1
            r0 = 1
            r1 = r6[r0]
            int r4 = r4.getScrollY()
            int r5 = r5.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r1 = r1 + r4
            r6[r0] = r1
            return
    }
}
