package com.bxkj.student.run.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunningActivity extends cn.bluemobi.dylan.base.BaseActivity {
    public static final java.lang.String A1 = "com.location.apis.geofencedemo.broadcast";
    public static final java.lang.String B1 = "com.location.apis.geofenceBounds.broadcast";
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.LinearLayout I0;
    private com.bxkj.student.common.view.LongPressToFinishButton J0;
    private android.widget.Button K0;
    private com.amap.api.maps.model.LatLngBounds.Builder L0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> M0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> N0;
    private android.content.Intent O0;
    private int P0;
    private com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean Q0;
    private java.util.List<java.lang.Double> R0;
    private int S0;
    private com.amap.api.maps.model.LatLng T0;
    private boolean U0;
    private boolean V0;
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog W0;
    private com.bxkj.student.run.app.offline.table.RunDb X0;
    private com.amap.api.maps.MapView Y;
    private com.bxkj.student.run.app.utils.g Y0;
    private com.amap.api.maps.AMap Z;
    private com.bxkj.student.run.app.RunningActivity.e Z0;
    private android.widget.ImageView a0;

    /* renamed from: a1, reason: collision with root package name */
    private com.amap.api.maps.model.LatLngBounds.Builder f1144a1;
    private android.widget.TextView b0;

    /* renamed from: b1, reason: collision with root package name */
    private java.util.List<com.amap.api.maps.model.Marker> f1145b1;
    private com.bxkj.base.view.MarqueeTextView c0;

    /* renamed from: c1, reason: collision with root package name */
    private com.amap.api.fence.GeoFenceClient f1146c1;
    private com.amap.api.fence.GeoFenceClient d1;
    private android.content.Intent e1;
    private com.bxkj.student.run.app.vm.RunVM f1;
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog g1;
    private long h1;
    private long i1;
    private long j1;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1147k0;
    private long k1;
    private float l1;
    private java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> m1;
    private boolean n1;
    private com.amap.api.maps.model.LatLng o1;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1148p0;
    private int p1;
    private int q1;
    private java.util.List<java.lang.Integer> r1;
    private android.content.BroadcastReceiver s1;
    private java.util.Map<java.lang.String, java.lang.Boolean> t1;
    private android.content.BroadcastReceiver u1;
    private java.lang.Boolean v1;
    private android.app.ProgressDialog w1;
    private boolean x1;
    private boolean y1;
    private boolean z1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.alibaba.fastjson.TypeReference<androidx.collection.ArrayMap<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.run.app.RunningActivity a;

        a(com.bxkj.student.run.app.RunningActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.run.app.RunningActivity a;

        b(com.bxkj.student.run.app.RunningActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r11, android.content.Intent r12) {
                r10 = this;
                java.lang.String r11 = r12.getAction()
                java.lang.String r0 = "com.location.apis.geofencedemo.broadcast"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L13e
                java.lang.String r11 = "进入电子围栏"
                com.orhanobut.logger.j.c(r11)
                android.os.Bundle r11 = r12.getExtras()
                if (r11 != 0) goto L19
                goto L13e
            L19:
                java.lang.String r12 = "event"
                r11.getInt(r12)
                java.lang.String r12 = "customId"
                java.lang.String r12 = r11.getString(r12)
                java.lang.String r0 = "fenceid"
                r11.getString(r0)
                java.lang.String r0 = "fence"
                android.os.Parcelable r11 = r11.getParcelable(r0)
                com.amap.api.fence.GeoFence r11 = (com.amap.api.fence.GeoFence) r11
                if (r11 != 0) goto L35
                goto L13e
            L35:
                com.bxkj.student.run.app.RunningActivity r0 = r10.a
                android.content.Context r0 = com.bxkj.student.run.app.RunningActivity.Y1(r0)
                r1 = 2131886170(0x7f12005a, float:1.9406911E38)
                com.bxkj.student.run.app.utils.y.f(r0, r1)
                r0 = 2131689842(0x7f0f0172, float:1.900871E38)
                com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r0)
                com.amap.api.location.DPoint r1 = r11.getCenter()
                double r1 = r1.getLatitude()
                com.amap.api.location.DPoint r3 = r11.getCenter()
                double r3 = r3.getLongitude()
                java.lang.String r5 = ","
                java.lang.String[] r5 = r12.split(r5)
                r6 = 0
                r5 = r5[r6]
                java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
                java.lang.String r8 = "yyyy-MM-dd HH:mm:ss"
                r7.<init>(r8)
                java.util.HashMap r8 = new java.util.HashMap
                r8.<init>()
                java.lang.String r9 = "id"
                r8.put(r9, r5)
                java.util.Date r5 = new java.util.Date
                r5.<init>()
                java.lang.String r5 = r7.format(r5)
                java.lang.String r7 = "time"
                r8.put(r7, r5)
                java.lang.String r5 = "latitude"
                java.lang.Double r7 = java.lang.Double.valueOf(r1)
                r8.put(r5, r7)
                java.lang.String r5 = "longitude"
                java.lang.Double r7 = java.lang.Double.valueOf(r3)
                r8.put(r5, r7)
                com.bxkj.student.run.app.RunningActivity r5 = r10.a
                boolean r5 = com.bxkj.student.run.app.RunningActivity.u1(r5, r8)
                if (r5 != 0) goto La3
                com.bxkj.student.run.app.RunningActivity r5 = r10.a
                java.util.List r5 = com.bxkj.student.run.app.RunningActivity.g1(r5)
                r5.add(r8)
            La3:
                com.amap.api.maps.model.MarkerOptions r5 = new com.amap.api.maps.model.MarkerOptions
                r5.<init>()
                com.amap.api.maps.model.LatLng r7 = new com.amap.api.maps.model.LatLng
                r7.<init>(r1, r3)
                com.amap.api.maps.model.MarkerOptions r1 = r5.position(r7)
                com.amap.api.maps.model.MarkerOptions r0 = r1.icon(r0)
                r1 = 1091567616(0x41100000, float:9.0)
                com.amap.api.maps.model.MarkerOptions r0 = r0.zIndex(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "你已经通过"
                r1.append(r2)
                java.lang.String r2 = "必经点"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.amap.api.maps.model.MarkerOptions r0 = r0.title(r1)
                com.amap.api.maps.model.MarkerOptions r0 = r0.draggable(r6)
                com.bxkj.student.run.app.RunningActivity r1 = r10.a
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.O0(r1)
                java.util.Iterator r1 = r1.iterator()
            Le0:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L12c
                java.lang.Object r2 = r1.next()
                com.amap.api.maps.model.Marker r2 = (com.amap.api.maps.model.Marker) r2
                java.lang.Object r3 = r2.getObject()
                java.lang.String r3 = r3.toString()
                boolean r3 = r3.equals(r12)
                if (r3 == 0) goto Le0
                boolean r3 = r2.isRemoved()
                if (r3 != 0) goto Le0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r0.getTitle()
                r3.append(r4)
                java.lang.String r4 = r2.getTitle()
                java.lang.String r5 = r2.getTitle()
                java.lang.String r6 = "："
                int r5 = r5.indexOf(r6)
                java.lang.String r4 = r4.substring(r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r0.title(r3)
                r2.remove()
                goto Le0
            L12c:
                com.bxkj.student.run.app.RunningActivity r12 = r10.a
                com.amap.api.maps.AMap r12 = com.bxkj.student.run.app.RunningActivity.z0(r12)
                r12.addMarker(r0)
                com.bxkj.student.run.app.RunningActivity r12 = r10.a
                com.amap.api.fence.GeoFenceClient r12 = com.bxkj.student.run.app.RunningActivity.N0(r12)
                r12.removeGeoFence(r11)
            L13e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.run.app.RunningActivity a;

        c(com.bxkj.student.run.app.RunningActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                java.lang.String r5 = r6.getAction()
                java.lang.String r0 = "com.location.apis.geofenceBounds.broadcast"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L7a
                android.os.Bundle r5 = r6.getExtras()
                if (r5 != 0) goto L13
                goto L7a
            L13:
                java.lang.String r6 = "event"
                int r6 = r5.getInt(r6)
                java.lang.String r0 = "customId"
                java.lang.String r5 = r5.getString(r0)
                com.bxkj.student.run.app.RunningActivity r0 = r4.a
                java.util.Map r0 = com.bxkj.student.run.app.RunningActivity.I0(r0)
                r1 = 0
                r2 = 1
                if (r6 != r2) goto L2b
                r3 = 1
                goto L2c
            L2b:
                r3 = 0
            L2c:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.put(r5, r3)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "ActionStatus="
                r5.append(r0)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.orhanobut.logger.j.c(r5)
                com.bxkj.student.run.app.RunningActivity r5 = r4.a
                java.util.Map r5 = com.bxkj.student.run.app.RunningActivity.I0(r5)
                java.util.Set r5 = r5.keySet()
                java.util.Iterator r5 = r5.iterator()
            L55:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L75
                java.lang.Object r6 = r5.next()
                java.lang.String r6 = (java.lang.String) r6
                com.bxkj.student.run.app.RunningActivity r0 = r4.a
                java.util.Map r0 = com.bxkj.student.run.app.RunningActivity.I0(r0)
                java.lang.Object r6 = r0.get(r6)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                r1 = 1
                goto L55
            L75:
                com.bxkj.student.run.app.RunningActivity r5 = r4.a
                com.bxkj.student.run.app.RunningActivity.C1(r5, r1)
            L7a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ cn.bluemobi.dylan.http.dialog.LoadingDialog a;
        final /* synthetic */ int b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.bxkj.student.run.app.RunningActivity d;

        d(com.bxkj.student.run.app.RunningActivity r1, cn.bluemobi.dylan.http.dialog.LoadingDialog r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        private void a() {
                r4 = this;
                com.bxkj.student.run.app.RunningActivity r0 = r4.d
                com.bxkj.student.run.app.RunningActivity.v1(r0)
                com.bxkj.student.run.app.RunningActivity r0 = r4.d
                com.bxkj.student.run.app.vm.RunVM r0 = com.bxkj.student.run.app.RunningActivity.V0(r0)
                com.bxkj.student.run.app.RunningActivity r1 = r4.d
                com.bxkj.student.run.app.offline.table.RunDb r1 = com.bxkj.student.run.app.RunningActivity.U0(r1)
                java.lang.String r1 = r1.getIdentify()
                r0.v(r1)
                android.widget.Toast r0 = new android.widget.Toast
                com.bxkj.student.run.app.RunningActivity r1 = r4.d
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.a2(r1)
                r0.<init>(r1)
                com.bxkj.student.run.app.RunningActivity r1 = r4.d
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.c2(r1)
                r2 = 2131493682(0x7f0c0332, float:1.8610851E38)
                r3 = 0
                android.view.View r1 = android.view.View.inflate(r1, r2, r3)
                r0.setView(r1)
                r1 = 17
                r2 = 0
                r0.setGravity(r1, r2, r2)
                r0.setDuration(r2)
                r0.show()
                com.bxkj.student.run.app.RunningActivity r0 = r4.d
                java.lang.String r1 = r4.c
                com.bxkj.student.run.app.RunningActivity.D1(r0, r1)
                return
        }

        public void netOnFailure(java.lang.Throwable r3) {
                r2 = this;
                super.netOnFailure(r3)
                com.bxkj.student.run.app.RunningActivity r3 = r2.d
                int r0 = r2.b
                java.lang.String r1 = r2.c
                com.bxkj.student.run.app.RunningActivity.x1(r3, r0, r1)
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r1.a
                if (r0 == 0) goto La
                r0.dismiss()
            La:
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                r0 = 202(0xca, float:2.83E-43)
                if (r2 != r0) goto Lb
                r1.a()
                return
            Lb:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.RunningActivity r0 = r1.d
                android.content.Context r0 = com.bxkj.student.run.app.RunningActivity.Z1(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                com.bxkj.student.run.app.RunningActivity r2 = r1.d
                r3 = 0
                com.bxkj.student.run.app.RunningActivity.A1(r2, r3)
                return
        }

        public void netOnStart() {
                r2 = this;
                super.netOnStart()
                java.lang.String r0 = "正在上传跑步数据，1分钟内如果上传不成功，会在本地保存数据，请选择其他时间段，选择本地记录进行上传。上传数据这1分钟内，请不要退出或卸载APP，否则数据将丢失。"
                cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = r2.a
                r1.showDefaultStyle(r0)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                r0.a()
                return
        }

        public void netOnSuccessServerError(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnSuccessServerError(r2, r3)
                com.bxkj.student.run.app.RunningActivity r2 = r1.d
                int r3 = r1.b
                java.lang.String r0 = r1.c
                com.bxkj.student.run.app.RunningActivity.x1(r2, r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e extends android.content.BroadcastReceiver {
        private com.amap.api.maps.model.PolylineOptions a;
        private com.amap.api.maps.model.Polyline b;
        private java.util.List<java.lang.Integer> c;
        private com.amap.api.maps.model.PolylineOptions d;
        private com.amap.api.maps.model.Polyline e;
        java.util.List<com.amap.api.maps.model.Polyline> f;
        final /* synthetic */ com.bxkj.student.run.app.RunningActivity g;

        private e(com.bxkj.student.run.app.RunningActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                com.amap.api.maps.model.PolylineOptions r1 = new com.amap.api.maps.model.PolylineOptions
                r1.<init>()
                r0.a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.c = r1
                com.amap.api.maps.model.PolylineOptions r1 = new com.amap.api.maps.model.PolylineOptions
                r1.<init>()
                r0.d = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f = r1
                return
        }

        /* synthetic */ e(com.bxkj.student.run.app.RunningActivity r1, com.bxkj.student.run.app.y r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.run.app.RunningActivity.e r0, int r1, android.content.Intent r2) {
                r0.k(r1, r2)
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.run.app.RunningActivity.e r0, android.view.View r1) {
                r0.j(r1)
                return
        }

        public static /* synthetic */ kotlin.n1 c(com.bxkj.student.run.app.RunningActivity.e r0) {
                kotlin.n1 r0 = r0.l()
                return r0
        }

        private void d(double r4, com.amap.api.maps.model.LatLng r6) {
                r3 = this;
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                java.util.List r0 = com.bxkj.student.run.app.RunningActivity.Q0(r0)
                if (r0 != 0) goto La
                goto L106
            La:
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                int r0 = com.bxkj.student.run.app.RunningActivity.E0(r0)
                com.bxkj.student.run.app.RunningActivity r1 = r3.g
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.Q0(r1)
                int r1 = r1.size()
                if (r0 < r1) goto L1e
                goto L106
            L1e:
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                boolean r0 = com.bxkj.student.run.app.RunningActivity.P0(r0)
                if (r0 == 0) goto L28
                goto L106
            L28:
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                java.util.List r0 = com.bxkj.student.run.app.RunningActivity.Q0(r0)
                com.bxkj.student.run.app.RunningActivity r1 = r3.g
                int r1 = com.bxkj.student.run.app.RunningActivity.E0(r1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Double r0 = (java.lang.Double) r0
                double r0 = r0.doubleValue()
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L106
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                com.bxkj.student.run.app.RunningActivity.o1(r4, r6)
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                java.lang.String r5 = "vibrator"
                java.lang.Object r4 = r4.getSystemService(r5)
                android.os.Vibrator r4 = (android.os.Vibrator) r4
                r5 = 2000(0x7d0, double:9.88E-321)
                r4.vibrate(r5)
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                r5 = 1
                com.bxkj.student.run.app.RunningActivity.y1(r4, r5)
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                android.content.Context r4 = com.bxkj.student.run.app.RunningActivity.R1(r4)
                r5 = 2131886171(0x7f12005b, float:1.9406913E38)
                com.bxkj.student.run.app.utils.y.f(r4, r5)
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.run.app.RunningActivity.X0(r4)
                if (r4 != 0) goto L81
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.RunningActivity r6 = r3.g
                android.content.Context r6 = com.bxkj.student.run.app.RunningActivity.S1(r6)
                r5.<init>(r6)
                com.bxkj.student.run.app.RunningActivity.p1(r4, r5)
                goto L8a
            L81:
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.run.app.RunningActivity.X0(r4)
                r4.dismiss()
            L8a:
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.run.app.RunningActivity.X0(r4)
                r5 = 0
                r4.setClickAutoCancel(r5)
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.run.app.RunningActivity.X0(r4)
                r4.setCancelable(r5)
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.run.app.RunningActivity.X0(r4)
                r4.setCanceledOnTouchOutside(r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "跑步已暂停，请在"
                r4.append(r5)
                com.bxkj.student.run.app.RunningActivity r5 = r3.g
                com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r5 = com.bxkj.student.run.app.RunningActivity.C0(r5)
                double r5 = r5.getFaceDistanceOut()
                r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r5 = r5 * r0
                java.lang.Double r5 = java.lang.Double.valueOf(r5)
                int r5 = r5.intValue()
                r4.append(r5)
                java.lang.String r5 = "米范围内进行人脸识别！"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                java.lang.String r6 = "RUN_PAUSE_NOTIFICATION"
                r5.setAction(r6)
                java.lang.String r6 = "message"
                r5.putExtra(r6, r4)
                com.bxkj.student.run.app.RunningActivity r6 = r3.g
                java.lang.String r0 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
                r6.sendBroadcast(r5, r0)
                com.bxkj.student.run.app.RunningActivity r5 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = com.bxkj.student.run.app.RunningActivity.X0(r5)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r5.setMessage(r4)
                com.bxkj.student.run.app.x r5 = new com.bxkj.student.run.app.x
                r5.<init>(r3)
                r4.setButtonOnClickListener(r5)
                com.bxkj.student.run.app.RunningActivity r4 = r3.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.run.app.RunningActivity.X0(r4)
                r4.show()
            L106:
                return
        }

        private void e(java.util.List<com.amap.api.maps.model.LatLng> r5) {
                r4 = this;
                com.bxkj.student.run.app.RunningActivity r0 = r4.g
                com.amap.api.maps.AMap r0 = com.bxkj.student.run.app.RunningActivity.z0(r0)
                com.amap.api.maps.model.PolylineOptions r1 = new com.amap.api.maps.model.PolylineOptions
                r1.<init>()
                com.amap.api.maps.model.PolylineOptions r5 = r1.addAll(r5)
                com.bxkj.student.run.app.RunningActivity r1 = r4.g
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.g2(r1)
                r2 = 1084227584(0x40a00000, float:5.0)
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
                float r1 = (float) r1
                com.amap.api.maps.model.PolylineOptions r5 = r5.width(r1)
                r1 = 1
                com.amap.api.maps.model.PolylineOptions r5 = r5.setDottedLine(r1)
                com.bxkj.student.run.app.RunningActivity r1 = r4.g
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.f2(r1)
                r3 = 2131099715(0x7f060043, float:1.7811791E38)
                int r1 = androidx.core.content.ContextCompat.getColor(r1, r3)
                com.amap.api.maps.model.PolylineOptions r5 = r5.color(r1)
                com.bxkj.student.run.app.RunningActivity r1 = r4.g
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.e2(r1)
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
                float r1 = (float) r1
                com.amap.api.maps.model.PolylineOptions r5 = r5.zIndex(r1)
                com.amap.api.maps.model.Polyline r5 = r0.addPolyline(r5)
                java.util.List<com.amap.api.maps.model.Polyline> r0 = r4.f
                r0.add(r5)
                return
        }

        private void f(com.amap.api.maps.model.LatLng r7, com.amap.api.maps.model.LatLng r8, float r9, boolean r10) {
                r6 = this;
                r0 = 0
                r1 = 2
                r2 = 1
                r3 = 0
                r4 = 1084227584(0x40a00000, float:5.0)
                if (r10 == 0) goto La4
                com.amap.api.maps.model.Polyline r9 = r6.e
                r10 = 2131099715(0x7f060043, float:1.7811791E38)
                if (r9 != 0) goto L6a
                r6.a = r3
                r6.b = r3
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r6.c = r9
                com.amap.api.maps.model.PolylineOptions r9 = new com.amap.api.maps.model.PolylineOptions
                r9.<init>()
                r6.d = r9
                com.bxkj.student.run.app.RunningActivity r9 = r6.g
                com.amap.api.maps.AMap r9 = com.bxkj.student.run.app.RunningActivity.z0(r9)
                com.amap.api.maps.model.PolylineOptions r3 = r6.d
                com.amap.api.maps.model.LatLng[] r1 = new com.amap.api.maps.model.LatLng[r1]
                r1[r0] = r8
                r1[r2] = r7
                com.amap.api.maps.model.PolylineOptions r7 = r3.add(r1)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.G1(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
                com.amap.api.maps.model.PolylineOptions r7 = r7.setDottedLine(r2)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.i2(r8)
                int r8 = androidx.core.content.ContextCompat.getColor(r8, r10)
                com.amap.api.maps.model.PolylineOptions r7 = r7.color(r8)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.h2(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
                com.amap.api.maps.model.Polyline r7 = r9.addPolyline(r7)
                r6.e = r7
                return
            L6a:
                com.amap.api.maps.model.PolylineOptions r8 = r6.d
                com.amap.api.maps.model.PolylineOptions r7 = r8.add(r7)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.J1(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
                com.amap.api.maps.model.PolylineOptions r7 = r7.setDottedLine(r2)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.I1(r8)
                int r8 = androidx.core.content.ContextCompat.getColor(r8, r10)
                com.amap.api.maps.model.PolylineOptions r7 = r7.color(r8)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.H1(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
                r9.setOptions(r7)
                return
            La4:
                java.util.List<java.lang.Integer> r10 = r6.c
                com.bxkj.student.run.app.RunningActivity r5 = r6.g
                android.content.Context r5 = com.bxkj.student.run.app.RunningActivity.K1(r5)
                int r5 = com.bxkj.student.run.app.utils.i.r(r5, r9)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r10.add(r5)
                com.amap.api.maps.model.Polyline r10 = r6.b
                if (r10 != 0) goto L103
                r6.d = r3
                r6.e = r3
                com.amap.api.maps.model.PolylineOptions r9 = new com.amap.api.maps.model.PolylineOptions
                r9.<init>()
                r6.a = r9
                com.bxkj.student.run.app.RunningActivity r9 = r6.g
                com.amap.api.maps.AMap r9 = com.bxkj.student.run.app.RunningActivity.z0(r9)
                com.amap.api.maps.model.PolylineOptions r10 = r6.a
                com.amap.api.maps.model.LatLng[] r1 = new com.amap.api.maps.model.LatLng[r1]
                r1[r0] = r8
                r1[r2] = r7
                com.amap.api.maps.model.PolylineOptions r7 = r10.add(r1)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.M1(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
                java.util.List<java.lang.Integer> r8 = r6.c
                com.amap.api.maps.model.PolylineOptions r7 = r7.colorValues(r8)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.L1(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
                com.amap.api.maps.model.Polyline r7 = r9.addPolyline(r7)
                r6.b = r7
                return
            L103:
                com.amap.api.maps.model.PolylineOptions r8 = r6.a
                com.amap.api.maps.model.PolylineOptions r7 = r8.add(r7)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.P1(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
                java.util.List<java.lang.Integer> r8 = r6.c
                com.amap.api.maps.model.PolylineOptions r7 = r7.colorValues(r8)
                com.amap.api.maps.model.PolylineOptions r7 = r7.useGradient(r2)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.O1(r8)
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
                float r8 = (float) r8
                com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.N1(r8)
                int r8 = com.bxkj.student.run.app.utils.i.r(r8, r9)
                com.amap.api.maps.model.PolylineOptions r7 = r7.color(r8)
                r10.setOptions(r7)
                return
        }

        private void g(java.util.List<com.amap.api.maps.model.LatLng> r2, boolean r3, java.util.List<java.lang.Integer> r4) {
                r1 = this;
                java.lang.String r0 = "画线"
                com.orhanobut.logger.j.c(r0)
                if (r3 == 0) goto Lb
                r1.e(r2)
                return
            Lb:
                r1.h(r2, r4)
                return
        }

        private void h(java.util.List<com.amap.api.maps.model.LatLng> r4, java.util.List<java.lang.Integer> r5) {
                r3 = this;
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                com.amap.api.maps.AMap r0 = com.bxkj.student.run.app.RunningActivity.z0(r0)
                com.amap.api.maps.model.PolylineOptions r1 = new com.amap.api.maps.model.PolylineOptions
                r1.<init>()
                com.amap.api.maps.model.PolylineOptions r4 = r1.addAll(r4)
                com.bxkj.student.run.app.RunningActivity r1 = r3.g
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.d2(r1)
                r2 = 1084227584(0x40a00000, float:5.0)
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
                float r1 = (float) r1
                com.amap.api.maps.model.PolylineOptions r4 = r4.width(r1)
                com.amap.api.maps.model.PolylineOptions r4 = r4.colorValues(r5)
                r5 = 1
                com.amap.api.maps.model.PolylineOptions r4 = r4.useGradient(r5)
                com.bxkj.student.run.app.RunningActivity r5 = r3.g
                android.content.Context r5 = com.bxkj.student.run.app.RunningActivity.b2(r5)
                int r5 = cn.bluemobi.dylan.base.utils.u.a(r2, r5)
                float r5 = (float) r5
                com.amap.api.maps.model.PolylineOptions r4 = r4.zIndex(r5)
                com.amap.api.maps.model.Polyline r4 = r0.addPolyline(r4)
                java.util.List<com.amap.api.maps.model.Polyline> r5 = r3.f
                r5.add(r4)
                return
        }

        private void i(com.amap.api.maps.model.LatLng r6) {
                r5 = this;
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                boolean r0 = r0.isFinishing()
                if (r0 == 0) goto L9
                goto L11
            L9:
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                boolean r0 = r0.isDestroyed()
                if (r0 == 0) goto L12
            L11:
                return
            L12:
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                android.app.ProgressDialog r0 = com.bxkj.student.run.app.RunningActivity.T0(r0)
                if (r0 == 0) goto L2f
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                android.app.ProgressDialog r0 = com.bxkj.student.run.app.RunningActivity.T0(r0)
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L2f
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                android.app.ProgressDialog r0 = com.bxkj.student.run.app.RunningActivity.T0(r0)
                r0.dismiss()
            L2f:
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                android.widget.LinearLayout r0 = com.bxkj.student.run.app.RunningActivity.M0(r0)
                int r0 = r0.getVisibility()
                r1 = 0
                if (r0 == 0) goto L45
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                android.widget.LinearLayout r0 = com.bxkj.student.run.app.RunningActivity.M0(r0)
                r0.setVisibility(r1)
            L45:
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                com.bxkj.student.run.app.RunningActivity.B1(r0)
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                com.bxkj.student.run.app.RunningActivity.t1(r0, r6)
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                com.bxkj.student.run.app.RunningActivity.s1(r0)
                java.util.List<java.lang.Integer> r0 = r5.c
                com.bxkj.student.run.app.RunningActivity r2 = r5.g
                android.content.Context r2 = com.bxkj.student.run.app.RunningActivity.F1(r2)
                r3 = 2131100546(0x7f060382, float:1.7813477E38)
                int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.add(r2)
                com.amap.api.maps.model.PolylineOptions r0 = r5.a     // Catch: java.lang.Exception -> La8
                if (r0 != 0) goto L75
                com.amap.api.maps.model.PolylineOptions r0 = new com.amap.api.maps.model.PolylineOptions     // Catch: java.lang.Exception -> La8
                r0.<init>()     // Catch: java.lang.Exception -> La8
                r5.a = r0     // Catch: java.lang.Exception -> La8
            L75:
                com.bxkj.student.run.app.RunningActivity r0 = r5.g     // Catch: java.lang.Exception -> La8
                com.amap.api.maps.AMap r0 = com.bxkj.student.run.app.RunningActivity.z0(r0)     // Catch: java.lang.Exception -> La8
                com.amap.api.maps.model.PolylineOptions r2 = r5.a     // Catch: java.lang.Exception -> La8
                com.amap.api.maps.model.PolylineOptions r2 = r2.add(r6)     // Catch: java.lang.Exception -> La8
                com.bxkj.student.run.app.RunningActivity r3 = r5.g     // Catch: java.lang.Exception -> La8
                android.content.Context r3 = com.bxkj.student.run.app.RunningActivity.Q1(r3)     // Catch: java.lang.Exception -> La8
                r4 = 1084227584(0x40a00000, float:5.0)
                int r3 = cn.bluemobi.dylan.base.utils.u.a(r4, r3)     // Catch: java.lang.Exception -> La8
                float r3 = (float) r3     // Catch: java.lang.Exception -> La8
                com.amap.api.maps.model.PolylineOptions r2 = r2.width(r3)     // Catch: java.lang.Exception -> La8
                java.util.List<java.lang.Integer> r3 = r5.c     // Catch: java.lang.Exception -> La8
                com.amap.api.maps.model.PolylineOptions r2 = r2.colorValues(r3)     // Catch: java.lang.Exception -> La8
                com.amap.api.maps.model.PolylineOptions r1 = r2.useGradient(r1)     // Catch: java.lang.Exception -> La8
                r2 = 1092616192(0x41200000, float:10.0)
                com.amap.api.maps.model.PolylineOptions r1 = r1.zIndex(r2)     // Catch: java.lang.Exception -> La8
                com.amap.api.maps.model.Polyline r0 = r0.addPolyline(r1)     // Catch: java.lang.Exception -> La8
                r5.b = r0     // Catch: java.lang.Exception -> La8
            La8:
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                com.amap.api.maps.model.LatLngBounds$Builder r0 = com.bxkj.student.run.app.RunningActivity.K0(r0)
                com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.include(r6)
                r0.build()
                com.bxkj.student.run.app.RunningActivity r0 = r5.g
                com.amap.api.maps.AMap r0 = com.bxkj.student.run.app.RunningActivity.z0(r0)
                r1 = 1099956224(0x41900000, float:18.0)
                com.amap.api.maps.model.CameraPosition r6 = com.amap.api.maps.model.CameraPosition.fromLatLngZoom(r6, r1)
                com.amap.api.maps.CameraUpdate r6 = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(r6)
                r1 = 1000(0x3e8, double:4.94E-321)
                r3 = 0
                r0.animateCamera(r6, r1, r3)
                return
        }

        private /* synthetic */ void j(android.view.View r1) {
                r0 = this;
                r0.n()
                return
        }

        private /* synthetic */ void k(int r7, android.content.Intent r8) {
                r6 = this;
                r8 = -1
                if (r7 != r8) goto Lcb
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = com.bxkj.student.run.app.RunningActivity.X0(r7)
                if (r7 == 0) goto L20
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = com.bxkj.student.run.app.RunningActivity.X0(r7)
                boolean r7 = r7.isShowing()
                if (r7 == 0) goto L20
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = com.bxkj.student.run.app.RunningActivity.X0(r7)
                r7.dismiss()
            L20:
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                int r8 = com.bxkj.student.run.app.RunningActivity.E0(r7)
                int r8 = r8 + 1
                com.bxkj.student.run.app.RunningActivity.k1(r7, r8)
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                android.content.Context r7 = com.bxkj.student.run.app.RunningActivity.W1(r7)
                r8 = 2131886093(0x7f12000d, float:1.9406755E38)
                com.bxkj.student.run.app.utils.y.f(r7, r8)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.RunningActivity r8 = r6.g
                android.content.Context r8 = com.bxkj.student.run.app.RunningActivity.X1(r8)
                r7.<init>(r8)
                java.lang.String r8 = "人脸识别成功，请继续跑步"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = r7.setMessage(r8)
                r7.show()
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                boolean r7 = com.bxkj.student.run.app.RunningActivity.H0(r7)
                java.lang.String r8 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
                if (r7 == 0) goto L79
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = com.bxkj.student.run.app.RunningActivity.G0(r7)
                java.lang.String r0 = "您已偏离跑步规定区域，跑步已暂停，请在规定区域内进行跑步！"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = r7.setMessage(r0)
                r7.show()
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                java.lang.String r1 = "RUN_PAUSE_NOTIFICATION"
                r7.setAction(r1)
                java.lang.String r1 = "message"
                r7.putExtra(r1, r0)
                com.bxkj.student.run.app.RunningActivity r0 = r6.g
                r0.sendBroadcast(r7, r8)
                goto L88
            L79:
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                java.lang.String r0 = "RUN_CONTINUE_NOTIFICATION"
                r7.setAction(r0)
                com.bxkj.student.run.app.RunningActivity r0 = r6.g
                r0.sendBroadcast(r7, r8)
            L88:
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                r8 = 0
                com.bxkj.student.run.app.RunningActivity.y1(r7, r8)
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r7 = com.bxkj.student.run.app.RunningActivity.C0(r7)
                double r0 = r7.getFaceDistanceOut()
                r2 = 0
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L9f
                goto Lca
            L9f:
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                com.amap.api.maps.model.LatLng r7 = com.bxkj.student.run.app.RunningActivity.B0(r7)
                com.bxkj.student.run.app.RunningActivity r0 = r6.g
                com.amap.api.maps.model.LatLng r0 = com.bxkj.student.run.app.RunningActivity.W0(r0)
                float r7 = com.amap.api.maps.AMapUtils.calculateLineDistance(r7, r0)
                double r0 = (double) r7
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r7 = com.bxkj.student.run.app.RunningActivity.C0(r7)
                double r2 = r7.getFaceDistanceOut()
                r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r2 = r2 * r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 <= 0) goto Lca
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                com.bxkj.student.run.app.RunningActivity.l1(r7, r8)
            Lca:
                return
            Lcb:
                r8 = 170(0xaa, float:2.38E-43)
                if (r7 != r8) goto Ld3
                r6.n()
                return
            Ld3:
                com.bxkj.student.run.app.RunningActivity r7 = r6.g
                com.bxkj.student.run.app.RunningActivity.z1(r7)
                return
        }

        private /* synthetic */ kotlin.n1 l() {
                r3 = this;
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                android.content.Intent r0 = r0.getIntent()
                com.bxkj.student.run.app.RunningActivity r1 = r3.g
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.U1(r1)
                java.lang.Class<com.bxkj.student.run.app.face.FaceDetectExpActivity> r2 = com.bxkj.student.run.app.face.FaceDetectExpActivity.class
                android.content.Intent r0 = r0.setClass(r1, r2)
                com.bxkj.student.run.app.RunningActivity r1 = r3.g
                com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = com.bxkj.student.run.app.RunningActivity.C0(r1)
                java.lang.String r1 = r1.getIdentify()
                java.lang.String r2 = "identify"
                r0.putExtra(r2, r1)
                t.b r1 = new t.b
                com.bxkj.student.run.app.RunningActivity r2 = r3.g
                androidx.fragment.app.FragmentActivity r2 = com.bxkj.student.run.app.RunningActivity.V1(r2)
                r1.<init>(r2)
                t.b r0 = r1.startActivityForResult(r0)
                com.bxkj.student.run.app.w r1 = new com.bxkj.student.run.app.w
                r1.<init>(r3)
                r0.c(r1)
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                r1 = 2130771987(0x7f010013, float:1.714708E38)
                r2 = 2130771986(0x7f010012, float:1.7147078E38)
                r0.overridePendingTransition(r1, r2)
                r0 = 0
                return r0
        }

        private void m(long r8) {
                r7 = this;
                r0 = 60
                long r2 = r8 % r0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L77
                long r8 = r8 / r0
                com.bxkj.student.run.app.RunningActivity r0 = r7.g
                int r0 = com.bxkj.student.run.app.RunningActivity.Y0(r0)
                com.bxkj.student.run.app.RunningActivity r1 = r7.g
                int r1 = com.bxkj.student.run.app.RunningActivity.S0(r1)
                int r0 = r0 - r1
                if (r0 >= 0) goto L1b
                r0 = 0
            L1b:
                com.bxkj.student.run.app.RunningActivity r1 = r7.g
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.Z0(r1)
                int r1 = r1.size()
                long r1 = (long) r1
                int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r3 >= 0) goto L38
                com.bxkj.student.run.app.RunningActivity r8 = r7.g
                java.util.List r8 = com.bxkj.student.run.app.RunningActivity.Z0(r8)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                r8.add(r9)
                goto L6e
            L38:
                com.bxkj.student.run.app.RunningActivity r8 = r7.g
                java.util.List r8 = com.bxkj.student.run.app.RunningActivity.Z0(r8)
                com.bxkj.student.run.app.RunningActivity r9 = r7.g
                java.util.List r9 = com.bxkj.student.run.app.RunningActivity.Z0(r9)
                int r9 = r9.size()
                int r9 = r9 + (-1)
                com.bxkj.student.run.app.RunningActivity r1 = r7.g
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.Z0(r1)
                com.bxkj.student.run.app.RunningActivity r2 = r7.g
                java.util.List r2 = com.bxkj.student.run.app.RunningActivity.Z0(r2)
                int r2 = r2.size()
                int r2 = r2 + (-1)
                java.lang.Object r1 = r1.get(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                int r1 = r1 + r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r8.set(r9, r0)
            L6e:
                com.bxkj.student.run.app.RunningActivity r8 = r7.g
                int r9 = com.bxkj.student.run.app.RunningActivity.Y0(r8)
                com.bxkj.student.run.app.RunningActivity.n1(r8, r9)
            L77:
                return
        }

        private void n() {
                r3 = this;
                com.bxkj.student.run.app.RunningActivity r0 = r3.g
                androidx.fragment.app.FragmentActivity r0 = com.bxkj.student.run.app.RunningActivity.T1(r0)
                com.bxkj.student.run.app.v r1 = new com.bxkj.student.run.app.v
                r1.<init>(r3)
                java.lang.String r2 = "人脸识别"
                com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r13, android.content.Intent r14) {
                r12 = this;
                java.lang.String r13 = r14.getAction()
                java.lang.String r0 = "GET_FIRST_LOCATION_SUCCESS"
                boolean r13 = r13.equals(r0)
                r0 = 0
                java.lang.String r1 = "latLng"
                if (r13 == 0) goto L52
                boolean r13 = r14.hasExtra(r1)
                if (r13 == 0) goto L382
                android.os.Parcelable r13 = r14.getParcelableExtra(r1)
                com.amap.api.maps.model.LatLng r13 = (com.amap.api.maps.model.LatLng) r13
                com.bxkj.student.run.app.RunningActivity r14 = r12.g
                com.amap.api.maps.model.LatLngBounds$Builder r14 = com.bxkj.student.run.app.RunningActivity.F0(r14)
                if (r14 == 0) goto L2c
                com.bxkj.student.run.app.RunningActivity r14 = r12.g
                com.amap.api.maps.model.LatLngBounds$Builder r14 = com.bxkj.student.run.app.RunningActivity.F0(r14)
                r14.include(r13)
            L2c:
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                com.amap.api.maps.AMap r13 = com.bxkj.student.run.app.RunningActivity.z0(r13)
                com.bxkj.student.run.app.RunningActivity r14 = r12.g
                com.amap.api.maps.model.LatLngBounds$Builder r14 = com.bxkj.student.run.app.RunningActivity.F0(r14)
                com.amap.api.maps.model.LatLngBounds r14 = r14.build()
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                android.content.Context r1 = com.bxkj.student.run.app.RunningActivity.E1(r1)
                r2 = 1112014848(0x42480000, float:50.0)
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
                com.amap.api.maps.CameraUpdate r14 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r14, r1)
                r1 = 1000(0x3e8, double:4.94E-321)
                r13.animateCamera(r14, r1, r0)
                return
            L52:
                java.lang.String r13 = r14.getAction()
                java.lang.String r2 = "ADD_START_POINT"
                boolean r13 = r13.equals(r2)
                java.lang.String r2 = "latLngTimeSpeed"
                java.lang.String r3 = "startTime"
                if (r13 == 0) goto L9f
                java.lang.String r13 = "起始点定位成功"
                com.orhanobut.logger.j.c(r13)
                boolean r13 = r14.hasExtra(r3)
                if (r13 == 0) goto L7a
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                long r4 = java.lang.System.currentTimeMillis()
                long r3 = r14.getLongExtra(r3, r4)
                com.bxkj.student.run.app.RunningActivity.q1(r13, r3)
            L7a:
                boolean r13 = r14.hasExtra(r2)
                if (r13 == 0) goto L8f
                android.os.Parcelable r13 = r14.getParcelableExtra(r2)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r13 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r13
                com.bxkj.student.run.app.RunningActivity r0 = r12.g
                java.util.List r0 = com.bxkj.student.run.app.RunningActivity.L0(r0)
                r0.add(r13)
            L8f:
                boolean r13 = r14.hasExtra(r1)
                if (r13 == 0) goto L382
                android.os.Parcelable r13 = r14.getParcelableExtra(r1)
                com.amap.api.maps.model.LatLng r13 = (com.amap.api.maps.model.LatLng) r13
                r12.i(r13)
                return
            L9f:
                java.lang.String r13 = r14.getAction()
                java.lang.String r4 = "ADD_OLD_LINE"
                boolean r13 = r13.equals(r4)
                r4 = 0
                r6 = 0
                java.lang.String r7 = "pace"
                java.lang.String r8 = "avgSpeed"
                java.lang.String r9 = "distance"
                java.lang.String r10 = "countTime"
                r11 = 0
                if (r13 == 0) goto L1c2
                boolean r13 = r14.hasExtra(r10)
                if (r13 == 0) goto Ld9
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                long r1 = r14.getLongExtra(r10, r4)
                com.bxkj.student.run.app.RunningActivity.h1(r13, r1)
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                android.widget.TextView r13 = com.bxkj.student.run.app.RunningActivity.f1(r13)
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                long r1 = com.bxkj.student.run.app.RunningActivity.A0(r1)
                java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
                r13.setText(r1)
            Ld9:
                boolean r13 = r14.hasExtra(r9)
                if (r13 == 0) goto Lfc
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                float r1 = r14.getFloatExtra(r9, r6)
                com.bxkj.student.run.app.RunningActivity.j1(r13, r1)
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                android.widget.TextView r13 = com.bxkj.student.run.app.RunningActivity.a1(r13)
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                float r1 = com.bxkj.student.run.app.RunningActivity.D0(r1)
                double r1 = (double) r1
                java.lang.String r1 = com.bxkj.student.run.app.utils.i.d(r1)
                r13.setText(r1)
            Lfc:
                boolean r13 = r14.hasExtra(r8)
                if (r13 == 0) goto L10f
                java.lang.String r13 = r14.getStringExtra(r8)
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                android.widget.TextView r1 = com.bxkj.student.run.app.RunningActivity.d1(r1)
                r1.setText(r13)
            L10f:
                boolean r13 = r14.hasExtra(r7)
                if (r13 == 0) goto L122
                java.lang.String r13 = r14.getStringExtra(r7)
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                android.widget.TextView r1 = com.bxkj.student.run.app.RunningActivity.c1(r1)
                r1.setText(r13)
            L122:
                java.lang.String r13 = "latLngTimeSpeedList"
                boolean r1 = r14.hasExtra(r13)
                if (r1 == 0) goto L1ae
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                java.util.ArrayList r13 = r14.getParcelableArrayListExtra(r13)
                com.bxkj.student.run.app.RunningActivity.m1(r1, r13)
                r13 = 1
            L134:
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.L0(r1)
                int r1 = r1.size()
                if (r13 >= r1) goto L182
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.L0(r1)
                int r2 = r13 + (-1)
                java.lang.Object r1 = r1.get(r2)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1
                com.bxkj.student.run.app.RunningActivity r2 = r12.g
                java.util.List r2 = com.bxkj.student.run.app.RunningActivity.L0(r2)
                java.lang.Object r2 = r2.get(r13)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r2 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r2
                com.amap.api.maps.model.LatLng r4 = new com.amap.api.maps.model.LatLng
                double r5 = r1.getLatitude()
                double r7 = r1.getLongitude()
                r4.<init>(r5, r7)
                com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
                double r5 = r2.getLatitude()
                double r7 = r2.getLongitude()
                r1.<init>(r5, r7)
                float r5 = r2.getSpeed()
                boolean r2 = r2.isPuase()
                r12.f(r1, r4, r5, r2)
                int r13 = r13 + 1
                goto L134
            L182:
                com.amap.api.maps.model.LatLng r13 = new com.amap.api.maps.model.LatLng
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.L0(r1)
                java.lang.Object r1 = r1.get(r11)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1
                double r1 = r1.getLatitude()
                com.bxkj.student.run.app.RunningActivity r4 = r12.g
                java.util.List r4 = com.bxkj.student.run.app.RunningActivity.L0(r4)
                java.lang.Object r4 = r4.get(r11)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r4 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r4
                double r4 = r4.getLongitude()
                r13.<init>(r1, r4)
                r12.i(r13)
                r12.b = r0
                r12.e = r0
            L1ae:
                boolean r13 = r14.hasExtra(r3)
                if (r13 == 0) goto L382
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                long r0 = java.lang.System.currentTimeMillis()
                long r0 = r14.getLongExtra(r3, r0)
                com.bxkj.student.run.app.RunningActivity.q1(r13, r0)
                return
            L1c2:
                java.lang.String r13 = r14.getAction()
                java.lang.String r3 = "ADD_LINE"
                boolean r13 = r13.equals(r3)
                if (r13 == 0) goto L2af
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                com.bxkj.student.run.app.RunningActivity.w1(r13)
                boolean r13 = r14.hasExtra(r2)
                if (r13 == 0) goto L1e8
                android.os.Parcelable r13 = r14.getParcelableExtra(r2)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r13 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r13
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                java.util.List r1 = com.bxkj.student.run.app.RunningActivity.L0(r1)
                r1.add(r13)
            L1e8:
                boolean r13 = r14.hasExtra(r9)
                if (r13 == 0) goto L1f7
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                float r1 = r14.getFloatExtra(r9, r6)
                com.bxkj.student.run.app.RunningActivity.j1(r13, r1)
            L1f7:
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                float r13 = com.bxkj.student.run.app.RunningActivity.D0(r13)
                double r1 = (double) r13
                java.lang.String r13 = com.bxkj.student.run.app.utils.i.d(r1)
                com.bxkj.student.run.app.RunningActivity r1 = r12.g
                android.widget.TextView r1 = com.bxkj.student.run.app.RunningActivity.a1(r1)
                r1.setText(r13)
                java.lang.String r1 = "currentLatLng"
                boolean r2 = r14.hasExtra(r1)
                if (r2 == 0) goto L220
                android.os.Parcelable r2 = r14.getParcelableExtra(r1)
                com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2
                double r3 = java.lang.Double.parseDouble(r13)
                r12.d(r3, r2)
            L220:
                boolean r13 = r14.hasExtra(r8)
                if (r13 == 0) goto L233
                java.lang.String r13 = r14.getStringExtra(r8)
                com.bxkj.student.run.app.RunningActivity r2 = r12.g
                android.widget.TextView r2 = com.bxkj.student.run.app.RunningActivity.d1(r2)
                r2.setText(r13)
            L233:
                boolean r13 = r14.hasExtra(r7)
                if (r13 == 0) goto L246
                java.lang.String r13 = r14.getStringExtra(r7)
                com.bxkj.student.run.app.RunningActivity r2 = r12.g
                android.widget.TextView r2 = com.bxkj.student.run.app.RunningActivity.c1(r2)
                r2.setText(r13)
            L246:
                boolean r13 = r14.hasExtra(r1)
                if (r13 == 0) goto L382
                java.lang.String r13 = "lastLatLng"
                boolean r2 = r14.hasExtra(r13)
                if (r2 == 0) goto L382
                java.lang.String r2 = "speed"
                boolean r3 = r14.hasExtra(r2)
                if (r3 == 0) goto L382
                java.lang.String r3 = "isPause"
                boolean r4 = r14.hasExtra(r3)
                if (r4 == 0) goto L382
                android.os.Parcelable r1 = r14.getParcelableExtra(r1)
                com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
                android.os.Parcelable r13 = r14.getParcelableExtra(r13)
                com.amap.api.maps.model.LatLng r13 = (com.amap.api.maps.model.LatLng) r13
                float r2 = r14.getFloatExtra(r2, r6)
                boolean r14 = r14.getBooleanExtra(r3, r11)
                r12.f(r1, r13, r2, r14)
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                com.amap.api.maps.model.LatLngBounds$Builder r13 = com.bxkj.student.run.app.RunningActivity.K0(r13)
                com.amap.api.maps.model.LatLngBounds$Builder r13 = r13.include(r1)
                r13.build()
                long r13 = java.lang.System.currentTimeMillis()
                com.bxkj.student.run.app.RunningActivity r2 = r12.g
                long r2 = com.bxkj.student.run.app.RunningActivity.R0(r2)
                long r13 = r13 - r2
                r2 = 30000(0x7530, double:1.4822E-319)
                int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                if (r4 <= 0) goto L382
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                com.amap.api.maps.AMap r13 = com.bxkj.student.run.app.RunningActivity.z0(r13)
                r14 = 1099956224(0x41900000, float:18.0)
                com.amap.api.maps.model.CameraPosition r14 = com.amap.api.maps.model.CameraPosition.fromLatLngZoom(r1, r14)
                com.amap.api.maps.CameraUpdate r14 = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(r14)
                r1 = 500(0x1f4, double:2.47E-321)
                r13.animateCamera(r14, r1, r0)
                return
            L2af:
                java.lang.String r13 = r14.getAction()
                java.lang.String r0 = "SAVE_LOCAL_DB"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L2c1
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                com.bxkj.student.run.app.RunningActivity.w1(r13)
                return
            L2c1:
                java.lang.String r13 = r14.getAction()
                java.lang.String r0 = "TIME_CHANGE"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L2f9
                boolean r13 = r14.hasExtra(r10)
                if (r13 == 0) goto L382
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                long r0 = r14.getLongExtra(r10, r4)
                com.bxkj.student.run.app.RunningActivity.h1(r13, r0)
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                long r13 = com.bxkj.student.run.app.RunningActivity.A0(r13)
                java.lang.String r13 = com.bxkj.student.run.app.utils.i.g(r13)
                com.bxkj.student.run.app.RunningActivity r14 = r12.g
                android.widget.TextView r14 = com.bxkj.student.run.app.RunningActivity.f1(r14)
                r14.setText(r13)
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                long r13 = com.bxkj.student.run.app.RunningActivity.A0(r13)
                r12.m(r13)
                return
            L2f9:
                java.lang.String r13 = r14.getAction()
                java.lang.String r0 = "UPDATE_GPS_STATUS"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L330
                java.lang.String r13 = "gpsStatus"
                boolean r0 = r14.hasExtra(r13)
                if (r0 == 0) goto L382
                java.lang.String r0 = "gpsStatusImage"
                boolean r1 = r14.hasExtra(r0)
                if (r1 == 0) goto L382
                java.lang.String r13 = r14.getStringExtra(r13)
                int r14 = r14.getIntExtra(r0, r11)
                com.bxkj.student.run.app.RunningActivity r0 = r12.g
                android.widget.ImageView r0 = com.bxkj.student.run.app.RunningActivity.J0(r0)
                r0.setImageResource(r14)
                com.bxkj.student.run.app.RunningActivity r14 = r12.g
                android.widget.TextView r14 = com.bxkj.student.run.app.RunningActivity.b1(r14)
                r14.setText(r13)
                return
            L330:
                java.lang.String r13 = r14.getAction()
                java.lang.String r0 = "UPDATE_STEP"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L361
                java.lang.String r13 = "stepCount"
                boolean r0 = r14.hasExtra(r13)
                if (r0 == 0) goto L382
                com.bxkj.student.run.app.RunningActivity r0 = r12.g
                int r13 = r14.getIntExtra(r13, r11)
                com.bxkj.student.run.app.RunningActivity.r1(r0, r13)
                com.bxkj.student.run.app.RunningActivity r13 = r12.g
                android.widget.TextView r13 = com.bxkj.student.run.app.RunningActivity.e1(r13)
                com.bxkj.student.run.app.RunningActivity r14 = r12.g
                int r14 = com.bxkj.student.run.app.RunningActivity.Y0(r14)
                java.lang.String r14 = java.lang.String.valueOf(r14)
                r13.setText(r14)
                return
            L361:
                java.lang.String r13 = r14.getAction()
                java.lang.String r0 = "CURRENT_LATLNG"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L382
                android.os.Bundle r13 = r14.getExtras()
                boolean r14 = r13.containsKey(r1)
                if (r14 == 0) goto L382
                com.bxkj.student.run.app.RunningActivity r14 = r12.g     // Catch: java.lang.Exception -> L382
                java.lang.Object r13 = r13.get(r1)     // Catch: java.lang.Exception -> L382
                com.amap.api.maps.model.LatLng r13 = (com.amap.api.maps.model.LatLng) r13     // Catch: java.lang.Exception -> L382
                com.bxkj.student.run.app.RunningActivity.i1(r14, r13)     // Catch: java.lang.Exception -> L382
            L382:
                return
        }
    }

    public RunningActivity() {
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.M0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.N0 = r0
            r0 = 0
            r5.P0 = r0
            r5.S0 = r0
            r1 = 1
            r5.U0 = r1
            r5.V0 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f1145b1 = r1
            r1 = 0
            r5.h1 = r1
            long r3 = java.lang.System.currentTimeMillis()
            r5.i1 = r3
            r5.k1 = r1
            r1 = 0
            r5.l1 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.m1 = r1
            r5.n1 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.r1 = r1
            com.bxkj.student.run.app.RunningActivity$b r1 = new com.bxkj.student.run.app.RunningActivity$b
            r1.<init>(r5)
            r5.s1 = r1
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r5.t1 = r1
            com.bxkj.student.run.app.RunningActivity$c r1 = new com.bxkj.student.run.app.RunningActivity$c
            r1.<init>(r5)
            r5.u1 = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.v1 = r1
            r5.x1 = r0
            r5.y1 = r0
            r5.z1 = r0
            return
    }

    static /* bridge */ /* synthetic */ long A0(com.bxkj.student.run.app.RunningActivity r2) {
            long r0 = r2.k1
            return r0
    }

    static /* bridge */ /* synthetic */ void A1(com.bxkj.student.run.app.RunningActivity r0, boolean r1) {
            r0.T2(r1)
            return
    }

    private /* synthetic */ kotlin.n1 A2(java.util.List r6) {
            r5 = this;
            if (r6 == 0) goto L97
            int r0 = r6.size()
            if (r0 <= 0) goto L97
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            com.bxkj.student.run.app.offline.table.RunDb r6 = (com.bxkj.student.run.app.offline.table.RunDb) r6
            r5.X0 = r6
            java.lang.String r6 = r6.getSportsSet()
            java.lang.Class<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean> r1 = com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.class
            java.lang.Object r6 = com.alibaba.fastjson.JSON.parseObject(r6, r1)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r6 = (com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean) r6
            r5.Q0 = r6
            com.bxkj.student.run.app.offline.table.RunDb r6 = r5.X0
            java.lang.String r6 = r6.getCountTime()
            long r1 = java.lang.Long.parseLong(r6)
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L3f
            com.bxkj.student.run.app.offline.table.RunDb r6 = r5.X0     // Catch: java.lang.Exception -> L3e
            java.lang.String r6 = r6.getStepList()     // Catch: java.lang.Exception -> L3e
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.util.List r6 = com.alibaba.fastjson.JSON.parseArray(r6, r1)     // Catch: java.lang.Exception -> L3e
            r5.r1 = r6     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
        L3f:
            java.util.List<java.lang.Integer> r6 = r5.r1
            if (r6 != 0) goto L4a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.r1 = r6
        L4a:
            java.util.List<java.lang.Integer> r6 = r5.r1
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r6.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            goto L50
        L62:
            com.bxkj.student.run.app.offline.table.RunDb r6 = r5.X0
            java.lang.String r6 = r6.getUserPassPointList()
            java.util.List r6 = cn.bluemobi.dylan.http.JsonParse.jsonToListMap(r6)
            r5.N0 = r6
            android.widget.TextView r6 = r5.H0
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r6.setText(r1)
            r5.p1 = r0
            r5.q1 = r0
            com.bxkj.student.run.app.offline.table.RunDb r6 = r5.X0
            java.lang.String r6 = r6.getFaceDetectCount()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L93
            com.bxkj.student.run.app.offline.table.RunDb r6 = r5.X0
            java.lang.String r6 = r6.getFaceDetectCount()
            int r6 = java.lang.Integer.parseInt(r6)
            r5.S0 = r6
        L93:
            r5.s2()
            goto L9a
        L97:
            r5.t2()
        L9a:
            r6 = 0
            return r6
    }

    static /* bridge */ /* synthetic */ com.amap.api.maps.model.LatLng B0(com.bxkj.student.run.app.RunningActivity r0) {
            com.amap.api.maps.model.LatLng r0 = r0.o1
            return r0
    }

    static /* bridge */ /* synthetic */ void B1(com.bxkj.student.run.app.RunningActivity r0) {
            r0.V2()
            return
    }

    private /* synthetic */ void B2() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.run.app.set.RunSettingActivity> r2 = com.bxkj.student.run.app.set.RunSettingActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean C0(com.bxkj.student.run.app.RunningActivity r0) {
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r0.Q0
            return r0
    }

    static /* bridge */ /* synthetic */ void C1(com.bxkj.student.run.app.RunningActivity r0, boolean r1) {
            r0.X2(r1)
            return
    }

    private /* synthetic */ void C2() {
            r1 = this;
            r0 = 0
            r1.T2(r0)
            return
    }

    static /* bridge */ /* synthetic */ float D0(com.bxkj.student.run.app.RunningActivity r0) {
            float r0 = r0.l1
            return r0
    }

    static /* bridge */ /* synthetic */ void D1(com.bxkj.student.run.app.RunningActivity r0, java.lang.String r1) {
            r0.Z2(r1)
            return
    }

    private /* synthetic */ void D2() {
            r1 = this;
            r0 = 1
            r1.q2(r0)
            return
    }

    static /* bridge */ /* synthetic */ int E0(com.bxkj.student.run.app.RunningActivity r0) {
            int r0 = r0.S0
            return r0
    }

    static /* synthetic */ android.content.Context E1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void E2() {
            r1 = this;
            r0 = 0
            r1.T2(r0)
            return
    }

    static /* bridge */ /* synthetic */ com.amap.api.maps.model.LatLngBounds.Builder F0(com.bxkj.student.run.app.RunningActivity r0) {
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.f1144a1
            return r0
    }

    static /* synthetic */ android.content.Context F1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void F2() {
            r1 = this;
            r0 = 1
            r1.q2(r0)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog G0(com.bxkj.student.run.app.RunningActivity r0) {
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.g1
            return r0
    }

    static /* synthetic */ android.content.Context G1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void G2(java.lang.String r1, android.view.View r2) {
            r0 = this;
            r0.Z2(r1)
            return
    }

    static /* bridge */ /* synthetic */ boolean H0(com.bxkj.student.run.app.RunningActivity r0) {
            boolean r0 = r0.y1
            return r0
    }

    static /* synthetic */ android.content.Context H1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void H2(android.view.MotionEvent r3) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.h1 = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map I0(com.bxkj.student.run.app.RunningActivity r0) {
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.t1
            return r0
    }

    static /* synthetic */ android.content.Context I1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ boolean I2(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            r1 = 4
            if (r2 != r1) goto Le
            int r1 = r3.getAction()
            r2 = 1
            if (r1 != r2) goto Le
            r0.onBackPressed()
            return r2
        Le:
            r1 = 0
            return r1
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView J0(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.ImageView r0 = r0.a0
            return r0
    }

    static /* synthetic */ android.content.Context J1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void J2(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r3 = -1
            if (r2 != r3) goto La
            r2 = 1
            r0.V0 = r2
            r0.q2(r1)
            return
        La:
            r3 = 170(0xaa, float:2.38E-43)
            if (r2 != r3) goto L12
            r0.Y2(r1)
            return
        L12:
            r1 = 0
            r0.T2(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.amap.api.maps.model.LatLngBounds.Builder K0(com.bxkj.student.run.app.RunningActivity r0) {
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.L0
            return r0
    }

    static /* synthetic */ android.content.Context K1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ kotlin.n1 K2(int r5) {
            r4 = this;
            t.b r0 = new t.b
            androidx.fragment.app.FragmentActivity r1 = r4.W
            r0.<init>(r1)
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r4.V
            java.lang.Class<com.bxkj.student.run.app.face.FaceDetectExpActivity> r3 = com.bxkj.student.run.app.face.FaceDetectExpActivity.class
            r1.<init>(r2, r3)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r2 = r4.Q0
            java.lang.String r2 = r2.getIdentify()
            java.lang.String r3 = "identify"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            t.b r0 = r0.startActivityForResult(r1)
            com.bxkj.student.run.app.f r1 = new com.bxkj.student.run.app.f
            r1.<init>(r4, r5)
            r0.c(r1)
            r5 = 2130771987(0x7f010013, float:1.714708E38)
            r0 = 2130771986(0x7f010012, float:1.7147078E38)
            r4.overridePendingTransition(r5, r0)
            r5 = 0
            return r5
    }

    static /* bridge */ /* synthetic */ java.util.List L0(com.bxkj.student.run.app.RunningActivity r0) {
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r0 = r0.m1
            return r0
    }

    static /* synthetic */ android.content.Context L1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void L2() {
            r4 = this;
            com.bxkj.student.run.app.RunningActivity$e r0 = new com.bxkj.student.run.app.RunningActivity$e
            r1 = 0
            r0.<init>(r4, r1)
            r4.Z0 = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r2 = "GET_FIRST_LOCATION_SUCCESS"
            r0.addAction(r2)
            java.lang.String r2 = "ADD_START_POINT"
            r0.addAction(r2)
            java.lang.String r2 = "ADD_OLD_LINE"
            r0.addAction(r2)
            java.lang.String r2 = "ADD_LINE"
            r0.addAction(r2)
            java.lang.String r2 = "SAVE_LOCAL_DB"
            r0.addAction(r2)
            java.lang.String r2 = "TIME_CHANGE"
            r0.addAction(r2)
            java.lang.String r2 = "UPDATE_GPS_STATUS"
            r0.addAction(r2)
            java.lang.String r2 = "UPDATE_STEP"
            r0.addAction(r2)
            java.lang.String r2 = "CURRENT_LATLNG"
            r0.addAction(r2)
            com.bxkj.student.run.app.RunningActivity$e r2 = r4.Z0
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r4.registerReceiver(r2, r0, r3, r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.LinearLayout M0(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.LinearLayout r0 = r0.I0
            return r0
    }

    static /* synthetic */ android.content.Context M1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void M2() {
            r3 = this;
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            float r1 = r3.l1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setDistance(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            long r1 = r3.k1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setCountTime(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            long r1 = r3.i1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setStartTime(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1 = r3.m1
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            r0.setLatLngList(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.M0
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            r0.setPassLatLngList(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.N0
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            r0.setUserPassPointList(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            java.util.List r1 = r3.r2()
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            r0.setStepList(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            boolean r1 = r3.U0
            if (r1 == 0) goto L58
            java.lang.String r1 = "0"
            goto L5a
        L58:
            java.lang.String r1 = "1"
        L5a:
            r0.setFaceOut(r1)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r3.X0
            int r1 = r3.S0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setFaceDetectCount(r1)
            com.bxkj.student.run.app.vm.RunVM r0 = r3.f1
            com.bxkj.student.run.app.offline.table.RunDb r1 = r3.X0
            r0.z(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.amap.api.fence.GeoFenceClient N0(com.bxkj.student.run.app.RunningActivity r0) {
            com.amap.api.fence.GeoFenceClient r0 = r0.f1146c1
            return r0
    }

    static /* synthetic */ android.content.Context N1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void N2(int r3, java.lang.String r4) {
            r2 = this;
            r2.p2()
            com.bxkj.student.run.app.offline.table.RunDb r0 = r2.X0
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setUploadType(r3)
            com.bxkj.student.run.app.vm.RunVM r3 = r2.f1
            com.bxkj.student.run.app.offline.table.RunDb r0 = r2.X0
            com.bxkj.student.run.app.m r1 = new com.bxkj.student.run.app.m
            r1.<init>()
            r3.D(r0, r1)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r2.V
            r3.<init>(r0)
            java.lang.String r0 = "提交异常，已为您暂存本地，请稍后在本地跑步记录中重新上传！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
            r0 = 0
            r3.setCancelable(r0)
            r3.setCanceledOnTouchOutside(r0)
            r3.show()
            com.bxkj.student.run.app.n r0 = new com.bxkj.student.run.app.n
            r0.<init>(r2, r4)
            r3.setButtonOnClickListener(r0)
            return
    }

    static /* bridge */ /* synthetic */ java.util.List O0(com.bxkj.student.run.app.RunningActivity r0) {
            java.util.List<com.amap.api.maps.model.Marker> r0 = r0.f1145b1
            return r0
    }

    static /* synthetic */ android.content.Context O1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void O2(boolean r1) {
            r0 = this;
            r0.y1 = r1
            r0.R2()
            return
    }

    static /* bridge */ /* synthetic */ boolean P0(com.bxkj.student.run.app.RunningActivity r0) {
            boolean r0 = r0.x1
            return r0
    }

    static /* synthetic */ android.content.Context P1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void P2(boolean r1) {
            r0 = this;
            r0.x1 = r1
            r0.R2()
            return
    }

    static /* bridge */ /* synthetic */ java.util.List Q0(com.bxkj.student.run.app.RunningActivity r0) {
            java.util.List<java.lang.Double> r0 = r0.R0
            return r0
    }

    static /* synthetic */ android.content.Context Q1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* bridge */ /* synthetic */ long R0(com.bxkj.student.run.app.RunningActivity r2) {
            long r0 = r2.h1
            return r0
    }

    static /* synthetic */ android.content.Context R1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void R2() {
            r1 = this;
            boolean r0 = r1.x1
            if (r0 != 0) goto Lf
            boolean r0 = r1.y1
            if (r0 != 0) goto Lf
            boolean r0 = r1.z1
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            r1.n1 = r0
            r1.Q2(r0)
            return
    }

    static /* bridge */ /* synthetic */ int S0(com.bxkj.student.run.app.RunningActivity r0) {
            int r0 = r0.q1
            return r0
    }

    static /* synthetic */ android.content.Context S1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void S2() {
            r4 = this;
            com.amap.api.maps.model.LatLngBounds$Builder r0 = com.amap.api.maps.model.LatLngBounds.builder()
            r4.L0 = r0
            com.amap.api.maps.model.MyLocationStyle r0 = new com.amap.api.maps.model.MyLocationStyle
            r0.<init>()
            r1 = 2131689901(0x7f0f01ad, float:1.900883E38)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r1)
            r0.myLocationIcon(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.strokeColor(r1)
            r1 = 0
            r2 = 180(0xb4, float:2.52E-43)
            r3 = 100
            int r1 = android.graphics.Color.argb(r3, r1, r1, r2)
            r0.radiusFillColor(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.strokeWidth(r1)
            r1 = 6
            r0.myLocationType(r1)
            com.amap.api.maps.AMap r1 = r4.Z
            r1.setMyLocationStyle(r0)
            com.amap.api.maps.AMap r0 = r4.Z
            com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
            r1 = 1
            r0.setMyLocationButtonEnabled(r1)
            com.amap.api.maps.AMap r0 = r4.Z
            r0.setMyLocationEnabled(r1)
            r0 = 1099956224(0x41900000, float:18.0)
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.zoomTo(r0)
            com.amap.api.maps.AMap r1 = r4.Z
            r1.moveCamera(r0)
            r0 = 0
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.changeTilt(r0)
            com.amap.api.maps.AMap r1 = r4.Z
            r1.moveCamera(r0)
            com.amap.api.maps.AMap r0 = r4.Z
            com.bxkj.student.run.app.e r1 = new com.bxkj.student.run.app.e
            r1.<init>(r4)
            r0.setOnMapTouchListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.app.ProgressDialog T0(com.bxkj.student.run.app.RunningActivity r0) {
            android.app.ProgressDialog r0 = r0.w1
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity T1(com.bxkj.student.run.app.RunningActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    private void T2(boolean r1) {
            r0 = this;
            r0.z1 = r1
            r0.R2()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb U0(com.bxkj.student.run.app.RunningActivity r0) {
            com.bxkj.student.run.app.offline.table.RunDb r0 = r0.X0
            return r0
    }

    static /* synthetic */ android.content.Context U1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void U2() {
            r3 = this;
            r3.L2()
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.student.run.app.location.service.LocationService> r1 = com.bxkj.student.run.app.location.service.LocationService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            if (r0 == 0) goto L20
            java.lang.String r0 = "LocationService---isRunning"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r3.V
            r0.<init>(r2, r1)
            r3.stopService(r0)
        L20:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3, r1)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = r3.Q0
            int r1 = r1.getRunType()
            java.lang.String r2 = "runType"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "runExceptionDataDB"
            com.bxkj.student.run.app.offline.table.RunDb r2 = r3.X0
            r0.putExtra(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L41
            com.bxkj.student.run.app.b.a(r3, r0)
            return
        L41:
            r3.startService(r0)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.vm.RunVM V0(com.bxkj.student.run.app.RunningActivity r0) {
            com.bxkj.student.run.app.vm.RunVM r0 = r0.f1
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity V1(com.bxkj.student.run.app.RunningActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    private void V2() {
            r3 = this;
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.student.run.app.step.service.StepService> r1 = com.bxkj.student.run.app.step.service.StepService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "LocationService---isRunning"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r3.V
            r0.<init>(r2, r1)
            r3.stopService(r0)
        L1d:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3, r1)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = r3.Q0
            int r1 = r1.getRunType()
            java.lang.String r2 = "runType"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "isPause"
            boolean r2 = r3.n1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "runExceptionDataDB"
            com.bxkj.student.run.app.offline.table.RunDb r2 = r3.X0
            r0.putExtra(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L45
            com.bxkj.student.run.app.b.a(r3, r0)
            return
        L45:
            r3.startService(r0)
            return
    }

    static /* bridge */ /* synthetic */ com.amap.api.maps.model.LatLng W0(com.bxkj.student.run.app.RunningActivity r0) {
            com.amap.api.maps.model.LatLng r0 = r0.T0
            return r0
    }

    static /* synthetic */ android.content.Context W1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog X0(com.bxkj.student.run.app.RunningActivity r0) {
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.W0
            return r0
    }

    static /* synthetic */ android.content.Context X1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void X2(boolean r12) {
            r11 = this;
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r11.g1
            if (r0 != 0) goto Ld
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r11.V
            r0.<init>(r1)
            r11.g1 = r0
        Ld:
            r0 = 1
            java.lang.String r1 = "message"
            java.lang.String r2 = "RUN_PAUSE_NOTIFICATION"
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.String r5 = "跑步已暂停，请在"
            java.lang.String r6 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            if (r12 == 0) goto L9e
            java.lang.Boolean r7 = r11.v1
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9e
            boolean r7 = r11.x1
            if (r7 == 0) goto L65
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r5 = r11.Q0
            double r8 = r5.getFaceDistanceOut()
            double r8 = r8 * r3
            java.lang.Double r3 = java.lang.Double.valueOf(r8)
            int r3 = r3.intValue()
            r7.append(r3)
            java.lang.String r3 = "米范围内进行人脸识别！"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r11.g1
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r3)
            r4.show()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r4.setAction(r2)
            r4.putExtra(r1, r3)
            r11.sendBroadcast(r4, r6)
            goto L72
        L65:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "RUN_CONTINUE_NOTIFICATION"
            r1.setAction(r2)
            r11.sendBroadcast(r1, r6)
        L72:
            r1 = 0
            r11.O2(r1)
            android.content.Context r1 = r11.V
            r2 = 2131886094(0x7f12000e, float:1.9406757E38)
            com.bxkj.student.run.app.utils.y.f(r1, r2)
            java.lang.String r1 = "ActionStatus=在地理围栏里面"
            com.orhanobut.logger.j.c(r1)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r11.g1
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L92
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r11.g1
            r1.dismiss()
            goto L10e
        L92:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r11.g1
            java.lang.String r2 = "您已进入跑步规定区域，跑步已恢复，请继续进行跑步！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
            r1.show()
            goto L10e
        L9e:
            if (r12 != 0) goto L10e
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = r11.g1
            boolean r7 = r7.isShowing()
            if (r7 == 0) goto Lad
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r7 = r11.g1
            r7.dismiss()
        Lad:
            java.lang.String r7 = "ActionStatus=在地理围栏外面"
            com.orhanobut.logger.j.c(r7)
            r11.O2(r0)
            android.content.Context r7 = r11.V
            r8 = 2131886095(0x7f12000f, float:1.940676E38)
            com.bxkj.student.run.app.utils.y.f(r7, r8)
            java.lang.String r7 = "vibrator"
            java.lang.Object r7 = r11.getSystemService(r7)
            android.os.Vibrator r7 = (android.os.Vibrator) r7
            r8 = 2000(0x7d0, double:9.88E-321)
            r7.vibrate(r8)
            boolean r7 = r11.x1
            java.lang.String r8 = "您已偏离跑步规定区域，跑步已暂停，请在规定区域内进行跑步！"
            if (r7 == 0) goto Lf7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r5 = r11.Q0
            double r9 = r5.getFaceDistanceOut()
            double r9 = r9 * r3
            java.lang.Double r3 = java.lang.Double.valueOf(r9)
            int r3 = r3.intValue()
            r7.append(r3)
            java.lang.String r3 = "米范围内进行人脸识别！\n"
            r7.append(r3)
            r7.append(r8)
            java.lang.String r8 = r7.toString()
        Lf7:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r11.g1
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r8)
            r3.show()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.setAction(r2)
            r3.putExtra(r1, r8)
            r11.sendBroadcast(r3, r6)
        L10e:
            r12 = r12 ^ r0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11.v1 = r12
            return
    }

    static /* bridge */ /* synthetic */ int Y0(com.bxkj.student.run.app.RunningActivity r0) {
            int r0 = r0.p1
            return r0
    }

    static /* synthetic */ android.content.Context Y1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void Y2(int r3) {
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.W
            com.bxkj.student.run.app.j r1 = new com.bxkj.student.run.app.j
            r1.<init>(r2, r3)
            java.lang.String r3 = "人脸识别"
            com.bxkj.base.v2.common.ext.t.p(r0, r3, r1)
            return
    }

    static /* bridge */ /* synthetic */ java.util.List Z0(com.bxkj.student.run.app.RunningActivity r0) {
            java.util.List<java.lang.Integer> r0 = r0.r1
            return r0
    }

    static /* synthetic */ android.content.Context Z1(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void Z2(java.lang.String r2) {
            r1 = this;
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.run.app.StartRunActivity> r0 = com.bxkj.student.run.app.StartRunActivity.class
            android.app.Activity r2 = r2.getActivity(r0)
            com.bxkj.student.run.app.StartRunActivity r2 = (com.bxkj.student.run.app.StartRunActivity) r2
            if (r2 == 0) goto L11
            r2.m1()
        L11:
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.run.app.record.RunRecorderListActivity> r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.class
            android.app.Activity r2 = r2.getActivity(r0)
            com.bxkj.student.run.app.record.RunRecorderListActivity r2 = (com.bxkj.student.run.app.record.RunRecorderListActivity) r2
            if (r2 == 0) goto L22
            r2.I0()
        L22:
            r1.finish()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView a1(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.TextView r0 = r0.f1148p0
            return r0
    }

    static /* synthetic */ android.content.Context a2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void a3() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "STOP_LOCATION"
            r0.setAction(r1)
            java.lang.String r1 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView b1(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* synthetic */ android.content.Context b2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void b3(int r28) {
            r27 = this;
            r0 = r27
            r1 = 1
            r0.T2(r1)
            r0.M2()
            long r1 = java.lang.System.currentTimeMillis()
            r0.j1 = r1
            java.util.List r1 = r0.r2()
            java.lang.String r21 = com.alibaba.fastjson.JSON.toJSONString(r1)
            cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = new cn.bluemobi.dylan.http.dialog.LoadingDialog
            android.content.Context r2 = r0.V
            r1.<init>(r2)
            cn.bluemobi.dylan.http.dialog.DialogOnKeyListener r2 = new cn.bluemobi.dylan.http.dialog.DialogOnKeyListener
            r3 = 0
            r2.<init>(r1, r3)
            r1.setOnKeyListener(r2)
            android.widget.TextView r2 = r0.f1147k0
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L3d
            long r4 = r0.k1
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.g(r4)
        L3d:
            r11 = r2
            android.widget.TextView r2 = r0.f1148p0
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L55
            float r2 = r0.l1
            double r4 = (double) r2
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.d(r4)
        L55:
            r12 = r2
            android.widget.TextView r2 = r0.F0
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L6f
            float r2 = r0.l1
            double r4 = (double) r2
            long r6 = r0.k1
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.a(r4, r6)
        L6f:
            r13 = r2
            android.widget.TextView r2 = r0.G0
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L89
            float r2 = r0.l1
            double r4 = (double) r2
            long r6 = r0.k1
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.b(r4, r6)
        L89:
            r14 = r2
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r2 = r0.m1     // Catch: java.lang.Exception -> La3
            if (r2 == 0) goto La4
            int r2 = r2.size()     // Catch: java.lang.Exception -> La3
            r4 = 2
            if (r2 <= r4) goto La4
            com.bxkj.student.run.app.utils.o r2 = new com.bxkj.student.run.app.utils.o     // Catch: java.lang.Exception -> La3
            r2.<init>()     // Catch: java.lang.Exception -> La3
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r4 = r0.m1     // Catch: java.lang.Exception -> La3
            java.util.List r2 = r2.k(r4)     // Catch: java.lang.Exception -> La3
            r0.m1 = r2     // Catch: java.lang.Exception -> La3
            goto La4
        La3:
        La4:
            android.content.Context r2 = r0.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.setCanCancel(r3)
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideFailMessage()
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.hideSuccessMessage()
            java.lang.Class<com.bxkj.student.run.app.a> r3 = com.bxkj.student.run.app.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            com.bxkj.student.run.app.a r3 = (com.bxkj.student.run.app.a) r3
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getUserId()
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r5 = r0.Q0
            int r5 = r5.getRunType()
            r7 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            long r5 = r0.i1
            r9 = r7
            long r7 = r0.j1
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r10 = r0.m1
            java.lang.String r10 = com.alibaba.fastjson.JSON.toJSONString(r10)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r15 = r0.Q0
            java.lang.String r15 = r15.getIdentify()
            r16 = r2
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.M0
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r2)
            r17 = r9
            r9 = r10
            r10 = r15
            r15 = r2
            r2 = r16
            java.lang.String r16 = com.bxkj.base.util.b0.d()
            r18 = r17
            java.lang.String r17 = com.bxkj.base.util.b0.e()
            r19 = r18
            java.lang.String r18 = com.bxkj.base.util.b0.f()
            r20 = r19
            java.lang.String r19 = com.bxkj.base.util.b0.c()
            r22 = r2
            android.content.Context r2 = r0.V
            java.lang.String r2 = com.bxkj.base.util.b0.h(r2)
            r23 = r2
            boolean r2 = r0.U0
            if (r2 == 0) goto L121
            java.lang.String r2 = "0"
        L11e:
            r24 = r2
            goto L124
        L121:
            java.lang.String r2 = "1"
            goto L11e
        L124:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.N0
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r2)
            r25 = r20
            r20 = r23
            r23 = r2
            r2 = r22
            r22 = r24
            java.lang.Integer r24 = java.lang.Integer.valueOf(r28)
            r26 = r25
            r25 = 0
            r0 = r26
            rx.e r2 = r2.l(r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = r21
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r2)
            com.bxkj.student.run.app.RunningActivity$d r2 = new com.bxkj.student.run.app.RunningActivity$d
            r4 = r27
            r5 = r28
            r2.<init>(r4, r1, r5, r3)
            r0.setDataListener(r2)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView c1(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    static /* synthetic */ android.content.Context c2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView d1(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* synthetic */ android.content.Context d2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView e1(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.TextView r0 = r0.H0
            return r0
    }

    static /* synthetic */ android.content.Context e2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView f1(com.bxkj.student.run.app.RunningActivity r0) {
            android.widget.TextView r0 = r0.f1147k0
            return r0
    }

    static /* synthetic */ android.content.Context f2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static /* synthetic */ kotlin.n1 g0(com.bxkj.student.run.app.RunningActivity r0, java.util.List r1) {
            kotlin.n1 r0 = r0.A2(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List g1(com.bxkj.student.run.app.RunningActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.N0
            return r0
    }

    static /* synthetic */ android.content.Context g2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static /* synthetic */ void h0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.w2()
            return
    }

    static /* bridge */ /* synthetic */ void h1(com.bxkj.student.run.app.RunningActivity r0, long r1) {
            r0.k1 = r1
            return
    }

    static /* synthetic */ android.content.Context h2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static /* synthetic */ void i0(java.util.List r0, int r1, java.lang.String r2) {
            if (r1 != 0) goto L8
            java.lang.String r0 = "添加围栏成功!!"
            com.orhanobut.logger.j.c(r0)
            return
        L8:
            java.lang.String r0 = "添加围栏失败!!"
            com.orhanobut.logger.j.c(r0)
            return
    }

    static /* bridge */ /* synthetic */ void i1(com.bxkj.student.run.app.RunningActivity r0, com.amap.api.maps.model.LatLng r1) {
            r0.o1 = r1
            return
    }

    static /* synthetic */ android.content.Context i2(com.bxkj.student.run.app.RunningActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static /* synthetic */ void j0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.v2()
            return
    }

    static /* bridge */ /* synthetic */ void j1(com.bxkj.student.run.app.RunningActivity r0, float r1) {
            r0.l1 = r1
            return
    }

    private void j2() {
            r10 = this;
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r10.Q0
            java.util.List r0 = r0.getGeofence()
            if (r0 != 0) goto L9
            goto L15
        L9:
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r10.Q0
            java.util.List r0 = r0.getGeofence()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
        L15:
            return
        L16:
            com.amap.api.fence.GeoFenceClient r0 = new com.amap.api.fence.GeoFenceClient
            android.content.Context r1 = r10.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.<init>(r1)
            r10.d1 = r0
            r1 = 3
            r0.setActivateAction(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L2f:
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r2 = r10.Q0
            java.util.List r2 = r2.getGeofence()
            int r2 = r2.size()
            if (r1 >= r2) goto L9b
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r2 = r10.Q0
            java.util.List r2 = r2.getGeofence()
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L4a
            goto L9b
        L4a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L53:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r2.next()
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$GeofenceBean r4 = (com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.GeofenceBean) r4
            com.amap.api.location.DPoint r5 = new com.amap.api.location.DPoint
            java.lang.String r6 = r4.getLat()
            double r6 = java.lang.Double.parseDouble(r6)
            java.lang.String r4 = r4.getLng()
            double r8 = java.lang.Double.parseDouble(r4)
            r5.<init>(r6, r8)
            r3.add(r5)
            goto L53
        L78:
            r0.add(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "runGeoFenceId"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r10.t1
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.put(r2, r5)
            com.amap.api.fence.GeoFenceClient r4 = r10.d1
            r4.addGeoFence(r3, r2)
            int r1 = r1 + 1
            goto L2f
        L9b:
            r10.o2(r0)
            com.bxkj.student.run.app.o r0 = new com.bxkj.student.run.app.o
            r0.<init>()
            com.amap.api.fence.GeoFenceClient r1 = r10.d1
            r1.setGeoFenceListener(r0)
            com.amap.api.fence.GeoFenceClient r0 = r10.d1
            java.lang.String r1 = "com.location.apis.geofenceBounds.broadcast"
            r0.createPendingIntent(r1)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.<init>(r2)
            r0.addAction(r1)
            android.content.BroadcastReceiver r1 = r10.u1
            android.content.Intent r0 = r10.registerReceiver(r1, r0)
            r10.e1 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 k0(com.bxkj.student.run.app.RunningActivity r0, int r1) {
            kotlin.n1 r0 = r0.K2(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ void k1(com.bxkj.student.run.app.RunningActivity r0, int r1) {
            r0.S0 = r1
            return
    }

    private void k2() {
            r15 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r15.M0
            if (r0 == 0) goto L153
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L153
        Lc:
            com.amap.api.fence.GeoFenceClient r0 = new com.amap.api.fence.GeoFenceClient
            android.content.Context r1 = r15.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.<init>(r1)
            r15.f1146c1 = r0
            r1 = 1
            r0.setActivateAction(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r15.M0
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L116
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "latitude"
            double r3 = cn.bluemobi.dylan.http.JsonParse.getDouble(r2, r3)
            java.lang.String r5 = "longitude"
            double r5 = cn.bluemobi.dylan.http.JsonParse.getDouble(r2, r5)
            java.lang.String r7 = "isMustPoint"
            int r7 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r7)
            com.amap.api.maps.model.LatLng r8 = new com.amap.api.maps.model.LatLng
            r8.<init>(r3, r5)
            boolean r9 = r15.m2(r2)
            r10 = 0
            java.lang.String r11 = "content"
            r12 = 1091567616(0x41100000, float:9.0)
            if (r9 == 0) goto L95
            r7 = 2131689842(0x7f0f0172, float:1.900871E38)
            com.amap.api.maps.model.BitmapDescriptor r7 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r7)
            com.amap.api.maps.model.MarkerOptions r8 = new com.amap.api.maps.model.MarkerOptions
            r8.<init>()
            com.amap.api.maps.model.LatLng r9 = new com.amap.api.maps.model.LatLng
            r9.<init>(r3, r5)
            com.amap.api.maps.model.MarkerOptions r3 = r8.position(r9)
            com.amap.api.maps.model.MarkerOptions r3 = r3.icon(r7)
            com.amap.api.maps.model.MarkerOptions r3 = r3.zIndex(r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "你已经通过必经点:"
            r4.append(r5)
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = r5.t(r2, r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.amap.api.maps.model.MarkerOptions r2 = r3.title(r2)
            com.amap.api.maps.model.MarkerOptions r2 = r2.draggable(r10)
            com.amap.api.maps.AMap r3 = r15.Z
            r3.addMarker(r2)
            goto L25
        L95:
            if (r7 != r1) goto La1
            r9 = 2131689841(0x7f0f0171, float:1.9008709E38)
            com.amap.api.maps.model.BitmapDescriptor r9 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r9)
            java.lang.String r13 = "必经点："
            goto Laa
        La1:
            r9 = 2131690259(0x7f0f0313, float:1.9009557E38)
            com.amap.api.maps.model.BitmapDescriptor r9 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r9)
            java.lang.String r13 = "选经点："
        Laa:
            java.lang.String r11 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r11)
            com.amap.api.maps.model.MarkerOptions r14 = new com.amap.api.maps.model.MarkerOptions
            r14.<init>()
            com.amap.api.maps.model.MarkerOptions r14 = r14.position(r8)
            com.amap.api.maps.model.MarkerOptions r9 = r14.icon(r9)
            com.amap.api.maps.model.MarkerOptions r9 = r9.zIndex(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.amap.api.maps.model.MarkerOptions r9 = r9.title(r11)
            com.amap.api.maps.model.MarkerOptions r9 = r9.draggable(r10)
            com.amap.api.maps.AMap r10 = r15.Z
            com.amap.api.maps.model.Marker r9 = r10.addMarker(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "id"
            java.lang.String r11 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r11)
            r10.append(r11)
            java.lang.String r11 = ","
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.setObject(r7)
            java.util.List<com.amap.api.maps.model.Marker> r10 = r15.f1145b1
            r10.add(r9)
            com.amap.api.location.DPoint r9 = new com.amap.api.location.DPoint
            r9.<init>(r3, r5)
            java.lang.String r3 = "okRadius"
            int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)
            com.amap.api.fence.GeoFenceClient r3 = r15.f1146c1
            float r2 = (float) r2
            r3.addGeoFence(r9, r2, r7)
            com.amap.api.maps.model.LatLngBounds$Builder r2 = r15.f1144a1
            r2.include(r8)
            goto L25
        L116:
            com.amap.api.maps.AMap r0 = r15.Z
            com.amap.api.maps.model.LatLngBounds$Builder r1 = r15.f1144a1
            com.amap.api.maps.model.LatLngBounds r1 = r1.build()
            r2 = 1092616192(0x41200000, float:10.0)
            android.content.Context r3 = r15.V
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            com.amap.api.maps.CameraUpdate r1 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r1, r2)
            r2 = 2000(0x7d0, double:9.88E-321)
            r4 = 0
            r0.animateCamera(r1, r2, r4)
            com.bxkj.student.run.app.p r0 = new com.bxkj.student.run.app.p
            r0.<init>()
            com.amap.api.fence.GeoFenceClient r1 = r15.f1146c1
            r1.setGeoFenceListener(r0)
            com.amap.api.fence.GeoFenceClient r0 = r15.f1146c1
            java.lang.String r1 = "com.location.apis.geofencedemo.broadcast"
            r0.createPendingIntent(r1)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.<init>(r2)
            r0.addAction(r1)
            android.content.BroadcastReceiver r1 = r15.s1
            android.content.Intent r0 = r15.registerReceiver(r1, r0)
            r15.O0 = r0
        L153:
            return
    }

    public static /* synthetic */ void l0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.F2()
            return
    }

    static /* bridge */ /* synthetic */ void l1(com.bxkj.student.run.app.RunningActivity r0, boolean r1) {
            r0.U0 = r1
            return
    }

    private void l2(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            r0 = 2131689681(0x7f0f00d1, float:1.9008384E38)
            com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r0)
            com.amap.api.maps.model.MarkerOptions r1 = new com.amap.api.maps.model.MarkerOptions
            r1.<init>()
            com.amap.api.maps.model.MarkerOptions r3 = r1.position(r3)
            com.amap.api.maps.model.MarkerOptions r3 = r3.icon(r0)
            r0 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r3 = r3.zIndex(r0)
            r0 = 1
            com.amap.api.maps.model.MarkerOptions r3 = r3.draggable(r0)
            com.amap.api.maps.AMap r0 = r2.Z
            r0.addMarker(r3)
            return
    }

    public static /* synthetic */ void m0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.D2()
            return
    }

    static /* bridge */ /* synthetic */ void m1(com.bxkj.student.run.app.RunningActivity r0, java.util.List r1) {
            r0.m1 = r1
            return
    }

    private boolean m2(java.util.Map<java.lang.String, java.lang.Object> r13) {
            r12 = this;
            java.lang.String r0 = "latitude"
            double r1 = cn.bluemobi.dylan.http.JsonParse.getDouble(r13, r0)
            java.lang.String r3 = "longitude"
            double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r13, r3)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r13 = r12.N0
            java.util.Iterator r13 = r13.iterator()
            r6 = 0
        L13:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L31
            java.lang.Object r7 = r13.next()
            java.util.Map r7 = (java.util.Map) r7
            double r8 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r0)
            double r10 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r3)
            int r7 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r7 != 0) goto L13
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 != 0) goto L13
            r6 = 1
            goto L13
        L31:
            return r6
    }

    public static /* synthetic */ void n0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.B2()
            return
    }

    static /* bridge */ /* synthetic */ void n1(com.bxkj.student.run.app.RunningActivity r0, int r1) {
            r0.q1 = r1
            return
    }

    public static /* synthetic */ void o0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.C2()
            return
    }

    static /* bridge */ /* synthetic */ void o1(com.bxkj.student.run.app.RunningActivity r0, com.amap.api.maps.model.LatLng r1) {
            r0.T0 = r1
            return
    }

    private void o2(java.util.List<java.util.List<com.amap.api.location.DPoint>> r10) {
            r9 = this;
            if (r10 == 0) goto L75
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L9
            goto L75
        L9:
            java.util.Iterator r10 = r10.iterator()
        Ld:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r10.next()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L1c
            goto Ld
        L1c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.amap.api.maps.model.PolygonOptions r2 = new com.amap.api.maps.model.PolygonOptions
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r0.next()
            com.amap.api.location.DPoint r3 = (com.amap.api.location.DPoint) r3
            com.amap.api.maps.model.LatLng r4 = new com.amap.api.maps.model.LatLng
            double r5 = r3.getLatitude()
            double r7 = r3.getLongitude()
            r4.<init>(r5, r7)
            r1.add(r4)
            goto L2a
        L47:
            r2.addAll(r1)
            android.content.Context r0 = r9.V
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r0 = r0.getColor(r1)
            r2.fillColor(r0)
            android.content.Context r0 = r9.V
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131100554(0x7f06038a, float:1.7813493E38)
            int r0 = r0.getColor(r1)
            r2.strokeColor(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r2.strokeWidth(r0)
            com.amap.api.maps.AMap r0 = r9.Z
            r0.addPolygon(r2)
            goto Ld
        L75:
            return
    }

    public static /* synthetic */ void p0(com.bxkj.student.run.app.RunningActivity r0, android.view.MotionEvent r1) {
            r0.H2(r1)
            return
    }

    static /* bridge */ /* synthetic */ void p1(com.bxkj.student.run.app.RunningActivity r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1) {
            r0.W0 = r1
            return
    }

    private void p2() {
            r9 = this;
            com.amap.api.maps.AMap r0 = r9.Z
            com.amap.api.maps.model.MyLocationStyle r0 = r0.getMyLocationStyle()
            r1 = 7
            r0.myLocationType(r1)
            r9.a3()
            long r0 = java.lang.System.currentTimeMillis()
            r9.j1 = r0
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r0 = r9.m1
            if (r0 == 0) goto L75
            int r0 = r0.size()
            if (r0 <= 0) goto L75
            r0 = 2131689680(0x7f0f00d0, float:1.9008382E38)
            com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "latLngList="
            r1.append(r2)
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r2 = r9.m1
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.orhanobut.logger.j.c(r1)
            java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1 = r9.m1
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r1 = r1.get(r2)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions
            r2.<init>()
            com.amap.api.maps.model.LatLng r4 = new com.amap.api.maps.model.LatLng
            double r5 = r1.getLatitude()
            double r7 = r1.getLongitude()
            r4.<init>(r5, r7)
            com.amap.api.maps.model.MarkerOptions r1 = r2.position(r4)
            com.amap.api.maps.model.MarkerOptions r0 = r1.icon(r0)
            r1 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r0 = r0.zIndex(r1)
            com.amap.api.maps.model.MarkerOptions r0 = r0.draggable(r3)
            com.amap.api.maps.AMap r1 = r9.Z
            r1.addMarker(r0)
        L75:
            com.amap.api.maps.AMap r0 = r9.Z
            com.amap.api.maps.model.LatLngBounds$Builder r1 = r9.L0
            com.amap.api.maps.model.LatLngBounds r1 = r1.build()
            r2 = 1112014848(0x42480000, float:50.0)
            android.content.Context r3 = r9.V
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            com.amap.api.maps.CameraUpdate r1 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r1, r2)
            r2 = 2000(0x7d0, double:9.88E-321)
            r4 = 0
            r0.animateCamera(r1, r2, r4)
            return
    }

    public static /* synthetic */ void q0(com.bxkj.student.run.app.RunningActivity r0, android.view.View r1) {
            r0.z2(r1)
            return
    }

    static /* bridge */ /* synthetic */ void q1(com.bxkj.student.run.app.RunningActivity r0, long r1) {
            r0.i1 = r1
            return
    }

    private void q2(int r3) {
            r2 = this;
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r2.Q0
            int r0 = r0.getRunType()
            r1 = 4
            if (r0 != r1) goto Ld
            r2.b3(r3)
            return
        Ld:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.N0
            int r0 = r0.size()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.M0
            int r1 = r1.size()
            if (r0 >= r1) goto L4a
            r3 = 0
            r2.T2(r3)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r2.V
            r3.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "必须经过"
            r0.append(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.M0
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = "个必经点"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
            r3.show()
            return
        L4a:
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r2.Q0
            int r0 = r0.getIsEndFace()
            if (r0 <= 0) goto L5a
            boolean r0 = r2.V0
            if (r0 != 0) goto L5a
            r2.Y2(r3)
            return
        L5a:
            r2.b3(r3)
            return
    }

    public static /* synthetic */ void r0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.y2()
            return
    }

    static /* bridge */ /* synthetic */ void r1(com.bxkj.student.run.app.RunningActivity r0, int r1) {
            r0.p1 = r1
            return
    }

    public static /* synthetic */ kotlin.n1 s0() {
            r0 = 0
            return r0
    }

    static /* bridge */ /* synthetic */ void s1(com.bxkj.student.run.app.RunningActivity r0) {
            r0.j2()
            return
    }

    private void s2() {
            r4 = this;
            java.lang.Class<com.bxkj.student.run.app.step.service.StepService> r0 = com.bxkj.student.run.app.step.service.StepService.class
            java.lang.Class<com.bxkj.student.run.app.location.service.LocationService> r1 = com.bxkj.student.run.app.location.service.LocationService.class
            android.content.Context r2 = r4.V     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Exception -> L40
            boolean r2 = com.bxkj.base.util.a0.a(r2, r3)     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L1f
            java.lang.String r2 = "LocationService----------isServiceRunning"
            com.orhanobut.logger.j.c(r2)     // Catch: java.lang.Exception -> L40
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L40
            android.content.Context r3 = r4.V     // Catch: java.lang.Exception -> L40
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L40
            r4.stopService(r2)     // Catch: java.lang.Exception -> L40
        L1f:
            android.content.Context r1 = r4.V     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Exception -> L40
            boolean r1 = com.bxkj.base.util.a0.a(r1, r2)     // Catch: java.lang.Exception -> L40
            if (r1 == 0) goto L3a
            java.lang.String r1 = "StepService----------isServiceRunning"
            com.orhanobut.logger.j.c(r1)     // Catch: java.lang.Exception -> L40
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L40
            android.content.Context r2 = r4.V     // Catch: java.lang.Exception -> L40
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L40
            r4.stopService(r1)     // Catch: java.lang.Exception -> L40
        L3a:
            r4.S2()     // Catch: java.lang.Exception -> L40
            r4.u2()     // Catch: java.lang.Exception -> L40
        L40:
            return
    }

    public static /* synthetic */ void t0(java.util.List r0, int r1, java.lang.String r2) {
            if (r1 != 0) goto L8
            java.lang.String r0 = "添加跑步范围围栏成功!!"
            com.orhanobut.logger.j.c(r0)
            return
        L8:
            java.lang.String r0 = "添加跑步范围围栏失败!!"
            com.orhanobut.logger.j.c(r0)
            return
    }

    static /* bridge */ /* synthetic */ void t1(com.bxkj.student.run.app.RunningActivity r0, com.amap.api.maps.model.LatLng r1) {
            r0.l2(r1)
            return
    }

    private void t2() {
            r4 = this;
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            if (r0 == 0) goto Ld
            r0.cancelAll()
        Ld:
            android.content.Context r0 = r4.V
            java.lang.Class<com.bxkj.student.run.app.location.service.LocationService> r1 = com.bxkj.student.run.app.location.service.LocationService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            java.lang.String r2 = "LocationService----------isServiceRunning"
            if (r0 == 0) goto L2a
            com.orhanobut.logger.j.c(r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r3 = r4.V
            r0.<init>(r3, r1)
            r4.stopService(r0)
        L2a:
            android.content.Context r0 = r4.V
            java.lang.Class<com.bxkj.student.run.app.step.service.StepService> r1 = com.bxkj.student.run.app.step.service.StepService.class
            java.lang.String r3 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r3)
            if (r0 == 0) goto L45
            com.orhanobut.logger.j.c(r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r4.V
            r0.<init>(r2, r1)
            r4.stopService(r0)
        L45:
            r4.finish()
            return
    }

    public static /* synthetic */ void u0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.x2()
            return
    }

    static /* bridge */ /* synthetic */ boolean u1(com.bxkj.student.run.app.RunningActivity r0, java.util.Map r1) {
            boolean r0 = r0.m2(r1)
            return r0
    }

    private void u2() {
            r5 = this;
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r5.Q0
            if (r0 != 0) goto L7
            r5.t2()
        L7:
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r5.Q0
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            com.bxkj.student.run.app.RunningActivity$a r1 = new com.bxkj.student.run.app.RunningActivity$a
            r1.<init>(r5)
            java.lang.reflect.Type r1 = r1.getType()
            r2 = 0
            com.alibaba.fastjson.parser.Feature[] r3 = new com.alibaba.fastjson.parser.Feature[r2]
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r0, r1, r3)
            androidx.collection.ArrayMap r0 = (androidx.collection.ArrayMap) r0
            java.lang.String r1 = "list"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = "isMustPoint"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r3)
            r4 = 1
            if (r3 != r4) goto L29
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.M0
            r3.add(r1)
            goto L29
        L44:
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r5.Q0
            int r0 = r0.getSurplusNum()
            r5.P0 = r0
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r5.Q0
            int r0 = r0.getIsClock()
            if (r0 <= 0) goto L59
            android.widget.Button r0 = r5.K0
            r0.setVisibility(r2)
        L59:
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r5.Q0
            java.util.List r0 = r0.getMiddleFaces()
            r5.R0 = r0
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r5.Q0
            java.lang.String r0 = r0.getContext()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7d
            com.bxkj.base.view.MarqueeTextView r0 = r5.c0
            r0.setVisibility(r2)
            com.bxkj.base.view.MarqueeTextView r0 = r5.c0
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = r5.Q0
            java.lang.String r1 = r1.getContext()
            r0.setText(r1)
        L7d:
            com.amap.api.maps.model.LatLngBounds$Builder r0 = com.amap.api.maps.model.LatLngBounds.builder()
            r5.f1144a1 = r0
            r5.U2()
            r5.k2()
            java.lang.String r0 = "GPS信号弱或位置精确度较低,请在室外空旷的地方进行跑步,否则将可能影响您的跑步轨迹记录不准确。如果长时间不能定位，请重启手机后重试！"
            r5.W2(r0)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r5.Q0
            java.lang.String r0 = r0.getContext()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb3
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            r1 = 3
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessageGrivity(r1)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = r5.Q0
            java.lang.String r1 = r1.getContext()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
        Lb3:
            return
    }

    public static /* synthetic */ void v0(com.bxkj.student.run.app.RunningActivity r0, int r1, int r2, android.content.Intent r3) {
            r0.J2(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ void v1(com.bxkj.student.run.app.RunningActivity r0) {
            r0.p2()
            return
    }

    private /* synthetic */ void v2() {
            r1 = this;
            r0 = 0
            r1.T2(r0)
            return
    }

    public static /* synthetic */ void w0(com.bxkj.student.run.app.RunningActivity r0, java.lang.String r1, android.view.View r2) {
            r0.G2(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void w1(com.bxkj.student.run.app.RunningActivity r0) {
            r0.M2()
            return
    }

    private /* synthetic */ void w2() {
            r1 = this;
            r0 = 0
            r1.q2(r0)
            return
    }

    public static /* synthetic */ boolean x0(com.bxkj.student.run.app.RunningActivity r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.I2(r1, r2, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ void x1(com.bxkj.student.run.app.RunningActivity r0, int r1, java.lang.String r2) {
            r0.N2(r1, r2)
            return
    }

    private /* synthetic */ void x2() {
            r3 = this;
            r0 = 1
            r3.T2(r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "提示"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r0.setTitle(r1)
            java.lang.String r2 = "确定要结束跑步吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setMessage(r2)
            java.lang.String r2 = "继续"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setLeftButtonText(r2)
            java.lang.String r2 = "结束"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setRightButtonText(r2)
            com.bxkj.student.run.app.k r2 = new com.bxkj.student.run.app.k
            r2.<init>(r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setLeftButtonOnClickListener(r2)
            com.bxkj.student.run.app.l r2 = new com.bxkj.student.run.app.l
            r2.<init>(r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setRightButtonOnClickListener(r2)
            r1.show()
            r1 = 0
            r0.setCancelable(r1)
            return
    }

    public static /* synthetic */ void y0(com.bxkj.student.run.app.RunningActivity r0) {
            r0.E2()
            return
    }

    static /* bridge */ /* synthetic */ void y1(com.bxkj.student.run.app.RunningActivity r0, boolean r1) {
            r0.P2(r1)
            return
    }

    private /* synthetic */ void y2() {
            r0 = this;
            r0.onBackPressed()
            return
    }

    static /* bridge */ /* synthetic */ com.amap.api.maps.AMap z0(com.bxkj.student.run.app.RunningActivity r0) {
            com.amap.api.maps.AMap r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ void z1(com.bxkj.student.run.app.RunningActivity r0) {
            r0.R2()
            return
    }

    private /* synthetic */ void z2(android.view.View r5) {
            r4 = this;
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r4.V
            r5.<init>(r0)
            java.lang.String r0 = "请刷码"
            r5.setTitle(r0)
            r0 = 2131493154(0x7f0c0122, float:1.860978E38)
            r5.setCenterCustomView(r0)
            java.lang.String r0 = "关闭"
            r5.setOneButtonText(r0)
            r0 = 17
            r5.setMessageGrivity(r0)
            r0 = 2131297215(0x7f0903bf, float:1.8212369E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            com.bxkj.base.v2.common.qrcode.b r2 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r3 = r4.W
            r2.<init>(r3)
            r3 = 2131689689(0x7f0f00d9, float:1.90084E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.graphics.Bitmap r1 = r2.f(r1, r3)
            r0.setImageBitmap(r1)
            r5.show()
            return
    }

    public void L() {
            r2 = this;
            com.bxkj.student.common.view.LongPressToFinishButton r0 = r2.J0
            com.bxkj.student.run.app.g r1 = new com.bxkj.student.run.app.g
            r1.<init>(r2)
            r0.setOnFinishListener(r1)
            com.bxkj.student.run.app.h r0 = new com.bxkj.student.run.app.h
            r0.<init>(r2)
            r2.X(r0)
            android.widget.Button r0 = r2.K0
            com.bxkj.student.run.app.i r1 = new com.bxkj.student.run.app.i
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493008(0x7f0c0090, float:1.8609484E38)
            return r0
    }

    public void Q2(boolean r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "SET_RUNNING_PAUSE"
            r0.setAction(r1)
            java.lang.String r1 = "isPause"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            return
    }

    public void R() {
            r19 = this;
            r0 = r19
            com.bxkj.student.run.app.utils.g r1 = new com.bxkj.student.run.app.utils.g
            r1.<init>()
            r0.Y0 = r1
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "runExceptionDataDBId"
            boolean r1 = r1.hasExtra(r2)
            if (r1 == 0) goto L32
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L27
            r0.t2()
            return
        L27:
            com.bxkj.student.run.app.vm.RunVM r2 = r0.f1
            com.bxkj.student.run.app.u r3 = new com.bxkj.student.run.app.u
            r3.<init>(r0)
            r2.w(r1, r3)
            return
        L32:
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "dataBean"
            boolean r1 = r1.hasExtra(r2)
            if (r1 == 0) goto Ld5
            android.content.Intent r1 = r0.getIntent()
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = (com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean) r1
            r0.Q0 = r1
            if (r1 == 0) goto Ld1
            java.lang.String r1 = r1.getIdentify()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ld1
            long r1 = java.lang.System.currentTimeMillis()
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r4 = "startTime"
            boolean r3 = r3.hasExtra(r4)
            if (r3 == 0) goto L8b
            android.content.Intent r1 = r0.getIntent()
            long r2 = java.lang.System.currentTimeMillis()
            long r1 = r1.getLongExtra(r4, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "跑步开始时间="
            r3.append(r4)
            r4 = 0
            java.lang.String r4 = com.bxkj.student.run.app.utils.i.h(r1, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.orhanobut.logger.j.c(r3)
        L8b:
            com.bxkj.student.run.app.offline.table.RunDb r3 = new com.bxkj.student.run.app.offline.table.RunDb
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r4 = r0.Q0
            java.lang.String r4 = r4.getIdentify()
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getAccount()
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r6 = r0.Q0
            int r6 = r6.getRunType()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r7 = r0.Q0
            java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r7)
            java.lang.String r8 = java.lang.String.valueOf(r1)
            java.lang.String r17 = "0"
            java.lang.String r18 = "-1"
            java.lang.String r9 = ""
            java.lang.String r10 = "0"
            java.lang.String r11 = "0"
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            java.lang.String r16 = "0"
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.X0 = r3
            com.bxkj.student.run.app.vm.RunVM r1 = r0.f1
            r1.z(r3)
            r0.s2()
            return
        Ld1:
            r0.t2()
            return
        Ld5:
            r0.t2()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "跑步中"
            r2.setTitle(r0)
            com.bxkj.student.run.app.d r0 = new com.bxkj.student.run.app.d
            r0.<init>(r2)
            r1 = 2131690065(0x7f0f0251, float:1.9009163E38)
            r2.Z(r1, r0)
            return
    }

    public void T(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "runExceptionDataDBId"
            r3.V = r3     // Catch: java.lang.Exception -> Laa
            r1 = 2131298111(0x7f09073f, float:1.8214186E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            com.amap.api.maps.MapView r1 = (com.amap.api.maps.MapView) r1     // Catch: java.lang.Exception -> Laa
            r3.Y = r1     // Catch: java.lang.Exception -> Laa
            r1.onCreate(r4)     // Catch: java.lang.Exception -> Laa
            com.amap.api.maps.MapView r1 = r3.Y     // Catch: java.lang.Exception -> Laa
            com.amap.api.maps.AMap r1 = r1.getMap()     // Catch: java.lang.Exception -> Laa
            r3.Z = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131297146(0x7f09037a, float:1.8212229E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch: java.lang.Exception -> Laa
            r3.a0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131298921(0x7f090a69, float:1.8215829E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> Laa
            r3.b0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> Laa
            r3.f1147k0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131298881(0x7f090a41, float:1.8215748E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> Laa
            r3.f1148p0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131299109(0x7f090b25, float:1.821621E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> Laa
            r3.F0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131299022(0x7f090ace, float:1.8216034E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> Laa
            r3.G0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131298015(0x7f0906df, float:1.8213991E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch: java.lang.Exception -> Laa
            r3.I0 = r1     // Catch: java.lang.Exception -> Laa
            r2 = 4
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> Laa
            r1 = 2131296647(0x7f090187, float:1.8211217E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            com.bxkj.student.common.view.LongPressToFinishButton r1 = (com.bxkj.student.common.view.LongPressToFinishButton) r1     // Catch: java.lang.Exception -> Laa
            r3.J0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131296592(0x7f090150, float:1.8211105E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.Button r1 = (android.widget.Button) r1     // Catch: java.lang.Exception -> Laa
            r3.K0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131298879(0x7f090a3f, float:1.8215744E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            com.bxkj.base.view.MarqueeTextView r1 = (com.bxkj.base.view.MarqueeTextView) r1     // Catch: java.lang.Exception -> Laa
            r3.c0 = r1     // Catch: java.lang.Exception -> Laa
            r1 = 2131299117(0x7f090b2d, float:1.8216226E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch: java.lang.Exception -> Laa
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> Laa
            r3.H0 = r1     // Catch: java.lang.Exception -> Laa
            if (r4 == 0) goto Laa
            boolean r1 = r4.containsKey(r0)     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto Laa
            android.content.Intent r1 = r3.getIntent()     // Catch: java.lang.Exception -> Laa
            java.lang.String r4 = r4.getString(r0)     // Catch: java.lang.Exception -> Laa
            r1.putExtra(r0, r4)     // Catch: java.lang.Exception -> Laa
        Laa:
            androidx.lifecycle.ViewModelProvider r4 = new androidx.lifecycle.ViewModelProvider
            r4.<init>(r3)
            java.lang.Class<com.bxkj.student.run.app.vm.RunVM> r0 = com.bxkj.student.run.app.vm.RunVM.class
            androidx.lifecycle.ViewModel r4 = r4.get(r0)
            com.bxkj.student.run.app.vm.RunVM r4 = (com.bxkj.student.run.app.vm.RunVM) r4
            r3.f1 = r4
            return
    }

    public void W2(java.lang.String r2) {
            r1 = this;
            android.app.ProgressDialog r0 = r1.w1
            if (r0 != 0) goto Lb
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r1)
            r1.w1 = r0
        Lb:
            android.app.ProgressDialog r0 = r1.w1
            r0.setMessage(r2)
            android.app.ProgressDialog r2 = r1.w1
            r0 = 0
            r2.setCanceledOnTouchOutside(r0)
            android.app.ProgressDialog r2 = r1.w1
            com.bxkj.student.run.app.c r0 = new com.bxkj.student.run.app.c
            r0.<init>(r1)
            r2.setOnKeyListener(r0)
            android.app.ProgressDialog r2 = r1.w1
            r2.show()
            return
    }

    public java.lang.String n2(long r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            float r7 = (float) r7
            float r8 = (float) r2
            float r7 = r7 / r8
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "%.1f GB"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            return r7
        L1b:
            r2 = 1120403456(0x42c80000, float:100.0)
            r3 = 1048576(0x100000, double:5.180654E-318)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L3d
            float r7 = (float) r7
            float r8 = (float) r3
            float r7 = r7 / r8
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L2e
            java.lang.String r8 = "%.0f MB"
            goto L30
        L2e:
            java.lang.String r8 = "%.1f MB"
        L30:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = java.lang.String.format(r8, r1)
            return r7
        L3d:
            r3 = 1024(0x400, double:5.06E-321)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L5c
            float r7 = (float) r7
            float r8 = (float) r3
            float r7 = r7 / r8
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L4d
            java.lang.String r8 = "%.0f KB"
            goto L4f
        L4d:
            java.lang.String r8 = "%.1f KB"
        L4f:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = java.lang.String.format(r8, r1)
            return r7
        L5c:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "%d B"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            return r7
    }

    public void onBackPressed() {
            r6 = this;
            r0 = 1
            r6.T2(r0)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog     // Catch: java.lang.Exception -> L83
            android.content.Context r1 = r6.V     // Catch: java.lang.Exception -> L83
            r0.<init>(r1)     // Catch: java.lang.Exception -> L83
            r1 = 0
            r0.setCancelable(r1)     // Catch: java.lang.Exception -> L83
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = r6.Q0     // Catch: java.lang.Exception -> L83
            int r1 = r1.getRunType()     // Catch: java.lang.Exception -> L83
            r2 = 3
            java.lang.String r3 = "确定取消"
            java.lang.String r4 = "继续跑步"
            java.lang.String r5 = "确定要取消本次跑步吗？"
            if (r1 != r2) goto L46
            java.lang.String r1 = "提示"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r1)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r5)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r4)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r3)     // Catch: java.lang.Exception -> L83
            com.bxkj.student.run.app.q r1 = new com.bxkj.student.run.app.q     // Catch: java.lang.Exception -> L83
            r1.<init>(r6)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L83
            com.bxkj.student.run.app.r r1 = new com.bxkj.student.run.app.r     // Catch: java.lang.Exception -> L83
            r1.<init>(r6)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L83
            r0.show()     // Catch: java.lang.Exception -> L83
            return
        L46:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r5)     // Catch: java.lang.Exception -> L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83
            r1.<init>()     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = "今天剩余可跑步次数"
            r1.append(r2)     // Catch: java.lang.Exception -> L83
            int r2 = r6.P0     // Catch: java.lang.Exception -> L83
            r1.append(r2)     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = "次"
            r1.append(r2)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r4)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r3)     // Catch: java.lang.Exception -> L83
            com.bxkj.student.run.app.s r1 = new com.bxkj.student.run.app.s     // Catch: java.lang.Exception -> L83
            r1.<init>(r6)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L83
            com.bxkj.student.run.app.t r1 = new com.bxkj.student.run.app.t     // Catch: java.lang.Exception -> L83
            r1.<init>(r6)     // Catch: java.lang.Exception -> L83
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L83
            r0.show()     // Catch: java.lang.Exception -> L83
        L83:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r4 = this;
            java.lang.Class<com.bxkj.student.run.app.step.service.StepService> r0 = com.bxkj.student.run.app.step.service.StepService.class
            java.lang.Class<com.bxkj.student.run.app.location.service.LocationService> r1 = com.bxkj.student.run.app.location.service.LocationService.class
            android.app.ProgressDialog r2 = r4.w1     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L13
            boolean r2 = r2.isShowing()     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L13
            android.app.ProgressDialog r2 = r4.w1     // Catch: java.lang.Exception -> L75
            r2.dismiss()     // Catch: java.lang.Exception -> L75
        L13:
            com.amap.api.maps.MapView r2 = r4.Y     // Catch: java.lang.Exception -> L75
            r2.onDestroy()     // Catch: java.lang.Exception -> L75
            com.amap.api.fence.GeoFenceClient r2 = r4.f1146c1     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L1f
            r2.removeGeoFence()     // Catch: java.lang.Exception -> L75
        L1f:
            android.content.Intent r2 = r4.O0     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L28
            android.content.BroadcastReceiver r2 = r4.s1     // Catch: java.lang.Exception -> L75
            r4.unregisterReceiver(r2)     // Catch: java.lang.Exception -> L75
        L28:
            com.amap.api.fence.GeoFenceClient r2 = r4.d1     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L2f
            r2.removeGeoFence()     // Catch: java.lang.Exception -> L75
        L2f:
            android.content.Intent r2 = r4.e1     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L38
            android.content.BroadcastReceiver r2 = r4.u1     // Catch: java.lang.Exception -> L75
            r4.unregisterReceiver(r2)     // Catch: java.lang.Exception -> L75
        L38:
            com.bxkj.student.run.app.RunningActivity$e r2 = r4.Z0     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L3f
            r4.unregisterReceiver(r2)     // Catch: java.lang.Exception -> L75
        L3f:
            android.content.Context r2 = r4.V     // Catch: java.lang.Exception -> L75
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Exception -> L75
            boolean r2 = com.bxkj.base.util.a0.a(r2, r3)     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L5a
            java.lang.String r2 = "stopService(new Intent(mContext, LocationService.class))"
            com.orhanobut.logger.j.c(r2)     // Catch: java.lang.Exception -> L75
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L75
            android.content.Context r3 = r4.V     // Catch: java.lang.Exception -> L75
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L75
            r4.stopService(r2)     // Catch: java.lang.Exception -> L75
        L5a:
            android.content.Context r1 = r4.V     // Catch: java.lang.Exception -> L75
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Exception -> L75
            boolean r1 = com.bxkj.base.util.a0.a(r1, r2)     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L75
            java.lang.String r1 = "stopService(new Intent(mContext, StepService.class))"
            com.orhanobut.logger.j.c(r1)     // Catch: java.lang.Exception -> L75
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L75
            android.content.Context r2 = r4.V     // Catch: java.lang.Exception -> L75
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L75
            r4.stopService(r1)     // Catch: java.lang.Exception -> L75
        L75:
            super.onDestroy()
            return
    }

    public void onPause() {
            r1 = this;
            com.bxkj.student.run.app.utils.g r0 = r1.Y0
            r0.c()
            super.onPause()
            return
    }

    public void onResume() {
            r5 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.bxkj.student.run.app.utils.g r0 = r5.Y0     // Catch: java.lang.Exception -> L1e
            r0.b(r5)     // Catch: java.lang.Exception -> L1e
            com.amap.api.maps.model.LatLng r0 = r5.o1     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L1e
            com.amap.api.maps.AMap r1 = r5.Z     // Catch: java.lang.Exception -> L1e
            r2 = 1099956224(0x41900000, float:18.0)
            com.amap.api.maps.model.CameraPosition r0 = com.amap.api.maps.model.CameraPosition.fromLatLngZoom(r0, r2)     // Catch: java.lang.Exception -> L1e
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(r0)     // Catch: java.lang.Exception -> L1e
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            r1.animateCamera(r0, r2, r4)     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            com.amap.api.maps.MapView r0 = r2.Y
            r0.onSaveInstanceState(r3)
            com.bxkj.student.run.app.offline.table.RunDb r0 = r2.X0
            if (r0 == 0) goto L12
            java.lang.String r1 = "runExceptionDataDBId"
            java.lang.String r0 = r0.getIdentify()
            r3.putString(r1, r0)
        L12:
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r3)
            return
    }

    public java.util.List<java.lang.Integer> r2() {
            r10 = this;
            long r0 = r10.k1
            r2 = 60
            long r4 = r0 / r2
            long r0 = r0 % r2
            r2 = 0
            r6 = 0
            r7 = 1
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L11
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            long r0 = (long) r0
            long r4 = r4 + r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.Integer> r1 = r10.r1
            r0.<init>(r1)
            int r1 = r10.p1
            int r2 = r10.q1
            int r2 = r1 - r2
            if (r1 >= 0) goto L25
            r10.p1 = r6
        L25:
            int r1 = r0.size()
            long r8 = (long) r1
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 >= 0) goto L36
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            return r0
        L36:
            int r1 = r0.size()
            if (r1 != 0) goto L44
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            return r0
        L44:
            int r1 = r0.size()
            int r1 = r1 - r7
            int r3 = r0.size()
            int r3 = r3 - r7
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.set(r1, r2)
            return r0
    }
}
