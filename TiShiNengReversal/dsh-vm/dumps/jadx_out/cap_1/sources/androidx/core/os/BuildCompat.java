package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BuildCompat {

    @androidx.annotation.ChecksSdkIntAtLeast(extension = 1000000)
    @kotlin.jvm.JvmField
    public static final int AD_SERVICES_EXTENSION_INT = 0;

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.os.BuildCompat INSTANCE = null;

    @androidx.annotation.ChecksSdkIntAtLeast(extension = 30)
    @kotlin.jvm.JvmField
    public static final int R_EXTENSION_INT = 0;

    @androidx.annotation.ChecksSdkIntAtLeast(extension = 31)
    @kotlin.jvm.JvmField
    public static final int S_EXTENSION_INT = 0;

    @androidx.annotation.ChecksSdkIntAtLeast(extension = 33)
    @kotlin.jvm.JvmField
    public static final int T_EXTENSION_INT = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static final class Api30Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.core.os.BuildCompat.Api30Impl INSTANCE = null;

        static {
                androidx.core.os.BuildCompat$Api30Impl r0 = new androidx.core.os.BuildCompat$Api30Impl
                r0.<init>()
                androidx.core.os.BuildCompat.Api30Impl.INSTANCE = r0
                return
        }

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public final int getExtensionVersion(int r1) {
                r0 = this;
                int r1 = android.os.ext.SdkExtensions.getExtensionVersion(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.RequiresOptIn
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    static {
            androidx.core.os.BuildCompat r0 = new androidx.core.os.BuildCompat
            r0.<init>()
            androidx.core.os.BuildCompat.INSTANCE = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 30
            if (r0 < r2) goto L15
            androidx.core.os.BuildCompat$Api30Impl r3 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            int r3 = r3.getExtensionVersion(r2)
            goto L16
        L15:
            r3 = 0
        L16:
            androidx.core.os.BuildCompat.R_EXTENSION_INT = r3
            if (r0 < r2) goto L23
            androidx.core.os.BuildCompat$Api30Impl r3 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r4 = 31
            int r3 = r3.getExtensionVersion(r4)
            goto L24
        L23:
            r3 = 0
        L24:
            androidx.core.os.BuildCompat.S_EXTENSION_INT = r3
            if (r0 < r2) goto L31
            androidx.core.os.BuildCompat$Api30Impl r3 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r4 = 33
            int r3 = r3.getExtensionVersion(r4)
            goto L32
        L31:
            r3 = 0
        L32:
            androidx.core.os.BuildCompat.T_EXTENSION_INT = r3
            if (r0 < r2) goto L3f
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r0.getExtensionVersion(r1)
        L3f:
            androidx.core.os.BuildCompat.AD_SERVICES_EXTENSION_INT = r1
            return
    }

    private BuildCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 24)
    public static final boolean isAtLeastN() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.Deprecated(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 25)
    public static final boolean isAtLeastNMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.Deprecated(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 26)
    public static final boolean isAtLeastO() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.Deprecated(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 27)
    public static final boolean isAtLeastOMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.Deprecated(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 28)
    public static final boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    @androidx.annotation.VisibleForTesting
    public static final boolean isAtLeastPreReleaseCodename(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "codename"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "buildCodename"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "REL"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r4)
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r0)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.g0.o(r4, r2)
            java.lang.String r3 = r3.toUpperCase(r0)
            kotlin.jvm.internal.g0.o(r3, r2)
            int r3 = r4.compareTo(r3)
            if (r3 < 0) goto L2e
            r3 = 1
            return r3
        L2e:
            return r1
    }

    @kotlin.Deprecated(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 29)
    public static final boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.Deprecated(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 30)
    public static final boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.Deprecated(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 31, codename = "S")
    public static final boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L1c
            r1 = 30
            if (r0 < r1) goto L1a
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "S"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            return r0
        L1c:
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    public static final boolean isAtLeastSv2() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 >= r1) goto L1c
            r1 = 31
            if (r0 < r1) goto L1a
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "Sv2"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            return r0
        L1c:
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    public static final boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L1c
            r1 = 32
            if (r0 < r1) goto L1a
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "Tiramisu"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            return r0
        L1c:
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    public static final boolean isAtLeastU() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L1c
            r1 = 33
            if (r0 < r1) goto L1a
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "UpsideDownCake"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            return r0
        L1c:
            r0 = 1
            return r0
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.ChecksSdkIntAtLeast(codename = "VanillaIceCream")
    @androidx.core.os.BuildCompat.PrereleaseSdkCheck
    public static final boolean isAtLeastV() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L17
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "VanillaIceCream"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }
}
