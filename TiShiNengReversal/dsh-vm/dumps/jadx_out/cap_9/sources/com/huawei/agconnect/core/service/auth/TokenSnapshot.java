package com.huawei.agconnect.core.service.auth;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface TokenSnapshot {

    public enum State extends java.lang.Enum<com.huawei.agconnect.core.service.auth.TokenSnapshot.State> {
        private static final /* synthetic */ com.huawei.agconnect.core.service.auth.TokenSnapshot.State[] $VALUES = null;
        public static final com.huawei.agconnect.core.service.auth.TokenSnapshot.State SIGNED_IN = null;
        public static final com.huawei.agconnect.core.service.auth.TokenSnapshot.State SIGNED_OUT = null;
        public static final com.huawei.agconnect.core.service.auth.TokenSnapshot.State TOKEN_INVALID = null;
        public static final com.huawei.agconnect.core.service.auth.TokenSnapshot.State TOKEN_UPDATED = null;

        static {
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State r0 = new com.huawei.agconnect.core.service.auth.TokenSnapshot$State
                java.lang.String r1 = "SIGNED_IN"
                r2 = 0
                r0.<init>(r1, r2)
                com.huawei.agconnect.core.service.auth.TokenSnapshot.State.SIGNED_IN = r0
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State r1 = new com.huawei.agconnect.core.service.auth.TokenSnapshot$State
                java.lang.String r3 = "TOKEN_UPDATED"
                r4 = 1
                r1.<init>(r3, r4)
                com.huawei.agconnect.core.service.auth.TokenSnapshot.State.TOKEN_UPDATED = r1
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State r3 = new com.huawei.agconnect.core.service.auth.TokenSnapshot$State
                java.lang.String r5 = "TOKEN_INVALID"
                r6 = 2
                r3.<init>(r5, r6)
                com.huawei.agconnect.core.service.auth.TokenSnapshot.State.TOKEN_INVALID = r3
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State r5 = new com.huawei.agconnect.core.service.auth.TokenSnapshot$State
                java.lang.String r7 = "SIGNED_OUT"
                r8 = 3
                r5.<init>(r7, r8)
                com.huawei.agconnect.core.service.auth.TokenSnapshot.State.SIGNED_OUT = r5
                r7 = 4
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State[] r7 = new com.huawei.agconnect.core.service.auth.TokenSnapshot.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.huawei.agconnect.core.service.auth.TokenSnapshot.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.huawei.agconnect.core.service.auth.TokenSnapshot.State valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.agconnect.core.service.auth.TokenSnapshot$State> r0 = com.huawei.agconnect.core.service.auth.TokenSnapshot.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State r1 = (com.huawei.agconnect.core.service.auth.TokenSnapshot.State) r1
                return r1
        }

        public static com.huawei.agconnect.core.service.auth.TokenSnapshot.State[] values() {
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State[] r0 = com.huawei.agconnect.core.service.auth.TokenSnapshot.State.$VALUES
                java.lang.Object r0 = r0.clone()
                com.huawei.agconnect.core.service.auth.TokenSnapshot$State[] r0 = (com.huawei.agconnect.core.service.auth.TokenSnapshot.State[]) r0
                return r0
        }
    }

    java.lang.String a();

    com.huawei.agconnect.core.service.auth.TokenSnapshot.State getState();
}
