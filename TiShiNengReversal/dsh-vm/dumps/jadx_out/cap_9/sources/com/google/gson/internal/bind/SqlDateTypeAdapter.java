package com.google.gson.internal.bind;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SqlDateTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Date> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.text.DateFormat format;


    static {
            com.google.gson.internal.bind.SqlDateTypeAdapter$1 r0 = new com.google.gson.internal.bind.SqlDateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.SqlDateTypeAdapter.FACTORY = r0
            return
    }

    public SqlDateTypeAdapter() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d, yyyy"
            r0.<init>(r1)
            r2.format = r0
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public synchronized java.sql.Date read2(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            com.google.gson.stream.JsonToken r0 = r3.peek()     // Catch: java.lang.Throwable -> Lf
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.Throwable -> Lf
            if (r0 != r1) goto L11
            r3.nextNull()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            r3 = 0
            return r3
        Lf:
            r3 = move-exception
            goto L2d
        L11:
            java.text.DateFormat r0 = r2.format     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            java.lang.String r3 = r3.nextString()     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            java.util.Date r3 = r0.parse(r3)     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            long r0 = r3.getTime()     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            java.sql.Date r3 = new java.sql.Date     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lf java.text.ParseException -> L26
            monitor-exit(r2)
            return r3
        L26:
            r3 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Date r2) throws java.io.IOException {
            r0 = this;
            java.sql.Date r2 = (java.sql.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(com.google.gson.stream.JsonWriter r2, java.sql.Date r3) throws java.io.IOException {
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
