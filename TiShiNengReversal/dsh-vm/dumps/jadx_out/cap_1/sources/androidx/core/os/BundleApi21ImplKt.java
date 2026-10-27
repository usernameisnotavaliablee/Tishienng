package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class BundleApi21ImplKt {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.os.BundleApi21ImplKt INSTANCE = null;

    static {
            androidx.core.os.BundleApi21ImplKt r0 = new androidx.core.os.BundleApi21ImplKt
            r0.<init>()
            androidx.core.os.BundleApi21ImplKt.INSTANCE = r0
            return
    }

    private BundleApi21ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void putSize(@org.jetbrains.annotations.NotNull android.os.Bundle r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable android.util.Size r2) {
            r0.putSize(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void putSizeF(@org.jetbrains.annotations.NotNull android.os.Bundle r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable android.util.SizeF r2) {
            r0.putSizeF(r1, r2)
            return
    }
}
