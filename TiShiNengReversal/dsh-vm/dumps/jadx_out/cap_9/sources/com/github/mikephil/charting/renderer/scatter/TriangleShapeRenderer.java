package com.github.mikephil.charting.renderer.scatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TriangleShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    protected android.graphics.Path mTrianglePathBuffer;

    public TriangleShapeRenderer() {
            r1 = this;
            r1.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.mTrianglePathBuffer = r0
            return
    }

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas r10, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r11, com.github.mikephil.charting.utils.ViewPortHandler r12, float r13, float r14, android.graphics.Paint r15) {
            r9 = this;
            float r12 = r11.getScatterShapeSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r12 / r0
            float r2 = r11.getScatterShapeHoleRadius()
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r2 = r2 * r0
            float r2 = r12 - r2
            float r2 = r2 / r0
            int r11 = r11.getScatterShapeHoleColor()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r15.setStyle(r0)
            android.graphics.Path r0 = r9.mTrianglePathBuffer
            r0.reset()
            float r3 = r14 - r1
            r0.moveTo(r13, r3)
            float r4 = r13 + r1
            float r14 = r14 + r1
            r0.lineTo(r4, r14)
            float r1 = r13 - r1
            r0.lineTo(r1, r14)
            double r5 = (double) r12
            r7 = 0
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L51
            r0.lineTo(r13, r3)
            float r5 = r1 + r2
            float r6 = r14 - r2
            r0.moveTo(r5, r6)
            float r7 = r4 - r2
            r0.lineTo(r7, r6)
            float r7 = r3 + r2
            r0.lineTo(r13, r7)
            r0.lineTo(r5, r6)
        L51:
            r0.close()
            r10.drawPath(r0, r15)
            r0.reset()
            if (r12 <= 0) goto L7a
            r12 = 1122867(0x112233, float:1.573472E-39)
            if (r11 == r12) goto L7a
            r15.setColor(r11)
            float r3 = r3 + r2
            r0.moveTo(r13, r3)
            float r4 = r4 - r2
            float r14 = r14 - r2
            r0.lineTo(r4, r14)
            float r1 = r1 + r2
            r0.lineTo(r1, r14)
            r0.close()
            r10.drawPath(r0, r15)
            r0.reset()
        L7a:
            return
    }
}
