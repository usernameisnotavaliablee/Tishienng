package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SystemBarStyle {

    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.SystemBarStyle.Companion Companion = null;
    private final int darkScrim;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ androidx.activity.SystemBarStyle auto$default(androidx.activity.SystemBarStyle.Companion r0, int r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L6
                androidx.activity.SystemBarStyle$Companion$auto$1 r3 = androidx.activity.SystemBarStyle$Companion$auto$1.INSTANCE
            L6:
                androidx.activity.SystemBarStyle r0 = r0.auto(r1, r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final androidx.activity.SystemBarStyle auto(@androidx.annotation.ColorInt int r7, @androidx.annotation.ColorInt int r8) {
                r6 = this;
                r4 = 4
                r5 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                androidx.activity.SystemBarStyle r7 = auto$default(r0, r1, r2, r3, r4, r5)
                return r7
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final androidx.activity.SystemBarStyle auto(@androidx.annotation.ColorInt int r8, @androidx.annotation.ColorInt int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> r10) {
                r7 = this;
                java.lang.String r0 = "detectDarkMode"
                kotlin.jvm.internal.g0.p(r10, r0)
                androidx.activity.SystemBarStyle r1 = new androidx.activity.SystemBarStyle
                r4 = 0
                r6 = 0
                r2 = r8
                r3 = r9
                r5 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.activity.SystemBarStyle dark(@androidx.annotation.ColorInt int r7) {
                r6 = this;
                androidx.activity.SystemBarStyle r0 = new androidx.activity.SystemBarStyle
                androidx.activity.SystemBarStyle$Companion$dark$1 r4 = androidx.activity.SystemBarStyle$Companion$dark$1.INSTANCE
                r5 = 0
                r3 = 2
                r2 = r7
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.activity.SystemBarStyle light(@androidx.annotation.ColorInt int r7, @androidx.annotation.ColorInt int r8) {
                r6 = this;
                androidx.activity.SystemBarStyle r0 = new androidx.activity.SystemBarStyle
                androidx.activity.SystemBarStyle$Companion$light$1 r4 = androidx.activity.SystemBarStyle$Companion$light$1.INSTANCE
                r5 = 0
                r3 = 1
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    static {
            androidx.activity.SystemBarStyle$Companion r0 = new androidx.activity.SystemBarStyle$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.SystemBarStyle.Companion = r0
            return
    }

    private SystemBarStyle(int r1, int r2, int r3, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> r4) {
            r0 = this;
            r0.<init>()
            r0.lightScrim = r1
            r0.darkScrim = r2
            r0.nightMode = r3
            r0.detectDarkMode = r4
            return
    }

    public /* synthetic */ SystemBarStyle(int r1, int r2, int r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.SystemBarStyle auto(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r1 = r0.auto(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.SystemBarStyle auto(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> r3) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r1 = r0.auto(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.SystemBarStyle dark(@androidx.annotation.ColorInt int r1) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r1 = r0.dark(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.SystemBarStyle light(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r1 = r0.light(r1, r2)
            return r1
    }

    public final int getDarkScrim$activity_release() {
            r1 = this;
            int r0 = r1.darkScrim
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> getDetectDarkMode$activity_release() {
            r1 = this;
            kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> r0 = r1.detectDarkMode
            return r0
    }

    public final int getNightMode$activity_release() {
            r1 = this;
            int r0 = r1.nightMode
            return r0
    }

    public final int getScrim$activity_release(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            int r1 = r0.darkScrim
            return r1
        L5:
            int r1 = r0.lightScrim
            return r1
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean r2) {
            r1 = this;
            int r0 = r1.nightMode
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            if (r2 == 0) goto Lb
            int r2 = r1.darkScrim
            return r2
        Lb:
            int r2 = r1.lightScrim
            return r2
    }
}
