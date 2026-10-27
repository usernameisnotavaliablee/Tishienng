package com.scwang.smartrefresh.layout.internal.pathview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PathsView extends android.view.View {
    protected com.scwang.smartrefresh.layout.internal.pathview.b a;

    public PathsView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r0.<init>()
            r2.a = r0
            r0 = 0
            r1 = 0
            r2.a(r3, r0, r1)
            return
    }

    public PathsView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.a(r2, r3, r0)
            return
    }

    public PathsView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r0.<init>()
            r1.a = r0
            r1.a(r2, r3, r4)
            return
    }

    private void a(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r1.<init>()
            r0.a = r1
            return
    }

    public void b(int... r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r1.a
            r0.h(r2)
            return
    }

    public void c(java.lang.String... r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r1.a
            r0.i(r2)
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            super.onDraw(r2)
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r1.a
            r0.draw(r2)
            return
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.getTag()
            java.lang.String r0 = r0.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.c(r0)
        L1a:
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            super.onLayout(r4, r5, r6, r7, r8)
            r4 = r3
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r4.a
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingTop()
            int r7 = r7 - r5
            int r5 = r3.getPaddingRight()
            int r7 = r7 - r5
            int r5 = r3.getPaddingLeft()
            int r5 = java.lang.Math.max(r7, r5)
            int r8 = r8 - r6
            int r6 = r3.getPaddingTop()
            int r8 = r8 - r6
            int r6 = r3.getPaddingTop()
            int r6 = java.lang.Math.max(r8, r6)
            r0.setBounds(r1, r2, r5, r6)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r2.a
            int r0 = r0.n()
            int r1 = r2.getPaddingLeft()
            int r0 = r0 + r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r3 = android.view.View.resolveSize(r0, r3)
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r2.a
            int r0 = r0.f()
            int r1 = r2.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r2.getPaddingBottom()
            int r0 = r0 + r1
            int r4 = android.view.View.resolveSize(r0, r4)
            r2.setMeasuredDimension(r3, r4)
            return
    }
}
