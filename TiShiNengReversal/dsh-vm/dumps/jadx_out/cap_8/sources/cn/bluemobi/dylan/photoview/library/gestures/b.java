package cn.bluemobi.dylan.photoview.library.gestures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(5)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.bluemobi.dylan.photoview.library.gestures.a {

    /* renamed from: k, reason: collision with root package name */
    private static final int f189k = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f190i;

    /* renamed from: j, reason: collision with root package name */
    private int f191j;

    public b(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.f190i = r1
            r1 = 0
            r0.f191j = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.a
    float d(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r1.f191j     // Catch: java.lang.Exception -> L7
            float r2 = r2.getX(r0)     // Catch: java.lang.Exception -> L7
            return r2
        L7:
            float r2 = r2.getX()
            return r2
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.a
    float e(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r1.f191j     // Catch: java.lang.Exception -> L7
            float r2 = r2.getY(r0)     // Catch: java.lang.Exception -> L7
            return r2
        L7:
            float r2 = r2.getY()
            return r2
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.a, cn.bluemobi.dylan.photoview.library.gestures.d
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3e
            r3 = 1
            if (r0 == r3) goto L3b
            r4 = 3
            if (r0 == r4) goto L3b
            r4 = 6
            if (r0 == r4) goto L14
            goto L44
        L14:
            int r0 = r7.getAction()
            int r0 = cn.bluemobi.dylan.photoview.library.a.a(r0)
            int r4 = r7.getPointerId(r0)
            int r5 = r6.f190i
            if (r4 != r5) goto L44
            if (r0 != 0) goto L27
            goto L28
        L27:
            r3 = 0
        L28:
            int r0 = r7.getPointerId(r3)
            r6.f190i = r0
            float r0 = r7.getX(r3)
            r6.f183b = r0
            float r0 = r7.getY(r3)
            r6.f184c = r0
            goto L44
        L3b:
            r6.f190i = r1
            goto L44
        L3e:
            int r0 = r7.getPointerId(r2)
            r6.f190i = r0
        L44:
            int r0 = r6.f190i
            if (r0 == r1) goto L49
            r2 = r0
        L49:
            int r0 = r7.findPointerIndex(r2)
            r6.f191j = r0
            boolean r7 = super.onTouchEvent(r7)
            return r7
    }
}
