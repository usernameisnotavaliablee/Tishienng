package com.github.mikephil.charting.renderer.scatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ChevronUpShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    public ChevronUpShapeRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas r7, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet r8, com.github.mikephil.charting.utils.ViewPortHandler r9, float r10, float r11, android.graphics.Paint r12) {
            r6 = this;
            float r8 = r8.getScatterShapeSize()
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r12.setStyle(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r12.setStrokeWidth(r0)
            float r8 = r8 * r9
            float r2 = r11 - r8
            float r3 = r10 + r8
            r0 = r7
            r1 = r10
            r4 = r11
            r5 = r12
            r0.drawLine(r1, r2, r3, r4, r5)
            float r3 = r1 - r8
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }
}
