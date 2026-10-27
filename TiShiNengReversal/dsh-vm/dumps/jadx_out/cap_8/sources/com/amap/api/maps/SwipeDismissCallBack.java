package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SwipeDismissCallBack implements com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks {
    com.amap.api.maps.SwipeDismissView a;

    public SwipeDismissCallBack(com.amap.api.maps.SwipeDismissView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public boolean canDismiss(java.lang.Object r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onDismiss(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            com.amap.api.maps.SwipeDismissView r1 = r0.a
            com.amap.api.maps.WearMapView$OnDismissCallback r1 = r1.onDismissCallback
            if (r1 == 0) goto L9
            r1.onDismiss()
        L9:
            return
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onNotifySwipe() {
            r1 = this;
            com.amap.api.maps.SwipeDismissView r0 = r1.a
            com.amap.api.maps.WearMapView$OnDismissCallback r0 = r0.onDismissCallback
            if (r0 == 0) goto L9
            r0.onNotifySwipe()
        L9:
            return
    }
}
