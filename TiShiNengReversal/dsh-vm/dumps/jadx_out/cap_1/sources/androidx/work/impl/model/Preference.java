package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Preference {

    @androidx.annotation.NonNull
    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "key")
    public java.lang.String mKey;

    @androidx.annotation.Nullable
    @androidx.room.ColumnInfo(name = "long_value")
    public java.lang.Long mValue;

    public Preference(@androidx.annotation.NonNull java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.mKey = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.mValue = r1
            return
    }

    public Preference(@androidx.annotation.NonNull java.lang.String r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L5
            r0 = 1
            goto L7
        L5:
            r0 = 0
        L7:
            r2.<init>(r3, r0)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.work.impl.model.Preference
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.work.impl.model.Preference r5 = (androidx.work.impl.model.Preference) r5
            java.lang.String r1 = r4.mKey
            java.lang.String r3 = r5.mKey
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Long r1 = r4.mValue
            java.lang.Long r5 = r5.mValue
            if (r1 == 0) goto L22
            boolean r5 = r1.equals(r5)
            return r5
        L22:
            if (r5 != 0) goto L25
            return r0
        L25:
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.mKey
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Long r1 = r2.mValue
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }
}
