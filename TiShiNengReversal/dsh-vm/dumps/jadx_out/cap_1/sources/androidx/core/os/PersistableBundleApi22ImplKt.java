package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(22)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PersistableBundleApi22ImplKt {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.os.PersistableBundleApi22ImplKt INSTANCE = null;

    static {
            androidx.core.os.PersistableBundleApi22ImplKt r0 = new androidx.core.os.PersistableBundleApi22ImplKt
            r0.<init>()
            androidx.core.os.PersistableBundleApi22ImplKt.INSTANCE = r0
            return
    }

    private PersistableBundleApi22ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void putBoolean(@org.jetbrains.annotations.NotNull android.os.PersistableBundle r0, @org.jetbrains.annotations.Nullable java.lang.String r1, boolean r2) {
            r0.putBoolean(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void putBooleanArray(@org.jetbrains.annotations.NotNull android.os.PersistableBundle r0, @org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.NotNull boolean[] r2) {
            r0.putBooleanArray(r1, r2)
            return
    }
}
