package com.github.mikephil.charting.renderer.scatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CircleShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    public CircleShapeRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas r9, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r10, com.github.mikephil.charting.utils.ViewPortHandler r11, float r12, float r13, android.graphics.Paint r14) {
            r8 = this;
            float r11 = r10.getScatterShapeSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r11 / r0
            float r2 = r10.getScatterShapeHoleRadius()
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r3 = r2 * r0
            float r3 = r11 - r3
            float r3 = r3 / r0
            float r0 = r3 / r0
            int r10 = r10.getScatterShapeHoleColor()
            double r4 = (double) r11
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L3f
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r14.setStyle(r11)
            r14.setStrokeWidth(r3)
            float r0 = r0 + r2
            r9.drawCircle(r12, r13, r0, r14)
            r11 = 1122867(0x112233, float:1.573472E-39)
            if (r10 == r11) goto L3e
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
            r14.setStyle(r11)
            r14.setColor(r10)
            r9.drawCircle(r12, r13, r2, r14)
        L3e:
            return
        L3f:
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r14.setStyle(r10)
            r9.drawCircle(r12, r13, r1, r14)
            return
    }
}
