package master.flame.danmaku.ui.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a {
    private final android.view.GestureDetector a;
    private master.flame.danmaku.controller.f b;
    private android.graphics.RectF c;
    private float d;
    private float e;
    private final android.view.GestureDetector.OnGestureListener f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.ui.widget.a$a, reason: collision with other inner class name */
    class C0128a extends android.view.GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ master.flame.danmaku.ui.widget.a a;

        C0128a(master.flame.danmaku.ui.widget.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent r2) {
                r1 = this;
                master.flame.danmaku.ui.widget.a r2 = r1.a
                master.flame.danmaku.controller.f r2 = master.flame.danmaku.ui.widget.a.a(r2)
                if (r2 == 0) goto L30
                master.flame.danmaku.ui.widget.a r2 = r1.a
                master.flame.danmaku.controller.f r2 = master.flame.danmaku.ui.widget.a.a(r2)
                master.flame.danmaku.controller.f$a r2 = r2.getOnDanmakuClickListener()
                if (r2 == 0) goto L30
                master.flame.danmaku.ui.widget.a r2 = r1.a
                master.flame.danmaku.controller.f r0 = master.flame.danmaku.ui.widget.a.a(r2)
                float r0 = r0.getXOff()
                master.flame.danmaku.ui.widget.a.c(r2, r0)
                master.flame.danmaku.ui.widget.a r2 = r1.a
                master.flame.danmaku.controller.f r0 = master.flame.danmaku.ui.widget.a.a(r2)
                float r0 = r0.getYOff()
                master.flame.danmaku.ui.widget.a.e(r2, r0)
                r2 = 1
                return r2
            L30:
                r2 = 0
                return r2
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent r3) {
                r2 = this;
                master.flame.danmaku.ui.widget.a r0 = r2.a
                master.flame.danmaku.controller.f r0 = master.flame.danmaku.ui.widget.a.a(r0)
                master.flame.danmaku.controller.f$a r0 = r0.getOnDanmakuClickListener()
                if (r0 != 0) goto Ld
                goto L43
            Ld:
                master.flame.danmaku.ui.widget.a r0 = r2.a
                master.flame.danmaku.controller.f r1 = master.flame.danmaku.ui.widget.a.a(r0)
                float r1 = r1.getXOff()
                master.flame.danmaku.ui.widget.a.c(r0, r1)
                master.flame.danmaku.ui.widget.a r0 = r2.a
                master.flame.danmaku.controller.f r1 = master.flame.danmaku.ui.widget.a.a(r0)
                float r1 = r1.getYOff()
                master.flame.danmaku.ui.widget.a.e(r0, r1)
                master.flame.danmaku.ui.widget.a r0 = r2.a
                float r1 = r3.getX()
                float r3 = r3.getY()
                master.flame.danmaku.danmaku.model.m r3 = master.flame.danmaku.ui.widget.a.f(r0, r1, r3)
                if (r3 == 0) goto L43
                boolean r0 = r3.isEmpty()
                if (r0 != 0) goto L43
                master.flame.danmaku.ui.widget.a r0 = r2.a
                r1 = 1
                master.flame.danmaku.ui.widget.a.g(r0, r3, r1)
            L43:
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(android.view.MotionEvent r3) {
                r2 = this;
                master.flame.danmaku.ui.widget.a r0 = r2.a
                float r1 = r3.getX()
                float r3 = r3.getY()
                master.flame.danmaku.danmaku.model.m r3 = master.flame.danmaku.ui.widget.a.f(r0, r1, r3)
                r0 = 0
                if (r3 == 0) goto L1d
                boolean r1 = r3.isEmpty()
                if (r1 != 0) goto L1d
                master.flame.danmaku.ui.widget.a r1 = r2.a
                boolean r0 = master.flame.danmaku.ui.widget.a.g(r1, r3, r0)
            L1d:
                if (r0 != 0) goto L26
                master.flame.danmaku.ui.widget.a r3 = r2.a
                boolean r3 = master.flame.danmaku.ui.widget.a.h(r3)
                return r3
            L26:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
        final /* synthetic */ float e;
        final /* synthetic */ float f;
        final /* synthetic */ master.flame.danmaku.danmaku.model.m g;
        final /* synthetic */ master.flame.danmaku.ui.widget.a h;

        b(master.flame.danmaku.ui.widget.a r1, float r2, float r3, master.flame.danmaku.danmaku.model.m r4) {
                r0 = this;
                r0.h = r1
                r0.e = r2
                r0.f = r3
                r0.g = r4
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                int r1 = r0.e(r1)
                return r1
        }

        public int e(master.flame.danmaku.danmaku.model.d r7) {
                r6 = this;
                if (r7 == 0) goto L50
                master.flame.danmaku.ui.widget.a r0 = r6.h
                android.graphics.RectF r0 = master.flame.danmaku.ui.widget.a.i(r0)
                float r1 = r7.g()
                float r2 = r7.l()
                float r3 = r7.i()
                float r4 = r7.d()
                r0.set(r1, r2, r3, r4)
                master.flame.danmaku.ui.widget.a r0 = r6.h
                android.graphics.RectF r0 = master.flame.danmaku.ui.widget.a.i(r0)
                float r1 = r6.e
                master.flame.danmaku.ui.widget.a r2 = r6.h
                float r2 = master.flame.danmaku.ui.widget.a.b(r2)
                float r1 = r1 - r2
                float r2 = r6.f
                master.flame.danmaku.ui.widget.a r3 = r6.h
                float r3 = master.flame.danmaku.ui.widget.a.d(r3)
                float r2 = r2 - r3
                float r3 = r6.e
                master.flame.danmaku.ui.widget.a r4 = r6.h
                float r4 = master.flame.danmaku.ui.widget.a.b(r4)
                float r3 = r3 + r4
                float r4 = r6.f
                master.flame.danmaku.ui.widget.a r5 = r6.h
                float r5 = master.flame.danmaku.ui.widget.a.d(r5)
                float r4 = r4 + r5
                boolean r0 = r0.intersect(r1, r2, r3, r4)
                if (r0 == 0) goto L50
                master.flame.danmaku.danmaku.model.m r0 = r6.g
                r0.j(r7)
            L50:
                r7 = 0
                return r7
        }
    }

    private a(master.flame.danmaku.controller.f r3) {
            r2 = this;
            r2.<init>()
            master.flame.danmaku.ui.widget.a$a r0 = new master.flame.danmaku.ui.widget.a$a
            r0.<init>(r2)
            r2.f = r0
            r2.b = r3
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r2.c = r1
            android.view.GestureDetector r1 = new android.view.GestureDetector
            android.view.View r3 = (android.view.View) r3
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r0)
            r2.a = r1
            return
    }

    static /* synthetic */ master.flame.danmaku.controller.f a(master.flame.danmaku.ui.widget.a r0) {
            master.flame.danmaku.controller.f r0 = r0.b
            return r0
    }

    static /* synthetic */ float b(master.flame.danmaku.ui.widget.a r0) {
            float r0 = r0.d
            return r0
    }

    static /* synthetic */ float c(master.flame.danmaku.ui.widget.a r0, float r1) {
            r0.d = r1
            return r1
    }

    static /* synthetic */ float d(master.flame.danmaku.ui.widget.a r0) {
            float r0 = r0.e
            return r0
    }

    static /* synthetic */ float e(master.flame.danmaku.ui.widget.a r0, float r1) {
            r0.e = r1
            return r1
    }

    static /* synthetic */ master.flame.danmaku.danmaku.model.m f(master.flame.danmaku.ui.widget.a r0, float r1, float r2) {
            master.flame.danmaku.danmaku.model.m r0 = r0.n(r1, r2)
            return r0
    }

    static /* synthetic */ boolean g(master.flame.danmaku.ui.widget.a r0, master.flame.danmaku.danmaku.model.m r1, boolean r2) {
            boolean r0 = r0.l(r1, r2)
            return r0
    }

    static /* synthetic */ boolean h(master.flame.danmaku.ui.widget.a r0) {
            boolean r0 = r0.m()
            return r0
    }

    static /* synthetic */ android.graphics.RectF i(master.flame.danmaku.ui.widget.a r0) {
            android.graphics.RectF r0 = r0.c
            return r0
    }

    public static synchronized master.flame.danmaku.ui.widget.a j(master.flame.danmaku.controller.f r2) {
            java.lang.Class<master.flame.danmaku.ui.widget.a> r0 = master.flame.danmaku.ui.widget.a.class
            monitor-enter(r0)
            master.flame.danmaku.ui.widget.a r1 = new master.flame.danmaku.ui.widget.a     // Catch: java.lang.Throwable -> La
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return r1
        La:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    private boolean l(master.flame.danmaku.danmaku.model.m r2, boolean r3) {
            r1 = this;
            master.flame.danmaku.controller.f r0 = r1.b
            master.flame.danmaku.controller.f$a r0 = r0.getOnDanmakuClickListener()
            if (r0 == 0) goto L14
            if (r3 == 0) goto Lf
            boolean r2 = r0.c(r2)
            return r2
        Lf:
            boolean r2 = r0.a(r2)
            return r2
        L14:
            r2 = 0
            return r2
    }

    private boolean m() {
            r2 = this;
            master.flame.danmaku.controller.f r0 = r2.b
            master.flame.danmaku.controller.f$a r0 = r0.getOnDanmakuClickListener()
            if (r0 == 0) goto Lf
            master.flame.danmaku.controller.f r1 = r2.b
            boolean r0 = r0.b(r1)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private master.flame.danmaku.danmaku.model.m n(float r4, float r5) {
            r3 = this;
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r0.<init>()
            android.graphics.RectF r1 = r3.c
            r1.setEmpty()
            master.flame.danmaku.controller.f r1 = r3.b
            master.flame.danmaku.danmaku.model.m r1 = r1.getCurrentVisibleDanmakus()
            if (r1 == 0) goto L20
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L20
            master.flame.danmaku.ui.widget.a$b r2 = new master.flame.danmaku.ui.widget.a$b
            r2.<init>(r3, r4, r5, r0)
            r1.a(r2)
        L20:
            return r0
    }

    public boolean k(android.view.MotionEvent r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.a
            boolean r2 = r0.onTouchEvent(r2)
            return r2
    }
}
