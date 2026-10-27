package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Service {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.Service$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public static abstract class Listener {
        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void failed(com.google.common.util.concurrent.Service.State r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        public void running() {
                r0 = this;
                return
        }

        public void starting() {
                r0 = this;
                return
        }

        public void stopping(com.google.common.util.concurrent.Service.State r1) {
                r0 = this;
                return
        }

        public void terminated(com.google.common.util.concurrent.Service.State r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public enum State extends java.lang.Enum<com.google.common.util.concurrent.Service.State> {
        private static final /* synthetic */ com.google.common.util.concurrent.Service.State[] $VALUES = null;
        public static final com.google.common.util.concurrent.Service.State FAILED = null;
        public static final com.google.common.util.concurrent.Service.State NEW = null;
        public static final com.google.common.util.concurrent.Service.State RUNNING = null;
        public static final com.google.common.util.concurrent.Service.State STARTING = null;
        public static final com.google.common.util.concurrent.Service.State STOPPING = null;
        public static final com.google.common.util.concurrent.Service.State TERMINATED = null;







        static {
                com.google.common.util.concurrent.Service$State$1 r0 = new com.google.common.util.concurrent.Service$State$1
                java.lang.String r1 = "NEW"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.Service.State.NEW = r0
                com.google.common.util.concurrent.Service$State$2 r1 = new com.google.common.util.concurrent.Service$State$2
                java.lang.String r3 = "STARTING"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.util.concurrent.Service.State.STARTING = r1
                com.google.common.util.concurrent.Service$State$3 r3 = new com.google.common.util.concurrent.Service$State$3
                java.lang.String r5 = "RUNNING"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.common.util.concurrent.Service.State.RUNNING = r3
                com.google.common.util.concurrent.Service$State$4 r5 = new com.google.common.util.concurrent.Service$State$4
                java.lang.String r7 = "STOPPING"
                r8 = 3
                r5.<init>(r7, r8)
                com.google.common.util.concurrent.Service.State.STOPPING = r5
                com.google.common.util.concurrent.Service$State$5 r7 = new com.google.common.util.concurrent.Service$State$5
                java.lang.String r9 = "TERMINATED"
                r10 = 4
                r7.<init>(r9, r10)
                com.google.common.util.concurrent.Service.State.TERMINATED = r7
                com.google.common.util.concurrent.Service$State$6 r9 = new com.google.common.util.concurrent.Service$State$6
                java.lang.String r11 = "FAILED"
                r12 = 5
                r9.<init>(r11, r12)
                com.google.common.util.concurrent.Service.State.FAILED = r9
                r11 = 6
                com.google.common.util.concurrent.Service$State[] r11 = new com.google.common.util.concurrent.Service.State[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.google.common.util.concurrent.Service.State.$VALUES = r11
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ State(java.lang.String r1, int r2, com.google.common.util.concurrent.Service.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.Service.State valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.Service$State> r0 = com.google.common.util.concurrent.Service.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.Service$State r1 = (com.google.common.util.concurrent.Service.State) r1
                return r1
        }

        public static com.google.common.util.concurrent.Service.State[] values() {
                com.google.common.util.concurrent.Service$State[] r0 = com.google.common.util.concurrent.Service.State.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.Service$State[] r0 = (com.google.common.util.concurrent.Service.State[]) r0
                return r0
        }

        abstract boolean isTerminal();
    }

    void addListener(com.google.common.util.concurrent.Service.Listener r1, java.util.concurrent.Executor r2);

    void awaitRunning();

    void awaitRunning(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.TimeoutException;

    java.lang.Throwable failureCause();

    boolean isRunning();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    com.google.common.util.concurrent.Service startAsync();

    com.google.common.util.concurrent.Service.State state();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    com.google.common.util.concurrent.Service stopAsync();
}
