package com.github.mikephil.charting.renderer.scatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CrossShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    public CrossShapeRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas r8, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r9, com.github.mikephil.charting.utils.ViewPortHandler r10, float r11, float r12, android.graphics.Paint r13) {
            r7 = this;
            float r0 = r9.getScatterShapeSize()
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r0 / r1
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r13.setStyle(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r13.setStrokeWidth(r0)
            float r1 = r11 - r6
            float r3 = r11 + r6
            r4 = r12
            r0 = r8
            r2 = r12
            r5 = r13
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = r12 - r6
            float r4 = r12 + r6
            r3 = r11
            r1 = r11
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }
}
