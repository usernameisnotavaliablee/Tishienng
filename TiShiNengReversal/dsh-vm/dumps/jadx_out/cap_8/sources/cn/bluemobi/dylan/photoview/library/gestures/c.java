package cn.bluemobi.dylan.photoview.library.gestures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(8)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.bluemobi.dylan.photoview.library.gestures.b {
    protected final android.view.ScaleGestureDetector l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.ScaleGestureDetector.OnScaleGestureListener {
        final /* synthetic */ cn.bluemobi.dylan.photoview.library.gestures.c a;

        a(cn.bluemobi.dylan.photoview.library.gestures.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(android.view.ScaleGestureDetector r4) {
                r3 = this;
                float r0 = r4.getScaleFactor()
                boolean r1 = java.lang.Float.isNaN(r0)
                if (r1 != 0) goto L22
                boolean r1 = java.lang.Float.isInfinite(r0)
                if (r1 == 0) goto L11
                goto L22
            L11:
                cn.bluemobi.dylan.photoview.library.gestures.c r1 = r3.a
                cn.bluemobi.dylan.photoview.library.gestures.e r1 = r1.a
                float r2 = r4.getFocusX()
                float r4 = r4.getFocusY()
                r1.f(r0, r2, r4)
                r4 = 1
                return r4
            L22:
                r4 = 0
                return r4
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(android.view.ScaleGestureDetector r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(android.view.ScaleGestureDetector r1) {
                r0 = this;
                return
        }
    }

    public c(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            cn.bluemobi.dylan.photoview.library.gestures.c$a r0 = new cn.bluemobi.dylan.photoview.library.gestures.c$a
            r0.<init>(r2)
            android.view.ScaleGestureDetector r1 = new android.view.ScaleGestureDetector
            r1.<init>(r3, r0)
            r2.l = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.a, cn.bluemobi.dylan.photoview.library.gestures.d
    public boolean c() {
            r1 = this;
            android.view.ScaleGestureDetector r0 = r1.l
            boolean r0 = r0.isInProgress()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.b, cn.bluemobi.dylan.photoview.library.gestures.a, cn.bluemobi.dylan.photoview.library.gestures.d
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.ScaleGestureDetector r0 = r1.l
            r0.onTouchEvent(r2)
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }
}
