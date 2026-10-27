package com.scwang.smartrefresh.layout.footer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FalsifyFooter extends com.scwang.smartrefresh.layout.header.FalsifyHeader implements l2.d {
    public FalsifyFooter(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FalsifyFooter(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public FalsifyFooter(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public FalsifyFooter(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public boolean b(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void c(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            super.f(r1, r2, r3)
            l2.h r1 = r1.c()
            r2 = 0
            r1.S(r2)
            return
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation", "SetTextI18n"})
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            boolean r0 = r9.isInEditMode()
            if (r0 == 0) goto Lb4
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = com.scwang.smartrefresh.layout.util.c.b(r0)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r1)
            r7 = 1157627903(0x44ffffff, float:2047.9999)
            r6.setColor(r7)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r1)
            float r2 = (float) r2
            r6.setStrokeWidth(r2)
            android.graphics.DashPathEffect r2 = new android.graphics.DashPathEffect
            r3 = r2
            float r2 = (float) r0
            r4 = 4
            float[] r4 = new float[r4]
            r8 = 0
            r4[r8] = r2
            r5 = 1
            r4[r5] = r2
            r5 = 2
            r4[r5] = r2
            r5 = 3
            r4[r5] = r2
            r3.<init>(r4, r1)
            r6.setPathEffect(r3)
            int r1 = r9.getWidth()
            int r1 = r1 - r0
            float r4 = (float) r1
            int r1 = r9.getBottom()
            int r1 = r1 - r0
            float r5 = (float) r1
            r3 = r2
            r1 = r10
            r1.drawRect(r2, r3, r4, r5, r6)
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r0 = r9.getContext()
            r10.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r9.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = " 虚假区域\n运行时代表上拉Footer的高度【"
            r0.append(r2)
            int r2 = r9.getHeight()
            float r2 = (float) r2
            float r2 = com.scwang.smartrefresh.layout.util.c.d(r2)
            r0.append(r2)
            java.lang.String r2 = "dp】\n而不会显示任何东西"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.setText(r0)
            r10.setTextColor(r7)
            r0 = 17
            r10.setGravity(r0)
            int r0 = r9.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r9.getHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            int r0 = r9.getWidth()
            int r2 = r9.getHeight()
            r10.layout(r8, r8, r0, r2)
            r10.draw(r1)
        Lb4:
            return
    }

    public void p(l2.h r1, int r2, int r3) {
            r0 = this;
            l2.g r1 = r0.a
            if (r1 == 0) goto L10
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r1.e(r2)
            l2.g r1 = r0.a
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
            r1.e(r2)
        L10:
            return
    }

    public void v(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }
}
