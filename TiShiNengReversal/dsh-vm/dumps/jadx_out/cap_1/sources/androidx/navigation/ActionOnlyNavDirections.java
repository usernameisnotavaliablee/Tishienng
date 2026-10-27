package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActionOnlyNavDirections implements androidx.navigation.NavDirections {
    private final int mActionId;

    public ActionOnlyNavDirections(int r1) {
            r0 = this;
            r0.<init>()
            r0.mActionId = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1e
            java.lang.Class<androidx.navigation.ActionOnlyNavDirections> r2 = androidx.navigation.ActionOnlyNavDirections.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1e
        L10:
            androidx.navigation.ActionOnlyNavDirections r5 = (androidx.navigation.ActionOnlyNavDirections) r5
            int r2 = r4.getActionId()
            int r5 = r5.getActionId()
            if (r2 == r5) goto L1d
            return r1
        L1d:
            return r0
        L1e:
            return r1
    }

    @Override // androidx.navigation.NavDirections
    public int getActionId() {
            r1 = this;
            int r0 = r1.mActionId
            return r0
    }

    @Override // androidx.navigation.NavDirections
    @androidx.annotation.NonNull
    public android.os.Bundle getArguments() {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = 31
            int r1 = r2.getActionId()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ActionOnlyNavDirections(actionId="
            r0.append(r1)
            int r1 = r2.getActionId()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
