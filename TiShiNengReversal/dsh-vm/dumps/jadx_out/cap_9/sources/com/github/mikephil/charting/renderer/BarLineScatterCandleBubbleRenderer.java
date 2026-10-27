package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class BarLineScatterCandleBubbleRenderer extends com.github.mikephil.charting.renderer.DataRenderer {
    protected com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds mXBounds;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected class XBounds {
        public int max;
        public int min;
        public int range;
        final /* synthetic */ com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer this$0;

        protected XBounds(com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void set(com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider r5, com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet r6) {
                r4 = this;
                com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer r0 = r4.this$0
                com.github.mikephil.charting.animation.ChartAnimator r0 = r0.mAnimator
                float r0 = r0.getPhaseX()
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = java.lang.Math.min(r1, r0)
                r1 = 0
                float r0 = java.lang.Math.max(r1, r0)
                float r1 = r5.getLowestVisibleX()
                float r5 = r5.getHighestVisibleX()
                com.github.mikephil.charting.data.DataSet$Rounding r2 = com.github.mikephil.charting.data.DataSet.Rounding.DOWN
                r3 = 2143289344(0x7fc00000, float:NaN)
                com.github.mikephil.charting.data.Entry r1 = r6.getEntryForXValue(r1, r3, r2)
                com.github.mikephil.charting.data.DataSet$Rounding r2 = com.github.mikephil.charting.data.DataSet.Rounding.UP
                com.github.mikephil.charting.data.Entry r5 = r6.getEntryForXValue(r5, r3, r2)
                r2 = 0
                if (r1 != 0) goto L2e
                r1 = 0
                goto L32
            L2e:
                int r1 = r6.getEntryIndex(r1)
            L32:
                r4.min = r1
                if (r5 != 0) goto L37
                goto L3b
            L37:
                int r2 = r6.getEntryIndex(r5)
            L3b:
                r4.max = r2
                int r5 = r4.min
                int r2 = r2 - r5
                float r5 = (float) r2
                float r5 = r5 * r0
                int r5 = (int) r5
                r4.range = r5
                return
        }
    }

    public BarLineScatterCandleBubbleRenderer(com.github.mikephil.charting.animation.ChartAnimator r1, com.github.mikephil.charting.utils.ViewPortHandler r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r1 = new com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds
            r1.<init>(r0)
            r0.mXBounds = r1
            return
    }

    protected boolean isInBoundsX(com.github.mikephil.charting.data.Entry r3, com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet r4) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r3 = r4.getEntryIndex(r3)
            float r3 = (float) r3
            int r4 = r4.getEntryCount()
            float r4 = (float) r4
            com.github.mikephil.charting.animation.ChartAnimator r1 = r2.mAnimator
            float r1 = r1.getPhaseX()
            float r4 = r4 * r1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L1b
            return r0
        L1b:
            r3 = 1
            return r3
    }

    protected boolean shouldDrawValues(com.github.mikephil.charting.interfaces.datasets.IDataSet r2) {
            r1 = this;
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L14
            boolean r0 = r2.isDrawValuesEnabled()
            if (r0 != 0) goto L12
            boolean r2 = r2.isDrawIconsEnabled()
            if (r2 == 0) goto L14
        L12:
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }
}
