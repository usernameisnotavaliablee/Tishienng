package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CombinedChartRenderer extends com.github.mikephil.charting.renderer.DataRenderer {
    protected java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> mChart;
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> mHighlightBuffer;
    protected java.util.List<com.github.mikephil.charting.renderer.DataRenderer> mRenderers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.renderer.CombinedChartRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder = null;

        static {
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder = r0
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch: java.lang.NoSuchFieldError -> L28
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch: java.lang.NoSuchFieldError -> L33
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch: java.lang.NoSuchFieldError -> L3e
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public CombinedChartRenderer(com.github.mikephil.charting.charts.CombinedChart r1, com.github.mikephil.charting.animation.ChartAnimator r2, com.github.mikephil.charting.utils.ViewPortHandler r3) {
            r0 = this;
            r0.<init>(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 5
            r2.<init>(r3)
            r0.mRenderers = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mHighlightBuffer = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.mChart = r2
            r0.createRenderers()
            return
    }

    public void createRenderers() {
            r8 = this;
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r8.mRenderers
            r0.clear()
            java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> r0 = r8.mChart
            java.lang.Object r0 = r0.get()
            com.github.mikephil.charting.charts.CombinedChart r0 = (com.github.mikephil.charting.charts.CombinedChart) r0
            if (r0 != 0) goto L11
            goto L9f
        L11:
            com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r1 = r0.getDrawOrder()
            int r2 = r1.length
            r3 = 0
        L17:
            if (r3 >= r2) goto L9f
            r4 = r1[r3]
            int[] r5 = com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder
            int r4 = r4.ordinal()
            r4 = r5[r4]
            r5 = 1
            if (r4 == r5) goto L87
            r5 = 2
            if (r4 == r5) goto L72
            r5 = 3
            if (r4 == r5) goto L5d
            r5 = 4
            if (r4 == r5) goto L48
            r5 = 5
            if (r4 == r5) goto L33
            goto L9b
        L33:
            com.github.mikephil.charting.data.ScatterData r4 = r0.getScatterData()
            if (r4 == 0) goto L9b
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r4 = r8.mRenderers
            com.github.mikephil.charting.renderer.ScatterChartRenderer r5 = new com.github.mikephil.charting.renderer.ScatterChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r6 = r8.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r8.mViewPortHandler
            r5.<init>(r0, r6, r7)
            r4.add(r5)
            goto L9b
        L48:
            com.github.mikephil.charting.data.CandleData r4 = r0.getCandleData()
            if (r4 == 0) goto L9b
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r4 = r8.mRenderers
            com.github.mikephil.charting.renderer.CandleStickChartRenderer r5 = new com.github.mikephil.charting.renderer.CandleStickChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r6 = r8.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r8.mViewPortHandler
            r5.<init>(r0, r6, r7)
            r4.add(r5)
            goto L9b
        L5d:
            com.github.mikephil.charting.data.LineData r4 = r0.getLineData()
            if (r4 == 0) goto L9b
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r4 = r8.mRenderers
            com.github.mikephil.charting.renderer.LineChartRenderer r5 = new com.github.mikephil.charting.renderer.LineChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r6 = r8.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r8.mViewPortHandler
            r5.<init>(r0, r6, r7)
            r4.add(r5)
            goto L9b
        L72:
            com.github.mikephil.charting.data.BubbleData r4 = r0.getBubbleData()
            if (r4 == 0) goto L9b
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r4 = r8.mRenderers
            com.github.mikephil.charting.renderer.BubbleChartRenderer r5 = new com.github.mikephil.charting.renderer.BubbleChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r6 = r8.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r8.mViewPortHandler
            r5.<init>(r0, r6, r7)
            r4.add(r5)
            goto L9b
        L87:
            com.github.mikephil.charting.data.BarData r4 = r0.getBarData()
            if (r4 == 0) goto L9b
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r4 = r8.mRenderers
            com.github.mikephil.charting.renderer.BarChartRenderer r5 = new com.github.mikephil.charting.renderer.BarChartRenderer
            com.github.mikephil.charting.animation.ChartAnimator r6 = r8.mAnimator
            com.github.mikephil.charting.utils.ViewPortHandler r7 = r8.mViewPortHandler
            r5.<init>(r0, r6, r7)
            r4.add(r5)
        L9b:
            int r3 = r3 + 1
            goto L17
        L9f:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas r3) {
            r2 = this;
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r2.mRenderers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.renderer.DataRenderer r1 = (com.github.mikephil.charting.renderer.DataRenderer) r1
            r1.drawData(r3)
            goto L6
        L16:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas r3) {
            r2 = this;
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r2.mRenderers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.renderer.DataRenderer r1 = (com.github.mikephil.charting.renderer.DataRenderer) r1
            r1.drawExtras(r3)
            goto L6
        L16:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas r10, com.github.mikephil.charting.highlight.Highlight[] r11) {
            r9 = this;
            java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> r0 = r9.mChart
            java.lang.Object r0 = r0.get()
            com.github.mikephil.charting.charts.Chart r0 = (com.github.mikephil.charting.charts.Chart) r0
            if (r0 != 0) goto Lc
            goto Laa
        Lc:
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r1 = r9.mRenderers
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r1.next()
            com.github.mikephil.charting.renderer.DataRenderer r2 = (com.github.mikephil.charting.renderer.DataRenderer) r2
            boolean r3 = r2 instanceof com.github.mikephil.charting.renderer.BarChartRenderer
            if (r3 == 0) goto L2c
            r3 = r2
            com.github.mikephil.charting.renderer.BarChartRenderer r3 = (com.github.mikephil.charting.renderer.BarChartRenderer) r3
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r3 = r3.mChart
            com.github.mikephil.charting.data.BarData r3 = r3.getBarData()
            goto L65
        L2c:
            boolean r3 = r2 instanceof com.github.mikephil.charting.renderer.LineChartRenderer
            if (r3 == 0) goto L3a
            r3 = r2
            com.github.mikephil.charting.renderer.LineChartRenderer r3 = (com.github.mikephil.charting.renderer.LineChartRenderer) r3
            com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r3 = r3.mChart
            com.github.mikephil.charting.data.LineData r3 = r3.getLineData()
            goto L65
        L3a:
            boolean r3 = r2 instanceof com.github.mikephil.charting.renderer.CandleStickChartRenderer
            if (r3 == 0) goto L48
            r3 = r2
            com.github.mikephil.charting.renderer.CandleStickChartRenderer r3 = (com.github.mikephil.charting.renderer.CandleStickChartRenderer) r3
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r3 = r3.mChart
            com.github.mikephil.charting.data.CandleData r3 = r3.getCandleData()
            goto L65
        L48:
            boolean r3 = r2 instanceof com.github.mikephil.charting.renderer.ScatterChartRenderer
            if (r3 == 0) goto L56
            r3 = r2
            com.github.mikephil.charting.renderer.ScatterChartRenderer r3 = (com.github.mikephil.charting.renderer.ScatterChartRenderer) r3
            com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider r3 = r3.mChart
            com.github.mikephil.charting.data.ScatterData r3 = r3.getScatterData()
            goto L65
        L56:
            boolean r3 = r2 instanceof com.github.mikephil.charting.renderer.BubbleChartRenderer
            if (r3 == 0) goto L64
            r3 = r2
            com.github.mikephil.charting.renderer.BubbleChartRenderer r3 = (com.github.mikephil.charting.renderer.BubbleChartRenderer) r3
            com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider r3 = r3.mChart
            com.github.mikephil.charting.data.BubbleData r3 = r3.getBubbleData()
            goto L65
        L64:
            r3 = 0
        L65:
            r4 = -1
            if (r3 != 0) goto L6a
            r3 = -1
            goto L78
        L6a:
            com.github.mikephil.charting.data.ChartData r5 = r0.getData()
            com.github.mikephil.charting.data.CombinedData r5 = (com.github.mikephil.charting.data.CombinedData) r5
            java.util.List r5 = r5.getAllData()
            int r3 = r5.indexOf(r3)
        L78:
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r5 = r9.mHighlightBuffer
            r5.clear()
            int r5 = r11.length
            r6 = 0
        L7f:
            if (r6 >= r5) goto L97
            r7 = r11[r6]
            int r8 = r7.getDataIndex()
            if (r8 == r3) goto L8f
            int r8 = r7.getDataIndex()
            if (r8 != r4) goto L94
        L8f:
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r8 = r9.mHighlightBuffer
            r8.add(r7)
        L94:
            int r6 = r6 + 1
            goto L7f
        L97:
            java.util.List<com.github.mikephil.charting.highlight.Highlight> r3 = r9.mHighlightBuffer
            int r4 = r3.size()
            com.github.mikephil.charting.highlight.Highlight[] r4 = new com.github.mikephil.charting.highlight.Highlight[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            com.github.mikephil.charting.highlight.Highlight[] r3 = (com.github.mikephil.charting.highlight.Highlight[]) r3
            r2.drawHighlighted(r10, r3)
            goto L12
        Laa:
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas r1, java.lang.String r2, float r3, float r4, int r5) {
            r0 = this;
            return
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas r3) {
            r2 = this;
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r2.mRenderers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.renderer.DataRenderer r1 = (com.github.mikephil.charting.renderer.DataRenderer) r1
            r1.drawValues(r3)
            goto L6
        L16:
            return
    }

    public com.github.mikephil.charting.renderer.DataRenderer getSubRenderer(int r2) {
            r1 = this;
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r1.mRenderers
            int r0 = r0.size()
            if (r2 >= r0) goto L14
            if (r2 >= 0) goto Lb
            goto L14
        Lb:
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r1.mRenderers
            java.lang.Object r2 = r0.get(r2)
            com.github.mikephil.charting.renderer.DataRenderer r2 = (com.github.mikephil.charting.renderer.DataRenderer) r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    public java.util.List<com.github.mikephil.charting.renderer.DataRenderer> getSubRenderers() {
            r1 = this;
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r1.mRenderers
            return r0
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
            r2 = this;
            java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r0 = r2.mRenderers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.renderer.DataRenderer r1 = (com.github.mikephil.charting.renderer.DataRenderer) r1
            r1.initBuffers()
            goto L6
        L16:
            return
    }

    public void setSubRenderers(java.util.List<com.github.mikephil.charting.renderer.DataRenderer> r1) {
            r0 = this;
            r0.mRenderers = r1
            return
    }
}
