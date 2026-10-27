package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableWorkContinuationImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl> CREATOR = null;
    private static final androidx.work.ExistingWorkPolicy[] sValues = null;
    private androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo mInfo;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WorkContinuationImplInfo {
        private final java.lang.String mName;
        private java.util.List<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo> mParents;
        private final java.util.List<? extends androidx.work.WorkRequest> mRequests;
        private final androidx.work.ExistingWorkPolicy mWorkPolicy;

        public WorkContinuationImplInfo(@androidx.annotation.NonNull androidx.work.impl.WorkContinuationImpl r4) {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = r4.getName()
                r3.mName = r0
                androidx.work.ExistingWorkPolicy r0 = r4.getExistingWorkPolicy()
                r3.mWorkPolicy = r0
                java.util.List r0 = r4.getWork()
                r3.mRequests = r0
                java.util.List r4 = r4.getParents()
                r0 = 0
                r3.mParents = r0
                if (r4 == 0) goto L44
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                r0.<init>(r1)
                r3.mParents = r0
                java.util.Iterator r4 = r4.iterator()
            L2d:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L44
                java.lang.Object r0 = r4.next()
                androidx.work.impl.WorkContinuationImpl r0 = (androidx.work.impl.WorkContinuationImpl) r0
                java.util.List<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo> r1 = r3.mParents
                androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r2 = new androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo
                r2.<init>(r0)
                r1.add(r2)
                goto L2d
            L44:
                return
        }

        public WorkContinuationImplInfo(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull java.util.List<? extends androidx.work.WorkRequest> r3, @androidx.annotation.Nullable java.util.List<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo> r4) {
                r0 = this;
                r0.<init>()
                r0.mName = r1
                r0.mWorkPolicy = r2
                r0.mRequests = r3
                r0.mParents = r4
                return
        }

        @androidx.annotation.Nullable
        private static java.util.List<androidx.work.impl.WorkContinuationImpl> parents(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r8, @androidx.annotation.Nullable java.util.List<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo> r9) {
                if (r9 != 0) goto L4
                r8 = 0
                return r8
            L4:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r9.size()
                r0.<init>(r1)
                java.util.Iterator r9 = r9.iterator()
            L11:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L3b
                java.lang.Object r1 = r9.next()
                androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r1 = (androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo) r1
                androidx.work.impl.WorkContinuationImpl r2 = new androidx.work.impl.WorkContinuationImpl
                java.lang.String r4 = r1.getName()
                androidx.work.ExistingWorkPolicy r5 = r1.getExistingWorkPolicy()
                java.util.List r6 = r1.getWork()
                java.util.List r1 = r1.getParentInfos()
                java.util.List r7 = parents(r8, r1)
                r3 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r0.add(r2)
                goto L11
            L3b:
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.ExistingWorkPolicy getExistingWorkPolicy() {
                r1 = this;
                androidx.work.ExistingWorkPolicy r0 = r1.mWorkPolicy
                return r0
        }

        @androidx.annotation.Nullable
        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.mName
                return r0
        }

        @androidx.annotation.Nullable
        public java.util.List<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo> getParentInfos() {
                r1 = this;
                java.util.List<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo> r0 = r1.mParents
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.List<? extends androidx.work.WorkRequest> getWork() {
                r1 = this;
                java.util.List<? extends androidx.work.WorkRequest> r0 = r1.mRequests
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.impl.WorkContinuationImpl toWorkContinuationImpl(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r7) {
                r6 = this;
                androidx.work.impl.WorkContinuationImpl r0 = new androidx.work.impl.WorkContinuationImpl
                java.lang.String r2 = r6.getName()
                androidx.work.ExistingWorkPolicy r3 = r6.getExistingWorkPolicy()
                java.util.List r4 = r6.getWork()
                java.util.List r1 = r6.getParentInfos()
                java.util.List r5 = parents(r7, r1)
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    static {
            androidx.work.ExistingWorkPolicy[] r0 = androidx.work.ExistingWorkPolicy.values()
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.sValues = r0
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.CREATOR = r0
            return
    }

    protected ParcelableWorkContinuationImpl(@androidx.annotation.NonNull android.os.Parcel r10) {
            r9 = this;
            r9.<init>()
            boolean r0 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r10)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r0 = r10.readString()
            goto L10
        Lf:
            r0 = r1
        L10:
            int r2 = r10.readInt()
            androidx.work.ExistingWorkPolicy[] r3 = androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.sValues
            r2 = r3[r2]
            int r3 = r10.readInt()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            java.lang.Class r5 = r9.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r6 = 0
            r7 = 0
        L2b:
            if (r7 >= r3) goto L3f
            android.os.Parcelable r8 = r10.readParcelable(r5)
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest r8 = (androidx.work.multiprocess.parcelable.ParcelableWorkRequest) r8
            androidx.work.WorkRequest r8 = r8.getWorkRequest()
            androidx.work.impl.WorkRequestHolder r8 = (androidx.work.impl.WorkRequestHolder) r8
            r4.add(r8)
            int r7 = r7 + 1
            goto L2b
        L3f:
            boolean r3 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r10)
            if (r3 == 0) goto L61
            int r1 = r10.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
        L4e:
            if (r6 >= r1) goto L60
            android.os.Parcelable r7 = r10.readParcelable(r5)
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl r7 = (androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl) r7
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r7 = r7.getInfo()
            r3.add(r7)
            int r6 = r6 + 1
            goto L4e
        L60:
            r1 = r3
        L61:
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo
            r10.<init>(r0, r2, r4, r1)
            r9.mInfo = r10
            return
    }

    public ParcelableWorkContinuationImpl(@androidx.annotation.NonNull androidx.work.impl.WorkContinuationImpl r2) {
            r1 = this;
            r1.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo
            r0.<init>(r2)
            r1.mInfo = r0
            return
    }

    public ParcelableWorkContinuationImpl(@androidx.annotation.NonNull androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo r1) {
            r0 = this;
            r0.<init>()
            r0.mInfo = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo getInfo() {
            r1 = this;
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r0 = r1.mInfo
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.impl.WorkContinuationImpl toWorkContinuationImpl(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r2) {
            r1 = this;
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r0 = r1.mInfo
            androidx.work.impl.WorkContinuationImpl r2 = r0.toWorkContinuationImpl(r2)
            return r2
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r6, int r7) {
            r5 = this;
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r0 = r5.mInfo
            java.lang.String r0 = r0.getName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = r1 ^ 1
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r6, r2)
            if (r1 != 0) goto L14
            r6.writeString(r0)
        L14:
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r0 = r5.mInfo
            androidx.work.ExistingWorkPolicy r0 = r0.getExistingWorkPolicy()
            int r0 = r0.ordinal()
            r6.writeInt(r0)
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r0 = r5.mInfo
            java.util.List r0 = r0.getWork()
            int r1 = r0.size()
            r6.writeInt(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L4d
            r1 = 0
        L36:
            int r3 = r0.size()
            if (r1 >= r3) goto L4d
            java.lang.Object r3 = r0.get(r1)
            androidx.work.WorkRequest r3 = (androidx.work.WorkRequest) r3
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest r4 = new androidx.work.multiprocess.parcelable.ParcelableWorkRequest
            r4.<init>(r3)
            r6.writeParcelable(r4, r7)
            int r1 = r1 + 1
            goto L36
        L4d:
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r0 = r5.mInfo
            java.util.List r0 = r0.getParentInfos()
            if (r0 == 0) goto L5d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L5d
            r1 = 1
            goto L5e
        L5d:
            r1 = 0
        L5e:
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r6, r1)
            if (r1 == 0) goto L81
            int r1 = r0.size()
            r6.writeInt(r1)
        L6a:
            int r1 = r0.size()
            if (r2 >= r1) goto L81
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl r1 = new androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl
            java.lang.Object r3 = r0.get(r2)
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$WorkContinuationImplInfo r3 = (androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.WorkContinuationImplInfo) r3
            r1.<init>(r3)
            r6.writeParcelable(r1, r7)
            int r2 = r2 + 1
            goto L6a
        L81:
            return
    }
}
