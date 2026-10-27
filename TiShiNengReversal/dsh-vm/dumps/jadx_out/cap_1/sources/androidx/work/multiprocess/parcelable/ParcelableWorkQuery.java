package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableWorkQuery implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableWorkQuery> CREATOR = null;
    private final androidx.work.WorkQuery mWorkQuery;


    static {
            androidx.work.multiprocess.parcelable.ParcelableWorkQuery$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkQuery$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkQuery.CREATOR = r0
            return
    }

    protected ParcelableWorkQuery(@androidx.annotation.NonNull android.os.Parcel r8) {
            r7 = this;
            r7.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            int r1 = r8.readInt()
            r2 = 0
            if (r1 <= 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r3 = 0
        L12:
            if (r3 >= r1) goto L22
            java.lang.String r4 = r8.readString()
            java.util.UUID r4 = java.util.UUID.fromString(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L12
        L22:
            java.util.ArrayList r1 = r8.createStringArrayList()
            java.util.ArrayList r3 = r8.createStringArrayList()
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            int r5 = r8.readInt()
            if (r5 <= 0) goto L47
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
        L37:
            if (r2 >= r5) goto L47
            int r6 = r8.readInt()
            androidx.work.WorkInfo$State r6 = androidx.work.impl.model.WorkTypeConverters.intToState(r6)
            r4.add(r6)
            int r2 = r2 + 1
            goto L37
        L47:
            androidx.work.WorkQuery$Builder r8 = androidx.work.WorkQuery.Builder.fromIds(r0)
            androidx.work.WorkQuery$Builder r8 = r8.addUniqueWorkNames(r1)
            androidx.work.WorkQuery$Builder r8 = r8.addTags(r3)
            androidx.work.WorkQuery$Builder r8 = r8.addStates(r4)
            androidx.work.WorkQuery r8 = r8.build()
            r7.mWorkQuery = r8
            return
    }

    public ParcelableWorkQuery(@androidx.annotation.NonNull androidx.work.WorkQuery r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkQuery = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.WorkQuery getWorkQuery() {
            r1 = this;
            androidx.work.WorkQuery r0 = r1.mWorkQuery
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r2, int r3) {
            r1 = this;
            androidx.work.WorkQuery r3 = r1.mWorkQuery
            java.util.List r3 = r3.getIds()
            int r0 = r3.size()
            r2.writeInt(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2b
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            java.util.UUID r0 = (java.util.UUID) r0
            java.lang.String r0 = r0.toString()
            r2.writeString(r0)
            goto L17
        L2b:
            androidx.work.WorkQuery r3 = r1.mWorkQuery
            java.util.List r3 = r3.getUniqueWorkNames()
            r2.writeStringList(r3)
            androidx.work.WorkQuery r3 = r1.mWorkQuery
            java.util.List r3 = r3.getTags()
            r2.writeStringList(r3)
            androidx.work.WorkQuery r3 = r1.mWorkQuery
            java.util.List r3 = r3.getStates()
            int r0 = r3.size()
            r2.writeInt(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L68
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r3.next()
            androidx.work.WorkInfo$State r0 = (androidx.work.WorkInfo.State) r0
            int r0 = androidx.work.impl.model.WorkTypeConverters.stateToInt(r0)
            r2.writeInt(r0)
            goto L54
        L68:
            return
    }
}
