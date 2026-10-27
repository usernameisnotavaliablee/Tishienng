package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s2 extends androidx.recyclerview.widget.RecyclerView {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public float f2649b;

    /* renamed from: c, reason: collision with root package name */
    public float f2650c;

    /* renamed from: d, reason: collision with root package name */
    public com.acse.ottn.r2 f2651d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.WindowManager f2652e;

    public s2(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public s2(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public s2(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.a = r2
            r0.a(r1)
            return
    }

    public final void a(android.content.Context r1) {
            r0 = this;
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            r0.a = r1
            return
    }

    public void a(com.acse.ottn.r2 r1, android.view.WindowManager r2) {
            r0 = this;
            r0.f2651d = r1
            r0.f2652e = r2
            return
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getAction()
            r1 = 0
            if (r0 == 0) goto L36
            r2 = 1
            if (r0 == r2) goto L35
            r3 = 2
            if (r0 == r3) goto Le
            return r1
        Le:
            float r0 = r5.getX()
            float r3 = r4.f2649b
            float r0 = r0 - r3
            float r5 = r5.getY()
            float r3 = r4.f2650c
            float r5 = r5 - r3
            float r0 = java.lang.Math.abs(r0)
            int r3 = r4.a
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L34
            float r5 = java.lang.Math.abs(r5)
            int r0 = r4.a
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L33
            goto L34
        L33:
            return r1
        L34:
            return r2
        L35:
            return r1
        L36:
            float r0 = r5.getX()
            r4.f2649b = r0
            float r0 = r5.getY()
            r4.f2650c = r0
            com.acse.ottn.r2 r0 = r4.f2651d
            float r2 = r5.getRawX()
            int r2 = (int) r2
            r0.a(r2)
            com.acse.ottn.r2 r0 = r4.f2651d
            float r5 = r5.getRawY()
            int r5 = (int) r5
            r0.b(r5)
            return r1
    }

    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            com.acse.ottn.r2 r0 = r5.f2651d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.WindowManager r0 = r5.f2652e
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            if (r0 == 0) goto L6e
            r1 = 1
            if (r0 == r1) goto L6a
            r1 = 2
            if (r0 == r1) goto L18
            goto L82
        L18:
            float r0 = r6.getRawX()
            int r0 = (int) r0
            float r1 = r6.getRawY()
            int r1 = (int) r1
            com.acse.ottn.r2 r2 = r5.f2651d
            int r2 = r2.b()
            int r2 = r0 - r2
            com.acse.ottn.r2 r3 = r5.f2651d
            int r3 = r3.c()
            int r3 = r1 - r3
            com.acse.ottn.r2 r4 = r5.f2651d
            r4.a(r0)
            com.acse.ottn.r2 r0 = r5.f2651d
            r0.b(r1)
            com.acse.ottn.r2 r0 = r5.f2651d
            android.view.WindowManager$LayoutParams r0 = r0.a()
            com.acse.ottn.r2 r1 = r5.f2651d
            android.view.WindowManager$LayoutParams r1 = r1.a()
            int r1 = r1.x
            int r1 = r1 + r2
            r0.x = r1
            com.acse.ottn.r2 r0 = r5.f2651d
            android.view.WindowManager$LayoutParams r0 = r0.a()
            com.acse.ottn.r2 r1 = r5.f2651d
            android.view.WindowManager$LayoutParams r1 = r1.a()
            int r1 = r1.y
            int r1 = r1 + r3
            r0.y = r1
            android.view.WindowManager r0 = r5.f2652e
            com.acse.ottn.r2 r1 = r5.f2651d
            android.view.WindowManager$LayoutParams r1 = r1.a()
            r0.updateViewLayout(r5, r1)
            goto L82
        L6a:
            r5.performClick()
            goto L82
        L6e:
            com.acse.ottn.r2 r0 = r5.f2651d
            float r1 = r6.getRawX()
            int r1 = (int) r1
            r0.a(r1)
            com.acse.ottn.r2 r0 = r5.f2651d
            float r1 = r6.getRawY()
            int r1 = (int) r1
            r0.b(r1)
        L82:
            boolean r6 = super.onTouchEvent(r6)
            return r6
    }

    public boolean performClick() {
            r1 = this;
            boolean r0 = super/*android.view.ViewGroup*/.performClick()
            return r0
    }
}
