package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BundleCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static <T> T getParcelable(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.getParcelable(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> T[] getParcelableArray(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.getParcelableArray(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> java.util.ArrayList<T> getParcelableArrayList(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.getParcelableArrayList(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T extends java.io.Serializable> T getSerializable(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.io.Serializable r0 = r0.getSerializable(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> android.util.SparseArray<T> getSparseParcelableArray(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<? extends T> r2) {
                android.util.SparseArray r0 = r0.getSparseParcelableArray(r1, r2)
                return r0
        }
    }

    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.os.IBinder getBinder(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1) {
            android.os.IBinder r0 = r0.getBinder(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static <T> T getParcelable(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r2 = androidx.core.os.BundleCompat.Api33Impl.getParcelable(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.getParcelable(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public static android.os.Parcelable[] getParcelableArray(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArray(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.getParcelableArray(r3)
            return r2
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> java.util.ArrayList<T> getParcelableArrayList(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArrayList(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static <T extends java.io.Serializable> T getSerializable(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = androidx.core.os.BundleCompat.Api33Impl.getSerializable(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.getSerializable(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static <T> android.util.SparseArray<T> getSparseParcelableArray(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r2 = androidx.core.os.BundleCompat.Api33Impl.getSparseParcelableArray(r2, r3, r4)
            return r2
        Lb:
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r3)
            return r2
    }

    @java.lang.Deprecated
    public static void putBinder(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
