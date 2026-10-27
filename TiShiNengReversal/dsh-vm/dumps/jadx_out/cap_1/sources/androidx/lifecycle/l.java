package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class l {
    static {
            androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = androidx.lifecycle.ViewModelProvider.Factory.Companion
            return
    }

    @org.jetbrains.annotations.NotNull
    public static androidx.lifecycle.ViewModel a(androidx.lifecycle.ViewModelProvider.Factory r0, @org.jetbrains.annotations.NotNull java.lang.Class r1) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static androidx.lifecycle.ViewModel b(androidx.lifecycle.ViewModelProvider.Factory r1, @org.jetbrains.annotations.NotNull java.lang.Class r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r3) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.ViewModel r1 = r1.create(r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static androidx.lifecycle.ViewModelProvider.Factory c(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.ViewModelInitializer<?>... r1) {
            androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = androidx.lifecycle.ViewModelProvider.Factory.Companion
            androidx.lifecycle.ViewModelProvider$Factory r1 = r0.from(r1)
            return r1
    }
}
