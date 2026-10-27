package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class AutoValue_LogResponse extends com.google.android.datatransport.cct.internal.LogResponse {
    private final long nextRequestWaitMillis;

    AutoValue_LogResponse(long r1) {
            r0 = this;
            r0.<init>()
            r0.nextRequestWaitMillis = r1
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.cct.internal.LogResponse
            r2 = 0
            if (r1 == 0) goto L16
            com.google.android.datatransport.cct.internal.LogResponse r8 = (com.google.android.datatransport.cct.internal.LogResponse) r8
            long r3 = r7.nextRequestWaitMillis
            long r5 = r8.getNextRequestWaitMillis()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L16
            return r0
        L16:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
            r2 = this;
            long r0 = r2.nextRequestWaitMillis
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.nextRequestWaitMillis
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LogResponse{nextRequestWaitMillis="
            r0.append(r1)
            long r1 = r3.nextRequestWaitMillis
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
