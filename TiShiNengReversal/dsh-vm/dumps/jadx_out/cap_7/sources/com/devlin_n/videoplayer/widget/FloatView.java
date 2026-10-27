package com.devlin_n.videoplayer.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class FloatView extends android.widget.FrameLayout {
    private android.view.WindowManager a;
    private android.view.WindowManager.LayoutParams b;
    public com.devlin_n.videoplayer.player.IjkVideoView c;
    private int d;
    private int e;
    private boolean f;

    public FloatView(@androidx.annotation.NonNull android.content.Context r1, android.view.WindowManager r2, android.view.WindowManager.LayoutParams r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f = r1
            r0.a = r2
            r0.b = r3
            r0.a()
            return
    }

    private void a() {
            r2 = this;
            int r0 = com.devlin_n.videoplayer.R.drawable.shape_float_window_background
            r2.setBackgroundResource(r0)
            android.content.Context r0 = r2.getContext()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = g1.f.a(r0, r1)
            r2.setPadding(r0, r0, r0, r0)
            com.devlin_n.videoplayer.player.IjkVideoView r0 = new com.devlin_n.videoplayer.player.IjkVideoView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.c = r0
            r2.addView(r0)
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            int r1 = r1.getAction()
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            float r0 = r7.getRawX()
            int r0 = (int) r0
            float r1 = r7.getRawY()
            int r1 = (int) r1
            int r2 = r7.getAction()
            r3 = 1
            if (r2 == r3) goto L46
            r3 = 2
            if (r2 == r3) goto L15
            goto L48
        L15:
            boolean r2 = r6.f
            if (r2 == 0) goto L34
            float r2 = r7.getX()
            int r2 = (int) r2
            r6.d = r2
            float r2 = r7.getY()
            double r2 = (double) r2
            android.content.Context r4 = r6.getContext()
            double r4 = g1.f.f(r4)
            double r2 = r2 + r4
            int r2 = (int) r2
            r6.e = r2
            r2 = 0
            r6.f = r2
        L34:
            android.view.WindowManager$LayoutParams r2 = r6.b
            int r3 = r6.d
            int r0 = r0 - r3
            r2.x = r0
            int r0 = r6.e
            int r1 = r1 - r0
            r2.y = r1
            android.view.WindowManager r0 = r6.a
            r0.updateViewLayout(r6, r2)
            goto L48
        L46:
            r6.f = r3
        L48:
            boolean r7 = super.onTouchEvent(r7)
            return r7
    }
}
