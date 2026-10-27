package com.github.mikephil.charting.charts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ScatterChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.ScatterData> implements com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ScatterShape extends java.lang.Enum<com.github.mikephil.charting.charts.ScatterChart.ScatterShape> {
        private static final /* synthetic */ com.github.mikephil.charting.charts.ScatterChart.ScatterShape[] $VALUES = null;
        public static final com.github.mikephil.charting.charts.ScatterChart.ScatterShape CHEVRON_DOWN = null;
        public static final com.github.mikephil.charting.charts.ScatterChart.ScatterShape CHEVRON_UP = null;
        public static final com.github.mikephil.charting.charts.ScatterChart.ScatterShape CIRCLE = null;
        public static final com.github.mikephil.charting.charts.ScatterChart.ScatterShape CROSS = null;
        public static final com.github.mikephil.charting.charts.ScatterChart.ScatterShape SQUARE = null;
        public static final com.github.mikephil.charting.charts.ScatterChart.ScatterShape TRIANGLE = null;
        public static final com.github.mikephil.charting.charts.ScatterChart.ScatterShape X = null;
        private final java.lang.String shapeIdentifier;

        static {
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r0 = new com.github.mikephil.charting.charts.ScatterChart$ScatterShape
                java.lang.String r1 = "SQUARE"
                r2 = 0
                r0.<init>(r1, r2, r1)
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE = r0
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = new com.github.mikephil.charting.charts.ScatterChart$ScatterShape
                java.lang.String r3 = "CIRCLE"
                r4 = 1
                r1.<init>(r3, r4, r3)
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CIRCLE = r1
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r3 = new com.github.mikephil.charting.charts.ScatterChart$ScatterShape
                java.lang.String r5 = "TRIANGLE"
                r6 = 2
                r3.<init>(r5, r6, r5)
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE = r3
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r5 = new com.github.mikephil.charting.charts.ScatterChart$ScatterShape
                java.lang.String r7 = "CROSS"
                r8 = 3
                r5.<init>(r7, r8, r7)
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CROSS = r5
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r7 = new com.github.mikephil.charting.charts.ScatterChart$ScatterShape
                java.lang.String r9 = "X"
                r10 = 4
                r7.<init>(r9, r10, r9)
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.X = r7
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r9 = new com.github.mikephil.charting.charts.ScatterChart$ScatterShape
                java.lang.String r11 = "CHEVRON_UP"
                r12 = 5
                r9.<init>(r11, r12, r11)
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_UP = r9
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r11 = new com.github.mikephil.charting.charts.ScatterChart$ScatterShape
                java.lang.String r13 = "CHEVRON_DOWN"
                r14 = 6
                r11.<init>(r13, r14, r13)
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_DOWN = r11
                r13 = 7
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] r13 = new com.github.mikephil.charting.charts.ScatterChart.ScatterShape[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.github.mikephil.charting.charts.ScatterChart.ScatterShape.$VALUES = r13
                return
        }

        ScatterShape(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.shapeIdentifier = r3
                return
        }

        public static com.github.mikephil.charting.charts.ScatterChart.ScatterShape[] getAllDefaultShapes() {
                r0 = 7
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] r0 = new com.github.mikephil.charting.charts.ScatterChart.ScatterShape[r0]
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE
                r2 = 0
                r0[r2] = r1
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CIRCLE
                r2 = 1
                r0[r2] = r1
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE
                r2 = 2
                r0[r2] = r1
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CROSS
                r2 = 3
                r0[r2] = r1
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.X
                r2 = 4
                r0[r2] = r1
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_UP
                r2 = 5
                r0[r2] = r1
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_DOWN
                r2 = 6
                r0[r2] = r1
                return r0
        }

        public static com.github.mikephil.charting.charts.ScatterChart.ScatterShape valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.charts.ScatterChart$ScatterShape> r0 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = (com.github.mikephil.charting.charts.ScatterChart.ScatterShape) r1
                return r1
        }

        public static com.github.mikephil.charting.charts.ScatterChart.ScatterShape[] values() {
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] r0 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] r0 = (com.github.mikephil.charting.charts.ScatterChart.ScatterShape[]) r0
                return r0
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.shapeIdentifier
                return r0
        }
    }

    public ScatterChart(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ScatterChart(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ScatterChart(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public com.github.mikephil.charting.data.ScatterData getScatterData() {
            r1 = this;
            T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mData
            com.github.mikephil.charting.data.ScatterData r0 = (com.github.mikephil.charting.data.ScatterData) r0
            return r0
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
            r3 = this;
            super.init()
            com.github.mikephil.charting.renderer.ScatterChartRenderer r0 = new com.github.mikephil.charting.renderer.ScatterChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r1 = r3.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r3.mViewPortHandler
            r0.<init>(r3, r1, r2)
            r3.mRenderer = r0
            com.github.mikephil.charting.components.XAxis r0 = r3.getXAxis()
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setSpaceMin(r1)
            com.github.mikephil.charting.components.XAxis r0 = r3.getXAxis()
            r0.setSpaceMax(r1)
            return
    }
}
