package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SwipeDismissView extends android.widget.RelativeLayout {
    protected com.amap.api.maps.WearMapView.OnDismissCallback onDismissCallback;

    public SwipeDismissView(android.content.Context r1, android.util.AttributeSet r2, int r3, android.view.View r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.onDismissCallback = r1
            r0.setOnTouchListener(r4)
            return
    }

    public SwipeDismissView(android.content.Context r1, android.util.AttributeSet r2, android.view.View r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.onDismissCallback = r1
            r0.setOnTouchListener(r3)
            return
    }

    public SwipeDismissView(android.content.Context r1, android.view.View r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.onDismissCallback = r1
            r0.setOnTouchListener(r2)
            return
    }

    public void setCallback(com.amap.api.maps.WearMapView.OnDismissCallback r1) {
            r0 = this;
            r0.onDismissCallback = r1
            return
    }

    protected void setOnTouchListener(android.view.View r4) {
            r3 = this;
            com.amap.api.maps.SwipeDismissTouchListener r0 = new com.amap.api.maps.SwipeDismissTouchListener
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            com.amap.api.maps.SwipeDismissCallBack r2 = new com.amap.api.maps.SwipeDismissCallBack
            r2.<init>(r3)
            r0.<init>(r4, r1, r2)
            r3.setOnTouchListener(r0)
            return
    }
}
