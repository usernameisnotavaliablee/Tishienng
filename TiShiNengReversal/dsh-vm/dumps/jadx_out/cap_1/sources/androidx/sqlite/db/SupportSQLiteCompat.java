package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SupportSQLiteCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.Deprecated(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 16.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api16Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api16Impl INSTANCE = null;

        static {
                androidx.sqlite.db.SupportSQLiteCompat$Api16Impl r0 = new androidx.sqlite.db.SupportSQLiteCompat$Api16Impl
                r0.<init>()
                androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.INSTANCE = r0
                return
        }

        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final void cancel(@org.jetbrains.annotations.NotNull android.os.CancellationSignal r1) {
                java.lang.String r0 = "cancellationSignal"
                kotlin.jvm.internal.g0.p(r1, r0)
                r1.cancel()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @org.jetbrains.annotations.NotNull
        public static final android.os.CancellationSignal createCancellationSignal() {
                android.os.CancellationSignal r0 = new android.os.CancellationSignal
                r0.<init>()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.Deprecated(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 19.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api19Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api19Impl INSTANCE = null;

        static {
                androidx.sqlite.db.SupportSQLiteCompat$Api19Impl r0 = new androidx.sqlite.db.SupportSQLiteCompat$Api19Impl
                r0.<init>()
                androidx.sqlite.db.SupportSQLiteCompat.Api19Impl.INSTANCE = r0
                return
        }

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @org.jetbrains.annotations.NotNull
        public static final android.net.Uri getNotificationUri(@org.jetbrains.annotations.NotNull android.database.Cursor r1) {
                java.lang.String r0 = "cursor"
                kotlin.jvm.internal.g0.p(r1, r0)
                android.net.Uri r1 = r1.getNotificationUri()
                java.lang.String r0 = "getNotificationUri(...)"
                kotlin.jvm.internal.g0.o(r1, r0)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final boolean isLowRamDevice(@org.jetbrains.annotations.NotNull android.app.ActivityManager r1) {
                java.lang.String r0 = "activityManager"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r1 = r1.isLowRamDevice()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api21Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api21Impl INSTANCE = null;

        static {
                androidx.sqlite.db.SupportSQLiteCompat$Api21Impl r0 = new androidx.sqlite.db.SupportSQLiteCompat$Api21Impl
                r0.<init>()
                androidx.sqlite.db.SupportSQLiteCompat.Api21Impl.INSTANCE = r0
                return
        }

        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @org.jetbrains.annotations.NotNull
        public static final java.io.File getNoBackupFilesDir(@org.jetbrains.annotations.NotNull android.content.Context r1) {
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.io.File r1 = r1.getNoBackupFilesDir()
                java.lang.String r0 = "getNoBackupFilesDir(...)"
                kotlin.jvm.internal.g0.o(r1, r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api23Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api23Impl INSTANCE = null;

        static {
                androidx.sqlite.db.SupportSQLiteCompat$Api23Impl r0 = new androidx.sqlite.db.SupportSQLiteCompat$Api23Impl
                r0.<init>()
                androidx.sqlite.db.SupportSQLiteCompat.Api23Impl.INSTANCE = r0
                return
        }

        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setExtras(@org.jetbrains.annotations.NotNull android.database.Cursor r1, @org.jetbrains.annotations.NotNull android.os.Bundle r2) {
                java.lang.String r0 = "cursor"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.lang.String r0 = "extras"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.setExtras(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api29Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api29Impl INSTANCE = null;

        static {
                androidx.sqlite.db.SupportSQLiteCompat$Api29Impl r0 = new androidx.sqlite.db.SupportSQLiteCompat$Api29Impl
                r0.<init>()
                androidx.sqlite.db.SupportSQLiteCompat.Api29Impl.INSTANCE = r0
                return
        }

        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @org.jetbrains.annotations.NotNull
        public static final java.util.List<android.net.Uri> getNotificationUris(@org.jetbrains.annotations.NotNull android.database.Cursor r1) {
                java.lang.String r0 = "cursor"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.util.List r1 = r1.getNotificationUris()
                kotlin.jvm.internal.g0.m(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setNotificationUris(@org.jetbrains.annotations.NotNull android.database.Cursor r1, @org.jetbrains.annotations.NotNull android.content.ContentResolver r2, @org.jetbrains.annotations.NotNull java.util.List<? extends android.net.Uri> r3) {
                java.lang.String r0 = "cursor"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.lang.String r0 = "cr"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "uris"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.setNotificationUris(r2, r3)
                return
        }
    }

    private SupportSQLiteCompat() {
            r0 = this;
            r0.<init>()
            return
    }
}
