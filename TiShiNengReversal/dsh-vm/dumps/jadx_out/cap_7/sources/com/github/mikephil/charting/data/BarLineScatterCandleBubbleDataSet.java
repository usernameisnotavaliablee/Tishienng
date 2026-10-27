package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class BarLineScatterCandleBubbleDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.DataSet<T> implements com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<T> {
    protected int mHighLightColor;

    public BarLineScatterCandleBubbleDataSet(java.util.List<T> r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 187(0xbb, float:2.62E-43)
            r3 = 115(0x73, float:1.61E-43)
            r0 = 255(0xff, float:3.57E-43)
            int r2 = android.graphics.Color.rgb(r0, r2, r3)
            r1.mHighLightColor = r2
            return
    }

    protected void copy(com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet r2) {
            r1 = this;
            super.copy(r2)
            int r0 = r1.mHighLightColor
            r2.mHighLightColor = r0
            return
    }

    public int getHighLightColor() {
            r1 = this;
            int r0 = r1.mHighLightColor
            return r0
    }

    public void setHighLightColor(int r1) {
            r0 = this;
            r0.mHighLightColor = r1
            return
    }
}
