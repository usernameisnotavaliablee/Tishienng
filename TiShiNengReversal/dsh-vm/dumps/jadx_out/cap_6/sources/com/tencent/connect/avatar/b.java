package com.tencent.connect.avatar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends android.view.View {
    private android.graphics.Rect a;
    private android.graphics.Paint b;

    public b(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.b()
            return
    }

    private void b() {
            r1 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.b = r0
            return
    }

    public android.graphics.Rect a() {
            r5 = this;
            android.graphics.Rect r0 = r5.a
            if (r0 != 0) goto L2d
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.a = r0
            int r0 = r5.getMeasuredWidth()
            int r1 = r5.getMeasuredHeight()
            int r2 = r1 + (-140)
            int r2 = java.lang.Math.min(r2, r0)
            r3 = 640(0x280, float:8.97E-43)
            int r2 = java.lang.Math.min(r2, r3)
            int r0 = r0 - r2
            int r0 = r0 / 2
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r3 = r0 + r2
            int r2 = r2 + r1
            android.graphics.Rect r4 = r5.a
            r4.set(r0, r1, r3, r2)
        L2d:
            android.graphics.Rect r0 = r5.a
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r21) {
            r20 = this;
            r0 = r20
            super.onDraw(r21)
            android.graphics.Rect r1 = r0.a()
            int r2 = r0.getMeasuredWidth()
            int r3 = r0.getMeasuredHeight()
            android.graphics.Paint r4 = r0.b
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            android.graphics.Paint r4 = r0.b
            r5 = 100
            r6 = 0
            int r7 = android.graphics.Color.argb(r5, r6, r6, r6)
            r4.setColor(r7)
            float r11 = (float) r2
            int r2 = r1.top
            float r12 = (float) r2
            android.graphics.Paint r13 = r0.b
            r9 = 0
            r10 = 0
            r8 = r21
            r8.drawRect(r9, r10, r11, r12, r13)
            int r2 = r1.bottom
            float r10 = (float) r2
            float r12 = (float) r3
            android.graphics.Paint r13 = r0.b
            r8.drawRect(r9, r10, r11, r12, r13)
            int r2 = r1.top
            float r2 = (float) r2
            int r3 = r1.left
            float r3 = (float) r3
            int r4 = r1.bottom
            float r4 = (float) r4
            android.graphics.Paint r7 = r0.b
            r15 = 0
            r14 = r21
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r7
            r14.drawRect(r15, r16, r17, r18, r19)
            int r2 = r1.right
            float r9 = (float) r2
            int r2 = r1.top
            float r10 = (float) r2
            int r2 = r1.bottom
            float r12 = (float) r2
            android.graphics.Paint r13 = r0.b
            r8.drawRect(r9, r10, r11, r12, r13)
            int r2 = android.graphics.Color.argb(r5, r6, r6, r6)
            r8.drawColor(r2)
            android.graphics.Paint r2 = r0.b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint r2 = r0.b
            r3 = -1
            r2.setColor(r3)
            int r2 = r1.left
            float r15 = (float) r2
            int r2 = r1.top
            float r2 = (float) r2
            int r3 = r1.right
            int r3 = r3 + (-1)
            float r3 = (float) r3
            int r1 = r1.bottom
            float r1 = (float) r1
            android.graphics.Paint r4 = r0.b
            r18 = r1
            r16 = r2
            r17 = r3
            r19 = r4
            r14 = r8
            r14.drawRect(r15, r16, r17, r18, r19)
            return
    }
}
