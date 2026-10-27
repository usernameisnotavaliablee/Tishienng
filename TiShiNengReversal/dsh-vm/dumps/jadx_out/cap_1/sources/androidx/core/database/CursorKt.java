package androidx.core.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CursorKt {
    @org.jetbrains.annotations.Nullable
    public static final byte[] getBlobOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            byte[] r1 = r1.getBlob(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Double getDoubleOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            double r1 = r1.getDouble(r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float getFloatOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            float r1 = r1.getFloat(r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer getIntOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long getLongOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            long r1 = r1.getLong(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short getShortOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            short r1 = r1.getShort(r2)
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getStringOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.getString(r2)
            return r1
    }
}
