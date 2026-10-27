package retrofit2.converter.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a extends retrofit2.g.a {
    private final com.google.gson.Gson a;

    private a(com.google.gson.Gson r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static retrofit2.converter.gson.a b() {
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            retrofit2.converter.gson.a r0 = c(r0)
            return r0
    }

    public static retrofit2.converter.gson.a c(com.google.gson.Gson r1) {
            if (r1 == 0) goto L8
            retrofit2.converter.gson.a r0 = new retrofit2.converter.gson.a
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "gson == null"
            r1.<init>(r0)
            throw r1
    }

    @Override // retrofit2.g.a
    public retrofit2.g<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, retrofit2.d0 r4) {
            r0 = this;
            com.google.gson.Gson r2 = r0.a
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r1 = r2.getAdapter(r1)
            retrofit2.converter.gson.b r2 = new retrofit2.converter.gson.b
            com.google.gson.Gson r3 = r0.a
            r2.<init>(r3, r1)
            return r2
    }

    @Override // retrofit2.g.a
    public retrofit2.g<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.d0 r3) {
            r0 = this;
            com.google.gson.Gson r2 = r0.a
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r1 = r2.getAdapter(r1)
            retrofit2.converter.gson.c r2 = new retrofit2.converter.gson.c
            com.google.gson.Gson r3 = r0.a
            r2.<init>(r3, r1)
            return r2
    }
}
