package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class LogResponse {
    private static final java.lang.String LOG_TAG = "LogResponseInternal";

    public LogResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.datatransport.cct.internal.LogResponse create(long r1) {
            com.google.android.datatransport.cct.internal.AutoValue_LogResponse r0 = new com.google.android.datatransport.cct.internal.AutoValue_LogResponse
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.datatransport.cct.internal.LogResponse fromJson(@androidx.annotation.NonNull java.io.Reader r3) throws java.io.IOException {
            android.util.JsonReader r0 = new android.util.JsonReader
            r0.<init>(r3)
            r0.beginObject()     // Catch: java.lang.Throwable -> L32
        L8:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L44
            java.lang.String r3 = r0.nextName()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "nextRequestWaitMillis"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L40
            android.util.JsonToken r3 = r0.peek()     // Catch: java.lang.Throwable -> L32
            android.util.JsonToken r1 = android.util.JsonToken.STRING     // Catch: java.lang.Throwable -> L32
            if (r3 != r1) goto L34
            java.lang.String r3 = r0.nextString()     // Catch: java.lang.Throwable -> L32
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L32
            com.google.android.datatransport.cct.internal.LogResponse r3 = create(r1)     // Catch: java.lang.Throwable -> L32
            r0.close()
            return r3
        L32:
            r3 = move-exception
            goto L4c
        L34:
            long r1 = r0.nextLong()     // Catch: java.lang.Throwable -> L32
            com.google.android.datatransport.cct.internal.LogResponse r3 = create(r1)     // Catch: java.lang.Throwable -> L32
            r0.close()
            return r3
        L40:
            r0.skipValue()     // Catch: java.lang.Throwable -> L32
            goto L8
        L44:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Response is missing nextRequestWaitMillis field."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r3     // Catch: java.lang.Throwable -> L32
        L4c:
            r0.close()
            throw r3
    }

    public abstract long getNextRequestWaitMillis();
}
