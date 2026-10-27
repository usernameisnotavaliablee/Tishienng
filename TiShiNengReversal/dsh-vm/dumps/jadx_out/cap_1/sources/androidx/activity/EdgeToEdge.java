package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "EdgeToEdge")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class EdgeToEdge {
    private static final int DefaultDarkScrim = 0;
    private static final int DefaultLightScrim = 0;

    @org.jetbrains.annotations.Nullable
    private static androidx.activity.EdgeToEdgeImpl Impl;

    static {
            r0 = 230(0xe6, float:3.22E-43)
            r1 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            androidx.activity.EdgeToEdge.DefaultLightScrim = r0
            r0 = 128(0x80, float:1.8E-43)
            r1 = 27
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            androidx.activity.EdgeToEdge.DefaultDarkScrim = r0
            return
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "enable")
    public static final void enable(@org.jetbrains.annotations.NotNull androidx.activity.ComponentActivity r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1 = 3
            enable$default(r2, r0, r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "enable")
    public static final void enable(@org.jetbrains.annotations.NotNull androidx.activity.ComponentActivity r2, @org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 2
            enable$default(r2, r3, r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "enable")
    public static final void enable(@org.jetbrains.annotations.NotNull androidx.activity.ComponentActivity r8, @org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r9, @org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "navigationBarStyle"
            kotlin.jvm.internal.g0.p(r10, r0)
            android.view.Window r0 = r8.getWindow()
            android.view.View r5 = r0.getDecorView()
            java.lang.String r0 = "window.decorView"
            kotlin.jvm.internal.g0.o(r5, r0)
            kotlin.jvm.functions.Function1 r0 = r9.getDetectDarkMode$activity_release()
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r2 = "view.resources"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            kotlin.jvm.functions.Function1 r0 = r10.getDetectDarkMode$activity_release()
            android.content.res.Resources r1 = r5.getResources()
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            androidx.activity.EdgeToEdgeImpl r0 = androidx.activity.EdgeToEdge.Impl
            if (r0 != 0) goto L59
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5b
            androidx.activity.EdgeToEdgeApi29 r0 = new androidx.activity.EdgeToEdgeApi29
            r0.<init>()
        L59:
            r1 = r0
            goto L77
        L5b:
            r1 = 26
            if (r0 < r1) goto L65
            androidx.activity.EdgeToEdgeApi26 r0 = new androidx.activity.EdgeToEdgeApi26
            r0.<init>()
            goto L59
        L65:
            r1 = 23
            if (r0 < r1) goto L6f
            androidx.activity.EdgeToEdgeApi23 r0 = new androidx.activity.EdgeToEdgeApi23
            r0.<init>()
            goto L59
        L6f:
            androidx.activity.EdgeToEdgeApi21 r0 = new androidx.activity.EdgeToEdgeApi21
            r0.<init>()
            androidx.activity.EdgeToEdge.Impl = r0
            goto L59
        L77:
            android.view.Window r4 = r8.getWindow()
            java.lang.String r8 = "window"
            kotlin.jvm.internal.g0.o(r4, r8)
            r2 = r9
            r3 = r10
            r1.setUp(r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ void enable$default(androidx.activity.ComponentActivity r6, androidx.activity.SystemBarStyle r7, androidx.activity.SystemBarStyle r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto Lf
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            r4 = 4
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            androidx.activity.SystemBarStyle r7 = androidx.activity.SystemBarStyle.Companion.auto$default(r0, r1, r2, r3, r4, r5)
        Lf:
            r9 = r9 & 2
            if (r9 == 0) goto L20
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            int r1 = androidx.activity.EdgeToEdge.DefaultLightScrim
            int r2 = androidx.activity.EdgeToEdge.DefaultDarkScrim
            r4 = 4
            r5 = 0
            r3 = 0
            androidx.activity.SystemBarStyle r8 = androidx.activity.SystemBarStyle.Companion.auto$default(r0, r1, r2, r3, r4, r5)
        L20:
            enable(r6, r7, r8)
            return
    }

    public static final int getDefaultDarkScrim() {
            int r0 = androidx.activity.EdgeToEdge.DefaultDarkScrim
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
            return
    }

    public static final int getDefaultLightScrim() {
            int r0 = androidx.activity.EdgeToEdge.DefaultLightScrim
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
            return
    }
}
