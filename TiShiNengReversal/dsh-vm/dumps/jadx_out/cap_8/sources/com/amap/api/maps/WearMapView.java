package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(20)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WearMapView extends android.view.ViewGroup implements com.amap.api.maps.BaseMapView {
    private static int pointX;
    private static int pointY;
    private final java.lang.String TAG;
    private com.amap.api.maps.AMap aMap;
    private android.view.View mMapView;
    private com.amap.api.maps.SwipeDismissView mSwipeDismissView;
    private com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate mapFragmentDelegate;
    private int visibility;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnDismissCallback {
        void onDismiss();

        void onNotifySwipe();
    }

    static {
            return
    }

    public WearMapView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.Class<com.amap.api.maps.WearMapView> r0 = com.amap.api.maps.WearMapView.class
            java.lang.String r0 = r0.getSimpleName()
            r1.TAG = r0
            r0 = 0
            r1.visibility = r0
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()
            r0.setContext(r2)
            a(r2)
            r1.b(r2)
            return
    }

    public WearMapView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            java.lang.Class<com.amap.api.maps.WearMapView> r0 = com.amap.api.maps.WearMapView.class
            java.lang.String r0 = r0.getSimpleName()
            r2.TAG = r0
            r0 = 0
            r2.visibility = r0
            r1 = 16842972(0x10100dc, float:2.3694175E-38)
            int r4 = r4.getAttributeIntValue(r1, r0)
            r2.visibility = r4
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r4 = r2.getMapFragmentDelegate()
            r4.setContext(r3)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r4 = r2.getMapFragmentDelegate()
            int r0 = r2.visibility
            r4.setVisibility(r0)
            a(r3)
            r2.b(r3)
            return
    }

    public WearMapView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            java.lang.Class<com.amap.api.maps.WearMapView> r4 = com.amap.api.maps.WearMapView.class
            java.lang.String r4 = r4.getSimpleName()
            r1.TAG = r4
            r4 = 0
            r1.visibility = r4
            r0 = 16842972(0x10100dc, float:2.3694175E-38)
            int r3 = r3.getAttributeIntValue(r0, r4)
            r1.visibility = r3
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r3 = r1.getMapFragmentDelegate()
            r3.setContext(r2)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r3 = r1.getMapFragmentDelegate()
            int r4 = r1.visibility
            r3.setVisibility(r4)
            a(r2)
            r1.b(r2)
            return
    }

    public WearMapView(android.content.Context r2, com.amap.api.maps.AMapOptions r3) {
            r1 = this;
            r1.<init>(r2)
            java.lang.Class<com.amap.api.maps.WearMapView> r0 = com.amap.api.maps.WearMapView.class
            java.lang.String r0 = r0.getSimpleName()
            r1.TAG = r0
            r0 = 0
            r1.visibility = r0
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()
            r0.setContext(r2)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()
            r0.setOptions(r3)
            a(r2)
            r1.b(r2)
            return
    }

    private static void a(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            if (r1 == 0) goto L20
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            if (r1 == 0) goto L18
            r1.getSize(r0)
        L18:
            int r1 = r0.x
            com.amap.api.maps.WearMapView.pointX = r1
            int r1 = r0.y
            com.amap.api.maps.WearMapView.pointY = r1
        L20:
            return
    }

    private static void a(android.view.View r4) {
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 != 0) goto Lc
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
        Lc:
            int r1 = r0.width
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            if (r1 <= 0) goto L18
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            goto L1c
        L18:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
        L1c:
            int r0 = r0.height
            if (r0 <= 0) goto L25
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            goto L29
        L25:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
        L29:
            r4.measure(r1, r0)
            return
    }

    private void b(android.content.Context r4) {
            r3 = this;
            com.amap.api.maps.SwipeDismissView r0 = new com.amap.api.maps.SwipeDismissView
            r0.<init>(r4, r3)
            r3.mSwipeDismissView = r0
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r0 = 1106247680(0x41f00000, float:30.0)
            float r4 = r4 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            int r1 = com.amap.api.maps.WearMapView.pointY
            r0.<init>(r4, r1)
            com.amap.api.maps.SwipeDismissView r4 = r3.mSwipeDismissView
            r1 = 0
            int r2 = android.graphics.Color.argb(r1, r1, r1, r1)
            r4.setBackgroundColor(r2)
            int r4 = android.graphics.Color.argb(r1, r1, r1, r1)
            r3.setBackgroundColor(r4)
            com.amap.api.maps.SwipeDismissView r4 = r3.mSwipeDismissView
            r3.addView(r4, r0)
            return
    }

    public com.amap.api.maps.AMap getMap() {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.getMapFragmentDelegate()
            r1 = 0
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r0.getMap()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.amap.api.maps.AMap r1 = r2.aMap
            if (r1 != 0) goto L17
            com.amap.api.maps.AMap r1 = new com.amap.api.maps.AMap
            r1.<init>(r0)
            r2.aMap = r1
        L17:
            com.amap.api.maps.AMap r0 = r2.aMap
            return r0
        L1a:
            return r1
    }

    protected com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate getMapFragmentDelegate() {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.mapFragmentDelegate
            if (r0 != 0) goto Le
            if (r0 != 0) goto Le
            com.amap.api.col.3l.d r0 = new com.amap.api.col.3l.d
            r1 = 1
            r0.<init>(r1)
            r2.mapFragmentDelegate = r0
        Le:
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.mapFragmentDelegate
            return r0
    }

    @Override // com.amap.api.maps.BaseMapView
    public void loadWorldVectorMap(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.loadWorldVectorMap(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r2.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L17
            r1 = 0
            android.view.View r3 = r0.onCreateView(r1, r1, r3)     // Catch: java.lang.Throwable -> L17
            r2.mMapView = r3     // Catch: java.lang.Throwable -> L17
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L17
            r0 = -1
            r3.<init>(r0, r0)     // Catch: java.lang.Throwable -> L17
            android.view.View r0 = r2.mMapView     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r2.addView(r0, r1, r3)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public final void onDestroy() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onDestroy()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void onDismiss() {
            r0 = this;
            r0.removeAllViews()
            return
    }

    public void onEnterAmbient(android.os.Bundle r1) {
            r0 = this;
            r0.onResume()
            return
    }

    public void onExitAmbient() {
            r0 = this;
            r0.onPause()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r3 = r2.getChildCount()
            r4 = 0
            r5 = 0
        L6:
            if (r5 >= r3) goto L31
            android.view.View r7 = r2.getChildAt(r5)
            android.view.View r0 = r2.mMapView
            if (r7 != r0) goto L1c
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            r7.layout(r4, r4, r0, r1)
            goto L2e
        L1c:
            com.amap.api.maps.SwipeDismissView r0 = r2.mSwipeDismissView
            if (r7 != r0) goto L2e
            a(r0)
            com.amap.api.maps.SwipeDismissView r7 = r2.mSwipeDismissView
            int r7 = r7.getMeasuredWidth()
            com.amap.api.maps.SwipeDismissView r0 = r2.mSwipeDismissView
            r0.layout(r4, r4, r7, r6)
        L2e:
            int r5 = r5 + 1
            goto L6
        L31:
            return
    }

    public final void onLowMemory() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onLowMemory()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L28
            android.view.View r2 = r5.getChildAt(r1)
            boolean r3 = r2 instanceof com.amap.api.maps.SwipeDismissView
            if (r3 == 0) goto L22
            r3 = r2
            com.amap.api.maps.SwipeDismissView r3 = (com.amap.api.maps.SwipeDismissView) r3
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            int r4 = r4.width
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r3 = r3.height
            r2.measure(r4, r3)
            goto L25
        L22:
            r2.measure(r6, r7)
        L25:
            int r1 = r1 + 1
            goto L5
        L28:
            super.onMeasure(r6, r7)
            return
    }

    public final void onPause() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onPause()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public final void onResume() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onResume()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public final void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()     // Catch: java.lang.Throwable -> L7
            r0.onSaveInstanceState(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // android.view.View
    public void setLayerType(int r1, android.graphics.Paint r2) {
            r0 = this;
            return
    }

    public void setOnDismissCallbackListener(com.amap.api.maps.WearMapView.OnDismissCallback r2) {
            r1 = this;
            com.amap.api.maps.SwipeDismissView r0 = r1.mSwipeDismissView
            if (r0 == 0) goto L7
            r0.setCallback(r2)
        L7:
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate r0 = r1.getMapFragmentDelegate()
            r0.setVisibility(r2)
            return
    }
}
