package com.bxkj.base.v2.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.parcelize.Parcelize
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ParcelableList implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.bxkj.base.v2.data.ParcelableList> CREATOR = null;

    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements android.os.Parcelable.Creator<com.bxkj.base.v2.data.ParcelableList> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.bxkj.base.v2.data.ParcelableList a(android.os.Parcel r10) {
                r9 = this;
                java.lang.String r0 = "parcel"
                kotlin.jvm.internal.g0.p(r10, r0)
                int r0 = r10.readInt()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
                r3 = 0
            L10:
                if (r3 == r0) goto L38
                int r4 = r10.readInt()
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>(r4)
                r6 = 0
            L1c:
                if (r6 == r4) goto L32
                java.lang.String r7 = r10.readString()
                java.lang.Class<com.bxkj.base.v2.data.ParcelableList> r8 = com.bxkj.base.v2.data.ParcelableList.class
                java.lang.ClassLoader r8 = r8.getClassLoader()
                java.lang.Object r8 = r10.readValue(r8)
                r5.put(r7, r8)
                int r6 = r6 + 1
                goto L1c
            L32:
                r1.add(r5)
                int r3 = r3 + 1
                goto L10
            L38:
                com.bxkj.base.v2.data.ParcelableList r10 = new com.bxkj.base.v2.data.ParcelableList
                r10.<init>(r1)
                return r10
        }

        public final com.bxkj.base.v2.data.ParcelableList[] b(int r1) {
                r0 = this;
                com.bxkj.base.v2.data.ParcelableList[] r1 = new com.bxkj.base.v2.data.ParcelableList[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.base.v2.data.ParcelableList createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.bxkj.base.v2.data.ParcelableList r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.base.v2.data.ParcelableList[] newArray(int r1) {
                r0 = this;
                com.bxkj.base.v2.data.ParcelableList[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            com.bxkj.base.v2.data.ParcelableList$a r0 = new com.bxkj.base.v2.data.ParcelableList$a
            r0.<init>()
            com.bxkj.base.v2.data.ParcelableList.CREATOR = r0
            return
    }

    public ParcelableList(@org.jetbrains.annotations.NotNull java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a() {
            r1 = this;
            java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r0 = r1.a
            return r0
    }

    public final void b(@org.jetbrains.annotations.NotNull java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = "dest"
            kotlin.jvm.internal.g0.p(r4, r5)
            java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r5 = r3.a
            int r0 = r5.size()
            r4.writeInt(r0)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r5.next()
            java.util.Map r0 = (java.util.Map) r0
            int r1 = r0.size()
            r4.writeInt(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L12
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r4.writeString(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeValue(r1)
            goto L2d
        L4a:
            return
    }
}
