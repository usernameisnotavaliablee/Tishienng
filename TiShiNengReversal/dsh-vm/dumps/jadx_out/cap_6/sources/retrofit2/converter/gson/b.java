package retrofit2.converter.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class b<T> implements retrofit2.g<T, okhttp3.RequestBody> {
    private static final okhttp3.MediaType c = null;
    private static final java.nio.charset.Charset d = null;
    private final com.google.gson.Gson a;
    private final com.google.gson.TypeAdapter<T> b;

    static {
            java.lang.String r0 = "application/json; charset=UTF-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.get(r0)
            retrofit2.converter.gson.b.c = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            retrofit2.converter.gson.b.d = r0
            return
    }

    b(com.google.gson.Gson r1, com.google.gson.TypeAdapter<T> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public okhttp3.RequestBody a(T r5) throws java.io.IOException {
            r4 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.OutputStream r2 = r0.outputStream()
            java.nio.charset.Charset r3 = retrofit2.converter.gson.b.d
            r1.<init>(r2, r3)
            com.google.gson.Gson r2 = r4.a
            com.google.gson.stream.JsonWriter r1 = r2.newJsonWriter(r1)
            com.google.gson.TypeAdapter<T> r2 = r4.b
            r2.write(r1, r5)
            r1.close()
            okhttp3.MediaType r5 = retrofit2.converter.gson.b.c
            okio.ByteString r0 = r0.readByteString()
            okhttp3.RequestBody r5 = okhttp3.RequestBody.create(r5, r0)
            return r5
    }

    @Override // retrofit2.g
    public /* bridge */ /* synthetic */ okhttp3.RequestBody convert(java.lang.Object r1) throws java.io.IOException {
            r0 = this;
            okhttp3.RequestBody r1 = r0.a(r1)
            return r1
    }
}
