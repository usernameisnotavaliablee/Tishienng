package com.bxkj.student.v2.ui.sports.v3.detail.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3RecordTraceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3RecordTraceFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/V3RecordTraceFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 JsonGet.kt\ncom/bxkj/base/v2/common/utils/JsonGet\n*L\n1#1,413:1\n1869#2:414\n1563#2:415\n1634#2,3:416\n1870#2:419\n1869#2:420\n1870#2:422\n1056#2:423\n2756#2:424\n1563#2:426\n1634#2,3:427\n1563#2:430\n1634#2,3:431\n1#3:421\n1#3:425\n70#4,4:434\n*S KotlinDebug\n*F\n+ 1 V3RecordTraceFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/V3RecordTraceFragment\n*L\n100#1:414\n102#1:415\n102#1:416,3\n100#1:419\n119#1:420\n119#1:422\n132#1:423\n132#1:424\n189#1:426\n189#1:427,3\n260#1:430\n260#1:431,3\n132#1:425\n80#1:434,4\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordTraceFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.FmV3SportsTraceBinding, com.bxkj.student.v2.vm.sports.record.RecordDetailVM> {

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.AMap f1452l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private android.os.Bundle f1453m;

    /* renamed from: n, reason: collision with root package name */
    private final com.amap.api.maps.model.LatLngBounds.Builder f1454n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.amap.api.maps.model.LatLng> f1455o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 V3RecordTraceFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/V3RecordTraceFragment\n*L\n1#1,328:1\n132#2:329\n*E\n"})
    public static final class a<T> implements java.util.Comparator {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                java.util.Map r3 = (java.util.Map) r3
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "sort"
                int r3 = r0.k(r3, r1)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.Map r4 = (java.util.Map) r4
                int r4 = r0.k(r4, r1)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                int r3 = kotlin.comparisons.a.l(r3, r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements com.amap.api.maps.AMap.OnCameraChangeListener {
        private boolean a;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment b;
        final /* synthetic */ java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c;

        b(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r1, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r2) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0, java.util.List r1) {
                b(r0, r1)
                return
        }

        private static final void b(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r4, java.util.List r5) {
                androidx.databinding.ViewDataBinding r0 = r4.K()
                com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
                com.amap.api.maps.TextureMapView r0 = r0.map
                android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
                android.content.Context r2 = r4.G()
                r3 = 2131100584(0x7f0603a8, float:1.7813554E38)
                int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
                r1.<init>(r2)
                r0.setForeground(r1)
                androidx.databinding.ViewDataBinding r0 = r4.K()
                com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
                com.bxkj.student.run.app.utils.RecordPathView r0 = r0.rpv
                r0.e()
                androidx.databinding.ViewDataBinding r0 = r4.K()
                com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
                com.bxkj.student.run.app.utils.RecordPathView r0 = r0.rpv
                r1 = 8
                r0.setVisibility(r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment.h(r4, r5, r0)
                return
        }

        public void onCameraChange(com.amap.api.maps.model.CameraPosition r2) {
                r1 = this;
                java.lang.String r0 = "cameraPosition"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        public void onCameraChangeFinish(com.amap.api.maps.model.CameraPosition r7) {
                r6 = this;
                java.lang.String r0 = "cameraPosition"
                kotlin.jvm.internal.g0.p(r7, r0)
                boolean r7 = r6.a
                if (r7 != 0) goto L8f
                r7 = 1
                r6.a = r7
                com.bxkj.student.run.app.utils.q r0 = new com.bxkj.student.run.app.utils.q
                r0.<init>()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r1 = r6.b
                java.util.List r1 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment.k(r1)
                int r1 = r1.size()
            L1b:
                if (r7 >= r1) goto L6c
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r2 = r6.b
                java.util.List r2 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment.k(r2)
                int r3 = r7 + (-1)
                java.lang.Object r2 = r2.get(r3)
                com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r3 = r6.b
                java.util.List r3 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment.k(r3)
                java.lang.Object r3 = r3.get(r7)
                com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r4 = r6.b
                com.amap.api.maps.AMap r4 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment.j(r4)
                kotlin.jvm.internal.g0.m(r4)
                com.amap.api.maps.Projection r4 = r4.getProjection()
                android.graphics.Point r2 = r4.toScreenLocation(r2)
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r4 = r6.b
                com.amap.api.maps.AMap r4 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment.j(r4)
                kotlin.jvm.internal.g0.m(r4)
                com.amap.api.maps.Projection r4 = r4.getProjection()
                android.graphics.Point r3 = r4.toScreenLocation(r3)
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r4 = r6.b
                android.content.Context r4 = r4.G()
                r5 = 2131100565(0x7f060395, float:1.7813515E38)
                int r4 = androidx.core.content.ContextCompat.getColor(r4, r5)
                r0.a(r2, r3, r4, r4)
                int r7 = r7 + 1
                goto L1b
            L6c:
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r7 = r6.b
                androidx.databinding.ViewDataBinding r7 = r7.K()
                com.bxkj.student.databinding.FmV3SportsTraceBinding r7 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r7
                com.bxkj.student.run.app.utils.RecordPathView r7 = r7.rpv
                r7.setPath(r0)
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r7 = r6.b
                androidx.databinding.ViewDataBinding r7 = r7.K()
                com.bxkj.student.databinding.FmV3SportsTraceBinding r7 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r7
                com.bxkj.student.run.app.utils.RecordPathView r7 = r7.rpv
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0 = r6.b
                java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.c
                com.bxkj.student.v2.ui.sports.v3.detail.tab.j r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.j
                r2.<init>(r0, r1)
                r7.setOnAnimEnd(r2)
            L8f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJsonGet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonGet.kt\ncom/bxkj/base/v2/common/utils/JsonGet$jsonToObject$1\n*L\n1#1,575:1\n*E\n"})
    public static final class c extends com.google.gson.reflect.TypeToken<java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>> {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        d(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e implements com.amap.api.maps.AMap.OnMapScreenShotListener {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment a;

        e(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onMapScreenShot(android.graphics.Bitmap r4) {
                r3 = this;
                java.lang.String r0 = "bitmap"
                kotlin.jvm.internal.g0.p(r4, r0)
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0 = r3.a
                androidx.databinding.ViewDataBinding r1 = r0.K()
                com.bxkj.student.databinding.FmV3SportsTraceBinding r1 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r1
                com.google.android.material.card.MaterialCardView r1 = r1.cardBottom
                java.lang.String r2 = "cardBottom"
                kotlin.jvm.internal.g0.o(r1, r2)
                android.graphics.Bitmap r1 = r0.N(r1)
                android.graphics.Bitmap r4 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment.i(r0, r4, r1)
                if (r4 == 0) goto L2e
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0 = r3.a
                androidx.fragment.app.FragmentActivity r0 = r0.q()
                java.lang.String r1 = "null cannot be cast to non-null type com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity"
                kotlin.jvm.internal.g0.n(r0, r1)
                com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity r0 = (com.bxkj.student.v2.ui.sports.v3.detail.V3RecordDetailActivity) r0
                r0.P(r4)
            L2e:
                return
        }

        public void onMapScreenShot(android.graphics.Bitmap r1, int r2) {
                r0 = this;
                java.lang.String r2 = "bitmap"
                kotlin.jvm.internal.g0.p(r1, r2)
                return
        }
    }

    public V3RecordTraceFragment() {
            r1 = this;
            r1.<init>()
            com.amap.api.maps.model.LatLngBounds$Builder r0 = com.amap.api.maps.model.LatLngBounds.builder()
            r1.f1454n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1455o = r0
            return
    }

    private final void L(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r17, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r18, int r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r17
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$a
            r3.<init>()
            java.util.List r2 = kotlin.collections.f0.z5(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L171
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            com.amap.api.maps.model.LatLngBounds$Builder r5 = r0.f1454n
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            com.bxkj.base.v2.common.utils.x r7 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r8 = "latitude"
            double r9 = r7.f(r3, r8)
            java.lang.String r11 = "longitude"
            double r12 = r7.f(r3, r11)
            r6.<init>(r9, r12)
            r5.include(r6)
            r5 = r18
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L44:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L64
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7
            com.bxkj.base.v2.common.utils.x r9 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r10 = "id"
            java.lang.String r7 = r9.t(r7, r10)
            java.lang.String r9 = r9.t(r3, r10)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r9)
            if (r7 == 0) goto L44
            r4 = r6
        L64:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r6 = "content"
            java.lang.String r9 = ""
            java.lang.String r10 = "个"
            java.lang.String r12 = "第"
            java.lang.String r13 = "sort"
            r14 = 1
            if (r4 != 0) goto Lf0
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            r15 = r6
            double r5 = r4.f(r3, r8)
            double r7 = r4.f(r3, r11)
            com.amap.api.maps.model.LatLng r11 = new com.amap.api.maps.model.LatLng
            r11.<init>(r5, r7)
            if (r1 != r14) goto L8a
            java.lang.String r5 = r4.t(r3, r13)
            goto L8c
        L8a:
            java.lang.String r5 = "经"
        L8c:
            if (r1 != r14) goto La4
            java.lang.String r6 = r4.t(r3, r13)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r9 = r7.toString()
        La4:
            com.bxkj.student.v2.common.utils.c$a r6 = com.bxkj.student.v2.common.utils.c.a
            android.graphics.Bitmap r5 = r6.b(r5)
            com.amap.api.maps.model.BitmapDescriptor r5 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r5)
            com.amap.api.maps.model.MarkerOptions r6 = new com.amap.api.maps.model.MarkerOptions
            r6.<init>()
            com.amap.api.maps.model.MarkerOptions r6 = r6.position(r11)
            com.amap.api.maps.model.MarkerOptions r5 = r6.icon(r5)
            r6 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r5 = r5.zIndex(r6)
            java.lang.String r3 = r4.t(r3, r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "你未通过"
            r4.append(r6)
            r4.append(r9)
            java.lang.String r6 = "必经点："
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.amap.api.maps.model.MarkerOptions r3 = r5.title(r3)
            r4 = 0
            com.amap.api.maps.model.MarkerOptions r3 = r3.draggable(r4)
            com.amap.api.maps.AMap r4 = r0.f1452l
            if (r4 == 0) goto L17
            r4.addMarker(r3)
            goto L17
        Lf0:
            r15 = r6
            if (r1 != r14) goto Lfa
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = r3.t(r4, r13)
            goto Lfc
        Lfa:
            java.lang.String r3 = "√"
        Lfc:
            if (r1 != r14) goto L116
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = r5.t(r4, r13)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r5)
            r6.append(r10)
            java.lang.String r9 = r6.toString()
        L116:
            com.bxkj.student.v2.common.utils.c$a r5 = com.bxkj.student.v2.common.utils.c.a
            android.graphics.Bitmap r3 = r5.c(r3)
            com.amap.api.maps.model.BitmapDescriptor r3 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r3)
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            double r6 = r5.f(r4, r8)
            double r10 = r5.f(r4, r11)
            com.amap.api.maps.model.MarkerOptions r8 = new com.amap.api.maps.model.MarkerOptions
            r8.<init>()
            com.amap.api.maps.model.LatLng r12 = new com.amap.api.maps.model.LatLng
            r12.<init>(r6, r10)
            com.amap.api.maps.model.MarkerOptions r6 = r8.position(r12)
            com.amap.api.maps.model.MarkerOptions r3 = r6.icon(r3)
            r6 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r3 = r3.zIndex(r6)
            java.lang.String r4 = r5.t(r4, r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "你已经通过"
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = "必经点:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.amap.api.maps.model.MarkerOptions r3 = r3.title(r4)
            r4 = 0
            com.amap.api.maps.model.MarkerOptions r3 = r3.draggable(r4)
            com.amap.api.maps.AMap r4 = r0.f1452l
            if (r4 == 0) goto L17
            r4.addMarker(r3)
            goto L17
        L171:
            com.amap.api.maps.AMap r1 = r0.f1452l
            if (r1 == 0) goto L18e
            com.amap.api.maps.model.LatLngBounds$Builder r2 = r0.f1454n
            com.amap.api.maps.model.LatLngBounds r2 = r2.build()
            r3 = 1112014848(0x42480000, float:50.0)
            android.content.Context r5 = r0.G()
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r5)
            com.amap.api.maps.CameraUpdate r2 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r2, r3)
            r5 = 2000(0x7d0, double:9.88E-321)
            r1.animateCamera(r2, r5, r4)
        L18e:
            return
    }

    private final java.lang.String M(long r11) {
            r10 = this;
            r0 = 1024(0x400, float:1.435E-42)
            long r0 = (long) r0
            r2 = 1024(0x400, double:5.06E-321)
            long r4 = r0 * r2
            long r0 = r0 * r4
            r6 = 0
            java.lang.String r7 = "format(...)"
            r8 = 1
            int r9 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r9 < 0) goto L2c
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.a
            float r11 = (float) r11
            float r12 = (float) r0
            float r11 = r11 / r12
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r6] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r12, r8)
            java.lang.String r12 = "%.1f GB"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            kotlin.jvm.internal.g0.o(r11, r7)
            return r11
        L2c:
            r0 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 < 0) goto L54
            float r11 = (float) r11
            float r12 = (float) r4
            float r11 = r11 / r12
            kotlin.jvm.internal.t0 r12 = kotlin.jvm.internal.t0.a
            int r12 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r12 <= 0) goto L3e
            java.lang.String r12 = "%.0f MB"
            goto L40
        L3e:
            java.lang.String r12 = "%.1f MB"
        L40:
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r0, r8)
            java.lang.String r11 = java.lang.String.format(r12, r11)
            kotlin.jvm.internal.g0.o(r11, r7)
            return r11
        L54:
            int r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r1 < 0) goto L7a
            float r11 = (float) r11
            float r12 = (float) r2
            float r11 = r11 / r12
            kotlin.jvm.internal.t0 r12 = kotlin.jvm.internal.t0.a
            int r12 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r12 <= 0) goto L64
            java.lang.String r12 = "%.0f KB"
            goto L66
        L64:
            java.lang.String r12 = "%.1f KB"
        L66:
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r0, r8)
            java.lang.String r11 = java.lang.String.format(r12, r11)
            kotlin.jvm.internal.g0.o(r11, r7)
            return r11
        L7a:
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r6] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r12, r8)
            java.lang.String r12 = "%d B"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            kotlin.jvm.internal.g0.o(r11, r7)
            return r11
    }

    private final android.graphics.Bitmap O(android.graphics.Bitmap r9, android.graphics.Bitmap r10) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            int r3 = r10.getWidth()
            int r4 = r10.getHeight()
            int r4 = r4 + r2
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r1, r4, r5)
            java.lang.String r5 = "createBitmap(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            r6 = 255(0xff, float:3.57E-43)
            r7 = 224(0xe0, float:3.14E-43)
            r5.drawARGB(r6, r7, r7, r7)
            r6 = 0
            r5.drawBitmap(r9, r6, r6, r0)
            int r1 = r1 - r3
            r9 = 1092616192(0x41200000, float:10.0)
            android.content.Context r3 = r8.G()
            int r9 = cn.bluemobi.dylan.base.utils.u.a(r9, r3)
            int r1 = r1 - r9
            float r9 = (float) r1
            float r1 = (float) r2
            r5.drawBitmap(r10, r9, r1, r0)
            android.graphics.Paint r9 = new android.graphics.Paint
            r10 = 1
            r9.<init>(r10)
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setColor(r10)
            android.content.Context r10 = r8.G()
            r0 = 1101004800(0x41a00000, float:20.0)
            int r10 = cn.bluemobi.dylan.base.utils.u.a(r0, r10)
            float r10 = (float) r10
            r9.setTextSize(r10)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r1 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r1 = r8.getString(r1)
            com.bxkj.student.v2.common.utils.r$a r2 = com.bxkj.student.v2.common.utils.r.a
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            androidx.databinding.ViewDataBinding r6 = r8.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r6 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r6
            java.util.Map r6 = r6.getDataMap()
            java.lang.String r7 = "sportType"
            int r3 = r3.k(r6, r7)
            java.lang.String r2 = r2.d(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "-"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r2 = 0
            int r3 = r1.length()
            r9.getTextBounds(r1, r2, r3, r10)
            android.content.Context r10 = r8.G()
            int r10 = cn.bluemobi.dylan.base.utils.u.a(r0, r10)
            float r10 = (float) r10
            android.content.Context r2 = r8.G()
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r0, r2)
            float r0 = (float) r0
            r5.drawText(r1, r10, r0, r9)
            r5.save()
            r5.restore()
            return r4
    }

    private final void P(java.util.List<com.amap.api.maps.model.LatLng> r4) {
            r3 = this;
            com.amap.api.maps.AMap r0 = r3.f1452l
            if (r0 == 0) goto L44
            com.amap.api.maps.model.PolylineOptions r1 = new com.amap.api.maps.model.PolylineOptions
            r1.<init>()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            com.amap.api.maps.model.PolylineOptions r4 = r1.addAll(r4)
            r1 = 1086324736(0x40c00000, float:6.0)
            android.content.Context r2 = r3.G()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            float r1 = (float) r1
            com.amap.api.maps.model.PolylineOptions r4 = r4.width(r1)
            r1 = 1
            com.amap.api.maps.model.PolylineOptions r4 = r4.setDottedLine(r1)
            android.content.Context r1 = r3.G()
            r2 = 2131099715(0x7f060043, float:1.7811791E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            com.amap.api.maps.model.PolylineOptions r4 = r4.color(r1)
            r1 = 1084227584(0x40a00000, float:5.0)
            android.content.Context r2 = r3.G()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            float r1 = (float) r1
            com.amap.api.maps.model.PolylineOptions r4 = r4.zIndex(r1)
            r0.addPolyline(r4)
        L44:
            return
    }

    private final void R() {
            r3 = this;
            com.amap.api.maps.AMap r0 = r3.f1452l
            if (r0 == 0) goto L2c
            java.util.List r0 = r0.getMapScreenMarkers()
            if (r0 == 0) goto L2c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.model.Marker r1 = (com.amap.api.maps.model.Marker) r1
            if (r1 == 0) goto L10
            boolean r2 = r1.isInfoWindowShown()
            if (r2 == 0) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L10
            r1.hideInfoWindow()
            goto L10
        L2c:
            return
    }

    private final void S(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r9) {
            r8 = this;
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            java.lang.String r4 = "a"
            double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r2, r4)
            java.lang.String r6 = "o"
            double r6 = cn.bluemobi.dylan.http.JsonParse.getDouble(r2, r6)
            r3.<init>(r4, r6)
            r1.add(r3)
            goto L12
        L33:
            java.util.List r0 = kotlin.collections.f0.d6(r1)
            r8.f1455o = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L41
            goto L108
        L41:
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r8.f1455o
            int r0 = r0.size()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L8c
            com.bxkj.student.run.app.utils.p r0 = new com.bxkj.student.run.app.utils.p
            r0.<init>()
            r0.p(r3)
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r8.f1455o
            java.util.List r0 = r0.k(r1)
            if (r0 == 0) goto L64
            int r1 = r0.size()
            if (r1 <= 0) goto L64
            r8.f1455o = r0
        L64:
            int r0 = r9.size()
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r8.f1455o
            int r1 = r1.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "优化前latLngs="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "优化后latLngs="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r0, r1)
        L8c:
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r8.f1455o
            int r0 = r0.size()
            if (r0 != r3) goto L9d
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r8.f1455o
            java.lang.Object r1 = r0.get(r2)
            r0.add(r1)
        L9d:
            r0 = 2131689681(0x7f0f00d1, float:1.9008384E38)
            com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r0)
            com.amap.api.maps.model.MarkerOptions r1 = new com.amap.api.maps.model.MarkerOptions
            r1.<init>()
            java.util.List<com.amap.api.maps.model.LatLng> r4 = r8.f1455o
            java.lang.Object r2 = r4.get(r2)
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2
            com.amap.api.maps.model.MarkerOptions r1 = r1.position(r2)
            com.amap.api.maps.model.MarkerOptions r0 = r1.icon(r0)
            r1 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r0 = r0.zIndex(r1)
            com.amap.api.maps.model.MarkerOptions r0 = r0.draggable(r3)
            com.amap.api.maps.AMap r1 = r8.f1452l
            kotlin.jvm.internal.g0.m(r1)
            com.amap.api.maps.model.Marker r0 = r1.addMarker(r0)
            com.amap.api.maps.model.animation.ScaleAnimation r1 = new com.amap.api.maps.model.animation.ScaleAnimation
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r3, r2, r3)
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.setDuration(r2)
            r0.setAnimation(r1)
            r0.startAnimation()
            com.amap.api.maps.AMap r0 = r8.f1452l
            kotlin.jvm.internal.g0.m(r0)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$b r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$b
            r1.<init>(r8, r9)
            r0.setOnCameraChangeListener(r1)
            java.util.List<com.amap.api.maps.model.LatLng> r9 = r8.f1455o
            java.util.Iterator r9 = r9.iterator()
        Lf2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L108
            java.lang.Object r0 = r9.next()
            com.amap.api.maps.model.LatLng r0 = (com.amap.api.maps.model.LatLng) r0
            com.amap.api.maps.model.LatLngBounds$Builder r1 = r8.f1454n
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r1.include(r0)
            r0.build()
            goto Lf2
        L108:
            return
    }

    private static final kotlin.n1 T(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r6, java.util.Map r7) {
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "stepNumbers"
            java.util.List r0 = r0.m(r7, r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L11:
            if (r2 >= r1) goto L21
            java.lang.Object r4 = r0.get(r2)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L11
        L21:
            kotlin.jvm.internal.g0.m(r7)
            java.util.Map r0 = kotlin.collections.i1.J0(r7)
            java.lang.String r1 = "stepCount"
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r0.put(r1, r2)
            androidx.databinding.ViewDataBinding r1 = r6.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r1 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r1
            r1.setDataMap(r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "pointList"
            java.util.List r1 = r0.n(r7, r1)
            java.lang.String r2 = "okPointList"
            java.util.List r2 = r0.n(r7, r2)
            java.lang.String r3 = "isSequencePoint"
            int r3 = r0.k(r7, r3)
            java.lang.String r4 = "gitudeLatitude"
            java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r4)
            java.lang.String r5 = "getList(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            r6.S(r4)
            r6.L(r1, r2, r3)
            java.lang.String r1 = "geofence"
            java.lang.String r7 = r0.t(r7, r1)
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L78
            r0.<init>()     // Catch: java.lang.Exception -> L78
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$c r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$c     // Catch: java.lang.Exception -> L78
            r1.<init>()     // Catch: java.lang.Exception -> L78
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Exception -> L78
            java.lang.Object r7 = r0.fromJson(r7, r1)     // Catch: java.lang.Exception -> L78
            goto L79
        L78:
            r7 = 0
        L79:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L80
            r6.l(r7)
        L80:
            com.amap.api.maps.AMap r7 = r6.f1452l
            if (r7 == 0) goto L8c
            com.bxkj.student.v2.ui.sports.v3.detail.tab.g r0 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.g
            r0.<init>(r6)
            r7.setOnMapClickListener(r0)
        L8c:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    private static final void U(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0, com.amap.api.maps.model.LatLng r1) {
            r0.R()
            return
    }

    private static final kotlin.n1 V(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r3, java.util.Map r4) {
            android.content.Context r0 = r3.G()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "imageRouteUrl"
            java.lang.String r4 = r1.t(r4, r2)
            androidx.databinding.ViewDataBinding r3 = r3.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r3 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r3
            com.google.android.material.imageview.ShapeableImageView r3 = r3.ivHead
            r1 = 2131690190(0x7f0f02ce, float:1.9009417E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r4, r3, r1, r1)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = T(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = V(r0, r1)
            return r0
    }

    public static /* synthetic */ void g(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0, com.amap.api.maps.model.LatLng r1) {
            U(r0, r1)
            return
    }

    public static final /* synthetic */ void h(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0, java.util.List r1, java.util.List r2) {
            r0.m(r1, r2)
            return
    }

    public static final /* synthetic */ android.graphics.Bitmap i(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0, android.graphics.Bitmap r1, android.graphics.Bitmap r2) {
            android.graphics.Bitmap r0 = r0.O(r1, r2)
            return r0
    }

    public static final /* synthetic */ com.amap.api.maps.AMap j(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0) {
            com.amap.api.maps.AMap r0 = r0.f1452l
            return r0
    }

    public static final /* synthetic */ java.util.List k(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment r0) {
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r0.f1455o
            return r0
    }

    private final void l(java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r10) {
            r9 = this;
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r10.next()
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "lat"
            java.lang.String r5 = r4.t(r2, r5)
            double r5 = java.lang.Double.parseDouble(r5)
            java.lang.String r7 = "lng"
            java.lang.String r2 = r4.t(r2, r7)
            double r7 = java.lang.Double.parseDouble(r2)
            r3.<init>(r5, r7)
            r1.add(r3)
            goto L23
        L4e:
            com.amap.api.maps.model.PolygonOptions r0 = new com.amap.api.maps.model.PolygonOptions
            r0.<init>()
            r0.addAll(r1)
            androidx.fragment.app.FragmentActivity r1 = r9.q()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r1 = r1.getColor(r2)
            r0.fillColor(r1)
            androidx.fragment.app.FragmentActivity r1 = r9.q()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100554(0x7f06038a, float:1.7813493E38)
            int r1 = r1.getColor(r2)
            r0.strokeColor(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            r0.strokeWidth(r1)
            com.amap.api.maps.AMap r1 = r9.f1452l
            if (r1 == 0) goto L6
            r1.addPolygon(r0)
            goto L6
        L88:
            return
    }

    private final void m(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r18, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r1.next()
            java.util.Map r3 = (java.util.Map) r3
            com.bxkj.student.v2.common.data.PointData r4 = new com.bxkj.student.v2.common.data.PointData
            java.lang.String r5 = "a"
            double r5 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r5)
            java.lang.String r7 = "o"
            double r7 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r7)
            java.lang.String r9 = "t"
            long r9 = cn.bluemobi.dylan.http.JsonParse.getLong(r3, r9)
            java.lang.String r11 = "s"
            float r11 = cn.bluemobi.dylan.http.JsonParse.getFloat(r3, r11)
            java.lang.String r12 = "i"
            boolean r12 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r12)
            java.lang.String r13 = "l"
            int r13 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r13)
            java.lang.String r14 = "c"
            long r14 = cn.bluemobi.dylan.http.JsonParse.getLong(r3, r14)
            r18 = r1
            java.lang.String r1 = "e"
            int r16 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
            r4.<init>(r5, r7, r9, r11, r12, r13, r14, r16)
            r2.add(r4)
            r1 = r18
            goto L15
        L5e:
            com.bxkj.student.v2.common.utils.f r1 = new com.bxkj.student.v2.common.utils.f
            android.content.Context r3 = r0.G()
            com.amap.api.maps.AMap r4 = r0.f1452l
            r1.<init>(r3, r4)
            r1.a(r2)
            r1 = 2131689680(0x7f0f00d0, float:1.9008382E38)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r1)
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions
            r2.<init>()
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r0.f1455o
            int r4 = r3.size()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r3 = r3.get(r4)
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3
            com.amap.api.maps.model.MarkerOptions r2 = r2.position(r3)
            com.amap.api.maps.model.MarkerOptions r1 = r2.icon(r1)
            r2 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r1 = r1.zIndex(r2)
            com.amap.api.maps.model.MarkerOptions r1 = r1.draggable(r5)
            com.amap.api.maps.AMap r2 = r0.f1452l
            kotlin.jvm.internal.g0.m(r2)
            r2.addMarker(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap N(@org.jetbrains.annotations.NotNull android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            r2.setDrawingCacheEnabled(r0)
            r2.buildDrawingCache()
            android.graphics.Bitmap r2 = r2.getDrawingCache()
            java.lang.String r0 = "getDrawingCache(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    public final com.amap.api.maps.model.LatLngBounds.Builder Q() {
            r1 = this;
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r1.f1454n
            return r0
    }

    public final void W() {
            r2 = this;
            com.amap.api.maps.AMap r0 = r2.f1452l
            if (r0 == 0) goto Lc
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$e r1 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$e
            r1.<init>(r2)
            r0.getMapScreenShot(r1)
        Lc:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r2 = "requireActivity(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            java.lang.Class<com.bxkj.student.v2.vm.sports.record.RecordDetailVM> r1 = com.bxkj.student.v2.vm.sports.record.RecordDetailVM.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = (com.bxkj.base.v2.base.BaseViewModel) r0
            r4.w(r0)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.w()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.h r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.h
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$d r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$d
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.F()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.i r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.i
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$d r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordTraceFragment$d
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r0.f1453m = r1
            return
    }

    public void onDestroyView() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
            com.amap.api.maps.TextureMapView r0 = r0.map
            r0.onDestroy()
            super.onDestroyView()
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
            com.amap.api.maps.TextureMapView r0 = r0.map
            r0.onPause()
            return
    }

    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
            com.amap.api.maps.TextureMapView r0 = r0.map
            r0.onResume()
            return
    }

    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.g0.p(r2, r0)
            super.onSaveInstanceState(r2)
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
            com.amap.api.maps.TextureMapView r0 = r0.map
            r0.onSaveInstanceState(r2)
            super.onSaveInstanceState(r2)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r4 = this;
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            java.lang.String r1 = "requireActivity(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r4.d(r0)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
            com.amap.api.maps.TextureMapView r0 = r0.map
            com.amap.api.maps.AMap r0 = r0.getMap()
            r4.f1452l = r0
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
            com.amap.api.maps.TextureMapView r0 = r0.map
            android.os.Bundle r1 = r4.f1453m
            r0.onCreate(r1)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.FmV3SportsTraceBinding r0 = (com.bxkj.student.databinding.FmV3SportsTraceBinding) r0
            com.amap.api.maps.TextureMapView r0 = r0.map
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            android.content.Context r2 = r4.G()
            r3 = 2131100543(0x7f06037f, float:1.781347E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            r1.<init>(r2)
            r0.setForeground(r1)
            return
    }
}
