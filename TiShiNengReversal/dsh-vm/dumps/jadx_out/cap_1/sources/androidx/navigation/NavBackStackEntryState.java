package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class NavBackStackEntryState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.navigation.NavBackStackEntryState> CREATOR = null;
    private final android.os.Bundle mArgs;
    private final int mDestinationId;
    private final android.os.Bundle mSavedState;
    private final java.util.UUID mUUID;


    static {
            androidx.navigation.NavBackStackEntryState$1 r0 = new androidx.navigation.NavBackStackEntryState$1
            r0.<init>()
            androidx.navigation.NavBackStackEntryState.CREATOR = r0
            return
    }

    NavBackStackEntryState(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r2.mUUID = r0
            int r0 = r3.readInt()
            r2.mDestinationId = r0
            java.lang.Class<androidx.navigation.NavBackStackEntryState> r0 = androidx.navigation.NavBackStackEntryState.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Bundle r1 = r3.readBundle(r1)
            r2.mArgs = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r3 = r3.readBundle(r0)
            r2.mSavedState = r3
            return
    }

    NavBackStackEntryState(androidx.navigation.NavBackStackEntry r2) {
            r1 = this;
            r1.<init>()
            java.util.UUID r0 = r2.mId
            r1.mUUID = r0
            androidx.navigation.NavDestination r0 = r2.getDestination()
            int r0 = r0.getId()
            r1.mDestinationId = r0
            android.os.Bundle r0 = r2.getArguments()
            r1.mArgs = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.mSavedState = r0
            r2.saveState(r0)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    android.os.Bundle getArgs() {
            r1 = this;
            android.os.Bundle r0 = r1.mArgs
            return r0
    }

    int getDestinationId() {
            r1 = this;
            int r0 = r1.mDestinationId
            return r0
    }

    @androidx.annotation.NonNull
    android.os.Bundle getSavedState() {
            r1 = this;
            android.os.Bundle r0 = r1.mSavedState
            return r0
    }

    @androidx.annotation.NonNull
    java.util.UUID getUUID() {
            r1 = this;
            java.util.UUID r0 = r1.mUUID
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.UUID r2 = r0.mUUID
            java.lang.String r2 = r2.toString()
            r1.writeString(r2)
            int r2 = r0.mDestinationId
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.mArgs
            r1.writeBundle(r2)
            android.os.Bundle r2 = r0.mSavedState
            r1.writeBundle(r2)
            return
    }
}
