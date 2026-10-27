package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentTransactionKt {
    @org.jetbrains.annotations.NotNull
    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction add(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentTransaction r2, @androidx.annotation.IdRes int r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable android.os.Bundle r5) {
            java.lang.String r0 = "$this$add"
            kotlin.jvm.internal.g0.q(r2, r0)
            r0 = 4
            java.lang.String r1 = "F"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.fragment.app.Fragment> r0 = androidx.fragment.app.Fragment.class
            androidx.fragment.app.FragmentTransaction r2 = r2.add(r3, r0, r5, r4)
            java.lang.String r3 = "add(containerViewId, F::class.java, args, tag)"
            kotlin.jvm.internal.g0.h(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction add(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentTransaction r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            java.lang.String r0 = "$this$add"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.g0.q(r3, r0)
            r0 = 4
            java.lang.String r1 = "F"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.fragment.app.Fragment> r0 = androidx.fragment.app.Fragment.class
            androidx.fragment.app.FragmentTransaction r2 = r2.add(r0, r4, r3)
            java.lang.String r3 = "add(F::class.java, args, tag)"
            kotlin.jvm.internal.g0.h(r2, r3)
            return r2
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction add$default(androidx.fragment.app.FragmentTransaction r1, int r2, java.lang.String r3, android.os.Bundle r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r6 = 4
            r5 = r5 & r6
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            java.lang.String r5 = "$this$add"
            kotlin.jvm.internal.g0.q(r1, r5)
            java.lang.String r5 = "F"
            kotlin.jvm.internal.g0.y(r6, r5)
            java.lang.Class<androidx.fragment.app.Fragment> r5 = androidx.fragment.app.Fragment.class
            androidx.fragment.app.FragmentTransaction r1 = r1.add(r2, r5, r4, r3)
            java.lang.String r2 = "add(containerViewId, F::class.java, args, tag)"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction add$default(androidx.fragment.app.FragmentTransaction r0, java.lang.String r1, android.os.Bundle r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "$this$add"
            kotlin.jvm.internal.g0.q(r0, r3)
            java.lang.String r3 = "tag"
            kotlin.jvm.internal.g0.q(r1, r3)
            r3 = 4
            java.lang.String r4 = "F"
            kotlin.jvm.internal.g0.y(r3, r4)
            java.lang.Class<androidx.fragment.app.Fragment> r3 = androidx.fragment.app.Fragment.class
            androidx.fragment.app.FragmentTransaction r0 = r0.add(r3, r2, r1)
            java.lang.String r1 = "add(F::class.java, args, tag)"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction replace(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentTransaction r2, @androidx.annotation.IdRes int r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable android.os.Bundle r5) {
            java.lang.String r0 = "$this$replace"
            kotlin.jvm.internal.g0.q(r2, r0)
            r0 = 4
            java.lang.String r1 = "F"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.fragment.app.Fragment> r0 = androidx.fragment.app.Fragment.class
            androidx.fragment.app.FragmentTransaction r2 = r2.replace(r3, r0, r5, r4)
            java.lang.String r3 = "replace(containerViewId, F::class.java, args, tag)"
            kotlin.jvm.internal.g0.h(r2, r3)
            return r2
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction replace$default(androidx.fragment.app.FragmentTransaction r1, int r2, java.lang.String r3, android.os.Bundle r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r6 = 4
            r5 = r5 & r6
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            java.lang.String r5 = "$this$replace"
            kotlin.jvm.internal.g0.q(r1, r5)
            java.lang.String r5 = "F"
            kotlin.jvm.internal.g0.y(r6, r5)
            java.lang.Class<androidx.fragment.app.Fragment> r5 = androidx.fragment.app.Fragment.class
            androidx.fragment.app.FragmentTransaction r1 = r1.replace(r2, r5, r4, r3)
            java.lang.String r2 = "replace(containerViewId, F::class.java, args, tag)"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }
}
