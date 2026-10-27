package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CityExpandView extends android.widget.ExpandableListView {
    public CityExpandView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CityExpandView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r0, r0)
            r1.setLayoutParams(r2)
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            java.lang.System.currentTimeMillis()
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            java.lang.System.currentTimeMillis()
            return
    }
}
