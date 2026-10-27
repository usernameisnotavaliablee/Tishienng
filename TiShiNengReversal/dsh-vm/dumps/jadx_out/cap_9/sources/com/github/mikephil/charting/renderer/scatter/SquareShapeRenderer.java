package com.github.mikephil.charting.renderer.scatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SquareShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    public SquareShapeRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas r11, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r12, com.github.mikephil.charting.utils.ViewPortHandler r13, float r14, float r15, android.graphics.Paint r16) {
            r10 = this;
            r5 = r16
            float r13 = r12.getScatterShapeSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r13 / r0
            float r2 = r12.getScatterShapeHoleRadius()
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r3 = r2 * r0
            float r3 = r13 - r3
            float r3 = r3 / r0
            float r0 = r3 / r0
            int r12 = r12.getScatterShapeHoleColor()
            double r6 = (double) r13
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L57
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r13)
            r5.setStrokeWidth(r3)
            float r13 = r14 - r2
            float r1 = r13 - r0
            float r6 = r15 - r2
            r3 = r2
            float r2 = r6 - r0
            float r14 = r14 + r3
            r4 = r3
            float r3 = r14 + r0
            float r7 = r15 + r4
            float r4 = r7 + r0
            r0 = r11
            r0.drawRect(r1, r2, r3, r4, r5)
            r0 = 1122867(0x112233, float:1.573472E-39)
            if (r12 == r0) goto L56
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r5.setStyle(r0)
            r5.setColor(r12)
            r0 = r11
            r1 = r13
            r3 = r14
            r2 = r6
            r4 = r7
            r0.drawRect(r1, r2, r3, r4, r5)
        L56:
            return
        L57:
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.FILL
            r5.setStyle(r12)
            r13 = r1
            float r1 = r14 - r13
            float r2 = r15 - r13
            float r3 = r14 + r13
            float r4 = r15 + r13
            r0 = r11
            r0.drawRect(r1, r2, r3, r4, r5)
            return
    }
}
