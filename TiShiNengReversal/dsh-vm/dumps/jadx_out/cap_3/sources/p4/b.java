package p4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ <T extends android.os.Parcelable> android.os.Parcelable.Creator<T> a() {
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.String r2 = "CREATOR"
            java.lang.Class<android.os.Parcelable> r3 = android.os.Parcelable.class
            java.lang.reflect.Field r2 = r3.getDeclaredField(r2)
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            boolean r5 = r2 instanceof android.os.Parcelable.Creator
            if (r5 == 0) goto L1a
            r4 = r2
            android.os.Parcelable$Creator r4 = (android.os.Parcelable.Creator) r4
        L1a:
            if (r4 == 0) goto L1d
            return r4
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not access CREATOR field in class "
            r4.append(r5)
            kotlin.jvm.internal.g0.y(r0, r1)
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r3)
            java.lang.String r0 = r0.D()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
    }
}
