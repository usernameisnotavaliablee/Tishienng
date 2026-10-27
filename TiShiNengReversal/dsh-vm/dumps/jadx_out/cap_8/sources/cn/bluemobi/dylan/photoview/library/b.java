package cn.bluemobi.dylan.photoview.library;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements android.view.GestureDetector.OnDoubleTapListener {
    private cn.bluemobi.dylan.photoview.library.d a;

    public b(cn.bluemobi.dylan.photoview.library.d r1) {
            r0 = this;
            r0.<init>()
            r0.a(r1)
            return
    }

    public void a(cn.bluemobi.dylan.photoview.library.d r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent r5) {
            r4 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r4.a
            if (r0 != 0) goto L6
            r5 = 0
            return r5
        L6:
            r1 = 1
            float r0 = r0.getScale()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r2 = r5.getX()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r5 = r5.getY()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            cn.bluemobi.dylan.photoview.library.d r3 = r4.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r3 = r3.getMediumScale()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L27
            cn.bluemobi.dylan.photoview.library.d r0 = r4.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r3 = r0.getMediumScale()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            r0.a(r3, r2, r5, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            goto L4e
        L27:
            cn.bluemobi.dylan.photoview.library.d r3 = r4.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r3 = r3.getMediumScale()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L45
            cn.bluemobi.dylan.photoview.library.d r3 = r4.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r3 = r3.getMaximumScale()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L45
            cn.bluemobi.dylan.photoview.library.d r0 = r4.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r3 = r0.getMaximumScale()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            r0.a(r3, r2, r5, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            goto L4e
        L45:
            cn.bluemobi.dylan.photoview.library.d r0 = r4.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            float r3 = r0.getMinimumScale()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
            r0.a(r3, r2, r5, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4e
        L4e:
            return r1
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent r7) {
            r6 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r6.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.widget.ImageView r0 = r0.u()
            cn.bluemobi.dylan.photoview.library.d r2 = r6.a
            cn.bluemobi.dylan.photoview.library.d$f r2 = r2.getOnPhotoTapListener()
            if (r2 == 0) goto L43
            cn.bluemobi.dylan.photoview.library.d r2 = r6.a
            android.graphics.RectF r2 = r2.getDisplayRect()
            if (r2 == 0) goto L43
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r5 = r2.contains(r3, r4)
            if (r5 == 0) goto L43
            float r7 = r2.left
            float r3 = r3 - r7
            float r7 = r2.width()
            float r3 = r3 / r7
            float r7 = r2.top
            float r4 = r4 - r7
            float r7 = r2.height()
            float r4 = r4 / r7
            cn.bluemobi.dylan.photoview.library.d r7 = r6.a
            cn.bluemobi.dylan.photoview.library.d$f r7 = r7.getOnPhotoTapListener()
            r7.a(r0, r3, r4)
            r7 = 1
            return r7
        L43:
            cn.bluemobi.dylan.photoview.library.d r2 = r6.a
            cn.bluemobi.dylan.photoview.library.d$h r2 = r2.getOnViewTapListener()
            if (r2 == 0) goto L5c
            cn.bluemobi.dylan.photoview.library.d r2 = r6.a
            cn.bluemobi.dylan.photoview.library.d$h r2 = r2.getOnViewTapListener()
            float r3 = r7.getX()
            float r7 = r7.getY()
            r2.a(r0, r3, r7)
        L5c:
            return r1
    }
}
