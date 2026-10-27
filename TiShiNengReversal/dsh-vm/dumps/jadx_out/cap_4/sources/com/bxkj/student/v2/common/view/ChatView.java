package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ChatView extends android.widget.RelativeLayout {
    private static final int k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f1371l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f1372m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final int f1373n = 4;
    private int a;
    private int b;
    private int c;
    private android.view.WindowManager.LayoutParams d;
    private android.view.WindowManager e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;


    public ChatView(android.app.Activity r5) {
            r4 = this;
            r4.<init>(r5)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
            r1 = 2131493177(0x7f0c0139, float:1.8609827E38)
            r0.inflate(r1, r4)
            java.lang.String r0 = "window"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r4.e = r0
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.WindowManager r1 = r5.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r0, r5)
            r4.a = r0
            android.view.WindowManager r0 = r4.e
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getWidth()
            r4.c = r0
            android.view.WindowManager r0 = r4.e
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getHeight()
            r4.b = r0
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r4.d = r0
            r1 = 2
            r0.type = r1
            r1 = 1
            r0.format = r1
            r2 = 53
            r0.gravity = r2
            r2 = 8
            r0.flags = r2
            int r2 = r4.a
            r0.width = r2
            r0.height = r2
            int r3 = r4.b
            int r3 = r3 - r2
            int r1 = r3 >> 1
            r0.y = r1
            android.view.WindowManager r1 = r4.e
            r1.addView(r4, r0)
            r4.d()
            boolean r0 = r5 instanceof androidx.activity.ComponentActivity
            if (r0 == 0) goto L83
            androidx.activity.ComponentActivity r5 = (androidx.activity.ComponentActivity) r5
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            com.bxkj.student.v2.common.view.ChatView$1 r0 = new com.bxkj.student.v2.common.view.ChatView$1
            r0.<init>(r4)
            r5.addObserver(r0)
        L83:
            return
    }

    private void a() {
            r5 = this;
            r0 = 2
            int[] r1 = new int[r0]
            r5.getLocationOnScreen(r1)
            r2 = 0
            r1 = r1[r2]
            int r3 = r5.c
            int r3 = r3 / r0
            int r4 = r5.getWidth()
            int r4 = r4 / r0
            int r3 = r3 - r4
            if (r1 >= r3) goto L18
            r5.g(r2)
            return
        L18:
            r0 = 1
            r5.g(r0)
            return
    }

    private int c(int r2) {
            r1 = this;
            r0 = 120(0x78, float:1.68E-43)
            if (r2 > r0) goto L7
            r2 = 36
            return r2
        L7:
            r0 = 160(0xa0, float:2.24E-43)
            if (r2 > r0) goto Le
            r2 = 48
            return r2
        Le:
            r0 = 240(0xf0, float:3.36E-43)
            if (r2 > r0) goto L15
            r2 = 72
            return r2
        L15:
            r0 = 320(0x140, float:4.48E-43)
            if (r2 > r0) goto L1c
            r2 = 96
            return r2
        L1c:
            r2 = 108(0x6c, float:1.51E-43)
            return r2
    }

    private void f() {
            r3 = this;
            android.view.WindowManager$LayoutParams r0 = r3.d
            float r1 = r3.f
            float r2 = r3.h
            float r1 = r1 - r2
            int r1 = (int) r1
            r0.x = r1
            float r1 = r3.g
            float r2 = r3.i
            float r1 = r1 - r2
            int r2 = r3.b
            int r2 = r2 / 25
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
            r0.y = r1
            android.view.WindowManager r1 = r3.e
            r1.updateViewLayout(r3, r0)
            return
    }

    private void g(int r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L26
            r1 = 1
            if (r3 == r1) goto L1c
            r1 = 3
            if (r3 == r1) goto L17
            r0 = 4
            if (r3 == r0) goto Ld
            goto L2a
        Ld:
            android.view.WindowManager$LayoutParams r3 = r2.d
            int r0 = r2.b
            int r1 = r2.a
            int r0 = r0 - r1
            r3.y = r0
            goto L2a
        L17:
            android.view.WindowManager$LayoutParams r3 = r2.d
            r3.y = r0
            goto L2a
        L1c:
            int r3 = r2.c
            int r0 = r2.a
            int r3 = r3 - r0
            android.view.WindowManager$LayoutParams r0 = r2.d
            r0.x = r3
            goto L2a
        L26:
            android.view.WindowManager$LayoutParams r3 = r2.d
            r3.x = r0
        L2a:
            android.view.WindowManager r3 = r2.e
            android.view.WindowManager$LayoutParams r0 = r2.d
            r3.updateViewLayout(r2, r0)
            return
    }

    public void b() {
            r1 = this;
            r1.d()
            android.view.WindowManager r0 = r1.e
            r0.removeViewImmediate(r1)
            return
    }

    public void d() {
            r1 = this;
            r0 = 8
            r1.setVisibility(r0)
            return
    }

    public void e() {
            r1 = this;
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            r1.setVisibility(r0)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            float r0 = r4.getRawX()
            r3.f = r0
            float r0 = r4.getRawY()
            r3.g = r0
            int r0 = r4.getAction()
            if (r0 == 0) goto L5f
            r1 = 1
            if (r0 == r1) goto L4f
            r2 = 2
            if (r0 == r2) goto L19
            goto L6b
        L19:
            boolean r0 = r3.j
            if (r0 == 0) goto L21
            r3.f()
            goto L4c
        L21:
            float r0 = r3.h
            float r2 = r4.getX()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r3.a
            int r2 = r2 / 3
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L49
            float r0 = r3.i
            float r2 = r4.getY()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r3.a
            int r2 = r2 / 3
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6b
        L49:
            r3.f()
        L4c:
            r3.j = r1
            goto L6b
        L4f:
            boolean r0 = r3.j
            if (r0 == 0) goto L56
            r3.a()
        L56:
            r0 = 0
            r3.j = r0
            r0 = 0
            r3.i = r0
            r3.h = r0
            goto L6b
        L5f:
            float r0 = r4.getX()
            r3.h = r0
            float r0 = r4.getY()
            r3.i = r0
        L6b:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }
}
