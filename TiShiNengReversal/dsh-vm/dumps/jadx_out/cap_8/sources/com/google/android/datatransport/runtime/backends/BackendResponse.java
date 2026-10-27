package com.google.android.datatransport.runtime.backends;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BackendResponse {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Status extends java.lang.Enum<com.google.android.datatransport.runtime.backends.BackendResponse.Status> {
        private static final /* synthetic */ com.google.android.datatransport.runtime.backends.BackendResponse.Status[] $VALUES = null;
        public static final com.google.android.datatransport.runtime.backends.BackendResponse.Status FATAL_ERROR = null;
        public static final com.google.android.datatransport.runtime.backends.BackendResponse.Status OK = null;
        public static final com.google.android.datatransport.runtime.backends.BackendResponse.Status TRANSIENT_ERROR = null;

        static {
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r0 = new com.google.android.datatransport.runtime.backends.BackendResponse$Status
                java.lang.String r1 = "OK"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK = r0
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = new com.google.android.datatransport.runtime.backends.BackendResponse$Status
                java.lang.String r3 = "TRANSIENT_ERROR"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR = r1
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r3 = new com.google.android.datatransport.runtime.backends.BackendResponse$Status
                java.lang.String r5 = "FATAL_ERROR"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.FATAL_ERROR = r3
                r5 = 3
                com.google.android.datatransport.runtime.backends.BackendResponse$Status[] r5 = new com.google.android.datatransport.runtime.backends.BackendResponse.Status[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.$VALUES = r5
                return
        }

        Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.datatransport.runtime.backends.BackendResponse.Status valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.runtime.backends.BackendResponse$Status> r0 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = (com.google.android.datatransport.runtime.backends.BackendResponse.Status) r1
                return r1
        }

        public static com.google.android.datatransport.runtime.backends.BackendResponse.Status[] values() {
                com.google.android.datatransport.runtime.backends.BackendResponse$Status[] r0 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.runtime.backends.BackendResponse$Status[] r0 = (com.google.android.datatransport.runtime.backends.BackendResponse.Status[]) r0
                return r0
        }
    }

    public BackendResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse fatalError() {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.FATAL_ERROR
            r2 = -1
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse ok(long r2) {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse transientError() {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR
            r2 = -1
            r0.<init>(r1, r2)
            return r0
    }

    public abstract long getNextRequestWaitMillis();

    public abstract com.google.android.datatransport.runtime.backends.BackendResponse.Status getStatus();
}
