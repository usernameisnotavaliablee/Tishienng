package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityNavigatorExtrasKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.ActivityNavigator.Extras ActivityNavigatorExtras(@org.jetbrains.annotations.Nullable androidx.core.app.ActivityOptionsCompat r1, int r2) {
            androidx.navigation.ActivityNavigator$Extras$Builder r0 = new androidx.navigation.ActivityNavigator$Extras$Builder
            r0.<init>()
            if (r1 == 0) goto La
            r0.setActivityOptions(r1)
        La:
            r0.addFlags(r2)
            androidx.navigation.ActivityNavigator$Extras r1 = r0.build()
            java.lang.String r2 = "ActivityNavigator.Extras…(flags)\n        }.build()"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }

    public static /* synthetic */ androidx.navigation.ActivityNavigator.Extras ActivityNavigatorExtras$default(androidx.core.app.ActivityOptionsCompat r0, int r1, int r2, java.lang.Object r3) {
            r3 = r2 & 1
            if (r3 == 0) goto L5
            r0 = 0
        L5:
            r2 = r2 & 2
            if (r2 == 0) goto La
            r1 = 0
        La:
            androidx.navigation.ActivityNavigator$Extras r0 = ActivityNavigatorExtras(r0, r1)
            return r0
    }
}
