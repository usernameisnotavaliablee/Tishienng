package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;

    @androidx.annotation.VisibleForTesting
    static final java.lang.String EXTRA_INT1 = "int1";

    @androidx.annotation.VisibleForTesting
    static final java.lang.String EXTRA_INT2 = "int2";

    @androidx.annotation.VisibleForTesting
    static final java.lang.String EXTRA_OBJ = "obj";

    @androidx.annotation.VisibleForTesting
    static final java.lang.String EXTRA_STRING1 = "string1";

    @androidx.annotation.VisibleForTesting
    static final java.lang.String EXTRA_TINT_LIST = "tint_list";

    @androidx.annotation.VisibleForTesting
    static final java.lang.String EXTRA_TINT_MODE = "tint_mode";

    @androidx.annotation.VisibleForTesting
    static final java.lang.String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final java.lang.String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public byte[] mData;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int mInt1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int mInt2;
    java.lang.Object mObj1;

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public android.os.Parcelable mParcelable;

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.String mString1;

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public android.content.res.ColorStateList mTintList;
    android.graphics.PorterDuff.Mode mTintMode;

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.String mTintModeStr;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int mType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        static androidx.core.graphics.drawable.IconCompat createFromIcon(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.graphics.drawable.Icon r3) {
                int r0 = getType(r3)
                r1 = 2
                if (r0 == r1) goto L28
                r2 = 4
                if (r0 == r2) goto L1f
                r2 = 6
                if (r0 == r2) goto L16
                androidx.core.graphics.drawable.IconCompat r2 = new androidx.core.graphics.drawable.IconCompat
                r0 = -1
                r2.<init>(r0)
                r2.mObj1 = r3
                return r2
            L16:
                android.net.Uri r2 = getUri(r3)
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(r2)
                return r2
            L1f:
                android.net.Uri r2 = getUri(r3)
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithContentUri(r2)
                return r2
            L28:
                java.lang.String r0 = getResPackage(r3)
                android.content.res.Resources r2 = androidx.core.graphics.drawable.IconCompat.getResources(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L39
                int r3 = getResId(r3)     // Catch: android.content.res.Resources.NotFoundException -> L39
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithResource(r2, r0, r3)     // Catch: android.content.res.Resources.NotFoundException -> L39
                return r2
            L39:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Icon resource cannot be found"
                r2.<init>(r3)
                throw r2
        }

        static androidx.core.graphics.drawable.IconCompat createFromIconInner(@androidx.annotation.NonNull java.lang.Object r2) {
                androidx.core.util.Preconditions.checkNotNull(r2)
                int r0 = getType(r2)
                r1 = 2
                if (r0 == r1) goto L2b
                r1 = 4
                if (r0 == r1) goto L22
                r1 = 6
                if (r0 == r1) goto L19
                androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
                r1 = -1
                r0.<init>(r1)
                r0.mObj1 = r2
                return r0
            L19:
                android.net.Uri r2 = getUri(r2)
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(r2)
                return r2
            L22:
                android.net.Uri r2 = getUri(r2)
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithContentUri(r2)
                return r2
            L2b:
                java.lang.String r0 = getResPackage(r2)
                int r2 = getResId(r2)
                r1 = 0
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithResource(r1, r0, r2)
                return r2
        }

        @androidx.annotation.DrawableRes
        @androidx.annotation.IdRes
        static int getResId(@androidx.annotation.NonNull java.lang.Object r4) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lb
                int r4 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getResId(r4)
                return r4
            Lb:
                r0 = 0
                java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L22
                java.lang.String r2 = "getResId"
                r3 = 0
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L22
                java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> L22
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L22
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L22
                return r4
            L22:
                return r0
        }

        @androidx.annotation.Nullable
        static java.lang.String getResPackage(@androidx.annotation.NonNull java.lang.Object r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lb
                java.lang.String r3 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getResPackage(r3)
                return r3
            Lb:
                r0 = 0
                java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = "getResPackage"
                java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1d
                return r3
            L1d:
                return r0
        }

        static int getType(@androidx.annotation.NonNull java.lang.Object r4) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lb
                int r4 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getType(r4)
                return r4
            Lb:
                r0 = -1
                java.lang.Class r1 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2a
                java.lang.String r2 = "getType"
                r3 = 0
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2a
                java.lang.Object r1 = r1.invoke(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2a
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2a
                int r4 = r1.intValue()     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2a
                return r4
            L22:
                java.util.Objects.toString(r4)
                return r0
            L26:
                java.util.Objects.toString(r4)
                return r0
            L2a:
                java.util.Objects.toString(r4)
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        static android.net.Uri getUri(@androidx.annotation.NonNull java.lang.Object r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lb
                android.net.Uri r3 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getUri(r3)
                return r3
            Lb:
                r0 = 0
                java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = "getUri"
                java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L1d
                android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Throwable -> L1d
                return r3
            L1d:
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Drawable loadDrawable(android.graphics.drawable.Icon r0, android.content.Context r1) {
                android.graphics.drawable.Drawable r0 = r0.loadDrawable(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Icon toIcon(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
                int r0 = r4.mType
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lcc;
                    case 0: goto L8;
                    case 1: goto Lb3;
                    case 2: goto La8;
                    case 3: goto L9b;
                    case 4: goto L92;
                    case 5: goto L78;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.getUri()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api30Impl.createWithAdaptiveBitmapContentUri(r5)
                goto Lbb
            L20:
                if (r5 == 0) goto L5d
                java.io.InputStream r5 = r4.getUriInputStream(r5)
                if (r5 == 0) goto L42
                if (r0 < r2) goto L34
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(r5)
                goto Lbb
            L34:
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(r5, r1)
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
                goto Lbb
            L42:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.getUri()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L5d:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.getUri()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L78:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L85
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(r5)
                goto Lbb
            L85:
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(r5, r1)
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
                goto Lbb
            L92:
                java.lang.Object r5 = r4.mObj1
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto Lbb
            L9b:
                java.lang.Object r5 = r4.mObj1
                byte[] r5 = (byte[]) r5
                int r0 = r4.mInt1
                int r1 = r4.mInt2
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto Lbb
            La8:
                java.lang.String r5 = r4.getResPackage()
                int r0 = r4.mInt1
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto Lbb
            Lb3:
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            Lbb:
                android.content.res.ColorStateList r0 = r4.mTintList
                if (r0 == 0) goto Lc2
                r5.setTintList(r0)
            Lc2:
                android.graphics.PorterDuff$Mode r4 = r4.mTintMode
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
                if (r4 == r0) goto Lcb
                r5.setTintMode(r4)
            Lcb:
                return r5
            Lcc:
                java.lang.Object r4 = r4.mObj1
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Drawable createAdaptiveIconDrawable(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2) {
                android.graphics.drawable.AdaptiveIconDrawable r0 = new android.graphics.drawable.AdaptiveIconDrawable
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Icon createWithAdaptiveBitmap(android.graphics.Bitmap r0) {
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getResId(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getResId()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getResPackage(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                java.lang.String r0 = r0.getResPackage()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getType(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getType()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.net.Uri getUri(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                android.net.Uri r0 = r0.getUri()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(android.net.Uri r0) {
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public IconCompat() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mType = r0
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            return
    }

    IconCompat(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            r2.mType = r3
            return
    }

    @androidx.annotation.Nullable
    public static androidx.core.graphics.drawable.IconCompat createFromBundle(@androidx.annotation.NonNull android.os.Bundle r4) {
            java.lang.String r0 = "type"
            int r0 = r4.getInt(r0)
            androidx.core.graphics.drawable.IconCompat r1 = new androidx.core.graphics.drawable.IconCompat
            r1.<init>(r0)
            java.lang.String r2 = "int1"
            int r2 = r4.getInt(r2)
            r1.mInt1 = r2
            java.lang.String r2 = "int2"
            int r2 = r4.getInt(r2)
            r1.mInt2 = r2
            java.lang.String r2 = "string1"
            java.lang.String r2 = r4.getString(r2)
            r1.mString1 = r2
            java.lang.String r2 = "tint_list"
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L33
            android.os.Parcelable r2 = r4.getParcelable(r2)
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.mTintList = r2
        L33:
            java.lang.String r2 = "tint_mode"
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L45
            java.lang.String r2 = r4.getString(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.valueOf(r2)
            r1.mTintMode = r2
        L45:
            java.lang.String r2 = "obj"
            switch(r0) {
                case -1: goto L5a;
                case 0: goto L4a;
                case 1: goto L5a;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L53;
                case 5: goto L5a;
                case 6: goto L53;
                default: goto L4a;
            }
        L4a:
            r4 = 0
            return r4
        L4c:
            byte[] r4 = r4.getByteArray(r2)
            r1.mObj1 = r4
            return r1
        L53:
            java.lang.String r4 = r4.getString(r2)
            r1.mObj1 = r4
            return r1
        L5a:
            android.os.Parcelable r4 = r4.getParcelable(r2)
            r1.mObj1 = r4
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(23)
    public static androidx.core.graphics.drawable.IconCompat createFromIcon(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.graphics.drawable.Icon r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIcon(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.graphics.drawable.IconCompat createFromIcon(@androidx.annotation.NonNull android.graphics.drawable.Icon r0) {
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIconInner(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.graphics.drawable.IconCompat createFromIconOrNullIfZeroResId(@androidx.annotation.NonNull android.graphics.drawable.Icon r2) {
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getType(r2)
            r1 = 2
            if (r0 != r1) goto Lf
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResId(r2)
            if (r0 != 0) goto Lf
            r2 = 0
            return r2
        Lf:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIconInner(r2)
            return r2
    }

    @androidx.annotation.VisibleForTesting
    static android.graphics.Bitmap createLegacyIconFromAdaptiveIcon(android.graphics.Bitmap r9, boolean r10) {
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r0 = r0 * r1
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            float r4 = (float) r0
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r4
            r6 = 1063955115(0x3f6aaaab, float:0.9166667)
            float r6 = r6 * r5
            if (r10 == 0) goto L52
            r10 = 1009429163(0x3c2aaaab, float:0.010416667)
            float r10 = r10 * r4
            r7 = 0
            r3.setColor(r7)
            r7 = 1017817771(0x3caaaaab, float:0.020833334)
            float r4 = r4 * r7
            r7 = 1023410176(0x3d000000, float:0.03125)
            r8 = 0
            r3.setShadowLayer(r10, r8, r4, r7)
            r2.drawCircle(r5, r5, r6, r3)
            r4 = 503316480(0x1e000000, float:6.7762636E-21)
            r3.setShadowLayer(r10, r8, r8, r4)
            r2.drawCircle(r5, r5, r6, r3)
            r3.clearShadowLayer()
        L52:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r10)
            android.graphics.BitmapShader r10 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r10.<init>(r9, r4, r4)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r9.getWidth()
            int r7 = r7 - r0
            int r7 = -r7
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            int r9 = r9.getHeight()
            int r9 = r9 - r0
            int r9 = -r9
            float r9 = (float) r9
            float r9 = r9 / r8
            r4.setTranslate(r7, r9)
            r10.setLocalMatrix(r4)
            r3.setShader(r10)
            r2.drawCircle(r5, r5, r6, r3)
            r9 = 0
            r2.setBitmap(r9)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 5
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(@androidx.annotation.NonNull android.net.Uri r0) {
            androidx.core.util.ObjectsCompat.requireNonNull(r0)
            java.lang.String r0 = r0.toString()
            androidx.core.graphics.drawable.IconCompat r0 = createWithAdaptiveBitmapContentUri(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(@androidx.annotation.NonNull java.lang.String r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 6
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 1
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(@androidx.annotation.NonNull android.net.Uri r0) {
            androidx.core.util.ObjectsCompat.requireNonNull(r0)
            java.lang.String r0 = r0.toString()
            androidx.core.graphics.drawable.IconCompat r0 = createWithContentUri(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(@androidx.annotation.NonNull java.lang.String r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 4
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithData(@androidx.annotation.NonNull byte[] r2, int r3, int r4) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 3
            r0.<init>(r1)
            r0.mObj1 = r2
            r0.mInt1 = r3
            r0.mInt2 = r4
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.drawable.IconCompat createWithResource(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DrawableRes int r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r1)
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r1 = r1.getPackageName()
            androidx.core.graphics.drawable.IconCompat r1 = createWithResource(r0, r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.graphics.drawable.IconCompat createWithResource(@androidx.annotation.Nullable android.content.res.Resources r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.DrawableRes int r4) {
            androidx.core.util.ObjectsCompat.requireNonNull(r3)
            if (r4 == 0) goto L23
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 2
            r0.<init>(r1)
            r0.mInt1 = r4
            if (r2 == 0) goto L1e
            java.lang.String r2 = r2.getResourceName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L16
            r0.mObj1 = r2     // Catch: android.content.res.Resources.NotFoundException -> L16
            goto L20
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Icon resource cannot be found"
            r2.<init>(r3)
            throw r2
        L1e:
            r0.mObj1 = r3
        L20:
            r0.mString1 = r3
            return r0
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Drawable resource ID must not be 0"
            r2.<init>(r3)
            throw r2
    }

    static android.content.res.Resources getResources(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "android"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Ld
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            return r2
        Ld:
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r0 = 8192(0x2000, float:1.148E-41)
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r0 == 0) goto L1f
            android.content.res.Resources r2 = r2.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            return r2
        L1f:
            return r1
        L20:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            java.lang.String r3 = "Unable to find pkg=%s for icon"
            java.lang.String.format(r3, r2)
            return r1
    }

    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context r6) {
            r5 = this;
            int r0 = r5.mType
            r1 = 0
            r2 = 0
            switch(r0) {
                case 1: goto La8;
                case 2: goto L75;
                case 3: goto L5f;
                case 4: goto L4b;
                case 5: goto L39;
                case 6: goto L9;
                default: goto L7;
            }
        L7:
            goto La7
        L9:
            java.io.InputStream r0 = r5.getUriInputStream(r6)
            if (r0 == 0) goto La7
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L27
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            r1.<init>(r6, r0)
            android.graphics.drawable.Drawable r6 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createAdaptiveIconDrawable(r2, r1)
            return r6
        L27:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r1)
            r2.<init>(r6, r0)
            return r2
        L39:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object r2 = r5.mObj1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            android.graphics.Bitmap r1 = createLegacyIconFromAdaptiveIcon(r2, r1)
            r0.<init>(r6, r1)
            return r0
        L4b:
            java.io.InputStream r0 = r5.getUriInputStream(r6)
            if (r0 == 0) goto La7
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            r1.<init>(r6, r0)
            return r1
        L5f:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object r1 = r5.mObj1
            byte[] r1 = (byte[]) r1
            int r2 = r5.mInt1
            int r3 = r5.mInt2
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)
            r0.<init>(r6, r1)
            return r0
        L75:
            java.lang.String r0 = r5.getResPackage()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L83
            java.lang.String r0 = r6.getPackageName()
        L83:
            android.content.res.Resources r0 = getResources(r6, r0)
            int r3 = r5.mInt1     // Catch: java.lang.RuntimeException -> L92
            android.content.res.Resources$Theme r6 = r6.getTheme()     // Catch: java.lang.RuntimeException -> L92
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.ResourcesCompat.getDrawable(r0, r3, r6)     // Catch: java.lang.RuntimeException -> L92
            return r6
        L92:
            int r6 = r5.mInt1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r5.mObj1
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            r6 = 1
            r3[r6] = r0
            java.lang.String r6 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String.format(r6, r3)
        La7:
            return r2
        La8:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object r1 = r5.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.<init>(r6, r1)
            return r0
    }

    private static java.lang.String typeToString(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "URI_MASKABLE"
            return r0
        L9:
            java.lang.String r0 = "BITMAP_MASKABLE"
            return r0
        Lc:
            java.lang.String r0 = "URI"
            return r0
        Lf:
            java.lang.String r0 = "DATA"
            return r0
        L12:
            java.lang.String r0 = "RESOURCE"
            return r0
        L15:
            java.lang.String r0 = "BITMAP"
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addToShortcutIntent(@androidx.annotation.NonNull android.content.Intent r5, @androidx.annotation.Nullable android.graphics.drawable.Drawable r6, @androidx.annotation.NonNull android.content.Context r7) {
            r4 = this;
            r4.checkResource(r7)
            int r0 = r4.mType
            r1 = 1
            if (r0 == r1) goto L9a
            r2 = 2
            if (r0 == r2) goto L20
            r7 = 5
            if (r0 != r7) goto L18
            java.lang.Object r7 = r4.mObj1
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            android.graphics.Bitmap r7 = createLegacyIconFromAdaptiveIcon(r7, r1)
            goto La8
        L18:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Icon type not supported for intent shortcuts"
            r5.<init>(r6)
            throw r5
        L20:
            java.lang.String r0 = r4.getResPackage()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r1 = 0
            android.content.Context r7 = r7.createPackageContext(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r6 != 0) goto L39
            java.lang.String r6 = "android.intent.extra.shortcut.ICON_RESOURCE"
            int r0 = r4.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.Intent$ShortcutIconResource r7 = android.content.Intent.ShortcutIconResource.fromContext(r7, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r5.putExtra(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            return
        L37:
            r5 = move-exception
            goto L81
        L39:
            int r0 = r4.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r7, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            int r2 = r0.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 <= 0) goto L5b
            int r2 = r0.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 > 0) goto L4c
            goto L5b
        L4c:
            int r7 = r0.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            int r2 = r0.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            goto L6d
        L5b:
            java.lang.String r2 = "activity"
            java.lang.Object r7 = r7.getSystemService(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            int r7 = r7.getLauncherLargeIconSize()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r7, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
        L6d:
            int r2 = r7.getWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            int r3 = r7.getHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r0.setBounds(r1, r1, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r1.<init>(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r0.draw(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            goto La8
        L81:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Can't find package "
            r7.append(r0)
            java.lang.Object r0 = r4.mObj1
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r5)
            throw r6
        L9a:
            java.lang.Object r7 = r4.mObj1
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r6 == 0) goto La8
            android.graphics.Bitmap$Config r0 = r7.getConfig()
            android.graphics.Bitmap r7 = r7.copy(r0, r1)
        La8:
            if (r6 == 0) goto Lc1
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            int r2 = r0 / 2
            int r3 = r1 / 2
            r6.setBounds(r2, r3, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r7)
            r6.draw(r0)
        Lc1:
            java.lang.String r6 = "android.intent.extra.shortcut.ICON"
            r5.putExtra(r6, r7)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void checkResource(@androidx.annotation.NonNull android.content.Context r9) {
            r8 = this;
            int r0 = r8.mType
            r1 = 2
            if (r0 != r1) goto L4c
            java.lang.Object r0 = r8.mObj1
            if (r0 == 0) goto L4c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ":"
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L14
            goto L4c
        L14:
            r2 = -1
            java.lang.String[] r3 = r0.split(r1, r2)
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "/"
            java.lang.String[] r6 = r3.split(r5, r2)
            r7 = 0
            r6 = r6[r7]
            java.lang.String[] r3 = r3.split(r5, r2)
            r3 = r3[r4]
            java.lang.String[] r0 = r0.split(r1, r2)
            r0 = r0[r7]
            java.lang.String r1 = "0_resource_name_obfuscated"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            return
        L3a:
            java.lang.String r1 = r8.getResPackage()
            android.content.res.Resources r9 = getResources(r9, r1)
            int r9 = r9.getIdentifier(r3, r6, r0)
            int r0 = r8.mInt1
            if (r0 == r9) goto L4c
            r8.mInt1 = r9
        L4c:
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.Bitmap getBitmap() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L16
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L16
            java.lang.Object r0 = r3.mObj1
            boolean r1 = r0 instanceof android.graphics.Bitmap
            if (r1 == 0) goto L14
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L14:
            r0 = 0
            return r0
        L16:
            r1 = 1
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L1e:
            r2 = 5
            if (r0 != r2) goto L2a
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r1)
            return r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getBitmap() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.DrawableRes
    public int getResId() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L12
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L12
            java.lang.Object r0 = r3.mObj1
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResId(r0)
            return r0
        L12:
            r1 = 2
            if (r0 != r1) goto L18
            int r0 = r3.mInt1
            return r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getResPackage() {
            r4 = this;
            int r0 = r4.mType
            r1 = -1
            if (r0 != r1) goto L12
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L12
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResPackage(r0)
            return r0
        L12:
            r2 = 2
            if (r0 != r2) goto L31
            java.lang.String r0 = r4.mString1
            if (r0 == 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L20
            goto L23
        L20:
            java.lang.String r0 = r4.mString1
            return r0
        L23:
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2, r1)
            r1 = 0
            r0 = r0[r1]
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResPackage() on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getType() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L11
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L11
            java.lang.Object r0 = r3.mObj1
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getType(r0)
        L11:
            return r0
    }

    @androidx.annotation.NonNull
    public android.net.Uri getUri() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L12
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L12
            java.lang.Object r0 = r3.mObj1
            android.net.Uri r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getUri(r0)
            return r0
        L12:
            r1 = 4
            if (r0 == r1) goto L30
            r1 = 6
            if (r0 != r1) goto L19
            goto L30
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getUri() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L30:
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.io.InputStream getUriInputStream(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            android.net.Uri r0 = r3.getUri()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L19
            goto L2c
        L19:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L28
            java.io.File r1 = new java.io.File     // Catch: java.io.FileNotFoundException -> L28
            java.lang.Object r2 = r3.mObj1     // Catch: java.io.FileNotFoundException -> L28
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.FileNotFoundException -> L28
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L28
            r4.<init>(r1)     // Catch: java.io.FileNotFoundException -> L28
            return r4
        L28:
            r0.toString()
            goto L38
        L2c:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L35
            java.io.InputStream r4 = r4.openInputStream(r0)     // Catch: java.lang.Exception -> L35
            return r4
        L35:
            r0.toString()
        L38:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable loadDrawable(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.checkResource(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L12
            android.graphics.drawable.Icon r0 = r2.toIcon(r3)
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.IconCompat.Api23Impl.loadDrawable(r0, r3)
            return r3
        L12:
            android.graphics.drawable.Drawable r3 = r2.loadDrawableInner(r3)
            if (r3 == 0) goto L2f
            android.content.res.ColorStateList r0 = r2.mTintList
            if (r0 != 0) goto L22
            android.graphics.PorterDuff$Mode r0 = r2.mTintMode
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r0 == r1) goto L2f
        L22:
            r3.mutate()
            android.content.res.ColorStateList r0 = r2.mTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r3, r0)
            android.graphics.PorterDuff$Mode r0 = r2.mTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r3, r0)
        L2f:
            return r3
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
            r4 = this;
            java.lang.String r0 = r4.mTintModeStr
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)
            r4.mTintMode = r0
            int r0 = r4.mType
            r1 = 0
            switch(r0) {
                case -1: goto L4c;
                case 0: goto Le;
                case 1: goto L38;
                case 2: goto L14;
                case 3: goto Lf;
                case 4: goto L14;
                case 5: goto L38;
                case 6: goto L14;
                default: goto Le;
            }
        Le:
            goto L37
        Lf:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            return
        L14:
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r4.mData
            java.lang.String r3 = "UTF-16"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r0.<init>(r2, r3)
            r4.mObj1 = r0
            int r2 = r4.mType
            r3 = 2
            if (r2 != r3) goto L37
            java.lang.String r2 = r4.mString1
            if (r2 != 0) goto L37
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r0 = r0.split(r2, r3)
            r0 = r0[r1]
            r4.mString1 = r0
        L37:
            return
        L38:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L3f
            r4.mObj1 = r0
            return
        L3f:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            r2 = 3
            r4.mType = r2
            r4.mInt1 = r1
            int r0 = r0.length
            r4.mInt2 = r0
            return
        L4c:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L53
            r4.mObj1 = r0
            return
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.mTintMode
            java.lang.String r0 = r0.name()
            r3.mTintModeStr = r0
            int r0 = r3.mType
            java.lang.String r1 = "UTF-16"
            switch(r0) {
                case -1: goto L57;
                case 0: goto Lf;
                case 1: goto L37;
                case 2: goto L28;
                case 3: goto L21;
                case 4: goto L10;
                case 5: goto L37;
                case 6: goto L10;
                default: goto Lf;
            }
        Lf:
            return
        L10:
            java.lang.Object r4 = r3.mObj1
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)
            byte[] r4 = r4.getBytes(r0)
            r3.mData = r4
            return
        L21:
            java.lang.Object r4 = r3.mObj1
            byte[] r4 = (byte[]) r4
            r3.mData = r4
            return
        L28:
            java.lang.Object r4 = r3.mObj1
            java.lang.String r4 = (java.lang.String) r4
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)
            byte[] r4 = r4.getBytes(r0)
            r3.mData = r4
            return
        L37:
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.mObj1
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 90
            r4.compress(r1, r2, r0)
            byte[] r4 = r0.toByteArray()
            r3.mData = r4
            return
        L50:
            java.lang.Object r4 = r3.mObj1
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.mParcelable = r4
            return
        L57:
            if (r4 != 0) goto L60
            java.lang.Object r4 = r3.mObj1
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.mParcelable = r4
            return
        L60:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't serialize Icon created with IconCompat#createFromIcon"
            r4.<init>(r0)
            throw r4
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.drawable.IconCompat setTint(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            androidx.core.graphics.drawable.IconCompat r1 = r0.setTintList(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.drawable.IconCompat setTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mTintList = r1
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.drawable.IconCompat setTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mTintMode = r1
            return r0
    }

    @androidx.annotation.NonNull
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.mType
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L2c;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.mObj1
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L33
        L1c:
            java.lang.Object r1 = r3.mObj1
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L33
        L24:
            java.lang.Object r1 = r3.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.putParcelable(r2, r1)
            goto L33
        L2c:
            java.lang.Object r1 = r3.mObj1
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putParcelable(r2, r1)
        L33:
            java.lang.String r1 = "type"
            int r2 = r3.mType
            r0.putInt(r1, r2)
            java.lang.String r1 = "int1"
            int r2 = r3.mInt1
            r0.putInt(r1, r2)
            java.lang.String r1 = "int2"
            int r2 = r3.mInt2
            r0.putInt(r1, r2)
            java.lang.String r1 = "string1"
            java.lang.String r2 = r3.mString1
            r0.putString(r1, r2)
            android.content.res.ColorStateList r1 = r3.mTintList
            if (r1 == 0) goto L58
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L58:
            android.graphics.PorterDuff$Mode r1 = r3.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto L67
            java.lang.String r2 = "tint_mode"
            java.lang.String r1 = r1.name()
            r0.putString(r2, r1)
        L67:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(23)
    @java.lang.Deprecated
    public android.graphics.drawable.Icon toIcon() {
            r1 = this;
            r0 = 0
            android.graphics.drawable.Icon r0 = r1.toIcon(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(23)
    public android.graphics.drawable.Icon toIcon(@androidx.annotation.Nullable android.content.Context r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Icon r3 = androidx.core.graphics.drawable.IconCompat.Api23Impl.toIcon(r2, r3)
            return r3
        Lb:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is only supported on API level 23+"
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.mType
            java.lang.String r1 = typeToString(r1)
            r0.append(r1)
            int r1 = r4.mType
            switch(r1) {
                case 1: goto L6d;
                case 2: goto L46;
                case 3: goto L2d;
                case 4: goto L22;
                case 5: goto L6d;
                case 6: goto L22;
                default: goto L21;
            }
        L21:
            goto L8e
        L22:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            r0.append(r1)
            goto L8e
        L2d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.mInt1
            r0.append(r1)
            int r1 = r4.mInt2
            if (r1 == 0) goto L8e
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.mInt2
            r0.append(r1)
            goto L8e
        L46:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mString1
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            int r1 = r4.getResId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            goto L8e
        L6d:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L8e:
            android.content.res.ColorStateList r1 = r4.mTintList
            if (r1 == 0) goto L9c
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.mTintList
            r0.append(r1)
        L9c:
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto Lac
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            r0.append(r1)
        Lac:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
