package com.google.gson.internal.bind;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class TimeTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Time> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.text.DateFormat format;


    static {
            com.google.gson.internal.bind.TimeTypeAdapter$1 r0 = new com.google.gson.internal.bind.TimeTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.TimeTypeAdapter.FACTORY = r0
            return
    }

    public TimeTypeAdapter() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "hh:mm:ss a"
            r0.<init>(r1)
            r2.format = r0
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Time read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Time r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public synchronized java.sql.Time read2(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            com.google.gson.stream.JsonToken r0 = r4.peek()     // Catch: java.lang.Throwable -> Lf
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.Throwable -> Lf
            if (r0 != r1) goto L11
            r4.nextNull()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            r4 = 0
            return r4
        Lf:
            r4 = move-exception
            goto L2d
        L11:
            java.text.DateFormat r0 = r3.format     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            java.lang.String r4 = r4.nextString()     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            java.util.Date r4 = r0.parse(r4)     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            java.sql.Time r0 = new java.sql.Time     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            long r1 = r4.getTime()     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            monitor-exit(r3)
            return r0
        L26:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Time r2) throws java.io.IOException {
            r0 = this;
            java.sql.Time r2 = (java.sql.Time) r2
            r0.write2(r1, r2)
            return
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(com.google.gson.stream.JsonWriter r2, java.sql.Time r3) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L5
            r3 = 0
            goto Lb
        L5:
            java.text.DateFormat r0 = r1.format     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L10
        Lb:
            r2.value(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }
}
