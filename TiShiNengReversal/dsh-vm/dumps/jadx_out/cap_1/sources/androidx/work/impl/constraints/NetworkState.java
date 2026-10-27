package androidx.work.impl.constraints;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NetworkState {
    private boolean mIsConnected;
    private boolean mIsMetered;
    private boolean mIsNotRoaming;
    private boolean mIsValidated;

    public NetworkState(boolean r1, boolean r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mIsConnected = r1
            r0.mIsValidated = r2
            r0.mIsMetered = r3
            r0.mIsNotRoaming = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.work.impl.constraints.NetworkState
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.work.impl.constraints.NetworkState r5 = (androidx.work.impl.constraints.NetworkState) r5
            boolean r1 = r4.mIsConnected
            boolean r3 = r5.mIsConnected
            if (r1 != r3) goto L25
            boolean r1 = r4.mIsValidated
            boolean r3 = r5.mIsValidated
            if (r1 != r3) goto L25
            boolean r1 = r4.mIsMetered
            boolean r3 = r5.mIsMetered
            if (r1 != r3) goto L25
            boolean r1 = r4.mIsNotRoaming
            boolean r5 = r5.mIsNotRoaming
            if (r1 != r5) goto L25
            return r0
        L25:
            return r2
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.mIsConnected
            boolean r1 = r2.mIsValidated
            if (r1 == 0) goto L8
            int r0 = r0 + 16
        L8:
            boolean r1 = r2.mIsMetered
            if (r1 == 0) goto Le
            int r0 = r0 + 256
        Le:
            boolean r1 = r2.mIsNotRoaming
            if (r1 == 0) goto L14
            int r0 = r0 + 4096
        L14:
            return r0
    }

    public boolean isConnected() {
            r1 = this;
            boolean r0 = r1.mIsConnected
            return r0
    }

    public boolean isMetered() {
            r1 = this;
            boolean r0 = r1.mIsMetered
            return r0
    }

    public boolean isNotRoaming() {
            r1 = this;
            boolean r0 = r1.mIsNotRoaming
            return r0
    }

    public boolean isValidated() {
            r1 = this;
            boolean r0 = r1.mIsValidated
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r6 = this;
            boolean r0 = r6.mIsConnected
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r6.mIsValidated
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r6.mIsMetered
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r6.mIsNotRoaming
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.lang.String r0 = "[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            return r0
    }
}
