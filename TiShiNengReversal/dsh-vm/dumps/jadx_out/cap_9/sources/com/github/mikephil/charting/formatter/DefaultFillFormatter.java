package com.github.mikephil.charting.formatter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DefaultFillFormatter implements com.github.mikephil.charting.formatter.IFillFormatter {
    public DefaultFillFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(com.github.mikephil.charting.interfaces.datasets.ILineDataSet r5, com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider r6) {
            r4 = this;
            float r0 = r6.getYChartMax()
            float r1 = r6.getYChartMin()
            com.github.mikephil.charting.data.LineData r6 = r6.getLineData()
            float r2 = r5.getYMax()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1e
            float r2 = r5.getYMin()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L1e
            return r3
        L1e:
            float r2 = r6.getYMax()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L27
            r0 = 0
        L27:
            float r6 = r6.getYMin()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L30
            r1 = 0
        L30:
            float r5 = r5.getYMin()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L39
            return r1
        L39:
            return r0
    }
}
