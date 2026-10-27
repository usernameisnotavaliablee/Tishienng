package com.google.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class DefaultDateTypeAdapter extends com.google.gson.TypeAdapter<java.util.Date> {
    private static final java.lang.String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final java.util.List<java.text.DateFormat> dateFormats;
    private final java.lang.Class<? extends java.util.Date> dateType;

    public DefaultDateTypeAdapter(int r2, int r3) {
            r1 = this;
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r1.<init>(r0, r2, r3)
            return
    }

    DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.dateFormats = r0
            java.lang.Class r4 = verifyDateType(r4)
            r3.dateType = r4
            java.util.Locale r4 = java.util.Locale.US
            r1 = 2
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r1, r1, r4)
            r0.add(r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L2b
            java.text.DateFormat r4 = java.text.DateFormat.getDateTimeInstance(r1, r1)
            r0.add(r4)
        L2b:
            boolean r4 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r4 == 0) goto L38
            java.text.DateFormat r4 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(r1, r1)
            r0.add(r4)
        L38:
            return
    }

    DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dateFormats = r0
            java.lang.Class r3 = verifyDateType(r3)
            r2.dateType = r3
            java.util.Locale r3 = java.util.Locale.US
            java.text.DateFormat r1 = java.text.DateFormat.getDateInstance(r4, r3)
            r0.add(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L2a
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r4)
            r0.add(r3)
        L2a:
            boolean r3 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r3 == 0) goto L37
            java.text.DateFormat r3 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateFormat(r4)
            r0.add(r3)
        L37:
            return
    }

    public DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dateFormats = r0
            java.lang.Class r3 = verifyDateType(r3)
            r2.dateType = r3
            java.util.Locale r3 = java.util.Locale.US
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r4, r5, r3)
            r0.add(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L2a
            java.text.DateFormat r3 = java.text.DateFormat.getDateTimeInstance(r4, r5)
            r0.add(r3)
        L2a:
            boolean r3 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r3 == 0) goto L37
            java.text.DateFormat r3 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(r4, r5)
            r0.add(r3)
        L37:
            return
    }

    DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dateFormats = r0
            java.lang.Class r3 = verifyDateType(r3)
            r2.dateType = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r4, r1)
            r0.add(r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L2c
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r4)
            r0.add(r3)
        L2c:
            return
    }

    private java.util.Date deserializeToDate(java.lang.String r4) {
            r3 = this;
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.dateFormats     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch: java.lang.Throwable -> L1b
            java.util.Date r4 = r2.parse(r4)     // Catch: java.text.ParseException -> L9 java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r4
        L1b:
            r4 = move-exception
            goto L30
        L1d:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.lang.Throwable -> L1b java.text.ParseException -> L29
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b java.text.ParseException -> L29
            java.util.Date r4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r4, r1)     // Catch: java.lang.Throwable -> L1b java.text.ParseException -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r4
        L29:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1b
            throw r2     // Catch: java.lang.Throwable -> L1b
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    private static java.lang.Class<? extends java.util.Date> verifyDateType(java.lang.Class<? extends java.util.Date> r6) {
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r6 == r0) goto L3c
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r6 == r1) goto L3c
            java.lang.Class<java.sql.Timestamp> r2 = java.sql.Timestamp.class
            if (r6 != r2) goto Ld
            goto L3c
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Date type must be one of "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", or "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " but was "
            r4.append(r0)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            r3.<init>(r6)
            throw r3
        L3c:
            return r6
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.util.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.util.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.Date read2(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r4.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r4.nextNull()
            r4 = 0
            return r4
        Ld:
            java.lang.String r4 = r4.nextString()
            java.util.Date r4 = r3.deserializeToDate(r4)
            java.lang.Class<? extends java.util.Date> r0 = r3.dateType
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L1c
            return r4
        L1c:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L2a
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
            return r0
        L2a:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L38
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            return r0
        L38:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.List<java.text.DateFormat> r0 = r4.dateFormats
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            boolean r1 = r0 instanceof java.text.SimpleDateFormat
            r2 = 41
            java.lang.String r3 = "DefaultDateTypeAdapter("
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.lang.String r0 = r0.toPattern()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.util.Date r2) throws java.io.IOException {
            r0 = this;
            java.util.Date r2 = (java.util.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r4, java.util.Date r5) throws java.io.IOException {
            r3 = this;
            if (r5 != 0) goto L6
            r4.nullValue()
            return
        L6:
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.dateFormats     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1b
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = r1.format(r5)     // Catch: java.lang.Throwable -> L1b
            r4.value(r5)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }
}
