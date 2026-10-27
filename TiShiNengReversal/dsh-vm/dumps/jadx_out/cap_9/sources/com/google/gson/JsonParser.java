package com.google.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class JsonParser {
    public JsonParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.gson.JsonElement parse(com.google.gson.stream.JsonReader r7) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r6 = this;
            java.lang.String r0 = " to Json"
            java.lang.String r1 = "Failed parsing JSON source: "
            boolean r2 = r7.isLenient()
            r3 = 1
            r7.setLenient(r3)
            com.google.gson.JsonElement r0 = com.google.gson.internal.Streams.parse(r7)     // Catch: java.lang.Throwable -> L14 java.lang.OutOfMemoryError -> L16 java.lang.StackOverflowError -> L2f
            r7.setLenient(r2)
            return r0
        L14:
            r0 = move-exception
            goto L48
        L16:
            r3 = move-exception
            com.google.gson.JsonParseException r4 = new com.google.gson.JsonParseException     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r5.<init>()     // Catch: java.lang.Throwable -> L14
            r5.append(r1)     // Catch: java.lang.Throwable -> L14
            r5.append(r7)     // Catch: java.lang.Throwable -> L14
            r5.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L14
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L2f:
            r3 = move-exception
            com.google.gson.JsonParseException r4 = new com.google.gson.JsonParseException     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r5.<init>()     // Catch: java.lang.Throwable -> L14
            r5.append(r1)     // Catch: java.lang.Throwable -> L14
            r5.append(r7)     // Catch: java.lang.Throwable -> L14
            r5.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L14
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L48:
            r7.setLenient(r2)
            throw r0
    }

    public com.google.gson.JsonElement parse(java.io.Reader r3) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r2 = this;
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            r0.<init>(r3)     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            com.google.gson.JsonElement r3 = r2.parse(r0)     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            boolean r1 = r3.isJsonNull()     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            if (r1 != 0) goto L26
            com.google.gson.stream.JsonToken r0 = r0.peek()     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            if (r0 != r1) goto L18
            goto L26
        L18:
            com.google.gson.JsonSyntaxException r3 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            java.lang.String r0 = "Did not consume the entire document."
            r3.<init>(r0)     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            throw r3     // Catch: java.lang.NumberFormatException -> L20 java.io.IOException -> L22 com.google.gson.stream.MalformedJsonException -> L24
        L20:
            r3 = move-exception
            goto L27
        L22:
            r3 = move-exception
            goto L2d
        L24:
            r3 = move-exception
            goto L33
        L26:
            return r3
        L27:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r3)
            throw r0
        L2d:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r3)
            throw r0
        L33:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r3)
            throw r0
    }

    public com.google.gson.JsonElement parse(java.lang.String r2) throws com.google.gson.JsonSyntaxException {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            com.google.gson.JsonElement r2 = r1.parse(r0)
            return r2
    }
}
