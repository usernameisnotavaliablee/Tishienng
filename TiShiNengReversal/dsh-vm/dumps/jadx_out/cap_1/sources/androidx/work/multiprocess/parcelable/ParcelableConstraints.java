package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableConstraints implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableConstraints> CREATOR = null;
    private final androidx.work.Constraints mConstraints;


    static {
            androidx.work.multiprocess.parcelable.ParcelableConstraints$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableConstraints$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableConstraints.CREATOR = r0
            return
    }

    public ParcelableConstraints(@androidx.annotation.NonNull android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            androidx.work.Constraints$Builder r0 = new androidx.work.Constraints$Builder
            r0.<init>()
            int r1 = r5.readInt()
            androidx.work.NetworkType r1 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r1)
            r0.setRequiredNetworkType(r1)
            boolean r1 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r5)
            r0.setRequiresBatteryNotLow(r1)
            boolean r1 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r5)
            r0.setRequiresCharging(r1)
            boolean r1 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r5)
            r0.setRequiresStorageNotLow(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L35
            boolean r2 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r5)
            r0.setRequiresDeviceIdle(r2)
        L35:
            r2 = 24
            if (r1 < r2) goto L77
            boolean r1 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r5)
            if (r1 == 0) goto L67
            byte[] r1 = r5.createByteArray()
            androidx.work.ContentUriTriggers r1 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r1)
            java.util.Set r1 = r1.getTriggers()
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            androidx.work.ContentUriTriggers$Trigger r2 = (androidx.work.ContentUriTriggers.Trigger) r2
            android.net.Uri r3 = r2.getUri()
            boolean r2 = r2.shouldTriggerForDescendants()
            r0.addContentUriTrigger(r3, r2)
            goto L4f
        L67:
            long r1 = r5.readLong()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setTriggerContentMaxDelay(r1, r3)
            long r1 = r5.readLong()
            r0.setTriggerContentUpdateDelay(r1, r3)
        L77:
            androidx.work.Constraints r5 = r0.build()
            r4.mConstraints = r5
            return
    }

    public ParcelableConstraints(@androidx.annotation.NonNull androidx.work.Constraints r1) {
            r0 = this;
            r0.<init>()
            r0.mConstraints = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.Constraints getConstraints() {
            r1 = this;
            androidx.work.Constraints r0 = r1.mConstraints
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            androidx.work.Constraints r4 = r2.mConstraints
            androidx.work.NetworkType r4 = r4.getRequiredNetworkType()
            int r4 = androidx.work.impl.model.WorkTypeConverters.networkTypeToInt(r4)
            r3.writeInt(r4)
            androidx.work.Constraints r4 = r2.mConstraints
            boolean r4 = r4.requiresBatteryNotLow()
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r3, r4)
            androidx.work.Constraints r4 = r2.mConstraints
            boolean r4 = r4.requiresCharging()
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r3, r4)
            androidx.work.Constraints r4 = r2.mConstraints
            boolean r4 = r4.requiresStorageNotLow()
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r3, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r4 < r0) goto L37
            androidx.work.Constraints r0 = r2.mConstraints
            boolean r0 = r0.requiresDeviceIdle()
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r3, r0)
        L37:
            r0 = 24
            if (r4 < r0) goto L65
            androidx.work.Constraints r4 = r2.mConstraints
            boolean r4 = r4.hasContentUriTriggers()
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r3, r4)
            if (r4 == 0) goto L53
            androidx.work.Constraints r4 = r2.mConstraints
            androidx.work.ContentUriTriggers r4 = r4.getContentUriTriggers()
            byte[] r4 = androidx.work.impl.model.WorkTypeConverters.contentUriTriggersToByteArray(r4)
            r3.writeByteArray(r4)
        L53:
            androidx.work.Constraints r4 = r2.mConstraints
            long r0 = r4.getTriggerMaxContentDelay()
            r3.writeLong(r0)
            androidx.work.Constraints r4 = r2.mConstraints
            long r0 = r4.getTriggerContentUpdateDelay()
            r3.writeLong(r0)
        L65:
            return
    }
}
