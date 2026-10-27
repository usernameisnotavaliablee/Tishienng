package com.github.mikephil.charting.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BarBuffer extends com.github.mikephil.charting.buffer.AbstractBuffer<com.github.mikephil.charting.interfaces.datasets.IBarDataSet> {
    protected float mBarWidth;
    protected boolean mContainsStacks;
    protected int mDataSetCount;
    protected int mDataSetIndex;
    protected boolean mInverted;

    public BarBuffer(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mDataSetIndex = r1
            r0.mInverted = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mBarWidth = r1
            r0.mDataSetCount = r2
            r0.mContainsStacks = r3
            return
    }

    protected void addBar(float r4, float r5, float r6, float r7) {
            r3 = this;
            float[] r0 = r3.buffer
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            r0[r1] = r4
            int r4 = r1 + 2
            r3.index = r4
            r0[r2] = r5
            int r5 = r1 + 3
            r3.index = r5
            r0[r4] = r6
            int r1 = r1 + 4
            r3.index = r1
            r0[r5] = r7
            return
    }

    /* renamed from: feed, reason: avoid collision after fix types in other method */
    public void feed2(com.github.mikephil.charting.interfaces.datasets.IBarDataSet r19) {
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
            if (r5 >= 0) goto Ld5
            r5 = r19
            com.github.mikephil.charting.data.Entry r6 = r5.getEntryForIndex(r4)
            com.github.mikephil.charting.data.BarEntry r6 = (com.github.mikephil.charting.data.BarEntry) r6
            if (r6 != 0) goto L22
            goto Ld1
        L22:
            float r7 = r6.getX()
            float r8 = r6.getY()
            float[] r9 = r6.getYVals()
            boolean r10 = r0.mContainsStacks
            r11 = 0
            if (r10 == 0) goto L9a
            if (r9 != 0) goto L37
            goto L9a
        L37:
            float r6 = r6.getNegativeSum()
            float r6 = -r6
            r8 = 0
            r10 = 0
        L3e:
            int r12 = r9.length
            if (r8 >= r12) goto Ld1
            r12 = r9[r8]
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 != 0) goto L53
            int r14 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r14 == 0) goto L4f
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 != 0) goto L53
        L4f:
            r13 = r12
            r12 = r6
            r6 = r13
            goto L65
        L53:
            if (r13 < 0) goto L5b
            float r12 = r12 + r10
            r13 = r12
            r12 = r6
            r6 = r10
            r10 = r13
            goto L65
        L5b:
            float r13 = java.lang.Math.abs(r12)
            float r13 = r13 + r6
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 + r6
        L65:
            float r14 = r7 - r2
            float r15 = r7 + r2
            boolean r3 = r0.mInverted
            if (r3 == 0) goto L7b
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 < 0) goto L73
            r3 = r6
            goto L74
        L73:
            r3 = r13
        L74:
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 > 0) goto L79
            goto L8d
        L79:
            r6 = r13
            goto L8d
        L7b:
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 < 0) goto L81
            r3 = r6
            goto L82
        L81:
            r3 = r13
        L82:
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 > 0) goto L87
            goto L88
        L87:
            r6 = r13
        L88:
            r17 = r6
            r6 = r3
            r3 = r17
        L8d:
            float r13 = r0.phaseY
            float r6 = r6 * r13
            float r3 = r3 * r13
            r0.addBar(r14, r6, r15, r3)
            int r8 = r8 + 1
            r6 = r12
            goto L3e
        L9a:
            float r3 = r7 - r2
            float r7 = r7 + r2
            boolean r6 = r0.mInverted
            if (r6 == 0) goto Laf
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 < 0) goto La7
            r6 = r8
            goto La8
        La7:
            r6 = 0
        La8:
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 > 0) goto Lad
            goto Lc1
        Lad:
            r8 = 0
            goto Lc1
        Laf:
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 < 0) goto Lb5
            r6 = r8
            goto Lb6
        Lb5:
            r6 = 0
        Lb6:
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 > 0) goto Lbb
            goto Lbc
        Lbb:
            r8 = 0
        Lbc:
            r17 = r8
            r8 = r6
            r6 = r17
        Lc1:
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 <= 0) goto Lca
            float r9 = r0.phaseY
            float r8 = r8 * r9
            goto Lce
        Lca:
            float r9 = r0.phaseY
            float r6 = r6 * r9
        Lce:
            r0.addBar(r3, r8, r7, r6)
        Ld1:
            int r4 = r4 + 1
            goto L11
        Ld5:
            r0.reset()
            return
    }

    @Override // com.github.mikephil.charting.buffer.AbstractBuffer
    public /* bridge */ /* synthetic */ void feed(com.github.mikephil.charting.interfaces.datasets.IBarDataSet r1) {
            r0 = this;
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r1
            r0.feed2(r1)
            return
    }

    public void setBarWidth(float r1) {
            r0 = this;
            r0.mBarWidth = r1
            return
    }

    public void setDataSet(int r1) {
            r0 = this;
            r0.mDataSetIndex = r1
            return
    }

    public void setInverted(boolean r1) {
            r0 = this;
            r0.mInverted = r1
            return
    }
}
