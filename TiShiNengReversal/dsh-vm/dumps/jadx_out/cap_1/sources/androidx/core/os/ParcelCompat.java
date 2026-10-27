package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ParcelCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static <T extends android.os.Parcelable> java.util.List<T> readParcelableList(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.Nullable java.lang.ClassLoader r2) {
                java.util.List r0 = r0.readParcelableList(r1, r2)
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
        static android.os.Parcelable.Creator<?> readParcelableCreator(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1) {
                android.os.Parcelable$Creator r0 = r0.readParcelableCreator(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static <T> T[] readArray(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.readArray(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.readArrayList(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <V, K> java.util.HashMap<K, V> readHashMap(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends K> r2, java.lang.Class<? extends V> r3) {
                java.util.HashMap r0 = r0.readHashMap(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> void readList(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.NonNull java.util.List<? super T> r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
                r0.readList(r1, r2, r3)
                return
        }

        @androidx.annotation.DoNotInline
        static <K, V> void readMap(android.os.Parcel r0, java.util.Map<? super K, ? super V> r1, java.lang.ClassLoader r2, java.lang.Class<K> r3, java.lang.Class<V> r4) {
                r0.readMap(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static <T extends android.os.Parcelable> T readParcelable(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.readParcelable(r1, r2)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> T[] readParcelableArray(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.readParcelableArray(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                android.os.Parcelable$Creator r0 = r0.readParcelableCreator(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> java.util.List<T> readParcelableList(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
                java.util.List r0 = r0.readParcelableList(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T extends java.io.Serializable> T readSerializable(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.readSerializable(r1, r2)
                java.io.Serializable r0 = (java.io.Serializable) r0
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends T> r2) {
                android.util.SparseArray r0 = r0.readSparseArray(r1, r2)
                return r0
        }
    }

    private ParcelCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> java.lang.Object[] readArray(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object[] r2 = androidx.core.os.ParcelCompat.Api33Impl.readArray(r2, r3, r4)
            return r2
        Lb:
            java.lang.Object[] r2 = r2.readArray(r3)
            return r2
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> java.util.ArrayList<T> readArrayList(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = androidx.core.os.ParcelCompat.Api33Impl.readArrayList(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.readArrayList(r3)
            return r2
    }

    public static boolean readBoolean(@androidx.annotation.NonNull android.os.Parcel r0) {
            int r0 = r0.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <K, V> java.util.HashMap<K, V> readHashMap(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<? extends K> r4, @androidx.annotation.NonNull java.lang.Class<? extends V> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.HashMap r2 = androidx.core.os.ParcelCompat.Api33Impl.readHashMap(r2, r3, r4, r5)
            return r2
        Lb:
            java.util.HashMap r2 = r2.readHashMap(r3)
            return r2
    }

    public static <T> void readList(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.NonNull java.util.List<? super T> r3, @androidx.annotation.Nullable java.lang.ClassLoader r4, @androidx.annotation.NonNull java.lang.Class<T> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.os.ParcelCompat.Api33Impl.readList(r2, r3, r4, r5)
            return
        La:
            r2.readList(r3, r4)
            return
    }

    public static <K, V> void readMap(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.NonNull java.util.Map<? super K, ? super V> r3, @androidx.annotation.Nullable java.lang.ClassLoader r4, @androidx.annotation.NonNull java.lang.Class<K> r5, @androidx.annotation.NonNull java.lang.Class<V> r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.os.ParcelCompat.Api33Impl.readMap(r2, r3, r4, r5, r6)
            return
        La:
            r2.readMap(r3, r4)
            return
    }

    @androidx.annotation.Nullable
    public static <T extends android.os.Parcelable> T readParcelable(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.os.Parcelable r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelable(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.readParcelable(r3)
            if (r2 == 0) goto L44
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L18
            goto L44
        L18:
            android.os.BadParcelableException r3 = new android.os.BadParcelableException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Parcelable "
            r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            r0.append(r2)
            java.lang.String r2 = " is not a subclass of required class "
            r0.append(r2)
            java.lang.String r2 = r4.getName()
            r0.append(r2)
            java.lang.String r2 = " provided in the parameter"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L44:
            return r2
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    @java.lang.Deprecated
    public static <T> T[] readParcelableArray(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object[] r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableArray(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable[] r2 = r2.readParcelableArray(r3)
            java.lang.Class<android.os.Parcelable> r3 = android.os.Parcelable.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L18
            return r2
        L18:
            int r3 = r2.length
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r4, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
        L20:
            int r1 = r2.length
            if (r0 >= r1) goto L56
            r1 = r2[r0]     // Catch: java.lang.ClassCastException -> L2e
            java.lang.Object r1 = r4.cast(r1)     // Catch: java.lang.ClassCastException -> L2e
            r3[r0] = r1     // Catch: java.lang.ClassCastException -> L2e
            int r0 = r0 + 1
            goto L20
        L2e:
            android.os.BadParcelableException r2 = new android.os.BadParcelableException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Parcelable at index "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " is not a subclass of required class "
            r3.append(r0)
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = " provided in the parameter"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L56:
            return r3
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> android.os.Parcelable[] readParcelableArrayTyped(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableArray(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.readParcelableArray(r3)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(30)
    public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.os.Parcelable$Creator r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableCreator(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable$Creator r2 = androidx.core.os.ParcelCompat.Api30Impl.readParcelableCreator(r2, r3)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(api = 29)
    public static <T> java.util.List<T> readParcelableList(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.NonNull java.util.List<T> r3, @androidx.annotation.Nullable java.lang.ClassLoader r4, @androidx.annotation.NonNull java.lang.Class<T> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.List r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableList(r2, r3, r4, r5)
            return r2
        Lb:
            java.util.List r2 = androidx.core.os.ParcelCompat.Api29Impl.readParcelableList(r2, r3, r4)
            return r2
    }

    @androidx.annotation.Nullable
    public static <T extends java.io.Serializable> T readSerializable(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = androidx.core.os.ParcelCompat.Api33Impl.readSerializable(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.readSerializable()
            return r2
    }

    @androidx.annotation.Nullable
    public static <T> android.util.SparseArray<T> readSparseArray(@androidx.annotation.NonNull android.os.Parcel r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r2 = androidx.core.os.ParcelCompat.Api33Impl.readSparseArray(r2, r3, r4)
            return r2
        Lb:
            android.util.SparseArray r2 = r2.readSparseArray(r3)
            return r2
    }

    public static void writeBoolean(@androidx.annotation.NonNull android.os.Parcel r0, boolean r1) {
            r0.writeInt(r1)
            return
    }
}
