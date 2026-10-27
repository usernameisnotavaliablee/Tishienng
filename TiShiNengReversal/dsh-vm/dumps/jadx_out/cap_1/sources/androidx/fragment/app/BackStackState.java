package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = null;
    private static final java.lang.String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final java.lang.CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final java.lang.CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final java.util.ArrayList<java.lang.String> mFragmentWhos;
    final int mIndex;
    final java.lang.String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    final java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    final int mTransition;


    static {
            androidx.fragment.app.BackStackState$1 r0 = new androidx.fragment.app.BackStackState$1
            r0.<init>()
            androidx.fragment.app.BackStackState.CREATOR = r0
            return
    }

    public BackStackState(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int[] r0 = r3.createIntArray()
            r2.mOps = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.mFragmentWhos = r0
            int[] r0 = r3.createIntArray()
            r2.mOldMaxLifecycleStates = r0
            int[] r0 = r3.createIntArray()
            r2.mCurrentMaxLifecycleStates = r0
            int r0 = r3.readInt()
            r2.mTransition = r0
            java.lang.String r0 = r3.readString()
            r2.mName = r0
            int r0 = r3.readInt()
            r2.mIndex = r0
            int r0 = r3.readInt()
            r2.mBreadCrumbTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.mBreadCrumbTitleText = r1
            int r1 = r3.readInt()
            r2.mBreadCrumbShortTitleRes = r1
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.mBreadCrumbShortTitleText = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.mSharedElementTargetNames = r0
            int r3 = r3.readInt()
            if (r3 == 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = 0
        L60:
            r2.mReorderingAllowed = r3
            return
    }

    public BackStackState(androidx.fragment.app.BackStackRecord r9) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r9.mOps
            int r0 = r0.size()
            int r1 = r0 * 5
            int[] r1 = new int[r1]
            r8.mOps = r1
            boolean r1 = r9.mAddToBackStack
            if (r1 == 0) goto L9d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r8.mFragmentWhos = r1
            int[] r1 = new int[r0]
            r8.mOldMaxLifecycleStates = r1
            int[] r1 = new int[r0]
            r8.mCurrentMaxLifecycleStates = r1
            r1 = 0
            r2 = 0
        L24:
            if (r1 >= r0) goto L74
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r9.mOps
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            int[] r4 = r8.mOps
            int r5 = r2 + 1
            int r6 = r3.mCmd
            r4[r2] = r6
            java.util.ArrayList<java.lang.String> r4 = r8.mFragmentWhos
            androidx.fragment.app.Fragment r6 = r3.mFragment
            if (r6 == 0) goto L3f
            java.lang.String r6 = r6.mWho
            goto L40
        L3f:
            r6 = 0
        L40:
            r4.add(r6)
            int[] r4 = r8.mOps
            int r6 = r2 + 2
            int r7 = r3.mEnterAnim
            r4[r5] = r7
            int r5 = r2 + 3
            int r7 = r3.mExitAnim
            r4[r6] = r7
            int r6 = r2 + 4
            int r7 = r3.mPopEnterAnim
            r4[r5] = r7
            int r2 = r2 + 5
            int r5 = r3.mPopExitAnim
            r4[r6] = r5
            int[] r4 = r8.mOldMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r5 = r3.mOldMaxState
            int r5 = r5.ordinal()
            r4[r1] = r5
            int[] r4 = r8.mCurrentMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r3 = r3.mCurrentMaxState
            int r3 = r3.ordinal()
            r4[r1] = r3
            int r1 = r1 + 1
            goto L24
        L74:
            int r0 = r9.mTransition
            r8.mTransition = r0
            java.lang.String r0 = r9.mName
            r8.mName = r0
            int r0 = r9.mIndex
            r8.mIndex = r0
            int r0 = r9.mBreadCrumbTitleRes
            r8.mBreadCrumbTitleRes = r0
            java.lang.CharSequence r0 = r9.mBreadCrumbTitleText
            r8.mBreadCrumbTitleText = r0
            int r0 = r9.mBreadCrumbShortTitleRes
            r8.mBreadCrumbShortTitleRes = r0
            java.lang.CharSequence r0 = r9.mBreadCrumbShortTitleText
            r8.mBreadCrumbShortTitleText = r0
            java.util.ArrayList<java.lang.String> r0 = r9.mSharedElementSourceNames
            r8.mSharedElementSourceNames = r0
            java.util.ArrayList<java.lang.String> r0 = r9.mSharedElementTargetNames
            r8.mSharedElementTargetNames = r0
            boolean r9 = r9.mReorderingAllowed
            r8.mReorderingAllowed = r9
            return
        L9d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r9.<init>(r0)
            throw r9
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r10) {
            r9 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r10)
            r1 = 0
            r2 = 0
        L7:
            int[] r3 = r9.mOps
            int r3 = r3.length
            if (r1 >= r3) goto L7b
            androidx.fragment.app.FragmentTransaction$Op r3 = new androidx.fragment.app.FragmentTransaction$Op
            r3.<init>()
            int[] r4 = r9.mOps
            int r5 = r1 + 1
            r4 = r4[r1]
            r3.mCmd = r4
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L27
            r0.toString()
            int[] r4 = r9.mOps
            r4 = r4[r5]
        L27:
            java.util.ArrayList<java.lang.String> r4 = r9.mFragmentWhos
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L38
            androidx.fragment.app.Fragment r4 = r10.findActiveFragment(r4)
            r3.mFragment = r4
            goto L3b
        L38:
            r4 = 0
            r3.mFragment = r4
        L3b:
            androidx.lifecycle.Lifecycle$State[] r4 = androidx.lifecycle.Lifecycle.State.values()
            int[] r6 = r9.mOldMaxLifecycleStates
            r6 = r6[r2]
            r4 = r4[r6]
            r3.mOldMaxState = r4
            androidx.lifecycle.Lifecycle$State[] r4 = androidx.lifecycle.Lifecycle.State.values()
            int[] r6 = r9.mCurrentMaxLifecycleStates
            r6 = r6[r2]
            r4 = r4[r6]
            r3.mCurrentMaxState = r4
            int[] r4 = r9.mOps
            int r6 = r1 + 2
            r5 = r4[r5]
            r3.mEnterAnim = r5
            int r7 = r1 + 3
            r6 = r4[r6]
            r3.mExitAnim = r6
            int r8 = r1 + 4
            r7 = r4[r7]
            r3.mPopEnterAnim = r7
            int r1 = r1 + 5
            r4 = r4[r8]
            r3.mPopExitAnim = r4
            r0.mEnterAnim = r5
            r0.mExitAnim = r6
            r0.mPopEnterAnim = r7
            r0.mPopExitAnim = r4
            r0.addOp(r3)
            int r2 = r2 + 1
            goto L7
        L7b:
            int r10 = r9.mTransition
            r0.mTransition = r10
            java.lang.String r10 = r9.mName
            r0.mName = r10
            int r10 = r9.mIndex
            r0.mIndex = r10
            r10 = 1
            r0.mAddToBackStack = r10
            int r1 = r9.mBreadCrumbTitleRes
            r0.mBreadCrumbTitleRes = r1
            java.lang.CharSequence r1 = r9.mBreadCrumbTitleText
            r0.mBreadCrumbTitleText = r1
            int r1 = r9.mBreadCrumbShortTitleRes
            r0.mBreadCrumbShortTitleRes = r1
            java.lang.CharSequence r1 = r9.mBreadCrumbShortTitleText
            r0.mBreadCrumbShortTitleText = r1
            java.util.ArrayList<java.lang.String> r1 = r9.mSharedElementSourceNames
            r0.mSharedElementSourceNames = r1
            java.util.ArrayList<java.lang.String> r1 = r9.mSharedElementTargetNames
            r0.mSharedElementTargetNames = r1
            boolean r1 = r9.mReorderingAllowed
            r0.mReorderingAllowed = r1
            r0.bumpBackStackNesting(r10)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int[] r3 = r1.mOps
            r2.writeIntArray(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mFragmentWhos
            r2.writeStringList(r3)
            int[] r3 = r1.mOldMaxLifecycleStates
            r2.writeIntArray(r3)
            int[] r3 = r1.mCurrentMaxLifecycleStates
            r2.writeIntArray(r3)
            int r3 = r1.mTransition
            r2.writeInt(r3)
            java.lang.String r3 = r1.mName
            r2.writeString(r3)
            int r3 = r1.mIndex
            r2.writeInt(r3)
            int r3 = r1.mBreadCrumbTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbTitleText
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.mBreadCrumbShortTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbShortTitleText
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementSourceNames
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementTargetNames
            r2.writeStringList(r3)
            boolean r3 = r1.mReorderingAllowed
            r2.writeInt(r3)
            return
    }
}
