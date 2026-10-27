package com.mcxtzhang.swipemenulib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CstViewPager extends androidx.viewpager.widget.ViewPager {
    private static final java.lang.String k = "zxt/CstViewPager";
    private int i;
    private int j;

    public CstViewPager(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public CstViewPager(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean b(int r2, int r3) {
            r1 = this;
            int r0 = r1.j
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            int r0 = r1.i
            int r2 = r2 - r0
            int r2 = java.lang.Math.abs(r2)
            if (r3 >= r2) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private boolean h() {
            r3 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r3.getAdapter()
            if (r0 == 0) goto L13
            int r0 = r0.getCount()
            r1 = 1
            int r0 = r0 - r1
            int r2 = r3.getCurrentItem()
            if (r0 != r2) goto L13
            return r1
        L13:
            r0 = 0
            return r0
    }

    private boolean i() {
            r1 = this;
            int r0 = r1.getCurrentItem()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private boolean j(int r2) {
            r1 = this;
            int r0 = r1.i
            int r2 = r2 - r0
            if (r2 >= 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    private boolean k(int r2) {
            r1 = this;
            int r0 = r1.i
            int r2 = r2 - r0
            if (r2 <= 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r7.getAction()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L14
            goto L26
        L14:
            boolean r2 = r6.b(r0, r1)
            if (r2 == 0) goto L26
            boolean r2 = r6.i()
            if (r2 == 0) goto L28
            boolean r2 = r6.k(r0)
            if (r2 == 0) goto L28
        L26:
            r2 = 0
            goto L36
        L28:
            boolean r2 = r6.h()
            if (r2 == 0) goto L35
            boolean r2 = r6.j(r0)
            if (r2 == 0) goto L35
            goto L26
        L35:
            r2 = 1
        L36:
            r6.i = r0
            r6.j = r1
            boolean r7 = super.onInterceptTouchEvent(r7)
            if (r2 != 0) goto L44
            if (r7 == 0) goto L43
            goto L44
        L43:
            return r5
        L44:
            return r4
    }

    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)
            return r1
    }
}
