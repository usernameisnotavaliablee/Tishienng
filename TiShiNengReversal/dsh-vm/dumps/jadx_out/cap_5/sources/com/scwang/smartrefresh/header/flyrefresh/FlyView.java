package com.scwang.smartrefresh.header.flyrefresh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FlyView extends com.scwang.smartrefresh.layout.internal.pathview.PathsView {
    public FlyView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r1 = 0
            r2.a(r3, r0, r1)
            return
    }

    public FlyView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.a(r2, r3, r0)
            return
    }

    public FlyView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.a(r1, r2, r3)
            return
    }

    private void a(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r1 = -1
            int[] r1 = new int[]{r1}
            r0.b(r1)
            java.lang.String r1 = "M2.01,21L23,12 2.01,3 2,10l15,2 -15,2z"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.c(r1)
            r1 = 1103626240(0x41c80000, float:25.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r1)
            r0.setMinimumWidth(r2)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            r0.setMinimumHeight(r1)
            return
    }

    @Override // com.scwang.smartrefresh.layout.internal.pathview.PathsView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = android.view.View.resolveSize(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }
}
