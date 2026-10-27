package com.bxkj.base.v2.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.parcelize.Parcelize
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ParcelableMap implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.bxkj.base.v2.data.ParcelableMap> CREATOR = null;

    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, java.lang.Object> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements android.os.Parcelable.Creator<com.bxkj.base.v2.data.ParcelableMap> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.bxkj.base.v2.data.ParcelableMap a(android.os.Parcel r6) {
                r5 = this;
                java.lang.String r0 = "parcel"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = r6.readInt()
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>(r0)
                r2 = 0
            Lf:
                if (r2 == r0) goto L25
                java.lang.String r3 = r6.readString()
                java.lang.Class<com.bxkj.base.v2.data.ParcelableMap> r4 = com.bxkj.base.v2.data.ParcelableMap.class
                java.lang.ClassLoader r4 = r4.getClassLoader()
                java.lang.Object r4 = r6.readValue(r4)
                r1.put(r3, r4)
                int r2 = r2 + 1
                goto Lf
            L25:
                com.bxkj.base.v2.data.ParcelableMap r6 = new com.bxkj.base.v2.data.ParcelableMap
                r6.<init>(r1)
                return r6
        }

        public final com.bxkj.base.v2.data.ParcelableMap[] b(int r1) {
                r0 = this;
                com.bxkj.base.v2.data.ParcelableMap[] r1 = new com.bxkj.base.v2.data.ParcelableMap[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.base.v2.data.ParcelableMap createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.bxkj.base.v2.data.ParcelableMap r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.bxkj.base.v2.data.ParcelableMap[] newArray(int r1) {
                r0 = this;
                com.bxkj.base.v2.data.ParcelableMap[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            com.bxkj.base.v2.data.ParcelableMap$a r0 = new com.bxkj.base.v2.data.ParcelableMap$a
            r0.<init>()
            com.bxkj.base.v2.data.ParcelableMap.CREATOR = r0
            return
    }

    public ParcelableMap(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> a() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.a
            return r0
    }

    public final void b(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r2) {
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
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = "dest"
            kotlin.jvm.internal.g0.p(r3, r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.a
            int r0 = r4.size()
            r3.writeInt(r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.writeString(r1)
            java.lang.Object r0 = r0.getValue()
            r3.writeValue(r0)
            goto L16
        L33:
            return
    }
}
