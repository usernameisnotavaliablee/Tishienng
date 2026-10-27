package com.github.mikephil.charting.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class HorizontalBarBuffer extends com.github.mikephil.charting.buffer.BarBuffer {
    public HorizontalBarBuffer(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.github.mikephil.charting.buffer.BarBuffer
    public void feed(com.github.mikephil.charting.interfaces.datasets.IBarDataSet r19) {
            r18 = this;
            r0 = r18
            int r1 = r19.getEntryCount()
            float r1 = (float) r1
            float r2 = r0.phaseX
            float r1 = r1 * r2
            float r2 = r0.mBarWidth
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r4 = 0
        L11:
            float r5 = (float) r4
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto Lc7
            r5 = r19
            com.github.mikephil.charting.data.Entry r6 = r5.getEntryForIndex(r4)
            com.github.mikephil.charting.data.BarEntry r6 = (com.github.mikephil.charting.data.BarEntry) r6
            if (r6 != 0) goto L22
            goto Lc3
        L22:
            float r7 = r6.getX()
            float r8 = r6.getY()
            float[] r9 = r6.getYVals()
            boolean r10 = r0.mContainsStacks
            r11 = 0
            if (r10 == 0) goto L8c
            if (r9 != 0) goto L37
            goto L8c
        L37:
            float r6 = r6.getNegativeSum()
            float r6 = -r6
            r8 = 0
            r10 = 0
        L3e:
            int r12 = r9.length
            if (r8 >= r12) goto Lc3
            r12 = r9[r8]
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 < 0) goto L4d
            float r12 = r12 + r10
            r13 = r12
            r12 = r6
            r6 = r10
            r10 = r13
            goto L57
        L4d:
            float r13 = java.lang.Math.abs(r12)
            float r13 = r13 + r6
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 + r6
        L57:
            float r14 = r7 - r2
            float r15 = r7 + r2
            boolean r3 = r0.mInverted
            if (r3 == 0) goto L6d
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 < 0) goto L65
            r3 = r6
            goto L66
        L65:
            r3 = r13
        L66:
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 > 0) goto L6b
            goto L7f
        L6b:
            r6 = r13
            goto L7f
        L6d:
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 < 0) goto L73
            r3 = r6
            goto L74
        L73:
            r3 = r13
        L74:
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 > 0) goto L79
            goto L7a
        L79:
            r6 = r13
        L7a:
            r17 = r6
            r6 = r3
            r3 = r17
        L7f:
            float r13 = r0.phaseY
            float r6 = r6 * r13
            float r3 = r3 * r13
            r0.addBar(r3, r15, r6, r14)
            int r8 = r8 + 1
            r6 = r12
            goto L3e
        L8c:
            float r3 = r7 - r2
            float r7 = r7 + r2
            boolean r6 = r0.mInverted
            if (r6 == 0) goto La1
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 < 0) goto L99
            r6 = r8
            goto L9a
        L99:
            r6 = 0
        L9a:
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 > 0) goto L9f
            goto Lb3
        L9f:
            r8 = 0
            goto Lb3
        La1:
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 < 0) goto La7
            r6 = r8
            goto La8
        La7:
            r6 = 0
        La8:
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 > 0) goto Lad
            goto Lae
        Lad:
            r8 = 0
        Lae:
            r17 = r8
            r8 = r6
            r6 = r17
        Lb3:
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 <= 0) goto Lbc
            float r9 = r0.phaseY
            float r8 = r8 * r9
            goto Lc0
        Lbc:
            float r9 = r0.phaseY
            float r6 = r6 * r9
        Lc0:
            r0.addBar(r6, r7, r8, r3)
        Lc3:
            int r4 = r4 + 1
            goto L11
        Lc7:
            r0.reset()
            return
    }

    @Override // com.github.mikephil.charting.buffer.BarBuffer, com.github.mikephil.charting.buffer.AbstractBuffer
    public /* bridge */ /* synthetic */ void feed(com.github.mikephil.charting.interfaces.datasets.IBarDataSet r1) {
            r0 = this;
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r1
            r0.feed(r1)
            return
    }
}
