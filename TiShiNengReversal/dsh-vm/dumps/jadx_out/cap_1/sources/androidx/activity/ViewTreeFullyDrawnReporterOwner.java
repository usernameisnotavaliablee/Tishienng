package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "ViewTreeFullyDrawnReporterOwner")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.Nullable
    public static final androidx.activity.FullyDrawnReporterOwner get(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 r0 = androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.INSTANCE
            kotlin.sequences.m r1 = kotlin.sequences.p.t(r1, r0)
            androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 r0 = androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.INSTANCE
            kotlin.sequences.m r1 = kotlin.sequences.p.S1(r1, r0)
            java.lang.Object r1 = kotlin.sequences.p.i1(r1)
            androidx.activity.FullyDrawnReporterOwner r1 = (androidx.activity.FullyDrawnReporterOwner) r1
            return r1
    }

    @kotlin.jvm.JvmName(name = "set")
    public static final void set(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull androidx.activity.FullyDrawnReporterOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fullyDrawnReporterOwner"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = androidx.activity.R.id.report_drawn
            r1.setTag(r0, r2)
            return
    }
}
