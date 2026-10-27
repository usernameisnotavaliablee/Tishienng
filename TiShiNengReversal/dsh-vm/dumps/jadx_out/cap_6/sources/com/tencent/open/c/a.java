package com.tencent.open.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends android.widget.RelativeLayout {
    private static final java.lang.String a = "com.tencent.open.c.a";
    private android.graphics.Rect b;
    private boolean c;
    private com.tencent.open.c.a.InterfaceC0036a d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.open.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0036a {
        void a();

        void a(int r1);
    }

    static {
            return
    }

    public a(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.b = r2
            r0 = 0
            r1.c = r0
            r1.d = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.b = r2
            return
    }

    public void a(com.tencent.open.c.a.InterfaceC0036a r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            android.content.Context r1 = r4.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r2 = r1.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.graphics.Rect r3 = r4.b
            r2.getWindowVisibleDisplayFrame(r3)
            android.graphics.Rect r2 = r4.b
            int r2 = r2.top
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getHeight()
            int r1 = r1 - r2
            int r1 = r1 - r0
            com.tencent.open.c.a$a r2 = r4.d
            if (r2 == 0) goto L4e
            if (r0 == 0) goto L4e
            r0 = 100
            if (r1 <= r0) goto L4b
            android.graphics.Rect r0 = r4.b
            int r0 = r0.height()
            int r0 = java.lang.Math.abs(r0)
            int r1 = r4.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r4.getPaddingTop()
            int r0 = r0 - r1
            r2.a(r0)
            goto L4e
        L4b:
            r2.a()
        L4e:
            super.onMeasure(r5, r6)
            return
    }
}
