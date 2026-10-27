package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AMap {
    public static final java.lang.String CHINESE = "zh_cn";
    private static final java.lang.String CLASSNAME = "AMap";
    public static final java.lang.String CUSTOM = "custom";
    public static final java.lang.String ENGLISH = "en";
    public static final java.lang.String LOCAL = "local";
    public static final int LOCATION_TYPE_LOCATE = 1;
    public static final int LOCATION_TYPE_MAP_FOLLOW = 2;
    public static final int LOCATION_TYPE_MAP_ROTATE = 3;
    public static final int MAP_TYPE_BUS = 5;
    public static final int MAP_TYPE_NAVI = 4;
    public static final int MAP_TYPE_NAVI_NIGHT = 6;
    public static final int MAP_TYPE_NIGHT = 3;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MASK_LAYER_NONE = -1;
    public static final int MASK_LAYER_UNDER_LINE = 1;
    public static final int MASK_LAYER_UNDER_MARKER = 0;
    public static final java.lang.String STYLE_CHINESE = "style_zh_cn";
    private final com.autonavi.amap.mapcore.interfaces.IAMap mapDelegate;
    private com.amap.api.maps.model.MyTrafficStyle myTrafficStyle;
    private com.amap.api.maps.Projection projection;
    private com.amap.api.maps.UiSettings uiSettings;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.maps.AMap$2, reason: invalid class name */
    final class AnonymousClass2 implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.maps.AMap.OnMapSnapshotListener a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.maps.AMap.b f4971b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f4972c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.amap.api.maps.AMap f4973d;




        AnonymousClass2(com.amap.api.maps.AMap r1, com.amap.api.maps.AMap.OnMapSnapshotListener r2, com.amap.api.maps.AMap.b r3, java.lang.Runnable r4) {
                r0 = this;
                r0.f4973d = r1
                r0.a = r2
                r0.f4971b = r3
                r0.f4972c = r4
                r0.<init>()
                return
        }

        private android.view.ViewGroup a() {
                r4 = this;
                com.amap.api.maps.AMap r0 = r4.f4973d
                com.autonavi.amap.mapcore.interfaces.IAMap r0 = com.amap.api.maps.AMap.a(r0)
                boolean r0 = r0 instanceof com.amap.api.col.p0003l.r9
                if (r0 == 0) goto L3e
                com.amap.api.maps.AMap r0 = r4.f4973d
                com.autonavi.amap.mapcore.interfaces.IAMap r0 = com.amap.api.maps.AMap.a(r0)
                com.amap.api.col.3l.r9 r0 = (com.amap.api.col.p0003l.r9) r0
                android.view.View r0 = r0.getGLMapView()
                android.view.ViewParent r0 = r0.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.widget.FrameLayout r1 = new android.widget.FrameLayout
                android.content.Context r2 = r0.getContext()
                r1.<init>(r2)
                r2 = -1
                r1.setBackgroundColor(r2)
                android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
                r3.<init>(r2, r2)
                r1.setLayoutParams(r3)
                int r2 = r0.getWidth()
                int r2 = r2 / 20
                r1.setPadding(r2, r2, r2, r2)
                r0.addView(r1)
                return r1
            L3e:
                r0 = 0
                return r0
        }

        private void a(android.view.ViewGroup r9, java.lang.Runnable r10) {
                r8 = this;
                android.view.ViewParent r0 = r9.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 1045220557(0x3e4ccccd, float:0.2)
                r1.<init>(r2, r3, r2, r3)
                android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
                int r3 = r0.getWidth()
                double r3 = (double) r3
                r5 = 4587366580439587226(0x3fa999999999999a, double:0.05)
                double r3 = r3 * r5
                float r3 = (float) r3
                int r0 = r0.getHeight()
                double r4 = (double) r0
                r6 = 4604930618986332160(0x3fe8000000000000, double:0.75)
                double r4 = r4 * r6
                float r0 = (float) r4
                r4 = 0
                r2.<init>(r4, r3, r4, r0)
                android.view.animation.AnimationSet r0 = new android.view.animation.AnimationSet
                r3 = 1
                r0.<init>(r3)
                r0.addAnimation(r1)
                r0.addAnimation(r2)
                r1 = 600(0x258, double:2.964E-321)
                r0.setDuration(r1)
                r0.setFillAfter(r3)
                android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
                r1.<init>()
                r0.setInterpolator(r1)
                r9.startAnimation(r0)
                com.amap.api.maps.AMap$2$1 r9 = new com.amap.api.maps.AMap$2$1
                r9.<init>(r8, r10)
                r0.setAnimationListener(r9)
                return
        }

        final void a(android.view.ViewGroup r10, android.graphics.Bitmap r11) {
                r9 = this;
                android.widget.ImageView r0 = new android.widget.ImageView
                android.content.Context r1 = r10.getContext()
                r0.<init>(r1)
                r0.setImageBitmap(r11)
                android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER_CROP
                r0.setScaleType(r11)
                android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
                r1 = -1
                r11.<init>(r1, r1)
                r0.setLayoutParams(r11)
                r10.addView(r0)
                android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation
                r0 = 1045220557(0x3e4ccccd, float:0.2)
                r11.<init>(r0, r0, r0, r0)
                android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
                int r1 = r10.getWidth()
                double r1 = (double) r1
                r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
                double r1 = r1 * r3
                float r1 = (float) r1
                int r2 = r10.getWidth()
                double r2 = (double) r2
                r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r2 = r2 * r4
                float r2 = (float) r2
                float r2 = -r2
                int r3 = r10.getHeight()
                double r3 = (double) r3
                r5 = 4604930618986332160(0x3fe8000000000000, double:0.75)
                double r3 = r3 * r5
                float r3 = (float) r3
                int r4 = r10.getHeight()
                double r7 = (double) r4
                double r7 = r7 * r5
                float r4 = (float) r7
                r0.<init>(r1, r2, r3, r4)
                android.view.animation.AnimationSet r1 = new android.view.animation.AnimationSet
                r2 = 1
                r1.<init>(r2)
                r1.addAnimation(r11)
                r1.addAnimation(r0)
                r3 = 1500(0x5dc, double:7.41E-321)
                r1.setStartOffset(r3)
                r3 = 200(0xc8, double:9.9E-322)
                r1.setDuration(r3)
                r1.setFillBefore(r2)
                r1.setFillAfter(r2)
                android.view.animation.AccelerateInterpolator r11 = new android.view.animation.AccelerateInterpolator
                r11.<init>()
                r1.setInterpolator(r11)
                r10.startAnimation(r1)
                com.amap.api.maps.AMap$2$2 r11 = new com.amap.api.maps.AMap$2$2
                r11.<init>(r9, r10)
                r1.setAnimationListener(r11)
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                android.view.ViewGroup r0 = r2.a()
                com.amap.api.maps.AMap$2$3 r1 = new com.amap.api.maps.AMap$2$3
                r1.<init>(r2, r0)
                r2.a(r0, r1)
                return
        }
    }


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AMapAppResourceRequestListener {
        void onRequest(com.autonavi.base.ae.gmap.AMapAppRequestParam r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CommonInfoWindowAdapter {
        com.amap.api.maps.InfoWindowParams getInfoWindowParams(com.amap.api.maps.model.BasePointOverlay r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ImageInfoWindowAdapter extends com.amap.api.maps.AMap.InfoWindowAdapter {
        long getInfoWindowUpdateTime();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface InfoWindowAdapter {
        android.view.View getInfoContents(com.amap.api.maps.model.Marker r1);

        android.view.View getInfoWindow(com.amap.api.maps.model.Marker r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface MultiPositionInfoWindowAdapter extends com.amap.api.maps.AMap.InfoWindowAdapter {
        android.view.View getInfoWindowClick(com.amap.api.maps.model.Marker r1);

        android.view.View getOverturnInfoWindow(com.amap.api.maps.model.Marker r1);

        android.view.View getOverturnInfoWindowClick(com.amap.api.maps.model.Marker r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCacheRemoveListener {
        void onRemoveCacheFinish(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCameraChangeListener {
        void onCameraChange(com.amap.api.maps.model.CameraPosition r1);

        void onCameraChangeFinish(com.amap.api.maps.model.CameraPosition r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnIndoorBuildingActiveListener {
        void OnIndoorBuilding(com.amap.api.maps.model.IndoorBuildingInfo r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(com.amap.api.maps.model.Marker r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMapClickListener {
        void onMapClick(com.amap.api.maps.model.LatLng r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMapLoadedListener {
        void onMapLoaded();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMapLongClickListener {
        void onMapLongClick(com.amap.api.maps.model.LatLng r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMapScreenShotListener {
        void onMapScreenShot(android.graphics.Bitmap r1);

        void onMapScreenShot(android.graphics.Bitmap r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMapSnapshotListener {
        void onFinish();

        void onMapTile(android.graphics.Rect r1, android.graphics.Bitmap r2, int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMapTouchListener {
        void onTouch(android.view.MotionEvent r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(com.amap.api.maps.model.Marker r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMarkerDragListener {
        void onMarkerDrag(com.amap.api.maps.model.Marker r1);

        void onMarkerDragEnd(com.amap.api.maps.model.Marker r1);

        void onMarkerDragStart(com.amap.api.maps.model.Marker r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMultiPointClickListener {
        boolean onPointClick(com.amap.api.maps.model.MultiPointItem r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(android.location.Location r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPOIClickListener {
        void onPOIClick(com.amap.api.maps.model.Poi r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPolylineClickListener {
        void onPolylineClick(com.amap.api.maps.model.Polyline r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SignleClickInterceptorListener {
        boolean isInterceptorSignleClick(android.view.MotionEvent r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a {
        final /* synthetic */ com.amap.api.maps.AMap a;

        /* renamed from: b, reason: collision with root package name */
        private android.util.Size f4979b;

        /* renamed from: c, reason: collision with root package name */
        private com.amap.api.maps.model.CameraPosition f4980c;

        /* renamed from: d, reason: collision with root package name */
        private int f4981d;

        private a(com.amap.api.maps.AMap r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.amap.api.maps.AMap r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void a() {
                r2 = this;
                com.amap.api.maps.AMap r0 = r2.a
                com.autonavi.amap.mapcore.interfaces.IAMap r0 = com.amap.api.maps.AMap.a(r0)
                boolean r0 = r0 instanceof com.amap.api.col.p0003l.r9
                if (r0 == 0) goto L17
                com.amap.api.maps.AMap r0 = r2.a
                com.autonavi.amap.mapcore.interfaces.IAMap r0 = com.amap.api.maps.AMap.a(r0)
                com.amap.api.col.3l.r9 r0 = (com.amap.api.col.p0003l.r9) r0
                android.util.Size r1 = r2.f4979b
                r0.A(r1)
            L17:
                com.amap.api.maps.AMap r0 = r2.a
                com.amap.api.maps.model.CameraPosition r1 = r2.f4980c
                com.amap.api.maps.CameraUpdate r1 = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(r1)
                r0.animateCamera(r1)
                com.amap.api.maps.AMap r0 = r2.a
                com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
                int r1 = r2.f4981d
                r0.setLogoPosition(r1)
                return
        }

        public final void a(android.util.Size r3) {
                r2 = this;
                com.amap.api.maps.AMap r0 = r2.a
                com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
                int r0 = r0.getLogoPosition()
                r2.f4981d = r0
                com.amap.api.maps.AMap r0 = r2.a
                com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
                r1 = 2
                r0.setLogoPosition(r1)
                com.amap.api.maps.AMap r0 = r2.a
                com.amap.api.maps.model.CameraPosition r0 = r0.getCameraPosition()
                com.amap.api.maps.model.CameraPosition$Builder r0 = com.amap.api.maps.model.CameraPosition.builder(r0)
                com.amap.api.maps.model.CameraPosition r0 = r0.build()
                r2.f4980c = r0
                com.amap.api.maps.AMap r0 = r2.a
                com.autonavi.amap.mapcore.interfaces.IAMap r0 = com.amap.api.maps.AMap.a(r0)
                boolean r0 = r0 instanceof com.amap.api.col.p0003l.r9
                if (r0 == 0) goto L3e
                com.amap.api.maps.AMap r0 = r2.a
                com.autonavi.amap.mapcore.interfaces.IAMap r0 = com.amap.api.maps.AMap.a(r0)
                com.amap.api.col.3l.r9 r0 = (com.amap.api.col.p0003l.r9) r0
                android.util.Size r3 = r0.c(r3)
                r2.f4979b = r3
            L3e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b {
        final /* synthetic */ com.amap.api.maps.AMap a;

        /* renamed from: b, reason: collision with root package name */
        private android.util.SizeF f4982b;

        /* renamed from: c, reason: collision with root package name */
        private android.graphics.RectF f4983c;

        /* renamed from: d, reason: collision with root package name */
        private double f4984d;

        /* renamed from: e, reason: collision with root package name */
        private com.amap.api.maps.model.LatLng f4985e;

        /* renamed from: f, reason: collision with root package name */
        private com.amap.api.maps.model.LatLng f4986f;

        /* renamed from: g, reason: collision with root package name */
        private com.autonavi.amap.mapcore.IPoint f4987g;

        /* renamed from: h, reason: collision with root package name */
        private com.autonavi.amap.mapcore.IPoint f4988h;

        /* renamed from: i, reason: collision with root package name */
        private com.autonavi.amap.mapcore.IPoint f4989i;

        /* renamed from: j, reason: collision with root package name */
        private int f4990j;

        /* renamed from: k, reason: collision with root package name */
        private int f4991k;
        private int l;

        public b(com.amap.api.maps.AMap r3, com.amap.api.maps.model.LatLng r4, com.amap.api.maps.model.LatLng r5, android.util.Size r6) {
                r2 = this;
                r2.a = r3
                r2.<init>()
                com.autonavi.amap.mapcore.IPoint r3 = new com.autonavi.amap.mapcore.IPoint
                r3.<init>()
                r2.f4987g = r3
                com.autonavi.amap.mapcore.IPoint r3 = new com.autonavi.amap.mapcore.IPoint
                r3.<init>()
                r2.f4988h = r3
                r3 = 0
                r2.f4990j = r3
                r2.f4991k = r3
                r2.l = r3
                android.util.SizeF r3 = new android.util.SizeF
                int r0 = r6.getWidth()
                float r0 = (float) r0
                int r6 = r6.getHeight()
                float r6 = (float) r6
                r3.<init>(r0, r6)
                r2.f4982b = r3
                r2.f4985e = r4
                r2.f4986f = r5
                double r0 = r4.longitude
                double r3 = r4.latitude
                com.autonavi.amap.mapcore.IPoint r6 = r2.f4987g
                com.autonavi.base.ae.gmap.GLMapState.lonlat2Geo(r0, r3, r6)
                double r3 = r5.longitude
                double r5 = r5.latitude
                com.autonavi.amap.mapcore.IPoint r0 = r2.f4988h
                com.autonavi.base.ae.gmap.GLMapState.lonlat2Geo(r3, r5, r0)
                android.util.SizeF r3 = r2.f4982b
                float r3 = r3.getHeight()
                double r3 = (double) r3
                r5 = 0
                com.autonavi.amap.mapcore.IPoint r3 = r2.a(r5, r3)
                r2.f4989i = r3
                android.util.SizeF r3 = r2.f4982b
                float r3 = r3.getWidth()
                int r3 = (int) r3
                int r3 = r3 / 4096
                r2.f4990j = r3
                android.util.SizeF r3 = r2.f4982b
                float r3 = r3.getWidth()
                r4 = 1166016512(0x45800000, float:4096.0)
                float r3 = r3 % r4
                r5 = 0
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 <= 0) goto L6f
                int r3 = r2.f4990j
                int r3 = r3 + 1
                r2.f4990j = r3
            L6f:
                android.util.SizeF r3 = r2.f4982b
                float r3 = r3.getHeight()
                int r3 = (int) r3
                int r3 = r3 / 4096
                r2.f4991k = r3
                android.util.SizeF r3 = r2.f4982b
                float r3 = r3.getHeight()
                float r3 = r3 % r4
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 <= 0) goto L8b
                int r3 = r2.f4991k
                int r3 = r3 + 1
                r2.f4991k = r3
            L8b:
                android.graphics.RectF r3 = new android.graphics.RectF
                android.util.SizeF r4 = r2.f4982b
                float r4 = r4.getWidth()
                int r6 = r2.f4990j
                float r6 = (float) r6
                float r4 = r4 / r6
                android.util.SizeF r6 = r2.f4982b
                float r6 = r6.getHeight()
                int r0 = r2.f4991k
                float r0 = (float) r0
                float r6 = r6 / r0
                r3.<init>(r5, r5, r4, r6)
                r2.f4983c = r3
                com.autonavi.amap.mapcore.IPoint r3 = r2.f4988h
                int r4 = r3.y
                com.autonavi.amap.mapcore.IPoint r5 = r2.f4987g
                int r6 = r5.y
                int r4 = r4 - r6
                double r0 = (double) r4
                int r3 = r3.x
                int r4 = r5.x
                int r3 = r3 - r4
                double r3 = (double) r3
                double r0 = r0 / r3
                double r3 = java.lang.Math.atan(r0)
                r2.f4984d = r3
                return
        }

        private static com.amap.api.maps.model.LatLng a(long r2, long r4) {
                com.autonavi.amap.mapcore.DPoint r0 = new com.autonavi.amap.mapcore.DPoint
                r0.<init>()
                com.autonavi.base.ae.gmap.GLMapState.geo2LonLat(r2, r4, r0)
                com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
                double r3 = r0.y
                double r0 = r0.x
                r2.<init>(r3, r0)
                return r2
        }

        private com.autonavi.amap.mapcore.IPoint a(double r13, double r15) {
                r12 = this;
                double r0 = r12.f4984d
                double r0 = java.lang.Math.sin(r0)
                double r2 = r12.f4984d
                double r2 = java.lang.Math.cos(r2)
                com.autonavi.amap.mapcore.IPoint r4 = r12.f4987g
                com.autonavi.amap.mapcore.IPoint r5 = r12.f4988h
                double r4 = r4.distance(r5)
                android.util.SizeF r6 = r12.f4982b
                float r6 = r6.getWidth()
                double r6 = (double) r6
                double r4 = r4 / r6
                com.autonavi.amap.mapcore.IPoint r6 = new com.autonavi.amap.mapcore.IPoint
                double r7 = r13 * r2
                double r9 = r15 * r0
                double r7 = r7 - r9
                double r7 = r7 * r4
                com.autonavi.amap.mapcore.IPoint r9 = r12.f4987g
                int r10 = r9.x
                double r10 = (double) r10
                double r7 = r7 + r10
                int r7 = (int) r7
                double r2 = r2 * r15
                double r13 = r13 * r0
                double r2 = r2 + r13
                double r4 = r4 * r2
                int r13 = r9.y
                double r13 = (double) r13
                double r4 = r4 + r13
                int r13 = (int) r4
                r6.<init>(r7, r13)
                return r6
        }

        private com.amap.api.maps.model.LatLng b(double r3, double r5) {
                r2 = this;
                com.autonavi.amap.mapcore.IPoint r3 = r2.a(r3, r5)
                com.autonavi.amap.mapcore.DPoint r4 = new com.autonavi.amap.mapcore.DPoint
                r4.<init>()
                int r5 = r3.x
                long r5 = (long) r5
                int r3 = r3.y
                long r0 = (long) r3
                com.autonavi.base.ae.gmap.GLMapState.geo2LonLat(r5, r0, r4)
                com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
                double r5 = r4.y
                double r0 = r4.x
                r3.<init>(r5, r0)
                return r3
        }

        public final com.amap.api.maps.CameraUpdate a() {
                r10 = this;
                int r0 = r10.l
                r1 = 0
                if (r0 != 0) goto L5b
                android.graphics.RectF r0 = r10.f4983c
                float r0 = r0.centerX()
                double r2 = (double) r0
                android.graphics.RectF r0 = r10.f4983c
                float r0 = r0.centerY()
                double r4 = (double) r0
                com.amap.api.maps.model.LatLng r0 = r10.b(r2, r4)
                com.autonavi.amap.mapcore.IPoint r2 = r10.f4987g
                com.autonavi.amap.mapcore.IPoint r3 = r10.f4988h
                double r2 = r2.distance(r3)
                long r2 = (long) r2
                int r4 = r10.f4990j
                long r4 = (long) r4
                long r2 = r2 / r4
                r4 = 0
                com.amap.api.maps.model.LatLng r2 = a(r4, r2)
                com.autonavi.amap.mapcore.IPoint r3 = r10.f4989i
                com.autonavi.amap.mapcore.IPoint r6 = r10.f4987g
                double r6 = r3.distance(r6)
                long r6 = (long) r6
                int r3 = r10.f4991k
                long r8 = (long) r3
                long r6 = r6 / r8
                com.amap.api.maps.model.LatLng r3 = a(r6, r4)
                com.amap.api.maps.AMap r4 = r10.a
                float r2 = r4.getZoomToSpanLevel(r2, r3)
                double r3 = r10.f4984d
                r5 = 4640537203540230144(0x4066800000000000, double:180.0)
                double r3 = r3 * r5
                r5 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r3 = r3 / r5
                float r3 = (float) r3
                com.amap.api.maps.model.CameraPosition r4 = new com.amap.api.maps.model.CameraPosition
                r4.<init>(r0, r2, r1, r3)
                com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(r4)
                return r0
            L5b:
                int r2 = r0 + (-1)
                int r3 = r10.f4990j
                int r2 = r2 / r3
                int r0 = r0 / r3
                if (r2 >= r0) goto L7c
                android.graphics.RectF r0 = r10.f4983c
                float r0 = r0.width()
                float r0 = -r0
                int r1 = r10.f4990j
                int r1 = r1 + (-1)
                float r1 = (float) r1
                float r0 = r0 * r1
                android.graphics.RectF r1 = r10.f4983c
                float r1 = r1.height()
                com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.scrollBy(r0, r1)
                return r0
            L7c:
                android.graphics.RectF r0 = r10.f4983c
                float r0 = r0.width()
                com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.scrollBy(r0, r1)
                return r0
        }

        public final android.graphics.Rect b() {
                r5 = this;
                android.graphics.Rect r0 = new android.graphics.Rect
                android.graphics.RectF r1 = r5.f4983c
                float r2 = r1.left
                int r2 = (int) r2
                float r3 = r1.top
                int r3 = (int) r3
                float r4 = r1.right
                int r4 = (int) r4
                float r1 = r1.bottom
                int r1 = (int) r1
                r0.<init>(r2, r3, r4, r1)
                return r0
        }

        public final android.util.Size c() {
                r3 = this;
                android.util.Size r0 = new android.util.Size
                android.graphics.RectF r1 = r3.f4983c
                float r1 = r1.width()
                int r1 = (int) r1
                android.graphics.RectF r2 = r3.f4983c
                float r2 = r2.height()
                int r2 = (int) r2
                r0.<init>(r1, r2)
                return r0
        }

        public final boolean d() {
                r3 = this;
                android.graphics.RectF r0 = r3.f4983c
                float r1 = r0.right
                float r0 = r0.width()
                float r1 = r1 + r0
                android.util.SizeF r0 = r3.f4982b
                float r0 = r0.getWidth()
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 > 0) goto L1e
                android.graphics.RectF r0 = r3.f4983c
                float r1 = r0.width()
                r2 = 0
                r0.offset(r1, r2)
                goto L3d
            L1e:
                android.graphics.RectF r0 = r3.f4983c
                float r1 = r0.bottom
                float r0 = r0.height()
                float r1 = r1 + r0
                android.util.SizeF r0 = r3.f4982b
                float r0 = r0.getHeight()
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 > 0) goto L44
                android.graphics.RectF r0 = r3.f4983c
                float r1 = r0.left
                float r1 = -r1
                float r2 = r0.height()
                r0.offset(r1, r2)
            L3d:
                int r0 = r3.l
                r1 = 1
                int r0 = r0 + r1
                r3.l = r0
                return r1
            L44:
                r0 = 0
                return r0
        }

        public final boolean e() {
                r3 = this;
                int r0 = r3.l
                int r1 = r3.f4990j
                int r2 = r3.f4991k
                int r1 = r1 * r2
                r2 = 1
                int r1 = r1 - r2
                if (r0 != r1) goto Ld
                return r2
            Ld:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface onMapPrintScreenListener {
        void onMapPrint(android.graphics.drawable.Drawable r1);
    }

    protected AMap(com.autonavi.amap.mapcore.interfaces.IAMap r1) {
            r0 = this;
            r0.<init>()
            r0.mapDelegate = r1
            return
    }

    static /* synthetic */ com.autonavi.amap.mapcore.interfaces.IAMap a(com.amap.api.maps.AMap r0) {
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r0.mapDelegate
            return r0
    }

    private void a(com.amap.api.maps.AMap.b r2, com.amap.api.maps.AMap.OnMapSnapshotListener r3, java.lang.Runnable r4) {
            r1 = this;
            com.amap.api.maps.AMap$2 r0 = new com.amap.api.maps.AMap$2
            r0.<init>(r1, r3, r2, r4)
            com.amap.api.maps.CameraUpdate r2 = r2.a()
            com.amap.api.maps.AMap$3 r3 = new com.amap.api.maps.AMap$3
            r3.<init>(r1, r0, r4)
            r1.animateCamera(r2, r3)
            return
    }

    static /* synthetic */ void a(com.amap.api.maps.AMap r0, com.amap.api.maps.AMap.b r1, com.amap.api.maps.AMap.OnMapSnapshotListener r2, java.lang.Runnable r3) {
            r0.a(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public static java.lang.String getVersion() {
            java.lang.String r0 = "10.0.600"
            return r0
    }

    public final void accelerateNetworkInChinese(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L7
            r0.accelerateNetworkInChinese(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public final com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay add3DModelTileOverlay(com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay r2 = r0.add3DModelTileOverlay(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final void addAMapAppResourceListener(com.amap.api.maps.AMap.AMapAppResourceRequestListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Exception -> L5
            r0.addAMapAppResourceListener(r2)     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public final com.amap.api.maps.model.Arc addArc(com.amap.api.maps.model.ArcOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.Arc r2 = r0.addArc(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.BuildingOverlay addBuildingOverlay() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.BuildingOverlay r0 = r0.addBuildingOverlay()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.Circle addCircle(com.amap.api.maps.model.CircleOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.Circle r2 = r0.addCircle(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.col.p0003l.m3 addContourLineOverlay(com.amap.api.col.p0003l.eo r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Exception -> L7
            com.amap.api.col.3l.m3 r2 = r0.addContourLineOverlay(r2)     // Catch: java.lang.Exception -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.CrossOverlay addCrossOverlay(com.amap.api.maps.model.CrossOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.CrossOverlay r2 = r0.addCrossVector(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.GL3DModel addGL3DModel(com.amap.api.maps.model.GL3DModelOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.GL3DModel r2 = r0.addGLModel(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.GLTFOverlay addGLTFOverlay(com.amap.api.maps.model.GLTFOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.GLTFOverlay r2 = r0.addGLTFOverlay(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.GroundOverlay addGroundOverlay(com.amap.api.maps.model.GroundOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.GroundOverlay r2 = r0.addGroundOverlay(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.HeatMapGridLayer addHeatMapGridLayer(com.amap.api.maps.model.HeatMapGridLayerOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.HeatMapGridLayer r2 = r0.addHeatMapGridLayer(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.HeatMapLayer addHeatMapLayer(com.amap.api.maps.model.HeatMapLayerOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.HeatMapLayer r2 = r0.addHeatMapLayer(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.MVTTileOverlay addMVTTileOverlay(com.amap.api.maps.model.MVTTileOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.MVTTileOverlay r2 = r0.addMVTTileOverlay(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.Marker addMarker(com.amap.api.maps.model.MarkerOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.Marker r2 = r0.addMarker(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final java.util.ArrayList<com.amap.api.maps.model.Marker> addMarkers(java.util.ArrayList<com.amap.api.maps.model.MarkerOptions> r2, boolean r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            java.util.ArrayList r2 = r0.addMarkers(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.MultiPointOverlay addMultiPointOverlay(com.amap.api.maps.model.MultiPointOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.MultiPointOverlay r2 = r0.addMultiPointOverlay(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.NavigateArrow addNavigateArrow(com.amap.api.maps.model.NavigateArrowOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.NavigateArrow r2 = r0.addNavigateArrow(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final void addOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnCameraChangeListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnIndoorBuildingActiveListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnInfoWindowClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnMapClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnMapLoadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnMapLoadedListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnMapLongClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnMapTouchListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnMarkerClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnMarkerDragListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnMyLocationChangeListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnPOIClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void addOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.addOnPolylineClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final com.amap.api.maps.model.particle.ParticleOverlay addParticleOverlay(com.amap.api.maps.model.particle.ParticleOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.particle.ParticleOverlay r2 = r0.addParticleOverlay(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.Polygon addPolygon(com.amap.api.maps.model.PolygonOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.Polygon r2 = r0.addPolygon(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.Polyline addPolyline(com.amap.api.maps.model.PolylineOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.Polyline r2 = r0.addPolyline(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.RouteOverlay addRouteOverlay() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            com.amap.api.maps.model.RouteOverlay r0 = r0.addNaviRouteOverlay()
            return r0
    }

    public final void addSignleClickInterceptorListener(com.amap.api.maps.AMap.SignleClickInterceptorListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Exception -> L5
            r0.addSignleClickInterceptorListener(r2)     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public final com.amap.api.maps.model.Text addText(com.amap.api.maps.model.TextOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.Text r2 = r0.addText(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final com.amap.api.maps.model.TileOverlay addTileOverlay(com.amap.api.maps.model.TileOverlayOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.TileOverlay r2 = r0.addTileOverlay(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final void animateCamera(com.amap.api.maps.CameraUpdate r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.animateCamera(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void animateCamera(com.amap.api.maps.CameraUpdate r2, long r3, com.amap.api.maps.AMap.CancelableCallback r5) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.animateCameraWithDurationAndCallback(r2, r3, r5)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void animateCamera(com.amap.api.maps.CameraUpdate r2, com.amap.api.maps.AMap.CancelableCallback r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.animateCameraWithCallback(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final android.util.Pair<java.lang.Float, com.amap.api.maps.model.LatLng> calculateZoomToSpanLevel(int r8, int r9, int r10, int r11, com.amap.api.maps.model.LatLng r12, com.amap.api.maps.model.LatLng r13) {
            r7 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r7.mapDelegate
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            android.util.Pair r8 = r0.calculateZoomToSpanLevel(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final void clear() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.clear()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void clear(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.clear(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final com.amap.api.maps.model.CameraPosition getCameraPosition() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.CameraPosition r0 = r0.getCameraPosition()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final java.lang.String getCurrentStyle() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getCurrentWorldVectorMapStyle()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public final com.amap.api.maps.InfoWindowAnimationManager getInfoWindowAnimationManager() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            com.amap.api.maps.InfoWindowAnimationManager r0 = r0.getInfoWindowAnimationManager()
            return r0
    }

    public final java.lang.String getMapContentApprovalNumber() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            java.lang.String r0 = r0.getMapContentApprovalNumber()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void getMapPrintScreen(com.amap.api.maps.AMap.onMapPrintScreenListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.getMapPrintScreen(r2)
            return
    }

    public final void getMapRegionSnapshot(com.amap.api.maps.model.LatLng r3, com.amap.api.maps.model.LatLng r4, android.util.Size r5, com.amap.api.maps.AMap.OnMapSnapshotListener r6) {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.mapDelegate
            boolean r1 = r0 instanceof com.amap.api.col.p0003l.r9
            if (r1 == 0) goto L16
            com.amap.api.col.3l.r9 r0 = (com.amap.api.col.p0003l.r9) r0
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()
            boolean r0 = r0.isTerrainEnable()
            if (r0 == 0) goto L16
            r6.onFinish()
            return
        L16:
            com.amap.api.maps.AMap$b r0 = new com.amap.api.maps.AMap$b
            r0.<init>(r2, r3, r4, r5)
            com.amap.api.maps.AMap$a r3 = new com.amap.api.maps.AMap$a
            r4 = 0
            r3.<init>(r2, r4)
            android.util.Size r4 = r0.c()
            r3.a(r4)
            com.amap.api.maps.AMap$1 r4 = new com.amap.api.maps.AMap$1
            r4.<init>(r2, r3, r6)
            r2.a(r0, r6, r4)
            return
    }

    public final java.util.List<com.amap.api.maps.model.Marker> getMapScreenMarkers() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> Le
            java.util.List r0 = r0.getMapScreenMarkers()     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
        Ld:
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final void getMapScreenShot(com.amap.api.maps.AMap.OnMapScreenShotListener r3) {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.mapDelegate
            r1 = 1
            r0.getMapScreenShot(r3, r1)
            return
    }

    public final int getMapTextZIndex() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getMapTextZIndex()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getMapType() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getMapType()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final float getMaxZoomLevel() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            float r0 = r0.getMaxZoomLevel()
            return r0
    }

    public final float getMinZoomLevel() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            float r0 = r0.getMinZoomLevel()
            return r0
    }

    public final android.location.Location getMyLocation() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            android.location.Location r0 = r0.getMyLocation()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.MyLocationStyle getMyLocationStyle() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.MyLocationStyle r0 = r0.getMyLocationStyle()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.MyTrafficStyle getMyTrafficStyle() {
            r1 = this;
            com.amap.api.maps.model.MyTrafficStyle r0 = r1.myTrafficStyle
            return r0
    }

    public final long getNativeMapController() {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.mapDelegate     // Catch: java.lang.Throwable -> L7
            long r0 = r0.getNativeMapController()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getNativeMapEngineID() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getNativeEngineID()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void getP20MapCenter(com.autonavi.amap.mapcore.IPoint r2) {
            r1 = this;
            if (r2 != 0) goto L7
            com.autonavi.amap.mapcore.IPoint r2 = new com.autonavi.amap.mapcore.IPoint     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
        L7:
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L17
            int r0 = r0.getSX()     // Catch: java.lang.Throwable -> L17
            r2.x = r0     // Catch: java.lang.Throwable -> L17
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L17
            int r0 = r0.getSY()     // Catch: java.lang.Throwable -> L17
            r2.y = r0     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public final com.amap.api.maps.Projection getProjection() {
            r1 = this;
            com.amap.api.maps.Projection r0 = r1.projection     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lc
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> Lf
            com.amap.api.maps.Projection r0 = r0.getAMapProjection()     // Catch: java.lang.Throwable -> Lf
            r1.projection = r0     // Catch: java.lang.Throwable -> Lf
        Lc:
            com.amap.api.maps.Projection r0 = r1.projection     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final float[] getProjectionMatrix() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            float[] r0 = r0.getProjectionMatrix()
            return r0
    }

    public final java.lang.String getSatelliteImageApprovalNumber() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            java.lang.String r0 = r0.getSatelliteImageApprovalNumber()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final float getScalePerPixel() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            float r0 = r0.getScalePerPixel()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final java.lang.String getTerrainApprovalNumber() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            java.lang.String r0 = r0.getTerrainApprovalNumber()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.UiSettings getUiSettings() {
            r1 = this;
            com.amap.api.maps.UiSettings r0 = r1.uiSettings     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lc
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> Lf
            com.amap.api.maps.UiSettings r0 = r0.getAMapUiSettings()     // Catch: java.lang.Throwable -> Lf
            r1.uiSettings = r0     // Catch: java.lang.Throwable -> Lf
        Lc:
            com.amap.api.maps.UiSettings r0 = r1.uiSettings     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final float[] getViewMatrix() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            float[] r0 = r0.getViewMatrix()
            return r0
    }

    public final float getZoomToSpanLevel(com.amap.api.maps.model.LatLng r2, com.amap.api.maps.model.LatLng r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            float r2 = r0.getZoomToSpanLevel(r2, r3)
            return r2
    }

    public final int hideBuildings(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Exception -> L7
            int r2 = r0.hideBuildings(r2)     // Catch: java.lang.Exception -> L7
            return r2
        L7:
            r2 = -1
            return r2
    }

    public final boolean isMyLocationEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isMyLocationEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isTouchPoiEnable() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isTouchPoiEnable()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 1
            return r0
    }

    public final boolean isTrafficEnabled() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isTrafficEnabled()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void moveCamera(com.amap.api.maps.CameraUpdate r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.moveCamera(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void reloadMap() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.reloadMap()
            return
    }

    public final void removeAMapAppResourceListener(com.amap.api.maps.AMap.AMapAppResourceRequestListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Exception -> L5
            r0.removeAMapAppResourceListener(r2)     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public final void removeOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnCameraChangeListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnIndoorBuildingActiveListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnInfoWindowClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnMapClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnMapLoadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnMapLoadedListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnMapLongClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnMapTouchListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnMarkerClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnMarkerDragListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnMyLocationChangeListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnPOIClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removeOnPolylineClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removeSignleClickInterceptorListener(com.amap.api.maps.AMap.SignleClickInterceptorListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Exception -> L5
            r0.removeSignleClickInterceptorListener(r2)     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public final void removecache() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removecache()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void removecache(com.amap.api.maps.AMap.OnCacheRemoveListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.removecache(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void resetMinMaxZoomPreference() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.resetMinMaxZoomPreference()
            return
    }

    public final void runOnDrawFrame() {
            r2 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r2.mapDelegate
            r1 = 0
            r0.setRunLowFrame(r1)
            return
    }

    public final void setAMapGestureListener(com.amap.api.maps.model.AMapGestureListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.setAMapGestureListener(r2)
            return
    }

    public final void setCommonInfoWindowAdapter(com.amap.api.maps.AMap.CommonInfoWindowAdapter r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setInfoWindowAdapter(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setConstructingRoadEnable(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setConstructingRoadEnable(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setCustomMapStyle(com.amap.api.maps.model.CustomMapStyleOptions r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.setCustomMapStyle(r2)
            return
    }

    public final void setCustomMapStyleID(java.lang.String r1) {
            r0 = this;
            return
    }

    public final void setCustomMapStylePath(java.lang.String r1) {
            r0 = this;
            return
    }

    public final void setCustomRenderer(com.amap.api.maps.CustomRenderer r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setCustomRenderer(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setCustomTextureResourcePath(java.lang.String r1) {
            r0 = this;
            return
    }

    public final void setIndoorBuildingInfo(com.amap.api.maps.model.IndoorBuildingInfo r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setIndoorBuildingInfo(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setInfoWindowAdapter(com.amap.api.maps.AMap.InfoWindowAdapter r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setInfoWindowAdapter(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setLoadOfflineData(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setLoadOfflineData(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setLocationSource(com.amap.api.maps.LocationSource r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setLocationSource(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMapCustomEnable(boolean r1) {
            r0 = this;
            return
    }

    public final void setMapLanguage(java.lang.String r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMapLanguage(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMapStatusLimits(com.amap.api.maps.model.LatLngBounds r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> Ld
            r0.setMapStatusLimits(r2)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            com.amap.api.maps.CameraUpdate r2 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r2, r0)     // Catch: java.lang.Throwable -> Ld
            r1.moveCamera(r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    public final void setMapTextZIndex(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMapTextZIndex(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMapType(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMapType(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMaskLayerParams(int r9, int r10, int r11, int r12, int r13, long r14) {
            r8 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r8.mapDelegate
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.setMaskLayerParams(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setMaxZoomLevel(float r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.setMaxZoomLevel(r2)
            return
    }

    public final void setMinZoomLevel(float r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.setMinZoomLevel(r2)
            return
    }

    public final void setMyLocationEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMyLocationEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMyLocationRotateAngle(float r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMyLocationRotateAngle(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMyLocationStyle(com.amap.api.maps.model.MyLocationStyle r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMyLocationStyle(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMyLocationType(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMyLocationType(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setMyTrafficStyle(com.amap.api.maps.model.MyTrafficStyle r1) {
            r0 = this;
            r0.myTrafficStyle = r1     // Catch: java.lang.Throwable -> L2
        L2:
            return
    }

    public final void setNaviLabelEnable(boolean r2, int r3, int r4) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setNaviLabelEnable(r2, r3, r4)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnCameraChangeListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnIndoorBuildingActiveListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnInfoWindowClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMapClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMapLoadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMaploadedListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMapLongClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMapTouchListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMarkerClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMarkerDragListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMultiPointClickListener(com.amap.api.maps.AMap.OnMultiPointClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMultiPointClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnMyLocationChangeListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnPOIClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setOnPolylineClickListener(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setPointToCenter(int r2, int r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setCenterToPixel(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setRenderFps(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.setRenderFps(r2)
            return
    }

    public final void setRenderMode(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate
            r0.setRenderMode(r2)
            return
    }

    public final void setRoadArrowEnable(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setRoadArrowEnable(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setTouchPoiEnable(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setTouchPoiEnable(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setTrafficEnabled(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setTrafficEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setTrafficStyleWithTexture(byte[] r2, com.amap.api.maps.model.MyTrafficStyle r3) {
            r1 = this;
            if (r2 == 0) goto La
            if (r3 != 0) goto L5
            goto La
        L5:
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> La
            r0.setTrafficStyleWithTexture(r2, r3)     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void setTrafficStyleWithTextureData(byte[] r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L8
        L3:
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L8
            r0.setTrafficStyleWithTextureData(r2)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public final void setWorldVectorMapStyle(java.lang.String r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setWorldVectorMapStyle(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void showBuildings(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.set3DBuildingEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void showHideBuildings(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Exception -> L5
            r0.showHideBuildings(r2)     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public final void showIndoorMap(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setIndoorEnabled(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void showMapText(boolean r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.setMapTextEnable(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void stopAnimation() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IAMap r0 = r1.mapDelegate     // Catch: java.lang.Throwable -> L5
            r0.stopAnimation()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }
}
