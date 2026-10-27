package com.bxkj.student.v2.ui.sports.v3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV4SportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V4SportActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/V4SportActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,626:1\n1#2:627\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V4SportActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV4SportsBinding, com.bxkj.student.v2.vm.sports.SportsVM> {
    private boolean F0;

    @org.jetbrains.annotations.Nullable
    private android.content.BroadcastReceiver G0;

    @org.jetbrains.annotations.Nullable
    private android.content.BroadcastReceiver H0;

    @org.jetbrains.annotations.Nullable
    private android.os.Handler W;

    @org.jetbrains.annotations.Nullable
    private java.lang.Runnable X;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver Y;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver Z;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer a0;
    private boolean b0;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s c0;

    /* renamed from: k0, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final android.content.ServiceConnection f1448k0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f1449p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements android.widget.SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V4SportActivity a;

        a(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r5) {
                r4 = this;
                if (r5 == 0) goto L1a
                int r0 = r5.getProgress()
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r1 = r4.a
                r2 = 0
                r3 = 100
                if (r0 >= r3) goto L11
                r5.setProgress(r2)
                return
            L11:
                r5.setProgress(r3)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity.O(r1)
                r5.setProgress(r2)
            L1a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements android.content.ServiceConnection {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V4SportActivity a;

        b(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
                r2 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r3 = "binder"
                kotlin.jvm.internal.g0.p(r4, r3)
                com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService$a r4 = (com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService.a) r4
                android.app.Service r3 = r4.a()
                android.content.Intent r4 = new android.content.Intent
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0 = r2.a
                android.content.Context r0 = r0.G()
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService> r1 = com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService.class
                r4.<init>(r0, r1)
                r3.startService(r4)
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V4SportActivity a;

        c(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onSlide(android.view.View r2, float r3) {
                r1 = this;
                java.lang.String r0 = "bottomSheet"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r2 = r1.a
                androidx.databinding.ViewDataBinding r2 = r2.K()
                com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r2.expandView
                r2.setAlpha(r3)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r2 = r1.a
                androidx.databinding.ViewDataBinding r2 = r2.K()
                com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r2.collapseView
                r0 = 1
                float r0 = (float) r0
                float r0 = r0 - r3
                r2.setAlpha(r0)
                return
        }

        public void onStateChanged(android.view.View r3, int r4) {
                r2 = this;
                java.lang.String r0 = "bottomSheet"
                kotlin.jvm.internal.g0.p(r3, r0)
                r3 = 3
                r0 = 0
                r1 = 4
                if (r4 == r3) goto L45
                if (r4 == r1) goto L10
                r3 = 6
                if (r4 == r3) goto L45
                return
            L10:
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.expandView
                r3.setVisibility(r1)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.collapseView
                r3.setVisibility(r0)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
                com.google.android.material.card.MaterialCardView r3 = r3.bottomCard
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r4 = r2.a
                android.content.Context r4 = r4.G()
                r0 = 2131099737(0x7f060059, float:1.7811836E38)
                int r4 = androidx.core.content.ContextCompat.getColor(r4, r0)
                r3.setCardBackgroundColor(r4)
                return
            L45:
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.expandView
                r3.setVisibility(r0)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.collapseView
                r3.setVisibility(r1)
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3 = r2.a
                androidx.databinding.ViewDataBinding r3 = r3.K()
                com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
                com.google.android.material.card.MaterialCardView r3 = r3.bottomCard
                com.bxkj.student.v2.ui.sports.v3.V4SportActivity r4 = r2.a
                android.content.Context r4 = r4.G()
                r0 = 2131100700(0x7f06041c, float:1.7813789E38)
                int r4 = androidx.core.content.ContextCompat.getColor(r4, r0)
                r3.setCardBackgroundColor(r4)
                return
        }
    }

    static {
            r0 = 17999(0x464f, float:2.5222E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public V4SportActivity() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.ui.sports.v3.v1 r0 = new com.bxkj.student.v2.ui.sports.v3.v1
            r0.<init>(r1)
            kotlin.s r0 = kotlin.t.c(r0)
            r1.c0 = r0
            com.bxkj.student.v2.ui.sports.v3.V4SportActivity$b r0 = new com.bxkj.student.v2.ui.sports.v3.V4SportActivity$b
            r0.<init>(r1)
            r1.f1448k0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 L() {
            kotlin.n1 r0 = W()
            return r0
    }

    public static /* synthetic */ kotlin.n1 M(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0, l0.d r1) {
            kotlin.n1 r0 = X(r0, r1)
            return r0
    }

    public static /* synthetic */ void N(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0) {
            Y(r0)
            return
    }

    public static final /* synthetic */ void O(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0) {
            r0.l0()
            return
    }

    private final void P() {
            r4 = this;
            com.bxkj.student.v2.ui.sports.v3.V4SportActivity$addBroadCastReceiver$1 r0 = new com.bxkj.student.v2.ui.sports.v3.V4SportActivity$addBroadCastReceiver$1
            r0.<init>(r4)
            r4.G0 = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".run"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            android.content.BroadcastReceiver r1 = r4.G0
            if (r1 == 0) goto L31
            java.lang.String r2 = "com.bxkj.student.sports.permissions.V3_Sports_BROADCAST"
            r3 = 0
            r4.registerReceiver(r1, r0, r2, r3)
        L31:
            com.bxkj.student.v2.ui.sports.v3.V4SportActivity$addBroadCastReceiver$3 r0 = new com.bxkj.student.v2.ui.sports.v3.V4SportActivity$addBroadCastReceiver$3
            r0.<init>(r4)
            r4.H0 = r0
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            r1.<init>(r2)
            r4.registerReceiver(r0, r1)
            return
    }

    private static final com.google.android.material.bottomsheet.BottomSheetBehavior Q(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0) {
            androidx.databinding.ViewDataBinding r0 = r0.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.core.widget.NestedScrollView r0 = r0.bottomSheet
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r0)
            return r0
    }

    private static final void V(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r2) {
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            r1 = 1
            r0.w0(r1)
            com.bxkj.student.v2.ui.sports.v3.V3SportsFinishDialog r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsFinishDialog
            r0.<init>()
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            java.lang.String r1 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.String r1 = "finishDialog"
            r0.show(r2, r1)
            com.bxkj.student.v2.ui.sports.v3.u1 r2 = new com.bxkj.student.v2.ui.sports.v3.u1
            r2.<init>()
            r0.r0(r2)
            return
    }

    private static final kotlin.n1 W() {
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            r1 = 0
            r0.w0(r1)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 X(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3, l0.d r4) {
            r3.i0()
            com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r4 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver
            com.bxkj.base.v2.base.BaseViewModel r0 = r3.C()
            com.bxkj.student.v2.vm.sports.SportsVM r0 = (com.bxkj.student.v2.vm.sports.SportsVM) r0
            androidx.databinding.ViewDataBinding r1 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r1 = (com.bxkj.student.databinding.AcV4SportsBinding) r1
            com.amap.api.maps.MapView r1 = r1.mMapView
            com.amap.api.maps.AMap r1 = r1.getMap()
            java.lang.String r2 = "getMap(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r4.<init>(r3, r0, r1)
            r3.Y = r4
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r3.addObserver(r4)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final void Y(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0) {
            r0.l0()
            return
    }

    private final void c0() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.expandView
            r1 = 4
            r0.setVisibility(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.collapseView
            com.bxkj.student.v2.ui.sports.v3.t1 r1 = new com.bxkj.student.v2.ui.sports.v3.t1
            r1.<init>(r2)
            r0.post(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.U()
            com.bxkj.student.v2.ui.sports.v3.V4SportActivity$c r1 = new com.bxkj.student.v2.ui.sports.v3.V4SportActivity$c
            r1.<init>(r2)
            r0.addBottomSheetCallback(r1)
            return
    }

    private static final void d0(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r3) {
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.collapseView
            int r0 = r0.getHeight()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "底部抽屉默认高度："
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r1, r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.U()
            r2 = 1106247680(0x41f00000, float:30.0)
            android.content.Context r3 = r3.G()
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            int r0 = r0 + r3
            r1.setPeekHeight(r0)
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0) {
            d0(r0)
            return
    }

    public static /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0) {
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = Q(r0)
            return r0
    }

    public static /* synthetic */ void g(com.bxkj.student.v2.ui.sports.v3.V4SportActivity r0) {
            V(r0)
            return
    }

    private final void h0() {
            r4 = this;
            boolean r0 = r4.b0
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r4
            goto L8
        L7:
            r0 = r1
        L8:
            if (r0 == 0) goto L39
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r4.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity> r3 = com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity.class
            r0.<init>(r2, r3)
            r4.startActivity(r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r2 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r2 = r2.B()
            java.lang.String r3 = "context"
            java.lang.String r0 = r0.t(r2, r3)
            int r2 = r0.length()
            if (r2 <= 0) goto L2d
            r1 = r0
        L2d:
            if (r1 == 0) goto L39
            java.lang.String r0 = "温馨提示"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = com.bxkj.base.v2.common.ext.ContextExtKt.n(r4, r1, r0)
            r1 = 3
            r0.setMessageGrivity(r1)
        L39:
            return
    }

    private final void i0() {
            r3 = this;
            android.content.Context r0 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.V3LocationService> r1 = com.bxkj.student.v2.ui.sports.v3.service.V3LocationService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            if (r0 != 0) goto L22
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L1f
            com.bxkj.student.v2.ui.sports.v3.p1.a(r3, r0)
            return
        L1f:
            r3.startService(r0)
        L22:
            return
    }

    private final void l0() {
            r3 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.U()
            r1 = 1
            r0.setDraggable(r1)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivLock
            r1 = 0
            r0.setVisibility(r1)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.google.android.material.card.MaterialCardView r0 = r0.cvToMap
            r0.setVisibility(r1)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.bxkj.student.common.view.LongPressButton r0 = r0.ivStop
            r0.setVisibility(r1)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.appcompat.widget.AppCompatSeekBar r0 = r0.sbLock
            android.view.ViewParent r0 = r0.getParent()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.view.View r0 = (android.view.View) r0
            r1 = 8
            r0.setVisibility(r1)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r1 = r1.B()
            java.lang.String r2 = "runType"
            r0.k(r1, r2)
            return
    }

    public final void R() {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.U()
            boolean r0 = r0.isDraggable()
            if (r0 == 0) goto L12
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.U()
            r1 = 4
            r0.setState(r1)
        L12:
            return
    }

    public final void S() {
            r1 = this;
            r0 = 1
            r1.f1449p0 = r0
            r1.j0()
            return
    }

    public final void T() {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.U()
            boolean r0 = r0.isDraggable()
            if (r0 == 0) goto L12
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.U()
            r1 = 3
            r0.setState(r1)
        L12:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> U() {
            r2 = this;
            kotlin.s r0 = r2.c0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            return r0
    }

    public final boolean Z() {
            r1 = this;
            boolean r0 = r1.f1449p0
            return r0
    }

    public final boolean a0() {
            r1 = this;
            boolean r0 = r1.F0
            return r0
    }

    public final void b0() {
            r3 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.U()
            r1 = 0
            r0.setDraggable(r1)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivLock
            r2 = 4
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.google.android.material.card.MaterialCardView r0 = r0.cvToMap
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.bxkj.student.common.view.LongPressButton r0 = r0.ivStop
            r0.setVisibility(r2)
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.appcompat.widget.AppCompatSeekBar r0 = r0.sbLock
            android.view.ViewParent r0 = r0.getParent()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.View"
            kotlin.jvm.internal.g0.n(r0, r2)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r1 = r1.B()
            java.lang.String r2 = "runType"
            r0.k(r1, r2)
            return
    }

    public final void e0(boolean r1) {
            r0 = this;
            r0.f1449p0 = r1
            return
    }

    public final void f0(boolean r1) {
            r0 = this;
            r0.F0 = r1
            return
    }

    public final void g0() {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.U()
            r1 = 4
            r0.setState(r1)
            return
    }

    public final void j0() {
            r7 = this;
            boolean r0 = r7.isFinishing()
            if (r0 == 0) goto L8
            goto L10d
        L8:
            boolean r0 = r7.isDestroyed()
            if (r0 == 0) goto L10
            goto L10d
        L10:
            boolean r0 = r7.f1449p0
            if (r0 != 0) goto L16
            goto L10d
        L16:
            boolean r0 = r7.F0
            if (r0 != 0) goto L1c
            goto L10d
        L1c:
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            long r1 = r0.D()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L7b
            long r1 = r0.v()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L4c
            long r1 = r0.E()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L3d
            long r1 = java.lang.System.currentTimeMillis()
            goto L59
        L3d:
            long r1 = r0.E()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.F()
        L49:
            long r3 = r3 - r5
            long r1 = r1 + r3
            goto L59
        L4c:
            long r1 = r0.v()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.w()
            goto L49
        L59:
            r0.s0(r1)
            long r0 = r0.D()
            java.lang.String r0 = com.bxkj.base.v2.common.ext.g.d(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "真正的跑步开始时间："
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
        L7b:
            boolean r0 = r7.b0
            if (r0 != 0) goto L8f
            m0.a$a r0 = m0.a.a
            android.content.Context r1 = r7.G()
            r2 = 2131886172(0x7f12005c, float:1.9406915E38)
            int[] r2 = new int[]{r2}
            r0.b(r1, r2)
        L8f:
            com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver
            com.bxkj.base.v2.base.BaseViewModel r1 = r7.C()
            com.bxkj.student.v2.vm.sports.SportsVM r1 = (com.bxkj.student.v2.vm.sports.SportsVM) r1
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.amap.api.maps.MapView r2 = r2.mMapView
            com.amap.api.maps.AMap r2 = r2.getMap()
            java.lang.String r3 = "getMap(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r0.<init>(r7, r1, r2)
            r7.Z = r0
            androidx.lifecycle.Lifecycle r1 = r7.getLifecycle()
            r1.addObserver(r0)
            com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer
            com.bxkj.base.v2.base.BaseViewModel r1 = r7.C()
            com.bxkj.student.v2.vm.sports.SportsVM r1 = (com.bxkj.student.v2.vm.sports.SportsVM) r1
            androidx.databinding.ViewDataBinding r2 = r7.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.amap.api.maps.MapView r2 = r2.mMapView
            java.lang.String r3 = "mMapView"
            kotlin.jvm.internal.g0.o(r2, r3)
            r0.<init>(r7, r1, r2)
            r7.a0 = r0
            androidx.lifecycle.Lifecycle r1 = r7.getLifecycle()
            r1.addObserver(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.V3LocationService> r1 = com.bxkj.student.v2.ui.sports.v3.service.V3LocationService.class
            r0.<init>(r7, r1)
            java.lang.String r1 = "start"
            r2 = 1
            r0.putExtra(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto Lec
            com.bxkj.student.v2.ui.sports.v3.p1.a(r7, r0)
            goto Lef
        Lec:
            r7.startService(r0)
        Lef:
            android.content.Context r0 = r7.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService> r3 = com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService.class
            java.lang.String r4 = r3.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r4)
            if (r0 != 0) goto L10d
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r7, r3)
            if (r1 < r2) goto L10a
            com.bxkj.student.v2.ui.sports.v3.p1.a(r7, r0)
            return
        L10a:
            r7.startService(r0)
        L10d:
            return
    }

    public final void k0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.SportsSetActivity> r2 = com.bxkj.student.v2.ui.sports.set.SportsSetActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void m0() {
            r8 = this;
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            r0.x0()
            double r1 = r0.g()
            androidx.databinding.ViewDataBinding r3 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
            com.bxkj.student.v2.common.view.StepArcView r3 = r3.saDistance
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.base.v2.base.BaseViewModel r5 = r8.C()
            com.bxkj.student.v2.vm.sports.SportsVM r5 = (com.bxkj.student.v2.vm.sports.SportsVM) r5
            java.util.Map r5 = r5.M()
            java.lang.String r6 = "totalRange"
            float r5 = r4.i(r5, r6)
            r3.k(r5)
            androidx.databinding.ViewDataBinding r3 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
            com.bxkj.student.v2.common.view.StepArcView r3 = r3.saDistance
            com.bxkj.base.v2.base.BaseViewModel r5 = r8.C()
            com.bxkj.student.v2.vm.sports.SportsVM r5 = (com.bxkj.student.v2.vm.sports.SportsVM) r5
            java.util.Map r5 = r5.M()
            java.lang.String r5 = r4.t(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "目标里程："
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = "KM"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3.p(r5)
            androidx.databinding.ViewDataBinding r3 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
            android.widget.TextView r3 = r3.tvDistance
            java.lang.String r5 = com.bxkj.student.run.app.utils.i.c(r1)
            r3.setText(r5)
            androidx.databinding.ViewDataBinding r3 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
            com.bxkj.student.v2.common.view.StepArcView r3 = r3.saDistance
            double r5 = com.bxkj.student.run.app.utils.i.e(r1)
            float r5 = (float) r5
            r3.l(r5)
            androidx.databinding.ViewDataBinding r3 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
            com.bxkj.student.v2.common.view.StepArcView r3 = r3.saDistance
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.c(r1)
            r3.n(r1)
            androidx.databinding.ViewDataBinding r1 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r1 = (com.bxkj.student.databinding.AcV4SportsBinding) r1
            com.bxkj.student.v2.common.view.StepArcView r1 = r1.saTime
            com.bxkj.base.v2.base.BaseViewModel r2 = r8.C()
            com.bxkj.student.v2.vm.sports.SportsVM r2 = (com.bxkj.student.v2.vm.sports.SportsVM) r2
            java.util.Map r2 = r2.M()
            java.lang.String r3 = "startQualifiedTime"
            float r2 = r4.i(r2, r3)
            r1.k(r2)
            int r1 = r0.b()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r1.intValue()
            r5 = -1
            if (r2 == r5) goto Lae
            goto Laf
        Lae:
            r1 = 0
        Laf:
            if (r1 == 0) goto Lf8
            int r1 = r1.intValue()
            androidx.databinding.ViewDataBinding r2 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saTime
            float r5 = (float) r1
            r2.o(r5)
            androidx.databinding.ViewDataBinding r2 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saTime
            com.bxkj.base.v2.base.BaseViewModel r5 = r8.C()
            com.bxkj.student.v2.vm.sports.SportsVM r5 = (com.bxkj.student.v2.vm.sports.SportsVM) r5
            java.util.Map r5 = r5.M()
            java.lang.String r3 = r4.t(r5, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "有效时间：("
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "-"
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = ")分"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.p(r1)
        Lf8:
            int r0 = r0.a()
            androidx.databinding.ViewDataBinding r1 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r1 = (com.bxkj.student.databinding.AcV4SportsBinding) r1
            com.bxkj.student.v2.common.view.StepArcView r1 = r1.saStep
            float r2 = (float) r0
            r1.k(r2)
            androidx.databinding.ViewDataBinding r1 = r8.K()
            com.bxkj.student.databinding.AcV4SportsBinding r1 = (com.bxkj.student.databinding.AcV4SportsBinding) r1
            com.bxkj.student.v2.common.view.StepArcView r1 = r1.saStep
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "达标步数："
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.p(r0)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.common.view.b
    public void onBackPressed() {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.U()
            r1 = 3
            r0.setState(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected native void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1);

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected void onDestroy() {
            r2 = this;
            super.onDestroy()
            android.content.BroadcastReceiver r0 = r2.G0
            if (r0 == 0) goto La
            r2.unregisterReceiver(r0)
        La:
            android.content.BroadcastReceiver r0 = r2.H0
            if (r0 == 0) goto L11
            r2.unregisterReceiver(r0)
        L11:
            com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0 = r2.Y
            if (r0 == 0) goto L1c
            androidx.lifecycle.Lifecycle r1 = r2.getLifecycle()
            r1.removeObserver(r0)
        L1c:
            com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver r0 = r2.Z
            if (r0 == 0) goto L27
            androidx.lifecycle.Lifecycle r1 = r2.getLifecycle()
            r1.removeObserver(r0)
        L27:
            com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0 = r2.a0
            if (r0 == 0) goto L32
            androidx.lifecycle.Lifecycle r1 = r2.getLifecycle()
            r1.removeObserver(r0)
        L32:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.V3LocationService> r1 = com.bxkj.student.v2.ui.sports.v3.service.V3LocationService.class
            r0.<init>(r2, r1)
            r2.stopService(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService> r1 = com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService.class
            r0.<init>(r2, r1)
            r2.stopService(r0)
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            r0.c()
            r0 = 0
            r2.F0 = r0
            r2.f1449p0 = r0
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.amap.api.maps.MapView r0 = r0.mMapView
            r0.onDestroy()
            android.content.ServiceConnection r0 = r2.f1448k0
            r2.unbindService(r0)
            java.lang.Runnable r0 = r2.X
            if (r0 == 0) goto L6b
            android.os.Handler r1 = r2.W
            if (r1 == 0) goto L6b
            r1.removeCallbacks(r0)
        L6b:
            return
    }

    protected void onPause() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.amap.api.maps.MapView r0 = r0.mMapView
            r0.onPause()
            return
    }

    protected void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.amap.api.maps.MapView r0 = r0.mMapView
            r0.onResume()
            return
    }

    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.amap.api.maps.MapView r0 = r0.mMapView
            r0.onSaveInstanceState(r3)
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r0 = r0.B()
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            java.lang.String r1 = "sportsSetMap"
            r3.putString(r1, r0)
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r11 = this;
            java.lang.String r0 = "数据异常，没有运动类型"
            java.lang.String r1 = "数据异常，没有身份"
            java.lang.String r2 = "runType"
            r3 = -1
            r4 = 0
            com.bxkj.student.v2.common.data.i$a r5 = com.bxkj.student.v2.common.data.i.a     // Catch: java.lang.Exception -> L53
            r5.c()     // Catch: java.lang.Exception -> L53
            androidx.databinding.ViewDataBinding r6 = r11.K()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.databinding.AcV4SportsBinding r6 = (com.bxkj.student.databinding.AcV4SportsBinding) r6     // Catch: java.lang.Exception -> L53
            r6.setBackEvent(r11)     // Catch: java.lang.Exception -> L53
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> L53
            android.content.Context r7 = r11.G()     // Catch: java.lang.Exception -> L53
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService> r8 = com.bxkj.student.v2.ui.sports.v3.service.V3KillNotificationsService.class
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L53
            android.content.ServiceConnection r7 = r11.f1448k0     // Catch: java.lang.Exception -> L53
            r8 = 1
            r11.bindService(r6, r7, r8)     // Catch: java.lang.Exception -> L53
            java.util.Map r6 = r5.B()     // Catch: java.lang.Exception -> L53
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L53
            if (r6 != 0) goto L10c
            com.bxkj.base.v2.base.BaseViewModel r0 = r11.C()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.vm.sports.SportsVM r0 = (com.bxkj.student.v2.vm.sports.SportsVM) r0     // Catch: java.lang.Exception -> L53
            java.util.Map r5 = r5.B()     // Catch: java.lang.Exception -> L53
            r0.S(r5)     // Catch: java.lang.Exception -> L53
            com.bxkj.base.v2.base.BaseViewModel r0 = r11.C()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.vm.sports.SportsVM r0 = (com.bxkj.student.v2.vm.sports.SportsVM) r0     // Catch: java.lang.Exception -> L53
            java.util.Map r0 = r0.M()     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L56
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L53
            goto L56
        L53:
            goto L118
        L56:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L53
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L53
            androidx.databinding.ViewDataBinding r5 = r11.K()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.databinding.AcV4SportsBinding r5 = (com.bxkj.student.databinding.AcV4SportsBinding) r5     // Catch: java.lang.Exception -> L53
            r5.setSportType(r0)     // Catch: java.lang.Exception -> L53
            androidx.databinding.ViewDataBinding r5 = r11.K()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.databinding.AcV4SportsBinding r5 = (com.bxkj.student.databinding.AcV4SportsBinding) r5     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.common.utils.r$a r6 = com.bxkj.student.v2.common.utils.r.a     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = r6.d(r0)     // Catch: java.lang.Exception -> L53
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L53
            r6.<init>()     // Catch: java.lang.Exception -> L53
            r6.append(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = "中"
            r6.append(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> L53
            r5.setTitle(r0)     // Catch: java.lang.Exception -> L53
            com.bxkj.base.v2.base.BaseViewModel r0 = r11.C()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.vm.sports.SportsVM r0 = (com.bxkj.student.v2.vm.sports.SportsVM) r0     // Catch: java.lang.Exception -> L53
            java.util.Map r0 = r0.M()     // Catch: java.lang.Exception -> L53
            java.lang.String r5 = "identify"
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Exception -> L53
            java.lang.String r5 = ""
            if (r0 != 0) goto L9c
            r0 = r5
        L9c:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L53
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L53
            if (r6 == 0) goto Lb2
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r11, r1)     // Catch: java.lang.Exception -> L53
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L53
            com.orhanobut.logger.j.e(r1, r0)     // Catch: java.lang.Exception -> L53
            r11.finish()     // Catch: java.lang.Exception -> L53
            return
        Lb2:
            r11.h0()     // Catch: java.lang.Exception -> L53
            r11.P()     // Catch: java.lang.Exception -> L53
            r11.c0()     // Catch: java.lang.Exception -> L53
            com.bxkj.base.v2.base.BaseViewModel r1 = r11.C()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.vm.sports.SportsVM r1 = (com.bxkj.student.v2.vm.sports.SportsVM) r1     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.ui.sports.v3.q1 r6 = new com.bxkj.student.v2.ui.sports.v3.q1     // Catch: java.lang.Exception -> L53
            r6.<init>(r11)     // Catch: java.lang.Exception -> L53
            r1.Q(r0, r6)     // Catch: java.lang.Exception -> L53
            com.bxkj.base.v2.base.BaseViewModel r0 = r11.C()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.vm.sports.SportsVM r0 = (com.bxkj.student.v2.vm.sports.SportsVM) r0     // Catch: java.lang.Exception -> L53
            java.util.Map r0 = r0.M()     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "context"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto Ldc
            goto Ldd
        Ldc:
            r5 = r0
        Ldd:
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L53
            com.bxkj.base.v2.base.BaseViewModel r1 = r11.C()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.v2.vm.sports.SportsVM r1 = (com.bxkj.student.v2.vm.sports.SportsVM) r1     // Catch: java.lang.Exception -> L53
            java.util.Map r1 = r1.M()     // Catch: java.lang.Exception -> L53
            java.lang.String r5 = "isClock"
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto Lf5
            java.lang.String r1 = "0"
        Lf5:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L53
            androidx.databinding.ViewDataBinding r5 = r11.K()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.databinding.AcV4SportsBinding r5 = (com.bxkj.student.databinding.AcV4SportsBinding) r5     // Catch: java.lang.Exception -> L53
            r5.setNotice(r0)     // Catch: java.lang.Exception -> L53
            androidx.databinding.ViewDataBinding r0 = r11.K()     // Catch: java.lang.Exception -> L53
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0     // Catch: java.lang.Exception -> L53
            r0.setIsClock(r1)     // Catch: java.lang.Exception -> L53
            goto L118
        L10c:
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r11, r0)     // Catch: java.lang.Exception -> L53
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L53
            com.orhanobut.logger.j.e(r0, r1)     // Catch: java.lang.Exception -> L53
            r11.finish()     // Catch: java.lang.Exception -> L53
            return
        L118:
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r5 = r1.B()
            int r2 = r0.k(r5, r2)
            androidx.databinding.ViewDataBinding r5 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r5 = (com.bxkj.student.databinding.AcV4SportsBinding) r5
            com.google.android.material.tabs.TabLayout r5 = r5.tab
            com.google.android.material.tabs.TabLayout$Tab r4 = r5.getTabAt(r4)
            if (r4 == 0) goto L13b
            com.bxkj.student.v2.common.utils.r$a r5 = com.bxkj.student.v2.common.utils.r.a
            java.lang.String r2 = r5.d(r2)
            r4.setText(r2)
        L13b:
            android.content.Context r2 = r11.G()
            r4 = 2131100712(0x7f060428, float:1.7813813E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r4)
            androidx.databinding.ViewDataBinding r5 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r5 = (com.bxkj.student.databinding.AcV4SportsBinding) r5
            androidx.constraintlayout.widget.ConstraintLayout r5 = r5.titleLayout
            r5.setBackgroundResource(r4)
            com.bxkj.student.common.utils.k.g(r11, r2)
            androidx.databinding.ViewDataBinding r4 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r4 = (com.bxkj.student.databinding.AcV4SportsBinding) r4
            android.widget.TextView r4 = r4.tvGps
            r4.setTextColor(r2)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saDistance
            com.bxkj.base.v2.base.BaseViewModel r4 = r11.C()
            com.bxkj.student.v2.vm.sports.SportsVM r4 = (com.bxkj.student.v2.vm.sports.SportsVM) r4
            java.util.Map r4 = r4.M()
            java.lang.String r5 = "totalRange"
            float r4 = r0.i(r4, r5)
            r2.k(r4)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saDistance
            com.bxkj.base.v2.base.BaseViewModel r4 = r11.C()
            com.bxkj.student.v2.vm.sports.SportsVM r4 = (com.bxkj.student.v2.vm.sports.SportsVM) r4
            java.util.Map r4 = r4.M()
            java.lang.String r4 = r0.t(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "目标里程："
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "KM"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.p(r4)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saDistance
            double r4 = r1.g()
            double r4 = com.bxkj.student.run.app.utils.i.e(r4)
            float r4 = (float) r4
            r2.l(r4)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saDistance
            double r4 = r1.g()
            java.lang.String r4 = com.bxkj.student.run.app.utils.i.c(r4)
            r2.n(r4)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saTime
            com.bxkj.base.v2.base.BaseViewModel r4 = r11.C()
            com.bxkj.student.v2.vm.sports.SportsVM r4 = (com.bxkj.student.v2.vm.sports.SportsVM) r4
            java.util.Map r4 = r4.M()
            java.lang.String r5 = "startQualifiedTime"
            float r4 = r0.i(r4, r5)
            r2.k(r4)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saTime
            com.bxkj.base.v2.base.BaseViewModel r4 = r11.C()
            com.bxkj.student.v2.vm.sports.SportsVM r4 = (com.bxkj.student.v2.vm.sports.SportsVM) r4
            java.util.Map r4 = r4.M()
            java.lang.String r4 = r0.t(r4, r5)
            com.bxkj.base.v2.base.BaseViewModel r6 = r11.C()
            com.bxkj.student.v2.vm.sports.SportsVM r6 = (com.bxkj.student.v2.vm.sports.SportsVM) r6
            java.util.Map r6 = r6.M()
            java.lang.String r7 = "endQualifiedTime"
            java.lang.String r6 = r0.t(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "有效时间：("
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = "-"
            r7.append(r4)
            r7.append(r6)
            java.lang.String r6 = ")分"
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r2.p(r7)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saTime
            long r9 = r1.e()
            float r7 = (float) r9
            r9 = 1114636288(0x42700000, float:60.0)
            float r7 = r7 / r9
            r2.l(r7)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saTime
            long r9 = r1.e()
            java.lang.String r7 = com.bxkj.base.v2.common.utils.g.b(r9)
            r2.n(r7)
            int r2 = r1.b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r7 = r2.intValue()
            if (r7 == r3) goto L267
            goto L268
        L267:
            r2 = 0
        L268:
            if (r2 == 0) goto L2ab
            int r2 = r2.intValue()
            androidx.databinding.ViewDataBinding r3 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
            com.bxkj.student.v2.common.view.StepArcView r3 = r3.saTime
            float r7 = (float) r2
            r3.o(r7)
            androidx.databinding.ViewDataBinding r3 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r3 = (com.bxkj.student.databinding.AcV4SportsBinding) r3
            com.bxkj.student.v2.common.view.StepArcView r3 = r3.saTime
            com.bxkj.base.v2.base.BaseViewModel r7 = r11.C()
            com.bxkj.student.v2.vm.sports.SportsVM r7 = (com.bxkj.student.v2.vm.sports.SportsVM) r7
            java.util.Map r7 = r7.M()
            java.lang.String r0 = r0.t(r7, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r0)
            r5.append(r4)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            r3.p(r0)
        L2ab:
            int r0 = r1.a()
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saStep
            float r3 = (float) r0
            r2.k(r3)
            androidx.databinding.ViewDataBinding r2 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r2 = (com.bxkj.student.databinding.AcV4SportsBinding) r2
            com.bxkj.student.v2.common.view.StepArcView r2 = r2.saStep
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "达标步数："
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.p(r0)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.bxkj.student.v2.common.view.StepArcView r0 = r0.saStep
            int r2 = r1.G()
            float r2 = (float) r2
            r0.l(r2)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.bxkj.student.v2.common.view.StepArcView r0 = r0.saStep
            int r2 = r1.G()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.n(r2)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            android.widget.TextView r0 = r0.tvAvgSpeed
            java.lang.String r2 = r1.d()
            r0.setText(r2)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            android.widget.TextView r0 = r0.tvPaceSpeed
            java.lang.String r2 = r1.y()
            r0.setText(r2)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivGps
            int r1 = r1.p()
            r2 = 2
            int r1 = com.bxkj.student.run.app.utils.i.u(r1, r2)
            r0.setImageResource(r1)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.bxkj.student.common.view.LongPressButton r0 = r0.ivUnlock
            com.bxkj.student.v2.ui.sports.v3.r1 r1 = new com.bxkj.student.v2.ui.sports.v3.r1
            r1.<init>(r11)
            r0.setOnFinishListener(r1)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            com.bxkj.student.common.view.LongPressButton r0 = r0.ivStop
            com.bxkj.student.v2.ui.sports.v3.s1 r1 = new com.bxkj.student.v2.ui.sports.v3.s1
            r1.<init>(r11)
            r0.setOnFinishListener(r1)
            androidx.databinding.ViewDataBinding r0 = r11.K()
            com.bxkj.student.databinding.AcV4SportsBinding r0 = (com.bxkj.student.databinding.AcV4SportsBinding) r0
            androidx.appcompat.widget.AppCompatSeekBar r0 = r0.sbLock
            com.bxkj.student.v2.ui.sports.v3.V4SportActivity$a r1 = new com.bxkj.student.v2.ui.sports.v3.V4SportActivity$a
            r1.<init>(r11)
            r0.setOnSeekBarChangeListener(r1)
            return
    }
}
