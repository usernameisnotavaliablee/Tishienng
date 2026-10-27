package androidx.navigation.fragment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentNavigatorExtrasKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.fragment.FragmentNavigator.Extras FragmentNavigatorExtras(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends android.view.View, java.lang.String>... r5) {
            java.lang.String r0 = "sharedElements"
            kotlin.jvm.internal.g0.q(r5, r0)
            androidx.navigation.fragment.FragmentNavigator$Extras$Builder r0 = new androidx.navigation.fragment.FragmentNavigator$Extras$Builder
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L22
            r3 = r5[r2]
            java.lang.Object r4 = r3.component1()
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r3.component2()
            java.lang.String r3 = (java.lang.String) r3
            r0.addSharedElement(r4, r3)
            int r2 = r2 + 1
            goto Lc
        L22:
            androidx.navigation.fragment.FragmentNavigator$Extras r5 = r0.build()
            java.lang.String r0 = "FragmentNavigator.Extras…      }\n        }.build()"
            kotlin.jvm.internal.g0.h(r5, r0)
            return r5
    }
}
