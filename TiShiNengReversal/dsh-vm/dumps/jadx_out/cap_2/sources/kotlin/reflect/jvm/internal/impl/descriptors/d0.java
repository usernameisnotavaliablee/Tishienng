package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 {
    public static final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r2.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r0 != r1) goto L17
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r2.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            if (r2 == r0) goto L17
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }
}
